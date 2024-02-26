package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class295 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gp", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_11;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	final int anInt3953;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	final int anInt3952;

	@OriginalMember(owner = "client!gp", name = "aby", descriptor = "(Lclient!yp;B)V")
	static void method26969(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.aString148 == null || local12 >= Class274.anInt3924 * -912877411) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class14.aClass164Array1[local12].aString64;
		}
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class295(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_11 = arg0;
		this.anInt3953 = arg1.method23178((byte) -91) * 767574621;
		this.anInt3952 = arg1.method23362(-1875038013) * -1078688013;
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27147(this.anInt3953 * -1240161803, this.anInt3952 * -1173552581, (short) 200);
		arg0.method27140(this.anInt3953 * -1240161803, -133145100).method27103((byte) -36);
	}

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27147(this.anInt3953 * -1240161803, this.anInt3952 * -1173552581, (short) 200);
		arg0.method27140(this.anInt3953 * -1240161803, -918327206).method27103((byte) -59);
	}
}
