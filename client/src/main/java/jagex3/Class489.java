package jagex3;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class489 {

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	static int anInt5319;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	static int anInt5320;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "F")
	static final float aFloat330 = 1.0E-4F;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[Lclient!pq;")
	static Class489[] aClass489Array10 = new Class489[0];

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!pq;")
	public static final Class489 aClass489_99 = new Class489();

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "[F")
	public float[] aFloatArray116 = new float[16];

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "()Lclient!pq;")
	public static Class489 method30055() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5320].method30017();
				return aClass489Array10[anInt5320];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "ao", descriptor = "(I)V")
	public static void method30061(@OriginalArg(0) int arg0) {
		anInt5319 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5320 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "aj", descriptor = "(I)V")
	public static void method30063(@OriginalArg(0) int arg0) {
		anInt5319 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5320 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "ay", descriptor = "(I)V")
	public static void method30064(@OriginalArg(0) int arg0) {
		anInt5319 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5320 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
	public static void method30065(@OriginalArg(0) int arg0) {
		anInt5319 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5320 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "ab", descriptor = "()Lclient!pq;")
	public static Class489 method30072() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5320].method30017();
				return aClass489Array10[anInt5320];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "az", descriptor = "()Lclient!pq;")
	public static Class489 method30086() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5320].method30017();
				return aClass489Array10[anInt5320];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "aa", descriptor = "()Lclient!pq;")
	public static Class489 method30116() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5320].method30017();
				return aClass489Array10[anInt5320];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!alw;Z)V")
	public Class489(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		this.method30014(arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class489(@OriginalArg(0) Class489 arg0) {
		this.method30018(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class489() {
		this.method30017();
	}

	@OriginalMember(owner = "client!pq", name = "ad", descriptor = "([F)[F")
	public float[] method30008(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30009(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class489)) {
			return false;
		}
		@Pc(7) Class489 local7 = (Class489) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray116[local9] != local7.aFloatArray116[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "ed", descriptor = "([F)[F")
	public float[] method30010(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray116[4];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray116[12];
		arg0[9] = this.aFloatArray116[13];
		arg0[10] = this.aFloatArray116[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ba", descriptor = "()V")
	public void method30011() {
		@Pc(4) float local4 = 1.0F / this.method30024();
		@Pc(96) float local96 = (this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[14] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[14] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[12] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[13] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		this.aFloatArray116[0] = local96;
		this.aFloatArray116[1] = local189;
		this.aFloatArray116[2] = local281;
		this.aFloatArray116[3] = local374;
		this.aFloatArray116[4] = local467;
		this.aFloatArray116[5] = local559;
		this.aFloatArray116[6] = local652;
		this.aFloatArray116[7] = local744;
		this.aFloatArray116[8] = local836;
		this.aFloatArray116[9] = local929;
		this.aFloatArray116[10] = local1021;
		this.aFloatArray116[11] = local1114;
		this.aFloatArray116[12] = local1207;
		this.aFloatArray116[13] = local1299;
		this.aFloatArray116[14] = local1392;
		this.aFloatArray116[15] = local1484;
	}

	@OriginalMember(owner = "client!pq", name = "dw", descriptor = "([F)[F")
	public float[] method30012(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "bl", descriptor = "(Lclient!alw;Z)V")
	void method30013(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.method22437(-1580746208);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29557(Class464.method29463(arg0.method22494((byte) -74)));
		local5.method29558(Class464.method29463(arg0.method22494((byte) -63)));
		local5.method29559(Class464.method29463(arg0.method22494((byte) -52)));
		local5.method29568((float) arg0.method22494((byte) -48), (float) arg0.method22494((byte) -80), (float) arg0.method22494((byte) -55));
		this.method30023(local5);
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(Lclient!alw;Z)V")
	void method30014(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.method22437(1460081112);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29557(Class464.method29463(arg0.method22494((byte) -30)));
		local5.method29558(Class464.method29463(arg0.method22494((byte) -115)));
		local5.method29559(Class464.method29463(arg0.method22494((byte) -100)));
		local5.method29568((float) arg0.method22494((byte) -18), (float) arg0.method22494((byte) -65), (float) arg0.method22494((byte) -26));
		this.method30023(local5);
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(FFF)V")
	public void method30015(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30031(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "()[F")
	public float[] method30016() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray116[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray116[2];
			local36 = this.aFloatArray116[10];
			@Pc(42) double local42 = (double) this.aFloatArray116[4];
			@Pc(48) double local48 = (double) this.aFloatArray116[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray116[1];
			local36 = this.aFloatArray116[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "()V")
	public void method30017() {
		this.aFloatArray116[0] = 1.0F;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 1.0F;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 1.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "(Lclient!pq;)V")
	public void method30018(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "()V")
	public void method30019() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 < anInt5319 - 1) {
				aClass489Array10[anInt5320++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "(Lclient!pq;Lclient!pq;)V")
	public void method30020(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray116[0] * arg1.aFloatArray116[0] + arg0.aFloatArray116[1] * arg1.aFloatArray116[4] + arg0.aFloatArray116[2] * arg1.aFloatArray116[8] + arg0.aFloatArray116[3] * arg1.aFloatArray116[12];
		@Pc(79) float local79 = arg0.aFloatArray116[0] * arg1.aFloatArray116[1] + arg0.aFloatArray116[1] * arg1.aFloatArray116[5] + arg0.aFloatArray116[2] * arg1.aFloatArray116[9] + arg0.aFloatArray116[3] * arg1.aFloatArray116[13];
		@Pc(119) float local119 = arg0.aFloatArray116[0] * arg1.aFloatArray116[2] + arg0.aFloatArray116[1] * arg1.aFloatArray116[6] + arg0.aFloatArray116[2] * arg1.aFloatArray116[10] + arg0.aFloatArray116[3] * arg1.aFloatArray116[14];
		@Pc(159) float local159 = arg0.aFloatArray116[0] * arg1.aFloatArray116[3] + arg0.aFloatArray116[1] * arg1.aFloatArray116[7] + arg0.aFloatArray116[2] * arg1.aFloatArray116[11] + arg0.aFloatArray116[3] * arg1.aFloatArray116[15];
		@Pc(199) float local199 = arg0.aFloatArray116[4] * arg1.aFloatArray116[0] + arg0.aFloatArray116[5] * arg1.aFloatArray116[4] + arg0.aFloatArray116[6] * arg1.aFloatArray116[8] + arg0.aFloatArray116[7] * arg1.aFloatArray116[12];
		@Pc(239) float local239 = arg0.aFloatArray116[4] * arg1.aFloatArray116[1] + arg0.aFloatArray116[5] * arg1.aFloatArray116[5] + arg0.aFloatArray116[6] * arg1.aFloatArray116[9] + arg0.aFloatArray116[7] * arg1.aFloatArray116[13];
		@Pc(279) float local279 = arg0.aFloatArray116[4] * arg1.aFloatArray116[2] + arg0.aFloatArray116[5] * arg1.aFloatArray116[6] + arg0.aFloatArray116[6] * arg1.aFloatArray116[10] + arg0.aFloatArray116[7] * arg1.aFloatArray116[14];
		@Pc(319) float local319 = arg0.aFloatArray116[4] * arg1.aFloatArray116[3] + arg0.aFloatArray116[5] * arg1.aFloatArray116[7] + arg0.aFloatArray116[6] * arg1.aFloatArray116[11] + arg0.aFloatArray116[7] * arg1.aFloatArray116[15];
		@Pc(359) float local359 = arg0.aFloatArray116[8] * arg1.aFloatArray116[0] + arg0.aFloatArray116[9] * arg1.aFloatArray116[4] + arg0.aFloatArray116[10] * arg1.aFloatArray116[8] + arg0.aFloatArray116[11] * arg1.aFloatArray116[12];
		@Pc(399) float local399 = arg0.aFloatArray116[8] * arg1.aFloatArray116[1] + arg0.aFloatArray116[9] * arg1.aFloatArray116[5] + arg0.aFloatArray116[10] * arg1.aFloatArray116[9] + arg0.aFloatArray116[11] * arg1.aFloatArray116[13];
		@Pc(439) float local439 = arg0.aFloatArray116[8] * arg1.aFloatArray116[2] + arg0.aFloatArray116[9] * arg1.aFloatArray116[6] + arg0.aFloatArray116[10] * arg1.aFloatArray116[10] + arg0.aFloatArray116[11] * arg1.aFloatArray116[14];
		@Pc(479) float local479 = arg0.aFloatArray116[8] * arg1.aFloatArray116[3] + arg0.aFloatArray116[9] * arg1.aFloatArray116[7] + arg0.aFloatArray116[10] * arg1.aFloatArray116[11] + arg0.aFloatArray116[11] * arg1.aFloatArray116[15];
		@Pc(519) float local519 = arg0.aFloatArray116[12] * arg1.aFloatArray116[0] + arg0.aFloatArray116[13] * arg1.aFloatArray116[4] + arg0.aFloatArray116[14] * arg1.aFloatArray116[8] + arg0.aFloatArray116[15] * arg1.aFloatArray116[12];
		@Pc(559) float local559 = arg0.aFloatArray116[12] * arg1.aFloatArray116[1] + arg0.aFloatArray116[13] * arg1.aFloatArray116[5] + arg0.aFloatArray116[14] * arg1.aFloatArray116[9] + arg0.aFloatArray116[15] * arg1.aFloatArray116[13];
		@Pc(599) float local599 = arg0.aFloatArray116[12] * arg1.aFloatArray116[2] + arg0.aFloatArray116[13] * arg1.aFloatArray116[6] + arg0.aFloatArray116[14] * arg1.aFloatArray116[10] + arg0.aFloatArray116[15] * arg1.aFloatArray116[14];
		@Pc(639) float local639 = arg0.aFloatArray116[12] * arg1.aFloatArray116[3] + arg0.aFloatArray116[13] * arg1.aFloatArray116[7] + arg0.aFloatArray116[14] * arg1.aFloatArray116[11] + arg0.aFloatArray116[15] * arg1.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "aw", descriptor = "([F)[F")
	public float[] method30021(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(FFF)V")
	public void method30022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(5) double local5 = Math.sin((double) arg0 / 2.0D);
		@Pc(11) double local11 = Math.cos((double) arg0 / 2.0D);
		@Pc(17) double local17 = Math.sin((double) arg1 / 2.0D);
		@Pc(23) double local23 = Math.cos((double) arg1 / 2.0D);
		@Pc(29) double local29 = Math.sin((double) arg2 / 2.0D);
		@Pc(35) double local35 = Math.cos((double) arg2 / 2.0D);
		@Pc(48) float local48 = (float) (local5 * local23 * local29 + local11 * local17 * local35);
		@Pc(61) float local61 = (float) (local5 * local23 * local35 - local11 * local17 * local29);
		@Pc(74) float local74 = (float) (local11 * local23 * local29 - local5 * local17 * local35);
		@Pc(87) float local87 = (float) (local11 * local23 * local35 + local5 * local17 * local29);
		@Pc(91) float local91 = local87 * local87;
		@Pc(95) float local95 = local87 * local48;
		@Pc(99) float local99 = local87 * local61;
		@Pc(103) float local103 = local87 * local74;
		@Pc(107) float local107 = local48 * local48;
		@Pc(111) float local111 = local48 * local61;
		@Pc(115) float local115 = local48 * local74;
		@Pc(119) float local119 = local61 * local61;
		@Pc(123) float local123 = local61 * local74;
		@Pc(127) float local127 = local74 * local74;
		this.aFloatArray116[0] = local107 + local91 - local127 - local119;
		this.aFloatArray116[1] = local111 + local103 + local111 + local103;
		this.aFloatArray116[2] = local115 - local99 - local99 + local115;
		this.aFloatArray116[4] = local111 - local103 - local103 + local111;
		this.aFloatArray116[5] = local119 + local91 - local107 - local127;
		this.aFloatArray116[6] = local123 + local95 + local123 + local95;
		this.aFloatArray116[8] = local115 + local99 + local115 + local99;
		this.aFloatArray116[9] = local123 - local95 - local95 + local123;
		this.aFloatArray116[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "(Lclient!ou;)V")
	public void method30023(@OriginalArg(0) Class470 arg0) {
		this.aFloatArray116[0] = arg0.aFloat310;
		this.aFloatArray116[1] = arg0.aFloat311;
		this.aFloatArray116[2] = arg0.aFloat312;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = arg0.aFloat313;
		this.aFloatArray116[5] = arg0.aFloat320;
		this.aFloatArray116[6] = arg0.aFloat315;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0.aFloat309;
		this.aFloatArray116[9] = arg0.aFloat316;
		this.aFloatArray116[10] = arg0.aFloat317;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = arg0.aFloat318;
		this.aFloatArray116[13] = arg0.aFloat319;
		this.aFloatArray116[14] = arg0.aFloat314;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "()F")
	float method30024() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "()V")
	public void method30025() {
		@Pc(4) float local4 = 1.0F / this.method30024();
		@Pc(96) float local96 = (this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[14] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[14] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[12] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[13] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		this.aFloatArray116[0] = local96;
		this.aFloatArray116[1] = local189;
		this.aFloatArray116[2] = local281;
		this.aFloatArray116[3] = local374;
		this.aFloatArray116[4] = local467;
		this.aFloatArray116[5] = local559;
		this.aFloatArray116[6] = local652;
		this.aFloatArray116[7] = local744;
		this.aFloatArray116[8] = local836;
		this.aFloatArray116[9] = local929;
		this.aFloatArray116[10] = local1021;
		this.aFloatArray116[11] = local1114;
		this.aFloatArray116[12] = local1207;
		this.aFloatArray116[13] = local1299;
		this.aFloatArray116[14] = local1392;
		this.aFloatArray116[15] = local1484;
	}

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "(FFFF)V")
	public void method30026(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray116[0] = arg0;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg1;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = arg2;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "()Z")
	public boolean method30027() {
		return this.aFloatArray116[0] == 1.0F && this.aFloatArray116[1] == 0.0F && this.aFloatArray116[2] == 0.0F && this.aFloatArray116[3] == 0.0F && this.aFloatArray116[4] == 0.0F && this.aFloatArray116[5] == 1.0F && this.aFloatArray116[6] == 0.0F && this.aFloatArray116[7] == 0.0F && this.aFloatArray116[8] == 0.0F && this.aFloatArray116[9] == 0.0F && this.aFloatArray116[10] == 1.0F && this.aFloatArray116[11] == 0.0F && this.aFloatArray116[12] == 0.0F && this.aFloatArray116[13] == 0.0F && this.aFloatArray116[14] == 0.0F && this.aFloatArray116[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "(FFF[F)V")
	public void method30028(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "bt", descriptor = "(Lclient!pq;)V")
	public void method30029(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(FFF[F)V")
	public void method30030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2;
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2;
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(FFFFFF)V")
	public void method30031(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFFF)V")
	public void method30032(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method30089(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "bx", descriptor = "()[F")
	float[] method30033() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray116[2] < 0.999D && (double) this.aFloatArray116[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray116[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray116[6] / local35, (double) this.aFloatArray116[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray116[1] / local35, (double) this.aFloatArray116[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray116[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray116[9], (double) this.aFloatArray116[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "ar", descriptor = "([F)[F")
	public float[] method30034(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		arg0[8] = this.aFloatArray116[2];
		arg0[9] = this.aFloatArray116[6];
		arg0[10] = this.aFloatArray116[10];
		arg0[11] = this.aFloatArray116[14];
		arg0[12] = this.aFloatArray116[3];
		arg0[13] = this.aFloatArray116[7];
		arg0[14] = this.aFloatArray116[11];
		arg0[15] = this.aFloatArray116[15];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cl", descriptor = "(FFFF)V")
	public void method30035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray116[0] = arg0;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg1;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = arg2;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "(FFFFFFFFF)V")
	public void method30036(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30031(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "cy", descriptor = "(FFFFFF)V")
	void method30037(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "ds", descriptor = "([F)[F")
	public float[] method30038(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ah", descriptor = "([F)[F")
	public float[] method30039(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[0];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[4];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "al", descriptor = "([F)[F")
	public float[] method30040(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[0];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[4];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ac", descriptor = "([F)[F")
	public float[] method30041(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[1];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[5];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ai", descriptor = "([F)[F")
	public float[] method30042(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[1];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[5];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cw", descriptor = "(FFF[F)V")
	public void method30043(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2;
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2;
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "dz", descriptor = "()F")
	public float method30044() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "at", descriptor = "()V")
	public void method30045() {
		@Pc(4) float local4 = this.aFloatArray116[0];
		@Pc(9) float local9 = this.aFloatArray116[4];
		@Pc(14) float local14 = this.aFloatArray116[8];
		@Pc(19) float local19 = this.aFloatArray116[12];
		@Pc(24) float local24 = this.aFloatArray116[1];
		@Pc(29) float local29 = this.aFloatArray116[5];
		@Pc(34) float local34 = this.aFloatArray116[9];
		@Pc(39) float local39 = this.aFloatArray116[13];
		@Pc(44) float local44 = this.aFloatArray116[2];
		@Pc(49) float local49 = this.aFloatArray116[6];
		@Pc(54) float local54 = this.aFloatArray116[10];
		@Pc(59) float local59 = this.aFloatArray116[14];
		@Pc(64) float local64 = this.aFloatArray116[3];
		@Pc(69) float local69 = this.aFloatArray116[7];
		@Pc(74) float local74 = this.aFloatArray116[11];
		@Pc(79) float local79 = this.aFloatArray116[15];
		this.aFloatArray116[0] = local4;
		this.aFloatArray116[1] = local9;
		this.aFloatArray116[2] = local14;
		this.aFloatArray116[3] = local19;
		this.aFloatArray116[4] = local24;
		this.aFloatArray116[5] = local29;
		this.aFloatArray116[6] = local34;
		this.aFloatArray116[7] = local39;
		this.aFloatArray116[8] = local44;
		this.aFloatArray116[9] = local49;
		this.aFloatArray116[10] = local54;
		this.aFloatArray116[11] = local59;
		this.aFloatArray116[12] = local64;
		this.aFloatArray116[13] = local69;
		this.aFloatArray116[14] = local74;
		this.aFloatArray116[15] = local79;
	}

	@OriginalMember(owner = "client!pq", name = "ag", descriptor = "()F")
	public float method30046() {
		return (this.aFloatArray116[14] - this.aFloatArray116[15]) / (this.aFloatArray116[11] - this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "am", descriptor = "([F)[F")
	public float[] method30047(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "du", descriptor = "()V")
	public void method30048() {
		@Pc(4) float local4 = this.aFloatArray116[0];
		@Pc(9) float local9 = this.aFloatArray116[4];
		@Pc(14) float local14 = this.aFloatArray116[8];
		@Pc(19) float local19 = this.aFloatArray116[12];
		@Pc(24) float local24 = this.aFloatArray116[1];
		@Pc(29) float local29 = this.aFloatArray116[5];
		@Pc(34) float local34 = this.aFloatArray116[9];
		@Pc(39) float local39 = this.aFloatArray116[13];
		@Pc(44) float local44 = this.aFloatArray116[2];
		@Pc(49) float local49 = this.aFloatArray116[6];
		@Pc(54) float local54 = this.aFloatArray116[10];
		@Pc(59) float local59 = this.aFloatArray116[14];
		@Pc(64) float local64 = this.aFloatArray116[3];
		@Pc(69) float local69 = this.aFloatArray116[7];
		@Pc(74) float local74 = this.aFloatArray116[11];
		@Pc(79) float local79 = this.aFloatArray116[15];
		this.aFloatArray116[0] = local4;
		this.aFloatArray116[1] = local9;
		this.aFloatArray116[2] = local14;
		this.aFloatArray116[3] = local19;
		this.aFloatArray116[4] = local24;
		this.aFloatArray116[5] = local29;
		this.aFloatArray116[6] = local34;
		this.aFloatArray116[7] = local39;
		this.aFloatArray116[8] = local44;
		this.aFloatArray116[9] = local49;
		this.aFloatArray116[10] = local54;
		this.aFloatArray116[11] = local59;
		this.aFloatArray116[12] = local64;
		this.aFloatArray116[13] = local69;
		this.aFloatArray116[14] = local74;
		this.aFloatArray116[15] = local79;
	}

	@OriginalMember(owner = "client!pq", name = "cm", descriptor = "(FFFF)V")
	public void method30049(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method30089(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "do", descriptor = "()F")
	public float method30050() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "aq", descriptor = "([F)[F")
	public float[] method30051(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ax", descriptor = "([F)[F")
	public float[] method30052(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray116[4];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray116[12];
		arg0[9] = this.aFloatArray116[13];
		arg0[10] = this.aFloatArray116[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30053(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class489)) {
			return false;
		}
		@Pc(7) Class489 local7 = (Class489) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray116[local9] != local7.aFloatArray116[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method30016();
		this.method30139();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				if (local16 > 0) {
					local3.append("\t");
				}
				@Pc(34) float local34 = this.aFloatArray116[local11 * 4 + local16];
				if (Math.sqrt((double) (local34 * local34)) < 9.999999747378752E-5D) {
					local34 = 0.0F;
				}
				local3.append(local34);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!pq", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class489)) {
			return false;
		}
		@Pc(7) Class489 local7 = (Class489) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray116[local9] != local7.aFloatArray116[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30054(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class489)) {
			return false;
		}
		@Pc(7) Class489 local7 = (Class489) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray116[local9] != local7.aFloatArray116[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "cn", descriptor = "(FFF[F)V")
	public void method30056(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "as", descriptor = "([F)[F")
	public float[] method30057(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "rk", descriptor = "()I")
	public int method30058() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "rm", descriptor = "()I")
	public int method30059() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "ri", descriptor = "()I")
	public int method30060() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "be", descriptor = "(Lclient!pq;Lclient!pq;)V")
	public void method30062(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray116[0] * arg1.aFloatArray116[0] + arg0.aFloatArray116[1] * arg1.aFloatArray116[4] + arg0.aFloatArray116[2] * arg1.aFloatArray116[8] + arg0.aFloatArray116[3] * arg1.aFloatArray116[12];
		@Pc(79) float local79 = arg0.aFloatArray116[0] * arg1.aFloatArray116[1] + arg0.aFloatArray116[1] * arg1.aFloatArray116[5] + arg0.aFloatArray116[2] * arg1.aFloatArray116[9] + arg0.aFloatArray116[3] * arg1.aFloatArray116[13];
		@Pc(119) float local119 = arg0.aFloatArray116[0] * arg1.aFloatArray116[2] + arg0.aFloatArray116[1] * arg1.aFloatArray116[6] + arg0.aFloatArray116[2] * arg1.aFloatArray116[10] + arg0.aFloatArray116[3] * arg1.aFloatArray116[14];
		@Pc(159) float local159 = arg0.aFloatArray116[0] * arg1.aFloatArray116[3] + arg0.aFloatArray116[1] * arg1.aFloatArray116[7] + arg0.aFloatArray116[2] * arg1.aFloatArray116[11] + arg0.aFloatArray116[3] * arg1.aFloatArray116[15];
		@Pc(199) float local199 = arg0.aFloatArray116[4] * arg1.aFloatArray116[0] + arg0.aFloatArray116[5] * arg1.aFloatArray116[4] + arg0.aFloatArray116[6] * arg1.aFloatArray116[8] + arg0.aFloatArray116[7] * arg1.aFloatArray116[12];
		@Pc(239) float local239 = arg0.aFloatArray116[4] * arg1.aFloatArray116[1] + arg0.aFloatArray116[5] * arg1.aFloatArray116[5] + arg0.aFloatArray116[6] * arg1.aFloatArray116[9] + arg0.aFloatArray116[7] * arg1.aFloatArray116[13];
		@Pc(279) float local279 = arg0.aFloatArray116[4] * arg1.aFloatArray116[2] + arg0.aFloatArray116[5] * arg1.aFloatArray116[6] + arg0.aFloatArray116[6] * arg1.aFloatArray116[10] + arg0.aFloatArray116[7] * arg1.aFloatArray116[14];
		@Pc(319) float local319 = arg0.aFloatArray116[4] * arg1.aFloatArray116[3] + arg0.aFloatArray116[5] * arg1.aFloatArray116[7] + arg0.aFloatArray116[6] * arg1.aFloatArray116[11] + arg0.aFloatArray116[7] * arg1.aFloatArray116[15];
		@Pc(359) float local359 = arg0.aFloatArray116[8] * arg1.aFloatArray116[0] + arg0.aFloatArray116[9] * arg1.aFloatArray116[4] + arg0.aFloatArray116[10] * arg1.aFloatArray116[8] + arg0.aFloatArray116[11] * arg1.aFloatArray116[12];
		@Pc(399) float local399 = arg0.aFloatArray116[8] * arg1.aFloatArray116[1] + arg0.aFloatArray116[9] * arg1.aFloatArray116[5] + arg0.aFloatArray116[10] * arg1.aFloatArray116[9] + arg0.aFloatArray116[11] * arg1.aFloatArray116[13];
		@Pc(439) float local439 = arg0.aFloatArray116[8] * arg1.aFloatArray116[2] + arg0.aFloatArray116[9] * arg1.aFloatArray116[6] + arg0.aFloatArray116[10] * arg1.aFloatArray116[10] + arg0.aFloatArray116[11] * arg1.aFloatArray116[14];
		@Pc(479) float local479 = arg0.aFloatArray116[8] * arg1.aFloatArray116[3] + arg0.aFloatArray116[9] * arg1.aFloatArray116[7] + arg0.aFloatArray116[10] * arg1.aFloatArray116[11] + arg0.aFloatArray116[11] * arg1.aFloatArray116[15];
		@Pc(519) float local519 = arg0.aFloatArray116[12] * arg1.aFloatArray116[0] + arg0.aFloatArray116[13] * arg1.aFloatArray116[4] + arg0.aFloatArray116[14] * arg1.aFloatArray116[8] + arg0.aFloatArray116[15] * arg1.aFloatArray116[12];
		@Pc(559) float local559 = arg0.aFloatArray116[12] * arg1.aFloatArray116[1] + arg0.aFloatArray116[13] * arg1.aFloatArray116[5] + arg0.aFloatArray116[14] * arg1.aFloatArray116[9] + arg0.aFloatArray116[15] * arg1.aFloatArray116[13];
		@Pc(599) float local599 = arg0.aFloatArray116[12] * arg1.aFloatArray116[2] + arg0.aFloatArray116[13] * arg1.aFloatArray116[6] + arg0.aFloatArray116[14] * arg1.aFloatArray116[10] + arg0.aFloatArray116[15] * arg1.aFloatArray116[14];
		@Pc(639) float local639 = arg0.aFloatArray116[12] * arg1.aFloatArray116[3] + arg0.aFloatArray116[13] * arg1.aFloatArray116[7] + arg0.aFloatArray116[14] * arg1.aFloatArray116[11] + arg0.aFloatArray116[15] * arg1.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30066(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class489)) {
			return false;
		}
		@Pc(7) Class489 local7 = (Class489) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray116[local9] != local7.aFloatArray116[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "ct", descriptor = "(FFFFFF)V")
	public void method30067(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "ae", descriptor = "()F")
	public float method30068() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "ak", descriptor = "()V")
	public void method30069() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 < anInt5319 - 1) {
				aClass489Array10[anInt5320++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "an", descriptor = "(Lclient!alw;Z)V")
	void method30070(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.method22437(1224159301);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29557(Class464.method29463(arg0.method22494((byte) -127)));
		local5.method29558(Class464.method29463(arg0.method22494((byte) -107)));
		local5.method29559(Class464.method29463(arg0.method22494((byte) -71)));
		local5.method29568((float) arg0.method22494((byte) -83), (float) arg0.method22494((byte) -89), (float) arg0.method22494((byte) -71));
		this.method30023(local5);
	}

	@OriginalMember(owner = "client!pq", name = "bf", descriptor = "(Lclient!alw;Z)V")
	void method30071(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.method22437(-1074601825);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29557(Class464.method29463(arg0.method22494((byte) -73)));
		local5.method29558(Class464.method29463(arg0.method22494((byte) -79)));
		local5.method29559(Class464.method29463(arg0.method22494((byte) -17)));
		local5.method29568((float) arg0.method22494((byte) -77), (float) arg0.method22494((byte) -108), (float) arg0.method22494((byte) -80));
		this.method30023(local5);
	}

	@OriginalMember(owner = "client!pq", name = "bk", descriptor = "()[F")
	float[] method30073() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray116[2] < 0.999D && (double) this.aFloatArray116[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray116[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray116[6] / local35, (double) this.aFloatArray116[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray116[1] / local35, (double) this.aFloatArray116[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray116[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray116[9], (double) this.aFloatArray116[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "bh", descriptor = "()[F")
	float[] method30074() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray116[2] < 0.999D && (double) this.aFloatArray116[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray116[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray116[6] / local35, (double) this.aFloatArray116[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray116[1] / local35, (double) this.aFloatArray116[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray116[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray116[9], (double) this.aFloatArray116[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "dn", descriptor = "([F)[F")
	public float[] method30075(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "bd", descriptor = "()[F")
	float[] method30076() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray116[2] < 0.999D && (double) this.aFloatArray116[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray116[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray116[6] / local35, (double) this.aFloatArray116[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray116[1] / local35, (double) this.aFloatArray116[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray116[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray116[9], (double) this.aFloatArray116[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "bc", descriptor = "()[F")
	public float[] method30077() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray116[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray116[2];
			local36 = this.aFloatArray116[10];
			@Pc(42) double local42 = (double) this.aFloatArray116[4];
			@Pc(48) double local48 = (double) this.aFloatArray116[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray116[1];
			local36 = this.aFloatArray116[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "bi", descriptor = "()[F")
	public float[] method30078() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray116[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray116[2];
			local36 = this.aFloatArray116[10];
			@Pc(42) double local42 = (double) this.aFloatArray116[4];
			@Pc(48) double local48 = (double) this.aFloatArray116[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray116[1];
			local36 = this.aFloatArray116[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "bn", descriptor = "()V")
	public void method30079() {
		this.aFloatArray116[0] = 1.0F;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 1.0F;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 1.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "ce", descriptor = "(FFF[F)V")
	public void method30080(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "bq", descriptor = "(Lclient!pq;)V")
	public void method30081(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "bm", descriptor = "(Lclient!pq;)V")
	public void method30082(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 11);
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "bb", descriptor = "(Lclient!pq;Lclient!pq;)V")
	public void method30083(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray116[0] * arg1.aFloatArray116[0] + arg0.aFloatArray116[1] * arg1.aFloatArray116[4] + arg0.aFloatArray116[2] * arg1.aFloatArray116[8] + arg0.aFloatArray116[3] * arg1.aFloatArray116[12];
		@Pc(79) float local79 = arg0.aFloatArray116[0] * arg1.aFloatArray116[1] + arg0.aFloatArray116[1] * arg1.aFloatArray116[5] + arg0.aFloatArray116[2] * arg1.aFloatArray116[9] + arg0.aFloatArray116[3] * arg1.aFloatArray116[13];
		@Pc(119) float local119 = arg0.aFloatArray116[0] * arg1.aFloatArray116[2] + arg0.aFloatArray116[1] * arg1.aFloatArray116[6] + arg0.aFloatArray116[2] * arg1.aFloatArray116[10] + arg0.aFloatArray116[3] * arg1.aFloatArray116[14];
		@Pc(159) float local159 = arg0.aFloatArray116[0] * arg1.aFloatArray116[3] + arg0.aFloatArray116[1] * arg1.aFloatArray116[7] + arg0.aFloatArray116[2] * arg1.aFloatArray116[11] + arg0.aFloatArray116[3] * arg1.aFloatArray116[15];
		@Pc(199) float local199 = arg0.aFloatArray116[4] * arg1.aFloatArray116[0] + arg0.aFloatArray116[5] * arg1.aFloatArray116[4] + arg0.aFloatArray116[6] * arg1.aFloatArray116[8] + arg0.aFloatArray116[7] * arg1.aFloatArray116[12];
		@Pc(239) float local239 = arg0.aFloatArray116[4] * arg1.aFloatArray116[1] + arg0.aFloatArray116[5] * arg1.aFloatArray116[5] + arg0.aFloatArray116[6] * arg1.aFloatArray116[9] + arg0.aFloatArray116[7] * arg1.aFloatArray116[13];
		@Pc(279) float local279 = arg0.aFloatArray116[4] * arg1.aFloatArray116[2] + arg0.aFloatArray116[5] * arg1.aFloatArray116[6] + arg0.aFloatArray116[6] * arg1.aFloatArray116[10] + arg0.aFloatArray116[7] * arg1.aFloatArray116[14];
		@Pc(319) float local319 = arg0.aFloatArray116[4] * arg1.aFloatArray116[3] + arg0.aFloatArray116[5] * arg1.aFloatArray116[7] + arg0.aFloatArray116[6] * arg1.aFloatArray116[11] + arg0.aFloatArray116[7] * arg1.aFloatArray116[15];
		@Pc(359) float local359 = arg0.aFloatArray116[8] * arg1.aFloatArray116[0] + arg0.aFloatArray116[9] * arg1.aFloatArray116[4] + arg0.aFloatArray116[10] * arg1.aFloatArray116[8] + arg0.aFloatArray116[11] * arg1.aFloatArray116[12];
		@Pc(399) float local399 = arg0.aFloatArray116[8] * arg1.aFloatArray116[1] + arg0.aFloatArray116[9] * arg1.aFloatArray116[5] + arg0.aFloatArray116[10] * arg1.aFloatArray116[9] + arg0.aFloatArray116[11] * arg1.aFloatArray116[13];
		@Pc(439) float local439 = arg0.aFloatArray116[8] * arg1.aFloatArray116[2] + arg0.aFloatArray116[9] * arg1.aFloatArray116[6] + arg0.aFloatArray116[10] * arg1.aFloatArray116[10] + arg0.aFloatArray116[11] * arg1.aFloatArray116[14];
		@Pc(479) float local479 = arg0.aFloatArray116[8] * arg1.aFloatArray116[3] + arg0.aFloatArray116[9] * arg1.aFloatArray116[7] + arg0.aFloatArray116[10] * arg1.aFloatArray116[11] + arg0.aFloatArray116[11] * arg1.aFloatArray116[15];
		@Pc(519) float local519 = arg0.aFloatArray116[12] * arg1.aFloatArray116[0] + arg0.aFloatArray116[13] * arg1.aFloatArray116[4] + arg0.aFloatArray116[14] * arg1.aFloatArray116[8] + arg0.aFloatArray116[15] * arg1.aFloatArray116[12];
		@Pc(559) float local559 = arg0.aFloatArray116[12] * arg1.aFloatArray116[1] + arg0.aFloatArray116[13] * arg1.aFloatArray116[5] + arg0.aFloatArray116[14] * arg1.aFloatArray116[9] + arg0.aFloatArray116[15] * arg1.aFloatArray116[13];
		@Pc(599) float local599 = arg0.aFloatArray116[12] * arg1.aFloatArray116[2] + arg0.aFloatArray116[13] * arg1.aFloatArray116[6] + arg0.aFloatArray116[14] * arg1.aFloatArray116[10] + arg0.aFloatArray116[15] * arg1.aFloatArray116[14];
		@Pc(639) float local639 = arg0.aFloatArray116[12] * arg1.aFloatArray116[3] + arg0.aFloatArray116[13] * arg1.aFloatArray116[7] + arg0.aFloatArray116[14] * arg1.aFloatArray116[11] + arg0.aFloatArray116[15] * arg1.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "([F)V")
	public void method30084(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "by", descriptor = "(Lclient!pq;)V")
	public void method30085(@OriginalArg(0) Class489 arg0) {
		@Pc(39) float local39 = this.aFloatArray116[0] * arg0.aFloatArray116[0] + this.aFloatArray116[1] * arg0.aFloatArray116[4] + this.aFloatArray116[2] * arg0.aFloatArray116[8] + this.aFloatArray116[3] * arg0.aFloatArray116[12];
		@Pc(79) float local79 = this.aFloatArray116[0] * arg0.aFloatArray116[1] + this.aFloatArray116[1] * arg0.aFloatArray116[5] + this.aFloatArray116[2] * arg0.aFloatArray116[9] + this.aFloatArray116[3] * arg0.aFloatArray116[13];
		@Pc(119) float local119 = this.aFloatArray116[0] * arg0.aFloatArray116[2] + this.aFloatArray116[1] * arg0.aFloatArray116[6] + this.aFloatArray116[2] * arg0.aFloatArray116[10] + this.aFloatArray116[3] * arg0.aFloatArray116[14];
		@Pc(159) float local159 = this.aFloatArray116[0] * arg0.aFloatArray116[3] + this.aFloatArray116[1] * arg0.aFloatArray116[7] + this.aFloatArray116[2] * arg0.aFloatArray116[11] + this.aFloatArray116[3] * arg0.aFloatArray116[15];
		@Pc(199) float local199 = this.aFloatArray116[4] * arg0.aFloatArray116[0] + this.aFloatArray116[5] * arg0.aFloatArray116[4] + this.aFloatArray116[6] * arg0.aFloatArray116[8] + this.aFloatArray116[7] * arg0.aFloatArray116[12];
		@Pc(239) float local239 = this.aFloatArray116[4] * arg0.aFloatArray116[1] + this.aFloatArray116[5] * arg0.aFloatArray116[5] + this.aFloatArray116[6] * arg0.aFloatArray116[9] + this.aFloatArray116[7] * arg0.aFloatArray116[13];
		@Pc(279) float local279 = this.aFloatArray116[4] * arg0.aFloatArray116[2] + this.aFloatArray116[5] * arg0.aFloatArray116[6] + this.aFloatArray116[6] * arg0.aFloatArray116[10] + this.aFloatArray116[7] * arg0.aFloatArray116[14];
		@Pc(319) float local319 = this.aFloatArray116[4] * arg0.aFloatArray116[3] + this.aFloatArray116[5] * arg0.aFloatArray116[7] + this.aFloatArray116[6] * arg0.aFloatArray116[11] + this.aFloatArray116[7] * arg0.aFloatArray116[15];
		@Pc(359) float local359 = this.aFloatArray116[8] * arg0.aFloatArray116[0] + this.aFloatArray116[9] * arg0.aFloatArray116[4] + this.aFloatArray116[10] * arg0.aFloatArray116[8] + this.aFloatArray116[11] * arg0.aFloatArray116[12];
		@Pc(399) float local399 = this.aFloatArray116[8] * arg0.aFloatArray116[1] + this.aFloatArray116[9] * arg0.aFloatArray116[5] + this.aFloatArray116[10] * arg0.aFloatArray116[9] + this.aFloatArray116[11] * arg0.aFloatArray116[13];
		@Pc(439) float local439 = this.aFloatArray116[8] * arg0.aFloatArray116[2] + this.aFloatArray116[9] * arg0.aFloatArray116[6] + this.aFloatArray116[10] * arg0.aFloatArray116[10] + this.aFloatArray116[11] * arg0.aFloatArray116[14];
		@Pc(479) float local479 = this.aFloatArray116[8] * arg0.aFloatArray116[3] + this.aFloatArray116[9] * arg0.aFloatArray116[7] + this.aFloatArray116[10] * arg0.aFloatArray116[11] + this.aFloatArray116[11] * arg0.aFloatArray116[15];
		@Pc(519) float local519 = this.aFloatArray116[12] * arg0.aFloatArray116[0] + this.aFloatArray116[13] * arg0.aFloatArray116[4] + this.aFloatArray116[14] * arg0.aFloatArray116[8] + this.aFloatArray116[15] * arg0.aFloatArray116[12];
		@Pc(559) float local559 = this.aFloatArray116[12] * arg0.aFloatArray116[1] + this.aFloatArray116[13] * arg0.aFloatArray116[5] + this.aFloatArray116[14] * arg0.aFloatArray116[9] + this.aFloatArray116[15] * arg0.aFloatArray116[13];
		@Pc(599) float local599 = this.aFloatArray116[12] * arg0.aFloatArray116[2] + this.aFloatArray116[13] * arg0.aFloatArray116[6] + this.aFloatArray116[14] * arg0.aFloatArray116[10] + this.aFloatArray116[15] * arg0.aFloatArray116[14];
		@Pc(639) float local639 = this.aFloatArray116[12] * arg0.aFloatArray116[3] + this.aFloatArray116[13] * arg0.aFloatArray116[7] + this.aFloatArray116[14] * arg0.aFloatArray116[11] + this.aFloatArray116[15] * arg0.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "bw", descriptor = "(FFF)V")
	public void method30087(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(5) double local5 = Math.sin((double) arg0 / 2.0D);
		@Pc(11) double local11 = Math.cos((double) arg0 / 2.0D);
		@Pc(17) double local17 = Math.sin((double) arg1 / 2.0D);
		@Pc(23) double local23 = Math.cos((double) arg1 / 2.0D);
		@Pc(29) double local29 = Math.sin((double) arg2 / 2.0D);
		@Pc(35) double local35 = Math.cos((double) arg2 / 2.0D);
		@Pc(48) float local48 = (float) (local5 * local23 * local29 + local11 * local17 * local35);
		@Pc(61) float local61 = (float) (local5 * local23 * local35 - local11 * local17 * local29);
		@Pc(74) float local74 = (float) (local11 * local23 * local29 - local5 * local17 * local35);
		@Pc(87) float local87 = (float) (local11 * local23 * local35 + local5 * local17 * local29);
		@Pc(91) float local91 = local87 * local87;
		@Pc(95) float local95 = local87 * local48;
		@Pc(99) float local99 = local87 * local61;
		@Pc(103) float local103 = local87 * local74;
		@Pc(107) float local107 = local48 * local48;
		@Pc(111) float local111 = local48 * local61;
		@Pc(115) float local115 = local48 * local74;
		@Pc(119) float local119 = local61 * local61;
		@Pc(123) float local123 = local61 * local74;
		@Pc(127) float local127 = local74 * local74;
		this.aFloatArray116[0] = local107 + local91 - local127 - local119;
		this.aFloatArray116[1] = local111 + local103 + local111 + local103;
		this.aFloatArray116[2] = local115 - local99 - local99 + local115;
		this.aFloatArray116[4] = local111 - local103 - local103 + local111;
		this.aFloatArray116[5] = local119 + local91 - local107 - local127;
		this.aFloatArray116[6] = local123 + local95 + local123 + local95;
		this.aFloatArray116[8] = local115 + local99 + local115 + local99;
		this.aFloatArray116[9] = local123 - local95 - local95 + local123;
		this.aFloatArray116[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pq", name = "bo", descriptor = "(Lclient!ou;)V")
	public void method30088(@OriginalArg(0) Class470 arg0) {
		this.aFloatArray116[0] = arg0.aFloat310;
		this.aFloatArray116[1] = arg0.aFloat311;
		this.aFloatArray116[2] = arg0.aFloat312;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = arg0.aFloat313;
		this.aFloatArray116[5] = arg0.aFloat320;
		this.aFloatArray116[6] = arg0.aFloat315;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0.aFloat309;
		this.aFloatArray116[9] = arg0.aFloat316;
		this.aFloatArray116[10] = arg0.aFloat317;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = arg0.aFloat318;
		this.aFloatArray116[13] = arg0.aFloat319;
		this.aFloatArray116[14] = arg0.aFloat314;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(FFFFFF)V")
	void method30089(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "br", descriptor = "()V")
	public void method30090() {
		@Pc(4) float local4 = 1.0F / this.method30024();
		@Pc(96) float local96 = (this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[14] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[14] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[12] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[13] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		this.aFloatArray116[0] = local96;
		this.aFloatArray116[1] = local189;
		this.aFloatArray116[2] = local281;
		this.aFloatArray116[3] = local374;
		this.aFloatArray116[4] = local467;
		this.aFloatArray116[5] = local559;
		this.aFloatArray116[6] = local652;
		this.aFloatArray116[7] = local744;
		this.aFloatArray116[8] = local836;
		this.aFloatArray116[9] = local929;
		this.aFloatArray116[10] = local1021;
		this.aFloatArray116[11] = local1114;
		this.aFloatArray116[12] = local1207;
		this.aFloatArray116[13] = local1299;
		this.aFloatArray116[14] = local1392;
		this.aFloatArray116[15] = local1484;
	}

	@OriginalMember(owner = "client!pq", name = "bv", descriptor = "()F")
	float method30091() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "bg", descriptor = "()V")
	public void method30092() {
		@Pc(4) float local4 = 1.0F / this.method30024();
		@Pc(96) float local96 = (this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[14] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[14] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[12] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[13] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		this.aFloatArray116[0] = local96;
		this.aFloatArray116[1] = local189;
		this.aFloatArray116[2] = local281;
		this.aFloatArray116[3] = local374;
		this.aFloatArray116[4] = local467;
		this.aFloatArray116[5] = local559;
		this.aFloatArray116[6] = local652;
		this.aFloatArray116[7] = local744;
		this.aFloatArray116[8] = local836;
		this.aFloatArray116[9] = local929;
		this.aFloatArray116[10] = local1021;
		this.aFloatArray116[11] = local1114;
		this.aFloatArray116[12] = local1207;
		this.aFloatArray116[13] = local1299;
		this.aFloatArray116[14] = local1392;
		this.aFloatArray116[15] = local1484;
	}

	@OriginalMember(owner = "client!pq", name = "bp", descriptor = "()V")
	public void method30093() {
		@Pc(4) float local4 = 1.0F / this.method30024();
		@Pc(96) float local96 = (this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[10] * this.aFloatArray116[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[14] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[12] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[13] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray116[0] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[9] * this.aFloatArray116[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[14] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[13] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[14] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[12] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[13] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8]) * local4;
		this.aFloatArray116[0] = local96;
		this.aFloatArray116[1] = local189;
		this.aFloatArray116[2] = local281;
		this.aFloatArray116[3] = local374;
		this.aFloatArray116[4] = local467;
		this.aFloatArray116[5] = local559;
		this.aFloatArray116[6] = local652;
		this.aFloatArray116[7] = local744;
		this.aFloatArray116[8] = local836;
		this.aFloatArray116[9] = local929;
		this.aFloatArray116[10] = local1021;
		this.aFloatArray116[11] = local1114;
		this.aFloatArray116[12] = local1207;
		this.aFloatArray116[13] = local1299;
		this.aFloatArray116[14] = local1392;
		this.aFloatArray116[15] = local1484;
	}

	@OriginalMember(owner = "client!pq", name = "bj", descriptor = "(FFFF)V")
	public void method30094(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray116[0] = arg0;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg1;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = arg2;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "bs", descriptor = "(FFFF)V")
	public void method30095(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray116[0] = arg0;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg1;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = arg2;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "ap", descriptor = "([F)[F")
	public float[] method30096(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = this.aFloatArray116[4];
		arg0[3] = this.aFloatArray116[5];
		arg0[4] = this.aFloatArray116[8];
		arg0[5] = this.aFloatArray116[9];
		arg0[6] = this.aFloatArray116[12];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cg", descriptor = "()Z")
	public boolean method30097() {
		return this.aFloatArray116[0] == 1.0F && this.aFloatArray116[1] == 0.0F && this.aFloatArray116[2] == 0.0F && this.aFloatArray116[3] == 0.0F && this.aFloatArray116[4] == 0.0F && this.aFloatArray116[5] == 1.0F && this.aFloatArray116[6] == 0.0F && this.aFloatArray116[7] == 0.0F && this.aFloatArray116[8] == 0.0F && this.aFloatArray116[9] == 0.0F && this.aFloatArray116[10] == 1.0F && this.aFloatArray116[11] == 0.0F && this.aFloatArray116[12] == 0.0F && this.aFloatArray116[13] == 0.0F && this.aFloatArray116[14] == 0.0F && this.aFloatArray116[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "db", descriptor = "([F)[F")
	public float[] method30098(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = this.aFloatArray116[2];
		arg0[3] = this.aFloatArray116[4];
		arg0[4] = this.aFloatArray116[5];
		arg0[5] = this.aFloatArray116[6];
		arg0[6] = this.aFloatArray116[8];
		arg0[7] = this.aFloatArray116[9];
		arg0[8] = this.aFloatArray116[10];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cu", descriptor = "(FFF[F)V")
	public void method30099(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "ee", descriptor = "([F)[F")
	public float[] method30100(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray116[4];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray116[12];
		arg0[9] = this.aFloatArray116[13];
		arg0[10] = this.aFloatArray116[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "av", descriptor = "(IIIFFF)V")
	public void method30101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray116[0] = arg1;
			this.aFloatArray116[5] = arg2;
			this.aFloatArray116[10] = 1.0F;
			local98 = this.aFloatArray116;
			local101 = this.aFloatArray116;
			local54 = this.aFloatArray116;
			local57 = this.aFloatArray116;
			local60 = this.aFloatArray116;
			this.aFloatArray116[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class468.aFloatArray112[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class468.aFloatArray113[arg0 & 0x3FFF];
			this.aFloatArray116[0] = local7 * (float) arg1;
			this.aFloatArray116[5] = local7 * (float) arg2;
			this.aFloatArray116[1] = local13 * (float) arg1;
			this.aFloatArray116[4] = -local13 * (float) arg2;
			this.aFloatArray116[10] = 1.0F;
			local54 = this.aFloatArray116;
			local57 = this.aFloatArray116;
			local60 = this.aFloatArray116;
			this.aFloatArray116[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray116;
		local101 = this.aFloatArray116;
		this.aFloatArray116[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
		this.aFloatArray116[12] = arg3;
		this.aFloatArray116[13] = arg4;
		this.aFloatArray116[14] = arg5;
	}

	@OriginalMember(owner = "client!pq", name = "cv", descriptor = "(FFF[F)V")
	public void method30102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "cp", descriptor = "(FFF[F)V")
	public void method30103(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "ca", descriptor = "([F)V")
	public void method30104(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "cx", descriptor = "([F)V")
	public void method30105(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "ch", descriptor = "(FFF)V")
	public void method30106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30031(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "bu", descriptor = "(Lclient!pq;)V")
	public void method30107(@OriginalArg(0) Class489 arg0) {
		@Pc(39) float local39 = this.aFloatArray116[0] * arg0.aFloatArray116[0] + this.aFloatArray116[1] * arg0.aFloatArray116[4] + this.aFloatArray116[2] * arg0.aFloatArray116[8] + this.aFloatArray116[3] * arg0.aFloatArray116[12];
		@Pc(79) float local79 = this.aFloatArray116[0] * arg0.aFloatArray116[1] + this.aFloatArray116[1] * arg0.aFloatArray116[5] + this.aFloatArray116[2] * arg0.aFloatArray116[9] + this.aFloatArray116[3] * arg0.aFloatArray116[13];
		@Pc(119) float local119 = this.aFloatArray116[0] * arg0.aFloatArray116[2] + this.aFloatArray116[1] * arg0.aFloatArray116[6] + this.aFloatArray116[2] * arg0.aFloatArray116[10] + this.aFloatArray116[3] * arg0.aFloatArray116[14];
		@Pc(159) float local159 = this.aFloatArray116[0] * arg0.aFloatArray116[3] + this.aFloatArray116[1] * arg0.aFloatArray116[7] + this.aFloatArray116[2] * arg0.aFloatArray116[11] + this.aFloatArray116[3] * arg0.aFloatArray116[15];
		@Pc(199) float local199 = this.aFloatArray116[4] * arg0.aFloatArray116[0] + this.aFloatArray116[5] * arg0.aFloatArray116[4] + this.aFloatArray116[6] * arg0.aFloatArray116[8] + this.aFloatArray116[7] * arg0.aFloatArray116[12];
		@Pc(239) float local239 = this.aFloatArray116[4] * arg0.aFloatArray116[1] + this.aFloatArray116[5] * arg0.aFloatArray116[5] + this.aFloatArray116[6] * arg0.aFloatArray116[9] + this.aFloatArray116[7] * arg0.aFloatArray116[13];
		@Pc(279) float local279 = this.aFloatArray116[4] * arg0.aFloatArray116[2] + this.aFloatArray116[5] * arg0.aFloatArray116[6] + this.aFloatArray116[6] * arg0.aFloatArray116[10] + this.aFloatArray116[7] * arg0.aFloatArray116[14];
		@Pc(319) float local319 = this.aFloatArray116[4] * arg0.aFloatArray116[3] + this.aFloatArray116[5] * arg0.aFloatArray116[7] + this.aFloatArray116[6] * arg0.aFloatArray116[11] + this.aFloatArray116[7] * arg0.aFloatArray116[15];
		@Pc(359) float local359 = this.aFloatArray116[8] * arg0.aFloatArray116[0] + this.aFloatArray116[9] * arg0.aFloatArray116[4] + this.aFloatArray116[10] * arg0.aFloatArray116[8] + this.aFloatArray116[11] * arg0.aFloatArray116[12];
		@Pc(399) float local399 = this.aFloatArray116[8] * arg0.aFloatArray116[1] + this.aFloatArray116[9] * arg0.aFloatArray116[5] + this.aFloatArray116[10] * arg0.aFloatArray116[9] + this.aFloatArray116[11] * arg0.aFloatArray116[13];
		@Pc(439) float local439 = this.aFloatArray116[8] * arg0.aFloatArray116[2] + this.aFloatArray116[9] * arg0.aFloatArray116[6] + this.aFloatArray116[10] * arg0.aFloatArray116[10] + this.aFloatArray116[11] * arg0.aFloatArray116[14];
		@Pc(479) float local479 = this.aFloatArray116[8] * arg0.aFloatArray116[3] + this.aFloatArray116[9] * arg0.aFloatArray116[7] + this.aFloatArray116[10] * arg0.aFloatArray116[11] + this.aFloatArray116[11] * arg0.aFloatArray116[15];
		@Pc(519) float local519 = this.aFloatArray116[12] * arg0.aFloatArray116[0] + this.aFloatArray116[13] * arg0.aFloatArray116[4] + this.aFloatArray116[14] * arg0.aFloatArray116[8] + this.aFloatArray116[15] * arg0.aFloatArray116[12];
		@Pc(559) float local559 = this.aFloatArray116[12] * arg0.aFloatArray116[1] + this.aFloatArray116[13] * arg0.aFloatArray116[5] + this.aFloatArray116[14] * arg0.aFloatArray116[9] + this.aFloatArray116[15] * arg0.aFloatArray116[13];
		@Pc(599) float local599 = this.aFloatArray116[12] * arg0.aFloatArray116[2] + this.aFloatArray116[13] * arg0.aFloatArray116[6] + this.aFloatArray116[14] * arg0.aFloatArray116[10] + this.aFloatArray116[15] * arg0.aFloatArray116[14];
		@Pc(639) float local639 = this.aFloatArray116[12] * arg0.aFloatArray116[3] + this.aFloatArray116[13] * arg0.aFloatArray116[7] + this.aFloatArray116[14] * arg0.aFloatArray116[11] + this.aFloatArray116[15] * arg0.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "cf", descriptor = "(FFFFFF)V")
	public void method30108(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "co", descriptor = "(FFFFFF)V")
	public void method30109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = 0.0F;
		this.aFloatArray116[9] = 0.0F;
		this.aFloatArray116[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "cr", descriptor = "(FFFF)V")
	public void method30110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method30089(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "bz", descriptor = "()F")
	float method30111() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "cq", descriptor = "(FFF)V")
	public void method30112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30031(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "au", descriptor = "([F)[F")
	public float[] method30113(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = this.aFloatArray116[2];
		arg0[3] = this.aFloatArray116[4];
		arg0[4] = this.aFloatArray116[5];
		arg0[5] = this.aFloatArray116[6];
		arg0[6] = this.aFloatArray116[8];
		arg0[7] = this.aFloatArray116[9];
		arg0[8] = this.aFloatArray116[10];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cb", descriptor = "(FFF)V")
	public void method30114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30031(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cs", descriptor = "(FFFFFF)V")
	void method30115(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(FFFFFFFF)V")
	public void method30117(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray116[0] = arg2 * 2.0F / arg6;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg3 * 2.0F / arg7;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray116[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "ck", descriptor = "(FFFFFFFF)V")
	public void method30118(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray116[0] = arg2 * 2.0F / arg6;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg3 * 2.0F / arg7;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray116[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "cj", descriptor = "(FFFFFFFF)V")
	public void method30119(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray116[0] = arg2 * 2.0F / arg6;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg3 * 2.0F / arg7;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray116[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "cd", descriptor = "(FFFFFFFF)V")
	public void method30120(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray116[0] = arg2 * 2.0F / arg6;
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg3 * 2.0F / arg7;
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray116[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "dd", descriptor = "(FFFFFFFFF)V")
	public void method30121(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30031(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "da", descriptor = "()F")
	public float method30122() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "dt", descriptor = "()F")
	public float method30123() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method30124() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method30016();
		this.method30139();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				if (local16 > 0) {
					local3.append("\t");
				}
				@Pc(34) float local34 = this.aFloatArray116[local11 * 4 + local16];
				if (Math.sqrt((double) (local34 * local34)) < 9.999999747378752E-5D) {
					local34 = 0.0F;
				}
				local3.append(local34);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!pq", name = "ci", descriptor = "(FFF[F)V")
	public void method30125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "dv", descriptor = "()F")
	public float method30126() {
		return (this.aFloatArray116[14] - this.aFloatArray116[15]) / (this.aFloatArray116[11] - this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "dm", descriptor = "([F)[F")
	public float[] method30127(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[0];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[4];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dq", descriptor = "([F)[F")
	public float[] method30128(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[0];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[4];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dc", descriptor = "([F)[F")
	public float[] method30129(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[1];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[5];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "di", descriptor = "([F)[F")
	public float[] method30130(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[1];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[5];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dk", descriptor = "([F)[F")
	public float[] method30131(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] + this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] + this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] + this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] + this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dr", descriptor = "(FFFFFFFFF)V")
	public void method30132(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30031(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "df", descriptor = "([F)[F")
	public float[] method30133(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray116[3] - this.aFloatArray116[2];
		@Pc(19) float local19 = this.aFloatArray116[7] - this.aFloatArray116[6];
		@Pc(29) float local29 = this.aFloatArray116[11] - this.aFloatArray116[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray116[15] - this.aFloatArray116[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(Lclient!pq;)V")
	public void method30134(@OriginalArg(0) Class489 arg0) {
		@Pc(39) float local39 = this.aFloatArray116[0] * arg0.aFloatArray116[0] + this.aFloatArray116[1] * arg0.aFloatArray116[4] + this.aFloatArray116[2] * arg0.aFloatArray116[8] + this.aFloatArray116[3] * arg0.aFloatArray116[12];
		@Pc(79) float local79 = this.aFloatArray116[0] * arg0.aFloatArray116[1] + this.aFloatArray116[1] * arg0.aFloatArray116[5] + this.aFloatArray116[2] * arg0.aFloatArray116[9] + this.aFloatArray116[3] * arg0.aFloatArray116[13];
		@Pc(119) float local119 = this.aFloatArray116[0] * arg0.aFloatArray116[2] + this.aFloatArray116[1] * arg0.aFloatArray116[6] + this.aFloatArray116[2] * arg0.aFloatArray116[10] + this.aFloatArray116[3] * arg0.aFloatArray116[14];
		@Pc(159) float local159 = this.aFloatArray116[0] * arg0.aFloatArray116[3] + this.aFloatArray116[1] * arg0.aFloatArray116[7] + this.aFloatArray116[2] * arg0.aFloatArray116[11] + this.aFloatArray116[3] * arg0.aFloatArray116[15];
		@Pc(199) float local199 = this.aFloatArray116[4] * arg0.aFloatArray116[0] + this.aFloatArray116[5] * arg0.aFloatArray116[4] + this.aFloatArray116[6] * arg0.aFloatArray116[8] + this.aFloatArray116[7] * arg0.aFloatArray116[12];
		@Pc(239) float local239 = this.aFloatArray116[4] * arg0.aFloatArray116[1] + this.aFloatArray116[5] * arg0.aFloatArray116[5] + this.aFloatArray116[6] * arg0.aFloatArray116[9] + this.aFloatArray116[7] * arg0.aFloatArray116[13];
		@Pc(279) float local279 = this.aFloatArray116[4] * arg0.aFloatArray116[2] + this.aFloatArray116[5] * arg0.aFloatArray116[6] + this.aFloatArray116[6] * arg0.aFloatArray116[10] + this.aFloatArray116[7] * arg0.aFloatArray116[14];
		@Pc(319) float local319 = this.aFloatArray116[4] * arg0.aFloatArray116[3] + this.aFloatArray116[5] * arg0.aFloatArray116[7] + this.aFloatArray116[6] * arg0.aFloatArray116[11] + this.aFloatArray116[7] * arg0.aFloatArray116[15];
		@Pc(359) float local359 = this.aFloatArray116[8] * arg0.aFloatArray116[0] + this.aFloatArray116[9] * arg0.aFloatArray116[4] + this.aFloatArray116[10] * arg0.aFloatArray116[8] + this.aFloatArray116[11] * arg0.aFloatArray116[12];
		@Pc(399) float local399 = this.aFloatArray116[8] * arg0.aFloatArray116[1] + this.aFloatArray116[9] * arg0.aFloatArray116[5] + this.aFloatArray116[10] * arg0.aFloatArray116[9] + this.aFloatArray116[11] * arg0.aFloatArray116[13];
		@Pc(439) float local439 = this.aFloatArray116[8] * arg0.aFloatArray116[2] + this.aFloatArray116[9] * arg0.aFloatArray116[6] + this.aFloatArray116[10] * arg0.aFloatArray116[10] + this.aFloatArray116[11] * arg0.aFloatArray116[14];
		@Pc(479) float local479 = this.aFloatArray116[8] * arg0.aFloatArray116[3] + this.aFloatArray116[9] * arg0.aFloatArray116[7] + this.aFloatArray116[10] * arg0.aFloatArray116[11] + this.aFloatArray116[11] * arg0.aFloatArray116[15];
		@Pc(519) float local519 = this.aFloatArray116[12] * arg0.aFloatArray116[0] + this.aFloatArray116[13] * arg0.aFloatArray116[4] + this.aFloatArray116[14] * arg0.aFloatArray116[8] + this.aFloatArray116[15] * arg0.aFloatArray116[12];
		@Pc(559) float local559 = this.aFloatArray116[12] * arg0.aFloatArray116[1] + this.aFloatArray116[13] * arg0.aFloatArray116[5] + this.aFloatArray116[14] * arg0.aFloatArray116[9] + this.aFloatArray116[15] * arg0.aFloatArray116[13];
		@Pc(599) float local599 = this.aFloatArray116[12] * arg0.aFloatArray116[2] + this.aFloatArray116[13] * arg0.aFloatArray116[6] + this.aFloatArray116[14] * arg0.aFloatArray116[10] + this.aFloatArray116[15] * arg0.aFloatArray116[14];
		@Pc(639) float local639 = this.aFloatArray116[12] * arg0.aFloatArray116[3] + this.aFloatArray116[13] * arg0.aFloatArray116[7] + this.aFloatArray116[14] * arg0.aFloatArray116[11] + this.aFloatArray116[15] * arg0.aFloatArray116[15];
		this.aFloatArray116[0] = local39;
		this.aFloatArray116[1] = local79;
		this.aFloatArray116[2] = local119;
		this.aFloatArray116[3] = local159;
		this.aFloatArray116[4] = local199;
		this.aFloatArray116[5] = local239;
		this.aFloatArray116[6] = local279;
		this.aFloatArray116[7] = local319;
		this.aFloatArray116[8] = local359;
		this.aFloatArray116[9] = local399;
		this.aFloatArray116[10] = local439;
		this.aFloatArray116[11] = local479;
		this.aFloatArray116[12] = local519;
		this.aFloatArray116[13] = local559;
		this.aFloatArray116[14] = local599;
		this.aFloatArray116[15] = local639;
	}

	@OriginalMember(owner = "client!pq", name = "dy", descriptor = "([F)[F")
	public float[] method30135(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cc", descriptor = "(FFFFFF)V")
	void method30136(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "dl", descriptor = "([F)[F")
	public float[] method30137(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "cz", descriptor = "(FFFFFF)V")
	void method30138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray116[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray116[1] = 0.0F;
		this.aFloatArray116[2] = 0.0F;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = 0.0F;
		this.aFloatArray116[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray116[6] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray116[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray116[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray116[11] = 1.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray116[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "()[F")
	float[] method30139() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray116[2] < 0.999D && (double) this.aFloatArray116[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray116[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray116[6] / local35, (double) this.aFloatArray116[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray116[1] / local35, (double) this.aFloatArray116[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray116[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray116[9], (double) this.aFloatArray116[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "(Lclient!pq;)V")
	public void method30140(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 11);
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "dh", descriptor = "([F)[F")
	public float[] method30141(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = this.aFloatArray116[2];
		arg0[3] = this.aFloatArray116[4];
		arg0[4] = this.aFloatArray116[5];
		arg0[5] = this.aFloatArray116[6];
		arg0[6] = this.aFloatArray116[8];
		arg0[7] = this.aFloatArray116[9];
		arg0[8] = this.aFloatArray116[10];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dx", descriptor = "([F)[F")
	public float[] method30142(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = this.aFloatArray116[4];
		arg0[3] = this.aFloatArray116[5];
		arg0[4] = this.aFloatArray116[8];
		arg0[5] = this.aFloatArray116[9];
		arg0[6] = this.aFloatArray116[12];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dg", descriptor = "([F)[F")
	public float[] method30143(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "de", descriptor = "([F)[F")
	public float[] method30144(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dj", descriptor = "([F)[F")
	public float[] method30145(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "eo", descriptor = "([F)[F")
	public float[] method30146(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "ey", descriptor = "([F)[F")
	public float[] method30147(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[4];
		arg0[2] = this.aFloatArray116[8];
		arg0[3] = this.aFloatArray116[12];
		arg0[4] = this.aFloatArray116[1];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = this.aFloatArray116[9];
		arg0[7] = this.aFloatArray116[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "eu", descriptor = "([F)[F")
	public float[] method30148(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray116[0];
		arg0[1] = this.aFloatArray116[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray116[4];
		arg0[5] = this.aFloatArray116[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray116[12];
		arg0[9] = this.aFloatArray116[13];
		arg0[10] = this.aFloatArray116[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "af", descriptor = "()V")
	public void method30149() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5320 < anInt5319 - 1) {
				aClass489Array10[anInt5320++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "dp", descriptor = "([F)[F")
	public float[] method30150(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "es", descriptor = "(IIIFFF)V")
	public void method30151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray116[0] = arg1;
			this.aFloatArray116[5] = arg2;
			this.aFloatArray116[10] = 1.0F;
			local98 = this.aFloatArray116;
			local101 = this.aFloatArray116;
			local54 = this.aFloatArray116;
			local57 = this.aFloatArray116;
			local60 = this.aFloatArray116;
			this.aFloatArray116[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class468.aFloatArray112[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class468.aFloatArray113[arg0 & 0x3FFF];
			this.aFloatArray116[0] = local7 * (float) arg1;
			this.aFloatArray116[5] = local7 * (float) arg2;
			this.aFloatArray116[1] = local13 * (float) arg1;
			this.aFloatArray116[4] = -local13 * (float) arg2;
			this.aFloatArray116[10] = 1.0F;
			local54 = this.aFloatArray116;
			local57 = this.aFloatArray116;
			local60 = this.aFloatArray116;
			this.aFloatArray116[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray116;
		local101 = this.aFloatArray116;
		this.aFloatArray116[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
		this.aFloatArray116[12] = arg3;
		this.aFloatArray116[13] = arg4;
		this.aFloatArray116[14] = arg5;
	}
}
