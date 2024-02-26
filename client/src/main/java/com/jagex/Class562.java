package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@OriginalClass("client!sw")
public final class Class562 {

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
	public static final int anInt5192 = 1;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	static final int anInt5193 = 0;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	static final int anInt5194 = 2;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	static final int anInt5195 = 3;

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet3 = null;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "Ljava/lang/String;")
	static String aString224 = null;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31428(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString224 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31429(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class498.method30361(arg0, arg1, "openjs", (byte) 64);
	}

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method31430(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class162_Sub1.method15721(arg0, arg1, "openjs", arg2, (byte) 110);
	}

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31431(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString224 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31432(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString224 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method31433(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class162_Sub1.method15721(arg0, arg1, "openjs", arg2, (byte) 56);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method31434(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class333.method27807(arg0, 3, -214682127);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString224.startsWith("win") && !arg3) {
			Class333.method27807(arg0, 0, -214682127);
			return;
		}
		if (aString224.startsWith("mac")) {
			Class498.method30361(arg0, 1, arg2, (byte) 12);
			return;
		}
		Class333.method27807(arg0, 2, -214682127);
	}

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method31435(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class333.method27807(arg0, 3, -214682127);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString224.startsWith("win") && !arg3) {
			Class333.method27807(arg0, 0, -214682127);
			return;
		}
		if (aString224.startsWith("mac")) {
			Class498.method30361(arg0, 1, arg2, (byte) 81);
			return;
		}
		Class333.method27807(arg0, 2, -214682127);
	}

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method31436(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class333.method27807(arg0, 3, -214682127);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString224.startsWith("win") && !arg3) {
			Class333.method27807(arg0, 0, -214682127);
			return;
		}
		if (aString224.startsWith("mac")) {
			Class498.method30361(arg0, 1, arg2, (byte) 70);
			return;
		}
		Class333.method27807(arg0, 2, -214682127);
	}

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method31437(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class333.method27807(arg0, 3, -214682127);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString224.startsWith("win") && !arg3) {
			Class333.method27807(arg0, 0, -214682127);
			return;
		}
		if (aString224.startsWith("mac")) {
			Class498.method30361(arg0, 1, arg2, (byte) 35);
			return;
		}
		Class333.method27807(arg0, 2, -214682127);
	}

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31438(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class498.method30361(arg0, arg1, "openjs", (byte) 75);
	}

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31439(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class498.method30361(arg0, arg1, "openjs", (byte) 87);
	}

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method31440(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString224.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class64.method1220(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() }, (byte) 20);
				return local81 != null;
			} catch (@Pc(89) Throwable local89) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(107) Exception local107) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class64.method1221(anApplet3, "loggedout", 20937170);
			} catch (@Pc(119) Throwable local119) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(132) Exception local132) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method31441(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString224.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class64.method1220(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() }, (byte) 12);
				return local81 != null;
			} catch (@Pc(89) Throwable local89) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(107) Exception local107) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class64.method1221(anApplet3, "loggedout", 20937170);
			} catch (@Pc(119) Throwable local119) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(132) Exception local132) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sw", name = "bec", descriptor = "(Lclient!yp;I)V")
	static void method31442(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class448.aClass341_1.method27931(local13, -590376138);
	}

	@OriginalMember(owner = "client!sw", name = "aag", descriptor = "(Lclient!yp;I)V")
	static void method31443(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aClass676Array1[local12].aString238;
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		}
	}

	@OriginalMember(owner = "client!sw", name = "il", descriptor = "(Lclient!ahb;IIII)V")
	static void method31444(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class621 local3 = arg0.method18952((byte) -12);
		@Pc(6) Class6_Sub3 local6 = arg0.aClass6_Sub3_3;
		@Pc(19) int local19 = arg0.anInt2701 * 1702368425 - arg0.aClass372_8.anInt4506 * 1783746791 & 0x3FFF;
		if (arg1 == Class712.aClass712_4.aByte165) {
			if (local19 == 0 && arg0.anInt2696 * 1308241607 <= 25) {
				if (!local6.aBoolean429 || !local3.method32325(local6.method23582(1429175190), (byte) 127)) {
					local6.method23603(local3.method32324(-595586809), false, true, (byte) -38);
					local6.aBoolean429 = local6.method23590(-499060808);
				}
			} else if (arg3 < 0 && local3.anInt5451 * 1140346477 != -1) {
				local6.method23603(local3.anInt5451 * 1140346477, false, true, (byte) -23);
				local6.aBoolean429 = false;
			} else if (arg3 > 0 && local3.anInt5440 * 1213728801 != -1) {
				local6.method23603(local3.anInt5440 * 1213728801, false, true, (byte) 4);
				local6.aBoolean429 = false;
			} else if (!local6.aBoolean429 || !local3.method32325(local6.method23582(1658491159), (byte) 118)) {
				local6.method23603(local3.method32324(-1807759477), false, true, (byte) 24);
				local6.aBoolean429 = arg0.aClass6_Sub3_3.method23590(-499060808);
			}
		} else if (arg0.anInt2683 * 1232799883 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(146) int local146 = client.anIntArray310[arg2] - arg0.aClass372_8.anInt4506 * 1783746791 & 0x3FFF;
			if (Class712.aClass712_5.aByte165 == arg1 && local3.anInt5445 * 228988343 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5448 * 1960834245 != -1) {
					local6.method23603(local3.anInt5448 * 1960834245, false, true, (byte) -19);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5458 * 929486699 != -1) {
					local6.method23603(local3.anInt5458 * 929486699, false, true, (byte) 14);
				} else if (local146 <= 6144 || local146 >= 10240 || -457826299 * local3.anInt5437 == -1) {
					local6.method23603(local3.anInt5445 * 228988343, false, true, (byte) 52);
				} else {
					local6.method23603(local3.anInt5437 * -457826299, false, true, (byte) -83);
				}
			} else if (arg1 == Class712.aClass712_1.aByte165 && -1435917229 * local3.anInt5449 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5463 * 1578952449 != -1) {
					local6.method23603(local3.anInt5463 * 1578952449, false, true, (byte) -18);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5446 * -1532002241 != -1) {
					local6.method23603(local3.anInt5446 * -1532002241, false, true, (byte) -29);
				} else if (local146 <= 6144 || local146 >= 10240 || -1567148933 * local3.anInt5450 == -1) {
					local6.method23603(local3.anInt5449 * -1435917229, false, true, (byte) -60);
				} else {
					local6.method23603(local3.anInt5450 * -1567148933, false, true, (byte) 15);
				}
			} else if (local146 > 2048 && local146 <= 6144 && -1339727717 * local3.anInt5436 != -1) {
				local6.method23603(local3.anInt5436 * -1339727717, false, true, (byte) 11);
			} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5447 * 1704340955 != -1) {
				local6.method23603(local3.anInt5447 * 1704340955, false, true, (byte) -47);
			} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5442 * -1509618251 == -1) {
				local6.method23603(local3.anInt5441 * -1875703887, false, true, (byte) -48);
			} else {
				local6.method23603(local3.anInt5442 * -1509618251, false, true, (byte) -41);
			}
			local6.aBoolean429 = false;
		} else if (local19 == 0 && arg0.anInt2696 * 1308241607 <= 25) {
			if (arg1 == Class712.aClass712_5.aByte165 && local3.anInt5445 * 228988343 != -1) {
				local6.method23603(local3.anInt5445 * 228988343, false, true, (byte) -42);
			} else if (arg1 == Class712.aClass712_1.aByte165 && -1435917229 * local3.anInt5449 != -1) {
				local6.method23603(local3.anInt5449 * -1435917229, false, true, (byte) -7);
			} else {
				local6.method23603(local3.anInt5441 * -1875703887, false, true, (byte) 15);
			}
			local6.aBoolean429 = false;
		} else {
			if (Class712.aClass712_5.aByte165 == arg1 && local3.anInt5445 * 228988343 != -1) {
				if (arg3 < 0 && local3.anInt5454 * 1804716759 != -1) {
					local6.method23603(local3.anInt5454 * 1804716759, false, true, (byte) 16);
				} else if (arg3 <= 0 || local3.anInt5455 * 694974951 == -1) {
					local6.method23603(local3.anInt5445 * 228988343, false, true, (byte) 80);
				} else {
					local6.method23603(local3.anInt5455 * 694974951, false, true, (byte) 43);
				}
			} else if (arg1 == Class712.aClass712_1.aByte165 && local3.anInt5449 * -1435917229 != -1) {
				if (arg3 < 0 && local3.anInt5452 * 712102831 != -1) {
					local6.method23603(local3.anInt5452 * 712102831, false, true, (byte) 1);
				} else if (arg3 <= 0 || local3.anInt5453 * -570597577 == -1) {
					local6.method23603(local3.anInt5449 * -1435917229, false, true, (byte) -122);
				} else {
					local6.method23603(local3.anInt5453 * -570597577, false, true, (byte) -58);
				}
			} else if (arg3 < 0 && local3.anInt5456 * 429948787 != -1) {
				local6.method23603(local3.anInt5456 * 429948787, false, true, (byte) -62);
			} else if (arg3 <= 0 || local3.anInt5457 * -1860031019 == -1) {
				local6.method23603(local3.anInt5441 * -1875703887, false, true, (byte) -65);
			} else {
				local6.method23603(local3.anInt5457 * -1860031019, false, true, (byte) -26);
			}
			local6.aBoolean429 = false;
		}
	}

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	Class562() throws Throwable {
		throw new Error();
	}
}
