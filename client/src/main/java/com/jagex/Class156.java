package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class156 {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!ej;")
	final Class243 aClass243_26 = new Class243(20);

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_43;

	@OriginalMember(owner = "client!vf", name = "pd", descriptor = "(Lclient!yp;B)V")
	static void method15155(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2062828788);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class375.method28449(local16, local22, arg0, 2063183212);
	}

	@OriginalMember(owner = "client!vf", name = "ahy", descriptor = "(Lclient!yp;I)V")
	static void method15156(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, 580120823);
		if (local29.method1428(1658376631)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class625) client.aClass539_1.method30905(-1647384758).method18054(local13, 2107312404)).method32464(local23, local29.aString11, 2051396610);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class625) client.aClass539_1.method30905(1027132741).method18054(local13, 246473331)).method32463(local23, local29.anInt253 * 680817871, -1105233381);
		}
	}

	@OriginalMember(owner = "client!vf", name = "alb", descriptor = "(Lclient!yp;I)V")
	static void method15157(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class17.method437(-1349690784);
	}

	@OriginalMember(owner = "client!vf", name = "dl", descriptor = "(I)V")
	static void method15158(@OriginalArg(0) int arg0) {
		if (Class159_Sub1.anInt2026 * 2002101755 < 0) {
			Class159_Sub1.anInt2026 = 0;
			Class159_Sub1.anInt2018 = -1806870975;
			Class159_Sub1.anInt2019 = -387547399;
		}
		if (Class159_Sub1.anInt2026 * 2002101755 > Class159_Sub1.anInt2001) {
			Class159_Sub1.anInt2026 = Class159_Sub1.anInt2001 * 1633656115;
			Class159_Sub1.anInt2018 = -1806870975;
			Class159_Sub1.anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 < 0) {
			Class158.anInt2029 = 0;
			Class159_Sub1.anInt2018 = -1806870975;
			Class159_Sub1.anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 > Class159_Sub1.anInt1989) {
			Class158.anInt2029 = Class159_Sub1.anInt1989 * -1296666553;
			Class159_Sub1.anInt2018 = -1806870975;
			Class159_Sub1.anInt2019 = -387547399;
		}
	}

	@OriginalMember(owner = "client!vf", name = "zp", descriptor = "(Lclient!yp;I)V")
	static void method15159(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class50 local18 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local12, -684019166);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.method1020(1226170141);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class156(@OriginalArg(0) Class480 arg0) {
		this.aClass480_43 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "()V")
	final void method15145() {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
	final void method15146(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	final void method15147(@OriginalArg(0) byte arg0) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	final void method15148(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26247(arg0, (byte) 108);
		}
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "(I)V")
	final void method15149(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26247(arg0, (byte) 126);
		}
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "()V")
	final void method15150() {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "()V")
	final void method15151() {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(IS)V")
	final void method15152(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26247(arg0, (byte) 101);
		}
	}

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "(I)V")
	final void method15153(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26247(arg0, (byte) 41);
		}
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "()V")
	final void method15154() {
		@Pc(3) Class243 local3 = this.aClass243_26;
		synchronized (this.aClass243_26) {
			this.aClass243_26.method26259((byte) 3);
		}
	}
}
