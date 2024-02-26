package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akl")
public abstract class Class80_Sub22 extends Class80 {

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "I")
	static int anInt3016;

	@OriginalMember(owner = "client!akl", name = "dz", descriptor = "(Lclient!yp;B)V")
	static void method21674(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2125584828);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class80_Sub17.method23470(local16, local22, arg0, 1295604819);
	}

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "(II)S")
	public static short method21675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : (127 - local15) * local11 >> 7;
		@Pc(36) int local36 = local15 + local32;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!akl", name = "<init>", descriptor = "()V")
	Class80_Sub22() {
	}
}
