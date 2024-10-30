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

	public Occluder(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		this.type = (byte) arg1;
		this.level = (byte) arg2;
		this.x = new int[4];
		this.y = new int[4];
		this.z = new int[4];
		this.x[0] = arg3;
		this.x[1] = arg4;
		this.x[2] = arg5;
		this.x[3] = arg6;
		this.y[0] = arg7;
		this.y[1] = arg8;
		this.y[2] = arg9;
		this.y[3] = arg10;
		this.z[0] = arg11;
		this.z[1] = arg12;
		this.z[2] = arg13;
		this.z[3] = arg14;
		this.minTileX = (short) (arg3 >> arg0.size);
		this.maxTileX = (short) (arg5 >> arg0.size);
		this.minTileZ = (short) (arg11 >> arg0.size);
		this.maxTileZ = (short) (arg13 >> arg0.size);
		this.field7063 = new short[4];
		this.field7076 = new short[4];
		this.field7077 = new short[4];
	}
}
