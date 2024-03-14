package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("abx")
public abstract class AbstractSocket {

	@ObfuscatedName("abx.e")
	public String host;

	@ObfuscatedName("abx.n")
	public int port;

	@ObfuscatedName("mz.e(Ljava/lang/String;II)Labx;")
	public static AbstractSocket createProxySocket(String host, int port) {
		ProxySocket socket = new ProxySocket();
		socket.host = host;
		socket.port = port;
		return socket;
	}

	@ObfuscatedName("abx.m(I)Ljava/net/Socket;")
	public Socket createSocket() throws IOException {
		return new Socket(this.host, this.port);
	}

	@ObfuscatedName("abx.n(I)Ljava/net/Socket;")
	public abstract Socket getSocket() throws IOException;
}
