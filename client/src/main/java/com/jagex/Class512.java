package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
final class Class512 implements Interface9 {

	@OriginalMember(owner = "client!qo", name = "nf", descriptor = "I")
	public static int anInt5209;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30271(@OriginalArg(0) Class93_Sub41 arg0) {
		return Class254.method25996(arg0, 315165959);
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30270(@OriginalArg(0) Class93_Sub41 arg0) {
		return Class254.method25996(arg0, 622103345);
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30272(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		return Class254.method25996(arg0, -1654754142);
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(III)Lclient!asg;", line = 54)
	public static Class93_Sub1_Sub15 method30256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class339 local5 = (Class339) Class329.aMap21.get(arg0);
		return local5.method27479(arg1, -611780419);
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(II)V", line = 99)
	public static void method30257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class567.anInt5388 = arg0 * 655720961;
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "(Lclient!dn;FZI)F", line = 135)
	static float method30258(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(1) float local1 = 0.0F;
		if (arg0 == null || arg0.method25650(-1507711602) == 0) {
			return local1;
		}
		@Pc(19) float local19 = (float) (arg0.aClass254Array1[0].anInt3852 * 1727636433);
		@Pc(32) float local32 = (float) (arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].anInt3852 * 1727636433);
		@Pc(36) float local36 = local32 - local19;
		if ((double) local36 == 0.0D) {
			return arg0.aClass254Array1[0].aFloat281;
		}
		@Pc(49) float local49 = 0.0F;
		if (arg1 > local32) {
			local49 = (arg1 - local32) / local36;
		} else {
			local49 = (arg1 - local19) / local36;
		}
		@Pc(70) double local70 = (double) local49;
		@Pc(77) float local77 = Math.abs((float) ((double) local49 - local70));
		@Pc(81) float local81 = local77 * local36;
		@Pc(86) double local86 = Math.abs(local70 + 1.0D);
		@Pc(90) double local90 = local86 / 2.0D;
		@Pc(94) double local94 = (double) local90;
		@Pc(99) float local99 = (float) (local90 - local94);
		@Pc(147) float local147;
		@Pc(153) float local153;
		if (arg2) {
			if (arg0.aClass222_6 == Class222.aClass222_1) {
				if ((double) local99 == 0.0D) {
					local81 = local32 - local81;
				} else {
					local81 += local19;
				}
			} else if (Class222.aClass222_3 == arg0.aClass222_6 || arg0.aClass222_6 == Class222.aClass222_4) {
				local81 = local32 - local81;
			} else if (Class222.aClass222_5 == arg0.aClass222_6) {
				local81 = local19 - arg1;
				local147 = arg0.aClass254Array1[0].aFloat282;
				local153 = arg0.aClass254Array1[0].aFloat283;
				local1 = arg0.aClass254Array1[0].aFloat281;
				if ((double) local147 != 0.0D) {
					local1 -= local153 * local81 / local147;
				}
				return local1;
			}
		} else if (Class222.aClass222_1 == arg0.aClass222_7) {
			if ((double) local99 == 0.0D) {
				local81 += local19;
			} else {
				local81 = local32 - local81;
			}
		} else if (Class222.aClass222_3 == arg0.aClass222_7 || Class222.aClass222_4 == arg0.aClass222_7) {
			local81 += local19;
		} else if (Class222.aClass222_5 == arg0.aClass222_7) {
			local81 = arg1 - local32;
			local147 = arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].aFloat284;
			local153 = arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].aFloat280;
			local1 = arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].aFloat281;
			if ((double) local147 != 0.0D) {
				local1 += local81 * local153 / local147;
			}
			return local1;
		}
		local1 = Class158.method14296(arg0, local81, 2128585742);
		@Pc(286) float local286;
		if (arg2 && Class222.aClass222_4 == arg0.aClass222_6) {
			local286 = arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 - local86 * (double) local286);
		} else if (!arg2 && arg0.aClass222_7 == Class222.aClass222_4) {
			local286 = arg0.aClass254Array1[arg0.method25650(-1507711602) - 1].aFloat281 - arg0.aClass254Array1[0].aFloat281;
			local1 = (float) ((double) local1 + (double) local286 * local86);
		}
		return local1;
	}

	@OriginalMember(owner = "client!qo", name = "vf", descriptor = "(Lclient!yf;I)V", line = 8906)
	static final void method30259(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(35) short local35 = 255;
		@Pc(37) short local37 = 256;
		Class274.aClass258_1.method26098(Class275.aClass275_9, local13, local23, local35, Class280.aClass280_7.method26450(-707353186), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local37, local33, 462200463);
	}

	@OriginalMember(owner = "client!qo", name = "apw", descriptor = "(Lclient!yf;I)V", line = 12648)
	static final void method30260(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(14) float local14 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) float local25 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] / 1000.0F;
		Class65.aClass123_Sub1_2.method8979(Class472.method29535(local14, local25, local36), local49, 1189701933);
	}

	@OriginalMember(owner = "client!qo", name = "ayy", descriptor = "(Lclient!yf;I)V", line = 14084)
	static final void method30261(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class166_Sub12.anInt2143 * -2067309825 == 1) {
			Class169.aBoolean389 = true;
		} else if (Class166_Sub12.anInt2143 * -2067309825 == 3) {
			Class169.aBoolean390 = true;
		}
	}

	@OriginalMember(owner = "client!qo", name = "bch", descriptor = "(Lclient!yf;B)V", line = 14526)
	static final void method30262(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass132_Sub1_Sub5_Sub1_1.method24270(899866876);
	}
}
