package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asj")
public abstract class Class80_Sub1_Sub15 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asj", name = "hr", descriptor = "Lclient!aor;")
	public static Class41_Sub14 aClass41_Sub14_4;

	@OriginalMember(owner = "client!asj", name = "m", descriptor = "Z")
	boolean aBoolean662;

	@OriginalMember(owner = "client!asj", name = "i", descriptor = "Z")
	boolean aBoolean663;

	@OriginalMember(owner = "client!asj", name = "o", descriptor = "Z")
	volatile boolean aBoolean661 = true;

	@OriginalMember(owner = "client!asj", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub15() {
	}

	@OriginalMember(owner = "client!asj", name = "e", descriptor = "()[B")
	abstract byte[] method24389();

	@OriginalMember(owner = "client!asj", name = "t", descriptor = "(I)[B")
	abstract byte[] method24390(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!asj", name = "f", descriptor = "(I)I")
	abstract int method24391(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!asj", name = "u", descriptor = "()[B")
	abstract byte[] method24392();

	@OriginalMember(owner = "client!asj", name = "l", descriptor = "()I")
	abstract int method24393();
}
