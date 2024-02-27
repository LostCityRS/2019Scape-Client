package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
final class Class267 implements Interface68 {

	@OriginalMember(owner = "client!fl", name = "bf", descriptor = "I")
	public static int anInt3923;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fl", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_6;

	@OriginalMember(owner = "client!fl", name = "asw", descriptor = "(Lclient!yf;I)V")
	static void method26337(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 48);
		Class106_Sub1.method5148(-598046140);
		client.aBoolean611 = true;
	}

	@OriginalMember(owner = "client!fl", name = "aaz", descriptor = "(Lclient!yf;I)V")
	static void method26338(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 0 || local12 >= client.anInt3573 * 1882800101) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(26) Class177 local26 = client.aClass177Array1[local12];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local26.aString125;
		if (local26.aString123 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local26.aString123;
		}
	}

	@OriginalMember(owner = "client!fl", name = "rg", descriptor = "(Lclient!yf;I)V")
	static void method26339(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4020 * -903351367;
	}

	@OriginalMember(owner = "client!fl", name = "yg", descriptor = "(Lclient!yf;I)V")
	static void method26340(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943;
	}

	@OriginalMember(owner = "client!fl", name = "es", descriptor = "(IIIZI)V")
	public static void method26341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(1) Class93_Sub1_Sub20 local1 = Class159_Sub1.aClass93_Sub1_Sub20_2;
		Class159_Sub1.method14518(arg0);
		Class159_Sub1.aBoolean349 = false;
		if (Class159_Sub1.aClass93_Sub1_Sub20_2 != local1) {
			Class47.method957((byte) -76);
		}
		Class159_Sub1.anInt1953 = arg1 * -322880463;
		Class159_Sub1.anInt1946 = arg2 * -1150228155;
		Class159_Sub1.aBoolean357 = arg3;
	}

	@OriginalMember(owner = "client!fl", name = "aia", descriptor = "(Lclient!yf;I)V")
	static void method26342(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class449.aClass514_1.method30448(local12, (byte) 69).aString107;
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class267(@OriginalArg(0) Class258 arg0) {
		this.aClass258_6 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(Lclient!wr;IIZB)V")
	@Override
	public void method26332(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		this.aClass258_6.method26209(-955423366).add(arg0);
		if (arg3) {
			this.aClass258_6.method26122(326757420).method25923(arg0, (long) arg2);
		} else {
			this.aClass258_6.method26121(652954416).method25924(arg0, (long) arg2, arg0.method32711(-1889732018), -1831774392);
		}
	}

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "(Lclient!wr;I)V")
	@Override
	public void method26331(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			this.aClass258_6.method26121(652954416).method25932((long) arg0.method32739((byte) -15));
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(Lclient!wr;)V")
	@Override
	public void method26334(@OriginalArg(0) Interface70 arg0) {
		if (arg0 != null) {
			this.aClass258_6.method26121(652954416).method25932((long) arg0.method32739((byte) 2));
		}
	}

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "(Lclient!wr;IIZ)V")
	@Override
	public void method26333(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass258_6.method26209(1150189696).add(arg0);
		if (arg3) {
			this.aClass258_6.method26122(304691536).method25923(arg0, (long) arg2);
		} else {
			this.aClass258_6.method26121(652954416).method25924(arg0, (long) arg2, arg0.method32711(-2066056507), -1418338687);
		}
	}

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "(Lclient!wr;IIZ)V")
	@Override
	public void method26330(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass258_6.method26209(584432444).add(arg0);
		if (arg3) {
			this.aClass258_6.method26122(-1980514942).method25923(arg0, (long) arg2);
		} else {
			this.aClass258_6.method26121(652954416).method25924(arg0, (long) arg2, arg0.method32711(-2053916371), 301859554);
		}
	}

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "(Lclient!wr;)V")
	@Override
	public void method26335(@OriginalArg(0) Interface70 arg0) {
		if (arg0 != null) {
			this.aClass258_6.method26121(652954416).method25932((long) arg0.method32739((byte) 40));
		}
	}

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "(Lclient!wr;)V")
	@Override
	public void method26336(@OriginalArg(0) Interface70 arg0) {
		if (arg0 != null) {
			this.aClass258_6.method26121(652954416).method25932((long) arg0.method32739((byte) 89));
		}
	}
}
