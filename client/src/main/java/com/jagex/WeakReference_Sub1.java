package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@OriginalClass("client!atn")
public final class WeakReference_Sub1 extends WeakReference {

	@OriginalMember(owner = "client!atn", name = "f", descriptor = "Lclient!atn;")
	WeakReference_Sub1 aWeakReference_Sub1_1;

	@OriginalMember(owner = "client!atn", name = "t", descriptor = "I")
	final int anInt3236;

	@OriginalMember(owner = "client!atn", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;ILjava/lang/Object;)V")
	WeakReference_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) ReferenceQueue arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		super(arg0, arg1);
		this.anInt3236 = arg2 * 76901581;
	}
}
