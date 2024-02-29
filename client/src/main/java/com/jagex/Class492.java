package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public class Class492 {

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 4)
	Class492() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "(Lclient!ox;Lclient!ox;Lclient!ox;F[Lclient!ox;)V", line = 9)
	public static void method29982(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class472[] arg4) {
		@Pc(3) Class472 local3 = Class472.method29579(arg0, arg2);
		@Pc(11) float local11 = Class472.method29586(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class472.method29586(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class472.method29531();
			arg4[0].method29550(arg0);
			arg4[0].method29567(Class472.method29619(Class472.method29537(arg1), -local15 - local45));
			arg4[1] = Class472.method29531();
			arg4[1].method29550(arg0);
			arg4[1].method29567(Class472.method29619(Class472.method29537(arg1), -local15 + local45));
		} else {
			arg4[0] = Class472.method29531();
			arg4[0].method29550(arg0);
			arg4[0].method29567(Class472.method29619(Class472.method29537(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "(Lclient!ox;Lclient!ox;Lclient!ox;F[Lclient!ox;)V", line = 9)
	public static void method29983(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class472[] arg4) {
		@Pc(3) Class472 local3 = Class472.method29579(arg0, arg2);
		@Pc(11) float local11 = Class472.method29586(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class472.method29586(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class472.method29531();
			arg4[0].method29550(arg0);
			arg4[0].method29567(Class472.method29619(Class472.method29537(arg1), -local15 - local45));
			arg4[1] = Class472.method29531();
			arg4[1].method29550(arg0);
			arg4[1].method29567(Class472.method29619(Class472.method29537(arg1), -local15 + local45));
		} else {
			arg4[0] = Class472.method29531();
			arg4[0].method29550(arg0);
			arg4[0].method29567(Class472.method29619(Class472.method29537(arg1), -local15));
			arg4[1] = null;
		}
	}
}
