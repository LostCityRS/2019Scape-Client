package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public class Class292 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gl", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	final int anInt3913;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	final int anInt3912;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(Lclient!ws;B)V", line = 45)
	public static void method26579(@OriginalArg(0) Class645 arg0, @OriginalArg(1) byte arg1) {
		Class393.anInt4654 = arg0.anInt5771 * -757046477;
		Class393.anInt4653 = arg0.anInt5781 * -136694867;
		Class393.anInt4657 = arg0.anInt5782 * -1072823787;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 309)
	Class292(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		@Pc(8) int local8 = arg1.g2(-1434290800);
		if (local8 == 65535) {
			this.anInt3913 = -1526435553;
			this.anInt3912 = 0;
		} else {
			this.anInt3913 = local8 * 1526435553;
			this.anInt3912 = arg1.g4(-118643075) * -768993093;
		}
	}

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "(Lclient!gq;)V", line = 322)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		if (-423742175 * this.anInt3913 != -1) {
			try {
				arg0.method26653(583161273).method33469((Class379) this.this$0.anInterface27_2.method25530(1191202635).get(this.anInt3913 * -423742175, -992668554), this.anInt3912 * 1735945331, -283552376);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(Lclient!gq;B)V", line = 322)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		if (-423742175 * this.anInt3913 != -1) {
			try {
				arg0.method26653(-652552122).method33469((Class379) this.this$0.anInterface27_2.method25530(-247809848).get(this.anInt3913 * -423742175, 1089121099), this.anInt3912 * 1735945331, 2067586462);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "(Lclient!gq;)V", line = 322)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		if (-423742175 * this.anInt3913 != -1) {
			try {
				arg0.method26653(1992846787).method33469((Class379) this.this$0.anInterface27_2.method25530(877498787).get(this.anInt3913 * -423742175, 926467896), this.anInt3912 * 1735945331, 1025843417);
			} catch (@Pc(28) Exception_Sub7 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "ak", descriptor = "(Lclient!dh;IIIIILclient!eu;Lclient!aac;Ljava/lang/String;I)V", line = 1222)
	static void method26580(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class106 arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9) {
		@Pc(9) int local9 = 255 - Class520.anInt5220 * -1544868537 - Class454.anInt5055 * 1506557571;
		if (local9 < 0) {
			local9 = 0;
		}
		if (Class92.aClass100_2 == null || Class25.aClass100_39 == null) {
			if (Class110_Sub7.aClass497_22.method30071(Class93_Sub1_Sub15.anInt3091 * -2011768695, -512225963) && Class110_Sub7.aClass497_22.method30071(Class165.anInt2067 * 36532273, -512225963)) {
				Class92.aClass100_2 = arg0.method20589(Class203.method24648(Class110_Sub7.aClass497_22, Class93_Sub1_Sub15.anInt3091 * -2011768695, 0), true);
				@Pc(48) Class105 local48 = Class203.method24648(Class110_Sub7.aClass497_22, Class165.anInt2067 * 36532273, 0);
				Class25.aClass100_39 = arg0.method20589(local48, true);
				local48.method7168();
				Class441.aClass100_44 = arg0.method20589(local48, true);
			} else {
				arg0.method20721(arg1, arg2, arg3, arg5, local9 << 24 | Class650.anInt5796 * -1046144577, 1);
			}
		}
		if (Class92.aClass100_2 != null && Class25.aClass100_39 != null) {
			@Pc(90) int local90 = (arg3 - Class25.aClass100_39.method18205() * 2) / Class92.aClass100_2.method18205();
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				Class92.aClass100_2.method18161(arg1 + Class25.aClass100_39.method18205() + local92 * Class92.aClass100_2.method18205(), arg2);
			}
			Class25.aClass100_39.method18161(arg1, arg2);
			Class441.aClass100_44.method18161(arg1 + arg3 - Class441.aClass100_44.method18205(), arg2);
		}
		arg6.method7523(arg8, arg1 + 3, arg2 + arg7.anInt6 * -8978697 + (20 - arg7.anInt6 * -8978697) / 2, Class219.anInt3627 * 333089103 | 0xFF000000, -1, (byte) 0);
		arg0.method20721(arg1, arg5 + arg2, arg3, arg4 - arg5, local9 << 24 | Class650.anInt5796 * -1046144577, 1);
	}

	@OriginalMember(owner = "client!gl", name = "lg", descriptor = "(Lclient!yf;I)V", line = 7079)
	static final void method26581(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class314.method26942(local11, arg0, -1328830745);
	}

	@OriginalMember(owner = "client!gl", name = "aqe", descriptor = "(Lclient!yf;I)V", line = 12832)
	static final void method26582(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gl", name = "axz", descriptor = "(Lclient!yf;I)V", line = 13901)
	static final void method26583(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		client.aClass312_5 = null;
		client.aClass312_3 = null;
	}
}
