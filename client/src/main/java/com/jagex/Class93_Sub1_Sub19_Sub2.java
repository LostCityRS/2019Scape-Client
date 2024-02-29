package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!auj")
public class Class93_Sub1_Sub19_Sub2 extends Class93_Sub1_Sub19 {

	@OriginalMember(owner = "client!auj", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference2;

	@OriginalMember(owner = "client!auj", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V", line = 10)
	Class93_Sub1_Sub19_Sub2(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!auj", name = "k", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23964() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "e", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23962() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "m", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23967() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "f", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23965() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "l", descriptor = "()Z", line = 19)
	@Override
	boolean method23966() {
		return true;
	}

	@OriginalMember(owner = "client!auj", name = "w", descriptor = "()Z", line = 19)
	@Override
	boolean method23961() {
		return true;
	}

	@OriginalMember(owner = "client!auj", name = "n", descriptor = "()Z", line = 19)
	@Override
	boolean method23963() {
		return true;
	}
}
