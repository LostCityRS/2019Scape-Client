package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public class Class346 {

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Ljava/lang/String;")
	final String aString181;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	final int anInt4192;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	final int anInt4193;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(II)Ljava/lang/String;", line = 18)
	public static String method27565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 134)
	Class346(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString181 = arg0;
		this.anInt4192 = arg1 * -2059066759;
		this.anInt4193 = arg2 * -1716410057;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(Lclient!uh;IILclient!yf;I)V", line = 312)
	static void method27566(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class681 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class93_Sub1_Sub13 local5 = Class623.method32147(arg0, arg1, arg2, (short) -2455);
		if (local5 == null) {
			Class624.method32157((byte) -101);
			return;
		}
		arg3.anIntArray517 = new int[local5.anInt3065 * 341680345];
		arg3.anObjectArray44 = new Object[local5.anInt3064 * -1520226159];
		if (Class155.aClass155_62 == local5.aClass155_70 || Class155.aClass155_54 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_53) {
			arg3.anIntArray517[0] = arg1;
			arg3.anIntArray517[1] = Class82.aClass153_1.method14070(-793826658);
			arg3.anIntArray517[2] = Class82.aClass153_1.method14075(644992294);
		} else if (Class155.aClass155_57 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_48 || Class155.aClass155_56 == local5.aClass155_70 || local5.aClass155_70 == Class155.aClass155_52 || Class155.aClass155_51 == local5.aClass155_70) {
			arg3.anIntArray517[0] = arg1;
		} else if (Class155.aClass155_50 == local5.aClass155_70) {
			arg3.anIntArray517[0] = arg3.anInt5893 * -432601107;
		}
		Class91.method1707(local5, 500000, arg3, 634588949);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lclient!alw;", line = 893)
	static Packet startRsaPacket(@OriginalArg(0) byte arg0) {
		@Pc(4) Packet local4 = new Packet(518);
		Class411.currentIsaacKey = new int[4];
		Class411.currentIsaacKey[0] = Class110_Sub9.secureRandom.nextInt();
		Class411.currentIsaacKey[1] = Class110_Sub9.secureRandom.nextInt();
		Class411.currentIsaacKey[2] = Class110_Sub9.secureRandom.nextInt();
		Class411.currentIsaacKey[3] = Class110_Sub9.secureRandom.nextInt();
		local4.p1(10, (byte) -6);
		local4.p4(Class411.currentIsaacKey[0], (byte) 38);
		local4.p4(Class411.currentIsaacKey[1], (byte) -73);
		local4.p4(Class411.currentIsaacKey[2], (byte) -27);
		local4.p4(Class411.currentIsaacKey[3], (byte) 35);
		local4.p8(Class411.aLong269 * 5489047686998946493L);
		if (client.state * -849002901 == 14) {
			local4.p4(Class411.anIntArray442[0], (byte) -22);
			local4.p4(Class411.anIntArray442[1], (byte) -15);
			local4.p4(Class411.anIntArray442[2], (byte) 54);
			local4.p4(Class411.anIntArray442[3], (byte) 22);
		}
		Class411.anIntArray442 = Class411.currentIsaacKey;
		return local4;
	}

	@OriginalMember(owner = "client!iq", name = "eo", descriptor = "(Lclient!yf;I)V", line = 5684)
	static final void method27568(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class81.method1378(local11, local14, arg0, 759834328);
	}

	@OriginalMember(owner = "client!iq", name = "gm", descriptor = "(Lclient!yf;I)V", line = 6169)
	static final void method27569(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class365.method27918(local11, local14, arg0, 2130983358);
	}

	@OriginalMember(owner = "client!iq", name = "wj", descriptor = "(Lclient!yf;I)V", line = 8965)
	static final void method27570(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		Class274.aClass258_1.method26098(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26450(-1849785549), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local53, local33, -1020781077);
	}

	@OriginalMember(owner = "client!iq", name = "xt", descriptor = "(Lclient!yf;I)V", line = 9242)
	static final void method27571(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3453 * 1752864911;
	}
}
