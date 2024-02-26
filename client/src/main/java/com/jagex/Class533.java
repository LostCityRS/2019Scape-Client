package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class533 {

	@OriginalMember(owner = "client!rl", name = "gx", descriptor = "Lclient!aow;")
	public static Class41_Sub18 aClass41_Sub18_1;

	@OriginalMember(owner = "client!rl", name = "jy", descriptor = "Lclient!yr;")
	static Class692 aClass692_2;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "B")
	byte aByte148;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public int anInt5070;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public int anInt5071;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
	public int anInt5069;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public int anInt5073;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(Lclient!ald;Lclient!add;)Lclient!abg;")
	static Class33 method30823(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		@Pc(4) Class33 local4 = new Class33(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method23362(470569763);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class519 local18 = (Class519) Class622.method32436(Class519.class, local8, -320790979);
			while (true) {
				@Pc(22) int local22 = arg0.method23362(-181699633);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3152 -= 1034180571;
				@Pc(38) Class460 local38 = arg1.method1828(arg0, local18, -1530590283);
				if (local38 != null) {
					local4.method719(local38.anInt4907 * -38979583, local38.anObject19, -2019449857);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(Lclient!ald;Lclient!add;)Lclient!abg;")
	static Class33 method30826(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		@Pc(4) Class33 local4 = new Class33(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method23362(-1613557462);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class519 local18 = (Class519) Class622.method32436(Class519.class, local8, -1740482794);
			while (true) {
				@Pc(22) int local22 = arg0.method23362(-2069182456);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3152 -= 1034180571;
				@Pc(38) Class460 local38 = arg1.method1828(arg0, local18, -1615742430);
				if (local38 != null) {
					local4.method719(local38.anInt4907 * -38979583, local38.anObject19, -1720378366);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(B)Lclient!als;")
	static Class72_Sub1 method30828(@OriginalArg(0) byte arg0) {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class450.aString209.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (Class171.aBoolean620) {
			local3.method15584(16, 1485243647);
			local5 = false;
		}
		if (Class171.aBoolean621) {
			local3.method15584(32, 237429099);
			local7 = false;
		}
		if (Class171.aBoolean619) {
			local3.method15584(16384, -241584997);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class2.method1815(local3, (byte) -49);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 3, (byte) 15);
				Class719.method37291(-730941247);
				local61 = Class257.method26428(3, 1000, 843622019);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1882120164) == 3) {
					local3.method15584(4, -1099186661);
					@Pc(91) Class203 local91 = Class279.aClass102_9.method20656();
					@Pc(98) long local98 = local91.aLong341 * 5566305393711832135L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3384 * 1548391145) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(512, 1192760216);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(256, 1234327803);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method15584(4096, 1532024739);
			}
		}
		if (local9) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 5, (byte) 92);
				Class719.method37291(103167945);
				local63 = Class257.method26428(5, 1000, 721747691);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-473840640) == 5) {
					local3.method15584(8192, -791799593);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method15584(32768, 2108256805);
			}
		}
		if (local5) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 4, (byte) 110);
				Class719.method37291(381802418);
				local59 = Class257.method26428(1, 1000, -435226540);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-820418599) == 1) {
					local3.method15584(2, 1101165004);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method15584(2048, -1967073739);
			}
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 0, (byte) 108);
		if (local59 == -1 && local61 == -1) {
			Class2.method1815(local3, (byte) -42);
			return local3;
		}
		local3.method15585(3, local61, 1146791141);
		local3.method15585(1, local59, -1203317426);
		local3.method15585(5, local63, 1220825890);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class535.method30855(local3, 1, local61 == -1 ? local59 : local61, (byte) 117);
		} else {
			Class535.method30855(local3, 3, local59 == -1 ? local61 : local59, (byte) 97);
		}
		return local3;
	}

	@OriginalMember(owner = "client!rl", name = "ajm", descriptor = "(Lclient!yp;I)V")
	static void method30829(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!rl", name = "aul", descriptor = "(Lclient!yp;B)V")
	static void method30830(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub27_4.method16402((byte) -28);
	}

	@OriginalMember(owner = "client!rl", name = "ayz", descriptor = "(Lclient!yp;B)V")
	static void method30831(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class123_Sub3.method10025(844376209);
		RuntimeException_Sub2.method23509(1386170075);
		client.aClass539_1.method30938(137135323);
		Class719.method37291(-34725456);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!rl", name = "ge", descriptor = "(B)V")
	static void method30832(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = Class80_Sub1_Sub1.anInt254 * -255202897;
		@Pc(7) int local7 = Class80_Sub25.anInt1627 * 167687103;
		if (Class334.anInt4196 * -455826321 < local3) {
			local3 = Class334.anInt4196 * -455826321;
		}
		if (Class286.anInt3942 * -1411780839 < local7) {
			local7 = Class286.anInt3942 * -1411780839;
		}
		try {
			if (Class703.aClass80_Sub37_49 != null) {
				Class442.aClass442_11.method29195(new Object[] { local3, local7, Class17.method437(-1349690784), Class703.aClass80_Sub37_49.aClass165_Sub8_1.method15974(-462236994) }, 1760882638);
			}
		} catch (@Pc(59) Throwable local59) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "ahs", descriptor = "(Lclient!yp;I)V")
	static void method30833(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (client.anInt3512 * -780671365 == 0 && (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733)) {
			return;
		}
		@Pc(28) String local28 = local13.toLowerCase();
		@Pc(30) byte local30 = 0;
		if (local28.startsWith(Class60.aClass60_86.method1180(Class719.aClass719_4, 1764173026))) {
			local30 = 0;
			local13 = local13.substring(Class60.aClass60_86.method1180(Class719.aClass719_4, 479696763).length());
		} else if (local28.startsWith(Class60.aClass60_160.method1180(Class719.aClass719_4, -301454138))) {
			local30 = 1;
			local13 = local13.substring(Class60.aClass60_160.method1180(Class719.aClass719_4, -1428538348).length());
		} else if (local28.startsWith(Class60.aClass60_161.method1180(Class719.aClass719_4, 1818911673))) {
			local30 = 2;
			local13 = local13.substring(Class60.aClass60_161.method1180(Class719.aClass719_4, -1524000684).length());
		} else if (local28.startsWith(Class60.aClass60_164.method1180(Class719.aClass719_4, 799882898))) {
			local30 = 3;
			local13 = local13.substring(Class60.aClass60_164.method1180(Class719.aClass719_4, 1308300921).length());
		} else if (local28.startsWith(Class60.aClass60_70.method1180(Class719.aClass719_4, 789439601))) {
			local30 = 4;
			local13 = local13.substring(Class60.aClass60_70.method1180(Class719.aClass719_4, 1820913941).length());
		} else if (local28.startsWith(Class60.aClass60_62.method1180(Class719.aClass719_4, -947524088))) {
			local30 = 5;
			local13 = local13.substring(Class60.aClass60_62.method1180(Class719.aClass719_4, 984074962).length());
		} else if (local28.startsWith(Class60.aClass60_165.method1180(Class719.aClass719_4, -833304079))) {
			local30 = 6;
			local13 = local13.substring(Class60.aClass60_165.method1180(Class719.aClass719_4, 990638921).length());
		} else if (local28.startsWith(Class60.aClass60_112.method1180(Class719.aClass719_4, 907613689))) {
			local30 = 7;
			local13 = local13.substring(Class60.aClass60_112.method1180(Class719.aClass719_4, -1406392112).length());
		} else if (local28.startsWith(Class60.aClass60_167.method1180(Class719.aClass719_4, -144425616))) {
			local30 = 8;
			local13 = local13.substring(Class60.aClass60_167.method1180(Class719.aClass719_4, 1325180745).length());
		} else if (local28.startsWith(Class60.aClass60_151.method1180(Class719.aClass719_4, -1341674368))) {
			local30 = 9;
			local13 = local13.substring(Class60.aClass60_151.method1180(Class719.aClass719_4, 1067078646).length());
		} else if (local28.startsWith(Class60.aClass60_19.method1180(Class719.aClass719_4, -553654155))) {
			local30 = 10;
			local13 = local13.substring(Class60.aClass60_19.method1180(Class719.aClass719_4, 363517505).length());
		} else if (local28.startsWith(Class60.aClass60_170.method1180(Class719.aClass719_4, 2060901647))) {
			local30 = 11;
			local13 = local13.substring(Class60.aClass60_170.method1180(Class719.aClass719_4, -1481413226).length());
		} else if (Class512.aClass719_3 != Class719.aClass719_4) {
			if (local28.startsWith(Class60.aClass60_86.method1180(Class512.aClass719_3, -493113642))) {
				local30 = 0;
				local13 = local13.substring(Class60.aClass60_86.method1180(Class512.aClass719_3, -1393208277).length());
			} else if (local28.startsWith(Class60.aClass60_160.method1180(Class512.aClass719_3, 723739235))) {
				local30 = 1;
				local13 = local13.substring(Class60.aClass60_160.method1180(Class512.aClass719_3, -243564844).length());
			} else if (local28.startsWith(Class60.aClass60_161.method1180(Class512.aClass719_3, 808102073))) {
				local30 = 2;
				local13 = local13.substring(Class60.aClass60_161.method1180(Class512.aClass719_3, -1930262062).length());
			} else if (local28.startsWith(Class60.aClass60_164.method1180(Class512.aClass719_3, -1876549493))) {
				local30 = 3;
				local13 = local13.substring(Class60.aClass60_164.method1180(Class512.aClass719_3, 195076770).length());
			} else if (local28.startsWith(Class60.aClass60_70.method1180(Class512.aClass719_3, 387144852))) {
				local30 = 4;
				local13 = local13.substring(Class60.aClass60_70.method1180(Class512.aClass719_3, 106970831).length());
			} else if (local28.startsWith(Class60.aClass60_62.method1180(Class512.aClass719_3, -1385038108))) {
				local30 = 5;
				local13 = local13.substring(Class60.aClass60_62.method1180(Class512.aClass719_3, 1608347585).length());
			} else if (local28.startsWith(Class60.aClass60_165.method1180(Class512.aClass719_3, -1984874193))) {
				local30 = 6;
				local13 = local13.substring(Class60.aClass60_165.method1180(Class512.aClass719_3, 797090702).length());
			} else if (local28.startsWith(Class60.aClass60_112.method1180(Class512.aClass719_3, 1490223646))) {
				local30 = 7;
				local13 = local13.substring(Class60.aClass60_112.method1180(Class512.aClass719_3, 176071366).length());
			} else if (local28.startsWith(Class60.aClass60_167.method1180(Class512.aClass719_3, -607432800))) {
				local30 = 8;
				local13 = local13.substring(Class60.aClass60_167.method1180(Class512.aClass719_3, 1713019721).length());
			} else if (local28.startsWith(Class60.aClass60_151.method1180(Class512.aClass719_3, -415848905))) {
				local30 = 9;
				local13 = local13.substring(Class60.aClass60_151.method1180(Class512.aClass719_3, -1724643310).length());
			} else if (local28.startsWith(Class60.aClass60_19.method1180(Class512.aClass719_3, -278377139))) {
				local30 = 10;
				local13 = local13.substring(Class60.aClass60_19.method1180(Class512.aClass719_3, -1172617718).length());
			} else if (local28.startsWith(Class60.aClass60_170.method1180(Class512.aClass719_3, -930776962))) {
				local30 = 11;
				local13 = local13.substring(Class60.aClass60_170.method1180(Class512.aClass719_3, 928294360).length());
			}
		}
		local28 = local13.toLowerCase();
		@Pc(469) byte local469 = 0;
		if (local28.startsWith(Class60.aClass60_118.method1180(Class719.aClass719_4, -966281748))) {
			local469 = 1;
			local13 = local13.substring(Class60.aClass60_118.method1180(Class719.aClass719_4, 1640417964).length());
		} else if (local28.startsWith(Class60.aClass60_172.method1180(Class719.aClass719_4, 123072912))) {
			local469 = 2;
			local13 = local13.substring(Class60.aClass60_172.method1180(Class719.aClass719_4, -893508071).length());
		} else if (local28.startsWith(Class60.aClass60_173.method1180(Class719.aClass719_4, -733454970))) {
			local469 = 3;
			local13 = local13.substring(Class60.aClass60_173.method1180(Class719.aClass719_4, -992321318).length());
		} else if (local28.startsWith(Class60.aClass60_135.method1180(Class719.aClass719_4, 1449168733))) {
			local469 = 4;
			local13 = local13.substring(Class60.aClass60_135.method1180(Class719.aClass719_4, -1049132886).length());
		} else if (local28.startsWith(Class60.aClass60_175.method1180(Class719.aClass719_4, 1887707759))) {
			local469 = 5;
			local13 = local13.substring(Class60.aClass60_175.method1180(Class719.aClass719_4, -1183737074).length());
		} else if (Class512.aClass719_3 != Class719.aClass719_4) {
			if (local28.startsWith(Class60.aClass60_118.method1180(Class512.aClass719_3, -1432539356))) {
				local469 = 1;
				local13 = local13.substring(Class60.aClass60_118.method1180(Class512.aClass719_3, 759096619).length());
			} else if (local28.startsWith(Class60.aClass60_172.method1180(Class512.aClass719_3, 1860757326))) {
				local469 = 2;
				local13 = local13.substring(Class60.aClass60_172.method1180(Class512.aClass719_3, 977858706).length());
			} else if (local28.startsWith(Class60.aClass60_173.method1180(Class512.aClass719_3, 1441900402))) {
				local469 = 3;
				local13 = local13.substring(Class60.aClass60_173.method1180(Class512.aClass719_3, 1193993488).length());
			} else if (local28.startsWith(Class60.aClass60_135.method1180(Class512.aClass719_3, 676777242))) {
				local469 = 4;
				local13 = local13.substring(Class60.aClass60_135.method1180(Class512.aClass719_3, 721913729).length());
			} else if (local28.startsWith(Class60.aClass60_175.method1180(Class512.aClass719_3, 727294502))) {
				local469 = 5;
				local13 = local13.substring(Class60.aClass60_175.method1180(Class512.aClass719_3, -1836655205).length());
			}
		}
		@Pc(654) Class75 local654 = Class52.method1074(16777215);
		@Pc(660) Class80_Sub31 local660 = Class623.method32440(Class443.aClass443_96, local654.aClass22_1, -191270971);
		local660.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		@Pc(671) int local671 = local660.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local660.aClass80_Sub36_Sub1_2.method23154(local30, 1275868335);
		local660.aClass80_Sub36_Sub1_2.method23154(local469, 1275868335);
		Class120_Sub1_Sub3_Sub2.method13850(local660.aClass80_Sub36_Sub1_2, local13, (short) 27600);
		local660.aClass80_Sub36_Sub1_2.method23171(local660.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local671, (byte) 48);
		local654.method1325(local660, (byte) -104);
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!ald;Lclient!add;)V")
	public Class533(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		this.aByte148 = arg0.method23177((byte) 1);
		this.anInt5070 = arg0.method23178((byte) -94) * -1933331193;
		this.anInt5071 = arg0.method23182(83185860) * -418791663;
		this.anInt5069 = arg0.method23182(-1478409473) * -1995451429;
		this.anInt5072 = arg0.method23182(-213617603) * -1156256375;
		this.anInt5073 = arg0.method23182(421333920) * -1476181311;
		if (arg1 != null) {
			Class164.method15803(arg0, arg1, -2053128479);
		}
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class533() {
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)I")
	public int method30824(@OriginalArg(0) byte arg0) {
		return this.aByte148 & 0x7;
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "()I")
	public int method30825() {
		return (this.aByte148 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)I")
	public int method30827(@OriginalArg(0) int arg0) {
		return (this.aByte148 & 0x8) == 8 ? 1 : 0;
	}
}
