package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akp")
public abstract class Class93_Sub26 extends Class93 {

	@OriginalMember(owner = "client!akp", name = "ib", descriptor = "Lclient!ws;")
	public static Class645 aClass645_15;

	@OriginalMember(owner = "client!akp", name = "aep", descriptor = "(Lclient!yf;B)V")
	static void method22008(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class464.method29466(local13, local23);
	}

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "()V")
	Class93_Sub26() {
	}

	@OriginalMember(owner = "client!akp", name = "f", descriptor = "(Lclient!kr;)V")
	abstract void method22002(@OriginalArg(0) Class386 arg0);

	@OriginalMember(owner = "client!akp", name = "e", descriptor = "(Lclient!alw;B)V")
	abstract void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!akp", name = "n", descriptor = "(Lclient!kr;I)V")
	abstract void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!akp", name = "m", descriptor = "(Lclient!alw;)V")
	abstract void method22005(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!akp", name = "k", descriptor = "(Lclient!kr;)V")
	abstract void method22006(@OriginalArg(0) Class386 arg0);

	@OriginalMember(owner = "client!akp", name = "w", descriptor = "(Lclient!kr;)V")
	abstract void method22007(@OriginalArg(0) Class386 arg0);
}
