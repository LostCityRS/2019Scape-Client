package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afn")
public class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!afn", name = "n", descriptor = "I")
	final int anInt810;

	@OriginalMember(owner = "client!afn", name = "m", descriptor = "I")
	final int anInt809;

	@OriginalMember(owner = "client!afn", name = "<init>", descriptor = "(Lclient!alw;)V", line = 10)
	Class110_Sub2(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt810 = arg0.g2(-1434290800) * 591189867;
		this.anInt809 = arg0.g2(-1434290800) * 1021066527;
	}

	@OriginalMember(owner = "client!afn", name = "f", descriptor = "()V", line = 16)
	@Override
	public void method20150() {
		Class249.aClass239Array1[this.anInt810 * -1650090685].method25813(-1446974014).method19953(this.anInt809 * 373227231, true, 438634515);
	}

	@OriginalMember(owner = "client!afn", name = "n", descriptor = "(I)V", line = 16)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt810 * -1650090685].method25813(72566524).method19953(this.anInt809 * 373227231, true, 474115672);
	}
}
