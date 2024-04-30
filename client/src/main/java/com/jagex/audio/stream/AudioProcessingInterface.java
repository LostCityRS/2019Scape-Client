package com.jagex.audio.stream;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("wr")
public interface AudioProcessingInterface {

	@ObfuscatedName("wr.e(B)V")
	void method9672();

	@ObfuscatedName("wr.k(I)Z")
	boolean method9675();

	@ObfuscatedName("wr.w(II)[B")
	byte[] method9673(int arg0);

	@ObfuscatedName("wr.l(I)I")
	int method9678();

	@ObfuscatedName("wr.u(I)Lqk;")
	SoundRelatedType2 method9679();

	@ObfuscatedName("wr.p(Lalw;B)V")
	void method9681(Packet arg0);

	@ObfuscatedName("wr.d(II)Lalw;")
	Packet method9686(int arg0);

	@ObfuscatedName("wr.r(I)Z")
	boolean method9702();

	@ObfuscatedName("wr.c(II)Z")
	boolean method9683(int arg0);

	@ObfuscatedName("wr.v(B)I")
	int method9685();

	@ObfuscatedName("wr.o(ZB)V")
	void method9671(boolean arg0);

	@ObfuscatedName("wr.n(B)Lrw;")
	Sound method9710();

	@ObfuscatedName("wr.s(S)Z")
	boolean method9687();

	@ObfuscatedName("wr.z(B)I")
	int method9680();

	@ObfuscatedName("wr.m(I)Lwl;")
    AudioStreamRelated method9674();
}
