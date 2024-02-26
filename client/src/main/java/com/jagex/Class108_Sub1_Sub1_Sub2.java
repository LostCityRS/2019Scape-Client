package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.t;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atp")
public final class Class108_Sub1_Sub1_Sub2 extends Class108_Sub1_Sub1 {

	@OriginalMember(owner = "client!atp", name = "e", descriptor = "I")
	static final int anInt3243 = 16;

	@OriginalMember(owner = "client!atp", name = "i", descriptor = "I")
	int anInt3240;

	@OriginalMember(owner = "client!atp", name = "l", descriptor = "I")
	int anInt3241;

	@OriginalMember(owner = "client!atp", name = "g", descriptor = "I")
	int anInt3242;

	@OriginalMember(owner = "client!atp", name = "m", descriptor = "Z")
	boolean aBoolean635;

	@OriginalMember(owner = "client!atp", name = "o", descriptor = "Lclient!ow;")
	Interface52 anInterface52_1 = null;

	@OriginalMember(owner = "client!atp", name = "j", descriptor = "[Lclient!oh;")
	final Interface50[] anInterface50Array1 = new Interface50[4];

	@OriginalMember(owner = "client!atp", name = "u", descriptor = "Lclient!aqw;")
	final Class102_Sub1_Sub2 aClass102_Sub1_Sub2_10;

	@OriginalMember(owner = "client!atp", name = "<init>", descriptor = "(Lclient!aqw;)V")
	Class108_Sub1_Sub1_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0) {
		super(arg0);
		this.aClass102_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!atp", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				this.method23915(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(0L);
		}
		this.aBoolean635 = false;
		return true;
	}

	@OriginalMember(owner = "client!atp", name = "c", descriptor = "()Z")
	@Override
	public boolean method23906() {
		return this.anInterface50Array1[0] != null;
	}

	@OriginalMember(owner = "client!atp", name = "z", descriptor = "(ILclient!do;)V")
	@Override
	public void method23900(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface50 local6 = (Interface50) arg1;
		if (arg1 == null) {
			this.anInt3240 &= ~local3;
			this.anInterface50Array1[arg0] = null;
			if (this.aBoolean635) {
				this.method23915(arg0, 0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local6.method30838();
			this.anInt3241 = local6.method30843();
			this.method23913();
		} else if (this.anInt3241 != local6.method30843() || this.anInt3242 != local6.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= local3;
		this.anInterface50Array1[arg0] = local6;
		if (this.aBoolean635) {
			this.method23915(arg0, local6.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "w", descriptor = "(Lclient!de;)V")
	@Override
	public void method23905(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3240 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean635) {
				this.method23916(0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local2.method30838();
			this.anInt3241 = local2.method30843();
			this.method23913();
		} else if (this.anInt3241 != local2.method30843() || this.anInt3242 != local2.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean635) {
			this.method23916(local2.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "r", descriptor = "(ILclient!do;)V")
	@Override
	public void method23903(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface50 local6 = (Interface50) arg1;
		if (arg1 == null) {
			this.anInt3240 &= ~local3;
			this.anInterface50Array1[arg0] = null;
			if (this.aBoolean635) {
				this.method23915(arg0, 0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local6.method30838();
			this.anInt3241 = local6.method30843();
			this.method23913();
		} else if (this.anInt3241 != local6.method30843() || this.anInt3242 != local6.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= local3;
		this.anInterface50Array1[arg0] = local6;
		if (this.aBoolean635) {
			this.method23915(arg0, local6.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "ac", descriptor = "(IJ)Z")
	boolean method23915(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return t.f(IDirect3DDevice.SetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, arg0, arg1));
	}

	@OriginalMember(owner = "client!atp", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt3242;
	}

	@OriginalMember(owner = "client!atp", name = "q", descriptor = "()Z")
	@Override
	public boolean method23897() {
		return this.anInterface50Array1[0] != null;
	}

	@OriginalMember(owner = "client!atp", name = "ag", descriptor = "(J)Z")
	boolean method23916(@OriginalArg(0) long arg0) {
		return t.f(IDirect3DDevice.SetDepthStencilSurface(this.aClass102_Sub1_Sub2_10.aLong173, arg0));
	}

	@OriginalMember(owner = "client!atp", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				this.method23915(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(0L);
		}
		this.aBoolean635 = false;
		return true;
	}

	@OriginalMember(owner = "client!atp", name = "h", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, 0);
			IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_10.aLong173, this.anInterface50Array1[0].method29751(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!atp", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method30837();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface50Array1.length; local7++) {
			if (this.anInterface50Array1[local7] != null) {
				this.anInterface50Array1[local7].method30837();
			}
		}
	}

	@OriginalMember(owner = "client!atp", name = "ax", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, 0);
			IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_10.aLong173, this.anInterface50Array1[0].method29751(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!atp", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt3241;
	}

	@OriginalMember(owner = "client!atp", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt3241;
	}

	@OriginalMember(owner = "client!atp", name = "ab", descriptor = "()V")
	void method23917() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29752();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface50Array1.length; local7++) {
			if (this.anInterface50Array1[local7] != null) {
				this.anInterface50Array1[local7].method29752();
			}
		}
	}

	@OriginalMember(owner = "client!atp", name = "p", descriptor = "(Lclient!de;)V")
	@Override
	public void method23901(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3240 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean635) {
				this.method23916(0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local2.method30838();
			this.anInt3241 = local2.method30843();
			this.method23913();
		} else if (this.anInt3241 != local2.method30843() || this.anInt3242 != local2.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean635) {
			this.method23916(local2.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "d", descriptor = "(ILclient!do;)V")
	@Override
	public void method23899(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface50 local6 = (Interface50) arg1;
		if (arg1 == null) {
			this.anInt3240 &= ~local3;
			this.anInterface50Array1[arg0] = null;
			if (this.aBoolean635) {
				this.method23915(arg0, 0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local6.method30838();
			this.anInt3241 = local6.method30843();
			this.method23913();
		} else if (this.anInt3241 != local6.method30843() || this.anInt3242 != local6.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= local3;
		this.anInterface50Array1[arg0] = local6;
		if (this.aBoolean635) {
			this.method23915(arg0, local6.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt3241;
	}

	@OriginalMember(owner = "client!atp", name = "af", descriptor = "()V")
	void method23918() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29752();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface50Array1.length; local7++) {
			if (this.anInterface50Array1[local7] != null) {
				this.anInterface50Array1[local7].method29752();
			}
		}
	}

	@OriginalMember(owner = "client!atp", name = "v", descriptor = "(Lclient!de;)V")
	@Override
	public void method23902(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3240 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean635) {
				this.method23916(0L);
			}
			if (this.anInt3240 == 0) {
				this.anInt3242 = 0;
				this.anInt3241 = 0;
			}
			return;
		}
		if (this.anInt3240 == 0) {
			this.anInt3242 = local2.method30838();
			this.anInt3241 = local2.method30843();
			this.method23913();
		} else if (this.anInt3241 != local2.method30843() || this.anInt3242 != local2.method30838()) {
			throw new RuntimeException();
		}
		this.anInt3240 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean635) {
			this.method23916(local2.method29751());
		}
	}

	@OriginalMember(owner = "client!atp", name = "y", descriptor = "()Z")
	@Override
	public boolean method23895() {
		return this.anInterface50Array1[0] != null;
	}

	@OriginalMember(owner = "client!atp", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.method23917();
		super.finalize();
	}

	@OriginalMember(owner = "client!atp", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29751();
				this.method23915(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(this.anInterface52_1.method29751());
		}
		this.aBoolean635 = true;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atp", name = "b", descriptor = "()Z")
	@Override
	public boolean method23896() {
		return this.anInterface50Array1[0] != null;
	}

	@OriginalMember(owner = "client!atp", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29751();
				this.method23915(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(this.anInterface52_1.method29751());
		}
		this.aBoolean635 = true;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atp", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29751();
				this.method23915(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(this.anInterface52_1.method29751());
		}
		this.aBoolean635 = true;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atp", name = "n", descriptor = "()Z")
	@Override
	public boolean method23908() {
		return this.anInterface50Array1[0] != null;
	}

	@OriginalMember(owner = "client!atp", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface50 local9 = this.anInterface50Array1[local1];
			if (local9 != null) {
				this.method23915(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23916(0L);
		}
		this.aBoolean635 = false;
		return true;
	}

	@OriginalMember(owner = "client!atp", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt3241;
	}

	@OriginalMember(owner = "client!atp", name = "ay", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, 0);
			IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_10.aLong173, this.anInterface50Array1[0].method29751(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!atp", name = "ai", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, 0);
			IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_10.aLong173, this.anInterface50Array1[0].method29751(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!atp", name = "aq", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, 0);
			IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_10.aLong173, this.anInterface50Array1[0].method29751(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!atp", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method30837();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface50Array1.length; local7++) {
			if (this.anInterface50Array1[local7] != null) {
				this.anInterface50Array1[local7].method30837();
			}
		}
	}

	@OriginalMember(owner = "client!atp", name = "hy", descriptor = "()V")
	void method23919() throws Throwable {
		this.method23917();
		super.finalize();
	}

	@OriginalMember(owner = "client!atp", name = "hj", descriptor = "()V")
	void method23920() throws Throwable {
		this.method23917();
		super.finalize();
	}

	@OriginalMember(owner = "client!atp", name = "ht", descriptor = "()V")
	void method23921() throws Throwable {
		this.method23917();
		super.finalize();
	}

	@OriginalMember(owner = "client!atp", name = "al", descriptor = "(IJ)Z")
	boolean method23922(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return t.f(IDirect3DDevice.SetRenderTarget(this.aClass102_Sub1_Sub2_10.aLong173, arg0, arg1));
	}

	@OriginalMember(owner = "client!atp", name = "ah", descriptor = "()V")
	void method23923() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29752();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface50Array1.length; local7++) {
			if (this.anInterface50Array1[local7] != null) {
				this.anInterface50Array1[local7].method29752();
			}
		}
	}

	@OriginalMember(owner = "client!atp", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt3242;
	}
}
