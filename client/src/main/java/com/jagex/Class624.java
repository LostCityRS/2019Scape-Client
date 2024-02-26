package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class624 {

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!pf;")
	static Class480 aClass480_128;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;Lclient!on;FFFF)V")
	public static void method32442(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) Class463 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg7 > 0.0F) {
			arg5 = Class463.method29472(arg5);
			arg5.method29496(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat297 || Float.isNaN(arg1.aFloat297) || local24 > arg9 || local24 < arg10) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(68) Class463 local68 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(73) Class463 local73 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(78) Class463 local78 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local68.method29500(arg2);
		local73.method29500(arg2);
		local78.method29500(arg2);
		@Pc(98) Class463 local98 = Class463.method29541(Class463.method29498(local68, arg4), Class463.method29498(local73, arg4), Class463.method29498(local78, arg4));
		@Pc(101) Class463 local101 = Class463.method29472(local98);
		local101.method29543();
		@Pc(111) Class463 local111 = Class463.method29562(Class463.method29514(local101, local101), Class463.method29551(arg5, 2.0F));
		@Pc(114) Class463 local114 = Class463.method29472(local21);
		local114.method29543();
		@Pc(119) Class463 local119 = Class463.method29472(local98);
		if (local111.aFloat297 > local114.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 += arg5.aFloat297 * arg0;
				if (local119.aFloat297 > 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			} else {
				local119.aFloat297 -= arg5.aFloat297 * arg0;
				if (local119.aFloat297 < 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			}
		} else if (local101.aFloat297 < arg6.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 -= arg0 * arg5.aFloat297;
				if (local119.aFloat297 < -arg6.aFloat297) {
					local119.aFloat297 = -arg6.aFloat297;
				}
			} else {
				local119.aFloat297 += arg0 * arg5.aFloat297;
				if (local119.aFloat297 > arg6.aFloat297) {
					local119.aFloat297 = arg6.aFloat297;
				}
			}
		}
		if (local111.aFloat295 > local114.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 += arg0 * arg5.aFloat295;
				if (local119.aFloat295 > 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			} else {
				local119.aFloat295 -= arg0 * arg5.aFloat295;
				if (local119.aFloat295 < 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			}
		} else if (local101.aFloat295 < arg6.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 -= arg5.aFloat295 * arg0;
				if (local119.aFloat295 < -arg6.aFloat295) {
					local119.aFloat295 = -arg6.aFloat295;
				}
			} else {
				local119.aFloat295 += arg5.aFloat295 * arg0;
				if (local119.aFloat295 > arg6.aFloat295) {
					local119.aFloat295 = arg6.aFloat295;
				}
			}
		}
		if (local111.aFloat296 > local114.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 += arg5.aFloat296 * arg0;
				if (local119.aFloat296 > 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			} else {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			}
		} else if (local101.aFloat296 < arg6.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < -arg6.aFloat296) {
					local119.aFloat296 = -arg6.aFloat296;
				}
			} else {
				local119.aFloat296 += arg0 * arg5.aFloat296;
				if (local119.aFloat296 > arg6.aFloat296) {
					local119.aFloat296 = arg6.aFloat296;
				}
			}
		}
		@Pc(421) Class463 local421 = Class463.method29551(local68, local119.aFloat297);
		local421.method29484(local73, local119.aFloat295);
		local421.method29484(local78, local119.aFloat296);
		arg4.method29503(local421, 0.8F);
		arg1.method29483(Class463.method29551(arg4, arg0));
		local101.method29557();
		local119.method29557();
		local114.method29557();
	}

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;Lclient!on;FFFF)V")
	public static void method32443(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) Class463 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg7 > 0.0F) {
			arg5 = Class463.method29472(arg5);
			arg5.method29496(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat297 || Float.isNaN(arg1.aFloat297) || local24 > arg9 || local24 < arg10) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(68) Class463 local68 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(73) Class463 local73 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(78) Class463 local78 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local68.method29500(arg2);
		local73.method29500(arg2);
		local78.method29500(arg2);
		@Pc(98) Class463 local98 = Class463.method29541(Class463.method29498(local68, arg4), Class463.method29498(local73, arg4), Class463.method29498(local78, arg4));
		@Pc(101) Class463 local101 = Class463.method29472(local98);
		local101.method29543();
		@Pc(111) Class463 local111 = Class463.method29562(Class463.method29514(local101, local101), Class463.method29551(arg5, 2.0F));
		@Pc(114) Class463 local114 = Class463.method29472(local21);
		local114.method29543();
		@Pc(119) Class463 local119 = Class463.method29472(local98);
		if (local111.aFloat297 > local114.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 += arg5.aFloat297 * arg0;
				if (local119.aFloat297 > 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			} else {
				local119.aFloat297 -= arg5.aFloat297 * arg0;
				if (local119.aFloat297 < 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			}
		} else if (local101.aFloat297 < arg6.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 -= arg0 * arg5.aFloat297;
				if (local119.aFloat297 < -arg6.aFloat297) {
					local119.aFloat297 = -arg6.aFloat297;
				}
			} else {
				local119.aFloat297 += arg0 * arg5.aFloat297;
				if (local119.aFloat297 > arg6.aFloat297) {
					local119.aFloat297 = arg6.aFloat297;
				}
			}
		}
		if (local111.aFloat295 > local114.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 += arg0 * arg5.aFloat295;
				if (local119.aFloat295 > 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			} else {
				local119.aFloat295 -= arg0 * arg5.aFloat295;
				if (local119.aFloat295 < 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			}
		} else if (local101.aFloat295 < arg6.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 -= arg5.aFloat295 * arg0;
				if (local119.aFloat295 < -arg6.aFloat295) {
					local119.aFloat295 = -arg6.aFloat295;
				}
			} else {
				local119.aFloat295 += arg5.aFloat295 * arg0;
				if (local119.aFloat295 > arg6.aFloat295) {
					local119.aFloat295 = arg6.aFloat295;
				}
			}
		}
		if (local111.aFloat296 > local114.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 += arg5.aFloat296 * arg0;
				if (local119.aFloat296 > 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			} else {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			}
		} else if (local101.aFloat296 < arg6.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < -arg6.aFloat296) {
					local119.aFloat296 = -arg6.aFloat296;
				}
			} else {
				local119.aFloat296 += arg0 * arg5.aFloat296;
				if (local119.aFloat296 > arg6.aFloat296) {
					local119.aFloat296 = arg6.aFloat296;
				}
			}
		}
		@Pc(421) Class463 local421 = Class463.method29551(local68, local119.aFloat297);
		local421.method29484(local73, local119.aFloat295);
		local421.method29484(local78, local119.aFloat296);
		arg4.method29503(local421, 0.8F);
		arg1.method29483(Class463.method29551(arg4, arg0));
		local101.method29557();
		local119.method29557();
		local114.method29557();
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;Lclient!on;FFFF)V")
	public static void method32444(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) Class463 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg7 > 0.0F) {
			arg5 = Class463.method29472(arg5);
			arg5.method29496(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat297 || Float.isNaN(arg1.aFloat297) || local24 > arg9 || local24 < arg10) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(68) Class463 local68 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(73) Class463 local73 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(78) Class463 local78 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local68.method29500(arg2);
		local73.method29500(arg2);
		local78.method29500(arg2);
		@Pc(98) Class463 local98 = Class463.method29541(Class463.method29498(local68, arg4), Class463.method29498(local73, arg4), Class463.method29498(local78, arg4));
		@Pc(101) Class463 local101 = Class463.method29472(local98);
		local101.method29543();
		@Pc(111) Class463 local111 = Class463.method29562(Class463.method29514(local101, local101), Class463.method29551(arg5, 2.0F));
		@Pc(114) Class463 local114 = Class463.method29472(local21);
		local114.method29543();
		@Pc(119) Class463 local119 = Class463.method29472(local98);
		if (local111.aFloat297 > local114.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 += arg5.aFloat297 * arg0;
				if (local119.aFloat297 > 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			} else {
				local119.aFloat297 -= arg5.aFloat297 * arg0;
				if (local119.aFloat297 < 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			}
		} else if (local101.aFloat297 < arg6.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 -= arg0 * arg5.aFloat297;
				if (local119.aFloat297 < -arg6.aFloat297) {
					local119.aFloat297 = -arg6.aFloat297;
				}
			} else {
				local119.aFloat297 += arg0 * arg5.aFloat297;
				if (local119.aFloat297 > arg6.aFloat297) {
					local119.aFloat297 = arg6.aFloat297;
				}
			}
		}
		if (local111.aFloat295 > local114.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 += arg0 * arg5.aFloat295;
				if (local119.aFloat295 > 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			} else {
				local119.aFloat295 -= arg0 * arg5.aFloat295;
				if (local119.aFloat295 < 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			}
		} else if (local101.aFloat295 < arg6.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 -= arg5.aFloat295 * arg0;
				if (local119.aFloat295 < -arg6.aFloat295) {
					local119.aFloat295 = -arg6.aFloat295;
				}
			} else {
				local119.aFloat295 += arg5.aFloat295 * arg0;
				if (local119.aFloat295 > arg6.aFloat295) {
					local119.aFloat295 = arg6.aFloat295;
				}
			}
		}
		if (local111.aFloat296 > local114.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 += arg5.aFloat296 * arg0;
				if (local119.aFloat296 > 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			} else {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			}
		} else if (local101.aFloat296 < arg6.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < -arg6.aFloat296) {
					local119.aFloat296 = -arg6.aFloat296;
				}
			} else {
				local119.aFloat296 += arg0 * arg5.aFloat296;
				if (local119.aFloat296 > arg6.aFloat296) {
					local119.aFloat296 = arg6.aFloat296;
				}
			}
		}
		@Pc(421) Class463 local421 = Class463.method29551(local68, local119.aFloat297);
		local421.method29484(local73, local119.aFloat295);
		local421.method29484(local78, local119.aFloat296);
		arg4.method29503(local421, 0.8F);
		arg1.method29483(Class463.method29551(arg4, arg0));
		local101.method29557();
		local119.method29557();
		local114.method29557();
	}

	@OriginalMember(owner = "client!vu", name = "akd", descriptor = "(Lclient!yp;B)V")
	static void method32445(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class80_Sub1_Sub12 local2 = Class146.method13874(-1851456427);
		if (local2 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			return;
		}
		@Pc(20) boolean local20 = local2.method22600(Class159_Sub1.anInt2026 * 2002101755 + Class159.anInt1991, Class159.anInt1996 + Class158.anInt2029 * 2067675511, Class681.anIntArray521, -725732740);
		if (local20) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[1];
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[2];
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "(I)V")
	static void method32446(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "(I)V")
	public static void method32447(@OriginalArg(0) int arg0) {
		Class27.anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "(IB)V")
	public static void method32448(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class654.anInt5665 = arg0 * -1979004989;
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[Class654.anInt5665 * 2087772395] + 1];
		Class654.anInt5666 = 0;
		Class654.anInt5667 = 0;
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	Class624() throws Throwable {
		throw new Error();
	}
}
