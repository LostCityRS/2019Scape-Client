package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asi")
public class Class25_Sub4_Sub1 extends Class25_Sub4 {

	@OriginalMember(owner = "client!asi", name = "<init>", descriptor = "(Lclient!je;)V", line = 8)
	public Class25_Sub4_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "b", descriptor = "(FFFI)F", line = 12)
	@Override
	float method23148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass123_16.method9054((byte) -82).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_16.method9064((byte) 35).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_16.method9054((byte) -64).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_16.method9054((byte) -13).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_16.method9064((byte) 12).method29593()) {
				arg1 += this.aClass123_16.method9054((byte) -73).method29593() * arg2;
				if (arg1 > this.aClass123_16.method9064((byte) 87).method29593()) {
					arg1 = this.aClass123_16.method9064((byte) 21).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asi", name = "i", descriptor = "(FFF)F", line = 12)
	@Override
	float method23152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass123_16.method9054((byte) -23).aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_16.method9064((byte) -5).method29593();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_16.method9054((byte) -45).method29593();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_16.method9054((byte) -125).method29593() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_16.method9064((byte) 35).method29593()) {
				arg1 += this.aClass123_16.method9054((byte) -62).method29593() * arg2;
				if (arg1 > this.aClass123_16.method9064((byte) -14).method29593()) {
					arg1 = this.aClass123_16.method9064((byte) -33).method29593();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asi", name = "h", descriptor = "(I)V", line = 31)
	@Override
	void method23149(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!asi", name = "al", descriptor = "()V", line = 31)
	@Override
	void method23150() {
	}

	@OriginalMember(owner = "client!asi", name = "ac", descriptor = "()V", line = 31)
	@Override
	void method23147() {
	}

	@OriginalMember(owner = "client!asi", name = "j", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method23154(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asi", name = "g", descriptor = "(Lclient!alw;IB)V", line = 32)
	@Override
	void method23151(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
	}

	@OriginalMember(owner = "client!asi", name = "t", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method23153(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}
}
