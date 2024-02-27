package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zm")
public final class Class711 implements Interface75 {

	@OriginalMember(owner = "client!zm", name = "t", descriptor = "Lclient!zm;")
	public static final Class711 aClass711_6 = new Class711(-2);

	@OriginalMember(owner = "client!zm", name = "f", descriptor = "Lclient!zm;")
	public static final Class711 aClass711_3 = new Class711(-3);

	@OriginalMember(owner = "client!zm", name = "e", descriptor = "Lclient!zm;")
	static final Class711 aClass711_4 = new Class711(2);

	@OriginalMember(owner = "client!zm", name = "u", descriptor = "Lclient!zm;")
	public static final Class711 aClass711_5 = new Class711(3);

	@OriginalMember(owner = "client!zm", name = "l", descriptor = "Lclient!zm;")
	static final Class711 aClass711_7 = new Class711(21);

	@OriginalMember(owner = "client!zm", name = "g", descriptor = "Lclient!zm;")
	static final Class711 aClass711_2 = new Class711(20);

	@OriginalMember(owner = "client!zm", name = "i", descriptor = "I")
	final int anInt5821;

	@OriginalMember(owner = "client!zm", name = "m", descriptor = "()[Lclient!zm;")
	public static Class711[] method37165() {
		return new Class711[] { aClass711_5, aClass711_4, aClass711_6, aClass711_2, aClass711_7, aClass711_3 };
	}

	@OriginalMember(owner = "client!zm", name = "e", descriptor = "()[Lclient!zm;")
	public static Class711[] method37166() {
		return new Class711[] { aClass711_5, aClass711_4, aClass711_6, aClass711_2, aClass711_7, aClass711_3 };
	}

	@OriginalMember(owner = "client!zm", name = "u", descriptor = "()[Lclient!zm;")
	public static Class711[] method37167() {
		return new Class711[] { aClass711_5, aClass711_4, aClass711_6, aClass711_2, aClass711_7, aClass711_3 };
	}

	@OriginalMember(owner = "client!zm", name = "l", descriptor = "()[Lclient!zm;")
	public static Class711[] method37168() {
		return new Class711[] { aClass711_5, aClass711_4, aClass711_6, aClass711_2, aClass711_7, aClass711_3 };
	}

	@OriginalMember(owner = "client!zm", name = "np", descriptor = "(B)V")
	static void method37169(@OriginalArg(0) byte arg0) {
		if (Class697.aClass697_6 != Class566.aClass697_1) {
			Class442.aClass442_9.method29194(1322279469);
		}
	}

	@OriginalMember(owner = "client!zm", name = "<init>", descriptor = "(I)V")
	Class711(@OriginalArg(0) int arg0) {
		this.anInt5821 = arg0 * -1713940233;
	}

	@OriginalMember(owner = "client!zm", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5821 * 307685575;
	}

	@OriginalMember(owner = "client!zm", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5821 * 307685575;
	}

	@OriginalMember(owner = "client!zm", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5821 * 307685575;
	}
}
