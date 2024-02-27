package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.e;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ath")
public final class Class112_Sub1_Sub3_Sub2 extends Class112_Sub1_Sub3 {

	@OriginalMember(owner = "client!ath", name = "m", descriptor = "I")
	static final int anInt3202 = 16;

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "I")
	int anInt3199;

	@OriginalMember(owner = "client!ath", name = "w", descriptor = "I")
	int anInt3200;

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "I")
	int anInt3201;

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "Z")
	boolean aBoolean530;

	@OriginalMember(owner = "client!ath", name = "z", descriptor = "Lclient!ow;")
	Interface52 anInterface52_1 = null;

	@OriginalMember(owner = "client!ath", name = "p", descriptor = "[Lclient!od;")
	final Interface49[] anInterface49Array1 = new Interface49[4];

	@OriginalMember(owner = "client!ath", name = "k", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ath", name = "<init>", descriptor = "(Lclient!aqd;)V")
	Class112_Sub1_Sub3_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0) {
		super(arg0);
		this.aClass104_Sub2_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!ath", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method23462();
		super.finalize();
	}

	@OriginalMember(owner = "client!ath", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "b", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23446(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean530) {
				this.method23460(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method31069();
			this.anInt3199 = local6.method31071();
			this.method23458();
		} else if (this.anInt3199 != local6.method31071() || this.anInt3200 != local6.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean530) {
			this.method23460(arg0, local6.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "as", descriptor = "(IJ)Z")
	boolean method23460(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27888(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "at", descriptor = "(J)Z")
	boolean method23461(@OriginalArg(0) long arg0) {
		return e.method27888(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_10.aLong121, arg0));
	}

	@OriginalMember(owner = "client!ath", name = "h", descriptor = "()Z")
	@Override
	public boolean method23453() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "x", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23448(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3201 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean530) {
				this.method23461(0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local2.method31069();
			this.anInt3199 = local2.method31071();
			this.method23458();
		} else if (this.anInt3199 != local2.method31071() || this.anInt3200 != local2.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean530) {
			this.method23461(local2.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "al", descriptor = "()Z")
	@Override
	public boolean method23455() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29829(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method31065();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method31065();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "ad", descriptor = "()V")
	void method23462() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29828();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method29828();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "ah", descriptor = "()Z")
	@Override
	public boolean method23454() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "t", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23451(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3201 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean530) {
				this.method23461(0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local2.method31069();
			this.anInt3199 = local2.method31071();
			this.method23458();
		} else if (this.anInt3199 != local2.method31071() || this.anInt3200 != local2.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean530) {
			this.method23461(local2.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "aq", descriptor = "()V")
	void method23463() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29828();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method29828();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "g", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23444(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean530) {
				this.method23460(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method31069();
			this.anInt3199 = local6.method31071();
			this.method23458();
		} else if (this.anInt3199 != local6.method31071() || this.anInt3200 != local6.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean530) {
			this.method23460(arg0, local6.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "j", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23449(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean530) {
				this.method23460(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method31069();
			this.anInt3199 = local6.method31071();
			this.method23458();
		} else if (this.anInt3199 != local6.method31071() || this.anInt3200 != local6.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean530) {
			this.method23460(arg0, local6.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29829();
				this.method23460(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23461(this.anInterface52_1.method29829());
		}
		this.aBoolean530 = true;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ath", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29829();
				this.method23460(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23461(this.anInterface52_1.method29829());
		}
		this.aBoolean530 = true;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ath", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29829();
				this.method23460(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23461(this.anInterface52_1.method29829());
		}
		this.aBoolean530 = true;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ath", name = "ar", descriptor = "(IJ)Z")
	boolean method23464(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27888(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "ae", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29829(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "ag", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29829(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method31065();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method31065();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method31065();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method31065();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "hl", descriptor = "()V")
	void method23465() throws Throwable {
		this.method23462();
		super.finalize();
	}

	@OriginalMember(owner = "client!ath", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				this.method23460(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23461(0L);
		}
		this.aBoolean530 = false;
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "i", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23450(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean530) {
				this.method23460(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method31069();
			this.anInt3199 = local6.method31071();
			this.method23458();
		} else if (this.anInt3199 != local6.method31071() || this.anInt3200 != local6.method31069()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean530) {
			this.method23460(arg0, local6.method29829());
		}
	}

	@OriginalMember(owner = "client!ath", name = "au", descriptor = "(IJ)Z")
	boolean method23466(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27888(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				this.method23460(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23461(0L);
		}
		this.aBoolean530 = false;
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "ap", descriptor = "(J)Z")
	boolean method23467(@OriginalArg(0) long arg0) {
		return e.method27888(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_10.aLong121, arg0));
	}

	@OriginalMember(owner = "client!ath", name = "am", descriptor = "(IJ)Z")
	boolean method23468(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27888(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}
}
