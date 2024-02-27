package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class456 implements Interface49, Interface52 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "J")
	long aLong280;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	final int anInt5225;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!aio;")
	final Class135_Sub3_Sub1 aClass135_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!aio;I)V")
	Class456(@OriginalArg(0) Class135_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt5225 = arg1;
		this.aClass135_Sub3_Sub1_1 = arg0;
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method20925(this);
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
			this.aLong280 = 0L;
		}
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method21139(this);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "()V")
	@Override
	public void method29828() {
		if (this.aLong280 != 0L) {
			this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method19558(this.aLong280);
			this.aLong280 = 0L;
		}
	}

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong280 != 0L) {
			IUnknown.Release(this.aLong280);
			this.aLong280 = 0L;
		}
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method21139(this);
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	void finalize() {
		this.method29828();
	}

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "()J")
	@Override
	public long method29829() {
		if (this.aLong280 == 0L) {
			this.aLong280 = IDirect3DTexture.GetSurfaceLevel(this.aClass135_Sub3_Sub1_1.aLong47, this.anInt5225);
		}
		return this.aLong280;
	}

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "hl", descriptor = "()V")
	void method29334() {
		this.method29828();
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()J")
	@Override
	public long method29830() {
		if (this.aLong280 == 0L) {
			this.aLong280 = IDirect3DTexture.GetSurfaceLevel(this.aClass135_Sub3_Sub1_1.aLong47, this.anInt5225);
		}
		return this.aLong280;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	@Override
	public void method29827() {
		if (this.aLong280 != 0L) {
			this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method19558(this.aLong280);
			this.aLong280 = 0L;
		}
	}
}
