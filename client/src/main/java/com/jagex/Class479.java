package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public class Class479 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[Lclient!ph;")
	Class482[] aClass482Array1 = new Class482[1];

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "[F")
	float[] aFloatArray114 = new float[2];

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "(Lclient!ox;Lclient!ox;F)V", line = 10)
	void method29711(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class482[] local6 = new Class482[this.aClass482Array1.length + 1];
		System.arraycopy(this.aClass482Array1, 0, local6, 0, this.aClass482Array1.length);
		@Pc(19) Class482 local19 = new Class482();
		@Pc(28) Class482 local28 = this.aClass482Array1[this.aClass482Array1.length - 1];
		local19.method29760(0, local28.method29765(3));
		@Pc(42) Class472 local42 = Class472.method29579(local28.method29765(3), local28.method29765(2));
		local19.method29760(1, Class472.method29573(local28.method29765(3), local42));
		local19.method29760(3, arg0);
		local19.method29760(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass482Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray114.length + 1];
		System.arraycopy(this.aFloatArray114, 0, local75, 0, this.aFloatArray114.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray114 = local75;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(Lclient!ox;Lclient!ox;F)V", line = 10)
	void method29712(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class482[] local6 = new Class482[this.aClass482Array1.length + 1];
		System.arraycopy(this.aClass482Array1, 0, local6, 0, this.aClass482Array1.length);
		@Pc(19) Class482 local19 = new Class482();
		@Pc(28) Class482 local28 = this.aClass482Array1[this.aClass482Array1.length - 1];
		local19.method29760(0, local28.method29765(3));
		@Pc(42) Class472 local42 = Class472.method29579(local28.method29765(3), local28.method29765(2));
		local19.method29760(1, Class472.method29573(local28.method29765(3), local42));
		local19.method29760(3, arg0);
		local19.method29760(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass482Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray114.length + 1];
		System.arraycopy(this.aFloatArray114, 0, local75, 0, this.aFloatArray114.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray114 = local75;
	}

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "(Lclient!ox;Lclient!ox;F)V", line = 10)
	void method29713(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class482[] local6 = new Class482[this.aClass482Array1.length + 1];
		System.arraycopy(this.aClass482Array1, 0, local6, 0, this.aClass482Array1.length);
		@Pc(19) Class482 local19 = new Class482();
		@Pc(28) Class482 local28 = this.aClass482Array1[this.aClass482Array1.length - 1];
		local19.method29760(0, local28.method29765(3));
		@Pc(42) Class472 local42 = Class472.method29579(local28.method29765(3), local28.method29765(2));
		local19.method29760(1, Class472.method29573(local28.method29765(3), local42));
		local19.method29760(3, arg0);
		local19.method29760(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass482Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray114.length + 1];
		System.arraycopy(this.aFloatArray114, 0, local75, 0, this.aFloatArray114.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray114 = local75;
	}

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "()I", line = 28)
	public int method29714() {
		return this.aClass482Array1.length;
	}

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "()F", line = 32)
	public float method29715() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass482Array1.length; local3++) {
			local1 += this.aClass482Array1[local3].method29771();
		}
		return local1;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()F", line = 32)
	public float method29716() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass482Array1.length; local3++) {
			local1 += this.aClass482Array1[local3].method29771();
		}
		return local1;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()F", line = 32)
	public float method29717() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass482Array1.length; local3++) {
			local1 += this.aClass482Array1[local3].method29771();
		}
		return local1;
	}

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "(F)[D", line = 40)
	public double[] method29718(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass482Array1.length; local5++) {
			local3 += this.aClass482Array1[local5].method29771();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass482Array1[local5].method29773(arg0 - local1);
				return this.aClass482Array1[local5].method29770(local31);
			}
			local1 = local3;
		}
		return this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "(F)[D", line = 40)
	public double[] method29719(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass482Array1.length; local5++) {
			local3 += this.aClass482Array1[local5].method29771();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass482Array1[local5].method29773(arg0 - local1);
				return this.aClass482Array1[local5].method29770(local31);
			}
			local1 = local3;
		}
		return this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "(F)[D", line = 40)
	public double[] method29720(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass482Array1.length; local5++) {
			local3 += this.aClass482Array1[local5].method29771();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass482Array1[local5].method29773(arg0 - local1);
				return this.aClass482Array1[local5].method29770(local31);
			}
			local1 = local3;
		}
		return this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "(F)[D", line = 40)
	public double[] method29721(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass482Array1.length; local5++) {
			local3 += this.aClass482Array1[local5].method29771();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass482Array1[local5].method29773(arg0 - local1);
				return this.aClass482Array1[local5].method29770(local31);
			}
			local1 = local3;
		}
		return this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(F)F", line = 54)
	public float method29722(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass482Array1.length; local5++) {
			local3 += this.aClass482Array1[local5].method29771();
			if (arg0 < local3) {
				return this.aClass482Array1[local5].method29773(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass482Array1.length;
	}

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "(F)[D", line = 65)
	public double[] method29723(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass482Array1.length ? this.aClass482Array1[local2].method29770(arg0 - (float) local2) : this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "(F)[D", line = 65)
	public double[] method29724(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass482Array1.length ? this.aClass482Array1[local2].method29770(arg0 - (float) local2) : this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "(F)[D", line = 65)
	public double[] method29725(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass482Array1.length ? this.aClass482Array1[local2].method29770(arg0 - (float) local2) : this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "(F)[D", line = 65)
	public double[] method29726(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass482Array1.length ? this.aClass482Array1[local2].method29770(arg0 - (float) local2) : this.aClass482Array1[this.aClass482Array1.length - 1].method29770(1.0F);
	}

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "(F)F", line = 71)
	public float method29727(@OriginalArg(0) float arg0) {
		return this.method29728(this.method29722(arg0));
	}

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "(F)F", line = 75)
	public float method29728(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray114.length) {
			@Pc(14) float local14 = this.aFloatArray114[local2];
			@Pc(21) float local21 = this.aFloatArray114[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray114[this.aFloatArray114.length - 1];
		}
	}

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "(F)F", line = 75)
	public float method29729(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray114.length) {
			@Pc(14) float local14 = this.aFloatArray114[local2];
			@Pc(21) float local21 = this.aFloatArray114[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray114[this.aFloatArray114.length - 1];
		}
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!alw;)V", line = 85)
	public Class479(@OriginalArg(0) Packet arg0) {
		@Pc(13) int local13 = arg0.gSmart1or2((byte) -12);
		this.aClass482Array1[0] = new Class482();
		this.aClass482Array1[0].method29760(0, Class472.method29542(arg0));
		this.aClass482Array1[0].method29760(1, Class472.method29542(arg0));
		this.aFloatArray114[0] = arg0.gFloat(1887624564);
		@Pc(46) Class472 local46 = Class472.method29542(arg0);
		@Pc(49) Class472 local49 = Class472.method29542(arg0);
		@Pc(53) Class472 local53 = Class472.method29579(local46, local49);
		local49.method29544();
		local53.method29567(local46);
		this.aClass482Array1[0].method29760(3, local46);
		this.aClass482Array1[0].method29760(2, local53);
		this.aFloatArray114[1] = arg0.gFloat(-2041242817);
		for (@Pc(83) int local83 = 2; local83 < local13; local83++) {
			@Pc(89) Class472 local89 = Class472.method29542(arg0);
			@Pc(92) Class472 local92 = Class472.method29542(arg0);
			@Pc(96) Class472 local96 = Class472.method29579(local89, local92);
			local92.method29544();
			local96.method29567(local89);
			this.method29712(local89, local96, arg0.gFloat(1704471531));
		}
	}
}
