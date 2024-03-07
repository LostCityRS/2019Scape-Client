package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public class Class270 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	static final int anInt3883 = 5;

	@OriginalMember(owner = "client!fo", name = "as", descriptor = "Lclient!si;")
	protected static Class551 aClass551_1;

	@OriginalMember(owner = "client!fo", name = "lo", descriptor = "I")
	public static int anInt3884;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Ljava/util/List;")
	final List aList8 = new ArrayList();

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)I", line = 15)
	public int method26275(@OriginalArg(0) int arg0) {
		return this.aList8.size();
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "()I", line = 15)
	public int method26276() {
		return this.aList8.size();
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(II)I", line = 19)
	public int method26277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3891 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "(I)I", line = 19)
	public int method26278(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3891 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "(I)I", line = 19)
	public int method26279(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList8.size(); local1++) {
			if (((Class279) this.aList8.get(local1)).anInt3891 * 1676750823 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "(II)Lclient!fy;", line = 26)
	public Class279 method26280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class279) this.aList8.get(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "(Lclient!fy;I)I", line = 30)
	public int method26281(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		return this.method26285(arg0, -1, -1732060473);
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(Lclient!fy;)I", line = 30)
	public int method26282(@OriginalArg(0) Class279 arg0) {
		return this.method26285(arg0, -1, 1974077087);
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(Lclient!fy;)I", line = 30)
	public int method26283(@OriginalArg(0) Class279 arg0) {
		return this.method26285(arg0, -1, 2048426316);
	}

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "(Lclient!fy;I)I", line = 34)
	public int method26284(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26277(arg0.anInt3891 * 1676750823, -1716916568) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(Lclient!fy;II)I", line = 34)
	public int method26285(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26277(arg0.anInt3891 * 1676750823, -349631437) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "(Lclient!fy;I)I", line = 34)
	public int method26286(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26277(arg0.anInt3891 * 1676750823, -572021668) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "(Lclient!fy;I)I", line = 34)
	public int method26287(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26277(arg0.anInt3891 * 1676750823, -257631297) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "(Lclient!fy;I)I", line = 34)
	public int method26288(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1) {
		if (this.aList8.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26277(arg0.anInt3891 * 1676750823, -1363631242) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList8.size();
			}
			this.aList8.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "(II)V", line = 42)
	public void method26289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "(I)V", line = 42)
	public void method26290(@OriginalArg(0) int arg0) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "(I)V", line = 42)
	public void method26291(@OriginalArg(0) int arg0) {
		this.aList8.remove(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "(I)V", line = 46)
	public void method26292(@OriginalArg(0) int arg0) {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "()V", line = 46)
	public void method26293() {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V", line = 46)
	public void method26294() {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "()V", line = 46)
	public void method26295() {
		this.aList8.clear();
	}

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;I)Lclient!do;", line = 89)
	public static Class109 method26296(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) int arg9) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-1871244151);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = Class330.aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (Class330.aClass240_79) {
			local35 = (Class109) Class330.aClass240_79.method25829(local26);
		}
		if (local35 == null || arg0.method20759(local35.method6875(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20599(local5, local35.method6875());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25663(-local68, 0, -local68), local66.method25663(local68, 0, -local68), local66.method25663(local68, 0, local68), local66.method25663(-local68, 0, local68) };
			local66.method25665(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local66.method25665(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local66.method25666((short) 1, (short) 2, (short) 0);
			local66.method25666((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20597(local66, local5, Class330.anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = Class330.aClass240_79;
			synchronized (Class330.aClass240_79) {
				Class330.aClass240_79.method25838(local35, local26);
			}
		}
		@Pc(170) int local170 = arg5.method6901();
		@Pc(173) int local173 = arg5.method6902();
		@Pc(176) int local176 = arg5.method6905();
		@Pc(179) int local179 = arg5.method6957();
		if (arg8 == null) {
			local35 = local35.method6938((byte) 3, local5, true);
			local35.method6882(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6968(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6938((byte) 3, local5, true);
			local35.method6882(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6968(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg8.method23592(local35, (byte) 110);
		}
		if (arg2 != 0) {
			local35.method7011(arg2);
		}
		if (arg3 != 0) {
			local35.method6880(arg3);
		}
		if (arg4 != 0) {
			local35.method6968(0, arg4, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!fo", name = "aaq", descriptor = "(Lclient!yf;B)V", line = 9711)
	static final void method26297(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5682 * 1581594575) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aByte77;
		}
	}

	@OriginalMember(owner = "client!fo", name = "ang", descriptor = "(Lclient!yf;I)V", line = 12240)
	static final void method26298(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class429.anInt4781 * -1453926679 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fo", name = "awy", descriptor = "(Lclient!yf;I)V", line = 13747)
	static final void method26299(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.topLevelInterface * -703563959 != -1) {
			if (local12 == 0) {
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.topLevelInterface * -703563959;
				return;
			}
			local12--;
		}
		@Pc(44) SubInterface local44 = (SubInterface) client.aClass16_22.method227((byte) -36);
		while (local12-- > 0) {
			local44 = (SubInterface) client.aClass16_22.method229(1599311067);
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local44.anInt3172 * 1220811495;
	}
}
