package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public class Class211 implements Interface75 {

	@OriginalMember(owner = "client!cr", name = "bi", descriptor = "Lclient!cm;")
	public static Class100 aClass100_41;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!cr;")
	static final Class211 aClass211_12 = new Class211(0, 0, null, -1, -1);

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Lclient!cr;")
	static final Class211 aClass211_6 = new Class211(1, 1, null, 0, 2);

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Lclient!cr;")
	static final Class211 aClass211_3 = new Class211(2, 2, null, 1, 2);

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!cr;")
	static final Class211 aClass211_4 = new Class211(3, 3, null, 2, 2);

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!cr;")
	static final Class211 aClass211_5 = new Class211(4, 4, null, 0, 1);

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "Lclient!cr;")
	static final Class211 aClass211_10 = new Class211(5, 5, null, 1, 1);

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Lclient!cr;")
	static final Class211 aClass211_1 = new Class211(6, 6, null, 2, 1);

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "Lclient!cr;")
	static final Class211 aClass211_8 = new Class211(7, 7, null, 0, 3);

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "Lclient!cr;")
	static final Class211 aClass211_9 = new Class211(8, 8, null, 1, 3);

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Lclient!cr;")
	static final Class211 aClass211_15 = new Class211(9, 9, null, 2, 3);

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Lclient!cr;")
	static final Class211 aClass211_7 = new Class211(10, 10, null, 0, 7);

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!cr;")
	static final Class211 aClass211_11 = new Class211(11, 11, null, 1, 7);

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "Lclient!cr;")
	static final Class211 aClass211_13 = new Class211(12, 12, null, 2, 7);

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "Lclient!cr;")
	static final Class211 aClass211_14 = new Class211(13, 13, null, 3, 7);

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Lclient!cr;")
	static final Class211 aClass211_2 = new Class211(14, 14, null, 4, 7);

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "Lclient!cr;")
	static final Class211 aClass211_16 = new Class211(15, 15, null, 5, 7);

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Lclient!cr;")
	static final Class211 aClass211_17 = new Class211(16, 16, null, 0, 5);

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	final int anInt3597;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	final int anInt3598;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	final int anInt3599;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V", line = 40)
	public static void method25420(@OriginalArg(0) int arg0) {
		if (Class127.method9257(929532042)) {
			Class132_Sub1_Sub3_Sub1.method12301(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "()[Lclient!cr;", line = 71)
	static Class211[] method25421() {
		return new Class211[] { aClass211_12, aClass211_6, aClass211_3, aClass211_4, aClass211_5, aClass211_10, aClass211_1, aClass211_8, aClass211_9, aClass211_15, aClass211_7, aClass211_11, aClass211_13, aClass211_14, aClass211_2, aClass211_16, aClass211_17 };
	}

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "()[Lclient!cr;", line = 71)
	static Class211[] method25422() {
		return new Class211[] { aClass211_12, aClass211_6, aClass211_3, aClass211_4, aClass211_5, aClass211_10, aClass211_1, aClass211_8, aClass211_9, aClass211_15, aClass211_7, aClass211_11, aClass211_13, aClass211_14, aClass211_2, aClass211_16, aClass211_17 };
	}

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "()[Lclient!cr;", line = 71)
	static Class211[] method25423() {
		return new Class211[] { aClass211_12, aClass211_6, aClass211_3, aClass211_4, aClass211_5, aClass211_10, aClass211_1, aClass211_8, aClass211_9, aClass211_15, aClass211_7, aClass211_11, aClass211_13, aClass211_14, aClass211_2, aClass211_16, aClass211_17 };
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IILjava/lang/String;II)V", line = 74)
	Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3597 = arg0 * -88555945;
		this.anInt3598 = arg1 * -641903087;
		this.anInt3599 = arg3 * -556072083;
	}

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "()I", line = 81)
	@Override
	public int method36920() {
		return this.anInt3598 * -1400874255;
	}

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "()I", line = 81)
	@Override
	public int method36919() {
		return this.anInt3598 * -1400874255;
	}

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "()I", line = 85)
	int method25424() {
		return this.anInt3599 * -1903657371;
	}

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "(I)I", line = 85)
	int method25425(@OriginalArg(0) int arg0) {
		return this.anInt3599 * -1903657371;
	}

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "()I", line = 85)
	int method25426() {
		return this.anInt3599 * -1903657371;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Lclient!cr;", line = 89)
	static Class211 method25427(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = (Class211) Class107.method18116(Class430.method28759(-406593969), arg0, -1915563430);
		if (local6 == null) {
			local6 = aClass211_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Lclient!cr;", line = 89)
	static Class211 method25428(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = (Class211) Class107.method18116(Class430.method28759(-406593969), arg0, -1915563430);
		if (local6 == null) {
			local6 = aClass211_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "(Lclient!als;I)V", line = 217)
	public static void method25429(@OriginalArg(0) Class93_Sub39 arg0, @OriginalArg(1) int arg1) {
		Class689.method36523(arg0, 500000, 905886770);
	}

	@OriginalMember(owner = "client!cr", name = "bdh", descriptor = "(Lclient!yf;B)V", line = 14721)
	static final void method25430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(17) boolean local17 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class339.method27485(local17, -575951673);
	}
}
