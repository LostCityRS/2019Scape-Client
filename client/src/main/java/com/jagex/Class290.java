package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class290 implements Interface26 {

	@OriginalMember(owner = "client!gk", name = "ct", descriptor = "I")
	public static int anInt3947;

	@OriginalMember(owner = "client!gk", name = "ba", descriptor = "Lclient!cm;")
	public static Class99 aClass99_30;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gk", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_9;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	final int anInt3945;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	final int anInt3946;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	static boolean method26929(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class238.anInt3812 = 1741942740;
		Class238.aClass75_3 = client.aClass75_2;
		return Class334.method27820(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!gk", name = "dn", descriptor = "(Lclient!yp;I)V")
	static void method26930(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2012580586);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class505.method30469(local16, local22, arg0, 215712992);
	}

	@OriginalMember(owner = "client!gk", name = "axx", descriptor = "(Lclient!yp;B)V")
	static void method26931(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class320 local18 = (Class320) Class157.aClass41_Sub13_2.method18054(local12, -1927745470);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt4037 * 1279732247;
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "(I)Z")
	static boolean method26932(@OriginalArg(0) int arg0) {
		Class238.anInt3812 = 1741942740;
		Class238.aClass75_3 = client.aClass75_2;
		return Class334.method27820(Class238.aLong356 * 4843953102412043791L == -1L, true, "", "", Class238.aLong356 * 4843953102412043791L);
	}

	@OriginalMember(owner = "client!gk", name = "ad", descriptor = "(Lclient!ov;Lclient!pm;III)V")
	static void method26933(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Class630.aClass487_99 == null) {
			Class630.aClass487_99 = new Class487(arg1);
		} else {
			Class630.aClass487_99.method30075(arg1);
		}
		Class630.aClass471_54.method29760(arg0);
		Class630.anInt5545 = arg2 * -1687418571;
		Class630.anInt5561 = arg3 * -1400151853;
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class290(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_9 = arg0;
		@Pc(8) int local8 = arg1.method23178((byte) -50);
		if (local8 == 65535) {
			this.anInt3945 = -1240517037;
			this.anInt3946 = 0;
		} else {
			this.anInt3945 = local8 * 1240517037;
			this.anInt3946 = arg1.method23182(-1919404867) * -1132816627;
		}
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		if (this.anInt3945 * 2081260069 != -1) {
			try {
				arg0.method27129(-1847054338).method36987((Class374) this.aClass284_9.anInterface27_2.method16(2086306279).method18054(this.anInt3945 * 2081260069, 1079159744), this.anInt3946 * 772804549, (byte) -106);
			} catch (@Pc(28) Exception_Sub6 local28) {
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3945 * 2081260069 != -1) {
			try {
				arg0.method27129(-1410865627).method36987((Class374) this.aClass284_9.anInterface27_2.method16(886658122).method18054(this.anInt3945 * 2081260069, 1566634730), this.anInt3946 * 772804549, (byte) -77);
			} catch (@Pc(28) Exception_Sub6 local28) {
			}
		}
	}
}
