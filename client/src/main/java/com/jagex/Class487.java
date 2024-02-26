package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Arrays;

@OriginalClass("client!pm")
public final class Class487 {

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "F")
	static final float aFloat321 = 1.0E-4F;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	static int anInt5005;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	static int anInt5006;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[Lclient!pm;")
	static Class487[] aClass487Array10 = new Class487[0];

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "Lclient!pm;")
	public static final Class487 aClass487_97 = new Class487();

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "[F")
	public float[] aFloatArray114 = new float[16];

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "(I)V")
	public static void method30086(@OriginalArg(0) int arg0) {
		anInt5005 = arg0;
		aClass487Array10 = new Class487[arg0];
		anInt5006 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "an", descriptor = "(I)V")
	public static void method30116(@OriginalArg(0) int arg0) {
		anInt5005 = arg0;
		aClass487Array10 = new Class487[arg0];
		anInt5006 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "aa", descriptor = "(I)V")
	public static void method30117(@OriginalArg(0) int arg0) {
		anInt5005 = arg0;
		aClass487Array10 = new Class487[arg0];
		anInt5006 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "ae", descriptor = "()Lclient!pm;")
	public static Class487 method30118() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 == 0) {
				return new Class487();
			} else {
				aClass487Array10[--anInt5006].method30139();
				return aClass487Array10[anInt5006];
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "ap", descriptor = "()Lclient!pm;")
	public static Class487 method30119() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 == 0) {
				return new Class487();
			} else {
				aClass487Array10[--anInt5006].method30139();
				return aClass487Array10[anInt5006];
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()Lclient!pm;")
	public static Class487 method30168() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 == 0) {
				return new Class487();
			} else {
				aClass487Array10[--anInt5006].method30139();
				return aClass487Array10[anInt5006];
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class487() {
		this.method30139();
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ald;Z)V")
	public Class487(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		this.method30071(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!pm;)V")
	public Class487(@OriginalArg(0) Class487 arg0) {
		this.method30075(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "cf", descriptor = "()F")
	public float method30066() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "bj", descriptor = "(Lclient!pm;)V")
	public void method30067(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 11);
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "(Lclient!pm;Lclient!pm;)V")
	public void method30068(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray114[0] * arg1.aFloatArray114[0] + arg0.aFloatArray114[1] * arg1.aFloatArray114[4] + arg0.aFloatArray114[2] * arg1.aFloatArray114[8] + arg0.aFloatArray114[3] * arg1.aFloatArray114[12];
		@Pc(79) float local79 = arg0.aFloatArray114[0] * arg1.aFloatArray114[1] + arg0.aFloatArray114[1] * arg1.aFloatArray114[5] + arg0.aFloatArray114[2] * arg1.aFloatArray114[9] + arg0.aFloatArray114[3] * arg1.aFloatArray114[13];
		@Pc(119) float local119 = arg0.aFloatArray114[0] * arg1.aFloatArray114[2] + arg0.aFloatArray114[1] * arg1.aFloatArray114[6] + arg0.aFloatArray114[2] * arg1.aFloatArray114[10] + arg0.aFloatArray114[3] * arg1.aFloatArray114[14];
		@Pc(159) float local159 = arg0.aFloatArray114[0] * arg1.aFloatArray114[3] + arg0.aFloatArray114[1] * arg1.aFloatArray114[7] + arg0.aFloatArray114[2] * arg1.aFloatArray114[11] + arg0.aFloatArray114[3] * arg1.aFloatArray114[15];
		@Pc(199) float local199 = arg0.aFloatArray114[4] * arg1.aFloatArray114[0] + arg0.aFloatArray114[5] * arg1.aFloatArray114[4] + arg0.aFloatArray114[6] * arg1.aFloatArray114[8] + arg0.aFloatArray114[7] * arg1.aFloatArray114[12];
		@Pc(239) float local239 = arg0.aFloatArray114[4] * arg1.aFloatArray114[1] + arg0.aFloatArray114[5] * arg1.aFloatArray114[5] + arg0.aFloatArray114[6] * arg1.aFloatArray114[9] + arg0.aFloatArray114[7] * arg1.aFloatArray114[13];
		@Pc(279) float local279 = arg0.aFloatArray114[4] * arg1.aFloatArray114[2] + arg0.aFloatArray114[5] * arg1.aFloatArray114[6] + arg0.aFloatArray114[6] * arg1.aFloatArray114[10] + arg0.aFloatArray114[7] * arg1.aFloatArray114[14];
		@Pc(319) float local319 = arg0.aFloatArray114[4] * arg1.aFloatArray114[3] + arg0.aFloatArray114[5] * arg1.aFloatArray114[7] + arg0.aFloatArray114[6] * arg1.aFloatArray114[11] + arg0.aFloatArray114[7] * arg1.aFloatArray114[15];
		@Pc(359) float local359 = arg0.aFloatArray114[8] * arg1.aFloatArray114[0] + arg0.aFloatArray114[9] * arg1.aFloatArray114[4] + arg0.aFloatArray114[10] * arg1.aFloatArray114[8] + arg0.aFloatArray114[11] * arg1.aFloatArray114[12];
		@Pc(399) float local399 = arg0.aFloatArray114[8] * arg1.aFloatArray114[1] + arg0.aFloatArray114[9] * arg1.aFloatArray114[5] + arg0.aFloatArray114[10] * arg1.aFloatArray114[9] + arg0.aFloatArray114[11] * arg1.aFloatArray114[13];
		@Pc(439) float local439 = arg0.aFloatArray114[8] * arg1.aFloatArray114[2] + arg0.aFloatArray114[9] * arg1.aFloatArray114[6] + arg0.aFloatArray114[10] * arg1.aFloatArray114[10] + arg0.aFloatArray114[11] * arg1.aFloatArray114[14];
		@Pc(479) float local479 = arg0.aFloatArray114[8] * arg1.aFloatArray114[3] + arg0.aFloatArray114[9] * arg1.aFloatArray114[7] + arg0.aFloatArray114[10] * arg1.aFloatArray114[11] + arg0.aFloatArray114[11] * arg1.aFloatArray114[15];
		@Pc(519) float local519 = arg0.aFloatArray114[12] * arg1.aFloatArray114[0] + arg0.aFloatArray114[13] * arg1.aFloatArray114[4] + arg0.aFloatArray114[14] * arg1.aFloatArray114[8] + arg0.aFloatArray114[15] * arg1.aFloatArray114[12];
		@Pc(559) float local559 = arg0.aFloatArray114[12] * arg1.aFloatArray114[1] + arg0.aFloatArray114[13] * arg1.aFloatArray114[5] + arg0.aFloatArray114[14] * arg1.aFloatArray114[9] + arg0.aFloatArray114[15] * arg1.aFloatArray114[13];
		@Pc(599) float local599 = arg0.aFloatArray114[12] * arg1.aFloatArray114[2] + arg0.aFloatArray114[13] * arg1.aFloatArray114[6] + arg0.aFloatArray114[14] * arg1.aFloatArray114[10] + arg0.aFloatArray114[15] * arg1.aFloatArray114[14];
		@Pc(639) float local639 = arg0.aFloatArray114[12] * arg1.aFloatArray114[3] + arg0.aFloatArray114[13] * arg1.aFloatArray114[7] + arg0.aFloatArray114[14] * arg1.aFloatArray114[11] + arg0.aFloatArray114[15] * arg1.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "()V")
	public void method30069() {
		@Pc(4) float local4 = this.aFloatArray114[0];
		@Pc(9) float local9 = this.aFloatArray114[4];
		@Pc(14) float local14 = this.aFloatArray114[8];
		@Pc(19) float local19 = this.aFloatArray114[12];
		@Pc(24) float local24 = this.aFloatArray114[1];
		@Pc(29) float local29 = this.aFloatArray114[5];
		@Pc(34) float local34 = this.aFloatArray114[9];
		@Pc(39) float local39 = this.aFloatArray114[13];
		@Pc(44) float local44 = this.aFloatArray114[2];
		@Pc(49) float local49 = this.aFloatArray114[6];
		@Pc(54) float local54 = this.aFloatArray114[10];
		@Pc(59) float local59 = this.aFloatArray114[14];
		@Pc(64) float local64 = this.aFloatArray114[3];
		@Pc(69) float local69 = this.aFloatArray114[7];
		@Pc(74) float local74 = this.aFloatArray114[11];
		@Pc(79) float local79 = this.aFloatArray114[15];
		this.aFloatArray114[0] = local4;
		this.aFloatArray114[1] = local9;
		this.aFloatArray114[2] = local14;
		this.aFloatArray114[3] = local19;
		this.aFloatArray114[4] = local24;
		this.aFloatArray114[5] = local29;
		this.aFloatArray114[6] = local34;
		this.aFloatArray114[7] = local39;
		this.aFloatArray114[8] = local44;
		this.aFloatArray114[9] = local49;
		this.aFloatArray114[10] = local54;
		this.aFloatArray114[11] = local59;
		this.aFloatArray114[12] = local64;
		this.aFloatArray114[13] = local69;
		this.aFloatArray114[14] = local74;
		this.aFloatArray114[15] = local79;
	}

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "(FFFF)V")
	public void method30070(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray114[0] = arg0;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg1;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = arg2;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "(Lclient!ald;Z)V")
	void method30071(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray114[local43] = arg0.gFloat();
			}
			return;
		}
		@Pc(5) Class471 local5 = new Class471();
		local5.method29772(Class467.method29716(arg0.g2s()));
		local5.method29773(Class467.method29716(arg0.g2s()));
		local5.method29823(Class467.method29716(arg0.g2s()));
		local5.method29783((float) arg0.g2s(), (float) arg0.g2s(), (float) arg0.g2s());
		this.method30080(local5);
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "()[F")
	float[] method30072() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray114[2] < 0.999D && (double) this.aFloatArray114[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray114[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray114[6] / local35, (double) this.aFloatArray114[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray114[1] / local35, (double) this.aFloatArray114[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray114[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray114[9], (double) this.aFloatArray114[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "at", descriptor = "([F)[F")
	public float[] method30073(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dw", descriptor = "([F)[F")
	public float[] method30074(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "(Lclient!pm;)V")
	public void method30075(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 16);
	}

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "(Lclient!pm;)V")
	public void method30076(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 11);
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method30077() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method30163();
		this.method30072();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				if (local16 > 0) {
					local3.append("\t");
				}
				@Pc(34) float local34 = this.aFloatArray114[local11 * 4 + local16];
				if (Math.sqrt((double) (local34 * local34)) < 9.999999747378752E-5D) {
					local34 = 0.0F;
				}
				local3.append(local34);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!pm;)V")
	public void method30078(@OriginalArg(0) Class487 arg0) {
		@Pc(39) float local39 = this.aFloatArray114[0] * arg0.aFloatArray114[0] + this.aFloatArray114[1] * arg0.aFloatArray114[4] + this.aFloatArray114[2] * arg0.aFloatArray114[8] + this.aFloatArray114[3] * arg0.aFloatArray114[12];
		@Pc(79) float local79 = this.aFloatArray114[0] * arg0.aFloatArray114[1] + this.aFloatArray114[1] * arg0.aFloatArray114[5] + this.aFloatArray114[2] * arg0.aFloatArray114[9] + this.aFloatArray114[3] * arg0.aFloatArray114[13];
		@Pc(119) float local119 = this.aFloatArray114[0] * arg0.aFloatArray114[2] + this.aFloatArray114[1] * arg0.aFloatArray114[6] + this.aFloatArray114[2] * arg0.aFloatArray114[10] + this.aFloatArray114[3] * arg0.aFloatArray114[14];
		@Pc(159) float local159 = this.aFloatArray114[0] * arg0.aFloatArray114[3] + this.aFloatArray114[1] * arg0.aFloatArray114[7] + this.aFloatArray114[2] * arg0.aFloatArray114[11] + this.aFloatArray114[3] * arg0.aFloatArray114[15];
		@Pc(199) float local199 = this.aFloatArray114[4] * arg0.aFloatArray114[0] + this.aFloatArray114[5] * arg0.aFloatArray114[4] + this.aFloatArray114[6] * arg0.aFloatArray114[8] + this.aFloatArray114[7] * arg0.aFloatArray114[12];
		@Pc(239) float local239 = this.aFloatArray114[4] * arg0.aFloatArray114[1] + this.aFloatArray114[5] * arg0.aFloatArray114[5] + this.aFloatArray114[6] * arg0.aFloatArray114[9] + this.aFloatArray114[7] * arg0.aFloatArray114[13];
		@Pc(279) float local279 = this.aFloatArray114[4] * arg0.aFloatArray114[2] + this.aFloatArray114[5] * arg0.aFloatArray114[6] + this.aFloatArray114[6] * arg0.aFloatArray114[10] + this.aFloatArray114[7] * arg0.aFloatArray114[14];
		@Pc(319) float local319 = this.aFloatArray114[4] * arg0.aFloatArray114[3] + this.aFloatArray114[5] * arg0.aFloatArray114[7] + this.aFloatArray114[6] * arg0.aFloatArray114[11] + this.aFloatArray114[7] * arg0.aFloatArray114[15];
		@Pc(359) float local359 = this.aFloatArray114[8] * arg0.aFloatArray114[0] + this.aFloatArray114[9] * arg0.aFloatArray114[4] + this.aFloatArray114[10] * arg0.aFloatArray114[8] + this.aFloatArray114[11] * arg0.aFloatArray114[12];
		@Pc(399) float local399 = this.aFloatArray114[8] * arg0.aFloatArray114[1] + this.aFloatArray114[9] * arg0.aFloatArray114[5] + this.aFloatArray114[10] * arg0.aFloatArray114[9] + this.aFloatArray114[11] * arg0.aFloatArray114[13];
		@Pc(439) float local439 = this.aFloatArray114[8] * arg0.aFloatArray114[2] + this.aFloatArray114[9] * arg0.aFloatArray114[6] + this.aFloatArray114[10] * arg0.aFloatArray114[10] + this.aFloatArray114[11] * arg0.aFloatArray114[14];
		@Pc(479) float local479 = this.aFloatArray114[8] * arg0.aFloatArray114[3] + this.aFloatArray114[9] * arg0.aFloatArray114[7] + this.aFloatArray114[10] * arg0.aFloatArray114[11] + this.aFloatArray114[11] * arg0.aFloatArray114[15];
		@Pc(519) float local519 = this.aFloatArray114[12] * arg0.aFloatArray114[0] + this.aFloatArray114[13] * arg0.aFloatArray114[4] + this.aFloatArray114[14] * arg0.aFloatArray114[8] + this.aFloatArray114[15] * arg0.aFloatArray114[12];
		@Pc(559) float local559 = this.aFloatArray114[12] * arg0.aFloatArray114[1] + this.aFloatArray114[13] * arg0.aFloatArray114[5] + this.aFloatArray114[14] * arg0.aFloatArray114[9] + this.aFloatArray114[15] * arg0.aFloatArray114[13];
		@Pc(599) float local599 = this.aFloatArray114[12] * arg0.aFloatArray114[2] + this.aFloatArray114[13] * arg0.aFloatArray114[6] + this.aFloatArray114[14] * arg0.aFloatArray114[10] + this.aFloatArray114[15] * arg0.aFloatArray114[14];
		@Pc(639) float local639 = this.aFloatArray114[12] * arg0.aFloatArray114[3] + this.aFloatArray114[13] * arg0.aFloatArray114[7] + this.aFloatArray114[14] * arg0.aFloatArray114[11] + this.aFloatArray114[15] * arg0.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "cr", descriptor = "(FFFFFF)V")
	void method30079(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "(Lclient!ov;)V")
	public void method30080(@OriginalArg(0) Class471 arg0) {
		this.aFloatArray114[0] = arg0.aFloat303;
		this.aFloatArray114[1] = arg0.aFloat304;
		this.aFloatArray114[2] = arg0.aFloat305;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = arg0.aFloat311;
		this.aFloatArray114[5] = arg0.aFloat309;
		this.aFloatArray114[6] = arg0.aFloat307;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0.aFloat308;
		this.aFloatArray114[9] = arg0.aFloat306;
		this.aFloatArray114[10] = arg0.aFloat302;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = arg0.aFloat310;
		this.aFloatArray114[13] = arg0.aFloat312;
		this.aFloatArray114[14] = arg0.aFloat313;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "()F")
	float method30081() {
		return this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[12];
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "()V")
	public void method30082() {
		@Pc(4) float local4 = 1.0F / this.method30081();
		@Pc(96) float local96 = (this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[11] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[10] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[11] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[9] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[10] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[11] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[10] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[11] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[8] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[10] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[11] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[9] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[11] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[8] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[9] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[13] + this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[12] - this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[14] + this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[14] - this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[12] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[13] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[10] - this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[9] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[10] + this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[8] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[9] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		this.aFloatArray114[0] = local96;
		this.aFloatArray114[1] = local189;
		this.aFloatArray114[2] = local281;
		this.aFloatArray114[3] = local374;
		this.aFloatArray114[4] = local467;
		this.aFloatArray114[5] = local559;
		this.aFloatArray114[6] = local652;
		this.aFloatArray114[7] = local744;
		this.aFloatArray114[8] = local836;
		this.aFloatArray114[9] = local929;
		this.aFloatArray114[10] = local1021;
		this.aFloatArray114[11] = local1114;
		this.aFloatArray114[12] = local1207;
		this.aFloatArray114[13] = local1299;
		this.aFloatArray114[14] = local1392;
		this.aFloatArray114[15] = local1484;
	}

	@OriginalMember(owner = "client!pm", name = "cs", descriptor = "(FFFFFF)V")
	public void method30083(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "df", descriptor = "([F)[F")
	public float[] method30084(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(FFF[F)V")
	public void method30085(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray114[0] * arg0 + this.aFloatArray114[4] * arg1 + this.aFloatArray114[8] * arg2 + this.aFloatArray114[12];
		arg3[1] = this.aFloatArray114[1] * arg0 + this.aFloatArray114[5] * arg1 + this.aFloatArray114[9] * arg2 + this.aFloatArray114[13];
		arg3[2] = this.aFloatArray114[2] * arg0 + this.aFloatArray114[6] * arg1 + this.aFloatArray114[10] * arg2 + this.aFloatArray114[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray114[3] * arg0 + this.aFloatArray114[7] * arg1 + this.aFloatArray114[11] * arg2 + this.aFloatArray114[15];
		}
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "(FFFFFF)V")
	public void method30087(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "(FFFF)V")
	public void method30088(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method30090(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "(FFF)V")
	public void method30089(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30087(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "(FFFFFF)V")
	void method30090(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "([F)V")
	public void method30091(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray114[0] * local3 + this.aFloatArray114[4] * local7 + this.aFloatArray114[8] * local11 + this.aFloatArray114[12];
		arg0[1] = this.aFloatArray114[1] * local3 + this.aFloatArray114[5] * local7 + this.aFloatArray114[9] * local11 + this.aFloatArray114[13];
		arg0[2] = this.aFloatArray114[2] * local3 + this.aFloatArray114[6] * local7 + this.aFloatArray114[10] * local11 + this.aFloatArray114[14];
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(FFFFFFFFF)V")
	public void method30092(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30087(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "ax", descriptor = "()F")
	public float method30093() {
		return -(this.aFloatArray114[15] + this.aFloatArray114[14]) / (this.aFloatArray114[11] + this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "bm", descriptor = "()F")
	float method30094() {
		return this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[12];
	}

	@OriginalMember(owner = "client!pm", name = "ai", descriptor = "([F)[F")
	public float[] method30095(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "aq", descriptor = "([F)[F")
	public float[] method30096(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ao", descriptor = "([F)[F")
	public float[] method30097(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[1];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[5];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "aj", descriptor = "([F)[F")
	public float[] method30098(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[1];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[5];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ac", descriptor = "([F)[F")
	public float[] method30099(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ag", descriptor = "([F)[F")
	public float[] method30100(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bc", descriptor = "(Lclient!pm;)V")
	public void method30101(@OriginalArg(0) Class487 arg0) {
		@Pc(39) float local39 = this.aFloatArray114[0] * arg0.aFloatArray114[0] + this.aFloatArray114[1] * arg0.aFloatArray114[4] + this.aFloatArray114[2] * arg0.aFloatArray114[8] + this.aFloatArray114[3] * arg0.aFloatArray114[12];
		@Pc(79) float local79 = this.aFloatArray114[0] * arg0.aFloatArray114[1] + this.aFloatArray114[1] * arg0.aFloatArray114[5] + this.aFloatArray114[2] * arg0.aFloatArray114[9] + this.aFloatArray114[3] * arg0.aFloatArray114[13];
		@Pc(119) float local119 = this.aFloatArray114[0] * arg0.aFloatArray114[2] + this.aFloatArray114[1] * arg0.aFloatArray114[6] + this.aFloatArray114[2] * arg0.aFloatArray114[10] + this.aFloatArray114[3] * arg0.aFloatArray114[14];
		@Pc(159) float local159 = this.aFloatArray114[0] * arg0.aFloatArray114[3] + this.aFloatArray114[1] * arg0.aFloatArray114[7] + this.aFloatArray114[2] * arg0.aFloatArray114[11] + this.aFloatArray114[3] * arg0.aFloatArray114[15];
		@Pc(199) float local199 = this.aFloatArray114[4] * arg0.aFloatArray114[0] + this.aFloatArray114[5] * arg0.aFloatArray114[4] + this.aFloatArray114[6] * arg0.aFloatArray114[8] + this.aFloatArray114[7] * arg0.aFloatArray114[12];
		@Pc(239) float local239 = this.aFloatArray114[4] * arg0.aFloatArray114[1] + this.aFloatArray114[5] * arg0.aFloatArray114[5] + this.aFloatArray114[6] * arg0.aFloatArray114[9] + this.aFloatArray114[7] * arg0.aFloatArray114[13];
		@Pc(279) float local279 = this.aFloatArray114[4] * arg0.aFloatArray114[2] + this.aFloatArray114[5] * arg0.aFloatArray114[6] + this.aFloatArray114[6] * arg0.aFloatArray114[10] + this.aFloatArray114[7] * arg0.aFloatArray114[14];
		@Pc(319) float local319 = this.aFloatArray114[4] * arg0.aFloatArray114[3] + this.aFloatArray114[5] * arg0.aFloatArray114[7] + this.aFloatArray114[6] * arg0.aFloatArray114[11] + this.aFloatArray114[7] * arg0.aFloatArray114[15];
		@Pc(359) float local359 = this.aFloatArray114[8] * arg0.aFloatArray114[0] + this.aFloatArray114[9] * arg0.aFloatArray114[4] + this.aFloatArray114[10] * arg0.aFloatArray114[8] + this.aFloatArray114[11] * arg0.aFloatArray114[12];
		@Pc(399) float local399 = this.aFloatArray114[8] * arg0.aFloatArray114[1] + this.aFloatArray114[9] * arg0.aFloatArray114[5] + this.aFloatArray114[10] * arg0.aFloatArray114[9] + this.aFloatArray114[11] * arg0.aFloatArray114[13];
		@Pc(439) float local439 = this.aFloatArray114[8] * arg0.aFloatArray114[2] + this.aFloatArray114[9] * arg0.aFloatArray114[6] + this.aFloatArray114[10] * arg0.aFloatArray114[10] + this.aFloatArray114[11] * arg0.aFloatArray114[14];
		@Pc(479) float local479 = this.aFloatArray114[8] * arg0.aFloatArray114[3] + this.aFloatArray114[9] * arg0.aFloatArray114[7] + this.aFloatArray114[10] * arg0.aFloatArray114[11] + this.aFloatArray114[11] * arg0.aFloatArray114[15];
		@Pc(519) float local519 = this.aFloatArray114[12] * arg0.aFloatArray114[0] + this.aFloatArray114[13] * arg0.aFloatArray114[4] + this.aFloatArray114[14] * arg0.aFloatArray114[8] + this.aFloatArray114[15] * arg0.aFloatArray114[12];
		@Pc(559) float local559 = this.aFloatArray114[12] * arg0.aFloatArray114[1] + this.aFloatArray114[13] * arg0.aFloatArray114[5] + this.aFloatArray114[14] * arg0.aFloatArray114[9] + this.aFloatArray114[15] * arg0.aFloatArray114[13];
		@Pc(599) float local599 = this.aFloatArray114[12] * arg0.aFloatArray114[2] + this.aFloatArray114[13] * arg0.aFloatArray114[6] + this.aFloatArray114[14] * arg0.aFloatArray114[10] + this.aFloatArray114[15] * arg0.aFloatArray114[14];
		@Pc(639) float local639 = this.aFloatArray114[12] * arg0.aFloatArray114[3] + this.aFloatArray114[13] * arg0.aFloatArray114[7] + this.aFloatArray114[14] * arg0.aFloatArray114[11] + this.aFloatArray114[15] * arg0.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "al", descriptor = "([F)[F")
	public float[] method30102(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "()Z")
	public boolean method30103() {
		return this.aFloatArray114[0] == 1.0F && this.aFloatArray114[1] == 0.0F && this.aFloatArray114[2] == 0.0F && this.aFloatArray114[3] == 0.0F && this.aFloatArray114[4] == 0.0F && this.aFloatArray114[5] == 1.0F && this.aFloatArray114[6] == 0.0F && this.aFloatArray114[7] == 0.0F && this.aFloatArray114[8] == 0.0F && this.aFloatArray114[9] == 0.0F && this.aFloatArray114[10] == 1.0F && this.aFloatArray114[11] == 0.0F && this.aFloatArray114[12] == 0.0F && this.aFloatArray114[13] == 0.0F && this.aFloatArray114[14] == 0.0F && this.aFloatArray114[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "af", descriptor = "([F)[F")
	public float[] method30104(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = this.aFloatArray114[2];
		arg0[3] = this.aFloatArray114[4];
		arg0[4] = this.aFloatArray114[5];
		arg0[5] = this.aFloatArray114[6];
		arg0[6] = this.aFloatArray114[8];
		arg0[7] = this.aFloatArray114[9];
		arg0[8] = this.aFloatArray114[10];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dz", descriptor = "([F)[F")
	public float[] method30105(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		arg0[8] = this.aFloatArray114[2];
		arg0[9] = this.aFloatArray114[6];
		arg0[10] = this.aFloatArray114[10];
		arg0[11] = this.aFloatArray114[14];
		arg0[12] = this.aFloatArray114[3];
		arg0[13] = this.aFloatArray114[7];
		arg0[14] = this.aFloatArray114[11];
		arg0[15] = this.aFloatArray114[15];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ak", descriptor = "([F)[F")
	public float[] method30106(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = this.aFloatArray114[4];
		arg0[3] = this.aFloatArray114[5];
		arg0[4] = this.aFloatArray114[8];
		arg0[5] = this.aFloatArray114[9];
		arg0[6] = this.aFloatArray114[12];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "di", descriptor = "([F)[F")
	public float[] method30107(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ad", descriptor = "([F)[F")
	public float[] method30108(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "av", descriptor = "(IIIFFF)V")
	public void method30109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray114[0] = arg1;
			this.aFloatArray114[5] = arg2;
			this.aFloatArray114[10] = 1.0F;
			local98 = this.aFloatArray114;
			local101 = this.aFloatArray114;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
			this.aFloatArray114[0] = local7 * (float) arg1;
			this.aFloatArray114[5] = local7 * (float) arg2;
			this.aFloatArray114[1] = local13 * (float) arg1;
			this.aFloatArray114[4] = -local13 * (float) arg2;
			this.aFloatArray114[10] = 1.0F;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray114;
		local101 = this.aFloatArray114;
		this.aFloatArray114[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
		this.aFloatArray114[12] = arg3;
		this.aFloatArray114[13] = arg4;
		this.aFloatArray114[14] = arg5;
	}

	@OriginalMember(owner = "client!pm", name = "bt", descriptor = "(Lclient!pm;)V")
	public void method30110(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 16);
	}

	@OriginalMember(owner = "client!pm", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray114);
	}

	@OriginalMember(owner = "client!pm", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class487)) {
			return false;
		}
		@Pc(7) Class487 local7 = (Class487) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray114[local9] != local7.aFloatArray114[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "ed", descriptor = "([F)[F")
	public float[] method30111(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30112(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class487)) {
			return false;
		}
		@Pc(7) Class487 local7 = (Class487) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray114[local9] != local7.aFloatArray114[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30113(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class487)) {
			return false;
		}
		@Pc(7) Class487 local7 = (Class487) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray114[local9] != local7.aFloatArray114[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method30114() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method30163();
		this.method30072();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				if (local16 > 0) {
					local3.append("\t");
				}
				@Pc(34) float local34 = this.aFloatArray114[local11 * 4 + local16];
				if (Math.sqrt((double) (local34 * local34)) < 9.999999747378752E-5D) {
					local34 = 0.0F;
				}
				local3.append(local34);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!pm", name = "ah", descriptor = "([F)[F")
	public float[] method30115(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ar", descriptor = "()V")
	public void method30120() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 < anInt5005 - 1) {
				aClass487Array10[anInt5006++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "au", descriptor = "()V")
	public void method30121() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 < anInt5005 - 1) {
				aClass487Array10[anInt5006++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "az", descriptor = "()V")
	public void method30122() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 < anInt5005 - 1) {
				aClass487Array10[anInt5006++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "as", descriptor = "(Lclient!ald;Z)V")
	void method30123(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
				this.aFloatArray114[local43] = arg0.gFloat();
			}
			return;
		}
		@Pc(5) Class471 local5 = new Class471();
		local5.method29772(Class467.method29716(arg0.g2s()));
		local5.method29773(Class467.method29716(arg0.g2s()));
		local5.method29823(Class467.method29716(arg0.g2s()));
		local5.method29783((float) arg0.g2s(), (float) arg0.g2s(), (float) arg0.g2s());
		this.method30080(local5);
	}

	@OriginalMember(owner = "client!pm", name = "aw", descriptor = "()[F")
	float[] method30124() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray114[2] < 0.999D && (double) this.aFloatArray114[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray114[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray114[6] / local35, (double) this.aFloatArray114[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray114[1] / local35, (double) this.aFloatArray114[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray114[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray114[9], (double) this.aFloatArray114[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "bg", descriptor = "()[F")
	float[] method30125() {
		@Pc(2) float[] local2 = new float[3];
		if ((double) this.aFloatArray114[2] < 0.999D && (double) this.aFloatArray114[2] > -0.999D) {
			local2[1] = (float) -Math.asin((double) this.aFloatArray114[2]);
			@Pc(35) double local35 = Math.cos((double) local2[1]);
			local2[0] = (float) Math.atan2((double) this.aFloatArray114[6] / local35, (double) this.aFloatArray114[10] / local35);
			local2[2] = (float) Math.atan2((double) this.aFloatArray114[1] / local35, (double) this.aFloatArray114[0] / local35);
		} else {
			local2[0] = 0.0F;
			local2[1] = (float) Math.atan2((double) this.aFloatArray114[2], 0.0D);
			local2[2] = (float) Math.atan2((double) -this.aFloatArray114[9], (double) this.aFloatArray114[5]);
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "bl", descriptor = "()[F")
	public float[] method30126() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray114[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray114[2];
			local36 = this.aFloatArray114[10];
			@Pc(42) double local42 = (double) this.aFloatArray114[4];
			@Pc(48) double local48 = (double) this.aFloatArray114[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray114[1];
			local36 = this.aFloatArray114[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "br", descriptor = "()[F")
	public float[] method30127() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray114[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray114[2];
			local36 = this.aFloatArray114[10];
			@Pc(42) double local42 = (double) this.aFloatArray114[4];
			@Pc(48) double local48 = (double) this.aFloatArray114[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray114[1];
			local36 = this.aFloatArray114[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "bn", descriptor = "()V")
	public void method30128() {
		this.aFloatArray114[0] = 1.0F;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 1.0F;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 1.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "dq", descriptor = "([F)[F")
	public float[] method30129(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		this.method30163();
		this.method30072();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				if (local16 > 0) {
					local3.append("\t");
				}
				@Pc(34) float local34 = this.aFloatArray114[local11 * 4 + local16];
				if (Math.sqrt((double) (local34 * local34)) < 9.999999747378752E-5D) {
					local34 = 0.0F;
				}
				local3.append(local34);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!pm", name = "bs", descriptor = "(Lclient!pm;)V")
	public void method30130(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 11);
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "(Lclient!pm;)V")
	public void method30131(@OriginalArg(0) Class487 arg0) {
		@Pc(39) float local39 = this.aFloatArray114[0] * arg0.aFloatArray114[0] + this.aFloatArray114[1] * arg0.aFloatArray114[4] + this.aFloatArray114[2] * arg0.aFloatArray114[8] + this.aFloatArray114[3] * arg0.aFloatArray114[12];
		@Pc(79) float local79 = this.aFloatArray114[0] * arg0.aFloatArray114[1] + this.aFloatArray114[1] * arg0.aFloatArray114[5] + this.aFloatArray114[2] * arg0.aFloatArray114[9] + this.aFloatArray114[3] * arg0.aFloatArray114[13];
		@Pc(119) float local119 = this.aFloatArray114[0] * arg0.aFloatArray114[2] + this.aFloatArray114[1] * arg0.aFloatArray114[6] + this.aFloatArray114[2] * arg0.aFloatArray114[10] + this.aFloatArray114[3] * arg0.aFloatArray114[14];
		@Pc(159) float local159 = this.aFloatArray114[0] * arg0.aFloatArray114[3] + this.aFloatArray114[1] * arg0.aFloatArray114[7] + this.aFloatArray114[2] * arg0.aFloatArray114[11] + this.aFloatArray114[3] * arg0.aFloatArray114[15];
		@Pc(199) float local199 = this.aFloatArray114[4] * arg0.aFloatArray114[0] + this.aFloatArray114[5] * arg0.aFloatArray114[4] + this.aFloatArray114[6] * arg0.aFloatArray114[8] + this.aFloatArray114[7] * arg0.aFloatArray114[12];
		@Pc(239) float local239 = this.aFloatArray114[4] * arg0.aFloatArray114[1] + this.aFloatArray114[5] * arg0.aFloatArray114[5] + this.aFloatArray114[6] * arg0.aFloatArray114[9] + this.aFloatArray114[7] * arg0.aFloatArray114[13];
		@Pc(279) float local279 = this.aFloatArray114[4] * arg0.aFloatArray114[2] + this.aFloatArray114[5] * arg0.aFloatArray114[6] + this.aFloatArray114[6] * arg0.aFloatArray114[10] + this.aFloatArray114[7] * arg0.aFloatArray114[14];
		@Pc(319) float local319 = this.aFloatArray114[4] * arg0.aFloatArray114[3] + this.aFloatArray114[5] * arg0.aFloatArray114[7] + this.aFloatArray114[6] * arg0.aFloatArray114[11] + this.aFloatArray114[7] * arg0.aFloatArray114[15];
		@Pc(359) float local359 = this.aFloatArray114[8] * arg0.aFloatArray114[0] + this.aFloatArray114[9] * arg0.aFloatArray114[4] + this.aFloatArray114[10] * arg0.aFloatArray114[8] + this.aFloatArray114[11] * arg0.aFloatArray114[12];
		@Pc(399) float local399 = this.aFloatArray114[8] * arg0.aFloatArray114[1] + this.aFloatArray114[9] * arg0.aFloatArray114[5] + this.aFloatArray114[10] * arg0.aFloatArray114[9] + this.aFloatArray114[11] * arg0.aFloatArray114[13];
		@Pc(439) float local439 = this.aFloatArray114[8] * arg0.aFloatArray114[2] + this.aFloatArray114[9] * arg0.aFloatArray114[6] + this.aFloatArray114[10] * arg0.aFloatArray114[10] + this.aFloatArray114[11] * arg0.aFloatArray114[14];
		@Pc(479) float local479 = this.aFloatArray114[8] * arg0.aFloatArray114[3] + this.aFloatArray114[9] * arg0.aFloatArray114[7] + this.aFloatArray114[10] * arg0.aFloatArray114[11] + this.aFloatArray114[11] * arg0.aFloatArray114[15];
		@Pc(519) float local519 = this.aFloatArray114[12] * arg0.aFloatArray114[0] + this.aFloatArray114[13] * arg0.aFloatArray114[4] + this.aFloatArray114[14] * arg0.aFloatArray114[8] + this.aFloatArray114[15] * arg0.aFloatArray114[12];
		@Pc(559) float local559 = this.aFloatArray114[12] * arg0.aFloatArray114[1] + this.aFloatArray114[13] * arg0.aFloatArray114[5] + this.aFloatArray114[14] * arg0.aFloatArray114[9] + this.aFloatArray114[15] * arg0.aFloatArray114[13];
		@Pc(599) float local599 = this.aFloatArray114[12] * arg0.aFloatArray114[2] + this.aFloatArray114[13] * arg0.aFloatArray114[6] + this.aFloatArray114[14] * arg0.aFloatArray114[10] + this.aFloatArray114[15] * arg0.aFloatArray114[14];
		@Pc(639) float local639 = this.aFloatArray114[12] * arg0.aFloatArray114[3] + this.aFloatArray114[13] * arg0.aFloatArray114[7] + this.aFloatArray114[14] * arg0.aFloatArray114[11] + this.aFloatArray114[15] * arg0.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "by", descriptor = "(Lclient!pm;)V")
	public void method30132(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 11);
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "bk", descriptor = "(Lclient!pm;)V")
	public void method30133(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 11);
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "bz", descriptor = "(Lclient!pm;Lclient!pm;)V")
	public void method30134(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray114[0] * arg1.aFloatArray114[0] + arg0.aFloatArray114[1] * arg1.aFloatArray114[4] + arg0.aFloatArray114[2] * arg1.aFloatArray114[8] + arg0.aFloatArray114[3] * arg1.aFloatArray114[12];
		@Pc(79) float local79 = arg0.aFloatArray114[0] * arg1.aFloatArray114[1] + arg0.aFloatArray114[1] * arg1.aFloatArray114[5] + arg0.aFloatArray114[2] * arg1.aFloatArray114[9] + arg0.aFloatArray114[3] * arg1.aFloatArray114[13];
		@Pc(119) float local119 = arg0.aFloatArray114[0] * arg1.aFloatArray114[2] + arg0.aFloatArray114[1] * arg1.aFloatArray114[6] + arg0.aFloatArray114[2] * arg1.aFloatArray114[10] + arg0.aFloatArray114[3] * arg1.aFloatArray114[14];
		@Pc(159) float local159 = arg0.aFloatArray114[0] * arg1.aFloatArray114[3] + arg0.aFloatArray114[1] * arg1.aFloatArray114[7] + arg0.aFloatArray114[2] * arg1.aFloatArray114[11] + arg0.aFloatArray114[3] * arg1.aFloatArray114[15];
		@Pc(199) float local199 = arg0.aFloatArray114[4] * arg1.aFloatArray114[0] + arg0.aFloatArray114[5] * arg1.aFloatArray114[4] + arg0.aFloatArray114[6] * arg1.aFloatArray114[8] + arg0.aFloatArray114[7] * arg1.aFloatArray114[12];
		@Pc(239) float local239 = arg0.aFloatArray114[4] * arg1.aFloatArray114[1] + arg0.aFloatArray114[5] * arg1.aFloatArray114[5] + arg0.aFloatArray114[6] * arg1.aFloatArray114[9] + arg0.aFloatArray114[7] * arg1.aFloatArray114[13];
		@Pc(279) float local279 = arg0.aFloatArray114[4] * arg1.aFloatArray114[2] + arg0.aFloatArray114[5] * arg1.aFloatArray114[6] + arg0.aFloatArray114[6] * arg1.aFloatArray114[10] + arg0.aFloatArray114[7] * arg1.aFloatArray114[14];
		@Pc(319) float local319 = arg0.aFloatArray114[4] * arg1.aFloatArray114[3] + arg0.aFloatArray114[5] * arg1.aFloatArray114[7] + arg0.aFloatArray114[6] * arg1.aFloatArray114[11] + arg0.aFloatArray114[7] * arg1.aFloatArray114[15];
		@Pc(359) float local359 = arg0.aFloatArray114[8] * arg1.aFloatArray114[0] + arg0.aFloatArray114[9] * arg1.aFloatArray114[4] + arg0.aFloatArray114[10] * arg1.aFloatArray114[8] + arg0.aFloatArray114[11] * arg1.aFloatArray114[12];
		@Pc(399) float local399 = arg0.aFloatArray114[8] * arg1.aFloatArray114[1] + arg0.aFloatArray114[9] * arg1.aFloatArray114[5] + arg0.aFloatArray114[10] * arg1.aFloatArray114[9] + arg0.aFloatArray114[11] * arg1.aFloatArray114[13];
		@Pc(439) float local439 = arg0.aFloatArray114[8] * arg1.aFloatArray114[2] + arg0.aFloatArray114[9] * arg1.aFloatArray114[6] + arg0.aFloatArray114[10] * arg1.aFloatArray114[10] + arg0.aFloatArray114[11] * arg1.aFloatArray114[14];
		@Pc(479) float local479 = arg0.aFloatArray114[8] * arg1.aFloatArray114[3] + arg0.aFloatArray114[9] * arg1.aFloatArray114[7] + arg0.aFloatArray114[10] * arg1.aFloatArray114[11] + arg0.aFloatArray114[11] * arg1.aFloatArray114[15];
		@Pc(519) float local519 = arg0.aFloatArray114[12] * arg1.aFloatArray114[0] + arg0.aFloatArray114[13] * arg1.aFloatArray114[4] + arg0.aFloatArray114[14] * arg1.aFloatArray114[8] + arg0.aFloatArray114[15] * arg1.aFloatArray114[12];
		@Pc(559) float local559 = arg0.aFloatArray114[12] * arg1.aFloatArray114[1] + arg0.aFloatArray114[13] * arg1.aFloatArray114[5] + arg0.aFloatArray114[14] * arg1.aFloatArray114[9] + arg0.aFloatArray114[15] * arg1.aFloatArray114[13];
		@Pc(599) float local599 = arg0.aFloatArray114[12] * arg1.aFloatArray114[2] + arg0.aFloatArray114[13] * arg1.aFloatArray114[6] + arg0.aFloatArray114[14] * arg1.aFloatArray114[10] + arg0.aFloatArray114[15] * arg1.aFloatArray114[14];
		@Pc(639) float local639 = arg0.aFloatArray114[12] * arg1.aFloatArray114[3] + arg0.aFloatArray114[13] * arg1.aFloatArray114[7] + arg0.aFloatArray114[14] * arg1.aFloatArray114[11] + arg0.aFloatArray114[15] * arg1.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "am", descriptor = "([F)[F")
	public float[] method30135(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		arg0[8] = this.aFloatArray114[2];
		arg0[9] = this.aFloatArray114[6];
		arg0[10] = this.aFloatArray114[10];
		arg0[11] = this.aFloatArray114[14];
		arg0[12] = this.aFloatArray114[3];
		arg0[13] = this.aFloatArray114[7];
		arg0[14] = this.aFloatArray114[11];
		arg0[15] = this.aFloatArray114[15];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bh", descriptor = "(Lclient!pm;Lclient!pm;)V")
	public void method30136(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray114[0] * arg1.aFloatArray114[0] + arg0.aFloatArray114[1] * arg1.aFloatArray114[4] + arg0.aFloatArray114[2] * arg1.aFloatArray114[8] + arg0.aFloatArray114[3] * arg1.aFloatArray114[12];
		@Pc(79) float local79 = arg0.aFloatArray114[0] * arg1.aFloatArray114[1] + arg0.aFloatArray114[1] * arg1.aFloatArray114[5] + arg0.aFloatArray114[2] * arg1.aFloatArray114[9] + arg0.aFloatArray114[3] * arg1.aFloatArray114[13];
		@Pc(119) float local119 = arg0.aFloatArray114[0] * arg1.aFloatArray114[2] + arg0.aFloatArray114[1] * arg1.aFloatArray114[6] + arg0.aFloatArray114[2] * arg1.aFloatArray114[10] + arg0.aFloatArray114[3] * arg1.aFloatArray114[14];
		@Pc(159) float local159 = arg0.aFloatArray114[0] * arg1.aFloatArray114[3] + arg0.aFloatArray114[1] * arg1.aFloatArray114[7] + arg0.aFloatArray114[2] * arg1.aFloatArray114[11] + arg0.aFloatArray114[3] * arg1.aFloatArray114[15];
		@Pc(199) float local199 = arg0.aFloatArray114[4] * arg1.aFloatArray114[0] + arg0.aFloatArray114[5] * arg1.aFloatArray114[4] + arg0.aFloatArray114[6] * arg1.aFloatArray114[8] + arg0.aFloatArray114[7] * arg1.aFloatArray114[12];
		@Pc(239) float local239 = arg0.aFloatArray114[4] * arg1.aFloatArray114[1] + arg0.aFloatArray114[5] * arg1.aFloatArray114[5] + arg0.aFloatArray114[6] * arg1.aFloatArray114[9] + arg0.aFloatArray114[7] * arg1.aFloatArray114[13];
		@Pc(279) float local279 = arg0.aFloatArray114[4] * arg1.aFloatArray114[2] + arg0.aFloatArray114[5] * arg1.aFloatArray114[6] + arg0.aFloatArray114[6] * arg1.aFloatArray114[10] + arg0.aFloatArray114[7] * arg1.aFloatArray114[14];
		@Pc(319) float local319 = arg0.aFloatArray114[4] * arg1.aFloatArray114[3] + arg0.aFloatArray114[5] * arg1.aFloatArray114[7] + arg0.aFloatArray114[6] * arg1.aFloatArray114[11] + arg0.aFloatArray114[7] * arg1.aFloatArray114[15];
		@Pc(359) float local359 = arg0.aFloatArray114[8] * arg1.aFloatArray114[0] + arg0.aFloatArray114[9] * arg1.aFloatArray114[4] + arg0.aFloatArray114[10] * arg1.aFloatArray114[8] + arg0.aFloatArray114[11] * arg1.aFloatArray114[12];
		@Pc(399) float local399 = arg0.aFloatArray114[8] * arg1.aFloatArray114[1] + arg0.aFloatArray114[9] * arg1.aFloatArray114[5] + arg0.aFloatArray114[10] * arg1.aFloatArray114[9] + arg0.aFloatArray114[11] * arg1.aFloatArray114[13];
		@Pc(439) float local439 = arg0.aFloatArray114[8] * arg1.aFloatArray114[2] + arg0.aFloatArray114[9] * arg1.aFloatArray114[6] + arg0.aFloatArray114[10] * arg1.aFloatArray114[10] + arg0.aFloatArray114[11] * arg1.aFloatArray114[14];
		@Pc(479) float local479 = arg0.aFloatArray114[8] * arg1.aFloatArray114[3] + arg0.aFloatArray114[9] * arg1.aFloatArray114[7] + arg0.aFloatArray114[10] * arg1.aFloatArray114[11] + arg0.aFloatArray114[11] * arg1.aFloatArray114[15];
		@Pc(519) float local519 = arg0.aFloatArray114[12] * arg1.aFloatArray114[0] + arg0.aFloatArray114[13] * arg1.aFloatArray114[4] + arg0.aFloatArray114[14] * arg1.aFloatArray114[8] + arg0.aFloatArray114[15] * arg1.aFloatArray114[12];
		@Pc(559) float local559 = arg0.aFloatArray114[12] * arg1.aFloatArray114[1] + arg0.aFloatArray114[13] * arg1.aFloatArray114[5] + arg0.aFloatArray114[14] * arg1.aFloatArray114[9] + arg0.aFloatArray114[15] * arg1.aFloatArray114[13];
		@Pc(599) float local599 = arg0.aFloatArray114[12] * arg1.aFloatArray114[2] + arg0.aFloatArray114[13] * arg1.aFloatArray114[6] + arg0.aFloatArray114[14] * arg1.aFloatArray114[10] + arg0.aFloatArray114[15] * arg1.aFloatArray114[14];
		@Pc(639) float local639 = arg0.aFloatArray114[12] * arg1.aFloatArray114[3] + arg0.aFloatArray114[13] * arg1.aFloatArray114[7] + arg0.aFloatArray114[14] * arg1.aFloatArray114[11] + arg0.aFloatArray114[15] * arg1.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "(FFF)V")
	public void method30137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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
		this.aFloatArray114[0] = local107 + local91 - local127 - local119;
		this.aFloatArray114[1] = local111 + local103 + local111 + local103;
		this.aFloatArray114[2] = local115 - local99 - local99 + local115;
		this.aFloatArray114[4] = local111 - local103 - local103 + local111;
		this.aFloatArray114[5] = local119 + local91 - local107 - local127;
		this.aFloatArray114[6] = local123 + local95 + local123 + local95;
		this.aFloatArray114[8] = local115 + local99 + local115 + local99;
		this.aFloatArray114[9] = local123 - local95 - local95 + local123;
		this.aFloatArray114[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pm", name = "bp", descriptor = "(Lclient!pm;)V")
	public void method30138(@OriginalArg(0) Class487 arg0) {
		@Pc(39) float local39 = this.aFloatArray114[0] * arg0.aFloatArray114[0] + this.aFloatArray114[1] * arg0.aFloatArray114[4] + this.aFloatArray114[2] * arg0.aFloatArray114[8] + this.aFloatArray114[3] * arg0.aFloatArray114[12];
		@Pc(79) float local79 = this.aFloatArray114[0] * arg0.aFloatArray114[1] + this.aFloatArray114[1] * arg0.aFloatArray114[5] + this.aFloatArray114[2] * arg0.aFloatArray114[9] + this.aFloatArray114[3] * arg0.aFloatArray114[13];
		@Pc(119) float local119 = this.aFloatArray114[0] * arg0.aFloatArray114[2] + this.aFloatArray114[1] * arg0.aFloatArray114[6] + this.aFloatArray114[2] * arg0.aFloatArray114[10] + this.aFloatArray114[3] * arg0.aFloatArray114[14];
		@Pc(159) float local159 = this.aFloatArray114[0] * arg0.aFloatArray114[3] + this.aFloatArray114[1] * arg0.aFloatArray114[7] + this.aFloatArray114[2] * arg0.aFloatArray114[11] + this.aFloatArray114[3] * arg0.aFloatArray114[15];
		@Pc(199) float local199 = this.aFloatArray114[4] * arg0.aFloatArray114[0] + this.aFloatArray114[5] * arg0.aFloatArray114[4] + this.aFloatArray114[6] * arg0.aFloatArray114[8] + this.aFloatArray114[7] * arg0.aFloatArray114[12];
		@Pc(239) float local239 = this.aFloatArray114[4] * arg0.aFloatArray114[1] + this.aFloatArray114[5] * arg0.aFloatArray114[5] + this.aFloatArray114[6] * arg0.aFloatArray114[9] + this.aFloatArray114[7] * arg0.aFloatArray114[13];
		@Pc(279) float local279 = this.aFloatArray114[4] * arg0.aFloatArray114[2] + this.aFloatArray114[5] * arg0.aFloatArray114[6] + this.aFloatArray114[6] * arg0.aFloatArray114[10] + this.aFloatArray114[7] * arg0.aFloatArray114[14];
		@Pc(319) float local319 = this.aFloatArray114[4] * arg0.aFloatArray114[3] + this.aFloatArray114[5] * arg0.aFloatArray114[7] + this.aFloatArray114[6] * arg0.aFloatArray114[11] + this.aFloatArray114[7] * arg0.aFloatArray114[15];
		@Pc(359) float local359 = this.aFloatArray114[8] * arg0.aFloatArray114[0] + this.aFloatArray114[9] * arg0.aFloatArray114[4] + this.aFloatArray114[10] * arg0.aFloatArray114[8] + this.aFloatArray114[11] * arg0.aFloatArray114[12];
		@Pc(399) float local399 = this.aFloatArray114[8] * arg0.aFloatArray114[1] + this.aFloatArray114[9] * arg0.aFloatArray114[5] + this.aFloatArray114[10] * arg0.aFloatArray114[9] + this.aFloatArray114[11] * arg0.aFloatArray114[13];
		@Pc(439) float local439 = this.aFloatArray114[8] * arg0.aFloatArray114[2] + this.aFloatArray114[9] * arg0.aFloatArray114[6] + this.aFloatArray114[10] * arg0.aFloatArray114[10] + this.aFloatArray114[11] * arg0.aFloatArray114[14];
		@Pc(479) float local479 = this.aFloatArray114[8] * arg0.aFloatArray114[3] + this.aFloatArray114[9] * arg0.aFloatArray114[7] + this.aFloatArray114[10] * arg0.aFloatArray114[11] + this.aFloatArray114[11] * arg0.aFloatArray114[15];
		@Pc(519) float local519 = this.aFloatArray114[12] * arg0.aFloatArray114[0] + this.aFloatArray114[13] * arg0.aFloatArray114[4] + this.aFloatArray114[14] * arg0.aFloatArray114[8] + this.aFloatArray114[15] * arg0.aFloatArray114[12];
		@Pc(559) float local559 = this.aFloatArray114[12] * arg0.aFloatArray114[1] + this.aFloatArray114[13] * arg0.aFloatArray114[5] + this.aFloatArray114[14] * arg0.aFloatArray114[9] + this.aFloatArray114[15] * arg0.aFloatArray114[13];
		@Pc(599) float local599 = this.aFloatArray114[12] * arg0.aFloatArray114[2] + this.aFloatArray114[13] * arg0.aFloatArray114[6] + this.aFloatArray114[14] * arg0.aFloatArray114[10] + this.aFloatArray114[15] * arg0.aFloatArray114[14];
		@Pc(639) float local639 = this.aFloatArray114[12] * arg0.aFloatArray114[3] + this.aFloatArray114[13] * arg0.aFloatArray114[7] + this.aFloatArray114[14] * arg0.aFloatArray114[11] + this.aFloatArray114[15] * arg0.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "()V")
	public void method30139() {
		this.aFloatArray114[0] = 1.0F;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 1.0F;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 1.0F;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "bo", descriptor = "(Lclient!pm;)V")
	public void method30140(@OriginalArg(0) Class487 arg0) {
		@Pc(39) float local39 = this.aFloatArray114[0] * arg0.aFloatArray114[0] + this.aFloatArray114[1] * arg0.aFloatArray114[4] + this.aFloatArray114[2] * arg0.aFloatArray114[8] + this.aFloatArray114[3] * arg0.aFloatArray114[12];
		@Pc(79) float local79 = this.aFloatArray114[0] * arg0.aFloatArray114[1] + this.aFloatArray114[1] * arg0.aFloatArray114[5] + this.aFloatArray114[2] * arg0.aFloatArray114[9] + this.aFloatArray114[3] * arg0.aFloatArray114[13];
		@Pc(119) float local119 = this.aFloatArray114[0] * arg0.aFloatArray114[2] + this.aFloatArray114[1] * arg0.aFloatArray114[6] + this.aFloatArray114[2] * arg0.aFloatArray114[10] + this.aFloatArray114[3] * arg0.aFloatArray114[14];
		@Pc(159) float local159 = this.aFloatArray114[0] * arg0.aFloatArray114[3] + this.aFloatArray114[1] * arg0.aFloatArray114[7] + this.aFloatArray114[2] * arg0.aFloatArray114[11] + this.aFloatArray114[3] * arg0.aFloatArray114[15];
		@Pc(199) float local199 = this.aFloatArray114[4] * arg0.aFloatArray114[0] + this.aFloatArray114[5] * arg0.aFloatArray114[4] + this.aFloatArray114[6] * arg0.aFloatArray114[8] + this.aFloatArray114[7] * arg0.aFloatArray114[12];
		@Pc(239) float local239 = this.aFloatArray114[4] * arg0.aFloatArray114[1] + this.aFloatArray114[5] * arg0.aFloatArray114[5] + this.aFloatArray114[6] * arg0.aFloatArray114[9] + this.aFloatArray114[7] * arg0.aFloatArray114[13];
		@Pc(279) float local279 = this.aFloatArray114[4] * arg0.aFloatArray114[2] + this.aFloatArray114[5] * arg0.aFloatArray114[6] + this.aFloatArray114[6] * arg0.aFloatArray114[10] + this.aFloatArray114[7] * arg0.aFloatArray114[14];
		@Pc(319) float local319 = this.aFloatArray114[4] * arg0.aFloatArray114[3] + this.aFloatArray114[5] * arg0.aFloatArray114[7] + this.aFloatArray114[6] * arg0.aFloatArray114[11] + this.aFloatArray114[7] * arg0.aFloatArray114[15];
		@Pc(359) float local359 = this.aFloatArray114[8] * arg0.aFloatArray114[0] + this.aFloatArray114[9] * arg0.aFloatArray114[4] + this.aFloatArray114[10] * arg0.aFloatArray114[8] + this.aFloatArray114[11] * arg0.aFloatArray114[12];
		@Pc(399) float local399 = this.aFloatArray114[8] * arg0.aFloatArray114[1] + this.aFloatArray114[9] * arg0.aFloatArray114[5] + this.aFloatArray114[10] * arg0.aFloatArray114[9] + this.aFloatArray114[11] * arg0.aFloatArray114[13];
		@Pc(439) float local439 = this.aFloatArray114[8] * arg0.aFloatArray114[2] + this.aFloatArray114[9] * arg0.aFloatArray114[6] + this.aFloatArray114[10] * arg0.aFloatArray114[10] + this.aFloatArray114[11] * arg0.aFloatArray114[14];
		@Pc(479) float local479 = this.aFloatArray114[8] * arg0.aFloatArray114[3] + this.aFloatArray114[9] * arg0.aFloatArray114[7] + this.aFloatArray114[10] * arg0.aFloatArray114[11] + this.aFloatArray114[11] * arg0.aFloatArray114[15];
		@Pc(519) float local519 = this.aFloatArray114[12] * arg0.aFloatArray114[0] + this.aFloatArray114[13] * arg0.aFloatArray114[4] + this.aFloatArray114[14] * arg0.aFloatArray114[8] + this.aFloatArray114[15] * arg0.aFloatArray114[12];
		@Pc(559) float local559 = this.aFloatArray114[12] * arg0.aFloatArray114[1] + this.aFloatArray114[13] * arg0.aFloatArray114[5] + this.aFloatArray114[14] * arg0.aFloatArray114[9] + this.aFloatArray114[15] * arg0.aFloatArray114[13];
		@Pc(599) float local599 = this.aFloatArray114[12] * arg0.aFloatArray114[2] + this.aFloatArray114[13] * arg0.aFloatArray114[6] + this.aFloatArray114[14] * arg0.aFloatArray114[10] + this.aFloatArray114[15] * arg0.aFloatArray114[14];
		@Pc(639) float local639 = this.aFloatArray114[12] * arg0.aFloatArray114[3] + this.aFloatArray114[13] * arg0.aFloatArray114[7] + this.aFloatArray114[14] * arg0.aFloatArray114[11] + this.aFloatArray114[15] * arg0.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "dl", descriptor = "([F)[F")
	public float[] method30141(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[1];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[5];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bv", descriptor = "(Lclient!pm;Lclient!pm;)V")
	public void method30142(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray114[0] * arg1.aFloatArray114[0] + arg0.aFloatArray114[1] * arg1.aFloatArray114[4] + arg0.aFloatArray114[2] * arg1.aFloatArray114[8] + arg0.aFloatArray114[3] * arg1.aFloatArray114[12];
		@Pc(79) float local79 = arg0.aFloatArray114[0] * arg1.aFloatArray114[1] + arg0.aFloatArray114[1] * arg1.aFloatArray114[5] + arg0.aFloatArray114[2] * arg1.aFloatArray114[9] + arg0.aFloatArray114[3] * arg1.aFloatArray114[13];
		@Pc(119) float local119 = arg0.aFloatArray114[0] * arg1.aFloatArray114[2] + arg0.aFloatArray114[1] * arg1.aFloatArray114[6] + arg0.aFloatArray114[2] * arg1.aFloatArray114[10] + arg0.aFloatArray114[3] * arg1.aFloatArray114[14];
		@Pc(159) float local159 = arg0.aFloatArray114[0] * arg1.aFloatArray114[3] + arg0.aFloatArray114[1] * arg1.aFloatArray114[7] + arg0.aFloatArray114[2] * arg1.aFloatArray114[11] + arg0.aFloatArray114[3] * arg1.aFloatArray114[15];
		@Pc(199) float local199 = arg0.aFloatArray114[4] * arg1.aFloatArray114[0] + arg0.aFloatArray114[5] * arg1.aFloatArray114[4] + arg0.aFloatArray114[6] * arg1.aFloatArray114[8] + arg0.aFloatArray114[7] * arg1.aFloatArray114[12];
		@Pc(239) float local239 = arg0.aFloatArray114[4] * arg1.aFloatArray114[1] + arg0.aFloatArray114[5] * arg1.aFloatArray114[5] + arg0.aFloatArray114[6] * arg1.aFloatArray114[9] + arg0.aFloatArray114[7] * arg1.aFloatArray114[13];
		@Pc(279) float local279 = arg0.aFloatArray114[4] * arg1.aFloatArray114[2] + arg0.aFloatArray114[5] * arg1.aFloatArray114[6] + arg0.aFloatArray114[6] * arg1.aFloatArray114[10] + arg0.aFloatArray114[7] * arg1.aFloatArray114[14];
		@Pc(319) float local319 = arg0.aFloatArray114[4] * arg1.aFloatArray114[3] + arg0.aFloatArray114[5] * arg1.aFloatArray114[7] + arg0.aFloatArray114[6] * arg1.aFloatArray114[11] + arg0.aFloatArray114[7] * arg1.aFloatArray114[15];
		@Pc(359) float local359 = arg0.aFloatArray114[8] * arg1.aFloatArray114[0] + arg0.aFloatArray114[9] * arg1.aFloatArray114[4] + arg0.aFloatArray114[10] * arg1.aFloatArray114[8] + arg0.aFloatArray114[11] * arg1.aFloatArray114[12];
		@Pc(399) float local399 = arg0.aFloatArray114[8] * arg1.aFloatArray114[1] + arg0.aFloatArray114[9] * arg1.aFloatArray114[5] + arg0.aFloatArray114[10] * arg1.aFloatArray114[9] + arg0.aFloatArray114[11] * arg1.aFloatArray114[13];
		@Pc(439) float local439 = arg0.aFloatArray114[8] * arg1.aFloatArray114[2] + arg0.aFloatArray114[9] * arg1.aFloatArray114[6] + arg0.aFloatArray114[10] * arg1.aFloatArray114[10] + arg0.aFloatArray114[11] * arg1.aFloatArray114[14];
		@Pc(479) float local479 = arg0.aFloatArray114[8] * arg1.aFloatArray114[3] + arg0.aFloatArray114[9] * arg1.aFloatArray114[7] + arg0.aFloatArray114[10] * arg1.aFloatArray114[11] + arg0.aFloatArray114[11] * arg1.aFloatArray114[15];
		@Pc(519) float local519 = arg0.aFloatArray114[12] * arg1.aFloatArray114[0] + arg0.aFloatArray114[13] * arg1.aFloatArray114[4] + arg0.aFloatArray114[14] * arg1.aFloatArray114[8] + arg0.aFloatArray114[15] * arg1.aFloatArray114[12];
		@Pc(559) float local559 = arg0.aFloatArray114[12] * arg1.aFloatArray114[1] + arg0.aFloatArray114[13] * arg1.aFloatArray114[5] + arg0.aFloatArray114[14] * arg1.aFloatArray114[9] + arg0.aFloatArray114[15] * arg1.aFloatArray114[13];
		@Pc(599) float local599 = arg0.aFloatArray114[12] * arg1.aFloatArray114[2] + arg0.aFloatArray114[13] * arg1.aFloatArray114[6] + arg0.aFloatArray114[14] * arg1.aFloatArray114[10] + arg0.aFloatArray114[15] * arg1.aFloatArray114[14];
		@Pc(639) float local639 = arg0.aFloatArray114[12] * arg1.aFloatArray114[3] + arg0.aFloatArray114[13] * arg1.aFloatArray114[7] + arg0.aFloatArray114[14] * arg1.aFloatArray114[11] + arg0.aFloatArray114[15] * arg1.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "ay", descriptor = "()F")
	public float method30143() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "cq", descriptor = "()F")
	public float method30144() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "bi", descriptor = "(Lclient!ov;)V")
	public void method30145(@OriginalArg(0) Class471 arg0) {
		this.aFloatArray114[0] = arg0.aFloat303;
		this.aFloatArray114[1] = arg0.aFloat304;
		this.aFloatArray114[2] = arg0.aFloat305;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = arg0.aFloat311;
		this.aFloatArray114[5] = arg0.aFloat309;
		this.aFloatArray114[6] = arg0.aFloat307;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0.aFloat308;
		this.aFloatArray114[9] = arg0.aFloat306;
		this.aFloatArray114[10] = arg0.aFloat302;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = arg0.aFloat310;
		this.aFloatArray114[13] = arg0.aFloat312;
		this.aFloatArray114[14] = arg0.aFloat313;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "bu", descriptor = "(Lclient!ov;)V")
	public void method30146(@OriginalArg(0) Class471 arg0) {
		this.aFloatArray114[0] = arg0.aFloat303;
		this.aFloatArray114[1] = arg0.aFloat304;
		this.aFloatArray114[2] = arg0.aFloat305;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = arg0.aFloat311;
		this.aFloatArray114[5] = arg0.aFloat309;
		this.aFloatArray114[6] = arg0.aFloat307;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0.aFloat308;
		this.aFloatArray114[9] = arg0.aFloat306;
		this.aFloatArray114[10] = arg0.aFloat302;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = arg0.aFloat310;
		this.aFloatArray114[13] = arg0.aFloat312;
		this.aFloatArray114[14] = arg0.aFloat313;
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "()V")
	public void method30147() {
		@Pc(2) Class487[] local2 = aClass487Array10;
		synchronized (aClass487Array10) {
			if (anInt5006 < anInt5005 - 1) {
				aClass487Array10[anInt5006++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "bq", descriptor = "()V")
	public void method30148() {
		@Pc(4) float local4 = 1.0F / this.method30081();
		@Pc(96) float local96 = (this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[11] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[10] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[11] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[9] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[10] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[11] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[10] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[11] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[8] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[10] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[11] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[9] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[11] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[8] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[9] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[13] + this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[12] - this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[14] + this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[14] - this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[12] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[13] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[10] - this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[9] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[10] + this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[8] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[9] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		this.aFloatArray114[0] = local96;
		this.aFloatArray114[1] = local189;
		this.aFloatArray114[2] = local281;
		this.aFloatArray114[3] = local374;
		this.aFloatArray114[4] = local467;
		this.aFloatArray114[5] = local559;
		this.aFloatArray114[6] = local652;
		this.aFloatArray114[7] = local744;
		this.aFloatArray114[8] = local836;
		this.aFloatArray114[9] = local929;
		this.aFloatArray114[10] = local1021;
		this.aFloatArray114[11] = local1114;
		this.aFloatArray114[12] = local1207;
		this.aFloatArray114[13] = local1299;
		this.aFloatArray114[14] = local1392;
		this.aFloatArray114[15] = local1484;
	}

	@OriginalMember(owner = "client!pm", name = "bd", descriptor = "()V")
	public void method30149() {
		@Pc(4) float local4 = 1.0F / this.method30081();
		@Pc(96) float local96 = (this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[11] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[10] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[11] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[9] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[10] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[15] + this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[14] + this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[6] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[7] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[14] - this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[2] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[3] * this.aFloatArray114[10] * this.aFloatArray114[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[14] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[15] - this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[14] + this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[11] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[10] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[11] + this.aFloatArray114[2] * this.aFloatArray114[7] * this.aFloatArray114[8] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[10] - this.aFloatArray114[3] * this.aFloatArray114[6] * this.aFloatArray114[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[15] - this.aFloatArray114[4] * this.aFloatArray114[11] * this.aFloatArray114[13] - this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[15] + this.aFloatArray114[5] * this.aFloatArray114[11] * this.aFloatArray114[12] + this.aFloatArray114[7] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[7] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[15] + this.aFloatArray114[0] * this.aFloatArray114[11] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[15] - this.aFloatArray114[1] * this.aFloatArray114[11] * this.aFloatArray114[12] - this.aFloatArray114[3] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[3] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[15] - this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[15] + this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[12] + this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[13] - this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[11] + this.aFloatArray114[0] * this.aFloatArray114[7] * this.aFloatArray114[9] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[11] - this.aFloatArray114[1] * this.aFloatArray114[7] * this.aFloatArray114[8] - this.aFloatArray114[3] * this.aFloatArray114[4] * this.aFloatArray114[9] + this.aFloatArray114[3] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray114[4] * this.aFloatArray114[9] * this.aFloatArray114[14] + this.aFloatArray114[4] * this.aFloatArray114[10] * this.aFloatArray114[13] + this.aFloatArray114[5] * this.aFloatArray114[8] * this.aFloatArray114[14] - this.aFloatArray114[5] * this.aFloatArray114[10] * this.aFloatArray114[12] - this.aFloatArray114[6] * this.aFloatArray114[8] * this.aFloatArray114[13] + this.aFloatArray114[6] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray114[0] * this.aFloatArray114[9] * this.aFloatArray114[14] - this.aFloatArray114[0] * this.aFloatArray114[10] * this.aFloatArray114[13] - this.aFloatArray114[1] * this.aFloatArray114[8] * this.aFloatArray114[14] + this.aFloatArray114[1] * this.aFloatArray114[10] * this.aFloatArray114[12] + this.aFloatArray114[2] * this.aFloatArray114[8] * this.aFloatArray114[13] - this.aFloatArray114[2] * this.aFloatArray114[9] * this.aFloatArray114[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[14] + this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[13] + this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[14] - this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[12] - this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[13] + this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray114[0] * this.aFloatArray114[5] * this.aFloatArray114[10] - this.aFloatArray114[0] * this.aFloatArray114[6] * this.aFloatArray114[9] - this.aFloatArray114[1] * this.aFloatArray114[4] * this.aFloatArray114[10] + this.aFloatArray114[1] * this.aFloatArray114[6] * this.aFloatArray114[8] + this.aFloatArray114[2] * this.aFloatArray114[4] * this.aFloatArray114[9] - this.aFloatArray114[2] * this.aFloatArray114[5] * this.aFloatArray114[8]) * local4;
		this.aFloatArray114[0] = local96;
		this.aFloatArray114[1] = local189;
		this.aFloatArray114[2] = local281;
		this.aFloatArray114[3] = local374;
		this.aFloatArray114[4] = local467;
		this.aFloatArray114[5] = local559;
		this.aFloatArray114[6] = local652;
		this.aFloatArray114[7] = local744;
		this.aFloatArray114[8] = local836;
		this.aFloatArray114[9] = local929;
		this.aFloatArray114[10] = local1021;
		this.aFloatArray114[11] = local1114;
		this.aFloatArray114[12] = local1207;
		this.aFloatArray114[13] = local1299;
		this.aFloatArray114[14] = local1392;
		this.aFloatArray114[15] = local1484;
	}

	@OriginalMember(owner = "client!pm", name = "cd", descriptor = "(FFFF)V")
	public void method30150(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray114[0] = arg0;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg1;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = arg2;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "cv", descriptor = "(FFFF)V")
	public void method30151(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray114[0] = arg0;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg1;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = arg2;
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = 0.0F;
		this.aFloatArray114[15] = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "ct", descriptor = "()Z")
	public boolean method30152() {
		return this.aFloatArray114[0] == 1.0F && this.aFloatArray114[1] == 0.0F && this.aFloatArray114[2] == 0.0F && this.aFloatArray114[3] == 0.0F && this.aFloatArray114[4] == 0.0F && this.aFloatArray114[5] == 1.0F && this.aFloatArray114[6] == 0.0F && this.aFloatArray114[7] == 0.0F && this.aFloatArray114[8] == 0.0F && this.aFloatArray114[9] == 0.0F && this.aFloatArray114[10] == 1.0F && this.aFloatArray114[11] == 0.0F && this.aFloatArray114[12] == 0.0F && this.aFloatArray114[13] == 0.0F && this.aFloatArray114[14] == 0.0F && this.aFloatArray114[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "cn", descriptor = "()Z")
	public boolean method30153() {
		return this.aFloatArray114[0] == 1.0F && this.aFloatArray114[1] == 0.0F && this.aFloatArray114[2] == 0.0F && this.aFloatArray114[3] == 0.0F && this.aFloatArray114[4] == 0.0F && this.aFloatArray114[5] == 1.0F && this.aFloatArray114[6] == 0.0F && this.aFloatArray114[7] == 0.0F && this.aFloatArray114[8] == 0.0F && this.aFloatArray114[9] == 0.0F && this.aFloatArray114[10] == 1.0F && this.aFloatArray114[11] == 0.0F && this.aFloatArray114[12] == 0.0F && this.aFloatArray114[13] == 0.0F && this.aFloatArray114[14] == 0.0F && this.aFloatArray114[15] == 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "cy", descriptor = "(FFF[F)V")
	public void method30154(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray114[0] * arg0 + this.aFloatArray114[4] * arg1 + this.aFloatArray114[8] * arg2 + this.aFloatArray114[12];
		arg3[1] = this.aFloatArray114[1] * arg0 + this.aFloatArray114[5] * arg1 + this.aFloatArray114[9] * arg2 + this.aFloatArray114[13];
		arg3[2] = this.aFloatArray114[2] * arg0 + this.aFloatArray114[6] * arg1 + this.aFloatArray114[10] * arg2 + this.aFloatArray114[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray114[3] * arg0 + this.aFloatArray114[7] * arg1 + this.aFloatArray114[11] * arg2 + this.aFloatArray114[15];
		}
	}

	@OriginalMember(owner = "client!pm", name = "ch", descriptor = "(FFF[F)V")
	public void method30155(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray114[0] * arg0 + this.aFloatArray114[4] * arg1 + this.aFloatArray114[8] * arg2 + this.aFloatArray114[12];
		arg3[1] = this.aFloatArray114[1] * arg0 + this.aFloatArray114[5] * arg1 + this.aFloatArray114[9] * arg2 + this.aFloatArray114[13];
		arg3[2] = this.aFloatArray114[2] * arg0 + this.aFloatArray114[6] * arg1 + this.aFloatArray114[10] * arg2 + this.aFloatArray114[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray114[3] * arg0 + this.aFloatArray114[7] * arg1 + this.aFloatArray114[11] * arg2 + this.aFloatArray114[15];
		}
	}

	@OriginalMember(owner = "client!pm", name = "cc", descriptor = "([F)V")
	public void method30156(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray114[0] * local3 + this.aFloatArray114[4] * local7 + this.aFloatArray114[8] * local11 + this.aFloatArray114[12];
		arg0[1] = this.aFloatArray114[1] * local3 + this.aFloatArray114[5] * local7 + this.aFloatArray114[9] * local11 + this.aFloatArray114[13];
		arg0[2] = this.aFloatArray114[2] * local3 + this.aFloatArray114[6] * local7 + this.aFloatArray114[10] * local11 + this.aFloatArray114[14];
	}

	@OriginalMember(owner = "client!pm", name = "cu", descriptor = "([F)V")
	public void method30157(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray114[0] * local3 + this.aFloatArray114[4] * local7 + this.aFloatArray114[8] * local11 + this.aFloatArray114[12];
		arg0[1] = this.aFloatArray114[1] * local3 + this.aFloatArray114[5] * local7 + this.aFloatArray114[9] * local11 + this.aFloatArray114[13];
		arg0[2] = this.aFloatArray114[2] * local3 + this.aFloatArray114[6] * local7 + this.aFloatArray114[10] * local11 + this.aFloatArray114[14];
	}

	@OriginalMember(owner = "client!pm", name = "dy", descriptor = "([F)[F")
	public float[] method30158(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ep", descriptor = "([F)[F")
	public float[] method30159(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dj", descriptor = "([F)[F")
	public float[] method30160(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ck", descriptor = "(FFFFFF)V")
	public void method30161(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "ca", descriptor = "(FFF)V")
	public void method30162(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method30087(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "()[F")
	public float[] method30163() {
		@Pc(2) float[] local2 = new float[] { (float) -Math.asin((double) this.aFloatArray114[6]), 0.0F, 0.0F };
		@Pc(19) double local19 = Math.cos((double) local2[0]);
		@Pc(30) double local30;
		@Pc(36) double local36;
		if (Math.abs(local19) > 0.005D) {
			local30 = this.aFloatArray114[2];
			local36 = this.aFloatArray114[10];
			@Pc(42) double local42 = (double) this.aFloatArray114[4];
			@Pc(48) double local48 = (double) this.aFloatArray114[5];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = (float) Math.atan2(local42, local48);
		} else {
			local30 = this.aFloatArray114[1];
			local36 = this.aFloatArray114[0];
			local2[1] = (float) Math.atan2(local30, local36);
			local2[2] = 0.0F;
		}
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "cm", descriptor = "(FFFFFFFF)V")
	public void method30164(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray114[0] = arg2 * 2.0F / arg6;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg3 * 2.0F / arg7;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray114[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "cp", descriptor = "(FFFFFFFF)V")
	public void method30165(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray114[0] = arg2 * 2.0F / arg6;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg3 * 2.0F / arg7;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray114[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "ef", descriptor = "(IIIFFF)V")
	public void method30166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray114[0] = arg1;
			this.aFloatArray114[5] = arg2;
			this.aFloatArray114[10] = 1.0F;
			local98 = this.aFloatArray114;
			local101 = this.aFloatArray114;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
			this.aFloatArray114[0] = local7 * (float) arg1;
			this.aFloatArray114[5] = local7 * (float) arg2;
			this.aFloatArray114[1] = local13 * (float) arg1;
			this.aFloatArray114[4] = -local13 * (float) arg2;
			this.aFloatArray114[10] = 1.0F;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray114;
		local101 = this.aFloatArray114;
		this.aFloatArray114[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
		this.aFloatArray114[12] = arg3;
		this.aFloatArray114[13] = arg4;
		this.aFloatArray114[14] = arg5;
	}

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "(FFFFFFFFF)V")
	public void method30167(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30087(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "cl", descriptor = "()F")
	public float method30169() {
		return -(this.aFloatArray114[15] + this.aFloatArray114[14]) / (this.aFloatArray114[11] + this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "cx", descriptor = "()F")
	public float method30170() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "(FFF[F)V")
	public void method30171(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray114[0] * arg0 + this.aFloatArray114[4] * arg1 + this.aFloatArray114[8] * arg2;
		arg3[1] = this.aFloatArray114[1] * arg0 + this.aFloatArray114[5] * arg1 + this.aFloatArray114[9] * arg2;
		arg3[2] = this.aFloatArray114[2] * arg0 + this.aFloatArray114[6] * arg1 + this.aFloatArray114[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray114[3] * arg0 + this.aFloatArray114[7] * arg1 + this.aFloatArray114[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pm", name = "co", descriptor = "()F")
	public float method30172() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "cz", descriptor = "()F")
	public float method30173() {
		return (this.aFloatArray114[14] - this.aFloatArray114[15]) / (this.aFloatArray114[11] - this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "ci", descriptor = "(FFFFFF)V")
	void method30174(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "dg", descriptor = "([F)[F")
	public float[] method30175(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bf", descriptor = "(FFF)V")
	public void method30176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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
		this.aFloatArray114[0] = local107 + local91 - local127 - local119;
		this.aFloatArray114[1] = local111 + local103 + local111 + local103;
		this.aFloatArray114[2] = local115 - local99 - local99 + local115;
		this.aFloatArray114[4] = local111 - local103 - local103 + local111;
		this.aFloatArray114[5] = local119 + local91 - local107 - local127;
		this.aFloatArray114[6] = local123 + local95 + local123 + local95;
		this.aFloatArray114[8] = local115 + local99 + local115 + local99;
		this.aFloatArray114[9] = local123 - local95 - local95 + local123;
		this.aFloatArray114[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pm", name = "dd", descriptor = "([F)[F")
	public float[] method30177(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dc", descriptor = "([F)[F")
	public float[] method30178(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dn", descriptor = "([F)[F")
	public float[] method30179(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dx", descriptor = "()V")
	public void method30180() {
		@Pc(4) float local4 = this.aFloatArray114[0];
		@Pc(9) float local9 = this.aFloatArray114[4];
		@Pc(14) float local14 = this.aFloatArray114[8];
		@Pc(19) float local19 = this.aFloatArray114[12];
		@Pc(24) float local24 = this.aFloatArray114[1];
		@Pc(29) float local29 = this.aFloatArray114[5];
		@Pc(34) float local34 = this.aFloatArray114[9];
		@Pc(39) float local39 = this.aFloatArray114[13];
		@Pc(44) float local44 = this.aFloatArray114[2];
		@Pc(49) float local49 = this.aFloatArray114[6];
		@Pc(54) float local54 = this.aFloatArray114[10];
		@Pc(59) float local59 = this.aFloatArray114[14];
		@Pc(64) float local64 = this.aFloatArray114[3];
		@Pc(69) float local69 = this.aFloatArray114[7];
		@Pc(74) float local74 = this.aFloatArray114[11];
		@Pc(79) float local79 = this.aFloatArray114[15];
		this.aFloatArray114[0] = local4;
		this.aFloatArray114[1] = local9;
		this.aFloatArray114[2] = local14;
		this.aFloatArray114[3] = local19;
		this.aFloatArray114[4] = local24;
		this.aFloatArray114[5] = local29;
		this.aFloatArray114[6] = local34;
		this.aFloatArray114[7] = local39;
		this.aFloatArray114[8] = local44;
		this.aFloatArray114[9] = local49;
		this.aFloatArray114[10] = local54;
		this.aFloatArray114[11] = local59;
		this.aFloatArray114[12] = local64;
		this.aFloatArray114[13] = local69;
		this.aFloatArray114[14] = local74;
		this.aFloatArray114[15] = local79;
	}

	@OriginalMember(owner = "client!pm", name = "cj", descriptor = "(FFFFFF)V")
	public void method30181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray114[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = 0.0F;
		this.aFloatArray114[9] = 0.0F;
		this.aFloatArray114[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray114[11] = 0.0F;
		this.aFloatArray114[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray114[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray114[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[15] = 1.0F;
	}

	@OriginalMember(owner = "client!pm", name = "db", descriptor = "([F)[F")
	public float[] method30182(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[1];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[5];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dt", descriptor = "([F)[F")
	public float[] method30183(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "du", descriptor = "([F)[F")
	public float[] method30184(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ds", descriptor = "([F)[F")
	public float[] method30185(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bx", descriptor = "(FFF)V")
	public void method30186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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
		this.aFloatArray114[0] = local107 + local91 - local127 - local119;
		this.aFloatArray114[1] = local111 + local103 + local111 + local103;
		this.aFloatArray114[2] = local115 - local99 - local99 + local115;
		this.aFloatArray114[4] = local111 - local103 - local103 + local111;
		this.aFloatArray114[5] = local119 + local91 - local107 - local127;
		this.aFloatArray114[6] = local123 + local95 + local123 + local95;
		this.aFloatArray114[8] = local115 + local99 + local115 + local99;
		this.aFloatArray114[9] = local123 - local95 - local95 + local123;
		this.aFloatArray114[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pm", name = "dr", descriptor = "([F)[F")
	public float[] method30187(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] - this.aFloatArray114[2];
		@Pc(19) float local19 = this.aFloatArray114[7] - this.aFloatArray114[6];
		@Pc(29) float local29 = this.aFloatArray114[11] - this.aFloatArray114[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] - this.aFloatArray114[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(FFFFFFFF)V")
	public void method30188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray114[0] = arg2 * 2.0F / arg6;
		this.aFloatArray114[1] = 0.0F;
		this.aFloatArray114[2] = 0.0F;
		this.aFloatArray114[3] = 0.0F;
		this.aFloatArray114[4] = 0.0F;
		this.aFloatArray114[5] = arg3 * 2.0F / arg7;
		this.aFloatArray114[6] = 0.0F;
		this.aFloatArray114[7] = 0.0F;
		this.aFloatArray114[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray114[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray114[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray114[11] = 1.0F;
		this.aFloatArray114[12] = 0.0F;
		this.aFloatArray114[13] = 0.0F;
		this.aFloatArray114[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray114[15] = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "de", descriptor = "()V")
	public void method30189() {
		@Pc(4) float local4 = this.aFloatArray114[0];
		@Pc(9) float local9 = this.aFloatArray114[4];
		@Pc(14) float local14 = this.aFloatArray114[8];
		@Pc(19) float local19 = this.aFloatArray114[12];
		@Pc(24) float local24 = this.aFloatArray114[1];
		@Pc(29) float local29 = this.aFloatArray114[5];
		@Pc(34) float local34 = this.aFloatArray114[9];
		@Pc(39) float local39 = this.aFloatArray114[13];
		@Pc(44) float local44 = this.aFloatArray114[2];
		@Pc(49) float local49 = this.aFloatArray114[6];
		@Pc(54) float local54 = this.aFloatArray114[10];
		@Pc(59) float local59 = this.aFloatArray114[14];
		@Pc(64) float local64 = this.aFloatArray114[3];
		@Pc(69) float local69 = this.aFloatArray114[7];
		@Pc(74) float local74 = this.aFloatArray114[11];
		@Pc(79) float local79 = this.aFloatArray114[15];
		this.aFloatArray114[0] = local4;
		this.aFloatArray114[1] = local9;
		this.aFloatArray114[2] = local14;
		this.aFloatArray114[3] = local19;
		this.aFloatArray114[4] = local24;
		this.aFloatArray114[5] = local29;
		this.aFloatArray114[6] = local34;
		this.aFloatArray114[7] = local39;
		this.aFloatArray114[8] = local44;
		this.aFloatArray114[9] = local49;
		this.aFloatArray114[10] = local54;
		this.aFloatArray114[11] = local59;
		this.aFloatArray114[12] = local64;
		this.aFloatArray114[13] = local69;
		this.aFloatArray114[14] = local74;
		this.aFloatArray114[15] = local79;
	}

	@OriginalMember(owner = "client!pm", name = "dv", descriptor = "()V")
	public void method30190() {
		@Pc(4) float local4 = this.aFloatArray114[0];
		@Pc(9) float local9 = this.aFloatArray114[4];
		@Pc(14) float local14 = this.aFloatArray114[8];
		@Pc(19) float local19 = this.aFloatArray114[12];
		@Pc(24) float local24 = this.aFloatArray114[1];
		@Pc(29) float local29 = this.aFloatArray114[5];
		@Pc(34) float local34 = this.aFloatArray114[9];
		@Pc(39) float local39 = this.aFloatArray114[13];
		@Pc(44) float local44 = this.aFloatArray114[2];
		@Pc(49) float local49 = this.aFloatArray114[6];
		@Pc(54) float local54 = this.aFloatArray114[10];
		@Pc(59) float local59 = this.aFloatArray114[14];
		@Pc(64) float local64 = this.aFloatArray114[3];
		@Pc(69) float local69 = this.aFloatArray114[7];
		@Pc(74) float local74 = this.aFloatArray114[11];
		@Pc(79) float local79 = this.aFloatArray114[15];
		this.aFloatArray114[0] = local4;
		this.aFloatArray114[1] = local9;
		this.aFloatArray114[2] = local14;
		this.aFloatArray114[3] = local19;
		this.aFloatArray114[4] = local24;
		this.aFloatArray114[5] = local29;
		this.aFloatArray114[6] = local34;
		this.aFloatArray114[7] = local39;
		this.aFloatArray114[8] = local44;
		this.aFloatArray114[9] = local49;
		this.aFloatArray114[10] = local54;
		this.aFloatArray114[11] = local59;
		this.aFloatArray114[12] = local64;
		this.aFloatArray114[13] = local69;
		this.aFloatArray114[14] = local74;
		this.aFloatArray114[15] = local79;
	}

	@OriginalMember(owner = "client!pm", name = "dm", descriptor = "()V")
	public void method30191() {
		@Pc(4) float local4 = this.aFloatArray114[0];
		@Pc(9) float local9 = this.aFloatArray114[4];
		@Pc(14) float local14 = this.aFloatArray114[8];
		@Pc(19) float local19 = this.aFloatArray114[12];
		@Pc(24) float local24 = this.aFloatArray114[1];
		@Pc(29) float local29 = this.aFloatArray114[5];
		@Pc(34) float local34 = this.aFloatArray114[9];
		@Pc(39) float local39 = this.aFloatArray114[13];
		@Pc(44) float local44 = this.aFloatArray114[2];
		@Pc(49) float local49 = this.aFloatArray114[6];
		@Pc(54) float local54 = this.aFloatArray114[10];
		@Pc(59) float local59 = this.aFloatArray114[14];
		@Pc(64) float local64 = this.aFloatArray114[3];
		@Pc(69) float local69 = this.aFloatArray114[7];
		@Pc(74) float local74 = this.aFloatArray114[11];
		@Pc(79) float local79 = this.aFloatArray114[15];
		this.aFloatArray114[0] = local4;
		this.aFloatArray114[1] = local9;
		this.aFloatArray114[2] = local14;
		this.aFloatArray114[3] = local19;
		this.aFloatArray114[4] = local24;
		this.aFloatArray114[5] = local29;
		this.aFloatArray114[6] = local34;
		this.aFloatArray114[7] = local39;
		this.aFloatArray114[8] = local44;
		this.aFloatArray114[9] = local49;
		this.aFloatArray114[10] = local54;
		this.aFloatArray114[11] = local59;
		this.aFloatArray114[12] = local64;
		this.aFloatArray114[13] = local69;
		this.aFloatArray114[14] = local74;
		this.aFloatArray114[15] = local79;
	}

	@OriginalMember(owner = "client!pm", name = "do", descriptor = "([F)[F")
	public float[] method30192(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dh", descriptor = "([F)[F")
	public float[] method30193(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray114[3] + this.aFloatArray114[0];
		@Pc(19) float local19 = this.aFloatArray114[7] + this.aFloatArray114[4];
		@Pc(29) float local29 = this.aFloatArray114[11] + this.aFloatArray114[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray114[15] + this.aFloatArray114[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "cw", descriptor = "()F")
	public float method30194() {
		return -(this.aFloatArray114[15] + this.aFloatArray114[14]) / (this.aFloatArray114[11] + this.aFloatArray114[10]);
	}

	@OriginalMember(owner = "client!pm", name = "dk", descriptor = "([F)[F")
	public float[] method30195(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "cg", descriptor = "(FFFFFFFFF)V")
	public void method30196(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method30087(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "da", descriptor = "([F)[F")
	public float[] method30197(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ba", descriptor = "(Lclient!pm;)V")
	public void method30198(@OriginalArg(0) Class487 arg0) {
		System.arraycopy(arg0.aFloatArray114, 0, this.aFloatArray114, 0, 16);
	}

	@OriginalMember(owner = "client!pm", name = "be", descriptor = "(Lclient!pm;Lclient!pm;)V")
	public void method30199(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray114[0] * arg1.aFloatArray114[0] + arg0.aFloatArray114[1] * arg1.aFloatArray114[4] + arg0.aFloatArray114[2] * arg1.aFloatArray114[8] + arg0.aFloatArray114[3] * arg1.aFloatArray114[12];
		@Pc(79) float local79 = arg0.aFloatArray114[0] * arg1.aFloatArray114[1] + arg0.aFloatArray114[1] * arg1.aFloatArray114[5] + arg0.aFloatArray114[2] * arg1.aFloatArray114[9] + arg0.aFloatArray114[3] * arg1.aFloatArray114[13];
		@Pc(119) float local119 = arg0.aFloatArray114[0] * arg1.aFloatArray114[2] + arg0.aFloatArray114[1] * arg1.aFloatArray114[6] + arg0.aFloatArray114[2] * arg1.aFloatArray114[10] + arg0.aFloatArray114[3] * arg1.aFloatArray114[14];
		@Pc(159) float local159 = arg0.aFloatArray114[0] * arg1.aFloatArray114[3] + arg0.aFloatArray114[1] * arg1.aFloatArray114[7] + arg0.aFloatArray114[2] * arg1.aFloatArray114[11] + arg0.aFloatArray114[3] * arg1.aFloatArray114[15];
		@Pc(199) float local199 = arg0.aFloatArray114[4] * arg1.aFloatArray114[0] + arg0.aFloatArray114[5] * arg1.aFloatArray114[4] + arg0.aFloatArray114[6] * arg1.aFloatArray114[8] + arg0.aFloatArray114[7] * arg1.aFloatArray114[12];
		@Pc(239) float local239 = arg0.aFloatArray114[4] * arg1.aFloatArray114[1] + arg0.aFloatArray114[5] * arg1.aFloatArray114[5] + arg0.aFloatArray114[6] * arg1.aFloatArray114[9] + arg0.aFloatArray114[7] * arg1.aFloatArray114[13];
		@Pc(279) float local279 = arg0.aFloatArray114[4] * arg1.aFloatArray114[2] + arg0.aFloatArray114[5] * arg1.aFloatArray114[6] + arg0.aFloatArray114[6] * arg1.aFloatArray114[10] + arg0.aFloatArray114[7] * arg1.aFloatArray114[14];
		@Pc(319) float local319 = arg0.aFloatArray114[4] * arg1.aFloatArray114[3] + arg0.aFloatArray114[5] * arg1.aFloatArray114[7] + arg0.aFloatArray114[6] * arg1.aFloatArray114[11] + arg0.aFloatArray114[7] * arg1.aFloatArray114[15];
		@Pc(359) float local359 = arg0.aFloatArray114[8] * arg1.aFloatArray114[0] + arg0.aFloatArray114[9] * arg1.aFloatArray114[4] + arg0.aFloatArray114[10] * arg1.aFloatArray114[8] + arg0.aFloatArray114[11] * arg1.aFloatArray114[12];
		@Pc(399) float local399 = arg0.aFloatArray114[8] * arg1.aFloatArray114[1] + arg0.aFloatArray114[9] * arg1.aFloatArray114[5] + arg0.aFloatArray114[10] * arg1.aFloatArray114[9] + arg0.aFloatArray114[11] * arg1.aFloatArray114[13];
		@Pc(439) float local439 = arg0.aFloatArray114[8] * arg1.aFloatArray114[2] + arg0.aFloatArray114[9] * arg1.aFloatArray114[6] + arg0.aFloatArray114[10] * arg1.aFloatArray114[10] + arg0.aFloatArray114[11] * arg1.aFloatArray114[14];
		@Pc(479) float local479 = arg0.aFloatArray114[8] * arg1.aFloatArray114[3] + arg0.aFloatArray114[9] * arg1.aFloatArray114[7] + arg0.aFloatArray114[10] * arg1.aFloatArray114[11] + arg0.aFloatArray114[11] * arg1.aFloatArray114[15];
		@Pc(519) float local519 = arg0.aFloatArray114[12] * arg1.aFloatArray114[0] + arg0.aFloatArray114[13] * arg1.aFloatArray114[4] + arg0.aFloatArray114[14] * arg1.aFloatArray114[8] + arg0.aFloatArray114[15] * arg1.aFloatArray114[12];
		@Pc(559) float local559 = arg0.aFloatArray114[12] * arg1.aFloatArray114[1] + arg0.aFloatArray114[13] * arg1.aFloatArray114[5] + arg0.aFloatArray114[14] * arg1.aFloatArray114[9] + arg0.aFloatArray114[15] * arg1.aFloatArray114[13];
		@Pc(599) float local599 = arg0.aFloatArray114[12] * arg1.aFloatArray114[2] + arg0.aFloatArray114[13] * arg1.aFloatArray114[6] + arg0.aFloatArray114[14] * arg1.aFloatArray114[10] + arg0.aFloatArray114[15] * arg1.aFloatArray114[14];
		@Pc(639) float local639 = arg0.aFloatArray114[12] * arg1.aFloatArray114[3] + arg0.aFloatArray114[13] * arg1.aFloatArray114[7] + arg0.aFloatArray114[14] * arg1.aFloatArray114[11] + arg0.aFloatArray114[15] * arg1.aFloatArray114[15];
		this.aFloatArray114[0] = local39;
		this.aFloatArray114[1] = local79;
		this.aFloatArray114[2] = local119;
		this.aFloatArray114[3] = local159;
		this.aFloatArray114[4] = local199;
		this.aFloatArray114[5] = local239;
		this.aFloatArray114[6] = local279;
		this.aFloatArray114[7] = local319;
		this.aFloatArray114[8] = local359;
		this.aFloatArray114[9] = local399;
		this.aFloatArray114[10] = local439;
		this.aFloatArray114[11] = local479;
		this.aFloatArray114[12] = local519;
		this.aFloatArray114[13] = local559;
		this.aFloatArray114[14] = local599;
		this.aFloatArray114[15] = local639;
	}

	@OriginalMember(owner = "client!pm", name = "ec", descriptor = "([F)[F")
	public float[] method30200(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[4];
		arg0[2] = this.aFloatArray114[8];
		arg0[3] = this.aFloatArray114[12];
		arg0[4] = this.aFloatArray114[1];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = this.aFloatArray114[9];
		arg0[7] = this.aFloatArray114[13];
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ev", descriptor = "([F)[F")
	public float[] method30201(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "bw", descriptor = "(FFF)V")
	public void method30202(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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
		this.aFloatArray114[0] = local107 + local91 - local127 - local119;
		this.aFloatArray114[1] = local111 + local103 + local111 + local103;
		this.aFloatArray114[2] = local115 - local99 - local99 + local115;
		this.aFloatArray114[4] = local111 - local103 - local103 + local111;
		this.aFloatArray114[5] = local119 + local91 - local107 - local127;
		this.aFloatArray114[6] = local123 + local95 + local123 + local95;
		this.aFloatArray114[8] = local115 + local99 + local115 + local99;
		this.aFloatArray114[9] = local123 - local95 - local95 + local123;
		this.aFloatArray114[10] = local127 + local91 - local119 - local107;
	}

	@OriginalMember(owner = "client!pm", name = "eo", descriptor = "([F)[F")
	public float[] method30203(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "dp", descriptor = "([F)[F")
	public float[] method30204(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray114, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ew", descriptor = "([F)[F")
	public float[] method30205(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray114[0];
		arg0[1] = this.aFloatArray114[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray114[4];
		arg0[5] = this.aFloatArray114[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray114[12];
		arg0[9] = this.aFloatArray114[13];
		arg0[10] = this.aFloatArray114[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "ee", descriptor = "(IIIFFF)V")
	public void method30206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray114[0] = arg1;
			this.aFloatArray114[5] = arg2;
			this.aFloatArray114[10] = 1.0F;
			local98 = this.aFloatArray114;
			local101 = this.aFloatArray114;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
			this.aFloatArray114[0] = local7 * (float) arg1;
			this.aFloatArray114[5] = local7 * (float) arg2;
			this.aFloatArray114[1] = local13 * (float) arg1;
			this.aFloatArray114[4] = -local13 * (float) arg2;
			this.aFloatArray114[10] = 1.0F;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray114;
		local101 = this.aFloatArray114;
		this.aFloatArray114[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
		this.aFloatArray114[12] = arg3;
		this.aFloatArray114[13] = arg4;
		this.aFloatArray114[14] = arg5;
	}

	@OriginalMember(owner = "client!pm", name = "ce", descriptor = "(FFF[F)V")
	public void method30207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray114[0] * arg0 + this.aFloatArray114[4] * arg1 + this.aFloatArray114[8] * arg2;
		arg3[1] = this.aFloatArray114[1] * arg0 + this.aFloatArray114[5] * arg1 + this.aFloatArray114[9] * arg2;
		arg3[2] = this.aFloatArray114[2] * arg0 + this.aFloatArray114[6] * arg1 + this.aFloatArray114[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray114[3] * arg0 + this.aFloatArray114[7] * arg1 + this.aFloatArray114[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!pm", name = "ez", descriptor = "(IIIFFF)V")
	public void method30208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray114[0] = arg1;
			this.aFloatArray114[5] = arg2;
			this.aFloatArray114[10] = 1.0F;
			local98 = this.aFloatArray114;
			local101 = this.aFloatArray114;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
			this.aFloatArray114[0] = local7 * (float) arg1;
			this.aFloatArray114[5] = local7 * (float) arg2;
			this.aFloatArray114[1] = local13 * (float) arg1;
			this.aFloatArray114[4] = -local13 * (float) arg2;
			this.aFloatArray114[10] = 1.0F;
			local54 = this.aFloatArray114;
			local57 = this.aFloatArray114;
			local60 = this.aFloatArray114;
			this.aFloatArray114[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray114;
		local101 = this.aFloatArray114;
		this.aFloatArray114[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray114[15] = 1.0F;
		this.aFloatArray114[12] = arg3;
		this.aFloatArray114[13] = arg4;
		this.aFloatArray114[14] = arg5;
	}

	@OriginalMember(owner = "client!pm", name = "rm", descriptor = "()I")
	public int method30209() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray114);
	}
}
