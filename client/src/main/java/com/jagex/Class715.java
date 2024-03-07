package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zr")
public class Class715 implements Interface75 {

	@OriginalMember(owner = "client!zr", name = "e", descriptor = "Lclient!zr;")
	public static final Class715 aClass715_5 = new Class715(-2);

	@OriginalMember(owner = "client!zr", name = "n", descriptor = "Lclient!zr;")
	public static final Class715 aClass715_3 = new Class715(-3);

	@OriginalMember(owner = "client!zr", name = "m", descriptor = "Lclient!zr;")
	static final Class715 aClass715_4 = new Class715(2);

	@OriginalMember(owner = "client!zr", name = "k", descriptor = "Lclient!zr;")
	public static final Class715 aClass715_2 = new Class715(3);

	@OriginalMember(owner = "client!zr", name = "f", descriptor = "Lclient!zr;")
	static final Class715 aClass715_6 = new Class715(4);

	@OriginalMember(owner = "client!zr", name = "w", descriptor = "Lclient!zr;")
	static final Class715 aClass715_7 = new Class715(5);

	@OriginalMember(owner = "client!zr", name = "l", descriptor = "Lclient!zr;")
	static final Class715 aClass715_10 = new Class715(6);

	@OriginalMember(owner = "client!zr", name = "u", descriptor = "Lclient!zr;")
	static final Class715 aClass715_9 = new Class715(7);

	@OriginalMember(owner = "client!zr", name = "z", descriptor = "Lclient!zr;")
	static final Class715 aClass715_8 = new Class715(8);

	@OriginalMember(owner = "client!zr", name = "p", descriptor = "I")
	final int anInt5961;

	@OriginalMember(owner = "client!zr", name = "m", descriptor = "()[Lclient!zr;", line = 20)
	public static Class715[] method36868() {
		return new Class715[] { aClass715_6, aClass715_5, aClass715_2, aClass715_3, aClass715_7, aClass715_10, aClass715_4, aClass715_9, aClass715_8 };
	}

	@OriginalMember(owner = "client!zr", name = "<init>", descriptor = "(I)V", line = 23)
	Class715(@OriginalArg(0) int arg0) {
		this.anInt5961 = arg0 * 770190223;
	}

	@OriginalMember(owner = "client!zr", name = "k", descriptor = "()I", line = 28)
	@Override
	public int method36919() {
		return this.anInt5961 * -2104585361;
	}

	@OriginalMember(owner = "client!zr", name = "n", descriptor = "()I", line = 28)
	@Override
	public int getId() {
		return this.anInt5961 * -2104585361;
	}

	@OriginalMember(owner = "client!zr", name = "f", descriptor = "(Lclient!ec;B)V", line = 87)
	public static void method36869(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class93_Sub1_Sub11 local7 = Class371.method28000(2, (long) (arg0.anInt867 * -1284841473));
		local7.method21885(2145008345);
	}

	@OriginalMember(owner = "client!zr", name = "ada", descriptor = "(Lclient!yf;I)V", line = 10094)
	static final void method36870(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.aByte56;
	}
}
