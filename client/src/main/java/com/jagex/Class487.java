package com.jagex;

import jaclib.ping.Ping;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public class Class487 {

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[Lclient!acg;")
	static Class57[] aClass57Array1;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	static int anInt5150 = 0;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	static int anInt5151 = 0;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(Ljava/awt/Component;ZI)Lclient!uj;", line = 12)
	public static Class153 method29807(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 66)
	Class487() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "()I", line = 71)
	public static int method29808() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -593383153);
			if (Class57.aClass57_3.method1085(160569037).method30020(1413396320) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -115) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-523293621);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), 1117538185);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078((byte) 54);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -472748447);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -936869172);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 14);
			}
			Class57.aClass57_20.method1086(local81, -1559297592);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -1339824758);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -2061624853);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -686811048);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -1699889818);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -1490856040);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -1201044084);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -1524882887);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -460863773);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -490676732);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -998911682);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -1848221823);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -774508957);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -1052302723);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -1870629487);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -1411059237);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -1018122380);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -1461670407);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -1505116781);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -1821517595);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -2123260027);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -1619149698);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -1221775537);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1629206703);
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(1448972101);
				local298 = local288.method1085(160569037).method30020(1150222830);
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(1574896221);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(988229031);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "()I", line = 71)
	public static int method29809() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -2057977148);
			if (Class57.aClass57_3.method1085(160569037).method30020(1409207939) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -52) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-793649506);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), -113602715);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078((byte) 118);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -1367249815);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -1883091303);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 113);
			}
			Class57.aClass57_20.method1086(local81, -891101313);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -877824722);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -1008040090);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -1081925182);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -501821684);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -1067899941);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -1699437952);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -714456529);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -1219883836);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -875302963);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -1668228958);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -1196557344);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -1649496992);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -1845805857);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -2096129953);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -684096894);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -846406145);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -1513890580);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -1762906946);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -1470282609);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -1483080760);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -1043306518);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -1676908037);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1913441283);
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(1932113071);
				local298 = local288.method1085(160569037).method30020(2017190487);
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(292661551);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(1447048794);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "()I", line = 71)
	public static int method29810() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -1284195279);
			if (Class57.aClass57_3.method1085(160569037).method30020(2058705281) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -2) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-352548460);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), 1782004786);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078((byte) 69);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -1641871640);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -1385375672);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 24);
			}
			Class57.aClass57_20.method1086(local81, -1698930205);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -569185225);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -1114811337);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -714600772);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -493320522);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -2011668089);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -585400889);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -1431232488);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -967224437);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -1801499461);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -1495514892);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -1377279774);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -1188206095);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -637767771);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -2013326366);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -1023907101);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -2062685026);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -583218049);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -693492399);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -1306141969);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -1540020146);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -533969100);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -815817430);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1030822220);
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(645634074);
				local298 = local288.method1085(160569037).method30020(1894578447);
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(958020406);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(1678696937);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()I", line = 71)
	public static int method29811() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -1160492675);
			if (Class57.aClass57_3.method1085(160569037).method30020(1453552499) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -44) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-2130999518);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), -281777364);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078((byte) 24);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -1039174641);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -1862525825);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 33);
			}
			Class57.aClass57_20.method1086(local81, -854799758);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -1174695382);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -750324098);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -1116023512);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -820957147);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -1782770058);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -1116519646);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -1981930849);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -1488762830);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -458338946);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -945201228);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -1570826886);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -724273486);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -663493618);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -537987209);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -965725322);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -1585394796);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -1982281628);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -436166768);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -2085601656);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -1633559804);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -823636723);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -1063203456);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1389901847);
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(1973991109);
				local298 = local288.method1085(160569037).method30020(1363871663);
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(1831237271);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(1807813354);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "()I", line = 71)
	public static int method29812() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -803047398);
			if (Class57.aClass57_3.method1085(160569037).method30020(967767645) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -90) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-1939258681);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), -797934845);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078((byte) 80);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -1876639037);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -1579979185);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 98);
			}
			Class57.aClass57_20.method1086(local81, -1661460641);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -2132999986);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -2139804159);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -1074513576);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -1483677293);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -807082198);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -1243159136);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -1272285436);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -1016179178);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -1260207181);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -1316062288);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -703925288);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -606652099);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -625658523);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -990284673);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -2002802772);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -597249425);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -1136002619);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -650127807);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -887851430);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -1604747816);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -987595785);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -1789457896);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1547478853);
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(877164318);
				local298 = local288.method1085(160569037).method30020(1986308834);
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(1904007867);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(1664044925);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "(IIB)I", line = 160)
	public static int method29813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "()V", line = 165)
	public static void method29814() {
		anInt5150 = 0;
		anInt5151 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "()V", line = 165)
	public static void method29815() {
		anInt5150 = 0;
		anInt5151 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "ie", descriptor = "(IIIIIIB)V", line = 5625)
	static final void method29816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 == 2) {
				Class166_Sub11.method15594(local11.anInt3251 * -1373605449, local11.anInt3248 * 846615897, local11.anInt3249 * 166908561, 0, local11.anInt3244 * 1880035118, false, false, -531138468);
				if (client.aFloatArray93[0] > -1.0F && client.anInt3485 % 20 < 10) {
					@Pc(60) Class100 local60 = Class707.aClass100Array9[local11.anInt3253 * -2053428357];
					@Pc(70) int local70 = (int) (client.aFloatArray93[0] + (float) arg0 - 12.0F);
					@Pc(80) int local80 = (int) (client.aFloatArray93[1] + (float) arg1 - 28.0F);
					local60.method18161(local70, local80);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "in", descriptor = "(Lclient!ahm;Lclient!ahm;IIIIIIIB)V", line = 6201)
	static final void method29817(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class132_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		@Pc(3) int local3 = arg1.method20032((byte) 115);
		if (local3 == -1) {
			return;
		}
		@Pc(9) Class100 local9 = null;
		local9 = (Class100) client.aClass240_66.method25829((long) local3);
		if (local9 == null) {
			@Pc(22) Class105[] local22 = Class203.method24657(Class110_Sub7.aClass497_22, local3, 0);
			if (local22 == null) {
				return;
			}
			local9 = Class694.aClass104_14.method20589(local22[0], true);
			client.aClass240_66.method25838(local9, (long) local3);
		}
		@Pc(41) Class472 local41 = arg0.method24220().aClass472_61;
		Class166_Sub11.method15594(arg0.aByte100, (int) local41.aFloat317, (int) local41.aFloat319, arg0.method19986(-1776581135) * 256, 0, false, false, 452070678);
		@Pc(69) int local69 = (int) (client.aFloatArray93[0] + (float) arg3 - 18.0F);
		@Pc(81) int local81 = (int) ((float) arg4 + client.aFloatArray93[1] - 16.0F - 54.0F);
		@Pc(89) int local89 = local69 + arg2 / 4 * 18;
		@Pc(97) int local97 = local81 + arg2 % 4 * 18;
		local9.method18161(local89, local97);
		if (arg1 == arg0) {
			Class694.aClass104_14.method20465(local89 - 1, local97 - 1, 18, 18, -256, -765364375);
		}
		@Pc(119) Class149_Sub5 local119 = Class19.method23550(1860098840);
		local119.aClass132_Sub1_Sub1_Sub1_1 = arg1;
		local119.anInt1449 = local89 * -1551293887;
		local119.anInt1447 = local97 * 897555083;
		local119.anInt1450 = (local89 + 16) * 670779561;
		local119.anInt1451 = (local97 + 16) * 470085231;
		client.aClass21_7.method380(local119, (byte) 4);
	}

	@OriginalMember(owner = "client!pm", name = "xf", descriptor = "(Lclient!yf;I)V", line = 9237)
	static final void method29818(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.userStaffModLevel * 2055688893 >= 2) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.userStaffModLevel * 2055688893;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "asj", descriptor = "(Lclient!yf;S)V", line = 13159)
	static final void method29819(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class51.options.method14363(Class51.options.aClass166_Sub4_1, local13, (byte) 95);
		if (!local28) {
			Class51.options.method14363(Class51.options.aClass166_Sub40_1, 0, (byte) 44);
		}
		Class106_Sub1.method5135(-640539118);
		client.aBoolean601 = false;
	}
}
