package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aal")
public final class Class13 {

	@OriginalMember(owner = "client!aal", name = "t", descriptor = "Z")
	public static boolean aBoolean5 = true;

	@OriginalMember(owner = "client!aal", name = "u", descriptor = "(Lclient!aam;)[Lclient!aaz;")
	public static Class26[] method348(@OriginalArg(0) Class14 arg0) {
		@Pc(3) int[] local3 = arg0.method363((byte) -124);
		@Pc(9) Class26[] local9 = new Class26[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class26 local19 = new Class26();
			local9[local11] = local19;
			local19.anInt81 = local3[local11 << 2] * 2130480411;
			local19.anInt80 = local3[(local11 << 2) + 1] * 108526731;
			local19.anInt79 = local3[(local11 << 2) + 2] * 133348931;
			local19.anInt82 = local3[(local11 << 2) + 3] * -1922903105;
		}
		return local9;
	}

	@OriginalMember(owner = "client!aal", name = "l", descriptor = "(Lclient!aam;)[Lclient!aaz;")
	public static Class26[] method349(@OriginalArg(0) Class14 arg0) {
		@Pc(3) int[] local3 = arg0.method363((byte) -126);
		@Pc(9) Class26[] local9 = new Class26[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class26 local19 = new Class26();
			local9[local11] = local19;
			local19.anInt81 = local3[local11 << 2] * 2130480411;
			local19.anInt80 = local3[(local11 << 2) + 1] * 108526731;
			local19.anInt79 = local3[(local11 << 2) + 2] * 133348931;
			local19.anInt82 = local3[(local11 << 2) + 3] * -1922903105;
		}
		return local9;
	}

	@OriginalMember(owner = "client!aal", name = "g", descriptor = "(Lclient!aam;IIII)Ljava/awt/Frame;")
	public static Frame method350(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class26[] local6 = Class152.method14626(arg0, -868642601);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (local6[local15].anInt81 * -1249901293 == arg1 && local6[local15].anInt80 * -2004120797 == arg2 && (arg4 == 0 || local6[local15].anInt82 * -2017780673 == arg4) && (!local13 || local6[local15].anInt79 * 1710030443 > arg3)) {
					arg3 = local6[local15].anInt79 * 1710030443;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method356(local75, arg1, arg2, arg3, arg4, 873758524);
		return local75;
	}

	@OriginalMember(owner = "client!aal", name = "i", descriptor = "(Lclient!aam;Ljava/awt/Frame;)V")
	public static void method351(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method360((short) 255);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!aal", name = "hh", descriptor = "(Lclient!yp;I)V")
	static void method352(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class70.method1258(local11, local14, arg0, -2064560895);
	}

	@OriginalMember(owner = "client!aal", name = "lt", descriptor = "(Lclient!hx;IIB)V")
	static void method353(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0.aByte124 == 0) {
			arg0.anInt4160 = arg0.anInt4089 * 2040095185;
		} else if (arg0.aByte124 == 1) {
			arg0.anInt4160 = (arg0.anInt4089 * -925699407 + (arg1 - arg0.anInt4103 * 1892149809) / 2) * 1595271457;
		} else if (arg0.aByte124 == 2) {
			arg0.anInt4160 = (arg1 - arg0.anInt4103 * 1892149809 - arg0.anInt4089 * -925699407) * 1595271457;
		} else if (arg0.aByte124 == 3) {
			arg0.anInt4160 = (arg1 * arg0.anInt4089 * -925699407 >> 14) * 1595271457;
		} else if (arg0.aByte124 == 4) {
			arg0.anInt4160 = ((arg1 * arg0.anInt4089 * -925699407 >> 14) + (arg1 - arg0.anInt4103 * 1892149809) / 2) * 1595271457;
		} else {
			arg0.anInt4160 = (arg1 - arg0.anInt4103 * 1892149809 - (arg1 * -925699407 * arg0.anInt4089 >> 14)) * 1595271457;
		}
		if (arg0.aByte125 == 0) {
			arg0.anInt4102 = arg0.anInt4182 * 1187466211;
		} else if (arg0.aByte125 == 1) {
			arg0.anInt4102 = ((arg2 - arg0.anInt4104 * 1990157877) / 2 + arg0.anInt4182 * 1217544699) * -94641863;
		} else if (arg0.aByte125 == 2) {
			arg0.anInt4102 = (arg2 - arg0.anInt4104 * 1990157877 - arg0.anInt4182 * 1217544699) * -94641863;
		} else if (arg0.aByte125 == 3) {
			arg0.anInt4102 = (arg2 * arg0.anInt4182 * 1217544699 >> 14) * -94641863;
		} else if (arg0.aByte125 == 4) {
			arg0.anInt4102 = ((arg2 - arg0.anInt4104 * 1990157877) / 2 + (arg0.anInt4182 * 1217544699 * arg2 >> 14)) * -94641863;
		} else {
			arg0.anInt4102 = (arg2 - arg0.anInt4104 * 1990157877 - (arg2 * arg0.anInt4182 * 1217544699 >> 14)) * -94641863;
		}
		if (!client.aBoolean735 || client.method25326(arg0).anInt1635 * 1713789767 == 0 && arg0.anInt4135 * 710314345 != 0) {
			return;
		}
		if (arg0.anInt4160 * 104389345 < 0) {
			arg0.anInt4160 = 0;
		} else if (arg0.anInt4160 * 104389345 + arg0.anInt4103 * 1892149809 > arg1) {
			arg0.anInt4160 = (arg1 - arg0.anInt4103 * 1892149809) * 1595271457;
		}
		if (arg0.anInt4102 * 1332657417 < 0) {
			arg0.anInt4102 = 0;
		} else if (arg0.anInt4104 * 1990157877 + arg0.anInt4102 * 1332657417 > arg2) {
			arg0.anInt4102 = (arg2 - arg0.anInt4104 * 1990157877) * -94641863;
		}
	}

	@OriginalMember(owner = "client!aal", name = "<init>", descriptor = "()V")
	Class13() throws Throwable {
		throw new Error();
	}
}
