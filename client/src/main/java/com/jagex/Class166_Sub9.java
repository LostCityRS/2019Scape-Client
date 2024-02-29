package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ami")
public class Class166_Sub9 extends Class166 {

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "I")
	static final int anInt2122 = 0;

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "I")
	static final int anInt2123 = 3;

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "I")
	static final int anInt2124 = 1;

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "I")
	static final int anInt2125 = -1;

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub9(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ami", name = "y", descriptor = "()V", line = 21)
	public void method15548() {
		if (!this.aClass93_Sub36_49.method14378(-2118289122).method149(1525736280)) {
			this.anInt2379 = this.method16545((byte) -72) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) -64) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "q", descriptor = "()V", line = 21)
	public void method15549() {
		if (!this.aClass93_Sub36_49.method14378(79134665).method149(-794507870)) {
			this.anInt2379 = this.method16545((byte) 17) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) -47) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "o", descriptor = "(I)V", line = 21)
	public void method15550(@OriginalArg(0) int arg0) {
		if (!this.aClass93_Sub36_49.method14378(1208262117).method149(1717219492)) {
			this.anInt2379 = this.method16545((byte) 14) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) -39) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "f", descriptor = "()I", line = 32)
	@Override
	int method16544() {
		return this.aClass93_Sub36_49.method14378(-1628365376).method149(1762313981) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "e", descriptor = "(B)I", line = 32)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14378(285228330).method149(-617658522) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "()I", line = 32)
	@Override
	int method16552() {
		return this.aClass93_Sub36_49.method14378(-1773170871).method149(1295217357) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "()I", line = 32)
	@Override
	int method16549() {
		return this.aClass93_Sub36_49.method14378(-218215329).method149(-1874293544) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "()I", line = 32)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14378(-506881339).method149(597821288) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "n", descriptor = "(II)I", line = 41)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "(I)I", line = 41)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "p", descriptor = "(I)I", line = 41)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "k", descriptor = "(II)V", line = 45)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "d", descriptor = "(I)V", line = 45)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "c", descriptor = "(I)V", line = 45)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(I)I", line = 49)
	public int method15551(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "()I", line = 49)
	public int method15552() {
		return this.anInt2379 * 960141055;
	}
}
