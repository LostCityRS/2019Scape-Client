package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class52 implements Interface4 {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Ljava/lang/Class;")
	final Class aClass1;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFFI)V")
	public static void method1018(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9) {
		if (arg3.method29715(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29710(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29711(Class472.method29755(arg3, arg1));
		local14.method29753(arg2);
		@Pc(21) Class472 local21 = Class472.method29755(local14, local9);
		@Pc(24) float local24 = local21.method29746();
		if (arg5.aFloat325 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat325) || local24 > arg7 || local24 < arg8) {
			arg1.method29719(arg3);
			arg4.method29720();
			return;
		}
		arg2.method29651();
		@Pc(54) Class472 local54 = Class472.method29710(1.0F, 0.0F, 0.0F);
		@Pc(59) Class472 local59 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(64) Class472 local64 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local54.method29753(arg2);
		local59.method29753(arg2);
		local64.method29753(arg2);
		@Pc(84) Class472 local84 = Class472.method29710(Class472.method29730(local54, arg4), Class472.method29730(local59, arg4), Class472.method29730(local64, arg4));
		@Pc(87) Class472 local87 = Class472.method29711(local84);
		@Pc(104) Class472 local104 = Class472.method29710(local21.aFloat325 * arg5.aFloat325, arg5.aFloat326 * local21.aFloat326, arg5.aFloat327 * local21.aFloat327);
		local87.method29797(local104, arg0);
		local87.method29738(arg6);
		@Pc(116) Class472 local116 = Class472.method29739(local54, local87.aFloat325);
		local116.method29797(local59, local87.aFloat326);
		local116.method29797(local64, local87.aFloat327);
		arg4.method29719(local116);
		arg1.method29724(Class472.method29739(arg4, arg0));
	}

	@OriginalMember(owner = "client!aca", name = "anx", descriptor = "(Lclient!yf;I)V")
	static void method1019(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class65.aClass123_Sub1_2.method8941((float) local13, (float) local23, (byte) -31);
	}

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljava/lang/Class;)V")
	public Class52(@OriginalArg(0) Class arg0) {
		this.aClass1 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36694(arg0, (byte) -3);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36694(arg0, (byte) -20);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36694(arg0, (byte) -36);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36694(arg0, (byte) 11);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return this.aClass1;
	}
}
