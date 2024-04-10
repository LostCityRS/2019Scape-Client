package com.jagex.js5;

import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

@ObfuscatedName("ask")
public abstract class Js5Request extends SecondaryNode {

	@ObfuscatedName("ask.l")
	public boolean urgent;

	@ObfuscatedName("ask.u")
	public boolean orphan;

	@ObfuscatedName("ask.z")
	public volatile boolean incomplete = true;

	@ObfuscatedName("ask.e(I)[B")
	public abstract byte[] getBytes();

	@ObfuscatedName("ask.n(I)I")
	public abstract int getPercentageComplete();
}
