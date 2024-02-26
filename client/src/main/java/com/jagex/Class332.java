package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class332 {

	@OriginalMember(owner = "client!ib", name = "hx", descriptor = "Lclient!aof;")
	public static Class41_Sub5 aClass41_Sub5_1;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!ib;")
	static final Class332 aClass332_3 = new Class332(0, 4);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!ib;")
	static final Class332 aClass332_2 = new Class332(1, 5);

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!ib;")
	static final Class332 aClass332_1 = new Class332(2, 6);

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	final int anInt4193;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public final int anInt4194;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()[Lclient!ib;")
	static Class332[] method27791() {
		return new Class332[] { aClass332_1, aClass332_3, aClass332_2 };
	}

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "(I)Lclient!ib;")
	public static Class332 method27792(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class331.method27788(-2029499746);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4193 * -1606525071 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(I)Lclient!ib;")
	public static Class332 method27793(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class331.method27788(-2117359049);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4193 * -1606525071 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Lclient!ib;")
	public static Class332 method27794(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class331.method27788(-956326441);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4193 * -1606525071 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "pf", descriptor = "(Lclient!yp;I)V")
	static void method27795(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class672.method33565(local11, local14, arg0, 1558230921);
	}

	@OriginalMember(owner = "client!ib", name = "tj", descriptor = "(Lclient!yp;I)V")
	static void method27796(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2073462141);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4103 * 1892149809;
	}

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)V")
	public static void method27797(@OriginalArg(0) int arg0) {
		Class56.aClass8_3 = new Class8();
	}

	@OriginalMember(owner = "client!ib", name = "iq", descriptor = "(Lclient!yp;B)V")
	static void method27798(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class249.method26352(local11, local14, arg0, -1600964813);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(Lclient!di;I)V")
	static void method27799(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (-1955503601 * Class27.anInt83 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 && client.aClass539_1.method30932(-1638462787) != null) {
			Class303.method27111((byte) 30);
			if (Class518.method30588(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 71349046)) {
				Class27.anInt83 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 * 208096495;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4193 = arg0 * -1781235311;
		this.anInt4194 = arg1 * 360946259;
	}
}
