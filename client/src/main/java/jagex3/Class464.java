package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class464 {

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	public static final int anInt5236 = 10240;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public static final int anInt5237 = 16383;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static final int anInt5238 = 14;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "D")
	public static final double aDouble9 = 2607.5945876176133D;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	public static final int anInt5239 = 1024;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static final int anInt5240 = 14336;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public static final int anInt5241 = 14;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
	public static final int anInt5242 = 16383;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public static final int anInt5243 = 2048;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static final int anInt5244 = 16384;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static final int anInt5245 = 16384;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static final int anInt5246 = 8192;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static final int anInt5247 = 6144;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
	public static final int anInt5248 = 12288;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	public static final int anInt5249 = 16384;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public static final int anInt5250 = 4096;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "[I")
	public static final int[] anIntArray453 = new int[16384];

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[I")
	public static final int[] anIntArray454 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray453[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray454[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)I")
	public static int method29462(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)F")
	public static float method29463(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)I")
	public static int method29464(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "(I)I")
	public static int method29465(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "(II)I")
	public static int method29466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "(II)I")
	public static int method29467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "(II)I")
	public static int method29468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "(II)I")
	public static int method29469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)F")
	public static float method29470(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "(I)I")
	public static int method29471(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "(I)I")
	public static int method29472(@OriginalArg(0) int arg0) {
		return anIntArray453[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I")
	public static int method29473(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "(I)I")
	public static int method29474(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "(I)I")
	public static int method29475(@OriginalArg(0) int arg0) {
		return anIntArray454[arg0 & 0x3FFF];
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	Class464() throws Throwable {
		throw new Error();
	}
}
