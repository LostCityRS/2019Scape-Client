package com.jagex.game.client;

import com.jagex.core.utils.PingRequest;
import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("yz")
public class InetAddressLookupRequest implements Runnable {

	@ObfuscatedName("yz.e")
	public final Object field8183 = new Object();

	@ObfuscatedName("yz.n")
	public Thread field8184 = new Thread(this);

	@ObfuscatedName("yz.m")
	public final Queue field8185 = new LinkedList();

	public InetAddressLookupRequest() {
		this.field8184.setDaemon(true);
		this.field8184.start();
	}

	@ObfuscatedName("yz.e(Ljava/lang/String;B)Lyb;")
	public PingRequest method10589(String arg0) {
		if (this.field8184 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			PingRequest var2 = new PingRequest(arg0);
			this.method10575(var2);
			return var2;
		}
	}

	@ObfuscatedName("yz.n(I)V")
	public void method10572() {
		if (this.field8184 == null) {
			return;
		}
		this.method10575(this.field8183);
		try {
			this.field8184.join();
		} catch (InterruptedException var2) {
		}
		this.field8184 = null;
	}

	@ObfuscatedName("yz.m(Ljava/lang/Object;I)V")
	public void method10575(Object arg0) {
		Queue var2 = this.field8185;
		synchronized (this.field8185) {
			this.field8185.add(arg0);
			this.field8185.notify();
		}
	}

	public void run() {
		while (true) {
			Queue var1 = this.field8185;
			PingRequest var4;
			synchronized (this.field8185) {
				Object var2;
				for (var2 = this.field8185.poll(); var2 == null; var2 = this.field8185.poll()) {
					try {
						this.field8185.wait();
					} catch (InterruptedException var10) {
					}
				}
				if (this.field8183 == var2) {
					return;
				}
				var4 = (PingRequest) var2;
			}
			int var7;
			try {
				byte[] var6 = InetAddress.getByName(var4.host).getAddress();
				var7 = Ping.method110(var6[0], var6[1], var6[2], var6[3], 1000L);
			} catch (Throwable var9) {
				var7 = 1000;
			}
			var4.hostpacked = var7;
		}
	}
}
