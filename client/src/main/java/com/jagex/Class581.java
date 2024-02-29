package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
class Class581 implements Comparator {

	@OriginalMember(owner = "client!tt", name = "tp", descriptor = "Lclient!kr;")
	public static Class386 aClass386_2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tt", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 this$0;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(II)V", line = 46)
	static void method31390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class173.anInt3254 = arg0 * -484055331;
		Class173.aClass240_64.method25847((byte) -74);
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(II)Lclient!cr;", line = 89)
	static Class211 method31391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class211 local6 = (Class211) Class107.method18116(Class430.method28759(-406593969), arg0, -1915563430);
		if (local6 == null) {
			local6 = Class211.aClass211_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!aiz;)V", line = 150)
	Class581(@OriginalArg(0) Class146_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(Lclient!rq;Lclient!rq;I)I", line = 152)
	int method31392(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method30681(994722973);
		@Pc(7) float local7 = arg1.method30681(591153586);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(Lclient!rq;Lclient!rq;)I", line = 152)
	int method31393(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1) {
		@Pc(3) float local3 = arg0.method30681(-1838276395);
		@Pc(7) float local7 = arg1.method30681(419896320);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method31394(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31392((Class535) arg0, (Class535) arg1, 1270196902);
	}

	@OriginalMember(owner = "client!tt", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31392((Class535) arg0, (Class535) arg1, 2029148113);
	}

	@OriginalMember(owner = "client!tt", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31395(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31396(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31397(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31398(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "apc", descriptor = "(Lclient!yf;I)V", line = 12691)
	static final void method31399(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9020((byte) -7) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9017(1735468072)).method15968(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) -5);
	}
}
