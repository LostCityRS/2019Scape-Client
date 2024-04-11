package com.jagex.graphics;

import com.jagex.game.world.entity.Scene;
import deob.ObfuscatedName;

@ObfuscatedName("ui")
public class Occluder {

	@ObfuscatedName("ui.w")
	public final byte type;

	@ObfuscatedName("ui.l")
	public final byte level;

	@ObfuscatedName("ui.u")
	public final short minTileX;

	@ObfuscatedName("ui.z")
	public final short maxTileX;

	@ObfuscatedName("ui.p")
	public final short minTileZ;

	@ObfuscatedName("ui.d")
	public final short maxTileZ;

	@ObfuscatedName("ui.c")
	public final int[] x;

	@ObfuscatedName("ui.r")
	public final int[] y;

	@ObfuscatedName("ui.v")
	public final int[] z;

	@ObfuscatedName("ui.o")
	public final short[] field7063;

	@ObfuscatedName("ui.s")
	public final short[] field7076;

	@ObfuscatedName("ui.y")
	public final short[] field7077;

	public Occluder(Scene arg0, int type, int level, int minX, int arg4, int maxX, int arg6, int minY, int arg8, int maxY, int arg10, int minZ, int arg12, int maxZ, int arg14) {
		this.type = (byte) type;
		this.level = (byte) level;
		this.x = new int[4];
		this.y = new int[4];
		this.z = new int[4];
		this.x[0] = minX;
		this.x[1] = arg4;
		this.x[2] = maxX;
		this.x[3] = arg6;
		this.y[0] = minY;
		this.y[1] = arg8;
		this.y[2] = maxY;
		this.y[3] = arg10;
		this.z[0] = minZ;
		this.z[1] = arg12;
		this.z[2] = maxZ;
		this.z[3] = arg14;
		this.minTileX = (short) (minX >> arg0.size);
		this.maxTileX = (short) (maxX >> arg0.size);
		this.minTileZ = (short) (minZ >> arg0.size);
		this.maxTileZ = (short) (maxZ >> arg0.size);
		this.field7063 = new short[4];
		this.field7076 = new short[4];
		this.field7077 = new short[4];
	}
}
