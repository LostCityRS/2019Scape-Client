package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class343 {

	@OriginalMember(owner = "client!in", name = "t", descriptor = "Ljava/lang/String;")
	final String aString191;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	final int anInt4244;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	final int anInt4245;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method27943(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!in", name = "t", descriptor = "(Lclient!aoa;I)V")
	public static void method27944(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1) {
		Class1.aClass41_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "zc", descriptor = "(Lclient!yp;I)V")
	static void method27945(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class363.aClass152_1.method14591((short) 9328) ? 1 : 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class363.aClass152_1.method14594(715372596) ? 1 : 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class363.aClass152_1.method14597(-1667477178) ? 1 : 0;
	}

	@OriginalMember(owner = "client!in", name = "x", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	static String method27946(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		@Pc(22) int local22 = -1;
		if (arg0.startsWith("directlogin ")) {
			local22 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (local22 >= 0) {
			@Pc(37) int local37 = arg0.length();
			arg0 = arg0.substring(0, local22) + " ";
			for (@Pc(53) int local53 = local22 + 1; local53 < local37; local53++) {
				arg0 = arg0 + "*";
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/String;II)V")
	Class343(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString191 = arg0;
		this.anInt4244 = arg1 * 1693333595;
		this.anInt4245 = arg2 * -560768575;
	}
}
