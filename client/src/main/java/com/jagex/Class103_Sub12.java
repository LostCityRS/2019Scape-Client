package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agh")
public final class Class103_Sub12 extends Class103 {

	@OriginalMember(owner = "client!agh", name = "f", descriptor = "I")
	final int anInt953;

	@OriginalMember(owner = "client!agh", name = "e", descriptor = "I")
	final int anInt952;

	@OriginalMember(owner = "client!agh", name = "fy", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method7921(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		arg0.aBoolean803 = local12 == 1;
		Class296.method26998(arg0, -1142037600);
	}

	@OriginalMember(owner = "client!agh", name = "so", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method7922(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt5774 * -1036864191 >= 10) {
			throw new RuntimeException();
		} else if (arg0.anObjectArray35 != null) {
			@Pc(18) Class80_Sub42 local18 = new Class80_Sub42();
			local18.aClass327_3 = arg0;
			local18.anObjectArray4 = arg0.anObjectArray35;
			local18.anInt2055 = arg1.anInt5774 * 256632081 + 1584671697;
			client.aClass8_46.method232(local18, 2004743723);
		}
	}

	@OriginalMember(owner = "client!agh", name = "du", descriptor = "(S)V")
	static void method7923(@OriginalArg(0) short arg0) {
		Class443.method29216(-2132701360);
		Class159_Sub1.aClass80_Sub1_Sub12_3 = null;
		Class103_Sub8.aClass80_Sub1_Sub12_1 = null;
		Class159_Sub1.aClass24_15.method564(-383522809);
		Class159_Sub1.aClass24_16.method564(-226915098);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				Class159_Sub1.aClass104ArrayArray1[local13][local18] = null;
				Class159_Sub1.aClass15ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!agh", name = "tx", descriptor = "(Lclient!yp;I)V")
	static void method7924(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2135951493);
		Class165.method16958(local16, arg0, (byte) 114);
	}

	@OriginalMember(owner = "client!agh", name = "aiy", descriptor = "(Lclient!yp;S)V")
	static void method7925(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(17) Class80_Sub1_Sub17 local17 = Class71.aClass510_2.method30536(local12, -1553044541);
		if (local17.anIntArray278 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anIntArray278.length;
		}
	}

	@OriginalMember(owner = "client!agh", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub12(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt953 = arg0.g2() * 108496917;
		this.anInt952 = arg0.gSmart2or4null() * 1059022595;
	}

	@OriginalMember(owner = "client!agh", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(6) Class249 local6 = Class700.aClass249Array1[this.anInt953 * 882640701];
		Class157.method15209(local6.anInt3872 * -1968270521, local6.anInt3871 * -1986291659, local6.anInt3873 * 144695177, local6.aClass607_1.anInt5397 * 380575545, local6.aClass607_1.anInt5396 * 1323580581, local6.anInt3875 * -787434545, null, this.anInt952 * -655508565, 0, (byte) 3);
	}

	@OriginalMember(owner = "client!agh", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(6) Class249 local6 = Class700.aClass249Array1[this.anInt953 * 882640701];
		Class157.method15209(local6.anInt3872 * -1968270521, local6.anInt3871 * -1986291659, local6.anInt3873 * 144695177, local6.aClass607_1.anInt5397 * 380575545, local6.aClass607_1.anInt5396 * 1323580581, local6.anInt3875 * -787434545, null, this.anInt952 * -655508565, 0, (byte) 3);
	}

	@OriginalMember(owner = "client!agh", name = "u", descriptor = "(I)Z")
	@Override
	boolean method19201(@OriginalArg(0) int arg0) {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt952 * -655508565, 341080647);
		return local8.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agh", name = "i", descriptor = "()Z")
	@Override
	boolean method19199() {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt952 * -655508565, -1514862832);
		return local8.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agh", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(6) Class249 local6 = Class700.aClass249Array1[this.anInt953 * 882640701];
		Class157.method15209(local6.anInt3872 * -1968270521, local6.anInt3871 * -1986291659, local6.anInt3873 * 144695177, local6.aClass607_1.anInt5397 * 380575545, local6.aClass607_1.anInt5396 * 1323580581, local6.anInt3875 * -787434545, null, this.anInt952 * -655508565, 0, (byte) 3);
	}

	@OriginalMember(owner = "client!agh", name = "m", descriptor = "()Z")
	@Override
	boolean method19204() {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt952 * -655508565, -303911486);
		return local8.method26480(1740709047);
	}
}
