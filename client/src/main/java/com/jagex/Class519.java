package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class519 implements Interface75 {

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "J")
	static long aLong391;

	@OriginalMember(owner = "client!qv", name = "dq", descriptor = "Ljava/lang/String;")
	public static String aString217;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "Lclient!qv;")
	public static final Class519 aClass519_4 = new Class519(3, 0, Integer.class, new Class505());

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Lclient!qv;")
	public static final Class519 aClass519_3 = new Class519(2, 1, Long.class, new Class501());

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "Lclient!qv;")
	public static final Class519 aClass519_2 = new Class519(0, 2, String.class, new Class504());

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Lclient!qv;")
	static final Class519 aClass519_5 = new Class519(4, 3, Class80_Sub33.class, new Class520());

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "Lclient!qv;")
	static final Class519 aClass519_6 = new Class519(1, 4, Class308.class, new Class522());

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public final int anInt5057;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	final int anInt5058;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "Ljava/lang/Class;")
	public final Class aClass2;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "Lclient!ade;")
	final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "(Ljava/lang/Class;)Lclient!qv;")
	static Class519 method30592(@OriginalArg(0) Class arg0) {
		@Pc(2) Class519[] local2 = method30602(1255229366);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class519 local12 = local2[local4];
			if (local12.aClass2 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(Ljava/lang/Class;B)Lclient!qv;")
	static Class519 method30593(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class519[] local2 = method30602(1255229366);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class519 local12 = local2[local4];
			if (local12.aClass2 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "(Ljava/lang/Class;B)Lclient!ade;")
	public static Interface9 method30594(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class519 local3 = method30593(arg0, (byte) 34);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "(Ljava/lang/Class;)Lclient!qv;")
	static Class519 method30596(@OriginalArg(0) Class arg0) {
		@Pc(2) Class519[] local2 = method30602(1255229366);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class519 local12 = local2[local4];
			if (local12.aClass2 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "(Ljava/lang/Class;)Lclient!ade;")
	public static Interface9 method30597(@OriginalArg(0) Class arg0) {
		@Pc(3) Class519 local3 = method30593(arg0, (byte) 94);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "()[Lclient!qv;")
	public static Class519[] method30598() {
		return new Class519[] { aClass519_2, aClass519_6, aClass519_4, aClass519_5, aClass519_3 };
	}

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "()[Lclient!qv;")
	public static Class519[] method30599() {
		return new Class519[] { aClass519_2, aClass519_6, aClass519_4, aClass519_5, aClass519_3 };
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()[Lclient!qv;")
	public static Class519[] method30600() {
		return new Class519[] { aClass519_2, aClass519_6, aClass519_4, aClass519_5, aClass519_3 };
	}

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "()[Lclient!qv;")
	public static Class519[] method30601() {
		return new Class519[] { aClass519_2, aClass519_6, aClass519_4, aClass519_5, aClass519_3 };
	}

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "(I)[Lclient!qv;")
	public static Class519[] method30602(@OriginalArg(0) int arg0) {
		return new Class519[] { aClass519_2, aClass519_6, aClass519_4, aClass519_5, aClass519_3 };
	}

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "(Ljava/lang/Class;)Lclient!ade;")
	public static Interface9 method30603(@OriginalArg(0) Class arg0) {
		@Pc(3) Class519 local3 = method30593(arg0, (byte) -65);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface9_1;
	}

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "(I)Z")
	static boolean method30604(@OriginalArg(0) int arg0) {
		return Class407.method28948(Class630.aClass641_1.aClass615_3, (byte) 12);
	}

	@OriginalMember(owner = "client!qv", name = "eo", descriptor = "(Lclient!yp;I)V")
	static void method30605(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class691.method36970(local11, local14, arg0, 1298975588);
	}

	@OriginalMember(owner = "client!qv", name = "hg", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;Lclient!hq;I)V")
	static void method30606(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		switch(arg3.anInt4065 * -1934834517) {
			case 0:
				arg0.aString187 = ((Class288) Class134.aClass305_1.method27131((byte) -70).get(local12)).method26908((byte) -13);
				break;
			case 1:
			case 5:
				arg0.aString187 = arg2.aClass80_Sub32_4.aClass382Array1[local12].aString204;
				break;
			case 2:
				arg0.aString187 = Class134.aClass305_1.method27140(local12, -2066739654).method27075(352008512);
				break;
			case 3:
				if (Class14.aClass164Array1 != null && local12 < Class14.aClass164Array1.length) {
					arg0.aString187 = Class14.aClass164Array1[local12].aString66;
				}
				break;
			case 4:
				if (client.anInt3577 * 740205413 != 2 || local12 >= client.anInt3573 * 975306769) {
					return;
				}
				arg0.aString187 = client.aClass676Array1[local12].aString236;
				break;
			default:
				throw new IllegalStateException();
		}
		arg0.aClass322_7 = arg3;
	}

	@OriginalMember(owner = "client!qv", name = "alu", descriptor = "(Lclient!yp;I)V")
	static void method30607(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1372332131;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) int local25 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] << 1;
		@Pc(35) int local35 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(45) int local45 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(55) int local55 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		@Pc(65) int local65 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 5];
		@Pc(75) int local75 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 6];
		if (local13 >= 0 && local13 < 2 && client.anIntArrayArrayArray15[local13] != null && local25 >= 0 && local25 < client.anIntArrayArrayArray15[local13].length) {
			client.anIntArrayArrayArray15[local13][local25] = new int[] { (local35 >> 14 & 0x3FFF) << 9, local45 << 2, (local35 & 0x3FFF) << 9, local75 };
			client.anIntArrayArrayArray15[local13][local25 + 1] = new int[] { (local55 >> 14 & 0x3FFF) << 9, local65 << 2, (local55 & 0x3FFF) << 9 };
		}
	}

	@OriginalMember(owner = "client!qv", name = "acz", descriptor = "(Lclient!yp;B)V")
	static void method30608(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aByteArray89[local12];
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IILjava/lang/Class;Lclient!ade;)V")
	Class519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Interface9 arg3) {
		this.anInt5057 = arg0 * -2051582247;
		this.anInt5058 = arg1 * 104681467;
		this.aClass2 = arg2;
		this.anInterface9_1 = arg3;
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5058 * 228680499;
	}

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "(Lclient!ald;I)Ljava/lang/Object;")
	public Object method30595(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		return this.anInterface9_1.method30638(arg0, (short) 961);
	}

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5058 * 228680499;
	}

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5058 * 228680499;
	}
}
