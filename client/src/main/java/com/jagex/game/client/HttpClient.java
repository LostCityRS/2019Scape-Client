package com.jagex.game.client;

import com.jagex.core.utils.JagException;
import deob.ObfuscatedName;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("x")
public class HttpClient implements Runnable {

	@ObfuscatedName("x.e")
	public final Thread field591 = new Thread(this);

	@ObfuscatedName("x.n")
	public volatile boolean field590;

	@ObfuscatedName("x.m")
	public Queue field589 = new LinkedList();

	public HttpClient() {
		this.field591.setPriority(1);
		this.field591.start();
	}

	public void run() {
		while (!this.field590) {
			try {
				HttpRequest var2;
				synchronized (this) {
					var2 = (HttpRequest) this.field589.poll();
					if (var2 == null) {
						try {
							this.wait();
						} catch (InterruptedException var10) {
						}
						continue;
					}
				}
				try {
					URLConnection var5 = var2.field738.openConnection();
					var5.setConnectTimeout(30000);
					int var6 = var5.getContentLength();
					if (var6 >= 0) {
						byte[] var7 = new byte[var6];
						(new DataInputStream(var5.getInputStream())).readFully(var7);
						var2.field737 = var7;
					}
					var2.field739 = true;
				} catch (IOException var11) {
					var2.field739 = true;
				}
			} catch (Exception var13) {
				JagException.report(null, var13);
			}
		}
	}

	@ObfuscatedName("x.e(Ljava/net/URL;I)Lam;")
	public HttpRequest method563(URL arg0) {
		HttpRequest var2 = new HttpRequest(arg0);
		synchronized (this) {
			this.field589.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("x.n(B)V")
	public void method559() {
		this.field590 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.field591.join();
		} catch (InterruptedException var5) {
		}
	}
}
