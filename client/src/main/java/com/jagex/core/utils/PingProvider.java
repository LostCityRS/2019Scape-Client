package com.jagex.core.utils;

import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@ObfuscatedName("e")
public class PingProvider implements Runnable {

	@ObfuscatedName("e.e")
	public String host;

	@ObfuscatedName("e.n")
	public InetAddress inetAddress;

	@ObfuscatedName("e.m")
	public volatile long pingedAddress = -1L;

	@ObfuscatedName("e.k")
	public volatile boolean running = true;

	@ObfuscatedName("e.e(Ljava/lang/String;I)V")
	public void setPingHost(String host) {
		this.host = host;
		this.inetAddress = null;
		this.pingedAddress = -1L;
		if (this.host != null) {
			try {
				this.inetAddress = InetAddress.getByName(this.host);
			} catch (UnknownHostException exception) {
			}
		}
	}

	@ObfuscatedName("e.n(B)J")
	public long getPingedAddress() {
		return this.pingedAddress;
	}

	@ObfuscatedName("e.m(I)V")
	public void stop() {
		this.running = false;
	}

	public void run() {
		while (this.running) {
			this.ping();
		}
	}

	@ObfuscatedName("e.k(I)V")
	public void ping() {
		if (this.inetAddress != null) {
			try {
				byte[] var1 = this.inetAddress.getAddress();
				this.pingedAddress = Ping.method110(var1[0], var1[1], var1[2], var1[3], 10000L);
			} catch (Throwable var3) {
			}
		}
		PreciseSleep.sleep(1000L);
	}
}
