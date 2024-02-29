package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaz")
public final class Class26 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!aaz", name = "tl", descriptor = "I")
	public static int anInt90;

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "I")
	public int anInt83;

	@OriginalMember(owner = "client!aaz", name = "u", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!aaz", name = "w", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!aaz", name = "z", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!aaz", name = "e", descriptor = "I")
	int anInt88 = 0;

	@OriginalMember(owner = "client!aaz", name = "n", descriptor = "I")
	public int anInt84 = 1078353519;

	@OriginalMember(owner = "client!aaz", name = "m", descriptor = "I")
	public int anInt85 = 1555887616;

	@OriginalMember(owner = "client!aaz", name = "k", descriptor = "Z")
	public boolean aBoolean12 = true;

	@OriginalMember(owner = "client!aaz", name = "f", descriptor = "Z")
	public boolean aBoolean13 = true;

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "(Lclient!dh;IB)Z")
	static boolean method579(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		arg0.method20513();
		Class305.method26889(825107433);
		if (!arg0.method20526(2114416749)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass532_1.method30625(514819425);
		@Pc(18) int local18 = client.aClass532_1.method30655((short) 128);
		@Pc(22) Class520 local22 = client.aClass532_1.method30690(-706123304);
		@Pc(26) Class585 local26 = client.aClass532_1.method30640(-1444248603);
		@Pc(28) int local28 = arg1;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(44) int local44 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local37 >= 0 && local37 < Class690.aBooleanArrayArray15.length && local44 >= 0 && local44 < Class690.aBooleanArrayArray15[local37].length && Class690.aBooleanArrayArray15[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local14 + local72; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30510(arg1, local92, local78, local85, (byte) -54)) {
						@Pc(108) int local108 = local92;
						if (local22.method30511(local78, local85, -662808309)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class103.method2810(local108, local78, local85, -1300508873);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = 48 + 48 + local14 * 4;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class112_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (Class172.aBoolean520) {
			Class172.aClass100_40 = arg0.method20508(local78, local78, false, true);
			local162 = arg0.method20456();
			local162.method23446(0, Class172.aClass100_40.method18179());
			@Pc(188) Interface19 local188 = arg0.method20432(local78, local78);
			local162.method23448(local188);
			arg0.method20453(local162, (byte) 1);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20786(1, 0);
		} else {
			Class172.aClass100_40 = arg0.method20510(local148, 0, local78, local78, local78, 438797212);
		}
		client.aClass532_1.method30713((byte) 33).method33148(730324292);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 1 + 2][2 + 1 + local70];
		arg0.method20637(Class172.anIntArray269);
		arg0.method20574();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local14 + local72; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local70 + local304;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local70 + local311;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (Class172.aBoolean521) {
					arg0.method20478();
				} else {
					arg0.method20479(0, 0, local318 + local70 * 4, local320 + local70 * 4);
				}
				arg0.method20786(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30510(arg1, local384, local389 + local322, local328 + local394, (byte) -108);
						}
					}
					local26.aClass99Array2[local384].method2479(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30510(arg1, local384, local451, local455, (byte) -76))) {
								@Pc(474) int local474 = local384;
								if (local22.method30511(local451, local455, -662808309)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class352.method27758(arg0, local474, local451, local455, local389 * 4 + local318, (local70 - local394) * 4 + local320 - 4, local253, local266, -1566612262);
								}
							}
						}
					}
				}
				arg0.method20665(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20513();
				if (!Class172.aBoolean520) {
					Class172.aClass100_40.method18182((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (Class172.aBoolean521) {
						Class172.aClass100_40.method18181(256, 0);
						try {
							arg0.method20426(-1733131800);
							Class212.method25532(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (Class172.aBoolean520) {
			arg0.method20454(local162, -1497248091);
			if (Class172.aBoolean521) {
				Class172.aClass100_40.method18181(256, 0);
				try {
					arg0.method20426(-88596773);
					Class212.method25532(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20478();
		arg0.method20475(Class172.anIntArray269[0], Class172.anIntArray269[1], Class172.anIntArray269[2], Class172.anIntArray269[3]);
		arg0.method20786(1, 1);
		Class635.method32622((short) 255);
		Class172.anInt3176 = 0;
		Class172.aClass22_43.method406(-2037259486);
		if (!Class172.aBoolean523) {
			Class110_Sub15.method20163(arg1, 1757293797);
			@Pc(637) Class584 local637 = client.aClass532_1.method30768(-304373563);
			if (local637 != null) {
				Class542.aClass32_Sub2_3.method16664(1024, 64, -1613328696);
				@Pc(649) Class611 local649 = client.aClass532_1.method30624(1819027207);
				for (local318 = 0; local318 < local637.anInt5597 * 1285867561; local318++) {
					local320 = local637.anIntArray475[local318];
					if (local320 >> 28 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5784 * 270611681;
						local328 = (local320 & 0x3FFF) - local649.anInt5785 * -1994307635;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							Class172.aClass22_43.method407(new Class93_Sub14(local318), -1424010891);
						} else {
							@Pc(715) Class322 local715 = (Class322) Class542.aClass32_Sub2_3.method18273(local637.anIntArray474[local318], -1874921866);
							if (local715.anIntArray401 != null && local322 + local715.anInt4163 * 141650771 >= 0 && local715.anInt4145 * -975351719 + local322 < local14 && local328 + local715.anInt4164 * 226143903 >= 0 && local328 + local715.anInt4162 * -1564254457 < local18) {
								Class172.aClass22_43.method407(new Class93_Sub14(local318), -565374885);
							}
						}
					}
				}
				Class542.aClass32_Sub2_3.method16664(128, 64, -1812397653);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aaz", name = "<init>", descriptor = "()V")
	Class26() {
	}

	@OriginalMember(owner = "client!aaz", name = "u", descriptor = "(Lclient!alw;IB)V")
	void method572(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt88 = arg0.method22429((short) 5787) * 1304772293;
			this.method573(this.anInt88 * -1647734771, 693908015);
		} else if (arg1 == 2) {
			this.anInt84 = arg0.method22427(-1434290800) * -1078353519;
			if (this.anInt84 * -990036111 == 65535) {
				this.anInt84 = 1078353519;
			}
		} else if (arg1 == 3) {
			this.anInt85 = (arg0.method22427(-1434290800) << 2) * -2018615685;
		} else if (arg1 == 4) {
			this.aBoolean12 = false;
		} else if (arg1 == 5) {
			this.aBoolean13 = false;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!aaz", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaz", name = "p", descriptor = "(II)V")
	void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local40 == local24) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt83 = (int) (local56 * 256.0D) * -1685442095;
		this.anInt86 = (int) (local62 * 256.0D) * 550762111;
		if (this.anInt83 * 1784923953 < 0) {
			this.anInt83 = 0;
		} else if (this.anInt83 * 1784923953 > 255) {
			this.anInt83 = -291004625;
		}
		if (this.anInt86 * -466499201 < 0) {
			this.anInt86 = 0;
		} else if (this.anInt86 * -466499201 > 255) {
			this.anInt86 = -1289582463;
		}
		if (local62 > 0.5D) {
			this.anInt89 = (int) (local56 * (1.0D - local62) * 512.0D) * 357589731;
		} else {
			this.anInt89 = (int) (local56 * local62 * 512.0D) * 357589731;
		}
		if (this.anInt89 * 617476811 < 1) {
			this.anInt89 = 357589731;
		}
		this.anInt87 = (int) (local54 * (double) (this.anInt89 * 617476811)) * -972390005;
	}

	@OriginalMember(owner = "client!aaz", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaz", name = "c", descriptor = "(I)V")
	void method574(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local40 == local24) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt83 = (int) (local56 * 256.0D) * -1685442095;
		this.anInt86 = (int) (local62 * 256.0D) * 550762111;
		if (this.anInt83 * 1784923953 < 0) {
			this.anInt83 = 0;
		} else if (this.anInt83 * 1784923953 > 255) {
			this.anInt83 = -291004625;
		}
		if (this.anInt86 * -466499201 < 0) {
			this.anInt86 = 0;
		} else if (this.anInt86 * -466499201 > 255) {
			this.anInt86 = -1289582463;
		}
		if (local62 > 0.5D) {
			this.anInt89 = (int) (local56 * (1.0D - local62) * 512.0D) * 357589731;
		} else {
			this.anInt89 = (int) (local56 * local62 * 512.0D) * 357589731;
		}
		if (this.anInt89 * 617476811 < 1) {
			this.anInt89 = 357589731;
		}
		this.anInt87 = (int) (local54 * (double) (this.anInt89 * 617476811)) * -972390005;
	}

	@OriginalMember(owner = "client!aaz", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method572(arg0, local3, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method572(arg0, local3, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method572(arg0, local3, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method572(arg0, local3, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!aaz", name = "o", descriptor = "(I)V")
	void method575(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local40 == local24) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt83 = (int) (local56 * 256.0D) * -1685442095;
		this.anInt86 = (int) (local62 * 256.0D) * 550762111;
		if (this.anInt83 * 1784923953 < 0) {
			this.anInt83 = 0;
		} else if (this.anInt83 * 1784923953 > 255) {
			this.anInt83 = -291004625;
		}
		if (this.anInt86 * -466499201 < 0) {
			this.anInt86 = 0;
		} else if (this.anInt86 * -466499201 > 255) {
			this.anInt86 = -1289582463;
		}
		if (local62 > 0.5D) {
			this.anInt89 = (int) (local56 * (1.0D - local62) * 512.0D) * 357589731;
		} else {
			this.anInt89 = (int) (local56 * local62 * 512.0D) * 357589731;
		}
		if (this.anInt89 * 617476811 < 1) {
			this.anInt89 = 357589731;
		}
		this.anInt87 = (int) (local54 * (double) (this.anInt89 * 617476811)) * -972390005;
	}

	@OriginalMember(owner = "client!aaz", name = "s", descriptor = "(I)V")
	void method576(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local40 == local24) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt83 = (int) (local56 * 256.0D) * -1685442095;
		this.anInt86 = (int) (local62 * 256.0D) * 550762111;
		if (this.anInt83 * 1784923953 < 0) {
			this.anInt83 = 0;
		} else if (this.anInt83 * 1784923953 > 255) {
			this.anInt83 = -291004625;
		}
		if (this.anInt86 * -466499201 < 0) {
			this.anInt86 = 0;
		} else if (this.anInt86 * -466499201 > 255) {
			this.anInt86 = -1289582463;
		}
		if (local62 > 0.5D) {
			this.anInt89 = (int) (local56 * (1.0D - local62) * 512.0D) * 357589731;
		} else {
			this.anInt89 = (int) (local56 * local62 * 512.0D) * 357589731;
		}
		if (this.anInt89 * 617476811 < 1) {
			this.anInt89 = 357589731;
		}
		this.anInt87 = (int) (local54 * (double) (this.anInt89 * 617476811)) * -972390005;
	}

	@OriginalMember(owner = "client!aaz", name = "d", descriptor = "(Lclient!alw;I)V")
	void method577(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt88 = arg0.method22429((short) -8546) * 1304772293;
			this.method573(this.anInt88 * -1647734771, 693908015);
		} else if (arg1 == 2) {
			this.anInt84 = arg0.method22427(-1434290800) * -1078353519;
			if (this.anInt84 * -990036111 == 65535) {
				this.anInt84 = 1078353519;
			}
		} else if (arg1 == 3) {
			this.anInt85 = (arg0.method22427(-1434290800) << 2) * -2018615685;
		} else if (arg1 == 4) {
			this.aBoolean12 = false;
		} else if (arg1 == 5) {
			this.aBoolean13 = false;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method572(arg0, local3, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaz", name = "y", descriptor = "(I)V")
	void method578(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local40 == local24) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt83 = (int) (local56 * 256.0D) * -1685442095;
		this.anInt86 = (int) (local62 * 256.0D) * 550762111;
		if (this.anInt83 * 1784923953 < 0) {
			this.anInt83 = 0;
		} else if (this.anInt83 * 1784923953 > 255) {
			this.anInt83 = -291004625;
		}
		if (this.anInt86 * -466499201 < 0) {
			this.anInt86 = 0;
		} else if (this.anInt86 * -466499201 > 255) {
			this.anInt86 = -1289582463;
		}
		if (local62 > 0.5D) {
			this.anInt89 = (int) (local56 * (1.0D - local62) * 512.0D) * 357589731;
		} else {
			this.anInt89 = (int) (local56 * local62 * 512.0D) * 357589731;
		}
		if (this.anInt89 * 617476811 < 1) {
			this.anInt89 = 357589731;
		}
		this.anInt87 = (int) (local54 * (double) (this.anInt89 * 617476811)) * -972390005;
	}
}
