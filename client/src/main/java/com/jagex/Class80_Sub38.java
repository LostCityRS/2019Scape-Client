package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alh")
public abstract class Class80_Sub38 extends Class80 {

	@OriginalMember(owner = "client!alh", name = "l", descriptor = "I")
	protected static final int anInt3122 = 4096;

	@OriginalMember(owner = "client!alh", name = "i", descriptor = "I")
	protected static final int anInt3123 = 2048;

	@OriginalMember(owner = "client!alh", name = "g", descriptor = "I")
	protected static final int anInt3124 = 8192;

	@OriginalMember(owner = "client!alh", name = "m", descriptor = "I")
	protected static final int anInt3125 = 4095;

	@OriginalMember(owner = "client!alh", name = "u", descriptor = "I")
	protected static final int anInt3126 = 12;

	@OriginalMember(owner = "client!alh", name = "o", descriptor = "F")
	public static final float aFloat234 = 4096.0F;

	@OriginalMember(owner = "client!alh", name = "ac", descriptor = "(I)V")
	public static void method22943(@OriginalArg(0) int arg0) {
		Class622.aClass99_38 = null;
	}

	@OriginalMember(owner = "client!alh", name = "ob", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method22944(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1682332183) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray41 = Class431.method29089(local13, arg2, 1187108410);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!alh", name = "<init>", descriptor = "(IZ)V")
	Class80_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
	}
}
