package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class417 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!lr;")
	Interface37 anInterface37_22;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	boolean aBoolean765;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!lr;")
	Interface37 anInterface37_23;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Z")
	boolean aBoolean764;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V")
	Class417(@OriginalArg(0) boolean arg0) {
		this.aBoolean764 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "()Z")
	boolean method28880() {
		return this.aBoolean765 && !this.aBoolean764;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "()Z")
	boolean method28881() {
		return this.aBoolean765 && !this.aBoolean764;
	}

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "()V")
	void method28882() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method31065();
		}
		this.aBoolean765 = false;
	}

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "()V")
	void method28883() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method31065();
		}
		this.aBoolean765 = false;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "()Z")
	boolean method28884() {
		return this.aBoolean765 && !this.aBoolean764;
	}

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "()V")
	void method28885() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method31065();
		}
		this.aBoolean765 = false;
	}

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "()Z")
	boolean method28886() {
		return this.aBoolean765 && !this.aBoolean764;
	}

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "()V")
	void method28887() {
		if (this.anInterface37_22 != null) {
			this.anInterface37_22.method31065();
		}
		this.aBoolean765 = false;
	}
}
