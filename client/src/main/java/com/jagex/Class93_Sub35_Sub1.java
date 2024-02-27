package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqa")
public final class Class93_Sub35_Sub1 extends Class93_Sub35 {

	@OriginalMember(owner = "client!aqa", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!aqa", name = "<init>", descriptor = "(I)V")
	Class93_Sub35_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqa", name = "f", descriptor = "()V")
	void method18368() {
		this.aNativeHeap3.method27848();
	}

	@OriginalMember(owner = "client!aqa", name = "e", descriptor = "()V")
	void method18369() {
		this.aNativeHeap3.method27848();
	}

	@OriginalMember(owner = "client!aqa", name = "n", descriptor = "()V")
	void method18370() {
		this.aNativeHeap3.method27848();
	}

	@OriginalMember(owner = "client!aqa", name = "m", descriptor = "()V")
	void method18371() {
		this.aNativeHeap3.method27848();
	}

	@OriginalMember(owner = "client!aqa", name = "k", descriptor = "()V")
	void method18372() {
		this.aNativeHeap3.method27848();
	}
}
