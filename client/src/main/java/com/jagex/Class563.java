package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class563 {

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	static final int anInt5514 = 24;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
	static final int anInt5515 = 0;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	static final int anInt5516 = 1;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	static final int anInt5520 = 24;

	@OriginalMember(owner = "client!sw", name = "ah", descriptor = "Lclient!cm;")
	static Class100 aClass100_47;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	static final int anInt5523 = 2;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	static final int anInt5524 = 512;

	@OriginalMember(owner = "client!sw", name = "ag", descriptor = "Lclient!do;")
	static Class109 aClass109_8;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
	static final int anInt5533 = 192;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
	static final int anInt5534 = 128;

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
	static final int anInt5535 = 13;

	@OriginalMember(owner = "client!sw", name = "ae", descriptor = "I")
	static final int anInt5536 = 16;

	@OriginalMember(owner = "client!sw", name = "al", descriptor = "Lclient!cm;")
	static Class100 aClass100_49;

	@OriginalMember(owner = "client!sw", name = "ac", descriptor = "[I")
	static final int[] anIntArray469 = new int[4];

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
	int anInt5525;

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	int anInt5526;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
	int anInt5527;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
	int anInt5529;

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "Lclient!cm;")
	Class100 aClass100_48;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
	int anInt5532;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	final int anInt5538;

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
	final int anInt5521;

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
	final int anInt5522;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "Z")
	final boolean aBoolean821;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	final int anInt5537;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	final int anInt5517;

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
	final int anInt5519;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	final int anInt5518;

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
	int anInt5530;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
	int anInt5531;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	int anInt5528;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(Lclient!dh;)V")
	static void method31374(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20510(local7, 0, 128, 128, 128, 438797212);
		aClass100_47 = arg0.method20510(local4, 0, 128, 128, 128, 438797212);
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "()V")
	static void method31376() {
		aClass109_8 = null;
		aClass100_49 = null;
	}

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "(Lclient!dh;)V")
	static void method31383(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20510(local7, 0, 128, 128, 128, 438797212);
		aClass100_47 = arg0.method20510(local4, 0, 128, 128, 128, 438797212);
	}

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "()V")
	static void method31384() {
		aClass109_8 = null;
		aClass100_49 = null;
	}

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "(Lclient!dh;)V")
	static void method31389(@OriginalArg(0) Class104 arg0) {
		if (aClass109_8 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25752((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25753(0, 128, 0);
		local8.method25753(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray453[local43];
			@Pc(51) int local51 = Class464.anIntArray454[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray454[local62] >> 7;
				local76 = Class464.anIntArray453[local62] * local47 >> 21;
				local84 = Class464.anIntArray453[local62] * local51 >> 21;
				local8.method25753(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25783(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25783(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25783(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25783(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3781 = local8.anInt3780;
		local8.anIntArray345 = null;
		local8.anIntArray342 = null;
		local8.aByteArray73 = null;
		aClass109_8 = arg0.method20522(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!dh;)V")
	static void method31390(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20510(local7, 0, 128, 128, 128, 438797212);
		aClass100_47 = arg0.method20510(local4, 0, 128, 128, 128, 438797212);
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Lclient!dh;)V")
	static void method31393(@OriginalArg(0) Class104 arg0) {
		if (aClass109_8 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25752((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25753(0, 128, 0);
		local8.method25753(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray453[local43];
			@Pc(51) int local51 = Class464.anIntArray454[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray454[local62] >> 7;
				local76 = Class464.anIntArray453[local62] * local47 >> 21;
				local84 = Class464.anIntArray453[local62] * local51 >> 21;
				local8.method25753(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25783(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25783(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25783(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25783(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3781 = local8.anInt3780;
		local8.anIntArray345 = null;
		local8.anIntArray342 = null;
		local8.aByteArray73 = null;
		aClass109_8 = arg0.method20522(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "(Lclient!dh;)V")
	static void method31394(@OriginalArg(0) Class104 arg0) {
		if (aClass109_8 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25752((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25753(0, 128, 0);
		local8.method25753(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray453[local43];
			@Pc(51) int local51 = Class464.anIntArray454[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray454[local62] >> 7;
				local76 = Class464.anIntArray453[local62] * local47 >> 21;
				local84 = Class464.anIntArray453[local62] * local51 >> 21;
				local8.method25753(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25783(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25783(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25783(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25783(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3781 = local8.anInt3780;
		local8.anIntArray345 = null;
		local8.anIntArray342 = null;
		local8.aByteArray73 = null;
		aClass109_8 = arg0.method20522(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5538 = arg2;
		this.anInt5521 = arg3;
		this.anInt5522 = arg4;
		this.aBoolean821 = arg7;
		this.anInt5537 = arg1;
		this.anInt5517 = arg6;
		this.anInt5519 = arg5;
		this.anInt5518 = arg0;
		this.anInt5530 = arg8;
		this.anInt5531 = arg9;
		this.anInt5528 = arg10;
	}

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31375(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25748(Class280.aClass497_100, this.anInt5537, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local35 = -arg1.anInt5538;
				local37 = -arg1.anInt5521;
				local39 = -arg1.anInt5522;
			} else {
				local35 = this.anInt5538 - arg1.anInt5538;
				local37 = this.anInt5521 - arg1.anInt5521;
				local39 = this.anInt5522 - arg1.anInt5522;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5529 != 0) {
			local84 = -this.anInt5529 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5525 != 0) {
			local84 = -this.anInt5525 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20533(1.0F);
		arg0.method20534(this.anInt5517, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25763(this.anInt5530 & 0x3FFF, this.anInt5531 & 0x3FFF, this.anInt5528 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20522(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5527 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20666();
		@Pc(222) Class489 local222 = arg0.method20519();
		local222.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20446((byte) -86).method23748(), (float) arg0.method20446((byte) -21).method23749(), 1024.0F);
		arg0.method20531(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20528(local258);
		@Pc(264) Class470 local264 = arg0.method20520();
		local264.method29566(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local219);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "(Lclient!dh;Lclient!sw;)Z")
	boolean method31377(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		return this.aClass100_48 != null || this.method31396(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "(Lclient!dh;IIIIIIIIII)V")
	void method31378(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass100_48 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5538 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5521 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5522 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20529().method29571(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20836(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5532 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5532 / 2));
		if (local93 < arg4 && local93 + this.anInt5532 > 0 && local82 < arg3 && local82 + this.anInt5532 > 0) {
			this.aClass100_48.method18188(local82, local93, this.anInt5532, this.anInt5532, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31379(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25748(Class280.aClass497_100, this.anInt5537, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local35 = -arg1.anInt5538;
				local37 = -arg1.anInt5521;
				local39 = -arg1.anInt5522;
			} else {
				local35 = this.anInt5538 - arg1.anInt5538;
				local37 = this.anInt5521 - arg1.anInt5521;
				local39 = this.anInt5522 - arg1.anInt5522;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5529 != 0) {
			local84 = -this.anInt5529 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5525 != 0) {
			local84 = -this.anInt5525 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20533(1.0F);
		arg0.method20534(this.anInt5517, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25763(this.anInt5530 & 0x3FFF, this.anInt5531 & 0x3FFF, this.anInt5528 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20522(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5527 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20666();
		@Pc(222) Class489 local222 = arg0.method20519();
		local222.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20446((byte) -64).method23748(), (float) arg0.method20446((byte) -12).method23749(), 1024.0F);
		arg0.method20531(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20528(local258);
		@Pc(264) Class470 local264 = arg0.method20520();
		local264.method29566(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local219);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31380(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25748(Class280.aClass497_100, this.anInt5537, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local35 = -arg1.anInt5538;
				local37 = -arg1.anInt5521;
				local39 = -arg1.anInt5522;
			} else {
				local35 = this.anInt5538 - arg1.anInt5538;
				local37 = this.anInt5521 - arg1.anInt5521;
				local39 = this.anInt5522 - arg1.anInt5522;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5529 != 0) {
			local84 = -this.anInt5529 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5525 != 0) {
			local84 = -this.anInt5525 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20533(1.0F);
		arg0.method20534(this.anInt5517, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25763(this.anInt5530 & 0x3FFF, this.anInt5531 & 0x3FFF, this.anInt5528 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20522(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5527 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20666();
		@Pc(222) Class489 local222 = arg0.method20519();
		local222.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20446((byte) -88).method23748(), (float) arg0.method20446((byte) -58).method23749(), 1024.0F);
		arg0.method20531(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20528(local258);
		@Pc(264) Class470 local264 = arg0.method20520();
		local264.method29566(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local219);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31381(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25748(Class280.aClass497_100, this.anInt5537, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local35 = -arg1.anInt5538;
				local37 = -arg1.anInt5521;
				local39 = -arg1.anInt5522;
			} else {
				local35 = this.anInt5538 - arg1.anInt5538;
				local37 = this.anInt5521 - arg1.anInt5521;
				local39 = this.anInt5522 - arg1.anInt5522;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5529 != 0) {
			local84 = -this.anInt5529 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5525 != 0) {
			local84 = -this.anInt5525 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20533(1.0F);
		arg0.method20534(this.anInt5517, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25763(this.anInt5530 & 0x3FFF, this.anInt5531 & 0x3FFF, this.anInt5528 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20522(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5527 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20666();
		@Pc(222) Class489 local222 = arg0.method20519();
		local222.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20446((byte) -41).method23748(), (float) arg0.method20446((byte) -75).method23749(), 1024.0F);
		arg0.method20531(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20528(local258);
		@Pc(264) Class470 local264 = arg0.method20520();
		local264.method29566(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local219);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31382(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		method31389(arg0);
		method31383(arg0);
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, this.anInt5517 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local33 = -arg1.anInt5538;
				local35 = -arg1.anInt5521;
				local37 = -arg1.anInt5522;
			} else {
				local33 = arg1.anInt5538 - this.anInt5538;
				local35 = arg1.anInt5521 - this.anInt5521;
				local37 = arg1.anInt5522 - this.anInt5522;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5529 != 0) {
			local81 = Class464.anIntArray453[this.anInt5529];
			local86 = Class464.anIntArray454[this.anInt5529];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5525 != 0) {
			local81 = Class464.anIntArray453[this.anInt5525];
			local86 = Class464.anIntArray454[this.anInt5525];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class109 local149 = aClass109_8.method6907((byte) 0, 51200, true);
		local149.method6878((short) 0, (short) this.anInt5537);
		arg0.method20533(1.0F);
		arg0.method20534(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5527 * 1024 / (local149.method6864() - local149.method6863());
		if (this.anInt5517 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class489 local192 = arg0.method20666();
		@Pc(195) Class489 local195 = arg0.method20519();
		local195.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20446((byte) -118).method23748(), (float) arg0.method20446((byte) -78).method23749(), 1024.0F);
		arg0.method20531(local195);
		arg0.method20528(new Class470());
		@Pc(236) Class470 local236 = new Class470();
		local236.method29566(0.0F, 0.0F, (float) (50 - local149.method6867()));
		local149.method6947(local236, null, 1);
		@Pc(257) int local257 = this.anInt5527 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5527 - local257) / 2;
		aClass100_47.method18188(local264, local264, local257, local257, 0, this.anInt5517 | 0xFF000000, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		aClass100_49.method18188(0, 0, this.anInt5527, this.anInt5527, 1, 0, 0);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local192);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(IIII)Z")
	boolean method31385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean821) {
			this.anInt5526 = 1073741823;
			local7 = this.anInt5538;
			local12 = this.anInt5521;
			local17 = this.anInt5522;
		} else {
			local7 = this.anInt5538 - arg0;
			local12 = this.anInt5521 - arg1;
			local17 = this.anInt5522 - arg2;
			this.anInt5526 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5526 == 0) {
				this.anInt5526 = 1;
			}
			local7 = (local7 << 8) / this.anInt5526;
			local12 = (local12 << 8) / this.anInt5526;
			local17 = (local17 << 8) / this.anInt5526;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5532 = this.anInt5519 * arg3 / (this.aBoolean821 ? 1024 : this.anInt5526);
		} else {
			this.anInt5532 = 0;
		}
		if (this.anInt5532 < 8) {
			this.aClass100_48 = null;
			return false;
		}
		@Pc(143) int local143 = Class134_Sub2.method10212(this.anInt5532, (byte) 72);
		if (local143 > arg3) {
			local143 = Class278.method26458(arg3, 423254006);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5527) {
			this.anInt5527 = local143;
		}
		this.anInt5529 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5525 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass100_48 = null;
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(Lclient!dh;Lclient!sw;)Z")
	boolean method31386(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		return this.aClass100_48 != null || this.method31396(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "(Lclient!dh;Lclient!sw;)Z")
	boolean method31387(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5518 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5537, -1, Class609.aClass609_2, 0.7F, this.anInt5527, this.anInt5527, false, -1630596103)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5537, 0.7F, this.anInt5527, this.anInt5527, false, (byte) -101);
					this.aClass100_48 = arg0.method20510(local33, 0, this.anInt5527, this.anInt5527, this.anInt5527, 438797212);
				}
			} else if (this.anInt5518 == 2) {
				this.method31380(arg0, arg1);
			} else if (this.anInt5518 == 1) {
				this.method31382(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "(Lclient!dh;Lclient!sw;)Z")
	boolean method31388(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5518 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5537, -1, Class609.aClass609_2, 0.7F, this.anInt5527, this.anInt5527, false, -1630596103)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5537, 0.7F, this.anInt5527, this.anInt5527, false, (byte) -33);
					this.aClass100_48 = arg0.method20510(local33, 0, this.anInt5527, this.anInt5527, this.anInt5527, 438797212);
				}
			} else if (this.anInt5518 == 2) {
				this.method31380(arg0, arg1);
			} else if (this.anInt5518 == 1) {
				this.method31382(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31391(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25748(Class280.aClass497_100, this.anInt5537, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local35 = -arg1.anInt5538;
				local37 = -arg1.anInt5521;
				local39 = -arg1.anInt5522;
			} else {
				local35 = this.anInt5538 - arg1.anInt5538;
				local37 = this.anInt5521 - arg1.anInt5521;
				local39 = this.anInt5522 - arg1.anInt5522;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5529 != 0) {
			local84 = -this.anInt5529 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5525 != 0) {
			local84 = -this.anInt5525 & 0x3FFF;
			local88 = Class464.anIntArray453[local84];
			local92 = Class464.anIntArray454[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20533(1.0F);
		arg0.method20534(this.anInt5517, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25763(this.anInt5530 & 0x3FFF, this.anInt5531 & 0x3FFF, this.anInt5528 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20522(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5527 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20666();
		@Pc(222) Class489 local222 = arg0.method20519();
		local222.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20446((byte) -18).method23748(), (float) arg0.method20446((byte) -13).method23749(), 1024.0F);
		arg0.method20531(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20528(local258);
		@Pc(264) Class470 local264 = arg0.method20520();
		local264.method29566(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local219);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "(Lclient!dh;Lclient!sw;)V")
	void method31392(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		method31389(arg0);
		method31383(arg0);
		arg0.method20482(anIntArray469);
		arg0.method20479(0, 0, this.anInt5527, this.anInt5527);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, this.anInt5517 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean821) {
				local33 = -arg1.anInt5538;
				local35 = -arg1.anInt5521;
				local37 = -arg1.anInt5522;
			} else {
				local33 = arg1.anInt5538 - this.anInt5538;
				local35 = arg1.anInt5521 - this.anInt5521;
				local37 = arg1.anInt5522 - this.anInt5522;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5529 != 0) {
			local81 = Class464.anIntArray453[this.anInt5529];
			local86 = Class464.anIntArray454[this.anInt5529];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5525 != 0) {
			local81 = Class464.anIntArray453[this.anInt5525];
			local86 = Class464.anIntArray454[this.anInt5525];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class109 local149 = aClass109_8.method6907((byte) 0, 51200, true);
		local149.method6878((short) 0, (short) this.anInt5537);
		arg0.method20533(1.0F);
		arg0.method20534(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5527 * 1024 / (local149.method6864() - local149.method6863());
		if (this.anInt5517 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class489 local192 = arg0.method20666();
		@Pc(195) Class489 local195 = arg0.method20519();
		local195.method30036((float) (this.anInt5527 / 2), (float) (this.anInt5527 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20446((byte) -111).method23748(), (float) arg0.method20446((byte) -64).method23749(), 1024.0F);
		arg0.method20531(local195);
		arg0.method20528(new Class470());
		@Pc(236) Class470 local236 = new Class470();
		local236.method29566(0.0F, 0.0F, (float) (50 - local149.method6867()));
		local149.method6947(local236, null, 1);
		@Pc(257) int local257 = this.anInt5527 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5527 - local257) / 2;
		aClass100_47.method18188(local264, local264, local257, local257, 0, this.anInt5517 | 0xFF000000, 1);
		this.aClass100_48 = arg0.method20625(0, 0, this.anInt5527, this.anInt5527, true);
		arg0.method20786(2, 0);
		arg0.method20665(0, 0, this.anInt5527, this.anInt5527, 0, 0);
		aClass100_49.method18188(0, 0, this.anInt5527, this.anInt5527, 1, 0, 0);
		this.aClass100_48.method18183(0, 0, 3);
		arg0.method20531(local192);
		arg0.method20479(anIntArray469[0], anIntArray469[1], anIntArray469[2], anIntArray469[3]);
	}

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "(IIII)Z")
	boolean method31395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean821) {
			this.anInt5526 = 1073741823;
			local7 = this.anInt5538;
			local12 = this.anInt5521;
			local17 = this.anInt5522;
		} else {
			local7 = this.anInt5538 - arg0;
			local12 = this.anInt5521 - arg1;
			local17 = this.anInt5522 - arg2;
			this.anInt5526 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5526 == 0) {
				this.anInt5526 = 1;
			}
			local7 = (local7 << 8) / this.anInt5526;
			local12 = (local12 << 8) / this.anInt5526;
			local17 = (local17 << 8) / this.anInt5526;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5532 = this.anInt5519 * arg3 / (this.aBoolean821 ? 1024 : this.anInt5526);
		} else {
			this.anInt5532 = 0;
		}
		if (this.anInt5532 < 8) {
			this.aClass100_48 = null;
			return false;
		}
		@Pc(143) int local143 = Class134_Sub2.method10212(this.anInt5532, (byte) 28);
		if (local143 > arg3) {
			local143 = Class278.method26458(arg3, 423254006);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5527) {
			this.anInt5527 = local143;
		}
		this.anInt5529 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5525 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass100_48 = null;
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "(Lclient!dh;Lclient!sw;)Z")
	boolean method31396(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5518 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5537, -1, Class609.aClass609_2, 0.7F, this.anInt5527, this.anInt5527, false, -1630596103)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5537, 0.7F, this.anInt5527, this.anInt5527, false, (byte) -55);
					this.aClass100_48 = arg0.method20510(local33, 0, this.anInt5527, this.anInt5527, this.anInt5527, 438797212);
				}
			} else if (this.anInt5518 == 2) {
				this.method31380(arg0, arg1);
			} else if (this.anInt5518 == 1) {
				this.method31382(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}
}
