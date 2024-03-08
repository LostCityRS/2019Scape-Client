package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ui")
public class class558 {

	@ObfuscatedName("ui.w")
	public final byte field7061;

	@ObfuscatedName("ui.l")
	public final byte field7067;

	@ObfuscatedName("ui.u")
	public final short field7068;

	@ObfuscatedName("ui.z")
	public final short field7069;

	@ObfuscatedName("ui.p")
	public final short field7070;

	@ObfuscatedName("ui.d")
	public final short field7071;

	@ObfuscatedName("ui.c")
	public final int[] field7072;

	@ObfuscatedName("ui.r")
	public final int[] field7073;

	@ObfuscatedName("ui.v")
	public final int[] field7062;

	@ObfuscatedName("ui.o")
	public final short[] field7063;

	@ObfuscatedName("ui.s")
	public final short[] field7076;

	@ObfuscatedName("ui.y")
	public final short[] field7077;

	public class558(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		this.field7061 = (byte) arg1;
		this.field7067 = (byte) arg2;
		this.field7072 = new int[4];
		this.field7073 = new int[4];
		this.field7062 = new int[4];
		this.field7072[0] = arg3;
		this.field7072[1] = arg4;
		this.field7072[2] = arg5;
		this.field7072[3] = arg6;
		this.field7073[0] = arg7;
		this.field7073[1] = arg8;
		this.field7073[2] = arg9;
		this.field7073[3] = arg10;
		this.field7062[0] = arg11;
		this.field7062[1] = arg12;
		this.field7062[2] = arg13;
		this.field7062[3] = arg14;
		this.field7068 = (short) (arg3 >> arg0.field6900);
		this.field7069 = (short) (arg5 >> arg0.field6900);
		this.field7070 = (short) (arg11 >> arg0.field6900);
		this.field7071 = (short) (arg13 >> arg0.field6900);
		this.field7063 = new short[4];
		this.field7076 = new short[4];
		this.field7077 = new short[4];
	}
}
