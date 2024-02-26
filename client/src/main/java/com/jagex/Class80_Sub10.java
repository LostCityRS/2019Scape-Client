package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajx")
public final class Class80_Sub10 extends Class80 {

	@OriginalMember(owner = "client!ajx", name = "u", descriptor = "I")
	int anInt1514;

	@OriginalMember(owner = "client!ajx", name = "l", descriptor = "I")
	int anInt1511;

	@OriginalMember(owner = "client!ajx", name = "g", descriptor = "I")
	int anInt1510;

	@OriginalMember(owner = "client!ajx", name = "i", descriptor = "I")
	int anInt1513;

	@OriginalMember(owner = "client!ajx", name = "m", descriptor = "I")
	int anInt1512;

	@OriginalMember(owner = "client!ajx", name = "o", descriptor = "Z")
	boolean aBoolean347;

	@OriginalMember(owner = "client!ajx", name = "<init>", descriptor = "(IIIIIZ)V")
	Class80_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1514 = arg0 * -1197459177;
		this.anInt1511 = arg1 * 202549789;
		this.anInt1510 = arg2 * -543342913;
		this.anInt1513 = arg3 * 1378089671;
		this.anInt1512 = arg4 * -1514995065;
		this.aBoolean347 = arg5;
	}
}
