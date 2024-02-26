package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class379 implements Interface75 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!kg;")
	static final Class379 aClass379_6 = new Class379(5, 1);

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!kg;")
	static final Class379 aClass379_15 = new Class379(13, 2);

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!kg;")
	static final Class379 aClass379_3 = new Class379(3, 3);

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Lclient!kg;")
	static final Class379 aClass379_4 = new Class379(9, 4);

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!kg;")
	static final Class379 aClass379_5 = new Class379(0, 5);

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!kg;")
	static final Class379 aClass379_2 = new Class379(14, 6);

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!kg;")
	static final Class379 aClass379_7 = new Class379(10, 7);

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!kg;")
	static final Class379 aClass379_8 = new Class379(12, 8);

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!kg;")
	static final Class379 aClass379_14 = new Class379(2, 9);

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!kg;")
	static final Class379 aClass379_9 = new Class379(8, 10);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!kg;")
	static final Class379 aClass379_10 = new Class379(4, 11);

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!kg;")
	static final Class379 aClass379_11 = new Class379(6, 12);

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!kg;")
	static final Class379 aClass379_12 = new Class379(1, 13);

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Lclient!kg;")
	static final Class379 aClass379_13 = new Class379(7, 14);

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!kg;")
	static final Class379 aClass379_1 = new Class379(11, 15);

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	final int anInt4536;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	final int anInt4537;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "()[Lclient!kg;")
	static Class379[] method28543() {
		return new Class379[] { aClass379_12, aClass379_5, aClass379_11, aClass379_3, aClass379_6, aClass379_7, aClass379_8, aClass379_2, aClass379_4, aClass379_15, aClass379_14, aClass379_9, aClass379_13, aClass379_1, aClass379_10 };
	}

	@OriginalMember(owner = "client!kg", name = "td", descriptor = "(Lclient!yp;I)V")
	static void method28544(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2016588605);
		Class266.method26656(local16, arg0, (byte) -42);
	}

	@OriginalMember(owner = "client!kg", name = "acr", descriptor = "(Lclient!yp;I)V")
	static void method28545(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.anInt4532 * 1957870303;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IS)I")
	public static int method28546(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) Class329.aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (Class329.aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_67) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_67).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
	Class379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4536 = arg0 * 2133064215;
		this.anInt4537 = arg1 * 1902523135;
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4537 * -1250898689;
	}

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4537 * -1250898689;
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt4537 * -1250898689;
	}
}
