package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class592 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 8)
	Class592() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFF)V", line = 13)
	public static void method31703(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29558(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29535(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29537(Class472.method29579(arg3, arg1));
		local14.method29623(arg2);
		@Pc(21) Class472 local21 = Class472.method29579(local14, local9);
		@Pc(24) float local24 = local21.method29593();
		if (arg5.aFloat317 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat317) || local24 > arg7 || local24 < arg8) {
			arg1.method29550(arg3);
			arg4.method29553();
			return;
		}
		arg2.method29492();
		@Pc(54) Class472 local54 = Class472.method29535(1.0F, 0.0F, 0.0F);
		@Pc(59) Class472 local59 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(64) Class472 local64 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local54.method29623(arg2);
		local59.method29623(arg2);
		local64.method29623(arg2);
		@Pc(84) Class472 local84 = Class472.method29535(Class472.method29586(local54, arg4), Class472.method29586(local59, arg4), Class472.method29586(local64, arg4));
		@Pc(87) Class472 local87 = Class472.method29537(local84);
		@Pc(104) Class472 local104 = Class472.method29535(local21.aFloat317 * arg5.aFloat317, arg5.aFloat318 * local21.aFloat318, arg5.aFloat319 * local21.aFloat319);
		local87.method29572(local104, arg0);
		local87.method29615(arg6);
		@Pc(116) Class472 local116 = Class472.method29619(local54, local87.aFloat317);
		local116.method29572(local59, local87.aFloat318);
		local116.method29572(local64, local87.aFloat319);
		arg4.method29550(local116);
		arg1.method29567(Class472.method29619(arg4, arg0));
	}

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFF)V", line = 13)
	public static void method31704(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29558(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29535(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29537(Class472.method29579(arg3, arg1));
		local14.method29623(arg2);
		@Pc(21) Class472 local21 = Class472.method29579(local14, local9);
		@Pc(24) float local24 = local21.method29593();
		if (arg5.aFloat317 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat317) || local24 > arg7 || local24 < arg8) {
			arg1.method29550(arg3);
			arg4.method29553();
			return;
		}
		arg2.method29492();
		@Pc(54) Class472 local54 = Class472.method29535(1.0F, 0.0F, 0.0F);
		@Pc(59) Class472 local59 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(64) Class472 local64 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local54.method29623(arg2);
		local59.method29623(arg2);
		local64.method29623(arg2);
		@Pc(84) Class472 local84 = Class472.method29535(Class472.method29586(local54, arg4), Class472.method29586(local59, arg4), Class472.method29586(local64, arg4));
		@Pc(87) Class472 local87 = Class472.method29537(local84);
		@Pc(104) Class472 local104 = Class472.method29535(local21.aFloat317 * arg5.aFloat317, arg5.aFloat318 * local21.aFloat318, arg5.aFloat319 * local21.aFloat319);
		local87.method29572(local104, arg0);
		local87.method29615(arg6);
		@Pc(116) Class472 local116 = Class472.method29619(local54, local87.aFloat317);
		local116.method29572(local59, local87.aFloat318);
		local116.method29572(local64, local87.aFloat319);
		arg4.method29550(local116);
		arg1.method29567(Class472.method29619(arg4, arg0));
	}

	@OriginalMember(owner = "client!ue", name = "bh", descriptor = "(Lclient!yf;B)V", line = 5096)
	static final void method31705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5894 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt5894 * -2000995827] <= arg0.aLongArray27[arg0.anInt5894 * -2000995827 + 1]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}
}
