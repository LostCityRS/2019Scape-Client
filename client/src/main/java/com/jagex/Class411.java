package com.jagex;

import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class411 {

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	static final int anInt4713 = 211;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	static int target;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!ax;")
	static Class175 connection;

	@OriginalMember(owner = "client!m", name = "ai", descriptor = "I")
	static final int anInt4715 = 204;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "J")
	static long aLong269;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
	static int[] currentIsaacKey;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "[I")
	static int[] anIntArray442;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	static final int anInt4716 = 4;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	static final int anInt4717 = 7;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	static final int anInt4718 = 14;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	static final int anInt4719 = 35;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "I")
	static final int anInt4722 = 64;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	static final int anInt4723 = 70;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	static final int anInt4724 = 84;

	@OriginalMember(owner = "client!m", name = "ag", descriptor = "I")
	static final int anInt4725 = 160;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	static final int anInt4726 = 103;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	static final int anInt4727 = 110;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	static final int anInt4728 = 126;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	static final int anInt4729 = 138;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	static final int anInt4730 = 98;

	@OriginalMember(owner = "client!m", name = "ae", descriptor = "I")
	static final int anInt4731 = 157;

	@OriginalMember(owner = "client!m", name = "ar", descriptor = "I")
	static final int anInt4732 = 276;

	@OriginalMember(owner = "client!m", name = "al", descriptor = "I")
	static final int anInt4733 = 188;

	@OriginalMember(owner = "client!m", name = "ac", descriptor = "I")
	static final int anInt4734 = 194;

	@OriginalMember(owner = "client!m", name = "as", descriptor = "I")
	static final int anInt4735 = 225;

	@OriginalMember(owner = "client!m", name = "aw", descriptor = "I")
	static final int anInt4736 = 215;

	@OriginalMember(owner = "client!m", name = "ah", descriptor = "I")
	static final int anInt4737 = 170;

	@OriginalMember(owner = "client!m", name = "at", descriptor = "I")
	static final int anInt4738 = 235;

	@OriginalMember(owner = "client!m", name = "am", descriptor = "I")
	static final int anInt4740 = 256;

	@OriginalMember(owner = "client!m", name = "au", descriptor = "I")
	static final int anInt4741 = 268;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	static final int anInt4743 = 141;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	static final int anInt4745 = 58;

	@OriginalMember(owner = "client!m", name = "ad", descriptor = "I")
	static final int anInt4747 = 245;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	static final int anInt4753 = 132;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	static final int anInt4756 = 40;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
	static boolean aBoolean750 = false;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Z")
	static boolean socialNetworkLogin = false;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	static int anInt4746 = -48143567;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "J")
	static long ssoKeyIdentifier = -7033311592096984251L;

	@OriginalMember(owner = "client!m", name = "ap", descriptor = "I")
	static int step = -522138941;

	@OriginalMember(owner = "client!m", name = "aq", descriptor = "J")
	static long ssoKey = 0L;

	@OriginalMember(owner = "client!m", name = "ax", descriptor = "Ljava/lang/String;")
	public static String username = "";

	@OriginalMember(owner = "client!m", name = "av", descriptor = "Ljava/lang/String;")
	public static String aString201 = "";

	@OriginalMember(owner = "client!m", name = "ao", descriptor = "Ljava/lang/String;")
	static String aString199 = "";

	@OriginalMember(owner = "client!m", name = "aj", descriptor = "Z")
	static boolean aBoolean751 = true;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	static int waitingTime = 0;

	@OriginalMember(owner = "client!m", name = "az", descriptor = "I")
	static int anInt4748 = 0;

	@OriginalMember(owner = "client!m", name = "an", descriptor = "I")
	public static int enterLobbyReply = 1954204370;

	@OriginalMember(owner = "client!m", name = "bf", descriptor = "I")
	public static int enterGameReply = -898365362;

	@OriginalMember(owner = "client!m", name = "bl", descriptor = "I")
	public static int anInt4744 = -741595822;

	@OriginalMember(owner = "client!m", name = "bk", descriptor = "I")
	public static int anInt4752 = 384687293;

	@OriginalMember(owner = "client!m", name = "bh", descriptor = "I")
	public static int anInt4720 = 318517279;

	@OriginalMember(owner = "client!m", name = "bx", descriptor = "I")
	public static int hopTime = 0;

	@OriginalMember(owner = "client!m", name = "bd", descriptor = "I")
	public static int disallowTrigger = -156824051;

	@OriginalMember(owner = "client!m", name = "bc", descriptor = "I")
	public static int disallowResult = -1109601241;

	@OriginalMember(owner = "client!m", name = "bi", descriptor = "I")
	public static int queuePosition = 0;

	@OriginalMember(owner = "client!m", name = "bn", descriptor = "Z")
	static boolean aBoolean752 = false;

	@OriginalMember(owner = "client!m", name = "bt", descriptor = "I")
	public static int banDuration = 0;

	@OriginalMember(owner = "client!m", name = "bq", descriptor = "Z")
	static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)[Lclient!wo;", line = 17)
	public static Class642[] method28596(@OriginalArg(0) byte arg0) {
		return new Class642[] { Class642.aClass642_2, Class642.aClass642_6, Class642.aClass642_5, Class642.aClass642_4, Class642.aClass642_1, Class642.aClass642_3 };
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 113)
	Class411() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!m", name = "aw", descriptor = "()Z", line = 118)
	static boolean method28597() {
		return anInt4746 * 276097583 == -1 ? Class666.method32902(username, aString201, -869588093) : Class529.method30400(-1373744230);
	}

	@OriginalMember(owner = "client!m", name = "as", descriptor = "()Z", line = 118)
	static boolean method28598() {
		return anInt4746 * 276097583 == -1 ? Class666.method32902(username, aString201, -869588093) : Class529.method30400(-1373744230);
	}

	@OriginalMember(owner = "client!m", name = "at", descriptor = "()Z", line = 118)
	static boolean method28599() {
		return anInt4746 * 276097583 == -1 ? Class666.method32902(username, aString201, -869588093) : Class529.method30400(-1373744230);
	}

	@OriginalMember(owner = "client!m", name = "ad", descriptor = "()Z", line = 118)
	static boolean method28600() {
		return anInt4746 * 276097583 == -1 ? Class666.method32902(username, aString201, -869588093) : Class529.method30400(-1373744230);
	}

	@OriginalMember(owner = "client!m", name = "am", descriptor = "()Z", line = 123)
	static boolean method28601() {
		return anInt4746 * 276097583 == -1 ? Class93_Sub3.method11813(username, aString201, (byte) 30) : Class219.method25511(-186290399);
	}

	@OriginalMember(owner = "client!m", name = "au", descriptor = "()V", line = 128)
	public static final void method28602() {
		step = -522138941;
		enterGameReply = -898365362;
		enterLobbyReply = 1954204370;
	}

	@OriginalMember(owner = "client!m", name = "ar", descriptor = "()V", line = 128)
	public static final void method28603() {
		step = -522138941;
		enterGameReply = -898365362;
		enterLobbyReply = 1954204370;
	}

	@OriginalMember(owner = "client!m", name = "ap", descriptor = "()V", line = 134)
	static final void method28604() {
		ssoKeyIdentifier = -7033311592096984251L;
		ssoKey = 0L;
		anInt4746 = -48143567;
	}

	@OriginalMember(owner = "client!m", name = "aq", descriptor = "()V", line = 140)
	public static final void method28605() {
		if (step * 327612781 != 7) {
			connection.close((byte) 113);
			Class594.method31724(1567251984);
			Class680.method33240(872736820);
		}
	}

	@OriginalMember(owner = "client!m", name = "ax", descriptor = "()V", line = 140)
	public static final void method28606() {
		if (step * 327612781 != 7) {
			connection.close((byte) 14);
			Class594.method31724(1449946845);
			Class680.method33240(-2012311139);
		}
	}

	@OriginalMember(owner = "client!m", name = "av", descriptor = "()V", line = 140)
	public static final void method28607() {
		if (step * 327612781 != 7) {
			connection.close((byte) 93);
			Class594.method31724(1375319112);
			Class680.method33240(-1228147234);
		}
	}

	@OriginalMember(owner = "client!m", name = "ao", descriptor = "()Z", line = 148)
	public static final boolean method28608() {
		return step * 327612781 != 7;
	}

	@OriginalMember(owner = "client!m", name = "aj", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 157)
	public static void method28609(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-1986287363)) {
			return;
		}
		Class358.method27775((byte) 0);
		username = arg0;
		aString201 = arg1;
		aString199 = arg2;
		aBoolean751 = arg3;
		Class481.setState(7, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "ay", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 157)
	public static void method28610(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-554210605)) {
			return;
		}
		Class358.method27775((byte) 0);
		username = arg0;
		aString201 = arg1;
		aString199 = arg2;
		aBoolean751 = arg3;
		Class481.setState(7, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "(ILjava/lang/String;Z)V", line = 168)
	public static void method28611(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class146_Sub2.method11709(-691914046)) {
			return;
		}
		if (anInt4746 * 276097583 != arg0) {
			ssoKeyIdentifier = -7033311592096984251L;
		}
		anInt4746 = arg0 * 48143567;
		aString199 = arg1;
		aBoolean751 = arg2;
		Class481.setState(7, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "aa", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 177)
	public static void method28612(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-809931839)) {
			return;
		}
		client.aClass175_1.close((byte) 44);
		Class358.method27775((byte) 0);
		username = arg0;
		aString201 = arg1;
		aString199 = arg2;
		aBoolean751 = arg3;
		Class481.setState(17, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "az", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 177)
	public static void method28613(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-1633378350)) {
			return;
		}
		client.aClass175_1.close((byte) 68);
		Class358.method27775((byte) 0);
		username = arg0;
		aString201 = arg1;
		aString199 = arg2;
		aBoolean751 = arg3;
		Class481.setState(17, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "af", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 177)
	public static void method28614(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709(-574746105)) {
			return;
		}
		client.aClass175_1.close((byte) 11);
		Class358.method27775((byte) 0);
		username = arg0;
		aString201 = arg1;
		aString199 = arg2;
		aBoolean751 = arg3;
		Class481.setState(17, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "ak", descriptor = "(ILjava/lang/String;Z)V", line = 189)
	public static void method28615(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class146_Sub2.method11709(-1603396298)) {
			return;
		}
		if (arg0 != anInt4746 * 276097583) {
			ssoKeyIdentifier = -7033311592096984251L;
		}
		anInt4746 = arg0 * 48143567;
		aString199 = arg1;
		aBoolean751 = arg2;
		client.aClass175_1.close((byte) 35);
		Class481.setState(17, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "an", descriptor = "(ILjava/lang/String;Z)V", line = 189)
	public static void method28616(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class146_Sub2.method11709(-97502728)) {
			return;
		}
		if (arg0 != anInt4746 * 276097583) {
			ssoKeyIdentifier = -7033311592096984251L;
		}
		anInt4746 = arg0 * 48143567;
		aString199 = arg1;
		aBoolean751 = arg2;
		client.aClass175_1.close((byte) 25);
		Class481.setState(17, 1823202236);
	}

	@OriginalMember(owner = "client!m", name = "bk", descriptor = "(Ljava/lang/String;Z)V", line = 199)
	public static void method28617(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (13 == client.state * -849002901 && (!Class251.method25969(1425925707) && !Class631.method32280(754734614))) {
			aString199 = arg0;
			aBoolean751 = arg1;
			Class481.setState(15, 1823202236);
		}
	}

	@OriginalMember(owner = "client!m", name = "bf", descriptor = "(Ljava/lang/String;Z)V", line = 199)
	public static void method28618(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (13 == client.state * -849002901 && (!Class251.method25969(-1775059386) && !Class631.method32280(-1149172101))) {
			aString199 = arg0;
			aBoolean751 = arg1;
			Class481.setState(15, 1823202236);
		}
	}

	@OriginalMember(owner = "client!m", name = "bl", descriptor = "(Ljava/lang/String;Z)V", line = 199)
	public static void method28619(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (13 == client.state * -849002901 && (!Class251.method25969(183840923) && !Class631.method32280(-1431691111))) {
			aString199 = arg0;
			aBoolean751 = arg1;
			Class481.setState(15, 1823202236);
		}
	}

	@OriginalMember(owner = "client!m", name = "bh", descriptor = "()V", line = 207)
	static void method28620() {
		aString199 = "";
		aString201 = "";
		username = "";
		aBoolean751 = true;
	}

	@OriginalMember(owner = "client!m", name = "bx", descriptor = "()V", line = 207)
	static void method28621() {
		aString199 = "";
		aString201 = "";
		username = "";
		aBoolean751 = true;
	}

	@OriginalMember(owner = "client!m", name = "bd", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 214)
	static boolean method28622(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		target = 1757895756;
		connection = client.aClass175_1;
		return Class507.method30229(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!m", name = "bc", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 214)
	static boolean method28623(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		target = 1757895756;
		connection = client.aClass175_1;
		return Class507.method30229(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!m", name = "bi", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 220)
	static boolean method28624(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		target = -1680223351;
		connection = client.aClass175_2;
		return Class507.method30229(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!m", name = "bn", descriptor = "()Z", line = 226)
	static boolean method28625() {
		target = -1680223351;
		connection = client.aClass175_2;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "bt", descriptor = "()Z", line = 226)
	static boolean method28626() {
		target = -1680223351;
		connection = client.aClass175_2;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "bq", descriptor = "()Z", line = 226)
	static boolean method28627() {
		target = -1680223351;
		connection = client.aClass175_2;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "bm", descriptor = "()Z", line = 232)
	static boolean method28628() {
		target = 1757895756;
		connection = client.aClass175_1;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "()Z", line = 232)
	static boolean method28629() {
		target = 1757895756;
		connection = client.aClass175_1;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "be", descriptor = "()Z", line = 232)
	static boolean method28630() {
		target = 1757895756;
		connection = client.aClass175_1;
		return Class507.method30229(ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!m", name = "bu", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 238)
	static boolean method28631(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		socialNetworkLogin = arg0;
		if (!arg1) {
			anInt4746 = -48143567;
		}
		aBoolean750 = arg1;
		username = arg2;
		aString201 = arg3;
		ssoKeyIdentifier = arg4 * 7033311592096984251L;
		if (!aBoolean750 && (username.equals("") || aString201.equals(""))) {
			Class114.setReply(3, -1242673418);
			Class680.method33240(-1632456649);
			return false;
		}
		if (target * -1128337797 != 132) {
			hopTime = 0;
			disallowResult = -1109601241;
			disallowTrigger = -156824051;
		}
		connection.aBoolean564 = false;
		Class114.setReply(-3, -1541703534);
		step = -1044277882;
		waitingTime = 0;
		anInt4748 = 0;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "bo", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 238)
	static boolean method28632(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		socialNetworkLogin = arg0;
		if (!arg1) {
			anInt4746 = -48143567;
		}
		aBoolean750 = arg1;
		username = arg2;
		aString201 = arg3;
		ssoKeyIdentifier = arg4 * 7033311592096984251L;
		if (!aBoolean750 && (username.equals("") || aString201.equals(""))) {
			Class114.setReply(3, -1907051022);
			Class680.method33240(949090393);
			return false;
		}
		if (target * -1128337797 != 132) {
			hopTime = 0;
			disallowResult = -1109601241;
			disallowTrigger = -156824051;
		}
		connection.aBoolean564 = false;
		Class114.setReply(-3, -1410162461);
		step = -1044277882;
		waitingTime = 0;
		anInt4748 = 0;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "by", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 238)
	static boolean method28633(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		socialNetworkLogin = arg0;
		if (!arg1) {
			anInt4746 = -48143567;
		}
		aBoolean750 = arg1;
		username = arg2;
		aString201 = arg3;
		ssoKeyIdentifier = arg4 * 7033311592096984251L;
		if (!aBoolean750 && (username.equals("") || aString201.equals(""))) {
			Class114.setReply(3, -1347873223);
			Class680.method33240(1455067224);
			return false;
		}
		if (target * -1128337797 != 132) {
			hopTime = 0;
			disallowResult = -1109601241;
			disallowTrigger = -156824051;
		}
		connection.aBoolean564 = false;
		Class114.setReply(-3, -993323623);
		step = -1044277882;
		waitingTime = 0;
		anInt4748 = 0;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "bw", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 238)
	static boolean method28634(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		socialNetworkLogin = arg0;
		if (!arg1) {
			anInt4746 = -48143567;
		}
		aBoolean750 = arg1;
		username = arg2;
		aString201 = arg3;
		ssoKeyIdentifier = arg4 * 7033311592096984251L;
		if (!aBoolean750 && (username.equals("") || aString201.equals(""))) {
			Class114.setReply(3, 1666353404);
			Class680.method33240(-728686370);
			return false;
		}
		if (target * -1128337797 != 132) {
			hopTime = 0;
			disallowResult = -1109601241;
			disallowTrigger = -156824051;
		}
		connection.aBoolean564 = false;
		Class114.setReply(-3, -1963058667);
		step = -1044277882;
		waitingTime = 0;
		anInt4748 = 0;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "br", descriptor = "()V", line = 263)
	static final void method28635() {
		if (step * 327612781 == 7 || step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (anInt4748 * 558401221 == 0 && step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (socialNetworkLogin && step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (target * -1128337797 == 211 && step * 327612781 != 215 && enterGameReply * 1486673001 != 42 || target * -1128337797 == 132 && enterLobbyReply * 914785575 != 49 && enterLobbyReply * 914785575 != 52) {
				waitingTime += -498616603;
			}
			if (waitingTime * -803989779 > local22) {
				connection.close((byte) 20);
				if (anInt4748 * 558401221 >= 3) {
					step = -522138941;
					Class114.setReply(-5, -1335113702);
					Class680.method33240(-91760378);
					return;
				}
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -23829);
				} else {
					Class50.lobby.cycleSettings((short) -7646);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (step * 327612781 == 14) {
				if (target * -1128337797 == 211) {
					connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) 9937), Class50.world.host, 2126602668);
				} else {
					connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) 15395), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(205329143);
					client.secureRandomProvider.method13974(-1953386694);
					client.secureRandomProvider = null;
				}
				connection.clear(1405580326);
				local160 = Class720.createLoginMessage((byte) -10);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) -22);
				connection.send(local160, -2140302700);
				connection.flush((byte) 122);
				step = 1684272591;
			}
			@Pc(210) int local210;
			if (step * 327612781 == 35) {
				if (!connection.getStream((byte) 4).available(9, 1940586171)) {
					return;
				}
				connection.getStream((byte) -88).read(connection.packet.data, 0, 9, (byte) -76);
				connection.packet.pos = 0;
				local210 = connection.packet.g1((short) 16384);
				if (local210 != 0) {
					step = -522138941;
					Class543.method30944(local210, (byte) 1);
					Class114.setReply(local210, 74809822);
					connection.close((byte) 10);
					Class680.method33240(414531576);
					return;
				}
				aLong269 = connection.packet.g8(-726450921) * -4112723527472146283L;
				connection.packet.pos = 0;
				if (socialNetworkLogin) {
					step = -339489564;
				} else {
					step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) 44);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -17);
				local160.packet.p2(0, 2130110979);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) 50);
				local160.packet.p4(1, (byte) -28);
				if (target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -36);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 97);
				Class709.writeTotp(local301, (long) (anInt4746 * 276097583));
				Class413.totpTokenKey = (long) anInt4746 * -1187630733921575941L;
				local301.p1(anInt4746 * 276097583, (byte) -89);
				local301.p1(Class106.lang.getId(), (byte) -92);
				local301.p4(client.affiliate * -1765120027, (byte) -23);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) 58);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) -45);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -43);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -24);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, -63339574);
				connection.send(local160, -1664794532);
				connection.flush((byte) 51);
				step = 697749448;
			}
			if (step * 327612781 == 40) {
				if (!connection.getStream((byte) -92).available(2, 1215009309)) {
					return;
				}
				connection.getStream((byte) -51).read(connection.packet.data, 0, 2, (byte) -107);
				connection.packet.pos = 0;
				connection.packet.pos = connection.packet.g2(-1434290800) * -1445626955;
				step = 582239970;
			}
			if (step * 327612781 == 58) {
				if (!connection.getStream((byte) -22).available(connection.packet.pos * 212851357, -220890652)) {
					return;
				}
				connection.getStream((byte) -34).read(connection.packet.data, 0, connection.packet.pos * 212851357, (byte) -81);
				connection.packet.tinydec(currentIsaacKey, 2142315036);
				connection.packet.pos = 0;
				@Pc(479) String local479 = connection.packet.gjstr2(2017397937);
				connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -39);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 120);
				step = 1975392576;
			}
			if (step * 327612781 == 64) {
				if (!connection.getStream((byte) 97).available(1, 1370424412)) {
					return;
				}
				connection.getStream((byte) 90).read(connection.packet.data, 0, 1, (byte) -111);
				if ((connection.packet.data[0] & 0xFF) == 1) {
					step = -926422114;
				}
			}
			if (step * 327612781 == 70) {
				if (!connection.getStream((byte) 17).available(16, 632928492)) {
					return;
				}
				connection.getStream((byte) 105).read(connection.packet.data, 0, 16, (byte) -9);
				connection.packet.pos = -1655194800;
				connection.packet.tinydec(currentIsaacKey, 1292899086);
				connection.packet.pos = 0;
				ssoKeyIdentifier = connection.packet.g8(1619160306) * 7033311592096984251L;
				ssoKey = connection.packet.g8(-1813494330) * 5236525202755218899L;
				step = -1970699996;
			}
			if (step * 327612781 == 84) {
				connection.packet.pos = 0;
				connection.clear(718197644);
				local160 = Class720.createLoginMessage((byte) -18);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (target * -1128337797 == 211) {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -6);
					local601.p2(0, 2145985069);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) 59);
						local601.p4(1, (byte) 5);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) 0);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 14);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -6);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, 1455290528);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1604679728), (byte) -1);
					local601.p2(Class553.width * -1378711501, 2146486989);
					local601.p2(Class553.height * 2091353777, 2137612082);
					local601.p1(Class51.options.antialiasing.getValue(1328476121), (byte) -72);
					Class314.getUid192(local601, 1514460046);
					local601.pjstr(client.settings, -922482515);
					local601.p4(client.affiliate * -1765120027, (byte) 53);
					local663 = Class51.options.encode(-1337775429);
					local601.p1(local663.pos * 212851357, (byte) -24);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1351739776);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -74);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) 32);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) -84);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) 18);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) 6);
					local601.pjstr(Class454.aString210, 1147529802);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) -71);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, -470970877);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -71);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -80);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -47);
					local601.p4(client.anInt3434 * -1579845029, (byte) -7);
					local601.pjstr(client.clientToken, -945627032);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -47);
					local601.p2(Class50.lobby.id * 2142901097, 2132173071);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -126);
					local601.psize2(local601.pos * 212851357 - local331, -405431291);
				} else {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -81);
					local601.p2(0, 2140917089);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) -23);
						local601.p4(1, (byte) -1);
						local663 = Class168.createLoginPacket((byte) 28);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -10);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, -586134394);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) -39);
					local601.p1(Class106.lang.getId(), (byte) -25);
					local601.p1(Class255.getWindowMode(1839654411), (byte) -108);
					local601.p2(Class553.width * -1378711501, 2137121673);
					local601.p2(Class553.height * 2091353777, 2132822335);
					local601.p1(Class51.options.antialiasing.getValue(129296408), (byte) -88);
					Class314.getUid192(local601, 1882966841);
					local601.pjstr(client.settings, -236653487);
					local663 = Class51.options.encode(-135999741);
					local601.p1(local663.pos * 212851357, (byte) -8);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1898886675);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -3);
					local601.pjstr(Class454.aString210, 560075304);
					local601.p4(client.affiliate * -1765120027, (byte) -29);
					local601.p4(client.anInt3434 * -1579845029, (byte) -91);
					local601.pjstr(client.clientToken, -432604285);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -84);
					local601.pbool(false, -337945302);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -99);
					local601.psize2(local601.pos * 212851357 - local331, 535030164);
				}
				connection.send(local160, -1548779759);
				connection.flush((byte) 106);
				connection.clientIsaac = new IsaacRandom(currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = currentIsaacKey[local331] + 50;
				}
				connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				connection.packet.setRandom(connection.serverIsaac, (byte) -120);
				currentIsaacKey = null;
				step = 1279989418;
			}
			if (step * 327612781 == 98) {
				if (!connection.getStream((byte) 1).available(1, 275800622)) {
					return;
				}
				connection.getStream((byte) -56).read(connection.packet.data, 0, 1, (byte) -119);
				local210 = connection.packet.g1((short) 16384);
				connection.packet.pos = 0;
				if (local210 == 21) {
					step = -808566346;
				} else if (local210 == 1) {
					step = 293466275;
					Class114.setReply(local210, -1461996467);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = -1443868475;
				} else if (local210 == 2) {
					if (aBoolean753) {
						aBoolean753 = false;
						step = -1044277882;
						return;
					}
					if (target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(463654670);
						step = -688364288;
					} else {
						step = 526831521;
					}
				} else if (local210 == 15) {
					connection.length = 1705477074;
					step = 122548348;
				} else if (local210 == 23 && anInt4748 * 558401221 < 3) {
					waitingTime = 0;
					anInt4748 += 1751058445;
					step = -1044277882;
					connection.close((byte) 84);
					return;
				} else if (local210 == 42) {
					step = 529177811;
					Class114.setReply(local210, 287161561);
					return;
				} else if (target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, -1041089350);
					}
					return;
				} else if (!aBoolean750 || socialNetworkLogin || anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						step = -522138941;
						Class114.setReply(local210, -2122434823);
						connection.close((byte) 17);
						Class680.method33240(639510630);
						return;
					}
					step = -1094993751;
				} else {
					socialNetworkLogin = true;
					waitingTime = 0;
					step = -1044277882;
					connection.close((byte) 111);
					return;
				}
			}
			if (step * 327612781 == 126) {
				if (!connection.getStream((byte) 25).available(1, 895819109)) {
					return;
				}
				connection.getStream((byte) 50).read(connection.packet.data, 0, 1, (byte) -52);
				local210 = connection.packet.data[0] & 0xFF;
				hopTime = local210 * 1250766390;
				step = -522138941;
				Class114.setReply(21, 625805880);
				connection.close((byte) 111);
				Class680.method33240(805569136);
				return;
			}
			if (step * 327612781 == 215) {
				if (!connection.getStream((byte) -17).available(2, 1981697826)) {
					return;
				}
				connection.getStream((byte) 47).read(connection.packet.data, 0, 2, (byte) -78);
				queuePosition = (((connection.packet.data[0] & 0xFF) << 8) + (connection.packet.data[1] & 0xFF)) * 1980524355;
				step = 1279989418;
				return;
			}
			if (step * 327612781 == 245) {
				if (!connection.getStream((byte) 20).available(4, 474964458)) {
					return;
				}
				connection.getStream((byte) 66).read(connection.packet.data, 0, 4, (byte) -42);
				banDuration = connection.packet.g4(-118643075) * -1923297061;
				connection.packet.pos = 0;
				step = -522138941;
				Class114.setReply(53, -1871212729);
				connection.close((byte) 16);
				Class680.method33240(-2101627607);
				return;
			}
			if (step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!connection.getStream((byte) -73).available(1, -204888543)) {
						return;
					}
					connection.getStream((byte) 64).read(connection.packet.data, 0, 1, (byte) -113);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!connection.getStream((byte) -29).available(3, 121537520)) {
						return;
					}
					connection.getStream((byte) -9).read(connection.packet.data, 0, 3, (byte) -80);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
					disallowTrigger = (((connection.packet.data[1] & 0xFF) << 8) + (connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 739351219);
				connection.close((byte) 7);
				Class680.method33240(-412507795);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 7339);
					enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (step * 327612781 == 225) {
				if (!connection.getStream((byte) 87).available(2, 180067938)) {
					return;
				}
				connection.getStream((byte) -38).read(connection.packet.data, 0, 2, (byte) -28);
				connection.packet.pos = 0;
				Class629.urlLength = connection.packet.g2(-1434290800) * -430049679;
				connection.packet.pos = 0;
				step = 878052535;
				return;
			}
			if (step * 327612781 == 235) {
				if (!connection.getStream((byte) 15).available(Class629.urlLength * -2062087535, 66740887)) {
					return;
				}
				connection.getStream((byte) -4).read(connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -20);
				connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, -1329483086);
				connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(1989991097);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -13);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -237790106);
				if (target * -1128337797 == 132 && client.state * -849002901 != 9) {
					step = 1279989418;
				} else {
					step = -522138941;
					connection.close((byte) 9);
					Class680.method33240(619365561);
				}
				return;
			}
			if (step * 327612781 == 256) {
				if (!connection.getStream((byte) -29).available(2, 1438650660)) {
					return;
				}
				connection.getStream((byte) 97).read(connection.packet.data, 0, 2, (byte) -45);
				connection.packet.pos = 0;
				connection.length = connection.packet.g2(-1434290800) * -852738537;
				step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (step * 327612781 == 268) {
				if (!connection.getStream((byte) -46).available(connection.length * 2010044839, 1713765743)) {
					return;
				}
				connection.getStream((byte) -30).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -2);
				connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (connection.packet.pos * 212851357 >= connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) 35);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -57);
							connection.send(local1887, -1970396985);
							connection.flush((byte) 74);
							step = 1977738866;
						} else {
							step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(connection.packet, (byte) 78);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 34);
				}
			}
			if (step * 327612781 == 138) {
				if (!connection.getStream((byte) 67).available(1, 1673715101)) {
					return;
				}
				connection.getStream((byte) 5).read(connection.packet.data, 0, 1, (byte) -126);
				local210 = connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						step = -522138941;
						Class114.setReply(local210, 572087675);
						connection.close((byte) 96);
						Class680.method33240(-385823675);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 3717);
							enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = 2095594634;
					return;
				}
				step = 526831521;
			}
			if (step * 327612781 == 141) {
				if (!connection.getStream((byte) -37).available(1, 63284318)) {
					return;
				}
				connection.getStream((byte) 54).read(connection.packet.data, 0, 1, (byte) -93);
				Class566.anInt5385 = (connection.packet.data[0] & 0xFF) * 252135035;
				step = -53062159;
			}
			@Pc(2027) PacketBit local2027;
			if (step * 327612781 == 157) {
				local2027 = connection.packet;
				if (target * -1128337797 == 211) {
					if (!connection.getStream((byte) -20).available(Class566.anInt5385 * 1395370163, 655334467)) {
						return;
					}
					connection.getStream((byte) 22).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -112);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					client.userQuickChat4 = local2027.g1((short) 16384) == 1;
					client.selfPlayerSlot = local2027.g2(-1434290800) * -410368243;
					client.userMember = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					client.mapMember = local2027.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = local2027.gjstr(488655823);
					Class99.aLong23 = (local2027.g6(308111489) - Class305.method26797(505764969)) * -3359956914723456965L;
					client.world.method30496(702267568).setMembers(client.mapMember, -1210626241);
					Class392.aClass541_1.method30914(1585980332).method30496(943836065).setMembers(client.mapMember, 2073863666);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, 878152271);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, 919852100);
				} else if (connection.getStream((byte) -30).available(Class566.anInt5385 * 1395370163, 1508553670)) {
					connection.getStream((byte) 44).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -5);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) local2027.g1((short) 16384);
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					Class707.userMembershipTime = local2027.g8(-224731286) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(1835340706) - local2027.g5(1593356826)) * -3359956914723456965L;
					local271 = local2027.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = local2027.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = local2027.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = local2027.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = local2027.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = local2027.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = local2027.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = local2027.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = local2027.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = local2027.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = local2027.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = local2027.gjstr2(367435912);
					Class529.userMembersStats = local2027.g1((short) 16384) * -375509133;
					Class549.userPlayAge = local2027.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = local2027.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = local2027.gjstr2(-625376476);
					Class94.mapWorld.port1 = local2027.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = local2027.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -1660382503)) {
						Class667.autoWorld(-1322315237);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 1807013945);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1919242483);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2054345987);
				}
				if (target * -1128337797 != 211) {
					step = -522138941;
					Class114.setReply(2, 1987586406);
					Class163.method14911(535536790);
					Class481.setState(13, 1823202236);
					connection.serverPacketType = null;
					return;
				}
				step = 817951506;
			}
			if (step * 327612781 == 170) {
				if (!connection.getStream((byte) -22).available(3, 139790480)) {
					return;
				}
				connection.getStream((byte) -38).read(connection.packet.data, 0, 3, (byte) -41);
				step = 702442028;
			}
			if (step * 327612781 == 188) {
				local2027 = connection.packet;
				local2027.pos = 0;
				if (local2027.peekIsaacBit(1322991628)) {
					if (!connection.getStream((byte) -71).available(1, 1514231670)) {
						return;
					}
					connection.getStream((byte) -34).read(local2027.data, 3, 1, (byte) -44);
				}
				connection.serverPacketType = ServerProt.values(1770923865)[local2027.gIsaac1or2(-84212225)];
				connection.length = local2027.g2(-1434290800) * -852738537;
				step = -1503969504;
			}
			if (step * 327612781 == 160) {
				if (!connection.getStream((byte) -44).available(connection.length * 2010044839, 1200181201)) {
					return;
				}
				connection.getStream((byte) 33).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -44);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(2, -1474214764);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(connection.packet, -623569416);
				local271 = local210 - connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(connection.packet.data, connection.packet.pos * 212851357, local1890.data, 0, local271);
				connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), -64305052);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), -429002429);
				}
				if (local210 != connection.packet.pos * 212851357) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
			if (step * 327612781 == 204) {
				if (connection.length * 2010044839 == -2) {
					if (!connection.getStream((byte) -12).available(2, 2131520853)) {
						return;
					}
					connection.getStream((byte) -92).read(connection.packet.data, 0, 2, (byte) -25);
					connection.packet.pos = 0;
					connection.length = connection.packet.g2(-1434290800) * -852738537;
				}
				if (!connection.getStream((byte) 11).available(connection.length * 2010044839, 1729262441)) {
					return;
				}
				connection.getStream((byte) 32).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -20);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(15, -342446185);
				Class490.method29977((byte) 28);
				Class110_Sub5.method7654(connection.packet, -1920813449);
				if (connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			connection.close((byte) 31);
			if (anInt4748 * 558401221 < 3) {
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -30599);
				} else {
					Class50.lobby.cycleSettings((short) -17109);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			} else {
				step = -522138941;
				Class114.setReply(-4, 161422090);
				Class680.method33240(-1244351122);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "bz", descriptor = "()V", line = 263)
	static final void method28636() {
		if (step * 327612781 == 7 || step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (anInt4748 * 558401221 == 0 && step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (socialNetworkLogin && step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (target * -1128337797 == 211 && step * 327612781 != 215 && enterGameReply * 1486673001 != 42 || target * -1128337797 == 132 && enterLobbyReply * 914785575 != 49 && enterLobbyReply * 914785575 != 52) {
				waitingTime += -498616603;
			}
			if (waitingTime * -803989779 > local22) {
				connection.close((byte) 57);
				if (anInt4748 * 558401221 >= 3) {
					step = -522138941;
					Class114.setReply(-5, 1342290084);
					Class680.method33240(-867205411);
					return;
				}
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -11737);
				} else {
					Class50.lobby.cycleSettings((short) -19121);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (step * 327612781 == 14) {
				if (target * -1128337797 == 211) {
					connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) 17876), Class50.world.host, 2126602668);
				} else {
					connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) 30649), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(1827973910);
					client.secureRandomProvider.method13974(-1810494422);
					client.secureRandomProvider = null;
				}
				connection.clear(1624504302);
				local160 = Class720.createLoginMessage((byte) -14);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) -111);
				connection.send(local160, -2015134805);
				connection.flush((byte) 49);
				step = 1684272591;
			}
			@Pc(210) int local210;
			if (step * 327612781 == 35) {
				if (!connection.getStream((byte) 24).available(9, 833540132)) {
					return;
				}
				connection.getStream((byte) 37).read(connection.packet.data, 0, 9, (byte) -116);
				connection.packet.pos = 0;
				local210 = connection.packet.g1((short) 16384);
				if (local210 != 0) {
					step = -522138941;
					Class543.method30944(local210, (byte) -24);
					Class114.setReply(local210, -2097410584);
					connection.close((byte) 28);
					Class680.method33240(277489533);
					return;
				}
				aLong269 = connection.packet.g8(192352550) * -4112723527472146283L;
				connection.packet.pos = 0;
				if (socialNetworkLogin) {
					step = -339489564;
				} else {
					step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) 95);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -45);
				local160.packet.p2(0, 2126218759);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) -96);
				local160.packet.p4(1, (byte) -110);
				if (target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -60);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 24);
				Class709.writeTotp(local301, (long) (anInt4746 * 276097583));
				Class413.totpTokenKey = (long) anInt4746 * -1187630733921575941L;
				local301.p1(anInt4746 * 276097583, (byte) -44);
				local301.p1(Class106.lang.getId(), (byte) -107);
				local301.p4(client.affiliate * -1765120027, (byte) -43);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) 37);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) 2);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -2);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -74);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, -1249649309);
				connection.send(local160, -2034289293);
				connection.flush((byte) 58);
				step = 697749448;
			}
			if (step * 327612781 == 40) {
				if (!connection.getStream((byte) 50).available(2, 1187736819)) {
					return;
				}
				connection.getStream((byte) 27).read(connection.packet.data, 0, 2, (byte) -120);
				connection.packet.pos = 0;
				connection.packet.pos = connection.packet.g2(-1434290800) * -1445626955;
				step = 582239970;
			}
			if (step * 327612781 == 58) {
				if (!connection.getStream((byte) 1).available(connection.packet.pos * 212851357, -29334377)) {
					return;
				}
				connection.getStream((byte) 23).read(connection.packet.data, 0, connection.packet.pos * 212851357, (byte) -111);
				connection.packet.tinydec(currentIsaacKey, 780539809);
				connection.packet.pos = 0;
				@Pc(479) String local479 = connection.packet.gjstr2(-471543157);
				connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -126);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 126);
				step = 1975392576;
			}
			if (step * 327612781 == 64) {
				if (!connection.getStream((byte) 98).available(1, 1707126292)) {
					return;
				}
				connection.getStream((byte) -10).read(connection.packet.data, 0, 1, (byte) -97);
				if ((connection.packet.data[0] & 0xFF) == 1) {
					step = -926422114;
				}
			}
			if (step * 327612781 == 70) {
				if (!connection.getStream((byte) 85).available(16, 26921170)) {
					return;
				}
				connection.getStream((byte) 67).read(connection.packet.data, 0, 16, (byte) -96);
				connection.packet.pos = -1655194800;
				connection.packet.tinydec(currentIsaacKey, 846129496);
				connection.packet.pos = 0;
				ssoKeyIdentifier = connection.packet.g8(-618885964) * 7033311592096984251L;
				ssoKey = connection.packet.g8(-653126163) * 5236525202755218899L;
				step = -1970699996;
			}
			if (step * 327612781 == 84) {
				connection.packet.pos = 0;
				connection.clear(1765402660);
				local160 = Class720.createLoginMessage((byte) 96);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (target * -1128337797 == 211) {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -99);
					local601.p2(0, 2133170534);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) 1);
						local601.p4(1, (byte) 79);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -111);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 61);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -93);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, 273609232);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1321778933), (byte) -80);
					local601.p2(Class553.width * -1378711501, 2138237077);
					local601.p2(Class553.height * 2091353777, 2133899099);
					local601.p1(Class51.options.antialiasing.getValue(-868352467), (byte) -55);
					Class314.getUid192(local601, 1320010689);
					local601.pjstr(client.settings, -1641649542);
					local601.p4(client.affiliate * -1765120027, (byte) 82);
					local663 = Class51.options.encode(236350968);
					local601.p1(local663.pos * 212851357, (byte) -74);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1721700734);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -3);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) -46);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) -64);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) -76);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) -49);
					local601.pjstr(Class454.aString210, 801375960);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) -82);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, -444881782);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -103);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -127);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -54);
					local601.p4(client.anInt3434 * -1579845029, (byte) 46);
					local601.pjstr(client.clientToken, 1310426356);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -116);
					local601.p2(Class50.lobby.id * 2142901097, 2125391365);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -70);
					local601.psize2(local601.pos * 212851357 - local331, -1390282274);
				} else {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -98);
					local601.p2(0, 2135164325);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) -36);
						local601.p4(1, (byte) -2);
						local663 = Class168.createLoginPacket((byte) 127);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -128);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, 53161778);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) -50);
					local601.p1(Class106.lang.getId(), (byte) 1);
					local601.p1(Class255.getWindowMode(2006467588), (byte) -57);
					local601.p2(Class553.width * -1378711501, 2145871106);
					local601.p2(Class553.height * 2091353777, 2144350430);
					local601.p1(Class51.options.antialiasing.getValue(-2022705053), (byte) -66);
					Class314.getUid192(local601, 1171495747);
					local601.pjstr(client.settings, -273226115);
					local663 = Class51.options.encode(114198249);
					local601.p1(local663.pos * 212851357, (byte) -13);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1869367694);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) 10);
					local601.pjstr(Class454.aString210, 1544758878);
					local601.p4(client.affiliate * -1765120027, (byte) 29);
					local601.p4(client.anInt3434 * -1579845029, (byte) -47);
					local601.pjstr(client.clientToken, -1290482975);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -44);
					local601.pbool(false, 417919587);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -59);
					local601.psize2(local601.pos * 212851357 - local331, 2117464336);
				}
				connection.send(local160, -1649855606);
				connection.flush((byte) 24);
				connection.clientIsaac = new IsaacRandom(currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = currentIsaacKey[local331] + 50;
				}
				connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				connection.packet.setRandom(connection.serverIsaac, (byte) -124);
				currentIsaacKey = null;
				step = 1279989418;
			}
			if (step * 327612781 == 98) {
				if (!connection.getStream((byte) -89).available(1, 2124055151)) {
					return;
				}
				connection.getStream((byte) 21).read(connection.packet.data, 0, 1, (byte) -41);
				local210 = connection.packet.g1((short) 16384);
				connection.packet.pos = 0;
				if (local210 == 21) {
					step = -808566346;
				} else if (local210 == 1) {
					step = 293466275;
					Class114.setReply(local210, 2125214291);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = -1443868475;
				} else if (local210 == 2) {
					if (aBoolean753) {
						aBoolean753 = false;
						step = -1044277882;
						return;
					}
					if (target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(448264797);
						step = -688364288;
					} else {
						step = 526831521;
					}
				} else if (local210 == 15) {
					connection.length = 1705477074;
					step = 122548348;
				} else if (local210 == 23 && anInt4748 * 558401221 < 3) {
					waitingTime = 0;
					anInt4748 += 1751058445;
					step = -1044277882;
					connection.close((byte) 16);
					return;
				} else if (local210 == 42) {
					step = 529177811;
					Class114.setReply(local210, -1761013233);
					return;
				} else if (target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, -2095983353);
					}
					return;
				} else if (!aBoolean750 || socialNetworkLogin || anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						step = -522138941;
						Class114.setReply(local210, 2038034701);
						connection.close((byte) 123);
						Class680.method33240(-644571342);
						return;
					}
					step = -1094993751;
				} else {
					socialNetworkLogin = true;
					waitingTime = 0;
					step = -1044277882;
					connection.close((byte) 103);
					return;
				}
			}
			if (step * 327612781 == 126) {
				if (!connection.getStream((byte) -49).available(1, 1486938907)) {
					return;
				}
				connection.getStream((byte) 57).read(connection.packet.data, 0, 1, (byte) -127);
				local210 = connection.packet.data[0] & 0xFF;
				hopTime = local210 * 1250766390;
				step = -522138941;
				Class114.setReply(21, -1356756262);
				connection.close((byte) 99);
				Class680.method33240(1164725334);
				return;
			}
			if (step * 327612781 == 215) {
				if (!connection.getStream((byte) -8).available(2, 1900738267)) {
					return;
				}
				connection.getStream((byte) -97).read(connection.packet.data, 0, 2, (byte) -50);
				queuePosition = (((connection.packet.data[0] & 0xFF) << 8) + (connection.packet.data[1] & 0xFF)) * 1980524355;
				step = 1279989418;
				return;
			}
			if (step * 327612781 == 245) {
				if (!connection.getStream((byte) 92).available(4, 83259856)) {
					return;
				}
				connection.getStream((byte) 86).read(connection.packet.data, 0, 4, (byte) -58);
				banDuration = connection.packet.g4(-118643075) * -1923297061;
				connection.packet.pos = 0;
				step = -522138941;
				Class114.setReply(53, 418365751);
				connection.close((byte) 5);
				Class680.method33240(-110070345);
				return;
			}
			if (step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!connection.getStream((byte) 16).available(1, 868127604)) {
						return;
					}
					connection.getStream((byte) 84).read(connection.packet.data, 0, 1, (byte) -4);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!connection.getStream((byte) -63).available(3, 635506713)) {
						return;
					}
					connection.getStream((byte) -93).read(connection.packet.data, 0, 3, (byte) -18);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
					disallowTrigger = (((connection.packet.data[1] & 0xFF) << 8) + (connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 2071642701);
				connection.close((byte) 123);
				Class680.method33240(-633868966);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 15358);
					enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (step * 327612781 == 225) {
				if (!connection.getStream((byte) -5).available(2, 794941517)) {
					return;
				}
				connection.getStream((byte) -56).read(connection.packet.data, 0, 2, (byte) -93);
				connection.packet.pos = 0;
				Class629.urlLength = connection.packet.g2(-1434290800) * -430049679;
				connection.packet.pos = 0;
				step = 878052535;
				return;
			}
			if (step * 327612781 == 235) {
				if (!connection.getStream((byte) -83).available(Class629.urlLength * -2062087535, 739125661)) {
					return;
				}
				connection.getStream((byte) 38).read(connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -115);
				connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, 2110753549);
				connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(533027827);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -17);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -780281778);
				if (target * -1128337797 == 132 && client.state * -849002901 != 9) {
					step = 1279989418;
				} else {
					step = -522138941;
					connection.close((byte) 2);
					Class680.method33240(-24131565);
				}
				return;
			}
			if (step * 327612781 == 256) {
				if (!connection.getStream((byte) -26).available(2, -178871674)) {
					return;
				}
				connection.getStream((byte) 64).read(connection.packet.data, 0, 2, (byte) -107);
				connection.packet.pos = 0;
				connection.length = connection.packet.g2(-1434290800) * -852738537;
				step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (step * 327612781 == 268) {
				if (!connection.getStream((byte) -2).available(connection.length * 2010044839, 960834727)) {
					return;
				}
				connection.getStream((byte) 51).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -100);
				connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (connection.packet.pos * 212851357 >= connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) 1);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -46);
							connection.send(local1887, -2069774719);
							connection.flush((byte) 43);
							step = 1977738866;
						} else {
							step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(connection.packet, (byte) 46);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 41);
				}
			}
			if (step * 327612781 == 138) {
				if (!connection.getStream((byte) 27).available(1, -84763074)) {
					return;
				}
				connection.getStream((byte) -4).read(connection.packet.data, 0, 1, (byte) -86);
				local210 = connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						step = -522138941;
						Class114.setReply(local210, 670248853);
						connection.close((byte) 105);
						Class680.method33240(1615896596);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 28533);
							enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = 2095594634;
					return;
				}
				step = 526831521;
			}
			if (step * 327612781 == 141) {
				if (!connection.getStream((byte) 98).available(1, 696993832)) {
					return;
				}
				connection.getStream((byte) 9).read(connection.packet.data, 0, 1, (byte) -68);
				Class566.anInt5385 = (connection.packet.data[0] & 0xFF) * 252135035;
				step = -53062159;
			}
			@Pc(2027) PacketBit local2027;
			if (step * 327612781 == 157) {
				local2027 = connection.packet;
				if (target * -1128337797 == 211) {
					if (!connection.getStream((byte) -9).available(Class566.anInt5385 * 1395370163, 530447851)) {
						return;
					}
					connection.getStream((byte) -75).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -60);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					client.userQuickChat4 = local2027.g1((short) 16384) == 1;
					client.selfPlayerSlot = local2027.g2(-1434290800) * -410368243;
					client.userMember = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					client.mapMember = local2027.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = local2027.gjstr(1984492995);
					Class99.aLong23 = (local2027.g6(782303049) - Class305.method26797(1374344687)) * -3359956914723456965L;
					client.world.method30496(1362240786).setMembers(client.mapMember, 686193611);
					Class392.aClass541_1.method30914(1302548611).method30496(1679242950).setMembers(client.mapMember, -1490549311);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, 709924387);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, -1693395084);
				} else if (connection.getStream((byte) -28).available(Class566.anInt5385 * 1395370163, 2133275176)) {
					connection.getStream((byte) 50).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -102);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) local2027.g1((short) 16384);
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					Class707.userMembershipTime = local2027.g8(1763683396) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(155896178) - local2027.g5(1593356826)) * -3359956914723456965L;
					local271 = local2027.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = local2027.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = local2027.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = local2027.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = local2027.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = local2027.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = local2027.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = local2027.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = local2027.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = local2027.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = local2027.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = local2027.gjstr2(1506007327);
					Class529.userMembersStats = local2027.g1((short) 16384) * -375509133;
					Class549.userPlayAge = local2027.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = local2027.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = local2027.gjstr2(1504950339);
					Class94.mapWorld.port1 = local2027.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = local2027.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -854927006)) {
						Class667.autoWorld(-208069173);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 2016599136);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1705605268);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2136203767);
				}
				if (target * -1128337797 != 211) {
					step = -522138941;
					Class114.setReply(2, 991114576);
					Class163.method14911(234872302);
					Class481.setState(13, 1823202236);
					connection.serverPacketType = null;
					return;
				}
				step = 817951506;
			}
			if (step * 327612781 == 170) {
				if (!connection.getStream((byte) -50).available(3, 1593229653)) {
					return;
				}
				connection.getStream((byte) 59).read(connection.packet.data, 0, 3, (byte) -128);
				step = 702442028;
			}
			if (step * 327612781 == 188) {
				local2027 = connection.packet;
				local2027.pos = 0;
				if (local2027.peekIsaacBit(1707876972)) {
					if (!connection.getStream((byte) -100).available(1, 1631158058)) {
						return;
					}
					connection.getStream((byte) -5).read(local2027.data, 3, 1, (byte) -14);
				}
				connection.serverPacketType = ServerProt.values(2147348309)[local2027.gIsaac1or2(-1116653645)];
				connection.length = local2027.g2(-1434290800) * -852738537;
				step = -1503969504;
			}
			if (step * 327612781 == 160) {
				if (!connection.getStream((byte) -19).available(connection.length * 2010044839, 344395572)) {
					return;
				}
				connection.getStream((byte) 43).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -60);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(2, 1895125740);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(connection.packet, -892703872);
				local271 = local210 - connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(connection.packet.data, connection.packet.pos * 212851357, local1890.data, 0, local271);
				connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), 1811090838);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), -820371287);
				}
				if (local210 != connection.packet.pos * 212851357) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
			if (step * 327612781 == 204) {
				if (connection.length * 2010044839 == -2) {
					if (!connection.getStream((byte) -2).available(2, 812384013)) {
						return;
					}
					connection.getStream((byte) 5).read(connection.packet.data, 0, 2, (byte) -79);
					connection.packet.pos = 0;
					connection.length = connection.packet.g2(-1434290800) * -852738537;
				}
				if (!connection.getStream((byte) -81).available(connection.length * 2010044839, 89095996)) {
					return;
				}
				connection.getStream((byte) -21).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -9);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(15, -595675321);
				Class490.method29977((byte) 107);
				Class110_Sub5.method7654(connection.packet, -1543227077);
				if (connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			connection.close((byte) 3);
			if (anInt4748 * 558401221 < 3) {
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -2428);
				} else {
					Class50.lobby.cycleSettings((short) -17867);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			} else {
				step = -522138941;
				Class114.setReply(-4, -195095583);
				Class680.method33240(1998609803);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "bv", descriptor = "()V", line = 263)
	static final void method28637() {
		if (step * 327612781 == 7 || step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (anInt4748 * 558401221 == 0 && step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (socialNetworkLogin && step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (target * -1128337797 == 211 && step * 327612781 != 215 && enterGameReply * 1486673001 != 42 || target * -1128337797 == 132 && enterLobbyReply * 914785575 != 49 && enterLobbyReply * 914785575 != 52) {
				waitingTime += -498616603;
			}
			if (waitingTime * -803989779 > local22) {
				connection.close((byte) 9);
				if (anInt4748 * 558401221 >= 3) {
					step = -522138941;
					Class114.setReply(-5, -1160908517);
					Class680.method33240(1509148022);
					return;
				}
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -18895);
				} else {
					Class50.lobby.cycleSettings((short) -31519);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (step * 327612781 == 14) {
				if (target * -1128337797 == 211) {
					connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) 12228), Class50.world.host, 2126602668);
				} else {
					connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) 1727), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(-1901468141);
					client.secureRandomProvider.method13974(-1512425955);
					client.secureRandomProvider = null;
				}
				connection.clear(911676107);
				local160 = Class720.createLoginMessage((byte) 24);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) 1);
				connection.send(local160, -2124155529);
				connection.flush((byte) 47);
				step = 1684272591;
			}
			@Pc(210) int local210;
			if (step * 327612781 == 35) {
				if (!connection.getStream((byte) 37).available(9, 686213553)) {
					return;
				}
				connection.getStream((byte) -109).read(connection.packet.data, 0, 9, (byte) -120);
				connection.packet.pos = 0;
				local210 = connection.packet.g1((short) 16384);
				if (local210 != 0) {
					step = -522138941;
					Class543.method30944(local210, (byte) -9);
					Class114.setReply(local210, 1638711721);
					connection.close((byte) 48);
					Class680.method33240(-2039063602);
					return;
				}
				aLong269 = connection.packet.g8(777534496) * -4112723527472146283L;
				connection.packet.pos = 0;
				if (socialNetworkLogin) {
					step = -339489564;
				} else {
					step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) -15);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -37);
				local160.packet.p2(0, 2142998530);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) -3);
				local160.packet.p4(1, (byte) -27);
				if (target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -49);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 97);
				Class709.writeTotp(local301, (long) (anInt4746 * 276097583));
				Class413.totpTokenKey = (long) anInt4746 * -1187630733921575941L;
				local301.p1(anInt4746 * 276097583, (byte) -42);
				local301.p1(Class106.lang.getId(), (byte) -45);
				local301.p4(client.affiliate * -1765120027, (byte) -13);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) 43);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) -43);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -50);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -67);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, -1907948485);
				connection.send(local160, -1801568749);
				connection.flush((byte) 92);
				step = 697749448;
			}
			if (step * 327612781 == 40) {
				if (!connection.getStream((byte) -47).available(2, 1630997061)) {
					return;
				}
				connection.getStream((byte) 9).read(connection.packet.data, 0, 2, (byte) -102);
				connection.packet.pos = 0;
				connection.packet.pos = connection.packet.g2(-1434290800) * -1445626955;
				step = 582239970;
			}
			if (step * 327612781 == 58) {
				if (!connection.getStream((byte) -42).available(connection.packet.pos * 212851357, 1830341424)) {
					return;
				}
				connection.getStream((byte) -19).read(connection.packet.data, 0, connection.packet.pos * 212851357, (byte) -121);
				connection.packet.tinydec(currentIsaacKey, 286261915);
				connection.packet.pos = 0;
				@Pc(479) String local479 = connection.packet.gjstr2(1673858390);
				connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -101);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 82);
				step = 1975392576;
			}
			if (step * 327612781 == 64) {
				if (!connection.getStream((byte) 5).available(1, -267649317)) {
					return;
				}
				connection.getStream((byte) 106).read(connection.packet.data, 0, 1, (byte) -24);
				if ((connection.packet.data[0] & 0xFF) == 1) {
					step = -926422114;
				}
			}
			if (step * 327612781 == 70) {
				if (!connection.getStream((byte) 27).available(16, 1258360832)) {
					return;
				}
				connection.getStream((byte) 43).read(connection.packet.data, 0, 16, (byte) -22);
				connection.packet.pos = -1655194800;
				connection.packet.tinydec(currentIsaacKey, 1608604798);
				connection.packet.pos = 0;
				ssoKeyIdentifier = connection.packet.g8(-944998040) * 7033311592096984251L;
				ssoKey = connection.packet.g8(1283472641) * 5236525202755218899L;
				step = -1970699996;
			}
			if (step * 327612781 == 84) {
				connection.packet.pos = 0;
				connection.clear(-1157509155);
				local160 = Class720.createLoginMessage((byte) -35);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (target * -1128337797 == 211) {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -79);
					local601.p2(0, 2135149688);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) 87);
						local601.p4(1, (byte) -66);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -102);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 78);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -12);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, -228898859);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1325307061), (byte) 2);
					local601.p2(Class553.width * -1378711501, 2126575009);
					local601.p2(Class553.height * 2091353777, 2130017015);
					local601.p1(Class51.options.antialiasing.getValue(-2143116679), (byte) -39);
					Class314.getUid192(local601, 1527788470);
					local601.pjstr(client.settings, -1323706568);
					local601.p4(client.affiliate * -1765120027, (byte) 7);
					local663 = Class51.options.encode(-211687390);
					local601.p1(local663.pos * 212851357, (byte) -104);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1815744658);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -70);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) 80);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) -78);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) -3);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) -9);
					local601.pjstr(Class454.aString210, 438047756);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) 2);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, -1427813495);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -111);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -101);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -7);
					local601.p4(client.anInt3434 * -1579845029, (byte) -100);
					local601.pjstr(client.clientToken, -781898764);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -104);
					local601.p2(Class50.lobby.id * 2142901097, 2144548784);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -86);
					local601.psize2(local601.pos * 212851357 - local331, -1650833671);
				} else {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -114);
					local601.p2(0, 2131116375);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) -23);
						local601.p4(1, (byte) -2);
						local663 = Class168.createLoginPacket((byte) 55);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -19);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, -770204382);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) 4);
					local601.p1(Class106.lang.getId(), (byte) -1);
					local601.p1(Class255.getWindowMode(1671984455), (byte) -45);
					local601.p2(Class553.width * -1378711501, 2139519696);
					local601.p2(Class553.height * 2091353777, 2130791792);
					local601.p1(Class51.options.antialiasing.getValue(-1449332938), (byte) -46);
					Class314.getUid192(local601, 1170519260);
					local601.pjstr(client.settings, -986072115);
					local663 = Class51.options.encode(1914043705);
					local601.p1(local663.pos * 212851357, (byte) -66);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1264870270);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) 31);
					local601.pjstr(Class454.aString210, -24746522);
					local601.p4(client.affiliate * -1765120027, (byte) 28);
					local601.p4(client.anInt3434 * -1579845029, (byte) -14);
					local601.pjstr(client.clientToken, 1572258546);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -14);
					local601.pbool(false, -1642973613);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -111);
					local601.psize2(local601.pos * 212851357 - local331, 1401256913);
				}
				connection.send(local160, -2112007571);
				connection.flush((byte) 32);
				connection.clientIsaac = new IsaacRandom(currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = currentIsaacKey[local331] + 50;
				}
				connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				connection.packet.setRandom(connection.serverIsaac, (byte) -91);
				currentIsaacKey = null;
				step = 1279989418;
			}
			if (step * 327612781 == 98) {
				if (!connection.getStream((byte) 68).available(1, -174540895)) {
					return;
				}
				connection.getStream((byte) -41).read(connection.packet.data, 0, 1, (byte) -7);
				local210 = connection.packet.g1((short) 16384);
				connection.packet.pos = 0;
				if (local210 == 21) {
					step = -808566346;
				} else if (local210 == 1) {
					step = 293466275;
					Class114.setReply(local210, 653486689);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = -1443868475;
				} else if (local210 == 2) {
					if (aBoolean753) {
						aBoolean753 = false;
						step = -1044277882;
						return;
					}
					if (target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(2132061514);
						step = -688364288;
					} else {
						step = 526831521;
					}
				} else if (local210 == 15) {
					connection.length = 1705477074;
					step = 122548348;
				} else if (local210 == 23 && anInt4748 * 558401221 < 3) {
					waitingTime = 0;
					anInt4748 += 1751058445;
					step = -1044277882;
					connection.close((byte) 14);
					return;
				} else if (local210 == 42) {
					step = 529177811;
					Class114.setReply(local210, -541996945);
					return;
				} else if (target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, -341959381);
					}
					return;
				} else if (!aBoolean750 || socialNetworkLogin || anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						step = -522138941;
						Class114.setReply(local210, -1293587555);
						connection.close((byte) 44);
						Class680.method33240(44808995);
						return;
					}
					step = -1094993751;
				} else {
					socialNetworkLogin = true;
					waitingTime = 0;
					step = -1044277882;
					connection.close((byte) 11);
					return;
				}
			}
			if (step * 327612781 == 126) {
				if (!connection.getStream((byte) 35).available(1, -253297279)) {
					return;
				}
				connection.getStream((byte) -12).read(connection.packet.data, 0, 1, (byte) -109);
				local210 = connection.packet.data[0] & 0xFF;
				hopTime = local210 * 1250766390;
				step = -522138941;
				Class114.setReply(21, -1611071273);
				connection.close((byte) 116);
				Class680.method33240(1513660619);
				return;
			}
			if (step * 327612781 == 215) {
				if (!connection.getStream((byte) 93).available(2, 142768647)) {
					return;
				}
				connection.getStream((byte) -27).read(connection.packet.data, 0, 2, (byte) -50);
				queuePosition = (((connection.packet.data[0] & 0xFF) << 8) + (connection.packet.data[1] & 0xFF)) * 1980524355;
				step = 1279989418;
				return;
			}
			if (step * 327612781 == 245) {
				if (!connection.getStream((byte) 60).available(4, 39039146)) {
					return;
				}
				connection.getStream((byte) -71).read(connection.packet.data, 0, 4, (byte) -100);
				banDuration = connection.packet.g4(-118643075) * -1923297061;
				connection.packet.pos = 0;
				step = -522138941;
				Class114.setReply(53, -144779974);
				connection.close((byte) 48);
				Class680.method33240(134402502);
				return;
			}
			if (step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!connection.getStream((byte) 58).available(1, 21903003)) {
						return;
					}
					connection.getStream((byte) 0).read(connection.packet.data, 0, 1, (byte) -87);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!connection.getStream((byte) 39).available(3, 427509403)) {
						return;
					}
					connection.getStream((byte) 2).read(connection.packet.data, 0, 3, (byte) -17);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
					disallowTrigger = (((connection.packet.data[1] & 0xFF) << 8) + (connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -962170398);
				connection.close((byte) 53);
				Class680.method33240(-2023298693);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 11252);
					enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (step * 327612781 == 225) {
				if (!connection.getStream((byte) -30).available(2, 379180804)) {
					return;
				}
				connection.getStream((byte) 65).read(connection.packet.data, 0, 2, (byte) -69);
				connection.packet.pos = 0;
				Class629.urlLength = connection.packet.g2(-1434290800) * -430049679;
				connection.packet.pos = 0;
				step = 878052535;
				return;
			}
			if (step * 327612781 == 235) {
				if (!connection.getStream((byte) 41).available(Class629.urlLength * -2062087535, 2014588571)) {
					return;
				}
				connection.getStream((byte) 23).read(connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -39);
				connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, -1260387677);
				connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(1191010924);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -105);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 1442892334);
				if (target * -1128337797 == 132 && client.state * -849002901 != 9) {
					step = 1279989418;
				} else {
					step = -522138941;
					connection.close((byte) 55);
					Class680.method33240(-1131587489);
				}
				return;
			}
			if (step * 327612781 == 256) {
				if (!connection.getStream((byte) 14).available(2, 217884138)) {
					return;
				}
				connection.getStream((byte) 70).read(connection.packet.data, 0, 2, (byte) -71);
				connection.packet.pos = 0;
				connection.length = connection.packet.g2(-1434290800) * -852738537;
				step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (step * 327612781 == 268) {
				if (!connection.getStream((byte) -5).available(connection.length * 2010044839, 666433709)) {
					return;
				}
				connection.getStream((byte) 6).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -104);
				connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (connection.packet.pos * 212851357 >= connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) 8);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -118);
							connection.send(local1887, -1432917214);
							connection.flush((byte) 13);
							step = 1977738866;
						} else {
							step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(connection.packet, (byte) 82);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 75);
				}
			}
			if (step * 327612781 == 138) {
				if (!connection.getStream((byte) -45).available(1, 1724544577)) {
					return;
				}
				connection.getStream((byte) -102).read(connection.packet.data, 0, 1, (byte) -93);
				local210 = connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						step = -522138941;
						Class114.setReply(local210, -1346877773);
						connection.close((byte) 86);
						Class680.method33240(-605448776);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 14170);
							enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = 2095594634;
					return;
				}
				step = 526831521;
			}
			if (step * 327612781 == 141) {
				if (!connection.getStream((byte) -42).available(1, 783312290)) {
					return;
				}
				connection.getStream((byte) -66).read(connection.packet.data, 0, 1, (byte) -35);
				Class566.anInt5385 = (connection.packet.data[0] & 0xFF) * 252135035;
				step = -53062159;
			}
			@Pc(2027) PacketBit local2027;
			if (step * 327612781 == 157) {
				local2027 = connection.packet;
				if (target * -1128337797 == 211) {
					if (!connection.getStream((byte) -6).available(Class566.anInt5385 * 1395370163, 654112255)) {
						return;
					}
					connection.getStream((byte) 21).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -45);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					client.userQuickChat4 = local2027.g1((short) 16384) == 1;
					client.selfPlayerSlot = local2027.g2(-1434290800) * -410368243;
					client.userMember = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					client.mapMember = local2027.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = local2027.gjstr(312143346);
					Class99.aLong23 = (local2027.g6(-98007404) - Class305.method26797(117411415)) * -3359956914723456965L;
					client.world.method30496(799282420).setMembers(client.mapMember, -99222675);
					Class392.aClass541_1.method30914(1886428195).method30496(570742032).setMembers(client.mapMember, -803310796);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, 85713545);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, 694462227);
				} else if (connection.getStream((byte) 3).available(Class566.anInt5385 * 1395370163, 9241152)) {
					connection.getStream((byte) -22).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -121);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) local2027.g1((short) 16384);
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					Class707.userMembershipTime = local2027.g8(999864205) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(145218960) - local2027.g5(1593356826)) * -3359956914723456965L;
					local271 = local2027.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = local2027.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = local2027.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = local2027.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = local2027.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = local2027.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = local2027.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = local2027.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = local2027.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = local2027.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = local2027.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = local2027.gjstr2(-612663978);
					Class529.userMembersStats = local2027.g1((short) 16384) * -375509133;
					Class549.userPlayAge = local2027.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = local2027.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = local2027.gjstr2(-415480014);
					Class94.mapWorld.port1 = local2027.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = local2027.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -232289598)) {
						Class667.autoWorld(179388595);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 1924036446);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1664381776);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2028430469);
				}
				if (target * -1128337797 != 211) {
					step = -522138941;
					Class114.setReply(2, 1913279380);
					Class163.method14911(9693522);
					Class481.setState(13, 1823202236);
					connection.serverPacketType = null;
					return;
				}
				step = 817951506;
			}
			if (step * 327612781 == 170) {
				if (!connection.getStream((byte) 85).available(3, -58633929)) {
					return;
				}
				connection.getStream((byte) 66).read(connection.packet.data, 0, 3, (byte) -8);
				step = 702442028;
			}
			if (step * 327612781 == 188) {
				local2027 = connection.packet;
				local2027.pos = 0;
				if (local2027.peekIsaacBit(1962915223)) {
					if (!connection.getStream((byte) 22).available(1, 1807309386)) {
						return;
					}
					connection.getStream((byte) -38).read(local2027.data, 3, 1, (byte) -88);
				}
				connection.serverPacketType = ServerProt.values(1874984660)[local2027.gIsaac1or2(-1533413633)];
				connection.length = local2027.g2(-1434290800) * -852738537;
				step = -1503969504;
			}
			if (step * 327612781 == 160) {
				if (!connection.getStream((byte) 12).available(connection.length * 2010044839, 227738046)) {
					return;
				}
				connection.getStream((byte) 67).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -113);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(2, -844996238);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(connection.packet, -1132327592);
				local271 = local210 - connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(connection.packet.data, connection.packet.pos * 212851357, local1890.data, 0, local271);
				connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), -118082603);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), -8573751);
				}
				if (local210 != connection.packet.pos * 212851357) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
			if (step * 327612781 == 204) {
				if (connection.length * 2010044839 == -2) {
					if (!connection.getStream((byte) 41).available(2, 1479391145)) {
						return;
					}
					connection.getStream((byte) 68).read(connection.packet.data, 0, 2, (byte) -55);
					connection.packet.pos = 0;
					connection.length = connection.packet.g2(-1434290800) * -852738537;
				}
				if (!connection.getStream((byte) 28).available(connection.length * 2010044839, 268574722)) {
					return;
				}
				connection.getStream((byte) -93).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -70);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(15, 675720464);
				Class490.method29977((byte) 59);
				Class110_Sub5.method7654(connection.packet, -1965997892);
				if (connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			connection.close((byte) 34);
			if (anInt4748 * 558401221 < 3) {
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -29542);
				} else {
					Class50.lobby.cycleSettings((short) -3402);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			} else {
				step = -522138941;
				Class114.setReply(-4, 489852624);
				Class680.method33240(1468468370);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "bg", descriptor = "()V", line = 263)
	static final void method28638() {
		if (step * 327612781 == 7 || step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (anInt4748 * 558401221 == 0 && step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (socialNetworkLogin && step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (target * -1128337797 == 211 && step * 327612781 != 215 && enterGameReply * 1486673001 != 42 || target * -1128337797 == 132 && enterLobbyReply * 914785575 != 49 && enterLobbyReply * 914785575 != 52) {
				waitingTime += -498616603;
			}
			if (waitingTime * -803989779 > local22) {
				connection.close((byte) 63);
				if (anInt4748 * 558401221 >= 3) {
					step = -522138941;
					Class114.setReply(-5, 1116462417);
					Class680.method33240(134131082);
					return;
				}
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -20324);
				} else {
					Class50.lobby.cycleSettings((short) -8579);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (step * 327612781 == 14) {
				if (target * -1128337797 == 211) {
					connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) -2982), Class50.world.host, 2126602668);
				} else {
					connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) -2954), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(1301360651);
					client.secureRandomProvider.method13974(-2116231126);
					client.secureRandomProvider = null;
				}
				connection.clear(-993031222);
				local160 = Class720.createLoginMessage((byte) -85);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) -71);
				connection.send(local160, -2120122445);
				connection.flush((byte) 33);
				step = 1684272591;
			}
			@Pc(210) int local210;
			if (step * 327612781 == 35) {
				if (!connection.getStream((byte) -57).available(9, 443837329)) {
					return;
				}
				connection.getStream((byte) -26).read(connection.packet.data, 0, 9, (byte) -77);
				connection.packet.pos = 0;
				local210 = connection.packet.g1((short) 16384);
				if (local210 != 0) {
					step = -522138941;
					Class543.method30944(local210, (byte) 72);
					Class114.setReply(local210, 548663356);
					connection.close((byte) 31);
					Class680.method33240(992968799);
					return;
				}
				aLong269 = connection.packet.g8(-2068190121) * -4112723527472146283L;
				connection.packet.pos = 0;
				if (socialNetworkLogin) {
					step = -339489564;
				} else {
					step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) 1);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -39);
				local160.packet.p2(0, 2129035837);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) 77);
				local160.packet.p4(1, (byte) 78);
				if (target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -84);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 88);
				Class709.writeTotp(local301, (long) (anInt4746 * 276097583));
				Class413.totpTokenKey = (long) anInt4746 * -1187630733921575941L;
				local301.p1(anInt4746 * 276097583, (byte) -38);
				local301.p1(Class106.lang.getId(), (byte) -58);
				local301.p4(client.affiliate * -1765120027, (byte) -37);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) -37);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) -96);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -49);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) 0);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, -1902829402);
				connection.send(local160, -1606871549);
				connection.flush((byte) 90);
				step = 697749448;
			}
			if (step * 327612781 == 40) {
				if (!connection.getStream((byte) -55).available(2, 206772831)) {
					return;
				}
				connection.getStream((byte) -18).read(connection.packet.data, 0, 2, (byte) -4);
				connection.packet.pos = 0;
				connection.packet.pos = connection.packet.g2(-1434290800) * -1445626955;
				step = 582239970;
			}
			if (step * 327612781 == 58) {
				if (!connection.getStream((byte) -95).available(connection.packet.pos * 212851357, 232675516)) {
					return;
				}
				connection.getStream((byte) -96).read(connection.packet.data, 0, connection.packet.pos * 212851357, (byte) -63);
				connection.packet.tinydec(currentIsaacKey, 930596480);
				connection.packet.pos = 0;
				@Pc(479) String local479 = connection.packet.gjstr2(-1459864099);
				connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -32);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 97);
				step = 1975392576;
			}
			if (step * 327612781 == 64) {
				if (!connection.getStream((byte) 55).available(1, 1945051181)) {
					return;
				}
				connection.getStream((byte) -105).read(connection.packet.data, 0, 1, (byte) -89);
				if ((connection.packet.data[0] & 0xFF) == 1) {
					step = -926422114;
				}
			}
			if (step * 327612781 == 70) {
				if (!connection.getStream((byte) -36).available(16, -206994990)) {
					return;
				}
				connection.getStream((byte) -17).read(connection.packet.data, 0, 16, (byte) -39);
				connection.packet.pos = -1655194800;
				connection.packet.tinydec(currentIsaacKey, 562205740);
				connection.packet.pos = 0;
				ssoKeyIdentifier = connection.packet.g8(-1434136458) * 7033311592096984251L;
				ssoKey = connection.packet.g8(330168027) * 5236525202755218899L;
				step = -1970699996;
			}
			if (step * 327612781 == 84) {
				connection.packet.pos = 0;
				connection.clear(536861870);
				local160 = Class720.createLoginMessage((byte) -34);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (target * -1128337797 == 211) {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) 2);
					local601.p2(0, 2125985878);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) 24);
						local601.p4(1, (byte) 12);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -37);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 39);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) 2);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, -209106430);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1334783320), (byte) -85);
					local601.p2(Class553.width * -1378711501, 2137194588);
					local601.p2(Class553.height * 2091353777, 2136664119);
					local601.p1(Class51.options.antialiasing.getValue(-1955428519), (byte) -107);
					Class314.getUid192(local601, 2021930574);
					local601.pjstr(client.settings, -401079060);
					local601.p4(client.affiliate * -1765120027, (byte) 17);
					local663 = Class51.options.encode(933560304);
					local601.p1(local663.pos * 212851357, (byte) -3);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1559147740);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -47);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) -4);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) -1);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) 3);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) -53);
					local601.pjstr(Class454.aString210, 1073119794);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) -104);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, -953328828);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -56);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -95);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -123);
					local601.p4(client.anInt3434 * -1579845029, (byte) 71);
					local601.pjstr(client.clientToken, -620855651);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -16);
					local601.p2(Class50.lobby.id * 2142901097, 2139544516);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -25);
					local601.psize2(local601.pos * 212851357 - local331, -1813010147);
				} else {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -91);
					local601.p2(0, 2124937170);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) -16);
						local601.p4(1, (byte) 101);
						local663 = Class168.createLoginPacket((byte) 34);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -92);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, -1431282601);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) -89);
					local601.p1(Class106.lang.getId(), (byte) -116);
					local601.p1(Class255.getWindowMode(1924410465), (byte) -38);
					local601.p2(Class553.width * -1378711501, 2136403639);
					local601.p2(Class553.height * 2091353777, 2126755857);
					local601.p1(Class51.options.antialiasing.getValue(-626430922), (byte) -18);
					Class314.getUid192(local601, 2080754525);
					local601.pjstr(client.settings, 961587399);
					local663 = Class51.options.encode(-172716902);
					local601.p1(local663.pos * 212851357, (byte) -24);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1606606658);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -90);
					local601.pjstr(Class454.aString210, -2006944428);
					local601.p4(client.affiliate * -1765120027, (byte) -12);
					local601.p4(client.anInt3434 * -1579845029, (byte) -88);
					local601.pjstr(client.clientToken, -1961710432);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -33);
					local601.pbool(false, 1075308740);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -62);
					local601.psize2(local601.pos * 212851357 - local331, -767311933);
				}
				connection.send(local160, -1748849158);
				connection.flush((byte) 76);
				connection.clientIsaac = new IsaacRandom(currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = currentIsaacKey[local331] + 50;
				}
				connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				connection.packet.setRandom(connection.serverIsaac, (byte) -96);
				currentIsaacKey = null;
				step = 1279989418;
			}
			if (step * 327612781 == 98) {
				if (!connection.getStream((byte) -5).available(1, 1833505202)) {
					return;
				}
				connection.getStream((byte) 63).read(connection.packet.data, 0, 1, (byte) -62);
				local210 = connection.packet.g1((short) 16384);
				connection.packet.pos = 0;
				if (local210 == 21) {
					step = -808566346;
				} else if (local210 == 1) {
					step = 293466275;
					Class114.setReply(local210, 92191181);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = -1443868475;
				} else if (local210 == 2) {
					if (aBoolean753) {
						aBoolean753 = false;
						step = -1044277882;
						return;
					}
					if (target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(1548415628);
						step = -688364288;
					} else {
						step = 526831521;
					}
				} else if (local210 == 15) {
					connection.length = 1705477074;
					step = 122548348;
				} else if (local210 == 23 && anInt4748 * 558401221 < 3) {
					waitingTime = 0;
					anInt4748 += 1751058445;
					step = -1044277882;
					connection.close((byte) 18);
					return;
				} else if (local210 == 42) {
					step = 529177811;
					Class114.setReply(local210, 282585133);
					return;
				} else if (target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, -67357200);
					}
					return;
				} else if (!aBoolean750 || socialNetworkLogin || anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						step = -522138941;
						Class114.setReply(local210, 1817231575);
						connection.close((byte) 33);
						Class680.method33240(1982810442);
						return;
					}
					step = -1094993751;
				} else {
					socialNetworkLogin = true;
					waitingTime = 0;
					step = -1044277882;
					connection.close((byte) 123);
					return;
				}
			}
			if (step * 327612781 == 126) {
				if (!connection.getStream((byte) -57).available(1, 880323216)) {
					return;
				}
				connection.getStream((byte) 3).read(connection.packet.data, 0, 1, (byte) -67);
				local210 = connection.packet.data[0] & 0xFF;
				hopTime = local210 * 1250766390;
				step = -522138941;
				Class114.setReply(21, 1741224476);
				connection.close((byte) 7);
				Class680.method33240(-2131785680);
				return;
			}
			if (step * 327612781 == 215) {
				if (!connection.getStream((byte) 55).available(2, -249032541)) {
					return;
				}
				connection.getStream((byte) 55).read(connection.packet.data, 0, 2, (byte) -3);
				queuePosition = (((connection.packet.data[0] & 0xFF) << 8) + (connection.packet.data[1] & 0xFF)) * 1980524355;
				step = 1279989418;
				return;
			}
			if (step * 327612781 == 245) {
				if (!connection.getStream((byte) -66).available(4, 94912695)) {
					return;
				}
				connection.getStream((byte) -18).read(connection.packet.data, 0, 4, (byte) -87);
				banDuration = connection.packet.g4(-118643075) * -1923297061;
				connection.packet.pos = 0;
				step = -522138941;
				Class114.setReply(53, -968270727);
				connection.close((byte) 57);
				Class680.method33240(-570986385);
				return;
			}
			if (step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!connection.getStream((byte) 41).available(1, 256992849)) {
						return;
					}
					connection.getStream((byte) 82).read(connection.packet.data, 0, 1, (byte) -75);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!connection.getStream((byte) 8).available(3, 883425113)) {
						return;
					}
					connection.getStream((byte) 44).read(connection.packet.data, 0, 3, (byte) -9);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
					disallowTrigger = (((connection.packet.data[1] & 0xFF) << 8) + (connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -101695232);
				connection.close((byte) 26);
				Class680.method33240(1435862240);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 22684);
					enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (step * 327612781 == 225) {
				if (!connection.getStream((byte) -77).available(2, 321258287)) {
					return;
				}
				connection.getStream((byte) -4).read(connection.packet.data, 0, 2, (byte) -97);
				connection.packet.pos = 0;
				Class629.urlLength = connection.packet.g2(-1434290800) * -430049679;
				connection.packet.pos = 0;
				step = 878052535;
				return;
			}
			if (step * 327612781 == 235) {
				if (!connection.getStream((byte) 33).available(Class629.urlLength * -2062087535, 1394899413)) {
					return;
				}
				connection.getStream((byte) 12).read(connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -27);
				connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, 101353331);
				connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(843897965);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -98);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 410362085);
				if (target * -1128337797 == 132 && client.state * -849002901 != 9) {
					step = 1279989418;
				} else {
					step = -522138941;
					connection.close((byte) 36);
					Class680.method33240(-679438075);
				}
				return;
			}
			if (step * 327612781 == 256) {
				if (!connection.getStream((byte) -19).available(2, 846030043)) {
					return;
				}
				connection.getStream((byte) 50).read(connection.packet.data, 0, 2, (byte) -55);
				connection.packet.pos = 0;
				connection.length = connection.packet.g2(-1434290800) * -852738537;
				step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (step * 327612781 == 268) {
				if (!connection.getStream((byte) -20).available(connection.length * 2010044839, 531328305)) {
					return;
				}
				connection.getStream((byte) -29).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -42);
				connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (connection.packet.pos * 212851357 >= connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) 3);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -22);
							connection.send(local1887, -1997513822);
							connection.flush((byte) 113);
							step = 1977738866;
						} else {
							step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(connection.packet, (byte) 31);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 125);
				}
			}
			if (step * 327612781 == 138) {
				if (!connection.getStream((byte) -47).available(1, 1669201771)) {
					return;
				}
				connection.getStream((byte) -67).read(connection.packet.data, 0, 1, (byte) -5);
				local210 = connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						step = -522138941;
						Class114.setReply(local210, -407662746);
						connection.close((byte) 83);
						Class680.method33240(-1382196070);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 29172);
							enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = 2095594634;
					return;
				}
				step = 526831521;
			}
			if (step * 327612781 == 141) {
				if (!connection.getStream((byte) 113).available(1, 1081246673)) {
					return;
				}
				connection.getStream((byte) 16).read(connection.packet.data, 0, 1, (byte) -111);
				Class566.anInt5385 = (connection.packet.data[0] & 0xFF) * 252135035;
				step = -53062159;
			}
			@Pc(2027) PacketBit buf;
			if (step * 327612781 == 157) {
				buf = connection.packet;
				if (target * -1128337797 == 211) {
					if (!connection.getStream((byte) 39).available(Class566.anInt5385 * 1395370163, -290007161)) {
						return;
					}
					connection.getStream((byte) 72).read(buf.data, 0, Class566.anInt5385 * 1395370163, (byte) -116);
					buf.pos = 0;
					Class124.decodeTotpToken(buf, -909097621);
					client.userStaffModLevel = buf.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = buf.g1((short) 16384) * -823645517;
					client.userQuickChat1 = buf.g1((short) 16384) == 1;
					client.userQuickChat2 = buf.g1((short) 16384) == 1;
					client.userQuickChat3 = buf.g1((short) 16384) == 1;
					client.userQuickChat4 = buf.g1((short) 16384) == 1;
					client.selfPlayerSlot = buf.g2(-1434290800) * -410368243;
					client.userMember = buf.g1((short) 16384) == 1;
					Class626.userDob = buf.g3s(-87715282) * 889370685;
					client.mapMember = buf.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = buf.gjstr(1809784083);
					Class99.aLong23 = (buf.g6(-1412078042) - Class305.method26797(79283132)) * -3359956914723456965L;
					client.world.method30496(1240309986).setMembers(client.mapMember, -858894248);
					Class392.aClass541_1.method30914(1522465188).method30496(1348987236).setMembers(client.mapMember, -1706061400);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, 143378757);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, 385457106);
				} else if (connection.getStream((byte) -14).available(Class566.anInt5385 * 1395370163, 1779903703)) {
					connection.getStream((byte) -13).read(buf.data, 0, Class566.anInt5385 * 1395370163, (byte) -9);
					buf.pos = 0;
					Class124.decodeTotpToken(buf, -909097621);
					client.userStaffModLevel = buf.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = buf.g1((short) 16384) * -823645517;
					client.userQuickChat1 = buf.g1((short) 16384) == 1;
					Class626.userDob = buf.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) buf.g1((short) 16384);
					client.userQuickChat2 = buf.g1((short) 16384) == 1;
					client.userQuickChat3 = buf.g1((short) 16384) == 1;
					Class707.userMembershipTime = buf.g8(1364568946) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(579917902) - buf.g5(1593356826)) * -3359956914723456965L;
					local271 = buf.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = buf.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = buf.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = buf.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = buf.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = buf.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = buf.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = buf.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = buf.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = buf.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = buf.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = buf.gjstr2(2048002270);
					Class529.userMembersStats = buf.g1((short) 16384) * -375509133;
					Class549.userPlayAge = buf.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = buf.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = buf.gjstr2(1072286608);
					Class94.mapWorld.port1 = buf.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = buf.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -1930364016)) {
						Class667.autoWorld(-2131608106);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 1749141433);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1870028143);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2136265365);
				}
				if (target * -1128337797 != 211) {
					step = -522138941;
					Class114.setReply(2, -460129322);
					Class163.method14911(-1182387040);
					Class481.setState(13, 1823202236);
					connection.serverPacketType = null;
					return;
				}
				step = 817951506;
			}
			if (step * 327612781 == 170) {
				if (!connection.getStream((byte) 9).available(3, 897421356)) {
					return;
				}
				connection.getStream((byte) -19).read(connection.packet.data, 0, 3, (byte) -8);
				step = 702442028;
			}
			if (step * 327612781 == 188) {
				buf = connection.packet;
				buf.pos = 0;
				if (buf.peekIsaacBit(-1891996844)) {
					if (!connection.getStream((byte) 52).available(1, 911000666)) {
						return;
					}
					connection.getStream((byte) -20).read(buf.data, 3, 1, (byte) -95);
				}
				connection.serverPacketType = ServerProt.values(624023871)[buf.gIsaac1or2(1176241878)];
				connection.length = buf.g2(-1434290800) * -852738537;
				step = -1503969504;
			}
			if (step * 327612781 == 160) {
				if (!connection.getStream((byte) 13).available(connection.length * 2010044839, 336521283)) {
					return;
				}
				connection.getStream((byte) -51).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -7);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(2, -1955849974);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(connection.packet, -1463822806);
				local271 = local210 - connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(connection.packet.data, connection.packet.pos * 212851357, local1890.data, 0, local271);
				connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), 391303479);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), -69045704);
				}
				if (local210 != connection.packet.pos * 212851357) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
			if (step * 327612781 == 204) {
				if (connection.length * 2010044839 == -2) {
					if (!connection.getStream((byte) -82).available(2, 1371269487)) {
						return;
					}
					connection.getStream((byte) 115).read(connection.packet.data, 0, 2, (byte) -118);
					connection.packet.pos = 0;
					connection.length = connection.packet.g2(-1434290800) * -852738537;
				}
				if (!connection.getStream((byte) -36).available(connection.length * 2010044839, 1455022816)) {
					return;
				}
				connection.getStream((byte) 33).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -7);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(15, 214621239);
				Class490.method29977((byte) 120);
				Class110_Sub5.method7654(connection.packet, -1759570103);
				if (connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			connection.close((byte) 42);
			if (anInt4748 * 558401221 < 3) {
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -13359);
				} else {
					Class50.lobby.cycleSettings((short) -9999);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			} else {
				step = -522138941;
				Class114.setReply(-4, -1146379681);
				Class680.method33240(1403513740);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "ba", descriptor = "()V", line = 263)
	static final void method28639() {
		if (step * 327612781 == 7 || step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (anInt4748 * 558401221 == 0 && step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (socialNetworkLogin && step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (target * -1128337797 == 211 && step * 327612781 != 215 && enterGameReply * 1486673001 != 42 || target * -1128337797 == 132 && enterLobbyReply * 914785575 != 49 && enterLobbyReply * 914785575 != 52) {
				waitingTime += -498616603;
			}
			if (waitingTime * -803989779 > local22) {
				connection.close((byte) 115);
				if (anInt4748 * 558401221 >= 3) {
					step = -522138941;
					Class114.setReply(-5, -956206982);
					Class680.method33240(336574857);
					return;
				}
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -25694);
				} else {
					Class50.lobby.cycleSettings((short) -6961);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (step * 327612781 == 14) {
				if (target * -1128337797 == 211) {
					connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) 15117), Class50.world.host, 2126602668);
				} else {
					connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) 4093), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(-1305337172);
					client.secureRandomProvider.method13974(-1489399073);
					client.secureRandomProvider = null;
				}
				connection.clear(165012511);
				local160 = Class720.createLoginMessage((byte) 72);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) 0);
				connection.send(local160, -1726828049);
				connection.flush((byte) 49);
				step = 1684272591;
			}
			@Pc(210) int local210;
			if (step * 327612781 == 35) {
				if (!connection.getStream((byte) 43).available(9, 576991893)) {
					return;
				}
				connection.getStream((byte) -42).read(connection.packet.data, 0, 9, (byte) -57);
				connection.packet.pos = 0;
				local210 = connection.packet.g1((short) 16384);
				if (local210 != 0) {
					step = -522138941;
					Class543.method30944(local210, (byte) -5);
					Class114.setReply(local210, 1207414632);
					connection.close((byte) 113);
					Class680.method33240(-443624118);
					return;
				}
				aLong269 = connection.packet.g8(-695850523) * -4112723527472146283L;
				connection.packet.pos = 0;
				if (socialNetworkLogin) {
					step = -339489564;
				} else {
					step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) 88);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -97);
				local160.packet.p2(0, 2144058275);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) -77);
				local160.packet.p4(1, (byte) -26);
				if (target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -103);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 123);
				Class709.writeTotp(local301, (long) (anInt4746 * 276097583));
				Class413.totpTokenKey = (long) anInt4746 * -1187630733921575941L;
				local301.p1(anInt4746 * 276097583, (byte) -75);
				local301.p1(Class106.lang.getId(), (byte) -16);
				local301.p4(client.affiliate * -1765120027, (byte) 4);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) 66);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) -119);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -5);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -97);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, 524875821);
				connection.send(local160, -1797467313);
				connection.flush((byte) 85);
				step = 697749448;
			}
			if (step * 327612781 == 40) {
				if (!connection.getStream((byte) -56).available(2, 640905020)) {
					return;
				}
				connection.getStream((byte) 4).read(connection.packet.data, 0, 2, (byte) -81);
				connection.packet.pos = 0;
				connection.packet.pos = connection.packet.g2(-1434290800) * -1445626955;
				step = 582239970;
			}
			if (step * 327612781 == 58) {
				if (!connection.getStream((byte) -20).available(connection.packet.pos * 212851357, 1727730645)) {
					return;
				}
				connection.getStream((byte) -42).read(connection.packet.data, 0, connection.packet.pos * 212851357, (byte) -115);
				connection.packet.tinydec(currentIsaacKey, 1368501492);
				connection.packet.pos = 0;
				@Pc(479) String local479 = connection.packet.gjstr2(1028585143);
				connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -1);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 75);
				step = 1975392576;
			}
			if (step * 327612781 == 64) {
				if (!connection.getStream((byte) -46).available(1, 2006290018)) {
					return;
				}
				connection.getStream((byte) -21).read(connection.packet.data, 0, 1, (byte) -9);
				if ((connection.packet.data[0] & 0xFF) == 1) {
					step = -926422114;
				}
			}
			if (step * 327612781 == 70) {
				if (!connection.getStream((byte) -39).available(16, 633730493)) {
					return;
				}
				connection.getStream((byte) 63).read(connection.packet.data, 0, 16, (byte) -16);
				connection.packet.pos = -1655194800;
				connection.packet.tinydec(currentIsaacKey, 386720041);
				connection.packet.pos = 0;
				ssoKeyIdentifier = connection.packet.g8(363806991) * 7033311592096984251L;
				ssoKey = connection.packet.g8(46908253) * 5236525202755218899L;
				step = -1970699996;
			}
			if (step * 327612781 == 84) {
				connection.packet.pos = 0;
				connection.clear(1058700750);
				local160 = Class720.createLoginMessage((byte) 109);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (target * -1128337797 == 211) {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -125);
					local601.p2(0, 2125862609);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) -28);
						local601.p4(1, (byte) 74);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -17);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 113);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -103);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, 1693881378);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1636560323), (byte) -26);
					local601.p2(Class553.width * -1378711501, 2130975162);
					local601.p2(Class553.height * 2091353777, 2137391063);
					local601.p1(Class51.options.antialiasing.getValue(-225940357), (byte) -41);
					Class314.getUid192(local601, 1614176488);
					local601.pjstr(client.settings, 1806111318);
					local601.p4(client.affiliate * -1765120027, (byte) -19);
					local663 = Class51.options.encode(704601607);
					local601.p1(local663.pos * 212851357, (byte) -72);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1919658313);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -63);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) 77);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) 108);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) -83);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) -24);
					local601.pjstr(Class454.aString210, 480009641);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) -17);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, 1622254886);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -77);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -95);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -77);
					local601.p4(client.anInt3434 * -1579845029, (byte) 43);
					local601.pjstr(client.clientToken, 1975417130);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -98);
					local601.p2(Class50.lobby.id * 2142901097, 2125361783);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -88);
					local601.psize2(local601.pos * 212851357 - local331, -268734347);
				} else {
					if (socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -50);
					local601.p2(0, 2128608015);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!socialNetworkLogin) {
						local601.p4(910, (byte) 79);
						local601.p4(1, (byte) 7);
						local663 = Class168.createLoginPacket((byte) 83);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -8);
						if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(username, 1195996965);
						} else {
							local601.p8(ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) -79);
					local601.p1(Class106.lang.getId(), (byte) -69);
					local601.p1(Class255.getWindowMode(2009678945), (byte) -127);
					local601.p2(Class553.width * -1378711501, 2144640113);
					local601.p2(Class553.height * 2091353777, 2142074543);
					local601.p1(Class51.options.antialiasing.getValue(-456132424), (byte) -16);
					Class314.getUid192(local601, 1115884257);
					local601.pjstr(client.settings, -1934212983);
					local663 = Class51.options.encode(374867758);
					local601.p1(local663.pos * 212851357, (byte) -63);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 2133306377);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -5);
					local601.pjstr(Class454.aString210, 2071286297);
					local601.p4(client.affiliate * -1765120027, (byte) -13);
					local601.p4(client.anInt3434 * -1579845029, (byte) -30);
					local601.pjstr(client.clientToken, 1882989984);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -100);
					local601.pbool(false, -923347768);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(currentIsaacKey, local634, local601.pos * 212851357, (byte) -27);
					local601.psize2(local601.pos * 212851357 - local331, 1502297317);
				}
				connection.send(local160, -2079507980);
				connection.flush((byte) 66);
				connection.clientIsaac = new IsaacRandom(currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = currentIsaacKey[local331] + 50;
				}
				connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				connection.packet.setRandom(connection.serverIsaac, (byte) -20);
				currentIsaacKey = null;
				step = 1279989418;
			}
			if (step * 327612781 == 98) {
				if (!connection.getStream((byte) -13).available(1, 985958004)) {
					return;
				}
				connection.getStream((byte) 62).read(connection.packet.data, 0, 1, (byte) -31);
				local210 = connection.packet.g1((short) 16384);
				connection.packet.pos = 0;
				if (local210 == 21) {
					step = -808566346;
				} else if (local210 == 1) {
					step = 293466275;
					Class114.setReply(local210, -479200793);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = -1443868475;
				} else if (local210 == 2) {
					if (aBoolean753) {
						aBoolean753 = false;
						step = -1044277882;
						return;
					}
					if (target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(-586878406);
						step = -688364288;
					} else {
						step = 526831521;
					}
				} else if (local210 == 15) {
					connection.length = 1705477074;
					step = 122548348;
				} else if (local210 == 23 && anInt4748 * 558401221 < 3) {
					waitingTime = 0;
					anInt4748 += 1751058445;
					step = -1044277882;
					connection.close((byte) 94);
					return;
				} else if (local210 == 42) {
					step = 529177811;
					Class114.setReply(local210, 1935069063);
					return;
				} else if (target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, 1133446378);
					}
					return;
				} else if (!aBoolean750 || socialNetworkLogin || anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						step = -522138941;
						Class114.setReply(local210, 1049941575);
						connection.close((byte) 2);
						Class680.method33240(-1702548315);
						return;
					}
					step = -1094993751;
				} else {
					socialNetworkLogin = true;
					waitingTime = 0;
					step = -1044277882;
					connection.close((byte) 100);
					return;
				}
			}
			if (step * 327612781 == 126) {
				if (!connection.getStream((byte) -16).available(1, 1125592692)) {
					return;
				}
				connection.getStream((byte) 56).read(connection.packet.data, 0, 1, (byte) -88);
				local210 = connection.packet.data[0] & 0xFF;
				hopTime = local210 * 1250766390;
				step = -522138941;
				Class114.setReply(21, -2008426906);
				connection.close((byte) 100);
				Class680.method33240(-1589612643);
				return;
			}
			if (step * 327612781 == 215) {
				if (!connection.getStream((byte) 3).available(2, 312505866)) {
					return;
				}
				connection.getStream((byte) -78).read(connection.packet.data, 0, 2, (byte) -73);
				queuePosition = (((connection.packet.data[0] & 0xFF) << 8) + (connection.packet.data[1] & 0xFF)) * 1980524355;
				step = 1279989418;
				return;
			}
			if (step * 327612781 == 245) {
				if (!connection.getStream((byte) 29).available(4, 1197994721)) {
					return;
				}
				connection.getStream((byte) 47).read(connection.packet.data, 0, 4, (byte) -59);
				banDuration = connection.packet.g4(-118643075) * -1923297061;
				connection.packet.pos = 0;
				step = -522138941;
				Class114.setReply(53, 463458610);
				connection.close((byte) 63);
				Class680.method33240(-1626952319);
				return;
			}
			if (step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!connection.getStream((byte) 38).available(1, 961449013)) {
						return;
					}
					connection.getStream((byte) 77).read(connection.packet.data, 0, 1, (byte) -60);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!connection.getStream((byte) -23).available(3, 393666772)) {
						return;
					}
					connection.getStream((byte) 4).read(connection.packet.data, 0, 3, (byte) -32);
					disallowResult = (connection.packet.data[0] & 0xFF) * 1109601241;
					disallowTrigger = (((connection.packet.data[1] & 0xFF) << 8) + (connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -1296474625);
				connection.close((byte) 125);
				Class680.method33240(935595075);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 15319);
					enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (step * 327612781 == 225) {
				if (!connection.getStream((byte) 88).available(2, 989519687)) {
					return;
				}
				connection.getStream((byte) -8).read(connection.packet.data, 0, 2, (byte) -80);
				connection.packet.pos = 0;
				Class629.urlLength = connection.packet.g2(-1434290800) * -430049679;
				connection.packet.pos = 0;
				step = 878052535;
				return;
			}
			if (step * 327612781 == 235) {
				if (!connection.getStream((byte) 71).available(Class629.urlLength * -2062087535, 633765010)) {
					return;
				}
				connection.getStream((byte) 34).read(connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -111);
				connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, -764114098);
				connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(301165678);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -78);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 1168935583);
				if (target * -1128337797 == 132 && client.state * -849002901 != 9) {
					step = 1279989418;
				} else {
					step = -522138941;
					connection.close((byte) 33);
					Class680.method33240(-417052899);
				}
				return;
			}
			if (step * 327612781 == 256) {
				if (!connection.getStream((byte) -17).available(2, 1450109658)) {
					return;
				}
				connection.getStream((byte) -2).read(connection.packet.data, 0, 2, (byte) -52);
				connection.packet.pos = 0;
				connection.length = connection.packet.g2(-1434290800) * -852738537;
				step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (step * 327612781 == 268) {
				if (!connection.getStream((byte) 73).available(connection.length * 2010044839, 1582439483)) {
					return;
				}
				connection.getStream((byte) -14).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -82);
				connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (connection.packet.pos * 212851357 >= connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) 56);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -28);
							connection.send(local1887, -1635694534);
							connection.flush((byte) 38);
							step = 1977738866;
						} else {
							step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(connection.packet, (byte) 50);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 76);
				}
			}
			if (step * 327612781 == 138) {
				if (!connection.getStream((byte) -4).available(1, 302103412)) {
					return;
				}
				connection.getStream((byte) 52).read(connection.packet.data, 0, 1, (byte) -28);
				local210 = connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						step = -522138941;
						Class114.setReply(local210, 104463730);
						connection.close((byte) 90);
						Class680.method33240(69875378);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 9910);
							enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					step = 2095594634;
					return;
				}
				step = 526831521;
			}
			if (step * 327612781 == 141) {
				if (!connection.getStream((byte) 7).available(1, 1149154956)) {
					return;
				}
				connection.getStream((byte) 43).read(connection.packet.data, 0, 1, (byte) -82);
				Class566.anInt5385 = (connection.packet.data[0] & 0xFF) * 252135035;
				step = -53062159;
			}
			@Pc(2027) PacketBit local2027;
			if (step * 327612781 == 157) {
				local2027 = connection.packet;
				if (target * -1128337797 == 211) {
					if (!connection.getStream((byte) 80).available(Class566.anInt5385 * 1395370163, 938271646)) {
						return;
					}
					connection.getStream((byte) 56).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -116);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					client.userQuickChat4 = local2027.g1((short) 16384) == 1;
					client.selfPlayerSlot = local2027.g2(-1434290800) * -410368243;
					client.userMember = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					client.mapMember = local2027.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = local2027.gjstr(1672217964);
					Class99.aLong23 = (local2027.g6(484865888) - Class305.method26797(1926911605)) * -3359956914723456965L;
					client.world.method30496(1088952297).setMembers(client.mapMember, -1315057676);
					Class392.aClass541_1.method30914(1965351577).method30496(721619012).setMembers(client.mapMember, -502701258);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, -1033176957);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, -1257824961);
				} else if (connection.getStream((byte) 77).available(Class566.anInt5385 * 1395370163, -154494944)) {
					connection.getStream((byte) -35).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -76);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) local2027.g1((short) 16384);
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					Class707.userMembershipTime = local2027.g8(969332533) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(-352018584) - local2027.g5(1593356826)) * -3359956914723456965L;
					local271 = local2027.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = local2027.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = local2027.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = local2027.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = local2027.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = local2027.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = local2027.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = local2027.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = local2027.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = local2027.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = local2027.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = local2027.gjstr2(806129452);
					Class529.userMembersStats = local2027.g1((short) 16384) * -375509133;
					Class549.userPlayAge = local2027.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = local2027.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = local2027.gjstr2(-878498043);
					Class94.mapWorld.port1 = local2027.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = local2027.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -668487499)) {
						Class667.autoWorld(-1211216037);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 1622316397);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1662046269);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2140497842);
				}
				if (target * -1128337797 != 211) {
					step = -522138941;
					Class114.setReply(2, 1408133507);
					Class163.method14911(-1685885949);
					Class481.setState(13, 1823202236);
					connection.serverPacketType = null;
					return;
				}
				step = 817951506;
			}
			if (step * 327612781 == 170) {
				if (!connection.getStream((byte) 34).available(3, 1089472261)) {
					return;
				}
				connection.getStream((byte) 60).read(connection.packet.data, 0, 3, (byte) -44);
				step = 702442028;
			}
			if (step * 327612781 == 188) {
				local2027 = connection.packet;
				local2027.pos = 0;
				if (local2027.peekIsaacBit(324591009)) {
					if (!connection.getStream((byte) 21).available(1, 1031255210)) {
						return;
					}
					connection.getStream((byte) -16).read(local2027.data, 3, 1, (byte) -113);
				}
				connection.serverPacketType = ServerProt.values(1232048773)[local2027.gIsaac1or2(1037714712)];
				connection.length = local2027.g2(-1434290800) * -852738537;
				step = -1503969504;
			}
			if (step * 327612781 == 160) {
				if (!connection.getStream((byte) 35).available(connection.length * 2010044839, -199572885)) {
					return;
				}
				connection.getStream((byte) 10).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -76);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(2, -1835764514);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(connection.packet, -1431810389);
				local271 = local210 - connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(connection.packet.data, connection.packet.pos * 212851357, local1890.data, 0, local271);
				connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), -1458215804);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), -255399818);
				}
				if (local210 != connection.packet.pos * 212851357) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
			if (step * 327612781 == 204) {
				if (connection.length * 2010044839 == -2) {
					if (!connection.getStream((byte) 57).available(2, 1523501886)) {
						return;
					}
					connection.getStream((byte) 5).read(connection.packet.data, 0, 2, (byte) -80);
					connection.packet.pos = 0;
					connection.length = connection.packet.g2(-1434290800) * -852738537;
				}
				if (!connection.getStream((byte) -68).available(connection.length * 2010044839, 1976526293)) {
					return;
				}
				connection.getStream((byte) -62).read(connection.packet.data, 0, connection.length * 2010044839, (byte) -7);
				connection.packet.pos = 0;
				local210 = connection.length * 2010044839;
				step = -522138941;
				Class114.setReply(15, 1536917052);
				Class490.method29977((byte) 108);
				Class110_Sub5.method7654(connection.packet, -951254325);
				if (connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(connection.packet.pos * 212851357 + " " + local210);
				}
				connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			connection.close((byte) 121);
			if (anInt4748 * 558401221 < 3) {
				if (target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -32302);
				} else {
					Class50.lobby.cycleSettings((short) -19775);
				}
				waitingTime = 0;
				anInt4748 += 1751058445;
				step = -1044277882;
			} else {
				step = -522138941;
				Class114.setReply(-4, 1579631641);
				Class680.method33240(978829752);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "bj", descriptor = "(Lclient!ase;)V", line = 879)
	static void method28640(@OriginalArg(0) PacketBit arg0) {
		@Pc(8) boolean local8 = arg0.g1((short) 16384) == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.g1opcode(-122312544) << 24;
		@Pc(26) int local26 = local18 | arg0.g1opcode(376558335) << 16;
		@Pc(34) int local34 = local26 | arg0.g1opcode(-1516802832) << 8;
		@Pc(40) int local40 = local34 | arg0.g1opcode(-2061949290);
		Class266.aClass306_1.method26809(Class413.totpTokenKey * 1983505324986122333L, local40, 1835525899);
	}

	@OriginalMember(owner = "client!m", name = "bp", descriptor = "(Lclient!ase;)V", line = 879)
	static void method28641(@OriginalArg(0) PacketBit arg0) {
		@Pc(8) boolean local8 = arg0.g1((short) 16384) == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.g1opcode(205278958) << 24;
		@Pc(26) int local26 = local18 | arg0.g1opcode(-1821622867) << 16;
		@Pc(34) int local34 = local26 | arg0.g1opcode(-194251200) << 8;
		@Pc(40) int local40 = local34 | arg0.g1opcode(-827938408);
		Class266.aClass306_1.method26809(Class413.totpTokenKey * 1983505324986122333L, local40, 1126459941);
	}

	@OriginalMember(owner = "client!m", name = "bs", descriptor = "(I)V", line = 890)
	static void method28642(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!m", name = "cl", descriptor = "()Lclient!alw;", line = 893)
	static Packet method28643() {
		@Pc(4) Packet local4 = new Packet(518);
		currentIsaacKey = new int[4];
		currentIsaacKey[0] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[1] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[2] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[3] = Class110_Sub9.secureRandom.nextInt();
		local4.p1(10, (byte) 1);
		local4.p4(currentIsaacKey[0], (byte) -54);
		local4.p4(currentIsaacKey[1], (byte) -84);
		local4.p4(currentIsaacKey[2], (byte) 95);
		local4.p4(currentIsaacKey[3], (byte) 10);
		local4.p8(aLong269 * 5489047686998946493L);
		if (client.state * -849002901 == 14) {
			local4.p4(anIntArray442[0], (byte) -2);
			local4.p4(anIntArray442[1], (byte) -40);
			local4.p4(anIntArray442[2], (byte) 90);
			local4.p4(anIntArray442[3], (byte) 67);
		}
		anIntArray442 = currentIsaacKey;
		return local4;
	}

	@OriginalMember(owner = "client!m", name = "cg", descriptor = "()Lclient!alw;", line = 893)
	static Packet method28644() {
		@Pc(4) Packet local4 = new Packet(518);
		currentIsaacKey = new int[4];
		currentIsaacKey[0] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[1] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[2] = Class110_Sub9.secureRandom.nextInt();
		currentIsaacKey[3] = Class110_Sub9.secureRandom.nextInt();
		local4.p1(10, (byte) -66);
		local4.p4(currentIsaacKey[0], (byte) -98);
		local4.p4(currentIsaacKey[1], (byte) 46);
		local4.p4(currentIsaacKey[2], (byte) 29);
		local4.p4(currentIsaacKey[3], (byte) -71);
		local4.p8(aLong269 * 5489047686998946493L);
		if (client.state * -849002901 == 14) {
			local4.p4(anIntArray442[0], (byte) -100);
			local4.p4(anIntArray442[1], (byte) -16);
			local4.p4(anIntArray442[2], (byte) -43);
			local4.p4(anIntArray442[3], (byte) -42);
		}
		anIntArray442 = currentIsaacKey;
		return local4;
	}

	@OriginalMember(owner = "client!m", name = "cu", descriptor = "(Lclient!alw;J)V", line = 917)
	static void method28645(@OriginalArg(0) Packet arg0, @OriginalArg(1) long arg1) {
		@Pc(9) Class36 local9;
		if (aString199 != null && aString199.length() == 6) {
			if (aBoolean751) {
				local9 = Class36.aClass36_2;
			} else {
				local9 = Class36.aClass36_4;
			}
		} else if (Class266.aClass306_1.method26812(arg1)) {
			local9 = Class36.aClass36_1;
		} else {
			local9 = Class36.aClass36_3;
		}
		arg0.p1(local9.getId(), (byte) -27);
		switch(local9.anInt115 * 1351038807) {
			case 0:
				arg0.p4(Class266.aClass306_1.method26813(arg1), (byte) 44);
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(aString199), (byte) 52);
				arg0.pos += -1445626955;
				break;
			case 2:
				arg0.pos += -1487540524;
		}
	}

	@OriginalMember(owner = "client!m", name = "ci", descriptor = "(Lclient!alw;J)V", line = 917)
	static void method28646(@OriginalArg(0) Packet arg0, @OriginalArg(1) long arg1) {
		@Pc(9) Class36 local9;
		if (aString199 != null && aString199.length() == 6) {
			if (aBoolean751) {
				local9 = Class36.aClass36_2;
			} else {
				local9 = Class36.aClass36_4;
			}
		} else if (Class266.aClass306_1.method26812(arg1)) {
			local9 = Class36.aClass36_1;
		} else {
			local9 = Class36.aClass36_3;
		}
		arg0.p1(local9.getId(), (byte) -50);
		switch(local9.anInt115 * 1351038807) {
			case 0:
				arg0.p4(Class266.aClass306_1.method26813(arg1), (byte) -36);
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(aString199), (byte) 91);
				arg0.pos += -1445626955;
				break;
			case 2:
				arg0.pos += -1487540524;
		}
	}

	@OriginalMember(owner = "client!m", name = "ce", descriptor = "(Lclient!alw;J)V", line = 917)
	static void method28647(@OriginalArg(0) Packet arg0, @OriginalArg(1) long arg1) {
		@Pc(9) Class36 local9;
		if (aString199 != null && aString199.length() == 6) {
			if (aBoolean751) {
				local9 = Class36.aClass36_2;
			} else {
				local9 = Class36.aClass36_4;
			}
		} else if (Class266.aClass306_1.method26812(arg1)) {
			local9 = Class36.aClass36_1;
		} else {
			local9 = Class36.aClass36_3;
		}
		arg0.p1(local9.getId(), (byte) -11);
		switch(local9.anInt115 * 1351038807) {
			case 0:
				arg0.p4(Class266.aClass306_1.method26813(arg1), (byte) -13);
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(aString199), (byte) 40);
				arg0.pos += -1445626955;
				break;
			case 2:
				arg0.pos += -1487540524;
		}
	}

	@OriginalMember(owner = "client!m", name = "cn", descriptor = "()Lclient!alw;", line = 954)
	static Packet method28648() {
		@Pc(2) Packet local2 = Class346.startRsaPacket((byte) 52);
		if (client.state * -849002901 != 14) {
			@Pc(17) long local17;
			if (anInt4746 * 276097583 != -1) {
				local17 = anInt4746 * 276097583;
			} else if (ssoKeyIdentifier * 4457507688757033075L == -1L) {
				local17 = Class96_Sub3.method2330(username, -1716896789);
			} else {
				local17 = ssoKeyIdentifier * 4457507688757033075L;
			}
			Class413.totpTokenKey = local17 * 8666456646503961589L;
			Class709.writeTotp(local2, local17);
			local2.pbool(false, 666209987);
			local2.pjstr(aString201, -1190369981);
			local2.p8(ssoKey * -1009657282713816485L);
			local2.p8(client.ssoRandom * 6484786827691107089L);
		}
		local2.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -75);
		return local2;
	}

	@OriginalMember(owner = "client!m", name = "cv", descriptor = "(I)V", line = 978)
	static void method28649(@OriginalArg(0) int arg0) {
		if (target * -1128337797 == 132) {
			enterLobbyReply = arg0 * -977102185;
		} else if (target * -1128337797 == 211) {
			enterGameReply = arg0 * 449182681;
		}
	}

	@OriginalMember(owner = "client!m", name = "ca", descriptor = "(I)V", line = 978)
	static void method28650(@OriginalArg(0) int arg0) {
		if (target * -1128337797 == 132) {
			enterLobbyReply = arg0 * -977102185;
		} else if (target * -1128337797 == 211) {
			enterGameReply = arg0 * 449182681;
		}
	}

	@OriginalMember(owner = "client!m", name = "cp", descriptor = "(I)V", line = 978)
	static void method28651(@OriginalArg(0) int arg0) {
		if (target * -1128337797 == 132) {
			enterLobbyReply = arg0 * -977102185;
		} else if (target * -1128337797 == 211) {
			enterGameReply = arg0 * 449182681;
		}
	}

	@OriginalMember(owner = "client!m", name = "cx", descriptor = "()V", line = 983)
	static void method28652() {
		if (Class23.method502(client.state * -849002901, (byte) 10)) {
			if (client.aClass175_1.getStream((byte) -71) == null) {
				Class481.setState(17, 1823202236);
			} else {
				Class481.setState(13, 1823202236);
			}
		} else if (client.state * -849002901 == 17 || client.state * -849002901 == 7) {
			Class481.setState(4, 1823202236);
		} else if (client.state * -849002901 == 9) {
			Class481.setState(4, 1823202236);
		}
	}

	@OriginalMember(owner = "client!m", name = "cw", descriptor = "()V", line = 1017)
	static void method28653() {
		connection.clear(900590582);
		connection.packet.pos = 0;
		connection.prevServerPacketType1 = null;
		connection.prevServerPacketType2 = null;
		connection.prevServerPacketType3 = null;
		connection.anInt3298 = 0;
		client.anInt3453 = 0;
		client.anInt3572 = 0;
		client.anInt3444 = 0;
		client.anInt3573 = 0;
		client.aString146 = null;
		Class623.anInt5682 = 0;
		Class93_Sub1_Sub2.aClass170Array1 = null;
		Class581.aClass386_2 = null;
		Class279.aClass386_1 = null;
		client.aBoolean636 = true;
		ModeWhere.method36612((short) -15508);
		for (@Pc(42) int local42 = 0; local42 < Class624.aClass120_1.aClass675Array1.length; local42++) {
			@Pc(56) Class675 local56 = new Class675(Class336.aClass644_1.method32591(local42, (byte) 24), false);
			local56.method33143(0, 2056093099);
			local56.method33157(0, 479175137);
			Class624.aClass120_1.aClass675Array1[local42] = local56;
		}
		Class624.aClass120_1.aClass647_1.method32643((byte) -35);
		Class151.method13978(403003535);
		Class339.method27486(connection, (byte) 77);
	}

	@OriginalMember(owner = "client!m", name = "ct", descriptor = "()V", line = 1046)
	static void method28654() {
		Class63.method1162((byte) 55);
	}

	@OriginalMember(owner = "client!m", name = "cf", descriptor = "()V", line = 1050)
	static void method28655() {
		if (client.state * -849002901 == 19) {
			Class634.method32319(-1404531481);
		}
		client.aClass175_1.close((byte) 97);
		Class63.method1162((byte) 3);
		Class20.aBoolean10 = true;
		Class118.method8409(-1359375999);
		@Pc(17) int local17;
		for (local17 = 0; local17 < client.aClass173Array1.length; local17++) {
			client.aClass173Array1[local17] = null;
		}
		client.aBoolean625 = false;
		client.anInt3469 = ((int) (Math.random() * 100.0D) - 50) * -387671051;
		client.anInt3474 = ((int) (Math.random() * 110.0D) - 55) * 840469749;
		client.anInt3461 = ((int) (Math.random() * 80.0D) - 40) * -656769221;
		client.anInt3477 = ((int) (Math.random() * 120.0D) - 60) * -1165565815;
		client.anInt3478 = ((int) (Math.random() * 30.0D) - 20) * -1759455247;
		client.aFloat253 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Class599.method31835((byte) -101);
		for (local17 = 0; local17 < 2048; local17++) {
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local17] = null;
		}
		Class520.selfPlayer = null;
		client.anInt3540 = 0;
		client.anInt3488 = 0;
		client.aClass16_18.method225((byte) 124);
		client.aClass22_46.method405(-2037259486);
		client.aClass16_21.method225((byte) 71);
		client.aClass21_6.method377(-2096397824);
		client.aClass16_20.method225((byte) 92);
		Class93_Sub8.aClass22_18 = new Class22();
		Class93_Sub8.aClass22_19 = new Class22();
		Class26.anInt90 = 0;
		Class20.anInt70 = 0;
		Class165.anInt2068 = 0;
		Class366.anInt4585 = 0;
		Class256.anInt3853 = 0;
		Class545.anInt5289 = 0;
		Class349.anInt4201 = 0;
		Class290.anInt3911 = 0;
		Class5.anInt14 = 0;
		Class174.anInt3297 = 0;
		if (client.anInt3526 * -703563959 != -1) {
			Class535.method30697(client.anInt3526 * -703563959, -1484132347);
		}
		for (@Pc(161) Class93_Sub40 local161 = (Class93_Sub40) client.aClass16_22.method227((byte) -106); local161 != null; local161 = (Class93_Sub40) client.aClass16_22.method229(2001834142)) {
			if (!local161.method23970(-2051087328)) {
				local161 = (Class93_Sub40) client.aClass16_22.method227((byte) -8);
				if (local161 == null) {
					break;
				}
			}
			Class372.method28019(local161, true, false, 886296781);
		}
		client.anInt3526 = -823798521;
		client.aClass16_22 = new Class16(8);
		Class361.method27805((byte) -34);
		client.aClass312_7 = null;
		for (local17 = 0; local17 < 8; local17++) {
			client.aStringArray22[local17] = null;
			client.aBooleanArray20[local17] = false;
			client.anIntArray304[local17] = -1;
		}
		Class245.method25899((byte) -3);
		client.aBoolean630 = true;
		for (local17 = 0; local17 < 114; local17++) {
			client.aBooleanArray22[local17] = true;
		}
		for (local17 = 0; local17 < 3; local17++) {
			for (@Pc(240) int local240 = 0; local240 < 8; local240++) {
				client.aClass531ArrayArray1[local17][local240] = new Class531();
			}
		}
		client.world.method30494((byte) -30).method33015(420185819);
		client.aBoolean619 = true;
		Class610.aShortArray147 = Class336.aShortArray116 = Class47.aShortArray4 = new short[256];
		Class511.aString220 = Class74.aClass74_133.method1259(Class106.lang, (byte) 61);
		Class51.options.method14363(Class51.options.aClass166_Sub15_2, Class51.options.aClass166_Sub15_1.method15673(1704343135), (byte) 91);
		client.verifyId = 0;
		Class380.method28117((byte) 121);
		Class653.aClass678_2 = null;
		Class442.aLong276 = 0L;
	}

	@OriginalMember(owner = "client!m", name = "co", descriptor = "()Z", line = 1152)
	static boolean method28656() {
		if (client.state * -849002901 == 4) {
			return !Class251.method25969(958619699) && !Class631.method32280(2038707491);
		} else {
			return false;
		}
	}
}
