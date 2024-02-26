package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahh")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!ahh", name = "j", descriptor = "I")
	public final int anInt1136;

	@OriginalMember(owner = "client!ahh", name = "a", descriptor = "I")
	public final int anInt1137;

	@OriginalMember(owner = "client!ahh", name = "g", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method9854(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -37);
		@Pc(7) int local7 = arg0.method23182(-1399098056);
		@Pc(11) int local11 = arg0.method23182(-1552273466);
		@Pc(15) int local15 = arg0.method23210((byte) 102);
		return new Class125_Sub1(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "i", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method9855(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -32);
		@Pc(7) int local7 = arg0.method23182(525391045);
		@Pc(11) int local11 = arg0.method23182(-638226019);
		@Pc(15) int local15 = arg0.method23210((byte) 120);
		return new Class125_Sub1(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "m", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method9856(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -30);
		@Pc(7) int local7 = arg0.method23182(1972010265);
		@Pc(11) int local11 = arg0.method23182(871706715);
		@Pc(15) int local15 = arg0.method23210((byte) 23);
		return new Class125_Sub1(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "o", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method9857(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -94);
		@Pc(7) int local7 = arg0.method23182(1636972226);
		@Pc(11) int local11 = arg0.method23182(1398817456);
		@Pc(15) int local15 = arg0.method23210((byte) 23);
		return new Class125_Sub1(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "<init>", descriptor = "(Lclient!ky;Lclient!km;IIIIIIIIII)V")
	Class125_Sub1(@OriginalArg(0) Class391 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1136 = arg10 * -1253223085;
		this.anInt1137 = arg11 * 1668984607;
	}

	@OriginalMember(owner = "client!ahh", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_3;
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_3;
	}
}
