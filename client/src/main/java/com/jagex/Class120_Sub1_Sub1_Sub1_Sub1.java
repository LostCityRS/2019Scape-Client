package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqb")
public final class Class120_Sub1_Sub1_Sub1_Sub1 extends Class120_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!aqb", name = "cs", descriptor = "I")
	public static int anInt2662 = 1431213341;

	@OriginalMember(owner = "client!aqb", name = "cj", descriptor = "I")
	public static int anInt2665 = -1016810513;

	@OriginalMember(owner = "client!aqb", name = "cg", descriptor = "I")
	int anInt2659;

	@OriginalMember(owner = "client!aqb", name = "cw", descriptor = "I")
	int anInt2661;

	@OriginalMember(owner = "client!aqb", name = "ce", descriptor = "Lclient!iv;")
	public Class350 aClass350_1;

	@OriginalMember(owner = "client!aqb", name = "ca", descriptor = "Lclient!iw;")
	public Class351 aClass351_1;

	@OriginalMember(owner = "client!aqb", name = "cr", descriptor = "I")
	public int anInt2664;

	@OriginalMember(owner = "client!aqb", name = "ci", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!aqb", name = "cf", descriptor = "Z")
	boolean aBoolean446;

	@OriginalMember(owner = "client!aqb", name = "ch", descriptor = "Lclient!ie;")
	public Class335 aClass335_1;

	@OriginalMember(owner = "client!aqb", name = "cx", descriptor = "I")
	public int anInt2666;

	@OriginalMember(owner = "client!aqb", name = "cl", descriptor = "I")
	int anInt2667;

	@OriginalMember(owner = "client!aqb", name = "cb", descriptor = "I")
	int anInt2668;

	@OriginalMember(owner = "client!aqb", name = "cc", descriptor = "I")
	public int anInt2660 = -881366843;

	@OriginalMember(owner = "client!aqb", name = "cu", descriptor = "I")
	public int anInt2669 = 1993828977;

	@OriginalMember(owner = "client!aqb", name = "ck", descriptor = "I")
	public int anInt2663 = 611234997;

	@OriginalMember(owner = "client!aqb", name = "cm", descriptor = "[I")
	int[] anIntArray233 = new int[6];

	@OriginalMember(owner = "client!aqb", name = "cp", descriptor = "[I")
	int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!aqb", name = "<init>", descriptor = "(Lclient!te;I)V")
	public Class120_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class110.aClass2_Sub1_Sub2_2);
		this.method18804(-1907847523);
	}

	@OriginalMember(owner = "client!aqb", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class120_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) Class570 arg0) {
		super(arg0, Class110.aClass2_Sub1_Sub2_2);
		this.method18804(-1907847523);
	}

	@OriginalMember(owner = "client!aqb", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!aqb", name = "ia", descriptor = "(Ljava/lang/String;III)V")
	public void method18788(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Class165_Sub11.method16047((byte) -79) * 165505167 * Class698.aClass638_1.anInt5605;
		this.method18975(arg0, arg1, arg2, local7, (short) 9608);
	}

	@OriginalMember(owner = "client!aqb", name = "it", descriptor = "(IIIZI)V")
	public void method18789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aByte99 = this.aByte100 = (byte) arg0;
		if (client.aClass539_1.method30903(-463929735).method30429(arg1, arg2, 660504127)) {
			this.aByte100++;
		}
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		@Pc(45) int local45;
		for (local45 = 0; local45 < this.aClass561Array3.length; local45++) {
			if (this.aClass561Array3[local45].anInt5188 * -2124314403 != -1) {
				@Pc(71) Class684 local71 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local45].anInt5188 * -2124314403, 1524404947);
				if (local71.aBoolean986 && local71.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local71.anInt5764 * 319211597, -741052283)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local45].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local45].anInt5188 = -1389203317;
				}
			}
		}
		if (!arg3) {
			local45 = arg1 - this.anIntArray234[0];
			@Pc(125) int local125 = arg2 - this.anIntArray242[0];
			if (local45 >= -8 && local45 <= 8 && local125 >= -8 && local125 <= 8) {
				if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
					this.anInt2700 += -1307113885;
				}
				for (@Pc(158) int local158 = this.anInt2700 * 1679797067; local158 > 0; local158--) {
					this.anIntArray234[local158] = this.anIntArray234[local158 - 1];
					this.anIntArray242[local158] = this.anIntArray242[local158 - 1];
					this.aByteArray49[local158] = this.aByteArray49[local158 - 1];
				}
				this.anIntArray234[0] = arg1;
				this.anIntArray242[0] = arg2;
				this.aByteArray49[0] = Class712.aClass712_2.aByte165;
				return;
			}
		}
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg1;
		this.anIntArray242[0] = arg2;
		@Pc(233) Class463 local233 = Class463.method29472(this.method24552().aClass463_61);
		local233.aFloat297 = (this.anIntArray234[0] << 9) + (arg4 << 8);
		local233.aFloat296 = (this.anIntArray242[0] << 9) + (arg4 << 8);
		this.method24542(local233);
		local233.method29557();
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(10) Class335 local10 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 830732843);
			if (local10 != null && -1055801663 * local10.anInt4223 != -1) {
				return local10.anInt4223 * -1055801663;
			}
		}
		return this.aClass335_1.anInt4223 * -1055801663 == -1 ? super.method24601(1114442) : this.aClass335_1.anInt4223 * -1055801663;
	}

	@OriginalMember(owner = "client!aqb", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aqb", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass335_1 == null || !this.method18790(arg0, 526336, 2096954341)) {
			return null;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(19) Class471 local19 = arg0.method20813();
		@Pc(24) int local24 = this.aClass372_8.method28394((byte) 3);
		@Pc(45) Class568 local45 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local16.aClass463_61.aFloat297 >> 9][(int) local16.aClass463_61.aFloat296 >> 9];
		if (local45 == null || local45.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local45.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local19.method29760(local13);
		local19.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(112) Class621 local112 = this.method18952((byte) 24);
		@Pc(127) Class335 local127 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 2118556346);
		@Pc(135) boolean local135 = local127.aClass472_1 != null;
		this.aBoolean454 = false;
		@Pc(140) Class573 local140 = null;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -91) == 1 && local127.aBoolean823 && local112.aBoolean933) {
			@Pc(167) Class6 local167 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 69) ? this.aClass6_3 : null;
			@Pc(183) Class6_Sub3 local183 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local167 == null) ? this.aClass6_Sub3_3 : null;
			@Pc(186) short local186 = Class698.aClass638_1.aShort186;
			@Pc(189) byte local189 = Class698.aClass638_1.aByte163;
			if (this.aClass335_1.aShort167 > -1) {
				local186 = this.aClass335_1.aShort167;
				local189 = this.aClass335_1.aByte134;
			}
			@Pc(240) Class105 local240;
			if (local186 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
				local240 = Class507.method30514(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local186, local189, local183 == null ? local167 : local183, (byte) 1);
			} else {
				local240 = Class315.method27500(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass335_1.anInt4212 * 1573297955, this.aClass105Array3[0], this.aClass335_1.aShort166 & 0xFFFF, this.aClass335_1.aShort168 & 0xFFFF, this.aClass335_1.aByte133 & 0xFF, this.aClass335_1.aByte132 & 0xFF, local183 == null ? local167 : local183, -1378508924);
			}
			if (local240 != null) {
				local140 = Class454.method29307(this.method18817(1125916302), 63072989);
				this.aBoolean454 = true;
				arg0.method20762(false);
				if (local135) {
					local240.method7359(local19, null, 0);
				} else {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local240.method7359(local19, this.aClass246Array21[this.aClass105Array3.length], 0);
				}
				arg0.method20762(true);
			}
		}
		if (local135) {
			if (this.aClass246Array21 == null || this.aClass246Array21.length > 1) {
				this.method24581(1, (byte) 14);
			}
			arg0.method20735(local19, this.aClass246Array21[0], local127.aClass472_1);
		} else if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local140 == null) {
			local140 = Class454.method29307(this.method18817(1128530284), -871004715);
		}
		this.method18989(arg0, this.aClass105Array3, local19, false, (byte) -83);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				if (this.aClass335_1.aBoolean824) {
					this.aClass105Array3[local408].method7380(this.anInt2659 * 1355034727, this.anInt2668 * -254872125, this.anInt2661 * 47554741, this.anInt2667 * 638753259);
				}
				if (local135) {
					this.aClass105Array3[local408].method7359(local19, null, 0);
				} else {
					this.aClass105Array3[local408].method7359(local19, this.aClass246Array21[local408], 0);
				}
			} else if (!local135) {
				this.aClass246Array21[local408].aBoolean773 = false;
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(483) Class221 local483 = this.aClass658_3.method33244();
			arg0.method20964(local483);
		}
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				this.aBoolean454 |= this.aClass105Array3[local408].method7395();
			}
			this.aClass105Array3[local408] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local140;
	}

	@OriginalMember(owner = "client!aqb", name = "hd", descriptor = "(Lclient!di;II)Z")
	boolean method18790(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class621 local5 = this.method18952((byte) -6);
		@Pc(20) Class6 local20 = this.aClass6_3.method23590(-499060808) && !this.aClass6_3.method23589((byte) 59) ? this.aClass6_3 : null;
		@Pc(37) Class6_Sub3 local37 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local20 == null) ? this.aClass6_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5464 * -1053924669;
		@Pc(47) int local47 = local5.anInt5459 * -635285373;
		if (local42 != 0 || local47 != 0 || local5.anInt5467 * 73788751 != 0 || local5.anInt5466 * -1192955301 != 0) {
			arg1 |= 0x7;
		}
		@Pc(85) boolean local85 = this.aByte73 != 0 && client.currentCycle >= this.anInt2698 * 1134746577 && client.currentCycle < this.anInt2692 * -691507419;
		if (local85) {
			arg1 |= 0x80000;
		}
		@Pc(93) boolean local93 = false;
		if (this.anInt2685 * -411125797 != 0) {
			@Pc(113) Class335 local113 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 1210767081);
			if (local113 == null || client.currentCycle >= local113.anInt4229 * 690436873 + this.anInt2690 * 712425003) {
				this.anInt2685 = 0;
			} else {
				this.anInt2685 = (255 - (client.currentCycle - this.anInt2690 * 712425003) * 255 / (local113.anInt4229 * 690436873)) * 1227779155;
				local93 = true;
			}
		}
		if (local93) {
			arg1 |= 0x100;
		}
		@Pc(162) int local162 = this.aClass372_8.method28394((byte) 3);
		@Pc(190) Class105 local190 = this.aClass105Array3[0] = this.aClass335_1.method27829(arg0, arg1, Class533.aClass41_Sub18_1, Class672.aClass134_1, Class672.aClass134_1, local20, local37, this.aClass6_Sub1_Sub1Array3, this.anIntArray235, local162, this.aClass350_1, this.method18970(-559803139), false, (byte) 0);
		if (local190 == null) {
			return false;
		}
		this.anInt2674 = local190.method7366() * -527958611;
		this.anInt2699 = local190.method7390() * -807746119;
		local190.method7501();
		this.method18983(local190, (byte) -19);
		if (local42 == 0 && local47 == 0) {
			this.method18969(local162, this.method18966((byte) -66) << 9, this.method18966((byte) -11) << 9, 0, 0, 392245238);
		} else {
			this.method18969(local162, local42, local47, local5.anInt5460 * 979112709, local5.anInt5461 * 381253511, -1361049208);
			if (this.anInt2680 * -2015931105 != 0) {
				this.aClass105Array3[0].method7330(this.anInt2680 * -2015931105);
			}
			if (this.anInt2679 * -245869181 != 0) {
				this.aClass105Array3[0].method7318(this.anInt2679 * -245869181);
			}
			if (this.anInt2706 * -1001713671 != 0) {
				this.aClass105Array3[0].method7332(0, this.anInt2706 * -1001713671, 0);
			}
		}
		if (local85) {
			local190.method7380(this.aByte70, this.aByte71, this.aByte72, this.aByte73 & 0xFF);
		}
		if (local93) {
			local190.method7348((byte) (this.anInt2685 * -411125797), null);
		}
		this.method19018(arg0, local5, local1, local42, local47, local162, (byte) -41);
		return true;
	}

	@OriginalMember(owner = "client!aqb", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass335_1 == null || !this.aBoolean455 && !this.method18790(arg0, 0, 1608002776)) {
			return;
		}
		@Pc(17) Class471 local17 = arg0.method20813();
		local17.method29760(this.method24526());
		local17.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local17, this.aBoolean455, (byte) -15);
		for (@Pc(37) int local37 = 0; local37 < this.aClass105Array3.length; local37++) {
			this.aClass105Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "hm", descriptor = "(Lclient!zs;II)V")
	public void method18791(@OriginalArg(0) Class716 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anIntArray234[0];
		@Pc(9) int local9 = this.anIntArray242[0];
		switch(arg0.anInt5825 * 1821260539) {
			case 0:
				local4--;
				break;
			case 1:
				local4++;
				break;
			case 2:
				local4--;
				local9++;
				break;
			case 3:
				local4++;
				local9--;
				break;
			case 4:
				local9++;
				break;
			case 5:
				local9--;
				break;
			case 6:
				local4--;
				local9--;
				break;
			case 7:
				local4++;
				local9++;
		}
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		@Pc(57) int local57;
		for (local57 = 0; local57 < this.aClass561Array3.length; local57++) {
			if (this.aClass561Array3[local57].anInt5188 * -2124314403 != -1) {
				@Pc(83) Class684 local83 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local57].anInt5188 * -2124314403, 1526751533);
				if (local83.aBoolean986 && local83.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local83.anInt5764 * 319211597, 1122666014)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local57].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local57].anInt5188 = -1389203317;
				}
			}
		}
		if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
			this.anInt2700 += -1307113885;
		}
		for (local57 = this.anInt2700 * 1679797067; local57 > 0; local57--) {
			this.anIntArray234[local57] = this.anIntArray234[local57 - 1];
			this.anIntArray242[local57] = this.anIntArray242[local57 - 1];
			this.aByteArray49[local57] = this.aByteArray49[local57 - 1];
		}
		this.anIntArray234[0] = local4;
		this.anIntArray242[0] = local9;
		this.aByteArray49[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!aqb", name = "hl", descriptor = "(IIIZII)V")
	public void method18792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte99 = this.aByte100 = (byte) arg0;
		if (client.aClass539_1.method30903(-463929735).method30429(arg1, arg2, 714510191)) {
			this.aByte100++;
		}
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		@Pc(45) int local45;
		for (local45 = 0; local45 < this.aClass561Array3.length; local45++) {
			if (this.aClass561Array3[local45].anInt5188 * -2124314403 != -1) {
				@Pc(71) Class684 local71 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local45].anInt5188 * -2124314403, -1935144626);
				if (local71.aBoolean986 && local71.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local71.anInt5764 * 319211597, -1739800143)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local45].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local45].anInt5188 = -1389203317;
				}
			}
		}
		if (!arg3) {
			local45 = arg1 - this.anIntArray234[0];
			@Pc(125) int local125 = arg2 - this.anIntArray242[0];
			if (local45 >= -8 && local45 <= 8 && local125 >= -8 && local125 <= 8) {
				if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
					this.anInt2700 += -1307113885;
				}
				for (@Pc(158) int local158 = this.anInt2700 * 1679797067; local158 > 0; local158--) {
					this.anIntArray234[local158] = this.anIntArray234[local158 - 1];
					this.anIntArray242[local158] = this.anIntArray242[local158 - 1];
					this.aByteArray49[local158] = this.aByteArray49[local158 - 1];
				}
				this.anIntArray234[0] = arg1;
				this.anIntArray242[0] = arg2;
				this.aByteArray49[0] = Class712.aClass712_2.aByte165;
				return;
			}
		}
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg1;
		this.anIntArray242[0] = arg2;
		@Pc(233) Class463 local233 = Class463.method29472(this.method24552().aClass463_61);
		local233.aFloat297 = (this.anIntArray234[0] << 9) + (arg4 << 8);
		local233.aFloat296 = (this.anIntArray242[0] << 9) + (arg4 << 8);
		this.method24542(local233);
		local233.method29557();
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "hc", descriptor = "(I)V")
	public void method18793(@OriginalArg(0) int arg0) {
		this.anInt2685 = -448928083;
		this.anInt2690 = client.currentCycle * -653389693;
	}

	@OriginalMember(owner = "client!aqb", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "hu", descriptor = "(Lclient!ie;I)V")
	public void method18794(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1) {
		this.method18813(arg0, true, true, true, -938788952);
	}

	@OriginalMember(owner = "client!aqb", name = "ij", descriptor = "(III)V")
	public void method18795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray233[arg0] = arg1;
		this.anIntArray232[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqb", name = "jl", descriptor = "(Ljava/lang/String;II)V")
	public void method18796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class165_Sub11.method16047((byte) -78) * 165505167 * Class698.aClass638_1.anInt5605;
		this.method18975(arg0, arg1, arg2, local7, (short) 1164);
	}

	@OriginalMember(owner = "client!aqb", name = "ga", descriptor = "(I)I")
	@Override
	int method24613(@OriginalArg(0) int arg0) {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass335_1 == null) {
			return false;
		} else if (this.aClass335_1.aClass472_1 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), this.aClass335_1.aClass472_1, 92868112);
		} else if (this.method18790(arg0, 131072, 2085827941)) {
			@Pc(31) Class471 local31 = this.method24526();
			@Pc(33) boolean local33 = false;
			@Pc(35) int local35;
			for (local35 = 0; local35 < this.aClass105Array3.length; local35++) {
				if (this.aClass105Array3[local35] != null && this.aClass105Array3[local35].aBoolean173) {
					@Pc(81) boolean var10000;
					label68: {
						if (this.aClass335_1.anInt4200 * 449343977 <= 0) {
							label67: {
								if (this.aClass335_1.anInt4225 * 1357122929 == -1) {
									if (this.aClass335_1.anInt4212 * 1573297955 == 1) {
										break label67;
									}
								} else if (this.aClass335_1.anInt4225 * 1357122929 == 1) {
									break label67;
								}
								var10000 = false;
								break label68;
							}
						}
						var10000 = true;
					}
					@Pc(84) boolean local84 = var10000;
					@Pc(99) boolean local99 = this.aClass105Array3[local35].method7360(arg1, arg2, local31, local84, this.aClass335_1.anInt4200 * 449343977);
					if (local99) {
						local33 = true;
						break;
					}
				}
			}
			for (local35 = 0; local35 < this.aClass105Array3.length; local35++) {
				this.aClass105Array3[local35] = null;
			}
			return local33;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aqb", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "gq", descriptor = "()I")
	@Override
	int method24564() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "hs", descriptor = "(II)I")
	public int method18797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray233[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "hi", descriptor = "(II)I")
	public int method18798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray232[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "hz", descriptor = "(IIIB)V")
	public void method18799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		this.anIntArray233[arg0] = arg1;
		this.anIntArray232[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqb", name = "cd", descriptor = "(B)Z")
	@Override
	public boolean method18973(@OriginalArg(0) byte arg0) {
		return Class698.aClass638_1.aBoolean961;
	}

	@OriginalMember(owner = "client!aqb", name = "iz", descriptor = "(III)V")
	public void method18800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray233[arg0] = arg1;
		this.anIntArray232[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqb", name = "jj", descriptor = "(Ljava/lang/String;II)V")
	public void method18801(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class165_Sub11.method16047((byte) -108) * 165505167 * Class698.aClass638_1.anInt5605;
		this.method18975(arg0, arg1, arg2, local7, (short) 15187);
	}

	@OriginalMember(owner = "client!aqb", name = "ce", descriptor = "(B)I")
	@Override
	public int method18987(@OriginalArg(0) byte arg0) {
		return this.anInt2671 * 1078276675 + 1;
	}

	@OriginalMember(owner = "client!aqb", name = "iq", descriptor = "(IIIZI)V")
	public void method18802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aByte99 = this.aByte100 = (byte) arg0;
		if (client.aClass539_1.method30903(-463929735).method30429(arg1, arg2, 910955689)) {
			this.aByte100++;
		}
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		@Pc(45) int local45;
		for (local45 = 0; local45 < this.aClass561Array3.length; local45++) {
			if (this.aClass561Array3[local45].anInt5188 * -2124314403 != -1) {
				@Pc(71) Class684 local71 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local45].anInt5188 * -2124314403, 305341034);
				if (local71.aBoolean986 && local71.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local71.anInt5764 * 319211597, 8093525)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local45].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local45].anInt5188 = -1389203317;
				}
			}
		}
		if (!arg3) {
			local45 = arg1 - this.anIntArray234[0];
			@Pc(125) int local125 = arg2 - this.anIntArray242[0];
			if (local45 >= -8 && local45 <= 8 && local125 >= -8 && local125 <= 8) {
				if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
					this.anInt2700 += -1307113885;
				}
				for (@Pc(158) int local158 = this.anInt2700 * 1679797067; local158 > 0; local158--) {
					this.anIntArray234[local158] = this.anIntArray234[local158 - 1];
					this.anIntArray242[local158] = this.anIntArray242[local158 - 1];
					this.aByteArray49[local158] = this.aByteArray49[local158 - 1];
				}
				this.anIntArray234[0] = arg1;
				this.anIntArray242[0] = arg2;
				this.aByteArray49[0] = Class712.aClass712_2.aByte165;
				return;
			}
		}
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg1;
		this.anIntArray242[0] = arg2;
		@Pc(233) Class463 local233 = Class463.method29472(this.method24552().aClass463_61);
		local233.aFloat297 = (this.anIntArray234[0] << 9) + (arg4 << 8);
		local233.aFloat296 = (this.anIntArray242[0] << 9) + (arg4 << 8);
		this.method24542(local233);
		local233.method29557();
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "f", descriptor = "(I)I")
	@Override
	public int method18940(@OriginalArg(0) int arg0) {
		return this.anInt2671 * 1078276675;
	}

	@OriginalMember(owner = "client!aqb", name = "e", descriptor = "(B)Lclient!akx;")
	@Override
	public Class80_Sub33 method18941(@OriginalArg(0) byte arg0) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -68);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, 921470693);
	}

	@OriginalMember(owner = "client!aqb", name = "u", descriptor = "(I)Lclient!oq;")
	@Override
	public Class466 method18942(@OriginalArg(0) int arg0) {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(Class467.method29716(this.aClass372_8.anInt4506 * 1783746791), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqb", name = "l", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method18943(@OriginalArg(0) int arg0) {
		return Class463.method29470();
	}

	@OriginalMember(owner = "client!aqb", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "g", descriptor = "()Lclient!jk;")
	@Override
	public Class362 method18944() {
		return Class362.aClass362_2;
	}

	@OriginalMember(owner = "client!aqb", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "m", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18946() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -83);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, -1409275464);
	}

	@OriginalMember(owner = "client!aqb", name = "o", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18949() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -92);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, -1701640406);
	}

	@OriginalMember(owner = "client!aqb", name = "j", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18948() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -71);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, 667297574);
	}

	@OriginalMember(owner = "client!aqb", name = "a", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18951() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -31);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, 1442425043);
	}

	@OriginalMember(owner = "client!aqb", name = "s", descriptor = "()Lclient!oq;")
	@Override
	public Class466 method18950() {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(Class467.method29716(this.aClass372_8.anInt4506 * 1783746791), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqb", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqb", name = "el", descriptor = "()Z")
	@Override
	public boolean method19030() {
		return Class698.aClass638_1.aBoolean961;
	}

	@OriginalMember(owner = "client!aqb", name = "gm", descriptor = "()I")
	@Override
	int method24612() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.method18790(arg0, 526336, 2008028239)) {
			return null;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(19) Class471 local19 = arg0.method20813();
		@Pc(24) int local24 = this.aClass372_8.method28394((byte) 3);
		@Pc(45) Class568 local45 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local16.aClass463_61.aFloat297 >> 9][(int) local16.aClass463_61.aFloat296 >> 9];
		if (local45 == null || local45.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local45.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local19.method29760(local13);
		local19.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(112) Class621 local112 = this.method18952((byte) 5);
		@Pc(127) Class335 local127 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -2005613881);
		@Pc(135) boolean local135 = local127.aClass472_1 != null;
		this.aBoolean454 = false;
		@Pc(140) Class573 local140 = null;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -91) == 1 && local127.aBoolean823 && local112.aBoolean933) {
			@Pc(167) Class6 local167 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 81) ? this.aClass6_3 : null;
			@Pc(183) Class6_Sub3 local183 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local167 == null) ? this.aClass6_Sub3_3 : null;
			@Pc(186) short local186 = Class698.aClass638_1.aShort186;
			@Pc(189) byte local189 = Class698.aClass638_1.aByte163;
			if (this.aClass335_1.aShort167 > -1) {
				local186 = this.aClass335_1.aShort167;
				local189 = this.aClass335_1.aByte134;
			}
			@Pc(240) Class105 local240;
			if (local186 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
				local240 = Class507.method30514(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local186, local189, local183 == null ? local167 : local183, (byte) 1);
			} else {
				local240 = Class315.method27500(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass335_1.anInt4212 * 1573297955, this.aClass105Array3[0], this.aClass335_1.aShort166 & 0xFFFF, this.aClass335_1.aShort168 & 0xFFFF, this.aClass335_1.aByte133 & 0xFF, this.aClass335_1.aByte132 & 0xFF, local183 == null ? local167 : local183, -2011212624);
			}
			if (local240 != null) {
				local140 = Class454.method29307(this.method18817(2059213563), 1629991320);
				this.aBoolean454 = true;
				arg0.method20762(false);
				if (local135) {
					local240.method7359(local19, null, 0);
				} else {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local240.method7359(local19, this.aClass246Array21[this.aClass105Array3.length], 0);
				}
				arg0.method20762(true);
			}
		}
		if (local135) {
			if (this.aClass246Array21 == null || this.aClass246Array21.length > 1) {
				this.method24581(1, (byte) 14);
			}
			arg0.method20735(local19, this.aClass246Array21[0], local127.aClass472_1);
		} else if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local140 == null) {
			local140 = Class454.method29307(this.method18817(964049983), 801910787);
		}
		this.method18989(arg0, this.aClass105Array3, local19, false, (byte) -84);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				if (this.aClass335_1.aBoolean824) {
					this.aClass105Array3[local408].method7380(this.anInt2659 * 1355034727, this.anInt2668 * -254872125, this.anInt2661 * 47554741, this.anInt2667 * 638753259);
				}
				if (local135) {
					this.aClass105Array3[local408].method7359(local19, null, 0);
				} else {
					this.aClass105Array3[local408].method7359(local19, this.aClass246Array21[local408], 0);
				}
			} else if (!local135) {
				this.aClass246Array21[local408].aBoolean773 = false;
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(483) Class221 local483 = this.aClass658_3.method33244();
			arg0.method20964(local483);
		}
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				this.aBoolean454 |= this.aClass105Array3[local408].method7395();
			}
			this.aClass105Array3[local408] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local140;
	}

	@OriginalMember(owner = "client!aqb", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.method18790(arg0, 526336, 1914660384)) {
			return null;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(19) Class471 local19 = arg0.method20813();
		@Pc(24) int local24 = this.aClass372_8.method28394((byte) 3);
		@Pc(45) Class568 local45 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local16.aClass463_61.aFloat297 >> 9][(int) local16.aClass463_61.aFloat296 >> 9];
		if (local45 == null || local45.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local45.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local19.method29760(local13);
		local19.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(112) Class621 local112 = this.method18952((byte) -56);
		@Pc(127) Class335 local127 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -2065946975);
		@Pc(135) boolean local135 = local127.aClass472_1 != null;
		this.aBoolean454 = false;
		@Pc(140) Class573 local140 = null;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -66) == 1 && local127.aBoolean823 && local112.aBoolean933) {
			@Pc(167) Class6 local167 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 61) ? this.aClass6_3 : null;
			@Pc(183) Class6_Sub3 local183 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local167 == null) ? this.aClass6_Sub3_3 : null;
			@Pc(186) short local186 = Class698.aClass638_1.aShort186;
			@Pc(189) byte local189 = Class698.aClass638_1.aByte163;
			if (this.aClass335_1.aShort167 > -1) {
				local186 = this.aClass335_1.aShort167;
				local189 = this.aClass335_1.aByte134;
			}
			@Pc(240) Class105 local240;
			if (local186 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
				local240 = Class507.method30514(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local186, local189, local183 == null ? local167 : local183, (byte) 1);
			} else {
				local240 = Class315.method27500(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass335_1.anInt4212 * 1573297955, this.aClass105Array3[0], this.aClass335_1.aShort166 & 0xFFFF, this.aClass335_1.aShort168 & 0xFFFF, this.aClass335_1.aByte133 & 0xFF, this.aClass335_1.aByte132 & 0xFF, local183 == null ? local167 : local183, 1122671351);
			}
			if (local240 != null) {
				local140 = Class454.method29307(this.method18817(1233866088), 306810249);
				this.aBoolean454 = true;
				arg0.method20762(false);
				if (local135) {
					local240.method7359(local19, null, 0);
				} else {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local240.method7359(local19, this.aClass246Array21[this.aClass105Array3.length], 0);
				}
				arg0.method20762(true);
			}
		}
		if (local135) {
			if (this.aClass246Array21 == null || this.aClass246Array21.length > 1) {
				this.method24581(1, (byte) 14);
			}
			arg0.method20735(local19, this.aClass246Array21[0], local127.aClass472_1);
		} else if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local140 == null) {
			local140 = Class454.method29307(this.method18817(971442717), 791643931);
		}
		this.method18989(arg0, this.aClass105Array3, local19, false, (byte) -99);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				if (this.aClass335_1.aBoolean824) {
					this.aClass105Array3[local408].method7380(this.anInt2659 * 1355034727, this.anInt2668 * -254872125, this.anInt2661 * 47554741, this.anInt2667 * 638753259);
				}
				if (local135) {
					this.aClass105Array3[local408].method7359(local19, null, 0);
				} else {
					this.aClass105Array3[local408].method7359(local19, this.aClass246Array21[local408], 0);
				}
			} else if (!local135) {
				this.aClass246Array21[local408].aBoolean773 = false;
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(483) Class221 local483 = this.aClass658_3.method33244();
			arg0.method20964(local483);
		}
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				this.aBoolean454 |= this.aClass105Array3[local408].method7395();
			}
			this.aClass105Array3[local408] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local140;
	}

	@OriginalMember(owner = "client!aqb", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.method18790(arg0, 526336, 1658614926)) {
			return null;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(19) Class471 local19 = arg0.method20813();
		@Pc(24) int local24 = this.aClass372_8.method28394((byte) 3);
		@Pc(45) Class568 local45 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local16.aClass463_61.aFloat297 >> 9][(int) local16.aClass463_61.aFloat296 >> 9];
		if (local45 == null || local45.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local45.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local19.method29760(local13);
		local19.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(112) Class621 local112 = this.method18952((byte) -40);
		@Pc(127) Class335 local127 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -2096680372);
		@Pc(135) boolean local135 = local127.aClass472_1 != null;
		this.aBoolean454 = false;
		@Pc(140) Class573 local140 = null;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -118) == 1 && local127.aBoolean823 && local112.aBoolean933) {
			@Pc(167) Class6 local167 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 20) ? this.aClass6_3 : null;
			@Pc(183) Class6_Sub3 local183 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local167 == null) ? this.aClass6_Sub3_3 : null;
			@Pc(186) short local186 = Class698.aClass638_1.aShort186;
			@Pc(189) byte local189 = Class698.aClass638_1.aByte163;
			if (this.aClass335_1.aShort167 > -1) {
				local186 = this.aClass335_1.aShort167;
				local189 = this.aClass335_1.aByte134;
			}
			@Pc(240) Class105 local240;
			if (local186 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
				local240 = Class507.method30514(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local186, local189, local183 == null ? local167 : local183, (byte) 1);
			} else {
				local240 = Class315.method27500(arg0, local24, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass335_1.anInt4212 * 1573297955, this.aClass105Array3[0], this.aClass335_1.aShort166 & 0xFFFF, this.aClass335_1.aShort168 & 0xFFFF, this.aClass335_1.aByte133 & 0xFF, this.aClass335_1.aByte132 & 0xFF, local183 == null ? local167 : local183, -1217066532);
			}
			if (local240 != null) {
				local140 = Class454.method29307(this.method18817(1046162269), 1996346275);
				this.aBoolean454 = true;
				arg0.method20762(false);
				if (local135) {
					local240.method7359(local19, null, 0);
				} else {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local240.method7359(local19, this.aClass246Array21[this.aClass105Array3.length], 0);
				}
				arg0.method20762(true);
			}
		}
		if (local135) {
			if (this.aClass246Array21 == null || this.aClass246Array21.length > 1) {
				this.method24581(1, (byte) 14);
			}
			arg0.method20735(local19, this.aClass246Array21[0], local127.aClass472_1);
		} else if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local140 == null) {
			local140 = Class454.method29307(this.method18817(824410966), -1881446751);
		}
		this.method18989(arg0, this.aClass105Array3, local19, false, (byte) -41);
		@Pc(408) int local408;
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				if (this.aClass335_1.aBoolean824) {
					this.aClass105Array3[local408].method7380(this.anInt2659 * 1355034727, this.anInt2668 * -254872125, this.anInt2661 * 47554741, this.anInt2667 * 638753259);
				}
				if (local135) {
					this.aClass105Array3[local408].method7359(local19, null, 0);
				} else {
					this.aClass105Array3[local408].method7359(local19, this.aClass246Array21[local408], 0);
				}
			} else if (!local135) {
				this.aClass246Array21[local408].aBoolean773 = false;
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(483) Class221 local483 = this.aClass658_3.method33244();
			arg0.method20964(local483);
		}
		for (local408 = 0; local408 < this.aClass105Array3.length; local408++) {
			if (this.aClass105Array3[local408] != null) {
				this.aBoolean454 |= this.aClass105Array3[local408].method7395();
			}
			this.aClass105Array3[local408] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local140;
	}

	@OriginalMember(owner = "client!aqb", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass335_1 == null) {
			return false;
		} else if (this.aClass335_1.aClass472_1 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), this.aClass335_1.aClass472_1, 92868112);
		} else if (this.method18790(arg0, 131072, 1835571675)) {
			@Pc(31) Class471 local31 = this.method24526();
			@Pc(33) boolean local33 = false;
			@Pc(35) int local35;
			for (local35 = 0; local35 < this.aClass105Array3.length; local35++) {
				if (this.aClass105Array3[local35] != null && this.aClass105Array3[local35].aBoolean173) {
					@Pc(81) boolean var10000;
					label68: {
						if (this.aClass335_1.anInt4200 * 449343977 <= 0) {
							label67: {
								if (this.aClass335_1.anInt4225 * 1357122929 == -1) {
									if (this.aClass335_1.anInt4212 * 1573297955 == 1) {
										break label67;
									}
								} else if (this.aClass335_1.anInt4225 * 1357122929 == 1) {
									break label67;
								}
								var10000 = false;
								break label68;
							}
						}
						var10000 = true;
					}
					@Pc(84) boolean local84 = var10000;
					@Pc(99) boolean local99 = this.aClass105Array3[local35].method7360(arg1, arg2, local31, local84, this.aClass335_1.anInt4200 * 449343977);
					if (local99) {
						local33 = true;
						break;
					}
				}
			}
			for (local35 = 0; local35 < this.aClass105Array3.length; local35++) {
				this.aClass105Array3[local35] = null;
			}
			return local33;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "gf", descriptor = "(I)Z")
	@Override
	public boolean method24604(@OriginalArg(0) int arg0) {
		return this.aClass335_1.anIntArray416 == null || this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -1222295919) != null;
	}

	@OriginalMember(owner = "client!aqb", name = "ix", descriptor = "(Lclient!ie;ZZZ)V")
	public void method18803(@OriginalArg(0) Class335 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (this.aClass335_1 != arg0 && Class630.aBoolean955 && Class249.method26353(this.anInt2671 * 1078276675, 1120644413)) {
			Class392.method28680(1305557302);
		}
		this.aClass335_1 = arg0;
		if (this.aClass335_1 != null) {
			if (arg1) {
				this.aString72 = this.aClass335_1.aString188;
			}
			if (arg2) {
				this.anInt2664 = this.aClass335_1.anInt4202 * -1042032667;
			}
			if (arg3) {
				this.aClass351_1 = null;
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "ho", descriptor = "(I)V")
	void method18804(@OriginalArg(0) int arg0) {
		this.anInt2659 = ((int) (Math.random() * 4.0D) + 32) * -254547113;
		this.anInt2668 = ((int) (Math.random() * 2.0D) + 3) * 1351983851;
		this.anInt2661 = ((int) (Math.random() * 3.0D) + 16) * -254915171;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt2667 = (int) (Math.random() * 6.0D) * -484718909;
		} else {
			this.anInt2667 = (int) (Math.random() * 12.0D) * -484718909;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "t", descriptor = "(I)Lclient!jk;")
	@Override
	public Class362 method18947(@OriginalArg(0) int arg0) {
		return Class362.aClass362_2;
	}

	@OriginalMember(owner = "client!aqb", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(10) Class335 local10 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -2107048682);
			if (local10 != null && -1055801663 * local10.anInt4223 != -1) {
				return local10.anInt4223 * -1055801663;
			}
		}
		return this.aClass335_1.anInt4223 * -1055801663 == -1 ? super.method24601(-129053142) : this.aClass335_1.anInt4223 * -1055801663;
	}

	@OriginalMember(owner = "client!aqb", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "gt", descriptor = "()I")
	@Override
	int method24609() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "ee", descriptor = "()I")
	@Override
	int method19046() {
		if (-2039454109 * this.anInt2663 != -1) {
			return this.anInt2663 * -2039454109;
		}
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(21) Class335 local21 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -1098671245);
			if (local21 != null && local21.anInt4203 * -1645868939 != -1) {
				return local21.anInt4203 * -1645868939;
			}
		}
		return this.aClass335_1.anInt4203 * -1645868939;
	}

	@OriginalMember(owner = "client!aqb", name = "ef", descriptor = "()I")
	@Override
	int method19025() {
		if (-2039454109 * this.anInt2663 != -1) {
			return this.anInt2663 * -2039454109;
		}
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(21) Class335 local21 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 475351352);
			if (local21 != null && local21.anInt4203 * -1645868939 != -1) {
				return local21.anInt4203 * -1645868939;
			}
		}
		return this.aClass335_1.anInt4203 * -1645868939;
	}

	@OriginalMember(owner = "client!aqb", name = "ek", descriptor = "()I")
	@Override
	public int method19034() {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(11) Class335 local11 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -1664279013);
			if (local11 != null && local11.anInt4208 * -2068549421 != -1) {
				return local11.anInt4208 * -2068549421;
			}
		}
		return this.aClass335_1.anInt4208 * -2068549421;
	}

	@OriginalMember(owner = "client!aqb", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(10) Class335 local10 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 612864334);
			if (local10 != null && -1055801663 * local10.anInt4223 != -1) {
				return local10.anInt4223 * -1055801663;
			}
		}
		return this.aClass335_1.anInt4223 * -1055801663 == -1 ? super.method24601(-1227816018) : this.aClass335_1.anInt4223 * -1055801663;
	}

	@OriginalMember(owner = "client!aqb", name = "hg", descriptor = "(B)Z")
	public boolean method18805(@OriginalArg(0) byte arg0) {
		return this.aClass335_1 != null;
	}

	@OriginalMember(owner = "client!aqb", name = "id", descriptor = "(Lclient!ie;)V")
	public void method18806(@OriginalArg(0) Class335 arg0) {
		this.method18813(arg0, true, true, true, 501352769);
	}

	@OriginalMember(owner = "client!aqb", name = "em", descriptor = "()Lclient!sq;")
	@Override
	public Class558 method19040() {
		return this.aClass558_3 != null && this.aClass558_3.aString223 == null ? null : this.aClass558_3;
	}

	@OriginalMember(owner = "client!aqb", name = "fp", descriptor = "()I")
	@Override
	public int method18953() {
		return this.anInt2671 * 1078276675 + 1;
	}

	@OriginalMember(owner = "client!aqb", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.aBoolean455 && !this.method18790(arg0, 0, 1757266934)) {
			return;
		}
		@Pc(17) Class471 local17 = arg0.method20813();
		local17.method29760(this.method24526());
		local17.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local17, this.aBoolean455, (byte) -28);
		for (@Pc(37) int local37 = 0; local37 < this.aClass105Array3.length; local37++) {
			this.aClass105Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.aBoolean455 && !this.method18790(arg0, 0, 1832770749)) {
			return;
		}
		@Pc(17) Class471 local17 = arg0.method20813();
		local17.method29760(this.method24526());
		local17.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local17, this.aBoolean455, (byte) -121);
		for (@Pc(37) int local37 = 0; local37 < this.aClass105Array3.length; local37++) {
			this.aClass105Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.aBoolean455 && !this.method18790(arg0, 0, 1608449167)) {
			return;
		}
		@Pc(17) Class471 local17 = arg0.method20813();
		local17.method29760(this.method24526());
		local17.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local17, this.aBoolean455, (byte) -75);
		for (@Pc(37) int local37 = 0; local37 < this.aClass105Array3.length; local37++) {
			this.aClass105Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		if (this.aClass335_1 == null || !this.aBoolean455 && !this.method18790(arg0, 0, 1949773940)) {
			return;
		}
		@Pc(17) Class471 local17 = arg0.method20813();
		local17.method29760(this.method24526());
		local17.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local17, this.aBoolean455, (byte) -9);
		for (@Pc(37) int local37 = 0; local37 < this.aClass105Array3.length; local37++) {
			this.aClass105Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "iy", descriptor = "()Z")
	public boolean method18807() {
		return this.aClass335_1 != null;
	}

	@OriginalMember(owner = "client!aqb", name = "gy", descriptor = "()I")
	@Override
	int method24626() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "gl", descriptor = "()I")
	@Override
	int method24611() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "cv", descriptor = "(I)Lclient!sq;")
	@Override
	public Class558 method18974(@OriginalArg(0) int arg0) {
		return this.aClass558_3 != null && this.aClass558_3.aString223 == null ? null : this.aClass558_3;
	}

	@OriginalMember(owner = "client!aqb", name = "i", descriptor = "()I")
	@Override
	public int method18945() {
		return this.anInt2671 * 1078276675;
	}

	@OriginalMember(owner = "client!aqb", name = "gx", descriptor = "()I")
	@Override
	int method24614() {
		return this.aClass335_1 == null ? 0 : this.aClass335_1.anInt4200 * 449343977;
	}

	@OriginalMember(owner = "client!aqb", name = "il", descriptor = "()V")
	public void method18808() {
		this.anInt2685 = -448928083;
		this.anInt2690 = client.currentCycle * -653389693;
	}

	@OriginalMember(owner = "client!aqb", name = "in", descriptor = "()V")
	public void method18809() {
		this.anInt2685 = -448928083;
		this.anInt2690 = client.currentCycle * -653389693;
	}

	@OriginalMember(owner = "client!aqb", name = "if", descriptor = "()V")
	public void method18810() {
		this.anInt2685 = -448928083;
		this.anInt2690 = client.currentCycle * -653389693;
	}

	@OriginalMember(owner = "client!aqb", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqb", name = "ig", descriptor = "()V")
	void method18811() {
		this.anInt2659 = ((int) (Math.random() * 4.0D) + 32) * -254547113;
		this.anInt2668 = ((int) (Math.random() * 2.0D) + 3) * 1351983851;
		this.anInt2661 = ((int) (Math.random() * 3.0D) + 16) * -254915171;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt2667 = (int) (Math.random() * 6.0D) * -484718909;
		} else {
			this.anInt2667 = (int) (Math.random() * 12.0D) * -484718909;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method18939() {
		return Class463.method29470();
	}

	@OriginalMember(owner = "client!aqb", name = "io", descriptor = "()V")
	void method18812() {
		this.anInt2659 = ((int) (Math.random() * 4.0D) + 32) * -254547113;
		this.anInt2668 = ((int) (Math.random() * 2.0D) + 3) * 1351983851;
		this.anInt2661 = ((int) (Math.random() * 3.0D) + 16) * -254915171;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt2667 = (int) (Math.random() * 6.0D) * -484718909;
		} else {
			this.anInt2667 = (int) (Math.random() * 12.0D) * -484718909;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "hh", descriptor = "(Lclient!ie;ZZZI)V")
	public void method18813(@OriginalArg(0) Class335 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (this.aClass335_1 != arg0 && Class630.aBoolean955 && Class249.method26353(this.anInt2671 * 1078276675, 874846211)) {
			Class392.method28680(1305557302);
		}
		this.aClass335_1 = arg0;
		if (this.aClass335_1 != null) {
			if (arg1) {
				this.aString72 = this.aClass335_1.aString188;
			}
			if (arg2) {
				this.anInt2664 = this.aClass335_1.anInt4202 * -1042032667;
			}
			if (arg3) {
				this.aClass351_1 = null;
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "ip", descriptor = "(Lclient!ie;ZZZ)V")
	public void method18814(@OriginalArg(0) Class335 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (this.aClass335_1 != arg0 && Class630.aBoolean955 && Class249.method26353(this.anInt2671 * 1078276675, 1107798267)) {
			Class392.method28680(1305557302);
		}
		this.aClass335_1 = arg0;
		if (this.aClass335_1 != null) {
			if (arg1) {
				this.aString72 = this.aClass335_1.aString188;
			}
			if (arg2) {
				this.anInt2664 = this.aClass335_1.anInt4202 * -1042032667;
			}
			if (arg3) {
				this.aClass351_1 = null;
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "ir", descriptor = "(Lclient!ie;ZZZ)V")
	public void method18815(@OriginalArg(0) Class335 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (this.aClass335_1 != arg0 && Class630.aBoolean955 && Class249.method26353(this.anInt2671 * 1078276675, 500538463)) {
			Class392.method28680(1305557302);
		}
		this.aClass335_1 = arg0;
		if (this.aClass335_1 != null) {
			if (arg1) {
				this.aString72 = this.aClass335_1.aString188;
			}
			if (arg2) {
				this.anInt2664 = this.aClass335_1.anInt4202 * -1042032667;
			}
			if (arg3) {
				this.aClass351_1 = null;
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "iu", descriptor = "(Lclient!di;I)Z")
	boolean method18816(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class621 local5 = this.method18952((byte) 19);
		@Pc(20) Class6 local20 = this.aClass6_3.method23590(-499060808) && !this.aClass6_3.method23589((byte) 57) ? this.aClass6_3 : null;
		@Pc(37) Class6_Sub3 local37 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local20 == null) ? this.aClass6_Sub3_3 : null;
		@Pc(42) int local42 = local5.anInt5464 * -1053924669;
		@Pc(47) int local47 = local5.anInt5459 * -635285373;
		if (local42 != 0 || local47 != 0 || local5.anInt5467 * 73788751 != 0 || local5.anInt5466 * -1192955301 != 0) {
			arg1 |= 0x7;
		}
		@Pc(85) boolean local85 = this.aByte73 != 0 && client.currentCycle >= this.anInt2698 * 1134746577 && client.currentCycle < this.anInt2692 * -691507419;
		if (local85) {
			arg1 |= 0x80000;
		}
		@Pc(93) boolean local93 = false;
		if (this.anInt2685 * -411125797 != 0) {
			@Pc(113) Class335 local113 = this.aClass335_1.anIntArray416 == null ? this.aClass335_1 : this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 1519812325);
			if (local113 == null || client.currentCycle >= local113.anInt4229 * 690436873 + this.anInt2690 * 712425003) {
				this.anInt2685 = 0;
			} else {
				this.anInt2685 = (255 - (client.currentCycle - this.anInt2690 * 712425003) * 255 / (local113.anInt4229 * 690436873)) * 1227779155;
				local93 = true;
			}
		}
		if (local93) {
			arg1 |= 0x100;
		}
		@Pc(162) int local162 = this.aClass372_8.method28394((byte) 3);
		@Pc(190) Class105 local190 = this.aClass105Array3[0] = this.aClass335_1.method27829(arg0, arg1, Class533.aClass41_Sub18_1, Class672.aClass134_1, Class672.aClass134_1, local20, local37, this.aClass6_Sub1_Sub1Array3, this.anIntArray235, local162, this.aClass350_1, this.method18970(-1356132775), false, (byte) 0);
		if (local190 == null) {
			return false;
		}
		this.anInt2674 = local190.method7366() * -527958611;
		this.anInt2699 = local190.method7390() * -807746119;
		local190.method7501();
		this.method18983(local190, (byte) 90);
		if (local42 == 0 && local47 == 0) {
			this.method18969(local162, this.method18966((byte) -37) << 9, this.method18966((byte) -124) << 9, 0, 0, 2014461676);
		} else {
			this.method18969(local162, local42, local47, local5.anInt5460 * 979112709, local5.anInt5461 * 381253511, -1014569765);
			if (this.anInt2680 * -2015931105 != 0) {
				this.aClass105Array3[0].method7330(this.anInt2680 * -2015931105);
			}
			if (this.anInt2679 * -245869181 != 0) {
				this.aClass105Array3[0].method7318(this.anInt2679 * -245869181);
			}
			if (this.anInt2706 * -1001713671 != 0) {
				this.aClass105Array3[0].method7332(0, this.anInt2706 * -1001713671, 0);
			}
		}
		if (local85) {
			local190.method7380(this.aByte70, this.aByte71, this.aByte72, this.aByte73 & 0xFF);
		}
		if (local93) {
			local190.method7348((byte) (this.anInt2685 * -411125797), null);
		}
		this.method19018(arg0, local5, local1, local42, local47, local162, (byte) -123);
		return true;
	}

	@OriginalMember(owner = "client!aqb", name = "bq", descriptor = "(I)I")
	@Override
	public int method18960(@OriginalArg(0) int arg0) {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(11) Class335 local11 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -528608198);
			if (local11 != null && local11.anInt4208 * -2068549421 != -1) {
				return local11.anInt4208 * -2068549421;
			}
		}
		return this.aClass335_1.anInt4208 * -2068549421;
	}

	@OriginalMember(owner = "client!aqb", name = "hb", descriptor = "(I)Z")
	boolean method18817(@OriginalArg(0) int arg0) {
		return this.aBoolean446 || this.aClass335_1.aBoolean821;
	}

	@OriginalMember(owner = "client!aqb", name = "ib", descriptor = "(IIIZI)V")
	public void method18818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aByte99 = this.aByte100 = (byte) arg0;
		if (client.aClass539_1.method30903(-463929735).method30429(arg1, arg2, 381641168)) {
			this.aByte100++;
		}
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		@Pc(45) int local45;
		for (local45 = 0; local45 < this.aClass561Array3.length; local45++) {
			if (this.aClass561Array3[local45].anInt5188 * -2124314403 != -1) {
				@Pc(71) Class684 local71 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local45].anInt5188 * -2124314403, -869856906);
				if (local71.aBoolean986 && local71.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local71.anInt5764 * 319211597, 157058944)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local45].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local45].anInt5188 = -1389203317;
				}
			}
		}
		if (!arg3) {
			local45 = arg1 - this.anIntArray234[0];
			@Pc(125) int local125 = arg2 - this.anIntArray242[0];
			if (local45 >= -8 && local45 <= 8 && local125 >= -8 && local125 <= 8) {
				if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
					this.anInt2700 += -1307113885;
				}
				for (@Pc(158) int local158 = this.anInt2700 * 1679797067; local158 > 0; local158--) {
					this.anIntArray234[local158] = this.anIntArray234[local158 - 1];
					this.anIntArray242[local158] = this.anIntArray242[local158 - 1];
					this.aByteArray49[local158] = this.aByteArray49[local158 - 1];
				}
				this.anIntArray234[0] = arg1;
				this.anIntArray242[0] = arg2;
				this.aByteArray49[0] = Class712.aClass712_2.aByte165;
				return;
			}
		}
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg1;
		this.anIntArray242[0] = arg2;
		@Pc(233) Class463 local233 = Class463.method29472(this.method24552().aClass463_61);
		local233.aFloat297 = (this.anIntArray234[0] << 9) + (arg4 << 8);
		local233.aFloat296 = (this.anIntArray242[0] << 9) + (arg4 << 8);
		this.method24542(local233);
		local233.method29557();
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqb", name = "ih", descriptor = "()V")
	void method18819() {
		this.anInt2659 = ((int) (Math.random() * 4.0D) + 32) * -254547113;
		this.anInt2668 = ((int) (Math.random() * 2.0D) + 3) * 1351983851;
		this.anInt2661 = ((int) (Math.random() * 3.0D) + 16) * -254915171;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt2667 = (int) (Math.random() * 6.0D) * -484718909;
		} else {
			this.anInt2667 = (int) (Math.random() * 12.0D) * -484718909;
		}
	}

	@OriginalMember(owner = "client!aqb", name = "iw", descriptor = "()Z")
	boolean method18820() {
		return this.aBoolean446 || this.aClass335_1.aBoolean821;
	}

	@OriginalMember(owner = "client!aqb", name = "iv", descriptor = "(I)I")
	public int method18821(@OriginalArg(0) int arg0) {
		return this.anIntArray233[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "ie", descriptor = "(I)I")
	public int method18822(@OriginalArg(0) int arg0) {
		return this.anIntArray233[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "ik", descriptor = "(I)I")
	public int method18823(@OriginalArg(0) int arg0) {
		return this.anIntArray233[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "ii", descriptor = "(I)I")
	public int method18824(@OriginalArg(0) int arg0) {
		return this.anIntArray233[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "is", descriptor = "(I)I")
	public int method18825(@OriginalArg(0) int arg0) {
		return this.anIntArray232[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "ic", descriptor = "(I)I")
	public int method18826(@OriginalArg(0) int arg0) {
		return this.anIntArray232[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "im", descriptor = "(I)I")
	public int method18827(@OriginalArg(0) int arg0) {
		return this.anIntArray232[arg0];
	}

	@OriginalMember(owner = "client!aqb", name = "ez", descriptor = "()I")
	@Override
	public int method18959() {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(11) Class335 local11 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -1724965476);
			if (local11 != null && local11.anInt4208 * -2068549421 != -1) {
				return local11.anInt4208 * -2068549421;
			}
		}
		return this.aClass335_1.anInt4208 * -2068549421;
	}

	@OriginalMember(owner = "client!aqb", name = "ey", descriptor = "()I")
	@Override
	public int method18994() {
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(11) Class335 local11 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 1326158215);
			if (local11 != null && local11.anInt4208 * -2068549421 != -1) {
				return local11.anInt4208 * -2068549421;
			}
		}
		return this.aClass335_1.anInt4208 * -2068549421;
	}

	@OriginalMember(owner = "client!aqb", name = "jd", descriptor = "(III)V")
	public void method18828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray233[arg0] = arg1;
		this.anIntArray232[arg0] = arg2;
	}

	@OriginalMember(owner = "client!aqb", name = "jv", descriptor = "(Ljava/lang/String;II)V")
	public void method18829(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class165_Sub11.method16047((byte) -33) * 165505167 * Class698.aClass638_1.anInt5605;
		this.method18975(arg0, arg1, arg2, local7, (short) 3621);
	}

	@OriginalMember(owner = "client!aqb", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!aqb", name = "bm", descriptor = "(I)I")
	@Override
	int method18970(@OriginalArg(0) int arg0) {
		if (-2039454109 * this.anInt2663 != -1) {
			return this.anInt2663 * -2039454109;
		}
		if (this.aClass335_1.anIntArray416 != null) {
			@Pc(21) Class335 local21 = this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, -1826998568);
			if (local21 != null && local21.anInt4203 * -1645868939 != -1) {
				return local21.anInt4203 * -1645868939;
			}
		}
		return this.aClass335_1.anInt4203 * -1645868939;
	}

	@OriginalMember(owner = "client!aqb", name = "gn", descriptor = "()Z")
	@Override
	public boolean method24615() {
		return this.aClass335_1.anIntArray416 == null || this.aClass335_1.method27836(Class672.aClass134_1, Class672.aClass134_1, 428069264) != null;
	}
}
