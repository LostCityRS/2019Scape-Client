package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
final class Class367 implements Interface21 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(IB)Lclient!alc;", line = 22)
	public static Class154_Sub1 method27959(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return Class632.aBoolean851 && arg0 >= Class607.anInt5560 * 1855382415 && arg0 <= Class361.anInt4571 * 977343673 ? Class632.aClass154_Sub1Array2[arg0 - Class607.anInt5560 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(Ljava/lang/String;B)V", line = 30)
	public static void method27960(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		Class227.method25612(0, 0, "", "", "", arg0, null, -1923908417);
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(Lclient!akl;B)[I", line = 250)
	static int[] method27961(@OriginalArg(0) ClientMessage arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Packet local4 = new Packet(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.p1(10, (byte) -16);
		local4.p4(local7[0], (byte) -61);
		local4.p4(local7[1], (byte) 95);
		local4.p4(local7[2], (byte) 21);
		local4.p4(local7[3], (byte) -2);
		for (local9 = 0; local9 < 10; local9++) {
			local4.p4((int) (Math.random() * 9.9999999E7D), (byte) -16);
		}
		local4.p2((int) (Math.random() * 9.9999999E7D), 2130714535);
		local4.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -67);
		arg0.packet.pdata(local4.data, 0, local4.pos * 212851357, 2026842986);
		return local7;
	}

	@OriginalMember(owner = "client!js", name = "w", descriptor = "(Lclient!qe;II)Lclient!ec;", line = 526)
	@Override
	public Class108 method27954(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).get(arg1, -2012268201);
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27952(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).get(arg1, -226156357);
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27955(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).get(arg1, 1871499791);
	}

	@OriginalMember(owner = "client!js", name = "t", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27956(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).get(arg1, 1419419634);
	}

	@OriginalMember(owner = "client!js", name = "ag", descriptor = "(I)Lclient!kh;", line = 530)
	@Override
	public Class379 method27958(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.get(arg0, 835613564);
	}

	@OriginalMember(owner = "client!js", name = "ae", descriptor = "(I)Lclient!kh;", line = 530)
	@Override
	public Class379 method27957(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.get(arg0, -165770305);
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "(IB)Lclient!kh;", line = 530)
	@Override
	public Class379 method27953(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Class379) Class30.aClass32_Sub16_1.get(arg0, 746126493);
	}
}
