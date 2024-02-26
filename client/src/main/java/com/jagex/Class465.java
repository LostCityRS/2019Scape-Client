package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class465 implements Interface52 {

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_13;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "I")
	final int anInt4937;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	final int anInt4938;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!dy;")
	final Class236 aClass236_31;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "J")
	long aLong385;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!aqw;Lclient!dy;III)V")
	Class465(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub1_Sub2_13 = arg0;
		this.anInt4937 = arg2;
		this.anInt4938 = arg3;
		this.aClass236_31 = arg1;
		this.aLong385 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass102_Sub1_Sub2_13.aLong173, arg2, arg3, Class102_Sub1_Sub2.method21554(this.aClass236_31), arg4, 0, false);
		this.aClass102_Sub1_Sub2_13.method21137(this);
	}

	@OriginalMember(owner = "client!op", name = "hj", descriptor = "()V")
	void method29636() {
		this.method29752();
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29752();
	}

	@OriginalMember(owner = "client!op", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt4937;
	}

	@OriginalMember(owner = "client!op", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong385 != 0L) {
			IUnknown.Release(this.aLong385);
			this.aLong385 = 0L;
		}
		this.aClass102_Sub1_Sub2_13.method21133(this);
	}

	@OriginalMember(owner = "client!op", name = "s", descriptor = "()V")
	@Override
	public void method29752() {
		if (this.aLong385 != 0L) {
			this.aClass102_Sub1_Sub2_13.method21556(this.aLong385);
			this.aLong385 = 0L;
		}
	}

	@OriginalMember(owner = "client!op", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt4937;
	}

	@OriginalMember(owner = "client!op", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt4938;
	}

	@OriginalMember(owner = "client!op", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt4937;
	}

	@OriginalMember(owner = "client!op", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt4937;
	}

	@OriginalMember(owner = "client!op", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt4938;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "()J")
	@Override
	public long method29751() {
		return this.aLong385;
	}

	@OriginalMember(owner = "client!op", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong385 != 0L) {
			IUnknown.Release(this.aLong385);
			this.aLong385 = 0L;
		}
		this.aClass102_Sub1_Sub2_13.method21133(this);
	}

	@OriginalMember(owner = "client!op", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong385 != 0L) {
			IUnknown.Release(this.aLong385);
			this.aLong385 = 0L;
		}
		this.aClass102_Sub1_Sub2_13.method21133(this);
	}

	@OriginalMember(owner = "client!op", name = "hy", descriptor = "()V")
	void method29637() {
		this.method29752();
	}

	@OriginalMember(owner = "client!op", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong385 != 0L) {
			IUnknown.Release(this.aLong385);
			this.aLong385 = 0L;
		}
		this.aClass102_Sub1_Sub2_13.method21133(this);
	}

	@OriginalMember(owner = "client!op", name = "ht", descriptor = "()V")
	void method29638() {
		this.method29752();
	}

	@OriginalMember(owner = "client!op", name = "k", descriptor = "()J")
	@Override
	public long method29754() {
		return this.aLong385;
	}

	@OriginalMember(owner = "client!op", name = "x", descriptor = "()V")
	@Override
	public void method29753() {
		if (this.aLong385 != 0L) {
			this.aClass102_Sub1_Sub2_13.method21556(this.aLong385);
			this.aLong385 = 0L;
		}
	}
}
