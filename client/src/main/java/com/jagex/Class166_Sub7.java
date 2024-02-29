package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amg")
public class Class166_Sub7 extends Class166 {

	@OriginalMember(owner = "client!amg", name = "<init>", descriptor = "(Lclient!ali;)V", line = 8)
	public Class166_Sub7(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amg", name = "<init>", descriptor = "(ILclient!ali;)V", line = 12)
	public Class166_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amg", name = "h", descriptor = "()V", line = 16)
	public void method15500() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -48) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "x", descriptor = "()V", line = 16)
	public void method15501() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 5) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "y", descriptor = "()V", line = 16)
	public void method15502() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -20) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "b", descriptor = "()V", line = 16)
	public void method15503() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 44) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "q", descriptor = "()V", line = 16)
	public void method15504() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -98) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "o", descriptor = "(I)V", line = 16)
	public void method15505(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -72) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amg", name = "e", descriptor = "(B)I", line = 20)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amg", name = "f", descriptor = "()I", line = 20)
	@Override
	int method16544() {
		return 3;
	}

	@OriginalMember(owner = "client!amg", name = "u", descriptor = "()I", line = 20)
	@Override
	int method16550() {
		return 3;
	}

	@OriginalMember(owner = "client!amg", name = "w", descriptor = "()I", line = 20)
	@Override
	int method16552() {
		return 3;
	}

	@OriginalMember(owner = "client!amg", name = "l", descriptor = "()I", line = 20)
	@Override
	int method16549() {
		return 3;
	}

	@OriginalMember(owner = "client!amg", name = "n", descriptor = "(II)I", line = 24)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amg", name = "z", descriptor = "(I)I", line = 24)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amg", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amg", name = "k", descriptor = "(II)V", line = 28)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amg", name = "c", descriptor = "(I)V", line = 28)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amg", name = "d", descriptor = "(I)V", line = 28)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amg", name = "s", descriptor = "(B)I", line = 32)
	public int method15506(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amg", name = "i", descriptor = "()I", line = 32)
	public int method15507() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amg", name = "j", descriptor = "()I", line = 32)
	public int method15508() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amg", name = "a", descriptor = "()I", line = 32)
	public int method15509() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amg", name = "g", descriptor = "()I", line = 32)
	public int method15510() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amg", name = "adg", descriptor = "(Lclient!yf;B)V", line = 10121)
	static final void method15511(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class166_Sub31.method16117(Class121.aClass93_Sub28_2 == arg0.aClass93_Sub28_4, local12, (byte) 52);
	}
}
