package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class221 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "F")
	static final float aFloat258 = 1.3333334F;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "F")
	static final float aFloat259 = 0.33333334F;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "F")
	static final float aFloat260 = 0.6666667F;

	@OriginalMember(owner = "client!da", name = "ag", descriptor = "I")
	static int anInt3670;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "F")
	static final float aFloat261 = Math.ulp(1.0F);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "F")
	static final float aFloat262 = aFloat261 * 2.0F;

	@OriginalMember(owner = "client!da", name = "ag", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25643(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, 702092426);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "(Lclient!dn;F)F")
	static float method25644(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null || arg0.method25719(-1507711602) == 0) {
			return 0.0F;
		} else if (arg1 < (float) (arg0.aClass254Array1[0].anInt3893 * 1727636433)) {
			return Class222.aClass222_2 == arg0.aClass222_6 ? arg0.aClass254Array1[0].aFloat281 : Class512.method30441(arg0, arg1, true, 583067723);
		} else if (arg1 > (float) (arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].anInt3893 * 1727636433)) {
			return Class222.aClass222_2 == arg0.aClass222_7 ? arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 : Class512.method30441(arg0, arg1, false, 5136303);
		} else if (arg0.aBoolean653) {
			return arg0.aClass254Array1[0].aFloat281;
		} else {
			@Pc(84) Class254 local84 = arg0.method25726(arg1, 1488534148);
			@Pc(86) boolean local86 = false;
			@Pc(88) boolean local88 = false;
			if (local84 == null) {
				return 0.0F;
			}
			if ((double) local84.aFloat284 == 0.0D && (double) local84.aFloat280 == 0.0D) {
				local86 = true;
			} else if (Float.MAX_VALUE == local84.aFloat284 && Float.MAX_VALUE == local84.aFloat280) {
				local88 = true;
			} else if (local84.aClass254_1 == null) {
				local86 = true;
			} else if (arg0.aBoolean654) {
				@Pc(128) float[] local128 = new float[4];
				@Pc(131) float[] local131 = new float[4];
				local128[0] = local84.anInt3893 * 1727636433;
				local131[0] = local84.aFloat281;
				local128[1] = local128[0] + local84.aFloat284 * 0.33333334F;
				local131[1] = local131[0] + local84.aFloat280 * 0.33333334F;
				local128[3] = local84.aClass254_1.anInt3893 * 1727636433;
				local131[3] = local84.aClass254_1.aFloat281;
				local128[2] = local128[3] - local84.aClass254_1.aFloat282 * 0.33333334F;
				local131[2] = local131[3] - local84.aClass254_1.aFloat283 * 0.33333334F;
				if (arg0.aBoolean651) {
					Class42.method841(arg0, local128, local131, (byte) 16);
				} else {
					Class126_Sub2.method10050(arg0, local128, local131, -1694265318);
				}
				arg0.aBoolean654 = false;
			}
			if (local86) {
				return local84.aFloat281;
			} else if (local88) {
				return arg1 == (float) (local84.anInt3893 * 1727636433) || local84.aClass254_1 == null ? local84.aFloat281 : local84.aClass254_1.aFloat281;
			} else if (arg0.aBoolean651) {
				return Class717.method37074(arg0, arg1, 780133256);
			} else {
				return Class382.method28315(arg0, arg1, -793472015);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "ae", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25645(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, -42651465);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "ai", descriptor = "(FFFF[F)V")
	static void method25646(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "(Lclient!dn;F)F")
	static float method25647(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat275) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat276) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat275) / (arg0.aFloat276 - arg0.aFloat275);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean652) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray99[0] - local10, arg0.aFloatArray99[1], arg0.aFloatArray99[2], arg0.aFloatArray99[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class614.method32250(local39, 3, 0.0F, true, 1.0F, true, local72, (byte) -44);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return arg0.aFloatArray97[0] + local35 * (arg0.aFloatArray97[1] + (local35 * arg0.aFloatArray97[3] + arg0.aFloatArray97[2]) * local35);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "(Lclient!dn;F)F")
	static float method25648(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat275) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat276) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat275) / (arg0.aFloat276 - arg0.aFloat275);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean652) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray99[0] - local10, arg0.aFloatArray99[1], arg0.aFloatArray99[2], arg0.aFloatArray99[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class614.method32250(local39, 3, 0.0F, true, 1.0F, true, local72, (byte) 67);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return arg0.aFloatArray97[0] + local35 * (arg0.aFloatArray97[1] + (local35 * arg0.aFloatArray97[3] + arg0.aFloatArray97[2]) * local35);
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!dn;F)F")
	static float method25649(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat275) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat276) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat275) / (arg0.aFloat276 - arg0.aFloat275);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean652) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray99[0] - local10, arg0.aFloatArray99[1], arg0.aFloatArray99[2], arg0.aFloatArray99[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class614.method32250(local39, 3, 0.0F, true, 1.0F, true, local72, (byte) -27);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return arg0.aFloatArray97[0] + local35 * (arg0.aFloatArray97[1] + (local35 * arg0.aFloatArray97[3] + arg0.aFloatArray97[2]) * local35);
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "(Lclient!dn;F)F")
	static float method25650(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			@Pc(8) float local8 = arg1 - arg0.aFloat275;
			return local8 * (arg0.aFloatArray99[2] + (arg0.aFloatArray99[0] * local8 + arg0.aFloatArray99[1]) * local8) + arg0.aFloatArray99[3];
		}
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "(Lclient!dn;F)F")
	static float method25651(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			@Pc(8) float local8 = arg1 - arg0.aFloat275;
			return local8 * (arg0.aFloatArray99[2] + (arg0.aFloatArray99[0] * local8 + arg0.aFloatArray99[1]) * local8) + arg0.aFloatArray99[3];
		}
	}

	@OriginalMember(owner = "client!da", name = "as", descriptor = "(FFFF[F)V")
	static void method25652(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "(Lclient!dn;FZ)F")
	static float method25653(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) float local1 = 0.0F;
		if (arg0 == null || arg0.method25719(-1507711602) == 0) {
			return local1;
		}
		@Pc(19) float local19 = (float) (arg0.aClass254Array1[0].anInt3893 * 1727636433);
		@Pc(32) float local32 = (float) (arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].anInt3893 * 1727636433);
		@Pc(36) float local36 = local32 - local19;
		if ((double) local36 == 0.0D) {
			return arg0.aClass254Array1[0].aFloat281;
		}
		@Pc(49) float local49 = 0.0F;
		if (arg1 > local32) {
			local49 = (arg1 - local32) / local36;
		} else {
			local49 = (arg1 - local19) / local36;
		}
		@Pc(70) double local70 = (double) local49;
		@Pc(77) float local77 = Math.abs((float) ((double) local49 - local70));
		@Pc(81) float local81 = local77 * local36;
		@Pc(86) double local86 = Math.abs(local70 + 1.0D);
		@Pc(90) double local90 = local86 / 2.0D;
		@Pc(94) double local94 = (double) local90;
		@Pc(99) float local99 = (float) (local90 - local94);
		@Pc(147) float local147;
		@Pc(153) float local153;
		if (arg2) {
			if (arg0.aClass222_6 == Class222.aClass222_1) {
				if ((double) local99 == 0.0D) {
					local81 = local32 - local81;
				} else {
					local81 += local19;
				}
			} else if (Class222.aClass222_3 == arg0.aClass222_6 || arg0.aClass222_6 == Class222.aClass222_4) {
				local81 = local32 - local81;
			} else if (Class222.aClass222_5 == arg0.aClass222_6) {
				local81 = local19 - arg1;
				local147 = arg0.aClass254Array1[0].aFloat282;
				local153 = arg0.aClass254Array1[0].aFloat283;
				local1 = arg0.aClass254Array1[0].aFloat281;
				if ((double) local147 != 0.0D) {
					local1 -= local153 * local81 / local147;
				}
				return local1;
			}
		} else if (Class222.aClass222_1 == arg0.aClass222_7) {
			if ((double) local99 == 0.0D) {
				local81 += local19;
			} else {
				local81 = local32 - local81;
			}
		} else if (Class222.aClass222_3 == arg0.aClass222_7 || Class222.aClass222_4 == arg0.aClass222_7) {
			local81 += local19;
		} else if (Class222.aClass222_5 == arg0.aClass222_7) {
			local81 = arg1 - local32;
			local147 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat284;
			local153 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat280;
			local1 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281;
			if ((double) local147 != 0.0D) {
				local1 += local81 * local153 / local147;
			}
			return local1;
		}
		local1 = Class158.method14311(arg0, local81, 611696914);
		@Pc(286) float local286;
		if (arg2 && Class222.aClass222_4 == arg0.aClass222_6) {
			local286 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 - local86 * (double) local286);
		} else if (!arg2 && arg0.aClass222_7 == Class222.aClass222_4) {
			local286 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 + (double) local286 * local86);
		}
		return local1;
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "(Lclient!dn;FZ)F")
	static float method25654(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) float local1 = 0.0F;
		if (arg0 == null || arg0.method25719(-1507711602) == 0) {
			return local1;
		}
		@Pc(19) float local19 = (float) (arg0.aClass254Array1[0].anInt3893 * 1727636433);
		@Pc(32) float local32 = (float) (arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].anInt3893 * 1727636433);
		@Pc(36) float local36 = local32 - local19;
		if ((double) local36 == 0.0D) {
			return arg0.aClass254Array1[0].aFloat281;
		}
		@Pc(49) float local49 = 0.0F;
		if (arg1 > local32) {
			local49 = (arg1 - local32) / local36;
		} else {
			local49 = (arg1 - local19) / local36;
		}
		@Pc(70) double local70 = (double) local49;
		@Pc(77) float local77 = Math.abs((float) ((double) local49 - local70));
		@Pc(81) float local81 = local77 * local36;
		@Pc(86) double local86 = Math.abs(local70 + 1.0D);
		@Pc(90) double local90 = local86 / 2.0D;
		@Pc(94) double local94 = (double) local90;
		@Pc(99) float local99 = (float) (local90 - local94);
		@Pc(147) float local147;
		@Pc(153) float local153;
		if (arg2) {
			if (arg0.aClass222_6 == Class222.aClass222_1) {
				if ((double) local99 == 0.0D) {
					local81 = local32 - local81;
				} else {
					local81 += local19;
				}
			} else if (Class222.aClass222_3 == arg0.aClass222_6 || arg0.aClass222_6 == Class222.aClass222_4) {
				local81 = local32 - local81;
			} else if (Class222.aClass222_5 == arg0.aClass222_6) {
				local81 = local19 - arg1;
				local147 = arg0.aClass254Array1[0].aFloat282;
				local153 = arg0.aClass254Array1[0].aFloat283;
				local1 = arg0.aClass254Array1[0].aFloat281;
				if ((double) local147 != 0.0D) {
					local1 -= local153 * local81 / local147;
				}
				return local1;
			}
		} else if (Class222.aClass222_1 == arg0.aClass222_7) {
			if ((double) local99 == 0.0D) {
				local81 += local19;
			} else {
				local81 = local32 - local81;
			}
		} else if (Class222.aClass222_3 == arg0.aClass222_7 || Class222.aClass222_4 == arg0.aClass222_7) {
			local81 += local19;
		} else if (Class222.aClass222_5 == arg0.aClass222_7) {
			local81 = arg1 - local32;
			local147 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat284;
			local153 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat280;
			local1 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281;
			if ((double) local147 != 0.0D) {
				local1 += local81 * local153 / local147;
			}
			return local1;
		}
		local1 = Class158.method14311(arg0, local81, 843990428);
		@Pc(286) float local286;
		if (arg2 && Class222.aClass222_4 == arg0.aClass222_6) {
			local286 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 - local86 * (double) local286);
		} else if (!arg2 && arg0.aClass222_7 == Class222.aClass222_4) {
			local286 = arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 + (double) local286 * local86);
		}
		return local1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dn;[F[F)V")
	static void method25655(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!da", name = "aw", descriptor = "(FFFF[F)V")
	static void method25656(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(Lclient!dn;[F[F)V")
	static void method25657(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "(Lclient!dn;[F[F)V")
	static void method25658(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25659(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, 935636894);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Lclient!dn;F)F")
	static float method25660(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null || arg0.method25719(-1507711602) == 0) {
			return 0.0F;
		} else if (arg1 < (float) (arg0.aClass254Array1[0].anInt3893 * 1727636433)) {
			return Class222.aClass222_2 == arg0.aClass222_6 ? arg0.aClass254Array1[0].aFloat281 : Class512.method30441(arg0, arg1, true, -188912588);
		} else if (arg1 > (float) (arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].anInt3893 * 1727636433)) {
			return Class222.aClass222_2 == arg0.aClass222_7 ? arg0.aClass254Array1[arg0.method25719(-1507711602) - 1].aFloat281 : Class512.method30441(arg0, arg1, false, -2050204645);
		} else if (arg0.aBoolean653) {
			return arg0.aClass254Array1[0].aFloat281;
		} else {
			@Pc(84) Class254 local84 = arg0.method25726(arg1, 1178360071);
			@Pc(86) boolean local86 = false;
			@Pc(88) boolean local88 = false;
			if (local84 == null) {
				return 0.0F;
			}
			if ((double) local84.aFloat284 == 0.0D && (double) local84.aFloat280 == 0.0D) {
				local86 = true;
			} else if (Float.MAX_VALUE == local84.aFloat284 && Float.MAX_VALUE == local84.aFloat280) {
				local88 = true;
			} else if (local84.aClass254_1 == null) {
				local86 = true;
			} else if (arg0.aBoolean654) {
				@Pc(128) float[] local128 = new float[4];
				@Pc(131) float[] local131 = new float[4];
				local128[0] = local84.anInt3893 * 1727636433;
				local131[0] = local84.aFloat281;
				local128[1] = local128[0] + local84.aFloat284 * 0.33333334F;
				local131[1] = local131[0] + local84.aFloat280 * 0.33333334F;
				local128[3] = local84.aClass254_1.anInt3893 * 1727636433;
				local131[3] = local84.aClass254_1.aFloat281;
				local128[2] = local128[3] - local84.aClass254_1.aFloat282 * 0.33333334F;
				local131[2] = local131[3] - local84.aClass254_1.aFloat283 * 0.33333334F;
				if (arg0.aBoolean651) {
					Class42.method841(arg0, local128, local131, (byte) 16);
				} else {
					Class126_Sub2.method10050(arg0, local128, local131, 1774590804);
				}
				arg0.aBoolean654 = false;
			}
			if (local86) {
				return local84.aFloat281;
			} else if (local88) {
				return arg1 == (float) (local84.anInt3893 * 1727636433) || local84.aClass254_1 == null ? local84.aFloat281 : local84.aClass254_1.aFloat281;
			} else if (arg0.aBoolean651) {
				return Class717.method37074(arg0, arg1, 869697207);
			} else {
				return Class382.method28315(arg0, arg1, -793472015);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(Lclient!dn;[F[F)V")
	static void method25661(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!da", name = "ah", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25662(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, 1700696686);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "al", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25663(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, 1492019930);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "ac", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25664(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat261 + local56 > 0.0F) {
				Class248.method26024(arg0, arg1, 843436293);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!dn;[F[F)V")
	static void method25665(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) float local11 = arg1[3] - arg1[0];
		if ((double) local11 == 0.0D) {
			return;
		}
		@Pc(25) float local25 = arg1[1] - arg1[0];
		@Pc(33) float local33 = arg1[2] - arg1[0];
		@Pc(38) Float local38 = local25 / local11;
		@Pc(43) Float local43 = local33 / local11;
		arg0.aBoolean652 = local38 == 0.33333334F && local43 == 0.6666667F;
		@Pc(61) float local61 = local38;
		@Pc(64) float local64 = local43;
		if ((double) local38 < 0.0D) {
			local38 = 0.0F;
		}
		if ((double) local43 > 1.0D) {
			local43 = 1.0F;
		}
		if ((double) local38 > 1.0D || local43 < -1.0F) {
			Class342.method27602(local38, local43, (byte) 19);
		}
		if (local38 != local61) {
			arg1[1] = arg1[0] + local38 * local11;
			if ((double) local61 != 0.0D) {
				arg2[1] = arg2[0] + (arg2[1] - arg2[0]) * local38 / local61;
			}
		}
		if (local43 != local64) {
			arg1[2] = arg1[0] + local43 * local11;
			if ((double) local64 != 1.0D) {
				arg2[2] = (float) ((double) arg2[3] - (double) (arg2[3] - arg2[2]) * (1.0D - (double) local43) / (1.0D - (double) local64));
			}
		}
		arg0.aFloat275 = arg1[0];
		arg0.aFloat276 = arg1[3];
		Class670.method33137(0.0F, local38, local43, 1.0F, arg0.aFloatArray99, 1950928764);
		Class670.method33137(arg2[0], arg2[1], arg2[2], arg2[3], arg0.aFloatArray97, -501263782);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Lclient!dn;F)F")
	static float method25666(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat275) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat276) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat275) / (arg0.aFloat276 - arg0.aFloat275);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean652) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray99[0] - local10, arg0.aFloatArray99[1], arg0.aFloatArray99[2], arg0.aFloatArray99[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class614.method32250(local39, 3, 0.0F, true, 1.0F, true, local72, (byte) 82);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return arg0.aFloatArray97[0] + local35 * (arg0.aFloatArray97[1] + (local35 * arg0.aFloatArray97[3] + arg0.aFloatArray97[2]) * local35);
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(Lclient!dn;[F[F)V")
	static void method25667(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!da", name = "at", descriptor = "(FFFF[F)V")
	static void method25668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "ad", descriptor = "(FFFF[F)V")
	static void method25669(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "am", descriptor = "(FFFF[F)V")
	static void method25670(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	Class221() throws Throwable {
		throw new Error();
	}
}
