package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atd")
public final class Class80_Sub13_Sub1_Sub1 extends Class80_Sub13_Sub1 {

	@OriginalMember(owner = "client!atd", name = "s", descriptor = "[I")
	int[] anIntArray285 = null;

	@OriginalMember(owner = "client!atd", name = "k", descriptor = "[I")
	int[] anIntArray286 = null;

	@OriginalMember(owner = "client!atd", name = "a", descriptor = "Lclient!agj;")
	Class113_Sub1 aClass113_Sub1_2;

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(Lclient!agj;Lclient!hi;)V")
	Class80_Sub13_Sub1_Sub1(@OriginalArg(0) Class113_Sub1 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg1);
		this.aClass113_Sub1_2 = arg0;
		this.anIntArray285 = arg1.anIntArray380;
		this.anIntArray286 = arg1.anIntArray379;
	}

	@OriginalMember(owner = "client!atd", name = "t", descriptor = "(I)Z")
	@Override
	public boolean method23992(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atd", name = "n", descriptor = "()I")
	int method23570() {
		return this.anIntArray286[this.aClass113_Sub1_2.method8355((byte) 31)];
	}

	@OriginalMember(owner = "client!atd", name = "y", descriptor = "()I")
	int method23571() {
		return this.anIntArray285[this.aClass113_Sub1_2.method8355((byte) 81)];
	}

	@OriginalMember(owner = "client!atd", name = "g", descriptor = "(I)I")
	@Override
	public int method23997(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray285[arg0];
		@Pc(9) int local9 = this.anIntArray286[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!atd", name = "b", descriptor = "()I")
	int method23572() {
		return this.anIntArray285[this.aClass113_Sub1_2.method8355((byte) 15)];
	}

	@OriginalMember(owner = "client!atd", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method23993(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atd", name = "c", descriptor = "()I")
	int method23573() {
		return this.anIntArray285[this.aClass113_Sub1_2.method8355((byte) -30)];
	}

	@OriginalMember(owner = "client!atd", name = "v", descriptor = "(I)I")
	@Override
	public int method24003(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray285[arg0];
		@Pc(9) int local9 = this.anIntArray286[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!atd", name = "ax", descriptor = "()I")
	int method23574() {
		return this.anIntArray285[this.aClass113_Sub1_2.method8355((byte) 36)];
	}

	@OriginalMember(owner = "client!atd", name = "ay", descriptor = "()I")
	int method23575() {
		return this.anIntArray285[this.aClass113_Sub1_2.method8355((byte) -55)];
	}

	@OriginalMember(owner = "client!atd", name = "ai", descriptor = "()I")
	int method23576() {
		return this.anIntArray286[this.aClass113_Sub1_2.method8355((byte) 0)];
	}

	@OriginalMember(owner = "client!atd", name = "aq", descriptor = "()I")
	int method23577() {
		return this.anIntArray286[this.aClass113_Sub1_2.method8355((byte) 12)];
	}
}
