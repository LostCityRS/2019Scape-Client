package com.jagex.graphics.dx;

import com.jagex.graphics.GpuSurface;
import deob.ObfuscatedName;
import jagdx.*;

import java.awt.*;

@ObfuscatedName("aic")
public class DxSurface extends GpuSurface implements DxInterface1 {

	@ObfuscatedName("aic.e")
	public final DxToolkit renderer;

	@ObfuscatedName("aic.n")
	public final Canvas canvas;

	@ObfuscatedName("aic.m")
	public long field10711;

	@ObfuscatedName("aic.k")
	public long field10712;

	@ObfuscatedName("aic.f")
	public long field10713;

	@ObfuscatedName("aic.w")
	public int width;

	@ObfuscatedName("aic.l")
	public int height;

	@ObfuscatedName("aic.u")
	public boolean field10715 = false;

	@ObfuscatedName("aic.z")
	public boolean field10717 = false;

	@ObfuscatedName("aic.p")
	public D3DPRESENT_PARAMETERS field10709;

	public DxSurface(DxToolkit arg0, Canvas arg1, int arg2, int arg3, boolean arg4) {
		super(arg0);
		this.canvas = arg1;
		this.renderer = arg0;
		this.width = arg2;
		this.height = arg3;
		this.field10717 = arg4;
		this.method6220();
	}

	@ObfuscatedName("aic.x()V")
	public void method6220() {
		if (this.field10711 == 0L) {
			this.field10709 = new D3DPRESENT_PARAMETERS(this.canvas);
			this.field10709.Windowed = true;
			this.field10709.BackBufferCount = 1;
			this.field10709.PresentationInterval = Integer.MIN_VALUE;
			this.field10709.BackBufferWidth = this.width;
			this.field10709.BackBufferHeight = this.height;
			if (this.field10717) {
				this.field10711 = IDirect3DDevice.GetSwapChain(this.renderer.device, 0);
				this.field10713 = IDirect3DSwapChain.GetBackBuffer(this.field10711, 0, 0);
				this.field10712 = IDirect3DDevice.GetDepthStencilSurface(this.renderer.device);
			} else if (DxToolkit.method19016(this.renderer.field11956, this.renderer.field11954, this.renderer.field11955, this.renderer.field10180, this.renderer.displayMode, this.field10709)) {
				int var1 = this.field10709.AutoDepthStencilFormat;
				this.field10711 = IDirect3DDevice.CreateAdditionalSwapChain(this.renderer.device, this.field10709);
				this.field10713 = IDirect3DSwapChain.GetBackBuffer(this.field10711, 0, 0);
				this.field10712 = IDirect3DDevice.CreateDepthStencilSurface(this.renderer.device, this.width, this.height, var1, this.field10709.MultiSampleType, this.field10709.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.renderer.method18995(this);
		}
		if (this.field10715) {
			this.method1630();
		}
	}

	@ObfuscatedName("aic.e()I")
	public int getWidth() {
		return this.width;
	}

	@ObfuscatedName("aic.n()I")
	public int getHeight() {
		return this.height;
	}

	@ObfuscatedName("aic.k()Z")
	public boolean method1630() {
		this.field10715 = true;
		if (this.field10711 == 0L) {
			if (this.renderer.field11960) {
				return false;
			}
			this.method6220();
		}
		if (HRESULT.FAILED(IDirect3DDevice.SetRenderTarget(this.renderer.device, 0, this.field10713))) {
			return false;
		} else if (HRESULT.FAILED(IDirect3DDevice.SetDepthStencilSurface(this.renderer.device, this.field10712))) {
			return false;
		} else {
			return super.method1630();
		}
	}

	@ObfuscatedName("aic.f()Z")
	public boolean method1631() {
		this.field10715 = false;
		return HRESULT.SUCCEEDED(IDirect3DDevice.SetDepthStencilSurface(this.renderer.device, 0L));
	}

	@ObfuscatedName("aic.a()I")
	public int method15451() {
		return IDirect3DSwapChain.Present(this.field10711, 0);
	}

	@ObfuscatedName("aic.g(II)I")
	public int method15450(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.field10711, 0);
	}

	@ObfuscatedName("aic.i(II)V")
	public void onResize(int arg0, int arg1) {
		this.method1629();
		this.width = arg0;
		this.height = arg1;
		if (this.field10717) {
			this.renderer.method19019(this.width, this.height);
		}
		this.method6220();
		super.onResize(arg0, arg1);
	}

	@ObfuscatedName("aic.m()V")
	public void method1629() {
		if (this.field10713 != 0L) {
			IUnknown.Release(this.field10713);
			this.field10713 = 0L;
		}
		if (this.field10712 != 0L) {
			IUnknown.Release(this.field10712);
			this.field10712 = 0L;
		}
		if (this.field10711 != 0L) {
			IUnknown.Release(this.field10711);
			this.field10711 = 0L;
		}
		this.renderer.method19000(this);
	}

	@ObfuscatedName("aic.ah()V")
	public void method16818() {
		if (this.field10713 != 0L) {
			IUnknown.Release(this.field10713);
			this.field10713 = 0L;
		}
		if (this.field10712 != 0L) {
			IUnknown.Release(this.field10712);
			this.field10712 = 0L;
		}
		if (this.field10711 != 0L) {
			IUnknown.Release(this.field10711);
			this.field10711 = 0L;
		}
		this.renderer.method19000(this);
	}

	public void finalize() throws Throwable {
		this.method16818();
		super.finalize();
	}
}
