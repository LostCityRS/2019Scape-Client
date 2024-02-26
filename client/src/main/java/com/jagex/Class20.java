package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aas")
public abstract class Class20 {

	@OriginalMember(owner = "client!aas", name = "hk", descriptor = "Lclient!aoz;")
	public static Class41_Sub21 aClass41_Sub21_11;

	@OriginalMember(owner = "client!aas", name = "t", descriptor = "Lclient!jw;")
	final Class121 aClass121_16;

	@OriginalMember(owner = "client!aas", name = "tt", descriptor = "(Lclient!yp;I)V")
	static void method23096(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2093969375);
		Class603.method32131(local16, arg0, (byte) 19);
	}

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "(Lclient!jw;)V")
	Class20(@OriginalArg(0) Class121 arg0) {
		this.aClass121_16 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "w", descriptor = "()Lclient!on;")
	public abstract Class463 method23074();

	@OriginalMember(owner = "client!aas", name = "t", descriptor = "(FI)V")
	public abstract void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aas", name = "f", descriptor = "(B)Z")
	public abstract boolean method23076(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!aas", name = "m", descriptor = "(F)V")
	public abstract void method23077(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aas", name = "u", descriptor = "(I)Lclient!on;")
	public abstract Class463 method23078(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aas", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	public abstract void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "(I)Lclient!on;")
	public abstract Class463 method23080(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aas", name = "i", descriptor = "(F)V")
	public abstract void method23081(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aas", name = "o", descriptor = "(F)V")
	public abstract void method23082(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aas", name = "j", descriptor = "(F)V")
	public abstract void method23083(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aas", name = "a", descriptor = "()Z")
	public abstract boolean method23084();

	@OriginalMember(owner = "client!aas", name = "x", descriptor = "()Lclient!on;")
	public abstract Class463 method23085();

	@OriginalMember(owner = "client!aas", name = "k", descriptor = "()Lclient!on;")
	public abstract Class463 method23086();

	@OriginalMember(owner = "client!aas", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	public abstract void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!aas", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	public abstract void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!aas", name = "r", descriptor = "()Lclient!on;")
	public abstract Class463 method23089();

	@OriginalMember(owner = "client!aas", name = "q", descriptor = "(Lclient!ald;)V")
	public abstract void method23090(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!aas", name = "h", descriptor = "(Lclient!ald;)V")
	public abstract void method23091(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!aas", name = "s", descriptor = "()Z")
	public abstract boolean method23092();

	@OriginalMember(owner = "client!aas", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	public abstract void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aas", name = "g", descriptor = "(Lclient!ald;I)V")
	public abstract void method23094(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aas", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	public abstract void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);
}
