package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class634 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!wd;")
	static final Class634 aClass634_1 = new Class634();

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
	final int[] anIntArray501;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 7)
	Class634() {
		this.anIntArray501 = new int[120];
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(16) int local16 = local9 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local7 += local29;
			this.anIntArray501[local9] = local7 / 4;
		}
		this.method32310((byte) -16);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([I)V", line = 19)
	Class634(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.anIntArray501 = arg0;
		this.method32310((byte) 51);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V", line = 26)
	final void method32310(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray501.length; local1++) {
			if (this.anIntArray501[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray501[local1] < this.anIntArray501[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(I)I", line = 33)
	int method32311(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray501.length && arg0 >= this.anIntArray501[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(II)I", line = 33)
	int method32312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray501.length && arg0 >= this.anIntArray501[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)I", line = 33)
	int method32313(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray501.length && arg0 >= this.anIntArray501[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(I)I", line = 33)
	int method32314(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray501.length && arg0 >= this.anIntArray501[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "(I)I", line = 33)
	int method32315(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray501.length && arg0 >= this.anIntArray501[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(II)I", line = 42)
	int method32316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray501.length) {
				arg0 = this.anIntArray501.length;
			}
			return this.anIntArray501[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "(I)I", line = 42)
	int method32317(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray501.length) {
				arg0 = this.anIntArray501.length;
			}
			return this.anIntArray501[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "(I)I", line = 42)
	int method32318(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray501.length) {
				arg0 = this.anIntArray501.length;
			}
			return this.anIntArray501[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wd", name = "fa", descriptor = "(I)V", line = 2530)
	static final void method32319(@OriginalArg(0) int arg0) {
		Class285.method26515(2095162445);
		client.aClass532_1.method30516((byte) -13);
		@Pc(6) int local6;
		for (local6 = 0; local6 < client.aClass173Array1.length; local6++) {
			client.aClass173Array1[local6] = null;
		}
		for (local6 = 0; local6 < client.aClass567Array1.length; local6++) {
			client.aClass567Array1[local6] = null;
		}
		Class93_Sub8.method12991(-456436173);
		for (local6 = 0; local6 < 2048; local6++) {
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6] = null;
		}
		client.anInt3540 = 0;
		client.aClass16_18.method225((byte) 100);
		client.anInt3488 = 0;
		client.aClass16_20.method225((byte) 127);
		Class322.method27271(Class20.method376(1437601641), -1555248762);
		client.anInt3455 = 0;
		Class624.aClass120_1.aClass647_1.method32643((byte) -15);
		Class581.aClass386_2 = null;
		Class279.aClass386_1 = null;
		Class253.aClass93_Sub28_3 = null;
		Class121.aClass93_Sub28_2 = null;
		Class557.aClass297_1 = null;
		client.aBoolean636 = true;
		Class653.aClass678_2 = null;
		Class442.aLong276 = 0L;
		Class436.method28812(-916881791);
		Class264.method26209((byte) -102);
	}

	@OriginalMember(owner = "client!wd", name = "akt", descriptor = "(Lclient!yf;I)V", line = 11750)
	static final void method32320(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		if (Class159_Sub1.aClass16_15 == null) {
			return;
		}
		@Pc(36) Class93 local36 = Class159_Sub1.aClass16_15.method214((long) local13);
		if (local36 != null && !local28) {
			local36.method23969(1477376069);
		} else if (local36 == null && local28) {
			local36 = new Class93();
			Class159_Sub1.aClass16_15.method220(local36, (long) local13);
		}
	}

	@OriginalMember(owner = "client!wd", name = "auz", descriptor = "(Lclient!yf;I)V", line = 13409)
	static final void method32321(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16226(-77427108);
	}
}
