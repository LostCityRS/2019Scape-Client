package com.jagex.graphics.dx;

import com.jagex.graphics.FrameBufferInterface;
import deob.ObfuscatedName;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

@ObfuscatedName("ob")
public class DxRelated1 implements DxGraphicsDeletable, FrameBufferInterface {

	@ObfuscatedName("ob.e")
	public final int field4216;

	@ObfuscatedName("ob.n")
	public final DxTexture_Sub1 field4215;

	@ObfuscatedName("ob.m")
	public long field4214;

	public DxRelated1(DxTexture_Sub1 arg0, int arg1) {
		this.field4216 = arg1;
		this.field4215 = arg0;
		this.field4215.renderer.method15985(this);
	}

	@ObfuscatedName("ob.e()I")
	public int method1015() {
		return this.field4215.getWidth();
	}

	@ObfuscatedName("ob.n()I")
	public int method1009() {
		return this.field4215.getHeight();
	}

	@ObfuscatedName("ob.z()J")
	public long method6216() {
		if (this.field4214 == 0L) {
			this.field4214 = IDirect3DTexture.GetSurfaceLevel(this.field4215.field4217, this.field4216);
		}
		return this.field4214;
	}

	@ObfuscatedName("ob.m()V")
	public void delete() {
		if (this.field4214 != 0L) {
			IUnknown.Release(this.field4214);
			this.field4214 = 0L;
		}
		this.field4215.renderer.method16198(this);
	}

	@ObfuscatedName("ob.p()V")
	public void method6215() {
		if (this.field4214 != 0L) {
			this.field4215.renderer.method19023(this.field4214);
			this.field4214 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
