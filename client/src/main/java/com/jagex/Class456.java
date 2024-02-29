package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class Class456 implements Interface49, Interface52 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "J")
	long aLong277;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	final int anInt5064;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!aio;")
	final Class135_Sub3_Sub1 aClass135_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!aio;I)V", line = 101)
	Class456(@OriginalArg(0) Class135_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt5064 = arg1;
		this.aClass135_Sub3_Sub1_1 = arg0;
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method20882(this);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "()I", line = 108)
	@Override
	public int method30890() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "()I", line = 108)
	@Override
	public int method30889() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "()I", line = 108)
	@Override
	public int method30886() {
		return this.aClass135_Sub3_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "()I", line = 112)
	@Override
	public int method30888() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "()I", line = 112)
	@Override
	public int method30891() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "()I", line = 112)
	@Override
	public int method30887() {
		return this.aClass135_Sub3_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "()J", line = 116)
	@Override
	public long method29648() {
		if (this.aLong277 == 0L) {
			this.aLong277 = IDirect3DTexture.GetSurfaceLevel(this.aClass135_Sub3_Sub1_1.aLong47, this.anInt5064);
		}
		return this.aLong277;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()J", line = 116)
	@Override
	public long method29649() {
		if (this.aLong277 == 0L) {
			this.aLong277 = IDirect3DTexture.GetSurfaceLevel(this.aClass135_Sub3_Sub1_1.aLong47, this.anInt5064);
		}
		return this.aLong277;
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "()V", line = 121)
	@Override
	public void method30884() {
		if (this.aLong277 != 0L) {
			IUnknown.Release(this.aLong277);
			this.aLong277 = 0L;
		}
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method20886(this);
	}

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "()V", line = 121)
	@Override
	public void method30885() {
		if (this.aLong277 != 0L) {
			IUnknown.Release(this.aLong277);
			this.aLong277 = 0L;
		}
		this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method20886(this);
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "()V", line = 129)
	@Override
	public void method29647() {
		if (this.aLong277 != 0L) {
			this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method19587(this.aLong277);
			this.aLong277 = 0L;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V", line = 129)
	@Override
	public void method29646() {
		if (this.aLong277 != 0L) {
			this.aClass135_Sub3_Sub1_1.aClass104_Sub2_Sub1_8.method19587(this.aLong277);
			this.aLong277 = 0L;
		}
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V", line = 136)
	@Override
	protected void finalize() {
		this.method29647();
	}

	@OriginalMember(owner = "client!ob", name = "hl", descriptor = "()V", line = 136)
	void method29153() {
		this.method29647();
	}
}
