package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class418 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!lx;")
	Interface38 anInterface38_21;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!lx;")
	Interface38 anInterface38_22;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
	boolean aBoolean860;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Z")
	boolean aBoolean859;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Z)V")
	Class418(@OriginalArg(0) boolean arg0) {
		this.aBoolean859 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "()V")
	void method28994() {
		if (this.anInterface38_22 != null) {
			this.anInterface38_22.method30837();
		}
		this.aBoolean860 = false;
	}

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "()Z")
	boolean method28995() {
		return this.aBoolean860 && !this.aBoolean859;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "()Z")
	boolean method28996() {
		return this.aBoolean860 && !this.aBoolean859;
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "()Z")
	boolean method28997() {
		return this.aBoolean860 && !this.aBoolean859;
	}
}
