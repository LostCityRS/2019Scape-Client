package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqm")
public class Class110_Sub15_Sub1 extends Class110_Sub15 {

	@OriginalMember(owner = "client!aqm", name = "f", descriptor = "I")
	final int anInt2817;

	@OriginalMember(owner = "client!aqm", name = "w", descriptor = "I")
	final int anInt2818;

	@OriginalMember(owner = "client!aqm", name = "l", descriptor = "I")
	final int anInt2819;

	@OriginalMember(owner = "client!aqm", name = "<init>", descriptor = "(Lclient!alw;)V", line = 11)
	Class110_Sub15_Sub1(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt2817 = arg0.g2(-1434290800) * -411027197;
		this.anInt2818 = arg0.g1((short) 16384) * -1021406375;
		this.anInt2819 = arg0.g2(-1434290800) * -1724177145;
	}

	@OriginalMember(owner = "client!aqm", name = "n", descriptor = "(I)V", line = 18)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt2817 * -2036139605].method25813(-204794029).method19967(this.anInt2821 * 1307909245, this.anInt2823 * -1630065793 << 16, this.anInt2822 * 187367639, this.anInt2819 * 61421751, false, this.anInt2818 * 578979049, (byte) -80);
	}

	@OriginalMember(owner = "client!aqm", name = "f", descriptor = "()V", line = 18)
	@Override
	public void method20150() {
		Class249.aClass239Array1[this.anInt2817 * -2036139605].method25813(-2095819908).method19967(this.anInt2821 * 1307909245, this.anInt2823 * -1630065793 << 16, this.anInt2822 * 187367639, this.anInt2819 * 61421751, false, this.anInt2818 * 578979049, (byte) -89);
	}
}
