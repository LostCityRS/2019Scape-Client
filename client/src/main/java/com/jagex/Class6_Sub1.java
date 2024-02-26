package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aob")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aob", name = "h", descriptor = "Lclient!alf;")
	Class120_Sub1 aClass120_Sub1_19;

	@OriginalMember(owner = "client!aob", name = "t", descriptor = "(II)Ljava/lang/String;")
	public static String method23670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!aob", name = "<init>", descriptor = "(Lclient!alf;Z)V")
	Class6_Sub1(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass120_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!aob", name = "ag", descriptor = "(Lclient!fe;I)V")
	@Override
	final void method23610(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_19, (byte) -76);
	}

	@OriginalMember(owner = "client!aob", name = "ay", descriptor = "(Lclient!fe;II)V")
	@Override
	final void method23604(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_19, (byte) -56);
	}

	@OriginalMember(owner = "client!aob", name = "aj", descriptor = "(Lclient!fe;I)V")
	@Override
	final void method23608(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_19, (byte) -60);
	}

	@OriginalMember(owner = "client!aob", name = "ab", descriptor = "(Lclient!fe;I)V")
	@Override
	final void method23611(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_19, (byte) -106);
	}

	@OriginalMember(owner = "client!aob", name = "ac", descriptor = "(Lclient!fe;I)V")
	@Override
	final void method23609(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_19, (byte) -91);
	}
}
