package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class582 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	static final int anInt5578 = 4;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
	static final int anInt5579 = 6;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	static final int anInt5580 = 2;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	static final int anInt5581 = 4;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	static final int anInt5582 = 2;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	static final int anInt5583 = 12;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	static final int anInt5584 = 4;

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
	static final int anInt5585 = 4;

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
	static final int anInt5586 = 128;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	static final int anInt5587 = 8;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
	static final int anInt5588 = 3;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	static final int anInt5589 = 16;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	static final int anInt5590 = 4;

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
	static final int anInt5591 = 16;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
	static final int anInt5592 = 3;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
	static final int anInt5593 = 14;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
	static final int anInt5594 = 8;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	static final int anInt5595 = 8;

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
	static final int anInt5596 = 8;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "()I")
	static int method31581() {
		return 0;
	}

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "(I)I")
	static int method31582(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "(I)I")
	static int method31583(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)I")
	static int method31584(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I")
	static int method31585(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)I")
	static int method31586(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "(I)Z")
	static boolean method31587(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(I)Z")
	static boolean method31588(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "(I)I")
	static int method31589(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "(I)I")
	static int method31590(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "(I)I")
	static int method31591(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "pt", descriptor = "(Lclient!yf;I)V")
	static void method31592(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24585(local11, local14, arg0, -845584146);
	}

	@OriginalMember(owner = "client!tu", name = "bfo", descriptor = "(Lclient!yf;I)V")
	static void method31593(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
	}

	@OriginalMember(owner = "client!tu", name = "arl", descriptor = "(Lclient!yf;I)V")
	static void method31594(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aBoolean610 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(Ljava/lang/String;I)I")
	public static int method31595(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!tu", name = "qw", descriptor = "(Lclient!yf;I)V")
	static void method31596(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 451182621);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class132_Sub1_Sub3_Sub2.method12585(local16, local22, arg0, (byte) -64);
	}

	@OriginalMember(owner = "client!tu", name = "aqs", descriptor = "(Lclient!yf;B)V")
	static void method31597(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	Class582() throws Throwable {
		throw new Error();
	}
}
