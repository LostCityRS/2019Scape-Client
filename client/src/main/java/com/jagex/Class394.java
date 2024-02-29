package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class Class394 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!ml;")
	Interface40 anInterface40_5;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
	boolean aBoolean744;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!ml;")
	Interface40 anInterface40_6;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	boolean aBoolean745;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Z)V", line = 3544)
	Class394(@OriginalArg(0) boolean arg0) {
		this.aBoolean745 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()Z", line = 3549)
	boolean method28324() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "()Z", line = 3549)
	boolean method28325() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()Z", line = 3549)
	boolean method28326() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()Z", line = 3549)
	boolean method28327() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "()Z", line = 3549)
	boolean method28328() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "()Z", line = 3549)
	boolean method28329() {
		return this.aBoolean744 && !this.aBoolean745;
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "()V", line = 3553)
	void method28330() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method30884();
		}
		this.aBoolean744 = false;
	}

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "()V", line = 3553)
	void method28331() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method30884();
		}
		this.aBoolean744 = false;
	}

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "()V", line = 3553)
	void method28332() {
		if (this.anInterface40_5 != null) {
			this.anInterface40_5.method30884();
		}
		this.aBoolean744 = false;
	}
}
