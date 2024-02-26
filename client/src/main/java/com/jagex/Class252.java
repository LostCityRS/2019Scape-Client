package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class252 {

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!eu;")
	static final Class252 aClass252_4 = new Class252();

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!eu;")
	static final Class252 aClass252_3 = new Class252();

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "Lclient!eu;")
	static final Class252 aClass252_2 = new Class252();

	@OriginalMember(owner = "client!eu", name = "jd", descriptor = "(Lclient!yp;I)V")
	static void method26375(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!eu", name = "aqf", descriptor = "(Lclient!yp;S)V")
	static void method26376(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	Class252() {
	}
}
