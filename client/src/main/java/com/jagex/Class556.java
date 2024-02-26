package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class556 {

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	static final int anInt5178 = 4096;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "[B")
	static byte[] aByteArray99 = new byte[2048];

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[Lclient!si;")
	Class550[] aClass550Array1;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "[Lclient!ji;")
	Class361[] aClass361Array5;

	static {
		@Pc(4) byte local4 = 22;
		@Pc(6) int local6 = 2;
		aByteArray99[0] = 0;
		aByteArray99[1] = 1;
		for (@Pc(16) int local16 = 2; local16 < local4; local16++) {
			@Pc(27) int local27 = 0x1 << (local16 >> 1) - 1;
			@Pc(29) int local29 = 0;
			while (local29 < local27) {
				aByteArray99[local6] = (byte) local16;
				local29++;
				local6++;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "aty", descriptor = "(Lclient!yp;B)V")
	static void method31371(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!so", name = "ft", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method31372(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4168 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 2068177093;
		Class296.method26998(arg0, 940317179);
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	Class556() {
		Class293.method26957(1548947598);
		this.aClass550Array1 = new Class550[4096];
		new Class356();
		this.aClass361Array5 = new Class361[4];
		new Class361(4);
		new Class148_Sub1(this);
		new Class148_Sub1(this);
		new Class546(this);
		@Pc(38) int local38;
		for (local38 = 0; local38 < 4096; local38++) {
			this.aClass550Array1[local38] = new Class550(this);
		}
		for (local38 = 0; local38 < 4; local38++) {
			this.aClass361Array5[local38] = new Class361(6);
		}
	}
}
