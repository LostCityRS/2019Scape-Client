package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afr")
public abstract class Class108_Sub2 extends Class108 {

	@OriginalMember(owner = "client!afr", name = "ej", descriptor = "Lclient!pz;")
	public static Class139 aClass139_8;

	@OriginalMember(owner = "client!afr", name = "tz", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method24060(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(27) int local27 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581] - 1;
		if (arg0.anInt4136 * -1322281851 != 2) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 5) {
			Class443.method29211(arg0, local27, local12, (short) 255);
			Class296.method26998(arg0, 720819563);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!afr", name = "ans", descriptor = "(Lclient!yp;B)V")
	static void method24061(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class368.anInt4502 * -1583611537 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!afr", name = "<init>", descriptor = "()V")
	Class108_Sub2() {
	}

	@OriginalMember(owner = "client!afr", name = "d", descriptor = "(II)V")
	abstract void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afr", name = "q", descriptor = "()I")
	public abstract int method24053();

	@OriginalMember(owner = "client!afr", name = "n", descriptor = "(II)I")
	public abstract int method24054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afr", name = "z", descriptor = "(II)V")
	abstract void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afr", name = "p", descriptor = "()I")
	public abstract int method24056();

	@OriginalMember(owner = "client!afr", name = "v", descriptor = "()I")
	public abstract int method24057();

	@OriginalMember(owner = "client!afr", name = "y", descriptor = "(II)I")
	public abstract int method24058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!afr", name = "h", descriptor = "(II)I")
	public abstract int method24059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
