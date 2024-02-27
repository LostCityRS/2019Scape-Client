package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class600 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	int anInt5707;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	int anInt5704;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
	int anInt5701;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
	int anInt5703;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	int anInt5702;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
	int anInt5705;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
	int anInt5706;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
	int anInt5700;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
	int anInt5708;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	int anInt5709;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIIIIII)V")
	Class600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5707 = arg0;
		this.anInt5704 = arg1;
		this.anInt5701 = arg2;
		this.anInt5703 = arg3 * arg3;
		this.anInt5702 = this.anInt5707 + arg4;
		this.anInt5705 = this.anInt5707 + arg5;
		this.anInt5706 = this.anInt5704 + arg6;
		this.anInt5700 = this.anInt5704 + arg7;
		this.anInt5708 = this.anInt5701 + arg8;
		this.anInt5709 = this.anInt5701 + arg9;
	}

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "(III)Z")
	public boolean method32019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt5702 || arg0 > this.anInt5705) {
			return false;
		} else if (arg1 < this.anInt5706 || arg1 > this.anInt5700) {
			return false;
		} else if (arg2 >= this.anInt5708 && arg2 <= this.anInt5709) {
			@Pc(34) int local34 = arg0 - this.anInt5707;
			@Pc(39) int local39 = arg2 - this.anInt5701;
			return local34 * local34 + local39 * local39 < this.anInt5703;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "(III)Z")
	public boolean method32020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt5702 || arg0 > this.anInt5705) {
			return false;
		} else if (arg1 < this.anInt5706 || arg1 > this.anInt5700) {
			return false;
		} else if (arg2 >= this.anInt5708 && arg2 <= this.anInt5709) {
			@Pc(34) int local34 = arg0 - this.anInt5707;
			@Pc(39) int local39 = arg2 - this.anInt5701;
			return local34 * local34 + local39 * local39 < this.anInt5703;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(III)Z")
	public boolean method32021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt5702 || arg0 > this.anInt5705) {
			return false;
		} else if (arg1 < this.anInt5706 || arg1 > this.anInt5700) {
			return false;
		} else if (arg2 >= this.anInt5708 && arg2 <= this.anInt5709) {
			@Pc(34) int local34 = arg0 - this.anInt5707;
			@Pc(39) int local39 = arg2 - this.anInt5701;
			return local34 * local34 + local39 * local39 < this.anInt5703;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(IIIIIIIIII)V")
	void method32022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5707 = arg0;
		this.anInt5704 = arg1;
		this.anInt5701 = arg2;
		this.anInt5703 = arg3 * arg3;
		this.anInt5702 = this.anInt5707 + arg4;
		this.anInt5705 = this.anInt5707 + arg5;
		this.anInt5706 = this.anInt5704 + arg6;
		this.anInt5700 = this.anInt5704 + arg7;
		this.anInt5708 = this.anInt5701 + arg8;
		this.anInt5709 = this.anInt5701 + arg9;
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(IIIIIIIIII)V")
	void method32023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5707 = arg0;
		this.anInt5704 = arg1;
		this.anInt5701 = arg2;
		this.anInt5703 = arg3 * arg3;
		this.anInt5702 = this.anInt5707 + arg4;
		this.anInt5705 = this.anInt5707 + arg5;
		this.anInt5706 = this.anInt5704 + arg6;
		this.anInt5700 = this.anInt5704 + arg7;
		this.anInt5708 = this.anInt5701 + arg8;
		this.anInt5709 = this.anInt5701 + arg9;
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIIIIIIII)V")
	void method32024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5707 = arg0;
		this.anInt5704 = arg1;
		this.anInt5701 = arg2;
		this.anInt5703 = arg3 * arg3;
		this.anInt5702 = this.anInt5707 + arg4;
		this.anInt5705 = this.anInt5707 + arg5;
		this.anInt5706 = this.anInt5704 + arg6;
		this.anInt5700 = this.anInt5704 + arg7;
		this.anInt5708 = this.anInt5701 + arg8;
		this.anInt5709 = this.anInt5701 + arg9;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(IIIIIIIIII)V")
	void method32025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5707 = arg0;
		this.anInt5704 = arg1;
		this.anInt5701 = arg2;
		this.anInt5703 = arg3 * arg3;
		this.anInt5702 = this.anInt5707 + arg4;
		this.anInt5705 = this.anInt5707 + arg5;
		this.anInt5706 = this.anInt5704 + arg6;
		this.anInt5700 = this.anInt5704 + arg7;
		this.anInt5708 = this.anInt5701 + arg8;
		this.anInt5709 = this.anInt5701 + arg9;
	}
}
