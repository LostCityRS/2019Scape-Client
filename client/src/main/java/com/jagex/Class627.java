package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vx")
public class Class627 {

	@OriginalMember(owner = "client!vx", name = "k", descriptor = "I")
	static int anInt5705;

	@OriginalMember(owner = "client!vx", name = "nd", descriptor = "Lclient!hf;")
	static Class312 aClass312_12;

	@OriginalMember(owner = "client!vx", name = "uv", descriptor = "I")
	static int anInt5706;

	@OriginalMember(owner = "client!vx", name = "<init>", descriptor = "()V", line = 8)
	Class627() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vx", name = "m", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V", line = 13)
	public static void method32245(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) Class472 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29558(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29535(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29537(Class472.method29579(arg3, arg1));
		local14.method29623(arg2);
		@Pc(21) Class472 local21 = Class472.method29579(local14, local9);
		@Pc(24) float local24 = local21.method29593();
		if (arg7 > 0.0F) {
			arg5 = Class472.method29537(arg5);
			arg5.method29604(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat317 || Float.isNaN(arg1.aFloat317) || local24 > arg9 || local24 < arg10) {
			arg1.method29550(arg3);
			arg4.method29553();
			return;
		}
		arg2.method29492();
		@Pc(68) Class472 local68 = Class472.method29535(1.0F, 0.0F, 0.0F);
		@Pc(73) Class472 local73 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(78) Class472 local78 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local68.method29623(arg2);
		local73.method29623(arg2);
		local78.method29623(arg2);
		@Pc(98) Class472 local98 = Class472.method29535(Class472.method29586(local68, arg4), Class472.method29586(local73, arg4), Class472.method29586(local78, arg4));
		@Pc(101) Class472 local101 = Class472.method29537(local98);
		local101.method29595();
		@Pc(111) Class472 local111 = Class472.method29611(Class472.method29601(local101, local101), Class472.method29619(arg5, 2.0F));
		@Pc(114) Class472 local114 = Class472.method29537(local21);
		local114.method29595();
		@Pc(119) Class472 local119 = Class472.method29537(local98);
		if (local111.aFloat317 > local114.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			} else {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			}
		} else if (local101.aFloat317 < arg6.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < -arg6.aFloat317) {
					local119.aFloat317 = -arg6.aFloat317;
				}
			} else {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > arg6.aFloat317) {
					local119.aFloat317 = arg6.aFloat317;
				}
			}
		}
		if (local111.aFloat318 > local114.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 += arg5.aFloat318 * arg0;
				if (local119.aFloat318 > 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			} else {
				local119.aFloat318 -= arg0 * arg5.aFloat318;
				if (local119.aFloat318 < 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			}
		} else if (local101.aFloat318 < arg6.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 -= arg5.aFloat318 * arg0;
				if (local119.aFloat318 < -arg6.aFloat318) {
					local119.aFloat318 = -arg6.aFloat318;
				}
			} else {
				local119.aFloat318 += arg0 * arg5.aFloat318;
				if (local119.aFloat318 > arg6.aFloat318) {
					local119.aFloat318 = arg6.aFloat318;
				}
			}
		}
		if (local111.aFloat319 > local114.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 += arg0 * arg5.aFloat319;
				if (local119.aFloat319 > 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			} else {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			}
		} else if (local101.aFloat319 < arg6.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < -arg6.aFloat319) {
					local119.aFloat319 = -arg6.aFloat319;
				}
			} else {
				local119.aFloat319 += arg5.aFloat319 * arg0;
				if (local119.aFloat319 > arg6.aFloat319) {
					local119.aFloat319 = arg6.aFloat319;
				}
			}
		}
		@Pc(421) Class472 local421 = Class472.method29619(local68, local119.aFloat317);
		local421.method29572(local73, local119.aFloat318);
		local421.method29572(local78, local119.aFloat319);
		arg4.method29634(local421, 0.8F);
		arg1.method29567(Class472.method29619(arg4, arg0));
		local101.method29544();
		local119.method29544();
		local114.method29544();
	}

	@OriginalMember(owner = "client!vx", name = "n", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V", line = 13)
	public static void method32246(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) Class472 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29558(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29535(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29537(Class472.method29579(arg3, arg1));
		local14.method29623(arg2);
		@Pc(21) Class472 local21 = Class472.method29579(local14, local9);
		@Pc(24) float local24 = local21.method29593();
		if (arg7 > 0.0F) {
			arg5 = Class472.method29537(arg5);
			arg5.method29604(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat317 || Float.isNaN(arg1.aFloat317) || local24 > arg9 || local24 < arg10) {
			arg1.method29550(arg3);
			arg4.method29553();
			return;
		}
		arg2.method29492();
		@Pc(68) Class472 local68 = Class472.method29535(1.0F, 0.0F, 0.0F);
		@Pc(73) Class472 local73 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(78) Class472 local78 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local68.method29623(arg2);
		local73.method29623(arg2);
		local78.method29623(arg2);
		@Pc(98) Class472 local98 = Class472.method29535(Class472.method29586(local68, arg4), Class472.method29586(local73, arg4), Class472.method29586(local78, arg4));
		@Pc(101) Class472 local101 = Class472.method29537(local98);
		local101.method29595();
		@Pc(111) Class472 local111 = Class472.method29611(Class472.method29601(local101, local101), Class472.method29619(arg5, 2.0F));
		@Pc(114) Class472 local114 = Class472.method29537(local21);
		local114.method29595();
		@Pc(119) Class472 local119 = Class472.method29537(local98);
		if (local111.aFloat317 > local114.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			} else {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			}
		} else if (local101.aFloat317 < arg6.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < -arg6.aFloat317) {
					local119.aFloat317 = -arg6.aFloat317;
				}
			} else {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > arg6.aFloat317) {
					local119.aFloat317 = arg6.aFloat317;
				}
			}
		}
		if (local111.aFloat318 > local114.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 += arg5.aFloat318 * arg0;
				if (local119.aFloat318 > 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			} else {
				local119.aFloat318 -= arg0 * arg5.aFloat318;
				if (local119.aFloat318 < 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			}
		} else if (local101.aFloat318 < arg6.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 -= arg5.aFloat318 * arg0;
				if (local119.aFloat318 < -arg6.aFloat318) {
					local119.aFloat318 = -arg6.aFloat318;
				}
			} else {
				local119.aFloat318 += arg0 * arg5.aFloat318;
				if (local119.aFloat318 > arg6.aFloat318) {
					local119.aFloat318 = arg6.aFloat318;
				}
			}
		}
		if (local111.aFloat319 > local114.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 += arg0 * arg5.aFloat319;
				if (local119.aFloat319 > 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			} else {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			}
		} else if (local101.aFloat319 < arg6.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < -arg6.aFloat319) {
					local119.aFloat319 = -arg6.aFloat319;
				}
			} else {
				local119.aFloat319 += arg5.aFloat319 * arg0;
				if (local119.aFloat319 > arg6.aFloat319) {
					local119.aFloat319 = arg6.aFloat319;
				}
			}
		}
		@Pc(421) Class472 local421 = Class472.method29619(local68, local119.aFloat317);
		local421.method29572(local73, local119.aFloat318);
		local421.method29572(local78, local119.aFloat319);
		arg4.method29634(local421, 0.8F);
		arg1.method29567(Class472.method29619(arg4, arg0));
		local101.method29544();
		local119.method29544();
		local114.method29544();
	}

	@OriginalMember(owner = "client!vx", name = "fk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6011)
	static final void method32247(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg2.anIntArray519[arg2.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18261(local13, 154074221);
		if (local29.anInt265 * 951920133 == local23) {
			arg0.method26914(local13, 570797165);
		} else {
			arg0.method26909(local13, local23, 1414920931);
		}
	}

	@OriginalMember(owner = "client!vx", name = "aad", descriptor = "(Lclient!yf;I)V", line = 9660)
	static final void method32248(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class176.method24387(local13, false, (byte) 40);
	}

	@OriginalMember(owner = "client!vx", name = "adw", descriptor = "(Lclient!yf;I)V", line = 10166)
	static final void method32249(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5232 * -861817639;
	}

	@OriginalMember(owner = "client!vx", name = "aml", descriptor = "(Lclient!yf;I)V", line = 12156)
	static final void method32250(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		Class123.method9082(arg0.anIntArray519[arg0.anInt5891 * -1497248091], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1], 0, -1223039695);
	}
}
