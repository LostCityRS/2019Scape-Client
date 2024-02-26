package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class551 {

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	static final int anInt5150 = 24;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	static final int anInt5151 = 0;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	static final int anInt5152 = 1;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	static final int anInt5153 = 2;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	static final int anInt5165 = 13;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	static final int anInt5170 = 24;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	static final int anInt5171 = 192;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	static final int anInt5172 = 512;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	static final int anInt5173 = 128;

	@OriginalMember(owner = "client!sj", name = "ax", descriptor = "I")
	static final int anInt5174 = 16;

	@OriginalMember(owner = "client!sj", name = "ay", descriptor = "Lclient!dn;")
	static Class105 aClass105_8;

	@OriginalMember(owner = "client!sj", name = "ai", descriptor = "Lclient!cm;")
	static Class99 aClass99_36;

	@OriginalMember(owner = "client!sj", name = "aq", descriptor = "Lclient!cm;")
	static Class99 aClass99_37;

	@OriginalMember(owner = "client!sj", name = "ao", descriptor = "[I")
	static final int[] anIntArray473 = new int[4];

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	int anInt5157;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	int anInt5162;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	int anInt5163;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	int anInt5164;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!cm;")
	Class99 aClass99_35;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
	int anInt5166;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	final int anInt5159;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
	final int anInt5156;

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
	final int anInt5158;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Z")
	final boolean aBoolean912;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	final int anInt5169;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	final int anInt5161;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
	final int anInt5155;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
	final int anInt5154;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	int anInt5168;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
	int anInt5167;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	int anInt5160;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "()V")
	static void method31321() {
		aClass105_8 = null;
		aClass99_37 = null;
	}

	@OriginalMember(owner = "client!sj", name = "ay", descriptor = "(Lclient!di;)V")
	static void method31328(@OriginalArg(0) Class102 arg0) {
		if (aClass99_37 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass99_37 = arg0.method20741(local7, 0, 128, 128, 128, -1657536790);
		aClass99_36 = arg0.method20741(local4, 0, 128, 128, 128, -1657536790);
	}

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "(Lclient!di;)V")
	static void method31329(@OriginalArg(0) Class102 arg0) {
		if (aClass99_37 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass99_37 = arg0.method20741(local7, 0, 128, 128, 128, -1657536790);
		aClass99_36 = arg0.method20741(local4, 0, 128, 128, 128, -1657536790);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "()V")
	static void method31331() {
		aClass105_8 = null;
		aClass99_37 = null;
	}

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "(Lclient!di;)V")
	static void method31333(@OriginalArg(0) Class102 arg0) {
		if (aClass105_8 != null) {
			return;
		}
		@Pc(8) Class232 local8 = new Class232(580, 1104, 1);
		local8.method26045((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method26042(0, 128, 0);
		local8.method26042(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class467.anIntArray454[local43];
			@Pc(51) int local51 = Class467.anIntArray453[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class467.anIntArray453[local62] >> 7;
				local76 = Class467.anIntArray454[local62] * local47 >> 21;
				local84 = Class467.anIntArray454[local62] * local51 >> 21;
				local8.method26042(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method26078(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method26078(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method26078(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method26078(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3783 = local8.anInt3777;
		local8.anIntArray345 = null;
		local8.anIntArray347 = null;
		local8.aByteArray71 = null;
		aClass105_8 = arg0.method20753(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "()V")
	static void method31344() {
		aClass105_8 = null;
		aClass99_37 = null;
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5159 = arg2;
		this.anInt5156 = arg3;
		this.anInt5158 = arg4;
		this.aBoolean912 = arg7;
		this.anInt5169 = arg1;
		this.anInt5161 = arg6;
		this.anInt5155 = arg5;
		this.anInt5154 = arg0;
		this.anInt5168 = arg8;
		this.anInt5167 = arg9;
		this.anInt5160 = arg10;
	}

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "(IIII)Z")
	boolean method31320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean912) {
			this.anInt5163 = 1073741823;
			local7 = this.anInt5159;
			local12 = this.anInt5156;
			local17 = this.anInt5158;
		} else {
			local7 = this.anInt5159 - arg0;
			local12 = this.anInt5156 - arg1;
			local17 = this.anInt5158 - arg2;
			this.anInt5163 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5163 == 0) {
				this.anInt5163 = 1;
			}
			local7 = (local7 << 8) / this.anInt5163;
			local12 = (local12 << 8) / this.anInt5163;
			local17 = (local17 << 8) / this.anInt5163;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5166 = this.anInt5155 * arg3 / (this.aBoolean912 ? 1024 : this.anInt5163);
		} else {
			this.anInt5166 = 0;
		}
		if (this.anInt5166 < 8) {
			this.aClass99_35 = null;
			return false;
		}
		@Pc(143) int local143 = Class700.method37081(this.anInt5166, (byte) 9);
		if (local143 > arg3) {
			local143 = Class548.method31273(arg3, 579385640);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5164) {
			this.anInt5164 = local143;
		}
		this.anInt5162 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5157 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass99_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(IIII)Z")
	boolean method31322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean912) {
			this.anInt5163 = 1073741823;
			local7 = this.anInt5159;
			local12 = this.anInt5156;
			local17 = this.anInt5158;
		} else {
			local7 = this.anInt5159 - arg0;
			local12 = this.anInt5156 - arg1;
			local17 = this.anInt5158 - arg2;
			this.anInt5163 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5163 == 0) {
				this.anInt5163 = 1;
			}
			local7 = (local7 << 8) / this.anInt5163;
			local12 = (local12 << 8) / this.anInt5163;
			local17 = (local17 << 8) / this.anInt5163;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5166 = this.anInt5155 * arg3 / (this.aBoolean912 ? 1024 : this.anInt5163);
		} else {
			this.anInt5166 = 0;
		}
		if (this.anInt5166 < 8) {
			this.aClass99_35 = null;
			return false;
		}
		@Pc(143) int local143 = Class700.method37081(this.anInt5166, (byte) 9);
		if (local143 > arg3) {
			local143 = Class548.method31273(arg3, 1250580646);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5164) {
			this.anInt5164 = local143;
		}
		this.anInt5162 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5157 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass99_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31323(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		@Pc(5) Class232 local5 = Class232.method26043(Class391.aClass480_111, this.anInt5169, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local35 = -arg1.anInt5159;
				local37 = -arg1.anInt5156;
				local39 = -arg1.anInt5158;
			} else {
				local35 = this.anInt5159 - arg1.anInt5159;
				local37 = this.anInt5156 - arg1.anInt5156;
				local39 = this.anInt5158 - arg1.anInt5158;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5162 != 0) {
			local84 = -this.anInt5162 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5157 != 0) {
			local84 = -this.anInt5157 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20801(1.0F);
		arg0.method20765(this.anInt5161, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method26047(this.anInt5168 & 0x3FFF, this.anInt5167 & 0x3FFF, this.anInt5160 & 0x3FFF);
		@Pc(190) Class105 local190 = arg0.method20753(local5, 2048, 0, 64, 768);
		local88 = local190.method7485() - local190.method7533();
		local92 = local190.method7367() - local190.method7366();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5164 * 1024 / local102;
		@Pc(219) Class487 local219 = arg0.method20763();
		@Pc(222) Class487 local222 = arg0.method20750();
		local222.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20677(1338324586).method24036(), (float) arg0.method20677(952517649).method24037(), 1024.0F);
		arg0.method20933(local222);
		@Pc(258) Class471 local258 = new Class471();
		arg0.method20759(local258);
		@Pc(264) Class471 local264 = arg0.method20813();
		local264.method29775(0.0F, 0.0F, (float) (50 - local190.method7368()));
		local190.method7359(local264, null, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local219);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31324(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "(Lclient!di;Lclient!sj;)Z")
	boolean method31325(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		if (this.aClass99_35 == null) {
			if (this.anInt5154 == 0) {
				if (Class628.anInterface23_10.method7763(Class616.aClass616_2, this.anInt5169, -1, Class617.aClass617_2, 0.7F, this.anInt5164, this.anInt5164, false, (byte) -47)) {
					@Pc(33) int[] local33 = Class628.anInterface23_10.method7756(Class616.aClass616_2, this.anInt5169, 0.7F, this.anInt5164, this.anInt5164, false, -1844531490);
					this.aClass99_35 = arg0.method20741(local33, 0, this.anInt5164, this.anInt5164, this.anInt5164, -1657536790);
				}
			} else if (this.anInt5154 == 2) {
				this.method31343(arg0, arg1);
			} else if (this.anInt5154 == 1) {
				this.method31327(arg0, arg1);
			}
		}
		return this.aClass99_35 != null;
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "(IIII)Z")
	boolean method31326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean912) {
			this.anInt5163 = 1073741823;
			local7 = this.anInt5159;
			local12 = this.anInt5156;
			local17 = this.anInt5158;
		} else {
			local7 = this.anInt5159 - arg0;
			local12 = this.anInt5156 - arg1;
			local17 = this.anInt5158 - arg2;
			this.anInt5163 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5163 == 0) {
				this.anInt5163 = 1;
			}
			local7 = (local7 << 8) / this.anInt5163;
			local12 = (local12 << 8) / this.anInt5163;
			local17 = (local17 << 8) / this.anInt5163;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5166 = this.anInt5155 * arg3 / (this.aBoolean912 ? 1024 : this.anInt5163);
		} else {
			this.anInt5166 = 0;
		}
		if (this.anInt5166 < 8) {
			this.aClass99_35 = null;
			return false;
		}
		@Pc(143) int local143 = Class700.method37081(this.anInt5166, (byte) 9);
		if (local143 > arg3) {
			local143 = Class548.method31273(arg3, 1440621094);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5164) {
			this.anInt5164 = local143;
		}
		this.anInt5162 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5157 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass99_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31327(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		method31333(arg0);
		method31329(arg0);
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, this.anInt5161 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local33 = -arg1.anInt5159;
				local35 = -arg1.anInt5156;
				local37 = -arg1.anInt5158;
			} else {
				local33 = arg1.anInt5159 - this.anInt5159;
				local35 = arg1.anInt5156 - this.anInt5156;
				local37 = arg1.anInt5158 - this.anInt5158;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5162 != 0) {
			local81 = Class467.anIntArray454[this.anInt5162];
			local86 = Class467.anIntArray453[this.anInt5162];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5157 != 0) {
			local81 = Class467.anIntArray454[this.anInt5157];
			local86 = Class467.anIntArray453[this.anInt5157];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class105 local149 = aClass105_8.method7324((byte) 0, 51200, true);
		local149.method7341((short) 0, (short) this.anInt5169);
		arg0.method20801(1.0F);
		arg0.method20765(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5164 * 1024 / (local149.method7485() - local149.method7533());
		if (this.anInt5161 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class487 local192 = arg0.method20763();
		@Pc(195) Class487 local195 = arg0.method20750();
		local195.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20677(1513502437).method24036(), (float) arg0.method20677(1538998379).method24037(), 1024.0F);
		arg0.method20933(local195);
		arg0.method20759(new Class471());
		@Pc(236) Class471 local236 = new Class471();
		local236.method29775(0.0F, 0.0F, (float) (50 - local149.method7368()));
		local149.method7359(local236, null, 1);
		@Pc(257) int local257 = this.anInt5164 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5164 - local257) / 2;
		aClass99_36.method18229(local264, local264, local257, local257, 0, this.anInt5161 | 0xFF000000, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		aClass99_37.method18229(0, 0, this.anInt5164, this.anInt5164, 1, 0, 0);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local192);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "(Lclient!di;Lclient!sj;)Z")
	boolean method31330(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		if (this.aClass99_35 == null) {
			if (this.anInt5154 == 0) {
				if (Class628.anInterface23_10.method7763(Class616.aClass616_2, this.anInt5169, -1, Class617.aClass617_2, 0.7F, this.anInt5164, this.anInt5164, false, (byte) 48)) {
					@Pc(33) int[] local33 = Class628.anInterface23_10.method7756(Class616.aClass616_2, this.anInt5169, 0.7F, this.anInt5164, this.anInt5164, false, 831851985);
					this.aClass99_35 = arg0.method20741(local33, 0, this.anInt5164, this.anInt5164, this.anInt5164, -1657536790);
				}
			} else if (this.anInt5154 == 2) {
				this.method31343(arg0, arg1);
			} else if (this.anInt5154 == 1) {
				this.method31327(arg0, arg1);
			}
		}
		return this.aClass99_35 != null;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(Lclient!di;Lclient!sj;)Z")
	boolean method31332(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		return this.aClass99_35 != null || this.method31325(arg0, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "(IIII)Z")
	boolean method31334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean912) {
			this.anInt5163 = 1073741823;
			local7 = this.anInt5159;
			local12 = this.anInt5156;
			local17 = this.anInt5158;
		} else {
			local7 = this.anInt5159 - arg0;
			local12 = this.anInt5156 - arg1;
			local17 = this.anInt5158 - arg2;
			this.anInt5163 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5163 == 0) {
				this.anInt5163 = 1;
			}
			local7 = (local7 << 8) / this.anInt5163;
			local12 = (local12 << 8) / this.anInt5163;
			local17 = (local17 << 8) / this.anInt5163;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5166 = this.anInt5155 * arg3 / (this.aBoolean912 ? 1024 : this.anInt5163);
		} else {
			this.anInt5166 = 0;
		}
		if (this.anInt5166 < 8) {
			this.aClass99_35 = null;
			return false;
		}
		@Pc(143) int local143 = Class700.method37081(this.anInt5166, (byte) 9);
		if (local143 > arg3) {
			local143 = Class548.method31273(arg3, 1244991415);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5164) {
			this.anInt5164 = local143;
		}
		this.anInt5162 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5157 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass99_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "(IIII)Z")
	boolean method31335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean912) {
			this.anInt5163 = 1073741823;
			local7 = this.anInt5159;
			local12 = this.anInt5156;
			local17 = this.anInt5158;
		} else {
			local7 = this.anInt5159 - arg0;
			local12 = this.anInt5156 - arg1;
			local17 = this.anInt5158 - arg2;
			this.anInt5163 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5163 == 0) {
				this.anInt5163 = 1;
			}
			local7 = (local7 << 8) / this.anInt5163;
			local12 = (local12 << 8) / this.anInt5163;
			local17 = (local17 << 8) / this.anInt5163;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5166 = this.anInt5155 * arg3 / (this.aBoolean912 ? 1024 : this.anInt5163);
		} else {
			this.anInt5166 = 0;
		}
		if (this.anInt5166 < 8) {
			this.aClass99_35 = null;
			return false;
		}
		@Pc(143) int local143 = Class700.method37081(this.anInt5166, (byte) 9);
		if (local143 > arg3) {
			local143 = Class548.method31273(arg3, -1109596339);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5164) {
			this.anInt5164 = local143;
		}
		this.anInt5162 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5157 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass99_35 = null;
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31336(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31337(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31338(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "ax", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31339(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		method31333(arg0);
		method31329(arg0);
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, this.anInt5161 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local33 = -arg1.anInt5159;
				local35 = -arg1.anInt5156;
				local37 = -arg1.anInt5158;
			} else {
				local33 = arg1.anInt5159 - this.anInt5159;
				local35 = arg1.anInt5156 - this.anInt5156;
				local37 = arg1.anInt5158 - this.anInt5158;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5162 != 0) {
			local81 = Class467.anIntArray454[this.anInt5162];
			local86 = Class467.anIntArray453[this.anInt5162];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5157 != 0) {
			local81 = Class467.anIntArray454[this.anInt5157];
			local86 = Class467.anIntArray453[this.anInt5157];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class105 local149 = aClass105_8.method7324((byte) 0, 51200, true);
		local149.method7341((short) 0, (short) this.anInt5169);
		arg0.method20801(1.0F);
		arg0.method20765(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5164 * 1024 / (local149.method7485() - local149.method7533());
		if (this.anInt5161 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class487 local192 = arg0.method20763();
		@Pc(195) Class487 local195 = arg0.method20750();
		local195.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20677(1037437659).method24036(), (float) arg0.method20677(1997403613).method24037(), 1024.0F);
		arg0.method20933(local195);
		arg0.method20759(new Class471());
		@Pc(236) Class471 local236 = new Class471();
		local236.method29775(0.0F, 0.0F, (float) (50 - local149.method7368()));
		local149.method7359(local236, null, 1);
		@Pc(257) int local257 = this.anInt5164 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5164 - local257) / 2;
		aClass99_36.method18229(local264, local264, local257, local257, 0, this.anInt5161 | 0xFF000000, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		aClass99_37.method18229(0, 0, this.anInt5164, this.anInt5164, 1, 0, 0);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local192);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31340(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "(Lclient!di;Lclient!sj;)Z")
	boolean method31341(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		if (this.aClass99_35 == null) {
			if (this.anInt5154 == 0) {
				if (Class628.anInterface23_10.method7763(Class616.aClass616_2, this.anInt5169, -1, Class617.aClass617_2, 0.7F, this.anInt5164, this.anInt5164, false, (byte) -84)) {
					@Pc(33) int[] local33 = Class628.anInterface23_10.method7756(Class616.aClass616_2, this.anInt5169, 0.7F, this.anInt5164, this.anInt5164, false, -379770355);
					this.aClass99_35 = arg0.method20741(local33, 0, this.anInt5164, this.anInt5164, this.anInt5164, -1657536790);
				}
			} else if (this.anInt5154 == 2) {
				this.method31343(arg0, arg1);
			} else if (this.anInt5154 == 1) {
				this.method31327(arg0, arg1);
			}
		}
		return this.aClass99_35 != null;
	}

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31342(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		@Pc(5) Class232 local5 = Class232.method26043(Class391.aClass480_111, this.anInt5169, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local35 = -arg1.anInt5159;
				local37 = -arg1.anInt5156;
				local39 = -arg1.anInt5158;
			} else {
				local35 = this.anInt5159 - arg1.anInt5159;
				local37 = this.anInt5156 - arg1.anInt5156;
				local39 = this.anInt5158 - arg1.anInt5158;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5162 != 0) {
			local84 = -this.anInt5162 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5157 != 0) {
			local84 = -this.anInt5157 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20801(1.0F);
		arg0.method20765(this.anInt5161, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method26047(this.anInt5168 & 0x3FFF, this.anInt5167 & 0x3FFF, this.anInt5160 & 0x3FFF);
		@Pc(190) Class105 local190 = arg0.method20753(local5, 2048, 0, 64, 768);
		local88 = local190.method7485() - local190.method7533();
		local92 = local190.method7367() - local190.method7366();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5164 * 1024 / local102;
		@Pc(219) Class487 local219 = arg0.method20763();
		@Pc(222) Class487 local222 = arg0.method20750();
		local222.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20677(1357348561).method24036(), (float) arg0.method20677(1899005718).method24037(), 1024.0F);
		arg0.method20933(local222);
		@Pc(258) Class471 local258 = new Class471();
		arg0.method20759(local258);
		@Pc(264) Class471 local264 = arg0.method20813();
		local264.method29775(0.0F, 0.0F, (float) (50 - local190.method7368()));
		local190.method7359(local264, null, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local219);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31343(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		@Pc(5) Class232 local5 = Class232.method26043(Class391.aClass480_111, this.anInt5169, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local35 = -arg1.anInt5159;
				local37 = -arg1.anInt5156;
				local39 = -arg1.anInt5158;
			} else {
				local35 = this.anInt5159 - arg1.anInt5159;
				local37 = this.anInt5156 - arg1.anInt5156;
				local39 = this.anInt5158 - arg1.anInt5158;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5162 != 0) {
			local84 = -this.anInt5162 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5157 != 0) {
			local84 = -this.anInt5157 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20801(1.0F);
		arg0.method20765(this.anInt5161, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method26047(this.anInt5168 & 0x3FFF, this.anInt5167 & 0x3FFF, this.anInt5160 & 0x3FFF);
		@Pc(190) Class105 local190 = arg0.method20753(local5, 2048, 0, 64, 768);
		local88 = local190.method7485() - local190.method7533();
		local92 = local190.method7367() - local190.method7366();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5164 * 1024 / local102;
		@Pc(219) Class487 local219 = arg0.method20763();
		@Pc(222) Class487 local222 = arg0.method20750();
		local222.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20677(1698493223).method24036(), (float) arg0.method20677(1042838684).method24037(), 1024.0F);
		arg0.method20933(local222);
		@Pc(258) Class471 local258 = new Class471();
		arg0.method20759(local258);
		@Pc(264) Class471 local264 = arg0.method20813();
		local264.method29775(0.0F, 0.0F, (float) (50 - local190.method7368()));
		local190.method7359(local264, null, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local219);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31345(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		method31333(arg0);
		method31329(arg0);
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, this.anInt5161 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local33 = -arg1.anInt5159;
				local35 = -arg1.anInt5156;
				local37 = -arg1.anInt5158;
			} else {
				local33 = arg1.anInt5159 - this.anInt5159;
				local35 = arg1.anInt5156 - this.anInt5156;
				local37 = arg1.anInt5158 - this.anInt5158;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5162 != 0) {
			local81 = Class467.anIntArray454[this.anInt5162];
			local86 = Class467.anIntArray453[this.anInt5162];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5157 != 0) {
			local81 = Class467.anIntArray454[this.anInt5157];
			local86 = Class467.anIntArray453[this.anInt5157];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class105 local149 = aClass105_8.method7324((byte) 0, 51200, true);
		local149.method7341((short) 0, (short) this.anInt5169);
		arg0.method20801(1.0F);
		arg0.method20765(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5164 * 1024 / (local149.method7485() - local149.method7533());
		if (this.anInt5161 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class487 local192 = arg0.method20763();
		@Pc(195) Class487 local195 = arg0.method20750();
		local195.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20677(1432302711).method24036(), (float) arg0.method20677(1908990126).method24037(), 1024.0F);
		arg0.method20933(local195);
		arg0.method20759(new Class471());
		@Pc(236) Class471 local236 = new Class471();
		local236.method29775(0.0F, 0.0F, (float) (50 - local149.method7368()));
		local149.method7359(local236, null, 1);
		@Pc(257) int local257 = this.anInt5164 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5164 - local257) / 2;
		aClass99_36.method18229(local264, local264, local257, local257, 0, this.anInt5161 | 0xFF000000, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		aClass99_37.method18229(0, 0, this.anInt5164, this.anInt5164, 1, 0, 0);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local192);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(Lclient!di;IIIIIIIIII)V")
	void method31346(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass99_35 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5159 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5156 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5158 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20897().method29789(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method21114(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5166 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5166 / 2));
		if (local93 < arg4 && local93 + this.anInt5166 > 0 && local82 < arg3 && local82 + this.anInt5166 > 0) {
			this.aClass99_35.method18229(local82, local93, this.anInt5166, this.anInt5166, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "(Lclient!di;Lclient!sj;)V")
	void method31347(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class551 arg1) {
		@Pc(5) Class232 local5 = Class232.method26043(Class391.aClass480_111, this.anInt5169, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20713(anIntArray473);
		arg0.method20986(0, 0, this.anInt5164, this.anInt5164);
		arg0.method20714(2, 0);
		arg0.method20722(0, 0, this.anInt5164, this.anInt5164, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean912) {
				local35 = -arg1.anInt5159;
				local37 = -arg1.anInt5156;
				local39 = -arg1.anInt5158;
			} else {
				local35 = this.anInt5159 - arg1.anInt5159;
				local37 = this.anInt5156 - arg1.anInt5156;
				local39 = this.anInt5158 - arg1.anInt5158;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5162 != 0) {
			local84 = -this.anInt5162 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5157 != 0) {
			local84 = -this.anInt5157 & 0x3FFF;
			local88 = Class467.anIntArray454[local84];
			local92 = Class467.anIntArray453[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20801(1.0F);
		arg0.method20765(this.anInt5161, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method26047(this.anInt5168 & 0x3FFF, this.anInt5167 & 0x3FFF, this.anInt5160 & 0x3FFF);
		@Pc(190) Class105 local190 = arg0.method20753(local5, 2048, 0, 64, 768);
		local88 = local190.method7485() - local190.method7533();
		local92 = local190.method7367() - local190.method7366();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5164 * 1024 / local102;
		@Pc(219) Class487 local219 = arg0.method20763();
		@Pc(222) Class487 local222 = arg0.method20750();
		local222.method30092((float) (this.anInt5164 / 2), (float) (this.anInt5164 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20677(1378483954).method24036(), (float) arg0.method20677(1952171394).method24037(), 1024.0F);
		arg0.method20933(local222);
		@Pc(258) Class471 local258 = new Class471();
		arg0.method20759(local258);
		@Pc(264) Class471 local264 = arg0.method20813();
		local264.method29775(0.0F, 0.0F, (float) (50 - local190.method7368()));
		local190.method7359(local264, null, 1);
		this.aClass99_35 = arg0.method20743(0, 0, this.anInt5164, this.anInt5164, true);
		this.aClass99_35.method18224(0, 0, 3);
		arg0.method20933(local219);
		arg0.method20986(anIntArray473[0], anIntArray473[1], anIntArray473[2], anIntArray473[3]);
	}
}
