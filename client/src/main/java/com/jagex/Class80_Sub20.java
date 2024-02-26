package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akj")
public final class Class80_Sub20 extends Class80 {

	@OriginalMember(owner = "client!akj", name = "u", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!akj", name = "aqj", descriptor = "(Lclient!yp;I)V")
	static void method14172(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!akj", name = "bk", descriptor = "(Lclient!yp;I)V")
	static void method14173(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class327 local14 = Class301.method27041(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 2131621320);
		local14.aClass327Array3 = null;
		local14.aClass327Array4 = null;
		Class296.method26998(local14, 1118844263);
	}

	@OriginalMember(owner = "client!akj", name = "<init>", descriptor = "(I)V")
	public Class80_Sub20(@OriginalArg(0) int arg0) {
		this.anInt1588 = arg0 * -822306345;
	}
}
