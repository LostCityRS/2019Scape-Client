package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqx")
public final class Class80_Sub22_Sub1 extends Class80_Sub22 {

	@OriginalMember(owner = "client!aqx", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!aqx", name = "<init>", descriptor = "(I)V")
	Class80_Sub22_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqx", name = "t", descriptor = "()V")
	void method21611() {
		this.aNativeHeap5.e();
	}

	@OriginalMember(owner = "client!aqx", name = "f", descriptor = "()V")
	void method21612() {
		this.aNativeHeap5.e();
	}

	@OriginalMember(owner = "client!aqx", name = "e", descriptor = "()V")
	void method21613() {
		this.aNativeHeap5.e();
	}
}
