package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

@OriginalClass("client!qq")
public final class Class515 {

	@OriginalMember(owner = "client!qq", name = "pw", descriptor = "I")
	public static int anInt5052;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "Lclient!qq;")
	static final Class515 aClass515_6 = new Class515(0);

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!qq;")
	public static final Class515 aClass515_2 = new Class515(1);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!qq;")
	static final Class515 aClass515_9 = new Class515(2);

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "Lclient!qq;")
	public static final Class515 aClass515_4 = new Class515(3);

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!qq;")
	public static final Class515 aClass515_7 = new Class515(4);

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!qq;")
	public static final Class515 aClass515_3 = new Class515(5);

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Lclient!qq;")
	static final Class515 aClass515_1 = new Class515(6);

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "Lclient!qq;")
	static final Class515 aClass515_8 = new Class515(7);

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!qq;")
	static final Class515 aClass515_5 = new Class515(8);

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	final int anInt5051;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(Ljava/net/Socket;III)Lclient!ug;")
	static BufferedSocket method30572(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		return new BufferedSocket_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "ne", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30573(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1941647751) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray26 = Class431.method29089(local13, arg2, 1484208528);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!qq", name = "nx", descriptor = "(Lclient!yp;I)V")
	static void method30574(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class542.method31171(local11, local14, arg0, 1331451477);
	}

	@OriginalMember(owner = "client!qq", name = "ahh", descriptor = "(Lclient!yp;S)V")
	static void method30575(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class75 local15 = Class52.method1074(16777215);
		@Pc(21) Class80_Sub31 local21 = Class623.method32440(Class443.aClass443_46, local15.aClass22_1, -191270971);
		local21.aPacketBit_2.p1(local12);
		local15.method1325(local21, (byte) -92);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I)V")
	Class515(@OriginalArg(0) int arg0) {
		this.anInt5051 = arg0 * -781753803;
	}
}
