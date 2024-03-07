package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acw")
public class Class72 implements Interface75 {

	@OriginalMember(owner = "client!acw", name = "ln", descriptor = "I")
	public static int anInt241;

	@OriginalMember(owner = "client!acw", name = "hv", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_2;

	@OriginalMember(owner = "client!acw", name = "e", descriptor = "Lclient!acw;")
	public static final Class72 aClass72_1 = new Class72(0);

	@OriginalMember(owner = "client!acw", name = "n", descriptor = "Lclient!acw;")
	public static final Class72 aClass72_2 = new Class72(1);

	@OriginalMember(owner = "client!acw", name = "m", descriptor = "I")
	final int anInt240;

	@OriginalMember(owner = "client!acw", name = "<init>", descriptor = "(I)V", line = 10)
	Class72(@OriginalArg(0) int arg0) {
		this.anInt240 = arg0 * -1850367747;
	}

	@OriginalMember(owner = "client!acw", name = "n", descriptor = "()I", line = 15)
	@Override
	public int getId() {
		return this.anInt240 * 1422097493;
	}

	@OriginalMember(owner = "client!acw", name = "k", descriptor = "()I", line = 15)
	@Override
	public int method36919() {
		return this.anInt240 * 1422097493;
	}

	@OriginalMember(owner = "client!acw", name = "bde", descriptor = "(Lclient!yf;B)V", line = 14708)
	static final void method1253(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class78.method1315(Class159_Sub1.anInt1948 * -1131450757, -460060699);
	}
}
