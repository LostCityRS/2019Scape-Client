package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amp")
public class Class166_Sub16 extends Class166 {

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "I")
	static final int anInt2169 = 1;

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "I")
	static final int anInt2170 = 0;

	@OriginalMember(owner = "client!amp", name = "u", descriptor = "I")
	static final int anInt2171 = 3;

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub16(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amp", name = "o", descriptor = "(S)V", line = 20)
	public void method15688(@OriginalArg(0) short arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) 2) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amp", name = "y", descriptor = "()V", line = 20)
	public void method15689() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) -42) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "h", descriptor = "()I", line = 36)
	public int method15690() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "s", descriptor = "(B)I", line = 36)
	public int method15691(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "q", descriptor = "()I", line = 36)
	public int method15692() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "x", descriptor = "()I", line = 36)
	public int method15693() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "b", descriptor = "()I", line = 36)
	public int method15694() {
		return this.anInt2379 * 960141055;
	}
}
