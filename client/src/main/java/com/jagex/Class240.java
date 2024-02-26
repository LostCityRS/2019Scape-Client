package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class240 {

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[F")
	float[] aFloatArray102;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	int anInt3857;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "([FIF)F")
	static float method26217(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg2 * local3 + arg0[local7];
		}
		return local3;
	}

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "([FIFZFZ[F)I")
	static int method26218(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6) {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < arg1 + 1; local3++) {
			local1 += Math.abs(arg0[local3]);
		}
		@Pc(30) float local30 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * Class223.aFloat259;
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
			@Pc(142) boolean local142 = arg5 ? arg4 > arg6[0] - local30 : arg4 > arg6[0] + local30;
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
			@Pc(185) Class240 local185 = new Class240(local41, arg1);
			@Pc(190) float[] local190 = new float[arg1 + 1];
			for (@Pc(192) int local192 = 1; local192 <= arg1; local192++) {
				local190[local192 - 1] = (float) local192 * local41[local192];
			}
			@Pc(213) float[] local213 = new float[arg1 + 1];
			@Pc(225) int local225 = Class236.method26137(local190, arg1 - 1, arg2, false, arg4, false, local213, 1396355362);
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
				@Pc(252) float local252;
				if (local240 == 0) {
					local252 = arg2;
					local236 = Class2.method1812(local41, arg1, arg2, 206801992);
					if (Math.abs(local236) <= local30 && arg3) {
						arg6[local43++] = arg2;
					}
				} else {
					local252 = local238;
					local236 = local234;
				}
				if (local240 == local225) {
					local238 = arg4;
					local232 = false;
				} else {
					local238 = local213[local240];
				}
				local234 = Class2.method1812(local41, arg1, local238, 368287076);
				if (local232) {
					local232 = false;
				} else if (Math.abs(local234) < local30) {
					if (local225 != local240 || arg5) {
						arg6[local43++] = local238;
						local232 = true;
					}
				} else if (local236 < 0.0F && local234 > 0.0F || local236 > 0.0F && local234 < 0.0F) {
					arg6[local43++] = Class53.method1087(local185, local252, local238, 0.0F, -668760302);
					if (local43 > 1 && arg6[local43 - 2] >= arg6[local43 - 1] - local30) {
						arg6[local43 - 2] = (arg6[local43 - 1] + arg6[local43 - 2]) * 0.5F;
						local43--;
					}
				}
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "([FIFZFZ[F)I")
	static int method26219(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6) {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < arg1 + 1; local3++) {
			local1 += Math.abs(arg0[local3]);
		}
		@Pc(30) float local30 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * Class223.aFloat259;
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
			@Pc(142) boolean local142 = arg5 ? arg4 > arg6[0] - local30 : arg4 > arg6[0] + local30;
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
			@Pc(185) Class240 local185 = new Class240(local41, arg1);
			@Pc(190) float[] local190 = new float[arg1 + 1];
			for (@Pc(192) int local192 = 1; local192 <= arg1; local192++) {
				local190[local192 - 1] = (float) local192 * local41[local192];
			}
			@Pc(213) float[] local213 = new float[arg1 + 1];
			@Pc(225) int local225 = Class236.method26137(local190, arg1 - 1, arg2, false, arg4, false, local213, 1472565658);
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
				@Pc(252) float local252;
				if (local240 == 0) {
					local252 = arg2;
					local236 = Class2.method1812(local41, arg1, arg2, -1936643224);
					if (Math.abs(local236) <= local30 && arg3) {
						arg6[local43++] = arg2;
					}
				} else {
					local252 = local238;
					local236 = local234;
				}
				if (local240 == local225) {
					local238 = arg4;
					local232 = false;
				} else {
					local238 = local213[local240];
				}
				local234 = Class2.method1812(local41, arg1, local238, -2029842376);
				if (local232) {
					local232 = false;
				} else if (Math.abs(local234) < local30) {
					if (local225 != local240 || arg5) {
						arg6[local43++] = local238;
						local232 = true;
					}
				} else if (local236 < 0.0F && local234 > 0.0F || local236 > 0.0F && local234 < 0.0F) {
					arg6[local43++] = Class53.method1087(local185, local252, local238, 0.0F, -438895435);
					if (local43 > 1 && arg6[local43 - 2] >= arg6[local43 - 1] - local30) {
						arg6[local43 - 2] = (arg6[local43 - 1] + arg6[local43 - 2]) * 0.5F;
						local43--;
					}
				}
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "([FIF)F")
	static float method26220(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg2 * local3 + arg0[local7];
		}
		return local3;
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(Lclient!ec;FFF)F")
	static float method26221(@OriginalArg(0) Class240 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg1, 1021145765);
		if (Math.abs(local9) < Class223.aFloat259) {
			return arg1;
		}
		@Pc(26) float local26 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg2, -1408236116);
		if (Math.abs(local26) < Class223.aFloat259) {
			return arg2;
		}
		@Pc(35) float local35 = 0.0F;
		@Pc(37) float local37 = 0.0F;
		@Pc(39) float local39 = 0.0F;
		@Pc(41) float local41 = 0.0F;
		@Pc(43) boolean local43 = true;
		@Pc(45) boolean local45 = false;
		do {
			local45 = false;
			if (local43) {
				local35 = arg1;
				local41 = local9;
				local37 = arg2 - arg1;
				local39 = local37;
				local43 = false;
			}
			if (Math.abs(local41) < Math.abs(local26)) {
				arg1 = arg2;
				arg2 = local35;
				local35 = arg1;
				local9 = local26;
				local26 = local41;
				local41 = local9;
			}
			@Pc(88) float local88 = Class223.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
			@Pc(94) float local94 = (local35 - arg2) * 0.5F;
			@Pc(107) boolean local107 = Math.abs(local94) > local88 && local26 != 0.0F;
			if (local107) {
				if (Math.abs(local39) < local88 || Math.abs(local9) <= Math.abs(local26)) {
					local37 = local94;
					local39 = local94;
				} else {
					@Pc(129) float local129 = local26 / local9;
					@Pc(139) float local139;
					@Pc(143) float local143;
					if (arg1 == local35) {
						local139 = local94 * 2.0F * local129;
						local143 = 1.0F - local129;
					} else {
						local143 = local9 / local41;
						@Pc(152) float local152 = local26 / local41;
						local139 = ((local143 - local152) * local143 * local94 * 2.0F - (arg2 - arg1) * (local152 - 1.0F)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * 0.5F * local129)) {
						local37 = local139 / local143;
					} else {
						local37 = local94;
						local39 = local94;
					}
				}
				arg1 = arg2;
				local9 = local26;
				if (Math.abs(local37) > local88) {
					arg2 += local37;
				} else if ((double) local94 > 0.0D) {
					arg2 += local88;
				} else {
					arg2 -= local88;
				}
				local26 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg2, -751376628);
				if ((double) (local26 * (local41 / Math.abs(local41))) > 0.0D) {
					local43 = true;
					local45 = true;
				} else {
					local45 = true;
				}
			}
		} while (local45);
		return arg2;
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "([FIF)F")
	static float method26222(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg2 * local3 + arg0[local7];
		}
		return local3;
	}

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "([FIF)F")
	static float method26223(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg2 * local3 + arg0[local7];
		}
		return local3;
	}

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "(III)I")
	static int method26224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "(I)Z")
	static boolean method26225(@OriginalArg(0) int arg0) {
		return !Class270.method26694(client.anInt3433 * 1994758437, (byte) -67);
	}

	@OriginalMember(owner = "client!ec", name = "abc", descriptor = "(Lclient!yp;I)V")
	static void method26226(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 0 || local12 >= client.anInt3519 * 227319795) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aClass699Array1[local12].aString244;
		}
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "(Lclient!ea;S)V")
	public static void method26227(@OriginalArg(0) Class107 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class80_Sub1_Sub9 local7 = Class22.method545(2, (long) (arg0.anInt862 * -1873516487));
		local7.method22078(-1817468310);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([FI)V")
	Class240(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray102 = arg0;
		this.anInt3857 = arg1 * 1516801611;
	}
}
