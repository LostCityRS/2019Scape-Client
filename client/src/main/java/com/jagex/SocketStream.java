package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("all")
public class SocketStream extends Stream {

	@ObfuscatedName("all.e")
	public Socket field11677;

	@ObfuscatedName("all.n")
	public SocketStreamReader field11678;

	@ObfuscatedName("all.m")
	public SocketStreamWriter field11676;

	public SocketStream(Socket arg0, int arg1, int arg2) throws IOException {
		this.field11677 = arg0;
		this.field11677.setSoTimeout(30000);
		this.field11677.setTcpNoDelay(true);
		this.field11677.setReceiveBufferSize(65536);
		this.field11677.setSendBufferSize(65536);
		this.field11678 = new SocketStreamReader(this.field11677.getInputStream(), arg1);
		this.field11676 = new SocketStreamWriter(this.field11677.getOutputStream(), arg2);
	}

	@ObfuscatedName("all.m(II)Z")
	public boolean method9038(int arg0) throws IOException {
		return this.field11678.method8991(arg0);
	}

	@ObfuscatedName("all.k(B)I")
	public int method9043() throws IOException {
		return this.field11678.method8983();
	}

	@ObfuscatedName("all.f([BIIB)I")
	public int method9029(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.field11678.method8988(arg0, arg1, arg2);
	}

	@ObfuscatedName("all.w([BIII)V")
	public void method9030(byte[] arg0, int arg1, int arg2) throws IOException {
		this.field11676.method9054(arg0, arg1, arg2);
	}

	@ObfuscatedName("all.l(I)V")
	public void method9031() {
		this.field11676.method9055();
		try {
			this.field11677.close();
		} catch (IOException var2) {
		}
		this.field11678.method8984();
	}

	@ObfuscatedName("all.u(I)V")
	public void method9032() {
		this.field11678.method8999();
		this.field11676.method9056();
	}

	public void finalize() {
		this.method9031();
	}
}
