package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class Class2 {

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	int anInt2;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	int anInt3;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	int anInt4;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 3285)
	Class2() {
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!aa;)V", line = 3287)
	Class2(@OriginalArg(0) Class2 arg0) {
		this.anInt4 = arg0.anInt4;
		this.anInt2 = arg0.anInt2;
		this.anInt3 = arg0.anInt3;
	}
}
