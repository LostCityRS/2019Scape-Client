package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqm")
public final class Class110_Sub15_Sub1 extends Class110_Sub15 {

	@OriginalMember(owner = "client!aqm", name = "f", descriptor = "I")
	final int anInt2817;

	@OriginalMember(owner = "client!aqm", name = "w", descriptor = "I")
	final int anInt2818;

	@OriginalMember(owner = "client!aqm", name = "l", descriptor = "I")
	final int anInt2819;

	@OriginalMember(owner = "client!aqm", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub15_Sub1(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt2817 = arg0.method22427(-1434290800) * -411027197;
		this.anInt2818 = arg0.method22425((short) 16384) * -1021406375;
		this.anInt2819 = arg0.method22427(-1434290800) * -1724177145;
	}

	@OriginalMember(owner = "client!aqm", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt2817 * -2036139605].method25900(-204794029).method20022(this.anInt2821 * 1307909245, this.anInt2823 * -1630065793 << 16, this.anInt2822 * 187367639, this.anInt2819 * 61421751, false, this.anInt2818 * 578979049, (byte) -80);
	}

	@OriginalMember(owner = "client!aqm", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class249.aClass239Array1[this.anInt2817 * -2036139605].method25900(-2095819908).method20022(this.anInt2821 * 1307909245, this.anInt2823 * -1630065793 << 16, this.anInt2822 * 187367639, this.anInt2819 * 61421751, false, this.anInt2818 * 578979049, (byte) -89);
	}
}
