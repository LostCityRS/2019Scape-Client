package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public class Class330 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	static int anInt4146;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!eb;")
	static Class240 aClass240_79 = new Class240(32);

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 15)
	Class330() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(Lclient!dh;IIIIILclient!do;IIIILclient!aaq;)Lclient!do;", line = 20)
	public static Class109 method27351(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class109 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class19 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg11 != null) {
			local6 |= arg11.method23585(-1996311400);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(42) Class240 local42 = aClass240_79;
		@Pc(48) Class109 local48;
		synchronized (aClass240_79) {
			local48 = (Class109) aClass240_79.method25829(local39);
		}
		@Pc(79) int local79;
		if (local48 == null || arg0.method20759(local48.method6875(), local6) != 0) {
			if (local48 != null) {
				local6 = arg0.method20599(local6, local48.method6875());
			}
			local79 = arg5 * 3 + 6;
			@Pc(81) byte local81 = 3;
			@Pc(96) int[] local96 = new int[] { 64, 96, 128 };
			@Pc(113) Class231 local113 = new Class231(local79 * local81 + 1, local79 * local81 * 2 - local79, 0);
			@Pc(119) int local119 = local113.method25663(0, 0, 0);
			@Pc(123) int[][] local123 = new int[local81][local79];
			@Pc(125) int local125;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(155) int local155;
			for (local125 = 0; local125 < local81; local125++) {
				local132 = local96[local125];
				local136 = local96[local125];
				for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
					@Pc(147) int local147 = (local138 << 14) / local79;
					local155 = Class464.anIntArray451[local147] * local132 >> 14;
					@Pc(163) int local163 = local136 * Class464.anIntArray452[local147] >> 14;
					local123[local125][local138] = local113.method25663(local155, 0, local163);
				}
			}
			for (local125 = 0; local125 < local81; local125++) {
				local132 = (local125 * 256 + 128) / local81;
				local136 = 256 - local132;
				@Pc(205) byte local205 = (byte) (arg9 * local136 + arg10 * local132 >> 8);
				@Pc(250) short local250 = (short) (((arg7 & 0x380) * local136 + local132 * (arg8 & 0x380) & 0x38000) + ((arg8 & 0xFC00) * local132 + (arg7 & 0xFC00) * local136 & 0xFC0000) + ((arg7 & 0x7F) * local136 + local132 * (arg8 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local79; local155++) {
					if (local125 == 0) {
						local113.method25665(local119, local123[0][(local155 + 1) % local79], local123[0][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					} else {
						local113.method25665(local123[local125 - 1][local155], local123[local125 - 1][(local155 + 1) % local79], local123[local125][(local155 + 1) % local79], (byte) 1, (byte) -1, local250, local205, (short) -1);
						local113.method25665(local123[local125 - 1][local155], local123[local125][(local155 + 1) % local79], local123[local125][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					}
				}
			}
			local48 = arg0.method20597(local113, local6, anInt4146 * -1710939251, 64, 768);
			@Pc(363) Class240 local363 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local48, local39);
			}
		}
		local79 = arg6.method6901();
		@Pc(382) int local382 = arg6.method6902();
		@Pc(385) int local385 = arg6.method6905();
		@Pc(388) int local388 = arg6.method6957();
		if (arg11 == null) {
			local48 = local48.method6938((byte) 3, local6, true);
			local48.method6882(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6968(local79 + local382 >> 1, 0, local385 + local388 >> 1);
		} else {
			local48 = local48.method6938((byte) 3, local6, true);
			local48.method6882(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6968(local382 + local79 >> 1, 0, local388 + local385 >> 1);
			arg11.method23592(local48, (byte) 39);
		}
		if (arg2 != 0) {
			local48.method7011(arg2);
		}
		if (arg3 != 0) {
			local48.method6880(arg3);
		}
		if (arg4 != 0) {
			local48.method6968(0, arg4, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "(I)V", line = 72)
	static void method27352(@OriginalArg(0) int arg0) {
		if (!Class202.method24643((byte) 103)) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -17734);
		}
		Class168.aBoolean380 = true;
		Class168.anInt2448 = 0;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27353(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-1784991960);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 32);
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

	@OriginalMember(owner = "client!i", name = "u", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27354(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-1827282471);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 51);
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

	@OriginalMember(owner = "client!i", name = "z", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27355(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-1789729562);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 52);
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

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27356(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-2037708508);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 87);
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

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27357(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-2025875207);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 21);
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

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27358(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23585(-2075444081);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25829(local26);
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
			local35 = arg0.method20597(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25838(local35, local26);
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
			arg8.method23592(local35, (byte) 105);
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

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(I)V", line = 140)
	static void method27359(@OriginalArg(0) int arg0) {
		anInt4146 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25847((byte) -70);
		}
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(I)V", line = 140)
	static void method27360(@OriginalArg(0) int arg0) {
		anInt4146 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25847((byte) -99);
		}
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()V", line = 147)
	public static void method27361() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25847((byte) -124);
		}
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "()V", line = 147)
	public static void method27362() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25847((byte) -102);
		}
	}

	@OriginalMember(owner = "client!i", name = "y", descriptor = "()V", line = 147)
	public static void method27363() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25847((byte) -20);
		}
	}

	@OriginalMember(owner = "client!i", name = "x", descriptor = "(I)V", line = 153)
	static void method27364(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25843(arg0, (byte) -66);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 153)
	static void method27365(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25843(arg0, (byte) -54);
		}
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "()V", line = 159)
	static void method27366() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "()V", line = 159)
	static void method27367() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V", line = 159)
	static void method27368() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 159)
	static void method27369() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "()V", line = 159)
	static void method27370() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "ef", descriptor = "(I)Lclient!ax;", line = 2010)
	public static Class175 method27371(@OriginalArg(0) int arg0) {
		return Class56.method18036(client.anInt3435 * -849002901, -1497248091) || client.anInt3435 * -849002901 == 0 ? client.aClass175_1 : client.aClass175_2;
	}

	@OriginalMember(owner = "client!i", name = "tn", descriptor = "(Lclient!yf;I)V", line = 8419)
	static final void method27372(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class202.method24646(local11, arg0, 863770656);
	}

	@OriginalMember(owner = "client!i", name = "bcg", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V", line = 14601)
	static void method27373(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		if (client.aClass175_2 == null) {
			return;
		}
		@Pc(7) Class93_Sub22 local7 = Class102.method2588(Class446.aClass446_110, client.aClass175_2.aClass24_2, (byte) 66);
		local7.aPacketBit_1.p2(Packet.pjstr2len(arg1, 275898717) + 1 + Packet.pjstr2len(arg2, -580076764), 2145636263);
		local7.aPacketBit_1.pjstr2(arg1, 1516871641);
		local7.aPacketBit_1.p1_alt2(arg0, -1311286727);
		local7.aPacketBit_1.pjstr2(arg2, 1516871641);
		client.aClass175_2.method24356(local7, -2111524569);
	}
}
