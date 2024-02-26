package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aex")
public abstract class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!aex", name = "s", descriptor = "I")
	static int anInt2553;

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "I")
	static int anInt2560;

	@OriginalMember(owner = "client!aex", name = "j", descriptor = "I")
	static final int anInt2561 = 8;

	@OriginalMember(owner = "client!aex", name = "a", descriptor = "I")
	static final int anInt2562 = 12;

	@OriginalMember(owner = "client!aex", name = "k", descriptor = "I")
	static int anInt2563;

	@OriginalMember(owner = "client!aex", name = "x", descriptor = "I")
	static int anInt2564;

	@OriginalMember(owner = "client!aex", name = "w", descriptor = "I")
	static int anInt2565;

	@OriginalMember(owner = "client!aex", name = "r", descriptor = "I")
	static int anInt2566;

	@OriginalMember(owner = "client!aex", name = "q", descriptor = "I")
	static int anInt2567;

	@OriginalMember(owner = "client!aex", name = "h", descriptor = "I")
	static int anInt2568;

	@OriginalMember(owner = "client!aex", name = "z", descriptor = "I")
	static int anInt2570;

	@OriginalMember(owner = "client!aex", name = "v", descriptor = "I")
	static int anInt2572;

	@OriginalMember(owner = "client!aex", name = "y", descriptor = "I")
	static int anInt2573;

	@OriginalMember(owner = "client!aex", name = "n", descriptor = "I")
	static int anInt2574;

	@OriginalMember(owner = "client!aex", name = "c", descriptor = "I")
	static int anInt2575;

	@OriginalMember(owner = "client!aex", name = "d", descriptor = "I")
	static int anInt2576;

	@OriginalMember(owner = "client!aex", name = "ax", descriptor = "I")
	static int anInt2577;

	@OriginalMember(owner = "client!aex", name = "b", descriptor = "I")
	static int anInt2579;

	@OriginalMember(owner = "client!aex", name = "ay", descriptor = "I")
	static int anInt2582;

	@OriginalMember(owner = "client!aex", name = "o", descriptor = "I")
	static final int anInt2585 = 4;

	@OriginalMember(owner = "client!aex", name = "ai", descriptor = "I")
	static int anInt2578 = 0;

	@OriginalMember(owner = "client!aex", name = "aq", descriptor = "I")
	static int anInt2581 = 0;

	@OriginalMember(owner = "client!aex", name = "ao", descriptor = "I")
	static int anInt2558 = 0;

	@OriginalMember(owner = "client!aex", name = "aj", descriptor = "I")
	static int anInt2569 = 0;

	@OriginalMember(owner = "client!aex", name = "ac", descriptor = "I")
	static int anInt2583 = 0;

	@OriginalMember(owner = "client!aex", name = "ag", descriptor = "I")
	static int anInt2584 = 0;

	@OriginalMember(owner = "client!aex", name = "ab", descriptor = "I")
	static int anInt2580 = 0;

	@OriginalMember(owner = "client!aex", name = "al", descriptor = "I")
	static int anInt2586 = 0;

	@OriginalMember(owner = "client!aex", name = "u", descriptor = "I")
	int anInt2555;

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "I")
	int anInt2556;

	@OriginalMember(owner = "client!aex", name = "g", descriptor = "I")
	int anInt2557;

	@OriginalMember(owner = "client!aex", name = "m", descriptor = "[I")
	int[] anIntArray218;

	@OriginalMember(owner = "client!aex", name = "i", descriptor = "I")
	int anInt2571;

	@OriginalMember(owner = "client!aex", name = "t", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_10;

	@OriginalMember(owner = "client!aex", name = "f", descriptor = "I")
	int anInt2554;

	@OriginalMember(owner = "client!aex", name = "e", descriptor = "I")
	int anInt2559;

	@OriginalMember(owner = "client!aex", name = "<init>", descriptor = "(Lclient!aff;II)V")
	Class99_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass102_Sub2_10 = arg0;
		this.anInt2554 = arg1;
		this.anInt2559 = arg2;
	}

	@OriginalMember(owner = "client!aex", name = "cg", descriptor = "(FFFFFF)Z")
	final boolean method18295(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "t", descriptor = "(IIII)V")
	@Override
	public final void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2555 = arg0;
		this.anInt2556 = arg1;
		this.anInt2557 = arg2;
		this.anInt2571 = arg3;
	}

	@OriginalMember(owner = "client!aex", name = "f", descriptor = "([I)V")
	@Override
	public final void method18217(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2557;
		arg0[3] = this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "e", descriptor = "()I")
	@Override
	public final int method18218() {
		return this.anInt2554;
	}

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "()I")
	@Override
	public final int method18219() {
		return this.anInt2559;
	}

	@OriginalMember(owner = "client!aex", name = "g", descriptor = "()I")
	@Override
	public final int method18288() {
		return this.anInt2556 + this.anInt2559 + this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "bg", descriptor = "()I")
	@Override
	public final int method18265() {
		return this.anInt2559;
	}

	@OriginalMember(owner = "client!aex", name = "cr", descriptor = "([I[III)V")
	abstract void method18296(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aex", name = "x", descriptor = "(IILclient!cg;II)V")
	public abstract void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "cy", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18297(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!aex", name = "d", descriptor = "(IIIIIII)V")
	@Override
	public final void method18232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray218 == null) {
			this.anIntArray218 = new int[4];
		}
		this.aClass102_Sub2_10.method20713(this.anIntArray218);
		this.aClass102_Sub2_10.method20972(this.aClass102_Sub2_10.anInt637 * 531468375, this.aClass102_Sub2_10.anInt645 * -1878420243, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18214();
		@Pc(44) int local44 = this.method18288();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18226(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass102_Sub2_10.method20986(this.anIntArray218[0], this.anIntArray218[1], this.anIntArray218[2], this.anIntArray218[3]);
	}

	@OriginalMember(owner = "client!aex", name = "ch", descriptor = "(FFFFFF)Z")
	final boolean method18298(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "ay", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18259(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (this.method18298(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2582 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2581 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2558 = arg7 >> 16 & 0xFF;
					anInt2569 = arg7 >> 8 & 0xFF;
					anInt2583 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2584 = arg7 >>> 24;
					anInt2580 = 256 - anInt2584;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2580 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2580 & 0xFF0000;
					anInt2586 = (local68 | local76) >>> 8;
				}
			}
			this.method18301(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aex", name = "by", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (this.method18298(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2582 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2581 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2558 = arg7 >> 16 & 0xFF;
					anInt2569 = arg7 >> 8 & 0xFF;
					anInt2583 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2584 = arg7 >>> 24;
					anInt2580 = 256 - anInt2584;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2580 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2580 & 0xFF0000;
					anInt2586 = (local68 | local76) >>> 8;
				}
			}
			this.method18301(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aex", name = "bt", descriptor = "(IIIIIII)V")
	@Override
	public final void method18270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray218 == null) {
			this.anIntArray218 = new int[4];
		}
		this.aClass102_Sub2_10.method20713(this.anIntArray218);
		this.aClass102_Sub2_10.method20972(this.aClass102_Sub2_10.anInt637 * 531468375, this.aClass102_Sub2_10.anInt645 * -1878420243, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18214();
		@Pc(44) int local44 = this.method18288();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18226(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass102_Sub2_10.method20986(this.anIntArray218[0], this.anIntArray218[1], this.anIntArray218[2], this.anIntArray218[3]);
	}

	@OriginalMember(owner = "client!aex", name = "cm", descriptor = "(FFFFFF)Z")
	final boolean method18299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "av", descriptor = "(IIIIIIII)V")
	abstract void method18245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aex", name = "am", descriptor = "(IIIII)V")
	public abstract void method18251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "bl", descriptor = "()I")
	@Override
	public final int method18266() {
		return this.anInt2559;
	}

	@OriginalMember(owner = "client!aex", name = "at", descriptor = "(IIIII)V")
	public abstract void method18278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "ad", descriptor = "(IILclient!cg;II)V")
	public abstract void method18253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "k", descriptor = "(IIIII)V")
	public abstract void method18226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "m", descriptor = "(IIII[III)V")
	public abstract void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aex", name = "aa", descriptor = "(IIIIIIII)V")
	abstract void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aex", name = "ce", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!aex", name = "cc", descriptor = "(II)V")
	abstract void method18301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aex", name = "bn", descriptor = "()I")
	@Override
	public final int method18268() {
		return this.anInt2556 + this.anInt2559 + this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "ck", descriptor = "(II)V")
	abstract void method18302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aex", name = "ca", descriptor = "([I[III)V")
	abstract void method18303(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aex", name = "br", descriptor = "()I")
	@Override
	public final int method18213() {
		return this.anInt2555 + this.anInt2554 + this.anInt2557;
	}

	@OriginalMember(owner = "client!aex", name = "ae", descriptor = "(IIII[III)V")
	public abstract void method18285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aex", name = "ap", descriptor = "(IIII)V")
	@Override
	public final void method18258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2555 = arg0;
		this.anInt2556 = arg1;
		this.anInt2557 = arg2;
		this.anInt2571 = arg3;
	}

	@OriginalMember(owner = "client!aex", name = "ar", descriptor = "([I)V")
	@Override
	public final void method18260(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2557;
		arg0[3] = this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "au", descriptor = "([I)V")
	@Override
	public final void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2557;
		arg0[3] = this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "az", descriptor = "([I)V")
	@Override
	public final void method18262(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2557;
		arg0[3] = this.anInt2571;
	}

	@OriginalMember(owner = "client!aex", name = "as", descriptor = "()I")
	@Override
	public final int method18263() {
		return this.anInt2554;
	}

	@OriginalMember(owner = "client!aex", name = "aw", descriptor = "()I")
	@Override
	public final int method18236() {
		return this.anInt2559;
	}

	@OriginalMember(owner = "client!aex", name = "cj", descriptor = "(II)V")
	abstract void method18304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aex", name = "cs", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18305(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!aex", name = "an", descriptor = "(IIIIIIII)V")
	abstract void method18256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aex", name = "q", descriptor = "(IIIIIIII)V")
	abstract void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aex", name = "ci", descriptor = "(FFFFFF)Z")
	final boolean method18306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "u", descriptor = "()I")
	@Override
	public final int method18214() {
		return this.anInt2555 + this.anInt2554 + this.anInt2557;
	}

	@OriginalMember(owner = "client!aex", name = "cp", descriptor = "(FFFFFF)Z")
	final boolean method18307(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "ak", descriptor = "(IIIII)V")
	public abstract void method18240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aex", name = "cb", descriptor = "(FFFFFF)Z")
	final boolean method18308(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2554 || local17 != this.anInt2559) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2557;
			@Pc(91) float local91 = -local39 * (float) this.anInt2557;
			@Pc(98) float local98 = -local46 * (float) this.anInt2571;
			@Pc(105) float local105 = -local53 * (float) this.anInt2571;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass102_Sub2_10.anInt637 * 531468375)) {
			local46 = this.aClass102_Sub2_10.anInt637 * 531468375;
		}
		if (local53 > (float) (this.aClass102_Sub2_10.anInt634 * 469139509)) {
			local53 = this.aClass102_Sub2_10.anInt634 * 469139509;
		}
		if (local59 < (float) (this.aClass102_Sub2_10.anInt645 * -1878420243)) {
			local59 = this.aClass102_Sub2_10.anInt645 * -1878420243;
		}
		if (local65 > (float) (this.aClass102_Sub2_10.anInt639 * 725126603)) {
			local65 = this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass102_Sub2_10.anInt638 * 513500097;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2568 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2554 / local71);
		anInt2576 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2559 / local77);
		anInt2570 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2554 / local77);
		anInt2560 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2559 / local71);
		anInt2572 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2573 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2574 = (this.anInt2554 >> 1 << 12) + (anInt2573 * anInt2570 >> 4);
		anInt2575 = (this.anInt2559 >> 1 << 12) + (anInt2573 * anInt2560 >> 4);
		anInt2579 = anInt2572 * anInt2568 >> 4;
		anInt2577 = anInt2572 * anInt2576 >> 4;
		anInt2553 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aex", name = "ba", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	final void method18269(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (this.method18298(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class98_Sub2 local20 = (Class98_Sub2) arg7;
			this.method18309(local20.anIntArray40, local20.anIntArray39, anInt2553 - arg8, -arg9 - (anInt2565 - anInt2564));
		}
	}

	@OriginalMember(owner = "client!aex", name = "bk", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18274(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (this.method18298(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2582 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2581 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2558 = arg7 >> 16 & 0xFF;
					anInt2569 = arg7 >> 8 & 0xFF;
					anInt2583 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2584 = arg7 >>> 24;
					anInt2580 = 256 - anInt2584;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2580 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2580 & 0xFF0000;
					anInt2586 = (local68 | local76) >>> 8;
				}
			}
			this.method18301(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aex", name = "bs", descriptor = "(IIIIIII)V")
	@Override
	public final void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray218 == null) {
			this.anIntArray218 = new int[4];
		}
		this.aClass102_Sub2_10.method20713(this.anIntArray218);
		this.aClass102_Sub2_10.method20972(this.aClass102_Sub2_10.anInt637 * 531468375, this.aClass102_Sub2_10.anInt645 * -1878420243, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18214();
		@Pc(44) int local44 = this.method18288();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18226(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass102_Sub2_10.method20986(this.anIntArray218[0], this.anIntArray218[1], this.anIntArray218[2], this.anIntArray218[3]);
	}

	@OriginalMember(owner = "client!aex", name = "bj", descriptor = "(IIIIIII)V")
	@Override
	public final void method18272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray218 == null) {
			this.anIntArray218 = new int[4];
		}
		this.aClass102_Sub2_10.method20713(this.anIntArray218);
		this.aClass102_Sub2_10.method20972(this.aClass102_Sub2_10.anInt637 * 531468375, this.aClass102_Sub2_10.anInt645 * -1878420243, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18214();
		@Pc(44) int local44 = this.method18288();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18226(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass102_Sub2_10.method20986(this.anIntArray218[0], this.anIntArray218[1], this.anIntArray218[2], this.anIntArray218[3]);
	}

	@OriginalMember(owner = "client!aex", name = "cu", descriptor = "([I[III)V")
	abstract void method18309(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aex", name = "aq", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	final void method18279(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (this.method18298(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class98_Sub2 local20 = (Class98_Sub2) arg7;
			this.method18309(local20.anIntArray40, local20.anIntArray39, anInt2553 - arg8, -arg9 - (anInt2565 - anInt2564));
		}
	}
}
