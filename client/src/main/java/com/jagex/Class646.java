package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class646 {

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Lclient!ws;")
	static final Class646 aClass646_4 = new Class646(0);

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!ws;")
	static final Class646 aClass646_3 = new Class646(1);

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!ws;")
	public static final Class646 aClass646_5 = new Class646(2);

	@OriginalMember(owner = "client!ws", name = "ark", descriptor = "(Lclient!yp;I)V")
	static void method33046(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3842 * 1685375823;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3832 * -1853463165;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3836 * -416468237;
		Class238.anInt3842 = 1539123362;
		Class238.anInt3832 = 72363733;
		Class238.anInt3836 = -710030907;
	}

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "(I)[Lclient!km;")
	public static Class383[] method33047(@OriginalArg(0) int arg0) {
		return new Class383[] { Class383.aClass383_12, Class383.aClass383_11, Class383.aClass383_13 };
	}

	@OriginalMember(owner = "client!ws", name = "aj", descriptor = "(IIB)V")
	static void method33048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		Class630.anInt5560 = arg0 * -1975050535;
		Class630.anInt5562 = arg1 * -659272535;
	}

	@OriginalMember(owner = "client!ws", name = "ar", descriptor = "(IIIIIIILclient!arz;Lclient!ed;Lclient!aan;IIB)V")
	static void method33049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class80_Sub1_Sub11 arg7, @OriginalArg(8) Class104 arg8, @OriginalArg(9) Class15 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt45 * 1190692343 - 1 && arg1 < arg6 + arg9.anInt46 * -191270971 && arg7.aBoolean587) {
			arg10 = arg11;
		}
		@Pc(34) int[] local34 = Class357.method28122(arg7, -1021260488);
		@Pc(38) String local38 = Class665.method33451(arg7, (byte) 8);
		if (local34 != null) {
			local38 = local38 + Class279.method26846(local34, 1593328944);
		}
		arg8.method7636(local38, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class622.anInt5488, Class344.aClass99Array6, null, -1897112221);
		if (arg7.aBoolean588) {
			Class11.aClass99_1.method18225(arg2 + 5 + arg9.method374(local38, Class344.aClass99Array6, -1856024496), arg6 - arg9.anInt45 * 1190692343);
		}
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(I)V")
	Class646(@OriginalArg(0) int arg0) {
	}
}
