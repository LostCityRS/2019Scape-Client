package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class270 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	static final int anInt3924 = 5;

	@OriginalMember(owner = "client!fo", name = "as", descriptor = "Lclient!si;")
	protected static Class551 aClass551_1;

	@OriginalMember(owner = "client!fo", name = "lo", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Ljava/util/List;")
	final List aList8 = new ArrayList();

	@OriginalMember(owner = "client!fo", name = "aaq", descriptor = "(Lclient!yf;B)V")
	static void method26389(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5843 * 1581594575) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aByte77;
		}
	}

	@OriginalMember(owner = "client!fo", name = "ang", descriptor = "(Lclient!yf;I)V")
	static void method26390(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class429.anInt4942 * -1453926679 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;I)Lclient!do;")
	public static Class109 method26391(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) int arg9) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-1871244151);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = Class330.aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (Class330.aClass240_79) {
			local35 = (Class109) Class330.aClass240_79.method25932(local26);
		}
		if (local35 == null || arg0.method20705(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20524(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25753(-local68, 0, -local68), local66.method25753(local68, 0, -local68), local66.method25753(local68, 0, local68), local66.method25753(-local68, 0, local68) };
			local66.method25783(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local66.method25783(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local66.method25755((short) 1, (short) 2, (short) 0);
			local66.method25755((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20522(local66, local5, Class330.anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = Class330.aClass240_79;
			synchronized (Class330.aClass240_79) {
				Class330.aClass240_79.method25923(local35, local26);
			}
		}
		@Pc(170) int local170 = arg5.method6863();
		@Pc(173) int local173 = arg5.method6864();
		@Pc(176) int local176 = arg5.method6867();
		@Pc(179) int local179 = arg5.method6928();
		if (arg8 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg8.method23579(local35, (byte) 110);
		}
		if (arg2 != 0) {
			local35.method6986(arg2);
		}
		if (arg3 != 0) {
			local35.method6830(arg3);
		}
		if (arg4 != 0) {
			local35.method6939(0, arg4, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!fo", name = "awy", descriptor = "(Lclient!yf;I)V")
	static void method26392(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3526 * -703563959 != -1) {
			if (local12 == 0) {
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3526 * -703563959;
				return;
			}
			local12--;
		}
		@Pc(44) Class93_Sub40 local44 = (Class93_Sub40) client.aClass16_22.method220((byte) -36);
		while (local12-- > 0) {
			local44 = (Class93_Sub40) client.aClass16_22.method222(1599311067);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local44.anInt3172 * 1220811495;
	}

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "(Lclient!fy;I)I")
	public int method26368(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26370(arg0.anInt3932 * 1676750823, -1716916568) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)I")
	public int method26369(@OriginalArg(0) int arg0) {
		return this.aList8.size();
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(II)I")
	public int method26370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3932 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "(II)Lclient!fy;")
	public Class279 method26371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class279) this.aList8.get(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "(I)I")
	public int method26372(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3932 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(Lclient!fy;II)I")
	public int method26373(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26370(arg0.anInt3932 * 1676750823, -349631437) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "(II)V")
	public void method26374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "(I)V")
	public void method26375(@OriginalArg(0) int arg0) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "()I")
	public int method26376() {
		return this.aList8.size();
	}

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "(I)I")
	public int method26377(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3932 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "(Lclient!fy;I)I")
	public int method26378(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		return this.method26373(arg0, -1, -1732060473);
	}

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "(I)V")
	public void method26379(@OriginalArg(0) int arg0) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(Lclient!fy;)I")
	public int method26380(@OriginalArg(0) Class279 arg0) {
		return this.method26373(arg0, -1, 1974077087);
	}

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "(I)V")
	public void method26381(@OriginalArg(0) int arg0) {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "(Lclient!fy;I)I")
	public int method26382(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26370(arg0.anInt3932 * 1676750823, -572021668) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "(Lclient!fy;I)I")
	public int method26383(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26370(arg0.anInt3932 * 1676750823, -257631297) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "(Lclient!fy;I)I")
	public int method26384(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26370(arg0.anInt3932 * 1676750823, -1363631242) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(Lclient!fy;)I")
	public int method26385(@OriginalArg(0) Class279 arg0) {
		return this.method26373(arg0, -1, 2048426316);
	}

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "()V")
	public void method26386() {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
	public void method26387() {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "()V")
	public void method26388() {
		this.aList8.clear();
	}
}
