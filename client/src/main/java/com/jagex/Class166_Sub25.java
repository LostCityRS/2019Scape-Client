package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amy")
public class Class166_Sub25 extends Class166 {

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "I")
	public static final int anInt2230 = 1;

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "I")
	public static final int anInt2231 = 0;

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub25(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amy", name = "o", descriptor = "(I)V", line = 19)
	public void method15886(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -9) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amy", name = "y", descriptor = "()V", line = 19)
	public void method15887() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -22) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amy", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "s", descriptor = "(I)I", line = 35)
	public int method15888(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amy", name = "q", descriptor = "()I", line = 35)
	public int method15889() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amy", name = "av", descriptor = "(Lclient!yf;I)V", line = 4974)
	static final void method15890(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0.anIntArray520[arg0.anInt5889 * -709694321];
		@Pc(11) Class93_Sub1_Sub13 local11 = Class407.method28580(local7, 1200487767);
		if (local11 == null) {
			throw new RuntimeException();
		}
		@Pc(23) int[] local23 = new int[local11.anInt3065 * 341680345];
		@Pc(29) Object[] local29 = new Object[local11.anInt3064 * -1520226159];
		@Pc(35) long[] local35 = new long[local11.anInt3066 * 801418781];
		@Pc(37) int local37;
		for (local37 = 0; local37 < local11.anInt3067 * 1356869505; local37++) {
			local23[local37] = arg0.anIntArray519[arg0.anInt5891 * -1497248091 - local11.anInt3067 * 1356869505 + local37];
		}
		for (local37 = 0; local37 < local11.anInt3068 * -1006881837; local37++) {
			local29[local37] = arg0.anObjectArray45[local37 + (arg0.anInt5888 * 587908375 - local11.anInt3068 * -1006881837)];
		}
		for (local37 = 0; local37 < local11.anInt3063 * -287495173; local37++) {
			local35[local37] = arg0.aLongArray27[arg0.anInt5894 * -2000995827 - local11.anInt3063 * -287495173 + local37];
		}
		arg0.anInt5891 -= local11.anInt3067 * -1387445587;
		arg0.anInt5888 -= local11.anInt3068 * -1734232923;
		arg0.anInt5894 -= local11.anInt3063 * -1492933593;
		@Pc(147) Class696 local147 = new Class696();
		local147.aClass93_Sub1_Sub13_2 = arg0.aClass93_Sub1_Sub13_1;
		local147.anInt5940 = arg0.anInt5889 * 2112632879;
		local147.anIntArray526 = arg0.anIntArray517;
		local147.anObjectArray46 = arg0.anObjectArray44;
		local147.aLongArray28 = arg0.aLongArray26;
		if (arg0.anInt5890 * -272305733 >= arg0.aClass696Array1.length) {
			throw new RuntimeException();
		}
		arg0.aClass696Array1[(arg0.anInt5890 += 142027635) * -272305733 - 1] = local147;
		arg0.aClass93_Sub1_Sub13_1 = local11;
		arg0.aClass560Array2 = arg0.aClass93_Sub1_Sub13_1.aClass560Array1;
		arg0.anIntArray520 = arg0.aClass93_Sub1_Sub13_1.anIntArray259;
		arg0.anInt5889 = -2047914607;
		arg0.anIntArray517 = local23;
		arg0.anObjectArray44 = local29;
		arg0.aLongArray26 = local35;
	}
}
