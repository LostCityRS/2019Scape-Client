package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yp")
final class Class690 implements Runnable {

	@OriginalMember(owner = "client!yp", name = "q", descriptor = "[[Z")
	static boolean[][] aBooleanArrayArray15;

	@OriginalMember(owner = "client!yp", name = "nd", descriptor = "(Lclient!yf;B)V")
	static void method36715(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class220.method25637(local11, local14, arg0, 941992556);
	}

	@OriginalMember(owner = "client!yp", name = "o", descriptor = "()V")
	public void method36711() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!yp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!yp", name = "c", descriptor = "()V")
	public void method36712() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!yp", name = "r", descriptor = "()V")
	public void method36713() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!yp", name = "v", descriptor = "()V")
	public void method36714() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}
}
