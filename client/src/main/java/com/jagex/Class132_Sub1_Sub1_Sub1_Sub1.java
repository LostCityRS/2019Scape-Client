package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqc")
public final class Class132_Sub1_Sub1_Sub1_Sub1 extends Class132_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!aqc", name = "cx", descriptor = "I")
	public static int anInt2644 = -588889149;

	@OriginalMember(owner = "client!aqc", name = "cw", descriptor = "I")
	public static int anInt2645 = 1113118159;

	@OriginalMember(owner = "client!aqc", name = "ch", descriptor = "I")
	int anInt2641;

	@OriginalMember(owner = "client!aqc", name = "ca", descriptor = "Lclient!ia;")
	public Class331 aClass331_1;

	@OriginalMember(owner = "client!aqc", name = "cf", descriptor = "Lclient!id;")
	public Class334 aClass334_1;

	@OriginalMember(owner = "client!aqc", name = "co", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!aqc", name = "cr", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!aqc", name = "cn", descriptor = "Lclient!if;")
	public Class336 aClass336_1;

	@OriginalMember(owner = "client!aqc", name = "cz", descriptor = "Z")
	boolean aBoolean402;

	@OriginalMember(owner = "client!aqc", name = "cb", descriptor = "I")
	int anInt2648;

	@OriginalMember(owner = "client!aqc", name = "cs", descriptor = "I")
	int anInt2649;

	@OriginalMember(owner = "client!aqc", name = "cy", descriptor = "I")
	int anInt2650;

	@OriginalMember(owner = "client!aqc", name = "cc", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!aqc", name = "cv", descriptor = "I")
	public int anInt2642 = -757135575;

	@OriginalMember(owner = "client!aqc", name = "cp", descriptor = "I")
	public int anInt2643 = 1574519779;

	@OriginalMember(owner = "client!aqc", name = "ct", descriptor = "I")
	public int anInt2646 = -28943715;

	@OriginalMember(owner = "client!aqc", name = "cm", descriptor = "[I")
	int[] anIntArray224 = new int[6];

	@OriginalMember(owner = "client!aqc", name = "cq", descriptor = "[I")
	int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!aqc", name = "awk", descriptor = "(Lclient!yf;I)V")
	static void method18639(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class305.method26889(842555174);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class106_Sub1.method5147(local2);
	}

	@OriginalMember(owner = "client!aqc", name = "re", descriptor = "(Lclient!yf;I)V")
	static void method18640(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4022 * 1215292027;
	}

	@OriginalMember(owner = "client!aqc", name = "bo", descriptor = "(Lclient!yf;I)V")
	static void method18641(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 == null) {
			return;
		}
		@Pc(30) int local30;
		for (local30 = 0; local30 < Class369.anIntArray431.length; local30++) {
			if (Class369.anIntArray431[local30] == local13) {
				Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32941(local30, local23, Class343.aClass32_Sub19_1, 528085384);
				return;
			}
		}
		for (local30 = 0; local30 < Class369.anIntArray433.length; local30++) {
			if (local13 == Class369.anIntArray433[local30]) {
				Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32941(local30, local23, Class343.aClass32_Sub19_1, 248287246);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aqc", name = "<init>", descriptor = "(Lclient!tx;)V")
	public Class132_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) Class585 arg0) {
		super(arg0, Class684.aClass79_Sub1_Sub2_7);
		this.method18629(1571232455);
	}

	@OriginalMember(owner = "client!aqc", name = "<init>", descriptor = "(Lclient!tx;I)V")
	public Class132_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class684.aClass79_Sub1_Sub2_7);
		this.method18629(1971448459);
	}

	@OriginalMember(owner = "client!aqc", name = "ho", descriptor = "()V")
	public void method18599() {
		this.anInt2783 = -1845625635;
		this.anInt2784 = client.anInt3485 * 1966595751;
	}

	@OriginalMember(owner = "client!aqc", name = "gt", descriptor = "()Z")
	@Override
	public boolean method24312() {
		return this.aClass336_1.anIntArray414 == null || this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 32438) != null;
	}

	@OriginalMember(owner = "client!aqc", name = "hq", descriptor = "(B)V")
	public void method18600(@OriginalArg(0) byte arg0) {
		this.anInt2783 = -1845625635;
		this.anInt2784 = client.anInt3485 * 1966595751;
	}

	@OriginalMember(owner = "client!aqc", name = "ep", descriptor = "()I")
	@Override
	public int method20041() {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(11) Class336 local11 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 27471);
			if (local11 != null && local11.anInt4197 * -1610600657 != -1) {
				return local11.anInt4197 * -1610600657;
			}
		}
		return this.aClass336_1.anInt4197 * -1610600657;
	}

	@OriginalMember(owner = "client!aqc", name = "hr", descriptor = "(Lclient!if;I)V")
	public void method18601(@OriginalArg(0) Class336 arg0, @OriginalArg(1) int arg1) {
		this.method18602(arg0, true, true, true, (short) -23807);
	}

	@OriginalMember(owner = "client!aqc", name = "hs", descriptor = "(Lclient!if;ZZZS)V")
	public void method18602(@OriginalArg(0) Class336 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) short arg4) {
		if (this.aClass336_1 != arg0 && Class454.aBoolean782 && Class568.method31479(this.anInt2768 * -1688488127, (byte) -120)) {
			Class436.method28992(-916881791);
		}
		this.aClass336_1 = arg0;
		if (this.aClass336_1 != null) {
			if (arg1) {
				this.aString66 = this.aClass336_1.aString184;
			}
			if (arg2) {
				this.anInt2647 = this.aClass336_1.anInt4200 * 342332629;
			}
			if (arg3) {
				this.aClass334_1 = null;
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "ip", descriptor = "()Z")
	boolean method18603() {
		return this.aBoolean402 || this.aClass336_1.aBoolean722;
	}

	@OriginalMember(owner = "client!aqc", name = "cs", descriptor = "()I")
	@Override
	public int method24298() {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(10) Class336 local10 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 17542);
			if (local10 != null && local10.anInt4217 * -962798449 != -1) {
				return local10.anInt4217 * -962798449;
			}
		}
		return this.aClass336_1.anInt4217 * -962798449 == -1 ? super.method24287(899866876) : this.aClass336_1.anInt4217 * -962798449;
	}

	@OriginalMember(owner = "client!aqc", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass336_1 == null || !this.aBoolean453 && !this.method18612(arg0, 0, -1792171007)) {
			return;
		}
		@Pc(17) Class470 local17 = arg0.method20520();
		local17.method29545(this.method24238());
		local17.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local17, this.aBoolean453, -1958383442);
		for (@Pc(37) int local37 = 0; local37 < this.aClass109Array3.length; local37++) {
			this.aClass109Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass336_1 == null || !this.method18612(arg0, 526336, -1792171007)) {
			return null;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(19) Class470 local19 = arg0.method20520();
		@Pc(24) int local24 = this.aClass523_7.method30544(1619936203);
		@Pc(45) Class572 local45 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local16.aClass472_61.aFloat325 >> 9][(int) local16.aClass472_61.aFloat327 >> 9];
		if (local45 == null || local45.aClass132_Sub1_Sub4_1 == null) {
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) (this.anInt2770 * -78148565) / 10.0F) * 1068028547;
		} else {
			@Pc(60) int local60 = this.anInt2770 * -78148565 - local45.aClass132_Sub1_Sub4_1.aShort97;
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) local60 / 10.0F) * 1068028547;
		}
		local19.method29545(local13);
		local19.method29568(0.0F, (float) (-20 - -78148565 * this.anInt2770), 0.0F);
		@Pc(112) Class622 local112 = this.method19978(1195709612);
		@Pc(126) Class336 local126 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 17955);
		@Pc(134) boolean local134 = local126.aClass463_1 != null;
		this.aBoolean455 = false;
		@Pc(139) Class573 local139 = null;
		if (Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15819(-1890656231) == 1 && local126.aBoolean718 && local112.aBoolean853) {
			@Pc(166) Class19 local166 = this.aClass19_3.method23564(158322583) && this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
			@Pc(183) Class19_Sub3 local183 = this.aClass19_Sub3_3.method23564(-914049455) && (!this.aClass19_Sub3_3.aBoolean380 || local166 == null) ? this.aClass19_Sub3_3 : null;
			@Pc(186) short local186 = Class93_Sub26.aClass645_15.aShort184;
			@Pc(189) byte local189 = Class93_Sub26.aClass645_15.aByte174;
			if (this.aClass336_1.aShort167 > -1) {
				local186 = this.aClass336_1.aShort167;
				local189 = this.aClass336_1.aByte131;
			}
			@Pc(240) Class109 local240;
			if (local186 > -1 && Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-2005850360) == 1) {
				local240 = Class270.method26391(arg0, local24, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass109Array3[0], local186, local189, local183 == null ? local166 : local183, -633139408);
			} else {
				local240 = Class365.method28102(arg0, local24, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass336_1.anInt4195 * 447008399, this.aClass109Array3[0], this.aClass336_1.aShort166 & 0xFFFF, this.aClass336_1.aShort165 & 0xFFFF, this.aClass336_1.aByte135 & 0xFF, this.aClass336_1.aByte136 & 0xFF, local183 == null ? local166 : local183, (byte) -73);
			}
			if (local240 != null) {
				local139 = Class125_Sub1.method9214(this.method18607(1625759011), 373147274);
				this.aBoolean455 = true;
				arg0.method20530(false);
				if (local134) {
					local240.method6947(local19, null, 0);
				} else {
					if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length + 1) {
						this.method24288(this.aClass109Array3.length + 1, -1207364099);
					}
					local240.method6947(local19, this.aClass241Array21[this.aClass109Array3.length], 0);
				}
				arg0.method20530(true);
			}
		}
		if (local134) {
			if (this.aClass241Array21 == null || this.aClass241Array21.length > 1) {
				this.method24288(1, 690800751);
			}
			arg0.method20504(local19, this.aClass241Array21[0], local126.aClass463_1);
		} else if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length) {
			this.method24288(this.aClass109Array3.length, -1145834413);
		}
		if (local139 == null) {
			local139 = Class125_Sub1.method9214(this.method18607(1447734961), 373147274);
		}
		this.method20033(arg0, this.aClass109Array3, local19, false, -1901757306);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass109Array3.length; local408++) {
			if (this.aClass109Array3[local408] != null) {
				if (this.aClass336_1.aBoolean725) {
					this.aClass109Array3[local408].method6879(this.anInt2641 * -1517472209, this.anInt2648 * -1381753567, this.anInt2649 * 106132291, this.anInt2650 * 687473301);
				}
				if (local134) {
					this.aClass109Array3[local408].method6947(local19, null, 0);
				} else {
					this.aClass109Array3[local408].method6947(local19, this.aClass241Array21[local408], 0);
				}
			} else if (!local134) {
				this.aClass241Array21[local408].aBoolean667 = false;
			}
		}
		if (this.aClass674_3 != null) {
			@Pc(484) Class229 local484 = this.aClass674_3.method33308();
			arg0.method20509(local484);
		}
		for (local408 = 0; local408 < this.aClass109Array3.length; local408++) {
			if (this.aClass109Array3[local408] != null) {
				this.aBoolean455 |= this.aClass109Array3[local408].method6865();
			}
			this.aClass109Array3[local408] = null;
		}
		this.anInt2761 = client.anInt3495 * 706144655;
		return local139;
	}

	@OriginalMember(owner = "client!aqc", name = "hy", descriptor = "(IIIZIB)V")
	public void method18604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.aByte100 = this.aByte99 = (byte) arg0;
		if (client.aClass532_1.method30690(-1807976770).method30511(arg1, arg2, -662808309)) {
			this.aByte99++;
		}
		if (this.aClass19_3.method23564(-1838942885) && this.aClass19_3.method23565(-419482638).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, 1604043335);
		}
		@Pc(45) int local45;
		for (local45 = 0; local45 < this.aClass554Array3.length; local45++) {
			if (this.aClass554Array3[local45].anInt5480 * 601549465 != -1) {
				@Pc(71) Class697 local71 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local45].anInt5480 * 601549465, 1964285781);
				if (local71.aBoolean890 && local71.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local71.anInt6110 * 1477426425, -309386659)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local45].aClass19_7.method23580(-1, 912807568);
					this.aClass554Array3[local45].anInt5480 = 1020147287;
				}
			}
		}
		if (!arg3) {
			local45 = arg1 - this.anIntArray240[0];
			@Pc(125) int local125 = arg2 - this.anIntArray239[0];
			if (local45 >= -8 && local45 <= 8 && local125 >= -8 && local125 <= 8) {
				if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
					this.anInt2763 += 1975362387;
				}
				for (@Pc(158) int local158 = this.anInt2763 * -846948133; local158 > 0; local158--) {
					this.anIntArray240[local158] = this.anIntArray240[local158 - 1];
					this.anIntArray239[local158] = this.anIntArray239[local158 - 1];
					this.aByteArray47[local158] = this.aByteArray47[local158 - 1];
				}
				this.anIntArray240[0] = arg1;
				this.anIntArray239[0] = arg2;
				this.aByteArray47[0] = Class707.aClass707_2.aByte176;
				return;
			}
		}
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg1;
		this.anIntArray239[0] = arg2;
		@Pc(233) Class472 local233 = Class472.method29711(this.method24241().aClass472_61);
		local233.aFloat325 = (arg4 << 8) + (this.anIntArray240[0] << 9);
		local233.aFloat327 = (this.anIntArray239[0] << 9) + (arg4 << 8);
		this.method24236(local233);
		local233.method29713();
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "he", descriptor = "(I)Z")
	public boolean method18605(@OriginalArg(0) int arg0) {
		return this.aClass336_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "iw", descriptor = "()Z")
	boolean method18606() {
		return this.aBoolean402 || this.aClass336_1.aBoolean722;
	}

	@OriginalMember(owner = "client!aqc", name = "bs", descriptor = "(B)I")
	@Override
	public int method19962(@OriginalArg(0) byte arg0) {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(11) Class336 local11 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 10048);
			if (local11 != null && local11.anInt4197 * -1610600657 != -1) {
				return local11.anInt4197 * -1610600657;
			}
		}
		return this.aClass336_1.anInt4197 * -1610600657;
	}

	@OriginalMember(owner = "client!aqc", name = "w", descriptor = "()Lclient!jl;")
	@Override
	public Class363 method19954() {
		return Class363.aClass363_2;
	}

	@OriginalMember(owner = "client!aqc", name = "hn", descriptor = "(I)Z")
	boolean method18607(@OriginalArg(0) int arg0) {
		return this.aBoolean402 || this.aClass336_1.aBoolean722;
	}

	@OriginalMember(owner = "client!aqc", name = "gp", descriptor = "(I)I")
	@Override
	int method24317(@OriginalArg(0) int arg0) {
		return this.aClass336_1 == null ? 0 : this.aClass336_1.anInt4198 * 1019163253;
	}

	@OriginalMember(owner = "client!aqc", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass336_1 == null) {
			return false;
		} else if (this.aClass336_1.aClass463_1 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), this.aClass336_1.aClass463_1, 1007286102);
		} else if (this.method18612(arg0, 131072, -1792171007)) {
			@Pc(30) Class470 local30 = this.method24238();
			@Pc(32) boolean local32 = false;
			@Pc(34) int local34;
			for (local34 = 0; local34 < this.aClass109Array3.length; local34++) {
				if (this.aClass109Array3[local34] != null && this.aClass109Array3[local34].aBoolean161) {
					@Pc(80) boolean var10000;
					label68: {
						if (this.aClass336_1.anInt4198 * 1019163253 <= 0) {
							label67: {
								if (this.aClass336_1.anInt4219 * 692105195 == -1) {
									if (this.aClass336_1.anInt4195 * 447008399 == 1) {
										break label67;
									}
								} else if (this.aClass336_1.anInt4219 * 692105195 == 1) {
									break label67;
								}
								var10000 = false;
								break label68;
							}
						}
						var10000 = true;
					}
					@Pc(83) boolean local83 = var10000;
					@Pc(98) boolean local98 = this.aClass109Array3[local34].method6859(arg1, arg2, local30, local83, this.aClass336_1.anInt4198 * 1019163253);
					if (local98) {
						local32 = true;
						break;
					}
				}
			}
			for (local34 = 0; local34 < this.aClass109Array3.length; local34++) {
				this.aClass109Array3[local34] = null;
			}
			return local32;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "hi", descriptor = "(IB)I")
	public int method18608(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.anIntArray224[arg0];
	}

	@OriginalMember(owner = "client!aqc", name = "hw", descriptor = "(IB)I")
	public int method18609(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.anIntArray223[arg0];
	}

	@OriginalMember(owner = "client!aqc", name = "ht", descriptor = "(IIIB)V")
	public void method18610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		this.anIntArray224[arg0] = arg1;
		this.anIntArray223[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqc", name = "cg", descriptor = "(I)Z")
	@Override
	public boolean method19982(@OriginalArg(0) int arg0) {
		return Class93_Sub26.aClass645_15.aBoolean866;
	}

	@OriginalMember(owner = "client!aqc", name = "ce", descriptor = "(I)Lclient!su;")
	@Override
	public Class561 method19983(@OriginalArg(0) int arg0) {
		return this.aClass561_3 != null && this.aClass561_3.aString236 == null ? null : this.aClass561_3;
	}

	@OriginalMember(owner = "client!aqc", name = "hc", descriptor = "(Ljava/lang/String;III)V")
	public void method18611(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Class451.method29129((byte) 3) * -568373981 * Class93_Sub26.aClass645_15.anInt5949;
		this.method19980(arg0, arg1, arg2, local7, 1011750655);
	}

	@OriginalMember(owner = "client!aqc", name = "hh", descriptor = "(Lclient!dh;II)Z")
	boolean method18612(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(-1225374632);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(-557976782) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(37) Class19_Sub3 local37 = this.aClass19_Sub3_3.method23564(-2030214229) && (!this.aClass19_Sub3_3.aBoolean380 || local20 == null) ? this.aClass19_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5827 * -1915635865;
		@Pc(47) int local47 = local5.anInt5828 * 512505351;
		if (local42 != 0 || local47 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) boolean local86 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local86) {
			arg1 |= 0x80000;
		}
		@Pc(94) boolean local94 = false;
		if (this.anInt2783 * -653477493 != 0) {
			@Pc(114) Class336 local114 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 13513);
			if (local114 == null || client.anInt3485 >= this.anInt2784 * -1767642857 + local114.anInt4224 * 1207466827) {
				this.anInt2783 = 0;
			} else {
				this.anInt2783 = (255 - (client.anInt3485 - -1767642857 * this.anInt2784) * 255 / (local114.anInt4224 * 1207466827)) * -1775753693;
				local94 = true;
			}
		}
		if (local94) {
			arg1 |= 0x100;
		}
		@Pc(163) int local163 = this.aClass523_7.method30544(605110613);
		@Pc(191) Class109 local191 = this.aClass109Array3[0] = this.aClass336_1.method27512(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class624.aClass120_1, Class624.aClass120_1, local20, local37, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local163, this.aClass331_1, this.method19979((short) 560), false, (byte) 10);
		if (local191 == null) {
			return false;
		}
		this.anInt2795 = local191.method6882() * -895607843;
		this.anInt2774 = local191.method6841() * -1359936025;
		local191.method6862();
		this.method19975(local191, 1003104086);
		if (local42 == 0 && local47 == 0) {
			this.method19977(local163, this.method20009(840696558) << 9, this.method20009(1305403030) << 9, 0, 0, (byte) 98);
		} else {
			this.method19977(local163, local42, local47, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 120);
			if (this.anInt2767 * -1595449153 != 0) {
				this.aClass109Array3[0].method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				this.aClass109Array3[0].method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				this.aClass109Array3[0].method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local86) {
			local191.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (local94) {
			local191.method6881((byte) (this.anInt2783 * -653477493), null);
		}
		this.method19976(arg0, local5, local1, local42, local47, local163, -999780167);
		return true;
	}

	@OriginalMember(owner = "client!aqc", name = "gh", descriptor = "()Z")
	@Override
	public boolean method24313() {
		return this.aClass336_1.anIntArray414 == null || this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 27781) != null;
	}

	@OriginalMember(owner = "client!aqc", name = "cx", descriptor = "(I)I")
	@Override
	public int method20035(@OriginalArg(0) int arg0) {
		return this.anInt2768 * -1688488127 + 1;
	}

	@OriginalMember(owner = "client!aqc", name = "hp", descriptor = "(Lclient!zi;II)V")
	public void method18613(@OriginalArg(0) Class706 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anIntArray240[0];
		@Pc(9) int local9 = this.anIntArray239[0];
		switch(arg0.anInt6116 * -303664357) {
			case 0:
				local9--;
				break;
			case 1:
				local4--;
				break;
			case 2:
				local4--;
				local9++;
				break;
			case 3:
				local4++;
				break;
			case 4:
				local4--;
				local9--;
				break;
			case 5:
				local4++;
				local9--;
				break;
			case 6:
				local4++;
				local9++;
				break;
			case 7:
				local9++;
		}
		if (this.aClass19_3.method23564(-896985826) && this.aClass19_3.method23565(-625063526).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, 1261604873);
		}
		@Pc(57) int local57;
		for (local57 = 0; local57 < this.aClass554Array3.length; local57++) {
			if (this.aClass554Array3[local57].anInt5480 * 601549465 != -1) {
				@Pc(83) Class697 local83 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local57].anInt5480 * 601549465, 192289221);
				if (local83.aBoolean890 && local83.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local83.anInt6110 * 1477426425, 1458740450)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local57].aClass19_7.method23580(-1, 449293107);
					this.aClass554Array3[local57].anInt5480 = 1020147287;
				}
			}
		}
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (local57 = this.anInt2763 * -846948133; local57 > 0; local57--) {
			this.anIntArray240[local57] = this.anIntArray240[local57 - 1];
			this.anIntArray239[local57] = this.anIntArray239[local57 - 1];
			this.aByteArray47[local57] = this.aByteArray47[local57 - 1];
		}
		this.anIntArray240[0] = local4;
		this.anIntArray239[0] = local9;
		this.aByteArray47[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!aqc", name = "k", descriptor = "(I)Lclient!ov;")
	@Override
	public Class471 method19951(@OriginalArg(0) int arg0) {
		@Pc(1) Class471 local1 = Class471.method29702();
		local1.method29648(Class464.method29463(this.aClass523_7.anInt5384 * -1093332503), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqc", name = "f", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method19949(@OriginalArg(0) byte arg0) {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqc", name = "gc", descriptor = "(I)Z")
	@Override
	public boolean method24280(@OriginalArg(0) int arg0) {
		return this.aClass336_1.anIntArray414 == null || this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 12899) != null;
	}

	@OriginalMember(owner = "client!aqc", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		if (this.aClass336_1 == null || !this.method18612(arg0, 526336, -1792171007)) {
			return null;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(19) Class470 local19 = arg0.method20520();
		@Pc(24) int local24 = this.aClass523_7.method30544(1320387377);
		@Pc(45) Class572 local45 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local16.aClass472_61.aFloat325 >> 9][(int) local16.aClass472_61.aFloat327 >> 9];
		if (local45 == null || local45.aClass132_Sub1_Sub4_1 == null) {
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) (this.anInt2770 * -78148565) / 10.0F) * 1068028547;
		} else {
			@Pc(60) int local60 = this.anInt2770 * -78148565 - local45.aClass132_Sub1_Sub4_1.aShort97;
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) local60 / 10.0F) * 1068028547;
		}
		local19.method29545(local13);
		local19.method29568(0.0F, (float) (-20 - -78148565 * this.anInt2770), 0.0F);
		@Pc(112) Class622 local112 = this.method19978(1723705474);
		@Pc(126) Class336 local126 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 28366);
		@Pc(134) boolean local134 = local126.aClass463_1 != null;
		this.aBoolean455 = false;
		@Pc(139) Class573 local139 = null;
		if (Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15819(484847692) == 1 && local126.aBoolean718 && local112.aBoolean853) {
			@Pc(166) Class19 local166 = this.aClass19_3.method23564(235109070) && this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
			@Pc(183) Class19_Sub3 local183 = this.aClass19_Sub3_3.method23564(1968391922) && (!this.aClass19_Sub3_3.aBoolean380 || local166 == null) ? this.aClass19_Sub3_3 : null;
			@Pc(186) short local186 = Class93_Sub26.aClass645_15.aShort184;
			@Pc(189) byte local189 = Class93_Sub26.aClass645_15.aByte174;
			if (this.aClass336_1.aShort167 > -1) {
				local186 = this.aClass336_1.aShort167;
				local189 = this.aClass336_1.aByte131;
			}
			@Pc(240) Class109 local240;
			if (local186 > -1 && Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-962404656) == 1) {
				local240 = Class270.method26391(arg0, local24, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass109Array3[0], local186, local189, local183 == null ? local166 : local183, 1798752829);
			} else {
				local240 = Class365.method28102(arg0, local24, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass336_1.anInt4195 * 447008399, this.aClass109Array3[0], this.aClass336_1.aShort166 & 0xFFFF, this.aClass336_1.aShort165 & 0xFFFF, this.aClass336_1.aByte135 & 0xFF, this.aClass336_1.aByte136 & 0xFF, local183 == null ? local166 : local183, (byte) -19);
			}
			if (local240 != null) {
				local139 = Class125_Sub1.method9214(this.method18607(1045508138), 373147274);
				this.aBoolean455 = true;
				arg0.method20530(false);
				if (local134) {
					local240.method6947(local19, null, 0);
				} else {
					if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length + 1) {
						this.method24288(this.aClass109Array3.length + 1, -1831450871);
					}
					local240.method6947(local19, this.aClass241Array21[this.aClass109Array3.length], 0);
				}
				arg0.method20530(true);
			}
		}
		if (local134) {
			if (this.aClass241Array21 == null || this.aClass241Array21.length > 1) {
				this.method24288(1, 1935441962);
			}
			arg0.method20504(local19, this.aClass241Array21[0], local126.aClass463_1);
		} else if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length) {
			this.method24288(this.aClass109Array3.length, 1391713453);
		}
		if (local139 == null) {
			local139 = Class125_Sub1.method9214(this.method18607(2034458568), 373147274);
		}
		this.method20033(arg0, this.aClass109Array3, local19, false, -1264411405);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass109Array3.length; local408++) {
			if (this.aClass109Array3[local408] != null) {
				if (this.aClass336_1.aBoolean725) {
					this.aClass109Array3[local408].method6879(this.anInt2641 * -1517472209, this.anInt2648 * -1381753567, this.anInt2649 * 106132291, this.anInt2650 * 687473301);
				}
				if (local134) {
					this.aClass109Array3[local408].method6947(local19, null, 0);
				} else {
					this.aClass109Array3[local408].method6947(local19, this.aClass241Array21[local408], 0);
				}
			} else if (!local134) {
				this.aClass241Array21[local408].aBoolean667 = false;
			}
		}
		if (this.aClass674_3 != null) {
			@Pc(484) Class229 local484 = this.aClass674_3.method33308();
			arg0.method20509(local484);
		}
		for (local408 = 0; local408 < this.aClass109Array3.length; local408++) {
			if (this.aClass109Array3[local408] != null) {
				this.aBoolean455 |= this.aClass109Array3[local408].method6865();
			}
			this.aClass109Array3[local408] = null;
		}
		this.anInt2761 = client.anInt3495 * 706144655;
		return local139;
	}

	@OriginalMember(owner = "client!aqc", name = "hv", descriptor = "()V")
	void method18614() {
		this.anInt2641 = ((int) (Math.random() * 4.0D) + 32) * 237359311;
		this.anInt2648 = ((int) (Math.random() * 2.0D) + 3) * 1962911457;
		this.anInt2649 = ((int) (Math.random() * 3.0D) + 16) * -616222357;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1832930692) == 1) {
			this.anInt2650 = (int) (Math.random() * 6.0D) * 1007532221;
		} else {
			this.anInt2650 = (int) (Math.random() * 12.0D) * 1007532221;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "z", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method19956() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(2067254857);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) -10152);
	}

	@OriginalMember(owner = "client!aqc", name = "p", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method19955() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(2078928802);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) 6808);
	}

	@OriginalMember(owner = "client!aqc", name = "d", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method19948() {
		@Pc(1) Class471 local1 = Class471.method29702();
		local1.method29648(Class464.method29463(this.aClass523_7.anInt5384 * -1093332503), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqc", name = "c", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19959() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqc", name = "r", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19960() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqc", name = "v", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19961() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqc", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "hj", descriptor = "()V")
	void method18615() {
		this.anInt2641 = ((int) (Math.random() * 4.0D) + 32) * 237359311;
		this.anInt2648 = ((int) (Math.random() * 2.0D) + 3) * 1962911457;
		this.anInt2649 = ((int) (Math.random() * 3.0D) + 16) * -616222357;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(1518852139) == 1) {
			this.anInt2650 = (int) (Math.random() * 6.0D) * 1007532221;
		} else {
			this.anInt2650 = (int) (Math.random() * 12.0D) * 1007532221;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "cb", descriptor = "()I")
	@Override
	public int method24297() {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(10) Class336 local10 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 11514);
			if (local10 != null && local10.anInt4217 * -962798449 != -1) {
				return local10.anInt4217 * -962798449;
			}
		}
		return this.aClass336_1.anInt4217 * -962798449 == -1 ? super.method24287(899866876) : this.aClass336_1.anInt4217 * -962798449;
	}

	@OriginalMember(owner = "client!aqc", name = "bo", descriptor = "(I)I")
	@Override
	public int method24287(@OriginalArg(0) int arg0) {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(10) Class336 local10 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 9212);
			if (local10 != null && local10.anInt4217 * -962798449 != -1) {
				return local10.anInt4217 * -962798449;
			}
		}
		return this.aClass336_1.anInt4217 * -962798449 == -1 ? super.method24287(899866876) : this.aClass336_1.anInt4217 * -962798449;
	}

	@OriginalMember(owner = "client!aqc", name = "cy", descriptor = "()I")
	@Override
	public int method24299() {
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(10) Class336 local10 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 16959);
			if (local10 != null && local10.anInt4217 * -962798449 != -1) {
				return local10.anInt4217 * -962798449;
			}
		}
		return this.aClass336_1.anInt4217 * -962798449 == -1 ? super.method24287(899866876) : this.aClass336_1.anInt4217 * -962798449;
	}

	@OriginalMember(owner = "client!aqc", name = "ib", descriptor = "()Z")
	public boolean method18616() {
		return this.aClass336_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		if (this.aClass336_1 == null || !this.aBoolean453 && !this.method18612(arg0, 0, -1792171007)) {
			return;
		}
		@Pc(17) Class470 local17 = arg0.method20520();
		local17.method29545(this.method24238());
		local17.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local17, this.aBoolean453, -415655074);
		for (@Pc(37) int local37 = 0; local37 < this.aClass109Array3.length; local37++) {
			this.aClass109Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		if (this.aClass336_1 == null || !this.aBoolean453 && !this.method18612(arg0, 0, -1792171007)) {
			return;
		}
		@Pc(17) Class470 local17 = arg0.method20520();
		local17.method29545(this.method24238());
		local17.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local17, this.aBoolean453, 1401211516);
		for (@Pc(37) int local37 = 0; local37 < this.aClass109Array3.length; local37++) {
			this.aClass109Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass336_1 == null) {
			return false;
		} else if (this.aClass336_1.aClass463_1 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), this.aClass336_1.aClass463_1, 1460472002);
		} else if (this.method18612(arg0, 131072, -1792171007)) {
			@Pc(30) Class470 local30 = this.method24238();
			@Pc(32) boolean local32 = false;
			@Pc(34) int local34;
			for (local34 = 0; local34 < this.aClass109Array3.length; local34++) {
				if (this.aClass109Array3[local34] != null && this.aClass109Array3[local34].aBoolean161) {
					@Pc(80) boolean var10000;
					label68: {
						if (this.aClass336_1.anInt4198 * 1019163253 <= 0) {
							label67: {
								if (this.aClass336_1.anInt4219 * 692105195 == -1) {
									if (this.aClass336_1.anInt4195 * 447008399 == 1) {
										break label67;
									}
								} else if (this.aClass336_1.anInt4219 * 692105195 == 1) {
									break label67;
								}
								var10000 = false;
								break label68;
							}
						}
						var10000 = true;
					}
					@Pc(83) boolean local83 = var10000;
					@Pc(98) boolean local98 = this.aClass109Array3[local34].method6859(arg1, arg2, local30, local83, this.aClass336_1.anInt4198 * 1019163253);
					if (local98) {
						local32 = true;
						break;
					}
				}
			}
			for (local34 = 0; local34 < this.aClass109Array3.length; local34++) {
				this.aClass109Array3[local34] = null;
			}
			return local32;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "e", descriptor = "(I)Lclient!jl;")
	@Override
	public Class363 method19958(@OriginalArg(0) int arg0) {
		return Class363.aClass363_2;
	}

	@OriginalMember(owner = "client!aqc", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "u", descriptor = "()Lclient!akt;")
	@Override
	public Class93_Sub30 method19952() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(1994750451);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) -12387);
	}

	@OriginalMember(owner = "client!aqc", name = "ei", descriptor = "()I")
	@Override
	int method20027() {
		if (this.anInt2646 * -1509096373 != -1) {
			return this.anInt2646 * -1509096373;
		}
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(22) Class336 local22 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 27819);
			if (local22 != null && local22.anInt4221 * 1511832251 != -1) {
				return local22.anInt4221 * 1511832251;
			}
		}
		return this.aClass336_1.anInt4221 * 1511832251;
	}

	@OriginalMember(owner = "client!aqc", name = "el", descriptor = "()I")
	@Override
	int method19968() {
		if (this.anInt2646 * -1509096373 != -1) {
			return this.anInt2646 * -1509096373;
		}
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(22) Class336 local22 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 8758);
			if (local22 != null && local22.anInt4221 * 1511832251 != -1) {
				return local22.anInt4221 * 1511832251;
			}
		}
		return this.aClass336_1.anInt4221 * 1511832251;
	}

	@OriginalMember(owner = "client!aqc", name = "ej", descriptor = "()I")
	@Override
	int method20017() {
		if (this.anInt2646 * -1509096373 != -1) {
			return this.anInt2646 * -1509096373;
		}
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(22) Class336 local22 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 20004);
			if (local22 != null && local22.anInt4221 * 1511832251 != -1) {
				return local22.anInt4221 * 1511832251;
			}
		}
		return this.aClass336_1.anInt4221 * 1511832251;
	}

	@OriginalMember(owner = "client!aqc", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "ek", descriptor = "()Z")
	@Override
	public boolean method20032() {
		return Class93_Sub26.aClass645_15.aBoolean866;
	}

	@OriginalMember(owner = "client!aqc", name = "em", descriptor = "()Z")
	@Override
	public boolean method20012() {
		return Class93_Sub26.aClass645_15.aBoolean866;
	}

	@OriginalMember(owner = "client!aqc", name = "eh", descriptor = "()Lclient!su;")
	@Override
	public Class561 method20034() {
		return this.aClass561_3 != null && this.aClass561_3.aString236 == null ? null : this.aClass561_3;
	}

	@OriginalMember(owner = "client!aqc", name = "eq", descriptor = "()Lclient!su;")
	@Override
	public Class561 method19992() {
		return this.aClass561_3 != null && this.aClass561_3.aString236 == null ? null : this.aClass561_3;
	}

	@OriginalMember(owner = "client!aqc", name = "m", descriptor = "(B)Lclient!akt;")
	@Override
	public Class93_Sub30 method19950(@OriginalArg(0) byte arg0) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(1793080753);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) -8537);
	}

	@OriginalMember(owner = "client!aqc", name = "fd", descriptor = "()I")
	@Override
	public int method20052() {
		return this.anInt2768 * -1688488127 + 1;
	}

	@OriginalMember(owner = "client!aqc", name = "gr", descriptor = "()I")
	@Override
	int method24289() {
		return this.aClass336_1 == null ? 0 : this.aClass336_1.anInt4198 * 1019163253;
	}

	@OriginalMember(owner = "client!aqc", name = "l", descriptor = "()I")
	@Override
	public int method19957() {
		return this.anInt2768 * -1688488127;
	}

	@OriginalMember(owner = "client!aqc", name = "fj", descriptor = "()I")
	@Override
	public int method20051() {
		return this.anInt2768 * -1688488127 + 1;
	}

	@OriginalMember(owner = "client!aqc", name = "bj", descriptor = "(S)I")
	@Override
	int method19979(@OriginalArg(0) short arg0) {
		if (this.anInt2646 * -1509096373 != -1) {
			return this.anInt2646 * -1509096373;
		}
		if (this.aClass336_1.anIntArray414 != null) {
			@Pc(22) Class336 local22 = this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 21450);
			if (local22 != null && local22.anInt4221 * 1511832251 != -1) {
				return local22.anInt4221 * 1511832251;
			}
		}
		return this.aClass336_1.anInt4221 * 1511832251;
	}

	@OriginalMember(owner = "client!aqc", name = "hz", descriptor = "()V")
	void method18617() {
		this.anInt2641 = ((int) (Math.random() * 4.0D) + 32) * 237359311;
		this.anInt2648 = ((int) (Math.random() * 2.0D) + 3) * 1962911457;
		this.anInt2649 = ((int) (Math.random() * 3.0D) + 16) * -616222357;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(806049606) == 1) {
			this.anInt2650 = (int) (Math.random() * 6.0D) * 1007532221;
		} else {
			this.anInt2650 = (int) (Math.random() * 12.0D) * 1007532221;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ij", descriptor = "()V")
	void method18618() {
		this.anInt2641 = ((int) (Math.random() * 4.0D) + 32) * 237359311;
		this.anInt2648 = ((int) (Math.random() * 2.0D) + 3) * 1962911457;
		this.anInt2649 = ((int) (Math.random() * 3.0D) + 16) * -616222357;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1321829975) == 1) {
			this.anInt2650 = (int) (Math.random() * 6.0D) * 1007532221;
		} else {
			this.anInt2650 = (int) (Math.random() * 12.0D) * 1007532221;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "io", descriptor = "(Lclient!if;)V")
	public void method18619(@OriginalArg(0) Class336 arg0) {
		this.method18602(arg0, true, true, true, (short) -18388);
	}

	@OriginalMember(owner = "client!aqc", name = "iq", descriptor = "(Lclient!if;ZZZ)V")
	public void method18620(@OriginalArg(0) Class336 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (this.aClass336_1 != arg0 && Class454.aBoolean782 && Class568.method31479(this.anInt2768 * -1688488127, (byte) 77)) {
			Class436.method28992(-916881791);
		}
		this.aClass336_1 = arg0;
		if (this.aClass336_1 != null) {
			if (arg1) {
				this.aString66 = this.aClass336_1.aString184;
			}
			if (arg2) {
				this.anInt2647 = this.aClass336_1.anInt4200 * 342332629;
			}
			if (arg3) {
				this.aClass334_1 = null;
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "il", descriptor = "()Z")
	boolean method18621() {
		return this.aBoolean402 || this.aClass336_1.aBoolean722;
	}

	@OriginalMember(owner = "client!aqc", name = "ig", descriptor = "(Lclient!dh;I)Z")
	boolean method18622(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(-1931854473);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(1543181983) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(37) Class19_Sub3 local37 = this.aClass19_Sub3_3.method23564(-1251898141) && (!this.aClass19_Sub3_3.aBoolean380 || local20 == null) ? this.aClass19_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5827 * -1915635865;
		@Pc(47) int local47 = local5.anInt5828 * 512505351;
		if (local42 != 0 || local47 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) boolean local86 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local86) {
			arg1 |= 0x80000;
		}
		@Pc(94) boolean local94 = false;
		if (this.anInt2783 * -653477493 != 0) {
			@Pc(114) Class336 local114 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 9896);
			if (local114 == null || client.anInt3485 >= this.anInt2784 * -1767642857 + local114.anInt4224 * 1207466827) {
				this.anInt2783 = 0;
			} else {
				this.anInt2783 = (255 - (client.anInt3485 - -1767642857 * this.anInt2784) * 255 / (local114.anInt4224 * 1207466827)) * -1775753693;
				local94 = true;
			}
		}
		if (local94) {
			arg1 |= 0x100;
		}
		@Pc(163) int local163 = this.aClass523_7.method30544(565854458);
		@Pc(191) Class109 local191 = this.aClass109Array3[0] = this.aClass336_1.method27512(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class624.aClass120_1, Class624.aClass120_1, local20, local37, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local163, this.aClass331_1, this.method19979((short) 560), false, (byte) 10);
		if (local191 == null) {
			return false;
		}
		this.anInt2795 = local191.method6882() * -895607843;
		this.anInt2774 = local191.method6841() * -1359936025;
		local191.method6862();
		this.method19975(local191, -1082419517);
		if (local42 == 0 && local47 == 0) {
			this.method19977(local163, this.method20009(-352965544) << 9, this.method20009(-411240107) << 9, 0, 0, (byte) 80);
		} else {
			this.method19977(local163, local42, local47, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 92);
			if (this.anInt2767 * -1595449153 != 0) {
				this.aClass109Array3[0].method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				this.aClass109Array3[0].method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				this.aClass109Array3[0].method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local86) {
			local191.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (local94) {
			local191.method6881((byte) (this.anInt2783 * -653477493), null);
		}
		this.method19976(arg0, local5, local1, local42, local47, local163, 1270983184);
		return true;
	}

	@OriginalMember(owner = "client!aqc", name = "ie", descriptor = "(Lclient!dh;I)Z")
	boolean method18623(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(1647623108);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(698966087) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(37) Class19_Sub3 local37 = this.aClass19_Sub3_3.method23564(821803051) && (!this.aClass19_Sub3_3.aBoolean380 || local20 == null) ? this.aClass19_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5827 * -1915635865;
		@Pc(47) int local47 = local5.anInt5828 * 512505351;
		if (local42 != 0 || local47 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) boolean local86 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local86) {
			arg1 |= 0x80000;
		}
		@Pc(94) boolean local94 = false;
		if (this.anInt2783 * -653477493 != 0) {
			@Pc(114) Class336 local114 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 24058);
			if (local114 == null || client.anInt3485 >= this.anInt2784 * -1767642857 + local114.anInt4224 * 1207466827) {
				this.anInt2783 = 0;
			} else {
				this.anInt2783 = (255 - (client.anInt3485 - -1767642857 * this.anInt2784) * 255 / (local114.anInt4224 * 1207466827)) * -1775753693;
				local94 = true;
			}
		}
		if (local94) {
			arg1 |= 0x100;
		}
		@Pc(163) int local163 = this.aClass523_7.method30544(-471397205);
		@Pc(191) Class109 local191 = this.aClass109Array3[0] = this.aClass336_1.method27512(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class624.aClass120_1, Class624.aClass120_1, local20, local37, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local163, this.aClass331_1, this.method19979((short) 560), false, (byte) 10);
		if (local191 == null) {
			return false;
		}
		this.anInt2795 = local191.method6882() * -895607843;
		this.anInt2774 = local191.method6841() * -1359936025;
		local191.method6862();
		this.method19975(local191, -249338998);
		if (local42 == 0 && local47 == 0) {
			this.method19977(local163, this.method20009(1651232078) << 9, this.method20009(-1287470120) << 9, 0, 0, (byte) 8);
		} else {
			this.method19977(local163, local42, local47, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) -1);
			if (this.anInt2767 * -1595449153 != 0) {
				this.aClass109Array3[0].method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				this.aClass109Array3[0].method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				this.aClass109Array3[0].method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local86) {
			local191.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (local94) {
			local191.method6881((byte) (this.anInt2783 * -653477493), null);
		}
		this.method19976(arg0, local5, local1, local42, local47, local163, 1680104051);
		return true;
	}

	@OriginalMember(owner = "client!aqc", name = "iu", descriptor = "(Lclient!zi;I)V")
	public void method18624(@OriginalArg(0) Class706 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray240[0];
		@Pc(9) int local9 = this.anIntArray239[0];
		switch(arg0.anInt6116 * -303664357) {
			case 0:
				local9--;
				break;
			case 1:
				local4--;
				break;
			case 2:
				local4--;
				local9++;
				break;
			case 3:
				local4++;
				break;
			case 4:
				local4--;
				local9--;
				break;
			case 5:
				local4++;
				local9--;
				break;
			case 6:
				local4++;
				local9++;
				break;
			case 7:
				local9++;
		}
		if (this.aClass19_3.method23564(-8149213) && this.aClass19_3.method23565(-805950564).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, 744261577);
		}
		@Pc(57) int local57;
		for (local57 = 0; local57 < this.aClass554Array3.length; local57++) {
			if (this.aClass554Array3[local57].anInt5480 * 601549465 != -1) {
				@Pc(83) Class697 local83 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local57].anInt5480 * 601549465, 1282002512);
				if (local83.aBoolean890 && local83.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local83.anInt6110 * 1477426425, 315734678)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local57].aClass19_7.method23580(-1, 2132025543);
					this.aClass554Array3[local57].anInt5480 = 1020147287;
				}
			}
		}
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (local57 = this.anInt2763 * -846948133; local57 > 0; local57--) {
			this.anIntArray240[local57] = this.anIntArray240[local57 - 1];
			this.anIntArray239[local57] = this.anIntArray239[local57 - 1];
			this.aByteArray47[local57] = this.aByteArray47[local57 - 1];
		}
		this.anIntArray240[0] = local4;
		this.anIntArray239[0] = local9;
		this.aByteArray47[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!aqc", name = "in", descriptor = "(Lclient!zi;I)V")
	public void method18625(@OriginalArg(0) Class706 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray240[0];
		@Pc(9) int local9 = this.anIntArray239[0];
		switch(arg0.anInt6116 * -303664357) {
			case 0:
				local9--;
				break;
			case 1:
				local4--;
				break;
			case 2:
				local4--;
				local9++;
				break;
			case 3:
				local4++;
				break;
			case 4:
				local4--;
				local9--;
				break;
			case 5:
				local4++;
				local9--;
				break;
			case 6:
				local4++;
				local9++;
				break;
			case 7:
				local9++;
		}
		if (this.aClass19_3.method23564(-1975015249) && this.aClass19_3.method23565(-1852882753).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, 1678170241);
		}
		@Pc(57) int local57;
		for (local57 = 0; local57 < this.aClass554Array3.length; local57++) {
			if (this.aClass554Array3[local57].anInt5480 * 601549465 != -1) {
				@Pc(83) Class697 local83 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local57].anInt5480 * 601549465, -1778686446);
				if (local83.aBoolean890 && local83.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local83.anInt6110 * 1477426425, -1535807356)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local57].aClass19_7.method23580(-1, 2109468995);
					this.aClass554Array3[local57].anInt5480 = 1020147287;
				}
			}
		}
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (local57 = this.anInt2763 * -846948133; local57 > 0; local57--) {
			this.anIntArray240[local57] = this.anIntArray240[local57 - 1];
			this.anIntArray239[local57] = this.anIntArray239[local57 - 1];
			this.aByteArray47[local57] = this.aByteArray47[local57 - 1];
		}
		this.anIntArray240[0] = local4;
		this.anIntArray239[0] = local9;
		this.aByteArray47[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!aqc", name = "ir", descriptor = "(Lclient!zi;I)V")
	public void method18626(@OriginalArg(0) Class706 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray240[0];
		@Pc(9) int local9 = this.anIntArray239[0];
		switch(arg0.anInt6116 * -303664357) {
			case 0:
				local9--;
				break;
			case 1:
				local4--;
				break;
			case 2:
				local4--;
				local9++;
				break;
			case 3:
				local4++;
				break;
			case 4:
				local4--;
				local9--;
				break;
			case 5:
				local4++;
				local9--;
				break;
			case 6:
				local4++;
				local9++;
				break;
			case 7:
				local9++;
		}
		if (this.aClass19_3.method23564(1441212241) && this.aClass19_3.method23565(-586715580).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, -69359784);
		}
		@Pc(57) int local57;
		for (local57 = 0; local57 < this.aClass554Array3.length; local57++) {
			if (this.aClass554Array3[local57].anInt5480 * 601549465 != -1) {
				@Pc(83) Class697 local83 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local57].anInt5480 * 601549465, 683976343);
				if (local83.aBoolean890 && local83.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local83.anInt6110 * 1477426425, -640853206)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local57].aClass19_7.method23580(-1, 1761663402);
					this.aClass554Array3[local57].anInt5480 = 1020147287;
				}
			}
		}
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (local57 = this.anInt2763 * -846948133; local57 > 0; local57--) {
			this.anIntArray240[local57] = this.anIntArray240[local57 - 1];
			this.anIntArray239[local57] = this.anIntArray239[local57 - 1];
			this.aByteArray47[local57] = this.aByteArray47[local57 - 1];
		}
		this.anIntArray240[0] = local4;
		this.anIntArray239[0] = local9;
		this.aByteArray47[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!aqc", name = "it", descriptor = "()Z")
	public boolean method18627() {
		return this.aClass336_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "ix", descriptor = "()Z")
	public boolean method18628() {
		return this.aClass336_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "n", descriptor = "(I)I")
	@Override
	public int method19953(@OriginalArg(0) int arg0) {
		return this.anInt2768 * -1688488127;
	}

	@OriginalMember(owner = "client!aqc", name = "hf", descriptor = "(I)V")
	void method18629(@OriginalArg(0) int arg0) {
		this.anInt2641 = ((int) (Math.random() * 4.0D) + 32) * 237359311;
		this.anInt2648 = ((int) (Math.random() * 2.0D) + 3) * 1962911457;
		this.anInt2649 = ((int) (Math.random() * 3.0D) + 16) * -616222357;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(1115153392) == 1) {
			this.anInt2650 = (int) (Math.random() * 6.0D) * 1007532221;
		} else {
			this.anInt2650 = (int) (Math.random() * 12.0D) * 1007532221;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ih", descriptor = "(III)V")
	public void method18630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray224[arg0] = arg1;
		this.anIntArray223[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqc", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "id", descriptor = "()Z")
	boolean method18631() {
		return this.aBoolean402 || this.aClass336_1.aBoolean722;
	}

	@OriginalMember(owner = "client!aqc", name = "ia", descriptor = "(I)I")
	public int method18632(@OriginalArg(0) int arg0) {
		return this.anIntArray223[arg0];
	}

	@OriginalMember(owner = "client!aqc", name = "if", descriptor = "(III)V")
	public void method18633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray224[arg0] = arg1;
		this.anIntArray223[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqc", name = "iv", descriptor = "(Lclient!dh;I)Z")
	boolean method18634(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(-1391856640);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(2016265720) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(37) Class19_Sub3 local37 = this.aClass19_Sub3_3.method23564(-31823611) && (!this.aClass19_Sub3_3.aBoolean380 || local20 == null) ? this.aClass19_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5827 * -1915635865;
		@Pc(47) int local47 = local5.anInt5828 * 512505351;
		if (local42 != 0 || local47 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) boolean local86 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local86) {
			arg1 |= 0x80000;
		}
		@Pc(94) boolean local94 = false;
		if (this.anInt2783 * -653477493 != 0) {
			@Pc(114) Class336 local114 = this.aClass336_1.anIntArray414 == null ? this.aClass336_1 : this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 20692);
			if (local114 == null || client.anInt3485 >= this.anInt2784 * -1767642857 + local114.anInt4224 * 1207466827) {
				this.anInt2783 = 0;
			} else {
				this.anInt2783 = (255 - (client.anInt3485 - -1767642857 * this.anInt2784) * 255 / (local114.anInt4224 * 1207466827)) * -1775753693;
				local94 = true;
			}
		}
		if (local94) {
			arg1 |= 0x100;
		}
		@Pc(163) int local163 = this.aClass523_7.method30544(626575079);
		@Pc(191) Class109 local191 = this.aClass109Array3[0] = this.aClass336_1.method27512(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class624.aClass120_1, Class624.aClass120_1, local20, local37, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local163, this.aClass331_1, this.method19979((short) 560), false, (byte) 10);
		if (local191 == null) {
			return false;
		}
		this.anInt2795 = local191.method6882() * -895607843;
		this.anInt2774 = local191.method6841() * -1359936025;
		local191.method6862();
		this.method19975(local191, -913901693);
		if (local42 == 0 && local47 == 0) {
			this.method19977(local163, this.method20009(-1986752888) << 9, this.method20009(1843649332) << 9, 0, 0, (byte) 6);
		} else {
			this.method19977(local163, local42, local47, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 90);
			if (this.anInt2767 * -1595449153 != 0) {
				this.aClass109Array3[0].method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				this.aClass109Array3[0].method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				this.aClass109Array3[0].method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local86) {
			local191.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (local94) {
			local191.method6881((byte) (this.anInt2783 * -653477493), null);
		}
		this.method19976(arg0, local5, local1, local42, local47, local163, 1127747785);
		return true;
	}

	@OriginalMember(owner = "client!aqc", name = "iy", descriptor = "(III)V")
	public void method18635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray224[arg0] = arg1;
		this.anIntArray223[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqc", name = "ii", descriptor = "(Ljava/lang/String;II)V")
	public void method18636(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class451.method29129((byte) 3) * -568373981 * Class93_Sub26.aClass645_15.anInt5949;
		this.method19980(arg0, arg1, arg2, local7, 1355218393);
	}

	@OriginalMember(owner = "client!aqc", name = "iz", descriptor = "(Ljava/lang/String;II)V")
	public void method18637(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class451.method29129((byte) 3) * -568373981 * Class93_Sub26.aClass645_15.anInt5949;
		this.method19980(arg0, arg1, arg2, local7, 1522830644);
	}

	@OriginalMember(owner = "client!aqc", name = "gs", descriptor = "()Z")
	@Override
	public boolean method24326() {
		return this.aClass336_1.anIntArray414 == null || this.aClass336_1.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 23921) != null;
	}

	@OriginalMember(owner = "client!aqc", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "is", descriptor = "()Z")
	public boolean method18638() {
		return this.aClass336_1 != null;
	}
}
