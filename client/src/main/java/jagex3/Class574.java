package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class574 {

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "(Lclient!tx;Lclient!dh;B)V")
	public static void method31527(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) Iterator local2 = Class701.aList26.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class674 local9 = (Class674) local2.next();
			if (local9.aBoolean880) {
				local9.method33284(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "(I)I")
	public static int method31528(@OriginalArg(0) int arg0) {
		return Class663.anInt5998 * 763077233;
	}

	@OriginalMember(owner = "client!tm", name = "an", descriptor = "(Lclient!dh;IIIIII)V")
	static void method31529(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if ((Class211.aClass100_41 == null || Class124_Sub3.aClass100_36 == null || Class53_Sub1.aClass100_19 == null) && Class110_Sub7.aClass497_22.method30235(Class93_Sub37.anInt1960 * -923388399, -512225963) && Class110_Sub7.aClass497_22.method30235(Class239.anInt3866 * 176568505, -512225963) && Class110_Sub7.aClass497_22.method30235(Class267.anInt3923 * -377772519, -512225963)) {
			@Pc(34) Class105 local34 = Class203.method24664(Class110_Sub7.aClass497_22, Class239.anInt3866 * 176568505, 0);
			Class124_Sub3.aClass100_36 = arg0.method20511(local34, true);
			local34.method7168();
			Class454.aClass100_45 = arg0.method20511(local34, true);
			Class211.aClass100_41 = arg0.method20511(Class203.method24664(Class110_Sub7.aClass497_22, Class93_Sub37.anInt1960 * -923388399, 0), true);
			@Pc(63) Class105 local63 = Class203.method24664(Class110_Sub7.aClass497_22, Class267.anInt3923 * -377772519, 0);
			Class53_Sub1.aClass100_19 = arg0.method20511(local63, true);
			local63.method7168();
			Class166_Sub34.aClass100_23 = arg0.method20511(local63, true);
		}
		if (Class211.aClass100_41 == null || Class124_Sub3.aClass100_36 == null || Class53_Sub1.aClass100_19 == null) {
			return;
		}
		@Pc(93) int local93 = (arg3 - Class53_Sub1.aClass100_19.method18201() * 2) / Class211.aClass100_41.method18201();
		@Pc(95) int local95;
		for (local95 = 0; local95 < local93; local95++) {
			Class211.aClass100_41.method18181(arg1 + Class53_Sub1.aClass100_19.method18201() + local95 * Class211.aClass100_41.method18201(), arg2 + arg4 - Class211.aClass100_41.method18177());
		}
		local95 = (arg4 - arg5 - Class53_Sub1.aClass100_19.method18177()) / Class124_Sub3.aClass100_36.method18177();
		for (@Pc(129) int local129 = 0; local129 < local95; local129++) {
			Class124_Sub3.aClass100_36.method18181(arg1, arg2 + arg5 + local129 * Class124_Sub3.aClass100_36.method18177());
			Class454.aClass100_45.method18181(arg3 + arg1 - Class454.aClass100_45.method18201(), arg2 + arg5 + local129 * Class124_Sub3.aClass100_36.method18177());
		}
		Class53_Sub1.aClass100_19.method18181(arg1, arg2 + arg4 - Class53_Sub1.aClass100_19.method18177());
		Class166_Sub34.aClass100_23.method18181(arg3 + arg1 - Class53_Sub1.aClass100_19.method18201(), arg4 + arg2 - Class53_Sub1.aClass100_19.method18177());
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	Class574() throws Throwable {
		throw new Error();
	}
}
