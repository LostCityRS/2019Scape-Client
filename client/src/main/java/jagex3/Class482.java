package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class482 {

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[F")
	float[] aFloatArray115;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "F")
	float aFloat328;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[Lclient!ox;")
	final Class472[] aClass472Array2 = new Class472[4];

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	Class482() {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			this.aClass472Array2[local7] = new Class472();
		}
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "(F)[D")
	double[] method29938(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass472Array2[1].aFloat325 - this.aClass472Array2[0].aFloat325) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass472Array2[2].aFloat325 - this.aClass472Array2[1].aFloat325) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass472Array2[3].aFloat325 - this.aClass472Array2[0].aFloat325) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass472Array2[0].aFloat325;
		@Pc(98) double local98 = (double) ((this.aClass472Array2[1].aFloat326 - this.aClass472Array2[0].aFloat326) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass472Array2[2].aFloat326 - this.aClass472Array2[1].aFloat326) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass472Array2[3].aFloat326 - this.aClass472Array2[0].aFloat326) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass472Array2[0].aFloat326;
		@Pc(171) double local171 = (double) ((this.aClass472Array2[1].aFloat327 - this.aClass472Array2[0].aFloat327) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass472Array2[2].aFloat327 - this.aClass472Array2[1].aFloat327) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass472Array2[3].aFloat327 - this.aClass472Array2[0].aFloat327) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass472Array2[0].aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "()V")
	void method29939() {
		this.aFloat328 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "(ILclient!ox;)V")
	void method29940(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29719(arg1);
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()V")
	void method29941() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "()V")
	void method29942() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "()F")
	float method29943() {
		if (this.aFloat328 == -1.0F) {
			this.method29945();
		}
		return this.aFloat328;
	}

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "(F)F")
	float method29944(@OriginalArg(0) float arg0) {
		if (this.aFloat328 == -1.0F) {
			this.method29945();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat328) {
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

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "()V")
	void method29945() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "()V")
	void method29946() {
		this.aFloat328 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "()V")
	void method29947() {
		this.aFloat328 = -1.0F;
		this.aFloatArray115 = null;
	}

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "(I)Lclient!ox;")
	Class472 method29948(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(ILclient!ox;)V")
	void method29949(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29719(arg1);
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "(ILclient!ox;)V")
	void method29950(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29719(arg1);
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "(I)Lclient!ox;")
	Class472 method29951(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "(I)Lclient!ox;")
	Class472 method29952(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "(ILclient!ox;)V")
	void method29953(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29719(arg1);
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "(I)Lclient!ox;")
	Class472 method29954(@OriginalArg(0) int arg0) {
		return this.aClass472Array2[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "(F)[D")
	double[] method29955(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass472Array2[1].aFloat325 - this.aClass472Array2[0].aFloat325) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass472Array2[2].aFloat325 - this.aClass472Array2[1].aFloat325) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass472Array2[3].aFloat325 - this.aClass472Array2[0].aFloat325) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass472Array2[0].aFloat325;
		@Pc(98) double local98 = (double) ((this.aClass472Array2[1].aFloat326 - this.aClass472Array2[0].aFloat326) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass472Array2[2].aFloat326 - this.aClass472Array2[1].aFloat326) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass472Array2[3].aFloat326 - this.aClass472Array2[0].aFloat326) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass472Array2[0].aFloat326;
		@Pc(171) double local171 = (double) ((this.aClass472Array2[1].aFloat327 - this.aClass472Array2[0].aFloat327) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass472Array2[2].aFloat327 - this.aClass472Array2[1].aFloat327) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass472Array2[3].aFloat327 - this.aClass472Array2[0].aFloat327) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass472Array2[0].aFloat327;
		return local2;
	}

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "(F)F")
	float method29956(@OriginalArg(0) float arg0) {
		if (this.aFloat328 == -1.0F) {
			this.method29945();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat328) {
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

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "()F")
	float method29957() {
		if (this.aFloat328 == -1.0F) {
			this.method29945();
		}
		return this.aFloat328;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(ILclient!ox;)V")
	void method29958(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass472Array2[arg0].method29719(arg1);
		this.method29939();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
	void method29959() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "()V")
	void method29960() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "()V")
	void method29961() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method29955(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class472 local9 = Class472.method29709();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method29955((float) local11 / (float) local1);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			local7 += local9.method29746();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray115 = new float[local11];
		local5 = this.method29955(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method29955((float) local83 / (float) local11);
			local9.aFloat325 = (float) (local22[0] - local5[0]);
			local9.aFloat326 = (float) (local22[1] - local5[1]);
			local9.aFloat327 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29746();
			local81 += local127;
			this.aFloatArray115[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat328 = local81;
	}
}
