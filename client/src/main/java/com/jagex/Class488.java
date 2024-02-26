package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class488 {

	@OriginalMember(owner = "client!po", name = "t", descriptor = "I")
	public static final int anInt5007 = 2;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public static final int anInt5008 = 5;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	public static final int anInt5009 = 3;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "I")
	public static final int anInt5010 = 4;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public static final int anInt5011 = 1;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public static final int anInt5012 = 6;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "(I)V")
	public static void method30210(@OriginalArg(0) int arg0) {
		Class622.anInt5477 = 1734596115;
	}

	@OriginalMember(owner = "client!po", name = "tp", descriptor = "(Lclient!yp;I)V")
	static void method30211(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class527.method30714(local11, arg0, 2043492022);
	}

	@OriginalMember(owner = "client!po", name = "ayh", descriptor = "(Lclient!yp;I)V")
	static void method30212(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class254.anInt3885 * -272193729 == 1) {
			Class171.aBoolean620 = true;
		} else if (Class254.anInt3885 * -272193729 == 3) {
			Class171.aBoolean621 = true;
		}
	}

	@OriginalMember(owner = "client!po", name = "l", descriptor = "(I)V")
	public static void method30213(@OriginalArg(0) int arg0) {
		if (Class238.anInt3841 * 1722349977 != 4) {
			Class238.aClass75_3.method1319((short) 468);
			Class324.method27619((byte) 0);
			Class570.method31723(-694025820);
		}
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	Class488() throws Throwable {
		throw new Error();
	}
}
