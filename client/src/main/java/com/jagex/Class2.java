package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public abstract class Class2 implements Interface12 {

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	protected int anInt320;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "([FIFI)F")
	static float method1812(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg2 * local3 + arg0[local7];
		}
		return local3;
	}

	@OriginalMember(owner = "client!aa", name = "bfx", descriptor = "(Lclient!yp;B)V")
	static void method1813(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method1814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[local6 + arg1] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = Class714.aCharArray5[local17 - 128];
					if (local32 == '\u0000') {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "(Lclient!als;B)V")
	static void method1815(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(1) byte arg1) {
		arg0.method15590(0, (byte) 6);
		@Pc(18) byte local18;
		if (Class554.anInt3423 * -2024030715 >= 96) {
			@Pc(11) int local11 = Class162_Sub2.method15802((short) 9610);
			if (local11 <= 104) {
				Class673.method33570((short) 16383);
				local18 = 4;
			} else if (local11 <= 504) {
				Class123_Sub3.method10025(-1831764900);
				local18 = 3;
			} else if (local11 <= 1000) {
				Class143.method11833(1413071081);
				local18 = 2;
			} else {
				Class59.method1177(true, 68064035);
				local18 = 1;
			}
			arg0.method15585(0, local11, -133653735);
		} else {
			Class59.method1177(true, 91194409);
			local18 = 1;
			arg0.method15584(64, 1076848114);
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-352193937) == 0) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, true, 470442690);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 36);
			Class528.method30719(0, false, -401175958);
		}
		Class719.method37291(353811971);
		arg0.method15583(local18, -756928212);
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;I)V")
	Class2(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) int arg2) {
		this.anInt320 = arg2 * 1914393689;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return this.anInt320 * -443108375;
	}

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return this.anInt320 * -443108375;
	}
}
