package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ala")
public final class Class151_Sub1 extends Class151 implements Interface3 {

	@OriginalMember(owner = "client!ala", name = "qa", descriptor = "(Lclient!yp;I)V")
	static void method14553(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2048755489);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class200.method24931(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class151_Sub1(@OriginalArg(0) Class480 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ala", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class602(arg0, this);
	}

	@OriginalMember(owner = "client!ala", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class602(arg0, this);
	}

	@OriginalMember(owner = "client!ala", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class602.class;
	}

	@OriginalMember(owner = "client!ala", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class602.class;
	}

	@OriginalMember(owner = "client!ala", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class602.class;
	}

	@OriginalMember(owner = "client!ala", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class602(arg0, this);
	}

	@OriginalMember(owner = "client!ala", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class602(arg0, this);
	}

	@OriginalMember(owner = "client!ala", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class602(arg0, this);
	}
}
