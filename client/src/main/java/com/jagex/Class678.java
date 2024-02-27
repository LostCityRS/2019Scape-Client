package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yb")
public final class Class678 {

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "I")
	public volatile int anInt6047 = 1127574683;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "Ljava/lang/String;")
	volatile String aString248;

	@OriginalMember(owner = "client!yb", name = "ahz", descriptor = "(Lclient!yf;I)V")
	static void method33412(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18273(local23, 1630431348);
		if (local29.method1508(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class263) Class32.aClass32_Sub17_23.method18273(local13, 2046293844)).method26285(local23, local29.aString11, -1653823276);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class263) Class32.aClass32_Sub17_23.method18273(local13, 314282434)).method26277(local23, local29.anInt265 * 951920133, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!yb", name = "avl", descriptor = "(Lclient!yf;I)V")
	static void method33413(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class710.method36980(0, 0, client.aClass312_4.anInt4022 * 1215292027, client.aClass312_4.anInt4023 * -1490598249, false, -1475795324);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3569 * -1968459517;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3570 * -1469130191;
	}

	@OriginalMember(owner = "client!yb", name = "bfc", descriptor = "(Lclient!yf;I)V")
	static void method33414(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= -1422374923;
		arg0.anInt6052 -= -725861497;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class678(@OriginalArg(0) String arg0) {
		this.aString248 = arg0;
	}
}
