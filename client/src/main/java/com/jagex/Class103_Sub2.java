package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afc")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!afc", name = "a", descriptor = "Ljava/lang/String;")
	static String aString24;

	@OriginalMember(owner = "client!afc", name = "ds", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!afc", name = "f", descriptor = "I")
	final int anInt575;

	@OriginalMember(owner = "client!afc", name = "e", descriptor = "I")
	final int anInt576;

	@OriginalMember(owner = "client!afc", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub2(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt575 = arg0.g2() * 1787863131;
		this.anInt576 = arg0.g2() * -40500783;
	}

	@OriginalMember(owner = "client!afc", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass254Array1[this.anInt575 * -117731373].method26399((byte) 53).method18986(this.anInt576 * -482740431, true, (byte) -82);
	}

	@OriginalMember(owner = "client!afc", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass254Array1[this.anInt575 * -117731373].method26399((byte) -39).method18986(this.anInt576 * -482740431, true, (byte) -31);
	}

	@OriginalMember(owner = "client!afc", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass254Array1[this.anInt575 * -117731373].method26399((byte) -22).method18986(this.anInt576 * -482740431, true, (byte) -113);
	}
}
