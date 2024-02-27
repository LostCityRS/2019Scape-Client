package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class435 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static final int anInt4969 = 910;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public static final int anInt4970 = 1;

	@OriginalMember(owner = "client!nf", name = "aeg", descriptor = "(Lclient!yf;B)V")
	static void method28983(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(14) long local14 = (long) arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(25) long local25 = (long) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(36) long local36 = (long) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) (local14 * local36 / local25);
	}

	@OriginalMember(owner = "client!nf", name = "bfi", descriptor = "(Lclient!yf;I)V")
	static void method28984(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nf", name = "pg", descriptor = "(Lclient!yf;B)V")
	static void method28985(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class647.method32829(local11, local14, arg0, 623031163);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	Class435() throws Throwable {
		throw new Error();
	}
}
