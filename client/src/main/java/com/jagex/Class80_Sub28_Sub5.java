package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arj")
public final class Class80_Sub28_Sub5 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arj", name = "l", descriptor = "Z")
	boolean aBoolean568;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arj", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_5;

	@OriginalMember(owner = "client!arj", name = "u", descriptor = "I")
	int anInt3035;

	@OriginalMember(owner = "client!arj", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub5(@OriginalArg(0) Class387 arg0) {
		this.aClass387_5 = arg0;
		this.anInt3035 = 963450263;
	}

	@OriginalMember(owner = "client!arj", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28484(this.anInt3035 * -555661863, this.aBoolean568, (byte) 75);
	}

	@OriginalMember(owner = "client!arj", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3035 = arg0.g2() * -963450263;
		this.aBoolean568 = arg0.g1() == 1;
	}

	@OriginalMember(owner = "client!arj", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28484(this.anInt3035 * -555661863, this.aBoolean568, (byte) 22);
	}

	@OriginalMember(owner = "client!arj", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3035 = arg0.g2() * -963450263;
		this.aBoolean568 = arg0.g1() == 1;
	}

	@OriginalMember(owner = "client!arj", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3035 = arg0.g2() * -963450263;
		this.aBoolean568 = arg0.g1() == 1;
	}

	@OriginalMember(owner = "client!arj", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3035 = arg0.g2() * -963450263;
		this.aBoolean568 = arg0.g1() == 1;
	}
}
