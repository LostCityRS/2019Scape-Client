package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoy")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!aoy", name = "q", descriptor = "Z")
	public boolean aBoolean380 = false;

	@OriginalMember(owner = "client!aoy", name = "x", descriptor = "Lclient!ahm;")
	Class132_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aoy", name = "bo", descriptor = "(III)Z")
	static boolean method17567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Class528.method30573(arg0, 1456045229)) {
			return true;
		} else {
			return !Class528.method30573(arg1, -417900709);
		}
	}

	@OriginalMember(owner = "client!aoy", name = "<init>", descriptor = "(Lclient!ahm;Z)V")
	Class19_Sub3(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass132_Sub1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!aoy", name = "ai", descriptor = "(Lclient!fg;I)V")
	@Override
	void method23635(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean380 || !this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23564(2032109090) || this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23573((byte) 0)) {
			Class274.aClass258_11.method26156(arg0, arg1, this.aClass132_Sub1_Sub1_Sub1_2, (byte) 127);
		}
	}

	@OriginalMember(owner = "client!aoy", name = "ag", descriptor = "(Lclient!fg;II)V")
	@Override
	void method23625(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean380 || !this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23564(1431841752) || this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23573((byte) 0)) {
			Class274.aClass258_11.method26156(arg0, arg1, this.aClass132_Sub1_Sub1_Sub1_2, (byte) 127);
		}
	}
}
