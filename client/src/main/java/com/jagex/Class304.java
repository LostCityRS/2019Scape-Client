package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gy")
public final class Class304 implements Interface75 {

	@OriginalMember(owner = "client!gy", name = "kk", descriptor = "I")
	public static int anInt3975;

	@OriginalMember(owner = "client!gy", name = "t", descriptor = "Lclient!gy;")
	static final Class304 aClass304_3 = new Class304(0, 0);

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "Lclient!gy;")
	static final Class304 aClass304_2 = new Class304(3, 1);

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "Lclient!gy;")
	static final Class304 aClass304_5 = new Class304(2, 2);

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "Lclient!gy;")
	static final Class304 aClass304_4 = new Class304(1, 3);

	@OriginalMember(owner = "client!gy", name = "l", descriptor = "I")
	final int anInt3973;

	@OriginalMember(owner = "client!gy", name = "g", descriptor = "I")
	final int anInt3974;

	@OriginalMember(owner = "client!gy", name = "t", descriptor = "(B)[Lclient!gy;")
	static Class304[] method27121(@OriginalArg(0) byte arg0) {
		return new Class304[] { aClass304_3, aClass304_4, aClass304_5, aClass304_2 };
	}

	@OriginalMember(owner = "client!gy", name = "u", descriptor = "()[Lclient!gy;")
	static Class304[] method27122() {
		return new Class304[] { aClass304_3, aClass304_4, aClass304_5, aClass304_2 };
	}

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "()[Lclient!gy;")
	static Class304[] method27123() {
		return new Class304[] { aClass304_3, aClass304_4, aClass304_5, aClass304_2 };
	}

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "(IIIB)I")
	public static int method27124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!gy", name = "bf", descriptor = "(II)Z")
	static boolean method27125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
	}

	@OriginalMember(owner = "client!gy", name = "avf", descriptor = "(Lclient!yp;I)V")
	static void method27126(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(-290867773);
	}

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "(CB)Z")
	public static boolean method27127(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		if (arg0 > ' ' && arg0 < '\u007f' || !(arg0 <= '\u007f' || arg0 >= ' ') || arg0 > ' ' && arg0 <= 'ÿ') {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(23) char[] local23 = Class714.aCharArray5;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(33) char local33 = local23[local25];
				if (arg0 == local33) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gy", name = "i", descriptor = "(I)V")
	static void method27128(@OriginalArg(0) int arg0) {
		if (client.anInt3461 * 1675806989 >= 0) {
			return;
		}
		@Pc(7) Class15 local7 = Class445.method29244(2021623661);
		if (!Class630.aBoolean955) {
			Class630.aBoolean956 = Class630.anInt5563 * 1594866231 != -1 && Class630.anInt5553 * 721317679 >= Class630.anInt5563 * 1594866231 || (Class630.aBoolean957 ? 26 : 22) + Class630.anInt5553 * 721317679 * Class630.anInt5547 * 1378633515 > Class80_Sub25.anInt1627 * 167687103;
		}
		Class630.aClass8_54.method260(-293506727);
		Class630.aClass8_56.method260(1581845392);
		@Pc(61) int local61;
		for (@Pc(53) Class80_Sub1_Sub11 local53 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local53 != null; local53 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-1393467343)) {
			local61 = local53.anInt3079 * 1479399259;
			if (local61 < 1000) {
				local53.method24395((byte) 84);
				if (local61 == 59 || local61 == 2 || local61 == 8 || local61 == 17 || local61 == 15 || local61 == 16 || local61 == 58) {
					Class630.aClass8_56.method232(local53, 498086631);
				} else {
					Class630.aClass8_54.method232(local53, 1997098495);
				}
			}
		}
		Class630.aClass8_54.method248(Class630.aClass8_55, 1355849887);
		Class630.aClass8_56.method248(Class630.aClass8_55, 738546206);
		if (Class630.anInt5553 * 721317679 > 1) {
			if (Class714.method37211((byte) 81) && Class630.anInt5553 * 721317679 > 2) {
				Class630.aClass80_Sub1_Sub11_4 = (Class80_Sub1_Sub11) Class630.aClass8_55.aClass80_3.aClass80_228.aClass80_228;
			} else {
				Class630.aClass80_Sub1_Sub11_4 = (Class80_Sub1_Sub11) Class630.aClass8_55.aClass80_3.aClass80_228;
			}
			Class57.aClass80_Sub1_Sub11_1 = (Class80_Sub1_Sub11) Class630.aClass8_55.aClass80_3.aClass80_228;
			if (Class630.anInt5553 * 721317679 > 2) {
				Class686.aClass80_Sub1_Sub11_5 = (Class80_Sub1_Sub11) Class57.aClass80_Sub1_Sub11_1.aClass80_228;
			} else {
				Class686.aClass80_Sub1_Sub11_5 = null;
			}
		} else {
			Class630.aClass80_Sub1_Sub11_4 = null;
			Class57.aClass80_Sub1_Sub11_1 = null;
			Class686.aClass80_Sub1_Sub11_5 = null;
		}
		@Pc(165) Class80_Sub17 local165 = (Class80_Sub17) client.aClass8_45.method247(129206984);
		@Pc(176) int local176;
		if (local165 == null) {
			local61 = Class363.aClass152_1.method14615(-1401338882);
			local176 = Class363.aClass152_1.method14598(-796107901);
		} else {
			local61 = local165.method23451(113372136);
			local176 = local165.method23454(-776773663);
		}
		@Pc(613) boolean local613;
		if (!Class630.aBoolean955) {
			local613 = Class299.method27022(Class630.aClass641_1.anInterface67_4, local165, (byte) 6);
			@Pc(842) boolean local842 = Class299.method27022(Class630.aClass641_1.anInterface67_1, local165, (byte) 6);
			@Pc(848) boolean local848 = Class299.method27022(Class630.aClass641_1.anInterface67_2, local165, (byte) 6);
			if ((local613 || local842) && (client.anInt3520 * 790836551 == 1 && Class630.anInt5553 * 721317679 > 2 || Class293.method26954(-927341063))) {
				local848 = true;
			}
			if (local848 && Class630.anInt5553 * 721317679 > 0) {
				if (client.aClass327_8 == null && client.anInt3430 * -994652199 == 0) {
					Class291.method26940(local61, local176, -2104918313);
				} else {
					Class630.anInt5549 = -644392558;
				}
			} else if (local842) {
				if (Class686.aClass80_Sub1_Sub11_5 != null) {
					Class103_Sub11.method7907(Class686.aClass80_Sub1_Sub11_5, local61, local176, false, 153593554);
				}
			} else if (local613) {
				if (Class630.aClass80_Sub1_Sub11_4 != null) {
					@Pc(914) boolean local914 = client.aClass327_8 != null || client.anInt3430 * -994652199 > 0;
					if (local914) {
						Class630.anInt5549 = 1825287369;
						Class130_Sub1.aClass80_Sub1_Sub11_2 = Class630.aClass80_Sub1_Sub11_4;
					} else {
						Class103_Sub11.method7907(Class630.aClass80_Sub1_Sub11_4, local61, local176, false, -709951062);
					}
				} else if (client.aBoolean728) {
					Class450.method29279((byte) 113);
				}
			}
			if (client.aClass327_8 == null && client.anInt3430 * -994652199 == 0) {
				Class630.anInt5549 = 0;
				Class130_Sub1.aClass80_Sub1_Sub11_2 = null;
			}
			return;
		}
		@Pc(227) int local227;
		@Pc(254) int local254;
		if (!Class299.method27022(Class630.aClass641_1.anInterface67_3, local165, (byte) 6)) {
			local613 = false;
			if (Class630.aClass80_Sub1_Sub4_1 != null) {
				if (local61 >= Class41_Sub12.anInt2441 * 1627981811 - 10 && local61 <= Class40.anInt116 * -477951091 + 10 + Class41_Sub12.anInt2441 * 1627981811 && local176 >= Class630.anInt5557 * -1965654097 - 10 && local176 <= Class681.anInt5749 * -1929920381 + 10 + Class630.anInt5557 * -1965654097) {
					local613 = true;
				} else {
					Class474.method29878(-1083649157);
				}
			}
			if (!local613) {
				if (local61 < Class594.anInt5325 * 2014486095 - 10 || local61 > Class594.anInt5325 * 2014486095 + Class427.anInt4636 * 663066865 + 10 || local176 < Class103_Sub15.anInt970 * -1540302901 - 10 || local176 > Class106.anInt2551 * -1646871895 + 10 + Class103_Sub15.anInt970 * -1540302901) {
					Class392.method28680(1305557302);
				} else if (Class630.aBoolean956) {
					local227 = -1;
					local254 = -1;
					@Pc(705) int local705;
					for (local705 = 0; local705 < Class630.anInt5554 * 876474189; local705++) {
						@Pc(731) int local731;
						if (Class630.aBoolean957) {
							local731 = local705 * 1378633515 * Class630.anInt5547 + 1 + local7.anInt45 * 1190692343 + 20 + Class103_Sub15.anInt970 * -1540302901;
							if (local176 > local731 - local7.anInt45 * 1190692343 - 1 && local176 < local7.anInt46 * -191270971 + local731) {
								local227 = local705;
								local254 = local731 - local7.anInt45 * 1190692343 - 1;
								break;
							}
						} else {
							local731 = local705 * Class630.anInt5547 * 1378633515 + 31 + Class103_Sub15.anInt970 * -1540302901;
							if (local176 > local731 - 13 && local176 < local731 + 3) {
								local227 = local705;
								local254 = local731 - 13;
								break;
							}
						}
					}
					if (local227 != -1) {
						local705 = 0;
						@Pc(802) Class12 local802 = new Class12(Class630.aSecondaryLinkedList_17);
						for (@Pc(807) Class80_Sub1_Sub4 local807 = (Class80_Sub1_Sub4) local802.method338(-272128745); local807 != null; local807 = (Class80_Sub1_Sub4) local802.next()) {
							if (local227 == local705) {
								if (local807.anInt3022 * 855388281 > 1) {
									Class371.method28388(local807, local254, (byte) -34);
								}
								break;
							}
							local705++;
						}
					}
				}
			}
			return;
		}
		@Pc(225) int local225;
		@Pc(317) Class80_Sub1_Sub11 local317;
		@Pc(312) Class12 local312;
		if (Class630.aClass80_Sub1_Sub4_1 != null && local61 >= Class41_Sub12.anInt2441 * 1627981811 && local61 <= Class40.anInt116 * -477951091 + Class41_Sub12.anInt2441 * 1627981811 && local176 >= Class630.anInt5557 * -1965654097 && local176 <= Class681.anInt5749 * -1929920381 + Class630.anInt5557 * -1965654097) {
			local225 = -1;
			for (local227 = 0; local227 < Class630.aClass80_Sub1_Sub4_1.anInt3022 * 855388281; local227++) {
				if (Class630.aBoolean957) {
					local254 = 1 + 20 + Class630.anInt5557 * -1965654097 + local7.anInt45 * 1190692343 + local227 * 1378633515 * Class630.anInt5547;
					if (local176 > local254 - local7.anInt45 * 1190692343 - 1 && local176 < local7.anInt46 * -191270971 + local254) {
						local225 = local227;
					}
				} else {
					local254 = Class630.anInt5557 * -1965654097 + 31 + Class630.anInt5547 * 1378633515 * local227;
					if (local176 > local254 - 13 && local176 < local254 + 3) {
						local225 = local227;
					}
				}
			}
			if (local225 != -1) {
				local227 = 0;
				local312 = new Class12(Class630.aClass80_Sub1_Sub4_1.aSecondaryLinkedList_10);
				for (local317 = (Class80_Sub1_Sub11) local312.method338(-1812319030); local317 != null; local317 = (Class80_Sub1_Sub11) local312.next()) {
					if (local225 == local227) {
						Class103_Sub11.method7907(local317, local61, local176, true, -1660975810);
						break;
					}
					local227++;
				}
			}
			Class392.method28680(1305557302);
		} else if (local61 >= Class594.anInt5325 * 2014486095 && local61 <= Class594.anInt5325 * 2014486095 + Class427.anInt4636 * 663066865 && local176 >= Class103_Sub15.anInt970 * -1540302901 && local176 <= Class106.anInt2551 * -1646871895 + Class103_Sub15.anInt970 * -1540302901) {
			if (Class630.aBoolean956) {
				local225 = -1;
				for (local227 = 0; local227 < Class630.anInt5554 * 876474189; local227++) {
					if (Class630.aBoolean957) {
						local254 = Class630.anInt5547 * 1378633515 * local227 + 1 + Class103_Sub15.anInt970 * -1540302901 + 20 + local7.anInt45 * 1190692343;
						if (local176 > local254 - local7.anInt45 * 1190692343 - 1 && local176 < local7.anInt46 * -191270971 + local254) {
							local225 = local227;
							break;
						}
					} else {
						local254 = Class630.anInt5547 * 1378633515 * local227 + Class103_Sub15.anInt970 * -1540302901 + 31;
						if (local176 > local254 - 13 && local176 < local254 + 3) {
							local225 = local227;
							break;
						}
					}
				}
				if (local225 != -1) {
					local227 = 0;
					local312 = new Class12(Class630.aSecondaryLinkedList_17);
					for (@Pc(586) Class80_Sub1_Sub4 local586 = (Class80_Sub1_Sub4) local312.method338(-1994930908); local586 != null; local586 = (Class80_Sub1_Sub4) local312.next()) {
						if (local227 == local225) {
							Class103_Sub11.method7907((Class80_Sub1_Sub11) local586.aSecondaryLinkedList_10.aClass80_Sub1_2.aClass80_Sub1_68, local61, local176, true, -2142093431);
							Class392.method28680(1305557302);
							break;
						}
						local227++;
					}
				}
			} else {
				local225 = -1;
				for (local227 = 0; local227 < Class630.anInt5553 * 721317679; local227++) {
					if (Class630.aBoolean957) {
						local254 = Class630.anInt5547 * 1378633515 * (Class630.anInt5553 * 721317679 - 1 - local227) + local7.anInt45 * 1190692343 + 20 + Class103_Sub15.anInt970 * -1540302901 + 1;
						if (local176 > local254 - local7.anInt45 * 1190692343 - 1 && local176 < local7.anInt46 * -191270971 + local254) {
							local225 = local227;
						}
					} else {
						local254 = (Class630.anInt5553 * 721317679 - 1 - local227) * Class630.anInt5547 * 1378633515 + 31 + Class103_Sub15.anInt970 * -1540302901;
						if (local176 > local254 - 13 && local176 < local254 + 3) {
							local225 = local227;
						}
					}
				}
				if (local225 != -1) {
					local227 = 0;
					@Pc(467) Class7 local467 = new Class7(Class630.aClass8_55);
					for (local317 = (Class80_Sub1_Sub11) local467.method220(1030597627); local317 != null; local317 = (Class80_Sub1_Sub11) local467.next()) {
						if (local227 == local225) {
							Class103_Sub11.method7907(local317, local61, local176, true, -1294393024);
							break;
						}
						local227++;
					}
				}
				Class392.method28680(1305557302);
			}
		}
	}

	@OriginalMember(owner = "client!gy", name = "<init>", descriptor = "(II)V")
	Class304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3973 = arg0 * 1377825509;
		this.anInt3974 = arg1 * -610476713;
	}

	@OriginalMember(owner = "client!gy", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3974 * -349479321;
	}

	@OriginalMember(owner = "client!gy", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3974 * -349479321;
	}

	@OriginalMember(owner = "client!gy", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3974 * -349479321;
	}
}
