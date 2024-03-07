package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public class Class614 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!py;")
	static Class497 aClass497_134;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 7)
	Class614() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "(Lclient!alw;)Lclient!vt;", line = 12)
	public static Interface67 method32066(@OriginalArg(0) Packet arg0) {
		@Pc(5) Class623 local5 = Class351.method27640(arg0.g1((short) 16384), 1962594255);
		if (Class623.aClass623_2 == local5) {
			return Class632.method32293(arg0, -1105609638);
		} else if (local5 == Class623.aClass623_1) {
			return Class280.method26454(arg0, (byte) -123);
		} else if (Class623.aClass623_3 == local5) {
			return Class448.method28920(arg0, 1134570666);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "(Lclient!alw;)Lclient!vt;", line = 12)
	public static Interface67 method32067(@OriginalArg(0) Packet arg0) {
		@Pc(5) Class623 local5 = Class351.method27640(arg0.g1((short) 16384), 1962594255);
		if (Class623.aClass623_2 == local5) {
			return Class632.method32293(arg0, 132834097);
		} else if (local5 == Class623.aClass623_1) {
			return Class280.method26454(arg0, (byte) -68);
		} else if (Class623.aClass623_3 == local5) {
			return Class448.method28920(arg0, -307865580);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "([FIFZFZ[FB)I", line = 13)
	static int method32068(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) byte arg7) {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < arg1 + 1; local3++) {
			local1 += Math.abs(arg0[local3]);
		}
		@Pc(30) float local30 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * Class221.aFloat261;
		if (local1 <= local30) {
			return -1;
		}
		@Pc(41) float[] local41 = new float[arg1 + 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < arg1 + 1; local43++) {
			local41[local43] = arg0[local43] * (1.0F / local1);
		}
		while (Math.abs(local41[arg1]) < local30) {
			arg1--;
		}
		local43 = 0;
		if (arg1 == 0) {
			return local43;
		} else if (arg1 == 1) {
			arg6[0] = -local41[0] / local41[1];
			@Pc(116) boolean local116 = arg3 ? arg2 < local30 + arg6[0] : arg2 < arg6[0] - local30;
			@Pc(142) boolean local142 = arg5 ? arg4 > arg6[0] - local30 : arg4 > local30 + arg6[0];
			local43 = local116 && local142 ? 1 : 0;
			if (local43 > 0) {
				if (arg3 && arg6[0] < arg2) {
					arg6[0] = arg2;
				} else if (arg5 && arg6[0] > arg4) {
					arg6[0] = arg4;
				}
			}
			return local43;
		} else {
			@Pc(185) Class248 local185 = new Class248(local41, arg1);
			@Pc(190) float[] local190 = new float[arg1 + 1];
			for (@Pc(192) int local192 = 1; local192 <= arg1; local192++) {
				local190[local192 - 1] = (float) local192 * local41[local192];
			}
			@Pc(213) float[] local213 = new float[arg1 + 1];
			@Pc(225) int local225 = method32068(local190, arg1 - 1, arg2, false, arg4, false, local213, (byte) -88);
			if (local225 == -1) {
				return 0;
			}
			@Pc(232) boolean local232 = false;
			@Pc(234) float local234 = 0.0F;
			@Pc(236) float local236 = 0.0F;
			@Pc(238) float local238 = 0.0F;
			for (@Pc(240) int local240 = 0; local240 <= local225; local240++) {
				if (local43 > arg1) {
					return local43;
				}
				@Pc(253) float local253;
				if (local240 == 0) {
					local253 = arg2;
					local236 = Class368.method27962(local41, arg1, arg2, (short) -219);
					if (Math.abs(local236) <= local30 && arg3) {
						arg6[local43++] = arg2;
					}
				} else {
					local253 = local238;
					local236 = local234;
				}
				if (local240 == local225) {
					local238 = arg4;
					local232 = false;
				} else {
					local238 = local213[local240];
				}
				local234 = Class368.method27962(local41, arg1, local238, (short) -17300);
				if (local232) {
					local232 = false;
				} else if (Math.abs(local234) < local30) {
					if (local240 != local225 || arg5) {
						arg6[local43++] = local238;
						local232 = true;
					}
				} else if (local236 < 0.0F && local234 > 0.0F || local236 > 0.0F && local234 < 0.0F) {
					arg6[local43++] = Class81.method1369(local185, local253, local238, 0.0F, -1549590237);
					if (local43 > 1 && arg6[local43 - 2] >= arg6[local43 - 1] - local30) {
						arg6[local43 - 2] = (arg6[local43 - 2] + arg6[local43 - 1]) * 0.5F;
						local43--;
					}
				}
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!vi", name = "hu", descriptor = "(Lclient!yf;I)V", line = 6269)
	static final void method32069(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method187(local11, local14, false, 0, arg0, 1691862116);
	}
}
