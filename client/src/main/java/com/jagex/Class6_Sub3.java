package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aos")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!aos", name = "h", descriptor = "Z")
	public boolean aBoolean429 = false;

	@OriginalMember(owner = "client!aos", name = "d", descriptor = "Lclient!ahb;")
	Class120_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aos", name = "f", descriptor = "(II)V")
	public static void method17694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class80_Sub3.method12784(arg0, (byte) -62);
	}

	@OriginalMember(owner = "client!aos", name = "<init>", descriptor = "(Lclient!ahb;Z)V")
	Class6_Sub3(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass120_Sub1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!aos", name = "aj", descriptor = "(Lclient!fe;I)V")
	@Override
	void method23608(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean429 || !this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23590(-499060808) || this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23589((byte) 21)) {
			Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_Sub1_Sub1_2, (byte) -5);
		}
	}

	@OriginalMember(owner = "client!aos", name = "ay", descriptor = "(Lclient!fe;II)V")
	@Override
	void method23604(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean429 || !this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23590(-499060808) || this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23589((byte) 15)) {
			Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_Sub1_Sub1_2, (byte) -62);
		}
	}

	@OriginalMember(owner = "client!aos", name = "ac", descriptor = "(Lclient!fe;I)V")
	@Override
	void method23609(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean429 || !this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23590(-499060808) || this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23589((byte) 31)) {
			Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_Sub1_Sub1_2, (byte) -61);
		}
	}

	@OriginalMember(owner = "client!aos", name = "ag", descriptor = "(Lclient!fe;I)V")
	@Override
	void method23610(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean429 || !this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23590(-499060808) || this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23589((byte) 77)) {
			Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_Sub1_Sub1_2, (byte) -113);
		}
	}

	@OriginalMember(owner = "client!aos", name = "ab", descriptor = "(Lclient!fe;I)V")
	@Override
	void method23611(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean429 || !this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23590(-499060808) || this.aClass120_Sub1_Sub1_Sub1_2.aClass6_3.method23589((byte) 49)) {
			Class490.aClass263_13.method26549(arg0, arg1, this.aClass120_Sub1_Sub1_Sub1_2, (byte) -94);
		}
	}
}
