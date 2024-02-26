package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class467 {

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	public static final int anInt4941 = 16384;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	public static final int anInt4942 = 16383;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public static final int anInt4943 = 14;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "D")
	public static final double aDouble9 = 2607.5945876176133D;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public static final int anInt4944 = 14;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public static final int anInt4945 = 1024;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public static final int anInt4946 = 2048;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	public static final int anInt4947 = 4096;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	public static final int anInt4948 = 16383;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	public static final int anInt4949 = 16384;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public static final int anInt4950 = 10240;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "I")
	public static final int anInt4951 = 6144;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	public static final int anInt4952 = 14336;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public static final int anInt4953 = 16384;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	public static final int anInt4954 = 8192;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public static final int anInt4955 = 12288;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "[I")
	public static final int[] anIntArray454 = new int[16384];

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
	public static final int[] anIntArray453 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray454[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray453[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!or", name = "k", descriptor = "(I)I")
	public static int method29715(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "t", descriptor = "(I)F")
	public static float method29716(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(II)I")
	public static int method29717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)I")
	public static int method29718(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "u", descriptor = "(I)I")
	public static int method29719(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "l", descriptor = "(I)F")
	public static float method29720(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!or", name = "i", descriptor = "(I)F")
	public static float method29721(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!or", name = "j", descriptor = "(I)I")
	public static int method29722(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "m", descriptor = "(II)I")
	public static int method29723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!or", name = "s", descriptor = "(I)I")
	public static int method29724(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "o", descriptor = "(I)I")
	public static int method29725(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	public static int method29726(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)F")
	public static float method29727(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!or", name = "x", descriptor = "(I)I")
	public static int method29728(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	Class467() throws Throwable {
		throw new Error();
	}
}
