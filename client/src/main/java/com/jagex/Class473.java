package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oy")
public final class Class473 implements Interface52 {

	@OriginalMember(owner = "client!oy", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_14;

	@OriginalMember(owner = "client!oy", name = "m", descriptor = "I")
	final int anInt5287;

	@OriginalMember(owner = "client!oy", name = "k", descriptor = "I")
	final int anInt5286;

	@OriginalMember(owner = "client!oy", name = "n", descriptor = "Lclient!dg;")
	final Class226 aClass226_32;

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "J")
	long aLong284;

	@OriginalMember(owner = "client!oy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!dg;III)V")
	Class473(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_Sub1_14 = arg0;
		this.anInt5287 = arg2;
		this.anInt5286 = arg3;
		this.aClass226_32 = arg1;
		this.aLong284 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_14.aLong121, arg2, arg3, Class104_Sub2_Sub1.method19570(this.aClass226_32), arg4, 0, false);
		this.aClass104_Sub2_Sub1_14.method20925(this);
	}

	@OriginalMember(owner = "client!oy", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29828();
	}

	@OriginalMember(owner = "client!oy", name = "d", descriptor = "()J")
	@Override
	public long method29830() {
		return this.aLong284;
	}

	@OriginalMember(owner = "client!oy", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!oy", name = "z", descriptor = "()J")
	@Override
	public long method29829() {
		return this.aLong284;
	}

	@OriginalMember(owner = "client!oy", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!oy", name = "p", descriptor = "()V")
	@Override
	public void method29828() {
		if (this.aLong284 != 0L) {
			this.aClass104_Sub2_Sub1_14.method19558(this.aLong284);
			this.aLong284 = 0L;
		}
	}

	@OriginalMember(owner = "client!oy", name = "hl", descriptor = "()V")
	void method29831() {
		this.method29828();
	}

	@OriginalMember(owner = "client!oy", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!oy", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong284 != 0L) {
			IUnknown.Release(this.aLong284);
			this.aLong284 = 0L;
		}
		this.aClass104_Sub2_Sub1_14.method21139(this);
	}

	@OriginalMember(owner = "client!oy", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!oy", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong284 != 0L) {
			IUnknown.Release(this.aLong284);
			this.aLong284 = 0L;
		}
		this.aClass104_Sub2_Sub1_14.method21139(this);
	}

	@OriginalMember(owner = "client!oy", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "()V")
	@Override
	public void method29827() {
		if (this.aLong284 != 0L) {
			this.aClass104_Sub2_Sub1_14.method19558(this.aLong284);
			this.aLong284 = 0L;
		}
	}
}
