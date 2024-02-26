package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class640 implements Interface75 {

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "Lclient!wl;")
	static final Class640 aClass640_1 = new Class640(0);

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!wl;")
	public static final Class640 aClass640_2 = new Class640(1);

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!wl;")
	public static final Class640 aClass640_3 = new Class640(2);

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	final int anInt5638;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "()[Lclient!wl;")
	public static Class640[] method32890() {
		return new Class640[] { aClass640_3, aClass640_1, aClass640_2 };
	}

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "()[Lclient!wl;")
	public static Class640[] method32891() {
		return new Class640[] { aClass640_3, aClass640_1, aClass640_2 };
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()[Lclient!wl;")
	public static Class640[] method32892() {
		return new Class640[] { aClass640_3, aClass640_1, aClass640_2 };
	}

	@OriginalMember(owner = "client!wl", name = "agy", descriptor = "(Lclient!yp;I)V")
	static void method32893(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class679.anInt5743 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
	Class640(@OriginalArg(0) int arg0) {
		this.anInt5638 = arg0 * 1516040377;
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5638 * 1050940809;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5638 * 1050940809;
	}

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5638 * 1050940809;
	}
}
