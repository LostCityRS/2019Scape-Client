package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ly")
public final class Class409 {

	@OriginalMember(owner = "client!ly", name = "u", descriptor = "Lclient!mv;")
	Interface44 anInterface44_7;

	@OriginalMember(owner = "client!ly", name = "t", descriptor = "Z")
	boolean aBoolean857;

	@OriginalMember(owner = "client!ly", name = "e", descriptor = "Lclient!mv;")
	Interface44 anInterface44_8;

	@OriginalMember(owner = "client!ly", name = "f", descriptor = "Z")
	boolean aBoolean856;

	@OriginalMember(owner = "client!ly", name = "<init>", descriptor = "(Z)V")
	Class409(@OriginalArg(0) boolean arg0) {
		this.aBoolean856 = arg0;
	}

	@OriginalMember(owner = "client!ly", name = "u", descriptor = "()V")
	void method28956() {
		if (this.anInterface44_7 != null) {
			this.anInterface44_7.method30837();
		}
		this.aBoolean857 = false;
	}

	@OriginalMember(owner = "client!ly", name = "t", descriptor = "()Z")
	boolean method28957() {
		return this.aBoolean857 && !this.aBoolean856;
	}

	@OriginalMember(owner = "client!ly", name = "f", descriptor = "()V")
	void method28958() {
		if (this.anInterface44_7 != null) {
			this.anInterface44_7.method30837();
		}
		this.aBoolean857 = false;
	}

	@OriginalMember(owner = "client!ly", name = "e", descriptor = "()Z")
	boolean method28959() {
		return this.aBoolean857 && !this.aBoolean856;
	}

	@OriginalMember(owner = "client!ly", name = "l", descriptor = "()V")
	void method28960() {
		if (this.anInterface44_7 != null) {
			this.anInterface44_7.method30837();
		}
		this.aBoolean857 = false;
	}
}
