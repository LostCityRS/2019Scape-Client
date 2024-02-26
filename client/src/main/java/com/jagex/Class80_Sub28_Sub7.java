package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arl")
public final class Class80_Sub28_Sub7 extends Class80_Sub28 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!arl", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_7;

	@OriginalMember(owner = "client!arl", name = "u", descriptor = "I")
	int anInt3036;

	@OriginalMember(owner = "client!arl", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub7(@OriginalArg(0) Class387 arg0) {
		this.aClass387_7 = arg0;
		this.anInt3036 = 264854561;
	}

	@OriginalMember(owner = "client!arl", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3036 = arg0.g2() * -264854561;
	}

	@OriginalMember(owner = "client!arl", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28487(this.anInt3036 * 1688393759, 45459249);
	}

	@OriginalMember(owner = "client!arl", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28487(this.anInt3036 * 1688393759, -118920225);
	}

	@OriginalMember(owner = "client!arl", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3036 = arg0.g2() * -264854561;
	}

	@OriginalMember(owner = "client!arl", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3036 = arg0.g2() * -264854561;
	}

	@OriginalMember(owner = "client!arl", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3036 = arg0.g2() * -264854561;
	}
}
