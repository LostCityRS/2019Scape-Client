package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.t;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class459 implements Interface44 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	int anInt4905;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	int anInt4906;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "J")
	long aLong383 = 0L;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_12;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!dy;")
	final Class236 aClass236_30;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Z")
	final boolean aBoolean878;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!aqw;Lclient!dy;Z)V")
	Class459(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass102_Sub1_Sub2_12 = arg0;
		this.aClass236_30 = arg1;
		this.aBoolean878 = arg2;
		this.aClass102_Sub1_Sub2_12.method21137(this);
	}

	@OriginalMember(owner = "client!of", name = "ht", descriptor = "()V")
	void method29407() {
		this.method29410();
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "()I")
	@Override
	public int method29391() {
		return this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "q", descriptor = "()V")
	@Override
	public void method29390() {
		IDirect3DIndexBuffer.Unlock(this.aLong383);
	}

	@OriginalMember(owner = "client!of", name = "p", descriptor = "(I)V")
	@Override
	public void method29401(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)J")
	@Override
	public long method29384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong383, arg0, arg1, this.aBoolean878 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(IIJ)Z")
	@Override
	public boolean method29383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DIndexBuffer.Upload(this.aLong383, arg0, arg1, this.aBoolean878 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!of", name = "t", descriptor = "()Lclient!dy;")
	@Override
	public Class236 method29400() {
		return this.aClass236_30;
	}

	@OriginalMember(owner = "client!of", name = "x", descriptor = "()I")
	@Override
	public int method29382() {
		return this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "hj", descriptor = "()V")
	void method29408() {
		this.method29410();
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V")
	@Override
	void finalize() {
		this.method29410();
	}

	@OriginalMember(owner = "client!of", name = "s", descriptor = "()V")
	@Override
	public void method29385() {
		IDirect3DIndexBuffer.Unlock(this.aLong383);
	}

	@OriginalMember(owner = "client!of", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
		this.aClass102_Sub1_Sub2_12.method21133(this);
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
		this.aClass102_Sub1_Sub2_12.method21133(this);
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "()I")
	@Override
	public int method29386() {
		return this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
		this.aClass102_Sub1_Sub2_12.method21133(this);
	}

	@OriginalMember(owner = "client!of", name = "hy", descriptor = "()V")
	void method29409() {
		this.method29410();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	@Override
	public void method29406(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "w", descriptor = "(IIJ)Z")
	@Override
	public boolean method29388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DIndexBuffer.Upload(this.aLong383, arg0, arg1, this.aBoolean878 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!of", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return t.f(IDirect3DIndexBuffer.Upload(this.aLong383, arg0, arg1, this.aBoolean878 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "()Lclient!dy;")
	@Override
	public Class236 method29402() {
		return this.aClass236_30;
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "()V")
	@Override
	public void method29389() {
		IDirect3DIndexBuffer.Unlock(this.aLong383);
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "()V")
	void method29410() {
		if (this.aLong383 != 0L) {
			this.aClass102_Sub1_Sub2_12.method21556(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()Lclient!dy;")
	@Override
	public Class236 method29404() {
		return this.aClass236_30;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()V")
	@Override
	public void method29392() {
		IDirect3DIndexBuffer.Unlock(this.aLong383);
	}

	@OriginalMember(owner = "client!of", name = "v", descriptor = "(I)V")
	@Override
	public void method29403(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "y", descriptor = "(I)V")
	@Override
	public void method29399(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "n", descriptor = "(I)V")
	@Override
	public void method29398(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	@Override
	public void method29405(@OriginalArg(0) int arg0) {
		this.anInt4905 = this.aClass236_30.anInt3804 * -369125885 * arg0;
		if (this.anInt4905 <= this.anInt4906) {
			return;
		}
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean878) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong383 = IDirect3DDevice.CreateIndexBuffer(this.aClass102_Sub1_Sub2_12.aLong173, this.anInt4905, local24, this.aClass236_30 == Class236.aClass236_19 ? 101 : 102, local29);
		this.anInt4906 = this.anInt4905;
	}

	@OriginalMember(owner = "client!of", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong383 != 0L) {
			IUnknown.Release(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
		this.aClass102_Sub1_Sub2_12.method21133(this);
	}

	@OriginalMember(owner = "client!of", name = "z", descriptor = "(II)J")
	@Override
	public long method29387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong383, arg0, arg1, this.aBoolean878 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!of", name = "ax", descriptor = "()V")
	void method29411() {
		if (this.aLong383 != 0L) {
			this.aClass102_Sub1_Sub2_12.method21556(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
	}

	@OriginalMember(owner = "client!of", name = "ay", descriptor = "()V")
	void method29412() {
		if (this.aLong383 != 0L) {
			this.aClass102_Sub1_Sub2_12.method21556(this.aLong383);
			this.aLong383 = 0L;
		}
		this.anInt4906 = 0;
		this.anInt4905 = 0;
	}
}
