package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!auf")
public class Class93_Sub1_Sub19_Sub1 extends Class93_Sub1_Sub19 {

	@OriginalMember(owner = "client!auf", name = "z", descriptor = "Ljava/lang/Object;")
	Object anObject9;

	@OriginalMember(owner = "client!auf", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V", line = 7)
	Class93_Sub1_Sub19_Sub1(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!auf", name = "m", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23967() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "e", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23962() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "k", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23964() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "f", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23965() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "n", descriptor = "()Z", line = 16)
	@Override
	boolean method23963() {
		return false;
	}

	@OriginalMember(owner = "client!auf", name = "w", descriptor = "()Z", line = 16)
	@Override
	boolean method23961() {
		return false;
	}

	@OriginalMember(owner = "client!auf", name = "l", descriptor = "()Z", line = 16)
	@Override
	boolean method23966() {
		return false;
	}
}
