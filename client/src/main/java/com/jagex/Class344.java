package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class344 {

	@OriginalMember(owner = "client!io", name = "ax", descriptor = "[Lclient!cm;")
	public static Class99[] aClass99Array6;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!io;")
	static final Class344 aClass344_1 = new Class344(0);

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!io;")
	static final Class344 aClass344_2 = new Class344(1);

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	final int anInt4246;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)Lclient!io;")
	public static Class344 method27947(@OriginalArg(0) int arg0) {
		if (aClass344_1.anInt4246 * -697781393 == arg0) {
			return aClass344_1;
		} else if (arg0 == aClass344_2.anInt4246 * -697781393) {
			return aClass344_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(I)Lclient!io;")
	public static Class344 method27948(@OriginalArg(0) int arg0) {
		if (aClass344_1.anInt4246 * -697781393 == arg0) {
			return aClass344_1;
		} else if (arg0 == aClass344_2.anInt4246 * -697781393) {
			return aClass344_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "u", descriptor = "(I)Lclient!io;")
	public static Class344 method27949(@OriginalArg(0) int arg0) {
		if (aClass344_1.anInt4246 * -697781393 == arg0) {
			return aClass344_1;
		} else if (arg0 == aClass344_2.anInt4246 * -697781393) {
			return aClass344_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "ahd", descriptor = "(Lclient!yp;I)V")
	static void method27950(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -1000807706);
		@Pc(26) int local26;
		if (local18.aBoolean24) {
			local26 = local18.anInt158 * -280328425;
		} else if (local18.aBoolean21) {
			local26 = Class630.aClass641_1.anInt5640 * -960054943;
		} else {
			local26 = Class630.aClass641_1.anInt5639 * -1730283373;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local26;
	}

	@OriginalMember(owner = "client!io", name = "hi", descriptor = "(Lclient!yp;I)V")
	static void method27951(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2038455690);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class519.method30606(local16, local22, arg0, Class322.aClass322_5, 1288067404);
	}

	@OriginalMember(owner = "client!io", name = "bad", descriptor = "(Lclient!yp;B)V")
	static void method27952(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub15_1.method16950(local12, (byte) -66);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	Class344(@OriginalArg(0) int arg0) {
		this.anInt4246 = arg0 * -1039004785;
	}
}
