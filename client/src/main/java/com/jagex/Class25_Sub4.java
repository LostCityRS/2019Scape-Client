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

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!je;)V", line = 21)
	Class25_Sub4(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ano", name = "q", descriptor = "(Lclient!pe;IFI)V", line = 25)
	public void method23138(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
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

	@OriginalMember(owner = "client!ano", name = "ae", descriptor = "(Lclient!pe;IF)V", line = 25)
	public void method23139(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!ano", name = "e", descriptor = "(FB)V", line = 47)
	@Override
	public void method23122(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28950((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29715();
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
				this.method23149(-2143531548);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29715();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23148(local70, this.aFloat228, Math.min(arg0, local63), -110588198);
				arg0 -= local63;
				this.method23140(this.aFloat228, local70, 46267913);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "(F)V", line = 47)
	@Override
	public void method23132(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28950((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29715();
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
				this.method23149(-2064751508);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29715();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23148(local70, this.aFloat228, Math.min(arg0, local63), -789688681);
				arg0 -= local63;
				this.method23140(this.aFloat228, local70, 1370732581);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "u", descriptor = "(F)V", line = 47)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28950((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29715();
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
				this.method23149(-2079348341);
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29715();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23148(local70, this.aFloat228, Math.min(arg0, local63), -1000844591);
				arg0 -= local63;
				this.method23140(this.aFloat228, local70, 145797301);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "x", descriptor = "(FFI)V", line = 89)
	void method23140(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "ag", descriptor = "(FF)V", line = 89)
	void method23141(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "ah", descriptor = "(FF)V", line = 89)
	void method23142(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method23136(@OriginalArg(0) int arg0) {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "z", descriptor = "()Z", line = 97)
	@Override
	public boolean method23129() {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "d", descriptor = "()Lclient!ox;", line = 101)
	@Override
	public Class472 method23131() {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "(I)Lclient!ox;", line = 101)
	@Override
	public Class472 method23124(@OriginalArg(0) int arg0) {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "a", descriptor = "(I)[D", line = 110)
	double[] method23143(@OriginalArg(0) int arg0) {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "ai", descriptor = "()[D", line = 110)
	double[] method23144() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "aw", descriptor = "()[D", line = 110)
	double[] method23145() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "as", descriptor = "()[D", line = 110)
	double[] method23146() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29718(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "(I)Lclient!ox;", line = 114)
	@Override
	public Class472 method23126(@OriginalArg(0) int arg0) {
		return this.method23124(-1555544944);
	}

	@OriginalMember(owner = "client!ano", name = "s", descriptor = "()Lclient!ox;", line = 114)
	@Override
	public Class472 method23121() {
		return this.method23124(1202176632);
	}

	@OriginalMember(owner = "client!ano", name = "y", descriptor = "()Lclient!ox;", line = 114)
	@Override
	public Class472 method23137() {
		return this.method23124(-262267390);
	}

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 118)
	@Override
	public void method23127(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(4) double[] local4 = this.aClass123_16.method9029(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23143(1311462755);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29531();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29564();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29478(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29592(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29592(local105, local56);
		local109.method29623(local92);
		arg1.method29372(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29544();
	}

	@OriginalMember(owner = "client!ano", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 118)
	@Override
	public void method23130(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method9029(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23143(1541271064);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29531();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29564();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29478(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29592(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29592(local105, local56);
		local109.method29623(local92);
		arg1.method29372(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29544();
	}

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "(Lclient!alw;I)V", line = 142)
	@Override
	public void method23123(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.g1((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.gFloat(-272556746);
		}
		this.method23151(arg0, local12, (byte) -41);
	}

	@OriginalMember(owner = "client!ano", name = "c", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23125(@OriginalArg(0) Packet arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.g1((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.gFloat(-579811592);
		}
		this.method23151(arg0, local12, (byte) -66);
	}

	@OriginalMember(owner = "client!ano", name = "r", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23133(@OriginalArg(0) Packet arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.g1((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.gFloat(1360730707);
		}
		this.method23151(arg0, local12, (byte) -13);
	}

	@OriginalMember(owner = "client!ano", name = "v", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23134(@OriginalArg(0) Packet arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.g1((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.gFloat(-1965586151);
		}
		this.method23151(arg0, local12, (byte) -91);
	}

	@OriginalMember(owner = "client!ano", name = "o", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23135(@OriginalArg(0) Packet arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.g1((short) 16384);
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.gFloat(850641713);
		}
		this.method23151(arg0, local12, (byte) 45);
	}

	@OriginalMember(owner = "client!ano", name = "ac", descriptor = "()V")
	abstract void method23147();

	@OriginalMember(owner = "client!ano", name = "b", descriptor = "(FFFI)F")
	abstract float method23148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ano", name = "h", descriptor = "(I)V")
	abstract void method23149(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ano", name = "al", descriptor = "()V")
	abstract void method23150();

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "(Lclient!alw;IB)V")
	abstract void method23151(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "(FFF)F")
	abstract float method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "t", descriptor = "(Lclient!alw;I)V")
	abstract void method23153(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "j", descriptor = "(Lclient!alw;I)V")
	abstract void method23154(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);
}
