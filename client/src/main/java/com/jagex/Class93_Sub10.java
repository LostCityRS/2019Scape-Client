package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajx")
public class Class93_Sub10 extends Class93 {

	@OriginalMember(owner = "client!ajx", name = "k", descriptor = "I")
	int anInt1491;

	@OriginalMember(owner = "client!ajx", name = "f", descriptor = "I")
	int anInt1490;

	@OriginalMember(owner = "client!ajx", name = "w", descriptor = "I")
	int anInt1493;

	@OriginalMember(owner = "client!ajx", name = "l", descriptor = "I")
	int anInt1492;

	@OriginalMember(owner = "client!ajx", name = "u", descriptor = "I")
	int anInt1489;

	@OriginalMember(owner = "client!ajx", name = "z", descriptor = "Z")
	boolean aBoolean319;

	@OriginalMember(owner = "client!ajx", name = "<init>", descriptor = "(IIIIIZ)V", line = 66)
	Class93_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1491 = arg0 * 336875199;
		this.anInt1490 = arg1 * -2076732833;
		this.anInt1493 = arg2 * -299535505;
		this.anInt1492 = arg3 * 1630479355;
		this.anInt1489 = arg4 * -2027103883;
		this.aBoolean319 = arg5;
	}
}
