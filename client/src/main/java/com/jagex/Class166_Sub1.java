package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ama")
public class Class166_Sub1 extends Class166 {

	@OriginalMember(owner = "client!ama", name = "h", descriptor = "[Lclient!hq;")
	public static Class320[] aClass320Array1;

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(Lclient!ali;)V", line = 9)
	public Class166_Sub1(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(ILclient!ali;)V", line = 13)
	public Class166_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ama", name = "b", descriptor = "()V", line = 17)
	public void method15350() {
		if (this.anInt2379 * 960141055 < Class345.aClass345_3.getId() || this.anInt2379 * 960141055 > Class345.aClass345_2.getId()) {
			this.anInt2379 = this.method16545((byte) 8) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ama", name = "y", descriptor = "()V", line = 17)
	public void method15351() {
		if (this.anInt2379 * 960141055 < Class345.aClass345_3.getId() || this.anInt2379 * 960141055 > Class345.aClass345_2.getId()) {
			this.anInt2379 = this.method16545((byte) 8) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ama", name = "o", descriptor = "(I)V", line = 17)
	public void method15352(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < Class345.aClass345_3.getId() || this.anInt2379 * 960141055 > Class345.aClass345_2.getId()) {
			this.anInt2379 = this.method16545((byte) 33) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ama", name = "x", descriptor = "()V", line = 17)
	public void method15353() {
		if (this.anInt2379 * 960141055 < Class345.aClass345_3.getId() || this.anInt2379 * 960141055 > Class345.aClass345_2.getId()) {
			this.anInt2379 = this.method16545((byte) -20) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ama", name = "q", descriptor = "()V", line = 17)
	public void method15354() {
		if (this.anInt2379 * 960141055 < Class345.aClass345_3.getId() || this.anInt2379 * 960141055 > Class345.aClass345_2.getId()) {
			this.anInt2379 = this.method16545((byte) -1) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ama", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return Class345.aClass345_3.getId();
	}

	@OriginalMember(owner = "client!ama", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return Class345.aClass345_3.getId();
	}

	@OriginalMember(owner = "client!ama", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return Class345.aClass345_3.getId();
	}

	@OriginalMember(owner = "client!ama", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return Class345.aClass345_3.getId();
	}

	@OriginalMember(owner = "client!ama", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return Class345.aClass345_3.getId();
	}

	@OriginalMember(owner = "client!ama", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ama", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ama", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ama", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ama", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ama", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ama", name = "s", descriptor = "(I)I", line = 35)
	public int method15355(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ama", name = "h", descriptor = "()I", line = 35)
	public int method15356() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "()I", line = 35)
	public int method15357() {
		return this.anInt2379 * 960141055;
	}
}
