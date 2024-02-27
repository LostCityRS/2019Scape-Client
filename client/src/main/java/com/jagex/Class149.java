package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@OriginalClass("client!ak")
public final class Class149 {

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray16;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
	static int anInt1521;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString47 = "\\/.:, _-+[]~@";

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
	static final int anInt1526 = 350;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	static int anInt1528;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Ljava/lang/String;")
	static final String aString49 = "Success";

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/lang/String;")
	static final String aString50 = "Failure";

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	static int anInt1522 = 0;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	static int anInt1524 = 0;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Ljava/lang/String;")
	static String aString48 = "";

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	static int anInt1525 = 0;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	static int anInt1523 = 0;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	static int anInt1527 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Z")
	static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	static int anInt1529 = -864731011;

	@OriginalMember(owner = "client!ak", name = "az", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method13879(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ak", name = "by", descriptor = "()V")
	static void method13880() {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1862940416) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(1333511270);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "()Z")
	static boolean method13881() {
		return !Class270.method26694(client.anInt3433 * 1994758437, (byte) -63);
	}

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "()V")
	static void method13882() {
		if (!Class240.method26225(-1742958796)) {
			return;
		}
		if (aStringArray16 == null) {
			Class579.method31811(65280);
		}
		aBoolean355 = true;
		anInt1527 = 0;
	}

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "()V")
	static void method13883() {
		if (!Class240.method26225(746105432)) {
			return;
		}
		if (aStringArray16 == null) {
			Class579.method31811(65280);
		}
		aBoolean355 = true;
		anInt1527 = 0;
	}

	@OriginalMember(owner = "client!ak", name = "ae", descriptor = "(Ljava/lang/String;)V")
	public static void method13884(@OriginalArg(0) String arg0) {
		if (aStringArray16 == null) {
			Class579.method31811(65280);
		}
		client.aCalendar3.setTime(new Date(Class303.currentTimeMillis((byte) 127)));
		@Pc(14) int local14 = client.aCalendar3.get(11);
		@Pc(18) int local18 = client.aCalendar3.get(12);
		@Pc(22) int local22 = client.aCalendar3.get(13);
		@Pc(56) String local56 = Integer.toString(local14 / 10) + local14 % 10 + ":" + local18 / 10 + local18 % 10 + ":" + local22 / 10 + local22 % 10;
		@Pc(61) String[] local61 = Class313.method27482(arg0, '\n', 2036747717);
		for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
			for (@Pc(71) int local71 = anInt1522 * -2043909027; local71 > 0; local71--) {
				aStringArray16[local71] = aStringArray16[local71 - 1];
			}
			aStringArray16[0] = local56 + ": " + local61[local63];
			if (Class677.aFileOutputStream1 != null) {
				try {
					Class677.aFileOutputStream1.write(Class623.method32438(aStringArray16[0] + "\n", -2113522262));
				} catch (@Pc(116) IOException local116) {
				}
			}
			if (anInt1522 * -2043909027 < aStringArray16.length - 1) {
				anInt1522 += 1480640501;
				if (anInt1524 * -868725591 > 0) {
					anInt1524 += -1558243431;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "()V")
	static void method13885() {
		if (!Class240.method26225(1763480559)) {
			return;
		}
		if (aStringArray16 == null) {
			Class579.method31811(65280);
		}
		aBoolean355 = true;
		anInt1527 = 0;
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "()Z")
	static boolean method13886() {
		return !Class270.method26694(client.anInt3433 * 1994758437, (byte) -35);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "()V")
	static void method13887() {
		aBoolean355 = false;
		Class138_Sub1.method10718((byte) 9);
	}

	@OriginalMember(owner = "client!ak", name = "ax", descriptor = "()V")
	static void method13888() {
		if (Class677.aFileOutputStream1 != null) {
			try {
				Class677.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Class677.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "ay", descriptor = "()V")
	static void method13889() {
		if (Class677.aFileOutputStream1 != null) {
			try {
				Class677.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Class677.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "ai", descriptor = "()V")
	static void method13890() {
		if (Class677.aFileOutputStream1 != null) {
			try {
				Class677.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Class677.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "aq", descriptor = "()Z")
	static boolean method13891() {
		return aBoolean355;
	}

	@OriginalMember(owner = "client!ak", name = "aw", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method13892(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ak", name = "aj", descriptor = "()Z")
	static boolean method13893() {
		return aBoolean355;
	}

	@OriginalMember(owner = "client!ak", name = "ac", descriptor = "()Z")
	static boolean method13894() {
		return aBoolean355;
	}

	@OriginalMember(owner = "client!ak", name = "ag", descriptor = "([Ljava/lang/String;)V")
	static void method13895(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString48 = aString48 + arg0[0];
			anInt1523 += arg0[0].length() * -1734720461;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class294.method26961("Pausing for " + local17 + " seconds...", 1455295997);
				Class491.aStringArray30 = arg0;
				anInt1529 = (local5 + 1) * 864731011;
				Class519.aLong391 = (Class303.currentTimeMillis((byte) 59) + (long) (local17 * 1000)) * 7383831285108766023L;
				return;
			}
			aString48 = arg0[local5];
			LoginProt.method29134(false, -972307639);
		}
	}

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "([Ljava/lang/String;)V")
	static void method13896(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString48 = aString48 + arg0[0];
			anInt1523 += arg0[0].length() * -1734720461;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class294.method26961("Pausing for " + local17 + " seconds...", 1455295997);
				Class491.aStringArray30 = arg0;
				anInt1529 = (local5 + 1) * 864731011;
				Class519.aLong391 = (Class303.currentTimeMillis((byte) 10) + (long) (local17 * 1000)) * 7383831285108766023L;
				return;
			}
			aString48 = arg0[local5];
			LoginProt.method29134(false, -972307639);
		}
	}

	@OriginalMember(owner = "client!ak", name = "at", descriptor = "(Ljava/lang/String;)V")
	public static void method13897(@OriginalArg(0) String arg0) {
		aString48 = arg0;
		anInt1523 = aString48.length() * -1734720461;
	}

	@OriginalMember(owner = "client!ak", name = "ah", descriptor = "()V")
	static void method13898() {
		if (anInt1527 * 1338436645 < 102) {
			anInt1527 += 231464462;
		}
		@Pc(24) int local24;
		if (anInt1529 * -59652309 != -1 && Class519.aLong391 * 4234509874920039543L < Class303.currentTimeMillis((byte) 43)) {
			for (local24 = anInt1529 * -59652309; local24 < Class491.aStringArray30.length; local24++) {
				if (Class491.aStringArray30[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class491.aStringArray30[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class294.method26961("Pausing for " + local36 + " seconds...", 1455295997);
					anInt1529 = (local24 + 1) * 864731011;
					Class519.aLong391 = (Class303.currentTimeMillis((byte) 28) + (long) (local36 * 1000)) * 7383831285108766023L;
					return;
				}
				aString48 = Class491.aStringArray30[local24];
				LoginProt.method29134(false, -972307639);
			}
			anInt1529 = -864731011;
		}
		if (client.anInt3575 * 866611799 != 0) {
			anInt1524 -= client.anInt3575 * -949304581;
			if (anInt1524 * -868725591 >= anInt1522 * -2043909027) {
				anInt1524 = anInt1522 * -2071191915 - -1558243431;
			}
			if (anInt1524 * -868725591 < 0) {
				anInt1524 = 0;
			}
			client.anInt3575 = 0;
		}
		for (local24 = 0; local24 < client.anInt3444 * 200884815; local24++) {
			@Pc(128) Interface63 local128 = client.anInterface63Array2[local24];
			@Pc(132) int local132 = local128.method14065(-2030328380);
			@Pc(136) char local136 = local128.method14074(-1491466500);
			@Pc(140) int local140 = local128.method14068(86063632);
			if (local132 == 84) {
				LoginProt.method29134(false, -972307639);
			}
			if (local132 == 80) {
				LoginProt.method29134(true, -972307639);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					@Pc(166) String local166 = "";
					for (@Pc(171) int local171 = aStringArray16.length - 1; local171 >= 0; local171--) {
						if (aStringArray16[local171] != null && aStringArray16[local171].length() > 0) {
							local166 = local166 + aStringArray16[local171] + '\n';
						}
					}
					Class80_Sub42.aClipboard1.setContents(new StringSelection(local166), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class80_Sub42.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class313.method27482(local225, '\n', 2036747717);
								Class301.method27038(local232, -510846846);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local132 == 85 && anInt1523 * -187541765 > 0) {
				aString48 = aString48.substring(0, anInt1523 * -187541765 - 1) + aString48.substring(anInt1523 * -187541765);
				anInt1523 -= -1734720461;
			} else if (local132 == 101 && anInt1523 * -187541765 < aString48.length()) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + aString48.substring(anInt1523 * -187541765 + 1);
			} else if (local132 == 96 && anInt1523 * -187541765 > 0) {
				anInt1523 -= -1734720461;
			} else if (local132 == 97 && anInt1523 * -187541765 < aString48.length()) {
				anInt1523 += -1734720461;
			} else if (local132 == 102) {
				anInt1523 = 0;
			} else if (local132 == 103) {
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 104 && anInt1525 * 1439733989 < aStringArray16.length) {
				anInt1525 += -738892563;
				Class313.method27479(1082267465);
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 105 && anInt1525 * 1439733989 > 0) {
				anInt1525 -= -738892563;
				Class313.method27479(-1745334523);
				anInt1523 = aString48.length() * -1734720461;
			} else if (Class702.method37108(local136, 2120620890) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + client.anInterface63Array2[local24].method14074(1814281704) + aString48.substring(anInt1523 * -187541765);
				anInt1523 += -1734720461;
			}
		}
		client.anInt3444 = 0;
		client.anInt3446 = 0;
		Class138_Sub1.method10718((byte) 13);
	}

	@OriginalMember(owner = "client!ak", name = "af", descriptor = "()V")
	static void method13899() {
		if (anInt1527 * 1338436645 < 102) {
			anInt1527 += 231464462;
		}
		@Pc(24) int local24;
		if (anInt1529 * -59652309 != -1 && Class519.aLong391 * 4234509874920039543L < Class303.currentTimeMillis((byte) 27)) {
			for (local24 = anInt1529 * -59652309; local24 < Class491.aStringArray30.length; local24++) {
				if (Class491.aStringArray30[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class491.aStringArray30[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class294.method26961("Pausing for " + local36 + " seconds...", 1455295997);
					anInt1529 = (local24 + 1) * 864731011;
					Class519.aLong391 = (Class303.currentTimeMillis((byte) 44) + (long) (local36 * 1000)) * 7383831285108766023L;
					return;
				}
				aString48 = Class491.aStringArray30[local24];
				LoginProt.method29134(false, -972307639);
			}
			anInt1529 = -864731011;
		}
		if (client.anInt3575 * 866611799 != 0) {
			anInt1524 -= client.anInt3575 * -949304581;
			if (anInt1524 * -868725591 >= anInt1522 * -2043909027) {
				anInt1524 = anInt1522 * -2071191915 - -1558243431;
			}
			if (anInt1524 * -868725591 < 0) {
				anInt1524 = 0;
			}
			client.anInt3575 = 0;
		}
		for (local24 = 0; local24 < client.anInt3444 * 200884815; local24++) {
			@Pc(128) Interface63 local128 = client.anInterface63Array2[local24];
			@Pc(132) int local132 = local128.method14065(202912075);
			@Pc(136) char local136 = local128.method14074(-1395479697);
			@Pc(140) int local140 = local128.method14068(88564903);
			if (local132 == 84) {
				LoginProt.method29134(false, -972307639);
			}
			if (local132 == 80) {
				LoginProt.method29134(true, -972307639);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					@Pc(166) String local166 = "";
					for (@Pc(171) int local171 = aStringArray16.length - 1; local171 >= 0; local171--) {
						if (aStringArray16[local171] != null && aStringArray16[local171].length() > 0) {
							local166 = local166 + aStringArray16[local171] + '\n';
						}
					}
					Class80_Sub42.aClipboard1.setContents(new StringSelection(local166), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class80_Sub42.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class313.method27482(local225, '\n', 2036747717);
								Class301.method27038(local232, 1506155337);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local132 == 85 && anInt1523 * -187541765 > 0) {
				aString48 = aString48.substring(0, anInt1523 * -187541765 - 1) + aString48.substring(anInt1523 * -187541765);
				anInt1523 -= -1734720461;
			} else if (local132 == 101 && anInt1523 * -187541765 < aString48.length()) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + aString48.substring(anInt1523 * -187541765 + 1);
			} else if (local132 == 96 && anInt1523 * -187541765 > 0) {
				anInt1523 -= -1734720461;
			} else if (local132 == 97 && anInt1523 * -187541765 < aString48.length()) {
				anInt1523 += -1734720461;
			} else if (local132 == 102) {
				anInt1523 = 0;
			} else if (local132 == 103) {
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 104 && anInt1525 * 1439733989 < aStringArray16.length) {
				anInt1525 += -738892563;
				Class313.method27479(-1996342364);
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 105 && anInt1525 * 1439733989 > 0) {
				anInt1525 -= -738892563;
				Class313.method27479(-1400442810);
				anInt1523 = aString48.length() * -1734720461;
			} else if (Class702.method37108(local136, 2120620890) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + client.anInterface63Array2[local24].method14074(1360666533) + aString48.substring(anInt1523 * -187541765);
				anInt1523 += -1734720461;
			}
		}
		client.anInt3444 = 0;
		client.anInt3446 = 0;
		Class138_Sub1.method10718((byte) 29);
	}

	@OriginalMember(owner = "client!ak", name = "am", descriptor = "()V")
	static void method13900() {
		if (anInt1525 * 1439733989 <= 0) {
			aString48 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < aStringArray16.length; local7++) {
			if (aStringArray16[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt1525 * 1439733989) {
					aString48 = aStringArray16[local7].substring(aStringArray16[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "()V")
	static void method13901() {
		anInt1521 = Class375.aClass15_9.anInt45 * -1140821369 + 2027825122 + Class375.aClass15_9.anInt46 * -903293067;
		anInt1528 = Class689.aClass15_13.anInt46 * -986959715 + Class689.aClass15_13.anInt45 * -134051009 + 1453614578;
		aStringArray16 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < aStringArray16.length; local28++) {
			aStringArray16[local28] = "";
		}
		Class294.method26961(Class60.aClass60_102.method1180(Class512.aClass719_3, -1050322922), 1455295997);
	}

	@OriginalMember(owner = "client!ak", name = "ad", descriptor = "(Ljava/lang/String;)V")
	public static void method13902(@OriginalArg(0) String arg0) {
		aString48 = arg0;
		anInt1523 = aString48.length() * -1734720461;
	}

	@OriginalMember(owner = "client!ak", name = "av", descriptor = "(Ljava/lang/String;)V")
	public static void method13903(@OriginalArg(0) String arg0) {
		aString48 = arg0;
		anInt1523 = aString48.length() * -1734720461;
	}

	@OriginalMember(owner = "client!ak", name = "an", descriptor = "(Z)V")
	static void method13904(@OriginalArg(0) boolean arg0) {
		aString48 = aString48.trim();
		anInt1525 = 0;
		if (aString48.length() == 0) {
			anInt1523 = 0;
			return;
		}
		Class294.method26961("--> " + aString48, 1455295997);
		Class138.method11536(aString48, false, arg0, (byte) 61);
		if (arg0) {
			anInt1523 = aString48.length() * -1734720461;
		} else {
			anInt1523 = 0;
			aString48 = "";
		}
	}

	@OriginalMember(owner = "client!ak", name = "aa", descriptor = "(Z)V")
	static void method13905(@OriginalArg(0) boolean arg0) {
		aString48 = aString48.trim();
		anInt1525 = 0;
		if (aString48.length() == 0) {
			anInt1523 = 0;
			return;
		}
		Class294.method26961("--> " + aString48, 1455295997);
		Class138.method11536(aString48, false, arg0, (byte) 105);
		if (arg0) {
			anInt1523 = aString48.length() * -1734720461;
		} else {
			anInt1523 = 0;
			aString48 = "";
		}
	}

	@OriginalMember(owner = "client!ak", name = "ap", descriptor = "(Lclient!di;)V")
	static void method13906(@OriginalArg(0) Class102 arg0) {
		if (Class380.method28557((byte) 114) && Class155.method15057(508558666)) {
			Class550.method31318(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, -1680012462);
		}
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, anInt1527 * 1338436645 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt1528 * -1660817591);
		@Pc(55) int local55;
		if (anInt1522 * -2043909027 > 0) {
			local55 = 346 - anInt1528 * -1660817591 - 4;
			@Pc(67) int local67 = local43 * local55 / (local43 + anInt1522 * -2043909027 - 1);
			@Pc(69) int local69 = 4;
			if (anInt1522 * -2043909027 > 1) {
				local69 += (anInt1522 * -2043909027 - 1 - anInt1524 * -868725591) * (local55 - local67) / (anInt1522 * -2043909027 - 1);
			}
			arg0.method20722(Class80_Sub1_Sub1.anInt254 * -255202897 - 16, local69, 12, local67, anInt1527 * 1338436645 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt1524 * -868725591; local118 < anInt1524 * -868725591 + local43 && local118 < anInt1522 * -2043909027; local118++) {
				@Pc(137) String[] local137 = Class313.method27482(aStringArray16[local118], '\b', 2036747717);
				@Pc(148) int local148 = (Class80_Sub1_Sub1.anInt254 * -255202897 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20986(local160, 0, local148 + local160 - 8, 350);
					Class709.aClass104_26.method7655(Class343.method27946(local137[local150], (byte) 73), local160, 350 - anInt1521 * 353598737 - 2 - Class689.aClass15_13.anInt46 * -191270971 - anInt1528 * -1660817591 * (local118 - anInt1524 * -868725591), -1, -16777216, -1011228241);
				}
			}
		}
		Class108.aClass104_22.method7629("910 1", Class80_Sub1_Sub1.anInt254 * -255202897 - 25, 330, -1, -16777216, 1288148740);
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20893(0, 350 - anInt1521 * 353598737, Class80_Sub1_Sub1.anInt254 * -255202897, -1, -1320601070);
		Class8.aClass104_1.method7655("--> " + Class343.method27946(aString48, (byte) 16), 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 1, -1, -16777216, -1398168454);
		if (Class597.focus) {
			local55 = -1;
			if (client.currentCycle % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20719(Class375.aClass15_9.method373("--> " + Class343.method27946(aString48, (byte) 116).substring(0, anInt1523 * -187541765), -799168157) + 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 11, 12, local55, (byte) -74);
		}
		arg0.method20877();
		Class333.method27800((short) -6681);
	}

	@OriginalMember(owner = "client!ak", name = "al", descriptor = "()V")
	static void method13907() {
		if (anInt1527 * 1338436645 < 102) {
			anInt1527 += 231464462;
		}
		@Pc(24) int local24;
		if (anInt1529 * -59652309 != -1 && Class519.aLong391 * 4234509874920039543L < Class303.currentTimeMillis((byte) 117)) {
			for (local24 = anInt1529 * -59652309; local24 < Class491.aStringArray30.length; local24++) {
				if (Class491.aStringArray30[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class491.aStringArray30[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class294.method26961("Pausing for " + local36 + " seconds...", 1455295997);
					anInt1529 = (local24 + 1) * 864731011;
					Class519.aLong391 = (Class303.currentTimeMillis((byte) 15) + (long) (local36 * 1000)) * 7383831285108766023L;
					return;
				}
				aString48 = Class491.aStringArray30[local24];
				LoginProt.method29134(false, -972307639);
			}
			anInt1529 = -864731011;
		}
		if (client.anInt3575 * 866611799 != 0) {
			anInt1524 -= client.anInt3575 * -949304581;
			if (anInt1524 * -868725591 >= anInt1522 * -2043909027) {
				anInt1524 = anInt1522 * -2071191915 - -1558243431;
			}
			if (anInt1524 * -868725591 < 0) {
				anInt1524 = 0;
			}
			client.anInt3575 = 0;
		}
		for (local24 = 0; local24 < client.anInt3444 * 200884815; local24++) {
			@Pc(128) Interface63 local128 = client.anInterface63Array2[local24];
			@Pc(132) int local132 = local128.method14065(-1583151041);
			@Pc(136) char local136 = local128.method14074(-1234468133);
			@Pc(140) int local140 = local128.method14068(1120190383);
			if (local132 == 84) {
				LoginProt.method29134(false, -972307639);
			}
			if (local132 == 80) {
				LoginProt.method29134(true, -972307639);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					@Pc(166) String local166 = "";
					for (@Pc(171) int local171 = aStringArray16.length - 1; local171 >= 0; local171--) {
						if (aStringArray16[local171] != null && aStringArray16[local171].length() > 0) {
							local166 = local166 + aStringArray16[local171] + '\n';
						}
					}
					Class80_Sub42.aClipboard1.setContents(new StringSelection(local166), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class80_Sub42.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class313.method27482(local225, '\n', 2036747717);
								Class301.method27038(local232, -559647883);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local132 == 85 && anInt1523 * -187541765 > 0) {
				aString48 = aString48.substring(0, anInt1523 * -187541765 - 1) + aString48.substring(anInt1523 * -187541765);
				anInt1523 -= -1734720461;
			} else if (local132 == 101 && anInt1523 * -187541765 < aString48.length()) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + aString48.substring(anInt1523 * -187541765 + 1);
			} else if (local132 == 96 && anInt1523 * -187541765 > 0) {
				anInt1523 -= -1734720461;
			} else if (local132 == 97 && anInt1523 * -187541765 < aString48.length()) {
				anInt1523 += -1734720461;
			} else if (local132 == 102) {
				anInt1523 = 0;
			} else if (local132 == 103) {
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 104 && anInt1525 * 1439733989 < aStringArray16.length) {
				anInt1525 += -738892563;
				Class313.method27479(-1573418049);
				anInt1523 = aString48.length() * -1734720461;
			} else if (local132 == 105 && anInt1525 * 1439733989 > 0) {
				anInt1525 -= -738892563;
				Class313.method27479(-860532210);
				anInt1523 = aString48.length() * -1734720461;
			} else if (Class702.method37108(local136, 2120620890) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString48 = aString48.substring(0, anInt1523 * -187541765) + client.anInterface63Array2[local24].method14074(1605250435) + aString48.substring(anInt1523 * -187541765);
				anInt1523 += -1734720461;
			}
		}
		client.anInt3444 = 0;
		client.anInt3446 = 0;
		Class138_Sub1.method10718((byte) 25);
	}

	@OriginalMember(owner = "client!ak", name = "ar", descriptor = "(Lclient!di;)V")
	static void method13908(@OriginalArg(0) Class102 arg0) {
		if (Class380.method28557((byte) 73) && Class155.method15057(965328794)) {
			Class550.method31318(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, -2109825698);
		}
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, anInt1527 * 1338436645 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt1528 * -1660817591);
		@Pc(55) int local55;
		if (anInt1522 * -2043909027 > 0) {
			local55 = 346 - anInt1528 * -1660817591 - 4;
			@Pc(67) int local67 = local43 * local55 / (local43 + anInt1522 * -2043909027 - 1);
			@Pc(69) int local69 = 4;
			if (anInt1522 * -2043909027 > 1) {
				local69 += (anInt1522 * -2043909027 - 1 - anInt1524 * -868725591) * (local55 - local67) / (anInt1522 * -2043909027 - 1);
			}
			arg0.method20722(Class80_Sub1_Sub1.anInt254 * -255202897 - 16, local69, 12, local67, anInt1527 * 1338436645 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt1524 * -868725591; local118 < anInt1524 * -868725591 + local43 && local118 < anInt1522 * -2043909027; local118++) {
				@Pc(137) String[] local137 = Class313.method27482(aStringArray16[local118], '\b', 2036747717);
				@Pc(148) int local148 = (Class80_Sub1_Sub1.anInt254 * -255202897 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20986(local160, 0, local148 + local160 - 8, 350);
					Class709.aClass104_26.method7655(Class343.method27946(local137[local150], (byte) 54), local160, 350 - anInt1521 * 353598737 - 2 - Class689.aClass15_13.anInt46 * -191270971 - anInt1528 * -1660817591 * (local118 - anInt1524 * -868725591), -1, -16777216, -1922490858);
				}
			}
		}
		Class108.aClass104_22.method7629("910 1", Class80_Sub1_Sub1.anInt254 * -255202897 - 25, 330, -1, -16777216, 1420239254);
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20893(0, 350 - anInt1521 * 353598737, Class80_Sub1_Sub1.anInt254 * -255202897, -1, -1622049179);
		Class8.aClass104_1.method7655("--> " + Class343.method27946(aString48, (byte) 103), 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 1, -1, -16777216, -1111052260);
		if (Class597.focus) {
			local55 = -1;
			if (client.currentCycle % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20719(Class375.aClass15_9.method373("--> " + Class343.method27946(aString48, (byte) 92).substring(0, anInt1523 * -187541765), -723633113) + 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 11, 12, local55, (byte) -79);
		}
		arg0.method20877();
		Class333.method27800((short) -6998);
	}

	@OriginalMember(owner = "client!ak", name = "au", descriptor = "(Lclient!di;)V")
	static void method13909(@OriginalArg(0) Class102 arg0) {
		if (Class380.method28557((byte) 69) && Class155.method15057(790799705)) {
			Class550.method31318(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, -1537316728);
		}
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350, anInt1527 * 1338436645 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt1528 * -1660817591);
		@Pc(55) int local55;
		if (anInt1522 * -2043909027 > 0) {
			local55 = 346 - anInt1528 * -1660817591 - 4;
			@Pc(67) int local67 = local43 * local55 / (local43 + anInt1522 * -2043909027 - 1);
			@Pc(69) int local69 = 4;
			if (anInt1522 * -2043909027 > 1) {
				local69 += (anInt1522 * -2043909027 - 1 - anInt1524 * -868725591) * (local55 - local67) / (anInt1522 * -2043909027 - 1);
			}
			arg0.method20722(Class80_Sub1_Sub1.anInt254 * -255202897 - 16, local69, 12, local67, anInt1527 * 1338436645 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt1524 * -868725591; local118 < anInt1524 * -868725591 + local43 && local118 < anInt1522 * -2043909027; local118++) {
				@Pc(137) String[] local137 = Class313.method27482(aStringArray16[local118], '\b', 2036747717);
				@Pc(148) int local148 = (Class80_Sub1_Sub1.anInt254 * -255202897 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20986(local160, 0, local148 + local160 - 8, 350);
					Class709.aClass104_26.method7655(Class343.method27946(local137[local150], (byte) 104), local160, 350 - anInt1521 * 353598737 - 2 - Class689.aClass15_13.anInt46 * -191270971 - anInt1528 * -1660817591 * (local118 - anInt1524 * -868725591), -1, -16777216, -1776687693);
				}
			}
		}
		Class108.aClass104_22.method7629("910 1", Class80_Sub1_Sub1.anInt254 * -255202897 - 25, 330, -1, -16777216, 1954699568);
		arg0.method20986(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, 350);
		arg0.method20893(0, 350 - anInt1521 * 353598737, Class80_Sub1_Sub1.anInt254 * -255202897, -1, -1875948601);
		Class8.aClass104_1.method7655("--> " + Class343.method27946(aString48, (byte) 34), 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 1, -1, -16777216, -1345030074);
		if (Class597.focus) {
			local55 = -1;
			if (client.currentCycle % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20719(Class375.aClass15_9.method373("--> " + Class343.method27946(aString48, (byte) 95).substring(0, anInt1523 * -187541765), -527633528) + 10, 350 - Class375.aClass15_9.anInt46 * -191270971 - 11, 12, local55, (byte) -69);
		}
		arg0.method20877();
		Class333.method27800((short) 6900);
	}

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "()V")
	static void method13910() {
		if (!Class240.method26225(-281032023)) {
			return;
		}
		if (aStringArray16 == null) {
			Class579.method31811(65280);
		}
		aBoolean355 = true;
		anInt1527 = 0;
	}

	@OriginalMember(owner = "client!ak", name = "ao", descriptor = "()Z")
	static boolean method13911() {
		return aBoolean355;
	}

	@OriginalMember(owner = "client!ak", name = "br", descriptor = "()V")
	static void method13912() {
	}

	@OriginalMember(owner = "client!ak", name = "as", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method13913(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ak", name = "bl", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method13914(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ak", name = "bg", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method13915(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ak", name = "bn", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method13916(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class294.method26961("commands - This command", 1455295997);
				Class294.method26961("cls - Clear console", 1455295997);
				Class294.method26961("displayfps - Toggle FPS and other information", 1455295997);
				Class294.method26961("renderer - Print graphics renderer information", 1455295997);
				Class294.method26961("heap - Print java memory information", 1455295997);
				Class294.method26961("getcamerapos - Print location and direction of camera for use in bug reports", 1455295997);
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt1522 = 0;
				anInt1524 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean715 = !client.aBoolean715;
				if (client.aBoolean715) {
					Class294.method26961("FPS on", 1455295997);
				} else {
					Class294.method26961("FPS off", 1455295997);
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class203 local62 = Class279.aClass102_9.method20656();
				Class294.method26961("Toolkit ID: " + Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1354825029), 1455295997);
				Class294.method26961("Vendor: " + local62.anInt3384 * 1548391145, 1455295997);
				Class294.method26961("Name: " + local62.aString125, 1455295997);
				Class294.method26961("Version: " + local62.anInt3380 * -1713511153, 1455295997);
				Class294.method26961("Device: " + local62.aString126, 1455295997);
				Class294.method26961("Driver Version: " + local62.aLong341 * 5566305393711832135L, 1455295997);
				local139 = Class279.aClass102_9.method21048();
				if (local139.length() > 0) {
					Class294.method26961(local139, 1455295997);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class294.method26961("Heap: " + Class554.anInt3423 * -2024030715 + "MB", 1455295997);
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class626 local173 = client.aClass539_1.method30893((byte) -6);
				if (Class368.anInt4502 * -1583611537 == 3) {
					@Pc(182) Class463 local182 = BufferedSocket.aClass121_Sub1_2.method9608(-1764923429);
					@Pc(186) Class463 local186 = BufferedSocket.aClass121_Sub1_2.method9668(-1788696937);
					Class294.method26961("Pos: " + (new Class626(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (int) local182.aFloat297 >> 9, (int) local182.aFloat296 >> 9)).toString() + " Height: " + (Class439.method29150((int) local182.aFloat297 - (local173.anInt5540 * -390642507 << 9), (int) local182.aFloat296 - (local173.anInt5537 * -894305615 << 9), Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) + (int) local182.aFloat295), 1455295997);
					Class294.method26961("Look: " + (new Class626(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (int) local186.aFloat297 >> 9, (int) local186.aFloat296 >> 9)).toString() + " Height: " + (Class439.method29150((int) local186.aFloat297 - (local173.anInt5540 * -390642507 << 9), (int) local182.aFloat296 - (local173.anInt5537 * -894305615 << 9), Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) + (int) local182.aFloat295), 1455295997);
				} else {
					Class294.method26961("Pos: " + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + "," + ((Class89.anInt319 * 1749751025 >> 9) + local173.anInt5540 * -390642507 >> 6) + "," + ((Class102_Sub2.anInt653 * 1132703631 >> 9) + local173.anInt5537 * -894305615 >> 6) + "," + ((Class89.anInt319 * 1749751025 >> 9) + local173.anInt5540 * -390642507 & 0x3F) + "," + (local173.anInt5537 * -894305615 + (Class102_Sub2.anInt653 * 1132703631 >> 9) & 0x3F) + " Height: " + (Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) - Class283.anInt3937 * -1465520451), 1455295997);
					Class294.method26961("Look: " + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + "," + (local173.anInt5540 * -390642507 + Class606.anInt5395 * 1992380359 >> 6) + "," + (local173.anInt5537 * -894305615 + Class62.anInt214 * 1356155403 >> 6) + "," + (local173.anInt5540 * -390642507 + Class606.anInt5395 * 1992380359 & 0x3F) + "," + (Class62.anInt214 * 1356155403 + local173.anInt5537 * -894305615 & 0x3F) + " Height: " + (Class439.method29150(Class606.anInt5395 * 1992380359, Class62.anInt214 * 1356155403, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) - Class203.anInt3387 * 1729023179), 1455295997);
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class294.method26961(Class60.aClass60_2.method1180(Class512.aClass719_3, 744267467), 1455295997);
			return;
		}
		if (Class566.aClass697_1 != Class697.aClass697_4 || client.anInt3512 * -780671365 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class126.method20383(1, -1, -1, false, 1615516245);
					if (Class17.method437(-1349690784) == 1) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class126.method20383(2, -1, -1, false, 1615516245);
					if (Class17.method437(-1349690784) == 2) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (Class13.aBoolean5 && arg0.equalsIgnoreCase("wm3")) {
					Class126.method20383(3, 1024, 768, false, 1615516245);
					if (Class17.method437(-1349690784) == 3) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				@Pc(570) Class80_Sub31 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3433 * 1994758437 != 4) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class595.method31975(local139, local568, 1724393573);
					Class294.method26961("Success", 1455295997);
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class528.method30719(0, false, -1123008764);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1467230633) == 0) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 51);
						Class719.method37291(-951122081);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class528.method30719(1, false, 877370085);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1596366760) == 1) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 1, (byte) 38);
						Class719.method37291(622973809);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class528.method30719(3, false, -87456386);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(860979160) == 3) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 3, (byte) 103);
						Class719.method37291(-469137408);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class528.method30719(5, false, 978486429);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1191684250) == 5) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 5, (byte) 97);
						Class719.method37291(1146128307);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3433 * 1994758437 == 18) {
						Class588.method31903((byte) 1);
					} else if (client.anInt3433 * 1994758437 == 3) {
						client.aClass75_1.aBoolean35 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class75[] local776 = client.aClass75Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class75 local786 = local776[local778];
						if (local786.method1321((byte) 2) != null) {
							local786.method1321((byte) 2).method15550((byte) 0);
						}
					}
					client.js5NetQueue.method10774(1982385993);
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class294.method26961("varpbit=" + Class672.aClass134_1.method36978(Class672.aClass134_1.method28381(local568, -1482607674), (byte) -86), 1455295997);
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class294.method26961("varp=" + Class672.aClass134_1.method36980(Class672.aClass134_1.method28382(Class143.aClass143_71, local568, 1211766523), 390036989), 1455295997);
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = Class313.method27482(arg0.substring(12), ' ', 2036747717);
					if (local865.length == 2 || local865.length == 3) {
						if (Class353.method28071(1176250876)) {
							Class488.method30213(-1836834665);
						}
						Class60.method1183(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true, (byte) 4);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = Class313.method27482(arg0.substring(8), ' ', 2036747717);
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class129_Sub2_Sub1.method20293(local778, local923, true, 1819407822);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class303.currentTimeMillis((byte) 124) + ".log");
						if (local940.exists()) {
							Class294.method26961("file already exists!", 1455295997);
							return;
						}
					}
					if (Class677.aFileOutputStream1 != null) {
						Class677.aFileOutputStream1.close();
						Class677.aFileOutputStream1 = null;
					}
					try {
						Class677.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(982) FileNotFoundException local982) {
						Class294.method26961("Could not create " + local940.getName(), 1455295997);
						return;
					} catch (@Pc(995) SecurityException local995) {
						Class294.method26961("Cannot write to " + local940.getName(), 1455295997);
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class677.aFileOutputStream1 != null) {
						Class677.aFileOutputStream1.close();
					}
					Class677.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class294.method26961("No such file", 1455295997);
						return;
					}
					@Pc(1042) byte[] local1042 = Class480.method30006(local940, 838503778);
					if (local1042 == null) {
						Class294.method26961("Failed to read file", 1455295997);
						return;
					}
					@Pc(1060) String[] local1060 = Class313.method27482(Class165_Sub8.method15979(Class69.method1252(local1042, -1391852887), '\r', "", (byte) -47), '\n', 2036747717);
					Class301.method27038(local1060, 1695930849);
				}
				if (client.anInt3433 * 1994758437 == 18 || client.anInt3433 * 1994758437 == 13) {
					@Pc(1076) Class75 local1076 = Class52.method1074(16777215);
					local570 = Class623.method32440(Class443.aClass443_106, local1076.aClass22_1, -191270971);
					local570.aPacketBit_2.p1(arg0.length() + 3);
					local570.aPacketBit_2.p1(arg1 ? 1 : 0);
					local570.aPacketBit_2.p1(arg2 ? 1 : 0);
					local570.aPacketBit_2.pjstr(arg0);
					local1076.method1325(local570, (byte) -89);
				}
			} catch (@Pc(1119) Exception local1119) {
				Class294.method26961(Class60.aClass60_2.method1180(Class512.aClass719_3, 1462298618), 1455295997);
				return;
			}
		}
		if (client.anInt3433 * 1994758437 != 18 && client.anInt3433 * 1994758437 != 13) {
			Class294.method26961(Class60.aClass60_71.method1180(Class512.aClass719_3, -694553513) + arg0, 1455295997);
		}
	}

	@OriginalMember(owner = "client!ak", name = "ba", descriptor = "(I)V")
	static void method13917(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class645.method33044(1896589581);
				} else if (arg0 == 11) {
					Class294.method26961("" + Class554.anInt3413 * -1936589983, 1455295997);
				} else if (arg0 == 24) {
					@Pc(43) Class600 local43 = client.aClass539_1.method30932(-1638462787).aClass600_1;
					local43.aBoolean928 = !local43.aBoolean928;
				} else if (arg0 == 25) {
					client.aBoolean715 = true;
				} else if (arg0 == 21) {
					client.aBoolean715 = false;
				} else if (arg0 == 10) {
					client.aClass5_8.method89(247487052);
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class637.method32872(1791782290);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class294.method26961("" + local95, 1455295997);
					} else if (arg0 == 20) {
						Class637.method32872(-1574092588);
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class294.method26961("" + local95, 1455295997);
						Class378.method28538(1396721951);
						Class637.method32872(1743602440);
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class294.method26961("" + local95, 1455295997);
					} else if (arg0 == 9) {
						Class294.method26961(Class373.aClass586_1.method31856(-1663393774) ? "Success" : "Failure", 1455295997);
					} else if (arg0 == 23) {
						Class47.aClass28_6.method656((byte) -107);
					} else if (arg0 == 14) {
						client.js5NetQueue.close((byte) -1);
					} else if (arg0 == 6) {
						client.js5NetQueue.method10772(2122207974);
					} else if (arg0 == 26) {
						Class454.canvas.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class454.canvas.setLocation(Class554.anInt3415 * 317681859, Class554.anInt3417 * -1044003729);
					} else if (arg0 == 4) {
						Class354.method28084(-2104219484);
					} else if (arg0 == 17) {
						client.aClass539_1.aLong392 = Class303.currentTimeMillis((byte) 14) * -6950858845886169907L;
						client.aClass539_1.aBoolean894 = true;
						Class354.method28084(-2072963966);
					} else {
						@Pc(254) Class463 local254;
						if (arg0 == 19) {
							local254 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
							Class294.method26961(((int) local254.aFloat297 >> 9) + " " + ((int) local254.aFloat296 >> 9), 1455295997);
						} else if (arg0 == 16) {
							local254 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
							Class294.method26961("" + client.aClass539_1.method30932(-1638462787).aClass100Array1[Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99].method2917((int) local254.aFloat297 >> 9, (int) local254.aFloat296 >> 9, -580462509), 1455295997);
						} else if (arg0 == 27) {
							Class294.method26961(Class327.aClass243_75.method26257((byte) 3) + " " + Class327.aClass243_75.method26279((byte) 0), 1455295997);
							Class294.method26961(Class327.aClass243_78.method26257((byte) 16) + " " + Class327.aClass243_78.method26279((byte) 0), 1455295997);
						} else if (arg0 == 8) {
							Class92.method1877(false, -1564696358);
						} else if (arg0 == 13) {
							client.aBoolean738 = !client.aBoolean738;
							Class279.aClass102_9.method20795(client.aBoolean738);
							Class624.method32446(608361989);
							return;
						} else if (arg0 == 1) {
							client.anInt3448 = 0;
							client.aClass539_1.method30938(495443854);
						} else if (arg0 == 3) {
							client.anInt3448 = 1432281405;
							client.aClass539_1.method30938(2137940663);
						} else if (arg0 == 15) {
							client.anInt3448 = -1430404486;
							client.aClass539_1.method30938(1578092538);
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class294.method26961(Class60.aClass60_2.method1180(Class512.aClass719_3, -808872835), 1455295997);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "bt", descriptor = "()V")
	static void method13918() {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(2014845865) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(1530154025);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!ak", name = "bs", descriptor = "()V")
	static void method13919() {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1868161945) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(380613421);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!ak", name = "bj", descriptor = "()V")
	static void method13920() {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1612826226) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(927999841);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!ak", name = "ak", descriptor = "()V")
	static void method13921() {
		if (anInt1525 * 1439733989 <= 0) {
			aString48 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < aStringArray16.length; local7++) {
			if (aStringArray16[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt1525 * 1439733989) {
					aString48 = aStringArray16[local7].substring(aStringArray16[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "bk", descriptor = "()V")
	static void method13922() {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1883065414) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(1785382011);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!ak", name = "ajn", descriptor = "(Lclient!yp;S)V")
	static void method13923(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		Class101.method2983(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -475643421);
	}

	@OriginalMember(owner = "client!ak", name = "asb", descriptor = "(Lclient!yp;I)V")
	static void method13924(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(17) int local17 = Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) -14);
		if (local12 != local17) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub27_3, local12, (byte) 12);
			Class719.method37291(1778352218);
			client.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "ee", descriptor = "(Lclient!yp;B)V")
	static void method13925(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class348.method27988(local11, local14, arg0, (byte) 64);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	Class149() throws Throwable {
		throw new Error();
	}
}
