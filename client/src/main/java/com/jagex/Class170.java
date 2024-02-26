package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class170 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	int anInt3080;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	int anInt3081;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	int anInt3082;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "I")
	int anInt3083;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	Class170() {
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!as;)V")
	Class170(@OriginalArg(0) Class170 arg0) {
		this.anInt3081 = arg0.anInt3081;
		this.anInt3082 = arg0.anInt3082;
		this.anInt3080 = arg0.anInt3080;
		this.anInt3083 = arg0.anInt3083;
	}
}
