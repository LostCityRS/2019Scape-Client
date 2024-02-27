package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class343 implements Interface4 {

	@OriginalMember(owner = "client!in", name = "hx", descriptor = "Lclient!aov;")
	public static Class32_Sub19 aClass32_Sub19_1;

	@OriginalMember(owner = "client!in", name = "ap", descriptor = "(B)Lclient!sm;")
	public static Class555 method27611(@OriginalArg(0) byte arg0) {
		return Class553.aClass555_2;
	}

	@OriginalMember(owner = "client!in", name = "aeu", descriptor = "(Lclient!yf;I)V")
	static void method27612(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) (Math.random() * (double) local12);
	}

	@OriginalMember(owner = "client!in", name = "alo", descriptor = "(Lclient!yf;I)V")
	static void method27613(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = null;
		if (Class120.aClass499_1 != null) {
			local1 = Class120.aClass499_1.method30321(-1773318151);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!in", name = "bft", descriptor = "(Lclient!yf;S)V")
	static void method27614(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(Ljava/lang/CharSequence;CI)I")
	static int method27615(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!in", name = "bby", descriptor = "(Lclient!yf;B)V")
	static void method27616(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	Class343() {
	}

	@OriginalMember(owner = "client!in", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class347.class;
	}

	@OriginalMember(owner = "client!in", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class347.class;
	}
}
