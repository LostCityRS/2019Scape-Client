package com.jagex;

import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class128 implements Interface35 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "J")
	long aLong51 = 0L;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_9;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!co;")
	final Class210 aClass210_15;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!dy;")
	final Class236 aClass236_16;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
	boolean aBoolean248;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;Lclient!dy;ZI)V")
	Class128(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub1_Sub2_9 = arg0;
		this.aClass210_15 = arg1;
		this.aClass236_16 = arg2;
		this.aBoolean248 = arg3;
		this.aClass102_Sub1_Sub2_9.method21137(this);
	}

	@OriginalMember(owner = "client!oj", name = "hj", descriptor = "()V")
	final void method11805() {
		this.method11808();
	}

	@OriginalMember(owner = "client!oj", name = "bk", descriptor = "()J")
	long method11806() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!oj", name = "bg", descriptor = "(Lclient!le;)V")
	public void method11807(@OriginalArg(0) Class396 arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		this.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!oj", name = "bz", descriptor = "()V")
	final void method11808() {
		if (this.aLong51 != 0L) {
			this.aClass102_Sub1_Sub2_9.method21556(this.aLong51);
			this.aLong51 = 0L;
		}
	}

	@OriginalMember(owner = "client!oj", name = "ht", descriptor = "()V")
	final void method11809() {
		this.method11808();
	}

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		this.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!oj", name = "bv", descriptor = "()V")
	final void method11810() {
		if (this.aLong51 != 0L) {
			this.aClass102_Sub1_Sub2_9.method21556(this.aLong51);
			this.aLong51 = 0L;
		}
	}

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		this.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!oj", name = "hy", descriptor = "()V")
	final void method11811() {
		this.method11808();
	}

	@OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method11808();
	}

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		this.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!oj", name = "ba", descriptor = "(Lclient!le;)V")
	public void method11812(@OriginalArg(0) Class396 arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "bh", descriptor = "()J")
	long method11813() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!oj", name = "be", descriptor = "()J")
	long method11814() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!oj", name = "bp", descriptor = "()V")
	final void method11815() {
		if (this.aLong51 != 0L) {
			this.aClass102_Sub1_Sub2_9.method21556(this.aLong51);
			this.aLong51 = 0L;
		}
	}
}
