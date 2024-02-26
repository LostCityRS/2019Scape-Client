package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uz")
public final class Class605 {

	@OriginalMember(owner = "client!uz", name = "kx", descriptor = "I")
	public static int anInt5392;

	@OriginalMember(owner = "client!uz", name = "f", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;FFF)V")
	public static void method32150(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg5.aFloat297 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat297) || local24 > arg7 || local24 < arg8) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(54) Class463 local54 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(59) Class463 local59 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(64) Class463 local64 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local54.method29500(arg2);
		local59.method29500(arg2);
		local64.method29500(arg2);
		@Pc(84) Class463 local84 = Class463.method29541(Class463.method29498(local54, arg4), Class463.method29498(local59, arg4), Class463.method29498(local64, arg4));
		@Pc(87) Class463 local87 = Class463.method29472(local84);
		@Pc(104) Class463 local104 = Class463.method29541(local21.aFloat297 * arg5.aFloat297, local21.aFloat295 * arg5.aFloat295, arg5.aFloat296 * local21.aFloat296);
		local87.method29484(local104, arg0);
		local87.method29499(arg6);
		@Pc(116) Class463 local116 = Class463.method29551(local54, local87.aFloat297);
		local116.method29484(local59, local87.aFloat295);
		local116.method29484(local64, local87.aFloat296);
		arg4.method29478(local116);
		arg1.method29483(Class463.method29551(arg4, arg0));
	}

	@OriginalMember(owner = "client!uz", name = "e", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;FFF)V")
	public static void method32151(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg5.aFloat297 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat297) || local24 > arg7 || local24 < arg8) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(54) Class463 local54 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(59) Class463 local59 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(64) Class463 local64 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local54.method29500(arg2);
		local59.method29500(arg2);
		local64.method29500(arg2);
		@Pc(84) Class463 local84 = Class463.method29541(Class463.method29498(local54, arg4), Class463.method29498(local59, arg4), Class463.method29498(local64, arg4));
		@Pc(87) Class463 local87 = Class463.method29472(local84);
		@Pc(104) Class463 local104 = Class463.method29541(local21.aFloat297 * arg5.aFloat297, local21.aFloat295 * arg5.aFloat295, arg5.aFloat296 * local21.aFloat296);
		local87.method29484(local104, arg0);
		local87.method29499(arg6);
		@Pc(116) Class463 local116 = Class463.method29551(local54, local87.aFloat297);
		local116.method29484(local59, local87.aFloat295);
		local116.method29484(local64, local87.aFloat296);
		arg4.method29478(local116);
		arg1.method29483(Class463.method29551(arg4, arg0));
	}

	@OriginalMember(owner = "client!uz", name = "ayo", descriptor = "(Lclient!yp;I)V")
	static void method32152(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class59.method1177(true, -2084544693);
		RuntimeException_Sub2.method23509(1729455718);
		client.aClass539_1.method30938(1978165377);
		Class719.method37291(1248108624);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!uz", name = "<init>", descriptor = "()V")
	Class605() throws Throwable {
		throw new Error();
	}
}
