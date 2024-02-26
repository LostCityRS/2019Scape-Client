package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hy")
final class Class328 implements Interface28 {

	@OriginalMember(owner = "client!hy", name = "o", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	static String method27721(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class531.aString220.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class531.aString220.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class531.aString220.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hy", name = "aqi", descriptor = "(Lclient!yp;I)V")
	static void method27722(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class103_Sub14.method8213(1712806873).method37268();
	}

	@OriginalMember(owner = "client!hy", name = "e", descriptor = "(Lclient!ald;[Lclient!qy;I)[Ljava/lang/Object;")
	public static Object[] method27723(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class521[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method23195(2008183503);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass519_7.method30595(arg0, 16711935);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hy", name = "ey", descriptor = "(Lclient!yp;I)V")
	static void method27724(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class564.method31474(local11, local14, arg0, 65280);
	}

	@OriginalMember(owner = "client!hy", name = "e", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long method27720(@OriginalArg(0) String arg0) {
		return Class663.method33350(arg0, -1599488976);
	}

	@OriginalMember(owner = "client!hy", name = "t", descriptor = "(Ljava/lang/String;I)J")
	@Override
	public long method27718(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class663.method33350(arg0, -1418129870);
	}

	@OriginalMember(owner = "client!hy", name = "f", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long method27719(@OriginalArg(0) String arg0) {
		return Class663.method33350(arg0, 426706772);
	}
}
