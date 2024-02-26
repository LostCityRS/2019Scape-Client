package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alw")
public final class Class58_Sub1 extends Class58 implements Interface66 {

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "(B)[Lclient!ky;")
	public static Class391[] method15727(@OriginalArg(0) byte arg0) {
		return new Class391[] { Class391.aClass391_11, Class391.aClass391_12, Class391.aClass391_13 };
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(IIIIIIZZI)V")
	Class58_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		super(arg0, arg1, arg2 > 65535 ? 65535 : arg2, arg3, arg4 > 255 ? 255 : arg4, arg5, arg6, arg7, arg8 > 255 ? 255 : arg8);
	}

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "()V")
	@Override
	public void method32126() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_17, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt1(this.anInt2062 * 1536605899);
		local5.aPacketBit_2.p1_alt1(this.anInt2063 * 330793525);
		local5.aPacketBit_2.p4_alt3(this.anInt2068 * 788342471);
		local5.aPacketBit_2.p1_alt3(this.anInt2067 * -768944687);
		@Pc(51) int local51 = (this.aBoolean414 ? 2 : 0) | (this.aBoolean415 ? 1 : 0);
		local5.aPacketBit_2.p1_alt2(local51);
		local5.aPacketBit_2.p2(this.anInt2064 * 994954725);
		local5.aPacketBit_2.p4_alt2(this.anInt2065 * 1673997263);
		local5.aPacketBit_2.p1_alt1(this.anInt2066 * 1781315403);
		client.aClass75_1.method1325(local5, (byte) -112);
	}

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "(I)V")
	@Override
	public void method32127(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_17, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt1(this.anInt2062 * 1536605899);
		local5.aPacketBit_2.p1_alt1(this.anInt2063 * 330793525);
		local5.aPacketBit_2.p4_alt3(this.anInt2068 * 788342471);
		local5.aPacketBit_2.p1_alt3(this.anInt2067 * -768944687);
		@Pc(51) int local51 = (this.aBoolean414 ? 2 : 0) | (this.aBoolean415 ? 1 : 0);
		local5.aPacketBit_2.p1_alt2(local51);
		local5.aPacketBit_2.p2(this.anInt2064 * 994954725);
		local5.aPacketBit_2.p4_alt2(this.anInt2065 * 1673997263);
		local5.aPacketBit_2.p1_alt1(this.anInt2066 * 1781315403);
		client.aClass75_1.method1325(local5, (byte) -45);
	}

	@OriginalMember(owner = "client!alw", name = "e", descriptor = "()V")
	@Override
	public void method32128() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_17, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt1(this.anInt2062 * 1536605899);
		local5.aPacketBit_2.p1_alt1(this.anInt2063 * 330793525);
		local5.aPacketBit_2.p4_alt3(this.anInt2068 * 788342471);
		local5.aPacketBit_2.p1_alt3(this.anInt2067 * -768944687);
		@Pc(51) int local51 = (this.aBoolean414 ? 2 : 0) | (this.aBoolean415 ? 1 : 0);
		local5.aPacketBit_2.p1_alt2(local51);
		local5.aPacketBit_2.p2(this.anInt2064 * 994954725);
		local5.aPacketBit_2.p4_alt2(this.anInt2065 * 1673997263);
		local5.aPacketBit_2.p1_alt1(this.anInt2066 * 1781315403);
		client.aClass75_1.method1325(local5, (byte) -11);
	}
}
