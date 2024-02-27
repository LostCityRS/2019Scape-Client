package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class430 {

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/String;")
	static String aString211 = "true";

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString213 = ",";

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Ljava/lang/String;")
	static String aString212 = " (";

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/String;")
	static String aString214 = ")";

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Ljava/lang/String;")
	static String aString215 = "->";

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString216 = "<br>";

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/String;")
	static String aString217 = "</col>";

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString218 = "<name>";

	@OriginalMember(owner = "client!n", name = "m", descriptor = "(I)Ljava/lang/String;")
	public static String method28937(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!n", name = "k", descriptor = "(I)Ljava/lang/String;")
	public static String method28938(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)Ljava/lang/String;")
	public static String method28939(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!n", name = "u", descriptor = "(I)V")
	static void method28940(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) File local5 = new File(Class485.aString225, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				Class553.aClass42_4 = new Class42(new Class38(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class133.aStringArray16.length; local23++) {
					for (local29 = 0; local29 < Class676.aStringArray38.length; local29++) {
						@Pc(53) File local53 = new File(Class676.aStringArray38[local29] + Class133.aStringArray16[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							Class553.aClass42_4 = new Class42(new Class38(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (Class553.aClass42_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				Class553.aClass42_4 = new Class42(new Class38(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)[Lclient!cr;")
	static Class211[] method28941(@OriginalArg(0) int arg0) {
		return new Class211[] { Class211.aClass211_12, Class211.aClass211_6, Class211.aClass211_3, Class211.aClass211_4, Class211.aClass211_5, Class211.aClass211_10, Class211.aClass211_1, Class211.aClass211_8, Class211.aClass211_9, Class211.aClass211_15, Class211.aClass211_7, Class211.aClass211_11, Class211.aClass211_13, Class211.aClass211_14, Class211.aClass211_2, Class211.aClass211_16, Class211.aClass211_17 };
	}

	@OriginalMember(owner = "client!n", name = "ir", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28942(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] - 1;
		if (local14 >= 0 && local14 <= 9) {
			arg0.method26948(local14, (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375], (byte) 0);
		} else {
			arg2.anInt6049 -= 957530791;
		}
	}

	@OriginalMember(owner = "client!n", name = "lf", descriptor = "(Lclient!hf;Lclient!yf;I)V")
	static void method28943(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		arg1.anInt6052 -= -725861497;
		@Pc(15) int local15 = arg1.anIntArray521[arg1.anInt6052 * -1497248091] - 1;
		@Pc(25) int local25 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 1];
		@Pc(35) int local35 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 2];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class513.method30444(arg0, local15, local25, local35, arg1, (short) 5298);
	}

	@OriginalMember(owner = "client!n", name = "adl", descriptor = "(Lclient!yf;I)V")
	static void method28944(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class253.aClass93_Sub28_3 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
			arg0.aClass93_Sub28_4 = Class253.aClass93_Sub28_3;
		}
	}

	@OriginalMember(owner = "client!n", name = "mf", descriptor = "(II)Lclient!adh;")
	public static Class82 method28945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class82 local5 = (Class82) client.aClass240_67.method25932((long) arg0);
		if (local5 == null) {
			local5 = new Class82(Class621.aClass497_135, Class174.method24356(arg0, (byte) -61), Class57.method1089(arg0, -52780061));
			client.aClass240_67.method25923(local5, (long) arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!yf;I)V")
	static void method28946(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) 81);
		if (local16 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.method25487();
		}
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	Class430() throws Throwable {
		throw new Error();
	}
}
