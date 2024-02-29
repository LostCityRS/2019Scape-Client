package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public class Class464 {

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	public static final int anInt5075 = 10240;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public static final int anInt5076 = 16383;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static final int anInt5077 = 14;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "D")
	public static final double aDouble9 = 2607.5945876176133D;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	public static final int anInt5078 = 1024;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static final int anInt5079 = 14336;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public static final int anInt5080 = 14;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
	public static final int anInt5081 = 16383;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public static final int anInt5082 = 2048;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static final int anInt5083 = 16384;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static final int anInt5084 = 16384;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static final int anInt5085 = 8192;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static final int anInt5086 = 6144;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
	public static final int anInt5087 = 12288;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	public static final int anInt5088 = 16384;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public static final int anInt5089 = 4096;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "[I")
	public static final int[] anIntArray451 = new int[16384];

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[I")
	public static final int[] anIntArray452 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray451[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray452[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 31)
	Class464() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)F", line = 36)
	public static float method29281(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)F", line = 36)
	public static float method29282(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "(II)I", line = 41)
	public static int method29283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "(II)I", line = 41)
	public static int method29284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "(II)I", line = 41)
	public static int method29285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "(II)I", line = 41)
	public static int method29286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)I", line = 45)
	public static int method29287(@OriginalArg(0) int arg0) {
		return anIntArray451[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "(I)I", line = 45)
	public static int method29288(@OriginalArg(0) int arg0) {
		return anIntArray451[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)I", line = 49)
	public static int method29289(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "(I)I", line = 49)
	public static int method29290(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "(I)I", line = 49)
	public static int method29291(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I", line = 49)
	public static int method29292(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "(I)I", line = 49)
	public static int method29293(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "(I)I", line = 49)
	public static int method29294(@OriginalArg(0) int arg0) {
		return anIntArray452[arg0 & 0x3FFF];
	}
}
