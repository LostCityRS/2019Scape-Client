package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gx")
public final class Class303 {

	@OriginalMember(owner = "client!gx", name = "f", descriptor = "J")
	static long aLong364;

	@OriginalMember(owner = "client!gx", name = "t", descriptor = "J")
	static long aLong365;

	@OriginalMember(owner = "client!gx", name = "u", descriptor = "()J")
	public static synchronized long method27108() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong365 * -96120465846323047L) {
			aLong364 += (aLong365 * -96120465846323047L - local1) * -5590234105563552995L;
		}
		aLong365 = local1 * -4113523606005670999L;
		return local1 + aLong364 * -302017061667637451L;
	}

	@OriginalMember(owner = "client!gx", name = "f", descriptor = "()J")
	public static synchronized long method27109() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong365 * -96120465846323047L) {
			aLong364 += (aLong365 * -96120465846323047L - local1) * -5590234105563552995L;
		}
		aLong365 = local1 * -4113523606005670999L;
		return local1 + aLong364 * -302017061667637451L;
	}

	@OriginalMember(owner = "client!gx", name = "e", descriptor = "()J")
	public static synchronized long method27110() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong365 * -96120465846323047L) {
			aLong364 += (aLong365 * -96120465846323047L - local1) * -5590234105563552995L;
		}
		aLong365 = local1 * -4113523606005670999L;
		return local1 + aLong364 * -302017061667637451L;
	}

	@OriginalMember(owner = "client!gx", name = "t", descriptor = "(B)J")
	public static synchronized long currentTimeMillis(@OriginalArg(0) byte arg0) {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong365 * -96120465846323047L) {
			aLong364 += (aLong365 * -96120465846323047L - local1) * -5590234105563552995L;
		}
		aLong365 = local1 * -4113523606005670999L;
		return local1 + aLong364 * -302017061667637451L;
	}

	@OriginalMember(owner = "client!gx", name = "gi", descriptor = "(Lclient!yp;I)V")
	static void method27112(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2060170687);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class102.method21130(local16, local22, arg0, -643027351);
	}

	@OriginalMember(owner = "client!gx", name = "mq", descriptor = "(Lclient!yp;B)V")
	static void method27113(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class322.method27603(local11, local14, arg0, (byte) 27);
	}

	@OriginalMember(owner = "client!gx", name = "ro", descriptor = "(Lclient!yp;B)V")
	static void method27114(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2108731465);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class579.method31808(local16, local22, arg0, (byte) 127);
	}

	@OriginalMember(owner = "client!gx", name = "abl", descriptor = "(Lclient!yp;I)V")
	static void method27115(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (Class134.aClass305_1.method27136(-1854185845) / 60000L);
	}

	@OriginalMember(owner = "client!gx", name = "adf", descriptor = "(Lclient!yp;I)V")
	static void method27116(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.aClass80_Sub32_4.aString52;
	}

	@OriginalMember(owner = "client!gx", name = "als", descriptor = "(Lclient!yp;B)V")
	static void method27117(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) CharSequence local13 = (CharSequence) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class475.method29886(local13, -1711257544);
	}

	@OriginalMember(owner = "client!gx", name = "<init>", descriptor = "()V")
	Class303() throws Throwable {
		throw new Error();
	}
}
