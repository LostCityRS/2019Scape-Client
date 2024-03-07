package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ox")
public class Class472 {

	@OriginalMember(owner = "client!ox", name = "m", descriptor = "I")
	static int anInt5123;

	@OriginalMember(owner = "client!ox", name = "n", descriptor = "I")
	static int anInt5124;

	@OriginalMember(owner = "client!ox", name = "e", descriptor = "[Lclient!ox;")
	static Class472[] aClass472Array1;

	@OriginalMember(owner = "client!ox", name = "k", descriptor = "F")
	public float aFloat317;

	@OriginalMember(owner = "client!ox", name = "f", descriptor = "F")
	public float aFloat318;

	@OriginalMember(owner = "client!ox", name = "w", descriptor = "F")
	public float aFloat319;

	static {
		new Class472(0.0F, 0.0F, 0.0F);
		new Class472(1.0F, 1.0F, 1.0F);
		aClass472Array1 = new Class472[0];
	}

	@OriginalMember(owner = "client!ox", name = "e", descriptor = "(I)V", line = 22)
	public static void method29527(@OriginalArg(0) int arg0) {
		anInt5124 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5123 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "ad", descriptor = "(I)V", line = 22)
	public static void method29528(@OriginalArg(0) int arg0) {
		anInt5124 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5123 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "am", descriptor = "(I)V", line = 22)
	public static void method29529(@OriginalArg(0) int arg0) {
		anInt5124 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5123 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "au", descriptor = "(I)V", line = 22)
	public static void method29530(@OriginalArg(0) int arg0) {
		anInt5124 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5123 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "n", descriptor = "()Lclient!ox;", line = 28)
	public static Class472 method29531() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5123].method29553();
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ar", descriptor = "()Lclient!ox;", line = 28)
	public static Class472 method29532() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5123].method29553();
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "aq", descriptor = "()Lclient!ox;", line = 28)
	public static Class472 method29533() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5123].method29553();
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ap", descriptor = "()Lclient!ox;", line = 28)
	public static Class472 method29534() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5123].method29553();
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "m", descriptor = "(FFF)Lclient!ox;", line = 38)
	public static Class472 method29535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0, arg1, arg2);
			} else {
				aClass472Array1[--anInt5123].method29549(arg0, arg1, arg2);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ax", descriptor = "(FFF)Lclient!ox;", line = 38)
	public static Class472 method29536(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0, arg1, arg2);
			} else {
				aClass472Array1[--anInt5123].method29549(arg0, arg1, arg2);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "k", descriptor = "(Lclient!ox;)Lclient!ox;", line = 48)
	public static Class472 method29537(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29550(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ay", descriptor = "(Lclient!ox;)Lclient!ox;", line = 48)
	public static Class472 method29538(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29550(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "aj", descriptor = "(Lclient!ox;)Lclient!ox;", line = 48)
	public static Class472 method29539(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29550(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "av", descriptor = "(Lclient!ox;)Lclient!ox;", line = 48)
	public static Class472 method29540(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29550(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ao", descriptor = "(Lclient!ox;)Lclient!ox;", line = 48)
	public static Class472 method29541(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29550(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "f", descriptor = "(Lclient!alw;)Lclient!ox;", line = 58)
	public static Class472 method29542(@OriginalArg(0) Packet arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29546(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ab", descriptor = "(Lclient!alw;)Lclient!ox;", line = 58)
	public static Class472 method29543(@OriginalArg(0) Packet arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5123].method29546(arg0);
				return aClass472Array1[anInt5123];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "w", descriptor = "()V", line = 68)
	public void method29544() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 < anInt5124 - 1) {
				aClass472Array1[anInt5123++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "az", descriptor = "()V", line = 68)
	public void method29545() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5123 < anInt5124 - 1) {
				aClass472Array1[anInt5123++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "()V", line = 73)
	public Class472() {
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(FFF)V", line = 75)
	public Class472(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat317 = arg0;
		this.aFloat318 = arg1;
		this.aFloat319 = arg2;
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(Lclient!ox;)V", line = 81)
	public Class472(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 = arg0.aFloat317;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat319 = arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(Lclient!alw;)V", line = 87)
	public Class472(@OriginalArg(0) Packet arg0) {
		this.aFloat317 = arg0.gFloat(-1448911901);
		this.aFloat318 = arg0.gFloat(-1562569320);
		this.aFloat319 = arg0.gFloat(1008052927);
	}

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "(Lclient!alw;)V", line = 94)
	public void method29546(@OriginalArg(0) Packet arg0) {
		this.aFloat317 = arg0.gFloat(-1498497274);
		this.aFloat318 = arg0.gFloat(-1786570425);
		this.aFloat319 = arg0.gFloat(1173520798);
	}

	@OriginalMember(owner = "client!ox", name = "aa", descriptor = "(Lclient!alw;)V", line = 94)
	public void method29547(@OriginalArg(0) Packet arg0) {
		this.aFloat317 = arg0.gFloat(-1738742967);
		this.aFloat318 = arg0.gFloat(258335209);
		this.aFloat319 = arg0.gFloat(-512644407);
	}

	@OriginalMember(owner = "client!ox", name = "af", descriptor = "(Lclient!alw;)V", line = 94)
	public void method29548(@OriginalArg(0) Packet arg0) {
		this.aFloat317 = arg0.gFloat(292785100);
		this.aFloat318 = arg0.gFloat(662635158);
		this.aFloat319 = arg0.gFloat(-229718110);
	}

	@OriginalMember(owner = "client!ox", name = "u", descriptor = "(FFF)V", line = 100)
	public void method29549(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat317 = arg0;
		this.aFloat318 = arg1;
		this.aFloat319 = arg2;
	}

	@OriginalMember(owner = "client!ox", name = "z", descriptor = "(Lclient!ox;)V", line = 106)
	public void method29550(@OriginalArg(0) Class472 arg0) {
		this.method29549(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319);
	}

	@OriginalMember(owner = "client!ox", name = "ak", descriptor = "(Lclient!ox;)V", line = 106)
	public void method29551(@OriginalArg(0) Class472 arg0) {
		this.method29549(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319);
	}

	@OriginalMember(owner = "client!ox", name = "an", descriptor = "(Lclient!ox;)V", line = 106)
	public void method29552(@OriginalArg(0) Class472 arg0) {
		this.method29549(arg0.aFloat317, arg0.aFloat318, arg0.aFloat319);
	}

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "()V", line = 110)
	public final void method29553() {
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "bf", descriptor = "()V", line = 110)
	public final void method29554() {
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "bl", descriptor = "()V", line = 110)
	public final void method29555() {
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "bk", descriptor = "()V", line = 110)
	public final void method29556() {
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "bh", descriptor = "()V", line = 110)
	public final void method29557() {
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "d", descriptor = "(Lclient!ox;)Z", line = 116)
	public boolean method29558(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 == arg0.aFloat317 && this.aFloat318 == arg0.aFloat318 && this.aFloat319 == arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bx", descriptor = "(Lclient!ox;)Z", line = 116)
	public boolean method29559(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 == arg0.aFloat317 && this.aFloat318 == arg0.aFloat318 && this.aFloat319 == arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bd", descriptor = "(Lclient!ox;)Z", line = 116)
	public boolean method29560(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 == arg0.aFloat317 && this.aFloat318 == arg0.aFloat318 && this.aFloat319 == arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "c", descriptor = "()V", line = 121)
	public final void method29561() {
		this.aFloat317 = -this.aFloat317;
		this.aFloat318 = -this.aFloat318;
		this.aFloat319 = -this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bc", descriptor = "()V", line = 121)
	public final void method29562() {
		this.aFloat317 = -this.aFloat317;
		this.aFloat318 = -this.aFloat318;
		this.aFloat319 = -this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bi", descriptor = "()V", line = 121)
	public final void method29563() {
		this.aFloat317 = -this.aFloat317;
		this.aFloat318 = -this.aFloat318;
		this.aFloat319 = -this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "r", descriptor = "()V", line = 127)
	public final void method29564() {
		@Pc(4) float local4 = 1.0F / this.method29593();
		this.aFloat317 *= local4;
		this.aFloat318 *= local4;
		this.aFloat319 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "bn", descriptor = "()V", line = 127)
	public final void method29565() {
		@Pc(4) float local4 = 1.0F / this.method29593();
		this.aFloat317 *= local4;
		this.aFloat318 *= local4;
		this.aFloat319 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "bt", descriptor = "()V", line = 127)
	public final void method29566() {
		@Pc(4) float local4 = 1.0F / this.method29593();
		this.aFloat317 *= local4;
		this.aFloat318 *= local4;
		this.aFloat319 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "v", descriptor = "(Lclient!ox;)V", line = 134)
	public final void method29567(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 += arg0.aFloat317;
		this.aFloat318 += arg0.aFloat318;
		this.aFloat319 += arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bq", descriptor = "(Lclient!ox;)V", line = 134)
	public final void method29568(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 += arg0.aFloat317;
		this.aFloat318 += arg0.aFloat318;
		this.aFloat319 += arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bm", descriptor = "(Lclient!ox;)V", line = 134)
	public final void method29569(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 += arg0.aFloat317;
		this.aFloat318 += arg0.aFloat318;
		this.aFloat319 += arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bb", descriptor = "(Lclient!ox;)V", line = 134)
	public final void method29570(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 += arg0.aFloat317;
		this.aFloat318 += arg0.aFloat318;
		this.aFloat319 += arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "be", descriptor = "(Lclient!ox;F)V", line = 140)
	public final void method29571(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.aFloat317 += arg0.aFloat317 * arg1;
		this.aFloat318 += arg0.aFloat318 * arg1;
		this.aFloat319 += arg0.aFloat319 * arg1;
	}

	@OriginalMember(owner = "client!ox", name = "o", descriptor = "(Lclient!ox;F)V", line = 140)
	public final void method29572(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.aFloat317 += arg0.aFloat317 * arg1;
		this.aFloat318 += arg0.aFloat318 * arg1;
		this.aFloat319 += arg0.aFloat319 * arg1;
	}

	@OriginalMember(owner = "client!ox", name = "s", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 146)
	public static final Class472 method29573(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29567(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "by", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 146)
	public static final Class472 method29574(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29567(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bu", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 146)
	public static final Class472 method29575(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29567(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "y", descriptor = "(Lclient!ox;)V", line = 152)
	public final void method29576(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 -= arg0.aFloat317;
		this.aFloat318 -= arg0.aFloat318;
		this.aFloat319 -= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bw", descriptor = "(Lclient!ox;)V", line = 152)
	public final void method29577(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 -= arg0.aFloat317;
		this.aFloat318 -= arg0.aFloat318;
		this.aFloat319 -= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bo", descriptor = "(Lclient!ox;)V", line = 152)
	public final void method29578(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 -= arg0.aFloat317;
		this.aFloat318 -= arg0.aFloat318;
		this.aFloat319 -= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "q", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 158)
	public static final Class472 method29579(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29576(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bz", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 158)
	public static final Class472 method29580(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29576(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bv", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 158)
	public static final Class472 method29581(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29576(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "br", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 158)
	public static final Class472 method29582(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29576(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "x", descriptor = "(Lclient!ox;)F", line = 164)
	public final float method29583(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 * arg0.aFloat317 + this.aFloat318 * arg0.aFloat318 + this.aFloat319 * arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "ba", descriptor = "(Lclient!ox;)F", line = 164)
	public final float method29584(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 * arg0.aFloat317 + this.aFloat318 * arg0.aFloat318 + this.aFloat319 * arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "bg", descriptor = "(Lclient!ox;)F", line = 164)
	public final float method29585(@OriginalArg(0) Class472 arg0) {
		return this.aFloat317 * arg0.aFloat317 + this.aFloat318 * arg0.aFloat318 + this.aFloat319 * arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "b", descriptor = "(Lclient!ox;Lclient!ox;)F", line = 168)
	public static final float method29586(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		return arg0.method29583(arg1);
	}

	@OriginalMember(owner = "client!ox", name = "bp", descriptor = "(Lclient!ox;Lclient!ox;)F", line = 168)
	public static final float method29587(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		return arg0.method29583(arg1);
	}

	@OriginalMember(owner = "client!ox", name = "h", descriptor = "(Lclient!ox;)V", line = 172)
	final void method29588(@OriginalArg(0) Class472 arg0) {
		this.method29549(this.aFloat318 * arg0.aFloat319 - this.aFloat319 * arg0.aFloat318, this.aFloat319 * arg0.aFloat317 - this.aFloat317 * arg0.aFloat319, this.aFloat317 * arg0.aFloat318 - this.aFloat318 * arg0.aFloat317);
	}

	@OriginalMember(owner = "client!ox", name = "bj", descriptor = "(Lclient!ox;)V", line = 172)
	final void method29589(@OriginalArg(0) Class472 arg0) {
		this.method29549(this.aFloat318 * arg0.aFloat319 - this.aFloat319 * arg0.aFloat318, this.aFloat319 * arg0.aFloat317 - this.aFloat317 * arg0.aFloat319, this.aFloat317 * arg0.aFloat318 - this.aFloat318 * arg0.aFloat317);
	}

	@OriginalMember(owner = "client!ox", name = "bs", descriptor = "(Lclient!ox;)V", line = 172)
	final void method29590(@OriginalArg(0) Class472 arg0) {
		this.method29549(this.aFloat318 * arg0.aFloat319 - this.aFloat319 * arg0.aFloat318, this.aFloat319 * arg0.aFloat317 - this.aFloat317 * arg0.aFloat319, this.aFloat317 * arg0.aFloat318 - this.aFloat318 * arg0.aFloat317);
	}

	@OriginalMember(owner = "client!ox", name = "cl", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 176)
	public static final Class472 method29591(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29588(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "a", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 176)
	public static final Class472 method29592(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29588(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "g", descriptor = "()F", line = 182)
	public final float method29593() {
		return (float) Math.sqrt((double) (this.aFloat317 * this.aFloat317 + this.aFloat318 * this.aFloat318 + this.aFloat319 * this.aFloat319));
	}

	@OriginalMember(owner = "client!ox", name = "cg", descriptor = "()V", line = 186)
	public final void method29594() {
		if (this.aFloat317 < 0.0F) {
			this.aFloat317 *= -1.0F;
		}
		if (this.aFloat318 < 0.0F) {
			this.aFloat318 *= -1.0F;
		}
		if (this.aFloat319 < 0.0F) {
			this.aFloat319 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!ox", name = "i", descriptor = "()V", line = 186)
	public final void method29595() {
		if (this.aFloat317 < 0.0F) {
			this.aFloat317 *= -1.0F;
		}
		if (this.aFloat318 < 0.0F) {
			this.aFloat318 *= -1.0F;
		}
		if (this.aFloat319 < 0.0F) {
			this.aFloat319 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!ox", name = "j", descriptor = "(Lclient!ox;)V", line = 192)
	final void method29596(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 *= arg0.aFloat317;
		this.aFloat318 *= arg0.aFloat318;
		this.aFloat319 *= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "ce", descriptor = "(Lclient!ox;)V", line = 192)
	final void method29597(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 *= arg0.aFloat317;
		this.aFloat318 *= arg0.aFloat318;
		this.aFloat319 *= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "cu", descriptor = "(Lclient!ox;)V", line = 192)
	final void method29598(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 *= arg0.aFloat317;
		this.aFloat318 *= arg0.aFloat318;
		this.aFloat319 *= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "ci", descriptor = "(Lclient!ox;)V", line = 192)
	final void method29599(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 *= arg0.aFloat317;
		this.aFloat318 *= arg0.aFloat318;
		this.aFloat319 *= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "cv", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 198)
	public static final Class472 method29600(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29596(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "t", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 198)
	public static final Class472 method29601(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29596(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cn", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 198)
	public static final Class472 method29602(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29596(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cp", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 198)
	public static final Class472 method29603(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29596(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "ae", descriptor = "(F)V", line = 204)
	public final void method29604(@OriginalArg(0) float arg0) {
		this.aFloat317 *= arg0;
		this.aFloat318 *= arg0;
		this.aFloat319 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "cx", descriptor = "(F)V", line = 204)
	public final void method29605(@OriginalArg(0) float arg0) {
		this.aFloat317 *= arg0;
		this.aFloat318 *= arg0;
		this.aFloat319 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "ca", descriptor = "(F)V", line = 204)
	public final void method29606(@OriginalArg(0) float arg0) {
		this.aFloat317 *= arg0;
		this.aFloat318 *= arg0;
		this.aFloat319 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "ag", descriptor = "(Lclient!ox;)V", line = 210)
	final void method29607(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 /= arg0.aFloat317;
		this.aFloat318 /= arg0.aFloat318;
		this.aFloat319 /= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "cw", descriptor = "(Lclient!ox;)V", line = 210)
	final void method29608(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 /= arg0.aFloat317;
		this.aFloat318 /= arg0.aFloat318;
		this.aFloat319 /= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "ct", descriptor = "(Lclient!ox;)V", line = 210)
	final void method29609(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 /= arg0.aFloat317;
		this.aFloat318 /= arg0.aFloat318;
		this.aFloat319 /= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "cf", descriptor = "(Lclient!ox;)V", line = 210)
	final void method29610(@OriginalArg(0) Class472 arg0) {
		this.aFloat317 /= arg0.aFloat317;
		this.aFloat318 /= arg0.aFloat318;
		this.aFloat319 /= arg0.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "ah", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 216)
	public static final Class472 method29611(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29607(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "co", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 216)
	public static final Class472 method29612(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29607(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cm", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 216)
	public static final Class472 method29613(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29607(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cr", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;", line = 216)
	public static final Class472 method29614(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29607(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "al", descriptor = "(F)V", line = 222)
	public final void method29615(@OriginalArg(0) float arg0) {
		this.aFloat317 /= arg0;
		this.aFloat318 /= arg0;
		this.aFloat319 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "cq", descriptor = "(F)V", line = 222)
	public final void method29616(@OriginalArg(0) float arg0) {
		this.aFloat317 /= arg0;
		this.aFloat318 /= arg0;
		this.aFloat319 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "ch", descriptor = "(F)V", line = 222)
	public final void method29617(@OriginalArg(0) float arg0) {
		this.aFloat317 /= arg0;
		this.aFloat318 /= arg0;
		this.aFloat319 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "cb", descriptor = "(F)V", line = 222)
	public final void method29618(@OriginalArg(0) float arg0) {
		this.aFloat317 /= arg0;
		this.aFloat318 /= arg0;
		this.aFloat319 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "ac", descriptor = "(Lclient!ox;F)Lclient!ox;", line = 228)
	public static final Class472 method29619(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29604(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cs", descriptor = "(Lclient!ox;F)Lclient!ox;", line = 228)
	public static final Class472 method29620(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29604(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cy", descriptor = "(Lclient!ox;F)Lclient!ox;", line = 228)
	public static final Class472 method29621(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29537(arg0);
		local2.method29604(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cc", descriptor = "(Lclient!ov;)V", line = 234)
	public final void method29622(@OriginalArg(0) Class471 arg0) {
		@Pc(8) Class471 local8 = Class471.method29460(this.aFloat317, this.aFloat318, this.aFloat319, 0.0F);
		@Pc(11) Class471 local11 = Class471.method29493(arg0);
		@Pc(15) Class471 local15 = Class471.method29512(local11, local8);
		local15.method29510(arg0);
		this.method29549(local15.aFloat314, local15.aFloat315, local15.aFloat316);
		local8.method29467();
		local11.method29467();
		local15.method29467();
	}

	@OriginalMember(owner = "client!ox", name = "ai", descriptor = "(Lclient!ov;)V", line = 234)
	public final void method29623(@OriginalArg(0) Class471 arg0) {
		@Pc(8) Class471 local8 = Class471.method29460(this.aFloat317, this.aFloat318, this.aFloat319, 0.0F);
		@Pc(11) Class471 local11 = Class471.method29493(arg0);
		@Pc(15) Class471 local15 = Class471.method29512(local11, local8);
		local15.method29510(arg0);
		this.method29549(local15.aFloat314, local15.aFloat315, local15.aFloat316);
		local8.method29467();
		local11.method29467();
		local15.method29467();
	}

	@OriginalMember(owner = "client!ox", name = "ck", descriptor = "(Lclient!ou;)V", line = 245)
	public final void method29624(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319 + arg0.aFloat310;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319 + arg0.aFloat311;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319 + arg0.aFloat306;
	}

	@OriginalMember(owner = "client!ox", name = "aw", descriptor = "(Lclient!ou;)V", line = 245)
	public final void method29625(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319 + arg0.aFloat310;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319 + arg0.aFloat311;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319 + arg0.aFloat306;
	}

	@OriginalMember(owner = "client!ox", name = "cz", descriptor = "(Lclient!ou;)V", line = 245)
	public final void method29626(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319 + arg0.aFloat310;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319 + arg0.aFloat311;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319 + arg0.aFloat306;
	}

	@OriginalMember(owner = "client!ox", name = "cj", descriptor = "(Lclient!ou;)V", line = 245)
	public final void method29627(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319 + arg0.aFloat310;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319 + arg0.aFloat311;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319 + arg0.aFloat306;
	}

	@OriginalMember(owner = "client!ox", name = "cd", descriptor = "(Lclient!ou;)V", line = 245)
	public final void method29628(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319 + arg0.aFloat310;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319 + arg0.aFloat311;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319 + arg0.aFloat306;
	}

	@OriginalMember(owner = "client!ox", name = "dr", descriptor = "(Lclient!ou;)V", line = 253)
	public final void method29629(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "da", descriptor = "(Lclient!ou;)V", line = 253)
	public final void method29630(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "as", descriptor = "(Lclient!ou;)V", line = 253)
	public final void method29631(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "dd", descriptor = "(Lclient!ou;)V", line = 253)
	public final void method29632(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat317;
		@Pc(5) float local5 = this.aFloat318;
		this.aFloat317 = arg0.aFloat302 * local2 + arg0.aFloat305 * local5 + arg0.aFloat301 * this.aFloat319;
		this.aFloat318 = arg0.aFloat303 * local2 + arg0.aFloat312 * local5 + arg0.aFloat308 * this.aFloat319;
		this.aFloat319 = arg0.aFloat304 * local2 + arg0.aFloat307 * local5 + arg0.aFloat309 * this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "dz", descriptor = "(Lclient!ox;F)V", line = 261)
	public final void method29633(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29604(1.0F - arg1);
		this.method29567(method29619(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "at", descriptor = "(Lclient!ox;F)V", line = 261)
	public final void method29634(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29604(1.0F - arg1);
		this.method29567(method29619(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "dt", descriptor = "(Lclient!ox;F)V", line = 261)
	public final void method29635(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29604(1.0F - arg1);
		this.method29567(method29619(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "do", descriptor = "(Lclient!ox;F)V", line = 261)
	public final void method29636(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29604(1.0F - arg1);
		this.method29567(method29619(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "toString", descriptor = "()Ljava/lang/String;", line = 267)
	@Override
	public String toString() {
		return this.aFloat317 + ", " + this.aFloat318 + ", " + this.aFloat319;
	}

	@OriginalMember(owner = "client!ox", name = "rj", descriptor = "()Ljava/lang/String;", line = 267)
	public String method29637() {
		return this.aFloat317 + ", " + this.aFloat318 + ", " + this.aFloat319;
	}
}
