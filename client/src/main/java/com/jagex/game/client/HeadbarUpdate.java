package com.jagex.game.client;

import com.jagex.core.datastruct.Link;
import deob.ObfuscatedName;

@ObfuscatedName("ajc")
public class HeadbarUpdate extends Link {

	@ObfuscatedName("ajc.m")
	public int field11219;

	@ObfuscatedName("ajc.k")
	public int field11216;

	@ObfuscatedName("ajc.f")
	public int field11218;

	@ObfuscatedName("ajc.w")
	public int field11217;

	public HeadbarUpdate(int arg0, int arg1, int arg2, int arg3) {
		this.field11219 = arg0;
		this.field11216 = arg1;
		this.field11218 = arg2;
		this.field11217 = arg3;
	}

	@ObfuscatedName("ajc.n(IIIII)V")
	public void method17464(int arg0, int arg1, int arg2, int arg3) {
		this.field11219 = arg0;
		this.field11216 = arg1;
		this.field11218 = arg2;
		this.field11217 = arg3;
	}
}
