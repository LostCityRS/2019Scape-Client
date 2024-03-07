package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajc")
public class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!ajc", name = "m", descriptor = "I")
	public int anInt1399;

	@OriginalMember(owner = "client!ajc", name = "k", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!ajc", name = "f", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!ajc", name = "w", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!ajc", name = "<init>", descriptor = "(IIII)V", line = 11)
	Class149_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1399 = arg0 * -143574939;
		this.anInt1396 = arg1 * -1120807263;
		this.anInt1398 = arg2 * 989414613;
		this.anInt1397 = arg3 * -401760371;
	}

	@OriginalMember(owner = "client!ajc", name = "n", descriptor = "(IIIII)V", line = 19)
	void method11773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1399 = arg0 * -143574939;
		this.anInt1396 = arg1 * -1120807263;
		this.anInt1398 = arg2 * 989414613;
		this.anInt1397 = arg3 * -401760371;
	}

	@OriginalMember(owner = "client!ajc", name = "m", descriptor = "(IIII)V", line = 19)
	void method11774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1399 = arg0 * -143574939;
		this.anInt1396 = arg1 * -1120807263;
		this.anInt1398 = arg2 * 989414613;
		this.anInt1397 = arg3 * -401760371;
	}

	@OriginalMember(owner = "client!ajc", name = "k", descriptor = "(IIII)V", line = 19)
	void method11775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1399 = arg0 * -143574939;
		this.anInt1396 = arg1 * -1120807263;
		this.anInt1398 = arg2 * 989414613;
		this.anInt1397 = arg3 * -401760371;
	}

	@OriginalMember(owner = "client!ajc", name = "f", descriptor = "(IIII)V", line = 19)
	void method11776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1399 = arg0 * -143574939;
		this.anInt1396 = arg1 * -1120807263;
		this.anInt1398 = arg2 * 989414613;
		this.anInt1397 = arg3 * -401760371;
	}

	@OriginalMember(owner = "client!ajc", name = "d", descriptor = "(Lclient!st;S)Z", line = 339)
	static boolean method11777(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Class610 local9 = (Class610) client.world.method30496(912481518).method18261(arg0.method13423(-1037211373), 1840718394);
		if (local9.anInt5601 * -303013723 == -1) {
			return true;
		} else {
			@Pc(26) Class65 local26 = (Class65) Class466.aClass32_Sub20_3.method18261(local9.anInt5601 * -303013723, -2043580661);
			return local26.anInt232 * -1612489907 == -1 ? true : local26.method1185(-196635201);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "bl", descriptor = "(Lclient!yf;I)V", line = 5086)
	static final void method11778(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5894 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt5894 * -2000995827] < arg0.aLongArray27[arg0.anInt5894 * -2000995827 + 1]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}
}
