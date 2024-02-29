package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ann")
public class Class166_Sub37 extends Class166 {

	@OriginalMember(owner = "client!ann", name = "w", descriptor = "I")
	static final int anInt2314 = 100;

	@OriginalMember(owner = "client!ann", name = "u", descriptor = "I")
	static final int anInt2315 = 33;

	@OriginalMember(owner = "client!ann", name = "l", descriptor = "I")
	static final int anInt2316 = 400;

	@OriginalMember(owner = "client!ann", name = "j", descriptor = "[Lclient!cm;")
	static Class100[] aClass100Array5;

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub37(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ann", name = "y", descriptor = "()V", line = 20)
	public void method16264() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 400) {
			this.anInt2379 = this.method16545((byte) 25) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ann", name = "o", descriptor = "(B)V", line = 20)
	public void method16265(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 400) {
			this.anInt2379 = this.method16545((byte) -72) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ann", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "s", descriptor = "(I)I", line = 36)
	public int method16266(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ann", name = "q", descriptor = "()I", line = 36)
	public int method16267() {
		return this.anInt2379 * 960141055;
	}
}
