package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("aba")
public class class749 {

	@ObfuscatedName("aba.e")
	public int node;

	@ObfuscatedName("aba.n")
	public String host;

	@ObfuscatedName("aba.m")
	public int port;

	@ObfuscatedName("aba.k")
	public int port2;

	@ObfuscatedName("aba.f")
	public boolean field8747 = true;

	@ObfuscatedName("aba.w")
	public boolean field8743 = false;

	@ObfuscatedName("aba.e(B)Ljava/net/Socket;")
	public Socket method14764() throws IOException {
		return this.field8743 ? AbstractSocket.method5846(this.host, this.field8747 ? this.port2 : this.port).method14876() : new Socket(InetAddress.getByName(this.host), this.field8747 ? this.port2 : this.port);
	}

	@ObfuscatedName("aba.n(S)V")
	public void method14758() {
		if (!this.field8747) {
			this.field8747 = true;
			this.field8743 = true;
		} else if (this.field8743) {
			this.field8743 = false;
		} else {
			this.field8747 = false;
		}
	}

	@ObfuscatedName("aba.m(Laba;I)Z")
	public boolean method14757(class749 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.node == arg0.node && this.host.equals(arg0.host) && this.port == arg0.port && this.port2 == arg0.port2;
		}
	}
}
