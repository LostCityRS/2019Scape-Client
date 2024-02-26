package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
final class Class242 implements Comparator {

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	static int anInt3858;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ef", name = "this$0", descriptor = "Lclient!aiq;")
	final Class138_Sub2 aClass138_Sub2_2;

	@OriginalMember(owner = "client!ef", name = "ck", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26240(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		arg0.anInt4110 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 2046959447;
		if (arg0.anInt4110 * -1652867993 > arg0.anInt4112 * -2019977469 - arg0.anInt4103 * 1892149809) {
			arg0.anInt4110 = arg0.anInt4112 * 1250012933 - arg0.anInt4103 * -1213299289;
		}
		if (arg0.anInt4110 * -1652867993 < 0) {
			arg0.anInt4110 = 0;
		}
		arg0.anInt4111 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * 1429656163;
		if (arg0.anInt4111 * 458112843 > arg0.anInt4091 * -13185357 - arg0.anInt4104 * 1990157877) {
			arg0.anInt4111 = arg0.anInt4091 * -1333607111 - arg0.anInt4104 * -911605633;
		}
		if (arg0.anInt4111 * 458112843 < 0) {
			arg0.anInt4111 = 0;
		}
		Class296.method26998(arg0, 2062257914);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class146.method13875(arg0.anInt4087 * -2053489901, 1069403382);
		}
	}

	@OriginalMember(owner = "client!ef", name = "ahu", descriptor = "(Lclient!yp;S)V")
	static void method26241(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(9) String local9;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == null || Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString75 == null) {
			local9 = "";
		} else {
			local9 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19057(true, -394962924);
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local9;
	}

	@OriginalMember(owner = "client!ef", name = "aia", descriptor = "(Lclient!yp;I)V")
	static void method26242(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) String local10;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == null || Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString75 == null) {
			local10 = "";
		} else {
			local10 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19066(false, 2021800196);
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local10;
	}

	@OriginalMember(owner = "client!ef", name = "asn", descriptor = "(Lclient!yp;I)V")
	static void method26243(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub27_4, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 52);
		Class719.method37291(-158238263);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!aiq;)V")
	Class242(@OriginalArg(0) Class138_Sub2 arg0) {
		this.aClass138_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(Lclient!ry;Lclient!ry;)I")
	int method26233(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1) {
		@Pc(3) float local3 = arg0.method31077(2103475047);
		@Pc(7) float local7 = arg1.method31077(2128765615);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "(Lclient!ry;Lclient!ry;I)I")
	int method26234(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method31077(2110227042);
		@Pc(7) float local7 = arg1.method31077(2146188392);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26234((Class541) arg0, (Class541) arg1, 1920145197);
	}

	@OriginalMember(owner = "client!ef", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(Lclient!ry;Lclient!ry;)I")
	int method26235(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1) {
		@Pc(3) float local3 = arg0.method31077(2111209609);
		@Pc(7) float local7 = arg1.method31077(2124063499);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method26236(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26234((Class541) arg0, (Class541) arg1, 211182920);
	}

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "(Lclient!ry;Lclient!ry;)I")
	int method26237(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1) {
		@Pc(3) float local3 = arg0.method31077(2120620665);
		@Pc(7) float local7 = arg1.method31077(2107645370);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26238(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26239(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}
}
