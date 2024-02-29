package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ael")
public abstract class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!ael", name = "q", descriptor = "I")
	static int anInt2554;

	@OriginalMember(owner = "client!ael", name = "ag", descriptor = "I")
	static int anInt2558;

	@OriginalMember(owner = "client!ael", name = "z", descriptor = "I")
	static final int anInt2559 = 4;

	@OriginalMember(owner = "client!ael", name = "p", descriptor = "I")
	static final int anInt2560 = 8;

	@OriginalMember(owner = "client!ael", name = "d", descriptor = "I")
	static final int anInt2561 = 12;

	@OriginalMember(owner = "client!ael", name = "r", descriptor = "I")
	static int anInt2563;

	@OriginalMember(owner = "client!ael", name = "v", descriptor = "I")
	static int anInt2564;

	@OriginalMember(owner = "client!ael", name = "o", descriptor = "I")
	static int anInt2565;

	@OriginalMember(owner = "client!ael", name = "s", descriptor = "I")
	static int anInt2566;

	@OriginalMember(owner = "client!ael", name = "y", descriptor = "I")
	static int anInt2567;

	@OriginalMember(owner = "client!ael", name = "b", descriptor = "I")
	static int anInt2569;

	@OriginalMember(owner = "client!ael", name = "x", descriptor = "I")
	static int anInt2570;

	@OriginalMember(owner = "client!ael", name = "a", descriptor = "I")
	static int anInt2571;

	@OriginalMember(owner = "client!ael", name = "g", descriptor = "I")
	static int anInt2572;

	@OriginalMember(owner = "client!ael", name = "i", descriptor = "I")
	static int anInt2573;

	@OriginalMember(owner = "client!ael", name = "t", descriptor = "I")
	static int anInt2575;

	@OriginalMember(owner = "client!ael", name = "ae", descriptor = "I")
	static int anInt2576;

	@OriginalMember(owner = "client!ael", name = "h", descriptor = "I")
	static int anInt2579;

	@OriginalMember(owner = "client!ael", name = "c", descriptor = "I")
	static int anInt2580;

	@OriginalMember(owner = "client!ael", name = "j", descriptor = "I")
	static int anInt2584;

	@OriginalMember(owner = "client!ael", name = "ah", descriptor = "I")
	static int anInt2578 = 0;

	@OriginalMember(owner = "client!ael", name = "al", descriptor = "I")
	static int anInt2562 = 0;

	@OriginalMember(owner = "client!ael", name = "ac", descriptor = "I")
	static int anInt2577 = 0;

	@OriginalMember(owner = "client!ael", name = "ai", descriptor = "I")
	static int anInt2581 = 0;

	@OriginalMember(owner = "client!ael", name = "aw", descriptor = "I")
	static int anInt2582 = 0;

	@OriginalMember(owner = "client!ael", name = "as", descriptor = "I")
	static int anInt2583 = 0;

	@OriginalMember(owner = "client!ael", name = "at", descriptor = "I")
	static int anInt2585 = 0;

	@OriginalMember(owner = "client!ael", name = "ad", descriptor = "I")
	static int anInt2574 = 0;

	@OriginalMember(owner = "client!ael", name = "w", descriptor = "I")
	int anInt2552;

	@OriginalMember(owner = "client!ael", name = "k", descriptor = "I")
	int anInt2555;

	@OriginalMember(owner = "client!ael", name = "f", descriptor = "I")
	int anInt2556;

	@OriginalMember(owner = "client!ael", name = "l", descriptor = "I")
	int anInt2557;

	@OriginalMember(owner = "client!ael", name = "u", descriptor = "[I")
	int[] anIntArray211;

	@OriginalMember(owner = "client!ael", name = "e", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_12;

	@OriginalMember(owner = "client!ael", name = "n", descriptor = "I")
	int anInt2553;

	@OriginalMember(owner = "client!ael", name = "m", descriptor = "I")
	int anInt2568;

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!afg;II)V")
	Class100_Sub3(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub3_12 = arg0;
		this.anInt2553 = arg1;
		this.anInt2568 = arg2;
	}

	@OriginalMember(owner = "client!ael", name = "ax", descriptor = "(IIIII)V")
	public abstract void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "ce", descriptor = "(II)V")
	abstract void method18249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ael", name = "ak", descriptor = "([I)V")
	@Override
	public final void method18222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2552;
		arg0[3] = this.anInt2557;
	}

	@OriginalMember(owner = "client!ael", name = "m", descriptor = "()I")
	@Override
	public final int method18201() {
		return this.anInt2553;
	}

	@OriginalMember(owner = "client!ael", name = "f", descriptor = "()I")
	@Override
	public final int method18177() {
		return this.anInt2568;
	}

	@OriginalMember(owner = "client!ael", name = "k", descriptor = "()I")
	@Override
	public final int method18172() {
		return this.anInt2555 + this.anInt2553 + this.anInt2552;
	}

	@OriginalMember(owner = "client!ael", name = "w", descriptor = "()I")
	@Override
	public final int method18178() {
		return this.anInt2556 + this.anInt2568 + this.anInt2557;
	}

	@OriginalMember(owner = "client!ael", name = "n", descriptor = "([I)V")
	@Override
	public final void method18175(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2552;
		arg0[3] = this.anInt2557;
	}

	@OriginalMember(owner = "client!ael", name = "cr", descriptor = "(FFFFFF)Z")
	final boolean method18250(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2553 + this.anInt2552;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2568 + this.anInt2557;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2553 || local17 != this.anInt2568) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2552;
			@Pc(91) float local91 = -local39 * (float) this.anInt2552;
			@Pc(98) float local98 = -local46 * (float) this.anInt2557;
			@Pc(105) float local105 = -local53 * (float) this.anInt2557;
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
		if (local46 < (float) (this.aClass104_Sub3_12.anInt734 * -491763783)) {
			local46 = this.aClass104_Sub3_12.anInt734 * -491763783;
		}
		if (local53 > (float) (this.aClass104_Sub3_12.anInt732 * -1762676505)) {
			local53 = this.aClass104_Sub3_12.anInt732 * -1762676505;
		}
		if (local59 < (float) (this.aClass104_Sub3_12.anInt723 * 1059403033)) {
			local59 = this.aClass104_Sub3_12.anInt723 * 1059403033;
		}
		if (local65 > (float) (this.aClass104_Sub3_12.anInt724 * 1200487767)) {
			local65 = this.aClass104_Sub3_12.anInt724 * 1200487767;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass104_Sub3_12.anInt719 * 1808307287;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2554 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2553 / local71);
		anInt2570 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2568 / local77);
		anInt2569 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2553 / local77);
		anInt2579 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2568 / local71);
		anInt2571 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2572 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2573 = (this.anInt2553 >> 1 << 12) + (anInt2572 * anInt2569 >> 4);
		anInt2584 = (this.anInt2568 >> 1 << 12) + (anInt2572 * anInt2579 >> 4);
		anInt2575 = anInt2571 * anInt2554 >> 4;
		anInt2576 = anInt2571 * anInt2570 >> 4;
		anInt2580 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "v", descriptor = "(IILclient!ch;II)V")
	public abstract void method18186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "y", descriptor = "(IIIIIIII)V")
	abstract void method18189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ael", name = "bk", descriptor = "()I")
	@Override
	public final int method18226() {
		return this.anInt2568;
	}

	@OriginalMember(owner = "client!ael", name = "x", descriptor = "(IIIIIII)V")
	@Override
	public final void method18191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray211 == null) {
			this.anIntArray211 = new int[4];
		}
		this.aClass104_Sub3_12.method20482(this.anIntArray211);
		this.aClass104_Sub3_12.method20472(this.aClass104_Sub3_12.anInt734 * -491763783, this.aClass104_Sub3_12.anInt723 * 1059403033, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18172();
		@Pc(44) int local44 = this.method18178();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18185(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass104_Sub3_12.method20479(this.anIntArray211[0], this.anIntArray211[1], this.anIntArray211[2], this.anIntArray211[3]);
	}

	@OriginalMember(owner = "client!ael", name = "ag", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2558 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2562 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2577 = arg7 >> 16 & 0xFF;
					anInt2581 = arg7 >> 8 & 0xFF;
					anInt2582 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2583 = arg7 >>> 24;
					anInt2585 = 256 - anInt2583;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2585 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2585 & 0xFF0000;
					anInt2574 = (local68 | local76) >>> 8;
				}
			}
			this.method18249(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!ael", name = "al", descriptor = "(FFFFFFILclient!ch;II)V")
	@Override
	final void method18196(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class96_Sub3 local20 = (Class96_Sub3) arg7;
			this.method18251(local20.anIntArray29, local20.anIntArray30, anInt2580 - arg8, -arg9 - (anInt2565 - anInt2564));
		}
	}

	@OriginalMember(owner = "client!ael", name = "u", descriptor = "(IIII[III)V")
	public abstract void method18211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ael", name = "cu", descriptor = "([I[III)V")
	abstract void method18251(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ael", name = "cx", descriptor = "(II)V")
	abstract void method18252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ael", name = "ac", descriptor = "(IIII[III)V")
	public abstract void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ael", name = "aq", descriptor = "(IIIII)V")
	public abstract void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "e", descriptor = "(IIII)V")
	@Override
	public final void method18174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2555 = arg0;
		this.anInt2556 = arg1;
		this.anInt2552 = arg2;
		this.anInt2557 = arg3;
	}

	@OriginalMember(owner = "client!ael", name = "cl", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18253(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!ael", name = "az", descriptor = "(IIII)V")
	@Override
	public final void method18220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2555 = arg0;
		this.anInt2556 = arg1;
		this.anInt2552 = arg2;
		this.anInt2557 = arg3;
	}

	@OriginalMember(owner = "client!ael", name = "aj", descriptor = "(IIIIIIII)V")
	abstract void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ael", name = "ay", descriptor = "(IIIIIIII)V")
	abstract void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ael", name = "av", descriptor = "(IILclient!ch;II)V")
	public abstract void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "ci", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18254(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!ael", name = "bi", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18234(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2558 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2562 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2577 = arg7 >> 16 & 0xFF;
					anInt2581 = arg7 >> 8 & 0xFF;
					anInt2582 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2583 = arg7 >>> 24;
					anInt2585 = 256 - anInt2583;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2585 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2585 & 0xFF0000;
					anInt2574 = (local68 | local76) >>> 8;
				}
			}
			this.method18249(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!ael", name = "cv", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18255(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!ael", name = "ab", descriptor = "(IIIIIIII)V")
	abstract void method18218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ael", name = "ca", descriptor = "(II)V")
	abstract void method18256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ael", name = "bh", descriptor = "()I")
	@Override
	public final int method18171() {
		return this.anInt2555 + this.anInt2553 + this.anInt2552;
	}

	@OriginalMember(owner = "client!ael", name = "cw", descriptor = "(II)V")
	abstract void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ael", name = "cp", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18258(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!ael", name = "cf", descriptor = "([I[III)V")
	abstract void method18259(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ael", name = "r", descriptor = "(IIIII)V")
	public abstract void method18185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "aa", descriptor = "(IIII)V")
	@Override
	public final void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2555 = arg0;
		this.anInt2556 = arg1;
		this.anInt2552 = arg2;
		this.anInt2557 = arg3;
	}

	@OriginalMember(owner = "client!ael", name = "bl", descriptor = "()I")
	@Override
	public final int method18225() {
		return this.anInt2568;
	}

	@OriginalMember(owner = "client!ael", name = "an", descriptor = "()I")
	@Override
	public final int method18203() {
		return this.anInt2553;
	}

	@OriginalMember(owner = "client!ael", name = "bf", descriptor = "()I")
	@Override
	public final int method18224() {
		return this.anInt2553;
	}

	@OriginalMember(owner = "client!ael", name = "ct", descriptor = "(II)V")
	abstract void method18260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ael", name = "bx", descriptor = "()I")
	@Override
	public final int method18228() {
		return this.anInt2556 + this.anInt2568 + this.anInt2557;
	}

	@OriginalMember(owner = "client!ael", name = "ao", descriptor = "(IILclient!ch;II)V")
	public abstract void method18237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ael", name = "cg", descriptor = "(FFFFFF)Z")
	final boolean method18261(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2553 + this.anInt2552;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2568 + this.anInt2557;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2553 || local17 != this.anInt2568) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2552;
			@Pc(91) float local91 = -local39 * (float) this.anInt2552;
			@Pc(98) float local98 = -local46 * (float) this.anInt2557;
			@Pc(105) float local105 = -local53 * (float) this.anInt2557;
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
		if (local46 < (float) (this.aClass104_Sub3_12.anInt734 * -491763783)) {
			local46 = this.aClass104_Sub3_12.anInt734 * -491763783;
		}
		if (local53 > (float) (this.aClass104_Sub3_12.anInt732 * -1762676505)) {
			local53 = this.aClass104_Sub3_12.anInt732 * -1762676505;
		}
		if (local59 < (float) (this.aClass104_Sub3_12.anInt723 * 1059403033)) {
			local59 = this.aClass104_Sub3_12.anInt723 * 1059403033;
		}
		if (local65 > (float) (this.aClass104_Sub3_12.anInt724 * 1200487767)) {
			local65 = this.aClass104_Sub3_12.anInt724 * 1200487767;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass104_Sub3_12.anInt719 * 1808307287;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2554 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2553 / local71);
		anInt2570 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2568 / local77);
		anInt2569 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2553 / local77);
		anInt2579 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2568 / local71);
		anInt2571 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2572 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2573 = (this.anInt2553 >> 1 << 12) + (anInt2572 * anInt2569 >> 4);
		anInt2584 = (this.anInt2568 >> 1 << 12) + (anInt2572 * anInt2579 >> 4);
		anInt2575 = anInt2571 * anInt2554 >> 4;
		anInt2576 = anInt2571 * anInt2570 >> 4;
		anInt2580 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "cn", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18262(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!ael", name = "bc", descriptor = "(IIIIIII)V")
	@Override
	public final void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray211 == null) {
			this.anIntArray211 = new int[4];
		}
		this.aClass104_Sub3_12.method20482(this.anIntArray211);
		this.aClass104_Sub3_12.method20472(this.aClass104_Sub3_12.anInt734 * -491763783, this.aClass104_Sub3_12.anInt723 * 1059403033, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18172();
		@Pc(44) int local44 = this.method18178();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18185(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass104_Sub3_12.method20479(this.anIntArray211[0], this.anIntArray211[1], this.anIntArray211[2], this.anIntArray211[3]);
	}

	@OriginalMember(owner = "client!ael", name = "co", descriptor = "(FFFFFF)Z")
	final boolean method18263(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2553 + this.anInt2552;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2568 + this.anInt2557;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2553 || local17 != this.anInt2568) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2552;
			@Pc(91) float local91 = -local39 * (float) this.anInt2552;
			@Pc(98) float local98 = -local46 * (float) this.anInt2557;
			@Pc(105) float local105 = -local53 * (float) this.anInt2557;
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
		if (local46 < (float) (this.aClass104_Sub3_12.anInt734 * -491763783)) {
			local46 = this.aClass104_Sub3_12.anInt734 * -491763783;
		}
		if (local53 > (float) (this.aClass104_Sub3_12.anInt732 * -1762676505)) {
			local53 = this.aClass104_Sub3_12.anInt732 * -1762676505;
		}
		if (local59 < (float) (this.aClass104_Sub3_12.anInt723 * 1059403033)) {
			local59 = this.aClass104_Sub3_12.anInt723 * 1059403033;
		}
		if (local65 > (float) (this.aClass104_Sub3_12.anInt724 * 1200487767)) {
			local65 = this.aClass104_Sub3_12.anInt724 * 1200487767;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass104_Sub3_12.anInt719 * 1808307287;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2554 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2553 / local71);
		anInt2570 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2568 / local77);
		anInt2569 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2553 / local77);
		anInt2579 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2568 / local71);
		anInt2571 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2572 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2573 = (this.anInt2553 >> 1 << 12) + (anInt2572 * anInt2569 >> 4);
		anInt2584 = (this.anInt2568 >> 1 << 12) + (anInt2572 * anInt2579 >> 4);
		anInt2575 = anInt2571 * anInt2554 >> 4;
		anInt2576 = anInt2571 * anInt2570 >> 4;
		anInt2580 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "af", descriptor = "([I)V")
	@Override
	public final void method18221(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2555;
		arg0[1] = this.anInt2556;
		arg0[2] = this.anInt2552;
		arg0[3] = this.anInt2557;
	}

	@OriginalMember(owner = "client!ael", name = "cm", descriptor = "(FFFFFF)Z")
	final boolean method18264(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2555 + this.anInt2553 + this.anInt2552;
		@Pc(17) int local17 = this.anInt2556 + this.anInt2568 + this.anInt2557;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2553 || local17 != this.anInt2568) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2556;
			local65 = local53 * (float) this.anInt2556;
			local71 = local32 * (float) this.anInt2555;
			local77 = local39 * (float) this.anInt2555;
			@Pc(84) float local84 = -local32 * (float) this.anInt2552;
			@Pc(91) float local91 = -local39 * (float) this.anInt2552;
			@Pc(98) float local98 = -local46 * (float) this.anInt2557;
			@Pc(105) float local105 = -local53 * (float) this.anInt2557;
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
		if (local46 < (float) (this.aClass104_Sub3_12.anInt734 * -491763783)) {
			local46 = this.aClass104_Sub3_12.anInt734 * -491763783;
		}
		if (local53 > (float) (this.aClass104_Sub3_12.anInt732 * -1762676505)) {
			local53 = this.aClass104_Sub3_12.anInt732 * -1762676505;
		}
		if (local59 < (float) (this.aClass104_Sub3_12.anInt723 * 1059403033)) {
			local59 = this.aClass104_Sub3_12.anInt723 * 1059403033;
		}
		if (local65 > (float) (this.aClass104_Sub3_12.anInt724 * 1200487767)) {
			local65 = this.aClass104_Sub3_12.anInt724 * 1200487767;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2566 = this.aClass104_Sub3_12.anInt719 * 1808307287;
		anInt2567 = (int) ((float) ((int) local59 * anInt2566) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2554 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2553 / local71);
		anInt2570 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2568 / local77);
		anInt2569 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2553 / local77);
		anInt2579 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2568 / local71);
		anInt2571 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2572 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2573 = (this.anInt2553 >> 1 << 12) + (anInt2572 * anInt2569 >> 4);
		anInt2584 = (this.anInt2568 >> 1 << 12) + (anInt2572 * anInt2579 >> 4);
		anInt2575 = anInt2571 * anInt2554 >> 4;
		anInt2576 = anInt2571 * anInt2570 >> 4;
		anInt2580 = (int) local46;
		anInt2563 = (int) local53;
		anInt2564 = (int) local59;
		anInt2565 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "bd", descriptor = "(IIIIIII)V")
	@Override
	public final void method18229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray211 == null) {
			this.anIntArray211 = new int[4];
		}
		this.aClass104_Sub3_12.method20482(this.anIntArray211);
		this.aClass104_Sub3_12.method20472(this.aClass104_Sub3_12.anInt734 * -491763783, this.aClass104_Sub3_12.anInt723 * 1059403033, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18172();
		@Pc(44) int local44 = this.method18178();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18185(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass104_Sub3_12.method20479(this.anIntArray211[0], this.anIntArray211[1], this.anIntArray211[2], this.anIntArray211[3]);
	}

	@OriginalMember(owner = "client!ael", name = "bn", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2558 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2562 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2577 = arg7 >> 16 & 0xFF;
					anInt2581 = arg7 >> 8 & 0xFF;
					anInt2582 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2583 = arg7 >>> 24;
					anInt2585 = 256 - anInt2583;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2585 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2585 & 0xFF0000;
					anInt2574 = (local68 | local76) >>> 8;
				}
			}
			this.method18249(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!ael", name = "bt", descriptor = "(FFFFFFIIII)V")
	@Override
	final void method18233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2558 = arg7;
			if (arg6 != 1) {
				anInt2578 = arg7 >>> 24;
				anInt2562 = 256 - anInt2578;
				if (arg6 == 0) {
					anInt2577 = arg7 >> 16 & 0xFF;
					anInt2581 = arg7 >> 8 & 0xFF;
					anInt2582 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2583 = arg7 >>> 24;
					anInt2585 = 256 - anInt2583;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2585 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2585 & 0xFF0000;
					anInt2574 = (local68 | local76) >>> 8;
				}
			}
			this.method18249(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!ael", name = "bq", descriptor = "(FFFFFFILclient!ch;II)V")
	@Override
	final void method18187(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub3_12.method5696()) {
			throw new IllegalStateException();
		} else if (this.method18261(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class96_Sub3 local20 = (Class96_Sub3) arg7;
			this.method18251(local20.anIntArray29, local20.anIntArray30, anInt2580 - arg8, -arg9 - (anInt2565 - anInt2564));
		}
	}
}
