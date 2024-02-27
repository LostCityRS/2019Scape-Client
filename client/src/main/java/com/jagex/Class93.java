package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adz")
public final class Class93 {

	@OriginalMember(owner = "client!adz", name = "au", descriptor = "I")
	static int anInt329;

	@OriginalMember(owner = "client!adz", name = "f", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
	public static String method1881(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class308.method27442(local16, (byte) 115);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!adz", name = "nt", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method1882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class147_Sub5 local3 = new Class147_Sub5();
		local3.anInt1494 = arg0 * -1646684931;
		local3.anInt1491 = arg1 * 729036297;
		local3.anInt1493 = arg2 * -1512271599;
		local3.anInt1495 = (arg4 + client.currentCycle) * -1386395393;
		local3.anInt1492 = arg3 * -996040199;
		local3.aString45 = arg6;
		local3.anInt1496 = arg5 * -1174661451;
		client.aClass5_8.method90(local3, 864007266);
	}

	@OriginalMember(owner = "client!adz", name = "avd", descriptor = "(Lclient!yp;I)V")
	static void method1883(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!adz", name = "afj", descriptor = "(Lclient!yp;I)V")
	static void method1884(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		if (arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local14;
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local25;
		}
	}

	@OriginalMember(owner = "client!adz", name = "<init>", descriptor = "()V")
	Class93() throws Throwable {
		throw new Error();
	}
}
