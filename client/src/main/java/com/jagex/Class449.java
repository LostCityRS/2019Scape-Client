package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public class Class449 {

	@OriginalMember(owner = "client!nu", name = "ir", descriptor = "Lclient!qr;")
	public static Class514 aClass514_1;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_12 = new Class449(14, 0);

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_11 = new Class449(15, -1);

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_3 = new Class449(16, -2);

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_2 = new Class449(19, -2);

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "Lclient!nu;")
	static final Class449 aClass449_4 = new Class449(23, 4);

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "Lclient!nu;")
	static final Class449 aClass449_5 = new Class449(24, -1);

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_7 = new Class449(26, 0);

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "Lclient!nu;")
	static final Class449 aClass449_1 = new Class449(27, 0);

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_6 = new Class449(28, -2);

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_8 = new Class449(29, -2);

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!nu;")
	public static final Class449 aClass449_10 = new Class449(30, -2);

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!nu;")
	static final Class449 aClass449_9 = new Class449(31, 4);

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "[Lclient!nu;")
	static final Class449[] aClass449Array1 = new Class449[32];

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
	public final int anInt4980;

	static {
		@Pc(77) Class449[] local77 = Class53.method14943(-1396233847);
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass449Array1[local77[local79].anInt4980 * 1690737369] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(Lclient!alw;I)Lclient!la;", line = 21)
	public static Class133 method28926(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.gSmart2or4null(-1215915305);
		@Pc(10) Class390 local10 = Class708.method36753(1635987414)[arg0.g1((short) 16384)];
		@Pc(17) Class392 local17 = Class252.method25976(-2134249016)[arg0.g1((short) 16384)];
		@Pc(21) int local21 = arg0.g2s((byte) -123);
		@Pc(25) int local25 = arg0.g2s((byte) -63);
		return new Class133(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "()[Lclient!nu;", line = 28)
	static Class449[] method28927() {
		return new Class449[] { aClass449_1, aClass449_9, aClass449_11, aClass449_2, aClass449_10, aClass449_5, aClass449_8, aClass449_7, aClass449_4, aClass449_6, aClass449_3, aClass449_12 };
	}

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "()[Lclient!nu;", line = 28)
	static Class449[] method28928() {
		return new Class449[] { aClass449_1, aClass449_9, aClass449_11, aClass449_2, aClass449_10, aClass449_5, aClass449_8, aClass449_7, aClass449_4, aClass449_6, aClass449_3, aClass449_12 };
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(II)V", line = 31)
	Class449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4980 = arg0 * -864139927;
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)[Lclient!ht;", line = 134)
	static Class323[] method28929(@OriginalArg(0) int arg0) {
		return new Class323[] { Class323.aClass323_32, Class323.aClass323_8, Class323.aClass323_9, Class323.aClass323_10, Class323.aClass323_11, Class323.aClass323_12, Class323.aClass323_13, Class323.aClass323_14, Class323.aClass323_15, Class323.aClass323_68, Class323.aClass323_17, Class323.aClass323_18, Class323.aClass323_19, Class323.aClass323_26, Class323.aClass323_21, Class323.aClass323_89, Class323.aClass323_23, Class323.aClass323_99, Class323.aClass323_25, Class323.aClass323_20, Class323.aClass323_75, Class323.aClass323_28, Class323.aClass323_29, Class323.aClass323_16, Class323.aClass323_92, Class323.aClass323_63, Class323.aClass323_107, Class323.aClass323_34, Class323.aClass323_104, Class323.aClass323_36, Class323.aClass323_82, Class323.aClass323_56, Class323.aClass323_39, Class323.aClass323_37, Class323.aClass323_41, Class323.aClass323_42, Class323.aClass323_43, Class323.aClass323_44, Class323.aClass323_45, Class323.aClass323_46, Class323.aClass323_47, Class323.aClass323_48, Class323.aClass323_85, Class323.aClass323_50, Class323.aClass323_51, Class323.aClass323_76, Class323.aClass323_106, Class323.aClass323_54, Class323.aClass323_55, Class323.aClass323_52, Class323.aClass323_57, Class323.aClass323_58, Class323.aClass323_111, Class323.aClass323_60, Class323.aClass323_61, Class323.aClass323_112, Class323.aClass323_27, Class323.aClass323_64, Class323.aClass323_65, Class323.aClass323_66, Class323.aClass323_67, Class323.aClass323_71, Class323.aClass323_69, Class323.aClass323_70, Class323.aClass323_109, Class323.aClass323_72, Class323.aClass323_73, Class323.aClass323_74, Class323.aClass323_90, Class323.aClass323_35, Class323.aClass323_77, Class323.aClass323_78, Class323.aClass323_62, Class323.aClass323_105, Class323.aClass323_80, Class323.aClass323_81, Class323.aClass323_79, Class323.aClass323_83, Class323.aClass323_84, Class323.aClass323_22, Class323.aClass323_86, Class323.aClass323_87, Class323.aClass323_88, Class323.aClass323_33, Class323.aClass323_40, Class323.aClass323_91, Class323.aClass323_31, Class323.aClass323_93, Class323.aClass323_94, Class323.aClass323_95, Class323.aClass323_49, Class323.aClass323_97, Class323.aClass323_98, Class323.aClass323_115, Class323.aClass323_100, Class323.aClass323_101, Class323.aClass323_102, Class323.aClass323_108, Class323.aClass323_7, Class323.aClass323_129, Class323.aClass323_30, Class323.aClass323_24, Class323.aClass323_59, Class323.aClass323_96, Class323.aClass323_110, Class323.aClass323_103, Class323.aClass323_38, Class323.aClass323_113, Class323.aClass323_114, Class323.aClass323_53, Class323.aClass323_116, Class323.aClass323_117, Class323.aClass323_118, Class323.aClass323_119, Class323.aClass323_120, Class323.aClass323_121, Class323.aClass323_122, Class323.aClass323_123, Class323.aClass323_124, Class323.aClass323_125, Class323.aClass323_126, Class323.aClass323_127, Class323.aClass323_128, Class323.aClass323_131, Class323.aClass323_130 };
	}

	@OriginalMember(owner = "client!nu", name = "iv", descriptor = "(Lclient!yf;I)V", line = 6484)
	static final void method28930(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24574(local11, local14, arg0, -977933591);
	}

	@OriginalMember(owner = "client!nu", name = "za", descriptor = "(Lclient!yf;I)V", line = 9393)
	static final void method28931(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass523_7.method30365(1285948352) >> 3;
	}

	@OriginalMember(owner = "client!nu", name = "ant", descriptor = "(Lclient!yf;B)V", line = 12263)
	static final void method28932(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class65.aClass123_Sub1_2.method8937(Class180.method24518(local12, (byte) -1), true, -1917523624);
		client.aBoolean619 = true;
	}
}
