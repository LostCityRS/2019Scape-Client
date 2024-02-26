package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asd")
public abstract class Class80_Sub1_Sub13 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asd", name = "i", descriptor = "I")
	public final int anInt3226;

	@OriginalMember(owner = "client!asd", name = "<init>", descriptor = "(I)V")
	Class80_Sub1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt3226 = arg0 * -825767465;
	}

	@OriginalMember(owner = "client!asd", name = "j", descriptor = "(Lclient!ald;)V")
	public abstract void method23747(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!asd", name = "g", descriptor = "(F)V")
	public abstract void method23748(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!asd", name = "u", descriptor = "(Lclient!ald;I)V")
	public abstract void method23749(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!asd", name = "l", descriptor = "(F)V")
	public abstract void method23750(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!asd", name = "e", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;B)V")
	public abstract void method23751(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!asd", name = "i", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	public abstract void method23752(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2);

	@OriginalMember(owner = "client!asd", name = "f", descriptor = "(FI)V")
	public abstract void method23753(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!asd", name = "o", descriptor = "(Lclient!ald;)V")
	public abstract void method23754(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!asd", name = "m", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	public abstract void method23755(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2);

	@OriginalMember(owner = "client!asd", name = "a", descriptor = "(Lclient!ald;)V")
	public abstract void method23756(@OriginalArg(0) Packet arg0);
}
