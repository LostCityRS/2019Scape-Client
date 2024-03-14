package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("uz")
public abstract class Stream {

	@ObfuscatedName("qt.e(Ljava/net/Socket;IS)Luz;")
	public static Stream createStream(Socket socket, int inLimit) throws IOException {
		return createStream(socket, inLimit, inLimit);
	}

	@ObfuscatedName("fu.n(Ljava/net/Socket;III)Luz;")
	public static Stream createStream(Socket socket, int inLimit, int outLimit) throws IOException {
		return new SocketStream(socket, inLimit, outLimit);
	}

	@ObfuscatedName("uz.f([BIIB)I")
	public abstract int read(byte[] bytes, int off, int len) throws IOException;

	@ObfuscatedName("uz.w([BIII)V")
	public abstract void write(byte[] bytes, int off, int len) throws IOException;

	@ObfuscatedName("uz.l(I)V")
	public abstract void closeGracefully();

	@ObfuscatedName("uz.u(I)V")
	public abstract void closeForcefully();

	@ObfuscatedName("uz.m(II)Z")
	public abstract boolean hasAvailable(int amount) throws IOException;

	@ObfuscatedName("uz.k(B)I")
	public abstract int available() throws IOException;
}
