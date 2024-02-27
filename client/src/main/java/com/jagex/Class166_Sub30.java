package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anf")
public final class Class166_Sub30 extends Class166 {

	@OriginalMember(owner = "client!anf", name = "w", descriptor = "I")
	static final int anInt2265 = 5;

	@OriginalMember(owner = "client!anf", name = "l", descriptor = "I")
	static final int anInt2266 = 300;

	@OriginalMember(owner = "client!anf", name = "u", descriptor = "I")
	static final int anInt2267 = 70;

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub30(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anf", name = "o", descriptor = "(I)V")
	public void method16097(@OriginalArg(0) int arg0) {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "b", descriptor = "()I")
	public int method16098() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anf", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "s", descriptor = "(I)I")
	public int method16099(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anf", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "y", descriptor = "()V")
	public void method16100() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "q", descriptor = "()V")
	public void method16101() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "x", descriptor = "()I")
	public int method16102() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anf", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 70;
	}
}
