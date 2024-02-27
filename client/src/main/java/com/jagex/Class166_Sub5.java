package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ame")
public final class Class166_Sub5 extends Class166 {

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "I")
	static final int anInt2097 = 200;

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "I")
	static final int anInt2098 = 100;

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "I")
	static final int anInt2099 = 33;

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub5(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ame", name = "s", descriptor = "(B)I")
	public int method15463(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "q", descriptor = "()V")
	public void method15464() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16554((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "o", descriptor = "(B)V")
	public void method15465(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16554((byte) -32) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 100;
	}

	@OriginalMember(owner = "client!ame", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "y", descriptor = "()V")
	public void method15466() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 200) {
			this.anInt2379 = this.method16554((byte) 27) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ame", name = "h", descriptor = "()I")
	public int method15467() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ame", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ame", name = "x", descriptor = "()I")
	public int method15468() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "b", descriptor = "()I")
	public int method15469() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ame", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}
}
