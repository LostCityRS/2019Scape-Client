package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public class Class335 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ie;")
	static final Class335 aClass335_2 = new Class335(0);

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!ie;")
	static final Class335 aClass335_1 = new Class335(1);

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	final int anInt4150;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 8)
	Class335(@OriginalArg(0) int arg0) {
		this.anInt4150 = arg0 * -953533815;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "([BI)[B", line = 9)
	public static byte[] method27404(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "ae", descriptor = "(Lclient!yf;B)V", line = 4881)
	static final void method27405(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		if (arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] != arg0.anIntArray519[arg0.anInt5891 * -1497248091]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!ie", name = "jx", descriptor = "(Lclient!yf;I)V", line = 6713)
	static final void method27406(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -7933309);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class329.method27349(local16, local22, arg0, 1825123840);
	}

	@OriginalMember(owner = "client!ie", name = "np", descriptor = "(Lclient!yf;B)V", line = 7372)
	static final void method27407(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class370.method27998(local11, local14, arg0, (byte) -8);
	}

	@OriginalMember(owner = "client!ie", name = "jn", descriptor = "(Ljava/lang/String;I)V", line = 10106)
	public static void method27408(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (!client.aBoolean625 || (Class253.anInt3851 * 735260021 & 0x18) == 0) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(14) int local14 = Class174.anInt3293 * -1081967415;
		@Pc(16) int[] local16 = Class174.anIntArray278;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(27) Class132_Sub1_Sub1_Sub1_Sub2 local27 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local16[local18]];
			if (local27.name2 != null && local27.name2.equalsIgnoreCase(arg0) && (local27 == Class520.selfPlayer && (Class253.anInt3851 * 735260021 & 0x10) != 0 || (Class253.anInt3851 * 735260021 & 0x8) != 0)) {
				@Pc(58) ClientMessage local58 = Class102.createGameMessage(ClientProt.aClientProt_71, client.aClass175_2.clientIsaac, (byte) 42);
				local58.packet.p2(client.anInt3523 * 1573685689, 2133965049);
				local58.packet.p1_alt1(0, -1591808004);
				local58.packet.p2_alt1(client.anInt3524 * -239149331, (byte) -49);
				local58.packet.p2_alt3(local16[local18], (short) 255);
				local58.packet.p4_alt2(Class148.anInt1394 * -278883695, 844689790);
				client.aClass175_2.send(local58, -2145186804);
				Class498.method30135(local27.anIntArray240[0], local27.anIntArray239[0], -2062153340);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Class103.method2809(4, Class74.aClass74_127.method1259(Class106.lang, (byte) -9) + arg0, -1963408433);
		}
		if (client.aBoolean625) {
			Class624.method32159(682408472);
		}
	}

	@OriginalMember(owner = "client!ie", name = "azq", descriptor = "(Lclient!yf;I)V", line = 14185)
	static final void method27409(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub26_1.method15910((short) -21412) ? 1 : 0;
	}
}
