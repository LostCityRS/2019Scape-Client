package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class286 implements Interface75 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_5 = new Class286(1, 0);

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_3 = new Class286(0, 1);

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!ge;")
	public static final Class286 aClass286_4 = new Class286(2, 2);

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	final int anInt3941;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	final int anInt3940;

	@OriginalMember(owner = "client!ge", name = "am", descriptor = "(I)Lclient!arm;")
	public static Class93_Sub1_Sub7 method26615(@OriginalArg(0) int arg0) {
		return Class272.aClass93_Sub1_Sub7_5;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)[Lclient!ge;")
	public static Class286[] method26616(@OriginalArg(0) byte arg0) {
		return new Class286[] { aClass286_3, aClass286_5, aClass286_4 };
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "()[Lclient!ge;")
	public static Class286[] method26617() {
		return new Class286[] { aClass286_3, aClass286_5, aClass286_4 };
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V")
	public static void method26618(@OriginalArg(0) byte arg0) {
		Class663.aClass16_39 = new Class16(8);
		Class663.anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!ge", name = "bs", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method26619(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= 463840436;
		arg0.anInt4018 = arg2.anIntArray521[arg2.anInt6052 * -1497248091] * -777045745;
		arg0.anInt4019 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1] * 853782547;
		arg0.anInt4044 = 0;
		arg0.anInt4053 = 0;
		@Pc(45) int local45 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 2];
		if (local45 < 0) {
			local45 = 0;
		} else if (local45 > 4) {
			local45 = 4;
		}
		@Pc(65) int local65 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 3];
		if (local65 < 0) {
			local65 = 0;
		} else if (local65 > 4) {
			local65 = 4;
		}
		arg0.aByte128 = (byte) local45;
		arg0.aByte125 = (byte) local65;
		Class354.method27789(arg0, -1174743804);
		Class237.method25869(arg1, arg0, (byte) 79);
		if (arg0.anInt4012 * -158526639 == 0) {
			Class548.method31197(arg1, arg0, false, 1194225288);
		}
	}

	@OriginalMember(owner = "client!ge", name = "ta", descriptor = "(Lclient!yf;S)V")
	static void method26620(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class493.method30189(local11, arg0, 1376488456);
	}

	@OriginalMember(owner = "client!ge", name = "amh", descriptor = "(Lclient!yf;B)V")
	static void method26621(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class220.method25642(-456359273);
	}

	@OriginalMember(owner = "client!ge", name = "asm", descriptor = "(Lclient!yf;I)V")
	static void method26622(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 31);
		Class106_Sub1.method5148(-1678521064);
		Class610.method32202(-1804241793);
		Class275.method26434(-805234298);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)[Lclient!abd;")
	public static Class31[] method26623(@OriginalArg(0) byte arg0) {
		return new Class31[] { Class31.aClass31_17, Class31.aClass31_2, Class31.aClass31_24, Class31.aClass31_41, Class31.aClass31_18, Class31.aClass31_10, Class31.aClass31_6, Class31.aClass31_5, Class31.aClass31_3, Class31.aClass31_9, Class31.aClass31_22, Class31.aClass31_11, Class31.aClass31_42, Class31.aClass31_20, Class31.aClass31_14, Class31.aClass31_15, Class31.aClass31_16, Class31.aClass31_27, Class31.aClass31_1, Class31.aClass31_19, Class31.aClass31_23, Class31.aClass31_21, Class31.aClass31_13, Class31.aClass31_25, Class31.aClass31_12, Class31.aClass31_4, Class31.aClass31_26, Class31.aClass31_7, Class31.aClass31_28, Class31.aClass31_29, Class31.aClass31_30, Class31.aClass31_31, Class31.aClass31_32, Class31.aClass31_33, Class31.aClass31_34, Class31.aClass31_35, Class31.aClass31_36, Class31.aClass31_37, Class31.aClass31_38, Class31.aClass31_39, Class31.aClass31_40, Class31.aClass31_8 };
	}

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "(Lclient!yf;I)V")
	static void method26624(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class274.aClass258_11.method26133(local13, local23, -1136267566);
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)V")
	static void method26625(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ge", name = "ol", descriptor = "(Lclient!yf;B)V")
	static void method26626(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class696.method36830(local11, local14, arg0, -184819048);
	}

	@OriginalMember(owner = "client!ge", name = "am", descriptor = "(III)V")
	static void method26627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(7, (long) arg0);
		local4.method21813(1261618733);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!ge", name = "ve", descriptor = "(Lclient!yf;I)V")
	static void method26628(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(37) Class312 local37 = Class659.method32986(local33, 964405411);
		Class125_Sub1.method9215(local37, local13, local23, -1785656463);
	}

	@OriginalMember(owner = "client!ge", name = "aqd", descriptor = "(Lclient!yf;B)V")
	static void method26629(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class129_Sub1.method9406((byte) 0).method37101();
	}

	@OriginalMember(owner = "client!ge", name = "gd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method26630(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4042 = -343005199;
		arg0.anInt4078 = client.anInt3513 * 1786756713;
		arg0.anInt4079 = 0;
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class124_Sub3_Sub1.method19778(arg0.anInt3994 * -1549590237, 256284111);
		}
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
	Class286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3941 = arg0 * -648290169;
		this.anInt3940 = arg1 * 1165321007;
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt3940 * -1963408433;
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt3940 * -1963408433;
	}
}
