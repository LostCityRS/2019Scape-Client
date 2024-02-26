package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aso")
public abstract class Class80_Sub1_Sub18 extends Class80_Sub1 {

	@OriginalMember(owner = "client!aso", name = "m", descriptor = "Lclient!wk;")
	final Interface69 anInterface69_3;

	@OriginalMember(owner = "client!aso", name = "i", descriptor = "I")
	final int anInt3294;

	@OriginalMember(owner = "client!aso", name = "<init>", descriptor = "(Lclient!wk;I)V")
	Class80_Sub1_Sub18(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) int arg1) {
		this.anInterface69_3 = arg0;
		this.anInt3294 = arg1;
	}

	@OriginalMember(owner = "client!aso", name = "t", descriptor = "()Ljava/lang/Object;")
	abstract Object method24407();

	@OriginalMember(owner = "client!aso", name = "f", descriptor = "()Z")
	abstract boolean method24408();

	@OriginalMember(owner = "client!aso", name = "e", descriptor = "()Ljava/lang/Object;")
	abstract Object method24409();

	@OriginalMember(owner = "client!aso", name = "l", descriptor = "()Z")
	abstract boolean method24410();

	@OriginalMember(owner = "client!aso", name = "u", descriptor = "()Ljava/lang/Object;")
	abstract Object method24411();

	@OriginalMember(owner = "client!aso", name = "g", descriptor = "()Z")
	abstract boolean method24412();
}
