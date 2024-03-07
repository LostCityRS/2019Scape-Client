package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gc")
public class Class284 implements Interface26 {

	@OriginalMember(owner = "client!gc", name = "ah", descriptor = "Lclient!cm;")
	static Class100 aClass100_42;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gc", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!on;")
	final Class466 aClass466_1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "(Lclient!alw;Ljava/lang/String;I)I", line = 18)
	public static int method26484(@OriginalArg(0) Packet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0.pos * 212851357;
		@Pc(8) byte[] local8 = Class269.method26271(arg1, (byte) -122);
		arg0.pSmart1or2(local8.length, (byte) -26);
		arg0.pos += Class350.aClass337_1.method27451(local8, 0, local8.length, arg0.data, arg0.pos * 212851357, -1227975933) * -1445626955;
		return arg0.pos * 212851357 - local4;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 291)
	Class284(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		if (arg1.g2(-1434290800) == 65535) {
			this.aClass466_1 = null;
		} else {
			arg1.pos -= 1403713386;
			this.aClass466_1 = arg0.anInterface27_2.method25528((byte) -12).method1468(arg1, (byte) 33);
		}
	}

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "(Lclient!gq;B)V", line = 300)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass466_1 != null) {
			arg0.method26653(-2044048665).method33468((Class108) this.this$0.anInterface27_2.method25528((byte) -32).method18261(this.aClass466_1.anInt5092 * -1181855333, 1495013738), this.aClass466_1.anObject19, -1982962417);
		}
	}

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "(Lclient!gq;)V", line = 300)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		if (this.aClass466_1 != null) {
			arg0.method26653(1838875806).method33468((Class108) this.this$0.anInterface27_2.method25528((byte) 1).method18261(this.aClass466_1.anInt5092 * -1181855333, -2036295823), this.aClass466_1.anObject19, -1383761232);
		}
	}

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "(Lclient!gq;)V", line = 300)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		if (this.aClass466_1 != null) {
			arg0.method26653(355717944).method33468((Class108) this.this$0.anInterface27_2.method25528((byte) -38).method18261(this.aClass466_1.anInt5092 * -1181855333, -1907853590), this.aClass466_1.anObject19, -1729143292);
		}
	}

	@OriginalMember(owner = "client!gc", name = "eu", descriptor = "(Lclient!dh;IIIIB)V", line = 664)
	static final void method26485(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		arg0.method20569(arg1, arg2, arg3 + arg1, arg4 + arg2);
		arg0.method20469(arg1, arg2, arg3, arg4, -16777216, (byte) 119);
		if (Class159_Sub1.anInt1950 * -1574654625 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) Class159_Sub1.anInt1922 / (float) Class159_Sub1.anInt1923;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) ((float) arg3 * local29);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class604.aClass100_50 == null || Class604.aClass100_50.method18205() != local31 || Class604.aClass100_50.method18192() != local33) {
			Class159_Sub1.aClass240_35 = Class159_Sub1.aClass240_34;
			Class159_Sub1.method14557(Class159_Sub1.anInt1915, Class159_Sub1.anInt1922 + Class159_Sub1.anInt1921, Class159_Sub1.anInt1923 + Class159_Sub1.anInt1915, Class159_Sub1.anInt1921, local58, local66, local58 + local31, local66 + local33);
			Class159_Sub1.method14558(arg0, false, false, client.aBoolean620, true);
			arg0.method20489();
			Class604.aClass100_50 = arg0.method20682(local58, local66, local31, local33, true);
		}
		Class604.aClass100_50.method18161(local58, local66);
		@Pc(124) int local124 = Class386.anInt4648 * -1091206359 * local31 / Class159_Sub1.anInt1923;
		@Pc(132) int local132 = local33 * Class138.anInt1383 * 1125904161 / Class159_Sub1.anInt1922;
		@Pc(142) int local142 = local58 + local31 * -767301419 * Class344.anInt4190 / Class159_Sub1.anInt1923;
		@Pc(156) int local156 = local66 + local33 - Class657.anInt5811 * -1716473211 * local33 / Class159_Sub1.anInt1922 - local132;
		@Pc(158) int local158 = -1996554240;
		if (Class702.aClass702_5 == client.aClass702_4) {
			local158 = -1996488705;
		}
		arg0.method20721(local142, local156, local124, local132, local158, 1);
		arg0.method20573(local142, local156, local124, local132, local158, 0);
		for (@Pc(184) Class93_Sub29 local184 = (Class93_Sub29) Class159_Sub1.aClass22_28.method428((byte) 70); local184 != null; local184 = (Class93_Sub29) Class159_Sub1.aClass22_28.method442(1881187987)) {
			@Pc(195) Class322 local195 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local184.anInt1603 * 1208139441, 1078866102);
			if (Class32_Sub11.method17037(local195, (byte) 82)) {
				@Pc(209) Class355 local209 = (Class355) Class159_Sub1.aHashMap4.get(local184.anInt1603 * 1208139441);
				if (local209 == null) {
					local209 = (Class355) Class159_Sub1.aHashMap5.get(local195.anInt4105 * 880251661);
				}
				if (local209 != null) {
					@Pc(247) int local247;
					if (local209.anInt4217 * 1950348827 > Class159_Sub1.anInt1955 * 1548012049 / 2) {
						local247 = (Class159_Sub1.anInt1955 * -393918737 - local209.anInt4217 * -877255451) / (Class159_Sub1.anInt1955 * 1548012049);
					} else {
						local247 = local209.anInt4217 * -877255451 / (Class159_Sub1.anInt1955 * 1548012049);
					}
					@Pc(268) int local268 = local184.anInt1605 * 1012619213 * local31 / Class159_Sub1.anInt1923 + local58;
					@Pc(281) int local281 = local33 * (Class159_Sub1.anInt1922 - local184.anInt1608 * -2087611449) / Class159_Sub1.anInt1922 + local66;
					arg0.method20469(local268 - 2, local281 - 2, 4, 4, local247 << 24 | 0xFFFF00, (byte) 103);
				}
			}
		}
		Class159_Sub1.aClass240_34.method25843(5, (byte) -45);
	}

	@OriginalMember(owner = "client!gc", name = "si", descriptor = "(Lclient!yf;I)V", line = 8206)
	static final void method26486(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3994 * -552008165;
	}

	@OriginalMember(owner = "client!gc", name = "avf", descriptor = "(Lclient!yf;I)V", line = 13489)
	static final void method26487(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
