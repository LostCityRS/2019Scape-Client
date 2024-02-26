package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ano")
public abstract class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "[I")
	int[] anIntArray282;

	@OriginalMember(owner = "client!ano", name = "e", descriptor = "[F")
	float[] aFloatArray86;

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "[Lclient!pk;")
	Class485[] aClass485Array8;

	@OriginalMember(owner = "client!ano", name = "u", descriptor = "I")
	int anInt3143 = 0;

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "F")
	float aFloat237 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "F")
	float aFloat238 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!jw;)V")
	Class20_Sub4(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ano", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public final void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-1974102943);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23110(-2023184157);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ano", name = "y", descriptor = "(Lclient!pk;IFI)V")
	public final void method23097(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		if (this.aClass485Array8 == null) {
			this.aClass485Array8 = new Class485[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray282 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class485[] local35 = new Class485[this.aClass485Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass485Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass485Array8.length + 1];
		System.arraycopy(this.aClass485Array8, 0, local35, 0, this.aClass485Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass485Array8.length);
		System.arraycopy(this.anIntArray282, 0, local49, 0, this.aClass485Array8.length);
		this.aClass485Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray282 = local49;
		this.aClass485Array8[this.aClass485Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray282[this.anIntArray282.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "t", descriptor = "(FI)V")
	@Override
	public final void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class485 local7 = this.aClass485Array8[this.anInt3143 * -169964755];
		if (this.aFloatArray86[this.anInt3143 * -169964755] > 0.0F) {
			if (this.aFloatArray86[this.anInt3143 * -169964755] >= arg0) {
				this.aFloatArray86[this.anInt3143 * -169964755] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
			this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -123);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat237 >= local70) {
				if (this.aClass485Array8.length == this.anInt3143 * -169964755 + 1) {
					return;
				}
				if (this.aFloatArray86[this.anInt3143 * -169964755 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3143 * -169964755 + 1] -= arg0;
					return;
				}
				this.anInt3143 += 718339237;
				arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
				this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
				this.method23099(-790861761);
				this.aFloat237 = 0.0F;
				this.aFloat238 = 0.0F;
				local7 = this.aClass485Array8[this.anInt3143 * -169964755];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat237 < local70) {
				this.aFloat238 = this.method23116(local70, this.aFloat238, Math.min(arg0, local63), -1141941251);
				arg0 -= local63;
				this.method23098(this.aFloat238, local70, 1832008469);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "(FFI)V")
	void method23098(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > arg1) {
			this.aFloat237 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "j", descriptor = "(F)V")
	@Override
	public final void method23083(@OriginalArg(0) float arg0) {
		@Pc(7) Class485 local7 = this.aClass485Array8[this.anInt3143 * -169964755];
		if (this.aFloatArray86[this.anInt3143 * -169964755] > 0.0F) {
			if (this.aFloatArray86[this.anInt3143 * -169964755] >= arg0) {
				this.aFloatArray86[this.anInt3143 * -169964755] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
			this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -95);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat237 >= local70) {
				if (this.aClass485Array8.length == this.anInt3143 * -169964755 + 1) {
					return;
				}
				if (this.aFloatArray86[this.anInt3143 * -169964755 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3143 * -169964755 + 1] -= arg0;
					return;
				}
				this.anInt3143 += 718339237;
				arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
				this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
				this.method23099(-928821188);
				this.aFloat237 = 0.0F;
				this.aFloat238 = 0.0F;
				local7 = this.aClass485Array8[this.anInt3143 * -169964755];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat237 < local70) {
				this.aFloat238 = this.method23116(local70, this.aFloat238, Math.min(arg0, local63), 427601031);
				arg0 -= local63;
				this.method23098(this.aFloat238, local70, -299702076);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "b", descriptor = "(I)V")
	abstract void method23099(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ano", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "s", descriptor = "()Z")
	@Override
	public final boolean method23092() {
		return this.aClass485Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "ag", descriptor = "()V")
	abstract void method23100();

	@OriginalMember(owner = "client!ano", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		return this.method23080(-1639227114);
	}

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	@Override
	public final void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(795883561);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23110(-2023184157);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "(Lclient!ald;I)V")
	@Override
	public final void method23094(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aFloat237 = 0.0F;
		this.aFloat238 = 0.0F;
		this.anInt3143 = 0;
		@Pc(12) int local12 = arg0.method23362(82587893);
		this.aClass485Array8 = new Class485[local12];
		this.aFloatArray86 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array8[local22] = new Class485(arg0);
			this.aFloatArray86[local22] = arg0.method23188(313190285);
		}
		this.method23107(arg0, local12, (byte) 1);
	}

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method23076(@OriginalArg(0) byte arg0) {
		return this.aClass485Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "aq", descriptor = "(FFF)F")
	abstract float method23101(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "ao", descriptor = "()V")
	abstract void method23102();

	@OriginalMember(owner = "client!ano", name = "aj", descriptor = "()V")
	abstract void method23103();

	@OriginalMember(owner = "client!ano", name = "ac", descriptor = "()V")
	abstract void method23104();

	@OriginalMember(owner = "client!ano", name = "a", descriptor = "()Z")
	@Override
	public final boolean method23084() {
		return this.aClass485Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "ab", descriptor = "(Lclient!ald;I)V")
	abstract void method23105(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "al", descriptor = "(Lclient!ald;I)V")
	abstract void method23106(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "(F)V")
	@Override
	public final void method23081(@OriginalArg(0) float arg0) {
		@Pc(7) Class485 local7 = this.aClass485Array8[this.anInt3143 * -169964755];
		if (this.aFloatArray86[this.anInt3143 * -169964755] > 0.0F) {
			if (this.aFloatArray86[this.anInt3143 * -169964755] >= arg0) {
				this.aFloatArray86[this.anInt3143 * -169964755] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
			this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -86);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat237 >= local70) {
				if (this.aClass485Array8.length == this.anInt3143 * -169964755 + 1) {
					return;
				}
				if (this.aFloatArray86[this.anInt3143 * -169964755 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3143 * -169964755 + 1] -= arg0;
					return;
				}
				this.anInt3143 += 718339237;
				arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
				this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
				this.method23099(-312471304);
				this.aFloat237 = 0.0F;
				this.aFloat238 = 0.0F;
				local7 = this.aClass485Array8[this.anInt3143 * -169964755];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat237 < local70) {
				this.aFloat238 = this.method23116(local70, this.aFloat238, Math.min(arg0, local63), 844003183);
				arg0 -= local63;
				this.method23098(this.aFloat238, local70, 131442814);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "(F)V")
	@Override
	public final void method23077(@OriginalArg(0) float arg0) {
		@Pc(7) Class485 local7 = this.aClass485Array8[this.anInt3143 * -169964755];
		if (this.aFloatArray86[this.anInt3143 * -169964755] > 0.0F) {
			if (this.aFloatArray86[this.anInt3143 * -169964755] >= arg0) {
				this.aFloatArray86[this.anInt3143 * -169964755] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
			this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -36);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat237 >= local70) {
				if (this.aClass485Array8.length == this.anInt3143 * -169964755 + 1) {
					return;
				}
				if (this.aFloatArray86[this.anInt3143 * -169964755 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3143 * -169964755 + 1] -= arg0;
					return;
				}
				this.anInt3143 += 718339237;
				arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
				this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
				this.method23099(-2106944597);
				this.aFloat237 = 0.0F;
				this.aFloat238 = 0.0F;
				local7 = this.aClass485Array8[this.anInt3143 * -169964755];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat237 < local70) {
				this.aFloat238 = this.method23116(local70, this.aFloat238, Math.min(arg0, local63), -1132567428);
				arg0 -= local63;
				this.method23098(this.aFloat238, local70, -525807337);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "o", descriptor = "(F)V")
	@Override
	public final void method23082(@OriginalArg(0) float arg0) {
		@Pc(7) Class485 local7 = this.aClass485Array8[this.anInt3143 * -169964755];
		if (this.aFloatArray86[this.anInt3143 * -169964755] > 0.0F) {
			if (this.aFloatArray86[this.anInt3143 * -169964755] >= arg0) {
				this.aFloatArray86[this.anInt3143 * -169964755] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
			this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -40);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat237 >= local70) {
				if (this.aClass485Array8.length == this.anInt3143 * -169964755 + 1) {
					return;
				}
				if (this.aFloatArray86[this.anInt3143 * -169964755 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3143 * -169964755 + 1] -= arg0;
					return;
				}
				this.anInt3143 += 718339237;
				arg0 -= this.aFloatArray86[this.anInt3143 * -169964755];
				this.aFloatArray86[this.anInt3143 * -169964755] = 0.0F;
				this.method23099(-1186440993);
				this.aFloat237 = 0.0F;
				this.aFloat238 = 0.0F;
				local7 = this.aClass485Array8[this.anInt3143 * -169964755];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat237 < local70) {
				this.aFloat238 = this.method23116(local70, this.aFloat238, Math.min(arg0, local63), 982452126);
				arg0 -= local63;
				this.method23098(this.aFloat238, local70, 1244073643);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "ay", descriptor = "(Lclient!ald;IB)V")
	abstract void method23107(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!ano", name = "h", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method23091(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat237 = 0.0F;
		this.aFloat238 = 0.0F;
		this.anInt3143 = 0;
		@Pc(12) int local12 = arg0.method23362(-1936704409);
		this.aClass485Array8 = new Class485[local12];
		this.aFloatArray86 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array8[local22] = new Class485(arg0);
			this.aFloatArray86[local22] = arg0.method23188(-647482794);
		}
		this.method23107(arg0, local12, (byte) 1);
	}

	@OriginalMember(owner = "client!ano", name = "ad", descriptor = "()[D")
	double[] method23108() {
		return this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
	}

	@OriginalMember(owner = "client!ano", name = "ai", descriptor = "(FFF)F")
	abstract float method23109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		return this.method23080(-2136319272);
	}

	@OriginalMember(owner = "client!ano", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		return this.method23080(-1472503928);
	}

	@OriginalMember(owner = "client!ano", name = "ax", descriptor = "(I)[D")
	double[] method23110(@OriginalArg(0) int arg0) {
		return this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
	}

	@OriginalMember(owner = "client!ano", name = "q", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method23090(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat237 = 0.0F;
		this.aFloat238 = 0.0F;
		this.anInt3143 = 0;
		@Pc(12) int local12 = arg0.method23362(-950076313);
		this.aClass485Array8 = new Class485[local12];
		this.aFloatArray86 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array8[local22] = new Class485(arg0);
			this.aFloatArray86[local22] = arg0.method23188(-1818969397);
		}
		this.method23107(arg0, local12, (byte) 1);
	}

	@OriginalMember(owner = "client!ano", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public final void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-872524903);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23110(-2023184157);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ano", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public final void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-231063167);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23110(-2023184157);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ano", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public final void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-171830412);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23110(-2023184157);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ano", name = "ah", descriptor = "(Lclient!pk;IF)V")
	public final void method23111(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass485Array8 == null) {
			this.aClass485Array8 = new Class485[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray282 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class485[] local35 = new Class485[this.aClass485Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass485Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass485Array8.length + 1];
		System.arraycopy(this.aClass485Array8, 0, local35, 0, this.aClass485Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass485Array8.length);
		System.arraycopy(this.anIntArray282, 0, local49, 0, this.aClass485Array8.length);
		this.aClass485Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray282 = local49;
		this.aClass485Array8[this.aClass485Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray282[this.anIntArray282.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "af", descriptor = "(FF)V")
	void method23112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > arg1) {
			this.aFloat237 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "am", descriptor = "(FF)V")
	void method23113(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > arg1) {
			this.aFloat237 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "ak", descriptor = "(FF)V")
	void method23114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > arg1) {
			this.aFloat237 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "at", descriptor = "()[D")
	double[] method23115() {
		return this.aClass485Array8[this.anInt3143 * -169964755].method30053(this.aFloat237);
	}

	@OriginalMember(owner = "client!ano", name = "c", descriptor = "(FFFI)F")
	abstract float method23116(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);
}
