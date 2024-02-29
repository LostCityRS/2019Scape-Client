package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public class Class582 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	static final int anInt5417 = 4;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
	static final int anInt5418 = 6;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	static final int anInt5419 = 2;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	static final int anInt5420 = 4;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	static final int anInt5421 = 2;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	static final int anInt5422 = 12;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	static final int anInt5423 = 4;

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
	static final int anInt5424 = 4;

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
	static final int anInt5425 = 128;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	static final int anInt5426 = 8;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
	static final int anInt5427 = 3;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	static final int anInt5428 = 16;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	static final int anInt5429 = 4;

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
	static final int anInt5430 = 16;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
	static final int anInt5431 = 3;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
	static final int anInt5432 = 14;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
	static final int anInt5433 = 8;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	static final int anInt5434 = 8;

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
	static final int anInt5435 = 8;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 24)
	Class582() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "()I", line = 29)
	static final int method31400() {
		return 0;
	}

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "(I)I", line = 33)
	static final int method31401(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)I", line = 33)
	static final int method31402(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)I", line = 39)
	static final int method31403(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I", line = 43)
	static final int method31404(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "(I)I", line = 47)
	static final int method31405(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "(I)Z", line = 51)
	static final boolean method31406(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(I)Z", line = 51)
	static final boolean method31407(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "(I)I", line = 55)
	static final int method31408(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "(I)I", line = 55)
	static final int method31409(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "(I)I", line = 55)
	static final int method31410(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(Ljava/lang/String;I)I", line = 166)
	public static int method31411(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!tu", name = "pt", descriptor = "(Lclient!yf;I)V", line = 7686)
	static final void method31412(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24575(local11, local14, arg0, -845584146);
	}

	@OriginalMember(owner = "client!tu", name = "qw", descriptor = "(Lclient!yf;I)V", line = 7962)
	static final void method31413(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 451182621);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class132_Sub1_Sub3_Sub2.method12585(local16, local22, arg0, (byte) -64);
	}

	@OriginalMember(owner = "client!tu", name = "aqs", descriptor = "(Lclient!yf;B)V", line = 12848)
	static final void method31414(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!tu", name = "arl", descriptor = "(Lclient!yf;I)V", line = 12927)
	static final void method31415(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean608 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tu", name = "bfo", descriptor = "(Lclient!yf;I)V", line = 15103)
	static final void method31416(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
	}
}
