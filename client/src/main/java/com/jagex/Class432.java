package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class432 {

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static final int anInt4964 = 32768;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static final int anInt4965 = 15;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static final int anInt4966 = 15;

	@OriginalMember(owner = "client!nc", name = "avc", descriptor = "(Lclient!yf;I)V")
	static void method28968(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aShort149;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aShort154;
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "([SILclient!jp;II)I")
	public static int method28969(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class365 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method28086(arg0, local1 + arg1, 291964485);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!nc", name = "kj", descriptor = "([Lclient!hf;II)V")
	static void method28970(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class312 local9 = arg0[local1];
			if (local9 != null && local9.anInt4026 * 897022795 == arg1 && !client.method24983(local9)) {
				if (local9.anInt4012 * -158526639 == 0) {
					method28970(arg0, local9.anInt3994 * -1549590237, -1557523898);
					if (local9.aClass312Array1 != null) {
						method28970(local9.aClass312Array1, local9.anInt3994 * -1549590237, -1463521841);
					}
					@Pc(57) Class93_Sub40 local57 = (Class93_Sub40) client.aClass16_22.method215((long) (local9.anInt3994 * -1549590237));
					if (local57 != null) {
						Class19.method23646(local57.anInt3172 * 1220811495, 462245976);
					}
				}
				if (local9.anInt4012 * -158526639 == 6 && local9.anInt4064 * -1088634495 != -1) {
					if (local9.aClass19_6 == null) {
						local9.aClass19_6 = new Class19_Sub2();
						local9.aClass19_6.method23580(local9.anInt4064 * -1088634495, 1119331677);
					}
					if (local9.aClass19_6.method23585(client.anInt3480 * 1820654295, 7054795) && local9.aClass19_6.method23593(-1228609165)) {
						local9.aClass19_6.method23582(1509318012);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "avd", descriptor = "(Lclient!yf;I)V")
	static void method28971(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	Class432() throws Throwable {
		throw new Error();
	}
}
