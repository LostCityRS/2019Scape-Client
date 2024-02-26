package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arm")
public final class Class80_Sub28_Sub8 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arm", name = "o", descriptor = "I")
	static int anInt3037;

	@OriginalMember(owner = "client!arm", name = "l", descriptor = "B")
	byte aByte85;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arm", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_8;

	@OriginalMember(owner = "client!arm", name = "u", descriptor = "I")
	int anInt3038;

	@OriginalMember(owner = "client!arm", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub8(@OriginalArg(0) Class387 arg0) {
		this.aClass387_8 = arg0;
		this.anInt3038 = -253308501;
	}

	@OriginalMember(owner = "client!arm", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28491(this.anInt3038 * 649223933, this.aByte85, (byte) 97);
	}

	@OriginalMember(owner = "client!arm", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3038 = arg0.g2() * 253308501;
		this.aByte85 = arg0.g1b();
	}

	@OriginalMember(owner = "client!arm", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28491(this.anInt3038 * 649223933, this.aByte85, (byte) 97);
	}

	@OriginalMember(owner = "client!arm", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3038 = arg0.g2() * 253308501;
		this.aByte85 = arg0.g1b();
	}

	@OriginalMember(owner = "client!arm", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3038 = arg0.g2() * 253308501;
		this.aByte85 = arg0.g1b();
	}

	@OriginalMember(owner = "client!arm", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3038 = arg0.g2() * 253308501;
		this.aByte85 = arg0.g1b();
	}
}
