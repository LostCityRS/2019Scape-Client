package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class489 {

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	static int anInt5158;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	static int anInt5159;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "F")
	static final float aFloat322 = 1.0E-4F;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[Lclient!pq;")
	static Class489[] aClass489Array10 = new Class489[0];

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!pq;")
	public static final Class489 aClass489_99 = new Class489();

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "[F")
	public float[] aFloatArray116 = new float[16];

	@OriginalMember(owner = "client!pq", name = "ao", descriptor = "(I)V", line = 15)
	public static void method29827(@OriginalArg(0) int arg0) {
		anInt5158 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5159 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "aj", descriptor = "(I)V", line = 15)
	public static void method29828(@OriginalArg(0) int arg0) {
		anInt5158 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5159 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "ay", descriptor = "(I)V", line = 15)
	public static void method29829(@OriginalArg(0) int arg0) {
		anInt5158 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5159 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V", line = 15)
	public static void method29830(@OriginalArg(0) int arg0) {
		anInt5158 = arg0;
		aClass489Array10 = new Class489[arg0];
		anInt5159 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "()Lclient!pq;", line = 21)
	public static Class489 method29831() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5159].method29850();
				return aClass489Array10[anInt5159];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "ab", descriptor = "()Lclient!pq;", line = 21)
	public static Class489 method29832() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5159].method29850();
				return aClass489Array10[anInt5159];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "az", descriptor = "()Lclient!pq;", line = 21)
	public static Class489 method29833() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5159].method29850();
				return aClass489Array10[anInt5159];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "aa", descriptor = "()Lclient!pq;", line = 21)
	public static Class489 method29834() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 == 0) {
				return new Class489();
			} else {
				aClass489Array10[--anInt5159].method29850();
				return aClass489Array10[anInt5159];
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "()V", line = 31)
	public void method29835() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 < anInt5158 - 1) {
				aClass489Array10[anInt5159++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "ak", descriptor = "()V", line = 31)
	public void method29836() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 < anInt5158 - 1) {
				aClass489Array10[anInt5159++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "af", descriptor = "()V", line = 31)
	public void method29837() {
		@Pc(2) Class489[] local2 = aClass489Array10;
		synchronized (aClass489Array10) {
			if (anInt5159 < anInt5158 - 1) {
				aClass489Array10[anInt5159++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 36)
	public Class489() {
		this.method29850();
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!pq;)V", line = 40)
	public Class489(@OriginalArg(0) Class489 arg0) {
		this.method29852(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!alw;Z)V", line = 44)
	public Class489(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		this.method29839(arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "bl", descriptor = "(Lclient!alw;Z)V", line = 49)
	void method29838(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.gFloat(-1580746208);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29391(Class464.method29281(arg0.g2s((byte) -74)));
		local5.method29394(Class464.method29281(arg0.g2s((byte) -63)));
		local5.method29399(Class464.method29281(arg0.g2s((byte) -52)));
		local5.method29424((float) arg0.g2s((byte) -48), (float) arg0.g2s((byte) -80), (float) arg0.g2s((byte) -55));
		this.method29865(local5);
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(Lclient!alw;Z)V", line = 49)
	void method29839(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.gFloat(1460081112);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29391(Class464.method29281(arg0.g2s((byte) -30)));
		local5.method29394(Class464.method29281(arg0.g2s((byte) -115)));
		local5.method29399(Class464.method29281(arg0.g2s((byte) -100)));
		local5.method29424((float) arg0.g2s((byte) -18), (float) arg0.g2s((byte) -65), (float) arg0.g2s((byte) -26));
		this.method29865(local5);
	}

	@OriginalMember(owner = "client!pq", name = "an", descriptor = "(Lclient!alw;Z)V", line = 49)
	void method29840(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.gFloat(1224159301);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29391(Class464.method29281(arg0.g2s((byte) -127)));
		local5.method29394(Class464.method29281(arg0.g2s((byte) -107)));
		local5.method29399(Class464.method29281(arg0.g2s((byte) -71)));
		local5.method29424((float) arg0.g2s((byte) -83), (float) arg0.g2s((byte) -89), (float) arg0.g2s((byte) -71));
		this.method29865(local5);
	}

	@OriginalMember(owner = "client!pq", name = "bf", descriptor = "(Lclient!alw;Z)V", line = 49)
	void method29841(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray116[local43] = arg0.gFloat(-1074601825);
			}
			return;
		}
		@Pc(5) Class470 local5 = new Class470();
		local5.method29391(Class464.method29281(arg0.g2s((byte) -73)));
		local5.method29394(Class464.method29281(arg0.g2s((byte) -79)));
		local5.method29399(Class464.method29281(arg0.g2s((byte) -17)));
		local5.method29424((float) arg0.g2s((byte) -77), (float) arg0.g2s((byte) -108), (float) arg0.g2s((byte) -80));
		this.method29865(local5);
	}

	@OriginalMember(owner = "client!pq", name = "bx", descriptor = "()[F", line = 65)
	float[] method29842() {
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

	@OriginalMember(owner = "client!pq", name = "bk", descriptor = "()[F", line = 65)
	float[] method29843() {
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

	@OriginalMember(owner = "client!pq", name = "bh", descriptor = "()[F", line = 65)
	float[] method29844() {
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

	@OriginalMember(owner = "client!pq", name = "bd", descriptor = "()[F", line = 65)
	float[] method29845() {
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

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "()[F", line = 65)
	float[] method29846() {
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

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "()[F", line = 81)
	public float[] method29847() {
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

	@OriginalMember(owner = "client!pq", name = "bc", descriptor = "()[F", line = 81)
	public float[] method29848() {
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

	@OriginalMember(owner = "client!pq", name = "bi", descriptor = "()[F", line = 81)
	public float[] method29849() {
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

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "()V", line = 102)
	public void method29850() {
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

	@OriginalMember(owner = "client!pq", name = "bn", descriptor = "()V", line = 102)
	public void method29851() {
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

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "(Lclient!pq;)V", line = 121)
	public void method29852(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "bt", descriptor = "(Lclient!pq;)V", line = 121)
	public void method29853(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "bq", descriptor = "(Lclient!pq;)V", line = 121)
	public void method29854(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 16);
	}

	@OriginalMember(owner = "client!pq", name = "bm", descriptor = "(Lclient!pq;)V", line = 125)
	public void method29855(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 11);
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "(Lclient!pq;)V", line = 125)
	public void method29856(@OriginalArg(0) Class489 arg0) {
		System.arraycopy(arg0.aFloatArray116, 0, this.aFloatArray116, 0, 11);
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = 0.0F;
		this.aFloatArray116[13] = 0.0F;
		this.aFloatArray116[14] = 0.0F;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "(Lclient!pq;Lclient!pq;)V", line = 136)
	public void method29857(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
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

	@OriginalMember(owner = "client!pq", name = "be", descriptor = "(Lclient!pq;Lclient!pq;)V", line = 136)
	public void method29858(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
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

	@OriginalMember(owner = "client!pq", name = "bb", descriptor = "(Lclient!pq;Lclient!pq;)V", line = 136)
	public void method29859(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1) {
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

	@OriginalMember(owner = "client!pq", name = "by", descriptor = "(Lclient!pq;)V", line = 171)
	public void method29860(@OriginalArg(0) Class489 arg0) {
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

	@OriginalMember(owner = "client!pq", name = "bu", descriptor = "(Lclient!pq;)V", line = 171)
	public void method29861(@OriginalArg(0) Class489 arg0) {
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

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(Lclient!pq;)V", line = 171)
	public void method29862(@OriginalArg(0) Class489 arg0) {
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

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(FFF)V", line = 206)
	public void method29863(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!pq", name = "bw", descriptor = "(FFF)V", line = 206)
	public void method29864(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "(Lclient!ou;)V", line = 238)
	public void method29865(@OriginalArg(0) Class470 arg0) {
		this.aFloatArray116[0] = arg0.aFloat302;
		this.aFloatArray116[1] = arg0.aFloat303;
		this.aFloatArray116[2] = arg0.aFloat304;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = arg0.aFloat305;
		this.aFloatArray116[5] = arg0.aFloat312;
		this.aFloatArray116[6] = arg0.aFloat307;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0.aFloat301;
		this.aFloatArray116[9] = arg0.aFloat308;
		this.aFloatArray116[10] = arg0.aFloat309;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = arg0.aFloat310;
		this.aFloatArray116[13] = arg0.aFloat311;
		this.aFloatArray116[14] = arg0.aFloat306;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "bo", descriptor = "(Lclient!ou;)V", line = 238)
	public void method29866(@OriginalArg(0) Class470 arg0) {
		this.aFloatArray116[0] = arg0.aFloat302;
		this.aFloatArray116[1] = arg0.aFloat303;
		this.aFloatArray116[2] = arg0.aFloat304;
		this.aFloatArray116[3] = 0.0F;
		this.aFloatArray116[4] = arg0.aFloat305;
		this.aFloatArray116[5] = arg0.aFloat312;
		this.aFloatArray116[6] = arg0.aFloat307;
		this.aFloatArray116[7] = 0.0F;
		this.aFloatArray116[8] = arg0.aFloat301;
		this.aFloatArray116[9] = arg0.aFloat308;
		this.aFloatArray116[10] = arg0.aFloat309;
		this.aFloatArray116[11] = 0.0F;
		this.aFloatArray116[12] = arg0.aFloat310;
		this.aFloatArray116[13] = arg0.aFloat311;
		this.aFloatArray116[14] = arg0.aFloat306;
		this.aFloatArray116[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "()F", line = 257)
	float method29867() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "bv", descriptor = "()F", line = 257)
	float method29868() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "bz", descriptor = "()F", line = 257)
	float method29869() {
		return this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[15] - this.aFloatArray116[0] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[15] + this.aFloatArray116[0] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[13] + this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[14] - this.aFloatArray116[0] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[13] - this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[15] + this.aFloatArray116[1] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[15] - this.aFloatArray116[1] * this.aFloatArray116[6] * this.aFloatArray116[11] * this.aFloatArray116[12] - this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[14] + this.aFloatArray116[1] * this.aFloatArray116[7] * this.aFloatArray116[10] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[15] - this.aFloatArray116[2] * this.aFloatArray116[4] * this.aFloatArray116[11] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[15] + this.aFloatArray116[2] * this.aFloatArray116[5] * this.aFloatArray116[11] * this.aFloatArray116[12] + this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[8] * this.aFloatArray116[13] - this.aFloatArray116[2] * this.aFloatArray116[7] * this.aFloatArray116[9] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[9] * this.aFloatArray116[14] + this.aFloatArray116[3] * this.aFloatArray116[4] * this.aFloatArray116[10] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[8] * this.aFloatArray116[14] - this.aFloatArray116[3] * this.aFloatArray116[5] * this.aFloatArray116[10] * this.aFloatArray116[12] - this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[8] * this.aFloatArray116[13] + this.aFloatArray116[3] * this.aFloatArray116[6] * this.aFloatArray116[9] * this.aFloatArray116[12];
	}

	@OriginalMember(owner = "client!pq", name = "ba", descriptor = "()V", line = 261)
	public void method29870() {
		@Pc(4) float local4 = 1.0F / this.method29867();
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

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "()V", line = 261)
	public void method29871() {
		@Pc(4) float local4 = 1.0F / this.method29867();
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

	@OriginalMember(owner = "client!pq", name = "br", descriptor = "()V", line = 261)
	public void method29872() {
		@Pc(4) float local4 = 1.0F / this.method29867();
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

	@OriginalMember(owner = "client!pq", name = "bg", descriptor = "()V", line = 261)
	public void method29873() {
		@Pc(4) float local4 = 1.0F / this.method29867();
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

	@OriginalMember(owner = "client!pq", name = "bp", descriptor = "()V", line = 261)
	public void method29874() {
		@Pc(4) float local4 = 1.0F / this.method29867();
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

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "(FFFF)V", line = 297)
	public void method29875(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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

	@OriginalMember(owner = "client!pq", name = "cl", descriptor = "(FFFF)V", line = 297)
	public void method29876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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

	@OriginalMember(owner = "client!pq", name = "bj", descriptor = "(FFFF)V", line = 297)
	public void method29877(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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

	@OriginalMember(owner = "client!pq", name = "bs", descriptor = "(FFFF)V", line = 297)
	public void method29878(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "()Z", line = 316)
	public boolean method29879() {
		return this.aFloatArray116[0] == 1.0F && this.aFloatArray116[1] == 0.0F && this.aFloatArray116[2] == 0.0F && this.aFloatArray116[3] == 0.0F && this.aFloatArray116[4] == 0.0F && this.aFloatArray116[5] == 1.0F && this.aFloatArray116[6] == 0.0F && this.aFloatArray116[7] == 0.0F && this.aFloatArray116[8] == 0.0F && this.aFloatArray116[9] == 0.0F && this.aFloatArray116[10] == 1.0F && this.aFloatArray116[11] == 0.0F && this.aFloatArray116[12] == 0.0F && this.aFloatArray116[13] == 0.0F && this.aFloatArray116[14] == 0.0F && this.aFloatArray116[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "cg", descriptor = "()Z", line = 316)
	public boolean method29880() {
		return this.aFloatArray116[0] == 1.0F && this.aFloatArray116[1] == 0.0F && this.aFloatArray116[2] == 0.0F && this.aFloatArray116[3] == 0.0F && this.aFloatArray116[4] == 0.0F && this.aFloatArray116[5] == 1.0F && this.aFloatArray116[6] == 0.0F && this.aFloatArray116[7] == 0.0F && this.aFloatArray116[8] == 0.0F && this.aFloatArray116[9] == 0.0F && this.aFloatArray116[10] == 1.0F && this.aFloatArray116[11] == 0.0F && this.aFloatArray116[12] == 0.0F && this.aFloatArray116[13] == 0.0F && this.aFloatArray116[14] == 0.0F && this.aFloatArray116[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "(FFF[F)V", line = 320)
	public void method29881(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "cn", descriptor = "(FFF[F)V", line = 320)
	public void method29882(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "ce", descriptor = "(FFF[F)V", line = 320)
	public void method29883(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "cu", descriptor = "(FFF[F)V", line = 320)
	public void method29884(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "cv", descriptor = "(FFF[F)V", line = 320)
	public void method29885(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "cp", descriptor = "(FFF[F)V", line = 320)
	public void method29886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "ci", descriptor = "(FFF[F)V", line = 320)
	public void method29887(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2 + this.aFloatArray116[12];
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2 + this.aFloatArray116[13];
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2 + this.aFloatArray116[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2 + this.aFloatArray116[15];
		}
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "([F)V", line = 327)
	public void method29888(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "ca", descriptor = "([F)V", line = 327)
	public void method29889(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "cx", descriptor = "([F)V", line = 327)
	public void method29890(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray116[0] * local3 + this.aFloatArray116[4] * local7 + this.aFloatArray116[8] * local11 + this.aFloatArray116[12];
		arg0[1] = this.aFloatArray116[1] * local3 + this.aFloatArray116[5] * local7 + this.aFloatArray116[9] * local11 + this.aFloatArray116[13];
		arg0[2] = this.aFloatArray116[2] * local3 + this.aFloatArray116[6] * local7 + this.aFloatArray116[10] * local11 + this.aFloatArray116[14];
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(FFF[F)V", line = 336)
	public void method29891(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2;
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2;
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "cw", descriptor = "(FFF[F)V", line = 336)
	public void method29892(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray116[0] * arg0 + this.aFloatArray116[4] * arg1 + this.aFloatArray116[8] * arg2;
		arg3[1] = this.aFloatArray116[1] * arg0 + this.aFloatArray116[5] * arg1 + this.aFloatArray116[9] * arg2;
		arg3[2] = this.aFloatArray116[2] * arg0 + this.aFloatArray116[6] * arg1 + this.aFloatArray116[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray116[3] * arg0 + this.aFloatArray116[7] * arg1 + this.aFloatArray116[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(FFFFFF)V", line = 343)
	public void method29893(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "ct", descriptor = "(FFFFFF)V", line = 343)
	public void method29894(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "cf", descriptor = "(FFFFFF)V", line = 343)
	public void method29895(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "co", descriptor = "(FFFFFF)V", line = 343)
	public void method29896(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFFF)V", line = 362)
	public void method29897(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29905(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cm", descriptor = "(FFFF)V", line = 362)
	public void method29898(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29905(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cr", descriptor = "(FFFF)V", line = 362)
	public void method29899(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29905(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(FFF)V", line = 368)
	public void method29900(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29893(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "ch", descriptor = "(FFF)V", line = 368)
	public void method29901(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29893(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cq", descriptor = "(FFF)V", line = 368)
	public void method29902(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29893(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cb", descriptor = "(FFF)V", line = 368)
	public void method29903(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29893(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "cy", descriptor = "(FFFFFF)V", line = 372)
	void method29904(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(FFFFFF)V", line = 372)
	void method29905(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "cs", descriptor = "(FFFFFF)V", line = 372)
	void method29906(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "cc", descriptor = "(FFFFFF)V", line = 372)
	void method29907(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "cz", descriptor = "(FFFFFF)V", line = 372)
	void method29908(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(FFFFFFFF)V", line = 391)
	public void method29909(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
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

	@OriginalMember(owner = "client!pq", name = "ck", descriptor = "(FFFFFFFF)V", line = 391)
	public void method29910(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
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

	@OriginalMember(owner = "client!pq", name = "cj", descriptor = "(FFFFFFFF)V", line = 391)
	public void method29911(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
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

	@OriginalMember(owner = "client!pq", name = "cd", descriptor = "(FFFFFFFF)V", line = 391)
	public void method29912(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
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

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "(FFFFFFFFF)V", line = 410)
	public void method29913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method29893(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "dd", descriptor = "(FFFFFFFFF)V", line = 410)
	public void method29914(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method29893(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "dr", descriptor = "(FFFFFFFFF)V", line = 410)
	public void method29915(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method29893(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "dz", descriptor = "()F", line = 414)
	public float method29916() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "do", descriptor = "()F", line = 414)
	public float method29917() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "ae", descriptor = "()F", line = 414)
	public float method29918() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "da", descriptor = "()F", line = 414)
	public float method29919() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "dt", descriptor = "()F", line = 414)
	public float method29920() {
		return -(this.aFloatArray116[15] + this.aFloatArray116[14]) / (this.aFloatArray116[11] + this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "ag", descriptor = "()F", line = 418)
	public float method29921() {
		return (this.aFloatArray116[14] - this.aFloatArray116[15]) / (this.aFloatArray116[11] - this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "dv", descriptor = "()F", line = 418)
	public float method29922() {
		return (this.aFloatArray116[14] - this.aFloatArray116[15]) / (this.aFloatArray116[11] - this.aFloatArray116[10]);
	}

	@OriginalMember(owner = "client!pq", name = "ah", descriptor = "([F)[F", line = 422)
	public float[] method29923(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dm", descriptor = "([F)[F", line = 422)
	public float[] method29924(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "al", descriptor = "([F)[F", line = 434)
	public float[] method29925(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dq", descriptor = "([F)[F", line = 434)
	public float[] method29926(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ac", descriptor = "([F)[F", line = 446)
	public float[] method29927(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ai", descriptor = "([F)[F", line = 458)
	public float[] method29928(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dc", descriptor = "([F)[F", line = 458)
	public float[] method29929(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "di", descriptor = "([F)[F", line = 458)
	public float[] method29930(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "aw", descriptor = "([F)[F", line = 470)
	public float[] method29931(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dn", descriptor = "([F)[F", line = 470)
	public float[] method29932(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dk", descriptor = "([F)[F", line = 470)
	public float[] method29933(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dw", descriptor = "([F)[F", line = 482)
	public float[] method29934(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ds", descriptor = "([F)[F", line = 482)
	public float[] method29935(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "as", descriptor = "([F)[F", line = 482)
	public float[] method29936(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "df", descriptor = "([F)[F", line = 482)
	public float[] method29937(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "at", descriptor = "()V", line = 494)
	public void method29938() {
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

	@OriginalMember(owner = "client!pq", name = "du", descriptor = "()V", line = 494)
	public void method29939() {
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

	@OriginalMember(owner = "client!pq", name = "ad", descriptor = "([F)[F", line = 529)
	public float[] method29940(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "dl", descriptor = "([F)[F", line = 529)
	public float[] method29941(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray116, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pq", name = "am", descriptor = "([F)[F", line = 534)
	public float[] method29942(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dy", descriptor = "([F)[F", line = 534)
	public float[] method29943(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dp", descriptor = "([F)[F", line = 534)
	public float[] method29944(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "db", descriptor = "([F)[F", line = 546)
	public float[] method29945(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "au", descriptor = "([F)[F", line = 546)
	public float[] method29946(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dh", descriptor = "([F)[F", line = 546)
	public float[] method29947(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ar", descriptor = "([F)[F", line = 559)
	public float[] method29948(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ap", descriptor = "([F)[F", line = 579)
	public float[] method29949(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dx", descriptor = "([F)[F", line = 579)
	public float[] method29950(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "aq", descriptor = "([F)[F", line = 591)
	public float[] method29951(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dg", descriptor = "([F)[F", line = 591)
	public float[] method29952(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "de", descriptor = "([F)[F", line = 591)
	public float[] method29953(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "dj", descriptor = "([F)[F", line = 591)
	public float[] method29954(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "eo", descriptor = "([F)[F", line = 591)
	public float[] method29955(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ey", descriptor = "([F)[F", line = 591)
	public float[] method29956(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ed", descriptor = "([F)[F", line = 603)
	public float[] method29957(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ax", descriptor = "([F)[F", line = 603)
	public float[] method29958(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ee", descriptor = "([F)[F", line = 603)
	public float[] method29959(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "eu", descriptor = "([F)[F", line = 603)
	public float[] method29960(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!pq", name = "av", descriptor = "(IIIFFF)V", line = 623)
	public void method29961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "es", descriptor = "(IIIFFF)V", line = 623)
	public void method29962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
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

	@OriginalMember(owner = "client!pq", name = "toString", descriptor = "()Ljava/lang/String;", line = 668)
	@Override
	public String toString() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method29847();
		this.method29846();
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

	@OriginalMember(owner = "client!pq", name = "rj", descriptor = "()Ljava/lang/String;", line = 668)
	public String method29963() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method29847();
		this.method29846();
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

	@OriginalMember(owner = "client!pq", name = "hashCode", descriptor = "()I", line = 685)
	@Override
	public int hashCode() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "rk", descriptor = "()I", line = 685)
	public int method29964() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "rm", descriptor = "()I", line = 685)
	public int method29965() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "ri", descriptor = "()I", line = 685)
	public int method29966() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray116);
	}

	@OriginalMember(owner = "client!pq", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 691)
	public boolean method29967(@OriginalArg(0) Object arg0) {
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

	@OriginalMember(owner = "client!pq", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 691)
	public boolean method29968(@OriginalArg(0) Object arg0) {
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

	@OriginalMember(owner = "client!pq", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 691)
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

	@OriginalMember(owner = "client!pq", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 691)
	public boolean method29969(@OriginalArg(0) Object arg0) {
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

	@OriginalMember(owner = "client!pq", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 691)
	public boolean method29970(@OriginalArg(0) Object arg0) {
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
}
