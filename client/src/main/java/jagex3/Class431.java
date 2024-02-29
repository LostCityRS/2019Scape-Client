package jagex3;

import java.awt.Point;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class431 {

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static final int anInt4943 = 1;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public static final int anInt4944 = 2;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	static final int anInt4945 = 0;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static final int anInt4947 = 2;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	public static final int anInt4948 = 0;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	static final int anInt4949 = 1;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	public static final int anInt4950 = 0;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	static final int anInt4951 = 1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static final int anInt4954 = 1;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public int anInt4956;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public int anInt4957;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public int anInt4958;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public int anInt4959;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	public int anInt4960;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public int anInt4962;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public int anInt4946 = 0;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public int anInt4963 = 0;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Z")
	boolean aBoolean766 = false;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V")
	static void method28955(@OriginalArg(0) byte arg0) {
		@Pc(2) Queue local2 = Class655.aQueue3;
		synchronized (Class655.aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) Class655.aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22909(local9, 1989476160);
						if (!local16.method22908(133063708) && local16.method22885(-1678286317) < Class553.anInt3408 * -1378711501 && local16.method22886((byte) -67) < Class553.anInt3416 * 2091353777 && local16.method22885(-1678286317) >= 0 && local16.method22886((byte) -67) >= 0) {
							@Pc(67) int local67 = local16.method22902(-1553844929);
							if (local16.method22902(848223835) == -1) {
								Class655.aClass163_Sub1_1.method14915(local16, 1650852741);
							} else if (Class64.method1163(local67, -253175961)) {
								Class655.aClass163_Sub1_1.method14845(local16, (byte) 2);
							}
						}
					} else {
						local16.method22889((byte) -87);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "amn", descriptor = "(Lclient!yf;I)V")
	static void method28956(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class32_Sub7.method16835((String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375], false, false, (byte) 3);
	}

	@OriginalMember(owner = "client!na", name = "azp", descriptor = "(Lclient!yf;I)V")
	static void method28957(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!na", name = "vg", descriptor = "(Lclient!yf;B)V")
	static void method28958(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class93_Sub22 local18 = Class102.method2592(Class446.aClass446_101, client.aClass175_2.aClass24_2, (byte) 109);
		local18.aClass93_Sub41_Sub2_1.method22466(local12, 2131625847);
		client.aClass175_2.method24363(local18, -1807660685);
	}

	@OriginalMember(owner = "client!na", name = "fp", descriptor = "(Lclient!yf;I)V")
	static void method28959(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -379497974);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method29149(local16, local22, arg0, (short) 22262);
	}

	@OriginalMember(owner = "client!na", name = "jz", descriptor = "(Lclient!hq;Lclient!hf;I)Lclient!hf;")
	public static Class312 method28960(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt4026 * 897022795 != -1) {
			return arg0.method27321(arg1.anInt4026 * 897022795, 266839489);
		}
		if (!arg0.aBoolean712) {
			@Pc(23) int local23 = arg1.anInt3994 * -1549590237 >>> 16;
			@Pc(28) Class10 local28 = new Class10(client.aClass16_22);
			for (@Pc(33) Class93_Sub40 local33 = (Class93_Sub40) local28.method160((byte) 45); local33 != null; local33 = (Class93_Sub40) local28.next()) {
				if (local23 == local33.anInt3172 * 1220811495) {
					return Class659.method32986((int) (local33.aLong232 * -3750704643647536275L), 62779510);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!na", name = "fc", descriptor = "(Lclient!yf;I)V")
	static void method28961(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 326303476);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class257.method26115(local16, local22, arg0, (byte) 72);
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(IIZB)I")
	public static int method28962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31246(arg0, arg2, (short) 255);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray174.length; local17++) {
				if (local4.anIntArray173[local17] == arg1) {
					local15 += local4.anIntArray174[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!na", name = "db", descriptor = "(B)V")
	static void method28963(@OriginalArg(0) byte arg0) {
		Class47.method957((byte) 11);
		Class159_Sub1.aClass93_Sub1_Sub20_2 = null;
		Class602.aClass93_Sub1_Sub20_4 = null;
		Class159_Sub1.aClass16_15.method219((byte) 101);
		Class159_Sub1.aClass16_16.method219((byte) 109);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				Class159_Sub1.aClass106ArrayArray1[local13][local18] = null;
				Class159_Sub1.aClass5ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	Class431() {
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "(Lclient!alw;I)V")
	void method28947(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4959 = arg0.method22427(-1434290800) * -1773110991;
		} else if (arg1 == 2) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 3) {
			this.anInt4955 = arg0.method22431(-118643075) * -1190025807;
			this.anInt4956 = arg0.method22431(-118643075) * 683389527;
			this.anInt4957 = arg0.method22431(-118643075) * 260864033;
		} else if (arg1 == 4) {
			this.anInt4961 = arg0.method22425((short) 16384) * -492674485;
			this.anInt4960 = arg0.method22431(-118643075) * -897187131;
		} else if (arg1 == 6) {
			this.anInt4953 = arg0.method22425((short) 16384) * 2134056573;
		} else if (arg1 == 8) {
			this.anInt4946 = 1676694901;
		} else if (arg1 == 9) {
			this.anInt4963 = -1054296193;
		} else if (arg1 == 10) {
			this.aBoolean766 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(Lclient!alw;I)V")
	void method28948(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28949(arg0, local3, 660021917);
		}
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "(Lclient!alw;II)V")
	void method28949(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4959 = arg0.method22427(-1434290800) * -1773110991;
		} else if (arg1 == 2) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 3) {
			this.anInt4955 = arg0.method22431(-118643075) * -1190025807;
			this.anInt4956 = arg0.method22431(-118643075) * 683389527;
			this.anInt4957 = arg0.method22431(-118643075) * 260864033;
		} else if (arg1 == 4) {
			this.anInt4961 = arg0.method22425((short) 16384) * -492674485;
			this.anInt4960 = arg0.method22431(-118643075) * -897187131;
		} else if (arg1 == 6) {
			this.anInt4953 = arg0.method22425((short) 16384) * 2134056573;
		} else if (arg1 == 8) {
			this.anInt4946 = 1676694901;
		} else if (arg1 == 9) {
			this.anInt4963 = -1054296193;
		} else if (arg1 == 10) {
			this.aBoolean766 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(B)V")
	void method28950(@OriginalArg(0) byte arg0) {
		this.anInt4958 = Class464.anIntArray454[this.anInt4959 * 60440529 << 3] * -1638561129;
		@Pc(17) long local17 = (long) (this.anInt4955 * -823033007);
		@Pc(23) long local23 = (long) (this.anInt4956 * -1854056089);
		@Pc(29) long local29 = (long) (this.anInt4957 * 1279331297);
		this.anInt4962 = (int) Math.sqrt((double) (local23 * local23 + local17 * local17 + local29 * local29)) * 579112251;
		if (this.anInt4960 * 2136484877 == 0) {
			this.anInt4960 = -897187131;
		}
		if (this.anInt4961 * 798349155 == 0) {
			this.aLong278 = 6158710116567111541L;
		} else if (this.anInt4961 * 798349155 == 1) {
			this.aLong278 = (long) (this.anInt4962 * 1635131288 / (this.anInt4960 * 2136484877)) * 2899388028947114123L;
			this.aLong278 *= this.aLong278 * 9057428299981225763L;
		} else if (this.anInt4961 * 798349155 == 2) {
			this.aLong278 = (long) (this.anInt4962 * 1635131288 / (this.anInt4960 * 2136484877)) * 2899388028947114123L;
		}
		if (this.aBoolean766) {
			this.anInt4962 *= -1;
		}
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(Lclient!alw;)V")
	void method28951(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28949(arg0, local3, 1907368799);
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(Lclient!alw;)V")
	void method28952(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28949(arg0, local3, -333907352);
		}
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(Lclient!alw;I)V")
	void method28953(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4959 = arg0.method22427(-1434290800) * -1773110991;
		} else if (arg1 == 2) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 3) {
			this.anInt4955 = arg0.method22431(-118643075) * -1190025807;
			this.anInt4956 = arg0.method22431(-118643075) * 683389527;
			this.anInt4957 = arg0.method22431(-118643075) * 260864033;
		} else if (arg1 == 4) {
			this.anInt4961 = arg0.method22425((short) 16384) * -492674485;
			this.anInt4960 = arg0.method22431(-118643075) * -897187131;
		} else if (arg1 == 6) {
			this.anInt4953 = arg0.method22425((short) 16384) * 2134056573;
		} else if (arg1 == 8) {
			this.anInt4946 = 1676694901;
		} else if (arg1 == 9) {
			this.anInt4963 = -1054296193;
		} else if (arg1 == 10) {
			this.aBoolean766 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "()V")
	void method28954() {
		this.anInt4958 = Class464.anIntArray454[this.anInt4959 * 60440529 << 3] * -1638561129;
		@Pc(17) long local17 = (long) (this.anInt4955 * -823033007);
		@Pc(23) long local23 = (long) (this.anInt4956 * -1854056089);
		@Pc(29) long local29 = (long) (this.anInt4957 * 1279331297);
		this.anInt4962 = (int) Math.sqrt((double) (local23 * local23 + local17 * local17 + local29 * local29)) * 579112251;
		if (this.anInt4960 * 2136484877 == 0) {
			this.anInt4960 = -897187131;
		}
		if (this.anInt4961 * 798349155 == 0) {
			this.aLong278 = 6158710116567111541L;
		} else if (this.anInt4961 * 798349155 == 1) {
			this.aLong278 = (long) (this.anInt4962 * 1635131288 / (this.anInt4960 * 2136484877)) * 2899388028947114123L;
			this.aLong278 *= this.aLong278 * 9057428299981225763L;
		} else if (this.anInt4961 * 798349155 == 2) {
			this.aLong278 = (long) (this.anInt4962 * 1635131288 / (this.anInt4960 * 2136484877)) * 2899388028947114123L;
		}
		if (this.aBoolean766) {
			this.anInt4962 *= -1;
		}
	}
}
