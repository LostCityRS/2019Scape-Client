package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajn")
public final class Class80_Sub7 extends Class80 {

	@OriginalMember(owner = "client!ajn", name = "u", descriptor = "I")
	int anInt1461 = 146061207;

	@OriginalMember(owner = "client!ajn", name = "l", descriptor = "I")
	int anInt1463 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajn", name = "g", descriptor = "I")
	int anInt1462 = 1487519801;

	@OriginalMember(owner = "client!ajn", name = "i", descriptor = "I")
	int anInt1466 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajn", name = "m", descriptor = "I")
	int anInt1468 = -1545450467;

	@OriginalMember(owner = "client!ajn", name = "o", descriptor = "I")
	int anInt1465 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajn", name = "j", descriptor = "I")
	int anInt1464 = -201330755;

	@OriginalMember(owner = "client!ajn", name = "a", descriptor = "I")
	int anInt1467 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajn", name = "s", descriptor = "Lclient!akh;")
	Class80_Sub18 aClass80_Sub18_1;

	@OriginalMember(owner = "client!ajn", name = "u", descriptor = "(JII)Ljava/lang/String;")
	static String method13453(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = Class62.aCalendar1.get(5);
		@Pc(11) int local11 = Class62.aCalendar1.get(2) + 1;
		@Pc(15) int local15 = Class62.aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!ajn", name = "<init>", descriptor = "(Lclient!akh;)V")
	Class80_Sub7(@OriginalArg(0) Class80_Sub18 arg0) {
		this.aClass80_Sub18_1 = arg0;
	}

	@OriginalMember(owner = "client!ajn", name = "t", descriptor = "(IIB)Z")
	boolean method13450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg0 >= this.anInt1461 * -1342781479 && arg0 <= this.anInt1463 * 1383351719 && arg1 >= this.anInt1462 * 1855050231 && arg1 <= this.anInt1466 * 105738785) {
			return true;
		} else {
			return arg0 >= this.anInt1468 * -1035916853 && arg0 <= this.anInt1465 * -1058028369 && arg1 >= this.anInt1464 * -1286030229 && arg1 <= this.anInt1467 * 1037378903;
		}
	}

	@OriginalMember(owner = "client!ajn", name = "f", descriptor = "(II)Z")
	boolean method13451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1461 * -1342781479 && arg0 <= this.anInt1463 * 1383351719 && arg1 >= this.anInt1462 * 1855050231 && arg1 <= this.anInt1466 * 105738785) {
			return true;
		} else {
			return arg0 >= this.anInt1468 * -1035916853 && arg0 <= this.anInt1465 * -1058028369 && arg1 >= this.anInt1464 * -1286030229 && arg1 <= this.anInt1467 * 1037378903;
		}
	}

	@OriginalMember(owner = "client!ajn", name = "e", descriptor = "(II)Z")
	boolean method13452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1461 * -1342781479 && arg0 <= this.anInt1463 * 1383351719 && arg1 >= this.anInt1462 * 1855050231 && arg1 <= this.anInt1466 * 105738785) {
			return true;
		} else {
			return arg0 >= this.anInt1468 * -1035916853 && arg0 <= this.anInt1465 * -1058028369 && arg1 >= this.anInt1464 * -1286030229 && arg1 <= this.anInt1467 * 1037378903;
		}
	}
}
