package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public class Class229 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public static final int anInt3734 = 8191;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!aaf;")
	public Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!dm", name = "ek", descriptor = "(Lclient!yf;I)V", line = 5768)
	static final void method25618(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class318.method27212(local11, local14, arg0, -2138717897);
	}

	@OriginalMember(owner = "client!dm", name = "me", descriptor = "(Lclient!yf;B)V", line = 7174)
	static final void method25619(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 2030831540);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class312.method26924(local16, local22, arg0, -209274320);
	}

	@OriginalMember(owner = "client!dm", name = "tr", descriptor = "(Lclient!hf;Lclient!yf;B)V", line = 8362)
	static final void method25620(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class5 local5 = arg0.method26870(Class157.aClass462_2, client.anInterface50_1, -2046135935);
		@Pc(18) int local18 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(34) Point local34 = local5.method74(arg0.aString164, arg0.anInt3981 * 1215292027, arg0.anInt4005 * -889720761, local18, Class110_Sub14.aClass100Array4, -661159626);
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local34.x;
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = local34.y;
	}

	@OriginalMember(owner = "client!dm", name = "th", descriptor = "(Lclient!hf;Lclient!yf;B)V", line = 8456)
	static final void method25621(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091] - 1;
		if (arg0.anInt4001 * 1553054515 != 2) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 5) {
			Class234.method25744(arg0, local27, local12, (byte) 74);
			Class354.method27694(arg0, -1174743804);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dm", name = "aao", descriptor = "(Lclient!yf;I)V", line = 9721)
	static final void method25622(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class126_Sub2.method10051(local13, -213092360);
	}

	@OriginalMember(owner = "client!dm", name = "abu", descriptor = "(Lclient!yf;S)V", line = 9898)
	static final void method25623(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26646(local12, 1580486013).method26759((byte) -55) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dm", name = "alr", descriptor = "(Lclient!yf;I)V", line = 11982)
	static final void method25624(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(31) boolean local31 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class338.method27464(local13, local31, client.aBoolean596, (byte) -63);
	}

	@OriginalMember(owner = "client!dm", name = "aqo", descriptor = "(Lclient!yf;I)V", line = 12858)
	static final void method25625(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
	}
}
