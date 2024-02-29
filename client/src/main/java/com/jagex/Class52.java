package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public class Class52 implements Interface4 {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Ljava/lang/Class;")
	final Class aClass1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljava/lang/Class;)V", line = 9)
	public Class52(@OriginalArg(0) Class arg0) {
		this.aClass1 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFFI)V", line = 13)
	public static void method1018(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 15)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36513(arg0, (byte) -3);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 15)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36513(arg0, (byte) -20);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 15)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36513(arg0, (byte) -36);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 15)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		try {
			@Pc(4) Interface13 local4 = (Interface13) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method36513(arg0, (byte) 11);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "()Ljava/lang/Class;", line = 26)
	@Override
	public Class method27705() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 26)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!aca", name = "anx", descriptor = "(Lclient!yf;I)V", line = 12311)
	static final void method1019(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class65.aClass123_Sub1_2.method8984((float) local13, (float) local23, (byte) -31);
	}
}
