package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class463 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	static int anInt4935;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	static int anInt4936;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "[Lclient!on;")
	static Class463[] aClass463Array1;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "F")
	public float aFloat297;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "F")
	public float aFloat295;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "F")
	public float aFloat296;

	static {
		new Class463(0.0F, 0.0F, 0.0F);
		new Class463(1.0F, 1.0F, 1.0F);
		aClass463Array1 = new Class463[0];
	}

	@OriginalMember(owner = "client!on", name = "bx", descriptor = "(Lclient!on;Lclient!on;)F")
	public static float method29469(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		return arg0.method29492(arg1);
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "()Lclient!on;")
	public static Class463 method29470() {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463();
			} else {
				aClass463Array1[--anInt4936].method29575();
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "u", descriptor = "(Lclient!on;)Lclient!on;")
	public static Class463 method29472(@OriginalArg(0) Class463 arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29478(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "r", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29485(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29483(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "h", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29487(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29486(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "v", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29491(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29559(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "ct", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29495(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29559(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "z", descriptor = "(Lclient!on;Lclient!on;)F")
	public static float method29498(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		return arg0.method29492(arg1);
	}

	@OriginalMember(owner = "client!on", name = "cp", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29501(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "al", descriptor = "()Lclient!on;")
	public static Class463 method29506() {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463();
			} else {
				aClass463Array1[--anInt4936].method29575();
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "ah", descriptor = "()Lclient!on;")
	public static Class463 method29507() {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463();
			} else {
				aClass463Array1[--anInt4936].method29575();
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "af", descriptor = "()Lclient!on;")
	public static Class463 method29508() {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463();
			} else {
				aClass463Array1[--anInt4936].method29575();
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "am", descriptor = "(FFF)Lclient!on;")
	public static Class463 method29509(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0, arg1, arg2);
			} else {
				aClass463Array1[--anInt4936].method29477(arg0, arg1, arg2);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "bv", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29510(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29486(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "at", descriptor = "(FFF)Lclient!on;")
	public static Class463 method29511(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0, arg1, arg2);
			} else {
				aClass463Array1[--anInt4936].method29477(arg0, arg1, arg2);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "ad", descriptor = "(Lclient!on;)Lclient!on;")
	public static Class463 method29512(@OriginalArg(0) Class463 arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29478(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29514(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29494(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "aa", descriptor = "(Lclient!ald;)Lclient!on;")
	public static Class463 method29515(@OriginalArg(0) Packet arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29476(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "cm", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29522(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "av", descriptor = "(Lclient!on;)Lclient!on;")
	public static Class463 method29523(@OriginalArg(0) Class463 arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29478(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "ak", descriptor = "(FFF)Lclient!on;")
	public static Class463 method29531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0, arg1, arg2);
			} else {
				aClass463Array1[--anInt4936].method29477(arg0, arg1, arg2);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "ce", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29535(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29494(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "t", descriptor = "(I)V")
	public static void method29536(@OriginalArg(0) int arg0) {
		anInt4935 = arg0;
		aClass463Array1 = new Class463[arg0];
		anInt4936 = 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(FFF)Lclient!on;")
	public static Class463 method29541(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0, arg1, arg2);
			} else {
				aClass463Array1[--anInt4936].method29477(arg0, arg1, arg2);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "an", descriptor = "(Lclient!ald;)Lclient!on;")
	public static Class463 method29542(@OriginalArg(0) Packet arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29476(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "bi", descriptor = "(Lclient!on;Lclient!on;)F")
	public static float method29544(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		return arg0.method29492(arg1);
	}

	@OriginalMember(owner = "client!on", name = "cx", descriptor = "(Lclient!on;F)Lclient!on;")
	public static Class463 method29547(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29496(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "cd", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29549(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29559(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "cv", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29550(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29559(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "ao", descriptor = "(Lclient!on;F)Lclient!on;")
	public static Class463 method29551(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29496(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "l", descriptor = "(Lclient!ald;)Lclient!on;")
	public static Class463 method29552(@OriginalArg(0) Packet arg0) {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 == 0) {
				return new Class463(arg0);
			} else {
				aClass463Array1[--anInt4936].method29476(arg0);
				return aClass463Array1[anInt4936];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "cn", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29558(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29559(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "cg", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29561(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "ai", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29562(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "ci", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29563(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "bp", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29566(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29486(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "cb", descriptor = "(Lclient!on;Lclient!on;)Lclient!on;")
	public static Class463 method29567(@OriginalArg(0) Class463 arg0, @OriginalArg(1) Class463 arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29497(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "cl", descriptor = "(Lclient!on;F)Lclient!on;")
	public static Class463 method29569(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class463 local2 = method29472(arg0);
		local2.method29496(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(FFF)V")
	public Class463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat297 = arg0;
		this.aFloat295 = arg1;
		this.aFloat296 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!on;)V")
	public Class463(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 = arg0.aFloat297;
		this.aFloat295 = arg0.aFloat295;
		this.aFloat296 = arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class463() {
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class463(@OriginalArg(0) Packet arg0) {
		this.aFloat297 = arg0.gFloat();
		this.aFloat295 = arg0.gFloat();
		this.aFloat296 = arg0.gFloat();
	}

	@OriginalMember(owner = "client!on", name = "aw", descriptor = "()V")
	public void method29471() {
		this.aFloat296 = 0.0F;
		this.aFloat295 = 0.0F;
		this.aFloat297 = 0.0F;
	}

	@OriginalMember(owner = "client!on", name = "bf", descriptor = "(Lclient!on;)F")
	public float method29473(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cj", descriptor = "(F)V")
	public void method29474(@OriginalArg(0) float arg0) {
		this.aFloat297 *= arg0;
		this.aFloat295 *= arg0;
		this.aFloat296 *= arg0;
	}

	@OriginalMember(owner = "client!on", name = "s", descriptor = "()V")
	public void method29475() {
		this.aFloat297 = -this.aFloat297;
		this.aFloat295 = -this.aFloat295;
		this.aFloat296 = -this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "i", descriptor = "(Lclient!ald;)V")
	public void method29476(@OriginalArg(0) Packet arg0) {
		this.aFloat297 = arg0.gFloat();
		this.aFloat295 = arg0.gFloat();
		this.aFloat296 = arg0.gFloat();
	}

	@OriginalMember(owner = "client!on", name = "m", descriptor = "(FFF)V")
	public void method29477(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat297 = arg0;
		this.aFloat295 = arg1;
		this.aFloat296 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "o", descriptor = "(Lclient!on;)V")
	public void method29478(@OriginalArg(0) Class463 arg0) {
		this.method29477(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!on", name = "bq", descriptor = "(Lclient!on;)V")
	void method29479(@OriginalArg(0) Class463 arg0) {
		this.method29477(this.aFloat295 * arg0.aFloat296 - this.aFloat296 * arg0.aFloat295, this.aFloat296 * arg0.aFloat297 - this.aFloat297 * arg0.aFloat296, this.aFloat297 * arg0.aFloat295 - this.aFloat295 * arg0.aFloat297);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!on;)Z")
	public boolean method29480(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 == arg0.aFloat297 && this.aFloat295 == arg0.aFloat295 && this.aFloat296 == arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "y", descriptor = "()F")
	public float method29481() {
		return (float) Math.sqrt((double) (this.aFloat297 * this.aFloat297 + this.aFloat295 * this.aFloat295 + this.aFloat296 * this.aFloat296));
	}

	@OriginalMember(owner = "client!on", name = "k", descriptor = "()V")
	public void method29482() {
		@Pc(4) float local4 = 1.0F / this.method29481();
		this.aFloat297 *= local4;
		this.aFloat295 *= local4;
		this.aFloat296 *= local4;
	}

	@OriginalMember(owner = "client!on", name = "x", descriptor = "(Lclient!on;)V")
	public void method29483(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 += arg0.aFloat297;
		this.aFloat295 += arg0.aFloat295;
		this.aFloat296 += arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "w", descriptor = "(Lclient!on;F)V")
	public void method29484(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.aFloat297 += arg0.aFloat297 * arg1;
		this.aFloat295 += arg0.aFloat295 * arg1;
		this.aFloat296 += arg0.aFloat296 * arg1;
	}

	@OriginalMember(owner = "client!on", name = "q", descriptor = "(Lclient!on;)V")
	public void method29486(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 -= arg0.aFloat297;
		this.aFloat295 -= arg0.aFloat295;
		this.aFloat296 -= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "be", descriptor = "(Lclient!on;)V")
	public void method29488(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 -= arg0.aFloat297;
		this.aFloat295 -= arg0.aFloat295;
		this.aFloat296 -= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cu", descriptor = "(Lclient!on;)V")
	void method29489(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 *= arg0.aFloat297;
		this.aFloat295 *= arg0.aFloat295;
		this.aFloat296 *= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "by", descriptor = "(Lclient!on;)V")
	public void method29490(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 += arg0.aFloat297;
		this.aFloat295 += arg0.aFloat295;
		this.aFloat296 += arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(Lclient!on;)F")
	public float method29492(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bd", descriptor = "(Lclient!on;)V")
	void method29493(@OriginalArg(0) Class463 arg0) {
		this.method29477(this.aFloat295 * arg0.aFloat296 - this.aFloat296 * arg0.aFloat295, this.aFloat296 * arg0.aFloat297 - this.aFloat297 * arg0.aFloat296, this.aFloat297 * arg0.aFloat295 - this.aFloat295 * arg0.aFloat297);
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(Lclient!on;)V")
	void method29494(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 *= arg0.aFloat297;
		this.aFloat295 *= arg0.aFloat295;
		this.aFloat296 *= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "ax", descriptor = "(F)V")
	public void method29496(@OriginalArg(0) float arg0) {
		this.aFloat297 *= arg0;
		this.aFloat295 *= arg0;
		this.aFloat296 *= arg0;
	}

	@OriginalMember(owner = "client!on", name = "ay", descriptor = "(Lclient!on;)V")
	void method29497(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 /= arg0.aFloat297;
		this.aFloat295 /= arg0.aFloat295;
		this.aFloat296 /= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "aq", descriptor = "(F)V")
	public void method29499(@OriginalArg(0) float arg0) {
		this.aFloat297 /= arg0;
		this.aFloat295 /= arg0;
		this.aFloat296 /= arg0;
	}

	@OriginalMember(owner = "client!on", name = "aj", descriptor = "(Lclient!oq;)V")
	public void method29500(@OriginalArg(0) Class466 arg0) {
		@Pc(8) Class466 local8 = Class466.method29641(this.aFloat297, this.aFloat295, this.aFloat296, 0.0F);
		@Pc(11) Class466 local11 = Class466.method29687(arg0);
		@Pc(15) Class466 local15 = Class466.method29665(local11, local8);
		local15.method29660(arg0);
		this.method29477(local15.aFloat301, local15.aFloat299, local15.aFloat300);
		local8.method29643();
		local11.method29643();
		local15.method29643();
	}

	@OriginalMember(owner = "client!on", name = "ag", descriptor = "(Lclient!ov;)V")
	public void method29502(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "ab", descriptor = "(Lclient!on;F)V")
	public void method29503(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29496(1.0F - arg1);
		this.method29483(method29551(arg0, arg1));
	}

	@OriginalMember(owner = "client!on", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat297 + ", " + this.aFloat295 + ", " + this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method29504() {
		return this.aFloat297 + ", " + this.aFloat295 + ", " + this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method29505() {
		return this.aFloat297 + ", " + this.aFloat295 + ", " + this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bg", descriptor = "()V")
	public void method29513() {
		this.aFloat296 = 0.0F;
		this.aFloat295 = 0.0F;
		this.aFloat297 = 0.0F;
	}

	@OriginalMember(owner = "client!on", name = "ae", descriptor = "(FFF)V")
	public void method29516(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat297 = arg0;
		this.aFloat295 = arg1;
		this.aFloat296 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "ap", descriptor = "(FFF)V")
	public void method29517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat297 = arg0;
		this.aFloat295 = arg1;
		this.aFloat296 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "ar", descriptor = "(Lclient!on;)V")
	public void method29518(@OriginalArg(0) Class463 arg0) {
		this.method29477(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!on", name = "au", descriptor = "(Lclient!on;)V")
	public void method29519(@OriginalArg(0) Class463 arg0) {
		this.method29477(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!on", name = "az", descriptor = "(Lclient!on;)V")
	public void method29520(@OriginalArg(0) Class463 arg0) {
		this.method29477(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!on", name = "as", descriptor = "(Lclient!on;)V")
	public void method29521(@OriginalArg(0) Class463 arg0) {
		this.method29477(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!on", name = "bl", descriptor = "()V")
	public void method29524() {
		this.aFloat296 = 0.0F;
		this.aFloat295 = 0.0F;
		this.aFloat297 = 0.0F;
	}

	@OriginalMember(owner = "client!on", name = "br", descriptor = "()V")
	public void method29525() {
		this.aFloat296 = 0.0F;
		this.aFloat295 = 0.0F;
		this.aFloat297 = 0.0F;
	}

	@OriginalMember(owner = "client!on", name = "bn", descriptor = "(Lclient!on;)Z")
	public boolean method29526(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 == arg0.aFloat297 && this.aFloat295 == arg0.aFloat295 && this.aFloat296 == arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "ba", descriptor = "()V")
	public void method29527() {
		this.aFloat297 = -this.aFloat297;
		this.aFloat295 = -this.aFloat295;
		this.aFloat296 = -this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bt", descriptor = "()V")
	public void method29528() {
		this.aFloat297 = -this.aFloat297;
		this.aFloat295 = -this.aFloat295;
		this.aFloat296 = -this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bs", descriptor = "()V")
	public void method29529() {
		@Pc(4) float local4 = 1.0F / this.method29481();
		this.aFloat297 *= local4;
		this.aFloat295 *= local4;
		this.aFloat296 *= local4;
	}

	@OriginalMember(owner = "client!on", name = "bj", descriptor = "(Lclient!on;)V")
	public void method29530(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 += arg0.aFloat297;
		this.aFloat295 += arg0.aFloat295;
		this.aFloat296 += arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bk", descriptor = "(Lclient!on;F)V")
	public void method29532(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.aFloat297 += arg0.aFloat297 * arg1;
		this.aFloat295 += arg0.aFloat295 * arg1;
		this.aFloat296 += arg0.aFloat296 * arg1;
	}

	@OriginalMember(owner = "client!on", name = "dd", descriptor = "(Lclient!ov;)V")
	public void method29533(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bh", descriptor = "(Lclient!on;)V")
	public void method29534(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 -= arg0.aFloat297;
		this.aFloat295 -= arg0.aFloat295;
		this.aFloat296 -= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "ac", descriptor = "(Lclient!ov;)V")
	public void method29537(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296 + arg0.aFloat310;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296 + arg0.aFloat312;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!on", name = "bb", descriptor = "(Lclient!on;)F")
	public float method29538(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bo", descriptor = "(Lclient!on;)F")
	public float method29539(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bc", descriptor = "(Lclient!on;)F")
	public float method29540(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "n", descriptor = "()V")
	public void method29543() {
		if (this.aFloat297 < 0.0F) {
			this.aFloat297 *= -1.0F;
		}
		if (this.aFloat295 < 0.0F) {
			this.aFloat295 *= -1.0F;
		}
		if (this.aFloat296 < 0.0F) {
			this.aFloat296 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!on", name = "bu", descriptor = "(Lclient!on;)V")
	void method29545(@OriginalArg(0) Class463 arg0) {
		this.method29477(this.aFloat295 * arg0.aFloat296 - this.aFloat296 * arg0.aFloat295, this.aFloat296 * arg0.aFloat297 - this.aFloat297 * arg0.aFloat296, this.aFloat297 * arg0.aFloat295 - this.aFloat295 * arg0.aFloat297);
	}

	@OriginalMember(owner = "client!on", name = "ca", descriptor = "(Lclient!on;)V")
	void method29546(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 /= arg0.aFloat297;
		this.aFloat295 /= arg0.aFloat295;
		this.aFloat296 /= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "bm", descriptor = "(Lclient!on;)V")
	void method29548(@OriginalArg(0) Class463 arg0) {
		this.method29477(this.aFloat295 * arg0.aFloat296 - this.aFloat296 * arg0.aFloat295, this.aFloat296 * arg0.aFloat297 - this.aFloat297 * arg0.aFloat296, this.aFloat297 * arg0.aFloat295 - this.aFloat295 * arg0.aFloat297);
	}

	@OriginalMember(owner = "client!on", name = "cy", descriptor = "()F")
	public float method29553() {
		return (float) Math.sqrt((double) (this.aFloat297 * this.aFloat297 + this.aFloat295 * this.aFloat295 + this.aFloat296 * this.aFloat296));
	}

	@OriginalMember(owner = "client!on", name = "ch", descriptor = "()V")
	public void method29554() {
		if (this.aFloat297 < 0.0F) {
			this.aFloat297 *= -1.0F;
		}
		if (this.aFloat295 < 0.0F) {
			this.aFloat295 *= -1.0F;
		}
		if (this.aFloat296 < 0.0F) {
			this.aFloat296 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!on", name = "cc", descriptor = "(Lclient!on;)V")
	void method29555(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 *= arg0.aFloat297;
		this.aFloat295 *= arg0.aFloat295;
		this.aFloat296 *= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "co", descriptor = "(Lclient!ov;)V")
	public void method29556(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296 + arg0.aFloat310;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296 + arg0.aFloat312;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "()V")
	public void method29557() {
		@Pc(2) Class463[] local2 = aClass463Array1;
		synchronized (aClass463Array1) {
			if (anInt4936 < anInt4935 - 1) {
				aClass463Array1[anInt4936++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "p", descriptor = "(Lclient!on;)V")
	void method29559(@OriginalArg(0) Class463 arg0) {
		this.method29477(this.aFloat295 * arg0.aFloat296 - this.aFloat296 * arg0.aFloat295, this.aFloat296 * arg0.aFloat297 - this.aFloat297 * arg0.aFloat296, this.aFloat297 * arg0.aFloat295 - this.aFloat295 * arg0.aFloat297);
	}

	@OriginalMember(owner = "client!on", name = "ck", descriptor = "(Lclient!on;)V")
	void method29560(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 /= arg0.aFloat297;
		this.aFloat295 /= arg0.aFloat295;
		this.aFloat296 /= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cs", descriptor = "(F)V")
	public void method29564(@OriginalArg(0) float arg0) {
		this.aFloat297 *= arg0;
		this.aFloat295 *= arg0;
		this.aFloat296 *= arg0;
	}

	@OriginalMember(owner = "client!on", name = "bz", descriptor = "(Lclient!on;)V")
	public void method29565(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 -= arg0.aFloat297;
		this.aFloat295 -= arg0.aFloat295;
		this.aFloat296 -= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cw", descriptor = "(F)V")
	public void method29568(@OriginalArg(0) float arg0) {
		this.aFloat297 /= arg0;
		this.aFloat295 /= arg0;
		this.aFloat296 /= arg0;
	}

	@OriginalMember(owner = "client!on", name = "cr", descriptor = "(Lclient!on;)V")
	void method29570(@OriginalArg(0) Class463 arg0) {
		this.aFloat297 /= arg0.aFloat297;
		this.aFloat295 /= arg0.aFloat295;
		this.aFloat296 /= arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cf", descriptor = "(Lclient!oq;)V")
	public void method29571(@OriginalArg(0) Class466 arg0) {
		@Pc(8) Class466 local8 = Class466.method29641(this.aFloat297, this.aFloat295, this.aFloat296, 0.0F);
		@Pc(11) Class466 local11 = Class466.method29687(arg0);
		@Pc(15) Class466 local15 = Class466.method29665(local11, local8);
		local15.method29660(arg0);
		this.method29477(local15.aFloat301, local15.aFloat299, local15.aFloat300);
		local8.method29643();
		local11.method29643();
		local15.method29643();
	}

	@OriginalMember(owner = "client!on", name = "bw", descriptor = "(Lclient!on;)F")
	public float method29572(@OriginalArg(0) Class463 arg0) {
		return this.aFloat297 * arg0.aFloat297 + this.aFloat295 * arg0.aFloat295 + this.aFloat296 * arg0.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "cz", descriptor = "(Lclient!ov;)V")
	public void method29573(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296 + arg0.aFloat310;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296 + arg0.aFloat312;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!on", name = "cq", descriptor = "(Lclient!ov;)V")
	public void method29574(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296 + arg0.aFloat310;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296 + arg0.aFloat312;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!on", name = "j", descriptor = "()V")
	public void method29575() {
		this.aFloat296 = 0.0F;
		this.aFloat295 = 0.0F;
		this.aFloat297 = 0.0F;
	}

	@OriginalMember(owner = "client!on", name = "dh", descriptor = "(Lclient!ov;)V")
	public void method29576(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "dg", descriptor = "(Lclient!ov;)V")
	public void method29577(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296 + arg0.aFloat310;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296 + arg0.aFloat312;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!on", name = "dc", descriptor = "(Lclient!ov;)V")
	public void method29578(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat297;
		@Pc(5) float local5 = this.aFloat295;
		this.aFloat297 = arg0.aFloat303 * local2 + arg0.aFloat311 * local5 + arg0.aFloat308 * this.aFloat296;
		this.aFloat295 = arg0.aFloat304 * local2 + arg0.aFloat309 * local5 + arg0.aFloat306 * this.aFloat296;
		this.aFloat296 = arg0.aFloat305 * local2 + arg0.aFloat307 * local5 + arg0.aFloat302 * this.aFloat296;
	}

	@OriginalMember(owner = "client!on", name = "dn", descriptor = "(Lclient!on;F)V")
	public void method29579(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29496(1.0F - arg1);
		this.method29483(method29551(arg0, arg1));
	}

	@OriginalMember(owner = "client!on", name = "df", descriptor = "(Lclient!on;F)V")
	public void method29580(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29496(1.0F - arg1);
		this.method29483(method29551(arg0, arg1));
	}

	@OriginalMember(owner = "client!on", name = "dl", descriptor = "(Lclient!on;F)V")
	public void method29581(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) {
		this.method29496(1.0F - arg1);
		this.method29483(method29551(arg0, arg1));
	}
}
