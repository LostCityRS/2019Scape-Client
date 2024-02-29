package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajb")
public class Class148_Sub1 extends Class148 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ajb", name = "this$0", descriptor = "Lclient!sb;")
	final Class545 this$0;

	@OriginalMember(owner = "client!ajb", name = "e", descriptor = "(Lclient!alw;I)Lclient!kj;", line = 13)
	public static Class381 method11759(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22483(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!ajb", name = "<init>", descriptor = "(Lclient!sb;)V", line = 74)
	Class148_Sub1(@OriginalArg(0) Class545 arg0) {
		super(arg0);
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ajb", name = "m", descriptor = "(II)V", line = 140)
	static void method11760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class330.anInt4146 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25847((byte) -33);
		}
	}
}
