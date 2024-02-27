package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class599 implements Interface63 {

	@OriginalMember(owner = "client!uo", name = "dt", descriptor = "Lclient!ni;")
	public static Class438 aClass438_1;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!acx;")
	final Class73 aClass73_15;

	@OriginalMember(owner = "client!uo", name = "ec", descriptor = "(Lclient!yf;I)V")
	static void method32016(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 54499458);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class318.method27305(local16, local22, arg0, -2143411644);
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V")
	static void method32017(@OriginalArg(0) byte arg0) {
		Class172.anInt3177 = 0;
		Class172.anInt3175 = -1899481709;
		Class172.anInt3179 = -2004084007;
		Class172.anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!uo", name = "lt", descriptor = "(Lclient!yf;B)V")
	static void method32018(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 377430344);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class247.method26009(local16, local22, arg0, 1764379247);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!acx;)V")
	Class599(@OriginalArg(0) Class73 arg0) {
		this.aClass73_15 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	@Override
	public void method32076(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2, (byte) 77);
		local5.aClass93_Sub41_Sub2_1.method22458(this.aClass73_15.method37101(), -1591808004);
		client.aClass175_2.method24363(local5, -1927374045);
	}

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "()V")
	@Override
	public void method32075() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2, (byte) 21);
		local5.aClass93_Sub41_Sub2_1.method22458(this.aClass73_15.method37101(), -1591808004);
		client.aClass175_2.method24363(local5, -1874286412);
	}

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
	@Override
	public void method32077() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2, (byte) 77);
		local5.aClass93_Sub41_Sub2_1.method22458(this.aClass73_15.method37101(), -1591808004);
		client.aClass175_2.method24363(local5, -1961824600);
	}

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "()V")
	@Override
	public void method32078() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2, (byte) 19);
		local5.aClass93_Sub41_Sub2_1.method22458(this.aClass73_15.method37101(), -1591808004);
		client.aClass175_2.method24363(local5, -1698366104);
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "()V")
	@Override
	public void method32079() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2, (byte) 106);
		local5.aClass93_Sub41_Sub2_1.method22458(this.aClass73_15.method37101(), -1591808004);
		client.aClass175_2.method24363(local5, -1490185051);
	}
}
