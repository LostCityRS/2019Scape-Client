package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
final class Class264 implements Interface43 {

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	static int anInt3914;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fh", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_5;

	@OriginalMember(owner = "client!fh", name = "pv", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26644(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2132267516) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray12 = Class431.method29089(local13, arg2, 2010112465);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class264(@OriginalArg(0) Class263 arg0) {
		this.aClass263_5 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "()F")
	@Override
	public float method26842() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -47) / 255.0F;
	}

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "(I)F")
	@Override
	public float method26841(@OriginalArg(0) int arg0) {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -7) / 255.0F;
	}

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "()F")
	@Override
	public float method26843() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) 85) / 255.0F;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "()F")
	@Override
	public float method26840() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -29) / 255.0F;
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "()F")
	@Override
	public float method26844() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -61) / 255.0F;
	}
}
