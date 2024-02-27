package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afy")
public abstract class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!afy", name = "e", descriptor = "(I)[Lclient!ev;")
	static Class252[] method23773(@OriginalArg(0) int arg0) {
		return new Class252[] { Class252.aClass252_3, Class252.aClass252_7, Class252.aClass252_5, Class252.aClass252_2, Class252.aClass252_6, Class252.aClass252_4, Class252.aClass252_1 };
	}

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "()V")
	Class112_Sub2() {
	}

	@OriginalMember(owner = "client!afy", name = "g", descriptor = "(II)I")
	public abstract int method23766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "a", descriptor = "()I")
	public abstract int method23767();

	@OriginalMember(owner = "client!afy", name = "j", descriptor = "(II)V")
	abstract void method23768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "i", descriptor = "(II)V")
	abstract void method23769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "t", descriptor = "(II)V")
	abstract void method23770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afy", name = "ae", descriptor = "()I")
	public abstract int method23771();

	@OriginalMember(owner = "client!afy", name = "ag", descriptor = "(II)I")
	public abstract int method23772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
