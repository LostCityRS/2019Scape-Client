package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afp")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!afp", name = "g", descriptor = "I")
	static final int anInt830 = 7;

	@OriginalMember(owner = "client!afp", name = "i", descriptor = "I")
	static final int anInt831 = 1;

	@OriginalMember(owner = "client!afp", name = "m", descriptor = "I")
	static final int anInt832 = 2;

	@OriginalMember(owner = "client!afp", name = "o", descriptor = "I")
	static final int anInt833 = 4;

	@OriginalMember(owner = "client!afp", name = "j", descriptor = "I")
	static final int anInt834 = 8;

	@OriginalMember(owner = "client!afp", name = "a", descriptor = "I")
	static final int anInt835 = 16;

	@OriginalMember(owner = "client!afp", name = "l", descriptor = "I")
	static final int anInt841 = 4;

	@OriginalMember(owner = "client!afp", name = "bd", descriptor = "I")
	static int anInt845;

	@OriginalMember(owner = "client!afp", name = "bx", descriptor = "[J")
	static long[] aLongArray8;

	@OriginalMember(owner = "client!afp", name = "cd", descriptor = "I")
	static int anInt848;

	@OriginalMember(owner = "client!afp", name = "cv", descriptor = "I")
	static int anInt849;

	@OriginalMember(owner = "client!afp", name = "ct", descriptor = "Z")
	static boolean aBoolean168;

	@OriginalMember(owner = "client!afp", name = "bi", descriptor = "[F")
	static float[] aFloatArray27 = new float[2];

	@OriginalMember(owner = "client!afp", name = "bu", descriptor = "[I")
	static final int[] anIntArray76 = new int[8];

	@OriginalMember(owner = "client!afp", name = "bm", descriptor = "[I")
	static final int[] anIntArray73 = new int[8];

	@OriginalMember(owner = "client!afp", name = "bq", descriptor = "[I")
	static final int[] anIntArray75 = new int[8];

	@OriginalMember(owner = "client!afp", name = "w", descriptor = "B")
	byte aByte4;

	@OriginalMember(owner = "client!afp", name = "bl", descriptor = "I")
	int anInt838;

	@OriginalMember(owner = "client!afp", name = "aj", descriptor = "Lclient!cs;")
	Class214 aClass214_1;

	@OriginalMember(owner = "client!afp", name = "az", descriptor = "Lclient!ca;")
	Interface15 anInterface15_2;

	@OriginalMember(owner = "client!afp", name = "as", descriptor = "Lclient!bw;")
	Interface14 anInterface14_4;

	@OriginalMember(owner = "client!afp", name = "bg", descriptor = "I")
	int anInt843;

	@OriginalMember(owner = "client!afp", name = "bn", descriptor = "S")
	short aShort12;

	@OriginalMember(owner = "client!afp", name = "ba", descriptor = "S")
	short aShort13;

	@OriginalMember(owner = "client!afp", name = "bt", descriptor = "S")
	short aShort14;

	@OriginalMember(owner = "client!afp", name = "bs", descriptor = "S")
	short aShort15;

	@OriginalMember(owner = "client!afp", name = "bj", descriptor = "S")
	short aShort16;

	@OriginalMember(owner = "client!afp", name = "by", descriptor = "S")
	short aShort17;

	@OriginalMember(owner = "client!afp", name = "bz", descriptor = "S")
	short aShort18;

	@OriginalMember(owner = "client!afp", name = "h", descriptor = "Z")
	boolean aBoolean163 = false;

	@OriginalMember(owner = "client!afp", name = "d", descriptor = "Z")
	boolean aBoolean164 = false;

	@OriginalMember(owner = "client!afp", name = "z", descriptor = "I")
	int anInt836 = 0;

	@OriginalMember(owner = "client!afp", name = "p", descriptor = "I")
	int anInt847 = 0;

	@OriginalMember(owner = "client!afp", name = "ax", descriptor = "I")
	int anInt837 = 0;

	@OriginalMember(owner = "client!afp", name = "ab", descriptor = "I")
	int anInt839 = 0;

	@OriginalMember(owner = "client!afp", name = "al", descriptor = "I")
	int anInt840 = 0;

	@OriginalMember(owner = "client!afp", name = "aw", descriptor = "Z")
	boolean aBoolean165 = true;

	@OriginalMember(owner = "client!afp", name = "br", descriptor = "Z")
	boolean aBoolean166 = false;

	@OriginalMember(owner = "client!afp", name = "bk", descriptor = "Z")
	boolean aBoolean167 = false;

	@OriginalMember(owner = "client!afp", name = "s", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_27;

	@OriginalMember(owner = "client!afp", name = "k", descriptor = "I")
	int anInt844;

	@OriginalMember(owner = "client!afp", name = "x", descriptor = "I")
	int anInt842;

	@OriginalMember(owner = "client!afp", name = "aa", descriptor = "Lclient!bm;")
	Class189 aClass189_7;

	@OriginalMember(owner = "client!afp", name = "ar", descriptor = "Lclient!bm;")
	Class189 aClass189_10;

	@OriginalMember(owner = "client!afp", name = "ap", descriptor = "Lclient!bm;")
	Class189 aClass189_9;

	@OriginalMember(owner = "client!afp", name = "ae", descriptor = "Lclient!bm;")
	Class189 aClass189_8;

	@OriginalMember(owner = "client!afp", name = "au", descriptor = "Lclient!bu;")
	Class196 aClass196_1;

	@OriginalMember(owner = "client!afp", name = "bh", descriptor = "[I")
	int[] anIntArray74;

	@OriginalMember(owner = "client!afp", name = "v", descriptor = "[I")
	int[] anIntArray70;

	@OriginalMember(owner = "client!afp", name = "y", descriptor = "[I")
	int[] anIntArray71;

	@OriginalMember(owner = "client!afp", name = "n", descriptor = "[I")
	int[] anIntArray72;

	@OriginalMember(owner = "client!afp", name = "b", descriptor = "[S")
	short[] aShortArray16;

	@OriginalMember(owner = "client!afp", name = "bp", descriptor = "[Lclient!dm;")
	Class228[] aClass228Array2;

	@OriginalMember(owner = "client!afp", name = "bb", descriptor = "[Lclient!cp;")
	Class211[] aClass211Array2;

	@OriginalMember(owner = "client!afp", name = "bo", descriptor = "I")
	int anInt846;

	@OriginalMember(owner = "client!afp", name = "bc", descriptor = "[Lclient!cj;")
	Class206[] aClass206Array1;

	@OriginalMember(owner = "client!afp", name = "bf", descriptor = "[Lclient!bx;")
	Class198[] aClass198Array1;

	@OriginalMember(owner = "client!afp", name = "ay", descriptor = "[S")
	short[] aShortArray18;

	@OriginalMember(owner = "client!afp", name = "ai", descriptor = "[S")
	short[] aShortArray24;

	@OriginalMember(owner = "client!afp", name = "aq", descriptor = "[S")
	short[] aShortArray21;

	@OriginalMember(owner = "client!afp", name = "ao", descriptor = "[B")
	byte[] aByteArray24;

	@OriginalMember(owner = "client!afp", name = "ac", descriptor = "[F")
	float[] aFloatArray26;

	@OriginalMember(owner = "client!afp", name = "ag", descriptor = "[F")
	float[] aFloatArray25;

	@OriginalMember(owner = "client!afp", name = "ah", descriptor = "[S")
	short[] aShortArray19;

	@OriginalMember(owner = "client!afp", name = "af", descriptor = "[B")
	byte[] aByteArray23;

	@OriginalMember(owner = "client!afp", name = "am", descriptor = "[S")
	short[] aShortArray20;

	@OriginalMember(owner = "client!afp", name = "ak", descriptor = "[S")
	short[] aShortArray22;

	@OriginalMember(owner = "client!afp", name = "at", descriptor = "[S")
	short[] aShortArray26;

	@OriginalMember(owner = "client!afp", name = "ad", descriptor = "[S")
	short[] aShortArray17;

	@OriginalMember(owner = "client!afp", name = "an", descriptor = "[S")
	short[] aShortArray23;

	@OriginalMember(owner = "client!afp", name = "r", descriptor = "S")
	short aShort10;

	@OriginalMember(owner = "client!afp", name = "q", descriptor = "S")
	short aShort11;

	@OriginalMember(owner = "client!afp", name = "bv", descriptor = "[S")
	short[] aShortArray25;

	@OriginalMember(owner = "client!afp", name = "be", descriptor = "[I")
	int[] anIntArray77;

	@OriginalMember(owner = "client!afp", name = "c", descriptor = "[[I")
	int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!afp", name = "bw", descriptor = "[[I")
	int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!afp", name = "av", descriptor = "[[I")
	int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!afp", name = "hd", descriptor = "([BI)[B")
	static byte[] method6922(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "hm", descriptor = "([SI)[S")
	static short[] method6923(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "hl", descriptor = "([FI)[F")
	static float[] method6924(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "ip", descriptor = "([BI)[B")
	static byte[] method6928(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "io", descriptor = "(II)I")
	static int method6934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afp", name = "jj", descriptor = "(II)I")
	static int method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afp", name = "ib", descriptor = "([FI)[F")
	static float[] method6940(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "ix", descriptor = "([BI)[B")
	static byte[] method6943(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "ir", descriptor = "([BI)[B")
	static byte[] method6944(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "iu", descriptor = "([SI)[S")
	static short[] method6945(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "it", descriptor = "([SI)[S")
	static short[] method6946(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "iq", descriptor = "([SI)[S")
	static short[] method6947(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afp", name = "jr", descriptor = "(II)I")
	static int method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afp", name = "jk", descriptor = "(II)I")
	static int method6962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "(Lclient!afm;Lclient!dt;IIII)V")
	Class105_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass102_Sub3_27 = arg0;
		this.anInt844 = arg2;
		this.anInt842 = arg5;
		if (Class184.method24761(arg2, arg5)) {
			this.aClass189_7 = new Class189(null, 5126, 3, 0);
		}
		if (Class184.method24797(arg2, arg5)) {
			this.aClass189_10 = new Class189(null, 5126, 2, 0);
		}
		if (Class184.method24709(arg2, arg5)) {
			this.aClass189_9 = new Class189(null, 5126, 3, 0);
		}
		if (Class184.method24717(arg2, arg5)) {
			this.aClass189_8 = new Class189(null, 5121, 4, 0);
		}
		if (Class184.method24719(arg2, arg5)) {
			this.aClass196_1 = new Class196();
		}
		@Pc(104) Class235 local104 = arg0.aClass235_6;
		@Pc(107) Interface46 local107 = arg0.anInterface46_6;
		@Pc(111) int[] local111 = new int[arg1.anInt3780];
		this.anIntArray74 = new int[arg1.anInt3783 + 1];
		for (@Pc(120) int local120 = 0; local120 < arg1.anInt3780; local120++) {
			if (arg1.aByteArray70 == null || arg1.aByteArray70[local120] != 2) {
				if (arg1.aShortArray89 != null && arg1.aShortArray89[local120] != -1) {
					@Pc(153) Class227 local153 = local104.method26120(arg1.aShortArray89[local120] & 0xFFFF, 73831368);
					if (((this.anInt842 & 0x40) == 0 || !local153.aBoolean758) && local153.aBoolean752) {
						continue;
					}
				}
				local111[this.anInt839++] = local120;
				this.anIntArray74[arg1.aShortArray91[local120]]++;
				this.anIntArray74[arg1.aShortArray92[local120]]++;
				this.anIntArray74[arg1.aShortArray93[local120]]++;
			}
		}
		this.anInt840 = this.anInt839;
		@Pc(218) long[] local218 = new long[this.anInt839];
		@Pc(227) boolean local227 = (this.anInt844 & 0x100) != 0;
		@Pc(237) int local237;
		@Pc(241) int local241;
		@Pc(254) int local254;
		@Pc(486) int local486;
		@Pc(374) short local374;
		for (@Pc(229) int local229 = 0; local229 < this.anInt839; local229++) {
			local237 = local111[local229];
			@Pc(239) Class227 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			@Pc(252) boolean local252;
			if (arg1.aClass226Array1 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass226Array1.length; local254++) {
					@Pc(264) Class226 local264 = arg1.aClass226Array1[local254];
					if (local237 == local264.anInt3627 * -684337005) {
						@Pc(278) Class435 local278 = local107.method29234(local264.anInt3625 * 1644904431, (byte) 0);
						if (local278.aBoolean862) {
							local252 = true;
						}
						if (local278.anInt4797 * -625133767 != -1) {
							@Pc(297) Class227 local297 = local104.method26120(local278.anInt4797 * -625133767, 73831368);
							if (local297.aClass608_2 == Class608.aClass608_4) {
								this.aBoolean163 = true;
							}
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt840--;
					continue;
				}
			}
			if (arg1.aClass228Array4 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass228Array4.length; local254++) {
					@Pc(336) Class228 local336 = arg1.aClass228Array4[local254];
					if (local237 == local336.anInt3671 * -2114351293) {
						@Pc(352) Class441 local352 = this.aClass102_Sub3_27.anInterface47_6.method29270(local336.anInt3681 * -1343861311, -1681407132);
						if (local352.aBoolean872) {
							local252 = true;
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt840--;
					continue;
				}
			}
			local374 = -1;
			if (arg1.aShortArray89 != null) {
				local374 = arg1.aShortArray89[local237];
				if (local374 != -1) {
					local239 = local104.method26120(local374 & 0xFFFF, 73831368);
					if ((this.anInt842 & 0x40) != 0 && local239.aBoolean758) {
						local374 = -1;
						local239 = null;
					} else {
						local245 = local239.aByte110;
						local247 = local239.aByte116;
						if (local239.aFloat263 != 0.0F || local239.aFloat264 != 0.0F) {
							this.aBoolean164 = true;
						}
					}
				}
			}
			@Pc(442) boolean local442 = arg1.aByteArray72 != null && arg1.aByteArray72[local237] != 0 || local239 != null && local239.aClass608_2 != Class608.aClass608_5;
			if ((local227 || local442) && arg1.aByteArray71 != null) {
				local241 += arg1.aByteArray71[local237] << 17;
			}
			if (local442) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local486 = local243 + ((local374 & 0xFFFF) << 16);
			@Pc(492) int local492 = local486 + (local229 & 0xFFFF);
			local218[local229] = ((long) local241 << 32) + (long) local492;
			this.aBoolean163 |= local442;
			this.aBoolean164 |= local239 != null && (local239.aFloat263 != 0.0F || local239.aFloat264 != 0.0F);
		}
		Class26.method596(local218, local111, 1767535302);
		this.anInt836 = arg1.anInt3777;
		this.anInt847 = arg1.anInt3783;
		this.anIntArray70 = arg1.anIntArray340;
		this.anIntArray71 = arg1.anIntArray341;
		this.anIntArray72 = arg1.anIntArray343;
		this.aShortArray16 = arg1.aShortArray90;
		@Pc(562) Class192[] local562 = new Class192[this.anInt847];
		this.aClass228Array2 = arg1.aClass228Array4;
		this.aClass211Array2 = arg1.aClass211Array4;
		@Pc(611) int local611;
		if (arg1.aClass226Array1 != null) {
			this.anInt846 = arg1.aClass226Array1.length;
			this.aClass206Array1 = new Class206[this.anInt846];
			this.aClass198Array1 = new Class198[this.anInt846];
			for (local237 = 0; local237 < this.anInt846; local237++) {
				@Pc(599) Class226 local599 = arg1.aClass226Array1[local237];
				@Pc(607) Class435 local607 = local107.method29234(local599.anInt3625 * 1644904431, (byte) 0);
				local486 = -1;
				for (local611 = 0; local611 < this.anInt839; local611++) {
					if (local111[local611] == local599.anInt3627 * -684337005) {
						local486 = local611;
						break;
					}
				}
				if (local486 == -1) {
					throw new RuntimeException();
				}
				local611 = Class687.anIntArray524[arg1.aShortArray95[local599.anInt3627 * -684337005] & 0xFFFF] & 0xFFFFFF;
				local611 |= 255 - (arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local599.anInt3627 * -684337005]) << 24;
				this.aClass206Array1[local237] = new Class206(local486, arg1.aShortArray91[local599.anInt3627 * -684337005], arg1.aShortArray92[local599.anInt3627 * -684337005], arg1.aShortArray93[local599.anInt3627 * -684337005], local607.anInt4796 * 1978348109, local607.anInt4799 * -1648049355, local607.anInt4797 * -625133767, local607.anInt4800 * -941598353, local607.anInt4801 * -658617737, local607.aBoolean862, local607.aBoolean863, local599.anInt3626 * 532802315);
				this.aClass198Array1[local237] = new Class198(local611);
			}
		}
		local237 = this.anInt839 * 3;
		this.aShortArray18 = new short[local237];
		this.aShortArray24 = new short[local237];
		this.aShortArray21 = new short[local237];
		this.aByteArray24 = new byte[local237];
		this.aFloatArray26 = new float[local237];
		this.aFloatArray25 = new float[local237];
		this.aShortArray19 = new short[this.anInt839];
		this.aByteArray23 = new byte[this.anInt839];
		this.aShortArray20 = new short[this.anInt839];
		this.aShortArray22 = new short[this.anInt839];
		this.aShortArray26 = new short[this.anInt839];
		this.aShortArray17 = new short[this.anInt839];
		if (arg1.aShortArray98 != null) {
			this.aShortArray23 = new short[this.anInt839];
		}
		this.aShort10 = (short) arg3;
		this.aShort11 = (short) arg4;
		this.aShortArray25 = new short[local237];
		aLongArray8 = new long[local237];
		@Pc(819) int local819 = 0;
		for (local241 = 0; local241 < arg1.anInt3783; local241++) {
			local486 = this.anIntArray74[local241];
			this.anIntArray74[local241] = local819;
			local819 += local486;
			local562[local241] = new Class192();
		}
		this.anIntArray74[arg1.anInt3783] = local819;
		@Pc(860) Class247 local860 = this.method7322(arg1, local111, this.anInt839);
		@Pc(864) Class180[] local864 = new Class180[arg1.anInt3780];
		@Pc(875) short local875;
		@Pc(885) short local885;
		@Pc(895) int local895;
		@Pc(905) int local905;
		for (local611 = 0; local611 < arg1.anInt3780; local611++) {
			local875 = arg1.aShortArray91[local611];
			local374 = arg1.aShortArray92[local611];
			local885 = arg1.aShortArray93[local611];
			local895 = this.anIntArray70[local374] - this.anIntArray70[local875];
			local905 = this.anIntArray71[local374] - this.anIntArray71[local875];
			@Pc(915) int local915 = this.anIntArray72[local374] - this.anIntArray72[local875];
			@Pc(925) int local925 = this.anIntArray70[local885] - this.anIntArray70[local875];
			@Pc(935) int local935 = this.anIntArray71[local885] - this.anIntArray71[local875];
			@Pc(945) int local945 = this.anIntArray72[local885] - this.anIntArray72[local875];
			@Pc(953) int local953 = local905 * local945 - local935 * local915;
			@Pc(961) int local961 = local915 * local925 - local945 * local895;
			@Pc(969) int local969;
			for (local969 = local895 * local935 - local925 * local905; local953 > 8192 || local961 > 8192 || local969 > 8192 || local953 < -8192 || local961 < -8192 || local969 < -8192; local969 >>= 0x1) {
				local953 >>= 0x1;
				local961 >>= 0x1;
			}
			@Pc(1015) int local1015 = (int) Math.sqrt((double) (local953 * local953 + local961 * local961 + local969 * local969));
			if (local1015 <= 0) {
				local1015 = 1;
			}
			local953 = local953 * 256 / local1015;
			local961 = local961 * 256 / local1015;
			local969 = local969 * 256 / local1015;
			@Pc(1047) byte local1047 = arg1.aByteArray70 == null ? 0 : arg1.aByteArray70[local611];
			if (local1047 == 0) {
				@Pc(1053) Class192 local1053 = local562[local875];
				local1053.anInt3339 += local953;
				local1053.anInt3338 += local961;
				local1053.anInt3340 += local969;
				local1053.anInt3341++;
				@Pc(1081) Class192 local1081 = local562[local374];
				local1081.anInt3339 += local953;
				local1081.anInt3338 += local961;
				local1081.anInt3340 += local969;
				local1081.anInt3341++;
				@Pc(1109) Class192 local1109 = local562[local885];
				local1109.anInt3339 += local953;
				local1109.anInt3338 += local961;
				local1109.anInt3340 += local969;
				local1109.anInt3341++;
			} else if (local1047 == 1) {
				@Pc(1145) Class180 local1145 = local864[local611] = new Class180();
				local1145.anInt3315 = local953;
				local1145.anInt3314 = local961;
				local1145.anInt3313 = local969;
			}
		}
		@Pc(1173) int local1173;
		for (local611 = 0; local611 < this.anInt839; local611++) {
			@Pc(1166) int local1166 = local111[local611];
			local1173 = arg1.aShortArray95[local1166] & 0xFFFF;
			local254 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local1166] & 0xFF;
			@Pc(1195) short local1195 = arg1.aShortArray89 == null ? -1 : arg1.aShortArray89[local1166];
			if (local1195 != -1 && (this.anInt842 & 0x40) != 0 && local104.method26120(local1195, 73831368).aBoolean758) {
				local1195 = -1;
			}
			@Pc(1213) float local1213 = 0.0F;
			@Pc(1215) float local1215 = 0.0F;
			@Pc(1217) float local1217 = 0.0F;
			@Pc(1219) float local1219 = 0.0F;
			@Pc(1221) float local1221 = 0.0F;
			@Pc(1223) float local1223 = 0.0F;
			@Pc(1374) short local1374;
			@Pc(1273) long local1273;
			@Pc(1286) long local1286;
			@Pc(1299) long local1299;
			if (local1195 == -1) {
				local1299 = 0L;
				local1286 = 0L;
				local1273 = 0L;
			} else {
				@Pc(1236) short local1236 = arg1.aShortArray94 == null ? -1 : arg1.aShortArray94[local1166];
				@Pc(1246) int local1246;
				if (local1236 == 32766) {
					local1246 = arg1.aByteArray68[local1166] & 0xFF;
					@Pc(1253) int local1253 = arg1.aByteArray69[local1166] & 0xFF;
					@Pc(1260) int local1260 = arg1.aByteArray73[local1166] & 0xFF;
					@Pc(1270) int local1270 = local1246 + arg1.anIntArray342[arg1.aShortArray91[local1166]];
					local1273 = local1270;
					@Pc(1283) int local1283 = local1253 + arg1.anIntArray342[arg1.aShortArray92[local1166]];
					local1286 = local1270;
					@Pc(1296) int local1296 = local1260 + arg1.anIntArray342[arg1.aShortArray93[local1166]];
					local1299 = local1270;
					local1213 = arg1.aFloatArray100[local1270];
					local1215 = arg1.aFloatArray101[local1270];
					local1217 = arg1.aFloatArray100[local1283];
					local1219 = arg1.aFloatArray101[local1283];
					local1221 = arg1.aFloatArray100[local1296];
					local1223 = arg1.aFloatArray101[local1296];
				} else if (local1236 == -1) {
					local1213 = 0.0F;
					local1215 = 1.0F;
					local1273 = 65535L;
					local1217 = 1.0F;
					local1219 = 1.0F;
					local1286 = 131071L;
					local1221 = 0.0F;
					local1223 = 0.0F;
					local1299 = 196607L;
				} else {
					@Pc(1356) int local1356 = local1236 & 0xFFFF;
					local1246 = 0;
					@Pc(1360) byte local1360 = 0;
					@Pc(1362) byte local1362 = 0;
					@Pc(1367) byte local1367 = arg1.aByteArray74[local1356];
					@Pc(1379) short local1379;
					@Pc(1384) short local1384;
					@Pc(1417) float local1417;
					@Pc(1425) float local1425;
					@Pc(1433) float local1433;
					@Pc(1513) float local1513;
					@Pc(1521) float local1521;
					@Pc(1529) float local1529;
					@Pc(1537) float local1537;
					@Pc(1545) float local1545;
					@Pc(1553) float local1553;
					if (local1367 == 0) {
						local1374 = arg1.aShortArray91[local1166];
						local1379 = arg1.aShortArray92[local1166];
						local1384 = arg1.aShortArray93[local1166];
						@Pc(1389) short local1389 = arg1.aShortArray96[local1356];
						@Pc(1394) short local1394 = arg1.aShortArray88[local1356];
						@Pc(1399) short local1399 = arg1.aShortArray97[local1356];
						@Pc(1405) float local1405 = (float) arg1.anIntArray340[local1389];
						@Pc(1411) float local1411 = (float) arg1.anIntArray341[local1389];
						local1417 = arg1.anIntArray343[local1389];
						local1425 = (float) arg1.anIntArray340[local1394] - local1405;
						local1433 = (float) arg1.anIntArray341[local1394] - local1411;
						@Pc(1441) float local1441 = (float) arg1.anIntArray343[local1394] - local1417;
						@Pc(1449) float local1449 = (float) arg1.anIntArray340[local1399] - local1405;
						@Pc(1457) float local1457 = (float) arg1.anIntArray341[local1399] - local1411;
						@Pc(1465) float local1465 = (float) arg1.anIntArray343[local1399] - local1417;
						@Pc(1473) float local1473 = (float) arg1.anIntArray340[local1374] - local1405;
						@Pc(1481) float local1481 = (float) arg1.anIntArray341[local1374] - local1411;
						@Pc(1489) float local1489 = (float) arg1.anIntArray343[local1374] - local1417;
						@Pc(1497) float local1497 = (float) arg1.anIntArray340[local1379] - local1405;
						@Pc(1505) float local1505 = (float) arg1.anIntArray341[local1379] - local1411;
						local1513 = (float) arg1.anIntArray343[local1379] - local1417;
						local1521 = (float) arg1.anIntArray340[local1384] - local1405;
						local1529 = (float) arg1.anIntArray341[local1384] - local1411;
						local1537 = (float) arg1.anIntArray343[local1384] - local1417;
						local1545 = local1433 * local1465 - local1441 * local1457;
						local1553 = local1441 * local1449 - local1425 * local1465;
						@Pc(1561) float local1561 = local1425 * local1457 - local1433 * local1449;
						@Pc(1569) float local1569 = local1457 * local1561 - local1465 * local1553;
						@Pc(1577) float local1577 = local1465 * local1545 - local1449 * local1561;
						@Pc(1585) float local1585 = local1449 * local1553 - local1457 * local1545;
						@Pc(1599) float local1599 = 1.0F / (local1569 * local1425 + local1577 * local1433 + local1585 * local1441);
						local1213 = (local1569 * local1473 + local1577 * local1481 + local1585 * local1489) * local1599;
						local1217 = (local1569 * local1497 + local1577 * local1505 + local1585 * local1513) * local1599;
						local1221 = (local1569 * local1521 + local1577 * local1529 + local1585 * local1537) * local1599;
						@Pc(1649) float local1649 = local1433 * local1561 - local1441 * local1553;
						@Pc(1657) float local1657 = local1441 * local1545 - local1425 * local1561;
						@Pc(1665) float local1665 = local1425 * local1553 - local1433 * local1545;
						@Pc(1679) float local1679 = 1.0F / (local1649 * local1449 + local1657 * local1457 + local1665 * local1465);
						local1215 = (local1649 * local1473 + local1657 * local1481 + local1665 * local1489) * local1679;
						local1219 = (local1649 * local1497 + local1657 * local1505 + local1665 * local1513) * local1679;
						local1223 = (local1649 * local1521 + local1657 * local1529 + local1665 * local1537) * local1679;
					} else {
						local1374 = arg1.aShortArray91[local1166];
						local1379 = arg1.aShortArray92[local1166];
						local1384 = arg1.aShortArray93[local1166];
						@Pc(1742) int local1742 = local860.anIntArray358[local1356];
						@Pc(1747) int local1747 = local860.anIntArray357[local1356];
						@Pc(1752) int local1752 = local860.anIntArray359[local1356];
						@Pc(1757) float[] local1757 = local860.aFloatArrayArray24[local1356];
						@Pc(1762) byte local1762 = arg1.aByteArray76[local1356];
						local1417 = (float) arg1.anIntArray346[local1356] / 256.0F;
						if (local1367 == 1) {
							local1425 = (float) arg1.anIntArray348[local1356] / 1024.0F;
							method7319(arg1.anIntArray340[local1374], arg1.anIntArray341[local1374], arg1.anIntArray343[local1374], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method7319(arg1.anIntArray340[local1379], arg1.anIntArray341[local1379], arg1.anIntArray343[local1379], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method7319(arg1.anIntArray340[local1384], arg1.anIntArray341[local1384], arg1.anIntArray343[local1384], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
							local1221 = aFloatArray27[0];
							local1223 = aFloatArray27[1];
							local1433 = local1425 / 2.0F;
							if ((local1762 & 0x1) == 0) {
								if (local1217 - local1213 > local1433) {
									local1217 -= local1425;
									local1360 = 1;
								} else if (local1213 - local1217 > local1433) {
									local1217 += local1425;
									local1360 = 2;
								}
								if (local1221 - local1213 > local1433) {
									local1221 -= local1425;
									local1362 = 1;
								} else if (local1213 - local1221 > local1433) {
									local1221 += local1425;
									local1362 = 2;
								}
							} else {
								if (local1219 - local1215 > local1433) {
									local1219 -= local1425;
									local1360 = 1;
								} else if (local1215 - local1219 > local1433) {
									local1219 += local1425;
									local1360 = 2;
								}
								if (local1223 - local1215 > local1433) {
									local1223 -= local1425;
									local1362 = 1;
								} else if (local1215 - local1223 > local1433) {
									local1223 += local1425;
									local1362 = 2;
								}
							}
						} else if (local1367 == 2) {
							local1425 = (float) arg1.anIntArray349[local1356] / 256.0F;
							local1433 = (float) arg1.anIntArray350[local1356] / 256.0F;
							@Pc(2007) int local2007 = arg1.anIntArray340[local1379] - arg1.anIntArray340[local1374];
							@Pc(2017) int local2017 = arg1.anIntArray341[local1379] - arg1.anIntArray341[local1374];
							@Pc(2027) int local2027 = arg1.anIntArray343[local1379] - arg1.anIntArray343[local1374];
							@Pc(2037) int local2037 = arg1.anIntArray340[local1384] - arg1.anIntArray340[local1374];
							@Pc(2047) int local2047 = arg1.anIntArray341[local1384] - arg1.anIntArray341[local1374];
							@Pc(2057) int local2057 = arg1.anIntArray343[local1384] - arg1.anIntArray343[local1374];
							@Pc(2065) int local2065 = local2017 * local2057 - local2047 * local2027;
							@Pc(2073) int local2073 = local2027 * local2037 - local2057 * local2007;
							@Pc(2081) int local2081 = local2007 * local2047 - local2037 * local2017;
							local1513 = 64.0F / (float) arg1.anIntArray339[local1356];
							local1521 = 64.0F / (float) arg1.anIntArray344[local1356];
							local1529 = 64.0F / (float) arg1.anIntArray348[local1356];
							local1537 = ((float) local2065 * local1757[0] + (float) local2073 * local1757[1] + (float) local2081 * local1757[2]) / local1513;
							local1545 = ((float) local2065 * local1757[3] + (float) local2073 * local1757[4] + (float) local2081 * local1757[5]) / local1521;
							local1553 = ((float) local2065 * local1757[6] + (float) local2073 * local1757[7] + (float) local2081 * local1757[8]) / local1529;
							local1246 = method7320(local1537, local1545, local1553);
							method7321(arg1.anIntArray340[local1374], arg1.anIntArray341[local1374], arg1.anIntArray343[local1374], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method7321(arg1.anIntArray340[local1379], arg1.anIntArray341[local1379], arg1.anIntArray343[local1379], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method7321(arg1.anIntArray340[local1384], arg1.anIntArray341[local1384], arg1.anIntArray343[local1384], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1221 = aFloatArray27[0];
							local1223 = aFloatArray27[1];
						} else if (local1367 == 3) {
							method7363(arg1.anIntArray340[local1374], arg1.anIntArray341[local1374], arg1.anIntArray343[local1374], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method7363(arg1.anIntArray340[local1379], arg1.anIntArray341[local1379], arg1.anIntArray343[local1379], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method7363(arg1.anIntArray340[local1384], arg1.anIntArray341[local1384], arg1.anIntArray343[local1384], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
							local1221 = aFloatArray27[0];
							local1223 = aFloatArray27[1];
							if ((local1762 & 0x1) == 0) {
								if (local1217 - local1213 > 0.5F) {
									local1217--;
									local1360 = 1;
								} else if (local1213 - local1217 > 0.5F) {
									local1217++;
									local1360 = 2;
								}
								if (local1221 - local1213 > 0.5F) {
									local1221--;
									local1362 = 1;
								} else if (local1213 - local1221 > 0.5F) {
									local1221++;
									local1362 = 2;
								}
							} else {
								if (local1219 - local1215 > 0.5F) {
									local1219--;
									local1360 = 1;
								} else if (local1215 - local1219 > 0.5F) {
									local1219++;
									local1360 = 2;
								}
								if (local1223 - local1215 > 0.5F) {
									local1223--;
									local1362 = 1;
								} else if (local1215 - local1223 > 0.5F) {
									local1223++;
									local1362 = 2;
								}
							}
						}
					}
					local1273 = local1246 << 16 | local1356;
					local1286 = (long) (local1360 << 19) | local1273;
					local1299 = (long) (local1362 << 19) | local1273;
				}
			}
			@Pc(2503) byte local2503 = arg1.aByteArray70 == null ? 0 : arg1.aByteArray70[local1166];
			if (local2503 == 0) {
				@Pc(2512) long local2512 = (long) ((local1173 << 8) + local254);
				@Pc(2517) short local2517 = arg1.aShortArray91[local1166];
				@Pc(2522) short local2522 = arg1.aShortArray92[local1166];
				local1374 = arg1.aShortArray93[local1166];
				@Pc(2531) Class192 local2531 = local562[local2517];
				this.aShortArray20[local611] = this.method6935(arg1, local2517, local2512 | local1273 << 24, local2531.anInt3339, local2531.anInt3338, local2531.anInt3340, local2531.anInt3341, local1213, local1215);
				@Pc(2558) Class192 local2558 = local562[local2522];
				this.aShortArray22[local611] = this.method6935(arg1, local2522, local2512 | local1286 << 24, local2558.anInt3339, local2558.anInt3338, local2558.anInt3340, local2558.anInt3341, local1217, local1219);
				@Pc(2585) Class192 local2585 = local562[local1374];
				this.aShortArray26[local611] = this.method6935(arg1, local1374, local2512 | local1299 << 24, local2585.anInt3339, local2585.anInt3338, local2585.anInt3340, local2585.anInt3341, local1221, local1223);
			} else if (local2503 == 1) {
				@Pc(2616) Class180 local2616 = local864[local1166];
				@Pc(2648) long local2648 = ((long) (local2616.anInt3315 & Integer.MIN_VALUE) << 9) + ((long) (local2616.anInt3314 + 256) << 32) + ((long) (local2616.anInt3313 + 256) << 24) + (long) (local1173 << 8) + (long) local254;
				this.aShortArray20[local611] = this.method6935(arg1, arg1.aShortArray91[local1166], local2648 | local1273 << 41, local2616.anInt3315, local2616.anInt3314, local2616.anInt3313, 0, local1213, local1215);
				this.aShortArray22[local611] = this.method6935(arg1, arg1.aShortArray92[local1166], local2648 | local1273 << 41, local2616.anInt3315, local2616.anInt3314, local2616.anInt3313, 0, local1217, local1219);
				this.aShortArray26[local611] = this.method6935(arg1, arg1.aShortArray93[local1166], local2648 | local1273 << 41, local2616.anInt3315, local2616.anInt3314, local2616.anInt3313, 0, local1221, local1223);
			}
			if (arg1.aByteArray72 != null) {
				this.aByteArray23[local611] = arg1.aByteArray72[local1166];
			}
			if (arg1.aShortArray98 != null) {
				this.aShortArray23[local611] = arg1.aShortArray98[local1166];
			}
			this.aShortArray19[local611] = arg1.aShortArray95[local1166];
			this.aShortArray17[local611] = local1195;
		}
		local611 = 0;
		local875 = -10000;
		for (local1173 = 0; local1173 < this.anInt840; local1173++) {
			local885 = this.aShortArray17[local1173];
			if (local885 != local875) {
				local611++;
				local875 = local885;
			}
		}
		this.anIntArray77 = new int[local611 + 1];
		local611 = 0;
		local875 = -10000;
		for (local1173 = 0; local1173 < this.anInt840; local1173++) {
			local885 = this.aShortArray17[local1173];
			if (local885 != local875) {
				this.anIntArray77[local611++] = local1173;
				local875 = local885;
			}
		}
		this.anIntArray77[local611] = this.anInt840;
		aLongArray8 = null;
		this.aShortArray18 = method6923(this.aShortArray18, this.anInt837);
		this.aShortArray24 = method6923(this.aShortArray24, this.anInt837);
		this.aShortArray21 = method6923(this.aShortArray21, this.anInt837);
		this.aByteArray24 = method6922(this.aByteArray24, this.anInt837);
		this.aFloatArray26 = method6924(this.aFloatArray26, this.anInt837);
		this.aFloatArray25 = method6924(this.aFloatArray25, this.anInt837);
		if (arg1.anIntArray347 != null && Class184.method24733(arg2, this.anInt842)) {
			this.anIntArrayArray11 = arg1.method26046(false);
		}
		if (arg1.aClass226Array1 != null && Class184.method24771(arg2, this.anInt842)) {
			this.anIntArrayArray13 = arg1.method26048();
		}
		if (arg1.anIntArray345 != null && Class184.method24732(arg2, this.anInt842)) {
			local1173 = 0;
			@Pc(2905) int[] local2905 = new int[256];
			for (local895 = 0; local895 < this.anInt839; local895++) {
				local905 = arg1.anIntArray345[local111[local895]];
				if (local905 >= 0) {
					@Pc(2924) int local2924 = local2905[local905]++;
					if (local905 > local1173) {
						local1173 = local905;
					}
				}
			}
			this.anIntArrayArray12 = new int[local1173 + 1][];
			for (local895 = 0; local895 <= local1173; local895++) {
				this.anIntArrayArray12[local895] = new int[local2905[local895]];
				local2905[local895] = 0;
			}
			for (local895 = 0; local895 < this.anInt839; local895++) {
				local905 = arg1.anIntArray345[local111[local895]];
				if (local905 >= 0) {
					this.anIntArrayArray12[local905][local2905[local905]++] = local895;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class105_Sub2(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aClass102_Sub3_27 = arg0;
		this.aClass189_7 = new Class189(null, 5126, 3, 0);
		this.aClass189_10 = new Class189(null, 5126, 2, 0);
		this.aClass189_9 = new Class189(null, 5126, 3, 0);
		this.aClass189_8 = new Class189(null, 5121, 4, 0);
		this.aClass196_1 = new Class196();
	}

	@OriginalMember(owner = "client!afp", name = "cf", descriptor = "()V")
	@Override
	void method7418() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt836; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray72[local1] = this.anIntArray72[local1] + 7 >> 4;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ap", descriptor = "()I")
	@Override
	public int method7533() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!afp", name = "ho", descriptor = "()[B")
	@Override
	public byte[] method7537() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afp", name = "o", descriptor = "()I")
	@Override
	public int method7326() {
		return this.anInt844;
	}

	@OriginalMember(owner = "client!afp", name = "dj", descriptor = "()I")
	@Override
	public int method7442() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt843;
	}

	@OriginalMember(owner = "client!afp", name = "j", descriptor = "()V")
	@Override
	public void method7404() {
		if (this.anInt837 <= 0 || this.anInt840 <= 0) {
			return;
		}
		this.method6950(false);
		if ((this.aByte4 & 0x10) == 0 && this.aClass196_1.anInterface15_5 == null) {
			this.method6932(false);
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "i", descriptor = "(BIZ)Lclient!dn;")
	@Override
	public Class105 method7324(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class105_Sub2 local22;
		@Pc(14) Class105_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass102_Sub3_27.aClass105_Sub2Array2[arg0 - 1];
			local22 = this.aClass102_Sub3_27.aClass105_Sub2Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class105_Sub2(this.aClass102_Sub3_27);
		}
		return this.method6925(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afp", name = "hg", descriptor = "(Lclient!afp;Lclient!afp;IZZ)Lclient!dn;")
	Class105 method6925(@OriginalArg(0) Class105_Sub2 arg0, @OriginalArg(1) Class105_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte4 = 0;
		arg0.anInt844 = arg2;
		arg0.anInt842 = this.anInt842;
		arg0.aShort10 = this.aShort10;
		arg0.aShort11 = this.aShort11;
		arg0.anInt836 = this.anInt836;
		arg0.anInt847 = this.anInt847;
		arg0.anInt837 = this.anInt837;
		arg0.anInt839 = this.anInt839;
		arg0.anInt840 = this.anInt840;
		arg0.anInt846 = this.anInt846;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean163 = this.aBoolean163;
		} else {
			arg0.aBoolean163 = true;
		}
		arg0.aBoolean164 = this.aBoolean164;
		@Pc(62) boolean local62 = Class184.method24703(arg2, this.anInt842);
		@Pc(67) boolean local67 = Class184.method24704(arg2, this.anInt842);
		@Pc(72) boolean local72 = Class184.method24766(arg2, this.anInt842);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt836) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt836];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local67) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt836) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt836];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			if (!local72) {
				arg0.anIntArray72 = this.anIntArray72;
			} else if (arg1.anIntArray72 == null || arg1.anIntArray72.length < this.anInt836) {
				arg0.anIntArray72 = arg1.anIntArray72 = new int[this.anInt836];
			} else {
				arg0.anIntArray72 = arg1.anIntArray72;
			}
			for (local169 = 0; local169 < this.anInt836; local169++) {
				if (local62) {
					arg0.anIntArray70[local169] = this.anIntArray70[local169];
				}
				if (local67) {
					arg0.anIntArray71[local169] = this.anIntArray71[local169];
				}
				if (local72) {
					arg0.anIntArray72[local169] = this.anIntArray72[local169];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray71 = this.anIntArray71;
			arg0.anIntArray72 = this.anIntArray72;
		}
		if (Class184.method24720(arg2, this.anInt842)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x1);
			}
			arg0.aClass189_7 = arg1.aClass189_7;
			arg0.aClass189_7.aByte106 = this.aClass189_7.aByte106;
			arg0.aClass189_7.anInterface14_6 = this.aClass189_7.anInterface14_6;
		} else if (Class184.method24761(arg2, this.anInt842)) {
			arg0.aClass189_7 = this.aClass189_7;
		} else {
			arg0.aClass189_7 = null;
		}
		if (Class184.method24708(arg2, this.anInt842)) {
			if (arg1.aShortArray19 == null || arg1.aShortArray19.length < this.anInt839) {
				arg0.aShortArray19 = arg1.aShortArray19 = new short[this.anInt839];
			} else {
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local169 = 0; local169 < this.anInt839; local169++) {
				arg0.aShortArray19[local169] = this.aShortArray19[local169];
			}
		} else {
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class184.method24711(arg2, this.anInt842)) {
			if (arg1.aByteArray23 == null || arg1.aByteArray23.length < this.anInt839) {
				arg0.aByteArray23 = arg1.aByteArray23 = new byte[this.anInt839];
			} else {
				arg0.aByteArray23 = arg1.aByteArray23;
			}
			for (local169 = 0; local169 < this.anInt839; local169++) {
				arg0.aByteArray23[local169] = this.aByteArray23[local169];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Class184.method24722(arg2, this.anInt842)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x2);
			}
			arg0.aClass189_8 = arg1.aClass189_8;
			arg0.aClass189_8.aByte106 = this.aClass189_8.aByte106;
			arg0.aClass189_8.anInterface14_6 = this.aClass189_8.anInterface14_6;
		} else if (Class184.method24717(arg2, this.anInt842)) {
			arg0.aClass189_8 = this.aClass189_8;
		} else {
			arg0.aClass189_8 = null;
		}
		@Pc(482) int local482;
		if (Class184.method24725(arg2, this.anInt842)) {
			if (arg1.aShortArray18 == null || arg1.aShortArray18.length < this.anInt837) {
				local169 = this.anInt837;
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local169];
				arg0.aShortArray24 = arg1.aShortArray24 = new short[local169];
				arg0.aShortArray21 = arg1.aShortArray21 = new short[local169];
			} else {
				arg0.aShortArray18 = arg1.aShortArray18;
				arg0.aShortArray24 = arg1.aShortArray24;
				arg0.aShortArray21 = arg1.aShortArray21;
			}
			if (this.aClass214_1 == null) {
				for (local169 = 0; local169 < this.anInt837; local169++) {
					arg0.aShortArray18[local169] = this.aShortArray18[local169];
					arg0.aShortArray24[local169] = this.aShortArray24[local169];
					arg0.aShortArray21[local169] = this.aShortArray21[local169];
				}
			} else {
				if (arg1.aClass214_1 == null) {
					arg1.aClass214_1 = new Class214();
				}
				@Pc(470) Class214 local470 = arg0.aClass214_1 = arg1.aClass214_1;
				if (local470.aShortArray86 == null || local470.aShortArray86.length < this.anInt837) {
					local482 = this.anInt837;
					local470.aShortArray86 = new short[local482];
					local470.aShortArray85 = new short[local482];
					local470.aShortArray87 = new short[local482];
					local470.aByteArray66 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt837; local482++) {
					arg0.aShortArray18[local482] = this.aShortArray18[local482];
					arg0.aShortArray24[local482] = this.aShortArray24[local482];
					arg0.aShortArray21[local482] = this.aShortArray21[local482];
					local470.aShortArray86[local482] = this.aClass214_1.aShortArray86[local482];
					local470.aShortArray85[local482] = this.aClass214_1.aShortArray85[local482];
					local470.aShortArray87[local482] = this.aClass214_1.aShortArray87[local482];
					local470.aByteArray66[local482] = this.aClass214_1.aByteArray66[local482];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aClass214_1 = this.aClass214_1;
			arg0.aShortArray18 = this.aShortArray18;
			arg0.aShortArray24 = this.aShortArray24;
			arg0.aShortArray21 = this.aShortArray21;
			arg0.aByteArray24 = this.aByteArray24;
		}
		if (Class184.method24721(arg2, this.anInt842)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x4);
			}
			arg0.aClass189_9 = arg1.aClass189_9;
			arg0.aClass189_9.aByte106 = this.aClass189_9.aByte106;
			arg0.aClass189_9.anInterface14_6 = this.aClass189_9.anInterface14_6;
		} else if (Class184.method24709(arg2, this.anInt842)) {
			arg0.aClass189_9 = this.aClass189_9;
		} else {
			arg0.aClass189_9 = null;
		}
		if (Class184.method24710(arg2, this.anInt842)) {
			if (arg1.aFloatArray26 == null || arg1.aFloatArray26.length < this.anInt839) {
				local169 = this.anInt837;
				arg0.aFloatArray26 = arg1.aFloatArray26 = new float[local169];
				arg0.aFloatArray25 = arg1.aFloatArray25 = new float[local169];
			} else {
				arg0.aFloatArray26 = arg1.aFloatArray26;
				arg0.aFloatArray25 = arg1.aFloatArray25;
			}
			for (local169 = 0; local169 < this.anInt837; local169++) {
				arg0.aFloatArray26[local169] = this.aFloatArray26[local169];
				arg0.aFloatArray25[local169] = this.aFloatArray25[local169];
			}
		} else {
			arg0.aFloatArray26 = this.aFloatArray26;
			arg0.aFloatArray25 = this.aFloatArray25;
		}
		if (Class184.method24723(arg2, this.anInt842)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x8);
			}
			arg0.aClass189_10 = arg1.aClass189_10;
			arg0.aClass189_10.aByte106 = this.aClass189_10.aByte106;
			arg0.aClass189_10.anInterface14_6 = this.aClass189_10.anInterface14_6;
		} else if (Class184.method24797(arg2, this.anInt842)) {
			arg0.aClass189_10 = this.aClass189_10;
		} else {
			arg0.aClass189_10 = null;
		}
		if (Class184.method24790(arg2, this.anInt842)) {
			if (arg1.aShortArray20 == null || arg1.aShortArray20.length < this.anInt839) {
				local169 = this.anInt839;
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local169];
				arg0.aShortArray22 = arg1.aShortArray22 = new short[local169];
				arg0.aShortArray26 = arg1.aShortArray26 = new short[local169];
			} else {
				arg0.aShortArray20 = arg1.aShortArray20;
				arg0.aShortArray22 = arg1.aShortArray22;
				arg0.aShortArray26 = arg1.aShortArray26;
			}
			for (local169 = 0; local169 < this.anInt839; local169++) {
				arg0.aShortArray20[local169] = this.aShortArray20[local169];
				arg0.aShortArray22[local169] = this.aShortArray22[local169];
				arg0.aShortArray26[local169] = this.aShortArray26[local169];
			}
		} else {
			arg0.aShortArray20 = this.aShortArray20;
			arg0.aShortArray22 = this.aShortArray22;
			arg0.aShortArray26 = this.aShortArray26;
		}
		if (Class184.method24724(arg2, this.anInt842)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x10);
			}
			arg0.aClass196_1 = arg1.aClass196_1;
			arg0.aClass196_1.anInterface15_5 = this.aClass196_1.anInterface15_5;
		} else if (Class184.method24719(arg2, this.anInt842)) {
			arg0.aClass196_1 = this.aClass196_1;
		} else {
			arg0.aClass196_1 = null;
		}
		if (Class184.method24702(arg2, this.anInt842)) {
			if (arg1.aShortArray17 == null || arg1.aShortArray17.length < this.anInt839) {
				local169 = this.anInt839;
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local169];
			} else {
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			for (local169 = 0; local169 < this.anInt839; local169++) {
				arg0.aShortArray17[local169] = this.aShortArray17[local169];
			}
		} else {
			arg0.aShortArray17 = this.aShortArray17;
		}
		if (!Class184.method24789(arg2, this.anInt842)) {
			arg0.aClass198Array1 = this.aClass198Array1;
		} else if (arg1.aClass198Array1 == null || arg1.aClass198Array1.length < this.anInt846) {
			local169 = this.anInt846;
			arg0.aClass198Array1 = arg1.aClass198Array1 = new Class198[local169];
			for (local482 = 0; local482 < this.anInt846; local482++) {
				arg0.aClass198Array1[local482] = this.aClass198Array1[local482].method24916();
			}
		} else {
			arg0.aClass198Array1 = arg1.aClass198Array1;
			for (local169 = 0; local169 < this.anInt846; local169++) {
				arg0.aClass198Array1[local169].method24917(this.aClass198Array1[local169]);
			}
		}
		arg0.aClass206Array1 = this.aClass206Array1;
		if (this.aBoolean166) {
			arg0.anInt843 = this.anInt843;
			arg0.anInt838 = this.anInt838;
			arg0.aShort14 = this.aShort14;
			arg0.aShort15 = this.aShort15;
			arg0.aShort12 = this.aShort12;
			arg0.aShort13 = this.aShort13;
			arg0.aShort16 = this.aShort16;
			arg0.aShort17 = this.aShort17;
			arg0.aBoolean166 = true;
		} else {
			arg0.aBoolean166 = false;
		}
		if (this.aBoolean167) {
			arg0.aShort18 = this.aShort18;
			arg0.aBoolean167 = true;
		} else {
			arg0.aBoolean167 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray25 = this.aShortArray25;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.aShortArray16 = this.aShortArray16;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray77 = this.anIntArray77;
		arg0.aClass228Array2 = this.aClass228Array2;
		arg0.aClass211Array2 = this.aClass211Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!afp", name = "hb", descriptor = "()V")
	void method6926() {
		if (!this.aBoolean165) {
			return;
		}
		this.aBoolean165 = false;
		if (this.aClass228Array2 == null && this.aClass211Array2 == null && this.aClass206Array1 == null && !Class184.method24706(this.anInt844, this.anInt842)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class184.method24715(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local23 = true;
				}
			}
			if (this.anIntArray71 != null && !Class184.method24726(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local25 = true;
				}
			}
			if (this.anIntArray72 != null && !Class184.method24727(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray71 = null;
			}
			if (local27) {
				this.anIntArray72 = null;
			}
		}
		if (this.aShortArray25 != null && this.anIntArray70 == null && this.anIntArray71 == null && this.anIntArray72 == null) {
			this.aShortArray25 = null;
			this.anIntArray74 = null;
		}
		if (this.aByteArray24 != null && !Class184.method24798(this.anInt844, this.anInt842)) {
			if (this.aClass189_9 == null) {
				if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					this.aShortArray21 = null;
					this.aShortArray24 = null;
					this.aShortArray18 = null;
					this.aByteArray24 = null;
				}
			} else if (this.aClass189_9.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray21 = null;
				this.aShortArray24 = null;
				this.aShortArray18 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray19 != null && !Class184.method24729(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray23 != null && !Class184.method24730(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aByteArray23 = null;
			}
		}
		if (this.aFloatArray26 != null && !Class184.method24731(this.anInt844, this.anInt842)) {
			if (this.aClass189_10 != null && this.aClass189_10.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aFloatArray25 = null;
				this.aFloatArray26 = null;
			}
		}
		if (this.aShortArray17 != null && !Class184.method24736(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray17 = null;
			}
		}
		if (this.aShortArray20 != null && !Class184.method24735(this.anInt844, this.anInt842)) {
			if (this.aClass196_1 != null && this.aClass196_1.anInterface15_5 == null || this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray26 = null;
				this.aShortArray22 = null;
				this.aShortArray20 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class184.method24732(this.anInt844, this.anInt842)) {
			this.anIntArrayArray12 = null;
			this.aShortArray23 = null;
		}
		if (this.anIntArrayArray11 != null && !Class184.method24733(this.anInt844, this.anInt842)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class184.method24771(this.anInt844, this.anInt842)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray77 != null && (this.anInt844 & 0x800) == 0 && (this.anInt844 & 0x40000) == 0) {
			this.anIntArray77 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ey", descriptor = "(I)V")
	@Override
	public void method7457(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "s", descriptor = "(I)V")
	@Override
	public void method7329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt847; local9++) {
			local29 = this.anIntArray72[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray72[local9] = this.anIntArray72[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt837; local9++) {
			local29 = this.aShortArray21[local9] * local3 + this.aShortArray18[local9] * local7 >> 14;
			this.aShortArray21[local9] = (short) (this.aShortArray21[local9] * local7 - this.aShortArray18[local9] * local3 >> 14);
			this.aShortArray18[local9] = (short) local29;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "k", descriptor = "(I)V")
	@Override
	public void method7330(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray72[local9] * local3 >> 14;
			this.anIntArray72[local9] = this.anIntArray71[local9] * local3 + this.anIntArray72[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "x", descriptor = "(I)V")
	@Override
	public void method7318(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ca", descriptor = "()V")
	@Override
	void method7408() {
	}

	@OriginalMember(owner = "client!afp", name = "r", descriptor = "()V")
	@Override
	public void method7344() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt847; local1++) {
			this.anIntArray72[local1] = -this.anIntArray72[local1];
		}
		for (local1 = 0; local1 < this.anInt837; local1++) {
			this.aShortArray21[local1] = (short) -this.aShortArray21[local1];
		}
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(45) short local45 = this.aShortArray20[local1];
			this.aShortArray20[local1] = this.aShortArray26[local1];
			this.aShortArray26[local1] = local45;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.anInterface15_5 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "q", descriptor = "(III)V")
	@Override
	public void method7334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray72[local1] = this.anIntArray72[local1] * arg2 >> 7;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "iy", descriptor = "()V")
	void method6927() {
		if (!this.aBoolean165) {
			return;
		}
		this.aBoolean165 = false;
		if (this.aClass228Array2 == null && this.aClass211Array2 == null && this.aClass206Array1 == null && !Class184.method24706(this.anInt844, this.anInt842)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class184.method24715(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local23 = true;
				}
			}
			if (this.anIntArray71 != null && !Class184.method24726(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local25 = true;
				}
			}
			if (this.anIntArray72 != null && !Class184.method24727(this.anInt844, this.anInt842)) {
				if (this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					if (!this.aBoolean166) {
						this.method6960();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray71 = null;
			}
			if (local27) {
				this.anIntArray72 = null;
			}
		}
		if (this.aShortArray25 != null && this.anIntArray70 == null && this.anIntArray71 == null && this.anIntArray72 == null) {
			this.aShortArray25 = null;
			this.anIntArray74 = null;
		}
		if (this.aByteArray24 != null && !Class184.method24798(this.anInt844, this.anInt842)) {
			if (this.aClass189_9 == null) {
				if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
					this.aBoolean165 = true;
				} else {
					this.aShortArray21 = null;
					this.aShortArray24 = null;
					this.aShortArray18 = null;
					this.aByteArray24 = null;
				}
			} else if (this.aClass189_9.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray21 = null;
				this.aShortArray24 = null;
				this.aShortArray18 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray19 != null && !Class184.method24729(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray23 != null && !Class184.method24730(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aByteArray23 = null;
			}
		}
		if (this.aFloatArray26 != null && !Class184.method24731(this.anInt844, this.anInt842)) {
			if (this.aClass189_10 != null && this.aClass189_10.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aFloatArray25 = null;
				this.aFloatArray26 = null;
			}
		}
		if (this.aShortArray17 != null && !Class184.method24736(this.anInt844, this.anInt842)) {
			if (this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray17 = null;
			}
		}
		if (this.aShortArray20 != null && !Class184.method24735(this.anInt844, this.anInt842)) {
			if (this.aClass196_1 != null && this.aClass196_1.anInterface15_5 == null || this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null) {
				this.aBoolean165 = true;
			} else {
				this.aShortArray26 = null;
				this.aShortArray22 = null;
				this.aShortArray20 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class184.method24732(this.anInt844, this.anInt842)) {
			this.anIntArrayArray12 = null;
			this.aShortArray23 = null;
		}
		if (this.anIntArrayArray11 != null && !Class184.method24733(this.anInt844, this.anInt842)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class184.method24771(this.anInt844, this.anInt842)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray77 != null && (this.anInt844 & 0x800) == 0 && (this.anInt844 & 0x40000) == 0) {
			this.anIntArray77 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "am", descriptor = "(IIII)V")
	@Override
	void method7335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local11 = 0; local11 < this.anInt847; local11++) {
				anInt845 += this.anIntArray70[local11];
				anInt848 += this.anIntArray71[local11];
				anInt849 += this.anIntArray72[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt845 = anInt845 / local3 + arg1;
				anInt848 = anInt848 / local3 + arg2;
				anInt849 = anInt849 / local3 + arg3;
			} else {
				anInt845 = arg1;
				anInt848 = arg2;
				anInt849 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt847; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray71[local3] += arg2;
				this.anIntArray72[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt847; local3++) {
					this.anIntArray70[local3] -= anInt845;
					this.anIntArray71[local3] -= anInt848;
					this.anIntArray72[local3] -= anInt849;
					if (arg3 != 0) {
						local11 = Class467.anIntArray454[arg3];
						local146 = Class467.anIntArray453[arg3];
						local164 = this.anIntArray71[local3] * local11 + this.anIntArray70[local3] * local146 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local146 - this.anIntArray70[local3] * local11 + 16383 >> 14;
						this.anIntArray70[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class467.anIntArray454[arg1];
						local146 = Class467.anIntArray453[arg1];
						local164 = this.anIntArray71[local3] * local146 - this.anIntArray72[local3] * local11 + 16383 >> 14;
						this.anIntArray72[local3] = this.anIntArray71[local3] * local11 + this.anIntArray72[local3] * local146 + 16383 >> 14;
						this.anIntArray71[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class467.anIntArray454[arg2];
						local146 = Class467.anIntArray453[arg2];
						local164 = this.anIntArray72[local3] * local11 + this.anIntArray70[local3] * local146 + 16383 >> 14;
						this.anIntArray72[local3] = this.anIntArray72[local3] * local146 - this.anIntArray70[local3] * local11 + 16383 >> 14;
						this.anIntArray70[local3] = local164;
					}
					this.anIntArray70[local3] += anInt845;
					this.anIntArray71[local3] += anInt848;
					this.anIntArray72[local3] += anInt849;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt847; local3++) {
					this.anIntArray70[local3] -= anInt845;
					this.anIntArray71[local3] -= anInt848;
					this.anIntArray72[local3] -= anInt849;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg2 / 128;
					this.anIntArray72[local3] = this.anIntArray72[local3] * arg3 / 128;
					this.anIntArray70[local3] += anInt845;
					this.anIntArray71[local3] += anInt848;
					this.anIntArray72[local3] += anInt849;
				}
			} else {
				@Pc(480) Class206 local480;
				@Pc(485) Class198 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt839; local3++) {
						local11 = (this.aByteArray23[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray23[local3] = (byte) local11;
					}
					if (this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass206Array1 != null) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local480 = this.aClass206Array1[local3];
							local485 = this.aClass198Array1[local3];
							local485.anInt3365 = local485.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local480.anInt3392] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt839; local3++) {
						local11 = this.aShortArray19[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray19[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass206Array1 != null) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local480 = this.aClass206Array1[local3];
							local485 = this.aClass198Array1[local3];
							local485.anInt3365 = local485.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local480.anInt3392] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class198 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3368 += arg1;
							local651.anInt3369 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3366 = local651.anInt3366 * arg1 >> 7;
							local651.anInt3367 = local651.anInt3367 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3370 = local651.anInt3370 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "fk", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(9) int local9 = arg4 + this.aShort14;
		@Pc(14) int local14 = arg4 + this.aShort15;
		@Pc(19) int local19 = arg6 + this.aShort16;
		@Pc(24) int local24 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt448 * -1548585779 || local19 < 0 || local24 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt446 * -1356799781)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt448 * -1548585779 || local19 < 0 || local24 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt446 * -1356799781) {
				return;
			}
		} else {
			local9 >>= arg2.anInt445 * -615169581;
			local14 = local14 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			local19 >>= arg2.anInt445 * -615169581;
			local24 = local24 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			if (arg2.method2917(local9, local19, -304712236) == arg5 && arg2.method2917(local14, local19, -1277987588) == arg5 && arg2.method2917(local9, local24, -903682311) == arg5 && arg2.method2917(local14, local24, -1410771644) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt847; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method2950(this.anIntArray70[local195] + arg4, this.anIntArray72[local195] + arg6, -1026334002) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort12;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt847; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, -1246002068) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt448 * -1548585779 << arg2.anInt445 * -615169581 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt446 * -1356799781 << arg2.anInt445 * -615169581) {
						return;
					}
					this.method7336(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, 1566891926) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray72[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, -859012095);
						@Pc(474) int local474 = arg3.method2950(local252, local323, -137252086);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "aa", descriptor = "()I")
	@Override
	public int method7362() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt838;
	}

	@OriginalMember(owner = "client!afp", name = "bk", descriptor = "(SS)V")
	@Override
	public void method7341(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_27.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt839; local5++) {
			if (this.aShortArray17[local5] == arg0) {
				this.aShortArray17[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class227 local36 = local3.method26120(arg0 & 0xFFFF, 73831368);
			local24 = local36.aByte120;
			local26 = local36.aByte111;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class227 local56 = local3.method26120(arg1 & 0xFFFF, 73831368);
			local44 = local56.aByte120;
			local46 = local56.aByte111;
			if (local56.aFloat263 != 0.0F || local56.aFloat264 != 0.0F) {
				this.aBoolean164 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass206Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt846; local94++) {
				@Pc(103) Class206 local103 = this.aClass206Array1[local94];
				@Pc(108) Class198 local108 = this.aClass198Array1[local94];
				local108.anInt3365 = local108.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local103.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bq", descriptor = "()V")
	@Override
	public void method7394() {
		if (this.anInt837 <= 0 || this.anInt840 <= 0) {
			return;
		}
		this.method6950(false);
		if ((this.aByte4 & 0x10) == 0 && this.aClass196_1.anInterface15_5 == null) {
			this.method6932(false);
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "ar", descriptor = "()I")
	@Override
	public int method7485() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!afp", name = "au", descriptor = "()I")
	@Override
	public int method7366() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!afp", name = "az", descriptor = "()I")
	@Override
	public int method7367() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!afp", name = "as", descriptor = "()I")
	@Override
	public int method7368() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!afp", name = "aw", descriptor = "()I")
	@Override
	public int method7342() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!afp", name = "fe", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7378() {
		return this.aClass228Array2;
	}

	@OriginalMember(owner = "client!afp", name = "bc", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7353(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub2 local2 = (Class105_Sub2) arg0;
		if (this.anInt839 == 0 || local2.anInt839 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt847;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray72;
		@Pc(24) short[] local24 = local2.aShortArray18;
		@Pc(27) short[] local27 = local2.aShortArray24;
		@Pc(30) short[] local30 = local2.aShortArray21;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass214_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass214_1.aShortArray86;
			local44 = this.aClass214_1.aShortArray85;
			local48 = this.aClass214_1.aShortArray87;
			local52 = this.aClass214_1.aByteArray66;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass214_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass214_1.aShortArray86;
			local72 = local2.aClass214_1.aShortArray85;
			local76 = local2.aClass214_1.aShortArray87;
			local80 = local2.aClass214_1.aByteArray66;
		}
		@Pc(92) int[] local92 = local2.anIntArray74;
		@Pc(95) short[] local95 = local2.aShortArray25;
		if (!local2.aBoolean166) {
			local2.method6960();
		}
		@Pc(103) short local103 = local2.aShort12;
		@Pc(106) short local106 = local2.aShort13;
		@Pc(109) short local109 = local2.aShort14;
		@Pc(112) short local112 = local2.aShort15;
		@Pc(115) short local115 = local2.aShort16;
		@Pc(118) short local118 = local2.aShort17;
		for (@Pc(120) int local120 = 0; local120 < this.anInt847; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray72[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray74[local120];
						@Pc(180) int local180 = this.anIntArray74[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray25[local182] != 0; local182++) {
							local168 = (this.aShortArray25[local182] & 0xFFFF) - 1;
							if (this.aByteArray24[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass214_1 = new Class214();
											local40 = this.aClass214_1.aShortArray86 = Class114.method8628(this.aShortArray18, 36864742);
											local44 = this.aClass214_1.aShortArray85 = Class114.method8628(this.aShortArray24, 1448857159);
											local48 = this.aClass214_1.aShortArray87 = Class114.method8628(this.aShortArray21, 32649911);
											local52 = this.aClass214_1.aByteArray66 = Class494.method30296(this.aByteArray24, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class214 local325 = local2.aClass214_1 = new Class214();
											local68 = local325.aShortArray86 = Class114.method8628(local24, 1754920307);
											local72 = local325.aShortArray85 = Class114.method8628(local27, -508573193);
											local76 = local325.aShortArray87 = Class114.method8628(local30, 288153317);
											local80 = local325.aByteArray66 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray18[local168];
										@Pc(363) short local363 = this.aShortArray24[local168];
										@Pc(368) short local368 = this.aShortArray21[local168];
										@Pc(373) byte local373 = this.aByteArray24[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray74[local120];
										local180 = this.anIntArray74[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray25[local385] != 0; local385++) {
											local394 = (this.aShortArray25[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass189_9 == null && this.aClass189_8 != null) {
											this.aClass189_8.anInterface14_6 = null;
										}
										if (this.aClass189_9 != null) {
											this.aClass189_9.anInterface14_6 = null;
										}
										if (local2.aClass189_9 == null && local2.aClass189_8 != null) {
											local2.aClass189_8.anInterface14_6 = null;
										}
										if (local2.aClass189_9 != null) {
											local2.aClass189_9.anInterface14_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "br", descriptor = "(I)V")
	@Override
	public void method7446(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bn", descriptor = "(I)V")
	@Override
	public void method7373(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ba", descriptor = "()I")
	@Override
	public int method7374() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!afp", name = "bt", descriptor = "()I")
	@Override
	public int method7375() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!afp", name = "bs", descriptor = "()[B")
	@Override
	public byte[] method7376() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afp", name = "dd", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt845 += this.anIntArray70[local53];
							anInt848 += this.anIntArray71[local53];
							anInt849 += this.anIntArray72[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt845 = anInt845 / local18 + arg2;
				anInt848 = anInt848 / local18 + arg3;
				anInt849 = anInt849 / local18 + arg4;
				aBoolean168 = true;
			} else {
				anInt845 = arg2;
				anInt848 = arg3;
				anInt849 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] += arg2;
							this.anIntArray71[local45] += arg3;
							this.anIntArray72[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local228 = this.anIntArrayArray11[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
								this.anIntArray70[local45] -= anInt845;
								this.anIntArray71[local45] -= anInt848;
								this.anIntArray72[local45] -= anInt849;
								if (arg4 != 0) {
									local53 = Class467.anIntArray454[arg4];
									local343 = Class467.anIntArray453[arg4];
									local365 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = this.anIntArray71[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class467.anIntArray454[arg2];
									local343 = Class467.anIntArray453[arg2];
									local365 = this.anIntArray71[local45] * local343 - this.anIntArray72[local45] * local53 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class467.anIntArray454[arg3];
									local343 = Class467.anIntArray453[arg3];
									local365 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray72[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								this.anIntArray70[local45] += anInt845;
								this.anIntArray71[local45] += anInt848;
								this.anIntArray72[local45] += anInt849;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray11.length) {
							local228 = this.anIntArrayArray11[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
									local53 = this.anIntArray74[local45];
									local343 = this.anIntArray74[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray25[local365] != 0; local365++) {
										local387 = (this.aShortArray25[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class467.anIntArray454[arg4];
											local426 = Class467.anIntArray453[arg4];
											local430 = this.aShortArray24[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray24[local387] = (short) (this.aShortArray24[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class467.anIntArray454[arg2];
											local426 = Class467.anIntArray453[arg2];
											local430 = this.aShortArray24[local387] * local426 - this.aShortArray21[local387] * local422 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray24[local387] * local422 + this.aShortArray21[local387] * local426 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class467.anIntArray454[arg3];
											local426 = Class467.anIntArray453[arg3];
											local430 = this.aShortArray21[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray21[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass189_9 == null && this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass189_9 != null) {
						this.aClass189_9.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean168) {
					local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
					local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
					local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt845 = local343;
					anInt848 = local365;
					anInt849 = local387;
					aBoolean168 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class467.anIntArray453[arg2];
				local387 = Class467.anIntArray454[arg2];
				local422 = Class467.anIntArray453[arg3];
				local426 = Class467.anIntArray454[arg3];
				local430 = Class467.anIntArray453[arg4];
				local434 = Class467.anIntArray454[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt845 + local410[1] * -anInt848 + local410[2] * -anInt849 + 8192 >> 14;
				local603 = local410[3] * -anInt845 + local410[4] * -anInt848 + local410[5] * -anInt849 + 8192 >> 14;
				local628 = local410[6] * -anInt845 + local410[7] * -anInt848 + local410[8] * -anInt849 + 8192 >> 14;
				local632 = local578 + anInt845;
				@Pc(636) int local636 = local603 + anInt848;
				local640 = local628 + anInt849;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray11.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray11[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray70[local937] + local777[1] * this.anIntArray71[local937] + local777[2] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray70[local937] + local777[4] * this.anIntArray71[local937] + local777[5] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray70[local937] + local777[7] * this.anIntArray71[local937] + local777[8] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray70[local937] = local1045;
								this.anIntArray71[local937] = local1049;
								this.anIntArray72[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class206 local2452;
			@Pc(2457) Class198 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
									local53 = (this.aByteArray23[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray23[local45] = (byte) local53;
									if (this.aClass189_8 != null) {
										this.aClass189_8.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass206Array1 != null) {
						for (local18 = 0; local18 < this.anInt846; local18++) {
							local2452 = this.aClass206Array1[local18];
							local2457 = this.aClass198Array1[local18];
							local2457.anInt3365 = local2457.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local2452.anInt3392] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class198 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3368 += arg2;
									local2686.anInt3369 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3366 = local2686.anInt3366 * arg2 >> 7;
									local2686.anInt3367 = local2686.anInt3367 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray13.length) {
							local228 = this.anIntArrayArray13[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass198Array1[local228[local230]];
								local2686.anInt3370 = local2686.anInt3370 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local228 = this.anIntArrayArray12[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
								local53 = this.aShortArray19[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray19[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass189_8 != null) {
									this.aClass189_8.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass206Array1 != null) {
					for (local18 = 0; local18 < this.anInt846; local18++) {
						local2452 = this.aClass206Array1[local18];
						local2457 = this.aClass198Array1[local18];
						local2457.anInt3365 = local2457.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local2452.anInt3392] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							this.anIntArray70[local45] = this.anIntArray70[local45] * arg2 >> 7;
							this.anIntArray71[local45] = this.anIntArray71[local45] * arg3 >> 7;
							this.anIntArray72[local45] = this.anIntArray72[local45] * arg4 >> 7;
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean168) {
				local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
				local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
				local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt845 = local343;
				anInt848 = local365;
				anInt849 = local387;
				aBoolean168 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt845 + 8192 >> 14;
			local426 = local365 * -anInt848 + 8192 >> 14;
			local430 = local387 * -anInt849 + 8192 >> 14;
			local434 = local422 + anInt845;
			local442 = local426 + anInt848;
			local450 = local430 + anInt849;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray11.length) {
					local777 = this.anIntArrayArray11[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray70[local784] + local1929[1] * this.anIntArray71[local784] + local1929[2] * this.anIntArray72[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray70[local784] + local1929[4] * this.anIntArray71[local784] + local1929[5] * this.anIntArray72[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray70[local784] + local1929[7] * this.anIntArray71[local784] + local1929[8] * this.anIntArray72[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray70[local784] = local2197;
							this.anIntArray71[local784] = local2201;
							this.anIntArray72[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "fy", descriptor = "()Z")
	@Override
	public boolean method7421() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!afp", name = "cz", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt845 = local5;
		anInt848 = local9;
		anInt849 = local13;
	}

	@OriginalMember(owner = "client!afp", name = "bz", descriptor = "(IIII)V")
	@Override
	public void method7380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(12) int local12 = this.aShortArray19[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray19[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass206Array1 != null) {
			for (local1 = 0; local1 < this.anInt846; local1++) {
				@Pc(97) Class206 local97 = this.aClass206Array1[local1];
				@Pc(102) Class198 local102 = this.aClass198Array1[local1];
				local102.anInt3365 = local102.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local97.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "be", descriptor = "()Z")
	@Override
	public boolean method7497() {
		if (this.aShortArray17 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray17.length; local6++) {
			if (this.aShortArray17[local6] != -1) {
				@Pc(29) Class227 local29 = this.aClass102_Sub3_27.aClass235_6.method26120(this.aShortArray17[local6] & 0xFFFF, 73831368);
				if (local29.aBoolean753 && !this.aClass102_Sub3_27.aClass202_1.method24962(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "bh", descriptor = "()Z")
	@Override
	public boolean method7395() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afp", name = "ae", descriptor = "()I")
	@Override
	public int method7501() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt843;
	}

	@OriginalMember(owner = "client!afp", name = "p", descriptor = "()V")
	@Override
	void method7325() {
	}

	@OriginalMember(owner = "client!afp", name = "ef", descriptor = "()I")
	@Override
	public int method7419() {
		if (!this.aBoolean167) {
			this.method7371();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!afp", name = "ah", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7445(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt845 += this.anIntArray70[local53];
							anInt848 += this.anIntArray71[local53];
							anInt849 += this.anIntArray72[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt845 = anInt845 / local18 + arg2;
				anInt848 = anInt848 / local18 + arg3;
				anInt849 = anInt849 / local18 + arg4;
				aBoolean168 = true;
			} else {
				anInt845 = arg2;
				anInt848 = arg3;
				anInt849 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] += arg2;
							this.anIntArray71[local45] += arg3;
							this.anIntArray72[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local228 = this.anIntArrayArray11[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
								this.anIntArray70[local45] -= anInt845;
								this.anIntArray71[local45] -= anInt848;
								this.anIntArray72[local45] -= anInt849;
								if (arg4 != 0) {
									local53 = Class467.anIntArray454[arg4];
									local343 = Class467.anIntArray453[arg4];
									local365 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = this.anIntArray71[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class467.anIntArray454[arg2];
									local343 = Class467.anIntArray453[arg2];
									local365 = this.anIntArray71[local45] * local343 - this.anIntArray72[local45] * local53 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class467.anIntArray454[arg3];
									local343 = Class467.anIntArray453[arg3];
									local365 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray72[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								this.anIntArray70[local45] += anInt845;
								this.anIntArray71[local45] += anInt848;
								this.anIntArray72[local45] += anInt849;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray11.length) {
							local228 = this.anIntArrayArray11[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
									local53 = this.anIntArray74[local45];
									local343 = this.anIntArray74[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray25[local365] != 0; local365++) {
										local387 = (this.aShortArray25[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class467.anIntArray454[arg4];
											local426 = Class467.anIntArray453[arg4];
											local430 = this.aShortArray24[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray24[local387] = (short) (this.aShortArray24[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class467.anIntArray454[arg2];
											local426 = Class467.anIntArray453[arg2];
											local430 = this.aShortArray24[local387] * local426 - this.aShortArray21[local387] * local422 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray24[local387] * local422 + this.aShortArray21[local387] * local426 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class467.anIntArray454[arg3];
											local426 = Class467.anIntArray453[arg3];
											local430 = this.aShortArray21[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray21[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass189_9 == null && this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass189_9 != null) {
						this.aClass189_9.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean168) {
					local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
					local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
					local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt845 = local343;
					anInt848 = local365;
					anInt849 = local387;
					aBoolean168 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class467.anIntArray453[arg2];
				local387 = Class467.anIntArray454[arg2];
				local422 = Class467.anIntArray453[arg3];
				local426 = Class467.anIntArray454[arg3];
				local430 = Class467.anIntArray453[arg4];
				local434 = Class467.anIntArray454[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt845 + local410[1] * -anInt848 + local410[2] * -anInt849 + 8192 >> 14;
				local603 = local410[3] * -anInt845 + local410[4] * -anInt848 + local410[5] * -anInt849 + 8192 >> 14;
				local628 = local410[6] * -anInt845 + local410[7] * -anInt848 + local410[8] * -anInt849 + 8192 >> 14;
				local632 = local578 + anInt845;
				@Pc(636) int local636 = local603 + anInt848;
				local640 = local628 + anInt849;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray11.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray11[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray70[local937] + local777[1] * this.anIntArray71[local937] + local777[2] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray70[local937] + local777[4] * this.anIntArray71[local937] + local777[5] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray70[local937] + local777[7] * this.anIntArray71[local937] + local777[8] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray70[local937] = local1045;
								this.anIntArray71[local937] = local1049;
								this.anIntArray72[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class206 local2452;
			@Pc(2457) Class198 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
									local53 = (this.aByteArray23[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray23[local45] = (byte) local53;
									if (this.aClass189_8 != null) {
										this.aClass189_8.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass206Array1 != null) {
						for (local18 = 0; local18 < this.anInt846; local18++) {
							local2452 = this.aClass206Array1[local18];
							local2457 = this.aClass198Array1[local18];
							local2457.anInt3365 = local2457.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local2452.anInt3392] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class198 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3368 += arg2;
									local2686.anInt3369 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3366 = local2686.anInt3366 * arg2 >> 7;
									local2686.anInt3367 = local2686.anInt3367 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray13.length) {
							local228 = this.anIntArrayArray13[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass198Array1[local228[local230]];
								local2686.anInt3370 = local2686.anInt3370 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local228 = this.anIntArrayArray12[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
								local53 = this.aShortArray19[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray19[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass189_8 != null) {
									this.aClass189_8.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass206Array1 != null) {
					for (local18 = 0; local18 < this.anInt846; local18++) {
						local2452 = this.aClass206Array1[local18];
						local2457 = this.aClass198Array1[local18];
						local2457.anInt3365 = local2457.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local2452.anInt3392] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							this.anIntArray70[local45] = this.anIntArray70[local45] * arg2 >> 7;
							this.anIntArray71[local45] = this.anIntArray71[local45] * arg3 >> 7;
							this.anIntArray72[local45] = this.anIntArray72[local45] * arg4 >> 7;
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean168) {
				local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
				local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
				local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt845 = local343;
				anInt848 = local365;
				anInt849 = local387;
				aBoolean168 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt845 + 8192 >> 14;
			local426 = local365 * -anInt848 + 8192 >> 14;
			local430 = local387 * -anInt849 + 8192 >> 14;
			local434 = local422 + anInt845;
			local442 = local426 + anInt848;
			local450 = local430 + anInt849;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray11.length) {
					local777 = this.anIntArrayArray11[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray70[local784] + local1929[1] * this.anIntArray71[local784] + local1929[2] * this.anIntArray72[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray70[local784] + local1929[4] * this.anIntArray71[local784] + local1929[5] * this.anIntArray72[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray70[local784] + local1929[7] * this.anIntArray71[local784] + local1929[8] * this.anIntArray72[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray70[local784] = local2197;
							this.anIntArray71[local784] = local2201;
							this.anIntArray72[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "eg", descriptor = "(SS)V")
	@Override
	public void method7469(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_27.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt839; local5++) {
			if (this.aShortArray17[local5] == arg0) {
				this.aShortArray17[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class227 local36 = local3.method26120(arg0 & 0xFFFF, 73831368);
			local24 = local36.aByte120;
			local26 = local36.aByte111;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class227 local56 = local3.method26120(arg1 & 0xFFFF, 73831368);
			local44 = local56.aByte120;
			local46 = local56.aByte111;
			if (local56.aFloat263 != 0.0F || local56.aFloat264 != 0.0F) {
				this.aBoolean164 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass206Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt846; local94++) {
				@Pc(103) Class206 local103 = this.aClass206Array1[local94];
				@Pc(108) Class198 local108 = this.aClass198Array1[local94];
				local108.anInt3365 = local108.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local103.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "fz", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(9) int local9 = arg4 + this.aShort14;
		@Pc(14) int local14 = arg4 + this.aShort15;
		@Pc(19) int local19 = arg6 + this.aShort16;
		@Pc(24) int local24 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt448 * -1548585779 || local19 < 0 || local24 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt446 * -1356799781)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt448 * -1548585779 || local19 < 0 || local24 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt446 * -1356799781) {
				return;
			}
		} else {
			local9 >>= arg2.anInt445 * -615169581;
			local14 = local14 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			local19 >>= arg2.anInt445 * -615169581;
			local24 = local24 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			if (arg2.method2917(local9, local19, -193727474) == arg5 && arg2.method2917(local14, local19, -1316340603) == arg5 && arg2.method2917(local9, local24, -990839790) == arg5 && arg2.method2917(local14, local24, -1186520641) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt847; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method2950(this.anIntArray70[local195] + arg4, this.anIntArray72[local195] + arg6, 230332478) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort12;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt847; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, 683578019) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt448 * -1548585779 << arg2.anInt445 * -615169581 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt446 * -1356799781 << arg2.anInt445 * -615169581) {
						return;
					}
					this.method7336(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, -519469557) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray72[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, 569537350);
						@Pc(474) int local474 = arg3.method2950(local252, local323, -159148984);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "dl", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7428(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt837 == 0) {
			return;
		}
		@Pc(14) Class487 local14 = this.aClass102_Sub3_27.aClass487_24;
		@Pc(18) Class487 local18 = this.aClass102_Sub3_27.aClass487_26;
		@Pc(22) Class487 local22 = this.aClass102_Sub3_27.aClass487_27;
		local18.method30080(arg0);
		local22.method30075(local18);
		local22.method30078(this.aClass102_Sub3_27.aClass487_25);
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(42) float[] local42 = this.aClass102_Sub3_27.aFloatArray17;
		local18.method30085(0.0F, (float) this.aShort12, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method30085(0.0F, (float) this.aShort13, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass102_Sub3_27.aFloatArrayArray12[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt838;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt838;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort14 + this.aShort15 >> 1;
			@Pc(178) int local178 = this.aShort16 + this.aShort17 >> 1;
			@Pc(183) short local183 = this.aShort12;
			@Pc(214) float local214 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(243) float local243 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			local119 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			local145 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local119 >= -local145) {
				arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local214 / local145);
				arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort13;
			@Pc(373) float local373 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(402) float local402 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			@Pc(431) float local431 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			@Pc(460) float local460 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local431 >= -local460) {
				arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local373 / local460);
				arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local145 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3865 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local460 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3866 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub3_27.method6383();
		this.aClass102_Sub3_27.method6335(local18);
		this.method6936();
		this.aClass102_Sub3_27.method6353();
		local18.method30078(this.aClass102_Sub3_27.aClass487_28);
		this.method6931(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afp", name = "ak", descriptor = "()V")
	@Override
	void method7357() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt836; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray72[local1] = this.anIntArray72[local1] + 7 >> 4;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "at", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7358(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub3_27.aClass471_8;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt847; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29842((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray72[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray72[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "bo", descriptor = "()[Lclient!cp;")
	@Override
	public Class211[] method7386() {
		return this.aClass211Array2;
	}

	@OriginalMember(owner = "client!afp", name = "bb", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7385() {
		return this.aClass228Array2;
	}

	@OriginalMember(owner = "client!afp", name = "bp", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7346(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array2 != null) {
			for (local11 = 0; local11 < this.aClass228Array2.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array2[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array2.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array2[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afp", name = "av", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg2);
		local3.method30078(this.aClass102_Sub3_27.aClass487_25);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(34) int local34 = this.aShort15 - this.aShort14 >> 1;
		@Pc(42) int local42 = this.aShort13 - this.aShort12 >> 1;
		@Pc(50) int local50 = this.aShort17 - this.aShort16 >> 1;
		@Pc(55) int local55 = this.aShort14 + local34;
		@Pc(60) int local60 = this.aShort12 + local42;
		@Pc(65) int local65 = this.aShort16 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray76[0] = local71;
		anIntArray73[0] = local77;
		anIntArray75[0] = local83;
		anIntArray76[1] = local89;
		anIntArray73[1] = local77;
		anIntArray75[1] = local83;
		anIntArray76[2] = local71;
		anIntArray73[2] = local95;
		anIntArray75[2] = local83;
		anIntArray76[3] = local89;
		anIntArray73[3] = local95;
		anIntArray75[3] = local83;
		anIntArray76[4] = local71;
		anIntArray73[4] = local77;
		anIntArray75[4] = local101;
		anIntArray76[5] = local89;
		anIntArray73[5] = local77;
		anIntArray75[5] = local101;
		anIntArray76[6] = local71;
		anIntArray73[6] = local95;
		anIntArray75[6] = local101;
		anIntArray76[7] = local89;
		anIntArray73[7] = local95;
		anIntArray75[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray76[local199];
			local210 = anIntArray73[local199];
			local214 = anIntArray75[local199];
			local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
			local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
				local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
				@Pc(348) int local348 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
				local361 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass102_Sub3_27.anIntArray66.length < this.anInt837) {
				this.aClass102_Sub3_27.anIntArray66 = new int[this.anInt837];
				this.aClass102_Sub3_27.anIntArray69 = new int[this.anInt837];
			}
			@Pc(426) int[] local426 = this.aClass102_Sub3_27.anIntArray66;
			@Pc(430) int[] local430 = this.aClass102_Sub3_27.anIntArray69;
			for (local361 = 0; local361 < this.anInt847; local361++) {
				local206 = this.anIntArray70[local361];
				local210 = this.anIntArray71[local361];
				local214 = this.anIntArray72[local361];
				local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
				local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
					local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
						local430[local604] = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt839; local361++) {
				if (local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray22[local361] & 0xFFFF] != -999999 && local426[this.aShortArray26[local361] & 0xFFFF] != -999999 && this.method6929(arg0, arg1, local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray22[local361] & 0xFFFF], local430[this.aShortArray26[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray22[local361] & 0xFFFF], local426[this.aShortArray26[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afp", name = "hi", descriptor = "(IIIIIIII)Z")
	boolean method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!afp", name = "an", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7361(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt837 == 0) {
			return null;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub3_27.anInt781 > 0) {
			local29 = this.aShort14 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local29 = this.aShort14 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub3_27.anInt769 > 0) {
			local98 = this.aShort16 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local98 = this.aShort16 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub1 local162 = (Class80_Sub1_Sub10_Sub1) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub1 local171;
		if (local162 != null && local162.method23532(local153, local159)) {
			local171 = local162;
			local162.method23525();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_27, local153, local159);
		}
		local171.method23524(local29, local98, local45, local114);
		this.method6930(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afp", name = "hz", descriptor = "(Lclient!atc;)V")
	void method6930(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0) {
		if (this.aClass102_Sub3_27.anIntArray66.length < this.anInt837) {
			this.aClass102_Sub3_27.anIntArray66 = new int[this.anInt837];
			this.aClass102_Sub3_27.anIntArray69 = new int[this.anInt837];
		}
		@Pc(22) int[] local22 = this.aClass102_Sub3_27.anIntArray66;
		@Pc(26) int[] local26 = this.aClass102_Sub3_27.anIntArray69;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt847; local28++) {
			local55 = (this.anIntArray70[local28] - (this.anIntArray71[local28] * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772) - arg0.anInt3205;
			local78 = (this.anIntArray72[local28] - (this.anIntArray71[local28] * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772) - arg0.anInt3208;
			local83 = this.anIntArray74[local28];
			local90 = this.anIntArray74[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray25[local92] != 0; local92++) {
				local110 = (this.aShortArray25[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt840; local28++) {
			if (this.aByteArray23 == null || this.aByteArray23[local28] <= 128) {
				local55 = this.aShortArray20[local28] & 0xFFFF;
				local78 = this.aShortArray22[local28] & 0xFFFF;
				local83 = this.aShortArray26[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23526(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "eh", descriptor = "()I")
	@Override
	public int method7466() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!afp", name = "dq", descriptor = "()I")
	@Override
	public int method7492() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt838;
	}

	@OriginalMember(owner = "client!afp", name = "il", descriptor = "(Lclient!pm;)V")
	void method6931(@OriginalArg(0) Class487 arg0) {
		if (this.aClass206Array1 == null) {
			return;
		}
		@Pc(6) Class487 local6 = this.aClass102_Sub3_27.aClass487_22;
		this.aClass102_Sub3_27.method6432();
		this.aClass102_Sub3_27.method20762(!this.aBoolean163);
		this.aClass102_Sub3_27.method6429(false);
		this.aClass102_Sub3_27.method6550(this.aClass102_Sub3_27.aClass189_5, null, null, this.aClass102_Sub3_27.aClass189_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt846; local35++) {
			@Pc(44) Class206 local44 = this.aClass206Array1[local35];
			@Pc(49) Class198 local49 = this.aClass198Array1[local35];
			if (!local44.aBoolean690 || !this.aClass102_Sub3_27.method20784()) {
				@Pc(78) float local78 = (float) (this.anIntArray70[local44.anInt3394] + this.anIntArray70[local44.anInt3391] + this.anIntArray70[local44.anInt3393]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray71[local44.anInt3394] + this.anIntArray71[local44.anInt3391] + this.anIntArray71[local44.anInt3393]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray72[local44.anInt3394] + this.anIntArray72[local44.anInt3391] + this.anIntArray72[local44.anInt3393]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray114[0] * local78 + arg0.aFloatArray114[4] * local99 + arg0.aFloatArray114[8] * local120 + arg0.aFloatArray114[12];
				@Pc(172) float local172 = arg0.aFloatArray114[1] * local78 + arg0.aFloatArray114[5] * local99 + arg0.aFloatArray114[9] * local120 + arg0.aFloatArray114[13];
				@Pc(198) float local198 = arg0.aFloatArray114[2] * local78 + arg0.aFloatArray114[6] * local99 + arg0.aFloatArray114[10] * local120 + arg0.aFloatArray114[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3395;
				local6.method30109(local49.anInt3370, local49.anInt3366 * local44.aShort150 >> 7, local49.anInt3367 * local44.aShort152 >> 7, local146 + (float) local49.anInt3368 - local146 * local219, local172 + (float) local49.anInt3369 - local172 * local219, local198 - local198 * local219);
				this.aClass102_Sub3_27.method6352(local6);
				@Pc(267) int local267 = local49.anInt3365;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass102_Sub3_27.method6384(local44.aShort151);
				this.aClass102_Sub3_27.method6370(local44.aByte109);
				this.aClass102_Sub3_27.method6329(7, 0, 4);
			}
		}
		this.aClass102_Sub3_27.method20762(true);
		this.aClass102_Sub3_27.method6353();
	}

	@OriginalMember(owner = "client!afp", name = "in", descriptor = "(Z)V")
	void method6932(@OriginalArg(0) boolean arg0) {
		if (this.aClass102_Sub3_27.aPacketGl_1.data.length < this.anInt840 * 6) {
			this.aClass102_Sub3_27.aPacketGl_1 = new PacketGl((this.anInt840 + 100) * 6);
		} else {
			this.aClass102_Sub3_27.aPacketGl_1.pos = 0;
		}
		@Pc(31) PacketGl local31 = this.aClass102_Sub3_27.aPacketGl_1;
		@Pc(37) int local37;
		if (this.aClass102_Sub3_27.aBoolean129) {
			for (local37 = 0; local37 < this.anInt840; local37++) {
				local31.p2(this.aShortArray20[local37]);
				local31.p2(this.aShortArray22[local37]);
				local31.p2(this.aShortArray26[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt840; local37++) {
				local31.ip2(this.aShortArray20[local37]);
				local31.ip2(this.aShortArray22[local37]);
				local31.ip2(this.aShortArray26[local37]);
			}
		}
		if (local31.pos * -1380987821 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_2 == null) {
				this.anInterface15_2 = this.aClass102_Sub3_27.method6445(5123, local31.data, local31.pos * -1380987821, true);
			} else {
				this.anInterface15_2.method2089(5123, local31.data, local31.pos * -1380987821);
			}
			this.aClass196_1.anInterface15_5 = this.anInterface15_2;
		} else {
			this.aClass196_1.anInterface15_5 = this.aClass102_Sub3_27.method6445(5123, local31.data, local31.pos * -1380987821, false);
		}
		if (!arg0) {
			this.aBoolean165 = true;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bi", descriptor = "()I")
	@Override
	public int method7509() {
		return this.anInt844;
	}

	@OriginalMember(owner = "client!afp", name = "ih", descriptor = "(ISIB)I")
	int method6933(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class687.anIntArray524[method6934(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class227 local17 = this.aClass102_Sub3_27.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte111 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!afp", name = "eb", descriptor = "(SS)V")
	@Override
	public void method7470(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_27.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt839; local5++) {
			if (this.aShortArray17[local5] == arg0) {
				this.aShortArray17[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class227 local36 = local3.method26120(arg0 & 0xFFFF, 73831368);
			local24 = local36.aByte120;
			local26 = local36.aByte111;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class227 local56 = local3.method26120(arg1 & 0xFFFF, 73831368);
			local44 = local56.aByte120;
			local46 = local56.aByte111;
			if (local56.aFloat263 != 0.0F || local56.aFloat264 != 0.0F) {
				this.aBoolean164 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass206Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt846; local94++) {
				@Pc(103) Class206 local103 = this.aClass206Array1[local94];
				@Pc(108) Class198 local108 = this.aClass198Array1[local94];
				local108.anInt3365 = local108.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local103.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bw", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7389(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub2 local2 = (Class105_Sub2) arg0;
		if (this.anInt839 == 0 || local2.anInt839 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt847;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray72;
		@Pc(24) short[] local24 = local2.aShortArray18;
		@Pc(27) short[] local27 = local2.aShortArray24;
		@Pc(30) short[] local30 = local2.aShortArray21;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass214_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass214_1.aShortArray86;
			local44 = this.aClass214_1.aShortArray85;
			local48 = this.aClass214_1.aShortArray87;
			local52 = this.aClass214_1.aByteArray66;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass214_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass214_1.aShortArray86;
			local72 = local2.aClass214_1.aShortArray85;
			local76 = local2.aClass214_1.aShortArray87;
			local80 = local2.aClass214_1.aByteArray66;
		}
		@Pc(92) int[] local92 = local2.anIntArray74;
		@Pc(95) short[] local95 = local2.aShortArray25;
		if (!local2.aBoolean166) {
			local2.method6960();
		}
		@Pc(103) short local103 = local2.aShort12;
		@Pc(106) short local106 = local2.aShort13;
		@Pc(109) short local109 = local2.aShort14;
		@Pc(112) short local112 = local2.aShort15;
		@Pc(115) short local115 = local2.aShort16;
		@Pc(118) short local118 = local2.aShort17;
		for (@Pc(120) int local120 = 0; local120 < this.anInt847; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray72[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray74[local120];
						@Pc(180) int local180 = this.anIntArray74[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray25[local182] != 0; local182++) {
							local168 = (this.aShortArray25[local182] & 0xFFFF) - 1;
							if (this.aByteArray24[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass214_1 = new Class214();
											local40 = this.aClass214_1.aShortArray86 = Class114.method8628(this.aShortArray18, 1963112146);
											local44 = this.aClass214_1.aShortArray85 = Class114.method8628(this.aShortArray24, 1966817789);
											local48 = this.aClass214_1.aShortArray87 = Class114.method8628(this.aShortArray21, 563140362);
											local52 = this.aClass214_1.aByteArray66 = Class494.method30296(this.aByteArray24, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class214 local325 = local2.aClass214_1 = new Class214();
											local68 = local325.aShortArray86 = Class114.method8628(local24, 2055280322);
											local72 = local325.aShortArray85 = Class114.method8628(local27, 1313913910);
											local76 = local325.aShortArray87 = Class114.method8628(local30, 147819720);
											local80 = local325.aByteArray66 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray18[local168];
										@Pc(363) short local363 = this.aShortArray24[local168];
										@Pc(368) short local368 = this.aShortArray21[local168];
										@Pc(373) byte local373 = this.aByteArray24[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray74[local120];
										local180 = this.anIntArray74[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray25[local385] != 0; local385++) {
											local394 = (this.aShortArray25[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass189_9 == null && this.aClass189_8 != null) {
											this.aClass189_8.anInterface14_6 = null;
										}
										if (this.aClass189_9 != null) {
											this.aClass189_9.anInterface14_6 = null;
										}
										if (local2.aClass189_9 == null && local2.aClass189_8 != null) {
											local2.aClass189_8.anInterface14_6 = null;
										}
										if (local2.aClass189_9 != null) {
											local2.aClass189_9.anInterface14_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "bx", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7493(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub2 local2 = (Class105_Sub2) arg0;
		if (this.anInt839 == 0 || local2.anInt839 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt847;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray72;
		@Pc(24) short[] local24 = local2.aShortArray18;
		@Pc(27) short[] local27 = local2.aShortArray24;
		@Pc(30) short[] local30 = local2.aShortArray21;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass214_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass214_1.aShortArray86;
			local44 = this.aClass214_1.aShortArray85;
			local48 = this.aClass214_1.aShortArray87;
			local52 = this.aClass214_1.aByteArray66;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass214_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass214_1.aShortArray86;
			local72 = local2.aClass214_1.aShortArray85;
			local76 = local2.aClass214_1.aShortArray87;
			local80 = local2.aClass214_1.aByteArray66;
		}
		@Pc(92) int[] local92 = local2.anIntArray74;
		@Pc(95) short[] local95 = local2.aShortArray25;
		if (!local2.aBoolean166) {
			local2.method6960();
		}
		@Pc(103) short local103 = local2.aShort12;
		@Pc(106) short local106 = local2.aShort13;
		@Pc(109) short local109 = local2.aShort14;
		@Pc(112) short local112 = local2.aShort15;
		@Pc(115) short local115 = local2.aShort16;
		@Pc(118) short local118 = local2.aShort17;
		for (@Pc(120) int local120 = 0; local120 < this.anInt847; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray72[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray74[local120];
						@Pc(180) int local180 = this.anIntArray74[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray25[local182] != 0; local182++) {
							local168 = (this.aShortArray25[local182] & 0xFFFF) - 1;
							if (this.aByteArray24[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass214_1 = new Class214();
											local40 = this.aClass214_1.aShortArray86 = Class114.method8628(this.aShortArray18, 1192336843);
											local44 = this.aClass214_1.aShortArray85 = Class114.method8628(this.aShortArray24, 378516069);
											local48 = this.aClass214_1.aShortArray87 = Class114.method8628(this.aShortArray21, 152515027);
											local52 = this.aClass214_1.aByteArray66 = Class494.method30296(this.aByteArray24, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class214 local325 = local2.aClass214_1 = new Class214();
											local68 = local325.aShortArray86 = Class114.method8628(local24, 1361408173);
											local72 = local325.aShortArray85 = Class114.method8628(local27, 71372264);
											local76 = local325.aShortArray87 = Class114.method8628(local30, 1127039950);
											local80 = local325.aByteArray66 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray18[local168];
										@Pc(363) short local363 = this.aShortArray24[local168];
										@Pc(368) short local368 = this.aShortArray21[local168];
										@Pc(373) byte local373 = this.aByteArray24[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray74[local120];
										local180 = this.anIntArray74[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray25[local385] != 0; local385++) {
											local394 = (this.aShortArray25[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass189_9 == null && this.aClass189_8 != null) {
											this.aClass189_8.anInterface14_6 = null;
										}
										if (this.aClass189_9 != null) {
											this.aClass189_9.anInterface14_6 = null;
										}
										if (local2.aClass189_9 == null && local2.aClass189_8 != null) {
											local2.aClass189_8.anInterface14_6 = null;
										}
										if (local2.aClass189_9 != null) {
											local2.aClass189_9.anInterface14_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "di", descriptor = "()I")
	@Override
	public int method7489() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!afp", name = "bu", descriptor = "()I")
	@Override
	public int method7392() {
		return this.anInt844;
	}

	@OriginalMember(owner = "client!afp", name = "bm", descriptor = "(I)V")
	@Override
	public void method7393(@OriginalArg(0) int arg0) {
		this.anInt844 = arg0;
		if (this.aClass214_1 != null && (this.anInt844 & 0x10000) == 0) {
			this.aShortArray18 = this.aClass214_1.aShortArray86;
			this.aShortArray24 = this.aClass214_1.aShortArray85;
			this.aShortArray21 = this.aClass214_1.aShortArray87;
			this.aByteArray24 = this.aClass214_1.aByteArray66;
			this.aClass214_1 = null;
		}
		this.aBoolean165 = true;
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "ad", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7359(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt837 == 0) {
			return;
		}
		@Pc(14) Class487 local14 = this.aClass102_Sub3_27.aClass487_24;
		@Pc(18) Class487 local18 = this.aClass102_Sub3_27.aClass487_26;
		@Pc(22) Class487 local22 = this.aClass102_Sub3_27.aClass487_27;
		local18.method30080(arg0);
		local22.method30075(local18);
		local22.method30078(this.aClass102_Sub3_27.aClass487_25);
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(42) float[] local42 = this.aClass102_Sub3_27.aFloatArray17;
		local18.method30085(0.0F, (float) this.aShort12, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method30085(0.0F, (float) this.aShort13, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass102_Sub3_27.aFloatArrayArray12[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt838;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt838;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort14 + this.aShort15 >> 1;
			@Pc(178) int local178 = this.aShort16 + this.aShort17 >> 1;
			@Pc(183) short local183 = this.aShort12;
			@Pc(214) float local214 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(243) float local243 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			local119 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			local145 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local119 >= -local145) {
				arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local214 / local145);
				arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort13;
			@Pc(373) float local373 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(402) float local402 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			@Pc(431) float local431 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			@Pc(460) float local460 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local431 >= -local460) {
				arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local373 / local460);
				arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local145 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3865 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local460 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3866 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub3_27.method6383();
		this.aClass102_Sub3_27.method6335(local18);
		this.method6936();
		this.aClass102_Sub3_27.method6353();
		local18.method30078(this.aClass102_Sub3_27.aClass487_28);
		this.method6931(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afp", name = "bd", descriptor = "(I)V")
	@Override
	public void method7333(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray72[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray72[local9] = this.anIntArray72[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "cd", descriptor = "(I)V")
	@Override
	public void method7331(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray72[local9] * local3 >> 14;
			this.anIntArray72[local9] = this.anIntArray71[local9] * local3 + this.anIntArray72[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "al", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt845 = local5;
		anInt848 = local9;
		anInt849 = local13;
	}

	@OriginalMember(owner = "client!afp", name = "ct", descriptor = "(I)V")
	@Override
	public void method7398(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "cn", descriptor = "(I)V")
	@Override
	public void method7399(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "cy", descriptor = "(I)V")
	@Override
	public void method7400(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "hh", descriptor = "(Lclient!dt;IJIIIIFF)S")
	short method6935(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray74[arg1];
		@Pc(11) int local11 = this.anIntArray74[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray25[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray25[local15] & 0xFFFF) - 1;
			if (aLongArray8[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray25[local13] = (short) (this.anInt837 + 1);
		aLongArray8[local13] = arg2;
		this.aShortArray18[this.anInt837] = (short) arg3;
		this.aShortArray24[this.anInt837] = (short) arg4;
		this.aShortArray21[this.anInt837] = (short) arg5;
		this.aByteArray24[this.anInt837] = (byte) arg6;
		this.aFloatArray26[this.anInt837] = arg7;
		this.aFloatArray25[this.anInt837] = arg8;
		return (short) this.anInt837++;
	}

	@OriginalMember(owner = "client!afp", name = "cc", descriptor = "(III)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray71[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray72[local1] += arg2;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "fx", descriptor = "()Z")
	@Override
	public boolean method7477() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afp", name = "bj", descriptor = "(SS)V")
	@Override
	public void method7391(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt839; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
		if (this.aClass206Array1 != null) {
			for (local1 = 0; local1 < this.anInt846; local1++) {
				@Pc(32) Class206 local32 = this.aClass206Array1[local1];
				@Pc(37) Class198 local37 = this.aClass198Array1[local1];
				local37.anInt3365 = local37.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local32.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "cs", descriptor = "(III)V")
	@Override
	public void method7405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray72[local1] = this.anIntArray72[local1] * arg2 >> 7;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "cj", descriptor = "(III)V")
	@Override
	public void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray72[local1] = this.anIntArray72[local1] * arg2 >> 7;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ck", descriptor = "()V")
	@Override
	void method7407() {
	}

	@OriginalMember(owner = "client!afp", name = "dv", descriptor = "()V")
	@Override
	public void method7451() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "cr", descriptor = "()V")
	@Override
	void method7494() {
	}

	@OriginalMember(owner = "client!afp", name = "ci", descriptor = "()V")
	@Override
	void method7410() {
	}

	@OriginalMember(owner = "client!afp", name = "hx", descriptor = "()[B")
	@Override
	public byte[] method7535() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afp", name = "cp", descriptor = "()Z")
	@Override
	boolean method7412() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "z", descriptor = "()V")
	@Override
	void method7337() {
	}

	@OriginalMember(owner = "client!afp", name = "cb", descriptor = "()Z")
	@Override
	boolean method7377() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "ab", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7339(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt845 += this.anIntArray70[local53];
						anInt848 += this.anIntArray71[local53];
						anInt849 += this.anIntArray72[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt845 = anInt845 / local18 + local8;
				anInt848 = anInt848 / local18 + local12;
				anInt849 = anInt849 / local18 + local16;
			} else {
				anInt845 = local8;
				anInt848 = local12;
				anInt849 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray70[local45] += local8;
						this.anIntArray71[local45] += local12;
						this.anIntArray72[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							if (arg4 != 0) {
								local53 = Class467.anIntArray454[arg4];
								local250 = Class467.anIntArray453[arg4];
								local268 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = this.anIntArray71[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class467.anIntArray454[arg2];
								local250 = Class467.anIntArray453[arg2];
								local268 = this.anIntArray71[local45] * local250 - this.anIntArray72[local45] * local53 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class467.anIntArray454[arg3];
								local250 = Class467.anIntArray453[arg3];
								local268 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray72[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							if (arg2 != 0) {
								local53 = Class467.anIntArray454[arg2];
								local250 = Class467.anIntArray453[arg2];
								local268 = this.anIntArray71[local45] * local250 - this.anIntArray72[local45] * local53 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class467.anIntArray454[arg4];
								local250 = Class467.anIntArray453[arg4];
								local268 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = this.anIntArray71[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class467.anIntArray454[arg3];
								local250 = Class467.anIntArray453[arg3];
								local268 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray72[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local141 = this.anIntArrayArray11[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray74[local45];
							local250 = this.anIntArray74[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray25[local268] != 0; local268++) {
								local716 = (this.aShortArray25[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class467.anIntArray454[arg4];
									local726 = Class467.anIntArray453[arg4];
									local744 = this.aShortArray24[local716] * local722 + this.aShortArray18[local716] * local726 + 16383 >> 14;
									this.aShortArray24[local716] = (short) (this.aShortArray24[local716] * local726 - this.aShortArray18[local716] * local722 + 16383 >> 14);
									this.aShortArray18[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class467.anIntArray454[arg2];
									local726 = Class467.anIntArray453[arg2];
									local744 = this.aShortArray24[local716] * local726 - this.aShortArray21[local716] * local722 + 16383 >> 14;
									this.aShortArray21[local716] = (short) (this.aShortArray24[local716] * local722 + this.aShortArray21[local716] * local726 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class467.anIntArray454[arg3];
									local726 = Class467.anIntArray453[arg3];
									local744 = this.aShortArray21[local716] * local722 + this.aShortArray18[local716] * local726 + 16383 >> 14;
									this.aShortArray21[local716] = (short) (this.aShortArray21[local716] * local726 - this.aShortArray18[local716] * local722 + 16383 >> 14);
									this.aShortArray18[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass189_9 == null && this.aClass189_8 != null) {
					this.aClass189_8.anInterface14_6 = null;
				}
				if (this.aClass189_9 != null) {
					this.aClass189_9.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray70[local45] -= anInt845;
						this.anIntArray71[local45] -= anInt848;
						this.anIntArray72[local45] -= anInt849;
						this.anIntArray70[local45] = this.anIntArray70[local45] * arg2 >> 7;
						this.anIntArray71[local45] = this.anIntArray71[local45] * arg3 >> 7;
						this.anIntArray72[local45] = this.anIntArray72[local45] * arg4 >> 7;
						this.anIntArray70[local45] += anInt845;
						this.anIntArray71[local45] += anInt848;
						this.anIntArray72[local45] += anInt849;
					}
				}
			}
		} else {
			@Pc(1119) Class206 local1119;
			@Pc(1124) Class198 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray23[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray23[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass189_8 != null) {
								this.aClass189_8.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass206Array1 != null) {
						for (local18 = 0; local18 < this.anInt846; local18++) {
							local1119 = this.aClass206Array1[local18];
							local1124 = this.aClass198Array1[local18];
							local1124.anInt3365 = local1124.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local1119.anInt3392] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class198 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass198Array1[local141[local143]];
									local1345.anInt3368 += arg2;
									local1345.anInt3369 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass198Array1[local141[local143]];
									local1345.anInt3366 = local1345.anInt3366 * arg2 >> 7;
									local1345.anInt3367 = local1345.anInt3367 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray13.length) {
							local141 = this.anIntArrayArray13[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass198Array1[local141[local143]];
								local1345.anInt3370 = local1345.anInt3370 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local141 = this.anIntArrayArray12[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray19[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray19[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass189_8 != null) {
							this.aClass189_8.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass206Array1 != null) {
					for (local18 = 0; local18 < this.anInt846; local18++) {
						local1119 = this.aClass206Array1[local18];
						local1124 = this.aClass198Array1[local18];
						local1124.anInt3365 = local1124.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local1119.anInt3392] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "cl", descriptor = "()V")
	@Override
	void method7416() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt836; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray72[local1] = this.anIntArray72[local1] + 7 >> 4;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ia", descriptor = "()V")
	void method6936() {
		if (this.anInt840 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6950(true);
		}
		this.method6950(false);
		if (this.aClass196_1 != null) {
			if (this.aClass196_1.anInterface15_5 == null) {
				this.method6932((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass196_1.anInterface15_5 != null) {
				this.aClass102_Sub3_27.method6429(this.aClass189_9 != null);
				this.aClass102_Sub3_27.method6550(this.aClass189_7, this.aClass189_9, this.aClass189_8, this.aClass189_10);
				@Pc(59) int local59 = this.anIntArray77.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray77[local61];
					@Pc(76) int local76 = this.anIntArray77[local61 + 1];
					@Pc(91) int local91 = this.aShortArray17[local69] == -1 ? -1 : this.aShortArray17[local69] & 0xFFFF;
					this.aClass102_Sub3_27.method6385(local91, this.aClass189_9 != null);
					this.aClass102_Sub3_27.method6379(this.aClass196_1.anInterface15_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "cx", descriptor = "()V")
	@Override
	void method7511() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt836; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray72[local1] = this.anIntArray72[local1] + 7 >> 4;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "co", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt845 += this.anIntArray70[local53];
						anInt848 += this.anIntArray71[local53];
						anInt849 += this.anIntArray72[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt845 = anInt845 / local18 + local8;
				anInt848 = anInt848 / local18 + local12;
				anInt849 = anInt849 / local18 + local16;
			} else {
				anInt845 = local8;
				anInt848 = local12;
				anInt849 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray70[local45] += local8;
						this.anIntArray71[local45] += local12;
						this.anIntArray72[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							if (arg4 != 0) {
								local53 = Class467.anIntArray454[arg4];
								local250 = Class467.anIntArray453[arg4];
								local268 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = this.anIntArray71[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class467.anIntArray454[arg2];
								local250 = Class467.anIntArray453[arg2];
								local268 = this.anIntArray71[local45] * local250 - this.anIntArray72[local45] * local53 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class467.anIntArray454[arg3];
								local250 = Class467.anIntArray453[arg3];
								local268 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray72[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							if (arg2 != 0) {
								local53 = Class467.anIntArray454[arg2];
								local250 = Class467.anIntArray453[arg2];
								local268 = this.anIntArray71[local45] * local250 - this.anIntArray72[local45] * local53 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class467.anIntArray454[arg4];
								local250 = Class467.anIntArray453[arg4];
								local268 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray71[local45] = this.anIntArray71[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class467.anIntArray454[arg3];
								local250 = Class467.anIntArray453[arg3];
								local268 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local250 + 16383 >> 14;
								this.anIntArray72[local45] = this.anIntArray72[local45] * local250 - this.anIntArray70[local45] * local53 + 16383 >> 14;
								this.anIntArray70[local45] = local268;
							}
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local141 = this.anIntArrayArray11[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray74[local45];
							local250 = this.anIntArray74[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray25[local268] != 0; local268++) {
								local716 = (this.aShortArray25[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class467.anIntArray454[arg4];
									local726 = Class467.anIntArray453[arg4];
									local744 = this.aShortArray24[local716] * local722 + this.aShortArray18[local716] * local726 + 16383 >> 14;
									this.aShortArray24[local716] = (short) (this.aShortArray24[local716] * local726 - this.aShortArray18[local716] * local722 + 16383 >> 14);
									this.aShortArray18[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class467.anIntArray454[arg2];
									local726 = Class467.anIntArray453[arg2];
									local744 = this.aShortArray24[local716] * local726 - this.aShortArray21[local716] * local722 + 16383 >> 14;
									this.aShortArray21[local716] = (short) (this.aShortArray24[local716] * local722 + this.aShortArray21[local716] * local726 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class467.anIntArray454[arg3];
									local726 = Class467.anIntArray453[arg3];
									local744 = this.aShortArray21[local716] * local722 + this.aShortArray18[local716] * local726 + 16383 >> 14;
									this.aShortArray21[local716] = (short) (this.aShortArray21[local716] * local726 - this.aShortArray18[local716] * local722 + 16383 >> 14);
									this.aShortArray18[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass189_9 == null && this.aClass189_8 != null) {
					this.aClass189_8.anInterface14_6 = null;
				}
				if (this.aClass189_9 != null) {
					this.aClass189_9.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray70[local45] -= anInt845;
						this.anIntArray71[local45] -= anInt848;
						this.anIntArray72[local45] -= anInt849;
						this.anIntArray70[local45] = this.anIntArray70[local45] * arg2 >> 7;
						this.anIntArray71[local45] = this.anIntArray71[local45] * arg3 >> 7;
						this.anIntArray72[local45] = this.anIntArray72[local45] * arg4 >> 7;
						this.anIntArray70[local45] += anInt845;
						this.anIntArray71[local45] += anInt848;
						this.anIntArray72[local45] += anInt849;
					}
				}
			}
		} else {
			@Pc(1119) Class206 local1119;
			@Pc(1124) Class198 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray23[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray23[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass189_8 != null) {
								this.aClass189_8.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass206Array1 != null) {
						for (local18 = 0; local18 < this.anInt846; local18++) {
							local1119 = this.aClass206Array1[local18];
							local1124 = this.aClass198Array1[local18];
							local1124.anInt3365 = local1124.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local1119.anInt3392] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class198 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass198Array1[local141[local143]];
									local1345.anInt3368 += arg2;
									local1345.anInt3369 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass198Array1[local141[local143]];
									local1345.anInt3366 = local1345.anInt3366 * arg2 >> 7;
									local1345.anInt3367 = local1345.anInt3367 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray13.length) {
							local141 = this.anIntArrayArray13[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass198Array1[local141[local143]];
								local1345.anInt3370 = local1345.anInt3370 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local141 = this.anIntArrayArray12[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray19[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray19[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass189_8 != null) {
							this.aClass189_8.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass206Array1 != null) {
					for (local18 = 0; local18 < this.anInt846; local18++) {
						local1119 = this.aClass206Array1[local18];
						local1124 = this.aClass198Array1[local18];
						local1124.anInt3365 = local1124.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local1119.anInt3392] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "cq", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt845 = local5;
		anInt848 = local9;
		anInt849 = local13;
	}

	@OriginalMember(owner = "client!afp", name = "bl", descriptor = "()V")
	@Override
	public void method7371() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "el", descriptor = "()I")
	@Override
	public int method7461() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!afp", name = "a", descriptor = "(I)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray72[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray72[local9] = this.anIntArray72[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "dc", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7425(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub3_27.aClass471_8;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt847; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29842((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray72[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray72[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ch", descriptor = "(I)V")
	@Override
	public void method7401(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "df", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7364(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt837 == 0) {
			return;
		}
		@Pc(14) Class487 local14 = this.aClass102_Sub3_27.aClass487_24;
		@Pc(18) Class487 local18 = this.aClass102_Sub3_27.aClass487_26;
		@Pc(22) Class487 local22 = this.aClass102_Sub3_27.aClass487_27;
		local18.method30080(arg0);
		local22.method30075(local18);
		local22.method30078(this.aClass102_Sub3_27.aClass487_25);
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(42) float[] local42 = this.aClass102_Sub3_27.aFloatArray17;
		local18.method30085(0.0F, (float) this.aShort12, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method30085(0.0F, (float) this.aShort13, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass102_Sub3_27.aFloatArrayArray12[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt838;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt838;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort14 + this.aShort15 >> 1;
			@Pc(178) int local178 = this.aShort16 + this.aShort17 >> 1;
			@Pc(183) short local183 = this.aShort12;
			@Pc(214) float local214 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(243) float local243 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			local119 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			local145 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local119 >= -local145) {
				arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local214 / local145);
				arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort13;
			@Pc(373) float local373 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(402) float local402 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			@Pc(431) float local431 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			@Pc(460) float local460 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local431 >= -local460) {
				arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local373 / local460);
				arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local145 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3865 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local460 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3866 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub3_27.method6383();
		this.aClass102_Sub3_27.method6335(local18);
		this.method6936();
		this.aClass102_Sub3_27.method6353();
		local18.method30078(this.aClass102_Sub3_27.aClass487_28);
		this.method6931(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afp", name = "ag", descriptor = "()Z")
	@Override
	boolean method7502() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "db", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7427(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt837 == 0) {
			return;
		}
		@Pc(14) Class487 local14 = this.aClass102_Sub3_27.aClass487_24;
		@Pc(18) Class487 local18 = this.aClass102_Sub3_27.aClass487_26;
		@Pc(22) Class487 local22 = this.aClass102_Sub3_27.aClass487_27;
		local18.method30080(arg0);
		local22.method30075(local18);
		local22.method30078(this.aClass102_Sub3_27.aClass487_25);
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(42) float[] local42 = this.aClass102_Sub3_27.aFloatArray17;
		local18.method30085(0.0F, (float) this.aShort12, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method30085(0.0F, (float) this.aShort13, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass102_Sub3_27.aFloatArrayArray12[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt838;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt838;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort14 + this.aShort15 >> 1;
			@Pc(178) int local178 = this.aShort16 + this.aShort17 >> 1;
			@Pc(183) short local183 = this.aShort12;
			@Pc(214) float local214 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(243) float local243 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			local119 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			local145 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local119 >= -local145) {
				arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local214 / local145);
				arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort13;
			@Pc(373) float local373 = local22.aFloatArray114[0] * (float) local170 + local22.aFloatArray114[4] * (float) local183 + local22.aFloatArray114[8] * (float) local178 + local22.aFloatArray114[12];
			@Pc(402) float local402 = local22.aFloatArray114[1] * (float) local170 + local22.aFloatArray114[5] * (float) local183 + local22.aFloatArray114[9] * (float) local178 + local22.aFloatArray114[13];
			@Pc(431) float local431 = local22.aFloatArray114[2] * (float) local170 + local22.aFloatArray114[6] * (float) local183 + local22.aFloatArray114[10] * (float) local178 + local22.aFloatArray114[14];
			@Pc(460) float local460 = local22.aFloatArray114[3] * (float) local170 + local22.aFloatArray114[7] * (float) local183 + local22.aFloatArray114[11] * (float) local178 + local22.aFloatArray114[15];
			if (local431 >= -local460) {
				arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local373 / local460);
				arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3865 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3864 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3866 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local534 / local550);
						arg1.anInt3867 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local145 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3865 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray114[0] * (float) this.anInt838 + local14.aFloatArray114[12];
					local534 = local460 + local14.aFloatArray114[3] * (float) this.anInt838 + local14.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub3_27.aFloat58 - (float) arg1.anInt3866 + this.aClass102_Sub3_27.aFloat59 * local526 / local534);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub3_27.method6383();
		this.aClass102_Sub3_27.method6335(local18);
		this.method6936();
		this.aClass102_Sub3_27.method6353();
		local18.method30078(this.aClass102_Sub3_27.aClass487_28);
		this.method6931(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afp", name = "cw", descriptor = "()Z")
	@Override
	boolean method7448() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "bf", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7381(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub2 local2 = (Class105_Sub2) arg0;
		if (this.anInt839 == 0 || local2.anInt839 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt847;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray72;
		@Pc(24) short[] local24 = local2.aShortArray18;
		@Pc(27) short[] local27 = local2.aShortArray24;
		@Pc(30) short[] local30 = local2.aShortArray21;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass214_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass214_1.aShortArray86;
			local44 = this.aClass214_1.aShortArray85;
			local48 = this.aClass214_1.aShortArray87;
			local52 = this.aClass214_1.aByteArray66;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass214_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass214_1.aShortArray86;
			local72 = local2.aClass214_1.aShortArray85;
			local76 = local2.aClass214_1.aShortArray87;
			local80 = local2.aClass214_1.aByteArray66;
		}
		@Pc(92) int[] local92 = local2.anIntArray74;
		@Pc(95) short[] local95 = local2.aShortArray25;
		if (!local2.aBoolean166) {
			local2.method6960();
		}
		@Pc(103) short local103 = local2.aShort12;
		@Pc(106) short local106 = local2.aShort13;
		@Pc(109) short local109 = local2.aShort14;
		@Pc(112) short local112 = local2.aShort15;
		@Pc(115) short local115 = local2.aShort16;
		@Pc(118) short local118 = local2.aShort17;
		for (@Pc(120) int local120 = 0; local120 < this.anInt847; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray72[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray74[local120];
						@Pc(180) int local180 = this.anIntArray74[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray25[local182] != 0; local182++) {
							local168 = (this.aShortArray25[local182] & 0xFFFF) - 1;
							if (this.aByteArray24[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass214_1 = new Class214();
											local40 = this.aClass214_1.aShortArray86 = Class114.method8628(this.aShortArray18, 1914847307);
											local44 = this.aClass214_1.aShortArray85 = Class114.method8628(this.aShortArray24, -707507124);
											local48 = this.aClass214_1.aShortArray87 = Class114.method8628(this.aShortArray21, -10751776);
											local52 = this.aClass214_1.aByteArray66 = Class494.method30296(this.aByteArray24, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class214 local325 = local2.aClass214_1 = new Class214();
											local68 = local325.aShortArray86 = Class114.method8628(local24, -710981156);
											local72 = local325.aShortArray85 = Class114.method8628(local27, 1387231874);
											local76 = local325.aShortArray87 = Class114.method8628(local30, 982735860);
											local80 = local325.aByteArray66 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray18[local168];
										@Pc(363) short local363 = this.aShortArray24[local168];
										@Pc(368) short local368 = this.aShortArray21[local168];
										@Pc(373) byte local373 = this.aByteArray24[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray74[local120];
										local180 = this.anIntArray74[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray25[local385] != 0; local385++) {
											local394 = (this.aShortArray25[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass189_9 == null && this.aClass189_8 != null) {
											this.aClass189_8.anInterface14_6 = null;
										}
										if (this.aClass189_9 != null) {
											this.aClass189_9.anInterface14_6 = null;
										}
										if (local2.aClass189_9 == null && local2.aClass189_8 != null) {
											local2.aClass189_8.anInterface14_6 = null;
										}
										if (local2.aClass189_9 != null) {
											local2.aClass189_9.anInterface14_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ds", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7443(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array2 != null) {
			for (local11 = 0; local11 < this.aClass228Array2.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array2[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array2.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array2[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afp", name = "dw", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7433(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array2 != null) {
			for (local11 = 0; local11 < this.aClass228Array2.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array2[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array2.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array2[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afp", name = "dr", descriptor = "()V")
	@Override
	public void method7434() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "dx", descriptor = "()V")
	@Override
	public void method7435() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "de", descriptor = "()V")
	@Override
	public void method7436() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "dt", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7430(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array2 != null) {
			for (local11 = 0; local11 < this.aClass228Array2.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array2[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array2.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array2[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afp", name = "dm", descriptor = "()V")
	@Override
	public void method7438() {
		if (this.aBoolean167) {
			return;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		this.aShort18 = this.aShort12;
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!afp", name = "fb", descriptor = "()Z")
	@Override
	public boolean method7476() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!afp", name = "do", descriptor = "()I")
	@Override
	public int method7440() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt843;
	}

	@OriginalMember(owner = "client!afp", name = "eu", descriptor = "()I")
	@Override
	public int method7464() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!afp", name = "fm", descriptor = "()Z")
	@Override
	public boolean method7475() {
		if (this.aShortArray17 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray17.length; local6++) {
			if (this.aShortArray17[local6] != -1) {
				@Pc(29) Class227 local29 = this.aClass102_Sub3_27.aClass235_6.method26120(this.aShortArray17[local6] & 0xFFFF, 73831368);
				if (local29.aBoolean753 && !this.aClass102_Sub3_27.aClass202_1.method24962(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "dh", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt845 += this.anIntArray70[local53];
							anInt848 += this.anIntArray71[local53];
							anInt849 += this.anIntArray72[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt845 = anInt845 / local18 + arg2;
				anInt848 = anInt848 / local18 + arg3;
				anInt849 = anInt849 / local18 + arg4;
				aBoolean168 = true;
			} else {
				anInt845 = arg2;
				anInt848 = arg3;
				anInt849 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] += arg2;
							this.anIntArray71[local45] += arg3;
							this.anIntArray72[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local228 = this.anIntArrayArray11[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
								this.anIntArray70[local45] -= anInt845;
								this.anIntArray71[local45] -= anInt848;
								this.anIntArray72[local45] -= anInt849;
								if (arg4 != 0) {
									local53 = Class467.anIntArray454[arg4];
									local343 = Class467.anIntArray453[arg4];
									local365 = this.anIntArray71[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = this.anIntArray71[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class467.anIntArray454[arg2];
									local343 = Class467.anIntArray453[arg2];
									local365 = this.anIntArray71[local45] * local343 - this.anIntArray72[local45] * local53 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray71[local45] * local53 + this.anIntArray72[local45] * local343 + 16383 >> 14;
									this.anIntArray71[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class467.anIntArray454[arg3];
									local343 = Class467.anIntArray453[arg3];
									local365 = this.anIntArray72[local45] * local53 + this.anIntArray70[local45] * local343 + 16383 >> 14;
									this.anIntArray72[local45] = this.anIntArray72[local45] * local343 - this.anIntArray70[local45] * local53 + 16383 >> 14;
									this.anIntArray70[local45] = local365;
								}
								this.anIntArray70[local45] += anInt845;
								this.anIntArray71[local45] += anInt848;
								this.anIntArray72[local45] += anInt849;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray11.length) {
							local228 = this.anIntArrayArray11[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
									local53 = this.anIntArray74[local45];
									local343 = this.anIntArray74[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray25[local365] != 0; local365++) {
										local387 = (this.aShortArray25[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class467.anIntArray454[arg4];
											local426 = Class467.anIntArray453[arg4];
											local430 = this.aShortArray24[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray24[local387] = (short) (this.aShortArray24[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class467.anIntArray454[arg2];
											local426 = Class467.anIntArray453[arg2];
											local430 = this.aShortArray24[local387] * local426 - this.aShortArray21[local387] * local422 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray24[local387] * local422 + this.aShortArray21[local387] * local426 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class467.anIntArray454[arg3];
											local426 = Class467.anIntArray453[arg3];
											local430 = this.aShortArray21[local387] * local422 + this.aShortArray18[local387] * local426 + 16383 >> 14;
											this.aShortArray21[local387] = (short) (this.aShortArray21[local387] * local426 - this.aShortArray18[local387] * local422 + 16383 >> 14);
											this.aShortArray18[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass189_9 == null && this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass189_9 != null) {
						this.aClass189_9.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean168) {
					local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
					local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
					local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt845 = local343;
					anInt848 = local365;
					anInt849 = local387;
					aBoolean168 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class467.anIntArray453[arg2];
				local387 = Class467.anIntArray454[arg2];
				local422 = Class467.anIntArray453[arg3];
				local426 = Class467.anIntArray454[arg3];
				local430 = Class467.anIntArray453[arg4];
				local434 = Class467.anIntArray454[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt845 + local410[1] * -anInt848 + local410[2] * -anInt849 + 8192 >> 14;
				local603 = local410[3] * -anInt845 + local410[4] * -anInt848 + local410[5] * -anInt849 + 8192 >> 14;
				local628 = local410[6] * -anInt845 + local410[7] * -anInt848 + local410[8] * -anInt849 + 8192 >> 14;
				local632 = local578 + anInt845;
				@Pc(636) int local636 = local603 + anInt848;
				local640 = local628 + anInt849;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray11.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray11[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray70[local937] + local777[1] * this.anIntArray71[local937] + local777[2] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray70[local937] + local777[4] * this.anIntArray71[local937] + local777[5] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray70[local937] + local777[7] * this.anIntArray71[local937] + local777[8] * this.anIntArray72[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray70[local937] = local1045;
								this.anIntArray71[local937] = local1049;
								this.anIntArray72[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class206 local2452;
			@Pc(2457) Class198 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
									local53 = (this.aByteArray23[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray23[local45] = (byte) local53;
									if (this.aClass189_8 != null) {
										this.aClass189_8.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass206Array1 != null) {
						for (local18 = 0; local18 < this.anInt846; local18++) {
							local2452 = this.aClass206Array1[local18];
							local2457 = this.aClass198Array1[local18];
							local2457.anInt3365 = local2457.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local2452.anInt3392] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class198 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3368 += arg2;
									local2686.anInt3369 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass198Array1[local228[local230]];
									local2686.anInt3366 = local2686.anInt3366 * arg2 >> 7;
									local2686.anInt3367 = local2686.anInt3367 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray13.length) {
							local228 = this.anIntArrayArray13[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass198Array1[local228[local230]];
								local2686.anInt3370 = local2686.anInt3370 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local228 = this.anIntArrayArray12[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local45]) != 0) {
								local53 = this.aShortArray19[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray19[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass189_8 != null) {
									this.aClass189_8.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass206Array1 != null) {
					for (local18 = 0; local18 < this.anInt846; local18++) {
						local2452 = this.aClass206Array1[local18];
						local2457 = this.aClass198Array1[local18];
						local2457.anInt3365 = local2457.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local2452.anInt3392] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local45]) != 0) {
							this.anIntArray70[local45] -= anInt845;
							this.anIntArray71[local45] -= anInt848;
							this.anIntArray72[local45] -= anInt849;
							this.anIntArray70[local45] = this.anIntArray70[local45] * arg2 >> 7;
							this.anIntArray71[local45] = this.anIntArray71[local45] * arg3 >> 7;
							this.anIntArray72[local45] = this.anIntArray72[local45] * arg4 >> 7;
							this.anIntArray70[local45] += anInt845;
							this.anIntArray71[local45] += anInt848;
							this.anIntArray72[local45] += anInt849;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean168) {
				local343 = arg7[0] * anInt845 + arg7[3] * anInt848 + arg7[6] * anInt849 + 8192 >> 14;
				local365 = arg7[1] * anInt845 + arg7[4] * anInt848 + arg7[7] * anInt849 + 8192 >> 14;
				local387 = arg7[2] * anInt845 + arg7[5] * anInt848 + arg7[8] * anInt849 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt845 = local343;
				anInt848 = local365;
				anInt849 = local387;
				aBoolean168 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt845 + 8192 >> 14;
			local426 = local365 * -anInt848 + 8192 >> 14;
			local430 = local387 * -anInt849 + 8192 >> 14;
			local434 = local422 + anInt845;
			local442 = local426 + anInt848;
			local450 = local430 + anInt849;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray11.length) {
					local777 = this.anIntArrayArray11[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray70[local784] + local1929[1] * this.anIntArray71[local784] + local1929[2] * this.anIntArray72[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray70[local784] + local1929[4] * this.anIntArray71[local784] + local1929[5] * this.anIntArray72[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray70[local784] + local1929[7] * this.anIntArray71[local784] + local1929[8] * this.anIntArray72[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray70[local784] = local2197;
							this.anIntArray71[local784] = local2201;
							this.anIntArray72[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "af", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt845 = local5;
		anInt848 = local9;
		anInt849 = local13;
	}

	@OriginalMember(owner = "client!afp", name = "dy", descriptor = "()I")
	@Override
	public int method7487() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!afp", name = "da", descriptor = "()I")
	@Override
	public int method7387() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!afp", name = "dk", descriptor = "()I")
	@Override
	public int method7447() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!afp", name = "ec", descriptor = "()I")
	@Override
	public int method7372() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!afp", name = "ev", descriptor = "()I")
	@Override
	public int method7388() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!afp", name = "ed", descriptor = "()I")
	@Override
	public int method7450() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!afp", name = "eo", descriptor = "()I")
	@Override
	public int method7498() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!afp", name = "ep", descriptor = "()I")
	@Override
	public int method7452() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!afp", name = "ew", descriptor = "()I")
	@Override
	public int method7453() {
		if (!this.aBoolean167) {
			this.method7371();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!afp", name = "ee", descriptor = "()I")
	@Override
	public int method7403() {
		if (!this.aBoolean167) {
			this.method7371();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!afp", name = "ie", descriptor = "()V")
	void method6938() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt847; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray72[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort14 = (short) local1;
		this.aShort15 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort13 = (short) local9;
		this.aShort16 = (short) local5;
		this.aShort17 = (short) local11;
		this.anInt838 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt843 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!afp", name = "w", descriptor = "(III)V")
	@Override
	public void method7332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray71[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray72[local1] += arg2;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ft", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7409(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt837 == 0) {
			return null;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub3_27.anInt781 > 0) {
			local29 = this.aShort14 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local29 = this.aShort14 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub3_27.anInt769 > 0) {
			local98 = this.aShort16 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local98 = this.aShort16 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub1 local162 = (Class80_Sub1_Sub10_Sub1) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub1 local171;
		if (local162 != null && local162.method23532(local153, local159)) {
			local171 = local162;
			local162.method23525();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_27, local153, local159);
		}
		local171.method23524(local29, local98, local45, local114);
		this.method6930(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afp", name = "ek", descriptor = "(I)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ea", descriptor = "(I)V")
	@Override
	public void method7414(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "cg", descriptor = "()Z")
	@Override
	boolean method7413() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "dz", descriptor = "()I")
	@Override
	public int method7444() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!afp", name = "em", descriptor = "()I")
	@Override
	public int method7462() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!afp", name = "et", descriptor = "()I")
	@Override
	public int method7463() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!afp", name = "fj", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt847; local9++) {
			local29 = this.anIntArray72[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray72[local9] = this.anIntArray72[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt837; local9++) {
			local29 = this.aShortArray21[local9] * local3 + this.aShortArray18[local9] * local7 >> 14;
			this.aShortArray21[local9] = (short) (this.aShortArray21[local9] * local7 - this.aShortArray18[local9] * local3 >> 14);
			this.aShortArray18[local9] = (short) local29;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "es", descriptor = "()I")
	@Override
	public int method7465() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!afp", name = "er", descriptor = "(SS)V")
	@Override
	public void method7379(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt839; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
		if (this.aClass206Array1 != null) {
			for (local1 = 0; local1 < this.anInt846; local1++) {
				@Pc(32) Class206 local32 = this.aClass206Array1[local1];
				@Pc(37) Class198 local37 = this.aClass198Array1[local1];
				local37.anInt3365 = local37.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local32.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bg", descriptor = "()I")
	@Override
	public int method7390() {
		if (!this.aBoolean167) {
			this.method7371();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!afp", name = "ex", descriptor = "(SS)V")
	@Override
	public void method7468(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_27.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt839; local5++) {
			if (this.aShortArray17[local5] == arg0) {
				this.aShortArray17[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class227 local36 = local3.method26120(arg0 & 0xFFFF, 73831368);
			local24 = local36.aByte120;
			local26 = local36.aByte111;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class227 local56 = local3.method26120(arg1 & 0xFFFF, 73831368);
			local44 = local56.aByte120;
			local46 = local56.aByte111;
			if (local56.aFloat263 != 0.0F || local56.aFloat264 != 0.0F) {
				this.aBoolean164 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass206Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt846; local94++) {
				@Pc(103) Class206 local103 = this.aClass206Array1[local94];
				@Pc(108) Class198 local108 = this.aClass198Array1[local94];
				local108.anInt3365 = local108.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local103.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "iw", descriptor = "()V")
	void method6939() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt847; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray72[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort14 = (short) local1;
		this.aShort15 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort13 = (short) local9;
		this.aShort16 = (short) local5;
		this.aShort17 = (short) local11;
		this.anInt838 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt843 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!afp", name = "cu", descriptor = "(III)V")
	@Override
	public void method7338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray72[local1] = this.anIntArray72[local1] * arg2 >> 7;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "dn", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7426(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub3_27.aClass471_8;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt847; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29842((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray72[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray72[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ej", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7472() {
		return this.aClass228Array2;
	}

	@OriginalMember(owner = "client!afp", name = "eq", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7473() {
		return this.aClass228Array2;
	}

	@OriginalMember(owner = "client!afp", name = "dp", descriptor = "()I")
	@Override
	public int method7441() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.anInt843;
	}

	@OriginalMember(owner = "client!afp", name = "fv", descriptor = "()[Lclient!cp;")
	@Override
	public Class211[] method7429() {
		return this.aClass211Array2;
	}

	@OriginalMember(owner = "client!afp", name = "fp", descriptor = "()Z")
	@Override
	public boolean method7449() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afp", name = "dg", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt845 = local5;
		anInt848 = local9;
		anInt849 = local13;
	}

	@OriginalMember(owner = "client!afp", name = "ig", descriptor = "(Lclient!dt;IJIIIIFF)S")
	short method6941(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray74[arg1];
		@Pc(11) int local11 = this.anIntArray74[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray25[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray25[local15] & 0xFFFF) - 1;
			if (aLongArray8[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray25[local13] = (short) (this.anInt837 + 1);
		aLongArray8[local13] = arg2;
		this.aShortArray18[this.anInt837] = (short) arg3;
		this.aShortArray24[this.anInt837] = (short) arg4;
		this.aShortArray21[this.anInt837] = (short) arg5;
		this.aByteArray24[this.anInt837] = (byte) arg6;
		this.aFloatArray26[this.anInt837] = arg7;
		this.aFloatArray25[this.anInt837] = arg8;
		return (short) this.anInt837++;
	}

	@OriginalMember(owner = "client!afp", name = "id", descriptor = "(Lclient!dt;IJIIIIFF)S")
	short method6942(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray74[arg1];
		@Pc(11) int local11 = this.anIntArray74[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray25[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray25[local15] & 0xFFFF) - 1;
			if (aLongArray8[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray25[local13] = (short) (this.anInt837 + 1);
		aLongArray8[local13] = arg2;
		this.aShortArray18[this.anInt837] = (short) arg3;
		this.aShortArray24[this.anInt837] = (short) arg4;
		this.aShortArray21[this.anInt837] = (short) arg5;
		this.aByteArray24[this.anInt837] = (byte) arg6;
		this.aFloatArray26[this.anInt837] = arg7;
		this.aFloatArray25[this.anInt837] = arg8;
		return (short) this.anInt837++;
	}

	@OriginalMember(owner = "client!afp", name = "en", descriptor = "(B[B)V")
	@Override
	public void method7467(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt839; local3++) {
				this.aByteArray23[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt839; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray23[local3] = (byte) local39;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ei", descriptor = "(IIII)V")
	@Override
	public void method7471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(12) int local12 = this.aShortArray19[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray19[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass206Array1 != null) {
			for (local1 = 0; local1 < this.anInt846; local1++) {
				@Pc(97) Class206 local97 = this.aClass206Array1[local1];
				@Pc(102) Class198 local102 = this.aClass198Array1[local1];
				local102.anInt3365 = local102.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local97.anInt3392] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "jv", descriptor = "(Z)V")
	void method6948(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass189_9 != null && this.aClass189_9.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass189_10 != null && this.aClass189_10.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte4 & 0x2) != 0;
			local21 &= (this.aByte4 & 0x4) != 0;
			local32 &= (this.aByte4 & 0x1) != 0;
			local43 &= (this.aByte4 & 0x8) != 0;
		}
		@Pc(91) byte local91 = 0;
		@Pc(93) byte local93 = 0;
		@Pc(95) byte local95 = 0;
		@Pc(97) byte local97 = 0;
		@Pc(99) byte local99 = 0;
		if (local32) {
			local93 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local10) {
			local95 = local91;
			local91 = (byte) (local91 + 4);
		}
		if (local21) {
			local97 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local43) {
			local99 = local91;
			local91 = (byte) (local91 + 8);
		}
		if (local91 == 0) {
			return;
		}
		if (this.aClass102_Sub3_27.aPacketGl_1.data.length < this.anInt837 * local91) {
			this.aClass102_Sub3_27.aPacketGl_1 = new PacketGl((this.anInt837 + 100) * local91);
		} else {
			this.aClass102_Sub3_27.aPacketGl_1.pos = 0;
		}
		@Pc(170) PacketGl local170 = this.aClass102_Sub3_27.aPacketGl_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local178 = 0; local178 < this.anInt847; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray70[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray71[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray72[local178]);
					local208 = this.anIntArray74[local178];
					local215 = this.anIntArray74[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray25[local217] != 0; local217++) {
						local235 = (this.aShortArray25[local217] & 0xFFFF) - 1;
						local170.pos = local235 * local91 * 1034180571;
						local170.p4(local189);
						local170.p4(local196);
						local170.p4(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt847; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray70[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray71[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray72[local178]);
					local208 = this.anIntArray74[local178];
					local215 = this.anIntArray74[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray25[local217] != 0; local217++) {
						local235 = (this.aShortArray25[local217] & 0xFFFF) - 1;
						local170.pos = local235 * local91 * 1034180571;
						local170.ip4(local189);
						local170.ip4(local196);
						local170.ip4(local203);
					}
				}
			}
		}
		@Pc(463) float local463;
		@Pc(353) short[] local353;
		@Pc(357) short[] local357;
		@Pc(361) short[] local361;
		@Pc(365) byte[] local365;
		@Pc(511) float local511;
		if (local10) {
			if (this.aClass189_9 == null) {
				if (this.aClass214_1 == null) {
					local353 = this.aShortArray18;
					local357 = this.aShortArray24;
					local361 = this.aShortArray21;
					local365 = this.aByteArray24;
				} else {
					local353 = this.aClass214_1.aShortArray86;
					local357 = this.aClass214_1.aShortArray85;
					local361 = this.aClass214_1.aShortArray87;
					local365 = this.aClass214_1.aByteArray66;
				}
				@Pc(384) float local384 = this.aClass102_Sub3_27.aFloatArray21[0];
				@Pc(390) float local390 = this.aClass102_Sub3_27.aFloatArray21[1];
				@Pc(396) float local396 = this.aClass102_Sub3_27.aFloatArray21[2];
				@Pc(400) float local400 = this.aClass102_Sub3_27.aFloat72;
				@Pc(410) float local410 = this.aClass102_Sub3_27.aFloat67 * 768.0F / (float) this.aShort11;
				@Pc(420) float local420 = this.aClass102_Sub3_27.aFloat68 * 768.0F / (float) this.aShort11;
				for (@Pc(422) int local422 = 0; local422 < this.anInt839; local422++) {
					@Pc(443) int local443 = this.method6933(this.aShortArray19[local422], this.aShortArray17[local422], this.aShort10, this.aByteArray23[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass102_Sub3_27.aFloat66;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass102_Sub3_27.aFloat74;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass102_Sub3_27.aFloat65;
					@Pc(481) int local481 = this.aShortArray20[local422] & 0xFFFF;
					@Pc(486) short local486 = (short) local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					@Pc(550) float local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					@Pc(555) int local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					@Pc(570) int local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(585) int local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
					local481 = this.aShortArray22[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
					local481 = this.aShortArray26[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt839; local178++) {
					local189 = this.method6933(this.aShortArray19[local178], this.aShortArray17[local178], this.aShort10, this.aByteArray23[local178]);
					local170.pos = (local95 + (this.aShortArray20[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
					local170.pos = (local95 + (this.aShortArray22[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
					local170.pos = (local95 + (this.aShortArray26[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass214_1 == null) {
				local353 = this.aShortArray18;
				local357 = this.aShortArray24;
				local361 = this.aShortArray21;
				local365 = this.aByteArray24;
			} else {
				local353 = this.aClass214_1.aShortArray86;
				local357 = this.aClass214_1.aShortArray85;
				local361 = this.aClass214_1.aShortArray87;
				local365 = this.aClass214_1.aByteArray66;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort11;
			local511 = 3.0F / (float) (this.aShort11 + this.aShort11 / 2);
			local170.pos = local97 * 1034180571;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local217 = 0; local217 < this.anInt837; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method23420((float) local353[local217] * local511);
						local170.method23420((float) local357[local217] * local511);
						local170.method23420((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method23420((float) local353[local217] * local463);
						local170.method23420((float) local357[local217] * local463);
						local170.method23420((float) local361[local217] * local463);
					}
					local170.pos += (local91 - 12) * 1034180571;
				}
			} else {
				for (local217 = 0; local217 < this.anInt837; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method23418((float) local353[local217] * local511);
						local170.method23418((float) local357[local217] * local511);
						local170.method23418((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method23418((float) local353[local217] * local463);
						local170.method23418((float) local357[local217] * local463);
						local170.method23418((float) local361[local217] * local463);
					}
					local170.pos += (local91 - 12) * 1034180571;
				}
			}
		}
		if (local43) {
			local170.pos = local99 * 1034180571;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local178 = 0; local178 < this.anInt837; local178++) {
					local170.method23420(this.aFloatArray26[local178]);
					local170.method23420(this.aFloatArray25[local178]);
					local170.pos += (local91 - 8) * 1034180571;
				}
			} else {
				for (local178 = 0; local178 < this.anInt837; local178++) {
					local170.method23418(this.aFloatArray26[local178]);
					local170.method23418(this.aFloatArray25[local178]);
					local170.pos += (local91 - 8) * 1034180571;
				}
			}
		}
		local170.pos = local91 * this.anInt837 * 1034180571;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass102_Sub3_27.method6375(local91, local170.data, local170.pos * -1380987821, true);
			} else {
				this.anInterface14_4.method2754(local91, local170.data, local170.pos * -1380987821);
			}
			local1348 = this.anInterface14_4;
			this.aByte4 = 0;
		} else {
			local1348 = this.aClass102_Sub3_27.method6375(local91, local170.data, local170.pos * -1380987821, false);
			this.aBoolean165 = true;
		}
		if (local32) {
			this.aClass189_7.anInterface14_6 = local1348;
			this.aClass189_7.aByte106 = local93;
		}
		if (local43) {
			this.aClass189_10.anInterface14_6 = local1348;
			this.aClass189_10.aByte106 = local99;
		}
		if (local10) {
			this.aClass189_8.anInterface14_6 = local1348;
			this.aClass189_8.aByte106 = local95;
		}
		if (local21) {
			this.aClass189_9.anInterface14_6 = local1348;
			this.aClass189_9.aByte106 = local97;
		}
	}

	@OriginalMember(owner = "client!afp", name = "by", descriptor = "(B[B)V")
	@Override
	public void method7348(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt839; local3++) {
				this.aByteArray23[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt839; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray23[local3] = (byte) local39;
			}
		}
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "fq", descriptor = "(I)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt847; local9++) {
			local29 = this.anIntArray72[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray72[local9] = this.anIntArray72[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt837; local9++) {
			local29 = this.aShortArray21[local9] * local3 + this.aShortArray18[local9] * local7 >> 14;
			this.aShortArray21[local9] = (short) (this.aShortArray21[local9] * local7 - this.aShortArray18[local9] * local3 >> 14);
			this.aShortArray18[local9] = (short) local29;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "fa", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(9) int local9 = arg4 + this.aShort14;
		@Pc(14) int local14 = arg4 + this.aShort15;
		@Pc(19) int local19 = arg6 + this.aShort16;
		@Pc(24) int local24 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt448 * -1548585779 || local19 < 0 || local24 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt446 * -1356799781)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt448 * -1548585779 || local19 < 0 || local24 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt446 * -1356799781) {
				return;
			}
		} else {
			local9 >>= arg2.anInt445 * -615169581;
			local14 = local14 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			local19 >>= arg2.anInt445 * -615169581;
			local24 = local24 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			if (arg2.method2917(local9, local19, -457984754) == arg5 && arg2.method2917(local14, local19, -351974696) == arg5 && arg2.method2917(local9, local24, -1753431219) == arg5 && arg2.method2917(local14, local24, -913728962) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt847; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method2950(this.anIntArray70[local195] + arg4, this.anIntArray72[local195] + arg6, -1865897566) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort12;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt847; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, -691894872) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt448 * -1548585779 << arg2.anInt445 * -615169581 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt446 * -1356799781 << arg2.anInt445 * -615169581) {
						return;
					}
					this.method7336(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, 212858328) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray72[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, -978663310);
						@Pc(474) int local474 = arg3.method2950(local252, local323, 912513459);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "ez", descriptor = "(I)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		if (this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afp", name = "fg", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7317(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt837 == 0) {
			return null;
		}
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub3_27.anInt781 > 0) {
			local29 = this.aShort14 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local29 = this.aShort14 - (this.aShort12 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local45 = this.aShort15 - (this.aShort13 * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub3_27.anInt769 > 0) {
			local98 = this.aShort16 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		} else {
			local98 = this.aShort16 - (this.aShort12 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
			local114 = this.aShort17 - (this.aShort13 * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub1 local162 = (Class80_Sub1_Sub10_Sub1) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub1 local171;
		if (local162 != null && local162.method23532(local153, local159)) {
			local171 = local162;
			local162.method23525();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_27, local153, local159);
		}
		local171.method23524(local29, local98, local45, local114);
		this.method6930(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afp", name = "fo", descriptor = "()Z")
	@Override
	public boolean method7486() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!afp", name = "iv", descriptor = "()V")
	void method6949() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt847; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray72[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort14 = (short) local1;
		this.aShort15 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort13 = (short) local9;
		this.aShort16 = (short) local5;
		this.aShort17 = (short) local11;
		this.anInt838 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt843 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!afp", name = "du", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7431(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array2 != null) {
			for (local11 = 0; local11 < this.aClass228Array2.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array2[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray71[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray72[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array2.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array2[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray70[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray71[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray72[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afp", name = "fn", descriptor = "()I")
	@Override
	public int method7483() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!afp", name = "h", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(9) int local9 = arg4 + this.aShort14;
		@Pc(14) int local14 = arg4 + this.aShort15;
		@Pc(19) int local19 = arg6 + this.aShort16;
		@Pc(24) int local24 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt448 * -1548585779 || local19 < 0 || local24 + arg2.anInt447 * -1174710433 >> arg2.anInt445 * -615169581 >= arg2.anInt446 * -1356799781)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt448 * -1548585779 || local19 < 0 || local24 + arg3.anInt447 * -1174710433 >> arg3.anInt445 * -615169581 >= arg3.anInt446 * -1356799781) {
				return;
			}
		} else {
			local9 >>= arg2.anInt445 * -615169581;
			local14 = local14 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			local19 >>= arg2.anInt445 * -615169581;
			local24 = local24 + (arg2.anInt447 * -1174710433 - 1) >> arg2.anInt445 * -615169581;
			if (arg2.method2917(local9, local19, -1919507280) == arg5 && arg2.method2917(local14, local19, -1355270238) == arg5 && arg2.method2917(local9, local24, -310187008) == arg5 && arg2.method2917(local14, local24, -354361733) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt847; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method2950(this.anIntArray70[local195] + arg4, this.anIntArray72[local195] + arg6, 1141645556) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort12;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt847; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, 24847621) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt448 * -1548585779 << arg2.anInt445 * -615169581 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt447 * -1174710433 >= arg2.anInt446 * -1356799781 << arg2.anInt445 * -615169581) {
						return;
					}
					this.method7336(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method2950(this.anIntArray70[local239] + arg4, this.anIntArray72[local239] + arg6, -46924749) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort13 - this.aShort12;
					for (local239 = 0; local239 < this.anInt847; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray72[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, -1913516439);
						@Pc(474) int local474 = arg3.method2950(local252, local323, 749919259);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "fw", descriptor = "()Z")
	@Override
	public boolean method7526() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!afp", name = "if", descriptor = "(Z)V")
	void method6950(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass189_8 != null && this.aClass189_8.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass189_9 != null && this.aClass189_9.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass189_7 != null && this.aClass189_7.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass189_10 != null && this.aClass189_10.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte4 & 0x2) != 0;
			local21 &= (this.aByte4 & 0x4) != 0;
			local32 &= (this.aByte4 & 0x1) != 0;
			local43 &= (this.aByte4 & 0x8) != 0;
		}
		@Pc(91) byte local91 = 0;
		@Pc(93) byte local93 = 0;
		@Pc(95) byte local95 = 0;
		@Pc(97) byte local97 = 0;
		@Pc(99) byte local99 = 0;
		if (local32) {
			local93 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local10) {
			local95 = local91;
			local91 = (byte) (local91 + 4);
		}
		if (local21) {
			local97 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local43) {
			local99 = local91;
			local91 = (byte) (local91 + 8);
		}
		if (local91 == 0) {
			return;
		}
		if (this.aClass102_Sub3_27.aPacketGl_1.data.length < this.anInt837 * local91) {
			this.aClass102_Sub3_27.aPacketGl_1 = new PacketGl((this.anInt837 + 100) * local91);
		} else {
			this.aClass102_Sub3_27.aPacketGl_1.pos = 0;
		}
		@Pc(170) PacketGl local170 = this.aClass102_Sub3_27.aPacketGl_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local178 = 0; local178 < this.anInt847; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray70[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray71[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray72[local178]);
					local208 = this.anIntArray74[local178];
					local215 = this.anIntArray74[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray25[local217] != 0; local217++) {
						local235 = (this.aShortArray25[local217] & 0xFFFF) - 1;
						local170.pos = local235 * local91 * 1034180571;
						local170.p4(local189);
						local170.p4(local196);
						local170.p4(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt847; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray70[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray71[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray72[local178]);
					local208 = this.anIntArray74[local178];
					local215 = this.anIntArray74[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray25[local217] != 0; local217++) {
						local235 = (this.aShortArray25[local217] & 0xFFFF) - 1;
						local170.pos = local235 * local91 * 1034180571;
						local170.ip4(local189);
						local170.ip4(local196);
						local170.ip4(local203);
					}
				}
			}
		}
		@Pc(463) float local463;
		@Pc(353) short[] local353;
		@Pc(357) short[] local357;
		@Pc(361) short[] local361;
		@Pc(365) byte[] local365;
		@Pc(511) float local511;
		if (local10) {
			if (this.aClass189_9 == null) {
				if (this.aClass214_1 == null) {
					local353 = this.aShortArray18;
					local357 = this.aShortArray24;
					local361 = this.aShortArray21;
					local365 = this.aByteArray24;
				} else {
					local353 = this.aClass214_1.aShortArray86;
					local357 = this.aClass214_1.aShortArray85;
					local361 = this.aClass214_1.aShortArray87;
					local365 = this.aClass214_1.aByteArray66;
				}
				@Pc(384) float local384 = this.aClass102_Sub3_27.aFloatArray21[0];
				@Pc(390) float local390 = this.aClass102_Sub3_27.aFloatArray21[1];
				@Pc(396) float local396 = this.aClass102_Sub3_27.aFloatArray21[2];
				@Pc(400) float local400 = this.aClass102_Sub3_27.aFloat72;
				@Pc(410) float local410 = this.aClass102_Sub3_27.aFloat67 * 768.0F / (float) this.aShort11;
				@Pc(420) float local420 = this.aClass102_Sub3_27.aFloat68 * 768.0F / (float) this.aShort11;
				for (@Pc(422) int local422 = 0; local422 < this.anInt839; local422++) {
					@Pc(443) int local443 = this.method6933(this.aShortArray19[local422], this.aShortArray17[local422], this.aShort10, this.aByteArray23[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass102_Sub3_27.aFloat66;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass102_Sub3_27.aFloat74;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass102_Sub3_27.aFloat65;
					@Pc(481) int local481 = this.aShortArray20[local422] & 0xFFFF;
					@Pc(486) short local486 = (short) local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					@Pc(550) float local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					@Pc(555) int local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					@Pc(570) int local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(585) int local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
					local481 = this.aShortArray22[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
					local481 = this.aShortArray26[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.pos = (local95 + local481 * local91) * 1034180571;
					local170.p1(local555);
					local170.p1(local570);
					local170.p1(local585);
					local170.p1(255 - (this.aByteArray23[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt839; local178++) {
					local189 = this.method6933(this.aShortArray19[local178], this.aShortArray17[local178], this.aShort10, this.aByteArray23[local178]);
					local170.pos = (local95 + (this.aShortArray20[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
					local170.pos = (local95 + (this.aShortArray22[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
					local170.pos = (local95 + (this.aShortArray26[local178] & 0xFFFF) * local91) * 1034180571;
					local170.p4(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass214_1 == null) {
				local353 = this.aShortArray18;
				local357 = this.aShortArray24;
				local361 = this.aShortArray21;
				local365 = this.aByteArray24;
			} else {
				local353 = this.aClass214_1.aShortArray86;
				local357 = this.aClass214_1.aShortArray85;
				local361 = this.aClass214_1.aShortArray87;
				local365 = this.aClass214_1.aByteArray66;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort11;
			local511 = 3.0F / (float) (this.aShort11 + this.aShort11 / 2);
			local170.pos = local97 * 1034180571;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local217 = 0; local217 < this.anInt837; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method23420((float) local353[local217] * local511);
						local170.method23420((float) local357[local217] * local511);
						local170.method23420((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method23420((float) local353[local217] * local463);
						local170.method23420((float) local357[local217] * local463);
						local170.method23420((float) local361[local217] * local463);
					}
					local170.pos += (local91 - 12) * 1034180571;
				}
			} else {
				for (local217 = 0; local217 < this.anInt837; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method23418((float) local353[local217] * local511);
						local170.method23418((float) local357[local217] * local511);
						local170.method23418((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method23418((float) local353[local217] * local463);
						local170.method23418((float) local357[local217] * local463);
						local170.method23418((float) local361[local217] * local463);
					}
					local170.pos += (local91 - 12) * 1034180571;
				}
			}
		}
		if (local43) {
			local170.pos = local99 * 1034180571;
			if (this.aClass102_Sub3_27.aBoolean129) {
				for (local178 = 0; local178 < this.anInt837; local178++) {
					local170.method23420(this.aFloatArray26[local178]);
					local170.method23420(this.aFloatArray25[local178]);
					local170.pos += (local91 - 8) * 1034180571;
				}
			} else {
				for (local178 = 0; local178 < this.anInt837; local178++) {
					local170.method23418(this.aFloatArray26[local178]);
					local170.method23418(this.aFloatArray25[local178]);
					local170.pos += (local91 - 8) * 1034180571;
				}
			}
		}
		local170.pos = local91 * this.anInt837 * 1034180571;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass102_Sub3_27.method6375(local91, local170.data, local170.pos * -1380987821, true);
			} else {
				this.anInterface14_4.method2754(local91, local170.data, local170.pos * -1380987821);
			}
			local1348 = this.anInterface14_4;
			this.aByte4 = 0;
		} else {
			local1348 = this.aClass102_Sub3_27.method6375(local91, local170.data, local170.pos * -1380987821, false);
			this.aBoolean165 = true;
		}
		if (local32) {
			this.aClass189_7.anInterface14_6 = local1348;
			this.aClass189_7.aByte106 = local93;
		}
		if (local43) {
			this.aClass189_10.anInterface14_6 = local1348;
			this.aClass189_10.aByte106 = local99;
		}
		if (local10) {
			this.aClass189_8.anInterface14_6 = local1348;
			this.aClass189_8.aByte106 = local95;
		}
		if (local21) {
			this.aClass189_9.anInterface14_6 = local1348;
			this.aClass189_9.aByte106 = local97;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bv", descriptor = "()Z")
	@Override
	public boolean method7383() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!afp", name = "fd", descriptor = "(IIII)V")
	@Override
	void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt845 = 0;
			anInt848 = 0;
			anInt849 = 0;
			for (local11 = 0; local11 < this.anInt847; local11++) {
				anInt845 += this.anIntArray70[local11];
				anInt848 += this.anIntArray71[local11];
				anInt849 += this.anIntArray72[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt845 = anInt845 / local3 + arg1;
				anInt848 = anInt848 / local3 + arg2;
				anInt849 = anInt849 / local3 + arg3;
			} else {
				anInt845 = arg1;
				anInt848 = arg2;
				anInt849 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt847; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray71[local3] += arg2;
				this.anIntArray72[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt847; local3++) {
					this.anIntArray70[local3] -= anInt845;
					this.anIntArray71[local3] -= anInt848;
					this.anIntArray72[local3] -= anInt849;
					if (arg3 != 0) {
						local11 = Class467.anIntArray454[arg3];
						local146 = Class467.anIntArray453[arg3];
						local164 = this.anIntArray71[local3] * local11 + this.anIntArray70[local3] * local146 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local146 - this.anIntArray70[local3] * local11 + 16383 >> 14;
						this.anIntArray70[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class467.anIntArray454[arg1];
						local146 = Class467.anIntArray453[arg1];
						local164 = this.anIntArray71[local3] * local146 - this.anIntArray72[local3] * local11 + 16383 >> 14;
						this.anIntArray72[local3] = this.anIntArray71[local3] * local11 + this.anIntArray72[local3] * local146 + 16383 >> 14;
						this.anIntArray71[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class467.anIntArray454[arg2];
						local146 = Class467.anIntArray453[arg2];
						local164 = this.anIntArray72[local3] * local11 + this.anIntArray70[local3] * local146 + 16383 >> 14;
						this.anIntArray72[local3] = this.anIntArray72[local3] * local146 - this.anIntArray70[local3] * local11 + 16383 >> 14;
						this.anIntArray70[local3] = local164;
					}
					this.anIntArray70[local3] += anInt845;
					this.anIntArray71[local3] += anInt848;
					this.anIntArray72[local3] += anInt849;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt847; local3++) {
					this.anIntArray70[local3] -= anInt845;
					this.anIntArray71[local3] -= anInt848;
					this.anIntArray72[local3] -= anInt849;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg2 / 128;
					this.anIntArray72[local3] = this.anIntArray72[local3] * arg3 / 128;
					this.anIntArray70[local3] += anInt845;
					this.anIntArray71[local3] += anInt848;
					this.anIntArray72[local3] += anInt849;
				}
			} else {
				@Pc(480) Class206 local480;
				@Pc(485) Class198 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt839; local3++) {
						local11 = (this.aByteArray23[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray23[local3] = (byte) local11;
					}
					if (this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass206Array1 != null) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local480 = this.aClass206Array1[local3];
							local485 = this.aClass198Array1[local3];
							local485.anInt3365 = local485.anInt3365 & 0xFFFFFF | 255 - (this.aByteArray23[local480.anInt3392] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt839; local3++) {
						local11 = this.aShortArray19[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray19[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass189_8 != null) {
						this.aClass189_8.anInterface14_6 = null;
					}
					if (this.aClass206Array1 != null) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local480 = this.aClass206Array1[local3];
							local485 = this.aClass198Array1[local3];
							local485.anInt3365 = local485.anInt3365 & 0xFF000000 | Class687.anIntArray524[this.aShortArray19[local480.anInt3392] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class198 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3368 += arg1;
							local651.anInt3369 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3366 = local651.anInt3366 * arg1 >> 7;
							local651.anInt3367 = local651.anInt3367 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt846; local3++) {
							local651 = this.aClass198Array1[local3];
							local651.anInt3370 = local651.anInt3370 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "fc", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg2);
		local3.method30078(this.aClass102_Sub3_27.aClass487_25);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(34) int local34 = this.aShort15 - this.aShort14 >> 1;
		@Pc(42) int local42 = this.aShort13 - this.aShort12 >> 1;
		@Pc(50) int local50 = this.aShort17 - this.aShort16 >> 1;
		@Pc(55) int local55 = this.aShort14 + local34;
		@Pc(60) int local60 = this.aShort12 + local42;
		@Pc(65) int local65 = this.aShort16 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray76[0] = local71;
		anIntArray73[0] = local77;
		anIntArray75[0] = local83;
		anIntArray76[1] = local89;
		anIntArray73[1] = local77;
		anIntArray75[1] = local83;
		anIntArray76[2] = local71;
		anIntArray73[2] = local95;
		anIntArray75[2] = local83;
		anIntArray76[3] = local89;
		anIntArray73[3] = local95;
		anIntArray75[3] = local83;
		anIntArray76[4] = local71;
		anIntArray73[4] = local77;
		anIntArray75[4] = local101;
		anIntArray76[5] = local89;
		anIntArray73[5] = local77;
		anIntArray75[5] = local101;
		anIntArray76[6] = local71;
		anIntArray73[6] = local95;
		anIntArray75[6] = local101;
		anIntArray76[7] = local89;
		anIntArray73[7] = local95;
		anIntArray75[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray76[local199];
			local210 = anIntArray73[local199];
			local214 = anIntArray75[local199];
			local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
			local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
				local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
				@Pc(348) int local348 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
				local361 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass102_Sub3_27.anIntArray66.length < this.anInt837) {
				this.aClass102_Sub3_27.anIntArray66 = new int[this.anInt837];
				this.aClass102_Sub3_27.anIntArray69 = new int[this.anInt837];
			}
			@Pc(426) int[] local426 = this.aClass102_Sub3_27.anIntArray66;
			@Pc(430) int[] local430 = this.aClass102_Sub3_27.anIntArray69;
			for (local361 = 0; local361 < this.anInt847; local361++) {
				local206 = this.anIntArray70[local361];
				local210 = this.anIntArray71[local361];
				local214 = this.anIntArray72[local361];
				local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
				local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
					local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
						local430[local604] = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt839; local361++) {
				if (local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray22[local361] & 0xFFFF] != -999999 && local426[this.aShortArray26[local361] & 0xFFFF] != -999999 && this.method6929(arg0, arg1, local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray22[local361] & 0xFFFF], local430[this.aShortArray26[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray22[local361] & 0xFFFF], local426[this.aShortArray26[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afp", name = "fl", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_27.aClass487_26;
		local3.method30080(arg2);
		local3.method30078(this.aClass102_Sub3_27.aClass487_25);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean166) {
			this.method6960();
		}
		@Pc(34) int local34 = this.aShort15 - this.aShort14 >> 1;
		@Pc(42) int local42 = this.aShort13 - this.aShort12 >> 1;
		@Pc(50) int local50 = this.aShort17 - this.aShort16 >> 1;
		@Pc(55) int local55 = this.aShort14 + local34;
		@Pc(60) int local60 = this.aShort12 + local42;
		@Pc(65) int local65 = this.aShort16 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray76[0] = local71;
		anIntArray73[0] = local77;
		anIntArray75[0] = local83;
		anIntArray76[1] = local89;
		anIntArray73[1] = local77;
		anIntArray75[1] = local83;
		anIntArray76[2] = local71;
		anIntArray73[2] = local95;
		anIntArray75[2] = local83;
		anIntArray76[3] = local89;
		anIntArray73[3] = local95;
		anIntArray75[3] = local83;
		anIntArray76[4] = local71;
		anIntArray73[4] = local77;
		anIntArray75[4] = local101;
		anIntArray76[5] = local89;
		anIntArray73[5] = local77;
		anIntArray75[5] = local101;
		anIntArray76[6] = local71;
		anIntArray73[6] = local95;
		anIntArray75[6] = local101;
		anIntArray76[7] = local89;
		anIntArray73[7] = local95;
		anIntArray75[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray76[local199];
			local210 = anIntArray73[local199];
			local214 = anIntArray75[local199];
			local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
			local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
				local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
				@Pc(348) int local348 = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
				local361 = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass102_Sub3_27.anIntArray66.length < this.anInt837) {
				this.aClass102_Sub3_27.anIntArray66 = new int[this.anInt837];
				this.aClass102_Sub3_27.anIntArray69 = new int[this.anInt837];
			}
			@Pc(426) int[] local426 = this.aClass102_Sub3_27.anIntArray66;
			@Pc(430) int[] local430 = this.aClass102_Sub3_27.anIntArray69;
			for (local361 = 0; local361 < this.anInt847; local361++) {
				local206 = this.anIntArray70[local361];
				local210 = this.anIntArray71[local361];
				local214 = this.anIntArray72[local361];
				local243 = local3.aFloatArray114[2] * (float) local206 + local3.aFloatArray114[6] * (float) local210 + local3.aFloatArray114[10] * (float) local214 + local3.aFloatArray114[14];
				local272 = local3.aFloatArray114[3] * (float) local206 + local3.aFloatArray114[7] * (float) local210 + local3.aFloatArray114[11] * (float) local214 + local3.aFloatArray114[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray114[0] * (float) local206 + local3.aFloatArray114[4] * (float) local210 + local3.aFloatArray114[8] * (float) local214 + local3.aFloatArray114[12];
					local335 = local3.aFloatArray114[1] * (float) local206 + local3.aFloatArray114[5] * (float) local210 + local3.aFloatArray114[9] * (float) local214 + local3.aFloatArray114[13];
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass102_Sub3_27.aFloat58 + this.aClass102_Sub3_27.aFloat59 * local306 / local272);
						local430[local604] = (int) (this.aClass102_Sub3_27.aFloat60 + this.aClass102_Sub3_27.aFloat73 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray74[local361];
					local584 = this.anIntArray74[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray25[local586] != 0; local586++) {
						local604 = (this.aShortArray25[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt839; local361++) {
				if (local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray22[local361] & 0xFFFF] != -999999 && local426[this.aShortArray26[local361] & 0xFFFF] != -999999 && this.method6929(arg0, arg1, local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray22[local361] & 0xFFFF], local430[this.aShortArray26[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray22[local361] & 0xFFFF], local426[this.aShortArray26[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afp", name = "ik", descriptor = "(IIIIIIII)Z")
	boolean method6951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ii", descriptor = "(IIIIIIII)Z")
	boolean method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ce", descriptor = "(III)V")
	@Override
	public void method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt847; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray72[local1] = this.anIntArray72[local1] * arg2 >> 7;
			}
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "jl", descriptor = "(ISIB)I")
	int method6953(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class687.anIntArray524[method6934(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class227 local17 = this.aClass102_Sub3_27.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte111 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!afp", name = "is", descriptor = "(Lclient!atc;)V")
	void method6954(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0) {
		if (this.aClass102_Sub3_27.anIntArray66.length < this.anInt837) {
			this.aClass102_Sub3_27.anIntArray66 = new int[this.anInt837];
			this.aClass102_Sub3_27.anIntArray69 = new int[this.anInt837];
		}
		@Pc(22) int[] local22 = this.aClass102_Sub3_27.anIntArray66;
		@Pc(26) int[] local26 = this.aClass102_Sub3_27.anIntArray69;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt847; local28++) {
			local55 = (this.anIntArray70[local28] - (this.anIntArray71[local28] * this.aClass102_Sub3_27.anInt781 >> 8) >> this.aClass102_Sub3_27.anInt772) - arg0.anInt3205;
			local78 = (this.anIntArray72[local28] - (this.anIntArray71[local28] * this.aClass102_Sub3_27.anInt769 >> 8) >> this.aClass102_Sub3_27.anInt772) - arg0.anInt3208;
			local83 = this.anIntArray74[local28];
			local90 = this.anIntArray74[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray25[local92] != 0; local92++) {
				local110 = (this.aShortArray25[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt840; local28++) {
			if (this.aByteArray23 == null || this.aByteArray23[local28] <= 128) {
				local55 = this.aShortArray20[local28] & 0xFFFF;
				local78 = this.aShortArray22[local28] & 0xFFFF;
				local83 = this.aShortArray26[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23526(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ic", descriptor = "()V")
	void method6955() {
		if (this.anInt840 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6950(true);
		}
		this.method6950(false);
		if (this.aClass196_1 != null) {
			if (this.aClass196_1.anInterface15_5 == null) {
				this.method6932((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass196_1.anInterface15_5 != null) {
				this.aClass102_Sub3_27.method6429(this.aClass189_9 != null);
				this.aClass102_Sub3_27.method6550(this.aClass189_7, this.aClass189_9, this.aClass189_8, this.aClass189_10);
				@Pc(59) int local59 = this.anIntArray77.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray77[local61];
					@Pc(76) int local76 = this.anIntArray77[local61 + 1];
					@Pc(91) int local91 = this.aShortArray17[local69] == -1 ? -1 : this.aShortArray17[local69] & 0xFFFF;
					this.aClass102_Sub3_27.method6385(local91, this.aClass189_9 != null);
					this.aClass102_Sub3_27.method6379(this.aClass196_1.anInterface15_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "im", descriptor = "()V")
	void method6956() {
		if (this.anInt840 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6950(true);
		}
		this.method6950(false);
		if (this.aClass196_1 != null) {
			if (this.aClass196_1.anInterface15_5 == null) {
				this.method6932((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass196_1.anInterface15_5 != null) {
				this.aClass102_Sub3_27.method6429(this.aClass189_9 != null);
				this.aClass102_Sub3_27.method6550(this.aClass189_7, this.aClass189_9, this.aClass189_8, this.aClass189_10);
				@Pc(59) int local59 = this.anIntArray77.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray77[local61];
					@Pc(76) int local76 = this.anIntArray77[local61 + 1];
					@Pc(91) int local91 = this.aShortArray17[local69] == -1 ? -1 : this.aShortArray17[local69] & 0xFFFF;
					this.aClass102_Sub3_27.method6385(local91, this.aClass189_9 != null);
					this.aClass102_Sub3_27.method6379(this.aClass196_1.anInterface15_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "ij", descriptor = "()V")
	void method6957() {
		if (this.anInt840 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6950(true);
		}
		this.method6950(false);
		if (this.aClass196_1 != null) {
			if (this.aClass196_1.anInterface15_5 == null) {
				this.method6932((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass196_1.anInterface15_5 != null) {
				this.aClass102_Sub3_27.method6429(this.aClass189_9 != null);
				this.aClass102_Sub3_27.method6550(this.aClass189_7, this.aClass189_9, this.aClass189_8, this.aClass189_10);
				@Pc(59) int local59 = this.anIntArray77.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray77[local61];
					@Pc(76) int local76 = this.anIntArray77[local61 + 1];
					@Pc(91) int local91 = this.aShortArray17[local69] == -1 ? -1 : this.aShortArray17[local69] & 0xFFFF;
					this.aClass102_Sub3_27.method6385(local91, this.aClass189_9 != null);
					this.aClass102_Sub3_27.method6379(this.aClass196_1.anInterface15_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "iz", descriptor = "()V")
	void method6958() {
		if (this.anInt840 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6950(true);
		}
		this.method6950(false);
		if (this.aClass196_1 != null) {
			if (this.aClass196_1.anInterface15_5 == null) {
				this.method6932((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass196_1.anInterface15_5 != null) {
				this.aClass102_Sub3_27.method6429(this.aClass189_9 != null);
				this.aClass102_Sub3_27.method6550(this.aClass189_7, this.aClass189_9, this.aClass189_8, this.aClass189_10);
				@Pc(59) int local59 = this.anIntArray77.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray77[local61];
					@Pc(76) int local76 = this.anIntArray77[local61 + 1];
					@Pc(91) int local91 = this.aShortArray17[local69] == -1 ? -1 : this.aShortArray17[local69] & 0xFFFF;
					this.aClass102_Sub3_27.method6385(local91, this.aClass189_9 != null);
					this.aClass102_Sub3_27.method6379(this.aClass196_1.anInterface15_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "jd", descriptor = "(Lclient!pm;)V")
	void method6959(@OriginalArg(0) Class487 arg0) {
		if (this.aClass206Array1 == null) {
			return;
		}
		@Pc(6) Class487 local6 = this.aClass102_Sub3_27.aClass487_22;
		this.aClass102_Sub3_27.method6432();
		this.aClass102_Sub3_27.method20762(!this.aBoolean163);
		this.aClass102_Sub3_27.method6429(false);
		this.aClass102_Sub3_27.method6550(this.aClass102_Sub3_27.aClass189_5, null, null, this.aClass102_Sub3_27.aClass189_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt846; local35++) {
			@Pc(44) Class206 local44 = this.aClass206Array1[local35];
			@Pc(49) Class198 local49 = this.aClass198Array1[local35];
			if (!local44.aBoolean690 || !this.aClass102_Sub3_27.method20784()) {
				@Pc(78) float local78 = (float) (this.anIntArray70[local44.anInt3394] + this.anIntArray70[local44.anInt3391] + this.anIntArray70[local44.anInt3393]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray71[local44.anInt3394] + this.anIntArray71[local44.anInt3391] + this.anIntArray71[local44.anInt3393]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray72[local44.anInt3394] + this.anIntArray72[local44.anInt3391] + this.anIntArray72[local44.anInt3393]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray114[0] * local78 + arg0.aFloatArray114[4] * local99 + arg0.aFloatArray114[8] * local120 + arg0.aFloatArray114[12];
				@Pc(172) float local172 = arg0.aFloatArray114[1] * local78 + arg0.aFloatArray114[5] * local99 + arg0.aFloatArray114[9] * local120 + arg0.aFloatArray114[13];
				@Pc(198) float local198 = arg0.aFloatArray114[2] * local78 + arg0.aFloatArray114[6] * local99 + arg0.aFloatArray114[10] * local120 + arg0.aFloatArray114[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3395;
				local6.method30109(local49.anInt3370, local49.anInt3366 * local44.aShort150 >> 7, local49.anInt3367 * local44.aShort152 >> 7, local146 + (float) local49.anInt3368 - local146 * local219, local172 + (float) local49.anInt3369 - local172 * local219, local198 - local198 * local219);
				this.aClass102_Sub3_27.method6352(local6);
				@Pc(267) int local267 = local49.anInt3365;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass102_Sub3_27.method6384(local44.aShort151);
				this.aClass102_Sub3_27.method6370(local44.aByte109);
				this.aClass102_Sub3_27.method6329(7, 0, 4);
			}
		}
		this.aClass102_Sub3_27.method20762(true);
		this.aClass102_Sub3_27.method6353();
	}

	@OriginalMember(owner = "client!afp", name = "cm", descriptor = "()Z")
	@Override
	boolean method7411() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt836; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray72[local6] <<= 0x4;
		}
		anInt845 = 0;
		anInt848 = 0;
		anInt849 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afp", name = "hs", descriptor = "()V")
	void method6960() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt847; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray72[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort14 = (short) local1;
		this.aShort15 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort13 = (short) local9;
		this.aShort16 = (short) local5;
		this.aShort17 = (short) local11;
		this.anInt838 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt843 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!afp", name = "cv", descriptor = "(I)V")
	@Override
	public void method7397(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt847; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray72[local9] * local3 >> 14;
			this.anIntArray72[local9] = this.anIntArray71[local9] * local3 + this.anIntArray72[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "fh", descriptor = "()I")
	@Override
	public int method7531() {
		if (!this.aBoolean166) {
			this.method6960();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!afp", name = "ga", descriptor = "(BIZ)Lclient!dn;")
	@Override
	public Class105 method7506(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class105_Sub2 local22;
		@Pc(14) Class105_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass102_Sub3_27.aClass105_Sub2Array2[arg0 - 1];
			local22 = this.aClass102_Sub3_27.aClass105_Sub2Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class105_Sub2(this.aClass102_Sub3_27);
		}
		return this.method6925(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afp", name = "gd", descriptor = "()V")
	@Override
	public void method7406() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt847; local1++) {
			this.anIntArray72[local1] = -this.anIntArray72[local1];
		}
		for (local1 = 0; local1 < this.anInt837; local1++) {
			this.aShortArray21[local1] = (short) -this.aShortArray21[local1];
		}
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(45) short local45 = this.aShortArray20[local1];
			this.aShortArray20[local1] = this.aShortArray26[local1];
			this.aShortArray26[local1] = local45;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.anInterface15_5 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "gc", descriptor = "()V")
	@Override
	public void method7510() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt847; local1++) {
			this.anIntArray72[local1] = -this.anIntArray72[local1];
		}
		for (local1 = 0; local1 < this.anInt837; local1++) {
			this.aShortArray21[local1] = (short) -this.aShortArray21[local1];
		}
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(45) short local45 = this.aShortArray20[local1];
			this.aShortArray20[local1] = this.aShortArray26[local1];
			this.aShortArray26[local1] = local45;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.anInterface15_5 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "gj", descriptor = "()V")
	@Override
	public void method7356() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt847; local1++) {
			this.anIntArray72[local1] = -this.anIntArray72[local1];
		}
		for (local1 = 0; local1 < this.anInt837; local1++) {
			this.aShortArray21[local1] = (short) -this.aShortArray21[local1];
		}
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(45) short local45 = this.aShortArray20[local1];
			this.aShortArray20[local1] = this.aShortArray26[local1];
			this.aShortArray26[local1] = local45;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.anInterface15_5 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "gf", descriptor = "()V")
	@Override
	public void method7512() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt847; local1++) {
			this.anIntArray72[local1] = -this.anIntArray72[local1];
		}
		for (local1 = 0; local1 < this.anInt837; local1++) {
			this.aShortArray21[local1] = (short) -this.aShortArray21[local1];
		}
		for (local1 = 0; local1 < this.anInt839; local1++) {
			@Pc(45) short local45 = this.aShortArray20[local1];
			this.aShortArray20[local1] = this.aShortArray26[local1];
			this.aShortArray26[local1] = local45;
		}
		if (this.aClass189_9 == null && this.aClass189_8 != null) {
			this.aClass189_8.anInterface14_6 = null;
		}
		if (this.aClass189_9 != null) {
			this.aClass189_9.anInterface14_6 = null;
		}
		if (this.aClass189_7 != null) {
			this.aClass189_7.anInterface14_6 = null;
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.anInterface15_5 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!afp", name = "hc", descriptor = "()[B")
	@Override
	public byte[] method7536() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afp", name = "m", descriptor = "(I)V")
	@Override
	public void method7422(@OriginalArg(0) int arg0) {
		this.anInt844 = arg0;
		if (this.aClass214_1 != null && (this.anInt844 & 0x10000) == 0) {
			this.aShortArray18 = this.aClass214_1.aShortArray86;
			this.aShortArray24 = this.aClass214_1.aShortArray85;
			this.aShortArray21 = this.aClass214_1.aShortArray87;
			this.aByteArray24 = this.aClass214_1.aByteArray66;
			this.aClass214_1 = null;
		}
		this.aBoolean165 = true;
		this.method6926();
	}

	@OriginalMember(owner = "client!afp", name = "hu", descriptor = "()[B")
	@Override
	public byte[] method7538() {
		return this.aByteArray23;
	}
}
