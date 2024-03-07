package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ze")
public class Class703 {

	@OriginalMember(owner = "client!ze", name = "e", descriptor = "Lclient!ze;")
	public static final Class703 aClass703_3 = new Class703();

	@OriginalMember(owner = "client!ze", name = "n", descriptor = "Lclient!ze;")
	public static final Class703 aClass703_2 = new Class703();

	@OriginalMember(owner = "client!ze", name = "m", descriptor = "Lclient!ze;")
	static final Class703 aClass703_1 = new Class703();

	@OriginalMember(owner = "client!ze", name = "<init>", descriptor = "()V", line = 31)
	Class703() {
	}

	@OriginalMember(owner = "client!ze", name = "z", descriptor = "(IIZI)Ljava/lang/String;", line = 119)
	static String method36723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(43) char[] local43 = new char[local27];
			local43[0] = '+';
			for (@Pc(51) int local51 = local27 - 1; local51 > 0; local51--) {
				@Pc(55) int local55 = arg0;
				arg0 /= arg1;
				@Pc(65) int local65 = local55 - arg1 * arg0;
				if (local65 >= 10) {
					local43[local51] = (char) (local65 + 87);
				} else {
					local43[local51] = (char) (local65 + 48);
				}
			}
			return new String(local43);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ze", name = "xl", descriptor = "(Lclient!yf;I)V", line = 9113)
	static final void method36724(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8663(local12, -2117194675);
	}

	@OriginalMember(owner = "client!ze", name = "baq", descriptor = "(Lclient!yf;I)V", line = 14325)
	static final void method36725(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub4_1.method16546(local12, 1270068358);
	}
}
