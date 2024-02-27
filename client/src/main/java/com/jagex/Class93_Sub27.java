package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akq")
public final class Class93_Sub27 extends Class93 {

	@OriginalMember(owner = "client!akq", name = "k", descriptor = "I")
	public final int anInt1601;

	@OriginalMember(owner = "client!akq", name = "f", descriptor = "I")
	public final int anInt1594;

	@OriginalMember(owner = "client!akq", name = "w", descriptor = "I")
	public final int anInt1595;

	@OriginalMember(owner = "client!akq", name = "p", descriptor = "I")
	public final int anInt1597;

	@OriginalMember(owner = "client!akq", name = "d", descriptor = "I")
	public final int anInt1600;

	@OriginalMember(owner = "client!akq", name = "l", descriptor = "I")
	public final int anInt1596;

	@OriginalMember(owner = "client!akq", name = "u", descriptor = "I")
	public final int anInt1593;

	@OriginalMember(owner = "client!akq", name = "z", descriptor = "I")
	public final int anInt1598;

	@OriginalMember(owner = "client!akq", name = "c", descriptor = "I")
	public final int anInt1599;

	@OriginalMember(owner = "client!akq", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class93_Sub27(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method22431(-118643075);
		this.anInt1601 = (local5 >>> 28) * -691134935;
		this.anInt1594 = (local5 >>> 14 & 0x3FFF) * -21672597;
		this.anInt1595 = (local5 & 0x3FFF) * 1626693537;
		this.anInt1597 = arg0.method22425((short) 16384) * -77027975;
		this.anInt1600 = arg0.method22425((short) 16384) * 1117910387;
		this.anInt1596 = arg0.method22425((short) 16384) * -491244483;
		this.anInt1593 = arg0.method22425((short) 16384) * 418805403;
		this.anInt1598 = arg0.method22425((short) 16384) * -1602143305;
		this.anInt1599 = arg0.method22425((short) 16384) * 703349233;
	}
}
