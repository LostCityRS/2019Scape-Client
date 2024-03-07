package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public class Class343 implements Interface4 {

	@OriginalMember(owner = "client!in", name = "hx", descriptor = "Lclient!aov;")
	public static Class32_Sub19 aClass32_Sub19_1;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(Ljava/lang/CharSequence;CI)I", line = 11)
	static int method27518(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 268)
	Class343() {
	}

	@OriginalMember(owner = "client!in", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 271)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 271)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 271)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 271)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class347(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 275)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class347.class;
	}

	@OriginalMember(owner = "client!in", name = "x", descriptor = "()Ljava/lang/Class;", line = 275)
	@Override
	public Class method27705() {
		return Class347.class;
	}

	@OriginalMember(owner = "client!in", name = "ap", descriptor = "(B)Lclient!sm;", line = 838)
	public static Class555 method27519(@OriginalArg(0) byte arg0) {
		return Class553.aClass555_2;
	}

	@OriginalMember(owner = "client!in", name = "aeu", descriptor = "(Lclient!yf;I)V", line = 10240)
	static final void method27520(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (Math.random() * (double) local12);
	}

	@OriginalMember(owner = "client!in", name = "alo", descriptor = "(Lclient!yf;I)V", line = 11965)
	static final void method27521(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = null;
		if (Class120.userLastLoginHost != null) {
			local1 = Class120.userLastLoginHost.method30140(-1773318151);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!in", name = "bby", descriptor = "(Lclient!yf;B)V", line = 14360)
	static final void method27522(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!in", name = "bft", descriptor = "(Lclient!yf;S)V", line = 15176)
	static final void method27523(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
