package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.e;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ath")
public class Class112_Sub1_Sub3_Sub2 extends Class112_Sub1_Sub3 {

	@OriginalMember(owner = "client!ath", name = "m", descriptor = "I")
	static final int anInt3202 = 16;

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "I")
	int anInt3199;

	@OriginalMember(owner = "client!ath", name = "w", descriptor = "I")
	int anInt3200;

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "I")
	int anInt3201;

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "Z")
	boolean aBoolean529;

	@OriginalMember(owner = "client!ath", name = "z", descriptor = "Lclient!ow;")
	Interface52 anInterface52_1 = null;

	@OriginalMember(owner = "client!ath", name = "p", descriptor = "[Lclient!od;")
	final Interface49[] anInterface49Array1 = new Interface49[4];

	@OriginalMember(owner = "client!ath", name = "k", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ath", name = "<init>", descriptor = "(Lclient!aqd;)V", line = 20)
	Class112_Sub1_Sub3_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0) {
		super(arg0);
		this.aClass104_Sub2_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!ath", name = "e", descriptor = "()I", line = 25)
	@Override
	public int method23737() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "()I", line = 25)
	@Override
	public int method23744() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "w", descriptor = "()I", line = 25)
	@Override
	public int method23753() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method23745() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "z", descriptor = "()I", line = 25)
	@Override
	public int method23742() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "p", descriptor = "()I", line = 25)
	@Override
	public int method23746() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "d", descriptor = "()I", line = 25)
	@Override
	public int method23736() {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!ath", name = "n", descriptor = "()I", line = 29)
	@Override
	public int method23738() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "r", descriptor = "()I", line = 29)
	@Override
	public int method23748() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "c", descriptor = "()I", line = 29)
	@Override
	public int method23747() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ath", name = "x", descriptor = "(Lclient!dw;)V", line = 33)
	@Override
	public void method23437(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3201 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean529) {
				this.method23452(0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local2.method30888();
			this.anInt3199 = local2.method30890();
			this.method23446();
		} else if (this.anInt3199 != local2.method30890() || this.anInt3200 != local2.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean529) {
			this.method23452(local2.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "t", descriptor = "(Lclient!dw;)V", line = 33)
	@Override
	public void method23440(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface52 local2 = (Interface52) arg0;
		if (arg0 == null) {
			this.anInt3201 &= 0xFFFFFFEF;
			this.anInterface52_1 = null;
			if (this.aBoolean529) {
				this.method23452(0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local2.method30888();
			this.anInt3199 = local2.method30890();
			this.method23446();
		} else if (this.anInt3199 != local2.method30890() || this.anInt3200 != local2.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= 0x10;
		this.anInterface52_1 = local2;
		if (this.aBoolean529) {
			this.method23452(local2.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "b", descriptor = "(ILclient!dp;)V", line = 59)
	@Override
	public void method23435(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean529) {
				this.method23448(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method30888();
			this.anInt3199 = local6.method30890();
			this.method23446();
		} else if (this.anInt3199 != local6.method30890() || this.anInt3200 != local6.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean529) {
			this.method23448(arg0, local6.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "g", descriptor = "(ILclient!dp;)V", line = 59)
	@Override
	public void method23433(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean529) {
				this.method23448(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method30888();
			this.anInt3199 = local6.method30890();
			this.method23446();
		} else if (this.anInt3199 != local6.method30890() || this.anInt3200 != local6.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean529) {
			this.method23448(arg0, local6.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "j", descriptor = "(ILclient!dp;)V", line = 59)
	@Override
	public void method23438(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean529) {
				this.method23448(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method30888();
			this.anInt3199 = local6.method30890();
			this.method23446();
		} else if (this.anInt3199 != local6.method30890() || this.anInt3200 != local6.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean529) {
			this.method23448(arg0, local6.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "i", descriptor = "(ILclient!dp;)V", line = 59)
	@Override
	public void method23439(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface49 local6 = (Interface49) arg1;
		if (arg1 == null) {
			this.anInt3201 &= ~local3;
			this.anInterface49Array1[arg0] = null;
			if (this.aBoolean529) {
				this.method23448(arg0, 0L);
			}
			if (this.anInt3201 == 0) {
				this.anInt3200 = 0;
				this.anInt3199 = 0;
			}
			return;
		}
		if (this.anInt3201 == 0) {
			this.anInt3200 = local6.method30888();
			this.anInt3199 = local6.method30890();
			this.method23446();
		} else if (this.anInt3199 != local6.method30890() || this.anInt3200 != local6.method30888()) {
			throw new RuntimeException();
		}
		this.anInt3201 |= local3;
		this.anInterface49Array1[arg0] = local6;
		if (this.aBoolean529) {
			this.method23448(arg0, local6.method29648());
		}
	}

	@OriginalMember(owner = "client!ath", name = "as", descriptor = "(IJ)Z", line = 86)
	boolean method23448(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27717(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "ar", descriptor = "(IJ)Z", line = 86)
	boolean method23449(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27717(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "au", descriptor = "(IJ)Z", line = 86)
	boolean method23450(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27717(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "am", descriptor = "(IJ)Z", line = 86)
	boolean method23451(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return e.method27717(IDirect3DDevice.SetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, arg0, arg1));
	}

	@OriginalMember(owner = "client!ath", name = "at", descriptor = "(J)Z", line = 90)
	boolean method23452(@OriginalArg(0) long arg0) {
		return e.method27717(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_10.aLong121, arg0));
	}

	@OriginalMember(owner = "client!ath", name = "ap", descriptor = "(J)Z", line = 90)
	boolean method23453(@OriginalArg(0) long arg0) {
		return e.method27717(IDirect3DDevice.SetDepthStencilSurface(this.aClass104_Sub2_Sub1_10.aLong121, arg0));
	}

	@OriginalMember(owner = "client!ath", name = "h", descriptor = "()Z", line = 94)
	@Override
	public boolean method23442() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "al", descriptor = "()Z", line = 94)
	@Override
	public boolean method23444() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "ah", descriptor = "()Z", line = 94)
	@Override
	public boolean method23443() {
		return this.anInterface49Array1[0] != null;
	}

	@OriginalMember(owner = "client!ath", name = "k", descriptor = "()Z", line = 98)
	@Override
	boolean method23740() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29648();
				this.method23448(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23452(this.anInterface52_1.method29648());
		}
		this.aBoolean529 = true;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ath", name = "v", descriptor = "()Z", line = 98)
	@Override
	boolean method23749() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29648();
				this.method23448(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23452(this.anInterface52_1.method29648());
		}
		this.aBoolean529 = true;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ath", name = "o", descriptor = "()Z", line = 98)
	@Override
	boolean method23743() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29648();
				this.method23448(local1, local14);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23452(this.anInterface52_1.method29648());
		}
		this.aBoolean529 = true;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ath", name = "s", descriptor = "()Z", line = 111)
	@Override
	boolean method23750() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				this.method23448(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23452(0L);
		}
		this.aBoolean529 = false;
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "()Z", line = 111)
	@Override
	boolean method23741() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface49 local9 = this.anInterface49Array1[local1];
			if (local9 != null) {
				this.method23448(local1, 0L);
			}
		}
		if (this.anInterface52_1 != null) {
			this.method23452(0L);
		}
		this.aBoolean529 = false;
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "a", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29648(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "ae", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29648(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "ag", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass104_Sub2_Sub1_10.aLong121, 0);
			IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_10.aLong121, this.anInterface49Array1[0].method29648(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!ath", name = "m", descriptor = "()V", line = 129)
	@Override
	public void method23739() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method30884();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method30884();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "y", descriptor = "()V", line = 129)
	@Override
	public void method23752() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method30884();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method30884();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "q", descriptor = "()V", line = 129)
	@Override
	public void method23751() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method30884();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method30884();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "ad", descriptor = "()V", line = 134)
	void method23454() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29647();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method29647();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "aq", descriptor = "()V", line = 134)
	void method23455() {
		if (this.anInterface52_1 != null) {
			this.anInterface52_1.method29647();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface49Array1.length; local7++) {
			if (this.anInterface49Array1[local7] != null) {
				this.anInterface49Array1[local7].method29647();
			}
		}
	}

	@OriginalMember(owner = "client!ath", name = "finalize", descriptor = "()V", line = 139)
	@Override
	protected void finalize() throws Throwable {
		this.method23454();
		super.finalize();
	}

	@OriginalMember(owner = "client!ath", name = "hl", descriptor = "()V", line = 139)
	void method23456() throws Throwable {
		this.method23454();
		super.finalize();
	}
}
