package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public class Class482 {

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[F")
	float[] aFloatArray115;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "F")
	float aFloat320;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[Lclient!ox;")
	final Class472[] aClass472Array2 = new Class472[4];

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 8)
	Class482() {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			this.aClass472Array2[local7] = new Class472();
		}
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "()V", line = 14)
	void method29757() {
		this.aFloat320 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "()V", line = 14)
	void method29758() {
		this.aFloat320 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "()V", line = 14)
	void method29759() {
		this.aFloat320 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "(ILclient!ox;)V", line = 19)
	void method29760(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29550(arg1);
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(ILclient!ox;)V", line = 19)
	void method29761(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29550(arg1);
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "(ILclient!ox;)V", line = 19)
	void method29762(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29550(arg1);
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "(ILclient!ox;)V", line = 19)
	void method29763(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29550(arg1);
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(ILclient!ox;)V", line = 19)
	void method29764(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29550(arg1);
		this.method29757();
	}

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "(I)Lclient!ox;", line = 24)
	Class472 method29765(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "(I)Lclient!ox;", line = 24)
	Class472 method29766(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "(I)Lclient!ox;", line = 24)
	Class472 method29767(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "(I)Lclient!ox;", line = 24)
	Class472 method29768(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "(F)[D", line = 28)
	double[] method29769(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass472Array2[1].aFloat317 - this.aClass472Array2[0].aFloat317) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass472Array2[2].aFloat317 - this.aClass472Array2[1].aFloat317) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass472Array2[3].aFloat317 - this.aClass472Array2[0].aFloat317) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass472Array2[0].aFloat317;
		@Pc(98) double local98 = (double) ((this.aClass472Array2[1].aFloat318 - this.aClass472Array2[0].aFloat318) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass472Array2[2].aFloat318 - this.aClass472Array2[1].aFloat318) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass472Array2[3].aFloat318 - this.aClass472Array2[0].aFloat318) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass472Array2[0].aFloat318;
		@Pc(171) double local171 = (double) ((this.aClass472Array2[1].aFloat319 - this.aClass472Array2[0].aFloat319) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass472Array2[2].aFloat319 - this.aClass472Array2[1].aFloat319) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass472Array2[3].aFloat319 - this.aClass472Array2[0].aFloat319) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass472Array2[0].aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "(F)[D", line = 28)
	double[] method29770(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass472Array2[1].aFloat317 - this.aClass472Array2[0].aFloat317) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass472Array2[2].aFloat317 - this.aClass472Array2[1].aFloat317) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass472Array2[3].aFloat317 - this.aClass472Array2[0].aFloat317) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass472Array2[0].aFloat317;
		@Pc(98) double local98 = (double) ((this.aClass472Array2[1].aFloat318 - this.aClass472Array2[0].aFloat318) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass472Array2[2].aFloat318 - this.aClass472Array2[1].aFloat318) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass472Array2[3].aFloat318 - this.aClass472Array2[0].aFloat318) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass472Array2[0].aFloat318;
		@Pc(171) double local171 = (double) ((this.aClass472Array2[1].aFloat319 - this.aClass472Array2[0].aFloat319) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass472Array2[2].aFloat319 - this.aClass472Array2[1].aFloat319) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass472Array2[3].aFloat319 - this.aClass472Array2[0].aFloat319) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass472Array2[0].aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "()F", line = 47)
	float method29771() {
		if (this.aFloat320 == -1.0F) {
			this.method29777();
		}
		return this.aFloat320;
	}

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "()F", line = 47)
	float method29772() {
		if (this.aFloat320 == -1.0F) {
			this.method29777();
		}
		return this.aFloat320;
	}

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "(F)F", line = 52)
	float method29773(@OriginalArg(0) float arg0) {
		if (this.aFloat320 == -1.0F) {
			this.method29777();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat320) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray115[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray115.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray115.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray115.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray115[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray115.length - 1) / (float) this.aFloatArray115.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "(F)F", line = 52)
	float method29774(@OriginalArg(0) float arg0) {
		if (this.aFloat320 == -1.0F) {
			this.method29777();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat320) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray115[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray115.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray115.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray115.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray115[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray115.length - 1) / (float) this.aFloatArray115.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()V", line = 75)
	void method29775() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "()V", line = 75)
	void method29776() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "()V", line = 75)
	void method29777() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 75)
	void method29778() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "()V", line = 75)
	void method29779() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "()V", line = 75)
	void method29780() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29770(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29531();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29770((float) local11 / (float) local1);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			local7 += local9.method29593();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29770(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29770((float) local83 / (float) local11);
			local9.aFloat317 = (float) (local22[0] - local5[0]);
			local9.aFloat318 = (float) (local22[1] - local5[1]);
			local9.aFloat319 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29593();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat320 = local81;
	}
}
