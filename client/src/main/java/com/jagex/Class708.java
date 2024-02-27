package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zk")
public final class Class708 {

	@OriginalMember(owner = "client!zk", name = "e", descriptor = "[C")
	static char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!zk", name = "n", descriptor = "[C")
	static char[] aCharArray6;

	@OriginalMember(owner = "client!zk", name = "m", descriptor = "[C")
	static char[] aCharArray7;

	@OriginalMember(owner = "client!zk", name = "k", descriptor = "[I")
	static int[] anIntArray529;

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray5[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray5[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray5[62] = '+';
		aCharArray5[63] = '/';
		aCharArray6 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray6[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray6[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray6[62] = '*';
		aCharArray6[63] = '-';
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
		aCharArray7[62] = '-';
		aCharArray7[63] = '_';
		anIntArray529 = new int[128];
		for (local4 = 0; local4 < anIntArray529.length; local4++) {
			anIntArray529[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray529[local4] = local4 - 65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray529[local4] = local4 - 97 + 26;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray529[local4] = local4 - 48 + 52;
		}
		@Pc(230) int[] local230 = anIntArray529;
		anIntArray529[43] = 62;
		local230[42] = 62;
		@Pc(240) int[] local240 = anIntArray529;
		anIntArray529[47] = 63;
		local240[45] = 63;
	}

	@OriginalMember(owner = "client!zk", name = "k", descriptor = "([B)Ljava/lang/String;")
	public static String method36934(@OriginalArg(0) byte[] arg0) {
		return Class189.method24595(arg0, 0, arg0.length, 535657697);
	}

	@OriginalMember(owner = "client!zk", name = "m", descriptor = "([B)Ljava/lang/String;")
	public static String method36935(@OriginalArg(0) byte[] arg0) {
		return Class189.method24595(arg0, 0, arg0.length, 1966777607);
	}

	@OriginalMember(owner = "client!zk", name = "f", descriptor = "([BII)Ljava/lang/String;")
	static String method36936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray5[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray5[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray5[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray5[local64 & 0x3F]);
				} else {
					local3.append(aCharArray5[(local37 & 0xF) << 2]).append("=");
				}
			} else {
				local3.append(aCharArray5[(local16 & 0x3) << 4]).append("==");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!zk", name = "e", descriptor = "(I)[Lclient!kv;")
	public static Class390[] method36937(@OriginalArg(0) int arg0) {
		return new Class390[] { Class390.aClass390_13, Class390.aClass390_11, Class390.aClass390_12 };
	}

	@OriginalMember(owner = "client!zk", name = "bdf", descriptor = "(Lclient!yf;B)V")
	static void method36938(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26370(local12, -68158500);
	}

	@OriginalMember(owner = "client!zk", name = "<init>", descriptor = "()V")
	Class708() throws Throwable {
		throw new Error();
	}
}
