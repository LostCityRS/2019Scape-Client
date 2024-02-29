package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amv")
public class Class166_Sub22 extends Class166 {

	@OriginalMember(owner = "client!amv", name = "l", descriptor = "I")
	static final int anInt2209 = 2;

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "I")
	static final int anInt2210 = 3;

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "I")
	static final int anInt2211 = 0;

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub22(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amv", name = "y", descriptor = "()V", line = 20)
	public void method15822() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16545((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amv", name = "o", descriptor = "(B)V", line = 20)
	public void method15823(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16545((byte) -127) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amv", name = "q", descriptor = "()V", line = 20)
	public void method15824() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16545((byte) -127) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amv", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "s", descriptor = "(I)I", line = 36)
	public int method15825(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}
