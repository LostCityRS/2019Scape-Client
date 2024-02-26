package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class122 {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_18;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Lclient!lx;")
	public Interface38 anInterface38_9;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_19;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public int anInt1197;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!ld;")
	public Class135 aClass135_10;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!pm;")
	public final Class487 aClass487_50 = new Class487();

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!pm;")
	public final Class487 aClass487_48 = new Class487();

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!pm;")
	public final Class487 aClass487_49 = new Class487();

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!afa;")
	protected Class102_Sub1 aClass102_Sub1_18;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class122(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_18 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "()V")
	public abstract void method10307();

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "(II)V")
	public abstract void method10308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "()V")
	public abstract void method10309();

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "(II)V")
	public abstract void method10310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "()V")
	public abstract void method10311();

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "()V")
	public abstract void method10312();

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "()V")
	public abstract void method10313();

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "()V")
	public abstract void method10314();

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "()V")
	public abstract void method10315();
}
