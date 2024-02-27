package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zj")
public final class Class707 implements Interface75 {

	@OriginalMember(owner = "client!zj", name = "l", descriptor = "I")
	public static final int anInt6118 = 4;

	@OriginalMember(owner = "client!zj", name = "y", descriptor = "Lclient!eu;")
	public static Class106 aClass106_13;

	@OriginalMember(owner = "client!zj", name = "og", descriptor = "J")
	public static long aLong311;

	@OriginalMember(owner = "client!zj", name = "b", descriptor = "[Lclient!cm;")
	static Class100[] aClass100Array9;

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "Lclient!zj;")
	public static final Class707 aClass707_5 = new Class707(0, (byte) -1);

	@OriginalMember(owner = "client!zj", name = "n", descriptor = "Lclient!zj;")
	public static final Class707 aClass707_1 = new Class707(1, (byte) 0);

	@OriginalMember(owner = "client!zj", name = "m", descriptor = "Lclient!zj;")
	public static final Class707 aClass707_2 = new Class707(2, (byte) 1);

	@OriginalMember(owner = "client!zj", name = "k", descriptor = "Lclient!zj;")
	public static final Class707 aClass707_3 = new Class707(3, (byte) 2);

	@OriginalMember(owner = "client!zj", name = "f", descriptor = "Lclient!zj;")
	public static final Class707 aClass707_4 = new Class707(4, (byte) 3);

	@OriginalMember(owner = "client!zj", name = "w", descriptor = "I")
	public final int anInt6119;

	@OriginalMember(owner = "client!zj", name = "u", descriptor = "B")
	public byte aByte176;

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "(I)[Lclient!zj;")
	public static Class707[] method36926(@OriginalArg(0) int arg0) {
		return new Class707[] { aClass707_5, aClass707_1, aClass707_2, aClass707_3, aClass707_4 };
	}

	@OriginalMember(owner = "client!zj", name = "f", descriptor = "()[Lclient!zj;")
	public static Class707[] method36927() {
		return new Class707[] { aClass707_5, aClass707_1, aClass707_2, aClass707_3, aClass707_4 };
	}

	@OriginalMember(owner = "client!zj", name = "ql", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method36928(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30778(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray22 = Class499.method30329(local13, arg2, -866140584);
		arg0.anIntArray382 = local18;
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!zj", name = "w", descriptor = "()[Lclient!zj;")
	public static Class707[] method36929() {
		return new Class707[] { aClass707_5, aClass707_1, aClass707_2, aClass707_3, aClass707_4 };
	}

	@OriginalMember(owner = "client!zj", name = "r", descriptor = "(ILclient!com/jagex/twitchtv/TwitchEvent;B)V")
	public static void method36932(@OriginalArg(0) int arg0, @OriginalArg(1) TwitchEvent arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class93_Sub1_Sub13 local5 = Class623.method32331(Class155.aClass155_66, arg0, -1, (short) -16954);
		if (local5 == null) {
			return;
		}
		@Pc(11) Class681 local11 = Class96.method2324(1625335626);
		if (local5.anInt3066 * 801418781 != 0) {
			local11.aLongArray26 = new long[local5.anInt3066 * 801418781];
		}
		if (local5.anInt3065 * 341680345 != 0) {
			local11.anIntArray519 = new int[local5.anInt3065 * 341680345];
		}
		if (local5.anInt3064 * -1520226159 != 0) {
			local11.anObjectArray44 = new String[local5.anInt3064 * -1520226159];
		}
		arg1.method25473(local11.anIntArray519, local11.aLongArray26, local11.anObjectArray44);
		Class91.method1706(local5, 500000, local11, 634588949);
	}

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "(ZB)V")
	public static void method36933(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method445((byte) 75); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method415(1672312124)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30972(150, (byte) -55);
				Class274.aClass258_11.method26161(local4.aClass539_3, 1646929685);
				local4.aClass539_3 = null;
			}
			if (local4.aClass539_4 != null) {
				local4.aClass539_4.method30972(150, (byte) -16);
				Class274.aClass258_11.method26161(local4.aClass539_4, 1959774213);
				local4.aClass539_4 = null;
			}
			local4.method23981(1475414863);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method445((byte) 88); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method415(910148565)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30972(150, (byte) -62);
				Class274.aClass258_11.method26161(local4.aClass539_3, 1810545141);
				local4.aClass539_3 = null;
			}
			local4.method23981(-1216730711);
		}
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass16_11.method220((byte) -23); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass16_11.method222(1619221732)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30972(150, (byte) -2);
				Class274.aClass258_11.method26161(local4.aClass539_3, 2026734998);
				local4.aClass539_3 = null;
			}
			local4.method23981(1900334078);
		}
	}

	@OriginalMember(owner = "client!zj", name = "<init>", descriptor = "(IB)V")
	Class707(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt6119 = arg0 * 597556497;
		this.aByte176 = arg1;
	}

	@OriginalMember(owner = "client!zj", name = "u", descriptor = "()I")
	public int method36925() {
		return this.aByte176 + 1;
	}

	@OriginalMember(owner = "client!zj", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.aByte176;
	}

	@OriginalMember(owner = "client!zj", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.aByte176;
	}

	@OriginalMember(owner = "client!zj", name = "l", descriptor = "()I")
	public int method36930() {
		return this.aByte176 + 1;
	}

	@OriginalMember(owner = "client!zj", name = "m", descriptor = "(B)I")
	public int method36931(@OriginalArg(0) byte arg0) {
		return this.aByte176 + 1;
	}
}
