package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class634 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!wd;")
	static final Class634 aClass634_1 = new Class634();

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
	final int[] anIntArray503;

	@OriginalMember(owner = "client!wd", name = "akt", descriptor = "(Lclient!yf;I)V")
	static void method32500(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		if (Class159_Sub1.aClass16_15 == null) {
			return;
		}
		@Pc(36) Class93 local36 = Class159_Sub1.aClass16_15.method215((long) local13);
		if (local36 != null && !local28) {
			local36.method23981(1477376069);
		} else if (local36 == null && local28) {
			local36 = new Class93();
			Class159_Sub1.aClass16_15.method221(local36, (long) local13);
		}
	}

	@OriginalMember(owner = "client!wd", name = "auz", descriptor = "(Lclient!yf;I)V")
	static void method32501(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16235(-77427108);
	}

	@OriginalMember(owner = "client!wd", name = "fa", descriptor = "(I)V")
	static void method32502(@OriginalArg(0) int arg0) {
		Class285.method26610(2095162445);
		client.aClass532_1.method30643((byte) -13);
		@Pc(6) int local6;
		for (local6 = 0; local6 < client.aClass173Array1.length; local6++) {
			client.aClass173Array1[local6] = null;
		}
		for (local6 = 0; local6 < client.aClass567Array1.length; local6++) {
			client.aClass567Array1[local6] = null;
		}
		Class93_Sub8.method12992(-456436173);
		for (local6 = 0; local6 < 2048; local6++) {
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6] = null;
		}
		client.anInt3540 = 0;
		client.aClass16_18.method219((byte) 100);
		client.anInt3488 = 0;
		client.aClass16_20.method219((byte) 127);
		Class322.method27367(Class20.method376(1437601641), -1555248762);
		client.anInt3455 = 0;
		Class624.aClass120_1.aClass647_1.method32823((byte) -15);
		Class581.aClass386_2 = null;
		Class279.aClass386_1 = null;
		Class253.aClass93_Sub28_3 = null;
		Class121.aClass93_Sub28_2 = null;
		Class557.aClass297_1 = null;
		client.aBoolean638 = true;
		Class653.aClass678_2 = null;
		Class442.aLong279 = 0L;
		Class436.method28992(-916881791);
		Class264.method26305((byte) -102);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([I)V")
	Class634(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.anIntArray503 = arg0;
		this.method32492((byte) 51);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	Class634() {
		this.anIntArray503 = new int[120];
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(16) int local16 = local9 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local7 += local29;
			this.anIntArray503[local9] = local7 / 4;
		}
		this.method32492((byte) -16);
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(I)I")
	int method32491(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray503.length && arg0 >= this.anIntArray503[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
	void method32492(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray503.length; local1++) {
			if (this.anIntArray503[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray503[local1] < this.anIntArray503[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(II)I")
	int method32493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray503.length && arg0 >= this.anIntArray503[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)I")
	int method32494(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray503.length && arg0 >= this.anIntArray503[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(I)I")
	int method32495(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray503.length && arg0 >= this.anIntArray503[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "(I)I")
	int method32496(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray503.length && arg0 >= this.anIntArray503[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(II)I")
	int method32497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray503.length) {
				arg0 = this.anIntArray503.length;
			}
			return this.anIntArray503[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "(I)I")
	int method32498(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray503.length) {
				arg0 = this.anIntArray503.length;
			}
			return this.anIntArray503[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "(I)I")
	int method32499(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray503.length) {
				arg0 = this.anIntArray503.length;
			}
			return this.anIntArray503[arg0 - 1];
		}
	}
}
