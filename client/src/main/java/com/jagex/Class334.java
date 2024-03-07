package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public class Class334 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([I[S)V", line = 7)
	public Class334(@OriginalArg(0) int[] arg0, @OriginalArg(1) short[] arg1) {
		this.anIntArray409 = arg0;
		this.aShortArray115 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!if;)V", line = 12)
	public Class334(@OriginalArg(0) Class336 arg0) {
		this.anIntArray409 = new int[8];
		this.aShortArray115 = new short[8];
		@Pc(11) int local11 = 0;
		if (arg0.anIntArray413 != null && arg0.aShortArray121 != null) {
			local11 = arg0.anIntArray413.length;
			System.arraycopy(arg0.anIntArray413, 0, this.anIntArray409, 0, local11);
			System.arraycopy(arg0.aShortArray121, 0, this.aShortArray115, 0, local11);
		}
		for (@Pc(39) int local39 = local11; local39 < 8; local39++) {
			this.anIntArray409[local39] = -1;
			this.aShortArray115[local39] = -1;
		}
	}

	@OriginalMember(owner = "client!id", name = "w", descriptor = "(IB)Z", line = 51)
	static final boolean method27401(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!id", name = "ci", descriptor = "(Lclient!aop;[BIIIILclient!xe;Lclient!xe;I)I", line = 335)
	public static final int method27402(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class656 arg6, @OriginalArg(7) Class656 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(6) Packet local6 = new Packet(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.gExtended1or2(2075753934);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(36) Class629 local36;
				@Pc(62) int local62;
				@Pc(68) Class610 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(27) int local27;
									do {
										local27 = local6.gSmart1or2((byte) -14);
										if (local27 == 0) {
											continue label73;
										}
										local36 = new Class629(local6);
									} while (local23);
									local21 += local27 - 1;
									@Pc(48) int local48 = local21 & 0x3F;
									@Pc(54) int local54 = local21 >> 6 & 0x3F;
									local58 = local54 + arg2;
									local62 = arg3 + local48;
									local68 = (Class610) arg0.method18261(local8, -540558831);
									if ((local36.anInt5708 * -1626288991 & 0x1) == 0) {
										local81 = local68.anInt5608 * 427800467;
										local86 = local68.anInt5603 * -774442965;
									} else {
										local81 = local68.anInt5603 * -774442965;
										local86 = local68.anInt5608 * 427800467;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local81 + local58 < 0);
					} while (local86 + local62 < 0);
				} while (local36.anInt5709 * 1175627307 == Class615.aClass615_24.anInt5628 * 948246811 && Class51.options.aClass166_Sub3_1.method15405(1402098336) == 0 && local68.anInt5592 * 1067969079 == 0 && local68.anInt5591 * -297318857 != 1 && !local68.aBoolean835);
				if (!local68.method31981(arg7, (short) 9804)) {
					arg6.anInt5810 = local8 * -33749981;
					local1++;
				}
				local23 = true;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "js", descriptor = "(IIILjava/lang/String;S)V", line = 10208)
	public static void method27403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) short arg4) {
		@Pc(4) Class312 local4 = Class124_Sub2.method9308(arg1, arg2, (byte) -111);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray26 != null) {
			@Pc(15) Class93_Sub39 local15 = new Class93_Sub39();
			local15.aClass312_1 = local4;
			local15.anInt1996 = arg0 * 1997826807;
			local15.aString50 = arg3;
			local15.anObjectArray4 = local4.anObjectArray26;
			Class211.method25429(local15, 566128529);
		}
		if (!client.method25364(local4).method13622(arg0 - 1, -244589856)) {
			return;
		}
		@Pc(45) Class175 local45 = Class330.method27371(-1502628854);
		if (client.state * -849002901 != 13 && client.state * -849002901 != 18 && client.state * -849002901 != 0) {
			return;
		}
		if (local4.aString167 == null || local4.aClass310_7 == null) {
			Class493.method30012(local45, local4, arg0, arg1, arg2, 1999052883);
			return;
		}
		@Pc(73) ClientMessage local73 = Class102.createGameMessage(ClientProt.aClientProt_106, local45.clientIsaac, (byte) 71);
		local73.packet.p1(Packet.pjstrlen(local4.aString167, -1710534944) + 7 + 1, (byte) -1);
		local73.packet.pjstr(local4.aString167, -905461201);
		local73.packet.p2_alt1(arg2, (byte) 59);
		local73.packet.p1_alt2(arg0, -1733657513);
		local73.packet.p1_alt3(local4.aClass310_7.getId(), (byte) -109);
		local73.packet.p4_alt2(arg1, 844689790);
		local45.send(local73, -2068554359);
	}
}
