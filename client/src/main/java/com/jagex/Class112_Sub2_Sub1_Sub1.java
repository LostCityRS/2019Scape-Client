package com.jagex;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.e;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aic")
public class Class112_Sub2_Sub1_Sub1 extends Class112_Sub2_Sub1 implements Interface53 {

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!aic", name = "m", descriptor = "J")
	long aLong39;

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "J")
	long aLong40;

	@OriginalMember(owner = "client!aic", name = "f", descriptor = "J")
	long aLong41;

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "Z")
	boolean aBoolean213 = false;

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "Z")
	boolean aBoolean214 = false;

	@OriginalMember(owner = "client!aic", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas2;

	@OriginalMember(owner = "client!aic", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_5;

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "I")
	int anInt1192;

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "I")
	int anInt1193;

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "(Lclient!aqd;Ljava/awt/Canvas;IIZ)V", line = 22)
	Class112_Sub2_Sub1_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0);
		this.aCanvas2 = arg1;
		this.aClass104_Sub2_Sub1_5 = arg0;
		this.anInt1192 = arg2;
		this.anInt1193 = arg3;
		this.aBoolean214 = arg4;
		this.method10400();
	}

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "()V", line = 32)
	@Override
	public void method10400() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1193;
			if (this.aBoolean214) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19586(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19527(this);
		}
		if (this.aBoolean213) {
			this.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "b", descriptor = "()V", line = 32)
	@Override
	public void method10401() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1193;
			if (this.aBoolean214) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19586(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19527(this);
		}
		if (this.aBoolean213) {
			this.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "h", descriptor = "()V", line = 32)
	@Override
	public void method10402() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1193;
			if (this.aBoolean214) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19586(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19527(this);
		}
		if (this.aBoolean213) {
			this.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "()I", line = 57)
	@Override
	public int method23753() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "e", descriptor = "()I", line = 57)
	@Override
	public int method23737() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "()I", line = 57)
	@Override
	public int method23742() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "()I", line = 57)
	@Override
	public int method23745() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "()I", line = 57)
	@Override
	public int method23744() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "()I", line = 57)
	@Override
	public int method23746() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "d", descriptor = "()I", line = 57)
	@Override
	public int method23736() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "n", descriptor = "()I", line = 61)
	@Override
	public int method23738() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "c", descriptor = "()I", line = 61)
	@Override
	public int method23747() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "r", descriptor = "()I", line = 61)
	@Override
	public int method23748() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "v", descriptor = "()Z", line = 65)
	@Override
	public boolean method23749() {
		this.aBoolean213 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean431) {
				return false;
			}
			this.method10400();
		}
		if (e.method27715(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27715(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "()Z", line = 65)
	@Override
	public boolean method23740() {
		this.aBoolean213 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean431) {
				return false;
			}
			this.method10400();
		}
		if (e.method27715(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27715(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "o", descriptor = "()Z", line = 65)
	@Override
	public boolean method23743() {
		this.aBoolean213 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean431) {
				return false;
			}
			this.method10400();
		}
		if (e.method27715(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27715(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23740();
		}
	}

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "()Z", line = 76)
	@Override
	boolean method23750() {
		this.aBoolean213 = false;
		return e.method27717(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, 0L));
	}

	@OriginalMember(owner = "client!aic", name = "f", descriptor = "()Z", line = 76)
	@Override
	boolean method23741() {
		this.aBoolean213 = false;
		return e.method27717(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, 0L));
	}

	@OriginalMember(owner = "client!aic", name = "a", descriptor = "()I", line = 81)
	@Override
	public int method23756() {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "ae", descriptor = "()I", line = 81)
	@Override
	public int method23760() {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "g", descriptor = "(II)I", line = 85)
	@Override
	public int method23755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "ag", descriptor = "(II)I", line = 85)
	@Override
	public int method23761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "j", descriptor = "(II)V", line = 89)
	@Override
	void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23739();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean214) {
			this.aClass104_Sub2_Sub1_5.method19520(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "i", descriptor = "(II)V", line = 89)
	@Override
	void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23739();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean214) {
			this.aClass104_Sub2_Sub1_5.method19520(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "t", descriptor = "(II)V", line = 89)
	@Override
	void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23739();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean214) {
			this.aClass104_Sub2_Sub1_5.method19520(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23758(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "m", descriptor = "()V", line = 98)
	@Override
	public void method23739() {
		if (this.aLong41 != 0L) {
			IUnknown.Release(this.aLong41);
			this.aLong41 = 0L;
		}
		if (this.aLong40 != 0L) {
			IUnknown.Release(this.aLong40);
			this.aLong40 = 0L;
		}
		if (this.aLong39 != 0L) {
			IUnknown.Release(this.aLong39);
			this.aLong39 = 0L;
		}
		this.aClass104_Sub2_Sub1_5.method19530(this);
	}

	@OriginalMember(owner = "client!aic", name = "y", descriptor = "()V", line = 98)
	@Override
	public void method23752() {
		if (this.aLong41 != 0L) {
			IUnknown.Release(this.aLong41);
			this.aLong41 = 0L;
		}
		if (this.aLong40 != 0L) {
			IUnknown.Release(this.aLong40);
			this.aLong40 = 0L;
		}
		if (this.aLong39 != 0L) {
			IUnknown.Release(this.aLong39);
			this.aLong39 = 0L;
		}
		this.aClass104_Sub2_Sub1_5.method19530(this);
	}

	@OriginalMember(owner = "client!aic", name = "q", descriptor = "()V", line = 98)
	@Override
	public void method23751() {
		if (this.aLong41 != 0L) {
			IUnknown.Release(this.aLong41);
			this.aLong41 = 0L;
		}
		if (this.aLong40 != 0L) {
			IUnknown.Release(this.aLong40);
			this.aLong40 = 0L;
		}
		if (this.aLong39 != 0L) {
			IUnknown.Release(this.aLong39);
			this.aLong39 = 0L;
		}
		this.aClass104_Sub2_Sub1_5.method19530(this);
	}

	@OriginalMember(owner = "client!aic", name = "al", descriptor = "()V", line = 114)
	void method10403() {
		if (this.aLong41 != 0L) {
			IUnknown.Release(this.aLong41);
			this.aLong41 = 0L;
		}
		if (this.aLong40 != 0L) {
			IUnknown.Release(this.aLong40);
			this.aLong40 = 0L;
		}
		if (this.aLong39 != 0L) {
			IUnknown.Release(this.aLong39);
			this.aLong39 = 0L;
		}
		this.aClass104_Sub2_Sub1_5.method19530(this);
	}

	@OriginalMember(owner = "client!aic", name = "ah", descriptor = "()V", line = 114)
	void method10404() {
		if (this.aLong41 != 0L) {
			IUnknown.Release(this.aLong41);
			this.aLong41 = 0L;
		}
		if (this.aLong40 != 0L) {
			IUnknown.Release(this.aLong40);
			this.aLong40 = 0L;
		}
		if (this.aLong39 != 0L) {
			IUnknown.Release(this.aLong39);
			this.aLong39 = 0L;
		}
		this.aClass104_Sub2_Sub1_5.method19530(this);
	}

	@OriginalMember(owner = "client!aic", name = "finalize", descriptor = "()V", line = 130)
	@Override
	void finalize() throws Throwable {
		this.method10404();
		super.finalize();
	}

	@OriginalMember(owner = "client!aic", name = "hl", descriptor = "()V", line = 130)
	void method10405() throws Throwable {
		this.method10404();
		super.finalize();
	}
}
