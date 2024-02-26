package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class374 implements Interface13 {

	@OriginalMember(owner = "client!kb", name = "cj", descriptor = "Lclient!cm;")
	static Class99 aClass99_31;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	static int[] anIntArray437 = new int[32];

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!qt;")
	Class143 aClass143_73;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!ea;")
	public Class107 aClass107_1;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Ljava/lang/String;")
	String aString202;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	int anInt4509;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	int anInt4510;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	int anInt4511 = -1662385315;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public int anInt4508;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!ks;")
	Class132 aClass132_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray437[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "(ZI)V")
	public static void method28434(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kb", name = "xt", descriptor = "(Lclient!yp;I)V")
	static void method28435(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!kb", name = "apd", descriptor = "(Lclient!yp;I)V")
	static void method28436(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -442943724;
		@Pc(14) float local14 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) float local25 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] / 1000.0F;
		Class160.aClass121_Sub1_2.method9590(Class463.method29541(local14, local25, local36), local49, (byte) 73);
	}

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zv;B)I")
	public static int method28437(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) byte arg3) {
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
			local11 = Class145.method12037(local43, (byte) 33);
			local13 = Class145.method12037(local55, (byte) 30);
			local43 = Class116.method8756(local43, arg2, -1374007904);
			local55 = Class116.method8756(local55, arg2, -1692273366);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class460.method29418(local43, arg2, 32768) - Class460.method29418(local55, arg2, 32768);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (Class719.aClass719_9 == arg2) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local142 != local146 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local146 != local142) {
					return Class460.method29418(local142, arg2, 32768) - Class460.method29418(local146, arg2, 32768);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(186) int local186 = 0; local186 < local113; local186++) {
			local146 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local146 != local197) {
				return Class460.method29418(local146, arg2, 32768) - Class460.method29418(local197, arg2, 32768);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "(I)[Lclient!aao;")
	static Class16[] method28438(@OriginalArg(0) int arg0) {
		return new Class16[] { Class16.aClass16_2, Class16.aClass16_3, Class16.aClass16_4, Class16.aClass16_5, Class16.aClass16_1 };
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "([[[Lclient!tb;I)V")
	static void method28439(@OriginalArg(0) Class568[][][] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class568[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class568 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass120_Sub1_Sub4_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub4_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_2).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_2).method13821(102977551);
						}
						for (@Pc(80) Class594 local80 = local29.aClass594_2; local80 != null; local80 = local80.aClass594_3) {
							@Pc(85) Class120_Sub1_Sub1 local85 = local80.aClass120_Sub1_Sub1_1;
							if (local85 instanceof Interface60) {
								((Interface60) local85).method13821(102977551);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "py", descriptor = "(Lclient!yp;I)V")
	static void method28440(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2008258989);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class114.method8626(local16, local22, arg0, -2137074747);
	}

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "(Lclient!akx;I)V")
	static void method28441(@OriginalArg(0) Class80_Sub33 arg0, @OriginalArg(1) int arg1) {
		Class606.aClass121_Sub1_3 = new Class121_Sub1(client.aClass454_1);
		Class606.aClass121_Sub1_3.method9576(Class358.aClass358_3, 1200622408);
		try {
			@Pc(15) Class123_Sub1 local15 = (Class123_Sub1) Class606.aClass121_Sub1_3.method9647(Class340.aClass340_5, false, -1026368683);
			@Pc(22) Class20_Sub3 local22 = (Class20_Sub3) Class606.aClass121_Sub1_3.method9577(Class347.aClass347_7, false, 1239023603);
			local15.method9811(arg0, -330844231);
			local22.method16632(new Class466(0.0F, 0.0F, 0.0F), (byte) 83);
			Class606.aClass121_Sub1_3.method9588(Class463.method29541(99999.0F, 99999.0F, 99999.0F), (short) 255);
			Class606.aClass121_Sub1_3.method9572(Class463.method29541(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1049973060);
			Class606.aClass121_Sub1_3.method9704(Class463.method29541(99999.0F, 99999.0F, 99999.0F), (byte) 42);
			Class606.aClass121_Sub1_3.method9583(Class463.method29541(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -351030388);
		} catch (@Pc(65) Exception_Sub3 local65) {
		}
		Class606.anInt5393 = Class363.aClass152_1.method14615(-1313567350) * -1542004277;
		Class626.anInt5539 = Class363.aClass152_1.method14598(-275920900) * -1297226297;
		Class606.aBoolean931 = true;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Z")
	static boolean method28442(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (Class688.aClass109_3 == null) {
			if (Class708.aClass480_136.method29945(Class329.anInt4184 * -1094630731, (byte) 1)) {
				Class688.aClass109_3 = Class212.method25823(Class708.aClass480_136, Class329.anInt4184 * -1094630731);
			} else {
				local1 = false;
			}
		}
		if (Class112.aClass109_1 == null) {
			if (Class708.aClass480_136.method29945(Class112.anInt913 * 475388175, (byte) 1)) {
				Class112.aClass109_1 = Class212.method25823(Class708.aClass480_136, Class112.anInt913 * 475388175);
			} else {
				local1 = false;
			}
		}
		if (Class256.aClass109_2 == null) {
			if (Class708.aClass480_136.method29945(Class112.anInt915 * 348068761, (byte) 1)) {
				Class256.aClass109_2 = Class212.method25823(Class708.aClass480_136, Class112.anInt915 * 348068761);
			} else {
				local1 = false;
			}
		}
		if (Class10.aClass15_1 == null) {
			if (Class569.aClass480_124.method29945(Class650.anInt5656 * 1288076925, (byte) 1)) {
				Class10.aClass15_1 = Class317.aClass464_1.method29594(client.anInterface49_1, Class650.anInt5656 * 1288076925, (byte) 1);
			} else {
				local1 = false;
			}
		}
		if (Class157_Sub1.aClass109_Sub2_1 == null) {
			if (Class708.aClass480_136.method29945(Class650.anInt5656 * 1288076925, (byte) 1)) {
				Class157_Sub1.aClass109_Sub2_1 = (Class109_Sub2) Class212.method25823(Class708.aClass480_136, Class650.anInt5656 * 1288076925);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!kb", name = "am", descriptor = "(Lclient!arz;I)Ljava/lang/String;")
	public static String method28443(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aBoolean955 || arg0 == null) {
			return "";
		} else if ((arg0.aString105 == null || arg0.aString105.length() == 0) && arg0.aString107 != null && arg0.aString107.length() > 0) {
			return arg0.aString107;
		} else {
			return arg0.aString105;
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILclient!ks;)V")
	Class374(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1) {
		this.anInt4508 = arg0 * -1811539831;
		this.aClass132_1 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.method28426(arg0, false, 542052388);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "(Lclient!ald;IZ)V")
	void method28419(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class379 local6 = (Class379) Class80_Sub39.method15030(Class158.method15517(-1822446262), arg1, -1337116974);
		switch(local6.anInt4536 * 1135533479) {
			case 1:
			default:
				break;
			case 5:
				@Pc(16) int local16 = arg0.method23362(-193014297);
				this.aClass143_73 = (Class143) Class80_Sub39.method15030(Class143.method11832(790887826), local16, -1807234839);
				if (this.aClass143_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4511 = arg0.method23210((byte) 115) * 1662385315;
				if (this.aClass132_1 != null) {
					@Pc(52) Interface12 local52 = (Interface12) this.aClass132_1.aMap11.get(this.aClass143_73);
					if (local52 != null) {
						this.aClass107_1 = (Class107) local52.method18054(this.anInt4511 * 1752078091, 1415212962);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
				break;
			case 13:
				this.anInt4510 = arg0.method23362(-1933853930) * 630163893;
				this.anInt4509 = arg0.method23362(-943785951) * 633283739;
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(Lclient!ald;IZI)V")
	void method28420(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class379 local6 = (Class379) Class80_Sub39.method15030(Class158.method15517(-1102034548), arg1, -530459811);
		switch(local6.anInt4536 * 1135533479) {
			case 1:
			default:
				break;
			case 5:
				@Pc(16) int local16 = arg0.method23362(1052662397);
				this.aClass143_73 = (Class143) Class80_Sub39.method15030(Class143.method11832(1372366996), local16, -1591828467);
				if (this.aClass143_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4511 = arg0.method23210((byte) 98) * 1662385315;
				if (this.aClass132_1 != null) {
					@Pc(52) Interface12 local52 = (Interface12) this.aClass132_1.aMap11.get(this.aClass143_73);
					if (local52 != null) {
						this.aClass107_1 = (Class107) local52.method18054(this.anInt4511 * 1752078091, 1991728884);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
				break;
			case 13:
				this.anInt4510 = arg0.method23362(192235341) * 630163893;
				this.anInt4509 = arg0.method23362(372399654) * 633283739;
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(II)I")
	public int method28421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		return arg0 >> this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "(III)I")
	public int method28422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString202 == null ? Integer.toString(this.anInt4508 * 1922751929) : this.aString202, arg1, local11);
		}
		local11 <<= this.anInt4510 * 1790827677;
		return arg0 & ~local11 | arg1 << this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "(Lclient!ald;Z)V")
	void method28423(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-621212211);
			if (local3 == 0) {
				return;
			}
			this.method28420(arg0, local3, arg1, 1820922627);
		}
	}

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method28426(arg0, false, 542052388);
	}

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "(Lclient!ald;Z)V")
	void method28424(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1625288224);
			if (local3 == 0) {
				return;
			}
			this.method28420(arg0, local3, arg1, 1820922627);
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ald;Z)V")
	void method28425(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-208393098);
			if (local3 == 0) {
				return;
			}
			this.method28420(arg0, local3, arg1, 1820922627);
		}
	}

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "(Lclient!ald;ZI)V")
	void method28426(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-342968503);
			if (local3 == 0) {
				return;
			}
			this.method28420(arg0, local3, arg1, 1820922627);
		}
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "(Lclient!ald;IZ)V")
	void method28427(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class379 local6 = (Class379) Class80_Sub39.method15030(Class158.method15517(-1870080521), arg1, -1778736409);
		switch(local6.anInt4536 * 1135533479) {
			case 1:
			default:
				break;
			case 5:
				@Pc(16) int local16 = arg0.method23362(-1827267796);
				this.aClass143_73 = (Class143) Class80_Sub39.method15030(Class143.method11832(1863217701), local16, -1589666177);
				if (this.aClass143_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4511 = arg0.method23210((byte) 36) * 1662385315;
				if (this.aClass132_1 != null) {
					@Pc(52) Interface12 local52 = (Interface12) this.aClass132_1.aMap11.get(this.aClass143_73);
					if (local52 != null) {
						this.aClass107_1 = (Class107) local52.method18054(this.anInt4511 * 1752078091, 158840365);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
				break;
			case 13:
				this.anInt4510 = arg0.method23362(197131740) * 630163893;
				this.anInt4509 = arg0.method23362(-854502407) * 633283739;
		}
	}

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "(I)I")
	public int method28428(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		return arg0 >> this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "(I)I")
	public int method28429(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		return arg0 >> this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "(I)I")
	public int method28430(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		return arg0 >> this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "(II)I")
	public int method28431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString202 == null ? Integer.toString(this.anInt4508 * 1922751929) : this.aString202, arg1, local11);
		}
		local11 <<= this.anInt4510 * 1790827677;
		return arg0 & ~local11 | arg1 << this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(II)I")
	public int method28432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString202 == null ? Integer.toString(this.anInt4508 * 1922751929) : this.aString202, arg1, local11);
		}
		local11 <<= this.anInt4510 * 1790827677;
		return arg0 & ~local11 | arg1 << this.anInt4510 * 1790827677 & local11;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)I")
	public int method28433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray437[this.anInt4509 * 267526547 - this.anInt4510 * 1790827677];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString202 == null ? Integer.toString(this.anInt4508 * 1922751929) : this.aString202, arg1, local11);
		}
		local11 <<= this.anInt4510 * 1790827677;
		return arg0 & ~local11 | arg1 << this.anInt4510 * 1790827677 & local11;
	}
}
