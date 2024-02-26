package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aol")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!aol", name = "t", descriptor = "([BB)Ljava/lang/String;")
	public static String method17381(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		return Class432.method29095(arg0, 0, arg0.length, 1861966420);
	}

	@OriginalMember(owner = "client!aol", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;ZLclient!pf;Lclient!an;)V")
	Class37_Sub1(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class480 arg3, @OriginalArg(4) Interface12 arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aol", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class43(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aol", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class43.class;
	}

	@OriginalMember(owner = "client!aol", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class43.class;
	}

	@OriginalMember(owner = "client!aol", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class43.class;
	}

	@OriginalMember(owner = "client!aol", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class43(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aol", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class43(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aol", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class43(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aol", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class43(arg0, arg1, this);
	}
}
