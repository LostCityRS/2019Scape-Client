package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class431 {

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	public static final int anInt4642 = 43;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static final int anInt4643 = 1;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public static final int anInt4644 = 19;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static final int anInt4645 = 99;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static final int anInt4646 = 4;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static final int anInt4647 = 5;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	public static final int anInt4648 = 23;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static final int anInt4649 = 7;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public static final int anInt4650 = 6;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	public static final int anInt4651 = 17;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static final int anInt4652 = 18;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	public static final int anInt4653 = 0;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static final int anInt4654 = 20;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public static final int anInt4655 = 22;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "I")
	public static final int anInt4656 = 44;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "I")
	public static final int anInt4657 = 24;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	public static final int anInt4658 = 46;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public static final int anInt4659 = 41;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public static final int anInt4660 = 42;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	public static final int anInt4661 = 3;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static final int anInt4662 = 25;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public static final int anInt4663 = 45;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static final int anInt4664 = 2;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public static final int anInt4665 = 98;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public static final int anInt4666 = 9;

	@OriginalMember(owner = "client!na", name = "me", descriptor = "(Ljava/lang/String;Lclient!yp;I)[Ljava/lang/Object;")
	static Object[] method29089(@OriginalArg(0) String arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object[] local5 = new Object[arg0.length() + 1];
		@Pc(10) int local10;
		for (local10 = local5.length - 1; local10 >= 1; local10--) {
			if (arg0.charAt(local10 - 1) == 's') {
				local5[local10] = arg1.anObjectArray46[(arg1.anInt5776 -= -825189621) * -2070619997];
			} else if (arg0.charAt(local10 - 1) == 'l') {
				local5[local10] = Long.valueOf(arg1.aLongArray27[(arg1.anInt5777 -= 1311199625) * -628853575]);
			} else {
				local5[local10] = Integer.valueOf(arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581]);
			}
		}
		local10 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		if (local10 == -1) {
			local5 = null;
		} else {
			local5[0] = Integer.valueOf(local10);
		}
		return local5;
	}

	@OriginalMember(owner = "client!na", name = "alo", descriptor = "(Lclient!yp;I)V")
	static void method29090(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767);
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Z")
	static boolean method29091(@OriginalArg(0) int arg0) {
		return Class149.aBoolean355;
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	Class431() throws Throwable {
		throw new Error();
	}
}
