package com.jagex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alu")
public final class Class161_Sub1 extends Class161 implements Interface3 {

	@OriginalMember(owner = "client!alu", name = "o", descriptor = "Lclient!pf;")
	final Class480 aClass480_50;

	@OriginalMember(owner = "client!alu", name = "i", descriptor = "(I)V")
	public static void method15660(@OriginalArg(0) int arg0) {
		Class340.method27908(-510568645);
		Class662.aClass162_Sub2_1.method15788(-60397728);
		Class662.aClass162_Sub1_1.method15788(-60397728);
		@Pc(17) Class80_Sub31 local17;
		@Pc(26) int local26;
		if (client.anInt3446 * -881615229 > 0) {
			local17 = Class623.method32440(Class443.aClass443_88, client.aClass75_1.aClass22_1, -191270971);
			local17.aPacketBit_2.p2(client.anInt3446 * 768506380);
			for (local26 = 0; local26 < client.anInt3446 * -881615229; local26++) {
				@Pc(35) Interface63 local35 = client.anInterface63Array1[local26];
				@Pc(43) long local43 = local35.method14073((byte) 52) - Class662.aLong409 * -4819811191828173933L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				Class662.aLong409 = local35.method14073((byte) 52) * 3285507564811954843L;
				local17.aPacketBit_2.p1(local35.method14065(-1048577797));
				local17.aPacketBit_2.p3((int) local43);
			}
			client.aClass75_1.method1325(local17, (byte) -91);
		}
		if (Class662.anInt5689 * 1994782525 > 0) {
			Class662.anInt5689 -= 1729697813;
		}
		if (client.aBoolean726 && Class662.anInt5689 * 1994782525 <= 0) {
			Class662.anInt5689 = 234217892;
			client.aBoolean726 = false;
			@Pc(114) int local114;
			if (Class368.anInt4502 * -1583611537 != 3) {
				local114 = (int) client.aFloat254 >> 3;
				local26 = (int) client.aFloat255 >> 3;
			} else if (Class160.aClass121_Sub1_2.method9607(-1180806567) == Class340.aClass340_7) {
				@Pc(107) Class123_Sub3 local107 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1776795862);
				local114 = Class441.method29186(local107.aClass466_1, (byte) -91) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class627.method32544(local107.aClass466_1, 1945075709) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class80_Sub31 local153 = Class623.method32440(Class443.aClass443_39, client.aClass75_1.aClass22_1, -191270971);
			local153.aPacketBit_2.p2(local26);
			local153.aPacketBit_2.p2_alt3(local114);
			client.aClass75_1.method1325(local153, (byte) -3);
		}
		if (Class597.aBoolean926 != Class662.aBoolean975) {
			Class662.aBoolean975 = Class597.aBoolean926;
			local17 = Class623.method32440(Class443.aClass443_16, client.aClass75_1.aClass22_1, -191270971);
			local17.aPacketBit_2.p1(Class597.aBoolean926 ? 1 : 0);
			client.aClass75_1.method1325(local17, (byte) -25);
		}
		if (!client.aBoolean714) {
			local17 = Class623.method32440(Class443.aClass443_11, client.aClass75_1.aClass22_1, -191270971);
			local17.aPacketBit_2.p1(0);
			local26 = local17.aPacketBit_2.pos * -1380987821;
			@Pc(214) Packet local214 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local17.aPacketBit_2.pdata(local214.data, 0, local214.pos * -1380987821);
			local17.aPacketBit_2.p1check(local17.aPacketBit_2.pos * -1380987821 - local26);
			client.aClass75_1.method1325(local17, (byte) -26);
			client.aBoolean714 = true;
		}
		if (client.aBoolean707 || Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-235995267) != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class279.aClass102_9.method20675();
		@Pc(259) Class80_Sub31 local259 = Class623.method32440(Class443.aClass443_110, client.aClass75_1.aClass22_1, -191270971);
		local259.aPacketBit_2.p2(0);
		@Pc(270) int local270 = local259.aPacketBit_2.pos * -1380987821;
		if (local253 == null || local253.length == 0) {
			local259.aPacketBit_2.p1(0);
		} else {
			local259.aPacketBit_2.p1(1);
			@Pc(284) Class185[] local284 = Class185.method24805(479001129);
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class275.method26807(local288, local259.aPacketBit_2, (short) -6890);
					local259.aPacketBit_2.pSmart1or2s(local292.size());
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
					local259.aPacketBit_2.pSmart2or4null(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aPacketBit_2.pSmart2or4null(local362 - local294);
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
		local259.aPacketBit_2.p2check(local259.aPacketBit_2.pos * -1380987821 - local270);
		client.aClass75_1.method1325(local259, (byte) -60);
		client.aBoolean707 = true;
	}

	@OriginalMember(owner = "client!alu", name = "<init>", descriptor = "(ZLclient!pf;Lclient!zv;Lclient!zy;)V")
	Class161_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) Class722 arg3) {
		super(arg0, arg2, arg3);
		this.aClass480_50 = arg1;
	}

	@OriginalMember(owner = "client!alu", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class625(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alu", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class625(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alu", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class625.class;
	}

	@OriginalMember(owner = "client!alu", name = "i", descriptor = "(IB)Z")
	@Override
	boolean method15635(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29925(arg0, 0, 55784101);
		}
	}

	@OriginalMember(owner = "client!alu", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class625.class;
	}

	@OriginalMember(owner = "client!alu", name = "g", descriptor = "(II)[B")
	@Override
	byte[] method15638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29918(arg0, 0, 1896589581);
		}
	}

	@OriginalMember(owner = "client!alu", name = "a", descriptor = "(I)Z")
	@Override
	boolean method15642(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29925(arg0, 0, -2057030416);
		}
	}

	@OriginalMember(owner = "client!alu", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class625(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alu", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class625(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alu", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class625.class;
	}

	@OriginalMember(owner = "client!alu", name = "m", descriptor = "(I)[B")
	@Override
	byte[] method15637(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29918(arg0, 0, 1896589581);
		}
	}

	@OriginalMember(owner = "client!alu", name = "o", descriptor = "(I)[B")
	@Override
	byte[] method15640(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29918(arg0, 0, 1896589581);
		}
	}

	@OriginalMember(owner = "client!alu", name = "j", descriptor = "(I)Z")
	@Override
	boolean method15639(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_50;
		synchronized (this.aClass480_50) {
			return this.aClass480_50.method29925(arg0, 0, -805785134);
		}
	}

	@OriginalMember(owner = "client!alu", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class625(arg0, this, arg1);
	}
}
