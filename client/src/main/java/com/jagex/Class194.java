package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class194 implements Interface17 {

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!abb;")
	public static Class28 aClass28_7;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	int anInt3348;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	int anInt3347;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[F")
	float[] aFloatArray91;

	@OriginalMember(owner = "client!bs", name = "by", descriptor = "(Lclient!yp;I)V")
	static void method24851(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		if (local8.aClass327_14.anInt4094 * 2071556223 != -1) {
			@Pc(32) Class327 local32 = local8.method36961((byte) 2);
			local32.aClass327Array3[local8.aClass327_14.anInt4094 * 2071556223] = null;
			Class296.method26998(local32, 654811045);
		} else if (arg0.aBoolean988) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bs", name = "la", descriptor = "(ZS)V")
	public static void method24852(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_59, client.aClass75_1.aClass22_1, -191270971);
		client.aClass75_1.method1325(local5, (byte) -4);
		for (@Pc(14) Class80_Sub40 local14 = (Class80_Sub40) client.aClass24_20.method580((byte) -67); local14 != null; local14 = (Class80_Sub40) client.aClass24_20.method566((byte) 7)) {
			if (!local14.method24399(-221656997)) {
				local14 = (Class80_Sub40) client.aClass24_20.method580((byte) -13);
				if (local14 == null) {
					break;
				}
			}
			if (local14.anInt3155 * 1092245243 == 0) {
				Class80_Sub42.method15605(local14, true, arg0, (byte) -116);
			}
		}
		if (client.aClass327_10 != null) {
			Class296.method26998(client.aClass327_10, 1735675809);
			client.aClass327_10 = null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "hi", descriptor = "(Lclient!ahb;I)I")
	static int method24853(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt2697 * 1952438699 == 0) {
			return 0;
		}
		@Pc(71) int local71;
		@Pc(63) Class463 local63;
		if (arg0.anInt2683 * 1232799883 != -1) {
			@Pc(15) Class120_Sub1_Sub1_Sub1 local15 = null;
			if (arg0.anInt2683 * 1232799883 < 32768) {
				@Pc(30) Class80_Sub19 local30 = (Class80_Sub19) client.aClass24_18.method560((long) (arg0.anInt2683 * 1232799883));
				if (local30 != null) {
					local15 = (Class120_Sub1_Sub1_Sub1) local30.anObject5;
				}
			} else if (arg0.anInt2683 * 1232799883 >= 32768) {
				local15 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2683 * 1232799883 - 32768];
			}
			if (local15 != null) {
				local63 = Class463.method29487(arg0.method24552().aClass463_61, local15.method24552().aClass463_61);
				@Pc(67) int local67 = (int) local63.aFloat297;
				local71 = (int) local63.aFloat296;
				if (local67 != 0 || local71 != 0) {
					arg0.method19033((int) (Math.atan2((double) local67, (double) local71) * 2607.5945876176133D) & 0x3FFF, (byte) 1);
				}
			}
		}
		if (arg0 instanceof Class120_Sub1_Sub1_Sub1_Sub2) {
			@Pc(95) Class120_Sub1_Sub1_Sub1_Sub2 local95 = (Class120_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local95.anInt2714 * -469406145 != -1 && (local95.anInt2700 * 1679797067 == 0 || local95.anInt2678 * -655132499 > 0)) {
				local95.method19033(local95.anInt2714 * -469406145, (byte) 1);
				local95.anInt2714 = -1297842623;
			}
		} else if (arg0 instanceof Class120_Sub1_Sub1_Sub1_Sub1) {
			@Pc(128) Class120_Sub1_Sub1_Sub1_Sub1 local128 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local128.anInt2660 * -463459853 != -1 && (local128.anInt2700 * 1679797067 == 0 || local128.anInt2678 * -655132499 > 0)) {
				local63 = local128.method24552().aClass463_61;
				@Pc(152) Class626 local152 = client.aClass539_1.method30893((byte) -89);
				local71 = (int) local63.aFloat297 - (local128.anInt2660 * 1613361920 - local152.anInt5540 * -1220233984 - local152.anInt5540 * -1220233984);
				@Pc(190) int local190 = (int) local63.aFloat296 - (local128.anInt2669 * 954822400 - local152.anInt5537 * -1308970752 - local152.anInt5537 * -1308970752);
				if (local71 != 0 || local190 != 0) {
					local128.method19033((int) (Math.atan2((double) local71, (double) local190) * 2607.5945876176133D) & 0x3FFF, (byte) 1);
				}
				local128.anInt2660 = -881366843;
			}
		}
		return arg0.method18956(1916418565);
	}

	@OriginalMember(owner = "client!bs", name = "ais", descriptor = "(Lclient!yp;I)V")
	static void method24854(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class71.aClass510_2.method30536(local13, 484563197).anIntArray278[local23];
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(II)V")
	Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3348 = arg0 * -1158072491;
		this.anInt3347 = arg1 * 2066940749;
		this.aFloatArray91 = new float[this.anInt3348 * -699331075 * this.anInt3347 * -1414140539];
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt3348 * -699331075;
	}

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
	}

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt3348 * -699331075;
	}

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt3348 * -699331075;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt3347 * -1414140539;
	}

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt3347 * -1414140539;
	}

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt3348 * -699331075;
	}

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
	}

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
	}
}
