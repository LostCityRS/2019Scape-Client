package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class351 {

	@OriginalMember(owner = "client!iw", name = "ay", descriptor = "I")
	static int anInt4255;

	@OriginalMember(owner = "client!iw", name = "t", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "[S")
	public short[] aShortArray121;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	static void method28017(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class75 local2 = Class52.method1074(16777215);
		if (local2.method1321((byte) 2) == null) {
			return;
		}
		@Pc(12) Class80_Sub31 local12 = Class623.method32440(Class443.aClass443_32, local2.aClass22_1, -191270971);
		local12.aPacketBit_2.p2(Class350.method28013(arg0, (short) 16383) + Class350.method28013(arg1, (short) 16383) + Class350.method28013(arg2, (short) 16383) + 1);
		local12.aPacketBit_2.pjstr(arg0);
		local12.aPacketBit_2.pjstr(arg1);
		local12.aPacketBit_2.pjstr(arg2);
		@Pc(46) int local46 = 0;
		if (arg3) {
			local46 |= 0x1;
		}
		if (arg4) {
			local46 |= 0x2;
		}
		local12.aPacketBit_2.p1(local46);
		local2.method1325(local12, (byte) -19);
	}

	@OriginalMember(owner = "client!iw", name = "azo", descriptor = "(Lclient!yp;I)V")
	static void method28018(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16808((byte) -50) ? 1 : 0;
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(Lclient!yy;Lclient!zw;II)I")
	public static int method28019(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return Class697.aClass697_4 == arg0 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(II)V")
	static void method28020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class430.anInt4640 = arg0 * -1322214105;
		@Pc(6) Class243 local6 = Class430.aClass243_81;
		synchronized (Class430.aClass243_81) {
			Class430.aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!iw", name = "kl", descriptor = "(Lclient!yp;I)V")
	static void method28021(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2013793318);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class350.method28010(local16, local22, arg0, 1949846019);
	}

	@OriginalMember(owner = "client!iw", name = "u", descriptor = "(Lclient!asa;I)I")
	static int method28022(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class351(@OriginalArg(0) Class335 arg0) {
		this.anIntArray423 = new int[8];
		this.aShortArray121 = new short[8];
		@Pc(11) int local11 = 0;
		if (arg0.anIntArray415 != null && arg0.aShortArray118 != null) {
			local11 = arg0.anIntArray415.length;
			System.arraycopy(arg0.anIntArray415, 0, this.anIntArray423, 0, local11);
			System.arraycopy(arg0.aShortArray118, 0, this.aShortArray121, 0, local11);
		}
		for (@Pc(39) int local39 = local11; local39 < 8; local39++) {
			this.anIntArray423[local39] = -1;
			this.aShortArray121[local39] = -1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "([I[S)V")
	public Class351(@OriginalArg(0) int[] arg0, @OriginalArg(1) short[] arg1) {
		this.anIntArray423 = arg0;
		this.aShortArray121 = arg1;
	}
}
