package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;

@OriginalClass("client!rj")
public final class Class531 {

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString220;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString218;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Ljava/lang/String;")
	static final String aString219;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "Ljava/lang/String;")
	public static final String aString221;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString220 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString218 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		aString219 = local1.toLowerCase();
		aString221 = String.format("%s (%s) [%s]", aString220, aString218, aString219);
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(79) Exception local79) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!rj", name = "rf", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30815(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1903320376) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray37 = Class431.method29089(local13, arg2, 2107159248);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!rj", name = "yj", descriptor = "(Lclient!yp;I)V")
	static void method30816(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3536 * -982910995 >= 5 && client.anInt3536 * -982910995 <= 9) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3536 * -982910995;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "afs", descriptor = "(Lclient!yp;B)V")
	static void method30817(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anInt5778 -= 1815275855;
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(37) int local37 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(47) int local47 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(53) Class15 local53 = Class317.aClass464_1.method29594(client.anInterface49_1, local37, (byte) 1);
		@Pc(61) String local61 = local53.method379(local13, local27, Class344.aClass99Array6, local47, -893462842);
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local61 == null ? "" : local61;
	}

	@OriginalMember(owner = "client!rj", name = "im", descriptor = "(IIII)Lclient!ahb;")
	static Class120_Sub1_Sub1_Sub1 method30818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class568 local10 = client.aClass539_1.method30932(-1638462787).aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local10 == null) {
			return null;
		}
		@Pc(16) Class120_Sub1_Sub1_Sub1 local16 = null;
		@Pc(18) int local18 = -1;
		for (@Pc(21) Class594 local21 = local10.aClass594_2; local21 != null; local21 = local21.aClass594_3) {
			@Pc(26) Class120_Sub1_Sub1 local26 = local21.aClass120_Sub1_Sub1_1;
			if (local26 instanceof Class120_Sub1_Sub1_Sub1) {
				@Pc(32) Class120_Sub1_Sub1_Sub1 local32 = (Class120_Sub1_Sub1_Sub1) local26;
				@Pc(42) int local42 = (local32.method18966((byte) -20) - 1) * 256 + 252;
				@Pc(46) Class463 local46 = local32.method24552().aClass463_61;
				@Pc(54) int local54 = (int) local46.aFloat297 - local42 >> 9;
				@Pc(62) int local62 = (int) local46.aFloat296 - local42 >> 9;
				@Pc(70) int local70 = local42 + (int) local46.aFloat297 >> 9;
				@Pc(78) int local78 = local42 + (int) local46.aFloat296 >> 9;
				if (local54 <= arg1 && local62 <= arg2 && local70 >= arg1 && local78 >= arg2) {
					@Pc(102) int local102 = (local70 + 1 - arg1) * (local78 + 1 - arg2);
					if (local102 > local18) {
						local16 = local32;
						local18 = local102;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method30819(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_24, client.aClass75_2.aClass22_1, -191270971);
		local10.aPacketBit_2.p2(0);
		@Pc(21) int local21 = local10.aPacketBit_2.pos * -1380987821;
		local10.aPacketBit_2.pjstr(arg0);
		local10.aPacketBit_2.pjstr(arg1);
		local10.aPacketBit_2.p1(arg2);
		local10.aPacketBit_2.p1(arg3 ? 1 : 0);
		local10.aPacketBit_2.pjstr(arg4);
		local10.aPacketBit_2.pos += -1350670595;
		local10.aPacketBit_2.tinyenc(Class499.anIntArray464, local21, local10.aPacketBit_2.pos * -1380987821);
		local10.aPacketBit_2.p2check(local10.aPacketBit_2.pos * -1380987821 - local21);
		client.aClass75_2.method1325(local10, (byte) -55);
		if (arg2 < 13) {
			client.aBoolean747 = true;
			Class480.method30005((byte) 12);
		}
		Class499.aClass707_1 = Class707.aClass707_20;
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	Class531() throws Throwable {
		throw new Error();
	}
}
