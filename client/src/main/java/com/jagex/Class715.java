package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zr")
public final class Class715 {

	@OriginalMember(owner = "client!zr", name = "t", descriptor = "[C")
	static char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!zr", name = "f", descriptor = "[C")
	static char[] aCharArray7;

	@OriginalMember(owner = "client!zr", name = "e", descriptor = "[C")
	static char[] aCharArray8;

	@OriginalMember(owner = "client!zr", name = "u", descriptor = "[I")
	static int[] anIntArray531;

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray6[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray6[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
		aCharArray7 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray7[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray7[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray7[62] = '*';
		aCharArray7[63] = '-';
		aCharArray8 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray8[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray8[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray8[62] = '-';
		aCharArray8[63] = '_';
		anIntArray531 = new int[128];
		for (local4 = 0; local4 < anIntArray531.length; local4++) {
			anIntArray531[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray531[local4] = local4 - 65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray531[local4] = local4 - 97 + 26;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray531[local4] = local4 - 48 + 52;
		}
		@Pc(230) int[] local230 = anIntArray531;
		anIntArray531[43] = 62;
		local230[42] = 62;
		@Pc(240) int[] local240 = anIntArray531;
		anIntArray531[47] = 63;
		local240[45] = 63;
	}

	@OriginalMember(owner = "client!zr", name = "e", descriptor = "([B)Ljava/lang/String;")
	public static String method37213(@OriginalArg(0) byte[] arg0) {
		return Class432.method29095(arg0, 0, arg0.length, -1521363994);
	}

	@OriginalMember(owner = "client!zr", name = "u", descriptor = "([BII)Ljava/lang/String;")
	static String method37214(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray6[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray6[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray6[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray6[local64 & 0x3F]);
				} else {
					local3.append(aCharArray6[(local37 & 0xF) << 2]).append("=");
				}
			} else {
				local3.append(aCharArray6[(local16 & 0x3) << 4]).append("==");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!zr", name = "l", descriptor = "([BII)Ljava/lang/String;")
	static String method37215(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray6[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray6[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray6[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray6[local64 & 0x3F]);
				} else {
					local3.append(aCharArray6[(local37 & 0xF) << 2]).append("=");
				}
			} else {
				local3.append(aCharArray6[(local16 & 0x3) << 4]).append("==");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!zr", name = "nk", descriptor = "(Ljava/lang/String;I)V")
	static void method37216(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		client.aString147 = arg0;
		if (Class651.method33131(-1799516679) == Class544.aClass544_3) {
			return;
		}
		try {
			@Pc(11) String local11 = Class306.anApplet1.getParameter(Class469.aClass469_25.aString210);
			@Pc(16) String local16 = Class306.anApplet1.getParameter(Class469.aClass469_26.aString210);
			@Pc(31) String local31 = local11 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Class596.method31997(Class303.method27111((byte) 12) + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Class64.method1225(Class306.anApplet1, "document.cookie=\"" + local31 + "\"", (byte) 0);
		} catch (@Pc(78) Throwable local78) {
		}
	}

	@OriginalMember(owner = "client!zr", name = "awa", descriptor = "(Lclient!yp;S)V")
	static void method37217(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(2) Class163_Sub1 local2 = Class573.method31747(-295910752);
		if (local2 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2086 * -1140092917;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2081 * -682140789;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.aString63;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.method15766(-1040473265);
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.method15767((byte) -37);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2083 * -263101925;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2087 * 1438063139;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.aString61;
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!zr", name = "aid", descriptor = "(Lclient!yp;B)V")
	static void method37218(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class71.aClass510_2.method30536(local12, 1308435745).aString115;
	}

	@OriginalMember(owner = "client!zr", name = "<init>", descriptor = "()V")
	Class715() throws Throwable {
		throw new Error();
	}
}
