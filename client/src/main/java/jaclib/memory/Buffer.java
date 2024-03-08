package jaclib.memory;

import deob.ObfuscatedName;

public interface Buffer {

	@ObfuscatedName("jaclib/memory/Buffer.e()I")
	int getSize();

	@ObfuscatedName("jaclib/memory/Buffer.n()J")
	long getAddress();

	@ObfuscatedName("jaclib/memory/Buffer.m([BIII)V")
	void method8(byte[] arg0, int arg1, int arg2, int arg3);
}
