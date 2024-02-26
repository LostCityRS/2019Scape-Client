package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class246 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public int anInt3865;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	public int anInt3866;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public int anInt3867;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public int anInt3868;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Z")
	public boolean aBoolean773 = false;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "(II)Z")
	public boolean method26324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean773) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3866 - this.anInt3865;
		@Pc(16) int local16 = this.anInt3867 - this.anInt3864;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3865 * local10 + this.anInt3864 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3865 - arg0;
			local54 = this.anInt3864 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else if (local42 > local24) {
			local49 = this.anInt3866 - arg0;
			local54 = this.anInt3867 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3865 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3864 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3868 * this.anInt3868;
		}
	}

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "(II)Z")
	public boolean method26325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean773) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3866 - this.anInt3865;
		@Pc(16) int local16 = this.anInt3867 - this.anInt3864;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3865 * local10 + this.anInt3864 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3865 - arg0;
			local54 = this.anInt3864 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else if (local42 > local24) {
			local49 = this.anInt3866 - arg0;
			local54 = this.anInt3867 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3865 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3864 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3868 * this.anInt3868;
		}
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(II)Z")
	public boolean method26326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean773) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3866 - this.anInt3865;
		@Pc(16) int local16 = this.anInt3867 - this.anInt3864;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3865 * local10 + this.anInt3864 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3865 - arg0;
			local54 = this.anInt3864 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else if (local42 > local24) {
			local49 = this.anInt3866 - arg0;
			local54 = this.anInt3867 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3865 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3864 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3868 * this.anInt3868;
		}
	}

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "(II)Z")
	public boolean method26327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean773) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3866 - this.anInt3865;
		@Pc(16) int local16 = this.anInt3867 - this.anInt3864;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3865 * local10 + this.anInt3864 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3865 - arg0;
			local54 = this.anInt3864 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else if (local42 > local24) {
			local49 = this.anInt3866 - arg0;
			local54 = this.anInt3867 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3868 * this.anInt3868;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3865 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3864 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3868 * this.anInt3868;
		}
	}

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "(Lclient!oy;Lclient!pm;Lclient!pm;FFFF)V")
	public void method26328(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean773 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat318 + arg0.aFloat319) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat315 + arg0.aFloat317) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat314;
		@Pc(59) float local59 = arg2.aFloatArray114[0] * (float) local13 + arg2.aFloatArray114[4] * (float) local28 + arg2.aFloatArray114[8] * (float) local22 + arg2.aFloatArray114[12];
		@Pc(88) float local88 = arg2.aFloatArray114[1] * (float) local13 + arg2.aFloatArray114[5] * (float) local28 + arg2.aFloatArray114[9] * (float) local22 + arg2.aFloatArray114[13];
		@Pc(117) float local117 = arg2.aFloatArray114[2] * (float) local13 + arg2.aFloatArray114[6] * (float) local28 + arg2.aFloatArray114[10] * (float) local22 + arg2.aFloatArray114[14];
		@Pc(146) float local146 = arg2.aFloatArray114[3] * (float) local13 + arg2.aFloatArray114[7] * (float) local28 + arg2.aFloatArray114[11] * (float) local22 + arg2.aFloatArray114[15];
		if (local117 >= -local146) {
			this.anInt3865 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3864 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat316;
		@Pc(211) float local211 = arg2.aFloatArray114[0] * (float) local13 + arg2.aFloatArray114[4] * (float) local28 + arg2.aFloatArray114[8] * (float) local22 + arg2.aFloatArray114[12];
		@Pc(240) float local240 = arg2.aFloatArray114[1] * (float) local13 + arg2.aFloatArray114[5] * (float) local28 + arg2.aFloatArray114[9] * (float) local22 + arg2.aFloatArray114[13];
		@Pc(269) float local269 = arg2.aFloatArray114[2] * (float) local13 + arg2.aFloatArray114[6] * (float) local28 + arg2.aFloatArray114[10] * (float) local22 + arg2.aFloatArray114[14];
		@Pc(298) float local298 = arg2.aFloatArray114[3] * (float) local13 + arg2.aFloatArray114[7] * (float) local28 + arg2.aFloatArray114[11] * (float) local22 + arg2.aFloatArray114[15];
		if (local269 >= -local298) {
			this.anInt3866 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3867 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean773 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3865 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3864 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3866 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3867 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean773) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat319 - arg0.aFloat318), 2.0D) + Math.pow((double) (arg0.aFloat317 - arg0.aFloat315), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray114[0] * local357 + arg1.aFloatArray114[12];
			local373 = local146 + arg1.aFloatArray114[3] * local357 + arg1.aFloatArray114[15];
			this.anInt3868 = (int) (arg3 - (float) this.anInt3865 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray114[0] * local357 + arg1.aFloatArray114[12];
			local373 = local298 + arg1.aFloatArray114[3] * local357 + arg1.aFloatArray114[15];
			this.anInt3868 = (int) (arg3 - (float) this.anInt3866 + arg5 * local365 / local373);
		}
		this.aBoolean773 = true;
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(Lclient!oy;Lclient!pm;Lclient!pm;FFFF)V")
	public void method26329(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean773 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat318 + arg0.aFloat319) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat315 + arg0.aFloat317) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat314;
		@Pc(59) float local59 = arg2.aFloatArray114[0] * (float) local13 + arg2.aFloatArray114[4] * (float) local28 + arg2.aFloatArray114[8] * (float) local22 + arg2.aFloatArray114[12];
		@Pc(88) float local88 = arg2.aFloatArray114[1] * (float) local13 + arg2.aFloatArray114[5] * (float) local28 + arg2.aFloatArray114[9] * (float) local22 + arg2.aFloatArray114[13];
		@Pc(117) float local117 = arg2.aFloatArray114[2] * (float) local13 + arg2.aFloatArray114[6] * (float) local28 + arg2.aFloatArray114[10] * (float) local22 + arg2.aFloatArray114[14];
		@Pc(146) float local146 = arg2.aFloatArray114[3] * (float) local13 + arg2.aFloatArray114[7] * (float) local28 + arg2.aFloatArray114[11] * (float) local22 + arg2.aFloatArray114[15];
		if (local117 >= -local146) {
			this.anInt3865 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3864 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat316;
		@Pc(211) float local211 = arg2.aFloatArray114[0] * (float) local13 + arg2.aFloatArray114[4] * (float) local28 + arg2.aFloatArray114[8] * (float) local22 + arg2.aFloatArray114[12];
		@Pc(240) float local240 = arg2.aFloatArray114[1] * (float) local13 + arg2.aFloatArray114[5] * (float) local28 + arg2.aFloatArray114[9] * (float) local22 + arg2.aFloatArray114[13];
		@Pc(269) float local269 = arg2.aFloatArray114[2] * (float) local13 + arg2.aFloatArray114[6] * (float) local28 + arg2.aFloatArray114[10] * (float) local22 + arg2.aFloatArray114[14];
		@Pc(298) float local298 = arg2.aFloatArray114[3] * (float) local13 + arg2.aFloatArray114[7] * (float) local28 + arg2.aFloatArray114[11] * (float) local22 + arg2.aFloatArray114[15];
		if (local269 >= -local298) {
			this.anInt3866 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3867 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean773 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3865 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3864 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3866 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3867 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean773) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat319 - arg0.aFloat318), 2.0D) + Math.pow((double) (arg0.aFloat317 - arg0.aFloat315), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray114[0] * local357 + arg1.aFloatArray114[12];
			local373 = local146 + arg1.aFloatArray114[3] * local357 + arg1.aFloatArray114[15];
			this.anInt3868 = (int) (arg3 - (float) this.anInt3865 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray114[0] * local357 + arg1.aFloatArray114[12];
			local373 = local298 + arg1.aFloatArray114[3] * local357 + arg1.aFloatArray114[15];
			this.anInt3868 = (int) (arg3 - (float) this.anInt3866 + arg5 * local365 / local373);
		}
		this.aBoolean773 = true;
	}
}
