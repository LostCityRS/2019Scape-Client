package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xv")
public final class Class672 {

	@OriginalMember(owner = "client!xv", name = "el", descriptor = "Z")
	static boolean aBoolean878;

	@OriginalMember(owner = "client!xv", name = "be", descriptor = "Ljava/lang/String;")
	public static String aString247;

	@OriginalMember(owner = "client!xv", name = "m", descriptor = "F")
	float aFloat352;

	@OriginalMember(owner = "client!xv", name = "z", descriptor = "F")
	float aFloat353;

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "Lclient!sv;")
	Class562 aClass562_3;

	@OriginalMember(owner = "client!xv", name = "k", descriptor = "F")
	float aFloat354;

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "Lclient!ox;")
	Class472 aClass472_65;

	@OriginalMember(owner = "client!xv", name = "w", descriptor = "I")
	int anInt6021;

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "I")
	int anInt6022;

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "Lclient!dz;")
	Class107 aClass107_2;

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "F")
	float aFloat356;

	@OriginalMember(owner = "client!xv", name = "n", descriptor = "F")
	float aFloat357;

	@OriginalMember(owner = "client!xv", name = "d", descriptor = "F")
	float aFloat360;

	@OriginalMember(owner = "client!xv", name = "e", descriptor = "I")
	int anInt6023;

	@OriginalMember(owner = "client!xv", name = "r", descriptor = "F")
	float aFloat359 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "v", descriptor = "F")
	float aFloat355 = 0.0F;

	@OriginalMember(owner = "client!xv", name = "o", descriptor = "F")
	float aFloat361 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "s", descriptor = "F")
	float aFloat362 = 0.0F;

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "F")
	float aFloat358 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "q", descriptor = "[I")
	int[] anIntArray517 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xv", name = "x", descriptor = "[F")
	float[] aFloatArray121 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xv", name = "df", descriptor = "(Lclient!yf;I)V")
	static void method33261(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1605340349);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class547.method31190(local16, local22, arg0, 185160791);
	}

	@OriginalMember(owner = "client!xv", name = "sw", descriptor = "(Lclient!yf;I)V")
	static void method33262(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4084 * -1927602083;
	}

	@OriginalMember(owner = "client!xv", name = "azo", descriptor = "(Lclient!yf;I)V")
	static void method33263(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!xv", name = "di", descriptor = "(Lclient!yf;B)V")
	static void method33264(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -74683124);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class393.method28499(local16, local22, arg0, (byte) 104);
	}

	@OriginalMember(owner = "client!xv", name = "awa", descriptor = "(Lclient!yf;I)V")
	static void method33265(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class667.method33096(-574625113);
	}

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "()V")
	public Class672() {
		this.method33242((byte) 42);
	}

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "(Lclient!alw;Lclient!xu;)V")
	public Class672(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		this.method33230(arg0, arg1, (byte) -62);
	}

	@OriginalMember(owner = "client!xv", name = "q", descriptor = "(Lclient!xv;)V")
	void method33227(@OriginalArg(0) Class672 arg0) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "(Lclient!xu;Lclient!yj;I)V")
	void method33228(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1571965219) == 1 && Class694.aClass104_14.method20425() > 0) {
			if (arg1.method33589(-2044341700) != -1) {
				this.anInt6023 = arg1.method33589(-700746591) * -700806717;
			}
			if (arg1.method33541(1647344921) != -1.0F) {
				this.aFloat357 = arg1.method33541(-329963563);
			}
			if (arg1.method33552(1926942523) != -1.0F) {
				this.aFloat352 = arg1.method33552(1976774516);
			}
			if (arg1.method33555(-2012049327) != -1.0F) {
				this.aFloat354 = arg1.method33555(-1449161951);
			}
		}
		if (arg1.method33543(65280) != null) {
			this.aClass472_65.method29719(arg1.method33543(65280));
		}
		if (arg1.method33582(2068634367) != -1) {
			this.anInt6021 = arg1.method33582(2068634367) * -597457079;
		}
		if (arg1.method33545(781704977) != -1) {
			this.anInt6022 = arg1.method33545(811233716) * -2016100073;
		}
		if (arg1.method33546(248515111) != -1.0F) {
			this.aFloat356 = arg1.method33546(-430738287);
		}
		if (arg1.method33547(-816478179) != -1.0F) {
			this.aFloat360 = arg1.method33547(-816478179);
		}
		if (arg1.method33548(504458359) != -1.0F) {
			this.aFloat353 = arg1.method33548(504458359);
		}
		if (arg1.method33574((byte) -65) != -1) {
			this.aClass107_2 = arg0.method33150(arg1.method33574((byte) -97), 1587778909);
		}
		if (arg1.method33550((byte) -107) != -1) {
			@Pc(142) int local142 = arg1.method33550((byte) -30);
			@Pc(146) int local146 = arg1.method33551(399688030);
			@Pc(150) int local150 = arg1.method33590(-1848903480);
			@Pc(154) int local154 = arg1.method33553(-439285637);
			@Pc(158) int local158 = arg1.method33554(1050248409);
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method33151(local142, local146, local150, local154, 538372065);
		}
		if (arg1.method33580(0, 2038137982) != -1) {
			this.anIntArray517[0] = arg1.method33580(0, 2007605556);
			this.aFloatArray121[0] = arg1.method33538(0, -1970261701);
		}
		if (arg1.method33580(1, 1901106858) != -1) {
			this.anIntArray517[1] = arg1.method33580(1, 2092564643);
			this.aFloatArray121[1] = arg1.method33538(1, -1060286241);
		}
		if (arg1.method33580(2, 2100191562) != -1) {
			this.anIntArray517[2] = arg1.method33580(2, 2124354367);
			this.aFloatArray121[2] = arg1.method33538(2, -1140849491);
		}
	}

	@OriginalMember(owner = "client!xv", name = "i", descriptor = "(Lclient!alw;)V")
	public void method33229(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat353 = arg0.method22437(2119705706);
		this.aFloat356 = arg0.method22437(-1201099224);
		this.aFloat360 = arg0.method22437(1628295637);
	}

	@OriginalMember(owner = "client!xv", name = "k", descriptor = "(Lclient!alw;Lclient!xu;B)V")
	public void method33230(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1521019499) == 1 && Class694.aClass104_14.method20425() > 0) {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) == 0) {
				this.anInt6023 = -322603459;
			} else {
				this.anInt6023 = arg0.method22431(-118643075) * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) == 0) {
				this.aFloat357 = 1.1523438F;
			} else {
				this.aFloat357 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) == 0) {
				this.aFloat352 = 0.69921875F;
			} else {
				this.aFloat352 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) == 0) {
				this.aFloat354 = 1.2F;
			} else {
				this.aFloat354 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) != 0) {
				arg0.method22431(-118643075);
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			this.anInt6023 = -322603459;
			this.aFloat354 = 1.2F;
			this.aFloat352 = 0.69921875F;
			this.aFloat357 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt6096 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29710(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29710((float) arg0.method22494((byte) -31), (float) arg0.method22494((byte) -5), (float) arg0.method22494((byte) -76));
		}
		if ((local3 & Class692.aClass692_6.anInt6096 * -457319509) == 0) {
			this.anInt6021 = -137394200;
		} else {
			this.anInt6021 = arg0.method22431(-118643075) * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt6096 * -457319509) == 0) {
			this.anInt6022 = 0;
		} else {
			this.anInt6022 = arg0.method22427(-1434290800) * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt6096 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22427(-1434290800);
			this.aClass107_2 = arg1.method33150(local225, 1373966093);
		}
	}

	@OriginalMember(owner = "client!xv", name = "h", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V")
	void method33231(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt6023 = Class125_Sub2_Sub1.method21481(arg1.anInt6023 * 1540075243, arg2.anInt6023 * 1540075243, arg3 * 255.0F, 2121730410) * -700806717;
		this.aFloat352 = arg1.aFloat352 + (arg2.aFloat352 - arg1.aFloat352) * arg3;
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat357 = arg1.aFloat357 + arg3 * (arg2.aFloat357 - arg1.aFloat357);
		this.aFloat360 = arg3 * (arg2.aFloat360 - arg1.aFloat360) + arg1.aFloat360;
		this.aFloat353 = (arg2.aFloat353 - arg1.aFloat353) * arg3 + arg1.aFloat353;
		this.aFloat356 = arg1.aFloat356 + arg3 * (arg2.aFloat356 - arg1.aFloat356);
		this.anInt6021 = Class125_Sub2_Sub1.method21481(arg1.anInt6021 * -2016142599, arg2.anInt6021 * -2016142599, arg3 * 255.0F, 1380079708) * -597457079;
		this.anInt6022 = (int) ((float) (arg2.anInt6022 * -2139322713 - arg1.anInt6022 * -2139322713) * arg3 + (float) (arg1.anInt6022 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20746(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 0, 1104300451);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 255, 1717887844);
				}
			}
		}
		this.aFloat359 = arg1.aFloat359 + (arg2.aFloat359 - arg1.aFloat359) * arg3;
		this.aFloat355 = arg1.aFloat355 + arg3 * (arg2.aFloat355 - arg1.aFloat355);
		this.aFloat361 = arg1.aFloat361 + arg3 * (arg2.aFloat361 - arg1.aFloat361);
		this.aFloat362 = arg3 * (arg2.aFloat362 - arg1.aFloat362) + arg1.aFloat362;
		this.aFloat358 = arg1.aFloat358 + (arg2.aFloat358 - arg1.aFloat358) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray517;
			@Pc(294) int[] local294 = this.anIntArray517;
			this.anIntArray517[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray517[0] == -1 && arg1.anIntArray517[1] == -1 && arg1.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg2.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray517[0] == -1 && arg2.anIntArray517[1] == -1 && arg2.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg1.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray517[local503] > -1) {
					local474[local447] = arg1.anIntArray517[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray517[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray517[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray517[local535];
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
				Class630.method32452(local313, local474, 0, local447 - 1, -1951995559);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray517[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "(Lclient!alw;I)V")
	public void method33232(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloat353 = arg0.method22437(-560946082);
		this.aFloat356 = arg0.method22437(1685736495);
		this.aFloat360 = arg0.method22437(291871486);
	}

	@OriginalMember(owner = "client!xv", name = "w", descriptor = "(Lclient!alw;I)V")
	public void method33233(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.method33234(arg0, 0, 148581513);
	}

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "(Lclient!alw;II)V")
	void method33234(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray517[arg1] = arg0.method22427(-1434290800);
		this.aFloatArray121[arg1] = arg0.method22437(-2031768684);
	}

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "(Lclient!alw;Lclient!xu;I)V")
	public void method33235(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(7) int local7 = arg0.method22494((byte) -20);
		@Pc(11) int local11 = arg0.method22494((byte) -98);
		@Pc(15) int local15 = arg0.method22494((byte) -13);
		@Pc(19) int local19 = arg0.method22427(-1434290800);
		Class121.anInt1003 = local19 * -1237225441;
		this.aClass562_3 = arg1.method33151(local3, local7, local11, local15, -777944158);
	}

	@OriginalMember(owner = "client!xv", name = "z", descriptor = "(Lclient!xv;I)Z")
	boolean method33236(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		return arg0.anInt6023 * 1540075243 == this.anInt6023 * 1540075243 && this.aFloat357 == arg0.aFloat357 && this.aFloat352 == arg0.aFloat352 && arg0.aFloat354 == this.aFloat354 && arg0.aFloat356 == this.aFloat356 && this.aFloat353 == arg0.aFloat353 && arg0.aFloat360 == this.aFloat360 && arg0.anInt6021 * -2016142599 == this.anInt6021 * -2016142599 && this.anInt6022 * -2139322713 == arg0.anInt6022 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat359 == this.aFloat359 && arg0.aFloat355 == this.aFloat355 && arg0.aFloat361 == this.aFloat361 && arg0.aFloat362 == this.aFloat362 && this.aFloat358 == arg0.aFloat358 && arg0.anIntArray517[0] == this.anIntArray517[0] && this.anIntArray517[1] == arg0.anIntArray517[1] && this.anIntArray517[2] == arg0.anIntArray517[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "aw", descriptor = "()I")
	public int method33237() {
		return this.anInt6021 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "d", descriptor = "(S)I")
	public int method33238(@OriginalArg(0) short arg0) {
		return this.anInt6021 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "(I)Lclient!sv;")
	public Class562 method33239(@OriginalArg(0) int arg0) {
		return this.aClass562_3;
	}

	@OriginalMember(owner = "client!xv", name = "r", descriptor = "()V")
	void method33240() {
		this.anInt6023 = -322603459;
		this.aClass472_65 = Class472.method29710(-50.0F, -60.0F, -50.0F);
		this.aFloat357 = 1.1523438F;
		this.aFloat352 = 0.69921875F;
		this.aFloat354 = 1.2F;
		this.anInt6021 = -137394200;
		this.anInt6022 = 0;
		this.aClass107_2 = Class671.aClass107_1;
		this.aFloat353 = 1.0F;
		this.aFloat356 = 0.25F;
		this.aFloat360 = 1.0F;
		this.aClass562_3 = Class671.aClass562_2;
		this.aFloat359 = 1.0F;
		this.aFloat355 = 0.0F;
		this.aFloat361 = 1.0F;
		this.aFloat362 = 0.0F;
		this.aFloat358 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray517;
		@Pc(59) int[] local59 = this.anIntArray517;
		this.anIntArray517[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray121;
		@Pc(78) float[] local78 = this.aFloatArray121;
		this.aFloatArray121[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xv", name = "ah", descriptor = "(Lclient!xv;)Z")
	boolean method33241(@OriginalArg(0) Class672 arg0) {
		return arg0.anInt6023 * 1540075243 == this.anInt6023 * 1540075243 && this.aFloat357 == arg0.aFloat357 && this.aFloat352 == arg0.aFloat352 && arg0.aFloat354 == this.aFloat354 && arg0.aFloat356 == this.aFloat356 && this.aFloat353 == arg0.aFloat353 && arg0.aFloat360 == this.aFloat360 && arg0.anInt6021 * -2016142599 == this.anInt6021 * -2016142599 && this.anInt6022 * -2139322713 == arg0.anInt6022 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat359 == this.aFloat359 && arg0.aFloat355 == this.aFloat355 && arg0.aFloat361 == this.aFloat361 && arg0.aFloat362 == this.aFloat362 && this.aFloat358 == arg0.aFloat358 && arg0.anIntArray517[0] == this.anIntArray517[0] && this.anIntArray517[1] == arg0.anIntArray517[1] && this.anIntArray517[2] == arg0.anIntArray517[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "e", descriptor = "(B)V")
	void method33242(@OriginalArg(0) byte arg0) {
		this.anInt6023 = -322603459;
		this.aClass472_65 = Class472.method29710(-50.0F, -60.0F, -50.0F);
		this.aFloat357 = 1.1523438F;
		this.aFloat352 = 0.69921875F;
		this.aFloat354 = 1.2F;
		this.anInt6021 = -137394200;
		this.anInt6022 = 0;
		this.aClass107_2 = Class671.aClass107_1;
		this.aFloat353 = 1.0F;
		this.aFloat356 = 0.25F;
		this.aFloat360 = 1.0F;
		this.aClass562_3 = Class671.aClass562_2;
		this.aFloat359 = 1.0F;
		this.aFloat355 = 0.0F;
		this.aFloat361 = 1.0F;
		this.aFloat362 = 0.0F;
		this.aFloat358 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray517;
		@Pc(59) int[] local59 = this.anIntArray517;
		this.anIntArray517[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray121;
		@Pc(78) float[] local78 = this.aFloatArray121;
		this.aFloatArray121[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xv", name = "s", descriptor = "(Lclient!xv;)V")
	void method33243(@OriginalArg(0) Class672 arg0) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "(Lclient!xv;)V")
	void method33244(@OriginalArg(0) Class672 arg0) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "ag", descriptor = "(Lclient!xv;)Z")
	boolean method33245(@OriginalArg(0) Class672 arg0) {
		return arg0.anInt6023 * 1540075243 == this.anInt6023 * 1540075243 && this.aFloat357 == arg0.aFloat357 && this.aFloat352 == arg0.aFloat352 && arg0.aFloat354 == this.aFloat354 && arg0.aFloat356 == this.aFloat356 && this.aFloat353 == arg0.aFloat353 && arg0.aFloat360 == this.aFloat360 && arg0.anInt6021 * -2016142599 == this.anInt6021 * -2016142599 && this.anInt6022 * -2139322713 == arg0.anInt6022 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat359 == this.aFloat359 && arg0.aFloat355 == this.aFloat355 && arg0.aFloat361 == this.aFloat361 && arg0.aFloat362 == this.aFloat362 && this.aFloat358 == arg0.aFloat358 && arg0.anIntArray517[0] == this.anIntArray517[0] && this.anIntArray517[1] == arg0.anIntArray517[1] && this.anIntArray517[2] == arg0.anIntArray517[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "x", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V")
	void method33246(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt6023 = Class125_Sub2_Sub1.method21481(arg1.anInt6023 * 1540075243, arg2.anInt6023 * 1540075243, arg3 * 255.0F, 1140078234) * -700806717;
		this.aFloat352 = arg1.aFloat352 + (arg2.aFloat352 - arg1.aFloat352) * arg3;
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat357 = arg1.aFloat357 + arg3 * (arg2.aFloat357 - arg1.aFloat357);
		this.aFloat360 = arg3 * (arg2.aFloat360 - arg1.aFloat360) + arg1.aFloat360;
		this.aFloat353 = (arg2.aFloat353 - arg1.aFloat353) * arg3 + arg1.aFloat353;
		this.aFloat356 = arg1.aFloat356 + arg3 * (arg2.aFloat356 - arg1.aFloat356);
		this.anInt6021 = Class125_Sub2_Sub1.method21481(arg1.anInt6021 * -2016142599, arg2.anInt6021 * -2016142599, arg3 * 255.0F, 965380501) * -597457079;
		this.anInt6022 = (int) ((float) (arg2.anInt6022 * -2139322713 - arg1.anInt6022 * -2139322713) * arg3 + (float) (arg1.anInt6022 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20746(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 0, 2074501197);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 255, 1511287409);
				}
			}
		}
		this.aFloat359 = arg1.aFloat359 + (arg2.aFloat359 - arg1.aFloat359) * arg3;
		this.aFloat355 = arg1.aFloat355 + arg3 * (arg2.aFloat355 - arg1.aFloat355);
		this.aFloat361 = arg1.aFloat361 + arg3 * (arg2.aFloat361 - arg1.aFloat361);
		this.aFloat362 = arg3 * (arg2.aFloat362 - arg1.aFloat362) + arg1.aFloat362;
		this.aFloat358 = arg1.aFloat358 + (arg2.aFloat358 - arg1.aFloat358) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray517;
			@Pc(294) int[] local294 = this.anIntArray517;
			this.anIntArray517[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray517[0] == -1 && arg1.anIntArray517[1] == -1 && arg1.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg2.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray517[0] == -1 && arg2.anIntArray517[1] == -1 && arg2.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg1.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray517[local503] > -1) {
					local474[local447] = arg1.anIntArray517[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray517[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray517[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray517[local535];
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
				Class630.method32452(local313, local474, 0, local447 - 1, -1912007385);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray517[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "b", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V")
	void method33247(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt6023 = Class125_Sub2_Sub1.method21481(arg1.anInt6023 * 1540075243, arg2.anInt6023 * 1540075243, arg3 * 255.0F, 1258625468) * -700806717;
		this.aFloat352 = arg1.aFloat352 + (arg2.aFloat352 - arg1.aFloat352) * arg3;
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat357 = arg1.aFloat357 + arg3 * (arg2.aFloat357 - arg1.aFloat357);
		this.aFloat360 = arg3 * (arg2.aFloat360 - arg1.aFloat360) + arg1.aFloat360;
		this.aFloat353 = (arg2.aFloat353 - arg1.aFloat353) * arg3 + arg1.aFloat353;
		this.aFloat356 = arg1.aFloat356 + arg3 * (arg2.aFloat356 - arg1.aFloat356);
		this.anInt6021 = Class125_Sub2_Sub1.method21481(arg1.anInt6021 * -2016142599, arg2.anInt6021 * -2016142599, arg3 * 255.0F, 2092344804) * -597457079;
		this.anInt6022 = (int) ((float) (arg2.anInt6022 * -2139322713 - arg1.anInt6022 * -2139322713) * arg3 + (float) (arg1.anInt6022 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20746(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 0, 1932777323);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 255, 1199669135);
				}
			}
		}
		this.aFloat359 = arg1.aFloat359 + (arg2.aFloat359 - arg1.aFloat359) * arg3;
		this.aFloat355 = arg1.aFloat355 + arg3 * (arg2.aFloat355 - arg1.aFloat355);
		this.aFloat361 = arg1.aFloat361 + arg3 * (arg2.aFloat361 - arg1.aFloat361);
		this.aFloat362 = arg3 * (arg2.aFloat362 - arg1.aFloat362) + arg1.aFloat362;
		this.aFloat358 = arg1.aFloat358 + (arg2.aFloat358 - arg1.aFloat358) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray517;
			@Pc(294) int[] local294 = this.anIntArray517;
			this.anIntArray517[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray517[0] == -1 && arg1.anIntArray517[1] == -1 && arg1.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg2.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray517[0] == -1 && arg2.anIntArray517[1] == -1 && arg2.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg1.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray517[local503] > -1) {
					local474[local447] = arg1.anIntArray517[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray517[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray517[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray517[local535];
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
				Class630.method32452(local313, local474, 0, local447 - 1, -2144492522);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray517[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "n", descriptor = "(Lclient!xv;B)V")
	void method33248(@OriginalArg(0) Class672 arg0, @OriginalArg(1) byte arg1) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "a", descriptor = "(Lclient!alw;Lclient!xu;)V")
	public void method33249(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1653118437) == 1 && Class694.aClass104_14.method20425() > 0) {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) == 0) {
				this.anInt6023 = -322603459;
			} else {
				this.anInt6023 = arg0.method22431(-118643075) * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) == 0) {
				this.aFloat357 = 1.1523438F;
			} else {
				this.aFloat357 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) == 0) {
				this.aFloat352 = 0.69921875F;
			} else {
				this.aFloat352 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) == 0) {
				this.aFloat354 = 1.2F;
			} else {
				this.aFloat354 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) != 0) {
				arg0.method22431(-118643075);
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			this.anInt6023 = -322603459;
			this.aFloat354 = 1.2F;
			this.aFloat352 = 0.69921875F;
			this.aFloat357 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt6096 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29710(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29710((float) arg0.method22494((byte) -108), (float) arg0.method22494((byte) -125), (float) arg0.method22494((byte) -25));
		}
		if ((local3 & Class692.aClass692_6.anInt6096 * -457319509) == 0) {
			this.anInt6021 = -137394200;
		} else {
			this.anInt6021 = arg0.method22431(-118643075) * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt6096 * -457319509) == 0) {
			this.anInt6022 = 0;
		} else {
			this.anInt6022 = arg0.method22427(-1434290800) * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt6096 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22427(-1434290800);
			this.aClass107_2 = arg1.method33150(local225, 1201059334);
		}
	}

	@OriginalMember(owner = "client!xv", name = "g", descriptor = "(Lclient!alw;Lclient!xu;)V")
	public void method33250(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1451595330) == 1 && Class694.aClass104_14.method20425() > 0) {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) == 0) {
				this.anInt6023 = -322603459;
			} else {
				this.anInt6023 = arg0.method22431(-118643075) * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) == 0) {
				this.aFloat357 = 1.1523438F;
			} else {
				this.aFloat357 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) == 0) {
				this.aFloat352 = 0.69921875F;
			} else {
				this.aFloat352 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) == 0) {
				this.aFloat354 = 1.2F;
			} else {
				this.aFloat354 = (float) arg0.method22427(-1434290800) / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt6096 * -457319509) != 0) {
				arg0.method22431(-118643075);
			}
			if ((local3 & Class692.aClass692_4.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_3.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			if ((local3 & Class692.aClass692_2.anInt6096 * -457319509) != 0) {
				arg0.method22427(-1434290800);
			}
			this.anInt6023 = -322603459;
			this.aFloat354 = 1.2F;
			this.aFloat352 = 0.69921875F;
			this.aFloat357 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt6096 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29710(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29710((float) arg0.method22494((byte) -71), (float) arg0.method22494((byte) -26), (float) arg0.method22494((byte) -22));
		}
		if ((local3 & Class692.aClass692_6.anInt6096 * -457319509) == 0) {
			this.anInt6021 = -137394200;
		} else {
			this.anInt6021 = arg0.method22431(-118643075) * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt6096 * -457319509) == 0) {
			this.anInt6022 = 0;
		} else {
			this.anInt6022 = arg0.method22427(-1434290800) * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt6096 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22427(-1434290800);
			this.aClass107_2 = arg1.method33150(local225, 1145845549);
		}
	}

	@OriginalMember(owner = "client!xv", name = "j", descriptor = "(Lclient!alw;)V")
	public void method33251(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method33234(arg0, 0, 2145403597);
	}

	@OriginalMember(owner = "client!xv", name = "t", descriptor = "(Lclient!alw;I)V")
	void method33252(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray517[arg1] = arg0.method22427(-1434290800);
		this.aFloatArray121[arg1] = arg0.method22437(618512706);
	}

	@OriginalMember(owner = "client!xv", name = "ae", descriptor = "(Lclient!alw;Lclient!xu;)V")
	public void method33253(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		@Pc(7) int local7 = arg0.method22494((byte) -31);
		@Pc(11) int local11 = arg0.method22494((byte) -105);
		@Pc(15) int local15 = arg0.method22494((byte) -54);
		@Pc(19) int local19 = arg0.method22427(-1434290800);
		Class121.anInt1003 = local19 * -1237225441;
		this.aClass562_3 = arg1.method33151(local3, local7, local11, local15, 425185103);
	}

	@OriginalMember(owner = "client!xv", name = "v", descriptor = "(Lclient!xv;)V")
	void method33254(@OriginalArg(0) Class672 arg0) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "o", descriptor = "(Lclient!xv;)V")
	void method33255(@OriginalArg(0) Class672 arg0) {
		this.anInt6023 = arg0.anInt6023;
		this.aFloat357 = arg0.aFloat357;
		this.aFloat352 = arg0.aFloat352;
		this.aFloat354 = arg0.aFloat354;
		this.aClass472_65.method29719(arg0.aClass472_65);
		this.anInt6021 = arg0.anInt6021;
		this.anInt6022 = arg0.anInt6022;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat356 = arg0.aFloat356;
		this.aFloat360 = arg0.aFloat360;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat359 = arg0.aFloat359;
		this.aFloat355 = arg0.aFloat355;
		this.aFloat361 = arg0.aFloat361;
		this.aFloat362 = arg0.aFloat362;
		this.aFloat358 = arg0.aFloat358;
		this.anIntArray517[0] = arg0.anIntArray517[0];
		this.anIntArray517[1] = arg0.anIntArray517[1];
		this.anIntArray517[2] = arg0.anIntArray517[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "al", descriptor = "(Lclient!xu;Lclient!yj;)V")
	void method33256(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1490421126) == 1 && Class694.aClass104_14.method20425() > 0) {
			if (arg1.method33589(-1028581434) != -1) {
				this.anInt6023 = arg1.method33589(-1336241233) * -700806717;
			}
			if (arg1.method33541(97341858) != -1.0F) {
				this.aFloat357 = arg1.method33541(-802134677);
			}
			if (arg1.method33552(1747483738) != -1.0F) {
				this.aFloat352 = arg1.method33552(1733535101);
			}
			if (arg1.method33555(-802039573) != -1.0F) {
				this.aFloat354 = arg1.method33555(656346839);
			}
		}
		if (arg1.method33543(65280) != null) {
			this.aClass472_65.method29719(arg1.method33543(65280));
		}
		if (arg1.method33582(2068634367) != -1) {
			this.anInt6021 = arg1.method33582(2068634367) * -597457079;
		}
		if (arg1.method33545(1175974538) != -1) {
			this.anInt6022 = arg1.method33545(1656211662) * -2016100073;
		}
		if (arg1.method33546(284771243) != -1.0F) {
			this.aFloat356 = arg1.method33546(678672379);
		}
		if (arg1.method33547(-816478179) != -1.0F) {
			this.aFloat360 = arg1.method33547(-816478179);
		}
		if (arg1.method33548(504458359) != -1.0F) {
			this.aFloat353 = arg1.method33548(504458359);
		}
		if (arg1.method33574((byte) 24) != -1) {
			this.aClass107_2 = arg0.method33150(arg1.method33574((byte) 16), 1341634025);
		}
		if (arg1.method33550((byte) -17) != -1) {
			@Pc(142) int local142 = arg1.method33550((byte) -113);
			@Pc(146) int local146 = arg1.method33551(766756009);
			@Pc(150) int local150 = arg1.method33590(-1485132125);
			@Pc(154) int local154 = arg1.method33553(-692624533);
			@Pc(158) int local158 = arg1.method33554(-623053221);
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method33151(local142, local146, local150, local154, -2141462125);
		}
		if (arg1.method33580(0, 1964424864) != -1) {
			this.anIntArray517[0] = arg1.method33580(0, 2080784537);
			this.aFloatArray121[0] = arg1.method33538(0, -1144912587);
		}
		if (arg1.method33580(1, 1989546656) != -1) {
			this.anIntArray517[1] = arg1.method33580(1, 1879960775);
			this.aFloatArray121[1] = arg1.method33538(1, -2112308024);
		}
		if (arg1.method33580(2, 2034748644) != -1) {
			this.anIntArray517[2] = arg1.method33580(2, 2015491502);
			this.aFloatArray121[2] = arg1.method33538(2, -1541119712);
		}
	}

	@OriginalMember(owner = "client!xv", name = "ac", descriptor = "(Lclient!xu;Lclient!yj;)V")
	void method33257(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-951713330) == 1 && Class694.aClass104_14.method20425() > 0) {
			if (arg1.method33589(1415940018) != -1) {
				this.anInt6023 = arg1.method33589(1821462312) * -700806717;
			}
			if (arg1.method33541(-1047380795) != -1.0F) {
				this.aFloat357 = arg1.method33541(-1260570622);
			}
			if (arg1.method33552(1685473821) != -1.0F) {
				this.aFloat352 = arg1.method33552(1594122771);
			}
			if (arg1.method33555(-234972895) != -1.0F) {
				this.aFloat354 = arg1.method33555(-398060867);
			}
		}
		if (arg1.method33543(65280) != null) {
			this.aClass472_65.method29719(arg1.method33543(65280));
		}
		if (arg1.method33582(2068634367) != -1) {
			this.anInt6021 = arg1.method33582(2068634367) * -597457079;
		}
		if (arg1.method33545(577031272) != -1) {
			this.anInt6022 = arg1.method33545(885625008) * -2016100073;
		}
		if (arg1.method33546(1616202844) != -1.0F) {
			this.aFloat356 = arg1.method33546(-457333826);
		}
		if (arg1.method33547(-816478179) != -1.0F) {
			this.aFloat360 = arg1.method33547(-816478179);
		}
		if (arg1.method33548(504458359) != -1.0F) {
			this.aFloat353 = arg1.method33548(504458359);
		}
		if (arg1.method33574((byte) -93) != -1) {
			this.aClass107_2 = arg0.method33150(arg1.method33574((byte) 48), 1145659888);
		}
		if (arg1.method33550((byte) -100) != -1) {
			@Pc(142) int local142 = arg1.method33550((byte) 6);
			@Pc(146) int local146 = arg1.method33551(752773000);
			@Pc(150) int local150 = arg1.method33590(-1870944102);
			@Pc(154) int local154 = arg1.method33553(-1749269033);
			@Pc(158) int local158 = arg1.method33554(631448800);
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method33151(local142, local146, local150, local154, -527588503);
		}
		if (arg1.method33580(0, 2125660458) != -1) {
			this.anIntArray517[0] = arg1.method33580(0, 2099098692);
			this.aFloatArray121[0] = arg1.method33538(0, -808592492);
		}
		if (arg1.method33580(1, 1896599290) != -1) {
			this.anIntArray517[1] = arg1.method33580(1, 1912325179);
			this.aFloatArray121[1] = arg1.method33538(1, -2130341470);
		}
		if (arg1.method33580(2, 2143870777) != -1) {
			this.anIntArray517[2] = arg1.method33580(2, 2134304675);
			this.aFloatArray121[2] = arg1.method33538(2, -1206725241);
		}
	}

	@OriginalMember(owner = "client!xv", name = "ai", descriptor = "()I")
	public int method33258() {
		return this.anInt6021 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "m", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;FI)V")
	void method33259(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.anInt6023 = Class125_Sub2_Sub1.method21481(arg1.anInt6023 * 1540075243, arg2.anInt6023 * 1540075243, arg3 * 255.0F, 1974632983) * -700806717;
		this.aFloat352 = arg1.aFloat352 + (arg2.aFloat352 - arg1.aFloat352) * arg3;
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat357 = arg1.aFloat357 + arg3 * (arg2.aFloat357 - arg1.aFloat357);
		this.aFloat360 = arg3 * (arg2.aFloat360 - arg1.aFloat360) + arg1.aFloat360;
		this.aFloat353 = (arg2.aFloat353 - arg1.aFloat353) * arg3 + arg1.aFloat353;
		this.aFloat356 = arg1.aFloat356 + arg3 * (arg2.aFloat356 - arg1.aFloat356);
		this.anInt6021 = Class125_Sub2_Sub1.method21481(arg1.anInt6021 * -2016142599, arg2.anInt6021 * -2016142599, arg3 * 255.0F, 1484837105) * -597457079;
		this.anInt6022 = (int) ((float) (arg2.anInt6022 * -2139322713 - arg1.anInt6022 * -2139322713) * arg3 + (float) (arg1.anInt6022 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20746(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 0, 1198216729);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31338((int) (arg3 * 255.0F), 255, 1520794733);
				}
			}
		}
		this.aFloat359 = arg1.aFloat359 + (arg2.aFloat359 - arg1.aFloat359) * arg3;
		this.aFloat355 = arg1.aFloat355 + arg3 * (arg2.aFloat355 - arg1.aFloat355);
		this.aFloat361 = arg1.aFloat361 + arg3 * (arg2.aFloat361 - arg1.aFloat361);
		this.aFloat362 = arg3 * (arg2.aFloat362 - arg1.aFloat362) + arg1.aFloat362;
		this.aFloat358 = arg1.aFloat358 + (arg2.aFloat358 - arg1.aFloat358) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray517;
			@Pc(294) int[] local294 = this.anIntArray517;
			this.anIntArray517[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray517[0] == -1 && arg1.anIntArray517[1] == -1 && arg1.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg2.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray517[0] == -1 && arg2.anIntArray517[1] == -1 && arg2.anIntArray517[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray517[local347] = arg1.anIntArray517[local347];
				if (this.anIntArray517[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray517[local503] > -1) {
					local474[local447] = arg1.anIntArray517[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray517[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray517[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray517[local535];
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
				Class630.method32452(local313, local474, 0, local447 - 1, -1803832982);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray517[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "as", descriptor = "()Lclient!sv;")
	public Class562 method33260() {
		return this.aClass562_3;
	}
}
