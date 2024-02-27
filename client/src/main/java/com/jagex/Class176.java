package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!az")
public final class Class176 {

	@OriginalMember(owner = "client!az", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;II)Lclient!di;")
	public static Class102 method24655(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class102_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!az", name = "f", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;II)Lclient!di;")
	public static Class102 method24656(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class102_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!az", name = "nj", descriptor = "(Lclient!yp;I)V")
	static void method24657(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1996480446);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class360.method28148(local16, local22, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!az", name = "vd", descriptor = "(Lclient!yp;B)V")
	static void method24658(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(19) Class80_Sub31 local19 = Class623.method32440(Class443.aClass443_123, client.aClass75_1.aClass22_1, -191270971);
		local19.aPacketBit_2.p1(local13.length() + 1);
		local19.aPacketBit_2.pjstr(local13);
		client.aClass75_1.method1325(local19, (byte) -19);
	}

	@OriginalMember(owner = "client!az", name = "acy", descriptor = "(Lclient!yp;I)V")
	static void method24659(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27139(-1158489095).getId();
	}

	@OriginalMember(owner = "client!az", name = "aez", descriptor = "(Lclient!yp;I)V")
	static void method24660(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1];
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = Class467.method29719(local9);
	}

	@OriginalMember(owner = "client!az", name = "ary", descriptor = "(Lclient!yp;I)V")
	static void method24661(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3851 * 2067199987;
	}

	@OriginalMember(owner = "client!az", name = "aus", descriptor = "(Lclient!yp;I)V")
	static void method24662(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-2058037036);
	}

	@OriginalMember(owner = "client!az", name = "v", descriptor = "(B)V")
	static void method24663(@OriginalArg(0) byte arg0) {
		Class80_Sub3.aClass243_20.method26256(1693912082);
	}

	@OriginalMember(owner = "client!az", name = "aqk", descriptor = "(Lclient!yp;B)V")
	static void method24664(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!az", name = "lq", descriptor = "(Lclient!yp;I)V")
	static void method24665(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class70.method1256(local11, local14, arg0, 1461367236);
	}

	@OriginalMember(owner = "client!az", name = "<init>", descriptor = "()V")
	Class176() throws Throwable {
		throw new Error();
	}
}
