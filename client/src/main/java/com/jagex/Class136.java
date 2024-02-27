package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class136 {

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Lclient!eg;")
	static Class244 aClass244_1;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!ai;")
	static final Class136 aClass136_1 = new Class136(0);

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!ai;")
	static final Class136 aClass136_2 = new Class136(1);

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!ai;")
	static final Class136 aClass136_3 = new Class136(2);

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Lclient!ai;")
	static final Class136 aClass136_4 = new Class136(3);

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	final int anInt1187;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "(Ljava/lang/String;I)V")
	public static void method10213(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class168.aString61 = arg0;
		Class168.anInt2445 = Class168.aString61.length() * -1799421149;
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "(II)Z")
	public static boolean method10214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ai", name = "yt", descriptor = "(Lclient!yf;I)V")
	static void method10215(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub1_Sub7 local2 = Class370.method28178(2012376485);
		if (Class166_Sub14.method15669(local2, 1835877544) == 7) {
			@Pc(12) int local12 = (int) local2.method21713(955280622);
			if (local12 >= 0 && local12 <= Class174.anInt3293 * -1081967415) {
				@Pc(23) Class132_Sub1_Sub1_Sub1_Sub2 local23 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local23 != null) {
					arg0.aClass132_Sub1_Sub1_Sub1_4 = local23;
					arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
					return;
				}
			}
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
	Class136(@OriginalArg(0) int arg0) {
		this.anInt1187 = arg0 * 1914221871;
	}
}
