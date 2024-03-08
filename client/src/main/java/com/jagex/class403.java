package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.class0;

@ObfuscatedName("ot")
public class class403 implements class360 {

	@ObfuscatedName("ot.e")
	public final class1126 field4211;

	@ObfuscatedName("ot.n")
	public int field4208;

	@ObfuscatedName("ot.m")
	public int field4210;

	@ObfuscatedName("ot.k")
	public final boolean field4209;

	@ObfuscatedName("ot.f")
	public final class135 field4212;

	@ObfuscatedName("ot.w")
	public long field4213 = 0L;

	public class403(class1126 arg0, class135 arg1, boolean arg2) {
		this.field4211 = arg0;
		this.field4212 = arg1;
		this.field4209 = arg2;
		this.field4211.method15985(this);
	}

	@ObfuscatedName("ot.k()I")
	public int method5743() {
		return this.field4208;
	}

	@ObfuscatedName("ot.e()Ldg;")
	public class135 method5832() {
		return this.field4212;
	}

	@ObfuscatedName("ot.a(I)V")
	public void method5831(int arg0) {
		this.field4208 = this.field4212.field1652 * arg0;
		if (this.field4208 <= this.field4210) {
			return;
		}
		if (this.field4213 != 0L) {
			IUnknown.Release(this.field4213);
		}
		int var2 = 8;
		byte var3;
		if (this.field4209) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.field4213 = IDirect3DDevice.CreateIndexBuffer(this.field4211.field11978, this.field4208, var2, class135.field1646 == this.field4212 ? 101 : 102, var3);
		this.field4210 = this.field4208;
	}

	@ObfuscatedName("ot.w(II)J")
	public long method5737(int arg0, int arg1) {
		return IDirect3DIndexBuffer.Lock(this.field4213, arg0, arg1, this.field4209 ? 8192 : 0);
	}

	@ObfuscatedName("ot.l()V")
	public void method5749() {
		IDirect3DIndexBuffer.Unlock(this.field4213);
	}

	@ObfuscatedName("ot.f(IIJ)Z")
	public boolean method5738(int arg0, int arg1, long arg2) {
		return class0.method35(IDirect3DIndexBuffer.Upload(this.field4213, arg0, arg1, this.field4209 ? 8192 : 0, arg2));
	}

	@ObfuscatedName("ot.m()V")
	public void method1010() {
		if (this.field4213 != 0L) {
			IUnknown.Release(this.field4213);
			this.field4213 = 0L;
		}
		this.field4210 = 0;
		this.field4208 = 0;
		this.field4211.method16198(this);
	}

	@ObfuscatedName("ot.j()V")
	public void method6209() {
		if (this.field4213 != 0L) {
			this.field4211.method19023(this.field4213);
			this.field4213 = 0L;
		}
		this.field4210 = 0;
		this.field4208 = 0;
	}

	public void finalize() {
		this.method6209();
	}
}
