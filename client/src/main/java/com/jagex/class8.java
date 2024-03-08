package com.jagex;

import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@ObfuscatedName("e")
public class class8 implements Runnable {

	@ObfuscatedName("e.e")
	public String field418;

	@ObfuscatedName("e.n")
	public InetAddress field420;

	@ObfuscatedName("e.m")
	public volatile long field419 = -1L;

	@ObfuscatedName("e.k")
	public volatile boolean field417 = true;

	@ObfuscatedName("e.e(Ljava/lang/String;I)V")
	public void method115(String arg0) {
		this.field418 = arg0;
		this.field420 = null;
		this.field419 = -1L;
		if (this.field418 != null) {
			try {
				this.field420 = InetAddress.getByName(this.field418);
			} catch (UnknownHostException var3) {
			}
		}
	}

	@ObfuscatedName("e.n(B)J")
	public long method116() {
		return this.field419;
	}

	@ObfuscatedName("e.m(I)V")
	public void method130() {
		this.field417 = false;
	}

	public void run() {
		while (this.field417) {
			this.method118();
		}
	}

	@ObfuscatedName("e.k(I)V")
	public void method118() {
		if (this.field420 != null) {
			try {
				byte[] var1 = this.field420.getAddress();
				this.field419 = Ping.method110(var1[0], var1[1], var1[2], var1[3], 10000L);
			} catch (Throwable var3) {
			}
		}
		class214.method1571(1000L);
	}
}
