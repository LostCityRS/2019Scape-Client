package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anj")
public class Class166_Sub33 extends Class166 {

	@OriginalMember(owner = "client!anj", name = "l", descriptor = "I")
	public static final int anInt2285 = 0;

	@OriginalMember(owner = "client!anj", name = "w", descriptor = "I")
	public static final int anInt2286 = 1;

	@OriginalMember(owner = "client!anj", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub33(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anj", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anj", name = "o", descriptor = "(B)V", line = 19)
	public void method16178(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -118) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anj", name = "q", descriptor = "()V", line = 19)
	public void method16179() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) 5) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anj", name = "y", descriptor = "()V", line = 19)
	public void method16180() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) 39) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anj", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anj", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anj", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anj", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anj", name = "x", descriptor = "()I", line = 35)
	public int method16181() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anj", name = "s", descriptor = "(I)I", line = 35)
	public int method16182(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}
