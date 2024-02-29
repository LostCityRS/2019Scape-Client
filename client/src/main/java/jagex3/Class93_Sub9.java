package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajw")
public final class Class93_Sub9 extends Class93 {

	@OriginalMember(owner = "client!ajw", name = "ck", descriptor = "Lclient!aat;")
	static Class22 aClass22_20;

	@OriginalMember(owner = "client!ajw", name = "k", descriptor = "I")
	int anInt1488 = 1073274771;

	@OriginalMember(owner = "client!ajw", name = "f", descriptor = "I")
	int anInt1486 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajw", name = "w", descriptor = "I")
	int anInt1483 = 1831615275;

	@OriginalMember(owner = "client!ajw", name = "l", descriptor = "I")
	int anInt1485 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajw", name = "u", descriptor = "I")
	int anInt1481 = 1628291795;

	@OriginalMember(owner = "client!ajw", name = "z", descriptor = "I")
	int anInt1484 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajw", name = "p", descriptor = "I")
	int anInt1487 = 2054860095;

	@OriginalMember(owner = "client!ajw", name = "d", descriptor = "I")
	int anInt1482 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajw", name = "c", descriptor = "Lclient!aks;")
	Class93_Sub29 aClass93_Sub29_1;

	@OriginalMember(owner = "client!ajw", name = "k", descriptor = "(Ljava/lang/CharSequence;IZI)Z")
	static boolean method13154(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				return false;
			}
			if (local57 >= arg1) {
				return false;
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(92) int local92 = local23 * arg1 + local57;
			if (local23 != local92 / arg1) {
				return false;
			}
			local23 = local92;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!ajw", name = "<init>", descriptor = "(Lclient!aks;)V")
	Class93_Sub9(@OriginalArg(0) Class93_Sub29 arg0) {
		this.aClass93_Sub29_1 = arg0;
	}

	@OriginalMember(owner = "client!ajw", name = "n", descriptor = "(II)Z")
	boolean method13151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1488 * -113120923 && arg0 <= this.anInt1486 * 255075307 && arg1 >= this.anInt1483 * 125260925 && arg1 <= this.anInt1485 * 925701095) {
			return true;
		} else {
			return arg0 >= this.anInt1481 * -1689773403 && arg0 <= this.anInt1484 * 1086189553 && arg1 >= this.anInt1487 * 636370241 && arg1 <= this.anInt1482 * -1246489691;
		}
	}

	@OriginalMember(owner = "client!ajw", name = "e", descriptor = "(III)Z")
	boolean method13152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= this.anInt1488 * -113120923 && arg0 <= this.anInt1486 * 255075307 && arg1 >= this.anInt1483 * 125260925 && arg1 <= this.anInt1485 * 925701095) {
			return true;
		} else {
			return arg0 >= this.anInt1481 * -1689773403 && arg0 <= this.anInt1484 * 1086189553 && arg1 >= this.anInt1487 * 636370241 && arg1 <= this.anInt1482 * -1246489691;
		}
	}

	@OriginalMember(owner = "client!ajw", name = "m", descriptor = "(II)Z")
	boolean method13153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1488 * -113120923 && arg0 <= this.anInt1486 * 255075307 && arg1 >= this.anInt1483 * 125260925 && arg1 <= this.anInt1485 * 925701095) {
			return true;
		} else {
			return arg0 >= this.anInt1481 * -1689773403 && arg0 <= this.anInt1484 * 1086189553 && arg1 >= this.anInt1487 * 636370241 && arg1 <= this.anInt1482 * -1246489691;
		}
	}
}
