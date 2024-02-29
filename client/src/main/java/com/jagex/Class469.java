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
public class Class469 implements Interface40 {

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	int anInt5119;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	int anInt5120;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "J")
	long aLong280 = 0L;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_13;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!dg;")
	final Class226 aClass226_31;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Z")
	final boolean aBoolean777;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!aqd;Lclient!dg;Z)V", line = 18)
	Class469(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass104_Sub2_Sub1_13 = arg0;
		this.aClass226_31 = arg1;
		this.aBoolean777 = arg2;
		this.aClass104_Sub2_Sub1_13.method20882(this);
	}

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "()I", line = 26)
	@Override
	public int method29338() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "()I", line = 26)
	@Override
	public int method29337() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "()I", line = 26)
	@Override
	public int method29339() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "()I", line = 26)
	@Override
	public int method29336() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "()Lclient!dg;", line = 30)
	@Override
	public Class226 method29353() {
		return this.aClass226_31;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "()Lclient!dg;", line = 30)
	@Override
	public Class226 method29352() {
		return this.aClass226_31;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 34)
	@Override
	public void method29351(@OriginalArg(0) int arg0) {
		this.anInt5119 = this.aClass226_31.anInt3646 * -1066472467 * arg0;
		if (this.anInt5119 <= this.anInt5120) {
			return;
		}
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean777) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong280 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5119, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5120 = this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)V", line = 34)
	@Override
	public void method29354(@OriginalArg(0) int arg0) {
		this.anInt5119 = this.aClass226_31.anInt3646 * -1066472467 * arg0;
		if (this.anInt5119 <= this.anInt5120) {
			return;
		}
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean777) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong280 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5119, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5120 = this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "(I)V", line = 34)
	@Override
	public void method29355(@OriginalArg(0) int arg0) {
		this.anInt5119 = this.aClass226_31.anInt3646 * -1066472467 * arg0;
		if (this.anInt5119 <= this.anInt5120) {
			return;
		}
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean777) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong280 = IDirect3DDevice.CreateIndexBuffer(this.aClass104_Sub2_Sub1_13.aLong121, this.anInt5119, local24, this.aClass226_31 == Class226.aClass226_23 ? 101 : 102, local29);
		this.anInt5120 = this.anInt5119;
	}

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "(II)J", line = 52)
	@Override
	public long method29332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "(II)J", line = 52)
	@Override
	public long method29341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "(II)J", line = 52)
	@Override
	public long method29335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "(II)J", line = 52)
	@Override
	public long method29343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "(II)J", line = 52)
	@Override
	public long method29334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "()V", line = 56)
	@Override
	public void method29345() {
		IDirect3DIndexBuffer.Unlock(this.aLong280);
	}

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "()V", line = 56)
	@Override
	public void method29346() {
		IDirect3DIndexBuffer.Unlock(this.aLong280);
	}

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "()V", line = 56)
	@Override
	public void method29344() {
		IDirect3DIndexBuffer.Unlock(this.aLong280);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()V", line = 56)
	@Override
	public void method29347() {
		IDirect3DIndexBuffer.Unlock(this.aLong280);
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "()V", line = 56)
	@Override
	public void method29348() {
		IDirect3DIndexBuffer.Unlock(this.aLong280);
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method29342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DIndexBuffer.Upload(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method29340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DIndexBuffer.Upload(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method29333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return e.method27717(IDirect3DIndexBuffer.Upload(this.aLong280, arg0, arg1, this.aBoolean777 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "()V", line = 64)
	@Override
	public void method30884() {
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
		this.aClass104_Sub2_Sub1_13.method20886(this);
	}

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "()V", line = 64)
	@Override
	public void method30885() {
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
		this.aClass104_Sub2_Sub1_13.method20886(this);
	}

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "()V", line = 74)
	void method29356() {
		if (this.aLong280 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19587(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "()V", line = 74)
	void method29357() {
		if (this.aLong280 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19587(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "ah", descriptor = "()V", line = 74)
	void method29358() {
		if (this.aLong280 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19587(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "ae", descriptor = "()V", line = 74)
	void method29359() {
		if (this.aLong280 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19587(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "ag", descriptor = "()V", line = 74)
	void method29360() {
		if (this.aLong280 != 0L) {
			this.aClass104_Sub2_Sub1_13.method19587(this.aLong280);
			this.aLong280 = 0L;
		}
		this.anInt5120 = 0;
		this.anInt5119 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "finalize", descriptor = "()V", line = 83)
	@Override
	void finalize() {
		this.method29357();
	}

	@OriginalMember(owner = "client!ot", name = "hl", descriptor = "()V", line = 83)
	void method29361() {
		this.method29357();
	}
}
