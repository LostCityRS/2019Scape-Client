package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public class Class268 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 11)
	Class268() {
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(Lclient!alw;B)V", line = 15)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26260(arg0, local3, -1315596032);
		}
	}

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "(Lclient!alw;)V", line = 15)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26260(arg0, local3, -915189183);
		}
	}

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "(Lclient!alw;)V", line = 15)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26260(arg0, local3, -1834653092);
		}
	}

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "(Lclient!alw;)V", line = 15)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26260(arg0, local3, 2076599420);
		}
	}

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "(Lclient!alw;)V", line = 15)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26260(arg0, local3, 1810455931);
		}
	}

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "(Lclient!alw;II)V", line = 22)
	void method26260(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray23 = new boolean[400];
			local10 = arg0.gSmart1or2((byte) -25);
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray23[arg0.gSmart1or2((byte) -77)] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1((short) 16384);
			local10 = arg0.gSmart1or2((byte) -110);
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2((byte) -125);
				arg0.g1((short) 16384);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(Lclient!alw;I)V", line = 22)
	void method26261(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray23 = new boolean[400];
			local10 = arg0.gSmart1or2((byte) -54);
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray23[arg0.gSmart1or2((byte) -41)] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1((short) 16384);
			local10 = arg0.gSmart1or2((byte) -88);
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2((byte) -80);
				arg0.g1((short) 16384);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "(Lclient!alw;I)V", line = 22)
	void method26262(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray23 = new boolean[400];
			local10 = arg0.gSmart1or2((byte) -3);
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray23[arg0.gSmart1or2((byte) -1)] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1((short) 16384);
			local10 = arg0.gSmart1or2((byte) -100);
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2((byte) -19);
				arg0.g1((short) 16384);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(Lclient!alw;I)V", line = 22)
	void method26263(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray23 = new boolean[400];
			local10 = arg0.gSmart1or2((byte) -84);
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray23[arg0.gSmart1or2((byte) -51)] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1((short) 16384);
			local10 = arg0.gSmart1or2((byte) -58);
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2((byte) -74);
				arg0.g1((short) 16384);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIIII)V", line = 32)
	public static void method26264(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		Class171.aClass390_8 = arg0;
		Class171.aClass392_8 = arg1;
		Class171.anInt3055 = arg2 * 1158229371;
		Class355.anInt4219 = arg3 * -546678407;
		Class171.anInt3056 = arg4 * -2019906359;
		Class653.anInt5805 = arg5 * -1369733663;
		Class160.anInt1962 = arg6 * -765907503;
		Class296.anInt3919 = arg7 * 929248895;
		Class628.anInt5707 = arg8 * -1945750021;
		Class171.aClass105_2 = null;
		Class171.aClass105_1 = null;
		Class531.aClass105_3 = null;
		Class95.anInt320 = arg9 * 1219501199;
		Class171.anInt3057 = arg10 * -443119733;
		Class110_Sub23.method8623(686327674);
		Class93_Sub1_Sub1.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "(I)V", line = 38)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "()V", line = 38)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "(IB)V", line = 39)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "(I)V", line = 39)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "(I)V", line = 39)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "fe", descriptor = "(I)V", line = 2879)
	static final void method26265(@OriginalArg(0) int arg0) {
		if (client.anInt3453 * 1752864911 > 1) {
			client.anInt3453 -= -172784017;
			client.anInt3550 = client.anInt3565 * -1649412131;
		}
		if (client.aClass175_2.aBoolean564) {
			client.aClass175_2.aBoolean564 = false;
			Class565.method31252(-2066387364);
			return;
		}
		if (!Class454.aBoolean773) {
			Class264.method26209((byte) -109);
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Class247.method25915(client.aClass175_2, -305693694); local27++) {
		}
		if (client.state * -849002901 != 18) {
			return;
		}
		@Pc(63) int local63;
		@Pc(52) ClientMessage local52;
		while (Class33.method677(-1408990993)) {
			local52 = Class102.createGameMessage(ClientProt.aClientProt_74, client.aClass175_2.clientIsaac, (byte) 124);
			local52.packet.p1(0, (byte) -38);
			local63 = local52.packet.pos * 212851357;
			Class359.method27787(local52.packet, -1023210575);
			local52.packet.psize1(local52.packet.pos * 212851357 - local63, (byte) 87);
			client.aClass175_2.send(local52, -1777674683);
		}
		@Pc(129) int local129;
		if (Class653.aClass678_2 == null) {
			if (Class305.method26797(1272065378) >= Class442.aLong276 * 2005126307215913191L) {
				Class653.aClass678_2 = client.aClass698_1.method36684(Class50.world.host, (byte) 1);
			}
		} else if (Class653.aClass678_2.anInt5886 * 1528915565 != -1) {
			local52 = Class102.createGameMessage(ClientProt.aClientProt_76, client.aClass175_2.clientIsaac, (byte) 95);
			if (Class93_Sub28.aGarbageCollectorMXBean1 == null || !Class93_Sub28.aGarbageCollectorMXBean1.isValid()) {
				try {
					@Pc(105) Iterator local105 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (local105.hasNext()) {
						@Pc(112) GarbageCollectorMXBean local112 = (GarbageCollectorMXBean) local105.next();
						if (local112.isValid()) {
							Class93_Sub28.aGarbageCollectorMXBean1 = local112;
							client.aLong246 = -7217957106487703565L;
							client.aLong245 = 5212376496802918447L;
						}
					}
				} catch (@Pc(124) Throwable local124) {
				}
			}
			@Pc(127) long local127 = Class305.method26797(1230136145);
			local129 = -1;
			if (Class93_Sub28.aGarbageCollectorMXBean1 != null) {
				@Pc(134) long local134 = Class93_Sub28.aGarbageCollectorMXBean1.getCollectionTime();
				if (client.aLong245 * 8633274816738437425L != -1L) {
					@Pc(146) long local146 = local134 - client.aLong245 * 8633274816738437425L;
					@Pc(152) long local152 = local127 - client.aLong246 * -4613881522502347067L;
					if (local152 != 0L) {
						local129 = (int) (local146 * 100L / local152);
					}
				}
				client.aLong245 = local134 * -5212376496802918447L;
				client.aLong246 = local127 * 7217957106487703565L;
			}
			local52.packet.p2_alt1(Class653.aClass678_2.anInt5886 * 1528915565, (byte) 42);
			local52.packet.p1_alt3(client.anInt3407 * 1249273355, (byte) -74);
			local52.packet.p1(local129, (byte) 3);
			client.aClass175_2.send(local52, -1641840970);
			Class653.aClass678_2 = null;
			Class442.aLong276 = (local127 + 30000L) * 3040038476132704983L;
		}
		Class285.method26513(1661842445);
		Class591.method31696(-1831053519);
		@Pc(226) Class93_Sub23 local226 = (Class93_Sub23) client.aClass22_45.method428((byte) 93);
		if (client.world.method30481(-922608362) != null) {
			if (Class429.anInt4781 * -1453926679 == 5) {
				Class166_Sub6.method15485((byte) 69);
			} else if (Class429.anInt4781 * -1453926679 == 6) {
				Class631.method32281(-1059938774);
			}
		}
		if (client.aBoolean618) {
			client.aBoolean618 = false;
		} else {
			client.aFloat255 /= 2.0F;
		}
		if (client.aBoolean631) {
			client.aBoolean631 = false;
		} else {
			client.aFloat254 /= 2.0F;
		}
		@Pc(285) int local285;
		if (Class253.method25991((byte) 19)) {
			Class226.method25606((byte) 21);
		} else if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(278) Class611 local278 = client.world.method30455(1948712438);
			local285 = local278.anInt5623 * 270611681 << 9;
			local129 = local278.anInt5624 * -1994307635 << 9;
			if (Class120.aLong32 * 3284406794071211249L <= 0L) {
				Class120.aLong32 = Class305.method26797(-45083014) * -7990349007261731823L;
			}
			@Pc(311) float local311 = (float) (Class305.method26797(1348635194) - Class120.aLong32 * 3284406794071211249L);
			@Pc(316) int local316 = 1000 / Class451.method28950((byte) 3);
			@Pc(322) int local322 = (int) ((double) local316 * 1.25D);
			while (local311 > 0.0F) {
				@Pc(331) float local331 = Math.min(local311, (float) local322);
				Class65.aClass123_Sub1_2.method8925(local331 / 1000.0F, client.world.method30511(-310507201).anIntArrayArrayArray14, client.world.method30487(209855820), local285, local129, 1160510591);
				local311 -= local322;
			}
			Class120.aLong32 = Class305.method26797(889115132) * -7990349007261731823L;
		}
		Class233.method25733(273180016);
		if (client.state * -849002901 != 18) {
			return;
		}
		client.world.method30494((byte) -85).method32962(client.world, (byte) 3);
		Class296.method26608((byte) 47);
		if (client.anInt3494 * -850888501 > 10) {
			client.aClass175_2.anInt3298 += -1887848975;
		}
		if (client.aClass175_2.anInt3298 * -1176331503 > 2250) {
			Class565.method31252(-2066387364);
			return;
		}
		if (client.anInt3463 * 1819062465 == 3) {
			Class608.method31961((byte) 42);
			Class110_Sub1.method6372(-621154092);
		} else if (Class119.aClass650_2.anInterface67_5.method32253(local226, client.anInterface66Array1, client.anInt3450 * -938319179, Class112_Sub2_Sub2.aClass158_2, -1680178735)) {
			Class501.method30168(false, 294148195);
		} else {
			if (client.anInt3463 * 1819062465 == 2 && Class661.method32840(client.anInt3462 * 1756332913, -1517051870)) {
				client.world.beginRebuild(new Class537(Class526.aClass526_2, null), 1326237852);
				client.anInt3463 = 389013313;
			}
			if (client.anInt3463 * 1819062465 == 1 && client.state * -849002901 != 3) {
				Class249.aClass16_24.method225((byte) 119);
				client.anInt3463 = 0;
				client.anInt3556 = client.anInt3485 * 389330083;
				client.anInt3436 = 0;
				client.aBoolean613 = false;
				Class212.method25441(-1241016248);
			}
			if (client.anInt3463 * 1819062465 == 0) {
				local63 = client.anInt3485 - client.anInt3556 * 1190764299;
				if (client.anInt3436 * 1328106925 < Class249.aClass110Array1.length) {
					do {
						@Pc(487) Class110 local487 = Class249.aClass110Array1[client.anInt3436 * 1328106925];
						if (local487.anInt2820 * 1441716501 > local63) {
							break;
						}
						local487.method20149(1642322074);
					} while (client.anInt3463 * 1819062465 == 0 && (client.anInt3436 += -1437360603) * 1328106925 < Class249.aClass110Array1.length);
				}
				if (client.anInt3463 * 1819062465 == 0) {
					for (local285 = 0; local285 < Class249.aClass239Array1.length; local285++) {
						@Pc(528) Class239 local528 = Class249.aClass239Array1[local285];
						if (local528.aBoolean662) {
							@Pc(536) Class132_Sub1_Sub1_Sub1 local536 = local528.method25813(-538637995);
							Class233.method25734(local536, true, (byte) 9);
						}
					}
				}
			}
		}
		Class393.method28317((byte) 55);
		Class147.method12688((byte) 1);
		Class663.method32868((byte) -92);
		Class275.method26342(false, (byte) 6);
		Class602.method31866(Class694.aClass104_14, Class619.aClass225_8, 141796524);
		client.anInt3480 += -1187079961;
		if (client.anInt3501 * -446949609 != 0) {
			client.anInt3500 += 1088698484;
			if (client.anInt3500 * -741034743 >= 400) {
				client.anInt3501 = 0;
			}
		}
		if (Class627.aClass312_12 != null) {
			client.anInt3502 += 1535872881;
			if (client.anInt3502 * -2145300079 >= 15) {
				Class354.method27694(Class627.aClass312_12, -1174743804);
				Class627.aClass312_12 = null;
			}
		}
		client.aClass312_6 = null;
		client.aBoolean628 = false;
		client.aBoolean614 = false;
		Class378.aClass312_10 = null;
		Class32_Sub15.method17180(null, -1, -1, (byte) 13);
		if (!client.aBoolean625) {
			client.anInt3520 = 410366683;
		}
		Class356.method27708(-1043586684);
		client.anInt3565 += -782787733;
		@Pc(622) ClientMessage local622;
		if (client.aBoolean635) {
			local622 = Class102.createGameMessage(ClientProt.aClientProt_10, client.aClass175_2.clientIsaac, (byte) 87);
			local622.packet.p4_alt3(Class570.anInt5397 * -554382929 << 28 | Class523.anInt5225 * -2075541317 << 14 | Class562.anInt5352 * 1760194437, (byte) -15);
			client.aClass175_2.send(local622, -1920560437);
			client.aBoolean635 = false;
		}
		while (true) {
			@Pc(652) Class93_Sub39 local652;
			@Pc(659) Class312 local659;
			@Pc(671) Class312 local671;
			do {
				local652 = (Class93_Sub39) client.aClass22_48.method415(742291621);
				if (local652 == null) {
					while (true) {
						do {
							local652 = (Class93_Sub39) client.aClass22_49.method415(742291621);
							if (local652 == null) {
								while (true) {
									do {
										local652 = (Class93_Sub39) client.aClass22_47.method415(742291621);
										if (local652 == null) {
											if (Class378.aClass312_10 == null) {
												client.anInt3535 = 0;
											}
											if (client.aClass312_5 != null) {
												Class491.method29981(619345558);
											}
											Class593.method31715((byte) 72);
											if (client.userStaffModLevel * 2055688893 > 0 && Class112_Sub2_Sub2.aClass158_2.method14313(82, -898822318) && Class112_Sub2_Sub2.aClass158_2.method14313(81, -714138076) && client.anInt3446 * 1897469075 != 0) {
												local63 = Class520.selfPlayer.aByte100 - client.anInt3446 * 1897469075;
												if (local63 < 0) {
													local63 = 0;
												} else if (local63 > 3) {
													local63 = 3;
												}
												@Pc(855) Class611 local855 = client.world.method30455(1691996593);
												Class684.method33422(local63, local855.anInt5623 * 270611681 + Class520.selfPlayer.anIntArray240[0], local855.anInt5624 * -1994307635 + Class520.selfPlayer.anIntArray239[0], (byte) 118);
											}
											for (local63 = 0; local63 < 5; local63++) {
												@Pc(885) int local885 = client.anIntArray318[local63]++;
											}
											if (Class596.aClass113_Sub1_1.aBoolean171 && Class596.aClass113_Sub1_1.aLong26 * 333245577734160197L < Class305.method26797(929682342) - 60000L) {
												Class25.method23117(268643627);
											}
											Class596.aClass113_Sub1_1.method7422(-737704411);
											for (@Pc(913) Class149_Sub2 local913 = (Class149_Sub2) client.aClass21_8.method390((short) 15439); local913 != null; local913 = (Class149_Sub2) client.aClass21_8.method392(-1915563430)) {
												if ((long) (local913.anInt1400 * 147268085) < Class305.method26797(128851323) / 1000L - 5L) {
													if (local913.aShort77 > 0) {
														Class227.method25612(5, 0, "", "", "", local913.aString42 + Class74.aClass74_1.method1259(Class106.lang, (byte) 40), null, -1832767344);
													}
													if (local913.aShort77 == 0) {
														Class227.method25612(5, 0, "", "", "", local913.aString42 + Class74.aClass74_126.method1259(Class106.lang, (byte) -22), null, -1919256656);
													}
													local913.method23766(-719770481);
												}
											}
											client.anInt3476 += -1112256587;
											if (client.anInt3476 * 1302685341 > 509) {
												client.anInt3476 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3469 += client.anInt3473 * -415349033;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3474 += client.anInt3538 * 1888387983;
												}
												if ((local63 & 0x4) == 4) {
													client.anInt3461 += client.anInt3475 * 849052597;
												}
											}
											if (client.anInt3469 * 2040985693 < -52) {
												client.anInt3473 = -6788058;
											}
											if (client.anInt3469 * 2040985693 > 50) {
												client.anInt3473 = 6788058;
											}
											if (client.anInt3474 * -1711095971 < -58) {
												client.anInt3538 = 1860512374;
											}
											if (client.anInt3474 * -1711095971 > 61) {
												client.anInt3538 = -1860512374;
											}
											if (client.anInt3461 * 1018036723 < -44) {
												client.anInt3475 = -459494097;
											}
											if (client.anInt3461 * 1018036723 > 44) {
												client.anInt3475 = 459494097;
											}
											client.anInt3516 += 9180925;
											if (client.anInt3516 * 740243029 > 509) {
												client.anInt3516 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3477 += client.anInt3549 * -1688945991;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3478 += client.anInt3567 * 1726169003;
												}
											}
											if (client.anInt3477 * -1357343303 < -69) {
												client.anInt3549 = -1287628638;
											}
											if (client.anInt3477 * -1357343303 > 63) {
												client.anInt3549 = 1287628638;
											}
											if (client.anInt3478 * 663566609 < -22) {
												client.anInt3567 = 873732819;
											}
											if (client.anInt3478 * 663566609 > 10) {
												client.anInt3567 = -873732819;
											}
											client.aClass175_2.anInt3300 += -1073519993;
											if (client.aClass175_2.anInt3300 * -1270889673 > 50) {
												local622 = Class102.createGameMessage(ClientProt.aClientProt_105, client.aClass175_2.clientIsaac, (byte) 57);
												client.aClass175_2.send(local622, -1516030500);
											}
											if (client.aBoolean634) {
												Class77.method1301(-802518606);
												client.aBoolean634 = false;
											}
											try {
												client.aClass175_2.flush((byte) 34);
											} catch (@Pc(1174) IOException local1174) {
												Class565.method31252(-2066387364);
											}
											return;
										}
										local659 = local652.aClass312_1;
										if (local659.anInt3970 * 532402067 < 0) {
											break;
										}
										local671 = Class659.method32808(local659.anInt3985 * 897022795, -203225570);
									} while (local671 == null || local671.aClass312Array2 == null || local659.anInt3970 * 532402067 >= local671.aClass312Array2.length || local671.aClass312Array2[local659.anInt3970 * 532402067] != local659);
									Class211.method25429(local652, 488296313);
								}
							}
							local659 = local652.aClass312_1;
							if (local659.anInt3970 * 532402067 < 0) {
								break;
							}
							local671 = Class659.method32808(local659.anInt3985 * 897022795, 1761075059);
						} while (local671 == null || local671.aClass312Array2 == null || local659.anInt3970 * 532402067 >= local671.aClass312Array2.length || local659 != local671.aClass312Array2[local659.anInt3970 * 532402067]);
						Class211.method25429(local652, 288867900);
					}
				}
				local659 = local652.aClass312_1;
				if (local659.anInt3970 * 532402067 < 0) {
					break;
				}
				local671 = Class659.method32808(local659.anInt3985 * 897022795, 1435531487);
			} while (local671 == null || local671.aClass312Array2 == null || local659.anInt3970 * 532402067 >= local671.aClass312Array2.length || local671.aClass312Array2[local659.anInt3970 * 532402067] != local659);
			Class211.method25429(local652, 1406500311);
		}
	}

	@OriginalMember(owner = "client!fm", name = "ade", descriptor = "(Lclient!yf;B)V", line = 10145)
	static final void method26266(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5233 * -456480727;
	}

	@OriginalMember(owner = "client!fm", name = "aqh", descriptor = "(Lclient!yf;I)V", line = 12824)
	static final void method26267(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
