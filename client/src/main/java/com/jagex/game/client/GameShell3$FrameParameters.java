package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("sq")
public class GameShell3$FrameParameters {

	@ObfuscatedName("sq.e")
	public int width;

	@ObfuscatedName("sq.n")
	public int height;

	@ObfuscatedName("sq.m")
	public int xMargin;

	@ObfuscatedName("sq.k")
	public int yMargin;

	@ObfuscatedName("sq.f")
	public String title;

	public GameShell3$FrameParameters(int arg0, int arg1, int arg2, int arg3, String arg4) {
		this.width = arg0;
		this.height = arg1;
		this.xMargin = arg2;
		this.yMargin = arg3;
		this.title = arg4;
	}

	@ObfuscatedName("sq.e(I)I")
	public int getWidth() {
		return this.width;
	}

	@ObfuscatedName("sq.n(I)I")
	public int getHeight() {
		return this.height;
	}

	@ObfuscatedName("sq.m(I)I")
	public int getXMargin() {
		return this.xMargin;
	}

	@ObfuscatedName("sq.k(I)I")
	public int getYMargin() {
		return this.yMargin;
	}

	@ObfuscatedName("sq.f(B)Ljava/lang/String;")
	public String getTitle() {
		return this.title;
	}
}
