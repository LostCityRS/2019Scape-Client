package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asl")
public abstract class Class80_Sub1_Sub16 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asl", name = "i", descriptor = "I")
	final int anInt3267;

	@OriginalMember(owner = "client!asl", name = "a", descriptor = "(I)V")
	static void method24084(@OriginalArg(0) int arg0) {
		if (Class554.anInt3412 * -349861231 > 1) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 4, (byte) 91);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 2, (byte) 75);
		}
	}

	@OriginalMember(owner = "client!asl", name = "<init>", descriptor = "(I)V")
	Class80_Sub1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt3267 = arg0 * -805462463;
	}

	@OriginalMember(owner = "client!asl", name = "f", descriptor = "(B)Z")
	abstract boolean method24077(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!asl", name = "e", descriptor = "()Ljava/lang/Object;")
	abstract Object method24078();

	@OriginalMember(owner = "client!asl", name = "i", descriptor = "()Z")
	abstract boolean method24079();

	@OriginalMember(owner = "client!asl", name = "u", descriptor = "()Ljava/lang/Object;")
	abstract Object method24080();

	@OriginalMember(owner = "client!asl", name = "l", descriptor = "()Z")
	abstract boolean method24081();

	@OriginalMember(owner = "client!asl", name = "g", descriptor = "()Z")
	abstract boolean method24082();

	@OriginalMember(owner = "client!asl", name = "t", descriptor = "(I)Ljava/lang/Object;")
	abstract Object method24083(@OriginalArg(0) int arg0);
}
