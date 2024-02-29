package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
class Class271 implements Interface39 {

	@OriginalMember(owner = "client!fp", name = "pj", descriptor = "I")
	static int anInt3885;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fp", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "(IB)Lclient!adr;", line = 49)
	public static Class89 method26302(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class89[] local2 = Class9.method152((byte) -66);
		@Pc(4) Class89[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class89 local14 = local4[local6];
			if (arg0 == local14.anInt292 * -1807422761) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "(IIIZIZI)V", line = 115)
	static void method26303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg0 + arg1) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class154_Sub1 local14 = Class50.aClass154_Sub1Array1[local8];
		Class50.aClass154_Sub1Array1[local8] = Class50.aClass154_Sub1Array1[arg1];
		Class50.aClass154_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class288.method26548(Class50.aClass154_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5, -2145971235) <= 0) {
				@Pc(44) Class154_Sub1 local44 = Class50.aClass154_Sub1Array1[local26];
				Class50.aClass154_Sub1Array1[local26] = Class50.aClass154_Sub1Array1[local10];
				Class50.aClass154_Sub1Array1[local10++] = local44;
			}
		}
		Class50.aClass154_Sub1Array1[arg1] = Class50.aClass154_Sub1Array1[local10];
		Class50.aClass154_Sub1Array1[local10] = local14;
		method26303(arg0, local10 - 1, arg2, arg3, arg4, arg5, 469894424);
		method26303(local10 + 1, arg1, arg2, arg3, arg4, arg5, 223756407);
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!fb;)V", line = 480)
	Class271(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)F", line = 482)
	@Override
	public float method26345(@OriginalArg(0) int arg0) {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_5.method16226(-1130756527) / 255.0F;
	}

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "()F", line = 482)
	@Override
	public float method26346() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_5.method16226(-142344880) / 255.0F;
	}

	@OriginalMember(owner = "client!fp", name = "ir", descriptor = "(IIIII)V", line = 6229)
	static final void method26304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = client.anInt3465 * -1679978117;
		@Pc(7) int local7 = client.anInt3499 * 90444619;
		@Pc(20) Class100 local20;
		if (client.anInt3501 * -446949609 == 1) {
			local20 = Class166_Sub37.aClass100Array5[client.anInt3500 * -741034743 / 100];
			local20.method18161(local3 - 8, local7 - 8);
		}
		if (client.anInt3501 * -446949609 == 2) {
			local20 = Class166_Sub37.aClass100Array5[client.anInt3500 * -741034743 / 100 + 4];
			local20.method18161(local3 - 8, local7 - 8);
		}
	}

	@OriginalMember(owner = "client!fp", name = "ig", descriptor = "(Lclient!yf;B)V", line = 6477)
	static final void method26305(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1871146513);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24574(local16, local22, arg0, -2019214117);
	}

	@OriginalMember(owner = "client!fp", name = "pb", descriptor = "(Lclient!yf;I)V", line = 7721)
	static final void method26306(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1274641074);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24575(local16, local22, arg0, -753836288);
	}

	@OriginalMember(owner = "client!fp", name = "ayn", descriptor = "(Lclient!yf;B)V", line = 13980)
	static final void method26307(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class278.anInt3888 * 715531683;
	}
}
