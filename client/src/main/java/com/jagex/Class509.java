package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class Class509 implements Interface75 {

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	static int anInt5206;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!ql;")
	static final Class509 aClass509_3 = new Class509(0);

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!ql;")
	static final Class509 aClass509_2 = new Class509(1);

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!ql;")
	static final Class509 aClass509_1 = new Class509(2);

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	final int anInt5205;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "()[Lclient!ql;", line = 14)
	public static Class509[] method30237() {
		return new Class509[] { aClass509_1, aClass509_3, aClass509_2 };
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "()[Lclient!ql;", line = 14)
	public static Class509[] method30238() {
		return new Class509[] { aClass509_1, aClass509_3, aClass509_2 };
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "(II)V", line = 16)
	public static void method30239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class32.method17827(arg0, 1053859546);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V", line = 17)
	Class509(@OriginalArg(0) int arg0) {
		this.anInt5205 = arg0 * -842351179;
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "()I", line = 22)
	@Override
	public int getId() {
		return this.anInt5205 * 2001471645;
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5205 * 2001471645;
	}

	@OriginalMember(owner = "client!ql", name = "ajk", descriptor = "(Lclient!yf;I)V", line = 11420)
	static final void method30240(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		arg0.anInt5888 -= 957530791;
	}

	@OriginalMember(owner = "client!ql", name = "amj", descriptor = "(Lclient!yf;I)V", line = 12174)
	static final void method30241(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class11.method180(-2122244561);
	}
}
