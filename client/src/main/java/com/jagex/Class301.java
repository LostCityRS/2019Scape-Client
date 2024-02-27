package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class301 implements Interface75 {

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "Lclient!gv;")
	static final Class301 aClass301_9 = new Class301(6, 1);

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!gv;")
	static final Class301 aClass301_2 = new Class301(12, 2);

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!gv;")
	static final Class301 aClass301_3 = new Class301(10, 3);

	@OriginalMember(owner = "client!gv", name = "u", descriptor = "Lclient!gv;")
	static final Class301 aClass301_4 = new Class301(2, 4);

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!gv;")
	static final Class301 aClass301_13 = new Class301(4, 5);

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Lclient!gv;")
	static final Class301 aClass301_6 = new Class301(1, 6);

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "Lclient!gv;")
	static final Class301 aClass301_7 = new Class301(11, 7);

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lclient!gv;")
	static final Class301 aClass301_8 = new Class301(5, 8);

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!gv;")
	static final Class301 aClass301_1 = new Class301(0, 9);

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!gv;")
	static final Class301 aClass301_10 = new Class301(13, 10);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!gv;")
	static final Class301 aClass301_11 = new Class301(8, 11);

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "Lclient!gv;")
	static final Class301 aClass301_12 = new Class301(3, 12);

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!gv;")
	static final Class301 aClass301_5 = new Class301(9, 13);

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "Lclient!gv;")
	static final Class301 aClass301_14 = new Class301(7, 14);

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
	final int anInt3966;

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
	final int anInt3965;

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "(I)[Lclient!gv;")
	static Class301[] method27036(@OriginalArg(0) int arg0) {
		return new Class301[] { aClass301_1, aClass301_6, aClass301_4, aClass301_12, aClass301_13, aClass301_8, aClass301_9, aClass301_14, aClass301_11, aClass301_5, aClass301_3, aClass301_7, aClass301_2, aClass301_10 };
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "()[Lclient!gv;")
	static Class301[] method27037() {
		return new Class301[] { aClass301_1, aClass301_6, aClass301_4, aClass301_12, aClass301_13, aClass301_8, aClass301_9, aClass301_14, aClass301_11, aClass301_5, aClass301_3, aClass301_7, aClass301_2, aClass301_10 };
	}

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "([Ljava/lang/String;I)V")
	static void method27038(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1) {
		if (arg0.length <= 1) {
			Class149.aString48 = Class149.aString48 + arg0[0];
			Class149.anInt1523 += arg0[0].length() * -1734720461;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class294.method26961("Pausing for " + local17 + " seconds...", 1455295997);
				Class491.aStringArray30 = arg0;
				Class149.anInt1529 = (local5 + 1) * 864731011;
				Class519.aLong391 = (Class303.currentTimeMillis((byte) 104) + (long) (local17 * 1000)) * 7383831285108766023L;
				return;
			}
			Class149.aString48 = arg0[local5];
			LoginProt.method29134(false, -972307639);
		}
	}

	@OriginalMember(owner = "client!gv", name = "ax", descriptor = "(I)J")
	static long method27039(@OriginalArg(0) int arg0) {
		return Class554.timer.method13858((byte) 1);
	}

	@OriginalMember(owner = "client!gv", name = "it", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method27040(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg2.anIntArray525[arg2.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1];
		if (local13 == -1 && local23 == -1) {
			arg0.aClass327_11 = null;
		} else {
			arg0.aClass327_11 = Class369.method28340(local13, local23, -2055779656);
		}
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "(II)Lclient!hx;")
	public static Class327 method27041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		if (Class709.aClass310Array1[local3] == null || Class709.aClass310Array1[local3].method27456(arg0, 2036747717) == null) {
			@Pc(20) boolean local20 = Class71.method18185(local3, null, (byte) 100);
			if (!local20) {
				return null;
			}
		}
		return Class709.aClass310Array1[local3].method27456(arg0, 2036747717);
	}

	@OriginalMember(owner = "client!gv", name = "azk", descriptor = "(Lclient!yp;B)V")
	static void method27042(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16038((byte) -26) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gv", name = "fj", descriptor = "(IB)Z")
	public static boolean method27043(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 13 || arg0 == 6 || arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(II)V")
	Class301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3966 = arg0 * -2019417097;
		this.anInt3965 = arg1 * -1779969965;
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3965 * 302445531;
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3965 * 302445531;
	}

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3965 * 302445531;
	}
}
