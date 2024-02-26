package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atb")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "client!atb", name = "t", descriptor = "(IB)Lclient!jd;")
	static Class358 method23508(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == Class358.aClass358_4.anInt4487 * -1638462787) {
			return Class358.aClass358_4;
		} else if (Class358.aClass358_3.anInt4487 * -1638462787 == arg0) {
			return Class358.aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!atb", name = "u", descriptor = "(I)V")
	public static void method23509(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = Class430.aClass243_81;
		synchronized (Class430.aClass243_81) {
			Class430.aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!atb", name = "<init>", descriptor = "()V")
	RuntimeException_Sub2() {
	}
}
