package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public class Class241 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public int anInt3828;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public int anInt3829;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt3830;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt3831;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public int anInt3832;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Z")
	public boolean aBoolean663 = false;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(II)Z", line = 18)
	public boolean method25875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean663) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3828 - this.anInt3829;
		@Pc(16) int local16 = this.anInt3831 - this.anInt3830;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3829 * local10 + this.anInt3830 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3829 - arg0;
			local54 = this.anInt3830 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else if (local42 > local24) {
			local49 = this.anInt3828 - arg0;
			local54 = this.anInt3831 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3829 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3830 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3832 * this.anInt3832;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(II)Z", line = 18)
	public boolean method25876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean663) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3828 - this.anInt3829;
		@Pc(16) int local16 = this.anInt3831 - this.anInt3830;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3829 * local10 + this.anInt3830 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3829 - arg0;
			local54 = this.anInt3830 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else if (local42 > local24) {
			local49 = this.anInt3828 - arg0;
			local54 = this.anInt3831 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3829 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3830 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3832 * this.anInt3832;
		}
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(II)Z", line = 18)
	public boolean method25877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean663) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3828 - this.anInt3829;
		@Pc(16) int local16 = this.anInt3831 - this.anInt3830;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3829 * local10 + this.anInt3830 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3829 - arg0;
			local54 = this.anInt3830 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else if (local42 > local24) {
			local49 = this.anInt3828 - arg0;
			local54 = this.anInt3831 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3829 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3830 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3832 * this.anInt3832;
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(II)Z", line = 18)
	public boolean method25878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean663) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3828 - this.anInt3829;
		@Pc(16) int local16 = this.anInt3831 - this.anInt3830;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3829 * local10 + this.anInt3830 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3829 - arg0;
			local54 = this.anInt3830 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else if (local42 > local24) {
			local49 = this.anInt3828 - arg0;
			local54 = this.anInt3831 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3832 * this.anInt3832;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3829 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3830 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3832 * this.anInt3832;
		}
	}

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "(Lclient!oj;Lclient!pq;Lclient!pq;FFFF)V", line = 49)
	public void method25879(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean663 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat299 + arg0.aFloat296) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat295 + arg0.aFloat298) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat300;
		@Pc(59) float local59 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(88) float local88 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(117) float local117 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(146) float local146 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local117 >= -local146) {
			this.anInt3829 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3830 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat297;
		@Pc(211) float local211 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(240) float local240 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(269) float local269 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(298) float local298 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local269 >= -local298) {
			this.anInt3828 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3831 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean663 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3829 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3830 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3828 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3831 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean663) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat296 - arg0.aFloat299), 2.0D) + Math.pow((double) (arg0.aFloat298 - arg0.aFloat295), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local146 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3832 = (int) (arg3 - (float) this.anInt3829 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local298 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3832 = (int) (arg3 - (float) this.anInt3828 + arg5 * local365 / local373);
		}
		this.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(Lclient!oj;Lclient!pq;Lclient!pq;FFFF)V", line = 49)
	public void method25880(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean663 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat299 + arg0.aFloat296) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat295 + arg0.aFloat298) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat300;
		@Pc(59) float local59 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(88) float local88 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(117) float local117 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(146) float local146 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local117 >= -local146) {
			this.anInt3829 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3830 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat297;
		@Pc(211) float local211 = arg2.aFloatArray116[0] * (float) local13 + arg2.aFloatArray116[4] * (float) local28 + arg2.aFloatArray116[8] * (float) local22 + arg2.aFloatArray116[12];
		@Pc(240) float local240 = arg2.aFloatArray116[1] * (float) local13 + arg2.aFloatArray116[5] * (float) local28 + arg2.aFloatArray116[9] * (float) local22 + arg2.aFloatArray116[13];
		@Pc(269) float local269 = arg2.aFloatArray116[2] * (float) local13 + arg2.aFloatArray116[6] * (float) local28 + arg2.aFloatArray116[10] * (float) local22 + arg2.aFloatArray116[14];
		@Pc(298) float local298 = arg2.aFloatArray116[3] * (float) local13 + arg2.aFloatArray116[7] * (float) local28 + arg2.aFloatArray116[11] * (float) local22 + arg2.aFloatArray116[15];
		if (local269 >= -local298) {
			this.anInt3828 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3831 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean663 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3829 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3830 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3828 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3831 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean663) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat296 - arg0.aFloat299), 2.0D) + Math.pow((double) (arg0.aFloat298 - arg0.aFloat295), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local146 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3832 = (int) (arg3 - (float) this.anInt3829 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray116[0] * local357 + arg1.aFloatArray116[12];
			local373 = local298 + arg1.aFloatArray116[3] * local357 + arg1.aFloatArray116[15];
			this.anInt3832 = (int) (arg3 - (float) this.anInt3828 + arg5 * local365 / local373);
		}
		this.aBoolean663 = true;
	}
}
