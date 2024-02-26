package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class512 implements Interface75 {

	@OriginalMember(owner = "client!qn", name = "bx", descriptor = "Lclient!zv;")
	public static Class719 aClass719_3;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!qn;")
	public static final Class512 aClass512_6 = new Class512(0);

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!qn;")
	public static final Class512 aClass512_4 = new Class512(1);

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!qn;")
	public static final Class512 aClass512_5 = new Class512(2);

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	final int anInt5049;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "()[Lclient!qn;")
	public static Class512[] method30557() {
		return new Class512[] { aClass512_5, aClass512_6, aClass512_4 };
	}

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "(Lclient!yp;B)V")
	static void method30558(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(16) Class352 local16 = (Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -407948545);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anIntArrayArray57 == null ? 0 : local16.anIntArrayArray57.length;
	}

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "(Lclient!ub;IILclient!yz;Lclient!auu;B)V")
	public static void method30559(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class698 arg3, @OriginalArg(4) Class120_Sub1_Sub5_Sub1 arg4, @OriginalArg(5) byte arg5) {
		@Pc(2) Class690 local2 = Class677.method33596(-1827690192);
		local2.aClass120_Sub1_Sub5_Sub1_1 = arg4;
		Class388.method28635(arg0, arg1, arg2, local2, (short) 2903);
		local2.aClass120_Sub1_Sub5_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!qn", name = "ib", descriptor = "(Lclient!yp;I)V")
	static void method30560(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2090895170);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class301.method27040(local16, local22, arg0, -1163947766);
	}

	@OriginalMember(owner = "client!qn", name = "fq", descriptor = "(II)Z")
	static boolean method30561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 13 || arg0 == 15;
	}

	@OriginalMember(owner = "client!qn", name = "ld", descriptor = "(Lclient!hx;B)Lclient!hx;")
	static Class327 method30562(@OriginalArg(0) Class327 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class327 local2 = client.method25327(arg0);
		if (local2 == null) {
			local2 = arg0.aClass327_11;
		}
		return local2;
	}

	@OriginalMember(owner = "client!qn", name = "agc", descriptor = "(Lclient!yp;I)V")
	static void method30563(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -1910967824);
		if (local18.anInt124 * 524837079 == -1 && local18.anInt166 * -207892705 >= 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt166 * -207892705;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
	Class512(@OriginalArg(0) int arg0) {
		this.anInt5049 = arg0 * -1773031585;
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5049 * 2142792863;
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5049 * 2142792863;
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5049 * 2142792863;
	}
}
