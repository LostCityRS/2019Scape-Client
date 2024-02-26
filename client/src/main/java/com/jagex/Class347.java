package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class347 {

	@OriginalMember(owner = "client!is", name = "aq", descriptor = "[I")
	static int[] anIntArray420;

	@OriginalMember(owner = "client!is", name = "t", descriptor = "Lclient!is;")
	public static final Class347 aClass347_4 = new Class347(0, false);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!is;")
	public static final Class347 aClass347_3 = new Class347(1, false);

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!is;")
	static final Class347 aClass347_5 = new Class347(2, true);

	@OriginalMember(owner = "client!is", name = "u", descriptor = "Lclient!is;")
	public static final Class347 aClass347_7 = new Class347(3, false);

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!is;")
	static final Class347 aClass347_6 = new Class347(4, true);

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!is;")
	static final Class347 aClass347_8 = new Class347(5, true);

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Lclient!is;")
	static final Class347 aClass347_9 = new Class347(6, true);

	@OriginalMember(owner = "client!is", name = "m", descriptor = "I")
	public final int anInt4252;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
	final boolean aBoolean833;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(I)Lclient!is;")
	public static Class347 method27977(@OriginalArg(0) int arg0) {
		if (aClass347_4.anInt4252 * 1583199675 == arg0) {
			return aClass347_4;
		} else if (arg0 == aClass347_3.anInt4252 * 1583199675) {
			return aClass347_3;
		} else if (aClass347_5.anInt4252 * 1583199675 == arg0) {
			return aClass347_5;
		} else if (arg0 == aClass347_7.anInt4252 * 1583199675) {
			return aClass347_7;
		} else if (aClass347_6.anInt4252 * 1583199675 == arg0) {
			return aClass347_6;
		} else if (aClass347_8.anInt4252 * 1583199675 == arg0) {
			return aClass347_8;
		} else if (arg0 == aClass347_9.anInt4252 * 1583199675) {
			return aClass347_9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!is", name = "u", descriptor = "(I)Lclient!is;")
	public static Class347 method27980(@OriginalArg(0) int arg0) {
		if (aClass347_4.anInt4252 * 1583199675 == arg0) {
			return aClass347_4;
		} else if (arg0 == aClass347_3.anInt4252 * 1583199675) {
			return aClass347_3;
		} else if (aClass347_5.anInt4252 * 1583199675 == arg0) {
			return aClass347_5;
		} else if (arg0 == aClass347_7.anInt4252 * 1583199675) {
			return aClass347_7;
		} else if (aClass347_6.anInt4252 * 1583199675 == arg0) {
			return aClass347_6;
		} else if (aClass347_8.anInt4252 * 1583199675 == arg0) {
			return aClass347_8;
		} else if (arg0 == aClass347_9.anInt4252 * 1583199675) {
			return aClass347_9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!is", name = "ue", descriptor = "(Lclient!yp;I)V")
	static void method27981(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2000806861);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(25) Class323 local25 = local16.method27643(Class279.aClass102_9, 1477428010);
		if (local25 != null) {
			local18 = local25.anInt4066 * 1560847089;
			local20 = local25.anInt4068 * 1138267573;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local20;
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IZ)V")
	Class347(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4252 = arg0 * -1757821069;
		this.aBoolean833 = arg1;
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "()Z")
	public boolean method27975() {
		return this.aBoolean833;
	}

	@OriginalMember(owner = "client!is", name = "l", descriptor = "()Z")
	public boolean method27976() {
		return this.aBoolean833;
	}

	@OriginalMember(owner = "client!is", name = "i", descriptor = "()Z")
	public boolean method27978() {
		return this.aBoolean833;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Z")
	public boolean method27979(@OriginalArg(0) int arg0) {
		return this.aBoolean833;
	}
}
