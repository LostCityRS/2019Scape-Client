package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cx")
public final class Class218 {

	@OriginalMember(owner = "client!cx", name = "f", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method25868(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!cx", name = "e", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method25869(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!cx", name = "u", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method25870(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!cx", name = "l", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method25871(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!cx", name = "j", descriptor = "(I)Lclient!zi;")
	public static Class707 method25872(@OriginalArg(0) int arg0) {
		return Class499.aClass707_1 == null ? Class707.aClass707_13 : Class499.aClass707_1;
	}

	@OriginalMember(owner = "client!cx", name = "acn", descriptor = "(Lclient!yp;I)V")
	static void method25873(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27134((byte) -37) ? 1 : 0;
	}

	@OriginalMember(owner = "client!cx", name = "ait", descriptor = "(Lclient!yp;I)V")
	static void method25874(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.aClass453_1 = new Class453();
		arg0.aClass453_1.anInt4894 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] * -1867362097;
		arg0.aClass453_1.aClass80_Sub1_Sub19_1 = Class610.aClass52_2.method1073(arg0.aClass453_1.anInt4894 * 221296175, 2123429103);
		arg0.aClass453_1.anIntArray451 = new int[arg0.aClass453_1.aClass80_Sub1_Sub19_1.method23065((byte) -102)];
	}

	@OriginalMember(owner = "client!cx", name = "akw", descriptor = "(Lclient!yp;S)V")
	static void method25875(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		Class670.method33513(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 11);
	}

	@OriginalMember(owner = "client!cx", name = "avz", descriptor = "(Lclient!yp;B)V")
	static void method25876(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!cx", name = "aii", descriptor = "(Lclient!yp;I)V")
	static void method25877(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(17) Class80_Sub1_Sub19 local17 = Class610.aClass52_2.method1073(local12, 2106459278);
		if (local17.anIntArray281 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anIntArray281.length;
		}
	}

	@OriginalMember(owner = "client!cx", name = "e", descriptor = "(Lclient!pf;ILclient!aaf;I)Lclient!aan;")
	public static Class15 method25878(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) byte[] local4 = arg0.method29926(arg1, 1472047355);
		return local4 == null ? null : new Class15(local4, arg2);
	}

	@OriginalMember(owner = "client!cx", name = "<init>", descriptor = "()V")
	Class218() throws Throwable {
		throw new Error();
	}
}
