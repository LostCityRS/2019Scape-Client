package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iz")
public final class Class354 {

	@OriginalMember(owner = "client!iz", name = "e", descriptor = "Lclient!iz;")
	static final Class354 aClass354_14 = new Class354(0);

	@OriginalMember(owner = "client!iz", name = "n", descriptor = "Lclient!iz;")
	static final Class354 aClass354_2 = new Class354(1);

	@OriginalMember(owner = "client!iz", name = "m", descriptor = "Lclient!iz;")
	static final Class354 aClass354_13 = new Class354(2);

	@OriginalMember(owner = "client!iz", name = "k", descriptor = "Lclient!iz;")
	static final Class354 aClass354_4 = new Class354(3);

	@OriginalMember(owner = "client!iz", name = "f", descriptor = "Lclient!iz;")
	static final Class354 aClass354_3 = new Class354(4);

	@OriginalMember(owner = "client!iz", name = "w", descriptor = "Lclient!iz;")
	static final Class354 aClass354_6 = new Class354(5);

	@OriginalMember(owner = "client!iz", name = "l", descriptor = "Lclient!iz;")
	static final Class354 aClass354_7 = new Class354(6);

	@OriginalMember(owner = "client!iz", name = "u", descriptor = "Lclient!iz;")
	static final Class354 aClass354_10 = new Class354(7);

	@OriginalMember(owner = "client!iz", name = "z", descriptor = "Lclient!iz;")
	static final Class354 aClass354_8 = new Class354(8);

	@OriginalMember(owner = "client!iz", name = "p", descriptor = "Lclient!iz;")
	static final Class354 aClass354_9 = new Class354(9);

	@OriginalMember(owner = "client!iz", name = "d", descriptor = "Lclient!iz;")
	static final Class354 aClass354_15 = new Class354(10);

	@OriginalMember(owner = "client!iz", name = "c", descriptor = "Lclient!iz;")
	static final Class354 aClass354_11 = new Class354(11);

	@OriginalMember(owner = "client!iz", name = "r", descriptor = "Lclient!iz;")
	static final Class354 aClass354_12 = new Class354(12);

	@OriginalMember(owner = "client!iz", name = "v", descriptor = "Lclient!iz;")
	static final Class354 aClass354_1 = new Class354(13);

	@OriginalMember(owner = "client!iz", name = "o", descriptor = "Lclient!iz;")
	static final Class354 aClass354_5 = new Class354(14);

	@OriginalMember(owner = "client!iz", name = "s", descriptor = "I")
	final int anInt4257;

	@OriginalMember(owner = "client!iz", name = "avg", descriptor = "(Lclient!yf;S)V")
	static void method27785(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!iz", name = "ayx", descriptor = "(Lclient!yf;I)V")
	static void method27786(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class351.anInt4246 * 225309145;
	}

	@OriginalMember(owner = "client!iz", name = "e", descriptor = "(I)[Lclient!zb;")
	public static Class700[] method27787(@OriginalArg(0) int arg0) {
		return new Class700[] { Class700.aClass700_16, Class700.aClass700_18, Class700.aClass700_3, Class700.aClass700_17, Class700.aClass700_8, Class700.aClass700_6, Class700.aClass700_10, Class700.aClass700_11, Class700.aClass700_13, Class700.aClass700_15, Class700.aClass700_19, Class700.aClass700_9, Class700.aClass700_20, Class700.aClass700_12, Class700.aClass700_7, Class700.aClass700_4, Class700.aClass700_5, Class700.aClass700_2, Class700.aClass700_14 };
	}

	@OriginalMember(owner = "client!iz", name = "wt", descriptor = "(Lclient!yf;I)V")
	static void method27788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class431.method28962(local13, local23, false, (byte) 113);
	}

	@OriginalMember(owner = "client!iz", name = "kh", descriptor = "(Lclient!hf;I)V")
	public static void method27789(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt4052 * -987231457 == client.anInt3554 * 181009007) {
			client.aBooleanArray22[arg0.anInt4010 * -2101991717] = true;
		}
	}

	@OriginalMember(owner = "client!iz", name = "<init>", descriptor = "(I)V")
	Class354(@OriginalArg(0) int arg0) {
		this.anInt4257 = arg0 * 283476463;
	}
}
