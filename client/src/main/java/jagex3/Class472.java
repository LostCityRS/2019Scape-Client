package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ox")
public final class Class472 {

	@OriginalMember(owner = "client!ox", name = "m", descriptor = "I")
	static int anInt5284;

	@OriginalMember(owner = "client!ox", name = "n", descriptor = "I")
	static int anInt5285;

	@OriginalMember(owner = "client!ox", name = "e", descriptor = "[Lclient!ox;")
	static Class472[] aClass472Array1;

	@OriginalMember(owner = "client!ox", name = "k", descriptor = "F")
	public float aFloat325;

	@OriginalMember(owner = "client!ox", name = "f", descriptor = "F")
	public float aFloat326;

	@OriginalMember(owner = "client!ox", name = "w", descriptor = "F")
	public float aFloat327;

	static {
		new Class472(0.0F, 0.0F, 0.0F);
		new Class472(1.0F, 1.0F, 1.0F);
		aClass472Array1 = new Class472[0];
	}

	@OriginalMember(owner = "client!ox", name = "e", descriptor = "(I)V")
	public static void method29708(@OriginalArg(0) int arg0) {
		anInt5285 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5284 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "n", descriptor = "()Lclient!ox;")
	public static Class472 method29709() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5284].method29720();
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "m", descriptor = "(FFF)Lclient!ox;")
	public static Class472 method29710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0, arg1, arg2);
			} else {
				aClass472Array1[--anInt5284].method29718(arg0, arg1, arg2);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "k", descriptor = "(Lclient!ox;)Lclient!ox;")
	public static Class472 method29711(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29719(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "f", descriptor = "(Lclient!alw;)Lclient!ox;")
	public static Class472 method29712(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29717(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ay", descriptor = "(Lclient!ox;)Lclient!ox;")
	public static Class472 method29722(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29719(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "s", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29726(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29724(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cv", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29727(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29733(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "b", descriptor = "(Lclient!ox;Lclient!ox;)F")
	public static float method29730(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		return arg0.method29729(arg1);
	}

	@OriginalMember(owner = "client!ox", name = "aj", descriptor = "(Lclient!ox;)Lclient!ox;")
	public static Class472 method29731(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29719(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "av", descriptor = "(Lclient!ox;)Lclient!ox;")
	public static Class472 method29732(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29719(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ao", descriptor = "(Lclient!ox;)Lclient!ox;")
	public static Class472 method29735(@OriginalArg(0) Class472 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29719(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ah", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29737(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29736(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "ac", descriptor = "(Lclient!ox;F)Lclient!ox;")
	public static Class472 method29739(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29723(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "co", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29742(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29736(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "ad", descriptor = "(I)V")
	public static void method29743(@OriginalArg(0) int arg0) {
		anInt5285 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5284 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "am", descriptor = "(I)V")
	public static void method29747(@OriginalArg(0) int arg0) {
		anInt5285 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5284 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "ar", descriptor = "()Lclient!ox;")
	public static Class472 method29749() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5284].method29720();
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "aq", descriptor = "()Lclient!ox;")
	public static Class472 method29751() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5284].method29720();
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "ax", descriptor = "(FFF)Lclient!ox;")
	public static Class472 method29752(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0, arg1, arg2);
			} else {
				aClass472Array1[--anInt5284].method29718(arg0, arg1, arg2);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "q", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29755(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29764(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "ab", descriptor = "(Lclient!alw;)Lclient!ox;")
	public static Class472 method29757(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472(arg0);
			} else {
				aClass472Array1[--anInt5284].method29717(arg0);
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "by", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29776(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29724(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bu", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29777(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29724(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bz", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29780(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29764(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bv", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29781(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29764(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "br", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29782(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29764(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "t", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29784(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29733(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "bp", descriptor = "(Lclient!ox;Lclient!ox;)F")
	public static float method29785(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		return arg0.method29729(arg1);
	}

	@OriginalMember(owner = "client!ox", name = "cl", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29788(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29716(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cn", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29793(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29733(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cp", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29795(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29733(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "au", descriptor = "(I)V")
	public static void method29802(@OriginalArg(0) int arg0) {
		anInt5285 = arg0;
		aClass472Array1 = new Class472[arg0];
		anInt5284 = 0;
	}

	@OriginalMember(owner = "client!ox", name = "cm", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29803(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29736(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cs", descriptor = "(Lclient!ox;F)Lclient!ox;")
	public static Class472 method29807(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29723(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cy", descriptor = "(Lclient!ox;F)Lclient!ox;")
	public static Class472 method29808(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29723(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "ap", descriptor = "()Lclient!ox;")
	public static Class472 method29810() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 == 0) {
				return new Class472();
			} else {
				aClass472Array1[--anInt5284].method29720();
				return aClass472Array1[anInt5284];
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "a", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29814(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29716(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "cr", descriptor = "(Lclient!ox;Lclient!ox;)Lclient!ox;")
	public static Class472 method29818(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1) {
		@Pc(2) Class472 local2 = method29711(arg0);
		local2.method29736(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(Lclient!alw;)V")
	public Class472(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat325 = arg0.method22437(-1448911901);
		this.aFloat326 = arg0.method22437(-1562569320);
		this.aFloat327 = arg0.method22437(1008052927);
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(Lclient!ox;)V")
	public Class472(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 = arg0.aFloat325;
		this.aFloat326 = arg0.aFloat326;
		this.aFloat327 = arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(FFF)V")
	public Class472(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat325 = arg0;
		this.aFloat326 = arg1;
		this.aFloat327 = arg2;
	}

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "()V")
	public Class472() {
	}

	@OriginalMember(owner = "client!ox", name = "w", descriptor = "()V")
	public void method29713() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 < anInt5285 - 1) {
				aClass472Array1[anInt5284++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "cg", descriptor = "()V")
	public void method29714() {
		if (this.aFloat325 < 0.0F) {
			this.aFloat325 *= -1.0F;
		}
		if (this.aFloat326 < 0.0F) {
			this.aFloat326 *= -1.0F;
		}
		if (this.aFloat327 < 0.0F) {
			this.aFloat327 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!ox", name = "d", descriptor = "(Lclient!ox;)Z")
	public boolean method29715(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 == arg0.aFloat325 && this.aFloat326 == arg0.aFloat326 && this.aFloat327 == arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "h", descriptor = "(Lclient!ox;)V")
	void method29716(@OriginalArg(0) Class472 arg0) {
		this.method29718(this.aFloat326 * arg0.aFloat327 - this.aFloat327 * arg0.aFloat326, this.aFloat327 * arg0.aFloat325 - this.aFloat325 * arg0.aFloat327, this.aFloat325 * arg0.aFloat326 - this.aFloat326 * arg0.aFloat325);
	}

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "(Lclient!alw;)V")
	public void method29717(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat325 = arg0.method22437(-1498497274);
		this.aFloat326 = arg0.method22437(-1786570425);
		this.aFloat327 = arg0.method22437(1173520798);
	}

	@OriginalMember(owner = "client!ox", name = "u", descriptor = "(FFF)V")
	public void method29718(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat325 = arg0;
		this.aFloat326 = arg1;
		this.aFloat327 = arg2;
	}

	@OriginalMember(owner = "client!ox", name = "z", descriptor = "(Lclient!ox;)V")
	public void method29719(@OriginalArg(0) Class472 arg0) {
		this.method29718(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "()V")
	public void method29720() {
		this.aFloat327 = 0.0F;
		this.aFloat326 = 0.0F;
		this.aFloat325 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "c", descriptor = "()V")
	public void method29721() {
		this.aFloat325 = -this.aFloat325;
		this.aFloat326 = -this.aFloat326;
		this.aFloat327 = -this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "ae", descriptor = "(F)V")
	public void method29723(@OriginalArg(0) float arg0) {
		this.aFloat325 *= arg0;
		this.aFloat326 *= arg0;
		this.aFloat327 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "v", descriptor = "(Lclient!ox;)V")
	public void method29724(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 += arg0.aFloat325;
		this.aFloat326 += arg0.aFloat326;
		this.aFloat327 += arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "dr", descriptor = "(Lclient!ou;)V")
	public void method29725(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "cx", descriptor = "(F)V")
	public void method29728(@OriginalArg(0) float arg0) {
		this.aFloat325 *= arg0;
		this.aFloat326 *= arg0;
		this.aFloat327 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "x", descriptor = "(Lclient!ox;)F")
	public float method29729(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 * arg0.aFloat325 + this.aFloat326 * arg0.aFloat326 + this.aFloat327 * arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "j", descriptor = "(Lclient!ox;)V")
	void method29733(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 *= arg0.aFloat325;
		this.aFloat326 *= arg0.aFloat326;
		this.aFloat327 *= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "da", descriptor = "(Lclient!ou;)V")
	public void method29734(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "ag", descriptor = "(Lclient!ox;)V")
	void method29736(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 /= arg0.aFloat325;
		this.aFloat326 /= arg0.aFloat326;
		this.aFloat327 /= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "al", descriptor = "(F)V")
	public void method29738(@OriginalArg(0) float arg0) {
		this.aFloat325 /= arg0;
		this.aFloat326 /= arg0;
		this.aFloat327 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "r", descriptor = "()V")
	public void method29740() {
		@Pc(4) float local4 = 1.0F / this.method29746();
		this.aFloat325 *= local4;
		this.aFloat326 *= local4;
		this.aFloat327 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "cw", descriptor = "(Lclient!ox;)V")
	void method29741(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 /= arg0.aFloat325;
		this.aFloat326 /= arg0.aFloat326;
		this.aFloat327 /= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat325 + ", " + this.aFloat326 + ", " + this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "cq", descriptor = "(F)V")
	public void method29744(@OriginalArg(0) float arg0) {
		this.aFloat325 /= arg0;
		this.aFloat326 /= arg0;
		this.aFloat327 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method29745() {
		return this.aFloat325 + ", " + this.aFloat326 + ", " + this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "g", descriptor = "()F")
	public float method29746() {
		return (float) Math.sqrt((double) (this.aFloat325 * this.aFloat325 + this.aFloat326 * this.aFloat326 + this.aFloat327 * this.aFloat327));
	}

	@OriginalMember(owner = "client!ox", name = "as", descriptor = "(Lclient!ou;)V")
	public void method29748(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "cc", descriptor = "(Lclient!ov;)V")
	public void method29750(@OriginalArg(0) Class471 arg0) {
		@Pc(8) Class471 local8 = Class471.method29644(this.aFloat325, this.aFloat326, this.aFloat327, 0.0F);
		@Pc(11) Class471 local11 = Class471.method29652(arg0);
		@Pc(15) Class471 local15 = Class471.method29658(local11, local8);
		local15.method29657(arg0);
		this.method29718(local15.aFloat322, local15.aFloat323, local15.aFloat324);
		local8.method29640();
		local11.method29640();
		local15.method29640();
	}

	@OriginalMember(owner = "client!ox", name = "ai", descriptor = "(Lclient!ov;)V")
	public void method29753(@OriginalArg(0) Class471 arg0) {
		@Pc(8) Class471 local8 = Class471.method29644(this.aFloat325, this.aFloat326, this.aFloat327, 0.0F);
		@Pc(11) Class471 local11 = Class471.method29652(arg0);
		@Pc(15) Class471 local15 = Class471.method29658(local11, local8);
		local15.method29657(arg0);
		this.method29718(local15.aFloat322, local15.aFloat323, local15.aFloat324);
		local8.method29640();
		local11.method29640();
		local15.method29640();
	}

	@OriginalMember(owner = "client!ox", name = "ck", descriptor = "(Lclient!ou;)V")
	public void method29754(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327 + arg0.aFloat318;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327 + arg0.aFloat319;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ox", name = "bq", descriptor = "(Lclient!ox;)V")
	public void method29756(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 += arg0.aFloat325;
		this.aFloat326 += arg0.aFloat326;
		this.aFloat327 += arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "az", descriptor = "()V")
	public void method29758() {
		@Pc(2) Class472[] local2 = aClass472Array1;
		synchronized (aClass472Array1) {
			if (anInt5284 < anInt5285 - 1) {
				aClass472Array1[anInt5284++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ox", name = "aa", descriptor = "(Lclient!alw;)V")
	public void method29759(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat325 = arg0.method22437(-1738742967);
		this.aFloat326 = arg0.method22437(258335209);
		this.aFloat327 = arg0.method22437(-512644407);
	}

	@OriginalMember(owner = "client!ox", name = "ak", descriptor = "(Lclient!ox;)V")
	public void method29760(@OriginalArg(0) Class472 arg0) {
		this.method29718(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ox", name = "an", descriptor = "(Lclient!ox;)V")
	public void method29761(@OriginalArg(0) Class472 arg0) {
		this.method29718(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ox", name = "bf", descriptor = "()V")
	public void method29762() {
		this.aFloat327 = 0.0F;
		this.aFloat326 = 0.0F;
		this.aFloat325 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "bl", descriptor = "()V")
	public void method29763() {
		this.aFloat327 = 0.0F;
		this.aFloat326 = 0.0F;
		this.aFloat325 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "y", descriptor = "(Lclient!ox;)V")
	public void method29764(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 -= arg0.aFloat325;
		this.aFloat326 -= arg0.aFloat326;
		this.aFloat327 -= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "ba", descriptor = "(Lclient!ox;)F")
	public float method29765(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 * arg0.aFloat325 + this.aFloat326 * arg0.aFloat326 + this.aFloat327 * arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bx", descriptor = "(Lclient!ox;)Z")
	public boolean method29766(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 == arg0.aFloat325 && this.aFloat326 == arg0.aFloat326 && this.aFloat327 == arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bd", descriptor = "(Lclient!ox;)Z")
	public boolean method29767(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 == arg0.aFloat325 && this.aFloat326 == arg0.aFloat326 && this.aFloat327 == arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bc", descriptor = "()V")
	public void method29768() {
		this.aFloat325 = -this.aFloat325;
		this.aFloat326 = -this.aFloat326;
		this.aFloat327 = -this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bi", descriptor = "()V")
	public void method29769() {
		this.aFloat325 = -this.aFloat325;
		this.aFloat326 = -this.aFloat326;
		this.aFloat327 = -this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bn", descriptor = "()V")
	public void method29770() {
		@Pc(4) float local4 = 1.0F / this.method29746();
		this.aFloat325 *= local4;
		this.aFloat326 *= local4;
		this.aFloat327 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "bt", descriptor = "()V")
	public void method29771() {
		@Pc(4) float local4 = 1.0F / this.method29746();
		this.aFloat325 *= local4;
		this.aFloat326 *= local4;
		this.aFloat327 *= local4;
	}

	@OriginalMember(owner = "client!ox", name = "dz", descriptor = "(Lclient!ox;F)V")
	public void method29772(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29723(1.0F - arg1);
		this.method29724(method29739(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "bm", descriptor = "(Lclient!ox;)V")
	public void method29773(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 += arg0.aFloat325;
		this.aFloat326 += arg0.aFloat326;
		this.aFloat327 += arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bb", descriptor = "(Lclient!ox;)V")
	public void method29774(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 += arg0.aFloat325;
		this.aFloat326 += arg0.aFloat326;
		this.aFloat327 += arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "be", descriptor = "(Lclient!ox;F)V")
	public void method29775(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.aFloat325 += arg0.aFloat325 * arg1;
		this.aFloat326 += arg0.aFloat326 * arg1;
		this.aFloat327 += arg0.aFloat327 * arg1;
	}

	@OriginalMember(owner = "client!ox", name = "bw", descriptor = "(Lclient!ox;)V")
	public void method29778(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 -= arg0.aFloat325;
		this.aFloat326 -= arg0.aFloat326;
		this.aFloat327 -= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bo", descriptor = "(Lclient!ox;)V")
	public void method29779(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 -= arg0.aFloat325;
		this.aFloat326 -= arg0.aFloat326;
		this.aFloat327 -= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bg", descriptor = "(Lclient!ox;)F")
	public float method29783(@OriginalArg(0) Class472 arg0) {
		return this.aFloat325 * arg0.aFloat325 + this.aFloat326 * arg0.aFloat326 + this.aFloat327 * arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bj", descriptor = "(Lclient!ox;)V")
	void method29786(@OriginalArg(0) Class472 arg0) {
		this.method29718(this.aFloat326 * arg0.aFloat327 - this.aFloat327 * arg0.aFloat326, this.aFloat327 * arg0.aFloat325 - this.aFloat325 * arg0.aFloat327, this.aFloat325 * arg0.aFloat326 - this.aFloat326 * arg0.aFloat325);
	}

	@OriginalMember(owner = "client!ox", name = "bs", descriptor = "(Lclient!ox;)V")
	void method29787(@OriginalArg(0) Class472 arg0) {
		this.method29718(this.aFloat326 * arg0.aFloat327 - this.aFloat327 * arg0.aFloat326, this.aFloat327 * arg0.aFloat325 - this.aFloat325 * arg0.aFloat327, this.aFloat325 * arg0.aFloat326 - this.aFloat326 * arg0.aFloat325);
	}

	@OriginalMember(owner = "client!ox", name = "at", descriptor = "(Lclient!ox;F)V")
	public void method29789(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29723(1.0F - arg1);
		this.method29724(method29739(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "ce", descriptor = "(Lclient!ox;)V")
	void method29790(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 *= arg0.aFloat325;
		this.aFloat326 *= arg0.aFloat326;
		this.aFloat327 *= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "cu", descriptor = "(Lclient!ox;)V")
	void method29791(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 *= arg0.aFloat325;
		this.aFloat326 *= arg0.aFloat326;
		this.aFloat327 *= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "ci", descriptor = "(Lclient!ox;)V")
	void method29792(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 *= arg0.aFloat325;
		this.aFloat326 *= arg0.aFloat326;
		this.aFloat327 *= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "aw", descriptor = "(Lclient!ou;)V")
	public void method29794(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327 + arg0.aFloat318;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327 + arg0.aFloat319;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ox", name = "ca", descriptor = "(F)V")
	public void method29796(@OriginalArg(0) float arg0) {
		this.aFloat325 *= arg0;
		this.aFloat326 *= arg0;
		this.aFloat327 *= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "o", descriptor = "(Lclient!ox;F)V")
	public void method29797(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.aFloat325 += arg0.aFloat325 * arg1;
		this.aFloat326 += arg0.aFloat326 * arg1;
		this.aFloat327 += arg0.aFloat327 * arg1;
	}

	@OriginalMember(owner = "client!ox", name = "ch", descriptor = "(F)V")
	public void method29798(@OriginalArg(0) float arg0) {
		this.aFloat325 /= arg0;
		this.aFloat326 /= arg0;
		this.aFloat327 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "ct", descriptor = "(Lclient!ox;)V")
	void method29799(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 /= arg0.aFloat325;
		this.aFloat326 /= arg0.aFloat326;
		this.aFloat327 /= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "cf", descriptor = "(Lclient!ox;)V")
	void method29800(@OriginalArg(0) Class472 arg0) {
		this.aFloat325 /= arg0.aFloat325;
		this.aFloat326 /= arg0.aFloat326;
		this.aFloat327 /= arg0.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bk", descriptor = "()V")
	public void method29801() {
		this.aFloat327 = 0.0F;
		this.aFloat326 = 0.0F;
		this.aFloat325 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "i", descriptor = "()V")
	public void method29804() {
		if (this.aFloat325 < 0.0F) {
			this.aFloat325 *= -1.0F;
		}
		if (this.aFloat326 < 0.0F) {
			this.aFloat326 *= -1.0F;
		}
		if (this.aFloat327 < 0.0F) {
			this.aFloat327 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!ox", name = "af", descriptor = "(Lclient!alw;)V")
	public void method29805(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat325 = arg0.method22437(292785100);
		this.aFloat326 = arg0.method22437(662635158);
		this.aFloat327 = arg0.method22437(-229718110);
	}

	@OriginalMember(owner = "client!ox", name = "cb", descriptor = "(F)V")
	public void method29806(@OriginalArg(0) float arg0) {
		this.aFloat325 /= arg0;
		this.aFloat326 /= arg0;
		this.aFloat327 /= arg0;
	}

	@OriginalMember(owner = "client!ox", name = "cz", descriptor = "(Lclient!ou;)V")
	public void method29809(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327 + arg0.aFloat318;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327 + arg0.aFloat319;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ox", name = "cj", descriptor = "(Lclient!ou;)V")
	public void method29811(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327 + arg0.aFloat318;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327 + arg0.aFloat319;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ox", name = "cd", descriptor = "(Lclient!ou;)V")
	public void method29812(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327 + arg0.aFloat318;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327 + arg0.aFloat319;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ox", name = "dd", descriptor = "(Lclient!ou;)V")
	public void method29813(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat325;
		@Pc(5) float local5 = this.aFloat326;
		this.aFloat325 = arg0.aFloat310 * local2 + arg0.aFloat313 * local5 + arg0.aFloat309 * this.aFloat327;
		this.aFloat326 = arg0.aFloat311 * local2 + arg0.aFloat320 * local5 + arg0.aFloat316 * this.aFloat327;
		this.aFloat327 = arg0.aFloat312 * local2 + arg0.aFloat315 * local5 + arg0.aFloat317 * this.aFloat327;
	}

	@OriginalMember(owner = "client!ox", name = "bh", descriptor = "()V")
	public void method29815() {
		this.aFloat327 = 0.0F;
		this.aFloat326 = 0.0F;
		this.aFloat325 = 0.0F;
	}

	@OriginalMember(owner = "client!ox", name = "dt", descriptor = "(Lclient!ox;F)V")
	public void method29816(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29723(1.0F - arg1);
		this.method29724(method29739(arg0, arg1));
	}

	@OriginalMember(owner = "client!ox", name = "do", descriptor = "(Lclient!ox;F)V")
	public void method29817(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) {
		this.method29723(1.0F - arg1);
		this.method29724(method29739(arg0, arg1));
	}
}
