package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amj")
public class Class166_Sub10 extends Class166 {

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "I")
	static final int anInt2130 = 0;

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "I")
	static final int anInt2131 = 1;

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub10(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amj", name = "o", descriptor = "(B)V", line = 19)
	public void method15567(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) -82) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "q", descriptor = "()V", line = 19)
	public void method15568() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) -96) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "y", descriptor = "()V", line = 19)
	public void method15569() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) -85) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "x", descriptor = "()V", line = 19)
	public void method15570() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) 1) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "(B)I", line = 35)
	public int method15571(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amj", name = "b", descriptor = "()I", line = 35)
	public int method15572() {
		return this.anInt2379 * 960141055;
	}
}
