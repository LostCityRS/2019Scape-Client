package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aki")
public final class Class80_Sub19 extends Class80 {

	@OriginalMember(owner = "client!aki", name = "u", descriptor = "Ljava/lang/Object;")
	public final Object anObject5;

	@OriginalMember(owner = "client!aki", name = "aui", descriptor = "(Lclient!yp;I)V")
	static void method14160(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub43_2.method16849(1538334780);
	}

	@OriginalMember(owner = "client!aki", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class80_Sub19(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}
}
