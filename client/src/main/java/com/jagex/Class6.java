package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aad")
public final class Class6 {

	@OriginalMember(owner = "client!aad", name = "l", descriptor = "I")
	static final int anInt15 = 50;

	@OriginalMember(owner = "client!aad", name = "m", descriptor = "I")
	static final int anInt16 = 23;

	@OriginalMember(owner = "client!aad", name = "k", descriptor = "I")
	static final int anInt17 = 0;

	@OriginalMember(owner = "client!aad", name = "e", descriptor = "I")
	static final int anInt18 = 4096;

	@OriginalMember(owner = "client!aad", name = "n", descriptor = "I")
	static final int anInt19 = 16;

	@OriginalMember(owner = "client!aad", name = "w", descriptor = "I")
	static final int anInt20 = 6;

	@OriginalMember(owner = "client!aad", name = "f", descriptor = "I")
	static final int anInt21 = 1;

	@OriginalMember(owner = "client!aad", name = "u", descriptor = "Lclient!aak;")
	static Class13 aClass13_1 = new Class13();

	@OriginalMember(owner = "client!aad", name = "e", descriptor = "([BI[BII)I")
	public static int method81(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class13 local2 = aClass13_1;
		synchronized (aClass13_1) {
			aClass13_1.aByteArray4 = arg2;
			aClass13_1.anInt31 = arg4 * -2036600201;
			aClass13_1.aByteArray5 = arg0;
			aClass13_1.anInt27 = 0;
			aClass13_1.anInt34 = arg1 * 246658435;
			aClass13_1.anInt37 = 0;
			aClass13_1.anInt26 = 0;
			aClass13_1.anInt32 = 0;
			aClass13_1.anInt35 = 0;
			method100(aClass13_1);
			@Pc(43) int local43 = arg1 - aClass13_1.anInt34 * -1148649173;
			aClass13_1.aByteArray4 = null;
			aClass13_1.aByteArray5 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!aad", name = "n", descriptor = "(Lclient!aak;)V")
	static void method82(@OriginalArg(0) Class13 arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(7) int local7 = arg0.anInt36 * 1735960507;
		@Pc(12) int local12 = arg0.anInt40 * -945785565;
		@Pc(17) int local17 = arg0.anInt39 * 1728369683;
		@Pc(19) int[] local19 = Class568.anIntArray472;
		@Pc(24) int local24 = arg0.anInt45 * 2024390651;
		@Pc(27) byte[] local27 = arg0.aByteArray5;
		@Pc(32) int local32 = arg0.anInt27 * -1711373539;
		@Pc(37) int local37 = arg0.anInt34 * -1148649173;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt33 * 1688900423 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt35 * 268730893;
		arg0.anInt35 += (local39 - local37) * 2020121797;
		if (arg0.anInt35 * 268730893 < local211) {
		}
		arg0.aByte1 = local2;
		arg0.anInt36 = local7 * 1160906099;
		arg0.anInt40 = local12 * -68984181;
		arg0.anInt39 = local17 * 1194071579;
		Class568.anIntArray472 = local19;
		arg0.anInt45 = local24 * 1325626163;
		arg0.aByteArray5 = local27;
		arg0.anInt27 = local32 * 1388336949;
		arg0.anInt34 = local37 * 246658435;
	}

	@OriginalMember(owner = "client!aad", name = "k", descriptor = "(Lclient!aak;)B")
	static byte method83(@OriginalArg(0) Class13 arg0) {
		return (byte) method86(8, arg0);
	}

	@OriginalMember(owner = "client!aad", name = "i", descriptor = "([I[I[I[BIII)V")
	static void method84(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!aad", name = "f", descriptor = "(Lclient!aak;)B")
	static byte method85(@OriginalArg(0) Class13 arg0) {
		return (byte) method86(1, arg0);
	}

	@OriginalMember(owner = "client!aad", name = "w", descriptor = "(ILclient!aak;)I")
	static int method86(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		while (arg1.anInt37 * 1587558147 < arg0) {
			arg1.anInt26 = (arg1.anInt26 * 1287023133 << 8 | arg1.aByteArray4[arg1.anInt31 * 787842887] & 0xFF) * 263039029;
			arg1.anInt37 += -939827880;
			arg1.anInt31 += -2036600201;
			arg1.anInt32 += 752387429;
			if (arg1.anInt32 * -1433852819 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt26 * 1287023133 >> arg1.anInt37 * 1587558147 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt37 -= arg0 * 1493134251;
		return local23;
	}

	@OriginalMember(owner = "client!aad", name = "l", descriptor = "(Lclient!aak;)V")
	static void method87(@OriginalArg(0) Class13 arg0) {
		arg0.anInt41 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray2[local4]) {
				arg0.aByteArray9[arg0.anInt41 * -1232818527] = (byte) local4;
				arg0.anInt41 += -889014943;
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "u", descriptor = "([I[I[I[BIII)V")
	static void method88(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!aad", name = "b", descriptor = "(ILclient!aak;)I")
	static int method89(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		while (arg1.anInt37 * 1587558147 < arg0) {
			arg1.anInt26 = (arg1.anInt26 * 1287023133 << 8 | arg1.aByteArray4[arg1.anInt31 * 787842887] & 0xFF) * 263039029;
			arg1.anInt37 += -939827880;
			arg1.anInt31 += -2036600201;
			arg1.anInt32 += 752387429;
			if (arg1.anInt32 * -1433852819 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt26 * 1287023133 >> arg1.anInt37 * 1587558147 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt37 -= arg0 * 1493134251;
		return local23;
	}

	@OriginalMember(owner = "client!aad", name = "p", descriptor = "([BI[BII)I")
	public static int method90(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class13 local2 = aClass13_1;
		synchronized (aClass13_1) {
			aClass13_1.aByteArray4 = arg2;
			aClass13_1.anInt31 = arg4 * -2036600201;
			aClass13_1.aByteArray5 = arg0;
			aClass13_1.anInt27 = 0;
			aClass13_1.anInt34 = arg1 * 246658435;
			aClass13_1.anInt37 = 0;
			aClass13_1.anInt26 = 0;
			aClass13_1.anInt32 = 0;
			aClass13_1.anInt35 = 0;
			method100(aClass13_1);
			@Pc(43) int local43 = arg1 - aClass13_1.anInt34 * -1148649173;
			aClass13_1.aByteArray4 = null;
			aClass13_1.aByteArray5 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!aad", name = "d", descriptor = "(Lclient!aak;)V")
	static void method91(@OriginalArg(0) Class13 arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(7) int local7 = arg0.anInt36 * 1735960507;
		@Pc(12) int local12 = arg0.anInt40 * -945785565;
		@Pc(17) int local17 = arg0.anInt39 * 1728369683;
		@Pc(19) int[] local19 = Class568.anIntArray472;
		@Pc(24) int local24 = arg0.anInt45 * 2024390651;
		@Pc(27) byte[] local27 = arg0.aByteArray5;
		@Pc(32) int local32 = arg0.anInt27 * -1711373539;
		@Pc(37) int local37 = arg0.anInt34 * -1148649173;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt33 * 1688900423 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt35 * 268730893;
		arg0.anInt35 += (local39 - local37) * 2020121797;
		if (arg0.anInt35 * 268730893 < local211) {
		}
		arg0.aByte1 = local2;
		arg0.anInt36 = local7 * 1160906099;
		arg0.anInt40 = local12 * -68984181;
		arg0.anInt39 = local17 * 1194071579;
		Class568.anIntArray472 = local19;
		arg0.anInt45 = local24 * 1325626163;
		arg0.aByteArray5 = local27;
		arg0.anInt27 = local32 * 1388336949;
		arg0.anInt34 = local37 * 246658435;
	}

	@OriginalMember(owner = "client!aad", name = "c", descriptor = "(Lclient!aak;)V")
	static void method92(@OriginalArg(0) Class13 arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(7) int local7 = arg0.anInt36 * 1735960507;
		@Pc(12) int local12 = arg0.anInt40 * -945785565;
		@Pc(17) int local17 = arg0.anInt39 * 1728369683;
		@Pc(19) int[] local19 = Class568.anIntArray472;
		@Pc(24) int local24 = arg0.anInt45 * 2024390651;
		@Pc(27) byte[] local27 = arg0.aByteArray5;
		@Pc(32) int local32 = arg0.anInt27 * -1711373539;
		@Pc(37) int local37 = arg0.anInt34 * -1148649173;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt33 * 1688900423 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt35 * 268730893;
		arg0.anInt35 += (local39 - local37) * 2020121797;
		if (arg0.anInt35 * 268730893 < local211) {
		}
		arg0.aByte1 = local2;
		arg0.anInt36 = local7 * 1160906099;
		arg0.anInt40 = local12 * -68984181;
		arg0.anInt39 = local17 * 1194071579;
		Class568.anIntArray472 = local19;
		arg0.anInt45 = local24 * 1325626163;
		arg0.aByteArray5 = local27;
		arg0.anInt27 = local32 * 1388336949;
		arg0.anInt34 = local37 * 246658435;
	}

	@OriginalMember(owner = "client!aad", name = "r", descriptor = "(Lclient!aak;)V")
	static void method93(@OriginalArg(0) Class13 arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(7) int local7 = arg0.anInt36 * 1735960507;
		@Pc(12) int local12 = arg0.anInt40 * -945785565;
		@Pc(17) int local17 = arg0.anInt39 * 1728369683;
		@Pc(19) int[] local19 = Class568.anIntArray472;
		@Pc(24) int local24 = arg0.anInt45 * 2024390651;
		@Pc(27) byte[] local27 = arg0.aByteArray5;
		@Pc(32) int local32 = arg0.anInt27 * -1711373539;
		@Pc(37) int local37 = arg0.anInt34 * -1148649173;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt33 * 1688900423 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt35 * 268730893;
		arg0.anInt35 += (local39 - local37) * 2020121797;
		if (arg0.anInt35 * 268730893 < local211) {
		}
		arg0.aByte1 = local2;
		arg0.anInt36 = local7 * 1160906099;
		arg0.anInt40 = local12 * -68984181;
		arg0.anInt39 = local17 * 1194071579;
		Class568.anIntArray472 = local19;
		arg0.anInt45 = local24 * 1325626163;
		arg0.aByteArray5 = local27;
		arg0.anInt27 = local32 * 1388336949;
		arg0.anInt34 = local37 * 246658435;
	}

	@OriginalMember(owner = "client!aad", name = "v", descriptor = "(Lclient!aak;)V")
	static void method94(@OriginalArg(0) Class13 arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(7) int local7 = arg0.anInt36 * 1735960507;
		@Pc(12) int local12 = arg0.anInt40 * -945785565;
		@Pc(17) int local17 = arg0.anInt39 * 1728369683;
		@Pc(19) int[] local19 = Class568.anIntArray472;
		@Pc(24) int local24 = arg0.anInt45 * 2024390651;
		@Pc(27) byte[] local27 = arg0.aByteArray5;
		@Pc(32) int local32 = arg0.anInt27 * -1711373539;
		@Pc(37) int local37 = arg0.anInt34 * -1148649173;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt33 * 1688900423 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt35 * 268730893;
		arg0.anInt35 += (local39 - local37) * 2020121797;
		if (arg0.anInt35 * 268730893 < local211) {
		}
		arg0.aByte1 = local2;
		arg0.anInt36 = local7 * 1160906099;
		arg0.anInt40 = local12 * -68984181;
		arg0.anInt39 = local17 * 1194071579;
		Class568.anIntArray472 = local19;
		arg0.anInt45 = local24 * 1325626163;
		arg0.aByteArray5 = local27;
		arg0.anInt27 = local32 * 1388336949;
		arg0.anInt34 = local37 * 246658435;
	}

	@OriginalMember(owner = "client!aad", name = "z", descriptor = "([BI[BII)I")
	public static int method95(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class13 local2 = aClass13_1;
		synchronized (aClass13_1) {
			aClass13_1.aByteArray4 = arg2;
			aClass13_1.anInt31 = arg4 * -2036600201;
			aClass13_1.aByteArray5 = arg0;
			aClass13_1.anInt27 = 0;
			aClass13_1.anInt34 = arg1 * 246658435;
			aClass13_1.anInt37 = 0;
			aClass13_1.anInt26 = 0;
			aClass13_1.anInt32 = 0;
			aClass13_1.anInt35 = 0;
			method100(aClass13_1);
			@Pc(43) int local43 = arg1 - aClass13_1.anInt34 * -1148649173;
			aClass13_1.aByteArray4 = null;
			aClass13_1.aByteArray5 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!aad", name = "s", descriptor = "(Lclient!aak;)V")
	static void method96(@OriginalArg(0) Class13 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt38 = 749176239;
		if (Class568.anIntArray472 == null) {
			Class568.anIntArray472 = new int[arg0.anInt38 * 934620000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method83(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method85(arg0);
				if (local61 != 0) {
				}
				arg0.anInt44 = 0;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method85(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray3[local153] = true;
					} else {
						arg0.aBooleanArray3[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray2[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray3[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method85(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray2[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method87(arg0);
				@Pc(230) int local230 = arg0.anInt41 * -1232818527 + 2;
				@Pc(234) int local234 = method86(3, arg0);
				@Pc(238) int local238 = method86(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method85(arg0);
						if (local61 == 0) {
							arg0.aByteArray8[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray8[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray6[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method86(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method85(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray2[local322][local153] = (byte) local329;
								break;
							}
							local61 = method85(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray2[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray2[local322][local153];
						}
						if (arg0.aByteArrayArray2[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray2[local322][local153];
						}
					}
					method88(arg0.anIntArrayArray1[local322], arg0.anIntArrayArray2[local322], arg0.anIntArrayArray3[local322], arg0.aByteArrayArray2[local322], local368, local370, local230);
					arg0.anIntArray4[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt41 * -1232818527 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray2[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray7[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray1[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray6[local443];
					local37 = arg0.anIntArray4[local501];
					local39 = arg0.anIntArrayArray1[local501];
					local43 = arg0.anIntArrayArray3[local501];
					local41 = arg0.anIntArrayArray2[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method85(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray6[local443];
									local37 = arg0.anIntArray4[local501];
									local39 = arg0.anIntArrayArray1[local501];
									local43 = arg0.anIntArrayArray3[local501];
									local41 = arg0.anIntArrayArray2[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method85(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray9[arg0.aByteArray7[arg0.anIntArray1[0]] & 0xFF];
							arg0.anIntArray2[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class568.anIntArray472[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray1[0];
								local61 = arg0.aByteArray7[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray7[local716] = arg0.aByteArray7[local716 - 1];
									arg0.aByteArray7[local716 - 1] = arg0.aByteArray7[local716 - 2];
									arg0.aByteArray7[local716 - 2] = arg0.aByteArray7[local716 - 3];
									arg0.aByteArray7[local716 - 3] = arg0.aByteArray7[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray7[local702 + local694] = arg0.aByteArray7[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray7[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray1[local792] + local796;
								local61 = arg0.aByteArray7[local702];
								while (local702 > arg0.anIntArray1[local792]) {
									arg0.aByteArray7[local702] = arg0.aByteArray7[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray1[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray1[local792]--;
									arg0.aByteArray7[arg0.anIntArray1[local792]] = arg0.aByteArray7[arg0.anIntArray1[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray1[0]--;
								arg0.aByteArray7[arg0.anIntArray1[0]] = local61;
								if (arg0.anIntArray1[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray7[local459] = arg0.aByteArray7[arg0.anIntArray1[local461] + local465];
											local459--;
										}
										arg0.anIntArray1[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray2[arg0.aByteArray9[local61 & 0xFF] & 0xFF]++;
							Class568.anIntArray472[local491] = arg0.aByteArray9[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray6[local443];
								local37 = arg0.anIntArray4[local501];
								local39 = arg0.anIntArrayArray1[local501];
								local43 = arg0.anIntArrayArray3[local501];
								local41 = arg0.anIntArrayArray2[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method85(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt36 = 0;
					arg0.aByte1 = 0;
					arg0.anIntArray3[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] = arg0.anIntArray2[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] += arg0.anIntArray3[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class568.anIntArray472[local153] & 0xFF);
						Class568.anIntArray472[arg0.anIntArray3[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray3[local61 & 0xFF]++;
					}
					arg0.anInt45 = (Class568.anIntArray472[arg0.anInt44 * 1085437379] >> 8) * 1325626163;
					arg0.anInt40 = 0;
					arg0.anInt45 = Class568.anIntArray472[arg0.anInt45 * 2024390651] * 1325626163;
					arg0.anInt39 = (byte) (arg0.anInt45 * 2024390651 & 0xFF) * 1194071579;
					arg0.anInt45 = (arg0.anInt45 * 2024390651 >> 8) * 1325626163;
					arg0.anInt40 += -68984181;
					arg0.anInt33 = local491 * -1461770633;
					method82(arg0);
					if (arg0.anInt40 * -945785565 == arg0.anInt33 * 1688900423 + 1 && arg0.anInt36 * 1735960507 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aad", name = "y", descriptor = "(Lclient!aak;)B")
	static byte method97(@OriginalArg(0) Class13 arg0) {
		return (byte) method86(1, arg0);
	}

	@OriginalMember(owner = "client!aad", name = "o", descriptor = "(Lclient!aak;)V")
	static void method98(@OriginalArg(0) Class13 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt38 = 749176239;
		if (Class568.anIntArray472 == null) {
			Class568.anIntArray472 = new int[arg0.anInt38 * 934620000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method83(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method85(arg0);
				if (local61 != 0) {
				}
				arg0.anInt44 = 0;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method85(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray3[local153] = true;
					} else {
						arg0.aBooleanArray3[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray2[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray3[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method85(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray2[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method87(arg0);
				@Pc(230) int local230 = arg0.anInt41 * -1232818527 + 2;
				@Pc(234) int local234 = method86(3, arg0);
				@Pc(238) int local238 = method86(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method85(arg0);
						if (local61 == 0) {
							arg0.aByteArray8[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray8[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray6[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method86(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method85(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray2[local322][local153] = (byte) local329;
								break;
							}
							local61 = method85(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray2[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray2[local322][local153];
						}
						if (arg0.aByteArrayArray2[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray2[local322][local153];
						}
					}
					method88(arg0.anIntArrayArray1[local322], arg0.anIntArrayArray2[local322], arg0.anIntArrayArray3[local322], arg0.aByteArrayArray2[local322], local368, local370, local230);
					arg0.anIntArray4[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt41 * -1232818527 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray2[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray7[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray1[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray6[local443];
					local37 = arg0.anIntArray4[local501];
					local39 = arg0.anIntArrayArray1[local501];
					local43 = arg0.anIntArrayArray3[local501];
					local41 = arg0.anIntArrayArray2[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method85(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray6[local443];
									local37 = arg0.anIntArray4[local501];
									local39 = arg0.anIntArrayArray1[local501];
									local43 = arg0.anIntArrayArray3[local501];
									local41 = arg0.anIntArrayArray2[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method85(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray9[arg0.aByteArray7[arg0.anIntArray1[0]] & 0xFF];
							arg0.anIntArray2[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class568.anIntArray472[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray1[0];
								local61 = arg0.aByteArray7[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray7[local716] = arg0.aByteArray7[local716 - 1];
									arg0.aByteArray7[local716 - 1] = arg0.aByteArray7[local716 - 2];
									arg0.aByteArray7[local716 - 2] = arg0.aByteArray7[local716 - 3];
									arg0.aByteArray7[local716 - 3] = arg0.aByteArray7[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray7[local702 + local694] = arg0.aByteArray7[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray7[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray1[local792] + local796;
								local61 = arg0.aByteArray7[local702];
								while (local702 > arg0.anIntArray1[local792]) {
									arg0.aByteArray7[local702] = arg0.aByteArray7[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray1[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray1[local792]--;
									arg0.aByteArray7[arg0.anIntArray1[local792]] = arg0.aByteArray7[arg0.anIntArray1[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray1[0]--;
								arg0.aByteArray7[arg0.anIntArray1[0]] = local61;
								if (arg0.anIntArray1[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray7[local459] = arg0.aByteArray7[arg0.anIntArray1[local461] + local465];
											local459--;
										}
										arg0.anIntArray1[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray2[arg0.aByteArray9[local61 & 0xFF] & 0xFF]++;
							Class568.anIntArray472[local491] = arg0.aByteArray9[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray6[local443];
								local37 = arg0.anIntArray4[local501];
								local39 = arg0.anIntArrayArray1[local501];
								local43 = arg0.anIntArrayArray3[local501];
								local41 = arg0.anIntArrayArray2[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method85(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt36 = 0;
					arg0.aByte1 = 0;
					arg0.anIntArray3[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] = arg0.anIntArray2[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] += arg0.anIntArray3[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class568.anIntArray472[local153] & 0xFF);
						Class568.anIntArray472[arg0.anIntArray3[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray3[local61 & 0xFF]++;
					}
					arg0.anInt45 = (Class568.anIntArray472[arg0.anInt44 * 1085437379] >> 8) * 1325626163;
					arg0.anInt40 = 0;
					arg0.anInt45 = Class568.anIntArray472[arg0.anInt45 * 2024390651] * 1325626163;
					arg0.anInt39 = (byte) (arg0.anInt45 * 2024390651 & 0xFF) * 1194071579;
					arg0.anInt45 = (arg0.anInt45 * 2024390651 >> 8) * 1325626163;
					arg0.anInt40 += -68984181;
					arg0.anInt33 = local491 * -1461770633;
					method82(arg0);
					if (arg0.anInt40 * -945785565 == arg0.anInt33 * 1688900423 + 1 && arg0.anInt36 * 1735960507 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aad", name = "x", descriptor = "(ILclient!aak;)I")
	static int method99(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		while (arg1.anInt37 * 1587558147 < arg0) {
			arg1.anInt26 = (arg1.anInt26 * 1287023133 << 8 | arg1.aByteArray4[arg1.anInt31 * 787842887] & 0xFF) * 263039029;
			arg1.anInt37 += -939827880;
			arg1.anInt31 += -2036600201;
			arg1.anInt32 += 752387429;
			if (arg1.anInt32 * -1433852819 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt26 * 1287023133 >> arg1.anInt37 * 1587558147 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt37 -= arg0 * 1493134251;
		return local23;
	}

	@OriginalMember(owner = "client!aad", name = "m", descriptor = "(Lclient!aak;)V")
	static void method100(@OriginalArg(0) Class13 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt38 = 749176239;
		if (Class568.anIntArray472 == null) {
			Class568.anIntArray472 = new int[arg0.anInt38 * 934620000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method83(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method83(arg0);
				local61 = method85(arg0);
				if (local61 != 0) {
				}
				arg0.anInt44 = 0;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				local61 = method83(arg0);
				arg0.anInt44 = (arg0.anInt44 * 1085437379 << 8 | local61 & 0xFF) * -894557461;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method85(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray3[local153] = true;
					} else {
						arg0.aBooleanArray3[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray2[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray3[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method85(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray2[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method87(arg0);
				@Pc(230) int local230 = arg0.anInt41 * -1232818527 + 2;
				@Pc(234) int local234 = method86(3, arg0);
				@Pc(238) int local238 = method86(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method85(arg0);
						if (local61 == 0) {
							arg0.aByteArray8[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray8[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray6[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method86(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method85(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray2[local322][local153] = (byte) local329;
								break;
							}
							local61 = method85(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray2[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray2[local322][local153];
						}
						if (arg0.aByteArrayArray2[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray2[local322][local153];
						}
					}
					method88(arg0.anIntArrayArray1[local322], arg0.anIntArrayArray2[local322], arg0.anIntArrayArray3[local322], arg0.aByteArrayArray2[local322], local368, local370, local230);
					arg0.anIntArray4[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt41 * -1232818527 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray2[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray7[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray1[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray6[local443];
					local37 = arg0.anIntArray4[local501];
					local39 = arg0.anIntArrayArray1[local501];
					local43 = arg0.anIntArrayArray3[local501];
					local41 = arg0.anIntArrayArray2[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method85(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray6[local443];
									local37 = arg0.anIntArray4[local501];
									local39 = arg0.anIntArrayArray1[local501];
									local43 = arg0.anIntArrayArray3[local501];
									local41 = arg0.anIntArrayArray2[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method85(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray9[arg0.aByteArray7[arg0.anIntArray1[0]] & 0xFF];
							arg0.anIntArray2[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class568.anIntArray472[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray1[0];
								local61 = arg0.aByteArray7[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray7[local716] = arg0.aByteArray7[local716 - 1];
									arg0.aByteArray7[local716 - 1] = arg0.aByteArray7[local716 - 2];
									arg0.aByteArray7[local716 - 2] = arg0.aByteArray7[local716 - 3];
									arg0.aByteArray7[local716 - 3] = arg0.aByteArray7[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray7[local702 + local694] = arg0.aByteArray7[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray7[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray1[local792] + local796;
								local61 = arg0.aByteArray7[local702];
								while (local702 > arg0.anIntArray1[local792]) {
									arg0.aByteArray7[local702] = arg0.aByteArray7[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray1[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray1[local792]--;
									arg0.aByteArray7[arg0.anIntArray1[local792]] = arg0.aByteArray7[arg0.anIntArray1[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray1[0]--;
								arg0.aByteArray7[arg0.anIntArray1[0]] = local61;
								if (arg0.anIntArray1[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray7[local459] = arg0.aByteArray7[arg0.anIntArray1[local461] + local465];
											local459--;
										}
										arg0.anIntArray1[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray2[arg0.aByteArray9[local61 & 0xFF] & 0xFF]++;
							Class568.anIntArray472[local491] = arg0.aByteArray9[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray6[local443];
								local37 = arg0.anIntArray4[local501];
								local39 = arg0.anIntArrayArray1[local501];
								local43 = arg0.anIntArrayArray3[local501];
								local41 = arg0.anIntArrayArray2[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method86(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method85(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt36 = 0;
					arg0.aByte1 = 0;
					arg0.anIntArray3[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] = arg0.anIntArray2[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray3[local153] += arg0.anIntArray3[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class568.anIntArray472[local153] & 0xFF);
						Class568.anIntArray472[arg0.anIntArray3[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray3[local61 & 0xFF]++;
					}
					arg0.anInt45 = (Class568.anIntArray472[arg0.anInt44 * 1085437379] >> 8) * 1325626163;
					arg0.anInt40 = 0;
					arg0.anInt45 = Class568.anIntArray472[arg0.anInt45 * 2024390651] * 1325626163;
					arg0.anInt39 = (byte) (arg0.anInt45 * 2024390651 & 0xFF) * 1194071579;
					arg0.anInt45 = (arg0.anInt45 * 2024390651 >> 8) * 1325626163;
					arg0.anInt40 += -68984181;
					arg0.anInt33 = local491 * -1461770633;
					method82(arg0);
					if (arg0.anInt40 * -945785565 == arg0.anInt33 * 1688900423 + 1 && arg0.anInt36 * 1735960507 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aad", name = "a", descriptor = "(Lclient!aak;)V")
	static void method101(@OriginalArg(0) Class13 arg0) {
		arg0.anInt41 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray2[local4]) {
				arg0.aByteArray9[arg0.anInt41 * -1232818527] = (byte) local4;
				arg0.anInt41 += -889014943;
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "q", descriptor = "(Lclient!aak;)B")
	static byte method102(@OriginalArg(0) Class13 arg0) {
		return (byte) method86(1, arg0);
	}

	@OriginalMember(owner = "client!aad", name = "g", descriptor = "(Lclient!aak;)V")
	static void method103(@OriginalArg(0) Class13 arg0) {
		arg0.anInt41 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray2[local4]) {
				arg0.aByteArray9[arg0.anInt41 * -1232818527] = (byte) local4;
				arg0.anInt41 += -889014943;
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "h", descriptor = "(Lclient!aak;)V")
	static void method104(@OriginalArg(0) Class13 arg0) {
		arg0.anInt41 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray2[local4]) {
				arg0.aByteArray9[arg0.anInt41 * -1232818527] = (byte) local4;
				arg0.anInt41 += -889014943;
			}
		}
	}

	@OriginalMember(owner = "client!aad", name = "j", descriptor = "([I[I[I[BIII)V")
	static void method105(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!aad", name = "<init>", descriptor = "()V")
	Class6() throws Throwable {
		throw new Error();
	}
}
