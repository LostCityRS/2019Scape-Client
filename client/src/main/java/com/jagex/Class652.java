package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wy")
public final class Class652 {

	@OriginalMember(owner = "client!wy", name = "t", descriptor = "Lclient!wy;")
	static final Class652 aClass652_2 = new Class652();

	@OriginalMember(owner = "client!wy", name = "f", descriptor = "[I")
	final int[] anIntArray514;

	@OriginalMember(owner = "client!wy", name = "<init>", descriptor = "([I)V")
	Class652(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.anIntArray514 = arg0;
		this.method33133(-1425299576);
	}

	@OriginalMember(owner = "client!wy", name = "<init>", descriptor = "()V")
	Class652() {
		this.anIntArray514 = new int[120];
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(16) int local16 = local9 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local7 += local29;
			this.anIntArray514[local9] = local7 / 4;
		}
		this.method33133(-1425299576);
	}

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "(II)I")
	int method33132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray514.length) {
				arg0 = this.anIntArray514.length;
			}
			return this.anIntArray514[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wy", name = "t", descriptor = "(I)V")
	void method33133(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray514.length; local1++) {
			if (this.anIntArray514[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray514[local1] < this.anIntArray514[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "f", descriptor = "(II)I")
	int method33134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray514.length && arg0 >= this.anIntArray514[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wy", name = "i", descriptor = "(I)I")
	int method33135(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray514.length) {
				arg0 = this.anIntArray514.length;
			}
			return this.anIntArray514[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wy", name = "u", descriptor = "()V")
	void method33136() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray514.length; local1++) {
			if (this.anIntArray514[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray514[local1] < this.anIntArray514[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "l", descriptor = "(I)I")
	int method33137(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray514.length && arg0 >= this.anIntArray514[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wy", name = "g", descriptor = "(I)I")
	int method33138(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray514.length) {
				arg0 = this.anIntArray514.length;
			}
			return this.anIntArray514[arg0 - 1];
		}
	}
}
