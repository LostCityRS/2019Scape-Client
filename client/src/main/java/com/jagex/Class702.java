package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zc")
public final class Class702 {

	@OriginalMember(owner = "client!zc", name = "t", descriptor = "Ljava/util/Map;")
	static Map aMap25 = new HashMap();

	@OriginalMember(owner = "client!zc", name = "a", descriptor = "(Ljava/lang/Iterable;)I")
	static int method37099(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37268() > local1) {
				local1 = local11.method37268();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!zc", name = "l", descriptor = "(Ljava/lang/Class;I)Lclient!zg;")
	public static Interface75 method37100(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap25;
		synchronized (aMap25) {
			@Pc(8) Map local8 = (Map) aMap25.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37268(), local29);
				}
				aMap25.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zc", name = "g", descriptor = "(Ljava/lang/Class;I)Lclient!zg;")
	public static Interface75 method37101(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap25;
		synchronized (aMap25) {
			@Pc(8) Map local8 = (Map) aMap25.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37268(), local29);
				}
				aMap25.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!zc", name = "m", descriptor = "([Lclient!zg;I)Lclient!zg;")
	public static Interface75 method37102(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37268()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zc", name = "s", descriptor = "(Ljava/lang/Iterable;)I")
	static int method37103(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37268() > local1) {
				local1 = local11.method37268();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!zc", name = "i", descriptor = "([Lclient!zg;I)Lclient!zg;")
	public static Interface75 method37104(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37268()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zc", name = "j", descriptor = "(Ljava/lang/Iterable;Lclient!ald;)V")
	public static void method37105(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Packet arg1) {
		@Pc(3) int local3 = Class437.method29138(arg0, (short) -6061);
		arg1.pSmart1or2(local3);
		if (local3 == 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
			arg1.data[arg1.pos * -1380987821 + local13] = 0;
		}
		@Pc(31) Iterator local31 = arg0.iterator();
		while (local31.hasNext()) {
			@Pc(38) Interface75 local38 = (Interface75) local31.next();
			@Pc(41) int local41 = local38.method37268();
			@Pc(45) int local45 = local41 / 8;
			arg1.data[local45 + arg1.pos * -1380987821] = (byte) (arg1.data[local45 + arg1.pos * -1380987821] | 0x1 << (local41 & 0x7));
		}
		arg1.pos += local3 * 1034180571;
	}

	@OriginalMember(owner = "client!zc", name = "o", descriptor = "([Lclient!zg;I)Lclient!zg;")
	public static Interface75 method37106(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method37268()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zc", name = "m", descriptor = "(II)I")
	public static int method37107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!zc", name = "r", descriptor = "(CI)Z")
	public static boolean method37108(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zc", name = "<init>", descriptor = "()V")
	Class702() throws Throwable {
		throw new Error();
	}
}
