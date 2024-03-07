package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gz")
public final class Class305 {

	@OriginalMember(owner = "client!gz", name = "n", descriptor = "J")
	static long aLong256;

	@OriginalMember(owner = "client!gz", name = "e", descriptor = "J")
	static long aLong257;

	@OriginalMember(owner = "client!gz", name = "<init>", descriptor = "()V", line = 7)
	Class305() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gz", name = "e", descriptor = "(Ljava/io/File;[BII)V", line = 11)
	static void method26796(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!gz", name = "e", descriptor = "(I)J", line = 14)
	public static final synchronized long method26797(@OriginalArg(0) int arg0) {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong257 * 3821070258679340455L) {
			aLong256 += (aLong257 * 3821070258679340455L - local1) * 7664086464780785289L;
		}
		aLong257 = local1 * -3926191002291373545L;
		return local1 + aLong256 * -7272283144078426183L;
	}

	@OriginalMember(owner = "client!gz", name = "n", descriptor = "()J", line = 14)
	public static final synchronized long method26798() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong257 * 3821070258679340455L) {
			aLong256 += (aLong257 * 3821070258679340455L - local1) * 7664086464780785289L;
		}
		aLong257 = local1 * -3926191002291373545L;
		return local1 + aLong256 * -7272283144078426183L;
	}

	@OriginalMember(owner = "client!gz", name = "n", descriptor = "(Lclient!tl;B)V", line = 29)
	static void method26799(@OriginalArg(0) Class573 arg0, @OriginalArg(1) byte arg1) {
		arg0.aClass132_Sub1_25 = null;
		@Pc(5) Stack local5 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			if (Class573.aStack1.size() < 200) {
				Class573.aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gz", name = "l", descriptor = "(Lclient!uh;IILclient!ahm;II)V", line = 284)
	public static void method26800(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class681 local2 = Class96.method2324(-584297594);
		local2.aClass132_Sub1_Sub1_Sub1_4 = arg3;
		local2.anInt5893 = arg4 * -1287754267;
		Class346.method27566(arg0, arg1, arg2, local2, 1677070776);
		local2.aClass132_Sub1_Sub1_Sub1_4 = null;
		local2.anInt5893 = 1287754267;
	}

	@OriginalMember(owner = "client!gz", name = "ey", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5691)
	static final void method26801(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean690 = false;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!gz", name = "iw", descriptor = "(IIIB)I", line = 6306)
	public static final int method26802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (client.world.method30481(-1392626687) == null) {
			return 0;
		}
		@Pc(9) int local9 = arg0 >> 9;
		@Pc(13) int local13 = arg1 >> 9;
		if (local9 < 0 || local13 < 0 || local9 > client.world.method30459(-474836985) - 1 || local13 > client.world.method30466((short) 128) - 1) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (client.world.method30487(-1502082692).aByteArrayArrayArray12[1][local9][local13] & 0x2) != 0) {
			local35 = arg2 + 1;
		}
		return client.world.method30481(-1352859328).aClass99Array1[local35].method2473(arg0, arg1, 942007362);
	}

	@OriginalMember(owner = "client!gz", name = "ue", descriptor = "(Lclient!yf;B)V", line = 8716)
	static final void method26803(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class93_Sub40 local18 = (Class93_Sub40) client.aClass16_22.method214((long) local12);
		if (local18 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		}
	}
}
