package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ank")
public final class Class166_Sub34 extends Class166 {

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

	@OriginalMember(owner = "client!ank", name = "kn", descriptor = "(II)V")
	static void method16217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class76.method1284(2036041726);
		@Pc(10) int local10 = ((Class108_Sub1) Class21.aClass79_Sub1_Sub1_1.method18273(arg0, -866348547)).anInt693 * 242969929;
		if (local10 == 0) {
			return;
		}
		@Pc(22) int local22 = Class624.aClass120_1.method33636((Class108) Class21.aClass79_Sub1_Sub1_1.method18273(arg0, -815907093), 994687710);
		if (local10 == 5) {
			client.anInt3519 = local22 * -1972877813;
		}
		if (local10 == 6) {
			client.anInt3527 = local22 * -954117793;
		}
	}

	@OriginalMember(owner = "client!ank", name = "yf", descriptor = "(Lclient!yf;B)V")
	static void method16218(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class82.aClass153_1.method14058(-358695326);
	}

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub34(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ank", name = "h", descriptor = "()I")
	public int method16209() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ank", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "o", descriptor = "(B)V")
	public void method16210(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -18) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(-1596494249).method141(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "y", descriptor = "()V")
	public void method16211() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 40) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "a", descriptor = "()I")
	public int method16212() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return this.aClass93_Sub36_49.method14365(564779326).method141(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return this.aClass93_Sub36_49.method14365(1498910263).method141(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return this.aClass93_Sub36_49.method14365(1516949387).method141(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return this.aClass93_Sub36_49.method14365(1773118261).method141(-601356179) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ank", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ank", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "q", descriptor = "()V")
	public void method16213() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -85) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "x", descriptor = "()V")
	public void method16214() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "b", descriptor = "()V")
	public void method16215() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 30) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ank", name = "s", descriptor = "(B)I")
	public int method16216(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}
}
