package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class462 implements Interface50, Interface52 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "J")
	long aLong384;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	final int anInt4934;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!ais;")
	final Class128_Sub2_Sub1 aClass128_Sub2_Sub1_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ais;I)V")
	Class462(@OriginalArg(0) Class128_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt4934 = arg1;
		this.aClass128_Sub2_Sub1_1 = arg0;
		this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21137(this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()J")
	@Override
	public long method29751() {
		if (this.aLong384 == 0L) {
			this.aLong384 = IDirect3DTexture.GetSurfaceLevel(this.aClass128_Sub2_Sub1_1.aLong51, this.anInt4934);
		}
		return this.aLong384;
	}

	@OriginalMember(owner = "client!om", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.aClass128_Sub2_Sub1_1.method11688();
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "()J")
	@Override
	public long method29754() {
		if (this.aLong384 == 0L) {
			this.aLong384 = IDirect3DTexture.GetSurfaceLevel(this.aClass128_Sub2_Sub1_1.aLong51, this.anInt4934);
		}
		return this.aLong384;
	}

	@OriginalMember(owner = "client!om", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.aClass128_Sub2_Sub1_1.method11688();
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong384 != 0L) {
			IUnknown.Release(this.aLong384);
			this.aLong384 = 0L;
		}
		this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!om", name = "s", descriptor = "()V")
	@Override
	public void method29752() {
		if (this.aLong384 != 0L) {
			this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21556(this.aLong384);
			this.aLong384 = 0L;
		}
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.aClass128_Sub2_Sub1_1.method11688();
	}

	@OriginalMember(owner = "client!om", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong384 != 0L) {
			IUnknown.Release(this.aLong384);
			this.aLong384 = 0L;
		}
		this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29752();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.aClass128_Sub2_Sub1_1.method11688();
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.aClass128_Sub2_Sub1_1.method11652();
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong384 != 0L) {
			IUnknown.Release(this.aLong384);
			this.aLong384 = 0L;
		}
		this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.aClass128_Sub2_Sub1_1.method11652();
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong384 != 0L) {
			IUnknown.Release(this.aLong384);
			this.aLong384 = 0L;
		}
		this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21133(this);
	}

	@OriginalMember(owner = "client!om", name = "hy", descriptor = "()V")
	void method29466() {
		this.method29752();
	}

	@OriginalMember(owner = "client!om", name = "hj", descriptor = "()V")
	void method29467() {
		this.method29752();
	}

	@OriginalMember(owner = "client!om", name = "ht", descriptor = "()V")
	void method29468() {
		this.method29752();
	}

	@OriginalMember(owner = "client!om", name = "x", descriptor = "()V")
	@Override
	public void method29753() {
		if (this.aLong384 != 0L) {
			this.aClass128_Sub2_Sub1_1.aClass102_Sub1_Sub2_9.method21556(this.aLong384);
			this.aLong384 = 0L;
		}
	}
}
