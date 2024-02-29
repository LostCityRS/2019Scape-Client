package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class Class459 implements Interface49 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_11;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	final int anInt5073;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	final int anInt5074;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!ck;")
	final Class206 aClass206_27;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!dg;")
	final Class226 aClass226_30;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "J")
	long aLong278;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;III)V", line = 17)
	Class459(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub2_Sub1_11 = arg0;
		this.anInt5073 = arg3;
		this.anInt5074 = arg4;
		this.aClass206_27 = arg1;
		this.aClass226_30 = arg2;
		this.aLong278 = IDirect3DDevice.CreateRenderTarget(this.aClass104_Sub2_Sub1_11.aLong121, arg3, arg4, Class104_Sub2_Sub1.method19574(this.aClass206_27, this.aClass226_30), arg5, 0, false);
		this.aClass104_Sub2_Sub1_11.method20882(this);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()I", line = 28)
	@Override
	public int method30890() {
		return this.anInt5073;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()I", line = 28)
	@Override
	public int method30886() {
		return this.anInt5073;
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "()I", line = 28)
	@Override
	public int method30889() {
		return this.anInt5073;
	}

	@OriginalMember(owner = "client!of", name = "w", descriptor = "()I", line = 32)
	@Override
	public int method30887() {
		return this.anInt5074;
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "()I", line = 32)
	@Override
	public int method30891() {
		return this.anInt5074;
	}

	@OriginalMember(owner = "client!of", name = "n", descriptor = "()I", line = 32)
	@Override
	public int method30888() {
		return this.anInt5074;
	}

	@OriginalMember(owner = "client!of", name = "z", descriptor = "()J", line = 36)
	@Override
	public long method29648() {
		return this.aLong278;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()J", line = 36)
	@Override
	public long method29649() {
		return this.aLong278;
	}

	@OriginalMember(owner = "client!of", name = "m", descriptor = "()V", line = 40)
	@Override
	public void method30884() {
		if (this.aLong278 != 0L) {
			IUnknown.Release(this.aLong278);
			this.aLong278 = 0L;
		}
		this.aClass104_Sub2_Sub1_11.method20886(this);
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "()V", line = 40)
	@Override
	public void method30885() {
		if (this.aLong278 != 0L) {
			IUnknown.Release(this.aLong278);
			this.aLong278 = 0L;
		}
		this.aClass104_Sub2_Sub1_11.method20886(this);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()V", line = 48)
	@Override
	public void method29646() {
		if (this.aLong278 != 0L) {
			this.aClass104_Sub2_Sub1_11.method19587(this.aLong278);
			this.aLong278 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "p", descriptor = "()V", line = 48)
	@Override
	public void method29647() {
		if (this.aLong278 != 0L) {
			this.aClass104_Sub2_Sub1_11.method19587(this.aLong278);
			this.aLong278 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V", line = 55)
	@Override
	void finalize() {
		this.method29647();
	}

	@OriginalMember(owner = "client!of", name = "hl", descriptor = "()V", line = 55)
	void method29192() {
		this.method29647();
	}
}
