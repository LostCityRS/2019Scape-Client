package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("oy")
public class class411 implements class404 {

	@ObfuscatedName("oy.e")
	public final class1126 field4238;

	@ObfuscatedName("oy.n")
	public final class135 field4234;

	@ObfuscatedName("oy.m")
	public final int field4236;

	@ObfuscatedName("oy.k")
	public final int field4235;

	@ObfuscatedName("oy.f")
	public long field4237;

	public class411(class1126 arg0, class135 arg1, int arg2, int arg3, int arg4) {
		this.field4238 = arg0;
		this.field4236 = arg2;
		this.field4235 = arg3;
		this.field4234 = arg1;
		this.field4237 = IDirect3DDevice.CreateDepthStencilSurface(this.field4238.field11978, arg2, arg3, class1126.method19035(this.field4234), arg4, 0, false);
		this.field4238.method15985(this);
	}

	@ObfuscatedName("oy.e()I")
	public int method1015() {
		return this.field4236;
	}

	@ObfuscatedName("oy.n()I")
	public int method1009() {
		return this.field4235;
	}

	@ObfuscatedName("oy.z()J")
	public long method6216() {
		return this.field4237;
	}

	@ObfuscatedName("oy.m()V")
	public void method1010() {
		if (this.field4237 != 0L) {
			IUnknown.Release(this.field4237);
			this.field4237 = 0L;
		}
		this.field4238.method16198(this);
	}

	@ObfuscatedName("oy.p()V")
	public void method6215() {
		if (this.field4237 != 0L) {
			this.field4238.method19023(this.field4237);
			this.field4237 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
