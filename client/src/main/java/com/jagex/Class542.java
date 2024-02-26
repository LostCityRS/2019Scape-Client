package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rz")
public final class Class542 {

	@OriginalMember(owner = "client!rz", name = "ph", descriptor = "I")
	static int anInt5121;

	@OriginalMember(owner = "client!rz", name = "t", descriptor = "Lclient!rr;")
	Class536 aClass536_11;

	@OriginalMember(owner = "client!rz", name = "f", descriptor = "Lclient!asa;")
	PacketBit aPacketBit_3;

	@OriginalMember(owner = "client!rz", name = "nn", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31171(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1688269221) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 809783763);
	}

	@OriginalMember(owner = "client!rz", name = "wy", descriptor = "(Lclient!yp;I)V")
	static void method31172(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class430.method29088(local13, local23, local33, false, -1648742018);
	}

	@OriginalMember(owner = "client!rz", name = "ej", descriptor = "(B)V")
	public static void method31173(@OriginalArg(0) byte arg0) {
		@Pc(7) String local7 = Class18.aString3 == null ? Class503.method30453(2042752323) : Class18.aString3;
		Class654.method33171(local7, false, client.aBoolean734, -1405323006);
	}

	@OriginalMember(owner = "client!rz", name = "tg", descriptor = "(Lclient!yp;I)V")
	static void method31174(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class603.method32131(local11, arg0, (byte) 58);
	}

	@OriginalMember(owner = "client!rz", name = "<init>", descriptor = "(Lclient!rr;Lclient!asa;)V")
	public Class542(@OriginalArg(0) Class536 arg0, @OriginalArg(1) PacketBit arg1) {
		this.aClass536_11 = arg0;
		this.aPacketBit_3 = arg1;
	}
}
