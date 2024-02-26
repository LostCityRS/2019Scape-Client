package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cz")
public abstract class Class97 {

	@OriginalMember(owner = "client!cz", name = "baz", descriptor = "(Lclient!yp;I)V")
	static void method2116(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub9_1.method16950(local12, (byte) -45);
	}

	@OriginalMember(owner = "client!cz", name = "i", descriptor = "(IB)V")
	static void method2117(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (-1 != arg0 && !Class285.aBooleanArray23[arg0]) {
			Class642.aClass480_131.method29931(arg0, 2093932192);
			Class709.aClass310Array1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!cz", name = "m", descriptor = "(II)V")
	static void method2118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class27.anInt87 = 0;
		@Pc(5) int local5 = client.aClass539_1.method30921(2047779027);
		@Pc(9) int local9 = client.aClass539_1.method31011(625411539);
		@Pc(13) Class502 local13 = client.aClass539_1.method30903(-463929735);
		@Pc(17) Class570 local17 = client.aClass539_1.method30932(-1638462787);
		@Pc(21) Class41_Sub3 local21 = client.aClass539_1.method30905(2043094463);
		@Pc(23) int local23 = arg0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(33) int local33 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(40) int local40 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local33 >= 0 && local33 < Class123.aBooleanArrayArray17.length && local40 >= 0 && local40 < Class123.aBooleanArrayArray17[local33].length && Class123.aBooleanArrayArray17[local33][local40]) {
				local23 = 0;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < local5; local64++) {
			for (@Pc(69) int local69 = 0; local69 < local9; local69++) {
				for (@Pc(74) int local74 = local23; local74 <= arg0 + 1 && local74 <= 3; local74++) {
					if ((local74 < arg0 || local13.method30430(arg0, local74, local64, local69, 73602969)) && !Class210.method25807((Interface60) local17.method31558(local74, local64, local69, 207715643), local21, local64, local69, 1978955526) && !Class210.method25807((Interface60) local17.method31574(local74, local64, local69, client.anInterface62_1, (byte) -65), local21, local64, local69, 1956672816) && !Class210.method25807((Interface60) local17.method31570(local74, local64, local69, (byte) 24), local21, local64, local69, 2020160138) && Class210.method25807((Interface60) local17.method31572(local74, local64, local69, (byte) 24), local21, local64, local69, 2096150237)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cz", name = "<init>", descriptor = "()V")
	Class97() {
	}
}
