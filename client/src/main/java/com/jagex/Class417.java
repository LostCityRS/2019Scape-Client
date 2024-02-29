package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class417 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!lr;")
	Interface37 anInterface37_22;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	boolean aBoolean756;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!lr;")
	Interface37 anInterface37_23;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Z")
	boolean aBoolean755;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V", line = 3524)
	Class417(@OriginalArg(0) boolean arg0) {
		this.aBoolean755 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "()Z", line = 3529)
	boolean method28699() {
		return this.aBoolean756 && !this.aBoolean755;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "()Z", line = 3529)
	boolean method28700() {
		return this.aBoolean756 && !this.aBoolean755;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "()Z", line = 3529)
	boolean method28701() {
		return this.aBoolean756 && !this.aBoolean755;
	}

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "()Z", line = 3529)
	boolean method28702() {
		return this.aBoolean756 && !this.aBoolean755;
	}

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "()V", line = 3533)
	void method28703() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method30884();
		}
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "()V", line = 3533)
	void method28704() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method30884();
		}
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "()V", line = 3533)
	void method28705() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method30884();
		}
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "()V", line = 3533)
	void method28706() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method30884();
		}
		this.aBoolean756 = false;
	}
}
