package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ars")
public final class Class80_Sub26_Sub4 extends Class80_Sub26 {

	@OriginalMember(owner = "client!ars", name = "l", descriptor = "B")
	byte aByte86;

	@OriginalMember(owner = "client!ars", name = "g", descriptor = "I")
	int anInt3046;

	@OriginalMember(owner = "client!ars", name = "i", descriptor = "Ljava/lang/String;")
	String aString101;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ars", name = "this$0", descriptor = "Lclient!kq;")
	final Class385 aClass385_4;

	@OriginalMember(owner = "client!ars", name = "u", descriptor = "I")
	int anInt3045;

	@OriginalMember(owner = "client!ars", name = "<init>", descriptor = "(Lclient!kq;)V")
	Class80_Sub26_Sub4(@OriginalArg(0) Class385 arg0) {
		this.aClass385_4 = arg0;
		this.anInt3045 = -431180091;
	}

	@OriginalMember(owner = "client!ars", name = "f", descriptor = "(Lclient!akv;I)V")
	@Override
	void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3045 * 1902422003];
		local7.aByte146 = this.aByte86;
		local7.anInt4538 = this.anInt3046 * 1061023709;
		local7.aString204 = this.aString101;
	}

	@OriginalMember(owner = "client!ars", name = "u", descriptor = "(Lclient!akv;)V")
	@Override
	void method22256(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3045 * 1902422003];
		local7.aByte146 = this.aByte86;
		local7.anInt4538 = this.anInt3046 * 1061023709;
		local7.aString204 = this.aString101;
	}

	@OriginalMember(owner = "client!ars", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22255(@OriginalArg(0) Packet arg0) {
		arg0.g1();
		this.anInt3045 = arg0.g2() * 431180091;
		this.aByte86 = arg0.g1b();
		this.anInt3046 = arg0.g2() * -1775712857;
		arg0.g8();
		this.aString101 = arg0.gjstr();
		arg0.g1();
	}

	@OriginalMember(owner = "client!ars", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22253(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		arg0.g1();
		this.anInt3045 = arg0.g2() * 431180091;
		this.aByte86 = arg0.g1b();
		this.anInt3046 = arg0.g2() * -1775712857;
		arg0.g8();
		this.aString101 = arg0.gjstr();
		arg0.g1();
	}

	@OriginalMember(owner = "client!ars", name = "l", descriptor = "(Lclient!akv;)V")
	@Override
	void method22254(@OriginalArg(0) Class80_Sub32 arg0) {
		@Pc(7) Class382 local7 = arg0.aClass382Array1[this.anInt3045 * 1902422003];
		local7.aByte146 = this.aByte86;
		local7.anInt4538 = this.anInt3046 * 1061023709;
		local7.aString204 = this.aString101;
	}
}
