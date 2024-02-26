package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.lang.ref.SoftReference;

@OriginalClass("client!auo")
public final class Class80_Sub1_Sub18_Sub2 extends Class80_Sub1_Sub18 {

	@OriginalMember(owner = "client!auo", name = "o", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference2;

	@OriginalMember(owner = "client!auo", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V")
	Class80_Sub1_Sub18_Sub2(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!auo", name = "f", descriptor = "()Z")
	@Override
	boolean method24408() {
		return true;
	}

	@OriginalMember(owner = "client!auo", name = "t", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24407() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auo", name = "u", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24411() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auo", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24409() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auo", name = "l", descriptor = "()Z")
	@Override
	boolean method24410() {
		return true;
	}

	@OriginalMember(owner = "client!auo", name = "g", descriptor = "()Z")
	@Override
	boolean method24412() {
		return true;
	}
}
