package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zq")
public abstract class Class165 {

	@OriginalMember(owner = "client!zq", name = "f", descriptor = "I")
	protected static final int anInt2395 = 2;

	@OriginalMember(owner = "client!zq", name = "t", descriptor = "I")
	protected static final int anInt2396 = 1;

	@OriginalMember(owner = "client!zq", name = "e", descriptor = "I")
	public static final int anInt2397 = 3;

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "I")
	protected int anInt2398;

	@OriginalMember(owner = "client!zq", name = "u", descriptor = "Lclient!ale;")
	protected Class80_Sub37 aClass80_Sub37_48;

	@OriginalMember(owner = "client!zq", name = "tv", descriptor = "(Lclient!hx;Lclient!yp;B)V")
	static void method16958(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(27) int local27 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581] - 1;
		if (arg0.anInt4136 * -1322281851 != 6) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 12) {
			Class308.method27443(arg0, local27, local12, 1.0F, 0, 0, 0, 0, 0, 0, (byte) -108);
			Class296.method26998(arg0, 1860068533);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!zq", name = "awu", descriptor = "(Lclient!yp;I)V")
	static void method16959(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(3, local13, local23, "", 881390734);
	}

	@OriginalMember(owner = "client!zq", name = "p", descriptor = "(Lclient!hx;Lclient!cg;IIIILclient!cm;DLclient!hh;Lclient!hd;B)V")
	static void method16960(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class99 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class313 arg8, @OriginalArg(9) Class309 arg9, @OriginalArg(10) byte arg10) {
		if (arg6 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local21 = (int) ((double) Class160.aClass121_Sub1_2.method9648(579251441) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local21 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local21 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(58) int local58 = Math.max(arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2) + 10;
		@Pc(66) int local66 = arg5 * arg5 + arg4 * arg4;
		if (local66 > local58 * local58) {
			return;
		}
		@Pc(76) int local76 = Class467.anIntArray454[local21];
		@Pc(80) int local80 = Class467.anIntArray453[local21];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local76 = local76 * 256 / (client.anInt3476 * -692320695 + 256);
			local80 = local80 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(115) int local115 = arg5 * local76 + arg4 * local80 >> 14;
		@Pc(125) int local125 = arg5 * local80 - arg4 * local76 >> 14;
		@Pc(129) double local129 = arg7 / 100.0D;
		switch(arg8.anInt4019 * -1120202439) {
			case 0:
				arg2 = arg0.anInt4103 * 1892149809 / 2 + arg2 + local115;
				break;
			case 1:
				arg2 = local115 + arg2 + arg0.anInt4103 * 1892149809 / 2 - (int) ((double) arg6.method18214() * local129);
				break;
			case 2:
				arg2 = arg2 + arg0.anInt4103 * 1892149809 / 2 + local115 - (int) ((double) (arg6.method18214() / 2) * local129);
		}
		switch(arg9.anInt4011 * -2069042521) {
			case 0:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) arg6.method18288() * local129);
				break;
			case 1:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125;
				break;
			case 2:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) (arg6.method18288() / 2) * local129);
		}
		if (arg1 == null) {
			if (local129 == 1.0D) {
				arg6.method18225(arg2, arg3);
			}
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		} else if (local129 == 1.0D) {
			arg6.method18235(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		}
	}

	@OriginalMember(owner = "client!zq", name = "<init>", descriptor = "(ILclient!ale;)V")
	Class165(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		this.anInt2398 = arg0 * 251097721;
		this.aClass80_Sub37_48 = arg1;
	}

	@OriginalMember(owner = "client!zq", name = "<init>", descriptor = "(Lclient!ale;)V")
	Class165(@OriginalArg(0) Class80_Sub37 arg0) {
		this.aClass80_Sub37_48 = arg0;
		this.anInt2398 = this.method16949((byte) -72) * 251097721;
	}

	@OriginalMember(owner = "client!zq", name = "g", descriptor = "()I")
	abstract int method16948();

	@OriginalMember(owner = "client!zq", name = "t", descriptor = "(B)I")
	abstract int method16949(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!zq", name = "f", descriptor = "(IB)I")
	abstract int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!zq", name = "e", descriptor = "(II)V")
	final void method16951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.method16950(arg0, (byte) -113) != 3) {
			this.method16952(arg0, 1413385158);
		}
	}

	@OriginalMember(owner = "client!zq", name = "u", descriptor = "(II)V")
	abstract void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "()I")
	abstract int method16953();

	@OriginalMember(owner = "client!zq", name = "i", descriptor = "(I)I")
	abstract int method16954(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zq", name = "m", descriptor = "(I)V")
	abstract void method16955(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zq", name = "o", descriptor = "(I)V")
	final void method16956(@OriginalArg(0) int arg0) {
		if (this.method16950(arg0, (byte) -119) != 3) {
			this.method16952(arg0, 1413385158);
		}
	}

	@OriginalMember(owner = "client!zq", name = "j", descriptor = "(I)V")
	final void method16957(@OriginalArg(0) int arg0) {
		if (this.method16950(arg0, (byte) -40) != 3) {
			this.method16952(arg0, 1413385158);
		}
	}
}
