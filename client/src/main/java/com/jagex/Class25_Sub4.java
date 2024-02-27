package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ano")
public abstract class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "[I")
	int[] anIntArray268;

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "[F")
	float[] aFloatArray75;

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "[Lclient!pe;")
	Class479[] aClass479Array8;

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "I")
	int anInt3161 = 0;

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "F")
	float aFloat229 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "F")
	float aFloat228 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!je;)V")
	Class25_Sub4(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V")
	@Override
	public final void method23135(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23155(1311462755);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29709();
		local56.aFloat325 = (float) (local24[0] - local4[0]);
		local56.aFloat326 = (float) (local24[1] - local4[1]);
		local56.aFloat327 = (float) (local24[2] - local4[2]);
		local56.method29740();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29646(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29814(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29814(local105, local56);
		local109.method29753(local92);
		arg1.method29549(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat325, local109.aFloat326, local109.aFloat327);
		local109.method29713();
	}

	@OriginalMember(owner = "client!ano", name = "q", descriptor = "(Lclient!pe;IFI)V")
	public final void method23150(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		if (this.aClass479Array8 == null) {
			this.aClass479Array8 = new Class479[] { arg0 };
			this.aFloatArray75 = new float[] { arg2 };
			this.anIntArray268 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class479[] local34 = new Class479[this.aClass479Array8.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass479Array8.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass479Array8.length + 1];
		System.arraycopy(this.aClass479Array8, 0, local34, 0, this.aClass479Array8.length);
		System.arraycopy(this.aFloatArray75, 0, local41, 0, this.aClass479Array8.length);
		System.arraycopy(this.anIntArray268, 0, local48, 0, this.aClass479Array8.length);
		this.aClass479Array8 = local34;
		this.aFloatArray75 = local41;
		this.anIntArray268 = local48;
		this.aClass479Array8[this.aClass479Array8.length - 1] = arg0;
		this.aFloatArray75[this.aFloatArray75.length - 1] = arg2;
		this.anIntArray268[this.anIntArray268.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "ac", descriptor = "()V")
	abstract void method23151();

	@OriginalMember(owner = "client!ano", name = "x", descriptor = "(FFI)V")
	void method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "b", descriptor = "(FFFI)F")
	abstract float method23153(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ano", name = "h", descriptor = "(I)V")
	abstract void method23154(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "(I)Z")
	@Override
	public final boolean method23144(@OriginalArg(0) int arg0) {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "e", descriptor = "(FB)V")
	@Override
	public final void method23130(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23154(-2143531548);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23153(local70, this.aFloat228, Math.min(arg0, local63), -110588198);
				arg0 -= local63;
				this.method23152(this.aFloat228, local70, 46267913);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "a", descriptor = "(I)[D")
	double[] method23155(@OriginalArg(0) int arg0) {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23134(@OriginalArg(0) int arg0) {
		return this.method23132(-1555544944);
	}

	@OriginalMember(owner = "client!ano", name = "al", descriptor = "()V")
	abstract void method23156();

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "(Lclient!alw;IB)V")
	abstract void method23157(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "(FFF)F")
	abstract float method23158(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "(Lclient!alw;I)V")
	@Override
	public final void method23131(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22437(-272556746);
		}
		this.method23157(arg0, local12, (byte) -41);
	}

	@OriginalMember(owner = "client!ano", name = "t", descriptor = "(Lclient!alw;I)V")
	abstract void method23159(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "(F)V")
	@Override
	public final void method23140(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23154(-2064751508);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23153(local70, this.aFloat228, Math.min(arg0, local63), -789688681);
				arg0 -= local63;
				this.method23152(this.aFloat228, local70, 1370732581);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "u", descriptor = "(F)V")
	@Override
	public final void method23136(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23154(-2079348341);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23153(local70, this.aFloat228, Math.min(arg0, local63), -1000844591);
				arg0 -= local63;
				this.method23152(this.aFloat228, local70, 145797301);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "d", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23139() {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23132(@OriginalArg(0) int arg0) {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "ag", descriptor = "(FF)V")
	void method23160(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "c", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method23133(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22437(-579811592);
		}
		this.method23157(arg0, local12, (byte) -66);
	}

	@OriginalMember(owner = "client!ano", name = "r", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method23141(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22437(1360730707);
		}
		this.method23157(arg0, local12, (byte) -13);
	}

	@OriginalMember(owner = "client!ano", name = "v", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method23142(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22437(-1965586151);
		}
		this.method23157(arg0, local12, (byte) -91);
	}

	@OriginalMember(owner = "client!ano", name = "o", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method23143(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22437(850641713);
		}
		this.method23157(arg0, local12, (byte) 45);
	}

	@OriginalMember(owner = "client!ano", name = "s", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23129() {
		return this.method23132(1202176632);
	}

	@OriginalMember(owner = "client!ano", name = "j", descriptor = "(Lclient!alw;I)V")
	abstract void method23161(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "ae", descriptor = "(Lclient!pe;IF)V")
	public final void method23162(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array8 == null) {
			this.aClass479Array8 = new Class479[] { arg0 };
			this.aFloatArray75 = new float[] { arg2 };
			this.anIntArray268 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class479[] local34 = new Class479[this.aClass479Array8.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass479Array8.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass479Array8.length + 1];
		System.arraycopy(this.aClass479Array8, 0, local34, 0, this.aClass479Array8.length);
		System.arraycopy(this.aFloatArray75, 0, local41, 0, this.aClass479Array8.length);
		System.arraycopy(this.anIntArray268, 0, local48, 0, this.aClass479Array8.length);
		this.aClass479Array8 = local34;
		this.aFloatArray75 = local41;
		this.anIntArray268 = local48;
		this.aClass479Array8[this.aClass479Array8.length - 1] = arg0;
		this.aFloatArray75[this.aFloatArray75.length - 1] = arg2;
		this.anIntArray268[this.anIntArray268.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V")
	@Override
	public final void method23138(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23155(1541271064);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29709();
		local56.aFloat325 = (float) (local24[0] - local4[0]);
		local56.aFloat326 = (float) (local24[1] - local4[1]);
		local56.aFloat327 = (float) (local24[2] - local4[2]);
		local56.method29740();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29646(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29814(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29814(local105, local56);
		local109.method29753(local92);
		arg1.method29549(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat325, local109.aFloat326, local109.aFloat327);
		local109.method29713();
	}

	@OriginalMember(owner = "client!ano", name = "ah", descriptor = "(FF)V")
	void method23163(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "y", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23145() {
		return this.method23132(-262267390);
	}

	@OriginalMember(owner = "client!ano", name = "z", descriptor = "()Z")
	@Override
	public final boolean method23137() {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "ai", descriptor = "()[D")
	double[] method23164() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "aw", descriptor = "()[D")
	double[] method23165() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "as", descriptor = "()[D")
	double[] method23166() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29895(this.aFloat229);
	}
}
