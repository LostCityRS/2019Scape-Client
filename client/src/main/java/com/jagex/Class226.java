package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class226 {

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
	public final int anInt3625;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public final int anInt3627;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	final int anInt3624;

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
	public final int anInt3626;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(Ljava/lang/String;B)I")
	public static int method25964(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return Class669.aTwitchTV1.SetStreamTitle(arg0, client.aClass722_4.aString248);
	}

	@OriginalMember(owner = "client!dk", name = "bdl", descriptor = "(Lclient!yp;I)V")
	static void method25965(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class723.method37345(Class159_Sub1.anInt2016 * -102322281, (byte) -63);
	}

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "(B)[Lclient!hl;")
	static Class317[] method25966(@OriginalArg(0) byte arg0) {
		return new Class317[] { Class317.aClass317_118, Class317.aClass317_9, Class317.aClass317_10, Class317.aClass317_11, Class317.aClass317_12, Class317.aClass317_13, Class317.aClass317_25, Class317.aClass317_15, Class317.aClass317_16, Class317.aClass317_17, Class317.aClass317_56, Class317.aClass317_51, Class317.aClass317_20, Class317.aClass317_21, Class317.aClass317_22, Class317.aClass317_23, Class317.aClass317_35, Class317.aClass317_128, Class317.aClass317_26, Class317.aClass317_133, Class317.aClass317_103, Class317.aClass317_29, Class317.aClass317_30, Class317.aClass317_31, Class317.aClass317_32, Class317.aClass317_34, Class317.aClass317_106, Class317.aClass317_91, Class317.aClass317_36, Class317.aClass317_37, Class317.aClass317_38, Class317.aClass317_39, Class317.aClass317_40, Class317.aClass317_41, Class317.aClass317_18, Class317.aClass317_55, Class317.aClass317_44, Class317.aClass317_96, Class317.aClass317_46, Class317.aClass317_47, Class317.aClass317_48, Class317.aClass317_49, Class317.aClass317_90, Class317.aClass317_130, Class317.aClass317_52, Class317.aClass317_123, Class317.aClass317_54, Class317.aClass317_24, Class317.aClass317_28, Class317.aClass317_57, Class317.aClass317_58, Class317.aClass317_59, Class317.aClass317_60, Class317.aClass317_80, Class317.aClass317_62, Class317.aClass317_63, Class317.aClass317_64, Class317.aClass317_45, Class317.aClass317_66, Class317.aClass317_79, Class317.aClass317_68, Class317.aClass317_69, Class317.aClass317_70, Class317.aClass317_19, Class317.aClass317_42, Class317.aClass317_73, Class317.aClass317_74, Class317.aClass317_112, Class317.aClass317_33, Class317.aClass317_77, Class317.aClass317_78, Class317.aClass317_84, Class317.aClass317_97, Class317.aClass317_81, Class317.aClass317_82, Class317.aClass317_83, Class317.aClass317_67, Class317.aClass317_85, Class317.aClass317_86, Class317.aClass317_87, Class317.aClass317_88, Class317.aClass317_89, Class317.aClass317_71, Class317.aClass317_102, Class317.aClass317_92, Class317.aClass317_93, Class317.aClass317_94, Class317.aClass317_95, Class317.aClass317_105, Class317.aClass317_76, Class317.aClass317_98, Class317.aClass317_99, Class317.aClass317_100, Class317.aClass317_101, Class317.aClass317_114, Class317.aClass317_109, Class317.aClass317_104, Class317.aClass317_129, Class317.aClass317_53, Class317.aClass317_107, Class317.aClass317_108, Class317.aClass317_27, Class317.aClass317_110, Class317.aClass317_111, Class317.aClass317_61, Class317.aClass317_113, Class317.aClass317_75, Class317.aClass317_115, Class317.aClass317_116, Class317.aClass317_117, Class317.aClass317_121, Class317.aClass317_119, Class317.aClass317_120, Class317.aClass317_72, Class317.aClass317_122, Class317.aClass317_14, Class317.aClass317_124, Class317.aClass317_125, Class317.aClass317_126, Class317.aClass317_127, Class317.aClass317_43, Class317.aClass317_50, Class317.aClass317_65, Class317.aClass317_131, Class317.aClass317_132 };
	}

	@OriginalMember(owner = "client!dk", name = "tw", descriptor = "(Lclient!yp;B)V")
	static void method25967(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class266.method26656(local11, arg0, (byte) 21);
	}

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "(Lclient!th;Lclient!th;B)V")
	public static void method25968(@OriginalArg(0) Class147 arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(1738994083);
		}
		arg0.aClass147_19 = arg1;
		arg0.aClass147_20 = arg1.aClass147_20;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIII)V")
	Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3625 = arg0 * -861155569;
		this.anInt3627 = arg1 * -670497381;
		this.anInt3624 = arg2 * 1897317559;
		this.anInt3626 = arg3 * -1108539229;
	}

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "(IB)Lclient!dk;")
	Class226 method25962(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return new Class226(this.anInt3625 * 1644904431, arg0, this.anInt3624 * -420783865, this.anInt3626 * 532802315);
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)Lclient!dk;")
	Class226 method25963(@OriginalArg(0) int arg0) {
		return new Class226(this.anInt3625 * 1644904431, arg0, this.anInt3624 * -420783865, this.anInt3626 * 532802315);
	}
}
