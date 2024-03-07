package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afv")
public class Class108_Sub2 extends Class108 {

	@OriginalMember(owner = "client!afv", name = "dl", descriptor = "Ljava/lang/String;")
	public static String mapOwner;

	@OriginalMember(owner = "client!afv", name = "<init>", descriptor = "(Lclient!qe;I)V", line = 9)
	Class108_Sub2(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!afv", name = "u", descriptor = "(Lclient!alw;IS)V", line = 12)
	@Override
	void method7448(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
	}

	@OriginalMember(owner = "client!afv", name = "c", descriptor = "(Lclient!alw;I)V", line = 12)
	@Override
	void method7451(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!afv", name = "d", descriptor = "(Lclient!alw;I)V", line = 12)
	@Override
	void method7449(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!afv", name = "r", descriptor = "(Lclient!alw;I)V", line = 12)
	@Override
	void method7450(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "()V", line = 13)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!afv", name = "n", descriptor = "(I)V", line = 13)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afv", name = "xy", descriptor = "(Lclient!yf;I)V", line = 9118)
	static final void method7452(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.selfPlayer.aClass523_7.method30365(1351361500);
	}
}
