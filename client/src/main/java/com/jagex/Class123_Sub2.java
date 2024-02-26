package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahk")
public abstract class Class123_Sub2 extends Class123 {

	@OriginalMember(owner = "client!ahk", name = "f", descriptor = "[Lclient!pk;")
	Class485[] aClass485Array5;

	@OriginalMember(owner = "client!ahk", name = "e", descriptor = "[F")
	float[] aFloatArray62;

	@OriginalMember(owner = "client!ahk", name = "i", descriptor = "[I")
	int[] anIntArray258;

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "I")
	int anInt2881 = 0;

	@OriginalMember(owner = "client!ahk", name = "l", descriptor = "F")
	float aFloat198 = 0.0F;

	@OriginalMember(owner = "client!ahk", name = "g", descriptor = "F")
	float aFloat199 = 0.0F;

	@OriginalMember(owner = "client!ahk", name = "fa", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method20549(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean805 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 1716768518);
	}

	@OriginalMember(owner = "client!ahk", name = "<init>", descriptor = "(Lclient!jw;)V")
	Class123_Sub2(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahk", name = "a", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public final void method20509(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class485 local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
		if (this.aFloatArray62[this.anInt2881 * 1534111689] > 0.0F) {
			if (this.aFloatArray62[this.anInt2881 * 1534111689] >= arg0) {
				this.aFloatArray62[this.anInt2881 * 1534111689] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
			this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -126);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat198 >= local70) {
				if (this.anInt2881 * 1534111689 + 1 == this.aClass485Array5.length) {
					return;
				}
				if (this.aFloatArray62[this.anInt2881 * 1534111689 + 1] >= arg0) {
					this.aFloatArray62[this.anInt2881 * 1534111689 + 1] -= arg0;
					return;
				}
				this.anInt2881 += -653354375;
				arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
				this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
				this.method20541((byte) 1);
				this.aFloat198 = 0.0F;
				this.aFloat199 = 0.0F;
				local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat198 < local70) {
				this.aFloat199 = this.method20530(local70, this.aFloat199, Math.min(arg0, local63), 1924629503);
				arg0 -= local63;
				this.method20529(this.aFloat199, local70, (byte) -95);
			}
		}
	}

	@OriginalMember(owner = "client!ahk", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20505() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahk", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method20516(@OriginalArg(0) int arg0) {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahk", name = "ay", descriptor = "(FFB)V")
	void method20529(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		this.aFloat198 += arg0;
		if (this.aFloat198 > arg1) {
			this.aFloat198 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "ai", descriptor = "(FFFI)F")
	abstract float method20530(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ahk", name = "t", descriptor = "(F[[[ILclient!qc;IIS)V")
	@Override
	public final void method20499(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5) {
		@Pc(7) Class485 local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
		if (this.aFloatArray62[this.anInt2881 * 1534111689] > 0.0F) {
			if (this.aFloatArray62[this.anInt2881 * 1534111689] >= arg0) {
				this.aFloatArray62[this.anInt2881 * 1534111689] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
			this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -100);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat198 >= local70) {
				if (this.anInt2881 * 1534111689 + 1 == this.aClass485Array5.length) {
					return;
				}
				if (this.aFloatArray62[this.anInt2881 * 1534111689 + 1] >= arg0) {
					this.aFloatArray62[this.anInt2881 * 1534111689 + 1] -= arg0;
					return;
				}
				this.anInt2881 += -653354375;
				arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
				this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
				this.method20541((byte) 1);
				this.aFloat198 = 0.0F;
				this.aFloat199 = 0.0F;
				local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat198 < local70) {
				this.aFloat199 = this.method20530(local70, this.aFloat199, Math.min(arg0, local63), 1233823841);
				arg0 -= local63;
				this.method20529(this.aFloat199, local70, (byte) -71);
			}
		}
	}

	@OriginalMember(owner = "client!ahk", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method20500(@OriginalArg(0) int arg0) {
		return this.aClass485Array5 != null;
	}

	@OriginalMember(owner = "client!ahk", name = "ab", descriptor = "()V")
	abstract void method20531();

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "(I)[D")
	@Override
	public double[] method20502(@OriginalArg(0) int arg0) {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "av", descriptor = "()F")
	public float method20532() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30037(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "ao", descriptor = "(B)F")
	public float method20533(@OriginalArg(0) byte arg0) {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30037(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "g", descriptor = "(B)F")
	@Override
	public float method20504(@OriginalArg(0) byte arg0) {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30038(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "i", descriptor = "(Lclient!jl;IIB)V")
	@Override
	public final void method20518(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class463 local3 = this.method20516(1436604136);
		arg0.anInt4494 = ((int) local3.aFloat297 - arg1) * -628823913;
		arg0.anInt4495 = (int) -local3.aFloat295 * 391913553;
		arg0.anInt4496 = ((int) local3.aFloat296 - arg2) * 1873294199;
	}

	@OriginalMember(owner = "client!ahk", name = "m", descriptor = "(Lclient!ald;I)V")
	@Override
	public final void method20506(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloat198 = 0.0F;
		this.aFloat199 = 0.0F;
		this.anInt2881 = 0;
		@Pc(12) int local12 = arg0.g1();
		this.aClass485Array5 = new Class485[local12];
		this.aFloatArray62 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array5[local22] = new Class485(arg0);
			this.aFloatArray62[local22] = arg0.gFloat();
		}
		this.method20534(arg0, local12, (byte) -109);
	}

	@OriginalMember(owner = "client!ahk", name = "aj", descriptor = "(Lclient!ald;IB)V")
	abstract void method20534(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!ahk", name = "ac", descriptor = "(FFF)F")
	abstract float method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahk", name = "ag", descriptor = "()V")
	abstract void method20536();

	@OriginalMember(owner = "client!ahk", name = "al", descriptor = "()V")
	abstract void method20537();

	@OriginalMember(owner = "client!ahk", name = "ah", descriptor = "()V")
	abstract void method20538();

	@OriginalMember(owner = "client!ahk", name = "af", descriptor = "(Lclient!ald;I)V")
	abstract void method20539(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahk", name = "am", descriptor = "(Lclient!ald;I)V")
	abstract void method20540(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahk", name = "y", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method20517(@OriginalArg(0) Packet arg0) {
		this.aFloat198 = 0.0F;
		this.aFloat199 = 0.0F;
		this.anInt2881 = 0;
		@Pc(12) int local12 = arg0.g1();
		this.aClass485Array5 = new Class485[local12];
		this.aFloatArray62 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array5[local22] = new Class485(arg0);
			this.aFloatArray62[local22] = arg0.gFloat();
		}
		this.method20534(arg0, local12, (byte) -60);
	}

	@OriginalMember(owner = "client!ahk", name = "o", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public final void method20498(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class485 local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
		if (this.aFloatArray62[this.anInt2881 * 1534111689] > 0.0F) {
			if (this.aFloatArray62[this.anInt2881 * 1534111689] >= arg0) {
				this.aFloatArray62[this.anInt2881 * 1534111689] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
			this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -89);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat198 >= local70) {
				if (this.anInt2881 * 1534111689 + 1 == this.aClass485Array5.length) {
					return;
				}
				if (this.aFloatArray62[this.anInt2881 * 1534111689 + 1] >= arg0) {
					this.aFloatArray62[this.anInt2881 * 1534111689 + 1] -= arg0;
					return;
				}
				this.anInt2881 += -653354375;
				arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
				this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
				this.method20541((byte) 1);
				this.aFloat198 = 0.0F;
				this.aFloat199 = 0.0F;
				local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat198 < local70) {
				this.aFloat199 = this.method20530(local70, this.aFloat199, Math.min(arg0, local63), 1406605781);
				arg0 -= local63;
				this.method20529(this.aFloat199, local70, (byte) -88);
			}
		}
	}

	@OriginalMember(owner = "client!ahk", name = "j", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public final void method20508(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class485 local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
		if (this.aFloatArray62[this.anInt2881 * 1534111689] > 0.0F) {
			if (this.aFloatArray62[this.anInt2881 * 1534111689] >= arg0) {
				this.aFloatArray62[this.anInt2881 * 1534111689] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
			this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class165_Sub11.method16047((byte) -118);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method30054();
			if (this.aFloat198 >= local70) {
				if (this.anInt2881 * 1534111689 + 1 == this.aClass485Array5.length) {
					return;
				}
				if (this.aFloatArray62[this.anInt2881 * 1534111689 + 1] >= arg0) {
					this.aFloatArray62[this.anInt2881 * 1534111689 + 1] -= arg0;
					return;
				}
				this.anInt2881 += -653354375;
				arg0 -= this.aFloatArray62[this.anInt2881 * 1534111689];
				this.aFloatArray62[this.anInt2881 * 1534111689] = 0.0F;
				this.method20541((byte) 1);
				this.aFloat198 = 0.0F;
				this.aFloat199 = 0.0F;
				local7 = this.aClass485Array5[this.anInt2881 * 1534111689];
				local70 = local7.method30054();
			}
			while (arg0 > 0.0F && this.aFloat198 < local70) {
				this.aFloat199 = this.method20530(local70, this.aFloat199, Math.min(arg0, local63), 1634990372);
				arg0 -= local63;
				this.method20529(this.aFloat199, local70, (byte) -2);
			}
		}
	}

	@OriginalMember(owner = "client!ahk", name = "aq", descriptor = "(B)V")
	abstract void method20541(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ahk", name = "s", descriptor = "()Z")
	@Override
	public final boolean method20510() {
		return this.aClass485Array5 != null;
	}

	@OriginalMember(owner = "client!ahk", name = "l", descriptor = "(B)Lclient!akx;")
	@Override
	public final Class80_Sub33 method20519(@OriginalArg(0) byte arg0) {
		@Pc(3) Class463 local3 = this.method20516(1436604136);
		return new Class80_Sub33(0, (int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296);
	}

	@OriginalMember(owner = "client!ahk", name = "k", descriptor = "()Z")
	@Override
	public final boolean method20511() {
		return this.aClass485Array5 != null;
	}

	@OriginalMember(owner = "client!ahk", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20512() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahk", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20513() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahk", name = "q", descriptor = "()[D")
	@Override
	public double[] method20520() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "h", descriptor = "()[D")
	@Override
	public double[] method20515() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "d", descriptor = "()[D")
	@Override
	public double[] method20514() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "z", descriptor = "()[D")
	@Override
	public double[] method20503() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30053(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "p", descriptor = "()Lclient!akx;")
	@Override
	public final Class80_Sub33 method20507() {
		@Pc(3) Class463 local3 = this.method20516(1436604136);
		return new Class80_Sub33(0, (int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296);
	}

	@OriginalMember(owner = "client!ahk", name = "v", descriptor = "()F")
	@Override
	public float method20501() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30038(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "ax", descriptor = "(Lclient!pk;IFI)V")
	public final void method20542(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		if (this.aClass485Array5 == null) {
			this.aClass485Array5 = new Class485[] { arg0 };
			this.aFloatArray62 = new float[] { arg2 };
			this.anIntArray258 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class485[] local34 = new Class485[this.aClass485Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass485Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass485Array5.length + 1];
		System.arraycopy(this.aClass485Array5, 0, local34, 0, this.aClass485Array5.length);
		System.arraycopy(this.aFloatArray62, 0, local41, 0, this.aClass485Array5.length);
		System.arraycopy(this.anIntArray258, 0, local48, 0, this.aClass485Array5.length);
		this.aClass485Array5 = local34;
		this.aFloatArray62 = local41;
		this.anIntArray258 = local48;
		this.aClass485Array5[this.aClass485Array5.length - 1] = arg0;
		this.aFloatArray62[this.aFloatArray62.length - 1] = arg2;
		this.anIntArray258[this.anIntArray258.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahk", name = "n", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method20521(@OriginalArg(0) Packet arg0) {
		this.aFloat198 = 0.0F;
		this.aFloat199 = 0.0F;
		this.anInt2881 = 0;
		@Pc(12) int local12 = arg0.g1();
		this.aClass485Array5 = new Class485[local12];
		this.aFloatArray62 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array5[local22] = new Class485(arg0);
			this.aFloatArray62[local22] = arg0.gFloat();
		}
		this.method20534(arg0, local12, (byte) -61);
	}

	@OriginalMember(owner = "client!ahk", name = "c", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method20522(@OriginalArg(0) Packet arg0) {
		this.aFloat198 = 0.0F;
		this.aFloat199 = 0.0F;
		this.anInt2881 = 0;
		@Pc(12) int local12 = arg0.g1();
		this.aClass485Array5 = new Class485[local12];
		this.aFloatArray62 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass485Array5[local22] = new Class485(arg0);
			this.aFloatArray62[local22] = arg0.gFloat();
		}
		this.method20534(arg0, local12, (byte) -38);
	}

	@OriginalMember(owner = "client!ahk", name = "b", descriptor = "(Lclient!jl;II)V")
	@Override
	public final void method20523(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class463 local3 = this.method20516(1436604136);
		arg0.anInt4494 = ((int) local3.aFloat297 - arg1) * -628823913;
		arg0.anInt4495 = (int) -local3.aFloat295 * 391913553;
		arg0.anInt4496 = ((int) local3.aFloat296 - arg2) * 1873294199;
	}

	@OriginalMember(owner = "client!ahk", name = "at", descriptor = "(FF)V")
	void method20543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat198 += arg0;
		if (this.aFloat198 > arg1) {
			this.aFloat198 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "ad", descriptor = "()F")
	public float method20544() {
		return this.aClass485Array5[this.anInt2881 * 1534111689].method30037(this.aFloat198);
	}

	@OriginalMember(owner = "client!ahk", name = "an", descriptor = "(Lclient!pk;IF)V")
	public final void method20545(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass485Array5 == null) {
			this.aClass485Array5 = new Class485[] { arg0 };
			this.aFloatArray62 = new float[] { arg2 };
			this.anIntArray258 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class485[] local34 = new Class485[this.aClass485Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass485Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass485Array5.length + 1];
		System.arraycopy(this.aClass485Array5, 0, local34, 0, this.aClass485Array5.length);
		System.arraycopy(this.aFloatArray62, 0, local41, 0, this.aClass485Array5.length);
		System.arraycopy(this.anIntArray258, 0, local48, 0, this.aClass485Array5.length);
		this.aClass485Array5 = local34;
		this.aFloatArray62 = local41;
		this.anIntArray258 = local48;
		this.aClass485Array5[this.aClass485Array5.length - 1] = arg0;
		this.aFloatArray62[this.aFloatArray62.length - 1] = arg2;
		this.anIntArray258[this.anIntArray258.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahk", name = "ak", descriptor = "(Lclient!ald;I)V")
	abstract void method20546(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahk", name = "aa", descriptor = "(Lclient!pk;IF)V")
	public final void method20547(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass485Array5 == null) {
			this.aClass485Array5 = new Class485[] { arg0 };
			this.aFloatArray62 = new float[] { arg2 };
			this.anIntArray258 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class485[] local34 = new Class485[this.aClass485Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass485Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass485Array5.length + 1];
		System.arraycopy(this.aClass485Array5, 0, local34, 0, this.aClass485Array5.length);
		System.arraycopy(this.aFloatArray62, 0, local41, 0, this.aClass485Array5.length);
		System.arraycopy(this.anIntArray258, 0, local48, 0, this.aClass485Array5.length);
		this.aClass485Array5 = local34;
		this.aFloatArray62 = local41;
		this.anIntArray258 = local48;
		this.aClass485Array5[this.aClass485Array5.length - 1] = arg0;
		this.aFloatArray62[this.aFloatArray62.length - 1] = arg2;
		this.anIntArray258[this.anIntArray258.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahk", name = "ae", descriptor = "(Lclient!pk;IF)V")
	public final void method20548(@OriginalArg(0) Class485 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass485Array5 == null) {
			this.aClass485Array5 = new Class485[] { arg0 };
			this.aFloatArray62 = new float[] { arg2 };
			this.anIntArray258 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class485[] local34 = new Class485[this.aClass485Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass485Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass485Array5.length + 1];
		System.arraycopy(this.aClass485Array5, 0, local34, 0, this.aClass485Array5.length);
		System.arraycopy(this.aFloatArray62, 0, local41, 0, this.aClass485Array5.length);
		System.arraycopy(this.anIntArray258, 0, local48, 0, this.aClass485Array5.length);
		this.aClass485Array5 = local34;
		this.aFloatArray62 = local41;
		this.anIntArray258 = local48;
		this.aClass485Array5[this.aClass485Array5.length - 1] = arg0;
		this.aFloatArray62[this.aFloatArray62.length - 1] = arg2;
		this.anIntArray258[this.anIntArray258.length - 1] = arg1;
	}
}
