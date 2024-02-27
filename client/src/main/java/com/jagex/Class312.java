package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!hg")
public final class Class312 {

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Ljava/lang/String;")
	public String aString171;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/String;")
	public String aString172;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(ILclient!com/jagex/twitchtv/TwitchEvent;B)V")
	public static void method27463(@OriginalArg(0) int arg0, @OriginalArg(1) TwitchEvent arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class80_Sub1_Sub20 local5 = Class584.method31840(Class158.aClass158_66, arg0, -1, 1365797319);
		if (local5 == null) {
			return;
		}
		@Pc(11) Class690 local11 = Class677.method33596(-1523520144);
		if (local5.anInt3148 * -936740259 != 0) {
			local11.aLongArray28 = new long[local5.anInt3148 * -936740259];
		}
		if (local5.anInt3147 * 132623 != 0) {
			local11.anIntArray527 = new int[local5.anInt3147 * 132623];
		}
		if (local5.anInt3146 * 37010973 != 0) {
			local11.anObjectArray45 = new String[local5.anInt3146 * 37010973];
		}
		arg1.t(local11.anIntArray527, local11.aLongArray28, local11.anObjectArray45);
		Class430.method29084(local5, 500000, local11, (byte) 9);
	}

	@OriginalMember(owner = "client!hg", name = "awi", descriptor = "(Lclient!yp;B)V")
	static void method27464(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) int local16 = local12 >> 16;
		if (Class709.aClass310Array1[local16] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			return;
		}
		@Pc(44) String local44 = Class709.aClass310Array1[local16].aClass327Array2[local12].aString182;
		if (local44 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local44;
		}
	}

	@OriginalMember(owner = "client!hg", name = "bac", descriptor = "(Lclient!yp;I)V")
	static void method27465(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16950(local12, (byte) -47);
	}

	@OriginalMember(owner = "client!hg", name = "bcv", descriptor = "(Lclient!yp;I)V")
	static void method27466(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "(Lclient!ald;B)Lclient!kn;")
	public static Class125 method27467(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -34);
		@Pc(7) int local7 = arg0.gSmart2or4null();
		@Pc(11) int local11 = arg0.gSmart2or4null();
		@Pc(15) int local15 = arg0.gSmart2or4null();
		@Pc(19) int local19 = arg0.gSmart2or4null();
		@Pc(23) int local23 = arg0.gSmart2or4null();
		@Pc(27) int local27 = arg0.gSmart2or4null();
		return new Class125_Sub2(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!hg", name = "kr", descriptor = "(IIIII)V")
	static void method27468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3530 * 14557067; local1++) {
			@Pc(10) Rectangle local10 = client.aRectangleArray1[local1];
			if (local10.x + local10.width > arg0 && local10.x < arg0 + arg2 && local10.y + local10.height > arg1 && local10.y < arg1 + arg3) {
				client.aBooleanArray19[local1] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "vs", descriptor = "(Lclient!yp;I)V")
	static void method27469(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class617.method32292(local13, (byte) -78);
	}

	@OriginalMember(owner = "client!hg", name = "yk", descriptor = "(Lclient!yp;B)V")
	static void method27470(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(49) int local49 = local13 + (local23 << 14);
		@Pc(55) int local55 = local49 + (local33 << 28);
		@Pc(59) int local59 = local55 + local43;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local59;
	}

	@OriginalMember(owner = "client!hg", name = "lo", descriptor = "(Lclient!hx;I)V")
	static void method27471(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1) {
		if (Class327.anInt4121 * -328901655 != arg0.anInt4095 * -281518067) {
			return;
		}
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73 == null) {
			arg0.anInt4122 = 0;
			arg0.anInt4123 = 0;
			return;
		}
		arg0.anInt4074 = 1004555770;
		arg0.anInt4115 = ((int) (Math.sin((double) client.currentCycle / 40.0D) * 256.0D) & 0x7FF) * -1137256781;
		arg0.anInt4136 = -255961727;
		arg0.anInt4122 = client.anInt3558 * -811655695;
		arg0.anInt4123 = Class343.method27943(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73, -1220959402) * -1037144091;
		@Pc(53) Class6_Sub3 local53 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass6_Sub3_3;
		if (local53 == null) {
			arg0.aClass6_6 = null;
			return;
		}
		if (arg0.aClass6_6 == null) {
			arg0.aClass6_6 = new Class6_Sub2();
		}
		arg0.anInt4146 = local53.method23582(1755606442) * -365498645;
		arg0.aClass6_6.method23579(local53, 1741121634);
	}

	@OriginalMember(owner = "client!hg", name = "ats", descriptor = "(Lclient!yp;B)V")
	static void method27472(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub34_1.method16561((byte) 52);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	Class312() {
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "(Lclient!hm;S)V")
	void method27460(@OriginalArg(0) Class318 arg0, @OriginalArg(1) short arg1) {
		this.aString171 = arg0.method27519((byte) 14);
		this.aString172 = arg0.method27519((byte) 14);
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(Lclient!hm;)V")
	void method27461(@OriginalArg(0) Class318 arg0) {
		this.aString171 = arg0.method27519((byte) 14);
		this.aString172 = arg0.method27519((byte) 14);
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(Lclient!hm;)V")
	void method27462(@OriginalArg(0) Class318 arg0) {
		this.aString171 = arg0.method27519((byte) 14);
		this.aString172 = arg0.method27519((byte) 14);
	}
}
