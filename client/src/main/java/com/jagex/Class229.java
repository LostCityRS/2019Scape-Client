package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class229 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public static final int anInt3775 = 8191;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!aaf;")
	public Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!dm", name = "me", descriptor = "(Lclient!yf;B)V")
	static void method25711(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 2030831540);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class312.method27016(local16, local22, arg0, -209274320);
	}

	@OriginalMember(owner = "client!dm", name = "tr", descriptor = "(Lclient!hf;Lclient!yf;B)V")
	static void method25712(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class5 local5 = arg0.method26944(Class157.aClass462_2, client.anInterface50_1, -2046135935);
		@Pc(18) int local18 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(34) Point local34 = local5.method45(arg0.aString170, arg0.anInt4022 * 1215292027, arg0.anInt4046 * -889720761, local18, Class110_Sub14.aClass100Array4, -661159626);
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local34.x;
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local34.y;
	}

	@OriginalMember(owner = "client!dm", name = "th", descriptor = "(Lclient!hf;Lclient!yf;B)V")
	static void method25713(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091] - 1;
		if (arg0.anInt4042 * 1553054515 != 2) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 5) {
			Class234.method25837(arg0, local27, local12, (byte) 74);
			Class354.method27789(arg0, -1174743804);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dm", name = "abu", descriptor = "(Lclient!yf;S)V")
	static void method25714(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26715(local12, 1580486013).method26879((byte) -55) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dm", name = "alr", descriptor = "(Lclient!yf;I)V")
	static void method25715(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(31) boolean local31 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class338.method27561(local13, local31, client.aBoolean598, (byte) -63);
	}

	@OriginalMember(owner = "client!dm", name = "aao", descriptor = "(Lclient!yf;I)V")
	static void method25716(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class126_Sub2.method10049(local13, -213092360);
	}

	@OriginalMember(owner = "client!dm", name = "aqo", descriptor = "(Lclient!yf;I)V")
	static void method25717(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!dm", name = "ek", descriptor = "(Lclient!yf;I)V")
	static void method25718(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class318.method27305(local11, local14, arg0, -2138717897);
	}
}
