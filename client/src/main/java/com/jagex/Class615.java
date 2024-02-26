package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class615 implements Interface67 {

	@OriginalMember(owner = "client!vk", name = "hi", descriptor = "Lclient!adv;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_14;

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "[I")
	final int[] anIntArray496;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "(Lclient!ald;)Lclient!vk;")
	public static Class615 method32279(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-668567075);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method23362(1115356515);
		}
		return new Class615(local6);
	}

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "(Lclient!ald;)Lclient!vk;")
	public static Class615 method32280(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-1243514486);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method23362(-742156073);
		}
		return new Class615(local6);
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "(Lclient!ald;)Lclient!vk;")
	public static Class615 method32281(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(73105692);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method23362(735949531);
		}
		return new Class615(local6);
	}

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "(Lclient!ald;)Lclient!vk;")
	public static Class615 method32282(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-710558208);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method23362(-652119909);
		}
		return new Class615(local6);
	}

	@OriginalMember(owner = "client!vk", name = "id", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32283(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4136 = -255961727;
		arg0.anInt4122 = client.anInt3558 * -811655695;
		arg0.anInt4123 = 0;
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -35);
		}
	}

	@OriginalMember(owner = "client!vk", name = "ms", descriptor = "(B)V")
	static void method32284(@OriginalArg(0) byte arg0) {
		@Pc(2) Class75 local2 = Class52.method1074(16777215);
		@Pc(8) Class80_Sub31 local8 = Class623.method32440(Class443.aClass443_125, local2.aClass22_1, -191270971);
		local8.aClass80_Sub36_Sub1_2.method23345(client.anInt3459 * -1828596627, (byte) 69);
		local2.method1325(local8, (byte) -93);
	}

	@OriginalMember(owner = "client!vk", name = "tu", descriptor = "(Lclient!yp;S)V")
	static void method32285(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class165.method16958(local11, arg0, (byte) 61);
	}

	@OriginalMember(owner = "client!vk", name = "zo", descriptor = "(Lclient!yp;I)V")
	static void method32286(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		Class317.method27516(local14, local25, -1354802504);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([I)V")
	Class615(@OriginalArg(0) int[] arg0) {
		this.anIntArray496 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;S)Z")
	@Override
	public boolean method32275(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) short arg4) {
		@Pc(2) int[] local2 = this.anIntArray496;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method15048(local12, (short) 17091)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32276(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		@Pc(2) int[] local2 = this.anIntArray496;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method15048(local12, (short) 19811)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32278(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		@Pc(2) int[] local2 = this.anIntArray496;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method15048(local12, (short) 16369)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32277(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		@Pc(2) int[] local2 = this.anIntArray496;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method15048(local12, (short) 3248)) {
				return false;
			}
		}
		return true;
	}
}
