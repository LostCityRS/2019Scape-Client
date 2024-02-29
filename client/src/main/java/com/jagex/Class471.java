package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class471 {

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
	static int anInt5121;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
	static int anInt5122;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "[Lclient!ov;")
	static Class471[] aClass471Array1 = new Class471[0];

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "F")
	public float aFloat313;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "F")
	public float aFloat314;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "F")
	public float aFloat315;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "F")
	public float aFloat316;

	static {
		new Class471();
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V", line = 20)
	public static void method29455(@OriginalArg(0) int arg0) {
		anInt5122 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5121 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "(I)V", line = 20)
	public static void method29456(@OriginalArg(0) int arg0) {
		anInt5122 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5121 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "ae", descriptor = "(I)V", line = 20)
	public static void method29457(@OriginalArg(0) int arg0) {
		anInt5122 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5121 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "ag", descriptor = "()Lclient!ov;", line = 26)
	public static Class471 method29458() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471();
			} else {
				aClass471Array1[--anInt5121].method29486();
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "()Lclient!ov;", line = 26)
	public static Class471 method29459() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471();
			} else {
				aClass471Array1[--anInt5121].method29486();
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "(FFFF)Lclient!ov;", line = 36)
	static Class471 method29460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5121].method29473(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "ac", descriptor = "(FFFF)Lclient!ov;", line = 36)
	static Class471 method29461(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5121].method29473(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "al", descriptor = "(FFFF)Lclient!ov;", line = 36)
	static Class471 method29462(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5121].method29473(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "ah", descriptor = "(FFFF)Lclient!ov;", line = 36)
	static Class471 method29463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5121].method29473(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "ai", descriptor = "(Lclient!ov;)Lclient!ov;", line = 46)
	public static Class471 method29464(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5121].method29477(arg0);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "aw", descriptor = "(Lclient!ov;)Lclient!ov;", line = 46)
	public static Class471 method29465(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5121].method29477(arg0);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "(Lclient!ov;)Lclient!ov;", line = 46)
	public static Class471 method29466(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5121].method29477(arg0);
				return aClass471Array1[anInt5121];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "()V", line = 56)
	public void method29467() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 < anInt5122 - 1) {
				aClass471Array1[anInt5121++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "as", descriptor = "()V", line = 56)
	public void method29468() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5121 < anInt5122 - 1) {
				aClass471Array1[anInt5121++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V", line = 61)
	public Class471() {
		this.method29486();
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(FFFF)V", line = 65)
	public Class471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29473(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ov;)V", line = 69)
	public Class471(@OriginalArg(0) Class471 arg0) {
		this.method29477(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(FFF)V", line = 73)
	public Class471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29485(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!alw;)V", line = 77)
	Class471(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat314 = arg0.method22504(522616148);
		this.aFloat315 = arg0.method22504(336593502);
		this.aFloat316 = arg0.method22504(2143343225);
		this.aFloat313 = arg0.method22504(980950686);
	}

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "(Lclient!alw;)V", line = 85)
	public void method29469(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat314 = arg0.method22504(-946565270);
		this.aFloat315 = arg0.method22504(-696310795);
		this.aFloat316 = arg0.method22504(-2086329748);
		this.aFloat313 = arg0.method22504(1876032031);
	}

	@OriginalMember(owner = "client!ov", name = "at", descriptor = "(Lclient!alw;)V", line = 85)
	public void method29470(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat314 = arg0.method22504(1506873212);
		this.aFloat315 = arg0.method22504(-2009945152);
		this.aFloat316 = arg0.method22504(-1637944607);
		this.aFloat313 = arg0.method22504(-1436019866);
	}

	@OriginalMember(owner = "client!ov", name = "ad", descriptor = "(Lclient!alw;)V", line = 85)
	public void method29471(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat314 = arg0.method22504(-150070086);
		this.aFloat315 = arg0.method22504(-2011084379);
		this.aFloat316 = arg0.method22504(95114639);
		this.aFloat313 = arg0.method22504(-1230511073);
	}

	@OriginalMember(owner = "client!ov", name = "am", descriptor = "(FFFF)V", line = 92)
	void method29472(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat314 = arg0;
		this.aFloat315 = arg1;
		this.aFloat316 = arg2;
		this.aFloat313 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "(FFFF)V", line = 92)
	void method29473(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat314 = arg0;
		this.aFloat315 = arg1;
		this.aFloat316 = arg2;
		this.aFloat313 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "ap", descriptor = "(FFFF)V", line = 92)
	void method29474(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat314 = arg0;
		this.aFloat315 = arg1;
		this.aFloat316 = arg2;
		this.aFloat313 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "au", descriptor = "(FFFF)V", line = 92)
	void method29475(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat314 = arg0;
		this.aFloat315 = arg1;
		this.aFloat316 = arg2;
		this.aFloat313 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "ar", descriptor = "(FFFF)V", line = 92)
	void method29476(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat314 = arg0;
		this.aFloat315 = arg1;
		this.aFloat316 = arg2;
		this.aFloat313 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "(Lclient!ov;)V", line = 99)
	public void method29477(@OriginalArg(0) Class471 arg0) {
		this.aFloat314 = arg0.aFloat314;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat313 = arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "(Lclient!ox;F)V", line = 106)
	public void method29478(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29482(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "ax", descriptor = "(Lclient!ox;F)V", line = 106)
	public void method29479(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29482(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "aq", descriptor = "(Lclient!ox;F)V", line = 106)
	public void method29480(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29482(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "av", descriptor = "(Lclient!ox;F)V", line = 106)
	public void method29481(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29482(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "(FFFF)V", line = 110)
	public void method29482(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat314 = arg0 * local6;
		this.aFloat315 = arg1 * local6;
		this.aFloat316 = arg2 * local6;
		this.aFloat313 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "ao", descriptor = "(FFFF)V", line = 110)
	public void method29483(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat314 = arg0 * local6;
		this.aFloat315 = arg1 * local6;
		this.aFloat316 = arg2 * local6;
		this.aFloat313 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "aj", descriptor = "(FFFF)V", line = 110)
	public void method29484(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat314 = arg0 * local6;
		this.aFloat315 = arg1 * local6;
		this.aFloat316 = arg2 * local6;
		this.aFloat313 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(FFF)V", line = 119)
	public void method29485(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29482(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class471 local7 = method29459();
		local7.method29482(1.0F, 0.0F, 0.0F, arg1);
		this.method29510(local7);
		local7.method29482(0.0F, 0.0F, 1.0F, arg2);
		this.method29510(local7);
		local7.method29467();
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "()V", line = 129)
	final void method29486() {
		this.aFloat316 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat314 = 0.0F;
		this.aFloat313 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ab", descriptor = "()V", line = 129)
	final void method29487() {
		this.aFloat316 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat314 = 0.0F;
		this.aFloat313 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "aa", descriptor = "()V", line = 129)
	final void method29488() {
		this.aFloat316 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat314 = 0.0F;
		this.aFloat313 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ay", descriptor = "()V", line = 129)
	final void method29489() {
		this.aFloat316 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat314 = 0.0F;
		this.aFloat313 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "az", descriptor = "()V", line = 129)
	final void method29490() {
		this.aFloat316 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat314 = 0.0F;
		this.aFloat313 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "()V", line = 136)
	final void method29491() {
		this.aFloat314 = -this.aFloat314;
		this.aFloat315 = -this.aFloat315;
		this.aFloat316 = -this.aFloat316;
		this.aFloat313 = -this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "()V", line = 143)
	public final void method29492() {
		this.aFloat314 = -this.aFloat314;
		this.aFloat315 = -this.aFloat315;
		this.aFloat316 = -this.aFloat316;
	}

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "(Lclient!ov;)Lclient!ov;", line = 149)
	public static final Class471 method29493(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29492();
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "af", descriptor = "(Lclient!ov;)Lclient!ov;", line = 149)
	public static final Class471 method29494(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29492();
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "()V", line = 155)
	public final void method29495() {
		@Pc(4) float local4 = 1.0F / method29505(this);
		this.aFloat314 *= local4;
		this.aFloat315 *= local4;
		this.aFloat316 *= local4;
		this.aFloat313 *= local4;
	}

	@OriginalMember(owner = "client!ov", name = "ak", descriptor = "()V", line = 155)
	public final void method29496() {
		@Pc(4) float local4 = 1.0F / method29505(this);
		this.aFloat314 *= local4;
		this.aFloat315 *= local4;
		this.aFloat316 *= local4;
		this.aFloat313 *= local4;
	}

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "(Lclient!ov;)V", line = 163)
	final void method29497(@OriginalArg(0) Class471 arg0) {
		this.aFloat314 += arg0.aFloat314;
		this.aFloat315 += arg0.aFloat315;
		this.aFloat316 += arg0.aFloat316;
		this.aFloat313 += arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "an", descriptor = "(Lclient!ov;)F", line = 170)
	final float method29498(@OriginalArg(0) Class471 arg0) {
		return this.aFloat314 * arg0.aFloat314 + this.aFloat315 * arg0.aFloat315 + this.aFloat316 * arg0.aFloat316 + this.aFloat313 * arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "bf", descriptor = "(Lclient!ov;)F", line = 170)
	final float method29499(@OriginalArg(0) Class471 arg0) {
		return this.aFloat314 * arg0.aFloat314 + this.aFloat315 * arg0.aFloat315 + this.aFloat316 * arg0.aFloat316 + this.aFloat313 * arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "bl", descriptor = "(Lclient!ov;)F", line = 170)
	final float method29500(@OriginalArg(0) Class471 arg0) {
		return this.aFloat314 * arg0.aFloat314 + this.aFloat315 * arg0.aFloat315 + this.aFloat316 * arg0.aFloat316 + this.aFloat313 * arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "(Lclient!ov;)F", line = 170)
	final float method29501(@OriginalArg(0) Class471 arg0) {
		return this.aFloat314 * arg0.aFloat314 + this.aFloat315 * arg0.aFloat315 + this.aFloat316 * arg0.aFloat316 + this.aFloat313 * arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "bh", descriptor = "(Lclient!ov;Lclient!ov;)F", line = 174)
	static final float method29502(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29501(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "(Lclient!ov;Lclient!ov;)F", line = 174)
	static final float method29503(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29501(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "bk", descriptor = "(Lclient!ov;Lclient!ov;)F", line = 174)
	static final float method29504(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29501(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!ov;)F", line = 178)
	static final float method29505(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29503(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bx", descriptor = "(Lclient!ov;)F", line = 178)
	static final float method29506(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29503(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bd", descriptor = "(Lclient!ov;)F", line = 178)
	static final float method29507(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29503(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bc", descriptor = "(Lclient!ov;)F", line = 178)
	static final float method29508(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29503(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bi", descriptor = "(Lclient!ov;)V", line = 182)
	public final void method29509(@OriginalArg(0) Class471 arg0) {
		this.method29473(arg0.aFloat313 * this.aFloat314 + arg0.aFloat314 * this.aFloat313 + arg0.aFloat315 * this.aFloat316 - arg0.aFloat316 * this.aFloat315, arg0.aFloat313 * this.aFloat315 - arg0.aFloat314 * this.aFloat316 + arg0.aFloat315 * this.aFloat313 + arg0.aFloat316 * this.aFloat314, arg0.aFloat313 * this.aFloat316 + arg0.aFloat314 * this.aFloat315 - arg0.aFloat315 * this.aFloat314 + arg0.aFloat316 * this.aFloat313, arg0.aFloat313 * this.aFloat313 - arg0.aFloat314 * this.aFloat314 - arg0.aFloat315 * this.aFloat315 - arg0.aFloat316 * this.aFloat316);
	}

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(Lclient!ov;)V", line = 182)
	public final void method29510(@OriginalArg(0) Class471 arg0) {
		this.method29473(arg0.aFloat313 * this.aFloat314 + arg0.aFloat314 * this.aFloat313 + arg0.aFloat315 * this.aFloat316 - arg0.aFloat316 * this.aFloat315, arg0.aFloat313 * this.aFloat315 - arg0.aFloat314 * this.aFloat316 + arg0.aFloat315 * this.aFloat313 + arg0.aFloat316 * this.aFloat314, arg0.aFloat313 * this.aFloat316 + arg0.aFloat314 * this.aFloat315 - arg0.aFloat315 * this.aFloat314 + arg0.aFloat316 * this.aFloat313, arg0.aFloat313 * this.aFloat313 - arg0.aFloat314 * this.aFloat314 - arg0.aFloat315 * this.aFloat315 - arg0.aFloat316 * this.aFloat316);
	}

	@OriginalMember(owner = "client!ov", name = "bn", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;", line = 186)
	static final Class471 method29511(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29510(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;", line = 186)
	static final Class471 method29512(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29510(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "bt", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;", line = 186)
	static final Class471 method29513(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29510(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "(F)V", line = 192)
	final void method29514(@OriginalArg(0) float arg0) {
		this.aFloat314 *= arg0;
		this.aFloat315 *= arg0;
		this.aFloat316 *= arg0;
		this.aFloat313 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "bm", descriptor = "(F)V", line = 192)
	final void method29515(@OriginalArg(0) float arg0) {
		this.aFloat314 *= arg0;
		this.aFloat315 *= arg0;
		this.aFloat316 *= arg0;
		this.aFloat313 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "bq", descriptor = "(F)V", line = 192)
	final void method29516(@OriginalArg(0) float arg0) {
		this.aFloat314 *= arg0;
		this.aFloat315 *= arg0;
		this.aFloat316 *= arg0;
		this.aFloat313 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "(Lclient!ov;F)Lclient!ov;", line = 199)
	static final Class471 method29517(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class471 local2 = method29466(arg0);
		local2.method29514(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "by", descriptor = "(Lclient!ov;F)V", line = 205)
	public final void method29518(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29501(arg0) < 0.0F) {
			this.method29491();
		}
		this.method29514(1.0F - arg1);
		@Pc(16) Class471 local16 = method29517(arg0, arg1);
		this.method29497(local16);
		local16.method29467();
		this.method29495();
	}

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "(Lclient!ov;F)V", line = 205)
	public final void method29519(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29501(arg0) < 0.0F) {
			this.method29491();
		}
		this.method29514(1.0F - arg1);
		@Pc(16) Class471 local16 = method29517(arg0, arg1);
		this.method29497(local16);
		local16.method29467();
		this.method29495();
	}

	@OriginalMember(owner = "client!ov", name = "be", descriptor = "(Lclient!ov;F)V", line = 205)
	public final void method29520(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29501(arg0) < 0.0F) {
			this.method29491();
		}
		this.method29514(1.0F - arg1);
		@Pc(16) Class471 local16 = method29517(arg0, arg1);
		this.method29497(local16);
		local16.method29467();
		this.method29495();
	}

	@OriginalMember(owner = "client!ov", name = "bb", descriptor = "(Lclient!ov;F)V", line = 205)
	public final void method29521(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29501(arg0) < 0.0F) {
			this.method29491();
		}
		this.method29514(1.0F - arg1);
		@Pc(16) Class471 local16 = method29517(arg0, arg1);
		this.method29497(local16);
		local16.method29467();
		this.method29495();
	}

	@OriginalMember(owner = "client!ov", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 214)
	public boolean method29522(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat314 == local14.aFloat314 && this.aFloat315 == local14.aFloat315 && this.aFloat316 == local14.aFloat316 && this.aFloat313 == local14.aFloat313;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 214)
	public boolean method29523(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat314 == local14.aFloat314 && this.aFloat315 == local14.aFloat315 && this.aFloat316 == local14.aFloat316 && this.aFloat313 == local14.aFloat313;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 214)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat314 == local14.aFloat314 && this.aFloat315 == local14.aFloat315 && this.aFloat316 == local14.aFloat316 && this.aFloat313 == local14.aFloat313;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 214)
	public boolean method29524(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat314 == local14.aFloat314 && this.aFloat315 == local14.aFloat315 && this.aFloat316 == local14.aFloat316 && this.aFloat313 == local14.aFloat313;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 214)
	public boolean method29525(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat314 == local14.aFloat314 && this.aFloat315 == local14.aFloat315 && this.aFloat316 == local14.aFloat316 && this.aFloat313 == local14.aFloat313;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "rj", descriptor = "()Ljava/lang/String;", line = 225)
	public String method29526() {
		return this.aFloat314 + "," + this.aFloat315 + "," + this.aFloat316 + "," + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "toString", descriptor = "()Ljava/lang/String;", line = 225)
	@Override
	public String toString() {
		return this.aFloat314 + "," + this.aFloat315 + "," + this.aFloat316 + "," + this.aFloat313;
	}
}
