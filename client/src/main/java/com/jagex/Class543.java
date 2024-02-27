package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
final class Class543 implements Interface62 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(Lclient!dh;IILclient!hf;II)V")
	static void method31123(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class660.method33006(false, true, 1887928092);
				@Pc(31) int local31 = Class685.anIntArray524[local23];
				Class46.method896(false, true, 607121684);
				arg0.method20665((local5 * 1215292027 * arg3.anInt4022 >> 7) + arg1, (arg3.anInt4023 * -1490598249 * (7 - local1) >> 3) + arg2, (arg3.anInt4022 * 1215292027 >> 7) + 1, (arg3.anInt4023 * -1490598249 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(IB)V")
	static void method31124(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!s", name = "amw", descriptor = "(Lclient!yf;I)V")
	static void method31125(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(47) Class611 local47 = client.aClass532_1.method30624(1876677413);
		Class29.method605((local13 >> 14 & 0x3FFF) - local47.anInt5784 * 270611681, (local13 & 0x3FFF) - local47.anInt5785 * -1994307635, local23 << 2, local33, local43, (byte) 26);
		client.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!s", name = "atb", descriptor = "(Lclient!yf;I)V")
	static void method31126(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15388(-1817165002) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!s", name = "bbo", descriptor = "(Lclient!yf;I)V")
	static void method31127(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(J)V")
	static void method31128(@OriginalArg(0) long arg0) {
		Class69.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!s", name = "et", descriptor = "(IZI)V")
	public static void method31129(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Class704.method36913(arg0, Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) 12), arg1, (byte) -27);
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(Lclient!ash;I)Z")
	@Override
	public boolean method31548(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		return arg0 instanceof Interface61 && ((Interface61) arg0).method13407((byte) 1);
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(Lclient!ash;)Z")
	@Override
	public boolean method31547(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface61 && ((Interface61) arg0).method13407((byte) 1);
	}
}
