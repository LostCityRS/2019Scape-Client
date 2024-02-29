package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public class Class566 {

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "I")
	static int anInt5385;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 9)
	Class566() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I", line = 16)
	public static int method31256() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class104 local19 = Class5.method40(0, local3, null, null, null, null, null, null, 0, 636490669);
		@Pc(22) long local22 = Class305.method26797(1743154666);
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20873(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class305.method26797(912745247) - local22);
		local19.method20469(0, 0, 100, 100, -16777216, (byte) 81);
		local19.method20429(-574234102);
		return local24;
	}

	@OriginalMember(owner = "client!t", name = "z", descriptor = "(Lclient!aqc;I)I", line = 286)
	static int method31257(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class336 local2 = arg0.aClass336_1;
		if (local2.anIntArray412 != null) {
			local2 = local2.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 18848);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local2.anInt4172 * -374268759;
		@Pc(26) Class622 local26 = arg0.method19997(1585179025);
		@Pc(31) int local31 = arg0.aClass19_Sub3_3.method23564((byte) 37);
		if (local31 == -1 || arg0.aClass19_Sub3_3.aBoolean379) {
			local22 = local2.anInt4170 * 1249212417;
		} else if (local31 == local26.anInt5680 * 1046628773 || local31 == local26.anInt5654 * 884977547 || local31 == local26.anInt5656 * 1632091583 || local26.anInt5655 * 1798234475 == local31) {
			local22 = local2.anInt4173 * -2119958049;
		} else if (local26.anInt5657 * -2077928117 == local31 || local31 == local26.anInt5658 * 1363226867 || local26.anInt5645 * 285037349 == local31 || local31 == local26.anInt5653 * -2038961455) {
			local22 = local2.anInt4171 * 965071225;
		}
		return local22;
	}

	@OriginalMember(owner = "client!t", name = "agk", descriptor = "(Lclient!yf;S)V", line = 10675)
	static final void method31258(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) long local12 = arg0.aLongArray27[(arg0.anInt5894 -= -1364417339) * -2000995827];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local12 == -1L ? "" : Long.toString(local12, 36).toUpperCase();
	}
}
