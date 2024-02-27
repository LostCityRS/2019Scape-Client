package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqg")
public final class Class93_Sub35_Sub2 extends Class93_Sub35 {

	@OriginalMember(owner = "client!aqg", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!aqg", name = "<init>", descriptor = "(I)V")
	Class93_Sub35_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqg", name = "e", descriptor = "()V")
	void method19720() {
		this.aNativeHeap5.method27848();
	}

	@OriginalMember(owner = "client!aqg", name = "n", descriptor = "()V")
	void method19721() {
		this.aNativeHeap5.method27848();
	}
}
