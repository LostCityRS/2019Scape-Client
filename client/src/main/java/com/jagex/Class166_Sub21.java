package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amu")
public class Class166_Sub21 extends Class166 {

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "I")
	public static final int anInt2203 = 0;

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "I")
	public static final int anInt2204 = 1;

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub21(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amu", name = "o", descriptor = "(I)V", line = 19)
	public void method15798(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -28) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amu", name = "q", descriptor = "()V", line = 19)
	public void method15799() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) 37) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "()Z", line = 27)
	public boolean method15800() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "(I)Z", line = 27)
	public boolean method15801(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "b", descriptor = "()Z", line = 27)
	public boolean method15802() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "h", descriptor = "()Z", line = 27)
	public boolean method15803() {
		return true;
	}

	@OriginalMember(owner = "client!amu", name = "n", descriptor = "(II)I", line = 31)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "p", descriptor = "(I)I", line = 31)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "k", descriptor = "(II)V", line = 35)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "c", descriptor = "(I)V", line = 35)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amu", name = "i", descriptor = "()I", line = 39)
	public int method15804() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "a", descriptor = "()I", line = 39)
	public int method15805() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "()I", line = 39)
	public int method15806() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amu", name = "y", descriptor = "(I)I", line = 39)
	public int method15807(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}
