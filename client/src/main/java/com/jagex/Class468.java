package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class468 {

	@OriginalMember(owner = "client!os", name = "t", descriptor = "[F")
	public float[] aFloatArray107 = new float[9];

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class468() {
		this.method29730();
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "()Lclient!oq;")
	public Class466 method29729() {
		@Pc(3) Class466 local3 = new Class466();
		@Pc(21) double local21 = (double) (this.aFloatArray107[0] + 1.0F + this.aFloatArray107[4] + this.aFloatArray107[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
			local3.aFloat299 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
			local3.aFloat300 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
			local3.aFloat298 = local31 * 0.25F;
		} else if (this.aFloatArray107[0] > this.aFloatArray107[4] && this.aFloatArray107[0] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[0] + 1.0F - this.aFloatArray107[4] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = local31 * 0.25F;
			local3.aFloat299 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat300 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat298 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
		} else if (this.aFloatArray107[4] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[4] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat299 = local31 * 0.25F;
			local3.aFloat300 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat298 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[8] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[4])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat299 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat300 = local31 * 0.25F;
			local3.aFloat298 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "()V")
	void method29730() {
		this.aFloatArray107[0] = 1.0F;
		this.aFloatArray107[1] = 0.0F;
		this.aFloatArray107[2] = 0.0F;
		this.aFloatArray107[3] = 0.0F;
		this.aFloatArray107[4] = 1.0F;
		this.aFloatArray107[5] = 0.0F;
		this.aFloatArray107[6] = 0.0F;
		this.aFloatArray107[7] = 0.0F;
		this.aFloatArray107[8] = 1.0F;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()Lclient!oq;")
	public Class466 method29731() {
		@Pc(3) Class466 local3 = new Class466();
		@Pc(21) double local21 = (double) (this.aFloatArray107[0] + 1.0F + this.aFloatArray107[4] + this.aFloatArray107[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
			local3.aFloat299 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
			local3.aFloat300 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
			local3.aFloat298 = local31 * 0.25F;
		} else if (this.aFloatArray107[0] > this.aFloatArray107[4] && this.aFloatArray107[0] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[0] + 1.0F - this.aFloatArray107[4] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = local31 * 0.25F;
			local3.aFloat299 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat300 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat298 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
		} else if (this.aFloatArray107[4] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[4] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat299 = local31 * 0.25F;
			local3.aFloat300 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat298 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[8] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[4])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat299 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat300 = local31 * 0.25F;
			local3.aFloat298 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "()V")
	void method29732() {
		this.aFloatArray107[0] = 1.0F;
		this.aFloatArray107[1] = 0.0F;
		this.aFloatArray107[2] = 0.0F;
		this.aFloatArray107[3] = 0.0F;
		this.aFloatArray107[4] = 1.0F;
		this.aFloatArray107[5] = 0.0F;
		this.aFloatArray107[6] = 0.0F;
		this.aFloatArray107[7] = 0.0F;
		this.aFloatArray107[8] = 1.0F;
	}

	@OriginalMember(owner = "client!os", name = "u", descriptor = "()Lclient!oq;")
	public Class466 method29733() {
		@Pc(3) Class466 local3 = new Class466();
		@Pc(21) double local21 = (double) (this.aFloatArray107[0] + 1.0F + this.aFloatArray107[4] + this.aFloatArray107[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
			local3.aFloat299 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
			local3.aFloat300 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
			local3.aFloat298 = local31 * 0.25F;
		} else if (this.aFloatArray107[0] > this.aFloatArray107[4] && this.aFloatArray107[0] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[0] + 1.0F - this.aFloatArray107[4] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = local31 * 0.25F;
			local3.aFloat299 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat300 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat298 = (this.aFloatArray107[7] - this.aFloatArray107[5]) / local31;
		} else if (this.aFloatArray107[4] > this.aFloatArray107[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[4] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[8])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[3] + this.aFloatArray107[1]) / local31;
			local3.aFloat299 = local31 * 0.25F;
			local3.aFloat300 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat298 = (this.aFloatArray107[2] - this.aFloatArray107[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray107[8] + 1.0F - this.aFloatArray107[0] - this.aFloatArray107[4])) * 2.0D);
			local3.aFloat301 = (this.aFloatArray107[2] + this.aFloatArray107[6]) / local31;
			local3.aFloat299 = (this.aFloatArray107[7] + this.aFloatArray107[5]) / local31;
			local3.aFloat300 = local31 * 0.25F;
			local3.aFloat298 = (this.aFloatArray107[3] - this.aFloatArray107[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "()V")
	void method29734() {
		this.aFloatArray107[0] = 1.0F;
		this.aFloatArray107[1] = 0.0F;
		this.aFloatArray107[2] = 0.0F;
		this.aFloatArray107[3] = 0.0F;
		this.aFloatArray107[4] = 1.0F;
		this.aFloatArray107[5] = 0.0F;
		this.aFloatArray107[6] = 0.0F;
		this.aFloatArray107[7] = 0.0F;
		this.aFloatArray107[8] = 1.0F;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "()V")
	void method29735() {
		this.aFloatArray107[0] = 1.0F;
		this.aFloatArray107[1] = 0.0F;
		this.aFloatArray107[2] = 0.0F;
		this.aFloatArray107[3] = 0.0F;
		this.aFloatArray107[4] = 1.0F;
		this.aFloatArray107[5] = 0.0F;
		this.aFloatArray107[6] = 0.0F;
		this.aFloatArray107[7] = 0.0F;
		this.aFloatArray107[8] = 1.0F;
	}
}
