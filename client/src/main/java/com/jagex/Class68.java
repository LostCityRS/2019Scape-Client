package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!act")
public final class Class68 implements Interface75 {

	@OriginalMember(owner = "client!act", name = "t", descriptor = "Lclient!act;")
	static final Class68 aClass68_6 = new Class68(0);

	@OriginalMember(owner = "client!act", name = "f", descriptor = "Lclient!act;")
	static final Class68 aClass68_14 = new Class68(1);

	@OriginalMember(owner = "client!act", name = "e", descriptor = "Lclient!act;")
	static final Class68 aClass68_3 = new Class68(2);

	@OriginalMember(owner = "client!act", name = "u", descriptor = "Lclient!act;")
	public static final Class68 aClass68_4 = new Class68(3);

	@OriginalMember(owner = "client!act", name = "l", descriptor = "Lclient!act;")
	public static final Class68 aClass68_13 = new Class68(4);

	@OriginalMember(owner = "client!act", name = "g", descriptor = "Lclient!act;")
	static final Class68 aClass68_5 = new Class68(5);

	@OriginalMember(owner = "client!act", name = "i", descriptor = "Lclient!act;")
	static final Class68 aClass68_7 = new Class68(6);

	@OriginalMember(owner = "client!act", name = "m", descriptor = "Lclient!act;")
	static final Class68 aClass68_8 = new Class68(7);

	@OriginalMember(owner = "client!act", name = "o", descriptor = "Lclient!act;")
	public static final Class68 aClass68_9 = new Class68(8);

	@OriginalMember(owner = "client!act", name = "j", descriptor = "Lclient!act;")
	public static final Class68 aClass68_2 = new Class68(9);

	@OriginalMember(owner = "client!act", name = "a", descriptor = "Lclient!act;")
	public static final Class68 aClass68_11 = new Class68(10);

	@OriginalMember(owner = "client!act", name = "s", descriptor = "Lclient!act;")
	static final Class68 aClass68_12 = new Class68(11);

	@OriginalMember(owner = "client!act", name = "k", descriptor = "Lclient!act;")
	public static final Class68 aClass68_10 = new Class68(12);

	@OriginalMember(owner = "client!act", name = "x", descriptor = "Lclient!act;")
	public static final Class68 aClass68_1 = new Class68(13);

	@OriginalMember(owner = "client!act", name = "w", descriptor = "I")
	final int anInt217;

	@OriginalMember(owner = "client!act", name = "amz", descriptor = "(Lclient!yp;I)V")
	static void method1247(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!act", name = "s", descriptor = "([J[Ljava/lang/Object;III)V")
	static void method1248(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method1248(arg0, arg1, arg2, local10 - 1, 1444042104);
		method1248(arg0, arg1, local10 + 1, arg3, 849716771);
	}

	@OriginalMember(owner = "client!act", name = "t", descriptor = "(Ljava/lang/CharSequence;CB)I")
	static int method1249(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!act", name = "<init>", descriptor = "(I)V")
	Class68(@OriginalArg(0) int arg0) {
		this.anInt217 = arg0 * 559723935;
	}

	@OriginalMember(owner = "client!act", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt217 * -1283643809;
	}

	@OriginalMember(owner = "client!act", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt217 * -1283643809;
	}

	@OriginalMember(owner = "client!act", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt217 * -1283643809;
	}
}
