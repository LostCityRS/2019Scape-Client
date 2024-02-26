package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;

@OriginalClass("client!aqk")
public final class Class123_Sub2_Sub2 extends Class123_Sub2 {

	@OriginalMember(owner = "client!aqk", name = "g", descriptor = "(I)Ljava/io/File;")
	public static File method20260(@OriginalArg(0) int arg0) {
		return Class554.aFile3;
	}

	@OriginalMember(owner = "client!aqk", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class123_Sub2_Sub2(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqk", name = "al", descriptor = "()V")
	@Override
	void method20537() {
	}

	@OriginalMember(owner = "client!aqk", name = "ai", descriptor = "(FFFI)F")
	@Override
	float method20530(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat198;
		if (this.aClass121_13.method9617((byte) -5).aFloat297 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass121_13.method9615((byte) -47).method29481();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass121_13.method9617((byte) -47).method29481();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass121_13.method9617((byte) 20).method29481() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass121_13.method9615((byte) 18).method29481()) {
				arg1 += this.aClass121_13.method9617((byte) 11).method29481() * arg2;
				if (arg1 > this.aClass121_13.method9615((byte) 27).method29481()) {
					arg1 = this.aClass121_13.method9615((byte) -17).method29481();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqk", name = "aj", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method20534(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
	}

	@OriginalMember(owner = "client!aqk", name = "aq", descriptor = "(B)V")
	@Override
	void method20541(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!aqk", name = "ag", descriptor = "()V")
	@Override
	void method20536() {
	}

	@OriginalMember(owner = "client!aqk", name = "ac", descriptor = "(FFF)F")
	@Override
	float method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat198;
		if (this.aClass121_13.method9617((byte) -1).aFloat297 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass121_13.method9615((byte) -62).method29481();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass121_13.method9617((byte) -15).method29481();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass121_13.method9617((byte) 63).method29481() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass121_13.method9615((byte) -6).method29481()) {
				arg1 += this.aClass121_13.method9617((byte) -67).method29481() * arg2;
				if (arg1 > this.aClass121_13.method9615((byte) 90).method29481()) {
					arg1 = this.aClass121_13.method9615((byte) -9).method29481();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqk", name = "ab", descriptor = "()V")
	@Override
	void method20531() {
	}

	@OriginalMember(owner = "client!aqk", name = "ah", descriptor = "()V")
	@Override
	void method20538() {
	}

	@OriginalMember(owner = "client!aqk", name = "af", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20539(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqk", name = "am", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20540(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqk", name = "ak", descriptor = "(Lclient!ald;I)V")
	@Override
	void method20546(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}
}
