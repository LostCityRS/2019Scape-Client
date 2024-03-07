package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ani")
public class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!ani", name = "n", descriptor = "Lclient!pe;")
	Class479 aClass479_1 = null;

	@OriginalMember(owner = "client!ani", name = "m", descriptor = "Lclient!ahn;")
	Class124_Sub3 aClass124_Sub3_1 = null;

	@OriginalMember(owner = "client!ani", name = "<init>", descriptor = "(Lclient!je;)V", line = 17)
	public Class25_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "u", descriptor = "(F)V", line = 20)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ani", name = "e", descriptor = "(FB)V", line = 20)
	@Override
	public void method23122(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ani", name = "l", descriptor = "(F)V", line = 20)
	@Override
	public void method23132(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ani", name = "n", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23136(@OriginalArg(0) int arg0) {
		return this.aClass479_1 != null && this.aClass124_Sub3_1 != null && this.aClass124_Sub3_1.method21407(-1723495343);
	}

	@OriginalMember(owner = "client!ani", name = "z", descriptor = "()Z", line = 23)
	@Override
	public boolean method23129() {
		return this.aClass479_1 != null && this.aClass124_Sub3_1 != null && this.aClass124_Sub3_1.method21407(-1556766059);
	}

	@OriginalMember(owner = "client!ani", name = "m", descriptor = "(I)Lclient!ox;", line = 27)
	@Override
	public Class472 method23124(@OriginalArg(0) int arg0) {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(9) double[] local9 = this.aClass479_1.method29724(this.aClass124_Sub3_1.method21438(111433901));
		local1.aFloat317 = (float) local9[0];
		local1.aFloat318 = (float) local9[1];
		local1.aFloat319 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ani", name = "d", descriptor = "()Lclient!ox;", line = 27)
	@Override
	public Class472 method23131() {
		@Pc(1) Class472 local1 = Class472.method29531();
		@Pc(9) double[] local9 = this.aClass479_1.method29724(this.aClass124_Sub3_1.method21438(899452506));
		local1.aFloat317 = (float) local9[0];
		local1.aFloat318 = (float) local9[1];
		local1.aFloat319 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ani", name = "q", descriptor = "(B)[D", line = 36)
	double[] method16161(@OriginalArg(0) byte arg0) {
		return this.aClass479_1.method29724(this.aClass124_Sub3_1.method21438(262103549));
	}

	@OriginalMember(owner = "client!ani", name = "b", descriptor = "()[D", line = 36)
	double[] method16162() {
		return this.aClass479_1.method29724(this.aClass124_Sub3_1.method21438(1787945406));
	}

	@OriginalMember(owner = "client!ani", name = "x", descriptor = "()[D", line = 36)
	double[] method16163() {
		return this.aClass479_1.method29724(this.aClass124_Sub3_1.method21438(1857679914));
	}

	@OriginalMember(owner = "client!ani", name = "k", descriptor = "(I)Lclient!ox;", line = 40)
	@Override
	public Class472 method23126(@OriginalArg(0) int arg0) {
		return this.method23124(-1121481784);
	}

	@OriginalMember(owner = "client!ani", name = "y", descriptor = "()Lclient!ox;", line = 40)
	@Override
	public Class472 method23137() {
		return this.method23124(-1781091315);
	}

	@OriginalMember(owner = "client!ani", name = "s", descriptor = "()Lclient!ox;", line = 40)
	@Override
	public Class472 method23121() {
		return this.method23124(-1733073084);
	}

	@OriginalMember(owner = "client!ani", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 44)
	@Override
	public void method23127(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(4) double[] local4 = this.aClass123_16.method9029(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16161((byte) 79);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29531();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29564();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29478(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29592(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29592(local105, local56);
		local109.method29623(local92);
		arg1.method29372(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29544();
	}

	@OriginalMember(owner = "client!ani", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 44)
	@Override
	public void method23130(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method9029(580746591);
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16161((byte) 31);
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29531();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29564();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29478(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29592(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29592(local105, local56);
		local109.method29623(local92);
		arg1.method29372(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29544();
	}

	@OriginalMember(owner = "client!ani", name = "w", descriptor = "(Lclient!alw;I)V", line = 68)
	@Override
	public void method23123(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "c", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23125(@OriginalArg(0) Packet arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "r", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23133(@OriginalArg(0) Packet arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "v", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23134(@OriginalArg(0) Packet arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "o", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23135(@OriginalArg(0) Packet arg0) {
		this.aClass479_1 = new Class479(arg0);
	}
}
