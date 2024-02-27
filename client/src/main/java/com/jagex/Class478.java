package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class478 {

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static final int anInt5290 = 0;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	public static final int anInt5291 = 1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public static final int anInt5292 = 3;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public static final int anInt5293 = 2;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static final int anInt5294 = 4;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)Lclient!ali;")
	static Class93_Sub36 method29888(@OriginalArg(0) int arg0) {
		@Pc(1) Class38 local1 = null;
		@Pc(7) Class93_Sub36 local7 = new Class93_Sub36(client.aClass702_4, 0);
		try {
			local1 = Class166_Sub18.method15755("", client.aClass702_4.aString250, false, 199047110);
			@Pc(20) byte[] local20 = new byte[(int) local1.method735(1587415624)];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method726(local20, local22, local20.length - local22, (byte) -6);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class93_Sub36(new Class93_Sub41(local20), client.aClass702_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method732(81594133);
			}
		} catch (@Pc(67) Exception local67) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lclient!dh;Lclient!yn;I)I")
	static int method29889(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class688 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt6077 * 1773420629 != -1) {
			return arg1.anInt6077 * 1773420629;
		}
		if (-1685253883 * arg1.anInt6076 != -1) {
			@Pc(25) Class235 local25 = arg0.aClass225_6.method25690(arg1.anInt6076 * -1685253883, 1498737574);
			if (!local25.aBoolean660) {
				return local25.aShort162;
			}
		}
		return arg1.anInt6075 * 592157171;
	}

	@OriginalMember(owner = "client!pd", name = "bz", descriptor = "(III)B")
	static byte method29890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "asr", descriptor = "(Lclient!yf;B)V")
	static void method29891(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(17) int local17 = Class51.aClass93_Sub36_1.aClass166_Sub35_4.method16235(212353480);
		if (local12 != local17) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub35_4, local12, (byte) 113);
			Class106_Sub1.method5148(337596176);
			client.aBoolean603 = false;
		}
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	Class478() throws Throwable {
		throw new Error();
	}
}
