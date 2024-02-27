package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class181 {

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "F")
	float aFloat245;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "F")
	float aFloat246;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "F")
	float aFloat247;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	int anInt3318;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	int anInt3319;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	int anInt3322;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "F")
	float aFloat250;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
	boolean aBoolean575 = false;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
	boolean aBoolean571 = true;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Z")
	boolean aBoolean576 = false;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	int anInt3315 = 0;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
	boolean aBoolean572 = false;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Z")
	boolean aBoolean573 = false;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
	int[] anIntArray287 = new int[4096];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "F")
	float aFloat249 = 0.0F;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "F")
	float aFloat244 = 1.0F;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	int anInt3323 = -1;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
	int[] anIntArray289 = null;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	int anInt3320 = 0;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	int anInt3325 = 0;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "F")
	float aFloat248 = 0.0F;

	@OriginalMember(owner = "client!bd", name = "ag", descriptor = "I")
	int anInt3326 = 0;

	@OriginalMember(owner = "client!bd", name = "ah", descriptor = "Z")
	boolean aBoolean574 = true;

	@OriginalMember(owner = "client!bd", name = "al", descriptor = "I")
	int anInt3327 = -1;

	@OriginalMember(owner = "client!bd", name = "ac", descriptor = "[I")
	int[] anIntArray290 = null;

	@OriginalMember(owner = "client!bd", name = "ai", descriptor = "I")
	int anInt3317 = 0;

	@OriginalMember(owner = "client!bd", name = "aw", descriptor = "I")
	int anInt3328 = 0;

	@OriginalMember(owner = "client!bd", name = "as", descriptor = "F")
	float aFloat251 = 0.0F;

	@OriginalMember(owner = "client!bd", name = "at", descriptor = "I")
	int anInt3324 = -1;

	@OriginalMember(owner = "client!bd", name = "ad", descriptor = "[I")
	int[] anIntArray291 = null;

	@OriginalMember(owner = "client!bd", name = "am", descriptor = "I")
	int anInt3316 = 0;

	@OriginalMember(owner = "client!bd", name = "au", descriptor = "I")
	int anInt3329 = 0;

	@OriginalMember(owner = "client!bd", name = "ar", descriptor = "F")
	float aFloat252 = 0.0F;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_15;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!az;")
	Class176 aClass176_3;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	int anInt3321;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	int[] anIntArray288;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[F")
	float[] aFloatArray92;

	@OriginalMember(owner = "client!bd", name = "ae", descriptor = "Lclient!vn;")
	Class618 aClass618_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!afg;Lclient!az;)V")
	Class181(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class176 arg1) {
		this.aClass104_Sub3_15 = arg0;
		this.aClass176_3 = arg1;
		this.anInt3321 = this.aClass104_Sub3_15.anInt719 * 1808307287;
		this.anIntArray288 = this.aClass104_Sub3_15.anIntArray46;
		this.aFloatArray92 = this.aClass104_Sub3_15.aFloatArray20;
		this.aClass618_1 = Class618.aClass618_5;
	}

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "(ZZZFFFFFFFFFFFF)V")
	void method24535(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class685.anIntArray524[(int) arg12 & 0xFFFF], 748781590);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class685.anIntArray524[(int) arg12 & 0xFFFF], 1257507204);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class685.anIntArray524[(int) arg12 & 0xFFFF], -1353523894);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt3319)) {
						if (arg4 > (float) this.anInt3319) {
							arg4 = this.anInt3319;
						}
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt3319)) {
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						if (arg3 > (float) this.anInt3319) {
							arg3 = this.anInt3319;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt3319)) {
					if (arg3 > (float) this.anInt3319) {
						arg3 = this.anInt3319;
					}
					if (arg4 > (float) this.anInt3319) {
						arg4 = this.anInt3319;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
	int method24536() {
		return this.anIntArray287[0] % this.anInt3321;
	}

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "()I")
	int method24537() {
		return this.anIntArray287[0] / this.anInt3321;
	}

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "(Z)V")
	void method24538(@OriginalArg(0) boolean arg0) {
		this.aBoolean575 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "(ZZZFFFFFFFFFFFF)V")
	void method24539(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class685.anIntArray524[(int) arg12 & 0xFFFF], -582465116);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class685.anIntArray524[(int) arg12 & 0xFFFF], 681077079);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class685.anIntArray524[(int) arg12 & 0xFFFF], -567682120);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt3319)) {
						if (arg4 > (float) this.anInt3319) {
							arg4 = this.anInt3319;
						}
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt3319)) {
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						if (arg3 > (float) this.anInt3319) {
							arg3 = this.anInt3319;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt3319)) {
					if (arg3 > (float) this.anInt3319) {
						arg3 = this.anInt3319;
					}
					if (arg4 > (float) this.anInt3319) {
						arg4 = this.anInt3319;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "as", descriptor = "(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V")
	void method24540(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg7 - arg6) * local8;
		@Pc(20) float local20 = (arg9 - arg8) * local8;
		@Pc(26) float local26 = (arg11 - arg10) * local8;
		@Pc(32) float local32 = (arg13 - arg12) * local8;
		@Pc(38) float local38 = (arg15 - arg14) * local8;
		@Pc(44) float local44 = (arg17 - arg16) * local8;
		@Pc(50) float local50 = (arg19 - arg18) * local8;
		@Pc(56) float local56 = (arg21 - arg20) * local8;
		@Pc(62) float local62 = (arg23 - arg22) * local8;
		@Pc(68) float local68 = (arg25 - arg24) * local8;
		@Pc(74) float local74 = (arg27 - arg26) * local8;
		if (this.aBoolean572) {
			if (arg5 > this.anInt3318) {
				arg5 = this.anInt3318;
			}
			if (arg4 < 0) {
				arg6 -= local14 * (float) arg4;
				arg8 -= local20 * (float) arg4;
				arg10 -= local26 * (float) arg4;
				arg12 -= local32 * (float) arg4;
				arg14 -= local38 * (float) arg4;
				arg16 -= local44 * (float) arg4;
				arg18 -= local50 * (float) arg4;
				arg20 -= local56 * (float) arg4;
				arg22 -= local62 * (float) arg4;
				arg24 -= local68 * (float) arg4;
				arg26 -= local74 * (float) arg4;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		local3 = arg5 - arg4;
		@Pc(177) int local177 = arg3 + arg4;
		while (local3-- > 0) {
			@Pc(184) float local184 = 1.0F / arg6;
			@Pc(188) float local188 = 1.0F / arg8;
			if (!arg0 || local184 < this.aFloatArray92[local177]) {
				@Pc(201) float local201 = arg10 * local188;
				@Pc(205) float local205 = arg12 * local188;
				@Pc(218) int local218 = (int) (local201 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(231) int local231 = (int) (local205 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(241) int local241 = this.anIntArray289[local231 * this.anInt3320 + local218];
				@Pc(254) int local254 = (int) (local201 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(267) int local267 = (int) (local205 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(277) int local277 = this.anIntArray290[local267 * this.anInt3317 + local254];
				@Pc(290) int local290 = (int) (local201 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(303) int local303 = (int) (local205 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(313) int local313 = this.anIntArray291[local303 * this.anInt3316 + local290];
				@Pc(319) float local319 = 1.0F - (arg24 + arg26);
				@Pc(353) int local353 = ((int) (arg24 * (float) (local241 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg24 * (float) (local241 >> 8 & 0xFF)) << 8 | (int) (arg24 * (float) (local241 & 0xFF));
				@Pc(387) int local387 = ((int) (arg26 * (float) (local277 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg26 * (float) (local277 >> 8 & 0xFF)) << 8 | (int) (arg26 * (float) (local277 & 0xFF));
				@Pc(421) int local421 = ((int) (local319 * (float) (local313 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (local319 * (float) (local313 >> 8 & 0xFF)) << 8 | (int) (local319 * (float) (local313 & 0xFF));
				@Pc(427) int local427 = local353 + local387 + local421;
				@Pc(465) int local465 = ((int) (arg18 * (float) (local427 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg20 * (float) (local427 >> 8 & 0xFF)) & 0xFF00 | (int) (arg22 * (float) (local427 & 0xFF)) >> 8;
				if (arg14 != 0.0F) {
					@Pc(474) int local474 = (int) (255.0F - arg14);
					@Pc(496) int local496 = ((this.anInt3322 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					local465 = (((local465 & 0xFF00FF) * local474 & 0xFF00FF00 | (local465 & 0xFF00) * local474 & 0xFF0000) >>> 8) + local496;
				}
				if (arg1) {
					arg2[local177] = ((int) arg16 | arg2[local177] >> 24) << 24 | local465;
				} else {
					arg2[local177] = local465;
				}
				if (arg0) {
					this.aFloatArray92[local177] = local184;
				}
			}
			local177++;
			arg6 += local14;
			arg8 += local20;
			arg10 += local26;
			arg12 += local32;
			arg14 += local38;
			arg16 += local44;
			arg18 += local50;
			arg20 += local56;
			arg22 += local62;
			arg24 += local68;
			arg26 += local74;
		}
	}

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "(ZZZFFFFFFFFFIII)V")
	void method24541(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000, -1157680610);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000, 1258816420);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000, -1373887316);
		} else {
			@Pc(70) float local70 = arg7 - arg6;
			@Pc(74) float local74 = arg4 - arg3;
			@Pc(78) float local78 = arg8 - arg6;
			@Pc(82) float local82 = arg5 - arg3;
			@Pc(86) float local86 = arg10 - arg9;
			@Pc(90) float local90 = arg11 - arg9;
			@Pc(99) float local99 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(108) float local108 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(117) float local117 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(126) float local126 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(135) float local135 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			@Pc(144) float local144 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			@Pc(156) float local156;
			if (arg5 == arg4) {
				local156 = 0.0F;
			} else {
				local156 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(167) float local167;
			if (arg4 == arg3) {
				local167 = 0.0F;
			} else {
				local167 = local70 / local74;
			}
			@Pc(178) float local178;
			if (arg5 == arg3) {
				local178 = 0.0F;
			} else {
				local178 = local78 / local82;
			}
			@Pc(189) float local189 = local70 * local82 - local78 * local74;
			if (local189 != 0.0F) {
				@Pc(204) float local204 = (local86 * local82 - local90 * local74) / local189;
				@Pc(214) float local214 = (local90 * local70 - local86 * local78) / local189;
				@Pc(224) float local224 = (local99 * local82 - local108 * local74) / local189;
				@Pc(234) float local234 = (local108 * local70 - local99 * local78) / local189;
				@Pc(244) float local244 = (local117 * local82 - local126 * local74) / local189;
				@Pc(254) float local254 = (local126 * local70 - local117 * local78) / local189;
				@Pc(264) float local264 = (local135 * local82 - local144 * local74) / local189;
				@Pc(274) float local274 = (local144 * local70 - local135 * local78) / local189;
				@Pc(328) float local328;
				@Pc(339) float local339;
				@Pc(350) float local350;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt3319)) {
						if (arg4 > (float) this.anInt3319) {
							arg4 = this.anInt3319;
						}
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						arg9 = arg9 - local204 * arg6 + local204;
						local328 = (float) (arg12 & 0xFF0000) - local224 * arg6 + local224;
						local339 = (float) (arg12 & 0xFF00) - local244 * arg6 + local244;
						local350 = (float) (arg12 & 0xFF) - local264 * arg6 + local264;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local156 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local178 < local167 || arg3 == arg4 && local178 > local156) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local156 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local178 < local167 || arg3 == arg5 && local156 > local167) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt3319)) {
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						if (arg3 > (float) this.anInt3319) {
							arg3 = this.anInt3319;
						}
						arg10 = arg10 - local204 * arg7 + local204;
						local328 = (float) (arg13 & 0xFF0000) - local224 * arg7 + local224;
						local339 = (float) (arg13 & 0xFF00) - local244 * arg7 + local244;
						local350 = (float) (arg13 & 0xFF) - local264 * arg7 + local264;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local178 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local167 < local156 || arg4 == arg5 && local167 > local178) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local178 * arg3;
								arg3 = 0.0F;
							}
							if (local167 < local156) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt3319)) {
					if (arg3 > (float) this.anInt3319) {
						arg3 = this.anInt3319;
					}
					if (arg4 > (float) this.anInt3319) {
						arg4 = this.anInt3319;
					}
					arg11 = arg11 - local204 * arg8 + local204;
					local328 = (float) (arg14 & 0xFF0000) - local224 * arg8 + local224;
					local339 = (float) (arg14 & 0xFF00) - local244 * arg8 + local244;
					local350 = (float) (arg14 & 0xFF) - local264 * arg8 + local264;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local167 * arg3;
							arg3 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local167 * arg4;
							arg4 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "(ZZ[IIIIIIFFFFFFFF)V")
	void method24542(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15) {
		if (this.aBoolean572) {
			if (arg7 > this.anInt3318) {
				arg7 = this.anInt3318;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(223) int local223;
		@Pc(639) int local639;
		@Pc(643) int local643;
		@Pc(651) int local651;
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(58) float local58;
		@Pc(62) float local62;
		@Pc(66) float local66;
		@Pc(54) int local54;
		if (this.aBoolean573) {
			arg3 += arg6;
			arg10 += arg11 * (float) arg6;
			arg12 += arg13 * (float) arg6;
			arg14 += arg15 * (float) arg6;
			if (this.aBoolean571) {
				local54 = arg7 - arg6 >> 2;
				local58 = arg11 * 4.0F;
				local62 = arg13 * 4.0F;
				local66 = arg15 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							arg2[arg3] = local88;
							arg2[local103++] = local88;
							arg2[local103++] = local88;
							arg3 = local103 + 1;
							arg2[local103] = local88;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg2[arg3++] = local88;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean576) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local643 = local103++;
							@Pc(686) int local686 = arg2[local643];
							@Pc(690) int local690 = local88 + local686;
							@Pc(698) int local698 = (local88 & 0xFF00FF) + (local686 & 0xFF00FF);
							@Pc(708) int local708 = (local698 & 0x1000100) + (local690 - local698 & 0x10000);
							arg2[local643] = local690 - local708 | 0xFF000000 | local708 - (local708 >>> 8);
							@Pc(727) int local727 = local103++;
							@Pc(733) int local733 = arg2[local727];
							@Pc(737) int local737 = local88 + local733;
							@Pc(745) int local745 = (local88 & 0xFF00FF) + (local733 & 0xFF00FF);
							@Pc(755) int local755 = (local745 & 0x1000100) + (local737 - local745 & 0x10000);
							arg2[local727] = local737 - local755 | 0xFF000000 | local755 - (local755 >>> 8);
							arg3 = local103 + 1;
							@Pc(780) int local780 = arg2[local103];
							@Pc(784) int local784 = local88 + local780;
							@Pc(792) int local792 = (local88 & 0xFF00FF) + (local780 & 0xFF00FF);
							@Pc(802) int local802 = (local792 & 0x1000100) + (local784 - local792 & 0x10000);
							arg2[local103] = local784 - local802 | 0xFF000000 | local802 - (local802 >>> 8);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							local168 = arg3++;
							local639 = arg2[local168];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								local103 = arg3 + 1;
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								local103 = arg3 + 1;
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg2[arg3++] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean576) {
					do {
						local168 = arg3++;
						local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local639 = arg2[local168];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local54--;
					} while (local54 > 0);
				}
			}
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		arg12 += arg13 * (float) arg6;
		arg14 += arg15 * (float) arg6;
		@Pc(1259) float local1259;
		if (this.aClass176_3.aBoolean568) {
			if (this.aBoolean571) {
				local54 = arg7 - arg6 >> 2;
				local58 = arg11 * 4.0F;
				local62 = arg13 * 4.0F;
				local66 = arg15 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean576) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean576) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							local639 = arg2[arg3];
							local643 = local223 + local639;
							local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				}
			}
		} else if (this.aBoolean571) {
			local54 = arg7 - arg6 >> 2;
			local58 = arg11 * 4.0F;
			local62 = arg13 * 4.0F;
			local66 = arg15 * 4.0F;
			if (this.anInt3315 == 0) {
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local88;
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local88;
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			} else if (this.aBoolean576) {
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			} else {
				local163 = this.anInt3315;
				local168 = 256 - this.anInt3315;
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			}
		} else {
			local54 = arg7 - arg6;
			if (this.anInt3315 == 0) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			} else if (this.aBoolean576) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local639 = arg2[arg3];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						@Pc(3913) int local3913 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[arg3] = local643 - local3913 | 0xFF000000 | local3913 - (local3913 >>> 8);
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			} else {
				local163 = this.anInt3315;
				local168 = 256 - this.anInt3315;
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						@Pc(3775) int local3775 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local168 | local223 >> 24) << 24 | local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "(ZZZFFFFFFFFFI)V")
	void method24543(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12) {
		if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12, -2134573714);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12, -962178416);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12, 1374543383);
			return;
		}
		@Pc(46) float local46 = arg7 - arg6;
		@Pc(50) float local50 = arg4 - arg3;
		@Pc(54) float local54 = arg8 - arg6;
		@Pc(58) float local58 = arg5 - arg3;
		@Pc(62) float local62 = arg10 - arg9;
		@Pc(66) float local66 = arg11 - arg9;
		@Pc(68) float local68 = 0.0F;
		if (arg4 != arg3) {
			local68 = (arg7 - arg6) / (arg4 - arg3);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg5 != arg4) {
			local82 = (arg8 - arg7) / (arg5 - arg4);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg5 != arg3) {
			local96 = (arg6 - arg8) / (arg3 - arg5);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt3319)) {
				if (arg4 > (float) this.anInt3319) {
					arg4 = this.anInt3319;
				}
				if (arg5 > (float) this.anInt3319) {
					arg5 = this.anInt3319;
				}
				arg9 = arg9 - local131 * arg6 + local131;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= local82 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && local96 < local68 || arg3 == arg4 && local96 > local82) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg7, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg7, (int) arg8, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local82 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(local96 < local68)) && (arg3 != arg5 || !(local82 > local68))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg7, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg7, (int) arg6, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt3319)) {
				if (arg5 > (float) this.anInt3319) {
					arg5 = this.anInt3319;
				}
				if (arg3 > (float) this.anInt3319) {
					arg3 = this.anInt3319;
				}
				arg10 = arg10 - local131 * arg7 + local131;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local96 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && local68 < local82 || arg4 == arg5 && local68 > local96) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg8, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg8, (int) arg6, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= local96 * arg3;
						arg3 = 0.0F;
					}
					if (local68 < local82) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg8, (int) arg7, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg8, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt3319)) {
			if (arg3 > (float) this.anInt3319) {
				arg3 = this.anInt3319;
			}
			if (arg4 > (float) this.anInt3319) {
				arg4 = this.anInt3319;
			}
			arg11 = arg11 - local131 * arg8 + local131;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= local68 * arg3;
					arg3 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg6, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg6, (int) arg7, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= local68 * arg4;
					arg4 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg6, (int) arg8, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg6, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	void method24544(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(21) int local21 = arg28 & 0xFFFF;
		@Pc(102) int local102;
		if (local21 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local21);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt3326 = 0;
				@Pc(60) int local60 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), -68560199) & 0xFFFF];
				local102 = ((arg21 >> 16 & 0xFF) * (local60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local60 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local102, arg24, arg25, 1135296652), Class125_Sub2_Sub1.method21481(local102, arg24, arg26, 1723417320), Class125_Sub2_Sub1.method21481(local102, arg24, arg27, 1535668442));
				return;
			}
			this.anInt3323 = local21;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
			this.aBoolean574 = this.aClass104_Sub3_15.method5702(arg28);
			this.anInt3326 = this.aClass104_Sub3_15.method5701(arg28) & 0xFF;
		}
		this.anInt3322 = arg24;
		@Pc(185) float local185;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local185 = arg6;
				arg6 = arg7;
				arg7 = local185;
				@Pc(191) float local191 = arg3;
				arg3 = arg4;
				arg4 = local191;
				@Pc(197) float local197 = arg9;
				arg9 = arg10;
				arg10 = local197;
				@Pc(203) float local203 = arg15;
				arg15 = arg16;
				arg16 = local203;
				@Pc(209) float local209 = arg18;
				arg18 = arg19;
				arg19 = local209;
				@Pc(215) float local215 = arg12;
				arg12 = arg13;
				arg13 = local215;
				@Pc(221) float local221 = arg25;
				arg25 = arg26;
				arg26 = local221;
				local102 = arg21;
				arg21 = arg22;
				arg22 = local102;
			} else {
				local185 = arg6;
				arg6 = arg8;
				arg8 = local185;
				local185 = arg3;
				arg3 = arg5;
				arg5 = local185;
				local185 = arg9;
				arg9 = arg11;
				arg11 = local185;
				local185 = arg15;
				arg15 = arg17;
				arg17 = local185;
				local185 = arg18;
				arg18 = arg20;
				arg20 = local185;
				local185 = arg12;
				arg12 = arg14;
				arg14 = local185;
				local185 = arg25;
				arg25 = arg27;
				arg27 = local185;
				local102 = arg21;
				arg21 = arg23;
				arg23 = local102;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local185 = arg21 >> 24 & 0xFF;
		@Pc(342) float local342 = (float) (arg22 >> 24 & 0xFF);
		@Pc(349) float local349 = (float) (arg23 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg21 >> 16 & 0xFF);
		@Pc(363) float local363 = (float) (arg22 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg23 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg21 >> 8 & 0xFF);
		@Pc(384) float local384 = (float) (arg22 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg23 >> 8 & 0xFF);
		@Pc(396) float local396 = (float) (arg21 & 0xFF);
		@Pc(401) float local401 = (float) (arg22 & 0xFF);
		@Pc(406) float local406 = (float) (arg23 & 0xFF);
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(422) float local422 = 0.0F;
		@Pc(424) float local424 = 0.0F;
		@Pc(426) float local426 = 0.0F;
		@Pc(434) float local434;
		if (arg4 != arg3) {
			local434 = arg4 - arg3;
			local408 = (arg7 - arg6) / local434;
			local410 = (arg10 - arg9) / local434;
			local412 = (arg13 - arg12) / local434;
			local414 = (arg16 - arg15) / local434;
			local416 = (arg19 - arg18) / local434;
			local418 = (arg26 - arg25) / local434;
			local420 = (local342 - local185) / local434;
			local422 = (local363 - local356) / local434;
			local424 = (local384 - local377) / local434;
			local426 = (local401 - local396) / local434;
		}
		local434 = 0.0F;
		@Pc(498) float local498 = 0.0F;
		@Pc(500) float local500 = 0.0F;
		@Pc(502) float local502 = 0.0F;
		@Pc(504) float local504 = 0.0F;
		@Pc(506) float local506 = 0.0F;
		@Pc(508) float local508 = 0.0F;
		@Pc(510) float local510 = 0.0F;
		@Pc(512) float local512 = 0.0F;
		@Pc(514) float local514 = 0.0F;
		@Pc(522) float local522;
		if (arg5 != arg4) {
			local522 = arg5 - arg4;
			local434 = (arg8 - arg7) / local522;
			local498 = (arg11 - arg10) / local522;
			local500 = (arg14 - arg13) / local522;
			local502 = (arg17 - arg16) / local522;
			local504 = (arg20 - arg19) / local522;
			local506 = (arg27 - arg26) / local522;
			local508 = (local349 - local342) / local522;
			local510 = (local370 - local363) / local522;
			local512 = (local391 - local384) / local522;
			local514 = (local406 - local401) / local522;
		}
		local522 = 0.0F;
		@Pc(586) float local586 = 0.0F;
		@Pc(588) float local588 = 0.0F;
		@Pc(590) float local590 = 0.0F;
		@Pc(592) float local592 = 0.0F;
		@Pc(594) float local594 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		if (arg3 != arg5) {
			@Pc(610) float local610 = arg3 - arg5;
			local522 = (arg6 - arg8) / local610;
			local586 = (arg9 - arg11) / local610;
			local588 = (arg12 - arg14) / local610;
			local590 = (arg15 - arg17) / local610;
			local592 = (arg18 - arg20) / local610;
			local594 = (arg25 - arg27) / local610;
			local596 = (local185 - local349) / local610;
			local598 = (local356 - local370) / local610;
			local600 = (local377 - local391) / local610;
			local602 = (local396 - local406) / local610;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local342 = local185;
			local363 = local356;
			local384 = local377;
			local401 = local396;
			if (arg3 < 0.0F) {
				arg6 -= local408 * arg3;
				arg7 -= local522 * arg3;
				arg9 -= local410 * arg3;
				arg10 -= local586 * arg3;
				arg12 -= local412 * arg3;
				arg13 -= local588 * arg3;
				arg15 -= local414 * arg3;
				arg16 -= local590 * arg3;
				arg18 -= local416 * arg3;
				arg19 -= local592 * arg3;
				arg25 -= local418 * arg3;
				arg26 -= local594 * arg3;
				local185 -= local420 * arg3;
				local342 -= local596 * arg3;
				local356 -= local420 * arg3;
				local363 -= local596 * arg3;
				local377 -= local420 * arg3;
				local384 -= local596 * arg3;
				local396 -= local420 * arg3;
				local401 -= local596 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local434 * arg5;
				arg11 -= local498 * arg5;
				arg14 -= local500 * arg5;
				arg17 -= local502 * arg5;
				arg20 -= local504 * arg5;
				arg27 -= local506 * arg5;
				local349 -= local508 * arg5;
				local370 -= local510 * arg5;
				local391 -= local512 * arg5;
				local406 -= local514 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local522 < local408 || arg3 == arg5 && local434 > local408) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local342, local185, local363, local356, local384, local377, local401, local396);
					arg6 += local408;
					arg7 += local522;
					arg9 += local410;
					arg10 += local586;
					arg12 += local412;
					arg13 += local588;
					arg15 += local414;
					arg16 += local590;
					arg18 += local416;
					arg19 += local592;
					arg25 += local418;
					arg26 += local594;
					local185 += local420;
					local342 += local596;
					local356 += local422;
					local363 += local598;
					local377 += local424;
					local384 += local600;
					local396 += local426;
					local401 += local602;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
					arg8 += local434;
					arg6 += local408;
					arg11 += local498;
					arg9 += local410;
					arg14 += local500;
					arg12 += local412;
					arg17 += local502;
					arg15 += local414;
					arg20 += local504;
					arg18 += local416;
					arg27 += local506;
					arg25 += local418;
					local349 += local508;
					local185 += local420;
					local370 += local510;
					local356 += local422;
					local391 += local512;
					local377 += local424;
					local406 += local514;
					local396 += local426;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local185, local342, local356, local363, local377, local384, local396, local401);
					arg7 += local522;
					arg6 += local408;
					arg10 += local586;
					arg9 += local410;
					arg13 += local588;
					arg12 += local412;
					arg16 += local590;
					arg15 += local414;
					arg19 += local592;
					arg18 += local416;
					arg26 += local594;
					arg25 += local418;
					local342 += local596;
					local185 += local420;
					local363 += local598;
					local356 += local422;
					local384 += local600;
					local377 += local424;
					local401 += local602;
					local396 += local426;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
					arg6 += local408;
					arg8 += local434;
					arg9 += local410;
					arg11 += local498;
					arg12 += local412;
					arg14 += local500;
					arg15 += local414;
					arg17 += local502;
					arg18 += local416;
					arg20 += local504;
					arg25 += local418;
					arg27 += local506;
					local185 += local420;
					local349 += local508;
					local356 += local422;
					local370 += local510;
					local377 += local424;
					local391 += local512;
					local396 += local426;
					local406 += local514;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local349 = local185;
		local370 = local356;
		local391 = local377;
		local406 = local396;
		if (arg3 < 0.0F) {
			arg6 -= local408 * arg3;
			arg8 -= local522 * arg3;
			arg9 -= local410 * arg3;
			arg11 -= local586 * arg3;
			arg12 -= local412 * arg3;
			arg14 -= local588 * arg3;
			arg15 -= local414 * arg3;
			arg17 -= local590 * arg3;
			arg18 -= local416 * arg3;
			arg20 -= local592 * arg3;
			arg25 -= local418 * arg3;
			arg27 -= local594 * arg3;
			local185 -= local420 * arg3;
			local349 -= local596 * arg3;
			local356 -= local420 * arg3;
			local370 -= local596 * arg3;
			local377 -= local420 * arg3;
			local391 -= local596 * arg3;
			local396 -= local420 * arg3;
			local406 -= local596 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local434 * arg4;
			arg10 -= local498 * arg4;
			arg13 -= local500 * arg4;
			arg16 -= local502 * arg4;
			arg19 -= local504 * arg4;
			arg26 -= local506 * arg4;
			local342 -= local508 * arg4;
			local363 -= local510 * arg4;
			local384 -= local512 * arg4;
			local401 -= local514 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local522 < local408 || !(arg3 != arg4 || !(local522 > local434))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
				arg6 += local408;
				arg8 += local522;
				arg9 += local410;
				arg11 += local586;
				arg12 += local412;
				arg14 += local588;
				arg15 += local414;
				arg17 += local590;
				arg18 += local416;
				arg20 += local592;
				arg25 += local418;
				arg27 += local594;
				local185 += local420;
				local349 += local596;
				local356 += local422;
				local370 += local598;
				local377 += local424;
				local391 += local600;
				local396 += local426;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local349, local342, local370, local363, local391, local384, local406, local401);
				arg7 += local434;
				arg8 += local522;
				arg10 += local498;
				arg11 += local586;
				arg13 += local500;
				arg14 += local588;
				arg16 += local502;
				arg17 += local590;
				arg19 += local504;
				arg20 += local592;
				arg26 += local506;
				arg27 += local594;
				local342 += local508;
				local349 += local596;
				local363 += local510;
				local370 += local598;
				local384 += local512;
				local391 += local600;
				local401 += local514;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
			arg6 += local408;
			arg8 += local522;
			arg9 += local410;
			arg11 += local586;
			arg12 += local412;
			arg14 += local588;
			arg15 += local414;
			arg17 += local590;
			arg18 += local416;
			arg20 += local592;
			arg25 += local418;
			arg27 += local594;
			local185 += local420;
			local349 += local596;
			local356 += local422;
			local370 += local598;
			local377 += local424;
			local391 += local600;
			local396 += local426;
			local406 += local602;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local342, local349, local363, local370, local384, local391, local401, local406);
			arg7 += local434;
			arg8 += local522;
			arg10 += local498;
			arg11 += local586;
			arg13 += local500;
			arg14 += local588;
			arg16 += local502;
			arg17 += local590;
			arg19 += local504;
			arg20 += local592;
			arg26 += local506;
			arg27 += local594;
			local342 += local508;
			local349 += local596;
			local363 += local510;
			local370 += local598;
			local384 += local512;
			local391 += local600;
			local401 += local514;
			local406 += local602;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V")
	void method24545(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean572) {
			if (arg6 > this.anInt3318) {
				arg6 = this.anInt3318;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray92[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local180 &= this.anInt3325;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt3325) {
					local180 = this.anInt3325;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local210 &= this.anInt3325;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt3325) {
					local210 = this.anInt3325;
				}
				@Pc(241) int local241 = this.anIntArray289[local210 * this.anInt3320 + local180];
				@Pc(243) boolean local243 = true;
				@Pc(259) int local259;
				if (this.aClass618_1 == Class618.aClass618_3) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass618_1 != Class618.aClass618_4) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt3326) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "()I")
	int method24546() {
		return this.anIntArray287[0] / this.anInt3321;
	}

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V")
	void method24547(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg7 - arg6) * local8;
		@Pc(20) float local20 = (arg9 - arg8) * local8;
		@Pc(26) float local26 = (arg11 - arg10) * local8;
		@Pc(32) float local32 = (arg13 - arg12) * local8;
		@Pc(38) float local38 = (arg15 - arg14) * local8;
		@Pc(44) float local44 = (arg17 - arg16) * local8;
		@Pc(50) float local50 = (arg19 - arg18) * local8;
		@Pc(56) float local56 = (arg21 - arg20) * local8;
		@Pc(62) float local62 = (arg23 - arg22) * local8;
		@Pc(68) float local68 = (arg25 - arg24) * local8;
		@Pc(74) float local74 = (arg27 - arg26) * local8;
		if (this.aBoolean572) {
			if (arg5 > this.anInt3318) {
				arg5 = this.anInt3318;
			}
			if (arg4 < 0) {
				arg6 -= local14 * (float) arg4;
				arg8 -= local20 * (float) arg4;
				arg10 -= local26 * (float) arg4;
				arg12 -= local32 * (float) arg4;
				arg14 -= local38 * (float) arg4;
				arg16 -= local44 * (float) arg4;
				arg18 -= local50 * (float) arg4;
				arg20 -= local56 * (float) arg4;
				arg22 -= local62 * (float) arg4;
				arg24 -= local68 * (float) arg4;
				arg26 -= local74 * (float) arg4;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		local3 = arg5 - arg4;
		@Pc(177) int local177 = arg3 + arg4;
		while (local3-- > 0) {
			@Pc(184) float local184 = 1.0F / arg6;
			@Pc(188) float local188 = 1.0F / arg8;
			if (!arg0 || local184 < this.aFloatArray92[local177]) {
				@Pc(201) float local201 = arg10 * local188;
				@Pc(205) float local205 = arg12 * local188;
				@Pc(218) int local218 = (int) (local201 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(231) int local231 = (int) (local205 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(241) int local241 = this.anIntArray289[local231 * this.anInt3320 + local218];
				@Pc(254) int local254 = (int) (local201 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(267) int local267 = (int) (local205 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(277) int local277 = this.anIntArray290[local267 * this.anInt3317 + local254];
				@Pc(290) int local290 = (int) (local201 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(303) int local303 = (int) (local205 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(313) int local313 = this.anIntArray291[local303 * this.anInt3316 + local290];
				@Pc(319) float local319 = 1.0F - (arg24 + arg26);
				@Pc(353) int local353 = ((int) (arg24 * (float) (local241 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg24 * (float) (local241 >> 8 & 0xFF)) << 8 | (int) (arg24 * (float) (local241 & 0xFF));
				@Pc(387) int local387 = ((int) (arg26 * (float) (local277 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg26 * (float) (local277 >> 8 & 0xFF)) << 8 | (int) (arg26 * (float) (local277 & 0xFF));
				@Pc(421) int local421 = ((int) (local319 * (float) (local313 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (local319 * (float) (local313 >> 8 & 0xFF)) << 8 | (int) (local319 * (float) (local313 & 0xFF));
				@Pc(427) int local427 = local353 + local387 + local421;
				@Pc(465) int local465 = ((int) (arg18 * (float) (local427 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg20 * (float) (local427 >> 8 & 0xFF)) & 0xFF00 | (int) (arg22 * (float) (local427 & 0xFF)) >> 8;
				if (arg14 != 0.0F) {
					@Pc(474) int local474 = (int) (255.0F - arg14);
					@Pc(496) int local496 = ((this.anInt3322 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					local465 = (((local465 & 0xFF00FF) * local474 & 0xFF00FF00 | (local465 & 0xFF00) * local474 & 0xFF0000) >>> 8) + local496;
				}
				if (arg1) {
					arg2[local177] = ((int) arg16 | arg2[local177] >> 24) << 24 | local465;
				} else {
					arg2[local177] = local465;
				}
				if (arg0) {
					this.aFloatArray92[local177] = local184;
				}
			}
			local177++;
			arg6 += local14;
			arg8 += local20;
			arg10 += local26;
			arg12 += local32;
			arg14 += local38;
			arg16 += local44;
			arg18 += local50;
			arg20 += local56;
			arg22 += local62;
			arg24 += local68;
			arg26 += local74;
		}
	}

	@OriginalMember(owner = "client!bd", name = "aw", descriptor = "(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V")
	void method24548(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg7 - arg6) * local8;
		@Pc(20) float local20 = (arg9 - arg8) * local8;
		@Pc(26) float local26 = (arg11 - arg10) * local8;
		@Pc(32) float local32 = (arg13 - arg12) * local8;
		@Pc(38) float local38 = (arg15 - arg14) * local8;
		@Pc(44) float local44 = (arg17 - arg16) * local8;
		@Pc(50) float local50 = (arg19 - arg18) * local8;
		@Pc(56) float local56 = (arg21 - arg20) * local8;
		@Pc(62) float local62 = (arg23 - arg22) * local8;
		@Pc(68) float local68 = (arg25 - arg24) * local8;
		@Pc(74) float local74 = (arg27 - arg26) * local8;
		if (this.aBoolean572) {
			if (arg5 > this.anInt3318) {
				arg5 = this.anInt3318;
			}
			if (arg4 < 0) {
				arg6 -= local14 * (float) arg4;
				arg8 -= local20 * (float) arg4;
				arg10 -= local26 * (float) arg4;
				arg12 -= local32 * (float) arg4;
				arg14 -= local38 * (float) arg4;
				arg16 -= local44 * (float) arg4;
				arg18 -= local50 * (float) arg4;
				arg20 -= local56 * (float) arg4;
				arg22 -= local62 * (float) arg4;
				arg24 -= local68 * (float) arg4;
				arg26 -= local74 * (float) arg4;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		local3 = arg5 - arg4;
		@Pc(177) int local177 = arg3 + arg4;
		while (local3-- > 0) {
			@Pc(184) float local184 = 1.0F / arg6;
			@Pc(188) float local188 = 1.0F / arg8;
			if (!arg0 || local184 < this.aFloatArray92[local177]) {
				@Pc(201) float local201 = arg10 * local188;
				@Pc(205) float local205 = arg12 * local188;
				@Pc(218) int local218 = (int) (local201 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(231) int local231 = (int) (local205 * (float) this.anInt3320 * this.aFloat248) & this.anInt3325;
				@Pc(241) int local241 = this.anIntArray289[local231 * this.anInt3320 + local218];
				@Pc(254) int local254 = (int) (local201 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(267) int local267 = (int) (local205 * (float) this.anInt3317 * this.aFloat251) & this.anInt3328;
				@Pc(277) int local277 = this.anIntArray290[local267 * this.anInt3317 + local254];
				@Pc(290) int local290 = (int) (local201 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(303) int local303 = (int) (local205 * (float) this.anInt3316 * this.aFloat252) & this.anInt3329;
				@Pc(313) int local313 = this.anIntArray291[local303 * this.anInt3316 + local290];
				@Pc(319) float local319 = 1.0F - (arg24 + arg26);
				@Pc(353) int local353 = ((int) (arg24 * (float) (local241 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg24 * (float) (local241 >> 8 & 0xFF)) << 8 | (int) (arg24 * (float) (local241 & 0xFF));
				@Pc(387) int local387 = ((int) (arg26 * (float) (local277 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg26 * (float) (local277 >> 8 & 0xFF)) << 8 | (int) (arg26 * (float) (local277 & 0xFF));
				@Pc(421) int local421 = ((int) (local319 * (float) (local313 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (local319 * (float) (local313 >> 8 & 0xFF)) << 8 | (int) (local319 * (float) (local313 & 0xFF));
				@Pc(427) int local427 = local353 + local387 + local421;
				@Pc(465) int local465 = ((int) (arg18 * (float) (local427 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg20 * (float) (local427 >> 8 & 0xFF)) & 0xFF00 | (int) (arg22 * (float) (local427 & 0xFF)) >> 8;
				if (arg14 != 0.0F) {
					@Pc(474) int local474 = (int) (255.0F - arg14);
					@Pc(496) int local496 = ((this.anInt3322 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					local465 = (((local465 & 0xFF00FF) * local474 & 0xFF00FF00 | (local465 & 0xFF00) * local474 & 0xFF0000) >>> 8) + local496;
				}
				if (arg1) {
					arg2[local177] = ((int) arg16 | arg2[local177] >> 24) << 24 | local465;
				} else {
					arg2[local177] = local465;
				}
				if (arg0) {
					this.aFloatArray92[local177] = local184;
				}
			}
			local177++;
			arg6 += local14;
			arg8 += local20;
			arg10 += local26;
			arg12 += local32;
			arg14 += local38;
			arg16 += local44;
			arg18 += local50;
			arg20 += local56;
			arg22 += local62;
			arg24 += local68;
			arg26 += local74;
		}
	}

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "()I")
	int method24549() {
		return this.anIntArray287[0] % this.anInt3321;
	}

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "(ZZZ[IIIIIIFF)V")
	void method24550(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (this.aBoolean572) {
			if (arg8 > this.anInt3318) {
				arg8 = this.anInt3318;
			}
			if (arg7 < 0) {
				arg7 = 0;
			}
		}
		if (arg7 >= arg8) {
			return;
		}
		arg4 += arg7 - 1;
		@Pc(29) int local29 = arg8 - arg7 >> 2;
		arg9 += arg10 * (float) arg7;
		@Pc(342) int local342;
		@Pc(347) int local347;
		@Pc(386) int local386;
		@Pc(47) int local47;
		@Pc(367) int local367;
		@Pc(73) float local73;
		if (this.aClass176_3.aBoolean568) {
			if (this.anInt3315 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray92[arg4]) {
								if (arg0) {
									arg3[arg4] = arg5;
								}
								if (arg1) {
									this.aFloatArray92[arg4] = arg9;
								}
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray92[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray92[local47] = arg9;
						}
					}
					local73 = arg9 + arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray92[local47] = local73;
						}
					}
					local73 += arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray92[local47] = local73;
						}
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray92[arg4]) {
						if (arg0) {
							arg3[arg4] = arg5;
						}
						if (arg1) {
							this.aFloatArray92[arg4] = local73;
						}
					}
					arg9 = local73 + arg10;
				}
			} else if (this.anInt3315 != 254) {
				local342 = this.anInt3315;
				local347 = 256 - this.anInt3315;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray92[arg4]) {
								if (arg0) {
									local386 = arg3[arg4];
									if (arg2) {
										arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									} else {
										arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									}
								}
								if (arg1) {
									this.aFloatArray92[arg4] = arg9;
								}
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray92[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray92[local47] = arg9;
						}
					}
					local73 = arg9 + arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray92[local47] = local73;
						}
					}
					local73 += arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray92[local47] = local73;
						}
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray92[arg4]) {
						if (arg0) {
							local386 = arg3[arg4];
							if (arg2) {
								arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray92[arg4] = local73;
						}
					}
					arg9 = local73 + arg10;
				}
			} else if (arg7 != 0 && arg8 <= this.anInt3318 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if ((!arg1 || arg9 < this.aFloatArray92[arg4]) && arg0) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if ((!arg1 || arg9 < this.aFloatArray92[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg9 + arg10;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray92[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg10;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray92[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if ((!arg1 || local73 < this.aFloatArray92[arg4]) && arg0) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg9 = local73 + arg10;
				}
			}
		} else if (arg0) {
			if (this.anInt3315 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray92[arg4]) {
								arg3[arg4] = arg5;
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray92[local47]) {
						arg3[local47] = arg5;
					}
					local73 = arg9 + arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray92[arg4]) {
						arg3[arg4] = arg5;
					}
					arg9 = local73 + arg10;
				}
			} else if (this.anInt3315 != 254) {
				local342 = this.anInt3315;
				local347 = 256 - this.anInt3315;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray92[arg4]) {
								local386 = arg3[arg4];
								if (arg2) {
									arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								} else {
									arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								}
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray92[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 = arg9 + arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray92[arg4]) {
						local386 = arg3[arg4];
						if (arg2) {
							arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					arg9 = local73 + arg10;
				}
			} else if (arg7 != 0 && arg8 <= this.anInt3318 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg8 - arg7 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray92[arg4]) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg9 += arg10;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray92[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg9 + arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg10;
					local47++;
					if (!arg1 || local73 < this.aFloatArray92[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg10;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray92[arg4]) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg9 = local73 + arg10;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "(Z)V")
	void method24551(@OriginalArg(0) boolean arg0) {
		this.aBoolean575 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "(ZZZFFFFFFFFFFFF)V")
	void method24552(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class685.anIntArray524[(int) arg12 & 0xFFFF], -1546942621);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class685.anIntArray524[(int) arg12 & 0xFFFF], 406519158);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class685.anIntArray524[(int) arg12 & 0xFFFF], -962929688);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt3319)) {
						if (arg4 > (float) this.anInt3319) {
							arg4 = this.anInt3319;
						}
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt3321;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt3319)) {
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						if (arg3 > (float) this.anInt3319) {
							arg3 = this.anInt3319;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24567(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt3321;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt3319)) {
					if (arg3 > (float) this.anInt3319) {
						arg3 = this.anInt3319;
					}
					if (arg4 > (float) this.anInt3319) {
						arg4 = this.anInt3319;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24567(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt3321;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIFIFIF)V")
	void method24553(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) float arg29, @OriginalArg(30) int arg30, @OriginalArg(31) float arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt3322 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg29;
				arg29 = arg31;
				arg31 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg28;
				arg28 = arg30;
				arg30 = local89;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg29;
				arg29 = arg33;
				arg33 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg28;
				arg28 = arg32;
				arg32 = local83;
			}
		}
		@Pc(158) int local158 = arg28 & 0xFFFF;
		local83 = arg30 & 0xFFFF;
		@Pc(166) int local166 = arg32 & 0xFFFF;
		@Pc(202) int local202;
		@Pc(244) int local244;
		if (local158 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local158);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), -1293778536) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1699449133), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1772173601), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1338999612));
				return;
			}
			this.anInt3323 = local158;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
		}
		this.aFloat248 = arg29;
		if (local83 != this.anInt3327) {
			this.anIntArray290 = this.aClass104_Sub3_15.method5697(local83);
			if (this.anIntArray290 == null) {
				this.anInt3327 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg30), -1451210008) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 935360640), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1780919359), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1266772573));
				return;
			}
			this.anInt3327 = local83;
			this.anInt3317 = this.aClass104_Sub3_15.method5699(arg30);
			this.anInt3328 = this.anInt3317 - 1;
		}
		this.aFloat251 = arg31;
		if (local166 != this.anInt3324) {
			this.anIntArray291 = this.aClass104_Sub3_15.method5697(local166);
			if (this.anIntArray291 == null) {
				this.anInt3324 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg32), 1655911532) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1248983081), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1691928535), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1419676333));
				return;
			}
			this.anInt3324 = local166;
			this.anInt3316 = this.aClass104_Sub3_15.method5699(arg32);
			this.anInt3329 = this.anInt3316 - 1;
		}
		this.aFloat252 = arg33;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(623) float local623 = (float) (arg21 >> 24 & 0xFF);
		@Pc(630) float local630 = (float) (arg22 >> 24 & 0xFF);
		@Pc(637) float local637 = (float) (arg23 >> 24 & 0xFF);
		@Pc(644) float local644 = (float) (arg21 >> 16 & 0xFF);
		@Pc(651) float local651 = (float) (arg22 >> 16 & 0xFF);
		@Pc(658) float local658 = (float) (arg23 >> 16 & 0xFF);
		@Pc(665) float local665 = (float) (arg21 >> 8 & 0xFF);
		@Pc(672) float local672 = (float) (arg22 >> 8 & 0xFF);
		@Pc(679) float local679 = (float) (arg23 >> 8 & 0xFF);
		@Pc(684) float local684 = (float) (arg21 & 0xFF);
		@Pc(689) float local689 = (float) (arg22 & 0xFF);
		@Pc(694) float local694 = (float) (arg23 & 0xFF);
		@Pc(696) float local696 = 1.0F;
		@Pc(698) float local698 = 0.0F;
		@Pc(700) float local700 = 0.0F;
		@Pc(702) float local702 = 0.0F;
		@Pc(704) float local704 = 1.0F;
		@Pc(706) float local706 = 0.0F;
		@Pc(708) float local708 = 0.0F;
		@Pc(710) float local710 = 0.0F;
		@Pc(712) float local712 = 0.0F;
		@Pc(714) float local714 = 0.0F;
		@Pc(716) float local716 = 0.0F;
		@Pc(718) float local718 = 0.0F;
		@Pc(720) float local720 = 0.0F;
		@Pc(722) float local722 = 0.0F;
		@Pc(724) float local724 = 0.0F;
		@Pc(726) float local726 = 0.0F;
		@Pc(728) float local728 = 0.0F;
		@Pc(730) float local730 = 0.0F;
		@Pc(738) float local738;
		if (arg4 != arg3) {
			local738 = arg4 - arg3;
			local708 = (arg7 - arg6) / local738;
			local710 = (arg10 - arg9) / local738;
			local712 = (arg13 - arg12) / local738;
			local714 = (arg16 - arg15) / local738;
			local716 = (arg19 - arg18) / local738;
			local718 = (arg26 - arg25) / local738;
			local720 = (local630 - local623) / local738;
			local722 = (local651 - local644) / local738;
			local724 = (local672 - local665) / local738;
			local726 = (local689 - local684) / local738;
			local728 = (local698 - local696) / local738;
			local730 = (local704 - local702) / local738;
		}
		local738 = 0.0F;
		@Pc(814) float local814 = 0.0F;
		@Pc(816) float local816 = 0.0F;
		@Pc(818) float local818 = 0.0F;
		@Pc(820) float local820 = 0.0F;
		@Pc(822) float local822 = 0.0F;
		@Pc(824) float local824 = 0.0F;
		@Pc(826) float local826 = 0.0F;
		@Pc(828) float local828 = 0.0F;
		@Pc(830) float local830 = 0.0F;
		@Pc(832) float local832 = 0.0F;
		@Pc(834) float local834 = 0.0F;
		@Pc(842) float local842;
		if (arg5 != arg4) {
			local842 = arg5 - arg4;
			local738 = (arg8 - arg7) / local842;
			local814 = (arg11 - arg10) / local842;
			local816 = (arg14 - arg13) / local842;
			local818 = (arg17 - arg16) / local842;
			local820 = (arg20 - arg19) / local842;
			local822 = (arg27 - arg26) / local842;
			local824 = (local637 - local630) / local842;
			local826 = (local658 - local651) / local842;
			local828 = (local679 - local672) / local842;
			local830 = (local694 - local689) / local842;
			local832 = (local700 - local698) / local842;
			local834 = (local706 - local704) / local842;
		}
		local842 = 0.0F;
		@Pc(918) float local918 = 0.0F;
		@Pc(920) float local920 = 0.0F;
		@Pc(922) float local922 = 0.0F;
		@Pc(924) float local924 = 0.0F;
		@Pc(926) float local926 = 0.0F;
		@Pc(928) float local928 = 0.0F;
		@Pc(930) float local930 = 0.0F;
		@Pc(932) float local932 = 0.0F;
		@Pc(934) float local934 = 0.0F;
		@Pc(936) float local936 = 0.0F;
		@Pc(938) float local938 = 0.0F;
		if (arg3 != arg5) {
			@Pc(946) float local946 = arg3 - arg5;
			local842 = (arg6 - arg8) / local946;
			local918 = (arg9 - arg11) / local946;
			local920 = (arg12 - arg14) / local946;
			local922 = (arg15 - arg17) / local946;
			local924 = (arg18 - arg20) / local946;
			local926 = (arg25 - arg27) / local946;
			local928 = (local623 - local637) / local946;
			local930 = (local644 - local658) / local946;
			local932 = (local665 - local679) / local946;
			local934 = (local684 - local694) / local946;
			local936 = (local696 - local700) / local946;
			local938 = (local702 - local706) / local946;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local630 = local623;
			local651 = local644;
			local672 = local665;
			local689 = local684;
			local698 = local696;
			local704 = local702;
			if (arg3 < 0.0F) {
				arg6 -= local708 * arg3;
				arg7 -= local842 * arg3;
				arg9 -= local710 * arg3;
				arg10 -= local918 * arg3;
				arg12 -= local712 * arg3;
				arg13 -= local920 * arg3;
				arg15 -= local714 * arg3;
				arg16 -= local922 * arg3;
				arg18 -= local716 * arg3;
				arg19 -= local924 * arg3;
				arg25 -= local718 * arg3;
				arg26 -= local926 * arg3;
				local623 -= local720 * arg3;
				local630 -= local928 * arg3;
				local644 -= local722 * arg3;
				local651 -= local930 * arg3;
				local665 -= local724 * arg3;
				local672 -= local932 * arg3;
				local684 -= local726 * arg3;
				local689 -= local934 * arg3;
				local696 -= local728 * arg3;
				local698 -= local936 * arg3;
				local702 -= local730 * arg3;
				local704 -= local938 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local738 * arg5;
				arg11 -= local814 * arg5;
				arg14 -= local816 * arg5;
				arg17 -= local818 * arg5;
				arg20 -= local820 * arg5;
				arg27 -= local822 * arg5;
				local637 -= local824 * arg5;
				local658 -= local826 * arg5;
				local679 -= local828 * arg5;
				local694 -= local830 * arg5;
				local700 -= local832 * arg5;
				local706 -= local834 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local842 < local708 || arg3 == arg5 && local738 > local708) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local630, local623, local651, local644, local672, local665, local689, local684, local698, local696, local704, local702);
					arg6 += local708;
					arg7 += local842;
					arg9 += local710;
					arg10 += local918;
					arg12 += local712;
					arg13 += local920;
					arg15 += local714;
					arg16 += local922;
					arg18 += local716;
					arg19 += local924;
					arg25 += local718;
					arg26 += local926;
					local623 += local720;
					local630 += local928;
					local644 += local722;
					local651 += local930;
					local665 += local724;
					local672 += local932;
					local684 += local726;
					local689 += local934;
					local696 += local728;
					local698 += local936;
					local702 += local730;
					local704 += local938;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
					arg8 += local738;
					arg6 += local708;
					arg11 += local814;
					arg9 += local710;
					arg14 += local816;
					arg12 += local712;
					arg17 += local818;
					arg15 += local714;
					arg20 += local820;
					arg18 += local716;
					arg27 += local822;
					arg25 += local718;
					local637 += local824;
					local623 += local720;
					local658 += local826;
					local644 += local722;
					local679 += local828;
					local665 += local724;
					local694 += local830;
					local684 += local726;
					local700 += local832;
					local696 += local728;
					local706 += local834;
					local702 += local730;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local623, local630, local644, local651, local665, local672, local684, local689, local696, local698, local702, local704);
					arg7 += local842;
					arg6 += local708;
					arg10 += local918;
					arg9 += local710;
					arg13 += local920;
					arg12 += local712;
					arg16 += local922;
					arg15 += local714;
					arg19 += local924;
					arg18 += local716;
					arg26 += local926;
					arg25 += local718;
					local630 += local928;
					local623 += local720;
					local651 += local930;
					local644 += local722;
					local672 += local932;
					local665 += local724;
					local689 += local934;
					local684 += local726;
					local698 += local936;
					local696 += local728;
					local704 += local938;
					local702 += local730;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
					arg6 += local708;
					arg8 += local738;
					arg9 += local710;
					arg11 += local814;
					arg12 += local712;
					arg14 += local816;
					arg15 += local714;
					arg17 += local818;
					arg18 += local716;
					arg20 += local820;
					arg25 += local718;
					arg27 += local822;
					local623 += local720;
					local637 += local824;
					local644 += local722;
					local658 += local826;
					local665 += local724;
					local679 += local828;
					local684 += local726;
					local694 += local830;
					local696 += local728;
					local700 += local832;
					local702 += local730;
					local706 += local834;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local637 = local623;
		local658 = local644;
		local679 = local665;
		local694 = local684;
		local700 = local696;
		local706 = local702;
		if (arg3 < 0.0F) {
			arg6 -= local708 * arg3;
			arg8 -= local842 * arg3;
			arg9 -= local710 * arg3;
			arg11 -= local918 * arg3;
			arg12 -= local712 * arg3;
			arg14 -= local920 * arg3;
			arg15 -= local714 * arg3;
			arg17 -= local922 * arg3;
			arg18 -= local716 * arg3;
			arg20 -= local924 * arg3;
			arg25 -= local718 * arg3;
			arg27 -= local926 * arg3;
			local623 -= local720 * arg3;
			local637 -= local928 * arg3;
			local644 -= local722 * arg3;
			local658 -= local930 * arg3;
			local665 -= local724 * arg3;
			local679 -= local932 * arg3;
			local684 -= local726 * arg3;
			local694 -= local934 * arg3;
			local696 -= local728 * arg3;
			local700 -= local936 * arg3;
			local702 -= local730 * arg3;
			local706 -= local938 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local738 * arg4;
			arg10 -= local814 * arg4;
			arg13 -= local816 * arg4;
			arg16 -= local818 * arg4;
			arg19 -= local820 * arg4;
			arg26 -= local822 * arg4;
			local630 -= local824 * arg4;
			local651 -= local826 * arg4;
			local672 -= local828 * arg4;
			local689 -= local830 * arg4;
			local698 -= local832 * arg4;
			local704 -= local834 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local842 >= local708) && (arg3 != arg4 || local842 <= local738)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
				arg6 += local708;
				arg8 += local842;
				arg9 += local710;
				arg11 += local918;
				arg12 += local712;
				arg14 += local920;
				arg15 += local714;
				arg17 += local922;
				arg18 += local716;
				arg20 += local924;
				arg25 += local718;
				arg27 += local926;
				local623 += local720;
				local637 += local928;
				local644 += local722;
				local658 += local930;
				local665 += local724;
				local679 += local932;
				local684 += local726;
				local694 += local934;
				local696 += local728;
				local700 += local936;
				local702 += local730;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local630, local637, local651, local658, local672, local679, local689, local694, local698, local700, local704, local706);
				arg7 += local738;
				arg8 += local842;
				arg10 += local814;
				arg11 += local918;
				arg13 += local816;
				arg14 += local920;
				arg16 += local818;
				arg17 += local922;
				arg19 += local820;
				arg20 += local924;
				arg26 += local822;
				arg27 += local926;
				local630 += local824;
				local637 += local928;
				local651 += local826;
				local658 += local930;
				local672 += local828;
				local679 += local932;
				local689 += local830;
				local694 += local934;
				local698 += local832;
				local700 += local936;
				local704 += local834;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
			arg6 += local708;
			arg8 += local842;
			arg9 += local710;
			arg11 += local918;
			arg12 += local712;
			arg14 += local920;
			arg15 += local714;
			arg17 += local922;
			arg18 += local716;
			arg20 += local924;
			arg25 += local718;
			arg27 += local926;
			local623 += local720;
			local637 += local928;
			local644 += local722;
			local658 += local930;
			local665 += local724;
			local679 += local932;
			local684 += local726;
			local694 += local934;
			local696 += local728;
			local700 += local936;
			local702 += local730;
			local706 += local938;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local637, local630, local658, local651, local679, local672, local694, local689, local700, local698, local706, local704);
			arg7 += local738;
			arg8 += local842;
			arg10 += local814;
			arg11 += local918;
			arg13 += local816;
			arg14 += local920;
			arg16 += local818;
			arg17 += local922;
			arg19 += local820;
			arg20 += local924;
			arg26 += local822;
			arg27 += local926;
			local630 += local824;
			local637 += local928;
			local651 += local826;
			local658 += local930;
			local672 += local828;
			local679 += local932;
			local689 += local830;
			local694 += local934;
			local698 += local832;
			local700 += local936;
			local704 += local834;
			local706 += local938;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "ae", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	void method24554(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(21) int local21 = arg28 & 0xFFFF;
		@Pc(102) int local102;
		if (local21 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local21);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt3326 = 0;
				@Pc(60) int local60 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), 2006765109) & 0xFFFF];
				local102 = ((arg21 >> 16 & 0xFF) * (local60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local60 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local102, arg24, arg25, 1447588276), Class125_Sub2_Sub1.method21481(local102, arg24, arg26, 1155877235), Class125_Sub2_Sub1.method21481(local102, arg24, arg27, 1457332992));
				return;
			}
			this.anInt3323 = local21;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
			this.aBoolean574 = this.aClass104_Sub3_15.method5702(arg28);
			this.anInt3326 = this.aClass104_Sub3_15.method5701(arg28) & 0xFF;
		}
		this.anInt3322 = arg24;
		@Pc(185) float local185;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local185 = arg6;
				arg6 = arg7;
				arg7 = local185;
				@Pc(191) float local191 = arg3;
				arg3 = arg4;
				arg4 = local191;
				@Pc(197) float local197 = arg9;
				arg9 = arg10;
				arg10 = local197;
				@Pc(203) float local203 = arg15;
				arg15 = arg16;
				arg16 = local203;
				@Pc(209) float local209 = arg18;
				arg18 = arg19;
				arg19 = local209;
				@Pc(215) float local215 = arg12;
				arg12 = arg13;
				arg13 = local215;
				@Pc(221) float local221 = arg25;
				arg25 = arg26;
				arg26 = local221;
				local102 = arg21;
				arg21 = arg22;
				arg22 = local102;
			} else {
				local185 = arg6;
				arg6 = arg8;
				arg8 = local185;
				local185 = arg3;
				arg3 = arg5;
				arg5 = local185;
				local185 = arg9;
				arg9 = arg11;
				arg11 = local185;
				local185 = arg15;
				arg15 = arg17;
				arg17 = local185;
				local185 = arg18;
				arg18 = arg20;
				arg20 = local185;
				local185 = arg12;
				arg12 = arg14;
				arg14 = local185;
				local185 = arg25;
				arg25 = arg27;
				arg27 = local185;
				local102 = arg21;
				arg21 = arg23;
				arg23 = local102;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local185 = arg21 >> 24 & 0xFF;
		@Pc(342) float local342 = (float) (arg22 >> 24 & 0xFF);
		@Pc(349) float local349 = (float) (arg23 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg21 >> 16 & 0xFF);
		@Pc(363) float local363 = (float) (arg22 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg23 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg21 >> 8 & 0xFF);
		@Pc(384) float local384 = (float) (arg22 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg23 >> 8 & 0xFF);
		@Pc(396) float local396 = (float) (arg21 & 0xFF);
		@Pc(401) float local401 = (float) (arg22 & 0xFF);
		@Pc(406) float local406 = (float) (arg23 & 0xFF);
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(422) float local422 = 0.0F;
		@Pc(424) float local424 = 0.0F;
		@Pc(426) float local426 = 0.0F;
		@Pc(434) float local434;
		if (arg4 != arg3) {
			local434 = arg4 - arg3;
			local408 = (arg7 - arg6) / local434;
			local410 = (arg10 - arg9) / local434;
			local412 = (arg13 - arg12) / local434;
			local414 = (arg16 - arg15) / local434;
			local416 = (arg19 - arg18) / local434;
			local418 = (arg26 - arg25) / local434;
			local420 = (local342 - local185) / local434;
			local422 = (local363 - local356) / local434;
			local424 = (local384 - local377) / local434;
			local426 = (local401 - local396) / local434;
		}
		local434 = 0.0F;
		@Pc(498) float local498 = 0.0F;
		@Pc(500) float local500 = 0.0F;
		@Pc(502) float local502 = 0.0F;
		@Pc(504) float local504 = 0.0F;
		@Pc(506) float local506 = 0.0F;
		@Pc(508) float local508 = 0.0F;
		@Pc(510) float local510 = 0.0F;
		@Pc(512) float local512 = 0.0F;
		@Pc(514) float local514 = 0.0F;
		@Pc(522) float local522;
		if (arg5 != arg4) {
			local522 = arg5 - arg4;
			local434 = (arg8 - arg7) / local522;
			local498 = (arg11 - arg10) / local522;
			local500 = (arg14 - arg13) / local522;
			local502 = (arg17 - arg16) / local522;
			local504 = (arg20 - arg19) / local522;
			local506 = (arg27 - arg26) / local522;
			local508 = (local349 - local342) / local522;
			local510 = (local370 - local363) / local522;
			local512 = (local391 - local384) / local522;
			local514 = (local406 - local401) / local522;
		}
		local522 = 0.0F;
		@Pc(586) float local586 = 0.0F;
		@Pc(588) float local588 = 0.0F;
		@Pc(590) float local590 = 0.0F;
		@Pc(592) float local592 = 0.0F;
		@Pc(594) float local594 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		if (arg3 != arg5) {
			@Pc(610) float local610 = arg3 - arg5;
			local522 = (arg6 - arg8) / local610;
			local586 = (arg9 - arg11) / local610;
			local588 = (arg12 - arg14) / local610;
			local590 = (arg15 - arg17) / local610;
			local592 = (arg18 - arg20) / local610;
			local594 = (arg25 - arg27) / local610;
			local596 = (local185 - local349) / local610;
			local598 = (local356 - local370) / local610;
			local600 = (local377 - local391) / local610;
			local602 = (local396 - local406) / local610;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local342 = local185;
			local363 = local356;
			local384 = local377;
			local401 = local396;
			if (arg3 < 0.0F) {
				arg6 -= local408 * arg3;
				arg7 -= local522 * arg3;
				arg9 -= local410 * arg3;
				arg10 -= local586 * arg3;
				arg12 -= local412 * arg3;
				arg13 -= local588 * arg3;
				arg15 -= local414 * arg3;
				arg16 -= local590 * arg3;
				arg18 -= local416 * arg3;
				arg19 -= local592 * arg3;
				arg25 -= local418 * arg3;
				arg26 -= local594 * arg3;
				local185 -= local420 * arg3;
				local342 -= local596 * arg3;
				local356 -= local420 * arg3;
				local363 -= local596 * arg3;
				local377 -= local420 * arg3;
				local384 -= local596 * arg3;
				local396 -= local420 * arg3;
				local401 -= local596 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local434 * arg5;
				arg11 -= local498 * arg5;
				arg14 -= local500 * arg5;
				arg17 -= local502 * arg5;
				arg20 -= local504 * arg5;
				arg27 -= local506 * arg5;
				local349 -= local508 * arg5;
				local370 -= local510 * arg5;
				local391 -= local512 * arg5;
				local406 -= local514 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local522 < local408 || arg3 == arg5 && local434 > local408) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local342, local185, local363, local356, local384, local377, local401, local396);
					arg6 += local408;
					arg7 += local522;
					arg9 += local410;
					arg10 += local586;
					arg12 += local412;
					arg13 += local588;
					arg15 += local414;
					arg16 += local590;
					arg18 += local416;
					arg19 += local592;
					arg25 += local418;
					arg26 += local594;
					local185 += local420;
					local342 += local596;
					local356 += local422;
					local363 += local598;
					local377 += local424;
					local384 += local600;
					local396 += local426;
					local401 += local602;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
					arg8 += local434;
					arg6 += local408;
					arg11 += local498;
					arg9 += local410;
					arg14 += local500;
					arg12 += local412;
					arg17 += local502;
					arg15 += local414;
					arg20 += local504;
					arg18 += local416;
					arg27 += local506;
					arg25 += local418;
					local349 += local508;
					local185 += local420;
					local370 += local510;
					local356 += local422;
					local391 += local512;
					local377 += local424;
					local406 += local514;
					local396 += local426;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local185, local342, local356, local363, local377, local384, local396, local401);
					arg7 += local522;
					arg6 += local408;
					arg10 += local586;
					arg9 += local410;
					arg13 += local588;
					arg12 += local412;
					arg16 += local590;
					arg15 += local414;
					arg19 += local592;
					arg18 += local416;
					arg26 += local594;
					arg25 += local418;
					local342 += local596;
					local185 += local420;
					local363 += local598;
					local356 += local422;
					local384 += local600;
					local377 += local424;
					local401 += local602;
					local396 += local426;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
					arg6 += local408;
					arg8 += local434;
					arg9 += local410;
					arg11 += local498;
					arg12 += local412;
					arg14 += local500;
					arg15 += local414;
					arg17 += local502;
					arg18 += local416;
					arg20 += local504;
					arg25 += local418;
					arg27 += local506;
					local185 += local420;
					local349 += local508;
					local356 += local422;
					local370 += local510;
					local377 += local424;
					local391 += local512;
					local396 += local426;
					local406 += local514;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local349 = local185;
		local370 = local356;
		local391 = local377;
		local406 = local396;
		if (arg3 < 0.0F) {
			arg6 -= local408 * arg3;
			arg8 -= local522 * arg3;
			arg9 -= local410 * arg3;
			arg11 -= local586 * arg3;
			arg12 -= local412 * arg3;
			arg14 -= local588 * arg3;
			arg15 -= local414 * arg3;
			arg17 -= local590 * arg3;
			arg18 -= local416 * arg3;
			arg20 -= local592 * arg3;
			arg25 -= local418 * arg3;
			arg27 -= local594 * arg3;
			local185 -= local420 * arg3;
			local349 -= local596 * arg3;
			local356 -= local420 * arg3;
			local370 -= local596 * arg3;
			local377 -= local420 * arg3;
			local391 -= local596 * arg3;
			local396 -= local420 * arg3;
			local406 -= local596 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local434 * arg4;
			arg10 -= local498 * arg4;
			arg13 -= local500 * arg4;
			arg16 -= local502 * arg4;
			arg19 -= local504 * arg4;
			arg26 -= local506 * arg4;
			local342 -= local508 * arg4;
			local363 -= local510 * arg4;
			local384 -= local512 * arg4;
			local401 -= local514 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local522 < local408 || !(arg3 != arg4 || !(local522 > local434))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
				arg6 += local408;
				arg8 += local522;
				arg9 += local410;
				arg11 += local586;
				arg12 += local412;
				arg14 += local588;
				arg15 += local414;
				arg17 += local590;
				arg18 += local416;
				arg20 += local592;
				arg25 += local418;
				arg27 += local594;
				local185 += local420;
				local349 += local596;
				local356 += local422;
				local370 += local598;
				local377 += local424;
				local391 += local600;
				local396 += local426;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local349, local342, local370, local363, local391, local384, local406, local401);
				arg7 += local434;
				arg8 += local522;
				arg10 += local498;
				arg11 += local586;
				arg13 += local500;
				arg14 += local588;
				arg16 += local502;
				arg17 += local590;
				arg19 += local504;
				arg20 += local592;
				arg26 += local506;
				arg27 += local594;
				local342 += local508;
				local349 += local596;
				local363 += local510;
				local370 += local598;
				local384 += local512;
				local391 += local600;
				local401 += local514;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
			arg6 += local408;
			arg8 += local522;
			arg9 += local410;
			arg11 += local586;
			arg12 += local412;
			arg14 += local588;
			arg15 += local414;
			arg17 += local590;
			arg18 += local416;
			arg20 += local592;
			arg25 += local418;
			arg27 += local594;
			local185 += local420;
			local349 += local596;
			local356 += local422;
			local370 += local598;
			local377 += local424;
			local391 += local600;
			local396 += local426;
			local406 += local602;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local342, local349, local363, local370, local384, local391, local401, local406);
			arg7 += local434;
			arg8 += local522;
			arg10 += local498;
			arg11 += local586;
			arg13 += local500;
			arg14 += local588;
			arg16 += local502;
			arg17 += local590;
			arg19 += local504;
			arg20 += local592;
			arg26 += local506;
			arg27 += local594;
			local342 += local508;
			local349 += local596;
			local363 += local510;
			local370 += local598;
			local384 += local512;
			local391 += local600;
			local401 += local514;
			local406 += local602;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(ZZ[IIIIIIFFFF)V")
	void method24555(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		if (this.aBoolean572) {
			if (arg7 > this.anInt3318) {
				arg7 = this.anInt3318;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		@Pc(220) int local220;
		@Pc(225) int local225;
		@Pc(272) int local272;
		@Pc(71) int local71;
		@Pc(66) int local66;
		@Pc(54) float local54;
		@Pc(95) float local95;
		@Pc(50) int local50;
		if (this.aClass176_3.aBoolean568) {
			if (this.aBoolean571) {
				local50 = arg7 - arg6 >> 2;
				local54 = arg9 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				}
			} else {
				local50 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg10 += arg11;
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean571) {
			local50 = arg7 - arg6 >> 2;
			local54 = arg9 * 4.0F;
			if (this.anInt3315 == 0) {
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else {
			local50 = arg7 - arg6;
			if (this.anInt3315 == 0) {
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					}
					arg10 += arg11;
					arg8 += arg9;
					local50--;
				} while (local50 > 0);
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local272 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					local50--;
				} while (local50 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZZZFFFFFFFFFIII)V")
	void method24556(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000, 1204493009);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000, 1504509589);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000, -1312279950);
		} else {
			@Pc(70) float local70 = arg7 - arg6;
			@Pc(74) float local74 = arg4 - arg3;
			@Pc(78) float local78 = arg8 - arg6;
			@Pc(82) float local82 = arg5 - arg3;
			@Pc(86) float local86 = arg10 - arg9;
			@Pc(90) float local90 = arg11 - arg9;
			@Pc(99) float local99 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(108) float local108 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(117) float local117 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(126) float local126 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(135) float local135 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			@Pc(144) float local144 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			@Pc(156) float local156;
			if (arg5 == arg4) {
				local156 = 0.0F;
			} else {
				local156 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(167) float local167;
			if (arg4 == arg3) {
				local167 = 0.0F;
			} else {
				local167 = local70 / local74;
			}
			@Pc(178) float local178;
			if (arg5 == arg3) {
				local178 = 0.0F;
			} else {
				local178 = local78 / local82;
			}
			@Pc(189) float local189 = local70 * local82 - local78 * local74;
			if (local189 != 0.0F) {
				@Pc(204) float local204 = (local86 * local82 - local90 * local74) / local189;
				@Pc(214) float local214 = (local90 * local70 - local86 * local78) / local189;
				@Pc(224) float local224 = (local99 * local82 - local108 * local74) / local189;
				@Pc(234) float local234 = (local108 * local70 - local99 * local78) / local189;
				@Pc(244) float local244 = (local117 * local82 - local126 * local74) / local189;
				@Pc(254) float local254 = (local126 * local70 - local117 * local78) / local189;
				@Pc(264) float local264 = (local135 * local82 - local144 * local74) / local189;
				@Pc(274) float local274 = (local144 * local70 - local135 * local78) / local189;
				@Pc(328) float local328;
				@Pc(339) float local339;
				@Pc(350) float local350;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt3319)) {
						if (arg4 > (float) this.anInt3319) {
							arg4 = this.anInt3319;
						}
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						arg9 = arg9 - local204 * arg6 + local204;
						local328 = (float) (arg12 & 0xFF0000) - local224 * arg6 + local224;
						local339 = (float) (arg12 & 0xFF00) - local244 * arg6 + local244;
						local350 = (float) (arg12 & 0xFF) - local264 * arg6 + local264;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local156 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local178 < local167 || arg3 == arg4 && local178 > local156) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local156 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local178 < local167 || arg3 == arg5 && local156 > local167) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray287[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
								while (--arg4 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt3321;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt3319)) {
						if (arg5 > (float) this.anInt3319) {
							arg5 = this.anInt3319;
						}
						if (arg3 > (float) this.anInt3319) {
							arg3 = this.anInt3319;
						}
						arg10 = arg10 - local204 * arg7 + local204;
						local328 = (float) (arg13 & 0xFF0000) - local224 * arg7 + local224;
						local339 = (float) (arg13 & 0xFF00) - local244 * arg7 + local244;
						local350 = (float) (arg13 & 0xFF) - local264 * arg7 + local264;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local178 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local167 < local156 || arg4 == arg5 && local167 > local178) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local178 * arg3;
								arg3 = 0.0F;
							}
							if (local167 < local156) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray287[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
								while (--arg5 >= 0.0F) {
									this.method24542(arg1, arg2, this.anIntArray288, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt3321;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt3319)) {
					if (arg3 > (float) this.anInt3319) {
						arg3 = this.anInt3319;
					}
					if (arg4 > (float) this.anInt3319) {
						arg4 = this.anInt3319;
					}
					arg11 = arg11 - local204 * arg8 + local204;
					local328 = (float) (arg14 & 0xFF0000) - local224 * arg8 + local224;
					local339 = (float) (arg14 & 0xFF00) - local244 * arg8 + local244;
					local350 = (float) (arg14 & 0xFF) - local264 * arg8 + local264;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local167 * arg3;
							arg3 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local167 * arg4;
							arg4 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray287[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
							while (--arg3 >= 0.0F) {
								this.method24542(arg1, arg2, this.anIntArray288, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt3321;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(ZZ[IIIIIIFFFFFFFF)V")
	void method24557(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15) {
		if (this.aBoolean572) {
			if (arg7 > this.anInt3318) {
				arg7 = this.anInt3318;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(223) int local223;
		@Pc(639) int local639;
		@Pc(643) int local643;
		@Pc(651) int local651;
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(58) float local58;
		@Pc(62) float local62;
		@Pc(66) float local66;
		@Pc(54) int local54;
		if (this.aBoolean573) {
			arg3 += arg6;
			arg10 += arg11 * (float) arg6;
			arg12 += arg13 * (float) arg6;
			arg14 += arg15 * (float) arg6;
			if (this.aBoolean571) {
				local54 = arg7 - arg6 >> 2;
				local58 = arg11 * 4.0F;
				local62 = arg13 * 4.0F;
				local66 = arg15 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							arg2[arg3] = local88;
							arg2[local103++] = local88;
							arg2[local103++] = local88;
							arg3 = local103 + 1;
							arg2[local103] = local88;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg2[arg3++] = local88;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean576) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local643 = local103++;
							@Pc(686) int local686 = arg2[local643];
							@Pc(690) int local690 = local88 + local686;
							@Pc(698) int local698 = (local88 & 0xFF00FF) + (local686 & 0xFF00FF);
							@Pc(708) int local708 = (local698 & 0x1000100) + (local690 - local698 & 0x10000);
							arg2[local643] = local690 - local708 | 0xFF000000 | local708 - (local708 >>> 8);
							@Pc(727) int local727 = local103++;
							@Pc(733) int local733 = arg2[local727];
							@Pc(737) int local737 = local88 + local733;
							@Pc(745) int local745 = (local88 & 0xFF00FF) + (local733 & 0xFF00FF);
							@Pc(755) int local755 = (local745 & 0x1000100) + (local737 - local745 & 0x10000);
							arg2[local727] = local737 - local755 | 0xFF000000 | local755 - (local755 >>> 8);
							arg3 = local103 + 1;
							@Pc(780) int local780 = arg2[local103];
							@Pc(784) int local784 = local88 + local780;
							@Pc(792) int local792 = (local88 & 0xFF00FF) + (local780 & 0xFF00FF);
							@Pc(802) int local802 = (local792 & 0x1000100) + (local784 - local792 & 0x10000);
							arg2[local103] = local784 - local802 | 0xFF000000 | local802 - (local802 >>> 8);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							local168 = arg3++;
							local639 = arg2[local168];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								local103 = arg3 + 1;
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								local103 = arg3 + 1;
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg2[arg3++] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean576) {
					do {
						local168 = arg3++;
						local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local639 = arg2[local168];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local54--;
					} while (local54 > 0);
				}
			}
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		arg12 += arg13 * (float) arg6;
		arg14 += arg15 * (float) arg6;
		@Pc(1259) float local1259;
		if (this.aClass176_3.aBoolean568) {
			if (this.aBoolean571) {
				local54 = arg7 - arg6 >> 2;
				local58 = arg11 * 4.0F;
				local62 = arg13 * 4.0F;
				local66 = arg15 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean576) {
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					if (local54 > 0) {
						do {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += local58;
							arg12 += local62;
							arg14 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local103 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = arg8;
								}
							}
							local1259 = arg8 + arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray92[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local103] = local1259;
								}
							}
							local1259 += arg9;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = local1259;
								}
							}
							arg8 = local1259 + arg9;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg7 - arg6 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean576) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							local639 = arg2[arg3];
							local643 = local223 + local639;
							local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt3315;
					local168 = 256 - this.anInt3315;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray92[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						local54--;
					} while (local54 > 0);
				}
			}
		} else if (this.aBoolean571) {
			local54 = arg7 - arg6 >> 2;
			local58 = arg11 * 4.0F;
			local62 = arg13 * 4.0F;
			local66 = arg15 * 4.0F;
			if (this.anInt3315 == 0) {
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local88;
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local88;
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			} else if (this.aBoolean576) {
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			} else {
				local163 = this.anInt3315;
				local168 = 256 - this.anInt3315;
				if (local54 > 0) {
					do {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += local58;
						arg12 += local62;
						arg14 += local66;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local103 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 = arg8 + arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg9;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray92[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg9;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray92[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg8 = local1259 + arg9;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg7 - arg6 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg8 += arg9;
						local54--;
					} while (local54 > 0);
				}
			}
		} else {
			local54 = arg7 - arg6;
			if (this.anInt3315 == 0) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			} else if (this.aBoolean576) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						local223 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						local639 = arg2[arg3];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						@Pc(3913) int local3913 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[arg3] = local643 - local3913 | 0xFF000000 | local3913 - (local3913 >>> 8);
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			} else {
				local163 = this.anInt3315;
				local168 = 256 - this.anInt3315;
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray92[arg3]) {
						local88 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						@Pc(3775) int local3775 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local168 | local223 >> 24) << 24 | local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					local54--;
				} while (local54 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	void method24558(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(21) int local21 = arg28 & 0xFFFF;
		@Pc(102) int local102;
		if (local21 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local21);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt3326 = 0;
				@Pc(60) int local60 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), 1693896843) & 0xFFFF];
				local102 = ((arg21 >> 16 & 0xFF) * (local60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local60 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local102, arg24, arg25, 1092774248), Class125_Sub2_Sub1.method21481(local102, arg24, arg26, 1220111938), Class125_Sub2_Sub1.method21481(local102, arg24, arg27, 2002947379));
				return;
			}
			this.anInt3323 = local21;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
			this.aBoolean574 = this.aClass104_Sub3_15.method5702(arg28);
			this.anInt3326 = this.aClass104_Sub3_15.method5701(arg28) & 0xFF;
		}
		this.anInt3322 = arg24;
		@Pc(185) float local185;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local185 = arg6;
				arg6 = arg7;
				arg7 = local185;
				@Pc(191) float local191 = arg3;
				arg3 = arg4;
				arg4 = local191;
				@Pc(197) float local197 = arg9;
				arg9 = arg10;
				arg10 = local197;
				@Pc(203) float local203 = arg15;
				arg15 = arg16;
				arg16 = local203;
				@Pc(209) float local209 = arg18;
				arg18 = arg19;
				arg19 = local209;
				@Pc(215) float local215 = arg12;
				arg12 = arg13;
				arg13 = local215;
				@Pc(221) float local221 = arg25;
				arg25 = arg26;
				arg26 = local221;
				local102 = arg21;
				arg21 = arg22;
				arg22 = local102;
			} else {
				local185 = arg6;
				arg6 = arg8;
				arg8 = local185;
				local185 = arg3;
				arg3 = arg5;
				arg5 = local185;
				local185 = arg9;
				arg9 = arg11;
				arg11 = local185;
				local185 = arg15;
				arg15 = arg17;
				arg17 = local185;
				local185 = arg18;
				arg18 = arg20;
				arg20 = local185;
				local185 = arg12;
				arg12 = arg14;
				arg14 = local185;
				local185 = arg25;
				arg25 = arg27;
				arg27 = local185;
				local102 = arg21;
				arg21 = arg23;
				arg23 = local102;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local185 = arg21 >> 24 & 0xFF;
		@Pc(342) float local342 = (float) (arg22 >> 24 & 0xFF);
		@Pc(349) float local349 = (float) (arg23 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg21 >> 16 & 0xFF);
		@Pc(363) float local363 = (float) (arg22 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg23 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg21 >> 8 & 0xFF);
		@Pc(384) float local384 = (float) (arg22 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg23 >> 8 & 0xFF);
		@Pc(396) float local396 = (float) (arg21 & 0xFF);
		@Pc(401) float local401 = (float) (arg22 & 0xFF);
		@Pc(406) float local406 = (float) (arg23 & 0xFF);
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(422) float local422 = 0.0F;
		@Pc(424) float local424 = 0.0F;
		@Pc(426) float local426 = 0.0F;
		@Pc(434) float local434;
		if (arg4 != arg3) {
			local434 = arg4 - arg3;
			local408 = (arg7 - arg6) / local434;
			local410 = (arg10 - arg9) / local434;
			local412 = (arg13 - arg12) / local434;
			local414 = (arg16 - arg15) / local434;
			local416 = (arg19 - arg18) / local434;
			local418 = (arg26 - arg25) / local434;
			local420 = (local342 - local185) / local434;
			local422 = (local363 - local356) / local434;
			local424 = (local384 - local377) / local434;
			local426 = (local401 - local396) / local434;
		}
		local434 = 0.0F;
		@Pc(498) float local498 = 0.0F;
		@Pc(500) float local500 = 0.0F;
		@Pc(502) float local502 = 0.0F;
		@Pc(504) float local504 = 0.0F;
		@Pc(506) float local506 = 0.0F;
		@Pc(508) float local508 = 0.0F;
		@Pc(510) float local510 = 0.0F;
		@Pc(512) float local512 = 0.0F;
		@Pc(514) float local514 = 0.0F;
		@Pc(522) float local522;
		if (arg5 != arg4) {
			local522 = arg5 - arg4;
			local434 = (arg8 - arg7) / local522;
			local498 = (arg11 - arg10) / local522;
			local500 = (arg14 - arg13) / local522;
			local502 = (arg17 - arg16) / local522;
			local504 = (arg20 - arg19) / local522;
			local506 = (arg27 - arg26) / local522;
			local508 = (local349 - local342) / local522;
			local510 = (local370 - local363) / local522;
			local512 = (local391 - local384) / local522;
			local514 = (local406 - local401) / local522;
		}
		local522 = 0.0F;
		@Pc(586) float local586 = 0.0F;
		@Pc(588) float local588 = 0.0F;
		@Pc(590) float local590 = 0.0F;
		@Pc(592) float local592 = 0.0F;
		@Pc(594) float local594 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		if (arg3 != arg5) {
			@Pc(610) float local610 = arg3 - arg5;
			local522 = (arg6 - arg8) / local610;
			local586 = (arg9 - arg11) / local610;
			local588 = (arg12 - arg14) / local610;
			local590 = (arg15 - arg17) / local610;
			local592 = (arg18 - arg20) / local610;
			local594 = (arg25 - arg27) / local610;
			local596 = (local185 - local349) / local610;
			local598 = (local356 - local370) / local610;
			local600 = (local377 - local391) / local610;
			local602 = (local396 - local406) / local610;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local342 = local185;
			local363 = local356;
			local384 = local377;
			local401 = local396;
			if (arg3 < 0.0F) {
				arg6 -= local408 * arg3;
				arg7 -= local522 * arg3;
				arg9 -= local410 * arg3;
				arg10 -= local586 * arg3;
				arg12 -= local412 * arg3;
				arg13 -= local588 * arg3;
				arg15 -= local414 * arg3;
				arg16 -= local590 * arg3;
				arg18 -= local416 * arg3;
				arg19 -= local592 * arg3;
				arg25 -= local418 * arg3;
				arg26 -= local594 * arg3;
				local185 -= local420 * arg3;
				local342 -= local596 * arg3;
				local356 -= local420 * arg3;
				local363 -= local596 * arg3;
				local377 -= local420 * arg3;
				local384 -= local596 * arg3;
				local396 -= local420 * arg3;
				local401 -= local596 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local434 * arg5;
				arg11 -= local498 * arg5;
				arg14 -= local500 * arg5;
				arg17 -= local502 * arg5;
				arg20 -= local504 * arg5;
				arg27 -= local506 * arg5;
				local349 -= local508 * arg5;
				local370 -= local510 * arg5;
				local391 -= local512 * arg5;
				local406 -= local514 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local522 < local408 || arg3 == arg5 && local434 > local408) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local342, local185, local363, local356, local384, local377, local401, local396);
					arg6 += local408;
					arg7 += local522;
					arg9 += local410;
					arg10 += local586;
					arg12 += local412;
					arg13 += local588;
					arg15 += local414;
					arg16 += local590;
					arg18 += local416;
					arg19 += local592;
					arg25 += local418;
					arg26 += local594;
					local185 += local420;
					local342 += local596;
					local356 += local422;
					local363 += local598;
					local377 += local424;
					local384 += local600;
					local396 += local426;
					local401 += local602;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
					arg8 += local434;
					arg6 += local408;
					arg11 += local498;
					arg9 += local410;
					arg14 += local500;
					arg12 += local412;
					arg17 += local502;
					arg15 += local414;
					arg20 += local504;
					arg18 += local416;
					arg27 += local506;
					arg25 += local418;
					local349 += local508;
					local185 += local420;
					local370 += local510;
					local356 += local422;
					local391 += local512;
					local377 += local424;
					local406 += local514;
					local396 += local426;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local185, local342, local356, local363, local377, local384, local396, local401);
					arg7 += local522;
					arg6 += local408;
					arg10 += local586;
					arg9 += local410;
					arg13 += local588;
					arg12 += local412;
					arg16 += local590;
					arg15 += local414;
					arg19 += local592;
					arg18 += local416;
					arg26 += local594;
					arg25 += local418;
					local342 += local596;
					local185 += local420;
					local363 += local598;
					local356 += local422;
					local384 += local600;
					local377 += local424;
					local401 += local602;
					local396 += local426;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
					arg6 += local408;
					arg8 += local434;
					arg9 += local410;
					arg11 += local498;
					arg12 += local412;
					arg14 += local500;
					arg15 += local414;
					arg17 += local502;
					arg18 += local416;
					arg20 += local504;
					arg25 += local418;
					arg27 += local506;
					local185 += local420;
					local349 += local508;
					local356 += local422;
					local370 += local510;
					local377 += local424;
					local391 += local512;
					local396 += local426;
					local406 += local514;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local349 = local185;
		local370 = local356;
		local391 = local377;
		local406 = local396;
		if (arg3 < 0.0F) {
			arg6 -= local408 * arg3;
			arg8 -= local522 * arg3;
			arg9 -= local410 * arg3;
			arg11 -= local586 * arg3;
			arg12 -= local412 * arg3;
			arg14 -= local588 * arg3;
			arg15 -= local414 * arg3;
			arg17 -= local590 * arg3;
			arg18 -= local416 * arg3;
			arg20 -= local592 * arg3;
			arg25 -= local418 * arg3;
			arg27 -= local594 * arg3;
			local185 -= local420 * arg3;
			local349 -= local596 * arg3;
			local356 -= local420 * arg3;
			local370 -= local596 * arg3;
			local377 -= local420 * arg3;
			local391 -= local596 * arg3;
			local396 -= local420 * arg3;
			local406 -= local596 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local434 * arg4;
			arg10 -= local498 * arg4;
			arg13 -= local500 * arg4;
			arg16 -= local502 * arg4;
			arg19 -= local504 * arg4;
			arg26 -= local506 * arg4;
			local342 -= local508 * arg4;
			local363 -= local510 * arg4;
			local384 -= local512 * arg4;
			local401 -= local514 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local522 < local408 || !(arg3 != arg4 || !(local522 > local434))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
				arg6 += local408;
				arg8 += local522;
				arg9 += local410;
				arg11 += local586;
				arg12 += local412;
				arg14 += local588;
				arg15 += local414;
				arg17 += local590;
				arg18 += local416;
				arg20 += local592;
				arg25 += local418;
				arg27 += local594;
				local185 += local420;
				local349 += local596;
				local356 += local422;
				local370 += local598;
				local377 += local424;
				local391 += local600;
				local396 += local426;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local349, local342, local370, local363, local391, local384, local406, local401);
				arg7 += local434;
				arg8 += local522;
				arg10 += local498;
				arg11 += local586;
				arg13 += local500;
				arg14 += local588;
				arg16 += local502;
				arg17 += local590;
				arg19 += local504;
				arg20 += local592;
				arg26 += local506;
				arg27 += local594;
				local342 += local508;
				local349 += local596;
				local363 += local510;
				local370 += local598;
				local384 += local512;
				local391 += local600;
				local401 += local514;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
			arg6 += local408;
			arg8 += local522;
			arg9 += local410;
			arg11 += local586;
			arg12 += local412;
			arg14 += local588;
			arg15 += local414;
			arg17 += local590;
			arg18 += local416;
			arg20 += local592;
			arg25 += local418;
			arg27 += local594;
			local185 += local420;
			local349 += local596;
			local356 += local422;
			local370 += local598;
			local377 += local424;
			local391 += local600;
			local396 += local426;
			local406 += local602;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local342, local349, local363, local370, local384, local391, local401, local406);
			arg7 += local434;
			arg8 += local522;
			arg10 += local498;
			arg11 += local586;
			arg13 += local500;
			arg14 += local588;
			arg16 += local502;
			arg17 += local590;
			arg19 += local504;
			arg20 += local592;
			arg26 += local506;
			arg27 += local594;
			local342 += local508;
			local349 += local596;
			local363 += local510;
			local370 += local598;
			local384 += local512;
			local391 += local600;
			local401 += local514;
			local406 += local602;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "()I")
	int method24559() {
		return this.anIntArray287[0] % this.anInt3321;
	}

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	void method24560(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(21) int local21 = arg28 & 0xFFFF;
		@Pc(102) int local102;
		if (local21 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local21);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt3326 = 0;
				@Pc(60) int local60 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), 892534371) & 0xFFFF];
				local102 = ((arg21 >> 16 & 0xFF) * (local60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local60 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local102, arg24, arg25, 1359306081), Class125_Sub2_Sub1.method21481(local102, arg24, arg26, 1807796032), Class125_Sub2_Sub1.method21481(local102, arg24, arg27, 1944612748));
				return;
			}
			this.anInt3323 = local21;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
			this.aBoolean574 = this.aClass104_Sub3_15.method5702(arg28);
			this.anInt3326 = this.aClass104_Sub3_15.method5701(arg28) & 0xFF;
		}
		this.anInt3322 = arg24;
		@Pc(185) float local185;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local185 = arg6;
				arg6 = arg7;
				arg7 = local185;
				@Pc(191) float local191 = arg3;
				arg3 = arg4;
				arg4 = local191;
				@Pc(197) float local197 = arg9;
				arg9 = arg10;
				arg10 = local197;
				@Pc(203) float local203 = arg15;
				arg15 = arg16;
				arg16 = local203;
				@Pc(209) float local209 = arg18;
				arg18 = arg19;
				arg19 = local209;
				@Pc(215) float local215 = arg12;
				arg12 = arg13;
				arg13 = local215;
				@Pc(221) float local221 = arg25;
				arg25 = arg26;
				arg26 = local221;
				local102 = arg21;
				arg21 = arg22;
				arg22 = local102;
			} else {
				local185 = arg6;
				arg6 = arg8;
				arg8 = local185;
				local185 = arg3;
				arg3 = arg5;
				arg5 = local185;
				local185 = arg9;
				arg9 = arg11;
				arg11 = local185;
				local185 = arg15;
				arg15 = arg17;
				arg17 = local185;
				local185 = arg18;
				arg18 = arg20;
				arg20 = local185;
				local185 = arg12;
				arg12 = arg14;
				arg14 = local185;
				local185 = arg25;
				arg25 = arg27;
				arg27 = local185;
				local102 = arg21;
				arg21 = arg23;
				arg23 = local102;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local185 = arg21 >> 24 & 0xFF;
		@Pc(342) float local342 = (float) (arg22 >> 24 & 0xFF);
		@Pc(349) float local349 = (float) (arg23 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg21 >> 16 & 0xFF);
		@Pc(363) float local363 = (float) (arg22 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg23 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg21 >> 8 & 0xFF);
		@Pc(384) float local384 = (float) (arg22 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg23 >> 8 & 0xFF);
		@Pc(396) float local396 = (float) (arg21 & 0xFF);
		@Pc(401) float local401 = (float) (arg22 & 0xFF);
		@Pc(406) float local406 = (float) (arg23 & 0xFF);
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(422) float local422 = 0.0F;
		@Pc(424) float local424 = 0.0F;
		@Pc(426) float local426 = 0.0F;
		@Pc(434) float local434;
		if (arg4 != arg3) {
			local434 = arg4 - arg3;
			local408 = (arg7 - arg6) / local434;
			local410 = (arg10 - arg9) / local434;
			local412 = (arg13 - arg12) / local434;
			local414 = (arg16 - arg15) / local434;
			local416 = (arg19 - arg18) / local434;
			local418 = (arg26 - arg25) / local434;
			local420 = (local342 - local185) / local434;
			local422 = (local363 - local356) / local434;
			local424 = (local384 - local377) / local434;
			local426 = (local401 - local396) / local434;
		}
		local434 = 0.0F;
		@Pc(498) float local498 = 0.0F;
		@Pc(500) float local500 = 0.0F;
		@Pc(502) float local502 = 0.0F;
		@Pc(504) float local504 = 0.0F;
		@Pc(506) float local506 = 0.0F;
		@Pc(508) float local508 = 0.0F;
		@Pc(510) float local510 = 0.0F;
		@Pc(512) float local512 = 0.0F;
		@Pc(514) float local514 = 0.0F;
		@Pc(522) float local522;
		if (arg5 != arg4) {
			local522 = arg5 - arg4;
			local434 = (arg8 - arg7) / local522;
			local498 = (arg11 - arg10) / local522;
			local500 = (arg14 - arg13) / local522;
			local502 = (arg17 - arg16) / local522;
			local504 = (arg20 - arg19) / local522;
			local506 = (arg27 - arg26) / local522;
			local508 = (local349 - local342) / local522;
			local510 = (local370 - local363) / local522;
			local512 = (local391 - local384) / local522;
			local514 = (local406 - local401) / local522;
		}
		local522 = 0.0F;
		@Pc(586) float local586 = 0.0F;
		@Pc(588) float local588 = 0.0F;
		@Pc(590) float local590 = 0.0F;
		@Pc(592) float local592 = 0.0F;
		@Pc(594) float local594 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		if (arg3 != arg5) {
			@Pc(610) float local610 = arg3 - arg5;
			local522 = (arg6 - arg8) / local610;
			local586 = (arg9 - arg11) / local610;
			local588 = (arg12 - arg14) / local610;
			local590 = (arg15 - arg17) / local610;
			local592 = (arg18 - arg20) / local610;
			local594 = (arg25 - arg27) / local610;
			local596 = (local185 - local349) / local610;
			local598 = (local356 - local370) / local610;
			local600 = (local377 - local391) / local610;
			local602 = (local396 - local406) / local610;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local342 = local185;
			local363 = local356;
			local384 = local377;
			local401 = local396;
			if (arg3 < 0.0F) {
				arg6 -= local408 * arg3;
				arg7 -= local522 * arg3;
				arg9 -= local410 * arg3;
				arg10 -= local586 * arg3;
				arg12 -= local412 * arg3;
				arg13 -= local588 * arg3;
				arg15 -= local414 * arg3;
				arg16 -= local590 * arg3;
				arg18 -= local416 * arg3;
				arg19 -= local592 * arg3;
				arg25 -= local418 * arg3;
				arg26 -= local594 * arg3;
				local185 -= local420 * arg3;
				local342 -= local596 * arg3;
				local356 -= local420 * arg3;
				local363 -= local596 * arg3;
				local377 -= local420 * arg3;
				local384 -= local596 * arg3;
				local396 -= local420 * arg3;
				local401 -= local596 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local434 * arg5;
				arg11 -= local498 * arg5;
				arg14 -= local500 * arg5;
				arg17 -= local502 * arg5;
				arg20 -= local504 * arg5;
				arg27 -= local506 * arg5;
				local349 -= local508 * arg5;
				local370 -= local510 * arg5;
				local391 -= local512 * arg5;
				local406 -= local514 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local522 < local408 || arg3 == arg5 && local434 > local408) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local342, local185, local363, local356, local384, local377, local401, local396);
					arg6 += local408;
					arg7 += local522;
					arg9 += local410;
					arg10 += local586;
					arg12 += local412;
					arg13 += local588;
					arg15 += local414;
					arg16 += local590;
					arg18 += local416;
					arg19 += local592;
					arg25 += local418;
					arg26 += local594;
					local185 += local420;
					local342 += local596;
					local356 += local422;
					local363 += local598;
					local377 += local424;
					local384 += local600;
					local396 += local426;
					local401 += local602;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
					arg8 += local434;
					arg6 += local408;
					arg11 += local498;
					arg9 += local410;
					arg14 += local500;
					arg12 += local412;
					arg17 += local502;
					arg15 += local414;
					arg20 += local504;
					arg18 += local416;
					arg27 += local506;
					arg25 += local418;
					local349 += local508;
					local185 += local420;
					local370 += local510;
					local356 += local422;
					local391 += local512;
					local377 += local424;
					local406 += local514;
					local396 += local426;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local185, local342, local356, local363, local377, local384, local396, local401);
					arg7 += local522;
					arg6 += local408;
					arg10 += local586;
					arg9 += local410;
					arg13 += local588;
					arg12 += local412;
					arg16 += local590;
					arg15 += local414;
					arg19 += local592;
					arg18 += local416;
					arg26 += local594;
					arg25 += local418;
					local342 += local596;
					local185 += local420;
					local363 += local598;
					local356 += local422;
					local384 += local600;
					local377 += local424;
					local401 += local602;
					local396 += local426;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
					arg6 += local408;
					arg8 += local434;
					arg9 += local410;
					arg11 += local498;
					arg12 += local412;
					arg14 += local500;
					arg15 += local414;
					arg17 += local502;
					arg18 += local416;
					arg20 += local504;
					arg25 += local418;
					arg27 += local506;
					local185 += local420;
					local349 += local508;
					local356 += local422;
					local370 += local510;
					local377 += local424;
					local391 += local512;
					local396 += local426;
					local406 += local514;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local349 = local185;
		local370 = local356;
		local391 = local377;
		local406 = local396;
		if (arg3 < 0.0F) {
			arg6 -= local408 * arg3;
			arg8 -= local522 * arg3;
			arg9 -= local410 * arg3;
			arg11 -= local586 * arg3;
			arg12 -= local412 * arg3;
			arg14 -= local588 * arg3;
			arg15 -= local414 * arg3;
			arg17 -= local590 * arg3;
			arg18 -= local416 * arg3;
			arg20 -= local592 * arg3;
			arg25 -= local418 * arg3;
			arg27 -= local594 * arg3;
			local185 -= local420 * arg3;
			local349 -= local596 * arg3;
			local356 -= local420 * arg3;
			local370 -= local596 * arg3;
			local377 -= local420 * arg3;
			local391 -= local596 * arg3;
			local396 -= local420 * arg3;
			local406 -= local596 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local434 * arg4;
			arg10 -= local498 * arg4;
			arg13 -= local500 * arg4;
			arg16 -= local502 * arg4;
			arg19 -= local504 * arg4;
			arg26 -= local506 * arg4;
			local342 -= local508 * arg4;
			local363 -= local510 * arg4;
			local384 -= local512 * arg4;
			local401 -= local514 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local522 < local408 || !(arg3 != arg4 || !(local522 > local434))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
				arg6 += local408;
				arg8 += local522;
				arg9 += local410;
				arg11 += local586;
				arg12 += local412;
				arg14 += local588;
				arg15 += local414;
				arg17 += local590;
				arg18 += local416;
				arg20 += local592;
				arg25 += local418;
				arg27 += local594;
				local185 += local420;
				local349 += local596;
				local356 += local422;
				local370 += local598;
				local377 += local424;
				local391 += local600;
				local396 += local426;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local349, local342, local370, local363, local391, local384, local406, local401);
				arg7 += local434;
				arg8 += local522;
				arg10 += local498;
				arg11 += local586;
				arg13 += local500;
				arg14 += local588;
				arg16 += local502;
				arg17 += local590;
				arg19 += local504;
				arg20 += local592;
				arg26 += local506;
				arg27 += local594;
				local342 += local508;
				local349 += local596;
				local363 += local510;
				local370 += local598;
				local384 += local512;
				local391 += local600;
				local401 += local514;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
			arg6 += local408;
			arg8 += local522;
			arg9 += local410;
			arg11 += local586;
			arg12 += local412;
			arg14 += local588;
			arg15 += local414;
			arg17 += local590;
			arg18 += local416;
			arg20 += local592;
			arg25 += local418;
			arg27 += local594;
			local185 += local420;
			local349 += local596;
			local356 += local422;
			local370 += local598;
			local377 += local424;
			local391 += local600;
			local396 += local426;
			local406 += local602;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local342, local349, local363, local370, local384, local391, local401, local406);
			arg7 += local434;
			arg8 += local522;
			arg10 += local498;
			arg11 += local586;
			arg13 += local500;
			arg14 += local588;
			arg16 += local502;
			arg17 += local590;
			arg19 += local504;
			arg20 += local592;
			arg26 += local506;
			arg27 += local594;
			local342 += local508;
			local349 += local596;
			local363 += local510;
			local370 += local598;
			local384 += local512;
			local391 += local600;
			local401 += local514;
			local406 += local602;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "(ZZZFFFFFFFFFI)V")
	void method24561(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12) {
		if (this.aBoolean575) {
			this.aClass104_Sub3_15.method20685((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12, 1568515583);
			this.aClass104_Sub3_15.method20685((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12, 254716159);
			this.aClass104_Sub3_15.method20685((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12, -1363410712);
			return;
		}
		@Pc(46) float local46 = arg7 - arg6;
		@Pc(50) float local50 = arg4 - arg3;
		@Pc(54) float local54 = arg8 - arg6;
		@Pc(58) float local58 = arg5 - arg3;
		@Pc(62) float local62 = arg10 - arg9;
		@Pc(66) float local66 = arg11 - arg9;
		@Pc(68) float local68 = 0.0F;
		if (arg4 != arg3) {
			local68 = (arg7 - arg6) / (arg4 - arg3);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg5 != arg4) {
			local82 = (arg8 - arg7) / (arg5 - arg4);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg5 != arg3) {
			local96 = (arg6 - arg8) / (arg3 - arg5);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt3319)) {
				if (arg4 > (float) this.anInt3319) {
					arg4 = this.anInt3319;
				}
				if (arg5 > (float) this.anInt3319) {
					arg5 = this.anInt3319;
				}
				arg9 = arg9 - local131 * arg6 + local131;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= local82 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && local96 < local68 || arg3 == arg4 && local96 > local82) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg7, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg7, (int) arg8, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local82 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(local96 < local68)) && (arg3 != arg5 || !(local82 > local68))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg7, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray287[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg7, (int) arg6, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
						while (--arg4 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt3321;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt3319)) {
				if (arg5 > (float) this.anInt3319) {
					arg5 = this.anInt3319;
				}
				if (arg3 > (float) this.anInt3319) {
					arg3 = this.anInt3319;
				}
				arg10 = arg10 - local131 * arg7 + local131;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local96 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && local68 < local82 || arg4 == arg5 && local68 > local96) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg8, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg8, (int) arg6, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= local96 * arg3;
						arg3 = 0.0F;
					}
					if (local68 < local82) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg8, (int) arg7, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray287[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg8, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
						while (--arg5 >= 0.0F) {
							this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt3321;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt3319)) {
			if (arg3 > (float) this.anInt3319) {
				arg3 = this.anInt3319;
			}
			if (arg4 > (float) this.anInt3319) {
				arg4 = this.anInt3319;
			}
			arg11 = arg11 - local131 * arg8 + local131;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= local68 * arg3;
					arg3 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg6, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg6, (int) arg7, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= local68 * arg4;
					arg4 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg6, (int) arg8, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray287[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg6, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
					while (--arg3 >= 0.0F) {
						this.method24550(arg0, arg1, arg2, this.anIntArray288, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt3321;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "ag", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	void method24562(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(21) int local21 = arg28 & 0xFFFF;
		@Pc(102) int local102;
		if (local21 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local21);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt3326 = 0;
				@Pc(60) int local60 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), -1295811677) & 0xFFFF];
				local102 = ((arg21 >> 16 & 0xFF) * (local60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local60 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local102, arg24, arg25, 1996293818), Class125_Sub2_Sub1.method21481(local102, arg24, arg26, 1292129026), Class125_Sub2_Sub1.method21481(local102, arg24, arg27, 1917072789));
				return;
			}
			this.anInt3323 = local21;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
			this.aBoolean574 = this.aClass104_Sub3_15.method5702(arg28);
			this.anInt3326 = this.aClass104_Sub3_15.method5701(arg28) & 0xFF;
		}
		this.anInt3322 = arg24;
		@Pc(185) float local185;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local185 = arg6;
				arg6 = arg7;
				arg7 = local185;
				@Pc(191) float local191 = arg3;
				arg3 = arg4;
				arg4 = local191;
				@Pc(197) float local197 = arg9;
				arg9 = arg10;
				arg10 = local197;
				@Pc(203) float local203 = arg15;
				arg15 = arg16;
				arg16 = local203;
				@Pc(209) float local209 = arg18;
				arg18 = arg19;
				arg19 = local209;
				@Pc(215) float local215 = arg12;
				arg12 = arg13;
				arg13 = local215;
				@Pc(221) float local221 = arg25;
				arg25 = arg26;
				arg26 = local221;
				local102 = arg21;
				arg21 = arg22;
				arg22 = local102;
			} else {
				local185 = arg6;
				arg6 = arg8;
				arg8 = local185;
				local185 = arg3;
				arg3 = arg5;
				arg5 = local185;
				local185 = arg9;
				arg9 = arg11;
				arg11 = local185;
				local185 = arg15;
				arg15 = arg17;
				arg17 = local185;
				local185 = arg18;
				arg18 = arg20;
				arg20 = local185;
				local185 = arg12;
				arg12 = arg14;
				arg14 = local185;
				local185 = arg25;
				arg25 = arg27;
				arg27 = local185;
				local102 = arg21;
				arg21 = arg23;
				arg23 = local102;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local185 = arg21 >> 24 & 0xFF;
		@Pc(342) float local342 = (float) (arg22 >> 24 & 0xFF);
		@Pc(349) float local349 = (float) (arg23 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg21 >> 16 & 0xFF);
		@Pc(363) float local363 = (float) (arg22 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg23 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg21 >> 8 & 0xFF);
		@Pc(384) float local384 = (float) (arg22 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg23 >> 8 & 0xFF);
		@Pc(396) float local396 = (float) (arg21 & 0xFF);
		@Pc(401) float local401 = (float) (arg22 & 0xFF);
		@Pc(406) float local406 = (float) (arg23 & 0xFF);
		@Pc(408) float local408 = 0.0F;
		@Pc(410) float local410 = 0.0F;
		@Pc(412) float local412 = 0.0F;
		@Pc(414) float local414 = 0.0F;
		@Pc(416) float local416 = 0.0F;
		@Pc(418) float local418 = 0.0F;
		@Pc(420) float local420 = 0.0F;
		@Pc(422) float local422 = 0.0F;
		@Pc(424) float local424 = 0.0F;
		@Pc(426) float local426 = 0.0F;
		@Pc(434) float local434;
		if (arg4 != arg3) {
			local434 = arg4 - arg3;
			local408 = (arg7 - arg6) / local434;
			local410 = (arg10 - arg9) / local434;
			local412 = (arg13 - arg12) / local434;
			local414 = (arg16 - arg15) / local434;
			local416 = (arg19 - arg18) / local434;
			local418 = (arg26 - arg25) / local434;
			local420 = (local342 - local185) / local434;
			local422 = (local363 - local356) / local434;
			local424 = (local384 - local377) / local434;
			local426 = (local401 - local396) / local434;
		}
		local434 = 0.0F;
		@Pc(498) float local498 = 0.0F;
		@Pc(500) float local500 = 0.0F;
		@Pc(502) float local502 = 0.0F;
		@Pc(504) float local504 = 0.0F;
		@Pc(506) float local506 = 0.0F;
		@Pc(508) float local508 = 0.0F;
		@Pc(510) float local510 = 0.0F;
		@Pc(512) float local512 = 0.0F;
		@Pc(514) float local514 = 0.0F;
		@Pc(522) float local522;
		if (arg5 != arg4) {
			local522 = arg5 - arg4;
			local434 = (arg8 - arg7) / local522;
			local498 = (arg11 - arg10) / local522;
			local500 = (arg14 - arg13) / local522;
			local502 = (arg17 - arg16) / local522;
			local504 = (arg20 - arg19) / local522;
			local506 = (arg27 - arg26) / local522;
			local508 = (local349 - local342) / local522;
			local510 = (local370 - local363) / local522;
			local512 = (local391 - local384) / local522;
			local514 = (local406 - local401) / local522;
		}
		local522 = 0.0F;
		@Pc(586) float local586 = 0.0F;
		@Pc(588) float local588 = 0.0F;
		@Pc(590) float local590 = 0.0F;
		@Pc(592) float local592 = 0.0F;
		@Pc(594) float local594 = 0.0F;
		@Pc(596) float local596 = 0.0F;
		@Pc(598) float local598 = 0.0F;
		@Pc(600) float local600 = 0.0F;
		@Pc(602) float local602 = 0.0F;
		if (arg3 != arg5) {
			@Pc(610) float local610 = arg3 - arg5;
			local522 = (arg6 - arg8) / local610;
			local586 = (arg9 - arg11) / local610;
			local588 = (arg12 - arg14) / local610;
			local590 = (arg15 - arg17) / local610;
			local592 = (arg18 - arg20) / local610;
			local594 = (arg25 - arg27) / local610;
			local596 = (local185 - local349) / local610;
			local598 = (local356 - local370) / local610;
			local600 = (local377 - local391) / local610;
			local602 = (local396 - local406) / local610;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local342 = local185;
			local363 = local356;
			local384 = local377;
			local401 = local396;
			if (arg3 < 0.0F) {
				arg6 -= local408 * arg3;
				arg7 -= local522 * arg3;
				arg9 -= local410 * arg3;
				arg10 -= local586 * arg3;
				arg12 -= local412 * arg3;
				arg13 -= local588 * arg3;
				arg15 -= local414 * arg3;
				arg16 -= local590 * arg3;
				arg18 -= local416 * arg3;
				arg19 -= local592 * arg3;
				arg25 -= local418 * arg3;
				arg26 -= local594 * arg3;
				local185 -= local420 * arg3;
				local342 -= local596 * arg3;
				local356 -= local420 * arg3;
				local363 -= local596 * arg3;
				local377 -= local420 * arg3;
				local384 -= local596 * arg3;
				local396 -= local420 * arg3;
				local401 -= local596 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local434 * arg5;
				arg11 -= local498 * arg5;
				arg14 -= local500 * arg5;
				arg17 -= local502 * arg5;
				arg20 -= local504 * arg5;
				arg27 -= local506 * arg5;
				local349 -= local508 * arg5;
				local370 -= local510 * arg5;
				local391 -= local512 * arg5;
				local406 -= local514 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local522 < local408 || arg3 == arg5 && local434 > local408) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local342, local185, local363, local356, local384, local377, local401, local396);
					arg6 += local408;
					arg7 += local522;
					arg9 += local410;
					arg10 += local586;
					arg12 += local412;
					arg13 += local588;
					arg15 += local414;
					arg16 += local590;
					arg18 += local416;
					arg19 += local592;
					arg25 += local418;
					arg26 += local594;
					local185 += local420;
					local342 += local596;
					local356 += local422;
					local363 += local598;
					local377 += local424;
					local384 += local600;
					local396 += local426;
					local401 += local602;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
					arg8 += local434;
					arg6 += local408;
					arg11 += local498;
					arg9 += local410;
					arg14 += local500;
					arg12 += local412;
					arg17 += local502;
					arg15 += local414;
					arg20 += local504;
					arg18 += local416;
					arg27 += local506;
					arg25 += local418;
					local349 += local508;
					local185 += local420;
					local370 += local510;
					local356 += local422;
					local391 += local512;
					local377 += local424;
					local406 += local514;
					local396 += local426;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local185, local342, local356, local363, local377, local384, local396, local401);
					arg7 += local522;
					arg6 += local408;
					arg10 += local586;
					arg9 += local410;
					arg13 += local588;
					arg12 += local412;
					arg16 += local590;
					arg15 += local414;
					arg19 += local592;
					arg18 += local416;
					arg26 += local594;
					arg25 += local418;
					local342 += local596;
					local185 += local420;
					local363 += local598;
					local356 += local422;
					local384 += local600;
					local377 += local424;
					local401 += local602;
					local396 += local426;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
					arg6 += local408;
					arg8 += local434;
					arg9 += local410;
					arg11 += local498;
					arg12 += local412;
					arg14 += local500;
					arg15 += local414;
					arg17 += local502;
					arg18 += local416;
					arg20 += local504;
					arg25 += local418;
					arg27 += local506;
					local185 += local420;
					local349 += local508;
					local356 += local422;
					local370 += local510;
					local377 += local424;
					local391 += local512;
					local396 += local426;
					local406 += local514;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local349 = local185;
		local370 = local356;
		local391 = local377;
		local406 = local396;
		if (arg3 < 0.0F) {
			arg6 -= local408 * arg3;
			arg8 -= local522 * arg3;
			arg9 -= local410 * arg3;
			arg11 -= local586 * arg3;
			arg12 -= local412 * arg3;
			arg14 -= local588 * arg3;
			arg15 -= local414 * arg3;
			arg17 -= local590 * arg3;
			arg18 -= local416 * arg3;
			arg20 -= local592 * arg3;
			arg25 -= local418 * arg3;
			arg27 -= local594 * arg3;
			local185 -= local420 * arg3;
			local349 -= local596 * arg3;
			local356 -= local420 * arg3;
			local370 -= local596 * arg3;
			local377 -= local420 * arg3;
			local391 -= local596 * arg3;
			local396 -= local420 * arg3;
			local406 -= local596 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local434 * arg4;
			arg10 -= local498 * arg4;
			arg13 -= local500 * arg4;
			arg16 -= local502 * arg4;
			arg19 -= local504 * arg4;
			arg26 -= local506 * arg4;
			local342 -= local508 * arg4;
			local363 -= local510 * arg4;
			local384 -= local512 * arg4;
			local401 -= local514 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local522 < local408 || !(arg3 != arg4 || !(local522 > local434))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local349, local185, local370, local356, local391, local377, local406, local396);
				arg6 += local408;
				arg8 += local522;
				arg9 += local410;
				arg11 += local586;
				arg12 += local412;
				arg14 += local588;
				arg15 += local414;
				arg17 += local590;
				arg18 += local416;
				arg20 += local592;
				arg25 += local418;
				arg27 += local594;
				local185 += local420;
				local349 += local596;
				local356 += local422;
				local370 += local598;
				local377 += local424;
				local391 += local600;
				local396 += local426;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local349, local342, local370, local363, local391, local384, local406, local401);
				arg7 += local434;
				arg8 += local522;
				arg10 += local498;
				arg11 += local586;
				arg13 += local500;
				arg14 += local588;
				arg16 += local502;
				arg17 += local590;
				arg19 += local504;
				arg20 += local592;
				arg26 += local506;
				arg27 += local594;
				local342 += local508;
				local349 += local596;
				local363 += local510;
				local370 += local598;
				local384 += local512;
				local391 += local600;
				local401 += local514;
				local406 += local602;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local185, local349, local356, local370, local377, local391, local396, local406);
			arg6 += local408;
			arg8 += local522;
			arg9 += local410;
			arg11 += local586;
			arg12 += local412;
			arg14 += local588;
			arg15 += local414;
			arg17 += local590;
			arg18 += local416;
			arg20 += local592;
			arg25 += local418;
			arg27 += local594;
			local185 += local420;
			local349 += local596;
			local356 += local422;
			local370 += local598;
			local377 += local424;
			local391 += local600;
			local396 += local426;
			local406 += local602;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24545(arg1, arg2, this.anIntArray288, this.anIntArray289, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local342, local349, local363, local370, local384, local391, local401, local406);
			arg7 += local434;
			arg8 += local522;
			arg10 += local498;
			arg11 += local586;
			arg13 += local500;
			arg14 += local588;
			arg16 += local502;
			arg17 += local590;
			arg19 += local504;
			arg20 += local592;
			arg26 += local506;
			arg27 += local594;
			local342 += local508;
			local349 += local596;
			local363 += local510;
			local370 += local598;
			local384 += local512;
			local391 += local600;
			local401 += local514;
			local406 += local602;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "ah", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V")
	void method24563(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean572) {
			if (arg6 > this.anInt3318) {
				arg6 = this.anInt3318;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray92[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local180 &= this.anInt3325;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt3325) {
					local180 = this.anInt3325;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local210 &= this.anInt3325;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt3325) {
					local210 = this.anInt3325;
				}
				@Pc(241) int local241 = this.anIntArray289[local210 * this.anInt3320 + local180];
				@Pc(243) boolean local243 = true;
				@Pc(259) int local259;
				if (this.aClass618_1 == Class618.aClass618_3) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass618_1 != Class618.aClass618_4) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt3326) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bd", name = "al", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V")
	void method24564(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean572) {
			if (arg6 > this.anInt3318) {
				arg6 = this.anInt3318;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray92[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local180 &= this.anInt3325;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt3325) {
					local180 = this.anInt3325;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt3320);
				if (this.aBoolean574) {
					local210 &= this.anInt3325;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt3325) {
					local210 = this.anInt3325;
				}
				@Pc(241) int local241 = this.anIntArray289[local210 * this.anInt3320 + local180];
				@Pc(243) boolean local243 = true;
				@Pc(259) int local259;
				if (this.aClass618_1 == Class618.aClass618_3) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass618_1 != Class618.aClass618_4) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt3326) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt3322 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt3322 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray92[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bd", name = "ac", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIFIFIF)V")
	void method24565(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) float arg29, @OriginalArg(30) int arg30, @OriginalArg(31) float arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt3322 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg29;
				arg29 = arg31;
				arg31 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg28;
				arg28 = arg30;
				arg30 = local89;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg29;
				arg29 = arg33;
				arg33 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg28;
				arg28 = arg32;
				arg32 = local83;
			}
		}
		@Pc(158) int local158 = arg28 & 0xFFFF;
		local83 = arg30 & 0xFFFF;
		@Pc(166) int local166 = arg32 & 0xFFFF;
		@Pc(202) int local202;
		@Pc(244) int local244;
		if (local158 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local158);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), 566921051) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1321389333), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1751491109), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1535796008));
				return;
			}
			this.anInt3323 = local158;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
		}
		this.aFloat248 = arg29;
		if (local83 != this.anInt3327) {
			this.anIntArray290 = this.aClass104_Sub3_15.method5697(local83);
			if (this.anIntArray290 == null) {
				this.anInt3327 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg30), -969639813) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1400249622), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 992597502), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1127057686));
				return;
			}
			this.anInt3327 = local83;
			this.anInt3317 = this.aClass104_Sub3_15.method5699(arg30);
			this.anInt3328 = this.anInt3317 - 1;
		}
		this.aFloat251 = arg31;
		if (local166 != this.anInt3324) {
			this.anIntArray291 = this.aClass104_Sub3_15.method5697(local166);
			if (this.anIntArray291 == null) {
				this.anInt3324 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg32), -1326608731) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1698313137), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1156230021), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1140040222));
				return;
			}
			this.anInt3324 = local166;
			this.anInt3316 = this.aClass104_Sub3_15.method5699(arg32);
			this.anInt3329 = this.anInt3316 - 1;
		}
		this.aFloat252 = arg33;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(623) float local623 = (float) (arg21 >> 24 & 0xFF);
		@Pc(630) float local630 = (float) (arg22 >> 24 & 0xFF);
		@Pc(637) float local637 = (float) (arg23 >> 24 & 0xFF);
		@Pc(644) float local644 = (float) (arg21 >> 16 & 0xFF);
		@Pc(651) float local651 = (float) (arg22 >> 16 & 0xFF);
		@Pc(658) float local658 = (float) (arg23 >> 16 & 0xFF);
		@Pc(665) float local665 = (float) (arg21 >> 8 & 0xFF);
		@Pc(672) float local672 = (float) (arg22 >> 8 & 0xFF);
		@Pc(679) float local679 = (float) (arg23 >> 8 & 0xFF);
		@Pc(684) float local684 = (float) (arg21 & 0xFF);
		@Pc(689) float local689 = (float) (arg22 & 0xFF);
		@Pc(694) float local694 = (float) (arg23 & 0xFF);
		@Pc(696) float local696 = 1.0F;
		@Pc(698) float local698 = 0.0F;
		@Pc(700) float local700 = 0.0F;
		@Pc(702) float local702 = 0.0F;
		@Pc(704) float local704 = 1.0F;
		@Pc(706) float local706 = 0.0F;
		@Pc(708) float local708 = 0.0F;
		@Pc(710) float local710 = 0.0F;
		@Pc(712) float local712 = 0.0F;
		@Pc(714) float local714 = 0.0F;
		@Pc(716) float local716 = 0.0F;
		@Pc(718) float local718 = 0.0F;
		@Pc(720) float local720 = 0.0F;
		@Pc(722) float local722 = 0.0F;
		@Pc(724) float local724 = 0.0F;
		@Pc(726) float local726 = 0.0F;
		@Pc(728) float local728 = 0.0F;
		@Pc(730) float local730 = 0.0F;
		@Pc(738) float local738;
		if (arg4 != arg3) {
			local738 = arg4 - arg3;
			local708 = (arg7 - arg6) / local738;
			local710 = (arg10 - arg9) / local738;
			local712 = (arg13 - arg12) / local738;
			local714 = (arg16 - arg15) / local738;
			local716 = (arg19 - arg18) / local738;
			local718 = (arg26 - arg25) / local738;
			local720 = (local630 - local623) / local738;
			local722 = (local651 - local644) / local738;
			local724 = (local672 - local665) / local738;
			local726 = (local689 - local684) / local738;
			local728 = (local698 - local696) / local738;
			local730 = (local704 - local702) / local738;
		}
		local738 = 0.0F;
		@Pc(814) float local814 = 0.0F;
		@Pc(816) float local816 = 0.0F;
		@Pc(818) float local818 = 0.0F;
		@Pc(820) float local820 = 0.0F;
		@Pc(822) float local822 = 0.0F;
		@Pc(824) float local824 = 0.0F;
		@Pc(826) float local826 = 0.0F;
		@Pc(828) float local828 = 0.0F;
		@Pc(830) float local830 = 0.0F;
		@Pc(832) float local832 = 0.0F;
		@Pc(834) float local834 = 0.0F;
		@Pc(842) float local842;
		if (arg5 != arg4) {
			local842 = arg5 - arg4;
			local738 = (arg8 - arg7) / local842;
			local814 = (arg11 - arg10) / local842;
			local816 = (arg14 - arg13) / local842;
			local818 = (arg17 - arg16) / local842;
			local820 = (arg20 - arg19) / local842;
			local822 = (arg27 - arg26) / local842;
			local824 = (local637 - local630) / local842;
			local826 = (local658 - local651) / local842;
			local828 = (local679 - local672) / local842;
			local830 = (local694 - local689) / local842;
			local832 = (local700 - local698) / local842;
			local834 = (local706 - local704) / local842;
		}
		local842 = 0.0F;
		@Pc(918) float local918 = 0.0F;
		@Pc(920) float local920 = 0.0F;
		@Pc(922) float local922 = 0.0F;
		@Pc(924) float local924 = 0.0F;
		@Pc(926) float local926 = 0.0F;
		@Pc(928) float local928 = 0.0F;
		@Pc(930) float local930 = 0.0F;
		@Pc(932) float local932 = 0.0F;
		@Pc(934) float local934 = 0.0F;
		@Pc(936) float local936 = 0.0F;
		@Pc(938) float local938 = 0.0F;
		if (arg3 != arg5) {
			@Pc(946) float local946 = arg3 - arg5;
			local842 = (arg6 - arg8) / local946;
			local918 = (arg9 - arg11) / local946;
			local920 = (arg12 - arg14) / local946;
			local922 = (arg15 - arg17) / local946;
			local924 = (arg18 - arg20) / local946;
			local926 = (arg25 - arg27) / local946;
			local928 = (local623 - local637) / local946;
			local930 = (local644 - local658) / local946;
			local932 = (local665 - local679) / local946;
			local934 = (local684 - local694) / local946;
			local936 = (local696 - local700) / local946;
			local938 = (local702 - local706) / local946;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local630 = local623;
			local651 = local644;
			local672 = local665;
			local689 = local684;
			local698 = local696;
			local704 = local702;
			if (arg3 < 0.0F) {
				arg6 -= local708 * arg3;
				arg7 -= local842 * arg3;
				arg9 -= local710 * arg3;
				arg10 -= local918 * arg3;
				arg12 -= local712 * arg3;
				arg13 -= local920 * arg3;
				arg15 -= local714 * arg3;
				arg16 -= local922 * arg3;
				arg18 -= local716 * arg3;
				arg19 -= local924 * arg3;
				arg25 -= local718 * arg3;
				arg26 -= local926 * arg3;
				local623 -= local720 * arg3;
				local630 -= local928 * arg3;
				local644 -= local722 * arg3;
				local651 -= local930 * arg3;
				local665 -= local724 * arg3;
				local672 -= local932 * arg3;
				local684 -= local726 * arg3;
				local689 -= local934 * arg3;
				local696 -= local728 * arg3;
				local698 -= local936 * arg3;
				local702 -= local730 * arg3;
				local704 -= local938 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local738 * arg5;
				arg11 -= local814 * arg5;
				arg14 -= local816 * arg5;
				arg17 -= local818 * arg5;
				arg20 -= local820 * arg5;
				arg27 -= local822 * arg5;
				local637 -= local824 * arg5;
				local658 -= local826 * arg5;
				local679 -= local828 * arg5;
				local694 -= local830 * arg5;
				local700 -= local832 * arg5;
				local706 -= local834 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local842 < local708 || arg3 == arg5 && local738 > local708) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local630, local623, local651, local644, local672, local665, local689, local684, local698, local696, local704, local702);
					arg6 += local708;
					arg7 += local842;
					arg9 += local710;
					arg10 += local918;
					arg12 += local712;
					arg13 += local920;
					arg15 += local714;
					arg16 += local922;
					arg18 += local716;
					arg19 += local924;
					arg25 += local718;
					arg26 += local926;
					local623 += local720;
					local630 += local928;
					local644 += local722;
					local651 += local930;
					local665 += local724;
					local672 += local932;
					local684 += local726;
					local689 += local934;
					local696 += local728;
					local698 += local936;
					local702 += local730;
					local704 += local938;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
					arg8 += local738;
					arg6 += local708;
					arg11 += local814;
					arg9 += local710;
					arg14 += local816;
					arg12 += local712;
					arg17 += local818;
					arg15 += local714;
					arg20 += local820;
					arg18 += local716;
					arg27 += local822;
					arg25 += local718;
					local637 += local824;
					local623 += local720;
					local658 += local826;
					local644 += local722;
					local679 += local828;
					local665 += local724;
					local694 += local830;
					local684 += local726;
					local700 += local832;
					local696 += local728;
					local706 += local834;
					local702 += local730;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local623, local630, local644, local651, local665, local672, local684, local689, local696, local698, local702, local704);
					arg7 += local842;
					arg6 += local708;
					arg10 += local918;
					arg9 += local710;
					arg13 += local920;
					arg12 += local712;
					arg16 += local922;
					arg15 += local714;
					arg19 += local924;
					arg18 += local716;
					arg26 += local926;
					arg25 += local718;
					local630 += local928;
					local623 += local720;
					local651 += local930;
					local644 += local722;
					local672 += local932;
					local665 += local724;
					local689 += local934;
					local684 += local726;
					local698 += local936;
					local696 += local728;
					local704 += local938;
					local702 += local730;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
					arg6 += local708;
					arg8 += local738;
					arg9 += local710;
					arg11 += local814;
					arg12 += local712;
					arg14 += local816;
					arg15 += local714;
					arg17 += local818;
					arg18 += local716;
					arg20 += local820;
					arg25 += local718;
					arg27 += local822;
					local623 += local720;
					local637 += local824;
					local644 += local722;
					local658 += local826;
					local665 += local724;
					local679 += local828;
					local684 += local726;
					local694 += local830;
					local696 += local728;
					local700 += local832;
					local702 += local730;
					local706 += local834;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local637 = local623;
		local658 = local644;
		local679 = local665;
		local694 = local684;
		local700 = local696;
		local706 = local702;
		if (arg3 < 0.0F) {
			arg6 -= local708 * arg3;
			arg8 -= local842 * arg3;
			arg9 -= local710 * arg3;
			arg11 -= local918 * arg3;
			arg12 -= local712 * arg3;
			arg14 -= local920 * arg3;
			arg15 -= local714 * arg3;
			arg17 -= local922 * arg3;
			arg18 -= local716 * arg3;
			arg20 -= local924 * arg3;
			arg25 -= local718 * arg3;
			arg27 -= local926 * arg3;
			local623 -= local720 * arg3;
			local637 -= local928 * arg3;
			local644 -= local722 * arg3;
			local658 -= local930 * arg3;
			local665 -= local724 * arg3;
			local679 -= local932 * arg3;
			local684 -= local726 * arg3;
			local694 -= local934 * arg3;
			local696 -= local728 * arg3;
			local700 -= local936 * arg3;
			local702 -= local730 * arg3;
			local706 -= local938 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local738 * arg4;
			arg10 -= local814 * arg4;
			arg13 -= local816 * arg4;
			arg16 -= local818 * arg4;
			arg19 -= local820 * arg4;
			arg26 -= local822 * arg4;
			local630 -= local824 * arg4;
			local651 -= local826 * arg4;
			local672 -= local828 * arg4;
			local689 -= local830 * arg4;
			local698 -= local832 * arg4;
			local704 -= local834 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local842 >= local708) && (arg3 != arg4 || local842 <= local738)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
				arg6 += local708;
				arg8 += local842;
				arg9 += local710;
				arg11 += local918;
				arg12 += local712;
				arg14 += local920;
				arg15 += local714;
				arg17 += local922;
				arg18 += local716;
				arg20 += local924;
				arg25 += local718;
				arg27 += local926;
				local623 += local720;
				local637 += local928;
				local644 += local722;
				local658 += local930;
				local665 += local724;
				local679 += local932;
				local684 += local726;
				local694 += local934;
				local696 += local728;
				local700 += local936;
				local702 += local730;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local630, local637, local651, local658, local672, local679, local689, local694, local698, local700, local704, local706);
				arg7 += local738;
				arg8 += local842;
				arg10 += local814;
				arg11 += local918;
				arg13 += local816;
				arg14 += local920;
				arg16 += local818;
				arg17 += local922;
				arg19 += local820;
				arg20 += local924;
				arg26 += local822;
				arg27 += local926;
				local630 += local824;
				local637 += local928;
				local651 += local826;
				local658 += local930;
				local672 += local828;
				local679 += local932;
				local689 += local830;
				local694 += local934;
				local698 += local832;
				local700 += local936;
				local704 += local834;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
			arg6 += local708;
			arg8 += local842;
			arg9 += local710;
			arg11 += local918;
			arg12 += local712;
			arg14 += local920;
			arg15 += local714;
			arg17 += local922;
			arg18 += local716;
			arg20 += local924;
			arg25 += local718;
			arg27 += local926;
			local623 += local720;
			local637 += local928;
			local644 += local722;
			local658 += local930;
			local665 += local724;
			local679 += local932;
			local684 += local726;
			local694 += local934;
			local696 += local728;
			local700 += local936;
			local702 += local730;
			local706 += local938;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local637, local630, local658, local651, local679, local672, local694, local689, local700, local698, local706, local704);
			arg7 += local738;
			arg8 += local842;
			arg10 += local814;
			arg11 += local918;
			arg13 += local816;
			arg14 += local920;
			arg16 += local818;
			arg17 += local922;
			arg19 += local820;
			arg20 += local924;
			arg26 += local822;
			arg27 += local926;
			local630 += local824;
			local637 += local928;
			local651 += local826;
			local658 += local930;
			local672 += local828;
			local679 += local932;
			local689 += local830;
			local694 += local934;
			local698 += local832;
			local700 += local936;
			local704 += local834;
			local706 += local938;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "ai", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIFIFIF)V")
	void method24566(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) float arg29, @OriginalArg(30) int arg30, @OriginalArg(31) float arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33) {
		if (!arg0) {
			this.method24543(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt3322 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg29;
				arg29 = arg31;
				arg31 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg28;
				arg28 = arg30;
				arg30 = local89;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg29;
				arg29 = arg33;
				arg33 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg28;
				arg28 = arg32;
				arg32 = local83;
			}
		}
		@Pc(158) int local158 = arg28 & 0xFFFF;
		local83 = arg30 & 0xFFFF;
		@Pc(166) int local166 = arg32 & 0xFFFF;
		@Pc(202) int local202;
		@Pc(244) int local244;
		if (local158 != this.anInt3323) {
			this.anIntArray289 = this.aClass104_Sub3_15.method5697(local158);
			if (this.anIntArray289 == null) {
				this.anInt3323 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg28), 611423725) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1214409556), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1673538019), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1225698365));
				return;
			}
			this.anInt3323 = local158;
			this.anInt3320 = this.aClass104_Sub3_15.method5699(arg28);
			this.anInt3325 = this.anInt3320 - 1;
			this.aClass618_1 = this.aClass104_Sub3_15.method5700(arg28);
		}
		this.aFloat248 = arg29;
		if (local83 != this.anInt3327) {
			this.anIntArray290 = this.aClass104_Sub3_15.method5697(local83);
			if (this.anIntArray290 == null) {
				this.anInt3327 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg30), -836139133) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1852928339), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 983734038), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1645633676));
				return;
			}
			this.anInt3327 = local83;
			this.anInt3317 = this.aClass104_Sub3_15.method5699(arg30);
			this.anInt3328 = this.anInt3317 - 1;
		}
		this.aFloat251 = arg31;
		if (local166 != this.anInt3324) {
			this.anIntArray291 = this.aClass104_Sub3_15.method5697(local166);
			if (this.anIntArray291 == null) {
				this.anInt3324 = -1;
				this.anInt3315 = 255 - (arg21 >> 24 & 0xFF);
				local202 = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_15.method5737(arg32), 1322946631) & 0xFFFF];
				local244 = ((arg21 >> 16 & 0xFF) * (local202 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local202 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local202 & 0xFF) >> 8;
				this.method24541(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class125_Sub2_Sub1.method21481(local244, arg24, arg25, 1786879525), Class125_Sub2_Sub1.method21481(local244, arg24, arg26, 1341292692), Class125_Sub2_Sub1.method21481(local244, arg24, arg27, 1294569112));
				return;
			}
			this.anInt3324 = local166;
			this.anInt3316 = this.aClass104_Sub3_15.method5699(arg32);
			this.anInt3329 = this.anInt3316 - 1;
		}
		this.aFloat252 = arg33;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(623) float local623 = (float) (arg21 >> 24 & 0xFF);
		@Pc(630) float local630 = (float) (arg22 >> 24 & 0xFF);
		@Pc(637) float local637 = (float) (arg23 >> 24 & 0xFF);
		@Pc(644) float local644 = (float) (arg21 >> 16 & 0xFF);
		@Pc(651) float local651 = (float) (arg22 >> 16 & 0xFF);
		@Pc(658) float local658 = (float) (arg23 >> 16 & 0xFF);
		@Pc(665) float local665 = (float) (arg21 >> 8 & 0xFF);
		@Pc(672) float local672 = (float) (arg22 >> 8 & 0xFF);
		@Pc(679) float local679 = (float) (arg23 >> 8 & 0xFF);
		@Pc(684) float local684 = (float) (arg21 & 0xFF);
		@Pc(689) float local689 = (float) (arg22 & 0xFF);
		@Pc(694) float local694 = (float) (arg23 & 0xFF);
		@Pc(696) float local696 = 1.0F;
		@Pc(698) float local698 = 0.0F;
		@Pc(700) float local700 = 0.0F;
		@Pc(702) float local702 = 0.0F;
		@Pc(704) float local704 = 1.0F;
		@Pc(706) float local706 = 0.0F;
		@Pc(708) float local708 = 0.0F;
		@Pc(710) float local710 = 0.0F;
		@Pc(712) float local712 = 0.0F;
		@Pc(714) float local714 = 0.0F;
		@Pc(716) float local716 = 0.0F;
		@Pc(718) float local718 = 0.0F;
		@Pc(720) float local720 = 0.0F;
		@Pc(722) float local722 = 0.0F;
		@Pc(724) float local724 = 0.0F;
		@Pc(726) float local726 = 0.0F;
		@Pc(728) float local728 = 0.0F;
		@Pc(730) float local730 = 0.0F;
		@Pc(738) float local738;
		if (arg4 != arg3) {
			local738 = arg4 - arg3;
			local708 = (arg7 - arg6) / local738;
			local710 = (arg10 - arg9) / local738;
			local712 = (arg13 - arg12) / local738;
			local714 = (arg16 - arg15) / local738;
			local716 = (arg19 - arg18) / local738;
			local718 = (arg26 - arg25) / local738;
			local720 = (local630 - local623) / local738;
			local722 = (local651 - local644) / local738;
			local724 = (local672 - local665) / local738;
			local726 = (local689 - local684) / local738;
			local728 = (local698 - local696) / local738;
			local730 = (local704 - local702) / local738;
		}
		local738 = 0.0F;
		@Pc(814) float local814 = 0.0F;
		@Pc(816) float local816 = 0.0F;
		@Pc(818) float local818 = 0.0F;
		@Pc(820) float local820 = 0.0F;
		@Pc(822) float local822 = 0.0F;
		@Pc(824) float local824 = 0.0F;
		@Pc(826) float local826 = 0.0F;
		@Pc(828) float local828 = 0.0F;
		@Pc(830) float local830 = 0.0F;
		@Pc(832) float local832 = 0.0F;
		@Pc(834) float local834 = 0.0F;
		@Pc(842) float local842;
		if (arg5 != arg4) {
			local842 = arg5 - arg4;
			local738 = (arg8 - arg7) / local842;
			local814 = (arg11 - arg10) / local842;
			local816 = (arg14 - arg13) / local842;
			local818 = (arg17 - arg16) / local842;
			local820 = (arg20 - arg19) / local842;
			local822 = (arg27 - arg26) / local842;
			local824 = (local637 - local630) / local842;
			local826 = (local658 - local651) / local842;
			local828 = (local679 - local672) / local842;
			local830 = (local694 - local689) / local842;
			local832 = (local700 - local698) / local842;
			local834 = (local706 - local704) / local842;
		}
		local842 = 0.0F;
		@Pc(918) float local918 = 0.0F;
		@Pc(920) float local920 = 0.0F;
		@Pc(922) float local922 = 0.0F;
		@Pc(924) float local924 = 0.0F;
		@Pc(926) float local926 = 0.0F;
		@Pc(928) float local928 = 0.0F;
		@Pc(930) float local930 = 0.0F;
		@Pc(932) float local932 = 0.0F;
		@Pc(934) float local934 = 0.0F;
		@Pc(936) float local936 = 0.0F;
		@Pc(938) float local938 = 0.0F;
		if (arg3 != arg5) {
			@Pc(946) float local946 = arg3 - arg5;
			local842 = (arg6 - arg8) / local946;
			local918 = (arg9 - arg11) / local946;
			local920 = (arg12 - arg14) / local946;
			local922 = (arg15 - arg17) / local946;
			local924 = (arg18 - arg20) / local946;
			local926 = (arg25 - arg27) / local946;
			local928 = (local623 - local637) / local946;
			local930 = (local644 - local658) / local946;
			local932 = (local665 - local679) / local946;
			local934 = (local684 - local694) / local946;
			local936 = (local696 - local700) / local946;
			local938 = (local702 - local706) / local946;
		}
		if (arg3 >= (float) this.anInt3319) {
			return;
		}
		if (arg4 > (float) this.anInt3319) {
			arg4 = this.anInt3319;
		}
		if (arg5 > (float) this.anInt3319) {
			arg5 = this.anInt3319;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local630 = local623;
			local651 = local644;
			local672 = local665;
			local689 = local684;
			local698 = local696;
			local704 = local702;
			if (arg3 < 0.0F) {
				arg6 -= local708 * arg3;
				arg7 -= local842 * arg3;
				arg9 -= local710 * arg3;
				arg10 -= local918 * arg3;
				arg12 -= local712 * arg3;
				arg13 -= local920 * arg3;
				arg15 -= local714 * arg3;
				arg16 -= local922 * arg3;
				arg18 -= local716 * arg3;
				arg19 -= local924 * arg3;
				arg25 -= local718 * arg3;
				arg26 -= local926 * arg3;
				local623 -= local720 * arg3;
				local630 -= local928 * arg3;
				local644 -= local722 * arg3;
				local651 -= local930 * arg3;
				local665 -= local724 * arg3;
				local672 -= local932 * arg3;
				local684 -= local726 * arg3;
				local689 -= local934 * arg3;
				local696 -= local728 * arg3;
				local698 -= local936 * arg3;
				local702 -= local730 * arg3;
				local704 -= local938 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local738 * arg5;
				arg11 -= local814 * arg5;
				arg14 -= local816 * arg5;
				arg17 -= local818 * arg5;
				arg20 -= local820 * arg5;
				arg27 -= local822 * arg5;
				local637 -= local824 * arg5;
				local658 -= local826 * arg5;
				local679 -= local828 * arg5;
				local694 -= local830 * arg5;
				local700 -= local832 * arg5;
				local706 -= local834 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local842 < local708 || arg3 == arg5 && local738 > local708) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local630, local623, local651, local644, local672, local665, local689, local684, local698, local696, local704, local702);
					arg6 += local708;
					arg7 += local842;
					arg9 += local710;
					arg10 += local918;
					arg12 += local712;
					arg13 += local920;
					arg15 += local714;
					arg16 += local922;
					arg18 += local716;
					arg19 += local924;
					arg25 += local718;
					arg26 += local926;
					local623 += local720;
					local630 += local928;
					local644 += local722;
					local651 += local930;
					local665 += local724;
					local672 += local932;
					local684 += local726;
					local689 += local934;
					local696 += local728;
					local698 += local936;
					local702 += local730;
					local704 += local938;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
					arg8 += local738;
					arg6 += local708;
					arg11 += local814;
					arg9 += local710;
					arg14 += local816;
					arg12 += local712;
					arg17 += local818;
					arg15 += local714;
					arg20 += local820;
					arg18 += local716;
					arg27 += local822;
					arg25 += local718;
					local637 += local824;
					local623 += local720;
					local658 += local826;
					local644 += local722;
					local679 += local828;
					local665 += local724;
					local694 += local830;
					local684 += local726;
					local700 += local832;
					local696 += local728;
					local706 += local834;
					local702 += local730;
					arg3 += this.anInt3321;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray287[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local623, local630, local644, local651, local665, local672, local684, local689, local696, local698, local702, local704);
					arg7 += local842;
					arg6 += local708;
					arg10 += local918;
					arg9 += local710;
					arg13 += local920;
					arg12 += local712;
					arg16 += local922;
					arg15 += local714;
					arg19 += local924;
					arg18 += local716;
					arg26 += local926;
					arg25 += local718;
					local630 += local928;
					local623 += local720;
					local651 += local930;
					local644 += local722;
					local672 += local932;
					local665 += local724;
					local689 += local934;
					local684 += local726;
					local698 += local936;
					local696 += local728;
					local704 += local938;
					local702 += local730;
					arg3 += this.anInt3321;
				}
				while (--arg4 >= 0.0F) {
					this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
					arg6 += local708;
					arg8 += local738;
					arg9 += local710;
					arg11 += local814;
					arg12 += local712;
					arg14 += local816;
					arg15 += local714;
					arg17 += local818;
					arg18 += local716;
					arg20 += local820;
					arg25 += local718;
					arg27 += local822;
					local623 += local720;
					local637 += local824;
					local644 += local722;
					local658 += local826;
					local665 += local724;
					local679 += local828;
					local684 += local726;
					local694 += local830;
					local696 += local728;
					local700 += local832;
					local702 += local730;
					local706 += local834;
					arg3 += this.anInt3321;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local637 = local623;
		local658 = local644;
		local679 = local665;
		local694 = local684;
		local700 = local696;
		local706 = local702;
		if (arg3 < 0.0F) {
			arg6 -= local708 * arg3;
			arg8 -= local842 * arg3;
			arg9 -= local710 * arg3;
			arg11 -= local918 * arg3;
			arg12 -= local712 * arg3;
			arg14 -= local920 * arg3;
			arg15 -= local714 * arg3;
			arg17 -= local922 * arg3;
			arg18 -= local716 * arg3;
			arg20 -= local924 * arg3;
			arg25 -= local718 * arg3;
			arg27 -= local926 * arg3;
			local623 -= local720 * arg3;
			local637 -= local928 * arg3;
			local644 -= local722 * arg3;
			local658 -= local930 * arg3;
			local665 -= local724 * arg3;
			local679 -= local932 * arg3;
			local684 -= local726 * arg3;
			local694 -= local934 * arg3;
			local696 -= local728 * arg3;
			local700 -= local936 * arg3;
			local702 -= local730 * arg3;
			local706 -= local938 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local738 * arg4;
			arg10 -= local814 * arg4;
			arg13 -= local816 * arg4;
			arg16 -= local818 * arg4;
			arg19 -= local820 * arg4;
			arg26 -= local822 * arg4;
			local630 -= local824 * arg4;
			local651 -= local826 * arg4;
			local672 -= local828 * arg4;
			local689 -= local830 * arg4;
			local698 -= local832 * arg4;
			local704 -= local834 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local842 >= local708) && (arg3 != arg4 || local842 <= local738)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray287[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local623, local637, local644, local658, local665, local679, local684, local694, local696, local700, local702, local706);
				arg6 += local708;
				arg8 += local842;
				arg9 += local710;
				arg11 += local918;
				arg12 += local712;
				arg14 += local920;
				arg15 += local714;
				arg17 += local922;
				arg18 += local716;
				arg20 += local924;
				arg25 += local718;
				arg27 += local926;
				local623 += local720;
				local637 += local928;
				local644 += local722;
				local658 += local930;
				local665 += local724;
				local679 += local932;
				local684 += local726;
				local694 += local934;
				local696 += local728;
				local700 += local936;
				local702 += local730;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			while (--arg5 >= 0.0F) {
				this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local630, local637, local651, local658, local672, local679, local689, local694, local698, local700, local704, local706);
				arg7 += local738;
				arg8 += local842;
				arg10 += local814;
				arg11 += local918;
				arg13 += local816;
				arg14 += local920;
				arg16 += local818;
				arg17 += local922;
				arg19 += local820;
				arg20 += local924;
				arg26 += local822;
				arg27 += local926;
				local630 += local824;
				local637 += local928;
				local651 += local826;
				local658 += local930;
				local672 += local828;
				local679 += local932;
				local689 += local830;
				local694 += local934;
				local698 += local832;
				local700 += local936;
				local704 += local834;
				local706 += local938;
				arg3 += this.anInt3321;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray287[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local637, local623, local658, local644, local679, local665, local694, local684, local700, local696, local706, local702);
			arg6 += local708;
			arg8 += local842;
			arg9 += local710;
			arg11 += local918;
			arg12 += local712;
			arg14 += local920;
			arg15 += local714;
			arg17 += local922;
			arg18 += local716;
			arg20 += local924;
			arg25 += local718;
			arg27 += local926;
			local623 += local720;
			local637 += local928;
			local644 += local722;
			local658 += local930;
			local665 += local724;
			local679 += local932;
			local684 += local726;
			local694 += local934;
			local696 += local728;
			local700 += local936;
			local702 += local730;
			local706 += local938;
			arg3 += this.anInt3321;
		}
		while (--arg5 >= 0.0F) {
			this.method24547(arg1, arg2, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local637, local630, local658, local651, local679, local672, local694, local689, local700, local698, local706, local704);
			arg7 += local738;
			arg8 += local842;
			arg10 += local814;
			arg11 += local918;
			arg13 += local816;
			arg14 += local920;
			arg16 += local818;
			arg17 += local922;
			arg19 += local820;
			arg20 += local924;
			arg26 += local822;
			arg27 += local926;
			local630 += local824;
			local637 += local928;
			local651 += local826;
			local658 += local930;
			local672 += local828;
			local679 += local932;
			local689 += local830;
			local694 += local934;
			local698 += local832;
			local700 += local936;
			local704 += local834;
			local706 += local938;
			arg3 += this.anInt3321;
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(ZZ[IIIIIIFFFF)V")
	void method24567(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		if (this.aBoolean572) {
			if (arg7 > this.anInt3318) {
				arg7 = this.anInt3318;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		@Pc(220) int local220;
		@Pc(225) int local225;
		@Pc(272) int local272;
		@Pc(71) int local71;
		@Pc(66) int local66;
		@Pc(54) float local54;
		@Pc(95) float local95;
		@Pc(50) int local50;
		if (this.aClass176_3.aBoolean568) {
			if (this.aBoolean571) {
				local50 = arg7 - arg6 >> 2;
				local54 = arg9 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				}
			} else {
				local50 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg10 += arg11;
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean571) {
			local50 = arg7 - arg6 >> 2;
			local54 = arg9 * 4.0F;
			if (this.anInt3315 == 0) {
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else {
			local50 = arg7 - arg6;
			if (this.anInt3315 == 0) {
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					}
					arg10 += arg11;
					arg8 += arg9;
					local50--;
				} while (local50 > 0);
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local272 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					local50--;
				} while (local50 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(ZZ[IIIIIIFFFF)V")
	void method24568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		if (this.aBoolean572) {
			if (arg7 > this.anInt3318) {
				arg7 = this.anInt3318;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		@Pc(220) int local220;
		@Pc(225) int local225;
		@Pc(272) int local272;
		@Pc(71) int local71;
		@Pc(66) int local66;
		@Pc(54) float local54;
		@Pc(95) float local95;
		@Pc(50) int local50;
		if (this.aClass176_3.aBoolean568) {
			if (this.aBoolean571) {
				local50 = arg7 - arg6 >> 2;
				local54 = arg9 * 4.0F;
				if (this.anInt3315 == 0) {
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					if (local50 > 0) {
						do {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							arg8 += local54;
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local71 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = arg10;
								}
							}
							local95 = arg10 + arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							local71++;
							if (!arg0 || local95 < this.aFloatArray92[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[local71] = local95;
								}
							}
							local95 += arg11;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = local95;
								}
							}
							arg10 = local95 + arg11;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg7 - arg6 & 0x3;
					if (local50 > 0) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray92[arg3] = arg10;
								}
							}
							arg10 += arg11;
							local50--;
						} while (local50 > 0);
					}
				}
			} else {
				local50 = arg7 - arg6;
				if (this.anInt3315 == 0) {
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg10 += arg11;
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				} else {
					local220 = this.anInt3315;
					local225 = 256 - this.anInt3315;
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray92[arg3] = arg10;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean571) {
			local50 = arg7 - arg6 >> 2;
			local54 = arg9 * 4.0F;
			if (this.anInt3315 == 0) {
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							arg2[arg3] = local66;
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				if (local50 > 0) {
					do {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						arg8 += local54;
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local71 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 = arg10 + arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						local71++;
						if (!arg0 || local95 < this.aFloatArray92[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg11;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 = local95 + arg11;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg7 - arg6 & 0x3;
				if (local50 > 0) {
					local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg10 += arg11;
						local50--;
					} while (local50 > 0);
				}
			}
		} else {
			local50 = arg7 - arg6;
			if (this.anInt3315 == 0) {
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						arg2[arg3] = Class685.anIntArray524[(int) arg8 & 0xFFFF];
					}
					arg10 += arg11;
					arg8 += arg9;
					local50--;
				} while (local50 > 0);
			} else {
				local220 = this.anInt3315;
				local225 = 256 - this.anInt3315;
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray92[arg3]) {
						local66 = Class685.anIntArray524[(int) arg8 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local272 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					local50--;
				} while (local50 > 0);
			}
		}
	}
}
