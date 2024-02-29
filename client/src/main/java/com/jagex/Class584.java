package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public class Class584 {

	@OriginalMember(owner = "client!tw", name = "v", descriptor = "Lclient!aac;")
	static Class5 aClass5_15;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "[I")
	public int[] anIntArray472;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I)V", line = 11)
	public Class584(@OriginalArg(0) int arg0) {
		this.anInt5436 = arg0 * -2084350951;
		this.anIntArray473 = new int[this.anInt5436 * 1285867561];
		this.anIntArray472 = new int[this.anInt5436 * 1285867561];
	}

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "(Lclient!py;Ljava/lang/String;Z)Lclient!tw;", line = 18)
	public static Class584 method31425(@OriginalArg(0) Class497 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method30105(arg1, -1497248091);
		if (local4 == -1) {
			return new Class584(0);
		}
		@Pc(18) byte[] local18 = arg0.method30064(local4, 1, (byte) 0);
		if (local18 == null) {
			return new Class584(0);
		}
		@Pc(30) Class93_Sub41 local30 = new Class93_Sub41(local18);
		@Pc(34) int local34 = local30.method22472(-1434290800);
		@Pc(39) Class584 local39 = new Class584(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5436 * 1285867561) {
				@Pc(51) int local51 = local30.method22483(-118643075);
				@Pc(55) int local55 = local30.method22472(-1434290800);
				@Pc(59) int local59 = local30.method22465((short) 16384);
				if (!arg2 && local59 == 1) {
					local39.anInt5436 -= -2084350951;
				} else {
					local39.anIntArray473[local41] = local51;
					local39.anIntArray472[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "(Lclient!py;Ljava/lang/String;Z)Lclient!tw;", line = 18)
	public static Class584 method31426(@OriginalArg(0) Class497 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method30105(arg1, -1497248091);
		if (local4 == -1) {
			return new Class584(0);
		}
		@Pc(18) byte[] local18 = arg0.method30064(local4, 1, (byte) 0);
		if (local18 == null) {
			return new Class584(0);
		}
		@Pc(30) Class93_Sub41 local30 = new Class93_Sub41(local18);
		@Pc(34) int local34 = local30.method22472(-1434290800);
		@Pc(39) Class584 local39 = new Class584(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5436 * 1285867561) {
				@Pc(51) int local51 = local30.method22483(-118643075);
				@Pc(55) int local55 = local30.method22472(-1434290800);
				@Pc(59) int local59 = local30.method22465((short) 16384);
				if (!arg2 && local59 == 1) {
					local39.anInt5436 -= -2084350951;
				} else {
					local39.anIntArray473[local41] = local51;
					local39.anIntArray472[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!tw", name = "ez", descriptor = "(IB)V", line = 903)
	public static void method31427(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 1) {
			Class159_Sub1.anInt1955 = Class159_Sub1.anInt1949 * 1208056059;
		} else {
			Class159_Sub1.anInt1955 = arg0 * 1275815665;
		}
	}

	@OriginalMember(owner = "client!tw", name = "ajr", descriptor = "(Lclient!yf;I)V", line = 11505)
	static final void method31428(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class386.anInt4648 * -1091206359;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class138.anInt1383 * 1125904161;
	}
}
