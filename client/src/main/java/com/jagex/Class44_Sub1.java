package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aow")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!aow", name = "l", descriptor = "(Lclient!alw;II)Lclient!asy;", line = 93)
	static Class93_Sub1_Sub20 method17432(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) Class93_Sub1_Sub20 local30 = new Class93_Sub1_Sub20(arg1, arg0.gjstr(1660144684), arg0.gjstr(507085097), arg0.g4(-118643075), arg0.g4(-118643075), arg0.g1((short) 16384) == 1, arg0.g1((short) 16384), arg0.g1((short) 16384));
		@Pc(34) int local34 = arg0.g1((short) 16384);
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass22_42.method408(new Class93_Sub32(arg0.g1((short) 16384), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800)), 156232669);
		}
		local30.method23177((short) -1937);
		return local30;
	}

	@OriginalMember(owner = "client!aow", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;ZLclient!py;Lclient!ao;)V", line = 993)
	Class44_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Interface11 arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aow", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 997)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 997)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 997)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 997)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "x", descriptor = "()Ljava/lang/Class;", line = 1001)
	@Override
	public Class method27705() {
		return Class47.class;
	}

	@OriginalMember(owner = "client!aow", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 1001)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class47.class;
	}

	@OriginalMember(owner = "client!aow", name = "bdn", descriptor = "(Lclient!yf;I)V", line = 14754)
	static final void method17433(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
