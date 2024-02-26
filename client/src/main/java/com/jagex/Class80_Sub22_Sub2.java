package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqz")
public final class Class80_Sub22_Sub2 extends Class80_Sub22 {

	@OriginalMember(owner = "client!aqz", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!aqz", name = "<init>", descriptor = "(I)V")
	Class80_Sub22_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqz", name = "f", descriptor = "()V")
	void method21676() {
		this.aNativeHeap6.e();
	}

	@OriginalMember(owner = "client!aqz", name = "t", descriptor = "()V")
	void method21677() {
		this.aNativeHeap6.e();
	}

	@OriginalMember(owner = "client!aqz", name = "e", descriptor = "()V")
	void method21678() {
		this.aNativeHeap6.e();
	}
}
