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
public final class Class112_Sub2_Sub1_Sub1 extends Class112_Sub2_Sub1 implements Interface53 {

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!aic", name = "m", descriptor = "J")
	long aLong39;

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "J")
	long aLong40;

	@OriginalMember(owner = "client!aic", name = "f", descriptor = "J")
	long aLong41;

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "Z")
	boolean aBoolean214 = false;

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "Z")
	boolean aBoolean215 = false;

	@OriginalMember(owner = "client!aic", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas2;

	@OriginalMember(owner = "client!aic", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_5;

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "I")
	int anInt1192;

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "I")
	int anInt1193;

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "(Lclient!aqd;Ljava/awt/Canvas;IIZ)V")
	Class112_Sub2_Sub1_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0);
		this.aCanvas2 = arg1;
		this.aClass104_Sub2_Sub1_5 = arg0;
		this.anInt1192 = arg2;
		this.anInt1193 = arg3;
		this.aBoolean215 = arg4;
		this.method10400();
	}

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "()V")
	@Override
	public void method10400() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.aBoolean734 = true;
			this.aD3DPRESENT_PARAMETERS1.anInt4355 = 1;
			this.aD3DPRESENT_PARAMETERS1.anInt4362 = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.anInt4352 = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.anInt4353 = this.anInt1193;
			if (this.aBoolean215) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19551(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.anInt4359;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.anInt4356, this.aD3DPRESENT_PARAMETERS1.anInt4357, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19530(this);
		}
		if (this.aBoolean214) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "al", descriptor = "()V")
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
		this.aClass104_Sub2_Sub1_5.method19535(this);
	}

	@OriginalMember(owner = "client!aic", name = "a", descriptor = "()I")
	@Override
	public int method23767() {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "j", descriptor = "(II)V")
	@Override
	void method23768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23750();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean215) {
			this.aClass104_Sub2_Sub1_5.method19554(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "i", descriptor = "(II)V")
	@Override
	void method23769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23750();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean215) {
			this.aClass104_Sub2_Sub1_5.method19554(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
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
		this.aClass104_Sub2_Sub1_5.method19535(this);
	}

	@OriginalMember(owner = "client!aic", name = "ah", descriptor = "()V")
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
		this.aClass104_Sub2_Sub1_5.method19535(this);
	}

	@OriginalMember(owner = "client!aic", name = "v", descriptor = "()Z")
	@Override
	public boolean method23760() {
		this.aBoolean214 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean432) {
				return false;
			}
			this.method10400();
		}
		if (e.method27887(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27887(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "()Z")
	@Override
	public boolean method23751() {
		this.aBoolean214 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean432) {
				return false;
			}
			this.method10400();
		}
		if (e.method27887(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27887(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt1192;
	}

	@OriginalMember(owner = "client!aic", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt1193;
	}

	@OriginalMember(owner = "client!aic", name = "g", descriptor = "(II)I")
	@Override
	public int method23766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "o", descriptor = "()Z")
	@Override
	public boolean method23754() {
		this.aBoolean214 = true;
		if (this.aLong39 == 0L) {
			if (this.aClass104_Sub2_Sub1_5.aBoolean432) {
				return false;
			}
			this.method10400();
		}
		if (e.method27887(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_5.aLong121, 0, this.aLong41))) {
			return false;
		} else if (e.method27887(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.aLong40))) {
			return false;
		} else {
			return super.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		this.aBoolean214 = false;
		return e.method27888(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, 0L));
	}

	@OriginalMember(owner = "client!aic", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
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
		this.aClass104_Sub2_Sub1_5.method19535(this);
	}

	@OriginalMember(owner = "client!aic", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
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
		this.aClass104_Sub2_Sub1_5.method19535(this);
	}

	@OriginalMember(owner = "client!aic", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.method10404();
		super.finalize();
	}

	@OriginalMember(owner = "client!aic", name = "t", descriptor = "(II)V")
	@Override
	void method23770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23750();
		this.anInt1192 = arg0;
		this.anInt1193 = arg1;
		if (this.aBoolean215) {
			this.aClass104_Sub2_Sub1_5.method19554(this.anInt1192, this.anInt1193);
		}
		this.method10400();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "ae", descriptor = "()I")
	@Override
	public int method23771() {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "ag", descriptor = "(II)I")
	@Override
	public int method23772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong39, 0);
	}

	@OriginalMember(owner = "client!aic", name = "hl", descriptor = "()V")
	void method10405() throws Throwable {
		this.method10404();
		super.finalize();
	}

	@OriginalMember(owner = "client!aic", name = "b", descriptor = "()V")
	@Override
	public void method10401() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.aBoolean734 = true;
			this.aD3DPRESENT_PARAMETERS1.anInt4355 = 1;
			this.aD3DPRESENT_PARAMETERS1.anInt4362 = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.anInt4352 = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.anInt4353 = this.anInt1193;
			if (this.aBoolean215) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19551(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.anInt4359;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.anInt4356, this.aD3DPRESENT_PARAMETERS1.anInt4357, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19530(this);
		}
		if (this.aBoolean214) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "h", descriptor = "()V")
	@Override
	public void method10402() {
		if (this.aLong39 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas2);
			this.aD3DPRESENT_PARAMETERS1.aBoolean734 = true;
			this.aD3DPRESENT_PARAMETERS1.anInt4355 = 1;
			this.aD3DPRESENT_PARAMETERS1.anInt4362 = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.anInt4352 = this.anInt1192;
			this.aD3DPRESENT_PARAMETERS1.anInt4353 = this.anInt1193;
			if (this.aBoolean215) {
				this.aLong39 = IDirect3DDevice.GetSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, 0);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.GetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121);
			} else if (Class104_Sub2_Sub1.method19551(this.aClass104_Sub2_Sub1_5.anInt2731, this.aClass104_Sub2_Sub1_5.anInt2730, this.aClass104_Sub2_Sub1_5.aLong117, this.aClass104_Sub2_Sub1_5.anInt2951, this.aClass104_Sub2_Sub1_5.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.anInt4359;
				this.aLong39 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass104_Sub2_Sub1_5.aLong121, this.aD3DPRESENT_PARAMETERS1);
				this.aLong41 = IDirect3DSwapChain.GetBackBuffer(this.aLong39, 0, 0);
				this.aLong40 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, this.anInt1192, this.anInt1193, local84, this.aD3DPRESENT_PARAMETERS1.anInt4356, this.aD3DPRESENT_PARAMETERS1.anInt4357, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass104_Sub2_Sub1_5.method19530(this);
		}
		if (this.aBoolean214) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!aic", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		this.aBoolean214 = false;
		return e.method27888(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_5.aLong121, 0L));
	}
}
