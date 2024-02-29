package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anm")
public class Class166_Sub36 extends Class166 {

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "I")
	public static final int anInt2307 = 1;

	@OriginalMember(owner = "client!anm", name = "w", descriptor = "I")
	public static final int anInt2308 = 0;

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "I")
	static final int anInt2309 = 2;

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub36(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anm", name = "o", descriptor = "(I)V", line = 21)
	public void method16244(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14371((byte) 82) == Class702.aClass702_5) {
			this.anInt2379 = -177679874;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -21) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anm", name = "y", descriptor = "()V", line = 21)
	public void method16245() {
		if (this.aClass93_Sub36_49.method14371((byte) 63) == Class702.aClass702_5) {
			this.anInt2379 = -177679874;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -41) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anm", name = "f", descriptor = "()I", line = 26)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "()I", line = 26)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "e", descriptor = "(B)I", line = 26)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "()I", line = 26)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "n", descriptor = "(II)I", line = 30)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "p", descriptor = "(I)I", line = 30)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "k", descriptor = "(II)V", line = 34)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "c", descriptor = "(I)V", line = 34)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "s", descriptor = "(B)I", line = 38)
	public int method16246(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "b", descriptor = "()I", line = 38)
	public int method16247() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "q", descriptor = "()I", line = 38)
	public int method16248() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "x", descriptor = "()I", line = 38)
	public int method16249() {
		return this.anInt2379 * 960141055;
	}
}
