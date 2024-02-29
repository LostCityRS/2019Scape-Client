package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agq")
public class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!agq", name = "fz", descriptor = "J")
	static long aLong28;

	@OriginalMember(owner = "client!agq", name = "w", descriptor = "(II)V", line = 92)
	public static void method8385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(3, (long) arg0);
		local4.method21885(2145451004);
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(Lclient!ao;Lclient!py;Lclient!py;Lclient!py;)V", line = 265)
	Class117_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 269)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class263(arg0, this);
	}

	@OriginalMember(owner = "client!agq", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 269)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class263(arg0, this);
	}

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 269)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class263(arg0, this);
	}

	@OriginalMember(owner = "client!agq", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 269)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class263(arg0, this);
	}

	@OriginalMember(owner = "client!agq", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 273)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class263.class;
	}

	@OriginalMember(owner = "client!agq", name = "x", descriptor = "()Ljava/lang/Class;", line = 273)
	@Override
	public Class method27705() {
		return Class263.class;
	}
}
