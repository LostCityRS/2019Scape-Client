package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public abstract class Class103 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public final int anInt2748;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "(Lclient!ald;)Lclient!eg;")
	static Class103 method19205(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-379607252);
		@Pc(7) Class82 local7 = Class62.method1210(local3, 715728793);
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

	@OriginalMember(owner = "client!eg", name = "bl", descriptor = "(Lclient!yp;B)V")
	static void method19207(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5777 -= -1672568046;
		if (arg0.aLongArray27[arg0.anInt5777 * -628853575] < arg0.aLongArray27[arg0.anInt5777 * -628853575 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!eg", name = "sh", descriptor = "(Lclient!yp;B)V")
	static void method19208(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4170 * -1707388971;
	}

	@OriginalMember(owner = "client!eg", name = "xv", descriptor = "(Lclient!yp;I)V")
	static void method19209(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3584 * -94279287;
	}

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "(S)Lclient!zo;")
	public static Class713 method19210(@OriginalArg(0) short arg0) {
		return Class499.aClass713_1 == null ? Class713.aClass713_5 : Class499.aClass713_1;
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt2748 = arg0.method23178((byte) -70) * 2058426303;
	}

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "()V")
	public abstract void method19198();

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "()Z")
	boolean method19199() {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	void method19200(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "(I)Z")
	boolean method19201(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "()V")
	public abstract void method19202();

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "()V")
	void method19203() {
	}

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "()Z")
	boolean method19204() {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V")
	public abstract void method19206(@OriginalArg(0) int arg0);
}
