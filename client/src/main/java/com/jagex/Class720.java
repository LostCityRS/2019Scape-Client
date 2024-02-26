package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zw")
public final class Class720 {

	@OriginalMember(owner = "client!zw", name = "t", descriptor = "Lclient!zw;")
	public static final Class720 aClass720_3 = new Class720();

	@OriginalMember(owner = "client!zw", name = "f", descriptor = "Lclient!zw;")
	public static final Class720 aClass720_2 = new Class720();

	@OriginalMember(owner = "client!zw", name = "e", descriptor = "Lclient!zw;")
	static final Class720 aClass720_1 = new Class720();

	@OriginalMember(owner = "client!zw", name = "bez", descriptor = "(Lclient!yp;B)V")
	static void method37295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!zw", name = "t", descriptor = "(Lclient!yp;I)V")
	static void method37296(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class486.method30065(-477454678);
	}

	@OriginalMember(owner = "client!zw", name = "<init>", descriptor = "()V")
	Class720() {
	}
}
