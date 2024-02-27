package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!auj")
public final class Class93_Sub1_Sub19_Sub2 extends Class93_Sub1_Sub19 {

	@OriginalMember(owner = "client!auj", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference2;

	@OriginalMember(owner = "client!auj", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V")
	Class93_Sub1_Sub19_Sub2(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!auj", name = "k", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23976() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23974() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "l", descriptor = "()Z")
	@Override
	boolean method23978() {
		return true;
	}

	@OriginalMember(owner = "client!auj", name = "m", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23979() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "f", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23977() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!auj", name = "w", descriptor = "()Z")
	@Override
	boolean method23973() {
		return true;
	}

	@OriginalMember(owner = "client!auj", name = "n", descriptor = "()Z")
	@Override
	boolean method23975() {
		return true;
	}
}
