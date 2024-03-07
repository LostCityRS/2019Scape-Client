package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqx")
public class Class124_Sub3_Sub3 extends Class124_Sub3 {

	@OriginalMember(owner = "client!aqx", name = "<init>", descriptor = "(Lclient!je;)V", line = 8)
	public Class124_Sub3_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqx", name = "aw", descriptor = "(FFF)F", line = 12)
	@Override
	float method21448(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9057(1986912455).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method9069((byte) 0).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9057(-2124052255).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9057(1339793934).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method9069((byte) 0).method29593()) {
				arg1 += this.aClass123_13.method9057(2045580982).method29593() * arg2;
				if (arg1 > this.aClass123_13.method9069((byte) 0).method29593()) {
					arg1 = this.aClass123_13.method9069((byte) 0).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "ag", descriptor = "(FFFB)F", line = 12)
	@Override
	float method21444(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9057(-483978254).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method9069((byte) 0).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9057(-907280817).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9057(-959830159).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method9069((byte) 0).method29593()) {
				arg1 += this.aClass123_13.method9057(1791815782).method29593() * arg2;
				if (arg1 > this.aClass123_13.method9069((byte) 0).method29593()) {
					arg1 = this.aClass123_13.method9069((byte) 0).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "ai", descriptor = "(FFF)F", line = 12)
	@Override
	float method21447(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9057(-1230996363).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method9069((byte) 0).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9057(-583740022).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9057(-1723600884).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method9069((byte) 0).method29593()) {
				arg1 += this.aClass123_13.method9057(-98575022).method29593() * arg2;
				if (arg1 > this.aClass123_13.method9069((byte) 0).method29593()) {
					arg1 = this.aClass123_13.method9069((byte) 0).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "as", descriptor = "(FFF)F", line = 12)
	@Override
	float method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9057(1359271022).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method9069((byte) 0).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9057(1089133440).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9057(45937383).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method9069((byte) 0).method29593()) {
				arg1 += this.aClass123_13.method9057(1151883238).method29593() * arg2;
				if (arg1 > this.aClass123_13.method9069((byte) 0).method29593()) {
					arg1 = this.aClass123_13.method9069((byte) 0).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "au", descriptor = "()V", line = 31)
	@Override
	void method21452() {
	}

	@OriginalMember(owner = "client!aqx", name = "ah", descriptor = "(I)V", line = 31)
	@Override
	void method21445(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aqx", name = "at", descriptor = "()V", line = 31)
	@Override
	void method21450() {
	}

	@OriginalMember(owner = "client!aqx", name = "ad", descriptor = "()V", line = 31)
	@Override
	void method21453() {
	}

	@OriginalMember(owner = "client!aqx", name = "am", descriptor = "()V", line = 31)
	@Override
	void method21451() {
	}

	@OriginalMember(owner = "client!aqx", name = "ac", descriptor = "(Lclient!alw;IS)V", line = 32)
	@Override
	void method21446(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
	}

	@OriginalMember(owner = "client!aqx", name = "ar", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method21454(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqx", name = "ap", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method21455(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}
}
