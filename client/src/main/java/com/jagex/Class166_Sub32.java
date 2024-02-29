package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anh")
public class Class166_Sub32 extends Class166 {

	@OriginalMember(owner = "client!anh", name = "w", descriptor = "I")
	static final int anInt2278 = -3;

	@OriginalMember(owner = "client!anh", name = "l", descriptor = "I")
	static final int anInt2279 = -2;

	@OriginalMember(owner = "client!anh", name = "ak", descriptor = "I")
	static int anInt2280;

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub32(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anh", name = "o", descriptor = "(I)V", line = 19)
	public void method16132(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16545((byte) -39) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "q", descriptor = "()V", line = 19)
	public void method16133() {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16545((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "y", descriptor = "()V", line = 19)
	public void method16134() {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16545((byte) -33) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "h", descriptor = "()I", line = 35)
	public int method16135() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "s", descriptor = "(I)I", line = 35)
	public int method16136(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "x", descriptor = "()I", line = 35)
	public int method16137() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "b", descriptor = "()I", line = 35)
	public int method16138() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "a", descriptor = "()I", line = 35)
	public int method16139() {
		return this.anInt2379 * 960141055;
	}
}
