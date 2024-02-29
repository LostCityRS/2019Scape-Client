package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public class Class249 {

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "[Lclient!ew;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "[Lclient!ez;")
	static Class255[] aClass255Array1;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "S")
	static short aShort163;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "S")
	static short aShort164;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "[Lclient!ea;")
	public static Class239[] aClass239Array1;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!aat;")
	public static Class22 aClass22_51 = new Class22();

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "Lclient!aan;")
	public static Class16 aClass16_24 = new Class16(32);

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	static int anInt3840 = -1432082549;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
	static int anInt3841 = 0;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
	static int anInt3839 = 0;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Z")
	static boolean aBoolean664 = false;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	static int anInt3842 = 1512963435;

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
	static int anInt3843 = -1397359395;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "Lclient!ep;")
	public static final Interface23 anInterface23_3 = new Class251();

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(Lclient!alw;B)Lclient!lv;", line = 37)
	public static Class407 method25932(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) String local3 = arg0.method22509(2121553575);
		@Pc(10) Class390 local10 = Class708.method36753(947855738)[arg0.method22465((short) 16384)];
		@Pc(17) Class392 local17 = Class252.method25976(-1668995175)[arg0.method22465((short) 16384)];
		@Pc(21) int local21 = arg0.method22475((byte) -7);
		@Pc(25) int local25 = arg0.method22475((byte) -99);
		@Pc(29) int local29 = arg0.method22465((short) 16384);
		@Pc(33) int local33 = arg0.method22465((short) 16384);
		@Pc(37) int local37 = arg0.method22465((short) 16384);
		@Pc(41) int local41 = arg0.method22472(-1434290800);
		@Pc(45) int local45 = arg0.method22472(-1434290800);
		@Pc(49) int local49 = arg0.method22542(-1658985675);
		@Pc(53) int local53 = arg0.method22483(-118643075);
		@Pc(57) int local57 = arg0.method22483(-118643075);
		return new Class407(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 53)
	Class249() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "(I)Z", line = 58)
	public static boolean method25933(@OriginalArg(0) int arg0) {
		if (anInt3843 * -213302133 != arg0 || Class136.aClass244_1 == null) {
			Class287.method26542(-100950526);
			Class136.aClass244_1 = Class244.aClass244_2;
			anInt3843 = arg0 * 1397359395;
		}
		@Pc(40) int local40;
		if (Class244.aClass244_2 == Class136.aClass244_1) {
			@Pc(23) byte[] local23 = Class446.aClass497_117.method30079(arg0, (byte) 64);
			if (local23 == null) {
				return false;
			}
			@Pc(33) Class93_Sub41 local33 = new Class93_Sub41(local23);
			Class437.method28816(local33, -205095225);
			local40 = local33.method22465((short) 16384);
			@Pc(42) int local42;
			for (local42 = 0; local42 < local40; local42++) {
				aClass22_51.method408(new Class93_Sub27(local33), -98032085);
			}
			local42 = local33.method22528((byte) -32);
			aClass255Array1 = new Class255[local42];
			@Pc(63) int local63;
			for (local63 = 0; local63 < local42; local63++) {
				aClass255Array1[local63] = new Class255(local33);
			}
			local63 = local33.method22528((byte) -108);
			aClass239Array1 = new Class239[local63];
			@Pc(84) int local84;
			for (local84 = 0; local84 < local63; local84++) {
				aClass239Array1[local84] = new Class239(local33, local84);
			}
			local84 = local33.method22528((byte) -78);
			Class152.aClass243Array2 = new Class243[local84];
			@Pc(106) int local106;
			for (local106 = 0; local106 < local84; local106++) {
				Class152.aClass243Array2[local106] = new Class243(local33);
			}
			local106 = local33.method22528((byte) 0);
			Class716.aClass250Array1 = new Class250[local106];
			@Pc(127) int local127;
			for (local127 = 0; local127 < local106; local127++) {
				Class716.aClass250Array1[local127] = new Class250(local33);
			}
			local127 = local33.method22528((byte) -48);
			aClass110Array1 = new Class110[local127];
			for (@Pc(148) int local148 = 0; local148 < local127; local148++) {
				aClass110Array1[local148] = Class18.method242(local33, -1357301533);
			}
			Class136.aClass244_1 = Class244.aClass244_3;
		}
		if (Class136.aClass244_1 == Class244.aClass244_3) {
			@Pc(166) boolean local166 = true;
			@Pc(168) Class239[] local168 = aClass239Array1;
			for (local40 = 0; local40 < local168.length; local40++) {
				@Pc(178) Class239 local178 = local168[local40];
				if (!local178.method25816(-1271539073)) {
					local166 = false;
				}
			}
			@Pc(188) Class110[] local188 = aClass110Array1;
			for (local40 = 0; local40 < local188.length; local40++) {
				@Pc(198) Class110 local198 = local188[local40];
				if (!local198.method20141(-1981078987)) {
					local166 = false;
				}
			}
			@Pc(208) Class243[] local208 = Class152.aClass243Array2;
			for (local40 = 0; local40 < local208.length; local40++) {
				@Pc(218) Class243 local218 = local208[local40];
				if (!local218.method25886(-1461419039)) {
					local166 = false;
				}
			}
			if (!local166) {
				return false;
			}
			Class136.aClass244_1 = Class244.aClass244_4;
		}
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(I)Z", line = 58)
	public static boolean method25934(@OriginalArg(0) int arg0) {
		if (anInt3843 * -213302133 != arg0 || Class136.aClass244_1 == null) {
			Class287.method26542(-100950526);
			Class136.aClass244_1 = Class244.aClass244_2;
			anInt3843 = arg0 * 1397359395;
		}
		@Pc(40) int local40;
		if (Class244.aClass244_2 == Class136.aClass244_1) {
			@Pc(23) byte[] local23 = Class446.aClass497_117.method30079(arg0, (byte) 94);
			if (local23 == null) {
				return false;
			}
			@Pc(33) Class93_Sub41 local33 = new Class93_Sub41(local23);
			Class437.method28816(local33, 1415888156);
			local40 = local33.method22465((short) 16384);
			@Pc(42) int local42;
			for (local42 = 0; local42 < local40; local42++) {
				aClass22_51.method408(new Class93_Sub27(local33), 204396591);
			}
			local42 = local33.method22528((byte) -96);
			aClass255Array1 = new Class255[local42];
			@Pc(63) int local63;
			for (local63 = 0; local63 < local42; local63++) {
				aClass255Array1[local63] = new Class255(local33);
			}
			local63 = local33.method22528((byte) -114);
			aClass239Array1 = new Class239[local63];
			@Pc(84) int local84;
			for (local84 = 0; local84 < local63; local84++) {
				aClass239Array1[local84] = new Class239(local33, local84);
			}
			local84 = local33.method22528((byte) -17);
			Class152.aClass243Array2 = new Class243[local84];
			@Pc(106) int local106;
			for (local106 = 0; local106 < local84; local106++) {
				Class152.aClass243Array2[local106] = new Class243(local33);
			}
			local106 = local33.method22528((byte) -48);
			Class716.aClass250Array1 = new Class250[local106];
			@Pc(127) int local127;
			for (local127 = 0; local127 < local106; local127++) {
				Class716.aClass250Array1[local127] = new Class250(local33);
			}
			local127 = local33.method22528((byte) -128);
			aClass110Array1 = new Class110[local127];
			for (@Pc(148) int local148 = 0; local148 < local127; local148++) {
				aClass110Array1[local148] = Class18.method242(local33, -2080157487);
			}
			Class136.aClass244_1 = Class244.aClass244_3;
		}
		if (Class136.aClass244_1 == Class244.aClass244_3) {
			@Pc(166) boolean local166 = true;
			@Pc(168) Class239[] local168 = aClass239Array1;
			for (local40 = 0; local40 < local168.length; local40++) {
				@Pc(178) Class239 local178 = local168[local40];
				if (!local178.method25816(-1241166023)) {
					local166 = false;
				}
			}
			@Pc(188) Class110[] local188 = aClass110Array1;
			for (local40 = 0; local40 < local188.length; local40++) {
				@Pc(198) Class110 local198 = local188[local40];
				if (!local198.method20141(-2126372563)) {
					local166 = false;
				}
			}
			@Pc(208) Class243[] local208 = Class152.aClass243Array2;
			for (local40 = 0; local40 < local208.length; local40++) {
				@Pc(218) Class243 local218 = local208[local40];
				if (!local218.method25886(-1770910812)) {
					local166 = false;
				}
			}
			if (!local166) {
				return false;
			}
			Class136.aClass244_1 = Class244.aClass244_4;
		}
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "(Lclient!alw;)V", line = 124)
	static void method25935(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			switch(local3) {
				case 0:
					anInt3841 = arg0.method22472(-1434290800) * -1784392859;
					anInt3839 = arg0.method22472(-1434290800) * -1584427833;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "(Lclient!alw;)V", line = 124)
	static void method25936(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			switch(local3) {
				case 0:
					anInt3841 = arg0.method22472(-1434290800) * -1784392859;
					anInt3839 = arg0.method22472(-1434290800) * -1584427833;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()V", line = 137)
	public static void method25937() {
		aClass16_24.method225((byte) 119);
		aClass22_51.method405(-2037259486);
		aClass255Array1 = null;
		aClass239Array1 = null;
		Class152.aClass243Array2 = null;
		Class716.aClass250Array1 = null;
		aClass110Array1 = null;
		anInt3840 = -1432082549;
		anInt3841 = 0;
		anInt3839 = 0;
		Class136.aClass244_1 = null;
		anInt3843 = -1397359395;
		anInt3842 = 1512963435;
		if (!aBoolean664) {
			return;
		}
		client.aShort150 = Class122_Sub3.aShort76;
		client.aShort151 = aShort163;
		client.aShort155 = Class152_Sub1.aShort99;
		client.aShort156 = aShort164;
		aBoolean664 = false;
	}

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "()V", line = 137)
	public static void method25938() {
		aClass16_24.method225((byte) 109);
		aClass22_51.method405(-2037259486);
		aClass255Array1 = null;
		aClass239Array1 = null;
		Class152.aClass243Array2 = null;
		Class716.aClass250Array1 = null;
		aClass110Array1 = null;
		anInt3840 = -1432082549;
		anInt3841 = 0;
		anInt3839 = 0;
		Class136.aClass244_1 = null;
		anInt3843 = -1397359395;
		anInt3842 = 1512963435;
		if (!aBoolean664) {
			return;
		}
		client.aShort150 = Class122_Sub3.aShort76;
		client.aShort151 = aShort163;
		client.aShort155 = Class152_Sub1.aShort99;
		client.aShort156 = aShort164;
		aBoolean664 = false;
	}

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "(Lclient!ajt;ZI)V", line = 150)
	static final void method25939(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30496(1160563437), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735, 1526889607)) {
				if (arg1) {
					Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null, -1222567641);
				} else {
					Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0, (byte) -67);
				}
				arg0.method23969(1030934219);
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30459(497944052) - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30466((short) 128) - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30496(2040388510), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277, -1734264319))) {
			if (arg1) {
				Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1, -1222567641);
			} else {
				Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0, (byte) -16);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969(-683623507);
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969(675277346);
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "()V", line = 160)
	public static void method25940() {
		Class122_Sub3.aShort76 = client.aShort150;
		aShort163 = client.aShort151;
		Class152_Sub1.aShort99 = client.aShort155;
		aShort164 = client.aShort156;
		aBoolean664 = true;
		anInt3842 = Class274.aClass258_1.method26105(-784246097) * -1512963435;
		if (anInt3839 * 279147767 != 0 && anInt3841 * 2018616941 != 0) {
			client.aShort155 = 334;
			client.aShort156 = 334;
			client.aShort151 = client.aShort150 = (short) (anInt3839 * 1189735936 / (anInt3841 * 2018616941));
		}
	}

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "()V", line = 160)
	public static void method25941() {
		Class122_Sub3.aShort76 = client.aShort150;
		aShort163 = client.aShort151;
		Class152_Sub1.aShort99 = client.aShort155;
		aShort164 = client.aShort156;
		aBoolean664 = true;
		anInt3842 = Class274.aClass258_1.method26105(-799354773) * -1512963435;
		if (anInt3839 * 279147767 != 0 && anInt3841 * 2018616941 != 0) {
			client.aShort155 = 334;
			client.aShort156 = 334;
			client.aShort151 = client.aShort150 = (short) (anInt3839 * 1189735936 / (anInt3841 * 2018616941));
		}
	}

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "(Z)V", line = 174)
	public static void method25942(@OriginalArg(0) boolean arg0) {
		if (client.anInt3463 * 1819062465 == 4 || client.anInt3463 * 1819062465 == 3) {
			return;
		}
		if (!arg0) {
			if (aClass110Array1 != null) {
				@Pc(16) Class110[] local16 = aClass110Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class110 local26 = local16[local18];
					local26.method20140(-1894331367);
				}
			}
			if (anInt3842 * -1535788867 != -1) {
				Class274.aClass258_1.method26119(anInt3842 * -1535788867, 255, (byte) 0);
			}
		}
		client.anInt3463 = 1556053252;
		Class36.aClass93_Sub41_1 = null;
		client.aBoolean613 = false;
		if (anInt3843 * -213302133 > 0) {
			Class165.method15320(Class155.aClass155_65, anInt3843 * -213302133, -1, -532799195);
		}
		Class287.method26542(-100950526);
		@Pc(68) Class93_Sub22 local68 = Class102.method2588(Class446.aClass446_42, client.aClass175_2.aClass24_2, (byte) 25);
		local68.aClass93_Sub41_Sub2_1.method22394(arg0 ? 1 : 0, (byte) -29);
		client.aClass175_2.method24356(local68, -2085194401);
	}

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "(Z)V", line = 174)
	public static void method25943(@OriginalArg(0) boolean arg0) {
		if (client.anInt3463 * 1819062465 == 4 || client.anInt3463 * 1819062465 == 3) {
			return;
		}
		if (!arg0) {
			if (aClass110Array1 != null) {
				@Pc(16) Class110[] local16 = aClass110Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class110 local26 = local16[local18];
					local26.method20140(-2044593641);
				}
			}
			if (anInt3842 * -1535788867 != -1) {
				Class274.aClass258_1.method26119(anInt3842 * -1535788867, 255, (byte) 0);
			}
		}
		client.anInt3463 = 1556053252;
		Class36.aClass93_Sub41_1 = null;
		client.aBoolean613 = false;
		if (anInt3843 * -213302133 > 0) {
			Class165.method15320(Class155.aClass155_65, anInt3843 * -213302133, -1, -532799195);
		}
		Class287.method26542(-100950526);
		@Pc(68) Class93_Sub22 local68 = Class102.method2588(Class446.aClass446_42, client.aClass175_2.aClass24_2, (byte) 60);
		local68.aClass93_Sub41_Sub2_1.method22394(arg0 ? 1 : 0, (byte) -49);
		client.aClass175_2.method24356(local68, -1911437675);
	}

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "(Z)V", line = 174)
	public static void method25944(@OriginalArg(0) boolean arg0) {
		if (client.anInt3463 * 1819062465 == 4 || client.anInt3463 * 1819062465 == 3) {
			return;
		}
		if (!arg0) {
			if (aClass110Array1 != null) {
				@Pc(16) Class110[] local16 = aClass110Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class110 local26 = local16[local18];
					local26.method20140(-2069197363);
				}
			}
			if (anInt3842 * -1535788867 != -1) {
				Class274.aClass258_1.method26119(anInt3842 * -1535788867, 255, (byte) 0);
			}
		}
		client.anInt3463 = 1556053252;
		Class36.aClass93_Sub41_1 = null;
		client.aBoolean613 = false;
		if (anInt3843 * -213302133 > 0) {
			Class165.method15320(Class155.aClass155_65, anInt3843 * -213302133, -1, -532799195);
		}
		Class287.method26542(-100950526);
		@Pc(68) Class93_Sub22 local68 = Class102.method2588(Class446.aClass446_42, client.aClass175_2.aClass24_2, (byte) 34);
		local68.aClass93_Sub41_Sub2_1.method22394(arg0 ? 1 : 0, (byte) -125);
		client.aClass175_2.method24356(local68, -1913188448);
	}

	@OriginalMember(owner = "client!eq", name = "hf", descriptor = "(BI)V", line = 4651)
	static final void method25945(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(3) byte[][][] local3 = client.aClass532_1.method30504((byte) -35);
		if (local3 == null) {
			local3 = new byte[4][client.aClass532_1.method30459(-999432476)][client.aClass532_1.method30466((short) 128)];
			client.aClass532_1.method30508(local3, 1388606318);
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(26) int local26 = 0; local26 < client.aClass532_1.method30459(60067612); local26++) {
				for (@Pc(33) int local33 = 0; local33 < client.aClass532_1.method30466((short) 128); local33++) {
					local3[local21][local26][local33] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "apj", descriptor = "(Lclient!yf;B)V", line = 12681)
	static final void method25946(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		Class65.aClass123_Sub1_2.method8963(1629290341);
	}
}
