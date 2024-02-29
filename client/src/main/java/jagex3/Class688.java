package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yn")
public final class Class688 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!yn", name = "e", descriptor = "I")
	static final int anInt6074 = 1190717;

	@OriginalMember(owner = "client!yn", name = "n", descriptor = "I")
	int anInt6073;

	@OriginalMember(owner = "client!yn", name = "m", descriptor = "I")
	public int anInt6075 = 0;

	@OriginalMember(owner = "client!yn", name = "k", descriptor = "I")
	public int anInt6076 = -462296013;

	@OriginalMember(owner = "client!yn", name = "f", descriptor = "Z")
	public boolean aBoolean887 = true;

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "I")
	public int anInt6077 = -690404605;

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "I")
	public int anInt6081 = 183582208;

	@OriginalMember(owner = "client!yn", name = "u", descriptor = "Z")
	public boolean aBoolean889 = true;

	@OriginalMember(owner = "client!yn", name = "z", descriptor = "I")
	public int anInt6080 = 1907344776;

	@OriginalMember(owner = "client!yn", name = "p", descriptor = "Z")
	public boolean aBoolean888 = false;

	@OriginalMember(owner = "client!yn", name = "d", descriptor = "I")
	public int anInt6078 = 1233755641;

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "I")
	public int anInt6079 = 2059861312;

	@OriginalMember(owner = "client!yn", name = "r", descriptor = "I")
	public int anInt6082 = -503537775;

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "I")
	public int anInt6083 = -129782971;

	@OriginalMember(owner = "client!yn", name = "o", descriptor = "I")
	public int anInt6084 = 0;

	@OriginalMember(owner = "client!yn", name = "s", descriptor = "I")
	public int anInt6085 = -1934904128;

	@OriginalMember(owner = "client!yn", name = "y", descriptor = "(I)I")
	static int method36699(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class682.method33457(arg0, -1675598323);
	}

	@OriginalMember(owner = "client!yn", name = "s", descriptor = "(I)I")
	static int method36700(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class682.method33457(arg0, -1967555660);
	}

	@OriginalMember(owner = "client!yn", name = "bcb", descriptor = "(Lclient!alh;Lclient!yf;I)V")
	static void method36701(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.aClass241Array21 != null) {
			for (@Pc(14) int local14 = 0; local14 < arg0.aClass241Array21.length; local14++) {
				@Pc(24) Class241 local24 = arg0.aClass241Array21[local14];
				if (local24.aBoolean667) {
					@Pc(38) int local38;
					@Pc(44) int local44;
					if (local24.anInt3869 < local24.anInt3870) {
						local38 = local24.anInt3869 - local24.anInt3873;
						local44 = local24.anInt3870 + local24.anInt3873;
					} else {
						local38 = local24.anInt3870 - local24.anInt3873;
						local44 = local24.anInt3869 + local24.anInt3873;
					}
					@Pc(68) int local68;
					@Pc(74) int local74;
					if (local24.anInt3872 < local24.anInt3871) {
						local68 = local24.anInt3872 - local24.anInt3873;
						local74 = local24.anInt3871 + local24.anInt3873;
					} else {
						local68 = local24.anInt3871 - local24.anInt3873;
						local74 = local24.anInt3872 + local24.anInt3873;
					}
					if (!local1 || local38 < local3) {
						local3 = local38;
					}
					if (!local1 || local68 < local5) {
						local5 = local68;
					}
					if (!local1 || local44 > local7) {
						local7 = local44;
					}
					if (!local1 || local74 > local9) {
						local9 = local74;
					}
					local1 = true;
				}
			}
		}
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local1 ? 1 : 0;
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local3;
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local5;
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local7;
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local9;
	}

	@OriginalMember(owner = "client!yn", name = "gk", descriptor = "(II)V")
	static void method36702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = client.anInt3485 - client.anInt3483 * -1638909865;
		if (local5 >= 100) {
			Class429.anInt4942 = Class20.method376(1087552269) * -1279696551;
			Class444.anInt5056 = 783237131;
			Class175.anInt3306 = 1395810859;
			return;
		}
		@Pc(35) float local35 = 1.0F - (float) ((100 - local5) * (100 - local5) * (100 - local5)) / 1000000.0F;
		@Pc(188) int local188;
		if (Class20.method376(2013206566) == 3) {
			@Pc(45) CoordFine local45 = Class65.aClass123_Sub1_2.method8952((byte) -76).method21416((byte) 42);
			@Pc(49) Class611 local49 = client.aClass532_1.method30624(1876469160);
			Class620.anInt5805 = ((int) ((double) Class65.aClass123_Sub1_2.method8961((byte) 122) * 2607.5945876176133D) & 0x3FFF) * -1151839067;
			Class24.anInt82 = ((int) ((double) Class65.aClass123_Sub1_2.method8962((byte) -94) * -2607.5945876176133D) & 0x3FFF) * 1056124373;
			Class348.anInt4240 = 0;
			client.anInt3571 = (int) ((float) (Class627.anInt5867 * -103954239) + (float) ((int) ((double) (client.anInt3569 * -1968459517) / (Math.tan((double) (Class65.aClass123_Sub1_2.method9027(-1674847276) / 2.0F)) * 4.0D)) - Class627.anInt5867 * -103954239) * local35) * 1984904847;
			Class163.anInt2002 = (int) (local35 * (float) (local45.anInt1610 * -427776677 - local49.anInt5784 * 1114227200 - Class86.anInt264 * 1288101077) + (float) (Class86.anInt264 * 1288101077)) * 1636217271;
			Class130_Sub2.anInt1117 = (int) ((float) (-(local45.anInt1611 * 1802884841) - Class508.anInt5365 * -313412555) * local35 + (float) (Class508.anInt5365 * -313412555)) * 1820517185;
			Class270.anInt3925 = (int) (local35 * (float) (local45.anInt1612 * 671628745 - local49.anInt5785 * 1116707328 - Class156.anInt1664 * 1602282841) + (float) (Class156.anInt1664 * 1602282841)) * -967471741;
			local188 = -(Class24.anInt82 * -20667523) - Class35.anInt114 * 1851606237 & 0x3FFF;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		} else {
			@Pc(201) int local201 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local201) {
				local201 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local201) {
				local201 = client.anIntArray329[4] + 128;
			}
			@Pc(240) int local240 = (int) client.aFloat253 + client.anInt3461 * 1018036723 & 0x3FFF;
			@Pc(244) Class472 local244 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
			Class716.method37057(Class72.anInt241 * -1022856553, Class305.method26894((int) local244.aFloat325, (int) local244.aFloat327, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -78) - client.anInt3484 * 1974760385, SortedQueueEntry.anInt5047 * -953396699, local201, local240, (local201 >> 3) * 3 + 600 << 2, arg0, (byte) -12);
			Class163.anInt2002 = (int) (local35 * (float) (Class163.anInt2002 * -1331168249 - Class86.anInt264 * 1288101077) + (float) (Class86.anInt264 * 1288101077)) * 1636217271;
			Class130_Sub2.anInt1117 = (int) (local35 * (float) (Class130_Sub2.anInt1117 * 1055108289 - Class508.anInt5365 * -313412555) + (float) (Class508.anInt5365 * -313412555)) * 1820517185;
			Class270.anInt3925 = (int) ((float) (Class156.anInt1664 * 1602282841) + local35 * (float) (Class270.anInt3925 * 466086187 - Class156.anInt1664 * 1602282841)) * -967471741;
			Class620.anInt5805 = (int) ((float) (Class219.anInt3669 * -1583127759) + local35 * (float) (Class620.anInt5805 * 607613741 - Class219.anInt3669 * -1583127759)) * -1151839067;
			local188 = Class24.anInt82 * -20667523 - Class35.anInt114 * 1851606237;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		}
		Class24.anInt82 = (int) (local35 * (float) local188 + (float) (Class35.anInt114 * 1851606237)) * 1056124373;
		Class24.anInt82 = (Class24.anInt82 * -20667523 & 0x3FFF) * 1056124373;
		client.anInt3571 = (int) ((float) (Class627.anInt5867 * -103954239) + local35 * (float) (client.anInt3571 * -1609686929 - Class627.anInt5867 * -103954239)) * 1984904847;
	}

	@OriginalMember(owner = "client!yn", name = "<init>", descriptor = "()V")
	Class688() {
	}

	@OriginalMember(owner = "client!yn", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36695(arg0, local3, 386607051);
		}
	}

	@OriginalMember(owner = "client!yn", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36695(arg0, local3, -315777965);
		}
	}

	@OriginalMember(owner = "client!yn", name = "u", descriptor = "(Lclient!alw;II)V")
	void method36695(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt6075 = Class596.method31942(arg0.method22429((short) -17573), 438047981) * 381855547;
		} else if (arg1 == 2) {
			this.anInt6076 = arg0.method22425((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt6076 = arg0.method22427(-1434290800) * 462296013;
			if (this.anInt6076 * -1685253883 == 65535) {
				this.anInt6076 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean887 = false;
		} else if (arg1 == 7) {
			this.anInt6077 = Class596.method31942(arg0.method22429((short) -22795), -1198838908) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt6081 = (arg0.method22427(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean889 = false;
			} else if (arg1 == 11) {
				this.anInt6080 = arg0.method22425((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean888 = true;
			} else if (arg1 == 13) {
				this.anInt6078 = arg0.method22429((short) 1535) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt6079 = (arg0.method22425((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt6082 = arg0.method22425((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt6083 = arg0.method22427(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt6084 = arg0.method22425((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt6085 = arg0.method22427(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
		this.anInt6080 = (this.anInt6080 * -205172655 << 8 | this.anInt6073 * -706978635) * 1312159921;
	}

	@OriginalMember(owner = "client!yn", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt6073 = arg0 * 133869981;
	}

	@OriginalMember(owner = "client!yn", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36695(arg0, local3, 1994891967);
		}
	}

	@OriginalMember(owner = "client!yn", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36695(arg0, local3, 1986342397);
		}
	}

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36695(arg0, local3, -1438020222);
		}
	}

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "(Lclient!alw;I)V")
	void method36696(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6075 = Class596.method31942(arg0.method22429((short) 355), -1259307527) * 381855547;
		} else if (arg1 == 2) {
			this.anInt6076 = arg0.method22425((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt6076 = arg0.method22427(-1434290800) * 462296013;
			if (this.anInt6076 * -1685253883 == 65535) {
				this.anInt6076 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean887 = false;
		} else if (arg1 == 7) {
			this.anInt6077 = Class596.method31942(arg0.method22429((short) 14855), -1126559479) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt6081 = (arg0.method22427(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean889 = false;
			} else if (arg1 == 11) {
				this.anInt6080 = arg0.method22425((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean888 = true;
			} else if (arg1 == 13) {
				this.anInt6078 = arg0.method22429((short) 8261) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt6079 = (arg0.method22425((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt6082 = arg0.method22425((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt6083 = arg0.method22427(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt6084 = arg0.method22425((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt6085 = arg0.method22427(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "o", descriptor = "(Lclient!alw;I)V")
	void method36697(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6075 = Class596.method31942(arg0.method22429((short) 8249), -953503906) * 381855547;
		} else if (arg1 == 2) {
			this.anInt6076 = arg0.method22425((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt6076 = arg0.method22427(-1434290800) * 462296013;
			if (this.anInt6076 * -1685253883 == 65535) {
				this.anInt6076 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean887 = false;
		} else if (arg1 == 7) {
			this.anInt6077 = Class596.method31942(arg0.method22429((short) 11633), -1281320112) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt6081 = (arg0.method22427(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean889 = false;
			} else if (arg1 == 11) {
				this.anInt6080 = arg0.method22425((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean888 = true;
			} else if (arg1 == 13) {
				this.anInt6078 = arg0.method22429((short) 7118) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt6079 = (arg0.method22425((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt6082 = arg0.method22425((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt6083 = arg0.method22427(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt6084 = arg0.method22425((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt6085 = arg0.method22427(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
		this.anInt6073 = arg0 * 133869981;
	}

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
		this.anInt6080 = (this.anInt6080 * -205172655 << 8 | this.anInt6073 * -706978635) * 1312159921;
	}

	@OriginalMember(owner = "client!yn", name = "d", descriptor = "(Lclient!alw;I)V")
	void method36698(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6075 = Class596.method31942(arg0.method22429((short) -10155), -1397523664) * 381855547;
		} else if (arg1 == 2) {
			this.anInt6076 = arg0.method22425((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt6076 = arg0.method22427(-1434290800) * 462296013;
			if (this.anInt6076 * -1685253883 == 65535) {
				this.anInt6076 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean887 = false;
		} else if (arg1 == 7) {
			this.anInt6077 = Class596.method31942(arg0.method22429((short) 16547), 1023455760) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt6081 = (arg0.method22427(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean889 = false;
			} else if (arg1 == 11) {
				this.anInt6080 = arg0.method22425((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean888 = true;
			} else if (arg1 == 13) {
				this.anInt6078 = arg0.method22429((short) -269) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt6079 = (arg0.method22425((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt6082 = arg0.method22425((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt6083 = arg0.method22427(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt6084 = arg0.method22425((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt6085 = arg0.method22427(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
		this.anInt6073 = arg0 * 133869981;
	}
}
