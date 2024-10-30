package com.jagex.game.client;

import com.jagex.core.io.AbstractSocket;
import deob.ObfuscatedName;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("aba")
public class ServerAddress {

	@ObfuscatedName("aba.e")
	public int node;

	@ObfuscatedName("aba.n")
	public String host;

	@ObfuscatedName("aba.m")
	public int port;

	@ObfuscatedName("aba.k")
	public int port2;

	@ObfuscatedName("aba.f")
	public boolean useSecondaryPort = true;

	@ObfuscatedName("aba.w")
	public boolean useProxy = false;

	@ObfuscatedName("aba.e(B)Ljava/net/Socket;")
	public Socket getSocket() throws IOException {
		return this.useProxy ? AbstractSocket.createProxySocket(this.host, this.useSecondaryPort ? this.port2 : this.port).getSocket() : new Socket(InetAddress.getByName(this.host), this.useSecondaryPort ? this.port2 : this.port);
	}

	@ObfuscatedName("aba.n(S)V")
	public void configureSocketType() {
		if (!this.useSecondaryPort) {
			this.useSecondaryPort = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecondaryPort = false;
		}
	}

	@ObfuscatedName("aba.m(Laba;I)Z")
	public boolean isAddressInUse(ServerAddress arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.node == arg0.node && this.host.equals(arg0.host) && this.port == arg0.port && this.port2 == arg0.port2;
		}
	}
}
