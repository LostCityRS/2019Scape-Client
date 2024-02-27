package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class531 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!de;")
	static Class105 aClass105_3;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Ljava/lang/String;")
	static String aString234;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "B")
	byte aByte161;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt5394;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public int anInt5396;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public int anInt5395;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public int anInt5393;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public int anInt5397;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;")
	static Class40 method30611(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22425((short) 16384);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8, (byte) 1);
			while (true) {
				@Pc(22) int local22 = arg0.method22425((short) 16384);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18, (byte) 1);
				if (local38 != null) {
					local4.method776(local38.anInt5253 * -1181855333, local38.anObject19, (byte) 36);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;")
	static Class40 method30612(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22425((short) 16384);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8, (byte) 1);
			while (true) {
				@Pc(22) int local22 = arg0.method22425((short) 16384);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18, (byte) 1);
				if (local38 != null) {
					local4.method776(local38.anInt5253 * -1181855333, local38.anObject19, (byte) 27);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;")
	static Class40 method30613(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22425((short) 16384);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8, (byte) 1);
			while (true) {
				@Pc(22) int local22 = arg0.method22425((short) 16384);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18, (byte) 1);
				if (local38 != null) {
					local4.method776(local38.anInt5253 * -1181855333, local38.anObject19, (byte) 62);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "al", descriptor = "(I)V")
	public static void method30616(@OriginalArg(0) int arg0) {
		Class25.aClass100_39 = null;
		Class441.aClass100_44 = null;
		Class92.aClass100_2 = null;
		Class124_Sub3.aClass100_36 = null;
		Class454.aClass100_45 = null;
		Class211.aClass100_41 = null;
		Class53_Sub1.aClass100_19 = null;
		Class166_Sub34.aClass100_23 = null;
		Class276.aClass106_10 = null;
		Class49.aClass5_12 = null;
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(IB)I")
	static int method30617(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		switch(arg0) {
			case 0:
				return 64;
			case 1:
				return 128;
			case 2:
				return 256;
			case 3:
				return 512;
			case 4:
				return 1024;
			default:
				return -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "azd", descriptor = "(Lclient!yf;B)V")
	static void method30618(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15811(-51345613) ? 1 : 0;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!alw;Lclient!add;)V")
	public Class531(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		this.aByte161 = arg0.method22426(1835866670);
		this.anInt5394 = arg0.method22427(-1434290800) * 273380377;
		this.anInt5396 = arg0.method22431(-118643075) * 1703068581;
		this.anInt5395 = arg0.method22431(-118643075) * 760396933;
		this.anInt5393 = arg0.method22431(-118643075) * -546075799;
		this.anInt5397 = arg0.method22431(-118643075) * -1515193523;
		if (arg1 != null) {
			Class79.method1456(arg0, arg1, -556610454);
		}
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class531() {
	}

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "(I)I")
	public int method30607(@OriginalArg(0) int arg0) {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "()I")
	public int method30608() {
		return (this.aByte161 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "()I")
	public int method30609() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "(B)I")
	public int method30610(@OriginalArg(0) byte arg0) {
		return (this.aByte161 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "()I")
	public int method30614() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "()I")
	public int method30615() {
		return this.aByte161 & 0x7;
	}
}
