package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akc")
public class Class80_Sub13 extends Class80 {

	@OriginalMember(owner = "client!akc", name = "u", descriptor = "I")
	int anInt3258;

	@OriginalMember(owner = "client!akc", name = "l", descriptor = "Ljava/lang/String;")
	String aString120;

	@OriginalMember(owner = "client!akc", name = "awe", descriptor = "(Lclient!yp;I)V")
	static void method23985(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(14) boolean local14 = true;
		if (local12 < 0) {
			local14 = (local12 + 1) % 4 == 0;
		} else if (local12 < 1582) {
			local14 = local12 % 4 == 0;
		} else if (local12 % 4 != 0) {
			local14 = false;
		} else if (local12 % 100 != 0) {
			local14 = true;
		} else if (local12 % 400 != 0) {
			local14 = false;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14 ? 1 : 0;
	}

	@OriginalMember(owner = "client!akc", name = "<init>", descriptor = "()V")
	Class80_Sub13() {
	}
}
