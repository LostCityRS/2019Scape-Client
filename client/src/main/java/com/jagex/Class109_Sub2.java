package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afk")
public class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!afk", name = "w", descriptor = "I")
	static final int anInt776 = 7;

	@OriginalMember(owner = "client!afk", name = "l", descriptor = "I")
	static final int anInt777 = 1;

	@OriginalMember(owner = "client!afk", name = "u", descriptor = "I")
	static final int anInt778 = 2;

	@OriginalMember(owner = "client!afk", name = "z", descriptor = "I")
	static final int anInt779 = 4;

	@OriginalMember(owner = "client!afk", name = "p", descriptor = "I")
	static final int anInt780 = 8;

	@OriginalMember(owner = "client!afk", name = "d", descriptor = "I")
	static final int anInt781 = 16;

	@OriginalMember(owner = "client!afk", name = "f", descriptor = "I")
	static final int anInt786 = 4;

	@OriginalMember(owner = "client!afk", name = "br", descriptor = "[J")
	static long[] aLongArray8;

	@OriginalMember(owner = "client!afk", name = "bs", descriptor = "I")
	static int anInt793;

	@OriginalMember(owner = "client!afk", name = "cl", descriptor = "I")
	static int anInt794;

	@OriginalMember(owner = "client!afk", name = "cg", descriptor = "I")
	static int anInt795;

	@OriginalMember(owner = "client!afk", name = "ce", descriptor = "Z")
	static boolean aBoolean160;

	@OriginalMember(owner = "client!afk", name = "bg", descriptor = "[F")
	static float[] aFloatArray27 = new float[2];

	@OriginalMember(owner = "client!afk", name = "ba", descriptor = "[I")
	static final int[] anIntArray66 = new int[8];

	@OriginalMember(owner = "client!afk", name = "bp", descriptor = "[I")
	static final int[] anIntArray63 = new int[8];

	@OriginalMember(owner = "client!afk", name = "bj", descriptor = "[I")
	static final int[] anIntArray67 = new int[8];

	@OriginalMember(owner = "client!afk", name = "i", descriptor = "[I")
	int[] anIntArray60;

	@OriginalMember(owner = "client!afk", name = "r", descriptor = "I")
	int anInt782;

	@OriginalMember(owner = "client!afk", name = "v", descriptor = "I")
	int anInt783;

	@OriginalMember(owner = "client!afk", name = "o", descriptor = "B")
	byte aByte4;

	@OriginalMember(owner = "client!afk", name = "s", descriptor = "S")
	short aShort57;

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "S")
	short aShort58;

	@OriginalMember(owner = "client!afk", name = "a", descriptor = "[I")
	int[] anIntArray61;

	@OriginalMember(owner = "client!afk", name = "g", descriptor = "[I")
	int[] anIntArray62;

	@OriginalMember(owner = "client!afk", name = "j", descriptor = "[[I")
	int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!afk", name = "bz", descriptor = "[Lclient!br;")
	Class194[] aClass194Array1;

	@OriginalMember(owner = "client!afk", name = "t", descriptor = "[S")
	short[] aShortArray16;

	@OriginalMember(owner = "client!afk", name = "bu", descriptor = "[Lclient!cq;")
	Class210[] aClass210Array2;

	@OriginalMember(owner = "client!afk", name = "bc", descriptor = "S")
	short aShort59;

	@OriginalMember(owner = "client!afk", name = "al", descriptor = "[S")
	short[] aShortArray17;

	@OriginalMember(owner = "client!afk", name = "aq", descriptor = "[S")
	short[] aShortArray18;

	@OriginalMember(owner = "client!afk", name = "aw", descriptor = "[F")
	float[] aFloatArray25;

	@OriginalMember(owner = "client!afk", name = "as", descriptor = "[F")
	float[] aFloatArray26;

	@OriginalMember(owner = "client!afk", name = "av", descriptor = "[[I")
	int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!afk", name = "am", descriptor = "[S")
	short[] aShortArray19;

	@OriginalMember(owner = "client!afk", name = "ap", descriptor = "[S")
	short[] aShortArray20;

	@OriginalMember(owner = "client!afk", name = "ar", descriptor = "[S")
	short[] aShortArray21;

	@OriginalMember(owner = "client!afk", name = "af", descriptor = "Lclient!cf;")
	Interface16 anInterface16_2;

	@OriginalMember(owner = "client!afk", name = "ak", descriptor = "Lclient!bv;")
	Interface14 anInterface14_4;

	@OriginalMember(owner = "client!afk", name = "bo", descriptor = "[Lclient!cw;")
	Class216[] aClass216Array1;

	@OriginalMember(owner = "client!afk", name = "bh", descriptor = "S")
	short aShort60;

	@OriginalMember(owner = "client!afk", name = "bw", descriptor = "I")
	int anInt789;

	@OriginalMember(owner = "client!afk", name = "ao", descriptor = "[S")
	short[] aShortArray22;

	@OriginalMember(owner = "client!afk", name = "bf", descriptor = "I")
	int anInt790;

	@OriginalMember(owner = "client!afk", name = "bl", descriptor = "I")
	int anInt791;

	@OriginalMember(owner = "client!afk", name = "bi", descriptor = "S")
	short aShort61;

	@OriginalMember(owner = "client!afk", name = "bd", descriptor = "S")
	short aShort62;

	@OriginalMember(owner = "client!afk", name = "bx", descriptor = "S")
	short aShort63;

	@OriginalMember(owner = "client!afk", name = "bn", descriptor = "S")
	short aShort64;

	@OriginalMember(owner = "client!afk", name = "bq", descriptor = "S")
	short aShort65;

	@OriginalMember(owner = "client!afk", name = "bm", descriptor = "[I")
	int[] anIntArray64;

	@OriginalMember(owner = "client!afk", name = "bb", descriptor = "[I")
	int[] anIntArray65;

	@OriginalMember(owner = "client!afk", name = "be", descriptor = "[S")
	short[] aShortArray23;

	@OriginalMember(owner = "client!afk", name = "ag", descriptor = "[S")
	short[] aShortArray24;

	@OriginalMember(owner = "client!afk", name = "ah", descriptor = "[S")
	short[] aShortArray25;

	@OriginalMember(owner = "client!afk", name = "au", descriptor = "[B")
	byte[] aByteArray21;

	@OriginalMember(owner = "client!afk", name = "ai", descriptor = "Lclient!cx;")
	Class217 aClass217_1;

	@OriginalMember(owner = "client!afk", name = "ax", descriptor = "[S")
	short[] aShortArray26;

	@OriginalMember(owner = "client!afk", name = "bv", descriptor = "[[I")
	int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!afk", name = "by", descriptor = "[Lclient!du;")
	Class234[] aClass234Array2;

	@OriginalMember(owner = "client!afk", name = "ac", descriptor = "[B")
	byte[] aByteArray22;

	@OriginalMember(owner = "client!afk", name = "q", descriptor = "Z")
	boolean aBoolean155 = false;

	@OriginalMember(owner = "client!afk", name = "x", descriptor = "Z")
	boolean aBoolean156 = false;

	@OriginalMember(owner = "client!afk", name = "b", descriptor = "I")
	int anInt784 = 0;

	@OriginalMember(owner = "client!afk", name = "h", descriptor = "I")
	int anInt785 = 0;

	@OriginalMember(owner = "client!afk", name = "ae", descriptor = "I")
	int anInt788 = 0;

	@OriginalMember(owner = "client!afk", name = "at", descriptor = "I")
	int anInt792 = 0;

	@OriginalMember(owner = "client!afk", name = "ad", descriptor = "I")
	int anInt787 = 0;

	@OriginalMember(owner = "client!afk", name = "an", descriptor = "Z")
	boolean aBoolean157 = true;

	@OriginalMember(owner = "client!afk", name = "bk", descriptor = "Z")
	boolean aBoolean158 = false;

	@OriginalMember(owner = "client!afk", name = "bt", descriptor = "Z")
	boolean aBoolean159 = false;

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_26;

	@OriginalMember(owner = "client!afk", name = "aj", descriptor = "Lclient!bp;")
	Class193 aClass193_7;

	@OriginalMember(owner = "client!afk", name = "az", descriptor = "Lclient!bp;")
	Class193 aClass193_8;

	@OriginalMember(owner = "client!afk", name = "ab", descriptor = "Lclient!bp;")
	Class193 aClass193_10;

	@OriginalMember(owner = "client!afk", name = "ay", descriptor = "Lclient!bp;")
	Class193 aClass193_9;

	@OriginalMember(owner = "client!afk", name = "aa", descriptor = "Lclient!ba;")
	Class178 aClass178_1;

	@OriginalMember(owner = "client!afk", name = "<init>", descriptor = "(Lclient!afa;)V", line = 99)
	Class109_Sub2(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aClass104_Sub1_26 = arg0;
		this.aClass193_7 = new Class193(null, 5126, 3, 0);
		this.aClass193_8 = new Class193(null, 5126, 2, 0);
		this.aClass193_10 = new Class193(null, 5126, 3, 0);
		this.aClass193_9 = new Class193(null, 5121, 4, 0);
		this.aClass178_1 = new Class178();
	}

	@OriginalMember(owner = "client!afk", name = "<init>", descriptor = "(Lclient!afa;Lclient!dq;IIII)V", line = 108)
	Class109_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub1_26 = arg0;
		this.anInt782 = arg2;
		this.anInt783 = arg5;
		if (Class179.method24432(arg2, arg5)) {
			this.aClass193_7 = new Class193(null, 5126, 3, 0);
		}
		if (Class179.method24441(arg2, arg5)) {
			this.aClass193_8 = new Class193(null, 5126, 2, 0);
		}
		if (Class179.method24437(arg2, arg5)) {
			this.aClass193_10 = new Class193(null, 5126, 3, 0);
		}
		if (Class179.method24438(arg2, arg5)) {
			this.aClass193_9 = new Class193(null, 5121, 4, 0);
		}
		if (Class179.method24444(arg2, arg5)) {
			this.aClass178_1 = new Class178();
		}
		@Pc(104) Class225 local104 = arg0.aClass225_6;
		@Pc(107) Interface48 local107 = arg0.anInterface48_6;
		@Pc(111) int[] local111 = new int[arg1.anInt3743];
		this.anIntArray65 = new int[arg1.anInt3740 + 1];
		for (@Pc(120) int local120 = 0; local120 < arg1.anInt3743; local120++) {
			if (arg1.aByteArray72 == null || arg1.aByteArray72[local120] != 2) {
				if (arg1.aShortArray90 != null && arg1.aShortArray90[local120] != -1) {
					@Pc(153) Class235 local153 = local104.method25597(arg1.aShortArray90[local120] & 0xFFFF, -2024585117);
					if (((this.anInt783 & 0x40) == 0 || !local153.aBoolean656) && local153.aBoolean657) {
						continue;
					}
				}
				local111[this.anInt792++] = local120;
				this.anIntArray65[arg1.aShortArray97[local120]]++;
				this.anIntArray65[arg1.aShortArray88[local120]]++;
				this.anIntArray65[arg1.aShortArray92[local120]]++;
			}
		}
		this.anInt787 = this.anInt792;
		@Pc(218) long[] local218 = new long[this.anInt792];
		@Pc(227) boolean local227 = (this.anInt782 & 0x100) != 0;
		@Pc(237) int local237;
		@Pc(241) int local241;
		@Pc(254) int local254;
		@Pc(486) int local486;
		@Pc(374) short local374;
		for (@Pc(229) int local229 = 0; local229 < this.anInt792; local229++) {
			local237 = local111[local229];
			@Pc(239) Class235 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			@Pc(252) boolean local252;
			if (arg1.aClass227Array1 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass227Array1.length; local254++) {
					@Pc(264) Class227 local264 = arg1.aClass227Array1[local254];
					if (local237 == local264.anInt3648 * 1084874511) {
						@Pc(278) Class442 local278 = local107.method28945(local264.anInt3647 * 422903595, -1723517322);
						if (local278.aBoolean769) {
							local252 = true;
						}
						if (local278.anInt4892 * -153468217 != -1) {
							@Pc(297) Class235 local297 = local104.method25597(local278.anInt4892 * -153468217, 58540995);
							if (local297.aClass618_2 == Class618.aClass618_3) {
								this.aBoolean155 = true;
							}
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt787--;
					continue;
				}
			}
			if (arg1.aClass234Array4 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass234Array4.length; local254++) {
					@Pc(336) Class234 local336 = arg1.aClass234Array4[local254];
					if (local237 == local336.anInt3755 * 171091685) {
						@Pc(352) Class439 local352 = this.aClass104_Sub1_26.anInterface46_6.method28821(local336.anInt3767 * -343583539, -1205529314);
						if (local352.aBoolean765) {
							local252 = true;
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt787--;
					continue;
				}
			}
			local374 = -1;
			if (arg1.aShortArray90 != null) {
				local374 = arg1.aShortArray90[local237];
				if (local374 != -1) {
					local239 = local104.method25597(local374 & 0xFFFF, 2074616821);
					if ((this.anInt783 & 0x40) != 0 && local239.aBoolean656) {
						local374 = -1;
						local239 = null;
					} else {
						local245 = local239.aByte114;
						local247 = local239.aByte112;
						if (local239.aFloat278 != 0.0F || local239.aFloat279 != 0.0F) {
							this.aBoolean156 = true;
						}
					}
				}
			}
			@Pc(442) boolean local442 = arg1.aByteArray74 != null && arg1.aByteArray74[local237] != 0 || local239 != null && local239.aClass618_2 != Class618.aClass618_5;
			if ((local227 || local442) && arg1.aByteArray73 != null) {
				local241 += arg1.aByteArray73[local237] << 17;
			}
			if (local442) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local486 = local243 + ((local374 & 0xFFFF) << 16);
			@Pc(492) int local492 = local486 + (local229 & 0xFFFF);
			local218[local229] = ((long) local241 << 32) + (long) local492;
			this.aBoolean155 |= local442;
			this.aBoolean156 |= local239 != null && (local239.aFloat278 != 0.0F || local239.aFloat279 != 0.0F);
		}
		Class121.method8705(local218, local111, (byte) 112);
		this.anInt784 = arg1.anInt3739;
		this.anInt785 = arg1.anInt3740;
		this.anIntArray61 = arg1.anIntArray339;
		this.anIntArray62 = arg1.anIntArray342;
		this.anIntArray60 = arg1.anIntArray349;
		this.aShortArray16 = arg1.aShortArray98;
		@Pc(562) Class187[] local562 = new Class187[this.anInt785];
		this.aClass234Array2 = arg1.aClass234Array4;
		this.aClass210Array2 = arg1.aClass210Array4;
		@Pc(611) int local611;
		if (arg1.aClass227Array1 != null) {
			this.anInt789 = arg1.aClass227Array1.length;
			this.aClass216Array1 = new Class216[this.anInt789];
			this.aClass194Array1 = new Class194[this.anInt789];
			for (local237 = 0; local237 < this.anInt789; local237++) {
				@Pc(599) Class227 local599 = arg1.aClass227Array1[local237];
				@Pc(607) Class442 local607 = local107.method28945(local599.anInt3647 * 422903595, -2035028167);
				local486 = -1;
				for (local611 = 0; local611 < this.anInt792; local611++) {
					if (local111[local611] == local599.anInt3648 * 1084874511) {
						local486 = local611;
						break;
					}
				}
				if (local486 == -1) {
					throw new RuntimeException();
				}
				local611 = Class685.anIntArray524[arg1.aShortArray89[local599.anInt3648 * 1084874511] & 0xFFFF] & 0xFFFFFF;
				local611 |= 255 - (arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local599.anInt3648 * 1084874511]) << 24;
				this.aClass216Array1[local237] = new Class216(local486, arg1.aShortArray97[local599.anInt3648 * 1084874511], arg1.aShortArray88[local599.anInt3648 * 1084874511], arg1.aShortArray92[local599.anInt3648 * 1084874511], local607.anInt4888 * -298655207, local607.anInt4889 * 1373877659, local607.anInt4892 * -153468217, local607.anInt4887 * 1129274231, local607.anInt4890 * 1161833965, local607.aBoolean769, local607.aBoolean768, local599.anInt3650 * 530428003);
				this.aClass194Array1[local237] = new Class194(local611);
			}
		}
		local237 = this.anInt792 * 3;
		this.aShortArray24 = new short[local237];
		this.aShortArray25 = new short[local237];
		this.aShortArray17 = new short[local237];
		this.aByteArray22 = new byte[local237];
		this.aFloatArray25 = new float[local237];
		this.aFloatArray26 = new float[local237];
		this.aShortArray19 = new short[this.anInt792];
		this.aByteArray21 = new byte[this.anInt792];
		this.aShortArray21 = new short[this.anInt792];
		this.aShortArray20 = new short[this.anInt792];
		this.aShortArray18 = new short[this.anInt792];
		this.aShortArray26 = new short[this.anInt792];
		if (arg1.aShortArray91 != null) {
			this.aShortArray22 = new short[this.anInt792];
		}
		this.aShort57 = (short) arg3;
		this.aShort58 = (short) arg4;
		this.aShortArray23 = new short[local237];
		aLongArray8 = new long[local237];
		@Pc(819) int local819 = 0;
		for (local241 = 0; local241 < arg1.anInt3740; local241++) {
			local486 = this.anIntArray65[local241];
			this.anIntArray65[local241] = local819;
			local819 += local486;
			local562[local241] = new Class187();
		}
		this.anIntArray65[arg1.anInt3740] = local819;
		@Pc(860) Class242 local860 = this.method6825(arg1, local111, this.anInt792);
		@Pc(864) Class192[] local864 = new Class192[arg1.anInt3743];
		@Pc(875) short local875;
		@Pc(885) short local885;
		@Pc(895) int local895;
		@Pc(905) int local905;
		for (local611 = 0; local611 < arg1.anInt3743; local611++) {
			local875 = arg1.aShortArray97[local611];
			local374 = arg1.aShortArray88[local611];
			local885 = arg1.aShortArray92[local611];
			local895 = this.anIntArray61[local374] - this.anIntArray61[local875];
			local905 = this.anIntArray62[local374] - this.anIntArray62[local875];
			@Pc(915) int local915 = this.anIntArray60[local374] - this.anIntArray60[local875];
			@Pc(925) int local925 = this.anIntArray61[local885] - this.anIntArray61[local875];
			@Pc(935) int local935 = this.anIntArray62[local885] - this.anIntArray62[local875];
			@Pc(945) int local945 = this.anIntArray60[local885] - this.anIntArray60[local875];
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
			@Pc(1047) byte local1047 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local611];
			if (local1047 == 0) {
				@Pc(1053) Class187 local1053 = local562[local875];
				local1053.anInt3336 += local953;
				local1053.anInt3335 += local961;
				local1053.anInt3337 += local969;
				local1053.anInt3338++;
				@Pc(1081) Class187 local1081 = local562[local374];
				local1081.anInt3336 += local953;
				local1081.anInt3335 += local961;
				local1081.anInt3337 += local969;
				local1081.anInt3338++;
				@Pc(1109) Class187 local1109 = local562[local885];
				local1109.anInt3336 += local953;
				local1109.anInt3335 += local961;
				local1109.anInt3337 += local969;
				local1109.anInt3338++;
			} else if (local1047 == 1) {
				@Pc(1145) Class192 local1145 = local864[local611] = new Class192();
				local1145.anInt3352 = local953;
				local1145.anInt3350 = local961;
				local1145.anInt3351 = local969;
			}
		}
		@Pc(1173) int local1173;
		for (local611 = 0; local611 < this.anInt792; local611++) {
			@Pc(1166) int local1166 = local111[local611];
			local1173 = arg1.aShortArray89[local1166] & 0xFFFF;
			local254 = arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local1166] & 0xFF;
			@Pc(1195) short local1195 = arg1.aShortArray90 == null ? -1 : arg1.aShortArray90[local1166];
			if (local1195 != -1 && (this.anInt783 & 0x40) != 0 && local104.method25597(local1195, 679386231).aBoolean656) {
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
				@Pc(1236) short local1236 = arg1.aShortArray96 == null ? -1 : arg1.aShortArray96[local1166];
				@Pc(1246) int local1246;
				if (local1236 == 32766) {
					local1246 = arg1.aByteArray69[local1166] & 0xFF;
					@Pc(1253) int local1253 = arg1.aByteArray70[local1166] & 0xFF;
					@Pc(1260) int local1260 = arg1.aByteArray71[local1166] & 0xFF;
					@Pc(1270) int local1270 = local1246 + arg1.anIntArray341[arg1.aShortArray97[local1166]];
					local1273 = local1270;
					@Pc(1283) int local1283 = local1253 + arg1.anIntArray341[arg1.aShortArray88[local1166]];
					local1286 = local1270;
					@Pc(1296) int local1296 = local1260 + arg1.anIntArray341[arg1.aShortArray92[local1166]];
					local1299 = local1270;
					local1213 = arg1.aFloatArray101[local1270];
					local1215 = arg1.aFloatArray100[local1270];
					local1217 = arg1.aFloatArray101[local1283];
					local1219 = arg1.aFloatArray100[local1283];
					local1221 = arg1.aFloatArray101[local1296];
					local1223 = arg1.aFloatArray100[local1296];
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
					@Pc(1367) byte local1367 = arg1.aByteArray68[local1356];
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
						local1374 = arg1.aShortArray97[local1166];
						local1379 = arg1.aShortArray88[local1166];
						local1384 = arg1.aShortArray92[local1166];
						@Pc(1389) short local1389 = arg1.aShortArray93[local1356];
						@Pc(1394) short local1394 = arg1.aShortArray94[local1356];
						@Pc(1399) short local1399 = arg1.aShortArray95[local1356];
						@Pc(1405) float local1405 = (float) arg1.anIntArray339[local1389];
						@Pc(1411) float local1411 = (float) arg1.anIntArray342[local1389];
						local1417 = arg1.anIntArray349[local1389];
						local1425 = (float) arg1.anIntArray339[local1394] - local1405;
						local1433 = (float) arg1.anIntArray342[local1394] - local1411;
						@Pc(1441) float local1441 = (float) arg1.anIntArray349[local1394] - local1417;
						@Pc(1449) float local1449 = (float) arg1.anIntArray339[local1399] - local1405;
						@Pc(1457) float local1457 = (float) arg1.anIntArray342[local1399] - local1411;
						@Pc(1465) float local1465 = (float) arg1.anIntArray349[local1399] - local1417;
						@Pc(1473) float local1473 = (float) arg1.anIntArray339[local1374] - local1405;
						@Pc(1481) float local1481 = (float) arg1.anIntArray342[local1374] - local1411;
						@Pc(1489) float local1489 = (float) arg1.anIntArray349[local1374] - local1417;
						@Pc(1497) float local1497 = (float) arg1.anIntArray339[local1379] - local1405;
						@Pc(1505) float local1505 = (float) arg1.anIntArray342[local1379] - local1411;
						local1513 = (float) arg1.anIntArray349[local1379] - local1417;
						local1521 = (float) arg1.anIntArray339[local1384] - local1405;
						local1529 = (float) arg1.anIntArray342[local1384] - local1411;
						local1537 = (float) arg1.anIntArray349[local1384] - local1417;
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
						local1374 = arg1.aShortArray97[local1166];
						local1379 = arg1.aShortArray88[local1166];
						local1384 = arg1.aShortArray92[local1166];
						@Pc(1742) int local1742 = local860.anIntArray352[local1356];
						@Pc(1747) int local1747 = local860.anIntArray354[local1356];
						@Pc(1752) int local1752 = local860.anIntArray353[local1356];
						@Pc(1757) float[] local1757 = local860.aFloatArrayArray24[local1356];
						@Pc(1762) byte local1762 = arg1.aByteArray76[local1356];
						local1417 = (float) arg1.anIntArray348[local1356] / 256.0F;
						if (local1367 == 1) {
							local1425 = (float) arg1.anIntArray347[local1356] / 1024.0F;
							method6820(arg1.anIntArray339[local1374], arg1.anIntArray342[local1374], arg1.anIntArray349[local1374], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method6820(arg1.anIntArray339[local1379], arg1.anIntArray342[local1379], arg1.anIntArray349[local1379], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method6820(arg1.anIntArray339[local1384], arg1.anIntArray342[local1384], arg1.anIntArray349[local1384], local1742, local1747, local1752, local1757, local1425, local1762, local1417, aFloatArray27);
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
							local1425 = (float) arg1.anIntArray344[local1356] / 256.0F;
							local1433 = (float) arg1.anIntArray338[local1356] / 256.0F;
							@Pc(2007) int local2007 = arg1.anIntArray339[local1379] - arg1.anIntArray339[local1374];
							@Pc(2017) int local2017 = arg1.anIntArray342[local1379] - arg1.anIntArray342[local1374];
							@Pc(2027) int local2027 = arg1.anIntArray349[local1379] - arg1.anIntArray349[local1374];
							@Pc(2037) int local2037 = arg1.anIntArray339[local1384] - arg1.anIntArray339[local1374];
							@Pc(2047) int local2047 = arg1.anIntArray342[local1384] - arg1.anIntArray342[local1374];
							@Pc(2057) int local2057 = arg1.anIntArray349[local1384] - arg1.anIntArray349[local1374];
							@Pc(2065) int local2065 = local2017 * local2057 - local2047 * local2027;
							@Pc(2073) int local2073 = local2027 * local2037 - local2057 * local2007;
							@Pc(2081) int local2081 = local2007 * local2047 - local2037 * local2017;
							local1513 = 64.0F / (float) arg1.anIntArray345[local1356];
							local1521 = 64.0F / (float) arg1.anIntArray346[local1356];
							local1529 = 64.0F / (float) arg1.anIntArray347[local1356];
							local1537 = ((float) local2065 * local1757[0] + (float) local2073 * local1757[1] + (float) local2081 * local1757[2]) / local1513;
							local1545 = ((float) local2065 * local1757[3] + (float) local2073 * local1757[4] + (float) local2081 * local1757[5]) / local1521;
							local1553 = ((float) local2065 * local1757[6] + (float) local2073 * local1757[7] + (float) local2081 * local1757[8]) / local1529;
							local1246 = method6823(local1537, local1545, local1553);
							method6824(arg1.anIntArray339[local1374], arg1.anIntArray342[local1374], arg1.anIntArray349[local1374], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method6824(arg1.anIntArray339[local1379], arg1.anIntArray342[local1379], arg1.anIntArray349[local1379], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method6824(arg1.anIntArray339[local1384], arg1.anIntArray342[local1384], arg1.anIntArray349[local1384], local1742, local1747, local1752, local1246, local1757, local1762, local1417, local1425, local1433, aFloatArray27);
							local1221 = aFloatArray27[0];
							local1223 = aFloatArray27[1];
						} else if (local1367 == 3) {
							method6816(arg1.anIntArray339[local1374], arg1.anIntArray342[local1374], arg1.anIntArray349[local1374], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
							local1213 = aFloatArray27[0];
							local1215 = aFloatArray27[1];
							method6816(arg1.anIntArray339[local1379], arg1.anIntArray342[local1379], arg1.anIntArray349[local1379], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
							local1217 = aFloatArray27[0];
							local1219 = aFloatArray27[1];
							method6816(arg1.anIntArray339[local1384], arg1.anIntArray342[local1384], arg1.anIntArray349[local1384], local1742, local1747, local1752, local1757, local1762, local1417, aFloatArray27);
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
			@Pc(2503) byte local2503 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local1166];
			if (local2503 == 0) {
				@Pc(2512) long local2512 = (long) ((local1173 << 8) + local254);
				@Pc(2517) short local2517 = arg1.aShortArray97[local1166];
				@Pc(2522) short local2522 = arg1.aShortArray88[local1166];
				local1374 = arg1.aShortArray92[local1166];
				@Pc(2531) Class187 local2531 = local562[local2517];
				this.aShortArray21[local611] = this.method6586(arg1, local2517, local2512 | local1273 << 24, local2531.anInt3336, local2531.anInt3335, local2531.anInt3337, local2531.anInt3338, local1213, local1215);
				@Pc(2558) Class187 local2558 = local562[local2522];
				this.aShortArray20[local611] = this.method6586(arg1, local2522, local2512 | local1286 << 24, local2558.anInt3336, local2558.anInt3335, local2558.anInt3337, local2558.anInt3338, local1217, local1219);
				@Pc(2585) Class187 local2585 = local562[local1374];
				this.aShortArray18[local611] = this.method6586(arg1, local1374, local2512 | local1299 << 24, local2585.anInt3336, local2585.anInt3335, local2585.anInt3337, local2585.anInt3338, local1221, local1223);
			} else if (local2503 == 1) {
				@Pc(2616) Class192 local2616 = local864[local1166];
				@Pc(2648) long local2648 = ((long) (local2616.anInt3352 & Integer.MIN_VALUE) << 9) + ((long) (local2616.anInt3350 + 256) << 32) + ((long) (local2616.anInt3351 + 256) << 24) + (long) (local1173 << 8) + (long) local254;
				this.aShortArray21[local611] = this.method6586(arg1, arg1.aShortArray97[local1166], local2648 | local1273 << 41, local2616.anInt3352, local2616.anInt3350, local2616.anInt3351, 0, local1213, local1215);
				this.aShortArray20[local611] = this.method6586(arg1, arg1.aShortArray88[local1166], local2648 | local1273 << 41, local2616.anInt3352, local2616.anInt3350, local2616.anInt3351, 0, local1217, local1219);
				this.aShortArray18[local611] = this.method6586(arg1, arg1.aShortArray92[local1166], local2648 | local1273 << 41, local2616.anInt3352, local2616.anInt3350, local2616.anInt3351, 0, local1221, local1223);
			}
			if (arg1.aByteArray74 != null) {
				this.aByteArray21[local611] = arg1.aByteArray74[local1166];
			}
			if (arg1.aShortArray91 != null) {
				this.aShortArray22[local611] = arg1.aShortArray91[local1166];
			}
			this.aShortArray19[local611] = arg1.aShortArray89[local1166];
			this.aShortArray26[local611] = local1195;
		}
		local611 = 0;
		local875 = -10000;
		for (local1173 = 0; local1173 < this.anInt787; local1173++) {
			local885 = this.aShortArray26[local1173];
			if (local885 != local875) {
				local611++;
				local875 = local885;
			}
		}
		this.anIntArray64 = new int[local611 + 1];
		local611 = 0;
		local875 = -10000;
		for (local1173 = 0; local1173 < this.anInt787; local1173++) {
			local885 = this.aShortArray26[local1173];
			if (local885 != local875) {
				this.anIntArray64[local611++] = local1173;
				local875 = local885;
			}
		}
		this.anIntArray64[local611] = this.anInt787;
		aLongArray8 = null;
		this.aShortArray24 = method6591(this.aShortArray24, this.anInt788);
		this.aShortArray25 = method6591(this.aShortArray25, this.anInt788);
		this.aShortArray17 = method6591(this.aShortArray17, this.anInt788);
		this.aByteArray22 = method6587(this.aByteArray22, this.anInt788);
		this.aFloatArray25 = method6593(this.aFloatArray25, this.anInt788);
		this.aFloatArray26 = method6593(this.aFloatArray26, this.anInt788);
		if (arg1.anIntArray340 != null && Class179.method24492(arg2, this.anInt783)) {
			this.anIntArrayArray11 = arg1.method25672(false);
		}
		if (arg1.aClass227Array1 != null && Class179.method24498(arg2, this.anInt783)) {
			this.anIntArrayArray13 = arg1.method25679();
		}
		if (arg1.anIntArray343 != null && Class179.method24489(arg2, this.anInt783)) {
			local1173 = 0;
			@Pc(2905) int[] local2905 = new int[256];
			for (local895 = 0; local895 < this.anInt792; local895++) {
				local905 = arg1.anIntArray343[local111[local895]];
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
			for (local895 = 0; local895 < this.anInt792; local895++) {
				local905 = arg1.anIntArray343[local111[local895]];
				if (local905 >= 0) {
					this.anIntArrayArray12[local905][local2905[local905]++] = local895;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "ht", descriptor = "(Lclient!dq;IJIIIIFF)S", line = 637)
	short method6585(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray65[arg1];
		@Pc(11) int local11 = this.anIntArray65[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray23[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray23[local15] & 0xFFFF) - 1;
			if (aLongArray8[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray23[local13] = (short) (this.anInt788 + 1);
		aLongArray8[local13] = arg2;
		this.aShortArray24[this.anInt788] = (short) arg3;
		this.aShortArray25[this.anInt788] = (short) arg4;
		this.aShortArray17[this.anInt788] = (short) arg5;
		this.aByteArray22[this.anInt788] = (byte) arg6;
		this.aFloatArray25[this.anInt788] = arg7;
		this.aFloatArray26[this.anInt788] = arg8;
		return (short) this.anInt788++;
	}

	@OriginalMember(owner = "client!afk", name = "hb", descriptor = "(Lclient!dq;IJIIIIFF)S", line = 637)
	short method6586(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray65[arg1];
		@Pc(11) int local11 = this.anIntArray65[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray23[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray23[local15] & 0xFFFF) - 1;
			if (aLongArray8[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray23[local13] = (short) (this.anInt788 + 1);
		aLongArray8[local13] = arg2;
		this.aShortArray24[this.anInt788] = (short) arg3;
		this.aShortArray25[this.anInt788] = (short) arg4;
		this.aShortArray17[this.anInt788] = (short) arg5;
		this.aByteArray22[this.anInt788] = (byte) arg6;
		this.aFloatArray25[this.anInt788] = arg7;
		this.aFloatArray26[this.anInt788] = arg8;
		return (short) this.anInt788++;
	}

	@OriginalMember(owner = "client!afk", name = "hg", descriptor = "([BI)[B", line = 660)
	static byte[] method6587(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hc", descriptor = "([BI)[B", line = 660)
	static byte[] method6588(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "ho", descriptor = "([BI)[B", line = 660)
	static byte[] method6589(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hj", descriptor = "([BI)[B", line = 660)
	static byte[] method6590(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hd", descriptor = "([SI)[S", line = 666)
	static short[] method6591(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hv", descriptor = "([SI)[S", line = 666)
	static short[] method6592(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hx", descriptor = "([FI)[F", line = 672)
	static float[] method6593(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "hz", descriptor = "([FI)[F", line = 672)
	static float[] method6594(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "ij", descriptor = "([FI)[F", line = 672)
	static float[] method6595(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afk", name = "z", descriptor = "()I", line = 678)
	@Override
	public int method6875() {
		return this.anInt782;
	}

	@OriginalMember(owner = "client!afk", name = "ba", descriptor = "()I", line = 678)
	@Override
	public int method6923() {
		return this.anInt782;
	}

	@OriginalMember(owner = "client!afk", name = "bp", descriptor = "()I", line = 678)
	@Override
	public int method6924() {
		return this.anInt782;
	}

	@OriginalMember(owner = "client!afk", name = "u", descriptor = "(I)V", line = 682)
	@Override
	public void method6874(@OriginalArg(0) int arg0) {
		this.anInt782 = arg0;
		if (this.aClass217_1 != null && (this.anInt782 & 0x10000) == 0) {
			this.aShortArray24 = this.aClass217_1.aShortArray87;
			this.aShortArray25 = this.aClass217_1.aShortArray86;
			this.aShortArray17 = this.aClass217_1.aShortArray85;
			this.aByteArray22 = this.aClass217_1.aByteArray67;
			this.aClass217_1 = null;
		}
		this.aBoolean157 = true;
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "bj", descriptor = "(I)V", line = 682)
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		this.anInt782 = arg0;
		if (this.aClass217_1 != null && (this.anInt782 & 0x10000) == 0) {
			this.aShortArray24 = this.aClass217_1.aShortArray87;
			this.aShortArray25 = this.aClass217_1.aShortArray86;
			this.aShortArray17 = this.aClass217_1.aShortArray85;
			this.aByteArray22 = this.aClass217_1.aByteArray67;
			this.aClass217_1 = null;
		}
		this.aBoolean157 = true;
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "bs", descriptor = "(I)V", line = 682)
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		this.anInt782 = arg0;
		if (this.aClass217_1 != null && (this.anInt782 & 0x10000) == 0) {
			this.aShortArray24 = this.aClass217_1.aShortArray87;
			this.aShortArray25 = this.aClass217_1.aShortArray86;
			this.aShortArray17 = this.aClass217_1.aShortArray85;
			this.aByteArray22 = this.aClass217_1.aByteArray67;
			this.aClass217_1 = null;
		}
		this.aBoolean157 = true;
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "p", descriptor = "()V", line = 695)
	@Override
	public void method6979() {
		if (this.anInt788 <= 0 || this.anInt787 <= 0) {
			return;
		}
		this.method6620(false);
		if ((this.aByte4 & 0x10) == 0 && this.aClass178_1.anInterface16_4 == null) {
			this.method6619(false);
		}
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "cl", descriptor = "()V", line = 695)
	@Override
	public void method6927() {
		if (this.anInt788 <= 0 || this.anInt787 <= 0) {
			return;
		}
		this.method6620(false);
		if ((this.aByte4 & 0x10) == 0 && this.aClass178_1.anInterface16_4 == null) {
			this.method6619(false);
		}
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "l", descriptor = "(BIZ)Lclient!do;", line = 704)
	@Override
	public Class109 method6938(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub2 local22;
		@Pc(14) Class109_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub1_26.aClass109_Sub2Array2[arg0 - 1];
			local22 = this.aClass104_Sub1_26.aClass109_Sub2Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub2(this.aClass104_Sub1_26);
		}
		return this.method6597(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afk", name = "bg", descriptor = "(BIZ)Lclient!do;", line = 704)
	@Override
	public Class109 method7024(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub2 local22;
		@Pc(14) Class109_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub1_26.aClass109_Sub2Array2[arg0 - 1];
			local22 = this.aClass104_Sub1_26.aClass109_Sub2Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub2(this.aClass104_Sub1_26);
		}
		return this.method6597(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afk", name = "br", descriptor = "(BIZ)Lclient!do;", line = 704)
	@Override
	public Class109 method6922(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub2 local22;
		@Pc(14) Class109_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub1_26.aClass109_Sub2Array2[arg0 - 1];
			local22 = this.aClass104_Sub1_26.aClass109_Sub2Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub2(this.aClass104_Sub1_26);
		}
		return this.method6597(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afk", name = "io", descriptor = "(Lclient!afk;Lclient!afk;IZZ)Lclient!do;", line = 717)
	Class109 method6596(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) Class109_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte4 = 0;
		arg0.anInt782 = arg2;
		arg0.anInt783 = this.anInt783;
		arg0.aShort57 = this.aShort57;
		arg0.aShort58 = this.aShort58;
		arg0.anInt784 = this.anInt784;
		arg0.anInt785 = this.anInt785;
		arg0.anInt788 = this.anInt788;
		arg0.anInt792 = this.anInt792;
		arg0.anInt787 = this.anInt787;
		arg0.anInt789 = this.anInt789;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean155 = this.aBoolean155;
		} else {
			arg0.aBoolean155 = true;
		}
		arg0.aBoolean156 = this.aBoolean156;
		@Pc(62) boolean local62 = Class179.method24390(arg2, this.anInt783);
		@Pc(67) boolean local67 = Class179.method24393(arg2, this.anInt783);
		@Pc(72) boolean local72 = Class179.method24396(arg2, this.anInt783);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray61 = this.anIntArray61;
			} else if (arg1.anIntArray61 == null || arg1.anIntArray61.length < this.anInt784) {
				arg0.anIntArray61 = arg1.anIntArray61 = new int[this.anInt784];
			} else {
				arg0.anIntArray61 = arg1.anIntArray61;
			}
			if (!local67) {
				arg0.anIntArray62 = this.anIntArray62;
			} else if (arg1.anIntArray62 == null || arg1.anIntArray62.length < this.anInt784) {
				arg0.anIntArray62 = arg1.anIntArray62 = new int[this.anInt784];
			} else {
				arg0.anIntArray62 = arg1.anIntArray62;
			}
			if (!local72) {
				arg0.anIntArray60 = this.anIntArray60;
			} else if (arg1.anIntArray60 == null || arg1.anIntArray60.length < this.anInt784) {
				arg0.anIntArray60 = arg1.anIntArray60 = new int[this.anInt784];
			} else {
				arg0.anIntArray60 = arg1.anIntArray60;
			}
			for (local169 = 0; local169 < this.anInt784; local169++) {
				if (local62) {
					arg0.anIntArray61[local169] = this.anIntArray61[local169];
				}
				if (local67) {
					arg0.anIntArray62[local169] = this.anIntArray62[local169];
				}
				if (local72) {
					arg0.anIntArray60[local169] = this.anIntArray60[local169];
				}
			}
		} else {
			arg0.anIntArray61 = this.anIntArray61;
			arg0.anIntArray62 = this.anIntArray62;
			arg0.anIntArray60 = this.anIntArray60;
		}
		if (Class179.method24449(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x1);
			}
			arg0.aClass193_7 = arg1.aClass193_7;
			arg0.aClass193_7.aByte107 = this.aClass193_7.aByte107;
			arg0.aClass193_7.anInterface14_6 = this.aClass193_7.anInterface14_6;
		} else if (Class179.method24432(arg2, this.anInt783)) {
			arg0.aClass193_7 = this.aClass193_7;
		} else {
			arg0.aClass193_7 = null;
		}
		if (Class179.method24403(arg2, this.anInt783)) {
			if (arg1.aShortArray19 == null || arg1.aShortArray19.length < this.anInt792) {
				arg0.aShortArray19 = arg1.aShortArray19 = new short[this.anInt792];
			} else {
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray19[local169] = this.aShortArray19[local169];
			}
		} else {
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class179.method24409(arg2, this.anInt783)) {
			if (arg1.aByteArray21 == null || arg1.aByteArray21.length < this.anInt792) {
				arg0.aByteArray21 = arg1.aByteArray21 = new byte[this.anInt792];
			} else {
				arg0.aByteArray21 = arg1.aByteArray21;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aByteArray21[local169] = this.aByteArray21[local169];
			}
		} else {
			arg0.aByteArray21 = this.aByteArray21;
		}
		if (Class179.method24456(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x2);
			}
			arg0.aClass193_9 = arg1.aClass193_9;
			arg0.aClass193_9.aByte107 = this.aClass193_9.aByte107;
			arg0.aClass193_9.anInterface14_6 = this.aClass193_9.anInterface14_6;
		} else if (Class179.method24438(arg2, this.anInt783)) {
			arg0.aClass193_9 = this.aClass193_9;
		} else {
			arg0.aClass193_9 = null;
		}
		@Pc(482) int local482;
		if (Class179.method24400(arg2, this.anInt783)) {
			if (arg1.aShortArray24 == null || arg1.aShortArray24.length < this.anInt788) {
				local169 = this.anInt788;
				arg0.aShortArray24 = arg1.aShortArray24 = new short[local169];
				arg0.aShortArray25 = arg1.aShortArray25 = new short[local169];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local169];
			} else {
				arg0.aShortArray24 = arg1.aShortArray24;
				arg0.aShortArray25 = arg1.aShortArray25;
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			if (this.aClass217_1 == null) {
				for (local169 = 0; local169 < this.anInt788; local169++) {
					arg0.aShortArray24[local169] = this.aShortArray24[local169];
					arg0.aShortArray25[local169] = this.aShortArray25[local169];
					arg0.aShortArray17[local169] = this.aShortArray17[local169];
				}
			} else {
				if (arg1.aClass217_1 == null) {
					arg1.aClass217_1 = new Class217();
				}
				@Pc(470) Class217 local470 = arg0.aClass217_1 = arg1.aClass217_1;
				if (local470.aShortArray87 == null || local470.aShortArray87.length < this.anInt788) {
					local482 = this.anInt788;
					local470.aShortArray87 = new short[local482];
					local470.aShortArray86 = new short[local482];
					local470.aShortArray85 = new short[local482];
					local470.aByteArray67 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt788; local482++) {
					arg0.aShortArray24[local482] = this.aShortArray24[local482];
					arg0.aShortArray25[local482] = this.aShortArray25[local482];
					arg0.aShortArray17[local482] = this.aShortArray17[local482];
					local470.aShortArray87[local482] = this.aClass217_1.aShortArray87[local482];
					local470.aShortArray86[local482] = this.aClass217_1.aShortArray86[local482];
					local470.aShortArray85[local482] = this.aClass217_1.aShortArray85[local482];
					local470.aByteArray67[local482] = this.aClass217_1.aByteArray67[local482];
				}
			}
			arg0.aByteArray22 = this.aByteArray22;
		} else {
			arg0.aClass217_1 = this.aClass217_1;
			arg0.aShortArray24 = this.aShortArray24;
			arg0.aShortArray25 = this.aShortArray25;
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aByteArray22 = this.aByteArray22;
		}
		if (Class179.method24451(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x4);
			}
			arg0.aClass193_10 = arg1.aClass193_10;
			arg0.aClass193_10.aByte107 = this.aClass193_10.aByte107;
			arg0.aClass193_10.anInterface14_6 = this.aClass193_10.anInterface14_6;
		} else if (Class179.method24437(arg2, this.anInt783)) {
			arg0.aClass193_10 = this.aClass193_10;
		} else {
			arg0.aClass193_10 = null;
		}
		if (Class179.method24412(arg2, this.anInt783)) {
			if (arg1.aFloatArray25 == null || arg1.aFloatArray25.length < this.anInt792) {
				local169 = this.anInt788;
				arg0.aFloatArray25 = arg1.aFloatArray25 = new float[local169];
				arg0.aFloatArray26 = arg1.aFloatArray26 = new float[local169];
			} else {
				arg0.aFloatArray25 = arg1.aFloatArray25;
				arg0.aFloatArray26 = arg1.aFloatArray26;
			}
			for (local169 = 0; local169 < this.anInt788; local169++) {
				arg0.aFloatArray25[local169] = this.aFloatArray25[local169];
				arg0.aFloatArray26[local169] = this.aFloatArray26[local169];
			}
		} else {
			arg0.aFloatArray25 = this.aFloatArray25;
			arg0.aFloatArray26 = this.aFloatArray26;
		}
		if (Class179.method24462(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x8);
			}
			arg0.aClass193_8 = arg1.aClass193_8;
			arg0.aClass193_8.aByte107 = this.aClass193_8.aByte107;
			arg0.aClass193_8.anInterface14_6 = this.aClass193_8.anInterface14_6;
		} else if (Class179.method24441(arg2, this.anInt783)) {
			arg0.aClass193_8 = this.aClass193_8;
		} else {
			arg0.aClass193_8 = null;
		}
		if (Class179.method24415(arg2, this.anInt783)) {
			if (arg1.aShortArray21 == null || arg1.aShortArray21.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray21 = arg1.aShortArray21 = new short[local169];
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local169];
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local169];
			} else {
				arg0.aShortArray21 = arg1.aShortArray21;
				arg0.aShortArray20 = arg1.aShortArray20;
				arg0.aShortArray18 = arg1.aShortArray18;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray21[local169] = this.aShortArray21[local169];
				arg0.aShortArray20[local169] = this.aShortArray20[local169];
				arg0.aShortArray18[local169] = this.aShortArray18[local169];
			}
		} else {
			arg0.aShortArray21 = this.aShortArray21;
			arg0.aShortArray20 = this.aShortArray20;
			arg0.aShortArray18 = this.aShortArray18;
		}
		if (Class179.method24463(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x10);
			}
			arg0.aClass178_1 = arg1.aClass178_1;
			arg0.aClass178_1.anInterface16_4 = this.aClass178_1.anInterface16_4;
		} else if (Class179.method24444(arg2, this.anInt783)) {
			arg0.aClass178_1 = this.aClass178_1;
		} else {
			arg0.aClass178_1 = null;
		}
		if (Class179.method24420(arg2, this.anInt783)) {
			if (arg1.aShortArray26 == null || arg1.aShortArray26.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray26 = arg1.aShortArray26 = new short[local169];
			} else {
				arg0.aShortArray26 = arg1.aShortArray26;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray26[local169] = this.aShortArray26[local169];
			}
		} else {
			arg0.aShortArray26 = this.aShortArray26;
		}
		if (!Class179.method24426(arg2, this.anInt783)) {
			arg0.aClass194Array1 = this.aClass194Array1;
		} else if (arg1.aClass194Array1 == null || arg1.aClass194Array1.length < this.anInt789) {
			local169 = this.anInt789;
			arg0.aClass194Array1 = arg1.aClass194Array1 = new Class194[local169];
			for (local482 = 0; local482 < this.anInt789; local482++) {
				arg0.aClass194Array1[local482] = this.aClass194Array1[local482].method24592();
			}
		} else {
			arg0.aClass194Array1 = arg1.aClass194Array1;
			for (local169 = 0; local169 < this.anInt789; local169++) {
				arg0.aClass194Array1[local169].method24595(this.aClass194Array1[local169]);
			}
		}
		arg0.aClass216Array1 = this.aClass216Array1;
		if (this.aBoolean158) {
			arg0.anInt790 = this.anInt790;
			arg0.anInt791 = this.anInt791;
			arg0.aShort62 = this.aShort62;
			arg0.aShort59 = this.aShort59;
			arg0.aShort60 = this.aShort60;
			arg0.aShort63 = this.aShort63;
			arg0.aShort61 = this.aShort61;
			arg0.aShort64 = this.aShort64;
			arg0.aBoolean158 = true;
		} else {
			arg0.aBoolean158 = false;
		}
		if (this.aBoolean159) {
			arg0.aShort65 = this.aShort65;
			arg0.aBoolean159 = true;
		} else {
			arg0.aBoolean159 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray65 = this.anIntArray65;
		arg0.aShortArray16 = this.aShortArray16;
		arg0.aShortArray22 = this.aShortArray22;
		arg0.anIntArray64 = this.anIntArray64;
		arg0.aClass234Array2 = this.aClass234Array2;
		arg0.aClass210Array2 = this.aClass210Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!afk", name = "hq", descriptor = "(Lclient!afk;Lclient!afk;IZZ)Lclient!do;", line = 717)
	Class109 method6597(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) Class109_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte4 = 0;
		arg0.anInt782 = arg2;
		arg0.anInt783 = this.anInt783;
		arg0.aShort57 = this.aShort57;
		arg0.aShort58 = this.aShort58;
		arg0.anInt784 = this.anInt784;
		arg0.anInt785 = this.anInt785;
		arg0.anInt788 = this.anInt788;
		arg0.anInt792 = this.anInt792;
		arg0.anInt787 = this.anInt787;
		arg0.anInt789 = this.anInt789;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean155 = this.aBoolean155;
		} else {
			arg0.aBoolean155 = true;
		}
		arg0.aBoolean156 = this.aBoolean156;
		@Pc(62) boolean local62 = Class179.method24390(arg2, this.anInt783);
		@Pc(67) boolean local67 = Class179.method24393(arg2, this.anInt783);
		@Pc(72) boolean local72 = Class179.method24396(arg2, this.anInt783);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray61 = this.anIntArray61;
			} else if (arg1.anIntArray61 == null || arg1.anIntArray61.length < this.anInt784) {
				arg0.anIntArray61 = arg1.anIntArray61 = new int[this.anInt784];
			} else {
				arg0.anIntArray61 = arg1.anIntArray61;
			}
			if (!local67) {
				arg0.anIntArray62 = this.anIntArray62;
			} else if (arg1.anIntArray62 == null || arg1.anIntArray62.length < this.anInt784) {
				arg0.anIntArray62 = arg1.anIntArray62 = new int[this.anInt784];
			} else {
				arg0.anIntArray62 = arg1.anIntArray62;
			}
			if (!local72) {
				arg0.anIntArray60 = this.anIntArray60;
			} else if (arg1.anIntArray60 == null || arg1.anIntArray60.length < this.anInt784) {
				arg0.anIntArray60 = arg1.anIntArray60 = new int[this.anInt784];
			} else {
				arg0.anIntArray60 = arg1.anIntArray60;
			}
			for (local169 = 0; local169 < this.anInt784; local169++) {
				if (local62) {
					arg0.anIntArray61[local169] = this.anIntArray61[local169];
				}
				if (local67) {
					arg0.anIntArray62[local169] = this.anIntArray62[local169];
				}
				if (local72) {
					arg0.anIntArray60[local169] = this.anIntArray60[local169];
				}
			}
		} else {
			arg0.anIntArray61 = this.anIntArray61;
			arg0.anIntArray62 = this.anIntArray62;
			arg0.anIntArray60 = this.anIntArray60;
		}
		if (Class179.method24449(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x1);
			}
			arg0.aClass193_7 = arg1.aClass193_7;
			arg0.aClass193_7.aByte107 = this.aClass193_7.aByte107;
			arg0.aClass193_7.anInterface14_6 = this.aClass193_7.anInterface14_6;
		} else if (Class179.method24432(arg2, this.anInt783)) {
			arg0.aClass193_7 = this.aClass193_7;
		} else {
			arg0.aClass193_7 = null;
		}
		if (Class179.method24403(arg2, this.anInt783)) {
			if (arg1.aShortArray19 == null || arg1.aShortArray19.length < this.anInt792) {
				arg0.aShortArray19 = arg1.aShortArray19 = new short[this.anInt792];
			} else {
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray19[local169] = this.aShortArray19[local169];
			}
		} else {
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class179.method24409(arg2, this.anInt783)) {
			if (arg1.aByteArray21 == null || arg1.aByteArray21.length < this.anInt792) {
				arg0.aByteArray21 = arg1.aByteArray21 = new byte[this.anInt792];
			} else {
				arg0.aByteArray21 = arg1.aByteArray21;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aByteArray21[local169] = this.aByteArray21[local169];
			}
		} else {
			arg0.aByteArray21 = this.aByteArray21;
		}
		if (Class179.method24456(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x2);
			}
			arg0.aClass193_9 = arg1.aClass193_9;
			arg0.aClass193_9.aByte107 = this.aClass193_9.aByte107;
			arg0.aClass193_9.anInterface14_6 = this.aClass193_9.anInterface14_6;
		} else if (Class179.method24438(arg2, this.anInt783)) {
			arg0.aClass193_9 = this.aClass193_9;
		} else {
			arg0.aClass193_9 = null;
		}
		@Pc(482) int local482;
		if (Class179.method24400(arg2, this.anInt783)) {
			if (arg1.aShortArray24 == null || arg1.aShortArray24.length < this.anInt788) {
				local169 = this.anInt788;
				arg0.aShortArray24 = arg1.aShortArray24 = new short[local169];
				arg0.aShortArray25 = arg1.aShortArray25 = new short[local169];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local169];
			} else {
				arg0.aShortArray24 = arg1.aShortArray24;
				arg0.aShortArray25 = arg1.aShortArray25;
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			if (this.aClass217_1 == null) {
				for (local169 = 0; local169 < this.anInt788; local169++) {
					arg0.aShortArray24[local169] = this.aShortArray24[local169];
					arg0.aShortArray25[local169] = this.aShortArray25[local169];
					arg0.aShortArray17[local169] = this.aShortArray17[local169];
				}
			} else {
				if (arg1.aClass217_1 == null) {
					arg1.aClass217_1 = new Class217();
				}
				@Pc(470) Class217 local470 = arg0.aClass217_1 = arg1.aClass217_1;
				if (local470.aShortArray87 == null || local470.aShortArray87.length < this.anInt788) {
					local482 = this.anInt788;
					local470.aShortArray87 = new short[local482];
					local470.aShortArray86 = new short[local482];
					local470.aShortArray85 = new short[local482];
					local470.aByteArray67 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt788; local482++) {
					arg0.aShortArray24[local482] = this.aShortArray24[local482];
					arg0.aShortArray25[local482] = this.aShortArray25[local482];
					arg0.aShortArray17[local482] = this.aShortArray17[local482];
					local470.aShortArray87[local482] = this.aClass217_1.aShortArray87[local482];
					local470.aShortArray86[local482] = this.aClass217_1.aShortArray86[local482];
					local470.aShortArray85[local482] = this.aClass217_1.aShortArray85[local482];
					local470.aByteArray67[local482] = this.aClass217_1.aByteArray67[local482];
				}
			}
			arg0.aByteArray22 = this.aByteArray22;
		} else {
			arg0.aClass217_1 = this.aClass217_1;
			arg0.aShortArray24 = this.aShortArray24;
			arg0.aShortArray25 = this.aShortArray25;
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aByteArray22 = this.aByteArray22;
		}
		if (Class179.method24451(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x4);
			}
			arg0.aClass193_10 = arg1.aClass193_10;
			arg0.aClass193_10.aByte107 = this.aClass193_10.aByte107;
			arg0.aClass193_10.anInterface14_6 = this.aClass193_10.anInterface14_6;
		} else if (Class179.method24437(arg2, this.anInt783)) {
			arg0.aClass193_10 = this.aClass193_10;
		} else {
			arg0.aClass193_10 = null;
		}
		if (Class179.method24412(arg2, this.anInt783)) {
			if (arg1.aFloatArray25 == null || arg1.aFloatArray25.length < this.anInt792) {
				local169 = this.anInt788;
				arg0.aFloatArray25 = arg1.aFloatArray25 = new float[local169];
				arg0.aFloatArray26 = arg1.aFloatArray26 = new float[local169];
			} else {
				arg0.aFloatArray25 = arg1.aFloatArray25;
				arg0.aFloatArray26 = arg1.aFloatArray26;
			}
			for (local169 = 0; local169 < this.anInt788; local169++) {
				arg0.aFloatArray25[local169] = this.aFloatArray25[local169];
				arg0.aFloatArray26[local169] = this.aFloatArray26[local169];
			}
		} else {
			arg0.aFloatArray25 = this.aFloatArray25;
			arg0.aFloatArray26 = this.aFloatArray26;
		}
		if (Class179.method24462(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x8);
			}
			arg0.aClass193_8 = arg1.aClass193_8;
			arg0.aClass193_8.aByte107 = this.aClass193_8.aByte107;
			arg0.aClass193_8.anInterface14_6 = this.aClass193_8.anInterface14_6;
		} else if (Class179.method24441(arg2, this.anInt783)) {
			arg0.aClass193_8 = this.aClass193_8;
		} else {
			arg0.aClass193_8 = null;
		}
		if (Class179.method24415(arg2, this.anInt783)) {
			if (arg1.aShortArray21 == null || arg1.aShortArray21.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray21 = arg1.aShortArray21 = new short[local169];
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local169];
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local169];
			} else {
				arg0.aShortArray21 = arg1.aShortArray21;
				arg0.aShortArray20 = arg1.aShortArray20;
				arg0.aShortArray18 = arg1.aShortArray18;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray21[local169] = this.aShortArray21[local169];
				arg0.aShortArray20[local169] = this.aShortArray20[local169];
				arg0.aShortArray18[local169] = this.aShortArray18[local169];
			}
		} else {
			arg0.aShortArray21 = this.aShortArray21;
			arg0.aShortArray20 = this.aShortArray20;
			arg0.aShortArray18 = this.aShortArray18;
		}
		if (Class179.method24463(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x10);
			}
			arg0.aClass178_1 = arg1.aClass178_1;
			arg0.aClass178_1.anInterface16_4 = this.aClass178_1.anInterface16_4;
		} else if (Class179.method24444(arg2, this.anInt783)) {
			arg0.aClass178_1 = this.aClass178_1;
		} else {
			arg0.aClass178_1 = null;
		}
		if (Class179.method24420(arg2, this.anInt783)) {
			if (arg1.aShortArray26 == null || arg1.aShortArray26.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray26 = arg1.aShortArray26 = new short[local169];
			} else {
				arg0.aShortArray26 = arg1.aShortArray26;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray26[local169] = this.aShortArray26[local169];
			}
		} else {
			arg0.aShortArray26 = this.aShortArray26;
		}
		if (!Class179.method24426(arg2, this.anInt783)) {
			arg0.aClass194Array1 = this.aClass194Array1;
		} else if (arg1.aClass194Array1 == null || arg1.aClass194Array1.length < this.anInt789) {
			local169 = this.anInt789;
			arg0.aClass194Array1 = arg1.aClass194Array1 = new Class194[local169];
			for (local482 = 0; local482 < this.anInt789; local482++) {
				arg0.aClass194Array1[local482] = this.aClass194Array1[local482].method24592();
			}
		} else {
			arg0.aClass194Array1 = arg1.aClass194Array1;
			for (local169 = 0; local169 < this.anInt789; local169++) {
				arg0.aClass194Array1[local169].method24595(this.aClass194Array1[local169]);
			}
		}
		arg0.aClass216Array1 = this.aClass216Array1;
		if (this.aBoolean158) {
			arg0.anInt790 = this.anInt790;
			arg0.anInt791 = this.anInt791;
			arg0.aShort62 = this.aShort62;
			arg0.aShort59 = this.aShort59;
			arg0.aShort60 = this.aShort60;
			arg0.aShort63 = this.aShort63;
			arg0.aShort61 = this.aShort61;
			arg0.aShort64 = this.aShort64;
			arg0.aBoolean158 = true;
		} else {
			arg0.aBoolean158 = false;
		}
		if (this.aBoolean159) {
			arg0.aShort65 = this.aShort65;
			arg0.aBoolean159 = true;
		} else {
			arg0.aBoolean159 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray65 = this.anIntArray65;
		arg0.aShortArray16 = this.aShortArray16;
		arg0.aShortArray22 = this.aShortArray22;
		arg0.anIntArray64 = this.anIntArray64;
		arg0.aClass234Array2 = this.aClass234Array2;
		arg0.aClass210Array2 = this.aClass210Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!afk", name = "iq", descriptor = "(Lclient!afk;Lclient!afk;IZZ)Lclient!do;", line = 717)
	Class109 method6598(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) Class109_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte4 = 0;
		arg0.anInt782 = arg2;
		arg0.anInt783 = this.anInt783;
		arg0.aShort57 = this.aShort57;
		arg0.aShort58 = this.aShort58;
		arg0.anInt784 = this.anInt784;
		arg0.anInt785 = this.anInt785;
		arg0.anInt788 = this.anInt788;
		arg0.anInt792 = this.anInt792;
		arg0.anInt787 = this.anInt787;
		arg0.anInt789 = this.anInt789;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean155 = this.aBoolean155;
		} else {
			arg0.aBoolean155 = true;
		}
		arg0.aBoolean156 = this.aBoolean156;
		@Pc(62) boolean local62 = Class179.method24390(arg2, this.anInt783);
		@Pc(67) boolean local67 = Class179.method24393(arg2, this.anInt783);
		@Pc(72) boolean local72 = Class179.method24396(arg2, this.anInt783);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray61 = this.anIntArray61;
			} else if (arg1.anIntArray61 == null || arg1.anIntArray61.length < this.anInt784) {
				arg0.anIntArray61 = arg1.anIntArray61 = new int[this.anInt784];
			} else {
				arg0.anIntArray61 = arg1.anIntArray61;
			}
			if (!local67) {
				arg0.anIntArray62 = this.anIntArray62;
			} else if (arg1.anIntArray62 == null || arg1.anIntArray62.length < this.anInt784) {
				arg0.anIntArray62 = arg1.anIntArray62 = new int[this.anInt784];
			} else {
				arg0.anIntArray62 = arg1.anIntArray62;
			}
			if (!local72) {
				arg0.anIntArray60 = this.anIntArray60;
			} else if (arg1.anIntArray60 == null || arg1.anIntArray60.length < this.anInt784) {
				arg0.anIntArray60 = arg1.anIntArray60 = new int[this.anInt784];
			} else {
				arg0.anIntArray60 = arg1.anIntArray60;
			}
			for (local169 = 0; local169 < this.anInt784; local169++) {
				if (local62) {
					arg0.anIntArray61[local169] = this.anIntArray61[local169];
				}
				if (local67) {
					arg0.anIntArray62[local169] = this.anIntArray62[local169];
				}
				if (local72) {
					arg0.anIntArray60[local169] = this.anIntArray60[local169];
				}
			}
		} else {
			arg0.anIntArray61 = this.anIntArray61;
			arg0.anIntArray62 = this.anIntArray62;
			arg0.anIntArray60 = this.anIntArray60;
		}
		if (Class179.method24449(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x1);
			}
			arg0.aClass193_7 = arg1.aClass193_7;
			arg0.aClass193_7.aByte107 = this.aClass193_7.aByte107;
			arg0.aClass193_7.anInterface14_6 = this.aClass193_7.anInterface14_6;
		} else if (Class179.method24432(arg2, this.anInt783)) {
			arg0.aClass193_7 = this.aClass193_7;
		} else {
			arg0.aClass193_7 = null;
		}
		if (Class179.method24403(arg2, this.anInt783)) {
			if (arg1.aShortArray19 == null || arg1.aShortArray19.length < this.anInt792) {
				arg0.aShortArray19 = arg1.aShortArray19 = new short[this.anInt792];
			} else {
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray19[local169] = this.aShortArray19[local169];
			}
		} else {
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class179.method24409(arg2, this.anInt783)) {
			if (arg1.aByteArray21 == null || arg1.aByteArray21.length < this.anInt792) {
				arg0.aByteArray21 = arg1.aByteArray21 = new byte[this.anInt792];
			} else {
				arg0.aByteArray21 = arg1.aByteArray21;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aByteArray21[local169] = this.aByteArray21[local169];
			}
		} else {
			arg0.aByteArray21 = this.aByteArray21;
		}
		if (Class179.method24456(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x2);
			}
			arg0.aClass193_9 = arg1.aClass193_9;
			arg0.aClass193_9.aByte107 = this.aClass193_9.aByte107;
			arg0.aClass193_9.anInterface14_6 = this.aClass193_9.anInterface14_6;
		} else if (Class179.method24438(arg2, this.anInt783)) {
			arg0.aClass193_9 = this.aClass193_9;
		} else {
			arg0.aClass193_9 = null;
		}
		@Pc(482) int local482;
		if (Class179.method24400(arg2, this.anInt783)) {
			if (arg1.aShortArray24 == null || arg1.aShortArray24.length < this.anInt788) {
				local169 = this.anInt788;
				arg0.aShortArray24 = arg1.aShortArray24 = new short[local169];
				arg0.aShortArray25 = arg1.aShortArray25 = new short[local169];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local169];
			} else {
				arg0.aShortArray24 = arg1.aShortArray24;
				arg0.aShortArray25 = arg1.aShortArray25;
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			if (this.aClass217_1 == null) {
				for (local169 = 0; local169 < this.anInt788; local169++) {
					arg0.aShortArray24[local169] = this.aShortArray24[local169];
					arg0.aShortArray25[local169] = this.aShortArray25[local169];
					arg0.aShortArray17[local169] = this.aShortArray17[local169];
				}
			} else {
				if (arg1.aClass217_1 == null) {
					arg1.aClass217_1 = new Class217();
				}
				@Pc(470) Class217 local470 = arg0.aClass217_1 = arg1.aClass217_1;
				if (local470.aShortArray87 == null || local470.aShortArray87.length < this.anInt788) {
					local482 = this.anInt788;
					local470.aShortArray87 = new short[local482];
					local470.aShortArray86 = new short[local482];
					local470.aShortArray85 = new short[local482];
					local470.aByteArray67 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt788; local482++) {
					arg0.aShortArray24[local482] = this.aShortArray24[local482];
					arg0.aShortArray25[local482] = this.aShortArray25[local482];
					arg0.aShortArray17[local482] = this.aShortArray17[local482];
					local470.aShortArray87[local482] = this.aClass217_1.aShortArray87[local482];
					local470.aShortArray86[local482] = this.aClass217_1.aShortArray86[local482];
					local470.aShortArray85[local482] = this.aClass217_1.aShortArray85[local482];
					local470.aByteArray67[local482] = this.aClass217_1.aByteArray67[local482];
				}
			}
			arg0.aByteArray22 = this.aByteArray22;
		} else {
			arg0.aClass217_1 = this.aClass217_1;
			arg0.aShortArray24 = this.aShortArray24;
			arg0.aShortArray25 = this.aShortArray25;
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aByteArray22 = this.aByteArray22;
		}
		if (Class179.method24451(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x4);
			}
			arg0.aClass193_10 = arg1.aClass193_10;
			arg0.aClass193_10.aByte107 = this.aClass193_10.aByte107;
			arg0.aClass193_10.anInterface14_6 = this.aClass193_10.anInterface14_6;
		} else if (Class179.method24437(arg2, this.anInt783)) {
			arg0.aClass193_10 = this.aClass193_10;
		} else {
			arg0.aClass193_10 = null;
		}
		if (Class179.method24412(arg2, this.anInt783)) {
			if (arg1.aFloatArray25 == null || arg1.aFloatArray25.length < this.anInt792) {
				local169 = this.anInt788;
				arg0.aFloatArray25 = arg1.aFloatArray25 = new float[local169];
				arg0.aFloatArray26 = arg1.aFloatArray26 = new float[local169];
			} else {
				arg0.aFloatArray25 = arg1.aFloatArray25;
				arg0.aFloatArray26 = arg1.aFloatArray26;
			}
			for (local169 = 0; local169 < this.anInt788; local169++) {
				arg0.aFloatArray25[local169] = this.aFloatArray25[local169];
				arg0.aFloatArray26[local169] = this.aFloatArray26[local169];
			}
		} else {
			arg0.aFloatArray25 = this.aFloatArray25;
			arg0.aFloatArray26 = this.aFloatArray26;
		}
		if (Class179.method24462(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x8);
			}
			arg0.aClass193_8 = arg1.aClass193_8;
			arg0.aClass193_8.aByte107 = this.aClass193_8.aByte107;
			arg0.aClass193_8.anInterface14_6 = this.aClass193_8.anInterface14_6;
		} else if (Class179.method24441(arg2, this.anInt783)) {
			arg0.aClass193_8 = this.aClass193_8;
		} else {
			arg0.aClass193_8 = null;
		}
		if (Class179.method24415(arg2, this.anInt783)) {
			if (arg1.aShortArray21 == null || arg1.aShortArray21.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray21 = arg1.aShortArray21 = new short[local169];
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local169];
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local169];
			} else {
				arg0.aShortArray21 = arg1.aShortArray21;
				arg0.aShortArray20 = arg1.aShortArray20;
				arg0.aShortArray18 = arg1.aShortArray18;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray21[local169] = this.aShortArray21[local169];
				arg0.aShortArray20[local169] = this.aShortArray20[local169];
				arg0.aShortArray18[local169] = this.aShortArray18[local169];
			}
		} else {
			arg0.aShortArray21 = this.aShortArray21;
			arg0.aShortArray20 = this.aShortArray20;
			arg0.aShortArray18 = this.aShortArray18;
		}
		if (Class179.method24463(arg2, this.anInt783)) {
			if (arg3) {
				arg0.aByte4 = (byte) (arg0.aByte4 | 0x10);
			}
			arg0.aClass178_1 = arg1.aClass178_1;
			arg0.aClass178_1.anInterface16_4 = this.aClass178_1.anInterface16_4;
		} else if (Class179.method24444(arg2, this.anInt783)) {
			arg0.aClass178_1 = this.aClass178_1;
		} else {
			arg0.aClass178_1 = null;
		}
		if (Class179.method24420(arg2, this.anInt783)) {
			if (arg1.aShortArray26 == null || arg1.aShortArray26.length < this.anInt792) {
				local169 = this.anInt792;
				arg0.aShortArray26 = arg1.aShortArray26 = new short[local169];
			} else {
				arg0.aShortArray26 = arg1.aShortArray26;
			}
			for (local169 = 0; local169 < this.anInt792; local169++) {
				arg0.aShortArray26[local169] = this.aShortArray26[local169];
			}
		} else {
			arg0.aShortArray26 = this.aShortArray26;
		}
		if (!Class179.method24426(arg2, this.anInt783)) {
			arg0.aClass194Array1 = this.aClass194Array1;
		} else if (arg1.aClass194Array1 == null || arg1.aClass194Array1.length < this.anInt789) {
			local169 = this.anInt789;
			arg0.aClass194Array1 = arg1.aClass194Array1 = new Class194[local169];
			for (local482 = 0; local482 < this.anInt789; local482++) {
				arg0.aClass194Array1[local482] = this.aClass194Array1[local482].method24592();
			}
		} else {
			arg0.aClass194Array1 = arg1.aClass194Array1;
			for (local169 = 0; local169 < this.anInt789; local169++) {
				arg0.aClass194Array1[local169].method24595(this.aClass194Array1[local169]);
			}
		}
		arg0.aClass216Array1 = this.aClass216Array1;
		if (this.aBoolean158) {
			arg0.anInt790 = this.anInt790;
			arg0.anInt791 = this.anInt791;
			arg0.aShort62 = this.aShort62;
			arg0.aShort59 = this.aShort59;
			arg0.aShort60 = this.aShort60;
			arg0.aShort63 = this.aShort63;
			arg0.aShort61 = this.aShort61;
			arg0.aShort64 = this.aShort64;
			arg0.aBoolean158 = true;
		} else {
			arg0.aBoolean158 = false;
		}
		if (this.aBoolean159) {
			arg0.aShort65 = this.aShort65;
			arg0.aBoolean159 = true;
		} else {
			arg0.aBoolean159 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray65 = this.anIntArray65;
		arg0.aShortArray16 = this.aShortArray16;
		arg0.aShortArray22 = this.aShortArray22;
		arg0.anIntArray64 = this.anIntArray64;
		arg0.aClass234Array2 = this.aClass234Array2;
		arg0.aClass210Array2 = this.aClass210Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!afk", name = "hf", descriptor = "()V", line = 982)
	void method6599() {
		if (!this.aBoolean157) {
			return;
		}
		this.aBoolean157 = false;
		if (this.aClass234Array2 == null && this.aClass210Array2 == null && this.aClass216Array1 == null && !Class179.method24397(this.anInt782, this.anInt783)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray61 != null && !Class179.method24466(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local23 = true;
				}
			}
			if (this.anIntArray62 != null && !Class179.method24471(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local25 = true;
				}
			}
			if (this.anIntArray60 != null && !Class179.method24473(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray61 = null;
			}
			if (local25) {
				this.anIntArray62 = null;
			}
			if (local27) {
				this.anIntArray60 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray61 == null && this.anIntArray62 == null && this.anIntArray60 == null) {
			this.aShortArray23 = null;
			this.anIntArray65 = null;
		}
		if (this.aByteArray22 != null && !Class179.method24476(this.anInt782, this.anInt783)) {
			if (this.aClass193_10 == null) {
				if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					this.aShortArray17 = null;
					this.aShortArray25 = null;
					this.aShortArray24 = null;
					this.aByteArray22 = null;
				}
			} else if (this.aClass193_10.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray17 = null;
				this.aShortArray25 = null;
				this.aShortArray24 = null;
				this.aByteArray22 = null;
			}
		}
		if (this.aShortArray19 != null && !Class179.method24478(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray21 != null && !Class179.method24480(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aByteArray21 = null;
			}
		}
		if (this.aFloatArray25 != null && !Class179.method24484(this.anInt782, this.anInt783)) {
			if (this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aFloatArray26 = null;
				this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray26 != null && !Class179.method24507(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray26 = null;
			}
		}
		if (this.aShortArray21 != null && !Class179.method24505(this.anInt782, this.anInt783)) {
			if (this.aClass178_1 != null && this.aClass178_1.anInterface16_4 == null || this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray18 = null;
				this.aShortArray20 = null;
				this.aShortArray21 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class179.method24489(this.anInt782, this.anInt783)) {
			this.anIntArrayArray12 = null;
			this.aShortArray22 = null;
		}
		if (this.anIntArrayArray11 != null && !Class179.method24492(this.anInt782, this.anInt783)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class179.method24498(this.anInt782, this.anInt783)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray64 != null && (this.anInt782 & 0x800) == 0 && (this.anInt782 & 0x40000) == 0) {
			this.anIntArray64 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "iv", descriptor = "()V", line = 982)
	void method6600() {
		if (!this.aBoolean157) {
			return;
		}
		this.aBoolean157 = false;
		if (this.aClass234Array2 == null && this.aClass210Array2 == null && this.aClass216Array1 == null && !Class179.method24397(this.anInt782, this.anInt783)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray61 != null && !Class179.method24466(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local23 = true;
				}
			}
			if (this.anIntArray62 != null && !Class179.method24471(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local25 = true;
				}
			}
			if (this.anIntArray60 != null && !Class179.method24473(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray61 = null;
			}
			if (local25) {
				this.anIntArray62 = null;
			}
			if (local27) {
				this.anIntArray60 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray61 == null && this.anIntArray62 == null && this.anIntArray60 == null) {
			this.aShortArray23 = null;
			this.anIntArray65 = null;
		}
		if (this.aByteArray22 != null && !Class179.method24476(this.anInt782, this.anInt783)) {
			if (this.aClass193_10 == null) {
				if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					this.aShortArray17 = null;
					this.aShortArray25 = null;
					this.aShortArray24 = null;
					this.aByteArray22 = null;
				}
			} else if (this.aClass193_10.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray17 = null;
				this.aShortArray25 = null;
				this.aShortArray24 = null;
				this.aByteArray22 = null;
			}
		}
		if (this.aShortArray19 != null && !Class179.method24478(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray21 != null && !Class179.method24480(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aByteArray21 = null;
			}
		}
		if (this.aFloatArray25 != null && !Class179.method24484(this.anInt782, this.anInt783)) {
			if (this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aFloatArray26 = null;
				this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray26 != null && !Class179.method24507(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray26 = null;
			}
		}
		if (this.aShortArray21 != null && !Class179.method24505(this.anInt782, this.anInt783)) {
			if (this.aClass178_1 != null && this.aClass178_1.anInterface16_4 == null || this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray18 = null;
				this.aShortArray20 = null;
				this.aShortArray21 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class179.method24489(this.anInt782, this.anInt783)) {
			this.anIntArrayArray12 = null;
			this.aShortArray22 = null;
		}
		if (this.anIntArrayArray11 != null && !Class179.method24492(this.anInt782, this.anInt783)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class179.method24498(this.anInt782, this.anInt783)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray64 != null && (this.anInt782 & 0x800) == 0 && (this.anInt782 & 0x40000) == 0) {
			this.anIntArray64 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ie", descriptor = "()V", line = 982)
	void method6601() {
		if (!this.aBoolean157) {
			return;
		}
		this.aBoolean157 = false;
		if (this.aClass234Array2 == null && this.aClass210Array2 == null && this.aClass216Array1 == null && !Class179.method24397(this.anInt782, this.anInt783)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray61 != null && !Class179.method24466(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local23 = true;
				}
			}
			if (this.anIntArray62 != null && !Class179.method24471(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local25 = true;
				}
			}
			if (this.anIntArray60 != null && !Class179.method24473(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray61 = null;
			}
			if (local25) {
				this.anIntArray62 = null;
			}
			if (local27) {
				this.anIntArray60 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray61 == null && this.anIntArray62 == null && this.anIntArray60 == null) {
			this.aShortArray23 = null;
			this.anIntArray65 = null;
		}
		if (this.aByteArray22 != null && !Class179.method24476(this.anInt782, this.anInt783)) {
			if (this.aClass193_10 == null) {
				if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					this.aShortArray17 = null;
					this.aShortArray25 = null;
					this.aShortArray24 = null;
					this.aByteArray22 = null;
				}
			} else if (this.aClass193_10.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray17 = null;
				this.aShortArray25 = null;
				this.aShortArray24 = null;
				this.aByteArray22 = null;
			}
		}
		if (this.aShortArray19 != null && !Class179.method24478(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray21 != null && !Class179.method24480(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aByteArray21 = null;
			}
		}
		if (this.aFloatArray25 != null && !Class179.method24484(this.anInt782, this.anInt783)) {
			if (this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aFloatArray26 = null;
				this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray26 != null && !Class179.method24507(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray26 = null;
			}
		}
		if (this.aShortArray21 != null && !Class179.method24505(this.anInt782, this.anInt783)) {
			if (this.aClass178_1 != null && this.aClass178_1.anInterface16_4 == null || this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray18 = null;
				this.aShortArray20 = null;
				this.aShortArray21 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class179.method24489(this.anInt782, this.anInt783)) {
			this.anIntArrayArray12 = null;
			this.aShortArray22 = null;
		}
		if (this.anIntArrayArray11 != null && !Class179.method24492(this.anInt782, this.anInt783)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class179.method24498(this.anInt782, this.anInt783)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray64 != null && (this.anInt782 & 0x800) == 0 && (this.anInt782 & 0x40000) == 0) {
			this.anIntArray64 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ig", descriptor = "()V", line = 982)
	void method6602() {
		if (!this.aBoolean157) {
			return;
		}
		this.aBoolean157 = false;
		if (this.aClass234Array2 == null && this.aClass210Array2 == null && this.aClass216Array1 == null && !Class179.method24397(this.anInt782, this.anInt783)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray61 != null && !Class179.method24466(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local23 = true;
				}
			}
			if (this.anIntArray62 != null && !Class179.method24471(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local25 = true;
				}
			}
			if (this.anIntArray60 != null && !Class179.method24473(this.anInt782, this.anInt783)) {
				if (this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					if (!this.aBoolean158) {
						this.method6603();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray61 = null;
			}
			if (local25) {
				this.anIntArray62 = null;
			}
			if (local27) {
				this.anIntArray60 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray61 == null && this.anIntArray62 == null && this.anIntArray60 == null) {
			this.aShortArray23 = null;
			this.anIntArray65 = null;
		}
		if (this.aByteArray22 != null && !Class179.method24476(this.anInt782, this.anInt783)) {
			if (this.aClass193_10 == null) {
				if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
					this.aBoolean157 = true;
				} else {
					this.aShortArray17 = null;
					this.aShortArray25 = null;
					this.aShortArray24 = null;
					this.aByteArray22 = null;
				}
			} else if (this.aClass193_10.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray17 = null;
				this.aShortArray25 = null;
				this.aShortArray24 = null;
				this.aByteArray22 = null;
			}
		}
		if (this.aShortArray19 != null && !Class179.method24478(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray19 = null;
			}
		}
		if (this.aByteArray21 != null && !Class179.method24480(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aByteArray21 = null;
			}
		}
		if (this.aFloatArray25 != null && !Class179.method24484(this.anInt782, this.anInt783)) {
			if (this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aFloatArray26 = null;
				this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray26 != null && !Class179.method24507(this.anInt782, this.anInt783)) {
			if (this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray26 = null;
			}
		}
		if (this.aShortArray21 != null && !Class179.method24505(this.anInt782, this.anInt783)) {
			if (this.aClass178_1 != null && this.aClass178_1.anInterface16_4 == null || this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null) {
				this.aBoolean157 = true;
			} else {
				this.aShortArray18 = null;
				this.aShortArray20 = null;
				this.aShortArray21 = null;
			}
		}
		if (this.anIntArrayArray12 != null && !Class179.method24489(this.anInt782, this.anInt783)) {
			this.anIntArrayArray12 = null;
			this.aShortArray22 = null;
		}
		if (this.anIntArrayArray11 != null && !Class179.method24492(this.anInt782, this.anInt783)) {
			this.anIntArrayArray11 = null;
			this.aShortArray16 = null;
		}
		if (this.anIntArrayArray13 != null && !Class179.method24498(this.anInt782, this.anInt783)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray64 != null && (this.anInt782 & 0x800) == 0 && (this.anInt782 & 0x40000) == 0) {
			this.anIntArray64 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "d", descriptor = "(I)V", line = 1083)
	@Override
	public void method6877(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cg", descriptor = "(I)V", line = 1083)
	@Override
	public void method6920(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ce", descriptor = "(I)V", line = 1083)
	@Override
	public void method6929(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "(I)V", line = 1095)
	@Override
	public void method6878(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt785; local9++) {
			local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt788; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray24[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray24[local9] * local3 >> 14);
			this.aShortArray24[local9] = (short) local29;
		}
		if (this.aClass193_10 == null && this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cu", descriptor = "(I)V", line = 1095)
	@Override
	public void method6930(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt785; local9++) {
			local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt788; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray24[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray24[local9] * local3 >> 14);
			this.aShortArray24[local9] = (short) local29;
		}
		if (this.aClass193_10 == null && this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cn", descriptor = "(I)V", line = 1114)
	@Override
	public void method6932(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local7 - this.anIntArray60[local9] * local3 >> 14;
			this.anIntArray60[local9] = this.anIntArray62[local9] * local3 + this.anIntArray60[local9] * local7 >> 14;
			this.anIntArray62[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cv", descriptor = "(I)V", line = 1114)
	@Override
	public void method6994(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local7 - this.anIntArray60[local9] * local3 >> 14;
			this.anIntArray60[local9] = this.anIntArray62[local9] * local3 + this.anIntArray60[local9] * local7 >> 14;
			this.anIntArray62[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "r", descriptor = "(I)V", line = 1114)
	@Override
	public void method7011(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local7 - this.anIntArray60[local9] * local3 >> 14;
			this.anIntArray60[local9] = this.anIntArray62[local9] * local3 + this.anIntArray60[local9] * local7 >> 14;
			this.anIntArray62[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ci", descriptor = "(I)V", line = 1114)
	@Override
	public void method6934(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local7 - this.anIntArray60[local9] * local3 >> 14;
			this.anIntArray60[local9] = this.anIntArray62[local9] * local3 + this.anIntArray60[local9] * local7 >> 14;
			this.anIntArray62[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "v", descriptor = "(I)V", line = 1126)
	@Override
	public void method6880(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray62[local9] = this.anIntArray62[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cp", descriptor = "(I)V", line = 1126)
	@Override
	public void method6933(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray62[local9] = this.anIntArray62[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ca", descriptor = "(I)V", line = 1126)
	@Override
	public void method6991(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray62[local9] = this.anIntArray62[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cx", descriptor = "(I)V", line = 1126)
	@Override
	public void method6935(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt785; local9++) {
			@Pc(29) int local29 = this.anIntArray62[local9] * local3 + this.anIntArray61[local9] * local7 >> 14;
			this.anIntArray62[local9] = this.anIntArray62[local9] * local7 - this.anIntArray61[local9] * local3 >> 14;
			this.anIntArray61[local9] = local29;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "o", descriptor = "(III)V", line = 1138)
	@Override
	public void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 0) {
				this.anIntArray61[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray62[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray60[local1] += arg2;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cw", descriptor = "(III)V", line = 1138)
	@Override
	public void method7025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 0) {
				this.anIntArray61[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray62[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray60[local1] += arg2;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "s", descriptor = "()V", line = 1148)
	@Override
	public void method6881() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt785; local1++) {
			this.anIntArray60[local1] = -this.anIntArray60[local1];
		}
		for (local1 = 0; local1 < this.anInt788; local1++) {
			this.aShortArray17[local1] = (short) -this.aShortArray17[local1];
		}
		for (local1 = 0; local1 < this.anInt792; local1++) {
			@Pc(45) short local45 = this.aShortArray21[local1];
			this.aShortArray21[local1] = this.aShortArray18[local1];
			this.aShortArray18[local1] = local45;
		}
		if (this.aClass193_10 == null && this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		if (this.aClass178_1 != null) {
			this.aClass178_1.anInterface16_4 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ct", descriptor = "()V", line = 1148)
	@Override
	public void method6937() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt785; local1++) {
			this.anIntArray60[local1] = -this.anIntArray60[local1];
		}
		for (local1 = 0; local1 < this.anInt788; local1++) {
			this.aShortArray17[local1] = (short) -this.aShortArray17[local1];
		}
		for (local1 = 0; local1 < this.anInt792; local1++) {
			@Pc(45) short local45 = this.aShortArray21[local1];
			this.aShortArray21[local1] = this.aShortArray18[local1];
			this.aShortArray18[local1] = local45;
		}
		if (this.aClass193_10 == null && this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		if (this.aClass178_1 != null) {
			this.aClass178_1.anInterface16_4 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cq", descriptor = "(III)V", line = 1163)
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "co", descriptor = "(III)V", line = 1163)
	@Override
	public void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cf", descriptor = "(III)V", line = 1163)
	@Override
	public void method6910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cr", descriptor = "(III)V", line = 1163)
	@Override
	public void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "cm", descriptor = "(III)V", line = 1163)
	@Override
	public void method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "(III)V", line = 1163)
	@Override
	public void method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt785; local1++) {
			if (arg0 != 128) {
				this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray60[local1] = this.anIntArray60[local1] * arg2 >> 7;
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "q", descriptor = "(IILclient!cb;Lclient!cb;III)V", line = 1173)
	@Override
	public void method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(9) int local9 = arg4 + this.aShort62;
		@Pc(14) int local14 = arg4 + this.aShort59;
		@Pc(19) int local19 = arg6 + this.aShort61;
		@Pc(24) int local24 = arg6 + this.aShort64;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt412 * -1678286317 >> arg2.anInt415 * -373302705 >= arg2.anInt414 * -1667858293 || local19 < 0 || local24 + arg2.anInt412 * -1678286317 >> arg2.anInt415 * -373302705 >= arg2.anInt413 * -143202029)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt412 * -1678286317 >> arg3.anInt415 * -373302705 >= arg3.anInt414 * -1667858293 || local19 < 0 || local24 + arg3.anInt412 * -1678286317 >> arg3.anInt415 * -373302705 >= arg3.anInt413 * -143202029) {
				return;
			}
		} else {
			local9 >>= arg2.anInt415 * -373302705;
			local14 = local14 + (arg2.anInt412 * -1678286317 - 1) >> arg2.anInt415 * -373302705;
			local19 >>= arg2.anInt415 * -373302705;
			local24 = local24 + (arg2.anInt412 * -1678286317 - 1) >> arg2.anInt415 * -373302705;
			if (arg2.method2480(local9, local19, -1740677762) == arg5 && arg2.method2480(local14, local19, -216049005) == arg5 && arg2.method2480(local9, local24, -1858869387) == arg5 && arg2.method2480(local14, local24, -1518647068) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt785; local195++) {
				this.anIntArray62[local195] = this.anIntArray62[local195] + arg2.method2475(this.anIntArray61[local195] + arg4, this.anIntArray60[local195] + arg6, -1208721306) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort60;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt785; local239++) {
					local252 = (this.anIntArray62[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray62[local239] += (arg2.method2475(this.anIntArray61[local239] + arg4, this.anIntArray60[local239] + arg6, -1820193615) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt412 * -1678286317 >= arg2.anInt414 * -1667858293 << arg2.anInt415 * -373302705 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt412 * -1678286317 >= arg2.anInt413 * -143202029 << arg2.anInt415 * -373302705) {
						return;
					}
					this.method6828(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort63 - this.aShort60;
					for (local239 = 0; local239 < this.anInt785; local239++) {
						this.anIntArray62[local239] = this.anIntArray62[local239] + (arg3.method2475(this.anIntArray61[local239] + arg4, this.anIntArray60[local239] + arg6, -1399308844) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort63 - this.aShort60;
					for (local239 = 0; local239 < this.anInt785; local239++) {
						local252 = this.anIntArray61[local239] + arg4;
						local323 = this.anIntArray60[local239] + arg6;
						@Pc(468) int local468 = arg2.method2475(local252, local323, -1577809461);
						@Pc(474) int local474 = arg3.method2475(local252, local323, -581828452);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray62[local239] = ((this.anIntArray62[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ch", descriptor = "(IILclient!cb;Lclient!cb;III)V", line = 1173)
	@Override
	public void method6942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(9) int local9 = arg4 + this.aShort62;
		@Pc(14) int local14 = arg4 + this.aShort59;
		@Pc(19) int local19 = arg6 + this.aShort61;
		@Pc(24) int local24 = arg6 + this.aShort64;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt412 * -1678286317 >> arg2.anInt415 * -373302705 >= arg2.anInt414 * -1667858293 || local19 < 0 || local24 + arg2.anInt412 * -1678286317 >> arg2.anInt415 * -373302705 >= arg2.anInt413 * -143202029)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt412 * -1678286317 >> arg3.anInt415 * -373302705 >= arg3.anInt414 * -1667858293 || local19 < 0 || local24 + arg3.anInt412 * -1678286317 >> arg3.anInt415 * -373302705 >= arg3.anInt413 * -143202029) {
				return;
			}
		} else {
			local9 >>= arg2.anInt415 * -373302705;
			local14 = local14 + (arg2.anInt412 * -1678286317 - 1) >> arg2.anInt415 * -373302705;
			local19 >>= arg2.anInt415 * -373302705;
			local24 = local24 + (arg2.anInt412 * -1678286317 - 1) >> arg2.anInt415 * -373302705;
			if (arg2.method2480(local9, local19, -402366192) == arg5 && arg2.method2480(local14, local19, -373095562) == arg5 && arg2.method2480(local9, local24, -1005692213) == arg5 && arg2.method2480(local14, local24, -605861713) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt785; local195++) {
				this.anIntArray62[local195] = this.anIntArray62[local195] + arg2.method2475(this.anIntArray61[local195] + arg4, this.anIntArray60[local195] + arg6, -19121767) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort60;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt785; local239++) {
					local252 = (this.anIntArray62[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray62[local239] += (arg2.method2475(this.anIntArray61[local239] + arg4, this.anIntArray60[local239] + arg6, -455076141) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt412 * -1678286317 >= arg2.anInt414 * -1667858293 << arg2.anInt415 * -373302705 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt412 * -1678286317 >= arg2.anInt413 * -143202029 << arg2.anInt415 * -373302705) {
						return;
					}
					this.method6828(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort63 - this.aShort60;
					for (local239 = 0; local239 < this.anInt785; local239++) {
						this.anIntArray62[local239] = this.anIntArray62[local239] + (arg3.method2475(this.anIntArray61[local239] + arg4, this.anIntArray60[local239] + arg6, 490456155) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort63 - this.aShort60;
					for (local239 = 0; local239 < this.anInt785; local239++) {
						local252 = this.anIntArray61[local239] + arg4;
						local323 = this.anIntArray60[local239] + arg6;
						@Pc(468) int local468 = arg2.method2475(local252, local323, -1020465678);
						@Pc(474) int local474 = arg3.method2475(local252, local323, -189576375);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray62[local239] = ((this.anIntArray62[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "hr", descriptor = "()V", line = 1237)
	void method6603() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt785; local17++) {
			@Pc(26) int local26 = this.anIntArray61[local17];
			@Pc(31) int local31 = this.anIntArray62[local17];
			@Pc(36) int local36 = this.anIntArray60[local17];
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
		this.aShort62 = (short) local1;
		this.aShort59 = (short) local7;
		this.aShort60 = (short) local3;
		this.aShort63 = (short) local9;
		this.aShort61 = (short) local5;
		this.aShort64 = (short) local11;
		this.anInt791 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt790 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!afk", name = "iu", descriptor = "()V", line = 1237)
	void method6604() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt785; local17++) {
			@Pc(26) int local26 = this.anIntArray61[local17];
			@Pc(31) int local31 = this.anIntArray62[local17];
			@Pc(36) int local36 = this.anIntArray60[local17];
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
		this.aShort62 = (short) local1;
		this.aShort59 = (short) local7;
		this.aShort60 = (short) local3;
		this.aShort63 = (short) local9;
		this.aShort61 = (short) local5;
		this.aShort64 = (short) local11;
		this.anInt791 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt790 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!afk", name = "in", descriptor = "()V", line = 1237)
	void method6605() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt785; local17++) {
			@Pc(26) int local26 = this.anIntArray61[local17];
			@Pc(31) int local31 = this.anIntArray62[local17];
			@Pc(36) int local36 = this.anIntArray60[local17];
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
		this.aShort62 = (short) local1;
		this.aShort59 = (short) local7;
		this.aShort60 = (short) local3;
		this.aShort63 = (short) local9;
		this.aShort61 = (short) local5;
		this.aShort64 = (short) local11;
		this.anInt791 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt790 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!afk", name = "ir", descriptor = "()V", line = 1237)
	void method6606() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt785; local17++) {
			@Pc(26) int local26 = this.anIntArray61[local17];
			@Pc(31) int local31 = this.anIntArray62[local17];
			@Pc(36) int local36 = this.anIntArray60[local17];
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
		this.aShort62 = (short) local1;
		this.aShort59 = (short) local7;
		this.aShort60 = (short) local3;
		this.aShort63 = (short) local9;
		this.aShort61 = (short) local5;
		this.aShort64 = (short) local11;
		this.anInt791 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt790 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!afk", name = "bl", descriptor = "()V", line = 1272)
	@Override
	public void method6908() {
		if (this.aBoolean159) {
			return;
		}
		if (!this.aBoolean158) {
			this.method6603();
		}
		this.aShort65 = this.aShort60;
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!afk", name = "dw", descriptor = "()V", line = 1272)
	@Override
	public void method6963() {
		if (this.aBoolean159) {
			return;
		}
		if (!this.aBoolean158) {
			this.method6603();
		}
		this.aShort65 = this.aShort60;
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!afk", name = "aj", descriptor = "()I", line = 1280)
	@Override
	public int method6899() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt791;
	}

	@OriginalMember(owner = "client!afk", name = "ds", descriptor = "()I", line = 1280)
	@Override
	public int method6964() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt791;
	}

	@OriginalMember(owner = "client!afk", name = "ay", descriptor = "()I", line = 1285)
	@Override
	public int method6900() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "db", descriptor = "()I", line = 1285)
	@Override
	public int method6904() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "dy", descriptor = "()I", line = 1285)
	@Override
	public int method6996() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "du", descriptor = "()I", line = 1285)
	@Override
	public int method6965() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "dl", descriptor = "()I", line = 1285)
	@Override
	public int method6966() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "dp", descriptor = "()I", line = 1285)
	@Override
	public int method6967() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.anInt790;
	}

	@OriginalMember(owner = "client!afk", name = "ab", descriptor = "()I", line = 1290)
	@Override
	public int method6901() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!afk", name = "dh", descriptor = "()I", line = 1290)
	@Override
	public int method6970() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!afk", name = "de", descriptor = "()I", line = 1295)
	@Override
	public int method6973() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!afk", name = "az", descriptor = "()I", line = 1295)
	@Override
	public int method6902() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!afk", name = "dx", descriptor = "()I", line = 1295)
	@Override
	public int method6971() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!afk", name = "dg", descriptor = "()I", line = 1295)
	@Override
	public int method6951() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!afk", name = "aa", descriptor = "()I", line = 1300)
	@Override
	public int method6917() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!afk", name = "dj", descriptor = "()I", line = 1300)
	@Override
	public int method6974() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!afk", name = "af", descriptor = "()I", line = 1305)
	@Override
	public int method6879() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!afk", name = "ey", descriptor = "()I", line = 1305)
	@Override
	public int method7023() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!afk", name = "eo", descriptor = "()I", line = 1305)
	@Override
	public int method6977() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!afk", name = "ak", descriptor = "()I", line = 1310)
	@Override
	public int method6905() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!afk", name = "eu", descriptor = "()I", line = 1310)
	@Override
	public int method6961() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!afk", name = "ed", descriptor = "()I", line = 1310)
	@Override
	public int method6978() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!afk", name = "ee", descriptor = "()I", line = 1315)
	@Override
	public int method6972() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!afk", name = "es", descriptor = "()I", line = 1315)
	@Override
	public int method6980() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!afk", name = "an", descriptor = "()I", line = 1315)
	@Override
	public int method6957() {
		if (!this.aBoolean158) {
			this.method6603();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!afk", name = "bf", descriptor = "()I", line = 1320)
	@Override
	public int method6886() {
		if (!this.aBoolean159) {
			this.method6908();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!afk", name = "ei", descriptor = "()I", line = 1320)
	@Override
	public int method6981() {
		if (!this.aBoolean159) {
			this.method6908();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!afk", name = "ej", descriptor = "()I", line = 1320)
	@Override
	public int method6983() {
		if (!this.aBoolean159) {
			this.method6908();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!afk", name = "el", descriptor = "()I", line = 1320)
	@Override
	public int method6982() {
		if (!this.aBoolean159) {
			this.method6908();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!afk", name = "bo", descriptor = "(Lclient!do;IIIZ)V", line = 1325)
	@Override
	public void method6872(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub2 local2 = (Class109_Sub2) arg0;
		if (this.anInt792 == 0 || local2.anInt792 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt785;
		@Pc(15) int[] local15 = local2.anIntArray61;
		@Pc(18) int[] local18 = local2.anIntArray62;
		@Pc(21) int[] local21 = local2.anIntArray60;
		@Pc(24) short[] local24 = local2.aShortArray24;
		@Pc(27) short[] local27 = local2.aShortArray25;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray22;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass217_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass217_1.aShortArray87;
			local44 = this.aClass217_1.aShortArray86;
			local48 = this.aClass217_1.aShortArray85;
			local52 = this.aClass217_1.aByteArray67;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass217_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass217_1.aShortArray87;
			local72 = local2.aClass217_1.aShortArray86;
			local76 = local2.aClass217_1.aShortArray85;
			local80 = local2.aClass217_1.aByteArray67;
		}
		@Pc(92) int[] local92 = local2.anIntArray65;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean158) {
			local2.method6603();
		}
		@Pc(103) short local103 = local2.aShort60;
		@Pc(106) short local106 = local2.aShort63;
		@Pc(109) short local109 = local2.aShort62;
		@Pc(112) short local112 = local2.aShort59;
		@Pc(115) short local115 = local2.aShort61;
		@Pc(118) short local118 = local2.aShort64;
		for (@Pc(120) int local120 = 0; local120 < this.anInt785; local120++) {
			@Pc(131) int local131 = this.anIntArray62[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray61[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray60[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray65[local120];
						@Pc(180) int local180 = this.anIntArray65[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray22[local168] != 0) {
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
											this.aClass217_1 = new Class217();
											local40 = this.aClass217_1.aShortArray87 = Class702.method36718(this.aShortArray24, 2038053695);
											local44 = this.aClass217_1.aShortArray86 = Class702.method36718(this.aShortArray25, 2038053695);
											local48 = this.aClass217_1.aShortArray85 = Class702.method36718(this.aShortArray17, 2038053695);
											local52 = this.aClass217_1.aByteArray67 = Class335.method27404(this.aByteArray22, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class217 local325 = local2.aClass217_1 = new Class217();
											local68 = local325.aShortArray87 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray86 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray85 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray67 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray24[local168];
										@Pc(363) short local363 = this.aShortArray25[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray22[local168];
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
										local173 = this.anIntArray65[local120];
										local180 = this.anIntArray65[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass193_10 == null && this.aClass193_9 != null) {
											this.aClass193_9.anInterface14_6 = null;
										}
										if (this.aClass193_10 != null) {
											this.aClass193_10.anInterface14_6 = null;
										}
										if (local2.aClass193_10 == null && local2.aClass193_9 != null) {
											local2.aClass193_9.anInterface14_6 = null;
										}
										if (local2.aClass193_10 != null) {
											local2.aClass193_10.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!afk", name = "bz", descriptor = "(Lclient!do;IIIZ)V", line = 1325)
	@Override
	public void method6921(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub2 local2 = (Class109_Sub2) arg0;
		if (this.anInt792 == 0 || local2.anInt792 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt785;
		@Pc(15) int[] local15 = local2.anIntArray61;
		@Pc(18) int[] local18 = local2.anIntArray62;
		@Pc(21) int[] local21 = local2.anIntArray60;
		@Pc(24) short[] local24 = local2.aShortArray24;
		@Pc(27) short[] local27 = local2.aShortArray25;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray22;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass217_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass217_1.aShortArray87;
			local44 = this.aClass217_1.aShortArray86;
			local48 = this.aClass217_1.aShortArray85;
			local52 = this.aClass217_1.aByteArray67;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass217_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass217_1.aShortArray87;
			local72 = local2.aClass217_1.aShortArray86;
			local76 = local2.aClass217_1.aShortArray85;
			local80 = local2.aClass217_1.aByteArray67;
		}
		@Pc(92) int[] local92 = local2.anIntArray65;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean158) {
			local2.method6603();
		}
		@Pc(103) short local103 = local2.aShort60;
		@Pc(106) short local106 = local2.aShort63;
		@Pc(109) short local109 = local2.aShort62;
		@Pc(112) short local112 = local2.aShort59;
		@Pc(115) short local115 = local2.aShort61;
		@Pc(118) short local118 = local2.aShort64;
		for (@Pc(120) int local120 = 0; local120 < this.anInt785; local120++) {
			@Pc(131) int local131 = this.anIntArray62[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray61[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray60[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray65[local120];
						@Pc(180) int local180 = this.anIntArray65[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray22[local168] != 0) {
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
											this.aClass217_1 = new Class217();
											local40 = this.aClass217_1.aShortArray87 = Class702.method36718(this.aShortArray24, 2038053695);
											local44 = this.aClass217_1.aShortArray86 = Class702.method36718(this.aShortArray25, 2038053695);
											local48 = this.aClass217_1.aShortArray85 = Class702.method36718(this.aShortArray17, 2038053695);
											local52 = this.aClass217_1.aByteArray67 = Class335.method27404(this.aByteArray22, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class217 local325 = local2.aClass217_1 = new Class217();
											local68 = local325.aShortArray87 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray86 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray85 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray67 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray24[local168];
										@Pc(363) short local363 = this.aShortArray25[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray22[local168];
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
										local173 = this.anIntArray65[local120];
										local180 = this.anIntArray65[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass193_10 == null && this.aClass193_9 != null) {
											this.aClass193_9.anInterface14_6 = null;
										}
										if (this.aClass193_10 != null) {
											this.aClass193_10.anInterface14_6 = null;
										}
										if (local2.aClass193_10 == null && local2.aClass193_9 != null) {
											local2.aClass193_9.anInterface14_6 = null;
										}
										if (local2.aClass193_10 != null) {
											local2.aClass193_10.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!afk", name = "bv", descriptor = "(Lclient!do;IIIZ)V", line = 1325)
	@Override
	public void method6944(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub2 local2 = (Class109_Sub2) arg0;
		if (this.anInt792 == 0 || local2.anInt792 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt785;
		@Pc(15) int[] local15 = local2.anIntArray61;
		@Pc(18) int[] local18 = local2.anIntArray62;
		@Pc(21) int[] local21 = local2.anIntArray60;
		@Pc(24) short[] local24 = local2.aShortArray24;
		@Pc(27) short[] local27 = local2.aShortArray25;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray22;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass217_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass217_1.aShortArray87;
			local44 = this.aClass217_1.aShortArray86;
			local48 = this.aClass217_1.aShortArray85;
			local52 = this.aClass217_1.aByteArray67;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass217_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass217_1.aShortArray87;
			local72 = local2.aClass217_1.aShortArray86;
			local76 = local2.aClass217_1.aShortArray85;
			local80 = local2.aClass217_1.aByteArray67;
		}
		@Pc(92) int[] local92 = local2.anIntArray65;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean158) {
			local2.method6603();
		}
		@Pc(103) short local103 = local2.aShort60;
		@Pc(106) short local106 = local2.aShort63;
		@Pc(109) short local109 = local2.aShort62;
		@Pc(112) short local112 = local2.aShort59;
		@Pc(115) short local115 = local2.aShort61;
		@Pc(118) short local118 = local2.aShort64;
		for (@Pc(120) int local120 = 0; local120 < this.anInt785; local120++) {
			@Pc(131) int local131 = this.anIntArray62[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray61[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray60[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray65[local120];
						@Pc(180) int local180 = this.anIntArray65[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray22[local168] != 0) {
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
											this.aClass217_1 = new Class217();
											local40 = this.aClass217_1.aShortArray87 = Class702.method36718(this.aShortArray24, 2038053695);
											local44 = this.aClass217_1.aShortArray86 = Class702.method36718(this.aShortArray25, 2038053695);
											local48 = this.aClass217_1.aShortArray85 = Class702.method36718(this.aShortArray17, 2038053695);
											local52 = this.aClass217_1.aByteArray67 = Class335.method27404(this.aByteArray22, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class217 local325 = local2.aClass217_1 = new Class217();
											local68 = local325.aShortArray87 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray86 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray85 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray67 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray24[local168];
										@Pc(363) short local363 = this.aShortArray25[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray22[local168];
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
										local173 = this.anIntArray65[local120];
										local180 = this.anIntArray65[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass193_10 == null && this.aClass193_9 != null) {
											this.aClass193_9.anInterface14_6 = null;
										}
										if (this.aClass193_10 != null) {
											this.aClass193_10.anInterface14_6 = null;
										}
										if (local2.aClass193_10 == null && local2.aClass193_9 != null) {
											local2.aClass193_9.anInterface14_6 = null;
										}
										if (local2.aClass193_10 != null) {
											local2.aClass193_10.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!afk", name = "bk", descriptor = "(I)V", line = 1459)
	@Override
	public void method7027(@OriginalArg(0) int arg0) {
		this.aShort57 = (short) arg0;
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "fc", descriptor = "(I)V", line = 1459)
	@Override
	public void method7010(@OriginalArg(0) int arg0) {
		this.aShort57 = (short) arg0;
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "fa", descriptor = "(I)V", line = 1464)
	@Override
	public void method6906(@OriginalArg(0) int arg0) {
		this.aShort58 = (short) arg0;
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bh", descriptor = "(I)V", line = 1464)
	@Override
	public void method6909(@OriginalArg(0) int arg0) {
		this.aShort58 = (short) arg0;
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "fw", descriptor = "(I)V", line = 1464)
	@Override
	public void method6988(@OriginalArg(0) int arg0) {
		this.aShort58 = (short) arg0;
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
		if (this.aClass193_10 != null) {
			this.aClass193_10.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bx", descriptor = "()I", line = 1470)
	@Override
	public int method7018() {
		return this.aShort57;
	}

	@OriginalMember(owner = "client!afk", name = "ep", descriptor = "()I", line = 1470)
	@Override
	public int method6984() {
		return this.aShort57;
	}

	@OriginalMember(owner = "client!afk", name = "ev", descriptor = "()I", line = 1470)
	@Override
	public int method6985() {
		return this.aShort57;
	}

	@OriginalMember(owner = "client!afk", name = "ec", descriptor = "()I", line = 1470)
	@Override
	public int method7021() {
		return this.aShort57;
	}

	@OriginalMember(owner = "client!afk", name = "em", descriptor = "()I", line = 1474)
	@Override
	public int method7013() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!afk", name = "ek", descriptor = "()I", line = 1474)
	@Override
	public int method6987() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!afk", name = "eq", descriptor = "()I", line = 1474)
	@Override
	public int method6926() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!afk", name = "bd", descriptor = "()I", line = 1474)
	@Override
	public int method6911() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!afk", name = "eh", descriptor = "()I", line = 1474)
	@Override
	public int method6989() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!afk", name = "bc", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6912() {
		return this.aByteArray21;
	}

	@OriginalMember(owner = "client!afk", name = "eg", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6990() {
		return this.aByteArray21;
	}

	@OriginalMember(owner = "client!afk", name = "ef", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6992() {
		return this.aByteArray21;
	}

	@OriginalMember(owner = "client!afk", name = "ez", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6895() {
		return this.aByteArray21;
	}

	@OriginalMember(owner = "client!afk", name = "et", descriptor = "(SS)V", line = 1482)
	@Override
	public void method6993(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(32) Class216 local32 = this.aClass216Array1[local1];
				@Pc(37) Class194 local37 = this.aClass194Array1[local1];
				local37.anInt3358 = local37.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local32.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bi", descriptor = "(SS)V", line = 1482)
	@Override
	public void method7017(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(32) Class216 local32 = this.aClass216Array1[local1];
				@Pc(37) Class194 local37 = this.aClass194Array1[local1];
				local37.anInt3358 = local37.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local32.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bn", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6916(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				this.aByteArray21[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray21[local3] = (byte) local39;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ew", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6896(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				this.aByteArray21[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray21[local3] = (byte) local39;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ea", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6890(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				this.aByteArray21[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt792; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray21[local3] = (byte) local39;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bt", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6913(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub1_26.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt792; local5++) {
			if (this.aShortArray26[local5] == arg0) {
				this.aShortArray26[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, -654503487);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, 971052191);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean156 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass216Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt789; local94++) {
				@Pc(103) Class216 local103 = this.aClass216Array1[local94];
				@Pc(108) Class194 local108 = this.aClass194Array1[local94];
				local108.anInt3358 = local108.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local103.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "er", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6995(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub1_26.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt792; local5++) {
			if (this.aShortArray26[local5] == arg0) {
				this.aShortArray26[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, 226492791);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, -1541763471);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean156 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass216Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt789; local94++) {
				@Pc(103) Class216 local103 = this.aClass216Array1[local94];
				@Pc(108) Class194 local108 = this.aClass194Array1[local94];
				local108.anInt3358 = local108.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local103.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "en", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6969(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub1_26.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt792; local5++) {
			if (this.aShortArray26[local5] == arg0) {
				this.aShortArray26[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, -262217025);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, -1560093964);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean156 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass216Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt789; local94++) {
				@Pc(103) Class216 local103 = this.aClass216Array1[local94];
				@Pc(108) Class194 local108 = this.aClass194Array1[local94];
				local108.anInt3358 = local108.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local103.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "bq", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
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
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(97) Class216 local97 = this.aClass216Array1[local1];
				@Pc(102) Class194 local102 = this.aClass194Array1[local1];
				local102.anInt3358 = local102.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local97.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "eb", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
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
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(97) Class216 local97 = this.aClass216Array1[local1];
				@Pc(102) Class194 local102 = this.aClass194Array1[local1];
				local102.anInt3358 = local102.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local97.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ex", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
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
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(97) Class216 local97 = this.aClass216Array1[local1];
				@Pc(102) Class194 local102 = this.aClass194Array1[local1];
				local102.anInt3358 = local102.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local97.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "fg", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt792; local1++) {
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
		if (this.aClass216Array1 != null) {
			for (local1 = 0; local1 < this.anInt789; local1++) {
				@Pc(97) Class216 local97 = this.aClass216Array1[local1];
				@Pc(102) Class194 local102 = this.aClass194Array1[local1];
				local102.anInt3358 = local102.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local97.anInt3613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass193_9 != null) {
			this.aClass193_9.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "fz", descriptor = "()Z", line = 1564)
	@Override
	public boolean method7002() {
		if (this.aShortArray26 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray26.length; local6++) {
			if (this.aShortArray26[local6] != -1) {
				@Pc(29) Class235 local29 = this.aClass104_Sub1_26.aClass225_6.method25597(this.aShortArray26[local6] & 0xFFFF, -1608422115);
				if (local29.aBoolean652 && !this.aClass104_Sub1_26.aClass201_1.method24637(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "bm", descriptor = "()Z", line = 1564)
	@Override
	public boolean method6915() {
		if (this.aShortArray26 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray26.length; local6++) {
			if (this.aShortArray26[local6] != -1) {
				@Pc(29) Class235 local29 = this.aClass104_Sub1_26.aClass225_6.method25597(this.aShortArray26[local6] & 0xFFFF, 69523104);
				if (local29.aBoolean652 && !this.aClass104_Sub1_26.aClass201_1.method24637(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "fj", descriptor = "()Z", line = 1564)
	@Override
	public boolean method7003() {
		if (this.aShortArray26 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray26.length; local6++) {
			if (this.aShortArray26[local6] != -1) {
				@Pc(29) Class235 local29 = this.aClass104_Sub1_26.aClass225_6.method25597(this.aShortArray26[local6] & 0xFFFF, -635321917);
				if (local29.aBoolean652 && !this.aClass104_Sub1_26.aClass201_1.method24637(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "fd", descriptor = "()Z", line = 1564)
	@Override
	public boolean method7004() {
		if (this.aShortArray26 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray26.length; local6++) {
			if (this.aShortArray26[local6] != -1) {
				@Pc(29) Class235 local29 = this.aClass104_Sub1_26.aClass225_6.method25597(this.aShortArray26[local6] & 0xFFFF, 1147834096);
				if (local29.aBoolean652 && !this.aClass104_Sub1_26.aClass201_1.method24637(Class616.aClass616_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "bb", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6903() {
		return this.aBoolean155;
	}

	@OriginalMember(owner = "client!afk", name = "fn", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6986() {
		return this.aBoolean155;
	}

	@OriginalMember(owner = "client!afk", name = "fi", descriptor = "()Z", line = 1576)
	@Override
	public boolean method7006() {
		return this.aBoolean155;
	}

	@OriginalMember(owner = "client!afk", name = "be", descriptor = "()Z", line = 1580)
	@Override
	public boolean method6975() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!afk", name = "fv", descriptor = "()Z", line = 1580)
	@Override
	public boolean method7009() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!afk", name = "ft", descriptor = "()Z", line = 1580)
	@Override
	public boolean method7007() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!afk", name = "fx", descriptor = "()Z", line = 1580)
	@Override
	public boolean method7008() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!afk", name = "b", descriptor = "()V", line = 1583)
	@Override
	void method6884() {
	}

	@OriginalMember(owner = "client!afk", name = "cb", descriptor = "()V", line = 1583)
	@Override
	void method6943() {
	}

	@OriginalMember(owner = "client!afk", name = "cy", descriptor = "()V", line = 1584)
	@Override
	void method6945() {
	}

	@OriginalMember(owner = "client!afk", name = "cs", descriptor = "()V", line = 1584)
	@Override
	void method6871() {
	}

	@OriginalMember(owner = "client!afk", name = "h", descriptor = "()V", line = 1584)
	@Override
	void method6885() {
	}

	@OriginalMember(owner = "client!afk", name = "as", descriptor = "()Z", line = 1587)
	@Override
	boolean method6888() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt784; local6++) {
			this.anIntArray61[local6] <<= 0x4;
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray60[local6] <<= 0x4;
		}
		anInt793 = 0;
		anInt794 = 0;
		anInt795 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "cc", descriptor = "()Z", line = 1587)
	@Override
	boolean method6950() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt784; local6++) {
			this.anIntArray61[local6] <<= 0x4;
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray60[local6] <<= 0x4;
		}
		anInt793 = 0;
		anInt794 = 0;
		anInt795 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "cz", descriptor = "()Z", line = 1587)
	@Override
	boolean method6946() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt784; local6++) {
			this.anIntArray61[local6] <<= 0x4;
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray60[local6] <<= 0x4;
		}
		anInt793 = 0;
		anInt794 = 0;
		anInt795 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afk", name = "am", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6891(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt793 += this.anIntArray61[local53];
							anInt794 += this.anIntArray62[local53];
							anInt795 += this.anIntArray60[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + arg2;
				anInt794 = anInt794 / local18 + arg3;
				anInt795 = anInt795 / local18 + arg4;
				aBoolean160 = true;
			} else {
				anInt793 = arg2;
				anInt794 = arg3;
				anInt795 = arg4;
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
							this.anIntArray61[local45] += arg2;
							this.anIntArray62[local45] += arg3;
							this.anIntArray60[local45] += arg4;
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
								this.anIntArray61[local45] -= anInt793;
								this.anIntArray62[local45] -= anInt794;
								this.anIntArray60[local45] -= anInt795;
								if (arg4 != 0) {
									local53 = Class464.anIntArray451[arg4];
									local343 = Class464.anIntArray452[arg4];
									local365 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = this.anIntArray62[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class464.anIntArray451[arg2];
									local343 = Class464.anIntArray452[arg2];
									local365 = this.anIntArray62[local45] * local343 - this.anIntArray60[local45] * local53 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class464.anIntArray451[arg3];
									local343 = Class464.anIntArray452[arg3];
									local365 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray60[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								this.anIntArray61[local45] += anInt793;
								this.anIntArray62[local45] += anInt794;
								this.anIntArray60[local45] += anInt795;
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
									local53 = this.anIntArray65[local45];
									local343 = this.anIntArray65[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray23[local365] != 0; local365++) {
										local387 = (this.aShortArray23[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class464.anIntArray451[arg4];
											local426 = Class464.anIntArray452[arg4];
											local430 = this.aShortArray25[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray25[local387] = (short) (this.aShortArray25[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class464.anIntArray451[arg2];
											local426 = Class464.anIntArray452[arg2];
											local430 = this.aShortArray25[local387] * local426 - this.aShortArray17[local387] * local422 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray25[local387] * local422 + this.aShortArray17[local387] * local426 + 16383 >> 14);
											this.aShortArray25[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class464.anIntArray451[arg3];
											local426 = Class464.anIntArray452[arg3];
											local430 = this.aShortArray17[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray17[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass193_10 == null && this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass193_10 != null) {
						this.aClass193_10.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean160) {
					local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
					local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
					local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt793 = local343;
					anInt794 = local365;
					anInt795 = local387;
					aBoolean160 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class464.anIntArray452[arg2];
				local387 = Class464.anIntArray451[arg2];
				local422 = Class464.anIntArray452[arg3];
				local426 = Class464.anIntArray451[arg3];
				local430 = Class464.anIntArray452[arg4];
				local434 = Class464.anIntArray451[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt793 + local410[1] * -anInt794 + local410[2] * -anInt795 + 8192 >> 14;
				local603 = local410[3] * -anInt793 + local410[4] * -anInt794 + local410[5] * -anInt795 + 8192 >> 14;
				local628 = local410[6] * -anInt793 + local410[7] * -anInt794 + local410[8] * -anInt795 + 8192 >> 14;
				local632 = local578 + anInt793;
				@Pc(636) int local636 = local603 + anInt794;
				local640 = local628 + anInt795;
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
								@Pc(979) int local979 = local777[0] * this.anIntArray61[local937] + local777[1] * this.anIntArray62[local937] + local777[2] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray61[local937] + local777[4] * this.anIntArray62[local937] + local777[5] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray61[local937] + local777[7] * this.anIntArray62[local937] + local777[8] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray61[local937] = local1045;
								this.anIntArray62[local937] = local1049;
								this.anIntArray60[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class216 local2452;
			@Pc(2457) Class194 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
									local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray21[local45] = (byte) local53;
									if (this.aClass193_9 != null) {
										this.aClass193_9.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local2452 = this.aClass216Array1[local18];
							local2457 = this.aClass194Array1[local18];
							local2457.anInt3358 = local2457.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local2452.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class194 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3353 += arg2;
									local2686.anInt3356 += arg3;
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
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3354 = local2686.anInt3354 * arg2 >> 7;
									local2686.anInt3355 = local2686.anInt3355 * arg3 >> 7;
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
								local2686 = this.aClass194Array1[local228[local230]];
								local2686.anInt3357 = local2686.anInt3357 + arg2 & 0x3FFF;
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
							if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
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
								if (this.aClass193_9 != null) {
									this.aClass193_9.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local2452 = this.aClass216Array1[local18];
						local2457 = this.aClass194Array1[local18];
						local2457.anInt3358 = local2457.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local2452.anInt3613] & 0xFFFF] & 0xFFFFFF;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
							this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
							this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
			if (aBoolean160) {
				local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
				local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
				local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt793 = local343;
				anInt794 = local365;
				anInt795 = local387;
				aBoolean160 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt793 + 8192 >> 14;
			local426 = local365 * -anInt794 + 8192 >> 14;
			local430 = local387 * -anInt795 + 8192 >> 14;
			local434 = local422 + anInt793;
			local442 = local426 + anInt794;
			local450 = local430 + anInt795;
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
							local789 = local1929[0] * this.anIntArray61[local784] + local1929[1] * this.anIntArray62[local784] + local1929[2] * this.anIntArray60[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray61[local784] + local1929[4] * this.anIntArray62[local784] + local1929[5] * this.anIntArray60[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray61[local784] + local1929[7] * this.anIntArray62[local784] + local1929[8] * this.anIntArray60[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray61[local784] = local2197;
							this.anIntArray62[local784] = local2201;
							this.anIntArray60[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "dz", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt793 += this.anIntArray61[local53];
							anInt794 += this.anIntArray62[local53];
							anInt795 += this.anIntArray60[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + arg2;
				anInt794 = anInt794 / local18 + arg3;
				anInt795 = anInt795 / local18 + arg4;
				aBoolean160 = true;
			} else {
				anInt793 = arg2;
				anInt794 = arg3;
				anInt795 = arg4;
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
							this.anIntArray61[local45] += arg2;
							this.anIntArray62[local45] += arg3;
							this.anIntArray60[local45] += arg4;
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
								this.anIntArray61[local45] -= anInt793;
								this.anIntArray62[local45] -= anInt794;
								this.anIntArray60[local45] -= anInt795;
								if (arg4 != 0) {
									local53 = Class464.anIntArray451[arg4];
									local343 = Class464.anIntArray452[arg4];
									local365 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = this.anIntArray62[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class464.anIntArray451[arg2];
									local343 = Class464.anIntArray452[arg2];
									local365 = this.anIntArray62[local45] * local343 - this.anIntArray60[local45] * local53 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class464.anIntArray451[arg3];
									local343 = Class464.anIntArray452[arg3];
									local365 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray60[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								this.anIntArray61[local45] += anInt793;
								this.anIntArray62[local45] += anInt794;
								this.anIntArray60[local45] += anInt795;
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
									local53 = this.anIntArray65[local45];
									local343 = this.anIntArray65[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray23[local365] != 0; local365++) {
										local387 = (this.aShortArray23[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class464.anIntArray451[arg4];
											local426 = Class464.anIntArray452[arg4];
											local430 = this.aShortArray25[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray25[local387] = (short) (this.aShortArray25[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class464.anIntArray451[arg2];
											local426 = Class464.anIntArray452[arg2];
											local430 = this.aShortArray25[local387] * local426 - this.aShortArray17[local387] * local422 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray25[local387] * local422 + this.aShortArray17[local387] * local426 + 16383 >> 14);
											this.aShortArray25[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class464.anIntArray451[arg3];
											local426 = Class464.anIntArray452[arg3];
											local430 = this.aShortArray17[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray17[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass193_10 == null && this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass193_10 != null) {
						this.aClass193_10.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean160) {
					local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
					local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
					local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt793 = local343;
					anInt794 = local365;
					anInt795 = local387;
					aBoolean160 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class464.anIntArray452[arg2];
				local387 = Class464.anIntArray451[arg2];
				local422 = Class464.anIntArray452[arg3];
				local426 = Class464.anIntArray451[arg3];
				local430 = Class464.anIntArray452[arg4];
				local434 = Class464.anIntArray451[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt793 + local410[1] * -anInt794 + local410[2] * -anInt795 + 8192 >> 14;
				local603 = local410[3] * -anInt793 + local410[4] * -anInt794 + local410[5] * -anInt795 + 8192 >> 14;
				local628 = local410[6] * -anInt793 + local410[7] * -anInt794 + local410[8] * -anInt795 + 8192 >> 14;
				local632 = local578 + anInt793;
				@Pc(636) int local636 = local603 + anInt794;
				local640 = local628 + anInt795;
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
								@Pc(979) int local979 = local777[0] * this.anIntArray61[local937] + local777[1] * this.anIntArray62[local937] + local777[2] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray61[local937] + local777[4] * this.anIntArray62[local937] + local777[5] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray61[local937] + local777[7] * this.anIntArray62[local937] + local777[8] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray61[local937] = local1045;
								this.anIntArray62[local937] = local1049;
								this.anIntArray60[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class216 local2452;
			@Pc(2457) Class194 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
									local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray21[local45] = (byte) local53;
									if (this.aClass193_9 != null) {
										this.aClass193_9.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local2452 = this.aClass216Array1[local18];
							local2457 = this.aClass194Array1[local18];
							local2457.anInt3358 = local2457.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local2452.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class194 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3353 += arg2;
									local2686.anInt3356 += arg3;
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
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3354 = local2686.anInt3354 * arg2 >> 7;
									local2686.anInt3355 = local2686.anInt3355 * arg3 >> 7;
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
								local2686 = this.aClass194Array1[local228[local230]];
								local2686.anInt3357 = local2686.anInt3357 + arg2 & 0x3FFF;
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
							if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
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
								if (this.aClass193_9 != null) {
									this.aClass193_9.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local2452 = this.aClass216Array1[local18];
						local2457 = this.aClass194Array1[local18];
						local2457.anInt3358 = local2457.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local2452.anInt3613] & 0xFFFF] & 0xFFFFFF;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
							this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
							this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
			if (aBoolean160) {
				local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
				local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
				local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt793 = local343;
				anInt794 = local365;
				anInt795 = local387;
				aBoolean160 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt793 + 8192 >> 14;
			local426 = local365 * -anInt794 + 8192 >> 14;
			local430 = local387 * -anInt795 + 8192 >> 14;
			local434 = local422 + anInt793;
			local442 = local426 + anInt794;
			local450 = local430 + anInt795;
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
							local789 = local1929[0] * this.anIntArray61[local784] + local1929[1] * this.anIntArray62[local784] + local1929[2] * this.anIntArray60[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray61[local784] + local1929[4] * this.anIntArray62[local784] + local1929[5] * this.anIntArray60[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray61[local784] + local1929[7] * this.anIntArray62[local784] + local1929[8] * this.anIntArray60[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray61[local784] = local2197;
							this.anIntArray62[local784] = local2201;
							this.anIntArray60[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "dv", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray16 == null || (arg6 & this.aShortArray16[local53]) != 0) {
							anInt793 += this.anIntArray61[local53];
							anInt794 += this.anIntArray62[local53];
							anInt795 += this.anIntArray60[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + arg2;
				anInt794 = anInt794 / local18 + arg3;
				anInt795 = anInt795 / local18 + arg4;
				aBoolean160 = true;
			} else {
				anInt793 = arg2;
				anInt794 = arg3;
				anInt795 = arg4;
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
							this.anIntArray61[local45] += arg2;
							this.anIntArray62[local45] += arg3;
							this.anIntArray60[local45] += arg4;
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
								this.anIntArray61[local45] -= anInt793;
								this.anIntArray62[local45] -= anInt794;
								this.anIntArray60[local45] -= anInt795;
								if (arg4 != 0) {
									local53 = Class464.anIntArray451[arg4];
									local343 = Class464.anIntArray452[arg4];
									local365 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = this.anIntArray62[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class464.anIntArray451[arg2];
									local343 = Class464.anIntArray452[arg2];
									local365 = this.anIntArray62[local45] * local343 - this.anIntArray60[local45] * local53 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local343 + 16383 >> 14;
									this.anIntArray62[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class464.anIntArray451[arg3];
									local343 = Class464.anIntArray452[arg3];
									local365 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local343 + 16383 >> 14;
									this.anIntArray60[local45] = this.anIntArray60[local45] * local343 - this.anIntArray61[local45] * local53 + 16383 >> 14;
									this.anIntArray61[local45] = local365;
								}
								this.anIntArray61[local45] += anInt793;
								this.anIntArray62[local45] += anInt794;
								this.anIntArray60[local45] += anInt795;
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
									local53 = this.anIntArray65[local45];
									local343 = this.anIntArray65[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray23[local365] != 0; local365++) {
										local387 = (this.aShortArray23[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class464.anIntArray451[arg4];
											local426 = Class464.anIntArray452[arg4];
											local430 = this.aShortArray25[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray25[local387] = (short) (this.aShortArray25[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class464.anIntArray451[arg2];
											local426 = Class464.anIntArray452[arg2];
											local430 = this.aShortArray25[local387] * local426 - this.aShortArray17[local387] * local422 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray25[local387] * local422 + this.aShortArray17[local387] * local426 + 16383 >> 14);
											this.aShortArray25[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class464.anIntArray451[arg3];
											local426 = Class464.anIntArray452[arg3];
											local430 = this.aShortArray17[local387] * local422 + this.aShortArray24[local387] * local426 + 16383 >> 14;
											this.aShortArray17[local387] = (short) (this.aShortArray17[local387] * local426 - this.aShortArray24[local387] * local422 + 16383 >> 14);
											this.aShortArray24[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass193_10 == null && this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass193_10 != null) {
						this.aClass193_10.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean160) {
					local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
					local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
					local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt793 = local343;
					anInt794 = local365;
					anInt795 = local387;
					aBoolean160 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class464.anIntArray452[arg2];
				local387 = Class464.anIntArray451[arg2];
				local422 = Class464.anIntArray452[arg3];
				local426 = Class464.anIntArray451[arg3];
				local430 = Class464.anIntArray452[arg4];
				local434 = Class464.anIntArray451[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt793 + local410[1] * -anInt794 + local410[2] * -anInt795 + 8192 >> 14;
				local603 = local410[3] * -anInt793 + local410[4] * -anInt794 + local410[5] * -anInt795 + 8192 >> 14;
				local628 = local410[6] * -anInt793 + local410[7] * -anInt794 + local410[8] * -anInt795 + 8192 >> 14;
				local632 = local578 + anInt793;
				@Pc(636) int local636 = local603 + anInt794;
				local640 = local628 + anInt795;
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
								@Pc(979) int local979 = local777[0] * this.anIntArray61[local937] + local777[1] * this.anIntArray62[local937] + local777[2] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray61[local937] + local777[4] * this.anIntArray62[local937] + local777[5] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray61[local937] + local777[7] * this.anIntArray62[local937] + local777[8] * this.anIntArray60[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray61[local937] = local1045;
								this.anIntArray62[local937] = local1049;
								this.anIntArray60[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class216 local2452;
			@Pc(2457) Class194 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local228 = this.anIntArrayArray12[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
									local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray21[local45] = (byte) local53;
									if (this.aClass193_9 != null) {
										this.aClass193_9.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local2452 = this.aClass216Array1[local18];
							local2457 = this.aClass194Array1[local18];
							local2457.anInt3358 = local2457.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local2452.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class194 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local228 = this.anIntArrayArray13[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3353 += arg2;
									local2686.anInt3356 += arg3;
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
									local2686 = this.aClass194Array1[local228[local230]];
									local2686.anInt3354 = local2686.anInt3354 * arg2 >> 7;
									local2686.anInt3355 = local2686.anInt3355 * arg3 >> 7;
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
								local2686 = this.aClass194Array1[local228[local230]];
								local2686.anInt3357 = local2686.anInt3357 + arg2 & 0x3FFF;
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
							if (this.aShortArray22 == null || (arg6 & this.aShortArray22[local45]) != 0) {
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
								if (this.aClass193_9 != null) {
									this.aClass193_9.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local2452 = this.aClass216Array1[local18];
						local2457 = this.aClass194Array1[local18];
						local2457.anInt3358 = local2457.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local2452.anInt3613] & 0xFFFF] & 0xFFFFFF;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
							this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
							this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
			if (aBoolean160) {
				local343 = arg7[0] * anInt793 + arg7[3] * anInt794 + arg7[6] * anInt795 + 8192 >> 14;
				local365 = arg7[1] * anInt793 + arg7[4] * anInt794 + arg7[7] * anInt795 + 8192 >> 14;
				local387 = arg7[2] * anInt793 + arg7[5] * anInt794 + arg7[8] * anInt795 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt793 = local343;
				anInt794 = local365;
				anInt795 = local387;
				aBoolean160 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt793 + 8192 >> 14;
			local426 = local365 * -anInt794 + 8192 >> 14;
			local430 = local387 * -anInt795 + 8192 >> 14;
			local434 = local422 + anInt793;
			local442 = local426 + anInt794;
			local450 = local430 + anInt795;
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
							local789 = local1929[0] * this.anIntArray61[local784] + local1929[1] * this.anIntArray62[local784] + local1929[2] * this.anIntArray60[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray61[local784] + local1929[4] * this.anIntArray62[local784] + local1929[5] * this.anIntArray60[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray61[local784] + local1929[7] * this.anIntArray62[local784] + local1929[8] * this.anIntArray60[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray61[local784] = local2197;
							this.anIntArray62[local784] = local2201;
							this.anIntArray60[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "ar", descriptor = "(IIII)V", line = 2057)
	@Override
	void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local11 = 0; local11 < this.anInt785; local11++) {
				anInt793 += this.anIntArray61[local11];
				anInt794 += this.anIntArray62[local11];
				anInt795 += this.anIntArray60[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt793 = anInt793 / local3 + arg1;
				anInt794 = anInt794 / local3 + arg2;
				anInt795 = anInt795 / local3 + arg3;
			} else {
				anInt793 = arg1;
				anInt794 = arg2;
				anInt795 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt785; local3++) {
				this.anIntArray61[local3] += arg1;
				this.anIntArray62[local3] += arg2;
				this.anIntArray60[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					if (arg3 != 0) {
						local11 = Class464.anIntArray451[arg3];
						local146 = Class464.anIntArray452[arg3];
						local164 = this.anIntArray62[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = this.anIntArray62[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class464.anIntArray451[arg1];
						local146 = Class464.anIntArray452[arg1];
						local164 = this.anIntArray62[local3] * local146 - this.anIntArray60[local3] * local11 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray62[local3] * local11 + this.anIntArray60[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class464.anIntArray451[arg2];
						local146 = Class464.anIntArray452[arg2];
						local164 = this.anIntArray60[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray60[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					this.anIntArray61[local3] = this.anIntArray61[local3] * arg1 / 128;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg2 / 128;
					this.anIntArray60[local3] = this.anIntArray60[local3] * arg3 / 128;
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else {
				@Pc(480) Class216 local480;
				@Pc(485) Class194 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
						local11 = (this.aByteArray21[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray21[local3] = (byte) local11;
					}
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local480.anInt3613] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
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
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local480.anInt3613] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class194 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3353 += arg1;
							local651.anInt3356 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3354 = local651.anInt3354 * arg1 >> 7;
							local651.anInt3355 = local651.anInt3355 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3357 = local651.anInt3357 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "fp", descriptor = "(IIII)V", line = 2057)
	@Override
	void method7012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local11 = 0; local11 < this.anInt785; local11++) {
				anInt793 += this.anIntArray61[local11];
				anInt794 += this.anIntArray62[local11];
				anInt795 += this.anIntArray60[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt793 = anInt793 / local3 + arg1;
				anInt794 = anInt794 / local3 + arg2;
				anInt795 = anInt795 / local3 + arg3;
			} else {
				anInt793 = arg1;
				anInt794 = arg2;
				anInt795 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt785; local3++) {
				this.anIntArray61[local3] += arg1;
				this.anIntArray62[local3] += arg2;
				this.anIntArray60[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					if (arg3 != 0) {
						local11 = Class464.anIntArray451[arg3];
						local146 = Class464.anIntArray452[arg3];
						local164 = this.anIntArray62[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = this.anIntArray62[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class464.anIntArray451[arg1];
						local146 = Class464.anIntArray452[arg1];
						local164 = this.anIntArray62[local3] * local146 - this.anIntArray60[local3] * local11 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray62[local3] * local11 + this.anIntArray60[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class464.anIntArray451[arg2];
						local146 = Class464.anIntArray452[arg2];
						local164 = this.anIntArray60[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray60[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					this.anIntArray61[local3] = this.anIntArray61[local3] * arg1 / 128;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg2 / 128;
					this.anIntArray60[local3] = this.anIntArray60[local3] * arg3 / 128;
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else {
				@Pc(480) Class216 local480;
				@Pc(485) Class194 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
						local11 = (this.aByteArray21[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray21[local3] = (byte) local11;
					}
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local480.anInt3613] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
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
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local480.anInt3613] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class194 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3353 += arg1;
							local651.anInt3356 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3354 = local651.anInt3354 * arg1 >> 7;
							local651.anInt3355 = local651.anInt3355 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3357 = local651.anInt3357 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "fq", descriptor = "(IIII)V", line = 2057)
	@Override
	void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local11 = 0; local11 < this.anInt785; local11++) {
				anInt793 += this.anIntArray61[local11];
				anInt794 += this.anIntArray62[local11];
				anInt795 += this.anIntArray60[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt793 = anInt793 / local3 + arg1;
				anInt794 = anInt794 / local3 + arg2;
				anInt795 = anInt795 / local3 + arg3;
			} else {
				anInt793 = arg1;
				anInt794 = arg2;
				anInt795 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt785; local3++) {
				this.anIntArray61[local3] += arg1;
				this.anIntArray62[local3] += arg2;
				this.anIntArray60[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					if (arg3 != 0) {
						local11 = Class464.anIntArray451[arg3];
						local146 = Class464.anIntArray452[arg3];
						local164 = this.anIntArray62[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = this.anIntArray62[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class464.anIntArray451[arg1];
						local146 = Class464.anIntArray452[arg1];
						local164 = this.anIntArray62[local3] * local146 - this.anIntArray60[local3] * local11 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray62[local3] * local11 + this.anIntArray60[local3] * local146 + 16383 >> 14;
						this.anIntArray62[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class464.anIntArray451[arg2];
						local146 = Class464.anIntArray452[arg2];
						local164 = this.anIntArray60[local3] * local11 + this.anIntArray61[local3] * local146 + 16383 >> 14;
						this.anIntArray60[local3] = this.anIntArray60[local3] * local146 - this.anIntArray61[local3] * local11 + 16383 >> 14;
						this.anIntArray61[local3] = local164;
					}
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt785; local3++) {
					this.anIntArray61[local3] -= anInt793;
					this.anIntArray62[local3] -= anInt794;
					this.anIntArray60[local3] -= anInt795;
					this.anIntArray61[local3] = this.anIntArray61[local3] * arg1 / 128;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg2 / 128;
					this.anIntArray60[local3] = this.anIntArray60[local3] * arg3 / 128;
					this.anIntArray61[local3] += anInt793;
					this.anIntArray62[local3] += anInt794;
					this.anIntArray60[local3] += anInt795;
				}
			} else {
				@Pc(480) Class216 local480;
				@Pc(485) Class194 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
						local11 = (this.aByteArray21[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray21[local3] = (byte) local11;
					}
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local480.anInt3613] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt792; local3++) {
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
					if (this.aClass193_9 != null) {
						this.aClass193_9.anInterface14_6 = null;
					}
					if (this.aClass216Array1 != null) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local480 = this.aClass216Array1[local3];
							local485 = this.aClass194Array1[local3];
							local485.anInt3358 = local485.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local480.anInt3613] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class194 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3353 += arg1;
							local651.anInt3356 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3354 = local651.anInt3354 * arg1 >> 7;
							local651.anInt3355 = local651.anInt3355 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt789; local3++) {
							local651 = this.aClass194Array1[local3];
							local651.anInt3357 = local651.anInt3357 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "cd", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt793 += this.anIntArray61[local53];
						anInt794 += this.anIntArray62[local53];
						anInt795 += this.anIntArray60[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + local8;
				anInt794 = anInt794 / local18 + local12;
				anInt795 = anInt795 / local18 + local16;
			} else {
				anInt793 = local8;
				anInt794 = local12;
				anInt795 = local16;
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
						this.anIntArray61[local45] += local8;
						this.anIntArray62[local45] += local12;
						this.anIntArray60[local45] += local16;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
							local53 = this.anIntArray65[local45];
							local250 = this.anIntArray65[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray23[local268] != 0; local268++) {
								local716 = (this.aShortArray23[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class464.anIntArray451[arg4];
									local726 = Class464.anIntArray452[arg4];
									local744 = this.aShortArray25[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray25[local716] = (short) (this.aShortArray25[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class464.anIntArray451[arg2];
									local726 = Class464.anIntArray452[arg2];
									local744 = this.aShortArray25[local716] * local726 - this.aShortArray17[local716] * local722 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray25[local716] * local722 + this.aShortArray17[local716] * local726 + 16383 >> 14);
									this.aShortArray25[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class464.anIntArray451[arg3];
									local726 = Class464.anIntArray452[arg3];
									local744 = this.aShortArray17[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray17[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass193_10 == null && this.aClass193_9 != null) {
					this.aClass193_9.anInterface14_6 = null;
				}
				if (this.aClass193_10 != null) {
					this.aClass193_10.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray61[local45] -= anInt793;
						this.anIntArray62[local45] -= anInt794;
						this.anIntArray60[local45] -= anInt795;
						this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
						this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
						this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
						this.anIntArray61[local45] += anInt793;
						this.anIntArray62[local45] += anInt794;
						this.anIntArray60[local45] += anInt795;
					}
				}
			}
		} else {
			@Pc(1119) Class216 local1119;
			@Pc(1124) Class194 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray21[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass193_9 != null) {
								this.aClass193_9.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local1119 = this.aClass216Array1[local18];
							local1124 = this.aClass194Array1[local18];
							local1124.anInt3358 = local1124.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local1119.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class194 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3353 += arg2;
									local1345.anInt3356 += arg3;
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
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3354 = local1345.anInt3354 * arg2 >> 7;
									local1345.anInt3355 = local1345.anInt3355 * arg3 >> 7;
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
								local1345 = this.aClass194Array1[local141[local143]];
								local1345.anInt3357 = local1345.anInt3357 + arg2 & 0x3FFF;
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
						if (local141.length > 0 && this.aClass193_9 != null) {
							this.aClass193_9.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local1119 = this.aClass216Array1[local18];
						local1124 = this.aClass194Array1[local18];
						local1124.anInt3358 = local1124.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local1119.anInt3613] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "at", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6889(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt793 += this.anIntArray61[local53];
						anInt794 += this.anIntArray62[local53];
						anInt795 += this.anIntArray60[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + local8;
				anInt794 = anInt794 / local18 + local12;
				anInt795 = anInt795 / local18 + local16;
			} else {
				anInt793 = local8;
				anInt794 = local12;
				anInt795 = local16;
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
						this.anIntArray61[local45] += local8;
						this.anIntArray62[local45] += local12;
						this.anIntArray60[local45] += local16;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
							local53 = this.anIntArray65[local45];
							local250 = this.anIntArray65[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray23[local268] != 0; local268++) {
								local716 = (this.aShortArray23[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class464.anIntArray451[arg4];
									local726 = Class464.anIntArray452[arg4];
									local744 = this.aShortArray25[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray25[local716] = (short) (this.aShortArray25[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class464.anIntArray451[arg2];
									local726 = Class464.anIntArray452[arg2];
									local744 = this.aShortArray25[local716] * local726 - this.aShortArray17[local716] * local722 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray25[local716] * local722 + this.aShortArray17[local716] * local726 + 16383 >> 14);
									this.aShortArray25[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class464.anIntArray451[arg3];
									local726 = Class464.anIntArray452[arg3];
									local744 = this.aShortArray17[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray17[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass193_10 == null && this.aClass193_9 != null) {
					this.aClass193_9.anInterface14_6 = null;
				}
				if (this.aClass193_10 != null) {
					this.aClass193_10.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray61[local45] -= anInt793;
						this.anIntArray62[local45] -= anInt794;
						this.anIntArray60[local45] -= anInt795;
						this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
						this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
						this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
						this.anIntArray61[local45] += anInt793;
						this.anIntArray62[local45] += anInt794;
						this.anIntArray60[local45] += anInt795;
					}
				}
			}
		} else {
			@Pc(1119) Class216 local1119;
			@Pc(1124) Class194 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray21[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass193_9 != null) {
								this.aClass193_9.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local1119 = this.aClass216Array1[local18];
							local1124 = this.aClass194Array1[local18];
							local1124.anInt3358 = local1124.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local1119.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class194 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3353 += arg2;
									local1345.anInt3356 += arg3;
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
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3354 = local1345.anInt3354 * arg2 >> 7;
									local1345.anInt3355 = local1345.anInt3355 * arg3 >> 7;
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
								local1345 = this.aClass194Array1[local141[local143]];
								local1345.anInt3357 = local1345.anInt3357 + arg2 & 0x3FFF;
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
						if (local141.length > 0 && this.aClass193_9 != null) {
							this.aClass193_9.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local1119 = this.aClass216Array1[local18];
						local1124 = this.aClass194Array1[local18];
						local1124.anInt3358 = local1124.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local1119.anInt3613] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "cj", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt793 += this.anIntArray61[local53];
						anInt794 += this.anIntArray62[local53];
						anInt795 += this.anIntArray60[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + local8;
				anInt794 = anInt794 / local18 + local12;
				anInt795 = anInt795 / local18 + local16;
			} else {
				anInt793 = local8;
				anInt794 = local12;
				anInt795 = local16;
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
						this.anIntArray61[local45] += local8;
						this.anIntArray62[local45] += local12;
						this.anIntArray60[local45] += local16;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
							local53 = this.anIntArray65[local45];
							local250 = this.anIntArray65[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray23[local268] != 0; local268++) {
								local716 = (this.aShortArray23[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class464.anIntArray451[arg4];
									local726 = Class464.anIntArray452[arg4];
									local744 = this.aShortArray25[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray25[local716] = (short) (this.aShortArray25[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class464.anIntArray451[arg2];
									local726 = Class464.anIntArray452[arg2];
									local744 = this.aShortArray25[local716] * local726 - this.aShortArray17[local716] * local722 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray25[local716] * local722 + this.aShortArray17[local716] * local726 + 16383 >> 14);
									this.aShortArray25[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class464.anIntArray451[arg3];
									local726 = Class464.anIntArray452[arg3];
									local744 = this.aShortArray17[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray17[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass193_10 == null && this.aClass193_9 != null) {
					this.aClass193_9.anInterface14_6 = null;
				}
				if (this.aClass193_10 != null) {
					this.aClass193_10.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray61[local45] -= anInt793;
						this.anIntArray62[local45] -= anInt794;
						this.anIntArray60[local45] -= anInt795;
						this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
						this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
						this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
						this.anIntArray61[local45] += anInt793;
						this.anIntArray62[local45] += anInt794;
						this.anIntArray60[local45] += anInt795;
					}
				}
			}
		} else {
			@Pc(1119) Class216 local1119;
			@Pc(1124) Class194 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray21[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass193_9 != null) {
								this.aClass193_9.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local1119 = this.aClass216Array1[local18];
							local1124 = this.aClass194Array1[local18];
							local1124.anInt3358 = local1124.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local1119.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class194 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3353 += arg2;
									local1345.anInt3356 += arg3;
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
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3354 = local1345.anInt3354 * arg2 >> 7;
									local1345.anInt3355 = local1345.anInt3355 * arg3 >> 7;
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
								local1345 = this.aClass194Array1[local141[local143]];
								local1345.anInt3357 = local1345.anInt3357 + arg2 & 0x3FFF;
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
						if (local141.length > 0 && this.aClass193_9 != null) {
							this.aClass193_9.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local1119 = this.aClass216Array1[local18];
						local1124 = this.aClass194Array1[local18];
						local1124.anInt3358 = local1124.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local1119.anInt3613] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "dd", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt793 = 0;
			anInt794 = 0;
			anInt795 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt793 += this.anIntArray61[local53];
						anInt794 += this.anIntArray62[local53];
						anInt795 += this.anIntArray60[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt793 = anInt793 / local18 + local8;
				anInt794 = anInt794 / local18 + local12;
				anInt795 = anInt795 / local18 + local16;
			} else {
				anInt793 = local8;
				anInt794 = local12;
				anInt795 = local16;
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
						this.anIntArray61[local45] += local8;
						this.anIntArray62[local45] += local12;
						this.anIntArray60[local45] += local16;
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
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray61[local45] -= anInt793;
							this.anIntArray62[local45] -= anInt794;
							this.anIntArray60[local45] -= anInt795;
							if (arg2 != 0) {
								local53 = Class464.anIntArray451[arg2];
								local250 = Class464.anIntArray452[arg2];
								local268 = this.anIntArray62[local45] * local250 - this.anIntArray60[local45] * local53 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray62[local45] * local53 + this.anIntArray60[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class464.anIntArray451[arg4];
								local250 = Class464.anIntArray452[arg4];
								local268 = this.anIntArray62[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray62[local45] = this.anIntArray62[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class464.anIntArray451[arg3];
								local250 = Class464.anIntArray452[arg3];
								local268 = this.anIntArray60[local45] * local53 + this.anIntArray61[local45] * local250 + 16383 >> 14;
								this.anIntArray60[local45] = this.anIntArray60[local45] * local250 - this.anIntArray61[local45] * local53 + 16383 >> 14;
								this.anIntArray61[local45] = local268;
							}
							this.anIntArray61[local45] += anInt793;
							this.anIntArray62[local45] += anInt794;
							this.anIntArray60[local45] += anInt795;
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
							local53 = this.anIntArray65[local45];
							local250 = this.anIntArray65[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray23[local268] != 0; local268++) {
								local716 = (this.aShortArray23[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class464.anIntArray451[arg4];
									local726 = Class464.anIntArray452[arg4];
									local744 = this.aShortArray25[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray25[local716] = (short) (this.aShortArray25[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class464.anIntArray451[arg2];
									local726 = Class464.anIntArray452[arg2];
									local744 = this.aShortArray25[local716] * local726 - this.aShortArray17[local716] * local722 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray25[local716] * local722 + this.aShortArray17[local716] * local726 + 16383 >> 14);
									this.aShortArray25[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class464.anIntArray451[arg3];
									local726 = Class464.anIntArray452[arg3];
									local744 = this.aShortArray17[local716] * local722 + this.aShortArray24[local716] * local726 + 16383 >> 14;
									this.aShortArray17[local716] = (short) (this.aShortArray17[local716] * local726 - this.aShortArray24[local716] * local722 + 16383 >> 14);
									this.aShortArray24[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass193_10 == null && this.aClass193_9 != null) {
					this.aClass193_9.anInterface14_6 = null;
				}
				if (this.aClass193_10 != null) {
					this.aClass193_10.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray61[local45] -= anInt793;
						this.anIntArray62[local45] -= anInt794;
						this.anIntArray60[local45] -= anInt795;
						this.anIntArray61[local45] = this.anIntArray61[local45] * arg2 >> 7;
						this.anIntArray62[local45] = this.anIntArray62[local45] * arg3 >> 7;
						this.anIntArray60[local45] = this.anIntArray60[local45] * arg4 >> 7;
						this.anIntArray61[local45] += anInt793;
						this.anIntArray62[local45] += anInt794;
						this.anIntArray60[local45] += anInt795;
					}
				}
			}
		} else {
			@Pc(1119) Class216 local1119;
			@Pc(1124) Class194 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray12.length) {
							local141 = this.anIntArrayArray12[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray21[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray21[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass193_9 != null) {
								this.aClass193_9.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass216Array1 != null) {
						for (local18 = 0; local18 < this.anInt789; local18++) {
							local1119 = this.aClass216Array1[local18];
							local1124 = this.aClass194Array1[local18];
							local1124.anInt3358 = local1124.anInt3358 & 0xFFFFFF | 255 - (this.aByteArray21[local1119.anInt3613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class194 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray13.length) {
								local141 = this.anIntArrayArray13[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3353 += arg2;
									local1345.anInt3356 += arg3;
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
									local1345 = this.aClass194Array1[local141[local143]];
									local1345.anInt3354 = local1345.anInt3354 * arg2 >> 7;
									local1345.anInt3355 = local1345.anInt3355 * arg3 >> 7;
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
								local1345 = this.aClass194Array1[local141[local143]];
								local1345.anInt3357 = local1345.anInt3357 + arg2 & 0x3FFF;
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
						if (local141.length > 0 && this.aClass193_9 != null) {
							this.aClass193_9.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass216Array1 != null) {
					for (local18 = 0; local18 < this.anInt789; local18++) {
						local1119 = this.aClass216Array1[local18];
						local1124 = this.aClass194Array1[local18];
						local1124.anInt3358 = local1124.anInt3358 & 0xFF000000 | Class685.anIntArray524[this.aShortArray19[local1119.anInt3613] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "ad", descriptor = "(I[IIIIIZ)V", line = 2498)
	@Override
	void method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "dr", descriptor = "(I[IIIIIZ)V", line = 2498)
	@Override
	void method7022(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "da", descriptor = "(I[IIIIIZ)V", line = 2498)
	@Override
	void method7016(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "dt", descriptor = "(I[IIIIIZ)V", line = 2498)
	@Override
	void method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "au", descriptor = "(I[IIIIZI[I)V", line = 2513)
	@Override
	void method6892(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method6891(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "do", descriptor = "(I[IIIIZI[I)V", line = 2513)
	@Override
	void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method6891(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		anInt793 = local5;
		anInt794 = local9;
		anInt795 = local13;
	}

	@OriginalMember(owner = "client!afk", name = "ck", descriptor = "()V", line = 2528)
	@Override
	void method6947() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt784; local1++) {
			this.anIntArray61[local1] = this.anIntArray61[local1] + 7 >> 4;
			this.anIntArray62[local1] = this.anIntArray62[local1] + 7 >> 4;
			this.anIntArray60[local1] = this.anIntArray60[local1] + 7 >> 4;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "ap", descriptor = "()V", line = 2528)
	@Override
	void method6941() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt784; local1++) {
			this.anIntArray61[local1] = this.anIntArray61[local1] + 7 >> 4;
			this.anIntArray62[local1] = this.anIntArray62[local1] + 7 >> 4;
			this.anIntArray60[local1] = this.anIntArray60[local1] + 7 >> 4;
		}
		if (this.aClass193_7 != null) {
			this.aClass193_7.anInterface14_6 = null;
		}
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!afk", name = "dc", descriptor = "(Lclient!ou;IZ)V", line = 2538)
	@Override
	public void method6958(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub1_26.aClass470_3;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt785; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29436((float) this.anIntArray61[local19], (float) this.anIntArray62[local19], (float) this.anIntArray60[local19], local17);
				this.anIntArray61[local19] = (int) local17[0];
				this.anIntArray62[local19] = (int) local17[1];
				this.anIntArray60[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "dm", descriptor = "(Lclient!ou;IZ)V", line = 2538)
	@Override
	public void method6956(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub1_26.aClass470_3;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt785; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29436((float) this.anIntArray61[local19], (float) this.anIntArray62[local19], (float) this.anIntArray60[local19], local17);
				this.anIntArray61[local19] = (int) local17[0];
				this.anIntArray62[local19] = (int) local17[1];
				this.anIntArray60[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "aq", descriptor = "(Lclient!ou;IZ)V", line = 2538)
	@Override
	public void method6936(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub1_26.aClass470_3;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt785; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29436((float) this.anIntArray61[local19], (float) this.anIntArray62[local19], (float) this.anIntArray60[local19], local17);
				this.anIntArray61[local19] = (int) local17[0];
				this.anIntArray62[local19] = (int) local17[1];
				this.anIntArray60[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "dq", descriptor = "(Lclient!ou;IZ)V", line = 2538)
	@Override
	public void method7015(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray16 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub1_26.aClass470_3;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt785; local19++) {
			if ((arg1 & this.aShortArray16[local19]) != 0) {
				local5.method29436((float) this.anIntArray61[local19], (float) this.anIntArray62[local19], (float) this.anIntArray60[local19], local17);
				this.anIntArray61[local19] = (int) local17[0];
				this.anIntArray62[local19] = (int) local17[1];
				this.anIntArray60[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "fs", descriptor = "()[Lclient!cq;", line = 2555)
	@Override
	public Class210[] method7026() {
		return this.aClass210Array2;
	}

	@OriginalMember(owner = "client!afk", name = "bw", descriptor = "()[Lclient!cq;", line = 2555)
	@Override
	public Class210[] method6931() {
		return this.aClass210Array2;
	}

	@OriginalMember(owner = "client!afk", name = "fu", descriptor = "()[Lclient!cq;", line = 2555)
	@Override
	public Class210[] method6907() {
		return this.aClass210Array2;
	}

	@OriginalMember(owner = "client!afk", name = "bu", descriptor = "()[Lclient!du;", line = 2559)
	@Override
	public Class234[] method6919() {
		return this.aClass234Array2;
	}

	@OriginalMember(owner = "client!afk", name = "fm", descriptor = "()[Lclient!du;", line = 2559)
	@Override
	public Class234[] method7000() {
		return this.aClass234Array2;
	}

	@OriginalMember(owner = "client!afk", name = "by", descriptor = "(Lclient!ou;)V", line = 2563)
	@Override
	public void method6873(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_26.aClass489_6;
		local3.method29865(arg0);
		@Pc(11) int local11;
		if (this.aClass234Array2 != null) {
			for (local11 = 0; local11 < this.aClass234Array2.length; local11++) {
				@Pc(21) Class234 local21 = this.aClass234Array2[local11];
				@Pc(23) Class234 local23 = local21;
				if (local21.aClass234_1 != null) {
					local23 = local21.aClass234_1;
				}
				local23.anInt3761 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * 1536764047;
				local23.anInt3764 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * 1518758355;
				local23.anInt3762 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * -873285623;
				local23.anInt3763 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1833259983;
				local23.anInt3760 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1849179427;
				local23.anInt3765 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1334315853;
				local23.anInt3756 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * -853774881;
				local23.anInt3757 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * 2064201403;
				local23.anInt3768 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * -1604068053;
			}
		}
		if (this.aClass210Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass210Array2.length; local11++) {
			@Pc(505) Class210 local505 = this.aClass210Array2[local11];
			@Pc(507) Class210 local507 = local505;
			if (local505.aClass210_2 != null) {
				local507 = local505.aClass210_2;
			}
			if (local505.aClass489_96 == null) {
				local505.aClass489_96 = new Class489(local3);
			} else {
				local505.aClass489_96.method29852(local3);
			}
			local507.anInt3593 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[4] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[8] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * -2039435649;
			local507.anInt3596 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[5] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[9] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * 272047193;
			local507.anInt3594 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[6] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[10] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * 266457411;
		}
	}

	@OriginalMember(owner = "client!afk", name = "dn", descriptor = "(Lclient!ou;)V", line = 2563)
	@Override
	public void method7019(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_26.aClass489_6;
		local3.method29865(arg0);
		@Pc(11) int local11;
		if (this.aClass234Array2 != null) {
			for (local11 = 0; local11 < this.aClass234Array2.length; local11++) {
				@Pc(21) Class234 local21 = this.aClass234Array2[local11];
				@Pc(23) Class234 local23 = local21;
				if (local21.aClass234_1 != null) {
					local23 = local21.aClass234_1;
				}
				local23.anInt3761 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * 1536764047;
				local23.anInt3764 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * 1518758355;
				local23.anInt3762 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3766 * 991816887] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3766 * 991816887] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3766 * 991816887]) * -873285623;
				local23.anInt3763 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1833259983;
				local23.anInt3760 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1849179427;
				local23.anInt3765 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3758 * -919024457] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3758 * -919024457] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3758 * -919024457]) * -1334315853;
				local23.anInt3756 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[4] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[8] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * -853774881;
				local23.anInt3757 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[5] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[9] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * 2064201403;
				local23.anInt3768 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local21.anInt3759 * -120672125] + local3.aFloatArray116[6] * (float) this.anIntArray62[local21.anInt3759 * -120672125] + local3.aFloatArray116[10] * (float) this.anIntArray60[local21.anInt3759 * -120672125]) * -1604068053;
			}
		}
		if (this.aClass210Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass210Array2.length; local11++) {
			@Pc(505) Class210 local505 = this.aClass210Array2[local11];
			@Pc(507) Class210 local507 = local505;
			if (local505.aClass210_2 != null) {
				local507 = local505.aClass210_2;
			}
			if (local505.aClass489_96 == null) {
				local505.aClass489_96 = new Class489(local3);
			} else {
				local505.aClass489_96.method29852(local3);
			}
			local507.anInt3593 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[4] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[8] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * -2039435649;
			local507.anInt3596 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[5] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[9] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * 272047193;
			local507.anInt3594 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray61[local505.anInt3592 * -1737517975] + local3.aFloatArray116[6] * (float) this.anIntArray62[local505.anInt3592 * -1737517975] + local3.aFloatArray116[10] * (float) this.anIntArray60[local505.anInt3592 * -1737517975]) * 266457411;
		}
	}

	@OriginalMember(owner = "client!afk", name = "av", descriptor = "(IILclient!ou;ZI)Z", line = 2596)
	@Override
	public boolean method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_26.aClass489_6;
		local3.method29865(arg2);
		local3.method29862(this.aClass104_Sub1_26.aClass489_9);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(34) int local34 = this.aShort59 - this.aShort62 >> 1;
		@Pc(42) int local42 = this.aShort63 - this.aShort60 >> 1;
		@Pc(50) int local50 = this.aShort64 - this.aShort61 >> 1;
		@Pc(55) int local55 = this.aShort62 + local34;
		@Pc(60) int local60 = this.aShort60 + local42;
		@Pc(65) int local65 = this.aShort61 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray66[0] = local71;
		anIntArray63[0] = local77;
		anIntArray67[0] = local83;
		anIntArray66[1] = local89;
		anIntArray63[1] = local77;
		anIntArray67[1] = local83;
		anIntArray66[2] = local71;
		anIntArray63[2] = local95;
		anIntArray67[2] = local83;
		anIntArray66[3] = local89;
		anIntArray63[3] = local95;
		anIntArray67[3] = local83;
		anIntArray66[4] = local71;
		anIntArray63[4] = local77;
		anIntArray67[4] = local101;
		anIntArray66[5] = local89;
		anIntArray63[5] = local77;
		anIntArray67[5] = local101;
		anIntArray66[6] = local71;
		anIntArray63[6] = local95;
		anIntArray67[6] = local101;
		anIntArray66[7] = local89;
		anIntArray63[7] = local95;
		anIntArray67[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray66[local199];
			local210 = anIntArray63[local199];
			local214 = anIntArray67[local199];
			local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
			local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
				local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
				@Pc(348) int local348 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
				local361 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
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
			if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
				this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
				this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
			}
			@Pc(426) int[] local426 = this.aClass104_Sub1_26.anIntArray40;
			@Pc(430) int[] local430 = this.aClass104_Sub1_26.anIntArray39;
			for (local361 = 0; local361 < this.anInt785; local361++) {
				local206 = this.anIntArray61[local361];
				local210 = this.anIntArray62[local361];
				local214 = this.anIntArray60[local361];
				local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
				local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
					local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
						local430[local604] = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt792; local361++) {
				if (local426[this.aShortArray21[local361] & 0xFFFF] != -999999 && local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray18[local361] & 0xFFFF] != -999999 && this.method6607(arg0, arg1, local430[this.aShortArray21[local361] & 0xFFFF], local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray18[local361] & 0xFFFF], local426[this.aShortArray21[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray18[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afk", name = "di", descriptor = "(IILclient!ou;ZI)Z", line = 2596)
	@Override
	public boolean method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_26.aClass489_6;
		local3.method29865(arg2);
		local3.method29862(this.aClass104_Sub1_26.aClass489_9);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(34) int local34 = this.aShort59 - this.aShort62 >> 1;
		@Pc(42) int local42 = this.aShort63 - this.aShort60 >> 1;
		@Pc(50) int local50 = this.aShort64 - this.aShort61 >> 1;
		@Pc(55) int local55 = this.aShort62 + local34;
		@Pc(60) int local60 = this.aShort60 + local42;
		@Pc(65) int local65 = this.aShort61 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray66[0] = local71;
		anIntArray63[0] = local77;
		anIntArray67[0] = local83;
		anIntArray66[1] = local89;
		anIntArray63[1] = local77;
		anIntArray67[1] = local83;
		anIntArray66[2] = local71;
		anIntArray63[2] = local95;
		anIntArray67[2] = local83;
		anIntArray66[3] = local89;
		anIntArray63[3] = local95;
		anIntArray67[3] = local83;
		anIntArray66[4] = local71;
		anIntArray63[4] = local77;
		anIntArray67[4] = local101;
		anIntArray66[5] = local89;
		anIntArray63[5] = local77;
		anIntArray67[5] = local101;
		anIntArray66[6] = local71;
		anIntArray63[6] = local95;
		anIntArray67[6] = local101;
		anIntArray66[7] = local89;
		anIntArray63[7] = local95;
		anIntArray67[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray66[local199];
			local210 = anIntArray63[local199];
			local214 = anIntArray67[local199];
			local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
			local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
				local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
				@Pc(348) int local348 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
				local361 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
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
			if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
				this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
				this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
			}
			@Pc(426) int[] local426 = this.aClass104_Sub1_26.anIntArray40;
			@Pc(430) int[] local430 = this.aClass104_Sub1_26.anIntArray39;
			for (local361 = 0; local361 < this.anInt785; local361++) {
				local206 = this.anIntArray61[local361];
				local210 = this.anIntArray62[local361];
				local214 = this.anIntArray60[local361];
				local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
				local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
					local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
						local430[local604] = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt792; local361++) {
				if (local426[this.aShortArray21[local361] & 0xFFFF] != -999999 && local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray18[local361] & 0xFFFF] != -999999 && this.method6607(arg0, arg1, local430[this.aShortArray21[local361] & 0xFFFF], local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray18[local361] & 0xFFFF], local426[this.aShortArray21[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray18[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afk", name = "dk", descriptor = "(IILclient!ou;ZI)Z", line = 2596)
	@Override
	public boolean method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_26.aClass489_6;
		local3.method29865(arg2);
		local3.method29862(this.aClass104_Sub1_26.aClass489_9);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(34) int local34 = this.aShort59 - this.aShort62 >> 1;
		@Pc(42) int local42 = this.aShort63 - this.aShort60 >> 1;
		@Pc(50) int local50 = this.aShort64 - this.aShort61 >> 1;
		@Pc(55) int local55 = this.aShort62 + local34;
		@Pc(60) int local60 = this.aShort60 + local42;
		@Pc(65) int local65 = this.aShort61 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray66[0] = local71;
		anIntArray63[0] = local77;
		anIntArray67[0] = local83;
		anIntArray66[1] = local89;
		anIntArray63[1] = local77;
		anIntArray67[1] = local83;
		anIntArray66[2] = local71;
		anIntArray63[2] = local95;
		anIntArray67[2] = local83;
		anIntArray66[3] = local89;
		anIntArray63[3] = local95;
		anIntArray67[3] = local83;
		anIntArray66[4] = local71;
		anIntArray63[4] = local77;
		anIntArray67[4] = local101;
		anIntArray66[5] = local89;
		anIntArray63[5] = local77;
		anIntArray67[5] = local101;
		anIntArray66[6] = local71;
		anIntArray63[6] = local95;
		anIntArray67[6] = local101;
		anIntArray66[7] = local89;
		anIntArray63[7] = local95;
		anIntArray67[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray66[local199];
			local210 = anIntArray63[local199];
			local214 = anIntArray67[local199];
			local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
			local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
				local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
				@Pc(348) int local348 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
				local361 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
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
			if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
				this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
				this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
			}
			@Pc(426) int[] local426 = this.aClass104_Sub1_26.anIntArray40;
			@Pc(430) int[] local430 = this.aClass104_Sub1_26.anIntArray39;
			for (local361 = 0; local361 < this.anInt785; local361++) {
				local206 = this.anIntArray61[local361];
				local210 = this.anIntArray62[local361];
				local214 = this.anIntArray60[local361];
				local243 = local3.aFloatArray116[2] * (float) local206 + local3.aFloatArray116[6] * (float) local210 + local3.aFloatArray116[10] * (float) local214 + local3.aFloatArray116[14];
				local272 = local3.aFloatArray116[3] * (float) local206 + local3.aFloatArray116[7] * (float) local210 + local3.aFloatArray116[11] * (float) local214 + local3.aFloatArray116[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray116[0] * (float) local206 + local3.aFloatArray116[4] * (float) local210 + local3.aFloatArray116[8] * (float) local214 + local3.aFloatArray116[12];
					local335 = local3.aFloatArray116[1] * (float) local206 + local3.aFloatArray116[5] * (float) local210 + local3.aFloatArray116[9] * (float) local214 + local3.aFloatArray116[13];
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local306 / local272);
						local430[local604] = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray65[local361];
					local584 = this.anIntArray65[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray23[local586] != 0; local586++) {
						local604 = (this.aShortArray23[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt792; local361++) {
				if (local426[this.aShortArray21[local361] & 0xFFFF] != -999999 && local426[this.aShortArray20[local361] & 0xFFFF] != -999999 && local426[this.aShortArray18[local361] & 0xFFFF] != -999999 && this.method6607(arg0, arg1, local430[this.aShortArray21[local361] & 0xFFFF], local430[this.aShortArray20[local361] & 0xFFFF], local430[this.aShortArray18[local361] & 0xFFFF], local426[this.aShortArray21[local361] & 0xFFFF], local426[this.aShortArray20[local361] & 0xFFFF], local426[this.aShortArray18[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afk", name = "hs", descriptor = "(IIIIIIII)Z", line = 2711)
	boolean method6607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!afk", name = "it", descriptor = "(IIIIIIII)Z", line = 2711)
	boolean method6608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!afk", name = "ao", descriptor = "(Lclient!ara;)Lclient!ara;", line = 2719)
	@Override
	public Class93_Sub1_Sub4 method6898(@OriginalArg(0) Class93_Sub1_Sub4 arg0) {
		if (this.anInt788 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass104_Sub1_26.anInt545 > 0) {
			local29 = this.aShort62 - (this.aShort63 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local45 = this.aShort59 - (this.aShort60 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
		} else {
			local29 = this.aShort62 - (this.aShort60 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local45 = this.aShort59 - (this.aShort63 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass104_Sub1_26.anInt561 > 0) {
			local98 = this.aShort61 - (this.aShort63 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local114 = this.aShort64 - (this.aShort60 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
		} else {
			local98 = this.aShort61 - (this.aShort60 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local114 = this.aShort64 - (this.aShort63 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class93_Sub1_Sub4_Sub2 local162 = (Class93_Sub1_Sub4_Sub2) arg0;
		@Pc(171) Class93_Sub1_Sub4_Sub2 local171;
		if (local162 != null && local162.method23521(local153, local159)) {
			local171 = local162;
			local162.method23523();
		} else {
			local171 = new Class93_Sub1_Sub4_Sub2(this.aClass104_Sub1_26, local153, local159);
		}
		local171.method23518(local29, local98, local45, local114);
		this.method6610(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afk", name = "df", descriptor = "(Lclient!ara;)Lclient!ara;", line = 2719)
	@Override
	public Class93_Sub1_Sub4 method6962(@OriginalArg(0) Class93_Sub1_Sub4 arg0) {
		if (this.anInt788 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass104_Sub1_26.anInt545 > 0) {
			local29 = this.aShort62 - (this.aShort63 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local45 = this.aShort59 - (this.aShort60 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
		} else {
			local29 = this.aShort62 - (this.aShort60 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local45 = this.aShort59 - (this.aShort63 * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass104_Sub1_26.anInt561 > 0) {
			local98 = this.aShort61 - (this.aShort63 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local114 = this.aShort64 - (this.aShort60 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
		} else {
			local98 = this.aShort61 - (this.aShort60 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
			local114 = this.aShort64 - (this.aShort63 * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class93_Sub1_Sub4_Sub2 local162 = (Class93_Sub1_Sub4_Sub2) arg0;
		@Pc(171) Class93_Sub1_Sub4_Sub2 local171;
		if (local162 != null && local162.method23521(local153, local159)) {
			local171 = local162;
			local162.method23523();
		} else {
			local171 = new Class93_Sub1_Sub4_Sub2(this.aClass104_Sub1_26, local153, local159);
		}
		local171.method23518(local29, local98, local45, local114);
		this.method6610(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afk", name = "is", descriptor = "(Lclient!atk;)V", line = 2756)
	void method6609(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0) {
		if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
			this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
			this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
		}
		@Pc(22) int[] local22 = this.aClass104_Sub1_26.anIntArray40;
		@Pc(26) int[] local26 = this.aClass104_Sub1_26.anIntArray39;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt785; local28++) {
			local55 = (this.anIntArray61[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3212;
			local78 = (this.anIntArray60[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3209;
			local83 = this.anIntArray65[local28];
			local90 = this.anIntArray65[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray23[local92] != 0; local92++) {
				local110 = (this.aShortArray23[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt787; local28++) {
			if (this.aByteArray21 == null || this.aByteArray21[local28] <= 128) {
				local55 = this.aShortArray21[local28] & 0xFFFF;
				local78 = this.aShortArray20[local28] & 0xFFFF;
				local83 = this.aShortArray18[local28] & 0xFFFF;
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

	@OriginalMember(owner = "client!afk", name = "hh", descriptor = "(Lclient!atk;)V", line = 2756)
	void method6610(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0) {
		if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
			this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
			this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
		}
		@Pc(22) int[] local22 = this.aClass104_Sub1_26.anIntArray40;
		@Pc(26) int[] local26 = this.aClass104_Sub1_26.anIntArray39;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt785; local28++) {
			local55 = (this.anIntArray61[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3212;
			local78 = (this.anIntArray60[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3209;
			local83 = this.anIntArray65[local28];
			local90 = this.anIntArray65[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray23[local92] != 0; local92++) {
				local110 = (this.aShortArray23[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt787; local28++) {
			if (this.aByteArray21 == null || this.aByteArray21[local28] <= 128) {
				local55 = this.aShortArray21[local28] & 0xFFFF;
				local78 = this.aShortArray20[local28] & 0xFFFF;
				local83 = this.aShortArray18[local28] & 0xFFFF;
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

	@OriginalMember(owner = "client!afk", name = "ix", descriptor = "(Lclient!atk;)V", line = 2756)
	void method6611(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0) {
		if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
			this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
			this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
		}
		@Pc(22) int[] local22 = this.aClass104_Sub1_26.anIntArray40;
		@Pc(26) int[] local26 = this.aClass104_Sub1_26.anIntArray39;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt785; local28++) {
			local55 = (this.anIntArray61[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3212;
			local78 = (this.anIntArray60[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3209;
			local83 = this.anIntArray65[local28];
			local90 = this.anIntArray65[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray23[local92] != 0; local92++) {
				local110 = (this.aShortArray23[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt787; local28++) {
			if (this.aByteArray21 == null || this.aByteArray21[local28] <= 128) {
				local55 = this.aShortArray21[local28] & 0xFFFF;
				local78 = this.aShortArray20[local28] & 0xFFFF;
				local83 = this.aShortArray18[local28] & 0xFFFF;
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

	@OriginalMember(owner = "client!afk", name = "ib", descriptor = "(Lclient!atk;)V", line = 2756)
	void method6612(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0) {
		if (this.aClass104_Sub1_26.anIntArray40.length < this.anInt788) {
			this.aClass104_Sub1_26.anIntArray40 = new int[this.anInt788];
			this.aClass104_Sub1_26.anIntArray39 = new int[this.anInt788];
		}
		@Pc(22) int[] local22 = this.aClass104_Sub1_26.anIntArray40;
		@Pc(26) int[] local26 = this.aClass104_Sub1_26.anIntArray39;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt785; local28++) {
			local55 = (this.anIntArray61[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt545 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3212;
			local78 = (this.anIntArray60[local28] - (this.anIntArray62[local28] * this.aClass104_Sub1_26.anInt561 >> 8) >> this.aClass104_Sub1_26.anInt532) - arg0.anInt3209;
			local83 = this.anIntArray65[local28];
			local90 = this.anIntArray65[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray23[local92] != 0; local92++) {
				local110 = (this.aShortArray23[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt787; local28++) {
			if (this.aByteArray21 == null || this.aByteArray21[local28] <= 128) {
				local55 = this.aShortArray21[local28] & 0xFFFF;
				local78 = this.aShortArray20[local28] & 0xFFFF;
				local83 = this.aShortArray18[local28] & 0xFFFF;
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

	@OriginalMember(owner = "client!afk", name = "ax", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2792)
	@Override
	public void method6976(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt788 == 0) {
			return;
		}
		@Pc(14) Class489 local14 = this.aClass104_Sub1_26.aClass489_8;
		@Pc(18) Class489 local18 = this.aClass104_Sub1_26.aClass489_6;
		@Pc(22) Class489 local22 = this.aClass104_Sub1_26.aClass489_7;
		local18.method29865(arg0);
		local22.method29852(local18);
		local22.method29862(this.aClass104_Sub1_26.aClass489_9);
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(42) float[] local42 = this.aClass104_Sub1_26.aFloatArray8;
		local18.method29881(0.0F, (float) this.aShort60, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method29881(0.0F, (float) this.aShort63, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass104_Sub1_26.aFloatArrayArray7[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt791;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt791;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort62 + this.aShort59 >> 1;
			@Pc(178) int local178 = this.aShort61 + this.aShort64 >> 1;
			@Pc(183) short local183 = this.aShort60;
			@Pc(214) float local214 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(243) float local243 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			local119 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			local145 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local119 >= -local145) {
				arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local214 / local145);
				arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort63;
			@Pc(373) float local373 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(402) float local402 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			@Pc(431) float local431 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			@Pc(460) float local460 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local431 >= -local460) {
				arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local373 / local460);
				arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local402 / local460);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local145 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3829 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local460 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3828 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub1_26.method3870();
		this.aClass104_Sub1_26.method3791(local18);
		this.method6613();
		this.aClass104_Sub1_26.method3795();
		local18.method29862(this.aClass104_Sub1_26.aClass489_3);
		this.method6615(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afk", name = "ff", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2792)
	@Override
	public void method7014(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt788 == 0) {
			return;
		}
		@Pc(14) Class489 local14 = this.aClass104_Sub1_26.aClass489_8;
		@Pc(18) Class489 local18 = this.aClass104_Sub1_26.aClass489_6;
		@Pc(22) Class489 local22 = this.aClass104_Sub1_26.aClass489_7;
		local18.method29865(arg0);
		local22.method29852(local18);
		local22.method29862(this.aClass104_Sub1_26.aClass489_9);
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(42) float[] local42 = this.aClass104_Sub1_26.aFloatArray8;
		local18.method29881(0.0F, (float) this.aShort60, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method29881(0.0F, (float) this.aShort63, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass104_Sub1_26.aFloatArrayArray7[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt791;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt791;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort62 + this.aShort59 >> 1;
			@Pc(178) int local178 = this.aShort61 + this.aShort64 >> 1;
			@Pc(183) short local183 = this.aShort60;
			@Pc(214) float local214 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(243) float local243 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			local119 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			local145 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local119 >= -local145) {
				arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local214 / local145);
				arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort63;
			@Pc(373) float local373 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(402) float local402 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			@Pc(431) float local431 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			@Pc(460) float local460 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local431 >= -local460) {
				arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local373 / local460);
				arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local402 / local460);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local145 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3829 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local460 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3828 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub1_26.method3870();
		this.aClass104_Sub1_26.method3791(local18);
		this.method6613();
		this.aClass104_Sub1_26.method3795();
		local18.method29862(this.aClass104_Sub1_26.aClass489_3);
		this.method6615(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afk", name = "fl", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2792)
	@Override
	public void method7005(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt788 == 0) {
			return;
		}
		@Pc(14) Class489 local14 = this.aClass104_Sub1_26.aClass489_8;
		@Pc(18) Class489 local18 = this.aClass104_Sub1_26.aClass489_6;
		@Pc(22) Class489 local22 = this.aClass104_Sub1_26.aClass489_7;
		local18.method29865(arg0);
		local22.method29852(local18);
		local22.method29862(this.aClass104_Sub1_26.aClass489_9);
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(42) float[] local42 = this.aClass104_Sub1_26.aFloatArray8;
		local18.method29881(0.0F, (float) this.aShort60, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method29881(0.0F, (float) this.aShort63, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass104_Sub1_26.aFloatArrayArray7[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt791;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt791;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort62 + this.aShort59 >> 1;
			@Pc(178) int local178 = this.aShort61 + this.aShort64 >> 1;
			@Pc(183) short local183 = this.aShort60;
			@Pc(214) float local214 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(243) float local243 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			local119 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			local145 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local119 >= -local145) {
				arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local214 / local145);
				arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort63;
			@Pc(373) float local373 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(402) float local402 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			@Pc(431) float local431 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			@Pc(460) float local460 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local431 >= -local460) {
				arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local373 / local460);
				arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local402 / local460);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local145 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3829 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local460 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3828 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub1_26.method3870();
		this.aClass104_Sub1_26.method3791(local18);
		this.method6613();
		this.aClass104_Sub1_26.method3795();
		local18.method29862(this.aClass104_Sub1_26.aClass489_3);
		this.method6615(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afk", name = "fb", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2792)
	@Override
	public void method6876(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt788 == 0) {
			return;
		}
		@Pc(14) Class489 local14 = this.aClass104_Sub1_26.aClass489_8;
		@Pc(18) Class489 local18 = this.aClass104_Sub1_26.aClass489_6;
		@Pc(22) Class489 local22 = this.aClass104_Sub1_26.aClass489_7;
		local18.method29865(arg0);
		local22.method29852(local18);
		local22.method29862(this.aClass104_Sub1_26.aClass489_9);
		if (!this.aBoolean158) {
			this.method6603();
		}
		@Pc(42) float[] local42 = this.aClass104_Sub1_26.aFloatArray8;
		local18.method29881(0.0F, (float) this.aShort60, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method29881(0.0F, (float) this.aShort63, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass104_Sub1_26.aFloatArrayArray7[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt791;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt791;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort62 + this.aShort59 >> 1;
			@Pc(178) int local178 = this.aShort61 + this.aShort64 >> 1;
			@Pc(183) short local183 = this.aShort60;
			@Pc(214) float local214 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(243) float local243 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			local119 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			local145 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local119 >= -local145) {
				arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local214 / local145);
				arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort63;
			@Pc(373) float local373 = local22.aFloatArray116[0] * (float) local170 + local22.aFloatArray116[4] * (float) local183 + local22.aFloatArray116[8] * (float) local178 + local22.aFloatArray116[12];
			@Pc(402) float local402 = local22.aFloatArray116[1] * (float) local170 + local22.aFloatArray116[5] * (float) local183 + local22.aFloatArray116[9] * (float) local178 + local22.aFloatArray116[13];
			@Pc(431) float local431 = local22.aFloatArray116[2] * (float) local170 + local22.aFloatArray116[6] * (float) local183 + local22.aFloatArray116[10] * (float) local178 + local22.aFloatArray116[14];
			@Pc(460) float local460 = local22.aFloatArray116[3] * (float) local170 + local22.aFloatArray116[7] * (float) local183 + local22.aFloatArray116[11] * (float) local178 + local22.aFloatArray116[15];
			if (local431 >= -local460) {
				arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local373 / local460);
				arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local402 / local460);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3830 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3828 = (int) (this.aClass104_Sub1_26.aFloat35 + this.aClass104_Sub1_26.aFloat33 * local534 / local550);
						arg1.anInt3831 = (int) (this.aClass104_Sub1_26.aFloat36 + this.aClass104_Sub1_26.aFloat34 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local145 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3829 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray116[0] * (float) this.anInt791 + local14.aFloatArray116[12];
					local534 = local460 + local14.aFloatArray116[3] * (float) this.anInt791 + local14.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub1_26.aFloat35 - (float) arg1.anInt3828 + this.aClass104_Sub1_26.aFloat33 * local526 / local534);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub1_26.method3870();
		this.aClass104_Sub1_26.method3791(local18);
		this.method6613();
		this.aClass104_Sub1_26.method3795();
		local18.method29862(this.aClass104_Sub1_26.aClass489_3);
		this.method6615(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!afk", name = "hp", descriptor = "()V", line = 2895)
	void method6613() {
		if (this.anInt787 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6620(true);
		}
		this.method6620(false);
		if (this.aClass178_1 != null) {
			if (this.aClass178_1.anInterface16_4 == null) {
				this.method6619((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass178_1.anInterface16_4 != null) {
				this.aClass104_Sub1_26.method3921(this.aClass193_10 != null);
				this.aClass104_Sub1_26.method3855(this.aClass193_7, this.aClass193_10, this.aClass193_9, this.aClass193_8);
				@Pc(59) int local59 = this.anIntArray64.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray64[local61];
					@Pc(76) int local76 = this.anIntArray64[local61 + 1];
					@Pc(91) int local91 = this.aShortArray26[local69] == -1 ? -1 : this.aShortArray26[local69] & 0xFFFF;
					this.aClass104_Sub1_26.method3876(local91, this.aClass193_10 != null);
					this.aClass104_Sub1_26.method3862(this.aClass178_1.anInterface16_4, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "il", descriptor = "()V", line = 2895)
	void method6614() {
		if (this.anInt787 == 0) {
			return;
		}
		if (this.aByte4 != 0) {
			this.method6620(true);
		}
		this.method6620(false);
		if (this.aClass178_1 != null) {
			if (this.aClass178_1.anInterface16_4 == null) {
				this.method6619((this.aByte4 & 0x10) != 0);
			}
			if (this.aClass178_1.anInterface16_4 != null) {
				this.aClass104_Sub1_26.method3921(this.aClass193_10 != null);
				this.aClass104_Sub1_26.method3855(this.aClass193_7, this.aClass193_10, this.aClass193_9, this.aClass193_8);
				@Pc(59) int local59 = this.anIntArray64.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray64[local61];
					@Pc(76) int local76 = this.anIntArray64[local61 + 1];
					@Pc(91) int local91 = this.aShortArray26[local69] == -1 ? -1 : this.aShortArray26[local69] & 0xFFFF;
					this.aClass104_Sub1_26.method3876(local91, this.aClass193_10 != null);
					this.aClass104_Sub1_26.method3862(this.aClass178_1.anInterface16_4, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method6599();
	}

	@OriginalMember(owner = "client!afk", name = "hy", descriptor = "(Lclient!pq;)V", line = 2917)
	void method6615(@OriginalArg(0) Class489 arg0) {
		if (this.aClass216Array1 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub1_26.aClass489_1;
		this.aClass104_Sub1_26.method3787();
		this.aClass104_Sub1_26.method20603(!this.aBoolean155);
		this.aClass104_Sub1_26.method3921(false);
		this.aClass104_Sub1_26.method3855(this.aClass104_Sub1_26.aClass193_5, null, null, this.aClass104_Sub1_26.aClass193_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt789; local35++) {
			@Pc(44) Class216 local44 = this.aClass216Array1[local35];
			@Pc(49) Class194 local49 = this.aClass194Array1[local35];
			if (!local44.aBoolean645 || !this.aClass104_Sub1_26.method20622()) {
				@Pc(78) float local78 = (float) (this.anIntArray61[local44.anInt3616] + this.anIntArray61[local44.anInt3614] + this.anIntArray61[local44.anInt3615]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray62[local44.anInt3616] + this.anIntArray62[local44.anInt3614] + this.anIntArray62[local44.anInt3615]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray60[local44.anInt3616] + this.anIntArray60[local44.anInt3614] + this.anIntArray60[local44.anInt3615]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray116[0] * local78 + arg0.aFloatArray116[4] * local99 + arg0.aFloatArray116[8] * local120 + arg0.aFloatArray116[12];
				@Pc(172) float local172 = arg0.aFloatArray116[1] * local78 + arg0.aFloatArray116[5] * local99 + arg0.aFloatArray116[9] * local120 + arg0.aFloatArray116[13];
				@Pc(198) float local198 = arg0.aFloatArray116[2] * local78 + arg0.aFloatArray116[6] * local99 + arg0.aFloatArray116[10] * local120 + arg0.aFloatArray116[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3617;
				local6.method29961(local49.anInt3357, local49.anInt3354 * local44.aShort159 >> 7, local49.anInt3355 * local44.aShort158 >> 7, local146 + (float) local49.anInt3353 - local146 * local219, local172 + (float) local49.anInt3356 - local172 * local219, local198 - local198 * local219);
				this.aClass104_Sub1_26.method3794(local6);
				@Pc(267) int local267 = local49.anInt3358;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass104_Sub1_26.method3873(local44.aShort157);
				this.aClass104_Sub1_26.method3938(local44.aByte109);
				this.aClass104_Sub1_26.method3859(7, 0, 4);
			}
		}
		this.aClass104_Sub1_26.method20603(true);
		this.aClass104_Sub1_26.method3795();
	}

	@OriginalMember(owner = "client!afk", name = "iw", descriptor = "(Lclient!pq;)V", line = 2917)
	void method6616(@OriginalArg(0) Class489 arg0) {
		if (this.aClass216Array1 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub1_26.aClass489_1;
		this.aClass104_Sub1_26.method3787();
		this.aClass104_Sub1_26.method20603(!this.aBoolean155);
		this.aClass104_Sub1_26.method3921(false);
		this.aClass104_Sub1_26.method3855(this.aClass104_Sub1_26.aClass193_5, null, null, this.aClass104_Sub1_26.aClass193_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt789; local35++) {
			@Pc(44) Class216 local44 = this.aClass216Array1[local35];
			@Pc(49) Class194 local49 = this.aClass194Array1[local35];
			if (!local44.aBoolean645 || !this.aClass104_Sub1_26.method20622()) {
				@Pc(78) float local78 = (float) (this.anIntArray61[local44.anInt3616] + this.anIntArray61[local44.anInt3614] + this.anIntArray61[local44.anInt3615]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray62[local44.anInt3616] + this.anIntArray62[local44.anInt3614] + this.anIntArray62[local44.anInt3615]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray60[local44.anInt3616] + this.anIntArray60[local44.anInt3614] + this.anIntArray60[local44.anInt3615]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray116[0] * local78 + arg0.aFloatArray116[4] * local99 + arg0.aFloatArray116[8] * local120 + arg0.aFloatArray116[12];
				@Pc(172) float local172 = arg0.aFloatArray116[1] * local78 + arg0.aFloatArray116[5] * local99 + arg0.aFloatArray116[9] * local120 + arg0.aFloatArray116[13];
				@Pc(198) float local198 = arg0.aFloatArray116[2] * local78 + arg0.aFloatArray116[6] * local99 + arg0.aFloatArray116[10] * local120 + arg0.aFloatArray116[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3617;
				local6.method29961(local49.anInt3357, local49.anInt3354 * local44.aShort159 >> 7, local49.anInt3355 * local44.aShort158 >> 7, local146 + (float) local49.anInt3353 - local146 * local219, local172 + (float) local49.anInt3356 - local172 * local219, local198 - local198 * local219);
				this.aClass104_Sub1_26.method3794(local6);
				@Pc(267) int local267 = local49.anInt3358;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass104_Sub1_26.method3873(local44.aShort157);
				this.aClass104_Sub1_26.method3938(local44.aByte109);
				this.aClass104_Sub1_26.method3859(7, 0, 4);
			}
		}
		this.aClass104_Sub1_26.method20603(true);
		this.aClass104_Sub1_26.method3795();
	}

	@OriginalMember(owner = "client!afk", name = "ip", descriptor = "(Lclient!pq;)V", line = 2917)
	void method6617(@OriginalArg(0) Class489 arg0) {
		if (this.aClass216Array1 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub1_26.aClass489_1;
		this.aClass104_Sub1_26.method3787();
		this.aClass104_Sub1_26.method20603(!this.aBoolean155);
		this.aClass104_Sub1_26.method3921(false);
		this.aClass104_Sub1_26.method3855(this.aClass104_Sub1_26.aClass193_5, null, null, this.aClass104_Sub1_26.aClass193_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt789; local35++) {
			@Pc(44) Class216 local44 = this.aClass216Array1[local35];
			@Pc(49) Class194 local49 = this.aClass194Array1[local35];
			if (!local44.aBoolean645 || !this.aClass104_Sub1_26.method20622()) {
				@Pc(78) float local78 = (float) (this.anIntArray61[local44.anInt3616] + this.anIntArray61[local44.anInt3614] + this.anIntArray61[local44.anInt3615]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray62[local44.anInt3616] + this.anIntArray62[local44.anInt3614] + this.anIntArray62[local44.anInt3615]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray60[local44.anInt3616] + this.anIntArray60[local44.anInt3614] + this.anIntArray60[local44.anInt3615]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray116[0] * local78 + arg0.aFloatArray116[4] * local99 + arg0.aFloatArray116[8] * local120 + arg0.aFloatArray116[12];
				@Pc(172) float local172 = arg0.aFloatArray116[1] * local78 + arg0.aFloatArray116[5] * local99 + arg0.aFloatArray116[9] * local120 + arg0.aFloatArray116[13];
				@Pc(198) float local198 = arg0.aFloatArray116[2] * local78 + arg0.aFloatArray116[6] * local99 + arg0.aFloatArray116[10] * local120 + arg0.aFloatArray116[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3617;
				local6.method29961(local49.anInt3357, local49.anInt3354 * local44.aShort159 >> 7, local49.anInt3355 * local44.aShort158 >> 7, local146 + (float) local49.anInt3353 - local146 * local219, local172 + (float) local49.anInt3356 - local172 * local219, local198 - local198 * local219);
				this.aClass104_Sub1_26.method3794(local6);
				@Pc(267) int local267 = local49.anInt3358;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass104_Sub1_26.method3873(local44.aShort157);
				this.aClass104_Sub1_26.method3938(local44.aByte109);
				this.aClass104_Sub1_26.method3859(7, 0, 4);
			}
		}
		this.aClass104_Sub1_26.method20603(true);
		this.aClass104_Sub1_26.method3795();
	}

	@OriginalMember(owner = "client!afk", name = "id", descriptor = "(Lclient!pq;)V", line = 2917)
	void method6618(@OriginalArg(0) Class489 arg0) {
		if (this.aClass216Array1 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub1_26.aClass489_1;
		this.aClass104_Sub1_26.method3787();
		this.aClass104_Sub1_26.method20603(!this.aBoolean155);
		this.aClass104_Sub1_26.method3921(false);
		this.aClass104_Sub1_26.method3855(this.aClass104_Sub1_26.aClass193_5, null, null, this.aClass104_Sub1_26.aClass193_6);
		for (@Pc(35) int local35 = 0; local35 < this.anInt789; local35++) {
			@Pc(44) Class216 local44 = this.aClass216Array1[local35];
			@Pc(49) Class194 local49 = this.aClass194Array1[local35];
			if (!local44.aBoolean645 || !this.aClass104_Sub1_26.method20622()) {
				@Pc(78) float local78 = (float) (this.anIntArray61[local44.anInt3616] + this.anIntArray61[local44.anInt3614] + this.anIntArray61[local44.anInt3615]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray62[local44.anInt3616] + this.anIntArray62[local44.anInt3614] + this.anIntArray62[local44.anInt3615]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray60[local44.anInt3616] + this.anIntArray60[local44.anInt3614] + this.anIntArray60[local44.anInt3615]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray116[0] * local78 + arg0.aFloatArray116[4] * local99 + arg0.aFloatArray116[8] * local120 + arg0.aFloatArray116[12];
				@Pc(172) float local172 = arg0.aFloatArray116[1] * local78 + arg0.aFloatArray116[5] * local99 + arg0.aFloatArray116[9] * local120 + arg0.aFloatArray116[13];
				@Pc(198) float local198 = arg0.aFloatArray116[2] * local78 + arg0.aFloatArray116[6] * local99 + arg0.aFloatArray116[10] * local120 + arg0.aFloatArray116[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3617;
				local6.method29961(local49.anInt3357, local49.anInt3354 * local44.aShort159 >> 7, local49.anInt3355 * local44.aShort158 >> 7, local146 + (float) local49.anInt3353 - local146 * local219, local172 + (float) local49.anInt3356 - local172 * local219, local198 - local198 * local219);
				this.aClass104_Sub1_26.method3794(local6);
				@Pc(267) int local267 = local49.anInt3358;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass104_Sub1_26.method3873(local44.aShort157);
				this.aClass104_Sub1_26.method3938(local44.aByte109);
				this.aClass104_Sub1_26.method3859(7, 0, 4);
			}
		}
		this.aClass104_Sub1_26.method20603(true);
		this.aClass104_Sub1_26.method3795();
	}

	@OriginalMember(owner = "client!afk", name = "he", descriptor = "(Z)V", line = 2948)
	void method6619(@OriginalArg(0) boolean arg0) {
		if (this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.aByteArray58.length < this.anInt787 * 6) {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1((this.anInt787 + 100) * 6);
		} else {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.anInt3070 = 0;
		}
		@Pc(31) Class93_Sub41_Sub1 local31 = this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1;
		@Pc(37) int local37;
		if (this.aClass104_Sub1_26.aBoolean106) {
			for (local37 = 0; local37 < this.anInt787; local37++) {
				local31.method22395(this.aShortArray21[local37], 2125747937);
				local31.method22395(this.aShortArray20[local37], 2146107885);
				local31.method22395(this.aShortArray18[local37], 2131829154);
			}
		} else {
			for (local37 = 0; local37 < this.anInt787; local37++) {
				local31.method22398(this.aShortArray21[local37], -1045202158);
				local31.method22398(this.aShortArray20[local37], -369656432);
				local31.method22398(this.aShortArray18[local37], -771387871);
			}
		}
		if (local31.anInt3070 * 212851357 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface16_2 == null) {
				this.anInterface16_2 = this.aClass104_Sub1_26.method3843(5123, local31.aByteArray58, local31.anInt3070 * 212851357, true);
			} else {
				this.anInterface16_2.method2561(5123, local31.aByteArray58, local31.anInt3070 * 212851357);
			}
			this.aClass178_1.anInterface16_4 = this.anInterface16_2;
		} else {
			this.aClass178_1.anInterface16_4 = this.aClass104_Sub1_26.method3843(5123, local31.aByteArray58, local31.anInt3070 * 212851357, false);
		}
		if (!arg0) {
			this.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!afk", name = "hn", descriptor = "(Z)V", line = 2976)
	void method6620(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass193_10 != null && this.aClass193_10.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null;
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
		if (this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.aByteArray58.length < this.anInt788 * local91) {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1((this.anInt788 + 100) * local91);
		} else {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.anInt3070 = 0;
		}
		@Pc(170) Class93_Sub41_Sub1 local170 = this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local178 = 0; local178 < this.anInt785; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray61[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray62[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray60[local178]);
					local208 = this.anIntArray65[local178];
					local215 = this.anIntArray65[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray23[local217] != 0; local217++) {
						local235 = (this.aShortArray23[local217] & 0xFFFF) - 1;
						local170.anInt3070 = local235 * local91 * -1445626955;
						local170.method22406(local189, (byte) -28);
						local170.method22406(local196, (byte) 44);
						local170.method22406(local203, (byte) 26);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt785; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray61[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray62[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray60[local178]);
					local208 = this.anIntArray65[local178];
					local215 = this.anIntArray65[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray23[local217] != 0; local217++) {
						local235 = (this.aShortArray23[local217] & 0xFFFF) - 1;
						local170.anInt3070 = local235 * local91 * -1445626955;
						local170.method22409(local189, 1619958681);
						local170.method22409(local196, 1646179119);
						local170.method22409(local203, 2118086819);
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
			if (this.aClass193_10 == null) {
				if (this.aClass217_1 == null) {
					local353 = this.aShortArray24;
					local357 = this.aShortArray25;
					local361 = this.aShortArray17;
					local365 = this.aByteArray22;
				} else {
					local353 = this.aClass217_1.aShortArray87;
					local357 = this.aClass217_1.aShortArray86;
					local361 = this.aClass217_1.aShortArray85;
					local365 = this.aClass217_1.aByteArray67;
				}
				@Pc(384) float local384 = this.aClass104_Sub1_26.aFloatArray9[0];
				@Pc(390) float local390 = this.aClass104_Sub1_26.aFloatArray9[1];
				@Pc(396) float local396 = this.aClass104_Sub1_26.aFloatArray9[2];
				@Pc(400) float local400 = this.aClass104_Sub1_26.aFloat42;
				@Pc(410) float local410 = this.aClass104_Sub1_26.aFloat43 * 768.0F / (float) this.aShort58;
				@Pc(420) float local420 = this.aClass104_Sub1_26.aFloat44 * 768.0F / (float) this.aShort58;
				for (@Pc(422) int local422 = 0; local422 < this.anInt792; local422++) {
					@Pc(443) int local443 = this.method6622(this.aShortArray19[local422], this.aShortArray26[local422], this.aShort57, this.aByteArray21[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass104_Sub1_26.aFloat32;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass104_Sub1_26.aFloat40;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass104_Sub1_26.aFloat41;
					@Pc(481) int local481 = this.aShortArray21[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -74);
					local170.method22394(local570, (byte) -43);
					local170.method22394(local585, (byte) -107);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -44);
					local481 = this.aShortArray20[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -107);
					local170.method22394(local570, (byte) -70);
					local170.method22394(local585, (byte) -47);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -46);
					local481 = this.aShortArray18[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -24);
					local170.method22394(local570, (byte) -123);
					local170.method22394(local585, (byte) -42);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -126);
				}
			} else {
				for (local178 = 0; local178 < this.anInt792; local178++) {
					local189 = this.method6622(this.aShortArray19[local178], this.aShortArray26[local178], this.aShort57, this.aByteArray21[local178]);
					local170.anInt3070 = (local95 + (this.aShortArray21[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) 67);
					local170.anInt3070 = (local95 + (this.aShortArray20[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) -66);
					local170.anInt3070 = (local95 + (this.aShortArray18[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) 45);
				}
			}
		}
		if (local21) {
			if (this.aClass217_1 == null) {
				local353 = this.aShortArray24;
				local357 = this.aShortArray25;
				local361 = this.aShortArray17;
				local365 = this.aByteArray22;
			} else {
				local353 = this.aClass217_1.aShortArray87;
				local357 = this.aClass217_1.aShortArray86;
				local361 = this.aClass217_1.aShortArray85;
				local365 = this.aClass217_1.aByteArray67;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort58;
			local511 = 3.0F / (float) (this.aShort58 + this.aShort58 / 2);
			local170.anInt3070 = local97 * -1445626955;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local217 = 0; local217 < this.anInt788; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22322((float) local353[local217] * local511);
						local170.method22322((float) local357[local217] * local511);
						local170.method22322((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22322((float) local353[local217] * local463);
						local170.method22322((float) local357[local217] * local463);
						local170.method22322((float) local361[local217] * local463);
					}
					local170.anInt3070 += (local91 - 12) * -1445626955;
				}
			} else {
				for (local217 = 0; local217 < this.anInt788; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22325((float) local353[local217] * local511);
						local170.method22325((float) local357[local217] * local511);
						local170.method22325((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22325((float) local353[local217] * local463);
						local170.method22325((float) local357[local217] * local463);
						local170.method22325((float) local361[local217] * local463);
					}
					local170.anInt3070 += (local91 - 12) * -1445626955;
				}
			}
		}
		if (local43) {
			local170.anInt3070 = local99 * -1445626955;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local178 = 0; local178 < this.anInt788; local178++) {
					local170.method22322(this.aFloatArray25[local178]);
					local170.method22322(this.aFloatArray26[local178]);
					local170.anInt3070 += (local91 - 8) * -1445626955;
				}
			} else {
				for (local178 = 0; local178 < this.anInt788; local178++) {
					local170.method22325(this.aFloatArray25[local178]);
					local170.method22325(this.aFloatArray26[local178]);
					local170.anInt3070 += (local91 - 8) * -1445626955;
				}
			}
		}
		local170.anInt3070 = local91 * this.anInt788 * -1445626955;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass104_Sub1_26.method3845(local91, local170.aByteArray58, local170.anInt3070 * 212851357, true);
			} else {
				this.anInterface14_4.method2779(local91, local170.aByteArray58, local170.anInt3070 * 212851357);
			}
			local1348 = this.anInterface14_4;
			this.aByte4 = 0;
		} else {
			local1348 = this.aClass104_Sub1_26.method3845(local91, local170.aByteArray58, local170.anInt3070 * 212851357, false);
			this.aBoolean157 = true;
		}
		if (local32) {
			this.aClass193_7.anInterface14_6 = local1348;
			this.aClass193_7.aByte107 = local93;
		}
		if (local43) {
			this.aClass193_8.anInterface14_6 = local1348;
			this.aClass193_8.aByte107 = local99;
		}
		if (local10) {
			this.aClass193_9.anInterface14_6 = local1348;
			this.aClass193_9.aByte107 = local95;
		}
		if (local21) {
			this.aClass193_10.anInterface14_6 = local1348;
			this.aClass193_10.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!afk", name = "ia", descriptor = "(Z)V", line = 2976)
	void method6621(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass193_9 != null && this.aClass193_9.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass193_10 != null && this.aClass193_10.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass193_7 != null && this.aClass193_7.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass193_8 != null && this.aClass193_8.anInterface14_6 == null;
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
		if (this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.aByteArray58.length < this.anInt788 * local91) {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1((this.anInt788 + 100) * local91);
		} else {
			this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1.anInt3070 = 0;
		}
		@Pc(170) Class93_Sub41_Sub1 local170 = this.aClass104_Sub1_26.aClass93_Sub41_Sub1_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local178 = 0; local178 < this.anInt785; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray61[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray62[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray60[local178]);
					local208 = this.anIntArray65[local178];
					local215 = this.anIntArray65[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray23[local217] != 0; local217++) {
						local235 = (this.aShortArray23[local217] & 0xFFFF) - 1;
						local170.anInt3070 = local235 * local91 * -1445626955;
						local170.method22406(local189, (byte) 52);
						local170.method22406(local196, (byte) -93);
						local170.method22406(local203, (byte) -2);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt785; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray61[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray62[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray60[local178]);
					local208 = this.anIntArray65[local178];
					local215 = this.anIntArray65[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray23[local217] != 0; local217++) {
						local235 = (this.aShortArray23[local217] & 0xFFFF) - 1;
						local170.anInt3070 = local235 * local91 * -1445626955;
						local170.method22409(local189, 911447150);
						local170.method22409(local196, 1227027424);
						local170.method22409(local203, 1037978050);
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
			if (this.aClass193_10 == null) {
				if (this.aClass217_1 == null) {
					local353 = this.aShortArray24;
					local357 = this.aShortArray25;
					local361 = this.aShortArray17;
					local365 = this.aByteArray22;
				} else {
					local353 = this.aClass217_1.aShortArray87;
					local357 = this.aClass217_1.aShortArray86;
					local361 = this.aClass217_1.aShortArray85;
					local365 = this.aClass217_1.aByteArray67;
				}
				@Pc(384) float local384 = this.aClass104_Sub1_26.aFloatArray9[0];
				@Pc(390) float local390 = this.aClass104_Sub1_26.aFloatArray9[1];
				@Pc(396) float local396 = this.aClass104_Sub1_26.aFloatArray9[2];
				@Pc(400) float local400 = this.aClass104_Sub1_26.aFloat42;
				@Pc(410) float local410 = this.aClass104_Sub1_26.aFloat43 * 768.0F / (float) this.aShort58;
				@Pc(420) float local420 = this.aClass104_Sub1_26.aFloat44 * 768.0F / (float) this.aShort58;
				for (@Pc(422) int local422 = 0; local422 < this.anInt792; local422++) {
					@Pc(443) int local443 = this.method6622(this.aShortArray19[local422], this.aShortArray26[local422], this.aShort57, this.aByteArray21[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass104_Sub1_26.aFloat32;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass104_Sub1_26.aFloat40;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass104_Sub1_26.aFloat41;
					@Pc(481) int local481 = this.aShortArray21[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -81);
					local170.method22394(local570, (byte) -51);
					local170.method22394(local585, (byte) -43);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -3);
					local481 = this.aShortArray20[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -67);
					local170.method22394(local570, (byte) -52);
					local170.method22394(local585, (byte) -40);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -38);
					local481 = this.aShortArray18[local422] & 0xFFFF;
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
					local170.anInt3070 = (local95 + local481 * local91) * -1445626955;
					local170.method22394(local555, (byte) -45);
					local170.method22394(local570, (byte) -73);
					local170.method22394(local585, (byte) -51);
					local170.method22394(255 - (this.aByteArray21[local422] & 0xFF), (byte) -102);
				}
			} else {
				for (local178 = 0; local178 < this.anInt792; local178++) {
					local189 = this.method6622(this.aShortArray19[local178], this.aShortArray26[local178], this.aShort57, this.aByteArray21[local178]);
					local170.anInt3070 = (local95 + (this.aShortArray21[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) -67);
					local170.anInt3070 = (local95 + (this.aShortArray20[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) 24);
					local170.anInt3070 = (local95 + (this.aShortArray18[local178] & 0xFFFF) * local91) * -1445626955;
					local170.method22406(local189, (byte) -94);
				}
			}
		}
		if (local21) {
			if (this.aClass217_1 == null) {
				local353 = this.aShortArray24;
				local357 = this.aShortArray25;
				local361 = this.aShortArray17;
				local365 = this.aByteArray22;
			} else {
				local353 = this.aClass217_1.aShortArray87;
				local357 = this.aClass217_1.aShortArray86;
				local361 = this.aClass217_1.aShortArray85;
				local365 = this.aClass217_1.aByteArray67;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort58;
			local511 = 3.0F / (float) (this.aShort58 + this.aShort58 / 2);
			local170.anInt3070 = local97 * -1445626955;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local217 = 0; local217 < this.anInt788; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22322((float) local353[local217] * local511);
						local170.method22322((float) local357[local217] * local511);
						local170.method22322((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22322((float) local353[local217] * local463);
						local170.method22322((float) local357[local217] * local463);
						local170.method22322((float) local361[local217] * local463);
					}
					local170.anInt3070 += (local91 - 12) * -1445626955;
				}
			} else {
				for (local217 = 0; local217 < this.anInt788; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22325((float) local353[local217] * local511);
						local170.method22325((float) local357[local217] * local511);
						local170.method22325((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22325((float) local353[local217] * local463);
						local170.method22325((float) local357[local217] * local463);
						local170.method22325((float) local361[local217] * local463);
					}
					local170.anInt3070 += (local91 - 12) * -1445626955;
				}
			}
		}
		if (local43) {
			local170.anInt3070 = local99 * -1445626955;
			if (this.aClass104_Sub1_26.aBoolean106) {
				for (local178 = 0; local178 < this.anInt788; local178++) {
					local170.method22322(this.aFloatArray25[local178]);
					local170.method22322(this.aFloatArray26[local178]);
					local170.anInt3070 += (local91 - 8) * -1445626955;
				}
			} else {
				for (local178 = 0; local178 < this.anInt788; local178++) {
					local170.method22325(this.aFloatArray25[local178]);
					local170.method22325(this.aFloatArray26[local178]);
					local170.anInt3070 += (local91 - 8) * -1445626955;
				}
			}
		}
		local170.anInt3070 = local91 * this.anInt788 * -1445626955;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass104_Sub1_26.method3845(local91, local170.aByteArray58, local170.anInt3070 * 212851357, true);
			} else {
				this.anInterface14_4.method2779(local91, local170.aByteArray58, local170.anInt3070 * 212851357);
			}
			local1348 = this.anInterface14_4;
			this.aByte4 = 0;
		} else {
			local1348 = this.aClass104_Sub1_26.method3845(local91, local170.aByteArray58, local170.anInt3070 * 212851357, false);
			this.aBoolean157 = true;
		}
		if (local32) {
			this.aClass193_7.anInterface14_6 = local1348;
			this.aClass193_7.aByte107 = local93;
		}
		if (local43) {
			this.aClass193_8.anInterface14_6 = local1348;
			this.aClass193_8.aByte107 = local99;
		}
		if (local10) {
			this.aClass193_9.anInterface14_6 = local1348;
			this.aClass193_9.aByte107 = local95;
		}
		if (local21) {
			this.aClass193_10.anInterface14_6 = local1348;
			this.aClass193_10.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!afk", name = "hi", descriptor = "(ISIB)I", line = 3261)
	int method6622(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class685.anIntArray524[method6625(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class235 local17 = this.aClass104_Sub1_26.aClass225_6.method25597(arg1 & 0xFFFF, -1734481639);
			@Pc(22) int local22 = local17.aByte123 & 0xFF;
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
			local28 = local17.aByte122 & 0xFF;
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

	@OriginalMember(owner = "client!afk", name = "ih", descriptor = "(ISIB)I", line = 3261)
	int method6623(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class685.anIntArray524[method6625(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class235 local17 = this.aClass104_Sub1_26.aClass225_6.method25597(arg1 & 0xFFFF, -1685744419);
			@Pc(22) int local22 = local17.aByte123 & 0xFF;
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
			local28 = local17.aByte122 & 0xFF;
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

	@OriginalMember(owner = "client!afk", name = "if", descriptor = "(ISIB)I", line = 3261)
	int method6624(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class685.anIntArray524[method6625(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class235 local17 = this.aClass104_Sub1_26.aClass225_6.method25597(arg1 & 0xFFFF, 351317724);
			@Pc(22) int local22 = local17.aByte123 & 0xFF;
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
			local28 = local17.aByte122 & 0xFF;
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

	@OriginalMember(owner = "client!afk", name = "hw", descriptor = "(II)I", line = 3293)
	static final int method6625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afk", name = "ii", descriptor = "(II)I", line = 3293)
	static final int method6626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afk", name = "iy", descriptor = "(II)I", line = 3293)
	static final int method6627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
