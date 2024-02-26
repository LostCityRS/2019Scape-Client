package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class589 {

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
	int anInt5305;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	int anInt5306;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	int anInt5307;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
	int anInt5311;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	int anInt5309;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	int anInt5308;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	int anInt5312;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
	int anInt5314;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	int anInt5313;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	int anInt5310;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	Class589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5305 = arg0;
		this.anInt5306 = arg1;
		this.anInt5307 = arg2;
		this.anInt5311 = arg3 * arg3;
		this.anInt5309 = this.anInt5305 + arg4;
		this.anInt5308 = this.anInt5305 + arg5;
		this.anInt5312 = this.anInt5306 + arg6;
		this.anInt5314 = this.anInt5306 + arg7;
		this.anInt5313 = this.anInt5307 + arg8;
		this.anInt5310 = this.anInt5307 + arg9;
	}

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "(IIIIIIIIII)V")
	void method31905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5305 = arg0;
		this.anInt5306 = arg1;
		this.anInt5307 = arg2;
		this.anInt5311 = arg3 * arg3;
		this.anInt5309 = this.anInt5305 + arg4;
		this.anInt5308 = this.anInt5305 + arg5;
		this.anInt5312 = this.anInt5306 + arg6;
		this.anInt5314 = this.anInt5306 + arg7;
		this.anInt5313 = this.anInt5307 + arg8;
		this.anInt5310 = this.anInt5307 + arg9;
	}

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "(IIIIIIIIII)V")
	void method31906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5305 = arg0;
		this.anInt5306 = arg1;
		this.anInt5307 = arg2;
		this.anInt5311 = arg3 * arg3;
		this.anInt5309 = this.anInt5305 + arg4;
		this.anInt5308 = this.anInt5305 + arg5;
		this.anInt5312 = this.anInt5306 + arg6;
		this.anInt5314 = this.anInt5306 + arg7;
		this.anInt5313 = this.anInt5307 + arg8;
		this.anInt5310 = this.anInt5307 + arg9;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(IIIIIIIIII)V")
	void method31907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5305 = arg0;
		this.anInt5306 = arg1;
		this.anInt5307 = arg2;
		this.anInt5311 = arg3 * arg3;
		this.anInt5309 = this.anInt5305 + arg4;
		this.anInt5308 = this.anInt5305 + arg5;
		this.anInt5312 = this.anInt5306 + arg6;
		this.anInt5314 = this.anInt5306 + arg7;
		this.anInt5313 = this.anInt5307 + arg8;
		this.anInt5310 = this.anInt5307 + arg9;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(III)Z")
	public boolean method31908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt5309 || arg0 > this.anInt5308) {
			return false;
		} else if (arg1 < this.anInt5312 || arg1 > this.anInt5314) {
			return false;
		} else if (arg2 >= this.anInt5313 && arg2 <= this.anInt5310) {
			@Pc(34) int local34 = arg0 - this.anInt5305;
			@Pc(39) int local39 = arg2 - this.anInt5307;
			return local34 * local34 + local39 * local39 < this.anInt5311;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "(III)Z")
	public boolean method31909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt5309 || arg0 > this.anInt5308) {
			return false;
		} else if (arg1 < this.anInt5312 || arg1 > this.anInt5314) {
			return false;
		} else if (arg2 >= this.anInt5313 && arg2 <= this.anInt5310) {
			@Pc(34) int local34 = arg0 - this.anInt5305;
			@Pc(39) int local39 = arg2 - this.anInt5307;
			return local34 * local34 + local39 * local39 < this.anInt5311;
		} else {
			return false;
		}
	}
}
