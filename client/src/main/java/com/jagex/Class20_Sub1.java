package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ana")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ana", name = "f", descriptor = "Lclient!pk;")
	Class485 aClass485_1 = null;

	@OriginalMember(owner = "client!ana", name = "e", descriptor = "Lclient!ahk;")
	Class123_Sub2 aClass123_Sub2_1 = null;

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub1(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		return this.method23080(-1806078068);
	}

	@OriginalMember(owner = "client!ana", name = "t", descriptor = "(FI)V")
	@Override
	public void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ana", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method23076(@OriginalArg(0) byte arg0) {
		return this.aClass485_1 != null && this.aClass123_Sub2_1 != null && this.aClass123_Sub2_1.method20500(124242728);
	}

	@OriginalMember(owner = "client!ana", name = "a", descriptor = "()Z")
	@Override
	public boolean method23084() {
		return this.aClass485_1 != null && this.aClass123_Sub2_1 != null && this.aClass123_Sub2_1.method20500(1940068372);
	}

	@OriginalMember(owner = "client!ana", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(956056443);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16385((short) 2529);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ana", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		return this.method23080(-799353768);
	}

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	@Override
	public void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-1284351039);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16385((short) 13234);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ana", name = "g", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23094(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass485_1 = new Class485(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "j", descriptor = "(F)V")
	@Override
	public void method23083(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ana", name = "m", descriptor = "(F)V")
	@Override
	public void method23077(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ana", name = "b", descriptor = "()[D")
	double[] method16384() {
		return this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 53));
	}

	@OriginalMember(owner = "client!ana", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(9) double[] local9 = this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 10));
		local1.aFloat297 = (float) local9[0];
		local1.aFloat295 = (float) local9[1];
		local1.aFloat296 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ana", name = "o", descriptor = "(F)V")
	@Override
	public void method23082(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ana", name = "s", descriptor = "()Z")
	@Override
	public boolean method23092() {
		return this.aClass485_1 != null && this.aClass123_Sub2_1 != null && this.aClass123_Sub2_1.method20500(1736745200);
	}

	@OriginalMember(owner = "client!ana", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(9) double[] local9 = this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 61));
		local1.aFloat297 = (float) local9[0];
		local1.aFloat295 = (float) local9[1];
		local1.aFloat296 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ana", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		@Pc(1) Class463 local1 = Class463.method29470();
		@Pc(9) double[] local9 = this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 1));
		local1.aFloat297 = (float) local9[0];
		local1.aFloat295 = (float) local9[1];
		local1.aFloat296 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ana", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		return this.method23080(-1810973220);
	}

	@OriginalMember(owner = "client!ana", name = "i", descriptor = "(F)V")
	@Override
	public void method23081(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ana", name = "q", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23090(@OriginalArg(0) Packet arg0) {
		this.aClass485_1 = new Class485(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "h", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23091(@OriginalArg(0) Packet arg0) {
		this.aClass485_1 = new Class485(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(249368908);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16385((short) 24793);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ana", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(237508928);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16385((short) 5809);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ana", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass121_16.method9609(-1725209275);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16385((short) 21504);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class463 local56 = Class463.method29470();
		local56.aFloat297 = (float) (local24[0] - local4[0]);
		local56.aFloat295 = (float) (local24[1] - local4[1]);
		local56.aFloat296 = (float) (local24[2] - local4[2]);
		local56.method29482();
		@Pc(92) Class466 local92 = new Class466();
		local92.method29648(local56, arg4);
		@Pc(101) Class463 local101 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(105) Class463 local105 = Class463.method29491(local56, local101);
		@Pc(109) Class463 local109 = Class463.method29491(local105, local56);
		local109.method29500(local92);
		arg1.method29764(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat297, local109.aFloat295, local109.aFloat296);
		local109.method29557();
	}

	@OriginalMember(owner = "client!ana", name = "y", descriptor = "(S)[D")
	double[] method16385(@OriginalArg(0) short arg0) {
		return this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 86));
	}

	@OriginalMember(owner = "client!ana", name = "n", descriptor = "()[D")
	double[] method16386() {
		return this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 66));
	}

	@OriginalMember(owner = "client!ana", name = "c", descriptor = "()[D")
	double[] method16387() {
		return this.aClass485_1.method30047(this.aClass123_Sub2_1.method20533((byte) 51));
	}
}
