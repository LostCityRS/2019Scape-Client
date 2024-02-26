package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xn")
public final class Class666 {

	@OriginalMember(owner = "client!xn", name = "t", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_7 = new Class666(0, 2, 2, 1);

	@OriginalMember(owner = "client!xn", name = "f", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_4 = new Class666(1, 2, 2, 0);

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "Lclient!xn;")
	static final Class666 aClass666_2 = new Class666(2, 4, 4, 0);

	@OriginalMember(owner = "client!xn", name = "u", descriptor = "Lclient!xn;")
	static final Class666 aClass666_3 = new Class666(4, 1, 1, 1);

	@OriginalMember(owner = "client!xn", name = "l", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_14 = new Class666(6, 0, 4, 2);

	@OriginalMember(owner = "client!xn", name = "g", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_5 = new Class666(7, 0, 1, 1);

	@OriginalMember(owner = "client!xn", name = "i", descriptor = "Lclient!xn;")
	static final Class666 aClass666_6 = new Class666(8, 0, 4, 1);

	@OriginalMember(owner = "client!xn", name = "m", descriptor = "Lclient!xn;")
	static final Class666 aClass666_15 = new Class666(9, 0, 4, 1);

	@OriginalMember(owner = "client!xn", name = "o", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_8 = new Class666(10, 2, 2, 0);

	@OriginalMember(owner = "client!xn", name = "j", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_9 = new Class666(11, 0, 1, 2);

	@OriginalMember(owner = "client!xn", name = "a", descriptor = "Lclient!xn;")
	static final Class666 aClass666_10 = new Class666(12, 0, 1, 0);

	@OriginalMember(owner = "client!xn", name = "s", descriptor = "Lclient!xn;")
	static final Class666 aClass666_1 = new Class666(13, 0, 1, 0);

	@OriginalMember(owner = "client!xn", name = "k", descriptor = "Lclient!xn;")
	static final Class666 aClass666_11 = new Class666(14, 0, 4, 1);

	@OriginalMember(owner = "client!xn", name = "x", descriptor = "Lclient!xn;")
	static final Class666 aClass666_12 = new Class666(15, 0, 1, 0);

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "Lclient!xn;")
	public static final Class666 aClass666_13 = new Class666(16, 0, 4, 2);

	@OriginalMember(owner = "client!xn", name = "r", descriptor = "I")
	public int anInt5697;

	@OriginalMember(owner = "client!xn", name = "q", descriptor = "I")
	public int anInt5700;

	@OriginalMember(owner = "client!xn", name = "h", descriptor = "I")
	public int anInt5699;

	@OriginalMember(owner = "client!xn", name = "d", descriptor = "I")
	public int anInt5698;

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "()[Lclient!xn;")
	static Class666[] method33456() {
		return new Class666[] { aClass666_6, aClass666_3, aClass666_15, aClass666_5, aClass666_11, aClass666_10, aClass666_2, aClass666_4, aClass666_7, aClass666_12, aClass666_9, aClass666_1, aClass666_14, aClass666_13, aClass666_8 };
	}

	@OriginalMember(owner = "client!xn", name = "uq", descriptor = "(Lclient!yp;I)V")
	static void method33457(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2102878259);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4148 * -965284535;
	}

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "(II)Lclient!cl;")
	static Class208 method33458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class208 local6 = (Class208) Class80_Sub39.method15030(Class73_Sub1.method17920((byte) -24), arg0, -556225943);
		if (local6 == null) {
			local6 = Class208.aClass208_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!xn", name = "z", descriptor = "(ZI)V")
	public static void method33459(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Class622.aBoolean937) {
			Class100.method2954(1910953123);
			Class622.aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!xn", name = "<init>", descriptor = "(IIII)V")
	Class666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5697 = arg0 * 1345964427;
		this.anInt5700 = arg1 * 1354307209;
		this.anInt5699 = arg2 * -505843281;
		this.anInt5698 = arg3 * -63065821;
	}
}
