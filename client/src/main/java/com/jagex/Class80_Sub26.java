package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akp")
public abstract class Class80_Sub26 extends Class80 {

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "()V")
	Class80_Sub26() {
	}

	@OriginalMember(owner = "client!akp", name = "t", descriptor = "(Lclient!ald;B)V")
	abstract void method22253(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!akp", name = "l", descriptor = "(Lclient!akv;)V")
	abstract void method22254(@OriginalArg(0) Class80_Sub32 arg0);

	@OriginalMember(owner = "client!akp", name = "e", descriptor = "(Lclient!ald;)V")
	abstract void method22255(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!akp", name = "u", descriptor = "(Lclient!akv;)V")
	abstract void method22256(@OriginalArg(0) Class80_Sub32 arg0);

	@OriginalMember(owner = "client!akp", name = "f", descriptor = "(Lclient!akv;I)V")
	abstract void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1);
}
