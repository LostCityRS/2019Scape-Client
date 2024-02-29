package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agk")
public class Class110_Sub14 extends Class110 {

	@OriginalMember(owner = "client!agk", name = "ae", descriptor = "[Lclient!cm;")
	public static Class100[] aClass100Array4;

	@OriginalMember(owner = "client!agk", name = "n", descriptor = "I")
	final int anInt955;

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "[I")
	final int[] anIntArray83;

	@OriginalMember(owner = "client!agk", name = "m", descriptor = "I")
	final int anInt953;

	@OriginalMember(owner = "client!agk", name = "k", descriptor = "I")
	final int anInt954;

	@OriginalMember(owner = "client!agk", name = "<init>", descriptor = "(Lclient!alw;)V", line = 17)
	Class110_Sub14(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt955 = arg0.method22472(-1434290800) * -1039422713;
		this.anIntArray83 = new int[4];
		this.anInt953 = arg0.method22542(-1410250426) * 519064321;
		Arrays.fill(this.anIntArray83, 0, this.anIntArray83.length, this.anInt953 * -1542933247);
		this.anInt954 = arg0.method22483(-118643075) * -1990374291;
	}

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "()V", line = 26)
	@Override
	public void method20150() {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt955 * 1568395959].method25813(-2058124491);
		if (this.anInt954 * -1738891931 == 0) {
			Class623.method32150(local8, this.anIntArray83, 0, false, 1736878199);
		} else {
			Class133_Sub1.method10075(local8, new int[] { this.anInt953 * -1542933247 }, new int[] { 0 }, new int[] { this.anInt954 * -1738891931 }, (short) 355);
		}
	}

	@OriginalMember(owner = "client!agk", name = "n", descriptor = "(I)V", line = 26)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt955 * 1568395959].method25813(-1100475246);
		if (this.anInt954 * -1738891931 == 0) {
			Class623.method32150(local8, this.anIntArray83, 0, false, 382834664);
		} else {
			Class133_Sub1.method10075(local8, new int[] { this.anInt953 * -1542933247 }, new int[] { 0 }, new int[] { this.anInt954 * -1738891931 }, (short) 98);
		}
	}

	@OriginalMember(owner = "client!agk", name = "w", descriptor = "()Z", line = 32)
	@Override
	boolean method20142() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt953 * -1542933247, 801450270);
		return local8.method26188((byte) -37);
	}

	@OriginalMember(owner = "client!agk", name = "k", descriptor = "(I)Z", line = 32)
	@Override
	boolean method20141(@OriginalArg(0) int arg0) {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt953 * -1542933247, 1722237017);
		return local8.method26188((byte) -119);
	}

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "()Z", line = 32)
	@Override
	boolean method20143() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt953 * -1542933247, -1289167082);
		return local8.method26188((byte) -87);
	}

	@OriginalMember(owner = "client!agk", name = "vr", descriptor = "(Lclient!yf;I)V", line = 8756)
	static final void method8051(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 612605750);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.method25364(local16).method13627((short) 1426);
	}
}
