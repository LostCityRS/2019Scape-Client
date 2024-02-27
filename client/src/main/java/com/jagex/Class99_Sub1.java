package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aee")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!aee", name = "am", descriptor = "Z")
	static final boolean aBoolean49 = true;

	@OriginalMember(owner = "client!aee", name = "l", descriptor = "I")
	static final int anInt343 = -1694498816;

	@OriginalMember(owner = "client!aee", name = "u", descriptor = "I")
	static final int anInt344 = 1;

	@OriginalMember(owner = "client!aee", name = "z", descriptor = "I")
	static final int anInt345 = 2;

	@OriginalMember(owner = "client!aee", name = "ad", descriptor = "Z")
	static final boolean aBoolean50 = true;

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "I")
	static final int anInt347 = 64;

	@OriginalMember(owner = "client!aee", name = "au", descriptor = "Z")
	static final boolean aBoolean51 = false;

	@OriginalMember(owner = "client!aee", name = "p", descriptor = "I")
	static final int anInt348 = 4;

	@OriginalMember(owner = "client!aee", name = "j", descriptor = "F")
	float aFloat7;

	@OriginalMember(owner = "client!aee", name = "ai", descriptor = "F")
	float aFloat8;

	@OriginalMember(owner = "client!aee", name = "r", descriptor = "[[Lclient!bx;")
	Class198[][] aClass198ArrayArray1;

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "[[Lclient!bh;")
	Class185[][] aClass185ArrayArray1;

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "[[Lclient!bi;")
	Class186[][] aClass186ArrayArray1;

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "F")
	float aFloat9;

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "F")
	float aFloat10;

	@OriginalMember(owner = "client!aee", name = "b", descriptor = "F")
	float aFloat11;

	@OriginalMember(owner = "client!aee", name = "a", descriptor = "F")
	float aFloat12;

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "F")
	float aFloat13;

	@OriginalMember(owner = "client!aee", name = "i", descriptor = "F")
	float aFloat14;

	@OriginalMember(owner = "client!aee", name = "o", descriptor = "[[Lclient!bk;")
	Class188[][] aClass188ArrayArray1;

	@OriginalMember(owner = "client!aee", name = "ae", descriptor = "F")
	float aFloat15;

	@OriginalMember(owner = "client!aee", name = "ag", descriptor = "F")
	float aFloat16;

	@OriginalMember(owner = "client!aee", name = "ah", descriptor = "F")
	float aFloat17;

	@OriginalMember(owner = "client!aee", name = "al", descriptor = "F")
	float aFloat18;

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "[[Lclient!an;")
	Class167[][] aClass167ArrayArray1;

	@OriginalMember(owner = "client!aee", name = "aw", descriptor = "F")
	float aFloat19;

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "F")
	float aFloat20;

	@OriginalMember(owner = "client!aee", name = "ac", descriptor = "F")
	float aFloat21;

	@OriginalMember(owner = "client!aee", name = "h", descriptor = "F")
	float aFloat22;

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "Lclient!afg;")
	final Class104_Sub3 aClass104_Sub3_1;

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "I")
	final int anInt346;

	@OriginalMember(owner = "client!aee", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!aee", name = "at", descriptor = "[[B")
	byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!aee", name = "av", descriptor = "(II)I")
	static int method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aee", name = "ak", descriptor = "(II)I")
	static int method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aee", name = "an", descriptor = "(II)I")
	static int method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aee", name = "bf", descriptor = "(II)I")
	static int method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!afg;IIII[[I[[II)V")
	Class99_Sub1(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass104_Sub3_1 = arg0;
		this.anInt346 = arg2;
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		@Pc(28) int local28 = this.aClass104_Sub3_1.anInt728 * 1476827191 >> 9;
		for (@Pc(30) int local30 = 1; local30 < arg4; local30++) {
			for (@Pc(35) int local35 = 1; local35 < arg3; local35++) {
				@Pc(56) int local56 = arg6[local35 + 1][local30] - arg6[local35 - 1][local30];
				@Pc(72) int local72 = arg6[local35][local30 + 1] - arg6[local35][local30 - 1];
				@Pc(87) int local87 = (int) Math.sqrt((double) (local56 * local56 + arg7 * 512 + local72 * local72));
				@Pc(93) int local93 = (local56 << 8) / local87;
				@Pc(99) int local99 = arg7 * -512 / local87;
				@Pc(105) int local105 = (local72 << 8) / local87;
				@Pc(133) int local133 = local28 + (this.aClass104_Sub3_1.anInt733 * 1242558849 * local93 + this.aClass104_Sub3_1.anInt725 * -987403587 * local99 + this.aClass104_Sub3_1.anInt726 * 422764203 * local105 >> 17);
				local133 >>= 0x1;
				if (local133 < 2) {
					local133 = 2;
				} else if (local133 > 126) {
					local133 = 126;
				}
				this.aByteArrayArray4[local35][local30] = (byte) local133;
			}
		}
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!aee", name = "r", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2496(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aee", name = "e", descriptor = "(III)V")
	@Override
	public void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray5[local9][local21] < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aee", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass198ArrayArray1 == null) {
			this.aClass198ArrayArray1 = new Class198[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass167ArrayArray1 = new Class167[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt412 * -1678286317 || local83 != 0 && local83 != this.anInt412 * -1678286317) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class167 local110 = new Class167();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort101 = local114;
			local110.aShortArray56 = new short[local114];
			local110.aShortArray57 = new short[local114];
			local110.aShortArray60 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray56[local139] = (short) (local315 * (this.anInt412 * -1678286317 - local150) + local364 * local150 >> this.anInt415 * -746605410);
				}
				local315 = (arg0 << this.anInt415 * -373302705) + local146;
				local364 = (arg1 << this.anInt415 * -373302705) + local150;
				local110.aShortArray57[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray60[local139] = (short) (this.method2480(local315, local364, 780852468) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray56[local139] < 2) {
					local110.aShortArray56[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class235 local482 = this.aClass104_Sub3_1.aClass225_6.method25690(local315, -142450753);
					if (!local482.aBoolean660) {
						local449 = true;
						if (this.method1984(local482.aByte114) || local482.aFloat278 != 0.0F || local482.aFloat279 != 0.0F) {
							local110.aByte57 = (byte) (local110.aByte57 | 0x4);
						}
					}
				}
			}
			local110.anIntArray200 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray201 = new int[local146];
			}
			local110.aShortArray54 = new short[local146];
			local110.aShortArray58 = new short[local146];
			local110.aShortArray59 = new short[local146];
			if (local449) {
				local110.aShortArray53 = new short[local146];
				local110.aShortArray52 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray200[local110.aShort100] = Class366.method28128(arg9[local150], 1933776964);
					} else {
						local110.anIntArray200[local110.aShort100] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray201[local110.aShort100] = -1;
						} else {
							local110.anIntArray201[local110.aShort100] = Class366.method28128(arg10[local150], 232716537);
						}
					}
					local110.aShortArray54[local110.aShort100] = (short) arg6[local150];
					local110.aShortArray58[local110.aShort100] = (short) arg7[local150];
					local110.aShortArray59[local110.aShort100] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(arg11[local150], 1944673727).aBoolean660) {
							local110.aShortArray53[local110.aShort100] = -1;
						} else {
							local110.aShortArray53[local110.aShort100] = (short) arg11[local150];
							local110.aShortArray52[local110.aShort100] = (short) arg12[local150];
						}
					}
					local110.aShort100++;
				}
			}
			this.aClass167ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class198 local704 = new Class198();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3370 = Class487.method29996(Class366.method28128(arg10[0], -693770101), this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) -60);
				if (local77 == -1) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte108 = (byte) (local704.aByte108 | 0x1);
			}
			@Pc(802) Class235 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass104_Sub3_1.aClass225_6.method25690(local83, 519235056);
			}
			if (local802 == null || (local704.aByte108 & 0x2) != 0 || local802.aBoolean660) {
				@Pc(933) short local933 = Class366.method28128(local77, 1273144584);
				local704.aShort148 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) -47);
				local704.aShort145 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1], (byte) -88);
				local704.aShort146 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1], (byte) -15);
				local704.aShort147 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1], (byte) 21);
				local704.aShort144 = -1;
			} else {
				local704.aShort148 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local704.aShort145 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local704.aShort146 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local704.aShort147 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local704.aShort144 = (short) local83;
				if (this.method1984(local802.aByte114) || local802.aFloat278 != 0.0F || local802.aFloat279 != 0.0F) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x4);
				}
			}
			this.aClass198ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt346 & 0x20) == 0;
		if (this.aClass188ArrayArray1 == null && !local8) {
			this.aClass188ArrayArray1 = new Class188[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass185ArrayArray1 = new Class185[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass186ArrayArray1 == null && local8) {
			this.aClass186ArrayArray1 = new Class186[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass198ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class685.anIntArray524[Class366.method28128(arg6[local68], -1445985444) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class685.anIntArray524[Class366.method28128(arg7[local68], -1207720178) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(230) int local230;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class186 local142 = new Class186();
			local142.aShort134 = (short) arg2.length;
			local142.aShort133 = (short) (arg2.length / 3);
			local142.aShortArray78 = new short[local142.aShort134];
			local142.aShortArray80 = new short[local142.aShort134];
			local142.aShortArray81 = new short[local142.aShort134];
			local142.anIntArray296 = new int[local142.aShort134];
			local142.aShortArray82 = new short[local142.aShort134];
			local142.aShortArray77 = new short[local142.aShort134];
			local142.aByteArray65 = new byte[local142.aShort134];
			if (arg5 != null) {
				local142.aShortArray79 = new short[local142.aShort134];
			}
			for (local198 = 0; local198 < local142.aShort134; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt412 * -1678286317) {
					local230 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
				} else if (local206 == this.anInt412 * -1678286317 && local210 == this.anInt412 * -1678286317) {
					local230 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt412 * -1678286317 && local210 == 0) {
					local230 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local206) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local206) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt412 * -1678286317 - local210) + local410 * local210 >> this.anInt415 * -746605410;
				}
				local361 = (arg0 << this.anInt415 * -373302705) + local206;
				local410 = (arg1 << this.anInt415 * -373302705) + local210;
				local142.aShortArray78[local198] = (short) local206;
				local142.aShortArray81[local198] = (short) local210;
				local142.aShortArray80[local198] = (short) (this.method2480(local361, local410, 1072288958) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray296[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray79[local198] = (short) arg5[local198];
						if (arg10.anInt3856 * -2052057497 != 0) {
							local500 = local512 * 255 / (arg10.anInt3856 * -2052057497);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class235 local552 = this.aClass104_Sub3_1.aClass225_6.method25690(arg8[local198], -1770565272);
						if (local552.aBoolean656 && this.method1984(local552.aByte114)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray296[local198] = local538 | Class260.method26247(method1979(arg6[local198] >> 8, local230), arg10.anInt3858 * -1393096381, local500, 445606420);
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				}
				local142.aShortArray82[local198] = (short) arg8[local198];
				local142.aShortArray77[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray297 = new int[local142.aShort133];
				for (local198 = 0; local198 < local142.aShort133; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray297[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass186ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(652) boolean local652 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local652 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt412 * -1678286317 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt412 * -1678286317 && arg4[local361] == this.anInt412 * -1678286317) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt412 * -1678286317) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local652 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local652 = false;
			}
			if (local652) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local652 = false;
							break;
						}
					}
				}
				if (local652) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt412 * -1678286317 && arg2[local361] != arg2[0] - this.anInt412 * -1678286317) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt412 * -1678286317 && arg4[local361] != arg4[0] - this.anInt412 * -1678286317) {
							local652 = false;
							break;
						}
					}
				}
			}
		} else {
			local652 = false;
		}
		if (!local652) {
			@Pc(1753) Class185 local1753 = new Class185();
			local1753.aShort132 = (short) arg2.length;
			local1753.aShort131 = (short) (arg2.length / 3);
			local1753.aShortArray73 = new short[local1753.aShort132];
			local1753.aShortArray71 = new short[local1753.aShort132];
			local1753.aShortArray72 = new short[local1753.aShort132];
			local1753.anIntArray295 = new int[local1753.aShort132];
			if (arg5 != null) {
				local1753.aShortArray74 = new short[local1753.aShort132];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort132; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt412 * -1678286317) {
					local1826 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
				} else if (local500 == this.anInt412 * -1678286317 && local538 == this.anInt412 * -1678286317) {
					local1826 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt412 * -1678286317 && local538 == 0) {
					local1826 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local500) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local500) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt412 * -1678286317 - local538) + local2006 * local538 >> this.anInt415 * -746605410;
				}
				local1957 = (arg0 << this.anInt415 * -373302705) + local500;
				local2006 = (arg1 << this.anInt415 * -373302705) + local538;
				local1753.aShortArray73[local410] = (short) local500;
				local1753.aShortArray72[local410] = (short) local538;
				local1753.aShortArray71[local410] = (short) (this.method2480(local1957, local2006, 1786206497) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray74[local410] = (short) arg5[local410];
						if (arg10.anInt3856 * -2052057497 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3856 * -2052057497);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray295[local410] = Class260.method26247(method1979(arg6[local410] >> 8, local1826), arg10.anInt3858 * -1393096381, local2098, 445606420);
					if (arg7 != null) {
						local1753.anIntArray295[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray295[local410] = 0;
				} else {
					local1753.anIntArray295[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort131; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(arg8[local500 * 3], 2108869577).aBoolean660) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray294 = new int[local1753.aShort131];
			}
			if (local2168) {
				local1753.aShortArray76 = new short[local1753.aShort131];
				local1753.aShortArray75 = new short[local1753.aShort131];
			}
			for (local500 = 0; local500 < local1753.aShort131; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray294[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, -2144547443).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 483128197).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 1995952456).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray76[local500] = (short) local2259;
						local1753.aShortArray75[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 36149114).aBoolean660) {
								local1753.anIntArray295[local538] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, -1199414341).aShort162 & 0xFFFF, 737251621) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 1898928760).aBoolean660) {
								local1753.anIntArray295[local1826] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 421689157).aShort162 & 0xFFFF, -1331892356) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, -240033453).aBoolean660) {
								local1753.anIntArray295[local1957] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, -606381391).aShort162 & 0xFFFF, 2029100092) & 0xFFFF];
							}
						}
						local1753.aShortArray76[local500] = -1;
					}
				}
			}
			this.aClass185ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class188 local900 = new Class188();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3339 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte103 = (byte) (local900.aByte103 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local900.aByte103 = (byte) (local900.aByte103 | 0x1);
		}
		if (local500 == -1 || (local900.aByte103 & 0x2) != 0 || this.aClass104_Sub3_1.aClass225_6.method25690(local500, 1567473157).aBoolean660) {
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class260.method26247(method1979(arg6[local198] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3340 = Class260.method26247(method1979(arg6[local206] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3340 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3341 = Class260.method26247(method1979(arg6[local210] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3341 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class260.method26247(method1979(arg6[local230] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) << 25;
			}
			local900.aShort139 = -1;
		} else {
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class260.method26247(method1979(arg6[local198] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3340 = Class260.method26247(method1979(arg6[local206] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3340 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3341 = Class260.method26247(method1979(arg6[local210] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3341 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class260.method26247(method1979(arg6[local230] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			local900.aShort139 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort138 = (short) arg5[local210];
			local900.aShort135 = (short) arg5[local230];
			local900.aShort137 = (short) arg5[local206];
			local900.aShort136 = (short) arg5[local198];
		}
		this.aClass188ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aee", name = "k", descriptor = "()V")
	@Override
	public void method2508() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray5 = null;
	}

	@OriginalMember(owner = "client!aee", name = "f", descriptor = "(III[[ZZI)V")
	@Override
	public void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass104_Sub3_1.anIntArray46 == null || this.aClass104_Sub3_1.aFloatArray20 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub3_1.aClass489_29;
		this.aFloat9 = local16.aFloatArray116[0];
		this.aFloat10 = local16.aFloatArray116[1];
		this.aFloat11 = local16.aFloatArray116[2];
		this.aFloat22 = local16.aFloatArray116[3];
		this.aFloat12 = local16.aFloatArray116[4];
		this.aFloat13 = local16.aFloatArray116[5];
		this.aFloat14 = local16.aFloatArray116[6];
		this.aFloat7 = local16.aFloatArray116[7];
		this.aFloat20 = local16.aFloatArray116[8];
		this.aFloat15 = local16.aFloatArray116[9];
		this.aFloat16 = local16.aFloatArray116[10];
		this.aFloat17 = local16.aFloatArray116[11];
		this.aFloat18 = local16.aFloatArray116[12];
		this.aFloat21 = local16.aFloatArray116[13];
		this.aFloat8 = local16.aFloatArray116[14];
		this.aFloat19 = local16.aFloatArray116[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt414 * -1667858293 && local145 >= 0 && local145 < this.anInt413 * -143202029) {
						this.method1980(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "ao", descriptor = "(III)V")
	void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class176 local4 = this.aClass104_Sub3_1.method5716(Thread.currentThread());
		local4.aClass181_2.anInt3315 = 0;
		if (this.aClass188ArrayArray1 != null) {
			this.method1993(arg0, arg1, local4.aBoolean569, local4, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		} else if (this.aClass198ArrayArray1 != null) {
			this.method1981(arg0, arg1, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method1982(arg0, arg1, local4.aBoolean569, local4, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		}
	}

	@OriginalMember(owner = "client!aee", name = "aj", descriptor = "(IILclient!bd;[F[F[F[F[FI)V")
	void method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class198 local6 = this.aClass198ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class167 local1347 = this.aClass167ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte57 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort101; local1368++) {
					local45 = local1347.aShortArray57[local1368] + (arg0 << this.anInt415 * -373302705);
					@Pc(1389) short local1389 = local1347.aShortArray60[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt415 * -373302705);
					local410 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local1389 + this.aFloat16 * (float) local59;
					local474 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local1389 + this.aFloat17 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local1389 + this.aFloat20 * (float) local59;
					local346 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local1389 + this.aFloat15 * (float) local59;
					arg3[local1368] = arg2.aFloat245 + arg2.aFloat250 * local282 / local474;
					arg4[local1368] = arg2.aFloat246 + arg2.aFloat247 * local346 / local474;
					arg5[local1368] = arg2.aFloat249 + arg2.aFloat244 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray53 == null) {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray200[local1368];
							if (local1924 != -1) {
								arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
								arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1924, local1347.aShortArray56[local1547], (byte) -93), (float) Class487.method29996(local1924, local1347.aShortArray56[local1552], (byte) 8), (float) Class487.method29996(local1924, local1347.aShortArray56[local1557], (byte) -13));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray53[local1368] != -1) {
								@Pc(1654) Class235 local1654 = this.aClass104_Sub3_1.aClass225_6.method25690(local1347.aShortArray53[local1368] & 0xFFFF, 868695117);
								local1636 = local1654.aBoolean656;
							}
							if (local1636) {
								arg2.method24544(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray57[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1557] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1557] / (float) (this.anInt412 * -1678286317), Class685.anIntArray524[local1347.aShortArray56[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray53[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray200[local1368];
								if (local1806 != -1) {
									arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1806, local1347.aShortArray56[local1547], (byte) -35), (float) Class487.method29996(local1806, local1347.aShortArray56[local1552], (byte) -65), (float) Class487.method29996(local1806, local1347.aShortArray56[local1557], (byte) -23));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			@Pc(52) int local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local71 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local71 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local528 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local528 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local539 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local539 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local548 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local548 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local71 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local71 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local528 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local528 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local539 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local539 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local548 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local548 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat14 * (float) local71;
				@Pc(83) float local83 = this.aFloat7 * (float) local71;
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat12 * (float) local71;
				@Pc(255) float local255 = this.aFloat13 * (float) local71;
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort144 != -1) {
				@Pc(1044) Class235 local1044 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort144 & 0xFFFF, 1457287042);
				local1030 = local1044.aBoolean656;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean572 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class685.anIntArray524[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean572 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class685.anIntArray524[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "ab", descriptor = "(IIZLclient!az;Lclient!bd;[F[F[F[F[FI)V")
	void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort134; local17++) {
			@Pc(33) int local33 = local6.aShortArray78[local17] + (arg0 << this.anInt415 * -373302705);
			@Pc(38) int local38 = local6.aShortArray80[local17];
			@Pc(50) int local50 = local6.aShortArray81[local17] + (arg1 << this.anInt415 * -373302705);
			@Pc(71) float local71 = this.aFloat8 + this.aFloat11 * (float) local33 + this.aFloat14 * (float) local38 + this.aFloat16 * (float) local50;
			@Pc(92) float local92 = this.aFloat19 + this.aFloat22 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat17 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat243;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat240;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray79[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean567) {
				local109 = local71 - arg3.aFloat243;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat240;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat18 + this.aFloat9 * (float) local33 + this.aFloat12 * (float) local38 + this.aFloat20 * (float) local50;
			@Pc(215) float local215 = this.aFloat21 + this.aFloat10 * (float) local33 + this.aFloat13 * (float) local38 + this.aFloat15 * (float) local50;
			arg5[local17] = arg4.aFloat245 + arg4.aFloat250 * local194 / local92;
			arg6[local17] = arg4.aFloat246 + arg4.aFloat247 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat244 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt412 * -1678286317);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort133; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean572 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3318 || local289 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt415 * -373302705;
					@Pc(386) int local386 = arg1 << this.anInt415 * -373302705;
					if ((local6.anIntArray296[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray82[local137] == -1 || local6.aShortArray82[local277] == -1 || local6.aShortArray82[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24541(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class125_Sub2_Sub1.method21481(local6.anIntArray296[local137], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, 1329960234), Class125_Sub2_Sub1.method21481(local6.anIntArray296[local277], arg3.anInt3310 * 1032506167, arg9[local277] * 255.0F, 1423810262), Class125_Sub2_Sub1.method21481(local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local281] * 255.0F, 1633274722));
							} else {
								arg4.method24541(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281]);
							}
						} else if (local6.aShortArray82[local137] == local6.aShortArray82[local277] && local6.aShortArray82[local137] == local6.aShortArray82[local281] && local6.aShortArray77[local137] == local6.aShortArray77[local277] && local6.aShortArray77[local137] == local6.aShortArray77[local281]) {
							arg4.method24544(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray78[local137]) / (float) local6.aShortArray77[local137], (float) (local379 + local6.aShortArray78[local277]) / (float) local6.aShortArray77[local277], (float) (local379 + local6.aShortArray78[local281]) / (float) local6.aShortArray77[local281], (float) (local386 + local6.aShortArray81[local137]) / (float) local6.aShortArray77[local137], (float) (local386 + local6.aShortArray81[local277]) / (float) local6.aShortArray77[local277], (float) (local386 + local6.aShortArray81[local281]) / (float) local6.aShortArray77[local281], local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray82[local137] & 0xFFFF);
						} else {
							arg4.method24553(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray78[local137]) / local263, (float) (local379 + local6.aShortArray78[local277]) / local263, (float) (local379 + local6.aShortArray78[local281]) / local263, (float) (local386 + local6.aShortArray81[local137]) / local263, (float) (local386 + local6.aShortArray81[local277]) / local263, (float) (local386 + local6.aShortArray81[local281]) / local263, local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray82[local137] & 0xFFFF, local263 / (float) local6.aShortArray77[local137], local6.aShortArray82[local277] & 0xFFFF, local263 / (float) local6.aShortArray77[local277], local6.aShortArray82[local281] & 0xFFFF, local263 / (float) local6.aShortArray77[local281]);
						}
					}
				} else {
					arg4.method24543(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3310 * 1032506167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "o", descriptor = "(Lclient!akf;[I)V")
	@Override
	public void method2502(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class176 local4 = this.aClass104_Sub3_1.method5716(Thread.currentThread());
		@Pc(7) Class181 local7 = local4.aClass181_2;
		local7.anInt3315 = 0;
		local7.aBoolean572 = true;
		this.aClass104_Sub3_1.method5729();
		if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method1983(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		} else if (this.aClass198ArrayArray1 != null) {
			this.method1989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		}
	}

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "(III)V")
	@Override
	public void method2505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray5[local9][local21] < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aee", name = "af", descriptor = "(IIIIIII[[ZLclient!az;Lclient!bd;[F[F)V")
	void method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class176 arg8, @OriginalArg(9) Class181 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean568;
		this.aClass104_Sub3_1.method20530(false);
		arg9.aBoolean571 = false;
		arg9.aBoolean576 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass188ArrayArray1 == null) {
						if (this.aClass186ArrayArray1[local32][local37] != null) {
							@Pc(596) Class186 local596 = this.aClass186ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort134; local87++) {
								arg10[local87] = local26 + local596.aShortArray78[local87] * local11 / (this.anInt412 * -1678286317);
								arg11[local87] = local30 - local596.aShortArray81[local87] * local11 / (this.anInt412 * -1678286317);
							}
							for (local87 = 0; local87 < local596.aShort133; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray297 == null || local596.anIntArray297[local87] == 0) {
									arg9.method24541(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray296[local408], local596.anIntArray296[local412], local596.anIntArray296[local416]);
								} else {
									local465 = local596.anIntArray297[local87];
									arg9.method24541(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass188ArrayArray1[local32][local37] != null) {
						@Pc(67) Class188 local67 = this.aClass188ArrayArray1[local32][local37];
						if (local67.aShort139 != -1 && (local67.aByte103 & 0x2) == 0 && local67.anInt3339 == 0) {
							local87 = this.aClass104_Sub3_1.method5737(local67.aShort139 & 0xFFFF);
							arg9.method24539(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local87, local67.anInt3341, (byte) 23), (float) Class487.method29996(local87, local67.anInt3342, (byte) -18), (float) Class487.method29996(local87, local67.anInt3340, (byte) -4));
							arg9.method24539(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local87, local67.anInt3343, (byte) -62), (float) Class487.method29996(local87, local67.anInt3340, (byte) 9), (float) Class487.method29996(local87, local67.anInt3342, (byte) -20));
						} else if (local67.anInt3339 == 0) {
							arg9.method24541(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3341, local67.anInt3342, local67.anInt3340);
							arg9.method24541(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3343, local67.anInt3340, local67.anInt3342);
						} else {
							local87 = local67.anInt3339;
							arg9.method24541(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class412.method28849(local87, local67.anInt3341 & 0xFF000000, -1160465839), Class412.method28849(local87, local67.anInt3342 & 0xFF000000, 1401284931), Class412.method28849(local87, local67.anInt3340 & 0xFF000000, 753746341));
							arg9.method24541(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class412.method28849(local87, local67.anInt3343 & 0xFF000000, 562251566), Class412.method28849(local87, local67.anInt3340 & 0xFF000000, 171720682), Class412.method28849(local87, local67.anInt3342 & 0xFF000000, -987170784));
						}
					} else if (this.aClass185ArrayArray1[local32][local37] != null) {
						@Pc(356) Class185 local356 = this.aClass185ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort132; local87++) {
							arg10[local87] = local26 + local356.aShortArray73[local87] * local11 / (this.anInt412 * -1678286317);
							arg11[local87] = local30 - local356.aShortArray72[local87] * local11 / (this.anInt412 * -1678286317);
						}
						for (local87 = 0; local87 < local356.aShort131; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray294 != null && local356.anIntArray294[local87] != 0 && (local356.aShortArray76 == null || local356.aShortArray76 != null && local356.aShortArray76[local87] == -1)) {
								local465 = local356.anIntArray294[local87];
								arg9.method24541(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class412.method28849(local465, -16777216 - (local356.anIntArray295[local408] & -16777216), 844227028), Class412.method28849(local465, -16777216 - (local356.anIntArray295[local412] & -16777216), -1757307556), Class412.method28849(local465, -16777216 - (local356.anIntArray295[local416] & -16777216), -1206056512));
							} else if (local356.aShortArray76 == null || local356.aShortArray76[local87] == -1) {
								arg9.method24541(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray295[local408], local356.anIntArray295[local412], local356.anIntArray295[local416]);
							} else {
								local465 = this.aClass104_Sub3_1.method5737(local356.aShortArray76[local87] & 0xFFFF);
								arg9.method24539(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean571 = true;
		this.aClass104_Sub3_1.method20530(local14);
	}

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2485(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aee", name = "ag", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass198ArrayArray1 == null) {
			this.aClass198ArrayArray1 = new Class198[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass167ArrayArray1 = new Class167[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt412 * -1678286317 || local83 != 0 && local83 != this.anInt412 * -1678286317) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class167 local110 = new Class167();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort101 = local114;
			local110.aShortArray56 = new short[local114];
			local110.aShortArray57 = new short[local114];
			local110.aShortArray60 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray56[local139] = (short) (local315 * (this.anInt412 * -1678286317 - local150) + local364 * local150 >> this.anInt415 * -746605410);
				}
				local315 = (arg0 << this.anInt415 * -373302705) + local146;
				local364 = (arg1 << this.anInt415 * -373302705) + local150;
				local110.aShortArray57[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray60[local139] = (short) (this.method2480(local315, local364, 1934291555) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray56[local139] < 2) {
					local110.aShortArray56[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class235 local482 = this.aClass104_Sub3_1.aClass225_6.method25690(local315, -704925599);
					if (!local482.aBoolean660) {
						local449 = true;
						if (this.method1984(local482.aByte114) || local482.aFloat278 != 0.0F || local482.aFloat279 != 0.0F) {
							local110.aByte57 = (byte) (local110.aByte57 | 0x4);
						}
					}
				}
			}
			local110.anIntArray200 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray201 = new int[local146];
			}
			local110.aShortArray54 = new short[local146];
			local110.aShortArray58 = new short[local146];
			local110.aShortArray59 = new short[local146];
			if (local449) {
				local110.aShortArray53 = new short[local146];
				local110.aShortArray52 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray200[local110.aShort100] = Class366.method28128(arg9[local150], -1294605105);
					} else {
						local110.anIntArray200[local110.aShort100] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray201[local110.aShort100] = -1;
						} else {
							local110.anIntArray201[local110.aShort100] = Class366.method28128(arg10[local150], 2113095972);
						}
					}
					local110.aShortArray54[local110.aShort100] = (short) arg6[local150];
					local110.aShortArray58[local110.aShort100] = (short) arg7[local150];
					local110.aShortArray59[local110.aShort100] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(arg11[local150], 613778678).aBoolean660) {
							local110.aShortArray53[local110.aShort100] = -1;
						} else {
							local110.aShortArray53[local110.aShort100] = (short) arg11[local150];
							local110.aShortArray52[local110.aShort100] = (short) arg12[local150];
						}
					}
					local110.aShort100++;
				}
			}
			this.aClass167ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class198 local704 = new Class198();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3370 = Class487.method29996(Class366.method28128(arg10[0], 179180207), this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) 12);
				if (local77 == -1) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte108 = (byte) (local704.aByte108 | 0x1);
			}
			@Pc(802) Class235 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass104_Sub3_1.aClass225_6.method25690(local83, 267078584);
			}
			if (local802 == null || (local704.aByte108 & 0x2) != 0 || local802.aBoolean660) {
				@Pc(933) short local933 = Class366.method28128(local77, 573914763);
				local704.aShort148 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) -37);
				local704.aShort145 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1], (byte) 93);
				local704.aShort146 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1], (byte) -52);
				local704.aShort147 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1], (byte) 26);
				local704.aShort144 = -1;
			} else {
				local704.aShort148 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local704.aShort145 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local704.aShort146 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local704.aShort147 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local704.aShort144 = (short) local83;
				if (this.method1984(local802.aByte114) || local802.aFloat278 != 0.0F || local802.aFloat279 != 0.0F) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x4);
				}
			}
			this.aClass198ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aee", name = "i", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "()V")
	@Override
	public void method2492() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray5 = null;
	}

	@OriginalMember(owner = "client!aee", name = "az", descriptor = "(I)Z")
	boolean method1984(@OriginalArg(0) int arg0) {
		if ((this.anInt346 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "(III)V")
	@Override
	public void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray5[local9][local21] < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aee", name = "al", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass198ArrayArray1 == null) {
			this.aClass198ArrayArray1 = new Class198[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass167ArrayArray1 = new Class167[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt412 * -1678286317 || local83 != 0 && local83 != this.anInt412 * -1678286317) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class167 local110 = new Class167();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort101 = local114;
			local110.aShortArray56 = new short[local114];
			local110.aShortArray57 = new short[local114];
			local110.aShortArray60 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray56[local139] = (short) (local315 * (this.anInt412 * -1678286317 - local150) + local364 * local150 >> this.anInt415 * -746605410);
				}
				local315 = (arg0 << this.anInt415 * -373302705) + local146;
				local364 = (arg1 << this.anInt415 * -373302705) + local150;
				local110.aShortArray57[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray60[local139] = (short) (this.method2480(local315, local364, 425001167) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray56[local139] < 2) {
					local110.aShortArray56[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class235 local482 = this.aClass104_Sub3_1.aClass225_6.method25690(local315, -1033260955);
					if (!local482.aBoolean660) {
						local449 = true;
						if (this.method1984(local482.aByte114) || local482.aFloat278 != 0.0F || local482.aFloat279 != 0.0F) {
							local110.aByte57 = (byte) (local110.aByte57 | 0x4);
						}
					}
				}
			}
			local110.anIntArray200 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray201 = new int[local146];
			}
			local110.aShortArray54 = new short[local146];
			local110.aShortArray58 = new short[local146];
			local110.aShortArray59 = new short[local146];
			if (local449) {
				local110.aShortArray53 = new short[local146];
				local110.aShortArray52 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray200[local110.aShort100] = Class366.method28128(arg9[local150], -838232028);
					} else {
						local110.anIntArray200[local110.aShort100] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray201[local110.aShort100] = -1;
						} else {
							local110.anIntArray201[local110.aShort100] = Class366.method28128(arg10[local150], -442677227);
						}
					}
					local110.aShortArray54[local110.aShort100] = (short) arg6[local150];
					local110.aShortArray58[local110.aShort100] = (short) arg7[local150];
					local110.aShortArray59[local110.aShort100] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(arg11[local150], 1154756739).aBoolean660) {
							local110.aShortArray53[local110.aShort100] = -1;
						} else {
							local110.aShortArray53[local110.aShort100] = (short) arg11[local150];
							local110.aShortArray52[local110.aShort100] = (short) arg12[local150];
						}
					}
					local110.aShort100++;
				}
			}
			this.aClass167ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class198 local704 = new Class198();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3370 = Class487.method29996(Class366.method28128(arg10[0], -1306451499), this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) -86);
				if (local77 == -1) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte108 = (byte) (local704.aByte108 | 0x1);
			}
			@Pc(802) Class235 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass104_Sub3_1.aClass225_6.method25690(local83, -1592400511);
			}
			if (local802 == null || (local704.aByte108 & 0x2) != 0 || local802.aBoolean660) {
				@Pc(933) short local933 = Class366.method28128(local77, 365677639);
				local704.aShort148 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) 41);
				local704.aShort145 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1], (byte) -48);
				local704.aShort146 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1], (byte) -60);
				local704.aShort147 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1], (byte) -17);
				local704.aShort144 = -1;
			} else {
				local704.aShort148 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local704.aShort145 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local704.aShort146 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local704.aShort147 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local704.aShort144 = (short) local83;
				if (this.method1984(local802.aByte114) || local802.aFloat278 != 0.0F || local802.aFloat279 != 0.0F) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x4);
				}
			}
			this.aClass198ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aee", name = "bl", descriptor = "(III)V")
	void method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class176 local4 = this.aClass104_Sub3_1.method5716(Thread.currentThread());
		local4.aClass181_2.anInt3315 = 0;
		if (this.aClass188ArrayArray1 != null) {
			this.method1993(arg0, arg1, local4.aBoolean569, local4, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		} else if (this.aClass198ArrayArray1 != null) {
			this.method1981(arg0, arg1, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method1982(arg0, arg1, local4.aBoolean569, local4, local4.aClass181_2, local4.aFloatArray88, local4.aFloatArray80, local4.aFloatArray81, local4.aFloatArray90, local4.aFloatArray86, arg2);
		}
	}

	@OriginalMember(owner = "client!aee", name = "ae", descriptor = "(Lclient!akf;[I)V")
	@Override
	public void method2489(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aee", name = "bd", descriptor = "(IIZLclient!az;Lclient!bd;[F[F[F[F[FI)V")
	void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class188 local6 = this.aClass188ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2006) Class185 local2006 = this.aClass185ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte102 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort132; local2027++) {
					local45 = local2006.aShortArray73[local2027] + (arg0 << this.anInt415 * -373302705);
					local52 = local2006.aShortArray71[local2027];
					local59 = local2006.aShortArray72[local2027] + (arg1 << this.anInt415 * -373302705);
					local523 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local52 + this.aFloat16 * (float) local59;
					local577 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat17 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat244 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat243;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat240;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray74[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean567) {
						local550 = local523 - arg3.aFloat243;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat240;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local52 + this.aFloat20 * (float) local59;
					local469 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local52 + this.aFloat15 * (float) local59;
					arg5[local2027] = arg4.aFloat245 + arg4.aFloat250 * local415 / local577;
					arg6[local2027] = arg4.aFloat246 + arg4.aFloat247 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray76 == null) {
					for (local2027 = 0; local2027 < local2006.aShort131; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean572 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3318 || local283 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
							if (local567 >= 3.0F) {
								arg4.method24543(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3310 * 1032506167);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
									arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2282], arg3.anInt3310 * 1032506167, arg9[local2282] * 255.0F, 1574772216), Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2157], arg3.anInt3310 * 1032506167, arg9[local2157] * 255.0F, 1046889659), Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2290], arg3.anInt3310 * 1032506167, arg9[local2290] * 255.0F, 891014190));
								}
							} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
								arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray295[local2282], local2006.anIntArray295[local2157], local2006.anIntArray295[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort131; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean572 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3318 || local283 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
							@Pc(2381) Class235 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray76[local2027] != -1) {
								local2381 = this.aClass104_Sub3_1.aClass225_6.method25690(local2006.aShortArray76[local2027] & 0xFFFF, 729007276);
								local2383 = local2381.aBoolean656;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method1984(local2381.aByte114)) {
											local2416 = -1694498816;
										}
										arg4.method24544(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray73[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2290] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2290] / (float) (this.anInt412 * -1678286317), local2416 | local2006.anIntArray295[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2290] & 0xFFFFFF, arg3.anInt3310 * 1032506167, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray76[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
										arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class412.method28849(local2006.anIntArray295[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1535858147), Class412.method28849(local2006.anIntArray295[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1690524070), Class412.method28849(local2006.anIntArray295[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 1027244593));
										arg4.anInt3315 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method1984(local2381.aByte114)) {
										local2416 = -1694498816;
									}
									arg4.method24544(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray73[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2290] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2290] / (float) (this.anInt412 * -1678286317), local2416 | local2006.anIntArray295[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray76[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
									arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray295[local2282], local2006.anIntArray295[local2157], local2006.anIntArray295[local2290]);
									arg4.anInt3315 = 0;
								}
							} else {
								arg4.method24543(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3310 * 1032506167);
							}
						}
					}
				}
			}
		} else if ((local6.aByte103 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte103 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte103 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local81 + this.aFloat16 * (float) local52;
				local127 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat17 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local621 + this.aFloat16 * (float) local52;
				local167 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat17 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local632 + this.aFloat16 * (float) local59;
				local207 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat17 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local641 + this.aFloat16 * (float) local59;
				local247 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat17 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat244 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat244 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat244 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat244 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort136 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort137 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort138 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort135 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean567) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat240;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat240;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat240;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat240;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local81 + this.aFloat20 * (float) local52;
				local415 = arg4.aFloat245 + arg4.aFloat250 * local405 / local127;
				local432 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local81 + this.aFloat15 * (float) local52;
				local442 = arg4.aFloat246 + arg4.aFloat247 * local432 / local127;
				local459 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local621 + this.aFloat20 * (float) local52;
				local469 = arg4.aFloat245 + arg4.aFloat250 * local459 / local167;
				local486 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local621 + this.aFloat15 * (float) local52;
				local496 = arg4.aFloat246 + arg4.aFloat247 * local486 / local167;
				local513 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local632 + this.aFloat20 * (float) local59;
				local523 = arg4.aFloat245 + arg4.aFloat250 * local513 / local207;
				local540 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local632 + this.aFloat15 * (float) local59;
				local550 = arg4.aFloat246 + arg4.aFloat247 * local540 / local207;
				local567 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local641 + this.aFloat20 * (float) local59;
				local577 = arg4.aFloat245 + arg4.aFloat250 * local567 / local247;
				local594 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local641 + this.aFloat15 * (float) local59;
				local604 = arg4.aFloat246 + arg4.aFloat247 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat14 * (float) local81;
				@Pc(93) float local93 = this.aFloat7 * (float) local81;
				local110 = this.aFloat8 + this.aFloat11 * (float) local38 + local87 + this.aFloat16 * (float) local52;
				local127 = this.aFloat19 + this.aFloat22 * (float) local38 + local93 + this.aFloat17 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat8 + this.aFloat11 * (float) local45 + local87 + this.aFloat16 * (float) local52;
				local167 = this.aFloat19 + this.aFloat22 * (float) local45 + local93 + this.aFloat17 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat8 + this.aFloat11 * (float) local45 + local87 + this.aFloat16 * (float) local59;
				local207 = this.aFloat19 + this.aFloat22 * (float) local45 + local93 + this.aFloat17 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat8 + this.aFloat11 * (float) local38 + local87 + this.aFloat16 * (float) local59;
				local247 = this.aFloat19 + this.aFloat22 * (float) local38 + local93 + this.aFloat17 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat244 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat244 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat244 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat244 * local230 / local247;
				if (arg3.aBoolean567) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat240;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat240;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat240;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat240;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat12 * (float) local81;
				@Pc(388) float local388 = this.aFloat13 * (float) local81;
				local405 = this.aFloat18 + this.aFloat9 * (float) local38 + local382 + this.aFloat20 * (float) local52;
				local415 = arg4.aFloat245 + arg4.aFloat250 * local405 / local127;
				local432 = this.aFloat21 + this.aFloat10 * (float) local38 + local388 + this.aFloat15 * (float) local52;
				local442 = arg4.aFloat246 + arg4.aFloat247 * local432 / local127;
				local459 = this.aFloat18 + this.aFloat9 * (float) local45 + local382 + this.aFloat20 * (float) local52;
				local469 = arg4.aFloat245 + arg4.aFloat250 * local459 / local167;
				local486 = this.aFloat21 + this.aFloat10 * (float) local45 + local388 + this.aFloat15 * (float) local52;
				local496 = arg4.aFloat246 + arg4.aFloat247 * local486 / local167;
				local513 = this.aFloat18 + this.aFloat9 * (float) local45 + local382 + this.aFloat20 * (float) local59;
				local523 = arg4.aFloat245 + arg4.aFloat250 * local513 / local207;
				local540 = this.aFloat21 + this.aFloat10 * (float) local45 + local388 + this.aFloat15 * (float) local59;
				local550 = arg4.aFloat246 + arg4.aFloat247 * local540 / local207;
				local567 = this.aFloat18 + this.aFloat9 * (float) local38 + local382 + this.aFloat20 * (float) local59;
				local577 = arg4.aFloat245 + arg4.aFloat250 * local567 / local247;
				local594 = this.aFloat21 + this.aFloat10 * (float) local38 + local388 + this.aFloat15 * (float) local59;
				local604 = arg4.aFloat246 + arg4.aFloat247 * local594 / local247;
			}
			@Pc(1349) Class235 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort139 != -1) {
				local1349 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort139 & 0xFFFF, -802246298);
				local1351 = local1349.aBoolean656;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method1984(local1349.aByte114);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean572 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3318 || local577 > (float) arg4.anInt3318 || local469 > (float) arg4.anInt3318;
				if (local382 >= 3.0F) {
					arg4.method24543(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3310 * 1032506167);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24544(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3341 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, arg3.anInt3310 * 1032506167, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort139 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3315 = 100;
						}
						arg4.method24541(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class412.method28849(local6.anInt3341, (int) (local65 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1466585989), Class412.method28849(local6.anInt3342, (int) (local67 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1571563196), Class412.method28849(local6.anInt3340, (int) (local63 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1736522891));
						arg4.anInt3315 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24544(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3341 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort139 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3315 = 100;
					}
					arg4.method24541(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3341, local6.anInt3342, local6.anInt3340);
					arg4.anInt3315 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean572 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3318 || local469 > (float) arg4.anInt3318 || local577 > (float) arg4.anInt3318;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3315 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24544(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3310 * 1032506167, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort139 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3315 = 100;
							}
							arg4.method24541(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class412.method28849(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 1965673405), Class412.method28849(local6.anInt3340, (int) (local63 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 1671572914), Class412.method28849(local6.anInt3342, (int) (local67 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 1812130276));
							arg4.anInt3315 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24544(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort139 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3315 = 100;
						}
						arg4.method24541(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3340, local6.anInt3342);
						arg4.anInt3315 = 0;
					}
				} else {
					arg4.method24543(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3310 * 1032506167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "h", descriptor = "(III[[ZZI)V")
	@Override
	public void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass104_Sub3_1.anIntArray46 == null || this.aClass104_Sub3_1.aFloatArray20 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub3_1.aClass489_29;
		this.aFloat9 = local16.aFloatArray116[0];
		this.aFloat10 = local16.aFloatArray116[1];
		this.aFloat11 = local16.aFloatArray116[2];
		this.aFloat22 = local16.aFloatArray116[3];
		this.aFloat12 = local16.aFloatArray116[4];
		this.aFloat13 = local16.aFloatArray116[5];
		this.aFloat14 = local16.aFloatArray116[6];
		this.aFloat7 = local16.aFloatArray116[7];
		this.aFloat20 = local16.aFloatArray116[8];
		this.aFloat15 = local16.aFloatArray116[9];
		this.aFloat16 = local16.aFloatArray116[10];
		this.aFloat17 = local16.aFloatArray116[11];
		this.aFloat18 = local16.aFloatArray116[12];
		this.aFloat21 = local16.aFloatArray116[13];
		this.aFloat8 = local16.aFloatArray116[14];
		this.aFloat19 = local16.aFloatArray116[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt414 * -1667858293 && local145 >= 0 && local145 < this.anInt413 * -143202029) {
						this.method1980(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass104_Sub3_1.anIntArray46 == null || this.aClass104_Sub3_1.aFloatArray20 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub3_1.aClass489_29;
		this.aFloat9 = local16.aFloatArray116[0];
		this.aFloat10 = local16.aFloatArray116[1];
		this.aFloat11 = local16.aFloatArray116[2];
		this.aFloat22 = local16.aFloatArray116[3];
		this.aFloat12 = local16.aFloatArray116[4];
		this.aFloat13 = local16.aFloatArray116[5];
		this.aFloat14 = local16.aFloatArray116[6];
		this.aFloat7 = local16.aFloatArray116[7];
		this.aFloat20 = local16.aFloatArray116[8];
		this.aFloat15 = local16.aFloatArray116[9];
		this.aFloat16 = local16.aFloatArray116[10];
		this.aFloat17 = local16.aFloatArray116[11];
		this.aFloat18 = local16.aFloatArray116[12];
		this.aFloat21 = local16.aFloatArray116[13];
		this.aFloat8 = local16.aFloatArray116[14];
		this.aFloat19 = local16.aFloatArray116[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt414 * -1667858293 && local145 >= 0 && local145 < this.anInt413 * -143202029) {
						this.method1980(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "aa", descriptor = "(IIIIIII[[ZLclient!az;Lclient!bd;[F[F)V")
	void method1989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class176 arg8, @OriginalArg(9) Class181 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean568;
		this.aClass104_Sub3_1.method20530(false);
		arg9.aBoolean571 = false;
		arg9.aBoolean576 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass198ArrayArray1[local32][local37] != null) {
						@Pc(64) Class198 local64 = this.aClass198ArrayArray1[local32][local37];
						if (local64.aShort144 != -1 && (local64.aByte108 & 0x2) == 0 && local64.anInt3370 == -1) {
							local85 = this.aClass104_Sub3_1.method5737(local64.aShort144 & 0xFFFF);
							arg9.method24539(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local85, local64.aShort146 & 0xFFFF, (byte) 30), (float) Class487.method29996(local85, local64.aShort147 & 0xFFFF, (byte) -9), (float) Class487.method29996(local85, local64.aShort145 & 0xFFFF, (byte) 32));
							arg9.method24539(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local85, local64.aShort148 & 0xFFFF, (byte) 5), (float) Class487.method29996(local85, local64.aShort145 & 0xFFFF, (byte) -50), (float) Class487.method29996(local85, local64.aShort147 & 0xFFFF, (byte) 48));
						} else if (local64.anInt3370 == -1) {
							arg9.method24539(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort146 & 0xFFFF), (float) (local64.aShort147 & 0xFFFF), (float) (local64.aShort145 & 0xFFFF));
							arg9.method24539(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort148 & 0xFFFF), (float) (local64.aShort145 & 0xFFFF), (float) (local64.aShort147 & 0xFFFF));
						} else {
							local85 = local64.anInt3370;
							arg9.method24539(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24539(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass167ArrayArray1[local32][local37] != null) {
						@Pc(355) Class167 local355 = this.aClass167ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort101; local85++) {
							arg10[local85] = local26 + local355.aShortArray57[local85] * local11 / (this.anInt412 * -1678286317);
							arg11[local85] = local30 - local355.aShortArray55[local85] * local11 / (this.anInt412 * -1678286317);
						}
						for (local85 = 0; local85 < local355.aShort100; local85++) {
							@Pc(408) short local408 = local355.aShortArray54[local85];
							@Pc(413) short local413 = local355.aShortArray58[local85];
							@Pc(418) short local418 = local355.aShortArray59[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray201 != null && local355.anIntArray201[local85] != -1) {
								local456 = local355.anIntArray201[local85];
								arg9.method24539(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local456, local355.aShortArray56[local408], (byte) -52), (float) Class487.method29996(local456, local355.aShortArray56[local413], (byte) 17), (float) Class487.method29996(local456, local355.aShortArray56[local418], (byte) -23));
							} else if (local355.aShortArray53 == null || local355.aShortArray53[local85] == -1) {
								local456 = local355.anIntArray200[local85];
								arg9.method24539(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local456, local355.aShortArray56[local408], (byte) -14), (float) Class487.method29996(local456, local355.aShortArray56[local413], (byte) -17), (float) Class487.method29996(local456, local355.aShortArray56[local418], (byte) -45));
							} else {
								local456 = this.aClass104_Sub3_1.method5737(local355.aShortArray53[local85] & 0xFFFF);
								arg9.method24539(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class487.method29996(local456, local355.aShortArray56[local408], (byte) 17), (float) Class487.method29996(local456, local355.aShortArray56[local413], (byte) -73), (float) Class487.method29996(local456, local355.aShortArray56[local418], (byte) -19));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean571 = true;
		this.aClass104_Sub3_1.method20530(local14);
	}

	@OriginalMember(owner = "client!aee", name = "bk", descriptor = "(IILclient!bd;[F[F[F[F[FI)V")
	void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class198 local6 = this.aClass198ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class167 local1347 = this.aClass167ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte57 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort101; local1368++) {
					local45 = local1347.aShortArray57[local1368] + (arg0 << this.anInt415 * -373302705);
					@Pc(1389) short local1389 = local1347.aShortArray60[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt415 * -373302705);
					local410 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local1389 + this.aFloat16 * (float) local59;
					local474 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local1389 + this.aFloat17 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local1389 + this.aFloat20 * (float) local59;
					local346 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local1389 + this.aFloat15 * (float) local59;
					arg3[local1368] = arg2.aFloat245 + arg2.aFloat250 * local282 / local474;
					arg4[local1368] = arg2.aFloat246 + arg2.aFloat247 * local346 / local474;
					arg5[local1368] = arg2.aFloat249 + arg2.aFloat244 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray53 == null) {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray200[local1368];
							if (local1924 != -1) {
								arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
								arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1924, local1347.aShortArray56[local1547], (byte) 24), (float) Class487.method29996(local1924, local1347.aShortArray56[local1552], (byte) -10), (float) Class487.method29996(local1924, local1347.aShortArray56[local1557], (byte) -44));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray53[local1368] != -1) {
								@Pc(1654) Class235 local1654 = this.aClass104_Sub3_1.aClass225_6.method25690(local1347.aShortArray53[local1368] & 0xFFFF, -1551206722);
								local1636 = local1654.aBoolean656;
							}
							if (local1636) {
								arg2.method24544(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray57[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1557] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1557] / (float) (this.anInt412 * -1678286317), Class685.anIntArray524[local1347.aShortArray56[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray53[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray200[local1368];
								if (local1806 != -1) {
									arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1806, local1347.aShortArray56[local1547], (byte) -1), (float) Class487.method29996(local1806, local1347.aShortArray56[local1552], (byte) -52), (float) Class487.method29996(local1806, local1347.aShortArray56[local1557], (byte) 47));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			@Pc(52) int local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local71 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local71 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local528 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local528 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local539 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local539 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local548 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local548 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local71 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local71 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local528 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local528 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local539 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local539 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local548 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local548 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat14 * (float) local71;
				@Pc(83) float local83 = this.aFloat7 * (float) local71;
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat12 * (float) local71;
				@Pc(255) float local255 = this.aFloat13 * (float) local71;
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort144 != -1) {
				@Pc(1044) Class235 local1044 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort144 & 0xFFFF, -1315778066);
				local1030 = local1044.aBoolean656;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean572 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class685.anIntArray524[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean572 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class685.anIntArray524[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bh", descriptor = "(IILclient!bd;[F[F[F[F[FI)V")
	void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class198 local6 = this.aClass198ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class167 local1347 = this.aClass167ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte57 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort101; local1368++) {
					local45 = local1347.aShortArray57[local1368] + (arg0 << this.anInt415 * -373302705);
					@Pc(1389) short local1389 = local1347.aShortArray60[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt415 * -373302705);
					local410 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local1389 + this.aFloat16 * (float) local59;
					local474 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local1389 + this.aFloat17 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local1389 + this.aFloat20 * (float) local59;
					local346 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local1389 + this.aFloat15 * (float) local59;
					arg3[local1368] = arg2.aFloat245 + arg2.aFloat250 * local282 / local474;
					arg4[local1368] = arg2.aFloat246 + arg2.aFloat247 * local346 / local474;
					arg5[local1368] = arg2.aFloat249 + arg2.aFloat244 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray53 == null) {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray200[local1368];
							if (local1924 != -1) {
								arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
								arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1924, local1347.aShortArray56[local1547], (byte) -15), (float) Class487.method29996(local1924, local1347.aShortArray56[local1552], (byte) 44), (float) Class487.method29996(local1924, local1347.aShortArray56[local1557], (byte) 32));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray53[local1368] != -1) {
								@Pc(1654) Class235 local1654 = this.aClass104_Sub3_1.aClass225_6.method25690(local1347.aShortArray53[local1368] & 0xFFFF, -1778887495);
								local1636 = local1654.aBoolean656;
							}
							if (local1636) {
								arg2.method24544(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray57[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1557] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1557] / (float) (this.anInt412 * -1678286317), Class685.anIntArray524[local1347.aShortArray56[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray53[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray200[local1368];
								if (local1806 != -1) {
									arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1806, local1347.aShortArray56[local1547], (byte) -81), (float) Class487.method29996(local1806, local1347.aShortArray56[local1552], (byte) 17), (float) Class487.method29996(local1806, local1347.aShortArray56[local1557], (byte) -67));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			@Pc(52) int local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local71 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local71 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local528 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local528 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local539 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local539 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local548 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local548 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local71 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local71 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local528 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local528 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local539 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local539 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local548 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local548 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat14 * (float) local71;
				@Pc(83) float local83 = this.aFloat7 * (float) local71;
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat12 * (float) local71;
				@Pc(255) float local255 = this.aFloat13 * (float) local71;
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort144 != -1) {
				@Pc(1044) Class235 local1044 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort144 & 0xFFFF, -2054081716);
				local1030 = local1044.aBoolean656;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean572 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class685.anIntArray524[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean572 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class685.anIntArray524[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bx", descriptor = "(IILclient!bd;[F[F[F[F[FI)V")
	void method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class198 local6 = this.aClass198ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class167 local1347 = this.aClass167ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte57 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort101; local1368++) {
					local45 = local1347.aShortArray57[local1368] + (arg0 << this.anInt415 * -373302705);
					@Pc(1389) short local1389 = local1347.aShortArray60[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt415 * -373302705);
					local410 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local1389 + this.aFloat16 * (float) local59;
					local474 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local1389 + this.aFloat17 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local1389 + this.aFloat20 * (float) local59;
					local346 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local1389 + this.aFloat15 * (float) local59;
					arg3[local1368] = arg2.aFloat245 + arg2.aFloat250 * local282 / local474;
					arg4[local1368] = arg2.aFloat246 + arg2.aFloat247 * local346 / local474;
					arg5[local1368] = arg2.aFloat249 + arg2.aFloat244 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray53 == null) {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray200[local1368];
							if (local1924 != -1) {
								arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
								arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1924, local1347.aShortArray56[local1547], (byte) 75), (float) Class487.method29996(local1924, local1347.aShortArray56[local1552], (byte) -21), (float) Class487.method29996(local1924, local1347.aShortArray56[local1557], (byte) 28));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort100; local1368++) {
						local1547 = local1347.aShortArray54[local1368];
						local1552 = local1347.aShortArray58[local1368];
						local1557 = local1347.aShortArray59[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean572 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3318 || local383 > (float) arg2.anInt3318 || local447 > (float) arg2.anInt3318;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray53[local1368] != -1) {
								@Pc(1654) Class235 local1654 = this.aClass104_Sub3_1.aClass225_6.method25690(local1347.aShortArray53[local1368] & 0xFFFF, 304709125);
								local1636 = local1654.aBoolean656;
							}
							if (local1636) {
								arg2.method24544(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray57[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray57[local1557] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1547] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1552] / (float) (this.anInt412 * -1678286317), (float) local1347.aShortArray55[local1557] / (float) (this.anInt412 * -1678286317), Class685.anIntArray524[local1347.aShortArray56[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local1347.aShortArray56[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray53[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray200[local1368];
								if (local1806 != -1) {
									arg2.method24539(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class487.method29996(local1806, local1347.aShortArray56[local1547], (byte) -25), (float) Class487.method29996(local1806, local1347.aShortArray56[local1552], (byte) 4), (float) Class487.method29996(local1806, local1347.aShortArray56[local1557], (byte) 65));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			@Pc(52) int local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local71 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local71 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local528 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local528 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local539 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local539 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local548 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local548 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local71 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local71 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local528 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local528 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local539 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local539 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local548 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local548 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat14 * (float) local71;
				@Pc(83) float local83 = this.aFloat7 * (float) local71;
				local100 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local52;
				local117 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local52;
				local157 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat8 + this.aFloat11 * (float) local45 + local77 + this.aFloat16 * (float) local59;
				local197 = this.aFloat19 + this.aFloat22 * (float) local45 + local83 + this.aFloat17 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat8 + this.aFloat11 * (float) local38 + local77 + this.aFloat16 * (float) local59;
				local237 = this.aFloat19 + this.aFloat22 * (float) local38 + local83 + this.aFloat17 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat12 * (float) local71;
				@Pc(255) float local255 = this.aFloat13 * (float) local71;
				local272 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local52;
				local282 = arg2.aFloat245 + arg2.aFloat250 * local272 / local117;
				local299 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local52;
				local309 = arg2.aFloat246 + arg2.aFloat247 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat244 * local100 / local117;
				local336 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local52;
				local346 = arg2.aFloat245 + arg2.aFloat250 * local336 / local157;
				local363 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local52;
				local373 = arg2.aFloat246 + arg2.aFloat247 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat244 * local140 / local157;
				local400 = this.aFloat18 + this.aFloat9 * (float) local45 + local249 + this.aFloat20 * (float) local59;
				local410 = arg2.aFloat245 + arg2.aFloat250 * local400 / local197;
				local427 = this.aFloat21 + this.aFloat10 * (float) local45 + local255 + this.aFloat15 * (float) local59;
				local437 = arg2.aFloat246 + arg2.aFloat247 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat244 * local180 / local197;
				local464 = this.aFloat18 + this.aFloat9 * (float) local38 + local249 + this.aFloat20 * (float) local59;
				local474 = arg2.aFloat245 + arg2.aFloat250 * local464 / local237;
				local491 = this.aFloat21 + this.aFloat10 * (float) local38 + local255 + this.aFloat15 * (float) local59;
				local501 = arg2.aFloat246 + arg2.aFloat247 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat244 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort144 != -1) {
				@Pc(1044) Class235 local1044 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort144 & 0xFFFF, -1417691487);
				local1030 = local1044.aBoolean656;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean572 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class685.anIntArray524[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean572 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3318 || local346 > (float) arg2.anInt3318 || local474 > (float) arg2.anInt3318;
				if (local1030) {
					arg2.method24544(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class685.anIntArray524[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort145 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class685.anIntArray524[local6.aShort147 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort144 & 0xFFFF);
				} else {
					arg2.method24539(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort145 & 0xFFFF), (float) (local6.aShort147 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "ay", descriptor = "(IIZLclient!az;Lclient!bd;[F[F[F[F[FI)V")
	void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class188 local6 = this.aClass188ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2006) Class185 local2006 = this.aClass185ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte102 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort132; local2027++) {
					local45 = local2006.aShortArray73[local2027] + (arg0 << this.anInt415 * -373302705);
					local52 = local2006.aShortArray71[local2027];
					local59 = local2006.aShortArray72[local2027] + (arg1 << this.anInt415 * -373302705);
					local523 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local52 + this.aFloat16 * (float) local59;
					local577 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat17 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat244 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat243;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat240;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray74[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean567) {
						local550 = local523 - arg3.aFloat243;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat240;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local52 + this.aFloat20 * (float) local59;
					local469 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local52 + this.aFloat15 * (float) local59;
					arg5[local2027] = arg4.aFloat245 + arg4.aFloat250 * local415 / local577;
					arg6[local2027] = arg4.aFloat246 + arg4.aFloat247 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray76 == null) {
					for (local2027 = 0; local2027 < local2006.aShort131; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean572 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3318 || local283 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
							if (local567 >= 3.0F) {
								arg4.method24543(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3310 * 1032506167);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
									arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2282], arg3.anInt3310 * 1032506167, arg9[local2282] * 255.0F, 1429230600), Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2157], arg3.anInt3310 * 1032506167, arg9[local2157] * 255.0F, 1167611670), Class125_Sub2_Sub1.method21481(local2006.anIntArray295[local2290], arg3.anInt3310 * 1032506167, arg9[local2290] * 255.0F, 1124131068));
								}
							} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
								arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray295[local2282], local2006.anIntArray295[local2157], local2006.anIntArray295[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort131; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean572 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3318 || local283 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
							@Pc(2381) Class235 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray76[local2027] != -1) {
								local2381 = this.aClass104_Sub3_1.aClass225_6.method25690(local2006.aShortArray76[local2027] & 0xFFFF, -1425636239);
								local2383 = local2381.aBoolean656;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method1984(local2381.aByte114)) {
											local2416 = -1694498816;
										}
										arg4.method24544(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray73[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2290] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2290] / (float) (this.anInt412 * -1678286317), local2416 | local2006.anIntArray295[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2290] & 0xFFFFFF, arg3.anInt3310 * 1032506167, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray76[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
										arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class412.method28849(local2006.anIntArray295[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1965709926), Class412.method28849(local2006.anIntArray295[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 651129430), Class412.method28849(local2006.anIntArray295[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1856577959));
										arg4.anInt3315 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method1984(local2381.aByte114)) {
										local2416 = -1694498816;
									}
									arg4.method24544(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray73[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray73[local2290] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2282] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2157] / (float) (this.anInt412 * -1678286317), (float) local2006.aShortArray72[local2290] / (float) (this.anInt412 * -1678286317), local2416 | local2006.anIntArray295[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray295[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray76[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray295[local2282] & 0xFFFFFF) != 0) {
									arg4.method24541(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray295[local2282], local2006.anIntArray295[local2157], local2006.anIntArray295[local2290]);
									arg4.anInt3315 = 0;
								}
							} else {
								arg4.method24543(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3310 * 1032506167);
							}
						}
					}
				}
			}
		} else if ((local6.aByte103 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte103 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt412 * -1678286317;
			local45 = local38 + this.anInt412 * -1678286317;
			local52 = arg1 * this.anInt412 * -1678286317;
			local59 = local52 + this.anInt412 * -1678286317;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte103 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local81 + this.aFloat16 * (float) local52;
				local127 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat17 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local621 + this.aFloat16 * (float) local52;
				local167 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat17 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat8 + this.aFloat11 * (float) local45 + this.aFloat14 * (float) local632 + this.aFloat16 * (float) local59;
				local207 = this.aFloat19 + this.aFloat22 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat17 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat8 + this.aFloat11 * (float) local38 + this.aFloat14 * (float) local641 + this.aFloat16 * (float) local59;
				local247 = this.aFloat19 + this.aFloat22 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat17 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat244 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat244 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat244 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat244 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort136 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort137 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort138 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat240;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort135 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean567) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat240;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat240;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat240;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat240;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local81 + this.aFloat20 * (float) local52;
				local415 = arg4.aFloat245 + arg4.aFloat250 * local405 / local127;
				local432 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local81 + this.aFloat15 * (float) local52;
				local442 = arg4.aFloat246 + arg4.aFloat247 * local432 / local127;
				local459 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local621 + this.aFloat20 * (float) local52;
				local469 = arg4.aFloat245 + arg4.aFloat250 * local459 / local167;
				local486 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local621 + this.aFloat15 * (float) local52;
				local496 = arg4.aFloat246 + arg4.aFloat247 * local486 / local167;
				local513 = this.aFloat18 + this.aFloat9 * (float) local45 + this.aFloat12 * (float) local632 + this.aFloat20 * (float) local59;
				local523 = arg4.aFloat245 + arg4.aFloat250 * local513 / local207;
				local540 = this.aFloat21 + this.aFloat10 * (float) local45 + this.aFloat13 * (float) local632 + this.aFloat15 * (float) local59;
				local550 = arg4.aFloat246 + arg4.aFloat247 * local540 / local207;
				local567 = this.aFloat18 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local641 + this.aFloat20 * (float) local59;
				local577 = arg4.aFloat245 + arg4.aFloat250 * local567 / local247;
				local594 = this.aFloat21 + this.aFloat10 * (float) local38 + this.aFloat13 * (float) local641 + this.aFloat15 * (float) local59;
				local604 = arg4.aFloat246 + arg4.aFloat247 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat14 * (float) local81;
				@Pc(93) float local93 = this.aFloat7 * (float) local81;
				local110 = this.aFloat8 + this.aFloat11 * (float) local38 + local87 + this.aFloat16 * (float) local52;
				local127 = this.aFloat19 + this.aFloat22 * (float) local38 + local93 + this.aFloat17 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat8 + this.aFloat11 * (float) local45 + local87 + this.aFloat16 * (float) local52;
				local167 = this.aFloat19 + this.aFloat22 * (float) local45 + local93 + this.aFloat17 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat8 + this.aFloat11 * (float) local45 + local87 + this.aFloat16 * (float) local59;
				local207 = this.aFloat19 + this.aFloat22 * (float) local45 + local93 + this.aFloat17 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat8 + this.aFloat11 * (float) local38 + local87 + this.aFloat16 * (float) local59;
				local247 = this.aFloat19 + this.aFloat22 * (float) local38 + local93 + this.aFloat17 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat244 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat244 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat244 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat244 * local230 / local247;
				if (arg3.aBoolean567) {
					local301 = local110 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat240;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat240;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat240;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat243;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat240;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat12 * (float) local81;
				@Pc(388) float local388 = this.aFloat13 * (float) local81;
				local405 = this.aFloat18 + this.aFloat9 * (float) local38 + local382 + this.aFloat20 * (float) local52;
				local415 = arg4.aFloat245 + arg4.aFloat250 * local405 / local127;
				local432 = this.aFloat21 + this.aFloat10 * (float) local38 + local388 + this.aFloat15 * (float) local52;
				local442 = arg4.aFloat246 + arg4.aFloat247 * local432 / local127;
				local459 = this.aFloat18 + this.aFloat9 * (float) local45 + local382 + this.aFloat20 * (float) local52;
				local469 = arg4.aFloat245 + arg4.aFloat250 * local459 / local167;
				local486 = this.aFloat21 + this.aFloat10 * (float) local45 + local388 + this.aFloat15 * (float) local52;
				local496 = arg4.aFloat246 + arg4.aFloat247 * local486 / local167;
				local513 = this.aFloat18 + this.aFloat9 * (float) local45 + local382 + this.aFloat20 * (float) local59;
				local523 = arg4.aFloat245 + arg4.aFloat250 * local513 / local207;
				local540 = this.aFloat21 + this.aFloat10 * (float) local45 + local388 + this.aFloat15 * (float) local59;
				local550 = arg4.aFloat246 + arg4.aFloat247 * local540 / local207;
				local567 = this.aFloat18 + this.aFloat9 * (float) local38 + local382 + this.aFloat20 * (float) local59;
				local577 = arg4.aFloat245 + arg4.aFloat250 * local567 / local247;
				local594 = this.aFloat21 + this.aFloat10 * (float) local38 + local388 + this.aFloat15 * (float) local59;
				local604 = arg4.aFloat246 + arg4.aFloat247 * local594 / local247;
			}
			@Pc(1349) Class235 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort139 != -1) {
				local1349 = this.aClass104_Sub3_1.aClass225_6.method25690(local6.aShort139 & 0xFFFF, -795763617);
				local1351 = local1349.aBoolean656;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method1984(local1349.aByte114);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean572 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3318 || local577 > (float) arg4.anInt3318 || local469 > (float) arg4.anInt3318;
				if (local382 >= 3.0F) {
					arg4.method24543(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3310 * 1032506167);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24544(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3341 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, arg3.anInt3310 * 1032506167, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort139 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3315 = 100;
						}
						arg4.method24541(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class412.method28849(local6.anInt3341, (int) (local65 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1240652626), Class412.method28849(local6.anInt3342, (int) (local67 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 611518219), Class412.method28849(local6.anInt3340, (int) (local63 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1780331035));
						arg4.anInt3315 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24544(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3341 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort139 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3315 = 100;
					}
					arg4.method24541(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3341, local6.anInt3342, local6.anInt3340);
					arg4.anInt3315 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean572 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3318 || local469 > (float) arg4.anInt3318 || local577 > (float) arg4.anInt3318;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3315 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24544(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3310 * 1032506167, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort139 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3315 = 100;
							}
							arg4.method24541(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class412.method28849(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 1366787863), Class412.method28849(local6.anInt3340, (int) (local63 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, -1033167788), Class412.method28849(local6.anInt3342, (int) (local67 * 255.0F) << 24 | arg3.anInt3310 * 1032506167, 471811999));
							arg4.anInt3315 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24544(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3340 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort139 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3315 = 100;
						}
						arg4.method24541(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3340, local6.anInt3342);
						arg4.anInt3315 = 0;
					}
				} else {
					arg4.method24543(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3310 * 1032506167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bc", descriptor = "(IIZLclient!az;Lclient!bd;[F[F[F[F[FI)V")
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort134; local17++) {
			@Pc(33) int local33 = local6.aShortArray78[local17] + (arg0 << this.anInt415 * -373302705);
			@Pc(38) int local38 = local6.aShortArray80[local17];
			@Pc(50) int local50 = local6.aShortArray81[local17] + (arg1 << this.anInt415 * -373302705);
			@Pc(71) float local71 = this.aFloat8 + this.aFloat11 * (float) local33 + this.aFloat14 * (float) local38 + this.aFloat16 * (float) local50;
			@Pc(92) float local92 = this.aFloat19 + this.aFloat22 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat17 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat243;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat240;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray79[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean567) {
				local109 = local71 - arg3.aFloat243;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat240;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat18 + this.aFloat9 * (float) local33 + this.aFloat12 * (float) local38 + this.aFloat20 * (float) local50;
			@Pc(215) float local215 = this.aFloat21 + this.aFloat10 * (float) local33 + this.aFloat13 * (float) local38 + this.aFloat15 * (float) local50;
			arg5[local17] = arg4.aFloat245 + arg4.aFloat250 * local194 / local92;
			arg6[local17] = arg4.aFloat246 + arg4.aFloat247 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat244 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt412 * -1678286317);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort133; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean572 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3318 || local289 > (float) arg4.anInt3318 || local293 > (float) arg4.anInt3318;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt415 * -373302705;
					@Pc(386) int local386 = arg1 << this.anInt415 * -373302705;
					if ((local6.anIntArray296[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray82[local137] == -1 || local6.aShortArray82[local277] == -1 || local6.aShortArray82[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24541(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class125_Sub2_Sub1.method21481(local6.anIntArray296[local137], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, 1133493826), Class125_Sub2_Sub1.method21481(local6.anIntArray296[local277], arg3.anInt3310 * 1032506167, arg9[local277] * 255.0F, 1068533113), Class125_Sub2_Sub1.method21481(local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local281] * 255.0F, 1287795173));
							} else {
								arg4.method24541(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281]);
							}
						} else if (local6.aShortArray82[local137] == local6.aShortArray82[local277] && local6.aShortArray82[local137] == local6.aShortArray82[local281] && local6.aShortArray77[local137] == local6.aShortArray77[local277] && local6.aShortArray77[local137] == local6.aShortArray77[local281]) {
							arg4.method24544(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray78[local137]) / (float) local6.aShortArray77[local137], (float) (local379 + local6.aShortArray78[local277]) / (float) local6.aShortArray77[local277], (float) (local379 + local6.aShortArray78[local281]) / (float) local6.aShortArray77[local281], (float) (local386 + local6.aShortArray81[local137]) / (float) local6.aShortArray77[local137], (float) (local386 + local6.aShortArray81[local277]) / (float) local6.aShortArray77[local277], (float) (local386 + local6.aShortArray81[local281]) / (float) local6.aShortArray77[local281], local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray82[local137] & 0xFFFF);
						} else {
							arg4.method24553(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray78[local137]) / local263, (float) (local379 + local6.aShortArray78[local277]) / local263, (float) (local379 + local6.aShortArray78[local281]) / local263, (float) (local386 + local6.aShortArray81[local137]) / local263, (float) (local386 + local6.aShortArray81[local277]) / local263, (float) (local386 + local6.aShortArray81[local281]) / local263, local6.anIntArray296[local137], local6.anIntArray296[local277], local6.anIntArray296[local281], arg3.anInt3310 * 1032506167, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray82[local137] & 0xFFFF, local263 / (float) local6.aShortArray77[local137], local6.aShortArray82[local277] & 0xFFFF, local263 / (float) local6.aShortArray77[local277], local6.aShortArray82[local281] & 0xFFFF, local263 / (float) local6.aShortArray77[local281]);
						}
					}
				} else {
					arg4.method24543(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3310 * 1032506167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bi", descriptor = "(I)Z")
	boolean method1995(@OriginalArg(0) int arg0) {
		if ((this.anInt346 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aee", name = "n", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt346 & 0x20) == 0;
		if (this.aClass188ArrayArray1 == null && !local8) {
			this.aClass188ArrayArray1 = new Class188[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass185ArrayArray1 = new Class185[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass186ArrayArray1 == null && local8) {
			this.aClass186ArrayArray1 = new Class186[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass198ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class685.anIntArray524[Class366.method28128(arg6[local68], -1311378241) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class685.anIntArray524[Class366.method28128(arg7[local68], 1560229914) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(230) int local230;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class186 local142 = new Class186();
			local142.aShort134 = (short) arg2.length;
			local142.aShort133 = (short) (arg2.length / 3);
			local142.aShortArray78 = new short[local142.aShort134];
			local142.aShortArray80 = new short[local142.aShort134];
			local142.aShortArray81 = new short[local142.aShort134];
			local142.anIntArray296 = new int[local142.aShort134];
			local142.aShortArray82 = new short[local142.aShort134];
			local142.aShortArray77 = new short[local142.aShort134];
			local142.aByteArray65 = new byte[local142.aShort134];
			if (arg5 != null) {
				local142.aShortArray79 = new short[local142.aShort134];
			}
			for (local198 = 0; local198 < local142.aShort134; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt412 * -1678286317) {
					local230 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
				} else if (local206 == this.anInt412 * -1678286317 && local210 == this.anInt412 * -1678286317) {
					local230 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt412 * -1678286317 && local210 == 0) {
					local230 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local206) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local206) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt412 * -1678286317 - local210) + local410 * local210 >> this.anInt415 * -746605410;
				}
				local361 = (arg0 << this.anInt415 * -373302705) + local206;
				local410 = (arg1 << this.anInt415 * -373302705) + local210;
				local142.aShortArray78[local198] = (short) local206;
				local142.aShortArray81[local198] = (short) local210;
				local142.aShortArray80[local198] = (short) (this.method2480(local361, local410, 1922149706) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray296[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray79[local198] = (short) arg5[local198];
						if (arg10.anInt3856 * -2052057497 != 0) {
							local500 = local512 * 255 / (arg10.anInt3856 * -2052057497);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class235 local552 = this.aClass104_Sub3_1.aClass225_6.method25690(arg8[local198], 668667134);
						if (local552.aBoolean656 && this.method1984(local552.aByte114)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray296[local198] = local538 | Class260.method26247(method1979(arg6[local198] >> 8, local230), arg10.anInt3858 * -1393096381, local500, 445606420);
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				}
				local142.aShortArray82[local198] = (short) arg8[local198];
				local142.aShortArray77[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray297 = new int[local142.aShort133];
				for (local198 = 0; local198 < local142.aShort133; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray297[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass186ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(652) boolean local652 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local652 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt412 * -1678286317 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt412 * -1678286317 && arg4[local361] == this.anInt412 * -1678286317) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt412 * -1678286317) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local652 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local652 = false;
			}
			if (local652) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local652 = false;
							break;
						}
					}
				}
				if (local652) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt412 * -1678286317 && arg2[local361] != arg2[0] - this.anInt412 * -1678286317) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt412 * -1678286317 && arg4[local361] != arg4[0] - this.anInt412 * -1678286317) {
							local652 = false;
							break;
						}
					}
				}
			}
		} else {
			local652 = false;
		}
		if (!local652) {
			@Pc(1753) Class185 local1753 = new Class185();
			local1753.aShort132 = (short) arg2.length;
			local1753.aShort131 = (short) (arg2.length / 3);
			local1753.aShortArray73 = new short[local1753.aShort132];
			local1753.aShortArray71 = new short[local1753.aShort132];
			local1753.aShortArray72 = new short[local1753.aShort132];
			local1753.anIntArray295 = new int[local1753.aShort132];
			if (arg5 != null) {
				local1753.aShortArray74 = new short[local1753.aShort132];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort132; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt412 * -1678286317) {
					local1826 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1];
				} else if (local500 == this.anInt412 * -1678286317 && local538 == this.anInt412 * -1678286317) {
					local1826 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt412 * -1678286317 && local538 == 0) {
					local1826 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local500) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local500) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt412 * -1678286317 - local538) + local2006 * local538 >> this.anInt415 * -746605410;
				}
				local1957 = (arg0 << this.anInt415 * -373302705) + local500;
				local2006 = (arg1 << this.anInt415 * -373302705) + local538;
				local1753.aShortArray73[local410] = (short) local500;
				local1753.aShortArray72[local410] = (short) local538;
				local1753.aShortArray71[local410] = (short) (this.method2480(local1957, local2006, 186963800) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray74[local410] = (short) arg5[local410];
						if (arg10.anInt3856 * -2052057497 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3856 * -2052057497);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray295[local410] = Class260.method26247(method1979(arg6[local410] >> 8, local1826), arg10.anInt3858 * -1393096381, local2098, 445606420);
					if (arg7 != null) {
						local1753.anIntArray295[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray295[local410] = 0;
				} else {
					local1753.anIntArray295[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort131; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(arg8[local500 * 3], -317332542).aBoolean660) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray294 = new int[local1753.aShort131];
			}
			if (local2168) {
				local1753.aShortArray76 = new short[local1753.aShort131];
				local1753.aShortArray75 = new short[local1753.aShort131];
			}
			for (local500 = 0; local500 < local1753.aShort131; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray294[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 1675338429).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 1119883587).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(local2259, -1146046325).aBoolean660) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray76[local500] = (short) local2259;
						local1753.aShortArray75[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 734979863).aBoolean660) {
								local1753.anIntArray295[local538] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 928155481).aShort162 & 0xFFFF, 1363038166) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 1231486539).aBoolean660) {
								local1753.anIntArray295[local1826] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 526659200).aShort162 & 0xFFFF, 623714590) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 398433637).aBoolean660) {
								local1753.anIntArray295[local1957] = Class685.anIntArray524[Class366.method28128(this.aClass104_Sub3_1.aClass225_6.method25690(local2259, 374931774).aShort162 & 0xFFFF, -1223987261) & 0xFFFF];
							}
						}
						local1753.aShortArray76[local500] = -1;
					}
				}
			}
			this.aClass185ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class188 local900 = new Class188();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3339 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte103 = (byte) (local900.aByte103 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local900.aByte103 = (byte) (local900.aByte103 | 0x1);
		}
		if (local500 == -1 || (local900.aByte103 & 0x2) != 0 || this.aClass104_Sub3_1.aClass225_6.method25690(local500, -541139471).aBoolean660) {
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class260.method26247(method1979(arg6[local198] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3340 = Class260.method26247(method1979(arg6[local206] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3340 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3341 = Class260.method26247(method1979(arg6[local210] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3341 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class260.method26247(method1979(arg6[local230] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) << 25;
			}
			local900.aShort139 = -1;
		} else {
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class260.method26247(method1979(arg6[local198] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3340 = Class260.method26247(method1979(arg6[local206] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3340 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3341 = Class260.method26247(method1979(arg6[local210] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			if (local900.anInt3339 != 0) {
				local900.anInt3341 |= 255 - (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3856 * -2052057497 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3856 * -2052057497);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class260.method26247(method1979(arg6[local230] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]), arg10.anInt3858 * -1393096381, local538, 445606420);
			local900.aShort139 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort138 = (short) arg5[local210];
			local900.aShort135 = (short) arg5[local230];
			local900.aShort137 = (short) arg5[local206];
			local900.aShort136 = (short) arg5[local198];
		}
		this.aClass188ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aee", name = "j", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2498(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2500(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2488(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "b", descriptor = "()V")
	@Override
	public void method2493() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray5 = null;
	}

	@OriginalMember(owner = "client!aee", name = "ah", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass198ArrayArray1 == null) {
			this.aClass198ArrayArray1 = new Class198[this.anInt414 * -1667858293][this.anInt413 * -143202029];
			this.aClass167ArrayArray1 = new Class167[this.anInt414 * -1667858293][this.anInt413 * -143202029];
		} else if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt412 * -1678286317 || local83 != 0 && local83 != this.anInt412 * -1678286317) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class167 local110 = new Class167();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort101 = local114;
			local110.aShortArray56 = new short[local114];
			local110.aShortArray57 = new short[local114];
			local110.aShortArray60 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == this.anInt412 * -1678286317) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt412 * -1678286317 && local150 == 0) {
					local110.aShortArray56[local139] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]) * (this.anInt412 * -1678286317 - local146) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray56[local139] = (short) (local315 * (this.anInt412 * -1678286317 - local150) + local364 * local150 >> this.anInt415 * -746605410);
				}
				local315 = (arg0 << this.anInt415 * -373302705) + local146;
				local364 = (arg1 << this.anInt415 * -373302705) + local150;
				local110.aShortArray57[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray60[local139] = (short) (this.method2480(local315, local364, 1267931359) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray56[local139] < 2) {
					local110.aShortArray56[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class235 local482 = this.aClass104_Sub3_1.aClass225_6.method25690(local315, 1918201842);
					if (!local482.aBoolean660) {
						local449 = true;
						if (this.method1984(local482.aByte114) || local482.aFloat278 != 0.0F || local482.aFloat279 != 0.0F) {
							local110.aByte57 = (byte) (local110.aByte57 | 0x4);
						}
					}
				}
			}
			local110.anIntArray200 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray201 = new int[local146];
			}
			local110.aShortArray54 = new short[local146];
			local110.aShortArray58 = new short[local146];
			local110.aShortArray59 = new short[local146];
			if (local449) {
				local110.aShortArray53 = new short[local146];
				local110.aShortArray52 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray200[local110.aShort100] = Class366.method28128(arg9[local150], -76235348);
					} else {
						local110.anIntArray200[local110.aShort100] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray201[local110.aShort100] = -1;
						} else {
							local110.anIntArray201[local110.aShort100] = Class366.method28128(arg10[local150], -1116365799);
						}
					}
					local110.aShortArray54[local110.aShort100] = (short) arg6[local150];
					local110.aShortArray58[local110.aShort100] = (short) arg7[local150];
					local110.aShortArray59[local110.aShort100] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass104_Sub3_1.aClass225_6.method25690(arg11[local150], -920865786).aBoolean660) {
							local110.aShortArray53[local110.aShort100] = -1;
						} else {
							local110.aShortArray53[local110.aShort100] = (short) arg11[local150];
							local110.aShortArray52[local110.aShort100] = (short) arg12[local150];
						}
					}
					local110.aShort100++;
				}
			}
			this.aClass167ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class198 local704 = new Class198();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3370 = Class487.method29996(Class366.method28128(arg10[0], 1560225169), this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) 93);
				if (local77 == -1) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte108 = (byte) (local704.aByte108 | 0x1);
			}
			@Pc(802) Class235 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass104_Sub3_1.aClass225_6.method25690(local83, -183865594);
			}
			if (local802 == null || (local704.aByte108 & 0x2) != 0 || local802.aBoolean660) {
				@Pc(933) short local933 = Class366.method28128(local77, 1117598229);
				local704.aShort148 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1], (byte) -24);
				local704.aShort145 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1], (byte) 55);
				local704.aShort146 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1], (byte) 97);
				local704.aShort147 = (short) Class487.method29996(local933, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1], (byte) 19);
				local704.aShort144 = -1;
			} else {
				local704.aShort148 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray5[arg0][arg1]);
				local704.aShort145 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray5[arg0 + 1][arg1]);
				local704.aShort146 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray5[arg0 + 1][arg1 + 1]);
				local704.aShort147 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray5[arg0][arg1 + 1]);
				local704.aShort144 = (short) local83;
				if (this.method1984(local802.aByte114) || local802.aFloat278 != 0.0F || local802.aFloat279 != 0.0F) {
					local704.aByte108 = (byte) (local704.aByte108 | 0x4);
				}
			}
			this.aClass198ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aee", name = "ac", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class176 local4 = this.aClass104_Sub3_1.method5716(Thread.currentThread());
		@Pc(7) Class181 local7 = local4.aClass181_2;
		local7.anInt3315 = 0;
		local7.aBoolean572 = true;
		this.aClass104_Sub3_1.method5729();
		if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method1983(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		} else if (this.aClass198ArrayArray1 != null) {
			this.method1989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		}
	}

	@OriginalMember(owner = "client!aee", name = "ai", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class176 local4 = this.aClass104_Sub3_1.method5716(Thread.currentThread());
		@Pc(7) Class181 local7 = local4.aClass181_2;
		local7.anInt3315 = 0;
		local7.aBoolean572 = true;
		this.aClass104_Sub3_1.method5729();
		if (this.aClass188ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method1983(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		} else if (this.aClass198ArrayArray1 != null) {
			this.method1989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray88, local4.aFloatArray80);
		}
	}

	@OriginalMember(owner = "client!aee", name = "aw", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2477(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "as", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2506(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "at", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2507(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
