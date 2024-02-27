package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class610 implements Interface67 {

	@OriginalMember(owner = "client!vd", name = "ip", descriptor = "Lclient!aca;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	final int anInt5400;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	final int anInt5401;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
	final int[] anIntArray493;

	@OriginalMember(owner = "client!vd", name = "aoc", descriptor = "(Lclient!yp;B)V")
	static void method32206(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		BufferedSocket.aClass121_Sub1_2.method9639(local12, 1902135830);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(CI)Z")
	public static boolean method32207(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!vd", name = "asv", descriptor = "(Lclient!yp;B)V")
	static void method32208(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(II[I)V")
	Class610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt5400 = arg0 * -226909983;
		this.anInt5401 = arg1 * -267925731;
		this.anIntArray493 = arg2;
	}

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;S)Z")
	@Override
	public boolean method32275(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) short arg4) {
		if (arg0 != null) {
			if (this.anInt5400 * 1917035297 != arg0.method23452((byte) 3)) {
				return false;
			}
			if (this.anInt5401 * -162712779 > arg0.method23455((byte) -85)) {
				return false;
			}
			@Pc(33) int[] local33 = this.anIntArray493;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(43) int local43 = local33[local35];
				if (!arg3.method15048(local43, (short) 8586)) {
					return false;
				}
			}
		} else if (this.anInt5400 * 1917035297 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32276(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		if (arg0 != null) {
			if (this.anInt5400 * 1917035297 != arg0.method23452((byte) 3)) {
				return false;
			}
			if (this.anInt5401 * -162712779 > arg0.method23455((byte) -83)) {
				return false;
			}
			@Pc(33) int[] local33 = this.anIntArray493;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(43) int local43 = local33[local35];
				if (!arg3.method15048(local43, (short) 21069)) {
					return false;
				}
			}
		} else if (this.anInt5400 * 1917035297 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32277(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		if (arg0 != null) {
			if (this.anInt5400 * 1917035297 != arg0.method23452((byte) 3)) {
				return false;
			}
			if (this.anInt5401 * -162712779 > arg0.method23455((byte) -64)) {
				return false;
			}
			@Pc(33) int[] local33 = this.anIntArray493;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(43) int local43 = local33[local35];
				if (!arg3.method15048(local43, (short) -5318)) {
					return false;
				}
			}
		} else if (this.anInt5400 * 1917035297 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32278(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		if (arg0 != null) {
			if (this.anInt5400 * 1917035297 != arg0.method23452((byte) 3)) {
				return false;
			}
			if (this.anInt5401 * -162712779 > arg0.method23455((byte) -10)) {
				return false;
			}
			@Pc(33) int[] local33 = this.anIntArray493;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(43) int local43 = local33[local35];
				if (!arg3.method15048(local43, (short) -21787)) {
					return false;
				}
			}
		} else if (this.anInt5400 * 1917035297 != -1) {
			return false;
		}
		return true;
	}
}
