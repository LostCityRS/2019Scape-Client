package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class607 implements Interface75 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!va;")
	public static final Class607 aClass607_13 = new Class607(0, 0);

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!va;")
	public static final Class607 aClass607_3 = new Class607(1, 0);

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!va;")
	public static final Class607 aClass607_16 = new Class607(2, 0);

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!va;")
	public static final Class607 aClass607_5 = new Class607(3, 0);

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!va;")
	public static final Class607 aClass607_20 = new Class607(9, 2);

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!va;")
	public static final Class607 aClass607_24 = new Class607(4, 1);

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!va;")
	public static final Class607 aClass607_2 = new Class607(5, 1);

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!va;")
	public static final Class607 aClass607_8 = new Class607(6, 1);

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!va;")
	public static final Class607 aClass607_9 = new Class607(7, 1);

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!va;")
	public static final Class607 aClass607_7 = new Class607(8, 1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!va;")
	static final Class607 aClass607_11 = new Class607(12, 2);

	@OriginalMember(owner = "client!va", name = "s", descriptor = "Lclient!va;")
	public static final Class607 aClass607_12 = new Class607(13, 2);

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!va;")
	static final Class607 aClass607_23 = new Class607(14, 2);

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!va;")
	static final Class607 aClass607_14 = new Class607(15, 2);

	@OriginalMember(owner = "client!va", name = "w", descriptor = "Lclient!va;")
	static final Class607 aClass607_15 = new Class607(16, 2);

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!va;")
	static final Class607 aClass607_6 = new Class607(17, 2);

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!va;")
	static final Class607 aClass607_17 = new Class607(18, 2);

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!va;")
	static final Class607 aClass607_18 = new Class607(19, 2);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!va;")
	static final Class607 aClass607_19 = new Class607(20, 2);

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!va;")
	static final Class607 aClass607_4 = new Class607(21, 2);

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!va;")
	public static final Class607 aClass607_21 = new Class607(10, 2);

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!va;")
	public static final Class607 aClass607_22 = new Class607(11, 2);

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!va;")
	public static final Class607 aClass607_10 = new Class607(22, 3);

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public final int anInt5396;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public final int anInt5397;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "(I)Z")
	public static boolean method32167(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_17.anInt5396 * 1323580581 && arg0 <= aClass607_4.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "j", descriptor = "()[Lclient!va;")
	public static Class607[] method32168() {
		return new Class607[] { aClass607_5, aClass607_20, aClass607_21, aClass607_22, aClass607_3, aClass607_13, aClass607_17, aClass607_19, aClass607_14, aClass607_2, aClass607_9, aClass607_6, aClass607_11, aClass607_23, aClass607_7, aClass607_24, aClass607_16, aClass607_18, aClass607_4, aClass607_8, aClass607_12, aClass607_10, aClass607_15 };
	}

	@OriginalMember(owner = "client!va", name = "o", descriptor = "()[Lclient!va;")
	public static Class607[] method32169() {
		return new Class607[] { aClass607_5, aClass607_20, aClass607_21, aClass607_22, aClass607_3, aClass607_13, aClass607_17, aClass607_19, aClass607_14, aClass607_2, aClass607_9, aClass607_6, aClass607_11, aClass607_23, aClass607_7, aClass607_24, aClass607_16, aClass607_18, aClass607_4, aClass607_8, aClass607_12, aClass607_10, aClass607_15 };
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
	public static boolean method32170(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_13.anInt5396 * 1323580581 && arg0 <= aClass607_5.anInt5396 * 1323580581 || arg0 == aClass607_20.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "s", descriptor = "(I)Z")
	public static boolean method32171(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_13.anInt5396 * 1323580581 && arg0 <= aClass607_5.anInt5396 * 1323580581 || arg0 == aClass607_20.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "k", descriptor = "(I)Z")
	static boolean method32172(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_24.anInt5396 * 1323580581 && arg0 <= aClass607_7.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "w", descriptor = "(I)Z")
	public static boolean method32173(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_11.anInt5396 * 1323580581 && arg0 <= aClass607_6.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "x", descriptor = "(I)Z")
	static boolean method32174(@OriginalArg(0) int arg0) {
		return arg0 >= aClass607_24.anInt5396 * 1323580581 && arg0 <= aClass607_7.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "t", descriptor = "(I)[Lclient!nu;")
	public static Class448[] method32175(@OriginalArg(0) int arg0) {
		return new Class448[] { Class448.aClass448_79, Class448.aClass448_6, Class448.aClass448_7, Class448.aClass448_8, Class448.aClass448_9, Class448.aClass448_97, Class448.aClass448_11, Class448.aClass448_12, Class448.aClass448_13, Class448.aClass448_63, Class448.aClass448_15, Class448.aClass448_16, Class448.aClass448_10, Class448.aClass448_18, Class448.aClass448_19, Class448.aClass448_126, Class448.aClass448_150, Class448.aClass448_34, Class448.aClass448_23, Class448.aClass448_24, Class448.aClass448_57, Class448.aClass448_26, Class448.aClass448_76, Class448.aClass448_28, Class448.aClass448_29, Class448.aClass448_141, Class448.aClass448_105, Class448.aClass448_108, Class448.aClass448_33, Class448.aClass448_184, Class448.aClass448_35, Class448.aClass448_36, Class448.aClass448_37, Class448.aClass448_38, Class448.aClass448_42, Class448.aClass448_40, Class448.aClass448_86, Class448.aClass448_174, Class448.aClass448_43, Class448.aClass448_44, Class448.aClass448_45, Class448.aClass448_127, Class448.aClass448_47, Class448.aClass448_48, Class448.aClass448_49, Class448.aClass448_55, Class448.aClass448_50, Class448.aClass448_122, Class448.aClass448_128, Class448.aClass448_52, Class448.aClass448_53, Class448.aClass448_54, Class448.aClass448_17, Class448.aClass448_56, Class448.aClass448_152, Class448.aClass448_58, Class448.aClass448_59, Class448.aClass448_60, Class448.aClass448_61, Class448.aClass448_62, Class448.aClass448_157, Class448.aClass448_64, Class448.aClass448_185, Class448.aClass448_66, Class448.aClass448_67, Class448.aClass448_167, Class448.aClass448_69, Class448.aClass448_110, Class448.aClass448_71, Class448.aClass448_72, Class448.aClass448_73, Class448.aClass448_74, Class448.aClass448_75, Class448.aClass448_70, Class448.aClass448_77, Class448.aClass448_21, Class448.aClass448_129, Class448.aClass448_80, Class448.aClass448_20, Class448.aClass448_82, Class448.aClass448_83, Class448.aClass448_31, Class448.aClass448_85, Class448.aClass448_163, Class448.aClass448_87, Class448.aClass448_88, Class448.aClass448_112, Class448.aClass448_90, Class448.aClass448_91, Class448.aClass448_92, Class448.aClass448_93, Class448.aClass448_27, Class448.aClass448_95, Class448.aClass448_96, Class448.aClass448_25, Class448.aClass448_22, Class448.aClass448_99, Class448.aClass448_100, Class448.aClass448_101, Class448.aClass448_102, Class448.aClass448_103, Class448.aClass448_191, Class448.aClass448_172, Class448.aClass448_98, Class448.aClass448_140, Class448.aClass448_32, Class448.aClass448_109, Class448.aClass448_137, Class448.aClass448_111, Class448.aClass448_89, Class448.aClass448_30, Class448.aClass448_114, Class448.aClass448_115, Class448.aClass448_116, Class448.aClass448_117, Class448.aClass448_186, Class448.aClass448_119, Class448.aClass448_120, Class448.aClass448_121, Class448.aClass448_68, Class448.aClass448_123, Class448.aClass448_124, Class448.aClass448_125, Class448.aClass448_107, Class448.aClass448_198, Class448.aClass448_118, Class448.aClass448_78, Class448.aClass448_130, Class448.aClass448_131, Class448.aClass448_132, Class448.aClass448_133, Class448.aClass448_134, Class448.aClass448_135, Class448.aClass448_136, Class448.aClass448_5, Class448.aClass448_197, Class448.aClass448_139, Class448.aClass448_113, Class448.aClass448_153, Class448.aClass448_142, Class448.aClass448_143, Class448.aClass448_144, Class448.aClass448_145, Class448.aClass448_177, Class448.aClass448_147, Class448.aClass448_148, Class448.aClass448_149, Class448.aClass448_138, Class448.aClass448_151, Class448.aClass448_104, Class448.aClass448_171, Class448.aClass448_154, Class448.aClass448_155, Class448.aClass448_156, Class448.aClass448_170, Class448.aClass448_158, Class448.aClass448_159, Class448.aClass448_160, Class448.aClass448_161, Class448.aClass448_162, Class448.aClass448_65, Class448.aClass448_164, Class448.aClass448_165, Class448.aClass448_166, Class448.aClass448_46, Class448.aClass448_168, Class448.aClass448_169, Class448.aClass448_81, Class448.aClass448_106, Class448.aClass448_146, Class448.aClass448_173, Class448.aClass448_84, Class448.aClass448_175, Class448.aClass448_176, Class448.aClass448_14, Class448.aClass448_178, Class448.aClass448_179, Class448.aClass448_180, Class448.aClass448_181, Class448.aClass448_182, Class448.aClass448_183, Class448.aClass448_39, Class448.aClass448_41, Class448.aClass448_51, Class448.aClass448_187, Class448.aClass448_188, Class448.aClass448_189, Class448.aClass448_190, Class448.aClass448_199, Class448.aClass448_192, Class448.aClass448_193, Class448.aClass448_194, Class448.aClass448_195, Class448.aClass448_196, Class448.aClass448_94 };
	}

	@OriginalMember(owner = "client!va", name = "j", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method32176(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method32176(arg0, arg1, arg2, local10 - 1, -663392479);
		method32176(arg0, arg1, local10 + 1, arg3, -1066950403);
	}

	@OriginalMember(owner = "client!va", name = "yy", descriptor = "(Lclient!yp;B)V")
	static void method32177(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class80_Sub1_Sub11 local2 = Class491.method30258(730231088);
		if (Class123_Sub2_Sub3.method20550(local2, (byte) -51) == 7) {
			@Pc(12) int local12 = (int) local2.method22273(-427988879);
			if (local12 >= 0 && local12 <= Class51.anInt191 * 44967471) {
				@Pc(23) Class120_Sub1_Sub1_Sub1_Sub2 local23 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local23 != null) {
					arg0.aClass120_Sub1_Sub1_Sub1_4 = local23;
					arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
					return;
				}
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!va", name = "all", descriptor = "(Lclient!yp;I)V")
	static void method32178(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (Class13.aBoolean5) {
			Class126.method20383(3, local13, local23, false, 1615516245);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class411.aFrame2 == null ? 0 : 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!va", name = "aqp", descriptor = "(Lclient!yp;I)V")
	static void method32179(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!va", name = "hf", descriptor = "(Lclient!yp;I)V")
	static void method32180(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, false, 2, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!va", name = "ahf", descriptor = "(Lclient!yp;B)V")
	static void method32181(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(17) Class80_Sub1_Sub14 local17 = Class67.method1242(local13, 1680882701);
		if (local17 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anInt3099 * 124104349;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class682.method36709(local17.aLong262 * -7838853670110439257L, Class512.aClass719_3.anInt5827 * 379080821, -1397778195);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anInt3102 * 2118734045;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.aString111 == null ? "" : local17.aString111;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.aString110 == null ? "" : local17.aString110;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.aString113 == null ? "" : local17.aString113;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.aString114 == null ? "" : local17.aString114;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anInt3101 * -949162007;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.aString112 == null ? "" : local17.aString112;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.aClass452_1 == null ? -1 : local17.aClass452_1.getId();
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!va", name = "la", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32182(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4164 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -1618545703;
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
	Class607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5396 = arg0 * 2014923565;
		this.anInt5397 = arg1 * -409985271;
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5396 * 1323580581;
	}
}
