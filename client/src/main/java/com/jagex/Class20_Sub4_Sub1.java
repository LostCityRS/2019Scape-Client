package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ask")
public final class Class20_Sub4_Sub1 extends Class20_Sub4 {

	@OriginalMember(owner = "client!ask", name = "o", descriptor = "[F")
	float[] aFloatArray83;

	@OriginalMember(owner = "client!ask", name = "m", descriptor = "[F")
	float[] aFloatArray84;

	@OriginalMember(owner = "client!ask", name = "j", descriptor = "I")
	int anInt3107 = 0;

	@OriginalMember(owner = "client!ask", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ask", name = "n", descriptor = "(FFI)V")
	@Override
	void method23098(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034()) {
			this.aFloat237 = this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		}
	}

	@OriginalMember(owner = "client!ask", name = "c", descriptor = "(FFFI)F")
	@Override
	float method23116(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(12) float local12 = this.aFloat237 / (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		return this.aFloatArray84[this.anInt3107 * -1836398189] + local12 * (this.aFloatArray83[this.anInt3107 * -1836398189] - this.aFloatArray84[this.anInt3107 * -1836398189]);
	}

	@OriginalMember(owner = "client!ask", name = "at", descriptor = "()[D")
	@Override
	double[] method23115() {
		return this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
	}

	@OriginalMember(owner = "client!ask", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ask", name = "ax", descriptor = "(I)[D")
	@Override
	double[] method23110(@OriginalArg(0) int arg0) {
		return this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
	}

	@OriginalMember(owner = "client!ask", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		return this.method23080(-1351317077);
	}

	@OriginalMember(owner = "client!ask", name = "ay", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method23107(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray83 = new float[arg1];
		this.anInt3107 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.gFloat();
			this.aFloatArray83[local12] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ai", descriptor = "(FFF)F")
	@Override
	float method23109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat237 / (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		return this.aFloatArray84[this.anInt3107 * -1836398189] + local12 * (this.aFloatArray83[this.anInt3107 * -1836398189] - this.aFloatArray84[this.anInt3107 * -1836398189]);
	}

	@OriginalMember(owner = "client!ask", name = "aq", descriptor = "(FFF)F")
	@Override
	float method23101(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat237 / (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		return this.aFloatArray84[this.anInt3107 * -1836398189] + local12 * (this.aFloatArray83[this.anInt3107 * -1836398189] - this.aFloatArray84[this.anInt3107 * -1836398189]);
	}

	@OriginalMember(owner = "client!ask", name = "ao", descriptor = "()V")
	@Override
	void method23102() {
		this.anInt3107 += -1269777253;
	}

	@OriginalMember(owner = "client!ask", name = "aj", descriptor = "()V")
	@Override
	void method23103() {
		this.anInt3107 += -1269777253;
	}

	@OriginalMember(owner = "client!ask", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ask", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		return this.method23080(-969282436);
	}

	@OriginalMember(owner = "client!ask", name = "ab", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23105(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray83 = new float[arg1];
		this.anInt3107 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.gFloat();
			this.aFloatArray83[local12] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!ask", name = "al", descriptor = "(Lclient!ald;I)V")
	@Override
	void method23106(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray83 = new float[arg1];
		this.anInt3107 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.gFloat();
			this.aFloatArray83[local12] = arg0.gFloat();
		}
	}

	@OriginalMember(owner = "client!ask", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(12) double[] local12 = this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
		local1.aFloat297 = (float) local12[0];
		local1.aFloat295 = (float) local12[1];
		local1.aFloat296 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ask", name = "am", descriptor = "(FF)V")
	@Override
	void method23113(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034()) {
			this.aFloat237 = this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ac", descriptor = "()V")
	@Override
	void method23104() {
		this.anInt3107 += -1269777253;
	}

	@OriginalMember(owner = "client!ask", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		return this.method23080(-1182976573);
	}

	@OriginalMember(owner = "client!ask", name = "b", descriptor = "(I)V")
	@Override
	void method23099(@OriginalArg(0) int arg0) {
		this.anInt3107 += -1269777253;
	}

	@OriginalMember(owner = "client!ask", name = "af", descriptor = "(FF)V")
	@Override
	void method23112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034()) {
			this.aFloat237 = this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ak", descriptor = "(FF)V")
	@Override
	void method23114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat237 += arg0;
		if (this.aFloat237 > (float) this.aClass485Array8[this.anInt3107 * -1836398189].method30034()) {
			this.aFloat237 = this.aClass485Array8[this.anInt3107 * -1836398189].method30034();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ag", descriptor = "()V")
	@Override
	void method23100() {
		this.anInt3107 += -1269777253;
	}

	@OriginalMember(owner = "client!ask", name = "ad", descriptor = "()[D")
	@Override
	double[] method23108() {
		return this.aClass485Array8[this.anInt3107 * -1836398189].method30047(this.aFloat237);
	}
}
