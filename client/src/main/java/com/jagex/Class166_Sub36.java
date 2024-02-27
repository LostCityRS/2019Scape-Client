package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anm")
public final class Class166_Sub36 extends Class166 {

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "I")
	public static final int anInt2307 = 1;

	@OriginalMember(owner = "client!anm", name = "w", descriptor = "I")
	public static final int anInt2308 = 0;

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "I")
	static final int anInt2309 = 2;

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub36(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anm", name = "o", descriptor = "(I)V")
	public void method16256(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14359((byte) 82) == Class702.aClass702_5) {
			this.anInt2379 = -177679874;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -21) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anm", name = "y", descriptor = "()V")
	public void method16257() {
		if (this.aClass93_Sub36_49.method14359((byte) 63) == Class702.aClass702_5) {
			this.anInt2379 = -177679874;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -41) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anm", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "s", descriptor = "(B)I")
	public int method16258(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "b", descriptor = "()I")
	public int method16259() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anm", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!anm", name = "q", descriptor = "()I")
	public int method16260() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "x", descriptor = "()I")
	public int method16261() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anm", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}
}
