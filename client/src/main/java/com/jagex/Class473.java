package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oy")
public class Class473 implements Interface52 {

	@OriginalMember(owner = "client!oy", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_14;

	@OriginalMember(owner = "client!oy", name = "m", descriptor = "I")
	final int anInt5126;

	@OriginalMember(owner = "client!oy", name = "k", descriptor = "I")
	final int anInt5125;

	@OriginalMember(owner = "client!oy", name = "n", descriptor = "Lclient!dg;")
	final Class226 aClass226_32;

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "J")
	long aLong281;

	@OriginalMember(owner = "client!oy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!dg;III)V", line = 16)
	Class473(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_Sub1_14 = arg0;
		this.anInt5126 = arg2;
		this.anInt5125 = arg3;
		this.aClass226_32 = arg1;
		this.aLong281 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_14.aLong121, arg2, arg3, Class104_Sub2_Sub1.method19578(this.aClass226_32), arg4, 0, false);
		this.aClass104_Sub2_Sub1_14.method20882(this);
	}

	@OriginalMember(owner = "client!oy", name = "k", descriptor = "()I", line = 26)
	@Override
	public int method30889() {
		return this.anInt5126;
	}

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "()I", line = 26)
	@Override
	public int method30886() {
		return this.anInt5126;
	}

	@OriginalMember(owner = "client!oy", name = "e", descriptor = "()I", line = 26)
	@Override
	public int method30890() {
		return this.anInt5126;
	}

	@OriginalMember(owner = "client!oy", name = "n", descriptor = "()I", line = 30)
	@Override
	public int method30888() {
		return this.anInt5125;
	}

	@OriginalMember(owner = "client!oy", name = "l", descriptor = "()I", line = 30)
	@Override
	public int method30891() {
		return this.anInt5125;
	}

	@OriginalMember(owner = "client!oy", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method30887() {
		return this.anInt5125;
	}

	@OriginalMember(owner = "client!oy", name = "d", descriptor = "()J", line = 34)
	@Override
	public long method29649() {
		return this.aLong281;
	}

	@OriginalMember(owner = "client!oy", name = "z", descriptor = "()J", line = 34)
	@Override
	public long method29648() {
		return this.aLong281;
	}

	@OriginalMember(owner = "client!oy", name = "m", descriptor = "()V", line = 38)
	@Override
	public void method30884() {
		if (this.aLong281 != 0L) {
			IUnknown.Release(this.aLong281);
			this.aLong281 = 0L;
		}
		this.aClass104_Sub2_Sub1_14.method20886(this);
	}

	@OriginalMember(owner = "client!oy", name = "u", descriptor = "()V", line = 38)
	@Override
	public void method30885() {
		if (this.aLong281 != 0L) {
			IUnknown.Release(this.aLong281);
			this.aLong281 = 0L;
		}
		this.aClass104_Sub2_Sub1_14.method20886(this);
	}

	@OriginalMember(owner = "client!oy", name = "p", descriptor = "()V", line = 46)
	@Override
	public void method29647() {
		if (this.aLong281 != 0L) {
			this.aClass104_Sub2_Sub1_14.method19587(this.aLong281);
			this.aLong281 = 0L;
		}
	}

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "()V", line = 46)
	@Override
	public void method29646() {
		if (this.aLong281 != 0L) {
			this.aClass104_Sub2_Sub1_14.method19587(this.aLong281);
			this.aLong281 = 0L;
		}
	}

	@OriginalMember(owner = "client!oy", name = "finalize", descriptor = "()V", line = 53)
	@Override
	protected void finalize() {
		this.method29647();
	}

	@OriginalMember(owner = "client!oy", name = "hl", descriptor = "()V", line = 53)
	void method29650() {
		this.method29647();
	}
}
