package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.e;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public class Class465 implements Interface37 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "B")
	byte aByte160;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	int anInt5090;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	int anInt5091;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "J")
	long aLong279 = 0L;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_12;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Z")
	final boolean aBoolean776;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!aqd;Z)V", line = 17)
	Class465(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass104_Sub2_Sub1_12 = arg0;
		this.aBoolean776 = arg1;
		this.aClass104_Sub2_Sub1_12.method20882(this);
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "()I", line = 24)
	@Override
	public int method29338() {
		return this.anInt5091;
	}

	@OriginalMember(owner = "client!om", name = "z", descriptor = "()I", line = 24)
	@Override
	public int method29336() {
		return this.anInt5091;
	}

	@OriginalMember(owner = "client!om", name = "p", descriptor = "()I", line = 24)
	@Override
	public int method29337() {
		return this.anInt5091;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()I", line = 24)
	@Override
	public int method29339() {
		return this.anInt5091;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()I", line = 28)
	int method29316() {
		return this.aByte160;
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "()I", line = 28)
	int method29317() {
		return this.aByte160;
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method29314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5091 = arg0;
		this.aByte160 = (byte) arg1;
		if (this.anInt5091 > this.anInt5090) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean776) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong279 != 0L) {
				IUnknown.Release(this.aLong279);
			}
			this.aLong279 = IDirect3DDevice.CreateVertexBuffer(this.aClass104_Sub2_Sub1_12.aLong121, this.anInt5091, local13, 0, local18);
			this.anInt5090 = this.anInt5091;
		}
		return this.aLong279 != 0L;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method29315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5091 = arg0;
		this.aByte160 = (byte) arg1;
		if (this.anInt5091 > this.anInt5090) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean776) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong279 != 0L) {
				IUnknown.Release(this.aLong279);
			}
			this.aLong279 = IDirect3DDevice.CreateVertexBuffer(this.aClass104_Sub2_Sub1_12.aLong121, this.anInt5091, local13, 0, local18);
			this.anInt5090 = this.anInt5091;
		}
		return this.aLong279 != 0L;
	}

	@OriginalMember(owner = "client!om", name = "s", descriptor = "(II)J", line = 50)
	@Override
	public long method29343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "y", descriptor = "(II)J", line = 50)
	@Override
	public long method29334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "v", descriptor = "(II)J", line = 50)
	@Override
	public long method29341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "o", descriptor = "(II)J", line = 50)
	@Override
	public long method29335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "w", descriptor = "(II)J", line = 50)
	@Override
	public long method29332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "()V", line = 54)
	@Override
	public void method29344() {
		IDirect3DVertexBuffer.Unlock(this.aLong279);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V", line = 54)
	@Override
	public void method29347() {
		IDirect3DVertexBuffer.Unlock(this.aLong279);
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "()V", line = 54)
	@Override
	public void method29348() {
		IDirect3DVertexBuffer.Unlock(this.aLong279);
	}

	@OriginalMember(owner = "client!om", name = "q", descriptor = "()V", line = 54)
	@Override
	public void method29345() {
		IDirect3DVertexBuffer.Unlock(this.aLong279);
	}

	@OriginalMember(owner = "client!om", name = "x", descriptor = "()V", line = 54)
	@Override
	public void method29346() {
		IDirect3DVertexBuffer.Unlock(this.aLong279);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method29342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DVertexBuffer.Upload(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "r", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method29340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DVertexBuffer.Upload(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method29333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DVertexBuffer.Upload(this.aLong279, arg0, arg1, this.aBoolean776 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "u", descriptor = "()V", line = 62)
	@Override
	public void method30885() {
		if (this.aLong279 != 0L) {
			IUnknown.Release(this.aLong279);
			this.aLong279 = 0L;
		}
		this.anInt5090 = 0;
		this.anInt5091 = 0;
		this.aClass104_Sub2_Sub1_12.method20886(this);
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "()V", line = 62)
	@Override
	public void method30884() {
		if (this.aLong279 != 0L) {
			IUnknown.Release(this.aLong279);
			this.aLong279 = 0L;
		}
		this.anInt5090 = 0;
		this.anInt5091 = 0;
		this.aClass104_Sub2_Sub1_12.method20886(this);
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "()V", line = 72)
	void method29318() {
		if (this.aLong279 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19587(this.aLong279);
			this.aLong279 = 0L;
			this.anInt5090 = 0;
			this.anInt5091 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "()V", line = 72)
	void method29319() {
		if (this.aLong279 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19587(this.aLong279);
			this.aLong279 = 0L;
			this.anInt5090 = 0;
			this.anInt5091 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "t", descriptor = "()V", line = 72)
	void method29320() {
		if (this.aLong279 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19587(this.aLong279);
			this.aLong279 = 0L;
			this.anInt5090 = 0;
			this.anInt5091 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V", line = 81)
	@Override
	protected void finalize() {
		this.method29318();
	}

	@OriginalMember(owner = "client!om", name = "hl", descriptor = "()V", line = 81)
	void method29321() {
		this.method29318();
	}
}
