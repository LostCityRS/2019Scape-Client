package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.class0;

@ObfuscatedName("om")
public class class409 implements class330 {

	@ObfuscatedName("om.e")
	public final class1126 field4225;

	@ObfuscatedName("om.n")
	public int field4223;

	@ObfuscatedName("om.m")
	public int field4224;

	@ObfuscatedName("om.k")
	public byte field4222;

	@ObfuscatedName("om.f")
	public final boolean field4226;

	@ObfuscatedName("om.w")
	public long field4227 = 0L;

	public class409(class1126 arg0, boolean arg1) {
		this.field4225 = arg0;
		this.field4226 = arg1;
		this.field4225.method15985(this);
	}

	@ObfuscatedName("om.k()I")
	public int method5743() {
		return this.field4224;
	}

	@ObfuscatedName("om.a()I")
	public int method6229() {
		return this.field4222;
	}

	@ObfuscatedName("om.e(II)Z")
	public boolean method5553(int arg0, int arg1) {
		this.field4224 = arg0;
		this.field4222 = (byte) arg1;
		if (this.field4224 > this.field4223) {
			int var3 = 8;
			byte var4;
			if (this.field4226) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.field4227 != 0L) {
				IUnknown.Release(this.field4227);
			}
			this.field4227 = IDirect3DDevice.CreateVertexBuffer(this.field4225.field11978, this.field4224, var3, 0, var4);
			this.field4223 = this.field4224;
		}
		return this.field4227 != 0L;
	}

	@ObfuscatedName("om.w(II)J")
	public long method5737(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.field4227, arg0, arg1, this.field4226 ? 8192 : 0);
	}

	@ObfuscatedName("om.l()V")
	public void method5749() {
		IDirect3DVertexBuffer.Unlock(this.field4227);
	}

	@ObfuscatedName("om.f(IIJ)Z")
	public boolean method5738(int arg0, int arg1, long arg2) {
		return class0.method35(IDirect3DVertexBuffer.Upload(this.field4227, arg0, arg1, this.field4226 ? 8192 : 0, arg2));
	}

	@ObfuscatedName("om.m()V")
	public void method1010() {
		if (this.field4227 != 0L) {
			IUnknown.Release(this.field4227);
			this.field4227 = 0L;
		}
		this.field4223 = 0;
		this.field4224 = 0;
		this.field4225.method16198(this);
	}

	@ObfuscatedName("om.g()V")
	public void method6230() {
		if (this.field4227 != 0L) {
			this.field4225.method19023(this.field4227);
			this.field4227 = 0L;
			this.field4223 = 0;
			this.field4224 = 0;
		}
	}

	public void finalize() {
		this.method6230();
	}
}
