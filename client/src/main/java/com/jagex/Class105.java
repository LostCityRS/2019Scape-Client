package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public abstract class Class105 {

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "F")
	static final float aFloat78 = 2607.5945F;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "F")
	static final float aFloat79 = 3.1415927F;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
	protected boolean aBoolean174 = false;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(IIIIII[FFIF[F)V")
	static void method7319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(FFF)I")
	static int method7320(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "(IIIIIII[FIFFF[F)V")
	static void method7321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "(IIIIFFF)[F")
	static float[] method7323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dn", name = "gg", descriptor = "(IIIIIII[FIFFF[F)V")
	static void method7350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "(IIIIII[FIF[F)V")
	static void method7363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F + arg8;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		arg9[0] = local100;
		arg9[1] = local113;
	}

	@OriginalMember(owner = "client!dn", name = "gh", descriptor = "(FFF)I")
	static int method7369(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dn", name = "gi", descriptor = "(IIIIFFF)[F")
	static float[] method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dn", name = "gk", descriptor = "(IIIIIII[FIFFF[F)V")
	static void method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dn", name = "fs", descriptor = "(IIIIII[FIF[F)V")
	static void method7474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F + arg8;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		arg9[0] = local100;
		arg9[1] = local113;
	}

	@OriginalMember(owner = "client!dn", name = "fr", descriptor = "(IIIIII[FFIF[F)V")
	static void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dn", name = "fi", descriptor = "(IIIIII[FFIF[F)V")
	static void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dn", name = "fu", descriptor = "(IIIIII[FFIF[F)V")
	static void method7495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dn", name = "ff", descriptor = "(IIIIII[FFIF[F)V")
	static void method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dn", name = "gz", descriptor = "(IIIIIII[FIFFF[F)V")
	static void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dn", name = "gw", descriptor = "(IIIIFFF)[F")
	static float[] method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dn", name = "gp", descriptor = "(IIIIFFF)[F")
	static float[] method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	Class105() {
	}

	@OriginalMember(owner = "client!dn", name = "fg", descriptor = "(Lclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method7317(@OriginalArg(0) Class80_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "(I)V")
	public abstract void method7318(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "(Lclient!dt;[II)Lclient!ep;")
	final Class247 method7322(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray94 != null) {
			@Pc(14) int local14 = arg0.anInt3779;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray94[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray91[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray92[local72];
						} else {
							local95 = arg0.aShortArray93[local72];
						}
						local115 = arg0.anIntArray340[local95];
						@Pc(120) int local120 = arg0.anIntArray341[local95];
						@Pc(125) int local125 = arg0.anIntArray343[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray74[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray339[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray339[local34];
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
						local257 = 64.0F / (float) arg0.anIntArray348[local34];
					} else {
						local255 = (float) arg0.anIntArray339[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray344[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray348[local34] / 1024.0F;
					}
					local8[local34] = method7323(arg0.aShortArray96[local34], arg0.aShortArray88[local34], arg0.aShortArray97[local34], arg0.aByteArray75[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class247(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "(BIZ)Lclient!dn;")
	public abstract Class105 method7324(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "()V")
	abstract void method7325();

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "()I")
	public abstract int method7326();

	@OriginalMember(owner = "client!dn", name = "ai", descriptor = "(Lclient!arn;I)V")
	public final void method7327(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3807; local21++) {
			@Pc(30) short local30 = local16.aShortArray104[local21];
			if (local19.aBooleanArray8[local30]) {
				if (local16.aShortArray106[local21] != -1) {
					this.method7335(0, 0, 0, 0);
				}
				this.method7335(local19.anIntArray188[local30], local16.aShortArray108[local21], local16.aShortArray107[local21], local16.aShortArray105[local21]);
			}
		}
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public abstract void method7328(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "(I)V")
	public abstract void method7329(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)V")
	public abstract void method7330(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "cd", descriptor = "(I)V")
	public abstract void method7331(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "(III)V")
	public abstract void method7332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "bd", descriptor = "(I)V")
	public abstract void method7333(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "(III)V")
	public abstract void method7334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "am", descriptor = "(IIII)V")
	abstract void method7335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method7336(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2950(arg1 + local10, arg3 + local15, 1344754475);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2950(arg1 + local29, arg3 + local34, -1604883577);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2950(arg1 + local49, arg3 + local53, 1858323300);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2950(arg1 + local67, arg3 + local71, -405689642);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method7330(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method7318(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method7332(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "()V")
	abstract void method7337();

	@OriginalMember(owner = "client!dn", name = "cu", descriptor = "(III)V")
	public abstract void method7338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "ab", descriptor = "(I[IIIIIZ)V")
	abstract void method7339(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "(Lclient!are;IIZ)V")
	public final void method7340(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method7337();
		if (this.method7502()) {
			@Pc(10) Class80_Sub23 local10 = arg0.aClass80_Sub23_1;
			this.method7415(local10, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method7357();
			this.method7325();
		} else {
			this.method7325();
		}
	}

	@OriginalMember(owner = "client!dn", name = "bk", descriptor = "(SS)V")
	public abstract void method7341(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "aw", descriptor = "()I")
	public abstract int method7342();

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!are;ILclient!are;I[ZZ)V")
	public final void method7343(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 == null) {
			return;
		}
		if (arg4 == null || arg2 == null) {
			this.method7340(arg0, arg1, 0, arg5);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(24) Class80_Sub23 local24 = arg0.aClass80_Sub23_1;
		@Pc(32) int local32 = arg1 % (arg0.method21787(-1631327682) + 1);
		this.method7415(local24, arg0, local32, 0, arg5, arg4, false, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg5);
		@Pc(56) Class80_Sub23 local56 = arg2.aClass80_Sub23_1;
		@Pc(64) int local64 = arg3 % (arg2.method21787(-1059414138) + 1);
		this.method7415(local56, arg2, local64, 0, arg5, arg4, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "()V")
	public abstract void method7344();

	@OriginalMember(owner = "client!dn", name = "ay", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!are;I[ZZ)V")
	public final void method7345(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(31) Class237 local31 = arg0.aClass237Array1[arg1];
		@Pc(34) Class80_Sub23 local34 = local31.aClass80_Sub23_2;
		@Pc(36) Class237 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass237Array1[arg3];
			if (local36.aClass80_Sub23_2 != local34) {
				local36 = null;
			}
		}
		this.method7347(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class80_Sub23 local75 = arg6.aClass80_Sub23_1;
		@Pc(83) int local83 = arg7 % (arg6.method21787(-1623598824) + 1);
		this.method7415(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "bp", descriptor = "(Lclient!ov;)V")
	public abstract void method7346(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!dn", name = "aq", descriptor = "(Lclient!akm;Lclient!dz;Lclient!dz;III[ZZZI[I)V")
	final void method7347(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3807; local5++) {
				@Pc(14) short local14 = arg1.aShortArray104[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray188[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray106[local5];
					if (local32 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local32], arg10);
					}
					this.method7349(arg0.anIntArray188[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray108[local5], arg1.aShortArray107[local5], arg1.aShortArray105[local5], arg5, arg8, arg9 & arg0.anIntArray187[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1619 * -1195478191; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3807 && arg1.aShortArray104[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3807 && arg2.aShortArray104[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray188[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray188[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray108[local5];
						local179 = arg1.aShortArray107[local5];
						local184 = arg1.aShortArray105[local5];
						local189 = arg1.aShortArray106[local5];
						local194 = arg1.aByteArray78[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray108[local92];
						local218 = arg2.aShortArray107[local92];
						local223 = arg2.aShortArray105[local92];
						local228 = arg2.aShortArray106[local92];
						local233 = arg2.aByteArray78[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local189], arg10);
					} else if (local228 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local228], arg10);
					}
					this.method7349(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray187[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "by", descriptor = "(B[B)V")
	public abstract void method7348(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dn", name = "aj", descriptor = "(I[IIIIIZI[I)V")
	final void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dn", name = "ax", descriptor = "(Lclient!are;ILclient!arn;ILclient!arn;III[ZZ)V")
	public final void method7351(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class80_Sub1_Sub7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method7340(arg0, arg1, 0, arg9);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(24) Class80_Sub23 local24 = arg0.aClass80_Sub23_1;
		@Pc(32) int local32 = arg1 % (arg0.method21787(-1436532912) + 1);
		this.method7415(local24, arg0, local32, 0, arg9, arg8, false, 65535, null);
		@Pc(48) Class237 local48 = arg2.aClass237Array1[arg3];
		@Pc(50) Class237 local50 = null;
		if (arg4 != null) {
			local50 = arg4.aClass237Array1[arg5];
			if (local50.aClass80_Sub23_2 != local24) {
				local50 = null;
			}
		}
		this.method7339(0, new int[0], 0, 0, 0, 0, arg9);
		this.method7347(local48.aClass80_Sub23_2, local48, local50, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gn", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!are;I[ZZ)V")
	public final void method7352(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(31) Class237 local31 = arg0.aClass237Array1[arg1];
		@Pc(34) Class80_Sub23 local34 = local31.aClass80_Sub23_2;
		@Pc(36) Class237 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass237Array1[arg3];
			if (local36.aClass80_Sub23_2 != local34) {
				local36 = null;
			}
		}
		this.method7347(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class80_Sub23 local75 = arg6.aClass80_Sub23_1;
		@Pc(83) int local83 = arg7 % (arg6.method21787(2106323864) + 1);
		this.method7415(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "bc", descriptor = "(Lclient!dn;IIIZ)V")
	public abstract void method7353(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dn", name = "hf", descriptor = "(Lclient!arn;I)V")
	public final void method7354(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3807; local21++) {
			@Pc(30) short local30 = local16.aShortArray104[local21];
			if (local19.aBooleanArray8[local30]) {
				if (local16.aShortArray106[local21] != -1) {
					this.method7335(0, 0, 0, 0);
				}
				this.method7335(local19.anIntArray188[local30], local16.aShortArray108[local21], local16.aShortArray107[local21], local16.aShortArray105[local21]);
			}
		}
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "af", descriptor = "(I[IIIIZI[I)V")
	abstract void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "gj", descriptor = "()V")
	public abstract void method7356();

	@OriginalMember(owner = "client!dn", name = "ak", descriptor = "()V")
	abstract void method7357();

	@OriginalMember(owner = "client!dn", name = "at", descriptor = "(Lclient!ov;IZ)V")
	public abstract void method7358(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dn", name = "ad", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	public abstract void method7359(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "av", descriptor = "(IILclient!ov;ZI)Z")
	public abstract boolean method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dn", name = "an", descriptor = "(Lclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method7361(@OriginalArg(0) Class80_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!dn", name = "aa", descriptor = "()I")
	public abstract int method7362();

	@OriginalMember(owner = "client!dn", name = "df", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	public abstract void method7364(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "(Lclient!arn;ILclient!arn;IIIIIZ[I)V")
	public final void method7365(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		@Pc(21) Class237 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass237Array1[arg3];
			if (local21.aClass80_Sub23_2 != local19) {
				local21 = null;
			}
		}
		this.method7347(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "au", descriptor = "()I")
	public abstract int method7366();

	@OriginalMember(owner = "client!dn", name = "az", descriptor = "()I")
	public abstract int method7367();

	@OriginalMember(owner = "client!dn", name = "as", descriptor = "()I")
	public abstract int method7368();

	@OriginalMember(owner = "client!dn", name = "ge", descriptor = "(Lclient!dt;[II)Lclient!ep;")
	final Class247 method7370(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray94 != null) {
			@Pc(14) int local14 = arg0.anInt3779;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray94[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray91[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray92[local72];
						} else {
							local95 = arg0.aShortArray93[local72];
						}
						local115 = arg0.anIntArray340[local95];
						@Pc(120) int local120 = arg0.anIntArray341[local95];
						@Pc(125) int local125 = arg0.anIntArray343[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray74[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray339[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray339[local34];
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
						local257 = 64.0F / (float) arg0.anIntArray348[local34];
					} else {
						local255 = (float) arg0.anIntArray339[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray344[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray348[local34] / 1024.0F;
					}
					local8[local34] = method7323(arg0.aShortArray96[local34], arg0.aShortArray88[local34], arg0.aShortArray97[local34], arg0.aByteArray75[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class247(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dn", name = "bl", descriptor = "()V")
	public abstract void method7371();

	@OriginalMember(owner = "client!dn", name = "ec", descriptor = "()I")
	public abstract int method7372();

	@OriginalMember(owner = "client!dn", name = "bn", descriptor = "(I)V")
	public abstract void method7373(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ba", descriptor = "()I")
	public abstract int method7374();

	@OriginalMember(owner = "client!dn", name = "bt", descriptor = "()I")
	public abstract int method7375();

	@OriginalMember(owner = "client!dn", name = "bs", descriptor = "()[B")
	public abstract byte[] method7376();

	@OriginalMember(owner = "client!dn", name = "cb", descriptor = "()Z")
	abstract boolean method7377();

	@OriginalMember(owner = "client!dn", name = "fe", descriptor = "()[Lclient!dm;")
	public abstract Class228[] method7378();

	@OriginalMember(owner = "client!dn", name = "er", descriptor = "(SS)V")
	public abstract void method7379(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "bz", descriptor = "(IIII)V")
	public abstract void method7380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "bf", descriptor = "(Lclient!dn;IIIZ)V")
	public abstract void method7381(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dn", name = "bv", descriptor = "()Z")
	public abstract boolean method7383();

	@OriginalMember(owner = "client!dn", name = "gv", descriptor = "(Lclient!arn;ILclient!arn;IIIIZ)V")
	public final void method7384(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		@Pc(21) Class237 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass237Array1[arg3];
			if (local21.aClass80_Sub23_2 != local19) {
				local21 = null;
			}
		}
		this.method7347(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "bb", descriptor = "()[Lclient!dm;")
	public abstract Class228[] method7385();

	@OriginalMember(owner = "client!dn", name = "bo", descriptor = "()[Lclient!cp;")
	public abstract Class211[] method7386();

	@OriginalMember(owner = "client!dn", name = "da", descriptor = "()I")
	public abstract int method7387();

	@OriginalMember(owner = "client!dn", name = "ev", descriptor = "()I")
	public abstract int method7388();

	@OriginalMember(owner = "client!dn", name = "bw", descriptor = "(Lclient!dn;IIIZ)V")
	public abstract void method7389(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dn", name = "bg", descriptor = "()I")
	public abstract int method7390();

	@OriginalMember(owner = "client!dn", name = "bj", descriptor = "(SS)V")
	public abstract void method7391(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "bu", descriptor = "()I")
	public abstract int method7392();

	@OriginalMember(owner = "client!dn", name = "bm", descriptor = "(I)V")
	public abstract void method7393(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "bq", descriptor = "()V")
	public abstract void method7394();

	@OriginalMember(owner = "client!dn", name = "bh", descriptor = "()Z")
	public abstract boolean method7395();

	@OriginalMember(owner = "client!dn", name = "ac", descriptor = "(ILclient!cw;I[IFFFIZI[I)V")
	final void method7396(@OriginalArg(0) int arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25860(arg2, -1313312644).aFloatArray114[12];
			local5 = (int) -arg1.method25860(arg2, 183942149).aFloatArray114[13];
			local8 = (int) -arg1.method25860(arg2, -314887475).aFloatArray114[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25857(arg2, -91335482).method30085(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25860(arg2, -1906752159).method30171(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class487 local109 = Class487.method30168();
				local109.method30137(arg5, arg4, arg6);
				if (arg1.aClass217_1 != null) {
					local109.method30078(arg1.aClass217_1.method25860(arg2, -93796571));
				}
				local109.method30082();
				local109.method30078(arg1.method25860(arg2, -534085855));
				local64 = local109.method30163();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30147();
			} else if (arg0 == 3 || arg0 == 10) {
				local2 = (int) (arg4 * 128.0F);
				local5 = (int) (arg5 * 128.0F);
				local8 = (int) (arg6 * 128.0F);
			} else if (arg0 == 9) {
				local2 = (int) (arg4 * 2607.5945F) & 0x3FFF;
			} else if (arg0 == 5) {
				local2 = (int) (32.0F - arg4 * 32.0F);
			}
		}
		@Pc(220) int local220;
		if (arg7 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local220 = -local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 3) {
				local220 = local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 2) {
				local220 = local2;
				local2 = -local8 & 0x3FFF;
				local8 = local220 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				local2 = -local2;
				local8 = -local8;
			} else if (arg0 == 2) {
				local2 = -local2 & 0x3FFF;
				local8 = -local8 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local220 = local2;
				local2 = -local8;
				local8 = local220;
			} else if (arg0 == 3) {
				local220 = local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 2) {
				local220 = local2;
				local2 = local8 & 0x3FFF;
				local8 = -local220 & 0x3FFF;
			}
		}
		if (arg9 == 65535) {
			this.method7454(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method7355(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!dn", name = "cv", descriptor = "(I)V")
	public abstract void method7397(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ct", descriptor = "(I)V")
	public abstract void method7398(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "cn", descriptor = "(I)V")
	public abstract void method7399(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "cy", descriptor = "(I)V")
	public abstract void method7400(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ch", descriptor = "(I)V")
	public abstract void method7401(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "cc", descriptor = "(III)V")
	public abstract void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "ee", descriptor = "()I")
	public abstract int method7403();

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "()V")
	public abstract void method7404();

	@OriginalMember(owner = "client!dn", name = "cs", descriptor = "(III)V")
	public abstract void method7405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "gd", descriptor = "()V")
	public abstract void method7406();

	@OriginalMember(owner = "client!dn", name = "ck", descriptor = "()V")
	abstract void method7407();

	@OriginalMember(owner = "client!dn", name = "ca", descriptor = "()V")
	abstract void method7408();

	@OriginalMember(owner = "client!dn", name = "ft", descriptor = "(Lclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method7409(@OriginalArg(0) Class80_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!dn", name = "ci", descriptor = "()V")
	abstract void method7410();

	@OriginalMember(owner = "client!dn", name = "cm", descriptor = "()Z")
	abstract boolean method7411();

	@OriginalMember(owner = "client!dn", name = "cp", descriptor = "()Z")
	abstract boolean method7412();

	@OriginalMember(owner = "client!dn", name = "cg", descriptor = "()Z")
	abstract boolean method7413();

	@OriginalMember(owner = "client!dn", name = "ea", descriptor = "(I)V")
	public abstract void method7414(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ao", descriptor = "(Lclient!akm;Lclient!are;IIZ[ZZI[I)V")
	final void method7415(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class80_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class217 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1619 * -1195478191; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray188[local5] == 0) {
				if (arg0.anIntArray188[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray189[local3++];
					if (local35 >= 0 && local35 < arg0.aClass217Array1.length) {
						local1 = arg0.aClass217Array1[local35];
					} else {
						local1 = null;
					}
					this.method7396(0, local1, arg1.method21786((short) -4182), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray187[local5], null);
				} else if (arg1.aClass231ArrayArray1[local5] != null) {
					@Pc(82) float local82 = 0.0F;
					@Pc(84) float local84 = 0.0F;
					@Pc(86) float local86 = 0.0F;
					@Pc(88) Object local88 = null;
					@Pc(90) Object local90 = null;
					@Pc(131) float[] local131;
					@Pc(139) float[] local139;
					if (local1 == null) {
						local131 = new float[] { 0.0F, 0.0F, 0.0F };
						local139 = new float[] { 0.0F, 0.0F, 0.0F };
					} else {
						local131 = new float[] { local1.method25858(arg1.method21786((short) -19912), (byte) -42).aFloatArray114[12], local1.method25858(arg1.method21786((short) -22150), (byte) 8).aFloatArray114[13], local1.method25858(arg1.method21786((short) -6555), (byte) 50).aFloatArray114[14] };
						local139 = local1.method25857(arg1.method21786((short) -29910), -91335482).method30163();
					}
					if (arg0.anIntArray188[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray188[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray188[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray188[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass231ArrayArray1[local5].length; local227++) {
						@Pc(241) Class231 local241 = arg1.aClass231ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method26009(arg2, 667317067);
							switch(local227) {
								case 0:
									local82 = local258;
									break;
								case 1:
									local84 = local258;
									break;
								case 2:
									local86 = local258;
									break;
								case 3:
									local82 = local258;
									break;
								case 4:
									local84 = local258;
									break;
								case 5:
									local86 = local258;
							}
						}
					}
					if (local225 == 9) {
						local82 = local86;
					}
					this.method7396(local225, local1, arg1.method21786((short) -13786), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray187[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "cl", descriptor = "()V")
	abstract void method7416();

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dn", name = "cf", descriptor = "()V")
	abstract void method7418();

	@OriginalMember(owner = "client!dn", name = "ef", descriptor = "()I")
	public abstract int method7419();

	@OriginalMember(owner = "client!dn", name = "cz", descriptor = "(I[IIIIIZ)V")
	abstract void method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dn", name = "fy", descriptor = "()Z")
	public abstract boolean method7421();

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "(I)V")
	public abstract void method7422(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "dh", descriptor = "(I[IIIIZI[I)V")
	abstract void method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "dd", descriptor = "(I[IIIIZI[I)V")
	abstract void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "dc", descriptor = "(Lclient!ov;IZ)V")
	public abstract void method7425(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dn", name = "dn", descriptor = "(Lclient!ov;IZ)V")
	public abstract void method7426(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	public abstract void method7427(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "dl", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	public abstract void method7428(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "fv", descriptor = "()[Lclient!cp;")
	public abstract Class211[] method7429();

	@OriginalMember(owner = "client!dn", name = "dt", descriptor = "(Lclient!ov;)V")
	public abstract void method7430(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!dn", name = "du", descriptor = "(Lclient!ov;)V")
	public abstract void method7431(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!dn", name = "dw", descriptor = "(Lclient!ov;)V")
	public abstract void method7433(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!dn", name = "dr", descriptor = "()V")
	public abstract void method7434();

	@OriginalMember(owner = "client!dn", name = "dx", descriptor = "()V")
	public abstract void method7435();

	@OriginalMember(owner = "client!dn", name = "de", descriptor = "()V")
	public abstract void method7436();

	@OriginalMember(owner = "client!dn", name = "hr", descriptor = "(I[IIIIIZI[I)V")
	final void method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dn", name = "dm", descriptor = "()V")
	public abstract void method7438();

	@OriginalMember(owner = "client!dn", name = "fd", descriptor = "(IIII)V")
	abstract void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "do", descriptor = "()I")
	public abstract int method7440();

	@OriginalMember(owner = "client!dn", name = "dp", descriptor = "()I")
	public abstract int method7441();

	@OriginalMember(owner = "client!dn", name = "dj", descriptor = "()I")
	public abstract int method7442();

	@OriginalMember(owner = "client!dn", name = "ds", descriptor = "(Lclient!ov;)V")
	public abstract void method7443(@OriginalArg(0) Class471 arg0);

	@OriginalMember(owner = "client!dn", name = "dz", descriptor = "()I")
	public abstract int method7444();

	@OriginalMember(owner = "client!dn", name = "ah", descriptor = "(I[IIIIZI[I)V")
	abstract void method7445(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "br", descriptor = "(I)V")
	public abstract void method7446(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "dk", descriptor = "()I")
	public abstract int method7447();

	@OriginalMember(owner = "client!dn", name = "cw", descriptor = "()Z")
	abstract boolean method7448();

	@OriginalMember(owner = "client!dn", name = "fp", descriptor = "()Z")
	public abstract boolean method7449();

	@OriginalMember(owner = "client!dn", name = "ed", descriptor = "()I")
	public abstract int method7450();

	@OriginalMember(owner = "client!dn", name = "dv", descriptor = "()V")
	public abstract void method7451();

	@OriginalMember(owner = "client!dn", name = "ep", descriptor = "()I")
	public abstract int method7452();

	@OriginalMember(owner = "client!dn", name = "ew", descriptor = "()I")
	public abstract int method7453();

	@OriginalMember(owner = "client!dn", name = "al", descriptor = "(I[IIIIIZ)V")
	abstract void method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dn", name = "cq", descriptor = "(I[IIIIZI[I)V")
	abstract void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "ez", descriptor = "(I)V")
	public abstract void method7456(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ey", descriptor = "(I)V")
	public abstract void method7457(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ek", descriptor = "(I)V")
	public abstract void method7458(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "ce", descriptor = "(III)V")
	public abstract void method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "cj", descriptor = "(III)V")
	public abstract void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "el", descriptor = "()I")
	public abstract int method7461();

	@OriginalMember(owner = "client!dn", name = "em", descriptor = "()I")
	public abstract int method7462();

	@OriginalMember(owner = "client!dn", name = "et", descriptor = "()I")
	public abstract int method7463();

	@OriginalMember(owner = "client!dn", name = "eu", descriptor = "()I")
	public abstract int method7464();

	@OriginalMember(owner = "client!dn", name = "es", descriptor = "()I")
	public abstract int method7465();

	@OriginalMember(owner = "client!dn", name = "eh", descriptor = "()I")
	public abstract int method7466();

	@OriginalMember(owner = "client!dn", name = "en", descriptor = "(B[B)V")
	public abstract void method7467(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dn", name = "ex", descriptor = "(SS)V")
	public abstract void method7468(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "eg", descriptor = "(SS)V")
	public abstract void method7469(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "eb", descriptor = "(SS)V")
	public abstract void method7470(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dn", name = "ei", descriptor = "(IIII)V")
	public abstract void method7471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "ej", descriptor = "()[Lclient!dm;")
	public abstract Class228[] method7472();

	@OriginalMember(owner = "client!dn", name = "eq", descriptor = "()[Lclient!dm;")
	public abstract Class228[] method7473();

	@OriginalMember(owner = "client!dn", name = "fm", descriptor = "()Z")
	public abstract boolean method7475();

	@OriginalMember(owner = "client!dn", name = "fb", descriptor = "()Z")
	public abstract boolean method7476();

	@OriginalMember(owner = "client!dn", name = "fx", descriptor = "()Z")
	public abstract boolean method7477();

	@OriginalMember(owner = "client!dn", name = "fj", descriptor = "(I)V")
	public abstract void method7478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "fq", descriptor = "(I)V")
	public abstract void method7479(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dn", name = "fk", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dn", name = "fa", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dn", name = "fz", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dn", name = "fn", descriptor = "()I")
	public abstract int method7483();

	@OriginalMember(owner = "client!dn", name = "ar", descriptor = "()I")
	public abstract int method7485();

	@OriginalMember(owner = "client!dn", name = "fo", descriptor = "()Z")
	public abstract boolean method7486();

	@OriginalMember(owner = "client!dn", name = "dy", descriptor = "()I")
	public abstract int method7487();

	@OriginalMember(owner = "client!dn", name = "hv", descriptor = "(Lclient!akm;Lclient!are;IIZ[ZZI[I)V")
	final void method7488(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class80_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class217 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1619 * -1195478191; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray188[local5] == 0) {
				if (arg0.anIntArray188[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray189[local3++];
					if (local35 >= 0 && local35 < arg0.aClass217Array1.length) {
						local1 = arg0.aClass217Array1[local35];
					} else {
						local1 = null;
					}
					this.method7396(0, local1, arg1.method21786((short) -31290), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray187[local5], null);
				} else if (arg1.aClass231ArrayArray1[local5] != null) {
					@Pc(82) float local82 = 0.0F;
					@Pc(84) float local84 = 0.0F;
					@Pc(86) float local86 = 0.0F;
					@Pc(88) Object local88 = null;
					@Pc(90) Object local90 = null;
					@Pc(131) float[] local131;
					@Pc(139) float[] local139;
					if (local1 == null) {
						local131 = new float[] { 0.0F, 0.0F, 0.0F };
						local139 = new float[] { 0.0F, 0.0F, 0.0F };
					} else {
						local131 = new float[] { local1.method25858(arg1.method21786((short) -20255), (byte) -17).aFloatArray114[12], local1.method25858(arg1.method21786((short) -24682), (byte) -3).aFloatArray114[13], local1.method25858(arg1.method21786((short) -2631), (byte) -4).aFloatArray114[14] };
						local139 = local1.method25857(arg1.method21786((short) -4463), -91335482).method30163();
					}
					if (arg0.anIntArray188[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray188[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray188[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray188[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass231ArrayArray1[local5].length; local227++) {
						@Pc(241) Class231 local241 = arg1.aClass231ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method26009(arg2, 667317067);
							switch(local227) {
								case 0:
									local82 = local258;
									break;
								case 1:
									local84 = local258;
									break;
								case 2:
									local86 = local258;
									break;
								case 3:
									local82 = local258;
									break;
								case 4:
									local84 = local258;
									break;
								case 5:
									local86 = local258;
							}
						}
					}
					if (local225 == 9) {
						local82 = local86;
					}
					this.method7396(local225, local1, arg1.method21786((short) -2770), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray187[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "di", descriptor = "()I")
	public abstract int method7489();

	@OriginalMember(owner = "client!dn", name = "fc", descriptor = "(IILclient!ov;ZI)Z")
	public abstract boolean method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dn", name = "dq", descriptor = "()I")
	public abstract int method7492();

	@OriginalMember(owner = "client!dn", name = "bx", descriptor = "(Lclient!dn;IIIZ)V")
	public abstract void method7493(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dn", name = "cr", descriptor = "()V")
	abstract void method7494();

	@OriginalMember(owner = "client!dn", name = "be", descriptor = "()Z")
	public abstract boolean method7497();

	@OriginalMember(owner = "client!dn", name = "eo", descriptor = "()I")
	public abstract int method7498();

	@OriginalMember(owner = "client!dn", name = "fl", descriptor = "(IILclient!ov;ZI)Z")
	public abstract boolean method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dn", name = "ae", descriptor = "()I")
	public abstract int method7501();

	@OriginalMember(owner = "client!dn", name = "ag", descriptor = "()Z")
	abstract boolean method7502();

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "(Lclient!arn;ILclient!arn;IIIIZ)V")
	public final void method7503(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		@Pc(21) Class237 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass237Array1[arg3];
			if (local21.aClass80_Sub23_2 != local19) {
				local21 = null;
			}
		}
		this.method7347(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gb", descriptor = "(Lclient!dt;[II)Lclient!ep;")
	final Class247 method7504(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray94 != null) {
			@Pc(14) int local14 = arg0.anInt3779;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray94[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray91[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray92[local72];
						} else {
							local95 = arg0.aShortArray93[local72];
						}
						local115 = arg0.anIntArray340[local95];
						@Pc(120) int local120 = arg0.anIntArray341[local95];
						@Pc(125) int local125 = arg0.anIntArray343[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray74[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray339[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray339[local34];
						local284 = 64.0F / (float) arg0.anIntArray344[local34];
						local257 = 64.0F / (float) arg0.anIntArray348[local34];
					} else {
						local255 = (float) arg0.anIntArray339[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray344[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray348[local34] / 1024.0F;
					}
					local8[local34] = method7323(arg0.aShortArray96[local34], arg0.aShortArray88[local34], arg0.aShortArray97[local34], arg0.aByteArray75[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class247(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dn", name = "ga", descriptor = "(BIZ)Lclient!dn;")
	public abstract Class105 method7506(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dn", name = "ha", descriptor = "(Lclient!arn;I)V")
	public final void method7508(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3807; local21++) {
			@Pc(30) short local30 = local16.aShortArray104[local21];
			if (local19.aBooleanArray8[local30]) {
				if (local16.aShortArray106[local21] != -1) {
					this.method7335(0, 0, 0, 0);
				}
				this.method7335(local19.anIntArray188[local30], local16.aShortArray108[local21], local16.aShortArray107[local21], local16.aShortArray105[local21]);
			}
		}
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "bi", descriptor = "()I")
	public abstract int method7509();

	@OriginalMember(owner = "client!dn", name = "gc", descriptor = "()V")
	public abstract void method7510();

	@OriginalMember(owner = "client!dn", name = "cx", descriptor = "()V")
	abstract void method7511();

	@OriginalMember(owner = "client!dn", name = "gf", descriptor = "()V")
	public abstract void method7512();

	@OriginalMember(owner = "client!dn", name = "go", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method7513(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2950(arg1 + local10, arg3 + local15, 1888522027);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2950(arg1 + local29, arg3 + local34, -808977077);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2950(arg1 + local49, arg3 + local53, 545163759);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2950(arg1 + local67, arg3 + local71, 1603356115);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method7330(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method7318(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method7332(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "co", descriptor = "(I[IIIIIZ)V")
	abstract void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dn", name = "gr", descriptor = "(Lclient!arn;ILclient!arn;IIIIZ)V")
	public final void method7515(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		@Pc(21) Class237 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass237Array1[arg3];
			if (local21.aClass80_Sub23_2 != local19) {
				local21 = null;
			}
		}
		this.method7347(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gu", descriptor = "(Lclient!arn;ILclient!arn;IIIIZ)V")
	public final void method7516(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		@Pc(21) Class237 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass237Array1[arg3];
			if (local21.aClass80_Sub23_2 != local19) {
				local21 = null;
			}
		}
		this.method7347(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gt", descriptor = "(Lclient!are;IIZ)V")
	public final void method7517(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method7337();
		if (this.method7502()) {
			@Pc(10) Class80_Sub23 local10 = arg0.aClass80_Sub23_1;
			this.method7415(local10, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method7357();
			this.method7325();
		} else {
			this.method7325();
		}
	}

	@OriginalMember(owner = "client!dn", name = "gy", descriptor = "(Lclient!are;IIZ)V")
	public final void method7518(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method7337();
		if (this.method7502()) {
			@Pc(10) Class80_Sub23 local10 = arg0.aClass80_Sub23_1;
			this.method7415(local10, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method7357();
			this.method7325();
		} else {
			this.method7325();
		}
	}

	@OriginalMember(owner = "client!dn", name = "gl", descriptor = "(Lclient!are;IIZ)V")
	public final void method7519(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method7337();
		if (this.method7502()) {
			@Pc(10) Class80_Sub23 local10 = arg0.aClass80_Sub23_1;
			this.method7415(local10, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method7357();
			this.method7325();
		} else {
			this.method7325();
		}
	}

	@OriginalMember(owner = "client!dn", name = "gm", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!arn;ILclient!arn;III[ZZ)V")
	public final void method7520(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub7 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class80_Sub1_Sub7 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(32) Class237 local32 = arg0.aClass237Array1[arg1];
		@Pc(35) Class80_Sub23 local35 = local32.aClass80_Sub23_2;
		@Pc(37) Class237 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass237Array1[arg3];
			if (local37.aClass80_Sub23_2 != local35) {
				local37 = null;
			}
		}
		this.method7347(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class237 local68 = arg6.aClass237Array1[arg7];
		@Pc(70) Class237 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass237Array1[arg9];
			if (local70.aClass80_Sub23_2 != local35) {
				local70 = null;
			}
		}
		this.method7339(0, new int[0], 0, 0, 0, 0, arg13);
		this.method7347(local68.aClass80_Sub23_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gq", descriptor = "(Lclient!are;ILclient!are;I[ZZ)V")
	public final void method7521(@OriginalArg(0) Class80_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 == null) {
			return;
		}
		if (arg4 == null || arg2 == null) {
			this.method7340(arg0, arg1, 0, arg5);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(24) Class80_Sub23 local24 = arg0.aClass80_Sub23_1;
		@Pc(32) int local32 = arg1 % (arg0.method21787(407918167) + 1);
		this.method7415(local24, arg0, local32, 0, arg5, arg4, false, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg5);
		@Pc(56) Class80_Sub23 local56 = arg2.aClass80_Sub23_1;
		@Pc(64) int local64 = arg3 % (arg2.method21787(1812139468) + 1);
		this.method7415(local56, arg2, local64, 0, arg5, arg4, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "gx", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!are;I[ZZ)V")
	public final void method7522(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(31) Class237 local31 = arg0.aClass237Array1[arg1];
		@Pc(34) Class80_Sub23 local34 = local31.aClass80_Sub23_2;
		@Pc(36) Class237 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass237Array1[arg3];
			if (local36.aClass80_Sub23_2 != local34) {
				local36 = null;
			}
		}
		this.method7347(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class80_Sub23 local75 = arg6.aClass80_Sub23_1;
		@Pc(83) int local83 = arg7 % (arg6.method21787(-250171929) + 1);
		this.method7415(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "dg", descriptor = "(I[IIIIZI[I)V")
	abstract void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dn", name = "gs", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!are;I[ZZ)V")
	public final void method7524(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(31) Class237 local31 = arg0.aClass237Array1[arg1];
		@Pc(34) Class80_Sub23 local34 = local31.aClass80_Sub23_2;
		@Pc(36) Class237 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass237Array1[arg3];
			if (local36.aClass80_Sub23_2 != local34) {
				local36 = null;
			}
		}
		this.method7347(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method7339(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class80_Sub23 local75 = arg6.aClass80_Sub23_1;
		@Pc(83) int local83 = arg7 % (arg6.method21787(1426356104) + 1);
		this.method7415(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "hp", descriptor = "(Lclient!arn;I)V")
	public final void method7525(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(16) Class237 local16 = arg0.aClass237Array1[arg1];
		@Pc(19) Class80_Sub23 local19 = local16.aClass80_Sub23_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3807; local21++) {
			@Pc(30) short local30 = local16.aShortArray104[local21];
			if (local19.aBooleanArray8[local30]) {
				if (local16.aShortArray106[local21] != -1) {
					this.method7335(0, 0, 0, 0);
				}
				this.method7335(local19.anIntArray188[local30], local16.aShortArray108[local21], local16.aShortArray107[local21], local16.aShortArray105[local21]);
			}
		}
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "fw", descriptor = "()Z")
	public abstract boolean method7526();

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(Lclient!arn;ILclient!arn;IIILclient!arn;ILclient!arn;III[ZZ)V")
	public final void method7527(@OriginalArg(0) Class80_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class80_Sub1_Sub7 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class80_Sub1_Sub7 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method7503(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method7337();
		if (!this.method7502()) {
			this.method7325();
			return;
		}
		@Pc(32) Class237 local32 = arg0.aClass237Array1[arg1];
		@Pc(35) Class80_Sub23 local35 = local32.aClass80_Sub23_2;
		@Pc(37) Class237 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass237Array1[arg3];
			if (local37.aClass80_Sub23_2 != local35) {
				local37 = null;
			}
		}
		this.method7347(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class237 local68 = arg6.aClass237Array1[arg7];
		@Pc(70) Class237 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass237Array1[arg9];
			if (local70.aClass80_Sub23_2 != local35) {
				local70 = null;
			}
		}
		this.method7339(0, new int[0], 0, 0, 0, 0, arg13);
		this.method7347(local68.aClass80_Sub23_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method7357();
		this.method7325();
	}

	@OriginalMember(owner = "client!dn", name = "hn", descriptor = "(Lclient!akm;Lclient!dz;Lclient!dz;III[ZZZI[I)V")
	final void method7528(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3807; local5++) {
				@Pc(14) short local14 = arg1.aShortArray104[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray188[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray106[local5];
					if (local32 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local32], arg10);
					}
					this.method7349(arg0.anIntArray188[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray108[local5], arg1.aShortArray107[local5], arg1.aShortArray105[local5], arg5, arg8, arg9 & arg0.anIntArray187[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1619 * -1195478191; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3807 && arg1.aShortArray104[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3807 && arg2.aShortArray104[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray188[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray188[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray108[local5];
						local179 = arg1.aShortArray107[local5];
						local184 = arg1.aShortArray105[local5];
						local189 = arg1.aShortArray106[local5];
						local194 = arg1.aByteArray78[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray108[local92];
						local218 = arg2.aShortArray107[local92];
						local223 = arg2.aShortArray105[local92];
						local228 = arg2.aShortArray106[local92];
						local233 = arg2.aByteArray78[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local189], arg10);
					} else if (local228 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local228], arg10);
					}
					this.method7349(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray187[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "hw", descriptor = "(Lclient!akm;Lclient!dz;Lclient!dz;III[ZZZI[I)V")
	final void method7529(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3807; local5++) {
				@Pc(14) short local14 = arg1.aShortArray104[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray188[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray106[local5];
					if (local32 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local32], arg10);
					}
					this.method7349(arg0.anIntArray188[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray108[local5], arg1.aShortArray107[local5], arg1.aShortArray105[local5], arg5, arg8, arg9 & arg0.anIntArray187[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1619 * -1195478191; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3807 && arg1.aShortArray104[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3807 && arg2.aShortArray104[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray188[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray188[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray108[local5];
						local179 = arg1.aShortArray107[local5];
						local184 = arg1.aShortArray105[local5];
						local189 = arg1.aShortArray106[local5];
						local194 = arg1.aByteArray78[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray108[local92];
						local218 = arg2.aShortArray107[local92];
						local223 = arg2.aShortArray105[local92];
						local228 = arg2.aShortArray106[local92];
						local233 = arg2.aByteArray78[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local189], arg10);
					} else if (local228 != -1) {
						this.method7349(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray187[local228], arg10);
					}
					this.method7349(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray187[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "hk", descriptor = "(Lclient!akm;Lclient!are;IIZ[ZZI[I)V")
	final void method7530(@OriginalArg(0) Class80_Sub23 arg0, @OriginalArg(1) Class80_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class217 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1619 * -1195478191; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray188[local5] == 0) {
				if (arg0.anIntArray188[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray189[local3++];
					if (local35 >= 0 && local35 < arg0.aClass217Array1.length) {
						local1 = arg0.aClass217Array1[local35];
					} else {
						local1 = null;
					}
					this.method7396(0, local1, arg1.method21786((short) -14353), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray187[local5], null);
				} else if (arg1.aClass231ArrayArray1[local5] != null) {
					@Pc(82) float local82 = 0.0F;
					@Pc(84) float local84 = 0.0F;
					@Pc(86) float local86 = 0.0F;
					@Pc(88) Object local88 = null;
					@Pc(90) Object local90 = null;
					@Pc(131) float[] local131;
					@Pc(139) float[] local139;
					if (local1 == null) {
						local131 = new float[] { 0.0F, 0.0F, 0.0F };
						local139 = new float[] { 0.0F, 0.0F, 0.0F };
					} else {
						local131 = new float[] { local1.method25858(arg1.method21786((short) -29539), (byte) -8).aFloatArray114[12], local1.method25858(arg1.method21786((short) -20324), (byte) -8).aFloatArray114[13], local1.method25858(arg1.method21786((short) -8282), (byte) -99).aFloatArray114[14] };
						local139 = local1.method25857(arg1.method21786((short) -8925), -91335482).method30163();
					}
					if (arg0.anIntArray188[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray188[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray188[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray188[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass231ArrayArray1[local5].length; local227++) {
						@Pc(241) Class231 local241 = arg1.aClass231ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method26009(arg2, 667317067);
							switch(local227) {
								case 0:
									local82 = local258;
									break;
								case 1:
									local84 = local258;
									break;
								case 2:
									local86 = local258;
									break;
								case 3:
									local82 = local258;
									break;
								case 4:
									local84 = local258;
									break;
								case 5:
									local86 = local258;
							}
						}
					}
					if (local225 == 9) {
						local82 = local86;
					}
					this.method7396(local225, local1, arg1.method21786((short) -21267), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray187[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "fh", descriptor = "()I")
	public abstract int method7531();

	@OriginalMember(owner = "client!dn", name = "hq", descriptor = "(I[IIIIIZI[I)V")
	final void method7532(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dn", name = "ap", descriptor = "()I")
	public abstract int method7533();

	@OriginalMember(owner = "client!dn", name = "he", descriptor = "(ILclient!cw;I[IFFFIZI[I)V")
	final void method7534(@OriginalArg(0) int arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25860(arg2, -1046045495).aFloatArray114[12];
			local5 = (int) -arg1.method25860(arg2, 261746270).aFloatArray114[13];
			local8 = (int) -arg1.method25860(arg2, -1745270875).aFloatArray114[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25857(arg2, -91335482).method30085(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25860(arg2, -629893099).method30171(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class487 local109 = Class487.method30168();
				local109.method30137(arg5, arg4, arg6);
				if (arg1.aClass217_1 != null) {
					local109.method30078(arg1.aClass217_1.method25860(arg2, -1978854253));
				}
				local109.method30082();
				local109.method30078(arg1.method25860(arg2, -1363304461));
				local64 = local109.method30163();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30147();
			} else if (arg0 == 3 || arg0 == 10) {
				local2 = (int) (arg4 * 128.0F);
				local5 = (int) (arg5 * 128.0F);
				local8 = (int) (arg6 * 128.0F);
			} else if (arg0 == 9) {
				local2 = (int) (arg4 * 2607.5945F) & 0x3FFF;
			} else if (arg0 == 5) {
				local2 = (int) (32.0F - arg4 * 32.0F);
			}
		}
		@Pc(220) int local220;
		if (arg7 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local220 = -local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 3) {
				local220 = local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 2) {
				local220 = local2;
				local2 = -local8 & 0x3FFF;
				local8 = local220 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				local2 = -local2;
				local8 = -local8;
			} else if (arg0 == 2) {
				local2 = -local2 & 0x3FFF;
				local8 = -local8 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local220 = local2;
				local2 = -local8;
				local8 = local220;
			} else if (arg0 == 3) {
				local220 = local2;
				local2 = local8;
				local8 = local220;
			} else if (arg0 == 2) {
				local220 = local2;
				local2 = local8 & 0x3FFF;
				local8 = -local220 & 0x3FFF;
			}
		}
		if (arg9 == 65535) {
			this.method7454(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method7355(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!dn", name = "hx", descriptor = "()[B")
	public abstract byte[] method7535();

	@OriginalMember(owner = "client!dn", name = "hc", descriptor = "()[B")
	public abstract byte[] method7536();

	@OriginalMember(owner = "client!dn", name = "ho", descriptor = "()[B")
	public abstract byte[] method7537();

	@OriginalMember(owner = "client!dn", name = "hu", descriptor = "()[B")
	public abstract byte[] method7538();
}
