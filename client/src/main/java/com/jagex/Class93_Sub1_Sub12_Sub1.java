package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ate")
public class Class93_Sub1_Sub12_Sub1 extends Class93_Sub1_Sub12 {

	@OriginalMember(owner = "client!ate", name = "u", descriptor = "Ljava/lang/Object;")
	Object anObject8;

	@OriginalMember(owner = "client!ate", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 7)
	Class93_Sub1_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!ate", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 12)
	@Override
	Object method23543(@OriginalArg(0) byte arg0) {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "m", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23546() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "k", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23545() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "f", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23542() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "w", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23547() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!ate", name = "l", descriptor = "()Z", line = 16)
	@Override
	boolean method23548() {
		return false;
	}

	@OriginalMember(owner = "client!ate", name = "n", descriptor = "(I)Z", line = 16)
	@Override
	boolean method23544(@OriginalArg(0) int arg0) {
		return false;
	}
}
