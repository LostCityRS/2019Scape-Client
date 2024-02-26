package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class205 implements Interface75 {

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Lclient!ci;")
	static final Class205 aClass205_12 = new Class205(0, 0, null, -1, -1);

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!ci;")
	static final Class205 aClass205_2 = new Class205(1, 1, null, 0, 2);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!ci;")
	static final Class205 aClass205_3 = new Class205(2, 2, null, 1, 2);

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "Lclient!ci;")
	static final Class205 aClass205_4 = new Class205(3, 3, null, 2, 2);

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!ci;")
	static final Class205 aClass205_17 = new Class205(4, 4, null, 0, 1);

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!ci;")
	static final Class205 aClass205_6 = new Class205(5, 5, null, 1, 1);

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!ci;")
	static final Class205 aClass205_10 = new Class205(6, 6, null, 2, 1);

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!ci;")
	static final Class205 aClass205_8 = new Class205(7, 7, null, 0, 3);

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!ci;")
	static final Class205 aClass205_9 = new Class205(8, 8, null, 1, 3);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!ci;")
	static final Class205 aClass205_5 = new Class205(9, 9, null, 2, 3);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!ci;")
	static final Class205 aClass205_11 = new Class205(10, 10, null, 0, 7);

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "Lclient!ci;")
	static final Class205 aClass205_15 = new Class205(11, 11, null, 1, 7);

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Lclient!ci;")
	static final Class205 aClass205_13 = new Class205(12, 12, null, 2, 7);

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!ci;")
	static final Class205 aClass205_7 = new Class205(13, 13, null, 3, 7);

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!ci;")
	static final Class205 aClass205_14 = new Class205(14, 14, null, 4, 7);

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!ci;")
	static final Class205 aClass205_1 = new Class205(15, 15, null, 5, 7);

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!ci;")
	static final Class205 aClass205_16 = new Class205(16, 16, null, 0, 5);

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	final int anInt3388;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	final int anInt3389;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	final int anInt3390;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "()[Lclient!ci;")
	static Class205[] method24980() {
		return new Class205[] { aClass205_12, aClass205_2, aClass205_3, aClass205_4, aClass205_17, aClass205_6, aClass205_10, aClass205_8, aClass205_9, aClass205_5, aClass205_11, aClass205_15, aClass205_13, aClass205_7, aClass205_14, aClass205_1, aClass205_16 };
	}

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "()[Lclient!ci;")
	static Class205[] method24981() {
		return new Class205[] { aClass205_12, aClass205_2, aClass205_3, aClass205_4, aClass205_17, aClass205_6, aClass205_10, aClass205_8, aClass205_9, aClass205_5, aClass205_11, aClass205_15, aClass205_13, aClass205_7, aClass205_14, aClass205_1, aClass205_16 };
	}

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)Lclient!ci;")
	static Class205 method24983(@OriginalArg(0) int arg0) {
		@Pc(6) Class205 local6 = (Class205) Class80_Sub39.method15030(Class697.method37051(-1505691527), arg0, -2073037015);
		if (local6 == null) {
			local6 = aClass205_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ci", name = "bm", descriptor = "(Lclient!yp;I)V")
	static void method24984(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2043261479);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class612.method32231(local16, local22, arg0, 120768705);
	}

	@OriginalMember(owner = "client!ci", name = "dj", descriptor = "(Lclient!yp;I)V")
	static void method24985(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class483.method30027(local11, local14, arg0, 794275113);
	}

	@OriginalMember(owner = "client!ci", name = "on", descriptor = "(Lclient!yp;I)V")
	static void method24986(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2088946743);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class535.method30858(local16, local22, arg0, -142384231);
	}

	@OriginalMember(owner = "client!ci", name = "adh", descriptor = "(Lclient!yp;B)V")
	static void method24987(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(31) int local31 = client.aClass533ArrayArray1[local23][local13].method30824((byte) 53);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local31 == 0 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ci", name = "anq", descriptor = "(Lclient!yp;B)V")
	static void method24988(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class160.aClass121_Sub1_2.method9577(Class169.method21691(local12, (byte) 100), true, -46931258);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!ci", name = "ayg", descriptor = "(Lclient!yp;I)V")
	static void method24989(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "avr", descriptor = "(Lclient!yp;I)V")
	static void method24990(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IILjava/lang/String;II)V")
	Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3388 = arg0 * -264363285;
		this.anInt3389 = arg1 * 1638914929;
		this.anInt3390 = arg3 * 834574947;
	}

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "()I")
	int method24979() {
		return this.anInt3390 * -205211829;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3389 * -720140911;
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3389 * -720140911;
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3389 * -720140911;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)I")
	int method24982(@OriginalArg(0) int arg0) {
		return this.anInt3390 * -205211829;
	}
}
