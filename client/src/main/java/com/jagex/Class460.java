package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class460 {

	@OriginalMember(owner = "client!og", name = "hh", descriptor = "Lclient!aoc;")
	public static Class41_Sub2 aClass41_Sub2_1;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "I")
	public final int anInt4907;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject19;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "(I)I")
	public static int method29415(@OriginalArg(0) int arg0) {
		return Class669.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!yp;I)V")
	static void method29416(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 1647021656)).method28034(Class672.aClass134_1, (byte) -23) ? 1 : 0;
	}

	@OriginalMember(owner = "client!og", name = "xb", descriptor = "(Lclient!yp;I)V")
	static void method29417(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12 & 0x3FFF;
	}

	@OriginalMember(owner = "client!og", name = "u", descriptor = "(CLclient!zv;I)I")
	static int method29418(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && Class719.aClass719_7 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILjava/lang/Object;)V")
	public Class460(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		this.anInt4907 = arg0 * -1097676799;
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V")
	public Class460(@OriginalArg(0) int arg0) {
		this.anInt4907 = arg0 * -1097676799;
	}

	@OriginalMember(owner = "client!og", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29413(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class460)) {
			return false;
		}
		@Pc(7) Class460 local7 = (Class460) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return local7.anInt4907 * -38979583 == this.anInt4907 * -38979583 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!og", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class460)) {
			return false;
		}
		@Pc(7) Class460 local7 = (Class460) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return local7.anInt4907 * -38979583 == this.anInt4907 * -38979583 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!og", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29414(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class460)) {
			return false;
		}
		@Pc(7) Class460 local7 = (Class460) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return local7.anInt4907 * -38979583 == this.anInt4907 * -38979583 && local7.anObject19.equals(this.anObject19);
		}
	}
}
