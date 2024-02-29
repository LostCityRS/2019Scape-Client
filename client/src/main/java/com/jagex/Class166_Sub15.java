package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amo")
public class Class166_Sub15 extends Class166 {

	@OriginalMember(owner = "client!amo", name = "l", descriptor = "I")
	public static final int anInt2161 = 1;

	@OriginalMember(owner = "client!amo", name = "w", descriptor = "I")
	public static final int anInt2162 = 0;

	@OriginalMember(owner = "client!amo", name = "u", descriptor = "I")
	public static final int anInt2163 = 2;

	@OriginalMember(owner = "client!amo", name = "z", descriptor = "I")
	public static final int anInt2164 = 3;

	@OriginalMember(owner = "client!amo", name = "fv", descriptor = "Lclient!py;")
	public static Class497 aClass497_59;

	@OriginalMember(owner = "client!amo", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub15(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amo", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amo", name = "o", descriptor = "(I)V", line = 21)
	public void method15672(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.aClass166_Sub26_1.method15913((byte) 48) == 2 && this.anInt2379 * 960141055 == 2) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) -74) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amo", name = "e", descriptor = "(B)I", line = 26)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amo", name = "u", descriptor = "()I", line = 26)
	@Override
	int method16550() {
		return 2;
	}

	@OriginalMember(owner = "client!amo", name = "f", descriptor = "()I", line = 26)
	@Override
	int method16544() {
		return 2;
	}

	@OriginalMember(owner = "client!amo", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16552() {
		return 2;
	}

	@OriginalMember(owner = "client!amo", name = "l", descriptor = "()I", line = 26)
	@Override
	int method16549() {
		return 2;
	}

	@OriginalMember(owner = "client!amo", name = "p", descriptor = "(I)I", line = 30)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "n", descriptor = "(II)I", line = 30)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "k", descriptor = "(II)V", line = 34)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amo", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amo", name = "c", descriptor = "(I)V", line = 34)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amo", name = "s", descriptor = "(I)I", line = 38)
	public int method15673(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}
