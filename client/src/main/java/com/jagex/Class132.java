package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Map;

@OriginalClass("client!ks")
public abstract class Class132 implements Interface3 {

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "Ljava/util/Map;")
	final Map aMap11;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "(ZI)V")
	public static void method10372(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3541 * -1330995431 == 4 || client.anInt3541 * -1330995431 == 3) {
			return;
		}
		if (!arg0) {
			if (Class251.aClass103Array1 != null) {
				@Pc(16) Class103[] local16 = Class251.aClass103Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class103 local26 = local16[local18];
					local26.method19200(-1701153447);
				}
			}
			if (Class251.anInt3879 * 1635678391 != -1) {
				Class490.aClass263_13.method26530(Class251.anInt3879 * 1635678391, 255, -1822132722);
			}
		}
		client.anInt3541 = -158780252;
		Class548.aPacket_16 = null;
		client.aBoolean722 = false;
		if (Class251.anInt3880 * -1561586921 > 0) {
			Class107.method7196(Class158.aClass158_56, Class251.anInt3880 * -1561586921, -1, -1503454530);
		}
		Class662.method33334(-82594458);
		@Pc(68) Class80_Sub31 local68 = Class623.method32440(Class443.aClass443_42, client.aClass75_1.aClass22_1, -191270971);
		local68.aPacketBit_2.p1(arg0 ? 1 : 0);
		client.aClass75_1.method1325(local68, (byte) -121);
	}

	@OriginalMember(owner = "client!ks", name = "xf", descriptor = "(Lclient!yp;B)V")
	static void method10373(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class124_Sub1.method9830(local13, local28, -1983653570);
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/util/Map;)V")
	Class132(@OriginalArg(0) Map arg0) {
		this.aMap11 = arg0;
	}
}
