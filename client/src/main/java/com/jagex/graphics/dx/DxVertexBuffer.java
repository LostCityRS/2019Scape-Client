package com.jagex.graphics.dx;

import com.jagex.graphics.VertexBuffer;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.HRESULT;

@ObfuscatedName("om")
public class DxVertexBuffer implements VertexBuffer {

	@ObfuscatedName("om.e")
	public final DxToolkit renderer;

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

	public DxVertexBuffer(DxToolkit arg0, boolean arg1) {
		this.renderer = arg0;
		this.field4226 = arg1;
		this.renderer.method15985(this);
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
	public boolean allocate(int arg0, int arg1) {
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
			this.field4227 = IDirect3DDevice.CreateVertexBuffer(this.renderer.device, this.field4224, var3, 0, var4);
			this.field4223 = this.field4224;
		}
		return this.field4227 != 0L;
	}

	@ObfuscatedName("om.w(II)J")
	public long lock(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.field4227, arg0, arg1, this.field4226 ? 8192 : 0);
	}

	@ObfuscatedName("om.l()V")
	public void unlock() {
		IDirect3DVertexBuffer.Unlock(this.field4227);
	}

	@ObfuscatedName("om.f(IIJ)Z")
	public boolean upload(int arg0, int arg1, long arg2) {
		return HRESULT.SUCCEEDED(IDirect3DVertexBuffer.Upload(this.field4227, arg0, arg1, this.field4226 ? 8192 : 0, arg2));
	}

	@ObfuscatedName("om.m()V")
	public void delete() {
		if (this.field4227 != 0L) {
			IUnknown.Release(this.field4227);
			this.field4227 = 0L;
		}
		this.field4223 = 0;
		this.field4224 = 0;
		this.renderer.method16198(this);
	}

	@ObfuscatedName("om.g()V")
	public void method6230() {
		if (this.field4227 != 0L) {
			this.renderer.method19023(this.field4227);
			this.field4227 = 0L;
			this.field4223 = 0;
			this.field4224 = 0;
		}
	}

	public void finalize() {
		this.method6230();
	}
}
