package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oy")
public final class Class472 {

	@OriginalMember(owner = "client!oy", name = "i", descriptor = "[F")
	static final float[] aFloatArray109 = new float[8];

	@OriginalMember(owner = "client!oy", name = "m", descriptor = "[F")
	static final float[] aFloatArray108 = new float[8];

	@OriginalMember(owner = "client!oy", name = "o", descriptor = "[F")
	static final float[] aFloatArray110 = new float[8];

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "F")
	public float aFloat314;

	@OriginalMember(owner = "client!oy", name = "e", descriptor = "F")
	public float aFloat315;

	@OriginalMember(owner = "client!oy", name = "l", descriptor = "F")
	public float aFloat316;

	@OriginalMember(owner = "client!oy", name = "g", descriptor = "F")
	public float aFloat317;

	@OriginalMember(owner = "client!oy", name = "t", descriptor = "F")
	public float aFloat318;

	@OriginalMember(owner = "client!oy", name = "u", descriptor = "F")
	public float aFloat319;

	@OriginalMember(owner = "client!oy", name = "t", descriptor = "(IIIILclient!pm;FFFF)Z")
	public boolean method29859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class487 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray109[0] = this.aFloat318;
		aFloatArray108[0] = this.aFloat314;
		aFloatArray110[0] = this.aFloat315;
		aFloatArray109[1] = this.aFloat319;
		aFloatArray108[1] = this.aFloat314;
		aFloatArray110[1] = this.aFloat315;
		aFloatArray109[2] = this.aFloat318;
		aFloatArray108[2] = this.aFloat316;
		aFloatArray110[2] = this.aFloat315;
		aFloatArray109[3] = this.aFloat319;
		aFloatArray108[3] = this.aFloat316;
		aFloatArray110[3] = this.aFloat315;
		aFloatArray109[4] = this.aFloat318;
		aFloatArray108[4] = this.aFloat314;
		aFloatArray110[4] = this.aFloat317;
		aFloatArray109[5] = this.aFloat319;
		aFloatArray108[5] = this.aFloat314;
		aFloatArray110[5] = this.aFloat317;
		aFloatArray109[6] = this.aFloat318;
		aFloatArray108[6] = this.aFloat316;
		aFloatArray110[6] = this.aFloat317;
		aFloatArray109[7] = this.aFloat319;
		aFloatArray108[7] = this.aFloat316;
		aFloatArray110[7] = this.aFloat317;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray109[local131];
			@Pc(142) float local142 = aFloatArray108[local131];
			@Pc(146) float local146 = aFloatArray110[local131];
			@Pc(172) float local172 = arg4.aFloatArray114[2] * local138 + arg4.aFloatArray114[6] * local142 + arg4.aFloatArray114[10] * local146 + arg4.aFloatArray114[14];
			@Pc(198) float local198 = arg4.aFloatArray114[3] * local138 + arg4.aFloatArray114[7] * local142 + arg4.aFloatArray114[11] * local146 + arg4.aFloatArray114[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray114[0] * local138 + arg4.aFloatArray114[4] * local142 + arg4.aFloatArray114[8] * local146 + arg4.aFloatArray114[12];
				@Pc(255) float local255 = arg4.aFloatArray114[1] * local138 + arg4.aFloatArray114[5] * local142 + arg4.aFloatArray114[9] * local146 + arg4.aFloatArray114[13];
				@Pc(263) float local263 = arg5 + arg7 * local229 / local198;
				@Pc(271) float local271 = arg6 + arg8 * local255 / local198;
				if (local263 < local3) {
					local3 = local263;
				}
				if (local263 > local5) {
					local5 = local263;
				}
				if (local271 < local7) {
					local7 = local271;
				}
				if (local271 > local9) {
					local9 = local271;
				}
				local1 = true;
			}
		}
		local131 = arg0 + arg2;
		@Pc(307) int local307 = arg1 + arg3;
		if (local1 && (float) local131 > local3 && (float) arg0 < local5 && (float) local307 > local7 && (float) arg1 < local9) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oy", name = "f", descriptor = "(IIIILclient!pm;FFFF)Z")
	public boolean method29860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class487 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray109[0] = this.aFloat318;
		aFloatArray108[0] = this.aFloat314;
		aFloatArray110[0] = this.aFloat315;
		aFloatArray109[1] = this.aFloat319;
		aFloatArray108[1] = this.aFloat314;
		aFloatArray110[1] = this.aFloat315;
		aFloatArray109[2] = this.aFloat318;
		aFloatArray108[2] = this.aFloat316;
		aFloatArray110[2] = this.aFloat315;
		aFloatArray109[3] = this.aFloat319;
		aFloatArray108[3] = this.aFloat316;
		aFloatArray110[3] = this.aFloat315;
		aFloatArray109[4] = this.aFloat318;
		aFloatArray108[4] = this.aFloat314;
		aFloatArray110[4] = this.aFloat317;
		aFloatArray109[5] = this.aFloat319;
		aFloatArray108[5] = this.aFloat314;
		aFloatArray110[5] = this.aFloat317;
		aFloatArray109[6] = this.aFloat318;
		aFloatArray108[6] = this.aFloat316;
		aFloatArray110[6] = this.aFloat317;
		aFloatArray109[7] = this.aFloat319;
		aFloatArray108[7] = this.aFloat316;
		aFloatArray110[7] = this.aFloat317;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray109[local131];
			@Pc(142) float local142 = aFloatArray108[local131];
			@Pc(146) float local146 = aFloatArray110[local131];
			@Pc(172) float local172 = arg4.aFloatArray114[2] * local138 + arg4.aFloatArray114[6] * local142 + arg4.aFloatArray114[10] * local146 + arg4.aFloatArray114[14];
			@Pc(198) float local198 = arg4.aFloatArray114[3] * local138 + arg4.aFloatArray114[7] * local142 + arg4.aFloatArray114[11] * local146 + arg4.aFloatArray114[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray114[0] * local138 + arg4.aFloatArray114[4] * local142 + arg4.aFloatArray114[8] * local146 + arg4.aFloatArray114[12];
				@Pc(255) float local255 = arg4.aFloatArray114[1] * local138 + arg4.aFloatArray114[5] * local142 + arg4.aFloatArray114[9] * local146 + arg4.aFloatArray114[13];
				@Pc(263) float local263 = arg5 + arg7 * local229 / local198;
				@Pc(271) float local271 = arg6 + arg8 * local255 / local198;
				if (local263 < local3) {
					local3 = local263;
				}
				if (local263 > local5) {
					local5 = local263;
				}
				if (local271 < local7) {
					local7 = local271;
				}
				if (local271 > local9) {
					local9 = local271;
				}
				local1 = true;
			}
		}
		local131 = arg0 + arg2;
		@Pc(307) int local307 = arg1 + arg3;
		if (local1 && (float) local131 > local3 && (float) arg0 < local5 && (float) local307 > local7 && (float) arg1 < local9) {
			return true;
		} else {
			return false;
		}
	}
}
