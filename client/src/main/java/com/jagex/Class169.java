package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public class Class169 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	static final int anInt2589 = 100000;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	static final int anInt2590 = 50000;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "F")
	static final float aFloat165 = 1.3F;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	static final int anInt2591 = 100;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	static final int anInt2592 = 500;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	static final int anInt2593 = 1003;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "J")
	static final long aLong113 = 64425238954L;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "J")
	static final long aLong114 = 60129613779L;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	static final int anInt2594 = 10000;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "(Lclient!tj;Lclient!tj;B)V", line = 30)
	public static void method18313(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969(1402614617);
		}
		arg0.aClass93_228 = arg1.aClass93_228;
		arg0.aClass93_227 = arg1;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 33)
	Class169() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()Lclient!ali;", line = 38)
	static Class93_Sub36 method18314() {
		@Pc(1) Class38 local1 = null;
		@Pc(7) Class93_Sub36 local7 = new Class93_Sub36(client.aClass702_4, 0);
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, false, 199047110);
			@Pc(20) byte[] local20 = new byte[(int) local1.method732(2046955830)];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method734(local20, local22, local20.length - local22, (byte) 37);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class93_Sub36(new Packet(local20), client.aClass702_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method728(-1998474334);
			}
		} catch (@Pc(67) Exception local67) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "()V", line = 60)
	public static void method18315() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, true, 199047110);
			@Pc(12) Packet local12 = Class51.aClass93_Sub36_1.method14361(2106850464);
			local1.method725(local12.data, 0, local12.pos * 212851357, -1115382209);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method728(-135953096);
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "()V", line = 60)
	public static void method18316() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, true, 199047110);
			@Pc(12) Packet local12 = Class51.aClass93_Sub36_1.method14361(876183852);
			local1.method725(local12.data, 0, local12.pos * 212851357, -225669763);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method728(-1305246347);
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "()I", line = 74)
	public static int method18317() {
		@Pc(2) Class54_Sub1 local2 = Class319.method27218((byte) -4);
		Class129.method21470(local2, (byte) 29);
		return local2.method14854(308727806);
	}

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "()I", line = 74)
	public static int method18318() {
		@Pc(2) Class54_Sub1 local2 = Class319.method27218((byte) 0);
		Class129.method21470(local2, (byte) -20);
		return local2.method14854(747517152);
	}

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "()Lclient!alq;", line = 80)
	static Class54_Sub1 method18319() {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class339.aString179.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (aBoolean389) {
			local3.method14875(16, 1215362973);
			local5 = false;
		}
		if (aBoolean390) {
			local3.method14875(32, 1473623207);
			local7 = false;
		}
		if (aBoolean388) {
			local3.method14875(16384, 152990893);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class155_Sub2.method15310(local3, -2072011519);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 3, (byte) 125);
				Class106_Sub1.method5135(1094868900);
				local61 = Class78.method1316(3, 1000, 1323350560);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 43) == 3) {
					local3.method14875(4, 1986495017);
					@Pc(91) Class219 local91 = Class694.aClass104_14.method20644();
					@Pc(98) long local98 = local91.aLong247 * -2731861378298283411L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3623 * -348611355) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method14875(512, 2135197929);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method14875(256, 574538838);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method14875(4096, 1416971662);
			}
		}
		if (local9) {
			try {
				Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 5, (byte) 96);
				Class106_Sub1.method5135(141915366);
				local63 = Class78.method1316(5, 1000, 1323350560);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 67) == 5) {
					local3.method14875(8192, -1067068611);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method14875(32768, 1830543260);
			}
		}
		if (local5) {
			try {
				Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 4, (byte) 95);
				Class106_Sub1.method5135(-2122474985);
				local59 = Class78.method1316(1, 1000, 1323350560);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 113) == 1) {
					local3.method14875(2, 1105815195);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method14875(2048, -1277001745);
			}
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 0, (byte) 126);
		if (local59 == -1 && local61 == -1) {
			Class155_Sub2.method15310(local3, 1006818614);
			return local3;
		}
		local3.method14883(3, local61, (short) 832);
		local3.method14883(1, local59, (short) 832);
		local3.method14883(5, local63, (short) 832);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class251.method25970(local3, 1, local61 == -1 ? local59 : local61, (byte) 55);
		} else {
			Class251.method25970(local3, 3, local59 == -1 ? local61 : local59, (byte) 73);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18320(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14879(0, 1494441756);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706(-1008112662);
			if (local11 <= 100) {
				Class642.method32518((byte) 54);
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31636((byte) 34);
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26155(-570154583);
				local18 = 2;
			} else {
				Class238.method25797(true, -943800414);
				local18 = 1;
			}
			arg0.method14883(0, local11, (short) 832);
		} else {
			Class238.method25797(true, -1623054508);
			local18 = 1;
			arg0.method14875(64, -6505951);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 71) == 0) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, -417794517);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 46);
			Class543.method30945(0, false, 1945646779);
		}
		Class106_Sub1.method5135(366405387);
		arg0.method14869(local18, -1944056132);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18321(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14879(0, 1494441756);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706(1957663563);
			if (local11 <= 100) {
				Class642.method32518((byte) -50);
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31636((byte) 76);
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26155(-411933438);
				local18 = 2;
			} else {
				Class238.method25797(true, -774547826);
				local18 = 1;
			}
			arg0.method14883(0, local11, (short) 832);
		} else {
			Class238.method25797(true, 1277815337);
			local18 = 1;
			arg0.method14875(64, -725024006);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 29) == 0) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, -807771304);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 30);
			Class543.method30945(0, false, 1945646779);
		}
		Class106_Sub1.method5135(-1712804665);
		arg0.method14869(local18, 660908029);
	}

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18322(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14879(0, 1494441756);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706(-445079327);
			if (local11 <= 100) {
				Class642.method32518((byte) -50);
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31636((byte) 92);
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26155(-20454012);
				local18 = 2;
			} else {
				Class238.method25797(true, -570918334);
				local18 = 1;
			}
			arg0.method14883(0, local11, (short) 832);
		} else {
			Class238.method25797(true, -611492274);
			local18 = 1;
			arg0.method14875(64, 1438541591);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 28) == 0) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, 275946639);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 124);
			Class543.method30945(0, false, 1945646779);
		}
		Class106_Sub1.method5135(-1034457494);
		arg0.method14869(local18, 1055216165);
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18323(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14879(arg1, 1494441756);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32518((byte) 31);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31636((byte) 67);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26155(1975711562);
			local10 = 2;
		} else {
			Class238.method25797(true, -1166882318);
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 53) == arg1) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, -738188068);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1, (byte) 92);
			Class543.method30945(arg1, false, 1945646779);
		}
		Class106_Sub1.method5135(-48892377);
		arg0.method14869(local10, 1130211956);
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18324(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14879(arg1, 1494441756);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32518((byte) 49);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31636((byte) 39);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26155(1112199969);
			local10 = 2;
		} else {
			Class238.method25797(true, -1779845934);
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 65) == arg1) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, -663857174);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1, (byte) 48);
			Class543.method30945(arg1, false, 1945646779);
		}
		Class106_Sub1.method5135(-425224907);
		arg0.method14869(local10, -501409413);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18325(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14879(arg1, 1494441756);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32518((byte) 80);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31636((byte) 16);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26155(-828323732);
			local10 = 2;
		} else {
			Class238.method25797(true, 1767135782);
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 25) == arg1) {
			Class51.aClass93_Sub36_1.method14366(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, 2071765418);
		} else {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1, (byte) 22);
			Class543.method30945(arg1, false, 1945646779);
		}
		Class106_Sub1.method5135(-602986662);
		arg0.method14869(local10, -1202091038);
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "()V", line = 254)
	public static void method18326() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 101);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 79);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 115);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 108);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 81);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 119);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 75);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 100);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2, (byte) 20);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 45);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2, (byte) 77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 62);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 92);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2, (byte) 58);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 20);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 122);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 10);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 14);
		Class386.method28235((byte) -21);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0, (byte) 60);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4, (byte) 30);
		Class610.method32020(-1496518214);
		client.aClass532_1.method30494((byte) -51).method33015(847491979);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ae", descriptor = "()V", line = 254)
	public static void method18327() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 115);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 16);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 125);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 27);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 72);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 63);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 52);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 104);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2, (byte) 17);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 41);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2, (byte) 41);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 3);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 83);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 120);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2, (byte) 112);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 10);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 120);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 58);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 80);
		Class386.method28235((byte) -3);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0, (byte) 50);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4, (byte) 109);
		Class610.method32020(-2106707474);
		client.aClass532_1.method30494((byte) 40).method33015(381896827);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "()V", line = 254)
	public static void method18328() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 95);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 117);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 114);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 90);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 67);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 26);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 49);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 119);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2, (byte) 42);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 24);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2, (byte) 3);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 26);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 75);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2, (byte) 99);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 68);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 60);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 101);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 82);
		Class386.method28235((byte) 30);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0, (byte) 64);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4, (byte) 20);
		Class610.method32020(-983697334);
		client.aClass532_1.method30494((byte) 40).method33015(1231895900);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "()V", line = 254)
	public static void method18329() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 97);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 11);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 93);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 96);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 66);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 102);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 8);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2, (byte) 11);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 56);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2, (byte) 74);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 64);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 52);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 35);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2, (byte) 16);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 12);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 48);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 4);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 87);
		Class386.method28235((byte) 48);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0, (byte) 88);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4, (byte) 21);
		Class610.method32020(-367062092);
		client.aClass532_1.method30494((byte) 30).method33015(1243662839);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ag", descriptor = "()V", line = 283)
	public static void method18330() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 83);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 64);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 44);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 107);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 19);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 32);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 95);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 102);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1, (byte) 40);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 76);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 112);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 5);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 103);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 8);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1, (byte) 44);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 48);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 115);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 70);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 113);
		Class386.method28235((byte) 86);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1, (byte) 54);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3, (byte) 115);
		Class610.method32020(-1203947005);
		client.aClass532_1.method30494((byte) 37).method33015(-858860528);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ac", descriptor = "()V", line = 283)
	public static void method18331() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 46);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 25);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 15);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 113);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 22);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 29);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 112);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 122);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1, (byte) 9);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 75);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 11);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 87);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 105);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 120);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1, (byte) 92);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 84);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 18);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 108);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 25);
		Class386.method28235((byte) 17);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1, (byte) 51);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3, (byte) 99);
		Class610.method32020(-1812048586);
		client.aClass532_1.method30494((byte) -5).method33015(706661621);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "al", descriptor = "()V", line = 283)
	public static void method18332() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 28);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 64);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 62);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 46);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 122);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 29);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 51);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 39);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1, (byte) 79);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 20);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 84);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 98);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 51);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 13);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1, (byte) 10);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 106);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 108);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 20);
		Class386.method28235((byte) -98);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3, (byte) 62);
		Class610.method32020(-1989928603);
		client.aClass532_1.method30494((byte) -31).method33015(-1979533228);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ah", descriptor = "()V", line = 283)
	public static void method18333() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 45);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 101);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 97);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 72);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 83);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 101);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 58);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 76);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1, (byte) 116);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 107);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 94);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 49);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 123);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1, (byte) 32);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 82);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 18);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 4);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 102);
		Class386.method28235((byte) 28);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1, (byte) 72);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3, (byte) 115);
		Class610.method32020(-1364841280);
		client.aClass532_1.method30494((byte) 5).method33015(1706676287);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ai", descriptor = "()V", line = 312)
	public static void method18334() {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 48);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 58);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 25);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 51);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 49);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 20);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 24);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 9);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 6);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 29);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 57);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 61);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 9);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 63);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 40);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 55);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 38);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 123);
		Class386.method28235((byte) 19);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 28);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 2, (byte) 53);
		Class610.method32020(-384162029);
		client.aClass532_1.method30494((byte) 92).method33015(-259383979);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "as", descriptor = "(Z)V", line = 341)
	public static void method18335(@OriginalArg(0) boolean arg0) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 125);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0, (byte) 34);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 69);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0, (byte) 17);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 68);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 8);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 45);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 90);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 107);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 71);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 122);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 118);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 104);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 15);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 47);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 71);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 15);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 83);
		Class386.method28235((byte) -58);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 43);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1, (byte) 79);
		Class610.method32020(-702734884);
		client.aClass532_1.method30494((byte) -43).method33015(125699865);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "aw", descriptor = "(Z)V", line = 341)
	public static void method18336(@OriginalArg(0) boolean arg0) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 120);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 73);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0, (byte) 77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 52);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0, (byte) 70);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 12);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 85);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 64);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 116);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 75);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 92);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 94);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 82);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 125);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 107);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 69);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 55);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 51);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 55);
		Class386.method28235((byte) -77);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 50);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1, (byte) 53);
		Class610.method32020(-999864675);
		client.aClass532_1.method30494((byte) -12).method33015(-1525754238);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "at", descriptor = "(Z)V", line = 341)
	public static void method18337(@OriginalArg(0) boolean arg0) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 32);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 17);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0, (byte) 19);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 93);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0, (byte) 81);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 68);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 10);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 6);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 95);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 45);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 99);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 45);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 123);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 34);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 91);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 50);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 103);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 3);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 66);
		Class386.method28235((byte) 88);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 107);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1, (byte) 37);
		Class610.method32020(-1216164660);
		client.aClass532_1.method30494((byte) -36).method33015(1167573317);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ad", descriptor = "(Z)V", line = 341)
	public static void method18338(@OriginalArg(0) boolean arg0) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 122);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 85);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0, (byte) 110);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 65);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0, (byte) 46);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 96);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 115);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 98);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 87);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 70);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 47);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 80);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 71);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 90);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 44);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 126);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 38);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 95);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 120);
		Class386.method28235((byte) -84);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 29);
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1, (byte) 18);
		Class610.method32020(-1683952635);
		client.aClass532_1.method30494((byte) 10).method33015(-890913108);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "dx", descriptor = "(Lclient!dh;Lclient!aat;IIB)V", line = 347)
	static void method18339(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		Class93_Sub9.aClass22_20.method405(-2037259486);
		if (Class159_Sub1.aBoolean351) {
			return;
		}
		for (@Pc(10) Class93_Sub29 local10 = (Class93_Sub29) arg1.method428((byte) 100); local10 != null; local10 = (Class93_Sub29) arg1.method442(1326385532)) {
			@Pc(21) Class322 local21 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local10.anInt1603 * 1208139441, -1076351777);
			if (Class32_Sub11.method17037(local21, (byte) 76)) {
				@Pc(34) boolean local34 = Class300.method26720(arg0, local10, local21, arg2, arg3, (byte) 2);
				if (local34) {
					Class54.method14857(arg0, local10, local21, -1886145540);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "ed", descriptor = "(IIB)V", line = 708)
	static final void method18340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class159_Sub1.aFloat152 < Class159_Sub1.aFloat153) {
			Class159_Sub1.aFloat152 = (float) ((double) Class159_Sub1.aFloat152 + (double) Class159_Sub1.aFloat152 / 30.0D);
			if (Class159_Sub1.aFloat152 > Class159_Sub1.aFloat153) {
				Class159_Sub1.aFloat152 = Class159_Sub1.aFloat153;
			}
			Class358.method27776(-485993474);
			Class159_Sub1.anInt1935 = (int) Class159_Sub1.aFloat153 >> 1;
			Class159_Sub1.aByteArrayArrayArray10 = Class166_Sub6.method15472(Class159_Sub1.anInt1935, (byte) 0);
		} else if (Class159_Sub1.aFloat152 > Class159_Sub1.aFloat153) {
			Class159_Sub1.aFloat152 = (float) ((double) Class159_Sub1.aFloat152 - (double) Class159_Sub1.aFloat152 / 30.0D);
			if (Class159_Sub1.aFloat152 < Class159_Sub1.aFloat153) {
				Class159_Sub1.aFloat152 = Class159_Sub1.aFloat153;
			}
			Class358.method27776(-345268037);
			Class159_Sub1.anInt1935 = (int) Class159_Sub1.aFloat153 >> 1;
			Class159_Sub1.aByteArrayArrayArray10 = Class166_Sub6.method15472(Class159_Sub1.anInt1935, (byte) 0);
		}
		if (Class159_Sub1.anInt1956 * 2025914025 != -1 && Class159_Sub1.anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = Class159_Sub1.anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(Class159_Sub1.anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = Class159_Sub1.anInt1951 * 38948535 - Class159_Sub1.anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(Class159_Sub1.anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			Class159_Sub1.anInt1952 = (Class159_Sub1.anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				Class159_Sub1.anInt1956 = -130712985;
				Class159_Sub1.anInt1951 = -919990023;
			}
			Class358.method27776(-1855451296);
		}
		@Pc(140) Iterator local140 = Class159_Sub1.aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = Class159_Sub1.aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (Class159_Sub1.aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method428((byte) 123); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method442(1185423542)) {
												@Pc(252) Class322 local252 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441, 1001664188);
												if (local240.method13153(arg0, arg1, 815749815)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26455(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false, (byte) -125);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26455(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false, (byte) -39);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26455(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false, (byte) -13);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26455(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false, (byte) -46);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26455(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false, (byte) -107);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661, -532799195);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661, -532799195);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661, -532799195);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || Class159_Sub1.aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = Class159_Sub1.anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || Class159_Sub1.aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = Class159_Sub1.anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "bu", descriptor = "(Lclient!arm;IIZI)V", line = 1615)
	static void method18341(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || Class454.aClass22_55.aClass93_8 == arg0) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3011 * 1966667949;
		@Pc(17) int local17 = arg0.anInt3009 * -1970204471;
		@Pc(22) int local22 = arg0.anInt3012 * -92627949;
		@Pc(28) int local28 = (int) (arg0.aLong154 * 3050087486000948885L);
		@Pc(33) long local33 = arg0.aLong154 * 3050087486000948885L;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(41) Class611 local41 = client.aClass532_1.method30455(1858430525);
		if (local22 == 1008 || local22 == 1009 || local22 == 1010 || local22 == 1011 || local22 == 1012) {
			Class62.method1154(local22, local28, local12, (byte) 76);
		}
		@Pc(69) Class312 local69;
		if (local22 == 58) {
			local69 = Class124_Sub2.method9308(local17, local12, (byte) -104);
			if (local69 != null) {
				Class420.method28743(local69, (byte) -75);
			}
		}
		if (local22 == 57 || local22 == 1007) {
			Class334.method27403(local28, local17, local12, arg0.aString100, (short) 23818);
		}
		if (local22 == 25) {
			local69 = Class124_Sub2.method9308(local17, local12, (byte) 32);
			if (local69 != null) {
				Class624.method32159(682408472);
				@Pc(104) Class93_Sub19 local104 = client.method25364(local69);
				Class698.method36700(local69, local104.method13627((short) -1001), local104.anInt1546 * -1350606777, (byte) 8);
				client.aString145 = Class629.method32264(local69, 2088393609);
				if (client.aString145 == null) {
					client.aString145 = "Null";
				}
				client.aString142 = local69.aString165 + Class306.method26804(16777215, 829632504);
			}
			return;
		}
		@Pc(138) Class446 local138 = null;
		if (local22 == 44) {
			local138 = Class446.aClass446_119;
		} else if (local22 == 45) {
			local138 = Class446.aClass446_25;
		} else if (local22 == 46) {
			local138 = Class446.aClass446_78;
		} else if (local22 == 47) {
			local138 = Class446.aClass446_104;
		} else if (local22 == 48) {
			local138 = Class446.aClass446_6;
		} else if (local22 == 49) {
			local138 = Class446.aClass446_64;
		} else if (local22 == 50) {
			local138 = Class446.aClass446_40;
		} else if (local22 == 51) {
			local138 = Class446.aClass446_50;
		} else if (local22 == 52) {
			local138 = Class446.aClass446_91;
		} else if (local22 == 53) {
			local138 = Class446.aClass446_24;
		}
		@Pc(224) Class93_Sub22 local224;
		if (local138 != null) {
			@Pc(203) Class132_Sub1_Sub1_Sub1_Sub2 local203 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local203 != null) {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local224 = Class102.method2588(local138, client.aClass175_2.aClass24_2, (byte) 95);
				local224.aPacketBit_1.p2(local28, 2132479921);
				local224.aPacketBit_1.p1_alt1(Class28.method601(-774366894) ? 1 : 0, -1591808004);
				client.aClass175_2.method24356(local224, -1871356942);
				Class498.method30135(local203.anIntArray240[0], local203.anIntArray239[0], -1630460548);
			}
		}
		@Pc(255) Class446 local255 = null;
		if (local22 == 3) {
			local255 = Class446.aClass446_14;
		} else if (local22 == 4) {
			local255 = Class446.aClass446_98;
		} else if (local22 == 5) {
			local255 = Class446.aClass446_29;
		} else if (local22 == 6) {
			local255 = Class446.aClass446_115;
		} else if (local22 == 1001) {
			local255 = Class446.aClass446_121;
		} else if (local22 == 1002) {
			local255 = Class446.aClass446_41;
		}
		if (local255 != null) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local224 = Class102.method2588(local255, client.aClass175_2.aClass24_2, (byte) 57);
			local224.aPacketBit_1.p1_alt2(Class28.method601(1614108965) ? 1 : 0, -1909385443);
			local224.aPacketBit_1.p2(local41.anInt5624 * -1994307635 + local17, 2133161526);
			local224.aPacketBit_1.p4((int) (local33 >>> 32) & Integer.MAX_VALUE, (byte) 29);
			local224.aPacketBit_1.p2_alt3(local12 + local41.anInt5623 * 270611681, (short) 255);
			client.aClass175_2.method24356(local224, -1515029020);
			Class498.method30135(local12, local17, -1411535958);
		}
		if (local22 == 23) {
			if (client.anInt3514 * 2055688893 > 0 && Class436.method28805((byte) -28)) {
				Class684.method33422(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local12 + local41.anInt5623 * 270611681, local41.anInt5624 * -1994307635 + local17, (byte) 7);
			} else {
				local224 = Class633.method32307(local12, local17, local28, 331939565);
				if (local28 == 1) {
					local224.aPacketBit_1.p1(-1, (byte) -113);
					local224.aPacketBit_1.p1(-1, (byte) -44);
					local224.aPacketBit_1.p2((int) client.aFloat253, 2129702355);
					local224.aPacketBit_1.p1(57, (byte) -85);
					local224.aPacketBit_1.p1(client.anInt3477 * -1357343303, (byte) -126);
					local224.aPacketBit_1.p1(client.anInt3478 * 663566609, (byte) -5);
					local224.aPacketBit_1.p1(89, (byte) -35);
					@Pc(439) Class472 local439 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
					local224.aPacketBit_1.p2((int) local439.aFloat317, 2143553461);
					local224.aPacketBit_1.p2((int) local439.aFloat319, 2131088362);
					local224.aPacketBit_1.p1(63, (byte) -75);
				} else {
					client.anInt3465 = arg1 * 826123699;
					client.anInt3499 = arg2 * -398107037;
					client.anInt3501 = -2121232217;
					client.anInt3500 = 0;
				}
				client.aClass175_2.method24356(local224, -1465930168);
				Class498.method30135(local12, local17, -1655374691);
			}
		}
		@Pc(481) Class446 local481 = null;
		if (local22 == 9) {
			local481 = Class446.aClass446_35;
		} else if (local22 == 10) {
			local481 = Class446.aClass446_58;
		} else if (local22 == 11) {
			local481 = Class446.aClass446_90;
		} else if (local22 == 12) {
			local481 = Class446.aClass446_38;
		} else if (local22 == 13) {
			local481 = Class446.aClass446_4;
		} else if (local22 == 1003) {
			local481 = Class446.aClass446_11;
		}
		@Pc(531) Class132_Sub1_Sub1_Sub1_Sub1 local531;
		@Pc(549) Class93_Sub22 local549;
		@Pc(525) Class93_Sub15 local525;
		if (local481 != null) {
			local525 = (Class93_Sub15) client.aClass16_18.method214((long) local28);
			if (local525 != null) {
				local531 = (Class132_Sub1_Sub1_Sub1_Sub1) local525.anObject5;
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2588(local481, client.aClass175_2.aClass24_2, (byte) 79);
				local549.aPacketBit_1.p1_alt3(Class28.method601(-352752456) ? 1 : 0, (byte) -82);
				local549.aPacketBit_1.p2_alt2(local28, -1578850278);
				client.aClass175_2.method24356(local549, -2048356558);
				Class498.method30135(local531.anIntArray240[0], local531.anIntArray239[0], -1517556294);
			}
		}
		@Pc(599) Class93_Sub22 local599;
		if (local22 == 17) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2588(Class446.aClass446_116, client.aClass175_2.aClass24_2, (byte) 91);
			local599.aPacketBit_1.p2_alt1(local28, (byte) 56);
			local599.aPacketBit_1.p1_alt1(Class28.method601(-1251363317) ? 1 : 0, -1591808004);
			local599.aPacketBit_1.p2_alt1(client.anInt3524 * -239149331, (byte) -97);
			local599.aPacketBit_1.p2_alt1(local17 + local41.anInt5624 * -1994307635, (byte) -46);
			local599.aPacketBit_1.p2_alt1(local41.anInt5623 * 270611681 + local12, (byte) 47);
			local599.aPacketBit_1.p4_alt2(Class148.anInt1394 * -278883695, 844689790);
			local599.aPacketBit_1.p2_alt3(client.anInt3523 * 1573685689, (short) 255);
			client.aClass175_2.method24356(local599, -1525108540);
			Class498.method30135(local12, local17, -1937632092);
		}
		if (local22 == 8) {
			local525 = (Class93_Sub15) client.aClass16_18.method214((long) local28);
			if (local525 != null) {
				local531 = (Class132_Sub1_Sub1_Sub1_Sub1) local525.anObject5;
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2588(Class446.aClass446_118, client.aClass175_2.aClass24_2, (byte) 60);
				local549.aPacketBit_1.p4(Class148.anInt1394 * -278883695, (byte) -74);
				local549.aPacketBit_1.p2(local28, 2138864062);
				local549.aPacketBit_1.p1_alt1(Class28.method601(-289466726) ? 1 : 0, -1591808004);
				local549.aPacketBit_1.p2_alt1(client.anInt3524 * -239149331, (byte) -1);
				local549.aPacketBit_1.p2(client.anInt3523 * 1573685689, 2126512423);
				client.aClass175_2.method24356(local549, -1926157710);
				Class498.method30135(local531.anIntArray240[0], local531.anIntArray239[0], -1378345155);
			}
		}
		if (local22 == 2) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2588(Class446.aClass446_23, client.aClass175_2.aClass24_2, (byte) 122);
			local599.aPacketBit_1.p1_alt1(Class28.method601(921874847) ? 1 : 0, -1591808004);
			local599.aPacketBit_1.p2_alt1(local12 + local41.anInt5623 * 270611681, (byte) 64);
			local599.aPacketBit_1.p2_alt1(client.anInt3524 * -239149331, (byte) 62);
			local599.aPacketBit_1.p2_alt3(local17 + local41.anInt5624 * -1994307635, (short) 255);
			local599.aPacketBit_1.p4_alt1(Class148.anInt1394 * -278883695, 907143239);
			local599.aPacketBit_1.p4_alt2((int) (local33 >>> 32) & Integer.MAX_VALUE, 844689790);
			local599.aPacketBit_1.p2(client.anInt3523 * 1573685689, 2134886476);
			client.aClass175_2.method24356(local599, -1642982987);
			Class498.method30135(local12, local17, -1592799530);
		}
		if (local22 == 60) {
			if (client.anInt3514 * 2055688893 > 0 && Class436.method28805((byte) -14)) {
				Class684.method33422(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local41.anInt5623 * 270611681 + local12, local17 + local41.anInt5624 * -1994307635, (byte) 68);
			} else {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = -2121232217;
				client.anInt3500 = 0;
				local599 = Class102.method2588(Class446.aClass446_109, client.aClass175_2.aClass24_2, (byte) 93);
				local599.aPacketBit_1.p2_alt2(local17 + local41.anInt5624 * -1994307635, -2045171750);
				local599.aPacketBit_1.p2_alt3(local41.anInt5623 * 270611681 + local12, (short) 255);
				client.aClass175_2.method24356(local599, -1806106098);
			}
		}
		if (local22 == 16) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2588(Class446.aClass446_71, client.aClass175_2.aClass24_2, (byte) 99);
			local599.aPacketBit_1.p2(client.anInt3523 * 1573685689, 2146703057);
			local599.aPacketBit_1.p1_alt1(Class28.method601(-541062985) ? 1 : 0, -1591808004);
			local599.aPacketBit_1.p2_alt1(client.anInt3524 * -239149331, (byte) 2);
			local599.aPacketBit_1.p2_alt3(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2768 * -1688488127, (short) 255);
			local599.aPacketBit_1.p4_alt2(Class148.anInt1394 * -278883695, 844689790);
			client.aClass175_2.method24356(local599, -2115748774);
		}
		@Pc(971) Class446 local971 = null;
		if (local22 == 18) {
			local971 = Class446.aClass446_12;
		} else if (local22 == 19) {
			local971 = Class446.aClass446_122;
		} else if (local22 == 20) {
			local971 = Class446.aClass446_28;
		} else if (local22 == 21) {
			local971 = Class446.aClass446_83;
		} else if (local22 == 22) {
			local971 = Class446.aClass446_18;
		} else if (local22 == 1004) {
			local971 = Class446.aClass446_2;
		}
		@Pc(1027) Class93_Sub22 local1027;
		if (local971 != null) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local1027 = Class102.method2588(local971, client.aClass175_2.aClass24_2, (byte) 82);
			local1027.aPacketBit_1.p2_alt1(local28, (byte) 4);
			local1027.aPacketBit_1.p2_alt1(local41.anInt5623 * 270611681 + local12, (byte) -31);
			local1027.aPacketBit_1.p2(local17 + local41.anInt5624 * -1994307635, 2144936217);
			local1027.aPacketBit_1.p1_alt3((arg3 ? 2 : 0) | (Class28.method601(-1433332860) ? 1 : 0), (byte) -28);
			client.aClass175_2.method24356(local1027, -1494538776);
			Class498.method30135(local12, local17, -1727402700);
		}
		if (local22 == 15) {
			@Pc(1083) Class132_Sub1_Sub1_Sub1_Sub2 local1083 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local1083 != null) {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2588(Class446.aClass446_71, client.aClass175_2.aClass24_2, (byte) 85);
				local549.aPacketBit_1.p2(client.anInt3523 * 1573685689, 2134355651);
				local549.aPacketBit_1.p1_alt1(Class28.method601(-676301832) ? 1 : 0, -1591808004);
				local549.aPacketBit_1.p2_alt1(client.anInt3524 * -239149331, (byte) -15);
				local549.aPacketBit_1.p2_alt3(local28, (short) 255);
				local549.aPacketBit_1.p4_alt2(Class148.anInt1394 * -278883695, 844689790);
				client.aClass175_2.method24356(local549, -2125370882);
				Class498.method30135(local1083.anIntArray240[0], local1083.anIntArray239[0], -1746633121);
			}
		}
		if (local22 == 59) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = -2121232217;
			client.anInt3500 = 0;
			local1027 = Class102.method2588(Class446.aClass446_61, client.aClass175_2.aClass24_2, (byte) 108);
			local1027.aPacketBit_1.p2_alt2(local41.anInt5623 * 270611681 + local12, -1855805299);
			local1027.aPacketBit_1.p4_alt1(Class148.anInt1394 * -278883695, 907143239);
			local1027.aPacketBit_1.p2(client.anInt3524 * -239149331, 2134705542);
			local1027.aPacketBit_1.p2_alt2(local41.anInt5624 * -1994307635 + local17, -2130187629);
			local1027.aPacketBit_1.p2_alt2(client.anInt3523 * 1573685689, -1530161978);
			client.aClass175_2.method24356(local1027, -1759057575);
			Class498.method30135(local12, local17, -1027150115);
		}
		if (local22 == 30 && client.aClass312_7 == null) {
			Class1.method17(local17, local12, -1547528376);
			client.aClass312_7 = Class124_Sub2.method9308(local17, local12, (byte) 48);
			if (client.aClass312_7 != null) {
				Class354.method27694(client.aClass312_7, -1174743804);
			}
		}
		if (client.aBoolean625) {
			Class624.method32159(682408472);
		}
		if (Class627.aClass312_12 != null && client.anInt3502 * -2145300079 == 0) {
			Class354.method27694(Class627.aClass312_12, -1174743804);
		}
	}

	@OriginalMember(owner = "client!aq", name = "cl", descriptor = "(Lclient!yf;B)V", line = 5297)
	static final void method18342(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1822115567);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class286.method26529(local16, local22, arg0, -1587367427);
	}

	@OriginalMember(owner = "client!aq", name = "fe", descriptor = "(Lclient!yf;I)V", line = 6004)
	static final void method18343(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class220.method25545(local11, local14, arg0, (byte) -84);
	}

	@OriginalMember(owner = "client!aq", name = "hj", descriptor = "(Lclient!yf;I)V", line = 6434)
	static final void method18344(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class453.method28966(local11, local14, arg0, Class310.aClass310_6, (byte) -64);
	}

	@OriginalMember(owner = "client!aq", name = "bbu", descriptor = "(Lclient!yf;S)V", line = 14380)
	static final void method18345(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
