package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class576 implements Interface62 {

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "Lclient!auq;")
	final Class120_Sub1_Sub1_Sub6 aClass120_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "(B)V")
	static void method31791(@OriginalArg(0) byte arg0) {
		@Pc(4) Class123_Sub1 local4 = (Class123_Sub1) Class606.aClass121_Sub1_3.method9603(-1717192517);
		@Pc(9) Class20_Sub3 local9 = (Class20_Sub3) Class606.aClass121_Sub1_3.method9693(1870325971);
		@Pc(13) Class463 local13 = local4.method20516(1436604136);
		@Pc(17) Class466 local17 = local9.method16660((byte) -21);
		if (client.aClass327_7 != null) {
			@Pc(24) int local24 = client.aClass327_7.anInt4103 * 1892149809;
			@Pc(29) int local29 = client.aClass327_7.anInt4104 * 1990157877;
			@Pc(31) float local31 = 1000.0F;
			@Pc(43) float local43 = (float) (Math.atan((double) ((float) local24 / 2.0F / local31)) * 2.0D);
			@Pc(55) float local55 = (float) (Math.atan((double) ((float) local29 / 2.0F / local31)) * 2.0D);
			try {
				Class606.aClass121_Sub1_3.method9645(local43, local55, -595601481);
			} catch (@Pc(62) Exception_Sub3 local62) {
			}
		}
		if (Class363.aClass152_1.method14594(-1315326542)) {
			@Pc(68) Class466 local68 = Class466.method29640();
			local68.method29645(1.0F, 0.0F, 0.0F, (float) (Class363.aClass152_1.method14598(403493056) - Class626.anInt5539 * 1625967607) / 200.0F);
			local17.method29660(local68);
			@Pc(91) Class463 local91 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local91.method29500(local17);
			@Pc(96) Class466 local96 = Class466.method29640();
			local96.method29648(local91, (float) (Class606.anInt5393 * -947635229 - Class363.aClass152_1.method14615(-343908327)) / 200.0F);
			local17.method29660(local96);
			local9.method16632(local17, (byte) 74);
		}
		Class606.anInt5393 = Class363.aClass152_1.method14615(-1333814560) * -1542004277;
		Class626.anInt5539 = Class363.aClass152_1.method14598(-1268161043) * -1297226297;
		local17.method29701();
		@Pc(140) Class463 local140;
		if (Class544.aClass155_1.method15048(98, (short) 6111)) {
			local140 = Class463.method29541(0.0F, 0.0F, 25.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(99, (short) 11648)) {
			local140 = Class463.method29541(0.0F, 0.0F, -25.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(96, (short) 10178)) {
			local140 = Class463.method29541(-25.0F, 0.0F, 0.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(97, (short) 11506)) {
			local140 = Class463.method29541(25.0F, 0.0F, 0.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		@Pc(232) Class80_Sub33 local232 = new Class80_Sub33(0, (int) local13.aFloat297, (int) local13.aFloat295, (int) local13.aFloat296);
		local4.method9811(local232, 301009761);
		@Pc(240) Class626 local240 = client.aClass539_1.method30893((byte) -101);
		@Pc(247) int local247 = local240.anInt5540 * -390642507 << 9;
		@Pc(254) int local254 = local240.anInt5537 * -894305615 << 9;
		Class606.aClass121_Sub1_3.method9675(0.02F, client.aClass539_1.method30910((byte) -1).anIntArrayArrayArray14, client.aClass539_1.method30903(-463929735), local247, local254, (byte) 46);
	}

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "(IB)V")
	public static void method31792(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3433 * 1994758437 == 0) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_19, client.aClass75_2.aClass22_1, -191270971);
			local11.aPacketBit_2.p1(arg0);
			client.aClass75_2.method1325(local11, (byte) -18);
		}
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!auq;)V")
	Class576(@OriginalArg(0) Class120_Sub1_Sub1_Sub6 arg0) {
		this.aClass120_Sub1_Sub1_Sub6_1 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31789(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return this.aClass120_Sub1_Sub1_Sub6_1 == arg0;
	}

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "(Lclient!ase;I)Z")
	@Override
	public boolean method31790(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		return this.aClass120_Sub1_Sub1_Sub6_1 == arg0;
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31788(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return this.aClass120_Sub1_Sub1_Sub6_1 == arg0;
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31787(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return this.aClass120_Sub1_Sub1_Sub6_1 == arg0;
	}
}
