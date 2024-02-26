package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asv")
public final class Class20_Sub4_Sub3 extends Class20_Sub4 {

	@OriginalMember(owner = "client!asv", name = "o", descriptor = "[F")
	float[] aFloatArray87;

	@OriginalMember(owner = "client!asv", name = "j", descriptor = "[F")
	float[] aFloatArray88;

	@OriginalMember(owner = "client!asv", name = "m", descriptor = "[F")
	float[] aFloatArray89;

	@OriginalMember(owner = "client!asv", name = "a", descriptor = "I")
	int anInt3144 = 0;

	@OriginalMember(owner = "client!asv", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub4_Sub3(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asv", name = "ay", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method23107(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt3144 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray89[local16] = arg0.gFloat();
			this.aFloatArray87[local16] = arg0.gFloat();
			this.aFloatArray88[local16] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!asv", name = "aq", descriptor = "(FFF)F")
	@Override
	float method23101(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat237 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray89[this.anInt3144 * -154510569] + local4 * (this.aFloatArray87[this.anInt3144 * -154510569] - this.aFloatArray89[this.anInt3144 * -154510569])) * (arg0 / this.aFloatArray88[this.anInt3144 * -154510569]);
	}

	@OriginalMember(owner = "client!asv", name = "c", descriptor = "(FFFI)F")
	@Override
	float method23116(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = this.aFloat237 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray89[this.anInt3144 * -154510569] + local4 * (this.aFloatArray87[this.anInt3144 * -154510569] - this.aFloatArray89[this.anInt3144 * -154510569])) * (arg0 / this.aFloatArray88[this.anInt3144 * -154510569]);
	}

	@OriginalMember(owner = "client!asv", name = "b", descriptor = "(I)V")
	@Override
	void method23099(@OriginalArg(0) int arg0) {
		this.anInt3144 += -1375564633;
	}

	@OriginalMember(owner = "client!asv", name = "ai", descriptor = "(FFF)F")
	@Override
	float method23109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat237 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray89[this.anInt3144 * -154510569] + local4 * (this.aFloatArray87[this.anInt3144 * -154510569] - this.aFloatArray89[this.anInt3144 * -154510569])) * (arg0 / this.aFloatArray88[this.anInt3144 * -154510569]);
	}

	@OriginalMember(owner = "client!asv", name = "aj", descriptor = "()V")
	@Override
	void method23103() {
		this.anInt3144 += -1375564633;
	}

	@OriginalMember(owner = "client!asv", name = "ao", descriptor = "()V")
	@Override
	void method23102() {
		this.anInt3144 += -1375564633;
	}

	@OriginalMember(owner = "client!asv", name = "al", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23106(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt3144 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray89[local16] = arg0.gFloat();
			this.aFloatArray87[local16] = arg0.gFloat();
			this.aFloatArray88[local16] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!asv", name = "ac", descriptor = "()V")
	@Override
	void method23104() {
		this.anInt3144 += -1375564633;
	}

	@OriginalMember(owner = "client!asv", name = "ag", descriptor = "()V")
	@Override
	void method23100() {
		this.anInt3144 += -1375564633;
	}

	@OriginalMember(owner = "client!asv", name = "ab", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23105(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt3144 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray89[local16] = arg0.gFloat();
			this.aFloatArray87[local16] = arg0.gFloat();
			this.aFloatArray88[local16] = arg0.gFloat();
		}
	}
}
