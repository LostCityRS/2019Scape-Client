package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public class Class296 implements Interface26 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "[Lclient!xy;")
	static Class674[] aClass674Array1;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	static int anInt3919;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gp", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	final int anInt3918;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!gy;")
	final Class304 aClass304_1;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "(Lclient!yf;S)V", line = 32)
	static void method26607(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class570.method31313(-885583241);
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(B)V", line = 137)
	static final void method26608(@OriginalArg(0) byte arg0) {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method428((byte) 18); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method442(1718576593)) {
			Class249.method25939(local4, false, 1015863306);
		}
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method428((byte) 77); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method442(1906587851)) {
			Class249.method25939(local4, true, -171214752);
		}
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(Lclient!vt;Lclient!akm;I)Z", line = 161)
	static boolean method26609(@OriginalArg(0) Interface67 arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2) {
		return arg0 != null && arg0.method32253(arg1, client.anInterface66Array1, client.anInt3450 * -938319179, Class112_Sub2_Sub2.aClass158_2, -44309241);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 278)
	Class296(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.this$0 = arg0;
		this.anInt3918 = arg1.method22472(-1434290800) * -1803100599;
		this.aClass304_1 = new Class304(arg1, false, false, arg0.anInterface27_2);
	}

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "(Lclient!gq;)V", line = 284)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26693(this.anInt3918 * 1195340793, this.aClass304_1, -424040244);
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(Lclient!gq;B)V", line = 284)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26693(this.anInt3918 * 1195340793, this.aClass304_1, 1282928100);
	}

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "(Lclient!gq;)V", line = 284)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26693(this.anInt3918 * 1195340793, this.aClass304_1, 485020956);
	}

	@OriginalMember(owner = "client!gp", name = "bfu", descriptor = "(Lclient!yf;B)V", line = 15129)
	static final void method26610(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
