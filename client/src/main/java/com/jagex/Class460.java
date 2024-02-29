package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class Class460 {

	@OriginalMember(owner = "client!og", name = "m", descriptor = "F")
	public float aFloat291;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "F")
	public float aFloat292;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "F")
	public float aFloat293;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "F")
	public float aFloat294;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 9)
	public Class460() {
		this.method29208();
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(FFFF)V", line = 13)
	public Class460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29193(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(FFFF)V", line = 18)
	public void method29193(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(FFFF)V", line = 18)
	public void method29194(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "u", descriptor = "(FFFF)V", line = 18)
	public void method29195(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "z", descriptor = "(FFFF)V", line = 18)
	public void method29196(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(FFFF)V", line = 18)
	public void method29197(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(FFFF)V", line = 18)
	public void method29198(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat293 = arg0;
		this.aFloat292 = arg1;
		this.aFloat291 = arg2;
		this.aFloat294 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(Lclient!og;)V", line = 25)
	public void method29199(@OriginalArg(0) Class460 arg0) {
		this.method29193(arg0.aFloat293, arg0.aFloat292, arg0.aFloat291, arg0.aFloat294);
	}

	@OriginalMember(owner = "client!og", name = "v", descriptor = "(Lclient!og;)V", line = 25)
	public void method29200(@OriginalArg(0) Class460 arg0) {
		this.method29193(arg0.aFloat293, arg0.aFloat292, arg0.aFloat291, arg0.aFloat294);
	}

	@OriginalMember(owner = "client!og", name = "r", descriptor = "(Lclient!og;)V", line = 25)
	public void method29201(@OriginalArg(0) Class460 arg0) {
		this.method29193(arg0.aFloat293, arg0.aFloat292, arg0.aFloat291, arg0.aFloat294);
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(Lclient!og;)V", line = 25)
	public void method29202(@OriginalArg(0) Class460 arg0) {
		this.method29193(arg0.aFloat293, arg0.aFloat292, arg0.aFloat291, arg0.aFloat294);
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(I)V", line = 29)
	public void method29203(@OriginalArg(0) int arg0) {
		this.method29193((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "s", descriptor = "(I)V", line = 29)
	public void method29204(@OriginalArg(0) int arg0) {
		this.method29193((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "y", descriptor = "(I)V", line = 29)
	public void method29205(@OriginalArg(0) int arg0) {
		this.method29193((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(I)V", line = 29)
	public void method29206(@OriginalArg(0) int arg0) {
		this.method29193((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "x", descriptor = "(I)V", line = 29)
	public void method29207(@OriginalArg(0) int arg0) {
		this.method29193((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "()V", line = 33)
	final void method29208() {
		this.aFloat294 = 0.0F;
		this.aFloat291 = 0.0F;
		this.aFloat292 = 0.0F;
		this.aFloat293 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()V", line = 33)
	final void method29209() {
		this.aFloat294 = 0.0F;
		this.aFloat291 = 0.0F;
		this.aFloat292 = 0.0F;
		this.aFloat293 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "()V", line = 40)
	public final void method29210() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "()V", line = 40)
	public final void method29211() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "()V", line = 40)
	public final void method29212() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 40)
	public final void method29213() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "()V", line = 40)
	public final void method29214() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "()V", line = 40)
	public final void method29215() {
		this.aFloat293 = -this.aFloat293;
		this.aFloat292 = -this.aFloat292;
		this.aFloat291 = -this.aFloat291;
		this.aFloat294 = -this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "w", descriptor = "(F)V", line = 47)
	public final void method29216(@OriginalArg(0) float arg0) {
		this.aFloat293 *= arg0;
		this.aFloat292 *= arg0;
		this.aFloat291 *= arg0;
		this.aFloat294 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "t", descriptor = "(F)V", line = 47)
	public final void method29217(@OriginalArg(0) float arg0) {
		this.aFloat293 *= arg0;
		this.aFloat292 *= arg0;
		this.aFloat291 *= arg0;
		this.aFloat294 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "ae", descriptor = "(F)V", line = 47)
	public final void method29218(@OriginalArg(0) float arg0) {
		this.aFloat293 *= arg0;
		this.aFloat292 *= arg0;
		this.aFloat291 *= arg0;
		this.aFloat294 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(Lclient!pq;)V", line = 54)
	public final void method29219(@OriginalArg(0) Class489 arg0) {
		@Pc(2) float local2 = this.aFloat293;
		@Pc(5) float local5 = this.aFloat292;
		@Pc(8) float local8 = this.aFloat291;
		@Pc(11) float local11 = this.aFloat294;
		this.aFloat293 = arg0.aFloatArray116[0] * local2 + arg0.aFloatArray116[4] * local5 + arg0.aFloatArray116[8] * local8 + arg0.aFloatArray116[12] * local11;
		this.aFloat292 = arg0.aFloatArray116[1] * local2 + arg0.aFloatArray116[5] * local5 + arg0.aFloatArray116[9] * local8 + arg0.aFloatArray116[13] * local11;
		this.aFloat291 = arg0.aFloatArray116[2] * local2 + arg0.aFloatArray116[6] * local5 + arg0.aFloatArray116[10] * local8 + arg0.aFloatArray116[14] * local11;
		this.aFloat294 = arg0.aFloatArray116[3] * local2 + arg0.aFloatArray116[7] * local5 + arg0.aFloatArray116[11] * local8 + arg0.aFloatArray116[15] * local11;
	}

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 66)
	@Override
	public String toString() {
		return this.aFloat293 + "," + this.aFloat292 + "," + this.aFloat291 + "," + this.aFloat294;
	}

	@OriginalMember(owner = "client!og", name = "rj", descriptor = "()Ljava/lang/String;", line = 66)
	public String method29220() {
		return this.aFloat293 + "," + this.aFloat292 + "," + this.aFloat291 + "," + this.aFloat294;
	}
}
