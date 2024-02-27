package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anq")
public final class Class166_Sub39 extends Class166 {

	@OriginalMember(owner = "client!anq", name = "w", descriptor = "I")
	static final int anInt2326 = 2;

	@OriginalMember(owner = "client!anq", name = "l", descriptor = "I")
	public static final int anInt2327 = 0;

	@OriginalMember(owner = "client!anq", name = "al", descriptor = "I")
	static int anInt2328;

	@OriginalMember(owner = "client!anq", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anq", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub39(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anq", name = "o", descriptor = "(B)V")
	public void method16353(@OriginalArg(0) byte arg0) {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15437(-1976597121) && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 112), 1318369364)) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -33) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anq", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 80), 1852548080) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "s", descriptor = "(I)Z")
	public boolean method16354(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 74), -1803583866);
	}

	@OriginalMember(owner = "client!anq", name = "k", descriptor = "(II)V")
	@Override
	public void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 91), 725654255) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 60), -971472745) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "y", descriptor = "(I)I")
	public int method16355(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anq", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "x", descriptor = "()Z")
	public boolean method16356() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 76), -1783170618);
	}

	@OriginalMember(owner = "client!anq", name = "q", descriptor = "()V")
	public void method16357() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15437(-343545763) && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 83), 1982732690)) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -51) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anq", name = "c", descriptor = "(I)V")
	@Override
	public void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "d", descriptor = "(I)V")
	@Override
	public void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "b", descriptor = "()I")
	public int method16358() {
		return this.anInt2379 * 960141055;
	}
}
