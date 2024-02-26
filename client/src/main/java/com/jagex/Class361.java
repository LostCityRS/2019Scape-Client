package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class361 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	static int anInt4492;

	@OriginalMember(owner = "client!ji", name = "fe", descriptor = "(Lclient!yp;I)V")
	static void method28149(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2072307938);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class334.method27819(local16, local22, arg0, 655846744);
	}

	@OriginalMember(owner = "client!ji", name = "azp", descriptor = "(Lclient!yp;I)V")
	static void method28150(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub8_1.method15973(-1048589161) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ji", name = "bdx", descriptor = "(Lclient!yp;I)V")
	static void method28151(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!ji", name = "dd", descriptor = "(Lclient!yp;I)V")
	static void method28152(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class162.method15798(local11, local14, arg0, -1238182434);
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class361(@OriginalArg(0) int arg0) {
	}
}
