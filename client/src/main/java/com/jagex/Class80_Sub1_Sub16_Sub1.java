package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atm")
public final class Class80_Sub1_Sub16_Sub1 extends Class80_Sub1_Sub16 {

	@OriginalMember(owner = "client!atm", name = "m", descriptor = "Ljava/lang/Object;")
	Object anObject8;

	@OriginalMember(owner = "client!atm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class80_Sub1_Sub16_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!atm", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24078() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!atm", name = "l", descriptor = "()Z")
	@Override
	boolean method24081() {
		return false;
	}

	@OriginalMember(owner = "client!atm", name = "f", descriptor = "(B)Z")
	@Override
	boolean method24077(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!atm", name = "u", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24080() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!atm", name = "t", descriptor = "(I)Ljava/lang/Object;")
	@Override
	Object method24083(@OriginalArg(0) int arg0) {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!atm", name = "g", descriptor = "()Z")
	@Override
	boolean method24082() {
		return false;
	}

	@OriginalMember(owner = "client!atm", name = "i", descriptor = "()Z")
	@Override
	boolean method24079() {
		return false;
	}
}
