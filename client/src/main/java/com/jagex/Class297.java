package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;
import java.util.Arrays;

@OriginalClass("client!gr")
public final class Class297 implements Interface25 {

	@OriginalMember(owner = "client!gr", name = "fq", descriptor = "Lclient!pf;")
	public static Class480 aClass480_92;

	@OriginalMember(owner = "client!gr", name = "id", descriptor = "Lclient!el;")
	public static Interface21 anInterface21_4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gr", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_12;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!gw;")
	final Class302 aClass302_2;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "(IIIIIIS)I")
	public static int method27002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) short arg6) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!gr", name = "afx", descriptor = "(Lclient!yp;I)V")
	static void method27003(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anInt5778 -= -221471862;
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(37) int local37 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13.substring(local27, local37);
	}

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "(IIB)Z")
	public static boolean method27004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class659.aClass138_6 == null || Class659.aClass138_6.method11516(15439498) == null) {
			return false;
		} else if (arg0 == arg1) {
			return true;
		} else {
			@Pc(19) Class413 local19 = Class659.aClass138_6.method11516(15439498).method29045(arg0, 934969603);
			@Pc(26) Class413 local26 = Class659.aClass138_6.method11516(15439498).method29045(arg1, -616034326);
			@Pc(28) Class413 local28 = local19;
			do {
				if (local28 == null) {
					local28 = local26;
					do {
						if (local28 == null) {
							return false;
						}
						local28 = local28.method28974((short) -24341);
						if (local19 == local28) {
							return true;
						}
					} while (local28 != local26);
					return false;
				}
				local28 = local28.method28974((short) -5424);
				if (local26 == local28) {
					return true;
				}
			} while (local28 != local19);
			return false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "et", descriptor = "(II)I")
	public static int method27005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class159_Sub1.anInt2022 * 781339239 == arg0) {
			return Class159_Sub1.aBoolean409 ? 1 : 0;
		} else if (arg0 == Class159_Sub1.anInt2020 * -606222511) {
			return Class159_Sub1.aBoolean404 ? 1 : 0;
		} else if (arg0 == Class159_Sub1.anInt2014 * -1592559853) {
			return Class159_Sub1.aBoolean402 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(Ljava/lang/Object;IIB)[B")
	public static byte[] method27006(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class297(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_12 = arg0;
		@Pc(13) boolean local13 = arg1.g1() != 255;
		if (local13) {
			arg1.pos -= 1034180571;
		}
		this.aClass302_2 = new Class302(arg1, local13, true, arg0.anInterface27_2);
	}

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27143(this.aClass302_2, -1216954807);
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27143(this.aClass302_2, -1216954807);
	}
}
