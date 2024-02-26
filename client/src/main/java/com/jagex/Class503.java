package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class503 {

	@OriginalMember(owner = "client!qe", name = "ai", descriptor = "[I")
	static int[] anIntArray465;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Lclient!qe;")
	static final Class503 aClass503_6 = new Class503(4);

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!qe;")
	static final Class503 aClass503_2 = new Class503(6);

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!qe;")
	static final Class503 aClass503_3 = new Class503(3);

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!qe;")
	static final Class503 aClass503_4 = new Class503(5);

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!qe;")
	static final Class503 aClass503_5 = new Class503(0);

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!qe;")
	static final Class503 aClass503_7 = new Class503(1);

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!qe;")
	static final Class503 aClass503_1 = new Class503(2);

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	final int anInt5043;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(B)V")
	public static void method30447(@OriginalArg(0) byte arg0) {
		if (Class365.anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = Class365.anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method28342(-1177575062);
		}
	}

	@OriginalMember(owner = "client!qe", name = "rp", descriptor = "(Lclient!yp;I)V")
	static void method30448(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4104 * 1990157877;
	}

	@OriginalMember(owner = "client!qe", name = "azr", descriptor = "(Lclient!yp;B)V")
	static void method30449(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qe", name = "bdr", descriptor = "(Lclient!yp;I)V")
	static void method30450(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(ILjava/lang/String;III)Z")
	public static boolean method30451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class47.aClass28_6 = new Class28();
		Class47.aClass28_6.anInt89 = arg0 * -465041647;
		Class47.aClass28_6.aString4 = arg1;
		Class47.aClass28_6.anInt90 = arg2 * 902130377;
		Class47.aClass28_6.anInt91 = arg3 * 1383435301;
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "mx", descriptor = "(Lclient!yp;I)V")
	static void method30452(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class609.method32197(local11, local14, arg0, (byte) 33);
	}

	@OriginalMember(owner = "client!qe", name = "nl", descriptor = "(I)Ljava/lang/String;")
	public static String method30453(@OriginalArg(0) int arg0) {
		return Class103_Sub9.method7878("www", false, (byte) 25);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
	Class503(@OriginalArg(0) int arg0) {
		this.anInt5043 = arg0 * -1427404289;
	}
}
