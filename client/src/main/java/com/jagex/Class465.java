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
public final class Class465 implements Interface37 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "B")
	byte aByte160;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	int anInt5251;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	int anInt5252;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "J")
	long aLong282 = 0L;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_12;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Z")
	final boolean aBoolean785;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!aqd;Z)V")
	Class465(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass104_Sub2_Sub1_12 = arg0;
		this.aBoolean785 = arg1;
		this.aClass104_Sub2_Sub1_12.method20925(this);
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "(II)Z")
	@Override
	public boolean method29495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5252 = arg0;
		this.aByte160 = (byte) arg1;
		if (this.anInt5252 > this.anInt5251) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean785) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong282 != 0L) {
				IUnknown.Release(this.aLong282);
			}
			this.aLong282 = IDirect3DDevice.CreateVertexBuffer(this.aClass104_Sub2_Sub1_12.aLong121, this.anInt5252, local13, 0, local18);
			this.anInt5251 = this.anInt5252;
		}
		return this.aLong282 != 0L;
	}

	@OriginalMember(owner = "client!om", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong282 != 0L) {
			IUnknown.Release(this.aLong282);
			this.aLong282 = 0L;
		}
		this.anInt5251 = 0;
		this.anInt5252 = 0;
		this.aClass104_Sub2_Sub1_12.method21139(this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()I")
	int method29497() {
		return this.aByte160;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method29496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5252 = arg0;
		this.aByte160 = (byte) arg1;
		if (this.anInt5252 > this.anInt5251) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean785) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong282 != 0L) {
				IUnknown.Release(this.aLong282);
			}
			this.aLong282 = IDirect3DDevice.CreateVertexBuffer(this.aClass104_Sub2_Sub1_12.aLong121, this.anInt5252, local13, 0, local18);
			this.anInt5251 = this.anInt5252;
		}
		return this.aLong282 != 0L;
	}

	@OriginalMember(owner = "client!om", name = "s", descriptor = "(II)J")
	@Override
	public long method29524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "()V")
	@Override
	public void method29525() {
		IDirect3DVertexBuffer.Unlock(this.aLong282);
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "()I")
	@Override
	public int method29519() {
		return this.anInt5252;
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong282 != 0L) {
			IUnknown.Release(this.aLong282);
			this.aLong282 = 0L;
		}
		this.anInt5251 = 0;
		this.anInt5252 = 0;
		this.aClass104_Sub2_Sub1_12.method21139(this);
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "()V")
	void method29498() {
		if (this.aLong282 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19558(this.aLong282);
			this.aLong282 = 0L;
			this.anInt5251 = 0;
			this.anInt5252 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29498();
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	@Override
	public void method29528() {
		IDirect3DVertexBuffer.Unlock(this.aLong282);
	}

	@OriginalMember(owner = "client!om", name = "y", descriptor = "(II)J")
	@Override
	public long method29515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IIJ)Z")
	@Override
	public boolean method29523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DVertexBuffer.Upload(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "z", descriptor = "()I")
	@Override
	public int method29517() {
		return this.anInt5252;
	}

	@OriginalMember(owner = "client!om", name = "p", descriptor = "()I")
	@Override
	public int method29518() {
		return this.anInt5252;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()I")
	@Override
	public int method29520() {
		return this.anInt5252;
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "()V")
	@Override
	public void method29529() {
		IDirect3DVertexBuffer.Unlock(this.aLong282);
	}

	@OriginalMember(owner = "client!om", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DVertexBuffer.Upload(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "v", descriptor = "(II)J")
	@Override
	public long method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "o", descriptor = "(II)J")
	@Override
	public long method29516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "hl", descriptor = "()V")
	void method29499() {
		this.method29498();
	}

	@OriginalMember(owner = "client!om", name = "q", descriptor = "()V")
	@Override
	public void method29526() {
		IDirect3DVertexBuffer.Unlock(this.aLong282);
	}

	@OriginalMember(owner = "client!om", name = "x", descriptor = "()V")
	@Override
	public void method29527() {
		IDirect3DVertexBuffer.Unlock(this.aLong282);
	}

	@OriginalMember(owner = "client!om", name = "w", descriptor = "(II)J")
	@Override
	public long method29513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "()I")
	int method29500() {
		return this.aByte160;
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(IIJ)Z")
	@Override
	public boolean method29514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DVertexBuffer.Upload(this.aLong282, arg0, arg1, this.aBoolean785 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "()V")
	void method29501() {
		if (this.aLong282 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19558(this.aLong282);
			this.aLong282 = 0L;
			this.anInt5251 = 0;
			this.anInt5252 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "t", descriptor = "()V")
	void method29502() {
		if (this.aLong282 != 0L) {
			this.aClass104_Sub2_Sub1_12.method19558(this.aLong282);
			this.aLong282 = 0L;
			this.anInt5251 = 0;
			this.anInt5252 = 0;
		}
	}
}
