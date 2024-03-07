package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public class Class576 {

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	public static final int anInt5399 = 16384;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	static final int anInt5400 = 2048;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	public static final int anInt5401 = 16384;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	static final int anInt5402 = 2048;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 9)
	Class576() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!to", name = "uo", descriptor = "(Lclient!yf;S)V", line = 8705)
	static final void method31349(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(14) Class312 local14 = Class659.method32808(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -168162872);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local14.anInt4045 * 307668159;
	}

	@OriginalMember(owner = "client!to", name = "zu", descriptor = "(Lclient!yf;I)V", line = 9510)
	static final void method31350(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		if (local33 == -1) {
			throw new RuntimeException();
		}
		@Pc(66) Class39 local66 = (Class39) Class19.aClass32_Sub7_5.method18261(local33, 1454891541);
		if (local66.aClass519_2.getId() != local23) {
			throw new RuntimeException();
		} else if (local66.aClass519_1.getId() == local13) {
			@Pc(90) int[] local90 = local66.method764(local43, -1497248091);
			if (local53 < 0 || local90 == null || local90.length <= local53) {
				throw new RuntimeException();
			}
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local90[local53];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!to", name = "acy", descriptor = "(Lclient!yf;I)V", line = 10054)
	static final void method31351(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = arg0.aClass386_3.method28186((byte) 0)[arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1]];
	}
}
