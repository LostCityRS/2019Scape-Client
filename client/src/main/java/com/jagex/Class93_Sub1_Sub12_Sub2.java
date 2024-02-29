package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atm")
public class Class93_Sub1_Sub12_Sub2 extends Class93_Sub1_Sub12 {

	@OriginalMember(owner = "client!atm", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference1;

	@OriginalMember(owner = "client!atm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 10)
	Class93_Sub1_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!atm", name = "k", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23545() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 15)
	@Override
	Object method23543(@OriginalArg(0) byte arg0) {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "m", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23546() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "f", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23542() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "w", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23547() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!atm", name = "n", descriptor = "(I)Z", line = 19)
	@Override
	boolean method23544(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atm", name = "l", descriptor = "()Z", line = 19)
	@Override
	boolean method23548() {
		return true;
	}
}
