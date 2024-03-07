package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yb")
public final class Class678 {

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "I")
	public volatile int anInt5886 = 1127574683;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "Ljava/lang/String;")
	volatile String aString239;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 7)
	Class678(@OriginalArg(0) String arg0) {
		this.aString239 = arg0;
	}

	@OriginalMember(owner = "client!yb", name = "ahz", descriptor = "(Lclient!yf;I)V", line = 10871)
	static final void method33231(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.get(local23, 1630431348);
		if (local29.method1511(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class263) Class32.aClass32_Sub17_23.get(local13, 2046293844)).method26192(local23, local29.aString11, -1653823276);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class263) Class32.aClass32_Sub17_23.get(local13, 314282434)).method26189(local23, local29.anInt265 * 951920133, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!yb", name = "avl", descriptor = "(Lclient!yf;I)V", line = 13547)
	static final void method33232(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class710.method36799(0, 0, client.aClass312_4.anInt3981 * 1215292027, client.aClass312_4.anInt3982 * -1490598249, false, -1475795324);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3569 * -1968459517;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3570 * -1469130191;
	}

	@OriginalMember(owner = "client!yb", name = "bfc", descriptor = "(Lclient!yf;I)V", line = 15166)
	static final void method33233(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5888 -= -1422374923;
		arg0.anInt5891 -= -725861497;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
