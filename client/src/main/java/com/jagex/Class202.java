package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public class Class202 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 4)
	Class202() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 9)
	public static String method24642(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local4 + local2);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z", line = 67)
	static boolean method24643(@OriginalArg(0) byte arg0) {
		return !Class228.method25615(client.state * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "(II)V", line = 142)
	public static void method24644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(12, (long) arg0);
		local4.method21885(2146298923);
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "(Ljava/lang/String;I)V", line = 168)
	static void method24645(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class676.aClass704_1 = Class704.aClass704_2;
		Class355.aString184 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "ty", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 8404)
	static final void method24646(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091] - 1;
		if (arg0.anInt4001 * 1553054515 != 6) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 12) {
			Class420.method28742(arg0, local27, local12, 1.0F, 0, 0, 0, 0, 0, 0, (byte) 101);
			Class354.method27694(arg0, -1174743804);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cc", name = "aru", descriptor = "(Lclient!yf;I)V", line = 12965)
	static final void method24647(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(42) boolean local42 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class149_Sub3.method12318(local13, local27, local42, (short) 4090);
	}
}
