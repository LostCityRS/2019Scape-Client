package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class389 implements Interface32 {

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
	static int anInt4560;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "Lclient!ed;")
	Class104 aClass104_25;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "Lclient!lv;")
	final Class407 aClass407_1;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_108;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "Lclient!pf;")
	final Class480 aClass480_109;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(II)Lclient!iz;")
	public static Class354 method28648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class354.aClass354_3.anInt4263 * -1406837667 == arg0) {
			return Class354.aClass354_3;
		} else if (arg0 == Class354.aClass354_5.anInt4263 * -1406837667) {
			return Class354.aClass354_5;
		} else if (arg0 == Class354.aClass354_4.anInt4263 * -1406837667) {
			return Class354.aClass354_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ot", descriptor = "(Lclient!yp;I)V")
	static void method28649(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class360.method28148(local11, local14, arg0, (byte) -43);
	}

	@OriginalMember(owner = "client!kw", name = "ve", descriptor = "(Lclient!yp;I)V")
	static void method28650(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(15) int local15 = 0;
		if (Class698.method37062(local13, (short) 3465)) {
			local15 = Class679.method33621(local13, -827792231);
		}
		@Pc(29) Class80_Sub31 local29 = Class623.method32440(Class443.aClass443_8, client.aClass75_1.aClass22_1, -191270971);
		local29.aPacketBit_2.p4(local15);
		client.aClass75_1.method1325(local29, (byte) -87);
	}

	@OriginalMember(owner = "client!kw", name = "awq", descriptor = "(Lclient!yp;I)V")
	static void method28651(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(1, local13, local23, "", 923070631);
	}

	@OriginalMember(owner = "client!kw", name = "axz", descriptor = "(Lclient!yp;I)V")
	static void method28652(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kw", name = "baj", descriptor = "(Lclient!yp;B)V")
	static void method28653(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16950(local12, (byte) -52);
	}

	@OriginalMember(owner = "client!kw", name = "hp", descriptor = "(B)V")
	static void method28654(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = Class28.anInt92 * -238759424 + 256;
		@Pc(11) int local11 = Class244.anInt3863 * -1211352576 + 256;
		@Pc(23) int local23 = Class439.method29150(local5, local11, Class507.anInt5045 * -1170417853, 1037753497) - Class617.anInt5429 * -706763611;
		if (Class699.anInt5813 * -383382025 >= 100) {
			Class89.anInt319 = Class28.anInt92 * -209063424 + 1297879296;
			Class102_Sub2.anInt653 = Class244.anInt3863 * -1980553728 + -896569600;
			Class283.anInt3937 = (Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class507.anInt5045 * -1170417853, 1037753497) - Class617.anInt5429 * -706763611) * 364051605;
		} else {
			if (Class89.anInt319 * 1749751025 < local5) {
				Class89.anInt319 += (Class166.anInt2402 * -1718189689 + Class699.anInt5813 * -383382025 * (local5 - Class89.anInt319 * 1749751025) / 1000) * 2068667409;
				if (Class89.anInt319 * 1749751025 > local5) {
					Class89.anInt319 = local5 * 2068667409;
				}
			}
			if (Class89.anInt319 * 1749751025 > local5) {
				Class89.anInt319 -= (Class166.anInt2402 * -1718189689 + (Class89.anInt319 * 1749751025 - local5) * Class699.anInt5813 * -383382025 / 1000) * 2068667409;
				if (Class89.anInt319 * 1749751025 < local5) {
					Class89.anInt319 = local5 * 2068667409;
				}
			}
			if (Class283.anInt3937 * -1465520451 < local23) {
				Class283.anInt3937 += (Class166.anInt2402 * -1718189689 + (local23 - Class283.anInt3937 * -1465520451) * Class699.anInt5813 * -383382025 / 1000) * 364051605;
				if (Class283.anInt3937 * -1465520451 > local23) {
					Class283.anInt3937 = local23 * 364051605;
				}
			}
			if (Class283.anInt3937 * -1465520451 > local23) {
				Class283.anInt3937 -= ((Class283.anInt3937 * -1465520451 - local23) * -383382025 * Class699.anInt5813 / 1000 + Class166.anInt2402 * -1718189689) * 364051605;
				if (Class283.anInt3937 * -1465520451 < local23) {
					Class283.anInt3937 = local23 * 364051605;
				}
			}
			if (Class102_Sub2.anInt653 * 1132703631 < local11) {
				Class102_Sub2.anInt653 += (Class699.anInt5813 * -383382025 * (local11 - Class102_Sub2.anInt653 * 1132703631) / 1000 + Class166.anInt2402 * -1718189689) * 483037039;
				if (Class102_Sub2.anInt653 * 1132703631 > local11) {
					Class102_Sub2.anInt653 = local11 * 483037039;
				}
			}
			if (Class102_Sub2.anInt653 * 1132703631 > local11) {
				Class102_Sub2.anInt653 -= ((Class102_Sub2.anInt653 * 1132703631 - local11) * Class699.anInt5813 * -383382025 / 1000 + Class166.anInt2402 * -1718189689) * 483037039;
				if (Class102_Sub2.anInt653 * 1132703631 < local11) {
					Class102_Sub2.anInt653 = local11 * 483037039;
				}
			}
		}
		local5 = Class606.anInt5395 * -2103472640 + 256;
		local11 = Class62.anInt214 * -1433135616 + 256;
		local23 = Class439.method29150(local5, local11, Class507.anInt5045 * -1170417853, 1037753497) - Class203.anInt3387 * 1729023179;
		@Pc(293) int local293 = local5 - Class89.anInt319 * 1749751025;
		@Pc(299) int local299 = local23 - Class283.anInt3937 * -1465520451;
		@Pc(305) int local305 = local11 - Class102_Sub2.anInt653 * 1132703631;
		@Pc(316) int local316 = (int) Math.sqrt((double) (local305 * local305 + local293 * local293));
		@Pc(327) int local327 = (int) (Math.atan2((double) local299, (double) local316) * 2607.5945876176133D) & 0x3FFF;
		@Pc(338) int local338 = (int) (Math.atan2((double) local293, (double) local305) * -2607.5945876176133D) & 0x3FFF;
		if (local327 < 1024) {
			local327 = 1024;
		}
		if (local327 > 3072) {
			local327 = 3072;
		}
		if (client.anInt3481 * 1789770377 < local327) {
			client.anInt3481 += ((local327 - client.anInt3481 * 1789770377 >> 3) * -9303121 * Class147_Sub1.anInt1445 / 1000 + Class165_Sub13.anInt2172 * -1985244935 << 3) * -560342087;
			if (client.anInt3481 * 1789770377 > local327) {
				client.anInt3481 = local327 * -560342087;
			}
		}
		if (client.anInt3481 * 1789770377 > local327) {
			client.anInt3481 -= (-1985244935 * Class165_Sub13.anInt2172 + -9303121 * Class147_Sub1.anInt1445 * (client.anInt3481 * 1789770377 - local327 >> 3) / 1000 << 3) * -560342087;
			if (client.anInt3481 * 1789770377 < local327) {
				client.anInt3481 = local327 * -560342087;
			}
		}
		@Pc(430) int local430 = local338 - Class664.anInt5692 * -953671403;
		if (local430 > 8192) {
			local430 -= 16384;
		}
		if (local430 < -8192) {
			local430 += 16384;
		}
		local430 >>= 0x3;
		if (local430 > 0) {
			Class664.anInt5692 += (-9303121 * Class147_Sub1.anInt1445 * local430 / 1000 + Class165_Sub13.anInt2172 * -1985244935 << 3) * -399825347;
			Class664.anInt5692 = (-953671403 * Class664.anInt5692 & 0x3FFF) * -399825347;
		}
		if (local430 < 0) {
			Class664.anInt5692 -= (Class165_Sub13.anInt2172 * -1985244935 + -9303121 * Class147_Sub1.anInt1445 * -local430 / 1000 << 3) * -399825347;
			Class664.anInt5692 = (-953671403 * Class664.anInt5692 & 0x3FFF) * -399825347;
		}
		@Pc(505) int local505 = local338 - Class664.anInt5692 * -953671403;
		if (local505 > 8192) {
			local505 -= 16384;
		}
		if (local505 < -8192) {
			local505 += 16384;
		}
		if (local505 < 0 && local430 > 0 || local505 > 0 && local430 < 0) {
			Class664.anInt5692 = local338 * -399825347;
		}
		Class338.anInt4231 = 0;
	}

	@OriginalMember(owner = "client!kw", name = "ev", descriptor = "(IIIII)V")
	static void method28655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) float local5 = (float) Class159_Sub1.anInt1989 / (float) Class159_Sub1.anInt2001;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class159_Sub1.anInt2026 = local34 * Class159_Sub1.anInt2001 / local7 * 1633656115;
		Class158.anInt2029 = (Class159_Sub1.anInt1989 - Class159_Sub1.anInt1989 * local42 / local9) * -1296666553;
		Class159_Sub1.anInt2018 = -1806870975;
		Class159_Sub1.anInt2019 = -387547399;
		Class156.method15158(459265482);
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!lv;)V")
	Class389(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class407 arg2) {
		this.aClass407_1 = arg2;
		this.aClass480_108 = arg0;
		this.aClass480_109 = arg1;
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_109, this.aClass407_1.anInt4606 * 1255159851, Class317.aClass464_1, 990758394);
		this.aClass104_25 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_108, this.aClass407_1.anInt4606 * 1255159851), true);
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_109, this.aClass407_1.anInt4606 * 1255159851, Class317.aClass464_1, 1104200595);
		this.aClass104_25 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_108, this.aClass407_1.anInt4606 * 1255159851), true);
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_109, this.aClass407_1.anInt4606 * 1255159851, Class317.aClass464_1, 1434792148);
		this.aClass104_25 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_108, this.aClass407_1.anInt4606 * 1255159851), true);
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_108.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_109.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass391_14.method28669(this.aClass407_1.anInt4607 * 1548325119, client.anInt3510 * 1528239985, (byte) -40) + this.aClass407_1.anInt4599 * 1345289061;
			@Pc(41) int local41 = this.aClass407_1.aClass383_14.method28573(this.aClass407_1.anInt4605 * -889765801, client.anInt3511 * 1764386615, (byte) 60) + this.aClass407_1.anInt4600 * 154739839;
			this.aClass104_25.method7631(this.aClass407_1.aString208, local21, local41, this.aClass407_1.anInt4607 * 1548325119, this.aClass407_1.anInt4605 * -889765801, this.aClass407_1.anInt4604 * -2010980387, this.aClass407_1.anInt4608 * 2069146555, this.aClass407_1.anInt4601 * 1893659559, this.aClass407_1.anInt4602 * 1992136229, this.aClass407_1.anInt4603 * -2084642067, null, null, null, 0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass391_14.method28669(this.aClass407_1.anInt4607 * 1548325119, client.anInt3510 * 1528239985, (byte) -52) + this.aClass407_1.anInt4599 * 1345289061;
			@Pc(41) int local41 = this.aClass407_1.aClass383_14.method28573(this.aClass407_1.anInt4605 * -889765801, client.anInt3511 * 1764386615, (byte) 125) + this.aClass407_1.anInt4600 * 154739839;
			this.aClass104_25.method7631(this.aClass407_1.aString208, local21, local41, this.aClass407_1.anInt4607 * 1548325119, this.aClass407_1.anInt4605 * -889765801, this.aClass407_1.anInt4604 * -2010980387, this.aClass407_1.anInt4608 * 2069146555, this.aClass407_1.anInt4601 * 1893659559, this.aClass407_1.anInt4602 * 1992136229, this.aClass407_1.anInt4603 * -2084642067, null, null, null, 0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass391_14.method28669(this.aClass407_1.anInt4607 * 1548325119, client.anInt3510 * 1528239985, (byte) -42) + this.aClass407_1.anInt4599 * 1345289061;
			@Pc(41) int local41 = this.aClass407_1.aClass383_14.method28573(this.aClass407_1.anInt4605 * -889765801, client.anInt3511 * 1764386615, (byte) 38) + this.aClass407_1.anInt4600 * 154739839;
			this.aClass104_25.method7631(this.aClass407_1.aString208, local21, local41, this.aClass407_1.anInt4607 * 1548325119, this.aClass407_1.anInt4605 * -889765801, this.aClass407_1.anInt4604 * -2010980387, this.aClass407_1.anInt4608 * 2069146555, this.aClass407_1.anInt4601 * 1893659559, this.aClass407_1.anInt4602 * 1992136229, this.aClass407_1.anInt4603 * -2084642067, null, null, null, 0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_108.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_109.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass391_14.method28669(this.aClass407_1.anInt4607 * 1548325119, client.anInt3510 * 1528239985, (byte) -92) + this.aClass407_1.anInt4599 * 1345289061;
			@Pc(41) int local41 = this.aClass407_1.aClass383_14.method28573(this.aClass407_1.anInt4605 * -889765801, client.anInt3511 * 1764386615, (byte) 30) + this.aClass407_1.anInt4600 * 154739839;
			this.aClass104_25.method7631(this.aClass407_1.aString208, local21, local41, this.aClass407_1.anInt4607 * 1548325119, this.aClass407_1.anInt4605 * -889765801, this.aClass407_1.anInt4604 * -2010980387, this.aClass407_1.anInt4608 * 2069146555, this.aClass407_1.anInt4601 * 1893659559, this.aClass407_1.anInt4602 * 1992136229, this.aClass407_1.anInt4603 * -2084642067, null, null, null, 0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_108.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_109.method29945(this.aClass407_1.anInt4606 * 1255159851, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}
}
