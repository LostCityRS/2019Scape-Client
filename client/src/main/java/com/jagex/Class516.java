package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public class Class516 {

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V", line = 6)
	Class516() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(Ljava/net/Socket;IS)Lclient!uz;", line = 10)
	public static Class160 method30278(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) throws IOException {
		return Class117.method8366(arg0, arg1, arg1, 1863346260);
	}

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "(III)I", line = 11)
	public static int method30279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "(III)I", line = 11)
	public static int method30280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "(III)I", line = 11)
	public static int method30281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "(III)I", line = 27)
	public static int method30282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "(III)I", line = 35)
	public static int method30283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(III)I", line = 35)
	public static int method30284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "(III)I", line = 35)
	public static int method30285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "(III)I", line = 35)
	public static int method30286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "(IIIIII)I", line = 56)
	public static int method30287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "(IIIIII)I", line = 56)
	public static int method30288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "(IIIIII)I", line = 56)
	public static int method30289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "adi", descriptor = "(Lclient!yf;I)V", line = 10106)
	static final void method30290(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = arg0.aClass93_Sub28_4.aClass373Array1[local12].aString191;
	}
}
