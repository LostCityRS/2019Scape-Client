package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!afo")
public class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!afo", name = "w", descriptor = "I")
	static final int anInt812 = 7;

	@OriginalMember(owner = "client!afo", name = "f", descriptor = "I")
	static final int anInt822 = 4;

	@OriginalMember(owner = "client!afo", name = "ce", descriptor = "Lclient!lq;")
	static Class403 aClass403_1;

	@OriginalMember(owner = "client!afo", name = "bh", descriptor = "I")
	int anInt811;

	@OriginalMember(owner = "client!afo", name = "h", descriptor = "[S")
	short[] aShortArray27;

	@OriginalMember(owner = "client!afo", name = "p", descriptor = "S")
	short aShort66;

	@OriginalMember(owner = "client!afo", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!afo", name = "v", descriptor = "[I")
	int[] anIntArray70;

	@OriginalMember(owner = "client!afo", name = "cg", descriptor = "Z")
	boolean aBoolean164;

	@OriginalMember(owner = "client!afo", name = "t", descriptor = "[F")
	float[] aFloatArray28;

	@OriginalMember(owner = "client!afo", name = "bk", descriptor = "I")
	int anInt816;

	@OriginalMember(owner = "client!afo", name = "q", descriptor = "[S")
	short[] aShortArray28;

	@OriginalMember(owner = "client!afo", name = "b", descriptor = "[S")
	short[] aShortArray29;

	@OriginalMember(owner = "client!afo", name = "s", descriptor = "[I")
	int[] anIntArray71;

	@OriginalMember(owner = "client!afo", name = "aw", descriptor = "[S")
	short[] aShortArray30;

	@OriginalMember(owner = "client!afo", name = "g", descriptor = "[S")
	short[] aShortArray31;

	@OriginalMember(owner = "client!afo", name = "i", descriptor = "[S")
	short[] aShortArray32;

	@OriginalMember(owner = "client!afo", name = "ad", descriptor = "[S")
	short[] aShortArray33;

	@OriginalMember(owner = "client!afo", name = "bl", descriptor = "I")
	int anInt819;

	@OriginalMember(owner = "client!afo", name = "ac", descriptor = "[S")
	short[] aShortArray34;

	@OriginalMember(owner = "client!afo", name = "a", descriptor = "[S")
	short[] aShortArray35;

	@OriginalMember(owner = "client!afo", name = "ae", descriptor = "[F")
	float[] aFloatArray30;

	@OriginalMember(owner = "client!afo", name = "at", descriptor = "[S")
	short[] aShortArray36;

	@OriginalMember(owner = "client!afo", name = "am", descriptor = "[[I")
	int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!afo", name = "az", descriptor = "I")
	int anInt823;

	@OriginalMember(owner = "client!afo", name = "bb", descriptor = "[Lclient!cq;")
	Class210[] aClass210Array3;

	@OriginalMember(owner = "client!afo", name = "aa", descriptor = "I")
	int anInt824;

	@OriginalMember(owner = "client!afo", name = "bi", descriptor = "[I")
	int[] anIntArray73;

	@OriginalMember(owner = "client!afo", name = "ak", descriptor = "I")
	int anInt825;

	@OriginalMember(owner = "client!afo", name = "an", descriptor = "I")
	int anInt826;

	@OriginalMember(owner = "client!afo", name = "bf", descriptor = "I")
	int anInt827;

	@OriginalMember(owner = "client!afo", name = "ai", descriptor = "[B")
	byte[] aByteArray23;

	@OriginalMember(owner = "client!afo", name = "be", descriptor = "I")
	int anInt828;

	@OriginalMember(owner = "client!afo", name = "j", descriptor = "[B")
	byte[] aByteArray24;

	@OriginalMember(owner = "client!afo", name = "d", descriptor = "S")
	short aShort67;

	@OriginalMember(owner = "client!afo", name = "bc", descriptor = "[I")
	int[] anIntArray74;

	@OriginalMember(owner = "client!afo", name = "bw", descriptor = "[[I")
	int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!afo", name = "bn", descriptor = "[I")
	int[] anIntArray75;

	@OriginalMember(owner = "client!afo", name = "bt", descriptor = "[I")
	int[] anIntArray76;

	@OriginalMember(owner = "client!afo", name = "bq", descriptor = "[S")
	short[] aShortArray37;

	@OriginalMember(owner = "client!afo", name = "bm", descriptor = "[Lclient!du;")
	Class234[] aClass234Array3;

	@OriginalMember(owner = "client!afo", name = "bu", descriptor = "[Lclient!lx;")
	Class409[] aClass409Array1;

	@OriginalMember(owner = "client!afo", name = "by", descriptor = "[Lclient!mf;")
	Class416[] aClass416Array1;

	@OriginalMember(owner = "client!afo", name = "au", descriptor = "[S")
	short[] aShortArray38;

	@OriginalMember(owner = "client!afo", name = "bd", descriptor = "I")
	int anInt829;

	@OriginalMember(owner = "client!afo", name = "bo", descriptor = "[J")
	long[] aLongArray9;

	@OriginalMember(owner = "client!afo", name = "as", descriptor = "[S")
	short[] aShortArray39;

	@OriginalMember(owner = "client!afo", name = "o", descriptor = "[I")
	int[] anIntArray81;

	@OriginalMember(owner = "client!afo", name = "bj", descriptor = "I")
	int anInt830;

	@OriginalMember(owner = "client!afo", name = "bs", descriptor = "I")
	int anInt831;

	@OriginalMember(owner = "client!afo", name = "cl", descriptor = "I")
	int anInt832;

	@OriginalMember(owner = "client!afo", name = "ag", descriptor = "Lclient!mp;")
	Class423 aClass423_1;

	@OriginalMember(owner = "client!afo", name = "c", descriptor = "I")
	int anInt814;

	@OriginalMember(owner = "client!afo", name = "r", descriptor = "I")
	int anInt815;

	@OriginalMember(owner = "client!afo", name = "x", descriptor = "I")
	int anInt817;

	@OriginalMember(owner = "client!afo", name = "ah", descriptor = "I")
	int anInt818;

	@OriginalMember(owner = "client!afo", name = "al", descriptor = "I")
	int anInt820;

	@OriginalMember(owner = "client!afo", name = "ao", descriptor = "Z")
	boolean aBoolean166;

	@OriginalMember(owner = "client!afo", name = "aj", descriptor = "Z")
	boolean aBoolean167;

	@OriginalMember(owner = "client!afo", name = "ay", descriptor = "Z")
	boolean aBoolean168;

	@OriginalMember(owner = "client!afo", name = "ab", descriptor = "Z")
	boolean aBoolean163;

	@OriginalMember(owner = "client!afo", name = "af", descriptor = "Z")
	boolean aBoolean165;

	@OriginalMember(owner = "client!afo", name = "bx", descriptor = "Z")
	boolean aBoolean169;

	@OriginalMember(owner = "client!afo", name = "bz", descriptor = "[F")
	float[] aFloatArray29;

	@OriginalMember(owner = "client!afo", name = "bv", descriptor = "[I")
	int[] anIntArray77;

	@OriginalMember(owner = "client!afo", name = "br", descriptor = "[I")
	int[] anIntArray78;

	@OriginalMember(owner = "client!afo", name = "bg", descriptor = "[I")
	final int[] anIntArray79;

	@OriginalMember(owner = "client!afo", name = "ba", descriptor = "[I")
	final int[] anIntArray80;

	@OriginalMember(owner = "client!afo", name = "bp", descriptor = "[I")
	final int[] anIntArray72;

	@OriginalMember(owner = "client!afo", name = "l", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_4;

	@OriginalMember(owner = "client!afo", name = "u", descriptor = "I")
	int anInt821;

	@OriginalMember(owner = "client!afo", name = "z", descriptor = "I")
	int anInt813;

	@OriginalMember(owner = "client!afo", name = "ap", descriptor = "Lclient!mg;")
	Class417 aClass417_1;

	@OriginalMember(owner = "client!afo", name = "av", descriptor = "Lclient!mg;")
	Class417 aClass417_4;

	@OriginalMember(owner = "client!afo", name = "aq", descriptor = "Lclient!mg;")
	Class417 aClass417_2;

	@OriginalMember(owner = "client!afo", name = "ax", descriptor = "Lclient!mg;")
	Class417 aClass417_3;

	@OriginalMember(owner = "client!afo", name = "ar", descriptor = "Lclient!lb;")
	Class394 aClass394_1;

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "(Lclient!afc;IIZZ)V", line = 101)
	Class109_Sub3(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt814 = 0;
		this.anInt815 = 0;
		this.anInt817 = 0;
		this.anInt818 = 0;
		this.anInt820 = 0;
		this.aBoolean166 = false;
		this.aBoolean167 = true;
		this.aBoolean168 = false;
		this.aBoolean163 = false;
		this.aBoolean165 = false;
		this.aBoolean169 = false;
		this.aFloatArray29 = new float[2];
		this.anIntArray77 = new int[1];
		this.anIntArray78 = new int[1];
		this.anIntArray79 = new int[8];
		this.anIntArray80 = new int[8];
		this.anIntArray72 = new int[8];
		this.aClass104_Sub2_4 = arg0;
		this.anInt821 = arg1;
		this.anInt813 = arg2;
		this.aBoolean166 = arg4;
		if (arg3 || Class396.method28392(this.anInt821, this.anInt813)) {
			this.aClass417_1 = new Class417(Class396.method28411(this.anInt821, this.anInt813));
		}
		if (arg3 || Class396.method28404(this.anInt821, this.anInt813)) {
			this.aClass417_4 = new Class417(Class396.method28418(this.anInt821, this.anInt813));
		}
		if (arg3 || Class396.method28399(this.anInt821, this.anInt813)) {
			this.aClass417_2 = new Class417(Class396.method28415(this.anInt821, this.anInt813));
		}
		if (arg3 || Class396.method28396(this.anInt821, this.anInt813)) {
			this.aClass417_3 = new Class417(Class396.method28414(this.anInt821, this.anInt813));
		}
		if (arg3 || Class396.method28407(this.anInt821, this.anInt813)) {
			this.aClass394_1 = new Class394(Class396.method28423(this.anInt821, this.anInt813));
		}
		if (arg3 && arg4) {
			this.aClass417_1.anInterface37_22 = this.aClass417_1.anInterface37_23 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			this.aClass417_4.anInterface37_22 = this.aClass417_4.anInterface37_23 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			this.aClass417_2.anInterface37_22 = this.aClass417_2.anInterface37_23 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			this.aClass417_3.anInterface37_22 = this.aClass417_3.anInterface37_23 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
		}
	}

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "(Lclient!afc;Lclient!dq;IIII)V", line = 120)
	Class109_Sub3(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(9) Class225 local9 = arg0.aClass225_6;
		@Pc(12) Interface48 local12 = arg0.anInterface48_6;
		@Pc(16) int[] local16 = new int[arg1.anInt3743];
		this.anIntArray76 = new int[arg1.anInt3740 + 1];
		for (@Pc(25) int local25 = 0; local25 < arg1.anInt3743; local25++) {
			if (arg1.aByteArray72 == null || arg1.aByteArray72[local25] != 2) {
				if (arg1.aShortArray90 != null && arg1.aShortArray90[local25] != -1) {
					@Pc(58) Class235 local58 = local9.method25597(arg1.aShortArray90[local25] & 0xFFFF, 755405874);
					if (((this.anInt813 & 0x40) == 0 || !local58.aBoolean656) && local58.aBoolean657) {
						continue;
					}
				}
				local16[this.anInt818++] = local25;
				this.anIntArray76[arg1.aShortArray97[local25]]++;
				this.anIntArray76[arg1.aShortArray88[local25]]++;
				this.anIntArray76[arg1.aShortArray92[local25]]++;
			}
		}
		this.anInt820 = this.anInt818;
		@Pc(123) long[] local123 = new long[this.anInt818];
		@Pc(132) boolean local132 = (this.anInt821 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(159) int local159;
		@Pc(378) int local378;
		@Pc(279) short local279;
		for (@Pc(134) int local134 = 0; local134 < this.anInt818; local134++) {
			local142 = local16[local134];
			@Pc(144) Class235 local144 = null;
			local146 = 0;
			@Pc(148) byte local148 = 0;
			@Pc(150) byte local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(157) boolean local157;
			if (arg1.aClass227Array1 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass227Array1.length; local159++) {
					@Pc(169) Class227 local169 = arg1.aClass227Array1[local159];
					if (local142 == local169.anInt3648 * 1084874511) {
						@Pc(183) Class442 local183 = local12.method28945(local169.anInt3647 * 422903595, -1687080913);
						if (local183.aBoolean769) {
							local157 = true;
						}
						if (local183.anInt4892 * -153468217 != -1) {
							@Pc(202) Class235 local202 = local9.method25597(local183.anInt4892 * -153468217, 58008931);
							if (local202.aClass618_2 == Class618.aClass618_3) {
								this.aBoolean168 = true;
							}
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt820--;
					continue;
				}
			}
			if (arg1.aClass234Array4 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass234Array4.length; local159++) {
					@Pc(241) Class234 local241 = arg1.aClass234Array4[local159];
					if (local142 == local241.anInt3755 * 171091685) {
						@Pc(257) Class439 local257 = this.aClass104_Sub2_4.anInterface46_6.method28821(local241.anInt3767 * -343583539, -151027014);
						if (local257.aBoolean765) {
							local157 = true;
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt820--;
					continue;
				}
			}
			local279 = -1;
			if (arg1.aShortArray90 != null) {
				local279 = arg1.aShortArray90[local142];
				if (local279 != -1) {
					local144 = local9.method25597(local279 & 0xFFFF, -317671498);
					if ((this.anInt813 & 0x40) != 0 && local144.aBoolean656) {
						local279 = -1;
						local144 = null;
					} else {
						local150 = local144.aByte114;
						local152 = local144.aByte112;
					}
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray74 != null && arg1.aByteArray74[local142] != 0 || local144 != null && local144.aClass618_2 != Class618.aClass618_5;
			if ((local132 || local334) && arg1.aByteArray73 != null) {
				local146 += arg1.aByteArray73[local142] << 17;
			}
			if (local334) {
				local146 += 65536;
			}
			local146 += (local150 & 0xFF) << 8;
			local146 += local152 & 0xFF;
			local378 = local148 + ((local279 & 0xFFFF) << 16);
			@Pc(384) int local384 = local378 + (local134 & 0xFFFF);
			local123[local134] = ((long) local146 << 32) + (long) local384;
			this.aBoolean168 |= local334;
			this.aBoolean163 |= local144 != null && (local144.aFloat278 != 0.0F || local144.aFloat279 != 0.0F);
		}
		Class121.method8705(local123, local16, (byte) 78);
		this.anInt814 = arg1.anInt3739;
		this.anInt815 = arg1.anInt3740;
		this.anIntArray70 = arg1.anIntArray339;
		this.anIntArray81 = arg1.anIntArray342;
		this.anIntArray71 = arg1.anIntArray349;
		this.aShortArray28 = arg1.aShortArray98;
		@Pc(454) Class428[] local454 = new Class428[this.anInt815];
		this.aClass234Array3 = arg1.aClass234Array4;
		this.aClass210Array3 = arg1.aClass210Array4;
		@Pc(503) int local503;
		if (arg1.aClass227Array1 != null) {
			this.anInt828 = arg1.aClass227Array1.length;
			this.aClass416Array1 = new Class416[this.anInt828];
			this.aClass409Array1 = new Class409[this.anInt828];
			for (local142 = 0; local142 < this.anInt828; local142++) {
				@Pc(491) Class227 local491 = arg1.aClass227Array1[local142];
				@Pc(499) Class442 local499 = local12.method28945(local491.anInt3647 * 422903595, 980132446);
				local378 = -1;
				for (local503 = 0; local503 < this.anInt818; local503++) {
					if (local16[local503] == local491.anInt3648 * 1084874511) {
						local378 = local503;
						break;
					}
				}
				if (local378 == -1) {
					throw new RuntimeException();
				}
				local503 = Class685.anIntArray524[arg1.aShortArray89[local491.anInt3648 * 1084874511] & 0xFFFF] & 0xFFFFFF;
				local503 |= 255 - (arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local491.anInt3648 * 1084874511]) << 24;
				this.aClass416Array1[local142] = new Class416(local378, arg1.aShortArray97[local491.anInt3648 * 1084874511], arg1.aShortArray88[local491.anInt3648 * 1084874511], arg1.aShortArray92[local491.anInt3648 * 1084874511], local499.anInt4888 * -298655207, local499.anInt4889 * 1373877659, local499.anInt4892 * -153468217, local499.anInt4887 * 1129274231, local499.anInt4890 * 1161833965, local499.aBoolean769, local499.aBoolean768, local491.anInt3650 * 530428003);
				this.aClass409Array1[local142] = new Class409(local503);
			}
		}
		local142 = this.anInt818 * 3;
		this.aShortArray29 = new short[local142];
		this.aShortArray27 = new short[local142];
		this.aShortArray35 = new short[local142];
		this.aShortArray31 = new short[local142];
		this.aShortArray32 = new short[local142];
		this.aByteArray24 = new byte[local142];
		this.aFloatArray28 = new float[local142];
		this.aFloatArray30 = new float[local142];
		this.aShortArray34 = new short[this.anInt818];
		this.aByteArray23 = new byte[this.anInt818];
		this.aShortArray30 = new short[this.anInt818];
		this.aShortArray39 = new short[this.anInt818];
		this.aShortArray36 = new short[this.anInt818];
		this.aShortArray33 = new short[this.anInt818];
		if (arg1.aShortArray91 != null) {
			this.aShortArray38 = new short[this.anInt818];
		}
		this.aShort66 = (short) arg3;
		this.aShort67 = (short) arg4;
		this.aShortArray37 = new short[local142];
		this.aLongArray9 = new long[local142];
		@Pc(720) int local720 = 0;
		for (local146 = 0; local146 < arg1.anInt3740; local146++) {
			local378 = this.anIntArray76[local146];
			this.anIntArray76[local146] = local720;
			local720 += local378;
			local454[local146] = new Class428();
		}
		this.anIntArray76[arg1.anInt3740] = local720;
		@Pc(761) Class242 local761 = this.method6825(arg1, local16, this.anInt818);
		@Pc(765) Class418[] local765 = new Class418[arg1.anInt3743];
		@Pc(776) short local776;
		@Pc(786) short local786;
		@Pc(796) int local796;
		@Pc(816) int local816;
		for (local503 = 0; local503 < arg1.anInt3743; local503++) {
			local776 = arg1.aShortArray97[local503];
			local279 = arg1.aShortArray88[local503];
			local786 = arg1.aShortArray92[local503];
			local796 = this.anIntArray70[local279] - this.anIntArray70[local776];
			@Pc(806) int local806 = this.anIntArray81[local279] - this.anIntArray81[local776];
			local816 = this.anIntArray71[local279] - this.anIntArray71[local776];
			@Pc(826) int local826 = this.anIntArray70[local786] - this.anIntArray70[local776];
			@Pc(836) int local836 = this.anIntArray81[local786] - this.anIntArray81[local776];
			@Pc(846) int local846 = this.anIntArray71[local786] - this.anIntArray71[local776];
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
			@Pc(948) byte local948 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local503];
			if (local948 == 0) {
				@Pc(954) Class428 local954 = local454[local776];
				local954.anInt4779 += local854;
				local954.anInt4777 += local862;
				local954.anInt4778 += local870;
				local954.anInt4780++;
				@Pc(982) Class428 local982 = local454[local279];
				local982.anInt4779 += local854;
				local982.anInt4777 += local862;
				local982.anInt4778 += local870;
				local982.anInt4780++;
				@Pc(1010) Class428 local1010 = local454[local786];
				local1010.anInt4779 += local854;
				local1010.anInt4777 += local862;
				local1010.anInt4778 += local870;
				local1010.anInt4780++;
			} else if (local948 == 1) {
				@Pc(1046) Class418 local1046 = local765[local503] = new Class418();
				local1046.anInt4767 = local854;
				local1046.anInt4768 = local862;
				local1046.anInt4769 = local870;
			}
		}
		@Pc(1074) int local1074;
		for (local503 = 0; local503 < this.anInt818; local503++) {
			@Pc(1067) int local1067 = local16[local503];
			local1074 = arg1.aShortArray89[local1067] & 0xFFFF;
			local159 = arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local1067] & 0xFF;
			@Pc(1096) short local1096 = arg1.aShortArray90 == null ? -1 : arg1.aShortArray90[local1067];
			if (local1096 != -1 && (this.anInt813 & 0x40) != 0 && local9.method25597(local1096, -804493971).aBoolean656) {
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
				@Pc(1137) short local1137 = arg1.aShortArray96 == null ? -1 : arg1.aShortArray96[local1067];
				@Pc(1147) int local1147;
				if (local1137 == 32766) {
					local1147 = arg1.aByteArray69[local1067] & 0xFF;
					@Pc(1154) int local1154 = arg1.aByteArray70[local1067] & 0xFF;
					@Pc(1161) int local1161 = arg1.aByteArray71[local1067] & 0xFF;
					@Pc(1171) int local1171 = local1147 + arg1.anIntArray341[arg1.aShortArray97[local1067]];
					local1174 = local1171;
					@Pc(1184) int local1184 = local1154 + arg1.anIntArray341[arg1.aShortArray88[local1067]];
					local1187 = local1171;
					@Pc(1197) int local1197 = local1161 + arg1.anIntArray341[arg1.aShortArray92[local1067]];
					local1200 = local1171;
					local1114 = arg1.aFloatArray101[local1171];
					local1116 = arg1.aFloatArray100[local1171];
					local1118 = arg1.aFloatArray101[local1184];
					local1120 = arg1.aFloatArray100[local1184];
					local1122 = arg1.aFloatArray101[local1197];
					local1124 = arg1.aFloatArray100[local1197];
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
					@Pc(1268) byte local1268 = arg1.aByteArray68[local1257];
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
						local1275 = arg1.aShortArray97[local1067];
						local1280 = arg1.aShortArray88[local1067];
						local1285 = arg1.aShortArray92[local1067];
						@Pc(1290) short local1290 = arg1.aShortArray93[local1257];
						@Pc(1295) short local1295 = arg1.aShortArray94[local1257];
						@Pc(1300) short local1300 = arg1.aShortArray95[local1257];
						@Pc(1306) float local1306 = (float) arg1.anIntArray339[local1290];
						@Pc(1312) float local1312 = (float) arg1.anIntArray342[local1290];
						local1318 = arg1.anIntArray349[local1290];
						local1326 = (float) arg1.anIntArray339[local1295] - local1306;
						local1334 = (float) arg1.anIntArray342[local1295] - local1312;
						@Pc(1342) float local1342 = (float) arg1.anIntArray349[local1295] - local1318;
						@Pc(1350) float local1350 = (float) arg1.anIntArray339[local1300] - local1306;
						@Pc(1358) float local1358 = (float) arg1.anIntArray342[local1300] - local1312;
						@Pc(1366) float local1366 = (float) arg1.anIntArray349[local1300] - local1318;
						@Pc(1374) float local1374 = (float) arg1.anIntArray339[local1275] - local1306;
						@Pc(1382) float local1382 = (float) arg1.anIntArray342[local1275] - local1312;
						@Pc(1390) float local1390 = (float) arg1.anIntArray349[local1275] - local1318;
						@Pc(1398) float local1398 = (float) arg1.anIntArray339[local1280] - local1306;
						@Pc(1406) float local1406 = (float) arg1.anIntArray342[local1280] - local1312;
						local1414 = (float) arg1.anIntArray349[local1280] - local1318;
						local1422 = (float) arg1.anIntArray339[local1285] - local1306;
						local1430 = (float) arg1.anIntArray342[local1285] - local1312;
						local1438 = (float) arg1.anIntArray349[local1285] - local1318;
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
						local1275 = arg1.aShortArray97[local1067];
						local1280 = arg1.aShortArray88[local1067];
						local1285 = arg1.aShortArray92[local1067];
						@Pc(1643) int local1643 = local761.anIntArray352[local1257];
						@Pc(1648) int local1648 = local761.anIntArray354[local1257];
						@Pc(1653) int local1653 = local761.anIntArray353[local1257];
						@Pc(1658) float[] local1658 = local761.aFloatArrayArray24[local1257];
						@Pc(1663) byte local1663 = arg1.aByteArray76[local1257];
						local1318 = (float) arg1.anIntArray348[local1257] / 256.0F;
						if (local1268 == 1) {
							local1326 = (float) arg1.anIntArray347[local1257] / 1024.0F;
							method6820(arg1.anIntArray339[local1275], arg1.anIntArray342[local1275], arg1.anIntArray349[local1275], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray29);
							local1114 = this.aFloatArray29[0];
							local1116 = this.aFloatArray29[1];
							method6820(arg1.anIntArray339[local1280], arg1.anIntArray342[local1280], arg1.anIntArray349[local1280], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray29);
							local1118 = this.aFloatArray29[0];
							local1120 = this.aFloatArray29[1];
							method6820(arg1.anIntArray339[local1285], arg1.anIntArray342[local1285], arg1.anIntArray349[local1285], local1643, local1648, local1653, local1658, local1326, local1663, local1318, this.aFloatArray29);
							local1122 = this.aFloatArray29[0];
							local1124 = this.aFloatArray29[1];
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
							local1326 = (float) arg1.anIntArray344[local1257] / 256.0F;
							local1334 = (float) arg1.anIntArray338[local1257] / 256.0F;
							@Pc(1917) int local1917 = arg1.anIntArray339[local1280] - arg1.anIntArray339[local1275];
							@Pc(1927) int local1927 = arg1.anIntArray342[local1280] - arg1.anIntArray342[local1275];
							@Pc(1937) int local1937 = arg1.anIntArray349[local1280] - arg1.anIntArray349[local1275];
							@Pc(1947) int local1947 = arg1.anIntArray339[local1285] - arg1.anIntArray339[local1275];
							@Pc(1957) int local1957 = arg1.anIntArray342[local1285] - arg1.anIntArray342[local1275];
							@Pc(1967) int local1967 = arg1.anIntArray349[local1285] - arg1.anIntArray349[local1275];
							@Pc(1975) int local1975 = local1927 * local1967 - local1957 * local1937;
							@Pc(1983) int local1983 = local1937 * local1947 - local1967 * local1917;
							@Pc(1991) int local1991 = local1917 * local1957 - local1947 * local1927;
							local1414 = 64.0F / (float) arg1.anIntArray345[local1257];
							local1422 = 64.0F / (float) arg1.anIntArray346[local1257];
							local1430 = 64.0F / (float) arg1.anIntArray347[local1257];
							local1438 = ((float) local1975 * local1658[0] + (float) local1983 * local1658[1] + (float) local1991 * local1658[2]) / local1414;
							local1446 = ((float) local1975 * local1658[3] + (float) local1983 * local1658[4] + (float) local1991 * local1658[5]) / local1422;
							local1454 = ((float) local1975 * local1658[6] + (float) local1983 * local1658[7] + (float) local1991 * local1658[8]) / local1430;
							local1147 = method6823(local1438, local1446, local1454);
							method6824(arg1.anIntArray339[local1275], arg1.anIntArray342[local1275], arg1.anIntArray349[local1275], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray29);
							local1114 = this.aFloatArray29[0];
							local1116 = this.aFloatArray29[1];
							method6824(arg1.anIntArray339[local1280], arg1.anIntArray342[local1280], arg1.anIntArray349[local1280], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray29);
							local1118 = this.aFloatArray29[0];
							local1120 = this.aFloatArray29[1];
							method6824(arg1.anIntArray339[local1285], arg1.anIntArray342[local1285], arg1.anIntArray349[local1285], local1643, local1648, local1653, local1147, local1658, local1663, local1318, local1326, local1334, this.aFloatArray29);
							local1122 = this.aFloatArray29[0];
							local1124 = this.aFloatArray29[1];
						} else if (local1268 == 3) {
							method6816(arg1.anIntArray339[local1275], arg1.anIntArray342[local1275], arg1.anIntArray349[local1275], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray29);
							local1114 = this.aFloatArray29[0];
							local1116 = this.aFloatArray29[1];
							method6816(arg1.anIntArray339[local1280], arg1.anIntArray342[local1280], arg1.anIntArray349[local1280], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray29);
							local1118 = this.aFloatArray29[0];
							local1120 = this.aFloatArray29[1];
							method6816(arg1.anIntArray339[local1285], arg1.anIntArray342[local1285], arg1.anIntArray349[local1285], local1643, local1648, local1653, local1658, local1663, local1318, this.aFloatArray29);
							local1122 = this.aFloatArray29[0];
							local1124 = this.aFloatArray29[1];
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
			@Pc(2431) byte local2431 = arg1.aByteArray72 == null ? 0 : arg1.aByteArray72[local1067];
			if (local2431 == 0) {
				@Pc(2440) long local2440 = (long) ((local1074 << 8) + local159);
				@Pc(2445) short local2445 = arg1.aShortArray97[local1067];
				@Pc(2450) short local2450 = arg1.aShortArray88[local1067];
				local1275 = arg1.aShortArray92[local1067];
				@Pc(2459) Class428 local2459 = local454[local2445];
				this.aShortArray30[local503] = this.method7028(arg1, local2445, local503, local2440 | local1174 << 24, local2459.anInt4779, local2459.anInt4777, local2459.anInt4778, local2459.anInt4780, local1114, local1116);
				@Pc(2487) Class428 local2487 = local454[local2450];
				this.aShortArray39[local503] = this.method7028(arg1, local2450, local503, local2440 | local1187 << 24, local2487.anInt4779, local2487.anInt4777, local2487.anInt4778, local2487.anInt4780, local1118, local1120);
				@Pc(2515) Class428 local2515 = local454[local1275];
				this.aShortArray36[local503] = this.method7028(arg1, local1275, local503, local2440 | local1200 << 24, local2515.anInt4779, local2515.anInt4777, local2515.anInt4778, local2515.anInt4780, local1122, local1124);
			} else if (local2431 == 1) {
				@Pc(2547) Class418 local2547 = local765[local1067];
				@Pc(2579) long local2579 = ((long) (local2547.anInt4767 & Integer.MIN_VALUE) << 9) + ((long) (local2547.anInt4768 + 256) << 32) + ((long) (local2547.anInt4769 + 256) << 24) + (long) (local1074 << 8) + (long) local159;
				this.aShortArray30[local503] = this.method7028(arg1, arg1.aShortArray97[local1067], local503, local2579 | local1174 << 41, local2547.anInt4767, local2547.anInt4768, local2547.anInt4769, 0, local1114, local1116);
				this.aShortArray39[local503] = this.method7028(arg1, arg1.aShortArray88[local1067], local503, local2579 | local1174 << 41, local2547.anInt4767, local2547.anInt4768, local2547.anInt4769, 0, local1118, local1120);
				this.aShortArray36[local503] = this.method7028(arg1, arg1.aShortArray92[local1067], local503, local2579 | local1174 << 41, local2547.anInt4767, local2547.anInt4768, local2547.anInt4769, 0, local1122, local1124);
			}
			if (arg1.aByteArray74 != null) {
				this.aByteArray23[local503] = arg1.aByteArray74[local1067];
			}
			if (arg1.aShortArray91 != null) {
				this.aShortArray38[local503] = arg1.aShortArray91[local1067];
			}
			this.aShortArray34[local503] = arg1.aShortArray89[local1067];
			this.aShortArray33[local503] = local1096;
		}
		if (this.anInt820 > 0) {
			local503 = 1;
			local776 = this.aShortArray33[0];
			for (local1074 = 0; local1074 < this.anInt820; local1074++) {
				local786 = this.aShortArray33[local1074];
				if (local786 != local776) {
					local503++;
					local776 = local786;
				}
			}
			this.anIntArray73 = new int[local503];
			this.anIntArray75 = new int[local503];
			this.anIntArray74 = new int[local503 + 1];
			this.anIntArray74[0] = 0;
			local1074 = this.anInt817;
			local159 = 0;
			local503 = 0;
			local776 = this.aShortArray33[0];
			for (local796 = 0; local796 < this.anInt820; local796++) {
				@Pc(2765) short local2765 = this.aShortArray33[local796];
				if (local2765 != local776) {
					this.anIntArray73[local503] = local1074;
					this.anIntArray75[local503] = local159 - local1074 + 1;
					local503++;
					this.anIntArray74[local503] = local796;
					local1074 = this.anInt817;
					local159 = 0;
					local776 = local2765;
				}
				local816 = this.aShortArray30[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
				local816 = this.aShortArray39[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
				local816 = this.aShortArray36[local796] & 0xFFFF;
				if (local816 < local1074) {
					local1074 = local816;
				}
				if (local816 > local159) {
					local159 = local816;
				}
			}
			this.anIntArray73[local503] = local1074;
			this.anIntArray75[local503] = local159 - local1074 + 1;
			local503++;
			this.anIntArray74[local503] = this.anInt820;
		}
		this.aLongArray9 = null;
		this.aShortArray29 = method7036(this.aShortArray29, this.anInt817);
		this.aShortArray27 = method7036(this.aShortArray27, this.anInt817);
		this.aShortArray35 = method7036(this.aShortArray35, this.anInt817);
		this.aShortArray31 = method7036(this.aShortArray31, this.anInt817);
		this.aShortArray32 = method7036(this.aShortArray32, this.anInt817);
		this.aByteArray24 = method7034(this.aByteArray24, this.anInt817);
		this.aFloatArray28 = method7040(this.aFloatArray28, this.anInt817);
		this.aFloatArray30 = method7040(this.aFloatArray30, this.anInt817);
		if (arg1.anIntArray340 != null && Class396.method28449(arg2, this.anInt813)) {
			this.anIntArrayArray14 = arg1.method25672(false);
		}
		if (arg1.aClass227Array1 != null && Class396.method28453(arg2, this.anInt813)) {
			this.anIntArrayArray16 = arg1.method25679();
		}
		if (arg1.anIntArray343 != null && Class396.method28448(arg2, this.anInt813)) {
			local503 = 0;
			@Pc(2966) int[] local2966 = new int[256];
			for (local1074 = 0; local1074 < this.anInt818; local1074++) {
				local159 = arg1.anIntArray343[local16[local1074]];
				if (local159 >= 0) {
					@Pc(2985) int local2985 = local2966[local159]++;
					if (local159 > local503) {
						local503 = local159;
					}
				}
			}
			this.anIntArrayArray15 = new int[local503 + 1][];
			for (local1074 = 0; local1074 <= local503; local1074++) {
				this.anIntArrayArray15[local1074] = new int[local2966[local1074]];
				local2966[local1074] = 0;
			}
			for (local1074 = 0; local1074 < this.anInt818; local1074++) {
				local159 = arg1.anIntArray343[local16[local1074]];
				if (local159 >= 0) {
					this.anIntArrayArray15[local159][local2966[local159]++] = local1074;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "hb", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7028(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "io", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7029(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "ij", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7030(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "iq", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7031(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "ig", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7032(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "iv", descriptor = "(Lclient!dq;IIJIIIIFF)S", line = 667)
	short method7033(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(11) int local11 = this.anIntArray76[arg1 + 1];
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
		this.aShortArray37[local13] = (short) (this.anInt817 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray27[this.anInt817] = (short) arg2;
		this.aShortArray29[this.anInt817] = (short) arg1;
		this.aShortArray35[this.anInt817] = (short) arg4;
		this.aShortArray31[this.anInt817] = (short) arg5;
		this.aShortArray32[this.anInt817] = (short) arg6;
		this.aByteArray24[this.anInt817] = (byte) arg7;
		this.aFloatArray28[this.anInt817] = arg8;
		this.aFloatArray30[this.anInt817] = arg9;
		return (short) this.anInt817++;
	}

	@OriginalMember(owner = "client!afo", name = "hg", descriptor = "([BI)[B", line = 692)
	static byte[] method7034(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "ie", descriptor = "([BI)[B", line = 692)
	static byte[] method7035(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "hd", descriptor = "([SI)[S", line = 698)
	static short[] method7036(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "iu", descriptor = "([FI)[F", line = 704)
	static float[] method7037(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "in", descriptor = "([FI)[F", line = 704)
	static float[] method7038(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "ir", descriptor = "([FI)[F", line = 704)
	static float[] method7039(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "hx", descriptor = "([FI)[F", line = 704)
	static float[] method7040(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!afo", name = "z", descriptor = "()I", line = 710)
	@Override
	public int method6875() {
		return this.anInt821;
	}

	@OriginalMember(owner = "client!afo", name = "ba", descriptor = "()I", line = 710)
	@Override
	public int method6923() {
		return this.anInt821;
	}

	@OriginalMember(owner = "client!afo", name = "bp", descriptor = "()I", line = 710)
	@Override
	public int method6924() {
		return this.anInt821;
	}

	@OriginalMember(owner = "client!afo", name = "u", descriptor = "(I)V", line = 714)
	@Override
	public void method6874(@OriginalArg(0) int arg0) {
		if (this.aClass417_1 != null) {
			this.aClass417_1.aBoolean755 = Class396.method28411(arg0, this.anInt813);
		}
		if (this.aClass417_4 != null) {
			this.aClass417_4.aBoolean755 = Class396.method28418(arg0, this.anInt813);
		}
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean755 = Class396.method28415(arg0, this.anInt813);
		}
		if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean755 = Class396.method28414(arg0, this.anInt813);
		}
		this.anInt821 = arg0;
		if (this.aClass423_1 != null && (this.anInt821 & 0x10000) == 0) {
			this.aShortArray35 = this.aClass423_1.aShortArray128;
			this.aShortArray31 = this.aClass423_1.aShortArray127;
			this.aShortArray32 = this.aClass423_1.aShortArray129;
			this.aByteArray24 = this.aClass423_1.aByteArray92;
			this.aClass423_1 = null;
		}
		this.aBoolean167 = true;
		this.method7047();
	}

	@OriginalMember(owner = "client!afo", name = "bj", descriptor = "(I)V", line = 714)
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		if (this.aClass417_1 != null) {
			this.aClass417_1.aBoolean755 = Class396.method28411(arg0, this.anInt813);
		}
		if (this.aClass417_4 != null) {
			this.aClass417_4.aBoolean755 = Class396.method28418(arg0, this.anInt813);
		}
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean755 = Class396.method28415(arg0, this.anInt813);
		}
		if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean755 = Class396.method28414(arg0, this.anInt813);
		}
		this.anInt821 = arg0;
		if (this.aClass423_1 != null && (this.anInt821 & 0x10000) == 0) {
			this.aShortArray35 = this.aClass423_1.aShortArray128;
			this.aShortArray31 = this.aClass423_1.aShortArray127;
			this.aShortArray32 = this.aClass423_1.aShortArray129;
			this.aByteArray24 = this.aClass423_1.aByteArray92;
			this.aClass423_1 = null;
		}
		this.aBoolean167 = true;
		this.method7047();
	}

	@OriginalMember(owner = "client!afo", name = "bs", descriptor = "(I)V", line = 714)
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		if (this.aClass417_1 != null) {
			this.aClass417_1.aBoolean755 = Class396.method28411(arg0, this.anInt813);
		}
		if (this.aClass417_4 != null) {
			this.aClass417_4.aBoolean755 = Class396.method28418(arg0, this.anInt813);
		}
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean755 = Class396.method28415(arg0, this.anInt813);
		}
		if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean755 = Class396.method28414(arg0, this.anInt813);
		}
		this.anInt821 = arg0;
		if (this.aClass423_1 != null && (this.anInt821 & 0x10000) == 0) {
			this.aShortArray35 = this.aClass423_1.aShortArray128;
			this.aShortArray31 = this.aClass423_1.aShortArray127;
			this.aShortArray32 = this.aClass423_1.aShortArray129;
			this.aByteArray24 = this.aClass423_1.aByteArray92;
			this.aClass423_1 = null;
		}
		this.aBoolean167 = true;
		this.method7047();
	}

	@OriginalMember(owner = "client!afo", name = "p", descriptor = "()V", line = 731)
	@Override
	public void method6979() {
		if (this.anInt817 > 0 && this.anInt820 > 0) {
			this.method7078();
			this.method7072();
			this.method7047();
		}
	}

	@OriginalMember(owner = "client!afo", name = "cl", descriptor = "()V", line = 731)
	@Override
	public void method6927() {
		if (this.anInt817 > 0 && this.anInt820 > 0) {
			this.method7078();
			this.method7072();
			this.method7047();
		}
	}

	@OriginalMember(owner = "client!afo", name = "l", descriptor = "(BIZ)Lclient!do;", line = 740)
	@Override
	public Class109 method6938(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub3 local22;
		@Pc(14) Class109_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub2_4.aClass109_Sub3Array6[arg0 - 1];
			local22 = this.aClass104_Sub2_4.aClass109_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub3(this.aClass104_Sub2_4, 0, 0, true, false);
		}
		return this.method7041(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afo", name = "br", descriptor = "(BIZ)Lclient!do;", line = 740)
	@Override
	public Class109 method6922(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub3 local22;
		@Pc(14) Class109_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub2_4.aClass109_Sub3Array6[arg0 - 1];
			local22 = this.aClass104_Sub2_4.aClass109_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub3(this.aClass104_Sub2_4, 0, 0, true, false);
		}
		return this.method7041(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afo", name = "bg", descriptor = "(BIZ)Lclient!do;", line = 740)
	@Override
	public Class109 method7024(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class109_Sub3 local22;
		@Pc(14) Class109_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass104_Sub2_4.aClass109_Sub3Array6[arg0 - 1];
			local22 = this.aClass104_Sub2_4.aClass109_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class109_Sub3(this.aClass104_Sub2_4, 0, 0, true, false);
		}
		return this.method7041(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!afo", name = "hq", descriptor = "(Lclient!afo;Lclient!afo;IZZ)Lclient!do;", line = 753)
	Class109 method7041(@OriginalArg(0) Class109_Sub3 arg0, @OriginalArg(1) Class109_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt821 = arg2;
		arg0.anInt813 = this.anInt813;
		arg0.aShort66 = this.aShort66;
		arg0.aShort67 = this.aShort67;
		arg0.anInt814 = this.anInt814;
		arg0.anInt815 = this.anInt815;
		arg0.anInt817 = this.anInt817;
		arg0.anInt818 = this.anInt818;
		arg0.anInt820 = this.anInt820;
		arg0.anInt828 = this.anInt828;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean168 = this.aBoolean168;
		} else {
			arg0.aBoolean168 = true;
		}
		arg0.aBoolean163 = this.aBoolean163;
		@Pc(59) boolean local59 = Class396.method28354(arg2, this.anInt813);
		@Pc(64) boolean local64 = Class396.method28355(arg2, this.anInt813);
		@Pc(69) boolean local69 = Class396.method28360(arg2, this.anInt813);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt814) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt814];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt814) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt814];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local69) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt814) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt814];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			for (local166 = 0; local166 < this.anInt814; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local69) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray71 = this.anIntArray71;
		}
		if (Class396.method28411(arg2, this.anInt813)) {
			arg0.aClass417_1 = arg1.aClass417_1;
			arg0.aClass417_1.anInterface37_23 = this.aClass417_1.anInterface37_23;
			arg0.aClass417_1.aBoolean756 = this.aClass417_1.aBoolean756;
			arg0.aClass417_1.aBoolean755 = true;
		} else if (Class396.method28392(arg2, this.anInt813)) {
			arg0.aClass417_1 = this.aClass417_1;
		} else {
			arg0.aClass417_1 = null;
		}
		if (Class396.method28371(arg2, this.anInt813)) {
			if (arg1.aShortArray34 == null || arg1.aShortArray34.length < this.anInt818) {
				arg0.aShortArray34 = arg1.aShortArray34 = new short[this.anInt818];
			} else {
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class396.method28373(arg2, this.anInt813)) {
			if (arg1.aByteArray23 == null || arg1.aByteArray23.length < this.anInt818) {
				arg0.aByteArray23 = arg1.aByteArray23 = new byte[this.anInt818];
			} else {
				arg0.aByteArray23 = arg1.aByteArray23;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aByteArray23[local166] = this.aByteArray23[local166];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Class396.method28415(arg2, this.anInt813)) {
			arg0.aClass417_2 = arg1.aClass417_2;
			arg0.aClass417_2.anInterface37_23 = this.aClass417_2.anInterface37_23;
			arg0.aClass417_2.aBoolean756 = this.aClass417_2.aBoolean756;
			arg0.aClass417_2.aBoolean755 = true;
		} else if (Class396.method28399(arg2, this.anInt813)) {
			arg0.aClass417_2 = this.aClass417_2;
		} else {
			arg0.aClass417_2 = null;
		}
		@Pc(469) int local469;
		if (Class396.method28367(arg2, this.anInt813)) {
			if (arg1.aShortArray35 == null || arg1.aShortArray35.length < this.anInt817) {
				local166 = this.anInt817;
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray31 = arg1.aShortArray31 = new short[local166];
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray31 = arg1.aShortArray31;
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			if (this.aClass423_1 == null) {
				arg0.aClass423_1 = null;
				for (local166 = 0; local166 < this.anInt817; local166++) {
					arg0.aShortArray35[local166] = this.aShortArray35[local166];
					arg0.aShortArray31[local166] = this.aShortArray31[local166];
					arg0.aShortArray32[local166] = this.aShortArray32[local166];
				}
			} else {
				if (arg1.aClass423_1 == null) {
					arg1.aClass423_1 = new Class423();
				}
				@Pc(457) Class423 local457 = arg0.aClass423_1 = arg1.aClass423_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt817) {
					local469 = this.anInt817;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt817; local469++) {
					arg0.aShortArray35[local469] = this.aShortArray35[local469];
					arg0.aShortArray31[local469] = this.aShortArray31[local469];
					arg0.aShortArray32[local469] = this.aShortArray32[local469];
					local457.aShortArray128[local469] = this.aClass423_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass423_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass423_1.aShortArray129[local469];
					local457.aByteArray92[local469] = this.aClass423_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aClass423_1 = this.aClass423_1;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray31 = this.aShortArray31;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aByteArray24 = this.aByteArray24;
		}
		if (Class396.method28414(arg2, this.anInt813)) {
			arg0.aClass417_3 = arg1.aClass417_3;
			arg0.aClass417_3.anInterface37_23 = this.aClass417_3.anInterface37_23;
			arg0.aClass417_3.aBoolean756 = this.aClass417_3.aBoolean756;
			arg0.aClass417_3.aBoolean755 = true;
		} else if (Class396.method28396(arg2, this.anInt813)) {
			arg0.aClass417_3 = this.aClass417_3;
		} else {
			arg0.aClass417_3 = null;
		}
		if (Class396.method28375(arg2, this.anInt813)) {
			if (arg1.aFloatArray28 == null || arg1.aFloatArray28.length < this.anInt818) {
				local166 = this.anInt817;
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
			} else {
				arg0.aFloatArray28 = arg1.aFloatArray28;
				arg0.aFloatArray30 = arg1.aFloatArray30;
			}
			for (local166 = 0; local166 < this.anInt817; local166++) {
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
			}
		} else {
			arg0.aFloatArray28 = this.aFloatArray28;
			arg0.aFloatArray30 = this.aFloatArray30;
		}
		if (Class396.method28418(arg2, this.anInt813)) {
			arg0.aClass417_4 = arg1.aClass417_4;
			arg0.aClass417_4.anInterface37_23 = this.aClass417_4.anInterface37_23;
			arg0.aClass417_4.aBoolean756 = this.aClass417_4.aBoolean756;
			arg0.aClass417_4.aBoolean755 = true;
		} else if (Class396.method28404(arg2, this.anInt813)) {
			arg0.aClass417_4 = this.aClass417_4;
		} else {
			arg0.aClass417_4 = null;
		}
		if (Class396.method28377(arg2, this.anInt813)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray36 = arg1.aShortArray36;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray30[local166] = this.aShortArray30[local166];
				arg0.aShortArray39[local166] = this.aShortArray39[local166];
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
			}
		} else {
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray36 = this.aShortArray36;
		}
		if (Class396.method28423(arg2, this.anInt813)) {
			arg0.aClass394_1 = arg1.aClass394_1;
			arg0.aClass394_1.anInterface40_6 = this.aClass394_1.anInterface40_6;
			arg0.aClass394_1.aBoolean744 = this.aClass394_1.aBoolean744;
			arg0.aClass394_1.aBoolean745 = true;
		} else if (Class396.method28407(arg2, this.anInt813)) {
			arg0.aClass394_1 = this.aClass394_1;
		} else {
			arg0.aClass394_1 = null;
		}
		if (Class396.method28380(arg2, this.anInt813)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class396.method28386(arg2, this.anInt813)) {
			arg0.aClass409Array1 = this.aClass409Array1;
		} else if (arg1.aClass409Array1 == null || arg1.aClass409Array1.length < this.anInt828) {
			local166 = this.anInt828;
			arg0.aClass409Array1 = arg1.aClass409Array1 = new Class409[local166];
			for (local469 = 0; local469 < this.anInt828; local469++) {
				arg0.aClass409Array1[local469] = this.aClass409Array1[local469].method28585();
			}
		} else {
			arg0.aClass409Array1 = arg1.aClass409Array1;
			for (local166 = 0; local166 < this.anInt828; local166++) {
				arg0.aClass409Array1[local166].method28587(this.aClass409Array1[local166]);
			}
		}
		arg0.aClass416Array1 = this.aClass416Array1;
		if (this.aBoolean165) {
			arg0.anInt823 = this.anInt823;
			arg0.anInt824 = this.anInt824;
			arg0.anInt827 = this.anInt827;
			arg0.anInt819 = this.anInt819;
			arg0.anInt825 = this.anInt825;
			arg0.anInt826 = this.anInt826;
			arg0.anInt816 = this.anInt816;
			arg0.anInt811 = this.anInt811;
			arg0.aBoolean165 = true;
		} else {
			arg0.aBoolean165 = false;
		}
		if (this.aBoolean169) {
			arg0.anInt829 = this.anInt829;
			arg0.aBoolean169 = true;
		} else {
			arg0.aBoolean169 = false;
		}
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray76 = this.anIntArray76;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray38 = this.aShortArray38;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray75 = this.anIntArray75;
		arg0.anIntArray73 = this.anIntArray73;
		arg0.aClass234Array3 = this.aClass234Array3;
		arg0.aClass210Array3 = this.aClass210Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afo", name = "it", descriptor = "(Lclient!afo;Lclient!afo;IZZ)Lclient!do;", line = 753)
	Class109 method7042(@OriginalArg(0) Class109_Sub3 arg0, @OriginalArg(1) Class109_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt821 = arg2;
		arg0.anInt813 = this.anInt813;
		arg0.aShort66 = this.aShort66;
		arg0.aShort67 = this.aShort67;
		arg0.anInt814 = this.anInt814;
		arg0.anInt815 = this.anInt815;
		arg0.anInt817 = this.anInt817;
		arg0.anInt818 = this.anInt818;
		arg0.anInt820 = this.anInt820;
		arg0.anInt828 = this.anInt828;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean168 = this.aBoolean168;
		} else {
			arg0.aBoolean168 = true;
		}
		arg0.aBoolean163 = this.aBoolean163;
		@Pc(59) boolean local59 = Class396.method28354(arg2, this.anInt813);
		@Pc(64) boolean local64 = Class396.method28355(arg2, this.anInt813);
		@Pc(69) boolean local69 = Class396.method28360(arg2, this.anInt813);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt814) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt814];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt814) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt814];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local69) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt814) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt814];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			for (local166 = 0; local166 < this.anInt814; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local69) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray71 = this.anIntArray71;
		}
		if (Class396.method28411(arg2, this.anInt813)) {
			arg0.aClass417_1 = arg1.aClass417_1;
			arg0.aClass417_1.anInterface37_23 = this.aClass417_1.anInterface37_23;
			arg0.aClass417_1.aBoolean756 = this.aClass417_1.aBoolean756;
			arg0.aClass417_1.aBoolean755 = true;
		} else if (Class396.method28392(arg2, this.anInt813)) {
			arg0.aClass417_1 = this.aClass417_1;
		} else {
			arg0.aClass417_1 = null;
		}
		if (Class396.method28371(arg2, this.anInt813)) {
			if (arg1.aShortArray34 == null || arg1.aShortArray34.length < this.anInt818) {
				arg0.aShortArray34 = arg1.aShortArray34 = new short[this.anInt818];
			} else {
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class396.method28373(arg2, this.anInt813)) {
			if (arg1.aByteArray23 == null || arg1.aByteArray23.length < this.anInt818) {
				arg0.aByteArray23 = arg1.aByteArray23 = new byte[this.anInt818];
			} else {
				arg0.aByteArray23 = arg1.aByteArray23;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aByteArray23[local166] = this.aByteArray23[local166];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Class396.method28415(arg2, this.anInt813)) {
			arg0.aClass417_2 = arg1.aClass417_2;
			arg0.aClass417_2.anInterface37_23 = this.aClass417_2.anInterface37_23;
			arg0.aClass417_2.aBoolean756 = this.aClass417_2.aBoolean756;
			arg0.aClass417_2.aBoolean755 = true;
		} else if (Class396.method28399(arg2, this.anInt813)) {
			arg0.aClass417_2 = this.aClass417_2;
		} else {
			arg0.aClass417_2 = null;
		}
		@Pc(469) int local469;
		if (Class396.method28367(arg2, this.anInt813)) {
			if (arg1.aShortArray35 == null || arg1.aShortArray35.length < this.anInt817) {
				local166 = this.anInt817;
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray31 = arg1.aShortArray31 = new short[local166];
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray31 = arg1.aShortArray31;
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			if (this.aClass423_1 == null) {
				arg0.aClass423_1 = null;
				for (local166 = 0; local166 < this.anInt817; local166++) {
					arg0.aShortArray35[local166] = this.aShortArray35[local166];
					arg0.aShortArray31[local166] = this.aShortArray31[local166];
					arg0.aShortArray32[local166] = this.aShortArray32[local166];
				}
			} else {
				if (arg1.aClass423_1 == null) {
					arg1.aClass423_1 = new Class423();
				}
				@Pc(457) Class423 local457 = arg0.aClass423_1 = arg1.aClass423_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt817) {
					local469 = this.anInt817;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt817; local469++) {
					arg0.aShortArray35[local469] = this.aShortArray35[local469];
					arg0.aShortArray31[local469] = this.aShortArray31[local469];
					arg0.aShortArray32[local469] = this.aShortArray32[local469];
					local457.aShortArray128[local469] = this.aClass423_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass423_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass423_1.aShortArray129[local469];
					local457.aByteArray92[local469] = this.aClass423_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aClass423_1 = this.aClass423_1;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray31 = this.aShortArray31;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aByteArray24 = this.aByteArray24;
		}
		if (Class396.method28414(arg2, this.anInt813)) {
			arg0.aClass417_3 = arg1.aClass417_3;
			arg0.aClass417_3.anInterface37_23 = this.aClass417_3.anInterface37_23;
			arg0.aClass417_3.aBoolean756 = this.aClass417_3.aBoolean756;
			arg0.aClass417_3.aBoolean755 = true;
		} else if (Class396.method28396(arg2, this.anInt813)) {
			arg0.aClass417_3 = this.aClass417_3;
		} else {
			arg0.aClass417_3 = null;
		}
		if (Class396.method28375(arg2, this.anInt813)) {
			if (arg1.aFloatArray28 == null || arg1.aFloatArray28.length < this.anInt818) {
				local166 = this.anInt817;
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
			} else {
				arg0.aFloatArray28 = arg1.aFloatArray28;
				arg0.aFloatArray30 = arg1.aFloatArray30;
			}
			for (local166 = 0; local166 < this.anInt817; local166++) {
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
			}
		} else {
			arg0.aFloatArray28 = this.aFloatArray28;
			arg0.aFloatArray30 = this.aFloatArray30;
		}
		if (Class396.method28418(arg2, this.anInt813)) {
			arg0.aClass417_4 = arg1.aClass417_4;
			arg0.aClass417_4.anInterface37_23 = this.aClass417_4.anInterface37_23;
			arg0.aClass417_4.aBoolean756 = this.aClass417_4.aBoolean756;
			arg0.aClass417_4.aBoolean755 = true;
		} else if (Class396.method28404(arg2, this.anInt813)) {
			arg0.aClass417_4 = this.aClass417_4;
		} else {
			arg0.aClass417_4 = null;
		}
		if (Class396.method28377(arg2, this.anInt813)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray36 = arg1.aShortArray36;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray30[local166] = this.aShortArray30[local166];
				arg0.aShortArray39[local166] = this.aShortArray39[local166];
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
			}
		} else {
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray36 = this.aShortArray36;
		}
		if (Class396.method28423(arg2, this.anInt813)) {
			arg0.aClass394_1 = arg1.aClass394_1;
			arg0.aClass394_1.anInterface40_6 = this.aClass394_1.anInterface40_6;
			arg0.aClass394_1.aBoolean744 = this.aClass394_1.aBoolean744;
			arg0.aClass394_1.aBoolean745 = true;
		} else if (Class396.method28407(arg2, this.anInt813)) {
			arg0.aClass394_1 = this.aClass394_1;
		} else {
			arg0.aClass394_1 = null;
		}
		if (Class396.method28380(arg2, this.anInt813)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class396.method28386(arg2, this.anInt813)) {
			arg0.aClass409Array1 = this.aClass409Array1;
		} else if (arg1.aClass409Array1 == null || arg1.aClass409Array1.length < this.anInt828) {
			local166 = this.anInt828;
			arg0.aClass409Array1 = arg1.aClass409Array1 = new Class409[local166];
			for (local469 = 0; local469 < this.anInt828; local469++) {
				arg0.aClass409Array1[local469] = this.aClass409Array1[local469].method28585();
			}
		} else {
			arg0.aClass409Array1 = arg1.aClass409Array1;
			for (local166 = 0; local166 < this.anInt828; local166++) {
				arg0.aClass409Array1[local166].method28587(this.aClass409Array1[local166]);
			}
		}
		arg0.aClass416Array1 = this.aClass416Array1;
		if (this.aBoolean165) {
			arg0.anInt823 = this.anInt823;
			arg0.anInt824 = this.anInt824;
			arg0.anInt827 = this.anInt827;
			arg0.anInt819 = this.anInt819;
			arg0.anInt825 = this.anInt825;
			arg0.anInt826 = this.anInt826;
			arg0.anInt816 = this.anInt816;
			arg0.anInt811 = this.anInt811;
			arg0.aBoolean165 = true;
		} else {
			arg0.aBoolean165 = false;
		}
		if (this.aBoolean169) {
			arg0.anInt829 = this.anInt829;
			arg0.aBoolean169 = true;
		} else {
			arg0.aBoolean169 = false;
		}
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray76 = this.anIntArray76;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray38 = this.aShortArray38;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray75 = this.anIntArray75;
		arg0.anIntArray73 = this.anIntArray73;
		arg0.aClass234Array3 = this.aClass234Array3;
		arg0.aClass210Array3 = this.aClass210Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afo", name = "ix", descriptor = "(Lclient!afo;Lclient!afo;IZZ)Lclient!do;", line = 753)
	Class109 method7043(@OriginalArg(0) Class109_Sub3 arg0, @OriginalArg(1) Class109_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt821 = arg2;
		arg0.anInt813 = this.anInt813;
		arg0.aShort66 = this.aShort66;
		arg0.aShort67 = this.aShort67;
		arg0.anInt814 = this.anInt814;
		arg0.anInt815 = this.anInt815;
		arg0.anInt817 = this.anInt817;
		arg0.anInt818 = this.anInt818;
		arg0.anInt820 = this.anInt820;
		arg0.anInt828 = this.anInt828;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean168 = this.aBoolean168;
		} else {
			arg0.aBoolean168 = true;
		}
		arg0.aBoolean163 = this.aBoolean163;
		@Pc(59) boolean local59 = Class396.method28354(arg2, this.anInt813);
		@Pc(64) boolean local64 = Class396.method28355(arg2, this.anInt813);
		@Pc(69) boolean local69 = Class396.method28360(arg2, this.anInt813);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt814) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt814];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt814) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt814];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local69) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt814) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt814];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			for (local166 = 0; local166 < this.anInt814; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local69) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray71 = this.anIntArray71;
		}
		if (Class396.method28411(arg2, this.anInt813)) {
			arg0.aClass417_1 = arg1.aClass417_1;
			arg0.aClass417_1.anInterface37_23 = this.aClass417_1.anInterface37_23;
			arg0.aClass417_1.aBoolean756 = this.aClass417_1.aBoolean756;
			arg0.aClass417_1.aBoolean755 = true;
		} else if (Class396.method28392(arg2, this.anInt813)) {
			arg0.aClass417_1 = this.aClass417_1;
		} else {
			arg0.aClass417_1 = null;
		}
		if (Class396.method28371(arg2, this.anInt813)) {
			if (arg1.aShortArray34 == null || arg1.aShortArray34.length < this.anInt818) {
				arg0.aShortArray34 = arg1.aShortArray34 = new short[this.anInt818];
			} else {
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class396.method28373(arg2, this.anInt813)) {
			if (arg1.aByteArray23 == null || arg1.aByteArray23.length < this.anInt818) {
				arg0.aByteArray23 = arg1.aByteArray23 = new byte[this.anInt818];
			} else {
				arg0.aByteArray23 = arg1.aByteArray23;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aByteArray23[local166] = this.aByteArray23[local166];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Class396.method28415(arg2, this.anInt813)) {
			arg0.aClass417_2 = arg1.aClass417_2;
			arg0.aClass417_2.anInterface37_23 = this.aClass417_2.anInterface37_23;
			arg0.aClass417_2.aBoolean756 = this.aClass417_2.aBoolean756;
			arg0.aClass417_2.aBoolean755 = true;
		} else if (Class396.method28399(arg2, this.anInt813)) {
			arg0.aClass417_2 = this.aClass417_2;
		} else {
			arg0.aClass417_2 = null;
		}
		@Pc(469) int local469;
		if (Class396.method28367(arg2, this.anInt813)) {
			if (arg1.aShortArray35 == null || arg1.aShortArray35.length < this.anInt817) {
				local166 = this.anInt817;
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray31 = arg1.aShortArray31 = new short[local166];
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray31 = arg1.aShortArray31;
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			if (this.aClass423_1 == null) {
				arg0.aClass423_1 = null;
				for (local166 = 0; local166 < this.anInt817; local166++) {
					arg0.aShortArray35[local166] = this.aShortArray35[local166];
					arg0.aShortArray31[local166] = this.aShortArray31[local166];
					arg0.aShortArray32[local166] = this.aShortArray32[local166];
				}
			} else {
				if (arg1.aClass423_1 == null) {
					arg1.aClass423_1 = new Class423();
				}
				@Pc(457) Class423 local457 = arg0.aClass423_1 = arg1.aClass423_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt817) {
					local469 = this.anInt817;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt817; local469++) {
					arg0.aShortArray35[local469] = this.aShortArray35[local469];
					arg0.aShortArray31[local469] = this.aShortArray31[local469];
					arg0.aShortArray32[local469] = this.aShortArray32[local469];
					local457.aShortArray128[local469] = this.aClass423_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass423_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass423_1.aShortArray129[local469];
					local457.aByteArray92[local469] = this.aClass423_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aClass423_1 = this.aClass423_1;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray31 = this.aShortArray31;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aByteArray24 = this.aByteArray24;
		}
		if (Class396.method28414(arg2, this.anInt813)) {
			arg0.aClass417_3 = arg1.aClass417_3;
			arg0.aClass417_3.anInterface37_23 = this.aClass417_3.anInterface37_23;
			arg0.aClass417_3.aBoolean756 = this.aClass417_3.aBoolean756;
			arg0.aClass417_3.aBoolean755 = true;
		} else if (Class396.method28396(arg2, this.anInt813)) {
			arg0.aClass417_3 = this.aClass417_3;
		} else {
			arg0.aClass417_3 = null;
		}
		if (Class396.method28375(arg2, this.anInt813)) {
			if (arg1.aFloatArray28 == null || arg1.aFloatArray28.length < this.anInt818) {
				local166 = this.anInt817;
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
			} else {
				arg0.aFloatArray28 = arg1.aFloatArray28;
				arg0.aFloatArray30 = arg1.aFloatArray30;
			}
			for (local166 = 0; local166 < this.anInt817; local166++) {
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
			}
		} else {
			arg0.aFloatArray28 = this.aFloatArray28;
			arg0.aFloatArray30 = this.aFloatArray30;
		}
		if (Class396.method28418(arg2, this.anInt813)) {
			arg0.aClass417_4 = arg1.aClass417_4;
			arg0.aClass417_4.anInterface37_23 = this.aClass417_4.anInterface37_23;
			arg0.aClass417_4.aBoolean756 = this.aClass417_4.aBoolean756;
			arg0.aClass417_4.aBoolean755 = true;
		} else if (Class396.method28404(arg2, this.anInt813)) {
			arg0.aClass417_4 = this.aClass417_4;
		} else {
			arg0.aClass417_4 = null;
		}
		if (Class396.method28377(arg2, this.anInt813)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray36 = arg1.aShortArray36;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray30[local166] = this.aShortArray30[local166];
				arg0.aShortArray39[local166] = this.aShortArray39[local166];
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
			}
		} else {
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray36 = this.aShortArray36;
		}
		if (Class396.method28423(arg2, this.anInt813)) {
			arg0.aClass394_1 = arg1.aClass394_1;
			arg0.aClass394_1.anInterface40_6 = this.aClass394_1.anInterface40_6;
			arg0.aClass394_1.aBoolean744 = this.aClass394_1.aBoolean744;
			arg0.aClass394_1.aBoolean745 = true;
		} else if (Class396.method28407(arg2, this.anInt813)) {
			arg0.aClass394_1 = this.aClass394_1;
		} else {
			arg0.aClass394_1 = null;
		}
		if (Class396.method28380(arg2, this.anInt813)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class396.method28386(arg2, this.anInt813)) {
			arg0.aClass409Array1 = this.aClass409Array1;
		} else if (arg1.aClass409Array1 == null || arg1.aClass409Array1.length < this.anInt828) {
			local166 = this.anInt828;
			arg0.aClass409Array1 = arg1.aClass409Array1 = new Class409[local166];
			for (local469 = 0; local469 < this.anInt828; local469++) {
				arg0.aClass409Array1[local469] = this.aClass409Array1[local469].method28585();
			}
		} else {
			arg0.aClass409Array1 = arg1.aClass409Array1;
			for (local166 = 0; local166 < this.anInt828; local166++) {
				arg0.aClass409Array1[local166].method28587(this.aClass409Array1[local166]);
			}
		}
		arg0.aClass416Array1 = this.aClass416Array1;
		if (this.aBoolean165) {
			arg0.anInt823 = this.anInt823;
			arg0.anInt824 = this.anInt824;
			arg0.anInt827 = this.anInt827;
			arg0.anInt819 = this.anInt819;
			arg0.anInt825 = this.anInt825;
			arg0.anInt826 = this.anInt826;
			arg0.anInt816 = this.anInt816;
			arg0.anInt811 = this.anInt811;
			arg0.aBoolean165 = true;
		} else {
			arg0.aBoolean165 = false;
		}
		if (this.aBoolean169) {
			arg0.anInt829 = this.anInt829;
			arg0.aBoolean169 = true;
		} else {
			arg0.aBoolean169 = false;
		}
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray76 = this.anIntArray76;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray38 = this.aShortArray38;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray75 = this.anIntArray75;
		arg0.anIntArray73 = this.anIntArray73;
		arg0.aClass234Array3 = this.aClass234Array3;
		arg0.aClass210Array3 = this.aClass210Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afo", name = "is", descriptor = "(Lclient!afo;Lclient!afo;IZZ)Lclient!do;", line = 753)
	Class109 method7044(@OriginalArg(0) Class109_Sub3 arg0, @OriginalArg(1) Class109_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt821 = arg2;
		arg0.anInt813 = this.anInt813;
		arg0.aShort66 = this.aShort66;
		arg0.aShort67 = this.aShort67;
		arg0.anInt814 = this.anInt814;
		arg0.anInt815 = this.anInt815;
		arg0.anInt817 = this.anInt817;
		arg0.anInt818 = this.anInt818;
		arg0.anInt820 = this.anInt820;
		arg0.anInt828 = this.anInt828;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean168 = this.aBoolean168;
		} else {
			arg0.aBoolean168 = true;
		}
		arg0.aBoolean163 = this.aBoolean163;
		@Pc(59) boolean local59 = Class396.method28354(arg2, this.anInt813);
		@Pc(64) boolean local64 = Class396.method28355(arg2, this.anInt813);
		@Pc(69) boolean local69 = Class396.method28360(arg2, this.anInt813);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt814) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt814];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray81 = this.anIntArray81;
			} else if (arg1.anIntArray81 == null || arg1.anIntArray81.length < this.anInt814) {
				arg0.anIntArray81 = arg1.anIntArray81 = new int[this.anInt814];
			} else {
				arg0.anIntArray81 = arg1.anIntArray81;
			}
			if (!local69) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt814) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt814];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			for (local166 = 0; local166 < this.anInt814; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray81[local166] = this.anIntArray81[local166];
				}
				if (local69) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray81 = this.anIntArray81;
			arg0.anIntArray71 = this.anIntArray71;
		}
		if (Class396.method28411(arg2, this.anInt813)) {
			arg0.aClass417_1 = arg1.aClass417_1;
			arg0.aClass417_1.anInterface37_23 = this.aClass417_1.anInterface37_23;
			arg0.aClass417_1.aBoolean756 = this.aClass417_1.aBoolean756;
			arg0.aClass417_1.aBoolean755 = true;
		} else if (Class396.method28392(arg2, this.anInt813)) {
			arg0.aClass417_1 = this.aClass417_1;
		} else {
			arg0.aClass417_1 = null;
		}
		if (Class396.method28371(arg2, this.anInt813)) {
			if (arg1.aShortArray34 == null || arg1.aShortArray34.length < this.anInt818) {
				arg0.aShortArray34 = arg1.aShortArray34 = new short[this.anInt818];
			} else {
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class396.method28373(arg2, this.anInt813)) {
			if (arg1.aByteArray23 == null || arg1.aByteArray23.length < this.anInt818) {
				arg0.aByteArray23 = arg1.aByteArray23 = new byte[this.anInt818];
			} else {
				arg0.aByteArray23 = arg1.aByteArray23;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aByteArray23[local166] = this.aByteArray23[local166];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Class396.method28415(arg2, this.anInt813)) {
			arg0.aClass417_2 = arg1.aClass417_2;
			arg0.aClass417_2.anInterface37_23 = this.aClass417_2.anInterface37_23;
			arg0.aClass417_2.aBoolean756 = this.aClass417_2.aBoolean756;
			arg0.aClass417_2.aBoolean755 = true;
		} else if (Class396.method28399(arg2, this.anInt813)) {
			arg0.aClass417_2 = this.aClass417_2;
		} else {
			arg0.aClass417_2 = null;
		}
		@Pc(469) int local469;
		if (Class396.method28367(arg2, this.anInt813)) {
			if (arg1.aShortArray35 == null || arg1.aShortArray35.length < this.anInt817) {
				local166 = this.anInt817;
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray31 = arg1.aShortArray31 = new short[local166];
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray31 = arg1.aShortArray31;
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			if (this.aClass423_1 == null) {
				arg0.aClass423_1 = null;
				for (local166 = 0; local166 < this.anInt817; local166++) {
					arg0.aShortArray35[local166] = this.aShortArray35[local166];
					arg0.aShortArray31[local166] = this.aShortArray31[local166];
					arg0.aShortArray32[local166] = this.aShortArray32[local166];
				}
			} else {
				if (arg1.aClass423_1 == null) {
					arg1.aClass423_1 = new Class423();
				}
				@Pc(457) Class423 local457 = arg0.aClass423_1 = arg1.aClass423_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt817) {
					local469 = this.anInt817;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray92 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt817; local469++) {
					arg0.aShortArray35[local469] = this.aShortArray35[local469];
					arg0.aShortArray31[local469] = this.aShortArray31[local469];
					arg0.aShortArray32[local469] = this.aShortArray32[local469];
					local457.aShortArray128[local469] = this.aClass423_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass423_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass423_1.aShortArray129[local469];
					local457.aByteArray92[local469] = this.aClass423_1.aByteArray92[local469];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aClass423_1 = this.aClass423_1;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray31 = this.aShortArray31;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aByteArray24 = this.aByteArray24;
		}
		if (Class396.method28414(arg2, this.anInt813)) {
			arg0.aClass417_3 = arg1.aClass417_3;
			arg0.aClass417_3.anInterface37_23 = this.aClass417_3.anInterface37_23;
			arg0.aClass417_3.aBoolean756 = this.aClass417_3.aBoolean756;
			arg0.aClass417_3.aBoolean755 = true;
		} else if (Class396.method28396(arg2, this.anInt813)) {
			arg0.aClass417_3 = this.aClass417_3;
		} else {
			arg0.aClass417_3 = null;
		}
		if (Class396.method28375(arg2, this.anInt813)) {
			if (arg1.aFloatArray28 == null || arg1.aFloatArray28.length < this.anInt818) {
				local166 = this.anInt817;
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local166];
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
			} else {
				arg0.aFloatArray28 = arg1.aFloatArray28;
				arg0.aFloatArray30 = arg1.aFloatArray30;
			}
			for (local166 = 0; local166 < this.anInt817; local166++) {
				arg0.aFloatArray28[local166] = this.aFloatArray28[local166];
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
			}
		} else {
			arg0.aFloatArray28 = this.aFloatArray28;
			arg0.aFloatArray30 = this.aFloatArray30;
		}
		if (Class396.method28418(arg2, this.anInt813)) {
			arg0.aClass417_4 = arg1.aClass417_4;
			arg0.aClass417_4.anInterface37_23 = this.aClass417_4.anInterface37_23;
			arg0.aClass417_4.aBoolean756 = this.aClass417_4.aBoolean756;
			arg0.aClass417_4.aBoolean755 = true;
		} else if (Class396.method28404(arg2, this.anInt813)) {
			arg0.aClass417_4 = this.aClass417_4;
		} else {
			arg0.aClass417_4 = null;
		}
		if (Class396.method28377(arg2, this.anInt813)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray39 = arg1.aShortArray39;
				arg0.aShortArray36 = arg1.aShortArray36;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray30[local166] = this.aShortArray30[local166];
				arg0.aShortArray39[local166] = this.aShortArray39[local166];
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
			}
		} else {
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray36 = this.aShortArray36;
		}
		if (Class396.method28423(arg2, this.anInt813)) {
			arg0.aClass394_1 = arg1.aClass394_1;
			arg0.aClass394_1.anInterface40_6 = this.aClass394_1.anInterface40_6;
			arg0.aClass394_1.aBoolean744 = this.aClass394_1.aBoolean744;
			arg0.aClass394_1.aBoolean745 = true;
		} else if (Class396.method28407(arg2, this.anInt813)) {
			arg0.aClass394_1 = this.aClass394_1;
		} else {
			arg0.aClass394_1 = null;
		}
		if (Class396.method28380(arg2, this.anInt813)) {
			if (arg1.aShortArray33 == null || arg1.aShortArray33.length < this.anInt818) {
				local166 = this.anInt818;
				arg0.aShortArray33 = arg1.aShortArray33 = new short[local166];
			} else {
				arg0.aShortArray33 = arg1.aShortArray33;
			}
			for (local166 = 0; local166 < this.anInt818; local166++) {
				arg0.aShortArray33[local166] = this.aShortArray33[local166];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Class396.method28386(arg2, this.anInt813)) {
			arg0.aClass409Array1 = this.aClass409Array1;
		} else if (arg1.aClass409Array1 == null || arg1.aClass409Array1.length < this.anInt828) {
			local166 = this.anInt828;
			arg0.aClass409Array1 = arg1.aClass409Array1 = new Class409[local166];
			for (local469 = 0; local469 < this.anInt828; local469++) {
				arg0.aClass409Array1[local469] = this.aClass409Array1[local469].method28585();
			}
		} else {
			arg0.aClass409Array1 = arg1.aClass409Array1;
			for (local166 = 0; local166 < this.anInt828; local166++) {
				arg0.aClass409Array1[local166].method28587(this.aClass409Array1[local166]);
			}
		}
		arg0.aClass416Array1 = this.aClass416Array1;
		if (this.aBoolean165) {
			arg0.anInt823 = this.anInt823;
			arg0.anInt824 = this.anInt824;
			arg0.anInt827 = this.anInt827;
			arg0.anInt819 = this.anInt819;
			arg0.anInt825 = this.anInt825;
			arg0.anInt826 = this.anInt826;
			arg0.anInt816 = this.anInt816;
			arg0.anInt811 = this.anInt811;
			arg0.aBoolean165 = true;
		} else {
			arg0.aBoolean165 = false;
		}
		if (this.aBoolean169) {
			arg0.anInt829 = this.anInt829;
			arg0.aBoolean169 = true;
		} else {
			arg0.aBoolean169 = false;
		}
		arg0.anIntArrayArray14 = this.anIntArrayArray14;
		arg0.anIntArrayArray15 = this.anIntArrayArray15;
		arg0.anIntArrayArray16 = this.anIntArrayArray16;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray76 = this.anIntArray76;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray38 = this.aShortArray38;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray75 = this.anIntArray75;
		arg0.anIntArray73 = this.anIntArray73;
		arg0.aClass234Array3 = this.aClass234Array3;
		arg0.aClass210Array3 = this.aClass210Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!afo", name = "ib", descriptor = "()V", line = 1023)
	void method7045() {
		if (!this.aBoolean167) {
			return;
		}
		this.aBoolean167 = false;
		if (this.aClass234Array3 == null && this.aClass210Array3 == null && this.aClass416Array1 == null && !Class396.method28366(this.anInt821, this.anInt813)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class396.method28426(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local23 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray81 != null && !Class396.method28429(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local25 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray71 != null && !Class396.method28430(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local27 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray81 = null;
			}
			if (local27) {
				this.anIntArray71 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray70 == null && this.anIntArray81 == null && this.anIntArray71 == null) {
			this.aShortArray37 = null;
			this.anIntArray76 = null;
		}
		if (this.aByteArray24 != null && !Class396.method28433(this.anInt821, this.anInt813)) {
			label204: {
				label203: {
					if ((this.anInt813 & 0x37) == 0) {
						if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
							break label203;
						}
					} else if (this.aClass417_3 == null || this.aClass417_3.method28700()) {
						break label203;
					}
					this.aBoolean167 = true;
					break label204;
				}
				this.aShortArray32 = null;
				this.aShortArray31 = null;
				this.aShortArray35 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray34 != null && !Class396.method28438(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray34 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aByteArray23 != null && !Class396.method28441(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aByteArray23 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aFloatArray28 != null && !Class396.method28443(this.anInt821, this.anInt813)) {
			if (this.aClass417_4 == null || this.aClass417_4.method28700()) {
				this.aFloatArray30 = null;
				this.aFloatArray28 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray33 != null && !Class396.method28459(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray30 != null && !Class396.method28456(this.anInt821, this.anInt813)) {
			if ((this.aClass394_1 == null || this.aClass394_1.method28324()) && (this.aClass417_2 == null || this.aClass417_2.method28700())) {
				this.aShortArray36 = null;
				this.aShortArray39 = null;
				this.aShortArray30 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray29 != null) {
			if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
				this.aShortArray29 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.anIntArrayArray15 != null && !Class396.method28448(this.anInt821, this.anInt813)) {
			this.anIntArrayArray15 = null;
			this.aShortArray38 = null;
		}
		if (this.anIntArrayArray14 != null && !Class396.method28449(this.anInt821, this.anInt813)) {
			this.anIntArrayArray14 = null;
			this.aShortArray28 = null;
		}
		if (this.anIntArrayArray16 != null && !Class396.method28453(this.anInt821, this.anInt813)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray74 != null && (this.anInt821 & 0x800) == 0 && (this.anInt821 & 0x40000) == 0) {
			this.anIntArray74 = null;
			this.anIntArray75 = null;
			this.anIntArray73 = null;
		}
	}

	@OriginalMember(owner = "client!afo", name = "il", descriptor = "()V", line = 1023)
	void method7046() {
		if (!this.aBoolean167) {
			return;
		}
		this.aBoolean167 = false;
		if (this.aClass234Array3 == null && this.aClass210Array3 == null && this.aClass416Array1 == null && !Class396.method28366(this.anInt821, this.anInt813)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class396.method28426(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local23 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray81 != null && !Class396.method28429(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local25 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray71 != null && !Class396.method28430(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local27 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray81 = null;
			}
			if (local27) {
				this.anIntArray71 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray70 == null && this.anIntArray81 == null && this.anIntArray71 == null) {
			this.aShortArray37 = null;
			this.anIntArray76 = null;
		}
		if (this.aByteArray24 != null && !Class396.method28433(this.anInt821, this.anInt813)) {
			label204: {
				label203: {
					if ((this.anInt813 & 0x37) == 0) {
						if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
							break label203;
						}
					} else if (this.aClass417_3 == null || this.aClass417_3.method28700()) {
						break label203;
					}
					this.aBoolean167 = true;
					break label204;
				}
				this.aShortArray32 = null;
				this.aShortArray31 = null;
				this.aShortArray35 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray34 != null && !Class396.method28438(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray34 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aByteArray23 != null && !Class396.method28441(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aByteArray23 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aFloatArray28 != null && !Class396.method28443(this.anInt821, this.anInt813)) {
			if (this.aClass417_4 == null || this.aClass417_4.method28700()) {
				this.aFloatArray30 = null;
				this.aFloatArray28 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray33 != null && !Class396.method28459(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray30 != null && !Class396.method28456(this.anInt821, this.anInt813)) {
			if ((this.aClass394_1 == null || this.aClass394_1.method28324()) && (this.aClass417_2 == null || this.aClass417_2.method28700())) {
				this.aShortArray36 = null;
				this.aShortArray39 = null;
				this.aShortArray30 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray29 != null) {
			if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
				this.aShortArray29 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.anIntArrayArray15 != null && !Class396.method28448(this.anInt821, this.anInt813)) {
			this.anIntArrayArray15 = null;
			this.aShortArray38 = null;
		}
		if (this.anIntArrayArray14 != null && !Class396.method28449(this.anInt821, this.anInt813)) {
			this.anIntArrayArray14 = null;
			this.aShortArray28 = null;
		}
		if (this.anIntArrayArray16 != null && !Class396.method28453(this.anInt821, this.anInt813)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray74 != null && (this.anInt821 & 0x800) == 0 && (this.anInt821 & 0x40000) == 0) {
			this.anIntArray74 = null;
			this.anIntArray75 = null;
			this.anIntArray73 = null;
		}
	}

	@OriginalMember(owner = "client!afo", name = "hf", descriptor = "()V", line = 1023)
	void method7047() {
		if (!this.aBoolean167) {
			return;
		}
		this.aBoolean167 = false;
		if (this.aClass234Array3 == null && this.aClass210Array3 == null && this.aClass416Array1 == null && !Class396.method28366(this.anInt821, this.anInt813)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class396.method28426(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local23 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray81 != null && !Class396.method28429(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local25 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (this.anIntArray71 != null && !Class396.method28430(this.anInt821, this.anInt813)) {
				if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
					if (!this.aBoolean165) {
						this.method7060();
					}
					local27 = true;
				} else {
					this.aBoolean167 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray81 = null;
			}
			if (local27) {
				this.anIntArray71 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray70 == null && this.anIntArray81 == null && this.anIntArray71 == null) {
			this.aShortArray37 = null;
			this.anIntArray76 = null;
		}
		if (this.aByteArray24 != null && !Class396.method28433(this.anInt821, this.anInt813)) {
			label204: {
				label203: {
					if ((this.anInt813 & 0x37) == 0) {
						if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
							break label203;
						}
					} else if (this.aClass417_3 == null || this.aClass417_3.method28700()) {
						break label203;
					}
					this.aBoolean167 = true;
					break label204;
				}
				this.aShortArray32 = null;
				this.aShortArray31 = null;
				this.aShortArray35 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray34 != null && !Class396.method28438(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray34 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aByteArray23 != null && !Class396.method28441(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aByteArray23 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aFloatArray28 != null && !Class396.method28443(this.anInt821, this.anInt813)) {
			if (this.aClass417_4 == null || this.aClass417_4.method28700()) {
				this.aFloatArray30 = null;
				this.aFloatArray28 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray33 != null && !Class396.method28459(this.anInt821, this.anInt813)) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray30 != null && !Class396.method28456(this.anInt821, this.anInt813)) {
			if ((this.aClass394_1 == null || this.aClass394_1.method28324()) && (this.aClass417_2 == null || this.aClass417_2.method28700())) {
				this.aShortArray36 = null;
				this.aShortArray39 = null;
				this.aShortArray30 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray29 != null) {
			if (this.aClass417_1 == null || this.aClass417_1.method28700()) {
				this.aShortArray29 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass417_2 == null || this.aClass417_2.method28700()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean167 = true;
			}
		}
		if (this.anIntArrayArray15 != null && !Class396.method28448(this.anInt821, this.anInt813)) {
			this.anIntArrayArray15 = null;
			this.aShortArray38 = null;
		}
		if (this.anIntArrayArray14 != null && !Class396.method28449(this.anInt821, this.anInt813)) {
			this.anIntArrayArray14 = null;
			this.aShortArray28 = null;
		}
		if (this.anIntArrayArray16 != null && !Class396.method28453(this.anInt821, this.anInt813)) {
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArray74 != null && (this.anInt821 & 0x800) == 0 && (this.anInt821 & 0x40000) == 0) {
			this.anIntArray74 = null;
			this.anIntArray75 = null;
			this.anIntArray73 = null;
		}
	}

	@OriginalMember(owner = "client!afo", name = "iw", descriptor = "()V", line = 1121)
	void method7048() {
		if (this.aClass417_1 != null) {
			this.aClass417_1.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "hr", descriptor = "()V", line = 1121)
	void method7049() {
		if (this.aClass417_1 != null) {
			this.aClass417_1.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "hs", descriptor = "()V", line = 1125)
	void method7050() {
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ip", descriptor = "()V", line = 1125)
	void method7051() {
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "id", descriptor = "()V", line = 1125)
	void method7052() {
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ia", descriptor = "()V", line = 1125)
	void method7053() {
		if (this.aClass417_2 != null) {
			this.aClass417_2.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "hh", descriptor = "()V", line = 1129)
	void method7054() {
		if ((this.anInt813 & 0x37) == 0) {
			if (this.aClass417_2 != null) {
				this.aClass417_2.aBoolean756 = false;
			}
		} else if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "if", descriptor = "()V", line = 1129)
	void method7055() {
		if ((this.anInt813 & 0x37) == 0) {
			if (this.aClass417_2 != null) {
				this.aClass417_2.aBoolean756 = false;
			}
		} else if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ih", descriptor = "()V", line = 1129)
	void method7056() {
		if ((this.anInt813 & 0x37) == 0) {
			if (this.aClass417_2 != null) {
				this.aClass417_2.aBoolean756 = false;
			}
		} else if (this.aClass417_3 != null) {
			this.aClass417_3.aBoolean756 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "iy", descriptor = "()V", line = 1138)
	void method7057() {
		if (this.aClass394_1 != null) {
			this.aClass394_1.aBoolean744 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "hp", descriptor = "()V", line = 1138)
	void method7058() {
		if (this.aClass394_1 != null) {
			this.aClass394_1.aBoolean744 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ii", descriptor = "()V", line = 1138)
	void method7059() {
		if (this.aClass394_1 != null) {
			this.aClass394_1.aBoolean744 = false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "d", descriptor = "(I)V", line = 1142)
	@Override
	public void method6877(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cg", descriptor = "(I)V", line = 1142)
	@Override
	public void method6920(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ce", descriptor = "(I)V", line = 1142)
	@Override
	public void method6929(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "c", descriptor = "(I)V", line = 1154)
	@Override
	public void method6878(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt815; local9++) {
			local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt817; local9++) {
			local29 = this.aShortArray32[local9] * local3 + this.aShortArray35[local9] * local7 >> 14;
			this.aShortArray32[local9] = (short) (this.aShortArray32[local9] * local7 - this.aShortArray35[local9] * local3 >> 14);
			this.aShortArray35[local9] = (short) local29;
		}
		this.method7049();
		this.method7054();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cu", descriptor = "(I)V", line = 1154)
	@Override
	public void method6930(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt815; local9++) {
			local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt817; local9++) {
			local29 = this.aShortArray32[local9] * local3 + this.aShortArray35[local9] * local7 >> 14;
			this.aShortArray32[local9] = (short) (this.aShortArray32[local9] * local7 - this.aShortArray35[local9] * local3 >> 14);
			this.aShortArray35[local9] = (short) local29;
		}
		this.method7049();
		this.method7054();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "r", descriptor = "(I)V", line = 1172)
	@Override
	public void method7011(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local7 - this.anIntArray71[local9] * local3 >> 14;
			this.anIntArray71[local9] = this.anIntArray81[local9] * local3 + this.anIntArray71[local9] * local7 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ci", descriptor = "(I)V", line = 1172)
	@Override
	public void method6934(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local7 - this.anIntArray71[local9] * local3 >> 14;
			this.anIntArray71[local9] = this.anIntArray81[local9] * local3 + this.anIntArray71[local9] * local7 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cv", descriptor = "(I)V", line = 1172)
	@Override
	public void method6994(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local7 - this.anIntArray71[local9] * local3 >> 14;
			this.anIntArray71[local9] = this.anIntArray81[local9] * local3 + this.anIntArray71[local9] * local7 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cn", descriptor = "(I)V", line = 1172)
	@Override
	public void method6932(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local7 - this.anIntArray71[local9] * local3 >> 14;
			this.anIntArray71[local9] = this.anIntArray81[local9] * local3 + this.anIntArray71[local9] * local7 >> 14;
			this.anIntArray81[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "v", descriptor = "(I)V", line = 1184)
	@Override
	public void method6880(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray81[local9] = this.anIntArray81[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ca", descriptor = "(I)V", line = 1184)
	@Override
	public void method6991(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray81[local9] = this.anIntArray81[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cx", descriptor = "(I)V", line = 1184)
	@Override
	public void method6935(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray81[local9] = this.anIntArray81[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cp", descriptor = "(I)V", line = 1184)
	@Override
	public void method6933(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class464.anIntArray451[arg0];
		@Pc(7) int local7 = Class464.anIntArray452[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt815; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray81[local9] = this.anIntArray81[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cw", descriptor = "(III)V", line = 1196)
	@Override
	public void method7025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray81[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray71[local1] += arg2;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "o", descriptor = "(III)V", line = 1196)
	@Override
	public void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray81[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray71[local1] += arg2;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "s", descriptor = "()V", line = 1206)
	@Override
	public void method6881() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt815; local1++) {
			this.anIntArray71[local1] = -this.anIntArray71[local1];
		}
		for (local1 = 0; local1 < this.anInt817; local1++) {
			this.aShortArray32[local1] = (short) -this.aShortArray32[local1];
		}
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(45) short local45 = this.aShortArray30[local1];
			this.aShortArray30[local1] = this.aShortArray36[local1];
			this.aShortArray36[local1] = local45;
		}
		this.method7049();
		this.method7054();
		this.method7058();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ct", descriptor = "()V", line = 1206)
	@Override
	public void method6937() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt815; local1++) {
			this.anIntArray71[local1] = -this.anIntArray71[local1];
		}
		for (local1 = 0; local1 < this.anInt817; local1++) {
			this.aShortArray32[local1] = (short) -this.aShortArray32[local1];
		}
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(45) short local45 = this.aShortArray30[local1];
			this.aShortArray30[local1] = this.aShortArray36[local1];
			this.aShortArray36[local1] = local45;
		}
		this.method7049();
		this.method7054();
		this.method7058();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "y", descriptor = "(III)V", line = 1220)
	@Override
	public void method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "co", descriptor = "(III)V", line = 1220)
	@Override
	public void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cm", descriptor = "(III)V", line = 1220)
	@Override
	public void method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cf", descriptor = "(III)V", line = 1220)
	@Override
	public void method6910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cr", descriptor = "(III)V", line = 1220)
	@Override
	public void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "cq", descriptor = "(III)V", line = 1220)
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt815; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 >> 7;
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ch", descriptor = "(IILclient!cb;Lclient!cb;III)V", line = 1230)
	@Override
	public void method6942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(9) int local9 = arg4 + this.anInt827;
		@Pc(14) int local14 = arg4 + this.anInt819;
		@Pc(19) int local19 = arg6 + this.anInt816;
		@Pc(24) int local24 = arg6 + this.anInt811;
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
			if (arg2.method2480(local9, local19, -1684553872) == arg5 && arg2.method2480(local14, local19, -1416783272) == arg5 && arg2.method2480(local9, local24, -1928348963) == arg5 && arg2.method2480(local14, local24, -317437025) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt815; local195++) {
				this.anIntArray81[local195] = this.anIntArray81[local195] + arg2.method2475(this.anIntArray70[local195] + arg4, this.anIntArray71[local195] + arg6, -1760671781) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt825;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt815; local239++) {
					local252 = (this.anIntArray81[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray81[local239] += (arg2.method2475(this.anIntArray70[local239] + arg4, this.anIntArray71[local239] + arg6, -1478238515) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt826 - this.anInt825;
					for (local239 = 0; local239 < this.anInt815; local239++) {
						this.anIntArray81[local239] = this.anIntArray81[local239] + (arg3.method2475(this.anIntArray70[local239] + arg4, this.anIntArray71[local239] + arg6, -2132643014) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt826 - this.anInt825;
					for (local239 = 0; local239 < this.anInt815; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray71[local239] + arg6;
						@Pc(468) int local468 = arg2.method2475(local252, local323, -1131981874);
						@Pc(474) int local474 = arg3.method2475(local252, local323, -473107048);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray81[local239] = ((this.anIntArray81[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "q", descriptor = "(IILclient!cb;Lclient!cb;III)V", line = 1230)
	@Override
	public void method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(9) int local9 = arg4 + this.anInt827;
		@Pc(14) int local14 = arg4 + this.anInt819;
		@Pc(19) int local19 = arg6 + this.anInt816;
		@Pc(24) int local24 = arg6 + this.anInt811;
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
			if (arg2.method2480(local9, local19, -1596041787) == arg5 && arg2.method2480(local14, local19, -1985244563) == arg5 && arg2.method2480(local9, local24, -910243035) == arg5 && arg2.method2480(local14, local24, -1820156767) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt815; local195++) {
				this.anIntArray81[local195] = this.anIntArray81[local195] + arg2.method2475(this.anIntArray70[local195] + arg4, this.anIntArray71[local195] + arg6, -1004155704) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt825;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt815; local239++) {
					local252 = (this.anIntArray81[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray81[local239] += (arg2.method2475(this.anIntArray70[local239] + arg4, this.anIntArray71[local239] + arg6, -1763200010) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt826 - this.anInt825;
					for (local239 = 0; local239 < this.anInt815; local239++) {
						this.anIntArray81[local239] = this.anIntArray81[local239] + (arg3.method2475(this.anIntArray70[local239] + arg4, this.anIntArray71[local239] + arg6, -241241060) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt826 - this.anInt825;
					for (local239 = 0; local239 < this.anInt815; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray71[local239] + arg6;
						@Pc(468) int local468 = arg2.method2475(local252, local323, 241329057);
						@Pc(474) int local474 = arg3.method2475(local252, local323, -1520085078);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray81[local239] = ((this.anIntArray81[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "hy", descriptor = "()V", line = 1294)
	void method7060() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt815; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray81[local17];
			@Pc(36) int local36 = this.anIntArray71[local17];
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
		this.anInt827 = local1;
		this.anInt819 = local7;
		this.anInt825 = local3;
		this.anInt826 = local9;
		this.anInt816 = local5;
		this.anInt811 = local11;
		this.anInt824 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt823 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!afo", name = "iz", descriptor = "()V", line = 1294)
	void method7061() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt815; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray81[local17];
			@Pc(36) int local36 = this.anIntArray71[local17];
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
		this.anInt827 = local1;
		this.anInt819 = local7;
		this.anInt825 = local3;
		this.anInt826 = local9;
		this.anInt816 = local5;
		this.anInt811 = local11;
		this.anInt824 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt823 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!afo", name = "bl", descriptor = "()V", line = 1329)
	@Override
	public void method6908() {
		if (this.aBoolean169) {
			return;
		}
		if (!this.aBoolean165) {
			this.method7060();
		}
		this.anInt829 = this.anInt825;
		this.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!afo", name = "dw", descriptor = "()V", line = 1329)
	@Override
	public void method6963() {
		if (this.aBoolean169) {
			return;
		}
		if (!this.aBoolean165) {
			this.method7060();
		}
		this.anInt829 = this.anInt825;
		this.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!afo", name = "aj", descriptor = "()I", line = 1337)
	@Override
	public int method6899() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt824;
	}

	@OriginalMember(owner = "client!afo", name = "ds", descriptor = "()I", line = 1337)
	@Override
	public int method6964() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt824;
	}

	@OriginalMember(owner = "client!afo", name = "du", descriptor = "()I", line = 1342)
	@Override
	public int method6965() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "dl", descriptor = "()I", line = 1342)
	@Override
	public int method6966() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "dy", descriptor = "()I", line = 1342)
	@Override
	public int method6996() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "dp", descriptor = "()I", line = 1342)
	@Override
	public int method6967() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "db", descriptor = "()I", line = 1342)
	@Override
	public int method6904() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "ay", descriptor = "()I", line = 1342)
	@Override
	public int method6900() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt823;
	}

	@OriginalMember(owner = "client!afo", name = "ab", descriptor = "()I", line = 1347)
	@Override
	public int method6901() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt827;
	}

	@OriginalMember(owner = "client!afo", name = "dh", descriptor = "()I", line = 1347)
	@Override
	public int method6970() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt827;
	}

	@OriginalMember(owner = "client!afo", name = "dx", descriptor = "()I", line = 1352)
	@Override
	public int method6971() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt819;
	}

	@OriginalMember(owner = "client!afo", name = "az", descriptor = "()I", line = 1352)
	@Override
	public int method6902() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt819;
	}

	@OriginalMember(owner = "client!afo", name = "dg", descriptor = "()I", line = 1352)
	@Override
	public int method6951() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt819;
	}

	@OriginalMember(owner = "client!afo", name = "de", descriptor = "()I", line = 1352)
	@Override
	public int method6973() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt819;
	}

	@OriginalMember(owner = "client!afo", name = "aa", descriptor = "()I", line = 1357)
	@Override
	public int method6917() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt825;
	}

	@OriginalMember(owner = "client!afo", name = "dj", descriptor = "()I", line = 1357)
	@Override
	public int method6974() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt825;
	}

	@OriginalMember(owner = "client!afo", name = "af", descriptor = "()I", line = 1362)
	@Override
	public int method6879() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt826;
	}

	@OriginalMember(owner = "client!afo", name = "eo", descriptor = "()I", line = 1362)
	@Override
	public int method6977() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt826;
	}

	@OriginalMember(owner = "client!afo", name = "ey", descriptor = "()I", line = 1362)
	@Override
	public int method7023() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt826;
	}

	@OriginalMember(owner = "client!afo", name = "ak", descriptor = "()I", line = 1367)
	@Override
	public int method6905() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt816;
	}

	@OriginalMember(owner = "client!afo", name = "eu", descriptor = "()I", line = 1367)
	@Override
	public int method6961() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt816;
	}

	@OriginalMember(owner = "client!afo", name = "ed", descriptor = "()I", line = 1367)
	@Override
	public int method6978() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt816;
	}

	@OriginalMember(owner = "client!afo", name = "an", descriptor = "()I", line = 1372)
	@Override
	public int method6957() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt811;
	}

	@OriginalMember(owner = "client!afo", name = "ee", descriptor = "()I", line = 1372)
	@Override
	public int method6972() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt811;
	}

	@OriginalMember(owner = "client!afo", name = "es", descriptor = "()I", line = 1372)
	@Override
	public int method6980() {
		if (!this.aBoolean165) {
			this.method7060();
		}
		return this.anInt811;
	}

	@OriginalMember(owner = "client!afo", name = "bf", descriptor = "()I", line = 1377)
	@Override
	public int method6886() {
		if (!this.aBoolean169) {
			this.method6908();
		}
		return this.anInt829;
	}

	@OriginalMember(owner = "client!afo", name = "ei", descriptor = "()I", line = 1377)
	@Override
	public int method6981() {
		if (!this.aBoolean169) {
			this.method6908();
		}
		return this.anInt829;
	}

	@OriginalMember(owner = "client!afo", name = "el", descriptor = "()I", line = 1377)
	@Override
	public int method6982() {
		if (!this.aBoolean169) {
			this.method6908();
		}
		return this.anInt829;
	}

	@OriginalMember(owner = "client!afo", name = "ej", descriptor = "()I", line = 1377)
	@Override
	public int method6983() {
		if (!this.aBoolean169) {
			this.method6908();
		}
		return this.anInt829;
	}

	@OriginalMember(owner = "client!afo", name = "bo", descriptor = "(Lclient!do;IIIZ)V", line = 1382)
	@Override
	public void method6872(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub3 local2 = (Class109_Sub3) arg0;
		if (this.anInt818 == 0 || local2.anInt818 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt815;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray81;
		@Pc(21) int[] local21 = local2.anIntArray71;
		@Pc(24) short[] local24 = local2.aShortArray35;
		@Pc(27) short[] local27 = local2.aShortArray31;
		@Pc(30) short[] local30 = local2.aShortArray32;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass423_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass423_1.aShortArray128;
			local44 = this.aClass423_1.aShortArray127;
			local48 = this.aClass423_1.aShortArray129;
			local52 = this.aClass423_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass423_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass423_1.aShortArray128;
			local72 = local2.aClass423_1.aShortArray127;
			local76 = local2.aClass423_1.aShortArray129;
			local80 = local2.aClass423_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray76;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean165) {
			local2.method7060();
		}
		@Pc(103) int local103 = local2.anInt825;
		@Pc(106) int local106 = local2.anInt826;
		@Pc(109) int local109 = local2.anInt827;
		@Pc(112) int local112 = local2.anInt819;
		@Pc(115) int local115 = local2.anInt816;
		@Pc(118) int local118 = local2.anInt811;
		for (@Pc(120) int local120 = 0; local120 < this.anInt815; local120++) {
			@Pc(131) int local131 = this.anIntArray81[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray71[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray76[local120];
						@Pc(180) int local180 = this.anIntArray76[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass423_1 = new Class423();
											local40 = this.aClass423_1.aShortArray128 = Class702.method36718(this.aShortArray35, 2038053695);
											local44 = this.aClass423_1.aShortArray127 = Class702.method36718(this.aShortArray31, 2038053695);
											local48 = this.aClass423_1.aShortArray129 = Class702.method36718(this.aShortArray32, 2038053695);
											local52 = this.aClass423_1.aByteArray92 = Class335.method27404(this.aByteArray24, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class423 local325 = local2.aClass423_1 = new Class423();
											local68 = local325.aShortArray128 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray127 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray129 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray92 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray35[local168];
										@Pc(363) short local363 = this.aShortArray31[local168];
										@Pc(368) short local368 = this.aShortArray32[local168];
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
										local173 = this.anIntArray76[local120];
										local180 = this.anIntArray76[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7054();
										this.method7054();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "bz", descriptor = "(Lclient!do;IIIZ)V", line = 1382)
	@Override
	public void method6921(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub3 local2 = (Class109_Sub3) arg0;
		if (this.anInt818 == 0 || local2.anInt818 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt815;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray81;
		@Pc(21) int[] local21 = local2.anIntArray71;
		@Pc(24) short[] local24 = local2.aShortArray35;
		@Pc(27) short[] local27 = local2.aShortArray31;
		@Pc(30) short[] local30 = local2.aShortArray32;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass423_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass423_1.aShortArray128;
			local44 = this.aClass423_1.aShortArray127;
			local48 = this.aClass423_1.aShortArray129;
			local52 = this.aClass423_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass423_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass423_1.aShortArray128;
			local72 = local2.aClass423_1.aShortArray127;
			local76 = local2.aClass423_1.aShortArray129;
			local80 = local2.aClass423_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray76;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean165) {
			local2.method7060();
		}
		@Pc(103) int local103 = local2.anInt825;
		@Pc(106) int local106 = local2.anInt826;
		@Pc(109) int local109 = local2.anInt827;
		@Pc(112) int local112 = local2.anInt819;
		@Pc(115) int local115 = local2.anInt816;
		@Pc(118) int local118 = local2.anInt811;
		for (@Pc(120) int local120 = 0; local120 < this.anInt815; local120++) {
			@Pc(131) int local131 = this.anIntArray81[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray71[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray76[local120];
						@Pc(180) int local180 = this.anIntArray76[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass423_1 = new Class423();
											local40 = this.aClass423_1.aShortArray128 = Class702.method36718(this.aShortArray35, 2038053695);
											local44 = this.aClass423_1.aShortArray127 = Class702.method36718(this.aShortArray31, 2038053695);
											local48 = this.aClass423_1.aShortArray129 = Class702.method36718(this.aShortArray32, 2038053695);
											local52 = this.aClass423_1.aByteArray92 = Class335.method27404(this.aByteArray24, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class423 local325 = local2.aClass423_1 = new Class423();
											local68 = local325.aShortArray128 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray127 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray129 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray92 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray35[local168];
										@Pc(363) short local363 = this.aShortArray31[local168];
										@Pc(368) short local368 = this.aShortArray32[local168];
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
										local173 = this.anIntArray76[local120];
										local180 = this.anIntArray76[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7054();
										this.method7054();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "bv", descriptor = "(Lclient!do;IIIZ)V", line = 1382)
	@Override
	public void method6944(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class109_Sub3 local2 = (Class109_Sub3) arg0;
		if (this.anInt818 == 0 || local2.anInt818 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt815;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray81;
		@Pc(21) int[] local21 = local2.anIntArray71;
		@Pc(24) short[] local24 = local2.aShortArray35;
		@Pc(27) short[] local27 = local2.aShortArray31;
		@Pc(30) short[] local30 = local2.aShortArray32;
		@Pc(33) byte[] local33 = local2.aByteArray24;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass423_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass423_1.aShortArray128;
			local44 = this.aClass423_1.aShortArray127;
			local48 = this.aClass423_1.aShortArray129;
			local52 = this.aClass423_1.aByteArray92;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass423_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass423_1.aShortArray128;
			local72 = local2.aClass423_1.aShortArray127;
			local76 = local2.aClass423_1.aShortArray129;
			local80 = local2.aClass423_1.aByteArray92;
		}
		@Pc(92) int[] local92 = local2.anIntArray76;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean165) {
			local2.method7060();
		}
		@Pc(103) int local103 = local2.anInt825;
		@Pc(106) int local106 = local2.anInt826;
		@Pc(109) int local109 = local2.anInt827;
		@Pc(112) int local112 = local2.anInt819;
		@Pc(115) int local115 = local2.anInt816;
		@Pc(118) int local118 = local2.anInt811;
		for (@Pc(120) int local120 = 0; local120 < this.anInt815; local120++) {
			@Pc(131) int local131 = this.anIntArray81[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray71[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray76[local120];
						@Pc(180) int local180 = this.anIntArray76[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass423_1 = new Class423();
											local40 = this.aClass423_1.aShortArray128 = Class702.method36718(this.aShortArray35, 2038053695);
											local44 = this.aClass423_1.aShortArray127 = Class702.method36718(this.aShortArray31, 2038053695);
											local48 = this.aClass423_1.aShortArray129 = Class702.method36718(this.aShortArray32, 2038053695);
											local52 = this.aClass423_1.aByteArray92 = Class335.method27404(this.aByteArray24, 1719251266);
										}
										if (local68 == null) {
											@Pc(325) Class423 local325 = local2.aClass423_1 = new Class423();
											local68 = local325.aShortArray128 = Class702.method36718(local24, 2038053695);
											local72 = local325.aShortArray127 = Class702.method36718(local27, 2038053695);
											local76 = local325.aShortArray129 = Class702.method36718(local30, 2038053695);
											local80 = local325.aByteArray92 = Class335.method27404(local33, 1719251266);
										}
										@Pc(358) short local358 = this.aShortArray35[local168];
										@Pc(363) short local363 = this.aShortArray31[local168];
										@Pc(368) short local368 = this.aShortArray32[local168];
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
										local173 = this.anIntArray76[local120];
										local180 = this.anIntArray76[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method7054();
										this.method7054();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "bk", descriptor = "(I)V", line = 1514)
	@Override
	public void method7027(@OriginalArg(0) int arg0) {
		this.aShort66 = (short) arg0;
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "fc", descriptor = "(I)V", line = 1514)
	@Override
	public void method7010(@OriginalArg(0) int arg0) {
		this.aShort66 = (short) arg0;
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "bh", descriptor = "(I)V", line = 1519)
	@Override
	public void method6909(@OriginalArg(0) int arg0) {
		this.aShort67 = (short) arg0;
		this.method7049();
		this.method7054();
	}

	@OriginalMember(owner = "client!afo", name = "fw", descriptor = "(I)V", line = 1519)
	@Override
	public void method6988(@OriginalArg(0) int arg0) {
		this.aShort67 = (short) arg0;
		this.method7049();
		this.method7054();
	}

	@OriginalMember(owner = "client!afo", name = "fa", descriptor = "(I)V", line = 1519)
	@Override
	public void method6906(@OriginalArg(0) int arg0) {
		this.aShort67 = (short) arg0;
		this.method7049();
		this.method7054();
	}

	@OriginalMember(owner = "client!afo", name = "bx", descriptor = "()I", line = 1525)
	@Override
	public int method7018() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!afo", name = "ep", descriptor = "()I", line = 1525)
	@Override
	public int method6984() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!afo", name = "ev", descriptor = "()I", line = 1525)
	@Override
	public int method6985() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!afo", name = "ec", descriptor = "()I", line = 1525)
	@Override
	public int method7021() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!afo", name = "bd", descriptor = "()I", line = 1529)
	@Override
	public int method6911() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!afo", name = "eq", descriptor = "()I", line = 1529)
	@Override
	public int method6926() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!afo", name = "eh", descriptor = "()I", line = 1529)
	@Override
	public int method6989() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!afo", name = "em", descriptor = "()I", line = 1529)
	@Override
	public int method7013() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!afo", name = "ek", descriptor = "()I", line = 1529)
	@Override
	public int method6987() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!afo", name = "bc", descriptor = "()[B", line = 1533)
	@Override
	public byte[] method6912() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afo", name = "eg", descriptor = "()[B", line = 1533)
	@Override
	public byte[] method6990() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afo", name = "ef", descriptor = "()[B", line = 1533)
	@Override
	public byte[] method6992() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afo", name = "ez", descriptor = "()[B", line = 1533)
	@Override
	public byte[] method6895() {
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!afo", name = "bi", descriptor = "(SS)V", line = 1537)
	@Override
	public void method7017(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			if (this.aShortArray34[local1] == arg0) {
				this.aShortArray34[local1] = arg1;
			}
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(32) Class416 local32 = this.aClass416Array1[local1];
				@Pc(37) Class409 local37 = this.aClass409Array1[local1];
				local37.anInt4702 = local37.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local32.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "et", descriptor = "(SS)V", line = 1537)
	@Override
	public void method6993(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			if (this.aShortArray34[local1] == arg0) {
				this.aShortArray34[local1] = arg1;
			}
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(32) Class416 local32 = this.aClass416Array1[local1];
				@Pc(37) Class409 local37 = this.aClass409Array1[local1];
				local37.anInt4702 = local37.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local32.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "bn", descriptor = "(B[B)V", line = 1551)
	@Override
	public void method6916(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				this.aByteArray23[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray23[local3] = (byte) local39;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "ea", descriptor = "(B[B)V", line = 1551)
	@Override
	public void method6890(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				this.aByteArray23[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray23[local3] = (byte) local39;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "ew", descriptor = "(B[B)V", line = 1551)
	@Override
	public void method6896(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				this.aByteArray23[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt818; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray23[local3] = (byte) local39;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "bt", descriptor = "(SS)V", line = 1566)
	@Override
	public void method6913(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub2_4.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt818; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, 1385189995);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, -1880369701);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean163 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass416Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt828; local94++) {
				@Pc(103) Class416 local103 = this.aClass416Array1[local94];
				@Pc(108) Class409 local108 = this.aClass409Array1[local94];
				local108.anInt4702 = local108.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local103.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "er", descriptor = "(SS)V", line = 1566)
	@Override
	public void method6995(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub2_4.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt818; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, -1141088587);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, -1993608129);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean163 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass416Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt828; local94++) {
				@Pc(103) Class416 local103 = this.aClass416Array1[local94];
				@Pc(108) Class409 local108 = this.aClass409Array1[local94];
				local108.anInt4702 = local108.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local103.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "en", descriptor = "(SS)V", line = 1566)
	@Override
	public void method6969(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class225 local3 = this.aClass104_Sub2_4.aClass225_6;
		for (@Pc(5) int local5 = 0; local5 < this.anInt818; local5++) {
			if (this.aShortArray33[local5] == arg0) {
				this.aShortArray33[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class235 local36 = local3.method25597(arg0 & 0xFFFF, -1583690841);
			local24 = local36.aByte123;
			local26 = local36.aByte122;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class235 local56 = local3.method25597(arg1 & 0xFFFF, -1769410100);
			local44 = local56.aByte123;
			local46 = local56.aByte122;
			if (local56.aFloat278 != 0.0F || local56.aFloat279 != 0.0F) {
				this.aBoolean163 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass416Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt828; local94++) {
				@Pc(103) Class416 local103 = this.aClass416Array1[local94];
				@Pc(108) Class409 local108 = this.aClass409Array1[local94];
				local108.anInt4702 = local108.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local103.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "fg", descriptor = "(IIII)V", line = 1598)
	@Override
	public void method6999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(12) int local12 = this.aShortArray34[local1] & 0xFFFF;
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
			this.aShortArray34[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(97) Class416 local97 = this.aClass416Array1[local1];
				@Pc(102) Class409 local102 = this.aClass409Array1[local1];
				local102.anInt4702 = local102.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local97.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "bq", descriptor = "(IIII)V", line = 1598)
	@Override
	public void method6914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(12) int local12 = this.aShortArray34[local1] & 0xFFFF;
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
			this.aShortArray34[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(97) Class416 local97 = this.aClass416Array1[local1];
				@Pc(102) Class409 local102 = this.aClass409Array1[local1];
				local102.anInt4702 = local102.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local97.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "ex", descriptor = "(IIII)V", line = 1598)
	@Override
	public void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(12) int local12 = this.aShortArray34[local1] & 0xFFFF;
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
			this.aShortArray34[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(97) Class416 local97 = this.aClass416Array1[local1];
				@Pc(102) Class409 local102 = this.aClass409Array1[local1];
				local102.anInt4702 = local102.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local97.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "eb", descriptor = "(IIII)V", line = 1598)
	@Override
	public void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt818; local1++) {
			@Pc(12) int local12 = this.aShortArray34[local1] & 0xFFFF;
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
			this.aShortArray34[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass416Array1 != null) {
			for (local1 = 0; local1 < this.anInt828; local1++) {
				@Pc(97) Class416 local97 = this.aClass416Array1[local1];
				@Pc(102) Class409 local102 = this.aClass409Array1[local1];
				local102.anInt4702 = local102.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local97.anInt4764] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7050();
	}

	@OriginalMember(owner = "client!afo", name = "bm", descriptor = "()Z", line = 1619)
	@Override
	public boolean method6915() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass104_Sub2_4.aClass406_3.method28568(this.aClass104_Sub2_4.aClass225_6.method25597(this.aShortArray33[local6], 272175222), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "fj", descriptor = "()Z", line = 1619)
	@Override
	public boolean method7003() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass104_Sub2_4.aClass406_3.method28568(this.aClass104_Sub2_4.aClass225_6.method25597(this.aShortArray33[local6], -462350719), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "fz", descriptor = "()Z", line = 1619)
	@Override
	public boolean method7002() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass104_Sub2_4.aClass406_3.method28568(this.aClass104_Sub2_4.aClass225_6.method25597(this.aShortArray33[local6], 460984749), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "fd", descriptor = "()Z", line = 1619)
	@Override
	public boolean method7004() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray33.length; local6++) {
			if (this.aShortArray33[local6] != -1 && !this.aClass104_Sub2_4.aClass406_3.method28568(this.aClass104_Sub2_4.aClass225_6.method25597(this.aShortArray33[local6], -374710708), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "bb", descriptor = "()Z", line = 1627)
	@Override
	public boolean method6903() {
		return this.aBoolean168;
	}

	@OriginalMember(owner = "client!afo", name = "fn", descriptor = "()Z", line = 1627)
	@Override
	public boolean method6986() {
		return this.aBoolean168;
	}

	@OriginalMember(owner = "client!afo", name = "fi", descriptor = "()Z", line = 1627)
	@Override
	public boolean method7006() {
		return this.aBoolean168;
	}

	@OriginalMember(owner = "client!afo", name = "be", descriptor = "()Z", line = 1631)
	@Override
	public boolean method6975() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afo", name = "fv", descriptor = "()Z", line = 1631)
	@Override
	public boolean method7009() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afo", name = "ft", descriptor = "()Z", line = 1631)
	@Override
	public boolean method7007() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afo", name = "fx", descriptor = "()Z", line = 1631)
	@Override
	public boolean method7008() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!afo", name = "b", descriptor = "()V", line = 1634)
	@Override
	void method6884() {
	}

	@OriginalMember(owner = "client!afo", name = "cb", descriptor = "()V", line = 1634)
	@Override
	void method6943() {
	}

	@OriginalMember(owner = "client!afo", name = "h", descriptor = "()V", line = 1635)
	@Override
	void method6885() {
	}

	@OriginalMember(owner = "client!afo", name = "cs", descriptor = "()V", line = 1635)
	@Override
	void method6871() {
	}

	@OriginalMember(owner = "client!afo", name = "cy", descriptor = "()V", line = 1635)
	@Override
	void method6945() {
	}

	@OriginalMember(owner = "client!afo", name = "cz", descriptor = "()Z", line = 1638)
	@Override
	boolean method6946() {
		if (this.anIntArrayArray14 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt814; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
		}
		this.anInt830 = 0;
		this.anInt831 = 0;
		this.anInt832 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "as", descriptor = "()Z", line = 1638)
	@Override
	boolean method6888() {
		if (this.anIntArrayArray14 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt814; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
		}
		this.anInt830 = 0;
		this.anInt831 = 0;
		this.anInt832 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "cc", descriptor = "()Z", line = 1638)
	@Override
	boolean method6950() {
		if (this.anIntArrayArray14 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt814; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
		}
		this.anInt830 = 0;
		this.anInt831 = 0;
		this.anInt832 = 0;
		return true;
	}

	@OriginalMember(owner = "client!afo", name = "am", descriptor = "(I[IIIIZI[I)V", line = 1651)
	@Override
	void method6891(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt830 += this.anIntArray70[local56];
							this.anInt831 += this.anIntArray81[local56];
							this.anInt832 += this.anIntArray71[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + arg2;
				this.anInt831 = this.anInt831 / local18 + arg3;
				this.anInt832 = this.anInt832 / local18 + arg4;
				this.aBoolean164 = true;
			} else {
				this.anInt830 = arg2;
				this.anInt831 = arg3;
				this.anInt832 = arg4;
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
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray81[local48] += arg3;
							this.anIntArray71[local48] += arg4;
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
					if (local29 < this.anIntArrayArray14.length) {
						local247 = this.anIntArrayArray14[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt830;
								this.anIntArray81[local48] -= this.anInt831;
								this.anIntArray71[local48] -= this.anInt832;
								if (arg4 != 0) {
									local56 = Class464.anIntArray451[arg4];
									local366 = Class464.anIntArray452[arg4];
									local391 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = this.anIntArray81[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class464.anIntArray451[arg2];
									local366 = Class464.anIntArray452[arg2];
									local391 = this.anIntArray81[local48] * local366 - this.anIntArray71[local48] * local56 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class464.anIntArray451[arg3];
									local366 = Class464.anIntArray452[arg3];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt830;
								this.anIntArray81[local48] += this.anInt831;
								this.anIntArray71[local48] += this.anInt832;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray14.length) {
							local247 = this.anIntArrayArray14[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray76[local48];
									local366 = this.anIntArray76[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class464.anIntArray451[arg4];
											local459 = Class464.anIntArray452[arg4];
											local463 = this.aShortArray31[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray31[local416] = (short) (this.aShortArray31[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class464.anIntArray451[arg2];
											local459 = Class464.anIntArray452[arg2];
											local463 = this.aShortArray31[local416] * local459 - this.aShortArray32[local416] * local455 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray31[local416] * local455 + this.aShortArray32[local416] * local459 + 16383 >> 14);
											this.aShortArray31[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class464.anIntArray451[arg3];
											local459 = Class464.anIntArray452[arg3];
											local463 = this.aShortArray32[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray32[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7054();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean164) {
					local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
					local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
					local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt830 = local366;
					this.anInt831 = local391;
					this.anInt832 = local416;
					this.aBoolean164 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class464.anIntArray452[arg2];
				local416 = Class464.anIntArray451[arg2];
				local455 = Class464.anIntArray452[arg3];
				local459 = Class464.anIntArray451[arg3];
				local463 = Class464.anIntArray452[arg4];
				local467 = Class464.anIntArray451[arg4];
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
				@Pc(614) int local614 = local443[0] * -this.anInt830 + local443[1] * -this.anInt831 + local443[2] * -this.anInt832 + 8192 >> 14;
				local642 = local443[3] * -this.anInt830 + local443[4] * -this.anInt831 + local443[5] * -this.anInt832 + 8192 >> 14;
				local670 = local443[6] * -this.anInt830 + local443[7] * -this.anInt831 + local443[8] * -this.anInt832 + 8192 >> 14;
				local675 = local614 + this.anInt830;
				@Pc(680) int local680 = local642 + this.anInt831;
				local685 = local670 + this.anInt832;
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
					if (local962 < this.anIntArrayArray14.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray14[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray81[local982] + local822[2] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray81[local982] + local822[5] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray81[local982] + local822[8] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray81[local982] = local1094;
								this.anIntArray71[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class416 local2520;
			@Pc(2525) Class409 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
									local366 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray23[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local2520 = this.aClass416Array1[local29];
								local2525 = this.aClass409Array1[local29];
								local2525.anInt4702 = local2525.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local2520.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class409 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4704 += arg2;
									local2764.anInt4703 += arg3;
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
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4699 = local2764.anInt4699 * arg2 >> 7;
									local2764.anInt4701 = local2764.anInt4701 * arg3 >> 7;
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
								local2764 = this.aClass409Array1[local247[local249]];
								local2764.anInt4700 = local2764.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
								local366 = this.aShortArray34[local56] & 0xFFFF;
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
								this.aShortArray34[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local2520 = this.aClass416Array1[local29];
							local2525 = this.aClass409Array1[local29];
							local2525.anInt4702 = local2525.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local2520.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
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
			if (this.aBoolean164) {
				local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
				local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
				local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt830 = local366;
				this.anInt831 = local391;
				this.anInt832 = local416;
				this.aBoolean164 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt830 + 8192 >> 14;
			local459 = local391 * -this.anInt831 + 8192 >> 14;
			local463 = local416 * -this.anInt832 + 8192 >> 14;
			local467 = local455 + this.anInt830;
			local475 = local459 + this.anInt831;
			local483 = local463 + this.anInt832;
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
				if (local700 < this.anIntArrayArray14.length) {
					local822 = this.anIntArrayArray14[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray81[local829] + local1985[2] * this.anIntArray71[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray81[local829] + local1985[5] * this.anIntArray71[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray81[local829] + local1985[8] * this.anIntArray71[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray81[local829] = local2257;
							this.anIntArray71[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dv", descriptor = "(I[IIIIZI[I)V", line = 1651)
	@Override
	void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt830 += this.anIntArray70[local56];
							this.anInt831 += this.anIntArray81[local56];
							this.anInt832 += this.anIntArray71[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + arg2;
				this.anInt831 = this.anInt831 / local18 + arg3;
				this.anInt832 = this.anInt832 / local18 + arg4;
				this.aBoolean164 = true;
			} else {
				this.anInt830 = arg2;
				this.anInt831 = arg3;
				this.anInt832 = arg4;
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
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray81[local48] += arg3;
							this.anIntArray71[local48] += arg4;
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
					if (local29 < this.anIntArrayArray14.length) {
						local247 = this.anIntArrayArray14[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt830;
								this.anIntArray81[local48] -= this.anInt831;
								this.anIntArray71[local48] -= this.anInt832;
								if (arg4 != 0) {
									local56 = Class464.anIntArray451[arg4];
									local366 = Class464.anIntArray452[arg4];
									local391 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = this.anIntArray81[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class464.anIntArray451[arg2];
									local366 = Class464.anIntArray452[arg2];
									local391 = this.anIntArray81[local48] * local366 - this.anIntArray71[local48] * local56 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class464.anIntArray451[arg3];
									local366 = Class464.anIntArray452[arg3];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt830;
								this.anIntArray81[local48] += this.anInt831;
								this.anIntArray71[local48] += this.anInt832;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray14.length) {
							local247 = this.anIntArrayArray14[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray76[local48];
									local366 = this.anIntArray76[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class464.anIntArray451[arg4];
											local459 = Class464.anIntArray452[arg4];
											local463 = this.aShortArray31[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray31[local416] = (short) (this.aShortArray31[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class464.anIntArray451[arg2];
											local459 = Class464.anIntArray452[arg2];
											local463 = this.aShortArray31[local416] * local459 - this.aShortArray32[local416] * local455 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray31[local416] * local455 + this.aShortArray32[local416] * local459 + 16383 >> 14);
											this.aShortArray31[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class464.anIntArray451[arg3];
											local459 = Class464.anIntArray452[arg3];
											local463 = this.aShortArray32[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray32[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7054();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean164) {
					local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
					local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
					local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt830 = local366;
					this.anInt831 = local391;
					this.anInt832 = local416;
					this.aBoolean164 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class464.anIntArray452[arg2];
				local416 = Class464.anIntArray451[arg2];
				local455 = Class464.anIntArray452[arg3];
				local459 = Class464.anIntArray451[arg3];
				local463 = Class464.anIntArray452[arg4];
				local467 = Class464.anIntArray451[arg4];
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
				@Pc(614) int local614 = local443[0] * -this.anInt830 + local443[1] * -this.anInt831 + local443[2] * -this.anInt832 + 8192 >> 14;
				local642 = local443[3] * -this.anInt830 + local443[4] * -this.anInt831 + local443[5] * -this.anInt832 + 8192 >> 14;
				local670 = local443[6] * -this.anInt830 + local443[7] * -this.anInt831 + local443[8] * -this.anInt832 + 8192 >> 14;
				local675 = local614 + this.anInt830;
				@Pc(680) int local680 = local642 + this.anInt831;
				local685 = local670 + this.anInt832;
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
					if (local962 < this.anIntArrayArray14.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray14[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray81[local982] + local822[2] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray81[local982] + local822[5] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray81[local982] + local822[8] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray81[local982] = local1094;
								this.anIntArray71[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class416 local2520;
			@Pc(2525) Class409 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
									local366 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray23[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local2520 = this.aClass416Array1[local29];
								local2525 = this.aClass409Array1[local29];
								local2525.anInt4702 = local2525.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local2520.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class409 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4704 += arg2;
									local2764.anInt4703 += arg3;
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
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4699 = local2764.anInt4699 * arg2 >> 7;
									local2764.anInt4701 = local2764.anInt4701 * arg3 >> 7;
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
								local2764 = this.aClass409Array1[local247[local249]];
								local2764.anInt4700 = local2764.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
								local366 = this.aShortArray34[local56] & 0xFFFF;
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
								this.aShortArray34[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local2520 = this.aClass416Array1[local29];
							local2525 = this.aClass409Array1[local29];
							local2525.anInt4702 = local2525.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local2520.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
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
			if (this.aBoolean164) {
				local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
				local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
				local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt830 = local366;
				this.anInt831 = local391;
				this.anInt832 = local416;
				this.aBoolean164 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt830 + 8192 >> 14;
			local459 = local391 * -this.anInt831 + 8192 >> 14;
			local463 = local416 * -this.anInt832 + 8192 >> 14;
			local467 = local455 + this.anInt830;
			local475 = local459 + this.anInt831;
			local483 = local463 + this.anInt832;
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
				if (local700 < this.anIntArrayArray14.length) {
					local822 = this.anIntArrayArray14[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray81[local829] + local1985[2] * this.anIntArray71[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray81[local829] + local1985[5] * this.anIntArray71[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray81[local829] + local1985[8] * this.anIntArray71[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray81[local829] = local2257;
							this.anIntArray71[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dz", descriptor = "(I[IIIIZI[I)V", line = 1651)
	@Override
	void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt830 += this.anIntArray70[local56];
							this.anInt831 += this.anIntArray81[local56];
							this.anInt832 += this.anIntArray71[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + arg2;
				this.anInt831 = this.anInt831 / local18 + arg3;
				this.anInt832 = this.anInt832 / local18 + arg4;
				this.aBoolean164 = true;
			} else {
				this.anInt830 = arg2;
				this.anInt831 = arg3;
				this.anInt832 = arg4;
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
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray81[local48] += arg3;
							this.anIntArray71[local48] += arg4;
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
					if (local29 < this.anIntArrayArray14.length) {
						local247 = this.anIntArrayArray14[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt830;
								this.anIntArray81[local48] -= this.anInt831;
								this.anIntArray71[local48] -= this.anInt832;
								if (arg4 != 0) {
									local56 = Class464.anIntArray451[arg4];
									local366 = Class464.anIntArray452[arg4];
									local391 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = this.anIntArray81[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class464.anIntArray451[arg2];
									local366 = Class464.anIntArray452[arg2];
									local391 = this.anIntArray81[local48] * local366 - this.anIntArray71[local48] * local56 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local366 + 16383 >> 14;
									this.anIntArray81[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class464.anIntArray451[arg3];
									local366 = Class464.anIntArray452[arg3];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt830;
								this.anIntArray81[local48] += this.anInt831;
								this.anIntArray71[local48] += this.anInt832;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray14.length) {
							local247 = this.anIntArrayArray14[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray76[local48];
									local366 = this.anIntArray76[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class464.anIntArray451[arg4];
											local459 = Class464.anIntArray452[arg4];
											local463 = this.aShortArray31[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray31[local416] = (short) (this.aShortArray31[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class464.anIntArray451[arg2];
											local459 = Class464.anIntArray452[arg2];
											local463 = this.aShortArray31[local416] * local459 - this.aShortArray32[local416] * local455 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray31[local416] * local455 + this.aShortArray32[local416] * local459 + 16383 >> 14);
											this.aShortArray31[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class464.anIntArray451[arg3];
											local459 = Class464.anIntArray452[arg3];
											local463 = this.aShortArray32[local416] * local455 + this.aShortArray35[local416] * local459 + 16383 >> 14;
											this.aShortArray32[local416] = (short) (this.aShortArray32[local416] * local459 - this.aShortArray35[local416] * local455 + 16383 >> 14);
											this.aShortArray35[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method7054();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean164) {
					local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
					local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
					local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt830 = local366;
					this.anInt831 = local391;
					this.anInt832 = local416;
					this.aBoolean164 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class464.anIntArray452[arg2];
				local416 = Class464.anIntArray451[arg2];
				local455 = Class464.anIntArray452[arg3];
				local459 = Class464.anIntArray451[arg3];
				local463 = Class464.anIntArray452[arg4];
				local467 = Class464.anIntArray451[arg4];
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
				@Pc(614) int local614 = local443[0] * -this.anInt830 + local443[1] * -this.anInt831 + local443[2] * -this.anInt832 + 8192 >> 14;
				local642 = local443[3] * -this.anInt830 + local443[4] * -this.anInt831 + local443[5] * -this.anInt832 + 8192 >> 14;
				local670 = local443[6] * -this.anInt830 + local443[7] * -this.anInt831 + local443[8] * -this.anInt832 + 8192 >> 14;
				local675 = local614 + this.anInt830;
				@Pc(680) int local680 = local642 + this.anInt831;
				local685 = local670 + this.anInt832;
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
					if (local962 < this.anIntArrayArray14.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray14[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray81[local982] + local822[2] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray81[local982] + local822[5] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray81[local982] + local822[8] * this.anIntArray71[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray81[local982] = local1094;
								this.anIntArray71[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class416 local2520;
			@Pc(2525) Class409 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
									local366 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray23[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local2520 = this.aClass416Array1[local29];
								local2525 = this.aClass409Array1[local29];
								local2525.anInt4702 = local2525.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local2520.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class409 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local247 = this.anIntArrayArray16[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4704 += arg2;
									local2764.anInt4703 += arg3;
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
									local2764 = this.aClass409Array1[local247[local249]];
									local2764.anInt4699 = local2764.anInt4699 * arg2 >> 7;
									local2764.anInt4701 = local2764.anInt4701 * arg3 >> 7;
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
								local2764 = this.aClass409Array1[local247[local249]];
								local2764.anInt4700 = local2764.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray38 == null || (arg6 & this.aShortArray38[local56]) != 0) {
								local366 = this.aShortArray34[local56] & 0xFFFF;
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
								this.aShortArray34[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local2520 = this.aClass416Array1[local29];
							local2525 = this.aClass409Array1[local29];
							local2525.anInt4702 = local2525.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local2520.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local247 = this.anIntArrayArray14[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
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
			if (this.aBoolean164) {
				local366 = arg7[0] * this.anInt830 + arg7[3] * this.anInt831 + arg7[6] * this.anInt832 + 8192 >> 14;
				local391 = arg7[1] * this.anInt830 + arg7[4] * this.anInt831 + arg7[7] * this.anInt832 + 8192 >> 14;
				local416 = arg7[2] * this.anInt830 + arg7[5] * this.anInt831 + arg7[8] * this.anInt832 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt830 = local366;
				this.anInt831 = local391;
				this.anInt832 = local416;
				this.aBoolean164 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt830 + 8192 >> 14;
			local459 = local391 * -this.anInt831 + 8192 >> 14;
			local463 = local416 * -this.anInt832 + 8192 >> 14;
			local467 = local455 + this.anInt830;
			local475 = local459 + this.anInt831;
			local483 = local463 + this.anInt832;
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
				if (local700 < this.anIntArrayArray14.length) {
					local822 = this.anIntArrayArray14[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray81[local829] + local1985[2] * this.anIntArray71[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray81[local829] + local1985[5] * this.anIntArray71[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray81[local829] + local1985[8] * this.anIntArray71[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray81[local829] = local2257;
							this.anIntArray71[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "ar", descriptor = "(IIII)V", line = 2115)
	@Override
	void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local14 = 0; local14 < this.anInt815; local14++) {
				this.anInt830 += this.anIntArray70[local14];
				this.anInt831 += this.anIntArray81[local14];
				this.anInt832 += this.anIntArray71[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt830 = this.anInt830 / local3 + arg1;
				this.anInt831 = this.anInt831 / local3 + arg2;
				this.anInt832 = this.anInt832 / local3 + arg3;
			} else {
				this.anInt830 = arg1;
				this.anInt831 = arg2;
				this.anInt832 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt815; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray81[local3] += arg2;
				this.anIntArray71[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					if (arg3 != 0) {
						local14 = Class464.anIntArray451[arg3];
						local167 = Class464.anIntArray452[arg3];
						local185 = this.anIntArray81[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = this.anIntArray81[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class464.anIntArray451[arg1];
						local167 = Class464.anIntArray452[arg1];
						local185 = this.anIntArray81[local3] * local167 - this.anIntArray71[local3] * local14 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray81[local3] * local14 + this.anIntArray71[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class464.anIntArray451[arg2];
						local167 = Class464.anIntArray452[arg2];
						local185 = this.anIntArray71[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg2 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg3 / 128;
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else {
				@Pc(503) Class416 local503;
				@Pc(508) Class409 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = (this.aByteArray23[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray23[local3] = (byte) local14;
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local503.anInt4764] & 0xFF) << 24;
						}
					}
					this.method7050();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = this.aShortArray34[local3] & 0xFFFF;
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
						this.aShortArray34[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local503.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				} else {
					@Pc(671) Class409 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4704 += arg1;
							local671.anInt4703 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4699 = local671.anInt4699 * arg1 >> 7;
							local671.anInt4701 = local671.anInt4701 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4700 = local671.anInt4700 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "fp", descriptor = "(IIII)V", line = 2115)
	@Override
	void method7012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local14 = 0; local14 < this.anInt815; local14++) {
				this.anInt830 += this.anIntArray70[local14];
				this.anInt831 += this.anIntArray81[local14];
				this.anInt832 += this.anIntArray71[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt830 = this.anInt830 / local3 + arg1;
				this.anInt831 = this.anInt831 / local3 + arg2;
				this.anInt832 = this.anInt832 / local3 + arg3;
			} else {
				this.anInt830 = arg1;
				this.anInt831 = arg2;
				this.anInt832 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt815; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray81[local3] += arg2;
				this.anIntArray71[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					if (arg3 != 0) {
						local14 = Class464.anIntArray451[arg3];
						local167 = Class464.anIntArray452[arg3];
						local185 = this.anIntArray81[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = this.anIntArray81[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class464.anIntArray451[arg1];
						local167 = Class464.anIntArray452[arg1];
						local185 = this.anIntArray81[local3] * local167 - this.anIntArray71[local3] * local14 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray81[local3] * local14 + this.anIntArray71[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class464.anIntArray451[arg2];
						local167 = Class464.anIntArray452[arg2];
						local185 = this.anIntArray71[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg2 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg3 / 128;
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else {
				@Pc(503) Class416 local503;
				@Pc(508) Class409 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = (this.aByteArray23[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray23[local3] = (byte) local14;
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local503.anInt4764] & 0xFF) << 24;
						}
					}
					this.method7050();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = this.aShortArray34[local3] & 0xFFFF;
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
						this.aShortArray34[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local503.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				} else {
					@Pc(671) Class409 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4704 += arg1;
							local671.anInt4703 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4699 = local671.anInt4699 * arg1 >> 7;
							local671.anInt4701 = local671.anInt4701 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4700 = local671.anInt4700 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "fq", descriptor = "(IIII)V", line = 2115)
	@Override
	void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local14 = 0; local14 < this.anInt815; local14++) {
				this.anInt830 += this.anIntArray70[local14];
				this.anInt831 += this.anIntArray81[local14];
				this.anInt832 += this.anIntArray71[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt830 = this.anInt830 / local3 + arg1;
				this.anInt831 = this.anInt831 / local3 + arg2;
				this.anInt832 = this.anInt832 / local3 + arg3;
			} else {
				this.anInt830 = arg1;
				this.anInt831 = arg2;
				this.anInt832 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt815; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray81[local3] += arg2;
				this.anIntArray71[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					if (arg3 != 0) {
						local14 = Class464.anIntArray451[arg3];
						local167 = Class464.anIntArray452[arg3];
						local185 = this.anIntArray81[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = this.anIntArray81[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class464.anIntArray451[arg1];
						local167 = Class464.anIntArray452[arg1];
						local185 = this.anIntArray81[local3] * local167 - this.anIntArray71[local3] * local14 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray81[local3] * local14 + this.anIntArray71[local3] * local167 + 16383 >> 14;
						this.anIntArray81[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class464.anIntArray451[arg2];
						local167 = Class464.anIntArray452[arg2];
						local185 = this.anIntArray71[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt815; local3++) {
					this.anIntArray70[local3] -= this.anInt830;
					this.anIntArray81[local3] -= this.anInt831;
					this.anIntArray71[local3] -= this.anInt832;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg2 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg3 / 128;
					this.anIntArray70[local3] += this.anInt830;
					this.anIntArray81[local3] += this.anInt831;
					this.anIntArray71[local3] += this.anInt832;
				}
			} else {
				@Pc(503) Class416 local503;
				@Pc(508) Class409 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = (this.aByteArray23[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray23[local3] = (byte) local14;
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local503.anInt4764] & 0xFF) << 24;
						}
					}
					this.method7050();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt818; local3++) {
						local14 = this.aShortArray34[local3] & 0xFFFF;
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
						this.aShortArray34[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass416Array1 != null) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local503 = this.aClass416Array1[local3];
							local508 = this.aClass409Array1[local3];
							local508.anInt4702 = local508.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local503.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				} else {
					@Pc(671) Class409 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4704 += arg1;
							local671.anInt4703 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4699 = local671.anInt4699 * arg1 >> 7;
							local671.anInt4701 = local671.anInt4701 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt828; local3++) {
							local671 = this.aClass409Array1[local3];
							local671.anInt4700 = local671.anInt4700 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "at", descriptor = "(I[IIIIIZ)V", line = 2260)
	@Override
	void method6889(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt830 += this.anIntArray70[local56];
						this.anInt831 += this.anIntArray81[local56];
						this.anInt832 += this.anIntArray71[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + local8;
				this.anInt831 = this.anInt831 / local18 + local12;
				this.anInt832 = this.anInt832 / local18 + local16;
			} else {
				this.anInt830 = local8;
				this.anInt831 = local12;
				this.anInt832 = local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray81[local48] += local12;
						this.anIntArray71[local48] += local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray14.length) {
						local159 = this.anIntArrayArray14[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray76[local48];
							local271 = this.anIntArray76[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class464.anIntArray451[arg4];
									local756 = Class464.anIntArray452[arg4];
									local774 = this.aShortArray31[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray31[local746] = (short) (this.aShortArray31[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class464.anIntArray451[arg2];
									local756 = Class464.anIntArray452[arg2];
									local774 = this.aShortArray31[local746] * local756 - this.aShortArray32[local746] * local752 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray31[local746] * local752 + this.aShortArray32[local746] * local756 + 16383 >> 14);
									this.aShortArray31[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class464.anIntArray451[arg3];
									local756 = Class464.anIntArray452[arg3];
									local774 = this.aShortArray32[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray32[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7054();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt830;
						this.anIntArray81[local48] -= this.anInt831;
						this.anIntArray71[local48] -= this.anInt832;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt830;
						this.anIntArray81[local48] += this.anInt831;
						this.anIntArray71[local48] += this.anInt832;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class416 local1143;
			@Pc(1148) Class409 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray23[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local1143 = this.aClass416Array1[local29];
								local1148 = this.aClass409Array1[local29];
								local1148.anInt4702 = local1148.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local1143.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class409 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4704 += arg2;
									local1376.anInt4703 += arg3;
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
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4699 = local1376.anInt4699 * arg2 >> 7;
									local1376.anInt4701 = local1376.anInt4701 * arg3 >> 7;
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
								local1376 = this.aClass409Array1[local159[local161]];
								local1376.anInt4700 = local1376.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray34[local56] & 0xFFFF;
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
							this.aShortArray34[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local1143 = this.aClass416Array1[local29];
							local1148 = this.aClass409Array1[local29];
							local1148.anInt4702 = local1148.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local1143.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "cj", descriptor = "(I[IIIIIZ)V", line = 2260)
	@Override
	void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt830 += this.anIntArray70[local56];
						this.anInt831 += this.anIntArray81[local56];
						this.anInt832 += this.anIntArray71[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + local8;
				this.anInt831 = this.anInt831 / local18 + local12;
				this.anInt832 = this.anInt832 / local18 + local16;
			} else {
				this.anInt830 = local8;
				this.anInt831 = local12;
				this.anInt832 = local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray81[local48] += local12;
						this.anIntArray71[local48] += local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray14.length) {
						local159 = this.anIntArrayArray14[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray76[local48];
							local271 = this.anIntArray76[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class464.anIntArray451[arg4];
									local756 = Class464.anIntArray452[arg4];
									local774 = this.aShortArray31[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray31[local746] = (short) (this.aShortArray31[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class464.anIntArray451[arg2];
									local756 = Class464.anIntArray452[arg2];
									local774 = this.aShortArray31[local746] * local756 - this.aShortArray32[local746] * local752 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray31[local746] * local752 + this.aShortArray32[local746] * local756 + 16383 >> 14);
									this.aShortArray31[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class464.anIntArray451[arg3];
									local756 = Class464.anIntArray452[arg3];
									local774 = this.aShortArray32[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray32[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7054();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt830;
						this.anIntArray81[local48] -= this.anInt831;
						this.anIntArray71[local48] -= this.anInt832;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt830;
						this.anIntArray81[local48] += this.anInt831;
						this.anIntArray71[local48] += this.anInt832;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class416 local1143;
			@Pc(1148) Class409 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray23[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local1143 = this.aClass416Array1[local29];
								local1148 = this.aClass409Array1[local29];
								local1148.anInt4702 = local1148.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local1143.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class409 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4704 += arg2;
									local1376.anInt4703 += arg3;
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
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4699 = local1376.anInt4699 * arg2 >> 7;
									local1376.anInt4701 = local1376.anInt4701 * arg3 >> 7;
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
								local1376 = this.aClass409Array1[local159[local161]];
								local1376.anInt4700 = local1376.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray34[local56] & 0xFFFF;
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
							this.aShortArray34[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local1143 = this.aClass416Array1[local29];
							local1148 = this.aClass409Array1[local29];
							local1148.anInt4702 = local1148.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local1143.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dd", descriptor = "(I[IIIIIZ)V", line = 2260)
	@Override
	void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt830 += this.anIntArray70[local56];
						this.anInt831 += this.anIntArray81[local56];
						this.anInt832 += this.anIntArray71[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + local8;
				this.anInt831 = this.anInt831 / local18 + local12;
				this.anInt832 = this.anInt832 / local18 + local16;
			} else {
				this.anInt830 = local8;
				this.anInt831 = local12;
				this.anInt832 = local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray81[local48] += local12;
						this.anIntArray71[local48] += local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray14.length) {
						local159 = this.anIntArrayArray14[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray76[local48];
							local271 = this.anIntArray76[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class464.anIntArray451[arg4];
									local756 = Class464.anIntArray452[arg4];
									local774 = this.aShortArray31[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray31[local746] = (short) (this.aShortArray31[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class464.anIntArray451[arg2];
									local756 = Class464.anIntArray452[arg2];
									local774 = this.aShortArray31[local746] * local756 - this.aShortArray32[local746] * local752 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray31[local746] * local752 + this.aShortArray32[local746] * local756 + 16383 >> 14);
									this.aShortArray31[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class464.anIntArray451[arg3];
									local756 = Class464.anIntArray452[arg3];
									local774 = this.aShortArray32[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray32[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7054();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt830;
						this.anIntArray81[local48] -= this.anInt831;
						this.anIntArray71[local48] -= this.anInt832;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt830;
						this.anIntArray81[local48] += this.anInt831;
						this.anIntArray71[local48] += this.anInt832;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class416 local1143;
			@Pc(1148) Class409 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray23[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local1143 = this.aClass416Array1[local29];
								local1148 = this.aClass409Array1[local29];
								local1148.anInt4702 = local1148.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local1143.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class409 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4704 += arg2;
									local1376.anInt4703 += arg3;
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
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4699 = local1376.anInt4699 * arg2 >> 7;
									local1376.anInt4701 = local1376.anInt4701 * arg3 >> 7;
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
								local1376 = this.aClass409Array1[local159[local161]];
								local1376.anInt4700 = local1376.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray34[local56] & 0xFFFF;
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
							this.aShortArray34[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local1143 = this.aClass416Array1[local29];
							local1148 = this.aClass409Array1[local29];
							local1148.anInt4702 = local1148.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local1143.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "cd", descriptor = "(I[IIIIIZ)V", line = 2260)
	@Override
	void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray14.length) {
					local46 = this.anIntArrayArray14[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt830 += this.anIntArray70[local56];
						this.anInt831 += this.anIntArray81[local56];
						this.anInt832 += this.anIntArray71[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt830 = this.anInt830 / local18 + local8;
				this.anInt831 = this.anInt831 / local18 + local12;
				this.anInt832 = this.anInt832 / local18 + local16;
			} else {
				this.anInt830 = local8;
				this.anInt831 = local12;
				this.anInt832 = local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray81[local48] += local12;
						this.anIntArray71[local48] += local16;
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
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt830;
							this.anIntArray81[local48] -= this.anInt831;
							this.anIntArray71[local48] -= this.anInt832;
							if (arg2 != 0) {
								local56 = Class464.anIntArray451[arg2];
								local271 = Class464.anIntArray452[arg2];
								local289 = this.anIntArray81[local48] * local271 - this.anIntArray71[local48] * local56 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray81[local48] * local56 + this.anIntArray71[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class464.anIntArray451[arg4];
								local271 = Class464.anIntArray452[arg4];
								local289 = this.anIntArray81[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray81[local48] = this.anIntArray81[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class464.anIntArray451[arg3];
								local271 = Class464.anIntArray452[arg3];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt830;
							this.anIntArray81[local48] += this.anInt831;
							this.anIntArray71[local48] += this.anInt832;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray14.length) {
						local159 = this.anIntArrayArray14[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray76[local48];
							local271 = this.anIntArray76[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class464.anIntArray451[arg4];
									local756 = Class464.anIntArray452[arg4];
									local774 = this.aShortArray31[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray31[local746] = (short) (this.aShortArray31[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class464.anIntArray451[arg2];
									local756 = Class464.anIntArray452[arg2];
									local774 = this.aShortArray31[local746] * local756 - this.aShortArray32[local746] * local752 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray31[local746] * local752 + this.aShortArray32[local746] * local756 + 16383 >> 14);
									this.aShortArray31[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class464.anIntArray451[arg3];
									local756 = Class464.anIntArray452[arg3];
									local774 = this.aShortArray32[local746] * local752 + this.aShortArray35[local746] * local756 + 16383 >> 14;
									this.aShortArray32[local746] = (short) (this.aShortArray32[local746] * local756 - this.aShortArray35[local746] * local752 + 16383 >> 14);
									this.aShortArray35[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method7054();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray14.length) {
					local159 = this.anIntArrayArray14[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt830;
						this.anIntArray81[local48] -= this.anInt831;
						this.anIntArray71[local48] -= this.anInt832;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray81[local48] = this.anIntArray81[local48] * arg3 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt830;
						this.anIntArray81[local48] += this.anInt831;
						this.anIntArray71[local48] += this.anInt832;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class416 local1143;
			@Pc(1148) Class409 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray15 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray15.length) {
							local46 = this.anIntArrayArray15[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray23[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass416Array1 != null) {
							for (local29 = 0; local29 < this.anInt828; local29++) {
								local1143 = this.aClass416Array1[local29];
								local1148 = this.aClass409Array1[local29];
								local1148.anInt4702 = local1148.anInt4702 & 0xFFFFFF | 255 - (this.aByteArray23[local1143.anInt4764] & 0xFF) << 24;
							}
						}
						this.method7050();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class409 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray16 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray16.length) {
								local159 = this.anIntArrayArray16[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4704 += arg2;
									local1376.anInt4703 += arg3;
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
									local1376 = this.aClass409Array1[local159[local161]];
									local1376.anInt4699 = local1376.anInt4699 * arg2 >> 7;
									local1376.anInt4701 = local1376.anInt4701 * arg3 >> 7;
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
								local1376 = this.aClass409Array1[local159[local161]];
								local1376.anInt4700 = local1376.anInt4700 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray15 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray15.length) {
						local46 = this.anIntArrayArray15[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray34[local56] & 0xFFFF;
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
							this.aShortArray34[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass416Array1 != null) {
						for (local29 = 0; local29 < this.anInt828; local29++) {
							local1143 = this.aClass416Array1[local29];
							local1148 = this.aClass409Array1[local29];
							local1148.anInt4702 = local1148.anInt4702 & 0xFF000000 | Class685.anIntArray524[this.aShortArray34[local1143.anInt4764] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7050();
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "ad", descriptor = "(I[IIIIIZ)V", line = 2563)
	@Override
	void method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "dr", descriptor = "(I[IIIIIZ)V", line = 2563)
	@Override
	void method7022(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "da", descriptor = "(I[IIIIIZ)V", line = 2563)
	@Override
	void method7016(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "dt", descriptor = "(I[IIIIIZ)V", line = 2563)
	@Override
	void method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg0 != 0) {
			this.method6889(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "au", descriptor = "(I[IIIIZI[I)V", line = 2578)
	@Override
	void method6892(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method6891(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "do", descriptor = "(I[IIIIZI[I)V", line = 2578)
	@Override
	void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		if (arg0 != 0) {
			this.method6891(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		@Pc(5) int local5 = arg2 << 4;
		@Pc(9) int local9 = arg3 << 4;
		@Pc(13) int local13 = arg4 << 4;
		this.anInt830 = local5;
		this.anInt831 = local9;
		this.anInt832 = local13;
	}

	@OriginalMember(owner = "client!afo", name = "ap", descriptor = "()V", line = 2593)
	@Override
	void method6941() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt814; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "ck", descriptor = "()V", line = 2593)
	@Override
	void method6947() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt814; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
		}
		this.method7049();
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!afo", name = "aq", descriptor = "(Lclient!ou;IZ)V", line = 2603)
	@Override
	public void method6936(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub2_4.aClass470_36;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt815; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29436((float) this.anIntArray70[local19], (float) this.anIntArray81[local19], (float) this.anIntArray71[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray81[local19] = (int) local17[1];
				this.anIntArray71[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dm", descriptor = "(Lclient!ou;IZ)V", line = 2603)
	@Override
	public void method6956(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub2_4.aClass470_36;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt815; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29436((float) this.anIntArray70[local19], (float) this.anIntArray81[local19], (float) this.anIntArray71[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray81[local19] = (int) local17[1];
				this.anIntArray71[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dq", descriptor = "(Lclient!ou;IZ)V", line = 2603)
	@Override
	public void method7015(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub2_4.aClass470_36;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt815; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29436((float) this.anIntArray70[local19], (float) this.anIntArray81[local19], (float) this.anIntArray71[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray81[local19] = (int) local17[1];
				this.anIntArray71[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "dc", descriptor = "(Lclient!ou;IZ)V", line = 2603)
	@Override
	public void method6958(@OriginalArg(0) Class470 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class470 local5 = arg0;
		if (arg2) {
			local5 = this.aClass104_Sub2_4.aClass470_36;
			local5.method29379(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt815; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29436((float) this.anIntArray70[local19], (float) this.anIntArray81[local19], (float) this.anIntArray71[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray81[local19] = (int) local17[1];
				this.anIntArray71[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "fu", descriptor = "()[Lclient!cq;", line = 2620)
	@Override
	public Class210[] method6907() {
		return this.aClass210Array3;
	}

	@OriginalMember(owner = "client!afo", name = "bw", descriptor = "()[Lclient!cq;", line = 2620)
	@Override
	public Class210[] method6931() {
		return this.aClass210Array3;
	}

	@OriginalMember(owner = "client!afo", name = "fs", descriptor = "()[Lclient!cq;", line = 2620)
	@Override
	public Class210[] method7026() {
		return this.aClass210Array3;
	}

	@OriginalMember(owner = "client!afo", name = "bu", descriptor = "()[Lclient!du;", line = 2624)
	@Override
	public Class234[] method6919() {
		return this.aClass234Array3;
	}

	@OriginalMember(owner = "client!afo", name = "fm", descriptor = "()[Lclient!du;", line = 2624)
	@Override
	public Class234[] method7000() {
		return this.aClass234Array3;
	}

	@OriginalMember(owner = "client!afo", name = "by", descriptor = "(Lclient!ou;)V", line = 2628)
	@Override
	public void method6873(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg0);
		@Pc(11) int local11;
		if (this.aClass234Array3 != null) {
			for (local11 = 0; local11 < this.aClass234Array3.length; local11++) {
				@Pc(21) Class234 local21 = this.aClass234Array3[local11];
				@Pc(23) Class234 local23 = local21;
				if (local21.aClass234_1 != null) {
					local23 = local21.aClass234_1;
				}
				local23.anInt3761 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * 1536764047;
				local23.anInt3764 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * 1518758355;
				local23.anInt3762 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * -873285623;
				local23.anInt3763 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1833259983;
				local23.anInt3760 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1849179427;
				local23.anInt3765 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1334315853;
				local23.anInt3756 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * -853774881;
				local23.anInt3757 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * 2064201403;
				local23.anInt3768 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * -1604068053;
			}
		}
		if (this.aClass210Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass210Array3.length; local11++) {
			@Pc(505) Class210 local505 = this.aClass210Array3[local11];
			@Pc(507) Class210 local507 = local505;
			if (local505.aClass210_2 != null) {
				local507 = local505.aClass210_2;
			}
			if (local505.aClass489_96 == null) {
				local505.aClass489_96 = new Class489(local3);
			} else {
				local505.aClass489_96.method29852(local3);
			}
			local507.anInt3593 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[4] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[8] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * -2039435649;
			local507.anInt3596 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[5] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[9] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * 272047193;
			local507.anInt3594 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[6] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[10] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * 266457411;
		}
	}

	@OriginalMember(owner = "client!afo", name = "dn", descriptor = "(Lclient!ou;)V", line = 2628)
	@Override
	public void method7019(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg0);
		@Pc(11) int local11;
		if (this.aClass234Array3 != null) {
			for (local11 = 0; local11 < this.aClass234Array3.length; local11++) {
				@Pc(21) Class234 local21 = this.aClass234Array3[local11];
				@Pc(23) Class234 local23 = local21;
				if (local21.aClass234_1 != null) {
					local23 = local21.aClass234_1;
				}
				local23.anInt3761 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * 1536764047;
				local23.anInt3764 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * 1518758355;
				local23.anInt3762 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3766 * 991816887] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3766 * 991816887] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3766 * 991816887]) * -873285623;
				local23.anInt3763 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1833259983;
				local23.anInt3760 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1849179427;
				local23.anInt3765 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3758 * -919024457] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3758 * -919024457] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3758 * -919024457]) * -1334315853;
				local23.anInt3756 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[4] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[8] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * -853774881;
				local23.anInt3757 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[5] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[9] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * 2064201403;
				local23.anInt3768 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local21.anInt3759 * -120672125] + local3.aFloatArray116[6] * (float) this.anIntArray81[local21.anInt3759 * -120672125] + local3.aFloatArray116[10] * (float) this.anIntArray71[local21.anInt3759 * -120672125]) * -1604068053;
			}
		}
		if (this.aClass210Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass210Array3.length; local11++) {
			@Pc(505) Class210 local505 = this.aClass210Array3[local11];
			@Pc(507) Class210 local507 = local505;
			if (local505.aClass210_2 != null) {
				local507 = local505.aClass210_2;
			}
			if (local505.aClass489_96 == null) {
				local505.aClass489_96 = new Class489(local3);
			} else {
				local505.aClass489_96.method29852(local3);
			}
			local507.anInt3593 = (int) (local3.aFloatArray116[12] + local3.aFloatArray116[0] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[4] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[8] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * -2039435649;
			local507.anInt3596 = (int) (local3.aFloatArray116[13] + local3.aFloatArray116[1] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[5] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[9] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * 272047193;
			local507.anInt3594 = (int) (local3.aFloatArray116[14] + local3.aFloatArray116[2] * (float) this.anIntArray70[local505.anInt3592 * -1737517975] + local3.aFloatArray116[6] * (float) this.anIntArray81[local505.anInt3592 * -1737517975] + local3.aFloatArray116[10] * (float) this.anIntArray71[local505.anInt3592 * -1737517975]) * 266457411;
		}
	}

	@OriginalMember(owner = "client!afo", name = "av", descriptor = "(IILclient!ou;ZI)Z", line = 2661)
	@Override
	public boolean method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7062(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afo", name = "di", descriptor = "(IILclient!ou;ZI)Z", line = 2661)
	@Override
	public boolean method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7062(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afo", name = "dk", descriptor = "(IILclient!ou;ZI)Z", line = 2661)
	@Override
	public boolean method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7062(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afo", name = "he", descriptor = "(IIIILclient!ou;ZI)Z", line = 2665)
	boolean method7062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg4);
		local3.method29862(this.aClass104_Sub2_4.aClass489_85);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(34) int local34 = this.anInt819 - this.anInt827 >> 1;
		@Pc(42) int local42 = this.anInt826 - this.anInt825 >> 1;
		@Pc(50) int local50 = this.anInt811 - this.anInt816 >> 1;
		@Pc(55) int local55 = this.anInt827 + local34;
		@Pc(60) int local60 = this.anInt825 + local42;
		@Pc(65) int local65 = this.anInt816 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray79[0] = local71;
		this.anIntArray80[0] = local77;
		this.anIntArray72[0] = local83;
		this.anIntArray79[1] = local89;
		this.anIntArray80[1] = local77;
		this.anIntArray72[1] = local83;
		this.anIntArray79[2] = local71;
		this.anIntArray80[2] = local95;
		this.anIntArray72[2] = local83;
		this.anIntArray79[3] = local89;
		this.anIntArray80[3] = local95;
		this.anIntArray72[3] = local83;
		this.anIntArray79[4] = local71;
		this.anIntArray80[4] = local77;
		this.anIntArray72[4] = local101;
		this.anIntArray79[5] = local89;
		this.anIntArray80[5] = local77;
		this.anIntArray72[5] = local101;
		this.anIntArray79[6] = local71;
		this.anIntArray80[6] = local95;
		this.anIntArray72[6] = local101;
		this.anIntArray79[7] = local89;
		this.anIntArray80[7] = local95;
		this.anIntArray72[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray79[local223];
			local238 = this.anIntArray80[local223];
			local244 = this.anIntArray72[local223];
			local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
			local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
				local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
				@Pc(365) float local365 = this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296;
				@Pc(377) float local377 = this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296;
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
			if (this.anIntArray77.length < this.anInt817) {
				this.anIntArray77 = new int[this.anInt817];
				this.anIntArray78 = new int[this.anInt817];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt815; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray81[local457];
				local244 = this.anIntArray71[local457];
				local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
				local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
					local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296);
						this.anIntArray78[local620] = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt818; local457++) {
				if (this.anIntArray77[this.aShortArray30[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray39[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.method7066(arg0, arg1, local223, local413, this.anIntArray78[this.aShortArray30[local457] & 0xFFFF], this.anIntArray78[this.aShortArray39[local457] & 0xFFFF], this.anIntArray78[this.aShortArray36[local457] & 0xFFFF], this.anIntArray77[this.aShortArray30[local457] & 0xFFFF], this.anIntArray77[this.aShortArray39[local457] & 0xFFFF], this.anIntArray77[this.aShortArray36[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "ic", descriptor = "(IIIILclient!ou;ZI)Z", line = 2665)
	boolean method7063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg4);
		local3.method29862(this.aClass104_Sub2_4.aClass489_85);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(34) int local34 = this.anInt819 - this.anInt827 >> 1;
		@Pc(42) int local42 = this.anInt826 - this.anInt825 >> 1;
		@Pc(50) int local50 = this.anInt811 - this.anInt816 >> 1;
		@Pc(55) int local55 = this.anInt827 + local34;
		@Pc(60) int local60 = this.anInt825 + local42;
		@Pc(65) int local65 = this.anInt816 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray79[0] = local71;
		this.anIntArray80[0] = local77;
		this.anIntArray72[0] = local83;
		this.anIntArray79[1] = local89;
		this.anIntArray80[1] = local77;
		this.anIntArray72[1] = local83;
		this.anIntArray79[2] = local71;
		this.anIntArray80[2] = local95;
		this.anIntArray72[2] = local83;
		this.anIntArray79[3] = local89;
		this.anIntArray80[3] = local95;
		this.anIntArray72[3] = local83;
		this.anIntArray79[4] = local71;
		this.anIntArray80[4] = local77;
		this.anIntArray72[4] = local101;
		this.anIntArray79[5] = local89;
		this.anIntArray80[5] = local77;
		this.anIntArray72[5] = local101;
		this.anIntArray79[6] = local71;
		this.anIntArray80[6] = local95;
		this.anIntArray72[6] = local101;
		this.anIntArray79[7] = local89;
		this.anIntArray80[7] = local95;
		this.anIntArray72[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray79[local223];
			local238 = this.anIntArray80[local223];
			local244 = this.anIntArray72[local223];
			local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
			local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
				local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
				@Pc(365) float local365 = this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296;
				@Pc(377) float local377 = this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296;
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
			if (this.anIntArray77.length < this.anInt817) {
				this.anIntArray77 = new int[this.anInt817];
				this.anIntArray78 = new int[this.anInt817];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt815; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray81[local457];
				local244 = this.anIntArray71[local457];
				local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
				local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
					local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296);
						this.anIntArray78[local620] = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt818; local457++) {
				if (this.anIntArray77[this.aShortArray30[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray39[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.method7066(arg0, arg1, local223, local413, this.anIntArray78[this.aShortArray30[local457] & 0xFFFF], this.anIntArray78[this.aShortArray39[local457] & 0xFFFF], this.anIntArray78[this.aShortArray36[local457] & 0xFFFF], this.anIntArray77[this.aShortArray30[local457] & 0xFFFF], this.anIntArray77[this.aShortArray39[local457] & 0xFFFF], this.anIntArray77[this.aShortArray36[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "ik", descriptor = "(IIIILclient!ou;ZI)Z", line = 2665)
	boolean method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg4);
		local3.method29862(this.aClass104_Sub2_4.aClass489_85);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(34) int local34 = this.anInt819 - this.anInt827 >> 1;
		@Pc(42) int local42 = this.anInt826 - this.anInt825 >> 1;
		@Pc(50) int local50 = this.anInt811 - this.anInt816 >> 1;
		@Pc(55) int local55 = this.anInt827 + local34;
		@Pc(60) int local60 = this.anInt825 + local42;
		@Pc(65) int local65 = this.anInt816 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray79[0] = local71;
		this.anIntArray80[0] = local77;
		this.anIntArray72[0] = local83;
		this.anIntArray79[1] = local89;
		this.anIntArray80[1] = local77;
		this.anIntArray72[1] = local83;
		this.anIntArray79[2] = local71;
		this.anIntArray80[2] = local95;
		this.anIntArray72[2] = local83;
		this.anIntArray79[3] = local89;
		this.anIntArray80[3] = local95;
		this.anIntArray72[3] = local83;
		this.anIntArray79[4] = local71;
		this.anIntArray80[4] = local77;
		this.anIntArray72[4] = local101;
		this.anIntArray79[5] = local89;
		this.anIntArray80[5] = local77;
		this.anIntArray72[5] = local101;
		this.anIntArray79[6] = local71;
		this.anIntArray80[6] = local95;
		this.anIntArray72[6] = local101;
		this.anIntArray79[7] = local89;
		this.anIntArray80[7] = local95;
		this.anIntArray72[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray79[local223];
			local238 = this.anIntArray80[local223];
			local244 = this.anIntArray72[local223];
			local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
			local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
				local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
				@Pc(365) float local365 = this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296;
				@Pc(377) float local377 = this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296;
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
			if (this.anIntArray77.length < this.anInt817) {
				this.anIntArray77 = new int[this.anInt817];
				this.anIntArray78 = new int[this.anInt817];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt815; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray81[local457];
				local244 = this.anIntArray71[local457];
				local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
				local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
					local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296);
						this.anIntArray78[local620] = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt818; local457++) {
				if (this.anIntArray77[this.aShortArray30[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray39[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.method7066(arg0, arg1, local223, local413, this.anIntArray78[this.aShortArray30[local457] & 0xFFFF], this.anIntArray78[this.aShortArray39[local457] & 0xFFFF], this.anIntArray78[this.aShortArray36[local457] & 0xFFFF], this.anIntArray77[this.aShortArray30[local457] & 0xFFFF], this.anIntArray77[this.aShortArray39[local457] & 0xFFFF], this.anIntArray77[this.aShortArray36[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "im", descriptor = "(IIIILclient!ou;ZI)Z", line = 2665)
	boolean method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_4.aClass489_78;
		local3.method29865(arg4);
		local3.method29862(this.aClass104_Sub2_4.aClass489_85);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(34) int local34 = this.anInt819 - this.anInt827 >> 1;
		@Pc(42) int local42 = this.anInt826 - this.anInt825 >> 1;
		@Pc(50) int local50 = this.anInt811 - this.anInt816 >> 1;
		@Pc(55) int local55 = this.anInt827 + local34;
		@Pc(60) int local60 = this.anInt825 + local42;
		@Pc(65) int local65 = this.anInt816 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray79[0] = local71;
		this.anIntArray80[0] = local77;
		this.anIntArray72[0] = local83;
		this.anIntArray79[1] = local89;
		this.anIntArray80[1] = local77;
		this.anIntArray72[1] = local83;
		this.anIntArray79[2] = local71;
		this.anIntArray80[2] = local95;
		this.anIntArray72[2] = local83;
		this.anIntArray79[3] = local89;
		this.anIntArray80[3] = local95;
		this.anIntArray72[3] = local83;
		this.anIntArray79[4] = local71;
		this.anIntArray80[4] = local77;
		this.anIntArray72[4] = local101;
		this.anIntArray79[5] = local89;
		this.anIntArray80[5] = local77;
		this.anIntArray72[5] = local101;
		this.anIntArray79[6] = local71;
		this.anIntArray80[6] = local95;
		this.anIntArray72[6] = local101;
		this.anIntArray79[7] = local89;
		this.anIntArray80[7] = local95;
		this.anIntArray72[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray79[local223];
			local238 = this.anIntArray80[local223];
			local244 = this.anIntArray72[local223];
			local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
			local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
				local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
				@Pc(365) float local365 = this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296;
				@Pc(377) float local377 = this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296;
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
			if (this.anIntArray77.length < this.anInt817) {
				this.anIntArray77 = new int[this.anInt817];
				this.anIntArray78 = new int[this.anInt817];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt815; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray81[local457];
				local244 = this.anIntArray71[local457];
				local270 = local3.aFloatArray116[2] * local232 + local3.aFloatArray116[6] * local238 + local3.aFloatArray116[10] * local244 + local3.aFloatArray116[14];
				local296 = local3.aFloatArray116[3] * local232 + local3.aFloatArray116[7] * local238 + local3.aFloatArray116[11] * local244 + local3.aFloatArray116[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray116[0] * local232 + local3.aFloatArray116[4] * local238 + local3.aFloatArray116[8] * local244 + local3.aFloatArray116[12];
					local353 = local3.aFloatArray116[1] * local232 + local3.aFloatArray116[5] * local238 + local3.aFloatArray116[9] * local244 + local3.aFloatArray116[13];
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local327 / local296);
						this.anIntArray78[local620] = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray76[local457];
					local600 = this.anIntArray76[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray77[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt818; local457++) {
				if (this.anIntArray77[this.aShortArray30[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray39[local457] & 0xFFFF] != -999999 && this.anIntArray77[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.method7066(arg0, arg1, local223, local413, this.anIntArray78[this.aShortArray30[local457] & 0xFFFF], this.anIntArray78[this.aShortArray39[local457] & 0xFFFF], this.anIntArray78[this.aShortArray36[local457] & 0xFFFF], this.anIntArray77[this.aShortArray30[local457] & 0xFFFF], this.anIntArray77[this.aShortArray39[local457] & 0xFFFF], this.anIntArray77[this.aShortArray36[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!afo", name = "hn", descriptor = "(IIIIIIIIII)Z", line = 2780)
	boolean method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!afo", name = "jd", descriptor = "(IIIIIIIIII)Z", line = 2780)
	boolean method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!afo", name = "ao", descriptor = "(Lclient!ara;)Lclient!ara;", line = 2788)
	@Override
	public Class93_Sub1_Sub4 method6898(@OriginalArg(0) Class93_Sub1_Sub4 arg0) {
		if (this.anInt817 == 0) {
			return null;
		}
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass104_Sub2_4.anInt2937 > 0) {
			local29 = this.anInt827 - (this.anInt826 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local45 = this.anInt819 - (this.anInt825 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		} else {
			local29 = this.anInt827 - (this.anInt825 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local45 = this.anInt819 - (this.anInt826 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass104_Sub2_4.anInt2938 > 0) {
			local98 = this.anInt816 - (this.anInt826 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local114 = this.anInt811 - (this.anInt825 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		} else {
			local98 = this.anInt816 - (this.anInt825 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local114 = this.anInt811 - (this.anInt826 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class93_Sub1_Sub4_Sub1 local162 = (Class93_Sub1_Sub4_Sub1) arg0;
		@Pc(171) Class93_Sub1_Sub4_Sub1 local171;
		if (local162 != null && local162.method23471(local153, local159)) {
			local171 = local162;
			local162.method23473();
		} else {
			local171 = new Class93_Sub1_Sub4_Sub1(this.aClass104_Sub2_4, local153, local159);
		}
		local171.method23468(local29, local98, local45, local114);
		this.method7068(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afo", name = "df", descriptor = "(Lclient!ara;)Lclient!ara;", line = 2788)
	@Override
	public Class93_Sub1_Sub4 method6962(@OriginalArg(0) Class93_Sub1_Sub4 arg0) {
		if (this.anInt817 == 0) {
			return null;
		}
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass104_Sub2_4.anInt2937 > 0) {
			local29 = this.anInt827 - (this.anInt826 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local45 = this.anInt819 - (this.anInt825 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		} else {
			local29 = this.anInt827 - (this.anInt825 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local45 = this.anInt819 - (this.anInt826 * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass104_Sub2_4.anInt2938 > 0) {
			local98 = this.anInt816 - (this.anInt826 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local114 = this.anInt811 - (this.anInt825 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		} else {
			local98 = this.anInt816 - (this.anInt825 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
			local114 = this.anInt811 - (this.anInt826 * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class93_Sub1_Sub4_Sub1 local162 = (Class93_Sub1_Sub4_Sub1) arg0;
		@Pc(171) Class93_Sub1_Sub4_Sub1 local171;
		if (local162 != null && local162.method23471(local153, local159)) {
			local171 = local162;
			local162.method23473();
		} else {
			local171 = new Class93_Sub1_Sub4_Sub1(this.aClass104_Sub2_4, local153, local159);
		}
		local171.method23468(local29, local98, local45, local114);
		this.method7068(local171);
		return local171;
	}

	@OriginalMember(owner = "client!afo", name = "hi", descriptor = "(Lclient!ati;)V", line = 2825)
	void method7068(@OriginalArg(0) Class93_Sub1_Sub4_Sub1 arg0) {
		if (this.anIntArray77.length < this.anInt817) {
			this.anIntArray77 = new int[this.anInt817];
			this.anIntArray78 = new int[this.anInt817];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt815; local17++) {
			local44 = (this.anIntArray70[local17] - (this.anIntArray81[local17] * this.aClass104_Sub2_4.anInt2937 >> 8) >> this.aClass104_Sub2_4.anInt2936) - arg0.anInt3206;
			local67 = (this.anIntArray71[local17] - (this.anIntArray81[local17] * this.aClass104_Sub2_4.anInt2938 >> 8) >> this.aClass104_Sub2_4.anInt2936) - arg0.anInt3204;
			local72 = this.anIntArray76[local17];
			local79 = this.anIntArray76[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray77[local99] = local44;
				this.anIntArray78[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt820; local17++) {
			if (this.aByteArray23 == null || this.aByteArray23[local17] <= 128) {
				local44 = this.aShortArray30[local17] & 0xFFFF;
				local67 = this.aShortArray39[local17] & 0xFFFF;
				local72 = this.aShortArray36[local17] & 0xFFFF;
				local79 = this.anIntArray77[local44];
				local81 = this.anIntArray77[local67];
				local99 = this.anIntArray77[local72];
				@Pc(170) int local170 = this.anIntArray78[local44];
				@Pc(175) int local175 = this.anIntArray78[local67];
				@Pc(180) int local180 = this.anIntArray78[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method23474(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afo", name = "ax", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2859)
	@Override
	public void method6976(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if (aClass403_1 != null) {
			aClass403_1.method28515();
		}
		if (arg1 != null) {
			arg1.aBoolean663 = false;
		}
		if (this.anInt817 == 0) {
			return;
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub2_4.aClass489_81;
		@Pc(20) Class489 local20 = this.aClass104_Sub2_4.aClass489_78;
		@Pc(24) Class489 local24 = this.aClass104_Sub2_4.aClass489_73;
		local20.method29865(arg0);
		local24.method29852(local20);
		local24.method29862(this.aClass104_Sub2_4.aClass489_85);
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(44) float[] local44 = this.aClass104_Sub2_4.aFloatArray60;
		local20.method29881(0.0F, (float) this.anInt825, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method29881(0.0F, (float) this.anInt826, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass104_Sub2_4.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt824;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt824;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt827 + this.anInt819 >> 1;
			@Pc(180) int local180 = this.anInt816 + this.anInt811 >> 1;
			@Pc(185) int local185 = this.anInt825;
			@Pc(216) float local216 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(245) float local245 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			local121 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			local147 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local121 >= -local147) {
				arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local216 / local147);
				arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt826;
			@Pc(375) float local375 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(404) float local404 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			@Pc(433) float local433 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			@Pc(462) float local462 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local433 >= -local462) {
				arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local375 / local462);
				arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local404 / local462);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local147 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3829 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local462 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3828 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub2_4.method21172(arg2);
		this.method7069(arg0);
		this.aClass104_Sub2_4.method21172(0);
		local20.method29865(arg0);
		local20.method29862(this.aClass104_Sub2_4.aClass489_75);
		this.method7070(local20);
	}

	@OriginalMember(owner = "client!afo", name = "fb", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2859)
	@Override
	public void method6876(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if (aClass403_1 != null) {
			aClass403_1.method28515();
		}
		if (arg1 != null) {
			arg1.aBoolean663 = false;
		}
		if (this.anInt817 == 0) {
			return;
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub2_4.aClass489_81;
		@Pc(20) Class489 local20 = this.aClass104_Sub2_4.aClass489_78;
		@Pc(24) Class489 local24 = this.aClass104_Sub2_4.aClass489_73;
		local20.method29865(arg0);
		local24.method29852(local20);
		local24.method29862(this.aClass104_Sub2_4.aClass489_85);
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(44) float[] local44 = this.aClass104_Sub2_4.aFloatArray60;
		local20.method29881(0.0F, (float) this.anInt825, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method29881(0.0F, (float) this.anInt826, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass104_Sub2_4.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt824;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt824;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt827 + this.anInt819 >> 1;
			@Pc(180) int local180 = this.anInt816 + this.anInt811 >> 1;
			@Pc(185) int local185 = this.anInt825;
			@Pc(216) float local216 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(245) float local245 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			local121 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			local147 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local121 >= -local147) {
				arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local216 / local147);
				arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt826;
			@Pc(375) float local375 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(404) float local404 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			@Pc(433) float local433 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			@Pc(462) float local462 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local433 >= -local462) {
				arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local375 / local462);
				arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local404 / local462);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local147 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3829 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local462 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3828 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub2_4.method21172(arg2);
		this.method7069(arg0);
		this.aClass104_Sub2_4.method21172(0);
		local20.method29865(arg0);
		local20.method29862(this.aClass104_Sub2_4.aClass489_75);
		this.method7070(local20);
	}

	@OriginalMember(owner = "client!afo", name = "ff", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2859)
	@Override
	public void method7014(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if (aClass403_1 != null) {
			aClass403_1.method28515();
		}
		if (arg1 != null) {
			arg1.aBoolean663 = false;
		}
		if (this.anInt817 == 0) {
			return;
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub2_4.aClass489_81;
		@Pc(20) Class489 local20 = this.aClass104_Sub2_4.aClass489_78;
		@Pc(24) Class489 local24 = this.aClass104_Sub2_4.aClass489_73;
		local20.method29865(arg0);
		local24.method29852(local20);
		local24.method29862(this.aClass104_Sub2_4.aClass489_85);
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(44) float[] local44 = this.aClass104_Sub2_4.aFloatArray60;
		local20.method29881(0.0F, (float) this.anInt825, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method29881(0.0F, (float) this.anInt826, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass104_Sub2_4.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt824;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt824;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt827 + this.anInt819 >> 1;
			@Pc(180) int local180 = this.anInt816 + this.anInt811 >> 1;
			@Pc(185) int local185 = this.anInt825;
			@Pc(216) float local216 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(245) float local245 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			local121 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			local147 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local121 >= -local147) {
				arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local216 / local147);
				arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt826;
			@Pc(375) float local375 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(404) float local404 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			@Pc(433) float local433 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			@Pc(462) float local462 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local433 >= -local462) {
				arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local375 / local462);
				arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local404 / local462);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local147 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3829 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local462 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3828 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub2_4.method21172(arg2);
		this.method7069(arg0);
		this.aClass104_Sub2_4.method21172(0);
		local20.method29865(arg0);
		local20.method29862(this.aClass104_Sub2_4.aClass489_75);
		this.method7070(local20);
	}

	@OriginalMember(owner = "client!afo", name = "fl", descriptor = "(Lclient!ou;Lclient!ed;I)V", line = 2859)
	@Override
	public void method7005(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		if (aClass403_1 != null) {
			aClass403_1.method28515();
		}
		if (arg1 != null) {
			arg1.aBoolean663 = false;
		}
		if (this.anInt817 == 0) {
			return;
		}
		@Pc(16) Class489 local16 = this.aClass104_Sub2_4.aClass489_81;
		@Pc(20) Class489 local20 = this.aClass104_Sub2_4.aClass489_78;
		@Pc(24) Class489 local24 = this.aClass104_Sub2_4.aClass489_73;
		local20.method29865(arg0);
		local24.method29852(local20);
		local24.method29862(this.aClass104_Sub2_4.aClass489_85);
		if (!this.aBoolean165) {
			this.method7060();
		}
		@Pc(44) float[] local44 = this.aClass104_Sub2_4.aFloatArray60;
		local20.method29881(0.0F, (float) this.anInt825, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method29881(0.0F, (float) this.anInt826, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass104_Sub2_4.aFloatArrayArray22[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt824;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt824;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt827 + this.anInt819 >> 1;
			@Pc(180) int local180 = this.anInt816 + this.anInt811 >> 1;
			@Pc(185) int local185 = this.anInt825;
			@Pc(216) float local216 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(245) float local245 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			local121 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			local147 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local121 >= -local147) {
				arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local216 / local147);
				arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt826;
			@Pc(375) float local375 = local24.aFloatArray116[0] * (float) local172 + local24.aFloatArray116[4] * (float) local185 + local24.aFloatArray116[8] * (float) local180 + local24.aFloatArray116[12];
			@Pc(404) float local404 = local24.aFloatArray116[1] * (float) local172 + local24.aFloatArray116[5] * (float) local185 + local24.aFloatArray116[9] * (float) local180 + local24.aFloatArray116[13];
			@Pc(433) float local433 = local24.aFloatArray116[2] * (float) local172 + local24.aFloatArray116[6] * (float) local185 + local24.aFloatArray116[10] * (float) local180 + local24.aFloatArray116[14];
			@Pc(462) float local462 = local24.aFloatArray116[3] * (float) local172 + local24.aFloatArray116[7] * (float) local185 + local24.aFloatArray116[11] * (float) local180 + local24.aFloatArray116[15];
			if (local433 >= -local462) {
				arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local375 / local462);
				arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local404 / local462);
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
						arg1.anInt3829 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3830 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3828 = (int) (this.aClass104_Sub2_4.aFloat200 + this.aClass104_Sub2_4.aFloat201 * local536 / local552);
						arg1.anInt3831 = (int) (this.aClass104_Sub2_4.aFloat202 + this.aClass104_Sub2_4.aFloat203 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local147 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3829 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray116[0] * (float) this.anInt824 + local16.aFloatArray116[12];
					local536 = local462 + local16.aFloatArray116[3] * (float) this.anInt824 + local16.aFloatArray116[15];
					arg1.anInt3832 = (int) (this.aClass104_Sub2_4.aFloat200 - (float) arg1.anInt3828 + this.aClass104_Sub2_4.aFloat201 * local528 / local536);
				}
				arg1.aBoolean663 = true;
			}
		}
		this.aClass104_Sub2_4.method21172(arg2);
		this.method7069(arg0);
		this.aClass104_Sub2_4.method21172(0);
		local20.method29865(arg0);
		local20.method29862(this.aClass104_Sub2_4.aClass489_75);
		this.method7070(local20);
	}

	@OriginalMember(owner = "client!afo", name = "hw", descriptor = "(Lclient!ou;)V", line = 2962)
	void method7069(@OriginalArg(0) Class470 arg0) {
		if (this.anInt820 == 0 || (!this.method7078() || !this.method7072())) {
			return;
		}
		if (aClass403_1 != null) {
		}
		this.aClass104_Sub2_4.method21113();
		this.aClass104_Sub2_4.method21034();
		@Pc(22) Class131 local22 = this.aClass104_Sub2_4.aClass131_3;
		this.aClass104_Sub2_4.method21187(0, this.aClass417_1.anInterface37_23);
		this.aClass104_Sub2_4.method21187(1, this.aClass417_2.anInterface37_23);
		this.aClass104_Sub2_4.method21187(2, this.aClass417_4.anInterface37_23);
		this.aClass104_Sub2_4.method21180(this.aClass394_1.anInterface40_6);
		this.aClass104_Sub2_4.aClass489_78.method29865(arg0);
		local22.method10102(this.aClass104_Sub2_4.aClass489_78);
		local22.aClass489_46.method29850();
		if (this.aClass104_Sub2_4.aBoolean472) {
			@Pc(70) Class237 local70 = this.aClass104_Sub2_4.method21085();
			local22.aClass460_8.method29193(0.0F, 1.0F, 0.0F, (float) -this.aClass104_Sub2_4.anInt2946);
			local22.aClass460_8.method29216(3.0F / (float) (local70.anInt3815 * -2052057497));
			local22.aClass472_40.method29549((float) (local70.anInt3817 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3817 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3817 * -1393096381 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass460_8.method29193(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass472_40.method29549(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass104_Sub2_4.anInt2947 > 0) {
			local22.aClass460_9.method29193(0.0F, 0.0F, 1.0F, -this.aClass104_Sub2_4.aFloat216);
			local22.aClass472_41.method29549((float) (this.aClass104_Sub2_4.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 0 & 0xFF) / 255.0F);
			this.aClass104_Sub2_4.aClass489_78.method29865(arg0);
			this.aClass104_Sub2_4.aClass489_78.method29938();
			local22.aClass460_8.method29219(this.aClass104_Sub2_4.aClass489_78);
			this.aClass104_Sub2_4.aClass489_78.method29865(arg0);
			this.aClass104_Sub2_4.aClass489_78.method29862(this.aClass104_Sub2_4.aClass489_75);
			this.aClass104_Sub2_4.aClass489_78.method29938();
			local22.aClass460_9.method29219(this.aClass104_Sub2_4.aClass489_78);
			local22.aClass460_9.method29216(1.0F / (this.aClass104_Sub2_4.aFloat209 - this.aClass104_Sub2_4.aFloat216));
		} else {
			local22.aClass460_9.method29193(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass472_41.method29549(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt813 & 0x37) == 0) {
			this.aClass104_Sub2_4.method21208(this.aClass104_Sub2_4.aClass145_19);
			if (this.aClass104_Sub2_4.aBoolean462) {
				this.aClass104_Sub2_4.method21031(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray73.length; local272++) {
				local282 = this.anIntArray74[local272];
				local289 = this.anIntArray74[local272 + 1];
				@Pc(294) short local294 = this.aShortArray33[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface38_18 = this.aClass104_Sub2_4.anInterface38_23;
					@Pc(383) float[] local383 = local22.aClass489_46.aFloatArray116;
					local22.aClass489_46.aFloatArray116[13] = 0.0F;
					local383[12] = 0.0F;
				} else {
					@Pc(310) Class235 local310 = this.aClass104_Sub2_4.aClass225_6.method25597(local294 & 0xFFFF, 2084862487);
					local22.anInterface38_18 = this.aClass104_Sub2_4.aClass406_3.method28562(local310);
					local296 = !Class588.method31650(local310.aByte114, (byte) 10);
					local22.aClass489_46.aFloatArray116[12] = (float) (this.aClass104_Sub2_4.anInt2952 % 128000) / 1000.0F * local310.aFloat278 / 64.0F % 1.0F;
					local22.aClass489_46.aFloatArray116[13] = (float) (this.aClass104_Sub2_4.anInt2952 % 128000) / 1000.0F * local310.aFloat279 / 64.0F % 1.0F;
					if (local310.aClass618_2 == Class618.aClass618_4) {
						local298 = local310.aByte121;
					}
				}
				this.aClass104_Sub2_4.method21092(local298);
				local22.anInt1140 = this.anIntArray73[local272];
				local22.anInt1141 = this.anIntArray75[local272];
				local22.anInt1138 = local282 * 3;
				local22.anInt1137 = local289 - local282;
				local22.method10103(local296);
			}
		} else {
			this.aClass104_Sub2_4.method21187(3, this.aClass417_3.anInterface37_23);
			this.aClass104_Sub2_4.method21208(this.aClass104_Sub2_4.aClass145_20);
			@Pc(442) Class470 local442 = this.aClass104_Sub2_4.aClass470_36;
			local442.method29362(arg0);
			local442.method29381();
			local282 = 0;
			@Pc(569) int local569;
			if (this.aClass104_Sub2_4.aBoolean462) {
				this.aClass104_Sub2_4.method21031(true);
			} else {
				local22.aClass472_42.method29549(this.aClass104_Sub2_4.aFloatArray63[0], this.aClass104_Sub2_4.aFloatArray63[1], this.aClass104_Sub2_4.aFloatArray63[2]);
				local22.aClass472_42.method29631(local442);
				local22.aClass472_43.method29549(this.aClass104_Sub2_4.aFloat212 * this.aClass104_Sub2_4.aFloat214, this.aClass104_Sub2_4.aFloat212 * this.aClass104_Sub2_4.aFloat210, this.aClass104_Sub2_4.aFloat212 * this.aClass104_Sub2_4.aFloat217);
				local22.aClass472_44.method29549(-this.aClass104_Sub2_4.aFloat213 * this.aClass104_Sub2_4.aFloat214, -this.aClass104_Sub2_4.aFloat213 * this.aClass104_Sub2_4.aFloat210, -this.aClass104_Sub2_4.aFloat213 * this.aClass104_Sub2_4.aFloat217);
				local22.aClass472_38.method29549(this.aClass104_Sub2_4.aFloat211 * this.aClass104_Sub2_4.aFloat214, this.aClass104_Sub2_4.aFloat211 * this.aClass104_Sub2_4.aFloat210, this.aClass104_Sub2_4.aFloat211 * this.aClass104_Sub2_4.aFloat217);
				if (this.aClass104_Sub2_4.anInt2933 > 0) {
					local282 = this.aClass104_Sub2_4.anInt2933;
					@Pc(567) Class472 local567 = this.aClass104_Sub2_4.aClass472_59;
					for (local569 = 0; local569 < local282; local569++) {
						@Pc(578) Class93_Sub16 local578 = this.aClass104_Sub2_4.aClass93_Sub16Array19[local569];
						@Pc(582) int local582 = local578.method13532((byte) -94);
						local567.method29550(local578.aClass472_47);
						local567.method29625(local442);
						local22.aFloatArray40[local569 * 4] = local567.aFloat317;
						local22.aFloatArray40[local569 * 4 + 1] = local567.aFloat318;
						local22.aFloatArray40[local569 * 4 + 2] = local567.aFloat319;
						local22.aFloatArray40[local569 * 4 + 3] = 1.0F / (float) (local578.method13528((byte) -21) * local578.method13528((byte) -116));
						@Pc(643) float local643 = local578.method13535(-1545706727) / 255.0F;
						local22.aFloatArray39[local569 * 4] = (float) (local582 >> 16 & 0xFF) * local643;
						local22.aFloatArray39[local569 * 4 + 1] = (float) (local582 >> 8 & 0xFF) * local643;
						local22.aFloatArray39[local569 * 4 + 2] = (float) (local582 & 0xFF) * local643;
						local22.aFloatArray39[local569 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray73.length; local289++) {
				local569 = this.anIntArray74[local289];
				@Pc(719) int local719 = this.anIntArray74[local289 + 1];
				@Pc(724) short local724 = this.aShortArray33[local569];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class235 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface38_18 = this.aClass104_Sub2_4.anInterface38_23;
					@Pc(809) float[] local809 = local22.aClass489_46.aFloatArray116;
					local22.aClass489_46.aFloatArray116[13] = 0.0F;
					local809[12] = 0.0F;
				} else {
					local728 = this.aClass104_Sub2_4.aClass225_6.method25597(local724 & 0xFFFF, -1166179796);
					local22.anInterface38_18 = this.aClass104_Sub2_4.aClass406_3.method28562(local728);
					local726 = local728.aByte114;
					local22.method10101(local728.aByte112);
					local22.aClass489_46.aFloatArray116[12] = (float) (this.aClass104_Sub2_4.anInt2952 % 128000) / 1000.0F * local728.aFloat278 % 1.0F;
					local22.aClass489_46.aFloatArray116[13] = (float) (this.aClass104_Sub2_4.anInt2952 % 128000) / 1000.0F * local728.aFloat279 % 1.0F;
					if (local728.aClass618_2 == Class618.aClass618_4) {
						local730 = local728.aByte121;
					}
				}
				this.aClass104_Sub2_4.method21092(local730);
				local22.anInt1140 = this.anIntArray73[local289];
				local22.anInt1141 = this.anIntArray75[local289];
				local22.anInt1138 = local569 * 3;
				local22.anInt1137 = local719 - local569;
				switch(local726) {
					case 1:
						local22.aClass472_39.method29549(this.aClass104_Sub2_4.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_4.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_4.aClass489_72.aFloatArray116[14]);
						local22.aClass472_39.method29625(local442);
						local22.method10115(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method10104(local282);
						break;
					case 5:
						if (this.aClass104_Sub2_4.aBoolean462) {
							local22.method10104(local282);
						} else {
							@Pc(855) Class128_Sub1_Sub2 local855 = this.aClass104_Sub2_4.aClass128_Sub1_Sub2_3;
							local855.method21395(local728.aByte112, local728.anInt3807 * 1731185285, 369288027);
							local855.aClass489_90.method29865(arg0);
							local855.aClass489_91.method29865(arg0);
							local855.aClass489_91.method29862(this.aClass104_Sub2_4.aClass489_84);
							local855.anInt2977 = this.anIntArray73[local289] * 2018953065;
							local855.anInt2975 = this.anIntArray75[local289] * 1439873419;
							local855.anInt2976 = local569 * 883117915;
							local855.anInt2978 = (local719 - local569) * 1905742729;
							local855.method21398(-1717143377);
						}
						break;
					case 6:
						local22.method10103(!Class588.method31650(local726, (byte) 10));
						break;
					case 7:
						local22.aClass472_39.method29549(this.aClass104_Sub2_4.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_4.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_4.aClass489_72.aFloatArray116[14]);
						local22.aClass472_39.method29625(local442);
						local22.aClass489_45.method29865(arg0);
						local22.anInterface44_3 = this.aClass104_Sub2_4.method20960();
						local22.method10110(local282);
				}
			}
		}
		this.method7047();
	}

	@OriginalMember(owner = "client!afo", name = "ht", descriptor = "(Lclient!pq;)V", line = 3136)
	void method7070(@OriginalArg(0) Class489 arg0) {
		if (this.aClass416Array1 == null) {
			return;
		}
		this.aClass104_Sub2_4.method20603(!this.aBoolean168);
		@Pc(16) Class470 local16 = this.aClass104_Sub2_4.aClass470_36;
		@Pc(20) Class126 local20 = this.aClass104_Sub2_4.aClass126_3;
		@Pc(28) boolean local28 = this.aClass104_Sub2_4.anInt2947 > 0;
		if (local28) {
			local20.aClass472_37.method29549((float) (this.aClass104_Sub2_4.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass472_37.method29549(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt828; local72++) {
			@Pc(81) Class416 local81 = this.aClass416Array1[local72];
			@Pc(86) Class409 local86 = this.aClass409Array1[local72];
			if (!local81.aBoolean754 || !this.aClass104_Sub2_4.method20622()) {
				@Pc(115) float local115 = (float) (this.anIntArray70[local81.anInt4765] + this.anIntArray70[local81.anInt4762] + this.anIntArray70[local81.anInt4763]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray81[local81.anInt4765] + this.anIntArray81[local81.anInt4762] + this.anIntArray81[local81.anInt4763]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray71[local81.anInt4765] + this.anIntArray71[local81.anInt4762] + this.anIntArray71[local81.anInt4763]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray116[0] * local115 + arg0.aFloatArray116[4] * local136 + arg0.aFloatArray116[8] * local157 + arg0.aFloatArray116[12];
				@Pc(209) float local209 = arg0.aFloatArray116[1] * local115 + arg0.aFloatArray116[5] * local136 + arg0.aFloatArray116[9] * local157 + arg0.aFloatArray116[13];
				@Pc(235) float local235 = arg0.aFloatArray116[2] * local115 + arg0.aFloatArray116[6] * local136 + arg0.aFloatArray116[10] * local157 + arg0.aFloatArray116[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4766;
				local16.method29374(local86.anInt4700, local86.anInt4699 * local81.aShort169 >> 7, local86.anInt4701 * local81.aShort168 >> 7, local183 + (float) local86.anInt4704 - local183 * local256, local209 + (float) local86.anInt4703 - local209 * local256, local235 - local235 * local256);
				local16.method29427(this.aClass104_Sub2_4.aClass470_34);
				this.aClass104_Sub2_4.aClass489_73.method29865(local16);
				local20.method10032(this.aClass104_Sub2_4.aClass489_73);
				local20.aClass489_37.method29850();
				local20.anInt1118 = local86.anInt4702;
				if (local28) {
					local20.aFloat121 = 1.0F - (this.aClass104_Sub2_4.aFloat209 - local235) / (this.aClass104_Sub2_4.aFloat209 - this.aClass104_Sub2_4.aFloat216);
				}
				local20.anInterface38_13 = null;
				if (local81.aShort170 != -1) {
					local20.anInterface38_13 = this.aClass104_Sub2_4.aClass406_3.method28562(this.aClass104_Sub2_4.aClass225_6.method25597(local81.aShort170 & 0xFFFF, -522397786));
				}
				local20.method10034(local28);
			}
		}
		this.aClass104_Sub2_4.method20603(true);
	}

	@OriginalMember(owner = "client!afo", name = "jf", descriptor = "(Lclient!pq;)V", line = 3136)
	void method7071(@OriginalArg(0) Class489 arg0) {
		if (this.aClass416Array1 == null) {
			return;
		}
		this.aClass104_Sub2_4.method20603(!this.aBoolean168);
		@Pc(16) Class470 local16 = this.aClass104_Sub2_4.aClass470_36;
		@Pc(20) Class126 local20 = this.aClass104_Sub2_4.aClass126_3;
		@Pc(28) boolean local28 = this.aClass104_Sub2_4.anInt2947 > 0;
		if (local28) {
			local20.aClass472_37.method29549((float) (this.aClass104_Sub2_4.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_4.anInt2957 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass472_37.method29549(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt828; local72++) {
			@Pc(81) Class416 local81 = this.aClass416Array1[local72];
			@Pc(86) Class409 local86 = this.aClass409Array1[local72];
			if (!local81.aBoolean754 || !this.aClass104_Sub2_4.method20622()) {
				@Pc(115) float local115 = (float) (this.anIntArray70[local81.anInt4765] + this.anIntArray70[local81.anInt4762] + this.anIntArray70[local81.anInt4763]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray81[local81.anInt4765] + this.anIntArray81[local81.anInt4762] + this.anIntArray81[local81.anInt4763]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray71[local81.anInt4765] + this.anIntArray71[local81.anInt4762] + this.anIntArray71[local81.anInt4763]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray116[0] * local115 + arg0.aFloatArray116[4] * local136 + arg0.aFloatArray116[8] * local157 + arg0.aFloatArray116[12];
				@Pc(209) float local209 = arg0.aFloatArray116[1] * local115 + arg0.aFloatArray116[5] * local136 + arg0.aFloatArray116[9] * local157 + arg0.aFloatArray116[13];
				@Pc(235) float local235 = arg0.aFloatArray116[2] * local115 + arg0.aFloatArray116[6] * local136 + arg0.aFloatArray116[10] * local157 + arg0.aFloatArray116[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4766;
				local16.method29374(local86.anInt4700, local86.anInt4699 * local81.aShort169 >> 7, local86.anInt4701 * local81.aShort168 >> 7, local183 + (float) local86.anInt4704 - local183 * local256, local209 + (float) local86.anInt4703 - local209 * local256, local235 - local235 * local256);
				local16.method29427(this.aClass104_Sub2_4.aClass470_34);
				this.aClass104_Sub2_4.aClass489_73.method29865(local16);
				local20.method10032(this.aClass104_Sub2_4.aClass489_73);
				local20.aClass489_37.method29850();
				local20.anInt1118 = local86.anInt4702;
				if (local28) {
					local20.aFloat121 = 1.0F - (this.aClass104_Sub2_4.aFloat209 - local235) / (this.aClass104_Sub2_4.aFloat209 - this.aClass104_Sub2_4.aFloat216);
				}
				local20.anInterface38_13 = null;
				if (local81.aShort170 != -1) {
					local20.anInterface38_13 = this.aClass104_Sub2_4.aClass406_3.method28562(this.aClass104_Sub2_4.aClass225_6.method25597(local81.aShort170 & 0xFFFF, 1063541402));
				}
				local20.method10034(local28);
			}
		}
		this.aClass104_Sub2_4.method20603(true);
	}

	@OriginalMember(owner = "client!afo", name = "hc", descriptor = "()Z", line = 3177)
	boolean method7072() {
		if (this.aClass394_1.aBoolean744) {
			return true;
		}
		if (this.aClass394_1.anInterface40_5 == null) {
			this.aClass394_1.anInterface40_5 = this.aClass104_Sub2_4.method21165(false);
		}
		@Pc(20) Interface40 local20 = this.aClass394_1.anInterface40_5;
		local20.method29351(this.anInt820 * 6);
		@Pc(30) Unsafe local30 = this.aClass104_Sub2_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt820 * 6;
			@Pc(42) long local42 = local20.method29332(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt820; local50++) {
				local30.putShort(local42, this.aShortArray30[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray39[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
			}
			local20.method29344();
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass104_Sub2_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt820; local113++) {
			local108.putShort(this.aShortArray30[local113]);
			local108.putShort(this.aShortArray39[local113]);
			local108.putShort(this.aShortArray36[local113]);
		}
		if (local20.method29333(0, local108.position(), this.aClass104_Sub2_4.aLong132)) {
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ju", descriptor = "()Z", line = 3177)
	boolean method7073() {
		if (this.aClass394_1.aBoolean744) {
			return true;
		}
		if (this.aClass394_1.anInterface40_5 == null) {
			this.aClass394_1.anInterface40_5 = this.aClass104_Sub2_4.method21165(false);
		}
		@Pc(20) Interface40 local20 = this.aClass394_1.anInterface40_5;
		local20.method29351(this.anInt820 * 6);
		@Pc(30) Unsafe local30 = this.aClass104_Sub2_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt820 * 6;
			@Pc(42) long local42 = local20.method29332(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt820; local50++) {
				local30.putShort(local42, this.aShortArray30[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray39[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
			}
			local20.method29344();
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass104_Sub2_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt820; local113++) {
			local108.putShort(this.aShortArray30[local113]);
			local108.putShort(this.aShortArray39[local113]);
			local108.putShort(this.aShortArray36[local113]);
		}
		if (local20.method29333(0, local108.position(), this.aClass104_Sub2_4.aLong132)) {
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "jy", descriptor = "()Z", line = 3177)
	boolean method7074() {
		if (this.aClass394_1.aBoolean744) {
			return true;
		}
		if (this.aClass394_1.anInterface40_5 == null) {
			this.aClass394_1.anInterface40_5 = this.aClass104_Sub2_4.method21165(false);
		}
		@Pc(20) Interface40 local20 = this.aClass394_1.anInterface40_5;
		local20.method29351(this.anInt820 * 6);
		@Pc(30) Unsafe local30 = this.aClass104_Sub2_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt820 * 6;
			@Pc(42) long local42 = local20.method29332(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt820; local50++) {
				local30.putShort(local42, this.aShortArray30[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray39[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
			}
			local20.method29344();
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass104_Sub2_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt820; local113++) {
			local108.putShort(this.aShortArray30[local113]);
			local108.putShort(this.aShortArray39[local113]);
			local108.putShort(this.aShortArray36[local113]);
		}
		if (local20.method29333(0, local108.position(), this.aClass104_Sub2_4.aLong132)) {
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "jl", descriptor = "()Z", line = 3177)
	boolean method7075() {
		if (this.aClass394_1.aBoolean744) {
			return true;
		}
		if (this.aClass394_1.anInterface40_5 == null) {
			this.aClass394_1.anInterface40_5 = this.aClass104_Sub2_4.method21165(false);
		}
		@Pc(20) Interface40 local20 = this.aClass394_1.anInterface40_5;
		local20.method29351(this.anInt820 * 6);
		@Pc(30) Unsafe local30 = this.aClass104_Sub2_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt820 * 6;
			@Pc(42) long local42 = local20.method29332(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt820; local50++) {
				local30.putShort(local42, this.aShortArray30[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray39[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
			}
			local20.method29344();
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass104_Sub2_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt820; local113++) {
			local108.putShort(this.aShortArray30[local113]);
			local108.putShort(this.aShortArray39[local113]);
			local108.putShort(this.aShortArray36[local113]);
		}
		if (local20.method29333(0, local108.position(), this.aClass104_Sub2_4.aLong132)) {
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "jn", descriptor = "()Z", line = 3177)
	boolean method7076() {
		if (this.aClass394_1.aBoolean744) {
			return true;
		}
		if (this.aClass394_1.anInterface40_5 == null) {
			this.aClass394_1.anInterface40_5 = this.aClass104_Sub2_4.method21165(false);
		}
		@Pc(20) Interface40 local20 = this.aClass394_1.anInterface40_5;
		local20.method29351(this.anInt820 * 6);
		@Pc(30) Unsafe local30 = this.aClass104_Sub2_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt820 * 6;
			@Pc(42) long local42 = local20.method29332(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt820; local50++) {
				local30.putShort(local42, this.aShortArray30[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray39[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
			}
			local20.method29344();
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass104_Sub2_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt820; local113++) {
			local108.putShort(this.aShortArray30[local113]);
			local108.putShort(this.aShortArray39[local113]);
			local108.putShort(this.aShortArray36[local113]);
		}
		if (local20.method29333(0, local108.position(), this.aClass104_Sub2_4.aLong132)) {
			this.aClass394_1.anInterface40_6 = local20;
			this.aClass394_1.aBoolean744 = true;
			this.aBoolean167 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afo", name = "jb", descriptor = "()Z", line = 3219)
	boolean method7077() {
		@Pc(7) boolean local7 = !this.aClass417_2.aBoolean756;
		@Pc(20) boolean local20 = (this.anInt813 & 0x37) != 0 && !this.aClass417_3.aBoolean756;
		@Pc(28) boolean local28 = !this.aClass417_1.aBoolean756;
		@Pc(36) boolean local36 = !this.aClass417_4.aBoolean756;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface37 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray29 != null) {
			if (this.aClass417_1.anInterface37_22 == null) {
				this.aClass417_1.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_1.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray81[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray29[local154]]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 12;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local104 = this.aShortArray29[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_1.anInterface37_23 = local69;
			this.aClass417_1.aBoolean756 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass417_2.anInterface37_22 == null) {
				this.aClass417_2.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_2.anInterface37_22;
			local69.method29315(this.anInt817 * 4, 4);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass423_1 == null) {
						local600 = this.aShortArray35;
						local604 = this.aShortArray31;
						local264 = this.aShortArray32;
						local612 = this.aByteArray24;
					} else {
						local600 = this.aClass423_1.aShortArray128;
						local604 = this.aClass423_1.aShortArray127;
						local264 = this.aClass423_1.aShortArray129;
						local612 = this.aClass423_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(645) float local645 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local647 = 0; local647 < this.anInt817; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7085(this.aShortArray34[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort66);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local346 = (float) (local311 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass104_Sub2_4.aFloat211 + local366 * (local366 < 0.0F ? local645 : local635);
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
						local149.putInt(255 - this.aByteArray23[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt817; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray23[local876] << 24 | this.method7085(this.aShortArray34[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort66);
						local149.putInt(local95);
					}
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 4;
				local93 = local69.method29332(0, local88);
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass423_1 == null) {
						local264 = this.aShortArray35;
						local268 = this.aShortArray31;
						local272 = this.aShortArray32;
						local276 = this.aByteArray24;
					} else {
						local264 = this.aClass423_1.aShortArray128;
						local268 = this.aClass423_1.aShortArray127;
						local272 = this.aClass423_1.aShortArray129;
						local276 = this.aClass423_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(309) float local309 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local311 = 0; local311 < this.anInt817; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7085(this.aShortArray34[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort66);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local366 = (float) (local335 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass104_Sub2_4.aFloat211 + local407 * (local407 < 0.0F ? local309 : local299);
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
						local81.putInt(local93, 255 - this.aByteArray23[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt817; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray23[local104] << 24 | this.method7085(this.aShortArray34[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort66);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29344();
			}
			this.aClass417_2.anInterface37_23 = local69;
			this.aClass417_2.aBoolean756 = true;
		}
		if (local20) {
			if (this.aClass417_3.anInterface37_22 == null) {
				this.aClass417_3.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_3.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass423_1 == null) {
				local956 = this.aShortArray35;
				local960 = this.aShortArray31;
				local600 = this.aShortArray32;
				local968 = this.aByteArray24;
			} else {
				local956 = this.aClass423_1.aShortArray128;
				local960 = this.aClass423_1.aShortArray127;
				local600 = this.aClass423_1.aShortArray129;
				local968 = this.aClass423_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass104_Sub2_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass104_Sub2_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt817; local568++) {
					@Pc(1098) Class472 local1098 = new Class472((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29593() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29615((float) local968[local568]);
						}
						local1098.method29564();
					}
					local1073.putFloat(local1098.aFloat317);
					local1073.putFloat(local1098.aFloat318);
					local1073.putFloat(local1098.aFloat319);
				}
				local69.method29333(0, local1073.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				@Pc(992) int local992 = this.anInt817 * 12;
				@Pc(997) long local997 = local69.method29332(0, local992);
				for (local647 = 0; local647 < this.anInt817; local647++) {
					@Pc(1019) Class472 local1019 = new Class472((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29593() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29615((float) local968[local647]);
						}
						local1019.method29564();
					}
					local985.putFloat(local997, local1019.aFloat317);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat318);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat319);
					local997 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_3.anInterface37_23 = local69;
			this.aClass417_3.aBoolean756 = true;
		}
		if (local36) {
			if (this.aClass417_4.anInterface37_22 == null) {
				this.aClass417_4.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_4.anInterface37_22;
			local69.method29315(this.anInt817 * 8, 8);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat(this.aFloatArray28[local154]);
					local149.putFloat(this.aFloatArray30[local154]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 8;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_4.anInterface37_23 = local69;
			this.aClass417_4.aBoolean756 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afo", name = "ho", descriptor = "()Z", line = 3219)
	boolean method7078() {
		@Pc(7) boolean local7 = !this.aClass417_2.aBoolean756;
		@Pc(20) boolean local20 = (this.anInt813 & 0x37) != 0 && !this.aClass417_3.aBoolean756;
		@Pc(28) boolean local28 = !this.aClass417_1.aBoolean756;
		@Pc(36) boolean local36 = !this.aClass417_4.aBoolean756;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface37 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray29 != null) {
			if (this.aClass417_1.anInterface37_22 == null) {
				this.aClass417_1.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_1.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray81[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray29[local154]]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 12;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local104 = this.aShortArray29[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_1.anInterface37_23 = local69;
			this.aClass417_1.aBoolean756 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass417_2.anInterface37_22 == null) {
				this.aClass417_2.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_2.anInterface37_22;
			local69.method29315(this.anInt817 * 4, 4);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass423_1 == null) {
						local600 = this.aShortArray35;
						local604 = this.aShortArray31;
						local264 = this.aShortArray32;
						local612 = this.aByteArray24;
					} else {
						local600 = this.aClass423_1.aShortArray128;
						local604 = this.aClass423_1.aShortArray127;
						local264 = this.aClass423_1.aShortArray129;
						local612 = this.aClass423_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(645) float local645 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local647 = 0; local647 < this.anInt817; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7085(this.aShortArray34[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort66);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local346 = (float) (local311 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass104_Sub2_4.aFloat211 + local366 * (local366 < 0.0F ? local645 : local635);
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
						local149.putInt(255 - this.aByteArray23[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt817; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray23[local876] << 24 | this.method7085(this.aShortArray34[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort66);
						local149.putInt(local95);
					}
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 4;
				local93 = local69.method29332(0, local88);
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass423_1 == null) {
						local264 = this.aShortArray35;
						local268 = this.aShortArray31;
						local272 = this.aShortArray32;
						local276 = this.aByteArray24;
					} else {
						local264 = this.aClass423_1.aShortArray128;
						local268 = this.aClass423_1.aShortArray127;
						local272 = this.aClass423_1.aShortArray129;
						local276 = this.aClass423_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(309) float local309 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local311 = 0; local311 < this.anInt817; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7085(this.aShortArray34[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort66);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local366 = (float) (local335 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass104_Sub2_4.aFloat211 + local407 * (local407 < 0.0F ? local309 : local299);
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
						local81.putInt(local93, 255 - this.aByteArray23[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt817; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray23[local104] << 24 | this.method7085(this.aShortArray34[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort66);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29344();
			}
			this.aClass417_2.anInterface37_23 = local69;
			this.aClass417_2.aBoolean756 = true;
		}
		if (local20) {
			if (this.aClass417_3.anInterface37_22 == null) {
				this.aClass417_3.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_3.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass423_1 == null) {
				local956 = this.aShortArray35;
				local960 = this.aShortArray31;
				local600 = this.aShortArray32;
				local968 = this.aByteArray24;
			} else {
				local956 = this.aClass423_1.aShortArray128;
				local960 = this.aClass423_1.aShortArray127;
				local600 = this.aClass423_1.aShortArray129;
				local968 = this.aClass423_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass104_Sub2_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass104_Sub2_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt817; local568++) {
					@Pc(1098) Class472 local1098 = new Class472((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29593() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29615((float) local968[local568]);
						}
						local1098.method29564();
					}
					local1073.putFloat(local1098.aFloat317);
					local1073.putFloat(local1098.aFloat318);
					local1073.putFloat(local1098.aFloat319);
				}
				local69.method29333(0, local1073.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				@Pc(992) int local992 = this.anInt817 * 12;
				@Pc(997) long local997 = local69.method29332(0, local992);
				for (local647 = 0; local647 < this.anInt817; local647++) {
					@Pc(1019) Class472 local1019 = new Class472((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29593() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29615((float) local968[local647]);
						}
						local1019.method29564();
					}
					local985.putFloat(local997, local1019.aFloat317);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat318);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat319);
					local997 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_3.anInterface37_23 = local69;
			this.aClass417_3.aBoolean756 = true;
		}
		if (local36) {
			if (this.aClass417_4.anInterface37_22 == null) {
				this.aClass417_4.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_4.anInterface37_22;
			local69.method29315(this.anInt817 * 8, 8);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat(this.aFloatArray28[local154]);
					local149.putFloat(this.aFloatArray30[local154]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 8;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_4.anInterface37_23 = local69;
			this.aClass417_4.aBoolean756 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afo", name = "je", descriptor = "()Z", line = 3219)
	boolean method7079() {
		@Pc(7) boolean local7 = !this.aClass417_2.aBoolean756;
		@Pc(20) boolean local20 = (this.anInt813 & 0x37) != 0 && !this.aClass417_3.aBoolean756;
		@Pc(28) boolean local28 = !this.aClass417_1.aBoolean756;
		@Pc(36) boolean local36 = !this.aClass417_4.aBoolean756;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface37 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray29 != null) {
			if (this.aClass417_1.anInterface37_22 == null) {
				this.aClass417_1.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_1.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray81[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray29[local154]]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 12;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local104 = this.aShortArray29[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_1.anInterface37_23 = local69;
			this.aClass417_1.aBoolean756 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass417_2.anInterface37_22 == null) {
				this.aClass417_2.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_2.anInterface37_22;
			local69.method29315(this.anInt817 * 4, 4);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass423_1 == null) {
						local600 = this.aShortArray35;
						local604 = this.aShortArray31;
						local264 = this.aShortArray32;
						local612 = this.aByteArray24;
					} else {
						local600 = this.aClass423_1.aShortArray128;
						local604 = this.aClass423_1.aShortArray127;
						local264 = this.aClass423_1.aShortArray129;
						local612 = this.aClass423_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(645) float local645 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local647 = 0; local647 < this.anInt817; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7085(this.aShortArray34[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort66);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local346 = (float) (local311 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass104_Sub2_4.aFloat211 + local366 * (local366 < 0.0F ? local645 : local635);
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
						local149.putInt(255 - this.aByteArray23[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt817; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray23[local876] << 24 | this.method7085(this.aShortArray34[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort66);
						local149.putInt(local95);
					}
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 4;
				local93 = local69.method29332(0, local88);
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass423_1 == null) {
						local264 = this.aShortArray35;
						local268 = this.aShortArray31;
						local272 = this.aShortArray32;
						local276 = this.aByteArray24;
					} else {
						local264 = this.aClass423_1.aShortArray128;
						local268 = this.aClass423_1.aShortArray127;
						local272 = this.aClass423_1.aShortArray129;
						local276 = this.aClass423_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(309) float local309 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local311 = 0; local311 < this.anInt817; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7085(this.aShortArray34[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort66);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local366 = (float) (local335 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass104_Sub2_4.aFloat211 + local407 * (local407 < 0.0F ? local309 : local299);
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
						local81.putInt(local93, 255 - this.aByteArray23[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt817; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray23[local104] << 24 | this.method7085(this.aShortArray34[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort66);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29344();
			}
			this.aClass417_2.anInterface37_23 = local69;
			this.aClass417_2.aBoolean756 = true;
		}
		if (local20) {
			if (this.aClass417_3.anInterface37_22 == null) {
				this.aClass417_3.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_3.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass423_1 == null) {
				local956 = this.aShortArray35;
				local960 = this.aShortArray31;
				local600 = this.aShortArray32;
				local968 = this.aByteArray24;
			} else {
				local956 = this.aClass423_1.aShortArray128;
				local960 = this.aClass423_1.aShortArray127;
				local600 = this.aClass423_1.aShortArray129;
				local968 = this.aClass423_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass104_Sub2_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass104_Sub2_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt817; local568++) {
					@Pc(1098) Class472 local1098 = new Class472((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29593() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29615((float) local968[local568]);
						}
						local1098.method29564();
					}
					local1073.putFloat(local1098.aFloat317);
					local1073.putFloat(local1098.aFloat318);
					local1073.putFloat(local1098.aFloat319);
				}
				local69.method29333(0, local1073.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				@Pc(992) int local992 = this.anInt817 * 12;
				@Pc(997) long local997 = local69.method29332(0, local992);
				for (local647 = 0; local647 < this.anInt817; local647++) {
					@Pc(1019) Class472 local1019 = new Class472((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29593() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29615((float) local968[local647]);
						}
						local1019.method29564();
					}
					local985.putFloat(local997, local1019.aFloat317);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat318);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat319);
					local997 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_3.anInterface37_23 = local69;
			this.aClass417_3.aBoolean756 = true;
		}
		if (local36) {
			if (this.aClass417_4.anInterface37_22 == null) {
				this.aClass417_4.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_4.anInterface37_22;
			local69.method29315(this.anInt817 * 8, 8);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat(this.aFloatArray28[local154]);
					local149.putFloat(this.aFloatArray30[local154]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 8;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_4.anInterface37_23 = local69;
			this.aClass417_4.aBoolean756 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afo", name = "jm", descriptor = "()Z", line = 3219)
	boolean method7080() {
		@Pc(7) boolean local7 = !this.aClass417_2.aBoolean756;
		@Pc(20) boolean local20 = (this.anInt813 & 0x37) != 0 && !this.aClass417_3.aBoolean756;
		@Pc(28) boolean local28 = !this.aClass417_1.aBoolean756;
		@Pc(36) boolean local36 = !this.aClass417_4.aBoolean756;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface37 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray29 != null) {
			if (this.aClass417_1.anInterface37_22 == null) {
				this.aClass417_1.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_1.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray81[this.aShortArray29[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray29[local154]]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 12;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local104 = this.aShortArray29[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray81[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_1.anInterface37_23 = local69;
			this.aClass417_1.aBoolean756 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass417_2.anInterface37_22 == null) {
				this.aClass417_2.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_2.anInterface37_22;
			local69.method29315(this.anInt817 * 4, 4);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass423_1 == null) {
						local600 = this.aShortArray35;
						local604 = this.aShortArray31;
						local264 = this.aShortArray32;
						local612 = this.aByteArray24;
					} else {
						local600 = this.aClass423_1.aShortArray128;
						local604 = this.aClass423_1.aShortArray127;
						local264 = this.aClass423_1.aShortArray129;
						local612 = this.aClass423_1.aByteArray92;
					}
					@Pc(635) float local635 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(645) float local645 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local647 = 0; local647 < this.anInt817; local647++) {
						@Pc(656) short local656 = this.aShortArray27[local647];
						local311 = this.method7085(this.aShortArray34[local656] & 0xFFFF, this.aShortArray33[local656], this.aShort66);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local346 = (float) (local311 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local600[local647] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local604[local647] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass104_Sub2_4.aFloat211 + local366 * (local366 < 0.0F ? local645 : local635);
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
						local149.putInt(255 - this.aByteArray23[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt817; local154++) {
						@Pc(876) short local876 = this.aShortArray27[local154];
						local95 = 255 - this.aByteArray23[local876] << 24 | this.method7085(this.aShortArray34[local876] & 0xFFFF, this.aShortArray33[local876], this.aShort66);
						local149.putInt(local95);
					}
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 4;
				local93 = local69.method29332(0, local88);
				if ((this.anInt813 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass423_1 == null) {
						local264 = this.aShortArray35;
						local268 = this.aShortArray31;
						local272 = this.aShortArray32;
						local276 = this.aByteArray24;
					} else {
						local264 = this.aClass423_1.aShortArray128;
						local268 = this.aClass423_1.aShortArray127;
						local272 = this.aClass423_1.aShortArray129;
						local276 = this.aClass423_1.aByteArray92;
					}
					@Pc(299) float local299 = this.aClass104_Sub2_4.aFloat212 * 768.0F / (float) this.aShort67;
					@Pc(309) float local309 = this.aClass104_Sub2_4.aFloat213 * 768.0F / (float) this.aShort67;
					for (local311 = 0; local311 < this.anInt817; local311++) {
						@Pc(320) short local320 = this.aShortArray27[local311];
						@Pc(335) int local335 = this.method7085(this.aShortArray34[local320] & 0xFFFF, this.aShortArray33[local320], this.aShort66);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass104_Sub2_4.aFloat214;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass104_Sub2_4.aFloat210;
						local366 = (float) (local335 & 0xFF) * this.aClass104_Sub2_4.aFloat217;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass104_Sub2_4.aFloatArray63[0] * (float) local264[local311] + this.aClass104_Sub2_4.aFloatArray63[1] * (float) local268[local311] + this.aClass104_Sub2_4.aFloatArray63[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass104_Sub2_4.aFloat211 + local407 * (local407 < 0.0F ? local309 : local299);
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
						local81.putInt(local93, 255 - this.aByteArray23[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt817; local95++) {
						local104 = this.aShortArray27[local95];
						local568 = 255 - this.aByteArray23[local104] << 24 | this.method7085(this.aShortArray34[local104] & 0xFFFF, this.aShortArray33[local104], this.aShort66);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method29344();
			}
			this.aClass417_2.anInterface37_23 = local69;
			this.aClass417_2.aBoolean756 = true;
		}
		if (local20) {
			if (this.aClass417_3.anInterface37_22 == null) {
				this.aClass417_3.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_3.anInterface37_22;
			local69.method29315(this.anInt817 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass423_1 == null) {
				local956 = this.aShortArray35;
				local960 = this.aShortArray31;
				local600 = this.aShortArray32;
				local968 = this.aByteArray24;
			} else {
				local956 = this.aClass423_1.aShortArray128;
				local960 = this.aClass423_1.aShortArray127;
				local600 = this.aClass423_1.aShortArray129;
				local968 = this.aClass423_1.aByteArray92;
			}
			@Pc(985) Unsafe local985 = this.aClass104_Sub2_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass104_Sub2_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt817; local568++) {
					@Pc(1098) Class472 local1098 = new Class472((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29593() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29615((float) local968[local568]);
						}
						local1098.method29564();
					}
					local1073.putFloat(local1098.aFloat317);
					local1073.putFloat(local1098.aFloat318);
					local1073.putFloat(local1098.aFloat319);
				}
				local69.method29333(0, local1073.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				@Pc(992) int local992 = this.anInt817 * 12;
				@Pc(997) long local997 = local69.method29332(0, local992);
				for (local647 = 0; local647 < this.anInt817; local647++) {
					@Pc(1019) Class472 local1019 = new Class472((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29593() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29615((float) local968[local647]);
						}
						local1019.method29564();
					}
					local985.putFloat(local997, local1019.aFloat317);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat318);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat319);
					local997 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_3.anInterface37_23 = local69;
			this.aClass417_3.aBoolean756 = true;
		}
		if (local36) {
			if (this.aClass417_4.anInterface37_22 == null) {
				this.aClass417_4.anInterface37_22 = this.aClass104_Sub2_4.method21174(this.aBoolean166);
			}
			local69 = this.aClass417_4.anInterface37_22;
			local69.method29315(this.anInt817 * 8, 8);
			local81 = this.aClass104_Sub2_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass104_Sub2_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt817; local154++) {
					local149.putFloat(this.aFloatArray28[local154]);
					local149.putFloat(this.aFloatArray30[local154]);
				}
				local69.method29333(0, local149.position(), this.aClass104_Sub2_4.aLong132);
			} else {
				local88 = this.anInt817 * 8;
				local93 = local69.method29332(0, local88);
				for (local95 = 0; local95 < this.anInt817; local95++) {
					local81.putFloat(local93, this.aFloatArray28[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
				}
				local69.method29344();
			}
			this.aClass417_4.anInterface37_23 = local69;
			this.aClass417_4.aBoolean756 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!afo", name = "hj", descriptor = "()V", line = 3464)
	void method7081() {
		if (this.aClass417_1 != null) {
			this.aClass417_1.method28703();
		}
		if (this.aClass417_4 != null) {
			this.aClass417_4.method28703();
		}
		if (this.aClass417_2 != null) {
			this.aClass417_2.method28703();
		}
		if (this.aClass417_3 != null) {
			this.aClass417_3.method28703();
		}
		if (this.aClass394_1 != null) {
			this.aClass394_1.method28332();
		}
	}

	@OriginalMember(owner = "client!afo", name = "jw", descriptor = "()V", line = 3464)
	void method7082() {
		if (this.aClass417_1 != null) {
			this.aClass417_1.method28703();
		}
		if (this.aClass417_4 != null) {
			this.aClass417_4.method28703();
		}
		if (this.aClass417_2 != null) {
			this.aClass417_2.method28703();
		}
		if (this.aClass417_3 != null) {
			this.aClass417_3.method28703();
		}
		if (this.aClass394_1 != null) {
			this.aClass394_1.method28332();
		}
	}

	@OriginalMember(owner = "client!afo", name = "hv", descriptor = "(II)I", line = 3472)
	int method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afo", name = "jr", descriptor = "(II)I", line = 3472)
	int method7084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!afo", name = "hz", descriptor = "(ISI)I", line = 3479)
	int method7085(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass104_Sub2_4.anIntArray251[this.method7083(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class235 local20 = this.aClass104_Sub2_4.aClass225_6.method25597(arg1 & 0xFFFF, -1181250015);
			@Pc(25) int local25 = local20.aByte123 & 0xFF;
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
			local31 = local20.aByte122 & 0xFF;
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

	@OriginalMember(owner = "client!afo", name = "js", descriptor = "(ISI)I", line = 3479)
	int method7086(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass104_Sub2_4.anIntArray251[this.method7083(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class235 local20 = this.aClass104_Sub2_4.aClass225_6.method25597(arg1 & 0xFFFF, -715078152);
			@Pc(25) int local25 = local20.aByte123 & 0xFF;
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
			local31 = local20.aByte122 & 0xFF;
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
