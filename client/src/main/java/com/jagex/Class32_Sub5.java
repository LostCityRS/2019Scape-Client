package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aof")
public final class Class32_Sub5 extends Class32 {

	@OriginalMember(owner = "client!aof", name = "w", descriptor = "Lclient!vr;")
	public static Class622 aClass622_1 = new Class622(-1);

	@OriginalMember(owner = "client!aof", name = "ace", descriptor = "(Lclient!yf;I)V")
	static void method16771(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4807 * 1519535973;
	}

	@OriginalMember(owner = "client!aof", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V")
	public Class32_Sub5(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_49, 64, new Class52(Class622.class));
	}
}
