package com.jagex.js5;

import deob.ObfuscatedName;

@ObfuscatedName("qz")
public class Js5MapFile {

	@ObfuscatedName("qz.e")
	public static final Js5MapFile LOC = new Js5MapFile(0);

	@ObfuscatedName("qz.n")
	public static final Js5MapFile UNDERWATER_LOC = new Js5MapFile(1);

	@ObfuscatedName("qz.m")
	public static final Js5MapFile NPC = new Js5MapFile(2);

	@ObfuscatedName("qz.k")
	public static final Js5MapFile LAND = new Js5MapFile(3);

	@ObfuscatedName("qz.f")
	public static final Js5MapFile UNDERWATER_LAND = new Js5MapFile(4);

	@ObfuscatedName("qz.w")
	public static final Js5MapFile NXT_LOC = new Js5MapFile(5);

	@ObfuscatedName("qz.l")
	public static final Js5MapFile ENVIRONMENT = new Js5MapFile(6);

	@ObfuscatedName("qz.u")
	public static final Js5MapFile STATIC_POINTLIGHTS = new Js5MapFile(7);

	@ObfuscatedName("qz.z")
	public static final Js5MapFile WATER = new Js5MapFile(8);

	@ObfuscatedName("qz.p")
	public final int id;

	public Js5MapFile(int id) {
		this.id = id;
	}
}
