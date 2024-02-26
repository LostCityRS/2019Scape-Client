package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.t;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class455 implements Interface38 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	int anInt4895;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "B")
	byte aByte147;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	int anInt4896;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "J")
	long aLong382 = 0L;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_11;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Z")
	final boolean aBoolean876;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!aqw;Z)V")
	Class455(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass102_Sub1_Sub2_11 = arg0;
		this.aBoolean876 = arg1;
		this.aClass102_Sub1_Sub2_11.method21137(this);
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
	void method29328() {
		if (this.aLong382 != 0L) {
			this.aClass102_Sub1_Sub2_11.method21556(this.aLong382);
			this.aLong382 = 0L;
			this.anInt4896 = 0;
			this.anInt4895 = 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()I")
	@Override
	public int method29391() {
		return this.anInt4895;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DVertexBuffer.Upload(this.aLong382, arg0, arg1, this.aBoolean876 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(II)Z")
	@Override
	public boolean method29327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4895 = arg0;
		this.aByte147 = (byte) arg1;
		if (this.anInt4895 > this.anInt4896) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean876) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong382 != 0L) {
				IUnknown.Release(this.aLong382);
			}
			this.aLong382 = IDirect3DDevice.CreateVertexBuffer(this.aClass102_Sub1_Sub2_11.aLong173, this.anInt4895, local13, 0, local18);
			this.anInt4896 = this.anInt4895;
		}
		return this.aLong382 != 0L;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)J")
	@Override
	public long method29384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong382, arg0, arg1, this.aBoolean876 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method29326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4895 = arg0;
		this.aByte147 = (byte) arg1;
		if (this.anInt4895 > this.anInt4896) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean876) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong382 != 0L) {
				IUnknown.Release(this.aLong382);
			}
			this.aLong382 = IDirect3DDevice.CreateVertexBuffer(this.aClass102_Sub1_Sub2_11.aLong173, this.anInt4895, local13, 0, local18);
			this.anInt4896 = this.anInt4895;
		}
		return this.aLong382 != 0L;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(IIJ)Z")
	@Override
	public boolean method29383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DVertexBuffer.Upload(this.aLong382, arg0, arg1, this.aBoolean876 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "(II)J")
	@Override
	public long method29387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong382, arg0, arg1, this.aBoolean876 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong382 != 0L) {
			IUnknown.Release(this.aLong382);
			this.aLong382 = 0L;
		}
		this.anInt4896 = 0;
		this.anInt4895 = 0;
		this.aClass102_Sub1_Sub2_11.method21133(this);
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	void finalize() {
		this.method29328();
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong382 != 0L) {
			IUnknown.Release(this.aLong382);
			this.aLong382 = 0L;
		}
		this.anInt4896 = 0;
		this.anInt4895 = 0;
		this.aClass102_Sub1_Sub2_11.method21133(this);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()V")
	@Override
	public void method29385() {
		IDirect3DVertexBuffer.Unlock(this.aLong382);
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(IIJ)Z")
	@Override
	public boolean method29388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DVertexBuffer.Upload(this.aLong382, arg0, arg1, this.aBoolean876 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!oa", name = "hy", descriptor = "()V")
	void method29329() {
		this.method29328();
	}

	@OriginalMember(owner = "client!oa", name = "hj", descriptor = "()V")
	void method29330() {
		this.method29328();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong382 != 0L) {
			IUnknown.Release(this.aLong382);
			this.aLong382 = 0L;
		}
		this.anInt4896 = 0;
		this.anInt4895 = 0;
		this.aClass102_Sub1_Sub2_11.method21133(this);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()I")
	@Override
	public int method29386() {
		return this.anInt4895;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "(II)Z")
	@Override
	public boolean method29325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4895 = arg0;
		this.aByte147 = (byte) arg1;
		if (this.anInt4895 > this.anInt4896) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean876) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong382 != 0L) {
				IUnknown.Release(this.aLong382);
			}
			this.aLong382 = IDirect3DDevice.CreateVertexBuffer(this.aClass102_Sub1_Sub2_11.aLong173, this.anInt4895, local13, 0, local18);
			this.anInt4896 = this.anInt4895;
		}
		return this.aLong382 != 0L;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "(II)Z")
	@Override
	public boolean method29324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4895 = arg0;
		this.aByte147 = (byte) arg1;
		if (this.anInt4895 > this.anInt4896) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean876) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong382 != 0L) {
				IUnknown.Release(this.aLong382);
			}
			this.aLong382 = IDirect3DDevice.CreateVertexBuffer(this.aClass102_Sub1_Sub2_11.aLong173, this.anInt4895, local13, 0, local18);
			this.anInt4896 = this.anInt4895;
		}
		return this.aLong382 != 0L;
	}

	@OriginalMember(owner = "client!oa", name = "ht", descriptor = "()V")
	void method29331() {
		this.method29328();
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()I")
	@Override
	public int method29382() {
		return this.anInt4895;
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()I")
	int method29332() {
		return this.aByte147;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	@Override
	public void method29390() {
		IDirect3DVertexBuffer.Unlock(this.aLong382);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method29389() {
		IDirect3DVertexBuffer.Unlock(this.aLong382);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	@Override
	public void method29392() {
		IDirect3DVertexBuffer.Unlock(this.aLong382);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong382 != 0L) {
			IUnknown.Release(this.aLong382);
			this.aLong382 = 0L;
		}
		this.anInt4896 = 0;
		this.anInt4895 = 0;
		this.aClass102_Sub1_Sub2_11.method21133(this);
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()I")
	int method29333() {
		return this.aByte147;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	void method29334() {
		if (this.aLong382 != 0L) {
			this.aClass102_Sub1_Sub2_11.method21556(this.aLong382);
			this.aLong382 = 0L;
			this.anInt4896 = 0;
			this.anInt4895 = 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	void method29335() {
		if (this.aLong382 != 0L) {
			this.aClass102_Sub1_Sub2_11.method21556(this.aLong382);
			this.aLong382 = 0L;
			this.anInt4896 = 0;
			this.anInt4895 = 0;
		}
	}
}
