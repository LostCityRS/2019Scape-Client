package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!if")
public final class Class336 {

	@OriginalMember(owner = "client!if", name = "ob", descriptor = "J")
	public static long aLong369;

	@OriginalMember(owner = "client!if", name = "t", descriptor = "[I")
	int[] anIntArray419;

	@OriginalMember(owner = "client!if", name = "f", descriptor = "[B")
	byte[] aByteArray85;

	@OriginalMember(owner = "client!if", name = "e", descriptor = "[I")
	int[] anIntArray418;

	@OriginalMember(owner = "client!if", name = "apo", descriptor = "(Lclient!yp;B)V")
	static void method27866(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class165_Sub40.method16786(-1819717071).getId();
	}

	@OriginalMember(owner = "client!if", name = "aso", descriptor = "(Lclient!yp;I)V")
	static void method27867(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub27_5, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 120);
		Class719.method37291(1985461495);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!if", name = "bbu", descriptor = "(Lclient!yp;I)V")
	static void method27868(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class120_Sub1_Sub1_Sub1_Sub1 local16 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0.aClass120_Sub1_Sub1_Sub1_4;
		@Pc(21) int local21 = local16.method18797(local12, 1923908676);
		@Pc(26) int local26 = local16.method18798(local12, -493493249);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local21;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local26;
	}

	@OriginalMember(owner = "client!if", name = "arj", descriptor = "(Lclient!yp;I)V")
	static void method27869(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class266.method26657(false, (short) 31267);
	}

	@OriginalMember(owner = "client!if", name = "o", descriptor = "(Lclient!aqb;S)I")
	static int method27870(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) short arg1) {
		@Pc(2) Class335 local2 = arg0.aClass335_1;
		if (local2.anIntArray416 != null) {
			local2 = local2.method27836(Class672.aClass134_1, Class672.aClass134_1, -206434074);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt4219 * 1287228757;
		@Pc(25) Class621 local25 = arg0.method18952((byte) 53);
		@Pc(30) int local30 = arg0.aClass6_Sub3_3.method23582(587187324);
		if (local30 == -1 || arg0.aClass6_Sub3_3.aBoolean429) {
			local21 = local2.anInt4217 * -382373013;
		} else if (local30 == local25.anInt5445 * 228988343 || local25.anInt5437 * -457826299 == local30 || local30 == local25.anInt5448 * 1960834245 || local25.anInt5458 * 929486699 == local30) {
			local21 = local2.anInt4198 * 369245;
		} else if (local30 == local25.anInt5449 * -1435917229 || local30 == local25.anInt5450 * -1567148933 || local30 == local25.anInt5463 * 1578952449 || local30 == local25.anInt5446 * -1532002241) {
			local21 = local2.anInt4218 * 1096491705;
		}
		return local21;
	}

	@OriginalMember(owner = "client!if", name = "<init>", descriptor = "([B)V")
	public Class336(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.anIntArray419 = new int[local4];
		this.aByteArray85 = arg0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray418 = new int[8];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(29) byte local29 = arg0[local22];
			if (local29 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local29;
				@Pc(42) int local42 = local14[local29];
				this.anIntArray419[local22] = local42;
				@Pc(58) int local58;
				@Pc(67) int local67;
				@Pc(74) int local74;
				@Pc(83) int local83;
				if ((local42 & local38) == 0) {
					local58 = local42 | local38;
					for (local67 = local29 - 1; local67 >= 1; local67--) {
						local74 = local14[local67];
						if (local42 != local74) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local74 & local83) != 0) {
							local14[local67] = local14[local67 - 1];
							break;
						}
						local14[local67] = local74 | local83;
					}
				} else {
					local58 = local14[local29 - 1];
				}
				local14[local29] = local58;
				for (local67 = local29 + 1; local67 <= 32; local67++) {
					if (local14[local67] == local42) {
						local14[local67] = local58;
					}
				}
				local67 = 0;
				for (local74 = 0; local74 < local29; local74++) {
					local83 = Integer.MIN_VALUE >>> local74;
					if ((local42 & local83) == 0) {
						local67++;
					} else {
						if (this.anIntArray418[local67] == 0) {
							this.anIntArray418[local67] = local20;
						}
						local67 = this.anIntArray418[local67];
					}
					if (local67 >= this.anIntArray418.length) {
						@Pc(171) int[] local171 = new int[this.anIntArray418.length * 2];
						for (@Pc(173) int local173 = 0; local173 < this.anIntArray418.length; local173++) {
							local171[local173] = this.anIntArray418[local173];
						}
						this.anIntArray418 = local171;
					}
					local83 >>>= 0x1;
				}
				this.anIntArray418[local67] = ~local22;
				if (local67 >= local20) {
					local20 = local67 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!if", name = "u", descriptor = "([BI[BII)I")
	int method27859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray418[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local127;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local192;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!if", name = "f", descriptor = "([BI[BIIB)I")
	int method27860(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray418[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local127;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local192;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!if", name = "e", descriptor = "([BII[BI)I")
	int method27861(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray419[local18];
			@Pc(28) byte local28 = this.aByteArray85[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(46) int local46 = local5 >> 3;
			@Pc(50) int local50 = local5 & 0x7;
			local1 &= -local50 >> 31;
			@Pc(67) int local67 = local46 + (local28 + local50 - 1 >> 3);
			@Pc(68) int local68 = local50 + 24;
			arg3[local46] = (byte) (local1 |= local23 >>> local68);
			if (local46 < local67) {
				local46++;
				local50 = local68 - 8;
				arg3[local46] = (byte) (local1 = local23 >>> local50);
				if (local46 < local67) {
					local46++;
					local50 -= 8;
					arg3[local46] = (byte) (local1 = local23 >>> local50);
					if (local46 < local67) {
						local46++;
						local50 -= 8;
						arg3[local46] = (byte) (local1 = local23 >>> local50);
						if (local46 < local67) {
							local46++;
							local50 -= 8;
							arg3[local46] = (byte) (local1 = local23 << -local50);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!if", name = "t", descriptor = "([BII[BII)I")
	int method27862(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg4 << 3;
		@Pc(9) int local9 = arg2 + arg1;
		while (arg1 < local9) {
			@Pc(18) int local18 = arg0[arg1] & 0xFF;
			@Pc(23) int local23 = this.anIntArray419[local18];
			@Pc(28) byte local28 = this.aByteArray85[local18];
			if (local28 == 0) {
				throw new RuntimeException("" + local18);
			}
			@Pc(46) int local46 = local5 >> 3;
			@Pc(50) int local50 = local5 & 0x7;
			local1 &= -local50 >> 31;
			@Pc(67) int local67 = local46 + (local28 + local50 - 1 >> 3);
			@Pc(68) int local68 = local50 + 24;
			arg3[local46] = (byte) (local1 |= local23 >>> local68);
			if (local46 < local67) {
				local46++;
				local50 = local68 - 8;
				arg3[local46] = (byte) (local1 = local23 >>> local50);
				if (local46 < local67) {
					local46++;
					local50 -= 8;
					arg3[local46] = (byte) (local1 = local23 >>> local50);
					if (local46 < local67) {
						local46++;
						local50 -= 8;
						arg3[local46] = (byte) (local1 = local23 >>> local50);
						if (local46 < local67) {
							local46++;
							local50 -= 8;
							arg3[local46] = (byte) (local1 = local23 << -local50);
						}
					}
				}
			}
			local5 += local28;
			arg1++;
		}
		return (local5 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!if", name = "l", descriptor = "([BI[BII)I")
	int method27863(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray418[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local127;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local192;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!if", name = "g", descriptor = "([BI[BII)I")
	int method27864(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray418[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local127;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local192;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}

	@OriginalMember(owner = "client!if", name = "i", descriptor = "([BI[BII)I")
	int method27865(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(12) int local12 = arg1;
		while (true) {
			@Pc(16) byte local16 = arg0[local12];
			if (local16 < 0) {
				local6 = this.anIntArray418[local6];
			} else {
				local6++;
			}
			@Pc(31) int local31;
			if ((local31 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local31;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x40) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(63) int local63;
			if ((local63 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local63;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x20) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local95;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x10) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local127;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x8) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local160;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x4) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local192;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x2) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local225;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			if ((local16 & 0x1) == 0) {
				local6++;
			} else {
				local6 = this.anIntArray418[local6];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray418[local6]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local10) {
					break;
				}
				local6 = 0;
			}
			local12++;
		}
		return local12 + 1 - arg1;
	}
}
