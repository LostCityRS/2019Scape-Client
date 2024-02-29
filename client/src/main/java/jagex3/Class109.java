package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!do")
public abstract class Class109 {

	@OriginalMember(owner = "client!do", name = "n", descriptor = "F")
	static final float aFloat81 = 2607.5945F;

	@OriginalMember(owner = "client!do", name = "e", descriptor = "F")
	static final float aFloat82 = 3.1415927F;

	@OriginalMember(owner = "client!do", name = "m", descriptor = "Z")
	protected boolean aBoolean162 = false;

	@OriginalMember(owner = "client!do", name = "k", descriptor = "Z")
	public boolean aBoolean161 = true;

	@OriginalMember(owner = "client!do", name = "n", descriptor = "(IIIIII[FFIF[F)V")
	static void method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
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

	@OriginalMember(owner = "client!do", name = "m", descriptor = "(FFF)I")
	static int method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!do", name = "w", descriptor = "(IIIIFFF)[F")
	static float[] method6822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
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

	@OriginalMember(owner = "client!do", name = "k", descriptor = "(IIIIIII[FIFFF[F)V")
	static void method6842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
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

	@OriginalMember(owner = "client!do", name = "e", descriptor = "(IIIIII[FIF[F)V")
	static void method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
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

	@OriginalMember(owner = "client!do", name = "fh", descriptor = "(IIIIII[FFIF[F)V")
	static void method6901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
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

	@OriginalMember(owner = "client!do", name = "fy", descriptor = "(IIIIII[FIF[F)V")
	static void method6975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
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

	@OriginalMember(owner = "client!do", name = "fo", descriptor = "(IIIIII[FIF[F)V")
	static void method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
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

	@OriginalMember(owner = "client!do", name = "fe", descriptor = "(IIIIII[FIF[F)V")
	static void method6994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
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

	@OriginalMember(owner = "client!do", name = "fk", descriptor = "(IIIIII[FFIF[F)V")
	static void method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
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

	@OriginalMember(owner = "client!do", name = "<init>", descriptor = "()V")
	Class109() {
	}

	@OriginalMember(owner = "client!do", name = "t", descriptor = "(Lclient!ard;ILclient!ard;I[ZZ)V")
	public final void method6816(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 == null) {
			return;
		}
		if (arg4 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg5);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(59862202) + 1);
		this.method6847(local24, arg0, local32, 0, arg5, arg4, false, 65535, null);
		this.method6851(0, new int[0], 0, 0, 0, 0, arg5);
		@Pc(56) Class93_Sub25 local56 = arg2.aClass93_Sub25_1;
		@Pc(64) int local64 = arg3 % (arg2.method21556(815487614) + 1);
		this.method6847(local56, arg2, local64, 0, arg5, arg4, true, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "cs", descriptor = "()V")
	abstract void method6817();

	@OriginalMember(owner = "client!do", name = "bo", descriptor = "(Lclient!do;IIIZ)V")
	public abstract void method6820(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!do", name = "f", descriptor = "(Lclient!dq;[II)Lclient!ee;")
	final Class242 method6821(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray96 != null) {
			@Pc(14) int local14 = arg0.anInt3785;
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
				@Pc(77) short local77 = arg0.aShortArray96[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray97[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray88[local72];
						} else {
							local95 = arg0.aShortArray92[local72];
						}
						local115 = arg0.anIntArray341[local95];
						@Pc(120) int local120 = arg0.anIntArray344[local95];
						@Pc(125) int local125 = arg0.anIntArray351[local95];
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
				@Pc(205) byte local205 = arg0.aByteArray68[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray347[local34];
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
						local284 = 64.0F / (float) arg0.anIntArray348[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray347[local34];
						local284 = 64.0F / (float) arg0.anIntArray348[local34];
						local257 = 64.0F / (float) arg0.anIntArray349[local34];
					} else {
						local255 = (float) arg0.anIntArray347[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray348[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray349[local34] / 1024.0F;
					}
					local8[local34] = method6822(arg0.aShortArray93[local34], arg0.aShortArray94[local34], arg0.aShortArray95[local34], arg0.aByteArray75[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class242(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!do", name = "by", descriptor = "(Lclient!ou;)V")
	public abstract void method6823(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!do", name = "u", descriptor = "(I)V")
	public abstract void method6824(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "z", descriptor = "()I")
	public abstract int method6825();

	@OriginalMember(owner = "client!do", name = "fb", descriptor = "(Lclient!ou;Lclient!ed;I)V")
	public abstract void method6826(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "d", descriptor = "(I)V")
	public abstract void method6827(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "c", descriptor = "(I)V")
	public abstract void method6828(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "af", descriptor = "()I")
	public abstract int method6829();

	@OriginalMember(owner = "client!do", name = "v", descriptor = "(I)V")
	public abstract void method6830(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "j", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method6831(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class93_Sub1_Sub10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(32) Class236 local32 = arg0.aClass236Array1[arg1];
		@Pc(35) Class93_Sub25 local35 = local32.aClass93_Sub25_2;
		@Pc(37) Class236 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass236Array1[arg3];
			if (local37.aClass93_Sub25_2 != local35) {
				local37 = null;
			}
		}
		this.method6846(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class236 local68 = arg6.aClass236Array1[arg7];
		@Pc(70) Class236 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass236Array1[arg9];
			if (local70.aClass93_Sub25_2 != local35) {
				local70 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6846(local68.aClass93_Sub25_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "s", descriptor = "()V")
	public abstract void method6832();

	@OriginalMember(owner = "client!do", name = "y", descriptor = "(III)V")
	public abstract void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "q", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method6834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!do", name = "x", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method6835(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2481(arg1 + local10, arg3 + local15, 161263654);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2481(arg1 + local29, arg3 + local34, -838709352);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2481(arg1 + local49, arg3 + local53, 58836091);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2481(arg1 + local67, arg3 + local71, -1951636335);
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
				this.method6986(local124);
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
				this.method6830(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6939(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!do", name = "b", descriptor = "()V")
	abstract void method6836();

	@OriginalMember(owner = "client!do", name = "h", descriptor = "()V")
	abstract void method6837();

	@OriginalMember(owner = "client!do", name = "a", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V")
	public final void method6838(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		@Pc(21) Class236 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass236Array1[arg3];
			if (local21.aClass93_Sub25_2 != local19) {
				local21 = null;
			}
		}
		this.method6846(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "g", descriptor = "(Lclient!ard;IIZ)V")
	public final void method6839(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method6836();
		if (this.method6850()) {
			@Pc(10) Class93_Sub25 local10 = arg0.aClass93_Sub25_1;
			this.method6847(local10, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method6910();
			this.method6837();
		} else {
			this.method6837();
		}
	}

	@OriginalMember(owner = "client!do", name = "i", descriptor = "(Lclient!arr;ILclient!arr;IIIIIZ[I)V")
	public final void method6840(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		@Pc(21) Class236 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass236Array1[arg3];
			if (local21.aClass93_Sub25_2 != local19) {
				local21 = null;
			}
		}
		this.method6846(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "bf", descriptor = "()I")
	public abstract int method6841();

	@OriginalMember(owner = "client!do", name = "ae", descriptor = "(Lclient!ard;ILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method6843(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93_Sub1_Sub10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(1668528215) + 1);
		this.method6847(local24, arg0, local32, 0, arg9, arg8, false, 65535, null);
		@Pc(48) Class236 local48 = arg2.aClass236Array1[arg3];
		@Pc(50) Class236 local50 = null;
		if (arg4 != null) {
			local50 = arg4.aClass236Array1[arg5];
			if (local50.aClass93_Sub25_2 != local24) {
				local50 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		this.method6846(local48.aClass93_Sub25_2, local48, local50, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ag", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!ard;I[ZZ)V")
	public final void method6844(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(31) Class236 local31 = arg0.aClass236Array1[arg1];
		@Pc(34) Class93_Sub25 local34 = local31.aClass93_Sub25_2;
		@Pc(36) Class236 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass236Array1[arg3];
			if (local36.aClass93_Sub25_2 != local34) {
				local36 = null;
			}
		}
		this.method6846(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class93_Sub25 local75 = arg6.aClass93_Sub25_1;
		@Pc(83) int local83 = arg7 % (arg6.method21556(617325193) + 1);
		this.method6847(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ad", descriptor = "(I[IIIIIZ)V")
	abstract void method6845(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "al", descriptor = "(Lclient!ako;Lclient!dx;Lclient!dx;III[ZZZI[I)V")
	final void method6846(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3852; local5++) {
				@Pc(14) short local14 = arg1.aShortArray105[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray180[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray108[local5];
					if (local32 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local32], arg10);
					}
					this.method6848(arg0.anIntArray180[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray103[local5], arg1.aShortArray99[local5], arg1.aShortArray106[local5], arg5, arg8, arg9 & arg0.anIntArray181[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1590 * 1418467783; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3852 && arg1.aShortArray105[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3852 && arg2.aShortArray105[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray180[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray180[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray103[local5];
						local179 = arg1.aShortArray99[local5];
						local184 = arg1.aShortArray106[local5];
						local189 = arg1.aShortArray108[local5];
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
						local213 = arg2.aShortArray103[local92];
						local218 = arg2.aShortArray99[local92];
						local223 = arg2.aShortArray106[local92];
						local228 = arg2.aShortArray108[local92];
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
						this.method6848(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local189], arg10);
					} else if (local228 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local228], arg10);
					}
					this.method6848(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray181[local94], arg10);
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

	@OriginalMember(owner = "client!do", name = "ac", descriptor = "(Lclient!ako;Lclient!ard;IIZ[ZZI[I)V")
	final void method6847(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class93_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class212 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1590 * 1418467783; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray180[local5] == 0) {
				if (arg0.anIntArray180[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray179[local3++];
					if (local35 >= 0 && local35 < arg0.aClass212Array1.length) {
						local1 = arg0.aClass212Array1[local35];
					} else {
						local1 = null;
					}
					this.method6890(0, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray181[local5], null);
				} else if (arg1.aClass230ArrayArray1[local5] != null) {
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
						local131 = new float[] { local1.method25531(arg1.method21553(1747197434), (byte) 78).aFloatArray116[12], local1.method25531(arg1.method21553(1747197434), (byte) 74).aFloatArray116[13], local1.method25531(arg1.method21553(1747197434), (byte) 102).aFloatArray116[14] };
						local139 = local1.method25525(arg1.method21553(1747197434), (byte) 0).method30016();
					}
					if (arg0.anIntArray180[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray180[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray180[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray180[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass230ArrayArray1[local5].length; local227++) {
						@Pc(241) Class230 local241 = arg1.aClass230ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method25721(arg2, -772974848);
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
					this.method6890(local225, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray181[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!do", name = "ai", descriptor = "(I[IIIIIZI[I)V")
	final void method6848(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
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
			this.method6851(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6853(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!do", name = "fr", descriptor = "(Lclient!dq;[II)Lclient!ee;")
	final Class242 method6849(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray96 != null) {
			@Pc(14) int local14 = arg0.anInt3785;
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
				@Pc(77) short local77 = arg0.aShortArray96[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray97[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray88[local72];
						} else {
							local95 = arg0.aShortArray92[local72];
						}
						local115 = arg0.anIntArray341[local95];
						@Pc(120) int local120 = arg0.anIntArray344[local95];
						@Pc(125) int local125 = arg0.anIntArray351[local95];
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
				@Pc(205) byte local205 = arg0.aByteArray68[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray347[local34];
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
						local284 = 64.0F / (float) arg0.anIntArray348[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray347[local34];
						local284 = 64.0F / (float) arg0.anIntArray348[local34];
						local257 = 64.0F / (float) arg0.anIntArray349[local34];
					} else {
						local255 = (float) arg0.anIntArray347[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray348[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray349[local34] / 1024.0F;
					}
					local8[local34] = method6822(arg0.aShortArray93[local34], arg0.aShortArray94[local34], arg0.aShortArray95[local34], arg0.aByteArray75[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class242(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!do", name = "as", descriptor = "()Z")
	abstract boolean method6850();

	@OriginalMember(owner = "client!do", name = "at", descriptor = "(I[IIIIIZ)V")
	abstract void method6851(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "ea", descriptor = "(B[B)V")
	public abstract void method6852(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!do", name = "am", descriptor = "(I[IIIIZI[I)V")
	abstract void method6853(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!do", name = "au", descriptor = "(I[IIIIZI[I)V")
	abstract void method6854(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!do", name = "ar", descriptor = "(IIII)V")
	abstract void method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "co", descriptor = "(III)V")
	public abstract void method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "ez", descriptor = "()[B")
	public abstract byte[] method6857();

	@OriginalMember(owner = "client!do", name = "ew", descriptor = "(B[B)V")
	public abstract void method6858(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!do", name = "av", descriptor = "(IILclient!ou;ZI)Z")
	public abstract boolean method6859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!do", name = "ao", descriptor = "(Lclient!ara;)Lclient!ara;")
	public abstract Class93_Sub1_Sub4 method6860(@OriginalArg(0) Class93_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!do", name = "aj", descriptor = "()I")
	public abstract int method6861();

	@OriginalMember(owner = "client!do", name = "ay", descriptor = "()I")
	public abstract int method6862();

	@OriginalMember(owner = "client!do", name = "ab", descriptor = "()I")
	public abstract int method6863();

	@OriginalMember(owner = "client!do", name = "az", descriptor = "()I")
	public abstract int method6864();

	@OriginalMember(owner = "client!do", name = "bb", descriptor = "()Z")
	public abstract boolean method6865();

	@OriginalMember(owner = "client!do", name = "db", descriptor = "()I")
	public abstract int method6866();

	@OriginalMember(owner = "client!do", name = "ak", descriptor = "()I")
	public abstract int method6867();

	@OriginalMember(owner = "client!do", name = "fa", descriptor = "(I)V")
	public abstract void method6868(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "fu", descriptor = "()[Lclient!cq;")
	public abstract Class210[] method6869();

	@OriginalMember(owner = "client!do", name = "bl", descriptor = "()V")
	public abstract void method6870();

	@OriginalMember(owner = "client!do", name = "gp", descriptor = "(Lclient!arr;ILclient!arr;IIIIIZ[I)V")
	public final void method6871(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		@Pc(21) Class236 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass236Array1[arg3];
			if (local21.aClass93_Sub25_2 != local19) {
				local21 = null;
			}
		}
		this.method6846(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "bh", descriptor = "(I)V")
	public abstract void method6872(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "cf", descriptor = "(III)V")
	public abstract void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "bd", descriptor = "()I")
	public abstract int method6874();

	@OriginalMember(owner = "client!do", name = "bc", descriptor = "()[B")
	public abstract byte[] method6875();

	@OriginalMember(owner = "client!do", name = "gy", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method6876(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class93_Sub1_Sub10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(32) Class236 local32 = arg0.aClass236Array1[arg1];
		@Pc(35) Class93_Sub25 local35 = local32.aClass93_Sub25_2;
		@Pc(37) Class236 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass236Array1[arg3];
			if (local37.aClass93_Sub25_2 != local35) {
				local37 = null;
			}
		}
		this.method6846(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class236 local68 = arg6.aClass236Array1[arg7];
		@Pc(70) Class236 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass236Array1[arg9];
			if (local70.aClass93_Sub25_2 != local35) {
				local70 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6846(local68.aClass93_Sub25_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "hm", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "bt", descriptor = "(SS)V")
	public abstract void method6878(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!do", name = "bq", descriptor = "(IIII)V")
	public abstract void method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "bm", descriptor = "()Z")
	public abstract boolean method6880();

	@OriginalMember(owner = "client!do", name = "bn", descriptor = "(B[B)V")
	public abstract void method6881(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!do", name = "aa", descriptor = "()I")
	public abstract int method6882();

	@OriginalMember(owner = "client!do", name = "cq", descriptor = "(III)V")
	public abstract void method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "bu", descriptor = "()[Lclient!du;")
	public abstract Class234[] method6884();

	@OriginalMember(owner = "client!do", name = "cg", descriptor = "(I)V")
	public abstract void method6885(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "gz", descriptor = "(I[IIIIIZI[I)V")
	final void method6886(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
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
			this.method6851(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6853(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!do", name = "bz", descriptor = "(Lclient!do;IIIZ)V")
	public abstract void method6888(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!do", name = "br", descriptor = "(BIZ)Lclient!do;")
	public abstract Class109 method6889(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "aw", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method6890(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "ba", descriptor = "()I")
	public abstract int method6891();

	@OriginalMember(owner = "client!do", name = "bp", descriptor = "()I")
	public abstract int method6892();

	@OriginalMember(owner = "client!do", name = "bj", descriptor = "(I)V")
	public abstract void method6893(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "eq", descriptor = "()I")
	public abstract int method6894();

	@OriginalMember(owner = "client!do", name = "cl", descriptor = "()V")
	public abstract void method6895();

	@OriginalMember(owner = "client!do", name = "fq", descriptor = "(IIII)V")
	abstract void method6896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "ce", descriptor = "(I)V")
	public abstract void method6897(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "cu", descriptor = "(I)V")
	public abstract void method6898(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "bw", descriptor = "()[Lclient!cq;")
	public abstract Class210[] method6899();

	@OriginalMember(owner = "client!do", name = "cn", descriptor = "(I)V")
	public abstract void method6900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "cp", descriptor = "(I)V")
	public abstract void method6902(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "ci", descriptor = "(I)V")
	public abstract void method6903(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "cx", descriptor = "(I)V")
	public abstract void method6904(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "aq", descriptor = "(Lclient!ou;IZ)V")
	public abstract void method6905(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "ct", descriptor = "()V")
	public abstract void method6906();

	@OriginalMember(owner = "client!do", name = "l", descriptor = "(BIZ)Lclient!do;")
	public abstract Class109 method6907(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "cm", descriptor = "(III)V")
	public abstract void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "cr", descriptor = "(III)V")
	public abstract void method6909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "ap", descriptor = "()V")
	abstract void method6910();

	@OriginalMember(owner = "client!do", name = "gk", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V")
	public final void method6911(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		@Pc(21) Class236 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass236Array1[arg3];
			if (local21.aClass93_Sub25_2 != local19) {
				local21 = null;
			}
		}
		this.method6846(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ch", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	public abstract void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!do", name = "cb", descriptor = "()V")
	abstract void method6913();

	@OriginalMember(owner = "client!do", name = "bv", descriptor = "(Lclient!do;IIIZ)V")
	public abstract void method6914(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!do", name = "cy", descriptor = "()V")
	abstract void method6915();

	@OriginalMember(owner = "client!do", name = "ha", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "cz", descriptor = "()Z")
	abstract boolean method6917();

	@OriginalMember(owner = "client!do", name = "ck", descriptor = "()V")
	abstract void method6918();

	@OriginalMember(owner = "client!do", name = "cj", descriptor = "(I[IIIIIZ)V")
	abstract void method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "dd", descriptor = "(I[IIIIIZ)V")
	abstract void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "cc", descriptor = "()Z")
	abstract boolean method6921();

	@OriginalMember(owner = "client!do", name = "dg", descriptor = "()I")
	public abstract int method6922();

	@OriginalMember(owner = "client!do", name = "dt", descriptor = "(I[IIIIIZ)V")
	abstract void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "do", descriptor = "(I[IIIIZI[I)V")
	abstract void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!do", name = "dz", descriptor = "(I[IIIIZI[I)V")
	abstract void method6925(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!do", name = "dv", descriptor = "(I[IIIIZI[I)V")
	abstract void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!do", name = "dm", descriptor = "(Lclient!ou;IZ)V")
	public abstract void method6927(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "an", descriptor = "()I")
	public abstract int method6928();

	@OriginalMember(owner = "client!do", name = "dc", descriptor = "(Lclient!ou;IZ)V")
	public abstract void method6929(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "di", descriptor = "(IILclient!ou;ZI)Z")
	public abstract boolean method6930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!do", name = "dk", descriptor = "(IILclient!ou;ZI)Z")
	public abstract boolean method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!do", name = "eu", descriptor = "()I")
	public abstract int method6932();

	@OriginalMember(owner = "client!do", name = "df", descriptor = "(Lclient!ara;)Lclient!ara;")
	public abstract Class93_Sub1_Sub4 method6933(@OriginalArg(0) Class93_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!do", name = "dw", descriptor = "()V")
	public abstract void method6934();

	@OriginalMember(owner = "client!do", name = "ds", descriptor = "()I")
	public abstract int method6935();

	@OriginalMember(owner = "client!do", name = "du", descriptor = "()I")
	public abstract int method6936();

	@OriginalMember(owner = "client!do", name = "dl", descriptor = "()I")
	public abstract int method6937();

	@OriginalMember(owner = "client!do", name = "dp", descriptor = "()I")
	public abstract int method6938();

	@OriginalMember(owner = "client!do", name = "o", descriptor = "(III)V")
	public abstract void method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "en", descriptor = "(SS)V")
	public abstract void method6940(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!do", name = "dh", descriptor = "()I")
	public abstract int method6941();

	@OriginalMember(owner = "client!do", name = "dx", descriptor = "()I")
	public abstract int method6942();

	@OriginalMember(owner = "client!do", name = "ee", descriptor = "()I")
	public abstract int method6943();

	@OriginalMember(owner = "client!do", name = "de", descriptor = "()I")
	public abstract int method6944();

	@OriginalMember(owner = "client!do", name = "dj", descriptor = "()I")
	public abstract int method6945();

	@OriginalMember(owner = "client!do", name = "be", descriptor = "()Z")
	public abstract boolean method6946();

	@OriginalMember(owner = "client!do", name = "ax", descriptor = "(Lclient!ou;Lclient!ed;I)V")
	public abstract void method6947(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "eo", descriptor = "()I")
	public abstract int method6948();

	@OriginalMember(owner = "client!do", name = "ed", descriptor = "()I")
	public abstract int method6949();

	@OriginalMember(owner = "client!do", name = "p", descriptor = "()V")
	public abstract void method6950();

	@OriginalMember(owner = "client!do", name = "es", descriptor = "()I")
	public abstract int method6951();

	@OriginalMember(owner = "client!do", name = "ei", descriptor = "()I")
	public abstract int method6952();

	@OriginalMember(owner = "client!do", name = "el", descriptor = "()I")
	public abstract int method6953();

	@OriginalMember(owner = "client!do", name = "ej", descriptor = "()I")
	public abstract int method6954();

	@OriginalMember(owner = "client!do", name = "ep", descriptor = "()I")
	public abstract int method6955();

	@OriginalMember(owner = "client!do", name = "ev", descriptor = "()I")
	public abstract int method6956();

	@OriginalMember(owner = "client!do", name = "fn", descriptor = "()Z")
	public abstract boolean method6957();

	@OriginalMember(owner = "client!do", name = "ek", descriptor = "()I")
	public abstract int method6958();

	@OriginalMember(owner = "client!do", name = "fw", descriptor = "(I)V")
	public abstract void method6959(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "eh", descriptor = "()I")
	public abstract int method6960();

	@OriginalMember(owner = "client!do", name = "ga", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method6961(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class93_Sub1_Sub10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(32) Class236 local32 = arg0.aClass236Array1[arg1];
		@Pc(35) Class93_Sub25 local35 = local32.aClass93_Sub25_2;
		@Pc(37) Class236 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass236Array1[arg3];
			if (local37.aClass93_Sub25_2 != local35) {
				local37 = null;
			}
		}
		this.method6846(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class236 local68 = arg6.aClass236Array1[arg7];
		@Pc(70) Class236 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass236Array1[arg9];
			if (local70.aClass93_Sub25_2 != local35) {
				local70 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6846(local68.aClass93_Sub25_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "eg", descriptor = "()[B")
	public abstract byte[] method6962();

	@OriginalMember(owner = "client!do", name = "ca", descriptor = "(I)V")
	public abstract void method6963(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "ef", descriptor = "()[B")
	public abstract byte[] method6964();

	@OriginalMember(owner = "client!do", name = "et", descriptor = "(SS)V")
	public abstract void method6965(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!do", name = "cv", descriptor = "(I)V")
	public abstract void method6966(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "hu", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "er", descriptor = "(SS)V")
	public abstract void method6968(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!do", name = "dy", descriptor = "()I")
	public abstract int method6969();

	@OriginalMember(owner = "client!do", name = "eb", descriptor = "(IIII)V")
	public abstract void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "ex", descriptor = "(IIII)V")
	public abstract void method6971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "fg", descriptor = "(IIII)V")
	public abstract void method6972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "fm", descriptor = "()[Lclient!du;")
	public abstract Class234[] method6973();

	@OriginalMember(owner = "client!do", name = "bs", descriptor = "(I)V")
	public abstract void method6974(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "fz", descriptor = "()Z")
	public abstract boolean method6976();

	@OriginalMember(owner = "client!do", name = "fj", descriptor = "()Z")
	public abstract boolean method6977();

	@OriginalMember(owner = "client!do", name = "fd", descriptor = "()Z")
	public abstract boolean method6978();

	@OriginalMember(owner = "client!do", name = "fl", descriptor = "(Lclient!ou;Lclient!ed;I)V")
	public abstract void method6979(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "fi", descriptor = "()Z")
	public abstract boolean method6980();

	@OriginalMember(owner = "client!do", name = "ft", descriptor = "()Z")
	public abstract boolean method6981();

	@OriginalMember(owner = "client!do", name = "fx", descriptor = "()Z")
	public abstract boolean method6982();

	@OriginalMember(owner = "client!do", name = "fv", descriptor = "()Z")
	public abstract boolean method6983();

	@OriginalMember(owner = "client!do", name = "fc", descriptor = "(I)V")
	public abstract void method6984(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "gr", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!ard;I[ZZ)V")
	public final void method6985(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(31) Class236 local31 = arg0.aClass236Array1[arg1];
		@Pc(34) Class93_Sub25 local34 = local31.aClass93_Sub25_2;
		@Pc(36) Class236 local36 = null;
		if (arg2 != null) {
			local36 = arg2.aClass236Array1[arg3];
			if (local36.aClass93_Sub25_2 != local34) {
				local36 = null;
			}
		}
		this.method6846(local34, local31, local36, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		@Pc(75) Class93_Sub25 local75 = arg6.aClass93_Sub25_1;
		@Pc(83) int local83 = arg7 % (arg6.method21556(-1220853969) + 1);
		this.method6847(local75, arg6, local83, 0, arg9, arg8, true, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "r", descriptor = "(I)V")
	public abstract void method6986(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!do", name = "fp", descriptor = "(IIII)V")
	abstract void method6987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!do", name = "em", descriptor = "()I")
	public abstract int method6988();

	@OriginalMember(owner = "client!do", name = "ff", descriptor = "(Lclient!ou;Lclient!ed;I)V")
	public abstract void method6989(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "dq", descriptor = "(Lclient!ou;IZ)V")
	public abstract void method6990(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "da", descriptor = "(I[IIIIIZ)V")
	abstract void method6991(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "bi", descriptor = "(SS)V")
	public abstract void method6993(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!do", name = "bx", descriptor = "()I")
	public abstract int method6996();

	@OriginalMember(owner = "client!do", name = "dn", descriptor = "(Lclient!ou;)V")
	public abstract void method6997(@OriginalArg(0) Class470 arg0);

	@OriginalMember(owner = "client!do", name = "cd", descriptor = "(I[IIIIIZ)V")
	abstract void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "gq", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method6999(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2481(arg1 + local10, arg3 + local15, -1287062799);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2481(arg1 + local29, arg3 + local34, -612220233);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2481(arg1 + local49, arg3 + local53, -622975159);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2481(arg1 + local67, arg3 + local71, 309313961);
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
				this.method6986(local124);
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
				this.method6830(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6939(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!do", name = "gl", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method7000(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2481(arg1 + local10, arg3 + local15, -1550920542);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2481(arg1 + local29, arg3 + local34, -2136235557);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2481(arg1 + local49, arg3 + local53, -1737146919);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2481(arg1 + local67, arg3 + local71, 45844519);
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
				this.method6986(local124);
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
				this.method6830(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6939(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!do", name = "go", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method7001(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2481(arg1 + local10, arg3 + local15, -2024916725);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2481(arg1 + local29, arg3 + local34, 249583440);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2481(arg1 + local49, arg3 + local53, -1611582749);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2481(arg1 + local67, arg3 + local71, -522190516);
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
				this.method6986(local124);
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
				this.method6830(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6939(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!do", name = "gf", descriptor = "(Lclient!ard;ILclient!ard;I[ZZ)V")
	public final void method7002(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 == null) {
			return;
		}
		if (arg4 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg5);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(2049769720) + 1);
		this.method6847(local24, arg0, local32, 0, arg5, arg4, false, 65535, null);
		this.method6851(0, new int[0], 0, 0, 0, 0, arg5);
		@Pc(56) Class93_Sub25 local56 = arg2.aClass93_Sub25_1;
		@Pc(64) int local64 = arg3 % (arg2.method21556(-69227248) + 1);
		this.method6847(local56, arg2, local64, 0, arg5, arg4, true, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ec", descriptor = "()I")
	public abstract int method7003();

	@OriginalMember(owner = "client!do", name = "dr", descriptor = "(I[IIIIIZ)V")
	abstract void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!do", name = "ey", descriptor = "()I")
	public abstract int method7005();

	@OriginalMember(owner = "client!do", name = "gn", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method7006(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class93_Sub1_Sub10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(32) Class236 local32 = arg0.aClass236Array1[arg1];
		@Pc(35) Class93_Sub25 local35 = local32.aClass93_Sub25_2;
		@Pc(37) Class236 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass236Array1[arg3];
			if (local37.aClass93_Sub25_2 != local35) {
				local37 = null;
			}
		}
		this.method6846(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class236 local68 = arg6.aClass236Array1[arg7];
		@Pc(70) Class236 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass236Array1[arg9];
			if (local70.aClass93_Sub25_2 != local35) {
				local70 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6846(local68.aClass93_Sub25_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "gc", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method7007(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93_Sub1_Sub10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class93_Sub1_Sub10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6838(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(32) Class236 local32 = arg0.aClass236Array1[arg1];
		@Pc(35) Class93_Sub25 local35 = local32.aClass93_Sub25_2;
		@Pc(37) Class236 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass236Array1[arg3];
			if (local37.aClass93_Sub25_2 != local35) {
				local37 = null;
			}
		}
		this.method6846(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class236 local68 = arg6.aClass236Array1[arg7];
		@Pc(70) Class236 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass236Array1[arg9];
			if (local70.aClass93_Sub25_2 != local35) {
				local70 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6846(local68.aClass93_Sub25_2, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "bg", descriptor = "(BIZ)Lclient!do;")
	public abstract Class109 method7008(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!do", name = "gx", descriptor = "(Lclient!ard;ILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method7009(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93_Sub1_Sub10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(-779042860) + 1);
		this.method6847(local24, arg0, local32, 0, arg9, arg8, false, 65535, null);
		@Pc(48) Class236 local48 = arg2.aClass236Array1[arg3];
		@Pc(50) Class236 local50 = null;
		if (arg4 != null) {
			local50 = arg4.aClass236Array1[arg5];
			if (local50.aClass93_Sub25_2 != local24) {
				local50 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		this.method6846(local48.aClass93_Sub25_2, local48, local50, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ge", descriptor = "(Lclient!ard;ILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method7010(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93_Sub1_Sub10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(-1917950646) + 1);
		this.method6847(local24, arg0, local32, 0, arg9, arg8, false, 65535, null);
		@Pc(48) Class236 local48 = arg2.aClass236Array1[arg3];
		@Pc(50) Class236 local50 = null;
		if (arg4 != null) {
			local50 = arg4.aClass236Array1[arg5];
			if (local50.aClass93_Sub25_2 != local24) {
				local50 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		this.method6846(local48.aClass93_Sub25_2, local48, local50, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "gg", descriptor = "(Lclient!ard;ILclient!arr;ILclient!arr;III[ZZ)V")
	public final void method7011(@OriginalArg(0) Class93_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93_Sub1_Sub10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method6839(arg0, arg1, 0, arg9);
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(24) Class93_Sub25 local24 = arg0.aClass93_Sub25_1;
		@Pc(32) int local32 = arg1 % (arg0.method21556(2105780056) + 1);
		this.method6847(local24, arg0, local32, 0, arg9, arg8, false, 65535, null);
		@Pc(48) Class236 local48 = arg2.aClass236Array1[arg3];
		@Pc(50) Class236 local50 = null;
		if (arg4 != null) {
			local50 = arg4.aClass236Array1[arg5];
			if (local50.aClass93_Sub25_2 != local24) {
				local50 = null;
			}
		}
		this.method6851(0, new int[0], 0, 0, 0, 0, arg9);
		this.method6846(local48.aClass93_Sub25_2, local48, local50, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "ah", descriptor = "(Lclient!arr;I)V")
	public final void method7012(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3852; local21++) {
			@Pc(30) short local30 = local16.aShortArray105[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray108[local21] != -1) {
					this.method6855(0, 0, 0, 0);
				}
				this.method6855(local19.anIntArray180[local30], local16.aShortArray103[local21], local16.aShortArray99[local21], local16.aShortArray106[local21]);
			}
		}
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "gs", descriptor = "(Lclient!arr;I)V")
	public final void method7013(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3852; local21++) {
			@Pc(30) short local30 = local16.aShortArray105[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray108[local21] != -1) {
					this.method6855(0, 0, 0, 0);
				}
				this.method6855(local19.anIntArray180[local30], local16.aShortArray103[local21], local16.aShortArray99[local21], local16.aShortArray106[local21]);
			}
		}
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "gt", descriptor = "(Lclient!arr;I)V")
	public final void method7014(@OriginalArg(0) Class93_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6836();
		if (!this.method6850()) {
			this.method6837();
			return;
		}
		@Pc(16) Class236 local16 = arg0.aClass236Array1[arg1];
		@Pc(19) Class93_Sub25 local19 = local16.aClass93_Sub25_2;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3852; local21++) {
			@Pc(30) short local30 = local16.aShortArray105[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray108[local21] != -1) {
					this.method6855(0, 0, 0, 0);
				}
				this.method6855(local19.anIntArray180[local30], local16.aShortArray103[local21], local16.aShortArray99[local21], local16.aShortArray106[local21]);
			}
		}
		this.method6910();
		this.method6837();
	}

	@OriginalMember(owner = "client!do", name = "gh", descriptor = "(Lclient!ako;Lclient!dx;Lclient!dx;III[ZZZI[I)V")
	final void method7015(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3852; local5++) {
				@Pc(14) short local14 = arg1.aShortArray105[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray180[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray108[local5];
					if (local32 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local32], arg10);
					}
					this.method6848(arg0.anIntArray180[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray103[local5], arg1.aShortArray99[local5], arg1.aShortArray106[local5], arg5, arg8, arg9 & arg0.anIntArray181[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1590 * 1418467783; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3852 && arg1.aShortArray105[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3852 && arg2.aShortArray105[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray180[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray180[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray103[local5];
						local179 = arg1.aShortArray99[local5];
						local184 = arg1.aShortArray106[local5];
						local189 = arg1.aShortArray108[local5];
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
						local213 = arg2.aShortArray103[local92];
						local218 = arg2.aShortArray99[local92];
						local223 = arg2.aShortArray106[local92];
						local228 = arg2.aShortArray108[local92];
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
						this.method6848(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local189], arg10);
					} else if (local228 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local228], arg10);
					}
					this.method6848(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray181[local94], arg10);
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

	@OriginalMember(owner = "client!do", name = "gm", descriptor = "(Lclient!ako;Lclient!dx;Lclient!dx;III[ZZZI[I)V")
	final void method7016(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3852; local5++) {
				@Pc(14) short local14 = arg1.aShortArray105[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray180[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray108[local5];
					if (local32 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local32], arg10);
					}
					this.method6848(arg0.anIntArray180[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray103[local5], arg1.aShortArray99[local5], arg1.aShortArray106[local5], arg5, arg8, arg9 & arg0.anIntArray181[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1590 * 1418467783; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3852 && arg1.aShortArray105[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3852 && arg2.aShortArray105[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray180[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray180[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray103[local5];
						local179 = arg1.aShortArray99[local5];
						local184 = arg1.aShortArray106[local5];
						local189 = arg1.aShortArray108[local5];
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
						local213 = arg2.aShortArray103[local92];
						local218 = arg2.aShortArray99[local92];
						local223 = arg2.aShortArray106[local92];
						local228 = arg2.aShortArray108[local92];
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
						this.method6848(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local189], arg10);
					} else if (local228 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local228], arg10);
					}
					this.method6848(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray181[local94], arg10);
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

	@OriginalMember(owner = "client!do", name = "gv", descriptor = "(Lclient!ako;Lclient!dx;Lclient!dx;III[ZZZI[I)V")
	final void method7017(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3852; local5++) {
				@Pc(14) short local14 = arg1.aShortArray105[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray180[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray108[local5];
					if (local32 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local32], arg10);
					}
					this.method6848(arg0.anIntArray180[local14], arg0.anIntArrayArray41[local14], arg1.aShortArray103[local5], arg1.aShortArray99[local5], arg1.aShortArray106[local5], arg5, arg8, arg9 & arg0.anIntArray181[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1590 * 1418467783; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3852 && arg1.aShortArray105[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3852 && arg2.aShortArray105[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray180[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray180[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray103[local5];
						local179 = arg1.aShortArray99[local5];
						local184 = arg1.aShortArray106[local5];
						local189 = arg1.aShortArray108[local5];
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
						local213 = arg2.aShortArray103[local92];
						local218 = arg2.aShortArray99[local92];
						local223 = arg2.aShortArray106[local92];
						local228 = arg2.aShortArray108[local92];
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
						this.method6848(0, arg0.anIntArrayArray41[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local189], arg10);
					} else if (local228 != -1) {
						this.method6848(0, arg0.anIntArrayArray41[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local228], arg10);
					}
					this.method6848(local159, arg0.anIntArrayArray41[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray181[local94], arg10);
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

	@OriginalMember(owner = "client!do", name = "gj", descriptor = "(Lclient!ako;Lclient!ard;IIZ[ZZI[I)V")
	final void method7018(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class93_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class212 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1590 * 1418467783; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray180[local5] == 0) {
				if (arg0.anIntArray180[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray179[local3++];
					if (local35 >= 0 && local35 < arg0.aClass212Array1.length) {
						local1 = arg0.aClass212Array1[local35];
					} else {
						local1 = null;
					}
					this.method6890(0, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray181[local5], null);
				} else if (arg1.aClass230ArrayArray1[local5] != null) {
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
						local131 = new float[] { local1.method25531(arg1.method21553(1747197434), (byte) 46).aFloatArray116[12], local1.method25531(arg1.method21553(1747197434), (byte) 118).aFloatArray116[13], local1.method25531(arg1.method21553(1747197434), (byte) 38).aFloatArray116[14] };
						local139 = local1.method25525(arg1.method21553(1747197434), (byte) 0).method30016();
					}
					if (arg0.anIntArray180[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray180[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray180[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray180[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass230ArrayArray1[local5].length; local227++) {
						@Pc(241) Class230 local241 = arg1.aClass230ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method25721(arg2, -1977847103);
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
					this.method6890(local225, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray181[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!do", name = "gw", descriptor = "(Lclient!ako;Lclient!ard;IIZ[ZZI[I)V")
	final void method7019(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class93_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class212 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1590 * 1418467783; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray180[local5] == 0) {
				if (arg0.anIntArray180[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray179[local3++];
					if (local35 >= 0 && local35 < arg0.aClass212Array1.length) {
						local1 = arg0.aClass212Array1[local35];
					} else {
						local1 = null;
					}
					this.method6890(0, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray181[local5], null);
				} else if (arg1.aClass230ArrayArray1[local5] != null) {
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
						local131 = new float[] { local1.method25531(arg1.method21553(1747197434), (byte) 62).aFloatArray116[12], local1.method25531(arg1.method21553(1747197434), (byte) 42).aFloatArray116[13], local1.method25531(arg1.method21553(1747197434), (byte) 106).aFloatArray116[14] };
						local139 = local1.method25525(arg1.method21553(1747197434), (byte) 0).method30016();
					}
					if (arg0.anIntArray180[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray180[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray180[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray180[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass230ArrayArray1[local5].length; local227++) {
						@Pc(241) Class230 local241 = arg1.aClass230ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method25721(arg2, -1311076177);
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
					this.method6890(local225, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray181[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!do", name = "gd", descriptor = "(Lclient!ako;Lclient!ard;IIZ[ZZI[I)V")
	final void method7020(@OriginalArg(0) Class93_Sub25 arg0, @OriginalArg(1) Class93_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(1) Class212 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt1590 * 1418467783; local5++) {
			if (arg5 == null || arg5[local5] == arg6 || arg0.anIntArray180[local5] == 0) {
				if (arg0.anIntArray180[local5] == 0) {
					@Pc(35) int local35 = arg0.anIntArray179[local3++];
					if (local35 >= 0 && local35 < arg0.aClass212Array1.length) {
						local1 = arg0.aClass212Array1[local35];
					} else {
						local1 = null;
					}
					this.method6890(0, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.anIntArray181[local5], null);
				} else if (arg1.aClass230ArrayArray1[local5] != null) {
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
						local131 = new float[] { local1.method25531(arg1.method21553(1747197434), (byte) 88).aFloatArray116[12], local1.method25531(arg1.method21553(1747197434), (byte) 38).aFloatArray116[13], local1.method25531(arg1.method21553(1747197434), (byte) 2).aFloatArray116[14] };
						local139 = local1.method25525(arg1.method21553(1747197434), (byte) 0).method30016();
					}
					if (arg0.anIntArray180[local5] == 1) {
						local82 = local131[0];
						local84 = local131[1];
						local86 = local131[2];
					} else if (arg0.anIntArray180[local5] == 3) {
						local82 = 1.0F;
						local84 = 1.0F;
						local86 = 1.0F;
					} else if (arg0.anIntArray180[local5] == 2) {
						local82 = local139[0];
						local84 = local139[1];
						local86 = local139[2];
					}
					@Pc(225) int local225 = arg0.anIntArray180[local5];
					for (@Pc(227) int local227 = 0; local227 < arg1.aClass230ArrayArray1[local5].length; local227++) {
						@Pc(241) Class230 local241 = arg1.aClass230ArrayArray1[local5][local227];
						if (local241 != null && (local225 != 7 || local227 < 0 || local227 >= 3)) {
							@Pc(258) float local258 = local241.method25721(arg2, -237586305);
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
					this.method6890(local225, local1, arg1.method21553(1747197434), arg0.anIntArrayArray41[local5], local82, local84, local86, arg3, arg4, arg7 & arg0.anIntArray181[local5], arg8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!do", name = "cw", descriptor = "(III)V")
	public abstract void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!do", name = "gb", descriptor = "(I[IIIIIZI[I)V")
	final void method7022(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
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
			this.method6851(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6853(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!do", name = "gi", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method7023(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "gu", descriptor = "(Lclient!cb;IIIIIII)V")
	final void method7024(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method2481(arg1 + local10, arg3 + local15, -893702495);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method2481(arg1 + local29, arg3 + local34, -1417188041);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method2481(arg1 + local49, arg3 + local53, -1739482885);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method2481(arg1 + local67, arg3 + local71, 511942249);
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
				this.method6986(local124);
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
				this.method6830(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6939(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!do", name = "fs", descriptor = "()[Lclient!cq;")
	public abstract Class210[] method7025();

	@OriginalMember(owner = "client!do", name = "hk", descriptor = "(ILclient!cs;I[IFFFIZI[I)V")
	final void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(2) int local2 = (int) arg4;
		@Pc(5) int local5 = (int) arg5;
		@Pc(8) int local8 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			local2 = (int) arg1.method25526(arg2, 1017288555).aFloatArray116[12];
			local5 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[13];
			local8 = (int) -arg1.method25526(arg2, 1017288555).aFloatArray116[14];
		} else {
			@Pc(64) float[] local64;
			if (arg0 == 1) {
				if (arg1 == null) {
					return;
				}
				@Pc(52) float[] local52 = new float[3];
				arg1.method25525(arg2, (byte) 0).method30028(arg4, arg5, arg6, local52);
				local64 = new float[3];
				arg1.method25526(arg2, 1017288555).method30030(local52[0], local52[1], local52[2], local64);
				local2 = (int) local64[0];
				local5 = (int) local64[1];
				local8 = (int) local64[2];
				local5 = -local5;
				local8 = -local8;
			} else if (arg0 == 2) {
				if (arg1 == null) {
					return;
				}
				@Pc(109) Class489 local109 = Class489.method30055();
				local109.method30022(arg5, arg4, arg6);
				if (arg1.aClass212_1 != null) {
					local109.method30134(arg1.aClass212_1.method25526(arg2, 1017288555));
				}
				local109.method30025();
				local109.method30134(arg1.method25526(arg2, 1017288555));
				local64 = local109.method30016();
				local2 = (int) (local64[0] * 2607.5945F) & 0x3FFF;
				local5 = (int) (-local64[1] * 2607.5945F) & 0x3FFF;
				local8 = (int) (local64[2] * 2607.5945F) & 0x3FFF;
				local109.method30019();
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
			this.method6845(arg0, arg3, local2, local5, local8, arg7, arg8);
		} else {
			this.method6854(arg0, arg3, local2, local5, local8, arg8, arg9, arg10);
		}
	}

	@OriginalMember(owner = "client!do", name = "bk", descriptor = "(I)V")
	public abstract void method7027(@OriginalArg(0) int arg0);
}
