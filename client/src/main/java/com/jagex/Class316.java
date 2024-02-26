package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class316 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Lclient!ha;")
	Class307 aClass307_2;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
	int anInt4022;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "[I")
	int[] anIntArray382;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
	int[] anIntArray383;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	int anInt4023;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	int[] anIntArray384;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
	int[] anIntArray385;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	int[] anIntArray381 = null;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	Class316() {
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)I")
	int method27503(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)I")
	int method27504(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(Lclient!ha;)V")
	void method27505(@OriginalArg(0) Class307 arg0) {
		this.aClass307_2 = arg0;
		@Pc(6) int local6 = this.aClass307_2.method27350();
		this.aClass307_2.method27324(16);
		this.anInt4022 = this.aClass307_2.method27352() == 0 ? 1 : this.aClass307_2.method27324(4) + 1;
		@Pc(77) int local77;
		if (this.aClass307_2.method27352() == 0) {
			this.anInt4023 = 0;
		} else {
			this.anInt4023 = this.aClass307_2.method27324(8) + 1;
			if (this.anIntArray384 != null && this.anIntArray384.length == this.anInt4023) {
				this.method27506(this.anIntArray384);
			} else {
				this.anIntArray384 = new int[this.anInt4023];
			}
			if (this.anIntArray385 != null && this.anIntArray385.length == this.anInt4023) {
				this.method27506(this.anIntArray385);
			} else {
				this.anIntArray385 = new int[this.anInt4023];
			}
			for (local77 = 0; local77 < this.anInt4023; local77++) {
				this.anIntArray384[local77] = this.aClass307_2.method27324(this.method27504(local6 - 1));
				this.anIntArray385[local77] = this.aClass307_2.method27324(this.method27504(local6 - 1));
			}
		}
		this.aClass307_2.method27324(2);
		if (this.anInt4022 > 1) {
			this.anIntArray381 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray381[local77] = this.aClass307_2.method27324(4);
			}
		}
		if (this.anIntArray382 != null && this.anIntArray382.length == this.anInt4022) {
			this.method27506(this.anIntArray382);
		} else {
			this.anIntArray382 = new int[this.anInt4022];
		}
		if (this.anIntArray383 != null && this.anIntArray383.length == this.anInt4022) {
			this.method27506(this.anIntArray383);
		} else {
			this.anIntArray383 = new int[this.anInt4022];
		}
		for (local77 = 0; local77 < this.anInt4022; local77++) {
			this.aClass307_2.method27324(8);
			this.anIntArray382[local77] = this.aClass307_2.method27324(8);
			this.anIntArray383[local77] = this.aClass307_2.method27324(8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "([I)V")
	void method27506(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "([I)V")
	void method27507(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "(Lclient!ha;)V")
	void method27508(@OriginalArg(0) Class307 arg0) {
		this.aClass307_2 = arg0;
		@Pc(6) int local6 = this.aClass307_2.method27350();
		this.aClass307_2.method27324(16);
		this.anInt4022 = this.aClass307_2.method27352() == 0 ? 1 : this.aClass307_2.method27324(4) + 1;
		@Pc(77) int local77;
		if (this.aClass307_2.method27352() == 0) {
			this.anInt4023 = 0;
		} else {
			this.anInt4023 = this.aClass307_2.method27324(8) + 1;
			if (this.anIntArray384 != null && this.anIntArray384.length == this.anInt4023) {
				this.method27506(this.anIntArray384);
			} else {
				this.anIntArray384 = new int[this.anInt4023];
			}
			if (this.anIntArray385 != null && this.anIntArray385.length == this.anInt4023) {
				this.method27506(this.anIntArray385);
			} else {
				this.anIntArray385 = new int[this.anInt4023];
			}
			for (local77 = 0; local77 < this.anInt4023; local77++) {
				this.anIntArray384[local77] = this.aClass307_2.method27324(this.method27504(local6 - 1));
				this.anIntArray385[local77] = this.aClass307_2.method27324(this.method27504(local6 - 1));
			}
		}
		this.aClass307_2.method27324(2);
		if (this.anInt4022 > 1) {
			this.anIntArray381 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray381[local77] = this.aClass307_2.method27324(4);
			}
		}
		if (this.anIntArray382 != null && this.anIntArray382.length == this.anInt4022) {
			this.method27506(this.anIntArray382);
		} else {
			this.anIntArray382 = new int[this.anInt4022];
		}
		if (this.anIntArray383 != null && this.anIntArray383.length == this.anInt4022) {
			this.method27506(this.anIntArray383);
		} else {
			this.anIntArray383 = new int[this.anInt4022];
		}
		for (local77 = 0; local77 < this.anInt4022; local77++) {
			this.aClass307_2.method27324(8);
			this.anIntArray382[local77] = this.aClass307_2.method27324(8);
			this.anIntArray383[local77] = this.aClass307_2.method27324(8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)I")
	int method27509(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}
}
