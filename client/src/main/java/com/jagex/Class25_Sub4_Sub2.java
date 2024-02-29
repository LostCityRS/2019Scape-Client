package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ass")
public class Class25_Sub4_Sub2 extends Class25_Sub4 {

	@OriginalMember(owner = "client!ass", name = "z", descriptor = "[F")
	float[] aFloatArray73;

	@OriginalMember(owner = "client!ass", name = "u", descriptor = "[F")
	float[] aFloatArray74;

	@OriginalMember(owner = "client!ass", name = "p", descriptor = "I")
	int anInt3156 = 0;

	@OriginalMember(owner = "client!ass", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	public Class25_Sub4_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "ac", descriptor = "()V", line = 17)
	@Override
	void method23147() {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "al", descriptor = "()V", line = 17)
	@Override
	void method23150() {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "h", descriptor = "(I)V", line = 17)
	@Override
	void method23149(@OriginalArg(0) int arg0) {
		this.anInt3156 += -912422763;
	}

	@OriginalMember(owner = "client!ass", name = "b", descriptor = "(FFFI)F", line = 21)
	@Override
	float method23148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass479Array8[this.anInt3156 * 937231037].method29714();
		return (this.aFloatArray73[this.anInt3156 * 937231037] - this.aFloatArray74[this.anInt3156 * 937231037]) * local12 + this.aFloatArray74[this.anInt3156 * 937231037];
	}

	@OriginalMember(owner = "client!ass", name = "i", descriptor = "(FFF)F", line = 21)
	@Override
	float method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass479Array8[this.anInt3156 * 937231037].method29714();
		return (this.aFloatArray73[this.anInt3156 * 937231037] - this.aFloatArray74[this.anInt3156 * 937231037]) * local12 + this.aFloatArray74[this.anInt3156 * 937231037];
	}

	@OriginalMember(owner = "client!ass", name = "x", descriptor = "(FFI)V", line = 27)
	@Override
	void method23140(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29714()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29714();
		}
	}

	@OriginalMember(owner = "client!ass", name = "ag", descriptor = "(FF)V", line = 27)
	@Override
	void method23141(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29714()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29714();
		}
	}

	@OriginalMember(owner = "client!ass", name = "ah", descriptor = "(FF)V", line = 27)
	@Override
	void method23142(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass479Array8[this.anInt3156 * 937231037].method29714()) {
			this.aFloat229 = this.aClass479Array8[this.anInt3156 * 937231037].method29714();
		}
	}

	@OriginalMember(owner = "client!ass", name = "m", descriptor = "(I)Lclient!ox;", line = 32)
	@Override
	public Class472 method23124(@OriginalArg(0) int arg0) {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ass", name = "d", descriptor = "()Lclient!ox;", line = 32)
	@Override
	public Class472 method23131() {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ass", name = "a", descriptor = "(I)[D", line = 41)
	@Override
	double[] method23143(@OriginalArg(0) int arg0) {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "aw", descriptor = "()[D", line = 41)
	@Override
	double[] method23145() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "ai", descriptor = "()[D", line = 41)
	@Override
	double[] method23144() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "as", descriptor = "()[D", line = 41)
	@Override
	double[] method23146() {
		return this.aClass479Array8[this.anInt3156 * 937231037].method29724(this.aFloat229);
	}

	@OriginalMember(owner = "client!ass", name = "k", descriptor = "(I)Lclient!ox;", line = 45)
	@Override
	public Class472 method23126(@OriginalArg(0) int arg0) {
		return this.method23124(-1950379654);
	}

	@OriginalMember(owner = "client!ass", name = "y", descriptor = "()Lclient!ox;", line = 45)
	@Override
	public Class472 method23137() {
		return this.method23124(1910760167);
	}

	@OriginalMember(owner = "client!ass", name = "s", descriptor = "()Lclient!ox;", line = 45)
	@Override
	public Class472 method23121() {
		return this.method23124(-930873016);
	}

	@OriginalMember(owner = "client!ass", name = "j", descriptor = "(Lclient!alw;I)V", line = 49)
	@Override
	void method23154(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22504(30311528);
			this.aFloatArray73[local12] = arg0.method22504(1922227266);
		}
	}

	@OriginalMember(owner = "client!ass", name = "t", descriptor = "(Lclient!alw;I)V", line = 49)
	@Override
	void method23153(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22504(1537135703);
			this.aFloatArray73[local12] = arg0.method22504(-1386678195);
		}
	}

	@OriginalMember(owner = "client!ass", name = "g", descriptor = "(Lclient!alw;IB)V", line = 49)
	@Override
	void method23151(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray74 = new float[arg1];
		this.aFloatArray73 = new float[arg1];
		this.anInt3156 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray74[local12] = arg0.method22504(1233811034);
			this.aFloatArray73[local12] = arg0.method22504(683278535);
		}
	}
}
