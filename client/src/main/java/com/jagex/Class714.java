package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zq")
public final class Class714 {

	@OriginalMember(owner = "client!zq", name = "e", descriptor = "[C")
	static final char[] aCharArray9 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zq", name = "n", descriptor = "[J")
	static long[] aLongArray29 = new long[12];

	static {
		for (@Pc(155) int local155 = 0; local155 < aLongArray29.length; local155++) {
			aLongArray29[local155] = (long) Math.pow(37.0D, (double) local155);
		}
	}

	@OriginalMember(owner = "client!zq", name = "<init>", descriptor = "()V", line = 11)
	Class714() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zq", name = "f", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method36861(@OriginalArg(0) long arg0) {
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

	@OriginalMember(owner = "client!zq", name = "k", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method36862(@OriginalArg(0) long arg0) {
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

	@OriginalMember(owner = "client!zq", name = "w", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method36863(@OriginalArg(0) long arg0) {
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

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method36864(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class607.method31922(Class685.method33429(arg0, (byte) -1));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!zq", name = "oq", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7528)
	static final void method36865(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray18 = Class499.method30149(local13, arg2, 632480741);
		arg0.aBoolean680 = true;
	}
}
