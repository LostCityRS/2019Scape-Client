package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class359 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	int anInt4488;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "[S")
	short[] aShortArray122;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "([SILclient!jc;I)I")
	public static int method28138(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class357 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method28116(arg0, arg1 + local1, 1496036142);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jf", name = "ajp", descriptor = "(Lclient!yp;I)V")
	static void method28139(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!jf", name = "mf", descriptor = "(Lclient!yp;I)V")
	static void method28140(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class174.method24633(local11, local14, arg0, 982674648);
	}

	@OriginalMember(owner = "client!jf", name = "aem", descriptor = "(Lclient!yp;I)V")
	static void method28141(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class637.method32871(local13, local23, local33, (byte) 97);
	}

	@OriginalMember(owner = "client!jf", name = "cr", descriptor = "(Lclient!yp;B)V")
	static void method28142(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class242.method26240(local11, local14, arg0, 975306769);
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	public Class359(@OriginalArg(0) int arg0) {
		this.anInt4488 = arg0 * 558167907;
		this.aShortArray122 = new short[0x1 << arg0];
	}

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "(Lclient!jc;)I")
	public int method28131(@OriginalArg(0) Class357 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4488 * 2083275339; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method28116(this.aShortArray122, local1, 2001031661);
		}
		return local1 - (0x1 << this.anInt4488 * 2083275339);
	}

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "(I)V")
	public void method28132(@OriginalArg(0) int arg0) {
		Class584.method31847(this.aShortArray122, -259177765);
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(Lclient!jc;B)I")
	public int method28133(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4488 * 2083275339; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method28116(this.aShortArray122, local1, 232909746);
		}
		return local1 - (0x1 << this.anInt4488 * 2083275339);
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(Lclient!jc;I)I")
	public int method28134(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4488 * 2083275339; local5++) {
			@Pc(18) int local18 = arg0.method28116(this.aShortArray122, local1, 461061394);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "()V")
	public void method28135() {
		Class584.method31847(this.aShortArray122, -1374040456);
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(Lclient!jc;)I")
	public int method28136(@OriginalArg(0) Class357 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4488 * 2083275339; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method28116(this.aShortArray122, local1, -1607750836);
		}
		return local1 - (0x1 << this.anInt4488 * 2083275339);
	}

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "()V")
	public void method28137() {
		Class584.method31847(this.aShortArray122, -138434808);
	}
}
