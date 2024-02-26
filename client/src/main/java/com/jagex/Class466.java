package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class466 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	static int anInt4939;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	static int anInt4940;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[Lclient!oq;")
	static Class466[] aClass466Array1 = new Class466[0];

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "F")
	public float aFloat298;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "F")
	public float aFloat299;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "F")
	public float aFloat300;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "F")
	public float aFloat301;

	static {
		new Class466();
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "()Lclient!oq;")
	public static Class466 method29640() {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466();
			} else {
				aClass466Array1[--anInt4940].method29651();
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29641(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "(Lclient!oq;)Lclient!oq;")
	public static Class466 method29642(@OriginalArg(0) Class466 arg0) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0);
			} else {
				aClass466Array1[--anInt4940].method29647(arg0);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "ai", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29646(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "ao", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29649(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(Lclient!oq;Lclient!oq;)F")
	static float method29655(@OriginalArg(0) Class466 arg0, @OriginalArg(1) Class466 arg1) {
		return arg0.method29657(arg1);
	}

	@OriginalMember(owner = "client!oq", name = "aq", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29658(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "bb", descriptor = "(Lclient!oq;Lclient!oq;)Lclient!oq;")
	static Class466 method29661(@OriginalArg(0) Class466 arg0, @OriginalArg(1) Class466 arg1) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29660(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "(Lclient!oq;F)Lclient!oq;")
	static Class466 method29663(@OriginalArg(0) Class466 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29662(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "(Lclient!oq;Lclient!oq;)Lclient!oq;")
	static Class466 method29665(@OriginalArg(0) Class466 arg0, @OriginalArg(1) Class466 arg1) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29660(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "bh", descriptor = "(Lclient!oq;Lclient!oq;)F")
	static float method29667(@OriginalArg(0) Class466 arg0, @OriginalArg(1) Class466 arg1) {
		return arg0.method29657(arg1);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public static void method29669(@OriginalArg(0) int arg0) {
		anInt4939 = arg0;
		aClass466Array1 = new Class466[arg0];
		anInt4940 = 0;
	}

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "(I)V")
	public static void method29670(@OriginalArg(0) int arg0) {
		anInt4939 = arg0;
		aClass466Array1 = new Class466[arg0];
		anInt4940 = 0;
	}

	@OriginalMember(owner = "client!oq", name = "ay", descriptor = "()Lclient!oq;")
	public static Class466 method29671() {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466();
			} else {
				aClass466Array1[--anInt4940].method29651();
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "ac", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "bn", descriptor = "(Lclient!oq;)Lclient!oq;")
	public static Class466 method29673(@OriginalArg(0) Class466 arg0) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29701();
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "aj", descriptor = "(FFFF)Lclient!oq;")
	static Class466 method29674(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0, arg1, arg2, arg3);
			} else {
				aClass466Array1[--anInt4940].method29704(arg0, arg1, arg2, arg3);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "ag", descriptor = "(Lclient!oq;)Lclient!oq;")
	public static Class466 method29676(@OriginalArg(0) Class466 arg0) {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 == 0) {
				return new Class466(arg0);
			} else {
				aClass466Array1[--anInt4940].method29647(arg0);
				return aClass466Array1[anInt4940];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "bv", descriptor = "(Lclient!oq;)F")
	static float method29681(@OriginalArg(0) Class466 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "(Lclient!oq;)Lclient!oq;")
	public static Class466 method29687(@OriginalArg(0) Class466 arg0) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29701();
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "(Lclient!oq;)F")
	static float method29694(@OriginalArg(0) Class466 arg0) {
		return (float) Math.sqrt((double) method29655(arg0, arg0));
	}

	@OriginalMember(owner = "client!oq", name = "ax", descriptor = "(I)V")
	public static void method29705(@OriginalArg(0) int arg0) {
		anInt4939 = arg0;
		aClass466Array1 = new Class466[arg0];
		anInt4940 = 0;
	}

	@OriginalMember(owner = "client!oq", name = "be", descriptor = "(Lclient!oq;Lclient!oq;)F")
	static float method29706(@OriginalArg(0) Class466 arg0, @OriginalArg(1) Class466 arg1) {
		return arg0.method29657(arg1);
	}

	@OriginalMember(owner = "client!oq", name = "bf", descriptor = "(Lclient!oq;F)Lclient!oq;")
	static Class466 method29713(@OriginalArg(0) Class466 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class466 local2 = method29642(arg0);
		local2.method29662(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(FFFF)V")
	public Class466(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29704(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!oq;)V")
	public Class466(@OriginalArg(0) Class466 arg0) {
		this.method29647(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(FFF)V")
	public Class466(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29650(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class466(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(256210006);
		this.aFloat299 = arg0.method23188(-1256339708);
		this.aFloat300 = arg0.method23188(731661616);
		this.aFloat298 = arg0.method23188(-1246470372);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class466() {
		this.method29651();
	}

	@OriginalMember(owner = "client!oq", name = "bk", descriptor = "(Lclient!oq;)F")
	float method29639(@OriginalArg(0) Class466 arg0) {
		return this.aFloat301 * arg0.aFloat301 + this.aFloat299 * arg0.aFloat299 + this.aFloat300 * arg0.aFloat300 + this.aFloat298 * arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "()V")
	public void method29643() {
		@Pc(2) Class466[] local2 = aClass466Array1;
		synchronized (aClass466Array1) {
			if (anInt4940 < anInt4939 - 1) {
				aClass466Array1[anInt4940++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "(Lclient!ald;)V")
	public void method29644(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(1972988709);
		this.aFloat299 = arg0.method23188(1473725493);
		this.aFloat300 = arg0.method23188(-1844734444);
		this.aFloat298 = arg0.method23188(2060543039);
	}

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "(FFFF)V")
	public void method29645(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat301 = arg0 * local6;
		this.aFloat299 = arg1 * local6;
		this.aFloat300 = arg2 * local6;
		this.aFloat298 = local13;
	}

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "(Lclient!oq;)V")
	public void method29647(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 = arg0.aFloat301;
		this.aFloat299 = arg0.aFloat299;
		this.aFloat300 = arg0.aFloat300;
		this.aFloat298 = arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "(Lclient!on;F)V")
	public void method29648(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29645(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(FFF)V")
	public void method29650(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29645(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class466 local7 = method29640();
		local7.method29645(1.0F, 0.0F, 0.0F, arg1);
		this.method29660(local7);
		local7.method29645(0.0F, 0.0F, 1.0F, arg2);
		this.method29660(local7);
		local7.method29643();
	}

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "()V")
	void method29651() {
		this.aFloat300 = 0.0F;
		this.aFloat299 = 0.0F;
		this.aFloat301 = 0.0F;
		this.aFloat298 = 1.0F;
	}

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "()V")
	void method29652() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
		this.aFloat298 = -this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "am", descriptor = "(FFFF)V")
	void method29653(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat299 = arg1;
		this.aFloat300 = arg2;
		this.aFloat298 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "bs", descriptor = "(Lclient!oq;)V")
	void method29654(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 += arg0.aFloat301;
		this.aFloat299 += arg0.aFloat299;
		this.aFloat300 += arg0.aFloat300;
		this.aFloat298 += arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "(Lclient!oq;)V")
	void method29656(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 += arg0.aFloat301;
		this.aFloat299 += arg0.aFloat299;
		this.aFloat300 += arg0.aFloat300;
		this.aFloat298 += arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "(Lclient!oq;)F")
	float method29657(@OriginalArg(0) Class466 arg0) {
		return this.aFloat301 * arg0.aFloat301 + this.aFloat299 * arg0.aFloat299 + this.aFloat300 * arg0.aFloat300 + this.aFloat298 * arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "bz", descriptor = "(Lclient!oq;)F")
	float method29659(@OriginalArg(0) Class466 arg0) {
		return this.aFloat301 * arg0.aFloat301 + this.aFloat299 * arg0.aFloat299 + this.aFloat300 * arg0.aFloat300 + this.aFloat298 * arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "(Lclient!oq;)V")
	public void method29660(@OriginalArg(0) Class466 arg0) {
		this.method29704(arg0.aFloat298 * this.aFloat301 + arg0.aFloat301 * this.aFloat298 + arg0.aFloat299 * this.aFloat300 - arg0.aFloat300 * this.aFloat299, arg0.aFloat298 * this.aFloat299 - arg0.aFloat301 * this.aFloat300 + arg0.aFloat299 * this.aFloat298 + arg0.aFloat300 * this.aFloat301, arg0.aFloat298 * this.aFloat300 + arg0.aFloat301 * this.aFloat299 - arg0.aFloat299 * this.aFloat301 + arg0.aFloat300 * this.aFloat298, arg0.aFloat298 * this.aFloat298 - arg0.aFloat301 * this.aFloat301 - arg0.aFloat299 * this.aFloat299 - arg0.aFloat300 * this.aFloat300);
	}

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "(F)V")
	void method29662(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat298 *= arg0;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(Lclient!oq;F)V")
	public void method29664(@OriginalArg(0) Class466 arg0, @OriginalArg(1) float arg1) {
		if (this.method29657(arg0) < 0.0F) {
			this.method29652();
		}
		this.method29662(1.0F - arg1);
		@Pc(16) Class466 local16 = method29663(arg0, arg1);
		this.method29656(local16);
		local16.method29643();
		this.method29710();
	}

	@OriginalMember(owner = "client!oq", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class466) {
			@Pc(14) Class466 local14 = (Class466) arg0;
			return this.aFloat301 == local14.aFloat301 && this.aFloat299 == local14.aFloat299 && this.aFloat300 == local14.aFloat300 && this.aFloat298 == local14.aFloat298;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method29666() {
		return this.aFloat301 + "," + this.aFloat299 + "," + this.aFloat300 + "," + this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat301 + "," + this.aFloat299 + "," + this.aFloat300 + "," + this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "aw", descriptor = "()V")
	void method29668() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
		this.aFloat298 = -this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "aa", descriptor = "(Lclient!on;F)V")
	public void method29675(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29645(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "ab", descriptor = "(Lclient!ald;)V")
	public void method29677(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(-1357924127);
		this.aFloat299 = arg0.method23188(839201427);
		this.aFloat300 = arg0.method23188(520001663);
		this.aFloat298 = arg0.method23188(2113074563);
	}

	@OriginalMember(owner = "client!oq", name = "al", descriptor = "(Lclient!ald;)V")
	public void method29678(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(-787858431);
		this.aFloat299 = arg0.method23188(824990952);
		this.aFloat300 = arg0.method23188(1929924012);
		this.aFloat298 = arg0.method23188(1512108470);
	}

	@OriginalMember(owner = "client!oq", name = "ah", descriptor = "(Lclient!ald;)V")
	public void method29679(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(-391676665);
		this.aFloat299 = arg0.method23188(1138224779);
		this.aFloat300 = arg0.method23188(1344205287);
		this.aFloat298 = arg0.method23188(-1570434757);
	}

	@OriginalMember(owner = "client!oq", name = "af", descriptor = "(Lclient!ald;)V")
	public void method29680(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat301 = arg0.method23188(-1538793336);
		this.aFloat299 = arg0.method23188(-718342811);
		this.aFloat300 = arg0.method23188(-519942513);
		this.aFloat298 = arg0.method23188(-369719296);
	}

	@OriginalMember(owner = "client!oq", name = "ak", descriptor = "(FFFF)V")
	void method29682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat299 = arg1;
		this.aFloat300 = arg2;
		this.aFloat298 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "at", descriptor = "(Lclient!oq;)V")
	public void method29683(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 = arg0.aFloat301;
		this.aFloat299 = arg0.aFloat299;
		this.aFloat300 = arg0.aFloat300;
		this.aFloat298 = arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "ad", descriptor = "(Lclient!oq;)V")
	public void method29684(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 = arg0.aFloat301;
		this.aFloat299 = arg0.aFloat299;
		this.aFloat300 = arg0.aFloat300;
		this.aFloat298 = arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "av", descriptor = "(Lclient!oq;)V")
	public void method29685(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 = arg0.aFloat301;
		this.aFloat299 = arg0.aFloat299;
		this.aFloat300 = arg0.aFloat300;
		this.aFloat298 = arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "an", descriptor = "(Lclient!oq;)V")
	public void method29686(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 = arg0.aFloat301;
		this.aFloat299 = arg0.aFloat299;
		this.aFloat300 = arg0.aFloat300;
		this.aFloat298 = arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "ae", descriptor = "(Lclient!on;F)V")
	public void method29688(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29645(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "ap", descriptor = "(Lclient!on;F)V")
	public void method29689(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29645(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296, arg1);
	}

	@OriginalMember(owner = "client!oq", name = "ar", descriptor = "(FFFF)V")
	public void method29690(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat301 = arg0 * local6;
		this.aFloat299 = arg1 * local6;
		this.aFloat300 = arg2 * local6;
		this.aFloat298 = local13;
	}

	@OriginalMember(owner = "client!oq", name = "au", descriptor = "(FFF)V")
	public void method29691(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29645(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class466 local7 = method29640();
		local7.method29645(1.0F, 0.0F, 0.0F, arg1);
		this.method29660(local7);
		local7.method29645(0.0F, 0.0F, 1.0F, arg2);
		this.method29660(local7);
		local7.method29643();
	}

	@OriginalMember(owner = "client!oq", name = "az", descriptor = "(FFF)V")
	public void method29692(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29645(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class466 local7 = method29640();
		local7.method29645(1.0F, 0.0F, 0.0F, arg1);
		this.method29660(local7);
		local7.method29645(0.0F, 0.0F, 1.0F, arg2);
		this.method29660(local7);
		local7.method29643();
	}

	@OriginalMember(owner = "client!oq", name = "as", descriptor = "()V")
	void method29693() {
		this.aFloat300 = 0.0F;
		this.aFloat299 = 0.0F;
		this.aFloat301 = 0.0F;
		this.aFloat298 = 1.0F;
	}

	@OriginalMember(owner = "client!oq", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method29695() {
		return this.aFloat301 + "," + this.aFloat299 + "," + this.aFloat300 + "," + this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "bl", descriptor = "()V")
	public void method29696() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
	}

	@OriginalMember(owner = "client!oq", name = "br", descriptor = "()V")
	public void method29697() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
	}

	@OriginalMember(owner = "client!oq", name = "bg", descriptor = "()V")
	void method29698() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
		this.aFloat298 = -this.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "ba", descriptor = "()V")
	public void method29699() {
		@Pc(4) float local4 = 1.0F / method29694(this);
		this.aFloat301 *= local4;
		this.aFloat299 *= local4;
		this.aFloat300 *= local4;
		this.aFloat298 *= local4;
	}

	@OriginalMember(owner = "client!oq", name = "bt", descriptor = "()V")
	public void method29700() {
		@Pc(4) float local4 = 1.0F / method29694(this);
		this.aFloat301 *= local4;
		this.aFloat299 *= local4;
		this.aFloat300 *= local4;
		this.aFloat298 *= local4;
	}

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "()V")
	public void method29701() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat299 = -this.aFloat299;
		this.aFloat300 = -this.aFloat300;
	}

	@OriginalMember(owner = "client!oq", name = "bj", descriptor = "(Lclient!oq;)V")
	void method29702(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 += arg0.aFloat301;
		this.aFloat299 += arg0.aFloat299;
		this.aFloat300 += arg0.aFloat300;
		this.aFloat298 += arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "by", descriptor = "(Lclient!oq;)V")
	void method29703(@OriginalArg(0) Class466 arg0) {
		this.aFloat301 += arg0.aFloat301;
		this.aFloat299 += arg0.aFloat299;
		this.aFloat300 += arg0.aFloat300;
		this.aFloat298 += arg0.aFloat298;
	}

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "(FFFF)V")
	void method29704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat299 = arg1;
		this.aFloat300 = arg2;
		this.aFloat298 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29707(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class466) {
			@Pc(14) Class466 local14 = (Class466) arg0;
			return this.aFloat301 == local14.aFloat301 && this.aFloat299 == local14.aFloat299 && this.aFloat300 == local14.aFloat300 && this.aFloat298 == local14.aFloat298;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "bc", descriptor = "(F)V")
	void method29708(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat298 *= arg0;
	}

	@OriginalMember(owner = "client!oq", name = "bp", descriptor = "(Lclient!oq;)V")
	public void method29709(@OriginalArg(0) Class466 arg0) {
		this.method29704(arg0.aFloat298 * this.aFloat301 + arg0.aFloat301 * this.aFloat298 + arg0.aFloat299 * this.aFloat300 - arg0.aFloat300 * this.aFloat299, arg0.aFloat298 * this.aFloat299 - arg0.aFloat301 * this.aFloat300 + arg0.aFloat299 * this.aFloat298 + arg0.aFloat300 * this.aFloat301, arg0.aFloat298 * this.aFloat300 + arg0.aFloat301 * this.aFloat299 - arg0.aFloat299 * this.aFloat301 + arg0.aFloat300 * this.aFloat298, arg0.aFloat298 * this.aFloat298 - arg0.aFloat301 * this.aFloat301 - arg0.aFloat299 * this.aFloat299 - arg0.aFloat300 * this.aFloat300);
	}

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "()V")
	public void method29710() {
		@Pc(4) float local4 = 1.0F / method29694(this);
		this.aFloat301 *= local4;
		this.aFloat299 *= local4;
		this.aFloat300 *= local4;
		this.aFloat298 *= local4;
	}

	@OriginalMember(owner = "client!oq", name = "bo", descriptor = "(F)V")
	void method29711(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat298 *= arg0;
	}

	@OriginalMember(owner = "client!oq", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29712(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class466) {
			@Pc(14) Class466 local14 = (Class466) arg0;
			return this.aFloat301 == local14.aFloat301 && this.aFloat299 == local14.aFloat299 && this.aFloat300 == local14.aFloat300 && this.aFloat298 == local14.aFloat298;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "bw", descriptor = "(Lclient!oq;F)V")
	public void method29714(@OriginalArg(0) Class466 arg0, @OriginalArg(1) float arg1) {
		if (this.method29657(arg0) < 0.0F) {
			this.method29652();
		}
		this.method29662(1.0F - arg1);
		@Pc(16) Class466 local16 = method29663(arg0, arg1);
		this.method29656(local16);
		local16.method29643();
		this.method29710();
	}
}
