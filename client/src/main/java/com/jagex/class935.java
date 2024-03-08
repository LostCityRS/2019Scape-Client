package com.jagex;

import com.jagex.deob.ObfuscatedName;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.class0;
import java.awt.Canvas;

@ObfuscatedName("aic")
public class class935 extends class1122 implements class406 {

	@ObfuscatedName("aic.e")
	public final class1126 field10716;

	@ObfuscatedName("aic.n")
	public final Canvas field10710;

	@ObfuscatedName("aic.m")
	public long field10711;

	@ObfuscatedName("aic.k")
	public long field10712;

	@ObfuscatedName("aic.f")
	public long field10713;

	@ObfuscatedName("aic.w")
	public int field10714;

	@ObfuscatedName("aic.l")
	public int field10718;

	@ObfuscatedName("aic.u")
	public boolean field10715 = false;

	@ObfuscatedName("aic.z")
	public boolean field10717 = false;

	@ObfuscatedName("aic.p")
	public D3DPRESENT_PARAMETERS field10709;

	public class935(class1126 arg0, Canvas arg1, int arg2, int arg3, boolean arg4) {
		super(arg0);
		this.field10710 = arg1;
		this.field10716 = arg0;
		this.field10714 = arg2;
		this.field10718 = arg3;
		this.field10717 = arg4;
		this.method6220();
	}

	@ObfuscatedName("aic.x()V")
	public void method6220() {
		if (this.field10711 == 0L) {
			this.field10709 = new D3DPRESENT_PARAMETERS(this.field10710);
			this.field10709.Windowed = true;
			this.field10709.BackBufferCount = 1;
			this.field10709.PresentationInterval = Integer.MIN_VALUE;
			this.field10709.BackBufferWidth = this.field10714;
			this.field10709.BackBufferHeight = this.field10718;
			if (this.field10717) {
				this.field10711 = IDirect3DDevice.GetSwapChain(this.field10716.field11978, 0);
				this.field10713 = IDirect3DSwapChain.GetBackBuffer(this.field10711, 0, 0);
				this.field10712 = IDirect3DDevice.GetDepthStencilSurface(this.field10716.field11978);
			} else if (class1126.method19016(this.field10716.field11956, this.field10716.field11954, this.field10716.field11955, this.field10716.field10180, this.field10716.field11958, this.field10709)) {
				int var1 = this.field10709.AutoDepthStencilFormat;
				this.field10711 = IDirect3DDevice.CreateAdditionalSwapChain(this.field10716.field11978, this.field10709);
				this.field10713 = IDirect3DSwapChain.GetBackBuffer(this.field10711, 0, 0);
				this.field10712 = IDirect3DDevice.CreateDepthStencilSurface(this.field10716.field11978, this.field10714, this.field10718, var1, this.field10709.MultiSampleType, this.field10709.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.field10716.method18995(this);
		}
		if (this.field10715) {
			this.method1630();
		}
	}

	@ObfuscatedName("aic.e()I")
	public int method1627() {
		return this.field10714;
	}

	@ObfuscatedName("aic.n()I")
	public int method1628() {
		return this.field10718;
	}

	@ObfuscatedName("aic.k()Z")
	public boolean method1630() {
		this.field10715 = true;
		if (this.field10711 == 0L) {
			if (this.field10716.field11960) {
				return false;
			}
			this.method6220();
		}
		if (class0.method34(IDirect3DDevice.SetRenderTarget(this.field10716.field11978, 0, this.field10713))) {
			return false;
		} else if (class0.method34(IDirect3DDevice.SetDepthStencilSurface(this.field10716.field11978, this.field10712))) {
			return false;
		} else {
			return super.method1630();
		}
	}

	@ObfuscatedName("aic.f()Z")
	public boolean method1631() {
		this.field10715 = false;
		return class0.method35(IDirect3DDevice.SetDepthStencilSurface(this.field10716.field11978, 0L));
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
	public void method15453(int arg0, int arg1) {
		this.method1629();
		this.field10714 = arg0;
		this.field10718 = arg1;
		if (this.field10717) {
			this.field10716.method19019(this.field10714, this.field10718);
		}
		this.method6220();
		super.method15453(arg0, arg1);
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
		this.field10716.method19000(this);
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
		this.field10716.method19000(this);
	}

	public void finalize() throws Throwable {
		this.method16818();
		super.finalize();
	}
}
