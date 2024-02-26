package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class256 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!da;")
	static Class109 aClass109_2;

	@OriginalMember(owner = "client!f", name = "az", descriptor = "I")
	public static int anInt3886;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Ljava/lang/String;")
	static String aString159 = "true";

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString157 = ",";

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Ljava/lang/String;")
	static String aString162 = " (";

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Ljava/lang/String;")
	static String aString160 = ")";

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Ljava/lang/String;")
	static String aString158 = "->";

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString161 = "<br>";

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Ljava/lang/String;")
	static String aString156 = "</col>";

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString163 = "<name>";

	@OriginalMember(owner = "client!f", name = "u", descriptor = "(I)Ljava/lang/String;")
	public static String method26409(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(I)Ljava/lang/String;")
	public static String method26410(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method26411(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method26412(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "(I)Ljava/lang/String;")
	public static String method26413(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(II)I")
	static int method26414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!f", name = "vk", descriptor = "(Lclient!yp;I)V")
	static void method26415(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(37) Class327 local37 = Class301.method27041(local33, 2132136525);
		Class448.method29259(local37, local13, local23, -1024080817);
	}

	@OriginalMember(owner = "client!f", name = "aak", descriptor = "(Lclient!yp;I)V")
	static void method26416(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.aString148 == null || local12 >= Class274.anInt3924 * -912877411) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class14.aClass164Array1[local12].anInt2090 * 767402031;
		}
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "(I)I")
	public static int method26417(@OriginalArg(0) int arg0) {
		return Class654.anInt5665 * 2087772395;
	}

	@OriginalMember(owner = "client!f", name = "sc", descriptor = "(Lclient!yp;I)V")
	static void method26418(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4148 * -965284535;
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	Class256() throws Throwable {
		throw new Error();
	}
}
