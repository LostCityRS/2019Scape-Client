package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class172 {

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	int anInt3269;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	int anInt3270;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "I")
	int anInt3271;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	Class172() {
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!au;)V")
	Class172(@OriginalArg(0) Class172 arg0) {
		this.anInt3271 = arg0.anInt3271;
		this.anInt3270 = arg0.anInt3270;
		this.anInt3269 = arg0.anInt3269;
	}
}
