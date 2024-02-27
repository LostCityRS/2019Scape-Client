package com.jagex;

import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acr")
public final class Class68 {

	@OriginalMember(owner = "client!acr", name = "e", descriptor = "I")
	public static final int anInt239 = 8;

	@OriginalMember(owner = "client!acr", name = "x", descriptor = "Ljava/awt/Font;")
	static Font aFont1;

	@OriginalMember(owner = "client!acr", name = "tv", descriptor = "(Lclient!yf;I)V")
	static void method1206(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1608582081);
		Class32_Sub19.method17415(local16, arg0, (short) 4380);
	}

	@OriginalMember(owner = "client!acr", name = "<init>", descriptor = "()V")
	Class68() throws Throwable {
		throw new Error();
	}
}
