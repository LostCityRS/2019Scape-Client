package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public class Class206 {

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_20 = new Class206(2, 3);

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_22 = new Class206(4, 4);

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_19 = new Class206(6, 1);

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_24 = new Class206(7, 1);

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_21 = new Class206(3, 2);

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_17 = new Class206(0, 1);

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!ck;")
	static final Class206 aClass206_23 = new Class206(9, 3);

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Lclient!ck;")
	static final Class206 aClass206_18 = new Class206(5, 4);

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_25 = new Class206(1, 1);

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!ck;")
	public static final Class206 aClass206_26 = new Class206(8, 1);

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public final int anInt3388;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public final int anInt3389;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(II)V", line = 18)
	Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3388 = arg0 * 2050018703;
		this.anInt3389 = arg1 * 1490148147;
	}

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "(Lclient!ase;I)I", line = 200)
	static int method24698(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.gBit(2, 655342518);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.gBit(5, 602694899);
		} else if (local4 == 2) {
			local8 = arg0.gBit(8, -736876662);
		} else {
			local8 = arg0.gBit(11, -60431463);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ck", name = "aez", descriptor = "(Lclient!yf;I)V", line = 10245)
	static final void method24699(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (Math.random() * (double) (local12 + 1));
	}

	@OriginalMember(owner = "client!ck", name = "jk", descriptor = "([Lclient!hf;IIIZI)V", line = 10910)
	public static void method24700(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class312 local9 = arg0[local1];
			if (local9 != null && local9.anInt3985 * 897022795 == arg1) {
				Class550.method31032(local9, arg2, arg3, arg4, (byte) 37);
				Class32_Sub3.method16695(local9, arg2, arg3, 1075114004);
				if (local9.anInt3989 * 1868441863 > local9.anInt3991 * 1312295363 - local9.anInt3981 * 1215292027) {
					local9.anInt3989 = local9.anInt3991 * -1500850587 - local9.anInt3981 * 548807149;
				}
				if (local9.anInt3989 * 1868441863 < 0) {
					local9.anInt3989 = 0;
				}
				if (local9.anInt3990 * -1543587533 > local9.anInt4043 * -1927602083 - local9.anInt3982 * -1490598249) {
					local9.anInt3990 = local9.anInt4043 * -863215569 - local9.anInt3982 * -2034326259;
				}
				if (local9.anInt3990 * -1543587533 < 0) {
					local9.anInt3990 = 0;
				}
				if (local9.anInt3971 * -158526639 == 0) {
					Class110_Sub21.method8545(arg0, local9, arg4, -1532752138);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "aso", descriptor = "(Lclient!yf;B)V", line = 13065)
	static final void method24701(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub2_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 93);
		client.aClass532_1.method30533((byte) 0);
		Class106_Sub1.method5135(878517057);
		client.aBoolean601 = false;
	}
}
