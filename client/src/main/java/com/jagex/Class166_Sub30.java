package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anf")
public class Class166_Sub30 extends Class166 {

	@OriginalMember(owner = "client!anf", name = "w", descriptor = "I")
	static final int anInt2265 = 5;

	@OriginalMember(owner = "client!anf", name = "l", descriptor = "I")
	static final int anInt2266 = 300;

	@OriginalMember(owner = "client!anf", name = "u", descriptor = "I")
	static final int anInt2267 = 70;

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub30(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "o", descriptor = "(I)V", line = 20)
	public void method16085(@OriginalArg(0) int arg0) {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "y", descriptor = "()V", line = 20)
	public void method16086() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "q", descriptor = "()V", line = 20)
	public void method16087() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 70;
	}

	@OriginalMember(owner = "client!anf", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anf", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anf", name = "b", descriptor = "()I", line = 36)
	public int method16088() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anf", name = "s", descriptor = "(I)I", line = 36)
	public int method16089(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anf", name = "x", descriptor = "()I", line = 36)
	public int method16090() {
		return this.anInt2379 * 960141055;
	}
}
