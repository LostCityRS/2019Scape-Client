package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arb")
public final class Class80_Sub26_Sub1 extends Class80_Sub26 {

	@OriginalMember(owner = "client!arb", name = "l", descriptor = "B")
	byte aByte77;

	@OriginalMember(owner = "client!arb", name = "i", descriptor = "Ljava/lang/String;")
	String aString96;

	@OriginalMember(owner = "client!arb", name = "g", descriptor = "I")
	int anInt3024;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arb", name = "this$0", descriptor = "Lclient!kq;")
	final Class385 aClass385_1;

	@OriginalMember(owner = "client!arb", name = "u", descriptor = "I")
	int anInt3023;

	@OriginalMember(owner = "client!arb", name = "<init>", descriptor = "(Lclient!kq;)V")
	Class80_Sub26_Sub1(@OriginalArg(0) Class385 arg0) {
		this.aClass385_1 = arg0;
		this.anInt3023 = -1844516757;
	}

	@OriginalMember(owner = "client!arb", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22255(@OriginalArg(0) Packet arg0) {
		this.anInt3023 = arg0.g2() * 1844516757;
		this.aByte77 = arg0.g1b();
		this.anInt3024 = arg0.g2() * -233303989;
		arg0.g8();
		this.aString96 = arg0.gjstr();
	}

	@OriginalMember(owner = "client!arb", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22253(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3023 = arg0.g2() * 1844516757;
		this.aByte77 = arg0.g1b();
		this.anInt3024 = arg0.g2() * -233303989;
		arg0.g8();
		this.aString96 = arg0.gjstr();
	}

	@OriginalMember(owner = "client!arb", name = "u", descriptor = "(Lclient!akv;)V")
	@Override
	void method22256(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3023 * 616135613];
		local7.aByte146 = this.aByte77;
		local7.anInt4538 = this.anInt3024 * -1078591071;
		local7.aString204 = this.aString96;
	}

	@OriginalMember(owner = "client!arb", name = "f", descriptor = "(Lclient!akv;I)V")
	@Override
	void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3023 * 616135613];
		local7.aByte146 = this.aByte77;
		local7.anInt4538 = this.anInt3024 * -1078591071;
		local7.aString204 = this.aString96;
	}

	@OriginalMember(owner = "client!arb", name = "l", descriptor = "(Lclient!akv;)V")
	@Override
	void method22254(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3023 * 616135613];
		local7.aByte146 = this.aByte77;
		local7.anInt4538 = this.anInt3024 * -1078591071;
		local7.aString204 = this.aString96;
	}
}
