package com.jagex.audio.vorbis;

import com.jagex.audio.api.AudioEndianness;
import com.jagex.audio.api.AudioFormat;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("mu")
public interface VorbisInterface {

	@ObfuscatedName("mu.o(ILnd;Lmw;I)V")
	void method3774(int arg0, AudioFormat arg1, AudioEndianness arg2, int arg3);

	@ObfuscatedName("mu.w(Lalw;)V")
	void method3726(Packet arg0);

	@ObfuscatedName("mu.r()Lnd;")
	AudioFormat method3733();

	@ObfuscatedName("mu.v()Lmw;")
	AudioEndianness method3734();

	@ObfuscatedName("mu.q()I")
	int method3722();

	@ObfuscatedName("mu.d(I)I")
	int method3731(int arg0);

	@ObfuscatedName("mu.f(Lmm;)V")
	void method3770(VorbisInterface2 arg0);

	@ObfuscatedName("mu.u(I)Lalw;")
	Packet method3728(int arg0);

	@ObfuscatedName("mu.x()Z")
	boolean method3868();

	@ObfuscatedName("mu.e(Z)V")
	void method3721(boolean arg0);

	@ObfuscatedName("mu.an(ZIII)V")
	void method3771(boolean arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("mu.z()I")
	int method3729();

	@ObfuscatedName("mu.l()V")
	void method3727();

	@ObfuscatedName("mu.m()Lmc;")
	VorbisRelated method3843();

	@ObfuscatedName("mu.p(I)I")
	int method3730(int arg0);

	@ObfuscatedName("mu.n()V")
	void method3738();
}
