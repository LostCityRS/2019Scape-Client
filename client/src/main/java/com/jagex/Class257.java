package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!fa")
final class Class257 implements Interface55 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fa", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_1;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "(S)Lclient!sr;")
	public static Class146 method26425(@OriginalArg(0) short arg0) {
		try {
			return new Class146_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class146_Sub1();
		}
	}

	@OriginalMember(owner = "client!fa", name = "bh", descriptor = "(ZLclient!yp;B)V")
	static void method26426(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2073096694);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		if (arg0) {
			Class313.method27484(local22, local16, (byte) -17);
		} else {
			Class80_Sub28_Sub3.method21844(local22, local16, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!fa", name = "bq", descriptor = "(Lclient!yp;B)V")
	static void method26427(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class612.method32231(local11, local14, arg0, -1918049990);
	}

	@OriginalMember(owner = "client!fa", name = "ff", descriptor = "(III)I")
	public static int method26428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class698.aClass638_1.anInt5630 * -2013498219 == -1) {
			return 1;
		}
		if (arg0 != Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1338492168)) {
			Class552.method31354(arg0, Class60.aClass60_163.method1180(Class512.aClass719_3, -2090807156), true, (byte) 22);
			if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-595730930) != arg0) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Class454.aCanvas6.getSize();
			Class92.method1878(Class60.aClass60_163.method1180(Class512.aClass719_3, 428778926), true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 761812012);
			@Pc(50) Class232 local50 = Class232.method26043(Class626.aClass480_129, Class698.aClass638_1.anInt5630 * -2013498219, 0);
			@Pc(53) long local53 = Class303.method27111((byte) 64);
			Class279.aClass102_9.method20877();
			client.aClass471_51.method29775(0.0F, 256.0F, 0.0F);
			Class279.aClass102_9.method20759(client.aClass471_51);
			@Pc(66) Class487 local66 = Class279.aClass102_9.method20750();
			local66.method30188((float) (local32.width / 2), (float) (local32.height / 2), 512.0F, 512.0F, (float) client.aClass539_1.method30899((short) 24700), (float) client.aClass539_1.method30900(-774248760), (float) local32.width, (float) local32.height);
			Class279.aClass102_9.method20933(local66);
			Class279.aClass102_9.method20801(1.0F);
			Class279.aClass102_9.method20765(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(116) Class105 local116 = Class279.aClass102_9.method20753(local50, 2048, 64, 64, 768);
			@Pc(118) int local118 = 0;
			label42: for (@Pc(120) int local120 = 0; local120 < 500; local120++) {
				Class279.aClass102_9.method20714(3, 0);
				for (@Pc(129) int local129 = 15; local129 >= 0; local129--) {
					for (@Pc(133) int local133 = 0; local133 <= local129; local133++) {
						client.aClass471_52.method29775((float) (((float) local133 - (float) local129 / 2.0F) * 512.0F), 0.0F, (float) ((local129 + 1) * 512));
						local116.method7359(client.aClass471_52, null, 0);
						local118++;
						if (Class303.method27111((byte) 61) - local53 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Class279.aClass102_9.method20659();
			@Pc(189) long local189 = (long) (local118 * 1000) / (Class303.method27111((byte) 62) - local53);
			Class279.aClass102_9.method20714(3, 0);
			return (int) local189;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class257(@OriginalArg(0) Class263 arg0) {
		this.aClass263_1 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26708(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -18);
		@Pc(19) Class463 local19 = this.aClass263_1.method26531((byte) 92);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29481();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat297 > local6.aFloat297 - local41 / 2.0F && local19.aFloat297 < local6.aFloat297 + local41 / 2.0F && local19.aFloat296 > local6.aFloat296 - local47 / 2.0F && local19.aFloat296 < local47 / 2.0F + local6.aFloat296) {
				@Pc(98) float local98 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local41 / 2.0F));
				@Pc(109) float local109 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = local139 * (1.0F / local135);
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	@Override
	public void method26706(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -77);
		@Pc(19) Class463 local19 = this.aClass263_1.method26531((byte) 57);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29481();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat297 > local6.aFloat297 - local41 / 2.0F && local19.aFloat297 < local6.aFloat297 + local41 / 2.0F && local19.aFloat296 > local6.aFloat296 - local47 / 2.0F && local19.aFloat296 < local47 / 2.0F + local6.aFloat296) {
				@Pc(98) float local98 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local41 / 2.0F));
				@Pc(109) float local109 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = local139 * (1.0F / local135);
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26707(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -114);
		@Pc(19) Class463 local19 = this.aClass263_1.method26531((byte) 97);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29481();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat297 > local6.aFloat297 - local41 / 2.0F && local19.aFloat297 < local6.aFloat297 + local41 / 2.0F && local19.aFloat296 > local6.aFloat296 - local47 / 2.0F && local19.aFloat296 < local47 / 2.0F + local6.aFloat296) {
				@Pc(98) float local98 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local41 / 2.0F));
				@Pc(109) float local109 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = local139 * (1.0F / local135);
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}
}
