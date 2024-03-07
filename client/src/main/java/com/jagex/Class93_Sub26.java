package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akp")
public abstract class Class93_Sub26 extends Class93 {

	@OriginalMember(owner = "client!akp", name = "ib", descriptor = "Lclient!ws;")
	public static Class645 aClass645_15;

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "()V", line = 66)
	Class93_Sub26() {
	}

	@OriginalMember(owner = "client!akp", name = "aep", descriptor = "(Lclient!yf;B)V", line = 10439)
	static final void method21990(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class464.method29283(local13, local23);
	}

	@OriginalMember(owner = "client!akp", name = "f", descriptor = "(Lclient!kr;)V")
	abstract void method21991(@OriginalArg(0) Class386 arg0);

	@OriginalMember(owner = "client!akp", name = "e", descriptor = "(Lclient!alw;B)V")
	abstract void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!akp", name = "n", descriptor = "(Lclient!kr;I)V")
	abstract void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!akp", name = "m", descriptor = "(Lclient!alw;)V")
	abstract void method21994(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!akp", name = "k", descriptor = "(Lclient!kr;)V")
	abstract void method21995(@OriginalArg(0) Class386 arg0);

	@OriginalMember(owner = "client!akp", name = "w", descriptor = "(Lclient!kr;)V")
	abstract void method21996(@OriginalArg(0) Class386 arg0);
}
