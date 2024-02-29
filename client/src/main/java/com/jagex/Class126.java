package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class126 {

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_13;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Lclient!pq;")
	public final Class489 aClass489_37 = new Class489();

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!og;")
	public final Class460 aClass460_7 = new Class460();

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "Lclient!ox;")
	public final Class472 aClass472_37 = new Class472();

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "F")
	public float aFloat121 = 0.0F;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!afc;")
	protected Class104_Sub2 aClass104_Sub2_15;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!afc;)V", line = 18)
	Class126(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_15 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "(Z)V")
	public abstract void method10031(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(Lclient!pq;)V")
	public abstract void method10032(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "(IZ)V")
	public abstract void method10033(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "(Z)V")
	public abstract void method10034(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(Lclient!pq;)V")
	public abstract void method10035(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "(Lclient!pq;)V")
	public abstract void method10036(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "(IZ)V")
	public abstract void method10037(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "(Z)V")
	public abstract void method10038(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "(Lclient!pq;)V")
	public abstract void method10039(@OriginalArg(0) Class489 arg0);
}
