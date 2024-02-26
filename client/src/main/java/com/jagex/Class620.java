package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class620 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(Lclient!ald;)Lclient!ve;")
	public static Interface67 method32305(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(5) Class609 local5 = Class523.method30649(arg0.method23362(-1207424738), -614003712);
		if (Class609.aClass609_1 == local5) {
			return Class505.method30470(arg0, (byte) 89);
		} else if (local5 == Class609.aClass609_2) {
			return Class564.method31478(arg0, (byte) -105);
		} else if (Class609.aClass609_3 == local5) {
			return Class630.method32712(arg0, 147058533);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "aan", descriptor = "(Lclient!yp;I)V")
	static void method32306(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 >= 0 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].anInt5739 * 1400007835;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "atr", descriptor = "(Lclient!yp;I)V")
	static void method32307(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15996((byte) 0) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "(I)[Lclient!acp;")
	public static Class65[] method32308(@OriginalArg(0) int arg0) {
		return new Class65[] { Class65.aClass65_12, Class65.aClass65_2, Class65.aClass65_3, Class65.aClass65_13, Class65.aClass65_9, Class65.aClass65_10, Class65.aClass65_14, Class65.aClass65_11, Class65.aClass65_4, Class65.aClass65_1, Class65.aClass65_8, Class65.aClass65_5, Class65.aClass65_6, Class65.aClass65_7 };
	}

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "(ILjava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;IB)Lclient!di;")
	public static Class102 method32309(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) Interface23 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface48 arg6, @OriginalArg(7) Class480 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return Class102.method20772(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 746642469);
	}

	@OriginalMember(owner = "client!vq", name = "sy", descriptor = "(Lclient!yp;B)V")
	static void method32310(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		if (local11.aString184 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local11.aString184;
		}
	}

	@OriginalMember(owner = "client!vq", name = "ip", descriptor = "(BB)V")
	static void method32311(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) byte[][][] local3 = client.aClass539_1.method30960(-1959598623);
		if (local3 == null) {
			local3 = new byte[4][client.aClass539_1.method30921(2112154064)][client.aClass539_1.method31011(630303633)];
			client.aClass539_1.method30909(local3, 537902112);
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(26) int local26 = 0; local26 < client.aClass539_1.method30921(1941595919); local26++) {
				for (@Pc(33) int local33 = 0; local33 < client.aClass539_1.method31011(-997635874); local33++) {
					local3[local21][local26][local33] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	Class620() throws Throwable {
		throw new Error();
	}
}
