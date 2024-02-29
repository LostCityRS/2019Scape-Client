package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ary")
public class Class93_Sub26_Sub14 extends Class93_Sub26 {

	@OriginalMember(owner = "client!ary", name = "f", descriptor = "I")
	int anInt3050;

	@OriginalMember(owner = "client!ary", name = "w", descriptor = "I")
	int anInt3051;

	@OriginalMember(owner = "client!ary", name = "l", descriptor = "I")
	int anInt3052;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ary", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!ary", name = "k", descriptor = "I")
	int anInt3053;

	@OriginalMember(owner = "client!ary", name = "e", descriptor = "(ILclient!ie;Lclient!alw;I)Lclient!aso;", line = 13)
	public static Class93_Sub1_Sub17 method21997(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class93_Sub41 arg2, @OriginalArg(3) int arg3) {
		if (Class335.aClass335_2 == arg1) {
			return new Class93_Sub1_Sub17_Sub1(arg0, arg2);
		} else if (Class335.aClass335_1 == arg1) {
			return new Class93_Sub1_Sub17_Sub2(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ary", name = "<init>", descriptor = "(Lclient!kd;)V", line = 147)
	Class93_Sub26_Sub14(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.anInt3053 = -1887726291;
	}

	@OriginalMember(owner = "client!ary", name = "e", descriptor = "(Lclient!alw;B)V", line = 150)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3053 = arg0.method22472(-1434290800) * 1887726291;
		this.anInt3050 = arg0.method22483(-118643075) * 1503455239;
		this.anInt3051 = arg0.method22465((short) 16384) * -1348153087;
		this.anInt3052 = arg0.method22465((short) 16384) * -2050172787;
	}

	@OriginalMember(owner = "client!ary", name = "m", descriptor = "(Lclient!alw;)V", line = 150)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3053 = arg0.method22472(-1434290800) * 1887726291;
		this.anInt3050 = arg0.method22483(-118643075) * 1503455239;
		this.anInt3051 = arg0.method22465((short) 16384) * -1348153087;
		this.anInt3052 = arg0.method22465((short) 16384) * -2050172787;
	}

	@OriginalMember(owner = "client!ary", name = "n", descriptor = "(Lclient!kr;I)V", line = 157)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28210(this.anInt3053 * -1090028197, this.anInt3050 * -574487113, this.anInt3051 * 1375481601, this.anInt3052 * -554915259, (byte) -83);
	}

	@OriginalMember(owner = "client!ary", name = "k", descriptor = "(Lclient!kr;)V", line = 157)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28210(this.anInt3053 * -1090028197, this.anInt3050 * -574487113, this.anInt3051 * 1375481601, this.anInt3052 * -554915259, (byte) 8);
	}

	@OriginalMember(owner = "client!ary", name = "w", descriptor = "(Lclient!kr;)V", line = 157)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28210(this.anInt3053 * -1090028197, this.anInt3050 * -574487113, this.anInt3051 * 1375481601, this.anInt3052 * -554915259, (byte) -102);
	}

	@OriginalMember(owner = "client!ary", name = "f", descriptor = "(Lclient!kr;)V", line = 157)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28210(this.anInt3053 * -1090028197, this.anInt3050 * -574487113, this.anInt3051 * 1375481601, this.anInt3052 * -554915259, (byte) -54);
	}
}
