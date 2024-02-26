package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class516 {

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "Lclient!qr;")
	static final Class516 aClass516_1 = new Class516(0, false);

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "Lclient!qr;")
	public static final Class516 aClass516_2 = new Class516(1, false);

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!qr;")
	static final Class516 aClass516_7 = new Class516(2, false);

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Lclient!qr;")
	static final Class516 aClass516_4 = new Class516(3, false);

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!qr;")
	static final Class516 aClass516_5 = new Class516(4, false);

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "Lclient!qr;")
	static final Class516 aClass516_9 = new Class516(5, true);

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!qr;")
	static final Class516 aClass516_3 = new Class516(6, true);

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Lclient!qr;")
	static final Class516 aClass516_8 = new Class516(7, true);

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "Lclient!qr;")
	static final Class516 aClass516_6 = new Class516(8, true);

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	final int anInt5053;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Z")
	public final boolean aBoolean886;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IZ)V")
	Class516(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt5053 = arg0 * 1405262759;
		this.aBoolean886 = arg1;
	}
}
