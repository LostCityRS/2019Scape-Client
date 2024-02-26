package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class550 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!si", name = "this$0", descriptor = "Lclient!so;")
	final Class556 aClass556_4;

	@OriginalMember(owner = "client!si", name = "av", descriptor = "(IIIII)V")
	public static void method31318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class622.aLinkedList7.addLast(new Class618(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!si", name = "dj", descriptor = "(IIIZI)V")
	public static void method31319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(1) Class80_Sub1_Sub12 local1 = Class159_Sub1.aClass80_Sub1_Sub12_3;
		Class159_Sub1.method15336(arg0);
		Class159_Sub1.aBoolean398 = false;
		if (local1 != Class159_Sub1.aClass80_Sub1_Sub12_3) {
			Class443.method29216(1444877302);
		}
		Class159_Sub1.anInt2021 = arg1 * -427851623;
		Class159_Sub1.anInt2025 = arg2 * 869244937;
		Class159_Sub1.aBoolean403 = arg3;
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!so;)V")
	Class550(@OriginalArg(0) Class556 arg0) {
		this.aClass556_4 = arg0;
	}
}
