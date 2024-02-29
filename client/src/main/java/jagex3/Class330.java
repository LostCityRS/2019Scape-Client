package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class330 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	static int anInt4187;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!eb;")
	static Class240 aClass240_79 = new Class240(32);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27444(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-1784991960);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 32);
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

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()V")
	public static void method27445() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25926((byte) -124);
		}
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(Lclient!dh;IIIIILclient!do;IIIILclient!aaq;)Lclient!do;")
	public static Class109 method27446(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class109 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class19 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg11 != null) {
			local6 |= arg11.method23576(-1996311400);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(42) Class240 local42 = aClass240_79;
		@Pc(48) Class109 local48;
		synchronized (aClass240_79) {
			local48 = (Class109) aClass240_79.method25932(local39);
		}
		@Pc(79) int local79;
		if (local48 == null || arg0.method20705(local48.method6825(), local6) != 0) {
			if (local48 != null) {
				local6 = arg0.method20524(local6, local48.method6825());
			}
			local79 = arg5 * 3 + 6;
			@Pc(81) byte local81 = 3;
			@Pc(96) int[] local96 = new int[] { 64, 96, 128 };
			@Pc(113) Class231 local113 = new Class231(local79 * local81 + 1, local79 * local81 * 2 - local79, 0);
			@Pc(119) int local119 = local113.method25753(0, 0, 0);
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
					local155 = Class464.anIntArray453[local147] * local132 >> 14;
					@Pc(163) int local163 = local136 * Class464.anIntArray454[local147] >> 14;
					local123[local125][local138] = local113.method25753(local155, 0, local163);
				}
			}
			for (local125 = 0; local125 < local81; local125++) {
				local132 = (local125 * 256 + 128) / local81;
				local136 = 256 - local132;
				@Pc(205) byte local205 = (byte) (arg9 * local136 + arg10 * local132 >> 8);
				@Pc(250) short local250 = (short) (((arg7 & 0x380) * local136 + local132 * (arg8 & 0x380) & 0x38000) + ((arg8 & 0xFC00) * local132 + (arg7 & 0xFC00) * local136 & 0xFC0000) + ((arg7 & 0x7F) * local136 + local132 * (arg8 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local79; local155++) {
					if (local125 == 0) {
						local113.method25783(local119, local123[0][(local155 + 1) % local79], local123[0][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					} else {
						local113.method25783(local123[local125 - 1][local155], local123[local125 - 1][(local155 + 1) % local79], local123[local125][(local155 + 1) % local79], (byte) 1, (byte) -1, local250, local205, (short) -1);
						local113.method25783(local123[local125 - 1][local155], local123[local125][(local155 + 1) % local79], local123[local125][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					}
				}
			}
			local48 = arg0.method20522(local113, local6, anInt4187 * -1710939251, 64, 768);
			@Pc(363) Class240 local363 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local48, local39);
			}
		}
		local79 = arg6.method6863();
		@Pc(382) int local382 = arg6.method6864();
		@Pc(385) int local385 = arg6.method6867();
		@Pc(388) int local388 = arg6.method6928();
		if (arg11 == null) {
			local48 = local48.method6907((byte) 3, local6, true);
			local48.method6833(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6939(local79 + local382 >> 1, 0, local385 + local388 >> 1);
		} else {
			local48 = local48.method6907((byte) 3, local6, true);
			local48.method6833(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6939(local382 + local79 >> 1, 0, local388 + local385 >> 1);
			arg11.method23579(local48, (byte) 39);
		}
		if (arg2 != 0) {
			local48.method6986(arg2);
		}
		if (arg3 != 0) {
			local48.method6830(arg3);
		}
		if (arg4 != 0) {
			local48.method6939(0, arg4, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!i", name = "u", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27447(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-1827282471);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 51);
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

	@OriginalMember(owner = "client!i", name = "z", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27448(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-1789729562);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 52);
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

	@OriginalMember(owner = "client!i", name = "q", descriptor = "()V")
	public static void method27449() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25926((byte) -102);
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27450(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-2037708508);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 87);
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

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27451(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-2025875207);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 21);
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

	@OriginalMember(owner = "client!i", name = "j", descriptor = "()V")
	static void method27452() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(I)V")
	static void method27453(@OriginalArg(0) int arg0) {
		anInt4187 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25926((byte) -70);
		}
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;")
	public static Class109 method27454(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class109 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class19 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg8 != null) {
			local5 |= arg8.method23576(-2075444081);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25932(local26);
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
			local35 = arg0.method20522(local66, local5, anInt4187 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25923(local35, local26);
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
			arg8.method23579(local35, (byte) 105);
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

	@OriginalMember(owner = "client!i", name = "h", descriptor = "()V")
	static void method27455() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	static void method27456() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "x", descriptor = "(I)V")
	static void method27457(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25925(arg0, (byte) -66);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	static void method27458(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25925(arg0, (byte) -54);
		}
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(I)V")
	static void method27459(@OriginalArg(0) int arg0) {
		anInt4187 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25926((byte) -99);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	static void method27460() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "()V")
	static void method27461() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!i", name = "y", descriptor = "()V")
	public static void method27462() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25926((byte) -20);
		}
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "(I)V")
	static void method27463(@OriginalArg(0) int arg0) {
		if (!Class202.method24655((byte) 103)) {
			return;
		}
		if (Class518.aStringArray35 == null) {
			Class555.method31235((short) -17734);
		}
		Class168.aBoolean381 = true;
		Class168.anInt2448 = 0;
	}

	@OriginalMember(owner = "client!i", name = "bcg", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	static void method27464(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		if (client.aClass175_2 == null) {
			return;
		}
		@Pc(7) Class93_Sub22 local7 = Class102.method2592(Class446.aClass446_110, client.aClass175_2.aClass24_2, (byte) 66);
		local7.aClass93_Sub41_Sub2_1.method22466(Class582.method31595(arg1, 275898717) + 1 + Class582.method31595(arg2, -580076764), 2145636263);
		local7.aClass93_Sub41_Sub2_1.method22415(arg1, 1516871641);
		local7.aClass93_Sub41_Sub2_1.method22459(arg0, -1311286727);
		local7.aClass93_Sub41_Sub2_1.method22415(arg2, 1516871641);
		client.aClass175_2.method24363(local7, -2111524569);
	}

	@OriginalMember(owner = "client!i", name = "ef", descriptor = "(I)Lclient!ax;")
	public static Class175 method27465(@OriginalArg(0) int arg0) {
		return Class56.method18046(client.anInt3435 * -849002901, -1497248091) || client.anInt3435 * -849002901 == 0 ? client.aClass175_1 : client.aClass175_2;
	}

	@OriginalMember(owner = "client!i", name = "tn", descriptor = "(Lclient!yf;I)V")
	static void method27466(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class202.method24657(local11, arg0, 863770656);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	Class330() throws Throwable {
		throw new Error();
	}
}
