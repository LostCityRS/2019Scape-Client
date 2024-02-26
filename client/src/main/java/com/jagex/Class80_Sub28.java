package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akr")
public abstract class Class80_Sub28 extends Class80 {

	@OriginalMember(owner = "client!akr", name = "lb", descriptor = "(Lclient!yp;I)V")
	static void method22228(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1994289421);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class607.method32182(local16, local22, arg0, 16711680);
	}

	@OriginalMember(owner = "client!akr", name = "<init>", descriptor = "()V")
	Class80_Sub28() {
	}

	@OriginalMember(owner = "client!akr", name = "f", descriptor = "(Lclient!kf;I)V")
	abstract void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!akr", name = "t", descriptor = "(Lclient!ald;B)V")
	abstract void method22223(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "(Lclient!ald;)V")
	abstract void method22224(@OriginalArg(0) Class80_Sub36 arg0);

	@OriginalMember(owner = "client!akr", name = "e", descriptor = "(Lclient!ald;)V")
	abstract void method22225(@OriginalArg(0) Class80_Sub36 arg0);

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "(Lclient!ald;)V")
	abstract void method22226(@OriginalArg(0) Class80_Sub36 arg0);

	@OriginalMember(owner = "client!akr", name = "g", descriptor = "(Lclient!kf;)V")
	abstract void method22227(@OriginalArg(0) Class378 arg0);
}
