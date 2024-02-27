package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amu")
public final class Class166_Sub21 extends Class166 {

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "I")
	public static final int anInt2203 = 0;

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "I")
	public static final int anInt2204 = 1;

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub21(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "()Z")
	public boolean method15810() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "(I)Z")
	public boolean method15811(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "o", descriptor = "(I)V")
	public void method15812(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) -28) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amu", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "b", descriptor = "()Z")
	public boolean method15813() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "i", descriptor = "()I")
	public int method15814() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "q", descriptor = "()V")
	public void method15815() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) 37) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amu", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "h", descriptor = "()Z")
	public boolean method15816() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "a", descriptor = "()I")
	public int method15817() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "()I")
	public int method15818() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "y", descriptor = "(I)I")
	public int method15819(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}
