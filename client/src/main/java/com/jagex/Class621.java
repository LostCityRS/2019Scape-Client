package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class621 {

	@OriginalMember(owner = "client!vq", name = "fo", descriptor = "Lclient!py;")
	public static Class497 aClass497_135;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V")
	public static void method32293(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29715(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29755(arg2, arg1);
		@Pc(11) float local11 = local8.method29746();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29711(arg4);
			arg4.method29723(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat325 || Float.isNaN(arg1.aFloat325) || local11 > arg8) {
			arg1.method29719(arg2);
			arg3.method29720();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29711(arg3);
		local47.method29804();
		@Pc(53) Class472 local53 = Class472.method29737(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29784(local47, local53);
		local57.method29723(0.5F);
		@Pc(63) Class472 local63 = Class472.method29711(arg3);
		@Pc(66) Class472 local66 = Class472.method29711(local8);
		local66.method29804();
		if (local57.aFloat325 > local66.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			} else {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			}
		} else if (local47.aFloat325 < arg5.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < -arg5.aFloat325) {
					local63.aFloat325 = -arg5.aFloat325;
				}
			} else {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > arg5.aFloat325) {
					local63.aFloat325 = arg5.aFloat325;
				}
			}
		}
		if (local57.aFloat326 > local66.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 += arg0 * arg4.aFloat326;
				if (local63.aFloat326 > 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			} else {
				local63.aFloat326 -= arg4.aFloat326 * arg0;
				if (local63.aFloat326 < 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			}
		} else if (local47.aFloat326 < arg5.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 -= arg0 * arg4.aFloat326;
				if (local63.aFloat326 < -arg5.aFloat326) {
					local63.aFloat326 = -arg5.aFloat326;
				}
			} else {
				local63.aFloat326 += arg4.aFloat326 * arg0;
				if (local63.aFloat326 > arg5.aFloat326) {
					local63.aFloat326 = arg5.aFloat326;
				}
			}
		}
		if (local57.aFloat327 > local66.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			} else {
				local63.aFloat327 -= arg4.aFloat327 * arg0;
				if (local63.aFloat327 < 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			}
		} else if (local47.aFloat327 < arg5.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 -= arg0 * arg4.aFloat327;
				if (local63.aFloat327 < -arg5.aFloat327) {
					local63.aFloat327 = -arg5.aFloat327;
				}
			} else {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > arg5.aFloat327) {
					local63.aFloat327 = arg5.aFloat327;
				}
			}
		}
		arg3.method29789(local63, 0.8F);
		if (local11 < arg9 && arg3.method29746() < arg9) {
			arg1.method29719(arg2);
			arg3.method29720();
		} else {
			arg1.method29724(Class472.method29739(arg3, arg0));
		}
		local47.method29713();
		local63.method29713();
		local66.method29713();
	}

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V")
	public static void method32294(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29715(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29755(arg2, arg1);
		@Pc(11) float local11 = local8.method29746();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29711(arg4);
			arg4.method29723(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat325 || Float.isNaN(arg1.aFloat325) || local11 > arg8) {
			arg1.method29719(arg2);
			arg3.method29720();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29711(arg3);
		local47.method29804();
		@Pc(53) Class472 local53 = Class472.method29737(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29784(local47, local53);
		local57.method29723(0.5F);
		@Pc(63) Class472 local63 = Class472.method29711(arg3);
		@Pc(66) Class472 local66 = Class472.method29711(local8);
		local66.method29804();
		if (local57.aFloat325 > local66.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			} else {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			}
		} else if (local47.aFloat325 < arg5.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < -arg5.aFloat325) {
					local63.aFloat325 = -arg5.aFloat325;
				}
			} else {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > arg5.aFloat325) {
					local63.aFloat325 = arg5.aFloat325;
				}
			}
		}
		if (local57.aFloat326 > local66.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 += arg0 * arg4.aFloat326;
				if (local63.aFloat326 > 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			} else {
				local63.aFloat326 -= arg4.aFloat326 * arg0;
				if (local63.aFloat326 < 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			}
		} else if (local47.aFloat326 < arg5.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 -= arg0 * arg4.aFloat326;
				if (local63.aFloat326 < -arg5.aFloat326) {
					local63.aFloat326 = -arg5.aFloat326;
				}
			} else {
				local63.aFloat326 += arg4.aFloat326 * arg0;
				if (local63.aFloat326 > arg5.aFloat326) {
					local63.aFloat326 = arg5.aFloat326;
				}
			}
		}
		if (local57.aFloat327 > local66.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			} else {
				local63.aFloat327 -= arg4.aFloat327 * arg0;
				if (local63.aFloat327 < 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			}
		} else if (local47.aFloat327 < arg5.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 -= arg0 * arg4.aFloat327;
				if (local63.aFloat327 < -arg5.aFloat327) {
					local63.aFloat327 = -arg5.aFloat327;
				}
			} else {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > arg5.aFloat327) {
					local63.aFloat327 = arg5.aFloat327;
				}
			}
		}
		arg3.method29789(local63, 0.8F);
		if (local11 < arg9 && arg3.method29746() < arg9) {
			arg1.method29719(arg2);
			arg3.method29720();
		} else {
			arg1.method29724(Class472.method29739(arg3, arg0));
		}
		local47.method29713();
		local63.method29713();
		local66.method29713();
	}

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V")
	public static void method32295(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29715(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29755(arg2, arg1);
		@Pc(11) float local11 = local8.method29746();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29711(arg4);
			arg4.method29723(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat325 || Float.isNaN(arg1.aFloat325) || local11 > arg8) {
			arg1.method29719(arg2);
			arg3.method29720();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29711(arg3);
		local47.method29804();
		@Pc(53) Class472 local53 = Class472.method29737(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29784(local47, local53);
		local57.method29723(0.5F);
		@Pc(63) Class472 local63 = Class472.method29711(arg3);
		@Pc(66) Class472 local66 = Class472.method29711(local8);
		local66.method29804();
		if (local57.aFloat325 > local66.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			} else {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < 0.0F) {
					local63.aFloat325 = 0.0F;
				}
			}
		} else if (local47.aFloat325 < arg5.aFloat325) {
			if (local8.aFloat325 < 0.0F) {
				local63.aFloat325 -= arg4.aFloat325 * arg0;
				if (local63.aFloat325 < -arg5.aFloat325) {
					local63.aFloat325 = -arg5.aFloat325;
				}
			} else {
				local63.aFloat325 += arg4.aFloat325 * arg0;
				if (local63.aFloat325 > arg5.aFloat325) {
					local63.aFloat325 = arg5.aFloat325;
				}
			}
		}
		if (local57.aFloat326 > local66.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 += arg0 * arg4.aFloat326;
				if (local63.aFloat326 > 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			} else {
				local63.aFloat326 -= arg4.aFloat326 * arg0;
				if (local63.aFloat326 < 0.0F) {
					local63.aFloat326 = 0.0F;
				}
			}
		} else if (local47.aFloat326 < arg5.aFloat326) {
			if (local8.aFloat326 < 0.0F) {
				local63.aFloat326 -= arg0 * arg4.aFloat326;
				if (local63.aFloat326 < -arg5.aFloat326) {
					local63.aFloat326 = -arg5.aFloat326;
				}
			} else {
				local63.aFloat326 += arg4.aFloat326 * arg0;
				if (local63.aFloat326 > arg5.aFloat326) {
					local63.aFloat326 = arg5.aFloat326;
				}
			}
		}
		if (local57.aFloat327 > local66.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			} else {
				local63.aFloat327 -= arg4.aFloat327 * arg0;
				if (local63.aFloat327 < 0.0F) {
					local63.aFloat327 = 0.0F;
				}
			}
		} else if (local47.aFloat327 < arg5.aFloat327) {
			if (local8.aFloat327 < 0.0F) {
				local63.aFloat327 -= arg0 * arg4.aFloat327;
				if (local63.aFloat327 < -arg5.aFloat327) {
					local63.aFloat327 = -arg5.aFloat327;
				}
			} else {
				local63.aFloat327 += arg4.aFloat327 * arg0;
				if (local63.aFloat327 > arg5.aFloat327) {
					local63.aFloat327 = arg5.aFloat327;
				}
			}
		}
		arg3.method29789(local63, 0.8F);
		if (local11 < arg9 && arg3.method29746() < arg9) {
			arg1.method29719(arg2);
			arg3.method29720();
		} else {
			arg1.method29724(Class472.method29739(arg3, arg0));
		}
		local47.method29713();
		local63.method29713();
		local66.method29713();
	}

	@OriginalMember(owner = "client!vq", name = "akj", descriptor = "(Lclient!yf;I)V")
	static void method32296(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13454((byte) 1);
		if (local15 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(36) boolean local36 = local15.method23181(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray527, -1388889132);
		if (local36) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[1];
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[2];
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!vq", name = "atu", descriptor = "(Lclient!yf;I)V")
	static void method32297(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!vq", name = "rz", descriptor = "(Lclient!yf;I)V")
	static void method32298(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4021 * -1281935361;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	Class621() throws Throwable {
		throw new Error();
	}
}
