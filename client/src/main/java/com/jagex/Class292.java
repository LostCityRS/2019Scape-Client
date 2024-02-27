package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class292 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gl", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_8;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	final int anInt3954;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	final int anInt3953;

	@OriginalMember(owner = "client!gl", name = "ak", descriptor = "(Lclient!dh;IIIIILclient!eu;Lclient!aac;Ljava/lang/String;I)V")
	static void method26672(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class106 arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9) {
		@Pc(9) int local9 = 255 - Class520.anInt5381 * -1544868537 - Class454.anInt5216 * 1506557571;
		if (local9 < 0) {
			local9 = 0;
		}
		if (Class92.aClass100_2 == null || Class25.aClass100_39 == null) {
			if (Class110_Sub7.aClass497_22.method30235(Class93_Sub1_Sub15.anInt3091 * -2011768695, -512225963) && Class110_Sub7.aClass497_22.method30235(Class165.anInt2067 * 36532273, -512225963)) {
				Class92.aClass100_2 = arg0.method20511(Class203.method24664(Class110_Sub7.aClass497_22, Class93_Sub1_Sub15.anInt3091 * -2011768695, 0), true);
				@Pc(48) Class105 local48 = Class203.method24664(Class110_Sub7.aClass497_22, Class165.anInt2067 * 36532273, 0);
				Class25.aClass100_39 = arg0.method20511(local48, true);
				local48.method7168();
				Class441.aClass100_44 = arg0.method20511(local48, true);
			} else {
				arg0.method20665(arg1, arg2, arg3, arg5, local9 << 24 | Class650.anInt5957 * -1046144577, 1);
			}
		}
		if (Class92.aClass100_2 != null && Class25.aClass100_39 != null) {
			@Pc(90) int local90 = (arg3 - Class25.aClass100_39.method18201() * 2) / Class92.aClass100_2.method18201();
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				Class92.aClass100_2.method18181(arg1 + Class25.aClass100_39.method18201() + local92 * Class92.aClass100_2.method18201(), arg2);
			}
			Class25.aClass100_39.method18181(arg1, arg2);
			Class441.aClass100_44.method18181(arg1 + arg3 - Class441.aClass100_44.method18201(), arg2);
		}
		arg6.method7524(arg8, arg1 + 3, arg2 + arg7.anInt6 * -8978697 + (20 - arg7.anInt6 * -8978697) / 2, Class219.anInt3668 * 333089103 | 0xFF000000, -1, (byte) 0);
		arg0.method20665(arg1, arg5 + arg2, arg3, arg4 - arg5, local9 << 24 | Class650.anInt5957 * -1046144577, 1);
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(Lclient!ws;B)V")
	public static void method26673(@OriginalArg(0) Class645 arg0, @OriginalArg(1) byte arg1) {
		Class393.anInt4815 = arg0.anInt5932 * -757046477;
		Class393.anInt4814 = arg0.anInt5942 * -136694867;
		Class393.anInt4818 = arg0.anInt5943 * -1072823787;
	}

	@OriginalMember(owner = "client!gl", name = "lg", descriptor = "(Lclient!yf;I)V")
	static void method26674(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class314.method27030(local11, arg0, -1328830745);
	}

	@OriginalMember(owner = "client!gl", name = "axz", descriptor = "(Lclient!yf;I)V")
	static void method26675(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		client.aClass312_5 = null;
		client.aClass312_3 = null;
	}

	@OriginalMember(owner = "client!gl", name = "aqe", descriptor = "(Lclient!yf;I)V")
	static void method26676(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class292(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_8 = arg0;
		@Pc(8) int local8 = arg1.method22427(-1434290800);
		if (local8 == 65535) {
			this.anInt3954 = -1526435553;
			this.anInt3953 = 0;
		} else {
			this.anInt3954 = local8 * 1526435553;
			this.anInt3953 = arg1.method22431(-118643075) * -768993093;
		}
	}

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		if (-423742175 * this.anInt3954 != -1) {
			try {
				arg0.method26717(583161273).method33650((Class379) this.aClass303_8.anInterface27_2.method25623(1191202635).method18273(this.anInt3954 * -423742175, -992668554), this.anInt3953 * 1735945331, -283552376);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		if (-423742175 * this.anInt3954 != -1) {
			try {
				arg0.method26717(-652552122).method33650((Class379) this.aClass303_8.anInterface27_2.method25623(-247809848).method18273(this.anInt3954 * -423742175, 1089121099), this.anInt3953 * 1735945331, 2067586462);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		if (-423742175 * this.anInt3954 != -1) {
			try {
				arg0.method26717(1992846787).method33650((Class379) this.aClass303_8.anInterface27_2.method25623(877498787).method18273(this.anInt3954 * -423742175, 926467896), this.anInt3953 * 1735945331, 1025843417);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}
}
