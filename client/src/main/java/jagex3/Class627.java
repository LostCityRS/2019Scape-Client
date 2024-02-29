package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vx")
public final class Class627 {

	@OriginalMember(owner = "client!vx", name = "k", descriptor = "I")
	static int anInt5866;

	@OriginalMember(owner = "client!vx", name = "nd", descriptor = "Lclient!hf;")
	static Class312 aClass312_12;

	@OriginalMember(owner = "client!vx", name = "uv", descriptor = "I")
	static int anInt5867;

	@OriginalMember(owner = "client!vx", name = "m", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V")
	public static void method32426(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) Class472 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29715(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29710(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29711(Class472.method29755(arg3, arg1));
		local14.method29753(arg2);
		@Pc(21) Class472 local21 = Class472.method29755(local14, local9);
		@Pc(24) float local24 = local21.method29746();
		if (arg7 > 0.0F) {
			arg5 = Class472.method29711(arg5);
			arg5.method29723(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat325 || Float.isNaN(arg1.aFloat325) || local24 > arg9 || local24 < arg10) {
			arg1.method29719(arg3);
			arg4.method29720();
			return;
		}
		arg2.method29651();
		@Pc(68) Class472 local68 = Class472.method29710(1.0F, 0.0F, 0.0F);
		@Pc(73) Class472 local73 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(78) Class472 local78 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local68.method29753(arg2);
		local73.method29753(arg2);
		local78.method29753(arg2);
		@Pc(98) Class472 local98 = Class472.method29710(Class472.method29730(local68, arg4), Class472.method29730(local73, arg4), Class472.method29730(local78, arg4));
		@Pc(101) Class472 local101 = Class472.method29711(local98);
		local101.method29804();
		@Pc(111) Class472 local111 = Class472.method29737(Class472.method29784(local101, local101), Class472.method29739(arg5, 2.0F));
		@Pc(114) Class472 local114 = Class472.method29711(local21);
		local114.method29804();
		@Pc(119) Class472 local119 = Class472.method29711(local98);
		if (local111.aFloat325 > local114.aFloat325) {
			if (local21.aFloat325 < 0.0F) {
				local119.aFloat325 += arg0 * arg5.aFloat325;
				if (local119.aFloat325 > 0.0F) {
					local119.aFloat325 = 0.0F;
				}
			} else {
				local119.aFloat325 -= arg5.aFloat325 * arg0;
				if (local119.aFloat325 < 0.0F) {
					local119.aFloat325 = 0.0F;
				}
			}
		} else if (local101.aFloat325 < arg6.aFloat325) {
			if (local21.aFloat325 < 0.0F) {
				local119.aFloat325 -= arg5.aFloat325 * arg0;
				if (local119.aFloat325 < -arg6.aFloat325) {
					local119.aFloat325 = -arg6.aFloat325;
				}
			} else {
				local119.aFloat325 += arg0 * arg5.aFloat325;
				if (local119.aFloat325 > arg6.aFloat325) {
					local119.aFloat325 = arg6.aFloat325;
				}
			}
		}
		if (local111.aFloat326 > local114.aFloat326) {
			if (local21.aFloat326 < 0.0F) {
				local119.aFloat326 += arg5.aFloat326 * arg0;
				if (local119.aFloat326 > 0.0F) {
					local119.aFloat326 = 0.0F;
				}
			} else {
				local119.aFloat326 -= arg0 * arg5.aFloat326;
				if (local119.aFloat326 < 0.0F) {
					local119.aFloat326 = 0.0F;
				}
			}
		} else if (local101.aFloat326 < arg6.aFloat326) {
			if (local21.aFloat326 < 0.0F) {
				local119.aFloat326 -= arg5.aFloat326 * arg0;
				if (local119.aFloat326 < -arg6.aFloat326) {
					local119.aFloat326 = -arg6.aFloat326;
				}
			} else {
				local119.aFloat326 += arg0 * arg5.aFloat326;
				if (local119.aFloat326 > arg6.aFloat326) {
					local119.aFloat326 = arg6.aFloat326;
				}
			}
		}
		if (local111.aFloat327 > local114.aFloat327) {
			if (local21.aFloat327 < 0.0F) {
				local119.aFloat327 += arg0 * arg5.aFloat327;
				if (local119.aFloat327 > 0.0F) {
					local119.aFloat327 = 0.0F;
				}
			} else {
				local119.aFloat327 -= arg5.aFloat327 * arg0;
				if (local119.aFloat327 < 0.0F) {
					local119.aFloat327 = 0.0F;
				}
			}
		} else if (local101.aFloat327 < arg6.aFloat327) {
			if (local21.aFloat327 < 0.0F) {
				local119.aFloat327 -= arg5.aFloat327 * arg0;
				if (local119.aFloat327 < -arg6.aFloat327) {
					local119.aFloat327 = -arg6.aFloat327;
				}
			} else {
				local119.aFloat327 += arg5.aFloat327 * arg0;
				if (local119.aFloat327 > arg6.aFloat327) {
					local119.aFloat327 = arg6.aFloat327;
				}
			}
		}
		@Pc(421) Class472 local421 = Class472.method29739(local68, local119.aFloat325);
		local421.method29797(local73, local119.aFloat326);
		local421.method29797(local78, local119.aFloat327);
		arg4.method29789(local421, 0.8F);
		arg1.method29724(Class472.method29739(arg4, arg0));
		local101.method29713();
		local119.method29713();
		local114.method29713();
	}

	@OriginalMember(owner = "client!vx", name = "n", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V")
	public static void method32427(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) Class472 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29715(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29710(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29711(Class472.method29755(arg3, arg1));
		local14.method29753(arg2);
		@Pc(21) Class472 local21 = Class472.method29755(local14, local9);
		@Pc(24) float local24 = local21.method29746();
		if (arg7 > 0.0F) {
			arg5 = Class472.method29711(arg5);
			arg5.method29723(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat325 || Float.isNaN(arg1.aFloat325) || local24 > arg9 || local24 < arg10) {
			arg1.method29719(arg3);
			arg4.method29720();
			return;
		}
		arg2.method29651();
		@Pc(68) Class472 local68 = Class472.method29710(1.0F, 0.0F, 0.0F);
		@Pc(73) Class472 local73 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(78) Class472 local78 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local68.method29753(arg2);
		local73.method29753(arg2);
		local78.method29753(arg2);
		@Pc(98) Class472 local98 = Class472.method29710(Class472.method29730(local68, arg4), Class472.method29730(local73, arg4), Class472.method29730(local78, arg4));
		@Pc(101) Class472 local101 = Class472.method29711(local98);
		local101.method29804();
		@Pc(111) Class472 local111 = Class472.method29737(Class472.method29784(local101, local101), Class472.method29739(arg5, 2.0F));
		@Pc(114) Class472 local114 = Class472.method29711(local21);
		local114.method29804();
		@Pc(119) Class472 local119 = Class472.method29711(local98);
		if (local111.aFloat325 > local114.aFloat325) {
			if (local21.aFloat325 < 0.0F) {
				local119.aFloat325 += arg0 * arg5.aFloat325;
				if (local119.aFloat325 > 0.0F) {
					local119.aFloat325 = 0.0F;
				}
			} else {
				local119.aFloat325 -= arg5.aFloat325 * arg0;
				if (local119.aFloat325 < 0.0F) {
					local119.aFloat325 = 0.0F;
				}
			}
		} else if (local101.aFloat325 < arg6.aFloat325) {
			if (local21.aFloat325 < 0.0F) {
				local119.aFloat325 -= arg5.aFloat325 * arg0;
				if (local119.aFloat325 < -arg6.aFloat325) {
					local119.aFloat325 = -arg6.aFloat325;
				}
			} else {
				local119.aFloat325 += arg0 * arg5.aFloat325;
				if (local119.aFloat325 > arg6.aFloat325) {
					local119.aFloat325 = arg6.aFloat325;
				}
			}
		}
		if (local111.aFloat326 > local114.aFloat326) {
			if (local21.aFloat326 < 0.0F) {
				local119.aFloat326 += arg5.aFloat326 * arg0;
				if (local119.aFloat326 > 0.0F) {
					local119.aFloat326 = 0.0F;
				}
			} else {
				local119.aFloat326 -= arg0 * arg5.aFloat326;
				if (local119.aFloat326 < 0.0F) {
					local119.aFloat326 = 0.0F;
				}
			}
		} else if (local101.aFloat326 < arg6.aFloat326) {
			if (local21.aFloat326 < 0.0F) {
				local119.aFloat326 -= arg5.aFloat326 * arg0;
				if (local119.aFloat326 < -arg6.aFloat326) {
					local119.aFloat326 = -arg6.aFloat326;
				}
			} else {
				local119.aFloat326 += arg0 * arg5.aFloat326;
				if (local119.aFloat326 > arg6.aFloat326) {
					local119.aFloat326 = arg6.aFloat326;
				}
			}
		}
		if (local111.aFloat327 > local114.aFloat327) {
			if (local21.aFloat327 < 0.0F) {
				local119.aFloat327 += arg0 * arg5.aFloat327;
				if (local119.aFloat327 > 0.0F) {
					local119.aFloat327 = 0.0F;
				}
			} else {
				local119.aFloat327 -= arg5.aFloat327 * arg0;
				if (local119.aFloat327 < 0.0F) {
					local119.aFloat327 = 0.0F;
				}
			}
		} else if (local101.aFloat327 < arg6.aFloat327) {
			if (local21.aFloat327 < 0.0F) {
				local119.aFloat327 -= arg5.aFloat327 * arg0;
				if (local119.aFloat327 < -arg6.aFloat327) {
					local119.aFloat327 = -arg6.aFloat327;
				}
			} else {
				local119.aFloat327 += arg5.aFloat327 * arg0;
				if (local119.aFloat327 > arg6.aFloat327) {
					local119.aFloat327 = arg6.aFloat327;
				}
			}
		}
		@Pc(421) Class472 local421 = Class472.method29739(local68, local119.aFloat325);
		local421.method29797(local73, local119.aFloat326);
		local421.method29797(local78, local119.aFloat327);
		arg4.method29789(local421, 0.8F);
		arg1.method29724(Class472.method29739(arg4, arg0));
		local101.method29713();
		local119.method29713();
		local114.method29713();
	}

	@OriginalMember(owner = "client!vx", name = "fk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method32428(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg2.anIntArray521[arg2.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18273(local13, 154074221);
		if (local29.anInt265 * 951920133 == local23) {
			arg0.method26955(local13, 570797165);
		} else {
			arg0.method26953(local13, local23, 1414920931);
		}
	}

	@OriginalMember(owner = "client!vx", name = "aad", descriptor = "(Lclient!yf;I)V")
	static void method32429(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class176.method24399(local13, false, (byte) 40);
	}

	@OriginalMember(owner = "client!vx", name = "adw", descriptor = "(Lclient!yf;I)V")
	static void method32430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5393 * -861817639;
	}

	@OriginalMember(owner = "client!vx", name = "aml", descriptor = "(Lclient!yf;I)V")
	static void method32431(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		Class123.method9086(arg0.anIntArray521[arg0.anInt6052 * -1497248091], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1], 0, -1223039695);
	}

	@OriginalMember(owner = "client!vx", name = "<init>", descriptor = "()V")
	Class627() throws Throwable {
		throw new Error();
	}
}
