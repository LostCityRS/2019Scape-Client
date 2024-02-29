package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asx")
public class Class25_Sub4_Sub3 extends Class25_Sub4 {

	@OriginalMember(owner = "client!asx", name = "z", descriptor = "[F")
	float[] aFloatArray76;

	@OriginalMember(owner = "client!asx", name = "p", descriptor = "[F")
	float[] aFloatArray77;

	@OriginalMember(owner = "client!asx", name = "u", descriptor = "[F")
	float[] aFloatArray78;

	@OriginalMember(owner = "client!asx", name = "d", descriptor = "I")
	int anInt3162 = 0;

	@OriginalMember(owner = "client!asx", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	public Class25_Sub4_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asx", name = "al", descriptor = "()V", line = 17)
	@Override
	void method23150() {
		this.anInt3162 += -583177903;
	}

	@OriginalMember(owner = "client!asx", name = "h", descriptor = "(I)V", line = 17)
	@Override
	void method23149(@OriginalArg(0) int arg0) {
		this.anInt3162 += -583177903;
	}

	@OriginalMember(owner = "client!asx", name = "ac", descriptor = "()V", line = 17)
	@Override
	void method23147() {
		this.anInt3162 += -583177903;
	}

	@OriginalMember(owner = "client!asx", name = "i", descriptor = "(FFF)F", line = 21)
	@Override
	float method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray76[this.anInt3162 * -1445232719] - this.aFloatArray78[this.anInt3162 * -1445232719]) + this.aFloatArray78[this.anInt3162 * -1445232719]) * (arg0 / this.aFloatArray77[this.anInt3162 * -1445232719]);
	}

	@OriginalMember(owner = "client!asx", name = "b", descriptor = "(FFFI)F", line = 21)
	@Override
	float method23148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray76[this.anInt3162 * -1445232719] - this.aFloatArray78[this.anInt3162 * -1445232719]) + this.aFloatArray78[this.anInt3162 * -1445232719]) * (arg0 / this.aFloatArray77[this.anInt3162 * -1445232719]);
	}

	@OriginalMember(owner = "client!asx", name = "g", descriptor = "(Lclient!alw;IB)V", line = 28)
	@Override
	void method23151(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray78 = new float[arg1];
		this.aFloatArray76 = new float[arg1];
		this.aFloatArray77 = new float[arg1];
		this.anInt3162 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray78[local16] = arg0.method22504(1320594699);
			this.aFloatArray76[local16] = arg0.method22504(-210290930);
			this.aFloatArray77[local16] = arg0.method22504(109590510);
		}
	}

	@OriginalMember(owner = "client!asx", name = "j", descriptor = "(Lclient!alw;I)V", line = 28)
	@Override
	void method23154(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray78 = new float[arg1];
		this.aFloatArray76 = new float[arg1];
		this.aFloatArray77 = new float[arg1];
		this.anInt3162 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray78[local16] = arg0.method22504(26525401);
			this.aFloatArray76[local16] = arg0.method22504(-1706590077);
			this.aFloatArray77[local16] = arg0.method22504(924019780);
		}
	}

	@OriginalMember(owner = "client!asx", name = "t", descriptor = "(Lclient!alw;I)V", line = 28)
	@Override
	void method23153(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray78 = new float[arg1];
		this.aFloatArray76 = new float[arg1];
		this.aFloatArray77 = new float[arg1];
		this.anInt3162 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray78[local16] = arg0.method22504(926670071);
			this.aFloatArray76[local16] = arg0.method22504(-1786161864);
			this.aFloatArray77[local16] = arg0.method22504(246763440);
		}
	}
}
