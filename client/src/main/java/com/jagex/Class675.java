package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xz")
public final class Class675 {

	@OriginalMember(owner = "client!xz", name = "t", descriptor = "I")
	public static final int anInt5736 = 256;

	@OriginalMember(owner = "client!xz", name = "f", descriptor = "I")
	public static final int anInt5737 = 2048;

	@OriginalMember(owner = "client!xz", name = "bo", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method33585(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		if (client.method25326(arg0).method14312(-1379287027) && client.aClass327_10 == null) {
			Class565.method31481(arg0.anInt4087 * -2053489901, arg0.anInt4094 * 2071556223, -874087145);
			client.aClass327_10 = Class369.method28340(arg0.anInt4087 * -2053489901, arg0.anInt4094 * 2071556223, 404067354);
			Class296.method26998(client.aClass327_10, -418069776);
		}
	}

	@OriginalMember(owner = "client!xz", name = "<init>", descriptor = "()V")
	Class675() throws Throwable {
		throw new Error();
	}
}
