package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class394 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!ml;")
	Interface40 anInterface40_5;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
	boolean aBoolean753;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!ml;")
	Interface40 anInterface40_6;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	boolean aBoolean754;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Z)V")
	Class394(@OriginalArg(0) boolean arg0) {
		this.aBoolean754 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "()V")
	void method28505() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method31065();
		}
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()Z")
	boolean method28506() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "()Z")
	boolean method28507() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()Z")
	boolean method28508() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()Z")
	boolean method28509() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "()V")
	void method28510() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method31065();
		}
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "()Z")
	boolean method28511() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "()Z")
	boolean method28512() {
		return this.aBoolean753 && !this.aBoolean754;
	}

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "()V")
	void method28513() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method31065();
		}
		this.aBoolean753 = false;
	}
}
