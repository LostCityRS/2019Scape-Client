package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class593 {

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
	public static final int anInt5319 = 8;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static final int anInt5320 = 2;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
	public static final int anInt5321 = 1;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
	public static final int anInt5322 = 4;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static final int anInt5323 = 16;

	@OriginalMember(owner = "client!uh", name = "cu", descriptor = "Ljava/lang/String;")
	static String aString228;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "B")
	final byte aByte155;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "B")
	final byte aByte156;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
	final int[] anIntArray482;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "[I")
	final int[] anIntArray481;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[I")
	final int[] anIntArray483;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "S")
	final short aShort182;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "S")
	final short aShort183;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "S")
	final short aShort184;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "S")
	final short aShort185;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "[S")
	final short[] aShortArray140;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "[S")
	final short[] aShortArray139;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "[S")
	final short[] aShortArray141;

	@OriginalMember(owner = "client!uh", name = "aqd", descriptor = "(Lclient!yp;I)V")
	static void method31946(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "(Lclient!yp;I)V")
	static void method31947(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class230.method26006((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!te;IIIIIIIIIIIIII)V")
	Class593(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		this.aByte155 = (byte) arg1;
		this.aByte156 = (byte) arg2;
		this.anIntArray482 = new int[4];
		this.anIntArray481 = new int[4];
		this.anIntArray483 = new int[4];
		this.anIntArray482[0] = arg3;
		this.anIntArray482[1] = arg4;
		this.anIntArray482[2] = arg5;
		this.anIntArray482[3] = arg6;
		this.anIntArray481[0] = arg7;
		this.anIntArray481[1] = arg8;
		this.anIntArray481[2] = arg9;
		this.anIntArray481[3] = arg10;
		this.anIntArray483[0] = arg11;
		this.anIntArray483[1] = arg12;
		this.anIntArray483[2] = arg13;
		this.anIntArray483[3] = arg14;
		this.aShort182 = (short) (arg3 >> arg0.anInt5258 * 1479624119);
		this.aShort183 = (short) (arg5 >> arg0.anInt5258 * 1479624119);
		this.aShort184 = (short) (arg11 >> arg0.anInt5258 * 1479624119);
		this.aShort185 = (short) (arg13 >> arg0.anInt5258 * 1479624119);
		this.aShortArray140 = new short[4];
		this.aShortArray139 = new short[4];
		this.aShortArray141 = new short[4];
	}
}
