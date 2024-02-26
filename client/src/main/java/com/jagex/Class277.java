package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
final class Class277 implements Interface43 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fw", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_11;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "(B)[Lclient!ni;")
	public static Class438[] method26827(@OriginalArg(0) byte arg0) {
		return new Class438[] { Class438.aClass438_12, Class438.aClass438_2, Class438.aClass438_3, Class438.aClass438_5, Class438.aClass438_9, Class438.aClass438_6, Class438.aClass438_4, Class438.aClass438_8, Class438.aClass438_1, Class438.aClass438_10, Class438.aClass438_7, Class438.aClass438_11, Class438.aClass438_13, Class438.aClass438_14, Class438.aClass438_15 };
	}

	@OriginalMember(owner = "client!fw", name = "ps", descriptor = "(Lclient!yp;I)V")
	static void method26828(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class608.method32187(local11, local14, arg0, 766364935);
	}

	@OriginalMember(owner = "client!fw", name = "vh", descriptor = "(Lclient!yp;B)V")
	static void method26829(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_107, client.aClass75_1.aClass22_1, -191270971);
		client.aClass75_1.method1325(local5, (byte) -123);
	}

	@OriginalMember(owner = "client!fw", name = "wi", descriptor = "(Lclient!yp;I)V")
	static void method26830(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class672.aClass134_1.method10433(local12, 1270109611);
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class277(@OriginalArg(0) Class263 arg0) {
		this.aClass263_11 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "(I)F")
	@Override
	public float method26841(@OriginalArg(0) int arg0) {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) 27) / 255.0F;
	}

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "()F")
	@Override
	public float method26840() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) -57) / 255.0F;
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "()F")
	@Override
	public float method26842() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) 51) / 255.0F;
	}

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "()F")
	@Override
	public float method26844() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) 28) / 255.0F;
	}

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "()F")
	@Override
	public float method26843() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) 58) / 255.0F;
	}
}
