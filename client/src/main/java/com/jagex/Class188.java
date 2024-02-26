package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class188 {

	@OriginalMember(owner = "client!bl", name = "ih", descriptor = "Lclient!adv;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_13;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	final int anInt3334;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "S")
	final short aShort140;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "S")
	final short aShort139;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "S")
	final short aShort141;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "B")
	final byte aByte103;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "B")
	final byte aByte104;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Z")
	final boolean aBoolean677;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	final int anInt3333;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "(I)V")
	static void method24825(@OriginalArg(0) int arg0) {
		Class108.aClass104_22 = null;
		Class709.aClass104_26 = null;
		Class8.aClass104_1 = null;
		Class668.aClass99Array8 = null;
		Class313.aClass99Array4 = null;
		Class250.aClass99Array3 = null;
		Class330.aClass99Array5 = null;
		Class697.aClass99Array9 = null;
		Class344.aClass99Array6 = null;
		Class103_Sub17_Sub2.aClass99_18 = null;
		Class11.aClass99_1 = null;
		Class393.aClass99Array7 = null;
	}

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "(Lclient!yp;S)V")
	static void method24826(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 889840792)).aString193;
	}

	@OriginalMember(owner = "client!bl", name = "im", descriptor = "(Lclient!yp;I)V")
	static void method24827(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1995654727);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class146.method13873(local16, local22, arg0, -1877602983);
	}

	@OriginalMember(owner = "client!bl", name = "acb", descriptor = "(Lclient!yp;I)V")
	static void method24828(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.anInt4535 * -1144582289;
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(Ljava/lang/CharSequence;II[BIB)I")
	public static int method24829(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[local5 + arg4] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[local5 + arg4] = -125;
			} else if (local14 == '„') {
				arg3[arg4 + local5] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[local5 + arg4] = -122;
			} else if (local14 == '‡') {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 'ˆ') {
				arg3[arg4 + local5] = -120;
			} else if (local14 == '‰') {
				arg3[arg4 + local5] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[arg4 + local5] = -111;
			} else if (local14 == '’') {
				arg3[arg4 + local5] = -110;
			} else if (local14 == '“') {
				arg3[arg4 + local5] = -109;
			} else if (local14 == '”') {
				arg3[arg4 + local5] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[local5 + arg4] = -106;
			} else if (local14 == '—') {
				arg3[arg4 + local5] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 'š') {
				arg3[local5 + arg4] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[local5 + arg4] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt3334 = arg0 * -1094636191;
		this.aShort140 = (short) arg4;
		this.aShort139 = (short) arg5;
		this.aShort141 = (short) arg6;
		this.aByte103 = (byte) arg7;
		this.aByte104 = (byte) arg8;
		this.aBoolean677 = arg9;
		this.anInt3333 = arg10 * -906477141;
	}
}
