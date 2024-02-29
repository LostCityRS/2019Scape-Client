package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alm")
public abstract class Class93_Sub38 extends Class93 {

	@OriginalMember(owner = "client!alm", name = "f", descriptor = "I")
	protected static final int anInt3093 = 4096;

	@OriginalMember(owner = "client!alm", name = "u", descriptor = "I")
	protected static final int anInt3094 = 4095;

	@OriginalMember(owner = "client!alm", name = "l", descriptor = "I")
	protected static final int anInt3095 = 2048;

	@OriginalMember(owner = "client!alm", name = "k", descriptor = "I")
	protected static final int anInt3096 = 12;

	@OriginalMember(owner = "client!alm", name = "w", descriptor = "I")
	protected static final int anInt3097 = 8192;

	@OriginalMember(owner = "client!alm", name = "z", descriptor = "F")
	public static final float aFloat225 = 4096.0F;

	@OriginalMember(owner = "client!alm", name = "<init>", descriptor = "(IZ)V", line = 13)
	Class93_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!alm", name = "wc", descriptor = "(Lclient!yf;B)V", line = 9045)
	static final void method22781(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class14.method193(local13, local23, false, -109844901);
	}
}
