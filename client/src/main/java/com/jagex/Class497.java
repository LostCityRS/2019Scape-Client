package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!px")
public final class Class497 {

	@OriginalMember(owner = "client!px", name = "f", descriptor = "F")
	float aFloat322;

	@OriginalMember(owner = "client!px", name = "e", descriptor = "[F")
	float[] aFloatArray115;

	@OriginalMember(owner = "client!px", name = "t", descriptor = "[Lclient!on;")
	final Class463[] aClass463Array2 = new Class463[4];

	@OriginalMember(owner = "client!px", name = "<init>", descriptor = "()V")
	Class497() {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			this.aClass463Array2[local7] = new Class463();
		}
		this.method30342();
	}

	@OriginalMember(owner = "client!px", name = "k", descriptor = "(I)Lclient!on;")
	Class463 method30326(@OriginalArg(0) int arg0) {
		return this.aClass463Array2[arg0];
	}

	@OriginalMember(owner = "client!px", name = "e", descriptor = "(I)Lclient!on;")
	Class463 method30327(@OriginalArg(0) int arg0) {
		return this.aClass463Array2[arg0];
	}

	@OriginalMember(owner = "client!px", name = "f", descriptor = "(ILclient!on;)V")
	void method30328(@OriginalArg(0) int arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass463Array2[arg0].method29478(arg1);
		this.method30342();
	}

	@OriginalMember(owner = "client!px", name = "u", descriptor = "(F)[D")
	double[] method30329(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass463Array2[1].aFloat297 - this.aClass463Array2[0].aFloat297) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass463Array2[2].aFloat297 - this.aClass463Array2[1].aFloat297) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass463Array2[3].aFloat297 - this.aClass463Array2[0].aFloat297) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass463Array2[0].aFloat297;
		@Pc(98) double local98 = (double) ((this.aClass463Array2[1].aFloat295 - this.aClass463Array2[0].aFloat295) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass463Array2[2].aFloat295 - this.aClass463Array2[1].aFloat295) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass463Array2[3].aFloat295 - this.aClass463Array2[0].aFloat295) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass463Array2[0].aFloat295;
		@Pc(171) double local171 = (double) ((this.aClass463Array2[1].aFloat296 - this.aClass463Array2[0].aFloat296) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass463Array2[2].aFloat296 - this.aClass463Array2[1].aFloat296) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass463Array2[3].aFloat296 - this.aClass463Array2[0].aFloat296) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass463Array2[0].aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!px", name = "z", descriptor = "()V")
	void method30330() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method30329(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class463 local9 = Class463.method29470();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method30329((float) local11 / (float) local1);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			local7 += local9.method29481();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method30329(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method30329((float) local83 / (float) local11);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29481();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat322 = local81;
	}

	@OriginalMember(owner = "client!px", name = "g", descriptor = "(F)F")
	float method30331(@OriginalArg(0) float arg0) {
		if (this.aFloat322 == -1.0F) {
			this.method30332();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat322) {
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

	@OriginalMember(owner = "client!px", name = "i", descriptor = "()V")
	void method30332() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method30329(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class463 local9 = Class463.method29470();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method30329((float) local11 / (float) local1);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			local7 += local9.method29481();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method30329(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method30329((float) local83 / (float) local11);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29481();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat322 = local81;
	}

	@OriginalMember(owner = "client!px", name = "m", descriptor = "()V")
	void method30333() {
		this.aFloat322 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!px", name = "o", descriptor = "()V")
	void method30334() {
		this.aFloat322 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!px", name = "j", descriptor = "(ILclient!on;)V")
	void method30335(@OriginalArg(0) int arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass463Array2[arg0].method29478(arg1);
		this.method30342();
	}

	@OriginalMember(owner = "client!px", name = "a", descriptor = "(ILclient!on;)V")
	void method30336(@OriginalArg(0) int arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass463Array2[arg0].method29478(arg1);
		this.method30342();
	}

	@OriginalMember(owner = "client!px", name = "s", descriptor = "(I)Lclient!on;")
	Class463 method30337(@OriginalArg(0) int arg0) {
		return this.aClass463Array2[arg0];
	}

	@OriginalMember(owner = "client!px", name = "q", descriptor = "()F")
	float method30338() {
		if (this.aFloat322 == -1.0F) {
			this.method30332();
		}
		return this.aFloat322;
	}

	@OriginalMember(owner = "client!px", name = "x", descriptor = "(I)Lclient!on;")
	Class463 method30339(@OriginalArg(0) int arg0) {
		return this.aClass463Array2[arg0];
	}

	@OriginalMember(owner = "client!px", name = "w", descriptor = "(I)Lclient!on;")
	Class463 method30340(@OriginalArg(0) int arg0) {
		return this.aClass463Array2[arg0];
	}

	@OriginalMember(owner = "client!px", name = "l", descriptor = "()F")
	float method30341() {
		if (this.aFloat322 == -1.0F) {
			this.method30332();
		}
		return this.aFloat322;
	}

	@OriginalMember(owner = "client!px", name = "t", descriptor = "()V")
	void method30342() {
		this.aFloat322 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!px", name = "h", descriptor = "()F")
	float method30343() {
		if (this.aFloat322 == -1.0F) {
			this.method30332();
		}
		return this.aFloat322;
	}

	@OriginalMember(owner = "client!px", name = "d", descriptor = "()V")
	void method30344() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method30329(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class463 local9 = Class463.method29470();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method30329((float) local11 / (float) local1);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			local7 += local9.method29481();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method30329(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method30329((float) local83 / (float) local11);
			local9.aFloat297 = (float) (local22[0] - local5[0]);
			local9.aFloat295 = (float) (local22[1] - local5[1]);
			local9.aFloat296 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29481();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat322 = local81;
	}

	@OriginalMember(owner = "client!px", name = "r", descriptor = "(F)[D")
	double[] method30345(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass463Array2[1].aFloat297 - this.aClass463Array2[0].aFloat297) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass463Array2[2].aFloat297 - this.aClass463Array2[1].aFloat297) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass463Array2[3].aFloat297 - this.aClass463Array2[0].aFloat297) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass463Array2[0].aFloat297;
		@Pc(98) double local98 = (double) ((this.aClass463Array2[1].aFloat295 - this.aClass463Array2[0].aFloat295) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass463Array2[2].aFloat295 - this.aClass463Array2[1].aFloat295) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass463Array2[3].aFloat295 - this.aClass463Array2[0].aFloat295) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass463Array2[0].aFloat295;
		@Pc(171) double local171 = (double) ((this.aClass463Array2[1].aFloat296 - this.aClass463Array2[0].aFloat296) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass463Array2[2].aFloat296 - this.aClass463Array2[1].aFloat296) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass463Array2[3].aFloat296 - this.aClass463Array2[0].aFloat296) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass463Array2[0].aFloat296;
		return local2;
	}
}
