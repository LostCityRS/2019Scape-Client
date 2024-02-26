package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class363 {

	@OriginalMember(owner = "client!jl", name = "ey", descriptor = "Lclient!um;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public int anInt4494;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public int anInt4496;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "(IIB)I")
	public static int method28160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!jl", name = "auy", descriptor = "(Lclient!yp;I)V")
	static void method28161(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean709 ? 1 : 0;
	}
}
