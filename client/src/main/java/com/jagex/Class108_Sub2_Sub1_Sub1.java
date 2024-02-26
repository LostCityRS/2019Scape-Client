package com.jagex;

import jagdx.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!ail")
public final class Class108_Sub2_Sub1_Sub1 extends Class108_Sub2_Sub1 implements Interface51 {

	@OriginalMember(owner = "client!ail", name = "j", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ail", name = "e", descriptor = "J")
	long aLong45;

	@OriginalMember(owner = "client!ail", name = "u", descriptor = "J")
	long aLong46;

	@OriginalMember(owner = "client!ail", name = "l", descriptor = "J")
	long aLong47;

	@OriginalMember(owner = "client!ail", name = "m", descriptor = "Z")
	boolean aBoolean234 = false;

	@OriginalMember(owner = "client!ail", name = "o", descriptor = "Z")
	boolean aBoolean235 = false;

	@OriginalMember(owner = "client!ail", name = "f", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas1;

	@OriginalMember(owner = "client!ail", name = "t", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_6;

	@OriginalMember(owner = "client!ail", name = "g", descriptor = "I")
	int anInt1298;

	@OriginalMember(owner = "client!ail", name = "i", descriptor = "I")
	int anInt1299;

	@OriginalMember(owner = "client!ail", name = "<init>", descriptor = "(Lclient!aqw;Ljava/awt/Canvas;IIZ)V")
	Class108_Sub2_Sub1_Sub1(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0);
		this.aCanvas1 = arg1;
		this.aClass102_Sub1_Sub2_6 = arg0;
		this.anInt1298 = arg2;
		this.anInt1299 = arg3;
		this.aBoolean235 = arg4;
		this.method11173();
	}

	@OriginalMember(owner = "client!ail", name = "a", descriptor = "()Z")
	@Override
	public boolean method24040() {
		this.aBoolean234 = true;
		if (this.aLong45 == 0L) {
			if (this.aClass102_Sub1_Sub2_6.aBoolean537) {
				return false;
			}
			this.method11173();
		}
		if (t.t(IDirect3DDevice.SetRenderTarget(this.aClass102_Sub1_Sub2_6.aLong173, 0, this.aLong47))) {
			return false;
		} else if (t.t(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, this.aLong46))) {
			return false;
		} else {
			return super.method24039();
		}
	}

	@OriginalMember(owner = "client!ail", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt1299;
	}

	@OriginalMember(owner = "client!ail", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt1298;
	}

	@OriginalMember(owner = "client!ail", name = "q", descriptor = "()I")
	@Override
	public int method24053() {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "u", descriptor = "()Z")
	@Override
	public boolean method24039() {
		this.aBoolean234 = true;
		if (this.aLong45 == 0L) {
			if (this.aClass102_Sub1_Sub2_6.aBoolean537) {
				return false;
			}
			this.method11173();
		}
		if (t.t(IDirect3DDevice.SetRenderTarget(this.aClass102_Sub1_Sub2_6.aLong173, 0, this.aLong47))) {
			return false;
		} else if (t.t(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, this.aLong46))) {
			return false;
		} else {
			return super.method24039();
		}
	}

	@OriginalMember(owner = "client!ail", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		this.aBoolean234 = false;
		return t.f(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, 0L));
	}

	@OriginalMember(owner = "client!ail", name = "y", descriptor = "(II)I")
	@Override
	public int method24058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt1299;
	}

	@OriginalMember(owner = "client!ail", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt1298;
	}

	@OriginalMember(owner = "client!ail", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		if (this.aLong46 != 0L) {
			IUnknown.Release(this.aLong46);
			this.aLong46 = 0L;
		}
		if (this.aLong45 != 0L) {
			IUnknown.Release(this.aLong45);
			this.aLong45 = 0L;
		}
		this.aClass102_Sub1_Sub2_6.method21551(this);
	}

	@OriginalMember(owner = "client!ail", name = "c", descriptor = "()V")
	void method11175() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		if (this.aLong46 != 0L) {
			IUnknown.Release(this.aLong46);
			this.aLong46 = 0L;
		}
		if (this.aLong45 != 0L) {
			IUnknown.Release(this.aLong45);
			this.aLong45 = 0L;
		}
		this.aClass102_Sub1_Sub2_6.method21551(this);
	}

	@OriginalMember(owner = "client!ail", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method11175();
		super.finalize();
	}

	@OriginalMember(owner = "client!ail", name = "ht", descriptor = "()V")
	void method11176() throws Throwable {
		this.method11175();
		super.finalize();
	}

	@OriginalMember(owner = "client!ail", name = "w", descriptor = "()V")
	@Override
	public void method11173() {
		if (this.aLong45 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1298;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1299;
			if (this.aBoolean235) {
				this.aLong45 = IDirect3DDevice.GetSwapChain(this.aClass102_Sub1_Sub2_6.aLong173, 0);
				this.aLong47 = IDirect3DSwapChain.GetBackBuffer(this.aLong45, 0, 0);
				this.aLong46 = IDirect3DDevice.GetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173);
			} else if (Class102_Sub1_Sub2.method21555(this.aClass102_Sub1_Sub2_6.anInt3007, this.aClass102_Sub1_Sub2_6.anInt3004, this.aClass102_Sub1_Sub2_6.aLong170, this.aClass102_Sub1_Sub2_6.anInt2994, this.aClass102_Sub1_Sub2_6.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong45 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass102_Sub1_Sub2_6.aLong173, this.aD3DPRESENT_PARAMETERS1);
				this.aLong47 = IDirect3DSwapChain.GetBackBuffer(this.aLong45, 0, 0);
				this.aLong46 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, this.anInt1298, this.anInt1299, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass102_Sub1_Sub2_6.method21536(this);
		}
		if (this.aBoolean234) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!ail", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt1298;
	}

	@OriginalMember(owner = "client!ail", name = "j", descriptor = "()Z")
	@Override
	public boolean method24045() {
		this.aBoolean234 = true;
		if (this.aLong45 == 0L) {
			if (this.aClass102_Sub1_Sub2_6.aBoolean537) {
				return false;
			}
			this.method11173();
		}
		if (t.t(IDirect3DDevice.SetRenderTarget(this.aClass102_Sub1_Sub2_6.aLong173, 0, this.aLong47))) {
			return false;
		} else if (t.t(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, this.aLong46))) {
			return false;
		} else {
			return super.method24039();
		}
	}

	@OriginalMember(owner = "client!ail", name = "h", descriptor = "(II)I")
	@Override
	public int method24059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		this.aBoolean234 = false;
		return t.f(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, 0L));
	}

	@OriginalMember(owner = "client!ail", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		this.aBoolean234 = false;
		return t.f(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, 0L));
	}

	@OriginalMember(owner = "client!ail", name = "z", descriptor = "(II)V")
	@Override
	void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method24046();
		this.anInt1298 = arg0;
		this.anInt1299 = arg1;
		if (this.aBoolean235) {
			this.aClass102_Sub1_Sub2_6.method21596(this.anInt1298, this.anInt1299);
		}
		this.method11173();
		super.method24052(arg0, arg1);
	}

	@OriginalMember(owner = "client!ail", name = "p", descriptor = "()I")
	@Override
	public int method24056() {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "v", descriptor = "()I")
	@Override
	public int method24057() {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "b", descriptor = "()V")
	void method11177() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		if (this.aLong46 != 0L) {
			IUnknown.Release(this.aLong46);
			this.aLong46 = 0L;
		}
		if (this.aLong45 != 0L) {
			IUnknown.Release(this.aLong45);
			this.aLong45 = 0L;
		}
		this.aClass102_Sub1_Sub2_6.method21551(this);
	}

	@OriginalMember(owner = "client!ail", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt1298;
	}

	@OriginalMember(owner = "client!ail", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		if (this.aLong46 != 0L) {
			IUnknown.Release(this.aLong46);
			this.aLong46 = 0L;
		}
		if (this.aLong45 != 0L) {
			IUnknown.Release(this.aLong45);
			this.aLong45 = 0L;
		}
		this.aClass102_Sub1_Sub2_6.method21551(this);
	}

	@OriginalMember(owner = "client!ail", name = "hy", descriptor = "()V")
	void method11178() throws Throwable {
		this.method11175();
		super.finalize();
	}

	@OriginalMember(owner = "client!ail", name = "hj", descriptor = "()V")
	void method11179() throws Throwable {
		this.method11175();
		super.finalize();
	}

	@OriginalMember(owner = "client!ail", name = "d", descriptor = "(II)V")
	@Override
	void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method24046();
		this.anInt1298 = arg0;
		this.anInt1299 = arg1;
		if (this.aBoolean235) {
			this.aClass102_Sub1_Sub2_6.method21596(this.anInt1298, this.anInt1299);
		}
		this.method11173();
		super.method24052(arg0, arg1);
	}

	@OriginalMember(owner = "client!ail", name = "r", descriptor = "()V")
	@Override
	public void method11174() {
		if (this.aLong45 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1298;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1299;
			if (this.aBoolean235) {
				this.aLong45 = IDirect3DDevice.GetSwapChain(this.aClass102_Sub1_Sub2_6.aLong173, 0);
				this.aLong47 = IDirect3DSwapChain.GetBackBuffer(this.aLong45, 0, 0);
				this.aLong46 = IDirect3DDevice.GetDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173);
			} else if (Class102_Sub1_Sub2.method21555(this.aClass102_Sub1_Sub2_6.anInt3007, this.aClass102_Sub1_Sub2_6.anInt3004, this.aClass102_Sub1_Sub2_6.aLong170, this.aClass102_Sub1_Sub2_6.anInt2994, this.aClass102_Sub1_Sub2_6.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong45 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass102_Sub1_Sub2_6.aLong173, this.aD3DPRESENT_PARAMETERS1);
				this.aLong47 = IDirect3DSwapChain.GetBackBuffer(this.aLong45, 0, 0);
				this.aLong46 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass102_Sub1_Sub2_6.aLong173, this.anInt1298, this.anInt1299, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass102_Sub1_Sub2_6.method21536(this);
		}
		if (this.aBoolean234) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!ail", name = "n", descriptor = "(II)I")
	@Override
	public int method24054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong45, 0);
	}

	@OriginalMember(owner = "client!ail", name = "ax", descriptor = "()V")
	void method11180() {
		if (this.aLong47 != 0L) {
			IUnknown.Release(this.aLong47);
			this.aLong47 = 0L;
		}
		if (this.aLong46 != 0L) {
			IUnknown.Release(this.aLong46);
			this.aLong46 = 0L;
		}
		if (this.aLong45 != 0L) {
			IUnknown.Release(this.aLong45);
			this.aLong45 = 0L;
		}
		this.aClass102_Sub1_Sub2_6.method21551(this);
	}
}
