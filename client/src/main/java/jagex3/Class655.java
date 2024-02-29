package jagex3;

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
public final class Class655 {

	@OriginalMember(owner = "client!xc", name = "ku", descriptor = "I")
	public static int anInt5970;

	@OriginalMember(owner = "client!xc", name = "e", descriptor = "J")
	static long aLong302 = 2492000195029924361L;

	@OriginalMember(owner = "client!xc", name = "n", descriptor = "I")
	static int anInt5969 = 0;

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "Z")
	static boolean aBoolean870 = true;

	@OriginalMember(owner = "client!xc", name = "k", descriptor = "Lclient!alt;")
	static final Class163_Sub2 aClass163_Sub2_1 = new Class163_Sub2();

	@OriginalMember(owner = "client!xc", name = "f", descriptor = "Lclient!alp;")
	static final Class163_Sub1 aClass163_Sub1_1 = new Class163_Sub1();

	@OriginalMember(owner = "client!xc", name = "w", descriptor = "Ljava/util/Queue;")
	static Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!xc", name = "t", descriptor = "()V")
	public static void method32902() {
		Class431.method28955((byte) 5);
		aClass163_Sub2_1.method14934((short) 19868);
		aClass163_Sub1_1.method14934((short) 14738);
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2, (byte) 10);
			local17.aClass93_Sub41_Sub2_1.method22466(client.anInt3450 * 541690580, 2131005932);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 10) - aLong302 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong302 = local35.method13688((byte) 95) * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22522(local35.method13696((byte) 0), (byte) -115);
				local17.aClass93_Sub41_Sub2_1.method22406((int) local43, (byte) 119);
			}
			client.aClass175_2.method24363(local17, -1777655733);
		}
		if (anInt5969 * 660178843 > 0) {
			anInt5969 -= 1066698387;
		}
		if (client.aBoolean621 && anInt5969 * 660178843 <= 0) {
			anInt5969 = -140868740;
			client.aBoolean621 = false;
			@Pc(114) int local114;
			if (Class429.anInt4942 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -95);
				local114 = Class155.method15319(local107.aClass471_1, -610065933) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25745(local107.aClass471_1, 1416294260) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2, (byte) 16);
			local153.aClass93_Sub41_Sub2_1.method22468(local26, (short) 255);
			local153.aClass93_Sub41_Sub2_1.method22466(local114, 2140478834);
			client.aClass175_2.method24363(local153, -2066036156);
		}
		if (Class20.aBoolean10 != aBoolean870) {
			aBoolean870 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2, (byte) 37);
			local17.aClass93_Sub41_Sub2_1.method22522(Class20.aBoolean10 ? 1 : 0, (byte) -103);
			client.aClass175_2.method24363(local17, -1512555639);
		}
		if (!client.aBoolean603) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2, (byte) 70);
			local17.aClass93_Sub41_Sub2_1.method22522(0, (byte) -99);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356(970509034);
			local17.aClass93_Sub41_Sub2_1.method22417(local214.aByteArray58, 0, local214.anInt3070 * 212851357, 2026842986);
			local17.aClass93_Sub41_Sub2_1.method22549(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26, (byte) 13);
			client.aClass175_2.method24363(local17, -1522319567);
			client.aBoolean603 = true;
		}
		if (client.aBoolean604 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 119) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20724();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2, (byte) 107);
		local259.aClass93_Sub41_Sub2_1.method22466(0, 2126321278);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22522(0, (byte) -118);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22522(1, (byte) -90);
			@Pc(284) Class184[] local284 = Class184.method24592(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26556(local288, local259.aClass93_Sub41_Sub2_1, -2075218078);
					local259.aClass93_Sub41_Sub2_1.method22664(local292.size(), 235699257);
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
					local259.aClass93_Sub41_Sub2_1.method22423(local294, -1550631581);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22423(local362 - local294, -1412914480);
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
		local259.aClass93_Sub41_Sub2_1.method22419(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270, 1059727717);
		client.aClass175_2.method24363(local259, -2130488370);
		client.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!xc", name = "g", descriptor = "()V")
	static void method32903() {
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
						local16.method22909(local9, 943340166);
						if (!local16.method22908(1252378458) && local16.method22885(-1678286317) < Class553.anInt3408 * -1378711501 && local16.method22886((byte) -87) < Class553.anInt3416 * 2091353777 && local16.method22885(-1678286317) >= 0 && local16.method22886((byte) -32) >= 0) {
							@Pc(67) int local67 = local16.method22902(-1927132435);
							if (local16.method22902(274949757) == -1) {
								aClass163_Sub1_1.method14915(local16, -429080581);
							} else if (Class64.method1163(local67, 1114876248)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22889((byte) -61);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "u", descriptor = "()V")
	public static void method32904() {
		if (Class127.method9264(-16571660)) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "p", descriptor = "()V")
	public static void method32905() {
		if (Class127.method9264(-1184013335)) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "d", descriptor = "()V")
	public static void method32906() {
		if (Class127.method9264(355591171)) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "c", descriptor = "()V")
	public static void method32907() {
		Class693.method36798(474203229);
	}

	@OriginalMember(owner = "client!xc", name = "r", descriptor = "()V")
	public static void method32908() {
		aClass163_Sub2_1.method14914(686976277);
		aClass163_Sub1_1.method14914(-721544363);
		aLong302 = 2492000195029924361L;
		aBoolean870 = true;
	}

	@OriginalMember(owner = "client!xc", name = "a", descriptor = "()V")
	static void method32909() {
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
						local16.method22909(local9, -1461133725);
						if (!local16.method22908(-1067338844) && local16.method22885(-1678286317) < Class553.anInt3408 * -1378711501 && local16.method22886((byte) -112) < Class553.anInt3416 * 2091353777 && local16.method22885(-1678286317) >= 0 && local16.method22886((byte) -64) >= 0) {
							@Pc(67) int local67 = local16.method22902(-1302953689);
							if (local16.method22902(2097196207) == -1) {
								aClass163_Sub1_1.method14915(local16, -824861930);
							} else if (Class64.method1163(local67, 664155187)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22889((byte) 48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "o", descriptor = "(Lclient!akm;)V")
	public static void method32910(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901, 519414176)) {
			aClass163_Sub2_1.method14915(arg0, 1417579877);
		} else {
			arg0.method22889((byte) 101);
		}
	}

	@OriginalMember(owner = "client!xc", name = "s", descriptor = "(Lclient!akm;)V")
	public static void method32911(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901, 1504382181)) {
			aClass163_Sub2_1.method14915(arg0, -1235379709);
		} else {
			arg0.method22889((byte) -70);
		}
	}

	@OriginalMember(owner = "client!xc", name = "y", descriptor = "(Lclient!akm;)V")
	public static void method32912(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901, 706830764)) {
			aClass163_Sub2_1.method14915(arg0, -1297352303);
		} else {
			arg0.method22889((byte) -46);
		}
	}

	@OriginalMember(owner = "client!xc", name = "z", descriptor = "()V")
	public static void method32913() {
		if (Class127.method9264(-1600136580)) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668(), (short) 1002);
		}
	}

	@OriginalMember(owner = "client!xc", name = "x", descriptor = "(Lclient!akm;)V")
	public static void method32914(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901, -1463731987)) {
			aClass163_Sub2_1.method14915(arg0, 1369601178);
		} else {
			arg0.method22889((byte) -3);
		}
	}

	@OriginalMember(owner = "client!xc", name = "b", descriptor = "()V")
	static void method32915() {
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
						local16.method22909(local9, -416168884);
						if (!local16.method22908(-1772599632) && local16.method22885(-1678286317) < Class553.anInt3408 * -1378711501 && local16.method22886((byte) -50) < Class553.anInt3416 * 2091353777 && local16.method22885(-1678286317) >= 0 && local16.method22886((byte) -121) >= 0) {
							@Pc(67) int local67 = local16.method22902(-2074707108);
							if (local16.method22902(1707142653) == -1) {
								aClass163_Sub1_1.method14915(local16, 708132777);
							} else if (Class64.method1163(local67, 1252316270)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22889((byte) -39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "h", descriptor = "()V")
	static void method32916() {
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
						local16.method22909(local9, -1805998502);
						if (!local16.method22908(-2090127865) && local16.method22885(-1678286317) < Class553.anInt3408 * -1378711501 && local16.method22886((byte) -53) < Class553.anInt3416 * 2091353777 && local16.method22885(-1678286317) >= 0 && local16.method22886((byte) -78) >= 0) {
							@Pc(67) int local67 = local16.method22902(-2115319444);
							if (local16.method22902(-1388179120) == -1) {
								aClass163_Sub1_1.method14915(local16, 1719670031);
							} else if (Class64.method1163(local67, 1481689992)) {
								aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22889((byte) 83);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "v", descriptor = "()V")
	public static void method32917() {
		aClass163_Sub2_1.method14914(-491166801);
		aClass163_Sub1_1.method14914(579207909);
		aLong302 = 2492000195029924361L;
		aBoolean870 = true;
	}

	@OriginalMember(owner = "client!xc", name = "i", descriptor = "()V")
	public static void method32918() {
		Class431.method28955((byte) -61);
		aClass163_Sub2_1.method14934((short) 15195);
		aClass163_Sub1_1.method14934((short) 5000);
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2, (byte) 50);
			local17.aClass93_Sub41_Sub2_1.method22466(client.anInt3450 * 541690580, 2144009053);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 73) - aLong302 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong302 = local35.method13688((byte) 121) * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22522(local35.method13696((byte) 0), (byte) -18);
				local17.aClass93_Sub41_Sub2_1.method22406((int) local43, (byte) 113);
			}
			client.aClass175_2.method24363(local17, -1944668896);
		}
		if (anInt5969 * 660178843 > 0) {
			anInt5969 -= 1066698387;
		}
		if (client.aBoolean621 && anInt5969 * 660178843 <= 0) {
			anInt5969 = -140868740;
			client.aBoolean621 = false;
			@Pc(114) int local114;
			if (Class429.anInt4942 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -7);
				local114 = Class155.method15319(local107.aClass471_1, 1798878870) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25745(local107.aClass471_1, -1353592533) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2, (byte) 72);
			local153.aClass93_Sub41_Sub2_1.method22468(local26, (short) 255);
			local153.aClass93_Sub41_Sub2_1.method22466(local114, 2133126999);
			client.aClass175_2.method24363(local153, -1478359312);
		}
		if (Class20.aBoolean10 != aBoolean870) {
			aBoolean870 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2, (byte) 55);
			local17.aClass93_Sub41_Sub2_1.method22522(Class20.aBoolean10 ? 1 : 0, (byte) -16);
			client.aClass175_2.method24363(local17, -1544655434);
		}
		if (!client.aBoolean603) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2, (byte) 107);
			local17.aClass93_Sub41_Sub2_1.method22522(0, (byte) -67);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356(446421675);
			local17.aClass93_Sub41_Sub2_1.method22417(local214.aByteArray58, 0, local214.anInt3070 * 212851357, 2026842986);
			local17.aClass93_Sub41_Sub2_1.method22549(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26, (byte) 5);
			client.aClass175_2.method24363(local17, -2095586228);
			client.aBoolean603 = true;
		}
		if (client.aBoolean604 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 99) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20724();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2, (byte) 76);
		local259.aClass93_Sub41_Sub2_1.method22466(0, 2141874759);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22522(0, (byte) -8);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22522(1, (byte) -96);
			@Pc(284) Class184[] local284 = Class184.method24592(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26556(local288, local259.aClass93_Sub41_Sub2_1, -2075218078);
					local259.aClass93_Sub41_Sub2_1.method22664(local292.size(), 68704126);
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
					local259.aClass93_Sub41_Sub2_1.method22423(local294, -1561324827);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22423(local362 - local294, -1401181989);
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
		local259.aClass93_Sub41_Sub2_1.method22419(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270, -1743662539);
		client.aClass175_2.method24363(local259, -1666991457);
		client.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!xc", name = "j", descriptor = "()V")
	public static void method32919() {
		Class431.method28955((byte) -48);
		aClass163_Sub2_1.method14934((short) 8772);
		aClass163_Sub1_1.method14934((short) 30345);
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2, (byte) 71);
			local17.aClass93_Sub41_Sub2_1.method22466(client.anInt3450 * 541690580, 2145202535);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688((byte) 86) - aLong302 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong302 = local35.method13688((byte) 90) * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22522(local35.method13696((byte) 0), (byte) -10);
				local17.aClass93_Sub41_Sub2_1.method22406((int) local43, (byte) 67);
			}
			client.aClass175_2.method24363(local17, -1841579982);
		}
		if (anInt5969 * 660178843 > 0) {
			anInt5969 -= 1066698387;
		}
		if (client.aBoolean621 && anInt5969 * 660178843 <= 0) {
			anInt5969 = -140868740;
			client.aBoolean621 = false;
			@Pc(114) int local114;
			if (Class429.anInt4942 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023(-1662199153) == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -82);
				local114 = Class155.method15319(local107.aClass471_1, 471561054) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25745(local107.aClass471_1, 333908081) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2, (byte) 83);
			local153.aClass93_Sub41_Sub2_1.method22468(local26, (short) 255);
			local153.aClass93_Sub41_Sub2_1.method22466(local114, 2146857954);
			client.aClass175_2.method24363(local153, -1878503447);
		}
		if (Class20.aBoolean10 != aBoolean870) {
			aBoolean870 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2, (byte) 58);
			local17.aClass93_Sub41_Sub2_1.method22522(Class20.aBoolean10 ? 1 : 0, (byte) -113);
			client.aClass175_2.method24363(local17, -2066428888);
		}
		if (!client.aBoolean603) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2, (byte) 62);
			local17.aClass93_Sub41_Sub2_1.method22522(0, (byte) -105);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356(-443355101);
			local17.aClass93_Sub41_Sub2_1.method22417(local214.aByteArray58, 0, local214.anInt3070 * 212851357, 2026842986);
			local17.aClass93_Sub41_Sub2_1.method22549(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26, (byte) 110);
			client.aClass175_2.method24363(local17, -1882665606);
			client.aBoolean603 = true;
		}
		if (client.aBoolean604 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 87) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20724();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2, (byte) 94);
		local259.aClass93_Sub41_Sub2_1.method22466(0, 2137571047);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22522(0, (byte) -31);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22522(1, (byte) -84);
			@Pc(284) Class184[] local284 = Class184.method24592(1539890468);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26556(local288, local259.aClass93_Sub41_Sub2_1, -2075218078);
					local259.aClass93_Sub41_Sub2_1.method22664(local292.size(), 161965767);
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
					local259.aClass93_Sub41_Sub2_1.method22423(local294, -1730642294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22423(local362 - local294, -1827383859);
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
		local259.aClass93_Sub41_Sub2_1.method22419(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270, 1201816319);
		client.aClass175_2.method24363(local259, -1485111313);
		client.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!xc", name = "q", descriptor = "(Lclient!akm;)V")
	public static void method32920(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901, -1879019015)) {
			aClass163_Sub2_1.method14915(arg0, -761470565);
		} else {
			arg0.method22889((byte) 14);
		}
	}

	@OriginalMember(owner = "client!xc", name = "dx", descriptor = "(Lclient!yf;B)V")
	static void method32921(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 591501400);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class237.method25864(local16, local22, arg0, (short) -9940);
	}

	@OriginalMember(owner = "client!xc", name = "aoh", descriptor = "(Lclient!yf;I)V")
	static void method32922(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(26) float local26 = (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] / 1000.0F;
		Class65.aClass123_Sub1_2.method8944(local13, local26, -1664618238);
	}

	@OriginalMember(owner = "client!xc", name = "auq", descriptor = "(Lclient!yf;I)V")
	static void method32923(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16355(-430794875);
	}

	@OriginalMember(owner = "client!xc", name = "bar", descriptor = "(Lclient!yf;B)V")
	static void method32924(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (Class694.aClass104_14.method20577()) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16555(local12, -1718640691);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!xc", name = "bbe", descriptor = "(Lclient!yf;I)V")
	static void method32925(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class561 local4 = arg0.aClass132_Sub1_Sub1_Sub1_4.method19983(-1514961960);
		if (local4 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local4.method31319(1363056965);
		}
	}

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "(II)I")
	static int method32926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!xc", name = "<init>", descriptor = "()V")
	Class655() throws Throwable {
		throw new Error();
	}
}
