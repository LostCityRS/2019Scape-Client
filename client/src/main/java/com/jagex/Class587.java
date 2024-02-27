package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tz")
public final class Class587 {

	@OriginalMember(owner = "client!tz", name = "k", descriptor = "I")
	static final int anInt5627 = 16;

	@OriginalMember(owner = "client!tz", name = "f", descriptor = "I")
	static final int anInt5628 = 62;

	@OriginalMember(owner = "client!tz", name = "m", descriptor = "I")
	static final int anInt5629 = 8;

	@OriginalMember(owner = "client!tz", name = "n", descriptor = "I")
	static final int anInt5630 = 2;

	@OriginalMember(owner = "client!tz", name = "e", descriptor = "I")
	static final int anInt5631 = 1;

	@OriginalMember(owner = "client!tz", name = "w", descriptor = "I")
	static final int anInt5632 = 63;

	@OriginalMember(owner = "client!tz", name = "e", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method31824(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!tz", name = "nr", descriptor = "(Lclient!yf;B)V")
	static void method31825(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class362.method28028(local11, local14, arg0, 1731903337);
	}

	@OriginalMember(owner = "client!tz", name = "e", descriptor = "(I)[Lclient!vn;")
	public static Class618[] method31826(@OriginalArg(0) int arg0) {
		return new Class618[] { Class618.aClass618_3, Class618.aClass618_5, Class618.aClass618_4 };
	}

	@OriginalMember(owner = "client!tz", name = "ahw", descriptor = "(Lclient!yf;S)V")
	static void method31827(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18273(local12, 277488318);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt140 * 352108515;
	}

	@OriginalMember(owner = "client!tz", name = "e", descriptor = "(Lclient!alw;II)[B")
	public static byte[] method31828(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!tz", name = "abl", descriptor = "(Lclient!yf;B)V")
	static void method31829(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26715(local12, -687416784).method26850(1703561620) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tz", name = "<init>", descriptor = "()V")
	Class587() throws Throwable {
		throw new Error();
	}
}
