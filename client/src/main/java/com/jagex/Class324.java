package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class324 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	static final int anInt4069 = 4;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	static final int anInt4070 = 256;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	static final int anInt4071 = 2;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "[Lclient!hj;")
	Class315[] aClass315Array1;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Ljava/lang/String;")
	String aString180;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "[Lclient!hi;")
	Class314[] aClass314Array1;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "[Lclient!hi;")
	Class314[] aClass314Array2;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "(Lclient!yp;I)V")
	static void method27615(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Class21.method532(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 341382976);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14;
	}

	@OriginalMember(owner = "client!hs", name = "ay", descriptor = "(Lclient!yp;I)V")
	static void method27616(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		if (arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == arg0.anIntArray525[arg0.anInt5778 * 1896589581]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!hs", name = "amu", descriptor = "(Lclient!yp;I)V")
	static void method27617(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(47) Class626 local47 = client.aClass539_1.method30893((byte) -18);
		Class267.method26666((local13 >> 14 & 0x3FFF) - local47.anInt5540 * -390642507, (local13 & 0x3FFF) - local47.anInt5537 * -894305615, local23 << 2, local33, local43, (byte) -88);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!hs", name = "bew", descriptor = "(Lclient!yp;I)V")
	static void method27618(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(14) int local14 = -1;
		if (Class245.aList4 != null && local12 >= 0 && local12 < Class245.aList4.size()) {
			local14 = (Integer) Class245.aList4.get(local12);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14;
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(B)V")
	public static void method27619(@OriginalArg(0) byte arg0) {
		Class238.anInt3841 = -1688917340;
		Class238.anInt3846 = 774603938;
		Class238.anInt3850 = 1422958430;
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "([B)V")
	public Class324(@OriginalArg(0) byte[] arg0) throws Exception_Sub4 {
		this.method27612(arg0, -1658833302);
	}

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "([BI)V")
	void method27612(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		@Pc(4) Class318 local4 = new Class318(arg0);
		@Pc(8) int local8 = local4.method27520(-1886910093);
		if (local8 != 4) {
			throw new Exception_Sub4(this, local8, 4);
		}
		this.aString180 = local4.method27519((byte) 14);
		this.aClass314Array2 = new Class314[local4.method27520(-1850076000)];
		this.aClass314Array1 = new Class314[local4.method27520(-1843083993)];
		this.aClass315Array1 = new Class315[local4.method27520(-2064257912)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass314Array2.length; local43++) {
			this.aClass314Array2[local43] = new Class314();
			this.aClass314Array2[local43].method27488(local4, 2027555600);
		}
		for (local43 = 0; local43 < this.aClass314Array1.length; local43++) {
			this.aClass314Array1[local43] = new Class314();
			this.aClass314Array1[local43].method27488(local4, 1778704763);
		}
		for (local43 = 0; local43 < this.aClass315Array1.length; local43++) {
			this.aClass315Array1[local43] = new Class315();
			this.aClass315Array1[local43].method27494(local4, (byte) 52);
		}
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "([B)V")
	void method27613(@OriginalArg(0) byte[] arg0) throws Exception_Sub4 {
		@Pc(4) Class318 local4 = new Class318(arg0);
		@Pc(8) int local8 = local4.method27520(-1840879686);
		if (local8 != 4) {
			throw new Exception_Sub4(this, local8, 4);
		}
		this.aString180 = local4.method27519((byte) 14);
		this.aClass314Array2 = new Class314[local4.method27520(-1970909486)];
		this.aClass314Array1 = new Class314[local4.method27520(-1850412297)];
		this.aClass315Array1 = new Class315[local4.method27520(-2119031001)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass314Array2.length; local43++) {
			this.aClass314Array2[local43] = new Class314();
			this.aClass314Array2[local43].method27488(local4, -1530089309);
		}
		for (local43 = 0; local43 < this.aClass314Array1.length; local43++) {
			this.aClass314Array1[local43] = new Class314();
			this.aClass314Array1[local43].method27488(local4, 1801095454);
		}
		for (local43 = 0; local43 < this.aClass315Array1.length; local43++) {
			this.aClass315Array1[local43] = new Class315();
			this.aClass315Array1[local43].method27494(local4, (byte) 53);
		}
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "([B)V")
	void method27614(@OriginalArg(0) byte[] arg0) throws Exception_Sub4 {
		@Pc(4) Class318 local4 = new Class318(arg0);
		@Pc(8) int local8 = local4.method27520(-2063031927);
		if (local8 != 4) {
			throw new Exception_Sub4(this, local8, 4);
		}
		this.aString180 = local4.method27519((byte) 14);
		this.aClass314Array2 = new Class314[local4.method27520(-1891255962)];
		this.aClass314Array1 = new Class314[local4.method27520(-2135914044)];
		this.aClass315Array1 = new Class315[local4.method27520(-2077661343)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass314Array2.length; local43++) {
			this.aClass314Array2[local43] = new Class314();
			this.aClass314Array2[local43].method27488(local4, -39487211);
		}
		for (local43 = 0; local43 < this.aClass314Array1.length; local43++) {
			this.aClass314Array1[local43] = new Class314();
			this.aClass314Array1[local43].method27488(local4, 86273147);
		}
		for (local43 = 0; local43 < this.aClass315Array1.length; local43++) {
			this.aClass315Array1[local43] = new Class315();
			this.aClass315Array1[local43].method27494(local4, (byte) -9);
		}
	}
}
