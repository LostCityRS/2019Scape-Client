package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;

@OriginalClass("client!sd")
public final class Class546 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sd", name = "this$0", descriptor = "Lclient!so;")
	final Class556 aClass556_3;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "(Lclient!aly;Lclient!aly;IZI)I")
	static int method31207(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) Class163_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt2083 * -263101925;
			local12 = arg1.anInt2083 * -263101925;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class374.method28437(arg0.method15767((byte) -106), arg1.method15767((byte) -53), Class512.aClass719_3, (byte) 1);
		} else if (arg2 == 3) {
			if (arg0.aString63.equals("-")) {
				if (arg1.aString63.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString63.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class374.method28437(arg0.aString63, arg1.aString63, Class512.aClass719_3, (byte) 1);
			}
		} else if (arg2 == 4) {
			return arg0.method15751(1653689302) ? (arg1.method15751(755188757) ? 0 : 1) : (arg1.method15751(-861265664) ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method15752((byte) 121) ? (arg1.method15752((byte) 18) ? 0 : 1) : (arg1.method15752((byte) 89) ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method15750(1310671008) ? (arg1.method15750(1564544428) ? 0 : 1) : (arg1.method15750(1894429518) ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method15748(-1959092259) ? (arg1.method15748(-1986678043) ? 0 : 1) : (arg1.method15748(-1664880432) ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt2087 * 1438063139;
			local12 = arg1.anInt2087 * 1438063139;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt2086 * -1140092917 - arg1.anInt2086 * -1140092917;
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(JIZI)Ljava/lang/String;")
	public static String method31208(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class378.method28537(arg0);
			local5 = Class62.aCalendar2;
		} else {
			Class220.method25907(arg0);
			local5 = Class62.aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class38.method824(arg0, arg1, arg2, (byte) -12) : Integer.toString(local14 / 10) + local14 % 10 + "-" + Class62.aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)[I")
	public static int[] method31209(@OriginalArg(0) int arg0) {
		return new int[] { Class495.anInt5032 * -1666529807, Class361.anInt4492 * 187098293, Class330.anInt4186 * -1554812657 };
	}

	@OriginalMember(owner = "client!sd", name = "br", descriptor = "(Lclient!yp;I)V")
	static void method31210(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5777 -= -1672568046;
		if (arg0.aLongArray27[arg0.anInt5777 * -628853575] > arg0.aLongArray27[arg0.anInt5777 * -628853575 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!sd", name = "mm", descriptor = "(Ljava/lang/String;ZB)I")
	public static int method31211(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class98.anIntArray45 = null;
		Class345.anInt4249 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = (arg1 ? Class610.aClass52_2.anInt197 * 489545675 : Class610.aClass52_2.anInt196 * 2004943305) + local20;
		@Pc(36) int local36;
		for (local36 = local20; local36 < local34; local36++) {
			@Pc(44) Class80_Sub1_Sub19 local44 = Class610.aClass52_2.method1073(local36, 1991823318);
			if (local44.aBoolean614 && local44.method23071((short) 451).toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 50) {
					return -1;
				}
				local10.add(local36);
				local14.add(local44.method23071((short) 451));
			}
		}
		Class98.anIntArray45 = new int[local10.size()];
		local36 = 0;
		@Pc(85) Iterator local85 = local10.iterator();
		while (local85.hasNext()) {
			@Pc(92) Integer local92 = (Integer) local85.next();
			Class98.anIntArray45[local36++] = local92;
		}
		@Pc(107) String[] local107 = (String[]) local14.toArray(new String[Class98.anIntArray45.length]);
		Class602.method32125(local107, Class98.anIntArray45, -936916409);
		return local10.size();
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!so;)V")
	Class546(@OriginalArg(0) Class556 arg0) {
		this.aClass556_3 = arg0;
	}
}
