package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rz")
public class Class542 {

	@OriginalMember(owner = "client!rz", name = "fq", descriptor = "Lclient!py;")
	public static Class497 aClass497_129;

	@OriginalMember(owner = "client!rz", name = "hs", descriptor = "Lclient!aoc;")
	public static Class32_Sub2 aClass32_Sub2_3;

	@OriginalMember(owner = "client!rz", name = "<init>", descriptor = "()V", line = 10)
	Class542() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rz", name = "k", descriptor = "(Z)V", line = 15)
	public static void method30931(@OriginalArg(0) boolean arg0) {
		Class274.aClass258_1.method26040((short) -13558);
		if (!Class106.method7570(client.state * -849002901, -447754634)) {
			return;
		}
		@Pc(11) Class175[] local11 = client.aClass175Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class175 local21 = local11[local13];
			local21.anInt3300 += -1073519993;
			if (local21.anInt3300 * -1270889673 < 50 && !arg0) {
				return;
			}
			local21.anInt3300 = 0;
			if (!local21.aBoolean564 && local21.getStream((byte) 32) != null) {
				@Pc(52) ClientMessage local52 = Class102.createGameMessage(ClientProt.aClientProt_105, local21.clientIsaac, (byte) 58);
				local21.send(local52, -2105041718);
				try {
					local21.flush((byte) 49);
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean564 = true;
				}
			}
		}
		Class274.aClass258_1.method26040((short) -17556);
	}

	@OriginalMember(owner = "client!rz", name = "n", descriptor = "(Z)V", line = 15)
	public static void method30932(@OriginalArg(0) boolean arg0) {
		Class274.aClass258_1.method26040((short) 3189);
		if (!Class106.method7570(client.state * -849002901, -382494755)) {
			return;
		}
		@Pc(11) Class175[] local11 = client.aClass175Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class175 local21 = local11[local13];
			local21.anInt3300 += -1073519993;
			if (local21.anInt3300 * -1270889673 < 50 && !arg0) {
				return;
			}
			local21.anInt3300 = 0;
			if (!local21.aBoolean564 && local21.getStream((byte) 39) != null) {
				@Pc(52) ClientMessage local52 = Class102.createGameMessage(ClientProt.aClientProt_105, local21.clientIsaac, (byte) 13);
				local21.send(local52, -1864049693);
				try {
					local21.flush((byte) 113);
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean564 = true;
				}
			}
		}
		Class274.aClass258_1.method26040((short) -5435);
	}

	@OriginalMember(owner = "client!rz", name = "m", descriptor = "(Z)V", line = 15)
	public static void method30933(@OriginalArg(0) boolean arg0) {
		Class274.aClass258_1.method26040((short) 1631);
		if (!Class106.method7570(client.state * -849002901, -1055243539)) {
			return;
		}
		@Pc(11) Class175[] local11 = client.aClass175Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class175 local21 = local11[local13];
			local21.anInt3300 += -1073519993;
			if (local21.anInt3300 * -1270889673 < 50 && !arg0) {
				return;
			}
			local21.anInt3300 = 0;
			if (!local21.aBoolean564 && local21.getStream((byte) 2) != null) {
				@Pc(52) ClientMessage local52 = Class102.createGameMessage(ClientProt.aClientProt_105, local21.clientIsaac, (byte) 112);
				local21.send(local52, -1994753786);
				try {
					local21.flush((byte) 118);
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean564 = true;
				}
			}
		}
		Class274.aClass258_1.method26040((short) -523);
	}

	@OriginalMember(owner = "client!rz", name = "n", descriptor = "(I)V", line = 58)
	public static void method30934(@OriginalArg(0) int arg0) {
		Class563.method31193();
	}

	@OriginalMember(owner = "client!rz", name = "h", descriptor = "(IB)V", line = 147)
	public static void method30935(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(13, (long) arg0);
		local4.method21885(2145665316);
	}

	@OriginalMember(owner = "client!rz", name = "cn", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5334)
	static final void method30936(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		arg0.anInt3983 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * -1577493979;
		arg0.anInt3984 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * 1994663095;
		Class354.method27694(arg0, -1174743804);
		Class237.method25775(arg1, arg0, (byte) 92);
		if (arg0.anInt3971 * -158526639 == 0) {
			Class548.method31015(arg1, arg0, false, 663954921);
		}
	}

	@OriginalMember(owner = "client!rz", name = "yn", descriptor = "(Lclient!yf;B)V", line = 9268)
	static final void method30937(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.userMember ? 1 : 0;
	}
}
