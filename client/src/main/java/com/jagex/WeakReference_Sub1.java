package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atp")
public class WeakReference_Sub1 extends WeakReference {

	@OriginalMember(owner = "client!atp", name = "n", descriptor = "Lclient!atp;")
	WeakReference_Sub1 aWeakReference_Sub1_1;

	@OriginalMember(owner = "client!atp", name = "e", descriptor = "I")
	final int anInt3225;

	@OriginalMember(owner = "client!atp", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;ILjava/lang/Object;)V", line = 127)
	WeakReference_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) ReferenceQueue arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		super(arg0, arg1);
		this.anInt3225 = arg2 * 1190737573;
	}
}
