package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zf")
public abstract class Class166 {

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "I")
	protected static final int anInt2377 = 1;

	@OriginalMember(owner = "client!zf", name = "n", descriptor = "I")
	protected static final int anInt2378 = 2;

	@OriginalMember(owner = "client!zf", name = "m", descriptor = "I")
	public static final int anInt2380 = 3;

	@OriginalMember(owner = "client!zf", name = "k", descriptor = "Lclient!ali;")
	protected Class93_Sub36 aClass93_Sub36_49;

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "I")
	protected int anInt2379;

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(Lclient!ali;)V")
	Class166(@OriginalArg(0) Class93_Sub36 arg0) {
		this.aClass93_Sub36_49 = arg0;
		this.anInt2379 = this.method16554((byte) -71) * -88839937;
	}

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(ILclient!ali;)V")
	Class166(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		this.anInt2379 = arg0 * -88839937;
		this.aClass93_Sub36_49 = arg1;
	}

	@OriginalMember(owner = "client!zf", name = "p", descriptor = "(I)I")
	abstract int method16552(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "()I")
	abstract int method16553();

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "(B)I")
	abstract int method16554(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!zf", name = "n", descriptor = "(II)I")
	abstract int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!zf", name = "m", descriptor = "(IB)V")
	final void method16556(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.method16555(arg0, 2052181945) != 3) {
			this.method16557(arg0, -990334654);
		}
	}

	@OriginalMember(owner = "client!zf", name = "k", descriptor = "(II)V")
	abstract void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!zf", name = "d", descriptor = "(I)V")
	abstract void method16558(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "l", descriptor = "()I")
	abstract int method16559();

	@OriginalMember(owner = "client!zf", name = "u", descriptor = "()I")
	abstract int method16560();

	@OriginalMember(owner = "client!zf", name = "z", descriptor = "(I)I")
	abstract int method16561(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "w", descriptor = "()I")
	abstract int method16562();

	@OriginalMember(owner = "client!zf", name = "c", descriptor = "(I)V")
	abstract void method16563(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "r", descriptor = "(I)V")
	final void method16564(@OriginalArg(0) int arg0) {
		if (this.method16555(arg0, -960655971) != 3) {
			this.method16557(arg0, -1894117595);
		}
	}

	@OriginalMember(owner = "client!zf", name = "v", descriptor = "(I)V")
	final void method16565(@OriginalArg(0) int arg0) {
		if (this.method16555(arg0, 2087909472) != 3) {
			this.method16557(arg0, -1711150005);
		}
	}
}
