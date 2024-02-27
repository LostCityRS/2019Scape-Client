package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class363 {

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Lclient!adg;")
	static Class81 aClass81_1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!jl;")
	public static final Class363 aClass363_1 = new Class363(0);

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!jl;")
	public static final Class363 aClass363_2 = new Class363(1);

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	int anInt4735;

	@OriginalMember(owner = "client!jl", name = "kj", descriptor = "(Lclient!yf;I)V")
	static void method28031(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -168418845);
		Class266.method26320(local16, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "(Lclient!zg;I)V")
	static void method28032(@OriginalArg(0) Class704 arg0, @OriginalArg(1) int arg1) {
		Class676.aClass704_1 = arg0;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
	Class363(@OriginalArg(0) int arg0) {
		this.anInt4735 = arg0 * -1370283059;
	}
}
