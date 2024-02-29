package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agr")
public class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!agr", name = "ti", descriptor = "Lclient!aaj;")
	public static Class12 aClass12_4;

	@OriginalMember(owner = "client!agr", name = "x", descriptor = "Lclient!eu;")
	public static Class106 aClass106_3;

	@OriginalMember(owner = "client!agr", name = "f", descriptor = "([Lclient!hf;I)V", line = 228)
	public static void method8416(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class312 local9 = arg0[local1];
			if (local9.anObjectArray13 != null) {
				@Pc(16) Class93_Sub39 local16 = new Class93_Sub39();
				local16.aClass312_1 = local9;
				local16.anObjectArray4 = local9.anObjectArray13;
				Class689.method36523(local16, 5000000, 1728468786);
			}
		}
	}

	@OriginalMember(owner = "client!agr", name = "<init>", descriptor = "(Lclient!py;I)V", line = 328)
	Class118_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!agr", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 332)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class322(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agr", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 332)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class322(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agr", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 332)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class322(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agr", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 332)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class322(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agr", name = "x", descriptor = "()Ljava/lang/Class;", line = 336)
	@Override
	public Class method27705() {
		return Class322.class;
	}

	@OriginalMember(owner = "client!agr", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 336)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class322.class;
	}
}
