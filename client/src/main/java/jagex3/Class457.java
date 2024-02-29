package jagex3;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class457 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[F")
	public float[] aFloatArray108 = new float[9];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class457() {
		this.method29337();
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "()Lclient!ov;")
	public Class471 method29335() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat323 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat324 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat321 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = local31 * 0.25F;
			local3.aFloat323 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat324 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat321 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat323 = local31 * 0.25F;
			local3.aFloat324 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat321 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat323 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat324 = local31 * 0.25F;
			local3.aFloat321 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()Lclient!ov;")
	public Class471 method29336() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat323 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat324 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat321 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = local31 * 0.25F;
			local3.aFloat323 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat324 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat321 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat323 = local31 * 0.25F;
			local3.aFloat324 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat321 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat323 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat324 = local31 * 0.25F;
			local3.aFloat321 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "()V")
	void method29337() {
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

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "()Lclient!ov;")
	public Class471 method29338() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat323 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat324 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat321 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = local31 * 0.25F;
			local3.aFloat323 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat324 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat321 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat323 = local31 * 0.25F;
			local3.aFloat324 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat321 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat323 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat324 = local31 * 0.25F;
			local3.aFloat321 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "()Lclient!ov;")
	public Class471 method29339() {
		@Pc(3) Class471 local3 = new Class471();
		@Pc(21) double local21 = (double) (this.aFloatArray108[0] + 1.0F + this.aFloatArray108[4] + this.aFloatArray108[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
			local3.aFloat323 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
			local3.aFloat324 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
			local3.aFloat321 = local31 * 0.25F;
		} else if (this.aFloatArray108[0] > this.aFloatArray108[4] && this.aFloatArray108[0] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[0] + 1.0F - this.aFloatArray108[4] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = local31 * 0.25F;
			local3.aFloat323 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat324 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat321 = (this.aFloatArray108[7] - this.aFloatArray108[5]) / local31;
		} else if (this.aFloatArray108[4] > this.aFloatArray108[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[4] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[8])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[3] + this.aFloatArray108[1]) / local31;
			local3.aFloat323 = local31 * 0.25F;
			local3.aFloat324 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat321 = (this.aFloatArray108[2] - this.aFloatArray108[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray108[8] + 1.0F - this.aFloatArray108[0] - this.aFloatArray108[4])) * 2.0D);
			local3.aFloat322 = (this.aFloatArray108[2] + this.aFloatArray108[6]) / local31;
			local3.aFloat323 = (this.aFloatArray108[7] + this.aFloatArray108[5]) / local31;
			local3.aFloat324 = local31 * 0.25F;
			local3.aFloat321 = (this.aFloatArray108[3] - this.aFloatArray108[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "()V")
	void method29340() {
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
