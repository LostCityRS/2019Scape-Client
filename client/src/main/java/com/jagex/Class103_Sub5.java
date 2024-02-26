package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class103_Sub5 extends Class103 {

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
	final int anInt922;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
	final int anInt919;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "I")
	final int anInt920;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
	final int anInt921;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
	final int anInt918;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub5(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt922 = arg0.method23178((byte) -10) * -1602950839;
		@Pc(13) int local13 = arg0.method23182(-1981170642);
		this.anInt919 = (local13 >>> 16) * 696558757;
		this.anInt920 = (local13 & 0xFFFF) * -1623119353;
		this.anInt921 = arg0.method23362(-508604208) * 2058502683;
		this.anInt918 = arg0.method23362(-290898923) * 250027497;
	}

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class700.aClass249Array1[this.anInt922 * 626546937].method26341(this.anInt921 * -178206701, this.anInt919 * -632118483, this.anInt920 * 133440439, this.anInt918 * 2012187225, -970224078);
	}

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class700.aClass249Array1[this.anInt922 * 626546937].method26341(this.anInt921 * -178206701, this.anInt919 * -632118483, this.anInt920 * 133440439, this.anInt918 * 2012187225, -970224078);
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class700.aClass249Array1[this.anInt922 * 626546937].method26341(this.anInt921 * -178206701, this.anInt919 * -632118483, this.anInt920 * 133440439, this.anInt918 * 2012187225, -970224078);
	}
}
