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

	public SocketStream(Socket arg0, int arg1, int arg2) throws IOException {
		this.socket = arg0;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.in = new SocketStreamReader(this.socket.getInputStream(), arg1);
		this.out = new SocketStreamWriter(this.socket.getOutputStream(), arg2);
	}

	@ObfuscatedName("all.m(II)Z")
	public boolean hasAvailable(int arg0) throws IOException {
		return this.in.hasAvailable(arg0);
	}

	@ObfuscatedName("all.k(B)I")
	public int available() throws IOException {
		return this.in.available();
	}

	@ObfuscatedName("all.f([BIIB)I")
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.in.read(arg0, arg1, arg2);
	}

	@ObfuscatedName("all.w([BIII)V")
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		this.out.write(arg0, arg1, arg2);
	}

	@ObfuscatedName("all.l(I)V")
	public void closeGracefully() {
		this.out.closeGracefully();
		try {
			this.socket.close();
		} catch (IOException var2) {
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
