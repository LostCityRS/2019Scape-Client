package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@OriginalClass("client!zt")
public final class Class717 {

	@OriginalMember(owner = "client!zt", name = "t", descriptor = "[C")
	static final char[] aCharArray9 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zt", name = "f", descriptor = "[J")
	static long[] aLongArray29 = new long[12];

	static {
		for (@Pc(155) int local155 = 0; local155 < aLongArray29.length; local155++) {
			aLongArray29[local155] = (long) Math.pow(37.0D, (double) local155);
		}
	}

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "(Ljava/lang/CharSequence;)J")
	static long method37232(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!zt", name = "u", descriptor = "(Ljava/lang/CharSequence;)J")
	static long method37233(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!zt", name = "i", descriptor = "(J)Ljava/lang/String;")
	static String method37234(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!zt", name = "g", descriptor = "(J)Ljava/lang/String;")
	static String method37235(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!zt", name = "m", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
	public static String method37236(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class384.method28592(Class481.method30017(arg0, 2057097216));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!zt", name = "t", descriptor = "(I)J")
	public static long method37237(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) URL local14 = new URL(Class103_Sub9.method7878("services", false, (byte) -30) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Packet local50 = new Packet(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.data, local50.pos * -1380987821, 1000 - local50.pos * -1380987821);
				if (local65 == -1) {
					local50.pos = 0;
					return local50.g8();
				}
				local50.pos += local65 * 1034180571;
			} while (local50.pos * -1380987821 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!zt", name = "acg", descriptor = "(Lclient!yp;B)V")
	static void method37238(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.anInt4534 * -1263131029;
	}

	@OriginalMember(owner = "client!zt", name = "<init>", descriptor = "()V")
	Class717() throws Throwable {
		throw new Error();
	}
}
