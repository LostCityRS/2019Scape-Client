package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class355 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Ljava/lang/Process;")
	static Process aProcess1;

	@OriginalMember(owner = "client!j", name = "bl", descriptor = "I")
	public static int anInt4265;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Ljava/lang/String;")
	static final String aString195 = Class123_Sub2_Sub2.method20260(1946322695) + "\\RuneScape-Setup.exe";

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!aj;")
	static Class145 aClass145_5 = Class145.aClass145_2;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "()Z")
	static boolean method28088() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(10) IllegalThreadStateException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "()I")
	public static int method28089() {
		Class354.method28073(1824898204);
		return aClass145_5.anInt1410 * 85122777;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "()I")
	public static int method28090() {
		Class354.method28073(1824898204);
		return aClass145_5.anInt1410 * 85122777;
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "()I")
	public static int method28091() {
		Class354.method28073(1824898204);
		return aClass145_5.anInt1410 * 85122777;
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "()V")
	static void method28092() {
		if (Class125.method20589(-1123040732)) {
			aClass145_5 = aProcess1.exitValue() == 0 ? Class145.aClass145_3 : Class145.aClass145_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "o", descriptor = "()V")
	static void method28093() {
		if (Class125.method20589(-851177783)) {
			aClass145_5 = aProcess1.exitValue() == 0 ? Class145.aClass145_3 : Class145.aClass145_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "()V")
	static void method28094() {
		if (Class125.method20589(-461913548)) {
			aClass145_5 = aProcess1.exitValue() == 0 ? Class145.aClass145_3 : Class145.aClass145_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
	static boolean method28095() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(10) IllegalThreadStateException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "s", descriptor = "()Z")
	static boolean method28096() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(10) IllegalThreadStateException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "()Z")
	static boolean method28097() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(10) IllegalThreadStateException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "(Lclient!asa;B)V")
	static void method28098(@OriginalArg(0) Class80_Sub36_Sub1 arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(1) int local1 = 0; local1 < Class51.anInt194 * -1414067589; local1++) {
			arg0.method23178((byte) -27);
			@Pc(14) int local14 = Class51.anIntArray22[local1];
			@Pc(18) Class120_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method23362(1126553178);
			if ((local22 & 0x40) != 0) {
				local22 += arg0.method23362(-1368516664) << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.method23362(-50876959) << 16;
			}
			Class124_Sub1.method9831(arg0, local14, local18, local22, 548973800);
		}
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	Class355() throws Throwable {
		throw new Error();
	}
}
