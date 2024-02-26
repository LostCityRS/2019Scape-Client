package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abe")
public final class Class31 implements Interface75 {

	@OriginalMember(owner = "client!abe", name = "t", descriptor = "Lclient!abe;")
	public static final Class31 aClass31_1 = new Class31(1, 0);

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "Lclient!abe;")
	public static final Class31 aClass31_4 = new Class31(2, 1);

	@OriginalMember(owner = "client!abe", name = "e", descriptor = "Lclient!abe;")
	public static final Class31 aClass31_2 = new Class31(0, 2);

	@OriginalMember(owner = "client!abe", name = "u", descriptor = "Lclient!abe;")
	public static final Class31 aClass31_3 = new Class31(3, 3);

	@OriginalMember(owner = "client!abe", name = "l", descriptor = "I")
	public final int anInt104;

	@OriginalMember(owner = "client!abe", name = "g", descriptor = "I")
	final int anInt103;

	@OriginalMember(owner = "client!abe", name = "bex", descriptor = "(Lclient!yp;I)V")
	static void method682(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!abe", name = "<init>", descriptor = "(II)V")
	Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt104 = arg0 * -1707174785;
		this.anInt103 = arg1 * -2119092487;
	}

	@OriginalMember(owner = "client!abe", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt103 * -1887982775;
	}

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt103 * -1887982775;
	}

	@OriginalMember(owner = "client!abe", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt103 * -1887982775;
	}
}
