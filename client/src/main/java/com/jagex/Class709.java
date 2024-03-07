package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zl")
public class Class709 implements Interface75 {

	@OriginalMember(owner = "client!zl", name = "j", descriptor = "Lclient!py;")
	static Class497 aClass497_142;

	@OriginalMember(owner = "client!zl", name = "e", descriptor = "Lclient!zl;")
	static final Class709 aClass709_10 = new Class709(-1);

	@OriginalMember(owner = "client!zl", name = "n", descriptor = "Lclient!zl;")
	public static final Class709 aClass709_4 = new Class709(-2);

	@OriginalMember(owner = "client!zl", name = "m", descriptor = "Lclient!zl;")
	public static final Class709 aClass709_11 = new Class709(-3);

	@OriginalMember(owner = "client!zl", name = "k", descriptor = "Lclient!zl;")
	static final Class709 aClass709_3 = new Class709(-4);

	@OriginalMember(owner = "client!zl", name = "f", descriptor = "Lclient!zl;")
	public static final Class709 aClass709_6 = new Class709(-5);

	@OriginalMember(owner = "client!zl", name = "w", descriptor = "Lclient!zl;")
	public static final Class709 aClass709_7 = new Class709(2);

	@OriginalMember(owner = "client!zl", name = "l", descriptor = "Lclient!zl;")
	static final Class709 aClass709_8 = new Class709(3);

	@OriginalMember(owner = "client!zl", name = "u", descriptor = "Lclient!zl;")
	static final Class709 aClass709_9 = new Class709(7);

	@OriginalMember(owner = "client!zl", name = "z", descriptor = "Lclient!zl;")
	static final Class709 aClass709_2 = new Class709(9);

	@OriginalMember(owner = "client!zl", name = "p", descriptor = "Lclient!zl;")
	static final Class709 aClass709_5 = new Class709(37);

	@OriginalMember(owner = "client!zl", name = "d", descriptor = "I")
	final int anInt5959;

	@OriginalMember(owner = "client!zl", name = "m", descriptor = "()[Lclient!zl;", line = 21)
	public static Class709[] method36760() {
		return new Class709[] { aClass709_8, aClass709_2, aClass709_3, aClass709_9, aClass709_11, aClass709_4, aClass709_10, aClass709_5, aClass709_6, aClass709_7 };
	}

	@OriginalMember(owner = "client!zl", name = "f", descriptor = "()[Lclient!zl;", line = 21)
	public static Class709[] method36761() {
		return new Class709[] { aClass709_8, aClass709_2, aClass709_3, aClass709_9, aClass709_11, aClass709_4, aClass709_10, aClass709_5, aClass709_6, aClass709_7 };
	}

	@OriginalMember(owner = "client!zl", name = "w", descriptor = "()[Lclient!zl;", line = 21)
	public static Class709[] method36762() {
		return new Class709[] { aClass709_8, aClass709_2, aClass709_3, aClass709_9, aClass709_11, aClass709_4, aClass709_10, aClass709_5, aClass709_6, aClass709_7 };
	}

	@OriginalMember(owner = "client!zl", name = "<init>", descriptor = "(I)V", line = 24)
	Class709(@OriginalArg(0) int arg0) {
		this.anInt5959 = arg0 * 1660777769;
	}

	@OriginalMember(owner = "client!zl", name = "n", descriptor = "()I", line = 29)
	@Override
	public int method36920() {
		return this.anInt5959 * -919734503;
	}

	@OriginalMember(owner = "client!zl", name = "k", descriptor = "()I", line = 29)
	@Override
	public int method36919() {
		return this.anInt5959 * -919734503;
	}

	@OriginalMember(owner = "client!zl", name = "ac", descriptor = "(ILjava/lang/String;B)V", line = 201)
	static void method36763(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(2, (long) arg0);
		local4.method21886(1457186984);
		local4.aString103 = arg1;
	}

	@OriginalMember(owner = "client!zl", name = "g", descriptor = "(Lclient!alw;J)V", line = 917)
	static void method36764(@OriginalArg(0) Packet arg0, @OriginalArg(1) long arg1) {
		@Pc(9) Class36 local9;
		if (Class411.aString199 != null && Class411.aString199.length() == 6) {
			if (Class411.aBoolean751) {
				local9 = Class36.aClass36_2;
			} else {
				local9 = Class36.aClass36_4;
			}
		} else if (Class266.aClass306_1.method26812(arg1)) {
			local9 = Class36.aClass36_1;
		} else {
			local9 = Class36.aClass36_3;
		}
		arg0.p1(local9.method36920(), (byte) -45);
		switch(local9.anInt115 * 1351038807) {
			case 0:
				arg0.p4(Class266.aClass306_1.method26813(arg1), (byte) 22);
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(Class411.aString199), (byte) 110);
				arg0.pos += -1445626955;
				break;
			case 2:
				arg0.pos += -1487540524;
		}
	}

	@OriginalMember(owner = "client!zl", name = "md", descriptor = "(Lclient!yf;B)V", line = 7202)
	static final void method36765(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class593.method31721(local11, local14, arg0, (short) 3625);
	}

	@OriginalMember(owner = "client!zl", name = "agy", descriptor = "(Lclient!yf;I)V", line = 10790)
	static final void method36766(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class657.anIntArray509 == null || Class36.anInt117 * -411057379 >= Class657.anIntArray509.length) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class657.anIntArray509[(Class36.anInt117 += -334948555) * -411057379 - 1] & 0xFFFF;
		}
	}

	@OriginalMember(owner = "client!zl", name = "bbi", descriptor = "(Lclient!yf;I)V", line = 14449)
	static final void method36767(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class5.method79(arg0.aClass132_Sub1_Sub1_Sub1_4, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], true, 2077434808);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[0];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[2];
	}
}
