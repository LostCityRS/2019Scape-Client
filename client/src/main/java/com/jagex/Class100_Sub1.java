package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aep")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!aep", name = "m", descriptor = "I")
	static final int anInt375 = 1;

	@OriginalMember(owner = "client!aep", name = "o", descriptor = "I")
	static final int anInt376 = 2;

	@OriginalMember(owner = "client!aep", name = "j", descriptor = "I")
	static final int anInt377 = 4;

	@OriginalMember(owner = "client!aep", name = "i", descriptor = "I")
	static final int anInt379 = -1694498816;

	@OriginalMember(owner = "client!aep", name = "g", descriptor = "I")
	static final int anInt380 = 64;

	@OriginalMember(owner = "client!aep", name = "af", descriptor = "Z")
	static final boolean aBoolean67 = false;

	@OriginalMember(owner = "client!aep", name = "al", descriptor = "Z")
	static final boolean aBoolean68 = true;

	@OriginalMember(owner = "client!aep", name = "ah", descriptor = "Z")
	static final boolean aBoolean69 = true;

	@OriginalMember(owner = "client!aep", name = "r", descriptor = "[[Lclient!bn;")
	Class190[][] aClass190ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "w", descriptor = "[[Lclient!br;")
	Class193[][] aClass193ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "k", descriptor = "[[Lclient!ba;")
	Class178[][] aClass178ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "q", descriptor = "[[Lclient!bj;")
	Class186[][] aClass186ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "d", descriptor = "F")
	float aFloat4;

	@OriginalMember(owner = "client!aep", name = "b", descriptor = "F")
	float aFloat5;

	@OriginalMember(owner = "client!aep", name = "p", descriptor = "F")
	float aFloat6;

	@OriginalMember(owner = "client!aep", name = "v", descriptor = "F")
	float aFloat7;

	@OriginalMember(owner = "client!aep", name = "y", descriptor = "F")
	float aFloat8;

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "F")
	float aFloat9;

	@OriginalMember(owner = "client!aep", name = "h", descriptor = "F")
	float aFloat10;

	@OriginalMember(owner = "client!aep", name = "ax", descriptor = "F")
	float aFloat11;

	@OriginalMember(owner = "client!aep", name = "ay", descriptor = "F")
	float aFloat12;

	@OriginalMember(owner = "client!aep", name = "ai", descriptor = "F")
	float aFloat13;

	@OriginalMember(owner = "client!aep", name = "aq", descriptor = "F")
	float aFloat14;

	@OriginalMember(owner = "client!aep", name = "ao", descriptor = "F")
	float aFloat15;

	@OriginalMember(owner = "client!aep", name = "aj", descriptor = "F")
	float aFloat16;

	@OriginalMember(owner = "client!aep", name = "ac", descriptor = "F")
	float aFloat17;

	@OriginalMember(owner = "client!aep", name = "z", descriptor = "F")
	float aFloat18;

	@OriginalMember(owner = "client!aep", name = "c", descriptor = "F")
	float aFloat19;

	@OriginalMember(owner = "client!aep", name = "x", descriptor = "[[Lclient!aw;")
	Class173[][] aClass173ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "a", descriptor = "Lclient!aff;")
	final Class102_Sub2 aClass102_Sub2_1;

	@OriginalMember(owner = "client!aep", name = "s", descriptor = "I")
	final int anInt378;

	@OriginalMember(owner = "client!aep", name = "ag", descriptor = "[[B")
	byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!aep", name = "ab", descriptor = "[[B")
	byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!aep", name = "br", descriptor = "(II)I")
	static int method2507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!aep", name = "ap", descriptor = "(II)I")
	static int method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!aep", name = "<init>", descriptor = "(Lclient!aff;IIII[[I[[II)V")
	Class100_Sub1(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass102_Sub2_1 = arg0;
		this.anInt378 = arg2;
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		@Pc(28) int local28 = this.aClass102_Sub2_1.anInt646 * 501272015 >> 9;
		for (@Pc(30) int local30 = 1; local30 < arg4; local30++) {
			for (@Pc(35) int local35 = 1; local35 < arg3; local35++) {
				@Pc(56) int local56 = arg6[local35 + 1][local30] - arg6[local35 - 1][local30];
				@Pc(72) int local72 = arg6[local35][local30 + 1] - arg6[local35][local30 - 1];
				@Pc(87) int local87 = (int) Math.sqrt((double) (local56 * local56 + arg7 * 512 + local72 * local72));
				@Pc(93) int local93 = (local56 << 8) / local87;
				@Pc(99) int local99 = arg7 * -512 / local87;
				@Pc(105) int local105 = (local72 << 8) / local87;
				@Pc(133) int local133 = local28 + (this.aClass102_Sub2_1.anInt640 * 1132974733 * local93 + this.aClass102_Sub2_1.anInt641 * 807876983 * local99 + this.aClass102_Sub2_1.anInt650 * 1472584731 * local105 >> 17);
				local133 >>= 0x1;
				if (local133 < 2) {
					local133 = 2;
				} else if (local133 > 126) {
					local133 = 126;
				}
				this.aByteArrayArray3[local35][local30] = (byte) local133;
			}
		}
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!aep", name = "am", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2947(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "t", descriptor = "(III)V")
	@Override
	public void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray4[local9][local21] < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "e", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass178ArrayArray1 == null) {
			this.aClass178ArrayArray1 = new Class178[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass173ArrayArray1 = new Class173[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
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
				if (local77 != 0 && local77 != this.anInt447 * -1174710433 || local83 != 0 && local83 != this.anInt447 * -1174710433) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class173 local110 = new Class173();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort130 = local114;
			local110.aShortArray70 = new short[local114];
			local110.aShortArray63 = new short[local114];
			local110.aShortArray64 = new short[local114];
			local110.aShortArray65 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray70[local139] = (short) (local315 * (this.anInt447 * -1174710433 - local150) + local364 * local150 >> this.anInt445 * -1230339162);
				}
				local315 = (arg0 << this.anInt445 * -615169581) + local146;
				local364 = (arg1 << this.anInt445 * -615169581) + local150;
				local110.aShortArray63[local139] = (short) local146;
				local110.aShortArray65[local139] = (short) local150;
				local110.aShortArray64[local139] = (short) (this.method2915(local315, local364, (byte) -2) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray70[local139] < 2) {
					local110.aShortArray70[local139] = 2;
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
					@Pc(482) Class227 local482 = this.aClass102_Sub2_1.aClass235_6.method26120(local315, 73831368);
					if (!local482.aBoolean758) {
						local449 = true;
						if (this.method2514(local482.aByte110) || local482.aFloat263 != 0.0F || local482.aFloat264 != 0.0F) {
							local110.aByte101 = (byte) (local110.aByte101 | 0x4);
						}
					}
				}
			}
			local110.anIntArray289 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray290 = new int[local146];
			}
			local110.aShortArray62 = new short[local146];
			local110.aShortArray67 = new short[local146];
			local110.aShortArray68 = new short[local146];
			if (local449) {
				local110.aShortArray69 = new short[local146];
				local110.aShortArray66 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray289[local110.aShort131] = Class80_Sub22.method21675(arg9[local150], 552472605);
					} else {
						local110.anIntArray289[local110.aShort131] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray290[local110.aShort131] = -1;
						} else {
							local110.anIntArray290[local110.aShort131] = Class80_Sub22.method21675(arg10[local150], 555758474);
						}
					}
					local110.aShortArray62[local110.aShort131] = (short) arg6[local150];
					local110.aShortArray67[local110.aShort131] = (short) arg7[local150];
					local110.aShortArray68[local110.aShort131] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(arg11[local150], 73831368).aBoolean758) {
							local110.aShortArray69[local110.aShort131] = -1;
						} else {
							local110.aShortArray69[local110.aShort131] = (short) arg11[local150];
							local110.aShortArray66[local110.aShort131] = (short) arg12[local150];
						}
					}
					local110.aShort131++;
				}
			}
			this.aClass173ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class178 local704 = new Class178();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3310 = Class371.method28387(Class80_Sub22.method21675(arg10[0], 901829198), this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) 2644);
				if (local77 == -1) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte102 = (byte) (local704.aByte102 | 0x1);
			}
			@Pc(802) Class227 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass102_Sub2_1.aClass235_6.method26120(local83, 73831368);
			}
			if (local802 == null || (local704.aByte102 & 0x2) != 0 || local802.aBoolean758) {
				@Pc(933) short local933 = Class80_Sub22.method21675(local77, 806631407);
				local704.aShort132 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) -15915);
				local704.aShort133 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1], (short) -3180);
				local704.aShort134 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1], (short) -4530);
				local704.aShort135 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1], (short) 10332);
				local704.aShort136 = -1;
			} else {
				local704.aShort132 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				local704.aShort133 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				local704.aShort134 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				local704.aShort135 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				local704.aShort136 = (short) local83;
				if (this.method2514(local802.aByte110) || local802.aFloat263 != 0.0F || local802.aFloat264 != 0.0F) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x4);
				}
			}
			this.aClass178ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aep", name = "ab", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2943(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aep", name = "r", descriptor = "(III)V")
	@Override
	public void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray4[local9][local21] < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "l", descriptor = "(III[[ZZI)V")
	@Override
	public void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass102_Sub2_1.anIntArray50 == null || this.aClass102_Sub2_1.aFloatArray12 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub2_1.aClass487_20;
		this.aFloat10 = local16.aFloatArray114[0];
		this.aFloat4 = local16.aFloatArray114[1];
		this.aFloat18 = local16.aFloatArray114[2];
		this.aFloat6 = local16.aFloatArray114[3];
		this.aFloat7 = local16.aFloatArray114[4];
		this.aFloat8 = local16.aFloatArray114[5];
		this.aFloat9 = local16.aFloatArray114[6];
		this.aFloat19 = local16.aFloatArray114[7];
		this.aFloat5 = local16.aFloatArray114[8];
		this.aFloat11 = local16.aFloatArray114[9];
		this.aFloat12 = local16.aFloatArray114[10];
		this.aFloat13 = local16.aFloatArray114[11];
		this.aFloat14 = local16.aFloatArray114[12];
		this.aFloat15 = local16.aFloatArray114[13];
		this.aFloat16 = local16.aFloatArray114[14];
		this.aFloat17 = local16.aFloatArray114[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt448 * -1548585779 && local145 >= 0 && local145 < this.anInt446 * -1356799781) {
						this.method2508(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "ar", descriptor = "(III)V")
	void method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		local4.aClass195_2.anInt3350 = 0;
		if (this.aClass193ArrayArray1 != null) {
			this.method2515(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2509(arg0, arg1, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method2510(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "au", descriptor = "(IILclient!bt;[F[F[F[F[FI)V")
	void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class195 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class178 local6 = this.aClass178ArrayArray1[arg0][arg1];
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
			@Pc(1347) Class173 local1347 = this.aClass173ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte101 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort130; local1368++) {
					local45 = local1347.aShortArray63[local1368] + (arg0 << this.anInt445 * -615169581);
					@Pc(1389) short local1389 = local1347.aShortArray64[local1368];
					local59 = local1347.aShortArray65[local1368] + (arg1 << this.anInt445 * -615169581);
					local410 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local1389 + this.aFloat12 * (float) local59;
					local474 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local1389 + this.aFloat13 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local1389 + this.aFloat5 * (float) local59;
					local346 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local1389 + this.aFloat11 * (float) local59;
					arg3[local1368] = arg2.aFloat251 + arg2.aFloat246 * local282 / local474;
					arg4[local1368] = arg2.aFloat247 + arg2.aFloat248 * local346 / local474;
					arg5[local1368] = arg2.aFloat249 + arg2.aFloat250 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray69 == null) {
					for (local1368 = 0; local1368 < local1347.aShort131; local1368++) {
						local1547 = local1347.aShortArray62[local1368];
						local1552 = local1347.aShortArray67[local1368];
						local1557 = local1347.aShortArray68[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray289[local1368];
							if (local1924 != -1) {
								arg2.aBoolean679 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3351 || local383 > (float) arg2.anInt3351 || local447 > (float) arg2.anInt3351;
								arg2.method24855(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class371.method28387(local1924, local1347.aShortArray70[local1547], (short) 17541), (float) Class371.method28387(local1924, local1347.aShortArray70[local1552], (short) -20452), (float) Class371.method28387(local1924, local1347.aShortArray70[local1557], (short) 3575));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort131; local1368++) {
						local1547 = local1347.aShortArray62[local1368];
						local1552 = local1347.aShortArray67[local1368];
						local1557 = local1347.aShortArray68[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean679 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3351 || local383 > (float) arg2.anInt3351 || local447 > (float) arg2.anInt3351;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray69[local1368] != -1) {
								@Pc(1654) Class227 local1654 = this.aClass102_Sub2_1.aClass235_6.method26120(local1347.aShortArray69[local1368] & 0xFFFF, 73831368);
								local1636 = local1654.aBoolean753;
							}
							if (local1636) {
								arg2.method24876(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray63[local1547] / (float) (this.anInt447 * -1174710433), (float) local1347.aShortArray63[local1552] / (float) (this.anInt447 * -1174710433), (float) local1347.aShortArray63[local1557] / (float) (this.anInt447 * -1174710433), (float) local1347.aShortArray65[local1547] / (float) (this.anInt447 * -1174710433), (float) local1347.aShortArray65[local1552] / (float) (this.anInt447 * -1174710433), (float) local1347.aShortArray65[local1557] / (float) (this.anInt447 * -1174710433), Class325.anIntArray400[local1347.aShortArray70[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local1347.aShortArray70[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local1347.aShortArray70[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray69[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray289[local1368];
								if (local1806 != -1) {
									arg2.method24855(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class371.method28387(local1806, local1347.aShortArray70[local1547], (short) 18960), (float) Class371.method28387(local1806, local1347.aShortArray70[local1552], (short) 6740), (float) Class371.method28387(local1806, local1347.aShortArray70[local1557], (short) 6459));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte102 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte102 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt447 * -1174710433;
			local45 = local38 + this.anInt447 * -1174710433;
			@Pc(52) int local52 = arg1 * this.anInt447 * -1174710433;
			local59 = local52 + this.anInt447 * -1174710433;
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
			if ((local6.aByte102 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local71 + this.aFloat12 * (float) local52;
				local117 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local71 + this.aFloat13 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local528 + this.aFloat12 * (float) local52;
				local157 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local528 + this.aFloat13 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local539 + this.aFloat12 * (float) local59;
				local197 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local539 + this.aFloat13 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local548 + this.aFloat12 * (float) local59;
				local237 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local548 + this.aFloat13 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local71 + this.aFloat5 * (float) local52;
				local282 = arg2.aFloat251 + arg2.aFloat246 * local272 / local117;
				local299 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local71 + this.aFloat11 * (float) local52;
				local309 = arg2.aFloat247 + arg2.aFloat248 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat250 * local100 / local117;
				local336 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local528 + this.aFloat5 * (float) local52;
				local346 = arg2.aFloat251 + arg2.aFloat246 * local336 / local157;
				local363 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local528 + this.aFloat11 * (float) local52;
				local373 = arg2.aFloat247 + arg2.aFloat248 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat250 * local140 / local157;
				local400 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local539 + this.aFloat5 * (float) local59;
				local410 = arg2.aFloat251 + arg2.aFloat246 * local400 / local197;
				local427 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local539 + this.aFloat11 * (float) local59;
				local437 = arg2.aFloat247 + arg2.aFloat248 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat250 * local180 / local197;
				local464 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local548 + this.aFloat5 * (float) local59;
				local474 = arg2.aFloat251 + arg2.aFloat246 * local464 / local237;
				local491 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local548 + this.aFloat11 * (float) local59;
				local501 = arg2.aFloat247 + arg2.aFloat248 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat250 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat9 * (float) local71;
				@Pc(83) float local83 = this.aFloat19 * (float) local71;
				local100 = this.aFloat16 + this.aFloat18 * (float) local38 + local77 + this.aFloat12 * (float) local52;
				local117 = this.aFloat17 + this.aFloat6 * (float) local38 + local83 + this.aFloat13 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat16 + this.aFloat18 * (float) local45 + local77 + this.aFloat12 * (float) local52;
				local157 = this.aFloat17 + this.aFloat6 * (float) local45 + local83 + this.aFloat13 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat16 + this.aFloat18 * (float) local45 + local77 + this.aFloat12 * (float) local59;
				local197 = this.aFloat17 + this.aFloat6 * (float) local45 + local83 + this.aFloat13 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat16 + this.aFloat18 * (float) local38 + local77 + this.aFloat12 * (float) local59;
				local237 = this.aFloat17 + this.aFloat6 * (float) local38 + local83 + this.aFloat13 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat7 * (float) local71;
				@Pc(255) float local255 = this.aFloat8 * (float) local71;
				local272 = this.aFloat14 + this.aFloat10 * (float) local38 + local249 + this.aFloat5 * (float) local52;
				local282 = arg2.aFloat251 + arg2.aFloat246 * local272 / local117;
				local299 = this.aFloat15 + this.aFloat4 * (float) local38 + local255 + this.aFloat11 * (float) local52;
				local309 = arg2.aFloat247 + arg2.aFloat248 * local299 / local117;
				local319 = arg2.aFloat249 + arg2.aFloat250 * local100 / local117;
				local336 = this.aFloat14 + this.aFloat10 * (float) local45 + local249 + this.aFloat5 * (float) local52;
				local346 = arg2.aFloat251 + arg2.aFloat246 * local336 / local157;
				local363 = this.aFloat15 + this.aFloat4 * (float) local45 + local255 + this.aFloat11 * (float) local52;
				local373 = arg2.aFloat247 + arg2.aFloat248 * local363 / local157;
				local383 = arg2.aFloat249 + arg2.aFloat250 * local140 / local157;
				local400 = this.aFloat14 + this.aFloat10 * (float) local45 + local249 + this.aFloat5 * (float) local59;
				local410 = arg2.aFloat251 + arg2.aFloat246 * local400 / local197;
				local427 = this.aFloat15 + this.aFloat4 * (float) local45 + local255 + this.aFloat11 * (float) local59;
				local437 = arg2.aFloat247 + arg2.aFloat248 * local427 / local197;
				local447 = arg2.aFloat249 + arg2.aFloat250 * local180 / local197;
				local464 = this.aFloat14 + this.aFloat10 * (float) local38 + local249 + this.aFloat5 * (float) local59;
				local474 = arg2.aFloat251 + arg2.aFloat246 * local464 / local237;
				local491 = this.aFloat15 + this.aFloat4 * (float) local38 + local255 + this.aFloat11 * (float) local59;
				local501 = arg2.aFloat247 + arg2.aFloat248 * local491 / local237;
				local511 = arg2.aFloat249 + arg2.aFloat250 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort136 != -1) {
				@Pc(1044) Class227 local1044 = this.aClass102_Sub2_1.aClass235_6.method26120(local6.aShort136 & 0xFFFF, 73831368);
				local1030 = local1044.aBoolean753;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean679 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3351 || local474 > (float) arg2.anInt3351 || local346 > (float) arg2.anInt3351;
				if (local1030) {
					arg2.method24876(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class325.anIntArray400[local6.aShort134 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local6.aShort135 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local6.aShort133 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort136 & 0xFFFF);
				} else {
					arg2.method24855(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort134 & 0xFFFF), (float) (local6.aShort135 & 0xFFFF), (float) (local6.aShort133 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean679 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3351 || local346 > (float) arg2.anInt3351 || local474 > (float) arg2.anInt3351;
				if (local1030) {
					arg2.method24876(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class325.anIntArray400[local6.aShort132 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local6.aShort133 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class325.anIntArray400[local6.aShort135 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort136 & 0xFFFF);
				} else {
					arg2.method24855(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort132 & 0xFFFF), (float) (local6.aShort133 & 0xFFFF), (float) (local6.aShort135 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "v", descriptor = "()V")
	@Override
	public void method2930() {
		this.aByteArrayArray3 = null;
		this.aByteArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aep", name = "as", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort137; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt445 * -615169581);
			@Pc(38) int local38 = local6.aShortArray73[local17];
			@Pc(50) int local50 = local6.aShortArray74[local17] + (arg1 << this.anInt445 * -615169581);
			@Pc(71) float local71 = this.aFloat16 + this.aFloat18 * (float) local33 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local50;
			@Pc(92) float local92 = this.aFloat17 + this.aFloat6 * (float) local33 + this.aFloat19 * (float) local38 + this.aFloat13 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat224;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray75[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean552) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat224;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat14 + this.aFloat10 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat5 * (float) local50;
			@Pc(215) float local215 = this.aFloat15 + this.aFloat4 * (float) local33 + this.aFloat8 * (float) local38 + this.aFloat11 * (float) local50;
			arg5[local17] = arg4.aFloat251 + arg4.aFloat246 * local194 / local92;
			arg6[local17] = arg4.aFloat247 + arg4.aFloat248 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat250 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt447 * -1174710433);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort138; local265++) {
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
				arg4.aBoolean679 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3351 || local289 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt445 * -615169581;
					@Pc(386) int local386 = arg1 << this.anInt445 * -615169581;
					if ((local6.anIntArray295[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray71[local137] == -1 || local6.aShortArray71[local277] == -1 || local6.aShortArray71[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class335.method27856(local6.anIntArray295[local137], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, 609737856), Class335.method27856(local6.anIntArray295[local277], arg3.anInt3017 * -780958117, arg9[local277] * 255.0F, 1564776912), Class335.method27856(local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local281] * 255.0F, 1714939702));
							} else {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281]);
							}
						} else if (local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281] && local6.aShortArray76[local137] == local6.aShortArray76[local277] && local6.aShortArray76[local137] == local6.aShortArray76[local281]) {
							arg4.method24876(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray76[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray76[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray76[local281], (float) (local386 + local6.aShortArray74[local137]) / (float) local6.aShortArray76[local137], (float) (local386 + local6.aShortArray74[local277]) / (float) local6.aShortArray76[local277], (float) (local386 + local6.aShortArray74[local281]) / (float) local6.aShortArray76[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF);
						} else {
							arg4.method24867(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray74[local137]) / local263, (float) (local386 + local6.aShortArray74[local277]) / local263, (float) (local386 + local6.aShortArray74[local281]) / local263, local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF, local263 / (float) local6.aShortArray76[local137], local6.aShortArray71[local277] & 0xFFFF, local263 / (float) local6.aShortArray76[local277], local6.aShortArray71[local281] & 0xFFFF, local263 / (float) local6.aShortArray76[local281]);
						}
					}
				} else {
					arg4.method24897(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "u", descriptor = "()V")
	@Override
	public void method2912() {
		this.aByteArrayArray3 = null;
		this.aByteArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aep", name = "bt", descriptor = "(III)V")
	void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		local4.aClass195_2.anInt3350 = 0;
		if (this.aClass193ArrayArray1 != null) {
			this.method2515(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2509(arg0, arg1, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method2510(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "bg", descriptor = "(IIIIIII[[ZLclient!ar;Lclient!bt;[F[F)V")
	void method2512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class169 arg8, @OriginalArg(9) Class195 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean554;
		this.aClass102_Sub2_1.method20762(false);
		arg9.aBoolean678 = false;
		arg9.aBoolean681 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass178ArrayArray1[local32][local37] != null) {
						@Pc(64) Class178 local64 = this.aClass178ArrayArray1[local32][local37];
						if (local64.aShort136 != -1 && (local64.aByte102 & 0x2) == 0 && local64.anInt3310 == -1) {
							local85 = this.aClass102_Sub2_1.method5064(local64.aShort136 & 0xFFFF);
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local85, local64.aShort134 & 0xFFFF, (short) -8335), (float) Class371.method28387(local85, local64.aShort135 & 0xFFFF, (short) -16092), (float) Class371.method28387(local85, local64.aShort133 & 0xFFFF, (short) 5914));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local85, local64.aShort132 & 0xFFFF, (short) 14417), (float) Class371.method28387(local85, local64.aShort133 & 0xFFFF, (short) 11340), (float) Class371.method28387(local85, local64.aShort135 & 0xFFFF, (short) -5518));
						} else if (local64.anInt3310 == -1) {
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort134 & 0xFFFF), (float) (local64.aShort135 & 0xFFFF), (float) (local64.aShort133 & 0xFFFF));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort132 & 0xFFFF), (float) (local64.aShort133 & 0xFFFF), (float) (local64.aShort135 & 0xFFFF));
						} else {
							local85 = local64.anInt3310;
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass173ArrayArray1[local32][local37] != null) {
						@Pc(355) Class173 local355 = this.aClass173ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort130; local85++) {
							arg10[local85] = local26 + local355.aShortArray63[local85] * local11 / (this.anInt447 * -1174710433);
							arg11[local85] = local30 - local355.aShortArray65[local85] * local11 / (this.anInt447 * -1174710433);
						}
						for (local85 = 0; local85 < local355.aShort131; local85++) {
							@Pc(408) short local408 = local355.aShortArray62[local85];
							@Pc(413) short local413 = local355.aShortArray67[local85];
							@Pc(418) short local418 = local355.aShortArray68[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray290 != null && local355.anIntArray290[local85] != -1) {
								local456 = local355.anIntArray290[local85];
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) 8522), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) 19974), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) 2133));
							} else if (local355.aShortArray69 == null || local355.aShortArray69[local85] == -1) {
								local456 = local355.anIntArray289[local85];
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) 6369), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) 890), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) -15776));
							} else {
								local456 = this.aClass102_Sub2_1.method5064(local355.aShortArray69[local85] & 0xFFFF);
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) 16218), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) -26165), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) 14547));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean678 = true;
		this.aClass102_Sub2_1.method20762(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bl", descriptor = "(IIIIIII[[ZLclient!ar;Lclient!bt;[F[F)V")
	void method2513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class169 arg8, @OriginalArg(9) Class195 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean554;
		this.aClass102_Sub2_1.method20762(false);
		arg9.aBoolean678 = false;
		arg9.aBoolean681 = false;
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
					if (this.aClass193ArrayArray1 == null) {
						if (this.aClass186ArrayArray1[local32][local37] != null) {
							@Pc(596) Class186 local596 = this.aClass186ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt447 * -1174710433);
								arg11[local87] = local30 - local596.aShortArray74[local87] * local11 / (this.anInt447 * -1174710433);
							}
							for (local87 = 0; local87 < local596.aShort138; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray294 == null || local596.anIntArray294[local87] == 0) {
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray295[local408], local596.anIntArray295[local412], local596.anIntArray295[local416]);
								} else {
									local465 = local596.anIntArray294[local87];
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass193ArrayArray1[local32][local37] != null) {
						@Pc(67) Class193 local67 = this.aClass193ArrayArray1[local32][local37];
						if (local67.aShort149 != -1 && (local67.aByte108 & 0x2) == 0 && local67.anInt3346 == 0) {
							local87 = this.aClass102_Sub2_1.method5064(local67.aShort149 & 0xFFFF);
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3344, (short) 12915), (float) Class371.method28387(local87, local67.anInt3345, (short) 8143), (float) Class371.method28387(local87, local67.anInt3342, (short) 10336));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3343, (short) -4386), (float) Class371.method28387(local87, local67.anInt3342, (short) 20530), (float) Class371.method28387(local87, local67.anInt3345, (short) -9233));
						} else if (local67.anInt3346 == 0) {
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3344, local67.anInt3345, local67.anInt3342);
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3343, local67.anInt3342, local67.anInt3345);
						} else {
							local87 = local67.anInt3346;
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3344 & 0xFF000000, (byte) 98), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 105), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 36));
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3343 & 0xFF000000, (byte) 93), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 33), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 72));
						}
					} else if (this.aClass190ArrayArray1[local32][local37] != null) {
						@Pc(356) Class190 local356 = this.aClass190ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray82[local87] * local11 / (this.anInt447 * -1174710433);
							arg11[local87] = local30 - local356.aShortArray79[local87] * local11 / (this.anInt447 * -1174710433);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray297 != null && local356.anIntArray297[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray297[local87];
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class363.method28160(local465, -16777216 - (local356.anIntArray296[local408] & -16777216), (byte) 54), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local412] & -16777216), (byte) 111), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local416] & -16777216), (byte) 38));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray296[local408], local356.anIntArray296[local412], local356.anIntArray296[local416]);
							} else {
								local465 = this.aClass102_Sub2_1.method5064(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24855(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean678 = true;
		this.aClass102_Sub2_1.method20762(local14);
	}

	@OriginalMember(owner = "client!aep", name = "a", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "s", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2920(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "x", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2922(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aep", name = "k", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2921(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "w", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2923(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aep", name = "aw", descriptor = "(I)Z")
	boolean method2514(@OriginalArg(0) int arg0) {
		if ((this.anInt378 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aep", name = "ah", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2945(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aep", name = "h", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass178ArrayArray1 == null) {
			this.aClass178ArrayArray1 = new Class178[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass173ArrayArray1 = new Class173[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
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
				if (local77 != 0 && local77 != this.anInt447 * -1174710433 || local83 != 0 && local83 != this.anInt447 * -1174710433) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class173 local110 = new Class173();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort130 = local114;
			local110.aShortArray70 = new short[local114];
			local110.aShortArray63 = new short[local114];
			local110.aShortArray64 = new short[local114];
			local110.aShortArray65 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray70[local139] = (short) (local315 * (this.anInt447 * -1174710433 - local150) + local364 * local150 >> this.anInt445 * -1230339162);
				}
				local315 = (arg0 << this.anInt445 * -615169581) + local146;
				local364 = (arg1 << this.anInt445 * -615169581) + local150;
				local110.aShortArray63[local139] = (short) local146;
				local110.aShortArray65[local139] = (short) local150;
				local110.aShortArray64[local139] = (short) (this.method2915(local315, local364, (byte) -12) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray70[local139] < 2) {
					local110.aShortArray70[local139] = 2;
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
					@Pc(482) Class227 local482 = this.aClass102_Sub2_1.aClass235_6.method26120(local315, 73831368);
					if (!local482.aBoolean758) {
						local449 = true;
						if (this.method2514(local482.aByte110) || local482.aFloat263 != 0.0F || local482.aFloat264 != 0.0F) {
							local110.aByte101 = (byte) (local110.aByte101 | 0x4);
						}
					}
				}
			}
			local110.anIntArray289 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray290 = new int[local146];
			}
			local110.aShortArray62 = new short[local146];
			local110.aShortArray67 = new short[local146];
			local110.aShortArray68 = new short[local146];
			if (local449) {
				local110.aShortArray69 = new short[local146];
				local110.aShortArray66 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray289[local110.aShort131] = Class80_Sub22.method21675(arg9[local150], 1891740057);
					} else {
						local110.anIntArray289[local110.aShort131] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray290[local110.aShort131] = -1;
						} else {
							local110.anIntArray290[local110.aShort131] = Class80_Sub22.method21675(arg10[local150], 1350004935);
						}
					}
					local110.aShortArray62[local110.aShort131] = (short) arg6[local150];
					local110.aShortArray67[local110.aShort131] = (short) arg7[local150];
					local110.aShortArray68[local110.aShort131] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(arg11[local150], 73831368).aBoolean758) {
							local110.aShortArray69[local110.aShort131] = -1;
						} else {
							local110.aShortArray69[local110.aShort131] = (short) arg11[local150];
							local110.aShortArray66[local110.aShort131] = (short) arg12[local150];
						}
					}
					local110.aShort131++;
				}
			}
			this.aClass173ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class178 local704 = new Class178();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3310 = Class371.method28387(Class80_Sub22.method21675(arg10[0], 1668253653), this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) 10340);
				if (local77 == -1) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte102 = (byte) (local704.aByte102 | 0x1);
			}
			@Pc(802) Class227 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass102_Sub2_1.aClass235_6.method26120(local83, 73831368);
			}
			if (local802 == null || (local704.aByte102 & 0x2) != 0 || local802.aBoolean758) {
				@Pc(933) short local933 = Class80_Sub22.method21675(local77, 1360204705);
				local704.aShort132 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) -4793);
				local704.aShort133 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1], (short) 7299);
				local704.aShort134 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1], (short) 20303);
				local704.aShort135 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1], (short) 6902);
				local704.aShort136 = -1;
			} else {
				local704.aShort132 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				local704.aShort133 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				local704.aShort134 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				local704.aShort135 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				local704.aShort136 = (short) local83;
				if (this.method2514(local802.aByte110) || local802.aFloat263 != 0.0F || local802.aFloat264 != 0.0F) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x4);
				}
			}
			this.aClass178ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aep", name = "d", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass178ArrayArray1 == null) {
			this.aClass178ArrayArray1 = new Class178[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass173ArrayArray1 = new Class173[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
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
				if (local77 != 0 && local77 != this.anInt447 * -1174710433 || local83 != 0 && local83 != this.anInt447 * -1174710433) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class173 local110 = new Class173();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort130 = local114;
			local110.aShortArray70 = new short[local114];
			local110.aShortArray63 = new short[local114];
			local110.aShortArray64 = new short[local114];
			local110.aShortArray65 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray70[local139] = (short) (local315 * (this.anInt447 * -1174710433 - local150) + local364 * local150 >> this.anInt445 * -1230339162);
				}
				local315 = (arg0 << this.anInt445 * -615169581) + local146;
				local364 = (arg1 << this.anInt445 * -615169581) + local150;
				local110.aShortArray63[local139] = (short) local146;
				local110.aShortArray65[local139] = (short) local150;
				local110.aShortArray64[local139] = (short) (this.method2915(local315, local364, (byte) -34) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray70[local139] < 2) {
					local110.aShortArray70[local139] = 2;
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
					@Pc(482) Class227 local482 = this.aClass102_Sub2_1.aClass235_6.method26120(local315, 73831368);
					if (!local482.aBoolean758) {
						local449 = true;
						if (this.method2514(local482.aByte110) || local482.aFloat263 != 0.0F || local482.aFloat264 != 0.0F) {
							local110.aByte101 = (byte) (local110.aByte101 | 0x4);
						}
					}
				}
			}
			local110.anIntArray289 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray290 = new int[local146];
			}
			local110.aShortArray62 = new short[local146];
			local110.aShortArray67 = new short[local146];
			local110.aShortArray68 = new short[local146];
			if (local449) {
				local110.aShortArray69 = new short[local146];
				local110.aShortArray66 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray289[local110.aShort131] = Class80_Sub22.method21675(arg9[local150], 827773836);
					} else {
						local110.anIntArray289[local110.aShort131] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray290[local110.aShort131] = -1;
						} else {
							local110.anIntArray290[local110.aShort131] = Class80_Sub22.method21675(arg10[local150], 839158279);
						}
					}
					local110.aShortArray62[local110.aShort131] = (short) arg6[local150];
					local110.aShortArray67[local110.aShort131] = (short) arg7[local150];
					local110.aShortArray68[local110.aShort131] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(arg11[local150], 73831368).aBoolean758) {
							local110.aShortArray69[local110.aShort131] = -1;
						} else {
							local110.aShortArray69[local110.aShort131] = (short) arg11[local150];
							local110.aShortArray66[local110.aShort131] = (short) arg12[local150];
						}
					}
					local110.aShort131++;
				}
			}
			this.aClass173ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class178 local704 = new Class178();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3310 = Class371.method28387(Class80_Sub22.method21675(arg10[0], 1331189350), this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) 11901);
				if (local77 == -1) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte102 = (byte) (local704.aByte102 | 0x1);
			}
			@Pc(802) Class227 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass102_Sub2_1.aClass235_6.method26120(local83, 73831368);
			}
			if (local802 == null || (local704.aByte102 & 0x2) != 0 || local802.aBoolean758) {
				@Pc(933) short local933 = Class80_Sub22.method21675(local77, 617012182);
				local704.aShort132 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) -10072);
				local704.aShort133 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1], (short) 13830);
				local704.aShort134 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1], (short) 5849);
				local704.aShort135 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1], (short) -18328);
				local704.aShort136 = -1;
			} else {
				local704.aShort132 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				local704.aShort133 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				local704.aShort134 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				local704.aShort135 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				local704.aShort136 = (short) local83;
				if (this.method2514(local802.aByte110) || local802.aFloat263 != 0.0F || local802.aFloat264 != 0.0F) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x4);
				}
			}
			this.aClass178ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aep", name = "az", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class193 local6 = this.aClass193ArrayArray1[arg0][arg1];
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
			@Pc(2006) Class190 local2006 = this.aClass190ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte107 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray82[local2027] + (arg0 << this.anInt445 * -615169581);
					local52 = local2006.aShortArray78[local2027];
					local59 = local2006.aShortArray79[local2027] + (arg1 << this.anInt445 * -615169581);
					local523 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local52 + this.aFloat12 * (float) local59;
					local577 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local52 + this.aFloat13 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat250 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat224;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray80[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean552) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat224;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat5 * (float) local59;
					local469 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local52 + this.aFloat11 * (float) local59;
					arg5[local2027] = arg4.aFloat251 + arg4.aFloat246 * local415 / local577;
					arg6[local2027] = arg4.aFloat247 + arg4.aFloat248 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							if (local567 >= 3.0F) {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class335.method27856(local2006.anIntArray296[local2282], arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, 2102606499), Class335.method27856(local2006.anIntArray296[local2157], arg3.anInt3017 * -780958117, arg9[local2157] * 255.0F, 1682844875), Class335.method27856(local2006.anIntArray296[local2290], arg3.anInt3017 * -780958117, arg9[local2290] * 255.0F, 2144551228));
								}
							} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
								arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							@Pc(2381) Class227 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass102_Sub2_1.aClass235_6.method26120(local2006.aShortArray81[local2027] & 0xFFFF, 73831368);
								local2383 = local2381.aBoolean753;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method2514(local2381.aByte110)) {
											local2416 = -1694498816;
										}
										arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
										arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class363.method28160(local2006.anIntArray296[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 19), Class363.method28160(local2006.anIntArray296[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 100), Class363.method28160(local2006.anIntArray296[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 32));
										arg4.anInt3350 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method2514(local2381.aByte110)) {
										local2416 = -1694498816;
									}
									arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
									arg4.anInt3350 = 0;
								}
							} else {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt447 * -1174710433;
			local45 = local38 + this.anInt447 * -1174710433;
			local52 = arg1 * this.anInt447 * -1174710433;
			local59 = local52 + this.anInt447 * -1174710433;
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
			if ((local6.aByte108 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local81 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local81 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local621 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local621 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local632 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local632 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local641 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local641 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort146 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort147 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort148 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort145 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local81 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local621 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local632 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local641 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat9 * (float) local81;
				@Pc(93) float local93 = this.aFloat19 * (float) local81;
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat7 * (float) local81;
				@Pc(388) float local388 = this.aFloat8 * (float) local81;
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			}
			@Pc(1349) Class227 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort149 != -1) {
				local1349 = this.aClass102_Sub2_1.aClass235_6.method26120(local6.aShort149 & 0xFFFF, 73831368);
				local1351 = local1349.aBoolean753;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method2514(local1349.aByte110);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean679 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351;
				if (local382 >= 3.0F) {
					arg4.method24897(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3017 * -780958117);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3017 * -780958117, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class363.method28160(local6.anInt3344, (int) (local65 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 20), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 93), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 106));
						arg4.anInt3350 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3350 = 100;
					}
					arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3344, local6.anInt3345, local6.anInt3342);
					arg4.anInt3350 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean679 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3350 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, arg3.anInt3017 * -780958117, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort149 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3350 = 100;
							}
							arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class363.method28160(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 29), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 99), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 18));
							arg4.anInt3350 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3342, local6.anInt3345);
						arg4.anInt3350 = 0;
					}
				} else {
					arg4.method24897(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "z", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass178ArrayArray1 == null) {
			this.aClass178ArrayArray1 = new Class178[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass173ArrayArray1 = new Class173[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
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
				if (local77 != 0 && local77 != this.anInt447 * -1174710433 || local83 != 0 && local83 != this.anInt447 * -1174710433) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class173 local110 = new Class173();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort130 = local114;
			local110.aShortArray70 = new short[local114];
			local110.aShortArray63 = new short[local114];
			local110.aShortArray64 = new short[local114];
			local110.aShortArray65 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == this.anInt447 * -1174710433) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt447 * -1174710433 && local150 == 0) {
					local110.aShortArray70[local139] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local146) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray70[local139] = (short) (local315 * (this.anInt447 * -1174710433 - local150) + local364 * local150 >> this.anInt445 * -1230339162);
				}
				local315 = (arg0 << this.anInt445 * -615169581) + local146;
				local364 = (arg1 << this.anInt445 * -615169581) + local150;
				local110.aShortArray63[local139] = (short) local146;
				local110.aShortArray65[local139] = (short) local150;
				local110.aShortArray64[local139] = (short) (this.method2915(local315, local364, (byte) -114) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray70[local139] < 2) {
					local110.aShortArray70[local139] = 2;
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
					@Pc(482) Class227 local482 = this.aClass102_Sub2_1.aClass235_6.method26120(local315, 73831368);
					if (!local482.aBoolean758) {
						local449 = true;
						if (this.method2514(local482.aByte110) || local482.aFloat263 != 0.0F || local482.aFloat264 != 0.0F) {
							local110.aByte101 = (byte) (local110.aByte101 | 0x4);
						}
					}
				}
			}
			local110.anIntArray289 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray290 = new int[local146];
			}
			local110.aShortArray62 = new short[local146];
			local110.aShortArray67 = new short[local146];
			local110.aShortArray68 = new short[local146];
			if (local449) {
				local110.aShortArray69 = new short[local146];
				local110.aShortArray66 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray289[local110.aShort131] = Class80_Sub22.method21675(arg9[local150], 1698106923);
					} else {
						local110.anIntArray289[local110.aShort131] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray290[local110.aShort131] = -1;
						} else {
							local110.anIntArray290[local110.aShort131] = Class80_Sub22.method21675(arg10[local150], 1009226303);
						}
					}
					local110.aShortArray62[local110.aShort131] = (short) arg6[local150];
					local110.aShortArray67[local110.aShort131] = (short) arg7[local150];
					local110.aShortArray68[local110.aShort131] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(arg11[local150], 73831368).aBoolean758) {
							local110.aShortArray69[local110.aShort131] = -1;
						} else {
							local110.aShortArray69[local110.aShort131] = (short) arg11[local150];
							local110.aShortArray66[local110.aShort131] = (short) arg12[local150];
						}
					}
					local110.aShort131++;
				}
			}
			this.aClass173ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(704) Class178 local704 = new Class178();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local704.anInt3310 = Class371.method28387(Class80_Sub22.method21675(arg10[0], 1137596771), this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) 7552);
				if (local77 == -1) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local704.aByte102 = (byte) (local704.aByte102 | 0x1);
			}
			@Pc(802) Class227 local802 = null;
			if (local83 != -1) {
				local802 = this.aClass102_Sub2_1.aClass235_6.method26120(local83, 73831368);
			}
			if (local802 == null || (local704.aByte102 & 0x2) != 0 || local802.aBoolean758) {
				@Pc(933) short local933 = Class80_Sub22.method21675(local77, 2098616547);
				local704.aShort132 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1], (short) -9032);
				local704.aShort133 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1], (short) 25640);
				local704.aShort134 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1], (short) -24707);
				local704.aShort135 = (short) Class371.method28387(local933, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1], (short) -12329);
				local704.aShort136 = -1;
			} else {
				local704.aShort132 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]);
				local704.aShort133 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]);
				local704.aShort134 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]);
				local704.aShort135 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]);
				local704.aShort136 = (short) local83;
				if (this.method2514(local802.aByte110) || local802.aFloat263 != 0.0F || local802.aFloat264 != 0.0F) {
					local704.aByte102 = (byte) (local704.aByte102 | 0x4);
				}
			}
			this.aClass178ArrayArray1[arg0][arg1] = local704;
		}
	}

	@OriginalMember(owner = "client!aep", name = "ai", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "bj", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class193 local6 = this.aClass193ArrayArray1[arg0][arg1];
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
			@Pc(2006) Class190 local2006 = this.aClass190ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte107 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray82[local2027] + (arg0 << this.anInt445 * -615169581);
					local52 = local2006.aShortArray78[local2027];
					local59 = local2006.aShortArray79[local2027] + (arg1 << this.anInt445 * -615169581);
					local523 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local52 + this.aFloat12 * (float) local59;
					local577 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local52 + this.aFloat13 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat250 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat224;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray80[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean552) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat224;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat5 * (float) local59;
					local469 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local52 + this.aFloat11 * (float) local59;
					arg5[local2027] = arg4.aFloat251 + arg4.aFloat246 * local415 / local577;
					arg6[local2027] = arg4.aFloat247 + arg4.aFloat248 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							if (local567 >= 3.0F) {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class335.method27856(local2006.anIntArray296[local2282], arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, 352593790), Class335.method27856(local2006.anIntArray296[local2157], arg3.anInt3017 * -780958117, arg9[local2157] * 255.0F, 1945025585), Class335.method27856(local2006.anIntArray296[local2290], arg3.anInt3017 * -780958117, arg9[local2290] * 255.0F, 1132510091));
								}
							} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
								arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							@Pc(2381) Class227 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass102_Sub2_1.aClass235_6.method26120(local2006.aShortArray81[local2027] & 0xFFFF, 73831368);
								local2383 = local2381.aBoolean753;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method2514(local2381.aByte110)) {
											local2416 = -1694498816;
										}
										arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
										arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class363.method28160(local2006.anIntArray296[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 56), Class363.method28160(local2006.anIntArray296[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 37), Class363.method28160(local2006.anIntArray296[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 110));
										arg4.anInt3350 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method2514(local2381.aByte110)) {
										local2416 = -1694498816;
									}
									arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
									arg4.anInt3350 = 0;
								}
							} else {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt447 * -1174710433;
			local45 = local38 + this.anInt447 * -1174710433;
			local52 = arg1 * this.anInt447 * -1174710433;
			local59 = local52 + this.anInt447 * -1174710433;
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
			if ((local6.aByte108 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local81 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local81 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local621 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local621 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local632 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local632 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local641 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local641 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort146 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort147 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort148 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort145 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local81 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local621 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local632 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local641 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat9 * (float) local81;
				@Pc(93) float local93 = this.aFloat19 * (float) local81;
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat7 * (float) local81;
				@Pc(388) float local388 = this.aFloat8 * (float) local81;
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			}
			@Pc(1349) Class227 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort149 != -1) {
				local1349 = this.aClass102_Sub2_1.aClass235_6.method26120(local6.aShort149 & 0xFFFF, 73831368);
				local1351 = local1349.aBoolean753;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method2514(local1349.aByte110);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean679 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351;
				if (local382 >= 3.0F) {
					arg4.method24897(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3017 * -780958117);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3017 * -780958117, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class363.method28160(local6.anInt3344, (int) (local65 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 123), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 103), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 105));
						arg4.anInt3350 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3350 = 100;
					}
					arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3344, local6.anInt3345, local6.anInt3342);
					arg4.anInt3350 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean679 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3350 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, arg3.anInt3017 * -780958117, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort149 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3350 = 100;
							}
							arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class363.method28160(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 74), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 52), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 40));
							arg4.anInt3350 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3342, local6.anInt3345);
						arg4.anInt3350 = 0;
					}
				} else {
					arg4.method24897(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "y", descriptor = "(III[[ZZI)V")
	@Override
	public void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass102_Sub2_1.anIntArray50 == null || this.aClass102_Sub2_1.aFloatArray12 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub2_1.aClass487_20;
		this.aFloat10 = local16.aFloatArray114[0];
		this.aFloat4 = local16.aFloatArray114[1];
		this.aFloat18 = local16.aFloatArray114[2];
		this.aFloat6 = local16.aFloatArray114[3];
		this.aFloat7 = local16.aFloatArray114[4];
		this.aFloat8 = local16.aFloatArray114[5];
		this.aFloat9 = local16.aFloatArray114[6];
		this.aFloat19 = local16.aFloatArray114[7];
		this.aFloat5 = local16.aFloatArray114[8];
		this.aFloat11 = local16.aFloatArray114[9];
		this.aFloat12 = local16.aFloatArray114[10];
		this.aFloat13 = local16.aFloatArray114[11];
		this.aFloat14 = local16.aFloatArray114[12];
		this.aFloat15 = local16.aFloatArray114[13];
		this.aFloat16 = local16.aFloatArray114[14];
		this.aFloat17 = local16.aFloatArray114[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt448 * -1548585779 && local145 >= 0 && local145 < this.anInt446 * -1356799781) {
						this.method2508(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "(III[[ZZI)V")
	@Override
	public void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass102_Sub2_1.anIntArray50 == null || this.aClass102_Sub2_1.aFloatArray12 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub2_1.aClass487_20;
		this.aFloat10 = local16.aFloatArray114[0];
		this.aFloat4 = local16.aFloatArray114[1];
		this.aFloat18 = local16.aFloatArray114[2];
		this.aFloat6 = local16.aFloatArray114[3];
		this.aFloat7 = local16.aFloatArray114[4];
		this.aFloat8 = local16.aFloatArray114[5];
		this.aFloat9 = local16.aFloatArray114[6];
		this.aFloat19 = local16.aFloatArray114[7];
		this.aFloat5 = local16.aFloatArray114[8];
		this.aFloat11 = local16.aFloatArray114[9];
		this.aFloat12 = local16.aFloatArray114[10];
		this.aFloat13 = local16.aFloatArray114[11];
		this.aFloat14 = local16.aFloatArray114[12];
		this.aFloat15 = local16.aFloatArray114[13];
		this.aFloat16 = local16.aFloatArray114[14];
		this.aFloat17 = local16.aFloatArray114[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt448 * -1548585779 && local145 >= 0 && local145 < this.anInt446 * -1356799781) {
						this.method2508(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "c", descriptor = "(III[[ZZI)V")
	@Override
	public void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass102_Sub2_1.anIntArray50 == null || this.aClass102_Sub2_1.aFloatArray12 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub2_1.aClass487_20;
		this.aFloat10 = local16.aFloatArray114[0];
		this.aFloat4 = local16.aFloatArray114[1];
		this.aFloat18 = local16.aFloatArray114[2];
		this.aFloat6 = local16.aFloatArray114[3];
		this.aFloat7 = local16.aFloatArray114[4];
		this.aFloat8 = local16.aFloatArray114[5];
		this.aFloat9 = local16.aFloatArray114[6];
		this.aFloat19 = local16.aFloatArray114[7];
		this.aFloat5 = local16.aFloatArray114[8];
		this.aFloat11 = local16.aFloatArray114[9];
		this.aFloat12 = local16.aFloatArray114[10];
		this.aFloat13 = local16.aFloatArray114[11];
		this.aFloat14 = local16.aFloatArray114[12];
		this.aFloat15 = local16.aFloatArray114[13];
		this.aFloat16 = local16.aFloatArray114[14];
		this.aFloat17 = local16.aFloatArray114[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt448 * -1548585779 && local145 >= 0 && local145 < this.anInt446 * -1356799781) {
						this.method2508(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bn", descriptor = "(III)V")
	void method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		local4.aClass195_2.anInt3350 = 0;
		if (this.aClass193ArrayArray1 != null) {
			this.method2515(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2509(arg0, arg1, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method2510(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "f", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt378 & 0x20) == 0;
		if (this.aClass193ArrayArray1 == null && !local8) {
			this.aClass193ArrayArray1 = new Class193[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass190ArrayArray1 = new Class190[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass186ArrayArray1 == null && local8) {
			this.aClass186ArrayArray1 = new Class186[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass178ArrayArray1 != null) {
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
				arg6[local68] = Class325.anIntArray400[Class80_Sub22.method21675(arg6[local68], 1895652630) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class325.anIntArray400[Class80_Sub22.method21675(arg7[local68], 1143269512) & 0xFFFF] << 8 | 0xFF;
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
			local142.aShort137 = (short) arg2.length;
			local142.aShort138 = (short) (arg2.length / 3);
			local142.aShortArray72 = new short[local142.aShort137];
			local142.aShortArray73 = new short[local142.aShort137];
			local142.aShortArray74 = new short[local142.aShort137];
			local142.anIntArray295 = new int[local142.aShort137];
			local142.aShortArray71 = new short[local142.aShort137];
			local142.aShortArray76 = new short[local142.aShort137];
			local142.aByteArray65 = new byte[local142.aShort137];
			if (arg5 != null) {
				local142.aShortArray75 = new short[local142.aShort137];
			}
			for (local198 = 0; local198 < local142.aShort137; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt447 * -1174710433) {
					local230 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
				} else if (local206 == this.anInt447 * -1174710433 && local210 == this.anInt447 * -1174710433) {
					local230 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt447 * -1174710433 && local210 == 0) {
					local230 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local206) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local206) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt447 * -1174710433 - local210) + local410 * local210 >> this.anInt445 * -1230339162;
				}
				local361 = (arg0 << this.anInt445 * -615169581) + local206;
				local410 = (arg1 << this.anInt445 * -615169581) + local210;
				local142.aShortArray72[local198] = (short) local206;
				local142.aShortArray74[local198] = (short) local210;
				local142.aShortArray73[local198] = (short) (this.method2915(local361, local410, (byte) -85) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray295[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray75[local198] = (short) arg5[local198];
						if (arg10.anInt3685 * -692202347 != 0) {
							local500 = local512 * 255 / (arg10.anInt3685 * -692202347);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class227 local552 = this.aClass102_Sub2_1.aClass235_6.method26120(arg8[local198], 73831368);
						if (local552.aBoolean753 && this.method2514(local552.aByte110)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray295[local198] = local538 | Class163.method15759(method2518(arg6[local198] >> 8, local230), arg10.anInt3687 * 1682209477, local500, -2090374189);
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				}
				local142.aShortArray71[local198] = (short) arg8[local198];
				local142.aShortArray76[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray294 = new int[local142.aShort138];
				for (local198 = 0; local198 < local142.aShort138; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray294[local198] = arg7[local206] >> 8 | 0xFF000000;
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
				} else if (arg2[local361] == this.anInt447 * -1174710433 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt447 * -1174710433 && arg4[local361] == this.anInt447 * -1174710433) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt447 * -1174710433) {
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
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt447 * -1174710433 && arg2[local361] != arg2[0] - this.anInt447 * -1174710433) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt447 * -1174710433 && arg4[local361] != arg4[0] - this.anInt447 * -1174710433) {
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
			@Pc(1753) Class190 local1753 = new Class190();
			local1753.aShort143 = (short) arg2.length;
			local1753.aShort144 = (short) (arg2.length / 3);
			local1753.aShortArray82 = new short[local1753.aShort143];
			local1753.aShortArray78 = new short[local1753.aShort143];
			local1753.aShortArray79 = new short[local1753.aShort143];
			local1753.anIntArray296 = new int[local1753.aShort143];
			if (arg5 != null) {
				local1753.aShortArray80 = new short[local1753.aShort143];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort143; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt447 * -1174710433) {
					local1826 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
				} else if (local500 == this.anInt447 * -1174710433 && local538 == this.anInt447 * -1174710433) {
					local1826 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt447 * -1174710433 && local538 == 0) {
					local1826 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local500) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local500) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt447 * -1174710433 - local538) + local2006 * local538 >> this.anInt445 * -1230339162;
				}
				local1957 = (arg0 << this.anInt445 * -615169581) + local500;
				local2006 = (arg1 << this.anInt445 * -615169581) + local538;
				local1753.aShortArray82[local410] = (short) local500;
				local1753.aShortArray79[local410] = (short) local538;
				local1753.aShortArray78[local410] = (short) (this.method2915(local1957, local2006, (byte) -120) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray80[local410] = (short) arg5[local410];
						if (arg10.anInt3685 * -692202347 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3685 * -692202347);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray296[local410] = Class163.method15759(method2518(arg6[local410] >> 8, local1826), arg10.anInt3687 * 1682209477, local2098, 356888867);
					if (arg7 != null) {
						local1753.anIntArray296[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray296[local410] = 0;
				} else {
					local1753.anIntArray296[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(arg8[local500 * 3], 73831368).aBoolean758) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray297 = new int[local1753.aShort144];
			}
			if (local2168) {
				local1753.aShortArray81 = new short[local1753.aShort144];
				local1753.aShortArray77 = new short[local1753.aShort144];
			}
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray297[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray81[local500] = (short) local2259;
						local1753.aShortArray77[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local538] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 417675376) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local1826] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 2120705219) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local1957] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 1561298855) & 0xFFFF];
							}
						}
						local1753.aShortArray81[local500] = -1;
					}
				}
			}
			this.aClass190ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class193 local900 = new Class193();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3346 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte108 = (byte) (local900.aByte108 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local900.aByte108 = (byte) (local900.aByte108 | 0x1);
		}
		if (local500 == -1 || (local900.aByte108 & 0x2) != 0 || this.aClass102_Sub2_1.aClass235_6.method26120(local500, 73831368).aBoolean758) {
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class163.method15759(method2518(arg6[local198] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]), arg10.anInt3687 * 1682209477, local538, 536318165);
			if (local900.anInt3346 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class163.method15759(method2518(arg6[local206] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]), arg10.anInt3687 * 1682209477, local538, -1692686224);
			if (local900.anInt3346 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3344 = Class163.method15759(method2518(arg6[local210] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -806442735);
			if (local900.anInt3346 != 0) {
				local900.anInt3344 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3345 = Class163.method15759(method2518(arg6[local230] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -1957933328);
			if (local900.anInt3346 != 0) {
				local900.anInt3345 |= 255 - (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) << 25;
			}
			local900.aShort149 = -1;
		} else {
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class163.method15759(method2518(arg6[local198] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]), arg10.anInt3687 * 1682209477, local538, 719932375);
			if (local900.anInt3346 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class163.method15759(method2518(arg6[local206] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]), arg10.anInt3687 * 1682209477, local538, -1969547564);
			if (local900.anInt3346 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3344 = Class163.method15759(method2518(arg6[local210] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, 349711923);
			if (local900.anInt3346 != 0) {
				local900.anInt3344 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3345 = Class163.method15759(method2518(arg6[local230] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -1803791587);
			local900.aShort149 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort148 = (short) arg5[local210];
			local900.aShort145 = (short) arg5[local230];
			local900.aShort147 = (short) arg5[local206];
			local900.aShort146 = (short) arg5[local198];
		}
		this.aClass193ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aep", name = "bs", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class193 local6 = this.aClass193ArrayArray1[arg0][arg1];
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
			@Pc(2006) Class190 local2006 = this.aClass190ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte107 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray82[local2027] + (arg0 << this.anInt445 * -615169581);
					local52 = local2006.aShortArray78[local2027];
					local59 = local2006.aShortArray79[local2027] + (arg1 << this.anInt445 * -615169581);
					local523 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local52 + this.aFloat12 * (float) local59;
					local577 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local52 + this.aFloat13 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat250 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat224;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray80[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean552) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat224;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat5 * (float) local59;
					local469 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local52 + this.aFloat11 * (float) local59;
					arg5[local2027] = arg4.aFloat251 + arg4.aFloat246 * local415 / local577;
					arg6[local2027] = arg4.aFloat247 + arg4.aFloat248 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							if (local567 >= 3.0F) {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class335.method27856(local2006.anIntArray296[local2282], arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, 88598563), Class335.method27856(local2006.anIntArray296[local2157], arg3.anInt3017 * -780958117, arg9[local2157] * 255.0F, 141866515), Class335.method27856(local2006.anIntArray296[local2290], arg3.anInt3017 * -780958117, arg9[local2290] * 255.0F, 117163241));
								}
							} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
								arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							@Pc(2381) Class227 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass102_Sub2_1.aClass235_6.method26120(local2006.aShortArray81[local2027] & 0xFFFF, 73831368);
								local2383 = local2381.aBoolean753;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method2514(local2381.aByte110)) {
											local2416 = -1694498816;
										}
										arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
										arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class363.method28160(local2006.anIntArray296[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 122), Class363.method28160(local2006.anIntArray296[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 62), Class363.method28160(local2006.anIntArray296[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 90));
										arg4.anInt3350 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method2514(local2381.aByte110)) {
										local2416 = -1694498816;
									}
									arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
									arg4.anInt3350 = 0;
								}
							} else {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt447 * -1174710433;
			local45 = local38 + this.anInt447 * -1174710433;
			local52 = arg1 * this.anInt447 * -1174710433;
			local59 = local52 + this.anInt447 * -1174710433;
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
			if ((local6.aByte108 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local81 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local81 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local621 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local621 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local632 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local632 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local641 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local641 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort146 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort147 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort148 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort145 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local81 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local621 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local632 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local641 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat9 * (float) local81;
				@Pc(93) float local93 = this.aFloat19 * (float) local81;
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat7 * (float) local81;
				@Pc(388) float local388 = this.aFloat8 * (float) local81;
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			}
			@Pc(1349) Class227 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort149 != -1) {
				local1349 = this.aClass102_Sub2_1.aClass235_6.method26120(local6.aShort149 & 0xFFFF, 73831368);
				local1351 = local1349.aBoolean753;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method2514(local1349.aByte110);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean679 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351;
				if (local382 >= 3.0F) {
					arg4.method24897(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3017 * -780958117);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3017 * -780958117, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class363.method28160(local6.anInt3344, (int) (local65 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 50), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 37), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 57));
						arg4.anInt3350 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3350 = 100;
					}
					arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3344, local6.anInt3345, local6.anInt3342);
					arg4.anInt3350 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean679 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3350 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, arg3.anInt3017 * -780958117, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort149 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3350 = 100;
							}
							arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class363.method28160(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 100), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 38), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 75));
							arg4.anInt3350 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3342, local6.anInt3345);
						arg4.anInt3350 = 0;
					}
				} else {
					arg4.method24897(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "be", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort137; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt445 * -615169581);
			@Pc(38) int local38 = local6.aShortArray73[local17];
			@Pc(50) int local50 = local6.aShortArray74[local17] + (arg1 << this.anInt445 * -615169581);
			@Pc(71) float local71 = this.aFloat16 + this.aFloat18 * (float) local33 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local50;
			@Pc(92) float local92 = this.aFloat17 + this.aFloat6 * (float) local33 + this.aFloat19 * (float) local38 + this.aFloat13 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat224;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray75[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean552) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat224;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat14 + this.aFloat10 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat5 * (float) local50;
			@Pc(215) float local215 = this.aFloat15 + this.aFloat4 * (float) local33 + this.aFloat8 * (float) local38 + this.aFloat11 * (float) local50;
			arg5[local17] = arg4.aFloat251 + arg4.aFloat246 * local194 / local92;
			arg6[local17] = arg4.aFloat247 + arg4.aFloat248 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat250 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt447 * -1174710433);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort138; local265++) {
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
				arg4.aBoolean679 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3351 || local289 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt445 * -615169581;
					@Pc(386) int local386 = arg1 << this.anInt445 * -615169581;
					if ((local6.anIntArray295[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray71[local137] == -1 || local6.aShortArray71[local277] == -1 || local6.aShortArray71[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class335.method27856(local6.anIntArray295[local137], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, 1483357679), Class335.method27856(local6.anIntArray295[local277], arg3.anInt3017 * -780958117, arg9[local277] * 255.0F, 1607946885), Class335.method27856(local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local281] * 255.0F, 1098644397));
							} else {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281]);
							}
						} else if (local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281] && local6.aShortArray76[local137] == local6.aShortArray76[local277] && local6.aShortArray76[local137] == local6.aShortArray76[local281]) {
							arg4.method24876(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray76[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray76[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray76[local281], (float) (local386 + local6.aShortArray74[local137]) / (float) local6.aShortArray76[local137], (float) (local386 + local6.aShortArray74[local277]) / (float) local6.aShortArray76[local277], (float) (local386 + local6.aShortArray74[local281]) / (float) local6.aShortArray76[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF);
						} else {
							arg4.method24867(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray74[local137]) / local263, (float) (local386 + local6.aShortArray74[local277]) / local263, (float) (local386 + local6.aShortArray74[local281]) / local263, local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF, local263 / (float) local6.aShortArray76[local137], local6.aShortArray71[local277] & 0xFFFF, local263 / (float) local6.aShortArray76[local277], local6.aShortArray71[local281] & 0xFFFF, local263 / (float) local6.aShortArray76[local281]);
						}
					}
				} else {
					arg4.method24897(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "by", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class193 local6 = this.aClass193ArrayArray1[arg0][arg1];
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
			@Pc(2006) Class190 local2006 = this.aClass190ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte107 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray82[local2027] + (arg0 << this.anInt445 * -615169581);
					local52 = local2006.aShortArray78[local2027];
					local59 = local2006.aShortArray79[local2027] + (arg1 << this.anInt445 * -615169581);
					local523 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local52 + this.aFloat12 * (float) local59;
					local577 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local52 + this.aFloat13 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat249 + arg4.aFloat250 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat224;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray80[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean552) {
						local550 = local523 - arg3.aFloat223;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat224;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local52 + this.aFloat5 * (float) local59;
					local469 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local52 + this.aFloat11 * (float) local59;
					arg5[local2027] = arg4.aFloat251 + arg4.aFloat246 * local415 / local577;
					arg6[local2027] = arg4.aFloat247 + arg4.aFloat248 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							if (local567 >= 3.0F) {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class335.method27856(local2006.anIntArray296[local2282], arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, 526782352), Class335.method27856(local2006.anIntArray296[local2157], arg3.anInt3017 * -780958117, arg9[local2157] * 255.0F, 1667314411), Class335.method27856(local2006.anIntArray296[local2290], arg3.anInt3017 * -780958117, arg9[local2290] * 255.0F, 738732914));
								}
							} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
								arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
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
							arg4.aBoolean679 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3351 || local283 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
							@Pc(2381) Class227 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass102_Sub2_1.aClass235_6.method26120(local2006.aShortArray81[local2027] & 0xFFFF, 73831368);
								local2383 = local2381.aBoolean753;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method2514(local2381.aByte110)) {
											local2416 = -1694498816;
										}
										arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, arg3.anInt3017 * -780958117, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
										arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class363.method28160(local2006.anIntArray296[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 61), Class363.method28160(local2006.anIntArray296[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 127), Class363.method28160(local2006.anIntArray296[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 55));
										arg4.anInt3350 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method2514(local2381.aByte110)) {
										local2416 = -1694498816;
									}
									arg4.method24876(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray82[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray82[local2290] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2282] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2157] / (float) (this.anInt447 * -1174710433), (float) local2006.aShortArray79[local2290] / (float) (this.anInt447 * -1174710433), local2416 | local2006.anIntArray296[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray296[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray296[local2282] & 0xFFFFFF) != 0) {
									arg4.method24863(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray296[local2282], local2006.anIntArray296[local2157], local2006.anIntArray296[local2290]);
									arg4.anInt3350 = 0;
								}
							} else {
								arg4.method24897(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt3017 * -780958117);
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt447 * -1174710433;
			local45 = local38 + this.anInt447 * -1174710433;
			local52 = arg1 * this.anInt447 * -1174710433;
			local59 = local52 + this.anInt447 * -1174710433;
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
			if ((local6.aByte108 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local81 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local81 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local621 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local621 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + this.aFloat9 * (float) local632 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + this.aFloat19 * (float) local632 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + this.aFloat9 * (float) local641 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + this.aFloat19 * (float) local641 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort146 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort147 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort148 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat224;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort145 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local81 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local81 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local621 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local621 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + this.aFloat7 * (float) local632 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + this.aFloat8 * (float) local632 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + this.aFloat7 * (float) local641 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + this.aFloat8 * (float) local641 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat9 * (float) local81;
				@Pc(93) float local93 = this.aFloat19 * (float) local81;
				local110 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local52;
				local127 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local52;
				local167 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat16 + this.aFloat18 * (float) local45 + local87 + this.aFloat12 * (float) local59;
				local207 = this.aFloat17 + this.aFloat6 * (float) local45 + local93 + this.aFloat13 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat16 + this.aFloat18 * (float) local38 + local87 + this.aFloat12 * (float) local59;
				local247 = this.aFloat17 + this.aFloat6 * (float) local38 + local93 + this.aFloat13 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat249 + arg4.aFloat250 * local110 / local127;
				local273 = arg4.aFloat249 + arg4.aFloat250 * local150 / local167;
				local283 = arg4.aFloat249 + arg4.aFloat250 * local190 / local207;
				local293 = arg4.aFloat249 + arg4.aFloat250 * local230 / local247;
				if (arg3.aBoolean552) {
					local301 = local110 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat224;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat224;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat224;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat223;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat224;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat7 * (float) local81;
				@Pc(388) float local388 = this.aFloat8 * (float) local81;
				local405 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local52;
				local415 = arg4.aFloat251 + arg4.aFloat246 * local405 / local127;
				local432 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local52;
				local442 = arg4.aFloat247 + arg4.aFloat248 * local432 / local127;
				local459 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local52;
				local469 = arg4.aFloat251 + arg4.aFloat246 * local459 / local167;
				local486 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local52;
				local496 = arg4.aFloat247 + arg4.aFloat248 * local486 / local167;
				local513 = this.aFloat14 + this.aFloat10 * (float) local45 + local382 + this.aFloat5 * (float) local59;
				local523 = arg4.aFloat251 + arg4.aFloat246 * local513 / local207;
				local540 = this.aFloat15 + this.aFloat4 * (float) local45 + local388 + this.aFloat11 * (float) local59;
				local550 = arg4.aFloat247 + arg4.aFloat248 * local540 / local207;
				local567 = this.aFloat14 + this.aFloat10 * (float) local38 + local382 + this.aFloat5 * (float) local59;
				local577 = arg4.aFloat251 + arg4.aFloat246 * local567 / local247;
				local594 = this.aFloat15 + this.aFloat4 * (float) local38 + local388 + this.aFloat11 * (float) local59;
				local604 = arg4.aFloat247 + arg4.aFloat248 * local594 / local247;
			}
			@Pc(1349) Class227 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort149 != -1) {
				local1349 = this.aClass102_Sub2_1.aClass235_6.method26120(local6.aShort149 & 0xFFFF, 73831368);
				local1351 = local1349.aBoolean753;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method2514(local1349.aByte110);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean679 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351;
				if (local382 >= 3.0F) {
					arg4.method24897(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt3017 * -780958117);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, arg3.anInt3017 * -780958117, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class363.method28160(local6.anInt3344, (int) (local65 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 108), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 82), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 5));
						arg4.anInt3350 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24876(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3344 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3350 = 100;
					}
					arg4.method24863(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3344, local6.anInt3345, local6.anInt3342);
					arg4.anInt3350 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean679 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3351 || local469 > (float) arg4.anInt3351 || local577 > (float) arg4.anInt3351;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3350 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, arg3.anInt3017 * -780958117, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort149 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3350 = 100;
							}
							arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class363.method28160(local6.anInt3343, (int) (local61 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 53), Class363.method28160(local6.anInt3342, (int) (local63 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 35), Class363.method28160(local6.anInt3345, (int) (local67 * 255.0F) << 24 | arg3.anInt3017 * -780958117, (byte) 105));
							arg4.anInt3350 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24876(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3343 & 0xFFFFFF, local904 | local6.anInt3342 & 0xFFFFFF, local904 | local6.anInt3345 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort149 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3350 = 100;
						}
						arg4.method24863(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3343, local6.anInt3342, local6.anInt3345);
						arg4.anInt3350 = 0;
					}
				} else {
					arg4.method24897(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bk", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort137; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt445 * -615169581);
			@Pc(38) int local38 = local6.aShortArray73[local17];
			@Pc(50) int local50 = local6.aShortArray74[local17] + (arg1 << this.anInt445 * -615169581);
			@Pc(71) float local71 = this.aFloat16 + this.aFloat18 * (float) local33 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local50;
			@Pc(92) float local92 = this.aFloat17 + this.aFloat6 * (float) local33 + this.aFloat19 * (float) local38 + this.aFloat13 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat224;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray75[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean552) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat224;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat14 + this.aFloat10 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat5 * (float) local50;
			@Pc(215) float local215 = this.aFloat15 + this.aFloat4 * (float) local33 + this.aFloat8 * (float) local38 + this.aFloat11 * (float) local50;
			arg5[local17] = arg4.aFloat251 + arg4.aFloat246 * local194 / local92;
			arg6[local17] = arg4.aFloat247 + arg4.aFloat248 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat250 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt447 * -1174710433);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort138; local265++) {
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
				arg4.aBoolean679 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3351 || local289 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt445 * -615169581;
					@Pc(386) int local386 = arg1 << this.anInt445 * -615169581;
					if ((local6.anIntArray295[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray71[local137] == -1 || local6.aShortArray71[local277] == -1 || local6.aShortArray71[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class335.method27856(local6.anIntArray295[local137], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, 210002385), Class335.method27856(local6.anIntArray295[local277], arg3.anInt3017 * -780958117, arg9[local277] * 255.0F, 1797340263), Class335.method27856(local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local281] * 255.0F, 897251584));
							} else {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281]);
							}
						} else if (local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281] && local6.aShortArray76[local137] == local6.aShortArray76[local277] && local6.aShortArray76[local137] == local6.aShortArray76[local281]) {
							arg4.method24876(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray76[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray76[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray76[local281], (float) (local386 + local6.aShortArray74[local137]) / (float) local6.aShortArray76[local137], (float) (local386 + local6.aShortArray74[local277]) / (float) local6.aShortArray76[local277], (float) (local386 + local6.aShortArray74[local281]) / (float) local6.aShortArray76[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF);
						} else {
							arg4.method24867(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray74[local137]) / local263, (float) (local386 + local6.aShortArray74[local277]) / local263, (float) (local386 + local6.aShortArray74[local281]) / local263, local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF, local263 / (float) local6.aShortArray76[local137], local6.aShortArray71[local277] & 0xFFFF, local263 / (float) local6.aShortArray76[local277], local6.aShortArray71[local281] & 0xFFFF, local263 / (float) local6.aShortArray76[local281]);
						}
					}
				} else {
					arg4.method24897(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "ax", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		@Pc(7) Class195 local7 = local4.aClass195_2;
		local7.anInt3350 = 0;
		local7.aBoolean679 = true;
		this.aClass102_Sub2_1.method5068();
		if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method2513(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2512(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		}
	}

	@OriginalMember(owner = "client!aep", name = "p", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt378 & 0x20) == 0;
		if (this.aClass193ArrayArray1 == null && !local8) {
			this.aClass193ArrayArray1 = new Class193[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
			this.aClass190ArrayArray1 = new Class190[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass186ArrayArray1 == null && local8) {
			this.aClass186ArrayArray1 = new Class186[this.anInt448 * -1548585779][this.anInt446 * -1356799781];
		} else if (this.aClass178ArrayArray1 != null) {
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
				arg6[local68] = Class325.anIntArray400[Class80_Sub22.method21675(arg6[local68], 564654396) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class325.anIntArray400[Class80_Sub22.method21675(arg7[local68], 1600904217) & 0xFFFF] << 8 | 0xFF;
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
			local142.aShort137 = (short) arg2.length;
			local142.aShort138 = (short) (arg2.length / 3);
			local142.aShortArray72 = new short[local142.aShort137];
			local142.aShortArray73 = new short[local142.aShort137];
			local142.aShortArray74 = new short[local142.aShort137];
			local142.anIntArray295 = new int[local142.aShort137];
			local142.aShortArray71 = new short[local142.aShort137];
			local142.aShortArray76 = new short[local142.aShort137];
			local142.aByteArray65 = new byte[local142.aShort137];
			if (arg5 != null) {
				local142.aShortArray75 = new short[local142.aShort137];
			}
			for (local198 = 0; local198 < local142.aShort137; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt447 * -1174710433) {
					local230 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
				} else if (local206 == this.anInt447 * -1174710433 && local210 == this.anInt447 * -1174710433) {
					local230 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt447 * -1174710433 && local210 == 0) {
					local230 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local206) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local206) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt447 * -1174710433 - local210) + local410 * local210 >> this.anInt445 * -1230339162;
				}
				local361 = (arg0 << this.anInt445 * -615169581) + local206;
				local410 = (arg1 << this.anInt445 * -615169581) + local210;
				local142.aShortArray72[local198] = (short) local206;
				local142.aShortArray74[local198] = (short) local210;
				local142.aShortArray73[local198] = (short) (this.method2915(local361, local410, (byte) -65) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray295[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray75[local198] = (short) arg5[local198];
						if (arg10.anInt3685 * -692202347 != 0) {
							local500 = local512 * 255 / (arg10.anInt3685 * -692202347);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class227 local552 = this.aClass102_Sub2_1.aClass235_6.method26120(arg8[local198], 73831368);
						if (local552.aBoolean753 && this.method2514(local552.aByte110)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray295[local198] = local538 | Class163.method15759(method2518(arg6[local198] >> 8, local230), arg10.anInt3687 * 1682209477, local500, -1477759409);
					if (arg7 != null) {
						local142.aByteArray65[local198] = (byte) local230;
					}
				}
				local142.aShortArray71[local198] = (short) arg8[local198];
				local142.aShortArray76[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray294 = new int[local142.aShort138];
				for (local198 = 0; local198 < local142.aShort138; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray294[local198] = arg7[local206] >> 8 | 0xFF000000;
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
				} else if (arg2[local361] == this.anInt447 * -1174710433 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt447 * -1174710433 && arg4[local361] == this.anInt447 * -1174710433) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt447 * -1174710433) {
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
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt447 * -1174710433 && arg2[local361] != arg2[0] - this.anInt447 * -1174710433) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt447 * -1174710433 && arg4[local361] != arg4[0] - this.anInt447 * -1174710433) {
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
			@Pc(1753) Class190 local1753 = new Class190();
			local1753.aShort143 = (short) arg2.length;
			local1753.aShort144 = (short) (arg2.length / 3);
			local1753.aShortArray82 = new short[local1753.aShort143];
			local1753.aShortArray78 = new short[local1753.aShort143];
			local1753.aShortArray79 = new short[local1753.aShort143];
			local1753.anIntArray296 = new int[local1753.aShort143];
			if (arg5 != null) {
				local1753.aShortArray80 = new short[local1753.aShort143];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort143; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt447 * -1174710433) {
					local1826 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1];
				} else if (local500 == this.anInt447 * -1174710433 && local538 == this.anInt447 * -1174710433) {
					local1826 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt447 * -1174710433 && local538 == 0) {
					local1826 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) * (this.anInt447 * -1174710433 - local500) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) * (this.anInt447 * -1174710433 - local500) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt447 * -1174710433 - local538) + local2006 * local538 >> this.anInt445 * -1230339162;
				}
				local1957 = (arg0 << this.anInt445 * -615169581) + local500;
				local2006 = (arg1 << this.anInt445 * -615169581) + local538;
				local1753.aShortArray82[local410] = (short) local500;
				local1753.aShortArray79[local410] = (short) local538;
				local1753.aShortArray78[local410] = (short) (this.method2915(local1957, local2006, (byte) -70) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray80[local410] = (short) arg5[local410];
						if (arg10.anInt3685 * -692202347 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3685 * -692202347);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray296[local410] = Class163.method15759(method2518(arg6[local410] >> 8, local1826), arg10.anInt3687 * 1682209477, local2098, -1857634297);
					if (arg7 != null) {
						local1753.anIntArray296[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray296[local410] = 0;
				} else {
					local1753.anIntArray296[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(arg8[local500 * 3], 73831368).aBoolean758) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray297 = new int[local1753.aShort144];
			}
			if (local2168) {
				local1753.aShortArray81 = new short[local1753.aShort144];
				local1753.aShortArray77 = new short[local1753.aShort144];
			}
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray297[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray81[local500] = (short) local2259;
						local1753.aShortArray77[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local538] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 1376575765) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local1826] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 1511403644) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aBoolean758) {
								local1753.anIntArray296[local1957] = Class325.anIntArray400[Class80_Sub22.method21675(this.aClass102_Sub2_1.aClass235_6.method26120(local2259, 73831368).aShort161 & 0xFFFF, 1545814226) & 0xFFFF];
							}
						}
						local1753.aShortArray81[local500] = -1;
					}
				}
			}
			this.aClass190ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class193 local900 = new Class193();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3346 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte108 = (byte) (local900.aByte108 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local900.aByte108 = (byte) (local900.aByte108 | 0x1);
		}
		if (local500 == -1 || (local900.aByte108 & 0x2) != 0 || this.aClass102_Sub2_1.aClass235_6.method26120(local500, 73831368).aBoolean758) {
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class163.method15759(method2518(arg6[local198] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]), arg10.anInt3687 * 1682209477, local538, 6746031);
			if (local900.anInt3346 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class163.method15759(method2518(arg6[local206] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]), arg10.anInt3687 * 1682209477, local538, 424248203);
			if (local900.anInt3346 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3344 = Class163.method15759(method2518(arg6[local210] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -249550018);
			if (local900.anInt3346 != 0) {
				local900.anInt3344 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3345 = Class163.method15759(method2518(arg6[local230] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -1033112197);
			if (local900.anInt3346 != 0) {
				local900.anInt3345 |= 255 - (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]) << 25;
			}
			local900.aShort149 = -1;
		} else {
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3343 = Class163.method15759(method2518(arg6[local198] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]), arg10.anInt3687 * 1682209477, local538, -1460178347);
			if (local900.anInt3346 != 0) {
				local900.anInt3343 |= 255 - (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray4[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3342 = Class163.method15759(method2518(arg6[local206] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]), arg10.anInt3687 * 1682209477, local538, 854503047);
			if (local900.anInt3346 != 0) {
				local900.anInt3342 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray4[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3344 = Class163.method15759(method2518(arg6[local210] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, 432039389);
			if (local900.anInt3346 != 0) {
				local900.anInt3344 |= 255 - (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray4[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3685 * -692202347 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3685 * -692202347);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3345 = Class163.method15759(method2518(arg6[local230] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray4[arg0][arg1 + 1]), arg10.anInt3687 * 1682209477, local538, -1266426408);
			local900.aShort149 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort148 = (short) arg5[local210];
			local900.aShort145 = (short) arg5[local230];
			local900.aShort147 = (short) arg5[local206];
			local900.aShort146 = (short) arg5[local198];
		}
		this.aClass193ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aep", name = "bh", descriptor = "(I)Z")
	boolean method2523(@OriginalArg(0) int arg0) {
		if ((this.anInt378 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aep", name = "b", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		@Pc(7) Class195 local7 = local4.aClass195_2;
		local7.anInt3350 = 0;
		local7.aBoolean679 = true;
		this.aClass102_Sub2_1.method5068();
		if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method2513(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2512(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		}
	}

	@OriginalMember(owner = "client!aep", name = "ba", descriptor = "(III)V")
	void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		local4.aClass195_2.anInt3350 = 0;
		if (this.aClass193ArrayArray1 != null) {
			this.method2515(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2509(arg0, arg1, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		} else if (this.aClass186ArrayArray1 != null) {
			this.method2510(arg0, arg1, local4.aBoolean553, local4, local4.aClass195_2, local4.aFloatArray75, local4.aFloatArray78, local4.aFloatArray79, local4.aFloatArray80, local4.aFloatArray81, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "bv", descriptor = "(IIIIIII[[ZLclient!ar;Lclient!bt;[F[F)V")
	void method2525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class169 arg8, @OriginalArg(9) Class195 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean554;
		this.aClass102_Sub2_1.method20762(false);
		arg9.aBoolean678 = false;
		arg9.aBoolean681 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass178ArrayArray1[local32][local37] != null) {
						@Pc(64) Class178 local64 = this.aClass178ArrayArray1[local32][local37];
						if (local64.aShort136 != -1 && (local64.aByte102 & 0x2) == 0 && local64.anInt3310 == -1) {
							local85 = this.aClass102_Sub2_1.method5064(local64.aShort136 & 0xFFFF);
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local85, local64.aShort134 & 0xFFFF, (short) 2894), (float) Class371.method28387(local85, local64.aShort135 & 0xFFFF, (short) 3236), (float) Class371.method28387(local85, local64.aShort133 & 0xFFFF, (short) -25965));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local85, local64.aShort132 & 0xFFFF, (short) -18146), (float) Class371.method28387(local85, local64.aShort133 & 0xFFFF, (short) -8855), (float) Class371.method28387(local85, local64.aShort135 & 0xFFFF, (short) 1532));
						} else if (local64.anInt3310 == -1) {
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort134 & 0xFFFF), (float) (local64.aShort135 & 0xFFFF), (float) (local64.aShort133 & 0xFFFF));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort132 & 0xFFFF), (float) (local64.aShort133 & 0xFFFF), (float) (local64.aShort135 & 0xFFFF));
						} else {
							local85 = local64.anInt3310;
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass173ArrayArray1[local32][local37] != null) {
						@Pc(355) Class173 local355 = this.aClass173ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort130; local85++) {
							arg10[local85] = local26 + local355.aShortArray63[local85] * local11 / (this.anInt447 * -1174710433);
							arg11[local85] = local30 - local355.aShortArray65[local85] * local11 / (this.anInt447 * -1174710433);
						}
						for (local85 = 0; local85 < local355.aShort131; local85++) {
							@Pc(408) short local408 = local355.aShortArray62[local85];
							@Pc(413) short local413 = local355.aShortArray67[local85];
							@Pc(418) short local418 = local355.aShortArray68[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray290 != null && local355.anIntArray290[local85] != -1) {
								local456 = local355.anIntArray290[local85];
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) 14567), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) 4862), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) 9905));
							} else if (local355.aShortArray69 == null || local355.aShortArray69[local85] == -1) {
								local456 = local355.anIntArray289[local85];
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) -6476), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) -15384), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) 9699));
							} else {
								local456 = this.aClass102_Sub2_1.method5064(local355.aShortArray69[local85] & 0xFFFF);
								arg9.method24855(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local456, local355.aShortArray70[local408], (short) -305), (float) Class371.method28387(local456, local355.aShortArray70[local413], (short) -10438), (float) Class371.method28387(local456, local355.aShortArray70[local418], (short) -3934));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean678 = true;
		this.aClass102_Sub2_1.method20762(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bp", descriptor = "(IIIIIII[[ZLclient!ar;Lclient!bt;[F[F)V")
	void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class169 arg8, @OriginalArg(9) Class195 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean554;
		this.aClass102_Sub2_1.method20762(false);
		arg9.aBoolean678 = false;
		arg9.aBoolean681 = false;
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
					if (this.aClass193ArrayArray1 == null) {
						if (this.aClass186ArrayArray1[local32][local37] != null) {
							@Pc(596) Class186 local596 = this.aClass186ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt447 * -1174710433);
								arg11[local87] = local30 - local596.aShortArray74[local87] * local11 / (this.anInt447 * -1174710433);
							}
							for (local87 = 0; local87 < local596.aShort138; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray294 == null || local596.anIntArray294[local87] == 0) {
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray295[local408], local596.anIntArray295[local412], local596.anIntArray295[local416]);
								} else {
									local465 = local596.anIntArray294[local87];
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass193ArrayArray1[local32][local37] != null) {
						@Pc(67) Class193 local67 = this.aClass193ArrayArray1[local32][local37];
						if (local67.aShort149 != -1 && (local67.aByte108 & 0x2) == 0 && local67.anInt3346 == 0) {
							local87 = this.aClass102_Sub2_1.method5064(local67.aShort149 & 0xFFFF);
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3344, (short) -20970), (float) Class371.method28387(local87, local67.anInt3345, (short) 21639), (float) Class371.method28387(local87, local67.anInt3342, (short) 16512));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3343, (short) -6419), (float) Class371.method28387(local87, local67.anInt3342, (short) -5420), (float) Class371.method28387(local87, local67.anInt3345, (short) 12194));
						} else if (local67.anInt3346 == 0) {
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3344, local67.anInt3345, local67.anInt3342);
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3343, local67.anInt3342, local67.anInt3345);
						} else {
							local87 = local67.anInt3346;
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3344 & 0xFF000000, (byte) 25), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 2), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 2));
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3343 & 0xFF000000, (byte) 40), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 104), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 53));
						}
					} else if (this.aClass190ArrayArray1[local32][local37] != null) {
						@Pc(356) Class190 local356 = this.aClass190ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray82[local87] * local11 / (this.anInt447 * -1174710433);
							arg11[local87] = local30 - local356.aShortArray79[local87] * local11 / (this.anInt447 * -1174710433);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray297 != null && local356.anIntArray297[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray297[local87];
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class363.method28160(local465, -16777216 - (local356.anIntArray296[local408] & -16777216), (byte) 63), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local412] & -16777216), (byte) 90), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local416] & -16777216), (byte) 21));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray296[local408], local356.anIntArray296[local412], local356.anIntArray296[local416]);
							} else {
								local465 = this.aClass102_Sub2_1.method5064(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24855(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean678 = true;
		this.aClass102_Sub2_1.method20762(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bb", descriptor = "(IIIIIII[[ZLclient!ar;Lclient!bt;[F[F)V")
	void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class169 arg8, @OriginalArg(9) Class195 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean554;
		this.aClass102_Sub2_1.method20762(false);
		arg9.aBoolean678 = false;
		arg9.aBoolean681 = false;
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
					if (this.aClass193ArrayArray1 == null) {
						if (this.aClass186ArrayArray1[local32][local37] != null) {
							@Pc(596) Class186 local596 = this.aClass186ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt447 * -1174710433);
								arg11[local87] = local30 - local596.aShortArray74[local87] * local11 / (this.anInt447 * -1174710433);
							}
							for (local87 = 0; local87 < local596.aShort138; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray294 == null || local596.anIntArray294[local87] == 0) {
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray295[local408], local596.anIntArray295[local412], local596.anIntArray295[local416]);
								} else {
									local465 = local596.anIntArray294[local87];
									arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass193ArrayArray1[local32][local37] != null) {
						@Pc(67) Class193 local67 = this.aClass193ArrayArray1[local32][local37];
						if (local67.aShort149 != -1 && (local67.aByte108 & 0x2) == 0 && local67.anInt3346 == 0) {
							local87 = this.aClass102_Sub2_1.method5064(local67.aShort149 & 0xFFFF);
							arg9.method24855(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3344, (short) -14047), (float) Class371.method28387(local87, local67.anInt3345, (short) -38), (float) Class371.method28387(local87, local67.anInt3342, (short) 4511));
							arg9.method24855(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class371.method28387(local87, local67.anInt3343, (short) 18544), (float) Class371.method28387(local87, local67.anInt3342, (short) 11701), (float) Class371.method28387(local87, local67.anInt3345, (short) 4161));
						} else if (local67.anInt3346 == 0) {
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3344, local67.anInt3345, local67.anInt3342);
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3343, local67.anInt3342, local67.anInt3345);
						} else {
							local87 = local67.anInt3346;
							arg9.method24863(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3344 & 0xFF000000, (byte) 70), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 58), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 16));
							arg9.method24863(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class363.method28160(local87, local67.anInt3343 & 0xFF000000, (byte) 111), Class363.method28160(local87, local67.anInt3342 & 0xFF000000, (byte) 72), Class363.method28160(local87, local67.anInt3345 & 0xFF000000, (byte) 82));
						}
					} else if (this.aClass190ArrayArray1[local32][local37] != null) {
						@Pc(356) Class190 local356 = this.aClass190ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray82[local87] * local11 / (this.anInt447 * -1174710433);
							arg11[local87] = local30 - local356.aShortArray79[local87] * local11 / (this.anInt447 * -1174710433);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray297 != null && local356.anIntArray297[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray297[local87];
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class363.method28160(local465, -16777216 - (local356.anIntArray296[local408] & -16777216), (byte) 52), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local412] & -16777216), (byte) 40), Class363.method28160(local465, -16777216 - (local356.anIntArray296[local416] & -16777216), (byte) 39));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24863(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray296[local408], local356.anIntArray296[local412], local356.anIntArray296[local416]);
							} else {
								local465 = this.aClass102_Sub2_1.method5064(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24855(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean678 = true;
		this.aClass102_Sub2_1.method20762(local14);
	}

	@OriginalMember(owner = "client!aep", name = "ay", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "q", descriptor = "(III)V")
	@Override
	public void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray4[local9][local21] < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "bz", descriptor = "(IIZLclient!ar;Lclient!bt;[F[F[F[F[FI)V")
	void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort137; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt445 * -615169581);
			@Pc(38) int local38 = local6.aShortArray73[local17];
			@Pc(50) int local50 = local6.aShortArray74[local17] + (arg1 << this.anInt445 * -615169581);
			@Pc(71) float local71 = this.aFloat16 + this.aFloat18 * (float) local33 + this.aFloat9 * (float) local38 + this.aFloat12 * (float) local50;
			@Pc(92) float local92 = this.aFloat17 + this.aFloat6 * (float) local33 + this.aFloat19 * (float) local38 + this.aFloat13 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat224;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray75[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean552) {
				local109 = local71 - arg3.aFloat223;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat224;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat14 + this.aFloat10 * (float) local33 + this.aFloat7 * (float) local38 + this.aFloat5 * (float) local50;
			@Pc(215) float local215 = this.aFloat15 + this.aFloat4 * (float) local33 + this.aFloat8 * (float) local38 + this.aFloat11 * (float) local50;
			arg5[local17] = arg4.aFloat251 + arg4.aFloat246 * local194 / local92;
			arg6[local17] = arg4.aFloat247 + arg4.aFloat248 * local215 / local92;
			arg7[local17] = arg4.aFloat249 + arg4.aFloat250 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt447 * -1174710433);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort138; local265++) {
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
				arg4.aBoolean679 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3351 || local289 > (float) arg4.anInt3351 || local293 > (float) arg4.anInt3351;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt445 * -615169581;
					@Pc(386) int local386 = arg1 << this.anInt445 * -615169581;
					if ((local6.anIntArray295[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray71[local137] == -1 || local6.aShortArray71[local277] == -1 || local6.aShortArray71[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class335.method27856(local6.anIntArray295[local137], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, 1533485098), Class335.method27856(local6.anIntArray295[local277], arg3.anInt3017 * -780958117, arg9[local277] * 255.0F, 1588593865), Class335.method27856(local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local281] * 255.0F, 331266407));
							} else {
								arg4.method24863(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281]);
							}
						} else if (local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281] && local6.aShortArray76[local137] == local6.aShortArray76[local277] && local6.aShortArray76[local137] == local6.aShortArray76[local281]) {
							arg4.method24876(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray76[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray76[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray76[local281], (float) (local386 + local6.aShortArray74[local137]) / (float) local6.aShortArray76[local137], (float) (local386 + local6.aShortArray74[local277]) / (float) local6.aShortArray76[local277], (float) (local386 + local6.aShortArray74[local281]) / (float) local6.aShortArray76[local281], local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF);
						} else {
							arg4.method24867(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray74[local137]) / local263, (float) (local386 + local6.aShortArray74[local277]) / local263, (float) (local386 + local6.aShortArray74[local281]) / local263, local6.anIntArray295[local137], local6.anIntArray295[local277], local6.anIntArray295[local281], arg3.anInt3017 * -780958117, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray71[local137] & 0xFFFF, local263 / (float) local6.aShortArray76[local137], local6.aShortArray71[local277] & 0xFFFF, local263 / (float) local6.aShortArray76[local277], local6.aShortArray71[local281] & 0xFFFF, local263 / (float) local6.aShortArray76[local281]);
						}
					}
				} else {
					arg4.method24897(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt3017 * -780958117);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "ao", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2909(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "aj", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2944(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "ac", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2939(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "ag", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2933(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aep", name = "al", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2942(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aep", name = "g", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class169 local4 = this.aClass102_Sub2_1.method5074(Thread.currentThread());
		@Pc(7) Class195 local7 = local4.aClass195_2;
		local7.anInt3350 = 0;
		local7.aBoolean679 = true;
		this.aClass102_Sub2_1.method5068();
		if (this.aClass193ArrayArray1 != null || this.aClass186ArrayArray1 != null) {
			this.method2513(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method2512(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray75, local4.aFloatArray78);
		}
	}

	@OriginalMember(owner = "client!aep", name = "af", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2929(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return false;
	}

	@OriginalMember(owner = "client!aep", name = "aq", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2935(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "ak", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2940(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aep", name = "at", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2948(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
