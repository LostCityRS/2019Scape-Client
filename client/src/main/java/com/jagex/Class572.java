package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class572 {

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Lclient!uc;")
	public Class590 aClass590_1;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Lclient!tk;")
	public Class572 aClass572_1;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Lclient!asw;")
	public Class132_Sub1_Sub2 aClass132_Sub1_Sub2_1;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Lclient!asw;")
	public Class132_Sub1_Sub2 aClass132_Sub1_Sub2_2;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!asm;")
	public Class132_Sub1_Sub3 aClass132_Sub1_Sub3_1;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "S")
	short aShort175;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Lclient!ast;")
	Class132_Sub1_Sub5 aClass132_Sub1_Sub5_1;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "S")
	short aShort176;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "S")
	short aShort177;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!asv;")
	public Class132_Sub1_Sub4 aClass132_Sub1_Sub4_1;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "S")
	short aShort178;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "Lclient!asm;")
	public Class132_Sub1_Sub3 aClass132_Sub1_Sub3_2;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "B")
	public byte aByte163;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "(Lclient!dh;I)I")
	public static int method31514(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		Class312.method27015(-1739939257);
		return Class166_Sub13.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!tk", name = "xi", descriptor = "(Lclient!yf;I)V")
	static void method31515(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13.anInt1611 * 1802884841;
	}

	@OriginalMember(owner = "client!tk", name = "kv", descriptor = "(Lclient!hf;III)V")
	static void method31516(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class327 local4 = arg0.method26971(Class694.aClass104_14, (byte) 24);
		if (local4 == null) {
			return;
		}
		Class694.aClass104_14.method20479(arg1, arg2, arg1 + arg0.anInt4022 * 1215292027, arg0.anInt4023 * -1490598249 + arg2);
		if (Class172.anInt3177 * 910154737 >= 3) {
			Class694.aClass104_14.method20517(-16777216, local4.aClass96_1, arg1, arg2);
			return;
		}
		@Pc(42) int local42;
		if (Class429.anInt4942 * -1453926679 == 3) {
			local42 = (int) -((double) Class65.aClass123_Sub1_2.method8962((byte) -110) * 2607.5945876176133D);
		} else {
			local42 = (int) -client.aFloat253;
		}
		local42 = local42 + client.anInt3477 * 1580280690 & 0x3FFF;
		local42 <<= 0x2;
		Class153.aClass100_18.method18197((float) arg1 + (float) (arg0.anInt4022 * 1215292027) / 2.0F, (float) (arg0.anInt4023 * -1490598249) / 2.0F + (float) arg2, 4226, local42, local4.aClass96_1, arg1, arg2);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I)V")
	public Class572(@OriginalArg(0) int arg0) {
		this.aByte163 = (byte) arg0;
	}
}
