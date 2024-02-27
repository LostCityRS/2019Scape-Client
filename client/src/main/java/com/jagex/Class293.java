package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class293 {

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(J)V")
	static void method26950(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(J)V")
	public static void method26951(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class388.method28637(arg0 - 1L);
			Class388.method28637(1L);
		} else {
			Class388.method28637(arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "(J)V")
	static void method26952(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "(J)V")
	static void method26953(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "(I)Z")
	static boolean method26954(@OriginalArg(0) int arg0) {
		if (Class57.aClass80_Sub1_Sub11_1 == null) {
			return false;
		} else {
			if (Class57.aClass80_Sub1_Sub11_1.anInt3079 * 1479399259 >= 2000) {
				Class57.aClass80_Sub1_Sub11_1.anInt3079 -= 1078882416;
			}
			return Class57.aClass80_Sub1_Sub11_1.anInt3079 * 1479399259 == 1007;
		}
	}

	@OriginalMember(owner = "client!gn", name = "wj", descriptor = "(Lclient!yp;I)V")
	static void method26955(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class672.aClass134_1.method10441(local12, (byte) 13);
	}

	@OriginalMember(owner = "client!gn", name = "avo", descriptor = "(Lclient!yp;B)V")
	static void method26956(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) long local2 = Class303.currentTimeMillis((byte) 28);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (local2 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "(I)I")
	static int method26957(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!gn", name = "ab", descriptor = "(III)Z")
	public static boolean method26958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Class630.aBoolean955) {
			return false;
		}
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Class709.aClass310Array1[local7] == null || Class709.aClass310Array1[local7].aClass327Array2[local11] == null) {
			return false;
		}
		@Pc(33) Class327 local33 = Class709.aClass310Array1[local7].aClass327Array2[local11];
		@Pc(47) Class80_Sub1_Sub11 local47;
		if (arg1 == -1 && local33.anInt4135 * 710314345 == 0) {
			for (local47 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local47 != null; local47 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-310576037)) {
				if (local47.anInt3079 * 1479399259 == 58 || local47.anInt3079 * 1479399259 == 1007 || local47.anInt3079 * 1479399259 == 25 || local47.anInt3079 * 1479399259 == 57 || local47.anInt3079 * 1479399259 == 30) {
					for (@Pc(148) Class327 local148 = Class301.method27041(local47.anInt3078 * 1896675471, 2117046929); local148 != null; local148 = Class165_Sub45.method16896(Class709.aClass310Array1[local148.anInt4087 * -2053489901 >> 16], local148, -514653960)) {
						if (local148.anInt4087 * -2053489901 == local33.anInt4087 * -2053489901) {
							return true;
						}
					}
				}
			}
		} else {
			for (local47 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local47 != null; local47 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(456391645)) {
				if (local47.anInt3076 * 2065388359 == arg1 && local47.anInt3078 * 1896675471 == local33.anInt4087 * -2053489901 && (local47.anInt3079 * 1479399259 == 58 || local47.anInt3079 * 1479399259 == 1007 || local47.anInt3079 * 1479399259 == 25 || local47.anInt3079 * 1479399259 == 57 || local47.anInt3079 * 1479399259 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	Class293() throws Throwable {
		throw new Error();
	}
}
