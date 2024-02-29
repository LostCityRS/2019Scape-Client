package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yn")
public class Class688 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!yn", name = "e", descriptor = "I")
	static final int anInt5913 = 1190717;

	@OriginalMember(owner = "client!yn", name = "n", descriptor = "I")
	int anInt5912;

	@OriginalMember(owner = "client!yn", name = "m", descriptor = "I")
	public int anInt5914 = 0;

	@OriginalMember(owner = "client!yn", name = "k", descriptor = "I")
	public int anInt5915 = -462296013;

	@OriginalMember(owner = "client!yn", name = "f", descriptor = "Z")
	public boolean aBoolean878 = true;

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "I")
	public int anInt5916 = -690404605;

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "I")
	public int anInt5920 = 183582208;

	@OriginalMember(owner = "client!yn", name = "u", descriptor = "Z")
	public boolean aBoolean880 = true;

	@OriginalMember(owner = "client!yn", name = "z", descriptor = "I")
	public int anInt5919 = 1907344776;

	@OriginalMember(owner = "client!yn", name = "p", descriptor = "Z")
	public boolean aBoolean879 = false;

	@OriginalMember(owner = "client!yn", name = "d", descriptor = "I")
	public int anInt5917 = 1233755641;

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "I")
	public int anInt5918 = 2059861312;

	@OriginalMember(owner = "client!yn", name = "r", descriptor = "I")
	public int anInt5921 = -503537775;

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "I")
	public int anInt5922 = -129782971;

	@OriginalMember(owner = "client!yn", name = "o", descriptor = "I")
	public int anInt5923 = 0;

	@OriginalMember(owner = "client!yn", name = "s", descriptor = "I")
	public int anInt5924 = -1934904128;

	@OriginalMember(owner = "client!yn", name = "<init>", descriptor = "()V", line = 28)
	Class688() {
	}

	@OriginalMember(owner = "client!yn", name = "f", descriptor = "(Lclient!alw;)V", line = 32)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36514(arg0, local3, 386607051);
		}
	}

	@OriginalMember(owner = "client!yn", name = "e", descriptor = "(Lclient!alw;B)V", line = 32)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36514(arg0, local3, -315777965);
		}
	}

	@OriginalMember(owner = "client!yn", name = "m", descriptor = "(Lclient!alw;)V", line = 32)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36514(arg0, local3, 1994891967);
		}
	}

	@OriginalMember(owner = "client!yn", name = "k", descriptor = "(Lclient!alw;)V", line = 32)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36514(arg0, local3, 1986342397);
		}
	}

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "(Lclient!alw;)V", line = 32)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36514(arg0, local3, -1438020222);
		}
	}

	@OriginalMember(owner = "client!yn", name = "u", descriptor = "(Lclient!alw;II)V", line = 39)
	void method36514(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5914 = Class596.method31757(arg0.method22478((short) -17573), 438047981) * 381855547;
		} else if (arg1 == 2) {
			this.anInt5915 = arg0.method22465((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt5915 = arg0.method22472(-1434290800) * 462296013;
			if (this.anInt5915 * -1685253883 == 65535) {
				this.anInt5915 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean878 = false;
		} else if (arg1 == 7) {
			this.anInt5916 = Class596.method31757(arg0.method22478((short) -22795), -1198838908) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5920 = (arg0.method22472(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean880 = false;
			} else if (arg1 == 11) {
				this.anInt5919 = arg0.method22465((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean879 = true;
			} else if (arg1 == 13) {
				this.anInt5917 = arg0.method22478((short) 1535) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt5918 = (arg0.method22465((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt5921 = arg0.method22465((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt5922 = arg0.method22472(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt5923 = arg0.method22465((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt5924 = arg0.method22472(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "(Lclient!alw;I)V", line = 39)
	void method36515(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5914 = Class596.method31757(arg0.method22478((short) 355), -1259307527) * 381855547;
		} else if (arg1 == 2) {
			this.anInt5915 = arg0.method22465((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt5915 = arg0.method22472(-1434290800) * 462296013;
			if (this.anInt5915 * -1685253883 == 65535) {
				this.anInt5915 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean878 = false;
		} else if (arg1 == 7) {
			this.anInt5916 = Class596.method31757(arg0.method22478((short) 14855), -1126559479) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5920 = (arg0.method22472(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean880 = false;
			} else if (arg1 == 11) {
				this.anInt5919 = arg0.method22465((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean879 = true;
			} else if (arg1 == 13) {
				this.anInt5917 = arg0.method22478((short) 8261) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt5918 = (arg0.method22465((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt5921 = arg0.method22465((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt5922 = arg0.method22472(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt5923 = arg0.method22465((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt5924 = arg0.method22472(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "o", descriptor = "(Lclient!alw;I)V", line = 39)
	void method36516(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5914 = Class596.method31757(arg0.method22478((short) 8249), -953503906) * 381855547;
		} else if (arg1 == 2) {
			this.anInt5915 = arg0.method22465((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt5915 = arg0.method22472(-1434290800) * 462296013;
			if (this.anInt5915 * -1685253883 == 65535) {
				this.anInt5915 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean878 = false;
		} else if (arg1 == 7) {
			this.anInt5916 = Class596.method31757(arg0.method22478((short) 11633), -1281320112) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5920 = (arg0.method22472(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean880 = false;
			} else if (arg1 == 11) {
				this.anInt5919 = arg0.method22465((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean879 = true;
			} else if (arg1 == 13) {
				this.anInt5917 = arg0.method22478((short) 7118) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt5918 = (arg0.method22465((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt5921 = arg0.method22465((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt5922 = arg0.method22472(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt5923 = arg0.method22465((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt5924 = arg0.method22472(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "d", descriptor = "(Lclient!alw;I)V", line = 39)
	void method36517(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5914 = Class596.method31757(arg0.method22478((short) -10155), -1397523664) * 381855547;
		} else if (arg1 == 2) {
			this.anInt5915 = arg0.method22465((short) 16384) * 462296013;
		} else if (arg1 == 3) {
			this.anInt5915 = arg0.method22472(-1434290800) * 462296013;
			if (this.anInt5915 * -1685253883 == 65535) {
				this.anInt5915 = -462296013;
			}
		} else if (arg1 == 5) {
			this.aBoolean878 = false;
		} else if (arg1 == 7) {
			this.anInt5916 = Class596.method31757(arg0.method22478((short) 16547), 1023455760) * 690404605;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5920 = (arg0.method22472(-1434290800) << 2) * -385517409;
			} else if (arg1 == 10) {
				this.aBoolean880 = false;
			} else if (arg1 == 11) {
				this.anInt5919 = arg0.method22465((short) 16384) * 1312159921;
			} else if (arg1 == 12) {
				this.aBoolean879 = true;
			} else if (arg1 == 13) {
				this.anInt5917 = arg0.method22478((short) -269) * 1411996013;
			} else if (arg1 == 14) {
				this.anInt5918 = (arg0.method22465((short) 16384) << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.anInt5921 = arg0.method22465((short) 16384) * -254619793;
			} else if (arg1 == 20) {
				this.anInt5922 = arg0.method22472(-1434290800) * -1979108485;
			} else if (arg1 == 21) {
				this.anInt5923 = arg0.method22465((short) 16384) * 812149361;
			} else if (arg1 == 22) {
				this.anInt5924 = arg0.method22472(-1434290800) * -1842172205;
			}
		}
	}

	@OriginalMember(owner = "client!yn", name = "n", descriptor = "(I)V", line = 62)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
		this.anInt5919 = (this.anInt5919 * -205172655 << 8 | this.anInt5912 * -706978635) * 1312159921;
	}

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "()V", line = 62)
	@Override
	public void method36659() {
		this.anInt5919 = (this.anInt5919 * -205172655 << 8 | this.anInt5912 * -706978635) * 1312159921;
	}

	@OriginalMember(owner = "client!yn", name = "y", descriptor = "(I)I", line = 66)
	static int method36518(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class682.method33269(arg0, -1675598323);
	}

	@OriginalMember(owner = "client!yn", name = "s", descriptor = "(I)I", line = 66)
	static int method36519(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class682.method33269(arg0, -1967555660);
	}

	@OriginalMember(owner = "client!yn", name = "z", descriptor = "(IB)V", line = 71)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5912 = arg0 * 133869981;
	}

	@OriginalMember(owner = "client!yn", name = "r", descriptor = "(I)V", line = 71)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
		this.anInt5912 = arg0 * 133869981;
	}

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "(I)V", line = 71)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
		this.anInt5912 = arg0 * 133869981;
	}

	@OriginalMember(owner = "client!yn", name = "gk", descriptor = "(II)V", line = 3511)
	static final void method36520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = client.anInt3485 - client.anInt3483 * -1638909865;
		if (local5 >= 100) {
			Class429.anInt4781 = Class20.method376(1087552269) * -1279696551;
			Class444.anInt4895 = 783237131;
			Class175.anInt3306 = 1395810859;
			return;
		}
		@Pc(35) float local35 = 1.0F - (float) ((100 - local5) * (100 - local5) * (100 - local5)) / 1000000.0F;
		@Pc(188) int local188;
		if (Class20.method376(2013206566) == 3) {
			@Pc(45) Class93_Sub30 local45 = Class65.aClass123_Sub1_2.method9011((byte) -76).method21410((byte) 42);
			@Pc(49) Class611 local49 = client.aClass532_1.method30455(1876469160);
			Class620.anInt5644 = ((int) ((double) Class65.aClass123_Sub1_2.method9040((byte) 122) * 2607.5945876176133D) & 0x3FFF) * -1151839067;
			Class24.anInt82 = ((int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -94) * -2607.5945876176133D) & 0x3FFF) * 1056124373;
			Class348.anInt4199 = 0;
			client.anInt3571 = (int) ((float) (Class627.anInt5706 * -103954239) + (float) ((int) ((double) (client.anInt3569 * -1968459517) / (Math.tan((double) (Class65.aClass123_Sub1_2.method9077(-1674847276) / 2.0F)) * 4.0D)) - Class627.anInt5706 * -103954239) * local35) * 1984904847;
			Class163.anInt2002 = (int) (local35 * (float) (local45.anInt1610 * -427776677 - local49.anInt5623 * 1114227200 - Class86.anInt264 * 1288101077) + (float) (Class86.anInt264 * 1288101077)) * 1636217271;
			Class130_Sub2.anInt1117 = (int) ((float) (-(local45.anInt1611 * 1802884841) - Class508.anInt5204 * -313412555) * local35 + (float) (Class508.anInt5204 * -313412555)) * 1820517185;
			Class270.anInt3884 = (int) (local35 * (float) (local45.anInt1612 * 671628745 - local49.anInt5624 * 1116707328 - Class156.anInt1664 * 1602282841) + (float) (Class156.anInt1664 * 1602282841)) * -967471741;
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
			@Pc(244) Class472 local244 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
			Class716.method36876(Class72.anInt241 * -1022856553, Class305.method26802((int) local244.aFloat317, (int) local244.aFloat319, Class512.anInt5209 * 1177442423, (byte) -78) - client.anInt3484 * 1974760385, Class441.anInt4886 * -953396699, local201, local240, (local201 >> 3) * 3 + 600 << 2, arg0, (byte) -12);
			Class163.anInt2002 = (int) (local35 * (float) (Class163.anInt2002 * -1331168249 - Class86.anInt264 * 1288101077) + (float) (Class86.anInt264 * 1288101077)) * 1636217271;
			Class130_Sub2.anInt1117 = (int) (local35 * (float) (Class130_Sub2.anInt1117 * 1055108289 - Class508.anInt5204 * -313412555) + (float) (Class508.anInt5204 * -313412555)) * 1820517185;
			Class270.anInt3884 = (int) ((float) (Class156.anInt1664 * 1602282841) + local35 * (float) (Class270.anInt3884 * 466086187 - Class156.anInt1664 * 1602282841)) * -967471741;
			Class620.anInt5644 = (int) ((float) (Class219.anInt3628 * -1583127759) + local35 * (float) (Class620.anInt5644 * 607613741 - Class219.anInt3628 * -1583127759)) * -1151839067;
			local188 = Class24.anInt82 * -20667523 - Class35.anInt114 * 1851606237;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		}
		Class24.anInt82 = (int) (local35 * (float) local188 + (float) (Class35.anInt114 * 1851606237)) * 1056124373;
		Class24.anInt82 = (Class24.anInt82 * -20667523 & 0x3FFF) * 1056124373;
		client.anInt3571 = (int) ((float) (Class627.anInt5706 * -103954239) + local35 * (float) (client.anInt3571 * -1609686929 - Class627.anInt5706 * -103954239)) * 1984904847;
	}

	@OriginalMember(owner = "client!yn", name = "bcb", descriptor = "(Lclient!alh;Lclient!yf;I)V", line = 14530)
	static final void method36521(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.aClass241Array21 != null) {
			for (@Pc(14) int local14 = 0; local14 < arg0.aClass241Array21.length; local14++) {
				@Pc(24) Class241 local24 = arg0.aClass241Array21[local14];
				if (local24.aBoolean663) {
					@Pc(38) int local38;
					@Pc(44) int local44;
					if (local24.anInt3828 < local24.anInt3829) {
						local38 = local24.anInt3828 - local24.anInt3832;
						local44 = local24.anInt3829 + local24.anInt3832;
					} else {
						local38 = local24.anInt3829 - local24.anInt3832;
						local44 = local24.anInt3828 + local24.anInt3832;
					}
					@Pc(68) int local68;
					@Pc(74) int local74;
					if (local24.anInt3831 < local24.anInt3830) {
						local68 = local24.anInt3831 - local24.anInt3832;
						local74 = local24.anInt3830 + local24.anInt3832;
					} else {
						local68 = local24.anInt3830 - local24.anInt3832;
						local74 = local24.anInt3831 + local24.anInt3832;
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
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local1 ? 1 : 0;
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local3;
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local5;
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local7;
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local9;
	}
}
