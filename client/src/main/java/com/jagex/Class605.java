package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ux")
public class Class605 implements Interface63 {

	@OriginalMember(owner = "client!ux", name = "e", descriptor = "I")
	final int anInt5554;

	@OriginalMember(owner = "client!ux", name = "<init>", descriptor = "(I)V", line = 56)
	Class605(@OriginalArg(0) int arg0) {
		this.anInt5554 = arg0 * 1862799867;
	}

	@OriginalMember(owner = "client!ux", name = "e", descriptor = "(I)V", line = 61)
	@Override
	public void method31895(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_57, client.aClass175_2.aClass24_2, (byte) 48);
		local5.aClass93_Sub41_Sub2_1.method22395(this.anInt5554 * -1596174029, 2127823971);
		client.aClass175_2.method24356(local5, -1922171802);
	}

	@OriginalMember(owner = "client!ux", name = "n", descriptor = "()V", line = 61)
	@Override
	public void method31894() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_57, client.aClass175_2.aClass24_2, (byte) 92);
		local5.aClass93_Sub41_Sub2_1.method22395(this.anInt5554 * -1596174029, 2136098271);
		client.aClass175_2.method24356(local5, -1522138341);
	}

	@OriginalMember(owner = "client!ux", name = "k", descriptor = "()V", line = 61)
	@Override
	public void method31897() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_57, client.aClass175_2.aClass24_2, (byte) 9);
		local5.aClass93_Sub41_Sub2_1.method22395(this.anInt5554 * -1596174029, 2141013227);
		client.aClass175_2.method24356(local5, -1738368580);
	}

	@OriginalMember(owner = "client!ux", name = "m", descriptor = "()V", line = 61)
	@Override
	public void method31896() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_57, client.aClass175_2.aClass24_2, (byte) 83);
		local5.aClass93_Sub41_Sub2_1.method22395(this.anInt5554 * -1596174029, 2142194470);
		client.aClass175_2.method24356(local5, -1576299280);
	}

	@OriginalMember(owner = "client!ux", name = "f", descriptor = "()V", line = 61)
	@Override
	public void method31898() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_57, client.aClass175_2.aClass24_2, (byte) 63);
		local5.aClass93_Sub41_Sub2_1.method22395(this.anInt5554 * -1596174029, 2126729837);
		client.aClass175_2.method24356(local5, -1693886198);
	}

	@OriginalMember(owner = "client!ux", name = "c", descriptor = "(I)V", line = 645)
	static void method31899(@OriginalArg(0) int arg0) {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false, 199047110);
		Class596.aClass113_Sub1_1.method7417(local6, (byte) 54);
	}

	@OriginalMember(owner = "client!ux", name = "km", descriptor = "(Lclient!yf;I)V", line = 6890)
	static final void method31900(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1260484879);
		Class114.method7638(local16, arg0, 124311001);
	}

	@OriginalMember(owner = "client!ux", name = "my", descriptor = "(Lclient!yf;I)V", line = 7195)
	static final void method31901(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1140309563);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class593.method31721(local16, local22, arg0, (short) 13315);
	}

	@OriginalMember(owner = "client!ux", name = "yq", descriptor = "(Lclient!yf;I)V", line = 9276)
	static final void method31902(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.aBoolean862 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ux", name = "abe", descriptor = "(Lclient!yf;B)V", line = 9936)
	static final void method31903(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class557.aClass297_1.method26650(862710467);
	}

	@OriginalMember(owner = "client!ux", name = "akc", descriptor = "(Lclient!yf;I)V", line = 11569)
	static final void method31904(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub29 local2 = Class717.method36894(-1001215611);
		if (local2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.anInt1603 * 1208139441;
			@Pc(76) int local76 = local2.anInt1604 * -1010688139 << 28 | local2.anInt1605 * 1012619213 + Class159.anInt1915 << 14 | Class159.anInt1921 + local2.anInt1608 * -2087611449;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local76;
		}
	}

	@OriginalMember(owner = "client!ux", name = "axv", descriptor = "(Lclient!yf;B)V", line = 13880)
	static final void method31905(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(24) int local24 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class266.method26229(local24, local11, arg0, (byte) 35);
	}
}
