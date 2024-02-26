package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class101 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ej;")
	static Class243 aClass243_7 = new Class243(4);

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	int anInt461;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	int anInt463;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	int anInt468;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	int anInt469;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public int anInt462 = 977270999;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "(I)V")
	static void method2965(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(Lclient!di;IIIII)Lclient!dn;")
	public static Class105 method2966(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class105 local7 = (Class105) aClass243_7.method26282(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class232 local16 = Class232.method26043(Class626.aClass480_129, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3781 < 13) {
				local16.method26085(2);
			}
			local7 = arg0.method20753(local16, local9, Class264.anInt3914 * 763913535, 64, 768);
			aClass243_7.method26253(local7, local2);
		}
		local7 = local7.method7324((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method7328(arg1);
		}
		if (arg2 != 0) {
			local7.method7330(arg2);
		}
		if (arg3 != 0) {
			local7.method7318(arg3);
		}
		if (arg4 != 0) {
			local7.method7332(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	static void method2967(@OriginalArg(0) int arg0) {
		aClass243_7.method26247(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!af", name = "m", descriptor = "(I)V")
	static void method2968(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "o", descriptor = "(I)V")
	static void method2969(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	static void method2970(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "s", descriptor = "(I)V")
	static void method2971(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "k", descriptor = "(I)V")
	static void method2972(@OriginalArg(0) int arg0) {
		Class264.anInt3914 = arg0 * -1833432385;
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "x", descriptor = "()V")
	static void method2973() {
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "p", descriptor = "()V")
	static void method2974() {
		aClass243_7.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!af", name = "w", descriptor = "()V")
	static void method2975() {
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "q", descriptor = "(I)V")
	static void method2976(@OriginalArg(0) int arg0) {
		aClass243_7.method26247(arg0, (byte) 108);
	}

	@OriginalMember(owner = "client!af", name = "r", descriptor = "()V")
	static void method2977() {
		aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
	static void method2978() {
		aClass243_7.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!af", name = "z", descriptor = "()V")
	static void method2979() {
		aClass243_7.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(Lclient!di;IIIII)Lclient!dn;")
	public static Class105 method2980(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class105 local7 = (Class105) aClass243_7.method26282(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class232 local16 = Class232.method26043(Class626.aClass480_129, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3781 < 13) {
				local16.method26085(2);
			}
			local7 = arg0.method20753(local16, local9, Class264.anInt3914 * 763913535, 64, 768);
			aClass243_7.method26253(local7, local2);
		}
		local7 = local7.method7324((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method7328(arg1);
		}
		if (arg2 != 0) {
			local7.method7330(arg2);
		}
		if (arg3 != 0) {
			local7.method7318(arg3);
		}
		if (arg4 != 0) {
			local7.method7332(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!af", name = "lx", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method2981(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(27) int local27 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		Class696.method37036(arg0, local1, local14, local27, arg1, (short) -11991);
	}

	@OriginalMember(owner = "client!af", name = "bbr", descriptor = "(Lclient!yp;B)V")
	static void method2982(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass120_Sub1_Sub1_Sub1_4.method24601(-897350206);
	}

	@OriginalMember(owner = "client!af", name = "ec", descriptor = "(II)V")
	public static void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 25) {
			Class159_Sub1.aFloat150 = 2.0F;
		} else if (arg0 == 37) {
			Class159_Sub1.aFloat150 = 3.0F;
		} else if (arg0 == 50) {
			Class159_Sub1.aFloat150 = 4.0F;
		} else if (arg0 == 75) {
			Class159_Sub1.aFloat150 = 6.0F;
		} else if (arg0 == 100) {
			Class159_Sub1.aFloat150 = 8.0F;
		} else if (arg0 == 200) {
			Class159_Sub1.aFloat150 = 16.0F;
		}
		Class159_Sub1.anInt2019 = -387547399;
		Class159_Sub1.anInt2019 = -387547399;
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	Class101() {
	}
}
