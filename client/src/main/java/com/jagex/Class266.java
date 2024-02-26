package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!fj")
public final class Class266 {

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Lclient!fj;")
	static final Class266 aClass266_4 = new Class266(4);

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!fj;")
	static final Class266 aClass266_2 = new Class266(3);

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!fj;")
	static final Class266 aClass266_3 = new Class266(5);

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!fj;")
	static final Class266 aClass266_5 = new Class266(1);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!fj;")
	static final Class266 aClass266_1 = new Class266(0);

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!fj;")
	static final Class266 aClass266_6 = new Class266(2);

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	final int anInt3916;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "(Lclient!ald;B)V")
	static void method26655(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(1) int local1 = 0; local1 < Class635.anInt5597 * 1584731201; local1++) {
			@Pc(10) int local10 = arg0.gSmart1or2();
			@Pc(14) int local14 = arg0.g2();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Class635.aClass163_Sub1Array2[local10] != null) {
				Class635.aClass163_Sub1Array2[local10].anInt2083 = local14 * 2113710099;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "tl", descriptor = "(Lclient!hx;Lclient!yp;B)V")
	static void method26656(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(27) int local27 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt4136 * -1322281851 != 6 && arg0.anInt4136 * -1322281851 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class335 local55 = (Class335) Class460.aClass41_Sub2_1.method18054(arg0.anInt4122 * -589001179, -1526136385);
		if (arg0.aClass350_2 == null) {
			arg0.aClass350_2 = new Class350(local55, arg0.anInt4136 * -1322281851 == 6);
		}
		arg0.aClass350_2.aLong370 = Class475.method29884((byte) -14) * 1429031336920090503L;
		if (local55.aByteArray83 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray83.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray83[local27];
		}
		if (local55.aShortArray115 == null || local29 < 0 || local29 >= local55.aShortArray115.length) {
			throw new RuntimeException("");
		}
		arg0.aClass350_2.aShortArray119[local29] = (short) local12;
		Class296.method26998(arg0, -1212843240);
	}

	@OriginalMember(owner = "client!fj", name = "gj", descriptor = "(ZS)V")
	public static void method26657(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		@Pc(1) Class75[] local1 = client.aClass75Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class75 local11 = local1[local3];
			try {
				local11.method1315(-528666714);
			} catch (@Pc(16) IOException local16) {
			}
			local11.method1319((short) 468);
		}
		Class324.method27619((byte) 0);
		Class614.method32270((byte) -72);
		Class92.method1877(false, -1855413988);
		client.aClass539_1.method30913(-716397630);
		client.aClass539_1.method30912(-1599343761);
		client.aClass539_1.method30916(146602262);
		Class443.method29216(1917638467);
		Class362.method28157((byte) -20);
		Class236.method26135(true, (short) 778);
		Class103_Sub12.method7923((short) -12749);
		Class631.method32722((byte) -1);
		client.anInt3558 = 632410243;
		if (arg0) {
			Class604.method32148(9, 2120307126);
			return;
		}
		Class604.method32148(4, 2101280106);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(66) Throwable local66) {
		}
	}

	@OriginalMember(owner = "client!fj", name = "adl", descriptor = "(Lclient!yp;I)V")
	static void method26658(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass533ArrayArray1[local23][local13].anInt5072 * -1554016071;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V")
	Class266(@OriginalArg(0) int arg0) {
		this.anInt3916 = arg0 * 490317939;
	}

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "()I")
	int method26651() {
		return aClass266_4 == this ? -1 : this.anInt3916 * 4013243 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "(B)I")
	int method26652(@OriginalArg(0) byte arg0) {
		return aClass266_4 == this ? -1 : this.anInt3916 * 4013243 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "()I")
	int method26653() {
		return aClass266_4 == this ? -1 : this.anInt3916 * 4013243 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "()I")
	int method26654() {
		return aClass266_4 == this ? -1 : this.anInt3916 * 4013243 | 0x1000000;
	}
}
