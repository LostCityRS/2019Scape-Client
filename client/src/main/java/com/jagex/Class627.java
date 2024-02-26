package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vx")
public final class Class627 {

	@OriginalMember(owner = "client!vx", name = "ix", descriptor = "(Lclient!yp;I)V")
	static void method32539(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2118650276);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class615.method32283(local16, local22, arg0, 1034587743);
	}

	@OriginalMember(owner = "client!vx", name = "ajt", descriptor = "(Lclient!yp;B)V")
	static void method32540(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!vx", name = "aur", descriptor = "(Lclient!yp;I)V")
	static void method32541(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) 70);
	}

	@OriginalMember(owner = "client!vx", name = "baq", descriptor = "(Lclient!yp;I)V")
	static void method32542(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!vx", name = "at", descriptor = "(Lclient!arz;I)Ljava/lang/String;")
	public static String method32543(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aBoolean955 || arg0 == null) {
			return "";
		} else {
			@Pc(10) int[] local10 = Class357.method28122(arg0, -104801250);
			return local10 == null ? "" : Class279.method26846(local10, 885870675);
		}
	}

	@OriginalMember(owner = "client!vx", name = "l", descriptor = "(Lclient!oq;I)I")
	public static int method32544(@OriginalArg(0) Class466 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!vx", name = "<init>", descriptor = "()V")
	Class627() throws Throwable {
		throw new Error();
	}
}
