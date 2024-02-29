package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqh")
public class Class124_Sub3_Sub1 extends Class124_Sub3 {

	@OriginalMember(owner = "client!aqh", name = "z", descriptor = "[F")
	float[] aFloatArray53;

	@OriginalMember(owner = "client!aqh", name = "u", descriptor = "[F")
	float[] aFloatArray54;

	@OriginalMember(owner = "client!aqh", name = "p", descriptor = "[F")
	float[] aFloatArray55;

	@OriginalMember(owner = "client!aqh", name = "d", descriptor = "I")
	int anInt2757 = 0;

	@OriginalMember(owner = "client!aqh", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	public Class124_Sub3_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqh", name = "ah", descriptor = "(I)V", line = 17)
	@Override
	void method21445(@OriginalArg(0) int arg0) {
		this.anInt2757 += -405800355;
	}

	@OriginalMember(owner = "client!aqh", name = "at", descriptor = "()V", line = 17)
	@Override
	void method21450() {
		this.anInt2757 += -405800355;
	}

	@OriginalMember(owner = "client!aqh", name = "ad", descriptor = "()V", line = 17)
	@Override
	void method21453() {
		this.anInt2757 += -405800355;
	}

	@OriginalMember(owner = "client!aqh", name = "am", descriptor = "()V", line = 17)
	@Override
	void method21451() {
		this.anInt2757 += -405800355;
	}

	@OriginalMember(owner = "client!aqh", name = "au", descriptor = "()V", line = 17)
	@Override
	void method21452() {
		this.anInt2757 += -405800355;
	}

	@OriginalMember(owner = "client!aqh", name = "aw", descriptor = "(FFF)F", line = 21)
	@Override
	float method21448(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat219 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray55[this.anInt2757 * 830908917] * ((this.aFloatArray53[this.anInt2757 * 830908917] - this.aFloatArray54[this.anInt2757 * 830908917]) * local4 + this.aFloatArray54[this.anInt2757 * 830908917]);
	}

	@OriginalMember(owner = "client!aqh", name = "ag", descriptor = "(FFFB)F", line = 21)
	@Override
	float method21444(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) float local4 = this.aFloat219 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray55[this.anInt2757 * 830908917] * ((this.aFloatArray53[this.anInt2757 * 830908917] - this.aFloatArray54[this.anInt2757 * 830908917]) * local4 + this.aFloatArray54[this.anInt2757 * 830908917]);
	}

	@OriginalMember(owner = "client!aqh", name = "ai", descriptor = "(FFF)F", line = 21)
	@Override
	float method21447(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat219 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray55[this.anInt2757 * 830908917] * ((this.aFloatArray53[this.anInt2757 * 830908917] - this.aFloatArray54[this.anInt2757 * 830908917]) * local4 + this.aFloatArray54[this.anInt2757 * 830908917]);
	}

	@OriginalMember(owner = "client!aqh", name = "as", descriptor = "(FFF)F", line = 21)
	@Override
	float method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat219 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray55[this.anInt2757 * 830908917] * ((this.aFloatArray53[this.anInt2757 * 830908917] - this.aFloatArray54[this.anInt2757 * 830908917]) * local4 + this.aFloatArray54[this.anInt2757 * 830908917]);
	}

	@OriginalMember(owner = "client!aqh", name = "ap", descriptor = "(Lclient!alw;I)V", line = 28)
	@Override
	void method21455(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray54 = new float[arg1];
		this.aFloatArray53 = new float[arg1];
		this.aFloatArray55 = new float[arg1];
		this.anInt2757 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray54[local16] = arg0.method22504(-82763124);
			this.aFloatArray53[local16] = arg0.method22504(56958792);
			this.aFloatArray55[local16] = arg0.method22504(2013091547);
		}
	}

	@OriginalMember(owner = "client!aqh", name = "ar", descriptor = "(Lclient!alw;I)V", line = 28)
	@Override
	void method21454(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray54 = new float[arg1];
		this.aFloatArray53 = new float[arg1];
		this.aFloatArray55 = new float[arg1];
		this.anInt2757 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray54[local16] = arg0.method22504(-487088661);
			this.aFloatArray53[local16] = arg0.method22504(2132499431);
			this.aFloatArray55[local16] = arg0.method22504(1442566832);
		}
	}

	@OriginalMember(owner = "client!aqh", name = "ac", descriptor = "(Lclient!alw;IS)V", line = 28)
	@Override
	void method21446(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		this.aFloatArray54 = new float[arg1];
		this.aFloatArray53 = new float[arg1];
		this.aFloatArray55 = new float[arg1];
		this.anInt2757 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray54[local16] = arg0.method22504(708077696);
			this.aFloatArray53[local16] = arg0.method22504(460868765);
			this.aFloatArray55[local16] = arg0.method22504(1002758382);
		}
	}

	@OriginalMember(owner = "client!aqh", name = "u", descriptor = "(II)V", line = 102)
	public static void method19766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(4, (long) arg0);
		local4.method21885(2146405956);
	}
}
