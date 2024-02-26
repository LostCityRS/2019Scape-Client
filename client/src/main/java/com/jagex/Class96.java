package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class96 {

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_24;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class96(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aClass102_Sub3_24 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "()V")
	abstract void method2885();

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "(Z)V")
	abstract void method2886(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(Z)V")
	abstract void method2887(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(Z)V")
	abstract void method2888(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "(Z)V")
	abstract void method2889(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "(II)V")
	abstract void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "(Lclient!bz;I)V")
	abstract void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "(Z)V")
	abstract void method2892(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "(Z)V")
	abstract void method2893(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "()Z")
	abstract boolean method2894();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
	abstract void method2895(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "(Z)V")
	abstract void method2896(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "()Z")
	abstract boolean method2897();

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "()V")
	abstract void method2898();

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "()V")
	abstract void method2899();

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "()V")
	abstract void method2900();

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "()V")
	abstract void method2901();

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(II)V")
	abstract void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "(II)V")
	abstract void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "(Lclient!bz;I)V")
	abstract void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "(Lclient!bz;I)V")
	abstract void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1);
}
