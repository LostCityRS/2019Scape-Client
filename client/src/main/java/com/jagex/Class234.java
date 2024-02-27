package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class234 {

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	public int anInt3797;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "Lclient!du;")
	public Class234 aClass234_1;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public int anInt3801;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public int anInt3803;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!du", name = "z", descriptor = "I")
	public int anInt3805;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	public final int anInt3808;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public final int anInt3796;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	public final int anInt3807;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public final int anInt3799;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "I")
	public final int anInt3800;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "B")
	final byte aByte111;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "(B)V")
	static void method25835(@OriginalArg(0) byte arg0) {
		Class173.aClass240_64.method25926((byte) -100);
	}

	@OriginalMember(owner = "client!du", name = "u", descriptor = "(Lclient!yf;I)V")
	static void method25836(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2], 1771293837)).anIntArray421[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]];
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!du", name = "tm", descriptor = "(Lclient!hf;IIB)V")
	static void method25837(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0.aClass331_2 == null) {
			@Pc(11) Class336 local11 = (Class336) Class162.aClass32_Sub3_2.method18273(arg0.anInt4078 * 371778301, -1468824631);
			arg0.aClass331_2 = new Class331(local11, false);
		}
		arg0.aClass331_2.aLong259 = Class388.method28430((byte) 127) * 6591543353939106377L;
		arg0.aClass331_2.method27468(arg1, arg2, -2071842212);
	}

	@OriginalMember(owner = "client!du", name = "aum", descriptor = "(Lclient!yf;I)V")
	static void method25838(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 108);
	}

	@OriginalMember(owner = "client!du", name = "zp", descriptor = "(Lclient!yf;I)V")
	static void method25839(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 957530791;
		arg0.anInt6052 -= -725861497;
		@Pc(20) String local20 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(33) boolean local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091] == 1;
		@Pc(48) boolean local48 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		@Pc(63) boolean local63 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] == 1;
		@Pc(69) Class93_Sub22 local69 = Class102.method2592(Class446.aClass446_80, client.aClass175_1.aClass24_2, (byte) 116);
		local69.aClass93_Sub41_Sub2_1.method22466(Class46.method894(local20, -1764169458) + 1, 2132026922);
		local69.aClass93_Sub41_Sub2_1.method22414(local20, 1458001794);
		@Pc(85) int local85 = 0;
		if (local33) {
			local85 |= 0x1;
		}
		if (local48) {
			local85 |= 0x2;
		}
		if (local63) {
			local85 |= 0x4;
		}
		local69.aClass93_Sub41_Sub2_1.method22522(local85, (byte) -36);
		client.aClass175_1.method24363(local69, -1987932025);
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIB)V")
	Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.anInt3808 = arg0 * -952453115;
		this.anInt3796 = arg1 * -2111330579;
		this.anInt3807 = arg2 * 513585415;
		this.anInt3799 = arg3 * 53989639;
		this.anInt3800 = arg4 * 1538465323;
		this.aByte111 = arg5;
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(Lclient!nb;B)Lclient!nj;")
	public Class439 method25828(@OriginalArg(0) Interface46 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method29002(this.anInt3808 * -343583539, -2016440903);
	}

	@OriginalMember(owner = "client!du", name = "n", descriptor = "(IIIIB)Lclient!du;")
	Class234 method25829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		return new Class234(this.anInt3808 * -343583539, arg0, arg1, arg2, arg3, this.aByte111);
	}

	@OriginalMember(owner = "client!du", name = "m", descriptor = "(Lclient!nb;)Lclient!nj;")
	public Class439 method25830(@OriginalArg(0) Interface46 arg0) {
		return arg0.method29002(this.anInt3808 * -343583539, -11623941);
	}

	@OriginalMember(owner = "client!du", name = "k", descriptor = "(Lclient!nb;)Lclient!nj;")
	public Class439 method25831(@OriginalArg(0) Interface46 arg0) {
		return arg0.method29002(this.anInt3808 * -343583539, -226095254);
	}

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(Lclient!nb;)Lclient!nj;")
	public Class439 method25832(@OriginalArg(0) Interface46 arg0) {
		return arg0.method29002(this.anInt3808 * -343583539, 1181810277);
	}

	@OriginalMember(owner = "client!du", name = "w", descriptor = "(IIII)Lclient!du;")
	Class234 method25833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class234(this.anInt3808 * -343583539, arg0, arg1, arg2, arg3, this.aByte111);
	}

	@OriginalMember(owner = "client!du", name = "l", descriptor = "(IIII)Lclient!du;")
	Class234 method25834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class234(this.anInt3808 * -343583539, arg0, arg1, arg2, arg3, this.aByte111);
	}
}
