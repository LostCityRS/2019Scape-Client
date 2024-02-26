package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xb")
public final class Class655 {

	@OriginalMember(owner = "client!xb", name = "or", descriptor = "Z")
	public static boolean aBoolean969;

	@OriginalMember(owner = "client!xb", name = "t", descriptor = "I")
	int anInt5673;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "F")
	float aFloat339;

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "F")
	float aFloat340;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	int anInt5674;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "F")
	float aFloat342;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "Lclient!df;")
	Class106 aClass106_1;

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "F")
	float aFloat343;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "F")
	float aFloat344;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "Lclient!on;")
	Class463 aClass463_64;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "F")
	float aFloat348;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	int anInt5675;

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "Lclient!sg;")
	Class549 aClass549_2;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "F")
	float aFloat346 = 1.0F;

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "F")
	float aFloat345 = 0.0F;

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "F")
	float aFloat347 = 1.0F;

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "F")
	float aFloat349 = 0.0F;

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "F")
	float aFloat341 = 1.0F;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	int[] anIntArray515 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[F")
	float[] aFloatArray120 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xb", name = "re", descriptor = "(Lclient!yp;I)V")
	static void method33214(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4103 * 1892149809;
	}

	@OriginalMember(owner = "client!xb", name = "ate", descriptor = "(Lclient!yp;I)V")
	static void method33215(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!xb", name = "lc", descriptor = "(Lclient!yp;I)V")
	static void method33216(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2093059049);
		Class165_Sub40.method16785(local16, arg0, -924031626);
	}

	@OriginalMember(owner = "client!xb", name = "md", descriptor = "(Ljava/lang/String;I)V")
	public static void method33217(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = client.aBoolean731 ? 400 : 200;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3573 * 975306769 >= local5) {
			Class141.method10906(4, client.aBoolean731 ? Class60.aClass60_38.method1180(Class512.aClass719_3, 1399199609) : Class60.aClass60_39.method1180(Class512.aClass719_3, -700316640), (byte) 87);
			return;
		}
		@Pc(34) String local34 = Class635.method32821(arg0, Class126.aClass91_13, 855136599);
		if (local34 == null) {
			return;
		}
		@Pc(40) int local40;
		@Pc(55) String local55;
		@Pc(85) String local85;
		for (local40 = 0; local40 < client.anInt3573 * 975306769; local40++) {
			@Pc(49) Class676 local49 = client.aClass676Array1[local40];
			local55 = Class635.method32821(local49.aString236, Class126.aClass91_13, 1486741017);
			if (local55 != null && local55.equals(local34)) {
				Class141.method10906(4, arg0 + Class60.aClass60_148.method1180(Class512.aClass719_3, -1967787261), (byte) 98);
				return;
			}
			if (local49.aString237 != null) {
				local85 = Class635.method32821(local49.aString237, Class126.aClass91_13, 501850453);
				if (local85 != null && local85.equals(local34)) {
					Class141.method10906(4, arg0 + Class60.aClass60_148.method1180(Class512.aClass719_3, -1671375951), (byte) 104);
					return;
				}
			}
		}
		for (local40 = 0; local40 < client.anInt3519 * 227319795; local40++) {
			@Pc(119) Class699 local119 = client.aClass699Array1[local40];
			local55 = Class635.method32821(local119.aString244, Class126.aClass91_13, 321895074);
			if (local55 != null && local55.equals(local34)) {
				Class141.method10906(4, Class60.aClass60_155.method1180(Class512.aClass719_3, -887010082) + arg0 + Class60.aClass60_142.method1180(Class512.aClass719_3, -281183890), (byte) 75);
				return;
			}
			if (local119.aString242 != null) {
				local85 = Class635.method32821(local119.aString242, Class126.aClass91_13, 1276547212);
				if (local85 != null && local85.equals(local34)) {
					Class141.method10906(4, Class60.aClass60_155.method1180(Class512.aClass719_3, 994187583) + arg0 + Class60.aClass60_142.method1180(Class512.aClass719_3, 1814380222), (byte) 118);
					return;
				}
			}
		}
		if (Class635.method32821(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73, Class126.aClass91_13, 675956756).equals(local34)) {
			Class141.method10906(4, Class60.aClass60_152.method1180(Class512.aClass719_3, 897021812), (byte) 47);
			return;
		}
		@Pc(207) Class75 local207 = Class52.method1074(16777215);
		@Pc(213) Class80_Sub31 local213 = Class623.method32440(Class443.aClass443_86, local207.aClass22_1, -191270971);
		local213.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(arg0, (short) 16383), 1275868335);
		local213.aClass80_Sub36_Sub1_2.method23165(arg0, 1988852866);
		local207.method1325(local213, (byte) -79);
	}

	@OriginalMember(owner = "client!xb", name = "ie", descriptor = "(Lclient!yp;I)V")
	static void method33218(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class643.method33029(local11, local14, arg0, (byte) -112);
	}

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public Class655(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		this.method33176(arg0, arg1, 1382835897);
	}

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "()V")
	public Class655() {
		this.method33173(456721631);
	}

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "(Lclient!ald;I)V")
	public void method33172(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aFloat343 = arg0.method23188(-501184852);
		this.aFloat344 = arg0.method23188(1641654566);
		this.aFloat348 = arg0.method23188(1654400203);
	}

	@OriginalMember(owner = "client!xb", name = "t", descriptor = "(I)V")
	void method33173(@OriginalArg(0) int arg0) {
		this.anInt5673 = 1259606231;
		this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		this.aFloat342 = 1.1523438F;
		this.aFloat339 = 0.69921875F;
		this.aFloat340 = 1.2F;
		this.anInt5674 = 1842885912;
		this.anInt5675 = 0;
		this.aClass106_1 = Class665.aClass106_2;
		this.aFloat343 = 1.0F;
		this.aFloat344 = 0.25F;
		this.aFloat348 = 1.0F;
		this.aClass549_2 = Class665.aClass549_3;
		this.aFloat346 = 1.0F;
		this.aFloat345 = 0.0F;
		this.aFloat347 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat341 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray120;
		@Pc(78) float[] local78 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xb", name = "aq", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public void method33174(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -60);
		@Pc(7) int local7 = arg0.method23179(2072766144);
		@Pc(11) int local11 = arg0.method23179(-3369320);
		@Pc(15) int local15 = arg0.method23179(1096602288);
		@Pc(19) int local19 = arg0.method23178((byte) -23);
		Class262.anInt3902 = local19 * 1816954963;
		this.aClass549_2 = arg1.method33374(local3, local7, local11, local15, 843865769);
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "(Lclient!ald;I)V")
	void method33175(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg1] = arg0.method23178((byte) -46);
		this.aFloatArray120[arg1] = arg0.method23188(830739950);
	}

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "(Lclient!ald;Lclient!xm;I)V")
	public void method33176(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method23362(-1710100335);
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(2099040593) == 1 && Class279.aClass102_9.method20768() > 0) {
			if ((local3 & Class685.aClass685_8.anInt5771 * 1496170261) == 0) {
				this.anInt5673 = 1259606231;
			} else {
				this.anInt5673 = arg0.method23182(-1523144382) * -571740375;
			}
			if ((local3 & Class685.aClass685_2.anInt5771 * 1496170261) == 0) {
				this.aFloat342 = 1.1523438F;
			} else {
				this.aFloat342 = (float) arg0.method23178((byte) -118) / 256.0F;
			}
			if ((local3 & Class685.aClass685_3.anInt5771 * 1496170261) == 0) {
				this.aFloat339 = 0.69921875F;
			} else {
				this.aFloat339 = (float) arg0.method23178((byte) -20) / 256.0F;
			}
			if ((local3 & Class685.aClass685_7.anInt5771 * 1496170261) == 0) {
				this.aFloat340 = 1.2F;
			} else {
				this.aFloat340 = (float) arg0.method23178((byte) -106) / 256.0F;
			}
		} else {
			if ((local3 & Class685.aClass685_8.anInt5771 * 1496170261) != 0) {
				arg0.method23182(2145362479);
			}
			if ((local3 & Class685.aClass685_2.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -85);
			}
			if ((local3 & Class685.aClass685_3.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -10);
			}
			if ((local3 & Class685.aClass685_7.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -83);
			}
			this.anInt5673 = 1259606231;
			this.aFloat340 = 1.2F;
			this.aFloat339 = 0.69921875F;
			this.aFloat342 = 1.1523438F;
		}
		if ((local3 & Class685.aClass685_5.anInt5771 * 1496170261) == 0) {
			this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass463_64 = Class463.method29541((float) arg0.method23179(40897401), (float) arg0.method23179(238694789), (float) arg0.method23179(1122813355));
		}
		if ((local3 & Class685.aClass685_6.anInt5771 * 1496170261) == 0) {
			this.anInt5674 = 1842885912;
		} else {
			this.anInt5674 = arg0.method23182(1755963638) * 1741085143;
		}
		if ((local3 & Class685.aClass685_4.anInt5771 * 1496170261) == 0) {
			this.anInt5675 = 0;
		} else {
			this.anInt5675 = arg0.method23178((byte) -120) * 450465755;
		}
		if ((local3 & Class685.aClass685_1.anInt5771 * 1496170261) == 0) {
			this.aClass106_1 = Class665.aClass106_2;
		} else {
			@Pc(227) int local227 = arg0.method23178((byte) -56);
			this.aClass106_1 = arg1.method33373(local227, (byte) -122);
		}
	}

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "(Lclient!ald;Lclient!xm;I)V")
	public void method33177(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method23178((byte) -97);
		@Pc(7) int local7 = arg0.method23179(-226000825);
		@Pc(11) int local11 = arg0.method23179(-693075219);
		@Pc(15) int local15 = arg0.method23179(731131638);
		@Pc(19) int local19 = arg0.method23178((byte) -32);
		Class262.anInt3902 = local19 * 1816954963;
		this.aClass549_2 = arg1.method33374(local3, local7, local11, local15, 277281712);
	}

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "(Lclient!ald;B)V")
	public void method33178(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.method33179(arg0, 0, 1523988809);
	}

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "(Lclient!ald;II)V")
	void method33179(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray515[arg1] = arg0.method23178((byte) -23);
		this.aFloatArray120[arg1] = arg0.method23188(420473290);
	}

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "(Lclient!ald;)V")
	public void method33180(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method33179(arg0, 0, -648919998);
	}

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "(Lclient!xb;I)Z")
	boolean method33181(@OriginalArg(0) Class655 arg0, @OriginalArg(1) int arg1) {
		return arg0.anInt5673 * 749608217 == this.anInt5673 * 749608217 && this.aFloat342 == arg0.aFloat342 && this.aFloat339 == arg0.aFloat339 && arg0.aFloat340 == this.aFloat340 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat343 == this.aFloat343 && arg0.aFloat348 == this.aFloat348 && this.anInt5674 * -922605081 == arg0.anInt5674 * -922605081 && arg0.anInt5675 * -544222125 == this.anInt5675 * -544222125 && arg0.aClass106_1 == this.aClass106_1 && this.aClass549_2 == arg0.aClass549_2 && this.aFloat346 == arg0.aFloat346 && this.aFloat345 == arg0.aFloat345 && this.aFloat347 == arg0.aFloat347 && arg0.aFloat349 == this.aFloat349 && this.aFloat341 == arg0.aFloat341 && this.anIntArray515[0] == arg0.anIntArray515[0] && arg0.anIntArray515[1] == this.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && arg0.aFloatArray120[0] == this.aFloatArray120[0] && arg0.aFloatArray120[1] == this.aFloatArray120[1] && arg0.aFloatArray120[2] == this.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "(Lclient!xm;Lclient!yh;B)V")
	void method33182(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class683 arg1, @OriginalArg(2) byte arg2) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1501798660) == 1 && Class279.aClass102_9.method20768() > 0) {
			if (arg1.method36713(490382364) != -1) {
				this.anInt5673 = arg1.method36713(-777598159) * -571740375;
			}
			if (arg1.method36714(246927337) != -1.0F) {
				this.aFloat342 = arg1.method36714(246927337);
			}
			if (arg1.method36765(827209816) != -1.0F) {
				this.aFloat339 = arg1.method36765(827209816);
			}
			if (arg1.method36716(-295558096) != -1.0F) {
				this.aFloat340 = arg1.method36716(-295558096);
			}
		}
		if (arg1.method36717(-1354378402) != null) {
			this.aClass463_64.method29478(arg1.method36717(-1279468869));
		}
		if (arg1.method36718(-580273575) != -1) {
			this.anInt5674 = arg1.method36718(1638875460) * 1741085143;
		}
		if (arg1.method36719((byte) -23) != -1) {
			this.anInt5675 = arg1.method36719((byte) -34) * 450465755;
		}
		if (arg1.method36731(1935152511) != -1.0F) {
			this.aFloat344 = arg1.method36731(2062253921);
		}
		if (arg1.method36720(-1944910428) != -1.0F) {
			this.aFloat348 = arg1.method36720(-1944910428);
		}
		if (arg1.method36721(1152633628) != -1.0F) {
			this.aFloat343 = arg1.method36721(114836264);
		}
		if (arg1.method36722((short) 12511) != -1) {
			this.aClass106_1 = arg0.method33373(arg1.method36722((short) 8746), (byte) -121);
		}
		if (arg1.method36723(-2123468431) != -1) {
			@Pc(142) int local142 = arg1.method36723(-2002131657);
			@Pc(146) int local146 = arg1.method36724(-949818653);
			@Pc(150) int local150 = arg1.method36725((short) 23460);
			@Pc(154) int local154 = arg1.method36737(-1287636616);
			@Pc(158) int local158 = arg1.method36730(-928721913);
			Class262.anInt3902 = local158 * 1816954963;
			this.aClass549_2 = arg0.method33374(local142, local146, local150, local154, -1765425394);
		}
		if (arg1.method36755(0, -2142190465) != -1) {
			this.anIntArray515[0] = arg1.method36755(0, -401401057);
			this.aFloatArray120[0] = arg1.method36746(0, 2036747717);
		}
		if (arg1.method36755(1, 765723303) != -1) {
			this.anIntArray515[1] = arg1.method36755(1, 590065778);
			this.aFloatArray120[1] = arg1.method36746(1, 2036747717);
		}
		if (arg1.method36755(2, 866397825) != -1) {
			this.anIntArray515[2] = arg1.method36755(2, 1201964816);
			this.aFloatArray120[2] = arg1.method36746(2, 2036747717);
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)I")
	public int method33183(@OriginalArg(0) int arg0) {
		return this.anInt5674 * -922605081;
	}

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "(I)Lclient!sg;")
	public Class549 method33184(@OriginalArg(0) int arg0) {
		return this.aClass549_2;
	}

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "()V")
	void method33185() {
		this.anInt5673 = 1259606231;
		this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		this.aFloat342 = 1.1523438F;
		this.aFloat339 = 0.69921875F;
		this.aFloat340 = 1.2F;
		this.anInt5674 = 1842885912;
		this.anInt5675 = 0;
		this.aClass106_1 = Class665.aClass106_2;
		this.aFloat343 = 1.0F;
		this.aFloat344 = 0.25F;
		this.aFloat348 = 1.0F;
		this.aClass549_2 = Class665.aClass549_3;
		this.aFloat346 = 1.0F;
		this.aFloat345 = 0.0F;
		this.aFloat347 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat341 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray120;
		@Pc(78) float[] local78 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "(Lclient!ald;)V")
	public void method33186(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method33179(arg0, 0, 1678487743);
	}

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "()V")
	void method33187() {
		this.anInt5673 = 1259606231;
		this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		this.aFloat342 = 1.1523438F;
		this.aFloat339 = 0.69921875F;
		this.aFloat340 = 1.2F;
		this.anInt5674 = 1842885912;
		this.anInt5675 = 0;
		this.aClass106_1 = Class665.aClass106_2;
		this.aFloat343 = 1.0F;
		this.aFloat344 = 0.25F;
		this.aFloat348 = 1.0F;
		this.aClass549_2 = Class665.aClass549_3;
		this.aFloat346 = 1.0F;
		this.aFloat345 = 0.0F;
		this.aFloat347 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat341 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray120;
		@Pc(78) float[] local78 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "(Lclient!xb;)V")
	void method33188(@OriginalArg(0) Class655 arg0) {
		this.anInt5673 = arg0.anInt5673;
		this.aFloat342 = arg0.aFloat342;
		this.aFloat339 = arg0.aFloat339;
		this.aFloat340 = arg0.aFloat340;
		this.aClass463_64.method29478(arg0.aClass463_64);
		this.anInt5674 = arg0.anInt5674;
		this.anInt5675 = arg0.anInt5675;
		this.aClass106_1 = arg0.aClass106_1;
		this.aFloat343 = arg0.aFloat343;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat348 = arg0.aFloat348;
		this.aClass549_2 = arg0.aClass549_2;
		this.aFloat346 = arg0.aFloat346;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat341 = arg0.aFloat341;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray120[0] = arg0.aFloatArray120[0];
		this.aFloatArray120[1] = arg0.aFloatArray120[1];
		this.aFloatArray120[2] = arg0.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "()V")
	void method33189() {
		this.anInt5673 = 1259606231;
		this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		this.aFloat342 = 1.1523438F;
		this.aFloat339 = 0.69921875F;
		this.aFloat340 = 1.2F;
		this.anInt5674 = 1842885912;
		this.anInt5675 = 0;
		this.aClass106_1 = Class665.aClass106_2;
		this.aFloat343 = 1.0F;
		this.aFloat344 = 0.25F;
		this.aFloat348 = 1.0F;
		this.aClass549_2 = Class665.aClass549_3;
		this.aFloat346 = 1.0F;
		this.aFloat345 = 0.0F;
		this.aFloat347 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat341 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray120;
		@Pc(78) float[] local78 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "(Lclient!xb;)V")
	void method33190(@OriginalArg(0) Class655 arg0) {
		this.anInt5673 = arg0.anInt5673;
		this.aFloat342 = arg0.aFloat342;
		this.aFloat339 = arg0.aFloat339;
		this.aFloat340 = arg0.aFloat340;
		this.aClass463_64.method29478(arg0.aClass463_64);
		this.anInt5674 = arg0.anInt5674;
		this.anInt5675 = arg0.anInt5675;
		this.aClass106_1 = arg0.aClass106_1;
		this.aFloat343 = arg0.aFloat343;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat348 = arg0.aFloat348;
		this.aClass549_2 = arg0.aClass549_2;
		this.aFloat346 = arg0.aFloat346;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat341 = arg0.aFloat341;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray120[0] = arg0.aFloatArray120[0];
		this.aFloatArray120[1] = arg0.aFloatArray120[1];
		this.aFloatArray120[2] = arg0.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "(Lclient!di;Lclient!xb;Lclient!xb;F)V")
	void method33191(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class655 arg1, @OriginalArg(2) Class655 arg2, @OriginalArg(3) float arg3) {
		this.anInt5673 = Class335.method27856(arg1.anInt5673 * 749608217, arg2.anInt5673 * 749608217, arg3 * 255.0F, 1321103855) * -571740375;
		this.aFloat339 = (arg2.aFloat339 - arg1.aFloat339) * arg3 + arg1.aFloat339;
		this.aFloat340 = (arg2.aFloat340 - arg1.aFloat340) * arg3 + arg1.aFloat340;
		this.aFloat342 = arg3 * (arg2.aFloat342 - arg1.aFloat342) + arg1.aFloat342;
		this.aFloat348 = (arg2.aFloat348 - arg1.aFloat348) * arg3 + arg1.aFloat348;
		this.aFloat343 = arg1.aFloat343 + (arg2.aFloat343 - arg1.aFloat343) * arg3;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.anInt5674 = Class335.method27856(arg1.anInt5674 * -922605081, arg2.anInt5674 * -922605081, arg3 * 255.0F, 2145607711) * 1741085143;
		this.anInt5675 = (int) ((float) (arg1.anInt5675 * -544222125) + arg3 * (float) (arg2.anInt5675 * -544222125 - arg1.anInt5675 * -544222125)) * 450465755;
		if (arg1.aClass106_1 != arg2.aClass106_1) {
			this.aClass106_1 = arg0.method20854(arg1.aClass106_1, arg2.aClass106_1, arg3, this.aClass106_1);
		}
		if (arg2.aClass549_2 != arg1.aClass549_2) {
			if (arg1.aClass549_2 == null) {
				this.aClass549_2 = arg2.aClass549_2;
				if (this.aClass549_2 != null) {
					this.aClass549_2.method31277((int) (arg3 * 255.0F), 0, 1875287480);
				}
			} else {
				this.aClass549_2 = arg1.aClass549_2;
				if (this.aClass549_2 != null) {
					this.aClass549_2.method31277((int) (arg3 * 255.0F), 255, -741817221);
				}
			}
		}
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat345 = arg3 * (arg2.aFloat345 - arg1.aFloat345) + arg1.aFloat345;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat349 = arg1.aFloat349 + (arg2.aFloat349 - arg1.aFloat349) * arg3;
		this.aFloat341 = (arg2.aFloat341 - arg1.aFloat341) * arg3 + arg1.aFloat341;
		@Pc(261) float local261 = arg1.aFloatArray120[1] + arg1.aFloatArray120[0] + arg1.aFloatArray120[2];
		@Pc(276) float local276 = arg2.aFloatArray120[0] + arg2.aFloatArray120[1] + arg2.aFloatArray120[2];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray120;
			local313 = this.aFloatArray120;
			this.aFloatArray120[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray120[local347] = 0.0F;
				} else {
					this.aFloatArray120[local347] = arg3 * arg2.aFloatArray120[local347];
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray120[local347] = 0.0F;
				} else {
					this.aFloatArray120[local347] = (1.0F - arg3) * arg1.aFloatArray120[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray120[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg3 * arg2.aFloatArray120[local535];
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (local474[local553] == arg2.anIntArray515[local535]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class594.method31956(local313, local474, 0, local447 - 1, -240790683);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray120[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public void method33192(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(3) int local3 = arg0.method23362(-1134476238);
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1892571178) == 1 && Class279.aClass102_9.method20768() > 0) {
			if ((local3 & Class685.aClass685_8.anInt5771 * 1496170261) == 0) {
				this.anInt5673 = 1259606231;
			} else {
				this.anInt5673 = arg0.method23182(232686153) * -571740375;
			}
			if ((local3 & Class685.aClass685_2.anInt5771 * 1496170261) == 0) {
				this.aFloat342 = 1.1523438F;
			} else {
				this.aFloat342 = (float) arg0.method23178((byte) -48) / 256.0F;
			}
			if ((local3 & Class685.aClass685_3.anInt5771 * 1496170261) == 0) {
				this.aFloat339 = 0.69921875F;
			} else {
				this.aFloat339 = (float) arg0.method23178((byte) -103) / 256.0F;
			}
			if ((local3 & Class685.aClass685_7.anInt5771 * 1496170261) == 0) {
				this.aFloat340 = 1.2F;
			} else {
				this.aFloat340 = (float) arg0.method23178((byte) -62) / 256.0F;
			}
		} else {
			if ((local3 & Class685.aClass685_8.anInt5771 * 1496170261) != 0) {
				arg0.method23182(-789578422);
			}
			if ((local3 & Class685.aClass685_2.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -126);
			}
			if ((local3 & Class685.aClass685_3.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -46);
			}
			if ((local3 & Class685.aClass685_7.anInt5771 * 1496170261) != 0) {
				arg0.method23178((byte) -21);
			}
			this.anInt5673 = 1259606231;
			this.aFloat340 = 1.2F;
			this.aFloat339 = 0.69921875F;
			this.aFloat342 = 1.1523438F;
		}
		if ((local3 & Class685.aClass685_5.anInt5771 * 1496170261) == 0) {
			this.aClass463_64 = Class463.method29541(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass463_64 = Class463.method29541((float) arg0.method23179(-414432743), (float) arg0.method23179(435529835), (float) arg0.method23179(-351114177));
		}
		if ((local3 & Class685.aClass685_6.anInt5771 * 1496170261) == 0) {
			this.anInt5674 = 1842885912;
		} else {
			this.anInt5674 = arg0.method23182(-1014149448) * 1741085143;
		}
		if ((local3 & Class685.aClass685_4.anInt5771 * 1496170261) == 0) {
			this.anInt5675 = 0;
		} else {
			this.anInt5675 = arg0.method23178((byte) -48) * 450465755;
		}
		if ((local3 & Class685.aClass685_1.anInt5771 * 1496170261) == 0) {
			this.aClass106_1 = Class665.aClass106_2;
		} else {
			@Pc(227) int local227 = arg0.method23178((byte) -82);
			this.aClass106_1 = arg1.method33373(local227, (byte) -70);
		}
	}

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "(Lclient!ald;)V")
	public void method33193(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aFloat343 = arg0.method23188(225586971);
		this.aFloat344 = arg0.method23188(-1544298509);
		this.aFloat348 = arg0.method23188(-341095418);
	}

	@OriginalMember(owner = "client!xb", name = "al", descriptor = "(Lclient!xm;Lclient!yh;)V")
	void method33194(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class683 arg1) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1691479616) == 1 && Class279.aClass102_9.method20768() > 0) {
			if (arg1.method36713(-843228299) != -1) {
				this.anInt5673 = arg1.method36713(-481692384) * -571740375;
			}
			if (arg1.method36714(246927337) != -1.0F) {
				this.aFloat342 = arg1.method36714(246927337);
			}
			if (arg1.method36765(827209816) != -1.0F) {
				this.aFloat339 = arg1.method36765(827209816);
			}
			if (arg1.method36716(-295558096) != -1.0F) {
				this.aFloat340 = arg1.method36716(-295558096);
			}
		}
		if (arg1.method36717(-1796358110) != null) {
			this.aClass463_64.method29478(arg1.method36717(-1040603317));
		}
		if (arg1.method36718(816707839) != -1) {
			this.anInt5674 = arg1.method36718(-695721070) * 1741085143;
		}
		if (arg1.method36719((byte) -85) != -1) {
			this.anInt5675 = arg1.method36719((byte) -33) * 450465755;
		}
		if (arg1.method36731(2141286734) != -1.0F) {
			this.aFloat344 = arg1.method36731(1963163017);
		}
		if (arg1.method36720(-1944910428) != -1.0F) {
			this.aFloat348 = arg1.method36720(-1944910428);
		}
		if (arg1.method36721(487908074) != -1.0F) {
			this.aFloat343 = arg1.method36721(256455269);
		}
		if (arg1.method36722((short) 17392) != -1) {
			this.aClass106_1 = arg0.method33373(arg1.method36722((short) 17193), (byte) -98);
		}
		if (arg1.method36723(-1591136693) != -1) {
			@Pc(142) int local142 = arg1.method36723(-1706394629);
			@Pc(146) int local146 = arg1.method36724(-721687599);
			@Pc(150) int local150 = arg1.method36725((short) 9796);
			@Pc(154) int local154 = arg1.method36737(-790954258);
			@Pc(158) int local158 = arg1.method36730(-1446163653);
			Class262.anInt3902 = local158 * 1816954963;
			this.aClass549_2 = arg0.method33374(local142, local146, local150, local154, 412191034);
		}
		if (arg1.method36755(0, -1203439281) != -1) {
			this.anIntArray515[0] = arg1.method36755(0, 652213155);
			this.aFloatArray120[0] = arg1.method36746(0, 2036747717);
		}
		if (arg1.method36755(1, -1802731455) != -1) {
			this.anIntArray515[1] = arg1.method36755(1, 1285525602);
			this.aFloatArray120[1] = arg1.method36746(1, 2036747717);
		}
		if (arg1.method36755(2, -1459297096) != -1) {
			this.anIntArray515[2] = arg1.method36755(2, 1691287723);
			this.aFloatArray120[2] = arg1.method36746(2, 2036747717);
		}
	}

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "(Lclient!ald;)V")
	public void method33195(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method33179(arg0, 0, 750531199);
	}

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "(Lclient!di;Lclient!xb;Lclient!xb;FI)V")
	void method33196(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class655 arg1, @OriginalArg(2) Class655 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.anInt5673 = Class335.method27856(arg1.anInt5673 * 749608217, arg2.anInt5673 * 749608217, arg3 * 255.0F, 1941348657) * -571740375;
		this.aFloat339 = (arg2.aFloat339 - arg1.aFloat339) * arg3 + arg1.aFloat339;
		this.aFloat340 = (arg2.aFloat340 - arg1.aFloat340) * arg3 + arg1.aFloat340;
		this.aFloat342 = arg3 * (arg2.aFloat342 - arg1.aFloat342) + arg1.aFloat342;
		this.aFloat348 = (arg2.aFloat348 - arg1.aFloat348) * arg3 + arg1.aFloat348;
		this.aFloat343 = arg1.aFloat343 + (arg2.aFloat343 - arg1.aFloat343) * arg3;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.anInt5674 = Class335.method27856(arg1.anInt5674 * -922605081, arg2.anInt5674 * -922605081, arg3 * 255.0F, 315108855) * 1741085143;
		this.anInt5675 = (int) ((float) (arg1.anInt5675 * -544222125) + arg3 * (float) (arg2.anInt5675 * -544222125 - arg1.anInt5675 * -544222125)) * 450465755;
		if (arg1.aClass106_1 != arg2.aClass106_1) {
			this.aClass106_1 = arg0.method20854(arg1.aClass106_1, arg2.aClass106_1, arg3, this.aClass106_1);
		}
		if (arg2.aClass549_2 != arg1.aClass549_2) {
			if (arg1.aClass549_2 == null) {
				this.aClass549_2 = arg2.aClass549_2;
				if (this.aClass549_2 != null) {
					this.aClass549_2.method31277((int) (arg3 * 255.0F), 0, -738489089);
				}
			} else {
				this.aClass549_2 = arg1.aClass549_2;
				if (this.aClass549_2 != null) {
					this.aClass549_2.method31277((int) (arg3 * 255.0F), 255, -418855415);
				}
			}
		}
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat345 = arg3 * (arg2.aFloat345 - arg1.aFloat345) + arg1.aFloat345;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat349 = arg1.aFloat349 + (arg2.aFloat349 - arg1.aFloat349) * arg3;
		this.aFloat341 = (arg2.aFloat341 - arg1.aFloat341) * arg3 + arg1.aFloat341;
		@Pc(261) float local261 = arg1.aFloatArray120[1] + arg1.aFloatArray120[0] + arg1.aFloatArray120[2];
		@Pc(276) float local276 = arg2.aFloatArray120[0] + arg2.aFloatArray120[1] + arg2.aFloatArray120[2];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray120;
			local313 = this.aFloatArray120;
			this.aFloatArray120[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray120[local347] = 0.0F;
				} else {
					this.aFloatArray120[local347] = arg3 * arg2.aFloatArray120[local347];
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray120[local347] = 0.0F;
				} else {
					this.aFloatArray120[local347] = (1.0F - arg3) * arg1.aFloatArray120[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray120[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg3 * arg2.aFloatArray120[local535];
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (local474[local553] == arg2.anIntArray515[local535]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class594.method31956(local313, local474, 0, local447 - 1, 1475178991);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray120[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "(Lclient!ald;I)V")
	void method33197(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg1] = arg0.method23178((byte) -122);
		this.aFloatArray120[arg1] = arg0.method23188(-100146649);
	}

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "(Lclient!xb;)V")
	void method33198(@OriginalArg(0) Class655 arg0) {
		this.anInt5673 = arg0.anInt5673;
		this.aFloat342 = arg0.aFloat342;
		this.aFloat339 = arg0.aFloat339;
		this.aFloat340 = arg0.aFloat340;
		this.aClass463_64.method29478(arg0.aClass463_64);
		this.anInt5674 = arg0.anInt5674;
		this.anInt5675 = arg0.anInt5675;
		this.aClass106_1 = arg0.aClass106_1;
		this.aFloat343 = arg0.aFloat343;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat348 = arg0.aFloat348;
		this.aClass549_2 = arg0.aClass549_2;
		this.aFloat346 = arg0.aFloat346;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat341 = arg0.aFloat341;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray120[0] = arg0.aFloatArray120[0];
		this.aFloatArray120[1] = arg0.aFloatArray120[1];
		this.aFloatArray120[2] = arg0.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "(Lclient!xb;B)V")
	void method33199(@OriginalArg(0) Class655 arg0, @OriginalArg(1) byte arg1) {
		this.anInt5673 = arg0.anInt5673;
		this.aFloat342 = arg0.aFloat342;
		this.aFloat339 = arg0.aFloat339;
		this.aFloat340 = arg0.aFloat340;
		this.aClass463_64.method29478(arg0.aClass463_64);
		this.anInt5674 = arg0.anInt5674;
		this.anInt5675 = arg0.anInt5675;
		this.aClass106_1 = arg0.aClass106_1;
		this.aFloat343 = arg0.aFloat343;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat348 = arg0.aFloat348;
		this.aClass549_2 = arg0.aClass549_2;
		this.aFloat346 = arg0.aFloat346;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat341 = arg0.aFloat341;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray120[0] = arg0.aFloatArray120[0];
		this.aFloatArray120[1] = arg0.aFloatArray120[1];
		this.aFloatArray120[2] = arg0.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "ay", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public void method33200(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -14);
		@Pc(7) int local7 = arg0.method23179(219621010);
		@Pc(11) int local11 = arg0.method23179(951429381);
		@Pc(15) int local15 = arg0.method23179(1332351797);
		@Pc(19) int local19 = arg0.method23178((byte) -123);
		Class262.anInt3902 = local19 * 1816954963;
		this.aClass549_2 = arg1.method33374(local3, local7, local11, local15, -437942441);
	}

	@OriginalMember(owner = "client!xb", name = "ai", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public void method33201(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -40);
		@Pc(7) int local7 = arg0.method23179(635558742);
		@Pc(11) int local11 = arg0.method23179(1392352905);
		@Pc(15) int local15 = arg0.method23179(981062712);
		@Pc(19) int local19 = arg0.method23178((byte) -24);
		Class262.anInt3902 = local19 * 1816954963;
		this.aClass549_2 = arg1.method33374(local3, local7, local11, local15, 1238004854);
	}

	@OriginalMember(owner = "client!xb", name = "ao", descriptor = "(Lclient!ald;Lclient!xm;)V")
	public void method33202(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -124);
		@Pc(7) int local7 = arg0.method23179(1330199014);
		@Pc(11) int local11 = arg0.method23179(866874854);
		@Pc(15) int local15 = arg0.method23179(1587617105);
		@Pc(19) int local19 = arg0.method23178((byte) -73);
		Class262.anInt3902 = local19 * 1816954963;
		this.aClass549_2 = arg1.method33374(local3, local7, local11, local15, 336803159);
	}

	@OriginalMember(owner = "client!xb", name = "aj", descriptor = "(Lclient!xb;)Z")
	boolean method33203(@OriginalArg(0) Class655 arg0) {
		return arg0.anInt5673 * 749608217 == this.anInt5673 * 749608217 && this.aFloat342 == arg0.aFloat342 && this.aFloat339 == arg0.aFloat339 && arg0.aFloat340 == this.aFloat340 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat343 == this.aFloat343 && arg0.aFloat348 == this.aFloat348 && this.anInt5674 * -922605081 == arg0.anInt5674 * -922605081 && arg0.anInt5675 * -544222125 == this.anInt5675 * -544222125 && arg0.aClass106_1 == this.aClass106_1 && this.aClass549_2 == arg0.aClass549_2 && this.aFloat346 == arg0.aFloat346 && this.aFloat345 == arg0.aFloat345 && this.aFloat347 == arg0.aFloat347 && arg0.aFloat349 == this.aFloat349 && this.aFloat341 == arg0.aFloat341 && this.anIntArray515[0] == arg0.anIntArray515[0] && arg0.anIntArray515[1] == this.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && arg0.aFloatArray120[0] == this.aFloatArray120[0] && arg0.aFloatArray120[1] == this.aFloatArray120[1] && arg0.aFloatArray120[2] == this.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "ac", descriptor = "(Lclient!xb;)Z")
	boolean method33204(@OriginalArg(0) Class655 arg0) {
		return arg0.anInt5673 * 749608217 == this.anInt5673 * 749608217 && this.aFloat342 == arg0.aFloat342 && this.aFloat339 == arg0.aFloat339 && arg0.aFloat340 == this.aFloat340 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat343 == this.aFloat343 && arg0.aFloat348 == this.aFloat348 && this.anInt5674 * -922605081 == arg0.anInt5674 * -922605081 && arg0.anInt5675 * -544222125 == this.anInt5675 * -544222125 && arg0.aClass106_1 == this.aClass106_1 && this.aClass549_2 == arg0.aClass549_2 && this.aFloat346 == arg0.aFloat346 && this.aFloat345 == arg0.aFloat345 && this.aFloat347 == arg0.aFloat347 && arg0.aFloat349 == this.aFloat349 && this.aFloat341 == arg0.aFloat341 && this.anIntArray515[0] == arg0.anIntArray515[0] && arg0.anIntArray515[1] == this.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && arg0.aFloatArray120[0] == this.aFloatArray120[0] && arg0.aFloatArray120[1] == this.aFloatArray120[1] && arg0.aFloatArray120[2] == this.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "ag", descriptor = "(Lclient!xb;)Z")
	boolean method33205(@OriginalArg(0) Class655 arg0) {
		return arg0.anInt5673 * 749608217 == this.anInt5673 * 749608217 && this.aFloat342 == arg0.aFloat342 && this.aFloat339 == arg0.aFloat339 && arg0.aFloat340 == this.aFloat340 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat343 == this.aFloat343 && arg0.aFloat348 == this.aFloat348 && this.anInt5674 * -922605081 == arg0.anInt5674 * -922605081 && arg0.anInt5675 * -544222125 == this.anInt5675 * -544222125 && arg0.aClass106_1 == this.aClass106_1 && this.aClass549_2 == arg0.aClass549_2 && this.aFloat346 == arg0.aFloat346 && this.aFloat345 == arg0.aFloat345 && this.aFloat347 == arg0.aFloat347 && arg0.aFloat349 == this.aFloat349 && this.aFloat341 == arg0.aFloat341 && this.anIntArray515[0] == arg0.anIntArray515[0] && arg0.anIntArray515[1] == this.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && arg0.aFloatArray120[0] == this.aFloatArray120[0] && arg0.aFloatArray120[1] == this.aFloatArray120[1] && arg0.aFloatArray120[2] == this.aFloatArray120[2];
	}

	@OriginalMember(owner = "client!xb", name = "ab", descriptor = "(Lclient!xm;Lclient!yh;)V")
	void method33206(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class683 arg1) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1905411738) == 1 && Class279.aClass102_9.method20768() > 0) {
			if (arg1.method36713(-1497674749) != -1) {
				this.anInt5673 = arg1.method36713(-1858502869) * -571740375;
			}
			if (arg1.method36714(246927337) != -1.0F) {
				this.aFloat342 = arg1.method36714(246927337);
			}
			if (arg1.method36765(827209816) != -1.0F) {
				this.aFloat339 = arg1.method36765(827209816);
			}
			if (arg1.method36716(-295558096) != -1.0F) {
				this.aFloat340 = arg1.method36716(-295558096);
			}
		}
		if (arg1.method36717(-1493833581) != null) {
			this.aClass463_64.method29478(arg1.method36717(-1384248792));
		}
		if (arg1.method36718(-1733770948) != -1) {
			this.anInt5674 = arg1.method36718(-830874235) * 1741085143;
		}
		if (arg1.method36719((byte) -75) != -1) {
			this.anInt5675 = arg1.method36719((byte) -110) * 450465755;
		}
		if (arg1.method36731(2094020384) != -1.0F) {
			this.aFloat344 = arg1.method36731(1932105426);
		}
		if (arg1.method36720(-1944910428) != -1.0F) {
			this.aFloat348 = arg1.method36720(-1944910428);
		}
		if (arg1.method36721(-132411062) != -1.0F) {
			this.aFloat343 = arg1.method36721(1870204051);
		}
		if (arg1.method36722((short) 15977) != -1) {
			this.aClass106_1 = arg0.method33373(arg1.method36722((short) 14834), (byte) -65);
		}
		if (arg1.method36723(-1911419325) != -1) {
			@Pc(142) int local142 = arg1.method36723(-1952704233);
			@Pc(146) int local146 = arg1.method36724(1297138815);
			@Pc(150) int local150 = arg1.method36725((short) 30857);
			@Pc(154) int local154 = arg1.method36737(2116737835);
			@Pc(158) int local158 = arg1.method36730(-2020345580);
			Class262.anInt3902 = local158 * 1816954963;
			this.aClass549_2 = arg0.method33374(local142, local146, local150, local154, -31591743);
		}
		if (arg1.method36755(0, -644287348) != -1) {
			this.anIntArray515[0] = arg1.method36755(0, -77697756);
			this.aFloatArray120[0] = arg1.method36746(0, 2036747717);
		}
		if (arg1.method36755(1, -1498249713) != -1) {
			this.anIntArray515[1] = arg1.method36755(1, 2108184484);
			this.aFloatArray120[1] = arg1.method36746(1, 2036747717);
		}
		if (arg1.method36755(2, 246612069) != -1) {
			this.anIntArray515[2] = arg1.method36755(2, 348381731);
			this.aFloatArray120[2] = arg1.method36746(2, 2036747717);
		}
	}

	@OriginalMember(owner = "client!xb", name = "ax", descriptor = "(Lclient!ald;I)V")
	void method33207(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg1] = arg0.method23178((byte) -56);
		this.aFloatArray120[arg1] = arg0.method23188(1678053894);
	}

	@OriginalMember(owner = "client!xb", name = "ah", descriptor = "(Lclient!xm;Lclient!yh;)V")
	void method33208(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class683 arg1) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1610853179) == 1 && Class279.aClass102_9.method20768() > 0) {
			if (arg1.method36713(-913197218) != -1) {
				this.anInt5673 = arg1.method36713(-66760108) * -571740375;
			}
			if (arg1.method36714(246927337) != -1.0F) {
				this.aFloat342 = arg1.method36714(246927337);
			}
			if (arg1.method36765(827209816) != -1.0F) {
				this.aFloat339 = arg1.method36765(827209816);
			}
			if (arg1.method36716(-295558096) != -1.0F) {
				this.aFloat340 = arg1.method36716(-295558096);
			}
		}
		if (arg1.method36717(403049040) != null) {
			this.aClass463_64.method29478(arg1.method36717(200304376));
		}
		if (arg1.method36718(-1681803088) != -1) {
			this.anInt5674 = arg1.method36718(354051849) * 1741085143;
		}
		if (arg1.method36719((byte) -92) != -1) {
			this.anInt5675 = arg1.method36719((byte) -125) * 450465755;
		}
		if (arg1.method36731(1992957209) != -1.0F) {
			this.aFloat344 = arg1.method36731(1999865085);
		}
		if (arg1.method36720(-1944910428) != -1.0F) {
			this.aFloat348 = arg1.method36720(-1944910428);
		}
		if (arg1.method36721(1693655844) != -1.0F) {
			this.aFloat343 = arg1.method36721(1283548377);
		}
		if (arg1.method36722((short) 9373) != -1) {
			this.aClass106_1 = arg0.method33373(arg1.method36722((short) 17261), (byte) -126);
		}
		if (arg1.method36723(-2098314348) != -1) {
			@Pc(142) int local142 = arg1.method36723(-1541522320);
			@Pc(146) int local146 = arg1.method36724(667672588);
			@Pc(150) int local150 = arg1.method36725((short) 19141);
			@Pc(154) int local154 = arg1.method36737(-989471908);
			@Pc(158) int local158 = arg1.method36730(1224937010);
			Class262.anInt3902 = local158 * 1816954963;
			this.aClass549_2 = arg0.method33374(local142, local146, local150, local154, 55332734);
		}
		if (arg1.method36755(0, 160600449) != -1) {
			this.anIntArray515[0] = arg1.method36755(0, 1447572644);
			this.aFloatArray120[0] = arg1.method36746(0, 2036747717);
		}
		if (arg1.method36755(1, -170570479) != -1) {
			this.anIntArray515[1] = arg1.method36755(1, -1422779101);
			this.aFloatArray120[1] = arg1.method36746(1, 2036747717);
		}
		if (arg1.method36755(2, -1891881263) != -1) {
			this.anIntArray515[2] = arg1.method36755(2, 1153790329);
			this.aFloatArray120[2] = arg1.method36746(2, 2036747717);
		}
	}

	@OriginalMember(owner = "client!xb", name = "af", descriptor = "(Lclient!xm;Lclient!yh;)V")
	void method33209(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class683 arg1) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1373160261) == 1 && Class279.aClass102_9.method20768() > 0) {
			if (arg1.method36713(-1460718423) != -1) {
				this.anInt5673 = arg1.method36713(1185418444) * -571740375;
			}
			if (arg1.method36714(246927337) != -1.0F) {
				this.aFloat342 = arg1.method36714(246927337);
			}
			if (arg1.method36765(827209816) != -1.0F) {
				this.aFloat339 = arg1.method36765(827209816);
			}
			if (arg1.method36716(-295558096) != -1.0F) {
				this.aFloat340 = arg1.method36716(-295558096);
			}
		}
		if (arg1.method36717(-116598490) != null) {
			this.aClass463_64.method29478(arg1.method36717(255180177));
		}
		if (arg1.method36718(1298687631) != -1) {
			this.anInt5674 = arg1.method36718(814413563) * 1741085143;
		}
		if (arg1.method36719((byte) -74) != -1) {
			this.anInt5675 = arg1.method36719((byte) -13) * 450465755;
		}
		if (arg1.method36731(1896899137) != -1.0F) {
			this.aFloat344 = arg1.method36731(1897483843);
		}
		if (arg1.method36720(-1944910428) != -1.0F) {
			this.aFloat348 = arg1.method36720(-1944910428);
		}
		if (arg1.method36721(2111465591) != -1.0F) {
			this.aFloat343 = arg1.method36721(1267173211);
		}
		if (arg1.method36722((short) 20210) != -1) {
			this.aClass106_1 = arg0.method33373(arg1.method36722((short) 17921), (byte) -6);
		}
		if (arg1.method36723(-1536861648) != -1) {
			@Pc(142) int local142 = arg1.method36723(-1571989624);
			@Pc(146) int local146 = arg1.method36724(-656175921);
			@Pc(150) int local150 = arg1.method36725((short) 25042);
			@Pc(154) int local154 = arg1.method36737(-1747741736);
			@Pc(158) int local158 = arg1.method36730(49084885);
			Class262.anInt3902 = local158 * 1816954963;
			this.aClass549_2 = arg0.method33374(local142, local146, local150, local154, -1500972332);
		}
		if (arg1.method36755(0, -1306420881) != -1) {
			this.anIntArray515[0] = arg1.method36755(0, -1651672505);
			this.aFloatArray120[0] = arg1.method36746(0, 2036747717);
		}
		if (arg1.method36755(1, -129332689) != -1) {
			this.anIntArray515[1] = arg1.method36755(1, -960972473);
			this.aFloatArray120[1] = arg1.method36746(1, 2036747717);
		}
		if (arg1.method36755(2, -209089223) != -1) {
			this.anIntArray515[2] = arg1.method36755(2, -1334165982);
			this.aFloatArray120[2] = arg1.method36746(2, 2036747717);
		}
	}

	@OriginalMember(owner = "client!xb", name = "am", descriptor = "()I")
	public int method33210() {
		return this.anInt5674 * -922605081;
	}

	@OriginalMember(owner = "client!xb", name = "ak", descriptor = "()I")
	public int method33211() {
		return this.anInt5674 * -922605081;
	}

	@OriginalMember(owner = "client!xb", name = "at", descriptor = "()I")
	public int method33212() {
		return this.anInt5674 * -922605081;
	}

	@OriginalMember(owner = "client!xb", name = "ad", descriptor = "()Lclient!sg;")
	public Class549 method33213() {
		return this.aClass549_2;
	}
}
