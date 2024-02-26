package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class300 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gu", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_14;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
	final int anInt3964;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	final int anInt3963;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "(II)Z")
	static boolean method27030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= Class607.aClass607_24.anInt5396 * 1323580581 && arg0 <= Class607.aClass607_7.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!gu", name = "fw", descriptor = "(Lclient!yp;I)V")
	static void method27031(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2119964923);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class493.method30272(local16, local22, arg0, (byte) -13);
	}

	@OriginalMember(owner = "client!gu", name = "avg", descriptor = "(Lclient!yp;I)V")
	static void method27032(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class300(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_14 = arg0;
		this.anInt3964 = arg1.g2() * 198383837;
		this.anInt3963 = arg1.g2() * 1650234719;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27148(this.anInt3964 * -789545099, this.anInt3963 * 1549862559, (byte) -33);
		arg0.method27140(this.anInt3964 * -789545099, 883412849).method27103((byte) -110);
	}

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27148(this.anInt3964 * -789545099, this.anInt3963 * 1549862559, (byte) -111);
		arg0.method27140(this.anInt3964 * -789545099, 780030562).method27103((byte) -114);
	}
}
