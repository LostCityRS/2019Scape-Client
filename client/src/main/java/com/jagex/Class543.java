package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
final class Class543 implements Interface62 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(Lclient!dh;IILclient!hf;II)V", line = 29)
	static void method30942(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class660.method32818(false, true, 1887928092);
				@Pc(31) int local31 = Class685.anIntArray522[local23];
				Class46.method891(false, true, 607121684);
				arg0.method20721((local5 * 1215292027 * arg3.anInt3981 >> 7) + arg1, (arg3.anInt3982 * -1490598249 * (7 - local1) >> 3) + arg2, (arg3.anInt3981 * 1215292027 >> 7) + 1, (arg3.anInt3982 * -1490598249 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(J)V", line = 96)
	static void method30943(@OriginalArg(0) long arg0) {
		Class69.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(IB)V", line = 890)
	static void method30944(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(Lclient!ash;I)Z", line = 1000)
	@Override
	public boolean method31367(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		return arg0 instanceof Interface61 && ((Interface61) arg0).method13407((byte) 1);
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(Lclient!ash;)Z", line = 1000)
	@Override
	public boolean method31366(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface61 && ((Interface61) arg0).method13407((byte) 1);
	}

	@OriginalMember(owner = "client!s", name = "et", descriptor = "(IZI)V", line = 2015)
	public static void method30945(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Class704.method36733(arg0, Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) 12), arg1, (byte) -27);
	}

	@OriginalMember(owner = "client!s", name = "amw", descriptor = "(Lclient!yf;I)V", line = 12119)
	static final void method30946(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(47) Class611 local47 = client.aClass532_1.method30455(1876677413);
		Class29.method606((local13 >> 14 & 0x3FFF) - local47.anInt5623 * 270611681, (local13 & 0x3FFF) - local47.anInt5624 * -1994307635, local23 << 2, local33, local43, (byte) 26);
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!s", name = "atb", descriptor = "(Lclient!yf;I)V", line = 13333)
	static final void method30947(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15381(-1817165002) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!s", name = "bbo", descriptor = "(Lclient!yf;I)V", line = 14408)
	static final void method30948(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
