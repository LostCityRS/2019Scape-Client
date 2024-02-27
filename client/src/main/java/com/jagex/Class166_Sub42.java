package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ant")
public final class Class166_Sub42 extends Class166 {

	@OriginalMember(owner = "client!ant", name = "w", descriptor = "I")
	public static final int anInt2348 = 0;

	@OriginalMember(owner = "client!ant", name = "l", descriptor = "I")
	static final int anInt2349 = 1;

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub42(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ant", name = "o", descriptor = "(B)V")
	public void method16415(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 15) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ant", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ant", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "s", descriptor = "(I)I")
	public int method16416(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ant", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ant", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ant", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ant", name = "q", descriptor = "()V")
	public void method16417() {
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -118) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ant", name = "y", descriptor = "()V")
	public void method16418() {
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) -26) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ant", name = "x", descriptor = "()I")
	public int method16419() {
		return this.anInt2379 * 960141055;
	}
}
