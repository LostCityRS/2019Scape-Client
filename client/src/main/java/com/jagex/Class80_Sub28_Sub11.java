package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arr")
public final class Class80_Sub28_Sub11 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arr", name = "i", descriptor = "I")
	int anInt3041;

	@OriginalMember(owner = "client!arr", name = "g", descriptor = "I")
	int anInt3042;

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "I")
	int anInt3043;

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "I")
	int anInt3044;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arr", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_11;

	@OriginalMember(owner = "client!arr", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub11(@OriginalArg(0) Class387 arg0) {
		this.aClass387_11 = arg0;
	}

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3044 = arg0.g4() * -577329307;
		this.anInt3041 = arg0.g4() * 1724438543;
		this.anInt3043 = arg0.g1() * -2083916929;
		this.anInt3042 = arg0.g1() * 1577024195;
	}

	@OriginalMember(owner = "client!arr", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3044 = arg0.g4() * -577329307;
		this.anInt3041 = arg0.g4() * 1724438543;
		this.anInt3043 = arg0.g1() * -2083916929;
		this.anInt3042 = arg0.g1() * 1577024195;
	}

	@OriginalMember(owner = "client!arr", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28495(this.anInt3044 * -982175123, this.anInt3041 * 71505647, this.anInt3043 * 1186581631, this.anInt3042 * 206669291, -1525548322);
	}

	@OriginalMember(owner = "client!arr", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28495(this.anInt3044 * -982175123, this.anInt3041 * 71505647, this.anInt3043 * 1186581631, this.anInt3042 * 206669291, -1525548322);
	}

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3044 = arg0.g4() * -577329307;
		this.anInt3041 = arg0.g4() * 1724438543;
		this.anInt3043 = arg0.g1() * -2083916929;
		this.anInt3042 = arg0.g1() * 1577024195;
	}

	@OriginalMember(owner = "client!arr", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3044 = arg0.g4() * -577329307;
		this.anInt3041 = arg0.g4() * 1724438543;
		this.anInt3043 = arg0.g1() * -2083916929;
		this.anInt3042 = arg0.g1() * 1577024195;
	}
}
