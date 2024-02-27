package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class471 {

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
	static int anInt5282;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
	static int anInt5283;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "[Lclient!ov;")
	static Class471[] aClass471Array1 = new Class471[0];

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "F")
	public float aFloat321;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "F")
	public float aFloat322;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "F")
	public float aFloat323;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "F")
	public float aFloat324;

	static {
		new Class471();
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V")
	public static void method29639(@OriginalArg(0) int arg0) {
		anInt5283 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5282 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "bn", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;")
	static Class471 method29641(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29657(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "bh", descriptor = "(Lclient!ov;Lclient!ov;)F")
	static float method29642(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29707(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "(FFFF)Lclient!ov;")
	static Class471 method29644(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5282].method29681(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "(Lclient!ov;)Lclient!ov;")
	public static Class471 method29652(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29651();
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "(Lclient!ov;Lclient!ov;)F")
	static float method29655(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29707(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;")
	static Class471 method29658(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29657(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "(Lclient!ov;F)Lclient!ov;")
	static Class471 method29660(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29659(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "ac", descriptor = "(FFFF)Lclient!ov;")
	static Class471 method29663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5282].method29681(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "(I)V")
	public static void method29668(@OriginalArg(0) int arg0) {
		anInt5283 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5282 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "ae", descriptor = "(I)V")
	public static void method29669(@OriginalArg(0) int arg0) {
		anInt5283 = arg0;
		aClass471Array1 = new Class471[arg0];
		anInt5282 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "bk", descriptor = "(Lclient!ov;Lclient!ov;)F")
	static float method29671(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		return arg0.method29707(arg1);
	}

	@OriginalMember(owner = "client!ov", name = "al", descriptor = "(FFFF)Lclient!ov;")
	static Class471 method29672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5282].method29681(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "ai", descriptor = "(Lclient!ov;)Lclient!ov;")
	public static Class471 method29674(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5282].method29645(arg0);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "aw", descriptor = "(Lclient!ov;)Lclient!ov;")
	public static Class471 method29675(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5282].method29645(arg0);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "(Lclient!ov;)Lclient!ov;")
	public static Class471 method29676(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0);
			} else {
				aClass471Array1[--anInt5282].method29645(arg0);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!ov;)F")
	static float method29679(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "ag", descriptor = "()Lclient!ov;")
	public static Class471 method29689() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471();
			} else {
				aClass471Array1[--anInt5282].method29649();
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "bt", descriptor = "(Lclient!ov;Lclient!ov;)Lclient!ov;")
	static Class471 method29691(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29657(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "af", descriptor = "(Lclient!ov;)Lclient!ov;")
	public static Class471 method29692(@OriginalArg(0) Class471 arg0) {
		@Pc(2) Class471 local2 = method29676(arg0);
		local2.method29651();
		return local2;
	}

	@OriginalMember(owner = "client!ov", name = "ah", descriptor = "(FFFF)Lclient!ov;")
	static Class471 method29698(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471(arg0, arg1, arg2, arg3);
			} else {
				aClass471Array1[--anInt5282].method29681(arg0, arg1, arg2, arg3);
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "bx", descriptor = "(Lclient!ov;)F")
	static float method29699(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bd", descriptor = "(Lclient!ov;)F")
	static float method29700(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "bc", descriptor = "(Lclient!ov;)F")
	static float method29701(@OriginalArg(0) Class471 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "()Lclient!ov;")
	public static Class471 method29702() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 == 0) {
				return new Class471();
			} else {
				aClass471Array1[--anInt5282].method29649();
				return aClass471Array1[anInt5282];
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(FFFF)V")
	public Class471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29681(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ov;)V")
	public Class471(@OriginalArg(0) Class471 arg0) {
		this.method29645(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class471(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat322 = arg0.method22437(522616148);
		this.aFloat323 = arg0.method22437(336593502);
		this.aFloat324 = arg0.method22437(2143343225);
		this.aFloat321 = arg0.method22437(980950686);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class471() {
		this.method29649();
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(FFF)V")
	public Class471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29648(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ov", name = "bi", descriptor = "(Lclient!ov;)V")
	public void method29636(@OriginalArg(0) Class471 arg0) {
		this.method29681(arg0.aFloat321 * this.aFloat322 + arg0.aFloat322 * this.aFloat321 + arg0.aFloat323 * this.aFloat324 - arg0.aFloat324 * this.aFloat323, arg0.aFloat321 * this.aFloat323 - arg0.aFloat322 * this.aFloat324 + arg0.aFloat323 * this.aFloat321 + arg0.aFloat324 * this.aFloat322, arg0.aFloat321 * this.aFloat324 + arg0.aFloat322 * this.aFloat323 - arg0.aFloat323 * this.aFloat322 + arg0.aFloat324 * this.aFloat321, arg0.aFloat321 * this.aFloat321 - arg0.aFloat322 * this.aFloat322 - arg0.aFloat323 * this.aFloat323 - arg0.aFloat324 * this.aFloat324);
	}

	@OriginalMember(owner = "client!ov", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29637(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat322 == local14.aFloat322 && this.aFloat323 == local14.aFloat323 && this.aFloat324 == local14.aFloat324 && this.aFloat321 == local14.aFloat321;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29638(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat322 == local14.aFloat322 && this.aFloat323 == local14.aFloat323 && this.aFloat324 == local14.aFloat324 && this.aFloat321 == local14.aFloat321;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "()V")
	public void method29640() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 < anInt5283 - 1) {
				aClass471Array1[anInt5282++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "(Lclient!alw;)V")
	public void method29643(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat322 = arg0.method22437(-946565270);
		this.aFloat323 = arg0.method22437(-696310795);
		this.aFloat324 = arg0.method22437(-2086329748);
		this.aFloat321 = arg0.method22437(1876032031);
	}

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "(Lclient!ov;)V")
	public void method29645(@OriginalArg(0) Class471 arg0) {
		this.aFloat322 = arg0.aFloat322;
		this.aFloat323 = arg0.aFloat323;
		this.aFloat324 = arg0.aFloat324;
		this.aFloat321 = arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "(Lclient!ox;F)V")
	public void method29646(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29647(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "(FFFF)V")
	public void method29647(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat322 = arg0 * local6;
		this.aFloat323 = arg1 * local6;
		this.aFloat324 = arg2 * local6;
		this.aFloat321 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(FFF)V")
	public void method29648(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29647(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class471 local7 = method29702();
		local7.method29647(1.0F, 0.0F, 0.0F, arg1);
		this.method29657(local7);
		local7.method29647(0.0F, 0.0F, 1.0F, arg2);
		this.method29657(local7);
		local7.method29640();
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "()V")
	void method29649() {
		this.aFloat324 = 0.0F;
		this.aFloat323 = 0.0F;
		this.aFloat322 = 0.0F;
		this.aFloat321 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "()V")
	void method29650() {
		this.aFloat322 = -this.aFloat322;
		this.aFloat323 = -this.aFloat323;
		this.aFloat324 = -this.aFloat324;
		this.aFloat321 = -this.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "()V")
	public void method29651() {
		this.aFloat322 = -this.aFloat322;
		this.aFloat323 = -this.aFloat323;
		this.aFloat324 = -this.aFloat324;
	}

	@OriginalMember(owner = "client!ov", name = "as", descriptor = "()V")
	public void method29653() {
		@Pc(2) Class471[] local2 = aClass471Array1;
		synchronized (aClass471Array1) {
			if (anInt5282 < anInt5283 - 1) {
				aClass471Array1[anInt5282++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "by", descriptor = "(Lclient!ov;F)V")
	public void method29654(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29707(arg0) < 0.0F) {
			this.method29650();
		}
		this.method29659(1.0F - arg1);
		@Pc(16) Class471 local16 = method29660(arg0, arg1);
		this.method29704(local16);
		local16.method29640();
		this.method29680();
	}

	@OriginalMember(owner = "client!ov", name = "ab", descriptor = "()V")
	void method29656() {
		this.aFloat324 = 0.0F;
		this.aFloat323 = 0.0F;
		this.aFloat322 = 0.0F;
		this.aFloat321 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(Lclient!ov;)V")
	public void method29657(@OriginalArg(0) Class471 arg0) {
		this.method29681(arg0.aFloat321 * this.aFloat322 + arg0.aFloat322 * this.aFloat321 + arg0.aFloat323 * this.aFloat324 - arg0.aFloat324 * this.aFloat323, arg0.aFloat321 * this.aFloat323 - arg0.aFloat322 * this.aFloat324 + arg0.aFloat323 * this.aFloat321 + arg0.aFloat324 * this.aFloat322, arg0.aFloat321 * this.aFloat324 + arg0.aFloat322 * this.aFloat323 - arg0.aFloat323 * this.aFloat322 + arg0.aFloat324 * this.aFloat321, arg0.aFloat321 * this.aFloat321 - arg0.aFloat322 * this.aFloat322 - arg0.aFloat323 * this.aFloat323 - arg0.aFloat324 * this.aFloat324);
	}

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "(F)V")
	void method29659(@OriginalArg(0) float arg0) {
		this.aFloat322 *= arg0;
		this.aFloat323 *= arg0;
		this.aFloat324 *= arg0;
		this.aFloat321 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "(Lclient!ov;F)V")
	public void method29661(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29707(arg0) < 0.0F) {
			this.method29650();
		}
		this.method29659(1.0F - arg1);
		@Pc(16) Class471 local16 = method29660(arg0, arg1);
		this.method29704(local16);
		local16.method29640();
		this.method29680();
	}

	@OriginalMember(owner = "client!ov", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat322 == local14.aFloat322 && this.aFloat323 == local14.aFloat323 && this.aFloat324 == local14.aFloat324 && this.aFloat321 == local14.aFloat321;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "am", descriptor = "(FFFF)V")
	void method29662(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat322 = arg0;
		this.aFloat323 = arg1;
		this.aFloat324 = arg2;
		this.aFloat321 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29664(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat322 == local14.aFloat322 && this.aFloat323 == local14.aFloat323 && this.aFloat324 == local14.aFloat324 && this.aFloat321 == local14.aFloat321;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29665(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class471) {
			@Pc(14) Class471 local14 = (Class471) arg0;
			return this.aFloat322 == local14.aFloat322 && this.aFloat323 == local14.aFloat323 && this.aFloat324 == local14.aFloat324 && this.aFloat321 == local14.aFloat321;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "aa", descriptor = "()V")
	void method29666() {
		this.aFloat324 = 0.0F;
		this.aFloat323 = 0.0F;
		this.aFloat322 = 0.0F;
		this.aFloat321 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method29667() {
		return this.aFloat322 + "," + this.aFloat323 + "," + this.aFloat324 + "," + this.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "ax", descriptor = "(Lclient!ox;F)V")
	public void method29670(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29647(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "bm", descriptor = "(F)V")
	void method29673(@OriginalArg(0) float arg0) {
		this.aFloat322 *= arg0;
		this.aFloat323 *= arg0;
		this.aFloat324 *= arg0;
		this.aFloat321 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "at", descriptor = "(Lclient!alw;)V")
	public void method29677(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat322 = arg0.method22437(1506873212);
		this.aFloat323 = arg0.method22437(-2009945152);
		this.aFloat324 = arg0.method22437(-1637944607);
		this.aFloat321 = arg0.method22437(-1436019866);
	}

	@OriginalMember(owner = "client!ov", name = "ad", descriptor = "(Lclient!alw;)V")
	public void method29678(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat322 = arg0.method22437(-150070086);
		this.aFloat323 = arg0.method22437(-2011084379);
		this.aFloat324 = arg0.method22437(95114639);
		this.aFloat321 = arg0.method22437(-1230511073);
	}

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "()V")
	public void method29680() {
		@Pc(4) float local4 = 1.0F / method29679(this);
		this.aFloat322 *= local4;
		this.aFloat323 *= local4;
		this.aFloat324 *= local4;
		this.aFloat321 *= local4;
	}

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "(FFFF)V")
	void method29681(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat322 = arg0;
		this.aFloat323 = arg1;
		this.aFloat324 = arg2;
		this.aFloat321 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "ap", descriptor = "(FFFF)V")
	void method29682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat322 = arg0;
		this.aFloat323 = arg1;
		this.aFloat324 = arg2;
		this.aFloat321 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "aq", descriptor = "(Lclient!ox;F)V")
	public void method29683(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29647(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "au", descriptor = "(FFFF)V")
	void method29684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat322 = arg0;
		this.aFloat323 = arg1;
		this.aFloat324 = arg2;
		this.aFloat321 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "av", descriptor = "(Lclient!ox;F)V")
	public void method29685(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29647(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "ao", descriptor = "(FFFF)V")
	public void method29686(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat322 = arg0 * local6;
		this.aFloat323 = arg1 * local6;
		this.aFloat324 = arg2 * local6;
		this.aFloat321 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "aj", descriptor = "(FFFF)V")
	public void method29687(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat322 = arg0 * local6;
		this.aFloat323 = arg1 * local6;
		this.aFloat324 = arg2 * local6;
		this.aFloat321 = local13;
	}

	@OriginalMember(owner = "client!ov", name = "ay", descriptor = "()V")
	void method29688() {
		this.aFloat324 = 0.0F;
		this.aFloat323 = 0.0F;
		this.aFloat322 = 0.0F;
		this.aFloat321 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "az", descriptor = "()V")
	void method29690() {
		this.aFloat324 = 0.0F;
		this.aFloat323 = 0.0F;
		this.aFloat322 = 0.0F;
		this.aFloat321 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ak", descriptor = "()V")
	public void method29693() {
		@Pc(4) float local4 = 1.0F / method29679(this);
		this.aFloat322 *= local4;
		this.aFloat323 *= local4;
		this.aFloat324 *= local4;
		this.aFloat321 *= local4;
	}

	@OriginalMember(owner = "client!ov", name = "an", descriptor = "(Lclient!ov;)F")
	float method29694(@OriginalArg(0) Class471 arg0) {
		return this.aFloat322 * arg0.aFloat322 + this.aFloat323 * arg0.aFloat323 + this.aFloat324 * arg0.aFloat324 + this.aFloat321 * arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "bf", descriptor = "(Lclient!ov;)F")
	float method29695(@OriginalArg(0) Class471 arg0) {
		return this.aFloat322 * arg0.aFloat322 + this.aFloat323 * arg0.aFloat323 + this.aFloat324 * arg0.aFloat324 + this.aFloat321 * arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "bl", descriptor = "(Lclient!ov;)F")
	float method29696(@OriginalArg(0) Class471 arg0) {
		return this.aFloat322 * arg0.aFloat322 + this.aFloat323 * arg0.aFloat323 + this.aFloat324 * arg0.aFloat324 + this.aFloat321 * arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "be", descriptor = "(Lclient!ov;F)V")
	public void method29697(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29707(arg0) < 0.0F) {
			this.method29650();
		}
		this.method29659(1.0F - arg1);
		@Pc(16) Class471 local16 = method29660(arg0, arg1);
		this.method29704(local16);
		local16.method29640();
		this.method29680();
	}

	@OriginalMember(owner = "client!ov", name = "ar", descriptor = "(FFFF)V")
	void method29703(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat322 = arg0;
		this.aFloat323 = arg1;
		this.aFloat324 = arg2;
		this.aFloat321 = arg3;
	}

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "(Lclient!ov;)V")
	void method29704(@OriginalArg(0) Class471 arg0) {
		this.aFloat322 += arg0.aFloat322;
		this.aFloat323 += arg0.aFloat323;
		this.aFloat324 += arg0.aFloat324;
		this.aFloat321 += arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "bq", descriptor = "(F)V")
	void method29705(@OriginalArg(0) float arg0) {
		this.aFloat322 *= arg0;
		this.aFloat323 *= arg0;
		this.aFloat324 *= arg0;
		this.aFloat321 *= arg0;
	}

	@OriginalMember(owner = "client!ov", name = "bb", descriptor = "(Lclient!ov;F)V")
	public void method29706(@OriginalArg(0) Class471 arg0, @OriginalArg(1) float arg1) {
		if (this.method29707(arg0) < 0.0F) {
			this.method29650();
		}
		this.method29659(1.0F - arg1);
		@Pc(16) Class471 local16 = method29660(arg0, arg1);
		this.method29704(local16);
		local16.method29640();
		this.method29680();
	}

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "(Lclient!ov;)F")
	float method29707(@OriginalArg(0) Class471 arg0) {
		return this.aFloat322 * arg0.aFloat322 + this.aFloat323 * arg0.aFloat323 + this.aFloat324 * arg0.aFloat324 + this.aFloat321 * arg0.aFloat321;
	}

	@OriginalMember(owner = "client!ov", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat322 + "," + this.aFloat323 + "," + this.aFloat324 + "," + this.aFloat321;
	}
}
