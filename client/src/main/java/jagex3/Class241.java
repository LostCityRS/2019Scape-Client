package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class241 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt3871;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt3872;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Z")
	public boolean aBoolean667 = false;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(II)Z")
	public boolean method25968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean667) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3869 - this.anInt3870;
		@Pc(16) int local16 = this.anInt3872 - this.anInt3871;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3870 * local10 + this.anInt3871 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3870 - arg0;
			local54 = this.anInt3871 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else if (local42 > local24) {
			local49 = this.anInt3869 - arg0;
			local54 = this.anInt3872 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3870 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3871 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3873 * this.anInt3873;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(II)Z")
	public boolean method25969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean667) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3869 - this.anInt3870;
		@Pc(16) int local16 = this.anInt3872 - this.anInt3871;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3870 * local10 + this.anInt3871 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3870 - arg0;
			local54 = this.anInt3871 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else if (local42 > local24) {
			local49 = this.anInt3869 - arg0;
			local54 = this.anInt3872 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3870 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3871 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3873 * this.anInt3873;
		}
	}

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "(Lclient!oj;Lclient!pq;Lclient!pq;FFFF)V")
	public void method25970(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean667 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat307 + arg0.aFloat304) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat303 + arg0.aFloat306) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat308;
		@Pc(59) float local59 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(88) float local88 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(117) float local117 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(146) float local146 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local117 >= -local146) {
			this.anInt3870 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3871 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat305;
		@Pc(211) float local211 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(240) float local240 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(269) float local269 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(298) float local298 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local269 >= -local298) {
			this.anInt3869 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3872 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean667 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3870 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3871 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3869 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3872 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean667) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat304 - arg0.aFloat307), 2.0D) + Math.pow((double) (arg0.aFloat306 - arg0.aFloat303), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local146 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3873 = (int) (arg3 - (float) this.anInt3870 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local298 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3873 = (int) (arg3 - (float) this.anInt3869 + arg5 * local365 / local373);
		}
		this.aBoolean667 = true;
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(II)Z")
	public boolean method25971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean667) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3869 - this.anInt3870;
		@Pc(16) int local16 = this.anInt3872 - this.anInt3871;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3870 * local10 + this.anInt3871 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3870 - arg0;
			local54 = this.anInt3871 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else if (local42 > local24) {
			local49 = this.anInt3869 - arg0;
			local54 = this.anInt3872 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3870 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3871 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3873 * this.anInt3873;
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(II)Z")
	public boolean method25972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean667) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3869 - this.anInt3870;
		@Pc(16) int local16 = this.anInt3872 - this.anInt3871;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3870 * local10 + this.anInt3871 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3870 - arg0;
			local54 = this.anInt3871 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else if (local42 > local24) {
			local49 = this.anInt3869 - arg0;
			local54 = this.anInt3872 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3873 * this.anInt3873;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3870 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3871 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3873 * this.anInt3873;
		}
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(Lclient!oj;Lclient!pq;Lclient!pq;FFFF)V")
	public void method25973(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean667 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat307 + arg0.aFloat304) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat303 + arg0.aFloat306) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat308;
		@Pc(59) float local59 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(88) float local88 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(117) float local117 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(146) float local146 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local117 >= -local146) {
			this.anInt3870 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3871 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat305;
		@Pc(211) float local211 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(240) float local240 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(269) float local269 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(298) float local298 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local269 >= -local298) {
			this.anInt3869 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3872 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean667 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3870 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3871 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3869 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3872 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean667) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat304 - arg0.aFloat307), 2.0D) + Math.pow((double) (arg0.aFloat306 - arg0.aFloat303), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local146 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3873 = (int) (arg3 - (float) this.anInt3870 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local298 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3873 = (int) (arg3 - (float) this.anInt3869 + arg5 * local365 / local373);
		}
		this.aBoolean667 = true;
	}
}
