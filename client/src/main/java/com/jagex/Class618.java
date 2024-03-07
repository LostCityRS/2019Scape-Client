package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class618 implements Interface75 {

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!vn;")
	public static final Class618 aClass618_5 = new Class618(0);

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!vn;")
	public static final Class618 aClass618_4 = new Class618(1);

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!vn;")
	public static final Class618 aClass618_3 = new Class618(2);

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	final int anInt5639;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(I)V", line = 17)
	Class618(@OriginalArg(0) int arg0) {
		this.anInt5639 = arg0 * -2034612027;
	}

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "()I", line = 22)
	@Override
	public int getId() {
		return this.anInt5639 * -738593267;
	}

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5639 * -738593267;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "(Ljava/lang/CharSequence;IZI)I", line = 84)
	static int method32098(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local56 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(95) int local95 = local23 * arg1 + local56;
			if (local23 != local95 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local95;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 127)
	static final String method32099(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)Lclient!zx;", line = 132)
	public static Class721 method32100(@OriginalArg(0) byte arg0) {
		return Class103.aClass721_1 == null ? Class721.aClass721_2 : Class103.aClass721_1;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "(B)V", line = 152)
	public static void method32101(@OriginalArg(0) byte arg0) {
		if (Class411.step * 327612781 == 103) {
			Class411.step = -228672666;
		}
	}

	@OriginalMember(owner = "client!vn", name = "pl", descriptor = "(Lclient!yf;I)V", line = 7790)
	static final void method32102(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1827895689);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class332.method27393(local16, local22, arg0, (byte) -1);
	}

	@OriginalMember(owner = "client!vn", name = "jc", descriptor = "(ZI)V", line = 10859)
	static final void computeTopLevelInterfaceLayout(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class568.method31298(client.topLevelInterface * -703563959, client.width * -1378711501, client.height * 2091353777, arg0, (byte) -4);
	}

	@OriginalMember(owner = "client!vn", name = "ahu", descriptor = "(Lclient!yf;B)V", line = 10862)
	static final void method32104(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.get(local23, -1792071388);
		if (local29.method1511(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class93_Sub1_Sub1) Class649.aClass55_Sub1_1.get(local13, -1868377509)).method1759(local23, local29.aString11, -203331809);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class93_Sub1_Sub1) Class649.aClass55_Sub1_1.get(local13, 501223273)).method1756(local23, local29.anInt265 * 951920133, (byte) -92);
		}
	}
}
