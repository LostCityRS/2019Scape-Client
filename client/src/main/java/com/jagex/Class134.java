package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class134 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!lo;")
	public Class145 aClass145_10;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_19;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_20;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!lr;")
	public Interface37 anInterface37_9;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public int anInt1174;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!pq;")
	public final Class489 aClass489_48 = new Class489();

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!pq;")
	public final Class489 aClass489_49 = new Class489();

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!pq;")
	public final Class489 aClass489_50 = new Class489();

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!afc;")
	protected Class104_Sub2 aClass104_Sub2_19;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!afc;)V", line = 18)
	Class134(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_19 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(II)V")
	public abstract void method10197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "()V")
	public abstract void method10198();

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "()V")
	public abstract void method10199();

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(II)V")
	public abstract void method10200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "()V")
	public abstract void method10201();

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "()V")
	public abstract void method10202();

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "()V")
	public abstract void method10203();
}
