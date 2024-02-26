package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;
import java.util.Iterator;

@OriginalClass("client!aes")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!aes", name = "i", descriptor = "I")
	static final int anInt392 = 74;

	@OriginalMember(owner = "client!aes", name = "g", descriptor = "I")
	static final int anInt397 = 1;

	@OriginalMember(owner = "client!aes", name = "av", descriptor = "I")
	int anInt391;

	@OriginalMember(owner = "client!aes", name = "x", descriptor = "I")
	int anInt393;

	@OriginalMember(owner = "client!aes", name = "ak", descriptor = "I")
	int anInt395;

	@OriginalMember(owner = "client!aes", name = "k", descriptor = "I")
	int anInt396;

	@OriginalMember(owner = "client!aes", name = "ac", descriptor = "I")
	int anInt398;

	@OriginalMember(owner = "client!aes", name = "am", descriptor = "[Lclient!tn;")
	Class80[] aClass80Array2;

	@OriginalMember(owner = "client!aes", name = "n", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!aes", name = "aj", descriptor = "I")
	int anInt399;

	@OriginalMember(owner = "client!aes", name = "aq", descriptor = "Lclient!lx;")
	Interface38 anInterface38_1;

	@OriginalMember(owner = "client!aes", name = "ao", descriptor = "Lclient!ld;")
	Class135 aClass135_1;

	@OriginalMember(owner = "client!aes", name = "ai", descriptor = "Lclient!lx;")
	Interface38 anInterface38_2;

	@OriginalMember(owner = "client!aes", name = "at", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!aes", name = "ad", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!aes", name = "ay", descriptor = "[Lclient!tn;")
	Class80[] aClass80Array3;

	@OriginalMember(owner = "client!aes", name = "ae", descriptor = "I")
	int anInt403;

	@OriginalMember(owner = "client!aes", name = "r", descriptor = "F")
	float aFloat20 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!aes", name = "q", descriptor = "F")
	float aFloat21 = -3.4028235E38F;

	@OriginalMember(owner = "client!aes", name = "ax", descriptor = "Lclient!aag;")
	Class8 aClass8_5 = new Class8();

	@OriginalMember(owner = "client!aes", name = "an", descriptor = "[I")
	int[] anIntArray42 = new int[1];

	@OriginalMember(owner = "client!aes", name = "aa", descriptor = "[I")
	int[] anIntArray43 = new int[1];

	@OriginalMember(owner = "client!aes", name = "ap", descriptor = "[I")
	int[] anIntArray44 = new int[1];

	@OriginalMember(owner = "client!aes", name = "m", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_3;

	@OriginalMember(owner = "client!aes", name = "o", descriptor = "I")
	int anInt394;

	@OriginalMember(owner = "client!aes", name = "j", descriptor = "I")
	int anInt402;

	@OriginalMember(owner = "client!aes", name = "a", descriptor = "I")
	int anInt400;

	@OriginalMember(owner = "client!aes", name = "s", descriptor = "I")
	final int anInt401;

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!aes", name = "h", descriptor = "[[[Lclient!akn;")
	Class80_Sub24[][][] aClass80_Sub24ArrayArrayArray1;

	@OriginalMember(owner = "client!aes", name = "p", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aes", name = "z", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!aes", name = "w", descriptor = "[[S")
	short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!aes", name = "c", descriptor = "[[B")
	byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!aes", name = "ag", descriptor = "[[B")
	byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!aes", name = "ab", descriptor = "[[F")
	float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aes", name = "al", descriptor = "[[F")
	float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aes", name = "ah", descriptor = "[[F")
	float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aes", name = "af", descriptor = "Lclient!aax;")
	Class24 aClass24_4;

	@OriginalMember(owner = "client!aes", name = "b", descriptor = "Lclient!lu;")
	Class406 aClass406_1;

	@OriginalMember(owner = "client!aes", name = "<init>", descriptor = "(Lclient!afa;IIII[[I[[II)V")
	Class100_Sub2(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass102_Sub1_3 = arg0;
		this.anInt394 = this.anInt445 * -615169581 - 2;
		this.anInt402 = 0x1 << this.anInt394;
		this.anInt400 = arg1;
		this.anInt401 = arg2;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass80_Sub24ArrayArrayArray1 = new Class80_Sub24[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.aByteArrayArray5 = new byte[arg3][arg4];
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		this.aFloatArrayArray2 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		this.aFloatArrayArray3 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		for (@Pc(148) int local148 = 0; local148 <= this.anInt446 * -1356799781; local148++) {
			for (@Pc(156) int local156 = 0; local156 <= this.anInt448 * -1548585779; local156++) {
				@Pc(169) int local169 = this.anIntArrayArray7[local156][local148];
				if ((float) local169 < this.aFloat20) {
					this.aFloat20 = local169;
				}
				if ((float) local169 > this.aFloat21) {
					this.aFloat21 = local169;
				}
				if (local156 > 0 && local148 > 0 && local156 < this.anInt448 * -1548585779 && local148 < this.anInt446 * -1356799781) {
					@Pc(221) int local221 = arg6[local156 + 1][local148] - arg6[local156 - 1][local148];
					@Pc(237) int local237 = arg6[local156][local148 + 1] - arg6[local156][local148 - 1];
					@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local221 * local221 + arg7 * 4 * arg7 + local237 * local237)));
					this.aFloatArrayArray1[local156][local148] = (float) local221 * local256;
					this.aFloatArrayArray2[local156][local148] = (float) (-arg7 * 2) * local256;
					this.aFloatArrayArray3[local156][local148] = (float) local237 * local256;
				}
			}
		}
		this.aFloat20--;
		this.aFloat21++;
		this.aClass24_4 = new Class24(128);
		if ((this.anInt401 & 0x10) != 0) {
			this.aClass406_1 = new Class406(this.aClass102_Sub1_3, this);
		}
	}

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2938(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aes", name = "ab", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2943(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_5.method232(new Class80_Sub14(this.aClass102_Sub1_3, this, arg0, arg1), 1467358696);
	}

	@OriginalMember(owner = "client!aes", name = "f", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_3.aClass235_6;
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(94) Class80_Sub24[] local94 = this.aClass80_Sub24ArrayArrayArray1[arg0][arg1] = new Class80_Sub24[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt401 & 0x20) != 0 && local104 != -1 && local3.method26120(local104, 73831368).aBoolean758) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3686 * -1722392473) << 48 | (long) (arg10.anInt3685 * -692202347) << 42 | (long) (arg10.anInt3687 * 1682209477) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class80 local163;
			for (local163 = this.aClass24_4.method560(local158); local163 != null; local163 = this.aClass24_4.method558((byte) 0)) {
				@Pc(168) Class80_Sub24 local168 = (Class80_Sub24) local163;
				if (local168.anInt1623 == local104 && local168.aFloat143 == (float) local108 && local168.aClass229_3.method25996(arg10, (byte) 1)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class80_Sub24(this, local104, local108, arg10);
				this.aClass24_4.method563(local94[local96], local158);
			} else {
				local94[local96] = (Class80_Sub24) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray5[arg0][arg1] = (byte) (this.aByteArrayArray5[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt398) {
			this.anInt398 = arg6.length;
		}
		this.anInt399 += arg6.length;
	}

	@OriginalMember(owner = "client!aes", name = "ac", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2939(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28920(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "u", descriptor = "()V")
	@Override
	public void method2912() {
		if (this.anInt399 <= 0) {
			this.aClass406_1 = null;
			this.method2693();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt448 * -1548585779; local24++) {
			for (local32 = 1; local32 < this.anInt446 * -1356799781; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray6[local24 - 1][local32] >> 2) + (this.aByteArrayArray6[local24 + 1][local32] >> 3) + (this.aByteArrayArray6[local24][local32 - 1] >> 2) + (this.aByteArrayArray6[local24][local32 + 1] >> 3) + (this.aByteArrayArray6[local24][local32] >> 1));
			}
		}
		this.aClass80Array2 = new Class80[this.aClass24_4.method572(713185258)];
		this.aClass24_4.method561(this.aClass80Array2, (byte) 6);
		for (local24 = 0; local24 < this.aClass80Array2.length; local24++) {
			((Class80_Sub24) this.aClass80Array2[local24]).method14270(this.anInt399);
		}
		this.anInt391 = 20;
		if (this.anIntArrayArrayArray6 != null) {
			this.anInt391 += 4;
		}
		if ((this.anInt401 & 0x7) != 0) {
			this.anInt391 += 12;
		}
		this.aByteBuffer1 = this.aClass102_Sub1_3.method21359(this.anInt399 * 4);
		this.aByteBuffer2 = this.aClass102_Sub1_3.method21359(this.anInt399 * this.anInt391);
		@Pc(177) Class80_Sub24[] local177 = new Class80_Sub24[this.anInt399];
		local32 = Class548.method31273(this.anInt399 / 4, -1099354293);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class24 local194 = new Class24(local32);
		@Pc(198) Class80_Sub24[] local198 = new Class80_Sub24[this.anInt398];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt448 * -1548585779; local200++) {
			for (local208 = 0; local208 < this.anInt446 * -1356799781; local208++) {
				this.method2694(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class80_Sub24 local236;
		for (local200 = 0; local200 < this.anInt396; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method14257(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt448 * -1548585779; local200++) {
			for (local208 = 0; local208 < this.anInt446 * -1356799781; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray2[local208 * this.anInt448 * -1548585779 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class80_Sub24 local306 = local177[local288];
						@Pc(310) Class80_Sub24 local310 = local177[local295];
						@Pc(314) Class80_Sub24 local314 = local177[local302];
						@Pc(316) Class80_Sub24 local316 = null;
						if (local306 != null) {
							local306.method14258(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method14258(local200, local208, local275);
							if (local316 == null || local310.aLong338 * 3209506792906532031L < local316.aLong338 * 3209506792906532031L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method14258(local200, local208, local275);
							if (local316 == null || local314.aLong338 * 3209506792906532031L < local316.aLong338 * 3209506792906532031L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method14257(local288);
							}
							if (local310 != null) {
								local316.method14257(local295);
							}
							if (local314 != null) {
								local316.method14257(local302);
							}
							local316.method14258(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt395 = 0;
		for (local200 = 0; local200 < this.aClass80Array2.length; local200++) {
			local236 = (Class80_Sub24) this.aClass80Array2[local200];
			if (local236.anInt1624 > 0) {
				this.aClass80Array2[this.anInt395++] = local236;
			}
		}
		this.aClass80Array3 = new Class80[this.anInt395];
		@Pc(436) long[] local436 = new long[this.anInt395];
		for (local208 = 0; local208 < this.anInt395; local208++) {
			@Pc(448) Class80_Sub24 local448 = (Class80_Sub24) this.aClass80Array2[local208];
			local436[local208] = local448.aLong338 * 3209506792906532031L;
			this.aClass80Array3[local208] = local448;
		}
		Class274.method26798(local436, this.aClass80Array3, (byte) 37);
		this.method2697();
	}

	@OriginalMember(owner = "client!aes", name = "ay", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub1_3.anInt2980;
		@Pc(22) Class80_Sub1_Sub10_Sub2 local22 = (Class80_Sub1_Sub10_Sub2) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub2 local31;
		if (local22 != null && local22.method24027(local19, local19)) {
			local31 = local22;
			local22.method24021();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_3, local19, local19);
		}
		local31.method24019(0, 0, local19, local19);
		this.method2695(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aes", name = "ar", descriptor = "()V")
	void method2693() {
		if ((this.anInt400 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass80_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray6 = null;
		this.aClass24_4 = null;
		this.aClass80Array2 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!aes", name = "au", descriptor = "(II[[B[Lclient!akn;Lclient!aax;[Lclient!akn;)V")
	void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class80_Sub24[] arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) Class80_Sub24[] arg5) {
		if (this.anIntArrayArrayArray2[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class80_Sub24[] local14 = this.aClass80_Sub24ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray4[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray1[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray3[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray2[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray1[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray2[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray3[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray1[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray2[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray3[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray1[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray2[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray3[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray1[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray2[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray3[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class80_Sub24 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt448 * -1548585779 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt445 * -615169581) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt445 * -615169581) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt394;
			@Pc(304) int local304 = local294 >> this.anInt394;
			@Pc(308) int local308 = local42[local268];
			@Pc(312) int local312 = local35[local268];
			@Pc(320) int local320 = local54 == null ? 0 : local54[local268];
			@Pc(338) long local338 = (long) local312 << 48 | (long) local308 << 32 | (long) (local299 << 16) | (long) local304;
			@Pc(342) int local342 = local21[local268];
			@Pc(346) int local346 = local28[local268];
			@Pc(348) byte local348 = 74;
			@Pc(350) int local350 = 0;
			@Pc(352) float local352 = 1.0F;
			@Pc(358) float local358;
			@Pc(360) float local360;
			@Pc(362) float local362;
			@Pc(462) float local462;
			@Pc(366) int local366;
			if (local342 == 0 && local346 == 0) {
				local358 = local77;
				local360 = local84;
				local362 = local91;
				local366 = local348 - local186;
			} else if (local342 == 0 && local346 == this.anInt447 * -1174710433) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt447 * -1174710433 && local346 == this.anInt447 * -1174710433) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt447 * -1174710433 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt447 * -1174710433);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt447 * -1174710433);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt445 * -615169581);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt445 * -615169581);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt445 * -615169581));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class522.anIntArray467[local308 & 0xFF80 | local570];
				if ((this.anInt401 & 0x7) == 0) {
					local352 = this.aClass102_Sub1_3.aFloatArray68[0] * local358 + this.aClass102_Sub1_3.aFloatArray68[1] * local360 + this.aClass102_Sub1_3.aFloatArray68[2] * local362;
					local352 = this.aClass102_Sub1_3.aFloat212 + local352 * (local352 > 0.0F ? this.aClass102_Sub1_3.aFloat214 : this.aClass102_Sub1_3.aFloat216);
				}
			}
			@Pc(638) Class80 local638 = null;
			if ((local283 & this.anInt402 - 1) == 0 && (local294 & this.anInt402 - 1) == 0) {
				local638 = arg4.method560(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class522.anIntArray467[local312 & 0xFF80 | local669];
					if ((this.anInt401 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass102_Sub1_3.aFloatArray68[0] * local358 + this.aClass102_Sub1_3.aFloatArray68[1] * local360 + this.aClass102_Sub1_3.aFloatArray68[2] * local362;
						local462 = this.aClass102_Sub1_3.aFloat212 + local352 * (local352 > 0.0F ? this.aClass102_Sub1_3.aFloat214 : this.aClass102_Sub1_3.aFloat216);
						@Pc(741) int local741 = local688 >> 16 & 0xFF;
						@Pc(747) int local747 = local688 >> 8 & 0xFF;
						@Pc(751) int local751 = local688 & 0xFF;
						local741 = (int) ((float) local741 * local462);
						if (local741 < 0) {
							local741 = 0;
						} else if (local741 > 255) {
							local741 = 255;
						}
						local747 = (int) ((float) local747 * local462);
						if (local747 < 0) {
							local747 = 0;
						} else if (local747 > 255) {
							local747 = 255;
						}
						local751 = (int) ((float) local751 * local462);
						if (local751 < 0) {
							local751 = 0;
						} else if (local751 > 255) {
							local751 = 255;
						}
						local688 = local741 << 16 | local747 << 8 | local751;
					}
				}
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method2915(local283, local294, (byte) -107) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray6 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt401 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass102_Sub1_3.anInt2973 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer1.putInt(local688 | 0xFF000000);
				local232 = this.anInt396++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method563(new Class80_Sub35(local266[local268]), local338);
			} else {
				local266[local268] = ((Class80_Sub35) local638).aShort53;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong338 * 3209506792906532031L < arg5[local232].aLong338 * 3209506792906532031L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method14272(local232, local350, local366, local352);
			}
			this.anInt393++;
		}
	}

	@OriginalMember(owner = "client!aes", name = "t", descriptor = "(III)V")
	@Override
	public void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray6[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aes", name = "g", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt399 <= 0) {
			return;
		}
		@Pc(9) Interface44 local9 = this.aClass102_Sub1_3.method21249(this.anInt393);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_3.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt448 * -1548585779 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray2[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29383(0, local19.position(), this.aClass102_Sub1_3.aLong168);
		if (local11 <= 0) {
			return;
		}
		this.aClass102_Sub1_3.method21260();
		@Pc(111) Class119 local111 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		this.aClass102_Sub1_3.method21251(local9);
		this.aClass102_Sub1_3.method20759(Class471.aClass471_53);
		@Pc(143) float local143 = (float) this.aClass102_Sub1_3.method20677(1298814404).method24036();
		@Pc(150) float local150 = (float) this.aClass102_Sub1_3.method20677(1568709047).method24037();
		@Pc(154) Class471 local154 = new Class471();
		@Pc(158) Class471 local158 = new Class471();
		local154.method29797(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29778((float) arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), (float) -arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), 1.0F / (this.aFloat21 - this.aFloat20));
		local158.method29783((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat20 / (this.aFloat21 - this.aFloat20));
		local158.method29816(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29783(-1.0F, -1.0F, 0.0F);
		this.aClass102_Sub1_3.aClass471_35.method29817(local154, local158);
		this.aClass102_Sub1_3.aClass487_80.method30080(this.aClass102_Sub1_3.aClass471_35);
		this.aClass102_Sub1_3.method20933(this.aClass102_Sub1_3.aClass487_80);
		local111.method9392(Class487.aClass487_97);
		local111.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		local111.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		local111.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
		local111.aClass487_35.method30139();
		local111.anInt1107 = local13;
		local111.anInt1108 = local15 - local13 + 1;
		local111.anInt1105 = 0;
		local111.anInt1109 = local11 / 3;
		if (this.aClass102_Sub1_3.aBoolean515) {
			this.aClass102_Sub1_3.method20762(false);
			local111.method9410(false);
			this.aClass102_Sub1_3.method20762(true);
		} else {
			local111.method9410(false);
		}
	}

	@OriginalMember(owner = "client!aes", name = "z", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2938(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aes", name = "az", descriptor = "(Lclient!atu;II)V")
	void method2695(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray42.length < local16) {
			this.anIntArray42 = new int[local16];
			this.anIntArray43 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray42[local31] = local6[local31] >> this.aClass102_Sub1_3.anInt2980;
			this.anIntArray43[local31] = local13[local31] >> this.aClass102_Sub1_3.anInt2980;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray42[local31];
			@Pc(74) int local74 = this.anIntArray43[local31++];
			@Pc(79) int local79 = this.anIntArray42[local31];
			@Pc(85) int local85 = this.anIntArray43[local31++];
			@Pc(90) int local90 = this.anIntArray42[local31];
			@Pc(96) int local96 = this.anIntArray43[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method24031(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "x", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2922(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			return this.aClass406_1.method28916(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aes", name = "s", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2920(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28919(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "k", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2921(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28920(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "w", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2923(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_5.method232(new Class80_Sub14(this.aClass102_Sub1_3, this, arg0, arg1), 235376450);
	}

	@OriginalMember(owner = "client!aes", name = "r", descriptor = "(III)V")
	@Override
	public void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray6[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aes", name = "q", descriptor = "(III)V")
	@Override
	public void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray6[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aes", name = "h", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2938(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aes", name = "bn", descriptor = "(Lclient!atu;II)V")
	void method2696(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray42.length < local16) {
			this.anIntArray42 = new int[local16];
			this.anIntArray43 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray42[local31] = local6[local31] >> this.aClass102_Sub1_3.anInt2980;
			this.anIntArray43[local31] = local13[local31] >> this.aClass102_Sub1_3.anInt2980;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray42[local31];
			@Pc(74) int local74 = this.anIntArray43[local31++];
			@Pc(79) int local79 = this.anIntArray42[local31];
			@Pc(85) int local85 = this.anIntArray43[local31++];
			@Pc(90) int local90 = this.anIntArray42[local31];
			@Pc(96) int local96 = this.anIntArray43[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method24031(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "ap", descriptor = "()V")
	void method2697() {
		this.anInterface38_1 = this.aClass102_Sub1_3.method21239(false);
		this.anInterface38_1.method29327(this.anInt396 * 4, 4);
		this.anInterface38_1.method29383(0, this.anInt396 * 4, this.aClass102_Sub1_3.method21141(this.aByteBuffer1));
		this.anInterface38_2 = this.aClass102_Sub1_3.method21239(false);
		this.anInterface38_2.method29327(this.anInt396 * this.anInt391, this.anInt391);
		this.anInterface38_2.method29383(0, this.anInt396 * this.anInt391, this.aClass102_Sub1_3.method21141(this.aByteBuffer2));
		this.aByteBuffer1.clear();
		this.aByteBuffer1 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt401 & 0x7) == 0) {
			if (this.anIntArrayArrayArray6 == null) {
				this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1 }), new Class397(Class400.aClass400_3) });
			} else {
				this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_4 }), new Class397(Class400.aClass400_3) });
			}
		} else if (this.anIntArrayArrayArray6 == null) {
			this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_2 }), new Class397(Class400.aClass400_3) });
		} else {
			this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_4, Class400.aClass400_2 }), new Class397(Class400.aClass400_3) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt395; local226++) {
			@Pc(236) Class80_Sub24 local236 = (Class80_Sub24) this.aClass80Array2[local226];
			local236.method14260(this.anInt396);
		}
		if (this.aClass406_1 != null) {
			this.aClass406_1.method28927();
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aes", name = "p", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_3.aClass235_6;
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(94) Class80_Sub24[] local94 = this.aClass80_Sub24ArrayArrayArray1[arg0][arg1] = new Class80_Sub24[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt401 & 0x20) != 0 && local104 != -1 && local3.method26120(local104, 73831368).aBoolean758) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3686 * -1722392473) << 48 | (long) (arg10.anInt3685 * -692202347) << 42 | (long) (arg10.anInt3687 * 1682209477) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class80 local163;
			for (local163 = this.aClass24_4.method560(local158); local163 != null; local163 = this.aClass24_4.method558((byte) 0)) {
				@Pc(168) Class80_Sub24 local168 = (Class80_Sub24) local163;
				if (local168.anInt1623 == local104 && local168.aFloat143 == (float) local108 && local168.aClass229_3.method25996(arg10, (byte) -25)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class80_Sub24(this, local104, local108, arg10);
				this.aClass24_4.method563(local94[local96], local158);
			} else {
				local94[local96] = (Class80_Sub24) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray5[arg0][arg1] = (byte) (this.aByteArrayArray5[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt398) {
			this.anInt398 = arg6.length;
		}
		this.anInt399 += arg6.length;
	}

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "()V")
	@Override
	public void method2930() {
		if (this.anInt399 <= 0) {
			this.aClass406_1 = null;
			this.method2693();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt448 * -1548585779; local24++) {
			for (local32 = 1; local32 < this.anInt446 * -1356799781; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray6[local24 - 1][local32] >> 2) + (this.aByteArrayArray6[local24 + 1][local32] >> 3) + (this.aByteArrayArray6[local24][local32 - 1] >> 2) + (this.aByteArrayArray6[local24][local32 + 1] >> 3) + (this.aByteArrayArray6[local24][local32] >> 1));
			}
		}
		this.aClass80Array2 = new Class80[this.aClass24_4.method572(1648115172)];
		this.aClass24_4.method561(this.aClass80Array2, (byte) 46);
		for (local24 = 0; local24 < this.aClass80Array2.length; local24++) {
			((Class80_Sub24) this.aClass80Array2[local24]).method14270(this.anInt399);
		}
		this.anInt391 = 20;
		if (this.anIntArrayArrayArray6 != null) {
			this.anInt391 += 4;
		}
		if ((this.anInt401 & 0x7) != 0) {
			this.anInt391 += 12;
		}
		this.aByteBuffer1 = this.aClass102_Sub1_3.method21359(this.anInt399 * 4);
		this.aByteBuffer2 = this.aClass102_Sub1_3.method21359(this.anInt399 * this.anInt391);
		@Pc(177) Class80_Sub24[] local177 = new Class80_Sub24[this.anInt399];
		local32 = Class548.method31273(this.anInt399 / 4, -2111302049);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class24 local194 = new Class24(local32);
		@Pc(198) Class80_Sub24[] local198 = new Class80_Sub24[this.anInt398];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt448 * -1548585779; local200++) {
			for (local208 = 0; local208 < this.anInt446 * -1356799781; local208++) {
				this.method2694(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class80_Sub24 local236;
		for (local200 = 0; local200 < this.anInt396; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method14257(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt448 * -1548585779; local200++) {
			for (local208 = 0; local208 < this.anInt446 * -1356799781; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray2[local208 * this.anInt448 * -1548585779 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class80_Sub24 local306 = local177[local288];
						@Pc(310) Class80_Sub24 local310 = local177[local295];
						@Pc(314) Class80_Sub24 local314 = local177[local302];
						@Pc(316) Class80_Sub24 local316 = null;
						if (local306 != null) {
							local306.method14258(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method14258(local200, local208, local275);
							if (local316 == null || local310.aLong338 * 3209506792906532031L < local316.aLong338 * 3209506792906532031L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method14258(local200, local208, local275);
							if (local316 == null || local314.aLong338 * 3209506792906532031L < local316.aLong338 * 3209506792906532031L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method14257(local288);
							}
							if (local310 != null) {
								local316.method14257(local295);
							}
							if (local314 != null) {
								local316.method14257(local302);
							}
							local316.method14258(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt395 = 0;
		for (local200 = 0; local200 < this.aClass80Array2.length; local200++) {
			local236 = (Class80_Sub24) this.aClass80Array2[local200];
			if (local236.anInt1624 > 0) {
				this.aClass80Array2[this.anInt395++] = local236;
			}
		}
		this.aClass80Array3 = new Class80[this.anInt395];
		@Pc(436) long[] local436 = new long[this.anInt395];
		for (local208 = 0; local208 < this.anInt395; local208++) {
			@Pc(448) Class80_Sub24 local448 = (Class80_Sub24) this.aClass80Array2[local208];
			local436[local208] = local448.aLong338 * 3209506792906532031L;
			this.aClass80Array3[local208] = local448;
		}
		Class274.method26798(local436, this.aClass80Array3, (byte) -35);
		this.method2697();
	}

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "(III[[ZZI)V")
	@Override
	public void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray44.length < local12) {
			this.anIntArray44 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt448 * -1548585779 - 1) {
			local45 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt446 * -1356799781 - 1) {
			local64 = this.anInt446 * -1356799781 - 1;
		}
		this.anInt403 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray44[this.anInt403++] = local95 * this.anInt448 * -1548585779 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass102_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass80Array3.length; local135++) {
			@Pc(146) Class80_Sub24 local146 = (Class80_Sub24) this.aClass80Array3[local135];
			local146.method14256(this.anIntArray44, this.anInt403);
		}
		local135 = local130.position();
		@Pc(161) Class119 local161 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21260();
		if (this.aClass102_Sub1_3.anInt2985 > 0) {
			local161.aClass463_19.method29477((float) (this.aClass102_Sub1_3.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 0 & 0xFF) / 255.0F);
			local161.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_3.aFloat217);
			local161.aClass456_6.method29343(this.aClass102_Sub1_3.aClass487_77);
			local161.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_3.aFloat218 - this.aClass102_Sub1_3.aFloat217));
		} else {
			local161.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface44 local252 = this.aClass102_Sub1_3.method21249(local135 / 2);
			local252.method29383(0, local135, this.aClass102_Sub1_3.aLong168);
			this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
			this.aClass102_Sub1_3.method21251(local252);
			local161.method9392(Class487.aClass487_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class80_Sub24 local293;
			@Pc(411) Class227 local411;
			if ((this.anInt401 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 != 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							local161.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) this.aClass102_Sub1_3.anInt3002 + (float) (local293.aClass229_3.anInt3686 * -1722392473) / 255.0F * (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass456_5.method29342(1.0F / (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local399 = !Class58.method15723(local411.aByte110, (byte) 1);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						local161.method9410(local399);
						local280 += local293.anInt1625;
					}
				}
			} else {
				local161.aClass463_17.method29477(this.aClass102_Sub1_3.aFloatArray68[0], this.aClass102_Sub1_3.aFloatArray68[1], this.aClass102_Sub1_3.aFloatArray68[2]);
				local161.aClass463_22.method29477(this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_16.method29477(-this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat208, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat209, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_21.method29477(this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat210);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 > 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass456_5.method29337(0.0F, 1.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613), 0.0F, 256.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local693 = local411.aByte110;
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local161.method9393(local411.aByte116);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						switch(local693) {
							case 1:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9399();
								} else {
									local161.method9404(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass102_Sub1_3.aBoolean518 || (this.anInt401 & 0x8) == 0 || !this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6.method20201(-1179974170)) {
									local161.method9396(0);
								} else {
									@Pc(825) Class131_Sub1_Sub1 local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6;
									if (local693 == 2) {
										local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_5;
									}
									local825.aClass487_69.method30075(this.aClass102_Sub1_3.aClass487_78);
									local825.aClass487_70.method30070(1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F, 1.0F);
									local825.aClass463_56.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
									@Pc(894) Class227 local894 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
									local825.anInt2848 = local894.aByte116 * -597401913;
									local825.anInt2849 = local293.anInt1622 * -1508861345;
									local825.anInt2850 = (local293.anInt1626 - local293.anInt1622 + 1) * 1215506291;
									local825.anInt2851 = local280 * 97998367;
									local825.anInt2852 = local293.anInt1625 / 3 * -572150419;
									local825.aClass456_15.method29338(local161.aClass456_5);
									local825.aClass463_57.method29478(local161.aClass463_20);
									local825.aClass456_16.method29338(local161.aClass456_6);
									local825.aClass463_58.method29478(local161.aClass463_19);
									local825.method20200(329727348);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9394();
								} else {
									local161.method9396(0);
								}
								break;
							case 6:
								local161.method9410(!Class58.method15723(local693, (byte) 1));
								break;
							case 7:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								local161.aClass487_36.method30139();
								local161.anInterface42_3 = this.aClass102_Sub1_3.method21170();
								local161.method9409(0);
						}
						local280 += local293.anInt1625;
					}
				}
			}
		}
		if (!this.aClass8_5.method240(-1856549901)) {
			this.aClass102_Sub1_3.method21235(128);
			this.aClass102_Sub1_3.method21191(false);
			@Pc(1036) Class463 local1036 = new Class463(local161.aClass463_19);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass8_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class80_Sub14 local1053 = (Class80_Sub14) local1046.next();
				local1053.method14027(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass463_19.method29478(local1036);
		}
		if (this.aClass406_1 == null) {
			return;
		}
		this.aClass102_Sub1_3.method21235(1);
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		@Pc(1094) Class487 local1094 = this.aClass102_Sub1_3.aClass487_80;
		local1094.method30139();
		local1094.aFloatArray114[13] = -1.0F;
		local161.method9392(local1094);
		this.aClass406_1.method28918(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aes", name = "n", descriptor = "(III[[ZZI)V")
	@Override
	public void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray44.length < local12) {
			this.anIntArray44 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt448 * -1548585779 - 1) {
			local45 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt446 * -1356799781 - 1) {
			local64 = this.anInt446 * -1356799781 - 1;
		}
		this.anInt403 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray44[this.anInt403++] = local95 * this.anInt448 * -1548585779 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass102_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass80Array3.length; local135++) {
			@Pc(146) Class80_Sub24 local146 = (Class80_Sub24) this.aClass80Array3[local135];
			local146.method14256(this.anIntArray44, this.anInt403);
		}
		local135 = local130.position();
		@Pc(161) Class119 local161 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21260();
		if (this.aClass102_Sub1_3.anInt2985 > 0) {
			local161.aClass463_19.method29477((float) (this.aClass102_Sub1_3.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 0 & 0xFF) / 255.0F);
			local161.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_3.aFloat217);
			local161.aClass456_6.method29343(this.aClass102_Sub1_3.aClass487_77);
			local161.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_3.aFloat218 - this.aClass102_Sub1_3.aFloat217));
		} else {
			local161.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface44 local252 = this.aClass102_Sub1_3.method21249(local135 / 2);
			local252.method29383(0, local135, this.aClass102_Sub1_3.aLong168);
			this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
			this.aClass102_Sub1_3.method21251(local252);
			local161.method9392(Class487.aClass487_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class80_Sub24 local293;
			@Pc(411) Class227 local411;
			if ((this.anInt401 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 != 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							local161.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) this.aClass102_Sub1_3.anInt3002 + (float) (local293.aClass229_3.anInt3686 * -1722392473) / 255.0F * (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass456_5.method29342(1.0F / (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local399 = !Class58.method15723(local411.aByte110, (byte) 1);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						local161.method9410(local399);
						local280 += local293.anInt1625;
					}
				}
			} else {
				local161.aClass463_17.method29477(this.aClass102_Sub1_3.aFloatArray68[0], this.aClass102_Sub1_3.aFloatArray68[1], this.aClass102_Sub1_3.aFloatArray68[2]);
				local161.aClass463_22.method29477(this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_16.method29477(-this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat208, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat209, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_21.method29477(this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat210);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 > 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass456_5.method29337(0.0F, 1.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613), 0.0F, 256.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local693 = local411.aByte110;
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local161.method9393(local411.aByte116);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						switch(local693) {
							case 1:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9399();
								} else {
									local161.method9404(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass102_Sub1_3.aBoolean518 || (this.anInt401 & 0x8) == 0 || !this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6.method20201(979675296)) {
									local161.method9396(0);
								} else {
									@Pc(825) Class131_Sub1_Sub1 local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6;
									if (local693 == 2) {
										local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_5;
									}
									local825.aClass487_69.method30075(this.aClass102_Sub1_3.aClass487_78);
									local825.aClass487_70.method30070(1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F, 1.0F);
									local825.aClass463_56.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
									@Pc(894) Class227 local894 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
									local825.anInt2848 = local894.aByte116 * -597401913;
									local825.anInt2849 = local293.anInt1622 * -1508861345;
									local825.anInt2850 = (local293.anInt1626 - local293.anInt1622 + 1) * 1215506291;
									local825.anInt2851 = local280 * 97998367;
									local825.anInt2852 = local293.anInt1625 / 3 * -572150419;
									local825.aClass456_15.method29338(local161.aClass456_5);
									local825.aClass463_57.method29478(local161.aClass463_20);
									local825.aClass456_16.method29338(local161.aClass456_6);
									local825.aClass463_58.method29478(local161.aClass463_19);
									local825.method20200(1062358795);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9394();
								} else {
									local161.method9396(0);
								}
								break;
							case 6:
								local161.method9410(!Class58.method15723(local693, (byte) 1));
								break;
							case 7:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								local161.aClass487_36.method30139();
								local161.anInterface42_3 = this.aClass102_Sub1_3.method21170();
								local161.method9409(0);
						}
						local280 += local293.anInt1625;
					}
				}
			}
		}
		if (!this.aClass8_5.method240(-2040175336)) {
			this.aClass102_Sub1_3.method21235(128);
			this.aClass102_Sub1_3.method21191(false);
			@Pc(1036) Class463 local1036 = new Class463(local161.aClass463_19);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass8_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class80_Sub14 local1053 = (Class80_Sub14) local1046.next();
				local1053.method14027(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass463_19.method29478(local1036);
		}
		if (this.aClass406_1 == null) {
			return;
		}
		this.aClass102_Sub1_3.method21235(1);
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		@Pc(1094) Class487 local1094 = this.aClass102_Sub1_3.aClass487_80;
		local1094.method30139();
		local1094.aFloatArray114[13] = -1.0F;
		local161.method9392(local1094);
		this.aClass406_1.method28918(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aes", name = "c", descriptor = "(III[[ZZI)V")
	@Override
	public void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray44.length < local12) {
			this.anIntArray44 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt448 * -1548585779 - 1) {
			local45 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt446 * -1356799781 - 1) {
			local64 = this.anInt446 * -1356799781 - 1;
		}
		this.anInt403 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray44[this.anInt403++] = local95 * this.anInt448 * -1548585779 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass102_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass80Array3.length; local135++) {
			@Pc(146) Class80_Sub24 local146 = (Class80_Sub24) this.aClass80Array3[local135];
			local146.method14256(this.anIntArray44, this.anInt403);
		}
		local135 = local130.position();
		@Pc(161) Class119 local161 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21260();
		if (this.aClass102_Sub1_3.anInt2985 > 0) {
			local161.aClass463_19.method29477((float) (this.aClass102_Sub1_3.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 0 & 0xFF) / 255.0F);
			local161.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_3.aFloat217);
			local161.aClass456_6.method29343(this.aClass102_Sub1_3.aClass487_77);
			local161.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_3.aFloat218 - this.aClass102_Sub1_3.aFloat217));
		} else {
			local161.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface44 local252 = this.aClass102_Sub1_3.method21249(local135 / 2);
			local252.method29383(0, local135, this.aClass102_Sub1_3.aLong168);
			this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
			this.aClass102_Sub1_3.method21251(local252);
			local161.method9392(Class487.aClass487_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class80_Sub24 local293;
			@Pc(411) Class227 local411;
			if ((this.anInt401 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 != 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							local161.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) this.aClass102_Sub1_3.anInt3002 + (float) (local293.aClass229_3.anInt3686 * -1722392473) / 255.0F * (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass456_5.method29342(1.0F / (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local399 = !Class58.method15723(local411.aByte110, (byte) 1);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						local161.method9410(local399);
						local280 += local293.anInt1625;
					}
				}
			} else {
				local161.aClass463_17.method29477(this.aClass102_Sub1_3.aFloatArray68[0], this.aClass102_Sub1_3.aFloatArray68[1], this.aClass102_Sub1_3.aFloatArray68[2]);
				local161.aClass463_22.method29477(this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_16.method29477(-this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat208, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat209, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_21.method29477(this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat210);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 > 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass456_5.method29337(0.0F, 1.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613), 0.0F, 256.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local693 = local411.aByte110;
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local161.method9393(local411.aByte116);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						switch(local693) {
							case 1:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9399();
								} else {
									local161.method9404(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass102_Sub1_3.aBoolean518 || (this.anInt401 & 0x8) == 0 || !this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6.method20201(-1366644627)) {
									local161.method9396(0);
								} else {
									@Pc(825) Class131_Sub1_Sub1 local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6;
									if (local693 == 2) {
										local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_5;
									}
									local825.aClass487_69.method30075(this.aClass102_Sub1_3.aClass487_78);
									local825.aClass487_70.method30070(1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F, 1.0F);
									local825.aClass463_56.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
									@Pc(894) Class227 local894 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
									local825.anInt2848 = local894.aByte116 * -597401913;
									local825.anInt2849 = local293.anInt1622 * -1508861345;
									local825.anInt2850 = (local293.anInt1626 - local293.anInt1622 + 1) * 1215506291;
									local825.anInt2851 = local280 * 97998367;
									local825.anInt2852 = local293.anInt1625 / 3 * -572150419;
									local825.aClass456_15.method29338(local161.aClass456_5);
									local825.aClass463_57.method29478(local161.aClass463_20);
									local825.aClass456_16.method29338(local161.aClass456_6);
									local825.aClass463_58.method29478(local161.aClass463_19);
									local825.method20200(143915904);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9394();
								} else {
									local161.method9396(0);
								}
								break;
							case 6:
								local161.method9410(!Class58.method15723(local693, (byte) 1));
								break;
							case 7:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								local161.aClass487_36.method30139();
								local161.anInterface42_3 = this.aClass102_Sub1_3.method21170();
								local161.method9409(0);
						}
						local280 += local293.anInt1625;
					}
				}
			}
		}
		if (!this.aClass8_5.method240(-48186232)) {
			this.aClass102_Sub1_3.method21235(128);
			this.aClass102_Sub1_3.method21191(false);
			@Pc(1036) Class463 local1036 = new Class463(local161.aClass463_19);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass8_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class80_Sub14 local1053 = (Class80_Sub14) local1046.next();
				local1053.method14027(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass463_19.method29478(local1036);
		}
		if (this.aClass406_1 == null) {
			return;
		}
		this.aClass102_Sub1_3.method21235(1);
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		@Pc(1094) Class487 local1094 = this.aClass102_Sub1_3.aClass487_80;
		local1094.method30139();
		local1094.aFloatArray114[13] = -1.0F;
		local161.method9392(local1094);
		this.aClass406_1.method28918(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aes", name = "b", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt399 <= 0) {
			return;
		}
		@Pc(9) Interface44 local9 = this.aClass102_Sub1_3.method21249(this.anInt393);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_3.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt448 * -1548585779 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray2[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29383(0, local19.position(), this.aClass102_Sub1_3.aLong168);
		if (local11 <= 0) {
			return;
		}
		this.aClass102_Sub1_3.method21260();
		@Pc(111) Class119 local111 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		this.aClass102_Sub1_3.method21251(local9);
		this.aClass102_Sub1_3.method20759(Class471.aClass471_53);
		@Pc(143) float local143 = (float) this.aClass102_Sub1_3.method20677(1113406599).method24036();
		@Pc(150) float local150 = (float) this.aClass102_Sub1_3.method20677(2019302958).method24037();
		@Pc(154) Class471 local154 = new Class471();
		@Pc(158) Class471 local158 = new Class471();
		local154.method29797(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29778((float) arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), (float) -arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), 1.0F / (this.aFloat21 - this.aFloat20));
		local158.method29783((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat20 / (this.aFloat21 - this.aFloat20));
		local158.method29816(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29783(-1.0F, -1.0F, 0.0F);
		this.aClass102_Sub1_3.aClass471_35.method29817(local154, local158);
		this.aClass102_Sub1_3.aClass487_80.method30080(this.aClass102_Sub1_3.aClass471_35);
		this.aClass102_Sub1_3.method20933(this.aClass102_Sub1_3.aClass487_80);
		local111.method9392(Class487.aClass487_97);
		local111.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		local111.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		local111.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
		local111.aClass487_35.method30139();
		local111.anInt1107 = local13;
		local111.anInt1108 = local15 - local13 + 1;
		local111.anInt1105 = 0;
		local111.anInt1109 = local11 / 3;
		if (this.aClass102_Sub1_3.aBoolean515) {
			this.aClass102_Sub1_3.method20762(false);
			local111.method9410(false);
			this.aClass102_Sub1_3.method20762(true);
		} else {
			local111.method9410(false);
		}
	}

	@OriginalMember(owner = "client!aes", name = "ax", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt399 <= 0) {
			return;
		}
		@Pc(9) Interface44 local9 = this.aClass102_Sub1_3.method21249(this.anInt393);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_3.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt448 * -1548585779 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray2[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29383(0, local19.position(), this.aClass102_Sub1_3.aLong168);
		if (local11 <= 0) {
			return;
		}
		this.aClass102_Sub1_3.method21260();
		@Pc(111) Class119 local111 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		this.aClass102_Sub1_3.method21251(local9);
		this.aClass102_Sub1_3.method20759(Class471.aClass471_53);
		@Pc(143) float local143 = (float) this.aClass102_Sub1_3.method20677(1203260515).method24036();
		@Pc(150) float local150 = (float) this.aClass102_Sub1_3.method20677(1142335990).method24037();
		@Pc(154) Class471 local154 = new Class471();
		@Pc(158) Class471 local158 = new Class471();
		local154.method29797(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29778((float) arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), (float) -arg2 / ((float) (this.anInt447 * -1174710433) * 256.0F), 1.0F / (this.aFloat21 - this.aFloat20));
		local158.method29783((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat20 / (this.aFloat21 - this.aFloat20));
		local158.method29816(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29783(-1.0F, -1.0F, 0.0F);
		this.aClass102_Sub1_3.aClass471_35.method29817(local154, local158);
		this.aClass102_Sub1_3.aClass487_80.method30080(this.aClass102_Sub1_3.aClass471_35);
		this.aClass102_Sub1_3.method20933(this.aClass102_Sub1_3.aClass487_80);
		local111.method9392(Class487.aClass487_97);
		local111.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		local111.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		local111.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
		local111.aClass487_35.method30139();
		local111.anInt1107 = local13;
		local111.anInt1108 = local15 - local13 + 1;
		local111.anInt1105 = 0;
		local111.anInt1109 = local11 / 3;
		if (this.aClass102_Sub1_3.aBoolean515) {
			this.aClass102_Sub1_3.method20762(false);
			local111.method9410(false);
			this.aClass102_Sub1_3.method20762(true);
		} else {
			local111.method9410(false);
		}
	}

	@OriginalMember(owner = "client!aes", name = "af", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2929(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			return this.aClass406_1.method28916(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aes", name = "ai", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub1_3.anInt2980;
		@Pc(22) Class80_Sub1_Sub10_Sub2 local22 = (Class80_Sub1_Sub10_Sub2) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub2 local31;
		if (local22 != null && local22.method24027(local19, local19)) {
			local31 = local22;
			local22.method24021();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_3, local19, local19);
		}
		local31.method24019(0, 0, local19, local19);
		this.method2695(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aes", name = "aq", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2935(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28920(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "ao", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2909(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28920(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "aj", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2944(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28920(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "a", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub1_3.anInt2980;
		@Pc(22) Class80_Sub1_Sub10_Sub2 local22 = (Class80_Sub1_Sub10_Sub2) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub2 local31;
		if (local22 != null && local22.method24027(local19, local19)) {
			local31 = local22;
			local22.method24021();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_3, local19, local19);
		}
		local31.method24019(0, 0, local19, local19);
		this.method2695(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aes", name = "ag", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2933(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_5.method232(new Class80_Sub14(this.aClass102_Sub1_3, this, arg0, arg1), 321111638);
	}

	@OriginalMember(owner = "client!aes", name = "l", descriptor = "(III[[ZZI)V")
	@Override
	public void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray44.length < local12) {
			this.anIntArray44 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt448 * -1548585779 - 1) {
			local45 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt446 * -1356799781 - 1) {
			local64 = this.anInt446 * -1356799781 - 1;
		}
		this.anInt403 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray44[this.anInt403++] = local95 * this.anInt448 * -1548585779 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass102_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass80Array3.length; local135++) {
			@Pc(146) Class80_Sub24 local146 = (Class80_Sub24) this.aClass80Array3[local135];
			local146.method14256(this.anIntArray44, this.anInt403);
		}
		local135 = local130.position();
		@Pc(161) Class119 local161 = this.aClass102_Sub1_3.aClass119_3;
		this.aClass102_Sub1_3.method21260();
		if (this.aClass102_Sub1_3.anInt2985 > 0) {
			local161.aClass463_19.method29477((float) (this.aClass102_Sub1_3.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_3.anInt2965 >> 0 & 0xFF) / 255.0F);
			local161.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_3.aFloat217);
			local161.aClass456_6.method29343(this.aClass102_Sub1_3.aClass487_77);
			local161.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_3.aFloat218 - this.aClass102_Sub1_3.aFloat217));
		} else {
			local161.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface44 local252 = this.aClass102_Sub1_3.method21249(local135 / 2);
			local252.method29383(0, local135, this.aClass102_Sub1_3.aLong168);
			this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
			this.aClass102_Sub1_3.method21251(local252);
			local161.method9392(Class487.aClass487_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class80_Sub24 local293;
			@Pc(411) Class227 local411;
			if ((this.anInt401 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 != 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							local161.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) this.aClass102_Sub1_3.anInt3002 + (float) (local293.aClass229_3.anInt3686 * -1722392473) / 255.0F * (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass456_5.method29342(1.0F / (float) (local293.aClass229_3.anInt3685 * -692202347));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local399 = !Class58.method15723(local411.aByte110, (byte) 1);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						local161.method9410(local399);
						local280 += local293.anInt1625;
					}
				}
			} else {
				local161.aClass463_17.method29477(this.aClass102_Sub1_3.aFloatArray68[0], this.aClass102_Sub1_3.aFloatArray68[1], this.aClass102_Sub1_3.aFloatArray68[2]);
				local161.aClass463_22.method29477(this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat214 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_16.method29477(-this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat208, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat209, -this.aClass102_Sub1_3.aFloat216 * this.aClass102_Sub1_3.aFloat210);
				local161.aClass463_21.method29477(this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat208, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat209, this.aClass102_Sub1_3.aFloat212 * this.aClass102_Sub1_3.aFloat210);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass80Array3.length; local282++) {
					local293 = (Class80_Sub24) this.aClass80Array3[local282];
					if (local293.anInt1625 > 0) {
						if (this.aClass102_Sub1_3.aBoolean524) {
							this.aClass102_Sub1_3.method20868(0, local293.aClass229_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass456_5.method29337(0.0F, 1.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613), 0.0F, 256.0F / ((float) (local293.aClass229_3.anInt3685 * -692202347) * local613));
							local161.aClass463_20.method29477((float) (local293.aClass229_3.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass229_3.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1623 == -1) {
							local161.anInterface34_8 = this.aClass102_Sub1_3.anInterface34_23;
						} else {
							local411 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
							local693 = local411.aByte110;
							local161.anInterface34_8 = this.aClass102_Sub1_3.aClass395_3.method28692(local411);
							local161.method9393(local411.aByte116);
						}
						this.aClass102_Sub1_3.method21250(1, local293.anInterface38_11);
						this.aClass102_Sub1_3.method21158(this.aClass135_1);
						local161.aClass487_35.method30070(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt1107 = local293.anInt1622;
						local161.anInt1108 = local293.anInt1626 - local293.anInt1622 + 1;
						local161.anInt1105 = local280;
						local161.anInt1109 = local293.anInt1625 / 3;
						switch(local693) {
							case 1:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9399();
								} else {
									local161.method9404(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass102_Sub1_3.aBoolean518 || (this.anInt401 & 0x8) == 0 || !this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6.method20201(-537836288)) {
									local161.method9396(0);
								} else {
									@Pc(825) Class131_Sub1_Sub1 local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_6;
									if (local693 == 2) {
										local825 = this.aClass102_Sub1_3.aClass131_Sub1_Sub1_5;
									}
									local825.aClass487_69.method30075(this.aClass102_Sub1_3.aClass487_78);
									local825.aClass487_70.method30070(1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F / (local293.aFloat143 * (float) (local293.aClass229_3.anInt3684 * -948215751)), 1.0F, 1.0F);
									local825.aClass463_56.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
									@Pc(894) Class227 local894 = this.aClass102_Sub1_3.aClass235_6.method26120(local293.anInt1623, 73831368);
									local825.anInt2848 = local894.aByte116 * -597401913;
									local825.anInt2849 = local293.anInt1622 * -1508861345;
									local825.anInt2850 = (local293.anInt1626 - local293.anInt1622 + 1) * 1215506291;
									local825.anInt2851 = local280 * 97998367;
									local825.anInt2852 = local293.anInt1625 / 3 * -572150419;
									local825.aClass456_15.method29338(local161.aClass456_5);
									local825.aClass463_57.method29478(local161.aClass463_20);
									local825.aClass456_16.method29338(local161.aClass456_6);
									local825.aClass463_58.method29478(local161.aClass463_19);
									local825.method20200(-1605832217);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass102_Sub1_3.aBoolean524) {
									local161.method9394();
								} else {
									local161.method9396(0);
								}
								break;
							case 6:
								local161.method9410(!Class58.method15723(local693, (byte) 1));
								break;
							case 7:
								local161.aClass463_18.method29477(this.aClass102_Sub1_3.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_3.aClass487_76.aFloatArray114[14]);
								local161.aClass487_36.method30139();
								local161.anInterface42_3 = this.aClass102_Sub1_3.method21170();
								local161.method9409(0);
						}
						local280 += local293.anInt1625;
					}
				}
			}
		}
		if (!this.aClass8_5.method240(-784576665)) {
			this.aClass102_Sub1_3.method21235(128);
			this.aClass102_Sub1_3.method21191(false);
			@Pc(1036) Class463 local1036 = new Class463(local161.aClass463_19);
			local161.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass8_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class80_Sub14 local1053 = (Class80_Sub14) local1046.next();
				local1053.method14027(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass463_19.method29478(local1036);
		}
		if (this.aClass406_1 == null) {
			return;
		}
		this.aClass102_Sub1_3.method21235(1);
		this.aClass102_Sub1_3.method21250(0, this.anInterface38_2);
		this.aClass102_Sub1_3.method21250(1, this.anInterface38_1);
		this.aClass102_Sub1_3.method21158(this.aClass135_1);
		@Pc(1094) Class487 local1094 = this.aClass102_Sub1_3.aClass487_80;
		local1094.method30139();
		local1094.aFloatArray114[13] = -1.0F;
		local161.method9392(local1094);
		this.aClass406_1.method28918(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aes", name = "al", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2942(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_5.method232(new Class80_Sub14(this.aClass102_Sub1_3, this, arg0, arg1), 1072393515);
	}

	@OriginalMember(owner = "client!aes", name = "ah", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2945(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			return this.aClass406_1.method28916(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aes", name = "am", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2947(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28919(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "ak", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2940(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28919(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "e", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2938(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aes", name = "as", descriptor = "()V")
	void method2698() {
		this.anInterface38_1 = this.aClass102_Sub1_3.method21239(false);
		this.anInterface38_1.method29327(this.anInt396 * 4, 4);
		this.anInterface38_1.method29383(0, this.anInt396 * 4, this.aClass102_Sub1_3.method21141(this.aByteBuffer1));
		this.anInterface38_2 = this.aClass102_Sub1_3.method21239(false);
		this.anInterface38_2.method29327(this.anInt396 * this.anInt391, this.anInt391);
		this.anInterface38_2.method29383(0, this.anInt396 * this.anInt391, this.aClass102_Sub1_3.method21141(this.aByteBuffer2));
		this.aByteBuffer1.clear();
		this.aByteBuffer1 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt401 & 0x7) == 0) {
			if (this.anIntArrayArrayArray6 == null) {
				this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1 }), new Class397(Class400.aClass400_3) });
			} else {
				this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_4 }), new Class397(Class400.aClass400_3) });
			}
		} else if (this.anIntArrayArrayArray6 == null) {
			this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_2 }), new Class397(Class400.aClass400_3) });
		} else {
			this.aClass135_1 = this.aClass102_Sub1_3.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_4, Class400.aClass400_2 }), new Class397(Class400.aClass400_3) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt395; local226++) {
			@Pc(236) Class80_Sub24 local236 = (Class80_Sub24) this.aClass80Array2[local226];
			local236.method14260(this.anInt396);
		}
		if (this.aClass406_1 != null) {
			this.aClass406_1.method28927();
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aes", name = "aw", descriptor = "()V")
	void method2699() {
		if ((this.anInt400 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass80_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray6 = null;
		this.aClass24_4 = null;
		this.aClass80Array2 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!aes", name = "bg", descriptor = "()V")
	void method2700() {
		if ((this.anInt400 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass80_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray6 = null;
		this.aClass24_4 = null;
		this.aClass80Array2 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!aes", name = "bl", descriptor = "()V")
	void method2701() {
		if ((this.anInt400 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass80_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray6 = null;
		this.aClass24_4 = null;
		this.aClass80Array2 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!aes", name = "br", descriptor = "(II[[B[Lclient!akn;Lclient!aax;[Lclient!akn;)V")
	void method2702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class80_Sub24[] arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) Class80_Sub24[] arg5) {
		if (this.anIntArrayArrayArray2[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class80_Sub24[] local14 = this.aClass80_Sub24ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray4[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray1[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray3[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray2[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray1[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray2[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray3[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray1[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray2[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray3[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray1[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray2[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray3[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray1[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray2[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray3[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class80_Sub24 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt448 * -1548585779 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt445 * -615169581) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt445 * -615169581) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt394;
			@Pc(304) int local304 = local294 >> this.anInt394;
			@Pc(308) int local308 = local42[local268];
			@Pc(312) int local312 = local35[local268];
			@Pc(320) int local320 = local54 == null ? 0 : local54[local268];
			@Pc(338) long local338 = (long) local312 << 48 | (long) local308 << 32 | (long) (local299 << 16) | (long) local304;
			@Pc(342) int local342 = local21[local268];
			@Pc(346) int local346 = local28[local268];
			@Pc(348) byte local348 = 74;
			@Pc(350) int local350 = 0;
			@Pc(352) float local352 = 1.0F;
			@Pc(358) float local358;
			@Pc(360) float local360;
			@Pc(362) float local362;
			@Pc(462) float local462;
			@Pc(366) int local366;
			if (local342 == 0 && local346 == 0) {
				local358 = local77;
				local360 = local84;
				local362 = local91;
				local366 = local348 - local186;
			} else if (local342 == 0 && local346 == this.anInt447 * -1174710433) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt447 * -1174710433 && local346 == this.anInt447 * -1174710433) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt447 * -1174710433 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt447 * -1174710433);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt447 * -1174710433);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt445 * -615169581);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt445 * -615169581);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt445 * -615169581));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class522.anIntArray467[local308 & 0xFF80 | local570];
				if ((this.anInt401 & 0x7) == 0) {
					local352 = this.aClass102_Sub1_3.aFloatArray68[0] * local358 + this.aClass102_Sub1_3.aFloatArray68[1] * local360 + this.aClass102_Sub1_3.aFloatArray68[2] * local362;
					local352 = this.aClass102_Sub1_3.aFloat212 + local352 * (local352 > 0.0F ? this.aClass102_Sub1_3.aFloat214 : this.aClass102_Sub1_3.aFloat216);
				}
			}
			@Pc(638) Class80 local638 = null;
			if ((local283 & this.anInt402 - 1) == 0 && (local294 & this.anInt402 - 1) == 0) {
				local638 = arg4.method560(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class522.anIntArray467[local312 & 0xFF80 | local669];
					if ((this.anInt401 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass102_Sub1_3.aFloatArray68[0] * local358 + this.aClass102_Sub1_3.aFloatArray68[1] * local360 + this.aClass102_Sub1_3.aFloatArray68[2] * local362;
						local462 = this.aClass102_Sub1_3.aFloat212 + local352 * (local352 > 0.0F ? this.aClass102_Sub1_3.aFloat214 : this.aClass102_Sub1_3.aFloat216);
						@Pc(741) int local741 = local688 >> 16 & 0xFF;
						@Pc(747) int local747 = local688 >> 8 & 0xFF;
						@Pc(751) int local751 = local688 & 0xFF;
						local741 = (int) ((float) local741 * local462);
						if (local741 < 0) {
							local741 = 0;
						} else if (local741 > 255) {
							local741 = 255;
						}
						local747 = (int) ((float) local747 * local462);
						if (local747 < 0) {
							local747 = 0;
						} else if (local747 > 255) {
							local747 = 255;
						}
						local751 = (int) ((float) local751 * local462);
						if (local751 < 0) {
							local751 = 0;
						} else if (local751 > 255) {
							local751 = 255;
						}
						local688 = local741 << 16 | local747 << 8 | local751;
					}
				}
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method2915(local283, local294, (byte) -15) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray6 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt401 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass102_Sub1_3.anInt2973 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer1.putInt(local688 | 0xFF000000);
				local232 = this.anInt396++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method563(new Class80_Sub35(local266[local268]), local338);
			} else {
				local266[local268] = ((Class80_Sub35) local638).aShort53;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong338 * 3209506792906532031L < arg5[local232].aLong338 * 3209506792906532031L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method14272(local232, local350, local366, local352);
			}
			this.anInt393++;
		}
	}

	@OriginalMember(owner = "client!aes", name = "at", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2948(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass406_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub1_3.anInt2981 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub1_3.anInt2982 >> 8) >> this.aClass102_Sub1_3.anInt2980;
			this.aClass406_1.method28919(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aes", name = "ba", descriptor = "(Lclient!atu;II)V")
	void method2703(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray42.length < local16) {
			this.anIntArray42 = new int[local16];
			this.anIntArray43 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray42[local31] = local6[local31] >> this.aClass102_Sub1_3.anInt2980;
			this.anIntArray43[local31] = local13[local31] >> this.aClass102_Sub1_3.anInt2980;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray42[local31];
			@Pc(74) int local74 = this.anIntArray43[local31++];
			@Pc(79) int local79 = this.anIntArray42[local31];
			@Pc(85) int local85 = this.anIntArray43[local31++];
			@Pc(90) int local90 = this.anIntArray42[local31];
			@Pc(96) int local96 = this.anIntArray43[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method24031(local74, local85, local96, local68, local79, local90);
			}
		}
	}
}
