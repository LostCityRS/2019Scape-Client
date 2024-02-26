package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apl")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!apl", name = "t", descriptor = "(I)V")
	public static void method18186(@OriginalArg(0) int arg0) {
		Class365.aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 20385);
		Class305.method27205(-1236463393);
		Class365.aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, -534910436);
	}

	@OriginalMember(owner = "client!apl", name = "<init>", descriptor = "(Lclient!pf;I)V")
	Class71_Sub1(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!apl", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class57(arg0, this);
	}

	@OriginalMember(owner = "client!apl", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class57(arg0, this);
	}

	@OriginalMember(owner = "client!apl", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class57.class;
	}

	@OriginalMember(owner = "client!apl", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class57.class;
	}

	@OriginalMember(owner = "client!apl", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class57.class;
	}

	@OriginalMember(owner = "client!apl", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class57(arg0, this);
	}

	@OriginalMember(owner = "client!apl", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class57(arg0, this);
	}

	@OriginalMember(owner = "client!apl", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class57(arg0, this);
	}
}
