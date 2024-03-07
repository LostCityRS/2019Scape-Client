package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ank")
public class Class166_Sub34 extends Class166 {

	@OriginalMember(owner = "client!ank", name = "z", descriptor = "I")
	public static final int anInt2291 = 3;

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "I")
	public static final int anInt2292 = 1;

	@OriginalMember(owner = "client!ank", name = "u", descriptor = "I")
	public static final int anInt2293 = 2;

	@OriginalMember(owner = "client!ank", name = "p", descriptor = "I")
	public static final int anInt2294 = 4;

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "I")
	public static final int anInt2295 = 0;

	@OriginalMember(owner = "client!ank", name = "az", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!ank", name = "bt", descriptor = "Lclient!cm;")
	public static Class100 aClass100_23;

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(Lclient!ali;)V", line = 14)
	public Class166_Sub34(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(ILclient!ali;)V", line = 18)
	public Class166_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ank", name = "o", descriptor = "(B)V", line = 22)
	public void method16197(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -18) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "y", descriptor = "()V", line = 22)
	public void method16198() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 40) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "q", descriptor = "()V", line = 22)
	public void method16199() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -85) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "x", descriptor = "()V", line = 22)
	public void method16200() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "b", descriptor = "()V", line = 22)
	public void method16201() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 30) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "e", descriptor = "(B)I", line = 26)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14378(-1596494249).method140(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16552() {
		return this.aClass93_Sub36_49.method14378(564779326).method140(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "()I", line = 26)
	@Override
	int method16549() {
		return this.aClass93_Sub36_49.method14378(1498910263).method140(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "u", descriptor = "()I", line = 26)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14378(1516949387).method140(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "f", descriptor = "()I", line = 26)
	@Override
	int method16544() {
		return this.aClass93_Sub36_49.method14378(1773118261).method140(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "z", descriptor = "(I)I", line = 31)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "p", descriptor = "(I)I", line = 31)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "n", descriptor = "(II)I", line = 31)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "k", descriptor = "(II)V", line = 35)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "c", descriptor = "(I)V", line = 35)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "h", descriptor = "()I", line = 39)
	public int method16202() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ank", name = "a", descriptor = "()I", line = 39)
	public int method16203() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ank", name = "s", descriptor = "(B)I", line = 39)
	public int method16204(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ank", name = "yf", descriptor = "(Lclient!yf;B)V", line = 9339)
	static final void method16205(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class82.aClass153_1.method14070(-358695326);
	}

	@OriginalMember(owner = "client!ank", name = "kn", descriptor = "(II)V", line = 11871)
	static final void method16206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class76.method1283(2036041726);
		@Pc(10) int local10 = ((Class108_Sub1) Class21.varPlayerTypes.get(arg0, -866348547)).anInt693 * 242969929;
		if (local10 == 0) {
			return;
		}
		@Pc(22) int local22 = Class624.playerVariableManager.method33455((Class108) Class21.varPlayerTypes.get(arg0, -815907093), 994687710);
		if (local10 == 5) {
			client.anInt3519 = local22 * -1972877813;
		}
		if (local10 == 6) {
			client.anInt3527 = local22 * -954117793;
		}
	}
}
