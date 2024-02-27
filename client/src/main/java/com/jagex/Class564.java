package com.jagex;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sx")
public final class Class564 {

	@OriginalMember(owner = "client!sx", name = "m", descriptor = "I")
	static final int anInt5539 = 0;

	@OriginalMember(owner = "client!sx", name = "k", descriptor = "I")
	public static final int anInt5540 = 1;

	@OriginalMember(owner = "client!sx", name = "f", descriptor = "I")
	static final int anInt5541 = 2;

	@OriginalMember(owner = "client!sx", name = "w", descriptor = "I")
	static final int anInt5542 = 3;

	@OriginalMember(owner = "client!sx", name = "ar", descriptor = "Ljava/io/File;")
	static File aFile4;

	@OriginalMember(owner = "client!sx", name = "e", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet3 = null;

	@OriginalMember(owner = "client!sx", name = "n", descriptor = "Ljava/lang/String;")
	static String aString237 = null;

	@OriginalMember(owner = "client!sx", name = "c", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method31397(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class349.method27718(arg0, 3, -1497248091);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString237.startsWith("win") && !arg3) {
			Class349.method27718(arg0, 0, -1497248091);
			return;
		}
		if (aString237.startsWith("mac")) {
			Class110.method20158(arg0, 1, arg2, (short) 23126);
			return;
		}
		Class349.method27718(arg0, 2, -1497248091);
	}

	@OriginalMember(owner = "client!sx", name = "v", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31398(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class110.method20158(arg0, arg1, "openjs", (short) 24387);
	}

	@OriginalMember(owner = "client!sx", name = "u", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31399(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString237 = arg1;
	}

	@OriginalMember(owner = "client!sx", name = "w", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31400(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString237 = arg1;
	}

	@OriginalMember(owner = "client!sx", name = "o", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method31401(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString237.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class70.method1230(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() }, -1679822922);
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class70.method1239(anApplet3, "loggedout", 1828387600);
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sx", name = "p", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method31402(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class453.method29145(arg0, arg1, "openjs", arg2, (byte) 65);
	}

	@OriginalMember(owner = "client!sx", name = "d", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method31403(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class453.method29145(arg0, arg1, "openjs", arg2, (byte) 51);
	}

	@OriginalMember(owner = "client!sx", name = "z", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method31404(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class453.method29145(arg0, arg1, "openjs", arg2, (byte) 56);
	}

	@OriginalMember(owner = "client!sx", name = "r", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31405(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class110.method20158(arg0, arg1, "openjs", (short) 25088);
	}

	@OriginalMember(owner = "client!sx", name = "l", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method31406(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString237 = arg1;
	}

	@OriginalMember(owner = "client!sx", name = "s", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method31407(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString237.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class70.method1230(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() }, -1688556018);
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class70.method1239(anApplet3, "loggedout", 2093402773);
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sx", name = "afd", descriptor = "(Lclient!yf;I)V")
	static void method31408(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class657.method32937(local13, (byte) 89);
	}

	@OriginalMember(owner = "client!sx", name = "aqw", descriptor = "(Lclient!yf;S)V")
	static void method31409(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!sx", name = "arb", descriptor = "(Lclient!yf;B)V")
	static void method31410(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4903 * 1424285035;
	}

	@OriginalMember(owner = "client!sx", name = "ef", descriptor = "(Lclient!yf;I)V")
	static void method31411(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class336.method27542(local11, local14, arg0, (short) 14);
	}

	@OriginalMember(owner = "client!sx", name = "axs", descriptor = "(Lclient!yf;B)V")
	static void method31412(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class334.method27496(6, local13, local23, "", (short) 25879);
	}

	@OriginalMember(owner = "client!sx", name = "f", descriptor = "(I)V")
	static void method31413(@OriginalArg(0) int arg0) {
		if (Class168.aFileOutputStream1 != null) {
			try {
				Class168.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Class168.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!sx", name = "<init>", descriptor = "()V")
	Class564() throws Throwable {
		throw new Error();
	}
}
