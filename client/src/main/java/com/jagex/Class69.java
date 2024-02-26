package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acu")
public final class Class69 {

	@OriginalMember(owner = "client!acu", name = "t", descriptor = "I")
	public static final int anInt218 = 8;

	@OriginalMember(owner = "client!acu", name = "o", descriptor = "(IIZI)Ljava/lang/String;")
	static String method1250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(42) char[] local42 = new char[local27];
			local42[0] = '+';
			for (@Pc(50) int local50 = local27 - 1; local50 > 0; local50--) {
				@Pc(54) int local54 = arg0;
				arg0 /= arg1;
				@Pc(64) int local64 = local54 - arg1 * arg0;
				if (local64 >= 10) {
					local42[local50] = (char) (local64 + 87);
				} else {
					local42[local50] = (char) (local64 + 48);
				}
			}
			return new String(local42);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!acu", name = "l", descriptor = "(B)Lclient!ajs;")
	static Class147_Sub4 method1251(@OriginalArg(0) byte arg0) {
		@Pc(4) Class147_Sub4 local4 = (Class147_Sub4) Class147_Sub4.aClass5_3.method113((byte) 58);
		if (local4 == null) {
			return new Class147_Sub4();
		} else {
			Class147_Sub4.anInt1486 -= -52220359;
			return local4;
		}
	}

	@OriginalMember(owner = "client!acu", name = "i", descriptor = "([BI)Ljava/lang/String;")
	public static String method1252(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class2.method1814(arg0, 0, arg0.length, (byte) 86);
	}

	@OriginalMember(owner = "client!acu", name = "<init>", descriptor = "()V")
	Class69() throws Throwable {
		throw new Error();
	}
}
