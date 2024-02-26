package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class485 {

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "[Lclient!px;")
	Class497[] aClass497Array1 = new Class497[1];

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "[F")
	float[] aFloatArray113 = new float[2];

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class485(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(13) int local13 = arg0.method23195(1797090904);
		this.aClass497Array1[0] = new Class497();
		this.aClass497Array1[0].method30328(0, Class463.method29552(arg0));
		this.aClass497Array1[0].method30328(1, Class463.method29552(arg0));
		this.aFloatArray113[0] = arg0.method23188(817874603);
		@Pc(46) Class463 local46 = Class463.method29552(arg0);
		@Pc(49) Class463 local49 = Class463.method29552(arg0);
		@Pc(53) Class463 local53 = Class463.method29487(local46, local49);
		local49.method29557();
		local53.method29483(local46);
		this.aClass497Array1[0].method30328(3, local46);
		this.aClass497Array1[0].method30328(2, local53);
		this.aFloatArray113[1] = arg0.method23188(1920222400);
		for (@Pc(83) int local83 = 2; local83 < local13; local83++) {
			@Pc(89) Class463 local89 = Class463.method29552(arg0);
			@Pc(92) Class463 local92 = Class463.method29552(arg0);
			@Pc(96) Class463 local96 = Class463.method29487(local89, local92);
			local92.method29557();
			local96.method29483(local89);
			this.method30032(local89, local96, arg0.method23188(-460221800));
		}
	}

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "(Lclient!on;Lclient!on;F)V")
	void method30032(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class497[] local6 = new Class497[this.aClass497Array1.length + 1];
		System.arraycopy(this.aClass497Array1, 0, local6, 0, this.aClass497Array1.length);
		@Pc(19) Class497 local19 = new Class497();
		@Pc(28) Class497 local28 = this.aClass497Array1[this.aClass497Array1.length - 1];
		local19.method30328(0, local28.method30327(3));
		@Pc(42) Class463 local42 = Class463.method29487(local28.method30327(3), local28.method30327(2));
		local19.method30328(1, Class463.method29485(local28.method30327(3), local42));
		local19.method30328(3, arg0);
		local19.method30328(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass497Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray113.length + 1];
		System.arraycopy(this.aFloatArray113, 0, local75, 0, this.aFloatArray113.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray113 = local75;
	}

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "(F)F")
	public float method30033(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray113.length) {
			@Pc(14) float local14 = this.aFloatArray113[local2];
			@Pc(21) float local21 = this.aFloatArray113[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray113[this.aFloatArray113.length - 1];
		}
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "()I")
	public int method30034() {
		return this.aClass497Array1.length;
	}

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "(F)[D")
	public double[] method30035(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass497Array1[local5].method30331(arg0 - local1);
				return this.aClass497Array1[local5].method30329(local31);
			}
			local1 = local3;
		}
		return this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "(F)F")
	public float method30036(@OriginalArg(0) float arg0) {
		return this.method30039(this.method30037(arg0));
	}

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "(F)F")
	public float method30037(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				return this.aClass497Array1[local5].method30331(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass497Array1.length;
	}

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "(F)F")
	public float method30038(@OriginalArg(0) float arg0) {
		return this.method30039(this.method30037(arg0));
	}

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "(F)F")
	public float method30039(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray113.length) {
			@Pc(14) float local14 = this.aFloatArray113[local2];
			@Pc(21) float local21 = this.aFloatArray113[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray113[this.aFloatArray113.length - 1];
		}
	}

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "(Lclient!on;Lclient!on;F)V")
	void method30040(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class497[] local6 = new Class497[this.aClass497Array1.length + 1];
		System.arraycopy(this.aClass497Array1, 0, local6, 0, this.aClass497Array1.length);
		@Pc(19) Class497 local19 = new Class497();
		@Pc(28) Class497 local28 = this.aClass497Array1[this.aClass497Array1.length - 1];
		local19.method30328(0, local28.method30327(3));
		@Pc(42) Class463 local42 = Class463.method29487(local28.method30327(3), local28.method30327(2));
		local19.method30328(1, Class463.method29485(local28.method30327(3), local42));
		local19.method30328(3, arg0);
		local19.method30328(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass497Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray113.length + 1];
		System.arraycopy(this.aFloatArray113, 0, local75, 0, this.aFloatArray113.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray113 = local75;
	}

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "(Lclient!on;Lclient!on;F)V")
	void method30041(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class497[] local6 = new Class497[this.aClass497Array1.length + 1];
		System.arraycopy(this.aClass497Array1, 0, local6, 0, this.aClass497Array1.length);
		@Pc(19) Class497 local19 = new Class497();
		@Pc(28) Class497 local28 = this.aClass497Array1[this.aClass497Array1.length - 1];
		local19.method30328(0, local28.method30327(3));
		@Pc(42) Class463 local42 = Class463.method29487(local28.method30327(3), local28.method30327(2));
		local19.method30328(1, Class463.method29485(local28.method30327(3), local42));
		local19.method30328(3, arg0);
		local19.method30328(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass497Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray113.length + 1];
		System.arraycopy(this.aFloatArray113, 0, local75, 0, this.aFloatArray113.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray113 = local75;
	}

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "(F)[D")
	public double[] method30042(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass497Array1[local5].method30331(arg0 - local1);
				return this.aClass497Array1[local5].method30329(local31);
			}
			local1 = local3;
		}
		return this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "()I")
	public int method30043() {
		return this.aClass497Array1.length;
	}

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "()F")
	public float method30044() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass497Array1.length; local3++) {
			local1 += this.aClass497Array1[local3].method30341();
		}
		return local1;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()I")
	public int method30045() {
		return this.aClass497Array1.length;
	}

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "(F)[D")
	public double[] method30046(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass497Array1[local5].method30331(arg0 - local1);
				return this.aClass497Array1[local5].method30329(local31);
			}
			local1 = local3;
		}
		return this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(F)[D")
	public double[] method30047(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass497Array1.length ? this.aClass497Array1[local2].method30329(arg0 - (float) local2) : this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "(F)F")
	public float method30048(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				return this.aClass497Array1[local5].method30331(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass497Array1.length;
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(F)[D")
	public double[] method30049(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass497Array1.length ? this.aClass497Array1[local2].method30329(arg0 - (float) local2) : this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(F)F")
	public float method30050(@OriginalArg(0) float arg0) {
		return this.method30039(this.method30037(arg0));
	}

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "(F)F")
	public float method30051(@OriginalArg(0) float arg0) {
		return this.method30039(this.method30037(arg0));
	}

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "(F)F")
	public float method30052(@OriginalArg(0) float arg0) {
		return this.method30039(this.method30037(arg0));
	}

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "(F)[D")
	public double[] method30053(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass497Array1.length; local5++) {
			local3 += this.aClass497Array1[local5].method30341();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass497Array1[local5].method30331(arg0 - local1);
				return this.aClass497Array1[local5].method30329(local31);
			}
			local1 = local3;
		}
		return this.aClass497Array1[this.aClass497Array1.length - 1].method30329(1.0F);
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "()F")
	public float method30054() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass497Array1.length; local3++) {
			local1 += this.aClass497Array1[local3].method30341();
		}
		return local1;
	}
}
