package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public abstract class Class137 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	static final int anInt2914 = 4096;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	static final int anInt2915 = 4095;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	static final int anInt2918 = 12;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
	public static final int[] anIntArray260 = new int[4096];

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "[S")
	short[] aShortArray58;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[S")
	short[] aShortArray59 = new short[512];

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	int anInt2916 = 0;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	int anInt2913 = 4;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	int anInt2917 = 4;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	int anInt2919 = 4;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	int anInt2920 = 4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray260[local4] = method20594(local4);
		}
	}

	@OriginalMember(owner = "client!ok", name = "ay", descriptor = "(I)I")
	static int method20593(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)I")
	static int method20594(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!ok", name = "ax", descriptor = "(I)I")
	static int method20600(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "(IIII)I")
	static int method20614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "(IIII)I")
	static int method20615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "(IIII)I")
	static int method20616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(IIII)I")
	static int method20620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIII)V")
	Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2916 = arg0;
		this.anInt2913 = arg2;
		this.anInt2917 = arg3;
		this.anInt2919 = arg4;
		this.anInt2920 = arg1;
		this.method20598();
		this.method20599();
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "()V")
	abstract void method20595();

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "()V")
	abstract void method20596();

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "(II)V")
	abstract void method20597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "()V")
	final void method20598() {
		this.aShortArray58 = new short[this.anInt2920];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2920; local6++) {
			this.aShortArray58[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "()V")
	final void method20599() {
		@Pc(6) Random local6 = new Random((long) this.anInt2916);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray59[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class169.method21690(local6, local28, -787895169);
			@Pc(38) short local38 = this.aShortArray59[local33];
			this.aShortArray59[local33] = this.aShortArray59[local28];
			this.aShortArray59[local28] = this.aShortArray59[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
	final void method20601() {
		@Pc(6) Random local6 = new Random((long) this.anInt2916);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray59[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class169.method21690(local6, local28, -787895169);
			@Pc(38) short local38 = this.aShortArray59[local33];
			this.aShortArray59[local33] = this.aShortArray59[local28];
			this.aShortArray59[local28] = this.aShortArray59[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(II)V")
	abstract void method20602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "()V")
	abstract void method20603();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
	abstract void method20604();

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "()V")
	abstract void method20605();

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "()V")
	abstract void method20606();

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "(II)V")
	abstract void method20607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "(III)V")
	final void method20608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method20595();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2920; local72++) {
						local10 = this.aShortArray58[local72] << 12;
						@Pc(90) int local90 = this.anInt2913 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2917 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2919 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2913;
						@Pc(138) int local138 = local120 * this.anInt2917;
						@Pc(143) int local143 = local128 * this.anInt2919;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray260[local112];
						@Pc(229) int local229 = anIntArray260[local120];
						@Pc(233) int local233 = anIntArray260[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray59[local179];
						@Pc(255) short local255 = this.aShortArray59[local175];
						@Pc(262) short local262 = this.aShortArray59[local167 + local250];
						@Pc(269) short local269 = this.aShortArray59[local163 + local250];
						@Pc(276) short local276 = this.aShortArray59[local167 + local255];
						@Pc(283) short local283 = this.aShortArray59[local163 + local255];
						@Pc(294) int local294 = method20620(this.aShortArray59[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method20620(this.aShortArray59[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method20620(this.aShortArray59[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method20620(this.aShortArray59[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method20620(this.aShortArray59[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method20620(this.aShortArray59[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method20620(this.aShortArray59[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method20620(this.aShortArray59[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method20597(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method20596();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "(II)V")
	abstract void method20609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "()V")
	final void method20610() {
		this.aShortArray58 = new short[this.anInt2920];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2920; local6++) {
			this.aShortArray58[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "(II)V")
	abstract void method20611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "()V")
	final void method20612() {
		this.aShortArray58 = new short[this.anInt2920];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2920; local6++) {
			this.aShortArray58[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "()V")
	final void method20613() {
		this.aShortArray58 = new short[this.anInt2920];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2920; local6++) {
			this.aShortArray58[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "(II)V")
	abstract void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()V")
	final void method20618() {
		@Pc(6) Random local6 = new Random((long) this.anInt2916);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray59[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class169.method21690(local6, local28, -787895169);
			@Pc(38) short local38 = this.aShortArray59[local33];
			this.aShortArray59[local33] = this.aShortArray59[local28];
			this.aShortArray59[local28] = this.aShortArray59[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "(III)V")
	final void method20619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method20595();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2920; local72++) {
						local10 = this.aShortArray58[local72] << 12;
						@Pc(90) int local90 = this.anInt2913 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2917 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2919 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2913;
						@Pc(138) int local138 = local120 * this.anInt2917;
						@Pc(143) int local143 = local128 * this.anInt2919;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray260[local112];
						@Pc(229) int local229 = anIntArray260[local120];
						@Pc(233) int local233 = anIntArray260[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray59[local179];
						@Pc(255) short local255 = this.aShortArray59[local175];
						@Pc(262) short local262 = this.aShortArray59[local167 + local250];
						@Pc(269) short local269 = this.aShortArray59[local163 + local250];
						@Pc(276) short local276 = this.aShortArray59[local167 + local255];
						@Pc(283) short local283 = this.aShortArray59[local163 + local255];
						@Pc(294) int local294 = method20620(this.aShortArray59[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method20620(this.aShortArray59[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method20620(this.aShortArray59[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method20620(this.aShortArray59[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method20620(this.aShortArray59[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method20620(this.aShortArray59[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method20620(this.aShortArray59[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method20620(this.aShortArray59[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method20597(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method20596();
				}
			}
		}
	}
}
