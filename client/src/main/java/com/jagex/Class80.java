package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adf")
public class Class80 {

	@OriginalMember(owner = "client!adf", name = "e", descriptor = "J")
	public static final long aLong10 = 94608000L;

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "()V", line = 8)
	Class80() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!adf", name = "m", descriptor = "(I)V", line = 251)
	public static void method1364(@OriginalArg(0) int arg0) {
		if (Class362.aClass370Array1 == null) {
			Class362.aClass370Array1 = Class370.method27994(-1497761840);
			Class146.aClass370_3 = Class362.aClass370Array1[0];
			Class661.aLong302 = Class305.method26797(1585924226) * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28315((byte) 90);
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30602(65280);
		if (Class146.aClass370_3 == local19) {
			Class362.aString187 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) 26);
			Class531.aString225 = Class362.aString187;
			if (Class146.aClass370_3.aBoolean737) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4591 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4592 - Class146.aClass370_3.anInt4591 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29756(4, 1823202236);
			if (Class362.aBoolean730) {
				Class362.aBoolean730 = false;
				Class114.method7635(Class7.aString2, Class490.aString217, "", false, (byte) 119);
			}
		} else {
			Class362.aString187 = local19.aClass74_178.method1259(Class106.aClass717_8, (byte) -28);
			Class531.aString225 = Class362.aString187;
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + local19.anInt4592 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4592 * 640981761;
			if (Class146.aClass370_3.aBoolean737 || local19.aBoolean737) {
				Class661.aLong302 = Class305.method26797(136817521) * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27741(Class661.aLong302 * 3693219987677404063L, Class362.aString187, Class531.aString225, Class66.anInt237 * 1453631867, Class146.aClass370_3, (short) 174);
		if (Class362.anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = Class362.anInt4573 * 815014065 + 1; local162 < Class362.anInterface30Array1.length; local162++) {
			if (Class362.anInterface30Array1[local162].method27932(-1143727088) >= 100 && local162 - 1 == Class362.anInt4573 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27735((byte) 29)) {
				try {
					Class362.anInterface30Array1[local162].method27923((short) 253);
				} catch (@Pc(196) Exception local196) {
					Class362.anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27740(Class362.anInterface30Array1[local162], (short) -5560);
				Class362.anInt4573 += 770058321;
				if (Class362.anInt4573 * 815014065 >= Class362.anInterface30Array1.length - 1 && Class362.anInterface30Array1.length > 1) {
					Class362.anInt4573 = (Class363.aClass81_1.method1376(-1392221523) ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!adf", name = "bk", descriptor = "(Lclient!arn;B)Ljava/lang/String;", line = 1372)
	static String method1365(@OriginalArg(0) Class93_Sub1_Sub8 arg0, @OriginalArg(1) byte arg1) {
		return arg0.aString101 + Class306.method26804(16777215, 1364993091) + " >";
	}
}
