package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqe")
public final class Class123_Sub2_Sub1 extends Class123_Sub2 {

	@OriginalMember(owner = "client!aqe", name = "m", descriptor = "[F")
	float[] aFloatArray46;

	@OriginalMember(owner = "client!aqe", name = "o", descriptor = "[F")
	float[] aFloatArray47;

	@OriginalMember(owner = "client!aqe", name = "j", descriptor = "[F")
	float[] aFloatArray48;

	@OriginalMember(owner = "client!aqe", name = "a", descriptor = "I")
	int anInt2723 = 0;

	@OriginalMember(owner = "client!aqe", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class123_Sub2_Sub1(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqe", name = "al", descriptor = "()V")
	@Override
	void method20537() {
		this.anInt2723 += 614768963;
	}

	@OriginalMember(owner = "client!aqe", name = "aq", descriptor = "(B)V")
	@Override
	void method20541(@OriginalArg(0) byte arg0) {
		this.anInt2723 += 614768963;
	}

	@OriginalMember(owner = "client!aqe", name = "ai", descriptor = "(FFFI)F")
	@Override
	float method20530(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = this.aFloat198 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray48[this.anInt2723 * -729091221] * (this.aFloatArray46[this.anInt2723 * -729091221] + local4 * (this.aFloatArray47[this.anInt2723 * -729091221] - this.aFloatArray46[this.anInt2723 * -729091221]));
	}

	@OriginalMember(owner = "client!aqe", name = "ab", descriptor = "()V")
	@Override
	void method20531() {
		this.anInt2723 += 614768963;
	}

	@OriginalMember(owner = "client!aqe", name = "ag", descriptor = "()V")
	@Override
	void method20536() {
		this.anInt2723 += 614768963;
	}

	@OriginalMember(owner = "client!aqe", name = "ac", descriptor = "(FFF)F")
	@Override
	float method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat198 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray48[this.anInt2723 * -729091221] * (this.aFloatArray46[this.anInt2723 * -729091221] + local4 * (this.aFloatArray47[this.anInt2723 * -729091221] - this.aFloatArray46[this.anInt2723 * -729091221]));
	}

	@OriginalMember(owner = "client!aqe", name = "am", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20540(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray46 = new float[arg1];
		this.aFloatArray47 = new float[arg1];
		this.aFloatArray48 = new float[arg1];
		this.anInt2723 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray46[local16] = arg0.gFloat();
			this.aFloatArray47[local16] = arg0.gFloat();
			this.aFloatArray48[local16] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!aqe", name = "ah", descriptor = "()V")
	@Override
	void method20538() {
		this.anInt2723 += 614768963;
	}

	@OriginalMember(owner = "client!aqe", name = "af", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20539(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray46 = new float[arg1];
		this.aFloatArray47 = new float[arg1];
		this.aFloatArray48 = new float[arg1];
		this.anInt2723 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray46[local16] = arg0.gFloat();
			this.aFloatArray47[local16] = arg0.gFloat();
			this.aFloatArray48[local16] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!aqe", name = "ak", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20546(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray46 = new float[arg1];
		this.aFloatArray47 = new float[arg1];
		this.aFloatArray48 = new float[arg1];
		this.anInt2723 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray46[local16] = arg0.gFloat();
			this.aFloatArray47[local16] = arg0.gFloat();
			this.aFloatArray48[local16] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!aqe", name = "aj", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method20534(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray46 = new float[arg1];
		this.aFloatArray47 = new float[arg1];
		this.aFloatArray48 = new float[arg1];
		this.anInt2723 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray46[local16] = arg0.gFloat();
			this.aFloatArray47[local16] = arg0.gFloat();
			this.aFloatArray48[local16] = arg0.gFloat();
		}
	}
}
