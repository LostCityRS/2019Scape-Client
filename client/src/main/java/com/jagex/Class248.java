package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public class Class248 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "[F")
	float[] aFloatArray102;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	int anInt3838;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "([FI)V", line = 7)
	Class248(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray102 = arg0;
		this.anInt3838 = arg1 * 1373534061;
	}

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "([FIFZFZ[F)I", line = 13)
	static int method25924(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6) {
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
			@Pc(225) int local225 = Class614.method32068(local190, arg1 - 1, arg2, false, arg4, false, local213, (byte) -121);
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
					local236 = Class368.method27962(local41, arg1, arg2, (short) 13896);
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
				local234 = Class368.method27962(local41, arg1, local238, (short) -2545);
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

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "([FIFZFZ[F)I", line = 13)
	static int method25925(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6) {
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
			@Pc(225) int local225 = Class614.method32068(local190, arg1 - 1, arg2, false, arg4, false, local213, (byte) 50);
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
					local236 = Class368.method27962(local41, arg1, arg2, (short) 10790);
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
				local234 = Class368.method27962(local41, arg1, local238, (short) -13615);
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

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "([FIF)F", line = 106)
	static float method25926(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg0[local7] + arg2 * local3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "(Lclient!eo;FFF)F", line = 114)
	static float method25927(@OriginalArg(0) Class248 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg1, (short) 6089);
		if (Math.abs(local9) < Class221.aFloat261) {
			return arg1;
		}
		@Pc(26) float local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) -12778);
		if (Math.abs(local26) < Class221.aFloat261) {
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
			@Pc(88) float local88 = Class221.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
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
						local139 = (local143 * 2.0F * local94 * (local143 - local152) - (local152 - 1.0F) * (arg2 - arg1)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * local129 * 0.5F)) {
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
				local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) 1332);
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

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "(Lclient!eo;FFF)F", line = 114)
	static float method25928(@OriginalArg(0) Class248 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg1, (short) 9848);
		if (Math.abs(local9) < Class221.aFloat261) {
			return arg1;
		}
		@Pc(26) float local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) -16663);
		if (Math.abs(local26) < Class221.aFloat261) {
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
			@Pc(88) float local88 = Class221.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
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
						local139 = (local143 * 2.0F * local94 * (local143 - local152) - (local152 - 1.0F) * (arg2 - arg1)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * local129 * 0.5F)) {
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
				local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) -6472);
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

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "(Lclient!eo;FFF)F", line = 114)
	static float method25929(@OriginalArg(0) Class248 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg1, (short) -361);
		if (Math.abs(local9) < Class221.aFloat261) {
			return arg1;
		}
		@Pc(26) float local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) 4411);
		if (Math.abs(local26) < Class221.aFloat261) {
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
			@Pc(88) float local88 = Class221.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
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
						local139 = (local143 * 2.0F * local94 * (local143 - local152) - (local152 - 1.0F) * (arg2 - arg1)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * local129 * 0.5F)) {
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
				local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) 10416);
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

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V", line = 285)
	static void method25930(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1, @OriginalArg(2) int arg2) {
		@Pc(48) Float local48;
		if (arg0 + Class221.aFloat261 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - Class221.aFloat261;
			local48 = 0.33333334F - Class221.aFloat261;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (local29 + -local11) * 0.5F;
		if (arg1 + Class221.aFloat261 > local36) {
			local48 = local36 - Class221.aFloat261;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < local36 + Class221.aFloat261) {
				local48 = local36 + Class221.aFloat261;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "hh", descriptor = "(B)V", line = 4683)
	static final void method25931(@OriginalArg(0) byte arg0) {
		client.aBoolean637 = false;
		if (Class512.anInt5209 * 1177442423 == 3) {
			return;
		}
		@Pc(11) Class472 local11 = Class520.selfPlayer.method24220().aClass472_61;
		@Pc(15) Class520 local15 = client.world.method30487(665835011);
		@Pc(61) int local61;
		if (Class429.anInt4781 * -1453926679 != 2 && Class429.anInt4781 * -1453926679 != 3 && -364465283 * Class175.anInt3306 == -1) {
			local61 = Class305.method26802(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, Class512.anInt5209 * 1177442423, (byte) -75);
			if (local61 - Class130_Sub2.anInt1117 * 1055108289 < 3200 && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][Class163.anInt2002 * -1331168249 >> 9][Class270.anInt3884 * 466086187 >> 9] & 0x4) != 0) {
				client.aBoolean637 = true;
			}
			return;
		}
		@Pc(34) Class611 local34 = client.world.method30455(1774726122);
		@Pc(72) int local72;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(45) Class472 local45 = Class65.aClass123_Sub1_2.method9017(1051482140).method23126(1189701933);
			if (Float.isNaN(local45.aFloat317)) {
				return;
			}
			local61 = (int) local45.aFloat317 - (local34.anInt5623 * 270611681 << 9);
			local72 = (int) local45.aFloat319 - (local34.anInt5624 * -1994307635 << 9);
			if (local61 < 0 || local72 < 0 || local61 >> 9 >= local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length || local72 >> 9 >= local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local61 >> 9].length) {
				return;
			}
		} else if (Class429.anInt4781 * -1453926679 == 2) {
			local61 = (int) local11.aFloat317;
			local72 = (int) local11.aFloat319;
		} else {
			local61 = Class175.anInt3306 * -364465283;
			local72 = Class444.anInt4895 * 514503773;
		}
		if ((local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local61 >> 9][local72 >> 9] & 0x4) != 0) {
			client.aBoolean637 = true;
			return;
		}
		@Pc(179) int local179;
		@Pc(168) int local168;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(157) Class472 local157 = Class65.aClass123_Sub1_2.method9011((byte) -73).method21408((byte) 18);
			local168 = ((int) local157.aFloat317 >> 9) - local34.anInt5623 * 270611681;
			local179 = ((int) local157.aFloat319 >> 9) - local34.anInt5624 * -1994307635;
			if (local168 < 0 || local179 < 0 || local168 >= local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length || local179 >= local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168].length) {
				return;
			}
		} else {
			local168 = Class163.anInt2002 * -1331168249 >> 9;
			local179 = Class270.anInt3884 * 466086187 >> 9;
		}
		@Pc(221) int local221 = local61 >> 9;
		@Pc(225) int local225 = local72 >> 9;
		@Pc(241) int local241;
		if (local15.method30329(local168, local179, 1206306808)) {
			local241 = Class305.method26802(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, 3, (byte) -81);
			if (Class130_Sub2.anInt1117 * 1055108289 >= local241) {
				client.aBoolean637 = true;
			}
			return;
		}
		if (Class620.anInt5644 * 607613741 >= 2560) {
			return;
		}
		if (local221 > local168) {
			local241 = local221 - local168;
		} else {
			local241 = local168 - local221;
		}
		@Pc(273) int local273;
		if (local225 > local179) {
			local273 = local225 - local179;
		} else {
			local273 = local179 - local225;
		}
		if (local241 == 0 && local273 == 0 || local241 <= -client.world.method30459(571331926) || local241 >= client.world.method30459(-1358540408) || local273 <= -client.world.method30466((short) 128) || local273 >= client.world.method30466((short) 128)) {
			if (Class429.anInt4781 * -1453926679 != 3) {
				Class646.method32608(local168 + Class430.aString204 + local179 + " " + local221 + Class430.aString204 + local225 + " " + local34.anInt5623 * 270611681 + Class430.aString204 + local34.anInt5624 * -1994307635, new RuntimeException(), 674335144);
			}
			return;
		}
		@Pc(357) int local357;
		@Pc(359) int local359;
		if (local241 <= local273) {
			local357 = local241 * 65536 / local273;
			local359 = 32768;
			while (local179 != local225) {
				if (local179 < local225) {
					local179++;
				} else if (local179 > local225) {
					local179--;
				}
				if ((local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179] & 0x4) != 0) {
					client.aBoolean637 = true;
					return;
				}
				if (local168 + 1 < local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168 + 1][local179] & 0x4) != 0) {
					client.aBoolean637 = true;
					return;
				}
				if (local168 > 0 && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168 - 1][local179] & 0x4) != 0) {
					client.aBoolean637 = true;
					return;
				}
				local359 += local357;
				if (local359 >= 65536) {
					local359 -= 65536;
					if (local168 < local221) {
						local168++;
						if (local168 + 1 < local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168 + 1][local179] & 0x4) != 0) {
							client.aBoolean637 = true;
							return;
						}
					} else if (local168 > local221) {
						local168--;
						if (local168 > 0 && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168 - 1][local179] & 0x4) != 0) {
							client.aBoolean637 = true;
							return;
						}
					}
				}
			}
			return;
		}
		local357 = local273 * 65536 / local241;
		local359 = 32768;
		while (local221 != local168) {
			if (local168 < local221) {
				local168++;
			} else if (local168 > local221) {
				local168--;
			}
			if ((local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179] & 0x4) != 0) {
				client.aBoolean637 = true;
				return;
			}
			if (local179 + 1 < local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168].length && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179 + 1] & 0x4) != 0) {
				client.aBoolean637 = true;
				return;
			}
			if (local179 > 0 && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179 - 1] & 0x4) != 0) {
				client.aBoolean637 = true;
				return;
			}
			local359 += local357;
			if (local359 >= 65536) {
				local359 -= 65536;
				if (local179 < local225) {
					local179++;
					if (local179 + 1 < local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168].length && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179 + 1] & 0x4) != 0) {
						client.aBoolean637 = true;
						return;
					}
				} else if (local179 > local225) {
					local179--;
					if (local179 > 0 && (local15.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local168][local179 - 1] & 0x4) != 0) {
						client.aBoolean637 = true;
						return;
					}
				}
			}
		}
	}
}
