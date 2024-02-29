package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asr")
public abstract class Class93_Sub1_Sub19 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asr", name = "u", descriptor = "Lclient!wk;")
	final Interface69 anInterface69_3;

	@OriginalMember(owner = "client!asr", name = "l", descriptor = "I")
	final int anInt3270;

	@OriginalMember(owner = "client!asr", name = "<init>", descriptor = "(Lclient!wk;I)V", line = 9)
	Class93_Sub1_Sub19(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) int arg1) {
		this.anInterface69_3 = arg0;
		this.anInt3270 = arg1;
	}

	@OriginalMember(owner = "client!asr", name = "w", descriptor = "()Z")
	abstract boolean method23961();

	@OriginalMember(owner = "client!asr", name = "e", descriptor = "()Ljava/lang/Object;")
	abstract Object method23962();

	@OriginalMember(owner = "client!asr", name = "n", descriptor = "()Z")
	abstract boolean method23963();

	@OriginalMember(owner = "client!asr", name = "k", descriptor = "()Ljava/lang/Object;")
	abstract Object method23964();

	@OriginalMember(owner = "client!asr", name = "f", descriptor = "()Ljava/lang/Object;")
	abstract Object method23965();

	@OriginalMember(owner = "client!asr", name = "l", descriptor = "()Z")
	abstract boolean method23966();

	@OriginalMember(owner = "client!asr", name = "m", descriptor = "()Ljava/lang/Object;")
	abstract Object method23967();
}
