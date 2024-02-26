package com.jagex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xj")
public final class Class662 {

	@OriginalMember(owner = "client!xj", name = "t", descriptor = "J")
	static long aLong409 = -3285507564811954843L;

	@OriginalMember(owner = "client!xj", name = "f", descriptor = "I")
	static int anInt5689 = 0;

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "Z")
	static boolean aBoolean975 = true;

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "Lclient!alz;")
	static final Class162_Sub2 aClass162_Sub2_1 = new Class162_Sub2();

	@OriginalMember(owner = "client!xj", name = "l", descriptor = "Lclient!alv;")
	static final Class162_Sub1 aClass162_Sub1_1 = new Class162_Sub1();

	@OriginalMember(owner = "client!xj", name = "g", descriptor = "Ljava/util/Queue;")
	static Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!xj", name = "j", descriptor = "()V")
	public static void method33322() {
		aClass162_Sub2_1.method15775(512534966);
		aClass162_Sub1_1.method15775(512534966);
		aLong409 = -3285507564811954843L;
		aBoolean975 = true;
	}

	@OriginalMember(owner = "client!xj", name = "m", descriptor = "()V")
	public static void method33323() {
		if (Class664.method33363(-1869397763)) {
			Class676.method33588(new Class663(), 564882342);
		}
	}

	@OriginalMember(owner = "client!xj", name = "o", descriptor = "()V")
	public static void method33324() {
		Class120_Sub1_Sub2_Sub1.method12503(1650286642);
	}

	@OriginalMember(owner = "client!xj", name = "s", descriptor = "(Lclient!akg;)V")
	public static void method33325(@OriginalArg(0) Class80_Sub17 arg0) {
		if (Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			aClass162_Sub2_1.method15789(arg0, 2063519947);
		} else {
			arg0.method23453(-454396966);
		}
	}

	@OriginalMember(owner = "client!xj", name = "a", descriptor = "(Lclient!akg;)V")
	public static void method33326(@OriginalArg(0) Class80_Sub17 arg0) {
		if (Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			aClass162_Sub2_1.method15789(arg0, 627055614);
		} else {
			arg0.method23453(-454396966);
		}
	}

	@OriginalMember(owner = "client!xj", name = "r", descriptor = "()V")
	public static void method33327() {
		Class340.method27908(2016147070);
		aClass162_Sub2_1.method15788(-60397728);
		aClass162_Sub1_1.method15788(-60397728);
		@Pc(17) Class80_Sub31 local17;
		@Pc(26) int local26;
		if (client.anInt3446 * -881615229 > 0) {
			local17 = Class623.method32440(Class443.aClass443_88, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23155(client.anInt3446 * 768506380, (byte) -100);
			for (local26 = 0; local26 < client.anInt3446 * -881615229; local26++) {
				@Pc(35) Interface63 local35 = client.anInterface63Array1[local26];
				@Pc(43) long local43 = local35.method14073((byte) 52) - aLong409 * -4819811191828173933L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong409 = local35.method14073((byte) 52) * 3285507564811954843L;
				local17.aClass80_Sub36_Sub1_2.method23154(local35.method14065(-1142250285), 1275868335);
				local17.aClass80_Sub36_Sub1_2.method23157((int) local43, 1872162009);
			}
			client.aClass75_1.method1325(local17, (byte) -4);
		}
		if (anInt5689 * 1994782525 > 0) {
			anInt5689 -= 1729697813;
		}
		if (client.aBoolean726 && anInt5689 * 1994782525 <= 0) {
			anInt5689 = 234217892;
			client.aBoolean726 = false;
			@Pc(114) int local114;
			if (Class368.anInt4502 * -1583611537 != 3) {
				local114 = (int) client.aFloat254 >> 3;
				local26 = (int) client.aFloat255 >> 3;
			} else if (Class160.aClass121_Sub1_2.method9607(-805288997) == Class340.aClass340_7) {
				@Pc(107) Class123_Sub3 local107 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1731364376);
				local114 = Class441.method29186(local107.aClass466_1, (byte) -119) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class627.method32544(local107.aClass466_1, 1945075709) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class80_Sub31 local153 = Class623.method32440(Class443.aClass443_39, client.aClass75_1.aClass22_1, -191270971);
			local153.aClass80_Sub36_Sub1_2.method23155(local26, (byte) -76);
			local153.aClass80_Sub36_Sub1_2.method23220(local114, 2036747717);
			client.aClass75_1.method1325(local153, (byte) -124);
		}
		if (Class597.aBoolean926 != aBoolean975) {
			aBoolean975 = Class597.aBoolean926;
			local17 = Class623.method32440(Class443.aClass443_16, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(Class597.aBoolean926 ? 1 : 0, 1275868335);
			client.aClass75_1.method1325(local17, (byte) -90);
		}
		if (!client.aBoolean714) {
			local17 = Class623.method32440(Class443.aClass443_11, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
			local26 = local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
			@Pc(214) Class80_Sub36 local214 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local17.aClass80_Sub36_Sub1_2.method23168(local214.aByteArray61, 0, local214.anInt3152 * -1380987821, (byte) 104);
			local17.aClass80_Sub36_Sub1_2.method23171(local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local26, (byte) 89);
			client.aClass75_1.method1325(local17, (byte) -64);
			client.aBoolean714 = true;
		}
		if (client.aBoolean707 || Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(109611698) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class279.aClass102_9.method20675();
		@Pc(259) Class80_Sub31 local259 = Class623.method32440(Class443.aClass443_110, client.aClass75_1.aClass22_1, -191270971);
		local259.aClass80_Sub36_Sub1_2.method23155(0, (byte) -8);
		@Pc(270) int local270 = local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		if (local253 == null || local253.length == 0) {
			local259.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local259.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(284) Class185[] local284 = Class185.method24805(-19041198);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class275.method26807(local288, local259.aClass80_Sub36_Sub1_2, (short) -19159);
					local259.aClass80_Sub36_Sub1_2.method23199(local292.size(), (byte) 0);
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
					local259.aClass80_Sub36_Sub1_2.method23174(local294, (byte) 57);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass80_Sub36_Sub1_2.method23174(local362 - local294, (byte) -67);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3326 == local253[local294]) {
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
		local259.aClass80_Sub36_Sub1_2.method23170(local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local270, -377880512);
		client.aClass75_1.method1325(local259, (byte) -106);
		client.aBoolean707 = true;
	}

	@OriginalMember(owner = "client!xj", name = "q", descriptor = "()V")
	public static void method33328() {
		Class340.method27908(1110430897);
		aClass162_Sub2_1.method15788(-60397728);
		aClass162_Sub1_1.method15788(-60397728);
		@Pc(17) Class80_Sub31 local17;
		@Pc(26) int local26;
		if (client.anInt3446 * -881615229 > 0) {
			local17 = Class623.method32440(Class443.aClass443_88, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23155(client.anInt3446 * 768506380, (byte) -107);
			for (local26 = 0; local26 < client.anInt3446 * -881615229; local26++) {
				@Pc(35) Interface63 local35 = client.anInterface63Array1[local26];
				@Pc(43) long local43 = local35.method14073((byte) 52) - aLong409 * -4819811191828173933L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong409 = local35.method14073((byte) 52) * 3285507564811954843L;
				local17.aClass80_Sub36_Sub1_2.method23154(local35.method14065(-1580653998), 1275868335);
				local17.aClass80_Sub36_Sub1_2.method23157((int) local43, -1171266103);
			}
			client.aClass75_1.method1325(local17, (byte) -51);
		}
		if (anInt5689 * 1994782525 > 0) {
			anInt5689 -= 1729697813;
		}
		if (client.aBoolean726 && anInt5689 * 1994782525 <= 0) {
			anInt5689 = 234217892;
			client.aBoolean726 = false;
			@Pc(114) int local114;
			if (Class368.anInt4502 * -1583611537 != 3) {
				local114 = (int) client.aFloat254 >> 3;
				local26 = (int) client.aFloat255 >> 3;
			} else if (Class160.aClass121_Sub1_2.method9607(-2080654173) == Class340.aClass340_7) {
				@Pc(107) Class123_Sub3 local107 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1594043013);
				local114 = Class441.method29186(local107.aClass466_1, (byte) -76) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class627.method32544(local107.aClass466_1, 1945075709) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class80_Sub31 local153 = Class623.method32440(Class443.aClass443_39, client.aClass75_1.aClass22_1, -191270971);
			local153.aClass80_Sub36_Sub1_2.method23155(local26, (byte) -91);
			local153.aClass80_Sub36_Sub1_2.method23220(local114, 2036747717);
			client.aClass75_1.method1325(local153, (byte) -6);
		}
		if (Class597.aBoolean926 != aBoolean975) {
			aBoolean975 = Class597.aBoolean926;
			local17 = Class623.method32440(Class443.aClass443_16, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(Class597.aBoolean926 ? 1 : 0, 1275868335);
			client.aClass75_1.method1325(local17, (byte) -65);
		}
		if (!client.aBoolean714) {
			local17 = Class623.method32440(Class443.aClass443_11, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
			local26 = local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
			@Pc(214) Class80_Sub36 local214 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local17.aClass80_Sub36_Sub1_2.method23168(local214.aByteArray61, 0, local214.anInt3152 * -1380987821, (byte) 126);
			local17.aClass80_Sub36_Sub1_2.method23171(local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local26, (byte) 31);
			client.aClass75_1.method1325(local17, (byte) -6);
			client.aBoolean714 = true;
		}
		if (client.aBoolean707 || Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(534452562) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class279.aClass102_9.method20675();
		@Pc(259) Class80_Sub31 local259 = Class623.method32440(Class443.aClass443_110, client.aClass75_1.aClass22_1, -191270971);
		local259.aClass80_Sub36_Sub1_2.method23155(0, (byte) -101);
		@Pc(270) int local270 = local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		if (local253 == null || local253.length == 0) {
			local259.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local259.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(284) Class185[] local284 = Class185.method24805(20681460);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class275.method26807(local288, local259.aClass80_Sub36_Sub1_2, (short) 9665);
					local259.aClass80_Sub36_Sub1_2.method23199(local292.size(), (byte) 0);
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
					local259.aClass80_Sub36_Sub1_2.method23174(local294, (byte) -51);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass80_Sub36_Sub1_2.method23174(local362 - local294, (byte) 3);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3326 == local253[local294]) {
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
		local259.aClass80_Sub36_Sub1_2.method23170(local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local270, -377880512);
		client.aClass75_1.method1325(local259, (byte) -58);
		client.aBoolean707 = true;
	}

	@OriginalMember(owner = "client!xj", name = "x", descriptor = "()V")
	public static void method33329() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			while (true) {
				@Pc(7) Class80_Sub17_Sub2 local7 = (Class80_Sub17_Sub2) aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method23453(-454396966);
			}
		}
	}

	@OriginalMember(owner = "client!xj", name = "w", descriptor = "()V")
	public static void method33330() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			while (true) {
				@Pc(7) Class80_Sub17_Sub2 local7 = (Class80_Sub17_Sub2) aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method23453(-454396966);
			}
		}
	}

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "()V")
	public static void method33331() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			while (true) {
				@Pc(7) Class80_Sub17_Sub2 local7 = (Class80_Sub17_Sub2) aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method23453(-454396966);
			}
		}
	}

	@OriginalMember(owner = "client!xj", name = "h", descriptor = "()V")
	public static void method33332() {
		Class340.method27908(736041120);
		aClass162_Sub2_1.method15788(-60397728);
		aClass162_Sub1_1.method15788(-60397728);
		@Pc(17) Class80_Sub31 local17;
		@Pc(26) int local26;
		if (client.anInt3446 * -881615229 > 0) {
			local17 = Class623.method32440(Class443.aClass443_88, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23155(client.anInt3446 * 768506380, (byte) -75);
			for (local26 = 0; local26 < client.anInt3446 * -881615229; local26++) {
				@Pc(35) Interface63 local35 = client.anInterface63Array1[local26];
				@Pc(43) long local43 = local35.method14073((byte) 52) - aLong409 * -4819811191828173933L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong409 = local35.method14073((byte) 52) * 3285507564811954843L;
				local17.aClass80_Sub36_Sub1_2.method23154(local35.method14065(-873072932), 1275868335);
				local17.aClass80_Sub36_Sub1_2.method23157((int) local43, 2143059575);
			}
			client.aClass75_1.method1325(local17, (byte) -85);
		}
		if (anInt5689 * 1994782525 > 0) {
			anInt5689 -= 1729697813;
		}
		if (client.aBoolean726 && anInt5689 * 1994782525 <= 0) {
			anInt5689 = 234217892;
			client.aBoolean726 = false;
			@Pc(114) int local114;
			if (Class368.anInt4502 * -1583611537 != 3) {
				local114 = (int) client.aFloat254 >> 3;
				local26 = (int) client.aFloat255 >> 3;
			} else if (Class160.aClass121_Sub1_2.method9607(-1793809382) == Class340.aClass340_7) {
				@Pc(107) Class123_Sub3 local107 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-2007918602);
				local114 = Class441.method29186(local107.aClass466_1, (byte) -66) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class627.method32544(local107.aClass466_1, 1945075709) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class80_Sub31 local153 = Class623.method32440(Class443.aClass443_39, client.aClass75_1.aClass22_1, -191270971);
			local153.aClass80_Sub36_Sub1_2.method23155(local26, (byte) -50);
			local153.aClass80_Sub36_Sub1_2.method23220(local114, 2036747717);
			client.aClass75_1.method1325(local153, (byte) -100);
		}
		if (Class597.aBoolean926 != aBoolean975) {
			aBoolean975 = Class597.aBoolean926;
			local17 = Class623.method32440(Class443.aClass443_16, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(Class597.aBoolean926 ? 1 : 0, 1275868335);
			client.aClass75_1.method1325(local17, (byte) -35);
		}
		if (!client.aBoolean714) {
			local17 = Class623.method32440(Class443.aClass443_11, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
			local26 = local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
			@Pc(214) Class80_Sub36 local214 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local17.aClass80_Sub36_Sub1_2.method23168(local214.aByteArray61, 0, local214.anInt3152 * -1380987821, (byte) 69);
			local17.aClass80_Sub36_Sub1_2.method23171(local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local26, (byte) 62);
			client.aClass75_1.method1325(local17, (byte) -70);
			client.aBoolean714 = true;
		}
		if (client.aBoolean707 || Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-442362811) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class279.aClass102_9.method20675();
		@Pc(259) Class80_Sub31 local259 = Class623.method32440(Class443.aClass443_110, client.aClass75_1.aClass22_1, -191270971);
		local259.aClass80_Sub36_Sub1_2.method23155(0, (byte) -24);
		@Pc(270) int local270 = local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		if (local253 == null || local253.length == 0) {
			local259.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local259.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(284) Class185[] local284 = Class185.method24805(1397508250);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class275.method26807(local288, local259.aClass80_Sub36_Sub1_2, (short) 7434);
					local259.aClass80_Sub36_Sub1_2.method23199(local292.size(), (byte) 0);
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
					local259.aClass80_Sub36_Sub1_2.method23174(local294, (byte) -48);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass80_Sub36_Sub1_2.method23174(local362 - local294, (byte) 15);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3326 == local253[local294]) {
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
		local259.aClass80_Sub36_Sub1_2.method23170(local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local270, -377880512);
		client.aClass75_1.method1325(local259, (byte) -34);
		client.aBoolean707 = true;
	}

	@OriginalMember(owner = "client!xj", name = "d", descriptor = "()V")
	public static void method33333() {
		Class340.method27908(-432730845);
		aClass162_Sub2_1.method15788(-60397728);
		aClass162_Sub1_1.method15788(-60397728);
		@Pc(17) Class80_Sub31 local17;
		@Pc(26) int local26;
		if (client.anInt3446 * -881615229 > 0) {
			local17 = Class623.method32440(Class443.aClass443_88, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23155(client.anInt3446 * 768506380, (byte) -117);
			for (local26 = 0; local26 < client.anInt3446 * -881615229; local26++) {
				@Pc(35) Interface63 local35 = client.anInterface63Array1[local26];
				@Pc(43) long local43 = local35.method14073((byte) 52) - aLong409 * -4819811191828173933L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong409 = local35.method14073((byte) 52) * 3285507564811954843L;
				local17.aClass80_Sub36_Sub1_2.method23154(local35.method14065(-315816403), 1275868335);
				local17.aClass80_Sub36_Sub1_2.method23157((int) local43, 788927183);
			}
			client.aClass75_1.method1325(local17, (byte) -63);
		}
		if (anInt5689 * 1994782525 > 0) {
			anInt5689 -= 1729697813;
		}
		if (client.aBoolean726 && anInt5689 * 1994782525 <= 0) {
			anInt5689 = 234217892;
			client.aBoolean726 = false;
			@Pc(114) int local114;
			if (Class368.anInt4502 * -1583611537 != 3) {
				local114 = (int) client.aFloat254 >> 3;
				local26 = (int) client.aFloat255 >> 3;
			} else if (Class160.aClass121_Sub1_2.method9607(-1639616885) == Class340.aClass340_7) {
				@Pc(107) Class123_Sub3 local107 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1770127309);
				local114 = Class441.method29186(local107.aClass466_1, (byte) -118) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class627.method32544(local107.aClass466_1, 1945075709) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class80_Sub31 local153 = Class623.method32440(Class443.aClass443_39, client.aClass75_1.aClass22_1, -191270971);
			local153.aClass80_Sub36_Sub1_2.method23155(local26, (byte) -40);
			local153.aClass80_Sub36_Sub1_2.method23220(local114, 2036747717);
			client.aClass75_1.method1325(local153, (byte) -96);
		}
		if (Class597.aBoolean926 != aBoolean975) {
			aBoolean975 = Class597.aBoolean926;
			local17 = Class623.method32440(Class443.aClass443_16, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(Class597.aBoolean926 ? 1 : 0, 1275868335);
			client.aClass75_1.method1325(local17, (byte) -93);
		}
		if (!client.aBoolean714) {
			local17 = Class623.method32440(Class443.aClass443_11, client.aClass75_1.aClass22_1, -191270971);
			local17.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
			local26 = local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
			@Pc(214) Class80_Sub36 local214 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local17.aClass80_Sub36_Sub1_2.method23168(local214.aByteArray61, 0, local214.anInt3152 * -1380987821, (byte) 116);
			local17.aClass80_Sub36_Sub1_2.method23171(local17.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local26, (byte) 105);
			client.aClass75_1.method1325(local17, (byte) -9);
			client.aBoolean714 = true;
		}
		if (client.aBoolean707 || Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-776709064) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class279.aClass102_9.method20675();
		@Pc(259) Class80_Sub31 local259 = Class623.method32440(Class443.aClass443_110, client.aClass75_1.aClass22_1, -191270971);
		local259.aClass80_Sub36_Sub1_2.method23155(0, (byte) -48);
		@Pc(270) int local270 = local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		if (local253 == null || local253.length == 0) {
			local259.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local259.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(284) Class185[] local284 = Class185.method24805(-1148259287);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class275.method26807(local288, local259.aClass80_Sub36_Sub1_2, (short) 4881);
					local259.aClass80_Sub36_Sub1_2.method23199(local292.size(), (byte) 0);
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
					local259.aClass80_Sub36_Sub1_2.method23174(local294, (byte) 61);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass80_Sub36_Sub1_2.method23174(local362 - local294, (byte) 39);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3326 == local253[local294]) {
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
		local259.aClass80_Sub36_Sub1_2.method23170(local259.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local270, -377880512);
		client.aClass75_1.method1325(local259, (byte) -63);
		client.aBoolean707 = true;
	}

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "(I)V")
	public static void method33334(@OriginalArg(0) int arg0) {
		Class251.aClass24_25.method564(-288998330);
		Class251.aClass8_50.method260(734137473);
		Class251.aClass250Array1 = null;
		Class251.aClass254Array1 = null;
		Class700.aClass249Array1 = null;
		Class251.aClass239Array1 = null;
		Class251.aClass103Array1 = null;
		Class251.anInt3876 = -878712665;
		Class251.anInt3877 = 0;
		Class251.anInt3878 = 0;
		Class235.aClass252_1 = null;
		Class251.anInt3880 = 1851501401;
		Class251.anInt3879 = -1407837447;
		if (!Class251.aBoolean774) {
			return;
		}
		client.aShort154 = Class251.aShort164;
		client.aShort153 = Class253.aShort165;
		client.aShort160 = Class427.aShort172;
		client.aShort155 = Class113.aShort23;
		Class251.aBoolean774 = false;
	}

	@OriginalMember(owner = "client!xj", name = "<init>", descriptor = "()V")
	Class662() throws Throwable {
		throw new Error();
	}
}
