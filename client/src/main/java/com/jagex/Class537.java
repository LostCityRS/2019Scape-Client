package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class537 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!rc;")
	Class526 aClass526_11;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Lclient!ase;")
	Class93_Sub41_Sub2 aClass93_Sub41_Sub2_3;

	@OriginalMember(owner = "client!rt", name = "azn", descriptor = "(Lclient!yf;B)V")
	static void method30941(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!rt", name = "apq", descriptor = "(Lclient!yf;S)V")
	static void method30942(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(17) boolean local17 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		if (local17) {
			Class322.method27367(3, 1589735282);
		} else {
			Class322.method27367(2, -1917962815);
		}
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!rc;Lclient!ase;)V")
	public Class537(@OriginalArg(0) Class526 arg0, @OriginalArg(1) Class93_Sub41_Sub2 arg1) {
		this.aClass526_11 = arg0;
		this.aClass93_Sub41_Sub2_3 = arg1;
	}
}
