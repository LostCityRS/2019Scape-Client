package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aps")
public abstract class Class108_Sub1_Sub1 extends Class108_Sub1 {

	@OriginalMember(owner = "client!aps", name = "f", descriptor = "Lclient!afa;")
	Class102_Sub1 aClass102_Sub1_33;

	@OriginalMember(owner = "client!aps", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class108_Sub1_Sub1(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_33 = arg0;
	}

	@OriginalMember(owner = "client!aps", name = "ao", descriptor = "()V")
	final void method23913() {
		if (this.aClass102_Sub1_33.method20677(1254466577) == this) {
			this.aClass102_Sub1_33.method21461();
		}
	}

	@OriginalMember(owner = "client!aps", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		this.aClass102_Sub1_33.method21159();
		return true;
	}

	@OriginalMember(owner = "client!aps", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		this.aClass102_Sub1_33.method21159();
		return true;
	}

	@OriginalMember(owner = "client!aps", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		this.aClass102_Sub1_33.method21159();
		return true;
	}

	@OriginalMember(owner = "client!aps", name = "aj", descriptor = "()V")
	final void method23914() {
		if (this.aClass102_Sub1_33.method20677(935466978) == this) {
			this.aClass102_Sub1_33.method21461();
		}
	}
}
