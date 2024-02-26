package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class134 implements Interface24, Interface21, Interface72 {

	@OriginalMember(owner = "client!ai", name = "di", descriptor = "Lclient!h;")
	public static Class306 aClass306_1;

	@OriginalMember(owner = "client!ai", name = "tg", descriptor = "Lclient!gz;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "[Lclient!xi;")
	final Class661[] aClass661Array1;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Lclient!wg;")
	public final Class636 aClass636_1;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!adh;")
	final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!aov;")
	final Class41_Sub17 aClass41_Sub17_1;

	@OriginalMember(owner = "client!ai", name = "amp", descriptor = "(Lclient!yp;I)V")
	static void method10450(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class45.method17296(44967471);
	}

	@OriginalMember(owner = "client!ai", name = "beg", descriptor = "(Lclient!yp;B)V")
	static void method10451(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class448.aClass341_1.method27916(-1583629376);
	}

	@OriginalMember(owner = "client!ai", name = "bfs", descriptor = "(Lclient!yp;I)V")
	static void method10452(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "(Lclient!ad;Lclient!hx;IIIB)V")
	static void method10453(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(8) Class80_Sub31 local8;
		if (arg2 == 1) {
			local8 = Class623.method32440(Class443.aClass443_20, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 118);
			arg0.method1325(local8, (byte) -84);
		}
		if (arg2 == 2) {
			local8 = Class623.method32440(Class443.aClass443_121, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 42);
			arg0.method1325(local8, (byte) -41);
		}
		if (arg2 == 3) {
			local8 = Class623.method32440(Class443.aClass443_87, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 112);
			arg0.method1325(local8, (byte) -93);
		}
		if (arg2 == 4) {
			local8 = Class623.method32440(Class443.aClass443_31, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 53);
			arg0.method1325(local8, (byte) -79);
		}
		if (arg2 == 5) {
			local8 = Class623.method32440(Class443.aClass443_37, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 116);
			arg0.method1325(local8, (byte) -107);
		}
		if (arg2 == 6) {
			local8 = Class623.method32440(Class443.aClass443_84, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 70);
			arg0.method1325(local8, (byte) -122);
		}
		if (arg2 == 7) {
			local8 = Class623.method32440(Class443.aClass443_65, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 15);
			arg0.method1325(local8, (byte) -104);
		}
		if (arg2 == 8) {
			local8 = Class623.method32440(Class443.aClass443_52, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 17);
			arg0.method1325(local8, (byte) -49);
		}
		if (arg2 == 9) {
			local8 = Class623.method32440(Class443.aClass443_68, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 115);
			arg0.method1325(local8, (byte) -29);
		}
		if (arg2 == 10) {
			local8 = Class623.method32440(Class443.aClass443_69, arg0.aClass22_1, -191270971);
			Class255.method26408(local8, arg3, arg4, arg1.anInt4167 * 1052460537, (byte) 100);
			arg0.method1325(local8, (byte) -29);
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!adh;Lclient!aov;I)V")
	public Class134(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) Class41_Sub17 arg1, @OriginalArg(2) int arg2) {
		this.aClass661Array1 = new Class661[arg2];
		this.aClass636_1 = new Class636();
		this.aClass2_Sub1_Sub1_1 = arg0;
		this.aClass41_Sub17_1 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28384(@OriginalArg(0) int arg0) {
		@Pc(6) Class374 local6 = (Class374) this.aClass41_Sub17_1.method18054(arg0, 1522471360);
		return local6.aClass107_1.aClass143_6 == Class143.aClass143_71 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "(II)I")
	public int method10437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass661Array1[arg0].method33314(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, 1625550777);
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)I")
	@Override
	public int method10434(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33309(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, -287111052);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)I")
	@Override
	public int method10433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass661Array1[arg0].method33309(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, -702549425);
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(I)I")
	public int method10438(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36981(@OriginalArg(0) Class374 arg0) {
		return this.aClass636_1.method36978(arg0, (byte) -113);
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(Lclient!qt;II)Lclient!ea;")
	@Override
	public Class107 method28382(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class143.aClass143_71 ? (Class107) this.aClass2_Sub1_Sub1_1.method18054(arg1, -1361628118) : null;
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)Lclient!kb;")
	@Override
	public Class374 method28381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class374 local6 = (Class374) this.aClass41_Sub17_1.method18054(arg0, 2130128619);
		return local6.aClass107_1.aClass143_6 == Class143.aClass143_71 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass636_1.method36978(arg0, (byte) -91);
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)I")
	public int method10439(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33314(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, 1697372592);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	public int method10440(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33314(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, 1766201991);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I")
	@Override
	public int method10435(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33309(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, -1780330167);
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(IB)I")
	public int method10441(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "(I)I")
	public int method10442(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "(I)I")
	public int method10443(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "(I)I")
	public int method10444(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "(I)I")
	public int method10445(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33293(996863650);
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)I")
	@Override
	public int method10436(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33309(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, -1096258036);
	}

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "(Lclient!qt;I)Lclient!ea;")
	@Override
	public Class107 method28383(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class143.aClass143_71 ? (Class107) this.aClass2_Sub1_Sub1_1.method18054(arg1, 2137455648) : null;
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "(I)I")
	@Override
	public int method10432(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33309(client.aBoolean732 ? Class705.aClass705_1 : Class705.aClass705_2, -1452495788);
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(II)I")
	public int method10446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass661Array1[arg0].method33296(735825645);
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "(II)I")
	public int method10447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass661Array1[arg0].method33293(1240765681);
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "(I)I")
	public int method10448(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33296(735825645);
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.aClass636_1.method36980(arg0, 562589146);
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28385(@OriginalArg(0) int arg0) {
		@Pc(6) Class374 local6 = (Class374) this.aClass41_Sub17_1.method18054(arg0, -1111508079);
		return local6.aClass107_1.aClass143_6 == Class143.aClass143_71 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28380(@OriginalArg(0) int arg0) {
		@Pc(6) Class374 local6 = (Class374) this.aClass41_Sub17_1.method18054(arg0, -536726612);
		return local6.aClass107_1.aClass143_6 == Class143.aClass143_71 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36979(@OriginalArg(0) Class107 arg0) {
		return this.aClass636_1.method36980(arg0, -329137125);
	}

	@OriginalMember(owner = "client!ai", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36977(@OriginalArg(0) Class107 arg0) {
		return this.aClass636_1.method36980(arg0, -1704599660);
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(I)I")
	public int method10449(@OriginalArg(0) int arg0) {
		return this.aClass661Array1[arg0].method33298(1768557292);
	}

	@OriginalMember(owner = "client!ai", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36982(@OriginalArg(0) Class374 arg0) {
		return this.aClass636_1.method36978(arg0, (byte) -82);
	}
}
