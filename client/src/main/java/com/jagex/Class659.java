package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!xg")
public final class Class659 {

	@OriginalMember(owner = "client!xg", name = "t", descriptor = "Lclient!mr;")
	static Class138 aClass138_6 = null;

	@OriginalMember(owner = "client!xg", name = "r", descriptor = "(IIFLclient!ms;)V")
	public static void method33269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3) {
		if (aClass138_6 != null) {
			aClass138_6.method11516(15439498).method29046(arg0, arg1, arg2, arg3, -732008798);
		}
	}

	@OriginalMember(owner = "client!xg", name = "q", descriptor = "(I)Lclient!mb;")
	public static Class413 method33270(@OriginalArg(0) int arg0) {
		return aClass138_6 == null ? null : aClass138_6.method11516(15439498).method29045(arg0, -546401625);
	}

	@OriginalMember(owner = "client!xg", name = "m", descriptor = "(Lclient!xv;)V")
	public static void method33271(@OriginalArg(0) Class671 arg0) {
		if (arg0.aClass427_3 == Class427.aClass427_2) {
			aClass138_6 = new Class138_Sub1(arg0);
		} else if (arg0.aClass427_3 == Class427.aClass427_1) {
			aClass138_6 = new Class138_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xg", name = "o", descriptor = "(Lclient!xv;)V")
	public static void method33272(@OriginalArg(0) Class671 arg0) {
		if (arg0.aClass427_3 == Class427.aClass427_2) {
			aClass138_6 = new Class138_Sub1(arg0);
		} else if (arg0.aClass427_3 == Class427.aClass427_1) {
			aClass138_6 = new Class138_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xg", name = "a", descriptor = "()V")
	public static void method33273() {
		if (aClass138_6 != null) {
			aClass138_6.method11509((byte) -31);
		}
	}

	@OriginalMember(owner = "client!xg", name = "x", descriptor = "(Lclient!pf;ILclient!wp;ZLclient!ej;)Lclient!wc;")
	public static Interface68 method33274(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface70 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class243 arg4) {
		if (aClass138_6 == null) {
			return null;
		} else {
			return (Interface68) (arg3 ? new Class643(arg0, arg1, aClass138_6, arg2) : new Class642(arg0, arg1, aClass138_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xg", name = "s", descriptor = "()V")
	public static void method33275() {
		if (aClass138_6 != null) {
			aClass138_6.method11509((byte) -45);
		}
	}

	@OriginalMember(owner = "client!xg", name = "z", descriptor = "(II)Z")
	public static boolean method33276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aClass138_6 == null || aClass138_6.method11516(15439498) == null) {
			return false;
		} else if (arg0 == arg1) {
			return true;
		} else {
			@Pc(19) Class413 local19 = aClass138_6.method11516(15439498).method29045(arg0, 1336396872);
			@Pc(26) Class413 local26 = aClass138_6.method11516(15439498).method29045(arg1, 204850401);
			@Pc(28) Class413 local28 = local19;
			do {
				if (local28 == null) {
					local28 = local26;
					do {
						if (local28 == null) {
							return false;
						}
						local28 = local28.method28974((short) -31352);
						if (local19 == local28) {
							return true;
						}
					} while (local28 != local26);
					return false;
				}
				local28 = local28.method28974((short) -12512);
				if (local26 == local28) {
					return true;
				}
			} while (local28 != local19);
			return false;
		}
	}

	@OriginalMember(owner = "client!xg", name = "w", descriptor = "(IIFLclient!ms;)V")
	public static void method33277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3) {
		if (aClass138_6 != null) {
			aClass138_6.method11516(15439498).method29046(arg0, arg1, arg2, arg3, -1977361415);
		}
	}

	@OriginalMember(owner = "client!xg", name = "k", descriptor = "(Lclient!pf;ILclient!wp;ZLclient!ej;)Lclient!wc;")
	public static Interface68 method33278(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface70 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class243 arg4) {
		if (aClass138_6 == null) {
			return null;
		} else {
			return (Interface68) (arg3 ? new Class643(arg0, arg1, aClass138_6, arg2) : new Class642(arg0, arg1, aClass138_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xg", name = "j", descriptor = "()V")
	public static void method33279() {
		if (aClass138_6 != null) {
			aClass138_6.method11528(-136161025);
			aClass138_6 = null;
		}
	}

	@OriginalMember(owner = "client!xg", name = "h", descriptor = "(I)Lclient!mb;")
	public static Class413 method33280(@OriginalArg(0) int arg0) {
		return aClass138_6 == null ? null : aClass138_6.method11516(15439498).method29045(arg0, -1149653274);
	}

	@OriginalMember(owner = "client!xg", name = "d", descriptor = "(I)Lclient!mb;")
	public static Class413 method33281(@OriginalArg(0) int arg0) {
		return aClass138_6 == null ? null : aClass138_6.method11516(15439498).method29045(arg0, -2113941932);
	}

	@OriginalMember(owner = "client!xg", name = "yr", descriptor = "(Lclient!yp;B)V")
	static void method33282(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class618.method32296(local13, local23, false, false, (short) 255);
	}

	@OriginalMember(owner = "client!xg", name = "bfk", descriptor = "(Lclient!yp;S)V")
	static void method33283(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!xg", name = "azy", descriptor = "(Lclient!yp;B)V")
	static void method33284(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16350((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!xg", name = "tk", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method33285(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class15 local5 = arg0.method27636(Class317.aClass464_1, client.anInterface49_1, -2128202924);
		@Pc(18) int local18 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(34) Point local34 = local5.method402(arg0.aString183, arg0.anInt4103 * 1892149809, arg0.anInt4175 * -141942121, local18, Class344.aClass99Array6, (byte) 107);
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local34.x;
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local34.y;
	}

	@OriginalMember(owner = "client!xg", name = "<init>", descriptor = "()V")
	Class659() throws Throwable {
		throw new Error();
	}
}
