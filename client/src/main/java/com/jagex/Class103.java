package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public class Class103 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!zx;")
	static Class721 aClass721_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 8)
	Class103() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!af", name = "k", descriptor = "(Lclient!yf;I)V", line = 25)
	static void method2808(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], -1730143596)).anInt4195 * -1595154141;
	}

	@OriginalMember(owner = "client!af", name = "k", descriptor = "(ILjava/lang/String;I)V", line = 34)
	public static void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class227.method25612(arg0, 0, "", "", "", arg1, null, -2128204174);
	}

	@OriginalMember(owner = "client!af", name = "p", descriptor = "(IIII)Z", line = 326)
	static boolean method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1178117724);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31534(arg0, arg1, arg2, -1309876799);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) -2335);
		}
		local13 = (Interface61) local3.method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 21217);
		}
		local13 = (Interface61) local3.method31556(arg0, arg1, arg2, -968156135);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 4478);
		}
		return local5;
	}

	@OriginalMember(owner = "client!af", name = "ki", descriptor = "(Lclient!yf;I)V", line = 6795)
	static final void method2811(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class79.method1454(local11, local14, arg0, (byte) 13);
	}

	@OriginalMember(owner = "client!af", name = "axw", descriptor = "(Lclient!yf;I)V", line = 13972)
	static final void method2812(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class82.anInt251 * -1802992919;
	}
}
