package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amx")
public class Class166_Sub24 extends Class166 {

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "I")
	public static final int anInt2223 = 0;

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "I")
	public static final int anInt2224 = 1;

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "I")
	public static final int anInt2225 = 2;

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub24(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amx", name = "o", descriptor = "(I)V", line = 21)
	public void method15862(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -73) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "()V", line = 21)
	public void method15863() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -94) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "q", descriptor = "()V", line = 21)
	public void method15864() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -85) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "b", descriptor = "()V", line = 21)
	public void method15865() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) 34) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(-546177811) && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 112), -2121506843) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16544() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(1377303646) && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 101), -2144953141) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16549() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(-662025022) && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 44), -1957308007) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(-1361812241) && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 90), -2035884237) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16552() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(261356871) && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 68), -1986736271) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "n", descriptor = "(I)I", line = 26)
	public static int method15866(@OriginalArg(0) int arg0) {
		return Class329.anInt4145 * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "(B)Z", line = 30)
	public boolean method15867(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "h", descriptor = "()Z", line = 30)
	public boolean method15868() {
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "k", descriptor = "(II)V", line = 38)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "d", descriptor = "(I)V", line = 38)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "c", descriptor = "(I)V", line = 38)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "a", descriptor = "()I", line = 42)
	public int method15869() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amx", name = "y", descriptor = "(I)I", line = 42)
	public int method15870(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "()I", line = 42)
	public int method15871() {
		return this.anInt2379 * 960141055;
	}
}
