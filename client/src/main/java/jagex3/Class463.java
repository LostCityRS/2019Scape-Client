package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class463 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "[F")
	static final float[] aFloatArray110 = new float[8];

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "[F")
	static final float[] aFloatArray109 = new float[8];

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "[F")
	static final float[] aFloatArray111 = new float[8];

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "F")
	public float aFloat303;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "F")
	public float aFloat304;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "F")
	public float aFloat305;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "F")
	public float aFloat306;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "F")
	public float aFloat307;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "F")
	public float aFloat308;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "(IIIILclient!pq;FFFF)Z")
	public boolean method29460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class489 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray110[0] = this.aFloat307;
		aFloatArray109[0] = this.aFloat308;
		aFloatArray111[0] = this.aFloat303;
		aFloatArray110[1] = this.aFloat304;
		aFloatArray109[1] = this.aFloat308;
		aFloatArray111[1] = this.aFloat303;
		aFloatArray110[2] = this.aFloat307;
		aFloatArray109[2] = this.aFloat305;
		aFloatArray111[2] = this.aFloat303;
		aFloatArray110[3] = this.aFloat304;
		aFloatArray109[3] = this.aFloat305;
		aFloatArray111[3] = this.aFloat303;
		aFloatArray110[4] = this.aFloat307;
		aFloatArray109[4] = this.aFloat308;
		aFloatArray111[4] = this.aFloat306;
		aFloatArray110[5] = this.aFloat304;
		aFloatArray109[5] = this.aFloat308;
		aFloatArray111[5] = this.aFloat306;
		aFloatArray110[6] = this.aFloat307;
		aFloatArray109[6] = this.aFloat305;
		aFloatArray111[6] = this.aFloat306;
		aFloatArray110[7] = this.aFloat304;
		aFloatArray109[7] = this.aFloat305;
		aFloatArray111[7] = this.aFloat306;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray110[local131];
			@Pc(142) float local142 = aFloatArray109[local131];
			@Pc(146) float local146 = aFloatArray111[local131];
			@Pc(172) float local172 = arg4.aFloatArray116[2] * local138 + arg4.aFloatArray116[6] * local142 + arg4.aFloatArray116[10] * local146 + arg4.aFloatArray116[14];
			@Pc(198) float local198 = arg4.aFloatArray116[3] * local138 + arg4.aFloatArray116[7] * local142 + arg4.aFloatArray116[11] * local146 + arg4.aFloatArray116[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray116[0] * local138 + arg4.aFloatArray116[4] * local142 + arg4.aFloatArray116[8] * local146 + arg4.aFloatArray116[12];
				@Pc(255) float local255 = arg4.aFloatArray116[1] * local138 + arg4.aFloatArray116[5] * local142 + arg4.aFloatArray116[9] * local146 + arg4.aFloatArray116[13];
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

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(IIIILclient!pq;FFFF)Z")
	public boolean method29461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class489 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray110[0] = this.aFloat307;
		aFloatArray109[0] = this.aFloat308;
		aFloatArray111[0] = this.aFloat303;
		aFloatArray110[1] = this.aFloat304;
		aFloatArray109[1] = this.aFloat308;
		aFloatArray111[1] = this.aFloat303;
		aFloatArray110[2] = this.aFloat307;
		aFloatArray109[2] = this.aFloat305;
		aFloatArray111[2] = this.aFloat303;
		aFloatArray110[3] = this.aFloat304;
		aFloatArray109[3] = this.aFloat305;
		aFloatArray111[3] = this.aFloat303;
		aFloatArray110[4] = this.aFloat307;
		aFloatArray109[4] = this.aFloat308;
		aFloatArray111[4] = this.aFloat306;
		aFloatArray110[5] = this.aFloat304;
		aFloatArray109[5] = this.aFloat308;
		aFloatArray111[5] = this.aFloat306;
		aFloatArray110[6] = this.aFloat307;
		aFloatArray109[6] = this.aFloat305;
		aFloatArray111[6] = this.aFloat306;
		aFloatArray110[7] = this.aFloat304;
		aFloatArray109[7] = this.aFloat305;
		aFloatArray111[7] = this.aFloat306;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray110[local131];
			@Pc(142) float local142 = aFloatArray109[local131];
			@Pc(146) float local146 = aFloatArray111[local131];
			@Pc(172) float local172 = arg4.aFloatArray116[2] * local138 + arg4.aFloatArray116[6] * local142 + arg4.aFloatArray116[10] * local146 + arg4.aFloatArray116[14];
			@Pc(198) float local198 = arg4.aFloatArray116[3] * local138 + arg4.aFloatArray116[7] * local142 + arg4.aFloatArray116[11] * local146 + arg4.aFloatArray116[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray116[0] * local138 + arg4.aFloatArray116[4] * local142 + arg4.aFloatArray116[8] * local146 + arg4.aFloatArray116[12];
				@Pc(255) float local255 = arg4.aFloatArray116[1] * local138 + arg4.aFloatArray116[5] * local142 + arg4.aFloatArray116[9] * local146 + arg4.aFloatArray116[13];
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
