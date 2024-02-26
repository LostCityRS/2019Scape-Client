package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fy")
final class Class279 implements Interface43 {

	@OriginalMember(owner = "client!fy", name = "cq", descriptor = "Lclient!di;")
	public static Class102 aClass102_9;

	@OriginalMember(owner = "client!fy", name = "fv", descriptor = "Lclient!pr;")
	public static Class491 aClass491_1;

	@OriginalMember(owner = "client!fy", name = "gn", descriptor = "Lclient!aoe;")
	public static Class41_Sub4 aClass41_Sub4_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fy", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_12;

	@OriginalMember(owner = "client!fy", name = "t", descriptor = "(I)V")
	static void method26845(@OriginalArg(0) int arg0) {
		Class364.aClass243_79.method26256(1693912082);
	}

	@OriginalMember(owner = "client!fy", name = "bt", descriptor = "([II)Ljava/lang/String;")
	static String method26846(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(17) Class352 local17 = (Class352) Class106.aClass73_Sub1_6.method18054(arg0[local5], -2078360965);
			if (local17.anInt4259 * 2059893325 != -1) {
				local3.append(" <sprite=").append(local17.anInt4259 * 2059893325).append(">");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "(Lclient!alt;I)V")
	public static void method26847(@OriginalArg(0) Class80_Sub42 arg0, @OriginalArg(1) int arg1) {
		Class144.method11993(arg0, 500000, -1532286432);
	}

	@OriginalMember(owner = "client!fy", name = "rb", descriptor = "(Lclient!yp;I)V")
	static void method26848(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class528.method30716(local11, local14, arg0, 372153112);
	}

	@OriginalMember(owner = "client!fy", name = "vx", descriptor = "(Lclient!yp;B)V")
	static void method26849(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class80_Sub40 local29 = (Class80_Sub40) client.aClass24_20.method560((long) local13);
		if (local29 != null && local23 == local29.anInt3156 * -151091669) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!fy", name = "bem", descriptor = "(Lclient!yp;I)V")
	static void method26850(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!fy", name = "qk", descriptor = "(Lclient!yp;B)V")
	static void method26851(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2005237732);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class443.method29215(local16, local22, arg0, (byte) -68);
	}

	@OriginalMember(owner = "client!fy", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class279(@OriginalArg(0) Class263 arg0) {
		this.aClass263_12 = arg0;
	}

	@OriginalMember(owner = "client!fy", name = "t", descriptor = "(I)F")
	@Override
	public float method26841(@OriginalArg(0) int arg0) {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) -2) / 255.0F;
	}

	@OriginalMember(owner = "client!fy", name = "u", descriptor = "()F")
	@Override
	public float method26843() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) 85) / 255.0F;
	}

	@OriginalMember(owner = "client!fy", name = "f", descriptor = "()F")
	@Override
	public float method26840() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) -26) / 255.0F;
	}

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "()F")
	@Override
	public float method26842() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) -38) / 255.0F;
	}

	@OriginalMember(owner = "client!fy", name = "l", descriptor = "()F")
	@Override
	public float method26844() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) 76) / 255.0F;
	}
}
