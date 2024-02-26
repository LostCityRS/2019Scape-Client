package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arh")
public final class Class80_Sub28_Sub4 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arh", name = "i", descriptor = "I")
	int anInt3031;

	@OriginalMember(owner = "client!arh", name = "l", descriptor = "I")
	int anInt3032;

	@OriginalMember(owner = "client!arh", name = "g", descriptor = "I")
	int anInt3033;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arh", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_4;

	@OriginalMember(owner = "client!arh", name = "u", descriptor = "I")
	int anInt3034;

	@OriginalMember(owner = "client!arh", name = "jv", descriptor = "(Lclient!yp;I)V")
	static void method21863(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!arh", name = "wh", descriptor = "(Lclient!yp;B)V")
	static void method21864(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		Class490.aClass263_13.method26530(arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2], 201976080);
	}

	@OriginalMember(owner = "client!arh", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub4(@OriginalArg(0) Class387 arg0) {
		this.aClass387_4 = arg0;
		this.anInt3034 = 559040083;
	}

	@OriginalMember(owner = "client!arh", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3034 = arg0.method23178((byte) -56) * -559040083;
		this.anInt3032 = arg0.method23182(-733342401) * -2130032331;
		this.anInt3033 = arg0.method23362(-558575348) * -1038691443;
		this.anInt3031 = arg0.method23362(-723587879) * 857284987;
	}

	@OriginalMember(owner = "client!arh", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28500(this.anInt3034 * 1206784549, this.anInt3032 * -1217756899, this.anInt3033 * -650598587, this.anInt3031 * -1719429709, 1896589581);
	}

	@OriginalMember(owner = "client!arh", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28500(this.anInt3034 * 1206784549, this.anInt3032 * -1217756899, this.anInt3033 * -650598587, this.anInt3031 * -1719429709, 1896589581);
	}

	@OriginalMember(owner = "client!arh", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3034 = arg0.method23178((byte) -103) * -559040083;
		this.anInt3032 = arg0.method23182(1279404412) * -2130032331;
		this.anInt3033 = arg0.method23362(53689167) * -1038691443;
		this.anInt3031 = arg0.method23362(830316161) * 857284987;
	}

	@OriginalMember(owner = "client!arh", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3034 = arg0.method23178((byte) -89) * -559040083;
		this.anInt3032 = arg0.method23182(-1397038557) * -2130032331;
		this.anInt3033 = arg0.method23362(-470300819) * -1038691443;
		this.anInt3031 = arg0.method23362(996508089) * 857284987;
	}

	@OriginalMember(owner = "client!arh", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3034 = arg0.method23178((byte) -66) * -559040083;
		this.anInt3032 = arg0.method23182(1248119227) * -2130032331;
		this.anInt3033 = arg0.method23362(-111014387) * -1038691443;
		this.anInt3031 = arg0.method23362(-372082789) * 857284987;
	}
}
