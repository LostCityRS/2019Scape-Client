package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.e;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class469 implements Interface40 {

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	int anInt5280;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	int anInt5281;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "J")
	long aLong283 = 0L;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_13;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!dg;")
	final Class226 aClass226_31;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Z")
	final boolean aBoolean786;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!aqd;Lclient!dg;Z)V")
	Class469(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass104_Sub2_Sub1_13 = arg0;
		this.aClass226_31 = arg1;
		this.aBoolean786 = arg2;
		this.aClass104_Sub2_Sub1_13.method20925(this);
	}

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "()V")
	void method29537() {
		if (this.aLong283 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19558(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "()I")
	@Override
	public int method29519() {
		return this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "()V")
	@Override
	public void method29526() {
		IDirect3DIndexBuffer.Unlock(this.aLong283);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	@Override
	public void method29532(@OriginalArg(0) int arg0) {
		this.anInt5280 = this.aClass226_31.anInt3687 * -1066472467 * arg0;
		if (this.anInt5280 <= this.anInt5281) {
			return;
		}
		if (this.aLong283 != 0L) {
			IUnknown.Release(this.aLong283);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean786) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong283 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5280, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5281 = this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "(II)J")
	@Override
	public long method29513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29538();
	}

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "()V")
	@Override
	public void method29527() {
		IDirect3DIndexBuffer.Unlock(this.aLong283);
	}

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong283 != 0L) {
			IUnknown.Release(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
		this.aClass104_Sub2_Sub1_13.method21139(this);
	}

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "()V")
	void method29538() {
		if (this.aLong283 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19558(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "hl", descriptor = "()V")
	void method29539() {
		this.method29538();
	}

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "()Lclient!dg;")
	@Override
	public Class226 method29534() {
		return this.aClass226_31;
	}

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong283 != 0L) {
			IUnknown.Release(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
		this.aClass104_Sub2_Sub1_13.method21139(this);
	}

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "()I")
	@Override
	public int method29518() {
		return this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "()I")
	@Override
	public int method29520() {
		return this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(IIJ)Z")
	@Override
	public boolean method29523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DIndexBuffer.Upload(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DIndexBuffer.Upload(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "(II)J")
	@Override
	public long method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "(II)J")
	@Override
	public long method29516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "(II)J")
	@Override
	public long method29524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "(II)J")
	@Override
	public long method29515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(IIJ)Z")
	@Override
	public boolean method29514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27888(IDirect3DIndexBuffer.Upload(this.aLong283, arg0, arg1, this.aBoolean786 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "()V")
	@Override
	public void method29525() {
		IDirect3DIndexBuffer.Unlock(this.aLong283);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()V")
	@Override
	public void method29528() {
		IDirect3DIndexBuffer.Unlock(this.aLong283);
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "()V")
	@Override
	public void method29529() {
		IDirect3DIndexBuffer.Unlock(this.aLong283);
	}

	@OriginalMember(owner = "client!ot", name = "ah", descriptor = "()V")
	void method29540() {
		if (this.aLong283 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19558(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)V")
	@Override
	public void method29535(@OriginalArg(0) int arg0) {
		this.anInt5280 = this.aClass226_31.anInt3687 * -1066472467 * arg0;
		if (this.anInt5280 <= this.anInt5281) {
			return;
		}
		if (this.aLong283 != 0L) {
			IUnknown.Release(this.aLong283);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean786) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong283 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5280, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5281 = this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "(I)V")
	@Override
	public void method29536(@OriginalArg(0) int arg0) {
		this.anInt5280 = this.aClass226_31.anInt3687 * -1066472467 * arg0;
		if (this.anInt5280 <= this.anInt5281) {
			return;
		}
		if (this.aLong283 != 0L) {
			IUnknown.Release(this.aLong283);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean786) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong283 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5280, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5281 = this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "()I")
	@Override
	public int method29517() {
		return this.anInt5280;
	}

	@OriginalMember(owner = "client!ot", name = "ae", descriptor = "()V")
	void method29541() {
		if (this.aLong283 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19558(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "ag", descriptor = "()V")
	void method29542() {
		if (this.aLong283 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19558(this.aLong283);
			this.aLong283 = 0L;
		}
		this.anInt5281 = 0;
		this.anInt5280 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "()Lclient!dg;")
	@Override
	public Class226 method29533() {
		return this.aClass226_31;
	}
}
