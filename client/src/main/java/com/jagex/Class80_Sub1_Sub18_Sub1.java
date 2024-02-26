package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aul")
public final class Class80_Sub1_Sub18_Sub1 extends Class80_Sub1_Sub18 {

	@OriginalMember(owner = "client!aul", name = "o", descriptor = "Ljava/lang/Object;")
	Object anObject9;

	@OriginalMember(owner = "client!aul", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V")
	Class80_Sub1_Sub18_Sub1(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!aul", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24409() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!aul", name = "t", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24407() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!aul", name = "f", descriptor = "()Z")
	@Override
	boolean method24408() {
		return false;
	}

	@OriginalMember(owner = "client!aul", name = "u", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24411() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!aul", name = "g", descriptor = "()Z")
	@Override
	boolean method24412() {
		return false;
	}

	@OriginalMember(owner = "client!aul", name = "l", descriptor = "()Z")
	@Override
	boolean method24410() {
		return false;
	}
}
