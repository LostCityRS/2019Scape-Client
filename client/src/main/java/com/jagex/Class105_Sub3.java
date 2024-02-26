package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@OriginalClass("client!afw")
public final class Class105_Sub3 extends Class105 {

	@OriginalMember(owner = "client!afw", name = "ct", descriptor = "Lclient!lz;")
	static Class410 aClass410_1;

	@OriginalMember(owner = "client!afw", name = "g", descriptor = "I")
	static final int anInt882 = 7;

	@OriginalMember(owner = "client!afw", name = "l", descriptor = "I")
	static final int anInt892 = 4;

	@OriginalMember(owner = "client!afw", name = "ah", descriptor = "[[I")
	int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!afw", name = "a", descriptor = "S")
	short aShort19;

	@OriginalMember(owner = "client!afw", name = "x", descriptor = "[I")
	int[] anIntArray81;

	@OriginalMember(owner = "client!afw", name = "w", descriptor = "[I")
	int[] anIntArray82;

	@OriginalMember(owner = "client!afw", name = "r", descriptor = "[I")
	int[] anIntArray83;

	@OriginalMember(owner = "client!afw", name = "q", descriptor = "[[I")
	int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!afw", name = "ax", descriptor = "[F")
	float[] aFloatArray28;

	@OriginalMember(owner = "client!afw", name = "p", descriptor = "[S")
	short[] aShortArray27;

	@OriginalMember(owner = "client!afw", name = "v", descriptor = "[S")
	short[] aShortArray28;

	@OriginalMember(owner = "client!afw", name = "ag", descriptor = "[S")
	short[] aShortArray29;

	@OriginalMember(owner = "client!afw", name = "n", descriptor = "[S")
	short[] aShortArray30;

	@OriginalMember(owner = "client!afw", name = "c", descriptor = "[B")
	byte[] aByteArray27;

	@OriginalMember(owner = "client!afw", name = "b", descriptor = "[F")
	float[] aFloatArray29;

	@OriginalMember(owner = "client!afw", name = "z", descriptor = "[S")
	short[] aShortArray31;

	@OriginalMember(owner = "client!afw", name = "ay", descriptor = "Lclient!mu;")
	Class426 aClass426_1;

	@OriginalMember(owner = "client!afw", name = "ao", descriptor = "[S")
	short[] aShortArray32;

	@OriginalMember(owner = "client!afw", name = "bk", descriptor = "[I")
	int[] anIntArray85;

	@OriginalMember(owner = "client!afw", name = "bp", descriptor = "[Lclient!mc;")
	Class414[] aClass414Array1;

	@OriginalMember(owner = "client!afw", name = "bb", descriptor = "[Lclient!lw;")
	Class408[] aClass408Array1;

	@OriginalMember(owner = "client!afw", name = "al", descriptor = "[S")
	short[] aShortArray33;

	@OriginalMember(owner = "client!afw", name = "af", descriptor = "[S")
	short[] aShortArray34;

	@OriginalMember(owner = "client!afw", name = "bn", descriptor = "I")
	int anInt881;

	@OriginalMember(owner = "client!afw", name = "bs", descriptor = "[I")
	int[] anIntArray86;

	@OriginalMember(owner = "client!afw", name = "h", descriptor = "[S")
	short[] aShortArray35;

	@OriginalMember(owner = "client!afw", name = "ar", descriptor = "I")
	int anInt883;

	@OriginalMember(owner = "client!afw", name = "as", descriptor = "I")
	int anInt884;

	@OriginalMember(owner = "client!afw", name = "aw", descriptor = "I")
	int anInt885;

	@OriginalMember(owner = "client!afw", name = "bg", descriptor = "I")
	int anInt886;

	@OriginalMember(owner = "client!afw", name = "bl", descriptor = "I")
	int anInt887;

	@OriginalMember(owner = "client!afw", name = "br", descriptor = "I")
	int anInt888;

	@OriginalMember(owner = "client!afw", name = "ac", descriptor = "[S")
	short[] aShortArray36;

	@OriginalMember(owner = "client!afw", name = "au", descriptor = "I")
	int anInt889;

	@OriginalMember(owner = "client!afw", name = "bt", descriptor = "I")
	int anInt890;

	@OriginalMember(owner = "client!afw", name = "cv", descriptor = "Z")
	boolean aBoolean181;

	@OriginalMember(owner = "client!afw", name = "by", descriptor = "[I")
	int[] anIntArray87;

	@OriginalMember(owner = "client!afw", name = "aj", descriptor = "[B")
	byte[] aByteArray28;

	@OriginalMember(owner = "client!afw", name = "bz", descriptor = "[S")
	short[] aShortArray37;

	@OriginalMember(owner = "client!afw", name = "be", descriptor = "[Lclient!dm;")
	Class228[] aClass228Array3;

	@OriginalMember(owner = "client!afw", name = "bh", descriptor = "[Lclient!cp;")
	Class211[] aClass211Array3;

	@OriginalMember(owner = "client!afw", name = "bv", descriptor = "I")
	int anInt891;

	@OriginalMember(owner = "client!afw", name = "bj", descriptor = "[I")
	int[] anIntArray88;

	@OriginalMember(owner = "client!afw", name = "bo", descriptor = "[[I")
	int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!afw", name = "bc", descriptor = "[J")
	long[] aLongArray9;

	@OriginalMember(owner = "client!afw", name = "ab", descriptor = "[S")
	short[] aShortArray38;

	@OriginalMember(owner = "client!afw", name = "bq", descriptor = "I")
	int anInt893;

	@OriginalMember(owner = "client!afw", name = "bd", descriptor = "I")
	int anInt894;

	@OriginalMember(owner = "client!afw", name = "cd", descriptor = "I")
	int anInt895;

	@OriginalMember(owner = "client!afw", name = "j", descriptor = "S")
	short aShort20;

	@OriginalMember(owner = "client!afw", name = "y", descriptor = "[S")
	short[] aShortArray39;

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "I")
	int anInt876;

	@OriginalMember(owner = "client!afw", name = "k", descriptor = "I")
	int anInt877;

	@OriginalMember(owner = "client!afw", name = "d", descriptor = "I")
	int anInt878;

	@OriginalMember(owner = "client!afw", name = "ai", descriptor = "I")
	int anInt879;

	@OriginalMember(owner = "client!afw", name = "aq", descriptor = "I")
	int anInt880;

	@OriginalMember(owner = "client!afw", name = "an", descriptor = "Z")
	boolean aBoolean179;

	@OriginalMember(owner = "client!afw", name = "aa", descriptor = "Z")
	boolean aBoolean177;

	@OriginalMember(owner = "client!afw", name = "ae", descriptor = "Z")
	boolean aBoolean178;

	@OriginalMember(owner = "client!afw", name = "ap", descriptor = "Z")
	boolean aBoolean176;

	@OriginalMember(owner = "client!afw", name = "az", descriptor = "Z")
	boolean aBoolean180;

	@OriginalMember(owner = "client!afw", name = "ba", descriptor = "Z")
	boolean aBoolean175;

	@OriginalMember(owner = "client!afw", name = "bf", descriptor = "[F")
	float[] aFloatArray30;

	@OriginalMember(owner = "client!afw", name = "bw", descriptor = "[I")
	int[] anIntArray89;

	@OriginalMember(owner = "client!afw", name = "bx", descriptor = "[I")
	int[] anIntArray80;

	@OriginalMember(owner = "client!afw", name = "bi", descriptor = "[I")
	final int[] anIntArray90;

	@OriginalMember(owner = "client!afw", name = "bu", descriptor = "[I")
	final int[] anIntArray91;

	@OriginalMember(owner = "client!afw", name = "bm", descriptor = "[I")
	final int[] anIntArray84;

	@OriginalMember(owner = "client!afw", name = "i", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_5;

	@OriginalMember(owner = "client!afw", name = "m", descriptor = "I")
	int anInt874;

	@OriginalMember(owner = "client!afw", name = "o", descriptor = "I")
	int anInt875;

	@OriginalMember(owner = "client!afw", name = "ak", descriptor = "Lclient!mj;")
	Class418 aClass418_1;

	@OriginalMember(owner = "client!afw", name = "av", descriptor = "Lclient!mj;")
	Class418 aClass418_2;

	@OriginalMember(owner = "client!afw", name = "at", descriptor = "Lclient!mj;")
	Class418 aClass418_4;

	@OriginalMember(owner = "client!afw", name = "ad", descriptor = "Lclient!mj;")
	Class418 aClass418_3;

	@OriginalMember(owner = "client!afw", name = "am", descriptor = "Lclient!ly;")
	Class409 aClass409_1;

	@OriginalMember(owner = "client!afw", name = "hd", descriptor = "([BI)[B")
	static byte[] method7541(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "iw", descriptor = "([SI)[S")
	static short[] method7549(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "hl", descriptor = "([FI)[F")
	static float[] method7566(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "ie", descriptor = "([FI)[F")
	static float[] method7572(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "ib", descriptor = "([BI)[B")
	static byte[] method7579(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "iy", descriptor = "([SI)[S")
	static short[] method7580(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "iv", descriptor = "([FI)[F")
	static float[] method7581(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "hm", descriptor = "([SI)[S")
	static short[] method7609(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "(Lclient!afa;IIZZ)V")
	Class105_Sub3(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt876 = 0;
		this.anInt877 = 0;
		this.anInt878 = 0;
		this.anInt879 = 0;
		this.anInt880 = 0;
		this.aBoolean179 = false;
		this.aBoolean177 = true;
		this.aBoolean178 = false;
		this.aBoolean176 = false;
		this.aBoolean180 = false;
		this.aBoolean175 = false;
		this.aFloatArray30 = new float[2];
		this.anIntArray89 = new int[1];
		this.anIntArray80 = new int[1];
		this.anIntArray90 = new int[8];
		this.anIntArray91 = new int[8];
		this.anIntArray84 = new int[8];
		this.aClass102_Sub1_5 = arg0;
		this.anInt874 = arg1;
		this.anInt875 = arg2;
		this.aBoolean179 = arg4;
		if (arg3 || Class399.method28745(this.anInt874, this.anInt875)) {
			this.aClass418_1 = new Class418(Class399.method28750(this.anInt874, this.anInt875));
		}
		if (arg3 || Class399.method28748(this.anInt874, this.anInt875)) {
			this.aClass418_2 = new Class418(Class399.method28753(this.anInt874, this.anInt875));
		}
		if (arg3 || Class399.method28758(this.anInt874, this.anInt875)) {
			this.aClass418_4 = new Class418(Class399.method28752(this.anInt874, this.anInt875));
		}
		if (arg3 || Class399.method28804(this.anInt874, this.anInt875)) {
			this.aClass418_3 = new Class418(Class399.method28751(this.anInt874, this.anInt875));
		}
		if (arg3 || Class399.method28749(this.anInt874, this.anInt875)) {
			this.aClass409_1 = new Class409(Class399.method28754(this.anInt874, this.anInt875));
		}
		if (arg3 && arg4) {
			this.aClass418_1.anInterface38_22 = this.aClass418_1.anInterface38_21 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			this.aClass418_2.anInterface38_22 = this.aClass418_2.anInterface38_21 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			this.aClass418_4.anInterface38_22 = this.aClass418_4.anInterface38_21 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			this.aClass418_3.anInterface38_22 = this.aClass418_3.anInterface38_21 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
		}
	}

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "(Lclient!afa;Lclient!dt;IIII)V")
	Class105_Sub3(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(9) Class235 local9 = arg0.aClass235_6;
		@Pc(12) Interface46 local12 = arg0.anInterface46_6;
		@Pc(16) int[] local16 = new int[arg1.anInt3780];
		this.anIntArray85 = new int[arg1.anInt3783 + 1];
		for (@Pc(25) int local25 = 0; local25 < arg1.anInt3780; local25++) {
			if (arg1.aByteArray70 == null || arg1.aByteArray70[local25] != 2) {
				if (arg1.aShortArray89 != null && arg1.aShortArray89[local25] != -1) {
					@Pc(58) Class227 local58 = local9.method26120(arg1.aShortArray89[local25] & 0xFFFF, 73831368);
					if (((this.anInt875 & 0x40) == 0 || !local58.aBoolean758) && local58.aBoolean752) {
						continue;
					}
				}
				local16[this.anInt879++] = local25;
				this.anIntArray85[arg1.aShortArray91[local25]]++;
				this.anIntArray85[arg1.aShortArray92[local25]]++;
				this.anIntArray85[arg1.aShortArray93[local25]]++;
			}
		}
		this.anInt880 = this.anInt879;
		@Pc(123) long[] local123 = new long[this.anInt879];
		@Pc(132) boolean local132 = (this.anInt874 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(159) int local159;
		@Pc(378) int local378;
		@Pc(279) short local279;
		for (@Pc(134) int local134 = 0; local134 < this.anInt879; local134++) {
			local142 = local16[local134];
			@Pc(144) Class227 local144 = null;
			local146 = 0;
			@Pc(148) byte local148 = 0;
			@Pc(150) byte local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(157) boolean local157;
			if (arg1.aClass226Array1 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass226Array1.length; local159++) {
					@Pc(169) Class226 local169 = arg1.aClass226Array1[local159];
					if (local142 == local169.anInt3627 * -684337005) {
						@Pc(183) Class435 local183 = local12.method29234(local169.anInt3625 * 1644904431, (byte) 0);
						if (local183.aBoolean862) {
							local157 = true;
						}
						if (local183.anInt4797 * -625133767 != -1) {
							@Pc(202) Class227 local202 = local9.method26120(local183.anInt4797 * -625133767, 73831368);
							if (local202.aClass608_2 == Class608.aClass608_4) {
								this.aBoolean178 = true;
							}
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt880--;
					continue;
				}
			}
			if (arg1.aClass228Array4 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass228Array4.length; local159++) {
					@Pc(241) Class228 local241 = arg1.aClass228Array4[local159];
					if (local142 == local241.anInt3671 * -2114351293) {
						@Pc(257) Class441 local257 = this.aClass102_Sub1_5.anInterface47_6.method29270(local241.anInt3681 * -1343861311, -1681407132);
						if (local257.aBoolean872) {
							local157 = true;
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt880--;
					continue;
				}
			}
			local279 = -1;
			if (arg1.aShortArray89 != null) {
				local279 = arg1.aShortArray89[local142];
				if (local279 != -1) {
					local144 = local9.method26120(local279 & 0xFFFF, 73831368);
					if ((this.anInt875 & 0x40) != 0 && local144.aBoolean758) {
						local279 = -1;
						local144 = null;
					} else {
						local150 = local144.aByte110;
						local152 = local144.aByte116;
					}
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray72 != null && arg1.aByteArray72[local142] != 0 || local144 != null && local144.aClass608_2 != Class608.aClass608_5;
			if ((local132 || local334) && arg1.aByteArray71 != null) {
				local146 += arg1.aByteArray71[local142] << 17;
			}
			if (local334) {
				local146 += 65536;
			}
			local146 += (local150 & 0xFF) << 8;
			local146 += local152 & 0xFF;
			local378 = local148 + ((local279 & 0xFFFF) << 16);
			@Pc(384) int local384 = local378 + (local134 & 0xFFFF);
			local123[local134] = ((long) local146 << 32) + (long) local384;
			this.aBoolean178 |= local334;
			this.aBoolean176 |= local144 != null && (local144.aFloat263 != 0.0F || local144.aFloat264 != 0.0F);
		}
		Class26.method596(local123, local16, 954505806);
		this.anInt876 = arg1.anInt3777;
		this.anInt877 = arg1.anInt3783;
		this.anIntArray81 = arg1.anIntArray340;
		this.anIntArray82 = arg1.anIntArray341;
		this.anIntArray83 = arg1.anIntArray343;
		this.aShortArray35 = arg1.aShortArray90;
		@Pc(454) Class424[] local454 = new Class424[this.anInt877];
		this.aClass228Array3 = arg1.aClass228Array4;
		this.aClass211Array3 = arg1.aClass211Array4;
		@Pc(503) int local503;
		if (arg1.aClass226Array1 != null) {
			this.anInt891 = arg1.aClass226Array1.length;
			this.aClass414Array1 = new Class414[this.anInt891];
			this.aClass408Array1 = new Class408[this.anInt891];
			for (local142 = 0; local142 < this.anInt891; local142++) {
				@Pc(491) Class226 local491 = arg1.aClass226Array1[local142];
				@Pc(499) Class435 local499 = local12.method29234(local491.anInt3625 * 1644904431, (byte) 0);
				local378 = -1;
				for (local503 = 0; local503 < this.anInt879; local503++) {
					if (local16[local503] == local491.anInt3627 * -684337005) {
						local378 = local503;
						break;
					}
				}
				if (local378 == -1) {
					throw new RuntimeException();
				}
				local503 = Class687.anIntArray524[arg1.aShortArray95[local491.anInt3627 * -684337005] & 0xFFFF] & 0xFFFFFF;
				local503 |= 255 - (arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local491.anInt3627 * -684337005]) << 24;
				this.aClass414Array1[local142] = new Class414(local378, arg1.aShortArray91[local491.anInt3627 * -684337005], arg1.aShortArray92[local491.anInt3627 * -684337005], arg1.aShortArray93[local491.anInt3627 * -684337005], local499.anInt4796 * 1978348109, local499.anInt4799 * -1648049355, local499.anInt4797 * -625133767, local499.anInt4800 * -941598353, local499.anInt4801 * -658617737, local499.aBoolean862, local499.aBoolean863, local491.anInt3626 * 532802315);
				this.aClass408Array1[local142] = new Class408(local503);
			}
		}
		local142 = this.anInt879 * 3;
		this.aShortArray31 = new short[local142];
		this.aShortArray27 = new short[local142];
		this.aShortArray28 = new short[local142];
		this.aShortArray39 = new short[local142];
		this.aShortArray30 = new short[local142];
		this.aByteArray27 = new byte[local142];
		this.aFloatArray29 = new float[local142];
		this.aFloatArray28 = new float[local142];
		this.aShortArray32 = new short[this.anInt879];
		this.aByteArray28 = new byte[this.anInt879];
		this.aShortArray36 = new short[this.anInt879];
		this.aShortArray29 = new short[this.anInt879];
		this.aShortArray38 = new short[this.anInt879];
		this.aShortArray33 = new short[this.anInt879];
		if (arg1.aShortArray98 != null) {
			this.aShortArray34 = new short[this.anInt879];
		}
		this.aShort20 = (short) arg3;
		this.aShort19 = (short) arg4;
		this.aShortArray37 = new short[local142];
		this.aLongArray9 = new long[local142];
		@Pc(720) int local720 = 0;
		for (local146 = 0; local146 < arg1.anInt3783; local146++) {
			local378 = this.anIntArray85[local146];
			this.anIntArray85[local146] = local720;
			local720 += local378;
			local454[local146] = new Class424();
		}
		this.anIntArray85[arg1.anInt3783] = local720;
		@Pc(761) Class247 local761 = this.method7322(arg1, local16, this.anInt879);
		@Pc(765) Class416[] local765 = new Class416[arg1.anInt3780];
		@Pc(776) short local776;
		@Pc(786) short local786;
		@Pc(796) int local796;
		@Pc(816) int local816;
		for (local503 = 0; local503 < arg1.anInt3780; local503++) {
			local776 = arg1.aShortArray91[local503];
			local279 = arg1.aShortArray92[local503];
			local786 = arg1.aShortArray93[local503];
			local796 = this.anIntArray81[local279] - this.anIntArray81[local776];
			@Pc(806) int local806 = this.anIntArray82[local279] - this.anIntArray82[local776];
			local816 = this.anIntArray83[local279] - this.anIntArray83[local776];
			@Pc(826) int local826 = this.anIntArray81[local786] - this.anIntArray81[local776];
			@Pc(836) int local836 = this.anIntArray82[local786] - this.anIntArray82[local776];
			@Pc(846) int local846 = this.anIntArray83[local786] - this.anIntArray83[local776];
			@Pc(854) int local854 = local806 * local846 - local836 * local816;
			@Pc(862) int local862 = local816 * local826 - local846 * local796;
			@Pc(870) int local870;
			for (local870 = local796 * local836 - local826 * local806; local854 > 8192 || local862 > 8192 || local870 > 8192 || local854 < -8192 || local862 < -8192 || local870 < -8192; local870 >>= 0x1) {
				local854 >>= 0x1;
				local862 >>= 0x1;
			}
			@Pc(916) int local916 = (int) Math.sqrt((double) (local854 * local854 + local862 * local862 + local870 * local870));
			if (local916 <= 0) {
				local916 = 1;
			}
			local854 = local854 * 256 / local916;
			local862 = local862 * 256 / local916;
			local870 = local870 * 256 / local916;
			@Pc(948) byte local948 = arg1.aByteArray70 == null ? 0 : arg1.aByteArray70[local503];
			if (local948 == 0) {
				@Pc(954) Class424 local954 = local454[local776];
				local954.anInt4635 += local854;
				local954.anInt4633 += local862;
				local954.anInt4632 += local870;
				local954.anInt4634++;
				@Pc(982) Class424 local982 = local454[local279];
				local982.anInt4635 += local854;
				local982.anInt4633 += local862;
				local982.anInt4632 += local870;
				local982.anInt4634++;
				@Pc(1010) Class424 local1010 = local454[local786];
				local1010.anInt4635 += local854;
				local1010.anInt4633 += local862;
				local1010.anInt4632 += local870;
				local1010.anInt4634++;
			} else if (local948 == 1) {
				@Pc(1046) Class416 local1046 = local765[local503] = new Class416();
				local1046.anInt4623 = local854;
				local1046.anInt4624 = local862;
				local1046.anInt4622 = local870;
			}
		}
		@Pc(1074) int local1074;
		for (local503 = 0; local503 < this.anInt879; local503++) {
			@Pc(1067) int local1067 = local16[local503];
			local1074 = arg1.aShortArray95[local1067] & 0xFFFF;
			local159 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local1067] & 0xFF;
			@Pc(1096) short local1096 = arg1.aShortArray89 == null ? -1 : arg1.aShortArray89[local1067];
			if (local1096 != -1 && (this.anInt875 & 0x40) != 0 && local9.method26120(local1096, 73831368).aBoolean758) {
				local1096 = -1;
			}
			@Pc(1114) float local1114 = 0.0F;
			@Pc(1116) float local1116 = 0.0F;
			@Pc(1118) float local1118 = 0.0F;
			@Pc(1120) float local1120 = 0.0F;
			@Pc(1122) float local1122 = 0.0F;
			@Pc(1124) float local1124 = 0.0F;
			@Pc(1275) short local1275;
			@Pc(1174) long local1174;
			@Pc(1187) long local1187;
			@Pc(1200) long local1200;
			if (local1096 == -1) {
				local1200 = 0L;
				local1187 = 0L;
				local1174 = 0L;
			} else {
				@Pc(1137) short local1137 = arg1.aShortArray94 == null ? -1 : arg1.aShortArray94[local1067];
				@Pc(1147) int local1147;
				if (local1137 == 32766) {
					local1147 = arg1.aByteArray68[local1067] & 0xFF;
					@Pc(1154) int local1154 = arg1.aByteArray69[local1067] & 0xFF;
					@Pc(1161) int local1161 = arg1.aByteArray73[local1067] & 0xFF;
					@Pc(1171) int local1171 = local1147 + arg1.anIntArray342[arg1.aShortArray91[local1067]];
					local1174 = local1171;
					@Pc(1184) int local1184 = local1154 + arg1.anIntArray342[arg1.aShortArray92[local1067]];
					local1187 = local1171;
					@Pc(1197) int local1197 = local1161 + arg1.anIntArray342[arg1.aShortArray93[local1067]];
					local1200 = local1171;
					local1114 = arg1.aFloatArray100[local1171];
					local1116 = arg1.aFloatArray101[local1171];
					local1118 = arg1.aFloatArray100[local1184];
					local1120 = arg1.aFloatArray101[local1184];
					local1122 = arg1.aFloatArray100[local1197];
					local1124 = arg1.aFloatArray101[local1197];
				} else if (local1137 == -1) {
					local1114 = 0.0F;
					local1116 = 1.0F;
					local1174 = 65535L;
					local1118 = 1.0F;
					local1120 = 1.0F;
					local1187 = 131071L;
					local1122 = 0.0F;
					local1124 = 0.0F;
					local1200 = 196607L;
				} else {
					@Pc(1257) int local1257 = local1137 & 0xFFFF;
					local1147 = 0;
					@Pc(1261) byte local1261 = 0;
					@Pc(1263) byte local1263 = 0;
					@Pc(1268) byte local1268 = arg1.aByteArray74[local1257];
					@Pc(1280) short local1280;
					@Pc(1285) short local1285;
					@Pc(1318) float local1318;
					@Pc(1326) float local1326;
					@Pc(1334) float local1334;
					@Pc(1414) float local1414;
					@Pc(1422) float local1422;
					@Pc(1430) float local1430;
					@Pc(1438) float local1438;
					@Pc(1446) float local1446;
					@Pc(1454) float local1454;
					if (local1268 == 0) {
						local1275 = arg1.aShortArray91[local1067];
						local1280 = arg1.aShortArray92[local1067];
						local1285 = arg1.aShortArray93[local1067];
						@Pc(1290) short local1290 = arg1.aShortArray96[local1257];
						@Pc(1295) short local1295 = arg1.aShortArray88[local1257];
						@Pc(1300) short local1300 = arg1.aShortArray97[local1257];
						@Pc(1306) float local1306 = (float) arg1.anIntArray340[local1290];
						@Pc(1312) float local1312 = (float) arg1.anIntArray341[local1290];
						local1318 = arg1.anIntArray343[local1290];
						local1326 = (float) arg1.anIntArray340[local1295] - local1306;
						local1334 = (float) arg1.anIntArray341[local1295] - local1312;
						@Pc(1342) float local1342 = (float) arg1.anIntArray343[local1295] - local1318;
						@Pc(1350) float local1350 = (float) arg1.anIntArray340[local1300] - local1306;
						@Pc(1358) float local1358 = (float) arg1.anIntArray341[local1300] - local1312;
						@Pc(1366) float local1366 = (float) arg1.anIntArray343[local1300] - local1318;
						@Pc(1374) float local1374 = (float) arg1.anIntArray340[local1275] - local1306;
						@Pc(1382) float local1382 = (float) arg1.anIntArray341[local1275] - local1312;
						@Pc(1390) float local1390 = (float) arg1.anIntArray343[local1275] - local1318;
						@Pc(1398) float local1398 = (float) arg1.anIntArray340[local1280] - local1306;
						@Pc(1406) float local1406 = (float) arg1.anIntArray341[local1280] - local1312;
						local1414 = (float) arg1.anIntArray343[local1280] - local1318;
						local1422 = (float) arg1.anIntArray340[local1285] - local1306;
						local1430 = (float) arg1.anIntArray341[local1285] - local1312;
						local1438 = (float) arg1.anIntArray343[local1285] - local1318;
						local1446 = local1334 * local1366 - local1342 * local1358;
						local1454 = local1342 * local1350 - local1326 * local1366;
						@Pc(1462) float local1462 = local1326 * local1358 - local1334 * local1350;
						@Pc(1470) float local1470 = local1358 * local1462 - local1366 * local1454;
						@Pc(1478) float local1478 = local1366 * local1446 - local1350 * local1462;
						@Pc(1486) float local1486 = local1350 * local1454 - local1358 * local1446;
						@Pc(1500) float local1500 = 1.0F / (local1470 * local1326 + local1478 * local1334 + local1486 * local1342);
						local1114 = (local1470 * local1374 + local1478 * local1382 + local1486 * local1390) * local1500;
						local1118 = (local1470 * local1398 + local1478 * local1406 + local1486 * local1414) * local1500;
						local1122 = (local1470 * local1422 + local1478 * local1430 + local1486 * local1438) * local1500;
						@Pc(1550) float local1550 = local1334 * local1462 - local1342 * local1454;
						@Pc(1558) float local1558 = local1342 * local1446 - local1326 * local1462;
						@Pc(1566) float local1566 = local1326 * local1454 - local1334 * local1446;
						@Pc(1580) float local1580 = 1.0F / (local1550 * local1350 + local1558 * local1358 + local1566 * local1366);
						local1116 = (local1550 * local1374 + local1558 * local1382 + local1566 * local1390) * local1580;
						local1120 = (local1550 * local1398 + local1558 * local1406 + local1566 * local1414) * local1580;
						local1124 = (local1550 * local1422 + local1558 * local1430 + local1566 * local1438) * local1580;
					} else {
						local1275 = arg1.aShortArray91[local1067];
						local1280 = arg1.aShortArray92[local1067];
						local1285 = arg1.aShortArray93[local1067];
						@Pc(1643) int local1643 = local761.anIntArray358[local1257];
						@Pc(1648) int local1648 = local761.anIntArray357[local1257];
						@Pc(1653) int local1653 = local761.anIntArray359[local1257];
						@Pc(1658) float[] local1658 = local761.aFloatArrayArray24[local1257];
						@Pc(1663) byte local1663 = arg1.aByteArray76[local1257];
						local1318 = (float) arg1.anIntArray346[local1257] / 256.0F;
						if (local1268 == 1) {
							local1326 = (float) arg1.anIntArray348[local1257] / 1024.0F;
							method7319(arg1.anIntArray340[local1275], arg1.anIntArray341[local1275], arg1.anIntArray343[local1275], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray30);
							local1114 = this.aFloatArray30[0];
							local1116 = this.aFloatArray30[1];
							method7319(arg1.anIntArray340[local1280], arg1.anIntArray341[local1280], arg1.anIntArray343[local1280], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray30);
							local1118 = this.aFloatArray30[0];
							local1120 = this.aFloatArray30[1];
							method7319(arg1.anIntArray340[local1285], arg1.anIntArray341[local1285], arg1.anIntArray343[local1285], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray30);
							local1122 = this.aFloatArray30[0];
							local1124 = this.aFloatArray30[1];
							local1334 = local1326 / 2.0F;
							if ((local1663 & 0x1) == 0) {
								if (local1118 - local1114 > local1334) {
									local1118 -= local1326;
									local1261 = 1;
								} else if (local1114 - local1118 > local1334) {
									local1118 += local1326;
									local1261 = 2;
								}
								if (local1122 - local1114 > local1334) {
									local1122 -= local1326;
									local1263 = 1;
								} else if (local1114 - local1122 > local1334) {
									local1122 += local1326;
									local1263 = 2;
								}
							} else {
								if (local1120 - local1116 > local1334) {
									local1120 -= local1326;
									local1261 = 1;
								} else if (local1116 - local1120 > local1334) {
									local1120 += local1326;
									local1261 = 2;
								}
								if (local1124 - local1116 > local1334) {
									local1124 -= local1326;
									local1263 = 1;
								} else if (local1116 - local1124 > local1334) {
									local1124 += local1326;
									local1263 = 2;
								}
							}
						} else if (local1268 == 2) {
							local1326 = (float) arg1.anIntArray349[local1257] / 256.0F;
							local1334 = (float) arg1.anIntArray350[local1257] / 256.0F;
							@Pc(1917) int local1917 = arg1.anIntArray340[local1280] - arg1.anIntArray340[local1275];
							@Pc(1927) int local1927 = arg1.anIntArray341[local1280] - arg1.anIntArray341[local1275];
							@Pc(1937) int local1937 = arg1.anIntArray343[local1280] - arg1.anIntArray343[local1275];
							@Pc(1947) int local1947 = arg1.anIntArray340[local1285] - arg1.anIntArray340[local1275];
							@Pc(1957) int local1957 = arg1.anIntArray341[local1285] - arg1.anIntArray341[local1275];
							@Pc(1967) int local1967 = arg1.anIntArray343[local1285] - arg1.anIntArray343[local1275];
							@Pc(1975) int local1975 = local1927 * local1967 - local1957 * local1937;
							@Pc(1983) int local1983 = local1937 * local1947 - local1967 * local1917;
							@Pc(1991) int local1991 = local1917 * local1957 - local1947 * local1927;
							local1414 = 64.0F / (float) arg1.anIntArray339[local1257];
							local1422 = 64.0F / (float) arg1.anIntArray344[local1257];
							local1430 = 64.0F / (float) arg1.anIntArray348[local1257];
							local1438 = ((float) local1975 * local1658[0] + (float) local1983 * local1658[1] + (float) local1991 * local1658[2]) / local1414;
							local1446 = ((float) local1975 * local1658[3] + (float) local1983 * local1658[4] + (float) local1991 * local1658[5]) / local1422;
							local1454 = ((float) local1975 * local1658[6] + (float) local1983 * local1658[7] + (float) local1991 * local1658[8]) / local1430;
							local1147 = method7320(local1438, local1446, local1454);
							method7321(arg1.anIntArray340[local1275], arg1.anIntArray341[local1275], arg1.anIntArray343[local1275], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray30);
							local1114 = this.aFloatArray30[0];
							local1116 = this.aFloatArray30[1];
							method7321(arg1.anIntArray340[local1280], arg1.anIntArray341[local1280], arg1.anIntArray343[local1280], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray30);
							local1118 = this.aFloatArray30[0];
							local1120 = this.aFloatArray30[1];
							method7321(arg1.anIntArray340[local1285], arg1.anIntArray341[local1285], arg1.anIntArray343[local1285], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray30);
							local1122 = this.aFloatArray30[0];
							local1124 = this.aFloatArray30[1];
						} else if (local1268 == 3) {
							method7363(arg1.anIntArray340[local1275], arg1.anIntArray341[local1275], arg1.anIntArray343[local1275], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray30);
							local1114 = this.aFloatArray30[0];
							local1116 = this.aFloatArray30[1];
							method7363(arg1.anIntArray340[local1280], arg1.anIntArray341[local1280], arg1.anIntArray343[local1280], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray30);
							local1118 = this.aFloatArray30[0];
							local1120 = this.aFloatArray30[1];
							method7363(arg1.anIntArray340[local1285], arg1.anIntArray341[local1285], arg1.anIntArray343[local1285], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray30);
							local1122 = this.aFloatArray30[0];
							local1124 = this.aFloatArray30[1];
							if ((local1663 & 0x1) == 0) {
								if (local1118 - local1114 > 0.5F) {
									local1118--;
									local1261 = 1;
								} else if (local1114 - local1118 > 0.5F) {
									local1118++;
									local1261 = 2;
								}
								if (local1122 - local1114 > 0.5F) {
									local1122--;
									local1263 = 1;
								} else if (local1114 - local1122 > 0.5F) {
									local1122++;
									local1263 = 2;
								}
							} else {
								if (local1120 - local1116 > 0.5F) {
									local1120--;
									local1261 = 1;
								} else if (local1116 - local1120 > 0.5F) {
									local1120++;
									local1261 = 2;
								}
								if (local1124 - local1116 > 0.5F) {
									local1124--;
									local1263 = 1;
								} else if (local1116 - local1124 > 0.5F) {
									local1124++;
									local1263 = 2;
								}
							}
						}
					}
					local1174 = local1147 << 16 | local1257;
					local1187 = (long) (local1261 << 19) | local1174;
					local1200 = (long) (local1263 << 19) | local1174;
				}
			}
			@Pc(2431) byte local2431 = arg1.aByteArray70 == null ? 0 : arg1.aByteArray70[local1067];
			if (local2431 == 0) {
				@Pc(2440) long local2440 = (long) ((local1074 << 8) + local159);
				@Pc(2445) short local2445 = arg1.aShortArray91[local1067];
				@Pc(2450) short local2450 = arg1.aShortArray92[local1067];
				local1275 = arg1.aShortArray93[local1067];
				@Pc(2459) Class424 local2459 = local454[local2445];
				this.aShortArray36[local503] = this.method7540(arg1, local2445, local503, local2440 | local1174 << 24, local2459.anInt4635, local2459.anInt4633, local2459.anInt4632, local2459.anInt4634, local1114, local1116);
				@Pc(2487) Class424 local2487 = local454[local2450];
				this.aShortArray29[local503] = this.method7540(arg1, local2450, local503, local2440 | local1187 << 24, local2487.anInt4635, local2487.anInt4633, local2487.anInt4632, local2487.anInt4634, local1118, local1120);
				@Pc(2515) Class424 local2515 = local454[local1275];
				this.aShortArray38[local503] = this.method7540(arg1, local1275, local503, local2440 | local1200 << 24, local2515.anInt4635, local2515.anInt4633, local2515.anInt4632, local2515.anInt4634, local1122, local1124);
			} else if (local2431 == 1) {
				@Pc(2547) Class416 local2547 = local765[local1067];
				@Pc(2579) long local2579 = ((long) (local2547.anInt4623 & Integer.MIN_VALUE) << 9) + ((long) (local2547.anInt4624 + 256) << 32) + ((long) (local2547.anInt4622 + 256) << 24) + (long) (local1074 << 8) + (long) local159;
				this.aShortArray36[local503] = this.method7540(arg1, arg1.aShortArray91[local1067], local503, local2579 | local1174 << 41, local2547.anInt4623, local2547.anInt4624, local2547.anInt4622, 0, local1114, local1116);
				this.aShortArray29[local503] = this.method7540(arg1, arg1.aShortArray92[local1067], local503, local2579 | local1174 << 41, local2547.anInt4623, local2547.anInt4624, local2547.anInt4622, 0, local1118, local1120);
				this.aShortArray38[local503] = this.method7540(arg1, arg1.aShortArray93[local1067], local503, local2579 | local1174 << 41, local2547.anInt4623, local2547.anInt4624, local2547.anInt4622, 0, local1122, local1124);
			}
			if (arg1.aByteArray72 != null) {
				this.aByteArray28[local503] = arg1.aByteArray72[local1067];
			}
			if (arg1.aShortArray98 != null) {
				this.aShortArray34[local503] = arg1.aShortArray98[local1067];
			}
			this.aShortArray32[local503] = arg1.aShortArray95[local1067];
			this.aShortArray33[local503] = local1096;
		}
		if (this.anInt880 > 0) {
			local503 = 1;
			local776 = this.aShortArray33[0];
			for (local1074 = 0; local1074 < this.anInt880; local1074++) {
				local786 = this.aShortArray33[local1074];
				if (local786 != local776) {
					local503++;
					local776 = local786;
				}
			}
			this.anIntArray88 = new int[local503];
			this.anIntArray87 = new int[local503];
			this.anIntArray86 = new int[local503 + 1];
			this.anIntArray86[0] = 0;
			local1074 = this.anInt878;
			local159 = 0;
			local503 = 0;
			local776 = this.aShortArray33[0];
			for (local796 = 0; local796 < this.anInt880; local796++) {
				@Pc(2765) short local2765 = this.aShortArray33[local796];
				if (local2765 != local776) {
					this.anIntArray88[local503] = local1074;
					this.anIntArray87[local503] = local159 - local1074 + 1;
					local503++;
					this.anIntArray86[local503] = local796;
					local1074 = this.anInt878;
					local159 = 0;
					local776 = local2765;
				}
				local816 = this.aShortArray36[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
				local816 = this.aShortArray29[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
				local816 = this.aShortArray38[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
			}
			this.anIntArray88[local503] = local1074;
			this.anIntArray87[local503] = local159 - local1074 + 1;
			local503++;
			this.anIntArray86[local503] = this.anInt880;
		}
		this.aLongArray9 = null;
		this.aShortArray31 = method7609(this.aShortArray31, this.anInt878);
		this.aShortArray27 = method7609(this.aShortArray27, this.anInt878);
		this.aShortArray28 = method7609(this.aShortArray28, this.anInt878);
		this.aShortArray39 = method7609(this.aShortArray39, this.anInt878);
		this.aShortArray30 = method7609(this.aShortArray30, this.anInt878);
		this.aByteArray27 = method7541(this.aByteArray27, this.anInt878);
		this.aFloatArray29 = method7566(this.aFloatArray29, this.anInt878);
		this.aFloatArray28 = method7566(this.aFloatArray28, this.anInt878);
		if (arg1.anIntArray347 != null && Class399.method28763(arg2, this.anInt875)) {
			this.anIntArrayArray15 = arg1.method26046(false);
		}
		if (arg1.aClass226Array1 != null && Class399.method28800(arg2, this.anInt875)) {
			this.anIntArrayArray16 = arg1.method26048();
		}
		if (arg1.anIntArray345 != null && Class399.method28811(arg2, this.anInt875)) {
			local503 = 0;
			@Pc(2966) int[] local2966 = new int[256];
			for (local1074 = 0; local1074 < this.anInt879; local1074++) {
				local159 = arg1.anIntArray345[local16[local1074]];
				if (local159 >= 0) {
					@Pc(2985) int local2985 = local2966[local159]++;
					if (local159 > local503) {
						local503 = local159;
					}
				}
			}
			this.anIntArrayArray14 = new int[local503 + 1][];
			for (local1074 = 0; local1074 <= local503; local1074++) {
				this.anIntArrayArray14[local1074] = new int[local2966[local1074]];
				local2966[local1074] = 0;
			}
			for (local1074 = 0; local1074 < this.anInt879; local1074++) {
				local159 = arg1.anIntArray345[local16[local1074]];
				if (local159 >= 0) {
					this.anIntArrayArray14[local159][local2966[local159]++] = local1074;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "kr", descriptor = "()Z")
	boolean method7539() {
		@Pc(7) boolean local7 = !this.aClass418_4.aBoolean860;
		@Pc(20) boolean local20 = (this.anInt875 & 0x37) != 0 && !this.aClass418_3.aBoolean860;
		@Pc(28) boolean local28 = !this.aClass418_1.aBoolean860;
		@Pc(36) boolean local36 = !this.aClass418_2.aBoolean860;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface38 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray31 != null) {
			if (this.aClass418_1.anInterface38_22 == null) {
				this.aClass418_1.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_1.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat((float) this.anIntArray81[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray82[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray83[this.aShortArray31[local154]]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 12;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local104 = this.aShortArray31[local95];
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray82[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray83[local104]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_1.anInterface38_21 = local69;
			this.aClass418_1.aBoolean860 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass418_4.anInterface38_22 == null) {
				this.aClass418_4.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_4.anInterface38_22;
			local69.method29327(this.anInt878 * 4, 4);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass426_1 == null) {
						local600 = this.aShortArray28;
						local604 = this.aShortArray39;
						local264 = this.aShortArray30;
						local612 = this.aByteArray27;
					} else {
						local600 = this.aClass426_1.aShortArray129;
						local604 = this.aClass426_1.aShortArray127;
						local264 = this.aClass426_1.aShortArray128;
						local612 = this.aClass426_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(645) float local645 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local647 = 0; local647 < this.anInt878; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7560(this.aShortArray32[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort20);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass102_Sub1_5.aFloat212 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray28[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt878; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray28[local876] << 24 | this.method7560(this.aShortArray32[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort20);
						local149.putInt(local95);
					}
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 4;
				local93 = local69.method29384(0, local88);
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass426_1 == null) {
						local264 = this.aShortArray28;
						local268 = this.aShortArray39;
						local272 = this.aShortArray30;
						local276 = this.aByteArray27;
					} else {
						local264 = this.aClass426_1.aShortArray129;
						local268 = this.aClass426_1.aShortArray127;
						local272 = this.aClass426_1.aShortArray128;
						local276 = this.aClass426_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(309) float local309 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local311 = 0; local311 < this.anInt878; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7560(this.aShortArray32[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort20);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass102_Sub1_5.aFloat212 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray28[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt878; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray28[local104] << 24 | this.method7560(this.aShortArray32[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort20);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29385();
			}
			this.aClass418_4.anInterface38_21 = local69;
			this.aClass418_4.aBoolean860 = true;
		}
		if (local20) {
			if (this.aClass418_3.anInterface38_22 == null) {
				this.aClass418_3.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_3.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass426_1 == null) {
				local956 = this.aShortArray28;
				local960 = this.aShortArray39;
				local600 = this.aShortArray30;
				local968 = this.aByteArray27;
			} else {
				local956 = this.aClass426_1.aShortArray129;
				local960 = this.aClass426_1.aShortArray127;
				local600 = this.aClass426_1.aShortArray128;
				local968 = this.aClass426_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass102_Sub1_5.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass102_Sub1_5.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt878; local568++) {
					@Pc(1098) Class463 local1098 = new Class463((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29481() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29499((float) local968[local568]);
						}
						local1098.method29482();
					}
					local1073.putFloat(local1098.aFloat297);
					local1073.putFloat(local1098.aFloat295);
					local1073.putFloat(local1098.aFloat296);
				}
				local69.method29383(0, local1073.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				@Pc(992) int local992 = this.anInt878 * 12;
				@Pc(997) long local997 = local69.method29384(0, local992);
				for (local647 = 0; local647 < this.anInt878; local647++) {
					@Pc(1019) Class463 local1019 = new Class463((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29481() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29499((float) local968[local647]);
						}
						local1019.method29482();
					}
					local985.putFloat(local997, local1019.aFloat297);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat295);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat296);
					local997 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_3.anInterface38_21 = local69;
			this.aClass418_3.aBoolean860 = true;
		}
		if (local36) {
			if (this.aClass418_2.anInterface38_22 == null) {
				this.aClass418_2.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_2.anInterface38_22;
			local69.method29327(this.anInt878 * 8, 8);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat(this.aFloatArray29[local154]);
					local149.putFloat(this.aFloatArray28[local154]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 8;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_2.anInterface38_21 = local69;
			this.aClass418_2.aBoolean860 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afw", name = "dz", descriptor = "()I")
	@Override
	public int method7444() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt887;
	}

	@OriginalMember(owner = "client!afw", name = "hh", descriptor = "(Lclient!dt;IIJIIIIFF)S")
	short method7540(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray85[arg1];
		@Pc(11) int local11 = this.anIntArray85[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt878 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt878] = (short) arg2;
		this.aShortArray31[this.anInt878] = (short) arg1;
		this.aShortArray28[this.anInt878] = (short) arg4;
		this.aShortArray39[this.anInt878] = (short) arg5;
		this.aShortArray30[this.anInt878] = (short) arg6;
		this.aByteArray27[this.anInt878] = (byte) arg7;
		this.aFloatArray29[this.anInt878] = arg8;
		this.aFloatArray28[this.anInt878] = arg9;
		return (short) this.anInt878++;
	}

	@OriginalMember(owner = "client!afw", name = "w", descriptor = "(III)V")
	@Override
	public void method7332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 0) {
				this.anIntArray81[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray82[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray83[local1] += arg2;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ap", descriptor = "()I")
	@Override
	public int method7533() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt886;
	}

	@OriginalMember(owner = "client!afw", name = "o", descriptor = "()I")
	@Override
	public int method7326() {
		return this.anInt874;
	}

	@OriginalMember(owner = "client!afw", name = "m", descriptor = "(I)V")
	@Override
	public void method7422(@OriginalArg(0) int arg0) {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean859 = Class399.method28750(arg0, this.anInt875);
		}
		if (this.aClass418_2 != null) {
			this.aClass418_2.aBoolean859 = Class399.method28753(arg0, this.anInt875);
		}
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean859 = Class399.method28752(arg0, this.anInt875);
		}
		if (this.aClass418_3 != null) {
			this.aClass418_3.aBoolean859 = Class399.method28751(arg0, this.anInt875);
		}
		this.anInt874 = arg0;
		if (this.aClass426_1 != null && (this.anInt874 & 0x10000) == 0) {
			this.aShortArray28 = this.aClass426_1.aShortArray129;
			this.aShortArray39 = this.aClass426_1.aShortArray127;
			this.aShortArray30 = this.aClass426_1.aShortArray128;
			this.aByteArray27 = this.aClass426_1.aByteArray92;
			this.aClass426_1 = null;
		}
		this.aBoolean177 = true;
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "j", descriptor = "()V")
	@Override
	public void method7404() {
		if (this.anInt878 > 0 && this.anInt880 > 0) {
			this.method7557();
			this.method7556();
			this.method7542();
		}
	}

	@OriginalMember(owner = "client!afw", name = "ga", descriptor = "(BIZ)Lclient!dn;")
	@Override
	public Class105 method7506(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class105_Sub3 local22;
		@Pc(14) Class105_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass102_Sub1_5.aClass105_Sub3Array6[arg0 - 1];
			local22 = this.aClass102_Sub1_5.aClass105_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class105_Sub3(this.aClass102_Sub1_5, 0, 0, true, false);
		}
		return this.method7561(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afw", name = "an", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7361(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt878 == 0) {
			return null;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub1_5.anInt2981 > 0) {
			local29 = this.anInt886 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local29 = this.anInt886 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub1_5.anInt2982 > 0) {
			local98 = this.anInt888 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local98 = this.anInt888 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub2 local162 = (Class80_Sub1_Sub10_Sub2) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub2 local171;
		if (local162 != null && local162.method24027(local153, local159)) {
			local171 = local162;
			local162.method24021();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_5, local153, local159);
		}
		local171.method24019(local29, local98, local45, local114);
		this.method7552(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afw", name = "hb", descriptor = "()V")
	void method7542() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		if (this.aClass228Array3 == null && this.aClass211Array3 == null && this.aClass414Array1 == null && !Class399.method28761(this.anInt874, this.anInt875)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray81 != null && !Class399.method28777(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local23 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray82 != null && !Class399.method28756(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local25 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray83 != null && !Class399.method28808(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local27 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (local23) {
				this.anIntArray81 = null;
			}
			if (local25) {
				this.anIntArray82 = null;
			}
			if (local27) {
				this.anIntArray83 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray81 == null && this.anIntArray82 == null && this.anIntArray83 == null) {
			this.aShortArray37 = null;
			this.anIntArray85 = null;
		}
		if (this.aByteArray27 != null && !Class399.method28839(this.anInt874, this.anInt875)) {
			label204: {
				label203: {
					if ((this.anInt875 & 0x37) == 0) {
						if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
							break label203;
						}
					} else if (this.aClass418_3 == null || this.aClass418_3.method28995()) {
						break label203;
					}
					this.aBoolean177 = true;
					break label204;
				}
				this.aShortArray30 = null;
				this.aShortArray39 = null;
				this.aShortArray28 = null;
				this.aByteArray27 = null;
			}
		}
		if (this.aShortArray32 != null && !Class399.method28759(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aByteArray28 != null && !Class399.method28760(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aByteArray28 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aFloatArray29 != null && !Class399.method28796(this.anInt874, this.anInt875)) {
			if (this.aClass418_2 == null || this.aClass418_2.method28995()) {
				this.aFloatArray28 = null;
				this.aFloatArray29 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray33 != null && !Class399.method28762(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray36 != null && !Class399.method28765(this.anInt874, this.anInt875)) {
			if ((this.aClass409_1 == null || this.aClass409_1.method28957()) && (this.aClass418_4 == null || this.aClass418_4.method28995())) {
				this.aShortArray38 = null;
				this.aShortArray29 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray31 != null) {
			if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Class399.method28811(this.anInt874, this.anInt875)) {
			this.anIntArrayArray14 = null;
			this.aShortArray34 = null;
		}
		if (this.anIntArrayArray15 != null && !Class399.method28763(this.anInt874, this.anInt875)) {
			this.anIntArrayArray15 = null;
			this.aShortArray35 = null;
		}
		if (this.anIntArrayArray16 != null && !Class399.method28800(this.anInt874, this.anInt875)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray86 != null && (this.anInt874 & 0x800) == 0 && (this.anInt874 & 0x40000) == 0) {
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ef", descriptor = "()I")
	@Override
	public int method7419() {
		if (!this.aBoolean175) {
			this.method7371();
		}
		return this.anInt890;
	}

	@OriginalMember(owner = "client!afw", name = "hi", descriptor = "()V")
	void method7543() {
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "hz", descriptor = "()V")
	void method7544() {
		if ((this.anInt875 & 0x37) == 0) {
			if (this.aClass418_4 != null) {
				this.aClass418_4.aBoolean860 = false;
			}
		} else if (this.aClass418_3 != null) {
			this.aClass418_3.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bo", descriptor = "()[Lclient!cp;")
	@Override
	public Class211[] method7386() {
		return this.aClass211Array3;
	}

	@OriginalMember(owner = "client!afw", name = "a", descriptor = "(I)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray83[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray83[local9] = this.anIntArray83[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ea", descriptor = "(I)V")
	@Override
	public void method7414(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.method7570();
		this.method7544();
	}

	@OriginalMember(owner = "client!afw", name = "dk", descriptor = "()I")
	@Override
	public int method7447() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt885;
	}

	@OriginalMember(owner = "client!afw", name = "ej", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7472() {
		return this.aClass228Array3;
	}

	@OriginalMember(owner = "client!afw", name = "ag", descriptor = "()Z")
	@Override
	boolean method7502() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "jk", descriptor = "()V")
	void method7545() {
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "q", descriptor = "(III)V")
	@Override
	public void method7334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray83[local1] = this.anIntArray83[local1] * arg2 >> 7;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "bv", descriptor = "()Z")
	@Override
	public boolean method7383() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!afw", name = "do", descriptor = "()I")
	@Override
	public int method7440() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt883;
	}

	@OriginalMember(owner = "client!afw", name = "fq", descriptor = "(I)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt877; local9++) {
			local29 = this.anIntArray83[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray83[local9] = this.anIntArray83[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt878; local9++) {
			local29 = this.aShortArray30[local9] * local3 + this.aShortArray28[local9] * local7 >> 14;
			this.aShortArray30[local9] = (short) (this.aShortArray30[local9] * local7 - this.aShortArray28[local9] * local3 >> 14);
			this.aShortArray28[local9] = (short) local29;
		}
		this.method7570();
		this.method7544();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "aa", descriptor = "()I")
	@Override
	public int method7362() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt889;
	}

	@OriginalMember(owner = "client!afw", name = "ae", descriptor = "()I")
	@Override
	public int method7501() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt883;
	}

	@OriginalMember(owner = "client!afw", name = "db", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7427(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if (aClass410_1 != null) {
			aClass410_1.method28962();
		}
		if (arg1 != null) {
			arg1.aBoolean773 = false;
		}
		if (this.anInt878 == 0) {
			return;
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub1_5.aClass487_83;
		@Pc(20) Class487 local20 = this.aClass102_Sub1_5.aClass487_80;
		@Pc(24) Class487 local24 = this.aClass102_Sub1_5.aClass487_81;
		local20.method30080(arg0);
		local24.method30075(local20);
		local24.method30078(this.aClass102_Sub1_5.aClass487_88);
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(44) float[] local44 = this.aClass102_Sub1_5.aFloatArray66;
		local20.method30085(0.0F, (float) this.anInt884, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method30085(0.0F, (float) this.anInt885, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass102_Sub1_5.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt889;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt889;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt886 + this.anInt887 >> 1;
			@Pc(180) int local180 = this.anInt888 + this.anInt881 >> 1;
			@Pc(185) int local185 = this.anInt884;
			@Pc(216) float local216 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(245) float local245 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			local121 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			local147 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local121 >= -local147) {
				arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local216 / local147);
				arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt885;
			@Pc(375) float local375 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(404) float local404 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			@Pc(433) float local433 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			@Pc(462) float local462 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local433 >= -local462) {
				arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local375 / local462);
				arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local147 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3865 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local462 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3866 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub1_5.method21261(arg2);
		this.method7555(arg0);
		this.aClass102_Sub1_5.method21261(0);
		local20.method30080(arg0);
		local20.method30078(this.aClass102_Sub1_5.aClass487_75);
		this.method7598(local20);
	}

	@OriginalMember(owner = "client!afw", name = "ar", descriptor = "()I")
	@Override
	public int method7485() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt887;
	}

	@OriginalMember(owner = "client!afw", name = "au", descriptor = "()I")
	@Override
	public int method7366() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt884;
	}

	@OriginalMember(owner = "client!afw", name = "az", descriptor = "()I")
	@Override
	public int method7367() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt885;
	}

	@OriginalMember(owner = "client!afw", name = "as", descriptor = "()I")
	@Override
	public int method7368() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt888;
	}

	@OriginalMember(owner = "client!afw", name = "aw", descriptor = "()I")
	@Override
	public int method7342() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt881;
	}

	@OriginalMember(owner = "client!afw", name = "kk", descriptor = "(ISI)I")
	int method7546(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass102_Sub1_5.anIntArray262[this.method7559(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class227 local20 = this.aClass102_Sub1_5.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte111 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!afw", name = "bc", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7353(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub3 local2 = (Class105_Sub3) arg0;
		if (this.anInt879 == 0 || local2.anInt879 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt877;
		@Pc(15) int[] local15 = local2.anIntArray81;
		@Pc(18) int[] local18 = local2.anIntArray82;
		@Pc(21) int[] local21 = local2.anIntArray83;
		@Pc(24) short[] local24 = local2.aShortArray28;
		@Pc(27) short[] local27 = local2.aShortArray39;
		@Pc(30) short[] local30 = local2.aShortArray30;
		@Pc(33) byte[] local33 = local2.aByteArray27;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass426_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass426_1.aShortArray129;
			local44 = this.aClass426_1.aShortArray127;
			local48 = this.aClass426_1.aShortArray128;
			local52 = this.aClass426_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass426_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass426_1.aShortArray129;
			local72 = local2.aClass426_1.aShortArray127;
			local76 = local2.aClass426_1.aShortArray128;
			local80 = local2.aClass426_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray85;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean180) {
			local2.method7564();
		}
		@Pc(103) int local103 = local2.anInt884;
		@Pc(106) int local106 = local2.anInt885;
		@Pc(109) int local109 = local2.anInt886;
		@Pc(112) int local112 = local2.anInt887;
		@Pc(115) int local115 = local2.anInt888;
		@Pc(118) int local118 = local2.anInt881;
		for (@Pc(120) int local120 = 0; local120 < this.anInt877; local120++) {
			@Pc(131) int local131 = this.anIntArray82[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray81[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray83[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray85[local120];
						@Pc(180) int local180 = this.anIntArray85[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray27[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass426_1 = new Class426();
											local40 = this.aClass426_1.aShortArray129 = Class114.method8628(this.aShortArray28, -324089967);
											local44 = this.aClass426_1.aShortArray127 = Class114.method8628(this.aShortArray39, -49396118);
											local48 = this.aClass426_1.aShortArray128 = Class114.method8628(this.aShortArray30, 1928490341);
											local52 = this.aClass426_1.aByteArray92 = Class494.method30296(this.aByteArray27, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class426 local325 = local2.aClass426_1 = new Class426();
											local68 = local325.aShortArray129 = Class114.method8628(local24, -345408805);
											local72 = local325.aShortArray127 = Class114.method8628(local27, 1577777280);
											local76 = local325.aShortArray128 = Class114.method8628(local30, 789918656);
											local80 = local325.aByteArray92 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray28[local168];
										@Pc(363) short local363 = this.aShortArray39[local168];
										@Pc(368) short local368 = this.aShortArray30[local168];
										@Pc(373) byte local373 = this.aByteArray27[local168];
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
										local173 = this.anIntArray85[local120];
										local180 = this.anIntArray85[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7544();
										this.method7544();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "br", descriptor = "(I)V")
	@Override
	public void method7446(@OriginalArg(0) int arg0) {
		this.aShort20 = (short) arg0;
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "jd", descriptor = "()V")
	void method7547() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ba", descriptor = "()I")
	@Override
	public int method7374() {
		return this.aShort20;
	}

	@OriginalMember(owner = "client!afw", name = "bt", descriptor = "()I")
	@Override
	public int method7375() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!afw", name = "bs", descriptor = "()[B")
	@Override
	public byte[] method7376() {
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!afw", name = "bj", descriptor = "(SS)V")
	@Override
	public void method7391(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt879; local1++) {
			if (this.aShortArray32[local1] == arg0) {
				this.aShortArray32[local1] = arg1;
			}
		}
		if (this.aClass414Array1 != null) {
			for (local1 = 0; local1 < this.anInt891; local1++) {
				@Pc(32) Class414 local32 = this.aClass414Array1[local1];
				@Pc(37) Class408 local37 = this.aClass408Array1[local1];
				local37.anInt4609 = local37.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local32.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "da", descriptor = "()I")
	@Override
	public int method7387() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt884;
	}

	@OriginalMember(owner = "client!afw", name = "ia", descriptor = "()V")
	void method7548() {
		if (this.aClass409_1 != null) {
			this.aClass409_1.aBoolean857 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bz", descriptor = "(IIII)V")
	@Override
	public void method7380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(12) int local12 = this.aShortArray32[local1] & 0xFFFF;
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
			this.aShortArray32[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass414Array1 != null) {
			for (local1 = 0; local1 < this.anInt891; local1++) {
				@Pc(97) Class414 local97 = this.aClass414Array1[local1];
				@Pc(102) Class408 local102 = this.aClass408Array1[local1];
				local102.anInt4609 = local102.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local97.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "cl", descriptor = "()V")
	@Override
	void method7416() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt876; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray82[local1] = this.anIntArray82[local1] + 7 >> 4;
			this.anIntArray83[local1] = this.anIntArray83[local1] + 7 >> 4;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "bh", descriptor = "()Z")
	@Override
	public boolean method7395() {
		return this.aBoolean178;
	}

	@OriginalMember(owner = "client!afw", name = "cz", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt893 = local5;
		this.anInt894 = local9;
		this.anInt895 = local13;
	}

	@OriginalMember(owner = "client!afw", name = "z", descriptor = "()V")
	@Override
	void method7337() {
	}

	@OriginalMember(owner = "client!afw", name = "p", descriptor = "()V")
	@Override
	void method7325() {
	}

	@OriginalMember(owner = "client!afw", name = "fm", descriptor = "()Z")
	@Override
	public boolean method7475() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass102_Sub1_5.aClass395_3.method28703(this.aClass102_Sub1_5.aClass235_6.method26120(this.aShortArray33[local6], 73831368), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "fd", descriptor = "(IIII)V")
	@Override
	void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local14 = 0; local14 < this.anInt877; local14++) {
				this.anInt893 += this.anIntArray81[local14];
				this.anInt894 += this.anIntArray82[local14];
				this.anInt895 += this.anIntArray83[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt893 = this.anInt893 / local3 + arg1;
				this.anInt894 = this.anInt894 / local3 + arg2;
				this.anInt895 = this.anInt895 / local3 + arg3;
			} else {
				this.anInt893 = arg1;
				this.anInt894 = arg2;
				this.anInt895 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt877; local3++) {
				this.anIntArray81[local3] += arg1;
				this.anIntArray82[local3] += arg2;
				this.anIntArray83[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt877; local3++) {
					this.anIntArray81[local3] -= this.anInt893;
					this.anIntArray82[local3] -= this.anInt894;
					this.anIntArray83[local3] -= this.anInt895;
					if (arg3 != 0) {
						local14 = Class467.anIntArray454[arg3];
						local167 = Class467.anIntArray453[arg3];
						local185 = this.anIntArray82[local3] * local14 + this.anIntArray81[local3] * local167 + 16383 >> 14;
						this.anIntArray82[local3] = this.anIntArray82[local3] * local167 - this.anIntArray81[local3] * local14 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class467.anIntArray454[arg1];
						local167 = Class467.anIntArray453[arg1];
						local185 = this.anIntArray82[local3] * local167 - this.anIntArray83[local3] * local14 + 16383 >> 14;
						this.anIntArray83[local3] = this.anIntArray82[local3] * local14 + this.anIntArray83[local3] * local167 + 16383 >> 14;
						this.anIntArray82[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class467.anIntArray454[arg2];
						local167 = Class467.anIntArray453[arg2];
						local185 = this.anIntArray83[local3] * local14 + this.anIntArray81[local3] * local167 + 16383 >> 14;
						this.anIntArray83[local3] = this.anIntArray83[local3] * local167 - this.anIntArray81[local3] * local14 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					this.anIntArray81[local3] += this.anInt893;
					this.anIntArray82[local3] += this.anInt894;
					this.anIntArray83[local3] += this.anInt895;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt877; local3++) {
					this.anIntArray81[local3] -= this.anInt893;
					this.anIntArray82[local3] -= this.anInt894;
					this.anIntArray83[local3] -= this.anInt895;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg1 / 128;
					this.anIntArray82[local3] = this.anIntArray82[local3] * arg2 / 128;
					this.anIntArray83[local3] = this.anIntArray83[local3] * arg3 / 128;
					this.anIntArray81[local3] += this.anInt893;
					this.anIntArray82[local3] += this.anInt894;
					this.anIntArray83[local3] += this.anInt895;
				}
			} else {
				@Pc(503) Class414 local503;
				@Pc(508) Class408 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt879; local3++) {
						local14 = (this.aByteArray28[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray28[local3] = (byte) local14;
					}
					if (this.aClass414Array1 != null) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local503 = this.aClass414Array1[local3];
							local508 = this.aClass408Array1[local3];
							local508.anInt4609 = local508.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local503.anInt4618] & 0xFF) << 24;
						}
					}
					this.method7543();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt879; local3++) {
						local14 = this.aShortArray32[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray32[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass414Array1 != null) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local503 = this.aClass414Array1[local3];
							local508 = this.aClass408Array1[local3];
							local508.anInt4609 = local508.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local503.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				} else {
					@Pc(671) Class408 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4612 += arg1;
							local671.anInt4613 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4610 = local671.anInt4610 * arg1 >> 7;
							local671.anInt4611 = local671.anInt4611 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4614 = local671.anInt4614 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "cy", descriptor = "(I)V")
	@Override
	public void method7400(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ab", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7339(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray15.length) {
					local46 = this.anIntArrayArray15[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt893 += this.anIntArray81[local56];
						this.anInt894 += this.anIntArray82[local56];
						this.anInt895 += this.anIntArray83[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt893 = this.anInt893 / local18 + local8;
				this.anInt894 = this.anInt894 / local18 + local12;
				this.anInt895 = this.anInt895 / local18 + local16;
			} else {
				this.anInt893 = local8;
				this.anInt894 = local12;
				this.anInt895 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray81[local48] += local8;
						this.anIntArray82[local48] += local12;
						this.anIntArray83[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							if (arg4 != 0) {
								local56 = Class467.anIntArray454[arg4];
								local271 = Class467.anIntArray453[arg4];
								local289 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = this.anIntArray82[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class467.anIntArray454[arg2];
								local271 = Class467.anIntArray453[arg2];
								local289 = this.anIntArray82[local48] * local271 - this.anIntArray83[local48] * local56 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class467.anIntArray454[arg3];
								local271 = Class467.anIntArray453[arg3];
								local289 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray83[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							if (arg2 != 0) {
								local56 = Class467.anIntArray454[arg2];
								local271 = Class467.anIntArray453[arg2];
								local289 = this.anIntArray82[local48] * local271 - this.anIntArray83[local48] * local56 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class467.anIntArray454[arg4];
								local271 = Class467.anIntArray453[arg4];
								local289 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = this.anIntArray82[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class467.anIntArray454[arg3];
								local271 = Class467.anIntArray453[arg3];
								local289 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray83[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray15.length) {
						local159 = this.anIntArrayArray15[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray85[local48];
							local271 = this.anIntArray85[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class467.anIntArray454[arg4];
									local756 = Class467.anIntArray453[arg4];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray28[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray28[local746] * local752 + 16383 >> 14);
									this.aShortArray28[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class467.anIntArray454[arg2];
									local756 = Class467.anIntArray453[arg2];
									local774 = this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14;
									this.aShortArray30[local746] = (short) (this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14);
									this.aShortArray39[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class467.anIntArray454[arg3];
									local756 = Class467.anIntArray453[arg3];
									local774 = this.aShortArray30[local746] * local752 + this.aShortArray28[local746] * local756 + 16383 >> 14;
									this.aShortArray30[local746] = (short) (this.aShortArray30[local746] * local756 - this.aShortArray28[local746] * local752 + 16383 >> 14);
									this.aShortArray28[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7544();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray81[local48] -= this.anInt893;
						this.anIntArray82[local48] -= this.anInt894;
						this.anIntArray83[local48] -= this.anInt895;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg2 >> 7;
						this.anIntArray82[local48] = this.anIntArray82[local48] * arg3 >> 7;
						this.anIntArray83[local48] = this.anIntArray83[local48] * arg4 >> 7;
						this.anIntArray81[local48] += this.anInt893;
						this.anIntArray82[local48] += this.anInt894;
						this.anIntArray83[local48] += this.anInt895;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class414 local1143;
			@Pc(1148) Class408 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray14.length) {
							local46 = this.anIntArrayArray14[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray28[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray28[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass414Array1 != null) {
							for (local29 = 0; local29 < this.anInt891; local29++) {
								local1143 = this.aClass414Array1[local29];
								local1148 = this.aClass408Array1[local29];
								local1148.anInt4609 = local1148.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local1143.anInt4618] & 0xFF) << 24;
							}
						}
						this.method7543();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class408 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass408Array1[local159[local161]];
									local1376.anInt4612 += arg2;
									local1376.anInt4613 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass408Array1[local159[local161]];
									local1376.anInt4610 = local1376.anInt4610 * arg2 >> 7;
									local1376.anInt4611 = local1376.anInt4611 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray16.length) {
							local159 = this.anIntArrayArray16[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass408Array1[local159[local161]];
								local1376.anInt4614 = local1376.anInt4614 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray14 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray14.length) {
						local46 = this.anIntArrayArray14[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray32[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray32[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass414Array1 != null) {
						for (local29 = 0; local29 < this.anInt891; local29++) {
							local1143 = this.aClass414Array1[local29];
							local1148 = this.aClass408Array1[local29];
							local1148.anInt4609 = local1148.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local1143.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "al", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method7339(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt893 = local5;
		this.anInt894 = local9;
		this.anInt895 = local13;
	}

	@OriginalMember(owner = "client!afw", name = "af", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt893 = local5;
		this.anInt894 = local9;
		this.anInt895 = local13;
	}

	@OriginalMember(owner = "client!afw", name = "ak", descriptor = "()V")
	@Override
	void method7357() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt876; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray82[local1] = this.anIntArray82[local1] + 7 >> 4;
			this.anIntArray83[local1] = this.anIntArray83[local1] + 7 >> 4;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "at", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7358(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray35 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub1_5.aClass471_35;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt877; local19++) {
			if ((arg1 & this.aShortArray35[local19]) != 0) {
				local5.method29842((float) this.anIntArray81[local19], (float) this.anIntArray82[local19], (float) this.anIntArray83[local19], local17);
				this.anIntArray81[local19] = (int) local17[0];
				this.anIntArray82[local19] = (int) local17[1];
				this.anIntArray83[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "jz", descriptor = "(IIIILclient!ov;ZI)Z")
	boolean method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg4);
		local3.method30078(this.aClass102_Sub1_5.aClass487_88);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(34) int local34 = this.anInt887 - this.anInt886 >> 1;
		@Pc(42) int local42 = this.anInt885 - this.anInt884 >> 1;
		@Pc(50) int local50 = this.anInt881 - this.anInt888 >> 1;
		@Pc(55) int local55 = this.anInt886 + local34;
		@Pc(60) int local60 = this.anInt884 + local42;
		@Pc(65) int local65 = this.anInt888 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray90[0] = local71;
		this.anIntArray91[0] = local77;
		this.anIntArray84[0] = local83;
		this.anIntArray90[1] = local89;
		this.anIntArray91[1] = local77;
		this.anIntArray84[1] = local83;
		this.anIntArray90[2] = local71;
		this.anIntArray91[2] = local95;
		this.anIntArray84[2] = local83;
		this.anIntArray90[3] = local89;
		this.anIntArray91[3] = local95;
		this.anIntArray84[3] = local83;
		this.anIntArray90[4] = local71;
		this.anIntArray91[4] = local77;
		this.anIntArray84[4] = local101;
		this.anIntArray90[5] = local89;
		this.anIntArray91[5] = local77;
		this.anIntArray84[5] = local101;
		this.anIntArray90[6] = local71;
		this.anIntArray91[6] = local95;
		this.anIntArray84[6] = local101;
		this.anIntArray90[7] = local89;
		this.anIntArray91[7] = local95;
		this.anIntArray84[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray90[local223];
			local238 = this.anIntArray91[local223];
			local244 = this.anIntArray84[local223];
			local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
			local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
				local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
				@Pc(365) float local365 = this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296;
				@Pc(377) float local377 = this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray89.length < this.anInt878) {
				this.anIntArray89 = new int[this.anInt878];
				this.anIntArray80 = new int[this.anInt878];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt877; local457++) {
				local232 = this.anIntArray81[local457];
				local238 = this.anIntArray82[local457];
				local244 = this.anIntArray83[local457];
				local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
				local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
					local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296);
						this.anIntArray80[local620] = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt879; local457++) {
				if (this.anIntArray89[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray29[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray38[local457] & 0xFFFF] != -999999 && this.method7571(arg0, arg1, local223, local413, this.anIntArray80[this.aShortArray36[local457] & 0xFFFF], this.anIntArray80[this.aShortArray29[local457] & 0xFFFF], this.anIntArray80[this.aShortArray38[local457] & 0xFFFF], this.anIntArray89[this.aShortArray36[local457] & 0xFFFF], this.anIntArray89[this.aShortArray29[local457] & 0xFFFF], this.anIntArray89[this.aShortArray38[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afw", name = "jy", descriptor = "()V")
	void method7551() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt877; local17++) {
			@Pc(26) int local26 = this.anIntArray81[local17];
			@Pc(31) int local31 = this.anIntArray82[local17];
			@Pc(36) int local36 = this.anIntArray83[local17];
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
		this.anInt886 = local1;
		this.anInt887 = local7;
		this.anInt884 = local3;
		this.anInt885 = local9;
		this.anInt888 = local5;
		this.anInt881 = local11;
		this.anInt889 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt883 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!afw", name = "av", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7567(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afw", name = "ih", descriptor = "(Lclient!atu;)V")
	void method7552(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "jx", descriptor = "()V")
	void method7553() {
		if (this.aClass409_1 != null) {
			this.aClass409_1.aBoolean857 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "jq", descriptor = "(IIIIIIIIII)Z")
	boolean method7554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!afw", name = "r", descriptor = "()V")
	@Override
	public void method7344() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt877; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
		}
		for (local1 = 0; local1 < this.anInt878; local1++) {
			this.aShortArray30[local1] = (short) -this.aShortArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray38[local1];
			this.aShortArray38[local1] = local45;
		}
		this.method7570();
		this.method7544();
		this.method7548();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ad", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7359(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if (aClass410_1 != null) {
			aClass410_1.method28962();
		}
		if (arg1 != null) {
			arg1.aBoolean773 = false;
		}
		if (this.anInt878 == 0) {
			return;
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub1_5.aClass487_83;
		@Pc(20) Class487 local20 = this.aClass102_Sub1_5.aClass487_80;
		@Pc(24) Class487 local24 = this.aClass102_Sub1_5.aClass487_81;
		local20.method30080(arg0);
		local24.method30075(local20);
		local24.method30078(this.aClass102_Sub1_5.aClass487_88);
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(44) float[] local44 = this.aClass102_Sub1_5.aFloatArray66;
		local20.method30085(0.0F, (float) this.anInt884, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method30085(0.0F, (float) this.anInt885, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass102_Sub1_5.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt889;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt889;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt886 + this.anInt887 >> 1;
			@Pc(180) int local180 = this.anInt888 + this.anInt881 >> 1;
			@Pc(185) int local185 = this.anInt884;
			@Pc(216) float local216 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(245) float local245 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			local121 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			local147 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local121 >= -local147) {
				arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local216 / local147);
				arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt885;
			@Pc(375) float local375 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(404) float local404 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			@Pc(433) float local433 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			@Pc(462) float local462 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local433 >= -local462) {
				arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local375 / local462);
				arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local147 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3865 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local462 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3866 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub1_5.method21261(arg2);
		this.method7555(arg0);
		this.aClass102_Sub1_5.method21261(0);
		local20.method30080(arg0);
		local20.method30078(this.aClass102_Sub1_5.aClass487_75);
		this.method7598(local20);
	}

	@OriginalMember(owner = "client!afw", name = "io", descriptor = "(Lclient!ov;)V")
	void method7555(@OriginalArg(0) Class471 arg0) {
		if (this.anInt880 == 0 || (!this.method7557() || !this.method7556())) {
			return;
		}
		if (aClass410_1 != null) {
		}
		this.aClass102_Sub1_5.method21260();
		this.aClass102_Sub1_5.method21202();
		@Pc(22) Class119 local22 = this.aClass102_Sub1_5.aClass119_3;
		this.aClass102_Sub1_5.method21250(0, this.aClass418_1.anInterface38_21);
		this.aClass102_Sub1_5.method21250(1, this.aClass418_4.anInterface38_21);
		this.aClass102_Sub1_5.method21250(2, this.aClass418_2.anInterface38_21);
		this.aClass102_Sub1_5.method21251(this.aClass409_1.anInterface44_8);
		this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
		local22.method9392(this.aClass102_Sub1_5.aClass487_80);
		local22.aClass487_35.method30139();
		if (this.aClass102_Sub1_5.aBoolean524) {
			@Pc(70) Class229 local70 = this.aClass102_Sub1_5.method21283();
			local22.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) -this.aClass102_Sub1_5.anInt3002);
			local22.aClass456_5.method29342(3.0F / (float) (local70.anInt3685 * -692202347));
			local22.aClass463_20.method29477((float) (local70.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass102_Sub1_5.anInt2985 > 0) {
			local22.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_5.aFloat217);
			local22.aClass463_19.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_5.method29343(this.aClass102_Sub1_5.aClass487_80);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30078(this.aClass102_Sub1_5.aClass487_75);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_6.method29343(this.aClass102_Sub1_5.aClass487_80);
			local22.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217));
		} else {
			local22.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt875 & 0x37) == 0) {
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_19);
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray88.length; local272++) {
				local282 = this.anIntArray86[local272];
				local289 = this.anIntArray86[local272 + 1];
				@Pc(294) short local294 = this.aShortArray33[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(383) float[] local383 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local383[12] = 0.0F;
				} else {
					@Pc(310) Class227 local310 = this.aClass102_Sub1_5.aClass235_6.method26120(local294 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local310);
					local296 = !Class58.method15723(local310.aByte110, (byte) 1);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat263 / 64.0F % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat264 / 64.0F % 1.0F;
					if (local310.aClass608_2 == Class608.aClass608_3) {
						local298 = local310.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local298);
				local22.anInt1107 = this.anIntArray88[local272];
				local22.anInt1108 = this.anIntArray87[local272];
				local22.anInt1105 = local282 * 3;
				local22.anInt1109 = local289 - local282;
				local22.method9410(local296);
			}
		} else {
			this.aClass102_Sub1_5.method21250(3, this.aClass418_3.anInterface38_21);
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_21);
			@Pc(442) Class471 local442 = this.aClass102_Sub1_5.aClass471_35;
			local442.method29760(arg0);
			local442.method29768();
			local282 = 0;
			@Pc(569) int local569;
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(true);
			} else {
				local22.aClass463_17.method29477(this.aClass102_Sub1_5.aFloatArray68[0], this.aClass102_Sub1_5.aFloatArray68[1], this.aClass102_Sub1_5.aFloatArray68[2]);
				local22.aClass463_17.method29502(local442);
				local22.aClass463_22.method29477(this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_16.method29477(-this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat208, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat209, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_21.method29477(this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat210);
				if (this.aClass102_Sub1_5.anInt2977 > 0) {
					local282 = this.aClass102_Sub1_5.anInt2977;
					@Pc(567) Class463 local567 = this.aClass102_Sub1_5.aClass463_59;
					for (local569 = 0; local569 < local282; local569++) {
						@Pc(578) Class80_Sub12 local578 = this.aClass102_Sub1_5.aClass80_Sub12Array19[local569];
						@Pc(582) int local582 = local578.method13953((byte) 80);
						local567.method29478(local578.aClass463_45);
						local567.method29537(local442);
						local22.aFloatArray38[local569 * 4] = local567.aFloat297;
						local22.aFloatArray38[local569 * 4 + 1] = local567.aFloat295;
						local22.aFloatArray38[local569 * 4 + 2] = local567.aFloat296;
						local22.aFloatArray38[local569 * 4 + 3] = 1.0F / (float) (local578.method13952(-432544427) * local578.method13952(-432544427));
						@Pc(643) float local643 = local578.method13954(1582916980) / 255.0F;
						local22.aFloatArray37[local569 * 4] = (float) (local582 >> 16 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 1] = (float) (local582 >> 8 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 2] = (float) (local582 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray88.length; local289++) {
				local569 = this.anIntArray86[local289];
				@Pc(719) int local719 = this.anIntArray86[local289 + 1];
				@Pc(724) short local724 = this.aShortArray33[local569];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class227 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(809) float[] local809 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local809[12] = 0.0F;
				} else {
					local728 = this.aClass102_Sub1_5.aClass235_6.method26120(local724 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local728);
					local726 = local728.aByte110;
					local22.method9393(local728.aByte116);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat263 % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat264 % 1.0F;
					if (local728.aClass608_2 == Class608.aClass608_3) {
						local730 = local728.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local730);
				local22.anInt1107 = this.anIntArray88[local289];
				local22.anInt1108 = this.anIntArray87[local289];
				local22.anInt1105 = local569 * 3;
				local22.anInt1109 = local719 - local569;
				switch(local726) {
					case 1:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.method9404(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9396(local282);
						break;
					case 5:
						if (this.aClass102_Sub1_5.aBoolean518) {
							local22.method9396(local282);
						} else {
							@Pc(893) Class131_Sub1_Sub2 local893 = this.aClass102_Sub1_5.aClass131_Sub1_Sub2_3;
							local893.method20494(local728.aByte116, local728.anInt3660 * 260749353, (short) 128);
							local893.aClass487_72.method30080(arg0);
							local893.aClass487_73.method30080(arg0);
							local893.aClass487_73.method30078(this.aClass102_Sub1_5.aClass487_78);
							local893.anInt2877 = this.anIntArray88[local289] * -1895357069;
							local893.anInt2878 = this.anIntArray87[local289] * 36252407;
							local893.anInt2879 = local569 * -1193706545;
							local893.anInt2880 = (local719 - local569) * 262854753;
							local893.method20491(1707321536);
						}
						break;
					case 6:
						local22.method9410(!Class58.method15723(local726, (byte) 1));
						break;
					case 7:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.aClass487_36.method30080(arg0);
						local22.anInterface42_3 = this.aClass102_Sub1_5.method21170();
						local22.method9409(local282);
				}
			}
		}
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "cn", descriptor = "(I)V")
	@Override
	public void method7399(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "id", descriptor = "()Z")
	boolean method7556() {
		if (this.aClass409_1.aBoolean857) {
			return true;
		}
		if (this.aClass409_1.anInterface44_7 == null) {
			this.aClass409_1.anInterface44_7 = this.aClass102_Sub1_5.method21246(false);
		}
		@Pc(20) Interface44 local20 = this.aClass409_1.anInterface44_7;
		local20.method29401(this.anInt880 * 6);
		@Pc(30) Unsafe local30 = this.aClass102_Sub1_5.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt880 * 6;
			@Pc(42) long local42 = local20.method29384(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt880; local50++) {
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray29[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray38[local50]);
				local42 += 2L;
			}
			local20.method29385();
			this.aClass409_1.anInterface44_8 = local20;
			this.aClass409_1.aBoolean857 = true;
			this.aBoolean177 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass102_Sub1_5.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt880; local113++) {
			local108.putShort(this.aShortArray36[local113]);
			local108.putShort(this.aShortArray29[local113]);
			local108.putShort(this.aShortArray38[local113]);
		}
		if (local20.method29383(0, local108.position(), this.aClass102_Sub1_5.aLong168)) {
			this.aClass409_1.anInterface44_8 = local20;
			this.aClass409_1.aBoolean857 = true;
			this.aBoolean177 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ix", descriptor = "()Z")
	boolean method7557() {
		@Pc(7) boolean local7 = !this.aClass418_4.aBoolean860;
		@Pc(20) boolean local20 = (this.anInt875 & 0x37) != 0 && !this.aClass418_3.aBoolean860;
		@Pc(28) boolean local28 = !this.aClass418_1.aBoolean860;
		@Pc(36) boolean local36 = !this.aClass418_2.aBoolean860;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface38 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray31 != null) {
			if (this.aClass418_1.anInterface38_22 == null) {
				this.aClass418_1.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_1.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat((float) this.anIntArray81[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray82[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray83[this.aShortArray31[local154]]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 12;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local104 = this.aShortArray31[local95];
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray82[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray83[local104]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_1.anInterface38_21 = local69;
			this.aClass418_1.aBoolean860 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass418_4.anInterface38_22 == null) {
				this.aClass418_4.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_4.anInterface38_22;
			local69.method29327(this.anInt878 * 4, 4);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass426_1 == null) {
						local600 = this.aShortArray28;
						local604 = this.aShortArray39;
						local264 = this.aShortArray30;
						local612 = this.aByteArray27;
					} else {
						local600 = this.aClass426_1.aShortArray129;
						local604 = this.aClass426_1.aShortArray127;
						local264 = this.aClass426_1.aShortArray128;
						local612 = this.aClass426_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(645) float local645 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local647 = 0; local647 < this.anInt878; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7560(this.aShortArray32[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort20);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass102_Sub1_5.aFloat212 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray28[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt878; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray28[local876] << 24 | this.method7560(this.aShortArray32[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort20);
						local149.putInt(local95);
					}
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 4;
				local93 = local69.method29384(0, local88);
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass426_1 == null) {
						local264 = this.aShortArray28;
						local268 = this.aShortArray39;
						local272 = this.aShortArray30;
						local276 = this.aByteArray27;
					} else {
						local264 = this.aClass426_1.aShortArray129;
						local268 = this.aClass426_1.aShortArray127;
						local272 = this.aClass426_1.aShortArray128;
						local276 = this.aClass426_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(309) float local309 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local311 = 0; local311 < this.anInt878; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7560(this.aShortArray32[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort20);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass102_Sub1_5.aFloat212 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray28[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt878; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray28[local104] << 24 | this.method7560(this.aShortArray32[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort20);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29385();
			}
			this.aClass418_4.anInterface38_21 = local69;
			this.aClass418_4.aBoolean860 = true;
		}
		if (local20) {
			if (this.aClass418_3.anInterface38_22 == null) {
				this.aClass418_3.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_3.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass426_1 == null) {
				local956 = this.aShortArray28;
				local960 = this.aShortArray39;
				local600 = this.aShortArray30;
				local968 = this.aByteArray27;
			} else {
				local956 = this.aClass426_1.aShortArray129;
				local960 = this.aClass426_1.aShortArray127;
				local600 = this.aClass426_1.aShortArray128;
				local968 = this.aClass426_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass102_Sub1_5.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass102_Sub1_5.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt878; local568++) {
					@Pc(1098) Class463 local1098 = new Class463((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29481() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29499((float) local968[local568]);
						}
						local1098.method29482();
					}
					local1073.putFloat(local1098.aFloat297);
					local1073.putFloat(local1098.aFloat295);
					local1073.putFloat(local1098.aFloat296);
				}
				local69.method29383(0, local1073.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				@Pc(992) int local992 = this.anInt878 * 12;
				@Pc(997) long local997 = local69.method29384(0, local992);
				for (local647 = 0; local647 < this.anInt878; local647++) {
					@Pc(1019) Class463 local1019 = new Class463((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29481() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29499((float) local968[local647]);
						}
						local1019.method29482();
					}
					local985.putFloat(local997, local1019.aFloat297);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat295);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat296);
					local997 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_3.anInterface38_21 = local69;
			this.aClass418_3.aBoolean860 = true;
		}
		if (local36) {
			if (this.aClass418_2.anInterface38_22 == null) {
				this.aClass418_2.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_2.anInterface38_22;
			local69.method29327(this.anInt878 * 8, 8);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat(this.aFloatArray29[local154]);
					local149.putFloat(this.aFloatArray28[local154]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 8;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_2.anInterface38_21 = local69;
			this.aClass418_2.aBoolean860 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afw", name = "ip", descriptor = "()V")
	void method7558() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.method28994();
		}
		if (this.aClass418_2 != null) {
			this.aClass418_2.method28994();
		}
		if (this.aClass418_4 != null) {
			this.aClass418_4.method28994();
		}
		if (this.aClass418_3 != null) {
			this.aClass418_3.method28994();
		}
		if (this.aClass409_1 != null) {
			this.aClass409_1.method28958();
		}
	}

	@OriginalMember(owner = "client!afw", name = "ir", descriptor = "(II)I")
	int method7559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afw", name = "iu", descriptor = "(ISI)I")
	int method7560(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass102_Sub1_5.anIntArray262[this.method7559(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class227 local20 = this.aClass102_Sub1_5.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte111 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!afw", name = "bf", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7381(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub3 local2 = (Class105_Sub3) arg0;
		if (this.anInt879 == 0 || local2.anInt879 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt877;
		@Pc(15) int[] local15 = local2.anIntArray81;
		@Pc(18) int[] local18 = local2.anIntArray82;
		@Pc(21) int[] local21 = local2.anIntArray83;
		@Pc(24) short[] local24 = local2.aShortArray28;
		@Pc(27) short[] local27 = local2.aShortArray39;
		@Pc(30) short[] local30 = local2.aShortArray30;
		@Pc(33) byte[] local33 = local2.aByteArray27;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass426_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass426_1.aShortArray129;
			local44 = this.aClass426_1.aShortArray127;
			local48 = this.aClass426_1.aShortArray128;
			local52 = this.aClass426_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass426_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass426_1.aShortArray129;
			local72 = local2.aClass426_1.aShortArray127;
			local76 = local2.aClass426_1.aShortArray128;
			local80 = local2.aClass426_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray85;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean180) {
			local2.method7564();
		}
		@Pc(103) int local103 = local2.anInt884;
		@Pc(106) int local106 = local2.anInt885;
		@Pc(109) int local109 = local2.anInt886;
		@Pc(112) int local112 = local2.anInt887;
		@Pc(115) int local115 = local2.anInt888;
		@Pc(118) int local118 = local2.anInt881;
		for (@Pc(120) int local120 = 0; local120 < this.anInt877; local120++) {
			@Pc(131) int local131 = this.anIntArray82[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray81[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray83[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray85[local120];
						@Pc(180) int local180 = this.anIntArray85[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray27[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass426_1 = new Class426();
											local40 = this.aClass426_1.aShortArray129 = Class114.method8628(this.aShortArray28, 1430233238);
											local44 = this.aClass426_1.aShortArray127 = Class114.method8628(this.aShortArray39, 2052436474);
											local48 = this.aClass426_1.aShortArray128 = Class114.method8628(this.aShortArray30, 1795667518);
											local52 = this.aClass426_1.aByteArray92 = Class494.method30296(this.aByteArray27, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class426 local325 = local2.aClass426_1 = new Class426();
											local68 = local325.aShortArray129 = Class114.method8628(local24, 327258920);
											local72 = local325.aShortArray127 = Class114.method8628(local27, 1802367350);
											local76 = local325.aShortArray128 = Class114.method8628(local30, 1089382434);
											local80 = local325.aByteArray92 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray28[local168];
										@Pc(363) short local363 = this.aShortArray39[local168];
										@Pc(368) short local368 = this.aShortArray30[local168];
										@Pc(373) byte local373 = this.aByteArray27[local168];
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
										local173 = this.anIntArray85[local120];
										local180 = this.anIntArray85[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7544();
										this.method7544();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "fy", descriptor = "()Z")
	@Override
	public boolean method7421() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!afw", name = "bx", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7493(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub3 local2 = (Class105_Sub3) arg0;
		if (this.anInt879 == 0 || local2.anInt879 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt877;
		@Pc(15) int[] local15 = local2.anIntArray81;
		@Pc(18) int[] local18 = local2.anIntArray82;
		@Pc(21) int[] local21 = local2.anIntArray83;
		@Pc(24) short[] local24 = local2.aShortArray28;
		@Pc(27) short[] local27 = local2.aShortArray39;
		@Pc(30) short[] local30 = local2.aShortArray30;
		@Pc(33) byte[] local33 = local2.aByteArray27;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass426_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass426_1.aShortArray129;
			local44 = this.aClass426_1.aShortArray127;
			local48 = this.aClass426_1.aShortArray128;
			local52 = this.aClass426_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass426_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass426_1.aShortArray129;
			local72 = local2.aClass426_1.aShortArray127;
			local76 = local2.aClass426_1.aShortArray128;
			local80 = local2.aClass426_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray85;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean180) {
			local2.method7564();
		}
		@Pc(103) int local103 = local2.anInt884;
		@Pc(106) int local106 = local2.anInt885;
		@Pc(109) int local109 = local2.anInt886;
		@Pc(112) int local112 = local2.anInt887;
		@Pc(115) int local115 = local2.anInt888;
		@Pc(118) int local118 = local2.anInt881;
		for (@Pc(120) int local120 = 0; local120 < this.anInt877; local120++) {
			@Pc(131) int local131 = this.anIntArray82[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray81[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray83[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray85[local120];
						@Pc(180) int local180 = this.anIntArray85[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray27[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass426_1 = new Class426();
											local40 = this.aClass426_1.aShortArray129 = Class114.method8628(this.aShortArray28, 1628142981);
											local44 = this.aClass426_1.aShortArray127 = Class114.method8628(this.aShortArray39, -770689605);
											local48 = this.aClass426_1.aShortArray128 = Class114.method8628(this.aShortArray30, 845700517);
											local52 = this.aClass426_1.aByteArray92 = Class494.method30296(this.aByteArray27, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class426 local325 = local2.aClass426_1 = new Class426();
											local68 = local325.aShortArray129 = Class114.method8628(local24, 1845862918);
											local72 = local325.aShortArray127 = Class114.method8628(local27, 52109632);
											local76 = local325.aShortArray128 = Class114.method8628(local30, 858774493);
											local80 = local325.aByteArray92 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray28[local168];
										@Pc(363) short local363 = this.aShortArray39[local168];
										@Pc(368) short local368 = this.aShortArray30[local168];
										@Pc(373) byte local373 = this.aByteArray27[local168];
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
										local173 = this.anIntArray85[local120];
										local180 = this.anIntArray85[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7544();
										this.method7544();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "bi", descriptor = "()I")
	@Override
	public int method7509() {
		return this.anInt874;
	}

	@OriginalMember(owner = "client!afw", name = "bu", descriptor = "()I")
	@Override
	public int method7392() {
		return this.anInt874;
	}

	@OriginalMember(owner = "client!afw", name = "bm", descriptor = "(I)V")
	@Override
	public void method7393(@OriginalArg(0) int arg0) {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean859 = Class399.method28750(arg0, this.anInt875);
		}
		if (this.aClass418_2 != null) {
			this.aClass418_2.aBoolean859 = Class399.method28753(arg0, this.anInt875);
		}
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean859 = Class399.method28752(arg0, this.anInt875);
		}
		if (this.aClass418_3 != null) {
			this.aClass418_3.aBoolean859 = Class399.method28751(arg0, this.anInt875);
		}
		this.anInt874 = arg0;
		if (this.aClass426_1 != null && (this.anInt874 & 0x10000) == 0) {
			this.aShortArray28 = this.aClass426_1.aShortArray129;
			this.aShortArray39 = this.aClass426_1.aShortArray127;
			this.aShortArray30 = this.aClass426_1.aShortArray128;
			this.aByteArray27 = this.aClass426_1.aByteArray92;
			this.aClass426_1 = null;
		}
		this.aBoolean177 = true;
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "bq", descriptor = "()V")
	@Override
	public void method7394() {
		if (this.anInt878 > 0 && this.anInt880 > 0) {
			this.method7557();
			this.method7556();
			this.method7542();
		}
	}

	@OriginalMember(owner = "client!afw", name = "bd", descriptor = "(I)V")
	@Override
	public void method7333(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray83[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray83[local9] = this.anIntArray83[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cd", descriptor = "(I)V")
	@Override
	public void method7331(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local7 - this.anIntArray83[local9] * local3 >> 14;
			this.anIntArray83[local9] = this.anIntArray82[local9] * local3 + this.anIntArray83[local9] * local7 >> 14;
			this.anIntArray82[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cv", descriptor = "(I)V")
	@Override
	public void method7397(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local7 - this.anIntArray83[local9] * local3 >> 14;
			this.anIntArray83[local9] = this.anIntArray82[local9] * local3 + this.anIntArray83[local9] * local7 >> 14;
			this.anIntArray82[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ct", descriptor = "(I)V")
	@Override
	public void method7398(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "by", descriptor = "(B[B)V")
	@Override
	public void method7348(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt879; local3++) {
				this.aByteArray28[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt879; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray28[local3] = (byte) local39;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "ch", descriptor = "(I)V")
	@Override
	public void method7401(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cc", descriptor = "(III)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 0) {
				this.anIntArray81[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray82[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray83[local1] += arg2;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "hg", descriptor = "(Lclient!afw;Lclient!afw;IZZ)Lclient!dn;")
	Class105 method7561(@OriginalArg(0) Class105_Sub3 arg0, @OriginalArg(1) Class105_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt874 = arg2;
		arg0.anInt875 = this.anInt875;
		arg0.aShort20 = this.aShort20;
		arg0.aShort19 = this.aShort19;
		arg0.anInt876 = this.anInt876;
		arg0.anInt877 = this.anInt877;
		arg0.anInt878 = this.anInt878;
		arg0.anInt879 = this.anInt879;
		arg0.anInt880 = this.anInt880;
		arg0.anInt891 = this.anInt891;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean178 = this.aBoolean178;
		} else {
			arg0.aBoolean178 = true;
		}
		arg0.aBoolean176 = this.aBoolean176;
		@Pc(59) boolean local59 = Class399.method28733(arg2, this.anInt875);
		@Pc(64) boolean local64 = Class399.method28734(arg2, this.anInt875);
		@Pc(69) boolean local69 = Class399.method28735(arg2, this.anInt875);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt876) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt876];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local64) {
				arg0.anIntArray82 = this.anIntArray82;
			} else if (arg1.anIntArray82 == null || arg1.anIntArray82.length < this.anInt876) {
				arg0.anIntArray82 = arg1.anIntArray82 = new int[this.anInt876];
			} else {
				arg0.anIntArray82 = arg1.anIntArray82;
			}
			if (!local69) {
				arg0.anIntArray83 = this.anIntArray83;
			} else if (arg1.anIntArray83 == null || arg1.anIntArray83.length < this.anInt876) {
				arg0.anIntArray83 = arg1.anIntArray83 = new int[this.anInt876];
			} else {
				arg0.anIntArray83 = arg1.anIntArray83;
			}
			for (local166 = 0; local166 < this.anInt876; local166++) {
				if (local59) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local64) {
					arg0.anIntArray82[local166] = this.anIntArray82[local166];
				}
				if (local69) {
					arg0.anIntArray83[local166] = this.anIntArray83[local166];
				}
			}
		} else {
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray82 = this.anIntArray82;
			arg0.anIntArray83 = this.anIntArray83;
		}
		if (Class399.method28750(arg2, this.anInt875)) {
			arg0.aClass418_1 = arg1.aClass418_1;
			arg0.aClass418_1.anInterface38_21 = this.aClass418_1.anInterface38_21;
			arg0.aClass418_1.aBoolean860 = this.aClass418_1.aBoolean860;
			arg0.aClass418_1.aBoolean859 = true;
		} else if (Class399.method28745(arg2, this.anInt875)) {
			arg0.aClass418_1 = this.aClass418_1;
		} else {
			arg0.aClass418_1 = null;
		}
		if (Class399.method28738(arg2, this.anInt875)) {
			if (arg1.aShortArray32 == null || arg1.aShortArray32.length < this.anInt879) {
				arg0.aShortArray32 = arg1.aShortArray32 = new short[this.anInt879];
			} else {
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray32[local166] = this.aShortArray32[local166];
			}
		} else {
			arg0.aShortArray32 = this.aShortArray32;
		}
		if (Class399.method28739(arg2, this.anInt875)) {
			if (arg1.aByteArray28 == null || arg1.aByteArray28.length < this.anInt879) {
				arg0.aByteArray28 = arg1.aByteArray28 = new byte[this.anInt879];
			} else {
				arg0.aByteArray28 = arg1.aByteArray28;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aByteArray28[local166] = this.aByteArray28[local166];
			}
		} else {
			arg0.aByteArray28 = this.aByteArray28;
		}
		if (Class399.method28752(arg2, this.anInt875)) {
			arg0.aClass418_4 = arg1.aClass418_4;
			arg0.aClass418_4.anInterface38_21 = this.aClass418_4.anInterface38_21;
			arg0.aClass418_4.aBoolean860 = this.aClass418_4.aBoolean860;
			arg0.aClass418_4.aBoolean859 = true;
		} else if (Class399.method28758(arg2, this.anInt875)) {
			arg0.aClass418_4 = this.aClass418_4;
		} else {
			arg0.aClass418_4 = null;
		}
		@Pc(469) int local469;
		if (Class399.method28737(arg2, this.anInt875)) {
			if (arg1.aShortArray28 == null || arg1.aShortArray28.length < this.anInt878) {
				local166 = this.anInt878;
				arg0.aShortArray28 = arg1.aShortArray28 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
			} else {
				arg0.aShortArray28 = arg1.aShortArray28;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray30 = arg1.aShortArray30;
			}
			if (this.aClass426_1 == null) {
				arg0.aClass426_1 = null;
				for (local166 = 0; local166 < this.anInt878; local166++) {
					arg0.aShortArray28[local166] = this.aShortArray28[local166];
					arg0.aShortArray39[local166] = this.aShortArray39[local166];
					arg0.aShortArray30[local166] = this.aShortArray30[local166];
				}
			} else {
				if (arg1.aClass426_1 == null) {
					arg1.aClass426_1 = new Class426();
				}
				@Pc(457) Class426 local457 = arg0.aClass426_1 = arg1.aClass426_1;
				if (local457.aShortArray129 == null || local457.aShortArray129.length < this.anInt878) {
					local469 = this.anInt878;
					local457.aShortArray129 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray128 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt878; local469++) {
					arg0.aShortArray28[local469] = this.aShortArray28[local469];
					arg0.aShortArray39[local469] = this.aShortArray39[local469];
					arg0.aShortArray30[local469] = this.aShortArray30[local469];
					local457.aShortArray129[local469] = this.aClass426_1.aShortArray129[local469];
					local457.aShortArray127[local469] = this.aClass426_1.aShortArray127[local469];
					local457.aShortArray128[local469] = this.aClass426_1.aShortArray128[local469];
					local457.aByteArray92[local469] = this.aClass426_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray27 = this.aByteArray27;
		} else {
			arg0.aClass426_1 = this.aClass426_1;
			arg0.aShortArray28 = this.aShortArray28;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aByteArray27 = this.aByteArray27;
		}
		if (Class399.method28751(arg2, this.anInt875)) {
			arg0.aClass418_3 = arg1.aClass418_3;
			arg0.aClass418_3.anInterface38_21 = this.aClass418_3.anInterface38_21;
			arg0.aClass418_3.aBoolean860 = this.aClass418_3.aBoolean860;
			arg0.aClass418_3.aBoolean859 = true;
		} else if (Class399.method28804(arg2, this.anInt875)) {
			arg0.aClass418_3 = this.aClass418_3;
		} else {
			arg0.aClass418_3 = null;
		}
		if (Class399.method28740(arg2, this.anInt875)) {
			if (arg1.aFloatArray29 == null || arg1.aFloatArray29.length < this.anInt879) {
				local166 = this.anInt878;
				arg0.aFloatArray29 = arg1.aFloatArray29 = new float[local166];
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
			} else {
				arg0.aFloatArray29 = arg1.aFloatArray29;
				arg0.aFloatArray28 = arg1.aFloatArray28;
			}
			for (local166 = 0; local166 < this.anInt878; local166++) {
				arg0.aFloatArray29[local166] = this.aFloatArray29[local166];
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
			}
		} else {
			arg0.aFloatArray29 = this.aFloatArray29;
			arg0.aFloatArray28 = this.aFloatArray28;
		}
		if (Class399.method28753(arg2, this.anInt875)) {
			arg0.aClass418_2 = arg1.aClass418_2;
			arg0.aClass418_2.anInterface38_21 = this.aClass418_2.anInterface38_21;
			arg0.aClass418_2.aBoolean860 = this.aClass418_2.aBoolean860;
			arg0.aClass418_2.aBoolean859 = true;
		} else if (Class399.method28748(arg2, this.anInt875)) {
			arg0.aClass418_2 = this.aClass418_2;
		} else {
			arg0.aClass418_2 = null;
		}
		if (Class399.method28755(arg2, this.anInt875)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
				arg0.aShortArray29 = arg1.aShortArray29 = new short[local166];
				arg0.aShortArray38 = arg1.aShortArray38 = new short[local166];
			} else {
				arg0.aShortArray36 = arg1.aShortArray36;
				arg0.aShortArray29 = arg1.aShortArray29;
				arg0.aShortArray38 = arg1.aShortArray38;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
				arg0.aShortArray29[local166] = this.aShortArray29[local166];
				arg0.aShortArray38[local166] = this.aShortArray38[local166];
			}
		} else {
			arg0.aShortArray36 = this.aShortArray36;
			arg0.aShortArray29 = this.aShortArray29;
			arg0.aShortArray38 = this.aShortArray38;
		}
		if (Class399.method28754(arg2, this.anInt875)) {
			arg0.aClass409_1 = arg1.aClass409_1;
			arg0.aClass409_1.anInterface44_8 = this.aClass409_1.anInterface44_8;
			arg0.aClass409_1.aBoolean857 = this.aClass409_1.aBoolean857;
			arg0.aClass409_1.aBoolean856 = true;
		} else if (Class399.method28749(arg2, this.anInt875)) {
			arg0.aClass409_1 = this.aClass409_1;
		} else {
			arg0.aClass409_1 = null;
		}
		if (Class399.method28742(arg2, this.anInt875)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class399.method28743(arg2, this.anInt875)) {
			arg0.aClass408Array1 = this.aClass408Array1;
		} else if (arg1.aClass408Array1 == null || arg1.aClass408Array1.length < this.anInt891) {
			local166 = this.anInt891;
			arg0.aClass408Array1 = arg1.aClass408Array1 = new Class408[local166];
			for (local469 = 0; local469 < this.anInt891; local469++) {
				arg0.aClass408Array1[local469] = this.aClass408Array1[local469].method28952();
			}
		} else {
			arg0.aClass408Array1 = arg1.aClass408Array1;
			for (local166 = 0; local166 < this.anInt891; local166++) {
				arg0.aClass408Array1[local166].method28951(this.aClass408Array1[local166]);
			}
		}
		arg0.aClass414Array1 = this.aClass414Array1;
		if (this.aBoolean180) {
			arg0.anInt883 = this.anInt883;
			arg0.anInt889 = this.anInt889;
			arg0.anInt886 = this.anInt886;
			arg0.anInt887 = this.anInt887;
			arg0.anInt884 = this.anInt884;
			arg0.anInt885 = this.anInt885;
			arg0.anInt888 = this.anInt888;
			arg0.anInt881 = this.anInt881;
			arg0.aBoolean180 = true;
		} else {
			arg0.aBoolean180 = false;
		}
		if (this.aBoolean175) {
			arg0.anInt890 = this.anInt890;
			arg0.aBoolean175 = true;
		} else {
			arg0.aBoolean175 = false;
		}
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray85 = this.anIntArray85;
		arg0.aShortArray31 = this.aShortArray31;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray35 = this.aShortArray35;
		arg0.aShortArray34 = this.aShortArray34;
		arg0.anIntArray86 = this.anIntArray86;
		arg0.anIntArray87 = this.anIntArray87;
		arg0.anIntArray88 = this.anIntArray88;
		arg0.aClass228Array3 = this.aClass228Array3;
		arg0.aClass211Array3 = this.aClass211Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afw", name = "ce", descriptor = "(III)V")
	@Override
	public void method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray83[local1] = this.anIntArray83[local1] * arg2 >> 7;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cs", descriptor = "(III)V")
	@Override
	public void method7405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray83[local1] = this.anIntArray83[local1] * arg2 >> 7;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cj", descriptor = "(III)V")
	@Override
	public void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray83[local1] = this.anIntArray83[local1] * arg2 >> 7;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ck", descriptor = "()V")
	@Override
	void method7407() {
	}

	@OriginalMember(owner = "client!afw", name = "ca", descriptor = "()V")
	@Override
	void method7408() {
	}

	@OriginalMember(owner = "client!afw", name = "bb", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7385() {
		return this.aClass228Array3;
	}

	@OriginalMember(owner = "client!afw", name = "ja", descriptor = "(Lclient!ov;)V")
	void method7562(@OriginalArg(0) Class471 arg0) {
		if (this.anInt880 == 0 || (!this.method7557() || !this.method7556())) {
			return;
		}
		if (aClass410_1 != null) {
		}
		this.aClass102_Sub1_5.method21260();
		this.aClass102_Sub1_5.method21202();
		@Pc(22) Class119 local22 = this.aClass102_Sub1_5.aClass119_3;
		this.aClass102_Sub1_5.method21250(0, this.aClass418_1.anInterface38_21);
		this.aClass102_Sub1_5.method21250(1, this.aClass418_4.anInterface38_21);
		this.aClass102_Sub1_5.method21250(2, this.aClass418_2.anInterface38_21);
		this.aClass102_Sub1_5.method21251(this.aClass409_1.anInterface44_8);
		this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
		local22.method9392(this.aClass102_Sub1_5.aClass487_80);
		local22.aClass487_35.method30139();
		if (this.aClass102_Sub1_5.aBoolean524) {
			@Pc(70) Class229 local70 = this.aClass102_Sub1_5.method21283();
			local22.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) -this.aClass102_Sub1_5.anInt3002);
			local22.aClass456_5.method29342(3.0F / (float) (local70.anInt3685 * -692202347));
			local22.aClass463_20.method29477((float) (local70.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass102_Sub1_5.anInt2985 > 0) {
			local22.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_5.aFloat217);
			local22.aClass463_19.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_5.method29343(this.aClass102_Sub1_5.aClass487_80);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30078(this.aClass102_Sub1_5.aClass487_75);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_6.method29343(this.aClass102_Sub1_5.aClass487_80);
			local22.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217));
		} else {
			local22.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt875 & 0x37) == 0) {
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_19);
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray88.length; local272++) {
				local282 = this.anIntArray86[local272];
				local289 = this.anIntArray86[local272 + 1];
				@Pc(294) short local294 = this.aShortArray33[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(383) float[] local383 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local383[12] = 0.0F;
				} else {
					@Pc(310) Class227 local310 = this.aClass102_Sub1_5.aClass235_6.method26120(local294 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local310);
					local296 = !Class58.method15723(local310.aByte110, (byte) 1);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat263 / 64.0F % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat264 / 64.0F % 1.0F;
					if (local310.aClass608_2 == Class608.aClass608_3) {
						local298 = local310.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local298);
				local22.anInt1107 = this.anIntArray88[local272];
				local22.anInt1108 = this.anIntArray87[local272];
				local22.anInt1105 = local282 * 3;
				local22.anInt1109 = local289 - local282;
				local22.method9410(local296);
			}
		} else {
			this.aClass102_Sub1_5.method21250(3, this.aClass418_3.anInterface38_21);
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_21);
			@Pc(442) Class471 local442 = this.aClass102_Sub1_5.aClass471_35;
			local442.method29760(arg0);
			local442.method29768();
			local282 = 0;
			@Pc(569) int local569;
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(true);
			} else {
				local22.aClass463_17.method29477(this.aClass102_Sub1_5.aFloatArray68[0], this.aClass102_Sub1_5.aFloatArray68[1], this.aClass102_Sub1_5.aFloatArray68[2]);
				local22.aClass463_17.method29502(local442);
				local22.aClass463_22.method29477(this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_16.method29477(-this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat208, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat209, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_21.method29477(this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat210);
				if (this.aClass102_Sub1_5.anInt2977 > 0) {
					local282 = this.aClass102_Sub1_5.anInt2977;
					@Pc(567) Class463 local567 = this.aClass102_Sub1_5.aClass463_59;
					for (local569 = 0; local569 < local282; local569++) {
						@Pc(578) Class80_Sub12 local578 = this.aClass102_Sub1_5.aClass80_Sub12Array19[local569];
						@Pc(582) int local582 = local578.method13953((byte) 23);
						local567.method29478(local578.aClass463_45);
						local567.method29537(local442);
						local22.aFloatArray38[local569 * 4] = local567.aFloat297;
						local22.aFloatArray38[local569 * 4 + 1] = local567.aFloat295;
						local22.aFloatArray38[local569 * 4 + 2] = local567.aFloat296;
						local22.aFloatArray38[local569 * 4 + 3] = 1.0F / (float) (local578.method13952(-432544427) * local578.method13952(-432544427));
						@Pc(643) float local643 = local578.method13954(1633286761) / 255.0F;
						local22.aFloatArray37[local569 * 4] = (float) (local582 >> 16 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 1] = (float) (local582 >> 8 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 2] = (float) (local582 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray88.length; local289++) {
				local569 = this.anIntArray86[local289];
				@Pc(719) int local719 = this.anIntArray86[local289 + 1];
				@Pc(724) short local724 = this.aShortArray33[local569];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class227 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(809) float[] local809 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local809[12] = 0.0F;
				} else {
					local728 = this.aClass102_Sub1_5.aClass235_6.method26120(local724 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local728);
					local726 = local728.aByte110;
					local22.method9393(local728.aByte116);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat263 % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat264 % 1.0F;
					if (local728.aClass608_2 == Class608.aClass608_3) {
						local730 = local728.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local730);
				local22.anInt1107 = this.anIntArray88[local289];
				local22.anInt1108 = this.anIntArray87[local289];
				local22.anInt1105 = local569 * 3;
				local22.anInt1109 = local719 - local569;
				switch(local726) {
					case 1:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.method9404(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9396(local282);
						break;
					case 5:
						if (this.aClass102_Sub1_5.aBoolean518) {
							local22.method9396(local282);
						} else {
							@Pc(893) Class131_Sub1_Sub2 local893 = this.aClass102_Sub1_5.aClass131_Sub1_Sub2_3;
							local893.method20494(local728.aByte116, local728.anInt3660 * 260749353, (short) 128);
							local893.aClass487_72.method30080(arg0);
							local893.aClass487_73.method30080(arg0);
							local893.aClass487_73.method30078(this.aClass102_Sub1_5.aClass487_78);
							local893.anInt2877 = this.anIntArray88[local289] * -1895357069;
							local893.anInt2878 = this.anIntArray87[local289] * 36252407;
							local893.anInt2879 = local569 * -1193706545;
							local893.anInt2880 = (local719 - local569) * 262854753;
							local893.method20491(640600984);
						}
						break;
					case 6:
						local22.method9410(!Class58.method15723(local726, (byte) 1));
						break;
					case 7:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.aClass487_36.method30080(arg0);
						local22.anInterface42_3 = this.aClass102_Sub1_5.method21170();
						local22.method9409(local282);
				}
			}
		}
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "cm", descriptor = "()Z")
	@Override
	boolean method7411() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "cp", descriptor = "()Z")
	@Override
	boolean method7412() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "cg", descriptor = "()Z")
	@Override
	boolean method7413() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "cb", descriptor = "()Z")
	@Override
	boolean method7377() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "jo", descriptor = "(IIIILclient!ov;ZI)Z")
	boolean method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg4);
		local3.method30078(this.aClass102_Sub1_5.aClass487_88);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(34) int local34 = this.anInt887 - this.anInt886 >> 1;
		@Pc(42) int local42 = this.anInt885 - this.anInt884 >> 1;
		@Pc(50) int local50 = this.anInt881 - this.anInt888 >> 1;
		@Pc(55) int local55 = this.anInt886 + local34;
		@Pc(60) int local60 = this.anInt884 + local42;
		@Pc(65) int local65 = this.anInt888 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray90[0] = local71;
		this.anIntArray91[0] = local77;
		this.anIntArray84[0] = local83;
		this.anIntArray90[1] = local89;
		this.anIntArray91[1] = local77;
		this.anIntArray84[1] = local83;
		this.anIntArray90[2] = local71;
		this.anIntArray91[2] = local95;
		this.anIntArray84[2] = local83;
		this.anIntArray90[3] = local89;
		this.anIntArray91[3] = local95;
		this.anIntArray84[3] = local83;
		this.anIntArray90[4] = local71;
		this.anIntArray91[4] = local77;
		this.anIntArray84[4] = local101;
		this.anIntArray90[5] = local89;
		this.anIntArray91[5] = local77;
		this.anIntArray84[5] = local101;
		this.anIntArray90[6] = local71;
		this.anIntArray91[6] = local95;
		this.anIntArray84[6] = local101;
		this.anIntArray90[7] = local89;
		this.anIntArray91[7] = local95;
		this.anIntArray84[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray90[local223];
			local238 = this.anIntArray91[local223];
			local244 = this.anIntArray84[local223];
			local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
			local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
				local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
				@Pc(365) float local365 = this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296;
				@Pc(377) float local377 = this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray89.length < this.anInt878) {
				this.anIntArray89 = new int[this.anInt878];
				this.anIntArray80 = new int[this.anInt878];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt877; local457++) {
				local232 = this.anIntArray81[local457];
				local238 = this.anIntArray82[local457];
				local244 = this.anIntArray83[local457];
				local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
				local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
					local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296);
						this.anIntArray80[local620] = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt879; local457++) {
				if (this.anIntArray89[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray29[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray38[local457] & 0xFFFF] != -999999 && this.method7571(arg0, arg1, local223, local413, this.anIntArray80[this.aShortArray36[local457] & 0xFFFF], this.anIntArray80[this.aShortArray29[local457] & 0xFFFF], this.anIntArray80[this.aShortArray38[local457] & 0xFFFF], this.anIntArray89[this.aShortArray36[local457] & 0xFFFF], this.anIntArray89[this.aShortArray29[local457] & 0xFFFF], this.anIntArray89[this.aShortArray38[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afw", name = "il", descriptor = "()V")
	void method7564() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt877; local17++) {
			@Pc(26) int local26 = this.anIntArray81[local17];
			@Pc(31) int local31 = this.anIntArray82[local17];
			@Pc(36) int local36 = this.anIntArray83[local17];
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
		this.anInt886 = local1;
		this.anInt887 = local7;
		this.anInt884 = local3;
		this.anInt885 = local9;
		this.anInt888 = local5;
		this.anInt881 = local11;
		this.anInt889 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt883 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!afw", name = "cx", descriptor = "()V")
	@Override
	void method7511() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt876; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray82[local1] = this.anIntArray82[local1] + 7 >> 4;
			this.anIntArray83[local1] = this.anIntArray83[local1] + 7 >> 4;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "cf", descriptor = "()V")
	@Override
	void method7418() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt876; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray82[local1] = this.anIntArray82[local1] + 7 >> 4;
			this.anIntArray83[local1] = this.anIntArray83[local1] + 7 >> 4;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "co", descriptor = "(I[IIIIIZ)V")
	@Override
	void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray15.length) {
					local46 = this.anIntArrayArray15[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt893 += this.anIntArray81[local56];
						this.anInt894 += this.anIntArray82[local56];
						this.anInt895 += this.anIntArray83[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt893 = this.anInt893 / local18 + local8;
				this.anInt894 = this.anInt894 / local18 + local12;
				this.anInt895 = this.anInt895 / local18 + local16;
			} else {
				this.anInt893 = local8;
				this.anInt894 = local12;
				this.anInt895 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray81[local48] += local8;
						this.anIntArray82[local48] += local12;
						this.anIntArray83[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							if (arg4 != 0) {
								local56 = Class467.anIntArray454[arg4];
								local271 = Class467.anIntArray453[arg4];
								local289 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = this.anIntArray82[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class467.anIntArray454[arg2];
								local271 = Class467.anIntArray453[arg2];
								local289 = this.anIntArray82[local48] * local271 - this.anIntArray83[local48] * local56 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class467.anIntArray454[arg3];
								local271 = Class467.anIntArray453[arg3];
								local289 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray83[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							if (arg2 != 0) {
								local56 = Class467.anIntArray454[arg2];
								local271 = Class467.anIntArray453[arg2];
								local289 = this.anIntArray82[local48] * local271 - this.anIntArray83[local48] * local56 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class467.anIntArray454[arg4];
								local271 = Class467.anIntArray453[arg4];
								local289 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray82[local48] = this.anIntArray82[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class467.anIntArray454[arg3];
								local271 = Class467.anIntArray453[arg3];
								local289 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local271 + 16383 >> 14;
								this.anIntArray83[local48] = this.anIntArray83[local48] * local271 - this.anIntArray81[local48] * local56 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray15.length) {
						local159 = this.anIntArrayArray15[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray85[local48];
							local271 = this.anIntArray85[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class467.anIntArray454[arg4];
									local756 = Class467.anIntArray453[arg4];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray28[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray28[local746] * local752 + 16383 >> 14);
									this.aShortArray28[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class467.anIntArray454[arg2];
									local756 = Class467.anIntArray453[arg2];
									local774 = this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14;
									this.aShortArray30[local746] = (short) (this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14);
									this.aShortArray39[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class467.anIntArray454[arg3];
									local756 = Class467.anIntArray453[arg3];
									local774 = this.aShortArray30[local746] * local752 + this.aShortArray28[local746] * local756 + 16383 >> 14;
									this.aShortArray30[local746] = (short) (this.aShortArray30[local746] * local756 - this.aShortArray28[local746] * local752 + 16383 >> 14);
									this.aShortArray28[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7544();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local159 = this.anIntArrayArray15[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray81[local48] -= this.anInt893;
						this.anIntArray82[local48] -= this.anInt894;
						this.anIntArray83[local48] -= this.anInt895;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg2 >> 7;
						this.anIntArray82[local48] = this.anIntArray82[local48] * arg3 >> 7;
						this.anIntArray83[local48] = this.anIntArray83[local48] * arg4 >> 7;
						this.anIntArray81[local48] += this.anInt893;
						this.anIntArray82[local48] += this.anInt894;
						this.anIntArray83[local48] += this.anInt895;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class414 local1143;
			@Pc(1148) Class408 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray14.length) {
							local46 = this.anIntArrayArray14[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray28[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray28[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass414Array1 != null) {
							for (local29 = 0; local29 < this.anInt891; local29++) {
								local1143 = this.aClass414Array1[local29];
								local1148 = this.aClass408Array1[local29];
								local1148.anInt4609 = local1148.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local1143.anInt4618] & 0xFF) << 24;
							}
						}
						this.method7543();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class408 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass408Array1[local159[local161]];
									local1376.anInt4612 += arg2;
									local1376.anInt4613 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass408Array1[local159[local161]];
									local1376.anInt4610 = local1376.anInt4610 * arg2 >> 7;
									local1376.anInt4611 = local1376.anInt4611 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray16.length) {
							local159 = this.anIntArrayArray16[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass408Array1[local159[local161]];
								local1376.anInt4614 = local1376.anInt4614 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray14 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray14.length) {
						local46 = this.anIntArrayArray14[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray32[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray32[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass414Array1 != null) {
						for (local29 = 0; local29 < this.anInt891; local29++) {
							local1143 = this.aClass414Array1[local29];
							local1148 = this.aClass408Array1[local29];
							local1148.anInt4609 = local1148.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local1143.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "bn", descriptor = "(I)V")
	@Override
	public void method7373(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.method7570();
		this.method7544();
	}

	@OriginalMember(owner = "client!afw", name = "cq", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt893 = local5;
		this.anInt894 = local9;
		this.anInt895 = local13;
	}

	@OriginalMember(owner = "client!afw", name = "dg", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method7445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt893 = local5;
		this.anInt894 = local9;
		this.anInt895 = local13;
	}

	@OriginalMember(owner = "client!afw", name = "dh", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray15.length) {
					local46 = this.anIntArrayArray15[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local56]) != 0) {
							this.anInt893 += this.anIntArray81[local56];
							this.anInt894 += this.anIntArray82[local56];
							this.anInt895 += this.anIntArray83[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt893 = this.anInt893 / local18 + arg2;
				this.anInt894 = this.anInt894 / local18 + arg3;
				this.anInt895 = this.anInt895 / local18 + arg4;
				this.aBoolean181 = true;
			} else {
				this.anInt893 = arg2;
				this.anInt894 = arg3;
				this.anInt895 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] += arg2;
							this.anIntArray82[local48] += arg3;
							this.anIntArray83[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray15.length) {
						local247 = this.anIntArrayArray15[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
								this.anIntArray81[local48] -= this.anInt893;
								this.anIntArray82[local48] -= this.anInt894;
								this.anIntArray83[local48] -= this.anInt895;
								if (arg4 != 0) {
									local56 = Class467.anIntArray454[arg4];
									local366 = Class467.anIntArray453[arg4];
									local391 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = this.anIntArray82[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class467.anIntArray454[arg2];
									local366 = Class467.anIntArray453[arg2];
									local391 = this.anIntArray82[local48] * local366 - this.anIntArray83[local48] * local56 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class467.anIntArray454[arg3];
									local366 = Class467.anIntArray453[arg3];
									local391 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray83[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								this.anIntArray81[local48] += this.anInt893;
								this.anIntArray82[local48] += this.anInt894;
								this.anIntArray83[local48] += this.anInt895;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray15.length) {
							local247 = this.anIntArrayArray15[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
									local56 = this.anIntArray85[local48];
									local366 = this.anIntArray85[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class467.anIntArray454[arg4];
											local459 = Class467.anIntArray453[arg4];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class467.anIntArray454[arg2];
											local459 = Class467.anIntArray453[arg2];
											local463 = this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14);
											this.aShortArray39[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class467.anIntArray454[arg3];
											local459 = Class467.anIntArray453[arg3];
											local463 = this.aShortArray30[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray30[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7544();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean181) {
					local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
					local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
					local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt893 = local366;
					this.anInt894 = local391;
					this.anInt895 = local416;
					this.aBoolean181 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class467.anIntArray453[arg2];
				local416 = Class467.anIntArray454[arg2];
				local455 = Class467.anIntArray453[arg3];
				local459 = Class467.anIntArray454[arg3];
				local463 = Class467.anIntArray453[arg4];
				local467 = Class467.anIntArray454[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt893 + local443[1] * -this.anInt894 + local443[2] * -this.anInt895 + 8192 >> 14;
				local642 = local443[3] * -this.anInt893 + local443[4] * -this.anInt894 + local443[5] * -this.anInt895 + 8192 >> 14;
				local670 = local443[6] * -this.anInt893 + local443[7] * -this.anInt894 + local443[8] * -this.anInt895 + 8192 >> 14;
				local675 = local614 + this.anInt893;
				@Pc(680) int local680 = local642 + this.anInt894;
				local685 = local670 + this.anInt895;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray15.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray15[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray81[local982] + local822[1] * this.anIntArray82[local982] + local822[2] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray81[local982] + local822[4] * this.anIntArray82[local982] + local822[5] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray81[local982] + local822[7] * this.anIntArray82[local982] + local822[8] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray81[local982] = local1090;
								this.anIntArray82[local982] = local1094;
								this.anIntArray83[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class414 local2520;
			@Pc(2525) Class408 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray14.length) {
							local46 = this.anIntArrayArray14[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
									local366 = (this.aByteArray28[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray28[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass414Array1 != null) {
							for (local29 = 0; local29 < this.anInt891; local29++) {
								local2520 = this.aClass414Array1[local29];
								local2525 = this.aClass408Array1[local29];
								local2525.anInt4609 = local2525.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local2520.anInt4618] & 0xFF) << 24;
							}
						}
						this.method7543();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class408 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4612 += arg2;
									local2764.anInt4613 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4610 = local2764.anInt4610 * arg2 >> 7;
									local2764.anInt4611 = local2764.anInt4611 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray16.length) {
							local247 = this.anIntArrayArray16[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass408Array1[local247[local249]];
								local2764.anInt4614 = local2764.anInt4614 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray14 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray14.length) {
						local46 = this.anIntArrayArray14[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
								local366 = this.aShortArray32[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray32[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass414Array1 != null) {
						for (local29 = 0; local29 < this.anInt891; local29++) {
							local2520 = this.aClass414Array1[local29];
							local2525 = this.aClass408Array1[local29];
							local2525.anInt4609 = local2525.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local2520.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg2 >> 7;
							this.anIntArray82[local48] = this.anIntArray82[local48] * arg3 >> 7;
							this.anIntArray83[local48] = this.anIntArray83[local48] * arg4 >> 7;
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean181) {
				local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
				local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
				local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt893 = local366;
				this.anInt894 = local391;
				this.anInt895 = local416;
				this.aBoolean181 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt893 + 8192 >> 14;
			local459 = local391 * -this.anInt894 + 8192 >> 14;
			local463 = local416 * -this.anInt895 + 8192 >> 14;
			local467 = local455 + this.anInt893;
			local475 = local459 + this.anInt894;
			local483 = local463 + this.anInt895;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray15.length) {
					local822 = this.anIntArrayArray15[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray81[local829] + local1985[1] * this.anIntArray82[local829] + local1985[2] * this.anIntArray83[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray81[local829] + local1985[4] * this.anIntArray82[local829] + local1985[5] * this.anIntArray83[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray81[local829] + local1985[7] * this.anIntArray82[local829] + local1985[8] * this.anIntArray83[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray81[local829] = local2253;
							this.anIntArray82[local829] = local2257;
							this.anIntArray83[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "kp", descriptor = "(II)I")
	int method7565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afw", name = "dc", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7425(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray35 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub1_5.aClass471_35;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt877; local19++) {
			if ((arg1 & this.aShortArray35[local19]) != 0) {
				local5.method29842((float) this.anIntArray81[local19], (float) this.anIntArray82[local19], (float) this.anIntArray83[local19], local17);
				this.anIntArray81[local19] = (int) local17[0];
				this.anIntArray82[local19] = (int) local17[1];
				this.anIntArray83[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "dn", descriptor = "(Lclient!ov;IZ)V")
	@Override
	public void method7426(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray35 == null) {
			return;
		}
		@Pc(5) Class471 local5 = arg0;
		if (arg2) {
			local5 = this.aClass102_Sub1_5.aClass471_35;
			local5.method29767(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt877; local19++) {
			if ((arg1 & this.aShortArray35[local19]) != 0) {
				local5.method29842((float) this.anIntArray81[local19], (float) this.anIntArray82[local19], (float) this.anIntArray83[local19], local17);
				this.anIntArray81[local19] = (int) local17[0];
				this.anIntArray82[local19] = (int) local17[1];
				this.anIntArray83[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "df", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7364(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if (aClass410_1 != null) {
			aClass410_1.method28962();
		}
		if (arg1 != null) {
			arg1.aBoolean773 = false;
		}
		if (this.anInt878 == 0) {
			return;
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub1_5.aClass487_83;
		@Pc(20) Class487 local20 = this.aClass102_Sub1_5.aClass487_80;
		@Pc(24) Class487 local24 = this.aClass102_Sub1_5.aClass487_81;
		local20.method30080(arg0);
		local24.method30075(local20);
		local24.method30078(this.aClass102_Sub1_5.aClass487_88);
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(44) float[] local44 = this.aClass102_Sub1_5.aFloatArray66;
		local20.method30085(0.0F, (float) this.anInt884, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method30085(0.0F, (float) this.anInt885, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass102_Sub1_5.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt889;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt889;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt886 + this.anInt887 >> 1;
			@Pc(180) int local180 = this.anInt888 + this.anInt881 >> 1;
			@Pc(185) int local185 = this.anInt884;
			@Pc(216) float local216 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(245) float local245 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			local121 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			local147 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local121 >= -local147) {
				arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local216 / local147);
				arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt885;
			@Pc(375) float local375 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(404) float local404 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			@Pc(433) float local433 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			@Pc(462) float local462 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local433 >= -local462) {
				arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local375 / local462);
				arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local147 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3865 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local462 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3866 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub1_5.method21261(arg2);
		this.method7555(arg0);
		this.aClass102_Sub1_5.method21261(0);
		local20.method30080(arg0);
		local20.method30078(this.aClass102_Sub1_5.aClass487_75);
		this.method7598(local20);
	}

	@OriginalMember(owner = "client!afw", name = "bp", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7346(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array3 != null) {
			for (local11 = 0; local11 < this.aClass228Array3.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array3[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array3.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array3[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afw", name = "dt", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7430(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array3 != null) {
			for (local11 = 0; local11 < this.aClass228Array3.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array3[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array3.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array3[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afw", name = "du", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7431(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array3 != null) {
			for (local11 = 0; local11 < this.aClass228Array3.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array3[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array3.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array3[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ew", descriptor = "()I")
	@Override
	public int method7453() {
		if (!this.aBoolean175) {
			this.method7371();
		}
		return this.anInt890;
	}

	@OriginalMember(owner = "client!afw", name = "dw", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7433(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array3 != null) {
			for (local11 = 0; local11 < this.aClass228Array3.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array3[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array3.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array3[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afw", name = "dr", descriptor = "()V")
	@Override
	public void method7434() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "dx", descriptor = "()V")
	@Override
	public void method7435() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "de", descriptor = "()V")
	@Override
	public void method7436() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "bk", descriptor = "(SS)V")
	@Override
	public void method7341(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_5.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt879; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
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
				this.aBoolean176 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass414Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt891; local94++) {
				@Pc(103) Class414 local103 = this.aClass414Array1[local94];
				@Pc(108) Class408 local108 = this.aClass408Array1[local94];
				local108.anInt4609 = local108.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local103.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "dm", descriptor = "()V")
	@Override
	public void method7438() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "dq", descriptor = "()I")
	@Override
	public int method7492() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt889;
	}

	@OriginalMember(owner = "client!afw", name = "in", descriptor = "(IIIILclient!ov;ZI)Z")
	boolean method7567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg4);
		local3.method30078(this.aClass102_Sub1_5.aClass487_88);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(34) int local34 = this.anInt887 - this.anInt886 >> 1;
		@Pc(42) int local42 = this.anInt885 - this.anInt884 >> 1;
		@Pc(50) int local50 = this.anInt881 - this.anInt888 >> 1;
		@Pc(55) int local55 = this.anInt886 + local34;
		@Pc(60) int local60 = this.anInt884 + local42;
		@Pc(65) int local65 = this.anInt888 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray90[0] = local71;
		this.anIntArray91[0] = local77;
		this.anIntArray84[0] = local83;
		this.anIntArray90[1] = local89;
		this.anIntArray91[1] = local77;
		this.anIntArray84[1] = local83;
		this.anIntArray90[2] = local71;
		this.anIntArray91[2] = local95;
		this.anIntArray84[2] = local83;
		this.anIntArray90[3] = local89;
		this.anIntArray91[3] = local95;
		this.anIntArray84[3] = local83;
		this.anIntArray90[4] = local71;
		this.anIntArray91[4] = local77;
		this.anIntArray84[4] = local101;
		this.anIntArray90[5] = local89;
		this.anIntArray91[5] = local77;
		this.anIntArray84[5] = local101;
		this.anIntArray90[6] = local71;
		this.anIntArray91[6] = local95;
		this.anIntArray84[6] = local101;
		this.anIntArray90[7] = local89;
		this.anIntArray91[7] = local95;
		this.anIntArray84[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray90[local223];
			local238 = this.anIntArray91[local223];
			local244 = this.anIntArray84[local223];
			local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
			local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
				local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
				@Pc(365) float local365 = this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296;
				@Pc(377) float local377 = this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray89.length < this.anInt878) {
				this.anIntArray89 = new int[this.anInt878];
				this.anIntArray80 = new int[this.anInt878];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt877; local457++) {
				local232 = this.anIntArray81[local457];
				local238 = this.anIntArray82[local457];
				local244 = this.anIntArray83[local457];
				local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
				local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
					local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296);
						this.anIntArray80[local620] = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt879; local457++) {
				if (this.anIntArray89[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray29[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray38[local457] & 0xFFFF] != -999999 && this.method7571(arg0, arg1, local223, local413, this.anIntArray80[this.aShortArray36[local457] & 0xFFFF], this.anIntArray80[this.aShortArray29[local457] & 0xFFFF], this.anIntArray80[this.aShortArray38[local457] & 0xFFFF], this.anIntArray89[this.aShortArray36[local457] & 0xFFFF], this.anIntArray89[this.aShortArray29[local457] & 0xFFFF], this.anIntArray89[this.aShortArray38[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afw", name = "am", descriptor = "(IIII)V")
	@Override
	void method7335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local14 = 0; local14 < this.anInt877; local14++) {
				this.anInt893 += this.anIntArray81[local14];
				this.anInt894 += this.anIntArray82[local14];
				this.anInt895 += this.anIntArray83[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt893 = this.anInt893 / local3 + arg1;
				this.anInt894 = this.anInt894 / local3 + arg2;
				this.anInt895 = this.anInt895 / local3 + arg3;
			} else {
				this.anInt893 = arg1;
				this.anInt894 = arg2;
				this.anInt895 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt877; local3++) {
				this.anIntArray81[local3] += arg1;
				this.anIntArray82[local3] += arg2;
				this.anIntArray83[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt877; local3++) {
					this.anIntArray81[local3] -= this.anInt893;
					this.anIntArray82[local3] -= this.anInt894;
					this.anIntArray83[local3] -= this.anInt895;
					if (arg3 != 0) {
						local14 = Class467.anIntArray454[arg3];
						local167 = Class467.anIntArray453[arg3];
						local185 = this.anIntArray82[local3] * local14 + this.anIntArray81[local3] * local167 + 16383 >> 14;
						this.anIntArray82[local3] = this.anIntArray82[local3] * local167 - this.anIntArray81[local3] * local14 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class467.anIntArray454[arg1];
						local167 = Class467.anIntArray453[arg1];
						local185 = this.anIntArray82[local3] * local167 - this.anIntArray83[local3] * local14 + 16383 >> 14;
						this.anIntArray83[local3] = this.anIntArray82[local3] * local14 + this.anIntArray83[local3] * local167 + 16383 >> 14;
						this.anIntArray82[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class467.anIntArray454[arg2];
						local167 = Class467.anIntArray453[arg2];
						local185 = this.anIntArray83[local3] * local14 + this.anIntArray81[local3] * local167 + 16383 >> 14;
						this.anIntArray83[local3] = this.anIntArray83[local3] * local167 - this.anIntArray81[local3] * local14 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					this.anIntArray81[local3] += this.anInt893;
					this.anIntArray82[local3] += this.anInt894;
					this.anIntArray83[local3] += this.anInt895;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt877; local3++) {
					this.anIntArray81[local3] -= this.anInt893;
					this.anIntArray82[local3] -= this.anInt894;
					this.anIntArray83[local3] -= this.anInt895;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg1 / 128;
					this.anIntArray82[local3] = this.anIntArray82[local3] * arg2 / 128;
					this.anIntArray83[local3] = this.anIntArray83[local3] * arg3 / 128;
					this.anIntArray81[local3] += this.anInt893;
					this.anIntArray82[local3] += this.anInt894;
					this.anIntArray83[local3] += this.anInt895;
				}
			} else {
				@Pc(503) Class414 local503;
				@Pc(508) Class408 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt879; local3++) {
						local14 = (this.aByteArray28[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray28[local3] = (byte) local14;
					}
					if (this.aClass414Array1 != null) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local503 = this.aClass414Array1[local3];
							local508 = this.aClass408Array1[local3];
							local508.anInt4609 = local508.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local503.anInt4618] & 0xFF) << 24;
						}
					}
					this.method7543();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt879; local3++) {
						local14 = this.aShortArray32[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray32[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass414Array1 != null) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local503 = this.aClass414Array1[local3];
							local508 = this.aClass408Array1[local3];
							local508.anInt4609 = local508.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local503.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				} else {
					@Pc(671) Class408 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4612 += arg1;
							local671.anInt4613 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4610 = local671.anInt4610 * arg1 >> 7;
							local671.anInt4611 = local671.anInt4611 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt891; local3++) {
							local671 = this.aClass408Array1[local3];
							local671.anInt4614 = local671.anInt4614 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "dj", descriptor = "()I")
	@Override
	public int method7442() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt883;
	}

	@OriginalMember(owner = "client!afw", name = "jf", descriptor = "(Lclient!ov;)V")
	void method7568(@OriginalArg(0) Class471 arg0) {
		if (this.anInt880 == 0 || (!this.method7557() || !this.method7556())) {
			return;
		}
		if (aClass410_1 != null) {
		}
		this.aClass102_Sub1_5.method21260();
		this.aClass102_Sub1_5.method21202();
		@Pc(22) Class119 local22 = this.aClass102_Sub1_5.aClass119_3;
		this.aClass102_Sub1_5.method21250(0, this.aClass418_1.anInterface38_21);
		this.aClass102_Sub1_5.method21250(1, this.aClass418_4.anInterface38_21);
		this.aClass102_Sub1_5.method21250(2, this.aClass418_2.anInterface38_21);
		this.aClass102_Sub1_5.method21251(this.aClass409_1.anInterface44_8);
		this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
		local22.method9392(this.aClass102_Sub1_5.aClass487_80);
		local22.aClass487_35.method30139();
		if (this.aClass102_Sub1_5.aBoolean524) {
			@Pc(70) Class229 local70 = this.aClass102_Sub1_5.method21283();
			local22.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) -this.aClass102_Sub1_5.anInt3002);
			local22.aClass456_5.method29342(3.0F / (float) (local70.anInt3685 * -692202347));
			local22.aClass463_20.method29477((float) (local70.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass102_Sub1_5.anInt2985 > 0) {
			local22.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_5.aFloat217);
			local22.aClass463_19.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_5.method29343(this.aClass102_Sub1_5.aClass487_80);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30078(this.aClass102_Sub1_5.aClass487_75);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_6.method29343(this.aClass102_Sub1_5.aClass487_80);
			local22.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217));
		} else {
			local22.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt875 & 0x37) == 0) {
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_19);
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray88.length; local272++) {
				local282 = this.anIntArray86[local272];
				local289 = this.anIntArray86[local272 + 1];
				@Pc(294) short local294 = this.aShortArray33[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(383) float[] local383 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local383[12] = 0.0F;
				} else {
					@Pc(310) Class227 local310 = this.aClass102_Sub1_5.aClass235_6.method26120(local294 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local310);
					local296 = !Class58.method15723(local310.aByte110, (byte) 1);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat263 / 64.0F % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat264 / 64.0F % 1.0F;
					if (local310.aClass608_2 == Class608.aClass608_3) {
						local298 = local310.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local298);
				local22.anInt1107 = this.anIntArray88[local272];
				local22.anInt1108 = this.anIntArray87[local272];
				local22.anInt1105 = local282 * 3;
				local22.anInt1109 = local289 - local282;
				local22.method9410(local296);
			}
		} else {
			this.aClass102_Sub1_5.method21250(3, this.aClass418_3.anInterface38_21);
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_21);
			@Pc(442) Class471 local442 = this.aClass102_Sub1_5.aClass471_35;
			local442.method29760(arg0);
			local442.method29768();
			local282 = 0;
			@Pc(569) int local569;
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(true);
			} else {
				local22.aClass463_17.method29477(this.aClass102_Sub1_5.aFloatArray68[0], this.aClass102_Sub1_5.aFloatArray68[1], this.aClass102_Sub1_5.aFloatArray68[2]);
				local22.aClass463_17.method29502(local442);
				local22.aClass463_22.method29477(this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_16.method29477(-this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat208, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat209, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_21.method29477(this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat210);
				if (this.aClass102_Sub1_5.anInt2977 > 0) {
					local282 = this.aClass102_Sub1_5.anInt2977;
					@Pc(567) Class463 local567 = this.aClass102_Sub1_5.aClass463_59;
					for (local569 = 0; local569 < local282; local569++) {
						@Pc(578) Class80_Sub12 local578 = this.aClass102_Sub1_5.aClass80_Sub12Array19[local569];
						@Pc(582) int local582 = local578.method13953((byte) 64);
						local567.method29478(local578.aClass463_45);
						local567.method29537(local442);
						local22.aFloatArray38[local569 * 4] = local567.aFloat297;
						local22.aFloatArray38[local569 * 4 + 1] = local567.aFloat295;
						local22.aFloatArray38[local569 * 4 + 2] = local567.aFloat296;
						local22.aFloatArray38[local569 * 4 + 3] = 1.0F / (float) (local578.method13952(-432544427) * local578.method13952(-432544427));
						@Pc(643) float local643 = local578.method13954(2066372004) / 255.0F;
						local22.aFloatArray37[local569 * 4] = (float) (local582 >> 16 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 1] = (float) (local582 >> 8 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 2] = (float) (local582 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray88.length; local289++) {
				local569 = this.anIntArray86[local289];
				@Pc(719) int local719 = this.anIntArray86[local289 + 1];
				@Pc(724) short local724 = this.aShortArray33[local569];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class227 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(809) float[] local809 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local809[12] = 0.0F;
				} else {
					local728 = this.aClass102_Sub1_5.aClass235_6.method26120(local724 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local728);
					local726 = local728.aByte110;
					local22.method9393(local728.aByte116);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat263 % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat264 % 1.0F;
					if (local728.aClass608_2 == Class608.aClass608_3) {
						local730 = local728.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local730);
				local22.anInt1107 = this.anIntArray88[local289];
				local22.anInt1108 = this.anIntArray87[local289];
				local22.anInt1105 = local569 * 3;
				local22.anInt1109 = local719 - local569;
				switch(local726) {
					case 1:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.method9404(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9396(local282);
						break;
					case 5:
						if (this.aClass102_Sub1_5.aBoolean518) {
							local22.method9396(local282);
						} else {
							@Pc(893) Class131_Sub1_Sub2 local893 = this.aClass102_Sub1_5.aClass131_Sub1_Sub2_3;
							local893.method20494(local728.aByte116, local728.anInt3660 * 260749353, (short) 128);
							local893.aClass487_72.method30080(arg0);
							local893.aClass487_73.method30080(arg0);
							local893.aClass487_73.method30078(this.aClass102_Sub1_5.aClass487_78);
							local893.anInt2877 = this.anIntArray88[local289] * -1895357069;
							local893.anInt2878 = this.anIntArray87[local289] * 36252407;
							local893.anInt2879 = local569 * -1193706545;
							local893.anInt2880 = (local719 - local569) * 262854753;
							local893.method20491(-236482043);
						}
						break;
					case 6:
						local22.method9410(!Class58.method15723(local726, (byte) 1));
						break;
					case 7:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.aClass487_36.method30080(arg0);
						local22.anInterface42_3 = this.aClass102_Sub1_5.method21170();
						local22.method9409(local282);
				}
			}
		}
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "ji", descriptor = "(Lclient!ov;)V")
	void method7569(@OriginalArg(0) Class471 arg0) {
		if (this.anInt880 == 0 || (!this.method7557() || !this.method7556())) {
			return;
		}
		if (aClass410_1 != null) {
		}
		this.aClass102_Sub1_5.method21260();
		this.aClass102_Sub1_5.method21202();
		@Pc(22) Class119 local22 = this.aClass102_Sub1_5.aClass119_3;
		this.aClass102_Sub1_5.method21250(0, this.aClass418_1.anInterface38_21);
		this.aClass102_Sub1_5.method21250(1, this.aClass418_4.anInterface38_21);
		this.aClass102_Sub1_5.method21250(2, this.aClass418_2.anInterface38_21);
		this.aClass102_Sub1_5.method21251(this.aClass409_1.anInterface44_8);
		this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
		local22.method9392(this.aClass102_Sub1_5.aClass487_80);
		local22.aClass487_35.method30139();
		if (this.aClass102_Sub1_5.aBoolean524) {
			@Pc(70) Class229 local70 = this.aClass102_Sub1_5.method21283();
			local22.aClass456_5.method29337(0.0F, 1.0F, 0.0F, (float) -this.aClass102_Sub1_5.anInt3002);
			local22.aClass456_5.method29342(3.0F / (float) (local70.anInt3685 * -692202347));
			local22.aClass463_20.method29477((float) (local70.anInt3687 * 1682209477 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3687 * 1682209477 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass456_5.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_20.method29477(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass102_Sub1_5.anInt2985 > 0) {
			local22.aClass456_6.method29337(0.0F, 0.0F, 1.0F, -this.aClass102_Sub1_5.aFloat217);
			local22.aClass463_19.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_5.method29343(this.aClass102_Sub1_5.aClass487_80);
			this.aClass102_Sub1_5.aClass487_80.method30080(arg0);
			this.aClass102_Sub1_5.aClass487_80.method30078(this.aClass102_Sub1_5.aClass487_75);
			this.aClass102_Sub1_5.aClass487_80.method30069();
			local22.aClass456_6.method29343(this.aClass102_Sub1_5.aClass487_80);
			local22.aClass456_6.method29342(1.0F / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217));
		} else {
			local22.aClass456_6.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass463_19.method29477(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt875 & 0x37) == 0) {
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_19);
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray88.length; local272++) {
				local282 = this.anIntArray86[local272];
				local289 = this.anIntArray86[local272 + 1];
				@Pc(294) short local294 = this.aShortArray33[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(383) float[] local383 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local383[12] = 0.0F;
				} else {
					@Pc(310) Class227 local310 = this.aClass102_Sub1_5.aClass235_6.method26120(local294 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local310);
					local296 = !Class58.method15723(local310.aByte110, (byte) 1);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat263 / 64.0F % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local310.aFloat264 / 64.0F % 1.0F;
					if (local310.aClass608_2 == Class608.aClass608_3) {
						local298 = local310.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local298);
				local22.anInt1107 = this.anIntArray88[local272];
				local22.anInt1108 = this.anIntArray87[local272];
				local22.anInt1105 = local282 * 3;
				local22.anInt1109 = local289 - local282;
				local22.method9410(local296);
			}
		} else {
			this.aClass102_Sub1_5.method21250(3, this.aClass418_3.anInterface38_21);
			this.aClass102_Sub1_5.method21158(this.aClass102_Sub1_5.aClass135_21);
			@Pc(442) Class471 local442 = this.aClass102_Sub1_5.aClass471_35;
			local442.method29760(arg0);
			local442.method29768();
			local282 = 0;
			@Pc(569) int local569;
			if (this.aClass102_Sub1_5.aBoolean518) {
				this.aClass102_Sub1_5.method21194(true);
			} else {
				local22.aClass463_17.method29477(this.aClass102_Sub1_5.aFloatArray68[0], this.aClass102_Sub1_5.aFloatArray68[1], this.aClass102_Sub1_5.aFloatArray68[2]);
				local22.aClass463_17.method29502(local442);
				local22.aClass463_22.method29477(this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat214 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_16.method29477(-this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat208, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat209, -this.aClass102_Sub1_5.aFloat216 * this.aClass102_Sub1_5.aFloat210);
				local22.aClass463_21.method29477(this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat208, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat209, this.aClass102_Sub1_5.aFloat212 * this.aClass102_Sub1_5.aFloat210);
				if (this.aClass102_Sub1_5.anInt2977 > 0) {
					local282 = this.aClass102_Sub1_5.anInt2977;
					@Pc(567) Class463 local567 = this.aClass102_Sub1_5.aClass463_59;
					for (local569 = 0; local569 < local282; local569++) {
						@Pc(578) Class80_Sub12 local578 = this.aClass102_Sub1_5.aClass80_Sub12Array19[local569];
						@Pc(582) int local582 = local578.method13953((byte) 82);
						local567.method29478(local578.aClass463_45);
						local567.method29537(local442);
						local22.aFloatArray38[local569 * 4] = local567.aFloat297;
						local22.aFloatArray38[local569 * 4 + 1] = local567.aFloat295;
						local22.aFloatArray38[local569 * 4 + 2] = local567.aFloat296;
						local22.aFloatArray38[local569 * 4 + 3] = 1.0F / (float) (local578.method13952(-432544427) * local578.method13952(-432544427));
						@Pc(643) float local643 = local578.method13954(1862718097) / 255.0F;
						local22.aFloatArray37[local569 * 4] = (float) (local582 >> 16 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 1] = (float) (local582 >> 8 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 2] = (float) (local582 & 0xFF) * local643;
						local22.aFloatArray37[local569 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray88.length; local289++) {
				local569 = this.anIntArray86[local289];
				@Pc(719) int local719 = this.anIntArray86[local289 + 1];
				@Pc(724) short local724 = this.aShortArray33[local569];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class227 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface34_8 = this.aClass102_Sub1_5.anInterface34_23;
					@Pc(809) float[] local809 = local22.aClass487_35.aFloatArray114;
					local22.aClass487_35.aFloatArray114[13] = 0.0F;
					local809[12] = 0.0F;
				} else {
					local728 = this.aClass102_Sub1_5.aClass235_6.method26120(local724 & 0xFFFF, 73831368);
					local22.anInterface34_8 = this.aClass102_Sub1_5.aClass395_3.method28692(local728);
					local726 = local728.aByte110;
					local22.method9393(local728.aByte116);
					local22.aClass487_35.aFloatArray114[12] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat263 % 1.0F;
					local22.aClass487_35.aFloatArray114[13] = (float) (this.aClass102_Sub1_5.anInt3000 % 128000) / 1000.0F * local728.aFloat264 % 1.0F;
					if (local728.aClass608_2 == Class608.aClass608_3) {
						local730 = local728.aByte113;
					}
				}
				this.aClass102_Sub1_5.method21134(local730);
				local22.anInt1107 = this.anIntArray88[local289];
				local22.anInt1108 = this.anIntArray87[local289];
				local22.anInt1105 = local569 * 3;
				local22.anInt1109 = local719 - local569;
				switch(local726) {
					case 1:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.method9404(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9396(local282);
						break;
					case 5:
						if (this.aClass102_Sub1_5.aBoolean518) {
							local22.method9396(local282);
						} else {
							@Pc(893) Class131_Sub1_Sub2 local893 = this.aClass102_Sub1_5.aClass131_Sub1_Sub2_3;
							local893.method20494(local728.aByte116, local728.anInt3660 * 260749353, (short) 128);
							local893.aClass487_72.method30080(arg0);
							local893.aClass487_73.method30080(arg0);
							local893.aClass487_73.method30078(this.aClass102_Sub1_5.aClass487_78);
							local893.anInt2877 = this.anIntArray88[local289] * -1895357069;
							local893.anInt2878 = this.anIntArray87[local289] * 36252407;
							local893.anInt2879 = local569 * -1193706545;
							local893.anInt2880 = (local719 - local569) * 262854753;
							local893.method20491(-774234907);
						}
						break;
					case 6:
						local22.method9410(!Class58.method15723(local726, (byte) 1));
						break;
					case 7:
						local22.aClass463_18.method29477(this.aClass102_Sub1_5.aClass487_76.aFloatArray114[12], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[13], this.aClass102_Sub1_5.aClass487_76.aFloatArray114[14]);
						local22.aClass463_18.method29537(local442);
						local22.aClass487_36.method30080(arg0);
						local22.anInterface42_3 = this.aClass102_Sub1_5.method21170();
						local22.method9409(local282);
				}
			}
		}
		this.method7542();
	}

	@OriginalMember(owner = "client!afw", name = "dy", descriptor = "()I")
	@Override
	public int method7487() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt887;
	}

	@OriginalMember(owner = "client!afw", name = "hs", descriptor = "()V")
	void method7570() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "fc", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7567(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afw", name = "ec", descriptor = "()I")
	@Override
	public int method7372() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt888;
	}

	@OriginalMember(owner = "client!afw", name = "ev", descriptor = "()I")
	@Override
	public int method7388() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt888;
	}

	@OriginalMember(owner = "client!afw", name = "if", descriptor = "(IIIIIIIIII)Z")
	boolean method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!afw", name = "eo", descriptor = "()I")
	@Override
	public int method7498() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt881;
	}

	@OriginalMember(owner = "client!afw", name = "ep", descriptor = "()I")
	@Override
	public int method7452() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt881;
	}

	@OriginalMember(owner = "client!afw", name = "bl", descriptor = "()V")
	@Override
	public void method7371() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "ee", descriptor = "()I")
	@Override
	public int method7403() {
		if (!this.aBoolean175) {
			this.method7371();
		}
		return this.anInt890;
	}

	@OriginalMember(owner = "client!afw", name = "ey", descriptor = "(I)V")
	@Override
	public void method7457(@OriginalArg(0) int arg0) {
		this.aShort20 = (short) arg0;
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "ez", descriptor = "(I)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0) {
		this.aShort20 = (short) arg0;
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "fk", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(9) int local9 = arg4 + this.anInt886;
		@Pc(14) int local14 = arg4 + this.anInt887;
		@Pc(19) int local19 = arg6 + this.anInt888;
		@Pc(24) int local24 = arg6 + this.anInt881;
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
			if (arg2.method2917(local9, local19, -1322155144) == arg5 && arg2.method2917(local14, local19, -615127054) == arg5 && arg2.method2917(local9, local24, -855444421) == arg5 && arg2.method2917(local14, local24, -352259819) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt877; local195++) {
				this.anIntArray82[local195] = this.anIntArray82[local195] + arg2.method2950(this.anIntArray81[local195] + arg4, this.anIntArray83[local195] + arg6, 1474171771) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt884;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt877; local239++) {
					local252 = (this.anIntArray82[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray82[local239] += (arg2.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, 363531698) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						this.anIntArray82[local239] = this.anIntArray82[local239] + (arg3.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, -533851397) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						local252 = this.anIntArray81[local239] + arg4;
						local323 = this.anIntArray83[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, 563322888);
						@Pc(474) int local474 = arg3.method2950(local252, local323, -1998035730);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray82[local239] = ((this.anIntArray82[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ek", descriptor = "(I)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.method7570();
		this.method7544();
	}

	@OriginalMember(owner = "client!afw", name = "hx", descriptor = "()[B")
	@Override
	public byte[] method7535() {
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!afw", name = "eh", descriptor = "()I")
	@Override
	public int method7466() {
		return this.aShort20;
	}

	@OriginalMember(owner = "client!afw", name = "el", descriptor = "()I")
	@Override
	public int method7461() {
		return this.aShort20;
	}

	@OriginalMember(owner = "client!afw", name = "em", descriptor = "()I")
	@Override
	public int method7462() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!afw", name = "h", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(9) int local9 = arg4 + this.anInt886;
		@Pc(14) int local14 = arg4 + this.anInt887;
		@Pc(19) int local19 = arg6 + this.anInt888;
		@Pc(24) int local24 = arg6 + this.anInt881;
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
			if (arg2.method2917(local9, local19, -1199350447) == arg5 && arg2.method2917(local14, local19, -1133224372) == arg5 && arg2.method2917(local9, local24, -339425233) == arg5 && arg2.method2917(local14, local24, -2120369396) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt877; local195++) {
				this.anIntArray82[local195] = this.anIntArray82[local195] + arg2.method2950(this.anIntArray81[local195] + arg4, this.anIntArray83[local195] + arg6, -140318411) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt884;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt877; local239++) {
					local252 = (this.anIntArray82[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray82[local239] += (arg2.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, -1872316116) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						this.anIntArray82[local239] = this.anIntArray82[local239] + (arg3.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, -982118440) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						local252 = this.anIntArray81[local239] + arg4;
						local323 = this.anIntArray83[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, 330577410);
						@Pc(474) int local474 = arg3.method2950(local252, local323, 1979359281);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray82[local239] = ((this.anIntArray82[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "eu", descriptor = "()I")
	@Override
	public int method7464() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!afw", name = "es", descriptor = "()I")
	@Override
	public int method7465() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!afw", name = "er", descriptor = "(SS)V")
	@Override
	public void method7379(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt879; local1++) {
			if (this.aShortArray32[local1] == arg0) {
				this.aShortArray32[local1] = arg1;
			}
		}
		if (this.aClass414Array1 != null) {
			for (local1 = 0; local1 < this.anInt891; local1++) {
				@Pc(32) Class414 local32 = this.aClass414Array1[local1];
				@Pc(37) Class408 local37 = this.aClass408Array1[local1];
				local37.anInt4609 = local37.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local32.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "en", descriptor = "(B[B)V")
	@Override
	public void method7467(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt879; local3++) {
				this.aByteArray28[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt879; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray28[local3] = (byte) local39;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "ex", descriptor = "(SS)V")
	@Override
	public void method7468(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_5.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt879; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
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
				this.aBoolean176 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass414Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt891; local94++) {
				@Pc(103) Class414 local103 = this.aClass414Array1[local94];
				@Pc(108) Class408 local108 = this.aClass408Array1[local94];
				local108.anInt4609 = local108.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local103.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "eg", descriptor = "(SS)V")
	@Override
	public void method7469(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_5.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt879; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
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
				this.aBoolean176 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass414Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt891; local94++) {
				@Pc(103) Class414 local103 = this.aClass414Array1[local94];
				@Pc(108) Class408 local108 = this.aClass408Array1[local94];
				local108.anInt4609 = local108.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local103.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "eb", descriptor = "(SS)V")
	@Override
	public void method7470(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class235 local3 = this.aClass102_Sub1_5.aClass235_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt879; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
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
				this.aBoolean176 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass414Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt891; local94++) {
				@Pc(103) Class414 local103 = this.aClass414Array1[local94];
				@Pc(108) Class408 local108 = this.aClass408Array1[local94];
				local108.anInt4609 = local108.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local103.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "dp", descriptor = "()I")
	@Override
	public int method7441() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt883;
	}

	@OriginalMember(owner = "client!afw", name = "ei", descriptor = "(IIII)V")
	@Override
	public void method7471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(12) int local12 = this.aShortArray32[local1] & 0xFFFF;
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
			this.aShortArray32[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass414Array1 != null) {
			for (local1 = 0; local1 < this.anInt891; local1++) {
				@Pc(97) Class414 local97 = this.aClass414Array1[local1];
				@Pc(102) Class408 local102 = this.aClass408Array1[local1];
				local102.anInt4609 = local102.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local97.anInt4618] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7543();
	}

	@OriginalMember(owner = "client!afw", name = "eq", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7473() {
		return this.aClass228Array3;
	}

	@OriginalMember(owner = "client!afw", name = "fv", descriptor = "()[Lclient!cp;")
	@Override
	public Class211[] method7429() {
		return this.aClass211Array3;
	}

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "(I)V")
	@Override
	public void method7329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt877; local9++) {
			local29 = this.anIntArray83[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray83[local9] = this.anIntArray83[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt878; local9++) {
			local29 = this.aShortArray30[local9] * local3 + this.aShortArray28[local9] * local7 >> 14;
			this.aShortArray30[local9] = (short) (this.aShortArray30[local9] * local7 - this.aShortArray28[local9] * local3 >> 14);
			this.aShortArray28[local9] = (short) local29;
		}
		this.method7570();
		this.method7544();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "fp", descriptor = "()Z")
	@Override
	public boolean method7449() {
		return this.aBoolean178;
	}

	@OriginalMember(owner = "client!afw", name = "fx", descriptor = "()Z")
	@Override
	public boolean method7477() {
		return this.aBoolean178;
	}

	@OriginalMember(owner = "client!afw", name = "fj", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt877; local9++) {
			local29 = this.anIntArray83[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray83[local9] = this.anIntArray83[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt878; local9++) {
			local29 = this.aShortArray30[local9] * local3 + this.aShortArray28[local9] * local7 >> 14;
			this.aShortArray30[local9] = (short) (this.aShortArray30[local9] * local7 - this.aShortArray28[local9] * local3 >> 14);
			this.aShortArray28[local9] = (short) local29;
		}
		this.method7570();
		this.method7544();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ft", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7409(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt878 == 0) {
			return null;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub1_5.anInt2981 > 0) {
			local29 = this.anInt886 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local29 = this.anInt886 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub1_5.anInt2982 > 0) {
			local98 = this.anInt888 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local98 = this.anInt888 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub2 local162 = (Class80_Sub1_Sub10_Sub2) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub2 local171;
		if (local162 != null && local162.method24027(local153, local159)) {
			local171 = local162;
			local162.method24021();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_5, local153, local159);
		}
		local171.method24019(local29, local98, local45, local114);
		this.method7552(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afw", name = "je", descriptor = "(Lclient!atu;)V")
	void method7573(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "fa", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(9) int local9 = arg4 + this.anInt886;
		@Pc(14) int local14 = arg4 + this.anInt887;
		@Pc(19) int local19 = arg6 + this.anInt888;
		@Pc(24) int local24 = arg6 + this.anInt881;
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
			if (arg2.method2917(local9, local19, -1302205223) == arg5 && arg2.method2917(local14, local19, -1796232858) == arg5 && arg2.method2917(local9, local24, -1782343116) == arg5 && arg2.method2917(local14, local24, -661470090) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt877; local195++) {
				this.anIntArray82[local195] = this.anIntArray82[local195] + arg2.method2950(this.anIntArray81[local195] + arg4, this.anIntArray83[local195] + arg6, -2085725714) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt884;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt877; local239++) {
					local252 = (this.anIntArray82[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray82[local239] += (arg2.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, 1845589011) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						this.anIntArray82[local239] = this.anIntArray82[local239] + (arg3.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, -882606851) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						local252 = this.anIntArray81[local239] + arg4;
						local323 = this.anIntArray83[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, -714926642);
						@Pc(474) int local474 = arg3.method2950(local252, local323, 1439857272);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray82[local239] = ((this.anIntArray82[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "fz", descriptor = "(IILclient!cb;Lclient!cb;III)V")
	@Override
	public void method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(9) int local9 = arg4 + this.anInt886;
		@Pc(14) int local14 = arg4 + this.anInt887;
		@Pc(19) int local19 = arg6 + this.anInt888;
		@Pc(24) int local24 = arg6 + this.anInt881;
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
			if (arg2.method2917(local9, local19, -1630638767) == arg5 && arg2.method2917(local14, local19, -922973159) == arg5 && arg2.method2917(local9, local24, -1739712694) == arg5 && arg2.method2917(local14, local24, -1221830417) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt877; local195++) {
				this.anIntArray82[local195] = this.anIntArray82[local195] + arg2.method2950(this.anIntArray81[local195] + arg4, this.anIntArray83[local195] + arg6, -399347848) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt884;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt877; local239++) {
					local252 = (this.anIntArray82[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray82[local239] += (arg2.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, 1147674914) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						this.anIntArray82[local239] = this.anIntArray82[local239] + (arg3.method2950(this.anIntArray81[local239] + arg4, this.anIntArray83[local239] + arg6, -1974673232) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt885 - this.anInt884;
					for (local239 = 0; local239 < this.anInt877; local239++) {
						local252 = this.anIntArray81[local239] + arg4;
						local323 = this.anIntArray83[local239] + arg6;
						@Pc(468) int local468 = arg2.method2950(local252, local323, -565454837);
						@Pc(474) int local474 = arg3.method2950(local252, local323, 2051490472);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray82[local239] = ((this.anIntArray82[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ah", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7445(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray15.length) {
					local46 = this.anIntArrayArray15[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local56]) != 0) {
							this.anInt893 += this.anIntArray81[local56];
							this.anInt894 += this.anIntArray82[local56];
							this.anInt895 += this.anIntArray83[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt893 = this.anInt893 / local18 + arg2;
				this.anInt894 = this.anInt894 / local18 + arg3;
				this.anInt895 = this.anInt895 / local18 + arg4;
				this.aBoolean181 = true;
			} else {
				this.anInt893 = arg2;
				this.anInt894 = arg3;
				this.anInt895 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] += arg2;
							this.anIntArray82[local48] += arg3;
							this.anIntArray83[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray15.length) {
						local247 = this.anIntArrayArray15[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
								this.anIntArray81[local48] -= this.anInt893;
								this.anIntArray82[local48] -= this.anInt894;
								this.anIntArray83[local48] -= this.anInt895;
								if (arg4 != 0) {
									local56 = Class467.anIntArray454[arg4];
									local366 = Class467.anIntArray453[arg4];
									local391 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = this.anIntArray82[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class467.anIntArray454[arg2];
									local366 = Class467.anIntArray453[arg2];
									local391 = this.anIntArray82[local48] * local366 - this.anIntArray83[local48] * local56 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class467.anIntArray454[arg3];
									local366 = Class467.anIntArray453[arg3];
									local391 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray83[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								this.anIntArray81[local48] += this.anInt893;
								this.anIntArray82[local48] += this.anInt894;
								this.anIntArray83[local48] += this.anInt895;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray15.length) {
							local247 = this.anIntArrayArray15[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
									local56 = this.anIntArray85[local48];
									local366 = this.anIntArray85[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class467.anIntArray454[arg4];
											local459 = Class467.anIntArray453[arg4];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class467.anIntArray454[arg2];
											local459 = Class467.anIntArray453[arg2];
											local463 = this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14);
											this.aShortArray39[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class467.anIntArray454[arg3];
											local459 = Class467.anIntArray453[arg3];
											local463 = this.aShortArray30[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray30[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7544();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean181) {
					local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
					local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
					local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt893 = local366;
					this.anInt894 = local391;
					this.anInt895 = local416;
					this.aBoolean181 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class467.anIntArray453[arg2];
				local416 = Class467.anIntArray454[arg2];
				local455 = Class467.anIntArray453[arg3];
				local459 = Class467.anIntArray454[arg3];
				local463 = Class467.anIntArray453[arg4];
				local467 = Class467.anIntArray454[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt893 + local443[1] * -this.anInt894 + local443[2] * -this.anInt895 + 8192 >> 14;
				local642 = local443[3] * -this.anInt893 + local443[4] * -this.anInt894 + local443[5] * -this.anInt895 + 8192 >> 14;
				local670 = local443[6] * -this.anInt893 + local443[7] * -this.anInt894 + local443[8] * -this.anInt895 + 8192 >> 14;
				local675 = local614 + this.anInt893;
				@Pc(680) int local680 = local642 + this.anInt894;
				local685 = local670 + this.anInt895;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray15.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray15[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray81[local982] + local822[1] * this.anIntArray82[local982] + local822[2] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray81[local982] + local822[4] * this.anIntArray82[local982] + local822[5] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray81[local982] + local822[7] * this.anIntArray82[local982] + local822[8] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray81[local982] = local1090;
								this.anIntArray82[local982] = local1094;
								this.anIntArray83[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class414 local2520;
			@Pc(2525) Class408 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray14.length) {
							local46 = this.anIntArrayArray14[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
									local366 = (this.aByteArray28[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray28[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass414Array1 != null) {
							for (local29 = 0; local29 < this.anInt891; local29++) {
								local2520 = this.aClass414Array1[local29];
								local2525 = this.aClass408Array1[local29];
								local2525.anInt4609 = local2525.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local2520.anInt4618] & 0xFF) << 24;
							}
						}
						this.method7543();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class408 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4612 += arg2;
									local2764.anInt4613 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4610 = local2764.anInt4610 * arg2 >> 7;
									local2764.anInt4611 = local2764.anInt4611 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray16.length) {
							local247 = this.anIntArrayArray16[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass408Array1[local247[local249]];
								local2764.anInt4614 = local2764.anInt4614 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray14 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray14.length) {
						local46 = this.anIntArrayArray14[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
								local366 = this.aShortArray32[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray32[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass414Array1 != null) {
						for (local29 = 0; local29 < this.anInt891; local29++) {
							local2520 = this.aClass414Array1[local29];
							local2525 = this.aClass408Array1[local29];
							local2525.anInt4609 = local2525.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local2520.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg2 >> 7;
							this.anIntArray82[local48] = this.anIntArray82[local48] * arg3 >> 7;
							this.anIntArray83[local48] = this.anIntArray83[local48] * arg4 >> 7;
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean181) {
				local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
				local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
				local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt893 = local366;
				this.anInt894 = local391;
				this.anInt895 = local416;
				this.aBoolean181 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt893 + 8192 >> 14;
			local459 = local391 * -this.anInt894 + 8192 >> 14;
			local463 = local416 * -this.anInt895 + 8192 >> 14;
			local467 = local455 + this.anInt893;
			local475 = local459 + this.anInt894;
			local483 = local463 + this.anInt895;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray15.length) {
					local822 = this.anIntArrayArray15[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray81[local829] + local1985[1] * this.anIntArray82[local829] + local1985[2] * this.anIntArray83[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray81[local829] + local1985[4] * this.anIntArray82[local829] + local1985[5] * this.anIntArray83[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray81[local829] + local1985[7] * this.anIntArray82[local829] + local1985[8] * this.anIntArray83[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray81[local829] = local2253;
							this.anIntArray82[local829] = local2257;
							this.anIntArray83[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "fh", descriptor = "()I")
	@Override
	public int method7531() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt886;
	}

	@OriginalMember(owner = "client!afw", name = "dd", descriptor = "(I[IIIIZI[I)V")
	@Override
	void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt893 = 0;
			this.anInt894 = 0;
			this.anInt895 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray15.length) {
					local46 = this.anIntArrayArray15[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local56]) != 0) {
							this.anInt893 += this.anIntArray81[local56];
							this.anInt894 += this.anIntArray82[local56];
							this.anInt895 += this.anIntArray83[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt893 = this.anInt893 / local18 + arg2;
				this.anInt894 = this.anInt894 / local18 + arg3;
				this.anInt895 = this.anInt895 / local18 + arg4;
				this.aBoolean181 = true;
			} else {
				this.anInt893 = arg2;
				this.anInt894 = arg3;
				this.anInt895 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] += arg2;
							this.anIntArray82[local48] += arg3;
							this.anIntArray83[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray15.length) {
						local247 = this.anIntArrayArray15[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
								this.anIntArray81[local48] -= this.anInt893;
								this.anIntArray82[local48] -= this.anInt894;
								this.anIntArray83[local48] -= this.anInt895;
								if (arg4 != 0) {
									local56 = Class467.anIntArray454[arg4];
									local366 = Class467.anIntArray453[arg4];
									local391 = this.anIntArray82[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = this.anIntArray82[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class467.anIntArray454[arg2];
									local366 = Class467.anIntArray453[arg2];
									local391 = this.anIntArray82[local48] * local366 - this.anIntArray83[local48] * local56 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray82[local48] * local56 + this.anIntArray83[local48] * local366 + 16383 >> 14;
									this.anIntArray82[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class467.anIntArray454[arg3];
									local366 = Class467.anIntArray453[arg3];
									local391 = this.anIntArray83[local48] * local56 + this.anIntArray81[local48] * local366 + 16383 >> 14;
									this.anIntArray83[local48] = this.anIntArray83[local48] * local366 - this.anIntArray81[local48] * local56 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								this.anIntArray81[local48] += this.anInt893;
								this.anIntArray82[local48] += this.anInt894;
								this.anIntArray83[local48] += this.anInt895;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray15.length) {
							local247 = this.anIntArrayArray15[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
									local56 = this.anIntArray85[local48];
									local366 = this.anIntArray85[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class467.anIntArray454[arg4];
											local459 = Class467.anIntArray453[arg4];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class467.anIntArray454[arg2];
											local459 = Class467.anIntArray453[arg2];
											local463 = this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14);
											this.aShortArray39[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class467.anIntArray454[arg3];
											local459 = Class467.anIntArray453[arg3];
											local463 = this.aShortArray30[local416] * local455 + this.aShortArray28[local416] * local459 + 16383 >> 14;
											this.aShortArray30[local416] = (short) (this.aShortArray30[local416] * local459 - this.aShortArray28[local416] * local455 + 16383 >> 14);
											this.aShortArray28[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7544();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean181) {
					local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
					local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
					local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt893 = local366;
					this.anInt894 = local391;
					this.anInt895 = local416;
					this.aBoolean181 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class467.anIntArray453[arg2];
				local416 = Class467.anIntArray454[arg2];
				local455 = Class467.anIntArray453[arg3];
				local459 = Class467.anIntArray454[arg3];
				local463 = Class467.anIntArray453[arg4];
				local467 = Class467.anIntArray454[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt893 + local443[1] * -this.anInt894 + local443[2] * -this.anInt895 + 8192 >> 14;
				local642 = local443[3] * -this.anInt893 + local443[4] * -this.anInt894 + local443[5] * -this.anInt895 + 8192 >> 14;
				local670 = local443[6] * -this.anInt893 + local443[7] * -this.anInt894 + local443[8] * -this.anInt895 + 8192 >> 14;
				local675 = local614 + this.anInt893;
				@Pc(680) int local680 = local642 + this.anInt894;
				local685 = local670 + this.anInt895;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray15.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray15[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray81[local982] + local822[1] * this.anIntArray82[local982] + local822[2] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray81[local982] + local822[4] * this.anIntArray82[local982] + local822[5] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray81[local982] + local822[7] * this.anIntArray82[local982] + local822[8] * this.anIntArray83[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray81[local982] = local1090;
								this.anIntArray82[local982] = local1094;
								this.anIntArray83[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class414 local2520;
			@Pc(2525) Class408 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray14.length) {
							local46 = this.anIntArrayArray14[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
									local366 = (this.aByteArray28[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray28[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass414Array1 != null) {
							for (local29 = 0; local29 < this.anInt891; local29++) {
								local2520 = this.aClass414Array1[local29];
								local2525 = this.aClass408Array1[local29];
								local2525.anInt4609 = local2525.anInt4609 & 0xFFFFFF | 255 - (this.aByteArray28[local2520.anInt4618] & 0xFF) << 24;
							}
						}
						this.method7543();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class408 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4612 += arg2;
									local2764.anInt4613 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass408Array1[local247[local249]];
									local2764.anInt4610 = local2764.anInt4610 * arg2 >> 7;
									local2764.anInt4611 = local2764.anInt4611 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray16.length) {
							local247 = this.anIntArrayArray16[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass408Array1[local247[local249]];
								local2764.anInt4614 = local2764.anInt4614 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray14 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray14.length) {
						local46 = this.anIntArrayArray14[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
								local366 = this.aShortArray32[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray32[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass414Array1 != null) {
						for (local29 = 0; local29 < this.anInt891; local29++) {
							local2520 = this.aClass414Array1[local29];
							local2525 = this.aClass408Array1[local29];
							local2525.anInt4609 = local2525.anInt4609 & 0xFF000000 | Class687.anIntArray524[this.aShortArray32[local2520.anInt4618] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7543();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray15.length) {
					local247 = this.anIntArrayArray15[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local48]) != 0) {
							this.anIntArray81[local48] -= this.anInt893;
							this.anIntArray82[local48] -= this.anInt894;
							this.anIntArray83[local48] -= this.anInt895;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg2 >> 7;
							this.anIntArray82[local48] = this.anIntArray82[local48] * arg3 >> 7;
							this.anIntArray83[local48] = this.anIntArray83[local48] * arg4 >> 7;
							this.anIntArray81[local48] += this.anInt893;
							this.anIntArray82[local48] += this.anInt894;
							this.anIntArray83[local48] += this.anInt895;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean181) {
				local366 = arg7[0] * this.anInt893 + arg7[3] * this.anInt894 + arg7[6] * this.anInt895 + 8192 >> 14;
				local391 = arg7[1] * this.anInt893 + arg7[4] * this.anInt894 + arg7[7] * this.anInt895 + 8192 >> 14;
				local416 = arg7[2] * this.anInt893 + arg7[5] * this.anInt894 + arg7[8] * this.anInt895 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt893 = local366;
				this.anInt894 = local391;
				this.anInt895 = local416;
				this.aBoolean181 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt893 + 8192 >> 14;
			local459 = local391 * -this.anInt894 + 8192 >> 14;
			local463 = local416 * -this.anInt895 + 8192 >> 14;
			local467 = local455 + this.anInt893;
			local475 = local459 + this.anInt894;
			local483 = local463 + this.anInt895;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray15.length) {
					local822 = this.anIntArrayArray15[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray81[local829] + local1985[1] * this.anIntArray82[local829] + local1985[2] * this.anIntArray83[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray81[local829] + local1985[4] * this.anIntArray82[local829] + local1985[5] * this.anIntArray83[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray81[local829] + local1985[7] * this.anIntArray82[local829] + local1985[8] * this.anIntArray83[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray81[local829] = local2253;
							this.anIntArray82[local829] = local2257;
							this.anIntArray83[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "fo", descriptor = "()Z")
	@Override
	public boolean method7486() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!afw", name = "ku", descriptor = "()Z")
	boolean method7574() {
		if (this.aClass409_1.aBoolean857) {
			return true;
		}
		if (this.aClass409_1.anInterface44_7 == null) {
			this.aClass409_1.anInterface44_7 = this.aClass102_Sub1_5.method21246(false);
		}
		@Pc(20) Interface44 local20 = this.aClass409_1.anInterface44_7;
		local20.method29401(this.anInt880 * 6);
		@Pc(30) Unsafe local30 = this.aClass102_Sub1_5.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt880 * 6;
			@Pc(42) long local42 = local20.method29384(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt880; local50++) {
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray29[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray38[local50]);
				local42 += 2L;
			}
			local20.method29385();
			this.aClass409_1.anInterface44_8 = local20;
			this.aClass409_1.aBoolean857 = true;
			this.aBoolean177 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass102_Sub1_5.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt880; local113++) {
			local108.putShort(this.aShortArray36[local113]);
			local108.putShort(this.aShortArray29[local113]);
			local108.putShort(this.aShortArray38[local113]);
		}
		if (local20.method29383(0, local108.position(), this.aClass102_Sub1_5.aLong168)) {
			this.aClass409_1.anInterface44_8 = local20;
			this.aClass409_1.aBoolean857 = true;
			this.aBoolean177 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "fb", descriptor = "()Z")
	@Override
	public boolean method7476() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!afw", name = "di", descriptor = "()I")
	@Override
	public int method7489() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt887;
	}

	@OriginalMember(owner = "client!afw", name = "dv", descriptor = "()V")
	@Override
	public void method7451() {
		if (this.aBoolean175) {
			return;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		this.anInt890 = this.anInt884;
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!afw", name = "fl", descriptor = "(IILclient!ov;ZI)Z")
	@Override
	public boolean method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7567(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afw", name = "fg", descriptor = "(Lclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method7317(@OriginalArg(0) Class80_Sub1_Sub10 arg0) {
		if (this.anInt878 == 0) {
			return null;
		}
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass102_Sub1_5.anInt2981 > 0) {
			local29 = this.anInt886 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local29 = this.anInt886 - (this.anInt884 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local45 = this.anInt887 - (this.anInt885 * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass102_Sub1_5.anInt2982 > 0) {
			local98 = this.anInt888 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		} else {
			local98 = this.anInt888 - (this.anInt884 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
			local114 = this.anInt881 - (this.anInt885 * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class80_Sub1_Sub10_Sub2 local162 = (Class80_Sub1_Sub10_Sub2) arg0;
		@Pc(171) Class80_Sub1_Sub10_Sub2 local171;
		if (local162 != null && local162.method24027(local153, local159)) {
			local171 = local162;
			local162.method24021();
		} else {
			local171 = new Class80_Sub1_Sub10_Sub2(this.aClass102_Sub1_5, local153, local159);
		}
		local171.method24019(local29, local98, local45, local114);
		this.method7552(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afw", name = "fw", descriptor = "()Z")
	@Override
	public boolean method7526() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!afw", name = "cu", descriptor = "(III)V")
	@Override
	public void method7338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt877; local1++) {
			if (arg0 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray83[local1] = this.anIntArray83[local1] * arg2 >> 7;
			}
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "gd", descriptor = "()V")
	@Override
	public void method7406() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt877; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
		}
		for (local1 = 0; local1 < this.anInt878; local1++) {
			this.aShortArray30[local1] = (short) -this.aShortArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray38[local1];
			this.aShortArray38[local1] = local45;
		}
		this.method7570();
		this.method7544();
		this.method7548();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "gc", descriptor = "()V")
	@Override
	public void method7510() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt877; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
		}
		for (local1 = 0; local1 < this.anInt878; local1++) {
			this.aShortArray30[local1] = (short) -this.aShortArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray38[local1];
			this.aShortArray38[local1] = local45;
		}
		this.method7570();
		this.method7544();
		this.method7548();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "gj", descriptor = "()V")
	@Override
	public void method7356() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt877; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
		}
		for (local1 = 0; local1 < this.anInt878; local1++) {
			this.aShortArray30[local1] = (short) -this.aShortArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray38[local1];
			this.aShortArray38[local1] = local45;
		}
		this.method7570();
		this.method7544();
		this.method7548();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "gf", descriptor = "()V")
	@Override
	public void method7512() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt877; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
		}
		for (local1 = 0; local1 < this.anInt878; local1++) {
			this.aShortArray30[local1] = (short) -this.aShortArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt879; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray38[local1];
			this.aShortArray38[local1] = local45;
		}
		this.method7570();
		this.method7544();
		this.method7548();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "jg", descriptor = "(Lclient!atu;)V")
	void method7575(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "is", descriptor = "()V")
	void method7576() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		if (this.aClass228Array3 == null && this.aClass211Array3 == null && this.aClass414Array1 == null && !Class399.method28761(this.anInt874, this.anInt875)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray81 != null && !Class399.method28777(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local23 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray82 != null && !Class399.method28756(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local25 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray83 != null && !Class399.method28808(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local27 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (local23) {
				this.anIntArray81 = null;
			}
			if (local25) {
				this.anIntArray82 = null;
			}
			if (local27) {
				this.anIntArray83 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray81 == null && this.anIntArray82 == null && this.anIntArray83 == null) {
			this.aShortArray37 = null;
			this.anIntArray85 = null;
		}
		if (this.aByteArray27 != null && !Class399.method28839(this.anInt874, this.anInt875)) {
			label204: {
				label203: {
					if ((this.anInt875 & 0x37) == 0) {
						if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
							break label203;
						}
					} else if (this.aClass418_3 == null || this.aClass418_3.method28995()) {
						break label203;
					}
					this.aBoolean177 = true;
					break label204;
				}
				this.aShortArray30 = null;
				this.aShortArray39 = null;
				this.aShortArray28 = null;
				this.aByteArray27 = null;
			}
		}
		if (this.aShortArray32 != null && !Class399.method28759(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aByteArray28 != null && !Class399.method28760(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aByteArray28 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aFloatArray29 != null && !Class399.method28796(this.anInt874, this.anInt875)) {
			if (this.aClass418_2 == null || this.aClass418_2.method28995()) {
				this.aFloatArray28 = null;
				this.aFloatArray29 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray33 != null && !Class399.method28762(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray36 != null && !Class399.method28765(this.anInt874, this.anInt875)) {
			if ((this.aClass409_1 == null || this.aClass409_1.method28957()) && (this.aClass418_4 == null || this.aClass418_4.method28995())) {
				this.aShortArray38 = null;
				this.aShortArray29 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray31 != null) {
			if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Class399.method28811(this.anInt874, this.anInt875)) {
			this.anIntArrayArray14 = null;
			this.aShortArray34 = null;
		}
		if (this.anIntArrayArray15 != null && !Class399.method28763(this.anInt874, this.anInt875)) {
			this.anIntArrayArray15 = null;
			this.aShortArray35 = null;
		}
		if (this.anIntArrayArray16 != null && !Class399.method28800(this.anInt874, this.anInt875)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray86 != null && (this.anInt874 & 0x800) == 0 && (this.anInt874 & 0x40000) == 0) {
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ho", descriptor = "()[B")
	@Override
	public byte[] method7537() {
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!afw", name = "hu", descriptor = "()[B")
	@Override
	public byte[] method7538() {
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!afw", name = "iq", descriptor = "(Lclient!dt;IIJIIIIFF)S")
	short method7577(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray85[arg1];
		@Pc(11) int local11 = this.anIntArray85[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt878 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt878] = (short) arg2;
		this.aShortArray31[this.anInt878] = (short) arg1;
		this.aShortArray28[this.anInt878] = (short) arg4;
		this.aShortArray39[this.anInt878] = (short) arg5;
		this.aShortArray30[this.anInt878] = (short) arg6;
		this.aByteArray27[this.anInt878] = (byte) arg7;
		this.aFloatArray29[this.anInt878] = arg8;
		this.aFloatArray28[this.anInt878] = arg9;
		return (short) this.anInt878++;
	}

	@OriginalMember(owner = "client!afw", name = "it", descriptor = "(Lclient!dt;IIJIIIIFF)S")
	short method7578(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray85[arg1];
		@Pc(11) int local11 = this.anIntArray85[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt878 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt878] = (short) arg2;
		this.aShortArray31[this.anInt878] = (short) arg1;
		this.aShortArray28[this.anInt878] = (short) arg4;
		this.aShortArray39[this.anInt878] = (short) arg5;
		this.aShortArray30[this.anInt878] = (short) arg6;
		this.aByteArray27[this.anInt878] = (byte) arg7;
		this.aFloatArray29[this.anInt878] = arg8;
		this.aFloatArray28[this.anInt878] = arg9;
		return (short) this.anInt878++;
	}

	@OriginalMember(owner = "client!afw", name = "fn", descriptor = "()I")
	@Override
	public int method7483() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt886;
	}

	@OriginalMember(owner = "client!afw", name = "bw", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method7389(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class105_Sub3 local2 = (Class105_Sub3) arg0;
		if (this.anInt879 == 0 || local2.anInt879 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt877;
		@Pc(15) int[] local15 = local2.anIntArray81;
		@Pc(18) int[] local18 = local2.anIntArray82;
		@Pc(21) int[] local21 = local2.anIntArray83;
		@Pc(24) short[] local24 = local2.aShortArray28;
		@Pc(27) short[] local27 = local2.aShortArray39;
		@Pc(30) short[] local30 = local2.aShortArray30;
		@Pc(33) byte[] local33 = local2.aByteArray27;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass426_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass426_1.aShortArray129;
			local44 = this.aClass426_1.aShortArray127;
			local48 = this.aClass426_1.aShortArray128;
			local52 = this.aClass426_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass426_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass426_1.aShortArray129;
			local72 = local2.aClass426_1.aShortArray127;
			local76 = local2.aClass426_1.aShortArray128;
			local80 = local2.aClass426_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray85;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean180) {
			local2.method7564();
		}
		@Pc(103) int local103 = local2.anInt884;
		@Pc(106) int local106 = local2.anInt885;
		@Pc(109) int local109 = local2.anInt886;
		@Pc(112) int local112 = local2.anInt887;
		@Pc(115) int local115 = local2.anInt888;
		@Pc(118) int local118 = local2.anInt881;
		for (@Pc(120) int local120 = 0; local120 < this.anInt877; local120++) {
			@Pc(131) int local131 = this.anIntArray82[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray81[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray83[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray85[local120];
						@Pc(180) int local180 = this.anIntArray85[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray27[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass426_1 = new Class426();
											local40 = this.aClass426_1.aShortArray129 = Class114.method8628(this.aShortArray28, 387531912);
											local44 = this.aClass426_1.aShortArray127 = Class114.method8628(this.aShortArray39, 1143783415);
											local48 = this.aClass426_1.aShortArray128 = Class114.method8628(this.aShortArray30, -11868800);
											local52 = this.aClass426_1.aByteArray92 = Class494.method30296(this.aByteArray27, -636312101);
										}
										if (local68 == null) {
											@Pc(325) Class426 local325 = local2.aClass426_1 = new Class426();
											local68 = local325.aShortArray129 = Class114.method8628(local24, 332377066);
											local72 = local325.aShortArray127 = Class114.method8628(local27, 2140480445);
											local76 = local325.aShortArray128 = Class114.method8628(local30, -708341272);
											local80 = local325.aByteArray92 = Class494.method30296(local33, -636312101);
										}
										@Pc(358) short local358 = this.aShortArray28[local168];
										@Pc(363) short local363 = this.aShortArray39[local168];
										@Pc(368) short local368 = this.aShortArray30[local168];
										@Pc(373) byte local373 = this.aByteArray27[local168];
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
										local173 = this.anIntArray85[local120];
										local180 = this.anIntArray85[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7544();
										this.method7544();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "ik", descriptor = "(Lclient!afw;Lclient!afw;IZZ)Lclient!dn;")
	Class105 method7582(@OriginalArg(0) Class105_Sub3 arg0, @OriginalArg(1) Class105_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt874 = arg2;
		arg0.anInt875 = this.anInt875;
		arg0.aShort20 = this.aShort20;
		arg0.aShort19 = this.aShort19;
		arg0.anInt876 = this.anInt876;
		arg0.anInt877 = this.anInt877;
		arg0.anInt878 = this.anInt878;
		arg0.anInt879 = this.anInt879;
		arg0.anInt880 = this.anInt880;
		arg0.anInt891 = this.anInt891;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean178 = this.aBoolean178;
		} else {
			arg0.aBoolean178 = true;
		}
		arg0.aBoolean176 = this.aBoolean176;
		@Pc(59) boolean local59 = Class399.method28733(arg2, this.anInt875);
		@Pc(64) boolean local64 = Class399.method28734(arg2, this.anInt875);
		@Pc(69) boolean local69 = Class399.method28735(arg2, this.anInt875);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt876) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt876];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local64) {
				arg0.anIntArray82 = this.anIntArray82;
			} else if (arg1.anIntArray82 == null || arg1.anIntArray82.length < this.anInt876) {
				arg0.anIntArray82 = arg1.anIntArray82 = new int[this.anInt876];
			} else {
				arg0.anIntArray82 = arg1.anIntArray82;
			}
			if (!local69) {
				arg0.anIntArray83 = this.anIntArray83;
			} else if (arg1.anIntArray83 == null || arg1.anIntArray83.length < this.anInt876) {
				arg0.anIntArray83 = arg1.anIntArray83 = new int[this.anInt876];
			} else {
				arg0.anIntArray83 = arg1.anIntArray83;
			}
			for (local166 = 0; local166 < this.anInt876; local166++) {
				if (local59) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local64) {
					arg0.anIntArray82[local166] = this.anIntArray82[local166];
				}
				if (local69) {
					arg0.anIntArray83[local166] = this.anIntArray83[local166];
				}
			}
		} else {
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray82 = this.anIntArray82;
			arg0.anIntArray83 = this.anIntArray83;
		}
		if (Class399.method28750(arg2, this.anInt875)) {
			arg0.aClass418_1 = arg1.aClass418_1;
			arg0.aClass418_1.anInterface38_21 = this.aClass418_1.anInterface38_21;
			arg0.aClass418_1.aBoolean860 = this.aClass418_1.aBoolean860;
			arg0.aClass418_1.aBoolean859 = true;
		} else if (Class399.method28745(arg2, this.anInt875)) {
			arg0.aClass418_1 = this.aClass418_1;
		} else {
			arg0.aClass418_1 = null;
		}
		if (Class399.method28738(arg2, this.anInt875)) {
			if (arg1.aShortArray32 == null || arg1.aShortArray32.length < this.anInt879) {
				arg0.aShortArray32 = arg1.aShortArray32 = new short[this.anInt879];
			} else {
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray32[local166] = this.aShortArray32[local166];
			}
		} else {
			arg0.aShortArray32 = this.aShortArray32;
		}
		if (Class399.method28739(arg2, this.anInt875)) {
			if (arg1.aByteArray28 == null || arg1.aByteArray28.length < this.anInt879) {
				arg0.aByteArray28 = arg1.aByteArray28 = new byte[this.anInt879];
			} else {
				arg0.aByteArray28 = arg1.aByteArray28;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aByteArray28[local166] = this.aByteArray28[local166];
			}
		} else {
			arg0.aByteArray28 = this.aByteArray28;
		}
		if (Class399.method28752(arg2, this.anInt875)) {
			arg0.aClass418_4 = arg1.aClass418_4;
			arg0.aClass418_4.anInterface38_21 = this.aClass418_4.anInterface38_21;
			arg0.aClass418_4.aBoolean860 = this.aClass418_4.aBoolean860;
			arg0.aClass418_4.aBoolean859 = true;
		} else if (Class399.method28758(arg2, this.anInt875)) {
			arg0.aClass418_4 = this.aClass418_4;
		} else {
			arg0.aClass418_4 = null;
		}
		@Pc(469) int local469;
		if (Class399.method28737(arg2, this.anInt875)) {
			if (arg1.aShortArray28 == null || arg1.aShortArray28.length < this.anInt878) {
				local166 = this.anInt878;
				arg0.aShortArray28 = arg1.aShortArray28 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
			} else {
				arg0.aShortArray28 = arg1.aShortArray28;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray30 = arg1.aShortArray30;
			}
			if (this.aClass426_1 == null) {
				arg0.aClass426_1 = null;
				for (local166 = 0; local166 < this.anInt878; local166++) {
					arg0.aShortArray28[local166] = this.aShortArray28[local166];
					arg0.aShortArray39[local166] = this.aShortArray39[local166];
					arg0.aShortArray30[local166] = this.aShortArray30[local166];
				}
			} else {
				if (arg1.aClass426_1 == null) {
					arg1.aClass426_1 = new Class426();
				}
				@Pc(457) Class426 local457 = arg0.aClass426_1 = arg1.aClass426_1;
				if (local457.aShortArray129 == null || local457.aShortArray129.length < this.anInt878) {
					local469 = this.anInt878;
					local457.aShortArray129 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray128 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt878; local469++) {
					arg0.aShortArray28[local469] = this.aShortArray28[local469];
					arg0.aShortArray39[local469] = this.aShortArray39[local469];
					arg0.aShortArray30[local469] = this.aShortArray30[local469];
					local457.aShortArray129[local469] = this.aClass426_1.aShortArray129[local469];
					local457.aShortArray127[local469] = this.aClass426_1.aShortArray127[local469];
					local457.aShortArray128[local469] = this.aClass426_1.aShortArray128[local469];
					local457.aByteArray92[local469] = this.aClass426_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray27 = this.aByteArray27;
		} else {
			arg0.aClass426_1 = this.aClass426_1;
			arg0.aShortArray28 = this.aShortArray28;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aByteArray27 = this.aByteArray27;
		}
		if (Class399.method28751(arg2, this.anInt875)) {
			arg0.aClass418_3 = arg1.aClass418_3;
			arg0.aClass418_3.anInterface38_21 = this.aClass418_3.anInterface38_21;
			arg0.aClass418_3.aBoolean860 = this.aClass418_3.aBoolean860;
			arg0.aClass418_3.aBoolean859 = true;
		} else if (Class399.method28804(arg2, this.anInt875)) {
			arg0.aClass418_3 = this.aClass418_3;
		} else {
			arg0.aClass418_3 = null;
		}
		if (Class399.method28740(arg2, this.anInt875)) {
			if (arg1.aFloatArray29 == null || arg1.aFloatArray29.length < this.anInt879) {
				local166 = this.anInt878;
				arg0.aFloatArray29 = arg1.aFloatArray29 = new float[local166];
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
			} else {
				arg0.aFloatArray29 = arg1.aFloatArray29;
				arg0.aFloatArray28 = arg1.aFloatArray28;
			}
			for (local166 = 0; local166 < this.anInt878; local166++) {
				arg0.aFloatArray29[local166] = this.aFloatArray29[local166];
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
			}
		} else {
			arg0.aFloatArray29 = this.aFloatArray29;
			arg0.aFloatArray28 = this.aFloatArray28;
		}
		if (Class399.method28753(arg2, this.anInt875)) {
			arg0.aClass418_2 = arg1.aClass418_2;
			arg0.aClass418_2.anInterface38_21 = this.aClass418_2.anInterface38_21;
			arg0.aClass418_2.aBoolean860 = this.aClass418_2.aBoolean860;
			arg0.aClass418_2.aBoolean859 = true;
		} else if (Class399.method28748(arg2, this.anInt875)) {
			arg0.aClass418_2 = this.aClass418_2;
		} else {
			arg0.aClass418_2 = null;
		}
		if (Class399.method28755(arg2, this.anInt875)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
				arg0.aShortArray29 = arg1.aShortArray29 = new short[local166];
				arg0.aShortArray38 = arg1.aShortArray38 = new short[local166];
			} else {
				arg0.aShortArray36 = arg1.aShortArray36;
				arg0.aShortArray29 = arg1.aShortArray29;
				arg0.aShortArray38 = arg1.aShortArray38;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
				arg0.aShortArray29[local166] = this.aShortArray29[local166];
				arg0.aShortArray38[local166] = this.aShortArray38[local166];
			}
		} else {
			arg0.aShortArray36 = this.aShortArray36;
			arg0.aShortArray29 = this.aShortArray29;
			arg0.aShortArray38 = this.aShortArray38;
		}
		if (Class399.method28754(arg2, this.anInt875)) {
			arg0.aClass409_1 = arg1.aClass409_1;
			arg0.aClass409_1.anInterface44_8 = this.aClass409_1.anInterface44_8;
			arg0.aClass409_1.aBoolean857 = this.aClass409_1.aBoolean857;
			arg0.aClass409_1.aBoolean856 = true;
		} else if (Class399.method28749(arg2, this.anInt875)) {
			arg0.aClass409_1 = this.aClass409_1;
		} else {
			arg0.aClass409_1 = null;
		}
		if (Class399.method28742(arg2, this.anInt875)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class399.method28743(arg2, this.anInt875)) {
			arg0.aClass408Array1 = this.aClass408Array1;
		} else if (arg1.aClass408Array1 == null || arg1.aClass408Array1.length < this.anInt891) {
			local166 = this.anInt891;
			arg0.aClass408Array1 = arg1.aClass408Array1 = new Class408[local166];
			for (local469 = 0; local469 < this.anInt891; local469++) {
				arg0.aClass408Array1[local469] = this.aClass408Array1[local469].method28952();
			}
		} else {
			arg0.aClass408Array1 = arg1.aClass408Array1;
			for (local166 = 0; local166 < this.anInt891; local166++) {
				arg0.aClass408Array1[local166].method28951(this.aClass408Array1[local166]);
			}
		}
		arg0.aClass414Array1 = this.aClass414Array1;
		if (this.aBoolean180) {
			arg0.anInt883 = this.anInt883;
			arg0.anInt889 = this.anInt889;
			arg0.anInt886 = this.anInt886;
			arg0.anInt887 = this.anInt887;
			arg0.anInt884 = this.anInt884;
			arg0.anInt885 = this.anInt885;
			arg0.anInt888 = this.anInt888;
			arg0.anInt881 = this.anInt881;
			arg0.aBoolean180 = true;
		} else {
			arg0.aBoolean180 = false;
		}
		if (this.aBoolean175) {
			arg0.anInt890 = this.anInt890;
			arg0.aBoolean175 = true;
		} else {
			arg0.aBoolean175 = false;
		}
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray85 = this.anIntArray85;
		arg0.aShortArray31 = this.aShortArray31;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray35 = this.aShortArray35;
		arg0.aShortArray34 = this.aShortArray34;
		arg0.anIntArray86 = this.anIntArray86;
		arg0.anIntArray87 = this.anIntArray87;
		arg0.anIntArray88 = this.anIntArray88;
		arg0.aClass228Array3 = this.aClass228Array3;
		arg0.aClass211Array3 = this.aClass211Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afw", name = "ii", descriptor = "(Lclient!afw;Lclient!afw;IZZ)Lclient!dn;")
	Class105 method7583(@OriginalArg(0) Class105_Sub3 arg0, @OriginalArg(1) Class105_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt874 = arg2;
		arg0.anInt875 = this.anInt875;
		arg0.aShort20 = this.aShort20;
		arg0.aShort19 = this.aShort19;
		arg0.anInt876 = this.anInt876;
		arg0.anInt877 = this.anInt877;
		arg0.anInt878 = this.anInt878;
		arg0.anInt879 = this.anInt879;
		arg0.anInt880 = this.anInt880;
		arg0.anInt891 = this.anInt891;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean178 = this.aBoolean178;
		} else {
			arg0.aBoolean178 = true;
		}
		arg0.aBoolean176 = this.aBoolean176;
		@Pc(59) boolean local59 = Class399.method28733(arg2, this.anInt875);
		@Pc(64) boolean local64 = Class399.method28734(arg2, this.anInt875);
		@Pc(69) boolean local69 = Class399.method28735(arg2, this.anInt875);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt876) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt876];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local64) {
				arg0.anIntArray82 = this.anIntArray82;
			} else if (arg1.anIntArray82 == null || arg1.anIntArray82.length < this.anInt876) {
				arg0.anIntArray82 = arg1.anIntArray82 = new int[this.anInt876];
			} else {
				arg0.anIntArray82 = arg1.anIntArray82;
			}
			if (!local69) {
				arg0.anIntArray83 = this.anIntArray83;
			} else if (arg1.anIntArray83 == null || arg1.anIntArray83.length < this.anInt876) {
				arg0.anIntArray83 = arg1.anIntArray83 = new int[this.anInt876];
			} else {
				arg0.anIntArray83 = arg1.anIntArray83;
			}
			for (local166 = 0; local166 < this.anInt876; local166++) {
				if (local59) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local64) {
					arg0.anIntArray82[local166] = this.anIntArray82[local166];
				}
				if (local69) {
					arg0.anIntArray83[local166] = this.anIntArray83[local166];
				}
			}
		} else {
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray82 = this.anIntArray82;
			arg0.anIntArray83 = this.anIntArray83;
		}
		if (Class399.method28750(arg2, this.anInt875)) {
			arg0.aClass418_1 = arg1.aClass418_1;
			arg0.aClass418_1.anInterface38_21 = this.aClass418_1.anInterface38_21;
			arg0.aClass418_1.aBoolean860 = this.aClass418_1.aBoolean860;
			arg0.aClass418_1.aBoolean859 = true;
		} else if (Class399.method28745(arg2, this.anInt875)) {
			arg0.aClass418_1 = this.aClass418_1;
		} else {
			arg0.aClass418_1 = null;
		}
		if (Class399.method28738(arg2, this.anInt875)) {
			if (arg1.aShortArray32 == null || arg1.aShortArray32.length < this.anInt879) {
				arg0.aShortArray32 = arg1.aShortArray32 = new short[this.anInt879];
			} else {
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray32[local166] = this.aShortArray32[local166];
			}
		} else {
			arg0.aShortArray32 = this.aShortArray32;
		}
		if (Class399.method28739(arg2, this.anInt875)) {
			if (arg1.aByteArray28 == null || arg1.aByteArray28.length < this.anInt879) {
				arg0.aByteArray28 = arg1.aByteArray28 = new byte[this.anInt879];
			} else {
				arg0.aByteArray28 = arg1.aByteArray28;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aByteArray28[local166] = this.aByteArray28[local166];
			}
		} else {
			arg0.aByteArray28 = this.aByteArray28;
		}
		if (Class399.method28752(arg2, this.anInt875)) {
			arg0.aClass418_4 = arg1.aClass418_4;
			arg0.aClass418_4.anInterface38_21 = this.aClass418_4.anInterface38_21;
			arg0.aClass418_4.aBoolean860 = this.aClass418_4.aBoolean860;
			arg0.aClass418_4.aBoolean859 = true;
		} else if (Class399.method28758(arg2, this.anInt875)) {
			arg0.aClass418_4 = this.aClass418_4;
		} else {
			arg0.aClass418_4 = null;
		}
		@Pc(469) int local469;
		if (Class399.method28737(arg2, this.anInt875)) {
			if (arg1.aShortArray28 == null || arg1.aShortArray28.length < this.anInt878) {
				local166 = this.anInt878;
				arg0.aShortArray28 = arg1.aShortArray28 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
			} else {
				arg0.aShortArray28 = arg1.aShortArray28;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray30 = arg1.aShortArray30;
			}
			if (this.aClass426_1 == null) {
				arg0.aClass426_1 = null;
				for (local166 = 0; local166 < this.anInt878; local166++) {
					arg0.aShortArray28[local166] = this.aShortArray28[local166];
					arg0.aShortArray39[local166] = this.aShortArray39[local166];
					arg0.aShortArray30[local166] = this.aShortArray30[local166];
				}
			} else {
				if (arg1.aClass426_1 == null) {
					arg1.aClass426_1 = new Class426();
				}
				@Pc(457) Class426 local457 = arg0.aClass426_1 = arg1.aClass426_1;
				if (local457.aShortArray129 == null || local457.aShortArray129.length < this.anInt878) {
					local469 = this.anInt878;
					local457.aShortArray129 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray128 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt878; local469++) {
					arg0.aShortArray28[local469] = this.aShortArray28[local469];
					arg0.aShortArray39[local469] = this.aShortArray39[local469];
					arg0.aShortArray30[local469] = this.aShortArray30[local469];
					local457.aShortArray129[local469] = this.aClass426_1.aShortArray129[local469];
					local457.aShortArray127[local469] = this.aClass426_1.aShortArray127[local469];
					local457.aShortArray128[local469] = this.aClass426_1.aShortArray128[local469];
					local457.aByteArray92[local469] = this.aClass426_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray27 = this.aByteArray27;
		} else {
			arg0.aClass426_1 = this.aClass426_1;
			arg0.aShortArray28 = this.aShortArray28;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aByteArray27 = this.aByteArray27;
		}
		if (Class399.method28751(arg2, this.anInt875)) {
			arg0.aClass418_3 = arg1.aClass418_3;
			arg0.aClass418_3.anInterface38_21 = this.aClass418_3.anInterface38_21;
			arg0.aClass418_3.aBoolean860 = this.aClass418_3.aBoolean860;
			arg0.aClass418_3.aBoolean859 = true;
		} else if (Class399.method28804(arg2, this.anInt875)) {
			arg0.aClass418_3 = this.aClass418_3;
		} else {
			arg0.aClass418_3 = null;
		}
		if (Class399.method28740(arg2, this.anInt875)) {
			if (arg1.aFloatArray29 == null || arg1.aFloatArray29.length < this.anInt879) {
				local166 = this.anInt878;
				arg0.aFloatArray29 = arg1.aFloatArray29 = new float[local166];
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
			} else {
				arg0.aFloatArray29 = arg1.aFloatArray29;
				arg0.aFloatArray28 = arg1.aFloatArray28;
			}
			for (local166 = 0; local166 < this.anInt878; local166++) {
				arg0.aFloatArray29[local166] = this.aFloatArray29[local166];
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
			}
		} else {
			arg0.aFloatArray29 = this.aFloatArray29;
			arg0.aFloatArray28 = this.aFloatArray28;
		}
		if (Class399.method28753(arg2, this.anInt875)) {
			arg0.aClass418_2 = arg1.aClass418_2;
			arg0.aClass418_2.anInterface38_21 = this.aClass418_2.anInterface38_21;
			arg0.aClass418_2.aBoolean860 = this.aClass418_2.aBoolean860;
			arg0.aClass418_2.aBoolean859 = true;
		} else if (Class399.method28748(arg2, this.anInt875)) {
			arg0.aClass418_2 = this.aClass418_2;
		} else {
			arg0.aClass418_2 = null;
		}
		if (Class399.method28755(arg2, this.anInt875)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
				arg0.aShortArray29 = arg1.aShortArray29 = new short[local166];
				arg0.aShortArray38 = arg1.aShortArray38 = new short[local166];
			} else {
				arg0.aShortArray36 = arg1.aShortArray36;
				arg0.aShortArray29 = arg1.aShortArray29;
				arg0.aShortArray38 = arg1.aShortArray38;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
				arg0.aShortArray29[local166] = this.aShortArray29[local166];
				arg0.aShortArray38[local166] = this.aShortArray38[local166];
			}
		} else {
			arg0.aShortArray36 = this.aShortArray36;
			arg0.aShortArray29 = this.aShortArray29;
			arg0.aShortArray38 = this.aShortArray38;
		}
		if (Class399.method28754(arg2, this.anInt875)) {
			arg0.aClass409_1 = arg1.aClass409_1;
			arg0.aClass409_1.anInterface44_8 = this.aClass409_1.anInterface44_8;
			arg0.aClass409_1.aBoolean857 = this.aClass409_1.aBoolean857;
			arg0.aClass409_1.aBoolean856 = true;
		} else if (Class399.method28749(arg2, this.anInt875)) {
			arg0.aClass409_1 = this.aClass409_1;
		} else {
			arg0.aClass409_1 = null;
		}
		if (Class399.method28742(arg2, this.anInt875)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt879) {
				local166 = this.anInt879;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt879; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class399.method28743(arg2, this.anInt875)) {
			arg0.aClass408Array1 = this.aClass408Array1;
		} else if (arg1.aClass408Array1 == null || arg1.aClass408Array1.length < this.anInt891) {
			local166 = this.anInt891;
			arg0.aClass408Array1 = arg1.aClass408Array1 = new Class408[local166];
			for (local469 = 0; local469 < this.anInt891; local469++) {
				arg0.aClass408Array1[local469] = this.aClass408Array1[local469].method28952();
			}
		} else {
			arg0.aClass408Array1 = arg1.aClass408Array1;
			for (local166 = 0; local166 < this.anInt891; local166++) {
				arg0.aClass408Array1[local166].method28951(this.aClass408Array1[local166]);
			}
		}
		arg0.aClass414Array1 = this.aClass414Array1;
		if (this.aBoolean180) {
			arg0.anInt883 = this.anInt883;
			arg0.anInt889 = this.anInt889;
			arg0.anInt886 = this.anInt886;
			arg0.anInt887 = this.anInt887;
			arg0.anInt884 = this.anInt884;
			arg0.anInt885 = this.anInt885;
			arg0.anInt888 = this.anInt888;
			arg0.anInt881 = this.anInt881;
			arg0.aBoolean180 = true;
		} else {
			arg0.aBoolean180 = false;
		}
		if (this.aBoolean175) {
			arg0.anInt890 = this.anInt890;
			arg0.aBoolean175 = true;
		} else {
			arg0.aBoolean175 = false;
		}
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray85 = this.anIntArray85;
		arg0.aShortArray31 = this.aShortArray31;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray35 = this.aShortArray35;
		arg0.aShortArray34 = this.aShortArray34;
		arg0.anIntArray86 = this.anIntArray86;
		arg0.anIntArray87 = this.anIntArray87;
		arg0.anIntArray88 = this.anIntArray88;
		arg0.aClass228Array3 = this.aClass228Array3;
		arg0.aClass211Array3 = this.aClass211Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afw", name = "et", descriptor = "()I")
	@Override
	public int method7463() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!afw", name = "ic", descriptor = "()V")
	void method7584() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		if (this.aClass228Array3 == null && this.aClass211Array3 == null && this.aClass414Array1 == null && !Class399.method28761(this.anInt874, this.anInt875)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray81 != null && !Class399.method28777(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local23 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray82 != null && !Class399.method28756(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local25 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray83 != null && !Class399.method28808(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local27 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (local23) {
				this.anIntArray81 = null;
			}
			if (local25) {
				this.anIntArray82 = null;
			}
			if (local27) {
				this.anIntArray83 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray81 == null && this.anIntArray82 == null && this.anIntArray83 == null) {
			this.aShortArray37 = null;
			this.anIntArray85 = null;
		}
		if (this.aByteArray27 != null && !Class399.method28839(this.anInt874, this.anInt875)) {
			label204: {
				label203: {
					if ((this.anInt875 & 0x37) == 0) {
						if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
							break label203;
						}
					} else if (this.aClass418_3 == null || this.aClass418_3.method28995()) {
						break label203;
					}
					this.aBoolean177 = true;
					break label204;
				}
				this.aShortArray30 = null;
				this.aShortArray39 = null;
				this.aShortArray28 = null;
				this.aByteArray27 = null;
			}
		}
		if (this.aShortArray32 != null && !Class399.method28759(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aByteArray28 != null && !Class399.method28760(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aByteArray28 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aFloatArray29 != null && !Class399.method28796(this.anInt874, this.anInt875)) {
			if (this.aClass418_2 == null || this.aClass418_2.method28995()) {
				this.aFloatArray28 = null;
				this.aFloatArray29 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray33 != null && !Class399.method28762(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray36 != null && !Class399.method28765(this.anInt874, this.anInt875)) {
			if ((this.aClass409_1 == null || this.aClass409_1.method28957()) && (this.aClass418_4 == null || this.aClass418_4.method28995())) {
				this.aShortArray38 = null;
				this.aShortArray29 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray31 != null) {
			if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Class399.method28811(this.anInt874, this.anInt875)) {
			this.anIntArrayArray14 = null;
			this.aShortArray34 = null;
		}
		if (this.anIntArrayArray15 != null && !Class399.method28763(this.anInt874, this.anInt875)) {
			this.anIntArrayArray15 = null;
			this.aShortArray35 = null;
		}
		if (this.anIntArrayArray16 != null && !Class399.method28800(this.anInt874, this.anInt875)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray86 != null && (this.anInt874 & 0x800) == 0 && (this.anInt874 & 0x40000) == 0) {
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
		}
	}

	@OriginalMember(owner = "client!afw", name = "im", descriptor = "()V")
	void method7585() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		if (this.aClass228Array3 == null && this.aClass211Array3 == null && this.aClass414Array1 == null && !Class399.method28761(this.anInt874, this.anInt875)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray81 != null && !Class399.method28777(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local23 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray82 != null && !Class399.method28756(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local25 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray83 != null && !Class399.method28808(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local27 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (local23) {
				this.anIntArray81 = null;
			}
			if (local25) {
				this.anIntArray82 = null;
			}
			if (local27) {
				this.anIntArray83 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray81 == null && this.anIntArray82 == null && this.anIntArray83 == null) {
			this.aShortArray37 = null;
			this.anIntArray85 = null;
		}
		if (this.aByteArray27 != null && !Class399.method28839(this.anInt874, this.anInt875)) {
			label204: {
				label203: {
					if ((this.anInt875 & 0x37) == 0) {
						if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
							break label203;
						}
					} else if (this.aClass418_3 == null || this.aClass418_3.method28995()) {
						break label203;
					}
					this.aBoolean177 = true;
					break label204;
				}
				this.aShortArray30 = null;
				this.aShortArray39 = null;
				this.aShortArray28 = null;
				this.aByteArray27 = null;
			}
		}
		if (this.aShortArray32 != null && !Class399.method28759(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aByteArray28 != null && !Class399.method28760(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aByteArray28 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aFloatArray29 != null && !Class399.method28796(this.anInt874, this.anInt875)) {
			if (this.aClass418_2 == null || this.aClass418_2.method28995()) {
				this.aFloatArray28 = null;
				this.aFloatArray29 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray33 != null && !Class399.method28762(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray36 != null && !Class399.method28765(this.anInt874, this.anInt875)) {
			if ((this.aClass409_1 == null || this.aClass409_1.method28957()) && (this.aClass418_4 == null || this.aClass418_4.method28995())) {
				this.aShortArray38 = null;
				this.aShortArray29 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray31 != null) {
			if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Class399.method28811(this.anInt874, this.anInt875)) {
			this.anIntArrayArray14 = null;
			this.aShortArray34 = null;
		}
		if (this.anIntArrayArray15 != null && !Class399.method28763(this.anInt874, this.anInt875)) {
			this.anIntArrayArray15 = null;
			this.aShortArray35 = null;
		}
		if (this.anIntArrayArray16 != null && !Class399.method28800(this.anInt874, this.anInt875)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray86 != null && (this.anInt874 & 0x800) == 0 && (this.anInt874 & 0x40000) == 0) {
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
		}
	}

	@OriginalMember(owner = "client!afw", name = "ij", descriptor = "()V")
	void method7586() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		if (this.aClass228Array3 == null && this.aClass211Array3 == null && this.aClass414Array1 == null && !Class399.method28761(this.anInt874, this.anInt875)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray81 != null && !Class399.method28777(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local23 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray82 != null && !Class399.method28756(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local25 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (this.anIntArray83 != null && !Class399.method28808(this.anInt874, this.anInt875)) {
				if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
					if (!this.aBoolean180) {
						this.method7564();
					}
					local27 = true;
				} else {
					this.aBoolean177 = true;
				}
			}
			if (local23) {
				this.anIntArray81 = null;
			}
			if (local25) {
				this.anIntArray82 = null;
			}
			if (local27) {
				this.anIntArray83 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray81 == null && this.anIntArray82 == null && this.anIntArray83 == null) {
			this.aShortArray37 = null;
			this.anIntArray85 = null;
		}
		if (this.aByteArray27 != null && !Class399.method28839(this.anInt874, this.anInt875)) {
			label204: {
				label203: {
					if ((this.anInt875 & 0x37) == 0) {
						if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
							break label203;
						}
					} else if (this.aClass418_3 == null || this.aClass418_3.method28995()) {
						break label203;
					}
					this.aBoolean177 = true;
					break label204;
				}
				this.aShortArray30 = null;
				this.aShortArray39 = null;
				this.aShortArray28 = null;
				this.aByteArray27 = null;
			}
		}
		if (this.aShortArray32 != null && !Class399.method28759(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aByteArray28 != null && !Class399.method28760(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aByteArray28 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aFloatArray29 != null && !Class399.method28796(this.anInt874, this.anInt875)) {
			if (this.aClass418_2 == null || this.aClass418_2.method28995()) {
				this.aFloatArray28 = null;
				this.aFloatArray29 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray33 != null && !Class399.method28762(this.anInt874, this.anInt875)) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray36 != null && !Class399.method28765(this.anInt874, this.anInt875)) {
			if ((this.aClass409_1 == null || this.aClass409_1.method28957()) && (this.aClass418_4 == null || this.aClass418_4.method28995())) {
				this.aShortArray38 = null;
				this.aShortArray29 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray31 != null) {
			if (this.aClass418_1 == null || this.aClass418_1.method28995()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass418_4 == null || this.aClass418_4.method28995()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean177 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Class399.method28811(this.anInt874, this.anInt875)) {
			this.anIntArrayArray14 = null;
			this.aShortArray34 = null;
		}
		if (this.anIntArrayArray15 != null && !Class399.method28763(this.anInt874, this.anInt875)) {
			this.anIntArrayArray15 = null;
			this.aShortArray35 = null;
		}
		if (this.anIntArrayArray16 != null && !Class399.method28800(this.anInt874, this.anInt875)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray86 != null && (this.anInt874 & 0x800) == 0 && (this.anInt874 & 0x40000) == 0) {
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
		}
	}

	@OriginalMember(owner = "client!afw", name = "iz", descriptor = "()V")
	void method7587() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "jw", descriptor = "()V")
	void method7588() {
		if (this.aClass409_1 != null) {
			this.aClass409_1.aBoolean857 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "jv", descriptor = "()V")
	void method7589() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "jl", descriptor = "()V")
	void method7590() {
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "jj", descriptor = "()V")
	void method7591() {
		if (this.aClass418_4 != null) {
			this.aClass418_4.aBoolean860 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "be", descriptor = "()Z")
	@Override
	public boolean method7497() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass102_Sub1_5.aClass395_3.method28703(this.aClass102_Sub1_5.aClass235_6.method26120(this.aShortArray33[local6], 73831368), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "jr", descriptor = "()V")
	void method7592() {
		if (this.aClass409_1 != null) {
			this.aClass409_1.aBoolean857 = false;
		}
	}

	@OriginalMember(owner = "client!afw", name = "k", descriptor = "(I)V")
	@Override
	public void method7330(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local7 - this.anIntArray83[local9] * local3 >> 14;
			this.anIntArray83[local9] = this.anIntArray82[local9] * local3 + this.anIntArray83[local9] * local7 >> 14;
			this.anIntArray82[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "ed", descriptor = "()I")
	@Override
	public int method7450() {
		if (!this.aBoolean180) {
			this.method7564();
		}
		return this.anInt888;
	}

	@OriginalMember(owner = "client!afw", name = "jh", descriptor = "()V")
	void method7593() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt877; local17++) {
			@Pc(26) int local26 = this.anIntArray81[local17];
			@Pc(31) int local31 = this.anIntArray82[local17];
			@Pc(36) int local36 = this.anIntArray83[local17];
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
		this.anInt886 = local1;
		this.anInt887 = local7;
		this.anInt884 = local3;
		this.anInt885 = local9;
		this.anInt888 = local5;
		this.anInt881 = local11;
		this.anInt889 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt883 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!afw", name = "jm", descriptor = "()V")
	void method7594() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt877; local17++) {
			@Pc(26) int local26 = this.anIntArray81[local17];
			@Pc(31) int local31 = this.anIntArray82[local17];
			@Pc(36) int local36 = this.anIntArray83[local17];
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
		this.anInt886 = local1;
		this.anInt887 = local7;
		this.anInt884 = local3;
		this.anInt885 = local9;
		this.anInt888 = local5;
		this.anInt881 = local11;
		this.anInt889 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt883 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!afw", name = "cw", descriptor = "()Z")
	@Override
	boolean method7448() {
		if (this.anIntArrayArray15 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt876; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray83[local6] <<= 0x4;
		}
		this.anInt893 = 0;
		this.anInt894 = 0;
		this.anInt895 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afw", name = "jn", descriptor = "(IIIILclient!ov;ZI)Z")
	boolean method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class471 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg4);
		local3.method30078(this.aClass102_Sub1_5.aClass487_88);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(34) int local34 = this.anInt887 - this.anInt886 >> 1;
		@Pc(42) int local42 = this.anInt885 - this.anInt884 >> 1;
		@Pc(50) int local50 = this.anInt881 - this.anInt888 >> 1;
		@Pc(55) int local55 = this.anInt886 + local34;
		@Pc(60) int local60 = this.anInt884 + local42;
		@Pc(65) int local65 = this.anInt888 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray90[0] = local71;
		this.anIntArray91[0] = local77;
		this.anIntArray84[0] = local83;
		this.anIntArray90[1] = local89;
		this.anIntArray91[1] = local77;
		this.anIntArray84[1] = local83;
		this.anIntArray90[2] = local71;
		this.anIntArray91[2] = local95;
		this.anIntArray84[2] = local83;
		this.anIntArray90[3] = local89;
		this.anIntArray91[3] = local95;
		this.anIntArray84[3] = local83;
		this.anIntArray90[4] = local71;
		this.anIntArray91[4] = local77;
		this.anIntArray84[4] = local101;
		this.anIntArray90[5] = local89;
		this.anIntArray91[5] = local77;
		this.anIntArray84[5] = local101;
		this.anIntArray90[6] = local71;
		this.anIntArray91[6] = local95;
		this.anIntArray84[6] = local101;
		this.anIntArray90[7] = local89;
		this.anIntArray91[7] = local95;
		this.anIntArray84[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray90[local223];
			local238 = this.anIntArray91[local223];
			local244 = this.anIntArray84[local223];
			local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
			local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
				local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
				@Pc(365) float local365 = this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296;
				@Pc(377) float local377 = this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray89.length < this.anInt878) {
				this.anIntArray89 = new int[this.anInt878];
				this.anIntArray80 = new int[this.anInt878];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt877; local457++) {
				local232 = this.anIntArray81[local457];
				local238 = this.anIntArray82[local457];
				local244 = this.anIntArray83[local457];
				local270 = local3.aFloatArray114[2] * local232 + local3.aFloatArray114[6] * local238 + local3.aFloatArray114[10] * local244 + local3.aFloatArray114[14];
				local296 = local3.aFloatArray114[3] * local232 + local3.aFloatArray114[7] * local238 + local3.aFloatArray114[11] * local244 + local3.aFloatArray114[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray114[0] * local232 + local3.aFloatArray114[4] * local238 + local3.aFloatArray114[8] * local244 + local3.aFloatArray114[12];
					local353 = local3.aFloatArray114[1] * local232 + local3.aFloatArray114[5] * local238 + local3.aFloatArray114[9] * local244 + local3.aFloatArray114[13];
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local327 / local296);
						this.anIntArray80[local620] = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray85[local457];
					local600 = this.anIntArray85[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray89[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt879; local457++) {
				if (this.anIntArray89[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray29[local457] & 0xFFFF] != -999999 && this.anIntArray89[this.aShortArray38[local457] & 0xFFFF] != -999999 && this.method7571(arg0, arg1, local223, local413, this.anIntArray80[this.aShortArray36[local457] & 0xFFFF], this.anIntArray80[this.aShortArray29[local457] & 0xFFFF], this.anIntArray80[this.aShortArray38[local457] & 0xFFFF], this.anIntArray89[this.aShortArray36[local457] & 0xFFFF], this.anIntArray89[this.aShortArray29[local457] & 0xFFFF], this.anIntArray89[this.aShortArray38[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afw", name = "ci", descriptor = "()V")
	@Override
	void method7410() {
	}

	@OriginalMember(owner = "client!afw", name = "ju", descriptor = "(IIIIIIIIII)Z")
	boolean method7596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!afw", name = "cr", descriptor = "()V")
	@Override
	void method7494() {
	}

	@OriginalMember(owner = "client!afw", name = "jt", descriptor = "(Lclient!atu;)V")
	void method7597(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "ig", descriptor = "(Lclient!pm;)V")
	void method7598(@OriginalArg(0) Class487 arg0) {
		if (this.aClass414Array1 == null) {
			return;
		}
		this.aClass102_Sub1_5.method20762(!this.aBoolean178);
		@Pc(16) Class471 local16 = this.aClass102_Sub1_5.aClass471_35;
		@Pc(20) Class127 local20 = this.aClass102_Sub1_5.aClass127_3;
		@Pc(28) boolean local28 = this.aClass102_Sub1_5.anInt2985 > 0;
		if (local28) {
			local20.aClass463_44.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass463_44.method29477(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt891; local72++) {
			@Pc(81) Class414 local81 = this.aClass414Array1[local72];
			@Pc(86) Class408 local86 = this.aClass408Array1[local72];
			if (!local81.aBoolean858 || !this.aClass102_Sub1_5.method20784()) {
				@Pc(115) float local115 = (float) (this.anIntArray81[local81.anInt4616] + this.anIntArray81[local81.anInt4617] + this.anIntArray81[local81.anInt4619]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray82[local81.anInt4616] + this.anIntArray82[local81.anInt4617] + this.anIntArray82[local81.anInt4619]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray83[local81.anInt4616] + this.anIntArray83[local81.anInt4617] + this.anIntArray83[local81.anInt4619]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray114[0] * local115 + arg0.aFloatArray114[4] * local136 + arg0.aFloatArray114[8] * local157 + arg0.aFloatArray114[12];
				@Pc(209) float local209 = arg0.aFloatArray114[1] * local115 + arg0.aFloatArray114[5] * local136 + arg0.aFloatArray114[9] * local157 + arg0.aFloatArray114[13];
				@Pc(235) float local235 = arg0.aFloatArray114[2] * local115 + arg0.aFloatArray114[6] * local136 + arg0.aFloatArray114[10] * local157 + arg0.aFloatArray114[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4620;
				local16.method29798(local86.anInt4614, local86.anInt4610 * local81.aShort170 >> 7, local86.anInt4611 * local81.aShort169 >> 7, local183 + (float) local86.anInt4612 - local183 * local256, local209 + (float) local86.anInt4613 - local209 * local256, local235 - local235 * local256);
				local16.method29766(this.aClass102_Sub1_5.aClass471_38);
				this.aClass102_Sub1_5.aClass487_81.method30080(local16);
				local20.method10144(this.aClass102_Sub1_5.aClass487_81);
				local20.aClass487_46.method30139();
				local20.anInt1166 = local86.anInt4609;
				if (local28) {
					local20.aFloat120 = 1.0F - (this.aClass102_Sub1_5.aFloat218 - local235) / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217);
				}
				local20.anInterface34_17 = null;
				if (local81.aShort171 != -1) {
					local20.anInterface34_17 = this.aClass102_Sub1_5.aClass395_3.method28692(this.aClass102_Sub1_5.aClass235_6.method26120(local81.aShort171 & 0xFFFF, 73831368));
				}
				local20.method10152(local28);
			}
		}
		this.aClass102_Sub1_5.method20762(true);
	}

	@OriginalMember(owner = "client!afw", name = "js", descriptor = "(Lclient!atu;)V")
	void method7599(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "jb", descriptor = "(Lclient!atu;)V")
	void method7600(@OriginalArg(0) Class80_Sub1_Sub10_Sub2 arg0) {
		if (this.anIntArray89.length < this.anInt878) {
			this.anIntArray89 = new int[this.anInt878];
			this.anIntArray80 = new int[this.anInt878];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt877; local17++) {
			local44 = (this.anIntArray81[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2981 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3262;
			local67 = (this.anIntArray83[local17] - (this.anIntArray82[local17] * this.aClass102_Sub1_5.anInt2982 >> 8) >> this.aClass102_Sub1_5.anInt2980) - arg0.anInt3263;
			local72 = this.anIntArray85[local17];
			local79 = this.anIntArray85[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray89[local99] = local44;
				this.anIntArray80[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt880; local17++) {
			if (this.aByteArray28 == null || this.aByteArray28[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray29[local17] & 0xFFFF;
				local72 = this.aShortArray38[local17] & 0xFFFF;
				local79 = this.anIntArray89[local44];
				local81 = this.anIntArray89[local67];
				local99 = this.anIntArray89[local72];
				@Pc(170) int local170 = this.anIntArray80[local44];
				@Pc(175) int local175 = this.anIntArray80[local67];
				@Pc(180) int local180 = this.anIntArray80[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method24031(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afw", name = "bg", descriptor = "()I")
	@Override
	public int method7390() {
		if (!this.aBoolean175) {
			this.method7371();
		}
		return this.anInt890;
	}

	@OriginalMember(owner = "client!afw", name = "kw", descriptor = "(ISI)I")
	int method7601(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass102_Sub1_5.anIntArray262[this.method7559(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class227 local20 = this.aClass102_Sub1_5.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte111 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!afw", name = "hc", descriptor = "()[B")
	@Override
	public byte[] method7536() {
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!afw", name = "x", descriptor = "(I)V")
	@Override
	public void method7318(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class467.anIntArray454[arg0];
		@Pc(7) int local7 = Class467.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt877; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 14;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7570();
		this.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!afw", name = "jc", descriptor = "(Lclient!pm;)V")
	void method7602(@OriginalArg(0) Class487 arg0) {
		if (this.aClass414Array1 == null) {
			return;
		}
		this.aClass102_Sub1_5.method20762(!this.aBoolean178);
		@Pc(16) Class471 local16 = this.aClass102_Sub1_5.aClass471_35;
		@Pc(20) Class127 local20 = this.aClass102_Sub1_5.aClass127_3;
		@Pc(28) boolean local28 = this.aClass102_Sub1_5.anInt2985 > 0;
		if (local28) {
			local20.aClass463_44.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass463_44.method29477(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt891; local72++) {
			@Pc(81) Class414 local81 = this.aClass414Array1[local72];
			@Pc(86) Class408 local86 = this.aClass408Array1[local72];
			if (!local81.aBoolean858 || !this.aClass102_Sub1_5.method20784()) {
				@Pc(115) float local115 = (float) (this.anIntArray81[local81.anInt4616] + this.anIntArray81[local81.anInt4617] + this.anIntArray81[local81.anInt4619]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray82[local81.anInt4616] + this.anIntArray82[local81.anInt4617] + this.anIntArray82[local81.anInt4619]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray83[local81.anInt4616] + this.anIntArray83[local81.anInt4617] + this.anIntArray83[local81.anInt4619]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray114[0] * local115 + arg0.aFloatArray114[4] * local136 + arg0.aFloatArray114[8] * local157 + arg0.aFloatArray114[12];
				@Pc(209) float local209 = arg0.aFloatArray114[1] * local115 + arg0.aFloatArray114[5] * local136 + arg0.aFloatArray114[9] * local157 + arg0.aFloatArray114[13];
				@Pc(235) float local235 = arg0.aFloatArray114[2] * local115 + arg0.aFloatArray114[6] * local136 + arg0.aFloatArray114[10] * local157 + arg0.aFloatArray114[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4620;
				local16.method29798(local86.anInt4614, local86.anInt4610 * local81.aShort170 >> 7, local86.anInt4611 * local81.aShort169 >> 7, local183 + (float) local86.anInt4612 - local183 * local256, local209 + (float) local86.anInt4613 - local209 * local256, local235 - local235 * local256);
				local16.method29766(this.aClass102_Sub1_5.aClass471_38);
				this.aClass102_Sub1_5.aClass487_81.method30080(local16);
				local20.method10144(this.aClass102_Sub1_5.aClass487_81);
				local20.aClass487_46.method30139();
				local20.anInt1166 = local86.anInt4609;
				if (local28) {
					local20.aFloat120 = 1.0F - (this.aClass102_Sub1_5.aFloat218 - local235) / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217);
				}
				local20.anInterface34_17 = null;
				if (local81.aShort171 != -1) {
					local20.anInterface34_17 = this.aClass102_Sub1_5.aClass395_3.method28692(this.aClass102_Sub1_5.aClass235_6.method26120(local81.aShort171 & 0xFFFF, 73831368));
				}
				local20.method10152(local28);
			}
		}
		this.aClass102_Sub1_5.method20762(true);
	}

	@OriginalMember(owner = "client!afw", name = "jp", descriptor = "(Lclient!pm;)V")
	void method7603(@OriginalArg(0) Class487 arg0) {
		if (this.aClass414Array1 == null) {
			return;
		}
		this.aClass102_Sub1_5.method20762(!this.aBoolean178);
		@Pc(16) Class471 local16 = this.aClass102_Sub1_5.aClass471_35;
		@Pc(20) Class127 local20 = this.aClass102_Sub1_5.aClass127_3;
		@Pc(28) boolean local28 = this.aClass102_Sub1_5.anInt2985 > 0;
		if (local28) {
			local20.aClass463_44.method29477((float) (this.aClass102_Sub1_5.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (this.aClass102_Sub1_5.anInt2965 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass463_44.method29477(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt891; local72++) {
			@Pc(81) Class414 local81 = this.aClass414Array1[local72];
			@Pc(86) Class408 local86 = this.aClass408Array1[local72];
			if (!local81.aBoolean858 || !this.aClass102_Sub1_5.method20784()) {
				@Pc(115) float local115 = (float) (this.anIntArray81[local81.anInt4616] + this.anIntArray81[local81.anInt4617] + this.anIntArray81[local81.anInt4619]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray82[local81.anInt4616] + this.anIntArray82[local81.anInt4617] + this.anIntArray82[local81.anInt4619]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray83[local81.anInt4616] + this.anIntArray83[local81.anInt4617] + this.anIntArray83[local81.anInt4619]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray114[0] * local115 + arg0.aFloatArray114[4] * local136 + arg0.aFloatArray114[8] * local157 + arg0.aFloatArray114[12];
				@Pc(209) float local209 = arg0.aFloatArray114[1] * local115 + arg0.aFloatArray114[5] * local136 + arg0.aFloatArray114[9] * local157 + arg0.aFloatArray114[13];
				@Pc(235) float local235 = arg0.aFloatArray114[2] * local115 + arg0.aFloatArray114[6] * local136 + arg0.aFloatArray114[10] * local157 + arg0.aFloatArray114[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4620;
				local16.method29798(local86.anInt4614, local86.anInt4610 * local81.aShort170 >> 7, local86.anInt4611 * local81.aShort169 >> 7, local183 + (float) local86.anInt4612 - local183 * local256, local209 + (float) local86.anInt4613 - local209 * local256, local235 - local235 * local256);
				local16.method29766(this.aClass102_Sub1_5.aClass471_38);
				this.aClass102_Sub1_5.aClass487_81.method30080(local16);
				local20.method10144(this.aClass102_Sub1_5.aClass487_81);
				local20.aClass487_46.method30139();
				local20.anInt1166 = local86.anInt4609;
				if (local28) {
					local20.aFloat120 = 1.0F - (this.aClass102_Sub1_5.aFloat218 - local235) / (this.aClass102_Sub1_5.aFloat218 - this.aClass102_Sub1_5.aFloat217);
				}
				local20.anInterface34_17 = null;
				if (local81.aShort171 != -1) {
					local20.anInterface34_17 = this.aClass102_Sub1_5.aClass395_3.method28692(this.aClass102_Sub1_5.aClass235_6.method26120(local81.aShort171 & 0xFFFF, 73831368));
				}
				local20.method10152(local28);
			}
		}
		this.aClass102_Sub1_5.method20762(true);
	}

	@OriginalMember(owner = "client!afw", name = "fe", descriptor = "()[Lclient!dm;")
	@Override
	public Class228[] method7378() {
		return this.aClass228Array3;
	}

	@OriginalMember(owner = "client!afw", name = "kv", descriptor = "()Z")
	boolean method7604() {
		@Pc(7) boolean local7 = !this.aClass418_4.aBoolean860;
		@Pc(20) boolean local20 = (this.anInt875 & 0x37) != 0 && !this.aClass418_3.aBoolean860;
		@Pc(28) boolean local28 = !this.aClass418_1.aBoolean860;
		@Pc(36) boolean local36 = !this.aClass418_2.aBoolean860;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface38 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray31 != null) {
			if (this.aClass418_1.anInterface38_22 == null) {
				this.aClass418_1.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_1.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat((float) this.anIntArray81[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray82[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray83[this.aShortArray31[local154]]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 12;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local104 = this.aShortArray31[local95];
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray82[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray83[local104]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_1.anInterface38_21 = local69;
			this.aClass418_1.aBoolean860 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass418_4.anInterface38_22 == null) {
				this.aClass418_4.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_4.anInterface38_22;
			local69.method29327(this.anInt878 * 4, 4);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass426_1 == null) {
						local600 = this.aShortArray28;
						local604 = this.aShortArray39;
						local264 = this.aShortArray30;
						local612 = this.aByteArray27;
					} else {
						local600 = this.aClass426_1.aShortArray129;
						local604 = this.aClass426_1.aShortArray127;
						local264 = this.aClass426_1.aShortArray128;
						local612 = this.aClass426_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(645) float local645 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local647 = 0; local647 < this.anInt878; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7560(this.aShortArray32[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort20);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass102_Sub1_5.aFloat212 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray28[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt878; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray28[local876] << 24 | this.method7560(this.aShortArray32[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort20);
						local149.putInt(local95);
					}
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 4;
				local93 = local69.method29384(0, local88);
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass426_1 == null) {
						local264 = this.aShortArray28;
						local268 = this.aShortArray39;
						local272 = this.aShortArray30;
						local276 = this.aByteArray27;
					} else {
						local264 = this.aClass426_1.aShortArray129;
						local268 = this.aClass426_1.aShortArray127;
						local272 = this.aClass426_1.aShortArray128;
						local276 = this.aClass426_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(309) float local309 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local311 = 0; local311 < this.anInt878; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7560(this.aShortArray32[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort20);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass102_Sub1_5.aFloat212 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray28[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt878; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray28[local104] << 24 | this.method7560(this.aShortArray32[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort20);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29385();
			}
			this.aClass418_4.anInterface38_21 = local69;
			this.aClass418_4.aBoolean860 = true;
		}
		if (local20) {
			if (this.aClass418_3.anInterface38_22 == null) {
				this.aClass418_3.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_3.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass426_1 == null) {
				local956 = this.aShortArray28;
				local960 = this.aShortArray39;
				local600 = this.aShortArray30;
				local968 = this.aByteArray27;
			} else {
				local956 = this.aClass426_1.aShortArray129;
				local960 = this.aClass426_1.aShortArray127;
				local600 = this.aClass426_1.aShortArray128;
				local968 = this.aClass426_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass102_Sub1_5.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass102_Sub1_5.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt878; local568++) {
					@Pc(1098) Class463 local1098 = new Class463((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29481() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29499((float) local968[local568]);
						}
						local1098.method29482();
					}
					local1073.putFloat(local1098.aFloat297);
					local1073.putFloat(local1098.aFloat295);
					local1073.putFloat(local1098.aFloat296);
				}
				local69.method29383(0, local1073.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				@Pc(992) int local992 = this.anInt878 * 12;
				@Pc(997) long local997 = local69.method29384(0, local992);
				for (local647 = 0; local647 < this.anInt878; local647++) {
					@Pc(1019) Class463 local1019 = new Class463((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29481() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29499((float) local968[local647]);
						}
						local1019.method29482();
					}
					local985.putFloat(local997, local1019.aFloat297);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat295);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat296);
					local997 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_3.anInterface38_21 = local69;
			this.aClass418_3.aBoolean860 = true;
		}
		if (local36) {
			if (this.aClass418_2.anInterface38_22 == null) {
				this.aClass418_2.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_2.anInterface38_22;
			local69.method29327(this.anInt878 * 8, 8);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat(this.aFloatArray29[local154]);
					local149.putFloat(this.aFloatArray28[local154]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 8;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_2.anInterface38_21 = local69;
			this.aClass418_2.aBoolean860 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afw", name = "dl", descriptor = "(Lclient!ov;Lclient!eo;I)V")
	@Override
	public void method7428(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2) {
		if (aClass410_1 != null) {
			aClass410_1.method28962();
		}
		if (arg1 != null) {
			arg1.aBoolean773 = false;
		}
		if (this.anInt878 == 0) {
			return;
		}
		@Pc(16) Class487 local16 = this.aClass102_Sub1_5.aClass487_83;
		@Pc(20) Class487 local20 = this.aClass102_Sub1_5.aClass487_80;
		@Pc(24) Class487 local24 = this.aClass102_Sub1_5.aClass487_81;
		local20.method30080(arg0);
		local24.method30075(local20);
		local24.method30078(this.aClass102_Sub1_5.aClass487_88);
		if (!this.aBoolean180) {
			this.method7564();
		}
		@Pc(44) float[] local44 = this.aClass102_Sub1_5.aFloatArray66;
		local20.method30085(0.0F, (float) this.anInt884, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method30085(0.0F, (float) this.anInt885, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass102_Sub1_5.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt889;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt889;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt886 + this.anInt887 >> 1;
			@Pc(180) int local180 = this.anInt888 + this.anInt881 >> 1;
			@Pc(185) int local185 = this.anInt884;
			@Pc(216) float local216 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(245) float local245 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			local121 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			local147 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local121 >= -local147) {
				arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local216 / local147);
				arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt885;
			@Pc(375) float local375 = local24.aFloatArray114[0] * (float) local172 + local24.aFloatArray114[4] * (float) local185 + local24.aFloatArray114[8] * (float) local180 + local24.aFloatArray114[12];
			@Pc(404) float local404 = local24.aFloatArray114[1] * (float) local172 + local24.aFloatArray114[5] * (float) local185 + local24.aFloatArray114[9] * (float) local180 + local24.aFloatArray114[13];
			@Pc(433) float local433 = local24.aFloatArray114[2] * (float) local172 + local24.aFloatArray114[6] * (float) local185 + local24.aFloatArray114[10] * (float) local180 + local24.aFloatArray114[14];
			@Pc(462) float local462 = local24.aFloatArray114[3] * (float) local172 + local24.aFloatArray114[7] * (float) local185 + local24.aFloatArray114[11] * (float) local180 + local24.aFloatArray114[15];
			if (local433 >= -local462) {
				arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local375 / local462);
				arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3865 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3864 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3866 = (int) (this.aClass102_Sub1_5.aFloat203 + this.aClass102_Sub1_5.aFloat213 * local536 / local552);
						arg1.anInt3867 = (int) (this.aClass102_Sub1_5.aFloat201 + this.aClass102_Sub1_5.aFloat204 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local147 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3865 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray114[0] * (float) this.anInt889 + local16.aFloatArray114[12];
					local536 = local462 + local16.aFloatArray114[3] * (float) this.anInt889 + local16.aFloatArray114[15];
					arg1.anInt3868 = (int) (this.aClass102_Sub1_5.aFloat203 - (float) arg1.anInt3866 + this.aClass102_Sub1_5.aFloat213 * local528 / local536);
				}
				arg1.aBoolean773 = true;
			}
		}
		this.aClass102_Sub1_5.method21261(arg2);
		this.method7555(arg0);
		this.aClass102_Sub1_5.method21261(0);
		local20.method30080(arg0);
		local20.method30078(this.aClass102_Sub1_5.aClass487_75);
		this.method7598(local20);
	}

	@OriginalMember(owner = "client!afw", name = "ki", descriptor = "()Z")
	boolean method7605() {
		@Pc(7) boolean local7 = !this.aClass418_4.aBoolean860;
		@Pc(20) boolean local20 = (this.anInt875 & 0x37) != 0 && !this.aClass418_3.aBoolean860;
		@Pc(28) boolean local28 = !this.aClass418_1.aBoolean860;
		@Pc(36) boolean local36 = !this.aClass418_2.aBoolean860;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface38 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray31 != null) {
			if (this.aClass418_1.anInterface38_22 == null) {
				this.aClass418_1.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_1.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat((float) this.anIntArray81[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray82[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray83[this.aShortArray31[local154]]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 12;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local104 = this.aShortArray31[local95];
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray82[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray83[local104]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_1.anInterface38_21 = local69;
			this.aClass418_1.aBoolean860 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass418_4.anInterface38_22 == null) {
				this.aClass418_4.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_4.anInterface38_22;
			local69.method29327(this.anInt878 * 4, 4);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass426_1 == null) {
						local600 = this.aShortArray28;
						local604 = this.aShortArray39;
						local264 = this.aShortArray30;
						local612 = this.aByteArray27;
					} else {
						local600 = this.aClass426_1.aShortArray129;
						local604 = this.aClass426_1.aShortArray127;
						local264 = this.aClass426_1.aShortArray128;
						local612 = this.aClass426_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(645) float local645 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local647 = 0; local647 < this.anInt878; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7560(this.aShortArray32[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort20);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass102_Sub1_5.aFloat212 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray28[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt878; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray28[local876] << 24 | this.method7560(this.aShortArray32[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort20);
						local149.putInt(local95);
					}
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 4;
				local93 = local69.method29384(0, local88);
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass426_1 == null) {
						local264 = this.aShortArray28;
						local268 = this.aShortArray39;
						local272 = this.aShortArray30;
						local276 = this.aByteArray27;
					} else {
						local264 = this.aClass426_1.aShortArray129;
						local268 = this.aClass426_1.aShortArray127;
						local272 = this.aClass426_1.aShortArray128;
						local276 = this.aClass426_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(309) float local309 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local311 = 0; local311 < this.anInt878; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7560(this.aShortArray32[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort20);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass102_Sub1_5.aFloat212 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray28[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt878; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray28[local104] << 24 | this.method7560(this.aShortArray32[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort20);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29385();
			}
			this.aClass418_4.anInterface38_21 = local69;
			this.aClass418_4.aBoolean860 = true;
		}
		if (local20) {
			if (this.aClass418_3.anInterface38_22 == null) {
				this.aClass418_3.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_3.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass426_1 == null) {
				local956 = this.aShortArray28;
				local960 = this.aShortArray39;
				local600 = this.aShortArray30;
				local968 = this.aByteArray27;
			} else {
				local956 = this.aClass426_1.aShortArray129;
				local960 = this.aClass426_1.aShortArray127;
				local600 = this.aClass426_1.aShortArray128;
				local968 = this.aClass426_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass102_Sub1_5.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass102_Sub1_5.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt878; local568++) {
					@Pc(1098) Class463 local1098 = new Class463((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29481() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29499((float) local968[local568]);
						}
						local1098.method29482();
					}
					local1073.putFloat(local1098.aFloat297);
					local1073.putFloat(local1098.aFloat295);
					local1073.putFloat(local1098.aFloat296);
				}
				local69.method29383(0, local1073.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				@Pc(992) int local992 = this.anInt878 * 12;
				@Pc(997) long local997 = local69.method29384(0, local992);
				for (local647 = 0; local647 < this.anInt878; local647++) {
					@Pc(1019) Class463 local1019 = new Class463((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29481() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29499((float) local968[local647]);
						}
						local1019.method29482();
					}
					local985.putFloat(local997, local1019.aFloat297);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat295);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat296);
					local997 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_3.anInterface38_21 = local69;
			this.aClass418_3.aBoolean860 = true;
		}
		if (local36) {
			if (this.aClass418_2.anInterface38_22 == null) {
				this.aClass418_2.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_2.anInterface38_22;
			local69.method29327(this.anInt878 * 8, 8);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat(this.aFloatArray29[local154]);
					local149.putFloat(this.aFloatArray28[local154]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 8;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_2.anInterface38_21 = local69;
			this.aClass418_2.aBoolean860 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afw", name = "ke", descriptor = "()Z")
	boolean method7606() {
		@Pc(7) boolean local7 = !this.aClass418_4.aBoolean860;
		@Pc(20) boolean local20 = (this.anInt875 & 0x37) != 0 && !this.aClass418_3.aBoolean860;
		@Pc(28) boolean local28 = !this.aClass418_1.aBoolean860;
		@Pc(36) boolean local36 = !this.aClass418_2.aBoolean860;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface38 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray31 != null) {
			if (this.aClass418_1.anInterface38_22 == null) {
				this.aClass418_1.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_1.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat((float) this.anIntArray81[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray82[this.aShortArray31[local154]]);
					local149.putFloat((float) this.anIntArray83[this.aShortArray31[local154]]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 12;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local104 = this.aShortArray31[local95];
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray82[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray83[local104]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_1.anInterface38_21 = local69;
			this.aClass418_1.aBoolean860 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass418_4.anInterface38_22 == null) {
				this.aClass418_4.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_4.anInterface38_22;
			local69.method29327(this.anInt878 * 4, 4);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass426_1 == null) {
						local600 = this.aShortArray28;
						local604 = this.aShortArray39;
						local264 = this.aShortArray30;
						local612 = this.aByteArray27;
					} else {
						local600 = this.aClass426_1.aShortArray129;
						local604 = this.aClass426_1.aShortArray127;
						local264 = this.aClass426_1.aShortArray128;
						local612 = this.aClass426_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(645) float local645 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local647 = 0; local647 < this.anInt878; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7560(this.aShortArray32[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort20);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local600[local647] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local604[local647] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass102_Sub1_5.aFloat212 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray28[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt878; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray28[local876] << 24 | this.method7560(this.aShortArray32[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort20);
						local149.putInt(local95);
					}
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 4;
				local93 = local69.method29384(0, local88);
				if ((this.anInt875 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass426_1 == null) {
						local264 = this.aShortArray28;
						local268 = this.aShortArray39;
						local272 = this.aShortArray30;
						local276 = this.aByteArray27;
					} else {
						local264 = this.aClass426_1.aShortArray129;
						local268 = this.aClass426_1.aShortArray127;
						local272 = this.aClass426_1.aShortArray128;
						local276 = this.aClass426_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass102_Sub1_5.aFloat214 * 768.0F / (float) this.aShort19;
					@Pc(309) float local309 = this.aClass102_Sub1_5.aFloat216 * 768.0F / (float) this.aShort19;
					for (local311 = 0; local311 < this.anInt878; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7560(this.aShortArray32[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort20);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass102_Sub1_5.aFloat208;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass102_Sub1_5.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass102_Sub1_5.aFloat210;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass102_Sub1_5.aFloatArray68[0] * (float) local264[local311] + this.aClass102_Sub1_5.aFloatArray68[1] * (float) local268[local311] + this.aClass102_Sub1_5.aFloatArray68[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass102_Sub1_5.aFloat212 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray28[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt878; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray28[local104] << 24 | this.method7560(this.aShortArray32[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort20);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29385();
			}
			this.aClass418_4.anInterface38_21 = local69;
			this.aClass418_4.aBoolean860 = true;
		}
		if (local20) {
			if (this.aClass418_3.anInterface38_22 == null) {
				this.aClass418_3.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_3.anInterface38_22;
			local69.method29327(this.anInt878 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass426_1 == null) {
				local956 = this.aShortArray28;
				local960 = this.aShortArray39;
				local600 = this.aShortArray30;
				local968 = this.aByteArray27;
			} else {
				local956 = this.aClass426_1.aShortArray129;
				local960 = this.aClass426_1.aShortArray127;
				local600 = this.aClass426_1.aShortArray128;
				local968 = this.aClass426_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass102_Sub1_5.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass102_Sub1_5.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt878; local568++) {
					@Pc(1098) Class463 local1098 = new Class463((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29481() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29499((float) local968[local568]);
						}
						local1098.method29482();
					}
					local1073.putFloat(local1098.aFloat297);
					local1073.putFloat(local1098.aFloat295);
					local1073.putFloat(local1098.aFloat296);
				}
				local69.method29383(0, local1073.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				@Pc(992) int local992 = this.anInt878 * 12;
				@Pc(997) long local997 = local69.method29384(0, local992);
				for (local647 = 0; local647 < this.anInt878; local647++) {
					@Pc(1019) Class463 local1019 = new Class463((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29481() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29499((float) local968[local647]);
						}
						local1019.method29482();
					}
					local985.putFloat(local997, local1019.aFloat297);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat295);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat296);
					local997 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_3.anInterface38_21 = local69;
			this.aClass418_3.aBoolean860 = true;
		}
		if (local36) {
			if (this.aClass418_2.anInterface38_22 == null) {
				this.aClass418_2.anInterface38_22 = this.aClass102_Sub1_5.method21239(this.aBoolean179);
			}
			local69 = this.aClass418_2.anInterface38_22;
			local69.method29327(this.anInt878 * 8, 8);
			local81 = this.aClass102_Sub1_5.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass102_Sub1_5.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt878; local154++) {
					local149.putFloat(this.aFloatArray29[local154]);
					local149.putFloat(this.aFloatArray28[local154]);
				}
				local69.method29383(0, local149.position(), this.aClass102_Sub1_5.aLong168);
			} else {
				local88 = this.anInt878 * 8;
				local93 = local69.method29384(0, local88);
				for (local95 = 0; local95 < this.anInt878; local95++) {
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
				}
				local69.method29385();
			}
			this.aClass418_2.anInterface38_21 = local69;
			this.aClass418_2.aBoolean860 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afw", name = "kx", descriptor = "()V")
	void method7607() {
		if (this.aClass418_1 != null) {
			this.aClass418_1.method28994();
		}
		if (this.aClass418_2 != null) {
			this.aClass418_2.method28994();
		}
		if (this.aClass418_4 != null) {
			this.aClass418_4.method28994();
		}
		if (this.aClass418_3 != null) {
			this.aClass418_3.method28994();
		}
		if (this.aClass409_1 != null) {
			this.aClass409_1.method28958();
		}
	}

	@OriginalMember(owner = "client!afw", name = "kh", descriptor = "(II)I")
	int method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afw", name = "ds", descriptor = "(Lclient!ov;)V")
	@Override
	public void method7443(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class487 local3 = this.aClass102_Sub1_5.aClass487_80;
		local3.method30080(arg0);
		@Pc(11) int local11;
		if (this.aClass228Array3 != null) {
			for (local11 = 0; local11 < this.aClass228Array3.length; local11++) {
				@Pc(21) Class228 local21 = this.aClass228Array3[local11];
				@Pc(23) Class228 local23 = local21;
				if (local21.aClass228_1 != null) {
					local23 = local21.aClass228_1;
				}
				local23.anInt3675 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1559429851;
				local23.anInt3679 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * -1634778173;
				local23.anInt3677 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3672 * -1615205857] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3672 * -1615205857] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3672 * -1615205857]) * 980588743;
				local23.anInt3680 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -1908098027;
				local23.anInt3670 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * -283931287;
				local23.anInt3678 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3673 * 2755307] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3673 * 2755307] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3673 * 2755307]) * 404999259;
				local23.anInt3676 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[4] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[8] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -669889479;
				local23.anInt3682 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[5] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[9] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * 604263833;
				local23.anInt3683 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local21.anInt3674 * -666678663] + local3.aFloatArray114[6] * (float) this.anIntArray82[local21.anInt3674 * -666678663] + local3.aFloatArray114[10] * (float) this.anIntArray83[local21.anInt3674 * -666678663]) * -272903405;
			}
		}
		if (this.aClass211Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass211Array3.length; local11++) {
			@Pc(505) Class211 local505 = this.aClass211Array3[local11];
			@Pc(507) Class211 local507 = local505;
			if (local505.aClass211_2 != null) {
				local507 = local505.aClass211_2;
			}
			if (local505.aClass487_96 == null) {
				local505.aClass487_96 = new Class487(local3);
			} else {
				local505.aClass487_96.method30075(local3);
			}
			local507.anInt3605 = (int) (local3.aFloatArray114[12] + local3.aFloatArray114[0] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[4] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[8] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 458898327;
			local507.anInt3606 = (int) (local3.aFloatArray114[13] + local3.aFloatArray114[1] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[5] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[9] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * 17933845;
			local507.anInt3602 = (int) (local3.aFloatArray114[14] + local3.aFloatArray114[2] * (float) this.anIntArray81[local505.anInt3604 * -1810283297] + local3.aFloatArray114[6] * (float) this.anIntArray82[local505.anInt3604 * -1810283297] + local3.aFloatArray114[10] * (float) this.anIntArray83[local505.anInt3604 * -1810283297]) * -116510537;
		}
	}

	@OriginalMember(owner = "client!afw", name = "i", descriptor = "(BIZ)Lclient!dn;")
	@Override
	public Class105 method7324(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class105_Sub3 local22;
		@Pc(14) Class105_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass102_Sub1_5.aClass105_Sub3Array6[arg0 - 1];
			local22 = this.aClass102_Sub1_5.aClass105_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class105_Sub3(this.aClass102_Sub1_5, 0, 0, true, false);
		}
		return this.method7561(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afw", name = "kg", descriptor = "(ISI)I")
	int method7610(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass102_Sub1_5.anIntArray262[this.method7559(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class227 local20 = this.aClass102_Sub1_5.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte111 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!afw", name = "kb", descriptor = "(ISI)I")
	int method7611(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass102_Sub1_5.anIntArray262[this.method7559(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class227 local20 = this.aClass102_Sub1_5.aClass235_6.method26120(arg1 & 0xFFFF, 73831368);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte111 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}
}
