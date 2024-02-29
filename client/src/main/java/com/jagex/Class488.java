package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public class Class488 {

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
	public static final int anInt5152 = 3;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static final int anInt5153 = 1;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	public static final int anInt5154 = 6;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	public static final int anInt5155 = 4;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
	public static final int anInt5156 = 5;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public static final int anInt5157 = 2;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 11)
	Class488() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zt;I)I", line = 11)
	public static int method29820(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(55) char local55;
			if (local13 == '\u0000') {
				local55 = arg1.charAt(local9++);
			} else {
				local55 = local13;
				@Pc(57) boolean local57 = false;
			}
			local11 = Class379.method28097(local43, 1481094232);
			local13 = Class379.method28097(local55, 1925189435);
			local43 = Class13.method190(local43, arg2, 1009059973);
			local55 = Class13.method190(local55, arg2, 1616781883);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class75.method1266(local43, arg2, -1545230392) - Class75.method1266(local55, arg2, -1683135884);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (arg2 == Class717.aClass717_11) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local146 != local142 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local142 != local146) {
					return Class75.method1266(local142, arg2, -544532320) - Class75.method1266(local146, arg2, 714804314);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(185) int local185 = 0; local185 < local113; local185++) {
			local146 = arg0.charAt(local185);
			@Pc(196) char local196 = arg1.charAt(local185);
			if (local196 != local146) {
				return Class75.method1266(local146, arg2, -101012263) - Class75.method1266(local196, arg2, 1958506436);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pn", name = "qj", descriptor = "(Lclient!yf;B)V", line = 7918)
	static final void method29821(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 718567456);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class707.method36752(local16, local22, arg0, 808284185);
	}

	@OriginalMember(owner = "client!pn", name = "afx", descriptor = "(Lclient!yf;I)V", line = 10578)
	static final void method29822(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class657.method32755((char) local12, -672073806) ? 1 : 0;
	}

	@OriginalMember(owner = "client!pn", name = "akz", descriptor = "(Lclient!yf;B)V", line = 11526)
	static final void method29823(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class159.method14520(local12);
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3167 * -1863527503 - local15.anInt3166 * -332819059;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3169 * -1436122155 - local15.anInt3170 * 598304723;
		}
	}

	@OriginalMember(owner = "client!pn", name = "lo", descriptor = "(Ljava/lang/String;I)V", line = 12108)
	public static final void method29824(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = client.aBoolean629 ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3444 * 862418793 >= local5) {
			Class103.method2809(4, client.aBoolean629 ? Class74.aClass74_38.method1259(Class106.aClass717_8, (byte) 50) : Class74.aClass74_39.method1259(Class106.aClass717_8, (byte) -63), -1963408433);
			return;
		}
		@Pc(33) String local33 = Class82.method1384(arg0, client.aClass83_10, (byte) 1);
		if (local33 == null) {
			return;
		}
		@Pc(38) int local38;
		@Pc(53) String local53;
		@Pc(84) String local84;
		for (local38 = 0; local38 < client.anInt3444 * 862418793; local38++) {
			@Pc(47) Class281 local47 = client.aClass281Array1[local38];
			local53 = Class82.method1384(local47.aString153, client.aClass83_10, (byte) 1);
			if (local53 != null && local53.equals(local33)) {
				Class103.method2809(4, arg0 + Class74.aClass74_155.method1259(Class106.aClass717_8, (byte) -65), -1963408433);
				return;
			}
			if (local47.aString154 != null) {
				local84 = Class82.method1384(local47.aString154, client.aClass83_10, (byte) 1);
				if (local84 != null && local84.equals(local33)) {
					Class103.method2809(4, arg0 + Class74.aClass74_155.method1259(Class106.aClass717_8, (byte) 100), -1963408433);
					return;
				}
			}
		}
		for (local38 = 0; local38 < client.anInt3573 * 1882800101; local38++) {
			@Pc(118) Class177 local118 = client.aClass177Array1[local38];
			local53 = Class82.method1384(local118.aString125, client.aClass83_10, (byte) 1);
			if (local53 != null && local53.equals(local33)) {
				Class103.method2809(4, Class74.aClass74_154.method1259(Class106.aClass717_8, (byte) 8) + arg0 + Class74.aClass74_74.method1259(Class106.aClass717_8, (byte) -47), -1963408433);
				return;
			}
			if (local118.aString123 != null) {
				local84 = Class82.method1384(local118.aString123, client.aClass83_10, (byte) 1);
				if (local84 != null && local84.equals(local33)) {
					Class103.method2809(4, Class74.aClass74_154.method1259(Class106.aClass717_8, (byte) -42) + arg0 + Class74.aClass74_74.method1259(Class106.aClass717_8, (byte) 45), -1963408433);
					return;
				}
			}
		}
		if (Class82.method1384(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82, client.aClass83_10, (byte) 1).equals(local33)) {
			Class103.method2809(4, Class74.aClass74_151.method1259(Class106.aClass717_8, (byte) 43), -1963408433);
			return;
		}
		@Pc(208) Class175 local208 = Class330.method27371(-1644772968);
		@Pc(214) Class93_Sub22 local214 = Class102.method2588(Class446.aClass446_54, local208.aClass24_2, (byte) 126);
		local214.aClass93_Sub41_Sub2_1.method22394(Class46.method895(arg0, -2103213469), (byte) -54);
		local214.aClass93_Sub41_Sub2_1.method22431(arg0, -1639122878);
		local208.method24356(local214, -1899542244);
	}

	@OriginalMember(owner = "client!pn", name = "bam", descriptor = "(Lclient!yf;I)V", line = 14263)
	static final void method29825(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method16546(local12, -1852738245);
	}

	@OriginalMember(owner = "client!pn", name = "baz", descriptor = "(Lclient!yf;I)V", line = 14320)
	static final void method29826(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub26_1.method16546(local12, -440372523);
	}
}
