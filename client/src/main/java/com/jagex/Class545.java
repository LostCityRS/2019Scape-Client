package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class545 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	static final int anInt5449 = 4096;

	@OriginalMember(owner = "client!sb", name = "uc", descriptor = "I")
	public static int anInt5450;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[B")
	static byte[] aByteArray99 = new byte[2048];

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[Lclient!sf;")
	Class548[] aClass548Array1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[Lclient!jh;")
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

	@OriginalMember(owner = "client!sb", name = "bbl", descriptor = "(Lclient!yf;I)V")
	static void method31141(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		client.aBoolean619 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		if (client.aBoolean619) {
			Class132_Sub1_Sub1_Sub1.method20058((byte) 11);
		}
	}

	@OriginalMember(owner = "client!sb", name = "ayw", descriptor = "(Lclient!yf;I)V")
	static void method31142(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.aBoolean634) {
			Class447.aClass447_7.method29085(-2005443579);
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	Class545() {
		Class607.method32109(35172547);
		this.aClass548Array1 = new Class548[4096];
		new Class371();
		this.aClass361Array5 = new Class361[4];
		new Class361(4);
		new Class148_Sub1(this);
		new Class148_Sub1(this);
		new Class557(this);
		@Pc(38) int local38;
		for (local38 = 0; local38 < 4096; local38++) {
			this.aClass548Array1[local38] = new Class548(this);
		}
		for (local38 = 0; local38 < 4; local38++) {
			this.aClass361Array5[local38] = new Class361(6);
		}
	}
}
