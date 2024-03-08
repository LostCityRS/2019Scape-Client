package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

@ObfuscatedName("ob")
public class class407 implements class412, class404 {

	@ObfuscatedName("ob.e")
	public final int field4216;

	@ObfuscatedName("ob.n")
	public final class926 field4215;

	@ObfuscatedName("ob.m")
	public long field4214;

	public class407(class926 arg0, int arg1) {
		this.field4216 = arg1;
		this.field4215 = arg0;
		this.field4215.field4219.method15985(this);
	}

	@ObfuscatedName("ob.e()I")
	public int method1015() {
		return this.field4215.method5718();
	}

	@ObfuscatedName("ob.n()I")
	public int method1009() {
		return this.field4215.method5696();
	}

	@ObfuscatedName("ob.z()J")
	public long method6216() {
		if (this.field4214 == 0L) {
			this.field4214 = IDirect3DTexture.GetSurfaceLevel(this.field4215.field4217, this.field4216);
		}
		return this.field4214;
	}

	@ObfuscatedName("ob.m()V")
	public void method1010() {
		if (this.field4214 != 0L) {
			IUnknown.Release(this.field4214);
			this.field4214 = 0L;
		}
		this.field4215.field4219.method16198(this);
	}

	@ObfuscatedName("ob.p()V")
	public void method6215() {
		if (this.field4214 != 0L) {
			this.field4215.field4219.method19023(this.field4214);
			this.field4214 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
