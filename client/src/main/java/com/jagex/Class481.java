package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class481 {

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[Lclient!acz;")
	static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	static int anInt4995 = 0;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	static int anInt4994 = 0;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "()V")
	public static void method30009() {
		anInt4995 = 0;
		anInt4994 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "()I")
	public static int method30010() {
		if (anInt4995 * 2097642135 == 0) {
			Class74.aClass74_1.method1290(new Class494("jaclib"), 1901213809);
			if (Class74.aClass74_1.method1292(-1435917229).method30349((byte) 115) != 100) {
				return 1;
			}
			if (!((Class494) Class74.aClass74_1.method1292(-1435917229)).method30291(1846159762) && !Class117.method8819((byte) 81)) {
				try {
					Class564.aClient1.method25208(-713974552);
					Class322.method27602(47357210);
					Ping.init();
				} catch (@Pc(38) Exception_Sub7 local38) {
					Class115_Sub1.method8671(Class70.aClass70_1, local38.aString71, local38.anInt2613 * 750203913, local38.getCause(), -199906023);
				} catch (@Pc(51) Throwable local51) {
				}
			}
			anInt4995 = 84911399;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4995 * 2097642135 == 1) {
			aClass74Array1 = Class74.method1309(225593136);
			Class74.aClass74_9.method1290(new Class476(Class329.aClass480_95), 2021287207);
			Class74.aClass74_6.method1290(new Class494("jaggl"), 1362669622);
			@Pc(80) Class494 local80 = new Class494("jagdx");
			if (!Class450.aString209.startsWith("win")) {
				local80.method30286(432858815);
			}
			Class74.aClass74_3.method1290(local80, 941530237);
			Class74.aClass74_4.method1290(new Class494("sw3d"), 1232138449);
			Class74.aClass74_26.method1290(new Class494("hw3d"), 1118126722);
			Class74.aClass74_23.method1290(new Class494("RuneScape-Setup.exe", true), 960677649);
			Class74.aClass74_7.method1290(new Class476(Class80_Sub15.aClass480_35), 1735032219);
			Class74.aClass74_8.method1290(new Class476(Class371.aClass480_102), 1127458588);
			Class74.aClass74_12.method1290(new Class476(Class171.aClass480_82), 1322387853);
			Class74.aClass74_10.method1290(new Class476(Class223.aClass480_84), 1143571341);
			Class74.aClass74_11.method1290(new Class476(Class56.aClass480_7), 1291295159);
			Class74.aClass74_19.method1290(new Class476(Class352.aClass480_97), 2029891712);
			Class74.aClass74_27.method1290(new Class476(Class231.aClass480_86), 1940459161);
			Class74.aClass74_13.method1290(new Class476(Class143_Sub3.aClass480_34), 1465036767);
			Class74.aClass74_2.method1290(new Class476(Class83.aClass480_12), 1131760229);
			Class74.aClass74_15.method1290(new Class476(Class228.aClass480_85), 1590434096);
			Class74.aClass74_16.method1290(new Class476(Class688.aClass480_135), 2087870924);
			Class74.aClass74_17.method1290(new Class476(Class62.aClass480_8), 1479329982);
			Class74.aClass74_18.method1290(new Class476(Class480.aClass480_120), 1024378855);
			Class74.aClass74_25.method1290(new Class476(Class687.aClass480_134), 1704189951);
			Class74.aClass74_20.method1290(new Class476(Class155.aClass480_41), 1149875686);
			Class74.aClass74_21.method1290(new Class498(client.aClass480_83, "huffman"), 1089225576);
			Class74.aClass74_22.method1290(new Class476(Class104_Sub2.aClass480_16), 1903474477);
			Class74.aClass74_14.method1290(new Class476(Class438.aClass480_112), 2135344581);
			Class74.aClass74_24.method1290(new Class476(Class569.aClass480_124), 1636912183);
			Class74.aClass74_5.method1290(new Class477(Class588.aClass480_127, 0), 2129954754);
			for (local257 = 0; local257 < aClass74Array1.length; local257++) {
				if (aClass74Array1[local257].method1292(-1435917229) == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class74[] local277 = aClass74Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class74 local287 = local277[local279];
				@Pc(291) int local291 = local287.method1291(-2135663472);
				local297 = local287.method1292(-1435917229).method30349((byte) -6);
				local257 += local291 * local297 / 100;
			}
			anInt4994 = local257 * -2117366737;
			anInt4995 = 169822798;
		}
		if (aClass74Array1 == null) {
			return 100;
		}
		@Pc(319) int local319 = 0;
		local257 = 0;
		@Pc(323) boolean local323 = true;
		@Pc(325) Class74[] local325 = aClass74Array1;
		for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
			@Pc(335) Class74 local335 = local325[local327];
			local297 = local335.method1291(-2090716669);
			@Pc(345) int local345 = local335.method1292(-1435917229).method30349((byte) -84);
			if (local345 < 100) {
				local323 = false;
			}
			local319 += local297;
			local257 += local345 * local297 / 100;
		}
		if (local323) {
			aClass74Array1 = null;
		}
		local257 -= anInt4994 * -821478705;
		local319 -= anInt4994 * -821478705;
		local279 = local319 > 0 ? local257 * 100 / local319 : 100;
		if (!local323 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "()I")
	public static int method30011() {
		if (anInt4995 * 2097642135 == 0) {
			Class74.aClass74_1.method1290(new Class494("jaclib"), 1114340370);
			if (Class74.aClass74_1.method1292(-1435917229).method30349((byte) 72) != 100) {
				return 1;
			}
			if (!((Class494) Class74.aClass74_1.method1292(-1435917229)).method30291(-285821783) && !Class117.method8819((byte) 76)) {
				try {
					Class564.aClient1.method25208(-713974552);
					Class322.method27602(47357210);
					Ping.init();
				} catch (@Pc(38) Exception_Sub7 local38) {
					Class115_Sub1.method8671(Class70.aClass70_1, local38.aString71, local38.anInt2613 * 750203913, local38.getCause(), -199906023);
				} catch (@Pc(51) Throwable local51) {
				}
			}
			anInt4995 = 84911399;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4995 * 2097642135 == 1) {
			aClass74Array1 = Class74.method1309(-2126713277);
			Class74.aClass74_9.method1290(new Class476(Class329.aClass480_95), 1884769310);
			Class74.aClass74_6.method1290(new Class494("jaggl"), 1826397925);
			@Pc(80) Class494 local80 = new Class494("jagdx");
			if (!Class450.aString209.startsWith("win")) {
				local80.method30286(1592535059);
			}
			Class74.aClass74_3.method1290(local80, 1620231556);
			Class74.aClass74_4.method1290(new Class494("sw3d"), 946175415);
			Class74.aClass74_26.method1290(new Class494("hw3d"), 1689545185);
			Class74.aClass74_23.method1290(new Class494("RuneScape-Setup.exe", true), 1870914689);
			Class74.aClass74_7.method1290(new Class476(Class80_Sub15.aClass480_35), 2006601701);
			Class74.aClass74_8.method1290(new Class476(Class371.aClass480_102), 1878403340);
			Class74.aClass74_12.method1290(new Class476(Class171.aClass480_82), 1831675023);
			Class74.aClass74_10.method1290(new Class476(Class223.aClass480_84), 1780058852);
			Class74.aClass74_11.method1290(new Class476(Class56.aClass480_7), 1590568757);
			Class74.aClass74_19.method1290(new Class476(Class352.aClass480_97), 1051332286);
			Class74.aClass74_27.method1290(new Class476(Class231.aClass480_86), 1786194313);
			Class74.aClass74_13.method1290(new Class476(Class143_Sub3.aClass480_34), 1800877962);
			Class74.aClass74_2.method1290(new Class476(Class83.aClass480_12), 2126856883);
			Class74.aClass74_15.method1290(new Class476(Class228.aClass480_85), 1590519154);
			Class74.aClass74_16.method1290(new Class476(Class688.aClass480_135), 1822471883);
			Class74.aClass74_17.method1290(new Class476(Class62.aClass480_8), 1465868329);
			Class74.aClass74_18.method1290(new Class476(Class480.aClass480_120), 1239988696);
			Class74.aClass74_25.method1290(new Class476(Class687.aClass480_134), 2033159771);
			Class74.aClass74_20.method1290(new Class476(Class155.aClass480_41), 2114048252);
			Class74.aClass74_21.method1290(new Class498(client.aClass480_83, "huffman"), 2110220937);
			Class74.aClass74_22.method1290(new Class476(Class104_Sub2.aClass480_16), 1474113711);
			Class74.aClass74_14.method1290(new Class476(Class438.aClass480_112), 988368297);
			Class74.aClass74_24.method1290(new Class476(Class569.aClass480_124), 1918876711);
			Class74.aClass74_5.method1290(new Class477(Class588.aClass480_127, 0), 1659833780);
			for (local257 = 0; local257 < aClass74Array1.length; local257++) {
				if (aClass74Array1[local257].method1292(-1435917229) == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class74[] local277 = aClass74Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class74 local287 = local277[local279];
				@Pc(291) int local291 = local287.method1291(-1748507919);
				local297 = local287.method1292(-1435917229).method30349((byte) 59);
				local257 += local291 * local297 / 100;
			}
			anInt4994 = local257 * -2117366737;
			anInt4995 = 169822798;
		}
		if (aClass74Array1 == null) {
			return 100;
		}
		@Pc(319) int local319 = 0;
		local257 = 0;
		@Pc(323) boolean local323 = true;
		@Pc(325) Class74[] local325 = aClass74Array1;
		for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
			@Pc(335) Class74 local335 = local325[local327];
			local297 = local335.method1291(-1851690102);
			@Pc(345) int local345 = local335.method1292(-1435917229).method30349((byte) 43);
			if (local345 < 100) {
				local323 = false;
			}
			local319 += local297;
			local257 += local345 * local297 / 100;
		}
		if (local323) {
			aClass74Array1 = null;
		}
		local257 -= anInt4994 * -821478705;
		local319 -= anInt4994 * -821478705;
		local279 = local319 > 0 ? local257 * 100 / local319 : 100;
		if (!local323 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "()V")
	public static void method30012() {
		anInt4995 = 0;
		anInt4994 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "()V")
	public static void method30013() {
		anInt4995 = 0;
		anInt4994 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "()I")
	public static int method30014() {
		if (anInt4995 * 2097642135 == 0) {
			Class74.aClass74_1.method1290(new Class494("jaclib"), 952423169);
			if (Class74.aClass74_1.method1292(-1435917229).method30349((byte) -97) != 100) {
				return 1;
			}
			if (!((Class494) Class74.aClass74_1.method1292(-1435917229)).method30291(-224549773) && !Class117.method8819((byte) 38)) {
				try {
					Class564.aClient1.method25208(-713974552);
					Class322.method27602(47357210);
					Ping.init();
				} catch (@Pc(38) Exception_Sub7 local38) {
					Class115_Sub1.method8671(Class70.aClass70_1, local38.aString71, local38.anInt2613 * 750203913, local38.getCause(), -199906023);
				} catch (@Pc(51) Throwable local51) {
				}
			}
			anInt4995 = 84911399;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4995 * 2097642135 == 1) {
			aClass74Array1 = Class74.method1309(-721982682);
			Class74.aClass74_9.method1290(new Class476(Class329.aClass480_95), 1904212894);
			Class74.aClass74_6.method1290(new Class494("jaggl"), 1762717395);
			@Pc(80) Class494 local80 = new Class494("jagdx");
			if (!Class450.aString209.startsWith("win")) {
				local80.method30286(902325804);
			}
			Class74.aClass74_3.method1290(local80, 1547555399);
			Class74.aClass74_4.method1290(new Class494("sw3d"), 2146317954);
			Class74.aClass74_26.method1290(new Class494("hw3d"), 1431556593);
			Class74.aClass74_23.method1290(new Class494("RuneScape-Setup.exe", true), 1653566492);
			Class74.aClass74_7.method1290(new Class476(Class80_Sub15.aClass480_35), 1176527415);
			Class74.aClass74_8.method1290(new Class476(Class371.aClass480_102), 1211494763);
			Class74.aClass74_12.method1290(new Class476(Class171.aClass480_82), 2075093734);
			Class74.aClass74_10.method1290(new Class476(Class223.aClass480_84), 935453032);
			Class74.aClass74_11.method1290(new Class476(Class56.aClass480_7), 1648438245);
			Class74.aClass74_19.method1290(new Class476(Class352.aClass480_97), 1654765089);
			Class74.aClass74_27.method1290(new Class476(Class231.aClass480_86), 1758827782);
			Class74.aClass74_13.method1290(new Class476(Class143_Sub3.aClass480_34), 1627767485);
			Class74.aClass74_2.method1290(new Class476(Class83.aClass480_12), 1571916638);
			Class74.aClass74_15.method1290(new Class476(Class228.aClass480_85), 1500917526);
			Class74.aClass74_16.method1290(new Class476(Class688.aClass480_135), 1150422473);
			Class74.aClass74_17.method1290(new Class476(Class62.aClass480_8), 1844996186);
			Class74.aClass74_18.method1290(new Class476(Class480.aClass480_120), 1400658775);
			Class74.aClass74_25.method1290(new Class476(Class687.aClass480_134), 1498639021);
			Class74.aClass74_20.method1290(new Class476(Class155.aClass480_41), 1622201718);
			Class74.aClass74_21.method1290(new Class498(client.aClass480_83, "huffman"), 1033336155);
			Class74.aClass74_22.method1290(new Class476(Class104_Sub2.aClass480_16), 1811058163);
			Class74.aClass74_14.method1290(new Class476(Class438.aClass480_112), 1946317225);
			Class74.aClass74_24.method1290(new Class476(Class569.aClass480_124), 1024502670);
			Class74.aClass74_5.method1290(new Class477(Class588.aClass480_127, 0), 1744497568);
			for (local257 = 0; local257 < aClass74Array1.length; local257++) {
				if (aClass74Array1[local257].method1292(-1435917229) == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class74[] local277 = aClass74Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class74 local287 = local277[local279];
				@Pc(291) int local291 = local287.method1291(-1770175991);
				local297 = local287.method1292(-1435917229).method30349((byte) -37);
				local257 += local291 * local297 / 100;
			}
			anInt4994 = local257 * -2117366737;
			anInt4995 = 169822798;
		}
		if (aClass74Array1 == null) {
			return 100;
		}
		@Pc(319) int local319 = 0;
		local257 = 0;
		@Pc(323) boolean local323 = true;
		@Pc(325) Class74[] local325 = aClass74Array1;
		for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
			@Pc(335) Class74 local335 = local325[local327];
			local297 = local335.method1291(-1870042720);
			@Pc(345) int local345 = local335.method1292(-1435917229).method30349((byte) 17);
			if (local345 < 100) {
				local323 = false;
			}
			local319 += local297;
			local257 += local345 * local297 / 100;
		}
		if (local323) {
			aClass74Array1 = null;
		}
		local257 -= anInt4994 * -821478705;
		local319 -= anInt4994 * -821478705;
		local279 = local319 > 0 ? local257 * 100 / local319 : 100;
		if (!local323 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "()V")
	public static void method30015() {
		anInt4995 = 0;
		anInt4994 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "uc", descriptor = "(Lclient!yp;I)V")
	static void method30016(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2058773055);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >>> 16];
		@Pc(27) Class327 local27 = Class165_Sub45.method16896(local22, local16, -514653960);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local27 == null ? -1 : -2053489901 * local27.anInt4087;
	}

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "(Ljava/lang/CharSequence;I)J")
	static long method30017(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pg", name = "jk", descriptor = "(Lclient!yp;B)V")
	static void method30018(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	Class481() throws Throwable {
		throw new Error();
	}
}
