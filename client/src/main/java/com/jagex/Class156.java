package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uy")
public abstract class Class156 {

	@OriginalMember(owner = "client!uy", name = "ut", descriptor = "I")
	static int anInt1664;

	@OriginalMember(owner = "client!uy", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_23 = new Class240(20);

	@OriginalMember(owner = "client!uy", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_47;

	@OriginalMember(owner = "client!uy", name = "hz", descriptor = "(Lclient!yf;I)V")
	static void method14196(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		@Pc(32) boolean local32 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class453.method29146(local11, local14, arg0, local32 ? Class310.aClass310_4 : Class310.aClass310_3, (byte) -65);
	}

	@OriginalMember(owner = "client!uy", name = "aet", descriptor = "(Lclient!yf;I)V")
	static void method14197(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 | 0x1 << local23;
	}

	@OriginalMember(owner = "client!uy", name = "ey", descriptor = "(I)V")
	public static void method14198(@OriginalArg(0) int arg0) {
		@Pc(7) String local7 = Class712.aString252 == null ? Class508.method30415(-1465158934) : Class712.aString252;
		Class338.method27561(local7, false, client.aBoolean598, (byte) -51);
	}

	@OriginalMember(owner = "client!uy", name = "<init>", descriptor = "(Lclient!py;)V")
	Class156(@OriginalArg(0) Class497 arg0) {
		this.aClass497_47 = arg0;
	}

	@OriginalMember(owner = "client!uy", name = "l", descriptor = "(I)V")
	final void method14188(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25925(arg0, (byte) -8);
		}
	}

	@OriginalMember(owner = "client!uy", name = "e", descriptor = "(I)V")
	final void method14189(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25926((byte) -117);
		}
	}

	@OriginalMember(owner = "client!uy", name = "f", descriptor = "()V")
	final void method14190() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25926((byte) -108);
		}
	}

	@OriginalMember(owner = "client!uy", name = "m", descriptor = "(I)V")
	final void method14191(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!uy", name = "k", descriptor = "()V")
	final void method14192() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25926((byte) -105);
		}
	}

	@OriginalMember(owner = "client!uy", name = "u", descriptor = "(I)V")
	final void method14193(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25925(arg0, (byte) -41);
		}
	}

	@OriginalMember(owner = "client!uy", name = "w", descriptor = "(I)V")
	final void method14194(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25925(arg0, (byte) -39);
		}
	}

	@OriginalMember(owner = "client!uy", name = "n", descriptor = "(II)V")
	final void method14195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25925(arg0, (byte) -52);
		}
	}
}
