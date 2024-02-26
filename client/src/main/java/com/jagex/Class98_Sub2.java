package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ael")
public final class Class98_Sub2 extends Class98 {

	@OriginalMember(owner = "client!ael", name = "t", descriptor = "[I")
	int[] anIntArray40;

	@OriginalMember(owner = "client!ael", name = "f", descriptor = "[I")
	int[] anIntArray39;

	@OriginalMember(owner = "client!ael", name = "bbe", descriptor = "(Lclient!yp;I)V")
	static void method2143(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(II[I[I)V")
	Class98_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray40 = arg2;
		this.anIntArray39 = arg3;
	}
}
