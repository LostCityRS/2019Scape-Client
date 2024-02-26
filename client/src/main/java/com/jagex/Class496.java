package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class496 {

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "(Lclient!on;Lclient!on;Lclient!on;F[Lclient!on;)V")
	public static void method30324(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class463 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class463[] arg4) {
		@Pc(3) Class463 local3 = Class463.method29487(arg0, arg2);
		@Pc(11) float local11 = Class463.method29498(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class463.method29498(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class463.method29470();
			arg4[0].method29478(arg0);
			arg4[0].method29483(Class463.method29551(Class463.method29472(arg1), -local15 - local45));
			arg4[1] = Class463.method29470();
			arg4[1].method29478(arg0);
			arg4[1].method29483(Class463.method29551(Class463.method29472(arg1), -local15 + local45));
		} else {
			arg4[0] = Class463.method29470();
			arg4[0].method29478(arg0);
			arg4[0].method29483(Class463.method29551(Class463.method29472(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "(Lclient!on;Lclient!on;Lclient!on;F[Lclient!on;)V")
	public static void method30325(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class463 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class463[] arg4) {
		@Pc(3) Class463 local3 = Class463.method29487(arg0, arg2);
		@Pc(11) float local11 = Class463.method29498(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class463.method29498(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class463.method29470();
			arg4[0].method29478(arg0);
			arg4[0].method29483(Class463.method29551(Class463.method29472(arg1), -local15 - local45));
			arg4[1] = Class463.method29470();
			arg4[1].method29478(arg0);
			arg4[1].method29483(Class463.method29551(Class463.method29472(arg1), -local15 + local45));
		} else {
			arg4[0] = Class463.method29470();
			arg4[0].method29478(arg0);
			arg4[0].method29483(Class463.method29551(Class463.method29472(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	Class496() throws Throwable {
		throw new Error();
	}
}
