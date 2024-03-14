package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("all")
public class SocketStream extends Stream {

	@ObfuscatedName("all.e")
	public Socket socket;

	@ObfuscatedName("all.n")
	public SocketStreamReader in;

	@ObfuscatedName("all.m")
	public SocketStreamWriter out;

	public SocketStream(Socket socket, int inLimit, int outLimit) throws IOException {
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.in = new SocketStreamReader(this.socket.getInputStream(), inLimit);
		this.out = new SocketStreamWriter(this.socket.getOutputStream(), outLimit);
	}

	@ObfuscatedName("all.m(II)Z")
	public boolean hasAvailable(int amount) throws IOException {
		return this.in.hasAvailable(amount);
	}

	@ObfuscatedName("all.k(B)I")
	public int available() throws IOException {
		return this.in.available();
	}

	@ObfuscatedName("all.f([BIIB)I")
	public int read(byte[] bytes, int off, int len) throws IOException {
		return this.in.read(bytes, off, len);
	}

	@ObfuscatedName("all.w([BIII)V")
	public void write(byte[] bytes, int off, int len) throws IOException {
		this.out.write(bytes, off, len);
	}

	@ObfuscatedName("all.l(I)V")
	public void closeGracefully() {
		this.out.closeGracefully();
		try {
			this.socket.close();
		} catch (IOException exception) {
		}
		this.in.closeGracefully();
	}

	@ObfuscatedName("all.u(I)V")
	public void closeForcefully() {
		this.in.closeForcefully();
		this.out.closeForcefully();
	}

	public void finalize() {
		this.closeGracefully();
	}
}
