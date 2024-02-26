package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class224 {

	@OriginalMember(owner = "client!dg", name = "ahp", descriptor = "(Lclient!yp;I)V")
	static void method25946(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, 518788581)).anInt123 * -371300491;
	}

	@OriginalMember(owner = "client!dg", name = "ayd", descriptor = "(Lclient!yp;I)V")
	static void method25947(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class595.anInt5356 * -1459733811;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	Class224() throws Throwable {
		throw new Error();
	}
}
