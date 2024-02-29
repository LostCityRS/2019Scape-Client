package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aso")
public abstract class Class93_Sub1_Sub17 extends Class93_Sub1 {

	@OriginalMember(owner = "client!aso", name = "l", descriptor = "I")
	public final int anInt3208;

	@OriginalMember(owner = "client!aso", name = "c", descriptor = "(ILclient!ie;Lclient!alw;)Lclient!aso;", line = 13)
	public static Class93_Sub1_Sub17 method23492(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class93_Sub41 arg2) {
		if (Class335.aClass335_2 == arg1) {
			return new Class93_Sub1_Sub17_Sub1(arg0, arg2);
		} else if (Class335.aClass335_1 == arg1) {
			return new Class93_Sub1_Sub17_Sub2(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aso", name = "<init>", descriptor = "(I)V", line = 18)
	Class93_Sub1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt3208 = arg0 * -734960739;
	}

	@OriginalMember(owner = "client!aso", name = "n", descriptor = "(FI)V")
	public abstract void method23493(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aso", name = "u", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	public abstract void method23494(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!aso", name = "k", descriptor = "(Lclient!alw;I)V")
	public abstract void method23495(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aso", name = "f", descriptor = "(F)V")
	public abstract void method23496(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aso", name = "w", descriptor = "(F)V")
	public abstract void method23497(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aso", name = "l", descriptor = "(F)V")
	public abstract void method23498(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aso", name = "p", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	public abstract void method23499(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!aso", name = "z", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	public abstract void method23500(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!aso", name = "m", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;I)V")
	public abstract void method23501(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aso", name = "d", descriptor = "(Lclient!alw;)V")
	public abstract void method23502(@OriginalArg(0) Class93_Sub41 arg0);
}
