package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akh")
public final class Class80_Sub18 extends Class80 {

	@OriginalMember(owner = "client!akh", name = "g", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!akh", name = "l", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!akh", name = "i", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!akh", name = "m", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!akh", name = "o", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!akh", name = "u", descriptor = "I")
	public int anInt1587 = 919830915;

	@OriginalMember(owner = "client!akh", name = "j", descriptor = "Z")
	public boolean aBoolean364 = false;

	@OriginalMember(owner = "client!akh", name = "<init>", descriptor = "(I)V")
	Class80_Sub18(@OriginalArg(0) int arg0) {
		this.anInt1587 = arg0 * -919830915;
	}
}
