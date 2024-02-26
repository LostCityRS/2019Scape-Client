package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ary")
public final class Class80_Sub26_Sub5 extends Class80_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ary", name = "this$0", descriptor = "Lclient!kq;")
	final Class385 aClass385_5;

	@OriginalMember(owner = "client!ary", name = "u", descriptor = "I")
	int anInt3074;

	@OriginalMember(owner = "client!ary", name = "<init>", descriptor = "(Lclient!kq;)V")
	Class80_Sub26_Sub5(@OriginalArg(0) Class385 arg0) {
		this.aClass385_5 = arg0;
		this.anInt3074 = -1545530663;
	}

	@OriginalMember(owner = "client!ary", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22253(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3074 = arg0.method23178((byte) -118) * 1545530663;
		arg0.method23362(-1379285808);
		if (arg0.method23362(-855312943) != 255) {
			arg0.anInt3152 -= 1034180571;
			arg0.method23273((byte) 35);
		}
	}

	@OriginalMember(owner = "client!ary", name = "u", descriptor = "(Lclient!akv;)V")
	@Override
	void method22256(@OriginalArg(0) Class80_Sub32 arg0) {
		arg0.method14433(this.anInt3074 * -1000623465, 711307401);
	}

	@OriginalMember(owner = "client!ary", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22255(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3074 = arg0.method23178((byte) -62) * 1545530663;
		arg0.method23362(-717021691);
		if (arg0.method23362(523084237) != 255) {
			arg0.anInt3152 -= 1034180571;
			arg0.method23273((byte) -25);
		}
	}

	@OriginalMember(owner = "client!ary", name = "f", descriptor = "(Lclient!akv;I)V")
	@Override
	void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1) {
		arg0.method14433(this.anInt3074 * -1000623465, 711307401);
	}

	@OriginalMember(owner = "client!ary", name = "l", descriptor = "(Lclient!akv;)V")
	@Override
	void method22254(@OriginalArg(0) Class80_Sub32 arg0) {
		arg0.method14433(this.anInt3074 * -1000623465, 711307401);
	}
}
