package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aby")
public final class Class49 {

	@OriginalMember(owner = "client!aby", name = "f", descriptor = "I")
	static final int anInt182 = 1;

	@OriginalMember(owner = "client!aby", name = "e", descriptor = "I")
	static final int anInt183 = 2;

	@OriginalMember(owner = "client!aby", name = "u", descriptor = "I")
	static final int anInt184 = 4;

	@OriginalMember(owner = "client!aby", name = "l", descriptor = "I")
	static final int anInt185 = 8;

	@OriginalMember(owner = "client!aby", name = "t", descriptor = "I")
	static final int anInt186 = 2;

	@OriginalMember(owner = "client!aby", name = "an", descriptor = "I")
	static int anInt187;

	@OriginalMember(owner = "client!aby", name = "g", descriptor = "[I")
	public int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!aby", name = "i", descriptor = "[I")
	public int[] anIntArray17 = new int[3];

	@OriginalMember(owner = "client!aby", name = "m", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!aby", name = "o", descriptor = "[I")
	public int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!aby", name = "j", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!aby", name = "a", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!aby", name = "i", descriptor = "(Lclient!abs;Lclient!ald;I)Lclient!aby;")
	static Class49 method998(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class49 local4 = new Class49(arg0);
		@Pc(8) int local8 = arg1.g1();
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(25) boolean local25 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray16[0] = arg1.g2();
				local4.anIntArray17[0] = arg1.g2();
			} else {
				local4.anIntArray16[0] = arg1.gSmart2or4null();
				local4.anIntArray17[0] = arg1.gSmart2or4null();
			}
			if (arg0.anInt139 * 1203565433 != -1 || -226067627 * arg0.anInt141 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[1] = arg1.g2();
					local4.anIntArray17[1] = arg1.g2();
				} else {
					local4.anIntArray16[1] = arg1.gSmart2or4null();
					local4.anIntArray17[1] = arg1.gSmart2or4null();
				}
			}
			if (arg0.anInt142 * 1206901479 != -1 || arg0.anInt143 * -1136335691 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[2] = arg1.g2();
					local4.anIntArray17[2] = arg1.g2();
				} else {
					local4.anIntArray16[2] = arg1.gSmart2or4null();
					local4.anIntArray17[2] = arg1.gSmart2or4null();
				}
			}
		}
		if (local25) {
			if (arg2 <= 1) {
				local4.anIntArray18[0] = arg1.g2();
				local4.anIntArray19[0] = arg1.g2();
			} else {
				local4.anIntArray18[0] = arg1.gSmart2or4null();
				local4.anIntArray19[0] = arg1.gSmart2or4null();
			}
			if (arg0.anInt129 * 1334171149 != -1 || arg0.anInt133 * -290918155 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray18[1] = arg1.g2();
					local4.anIntArray19[1] = arg1.g2();
				} else {
					local4.anIntArray18[1] = arg1.gSmart2or4null();
					local4.anIntArray19[1] = arg1.gSmart2or4null();
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local33) {
			local247 = arg1.g2();
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.g2();
				}
			}
		}
		if (local41) {
			local247 = arg1.g1();
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.g2();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aby", name = "u", descriptor = "(Lclient!abs;Lclient!ald;)Lclient!aby;")
	public static Class49 method999(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1) {
		return Class710.method37158(arg0, arg1, 2, 868299037);
	}

	@OriginalMember(owner = "client!aby", name = "e", descriptor = "(Lclient!abs;Lclient!ald;)Lclient!aby;")
	public static Class49 method1000(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1) {
		return Class710.method37158(arg0, arg1, 2, 868299037);
	}

	@OriginalMember(owner = "client!aby", name = "g", descriptor = "(Lclient!abs;Lclient!ald;I)Lclient!aby;")
	static Class49 method1001(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class49 local4 = new Class49(arg0);
		@Pc(8) int local8 = arg1.g1();
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(25) boolean local25 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray16[0] = arg1.g2();
				local4.anIntArray17[0] = arg1.g2();
			} else {
				local4.anIntArray16[0] = arg1.gSmart2or4null();
				local4.anIntArray17[0] = arg1.gSmart2or4null();
			}
			if (arg0.anInt139 * 1203565433 != -1 || -226067627 * arg0.anInt141 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[1] = arg1.g2();
					local4.anIntArray17[1] = arg1.g2();
				} else {
					local4.anIntArray16[1] = arg1.gSmart2or4null();
					local4.anIntArray17[1] = arg1.gSmart2or4null();
				}
			}
			if (arg0.anInt142 * 1206901479 != -1 || arg0.anInt143 * -1136335691 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[2] = arg1.g2();
					local4.anIntArray17[2] = arg1.g2();
				} else {
					local4.anIntArray16[2] = arg1.gSmart2or4null();
					local4.anIntArray17[2] = arg1.gSmart2or4null();
				}
			}
		}
		if (local25) {
			if (arg2 <= 1) {
				local4.anIntArray18[0] = arg1.g2();
				local4.anIntArray19[0] = arg1.g2();
			} else {
				local4.anIntArray18[0] = arg1.gSmart2or4null();
				local4.anIntArray19[0] = arg1.gSmart2or4null();
			}
			if (arg0.anInt129 * 1334171149 != -1 || arg0.anInt133 * -290918155 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray18[1] = arg1.g2();
					local4.anIntArray19[1] = arg1.g2();
				} else {
					local4.anIntArray18[1] = arg1.gSmart2or4null();
					local4.anIntArray19[1] = arg1.gSmart2or4null();
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local33) {
			local247 = arg1.g2();
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.g2();
				}
			}
		}
		if (local41) {
			local247 = arg1.g1();
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.g2();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aby", name = "l", descriptor = "(Lclient!abs;Lclient!ald;)Lclient!aby;")
	public static Class49 method1002(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1) {
		return Class710.method37158(arg0, arg1, 2, 868299037);
	}

	@OriginalMember(owner = "client!aby", name = "ib", descriptor = "([[[Lclient!tb;IIIZI)Z")
	static boolean method1003(@OriginalArg(0) Class568[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) byte[][][] local3 = client.aClass539_1.method30960(1076727693);
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (client.anInt3496 * 939223631 & 0xFF);
		if (local3[Class507.anInt5045 * -1170417853][arg2][arg3] == local14) {
			return false;
		}
		@Pc(31) Class502 local31 = client.aClass539_1.method30903(-463929735);
		if ((local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		client.anIntArray309[local49] = arg2;
		@Pc(58) int local58 = local49 + 1;
		client.anIntArray333[local49] = arg3;
		local3[Class507.anInt5045 * -1170417853][arg2][arg3] = local14;
		while (local58 != local51) {
			@Pc(79) int local79 = client.anIntArray309[local51] & 0xFFFF;
			@Pc(87) int local87 = client.anIntArray309[local51] >> 16 & 0xFF;
			@Pc(95) int local95 = client.anIntArray309[local51] >> 24 & 0xFF;
			@Pc(101) int local101 = client.anIntArray333[local51] & 0xFFFF;
			@Pc(109) int local109 = client.anIntArray333[local51] >> 16 & 0xFF;
			local51 = local51 + 1 & 0xFFF;
			@Pc(117) boolean local117 = false;
			if ((local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79][local101] & 0x4) == 0) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			@Pc(144) int local144;
			@Pc(189) int local189;
			@Pc(228) int local228;
			if (arg0 != null) {
				label240: for (local144 = Class507.anInt5045 * -1170417853 + 1; local144 <= 3; local144++) {
					if (arg0[local144] != null && (local31.aByteArrayArrayArray12[local144][local79][local101] & 0x8) == 0) {
						@Pc(321) Class120_Sub1_Sub1 local321;
						@Pc(331) int local331;
						@Pc(335) int local335;
						@Pc(346) int local346;
						@Pc(309) Class568 local309;
						@Pc(315) Class594 local315;
						if (local117 && arg0[local144][local79][local101] != null) {
							if (arg0[local144][local79][local101].aClass120_Sub1_Sub2_1 != null) {
								local189 = Class15.method422(local87, 24861809);
								if (arg0[local144][local79][local101].aClass120_Sub1_Sub2_1.aShort50 == local189 || arg0[local144][local79][local101].aClass120_Sub1_Sub2_2 != null && arg0[local144][local79][local101].aClass120_Sub1_Sub2_2.aShort50 == local189) {
									continue;
								}
								if (local95 != 0) {
									local228 = Class15.method422(local95, 1213568546);
									if (local228 == arg0[local144][local79][local101].aClass120_Sub1_Sub2_1.aShort50 || arg0[local144][local79][local101].aClass120_Sub1_Sub2_2 != null && local228 == arg0[local144][local79][local101].aClass120_Sub1_Sub2_2.aShort50) {
										continue;
									}
								}
								if (local109 != 0) {
									local228 = Class15.method422(local109, 1318110135);
									if (local228 == arg0[local144][local79][local101].aClass120_Sub1_Sub2_1.aShort50 || arg0[local144][local79][local101].aClass120_Sub1_Sub2_2 != null && arg0[local144][local79][local101].aClass120_Sub1_Sub2_2.aShort50 == local228) {
										continue;
									}
								}
							}
							local309 = arg0[local144][local79][local101];
							if (local309.aClass594_2 != null) {
								for (local315 = local309.aClass594_2; local315 != null; local315 = local315.aClass594_3) {
									local321 = local315.aClass120_Sub1_Sub1_1;
									if (local321 instanceof Interface60) {
										@Pc(327) Interface60 local327 = (Interface60) local321;
										local331 = local327.method13819(1294404716);
										local335 = local327.method13820(-1683813698);
										if (local331 == 21) {
											local331 = 19;
										}
										local346 = local331 | local335 << 6;
										if (local87 == local346 || local95 != 0 && local346 == local95 || local109 != 0 && local109 == local346) {
											continue label240;
										}
									}
								}
							}
						}
						local309 = arg0[local144][local79][local101];
						if (local309 != null && local309.aClass594_2 != null) {
							for (local315 = local309.aClass594_2; local315 != null; local315 = local315.aClass594_3) {
								local321 = local315.aClass120_Sub1_Sub1_1;
								if (local321.aShort126 != local321.aShort129 || local321.aShort128 != local321.aShort127) {
									@Pc(402) short local402 = local321.aShort129;
									@Pc(405) short local405 = local321.aShort126;
									@Pc(408) short local408 = local321.aShort127;
									@Pc(411) short local411 = local321.aShort128;
									@Pc(422) int local422 = Math.max(0, Math.min(local402, local3[local144].length - 1));
									local335 = Math.max(0, Math.min(local408, local3[local144][0].length - 1));
									local331 = Math.max(0, Math.min(local405, local3[local144].length - 1));
									local346 = Math.max(0, Math.min(local411, local3[local144][0].length - 1));
									while (local422 <= local331) {
										while (local335 <= local346) {
											local3[local144][local422][local335] = local14;
											local335++;
										}
										local422++;
									}
								}
							}
						}
						local3[local144][local79][local101] = local14;
						local135 = true;
					}
				}
			}
			if (local135) {
				@Pc(502) int local502 = Class507.anInt5045 * -1170417853;
				local144 = client.aClass539_1.method30932(-1638462787).aClass100Array1[local502 + 1].method2917(local79, local101, -1655634006);
				if (client.anIntArray305[arg1] < local144) {
					client.anIntArray305[arg1] = local144;
				}
				local189 = local79 << 9;
				local228 = local101 << 9;
				if (client.anIntArray314[arg1] > local189) {
					client.anIntArray314[arg1] = local189;
				} else if (client.anIntArray315[arg1] < local189) {
					client.anIntArray315[arg1] = local189;
				}
				if (client.anIntArray317[arg1] > local228) {
					client.anIntArray317[arg1] = local228;
				} else if (client.anIntArray316[arg1] < local228) {
					client.anIntArray316[arg1] = local228;
				}
			}
			if (!local117) {
				if (local79 >= 1 && local14 != local3[Class507.anInt5045 * -1170417853][local79 - 1][local101]) {
					client.anIntArray309[local58] = local79 - 1 | 0x120000 | 0xD3000000;
					client.anIntArray333[local58] = local101 | 0x130000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class507.anInt5045 * -1170417853][local79 - 1][local101] = local14;
				}
				local101++;
				if (local101 < client.aClass539_1.method31011(-912641962)) {
					if (local79 - 1 >= 0 && local3[Class507.anInt5045 * -1170417853][local79 - 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79 - 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray309[local58] = local79 - 1 | 0x120000 | 0x52000000;
						client.anIntArray333[local58] = local101 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79 - 1][local101] = local14;
					}
					if (local14 != local3[Class507.anInt5045 * -1170417853][local79][local101]) {
						client.anIntArray309[local58] = local79 | 0x520000 | 0x13000000;
						client.anIntArray333[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass539_1.method30921(2116360211) && local14 != local3[Class507.anInt5045 * -1170417853][local79 + 1][local101] && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79 + 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray309[local58] = local79 + 1 | 0x520000 | 0x92000000;
						client.anIntArray333[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79 + 1][local101] = local14;
					}
				}
				local101--;
				if (local79 + 1 < client.aClass539_1.method30921(1856336849) && local14 != local3[Class507.anInt5045 * -1170417853][local79 + 1][local101]) {
					client.anIntArray309[local58] = local79 + 1 | 0x920000 | 0x53000000;
					client.anIntArray333[local58] = local101 | 0x930000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class507.anInt5045 * -1170417853][local79 + 1][local101] = local14;
				}
				local101--;
				if (local101 >= 0) {
					if (local79 - 1 >= 0 && local3[Class507.anInt5045 * -1170417853][local79 - 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79 - 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray309[local58] = local79 - 1 | 0xD20000 | 0x12000000;
						client.anIntArray333[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79 - 1][local101] = local14;
					}
					if (local14 != local3[Class507.anInt5045 * -1170417853][local79][local101]) {
						client.anIntArray309[local58] = local79 | 0xD20000 | 0x93000000;
						client.anIntArray333[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass539_1.method30921(2092157338) && local14 != local3[Class507.anInt5045 * -1170417853][local79 + 1][local101] && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local79 + 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray309[local58] = local79 + 1 | 0x920000 | 0xD2000000;
						client.anIntArray333[local58] = local101 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class507.anInt5045 * -1170417853][local79 + 1][local101] = local14;
					}
				}
			}
		}
		if (client.anIntArray305[arg1] != -1000000) {
			client.anIntArray305[arg1] += 40;
			client.anIntArray314[arg1] -= 512;
			client.anIntArray315[arg1] += 512;
			client.anIntArray316[arg1] += 512;
			client.anIntArray317[arg1] -= 512;
		}
		return true;
	}

	@OriginalMember(owner = "client!aby", name = "<init>", descriptor = "(Lclient!abs;)V")
	Class49(@OriginalArg(0) Class43 arg0) {
		this.anIntArray16[0] = arg0.anInt138 * -1897685083;
		this.anIntArray16[1] = arg0.anInt139 * 1203565433;
		this.anIntArray16[2] = arg0.anInt142 * 1206901479;
		this.anIntArray17[0] = arg0.anInt140 * -279219907;
		this.anIntArray17[1] = arg0.anInt141 * -226067627;
		this.anIntArray17[2] = arg0.anInt143 * -1136335691;
		this.anIntArray18[0] = arg0.anInt150 * 832687107;
		this.anIntArray18[1] = arg0.anInt129 * 1334171149;
		this.anIntArray19[0] = arg0.anInt152 * 503883385;
		this.anIntArray19[1] = arg0.anInt133 * -290918155;
		if (arg0.aShortArray5 != null) {
			this.aShortArray7 = new short[arg0.aShortArray5.length];
			System.arraycopy(arg0.aShortArray5, 0, this.aShortArray7, 0, this.aShortArray7.length);
		}
		if (arg0.aShortArray3 != null) {
			this.aShortArray6 = new short[arg0.aShortArray3.length];
			System.arraycopy(arg0.aShortArray3, 0, this.aShortArray6, 0, this.aShortArray6.length);
		}
	}
}
