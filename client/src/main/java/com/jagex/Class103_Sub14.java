package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agk")
public final class Class103_Sub14 extends Class103 {

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "I")
	final int anInt964;

	@OriginalMember(owner = "client!agk", name = "o", descriptor = "(I)Lclient!zj;")
	public static Class708 method8213(@OriginalArg(0) int arg0) {
		return Class499.aClass708_1 == null ? Class708.aClass708_3 : Class499.aClass708_1;
	}

	@OriginalMember(owner = "client!agk", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub14(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt964 = arg0.method23178((byte) -101) * 416802955;
	}

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class700.aClass249Array1[this.anInt964 * 1877163811].method26347(-1137688489);
	}

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class700.aClass249Array1[this.anInt964 * 1877163811].method26347(-881340121);
	}

	@OriginalMember(owner = "client!agk", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class700.aClass249Array1[this.anInt964 * 1877163811].method26347(-954156869);
	}
}
