package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aor")
public class Class32_Sub16 extends Class32 {

	@OriginalMember(owner = "client!aor", name = "w", descriptor = "I")
	public static final int anInt2413 = 64;

	@OriginalMember(owner = "client!aor", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Ljava/util/Map;)V", line = 18)
	public Class32_Sub16(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Map arg3) {
		super(arg0, arg1, arg2, Class667.aClass667_95, 64, new Class127_Sub1(arg3));
	}
}
