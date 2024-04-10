package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

@ObfuscatedName("akm")
public abstract class MouseEvent extends Node {

	@ObfuscatedName("acn.w(II)Z")
	public static boolean method15143(int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@ObfuscatedName("akm.n(I)I")
	public abstract int getMouseClickX();

	@ObfuscatedName("akm.m(B)I")
	public abstract int getMouseClickY();

	@ObfuscatedName("akm.k(I)I")
	public abstract int getCount();

	@ObfuscatedName("akm.f(B)J")
	public abstract long method17834();

	@ObfuscatedName("akm.l(B)V")
	public abstract void release();

	@ObfuscatedName("akm.e(I)I")
	public abstract int getButtonAction();
}
