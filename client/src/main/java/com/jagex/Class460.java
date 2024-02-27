package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class460 {

	@OriginalMember(owner = "client!og", name = "m", descriptor = "F")
	public float aFloat299;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "F")
	public float aFloat300;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "F")
	public float aFloat301;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "F")
	public float aFloat302;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(FFFF)V")
	public Class460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29375(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class460() {
		this.method29374();
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "()V")
	void method29374() {
		this.aFloat302 = 0.0F;
		this.aFloat299 = 0.0F;
		this.aFloat300 = 0.0F;
		this.aFloat301 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(FFFF)V")
	public void method29375(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(Lclient!og;)V")
	public void method29376(@OriginalArg(0) Class460 arg0) {
		this.method29375(arg0.aFloat301, arg0.aFloat300, arg0.aFloat299, arg0.aFloat302);
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(I)V")
	public void method29377(@OriginalArg(0) int arg0) {
		this.method29375((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "v", descriptor = "(Lclient!og;)V")
	public void method29378(@OriginalArg(0) Class460 arg0) {
		this.method29375(arg0.aFloat301, arg0.aFloat300, arg0.aFloat299, arg0.aFloat302);
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(FFFF)V")
	public void method29379(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "w", descriptor = "(F)V")
	public void method29380(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat302 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "u", descriptor = "(FFFF)V")
	public void method29381(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "()V")
	public void method29382() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat301 + "," + this.aFloat300 + "," + this.aFloat299 + "," + this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()V")
	void method29383() {
		this.aFloat302 = 0.0F;
		this.aFloat299 = 0.0F;
		this.aFloat300 = 0.0F;
		this.aFloat301 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "z", descriptor = "(FFFF)V")
	public void method29384(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(FFFF)V")
	public void method29385(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "r", descriptor = "(Lclient!og;)V")
	public void method29386(@OriginalArg(0) Class460 arg0) {
		this.method29375(arg0.aFloat301, arg0.aFloat300, arg0.aFloat299, arg0.aFloat302);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "()V")
	public void method29387() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(Lclient!og;)V")
	public void method29388(@OriginalArg(0) Class460 arg0) {
		this.method29375(arg0.aFloat301, arg0.aFloat300, arg0.aFloat299, arg0.aFloat302);
	}

	@OriginalMember(owner = "client!og", name = "s", descriptor = "(I)V")
	public void method29389(@OriginalArg(0) int arg0) {
		this.method29375((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "y", descriptor = "(I)V")
	public void method29390(@OriginalArg(0) int arg0) {
		this.method29375((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(I)V")
	public void method29391(@OriginalArg(0) int arg0) {
		this.method29375((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "x", descriptor = "(I)V")
	public void method29392(@OriginalArg(0) int arg0) {
		this.method29375((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(Lclient!pq;)V")
	public void method29393(@OriginalArg(0) Class489 arg0) {
		@Pc(2) float local2 = this.aFloat301;
		@Pc(5) float local5 = this.aFloat300;
		@Pc(8) float local8 = this.aFloat299;
		@Pc(11) float local11 = this.aFloat302;
		this.aFloat301 = arg0.aFloatArray116[0] * local2 + arg0.aFloatArray116[4] * local5 + arg0.aFloatArray116[8] * local8 + arg0.aFloatArray116[12] * local11;
		this.aFloat300 = arg0.aFloatArray116[1] * local2 + arg0.aFloatArray116[5] * local5 + arg0.aFloatArray116[9] * local8 + arg0.aFloatArray116[13] * local11;
		this.aFloat299 = arg0.aFloatArray116[2] * local2 + arg0.aFloatArray116[6] * local5 + arg0.aFloatArray116[10] * local8 + arg0.aFloatArray116[14] * local11;
		this.aFloat302 = arg0.aFloatArray116[3] * local2 + arg0.aFloatArray116[7] * local5 + arg0.aFloatArray116[11] * local8 + arg0.aFloatArray116[15] * local11;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "()V")
	public void method29394() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	public void method29395() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(FFFF)V")
	public void method29396(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat301 = arg0;
		this.aFloat300 = arg1;
		this.aFloat299 = arg2;
		this.aFloat302 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "()V")
	public void method29397() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "()V")
	public void method29398() {
		this.aFloat301 = -this.aFloat301;
		this.aFloat300 = -this.aFloat300;
		this.aFloat299 = -this.aFloat299;
		this.aFloat302 = -this.aFloat302;
	}

	@OriginalMember(owner = "client!og", name = "t", descriptor = "(F)V")
	public void method29399(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat302 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "ae", descriptor = "(F)V")
	public void method29400(@OriginalArg(0) float arg0) {
		this.aFloat301 *= arg0;
		this.aFloat300 *= arg0;
		this.aFloat299 *= arg0;
		this.aFloat302 *= arg0;
	}

	@OriginalMember(owner = "client!og", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method29401() {
		return this.aFloat301 + "," + this.aFloat300 + "," + this.aFloat299 + "," + this.aFloat302;
	}
}
