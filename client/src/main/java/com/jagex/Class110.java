package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public abstract class Class110 {

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
	public final int anInt2820;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "(Lclient!alw;)Lclient!ew;")
	static Class110 method20149(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(7) Class89 local7 = Class271.method26399(local3, (byte) 10);
		@Pc(9) Class110 local9 = null;
		switch(local7.anInt291 * -380728599) {
			case 0:
				local9 = new Class110_Sub12(arg0);
				break;
			case 1:
				local9 = new Class110_Sub3(arg0);
				break;
			case 2:
				local9 = new Class110_Sub1(arg0);
				break;
			case 3:
				local9 = new Class110_Sub23(arg0);
				break;
			case 4:
				local9 = new Class110_Sub22(arg0, true);
				break;
			case 5:
				local9 = new Class110_Sub16(arg0);
				break;
			case 6:
				local9 = new Class110_Sub17(arg0);
			case 7:
			case 17:
			case 18:
			default:
				break;
			case 8:
				local9 = new Class110_Sub7(arg0);
				break;
			case 9:
				local9 = new Class110_Sub2(arg0);
				break;
			case 10:
				local9 = new Class110_Sub11(arg0, 1, 1);
				break;
			case 11:
				local9 = new Class110_Sub10(arg0);
				break;
			case 12:
				local9 = new Class110_Sub14(arg0);
				break;
			case 13:
				local9 = new Class110_Sub13(arg0);
				break;
			case 14:
				local9 = new Class110_Sub9(arg0);
				break;
			case 15:
				local9 = new Class110_Sub11(arg0, 0, 0);
				break;
			case 16:
				local9 = new Class110_Sub22(arg0, false);
				break;
			case 19:
				local9 = new Class110_Sub18(arg0);
				break;
			case 20:
				local9 = new Class110_Sub21(arg0);
				break;
			case 21:
				local9 = new Class110_Sub20(arg0);
				break;
			case 22:
				local9 = new Class110_Sub19(arg0);
				break;
			case 23:
				local9 = new Class110_Sub4(arg0);
				break;
			case 24:
				local9 = new Class110_Sub15_Sub1(arg0);
				break;
			case 25:
				local9 = new Class110_Sub6(arg0);
				break;
			case 26:
				local9 = new Class110_Sub11(arg0, 0, 1);
				break;
			case 27:
				local9 = new Class110_Sub11(arg0, 1, 0);
				break;
			case 28:
				local9 = new Class110_Sub15_Sub2(arg0);
				break;
			case 29:
				local9 = new Class110_Sub8(arg0);
				break;
			case 30:
				local9 = new Class110_Sub5(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "(Lclient!ahm;B)V")
	static void method20157(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 instanceof Class132_Sub1_Sub1_Sub1_Sub1) {
			@Pc(5) Class132_Sub1_Sub1_Sub1_Sub1 local5 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass336_1 != null) {
				Class660.method33002(local5, local5.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1025965340);
			}
		} else if (arg0 instanceof Class132_Sub1_Sub1_Sub1_Sub2) {
			@Pc(27) Class132_Sub1_Sub1_Sub1_Sub2 local27 = (Class132_Sub1_Sub1_Sub1_Sub2) arg0;
			Class282.method26560(local27, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local27.aByte100, 1176685425);
		}
	}

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "(Ljava/lang/String;ILjava/lang/String;S)Z")
	public static boolean method20158(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) short arg3) {
		if (arg1 == 0) {
			try {
				if (!Class564.aString237.startsWith("win")) {
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
				@Pc(80) Object local80 = Class70.method1230(Class564.anApplet3, arg2, new Object[] { (new URL(Class564.anApplet3.getCodeBase(), arg0)).toString() }, -1732239815);
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				Class564.anApplet3.getAppletContext().showDocument(new URL(Class564.anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class70.method1239(Class564.anApplet3, "loggedout", 1648660558);
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				Class564.anApplet3.getAppletContext().showDocument(new URL(Class564.anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ew", name = "acm", descriptor = "(Lclient!yf;B)V")
	static void method20159(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26713((byte) 61);
	}

	@OriginalMember(owner = "client!ew", name = "hs", descriptor = "(I)V")
	static void method20160(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class585 local5 = client.aClass532_1.method30640(-1073906249);
		for (@Pc(7) int local7 = 0; local7 < client.aClass532_1.method30625(365725241); local7++) {
			for (@Pc(14) int local14 = 0; local14 < client.aClass532_1.method30655((short) 128); local14++) {
				if (Class539.method31064(local5.aClass572ArrayArrayArray3, local1, local7, local14, true, -2129976726)) {
					local1++;
				}
				if (local1 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "at", descriptor = "(B)V")
	public static void method20161(@OriginalArg(0) byte arg0) {
		Class115.anImage3 = null;
		Class68.aFont1 = null;
	}

	@OriginalMember(owner = "client!ew", name = "atj", descriptor = "(Lclient!yf;I)V")
	static void method20162(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub17_1.method15725(443078958);
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt2820 = arg0.method22427(-1434290800) * -488460739;
	}

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "(I)V")
	public abstract void method20150(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "(I)Z")
	boolean method20151(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "()V")
	public abstract void method20152();

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "()Z")
	boolean method20153() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "()Z")
	boolean method20154() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "()V")
	void method20155() {
	}

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "(I)V")
	void method20156(@OriginalArg(0) int arg0) {
	}
}
