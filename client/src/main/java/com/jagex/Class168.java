package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public class Class168 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	static final int anInt2440 = 350;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Ljava/lang/String;")
	static final String aString60 = "Failure";

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	static int anInt2441;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "J")
	static long aLong111;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	static int anInt2444;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "Ljava/io/FileOutputStream;")
	static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString62 = "\\/.:, _-+[]~@";

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "Ljava/lang/String;")
	static final String aString63 = "Success";

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	static int anInt2442 = 0;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
	static int anInt2446 = 0;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Ljava/lang/String;")
	static String aString61 = "";

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
	static int anInt2443 = 0;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
	static int anInt2445 = 0;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	static int anInt2448 = 0;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Z")
	static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	static int anInt2447 = 636234327;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 62)
	Class168() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "()Z", line = 67)
	static boolean method17588() {
		return !Class228.method25615(client.state * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "()Z", line = 67)
	static boolean method17589() {
		return !Class228.method25615(client.state * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()Z", line = 67)
	static boolean method17590() {
		return !Class228.method25615(client.state * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "()V", line = 72)
	static void method17591() {
		if (!Class202.method24643((byte) 29)) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -16258);
		}
		aBoolean380 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "()V", line = 72)
	static void method17592() {
		if (!Class202.method24643((byte) 102)) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -16886);
		}
		aBoolean380 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "()V", line = 72)
	static void method17593() {
		if (!Class202.method24643((byte) 41)) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -10165);
		}
		aBoolean380 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()V", line = 72)
	static void method17594() {
		if (!Class202.method24643((byte) 9)) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -16429);
		}
		aBoolean380 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "()V", line = 80)
	static void method17595() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) -56), -2043571021);
	}

	@OriginalMember(owner = "client!ap", name = "ae", descriptor = "()V", line = 80)
	static void method17596() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) -15), -2011424000);
	}

	@OriginalMember(owner = "client!ap", name = "al", descriptor = "()V", line = 80)
	static void method17597() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) 24), -1993055831);
	}

	@OriginalMember(owner = "client!ap", name = "ah", descriptor = "()V", line = 80)
	static void method17598() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) -36), -2065695251);
	}

	@OriginalMember(owner = "client!ap", name = "ag", descriptor = "()V", line = 80)
	static void method17599() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) -35), -1952947074);
	}

	@OriginalMember(owner = "client!ap", name = "ac", descriptor = "()V", line = 88)
	static void method17600() {
		aBoolean380 = false;
		Class635.method32440((short) 255);
	}

	@OriginalMember(owner = "client!ap", name = "ai", descriptor = "()V", line = 93)
	static void method17601() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "aw", descriptor = "()V", line = 93)
	static void method17602() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "as", descriptor = "()Z", line = 103)
	static boolean method17603() {
		return aBoolean380;
	}

	@OriginalMember(owner = "client!ap", name = "ad", descriptor = "([Ljava/lang/String;)V", line = 107)
	static void method17604(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt2445 += arg0[0].length() * -1799421149;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class314.method26939("Pausing for " + local17 + " seconds...", -2000788129);
				Class350.aStringArray28 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26797(1071801155) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method626(false, 1594751757);
		}
	}

	@OriginalMember(owner = "client!ap", name = "am", descriptor = "([Ljava/lang/String;)V", line = 107)
	static void method17605(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt2445 += arg0[0].length() * -1799421149;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class314.method26939("Pausing for " + local17 + " seconds...", -1918526625);
				Class350.aStringArray28 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26797(949560045) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method626(false, -770548650);
		}
	}

	@OriginalMember(owner = "client!ap", name = "at", descriptor = "([Ljava/lang/String;)V", line = 107)
	static void method17606(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt2445 += arg0[0].length() * -1799421149;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class314.method26939("Pausing for " + local17 + " seconds...", -1911833053);
				Class350.aStringArray28 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26797(38891596) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method626(false, -1282978170);
		}
	}

	@OriginalMember(owner = "client!ap", name = "au", descriptor = "()V", line = 226)
	static void method17607() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray31.length; local7++) {
			if (Class518.aStringArray31[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray31[local7].substring(Class518.aStringArray31[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ar", descriptor = "()V", line = 226)
	static void method17608() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray31.length; local7++) {
			if (Class518.aStringArray31[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray31[local7].substring(Class518.aStringArray31[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ap", descriptor = "()V", line = 226)
	static void method17609() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray31.length; local7++) {
			if (Class518.aStringArray31[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray31[local7].substring(Class518.aStringArray31[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "aq", descriptor = "(Ljava/lang/String;)V", line = 239)
	public static void method17610(@OriginalArg(0) String arg0) {
		aString61 = arg0;
		anInt2445 = aString61.length() * -1799421149;
	}

	@OriginalMember(owner = "client!ap", name = "ax", descriptor = "(Z)V", line = 244)
	static void method17611(@OriginalArg(0) boolean arg0) {
		aString61 = aString61.trim();
		anInt2443 = 0;
		if (aString61.length() == 0) {
			anInt2445 = 0;
			return;
		}
		Class314.method26939("--> " + aString61, -1882707837);
		Class32_Sub7.method16823(aString61, false, arg0, (byte) 3);
		if (arg0) {
			anInt2445 = aString61.length() * -1799421149;
		} else {
			anInt2445 = 0;
			aString61 = "";
		}
	}

	@OriginalMember(owner = "client!ap", name = "av", descriptor = "(Ljava/lang/String;)V", line = 260)
	public static void method17612(@OriginalArg(0) String arg0) {
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -28225);
		}
		client.aCalendar3.setTime(new Date(Class305.method26797(1979474886)));
		@Pc(14) int local14 = client.aCalendar3.get(11);
		@Pc(18) int local18 = client.aCalendar3.get(12);
		@Pc(22) int local22 = client.aCalendar3.get(13);
		@Pc(56) String local56 = Integer.toString(local14 / 10) + local14 % 10 + ":" + local18 / 10 + local18 % 10 + ":" + local22 / 10 + local22 % 10;
		@Pc(61) String[] local61 = client.method24953(arg0, '\n', 1895640031);
		for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
			for (@Pc(71) int local71 = anInt2442 * -227471249; local71 > 0; local71--) {
				Class518.aStringArray31[local71] = Class518.aStringArray31[local71 - 1];
			}
			Class518.aStringArray31[0] = local56 + ": " + local61[local63];
			if (aFileOutputStream1 != null) {
				try {
					aFileOutputStream1.write(Class269.method26271(Class518.aStringArray31[0] + "\n", (byte) 46));
				} catch (@Pc(117) IOException local117) {
				}
			}
			if (anInt2442 * -227471249 < Class518.aStringArray31.length - 1) {
				anInt2442 += -58044785;
				if (anInt2446 * 1637474717 > 0) {
					anInt2446 += 2042014901;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ao", descriptor = "(Lclient!dh;)V", line = 286)
	static void method17613(@OriginalArg(0) Class104 arg0) {
		if (Class361.method27804(862937808) && Class570.method31314(-1070730120)) {
			Class388.method28250(0, 0, Class553.width * -1378711501, 350, 1603973322);
		}
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20721(0, 0, Class553.width * -1378711501, 350, anInt2448 * -649935255 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt2441 * -1858737323);
		@Pc(55) int local55;
		if (anInt2442 * -227471249 > 0) {
			local55 = 346 - anInt2441 * -1858737323 - 4;
			@Pc(67) int local67 = local55 * local43 / (anInt2442 * -227471249 + local43 - 1);
			@Pc(69) int local69 = 4;
			if (anInt2442 * -227471249 > 1) {
				local69 += (local55 - local67) * (anInt2442 * -227471249 - 1 - anInt2446 * 1637474717) / (anInt2442 * -227471249 - 1);
			}
			arg0.method20721(Class553.width * -1378711501 - 16, local69, 12, local67, anInt2448 * -649935255 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt2446 * 1637474717; local118 < anInt2446 * 1637474717 + local43 && local118 < anInt2442 * -227471249; local118++) {
				@Pc(137) String[] local137 = client.method24953(Class518.aStringArray31[local118], '\b', 1541956704);
				@Pc(148) int local148 = (Class553.width * -1378711501 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local150 * local148 + 8;
					arg0.method20569(local160, 0, local148 + local160 - 8, 350);
					Class82.aClass106_1.method7523(Class11.method179(local137[local150], (byte) 2), local160, 350 - anInt2444 * 1737134917 - 2 - Class348.aClass5_14.anInt10 * -1093354073 - (local118 - anInt2446 * 1637474717) * -1858737323 * anInt2441, -1, -16777216, (byte) 0);
				}
			}
		}
		Class707.aClass106_13.method7527("910 1", Class553.width * -1378711501 - 25, 330, -1, -16777216, 1336485814);
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20474(0, 350 - anInt2444 * 1737134917, Class553.width * -1378711501, -1, (byte) -13);
		Class118_Sub1.aClass106_3.method7523("--> " + Class11.method179(aString61, (byte) 20), 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 1, -1, -16777216, (byte) 0);
		if (Class20.aBoolean10) {
			local55 = -1;
			if (client.anInt3485 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20476(Class110_Sub3.aClass5_7.method53("--> " + Class11.method179(aString61, (byte) 29).substring(0, anInt2445 * 66864267), -436163693) + 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 11, 12, local55, 1747155278);
		}
		arg0.method20568();
		Class143_Sub1.method11085((byte) -1);
	}

	@OriginalMember(owner = "client!ap", name = "aj", descriptor = "(Lclient!dh;)V", line = 286)
	static void method17614(@OriginalArg(0) Class104 arg0) {
		if (Class361.method27804(862937808) && Class570.method31314(2025507783)) {
			Class388.method28250(0, 0, Class553.width * -1378711501, 350, 189862543);
		}
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20721(0, 0, Class553.width * -1378711501, 350, anInt2448 * -649935255 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt2441 * -1858737323);
		@Pc(55) int local55;
		if (anInt2442 * -227471249 > 0) {
			local55 = 346 - anInt2441 * -1858737323 - 4;
			@Pc(67) int local67 = local55 * local43 / (anInt2442 * -227471249 + local43 - 1);
			@Pc(69) int local69 = 4;
			if (anInt2442 * -227471249 > 1) {
				local69 += (local55 - local67) * (anInt2442 * -227471249 - 1 - anInt2446 * 1637474717) / (anInt2442 * -227471249 - 1);
			}
			arg0.method20721(Class553.width * -1378711501 - 16, local69, 12, local67, anInt2448 * -649935255 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt2446 * 1637474717; local118 < anInt2446 * 1637474717 + local43 && local118 < anInt2442 * -227471249; local118++) {
				@Pc(137) String[] local137 = client.method24953(Class518.aStringArray31[local118], '\b', 1724390274);
				@Pc(148) int local148 = (Class553.width * -1378711501 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local150 * local148 + 8;
					arg0.method20569(local160, 0, local148 + local160 - 8, 350);
					Class82.aClass106_1.method7523(Class11.method179(local137[local150], (byte) 46), local160, 350 - anInt2444 * 1737134917 - 2 - Class348.aClass5_14.anInt10 * -1093354073 - (local118 - anInt2446 * 1637474717) * -1858737323 * anInt2441, -1, -16777216, (byte) 0);
				}
			}
		}
		Class707.aClass106_13.method7527("910 1", Class553.width * -1378711501 - 25, 330, -1, -16777216, 1336485814);
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20474(0, 350 - anInt2444 * 1737134917, Class553.width * -1378711501, -1, (byte) 39);
		Class118_Sub1.aClass106_3.method7523("--> " + Class11.method179(aString61, (byte) 117), 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 1, -1, -16777216, (byte) 0);
		if (Class20.aBoolean10) {
			local55 = -1;
			if (client.anInt3485 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20476(Class110_Sub3.aClass5_7.method53("--> " + Class11.method179(aString61, (byte) 118).substring(0, anInt2445 * 66864267), 967740681) + 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 11, 12, local55, 1765702889);
		}
		arg0.method20568();
		Class143_Sub1.method11085((byte) -1);
	}

	@OriginalMember(owner = "client!ap", name = "ay", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 322)
	static String method17615(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		@Pc(22) int local22 = -1;
		if (arg0.startsWith("directlogin ")) {
			local22 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (local22 >= 0) {
			@Pc(37) int local37 = arg0.length();
			arg0 = arg0.substring(0, local22) + " ";
			for (@Pc(53) int local53 = local22 + 1; local53 < local37; local53++) {
				arg0 = arg0 + "*";
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ap", name = "ab", descriptor = "()V", line = 339)
	static void method17616() {
	}

	@OriginalMember(owner = "client!ap", name = "az", descriptor = "()V", line = 339)
	static void method17617() {
	}

	@OriginalMember(owner = "client!ap", name = "aa", descriptor = "(Ljava/lang/String;ZZ)V", line = 343)
	public static void method17618(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class314.method26939("commands - This command", -2007796725);
				Class314.method26939("cls - Clear console", -2070504371);
				Class314.method26939("displayfps - Toggle FPS and other information", -1942640008);
				Class314.method26939("renderer - Print graphics renderer information", -1852218612);
				Class314.method26939("heap - Print java memory information", -1944549827);
				Class314.method26939("getcamerapos - Print location and direction of camera for use in bug reports", -1921302057);
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt2442 = 0;
				anInt2446 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean599 = !client.aBoolean599;
				if (client.aBoolean599) {
					Class314.method26939("FPS on", -2105743823);
				} else {
					Class314.method26939("FPS off", -2071722099);
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class219 local62 = Class694.aClass104_14.method20644();
				Class314.method26939("Toolkit ID: " + Class51.options.aClass166_Sub4_2.method15426((byte) 79), -1878097755);
				Class314.method26939("Vendor: " + local62.anInt3623 * -348611355, -1871902044);
				Class314.method26939("Name: " + local62.aString151, -1855911268);
				Class314.method26939("Version: " + local62.anInt3625 * -140508595, -1873210398);
				Class314.method26939("Device: " + local62.aString150, -2041884395);
				Class314.method26939("Driver Version: " + local62.aLong247 * -2731861378298283411L, -2073905141);
				local139 = Class694.aClass104_14.method20542();
				if (local139.length() > 0) {
					Class314.method26939(local139, -1855974528);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class314.method26939("Heap: " + Class553.anInt3419 * 1798078423 + "MB", -2054024609);
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class611 local173 = client.world.method30455(1932268058);
				if (Class429.anInt4781 * -1453926679 == 3) {
					@Pc(182) Class472 local182 = Class65.aClass123_Sub1_2.method9025(-883396316);
					@Pc(186) Class472 local186 = Class65.aClass123_Sub1_2.method9035(1208611233);
					Class314.method26939("Pos: " + (new Class611(Class520.selfPlayer.aByte100, (int) local182.aFloat317 >> 9, (int) local182.aFloat319 >> 9)).toString() + " Height: " + (Class305.method26802((int) local182.aFloat317 - (local173.anInt5623 * 270611681 << 9), (int) local182.aFloat319 - (local173.anInt5624 * -1994307635 << 9), Class520.selfPlayer.aByte100, (byte) -20) + (int) local182.aFloat318), -1945850436);
					Class314.method26939("Look: " + (new Class611(Class520.selfPlayer.aByte100, (int) local186.aFloat317 >> 9, (int) local186.aFloat319 >> 9)).toString() + " Height: " + (Class305.method26802((int) local186.aFloat317 - (local173.anInt5623 * 270611681 << 9), (int) local182.aFloat319 - (local173.anInt5624 * -1994307635 << 9), Class520.selfPlayer.aByte100, (byte) -74) + (int) local182.aFloat318), -2130715799);
				} else {
					Class314.method26939("Pos: " + Class520.selfPlayer.aByte100 + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5623 * 270611681 >> 6) + "," + (local173.anInt5624 * -1994307635 + (Class270.anInt3884 * 466086187 >> 9) >> 6) + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5623 * 270611681 & 0x3F) + "," + (local173.anInt5624 * -1994307635 + (Class270.anInt3884 * 466086187 >> 9) & 0x3F) + " Height: " + (Class305.method26802(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, Class520.selfPlayer.aByte100, (byte) -13) - Class130_Sub2.anInt1117 * 1055108289), -2009458081);
					Class314.method26939("Look: " + Class520.selfPlayer.aByte100 + "," + (Class545.anInt5289 * 904567799 + local173.anInt5623 * 270611681 >> 6) + "," + (Class349.anInt4201 * -1998384879 + local173.anInt5624 * -1994307635 >> 6) + "," + (Class545.anInt5289 * 904567799 + local173.anInt5623 * 270611681 & 0x3F) + "," + (local173.anInt5624 * -1994307635 + Class349.anInt4201 * -1998384879 & 0x3F) + " Height: " + (Class305.method26802(Class545.anInt5289 * 904567799, Class349.anInt4201 * -1998384879, Class520.selfPlayer.aByte100, (byte) -41) - Class290.anInt3911 * -1980774829), -1947476458);
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class314.method26939(Class74.aClass74_116.method1259(Class106.lang, (byte) 68), -2099968032);
			return;
		}
		if (Class280.modeWhere != ModeWhere.aModeWhere_8 || client.userStaffModLevel * 2055688893 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class717.method36895(1, -1, -1, false, (byte) 60);
					if (Class255.getWindowMode(1549820509) == 1) {
						Class314.method26939("Success", -1854163411);
					} else {
						Class314.method26939("Failure", -2114064697);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class717.method36895(2, -1, -1, false, (byte) 99);
					if (Class255.getWindowMode(1298959469) == 2) {
						Class314.method26939("Success", -2084241133);
					} else {
						Class314.method26939("Failure", -1928548795);
					}
					return;
				}
				if (Class4.aBoolean2 && arg0.equalsIgnoreCase("wm3")) {
					Class717.method36895(3, 1024, 768, false, (byte) 106);
					if (Class255.getWindowMode(1836986558) == 3) {
						Class314.method26939("Success", -1879042663);
					} else {
						Class314.method26939("Failure", -1844146447);
					}
					return;
				}
				@Pc(570) ClientMessage local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.state * -849002901 != 4) {
						Class314.method26939("Failure", -1973370632);
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class314.method26939("Failure", -2045044434);
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class314.method26939("Failure", -1966971244);
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class237.method25770(local139, local568, -895218641);
					Class314.method26939("Success", -2086012990);
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class543.method30945(0, false, 1945646779);
					if (Class51.options.aClass166_Sub4_2.method15426((byte) 119) == 0) {
						Class314.method26939("Success", -1971971939);
						Class51.options.method14363(Class51.options.aClass166_Sub4_1, 0, (byte) 13);
						Class106_Sub1.method5135(-1035887963);
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure", -1886264969);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class543.method30945(1, false, 1945646779);
					if (Class51.options.aClass166_Sub4_2.method15426((byte) 123) == 1) {
						Class314.method26939("Success", -1896763704);
						Class51.options.method14363(Class51.options.aClass166_Sub4_1, 1, (byte) 5);
						Class106_Sub1.method5135(468377069);
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure", -1919840835);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class543.method30945(3, false, 1945646779);
					if (Class51.options.aClass166_Sub4_2.method15426((byte) 55) == 3) {
						Class314.method26939("Success", -2054162802);
						Class51.options.method14363(Class51.options.aClass166_Sub4_1, 3, (byte) 112);
						Class106_Sub1.method5135(-1740756969);
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure", -1959635542);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class543.method30945(5, false, 1945646779);
					if (Class51.options.aClass166_Sub4_2.method15426((byte) 60) == 5) {
						Class314.method26939("Success", -2081980304);
						Class51.options.method14363(Class51.options.aClass166_Sub4_1, 5, (byte) 17);
						Class106_Sub1.method5135(-969099928);
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure", -2002765067);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.state * -849002901 == 18) {
						Class565.method31252(-2066387364);
					} else if (client.state * -849002901 == 3) {
						client.aClass175_2.aBoolean564 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class175[] local776 = client.aClass175Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class175 local786 = local776[local778];
						if (local786.getStream((byte) -8) != null) {
							local786.getStream((byte) -15).method14723(-1453926679);
						}
					}
					Class520.aClass144_3.method11176(-906685357);
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class314.method26939("varpbit=" + Class624.playerVariableManager.method33454(Class624.playerVariableManager.method27953(local568, (byte) -21), -497230021), -1939005617);
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class314.method26939("varp=" + Class624.playerVariableManager.method33455(Class624.playerVariableManager.method27954(Class138.aClass138_65, local568, -1497248091), 2115292292), -1920639858);
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = client.method24953(arg0.substring(12), ' ', 1672500971);
					if (local865.length == 2 || local865.length == 3) {
						if (Class251.method25969(317292832)) {
							Class3.method22((byte) -47);
						}
						Class114.method7635(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true, (byte) 40);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = client.method24953(arg0.substring(8), ' ', 1728081301);
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class225.method25603(local778, local923, true, 1886971804);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class305.method26797(-73459214) + ".log");
						if (local940.exists()) {
							Class314.method26939("file already exists!", -1869987424);
							return;
						}
					}
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
						aFileOutputStream1 = null;
					}
					try {
						aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(983) FileNotFoundException local983) {
						Class314.method26939("Could not create " + local940.getName(), -2045516815);
						return;
					} catch (@Pc(996) SecurityException local996) {
						Class314.method26939("Cannot write to " + local940.getName(), -1863187716);
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
					}
					aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class314.method26939("No such file", -1855428610);
						return;
					}
					@Pc(1043) byte[] local1043 = Class300.method26716(local940, 1388704912);
					if (local1043 == null) {
						Class314.method26939("Failed to read file", -1937371118);
						return;
					}
					@Pc(1061) String[] local1061 = client.method24953(Class93_Sub13.method13475(Class114.method7636(local1043, 34838), '\r', "", 39418505), '\n', 1856772179);
					Class96_Sub3.method2329(local1061, 162649237);
				}
				if (client.state * -849002901 == 18 || client.state * -849002901 == 13) {
					@Pc(1077) Class175 local1077 = Class330.method27371(-1708242123);
					local570 = Class102.createGameMessage(ClientProt.aClientProt_86, local1077.clientIsaac, (byte) 23);
					local570.packet.p1(arg0.length() + 3, (byte) -71);
					local570.packet.p1(arg1 ? 1 : 0, (byte) -112);
					local570.packet.p1(arg2 ? 1 : 0, (byte) -3);
					local570.packet.pjstr(arg0, -1224579575);
					local1077.send(local570, -1440770000);
				}
			} catch (@Pc(1120) Exception local1120) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.lang, (byte) 32), -2133842538);
				return;
			}
		}
		if (client.state * -849002901 != 18 && client.state * -849002901 != 13) {
			Class314.method26939(Class74.aClass74_4.method1259(Class106.lang, (byte) -48) + arg0, -1909650916);
		}
	}

	@OriginalMember(owner = "client!ap", name = "ak", descriptor = "(I)V", line = 594)
	static void method17619(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15436((byte) 66);
				} else if (arg0 == 11) {
					Class314.method26939("" + Class553.anInt3407 * 1249273355, -2103541327);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.world.method30481(-1509926132).aClass598_2;
					local43.aBoolean824 = !local43.aBoolean824;
				} else if (arg0 == 25) {
					client.aBoolean599 = true;
				} else if (arg0 == 21) {
					client.aBoolean599 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method377(-2146280464);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33421((byte) -47);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -2065787653);
					} else if (arg0 == 20) {
						Class684.method33421((byte) -56);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -2016426337);
						Class510.method30245((byte) 10);
						Class684.method33421((byte) -104);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -1867748555);
					} else if (arg0 == 9) {
						Class314.method26939(Class125_Sub1.aClass586_1.method31624(-1104292846) ? "Success" : "Failure", -2102652457);
					} else if (arg0 == 23) {
						Class50.world.cycleSettings((short) -32189);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11167(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11162(1089914583);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method32822((byte) 86);
					} else if (arg0 == 17) {
						client.world.aLong286 = Class305.method26797(856391950) * -3941212876594184505L;
						client.world.aBoolean790 = true;
						Class660.method32822((byte) 92);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939(((int) local254.aFloat317 >> 9) + " " + ((int) local254.aFloat319 >> 9), -2110907686);
						} else if (arg0 == 16) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939("" + client.world.method30481(-1817857726).aClass99Array1[Class520.selfPlayer.aByte100].method2480((int) local254.aFloat317 >> 9, (int) local254.aFloat319 >> 9, -1308895338), -1956290314);
						} else if (arg0 == 27) {
							Class314.method26939(Class312.aClass240_74.method25854((byte) 103) + " " + Class312.aClass240_74.method25852(1973941732), -2066317177);
							Class314.method26939(Class312.aClass240_77.method25854((byte) 109) + " " + Class312.aClass240_77.method25852(1723982115), -1870629721);
						} else if (arg0 == 8) {
							Class700.method36716(false, (byte) -76);
						} else if (arg0 == 13) {
							client.aBoolean610 = !client.aBoolean610;
							Class694.aClass104_14.method20628(client.aBoolean610);
							Class125_Sub3.method10060(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.world.method30533((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.world.method30533((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.world.method30533((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.lang, (byte) -40), -1861437651);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "af", descriptor = "(I)V", line = 594)
	static void method17620(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15436((byte) -105);
				} else if (arg0 == 11) {
					Class314.method26939("" + Class553.anInt3407 * 1249273355, -2012949698);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.world.method30481(-971796568).aClass598_2;
					local43.aBoolean824 = !local43.aBoolean824;
				} else if (arg0 == 25) {
					client.aBoolean599 = true;
				} else if (arg0 == 21) {
					client.aBoolean599 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method377(-1970110337);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33421((byte) -58);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -1908601808);
					} else if (arg0 == 20) {
						Class684.method33421((byte) -118);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -2028558599);
						Class510.method30245((byte) -72);
						Class684.method33421((byte) -115);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -2074955941);
					} else if (arg0 == 9) {
						Class314.method26939(Class125_Sub1.aClass586_1.method31624(-1830009427) ? "Success" : "Failure", -1981407361);
					} else if (arg0 == 23) {
						Class50.world.cycleSettings((short) -3687);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11167(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11162(1275869380);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method32822((byte) 52);
					} else if (arg0 == 17) {
						client.world.aLong286 = Class305.method26797(648613496) * -3941212876594184505L;
						client.world.aBoolean790 = true;
						Class660.method32822((byte) 29);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939(((int) local254.aFloat317 >> 9) + " " + ((int) local254.aFloat319 >> 9), -1923071533);
						} else if (arg0 == 16) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939("" + client.world.method30481(-1271700151).aClass99Array1[Class520.selfPlayer.aByte100].method2480((int) local254.aFloat317 >> 9, (int) local254.aFloat319 >> 9, -1363305333), -2075009443);
						} else if (arg0 == 27) {
							Class314.method26939(Class312.aClass240_74.method25854((byte) 113) + " " + Class312.aClass240_74.method25852(1190029588), -1940634502);
							Class314.method26939(Class312.aClass240_77.method25854((byte) 105) + " " + Class312.aClass240_77.method25852(1560779061), -2081804748);
						} else if (arg0 == 8) {
							Class700.method36716(false, (byte) -2);
						} else if (arg0 == 13) {
							client.aBoolean610 = !client.aBoolean610;
							Class694.aClass104_14.method20628(client.aBoolean610);
							Class125_Sub3.method10060(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.world.method30533((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.world.method30533((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.world.method30533((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.lang, (byte) 16), -2107088423);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "an", descriptor = "(I)V", line = 594)
	static void method17621(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15436((byte) -10);
				} else if (arg0 == 11) {
					Class314.method26939("" + Class553.anInt3407 * 1249273355, -2035430587);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.world.method30481(-992579788).aClass598_2;
					local43.aBoolean824 = !local43.aBoolean824;
				} else if (arg0 == 25) {
					client.aBoolean599 = true;
				} else if (arg0 == 21) {
					client.aBoolean599 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method377(-2041990103);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33421((byte) -57);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -1909496695);
					} else if (arg0 == 20) {
						Class684.method33421((byte) -56);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -1846868207);
						Class510.method30245((byte) 59);
						Class684.method33421((byte) -46);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95, -1961537023);
					} else if (arg0 == 9) {
						Class314.method26939(Class125_Sub1.aClass586_1.method31624(-1989181737) ? "Success" : "Failure", -2114598227);
					} else if (arg0 == 23) {
						Class50.world.cycleSettings((short) -29922);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11167(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11162(2093372411);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method32822((byte) 110);
					} else if (arg0 == 17) {
						client.world.aLong286 = Class305.method26797(845866126) * -3941212876594184505L;
						client.world.aBoolean790 = true;
						Class660.method32822((byte) 85);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939(((int) local254.aFloat317 >> 9) + " " + ((int) local254.aFloat319 >> 9), -1909294065);
						} else if (arg0 == 16) {
							local254 = Class520.selfPlayer.method24220().aClass472_61;
							Class314.method26939("" + client.world.method30481(-1354454789).aClass99Array1[Class520.selfPlayer.aByte100].method2480((int) local254.aFloat317 >> 9, (int) local254.aFloat319 >> 9, -1578363224), -2037118374);
						} else if (arg0 == 27) {
							Class314.method26939(Class312.aClass240_74.method25854((byte) 125) + " " + Class312.aClass240_74.method25852(2038685046), -2073576978);
							Class314.method26939(Class312.aClass240_77.method25854((byte) 111) + " " + Class312.aClass240_77.method25852(1763856628), -1905637292);
						} else if (arg0 == 8) {
							Class700.method36716(false, (byte) -10);
						} else if (arg0 == 13) {
							client.aBoolean610 = !client.aBoolean610;
							Class694.aClass104_14.method20628(client.aBoolean610);
							Class125_Sub3.method10060(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.world.method30533((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.world.method30533((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.world.method30533((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.lang, (byte) -52), -1866073190);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "bk", descriptor = "()V", line = 682)
	static void method17622() {
		if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
			Class392.aClass541_1.method30906(new Class537(Class526.aClass526_7, null), (byte) -4);
		} else {
			client.world.method30533((byte) 0);
			Class360.method27799((short) -1324);
		}
	}

	@OriginalMember(owner = "client!ap", name = "bf", descriptor = "()V", line = 682)
	static void method17623() {
		if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
			Class392.aClass541_1.method30906(new Class537(Class526.aClass526_7, null), (byte) 8);
		} else {
			client.world.method30533((byte) 0);
			Class360.method27799((short) -7591);
		}
	}

	@OriginalMember(owner = "client!ap", name = "bl", descriptor = "()V", line = 682)
	static void method17624() {
		if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
			Class392.aClass541_1.method30906(new Class537(Class526.aClass526_7, null), (byte) 41);
		} else {
			client.world.method30533((byte) 0);
			Class360.method27799((short) 6645);
		}
	}

	@OriginalMember(owner = "client!ap", name = "as", descriptor = "(I)I", line = 949)
	static int method17625(@OriginalArg(0) int arg0) {
		if (client.aClass312_5 == null) {
			if (Class454.aBoolean773) {
				@Pc(25) Class5 local25 = Class142_Sub1.method10971((byte) 91);
				@Pc(29) int local29 = Class82.aClass153_1.method14070(1038817060);
				@Pc(33) int local33 = Class82.aClass153_1.method14075(1581965782);
				@Pc(51) int local51;
				@Pc(53) int local53;
				@Pc(85) int local85;
				@Pc(161) Class93_Sub1_Sub7 local161;
				if (Class454.aBoolean772) {
					@Pc(288) Class11 local288;
					if (local29 > Class166_Sub17.anInt2179 * 1703853389 && local29 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3629 * 1555894759) {
						local51 = -1;
						for (local53 = 0; local53 < Class454.anInt5039 * -2074084977; local53++) {
							if (Class454.aBoolean774) {
								local85 = local53 * Class454.anInt5036 * -875883057 + 1 + Class369.anInt4589 * -310709577 + 20 + local25.anInt6 * -8978697;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							} else {
								local85 = Class369.anInt4589 * -310709577 + 31 + local53 * -875883057 * Class454.anInt5036;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class11(Class454.aClass18_16);
							for (@Pc(293) Class93_Sub1_Sub8 local293 = (Class93_Sub1_Sub8) local288.method170(-792268585); local293 != null; local293 = (Class93_Sub1_Sub8) local288.next()) {
								if (local53++ == local51) {
									return ((Class93_Sub1_Sub7) local293.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3008 * -79336851;
								}
							}
						}
					} else if (Class454.aClass93_Sub1_Sub8_1 != null && local29 > Class301.anInt3931 * 1939408525 && local29 < Class454.anInt5046 * -816478179 + Class301.anInt3931 * 1939408525) {
						local51 = -1;
						for (local53 = 0; local53 < Class454.aClass93_Sub1_Sub8_1.anInt3013 * -2109043087; local53++) {
							if (Class454.aBoolean774) {
								local85 = local25.anInt6 * -8978697 + 20 + Class318.anInt4095 * -988861719 + 1 + Class454.anInt5036 * -875883057 * local53;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							} else {
								local85 = local53 * -875883057 * Class454.anInt5036 + 31 + Class318.anInt4095 * -988861719;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local85 + local25.anInt10 * -1093354073) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class11(Class454.aClass93_Sub1_Sub8_1.aClass18_10);
							for (local161 = (Class93_Sub1_Sub7) local288.method170(-939873749); local161 != null; local161 = (Class93_Sub1_Sub7) local288.next()) {
								if (local53++ == local51) {
									return local161.anInt3008 * -79336851;
								}
							}
						}
					}
				} else if (local29 > Class166_Sub17.anInt2179 * 1703853389 && local29 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3629 * 1555894759) {
					local51 = -1;
					for (local53 = 0; local53 < Class454.anInt5042 * -1838307953; local53++) {
						if (Class454.aBoolean774) {
							local85 = Class369.anInt4589 * -310709577 + 20 + local25.anInt6 * -8978697 + 1 + Class454.anInt5036 * -875883057 * (Class454.anInt5042 * -1838307953 - 1 - local53);
							if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
								local51 = local53;
							}
						} else {
							local85 = Class454.anInt5036 * -875883057 * (Class454.anInt5042 * -1838307953 - 1 - local53) + 31 + Class369.anInt4589 * -310709577;
							if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local85 + local25.anInt10 * -1093354073) {
								local51 = local53;
							}
						}
					}
					if (local51 != -1) {
						local53 = 0;
						@Pc(156) Class20 local156 = new Class20(Class454.aClass22_55);
						for (local161 = (Class93_Sub1_Sub7) local156.method366(699749822); local161 != null; local161 = (Class93_Sub1_Sub7) local156.next()) {
							if (local53++ == local51) {
								return local161.anInt3008 * -79336851;
							}
						}
					}
				}
			} else if (Class288.aClass636_1.aBoolean854) {
				if (Class272.aClass93_Sub1_Sub7_5 != null) {
					return Class272.aClass93_Sub1_Sub7_5.anInt3008 * -79336851;
				}
			} else if (Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 != null) {
				return Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4.anInt3008 * -79336851;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(B)Lclient!alw;", line = 954)
	static Packet createLoginPacket(@OriginalArg(0) byte arg0) {
		@Pc(2) Packet local2 = Class346.startRsaPacket((byte) 4);
		if (client.state * -849002901 != 14) {
			@Pc(17) long local17;
			if (Class411.anInt4746 * 276097583 != -1) {
				local17 = Class411.anInt4746 * 276097583;
			} else if (Class411.ssoKeyIdentifier * 4457507688757033075L == -1L) {
				local17 = Class96_Sub3.method2330(Class411.username, -1238264676);
			} else {
				local17 = Class411.ssoKeyIdentifier * 4457507688757033075L;
			}
			Class413.totpTokenKey = local17 * 8666456646503961589L;
			Class709.writeTotp(local2, local17);
			local2.pbool(false, -475970197);
			local2.pjstr(Class411.aString201, 2072335141);
			local2.p8(Class411.ssoKey * -1009657282713816485L);
			local2.p8(client.ssoRandom * 6484786827691107089L);
		}
		local2.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -19);
		return local2;
	}

	@OriginalMember(owner = "client!ap", name = "ms", descriptor = "(Lclient!yf;I)V", line = 7223)
	static final void method17627(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class160.method14716(local11, local14, arg0, -1255783522);
	}

	@OriginalMember(owner = "client!ap", name = "qn", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 8039)
	static final void method17628(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray37 = Class499.method30149(local13, arg2, 1000246318);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ap", name = "aae", descriptor = "(Lclient!yf;I)V", line = 9735)
	static final void method17629(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class548.method31016((byte) -70);
	}

	@OriginalMember(owner = "client!ap", name = "agj", descriptor = "(Lclient!yf;B)V", line = 10664)
	static final void method17630(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5888 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class164.method15269(local14, local25, -1545240102);
	}
}
