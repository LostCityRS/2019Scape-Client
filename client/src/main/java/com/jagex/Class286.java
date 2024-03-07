package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class286 implements Interface75 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_5 = new Class286(1, 0);

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_3 = new Class286(0, 1);

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_4 = new Class286(2, 2);

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	final int anInt3900;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	final int anInt3899;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)[Lclient!ge;", line = 17)
	public static Class286[] method26522(@OriginalArg(0) byte arg0) {
		return new Class286[] { aClass286_3, aClass286_5, aClass286_4 };
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "()[Lclient!ge;", line = 17)
	public static Class286[] method26523() {
		return new Class286[] { aClass286_3, aClass286_5, aClass286_4 };
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V", line = 20)
	Class286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3900 = arg0 * -648290169;
		this.anInt3899 = arg1 * 1165321007;
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "()I", line = 26)
	@Override
	public int getId() {
		return this.anInt3899 * -1963408433;
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "()I", line = 26)
	@Override
	public int method36919() {
		return this.anInt3899 * -1963408433;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)[Lclient!abd;", line = 52)
	public static Class31[] method26524(@OriginalArg(0) byte arg0) {
		return new Class31[] { Class31.aClass31_17, Class31.aClass31_2, Class31.aClass31_24, Class31.aClass31_41, Class31.aClass31_18, Class31.aClass31_10, Class31.aClass31_6, Class31.aClass31_5, Class31.aClass31_3, Class31.aClass31_9, Class31.aClass31_22, Class31.aClass31_11, Class31.aClass31_42, Class31.aClass31_20, Class31.aClass31_14, Class31.aClass31_15, Class31.aClass31_16, Class31.aClass31_27, Class31.aClass31_1, Class31.aClass31_19, Class31.aClass31_23, Class31.aClass31_21, Class31.aClass31_13, Class31.aClass31_25, Class31.aClass31_12, Class31.aClass31_4, Class31.aClass31_26, Class31.aClass31_7, Class31.aClass31_28, Class31.aClass31_29, Class31.aClass31_30, Class31.aClass31_31, Class31.aClass31_32, Class31.aClass31_33, Class31.aClass31_34, Class31.aClass31_35, Class31.aClass31_36, Class31.aClass31_37, Class31.aClass31_38, Class31.aClass31_39, Class31.aClass31_40, Class31.aClass31_8 };
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V", line = 83)
	public static void method26525(@OriginalArg(0) byte arg0) {
		Class663.aClass16_39 = new Class16(8);
		Class663.anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)V", line = 136)
	static void method26526(@OriginalArg(0) int arg0) {
		Class707.aClass106_13 = null;
		Class82.aClass106_1 = null;
		Class118_Sub1.aClass106_3 = null;
		Class707.aClass100Array9 = null;
		Class393.aClass100Array7 = null;
		Class60.aClass100Array1 = null;
		Class166_Sub37.aClass100Array5 = null;
		Class393.aClass100Array6 = null;
		Class110_Sub14.aClass100Array4 = null;
		Class153.aClass100_18 = null;
		Class284.aClass100_42 = null;
		Class552.aClass100Array8 = null;
	}

	@OriginalMember(owner = "client!ge", name = "am", descriptor = "(III)V", line = 239)
	static void method26527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(7, (long) arg0);
		local4.method21886(1261618733);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!ge", name = "am", descriptor = "(I)Lclient!arm;", line = 1070)
	public static Class93_Sub1_Sub7 method26528(@OriginalArg(0) int arg0) {
		return Class272.aClass93_Sub1_Sub7_5;
	}

	@OriginalMember(owner = "client!ge", name = "bs", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5278)
	static final void method26529(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= 463840436;
		arg0.anInt3977 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * -777045745;
		arg0.anInt3978 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * 853782547;
		arg0.anInt4003 = 0;
		arg0.anInt4012 = 0;
		@Pc(45) int local45 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2];
		if (local45 < 0) {
			local45 = 0;
		} else if (local45 > 4) {
			local45 = 4;
		}
		@Pc(65) int local65 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 3];
		if (local65 < 0) {
			local65 = 0;
		} else if (local65 > 4) {
			local65 = 4;
		}
		arg0.aByte128 = (byte) local45;
		arg0.aByte125 = (byte) local65;
		Class354.method27694(arg0, -1174743804);
		Class237.method25775(arg1, arg0, (byte) 79);
		if (arg0.anInt3971 * -158526639 == 0) {
			Class548.method31015(arg1, arg0, false, 1194225288);
		}
	}

	@OriginalMember(owner = "client!ge", name = "gd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 6197)
	static final void method26530(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4001 = -343005199;
		arg0.anInt4037 = client.selfPlayerSlot * 1786756713;
		arg0.anInt4038 = 0;
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class124_Sub3_Sub1.method19766(arg0.anInt3953 * -1549590237, 256284111);
		}
	}

	@OriginalMember(owner = "client!ge", name = "ol", descriptor = "(Lclient!yf;B)V", line = 7521)
	static final void method26531(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class696.method36648(local11, local14, arg0, -184819048);
	}

	@OriginalMember(owner = "client!ge", name = "ta", descriptor = "(Lclient!yf;S)V", line = 8356)
	static final void method26532(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class493.method30010(local11, arg0, 1376488456);
	}

	@OriginalMember(owner = "client!ge", name = "ve", descriptor = "(Lclient!yf;I)V", line = 8826)
	static final void method26533(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(37) Class312 local37 = Class659.method32808(local33, 964405411);
		Class125_Sub1.method9215(local37, local13, local23, -1785656463);
	}

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "(Lclient!yf;I)V", line = 9023)
	static final void method26534(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class274.aClass258_1.method26064(local13, local23, -1136267566);
	}

	@OriginalMember(owner = "client!ge", name = "amh", descriptor = "(Lclient!yf;B)V", line = 12100)
	static final void method26535(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class220.method25542(-456359273);
	}

	@OriginalMember(owner = "client!ge", name = "aqd", descriptor = "(Lclient!yf;B)V", line = 12774)
	static final void method26536(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class129_Sub1.method9403((byte) 0).getId();
	}

	@OriginalMember(owner = "client!ge", name = "asm", descriptor = "(Lclient!yf;I)V", line = 13174)
	static final void method26537(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub14_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 31);
		Class106_Sub1.method5135(-1678521064);
		Class610.method32020(-1804241793);
		Class275.method26341(-805234298);
		client.aBoolean601 = false;
	}
}
