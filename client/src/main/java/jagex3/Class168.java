package jagex3;

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
public final class Class168 {

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
	static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	static int anInt2447 = 636234327;

	@OriginalMember(owner = "client!ap", name = "ai", descriptor = "()V")
	static void method17600() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "()Z")
	static boolean method17601() {
		return !Class228.method25709(client.anInt3435 * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "()V")
	static void method17602() {
		if (!Class202.method24655((byte) 29)) {
			return;
		}
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -16258);
		}
		aBoolean381 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "()Z")
	static boolean method17603() {
		return !Class228.method25709(client.anInt3435 * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "ao", descriptor = "(Lclient!dh;)V")
	static void method17604(@OriginalArg(0) Class104 arg0) {
		if (Class361.method27984(862937808) && Class570.method31503(-1070730120)) {
			Class388.method28429(0, 0, Class553.anInt3408 * -1378711501, 350, 1603973322);
		}
		arg0.method20479(0, 0, Class553.anInt3408 * -1378711501, 350);
		arg0.method20665(0, 0, Class553.anInt3408 * -1378711501, 350, anInt2448 * -649935255 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt2441 * -1858737323);
		@Pc(55) int local55;
		if (anInt2442 * -227471249 > 0) {
			local55 = 346 - anInt2441 * -1858737323 - 4;
			@Pc(67) int local67 = local55 * local43 / (anInt2442 * -227471249 + local43 - 1);
			@Pc(69) int local69 = 4;
			if (anInt2442 * -227471249 > 1) {
				local69 += (local55 - local67) * (anInt2442 * -227471249 - 1 - anInt2446 * 1637474717) / (anInt2442 * -227471249 - 1);
			}
			arg0.method20665(Class553.anInt3408 * -1378711501 - 16, local69, 12, local67, anInt2448 * -649935255 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt2446 * 1637474717; local118 < anInt2446 * 1637474717 + local43 && local118 < anInt2442 * -227471249; local118++) {
				@Pc(137) String[] local137 = client.method25414(Class518.aStringArray35[local118], '\b', 1541956704);
				@Pc(148) int local148 = (Class553.anInt3408 * -1378711501 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local150 * local148 + 8;
					arg0.method20479(local160, 0, local148 + local160 - 8, 350);
					Class82.aClass106_1.method7524(Class11.method180(local137[local150], (byte) 2), local160, 350 - anInt2444 * 1737134917 - 2 - Class348.aClass5_14.anInt10 * -1093354073 - (local118 - anInt2446 * 1637474717) * -1858737323 * anInt2441, -1, -16777216, (byte) 0);
				}
			}
		}
		Class707.aClass106_13.method7525("910 1", Class553.anInt3408 * -1378711501 - 25, 330, -1, -16777216, 1336485814);
		arg0.method20479(0, 0, Class553.anInt3408 * -1378711501, 350);
		arg0.method20487(0, 350 - anInt2444 * 1737134917, Class553.anInt3408 * -1378711501, -1, (byte) -13);
		Class118_Sub1.aClass106_3.method7524("--> " + Class11.method180(aString61, (byte) 20), 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 1, -1, -16777216, (byte) 0);
		if (Class20.aBoolean10) {
			local55 = -1;
			if (client.anInt3485 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20488(Class110_Sub3.aClass5_7.method36("--> " + Class11.method180(aString61, (byte) 29).substring(0, anInt2445 * 66864267), -436163693) + 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 11, 12, local55, 1747155278);
		}
		arg0.method20478();
		Class143_Sub1.method11106((byte) -1);
	}

	@OriginalMember(owner = "client!ap", name = "bk", descriptor = "()V")
	static void method17605() {
		if (Class51.aClass93_Sub36_1.aClass166_Sub47_1.method16568((short) 512) == 1) {
			Class392.aClass541_1.method31089(new Class537(Class526.aClass526_7, null), (byte) -4);
		} else {
			client.aClass532_1.method30650((byte) 0);
			Class360.method27982((short) -1324);
		}
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "()V")
	static void method17606() {
		if (!Class202.method24655((byte) 102)) {
			return;
		}
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -16886);
		}
		aBoolean381 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "()V")
	static void method17607() {
		if (!Class202.method24655((byte) 41)) {
			return;
		}
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -10165);
		}
		aBoolean381 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "()V")
	static void method17608() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray35 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray35.length; local28++) {
			Class518.aStringArray35[local28] = "";
		}
		Class314.method27032(Class74.aClass74_107.method1259(Class106.aClass717_8, (byte) -56), -2043571021);
	}

	@OriginalMember(owner = "client!ap", name = "ae", descriptor = "()V")
	static void method17609() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray35 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray35.length; local28++) {
			Class518.aStringArray35[local28] = "";
		}
		Class314.method27032(Class74.aClass74_107.method1259(Class106.aClass717_8, (byte) -15), -2011424000);
	}

	@OriginalMember(owner = "client!ap", name = "av", descriptor = "(Ljava/lang/String;)V")
	public static void method17610(@OriginalArg(0) String arg0) {
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -28225);
		}
		client.aCalendar3.setTime(new Date(Class305.method26889(1979474886)));
		@Pc(14) int local14 = client.aCalendar3.get(11);
		@Pc(18) int local18 = client.aCalendar3.get(12);
		@Pc(22) int local22 = client.aCalendar3.get(13);
		@Pc(56) String local56 = Integer.toString(local14 / 10) + local14 % 10 + ":" + local18 / 10 + local18 % 10 + ":" + local22 / 10 + local22 % 10;
		@Pc(61) String[] local61 = client.method25414(arg0, '\n', 1895640031);
		for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
			for (@Pc(71) int local71 = anInt2442 * -227471249; local71 > 0; local71--) {
				Class518.aStringArray35[local71] = Class518.aStringArray35[local71 - 1];
			}
			Class518.aStringArray35[0] = local56 + ": " + local61[local63];
			if (aFileOutputStream1 != null) {
				try {
					aFileOutputStream1.write(Class269.method26364(Class518.aStringArray35[0] + "\n", (byte) 46));
				} catch (@Pc(117) IOException local117) {
				}
			}
			if (anInt2442 * -227471249 < Class518.aStringArray35.length - 1) {
				anInt2442 += -58044785;
				if (anInt2446 * 1637474717 > 0) {
					anInt2446 += 2042014901;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ad", descriptor = "([Ljava/lang/String;)V")
	static void method17611(@OriginalArg(0) String[] arg0) {
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
				Class314.method27032("Pausing for " + local17 + " seconds...", -2000788129);
				Class350.aStringArray32 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26889(1071801155) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method627(false, 1594751757);
		}
	}

	@OriginalMember(owner = "client!ap", name = "al", descriptor = "()V")
	static void method17612() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray35 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray35.length; local28++) {
			Class518.aStringArray35[local28] = "";
		}
		Class314.method27032(Class74.aClass74_107.method1259(Class106.aClass717_8, (byte) 24), -1993055831);
	}

	@OriginalMember(owner = "client!ap", name = "ac", descriptor = "()V")
	static void method17613() {
		aBoolean381 = false;
		Class635.method32622((short) 255);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()V")
	static void method17614() {
		if (!Class202.method24655((byte) 9)) {
			return;
		}
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -16429);
		}
		aBoolean381 = true;
		anInt2448 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "aw", descriptor = "()V")
	static void method17615() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "aj", descriptor = "(Lclient!dh;)V")
	static void method17616(@OriginalArg(0) Class104 arg0) {
		if (Class361.method27984(862937808) && Class570.method31503(2025507783)) {
			Class388.method28429(0, 0, Class553.anInt3408 * -1378711501, 350, 189862543);
		}
		arg0.method20479(0, 0, Class553.anInt3408 * -1378711501, 350);
		arg0.method20665(0, 0, Class553.anInt3408 * -1378711501, 350, anInt2448 * -649935255 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt2441 * -1858737323);
		@Pc(55) int local55;
		if (anInt2442 * -227471249 > 0) {
			local55 = 346 - anInt2441 * -1858737323 - 4;
			@Pc(67) int local67 = local55 * local43 / (anInt2442 * -227471249 + local43 - 1);
			@Pc(69) int local69 = 4;
			if (anInt2442 * -227471249 > 1) {
				local69 += (local55 - local67) * (anInt2442 * -227471249 - 1 - anInt2446 * 1637474717) / (anInt2442 * -227471249 - 1);
			}
			arg0.method20665(Class553.anInt3408 * -1378711501 - 16, local69, 12, local67, anInt2448 * -649935255 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt2446 * 1637474717; local118 < anInt2446 * 1637474717 + local43 && local118 < anInt2442 * -227471249; local118++) {
				@Pc(137) String[] local137 = client.method25414(Class518.aStringArray35[local118], '\b', 1724390274);
				@Pc(148) int local148 = (Class553.anInt3408 * -1378711501 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local150 * local148 + 8;
					arg0.method20479(local160, 0, local148 + local160 - 8, 350);
					Class82.aClass106_1.method7524(Class11.method180(local137[local150], (byte) 46), local160, 350 - anInt2444 * 1737134917 - 2 - Class348.aClass5_14.anInt10 * -1093354073 - (local118 - anInt2446 * 1637474717) * -1858737323 * anInt2441, -1, -16777216, (byte) 0);
				}
			}
		}
		Class707.aClass106_13.method7525("910 1", Class553.anInt3408 * -1378711501 - 25, 330, -1, -16777216, 1336485814);
		arg0.method20479(0, 0, Class553.anInt3408 * -1378711501, 350);
		arg0.method20487(0, 350 - anInt2444 * 1737134917, Class553.anInt3408 * -1378711501, -1, (byte) 39);
		Class118_Sub1.aClass106_3.method7524("--> " + Class11.method180(aString61, (byte) 117), 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 1, -1, -16777216, (byte) 0);
		if (Class20.aBoolean10) {
			local55 = -1;
			if (client.anInt3485 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20488(Class110_Sub3.aClass5_7.method36("--> " + Class11.method180(aString61, (byte) 118).substring(0, anInt2445 * 66864267), 967740681) + 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 11, 12, local55, 1765702889);
		}
		arg0.method20478();
		Class143_Sub1.method11106((byte) -1);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()Z")
	static boolean method17617() {
		return !Class228.method25709(client.anInt3435 * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!ap", name = "am", descriptor = "([Ljava/lang/String;)V")
	static void method17618(@OriginalArg(0) String[] arg0) {
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
				Class314.method27032("Pausing for " + local17 + " seconds...", -1918526625);
				Class350.aStringArray32 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26889(949560045) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method627(false, -770548650);
		}
	}

	@OriginalMember(owner = "client!ap", name = "au", descriptor = "()V")
	static void method17619() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray35.length; local7++) {
			if (Class518.aStringArray35[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray35[local7].substring(Class518.aStringArray35[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ar", descriptor = "()V")
	static void method17620() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray35.length; local7++) {
			if (Class518.aStringArray35[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray35[local7].substring(Class518.aStringArray35[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ap", descriptor = "()V")
	static void method17621() {
		if (anInt2443 * 469822389 <= 0) {
			aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray35.length; local7++) {
			if (Class518.aStringArray35[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt2443 * 469822389) {
					aString61 = Class518.aStringArray35[local7].substring(Class518.aStringArray35[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "aq", descriptor = "(Ljava/lang/String;)V")
	public static void method17622(@OriginalArg(0) String arg0) {
		aString61 = arg0;
		anInt2445 = aString61.length() * -1799421149;
	}

	@OriginalMember(owner = "client!ap", name = "ax", descriptor = "(Z)V")
	static void method17623(@OriginalArg(0) boolean arg0) {
		aString61 = aString61.trim();
		anInt2443 = 0;
		if (aString61.length() == 0) {
			anInt2445 = 0;
			return;
		}
		Class314.method27032("--> " + aString61, -1882707837);
		Class32_Sub7.method16835(aString61, false, arg0, (byte) 3);
		if (arg0) {
			anInt2445 = aString61.length() * -1799421149;
		} else {
			anInt2445 = 0;
			aString61 = "";
		}
	}

	@OriginalMember(owner = "client!ap", name = "ah", descriptor = "()V")
	static void method17624() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray35 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray35.length; local28++) {
			Class518.aStringArray35[local28] = "";
		}
		Class314.method27032(Class74.aClass74_107.method1259(Class106.aClass717_8, (byte) -36), -2065695251);
	}

	@OriginalMember(owner = "client!ap", name = "ag", descriptor = "()V")
	static void method17625() {
		anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray35 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray35.length; local28++) {
			Class518.aStringArray35[local28] = "";
		}
		Class314.method27032(Class74.aClass74_107.method1259(Class106.aClass717_8, (byte) -35), -1952947074);
	}

	@OriginalMember(owner = "client!ap", name = "aa", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method17626(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class314.method27032("commands - This command", -2007796725);
				Class314.method27032("cls - Clear console", -2070504371);
				Class314.method27032("displayfps - Toggle FPS and other information", -1942640008);
				Class314.method27032("renderer - Print graphics renderer information", -1852218612);
				Class314.method27032("heap - Print java memory information", -1944549827);
				Class314.method27032("getcamerapos - Print location and direction of camera for use in bug reports", -1921302057);
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt2442 = 0;
				anInt2446 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean601 = !client.aBoolean601;
				if (client.aBoolean601) {
					Class314.method27032("FPS on", -2105743823);
				} else {
					Class314.method27032("FPS off", -2071722099);
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class219 local62 = Class694.aClass104_14.method20583();
				Class314.method27032("Toolkit ID: " + Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 79), -1878097755);
				Class314.method27032("Vendor: " + local62.anInt3664 * -348611355, -1871902044);
				Class314.method27032("Name: " + local62.aString157, -1855911268);
				Class314.method27032("Version: " + local62.anInt3666 * -140508595, -1873210398);
				Class314.method27032("Device: " + local62.aString156, -2041884395);
				Class314.method27032("Driver Version: " + local62.aLong247 * -2731861378298283411L, -2073905141);
				local139 = Class694.aClass104_14.method20443();
				if (local139.length() > 0) {
					Class314.method27032(local139, -1855974528);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class314.method27032("Heap: " + Class553.anInt3419 * 1798078423 + "MB", -2054024609);
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class611 local173 = client.aClass532_1.method30624(1932268058);
				if (Class429.anInt4942 * -1453926679 == 3) {
					@Pc(182) Class472 local182 = Class65.aClass123_Sub1_2.method8957(-883396316);
					@Pc(186) Class472 local186 = Class65.aClass123_Sub1_2.method8954(1208611233);
					Class314.method27032("Pos: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local182.aFloat325 >> 9, (int) local182.aFloat327 >> 9)).toString() + " Height: " + (Class305.method26894((int) local182.aFloat325 - (local173.anInt5784 * 270611681 << 9), (int) local182.aFloat327 - (local173.anInt5785 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -20) + (int) local182.aFloat326), -1945850436);
					Class314.method27032("Look: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local186.aFloat325 >> 9, (int) local186.aFloat327 >> 9)).toString() + " Height: " + (Class305.method26894((int) local186.aFloat325 - (local173.anInt5784 * 270611681 << 9), (int) local182.aFloat327 - (local173.anInt5785 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -74) + (int) local182.aFloat326), -2130715799);
				} else {
					Class314.method27032("Pos: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5784 * 270611681 >> 6) + "," + (local173.anInt5785 * -1994307635 + (Class270.anInt3925 * 466086187 >> 9) >> 6) + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5784 * 270611681 & 0x3F) + "," + (local173.anInt5785 * -1994307635 + (Class270.anInt3925 * 466086187 >> 9) & 0x3F) + " Height: " + (Class305.method26894(Class163.anInt2002 * -1331168249, Class270.anInt3925 * 466086187, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -13) - Class130_Sub2.anInt1117 * 1055108289), -2009458081);
					Class314.method27032("Look: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + (Class545.anInt5450 * 904567799 + local173.anInt5784 * 270611681 >> 6) + "," + (Class349.anInt4242 * -1998384879 + local173.anInt5785 * -1994307635 >> 6) + "," + (Class545.anInt5450 * 904567799 + local173.anInt5784 * 270611681 & 0x3F) + "," + (local173.anInt5785 * -1994307635 + Class349.anInt4242 * -1998384879 & 0x3F) + " Height: " + (Class305.method26894(Class545.anInt5450 * 904567799, Class349.anInt4242 * -1998384879, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -41) - Class290.anInt3952 * -1980774829), -1947476458);
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) 68), -2099968032);
			return;
		}
		if (Class280.aClass693_1 != Class693.aClass693_8 || client.anInt3514 * 2055688893 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class717.method37076(1, -1, -1, false, (byte) 60);
					if (Class255.method26101(1549820509) == 1) {
						Class314.method27032("Success", -1854163411);
					} else {
						Class314.method27032("Failure", -2114064697);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class717.method37076(2, -1, -1, false, (byte) 99);
					if (Class255.method26101(1298959469) == 2) {
						Class314.method27032("Success", -2084241133);
					} else {
						Class314.method27032("Failure", -1928548795);
					}
					return;
				}
				if (Class4.aBoolean2 && arg0.equalsIgnoreCase("wm3")) {
					Class717.method37076(3, 1024, 768, false, (byte) 106);
					if (Class255.method26101(1836986558) == 3) {
						Class314.method27032("Success", -1879042663);
					} else {
						Class314.method27032("Failure", -1844146447);
					}
					return;
				}
				@Pc(570) Class93_Sub22 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3435 * -849002901 != 4) {
						Class314.method27032("Failure", -1973370632);
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class314.method27032("Failure", -2045044434);
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class314.method27032("Failure", -1966971244);
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class237.method25871(local139, local568, -895218641);
					Class314.method27032("Success", -2086012990);
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class543.method31129(0, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 119) == 0) {
						Class314.method27032("Success", -1971971939);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 13);
						Class106_Sub1.method5148(-1035887963);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -1886264969);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class543.method31129(1, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 123) == 1) {
						Class314.method27032("Success", -1896763704);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 1, (byte) 5);
						Class106_Sub1.method5148(468377069);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -1919840835);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class543.method31129(3, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 55) == 3) {
						Class314.method27032("Success", -2054162802);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 3, (byte) 112);
						Class106_Sub1.method5148(-1740756969);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -1959635542);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class543.method31129(5, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 60) == 5) {
						Class314.method27032("Success", -2081980304);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 5, (byte) 17);
						Class106_Sub1.method5148(-969099928);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -2002765067);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3435 * -849002901 == 18) {
						Class565.method31435(-2066387364);
					} else if (client.anInt3435 * -849002901 == 3) {
						client.aClass175_2.aBoolean566 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class175[] local776 = client.aClass175Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class175 local786 = local776[local778];
						if (local786.method24368((byte) -8) != null) {
							local786.method24368((byte) -15).method14714(-1453926679);
						}
					}
					Class520.aClass144_3.method11169(-906685357);
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class314.method27032("varpbit=" + Class624.aClass120_1.method33635(Class624.aClass120_1.method28134(local568, (byte) -21), -497230021), -1939005617);
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class314.method27032("varp=" + Class624.aClass120_1.method33636(Class624.aClass120_1.method28135(Class138.aClass138_65, local568, -1497248091), 2115292292), -1920639858);
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = client.method25414(arg0.substring(12), ' ', 1672500971);
					if (local865.length == 2 || local865.length == 3) {
						if (Class251.method26066(317292832)) {
							Class3.method23((byte) -47);
						}
						Class114.method7634(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true, (byte) 40);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = client.method25414(arg0.substring(8), ' ', 1728081301);
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class225.method25697(local778, local923, true, 1886971804);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class305.method26889(-73459214) + ".log");
						if (local940.exists()) {
							Class314.method27032("file already exists!", -1869987424);
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
						Class314.method27032("Could not create " + local940.getName(), -2045516815);
						return;
					} catch (@Pc(996) SecurityException local996) {
						Class314.method27032("Cannot write to " + local940.getName(), -1863187716);
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
						Class314.method27032("No such file", -1855428610);
						return;
					}
					@Pc(1043) byte[] local1043 = Class300.method26813(local940, 1388704912);
					if (local1043 == null) {
						Class314.method27032("Failed to read file", -1937371118);
						return;
					}
					@Pc(1061) String[] local1061 = client.method25414(Class93_Sub13.method13491(Class114.method7636(local1043, 34838), '\r', "", 39418505), '\n', 1856772179);
					Class96_Sub3.method2331(local1061, 162649237);
				}
				if (client.anInt3435 * -849002901 == 18 || client.anInt3435 * -849002901 == 13) {
					@Pc(1077) Class175 local1077 = Class330.method27465(-1708242123);
					local570 = Class102.method2592(Class446.aClass446_86, local1077.aClass24_2, (byte) 23);
					local570.aClass93_Sub41_Sub2_1.method22522(arg0.length() + 3, (byte) -71);
					local570.aClass93_Sub41_Sub2_1.method22522(arg1 ? 1 : 0, (byte) -112);
					local570.aClass93_Sub41_Sub2_1.method22522(arg2 ? 1 : 0, (byte) -3);
					local570.aClass93_Sub41_Sub2_1.method22414(arg0, -1224579575);
					local1077.method24363(local570, -1440770000);
				}
			} catch (@Pc(1120) Exception local1120) {
				Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) 32), -2133842538);
				return;
			}
		}
		if (client.anInt3435 * -849002901 != 18 && client.anInt3435 * -849002901 != 13) {
			Class314.method27032(Class74.aClass74_4.method1259(Class106.aClass717_8, (byte) -48) + arg0, -1909650916);
		}
	}

	@OriginalMember(owner = "client!ap", name = "ay", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method17627(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ap", name = "ab", descriptor = "()V")
	static void method17628() {
	}

	@OriginalMember(owner = "client!ap", name = "az", descriptor = "()V")
	static void method17629() {
	}

	@OriginalMember(owner = "client!ap", name = "ak", descriptor = "(I)V")
	static void method17630(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15448((byte) 66);
				} else if (arg0 == 11) {
					Class314.method27032("" + Class553.anInt3407 * 1249273355, -2103541327);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.aClass532_1.method30640(-1509926132).aClass598_2;
					local43.aBoolean833 = !local43.aBoolean833;
				} else if (arg0 == 25) {
					client.aBoolean601 = true;
				} else if (arg0 == 21) {
					client.aBoolean601 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method378(-2146280464);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33604((byte) -47);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -2065787653);
					} else if (arg0 == 20) {
						Class684.method33604((byte) -56);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -2016426337);
						Class510.method30429((byte) 10);
						Class684.method33604((byte) -104);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -1867748555);
					} else if (arg0 == 9) {
						Class314.method27032(Class125_Sub1.aClass586_1.method31805(-1104292846) ? "Success" : "Failure", -2102652457);
					} else if (arg0 == 23) {
						Class50.aClass28_5.method593((short) -32189);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11154(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11148(1089914583);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method33003((byte) 86);
					} else if (arg0 == 17) {
						client.aClass532_1.aLong289 = Class305.method26889(856391950) * -3941212876594184505L;
						client.aClass532_1.aBoolean799 = true;
						Class660.method33003((byte) 92);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032(((int) local254.aFloat325 >> 9) + " " + ((int) local254.aFloat327 >> 9), -2110907686);
						} else if (arg0 == 16) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032("" + client.aClass532_1.method30640(-1817857726).aClass99Array1[Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100].method2482((int) local254.aFloat325 >> 9, (int) local254.aFloat327 >> 9, -1308895338), -1956290314);
						} else if (arg0 == 27) {
							Class314.method27032(Class312.aClass240_74.method25928((byte) 103) + " " + Class312.aClass240_74.method25927(1973941732), -2066317177);
							Class314.method27032(Class312.aClass240_77.method25928((byte) 109) + " " + Class312.aClass240_77.method25927(1723982115), -1870629721);
						} else if (arg0 == 8) {
							Class700.method36897(false, (byte) -76);
						} else if (arg0 == 13) {
							client.aBoolean612 = !client.aBoolean612;
							Class694.aClass104_14.method20564(client.aBoolean612);
							Class125_Sub3.method10061(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.aClass532_1.method30650((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) -40), -1861437651);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "af", descriptor = "(I)V")
	static void method17631(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15448((byte) -105);
				} else if (arg0 == 11) {
					Class314.method27032("" + Class553.anInt3407 * 1249273355, -2012949698);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.aClass532_1.method30640(-971796568).aClass598_2;
					local43.aBoolean833 = !local43.aBoolean833;
				} else if (arg0 == 25) {
					client.aBoolean601 = true;
				} else if (arg0 == 21) {
					client.aBoolean601 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method378(-1970110337);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33604((byte) -58);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -1908601808);
					} else if (arg0 == 20) {
						Class684.method33604((byte) -118);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -2028558599);
						Class510.method30429((byte) -72);
						Class684.method33604((byte) -115);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -2074955941);
					} else if (arg0 == 9) {
						Class314.method27032(Class125_Sub1.aClass586_1.method31805(-1830009427) ? "Success" : "Failure", -1981407361);
					} else if (arg0 == 23) {
						Class50.aClass28_5.method593((short) -3687);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11154(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11148(1275869380);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method33003((byte) 52);
					} else if (arg0 == 17) {
						client.aClass532_1.aLong289 = Class305.method26889(648613496) * -3941212876594184505L;
						client.aClass532_1.aBoolean799 = true;
						Class660.method33003((byte) 29);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032(((int) local254.aFloat325 >> 9) + " " + ((int) local254.aFloat327 >> 9), -1923071533);
						} else if (arg0 == 16) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032("" + client.aClass532_1.method30640(-1271700151).aClass99Array1[Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100].method2482((int) local254.aFloat325 >> 9, (int) local254.aFloat327 >> 9, -1363305333), -2075009443);
						} else if (arg0 == 27) {
							Class314.method27032(Class312.aClass240_74.method25928((byte) 113) + " " + Class312.aClass240_74.method25927(1190029588), -1940634502);
							Class314.method27032(Class312.aClass240_77.method25928((byte) 105) + " " + Class312.aClass240_77.method25927(1560779061), -2081804748);
						} else if (arg0 == 8) {
							Class700.method36897(false, (byte) -2);
						} else if (arg0 == 13) {
							client.aBoolean612 = !client.aBoolean612;
							Class694.aClass104_14.method20564(client.aBoolean612);
							Class125_Sub3.method10061(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.aClass532_1.method30650((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) 16), -2107088423);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "at", descriptor = "([Ljava/lang/String;)V")
	static void method17632(@OriginalArg(0) String[] arg0) {
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
				Class314.method27032("Pausing for " + local17 + " seconds...", -1911833053);
				Class350.aStringArray32 = arg0;
				anInt2447 = (local5 + 1) * -636234327;
				aLong111 = (Class305.method26889(38891596) + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			aString61 = arg0[local5];
			Class30.method627(false, -1282978170);
		}
	}

	@OriginalMember(owner = "client!ap", name = "an", descriptor = "(I)V")
	static void method17633(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15448((byte) -10);
				} else if (arg0 == 11) {
					Class314.method27032("" + Class553.anInt3407 * 1249273355, -2035430587);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.aClass532_1.method30640(-992579788).aClass598_2;
					local43.aBoolean833 = !local43.aBoolean833;
				} else if (arg0 == 25) {
					client.aBoolean601 = true;
				} else if (arg0 == 21) {
					client.aBoolean601 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method378(-2041990103);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33604((byte) -57);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -1909496695);
					} else if (arg0 == 20) {
						Class684.method33604((byte) -56);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -1846868207);
						Class510.method30429((byte) 59);
						Class684.method33604((byte) -46);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method27032("" + local95, -1961537023);
					} else if (arg0 == 9) {
						Class314.method27032(Class125_Sub1.aClass586_1.method31805(-1989181737) ? "Success" : "Failure", -2114598227);
					} else if (arg0 == 23) {
						Class50.aClass28_5.method593((short) -29922);
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11154(83681544);
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11148(2093372411);
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method33003((byte) 110);
					} else if (arg0 == 17) {
						client.aClass532_1.aLong289 = Class305.method26889(845866126) * -3941212876594184505L;
						client.aClass532_1.aBoolean799 = true;
						Class660.method33003((byte) 85);
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032(((int) local254.aFloat325 >> 9) + " " + ((int) local254.aFloat327 >> 9), -1909294065);
						} else if (arg0 == 16) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
							Class314.method27032("" + client.aClass532_1.method30640(-1354454789).aClass99Array1[Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100].method2482((int) local254.aFloat325 >> 9, (int) local254.aFloat327 >> 9, -1578363224), -2037118374);
						} else if (arg0 == 27) {
							Class314.method27032(Class312.aClass240_74.method25928((byte) 125) + " " + Class312.aClass240_74.method25927(2038685046), -2073576978);
							Class314.method27032(Class312.aClass240_77.method25928((byte) 111) + " " + Class312.aClass240_77.method25927(1763856628), -1905637292);
						} else if (arg0 == 8) {
							Class700.method36897(false, (byte) -10);
						} else if (arg0 == 13) {
							client.aBoolean612 = !client.aBoolean612;
							Class694.aClass104_14.method20564(client.aBoolean612);
							Class125_Sub3.method10061(-257432311);
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.aClass532_1.method30650((byte) 0);
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.aClass532_1.method30650((byte) 0);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) -52), -1866073190);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "bf", descriptor = "()V")
	static void method17634() {
		if (Class51.aClass93_Sub36_1.aClass166_Sub47_1.method16568((short) 512) == 1) {
			Class392.aClass541_1.method31089(new Class537(Class526.aClass526_7, null), (byte) 8);
		} else {
			client.aClass532_1.method30650((byte) 0);
			Class360.method27982((short) -7591);
		}
	}

	@OriginalMember(owner = "client!ap", name = "bl", descriptor = "()V")
	static void method17635() {
		if (Class51.aClass93_Sub36_1.aClass166_Sub47_1.method16568((short) 512) == 1) {
			Class392.aClass541_1.method31089(new Class537(Class526.aClass526_7, null), (byte) 41);
		} else {
			client.aClass532_1.method30650((byte) 0);
			Class360.method27982((short) 6645);
		}
	}

	@OriginalMember(owner = "client!ap", name = "as", descriptor = "()Z")
	static boolean method17636() {
		return aBoolean381;
	}

	@OriginalMember(owner = "client!ap", name = "ms", descriptor = "(Lclient!yf;I)V")
	static void method17637(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class160.method14732(local11, local14, arg0, -1255783522);
	}

	@OriginalMember(owner = "client!ap", name = "aae", descriptor = "(Lclient!yf;I)V")
	static void method17638(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class548.method31196((byte) -70);
	}

	@OriginalMember(owner = "client!ap", name = "qn", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method17639(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray37 = Class499.method30329(local13, arg2, 1000246318);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ap", name = "as", descriptor = "(I)I")
	static int method17640(@OriginalArg(0) int arg0) {
		if (client.aClass312_5 == null) {
			if (Class454.aBoolean782) {
				@Pc(25) Class5 local25 = Class142_Sub1.method10990((byte) 91);
				@Pc(29) int local29 = Class82.aClass153_1.method14058(1038817060);
				@Pc(33) int local33 = Class82.aClass153_1.method14064(1581965782);
				@Pc(51) int local51;
				@Pc(53) int local53;
				@Pc(85) int local85;
				@Pc(161) Class93_Sub1_Sub7 local161;
				if (Class454.aBoolean781) {
					@Pc(288) Class11 local288;
					if (local29 > Class166_Sub17.anInt2179 * 1703853389 && local29 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3670 * 1555894759) {
						local51 = -1;
						for (local53 = 0; local53 < Class454.anInt5200 * -2074084977; local53++) {
							if (Class454.aBoolean783) {
								local85 = local53 * Class454.anInt5197 * -875883057 + 1 + Class369.anInt4750 * -310709577 + 20 + local25.anInt6 * -8978697;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							} else {
								local85 = Class369.anInt4750 * -310709577 + 31 + local53 * -875883057 * Class454.anInt5197;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class11(Class454.aClass18_16);
							for (@Pc(293) Class93_Sub1_Sub8 local293 = (Class93_Sub1_Sub8) local288.method169(-792268585); local293 != null; local293 = (Class93_Sub1_Sub8) local288.next()) {
								if (local53++ == local51) {
									return ((Class93_Sub1_Sub7) local293.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3008 * -79336851;
								}
							}
						}
					} else if (Class454.aClass93_Sub1_Sub8_1 != null && local29 > Class301.anInt3972 * 1939408525 && local29 < Class454.anInt5207 * -816478179 + Class301.anInt3972 * 1939408525) {
						local51 = -1;
						for (local53 = 0; local53 < Class454.aClass93_Sub1_Sub8_1.anInt3013 * -2109043087; local53++) {
							if (Class454.aBoolean783) {
								local85 = local25.anInt6 * -8978697 + 20 + Class318.anInt4136 * -988861719 + 1 + Class454.anInt5197 * -875883057 * local53;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
									local51 = local53;
								}
							} else {
								local85 = local53 * -875883057 * Class454.anInt5197 + 31 + Class318.anInt4136 * -988861719;
								if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local85 + local25.anInt10 * -1093354073) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class11(Class454.aClass93_Sub1_Sub8_1.aClass18_10);
							for (local161 = (Class93_Sub1_Sub7) local288.method169(-939873749); local161 != null; local161 = (Class93_Sub1_Sub7) local288.next()) {
								if (local53++ == local51) {
									return local161.anInt3008 * -79336851;
								}
							}
						}
					}
				} else if (local29 > Class166_Sub17.anInt2179 * 1703853389 && local29 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3670 * 1555894759) {
					local51 = -1;
					for (local53 = 0; local53 < Class454.anInt5203 * -1838307953; local53++) {
						if (Class454.aBoolean783) {
							local85 = Class369.anInt4750 * -310709577 + 20 + local25.anInt6 * -8978697 + 1 + Class454.anInt5197 * -875883057 * (Class454.anInt5203 * -1838307953 - 1 - local53);
							if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local25.anInt10 * -1093354073 + local85) {
								local51 = local53;
							}
						} else {
							local85 = Class454.anInt5197 * -875883057 * (Class454.anInt5203 * -1838307953 - 1 - local53) + 31 + Class369.anInt4750 * -310709577;
							if (local33 > local85 - local25.anInt6 * -8978697 - 1 && local33 < local85 + local25.anInt10 * -1093354073) {
								local51 = local53;
							}
						}
					}
					if (local51 != -1) {
						local53 = 0;
						@Pc(156) Class20 local156 = new Class20(Class454.aClass22_55);
						for (local161 = (Class93_Sub1_Sub7) local156.method372(699749822); local161 != null; local161 = (Class93_Sub1_Sub7) local156.next()) {
							if (local53++ == local51) {
								return local161.anInt3008 * -79336851;
							}
						}
					}
				}
			} else if (Class288.aClass636_1.aBoolean863) {
				if (Class272.aClass93_Sub1_Sub7_5 != null) {
					return Class272.aClass93_Sub1_Sub7_5.anInt3008 * -79336851;
				}
			} else if (Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 != null) {
				return Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4.anInt3008 * -79336851;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(B)Lclient!alw;")
	static Class93_Sub41 method17641(@OriginalArg(0) byte arg0) {
		@Pc(2) Class93_Sub41 local2 = Class346.method27662((byte) 4);
		if (client.anInt3435 * -849002901 != 14) {
			@Pc(17) long local17;
			if (Class411.anInt4907 * 276097583 != -1) {
				local17 = Class411.anInt4907 * 276097583;
			} else if (Class411.aLong274 * 4457507688757033075L == -1L) {
				local17 = Class96_Sub3.method2328(Class411.aString209, -1238264676);
			} else {
				local17 = Class411.aLong274 * 4457507688757033075L;
			}
			Class413.aLong275 = local17 * 8666456646503961589L;
			Class709.method36946(local2, local17);
			local2.method22413(false, -475970197);
			local2.method22414(Class411.aString210, 2072335141);
			local2.method22411(Class411.aLong273 * -1009657282713816485L);
			local2.method22411(client.aLong243 * 6484786827691107089L);
		}
		local2.method22428(Class95.aBigInteger2, Class95.aBigInteger4, (byte) -19);
		return local2;
	}

	@OriginalMember(owner = "client!ap", name = "agj", descriptor = "(Lclient!yf;B)V")
	static void method17642(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class164.method15297(local14, local25, -1545240102);
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	Class168() throws Throwable {
		throw new Error();
	}
}
