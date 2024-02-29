package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ang")
public class Class166_Sub31 extends Class166 {

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "I")
	public static final int anInt2272 = 0;

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "I")
	public static final int anInt2273 = 1;

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub31(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ang", name = "o", descriptor = "(I)V", line = 19)
	public void method16105(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -109) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "()V", line = 19)
	public void method16106() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -105) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ang", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "s", descriptor = "(I)Z", line = 27)
	public boolean method16107(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "b", descriptor = "()Z", line = 27)
	public boolean method16108() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "h", descriptor = "()Z", line = 27)
	public boolean method16109() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "x", descriptor = "()Z", line = 27)
	public boolean method16110() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "a", descriptor = "()Z", line = 27)
	public boolean method16111() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "n", descriptor = "(II)I", line = 31)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "p", descriptor = "(I)I", line = 31)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "k", descriptor = "(II)V", line = 35)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "c", descriptor = "(I)V", line = 35)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "i", descriptor = "()I", line = 39)
	public int method16112() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "()I", line = 39)
	public int method16113() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "y", descriptor = "(S)I", line = 39)
	public int method16114(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "j", descriptor = "()I", line = 39)
	public int method16115() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "g", descriptor = "()I", line = 39)
	public int method16116() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "le", descriptor = "(ZIB)V", line = 12067)
	public static final void method16117(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class93_Sub28 local5 = arg0 ? Class121.aClass93_Sub28_2 : Class253.aClass93_Sub28_3;
		if (local5 == null || arg1 < 0 || arg1 >= local5.anInt1602 * -1052058559) {
			return;
		}
		@Pc(21) Class373 local21 = local5.aClass373Array1[arg1];
		if (local21.aByte150 != -1) {
			return;
		}
		@Pc(29) String local29 = local21.aString191;
		@Pc(32) Class175 local32 = Class330.method27371(-2070490767);
		@Pc(38) Class93_Sub22 local38 = Class102.method2588(Class446.aClass446_96, local32.aClass24_2, (byte) 33);
		local38.aClass93_Sub41_Sub2_1.method22394(Class46.method895(local29, -1614772735) + 3, (byte) -37);
		local38.aClass93_Sub41_Sub2_1.method22394(arg0 ? 1 : 0, (byte) -29);
		local38.aClass93_Sub41_Sub2_1.method22395(arg1, 2136911152);
		local38.aClass93_Sub41_Sub2_1.method22431(local29, 1257477998);
		local32.method24356(local38, -2102181116);
	}
}
