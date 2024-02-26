package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public abstract class Class98 {

	@OriginalMember(owner = "client!cg", name = "vb", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(Ljava/lang/String;I)V")
	public static void method2704(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_38, client.aClass75_2.aClass22_1, -191270971);
		local10.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		@Pc(21) int local21 = local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local10.aClass80_Sub36_Sub1_2.method23165(arg0, 2099651031);
		local10.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
		local10.aClass80_Sub36_Sub1_2.method23190(Class499.anIntArray464, local21, local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
		local10.aClass80_Sub36_Sub1_2.method23171(local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local21, (byte) 68);
		client.aClass75_2.method1325(local10, (byte) -54);
		Class499.aClass713_1 = Class713.aClass713_3;
	}

	@OriginalMember(owner = "client!cg", name = "acf", descriptor = "(Lclient!yp;I)V")
	static void method2705(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.anInt4533 * -1050135401;
	}

	@OriginalMember(owner = "client!cg", name = "bab", descriptor = "(Lclient!yp;B)V")
	static void method2706(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "(Lclient!ald;B)Lclient!eg;")
	static Class103 method2707(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.method23362(222389890);
		@Pc(7) Class82 local7 = Class62.method1210(local3, 677643756);
		@Pc(9) Class103 local9 = null;
		switch(local7.anInt257 * 2117806001) {
			case 0:
				local9 = new Class103_Sub9(arg0);
				break;
			case 1:
				local9 = new Class103_Sub11(arg0);
				break;
			case 2:
				local9 = new Class103_Sub19(arg0);
				break;
			case 3:
				local9 = new Class103_Sub21(arg0, true);
				break;
			case 4:
				local9 = new Class103_Sub23(arg0);
			case 5:
			case 8:
			case 18:
			default:
				break;
			case 6:
				local9 = new Class103_Sub4(arg0);
				break;
			case 7:
				local9 = new Class103_Sub18(arg0);
				break;
			case 9:
				local9 = new Class103_Sub22(arg0);
				break;
			case 10:
				local9 = new Class103_Sub14(arg0);
				break;
			case 11:
				local9 = new Class103_Sub2(arg0);
				break;
			case 12:
				local9 = new Class103_Sub17_Sub1(arg0);
				break;
			case 13:
				local9 = new Class103_Sub15(arg0);
				break;
			case 14:
				local9 = new Class103_Sub17_Sub2(arg0);
				break;
			case 15:
				local9 = new Class103_Sub16(arg0, 0, 0);
				break;
			case 16:
				local9 = new Class103_Sub3(arg0);
				break;
			case 17:
				local9 = new Class103_Sub7(arg0);
				break;
			case 19:
				local9 = new Class103_Sub1(arg0);
				break;
			case 20:
				local9 = new Class103_Sub12(arg0);
				break;
			case 21:
				local9 = new Class103_Sub20(arg0);
				break;
			case 22:
				local9 = new Class103_Sub16(arg0, 1, 1);
				break;
			case 23:
				local9 = new Class103_Sub16(arg0, 1, 0);
				break;
			case 24:
				local9 = new Class103_Sub8(arg0);
				break;
			case 25:
				local9 = new Class103_Sub13(arg0);
				break;
			case 26:
				local9 = new Class103_Sub10(arg0);
				break;
			case 27:
				local9 = new Class103_Sub21(arg0, false);
				break;
			case 28:
				local9 = new Class103_Sub5(arg0);
				break;
			case 29:
				local9 = new Class103_Sub6(arg0);
				break;
			case 30:
				local9 = new Class103_Sub16(arg0, 0, 1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cg", name = "bfc", descriptor = "(Lclient!yp;I)V")
	static void method2708(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	Class98() {
	}
}
