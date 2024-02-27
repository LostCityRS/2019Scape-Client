package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atm")
public final class Class93_Sub1_Sub12_Sub2 extends Class93_Sub1_Sub12 {

	@OriginalMember(owner = "client!atm", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference1;

	@OriginalMember(owner = "client!atm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class93_Sub1_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!atm", name = "k", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23557() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "n", descriptor = "(I)Z")
	@Override
	boolean method23556(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atm", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	Object method23555(@OriginalArg(0) byte arg0) {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "m", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23558() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "f", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23554() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "w", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23559() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "l", descriptor = "()Z")
	@Override
	boolean method23560() {
		return true;
	}
}
