package com.jagex.js5.caching;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.utils.JagException;
import com.jagex.game.client.DiskStore;
import com.jagex.js5.worker.Js5WorkerRequest;
import deob.ObfuscatedName;

@ObfuscatedName("pf")
public class Js5DiskCache implements Runnable {

	@ObfuscatedName("pf.e")
	public SecondaryLinkedList queue = new SecondaryLinkedList();

	@ObfuscatedName("pf.n")
	public int pendingRequests = 0;

	@ObfuscatedName("pf.m")
	public boolean field4439 = false;

	@ObfuscatedName("pf.k")
	public Thread thread = new Thread(this);

	public Js5DiskCache() {
		this.thread.setDaemon(true);
		this.thread.start();
		this.thread.setPriority(1);
	}

	@ObfuscatedName("pf.e(ILuf;S)Latf;")
	public Js5WorkerRequest method6997(int arg0, DiskStore arg1) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field12559 = 1;
		SecondaryLinkedList var4 = this.queue;
		synchronized (this.queue) {
			Js5WorkerRequest var5 = (Js5WorkerRequest) this.queue.peekFront();
			while (true) {
				if (var5 == null) {
					break;
				}
				if (var5.secondaryNodeId == (long) arg0 && var5.diskStore == arg1 && var5.field12559 == 2) {
					var3.bytes = var5.bytes;
					var3.awaitingResponse = false;
					return var3;
				}
				var5 = (Js5WorkerRequest) this.queue.prev();
			}
		}
		var3.bytes = arg1.method9010(arg0);
		var3.awaitingResponse = false;
		var3.urgent = true;
		return var3;
	}

	@ObfuscatedName("pf.n(I[BLuf;I)Latf;")
	public Js5WorkerRequest method6988(int arg0, byte[] arg1, DiskStore arg2) {
		Js5WorkerRequest var4 = new Js5WorkerRequest();
		var4.field12559 = 2;
		var4.secondaryNodeId = arg0;
		var4.bytes = arg1;
		var4.diskStore = arg2;
		var4.urgent = false;
		this.queueRequest(var4);
		return var4;
	}

	@ObfuscatedName("pf.m(ILuf;B)Latf;")
	public Js5WorkerRequest method6996(int arg0, DiskStore arg1) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field12559 = 3;
		var3.secondaryNodeId = arg0;
		var3.diskStore = arg1;
		var3.urgent = false;
		this.queueRequest(var3);
		return var3;
	}

	@ObfuscatedName("pf.k(Latf;I)V")
	public void queueRequest(Js5WorkerRequest arg0) {
		SecondaryLinkedList var2 = this.queue;
		synchronized (this.queue) {
			this.queue.pushBack(arg0);
			this.pendingRequests++;
			this.queue.notifyAll();
		}
	}

	public void run() {
		while (!this.field4439) {
			SecondaryLinkedList var1 = this.queue;
			Js5WorkerRequest var2;
			synchronized (this.queue) {
				var2 = (Js5WorkerRequest) this.queue.pollFront();
				if (var2 == null) {
					try {
						this.queue.wait();
					} catch (InterruptedException var7) {
					}
					continue;
				}
				this.pendingRequests--;
			}
			try {
				if (var2.field12559 == 2) {
					var2.diskStore.method9011((int) var2.secondaryNodeId, var2.bytes, var2.bytes.length);
				} else if (var2.field12559 == 3) {
					var2.bytes = var2.diskStore.method9010((int) var2.secondaryNodeId);
				}
			} catch (Exception var6) {
				JagException.report(null, var6);
			}
			var2.awaitingResponse = false;
		}
	}

	@ObfuscatedName("pf.f(I)I")
	public int method6991() {
		SecondaryLinkedList var1 = this.queue;
		synchronized (this.queue) {
			return this.pendingRequests;
		}
	}

	@ObfuscatedName("pf.w(I)V")
	public void method6992() {
		this.field4439 = true;
		SecondaryLinkedList var1 = this.queue;
		synchronized (this.queue) {
			this.queue.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException var4) {
		}
		this.thread = null;
	}
}
