package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class538 {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	public static final int anInt5081 = 5;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public static final int anInt5082 = 3;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public static final int anInt5083 = 0;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	public static final int anInt5084 = 2;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	public static final int anInt5085 = 1;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
	public static final int anInt5086 = 8;

	@OriginalMember(owner = "client!ru", name = "sq", descriptor = "(Lclient!yp;I)V")
	static void method30882(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4167 * 1052460537;
	}

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "(I)[Lclient!zj;")
	public static Class708[] method30883(@OriginalArg(0) int arg0) {
		return new Class708[] { Class708.aClass708_4, Class708.aClass708_11, Class708.aClass708_9, Class708.aClass708_2, Class708.aClass708_5, Class708.aClass708_3, Class708.aClass708_7, Class708.aClass708_10, Class708.aClass708_8, Class708.aClass708_6 };
	}

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "(J)I")
	public static int method30884(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!ru", name = "azg", descriptor = "(Lclient!yp;B)V")
	static void method30885(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ru", name = "axe", descriptor = "(Lclient!yp;I)V")
	static void method30886(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(9, local13, local23, "", 2141814579);
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	Class538() throws Throwable {
		throw new Error();
	}
}
