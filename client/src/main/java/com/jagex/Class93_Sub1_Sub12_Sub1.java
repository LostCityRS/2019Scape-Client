package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ate")
public final class Class93_Sub1_Sub12_Sub1 extends Class93_Sub1_Sub12 {

	@OriginalMember(owner = "client!ate", name = "u", descriptor = "Ljava/lang/Object;")
	Object anObject8;

	@OriginalMember(owner = "client!ate", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class93_Sub1_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!ate", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	Object method23555(@OriginalArg(0) byte arg0) {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "l", descriptor = "()Z")
	@Override
	boolean method23560() {
		return false;
	}

	@OriginalMember(owner = "client!ate", name = "m", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23558() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "k", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23557() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "f", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23554() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "n", descriptor = "(I)Z")
	@Override
	boolean method23556(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ate", name = "w", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23559() {
		return this.anObject8;
	}
}
