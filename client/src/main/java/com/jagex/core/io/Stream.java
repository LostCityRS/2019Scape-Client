package com.jagex.core.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("uz")
public abstract class Stream {

	@ObfuscatedName("qt.e(Ljava/net/Socket;IS)Luz;")
	public static Stream createStream(Socket arg0, int arg1) throws IOException {
		return createStream(arg0, arg1, arg1);
	}

	@ObfuscatedName("fu.n(Ljava/net/Socket;III)Luz;")
	public static Stream createStream(Socket arg0, int arg1, int arg2) throws IOException {
		return new SocketStream(arg0, arg1, arg2);
	}

	@ObfuscatedName("uz.f([BIIB)I")
	public abstract int read(byte[] arg0, int arg1, int arg2) throws IOException;

	@ObfuscatedName("uz.w([BIII)V")
	public abstract void write(byte[] arg0, int arg1, int arg2) throws IOException;

	@ObfuscatedName("uz.l(I)V")
	public abstract void closeGracefully();

	@ObfuscatedName("uz.u(I)V")
	public abstract void closeForcefully();

	@ObfuscatedName("uz.m(II)Z")
	public abstract boolean hasAvailable(int arg0) throws IOException;

	@ObfuscatedName("uz.k(B)I")
	public abstract int available() throws IOException;
}
