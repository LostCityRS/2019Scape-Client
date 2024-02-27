package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ya")
public final class Class677 {

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "Lclient!hq;")
	Class320 aClass320_4;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!hf;")
	Class312 aClass312_13;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "()V")
	Class677() {
	}

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "(II)Z")
	boolean method33405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1, (byte) -99);
		if (local4 == null) {
			this.method33407(333094627);
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "(III)Z")
	boolean method33406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1, (byte) -14);
		if (local4 == null) {
			this.method33407(527430007);
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "(I)V")
	void method33407(@OriginalArg(0) int arg0) {
		this.aClass320_4 = null;
		this.aClass312_13 = null;
	}

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()Lclient!hf;")
	Class312 method33408() {
		return this.aClass320_4.method27321(this.aClass312_13.anInt3994 * -1549590237, -406199529);
	}

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)Lclient!hf;")
	Class312 method33409(@OriginalArg(0) int arg0) {
		return this.aClass320_4.method27321(this.aClass312_13.anInt3994 * -1549590237, -188544182);
	}

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lclient!hf;")
	Class312 method33410() {
		return this.aClass320_4.method27321(this.aClass312_13.anInt3994 * -1549590237, -550013923);
	}

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "(II)Z")
	boolean method33411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg0, arg1, (byte) 68);
		if (local4 == null) {
			this.method33407(2133098333);
			return false;
		} else {
			this.aClass320_4 = Class166_Sub1.aClass320Array1[arg0 >> 16];
			this.aClass312_13 = local4;
			return true;
		}
	}
}
