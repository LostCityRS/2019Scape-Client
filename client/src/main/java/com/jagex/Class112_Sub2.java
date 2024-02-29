package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afy")
public abstract class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "()V", line = 4)
	Class112_Sub2() {
	}

	@OriginalMember(owner = "client!afy", name = "e", descriptor = "(I)[Lclient!ev;", line = 19)
	static Class252[] method23754(@OriginalArg(0) int arg0) {
		return new Class252[] { Class252.aClass252_3, Class252.aClass252_7, Class252.aClass252_5, Class252.aClass252_2, Class252.aClass252_6, Class252.aClass252_4, Class252.aClass252_1 };
	}

	@OriginalMember(owner = "client!afy", name = "g", descriptor = "(II)I")
	public abstract int method23755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "a", descriptor = "()I")
	public abstract int method23756();

	@OriginalMember(owner = "client!afy", name = "j", descriptor = "(II)V")
	abstract void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "i", descriptor = "(II)V")
	abstract void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "t", descriptor = "(II)V")
	abstract void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "ae", descriptor = "()I")
	public abstract int method23760();

	@OriginalMember(owner = "client!afy", name = "ag", descriptor = "(II)I")
	public abstract int method23761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
