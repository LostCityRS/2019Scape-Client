package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amc")
public class Class166_Sub3 extends Class166 {

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "I")
	public static final int anInt2087 = 0;

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "I")
	public static final int anInt2088 = 1;

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub3(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amc", name = "q", descriptor = "()V", line = 20)
	public void method15400() {
		if (this.aClass93_Sub36_49.method14371((byte) 25) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) -61) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amc", name = "o", descriptor = "(S)V", line = 20)
	public void method15401(@OriginalArg(0) short arg0) {
		if (this.aClass93_Sub36_49.method14371((byte) 11) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) -48) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amc", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "s", descriptor = "(B)Z", line = 29)
	public boolean method15402(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 99) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "x", descriptor = "()Z", line = 29)
	public boolean method15403() {
		return this.aClass93_Sub36_49.method14371((byte) 16) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "b", descriptor = "()Z", line = 29)
	public boolean method15404() {
		return this.aClass93_Sub36_49.method14371((byte) 16) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass93_Sub36_49.method14371((byte) 36) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 75) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 69) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "k", descriptor = "(II)V", line = 39)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "c", descriptor = "(I)V", line = 39)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "y", descriptor = "(I)I", line = 43)
	public int method15405(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amc", name = "h", descriptor = "()I", line = 43)
	public int method15406() {
		return this.anInt2379 * 960141055;
	}

}
