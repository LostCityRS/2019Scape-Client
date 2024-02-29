package com.jagex;

import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class135 implements Interface34 {

	@OriginalMember(owner = "client!op", name = "f", descriptor = "J")
	long aLong47 = 0L;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_8;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!ck;")
	final Class206 aClass206_14;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!dg;")
	final Class226 aClass226_15;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Z")
	boolean aBoolean252;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;ZI)V", line = 16)
	Class135(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_Sub1_8 = arg0;
		this.aClass206_14 = arg1;
		this.aClass226_15 = arg2;
		this.aBoolean252 = arg3;
		this.aClass104_Sub2_Sub1_8.method20882(this);
	}

	@OriginalMember(owner = "client!op", name = "bl", descriptor = "()J", line = 25)
	long method11328() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!op", name = "bh", descriptor = "()J", line = 25)
	long method11329() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!op", name = "ay", descriptor = "(Lclient!lt;)V", line = 29)
	public void method11414(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "ab", descriptor = "(Lclient!lt;)V", line = 29)
	public void method11415(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "az", descriptor = "(Lclient!lt;)V", line = 29)
	public void method11416(@OriginalArg(0) Class405 arg0) {
	}

	@OriginalMember(owner = "client!op", name = "u", descriptor = "()V", line = 32)
	@Override
	public void method30885() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		this.aClass104_Sub2_Sub1_8.method20886(this);
	}

	@OriginalMember(owner = "client!op", name = "m", descriptor = "()V", line = 32)
	@Override
	public void method30884() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		this.aClass104_Sub2_Sub1_8.method20886(this);
	}

	@OriginalMember(owner = "client!op", name = "bk", descriptor = "()V", line = 40)
	void method11333() {
		if (this.aLong47 != 0L) {
			this.aClass104_Sub2_Sub1_8.method19587(this.aLong47);
			this.aLong47 = 0L;
		}
	}

	@OriginalMember(owner = "client!op", name = "bx", descriptor = "()V", line = 40)
	void method11334() {
		if (this.aLong47 != 0L) {
			this.aClass104_Sub2_Sub1_8.method19587(this.aLong47);
			this.aLong47 = 0L;
		}
	}

	@OriginalMember(owner = "client!op", name = "hl", descriptor = "()V", line = 47)
	void method11335() {
		this.method11333();
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V", line = 47)
	@Override
	void finalize() {
		this.method11333();
	}
}
