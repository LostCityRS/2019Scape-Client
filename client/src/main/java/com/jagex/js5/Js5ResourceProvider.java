package com.jagex.js5;

import com.jagex.js5.index.Js5Index;
import deob.ObfuscatedName;

@ObfuscatedName("po")
public abstract class Js5ResourceProvider {

	@ObfuscatedName("po.e(B)Lpl;")
	public abstract Js5Index getIndex();

	@ObfuscatedName("po.n(II)[B")
	public abstract byte[] fetchgroup(int arg0);

	@ObfuscatedName("po.k(II)I")
	public abstract int method6855(int arg0);

	@ObfuscatedName("po.m(IB)V")
	public abstract void method6856(int arg0);
}
