package com.jagex.core.datastruct;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("acf")
public interface Serializable {

	@ObfuscatedName("acf.n(Lalw;S)V")
	void encode(Packet arg0);

	@ObfuscatedName("acf.m(Lalw;I)V")
	void decode(Packet arg0);

	@ObfuscatedName("acf.e(B)I")
	int computeSize();
}
