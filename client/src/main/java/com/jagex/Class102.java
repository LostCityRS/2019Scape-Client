package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public abstract class Class102 {

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_3;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 4)
	Class102() {
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(II)Lclient!iu;", line = 17)
	public static Class349 method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class349.aClass349_7.anInt4200 * 1424636537) {
			return Class349.aClass349_7;
		} else if (arg0 == Class349.aClass349_3.anInt4200 * 1424636537) {
			return Class349.aClass349_3;
		} else if (arg0 == Class349.aClass349_2.anInt4200 * 1424636537) {
			return Class349.aClass349_2;
		} else if (Class349.aClass349_4.anInt4200 * 1424636537 == arg0) {
			return Class349.aClass349_4;
		} else if (Class349.aClass349_5.anInt4200 * 1424636537 == arg0) {
			return Class349.aClass349_5;
		} else if (arg0 == Class349.aClass349_6.anInt4200 * 1424636537) {
			return Class349.aClass349_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "(Lclient!nr;Lclient!aav;B)Lclient!akl;", line = 24)
	public static Class93_Sub22 method2588(@OriginalArg(0) Class446 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) Class93_Sub22 local2 = Class527.method30386(1355424345);
		local2.aClass446_1 = arg0;
		local2.anInt1570 = arg0.anInt4952 * -84230039;
		if (local2.anInt1570 * -702266491 == -1) {
			local2.aPacketBit_1 = new PacketBit(260);
		} else if (local2.anInt1570 * -702266491 == -2) {
			local2.aPacketBit_1 = new PacketBit(10000);
		} else if (local2.anInt1570 * -702266491 <= 18) {
			local2.aPacketBit_1 = new PacketBit(20);
		} else if (local2.anInt1570 * -702266491 <= 98) {
			local2.aPacketBit_1 = new PacketBit(100);
		} else {
			local2.aPacketBit_1 = new PacketBit(260);
		}
		local2.aPacketBit_1.setRandom(arg1, (byte) -28);
		local2.aPacketBit_1.p1opcode(local2.aClass446_1.anInt4951 * -1222765451, -1213648128);
		local2.anInt1569 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cj", name = "ud", descriptor = "(Lclient!yf;B)V", line = 8661)
	static final void method2589(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 2013134692);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3995 * -1566573331;
	}

	@OriginalMember(owner = "client!cj", name = "afa", descriptor = "(Lclient!yf;I)V", line = 10514)
	static final void method2590(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Integer.toString(local12);
	}

	@OriginalMember(owner = "client!cj", name = "ll", descriptor = "(Ljava/lang/String;I)V", line = 12049)
	public static final void method2591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(7) Class175 local7 = Class330.method27371(-1580060079);
		@Pc(13) Class93_Sub22 local13 = method2588(Class446.aClass446_94, local7.aClass24_2, (byte) 29);
		local13.aPacketBit_1.p1(Packet.pjstrlen(arg0, -1857161175), (byte) -28);
		local13.aPacketBit_1.pjstr(arg0, 932008120);
		local7.method24356(local13, -2047560182);
	}

	@OriginalMember(owner = "client!cj", name = "bcd", descriptor = "(Lclient!yf;I)V", line = 14504)
	static final void method2592(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3433 * -914512487 == arg0.aClass132_Sub1_Sub1_Sub1_4.method20043(785257419) ? 1 : 0;
	}
}
