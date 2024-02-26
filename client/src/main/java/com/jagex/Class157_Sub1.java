package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aln")
public final class Class157_Sub1 extends Class157 {

	@OriginalMember(owner = "client!aln", name = "w", descriptor = "Lclient!afs;")
	static Class109_Sub2 aClass109_Sub2_1;

	@OriginalMember(owner = "client!aln", name = "m", descriptor = "[I")
	static int[] anIntArray200;

	@OriginalMember(owner = "client!aln", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class157_Sub1(@OriginalArg(0) Class480 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aln", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class684(arg0, this);
	}

	@OriginalMember(owner = "client!aln", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class684(arg0, this);
	}

	@OriginalMember(owner = "client!aln", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class684.class;
	}

	@OriginalMember(owner = "client!aln", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class684.class;
	}

	@OriginalMember(owner = "client!aln", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class684.class;
	}

	@OriginalMember(owner = "client!aln", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class684(arg0, this);
	}

	@OriginalMember(owner = "client!aln", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class684(arg0, this);
	}

	@OriginalMember(owner = "client!aln", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class684(arg0, this);
	}
}
