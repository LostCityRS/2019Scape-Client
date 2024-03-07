package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class545 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	static final int anInt5288 = 4096;

	@OriginalMember(owner = "client!sb", name = "uc", descriptor = "I")
	public static int anInt5289;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[B")
	static byte[] aByteArray98 = new byte[2048];

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[Lclient!sf;")
	Class548[] aClass548Array1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[Lclient!jh;")
	Class361[] aClass361Array5;

	static {
		@Pc(4) byte local4 = 22;
		@Pc(6) int local6 = 2;
		aByteArray98[0] = 0;
		aByteArray98[1] = 1;
		for (@Pc(16) int local16 = 2; local16 < local4; local16++) {
			@Pc(27) int local27 = 0x1 << (local16 >> 1) - 1;
			@Pc(29) int local29 = 0;
			while (local29 < local27) {
				aByteArray98[local6] = (byte) local16;
				local29++;
				local6++;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 48)
	Class545() {
		Class607.method31921(35172547);
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

	@OriginalMember(owner = "client!sb", name = "ayw", descriptor = "(Lclient!yf;I)V", line = 14113)
	static final void method30960(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.javascript) {
			Class447.aClass447_7.method28913(-2005443579);
		}
	}

	@OriginalMember(owner = "client!sb", name = "bbl", descriptor = "(Lclient!yf;I)V", line = 14460)
	static final void method30961(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		client.aBoolean617 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		if (client.aBoolean617) {
			Class132_Sub1_Sub1_Sub1.method19950((byte) 11);
		}
	}
}
