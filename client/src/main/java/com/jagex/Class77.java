package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adb")
public final class Class77 {

	@OriginalMember(owner = "client!adb", name = "g", descriptor = "I")
	static int anInt251;

	@OriginalMember(owner = "client!adb", name = "g", descriptor = "(Lclient!ald;[Lclient!qy;)[Ljava/lang/Object;")
	public static Object[] method1365(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class521[] arg1) {
		@Pc(3) int local3 = arg0.method23195(1644288188);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass519_7.method30595(arg0, 16711935);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!adb", name = "u", descriptor = "(I)I")
	public static int method1366(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!adb", name = "l", descriptor = "(Lclient!ald;[Lclient!qy;)[Ljava/lang/Object;")
	public static Object[] method1367(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class521[] arg1) {
		@Pc(3) int local3 = arg0.method23195(1646376474);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass519_7.method30595(arg0, 16711935);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!adb", name = "i", descriptor = "(Lclient!ald;[Lclient!qy;)[Ljava/lang/Object;")
	public static Object[] method1368(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class521[] arg1) {
		@Pc(3) int local3 = arg0.method23195(2108626154);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass519_7.method30595(arg0, 16711935);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!adb", name = "<init>", descriptor = "()V")
	Class77() throws Throwable {
		throw new Error();
	}
}
