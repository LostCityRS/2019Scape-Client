package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class Class101 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_24;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Lclient!jaclib/memory/Buffer;")
	Buffer aBuffer3;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!afa;[BI)V", line = 12)
	Class101(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub1_24 = arg0;
		this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.m(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!afa;Lclient!jaclib/memory/Buffer;)V", line = 18)
	Class101(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass104_Sub1_24 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "([BI)V", line = 24)
	void method2773(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "([BI)V", line = 24)
	void method2774(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "([BI)V", line = 24)
	void method2775(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "([BI)V", line = 24)
	void method2776(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "([BI)V", line = 24)
	void method2777(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "([BI)V", line = 24)
	void method2778(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.e() < arg1) {
			this.aBuffer3 = this.aClass104_Sub1_24.aNativeHeap1.n(arg1, false);
		}
		this.aBuffer3.m(arg0, 0, 0, arg1);
	}
}
