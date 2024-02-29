package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqa")
public class Class93_Sub35_Sub1 extends Class93_Sub35 {

	@OriginalMember(owner = "client!aqa", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!aqa", name = "<init>", descriptor = "(I)V", line = 9)
	Class93_Sub35_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqa", name = "f", descriptor = "()V", line = 14)
	void method18356() {
		this.aNativeHeap3.m();
	}

	@OriginalMember(owner = "client!aqa", name = "e", descriptor = "()V", line = 14)
	void method18357() {
		this.aNativeHeap3.m();
	}

	@OriginalMember(owner = "client!aqa", name = "n", descriptor = "()V", line = 14)
	void method18358() {
		this.aNativeHeap3.m();
	}

	@OriginalMember(owner = "client!aqa", name = "m", descriptor = "()V", line = 14)
	void method18359() {
		this.aNativeHeap3.m();
	}

	@OriginalMember(owner = "client!aqa", name = "k", descriptor = "()V", line = 14)
	void method18360() {
		this.aNativeHeap3.m();
	}
}
