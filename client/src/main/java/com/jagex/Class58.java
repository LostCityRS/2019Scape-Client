package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aci")
public abstract class Class58 {

	@OriginalMember(owner = "client!aci", name = "t", descriptor = "I")
	protected final int anInt2068;

	@OriginalMember(owner = "client!aci", name = "f", descriptor = "I")
	protected final int anInt2065;

	@OriginalMember(owner = "client!aci", name = "e", descriptor = "I")
	protected final int anInt2064;

	@OriginalMember(owner = "client!aci", name = "u", descriptor = "I")
	protected final int anInt2062;

	@OriginalMember(owner = "client!aci", name = "l", descriptor = "I")
	protected final int anInt2066;

	@OriginalMember(owner = "client!aci", name = "g", descriptor = "I")
	protected final int anInt2067;

	@OriginalMember(owner = "client!aci", name = "i", descriptor = "Z")
	protected final boolean aBoolean415;

	@OriginalMember(owner = "client!aci", name = "m", descriptor = "Z")
	protected final boolean aBoolean414;

	@OriginalMember(owner = "client!aci", name = "o", descriptor = "I")
	protected final int anInt2063;

	@OriginalMember(owner = "client!aci", name = "f", descriptor = "(IB)Z")
	public static boolean method15723(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!aci", name = "<init>", descriptor = "(IIIIIIZZI)V")
	Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt2068 = arg0 * -925517065;
		this.anInt2065 = arg1 * 1771436847;
		this.anInt2064 = (arg2 > 65535 ? 65535 : arg2) * -1098340371;
		this.anInt2062 = arg3 * 243414755;
		this.anInt2066 = (arg4 > 255 ? 255 : arg4) * -1642685853;
		this.anInt2067 = arg5 * 173646641;
		this.aBoolean415 = arg6;
		this.aBoolean414 = arg7;
		this.anInt2063 = arg8 * 170213405;
	}
}
