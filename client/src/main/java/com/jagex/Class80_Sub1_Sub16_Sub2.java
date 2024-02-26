package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atx")
public final class Class80_Sub1_Sub16_Sub2 extends Class80_Sub1_Sub16 {

	@OriginalMember(owner = "client!atx", name = "m", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference1;

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class80_Sub1_Sub16_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!atx", name = "i", descriptor = "()Z")
	@Override
	boolean method24079() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "t", descriptor = "(I)Ljava/lang/Object;")
	@Override
	Object method24083(@OriginalArg(0) int arg0) {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atx", name = "f", descriptor = "(B)Z")
	@Override
	boolean method24077(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24078() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atx", name = "u", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method24080() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "()Z")
	@Override
	boolean method24081() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "g", descriptor = "()Z")
	@Override
	boolean method24082() {
		return true;
	}
}
