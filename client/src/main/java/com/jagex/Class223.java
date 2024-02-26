package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class223 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "F")
	static final float aFloat258 = 0.33333334F;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "F")
	static final float aFloat260 = 1.3333334F;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "F")
	static final float aFloat261 = 0.6666667F;

	@OriginalMember(owner = "client!dd", name = "fu", descriptor = "Lclient!pf;")
	public static Class480 aClass480_84;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "F")
	static final float aFloat259 = Math.ulp(1.0F);

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "F")
	static final float aFloat262 = aFloat259 * 2.0F;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "(Lclient!dr;[F[F)V")
	static void method25925(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
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
		arg0.aBoolean761 = local38 == 0.33333334F && local43 == 0.6666667F;
		@Pc(61) float local61 = local38;
		@Pc(64) float local64 = local43;
		if ((double) local38 < 0.0D) {
			local38 = 0.0F;
		}
		if ((double) local43 > 1.0D) {
			local43 = 1.0F;
		}
		if ((double) local38 > 1.0D || local43 < -1.0F) {
			Class712.method37179(local38, local43, -499538103);
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
		arg0.aFloat276 = arg1[0];
		arg0.aFloat277 = arg1[3];
		Class37.method17380(0.0F, local38, local43, 1.0F, arg0.aFloatArray97, (byte) -66);
		Class37.method17380(arg2[0], arg2[1], arg2[2], arg2[3], arg0.aFloatArray98, (byte) 49);
	}

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "(Lclient!dr;FZ)F")
	static float method25926(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) float local1 = 0.0F;
		if (arg0 == null || arg0.method26015(-2030978563) == 0) {
			return local1;
		}
		@Pc(19) float local19 = (float) (arg0.aClass253Array1[0].anInt3881 * -1813617981);
		@Pc(32) float local32 = (float) (arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].anInt3881 * -1813617981);
		@Pc(36) float local36 = local32 - local19;
		if ((double) local36 == 0.0D) {
			return arg0.aClass253Array1[0].aFloat284;
		}
		@Pc(49) float local49 = 0.0F;
		if (arg1 > local32) {
			local49 = (arg1 - local32) / local36;
		} else {
			local49 = (arg1 - local19) / local36;
		}
		@Pc(70) double local70 = (double) local49;
		@Pc(77) float local77 = Math.abs((float) ((double) local49 - local70));
		@Pc(81) float local81 = local36 * local77;
		@Pc(86) double local86 = Math.abs(local70 + 1.0D);
		@Pc(90) double local90 = local86 / 2.0D;
		@Pc(94) double local94 = (double) local90;
		@Pc(99) float local99 = (float) (local90 - local94);
		@Pc(147) float local147;
		@Pc(153) float local153;
		if (arg2) {
			if (Class225.aClass225_1 == arg0.aClass225_6) {
				if ((double) local99 == 0.0D) {
					local81 = local32 - local81;
				} else {
					local81 += local19;
				}
			} else if (arg0.aClass225_6 == Class225.aClass225_3 || arg0.aClass225_6 == Class225.aClass225_4) {
				local81 = local32 - local81;
			} else if (arg0.aClass225_6 == Class225.aClass225_2) {
				local81 = local19 - arg1;
				local147 = arg0.aClass253Array1[0].aFloat282;
				local153 = arg0.aClass253Array1[0].aFloat281;
				local1 = arg0.aClass253Array1[0].aFloat284;
				if ((double) local147 != 0.0D) {
					local1 -= local153 * local81 / local147;
				}
				return local1;
			}
		} else if (arg0.aClass225_7 == Class225.aClass225_1) {
			if ((double) local99 == 0.0D) {
				local81 += local19;
			} else {
				local81 = local32 - local81;
			}
		} else if (arg0.aClass225_7 == Class225.aClass225_3 || Class225.aClass225_4 == arg0.aClass225_7) {
			local81 += local19;
		} else if (arg0.aClass225_7 == Class225.aClass225_2) {
			local81 = arg1 - local32;
			local147 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat280;
			local153 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat283;
			local1 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284;
			if ((double) local147 != 0.0D) {
				local1 += local153 * local81 / local147;
			}
			return local1;
		}
		local1 = Class323.method27610(arg0, local81, (byte) 20);
		@Pc(286) float local286;
		if (arg2 && Class225.aClass225_4 == arg0.aClass225_6) {
			local286 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 - arg0.aClass253Array1[0].aFloat284;
			local1 = (float) ((double) local1 - (double) local286 * local86);
		} else if (!arg2 && Class225.aClass225_4 == arg0.aClass225_7) {
			local286 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 - arg0.aClass253Array1[0].aFloat284;
			local1 = (float) ((double) local1 + local86 * (double) local286);
		}
		return local1;
	}

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "(Lclient!dr;F)F")
	static float method25927(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null || arg0.method26015(-2030978563) == 0) {
			return 0.0F;
		} else if (arg1 < (float) (arg0.aClass253Array1[0].anInt3881 * -1813617981)) {
			return Class225.aClass225_5 == arg0.aClass225_6 ? arg0.aClass253Array1[0].aFloat284 : Class270.method26691(arg0, arg1, true, 1443552266);
		} else if (arg1 > (float) (arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].anInt3881 * -1813617981)) {
			return arg0.aClass225_7 == Class225.aClass225_5 ? arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 : Class270.method26691(arg0, arg1, false, 1309482685);
		} else if (arg0.aBoolean760) {
			return arg0.aClass253Array1[0].aFloat284;
		} else {
			@Pc(83) Class253 local83 = arg0.method26014(arg1, 808775019);
			@Pc(85) boolean local85 = false;
			@Pc(87) boolean local87 = false;
			if (local83 == null) {
				return 0.0F;
			}
			if ((double) local83.aFloat280 == 0.0D && (double) local83.aFloat283 == 0.0D) {
				local85 = true;
			} else if (Float.MAX_VALUE == local83.aFloat280 && local83.aFloat283 == Float.MAX_VALUE) {
				local87 = true;
			} else if (local83.aClass253_1 == null) {
				local85 = true;
			} else if (arg0.aBoolean759) {
				@Pc(127) float[] local127 = new float[4];
				@Pc(130) float[] local130 = new float[4];
				local127[0] = local83.anInt3881 * -1813617981;
				local130[0] = local83.aFloat284;
				local127[1] = local83.aFloat280 * 0.33333334F + local127[0];
				local130[1] = local83.aFloat283 * 0.33333334F + local130[0];
				local127[3] = local83.aClass253_1.anInt3881 * -1813617981;
				local130[3] = local83.aClass253_1.aFloat284;
				local127[2] = local127[3] - local83.aClass253_1.aFloat282 * 0.33333334F;
				local130[2] = local130[3] - local83.aClass253_1.aFloat281 * 0.33333334F;
				if (arg0.aBoolean762) {
					Class448.method29260(arg0, local127, local130, (byte) -29);
				} else {
					Class545.method31206(arg0, local127, local130, -416808090);
				}
				arg0.aBoolean759 = false;
			}
			if (local85) {
				return local83.aFloat284;
			} else if (local87) {
				return arg1 == (float) (local83.anInt3881 * -1813617981) || local83.aClass253_1 == null ? local83.aFloat284 : local83.aClass253_1.aFloat284;
			} else if (arg0.aBoolean762) {
				return Class85.method1697(arg0, arg1, -919718248);
			} else {
				return Class221.method25908(arg0, arg1, (short) -121);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!dr;F)F")
	static float method25928(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null || arg0.method26015(-2030978563) == 0) {
			return 0.0F;
		} else if (arg1 < (float) (arg0.aClass253Array1[0].anInt3881 * -1813617981)) {
			return Class225.aClass225_5 == arg0.aClass225_6 ? arg0.aClass253Array1[0].aFloat284 : Class270.method26691(arg0, arg1, true, 1906219627);
		} else if (arg1 > (float) (arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].anInt3881 * -1813617981)) {
			return arg0.aClass225_7 == Class225.aClass225_5 ? arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 : Class270.method26691(arg0, arg1, false, 1468862890);
		} else if (arg0.aBoolean760) {
			return arg0.aClass253Array1[0].aFloat284;
		} else {
			@Pc(83) Class253 local83 = arg0.method26014(arg1, 808775019);
			@Pc(85) boolean local85 = false;
			@Pc(87) boolean local87 = false;
			if (local83 == null) {
				return 0.0F;
			}
			if ((double) local83.aFloat280 == 0.0D && (double) local83.aFloat283 == 0.0D) {
				local85 = true;
			} else if (Float.MAX_VALUE == local83.aFloat280 && local83.aFloat283 == Float.MAX_VALUE) {
				local87 = true;
			} else if (local83.aClass253_1 == null) {
				local85 = true;
			} else if (arg0.aBoolean759) {
				@Pc(127) float[] local127 = new float[4];
				@Pc(130) float[] local130 = new float[4];
				local127[0] = local83.anInt3881 * -1813617981;
				local130[0] = local83.aFloat284;
				local127[1] = local83.aFloat280 * 0.33333334F + local127[0];
				local130[1] = local83.aFloat283 * 0.33333334F + local130[0];
				local127[3] = local83.aClass253_1.anInt3881 * -1813617981;
				local130[3] = local83.aClass253_1.aFloat284;
				local127[2] = local127[3] - local83.aClass253_1.aFloat282 * 0.33333334F;
				local130[2] = local130[3] - local83.aClass253_1.aFloat281 * 0.33333334F;
				if (arg0.aBoolean762) {
					Class448.method29260(arg0, local127, local130, (byte) -95);
				} else {
					Class545.method31206(arg0, local127, local130, 1169639063);
				}
				arg0.aBoolean759 = false;
			}
			if (local85) {
				return local83.aFloat284;
			} else if (local87) {
				return arg1 == (float) (local83.anInt3881 * -1813617981) || local83.aClass253_1 == null ? local83.aFloat284 : local83.aClass253_1.aFloat284;
			} else if (arg0.aBoolean762) {
				return Class85.method1697(arg0, arg1, -919718248);
			} else {
				return Class221.method25908(arg0, arg1, (short) -20370);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(Lclient!dr;[F[F)V")
	static void method25929(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat276 = arg1[0];
		@Pc(15) float local15 = arg1[3] - arg1[0];
		@Pc(23) float local23 = arg2[3] - arg2[0];
		@Pc(31) float local31 = arg1[1] - arg1[0];
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		if ((double) local31 != 0.0D) {
			local33 = (arg2[1] - arg2[0]) / local31;
		}
		local31 = arg1[3] - arg1[2];
		if ((double) local31 != 0.0D) {
			local35 = (arg2[3] - arg2[2]) / local31;
		}
		@Pc(79) float local79 = 1.0F / (local15 * local15);
		@Pc(83) float local83 = local33 * local15;
		@Pc(87) float local87 = local15 * local35;
		arg0.aFloatArray97[0] = (local87 + local83 - local23 - local23) * local79 / local15;
		arg0.aFloatArray97[1] = local79 * (local23 + local23 + local23 - local83 - local83 - local87);
		arg0.aFloatArray97[2] = local33;
		arg0.aFloatArray97[3] = arg2[0];
	}

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "(Lclient!dr;F)F")
	static float method25930(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat276) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat277) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat276) / (arg0.aFloat277 - arg0.aFloat276);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean761) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray97[0] - local10, arg0.aFloatArray97[1], arg0.aFloatArray97[2], arg0.aFloatArray97[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class236.method26137(local39, 3, 0.0F, true, 1.0F, true, local72, 2104853248);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return ((arg0.aFloatArray98[3] * local35 + arg0.aFloatArray98[2]) * local35 + arg0.aFloatArray98[1]) * local35 + arg0.aFloatArray98[0];
	}

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "(Lclient!dr;[F[F)V")
	static void method25931(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
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
		arg0.aBoolean761 = local38 == 0.33333334F && local43 == 0.6666667F;
		@Pc(61) float local61 = local38;
		@Pc(64) float local64 = local43;
		if ((double) local38 < 0.0D) {
			local38 = 0.0F;
		}
		if ((double) local43 > 1.0D) {
			local43 = 1.0F;
		}
		if ((double) local38 > 1.0D || local43 < -1.0F) {
			Class712.method37179(local38, local43, -723949551);
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
		arg0.aFloat276 = arg1[0];
		arg0.aFloat277 = arg1[3];
		Class37.method17380(0.0F, local38, local43, 1.0F, arg0.aFloatArray97, (byte) 6);
		Class37.method17380(arg2[0], arg2[1], arg2[2], arg2[3], arg0.aFloatArray98, (byte) 31);
	}

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "(Lclient!dr;[F[F)V")
	static void method25932(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
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
		arg0.aBoolean761 = local38 == 0.33333334F && local43 == 0.6666667F;
		@Pc(61) float local61 = local38;
		@Pc(64) float local64 = local43;
		if ((double) local38 < 0.0D) {
			local38 = 0.0F;
		}
		if ((double) local43 > 1.0D) {
			local43 = 1.0F;
		}
		if ((double) local38 > 1.0D || local43 < -1.0F) {
			Class712.method37179(local38, local43, -1940248235);
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
		arg0.aFloat276 = arg1[0];
		arg0.aFloat277 = arg1[3];
		Class37.method17380(0.0F, local38, local43, 1.0F, arg0.aFloatArray97, (byte) 68);
		Class37.method17380(arg2[0], arg2[1], arg2[2], arg2[3], arg0.aFloatArray98, (byte) 28);
	}

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "(Lclient!dr;F)F")
	static float method25933(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat276) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat277) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat276) / (arg0.aFloat277 - arg0.aFloat276);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean761) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray97[0] - local10, arg0.aFloatArray97[1], arg0.aFloatArray97[2], arg0.aFloatArray97[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class236.method26137(local39, 3, 0.0F, true, 1.0F, true, local72, 1518254423);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return ((arg0.aFloatArray98[3] * local35 + arg0.aFloatArray98[2]) * local35 + arg0.aFloatArray98[1]) * local35 + arg0.aFloatArray98[0];
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(Lclient!dr;[F[F)V")
	static void method25934(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat276 = arg1[0];
		@Pc(15) float local15 = arg1[3] - arg1[0];
		@Pc(23) float local23 = arg2[3] - arg2[0];
		@Pc(31) float local31 = arg1[1] - arg1[0];
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		if ((double) local31 != 0.0D) {
			local33 = (arg2[1] - arg2[0]) / local31;
		}
		local31 = arg1[3] - arg1[2];
		if ((double) local31 != 0.0D) {
			local35 = (arg2[3] - arg2[2]) / local31;
		}
		@Pc(79) float local79 = 1.0F / (local15 * local15);
		@Pc(83) float local83 = local33 * local15;
		@Pc(87) float local87 = local15 * local35;
		arg0.aFloatArray97[0] = (local87 + local83 - local23 - local23) * local79 / local15;
		arg0.aFloatArray97[1] = local79 * (local23 + local23 + local23 - local83 - local83 - local87);
		arg0.aFloatArray97[2] = local33;
		arg0.aFloatArray97[3] = arg2[0];
	}

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25935(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		@Pc(48) Float local48;
		if (arg0 + aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - aFloat259;
			local48 = 0.33333334F - aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + aFloat259 > local36) {
			local48 = local36 - aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < aFloat259 + local36) {
				local48 = aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25936(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		@Pc(48) Float local48;
		if (arg0 + aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - aFloat259;
			local48 = 0.33333334F - aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + aFloat259 > local36) {
			local48 = local36 - aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < aFloat259 + local36) {
				local48 = aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25937(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		@Pc(48) Float local48;
		if (arg0 + aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - aFloat259;
			local48 = 0.33333334F - aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + aFloat259 > local36) {
			local48 = local36 - aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < aFloat259 + local36) {
				local48 = aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25938(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		@Pc(48) Float local48;
		if (arg0 + aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - aFloat259;
			local48 = 0.33333334F - aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + aFloat259 > local36) {
			local48 = local36 - aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < aFloat259 + local36) {
				local48 = aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25939(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		@Pc(48) Float local48;
		if (arg0 + aFloat259 >= 1.3333334F) {
			@Pc(74) Float local74 = 1.3333334F - aFloat259;
			local48 = 0.33333334F - aFloat259;
			return;
		}
		@Pc(11) float local11 = arg0 - 2.0F;
		@Pc(16) float local16 = arg0 - 1.0F;
		@Pc(29) float local29 = (float) Math.sqrt((double) (local11 * local11 - local16 * 4.0F * local16));
		@Pc(36) float local36 = (-local11 + local29) * 0.5F;
		if (arg1 + aFloat259 > local36) {
			local48 = local36 - aFloat259;
		} else {
			local36 = (-local11 - local29) * 0.5F;
			if (arg1 < aFloat259 + local36) {
				local48 = aFloat259 + local36;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;)V")
	static void method25940(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (aFloat259 + local56 > 0.0F) {
				Class283.method26875(arg0, arg1, -2064994502);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(FFFF[F)V")
	static void method25941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "(II)V")
	static void method25942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class80_Sub1_Sub11 local4 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local4 != null; local4 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-1860215849)) {
			if (Class337.method27879(local4.anInt3079 * 1479399259, -2076745718) && local4.anInt3078 * 1896675471 >> 16 == arg0) {
				Class34.method743(local4, 64113964);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "bck", descriptor = "(Lclient!yp;B)V")
	static void method25943(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass120_Sub1_Sub5_Sub1_1.method24601(143782911);
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(Lclient!ald;I)Lclient!kn;")
	public static Class125 method25944(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class125_Sub2 local4 = (Class125_Sub2) Class312.method27467(arg0, (byte) -47);
		@Pc(8) int local8 = arg0.g2s();
		return new Class125_Sub2_Sub1(local4.aClass391_8, local4.aClass383_8, local4.anInt2899 * 808275465, local4.anInt2901 * 1789354437, local4.anInt2900 * 199320851, local4.anInt2903 * 1087492339, local4.anInt2902 * -173381277, local4.anInt2904 * -176628393, local4.anInt2905 * -1330014629, local4.anInt2907 * 80302769, local4.anInt2909 * 1969707833, local4.anInt2906 * -1908989391, local4.anInt2908 * -1284217071, local4.anInt2910 * 1921101589, local4.anInt2911 * 1339695313, local8);
	}

	@OriginalMember(owner = "client!dd", name = "ma", descriptor = "(II)V")
	public static void method25945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class477.aClass80_Sub32_3 == null || (arg0 < 0 || arg0 >= Class477.aClass80_Sub32_3.anInt1650 * 753247591)) {
			return;
		}
		@Pc(17) Class382 local17 = Class477.aClass80_Sub32_3.aClass382Array1[arg0];
		if (local17.aByte146 != -1) {
			return;
		}
		@Pc(25) Class75 local25 = Class52.method1074(16777215);
		@Pc(31) Class80_Sub31 local31 = Class623.method32440(Class443.aClass443_10, local25.aClass22_1, -191270971);
		local31.aPacketBit_2.p1(Class350.method28013(local17.aString204, (short) 16383) + 2);
		local31.aPacketBit_2.p2(arg0);
		local31.aPacketBit_2.pjstr(local17.aString204);
		local25.method1325(local31, (byte) -29);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	Class223() throws Throwable {
		throw new Error();
	}
}
