package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class457 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[F")
	public float[] aFloatArray108 = new float[9];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 6)
	public Class457() {
		this.method29158();
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "()Lclient!ov;", line = 11)
	public Class471 method29154() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat315 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat316 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat313 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = local31 * 0.25F;
			local3.aFloat315 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat316 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat313 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat315 = local31 * 0.25F;
			local3.aFloat316 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat313 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat315 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat316 = local31 * 0.25F;
			local3.aFloat313 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()Lclient!ov;", line = 11)
	public Class471 method29155() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat315 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat316 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat313 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = local31 * 0.25F;
			local3.aFloat315 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat316 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat313 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat315 = local31 * 0.25F;
			local3.aFloat316 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat313 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat315 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat316 = local31 * 0.25F;
			local3.aFloat313 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "()Lclient!ov;", line = 11)
	public Class471 method29156() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat315 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat316 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat313 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = local31 * 0.25F;
			local3.aFloat315 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat316 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat313 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat315 = local31 * 0.25F;
			local3.aFloat316 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat313 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat315 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat316 = local31 * 0.25F;
			local3.aFloat313 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "()Lclient!ov;", line = 11)
	public Class471 method29157() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat315 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat316 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat313 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = local31 * 0.25F;
			local3.aFloat315 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat316 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat313 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat315 = local31 * 0.25F;
			local3.aFloat316 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat313 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat314 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat315 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat316 = local31 * 0.25F;
			local3.aFloat313 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "()V", line = 47)
	void method29158() {
		this.aFloatArray108[0] = 1.0F;
		this.aFloatArray108[1] = 0.0F;
		this.aFloatArray108[2] = 0.0F;
		this.aFloatArray108[3] = 0.0F;
		this.aFloatArray108[4] = 1.0F;
		this.aFloatArray108[5] = 0.0F;
		this.aFloatArray108[6] = 0.0F;
		this.aFloatArray108[7] = 0.0F;
		this.aFloatArray108[8] = 1.0F;
	}

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "()V", line = 47)
	void method29159() {
		this.aFloatArray108[0] = 1.0F;
		this.aFloatArray108[1] = 0.0F;
		this.aFloatArray108[2] = 0.0F;
		this.aFloatArray108[3] = 0.0F;
		this.aFloatArray108[4] = 1.0F;
		this.aFloatArray108[5] = 0.0F;
		this.aFloatArray108[6] = 0.0F;
		this.aFloatArray108[7] = 0.0F;
		this.aFloatArray108[8] = 1.0F;
	}
}
