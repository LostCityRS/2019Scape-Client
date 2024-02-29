package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atl")
public class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "client!atl", name = "v", descriptor = "Lclient!aos;")
	static Class32_Sub17 aClass32_Sub17_24;

	@OriginalMember(owner = "client!atl", name = "n", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!atc;", line = 75)
	public static RuntimeException_Sub1 method23530(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString115 = local5.aString115 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!atl", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 457)
	public RuntimeException_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
