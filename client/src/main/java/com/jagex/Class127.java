package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class127 {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_17;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "I")
	public int anInt1166;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Lclient!pm;")
	public final Class487 aClass487_46 = new Class487();

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Lclient!ob;")
	public final Class456 aClass456_9 = new Class456();

	@OriginalMember(owner = "client!js", name = "g", descriptor = "Lclient!on;")
	public final Class463 aClass463_44 = new Class463();

	@OriginalMember(owner = "client!js", name = "i", descriptor = "F")
	public float aFloat120 = 0.0F;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "Lclient!afa;")
	protected Class102_Sub1 aClass102_Sub1_15;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class127(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "(Lclient!pm;)V")
	public abstract void method10143(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!js", name = "t", descriptor = "(Lclient!pm;)V")
	public abstract void method10144(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(IZ)V")
	public abstract void method10145(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(Lclient!pm;)V")
	public abstract void method10146(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!js", name = "l", descriptor = "(IZ)V")
	public abstract void method10147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(IZ)V")
	public abstract void method10148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(Z)V")
	public abstract void method10149(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(Z)V")
	public abstract void method10150(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!pm;)V")
	public abstract void method10151(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(Z)V")
	public abstract void method10152(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!js", name = "u", descriptor = "(IZ)V")
	public abstract void method10153(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);
}
