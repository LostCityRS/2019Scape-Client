package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amj")
public final class Class166_Sub10 extends Class166 {

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "I")
	static final int anInt2130 = 0;

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "I")
	static final int anInt2131 = 1;

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub10(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amj", name = "o", descriptor = "(B)V")
	public void method15579(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -82) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "(B)I")
	public int method15580(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amj", name = "q", descriptor = "()V")
	public void method15581() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -96) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amj", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "y", descriptor = "()V")
	public void method15582() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -85) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "x", descriptor = "()V")
	public void method15583() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) 1) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amj", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amj", name = "b", descriptor = "()I")
	public int method15584() {
		return this.anInt2379 * 960141055;
	}
}
