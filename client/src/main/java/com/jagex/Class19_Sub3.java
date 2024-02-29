package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoy")
public class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!aoy", name = "q", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!aoy", name = "x", descriptor = "Lclient!ahm;")
	Class132_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aoy", name = "<init>", descriptor = "(Lclient!ahm;Z)V", line = 12)
	Class19_Sub3(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass132_Sub1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!aoy", name = "ai", descriptor = "(Lclient!fg;I)V", line = 17)
	@Override
	void method23626(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean379 || !this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23557(2032109090) || this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23578((byte) 0)) {
			Class274.aClass258_1.method26135(arg0, arg1, this.aClass132_Sub1_Sub1_Sub1_2, (byte) 127);
		}
	}

	@OriginalMember(owner = "client!aoy", name = "ag", descriptor = "(Lclient!fg;II)V", line = 17)
	@Override
	void method23625(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean379 || !this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23557(1431841752) || this.aClass132_Sub1_Sub1_Sub1_2.aClass19_3.method23578((byte) 0)) {
			Class274.aClass258_1.method26135(arg0, arg1, this.aClass132_Sub1_Sub1_Sub1_2, (byte) 127);
		}
	}

	@OriginalMember(owner = "client!aoy", name = "bo", descriptor = "(III)Z", line = 1910)
	static boolean method17555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Class528.method30393(arg0, 1456045229)) {
			return true;
		} else {
			return !Class528.method30393(arg1, -417900709);
		}
	}
}
