package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acn")
public final class Class63 implements Interface3 {

	@OriginalMember(owner = "client!acn", name = "t", descriptor = "Ljava/lang/Class;")
	final Class aClass1;

	@OriginalMember(owner = "client!acn", name = "hg", descriptor = "(Lclient!ahb;B)V")
	static void method1219(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) int local6 = arg0.anInt2688 * -1881785185 - client.currentCycle;
		@Pc(17) int local17 = arg0.anInt2684 * -2097547776 + arg0.method18966((byte) -123) * 256;
		@Pc(28) int local28 = arg0.anInt2704 * -73903616 + arg0.method18966((byte) -79) * 256;
		@Pc(37) int local37 = Class439.method29150(local17, local28, arg0.anInt2686 * -1606116371, 1037753497);
		@Pc(41) Class463 local41 = arg0.method24552().aClass463_61;
		arg0.method24531((float) ((int) local41.aFloat297 + (local17 - (int) local41.aFloat297) / local6), (float) ((int) local41.aFloat295 + (local37 - (int) local41.aFloat295) / local6), (float) ((local28 - (int) local41.aFloat296) / local6 + (int) local41.aFloat296));
		arg0.anInt2678 = 0;
		arg0.method19033(arg0.anInt2677 * 1640742599, (byte) 1);
	}

	@OriginalMember(owner = "client!acn", name = "<init>", descriptor = "(Ljava/lang/Class;)V")
	public Class63(@OriginalArg(0) Class arg0) {
		this.aClass1 = arg0;
	}

	@OriginalMember(owner = "client!acn", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!acn", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(4) Interface11 local4 = (Interface11) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method37014(arg0, (short) 512);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!acn", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		try {
			@Pc(4) Interface11 local4 = (Interface11) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method37014(arg0, (short) 512);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!acn", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!acn", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!acn", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		try {
			@Pc(4) Interface11 local4 = (Interface11) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method37014(arg0, (short) 512);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!acn", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		try {
			@Pc(4) Interface11 local4 = (Interface11) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method37014(arg0, (short) 512);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!acn", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		try {
			@Pc(4) Interface11 local4 = (Interface11) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface5) local4).method37014(arg0, (short) 512);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}
}
