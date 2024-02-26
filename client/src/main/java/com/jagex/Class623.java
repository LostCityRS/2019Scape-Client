package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class623 {

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public static final int anInt5489 = 7;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	public static final int anInt5490 = 9;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
	public static final int anInt5491 = 512;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	public static final int anInt5492 = 511;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	public static final int anInt5493 = 1024;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public static final int anInt5494 = 8;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public static final int anInt5495 = 256;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	public static final int anInt5496 = 128;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	public static final int anInt5497 = 2;

	@OriginalMember(owner = "client!vt", name = "ry", descriptor = "I")
	static int anInt5498;

	static {
		Math.sqrt(131072.0D);
	}

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "(Ljava/lang/CharSequence;I)[B")
	public static byte[] method32438(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				local5[local7] = (byte) local14;
			} else if (local14 == '€') {
				local5[local7] = -128;
			} else if (local14 == '‚') {
				local5[local7] = -126;
			} else if (local14 == 'ƒ') {
				local5[local7] = -125;
			} else if (local14 == '„') {
				local5[local7] = -124;
			} else if (local14 == '…') {
				local5[local7] = -123;
			} else if (local14 == '†') {
				local5[local7] = -122;
			} else if (local14 == '‡') {
				local5[local7] = -121;
			} else if (local14 == 'ˆ') {
				local5[local7] = -120;
			} else if (local14 == '‰') {
				local5[local7] = -119;
			} else if (local14 == 'Š') {
				local5[local7] = -118;
			} else if (local14 == '‹') {
				local5[local7] = -117;
			} else if (local14 == 'Œ') {
				local5[local7] = -116;
			} else if (local14 == 'Ž') {
				local5[local7] = -114;
			} else if (local14 == '‘') {
				local5[local7] = -111;
			} else if (local14 == '’') {
				local5[local7] = -110;
			} else if (local14 == '“') {
				local5[local7] = -109;
			} else if (local14 == '”') {
				local5[local7] = -108;
			} else if (local14 == '•') {
				local5[local7] = -107;
			} else if (local14 == '–') {
				local5[local7] = -106;
			} else if (local14 == '—') {
				local5[local7] = -105;
			} else if (local14 == '˜') {
				local5[local7] = -104;
			} else if (local14 == '™') {
				local5[local7] = -103;
			} else if (local14 == 'š') {
				local5[local7] = -102;
			} else if (local14 == '›') {
				local5[local7] = -101;
			} else if (local14 == 'œ') {
				local5[local7] = -100;
			} else if (local14 == 'ž') {
				local5[local7] = -98;
			} else if (local14 == 'Ÿ') {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "(CI)Z")
	public static boolean method32439(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(Lclient!nn;Lclient!aav;I)Lclient!aku;")
	public static Class80_Sub31 method32440(@OriginalArg(0) Class443 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = arg0;
		local2.anInt1648 = arg0.anInt4879 * 1348369397;
		if (local2.anInt1648 * -1051134449 == -1) {
			local2.aPacketBit_2 = new PacketBit(260);
		} else if (local2.anInt1648 * -1051134449 == -2) {
			local2.aPacketBit_2 = new PacketBit(10000);
		} else if (local2.anInt1648 * -1051134449 <= 18) {
			local2.aPacketBit_2 = new PacketBit(20);
		} else if (local2.anInt1648 * -1051134449 <= 98) {
			local2.aPacketBit_2 = new PacketBit(100);
		} else {
			local2.aPacketBit_2 = new PacketBit(260);
		}
		local2.aPacketBit_2.method22564(arg1, -1499752488);
		local2.aPacketBit_2.method22553(local2.aClass443_1.anInt4880 * 1861237215, 631359507);
		local2.anInt1647 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vt", name = "ant", descriptor = "(Lclient!yp;I)V")
	static void method32441(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (Class160.aClass121_Sub1_2.method9702(1596964472) != Class347.aClass347_4) {
			throw new RuntimeException();
		}
		@Pc(27) Class20_Sub2 local27 = (Class20_Sub2) Class160.aClass121_Sub1_2.method9693(1425232456);
		local27.method16504(local13, (short) 18002);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	Class623() throws Throwable {
		throw new Error();
	}
}
