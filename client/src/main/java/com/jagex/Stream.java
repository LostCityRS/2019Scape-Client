package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("uz")
public abstract class Stream {

	@ObfuscatedName("qt.e(Ljava/net/Socket;IS)Luz;")
	public static Stream method7130(Socket arg0, int arg1) throws IOException {
		return method3025(arg0, arg1, arg1);
	}

	@ObfuscatedName("fu.n(Ljava/net/Socket;III)Luz;")
	public static Stream method3025(Socket arg0, int arg1, int arg2) throws IOException {
		return new SocketStream(arg0, arg1, arg2);
	}

	@ObfuscatedName("uz.f([BIIB)I")
	public abstract int method9029(byte[] arg0, int arg1, int arg2) throws IOException;

	@ObfuscatedName("uz.w([BIII)V")
	public abstract void method9030(byte[] arg0, int arg1, int arg2) throws IOException;

	@ObfuscatedName("uz.l(I)V")
	public abstract void method9031();

	@ObfuscatedName("uz.u(I)V")
	public abstract void method9032();

	@ObfuscatedName("uz.m(II)Z")
	public abstract boolean method9038(int arg0) throws IOException;

	@ObfuscatedName("uz.k(B)I")
	public abstract int method9043() throws IOException;
}
