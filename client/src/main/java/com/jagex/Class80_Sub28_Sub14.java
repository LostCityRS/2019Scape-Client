package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arw")
public final class Class80_Sub28_Sub14 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arw", name = "l", descriptor = "I")
	int anInt3072;

	@OriginalMember(owner = "client!arw", name = "u", descriptor = "I")
	int anInt3073;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arw", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_14;

	@OriginalMember(owner = "client!arw", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub14(@OriginalArg(0) Class387 arg0) {
		this.aClass387_14 = arg0;
	}

	@OriginalMember(owner = "client!arw", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28494(this.anInt3073 * -1277727299, this.anInt3072 * -439267675, -1999407771);
	}

	@OriginalMember(owner = "client!arw", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3073 = arg0.g4() * -1689700971;
		this.anInt3072 = arg0.g4() * 172878125;
	}

	@OriginalMember(owner = "client!arw", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3073 = arg0.g4() * -1689700971;
		this.anInt3072 = arg0.g4() * 172878125;
	}

	@OriginalMember(owner = "client!arw", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3073 = arg0.g4() * -1689700971;
		this.anInt3072 = arg0.g4() * 172878125;
	}

	@OriginalMember(owner = "client!arw", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3073 = arg0.g4() * -1689700971;
		this.anInt3072 = arg0.g4() * 172878125;
	}

	@OriginalMember(owner = "client!arw", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28494(this.anInt3073 * -1277727299, this.anInt3072 * -439267675, 936420164);
	}
}
