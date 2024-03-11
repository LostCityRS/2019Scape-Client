package com.jagex.js5;

import com.jagex.SecondaryNode;
import deob.ObfuscatedName;

@ObfuscatedName("ask")
public abstract class Js5Request extends SecondaryNode {

	@ObfuscatedName("ask.l")
	public boolean field12342;

	@ObfuscatedName("ask.u")
	public boolean field12343;

	@ObfuscatedName("ask.z")
	public volatile boolean field12344 = true;

	@ObfuscatedName("ask.e(I)[B")
	public abstract byte[] method19444();

	@ObfuscatedName("ask.n(I)I")
	public abstract int method19446();
}
