package com.jagex;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xc")
public class Class655 {

	@OriginalMember(owner = "client!xc", name = "ku", descriptor = "I")
	public static int anInt5809;

	@OriginalMember(owner = "client!xc", name = "e", descriptor = "J")
	static long aLong299 = 2492000195029924361L;

	@OriginalMember(owner = "client!xc", name = "n", descriptor = "I")
	static int anInt5808 = 0;

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "Z")
	static boolean aBoolean861 = true;

	@OriginalMember(owner = "client!xc", name = "k", descriptor = "Lclient!alt;")
	static final Class163_Sub2 aClass163_Sub2_1 = new Class163_Sub2();

	@OriginalMember(owner = "client!xc", name = "f", descriptor = "Lclient!alp;")
	static final Class163_Sub1 aClass163_Sub1_1 = new Class163_Sub1();

	@OriginalMember(owner = "client!xc", name = "w", descriptor = "Ljava/util/Queue;")
	static Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!xc", name = "<init>", descriptor = "()V", line = 35)
	Class655() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "(II)I", line = 39)
	static final int method32721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!xc", name = "u", descriptor = "()V", line = 40)
	public static void method32722() {
		if (Class127.method9257(-16571660)) {
			Class132_Sub1_Sub3_Sub1.method12301(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "p", descriptor = "()V", line = 40)
	public static void method32723() {
		if (Class127.method9257(-1184013335)) {
			Class132_Sub1_Sub3_Sub1.method12301(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "d", descriptor = "()V", line = 40)
	public static void method32724() {
		if (Class127.method9257(355591171)) {
			Class132_Sub1_Sub3_Sub1.method12301(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "z", descriptor = "()V", line = 40)
	public static void method32725() {
		if (Class127.method9257(-1600136580)) {
			Class132_Sub1_Sub3_Sub1.method12301(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "c", descriptor = "()V", line = 56)
	public static void method32726() {
		ModeWhere.method36608(474203229);
	}

	@OriginalMember(owner = "client!xc", name = "r", descriptor = "()V", line = 60)
	public static void method32727() {
		aClass163_Sub2_1.method14904(686976277);
		aClass163_Sub1_1.method14904(-721544363);
		aLong299 = 2492000195029924361L;
		aBoolean861 = true;
	}

	@OriginalMember(owner = "client!xc", name = "v", descriptor = "()V", line = 60)
	public static void method32728() {
		aClass163_Sub2_1.method14904(-491166801);
		aClass163_Sub1_1.method14904(579207909);
		aLong299 = 2492000195029924361L;
		aBoolean861 = true;
	}

	@OriginalMember(owner = "client!xc", name = "o", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32729(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7570(client.state * -849002901, 519414176)) {
			aClass163_Sub2_1.method14905(arg0, 1417579877);
		} else {
			arg0.method22879((byte) 101);
		}
	}

	@OriginalMember(owner = "client!xc", name = "s", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32730(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7570(client.state * -849002901, 1504382181)) {
			aClass163_Sub2_1.method14905(arg0, -1235379709);
		} else {
			arg0.method22879((byte) -70);
		}
	}

	@OriginalMember(owner = "client!xc", name = "y", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32731(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7570(client.state * -849002901, 706830764)) {
			aClass163_Sub2_1.method14905(arg0, -1297352303);
		} else {
			arg0.method22879((byte) -46);
		}
	}

	@OriginalMember(owner = "client!xc", name = "x", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32732(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7570(client.state * -849002901, -1463731987)) {
			aClass163_Sub2_1.method14905(arg0, 1369601178);
		} else {
			arg0.method22879((byte) -3);
		}
	}

	@OriginalMember(owner = "client!xc", name = "q", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32733(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7570(client.state * -849002901, -1879019015)) {
			aClass163_Sub2_1.method14905(arg0, -761470565);
		} else {
			arg0.method22879((byte) 14);
		}
	}

	@OriginalMember(owner = "client!xc", name = "g", descriptor = "()V", line = 75)
	static void method32734() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22901(local9, 943340166);
						if (!local16.method22898(1252378458) && local16.method22875(-1678286317) < Class553.width * -1378711501 && local16.method22876((byte) -87) < Class553.height * 2091353777 && local16.method22875(-1678286317) >= 0 && local16.method22876((byte) -32) >= 0) {
							@Pc(67) int local67 = local16.method22891(-1927132435);
							if (local16.method22891(274949757) == -1) {
								aClass163_Sub1_1.method14905(local16, -429080581);
							} else if (Class64.method1163(local67, 1114876248)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22879((byte) -61);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "a", descriptor = "()V", line = 75)
	static void method32735() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22901(local9, -1461133725);
						if (!local16.method22898(-1067338844) && local16.method22875(-1678286317) < Class553.width * -1378711501 && local16.method22876((byte) -112) < Class553.height * 2091353777 && local16.method22875(-1678286317) >= 0 && local16.method22876((byte) -64) >= 0) {
							@Pc(67) int local67 = local16.method22891(-1302953689);
							if (local16.method22891(2097196207) == -1) {
								aClass163_Sub1_1.method14905(local16, -824861930);
							} else if (Class64.method1163(local67, 664155187)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22879((byte) 48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "b", descriptor = "()V", line = 75)
	static void method32736() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22901(local9, -416168884);
						if (!local16.method22898(-1772599632) && local16.method22875(-1678286317) < Class553.width * -1378711501 && local16.method22876((byte) -50) < Class553.height * 2091353777 && local16.method22875(-1678286317) >= 0 && local16.method22876((byte) -121) >= 0) {
							@Pc(67) int local67 = local16.method22891(-2074707108);
							if (local16.method22891(1707142653) == -1) {
								aClass163_Sub1_1.method14905(local16, 708132777);
							} else if (Class64.method1163(local67, 1252316270)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22879((byte) -39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "h", descriptor = "()V", line = 75)
	static void method32737() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22901(local9, -1805998502);
						if (!local16.method22898(-2090127865) && local16.method22875(-1678286317) < Class553.width * -1378711501 && local16.method22876((byte) -53) < Class553.height * 2091353777 && local16.method22875(-1678286317) >= 0 && local16.method22876((byte) -78) >= 0) {
							@Pc(67) int local67 = local16.method22891(-2115319444);
							if (local16.method22891(-1388179120) == -1) {
								aClass163_Sub1_1.method14905(local16, 1719670031);
							} else if (Class64.method1163(local67, 1481689992)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22879((byte) 83);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "t", descriptor = "()V", line = 113)
	public static void method32738() {
		Class431.method28775((byte) 5);
		aClass163_Sub2_1.method14903((short) 19868);
		aClass163_Sub1_1.method14903((short) 14738);
		@Pc(17) ClientMessage local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_89, client.aClass175_2.clientIsaac, (byte) 10);
			local17.packet.p2(client.anInt3450 * 541690580, 2131005932);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 10) - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688((byte) 95) * -2492000195029924361L;
				local17.packet.p1(local35.method13696((byte) 0), (byte) -115);
				local17.packet.p3((int) local43, (byte) 119);
			}
			client.aClass175_2.send(local17, -1777655733);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9024(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -95);
				local114 = Class155.method15305(local107.aClass471_1, -610065933) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25630(local107.aClass471_1, 1416294260) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) ClientMessage local153 = Class102.createGameMessage(ClientProt.aClientProt_39, client.aClass175_2.clientIsaac, (byte) 16);
			local153.packet.p2_alt3(local26, (short) 255);
			local153.packet.p2(local114, 2140478834);
			client.aClass175_2.send(local153, -2066036156);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.createGameMessage(ClientProt.aClientProt_95, client.aClass175_2.clientIsaac, (byte) 37);
			local17.packet.p1(Class20.aBoolean10 ? 1 : 0, (byte) -103);
			client.aClass175_2.send(local17, -1512555639);
		}
		if (!client.aBoolean601) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_19, client.aClass175_2.clientIsaac, (byte) 70);
			local17.packet.p1(0, (byte) -99);
			local26 = local17.packet.pos * 212851357;
			@Pc(214) Packet local214 = Class51.options.encode(970509034);
			local17.packet.pdata(local214.data, 0, local214.pos * 212851357, 2026842986);
			local17.packet.psize1(local17.packet.pos * 212851357 - local26, (byte) 13);
			client.aClass175_2.send(local17, -1522319567);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.options.aClass166_Sub4_1.method15426((byte) 119) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20773();
		@Pc(259) ClientMessage local259 = Class102.createGameMessage(ClientProt.aClientProt_111, client.aClass175_2.clientIsaac, (byte) 107);
		local259.packet.p2(0, 2126321278);
		@Pc(270) int local270 = local259.packet.pos * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.packet.p1(0, (byte) -118);
		} else {
			local259.packet.p1(1, (byte) -90);
			@Pc(284) Class184[] local284 = Class184.method24580(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26461(local288, local259.packet, -2075218078);
					local259.packet.pSmart1or2s(local292.size(), 235699257);
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.packet.pSmart2or4(local294, -1550631581);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.packet.pSmart2or4(local362 - local294, -1412914480);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.packet.psize2(local259.packet.pos * 212851357 - local270, 1059727717);
		client.aClass175_2.send(local259, -2130488370);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "i", descriptor = "()V", line = 113)
	public static void method32739() {
		Class431.method28775((byte) -61);
		aClass163_Sub2_1.method14903((short) 15195);
		aClass163_Sub1_1.method14903((short) 5000);
		@Pc(17) ClientMessage local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_89, client.aClass175_2.clientIsaac, (byte) 50);
			local17.packet.p2(client.anInt3450 * 541690580, 2144009053);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 73) - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688((byte) 121) * -2492000195029924361L;
				local17.packet.p1(local35.method13696((byte) 0), (byte) -18);
				local17.packet.p3((int) local43, (byte) 113);
			}
			client.aClass175_2.send(local17, -1944668896);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9024(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -7);
				local114 = Class155.method15305(local107.aClass471_1, 1798878870) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25630(local107.aClass471_1, -1353592533) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) ClientMessage local153 = Class102.createGameMessage(ClientProt.aClientProt_39, client.aClass175_2.clientIsaac, (byte) 72);
			local153.packet.p2_alt3(local26, (short) 255);
			local153.packet.p2(local114, 2133126999);
			client.aClass175_2.send(local153, -1478359312);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.createGameMessage(ClientProt.aClientProt_95, client.aClass175_2.clientIsaac, (byte) 55);
			local17.packet.p1(Class20.aBoolean10 ? 1 : 0, (byte) -16);
			client.aClass175_2.send(local17, -1544655434);
		}
		if (!client.aBoolean601) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_19, client.aClass175_2.clientIsaac, (byte) 107);
			local17.packet.p1(0, (byte) -67);
			local26 = local17.packet.pos * 212851357;
			@Pc(214) Packet local214 = Class51.options.encode(446421675);
			local17.packet.pdata(local214.data, 0, local214.pos * 212851357, 2026842986);
			local17.packet.psize1(local17.packet.pos * 212851357 - local26, (byte) 5);
			client.aClass175_2.send(local17, -2095586228);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.options.aClass166_Sub4_1.method15426((byte) 99) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20773();
		@Pc(259) ClientMessage local259 = Class102.createGameMessage(ClientProt.aClientProt_111, client.aClass175_2.clientIsaac, (byte) 76);
		local259.packet.p2(0, 2141874759);
		@Pc(270) int local270 = local259.packet.pos * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.packet.p1(0, (byte) -8);
		} else {
			local259.packet.p1(1, (byte) -96);
			@Pc(284) Class184[] local284 = Class184.method24580(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26461(local288, local259.packet, -2075218078);
					local259.packet.pSmart1or2s(local292.size(), 68704126);
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.packet.pSmart2or4(local294, -1561324827);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.packet.pSmart2or4(local362 - local294, -1401181989);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.packet.psize2(local259.packet.pos * 212851357 - local270, -1743662539);
		client.aClass175_2.send(local259, -1666991457);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "j", descriptor = "()V", line = 113)
	public static void method32740() {
		Class431.method28775((byte) -48);
		aClass163_Sub2_1.method14903((short) 8772);
		aClass163_Sub1_1.method14903((short) 30345);
		@Pc(17) ClientMessage local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_89, client.aClass175_2.clientIsaac, (byte) 71);
			local17.packet.p2(client.anInt3450 * 541690580, 2145202535);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 86) - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688((byte) 90) * -2492000195029924361L;
				local17.packet.p1(local35.method13696((byte) 0), (byte) -10);
				local17.packet.p3((int) local43, (byte) 67);
			}
			client.aClass175_2.send(local17, -1841579982);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9024(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -82);
				local114 = Class155.method15305(local107.aClass471_1, 471561054) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25630(local107.aClass471_1, 333908081) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) ClientMessage local153 = Class102.createGameMessage(ClientProt.aClientProt_39, client.aClass175_2.clientIsaac, (byte) 83);
			local153.packet.p2_alt3(local26, (short) 255);
			local153.packet.p2(local114, 2146857954);
			client.aClass175_2.send(local153, -1878503447);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.createGameMessage(ClientProt.aClientProt_95, client.aClass175_2.clientIsaac, (byte) 58);
			local17.packet.p1(Class20.aBoolean10 ? 1 : 0, (byte) -113);
			client.aClass175_2.send(local17, -2066428888);
		}
		if (!client.aBoolean601) {
			local17 = Class102.createGameMessage(ClientProt.aClientProt_19, client.aClass175_2.clientIsaac, (byte) 62);
			local17.packet.p1(0, (byte) -105);
			local26 = local17.packet.pos * 212851357;
			@Pc(214) Packet local214 = Class51.options.encode(-443355101);
			local17.packet.pdata(local214.data, 0, local214.pos * 212851357, 2026842986);
			local17.packet.psize1(local17.packet.pos * 212851357 - local26, (byte) 110);
			client.aClass175_2.send(local17, -1882665606);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.options.aClass166_Sub4_1.method15426((byte) 87) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20773();
		@Pc(259) ClientMessage local259 = Class102.createGameMessage(ClientProt.aClientProt_111, client.aClass175_2.clientIsaac, (byte) 94);
		local259.packet.p2(0, 2137571047);
		@Pc(270) int local270 = local259.packet.pos * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.packet.p1(0, (byte) -31);
		} else {
			local259.packet.p1(1, (byte) -84);
			@Pc(284) Class184[] local284 = Class184.method24580(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26461(local288, local259.packet, -2075218078);
					local259.packet.pSmart1or2s(local292.size(), 161965767);
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.packet.pSmart2or4(local294, -1730642294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.packet.pSmart2or4(local362 - local294, -1827383859);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.packet.psize2(local259.packet.pos * 212851357 - local270, 1201816319);
		client.aClass175_2.send(local259, -1485111313);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "dx", descriptor = "(Lclient!yf;B)V", line = 5646)
	static final void method32741(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 591501400);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class237.method25774(local16, local22, arg0, (short) -9940);
	}

	@OriginalMember(owner = "client!xc", name = "aoh", descriptor = "(Lclient!yf;I)V", line = 12616)
	static final void method32742(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(26) float local26 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] / 1000.0F;
		Class65.aClass123_Sub1_2.method8992(local13, local26, -1664618238);
	}

	@OriginalMember(owner = "client!xc", name = "auq", descriptor = "(Lclient!yf;I)V", line = 13337)
	static final void method32743(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.antialiasing.getValue(-430794875);
	}

	@OriginalMember(owner = "client!xc", name = "bar", descriptor = "(Lclient!yf;B)V", line = 14294)
	static final void method32744(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class694.aClass104_14.method20639()) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub28_1.method16546(local12, -1718640691);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!xc", name = "bbe", descriptor = "(Lclient!yf;I)V", line = 14421)
	static final void method32745(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class561 local4 = arg0.aClass132_Sub1_Sub1_Sub1_4.method20036(-1514961960);
		if (local4 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local4.method31137(1363056965);
		}
	}
}
