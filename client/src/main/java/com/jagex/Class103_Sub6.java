package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agb")
public final class Class103_Sub6 extends Class103 {

	@OriginalMember(owner = "client!agb", name = "f", descriptor = "Ljava/lang/String;")
	final String aString27;

	@OriginalMember(owner = "client!agb", name = "e", descriptor = "I")
	final int anInt924;

	@OriginalMember(owner = "client!agb", name = "ayt", descriptor = "(Lclient!yp;I)V")
	static void method7834(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class107_Sub2.anInt864 * -1988671257;
	}

	@OriginalMember(owner = "client!agb", name = "i", descriptor = "(II)V")
	public static void method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22078(481179460);
	}

	@OriginalMember(owner = "client!agb", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub6(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.aString27 = arg0.method23376((short) 1758);
		this.anInt924 = arg0.method23178((byte) -74) * 2041257597;
	}

	@OriginalMember(owner = "client!agb", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		if (client.anInt3461 * 1675806989 != -1) {
			Class599.method32044(client.anInt3461 * 1675806989, this.aString27, this.anInt924 * -123352363, 1417447107);
		}
	}

	@OriginalMember(owner = "client!agb", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		if (client.anInt3461 * 1675806989 != -1) {
			Class599.method32044(client.anInt3461 * 1675806989, this.aString27, this.anInt924 * -123352363, -2100509145);
		}
	}

	@OriginalMember(owner = "client!agb", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		if (client.anInt3461 * 1675806989 != -1) {
			Class599.method32044(client.anInt3461 * 1675806989, this.aString27, this.anInt924 * -123352363, 582510361);
		}
	}
}
