package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqh")
public final class Class103_Sub17_Sub2 extends Class103_Sub17 {

	@OriginalMember(owner = "client!aqh", name = "ay", descriptor = "Lclient!cm;")
	static Class99 aClass99_18;

	@OriginalMember(owner = "client!aqh", name = "l", descriptor = "I")
	final int anInt2753;

	@OriginalMember(owner = "client!aqh", name = "g", descriptor = "I")
	final int anInt2752;

	@OriginalMember(owner = "client!aqh", name = "i", descriptor = "I")
	final int anInt2754;

	@OriginalMember(owner = "client!aqh", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub17_Sub2(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt2753 = arg0.g2() * -1047384719;
		this.anInt2752 = arg0.g1() * -605190997;
		this.anInt2754 = arg0.g2() * 1916188747;
	}

	@OriginalMember(owner = "client!aqh", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass254Array1[this.anInt2753 * -348982383].method26399((byte) -89).method18998(this.anInt2750 * -1969476479, this.anInt2751 * -1677889011 << 16, this.anInt2749 * -1154802479, this.anInt2754 * -147500701, false, this.anInt2752 * -1460513277, -360356141);
	}

	@OriginalMember(owner = "client!aqh", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass254Array1[this.anInt2753 * -348982383].method26399((byte) 26).method18998(this.anInt2750 * -1969476479, this.anInt2751 * -1677889011 << 16, this.anInt2749 * -1154802479, this.anInt2754 * -147500701, false, this.anInt2752 * -1460513277, -360356141);
	}

	@OriginalMember(owner = "client!aqh", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass254Array1[this.anInt2753 * -348982383].method26399((byte) 38).method18998(this.anInt2750 * -1969476479, this.anInt2751 * -1677889011 << 16, this.anInt2749 * -1154802479, this.anInt2754 * -147500701, false, this.anInt2752 * -1460513277, -360356141);
	}
}
