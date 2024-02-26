package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class309 implements Interface75 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!hd;")
	public static final Class309 aClass309_1 = new Class309(1, 0);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!hd;")
	public static final Class309 aClass309_3 = new Class309(2, 1);

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!hd;")
	static final Class309 aClass309_2 = new Class309(0, 2);

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public final int anInt4011;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
	final int anInt4012;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "()[Lclient!hd;")
	static Class309[] method27447() {
		return new Class309[] { aClass309_2, aClass309_1, aClass309_3 };
	}

	@OriginalMember(owner = "client!hd", name = "qw", descriptor = "(Lclient!yp;I)V")
	static void method27448(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2125258279);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class230.method26004(local16, local22, arg0, (byte) -62);
	}

	@OriginalMember(owner = "client!hd", name = "uo", descriptor = "(Lclient!yp;I)V")
	static void method27449(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2114035709);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4143 * -219970905;
	}

	@OriginalMember(owner = "client!hd", name = "amh", descriptor = "(Lclient!yp;I)V")
	static void method27450(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class368.anInt4502 * -1583611537 == 3) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((double) Class160.aClass121_Sub1_2.method9648(190317147) * 2607.5945876176133D) >> 3;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloat255 >> 3;
		}
	}

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "(B)[Lclient!wr;")
	public static Class645[] method27451(@OriginalArg(0) byte arg0) {
		return new Class645[] { Class645.aClass645_3, Class645.aClass645_2, Class645.aClass645_1 };
	}

	@OriginalMember(owner = "client!hd", name = "zw", descriptor = "(Lclient!yp;I)V")
	static void method27452(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(19) Class80_Sub31 local19 = Class623.method32440(Class443.aClass443_62, client.aClass75_2.aClass22_1, -191270971);
		local19.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(local13, (short) 16383), 1275868335);
		local19.aClass80_Sub36_Sub1_2.method23165(local13, 1931989090);
		client.aClass75_2.method1325(local19, (byte) -4);
	}

	@OriginalMember(owner = "client!hd", name = "dv", descriptor = "(IB)V")
	static void method27453(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) byte local4;
		if (arg0 == 0) {
			local4 = 0;
		} else if (arg0 == 1) {
			local4 = 1;
		} else if (arg0 == 2) {
			local4 = 2;
		} else {
			return;
		}
		@Pc(25) byte local25;
		if ((double) Class159_Sub1.aFloat150 == 2.0D) {
			local25 = 0;
		} else if ((double) Class159_Sub1.aFloat150 == 3.0D) {
			local25 = 1;
		} else if ((double) Class159_Sub1.aFloat150 == 4.0D) {
			local25 = 2;
		} else if ((double) Class159_Sub1.aFloat150 == 6.0D) {
			local25 = 3;
		} else if ((double) Class159_Sub1.aFloat150 >= 8.0D) {
			local25 = 4;
		} else {
			return;
		}
		Class165_Sub38.aClass104_12 = Class159_Sub1.aClass104ArrayArray1[local4][local25];
		Class461.aClass15_10 = Class159_Sub1.aClass15ArrayArray1[local4][local25];
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
	Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4011 = arg0 * -380756713;
		this.anInt4012 = arg1 * -1235031457;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt4012 * -1221332577;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4012 * -1221332577;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4012 * -1221332577;
	}
}
