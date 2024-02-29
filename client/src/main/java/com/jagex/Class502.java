package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public class Class502 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!qc;")
	public static final Class502 aClass502_1 = new Class502(0);

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!qc;")
	static final Class502 aClass502_2 = new Class502(1);

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	final int anInt5200;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 9)
	Class502(@OriginalArg(0) int arg0) {
		this.anInt5200 = arg0 * -1364150943;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 152)
	public static void method30174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(15, (long) arg0);
		local4.method21885(2144007193);
	}

	@OriginalMember(owner = "client!qc", name = "bct", descriptor = "(Lclient!yf;S)V", line = 14679)
	static final void method30175(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
