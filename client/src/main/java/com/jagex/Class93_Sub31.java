package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aku")
public abstract class Class93_Sub31 extends Class93 {

	@OriginalMember(owner = "client!aku", name = "<init>", descriptor = "()V", line = 48)
	Class93_Sub31() {
	}

	@OriginalMember(owner = "client!aku", name = "by", descriptor = "(III)Ljava/lang/String;", line = 1602)
	static String method22006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return Class306.method26804(16711680, 705342578);
		} else if (local3 < -6) {
			return Class306.method26804(16723968, 1437439277);
		} else if (local3 < -3) {
			return Class306.method26804(16740352, -974600552);
		} else if (local3 < 0) {
			return Class306.method26804(16756736, 1658067056);
		} else if (local3 > 9) {
			return Class306.method26804(65280, -437728003);
		} else if (local3 > 6) {
			return Class306.method26804(4259584, 615714614);
		} else if (local3 > 3) {
			return Class306.method26804(8453888, 700424747);
		} else if (local3 > 0) {
			return Class306.method26804(12648192, -1451529802);
		} else {
			return Class306.method26804(16776960, -9177997);
		}
	}

	@OriginalMember(owner = "client!aku", name = "cm", descriptor = "(Lclient!yf;B)V", line = 5407)
	static final void method22007(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1267060406);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class420.method28740(local16, local22, arg0, 1036938367);
	}

	@OriginalMember(owner = "client!aku", name = "kd", descriptor = "(I[IB)V", line = 11833)
	static final void method22008(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		if (!Class383.method28142(arg0, arg1, 1244060671)) {
			return;
		}
		@Pc(10) Class312[] local10 = Class166_Sub1.aClass320Array1[arg0].aClass312Array3;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) Class312 local20 = local10[local12];
			if (local20 != null && local20.aClass19_6 != null) {
				local20.aClass19_6.method23608(1349415831);
			}
		}
	}

	@OriginalMember(owner = "client!aku", name = "m", descriptor = "(Lclient!alw;)V")
	abstract void method22009(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!aku", name = "n", descriptor = "(Lclient!akr;S)V")
	abstract void method22010(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!aku", name = "f", descriptor = "(Lclient!akr;)V")
	abstract void method22011(@OriginalArg(0) Class93_Sub28 arg0);

	@OriginalMember(owner = "client!aku", name = "k", descriptor = "(Lclient!akr;)V")
	abstract void method22012(@OriginalArg(0) Class93_Sub28 arg0);

	@OriginalMember(owner = "client!aku", name = "w", descriptor = "(Lclient!akr;)V")
	abstract void method22013(@OriginalArg(0) Class93_Sub28 arg0);

	@OriginalMember(owner = "client!aku", name = "e", descriptor = "(Lclient!alw;I)V")
	abstract void method22014(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);
}
