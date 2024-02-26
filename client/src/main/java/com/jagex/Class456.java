package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class456 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "F")
	public float aFloat291;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "F")
	public float aFloat292;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "F")
	public float aFloat293;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "F")
	public float aFloat294;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(FFFF)V")
	public Class456(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29337(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class456() {
		this.method29340();
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public void method29336(@OriginalArg(0) int arg0) {
		this.method29337((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "(FFFF)V")
	public void method29337(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat294 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat293 = arg3;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(Lclient!ob;)V")
	public void method29338(@OriginalArg(0) Class456 arg0) {
		this.method29337(arg0.aFloat294, arg0.aFloat292, arg0.aFloat291, arg0.aFloat293);
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "(Lclient!pm;)V")
	public void method29339(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float local2 = this.aFloat294;
		@Pc(5) float local5 = this.aFloat292;
		@Pc(8) float local8 = this.aFloat291;
		@Pc(11) float local11 = this.aFloat293;
		this.aFloat294 = arg0.aFloatArray114[0] * local2 + arg0.aFloatArray114[4] * local5 + arg0.aFloatArray114[8] * local8 + arg0.aFloatArray114[12] * local11;
		this.aFloat292 = arg0.aFloatArray114[1] * local2 + arg0.aFloatArray114[5] * local5 + arg0.aFloatArray114[9] * local8 + arg0.aFloatArray114[13] * local11;
		this.aFloat291 = arg0.aFloatArray114[2] * local2 + arg0.aFloatArray114[6] * local5 + arg0.aFloatArray114[10] * local8 + arg0.aFloatArray114[14] * local11;
		this.aFloat293 = arg0.aFloatArray114[3] * local2 + arg0.aFloatArray114[7] * local5 + arg0.aFloatArray114[11] * local8 + arg0.aFloatArray114[15] * local11;
	}

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "()V")
	void method29340() {
		this.aFloat293 = 0.0F;
		this.aFloat291 = 0.0F;
		this.aFloat292 = 0.0F;
		this.aFloat294 = 0.0F;
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "()V")
	public void method29341() {
		this.aFloat294 = -this.aFloat294;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat293 = -this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(F)V")
	public void method29342(@OriginalArg(0) float arg0) {
		this.aFloat294 *= arg0;
		this.aFloat292 *= arg0;
		this.aFloat291 *= arg0;
		this.aFloat293 *= arg0;
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(Lclient!pm;)V")
	public void method29343(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float local2 = this.aFloat294;
		@Pc(5) float local5 = this.aFloat292;
		@Pc(8) float local8 = this.aFloat291;
		@Pc(11) float local11 = this.aFloat293;
		this.aFloat294 = arg0.aFloatArray114[0] * local2 + arg0.aFloatArray114[4] * local5 + arg0.aFloatArray114[8] * local8 + arg0.aFloatArray114[12] * local11;
		this.aFloat292 = arg0.aFloatArray114[1] * local2 + arg0.aFloatArray114[5] * local5 + arg0.aFloatArray114[9] * local8 + arg0.aFloatArray114[13] * local11;
		this.aFloat291 = arg0.aFloatArray114[2] * local2 + arg0.aFloatArray114[6] * local5 + arg0.aFloatArray114[10] * local8 + arg0.aFloatArray114[14] * local11;
		this.aFloat293 = arg0.aFloatArray114[3] * local2 + arg0.aFloatArray114[7] * local5 + arg0.aFloatArray114[11] * local8 + arg0.aFloatArray114[15] * local11;
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat294 + "," + this.aFloat292 + "," + this.aFloat291 + "," + this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(Lclient!pm;)V")
	public void method29344(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float local2 = this.aFloat294;
		@Pc(5) float local5 = this.aFloat292;
		@Pc(8) float local8 = this.aFloat291;
		@Pc(11) float local11 = this.aFloat293;
		this.aFloat294 = arg0.aFloatArray114[0] * local2 + arg0.aFloatArray114[4] * local5 + arg0.aFloatArray114[8] * local8 + arg0.aFloatArray114[12] * local11;
		this.aFloat292 = arg0.aFloatArray114[1] * local2 + arg0.aFloatArray114[5] * local5 + arg0.aFloatArray114[9] * local8 + arg0.aFloatArray114[13] * local11;
		this.aFloat291 = arg0.aFloatArray114[2] * local2 + arg0.aFloatArray114[6] * local5 + arg0.aFloatArray114[10] * local8 + arg0.aFloatArray114[14] * local11;
		this.aFloat293 = arg0.aFloatArray114[3] * local2 + arg0.aFloatArray114[7] * local5 + arg0.aFloatArray114[11] * local8 + arg0.aFloatArray114[15] * local11;
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(Lclient!ob;)V")
	public void method29345(@OriginalArg(0) Class456 arg0) {
		this.method29337(arg0.aFloat294, arg0.aFloat292, arg0.aFloat291, arg0.aFloat293);
	}

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "(FFFF)V")
	public void method29346(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat294 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat293 = arg3;
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "(I)V")
	public void method29347(@OriginalArg(0) int arg0) {
		this.method29337((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ob;)V")
	public void method29348(@OriginalArg(0) Class456 arg0) {
		this.method29337(arg0.aFloat294, arg0.aFloat292, arg0.aFloat291, arg0.aFloat293);
	}

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "(Lclient!ob;)V")
	public void method29349(@OriginalArg(0) Class456 arg0) {
		this.method29337(arg0.aFloat294, arg0.aFloat292, arg0.aFloat291, arg0.aFloat293);
	}

	@OriginalMember(owner = "client!ob", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method29350() {
		return this.aFloat294 + "," + this.aFloat292 + "," + this.aFloat291 + "," + this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "(I)V")
	public void method29351(@OriginalArg(0) int arg0) {
		this.method29337((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "(I)V")
	public void method29352(@OriginalArg(0) int arg0) {
		this.method29337((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "()V")
	public void method29353() {
		this.aFloat294 = -this.aFloat294;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat293 = -this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "(Lclient!pm;)V")
	public void method29354(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float local2 = this.aFloat294;
		@Pc(5) float local5 = this.aFloat292;
		@Pc(8) float local8 = this.aFloat291;
		@Pc(11) float local11 = this.aFloat293;
		this.aFloat294 = arg0.aFloatArray114[0] * local2 + arg0.aFloatArray114[4] * local5 + arg0.aFloatArray114[8] * local8 + arg0.aFloatArray114[12] * local11;
		this.aFloat292 = arg0.aFloatArray114[1] * local2 + arg0.aFloatArray114[5] * local5 + arg0.aFloatArray114[9] * local8 + arg0.aFloatArray114[13] * local11;
		this.aFloat291 = arg0.aFloatArray114[2] * local2 + arg0.aFloatArray114[6] * local5 + arg0.aFloatArray114[10] * local8 + arg0.aFloatArray114[14] * local11;
		this.aFloat293 = arg0.aFloatArray114[3] * local2 + arg0.aFloatArray114[7] * local5 + arg0.aFloatArray114[11] * local8 + arg0.aFloatArray114[15] * local11;
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(F)V")
	public void method29355(@OriginalArg(0) float arg0) {
		this.aFloat294 *= arg0;
		this.aFloat292 *= arg0;
		this.aFloat291 *= arg0;
		this.aFloat293 *= arg0;
	}

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "()V")
	public void method29356() {
		this.aFloat294 = -this.aFloat294;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat293 = -this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method29357() {
		return this.aFloat294 + "," + this.aFloat292 + "," + this.aFloat291 + "," + this.aFloat293;
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(FFFF)V")
	public void method29358(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat294 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat293 = arg3;
	}
}
