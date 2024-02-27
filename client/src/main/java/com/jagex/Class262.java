package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class262 implements Interface26 {

	@OriginalMember(owner = "client!ff", name = "mv", descriptor = "I")
	public static int anInt3902;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ff", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_1;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	final int anInt3901;

	@OriginalMember(owner = "client!ff", name = "hl", descriptor = "(Lclient!yp;I)V")
	static void method26506(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class599.method32045(local11, local14, arg0, (byte) 14);
	}

	@OriginalMember(owner = "client!ff", name = "rd", descriptor = "(Lclient!yp;I)V")
	static void method26507(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4112 * -2019977469;
	}

	@OriginalMember(owner = "client!ff", name = "we", descriptor = "(Lclient!yp;I)V")
	static void method26508(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.currentCycle;
	}

	@OriginalMember(owner = "client!ff", name = "xs", descriptor = "(Lclient!yp;I)V")
	static void method26509(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ff", name = "ahm", descriptor = "(Lclient!yp;B)V")
	static void method26510(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class348.method27986((byte) 102);
	}

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "(Lclient!ald;I)Lclient!ka;")
	public static Class373 method26511(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g4();
		return new Class373(local3);
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class262(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_1 = arg0;
		this.anInt3901 = arg1.g2() * 734320303;
	}

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class302 local7 = arg0.method27140(this.anInt3901 * -431341489, -332095737);
		local7.method27103((byte) -26);
		local7.method27075(520532160);
		arg0.method27196(this.anInt3901 * -431341489, -1834389850);
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		@Pc(7) Class302 local7 = arg0.method27140(this.anInt3901 * -431341489, -1991600285);
		local7.method27103((byte) -25);
		local7.method27075(1570961914);
		arg0.method27196(this.anInt3901 * -431341489, 1000629353);
	}
}
