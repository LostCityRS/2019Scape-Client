package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agv")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!agv", name = "l", descriptor = "(Lclient!acv;Ljava/lang/String;ILjava/lang/Throwable;I)V")
	public static void method8671(@OriginalArg(0) Class70 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3, @OriginalArg(4) int arg4) {
		Class130_Sub1.method10205(new Class598(arg0, arg1, arg2, arg3), (byte) -112);
	}

	@OriginalMember(owner = "client!agv", name = "rw", descriptor = "(Lclient!yp;B)V")
	static void method8672(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4082 * 254495303;
	}

	@OriginalMember(owner = "client!agv", name = "<init>", descriptor = "(Lclient!pf;I)V")
	Class115_Sub1(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!agv", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class320(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agv", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class320(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agv", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class320.class;
	}

	@OriginalMember(owner = "client!agv", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class320.class;
	}

	@OriginalMember(owner = "client!agv", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class320(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agv", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class320(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agv", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class320.class;
	}

	@OriginalMember(owner = "client!agv", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class320(arg0, arg1, this);
	}
}
