package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class470 implements Interface50 {

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_14;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
	final int anInt4957;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
	final int anInt4958;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "Lclient!co;")
	final Class210 aClass210_27;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!dy;")
	final Class236 aClass236_32;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "J")
	long aLong386;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;Lclient!dy;III)V")
	Class470(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub1_Sub2_14 = arg0;
		this.anInt4957 = arg3;
		this.anInt4958 = arg4;
		this.aClass210_27 = arg1;
		this.aClass236_32 = arg2;
		this.aLong386 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_14.aLong173, arg3, arg4, Class102_Sub1_Sub2.method21553(this.aClass210_27, this.aClass236_32), arg5, 0, false);
		this.aClass102_Sub1_Sub2_14.method21137(this);
	}

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong386 != 0L) {
			IUnknown.Release(this.aLong386);
			this.aLong386 = 0L;
		}
		this.aClass102_Sub1_Sub2_14.method21133(this);
	}

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt4957;
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong386 != 0L) {
			IUnknown.Release(this.aLong386);
			this.aLong386 = 0L;
		}
		this.aClass102_Sub1_Sub2_14.method21133(this);
	}

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "()V")
	@Override
	public void method29752() {
		if (this.aLong386 != 0L) {
			this.aClass102_Sub1_Sub2_14.method21556(this.aLong386);
			this.aLong386 = 0L;
		}
	}

	@OriginalMember(owner = "client!ou", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29752();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()J")
	@Override
	public long method29751() {
		return this.aLong386;
	}

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt4957;
	}

	@OriginalMember(owner = "client!ou", name = "hj", descriptor = "()V")
	void method29755() {
		this.method29752();
	}

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong386 != 0L) {
			IUnknown.Release(this.aLong386);
			this.aLong386 = 0L;
		}
		this.aClass102_Sub1_Sub2_14.method21133(this);
	}

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong386 != 0L) {
			IUnknown.Release(this.aLong386);
			this.aLong386 = 0L;
		}
		this.aClass102_Sub1_Sub2_14.method21133(this);
	}

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt4957;
	}

	@OriginalMember(owner = "client!ou", name = "hy", descriptor = "()V")
	void method29756() {
		this.method29752();
	}

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt4957;
	}

	@OriginalMember(owner = "client!ou", name = "ht", descriptor = "()V")
	void method29757() {
		this.method29752();
	}

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "()J")
	@Override
	public long method29754() {
		return this.aLong386;
	}

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "()V")
	@Override
	public void method29753() {
		if (this.aLong386 != 0L) {
			this.aClass102_Sub1_Sub2_14.method21556(this.aLong386);
			this.aLong386 = 0L;
		}
	}
}
