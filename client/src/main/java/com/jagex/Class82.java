package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adj")
public final class Class82 {

	@OriginalMember(owner = "client!adj", name = "t", descriptor = "Lclient!adj;")
	static final Class82 aClass82_21 = new Class82(6, 0);

	@OriginalMember(owner = "client!adj", name = "f", descriptor = "Lclient!adj;")
	static final Class82 aClass82_2 = new Class82(0, 1);

	@OriginalMember(owner = "client!adj", name = "e", descriptor = "Lclient!adj;")
	static final Class82 aClass82_31 = new Class82(18, 2);

	@OriginalMember(owner = "client!adj", name = "u", descriptor = "Lclient!adj;")
	static final Class82 aClass82_4 = new Class82(5, 3);

	@OriginalMember(owner = "client!adj", name = "l", descriptor = "Lclient!adj;")
	static final Class82 aClass82_5 = new Class82(16, 10);

	@OriginalMember(owner = "client!adj", name = "g", descriptor = "Lclient!adj;")
	static final Class82 aClass82_6 = new Class82(2, 11);

	@OriginalMember(owner = "client!adj", name = "i", descriptor = "Lclient!adj;")
	static final Class82 aClass82_7 = new Class82(4, 12);

	@OriginalMember(owner = "client!adj", name = "m", descriptor = "Lclient!adj;")
	static final Class82 aClass82_8 = new Class82(1, 13);

	@OriginalMember(owner = "client!adj", name = "o", descriptor = "Lclient!adj;")
	static final Class82 aClass82_9 = new Class82(7, 14);

	@OriginalMember(owner = "client!adj", name = "j", descriptor = "Lclient!adj;")
	static final Class82 aClass82_10 = new Class82(24, 15);

	@OriginalMember(owner = "client!adj", name = "a", descriptor = "Lclient!adj;")
	static final Class82 aClass82_11 = new Class82(11, 16);

	@OriginalMember(owner = "client!adj", name = "s", descriptor = "Lclient!adj;")
	static final Class82 aClass82_3 = new Class82(14, 17);

	@OriginalMember(owner = "client!adj", name = "k", descriptor = "Lclient!adj;")
	static final Class82 aClass82_13 = new Class82(28, 20);

	@OriginalMember(owner = "client!adj", name = "x", descriptor = "Lclient!adj;")
	static final Class82 aClass82_18 = new Class82(10, 21);

	@OriginalMember(owner = "client!adj", name = "w", descriptor = "Lclient!adj;")
	static final Class82 aClass82_14 = new Class82(20, 22);

	@OriginalMember(owner = "client!adj", name = "r", descriptor = "Lclient!adj;")
	static final Class82 aClass82_15 = new Class82(26, 30);

	@OriginalMember(owner = "client!adj", name = "q", descriptor = "Lclient!adj;")
	static final Class82 aClass82_16 = new Class82(13, 31);

	@OriginalMember(owner = "client!adj", name = "h", descriptor = "Lclient!adj;")
	static final Class82 aClass82_1 = new Class82(21, 32);

	@OriginalMember(owner = "client!adj", name = "d", descriptor = "Lclient!adj;")
	static final Class82 aClass82_19 = new Class82(17, 33);

	@OriginalMember(owner = "client!adj", name = "z", descriptor = "Lclient!adj;")
	static final Class82 aClass82_28 = new Class82(25, 40);

	@OriginalMember(owner = "client!adj", name = "p", descriptor = "Lclient!adj;")
	static final Class82 aClass82_20 = new Class82(9, 41);

	@OriginalMember(owner = "client!adj", name = "v", descriptor = "Lclient!adj;")
	static final Class82 aClass82_30 = new Class82(12, 42);

	@OriginalMember(owner = "client!adj", name = "y", descriptor = "Lclient!adj;")
	static final Class82 aClass82_22 = new Class82(8, 43);

	@OriginalMember(owner = "client!adj", name = "n", descriptor = "Lclient!adj;")
	static final Class82 aClass82_12 = new Class82(22, 50);

	@OriginalMember(owner = "client!adj", name = "c", descriptor = "Lclient!adj;")
	static final Class82 aClass82_24 = new Class82(30, 51);

	@OriginalMember(owner = "client!adj", name = "b", descriptor = "Lclient!adj;")
	static final Class82 aClass82_23 = new Class82(15, 52);

	@OriginalMember(owner = "client!adj", name = "ax", descriptor = "Lclient!adj;")
	static final Class82 aClass82_26 = new Class82(23, 53);

	@OriginalMember(owner = "client!adj", name = "ay", descriptor = "Lclient!adj;")
	static final Class82 aClass82_27 = new Class82(27, 60);

	@OriginalMember(owner = "client!adj", name = "ai", descriptor = "Lclient!adj;")
	static final Class82 aClass82_17 = new Class82(3, 61);

	@OriginalMember(owner = "client!adj", name = "aq", descriptor = "Lclient!adj;")
	static final Class82 aClass82_29 = new Class82(29, 70);

	@OriginalMember(owner = "client!adj", name = "ao", descriptor = "Lclient!adj;")
	static final Class82 aClass82_25 = new Class82(19, 255);

	@OriginalMember(owner = "client!adj", name = "aj", descriptor = "I")
	public final int anInt257;

	@OriginalMember(owner = "client!adj", name = "ac", descriptor = "I")
	int anInt258;

	@OriginalMember(owner = "client!adj", name = "o", descriptor = "(I)Lclient!adj;")
	public static Class82 method1553(@OriginalArg(0) int arg0) {
		@Pc(2) Class82[] local2 = Class507.method30512((byte) -83);
		@Pc(4) Class82[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class82 local14 = local4[local6];
			if (local14.anInt258 * 458152375 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!adj", name = "e", descriptor = "()[Lclient!adj;")
	static Class82[] method1554() {
		return new Class82[] { aClass82_20, aClass82_22, aClass82_19, aClass82_18, aClass82_23, aClass82_1, aClass82_16, aClass82_9, aClass82_3, aClass82_15, aClass82_2, aClass82_7, aClass82_21, aClass82_14, aClass82_27, aClass82_28, aClass82_10, aClass82_11, aClass82_12, aClass82_25, aClass82_4, aClass82_26, aClass82_30, aClass82_17, aClass82_8, aClass82_24, aClass82_31, aClass82_29, aClass82_13, aClass82_5, aClass82_6 };
	}

	@OriginalMember(owner = "client!adj", name = "l", descriptor = "()[Lclient!adj;")
	static Class82[] method1555() {
		return new Class82[] { aClass82_20, aClass82_22, aClass82_19, aClass82_18, aClass82_23, aClass82_1, aClass82_16, aClass82_9, aClass82_3, aClass82_15, aClass82_2, aClass82_7, aClass82_21, aClass82_14, aClass82_27, aClass82_28, aClass82_10, aClass82_11, aClass82_12, aClass82_25, aClass82_4, aClass82_26, aClass82_30, aClass82_17, aClass82_8, aClass82_24, aClass82_31, aClass82_29, aClass82_13, aClass82_5, aClass82_6 };
	}

	@OriginalMember(owner = "client!adj", name = "g", descriptor = "()[Lclient!adj;")
	static Class82[] method1556() {
		return new Class82[] { aClass82_20, aClass82_22, aClass82_19, aClass82_18, aClass82_23, aClass82_1, aClass82_16, aClass82_9, aClass82_3, aClass82_15, aClass82_2, aClass82_7, aClass82_21, aClass82_14, aClass82_27, aClass82_28, aClass82_10, aClass82_11, aClass82_12, aClass82_25, aClass82_4, aClass82_26, aClass82_30, aClass82_17, aClass82_8, aClass82_24, aClass82_31, aClass82_29, aClass82_13, aClass82_5, aClass82_6 };
	}

	@OriginalMember(owner = "client!adj", name = "u", descriptor = "()[Lclient!adj;")
	static Class82[] method1557() {
		return new Class82[] { aClass82_20, aClass82_22, aClass82_19, aClass82_18, aClass82_23, aClass82_1, aClass82_16, aClass82_9, aClass82_3, aClass82_15, aClass82_2, aClass82_7, aClass82_21, aClass82_14, aClass82_27, aClass82_28, aClass82_10, aClass82_11, aClass82_12, aClass82_25, aClass82_4, aClass82_26, aClass82_30, aClass82_17, aClass82_8, aClass82_24, aClass82_31, aClass82_29, aClass82_13, aClass82_5, aClass82_6 };
	}

	@OriginalMember(owner = "client!adj", name = "m", descriptor = "(I)Lclient!adj;")
	public static Class82 method1558(@OriginalArg(0) int arg0) {
		@Pc(2) Class82[] local2 = Class507.method30512((byte) -128);
		@Pc(4) Class82[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class82 local14 = local4[local6];
			if (local14.anInt258 * 458152375 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!adj", name = "i", descriptor = "(I)Lclient!adj;")
	public static Class82 method1559(@OriginalArg(0) int arg0) {
		@Pc(2) Class82[] local2 = Class507.method30512((byte) -75);
		@Pc(4) Class82[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class82 local14 = local4[local6];
			if (local14.anInt258 * 458152375 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!adj", name = "<init>", descriptor = "(II)V")
	Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt257 = arg0 * -820199087;
		this.anInt258 = arg1 * -908569593;
	}
}
