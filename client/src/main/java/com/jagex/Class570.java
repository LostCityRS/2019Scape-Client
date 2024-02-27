package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class570 {

	@OriginalMember(owner = "client!th", name = "ri", descriptor = "I")
	static int anInt5558;

	// $FF: synthetic field
	@OriginalMember(owner = "client!th", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 aClass146_Sub2_1;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!ts;")
	Class580 aClass580_1;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "[B")
	byte[] aByteArray101;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[B")
	byte[] aByteArray102;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	int anInt5554;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "F")
	final float aFloat342;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	final int anInt5553;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	final int anInt5556;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	int anInt5552;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	int anInt5557;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	int anInt5555;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "(I)I")
	public static int method31501(@OriginalArg(0) int arg0) {
		if (Class625.aBoolean857) {
			Class572.method31514(Class694.aClass104_14, -2122677173);
			return Class166_Sub13.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!th", name = "st", descriptor = "(Lclient!yf;I)V")
	static void method31502(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4042 * 1553054515 == 1 ? local11.anInt4078 * 371778301 : -1;
	}

	@OriginalMember(owner = "client!th", name = "ae", descriptor = "(I)Z")
	public static boolean method31503(@OriginalArg(0) int arg0) {
		return Class625.aBoolean858;
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!aiz;Lclient!ts;IFIIZZ)V")
	Class570(@OriginalArg(0) Class146_Sub2 arg0, @OriginalArg(1) Class580 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.aClass146_Sub2_1 = arg0;
		this.aClass580_1 = arg1;
		this.aByteArray101 = new byte[arg2];
		this.aByteArray102 = new byte[arg4 / 8];
		this.anInt5554 = this.aByteArray101.length * -1185466457;
		this.aFloat342 = arg3;
		this.anInt5553 = arg4 * 1767793001;
		this.anInt5556 = arg5 * 501824729;
		this.anInt5552 = 0;
		this.anInt5557 = 0;
		this.anInt5555 = 0;
	}

	@OriginalMember(owner = "client!th", name = "k", descriptor = "()I")
	int method31494() {
		return this.anInt5554 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "([BIIB)V")
	void method31495(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg1 + arg2) {
			this.aByteArray101[this.anInt5552 * 874858063] = arg0[local1];
			this.aByteArray101[this.anInt5552 * 874858063 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5552 += 1606426974;
			this.anInt5552 = this.anInt5552 * 874858063 % this.aByteArray101.length * 803213487;
			this.anInt5554 -= 1924034382;
		}
	}

	@OriginalMember(owner = "client!th", name = "w", descriptor = "()I")
	int method31496() {
		return this.anInt5554 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "n", descriptor = "(I)I")
	int method31497(@OriginalArg(0) int arg0) {
		return this.anInt5554 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "()I")
	int method31498() {
		return this.anInt5554 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "m", descriptor = "()I")
	int method31499() {
		return this.anInt5554 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "l", descriptor = "()I")
	int method31500() {
		return this.anInt5554 * 46530583;
	}
}
