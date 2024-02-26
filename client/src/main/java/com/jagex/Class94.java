package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class Class94 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_14;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!jaclib/memory/Buffer;")
	Buffer aBuffer3;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!afm;Lclient!jaclib/memory/Buffer;)V")
	Class94(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass102_Sub3_14 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!afm;[BI)V")
	Class94(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass102_Sub3_14 = arg0;
		this.aBuffer3 = this.aClass102_Sub3_14.aNativeHeap2.f(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.e(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "([BI)V")
	final void method2085(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.t() < arg1) {
			this.aBuffer3 = this.aClass102_Sub3_14.aNativeHeap2.f(arg1, false);
		}
		this.aBuffer3.e(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "([BI)V")
	final void method2086(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.t() < arg1) {
			this.aBuffer3 = this.aClass102_Sub3_14.aNativeHeap2.f(arg1, false);
		}
		this.aBuffer3.e(arg0, 0, 0, arg1);
	}
}
