package com.jagex.audio.api;

import com.jagex.audio.stream.BussManager;
import com.jagex.audio.stream.AudioProcessingUnit;
import com.jagex.audio.stream.SoundRelatedType2;
import deob.ObfuscatedName;

@ObfuscatedName("mt")
public abstract class SoundBackend {

	@ObfuscatedName("mt.n(IILnd;Lmw;IFB)Ljava/lang/Object;")
	public abstract Object playSample(int arg0, int arg1, AudioFormat format, AudioEndianness endianness, int arg4, float arg5);

	@ObfuscatedName("mt.m(Ljava/lang/Object;I)V")
	public abstract void method5863(Object arg0);

	@ObfuscatedName("mt.f(Ljava/lang/Object;I)I")
	public abstract int method5864(Object arg0);

	@ObfuscatedName("mt.w(Lqk;B)Lrq;")
	public abstract AudioProcessingUnit method5865(SoundRelatedType2 arg0);

	@ObfuscatedName("mt.l(Lmj;I)Ljava/lang/Object;")
	public abstract Object method5866(AudioBuss arg0);

	@ObfuscatedName("mt.z(B)V")
	public abstract void method5868();

	@ObfuscatedName("mt.e(I)V")
	public abstract void method5874();

	@ObfuscatedName("mt.k(Ljava/lang/Object;[BIII)V")
	public abstract void method5875(Object arg0, byte[] arg1, int arg2, int arg3);

	@ObfuscatedName("mt.u(I)Lmb;")
	public abstract BussManager getBussManager();
}
