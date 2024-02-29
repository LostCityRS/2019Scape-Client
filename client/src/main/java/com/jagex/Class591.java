package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class591 implements Interface75, Interface64 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ud;")
	public static final Class591 aClass591_2 = new Class591(0, "", new Class519[] { Class519.aClass519_88, Class519.aClass519_7 });

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!ud;")
	public static final Class591 aClass591_1 = new Class591(1, "", new Class519[] { Class519.aClass519_88, Class519.aClass519_88 });

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!ud;")
	public static final Class591 aClass591_4 = new Class591(2, "", new Class519[] { Class519.aClass519_7, Class519.aClass519_7 });

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!ud;")
	static final Class591 aClass591_3 = new Class591(3, "", new Class519[] { Class519.aClass519_88, Class519.aClass519_88, Class519.aClass519_7 });

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	final int anInt5476;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "[Lclient!qw;")
	final Class519[] aClass519Array2;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILjava/lang/String;[Lclient!qw;)V", line = 15)
	Class591(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class519[] arg2) {
		this.anInt5476 = arg0 * 1968733325;
		this.aClass519Array2 = arg2;
		@Pc(12) Class519[] local12 = this.aClass519Array2;
		@Pc(14) int local14 = 0;
		while (local14 < local12.length) {
			@Pc(22) Class519 local22 = local12[local14];
			switch(local22.aClass500_7.anInt5196 * -1217885029) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					local14++;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "()I", line = 39)
	@Override
	public int method36920() {
		return this.anInt5476 * -1028676027;
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "()I", line = 39)
	@Override
	public int method36919() {
		return this.anInt5476 * -1028676027;
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(I)V", line = 45)
	public static void method31696(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 != 18 && client.anInt3435 * -849002901 != 3 || client.aClass175_2 == null) {
			return;
		}
		while (true) {
			@Pc(17) Interface63 local17 = (Interface63) Class602.aLinkedList5.poll();
			if (local17 == null) {
				return;
			}
			local17.method31895(-1043598981);
		}
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(Lclient!yf;I)V", line = 114)
	static void method31697(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], 1718854444)).method27590(Class624.aClass120_1, 1522075562) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "(IIIILclient!vp;I)V", line = 187)
	static final void method31698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class620 arg4, @OriginalArg(5) int arg5) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(299394856) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		if (client.aClass532_1.method30481(-1931560151) == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass532_1.method30511(-310507201).method10987(arg0, arg1, arg2, arg3, 2036579613);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
			((Class132_Sub1_Sub1_Sub3) local34).method13299(arg4, (byte) -35);
		} else if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
			((Class132_Sub1_Sub4_Sub1) local34).method12961(arg4, -1849294431);
		} else if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
			((Class132_Sub1_Sub2_Sub2) local34).method12447(arg4, 1098925647);
		} else if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
			((Class132_Sub1_Sub3_Sub1) local34).method12302(arg4, (byte) -32);
		}
	}

	@OriginalMember(owner = "client!ud", name = "if", descriptor = "(Lclient!yf;B)V", line = 6581)
	static final void method31699(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1117447650);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class617.method32091(local16, local22, arg0, -1354237222);
	}

	@OriginalMember(owner = "client!ud", name = "aly", descriptor = "(Lclient!yf;I)V", line = 11804)
	static final void method31700(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 == 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159_Sub1.aBoolean354 ? 1 : 0;
		} else if (local12 == 1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159_Sub1.aBoolean353 ? 1 : 0;
		} else if (local12 == 2) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159_Sub1.aBoolean358 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ud", name = "alh", descriptor = "(Lclient!yf;I)V", line = 11972)
	static final void method31701(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			Class717.method36895(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15844(807670402), -1, -1, false, (byte) 2);
		}
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(44) boolean local44 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		@Pc(54) String local54 = Class508.method30234(-1465158934) + local26;
		Class338.method27464(local54, local44, client.aBoolean596, (byte) -41);
	}

	@OriginalMember(owner = "client!ud", name = "aza", descriptor = "(Lclient!yf;B)V", line = 14217)
	static final void method31702(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
