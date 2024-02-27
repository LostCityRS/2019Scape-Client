package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class595 {

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static final int anInt5643 = 8;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public static final int anInt5644 = 2;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public static final int anInt5645 = 16;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static final int anInt5646 = 4;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public static final int anInt5647 = 1;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "B")
	final byte aByte167;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "B")
	final byte aByte168;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[I")
	final int[] anIntArray479;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[I")
	final int[] anIntArray480;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
	final int[] anIntArray478;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "S")
	final short aShort180;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "S")
	final short aShort181;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
	final short aShort182;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "S")
	final short aShort183;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "[S")
	final short[] aShortArray139;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "[S")
	final short[] aShortArray140;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "[S")
	final short[] aShortArray141;

	@OriginalMember(owner = "client!ui", name = "dk", descriptor = "(Lclient!yf;I)V")
	static void method31922(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class393.method28499(local11, local14, arg0, (byte) 120);
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!tx;IIIIIIIIIIIIII)V")
	Class595(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		this.aByte167 = (byte) arg1;
		this.aByte168 = (byte) arg2;
		this.anIntArray479 = new int[4];
		this.anIntArray480 = new int[4];
		this.anIntArray478 = new int[4];
		this.anIntArray479[0] = arg3;
		this.anIntArray479[1] = arg4;
		this.anIntArray479[2] = arg5;
		this.anIntArray479[3] = arg6;
		this.anIntArray480[0] = arg7;
		this.anIntArray480[1] = arg8;
		this.anIntArray480[2] = arg9;
		this.anIntArray480[3] = arg10;
		this.anIntArray478[0] = arg11;
		this.anIntArray478[1] = arg12;
		this.anIntArray478[2] = arg13;
		this.anIntArray478[3] = arg14;
		this.aShort180 = (short) (arg3 >> arg0.anInt5599 * -358186793);
		this.aShort181 = (short) (arg5 >> arg0.anInt5599 * -358186793);
		this.aShort182 = (short) (arg11 >> arg0.anInt5599 * -358186793);
		this.aShort183 = (short) (arg13 >> arg0.anInt5599 * -358186793);
		this.aShortArray139 = new short[4];
		this.aShortArray140 = new short[4];
		this.aShortArray141 = new short[4];
	}
}
