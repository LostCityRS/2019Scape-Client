package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ame")
public class Class166_Sub5 extends Class166 {

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "I")
	static final int anInt2097 = 200;

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "I")
	static final int anInt2098 = 100;

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "I")
	static final int anInt2099 = 33;

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub5(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ame", name = "q", descriptor = "()V", line = 20)
	public void method15451() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16545((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "o", descriptor = "(B)V", line = 20)
	public void method15452(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16545((byte) -32) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "y", descriptor = "()V", line = 20)
	public void method15453() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16545((byte) 27) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ame", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ame", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ame", name = "s", descriptor = "(B)I", line = 36)
	public int method15454(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "h", descriptor = "()I", line = 36)
	public int method15455() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "x", descriptor = "()I", line = 36)
	public int method15456() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "b", descriptor = "()I", line = 36)
	public int method15457() {
		return this.anInt2379 * 960141055;
	}
}
