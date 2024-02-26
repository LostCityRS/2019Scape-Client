package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqr")
public final class Class123_Sub2_Sub3 extends Class123_Sub2 {

	@OriginalMember(owner = "client!aqr", name = "o", descriptor = "[F")
	float[] aFloatArray63;

	@OriginalMember(owner = "client!aqr", name = "m", descriptor = "[F")
	float[] aFloatArray64;

	@OriginalMember(owner = "client!aqr", name = "j", descriptor = "I")
	int anInt2882 = 0;

	@OriginalMember(owner = "client!aqr", name = "ak", descriptor = "(Lclient!arz;B)I")
	public static int method20550(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) byte arg1) {
		if (Class630.aBoolean955) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			@Pc(13) int local13 = arg0.anInt3079 * 1479399259;
			if (Class337.method27879(local13, -1914953977)) {
				return 1;
			} else if (Class165_Sub24.method16315(local13, -610557457)) {
				return 2;
			} else if (Class88.method1790(local13, 826625210)) {
				return 3;
			} else if (Class103_Sub17.method19211(local13, 460106407)) {
				return 4;
			} else if (Class227.method25981(local13, 1070726726)) {
				return 7;
			} else if (local13 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!aqr", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class123_Sub2_Sub3(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqr", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20513() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqr", name = "aq", descriptor = "(B)V")
	@Override
	void method20541(@OriginalArg(0) byte arg0) {
		this.anInt2882 += -819294719;
	}

	@OriginalMember(owner = "client!aqr", name = "ai", descriptor = "(FFFI)F")
	@Override
	float method20530(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(12) float local12 = this.aFloat198 / (float) this.aClass485Array5[this.anInt2882 * 1603891713].method30034();
		return this.aFloatArray64[this.anInt2882 * 1603891713] + (this.aFloatArray63[this.anInt2882 * 1603891713] - this.aFloatArray64[this.anInt2882 * 1603891713]) * local12;
	}

	@OriginalMember(owner = "client!aqr", name = "ay", descriptor = "(FFB)V")
	@Override
	void method20529(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		this.aFloat198 += arg0;
		if (this.aFloat198 > (float) this.aClass485Array5[this.anInt2882 * 1603891713].method30034()) {
			this.aFloat198 = this.aClass485Array5[this.anInt2882 * 1603891713].method30034();
		}
	}

	@OriginalMember(owner = "client!aqr", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method20516(@OriginalArg(0) int arg0) {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqr", name = "u", descriptor = "(I)[D")
	@Override
	public double[] method20502(@OriginalArg(0) int arg0) {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "ao", descriptor = "(B)F")
	@Override
	public float method20533(@OriginalArg(0) byte arg0) {
		return this.aFloat198;
	}

	@OriginalMember(owner = "client!aqr", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20505() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqr", name = "aj", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method20534(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray64 = new float[arg1];
		this.aFloatArray63 = new float[arg1];
		this.anInt2882 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray64[local12] = arg0.method23188(-747226536);
			this.aFloatArray63[local12] = arg0.method23188(538637790);
		}
	}

	@OriginalMember(owner = "client!aqr", name = "ac", descriptor = "(FFF)F")
	@Override
	float method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat198 / (float) this.aClass485Array5[this.anInt2882 * 1603891713].method30034();
		return this.aFloatArray64[this.anInt2882 * 1603891713] + (this.aFloatArray63[this.anInt2882 * 1603891713] - this.aFloatArray64[this.anInt2882 * 1603891713]) * local12;
	}

	@OriginalMember(owner = "client!aqr", name = "h", descriptor = "()[D")
	@Override
	public double[] method20515() {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "ab", descriptor = "()V")
	@Override
	void method20531() {
		this.anInt2882 += -819294719;
	}

	@OriginalMember(owner = "client!aqr", name = "g", descriptor = "(B)F")
	@Override
	public float method20504(@OriginalArg(0) byte arg0) {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30039(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "ah", descriptor = "()V")
	@Override
	void method20538() {
		this.anInt2882 += -819294719;
	}

	@OriginalMember(owner = "client!aqr", name = "af", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20539(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray64 = new float[arg1];
		this.aFloatArray63 = new float[arg1];
		this.anInt2882 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray64[local12] = arg0.method23188(1294405157);
			this.aFloatArray63[local12] = arg0.method23188(2115641646);
		}
	}

	@OriginalMember(owner = "client!aqr", name = "am", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20540(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray64 = new float[arg1];
		this.aFloatArray63 = new float[arg1];
		this.anInt2882 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray64[local12] = arg0.method23188(-1982092505);
			this.aFloatArray63[local12] = arg0.method23188(1906392939);
		}
	}

	@OriginalMember(owner = "client!aqr", name = "ak", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20546(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray64 = new float[arg1];
		this.aFloatArray63 = new float[arg1];
		this.anInt2882 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray64[local12] = arg0.method23188(-771389804);
			this.aFloatArray63[local12] = arg0.method23188(391348321);
		}
	}

	@OriginalMember(owner = "client!aqr", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20512() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqr", name = "ad", descriptor = "()F")
	@Override
	public float method20544() {
		return this.aFloat198;
	}

	@OriginalMember(owner = "client!aqr", name = "ag", descriptor = "()V")
	@Override
	void method20536() {
		this.anInt2882 += -819294719;
	}

	@OriginalMember(owner = "client!aqr", name = "d", descriptor = "()[D")
	@Override
	public double[] method20514() {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "al", descriptor = "()V")
	@Override
	void method20537() {
		this.anInt2882 += -819294719;
	}

	@OriginalMember(owner = "client!aqr", name = "z", descriptor = "()[D")
	@Override
	public double[] method20503() {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "v", descriptor = "()F")
	@Override
	public float method20501() {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30039(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "at", descriptor = "(FF)V")
	@Override
	void method20543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat198 += arg0;
		if (this.aFloat198 > (float) this.aClass485Array5[this.anInt2882 * 1603891713].method30034()) {
			this.aFloat198 = this.aClass485Array5[this.anInt2882 * 1603891713].method30034();
		}
	}

	@OriginalMember(owner = "client!aqr", name = "q", descriptor = "()[D")
	@Override
	public double[] method20520() {
		return this.aClass485Array5[this.anInt2882 * 1603891713].method30047(this.aFloat198);
	}

	@OriginalMember(owner = "client!aqr", name = "av", descriptor = "()F")
	@Override
	public float method20532() {
		return this.aFloat198;
	}
}
