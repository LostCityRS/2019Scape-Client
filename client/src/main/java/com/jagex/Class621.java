package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public class Class621 {

	@OriginalMember(owner = "client!vq", name = "fo", descriptor = "Lclient!py;")
	public static Class497 aClass497_135;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 7)
	Class621() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V", line = 12)
	public static void method32112(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29558(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29579(arg2, arg1);
		@Pc(11) float local11 = local8.method29593();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29537(arg4);
			arg4.method29604(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat317 || Float.isNaN(arg1.aFloat317) || local11 > arg8) {
			arg1.method29550(arg2);
			arg3.method29553();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29537(arg3);
		local47.method29595();
		@Pc(53) Class472 local53 = Class472.method29611(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29601(local47, local53);
		local57.method29604(0.5F);
		@Pc(63) Class472 local63 = Class472.method29537(arg3);
		@Pc(66) Class472 local66 = Class472.method29537(local8);
		local66.method29595();
		if (local57.aFloat317 > local66.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			} else {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			}
		} else if (local47.aFloat317 < arg5.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < -arg5.aFloat317) {
					local63.aFloat317 = -arg5.aFloat317;
				}
			} else {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > arg5.aFloat317) {
					local63.aFloat317 = arg5.aFloat317;
				}
			}
		}
		if (local57.aFloat318 > local66.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 += arg0 * arg4.aFloat318;
				if (local63.aFloat318 > 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			} else {
				local63.aFloat318 -= arg4.aFloat318 * arg0;
				if (local63.aFloat318 < 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			}
		} else if (local47.aFloat318 < arg5.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 -= arg0 * arg4.aFloat318;
				if (local63.aFloat318 < -arg5.aFloat318) {
					local63.aFloat318 = -arg5.aFloat318;
				}
			} else {
				local63.aFloat318 += arg4.aFloat318 * arg0;
				if (local63.aFloat318 > arg5.aFloat318) {
					local63.aFloat318 = arg5.aFloat318;
				}
			}
		}
		if (local57.aFloat319 > local66.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			} else {
				local63.aFloat319 -= arg4.aFloat319 * arg0;
				if (local63.aFloat319 < 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			}
		} else if (local47.aFloat319 < arg5.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 -= arg0 * arg4.aFloat319;
				if (local63.aFloat319 < -arg5.aFloat319) {
					local63.aFloat319 = -arg5.aFloat319;
				}
			} else {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > arg5.aFloat319) {
					local63.aFloat319 = arg5.aFloat319;
				}
			}
		}
		arg3.method29634(local63, 0.8F);
		if (local11 < arg9 && arg3.method29593() < arg9) {
			arg1.method29550(arg2);
			arg3.method29553();
		} else {
			arg1.method29567(Class472.method29619(arg3, arg0));
		}
		local47.method29544();
		local63.method29544();
		local66.method29544();
	}

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V", line = 12)
	public static void method32113(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29558(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29579(arg2, arg1);
		@Pc(11) float local11 = local8.method29593();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29537(arg4);
			arg4.method29604(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat317 || Float.isNaN(arg1.aFloat317) || local11 > arg8) {
			arg1.method29550(arg2);
			arg3.method29553();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29537(arg3);
		local47.method29595();
		@Pc(53) Class472 local53 = Class472.method29611(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29601(local47, local53);
		local57.method29604(0.5F);
		@Pc(63) Class472 local63 = Class472.method29537(arg3);
		@Pc(66) Class472 local66 = Class472.method29537(local8);
		local66.method29595();
		if (local57.aFloat317 > local66.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			} else {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			}
		} else if (local47.aFloat317 < arg5.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < -arg5.aFloat317) {
					local63.aFloat317 = -arg5.aFloat317;
				}
			} else {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > arg5.aFloat317) {
					local63.aFloat317 = arg5.aFloat317;
				}
			}
		}
		if (local57.aFloat318 > local66.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 += arg0 * arg4.aFloat318;
				if (local63.aFloat318 > 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			} else {
				local63.aFloat318 -= arg4.aFloat318 * arg0;
				if (local63.aFloat318 < 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			}
		} else if (local47.aFloat318 < arg5.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 -= arg0 * arg4.aFloat318;
				if (local63.aFloat318 < -arg5.aFloat318) {
					local63.aFloat318 = -arg5.aFloat318;
				}
			} else {
				local63.aFloat318 += arg4.aFloat318 * arg0;
				if (local63.aFloat318 > arg5.aFloat318) {
					local63.aFloat318 = arg5.aFloat318;
				}
			}
		}
		if (local57.aFloat319 > local66.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			} else {
				local63.aFloat319 -= arg4.aFloat319 * arg0;
				if (local63.aFloat319 < 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			}
		} else if (local47.aFloat319 < arg5.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 -= arg0 * arg4.aFloat319;
				if (local63.aFloat319 < -arg5.aFloat319) {
					local63.aFloat319 = -arg5.aFloat319;
				}
			} else {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > arg5.aFloat319) {
					local63.aFloat319 = arg5.aFloat319;
				}
			}
		}
		arg3.method29634(local63, 0.8F);
		if (local11 < arg9 && arg3.method29593() < arg9) {
			arg1.method29550(arg2);
			arg3.method29553();
		} else {
			arg1.method29567(Class472.method29619(arg3, arg0));
		}
		local47.method29544();
		local63.method29544();
		local66.method29544();
	}

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFF)V", line = 12)
	public static void method32114(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29558(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29579(arg2, arg1);
		@Pc(11) float local11 = local8.method29593();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29537(arg4);
			arg4.method29604(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat317 || Float.isNaN(arg1.aFloat317) || local11 > arg8) {
			arg1.method29550(arg2);
			arg3.method29553();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29537(arg3);
		local47.method29595();
		@Pc(53) Class472 local53 = Class472.method29611(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29601(local47, local53);
		local57.method29604(0.5F);
		@Pc(63) Class472 local63 = Class472.method29537(arg3);
		@Pc(66) Class472 local66 = Class472.method29537(local8);
		local66.method29595();
		if (local57.aFloat317 > local66.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			} else {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			}
		} else if (local47.aFloat317 < arg5.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < -arg5.aFloat317) {
					local63.aFloat317 = -arg5.aFloat317;
				}
			} else {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > arg5.aFloat317) {
					local63.aFloat317 = arg5.aFloat317;
				}
			}
		}
		if (local57.aFloat318 > local66.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 += arg0 * arg4.aFloat318;
				if (local63.aFloat318 > 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			} else {
				local63.aFloat318 -= arg4.aFloat318 * arg0;
				if (local63.aFloat318 < 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			}
		} else if (local47.aFloat318 < arg5.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 -= arg0 * arg4.aFloat318;
				if (local63.aFloat318 < -arg5.aFloat318) {
					local63.aFloat318 = -arg5.aFloat318;
				}
			} else {
				local63.aFloat318 += arg4.aFloat318 * arg0;
				if (local63.aFloat318 > arg5.aFloat318) {
					local63.aFloat318 = arg5.aFloat318;
				}
			}
		}
		if (local57.aFloat319 > local66.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			} else {
				local63.aFloat319 -= arg4.aFloat319 * arg0;
				if (local63.aFloat319 < 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			}
		} else if (local47.aFloat319 < arg5.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 -= arg0 * arg4.aFloat319;
				if (local63.aFloat319 < -arg5.aFloat319) {
					local63.aFloat319 = -arg5.aFloat319;
				}
			} else {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > arg5.aFloat319) {
					local63.aFloat319 = arg5.aFloat319;
				}
			}
		}
		arg3.method29634(local63, 0.8F);
		if (local11 < arg9 && arg3.method29593() < arg9) {
			arg1.method29550(arg2);
			arg3.method29553();
		} else {
			arg1.method29567(Class472.method29619(arg3, arg0));
		}
		local47.method29544();
		local63.method29544();
		local66.method29544();
	}

	@OriginalMember(owner = "client!vq", name = "rz", descriptor = "(Lclient!yf;I)V", line = 8108)
	static final void method32115(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3980 * -1281935361;
	}

	@OriginalMember(owner = "client!vq", name = "akj", descriptor = "(Lclient!yf;I)V", line = 11663)
	static final void method32116(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13453((byte) 1);
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(36) boolean local36 = local15.method23174(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray525, -1388889132);
		if (local36) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[1];
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[2];
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!vq", name = "atu", descriptor = "(Lclient!yf;I)V", line = 13241)
	static final void method32117(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
