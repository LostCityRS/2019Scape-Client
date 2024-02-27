package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amp")
public final class Class166_Sub16 extends Class166 {

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "I")
	static final int anInt2169 = 1;

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "I")
	static final int anInt2170 = 0;

	@OriginalMember(owner = "client!amp", name = "u", descriptor = "I")
	static final int anInt2171 = 3;

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub16(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amp", name = "h", descriptor = "()I")
	public int method15700() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "s", descriptor = "(B)I")
	public int method15701(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "o", descriptor = "(S)V")
	public void method15702(@OriginalArg(0) short arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) 2) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amp", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amp", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "y", descriptor = "()V")
	public void method15703() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -42) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amp", name = "q", descriptor = "()I")
	public int method15704() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "x", descriptor = "()I")
	public int method15705() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "b", descriptor = "()I")
	public int method15706() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amp", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}
}
