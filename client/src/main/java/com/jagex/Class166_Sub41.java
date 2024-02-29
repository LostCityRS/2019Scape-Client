package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ans")
public class Class166_Sub41 extends Class166 {

	@OriginalMember(owner = "client!ans", name = "w", descriptor = "I")
	public static final int anInt2342 = 1;

	@OriginalMember(owner = "client!ans", name = "l", descriptor = "I")
	public static final int anInt2343 = 0;

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub41(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!ans", name = "o", descriptor = "(I)V", line = 19)
	public void method16383(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -112) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ans", name = "q", descriptor = "()V", line = 19)
	public void method16384() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -51) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ans", name = "y", descriptor = "()V", line = 19)
	public void method16385() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -80) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ans", name = "x", descriptor = "()V", line = 19)
	public void method16386() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -4) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ans", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ans", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ans", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ans", name = "s", descriptor = "(I)I", line = 35)
	public int method16387(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ans", name = "b", descriptor = "()I", line = 35)
	public int method16388() {
		return this.anInt2379 * 960141055;
	}
}
