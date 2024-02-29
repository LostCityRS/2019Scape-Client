package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public class Class27 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	int anInt91;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "F")
	float aFloat3;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	int anInt92;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	int anInt93;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	int anInt94;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	int anInt96;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	int anInt97;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	int anInt98;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "F")
	float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "F")
	float aFloat2 = 1.0F;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	int anInt95;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V", line = 16)
	Class27(@OriginalArg(0) int arg0) {
		this.anInt95 = arg0 * -1660094529;
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IFFIII)V", line = 20)
	Class27(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt95 = arg0 * -1660094529;
		this.aFloat1 = arg1;
		this.aFloat2 = arg2;
		this.anInt98 = arg3 * 103986813;
		this.anInt92 = arg4 * -1036880185;
		this.anInt93 = arg5 * -2018856921;
	}

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "(Ljava/io/File;II)[B", line = 21)
	static byte[] method580(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class305.method26796(arg0, local2, arg1, 1354045309);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "()Lclient!ab;", line = 30)
	Class27 method581() {
		return new Class27(this.anInt95 * 968030271, this.aFloat1, this.aFloat2, this.anInt98 * 1245508309, this.anInt92 * 769092343, this.anInt93 * -1038893161);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lclient!ab;", line = 30)
	Class27 method582(@OriginalArg(0) int arg0) {
		return new Class27(this.anInt95 * 968030271, this.aFloat1, this.aFloat2, this.anInt98 * 1245508309, this.anInt92 * 769092343, this.anInt93 * -1038893161);
	}

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "(Lclient!ab;)V", line = 34)
	void method583(@OriginalArg(0) Class27 arg0) {
		this.aFloat1 = arg0.aFloat1;
		this.aFloat2 = arg0.aFloat2;
		this.anInt98 = arg0.anInt98;
		this.anInt92 = arg0.anInt92;
		this.anInt95 = arg0.anInt95;
		this.anInt93 = arg0.anInt93;
	}

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "(Lclient!ab;I)V", line = 34)
	void method584(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1) {
		this.aFloat1 = arg0.aFloat1;
		this.aFloat2 = arg0.aFloat2;
		this.anInt98 = arg0.anInt98;
		this.anInt92 = arg0.anInt92;
		this.anInt95 = arg0.anInt95;
		this.anInt93 = arg0.anInt93;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(Lclient!ab;)V", line = 34)
	void method585(@OriginalArg(0) Class27 arg0) {
		this.aFloat1 = arg0.aFloat1;
		this.aFloat2 = arg0.aFloat2;
		this.anInt98 = arg0.anInt98;
		this.anInt92 = arg0.anInt92;
		this.anInt95 = arg0.anInt95;
		this.anInt93 = arg0.anInt93;
	}

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "(Lclient!yf;B)V", line = 90)
	static void method586(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[-1497248091 * arg0.anInt5891 - 2], 957882178)).method27607(Class624.aClass120_1, arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], -2112159817) ? 1 : 0;
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "([BB)V", line = 623)
	static void method587(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22465((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class671.anInt5859 = local4.method22472(-1434290800) * -1748294101;
			} else if (local8 == 10) {
				local4.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bt", descriptor = "(Lclient!yf;I)V", line = 5134)
	static final void method588(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class312 local14 = Class659.method32808(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -8048167);
		local14.aClass312Array2 = null;
		local14.aClass312Array1 = null;
		Class354.method27694(local14, -1174743804);
	}

	@OriginalMember(owner = "client!ab", name = "alf", descriptor = "(Lclient!yf;I)V", line = 11921)
	static final void method589(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local13 >= 0 && local13 < 2) {
			client.anIntArrayArrayArray15[local13] = new int[local23 << 1][4];
		}
	}

	@OriginalMember(owner = "client!ab", name = "bbg", descriptor = "(Lclient!yf;I)V", line = 14372)
	static final void method590(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ab", name = "bcv", descriptor = "(Lclient!kr;I)Lclient!eh;", line = 14587)
	static Interface20 method591(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		return new Class686(arg0);
	}
}
