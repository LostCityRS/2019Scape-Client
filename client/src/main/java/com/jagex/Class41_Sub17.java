package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aov")
public final class Class41_Sub17 extends Class41 {

	@OriginalMember(owner = "client!aov", name = "g", descriptor = "I")
	public static final int anInt2459 = 64;

	@OriginalMember(owner = "client!aov", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Ljava/util/Map;)V")
	public Class41_Sub17(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Map arg3) {
		super(arg0, arg1, arg2, Class664.aClass664_95, 64, new Class132_Sub1(arg3));
	}
}
