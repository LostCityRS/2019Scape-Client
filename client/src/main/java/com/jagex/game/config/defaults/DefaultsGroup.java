package com.jagex.game.config.defaults;

import deob.ObfuscatedName;

@ObfuscatedName("ww")
public class DefaultsGroup {

	@ObfuscatedName("ww.e")
	public static final DefaultsGroup MAP = new DefaultsGroup(1);

	@ObfuscatedName("ww.n")
	public static final DefaultsGroup UNKNOWN = new DefaultsGroup(2);

	@ObfuscatedName("ww.m")
	public static final DefaultsGroup GRAPHICS = new DefaultsGroup(3);

	@ObfuscatedName("ww.k")
	public static final DefaultsGroup AUDIO = new DefaultsGroup(4);

	@ObfuscatedName("ww.f")
	public static final DefaultsGroup MICROTRANSACTION = new DefaultsGroup(5);

	@ObfuscatedName("ww.w")
	public static final DefaultsGroup WEARPOS = new DefaultsGroup(6);

	@ObfuscatedName("ww.l")
	public static final DefaultsGroup MENU = new DefaultsGroup(7);

	@ObfuscatedName("ww.u")
	public static final DefaultsGroup CUTSCENE = new DefaultsGroup(8);

	@ObfuscatedName("ww.z")
	public static final DefaultsGroup SKILL = new DefaultsGroup(9);

	@ObfuscatedName("ww.p")
	public static final DefaultsGroup WORLDMAP = new DefaultsGroup(10);

	@ObfuscatedName("ww.d")
	public static final DefaultsGroup TITLE = new DefaultsGroup(12);

	@ObfuscatedName("ww.c")
	public final int js5GroupId;

	public DefaultsGroup(int id) {
		this.js5GroupId = id;
	}
}
