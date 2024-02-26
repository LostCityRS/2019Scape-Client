package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class333 {

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!ic;")
	static final Class333 aClass333_10 = new Class333(0);

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!ic;")
	static final Class333 aClass333_2 = new Class333(1);

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!ic;")
	static final Class333 aClass333_3 = new Class333(2);

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "Lclient!ic;")
	static final Class333 aClass333_4 = new Class333(3);

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!ic;")
	static final Class333 aClass333_14 = new Class333(4);

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!ic;")
	static final Class333 aClass333_6 = new Class333(5);

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!ic;")
	static final Class333 aClass333_8 = new Class333(6);

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ic;")
	static final Class333 aClass333_12 = new Class333(7);

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!ic;")
	static final Class333 aClass333_9 = new Class333(8);

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!ic;")
	static final Class333 aClass333_5 = new Class333(9);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ic;")
	static final Class333 aClass333_11 = new Class333(10);

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!ic;")
	static final Class333 aClass333_7 = new Class333(11);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!ic;")
	static final Class333 aClass333_13 = new Class333(12);

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!ic;")
	static final Class333 aClass333_1 = new Class333(13);

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Lclient!ic;")
	static final Class333 aClass333_15 = new Class333(14);

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	final int anInt4195;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "(S)V")
	static void method27800(@OriginalArg(0) short arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "ly", descriptor = "(Lclient!yp;S)V")
	static void method27801(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2098831260);
		Class709.method37152(local16, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!ic", name = "qs", descriptor = "(Lclient!yp;I)V")
	static void method27802(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class165_Sub15.method16124(local11, local14, arg0, (byte) 62);
	}

	@OriginalMember(owner = "client!ic", name = "wq", descriptor = "(Lclient!yp;B)V")
	static void method27803(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		Class490.aClass263_13.method26624(local13, local23, local33, -318310091);
	}

	@OriginalMember(owner = "client!ic", name = "aio", descriptor = "(Lclient!yp;B)V")
	static void method27804(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class320.method27561(local13, (byte) -58);
	}

	@OriginalMember(owner = "client!ic", name = "atv", descriptor = "(Lclient!yp;B)V")
	static void method27805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub19_1.method16205(894768830);
	}

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "(Lclient!pf;Lclient!xl;I)I")
	static int method27806(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method33353(-52491764) > 1) {
			@Pc(12) int local12 = arg0.method29930(1264684497) - 1;
			return local12 * arg1.method33353(-558852482) + arg0.method29929(local12, -561697017);
		} else {
			return arg0.method29929(arg1.anInt5690 * -1975739137, -561697017);
		}
	}

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "(Ljava/lang/String;II)Z")
	static boolean method27807(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class498.method30361(arg0, arg1, "openjs", (byte) 76);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	Class333(@OriginalArg(0) int arg0) {
		this.anInt4195 = arg0 * 1155798529;
	}
}
