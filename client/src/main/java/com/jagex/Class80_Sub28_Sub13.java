package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arv")
public final class Class80_Sub28_Sub13 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arv", name = "u", descriptor = "I")
	int anInt3071;

	@OriginalMember(owner = "client!arv", name = "l", descriptor = "Ljava/lang/String;")
	String aString104;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arv", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_13;

	@OriginalMember(owner = "client!arv", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub13(@OriginalArg(0) Class387 arg0) {
		this.aClass387_13 = arg0;
	}

	@OriginalMember(owner = "client!arv", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3071 = arg0.method23182(-1013478560) * 592520039;
		this.aString104 = arg0.method23376((short) 4564);
	}

	@OriginalMember(owner = "client!arv", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3071 = arg0.method23182(336972591) * 592520039;
		this.aString104 = arg0.method23376((short) 8559);
	}

	@OriginalMember(owner = "client!arv", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28492(this.anInt3071 * 868763735, this.aString104, 2084249385);
	}

	@OriginalMember(owner = "client!arv", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3071 = arg0.method23182(-118301888) * 592520039;
		this.aString104 = arg0.method23376((short) 2808);
	}

	@OriginalMember(owner = "client!arv", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3071 = arg0.method23182(500955568) * 592520039;
		this.aString104 = arg0.method23376((short) 447);
	}

	@OriginalMember(owner = "client!arv", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28492(this.anInt3071 * 868763735, this.aString104, 2066827105);
	}
}
