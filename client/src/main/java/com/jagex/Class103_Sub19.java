package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agr")
public final class Class103_Sub19 extends Class103 {

	@OriginalMember(owner = "client!agr", name = "f", descriptor = "I")
	final int anInt1006;

	@OriginalMember(owner = "client!agr", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub19(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt1006 = arg0.method23178((byte) -8) * 1214468155;
	}

	@OriginalMember(owner = "client!agr", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass254Array1[this.anInt1006 * -1692727053].method26386(868762005);
	}

	@OriginalMember(owner = "client!agr", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass254Array1[this.anInt1006 * -1692727053].method26386(-1443709113);
	}

	@OriginalMember(owner = "client!agr", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass254Array1[this.anInt1006 * -1692727053].method26386(488494613);
	}
}
