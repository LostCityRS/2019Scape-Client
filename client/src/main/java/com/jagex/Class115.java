package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public abstract class Class115 implements Interface3 {

	@OriginalMember(owner = "client!hu", name = "oq", descriptor = "I")
	public static int anInt1015;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_21;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_11;

	@OriginalMember(owner = "client!hu", name = "gt", descriptor = "(Lclient!yp;I)V")
	static void method8667(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class260.method26469(local11, local14, arg0, 1516748189);
	}

	@OriginalMember(owner = "client!hu", name = "rk", descriptor = "(Lclient!yp;I)V")
	static void method8668(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class579.method31808(local11, local14, arg0, (byte) 97);
	}

	@OriginalMember(owner = "client!hu", name = "akg", descriptor = "(Lclient!yp;I)V")
	static void method8669(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		if (Class159_Sub1.aClass24_15 == null) {
			return;
		}
		@Pc(35) Class80 local35 = Class159_Sub1.aClass24_15.method560((long) local13);
		if (local35 != null && !local28) {
			local35.method24395((byte) 36);
		} else if (local35 == null && local28) {
			local35 = new Class80();
			Class159_Sub1.aClass24_15.method563(local35, (long) local13);
		}
	}

	@OriginalMember(owner = "client!hu", name = "abr", descriptor = "(Lclient!yp;I)V")
	static void method8670(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].aBoolean984 ? 1 : 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!pf;I)V")
	Class115(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		this.aClass480_21 = arg0;
		this.aClass243_11 = new Class243(arg1);
	}
}
