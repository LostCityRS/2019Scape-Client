package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public class Class588 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!u;")
	static Class588 aClass588_3;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
	static int[] anIntArray475;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!u;")
	static final Class588 aClass588_1 = new Class588();

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!u;")
	static final Class588 aClass588_2 = new Class588();

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(Lclient!yf;B)V", line = 17)
	static void method31649(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class528.method30392((byte) -1);
	}

	@OriginalMember(owner = "client!u", name = "n", descriptor = "(IB)Z", line = 96)
	public static boolean method31650(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!u", name = "ah", descriptor = "(Lclient!yf;I)V", line = 228)
	static void method31651(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		if (Class683.aBoolean876) {
			Class504.method30195(arg0.anIntArray519[arg0.anInt5891 * -1497248091] != 0, 98582919);
			Class320.method27238(arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] != 0, 802032704);
			Class585.method31429(arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2] != 0, -2027415738);
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 285)
	Class588() {
	}

	@OriginalMember(owner = "client!u", name = "lw", descriptor = "(Lclient!yf;I)V", line = 7096)
	static final void method31652(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class675.method33166(local11, local14, arg0, -1862892858);
	}

	@OriginalMember(owner = "client!u", name = "aqp", descriptor = "(Lclient!yf;I)V", line = 12811)
	static final void method31653(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5888 -= 957530791;
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!u", name = "aqu", descriptor = "(Lclient!yf;B)V", line = 12839)
	static final void method31654(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
