package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xr")
public final class Class668 implements Interface75 {

	@OriginalMember(owner = "client!xr", name = "z", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array8;

	@OriginalMember(owner = "client!xr", name = "t", descriptor = "Lclient!xr;")
	public static final Class668 aClass668_2 = new Class668(0);

	@OriginalMember(owner = "client!xr", name = "f", descriptor = "Lclient!xr;")
	static final Class668 aClass668_3 = new Class668(1);

	@OriginalMember(owner = "client!xr", name = "e", descriptor = "Lclient!xr;")
	static final Class668 aClass668_4 = new Class668(2);

	@OriginalMember(owner = "client!xr", name = "u", descriptor = "I")
	final int anInt5710;

	@OriginalMember(owner = "client!xr", name = "w", descriptor = "(Lclient!zi;B)V")
	static void method33478(@OriginalArg(0) Class707 arg0, @OriginalArg(1) byte arg1) {
		Class499.aClass707_1 = arg0;
	}

	@OriginalMember(owner = "client!xr", name = "j", descriptor = "()[Lclient!xr;")
	public static Class668[] method33479() {
		return new Class668[] { aClass668_4, aClass668_3, aClass668_2 };
	}

	@OriginalMember(owner = "client!xr", name = "t", descriptor = "(B)[Lclient!xr;")
	public static Class668[] method33480(@OriginalArg(0) byte arg0) {
		return new Class668[] { aClass668_4, aClass668_3, aClass668_2 };
	}

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "()[Lclient!xr;")
	public static Class668[] method33482() {
		return new Class668[] { aClass668_4, aClass668_3, aClass668_2 };
	}

	@OriginalMember(owner = "client!xr", name = "m", descriptor = "()[Lclient!xr;")
	public static Class668[] method33483() {
		return new Class668[] { aClass668_4, aClass668_3, aClass668_2 };
	}

	@OriginalMember(owner = "client!xr", name = "o", descriptor = "()[Lclient!xr;")
	public static Class668[] method33484() {
		return new Class668[] { aClass668_4, aClass668_3, aClass668_2 };
	}

	@OriginalMember(owner = "client!xr", name = "avn", descriptor = "(Lclient!yp;I)V")
	static void method33487(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!xr", name = "fv", descriptor = "(Lclient!yp;I)V")
	static void method33488(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class334.method27819(local11, local14, arg0, 669544954);
	}

	@OriginalMember(owner = "client!xr", name = "gb", descriptor = "(I)V")
	static void method33489(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (Class703.aClass80_Sub37_49 != null) {
			local1 = Class703.aClass80_Sub37_49.aClass165_Sub8_1.method15974(-2131446269);
		}
		@Pc(22) int local22;
		@Pc(33) int local33;
		if (local1 == 2) {
			local22 = Class334.anInt4196 * -455826321 > 800 ? 800 : Class334.anInt4196 * -455826321;
			local33 = Class286.anInt3942 * -1411780839 > 600 ? 600 : Class286.anInt3942 * -1411780839;
			Class80_Sub1_Sub1.anInt254 = local22 * -2011361969;
			client.anInt3415 = (Class334.anInt4196 * -455826321 - local22) / 2 * 294043627;
			Class80_Sub25.anInt1627 = local33 * -1341178817;
			client.anInt3417 = 0;
		} else if (local1 == 1) {
			local22 = Class334.anInt4196 * -455826321 > 1024 ? 1024 : Class334.anInt4196 * -455826321;
			local33 = Class286.anInt3942 * -1411780839 > 768 ? 768 : Class286.anInt3942 * -1411780839;
			Class80_Sub1_Sub1.anInt254 = local22 * -2011361969;
			client.anInt3415 = (Class334.anInt4196 * -455826321 - local22) / 2 * 294043627;
			Class80_Sub25.anInt1627 = local33 * -1341178817;
			client.anInt3417 = 0;
		} else {
			Class80_Sub1_Sub1.anInt254 = Class334.anInt4196 * 42688833;
			client.anInt3415 = 0;
			Class80_Sub25.anInt1627 = Class286.anInt3942 * -1859996889;
			client.anInt3417 = 0;
		}
	}

	@OriginalMember(owner = "client!xr", name = "e", descriptor = "(I)Lclient!aku;")
	public static Class80_Sub31 method33490(@OriginalArg(0) int arg0) {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = null;
		local2.anInt1648 = 0;
		local2.aPacketBit_2 = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!xr", name = "atb", descriptor = "(Lclient!yp;I)V")
	static void method33491(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!xr", name = "<init>", descriptor = "(I)V")
	Class668(@OriginalArg(0) int arg0) {
		this.anInt5710 = arg0 * 1204886093;
	}

	@OriginalMember(owner = "client!xr", name = "e", descriptor = "(I)Z")
	public boolean method33481(@OriginalArg(0) int arg0) {
		return aClass668_3 == this;
	}

	@OriginalMember(owner = "client!xr", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5710 * 116502149;
	}

	@OriginalMember(owner = "client!xr", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5710 * 116502149;
	}

	@OriginalMember(owner = "client!xr", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5710 * 116502149;
	}

	@OriginalMember(owner = "client!xr", name = "a", descriptor = "()Z")
	public boolean method33485() {
		return aClass668_3 == this;
	}

	@OriginalMember(owner = "client!xr", name = "u", descriptor = "(S)Z")
	public boolean method33486(@OriginalArg(0) short arg0) {
		return aClass668_2 != this;
	}
}
