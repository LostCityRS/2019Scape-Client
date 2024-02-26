package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akk")
public final class Class80_Sub21 extends Class80 {

	@OriginalMember(owner = "client!akk", name = "v", descriptor = "I")
	static final int anInt1589 = 1;

	@OriginalMember(owner = "client!akk", name = "n", descriptor = "I")
	static final int anInt1590 = 3;

	@OriginalMember(owner = "client!akk", name = "p", descriptor = "I")
	static final int anInt1598 = 0;

	@OriginalMember(owner = "client!akk", name = "y", descriptor = "I")
	static final int anInt1600 = 2;

	@OriginalMember(owner = "client!akk", name = "u", descriptor = "I")
	static final int anInt1608 = 512;

	@OriginalMember(owner = "client!akk", name = "l", descriptor = "Lclient!aag;")
	static Class8 aClass8_22 = new Class8();

	@OriginalMember(owner = "client!akk", name = "g", descriptor = "Lclient!aag;")
	static Class8 aClass8_21 = new Class8();

	@OriginalMember(owner = "client!akk", name = "i", descriptor = "Lclient!aax;")
	static Class24 aClass24_12 = new Class24(16);

	@OriginalMember(owner = "client!akk", name = "m", descriptor = "I")
	int anInt1591;

	@OriginalMember(owner = "client!akk", name = "ay", descriptor = "I")
	int anInt1592;

	@OriginalMember(owner = "client!akk", name = "a", descriptor = "I")
	int anInt1593;

	@OriginalMember(owner = "client!akk", name = "ac", descriptor = "I")
	int anInt1594;

	@OriginalMember(owner = "client!akk", name = "w", descriptor = "I")
	int anInt1595;

	@OriginalMember(owner = "client!akk", name = "s", descriptor = "I")
	int anInt1596;

	@OriginalMember(owner = "client!akk", name = "q", descriptor = "I")
	int anInt1597;

	@OriginalMember(owner = "client!akk", name = "h", descriptor = "Lclient!vv;")
	Class625 aClass625_1;

	@OriginalMember(owner = "client!akk", name = "d", descriptor = "Lclient!aqb;")
	Class120_Sub1_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!akk", name = "z", descriptor = "Lclient!aqc;")
	Class120_Sub1_Sub1_Sub1_Sub2 aClass120_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!akk", name = "j", descriptor = "I")
	int anInt1599;

	@OriginalMember(owner = "client!akk", name = "o", descriptor = "I")
	int anInt1602;

	@OriginalMember(owner = "client!akk", name = "ab", descriptor = "I")
	int anInt1603;

	@OriginalMember(owner = "client!akk", name = "ax", descriptor = "I")
	int anInt1604;

	@OriginalMember(owner = "client!akk", name = "r", descriptor = "I")
	int anInt1605;

	@OriginalMember(owner = "client!akk", name = "ai", descriptor = "I")
	int anInt1606;

	@OriginalMember(owner = "client!akk", name = "aq", descriptor = "Lclient!rh;")
	Class529 aClass529_3;

	@OriginalMember(owner = "client!akk", name = "ao", descriptor = "Lclient!rh;")
	Class529 aClass529_4;

	@OriginalMember(owner = "client!akk", name = "aj", descriptor = "I")
	int anInt1607;

	@OriginalMember(owner = "client!akk", name = "b", descriptor = "Z")
	boolean aBoolean368;

	@OriginalMember(owner = "client!akk", name = "ag", descriptor = "[I")
	int[] anIntArray186;

	@OriginalMember(owner = "client!akk", name = "k", descriptor = "Lclient!on;")
	Class463 aClass463_46 = new Class463(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!akk", name = "x", descriptor = "Lclient!on;")
	Class463 aClass463_47 = new Class463(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!akk", name = "c", descriptor = "I")
	int anInt1601 = 0;

	@OriginalMember(owner = "client!akk", name = "ao", descriptor = "(IIIILclient!vv;Lclient!aqb;Lclient!aqc;)V")
	public static void method14185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) Class120_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class120_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class80_Sub21 local3 = new Class80_Sub21();
		local3.anInt1591 = arg0 * 635495667;
		local3.anInt1602 = (arg1 << 9) * 1442581325;
		local3.anInt1599 = (arg2 << 9) * 45625337;
		if (arg4 != null) {
			local3.aClass625_1 = arg4;
			@Pc(33) int local33 = arg4.anInt5503 * 1462300569;
			@Pc(38) int local38 = arg4.anInt5504 * -1951356049;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg4.anInt5504 * -1951356049;
				local38 = arg4.anInt5503 * 1462300569;
			}
			local3.anInt1593 = (arg1 + local33 << 9) * -53776127;
			local3.anInt1596 = (local38 + arg2 << 9) * 655931665;
			local3.anInt1606 = arg4.anInt5528 * -194304911;
			local3.anInt1605 = (arg4.anInt5529 * 1213693873 << 9) * -700377171;
			local3.anInt1597 = arg4.anInt5531 * 314316755;
			local3.anInt1607 = arg4.anInt5532 * -349490809;
			local3.anInt1594 = arg4.anInt5501 * -1136776763;
			local3.anIntArray186 = arg4.anIntArray501;
			local3.anInt1592 = arg4.anInt5536 * -104812385;
			local3.anInt1604 = arg4.anInt5535 * 223240771;
			local3.anInt1595 = (arg4.anInt5515 * -1604713887 << 9) * 1014283421;
			if (arg4.anIntArray503 != null) {
				local3.aBoolean368 = true;
				local3.method14186(2136926914);
			}
			if (local3.anIntArray186 != null) {
				local3.anInt1603 = (local3.anInt1607 * 2028704931 + (int) (Math.random() * (double) (local3.anInt1594 * 482038367 - local3.anInt1607 * 2028704931))) * -855303383;
			}
			aClass8_22.method232(local3, 451967273);
			Class490.aClass263_13.method26518(local3.anInt1606 * -2023184157, (byte) 0);
			Class490.aClass263_13.method26529(local3.anIntArray186, (byte) -69);
		} else if (arg5 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class335 local192 = arg5.aClass335_1;
			if (local192.anIntArray416 != null) {
				local3.aBoolean368 = true;
				local192 = local192.method27836(Class672.aClass134_1, Class672.aClass134_1, 275529997);
			}
			if (local192 != null) {
				local3.anInt1593 = (local192.anInt4212 * 1573297955 + arg1 << 9) * -53776127;
				local3.anInt1596 = (arg2 + local192.anInt4212 * 1573297955 << 9) * 655931665;
				local3.anInt1606 = Class336.method27870(arg5, (short) 30125) * 1322638539;
				local3.anInt1605 = (local192.anInt4197 * -665240961 << 9) * -700377171;
				local3.anInt1597 = local192.anInt4221 * -463929735;
				local3.anInt1592 = local192.anInt4228 * 1666948417;
				local3.anInt1604 = local192.anInt4227 * 745115653;
				local3.anInt1595 = (local192.anInt4220 * 1066329787 << 9) * 1014283421;
				Class490.aClass263_13.method26518(local192.anInt4217 * -382373013, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4218 * 1096491705, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4219 * 1287228757, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4198 * 369245, (byte) 0);
			}
			aClass8_21.method232(local3, 241663194);
		} else if (arg6 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1593 = (arg1 + arg6.method18966((byte) -124) << 9) * -53776127;
			local3.anInt1596 = (arg2 + arg6.method18966((byte) -108) << 9) * 655931665;
			local3.anInt1606 = Class43.method930(arg6, (byte) 16) * 1322638539;
			local3.anInt1605 = (arg6.anInt2719 * 1327765107 << 9) * -700377171;
			local3.anInt1597 = arg6.anInt2720 * -1071821255;
			local3.anInt1592 = -1500102912;
			local3.anInt1604 = -1536087808;
			local3.anInt1595 = 0;
			aClass24_12.method563(local3, (long) (arg6.anInt2671 * 1078276675));
			Class490.aClass263_13.method26518(arg6.anInt2715 * -198686229, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2716 * -1447185825, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2717 * 182837111, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2718 * 799167223, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aa", descriptor = "(IIII)V")
	public static void method14187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(150244249)) {
			Class253.method26383(local4, arg0, arg1, arg2, arg3, 1416335913);
		}
		@Pc(29) byte local29;
		@Pc(34) Class621 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class463 local219;
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(591838655)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18952((byte) -73);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.method23582(1266489486);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local34.anInt5445 * 228988343 == local40 || local40 == local34.anInt5437 * -457826299 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local40 == local34.anInt5449 * -1435917229 || local34.anInt5450 * -1567148933 == local40 || local34.anInt5463 * 1578952449 == local40 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1601 * -73842175) {
				local115 = Class336.method27870(local4.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 17809);
				@Pc(119) Class335 local119 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local119.anIntArray416 != null) {
					local119 = local119.method27836(Class672.aClass134_1, Class672.aClass134_1, 1237142341);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1606 = -1322638539;
					local4.anInt1601 = local29 * -244662783;
				} else if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1601 = local29 * -244662783;
					local4.anInt1597 = local119.anInt4221 * -463929735;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass529_3 == null) {
						local151 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, 249959975);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 40);
							local4.aClass529_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1597 = local119.anInt4221 * -463929735;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -100) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -1) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -1085842560);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -117); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18952((byte) 37);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.method23582(1354989924);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local40 == local34.anInt5445 * 228988343 || local34.anInt5437 * -457826299 == local40 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local34.anInt5449 * -1435917229 == local40 || local34.anInt5450 * -1567148933 == local40 || local40 == local34.anInt5463 * 1578952449 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local4.anInt1601 * -73842175 != local29) {
				local115 = Class43.method930(local4.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16);
				if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
					local4.anInt1601 = local29 * -244662783;
				} else {
					@Pc(385) boolean local385 = false;
					if (local4.aClass529_3 == null) {
						local385 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, 48883009);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 39);
							local4.aClass529_3 = null;
							local385 = true;
						}
					}
					if (local385) {
						local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -126) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -47) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -709165473);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aq", descriptor = "(IIIILclient!vv;Lclient!aqb;Lclient!aqc;)V")
	public static void method14188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) Class120_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class120_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class80_Sub21 local3 = new Class80_Sub21();
		local3.anInt1591 = arg0 * 635495667;
		local3.anInt1602 = (arg1 << 9) * 1442581325;
		local3.anInt1599 = (arg2 << 9) * 45625337;
		if (arg4 != null) {
			local3.aClass625_1 = arg4;
			@Pc(33) int local33 = arg4.anInt5503 * 1462300569;
			@Pc(38) int local38 = arg4.anInt5504 * -1951356049;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg4.anInt5504 * -1951356049;
				local38 = arg4.anInt5503 * 1462300569;
			}
			local3.anInt1593 = (arg1 + local33 << 9) * -53776127;
			local3.anInt1596 = (local38 + arg2 << 9) * 655931665;
			local3.anInt1606 = arg4.anInt5528 * -194304911;
			local3.anInt1605 = (arg4.anInt5529 * 1213693873 << 9) * -700377171;
			local3.anInt1597 = arg4.anInt5531 * 314316755;
			local3.anInt1607 = arg4.anInt5532 * -349490809;
			local3.anInt1594 = arg4.anInt5501 * -1136776763;
			local3.anIntArray186 = arg4.anIntArray501;
			local3.anInt1592 = arg4.anInt5536 * -104812385;
			local3.anInt1604 = arg4.anInt5535 * 223240771;
			local3.anInt1595 = (arg4.anInt5515 * -1604713887 << 9) * 1014283421;
			if (arg4.anIntArray503 != null) {
				local3.aBoolean368 = true;
				local3.method14186(1973477951);
			}
			if (local3.anIntArray186 != null) {
				local3.anInt1603 = (local3.anInt1607 * 2028704931 + (int) (Math.random() * (double) (local3.anInt1594 * 482038367 - local3.anInt1607 * 2028704931))) * -855303383;
			}
			aClass8_22.method232(local3, 1405669970);
			Class490.aClass263_13.method26518(local3.anInt1606 * -2023184157, (byte) 0);
			Class490.aClass263_13.method26529(local3.anIntArray186, (byte) -66);
		} else if (arg5 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class335 local192 = arg5.aClass335_1;
			if (local192.anIntArray416 != null) {
				local3.aBoolean368 = true;
				local192 = local192.method27836(Class672.aClass134_1, Class672.aClass134_1, -1948916480);
			}
			if (local192 != null) {
				local3.anInt1593 = (local192.anInt4212 * 1573297955 + arg1 << 9) * -53776127;
				local3.anInt1596 = (arg2 + local192.anInt4212 * 1573297955 << 9) * 655931665;
				local3.anInt1606 = Class336.method27870(arg5, (short) 25436) * 1322638539;
				local3.anInt1605 = (local192.anInt4197 * -665240961 << 9) * -700377171;
				local3.anInt1597 = local192.anInt4221 * -463929735;
				local3.anInt1592 = local192.anInt4228 * 1666948417;
				local3.anInt1604 = local192.anInt4227 * 745115653;
				local3.anInt1595 = (local192.anInt4220 * 1066329787 << 9) * 1014283421;
				Class490.aClass263_13.method26518(local192.anInt4217 * -382373013, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4218 * 1096491705, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4219 * 1287228757, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4198 * 369245, (byte) 0);
			}
			aClass8_21.method232(local3, 1294025595);
		} else if (arg6 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1593 = (arg1 + arg6.method18966((byte) -76) << 9) * -53776127;
			local3.anInt1596 = (arg2 + arg6.method18966((byte) -52) << 9) * 655931665;
			local3.anInt1606 = Class43.method930(arg6, (byte) 16) * 1322638539;
			local3.anInt1605 = (arg6.anInt2719 * 1327765107 << 9) * -700377171;
			local3.anInt1597 = arg6.anInt2720 * -1071821255;
			local3.anInt1592 = -1500102912;
			local3.anInt1604 = -1536087808;
			local3.anInt1595 = 0;
			aClass24_12.method563(local3, (long) (arg6.anInt2671 * 1078276675));
			Class490.aClass263_13.method26518(arg6.anInt2715 * -198686229, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2716 * -1447185825, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2717 * 182837111, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2718 * 799167223, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akk", name = "z", descriptor = "(Z)V")
	public static void method14189(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-185194878)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 141318440);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 11);
				local4.aClass529_3 = null;
			}
			if (local4.aClass529_4 != null) {
				local4.aClass529_4.method30788(150, 1963151417);
				Class490.aClass263_13.method26582(local4.aClass529_4, (byte) 34);
				local4.aClass529_4 = null;
			}
			local4.method24395((byte) 90);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(291004244)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, -1054251965);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 3);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 85);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -81); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 1530098815);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 28);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "p", descriptor = "(Z)V")
	public static void method14190(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-844764458)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 2085942498);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -52);
				local4.aClass529_3 = null;
			}
			if (local4.aClass529_4 != null) {
				local4.aClass529_4.method30788(150, 404872395);
				Class490.aClass263_13.method26582(local4.aClass529_4, (byte) -42);
				local4.aClass529_4 = null;
			}
			local4.method24395((byte) 125);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-2120467695)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, -1130624440);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -17);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 96);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -56); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, -1685986136);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 52);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 52);
		}
	}

	@OriginalMember(owner = "client!akk", name = "v", descriptor = "()V")
	public static void method14191() {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-1012865300)) {
			if (local4.aBoolean368) {
				local4.method14186(1995706663);
			}
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-891912843)) {
			if (local4.aBoolean368) {
				local4.method14186(1962939700);
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "y", descriptor = "()V")
	public static void method14192() {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(372987826)) {
			if (local4.aBoolean368) {
				local4.method14186(2027275360);
			}
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(129935480)) {
			if (local4.aBoolean368) {
				local4.method14186(1985112168);
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "n", descriptor = "()V")
	public static void method14193() {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-475404712)) {
			if (local4.aBoolean368) {
				local4.method14186(2055539180);
			}
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-779626529)) {
			if (local4.aBoolean368) {
				local4.method14186(2089530047);
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "at", descriptor = "(Lclient!aqc;)I")
	static int method14195(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2717 * 182837111;
		@Pc(8) Class621 local8 = arg0.method18952((byte) 84);
		@Pc(13) int local13 = arg0.aClass6_Sub3_3.method23582(1038911008);
		if (local13 == -1 || arg0.aClass6_Sub3_3.aBoolean429) {
			local4 = arg0.anInt2715 * -198686229;
		} else if (local13 == local8.anInt5445 * 228988343 || local8.anInt5437 * -457826299 == local13 || local8.anInt5448 * 1960834245 == local13 || local13 == local8.anInt5458 * 929486699) {
			local4 = arg0.anInt2718 * 799167223;
		} else if (local8.anInt5449 * -1435917229 == local13 || local8.anInt5450 * -1567148933 == local13 || local13 == local8.anInt5463 * 1578952449 || local8.anInt5446 * -1532002241 == local13) {
			local4 = arg0.anInt2716 * -1447185825;
		}
		return local4;
	}

	@OriginalMember(owner = "client!akk", name = "ai", descriptor = "(IIIILclient!vv;Lclient!aqb;Lclient!aqc;)V")
	public static void method14198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) Class120_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class120_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class80_Sub21 local3 = new Class80_Sub21();
		local3.anInt1591 = arg0 * 635495667;
		local3.anInt1602 = (arg1 << 9) * 1442581325;
		local3.anInt1599 = (arg2 << 9) * 45625337;
		if (arg4 != null) {
			local3.aClass625_1 = arg4;
			@Pc(33) int local33 = arg4.anInt5503 * 1462300569;
			@Pc(38) int local38 = arg4.anInt5504 * -1951356049;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg4.anInt5504 * -1951356049;
				local38 = arg4.anInt5503 * 1462300569;
			}
			local3.anInt1593 = (arg1 + local33 << 9) * -53776127;
			local3.anInt1596 = (local38 + arg2 << 9) * 655931665;
			local3.anInt1606 = arg4.anInt5528 * -194304911;
			local3.anInt1605 = (arg4.anInt5529 * 1213693873 << 9) * -700377171;
			local3.anInt1597 = arg4.anInt5531 * 314316755;
			local3.anInt1607 = arg4.anInt5532 * -349490809;
			local3.anInt1594 = arg4.anInt5501 * -1136776763;
			local3.anIntArray186 = arg4.anIntArray501;
			local3.anInt1592 = arg4.anInt5536 * -104812385;
			local3.anInt1604 = arg4.anInt5535 * 223240771;
			local3.anInt1595 = (arg4.anInt5515 * -1604713887 << 9) * 1014283421;
			if (arg4.anIntArray503 != null) {
				local3.aBoolean368 = true;
				local3.method14186(2135696667);
			}
			if (local3.anIntArray186 != null) {
				local3.anInt1603 = (local3.anInt1607 * 2028704931 + (int) (Math.random() * (double) (local3.anInt1594 * 482038367 - local3.anInt1607 * 2028704931))) * -855303383;
			}
			aClass8_22.method232(local3, 1833392826);
			Class490.aClass263_13.method26518(local3.anInt1606 * -2023184157, (byte) 0);
			Class490.aClass263_13.method26529(local3.anIntArray186, (byte) -40);
		} else if (arg5 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class335 local192 = arg5.aClass335_1;
			if (local192.anIntArray416 != null) {
				local3.aBoolean368 = true;
				local192 = local192.method27836(Class672.aClass134_1, Class672.aClass134_1, -1528995677);
			}
			if (local192 != null) {
				local3.anInt1593 = (local192.anInt4212 * 1573297955 + arg1 << 9) * -53776127;
				local3.anInt1596 = (arg2 + local192.anInt4212 * 1573297955 << 9) * 655931665;
				local3.anInt1606 = Class336.method27870(arg5, (short) 9156) * 1322638539;
				local3.anInt1605 = (local192.anInt4197 * -665240961 << 9) * -700377171;
				local3.anInt1597 = local192.anInt4221 * -463929735;
				local3.anInt1592 = local192.anInt4228 * 1666948417;
				local3.anInt1604 = local192.anInt4227 * 745115653;
				local3.anInt1595 = (local192.anInt4220 * 1066329787 << 9) * 1014283421;
				Class490.aClass263_13.method26518(local192.anInt4217 * -382373013, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4218 * 1096491705, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4219 * 1287228757, (byte) 0);
				Class490.aClass263_13.method26518(local192.anInt4198 * 369245, (byte) 0);
			}
			aClass8_21.method232(local3, 105959206);
		} else if (arg6 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1593 = (arg1 + arg6.method18966((byte) -94) << 9) * -53776127;
			local3.anInt1596 = (arg2 + arg6.method18966((byte) -118) << 9) * 655931665;
			local3.anInt1606 = Class43.method930(arg6, (byte) 16) * 1322638539;
			local3.anInt1605 = (arg6.anInt2719 * 1327765107 << 9) * -700377171;
			local3.anInt1597 = arg6.anInt2720 * -1071821255;
			local3.anInt1592 = -1500102912;
			local3.anInt1604 = -1536087808;
			local3.anInt1595 = 0;
			aClass24_12.method563(local3, (long) (arg6.anInt2671 * 1078276675));
			Class490.aClass263_13.method26518(arg6.anInt2715 * -198686229, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2716 * -1447185825, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2717 * 182837111, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2718 * 799167223, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ap", descriptor = "(Lclient!akk;IIII)V")
	static void method14199(@OriginalArg(0) Class80_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt1606 * -2023184157 == -1 && arg0.anIntArray186 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1597 * -803853751;
		if (arg0.anInt1605 * -742890459 != 0 && Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -69) != 0 && arg0.anInt1591 * -1499016133 == arg1) {
			if (arg0.aClass529_3 != null && (arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_7)) {
				Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) 13);
				arg0.aClass529_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass529_3 != null) {
				local203 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				local102 = (int) ((float) (arg0.anInt1599 * 1363501641) + (float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F);
				arg0.aClass463_46.aFloat297 = local203;
				arg0.aClass463_46.aFloat296 = local102;
			} else if (arg0.anInt1606 * -2023184157 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local122 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_46.aFloat297 = local102;
				arg0.aClass463_46.aFloat296 = local122;
				arg0.aClass529_3 = Class490.aClass263_13.method26536(Class280.aClass280_3, arg0, arg0.anInt1606 * -2023184157, -1, 0, Class278.aClass278_4.method26831(1088509579), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1605 * -742890459), arg0.aClass463_46, 0, local82, false, 1281834074);
				if (arg0.aClass529_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass529_3.method30749(local172, 150, (byte) -116);
					arg0.aClass529_3.method30726(-1946608296);
				}
			}
			if (arg0.aClass529_4 != null) {
				local203 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local203;
				arg0.aClass463_47.aFloat296 = local102;
				if (arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_7) {
					Class490.aClass263_13.method26582(arg0.aClass529_4, (byte) 74);
					arg0.aClass529_4 = null;
				}
			} else if (arg0.anIntArray186 != null && (arg0.anInt1603 -= arg4 * -855303383) * 487698713 <= 0) {
				local203 = arg0.anInt1592 * -2063181377 == 256 && arg0.anInt1604 * 973650713 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1592 * -2063181377 - arg0.anInt1604 * 973650713)) + arg0.anInt1604 * 973650713;
				local102 = (int) (Math.random() * (double) arg0.anIntArray186.length);
				local122 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				@Pc(333) int local333 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local122;
				arg0.aClass463_47.aFloat296 = local333;
				arg0.aClass529_4 = Class490.aClass263_13.method26536(Class280.aClass280_2, arg0, arg0.anIntArray186[local102], 0, local14, Class278.aClass278_9.method26831(-1721362456), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1595 * 114272693 + arg0.anInt1605 * -742890459), arg0.aClass463_47, 0, local203, false, 2040733957);
				if (arg0.aClass529_4 != null) {
					arg0.aClass529_4.method30726(-1813712101);
				}
				arg0.anInt1603 = (arg0.anInt1607 * 2028704931 + (int) (Math.random() * (double) (arg0.anInt1594 * 482038367 - arg0.anInt1607 * 2028704931))) * -855303383;
			}
		} else if (arg0.aClass529_3 != null) {
			arg0.aClass529_3.method30788(100, -580358393);
			Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) -74);
			arg0.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "am", descriptor = "(Lclient!aqc;)V")
	public static void method14200(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class80_Sub21 local8 = (Class80_Sub21) aClass24_12.method560((long) (arg0.anInt2671 * 1078276675));
		if (local8 == null) {
			Class676.method33587(arg0.aByte99, arg0.anIntArray234[0], arg0.anIntArray242[0], 0, null, null, arg0, (byte) -95);
		} else {
			local8.method14186(1903013669);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ac", descriptor = "(IIILclient!vv;)V")
	public static void method14201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class625 arg3) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(217318278)) {
			if (arg0 == local4.anInt1591 * -1499016133 && arg1 << 9 == local4.anInt1602 * 1377576325 && arg2 << 9 == local4.anInt1599 * 1363501641 && arg3.anInt5499 * 324896623 == local4.aClass625_1.anInt5499 * 324896623) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, -1729112348);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 81);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 7);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "ag", descriptor = "(Lclient!aqb;)V")
	public static void method14202(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-1948515013)) {
			if (arg0 == local4.aClass120_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, 1937746942);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -72);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "ab", descriptor = "(Lclient!aqb;)V")
	public static void method14203(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-1684540387)) {
			if (arg0 == local4.aClass120_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, -351983407);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 15);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 67);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "ak", descriptor = "(Lclient!aqb;)I")
	static int method14204(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class335 local2 = arg0.aClass335_1;
		if (local2.anIntArray416 != null) {
			local2 = local2.method27836(Class672.aClass134_1, Class672.aClass134_1, -871367341);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt4219 * 1287228757;
		@Pc(25) Class621 local25 = arg0.method18952((byte) 96);
		@Pc(30) int local30 = arg0.aClass6_Sub3_3.method23582(309810307);
		if (local30 == -1 || arg0.aClass6_Sub3_3.aBoolean429) {
			local21 = local2.anInt4217 * -382373013;
		} else if (local30 == local25.anInt5445 * 228988343 || local25.anInt5437 * -457826299 == local30 || local30 == local25.anInt5448 * 1960834245 || local25.anInt5458 * 929486699 == local30) {
			local21 = local2.anInt4198 * 369245;
		} else if (local30 == local25.anInt5449 * -1435917229 || local30 == local25.anInt5450 * -1567148933 || local30 == local25.anInt5463 * 1578952449 || local30 == local25.anInt5446 * -1532002241) {
			local21 = local2.anInt4218 * 1096491705;
		}
		return local21;
	}

	@OriginalMember(owner = "client!akk", name = "af", descriptor = "(Lclient!aqc;)V")
	public static void method14205(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class80_Sub21 local8 = (Class80_Sub21) aClass24_12.method560((long) (arg0.anInt2671 * 1078276675));
		if (local8 == null) {
			Class676.method33587(arg0.aByte99, arg0.anIntArray234[0], arg0.anIntArray242[0], 0, null, null, arg0, (byte) -58);
		} else {
			local8.method14186(2095585752);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aj", descriptor = "(IIILclient!vv;)V")
	public static void method14206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class625 arg3) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-182266679)) {
			if (arg0 == local4.anInt1591 * -1499016133 && arg1 << 9 == local4.anInt1602 * 1377576325 && arg2 << 9 == local4.anInt1599 * 1363501641 && arg3.anInt5499 * 324896623 == local4.aClass625_1.anInt5499 * 324896623) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, -34256370);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 14);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "ah", descriptor = "(Lclient!aqc;)V")
	public static void method14207(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class80_Sub21 local8 = (Class80_Sub21) aClass24_12.method560((long) (arg0.anInt2671 * 1078276675));
		if (local8 == null) {
			return;
		}
		if (local8.aClass529_3 != null) {
			local8.aClass529_3.method30788(100, 1979507643);
			Class490.aClass263_13.method26582(local8.aClass529_3, (byte) -10);
			local8.aClass529_3 = null;
		}
		local8.method24395((byte) 18);
	}

	@OriginalMember(owner = "client!akk", name = "ad", descriptor = "(Lclient!aqc;)I")
	static int method14209(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2717 * 182837111;
		@Pc(8) Class621 local8 = arg0.method18952((byte) 80);
		@Pc(13) int local13 = arg0.aClass6_Sub3_3.method23582(-522981792);
		if (local13 == -1 || arg0.aClass6_Sub3_3.aBoolean429) {
			local4 = arg0.anInt2715 * -198686229;
		} else if (local13 == local8.anInt5445 * 228988343 || local8.anInt5437 * -457826299 == local13 || local8.anInt5448 * 1960834245 == local13 || local13 == local8.anInt5458 * 929486699) {
			local4 = arg0.anInt2718 * 799167223;
		} else if (local8.anInt5449 * -1435917229 == local13 || local8.anInt5450 * -1567148933 == local13 || local13 == local8.anInt5463 * 1578952449 || local8.anInt5446 * -1532002241 == local13) {
			local4 = arg0.anInt2716 * -1447185825;
		}
		return local4;
	}

	@OriginalMember(owner = "client!akk", name = "av", descriptor = "(Lclient!aqc;)I")
	static int method14210(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2717 * 182837111;
		@Pc(8) Class621 local8 = arg0.method18952((byte) 18);
		@Pc(13) int local13 = arg0.aClass6_Sub3_3.method23582(-405888978);
		if (local13 == -1 || arg0.aClass6_Sub3_3.aBoolean429) {
			local4 = arg0.anInt2715 * -198686229;
		} else if (local13 == local8.anInt5445 * 228988343 || local8.anInt5437 * -457826299 == local13 || local8.anInt5448 * 1960834245 == local13 || local13 == local8.anInt5458 * 929486699) {
			local4 = arg0.anInt2718 * 799167223;
		} else if (local8.anInt5449 * -1435917229 == local13 || local8.anInt5450 * -1567148933 == local13 || local13 == local8.anInt5463 * 1578952449 || local8.anInt5446 * -1532002241 == local13) {
			local4 = arg0.anInt2716 * -1447185825;
		}
		return local4;
	}

	@OriginalMember(owner = "client!akk", name = "an", descriptor = "(IIII)V")
	public static void method14211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-1589645191)) {
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -287305699);
		}
		@Pc(29) byte local29;
		@Pc(34) Class621 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class463 local219;
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-394002520)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18952((byte) -93);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.method23582(731408464);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local34.anInt5445 * 228988343 == local40 || local40 == local34.anInt5437 * -457826299 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local40 == local34.anInt5449 * -1435917229 || local34.anInt5450 * -1567148933 == local40 || local34.anInt5463 * 1578952449 == local40 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1601 * -73842175) {
				local115 = Class336.method27870(local4.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 29657);
				@Pc(119) Class335 local119 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local119.anIntArray416 != null) {
					local119 = local119.method27836(Class672.aClass134_1, Class672.aClass134_1, -1274585414);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1606 = -1322638539;
					local4.anInt1601 = local29 * -244662783;
				} else if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1601 = local29 * -244662783;
					local4.anInt1597 = local119.anInt4221 * -463929735;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass529_3 == null) {
						local151 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, 1190144488);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -68);
							local4.aClass529_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1597 = local119.anInt4221 * -463929735;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -122) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -30) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -1397346119);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -9); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18952((byte) 78);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.method23582(-1455703915);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local40 == local34.anInt5445 * 228988343 || local34.anInt5437 * -457826299 == local40 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local34.anInt5449 * -1435917229 == local40 || local34.anInt5450 * -1567148933 == local40 || local40 == local34.anInt5463 * 1578952449 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local4.anInt1601 * -73842175 != local29) {
				local115 = Class43.method930(local4.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16);
				if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
					local4.anInt1601 = local29 * -244662783;
				} else {
					@Pc(385) boolean local385 = false;
					if (local4.aClass529_3 == null) {
						local385 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, -1233346509);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 23);
							local4.aClass529_3 = null;
							local385 = true;
						}
					}
					if (local385) {
						local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -45) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -51) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -727785573);
		}
	}

	@OriginalMember(owner = "client!akk", name = "x", descriptor = "(Z)V")
	public static void method14212(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(317728342)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 1781608448);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 58);
				local4.aClass529_3 = null;
			}
			if (local4.aClass529_4 != null) {
				local4.aClass529_4.method30788(150, 1578366387);
				Class490.aClass263_13.method26582(local4.aClass529_4, (byte) 31);
				local4.aClass529_4 = null;
			}
			local4.method24395((byte) 19);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(382677756)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, -1867237011);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -61);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 77);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -25); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 2094389497);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 14);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 34);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ae", descriptor = "(IIII)V")
	public static void method14213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_22.method237(-1668537983)) {
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -223452222);
		}
		@Pc(29) byte local29;
		@Pc(34) Class621 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class463 local219;
		for (local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(317544898)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18952((byte) -7);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.method23582(1055691646);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local34.anInt5445 * 228988343 == local40 || local40 == local34.anInt5437 * -457826299 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local40 == local34.anInt5449 * -1435917229 || local34.anInt5450 * -1567148933 == local40 || local34.anInt5463 * 1578952449 == local40 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1601 * -73842175) {
				local115 = Class336.method27870(local4.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 20961);
				@Pc(119) Class335 local119 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local119.anIntArray416 != null) {
					local119 = local119.method27836(Class672.aClass134_1, Class672.aClass134_1, -1550579160);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1606 = -1322638539;
					local4.anInt1601 = local29 * -244662783;
				} else if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1601 = local29 * -244662783;
					local4.anInt1597 = local119.anInt4221 * -463929735;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass529_3 == null) {
						local151 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, 1429752691);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 0);
							local4.aClass529_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1597 = local119.anInt4221 * -463929735;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -102) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -46) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -1872501182);
		}
		for (local4 = (Class80_Sub21) aClass24_12.method580((byte) -29); local4 != null; local4 = (Class80_Sub21) aClass24_12.method566((byte) 7)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18952((byte) 86);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.method23582(-1126251142);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local40 == local34.anInt5445 * 228988343 || local34.anInt5437 * -457826299 == local40 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local34.anInt5449 * -1435917229 == local40 || local34.anInt5450 * -1567148933 == local40 || local40 == local34.anInt5463 * 1578952449 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local4.anInt1601 * -73842175 != local29) {
				local115 = Class43.method930(local4.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16);
				if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
					local4.anInt1601 = local29 * -244662783;
				} else {
					@Pc(385) boolean local385 = false;
					if (local4.aClass529_3 == null) {
						local385 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, -1665927432);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -75);
							local4.aClass529_3 = null;
							local385 = true;
						}
					}
					if (local385) {
						local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -128) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -50) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, -2041653980);
		}
	}

	@OriginalMember(owner = "client!akk", name = "al", descriptor = "(Lclient!aqb;)V")
	public static void method14214(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) aClass8_21.method237(-346688268)) {
			if (arg0 == local4.aClass120_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, 966116392);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -18);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 30);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akk", name = "ar", descriptor = "(Lclient!akk;IIII)V")
	static void method14215(@OriginalArg(0) Class80_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt1606 * -2023184157 == -1 && arg0.anIntArray186 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1597 * -803853751;
		if (arg0.anInt1605 * -742890459 != 0 && Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -35) != 0 && arg0.anInt1591 * -1499016133 == arg1) {
			if (arg0.aClass529_3 != null && (arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_7)) {
				Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) 7);
				arg0.aClass529_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass529_3 != null) {
				local203 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				local102 = (int) ((float) (arg0.anInt1599 * 1363501641) + (float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F);
				arg0.aClass463_46.aFloat297 = local203;
				arg0.aClass463_46.aFloat296 = local102;
			} else if (arg0.anInt1606 * -2023184157 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local122 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_46.aFloat297 = local102;
				arg0.aClass463_46.aFloat296 = local122;
				arg0.aClass529_3 = Class490.aClass263_13.method26536(Class280.aClass280_3, arg0, arg0.anInt1606 * -2023184157, -1, 0, Class278.aClass278_4.method26831(1119248624), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1605 * -742890459), arg0.aClass463_46, 0, local82, false, 1098495184);
				if (arg0.aClass529_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass529_3.method30749(local172, 150, (byte) -91);
					arg0.aClass529_3.method30726(-1793701056);
				}
			}
			if (arg0.aClass529_4 != null) {
				local203 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local203;
				arg0.aClass463_47.aFloat296 = local102;
				if (arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_7) {
					Class490.aClass263_13.method26582(arg0.aClass529_4, (byte) -9);
					arg0.aClass529_4 = null;
				}
			} else if (arg0.anIntArray186 != null && (arg0.anInt1603 -= arg4 * -855303383) * 487698713 <= 0) {
				local203 = arg0.anInt1592 * -2063181377 == 256 && arg0.anInt1604 * 973650713 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1592 * -2063181377 - arg0.anInt1604 * 973650713)) + arg0.anInt1604 * 973650713;
				local102 = (int) (Math.random() * (double) arg0.anIntArray186.length);
				local122 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				@Pc(333) int local333 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local122;
				arg0.aClass463_47.aFloat296 = local333;
				arg0.aClass529_4 = Class490.aClass263_13.method26536(Class280.aClass280_2, arg0, arg0.anIntArray186[local102], 0, local14, Class278.aClass278_9.method26831(1416584992), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1595 * 114272693 + arg0.anInt1605 * -742890459), arg0.aClass463_47, 0, local203, false, 1622208374);
				if (arg0.aClass529_4 != null) {
					arg0.aClass529_4.method30726(-1374232729);
				}
				arg0.anInt1603 = (arg0.anInt1607 * 2028704931 + (int) (Math.random() * (double) (arg0.anInt1594 * 482038367 - arg0.anInt1607 * 2028704931))) * -855303383;
			}
		} else if (arg0.aClass529_3 != null) {
			arg0.aClass529_3.method30788(100, -1432224252);
			Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) -4);
			arg0.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "au", descriptor = "(Lclient!akk;IIII)V")
	static void method14216(@OriginalArg(0) Class80_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt1606 * -2023184157 == -1 && arg0.anIntArray186 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1597 * -803853751;
		if (arg0.anInt1605 * -742890459 != 0 && Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 12) != 0 && arg0.anInt1591 * -1499016133 == arg1) {
			if (arg0.aClass529_3 != null && (arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_7)) {
				Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) -6);
				arg0.aClass529_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass529_3 != null) {
				local203 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				local102 = (int) ((float) (arg0.anInt1599 * 1363501641) + (float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F);
				arg0.aClass463_46.aFloat297 = local203;
				arg0.aClass463_46.aFloat296 = local102;
			} else if (arg0.anInt1606 * -2023184157 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local122 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_46.aFloat297 = local102;
				arg0.aClass463_46.aFloat296 = local122;
				arg0.aClass529_3 = Class490.aClass263_13.method26536(Class280.aClass280_3, arg0, arg0.anInt1606 * -2023184157, -1, 0, Class278.aClass278_4.method26831(415974173), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1605 * -742890459), arg0.aClass463_46, 0, local82, false, 744576591);
				if (arg0.aClass529_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass529_3.method30749(local172, 150, (byte) -33);
					arg0.aClass529_3.method30726(-1725447261);
				}
			}
			if (arg0.aClass529_4 != null) {
				local203 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local203;
				arg0.aClass463_47.aFloat296 = local102;
				if (arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_7) {
					Class490.aClass263_13.method26582(arg0.aClass529_4, (byte) 74);
					arg0.aClass529_4 = null;
				}
			} else if (arg0.anIntArray186 != null && (arg0.anInt1603 -= arg4 * -855303383) * 487698713 <= 0) {
				local203 = arg0.anInt1592 * -2063181377 == 256 && arg0.anInt1604 * 973650713 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1592 * -2063181377 - arg0.anInt1604 * 973650713)) + arg0.anInt1604 * 973650713;
				local102 = (int) (Math.random() * (double) arg0.anIntArray186.length);
				local122 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				@Pc(333) int local333 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local122;
				arg0.aClass463_47.aFloat296 = local333;
				arg0.aClass529_4 = Class490.aClass263_13.method26536(Class280.aClass280_2, arg0, arg0.anIntArray186[local102], 0, local14, Class278.aClass278_9.method26831(-363838656), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1595 * 114272693 + arg0.anInt1605 * -742890459), arg0.aClass463_47, 0, local203, false, -610939449);
				if (arg0.aClass529_4 != null) {
					arg0.aClass529_4.method30726(-1262221463);
				}
				arg0.anInt1603 = (arg0.anInt1607 * 2028704931 + (int) (Math.random() * (double) (arg0.anInt1594 * 482038367 - arg0.anInt1607 * 2028704931))) * -855303383;
			}
		} else if (arg0.aClass529_3 != null) {
			arg0.aClass529_3.method30788(100, 944956130);
			Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) 72);
			arg0.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "t", descriptor = "(FLclient!on;Lclient!on;Lclient!on;Lclient!on;Lclient!on;FFFFI)V")
	public static void method14217(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class463 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10) {
		if (arg2.method29480(arg1)) {
			return;
		}
		@Pc(8) Class463 local8 = Class463.method29487(arg2, arg1);
		@Pc(11) float local11 = local8.method29481();
		if (arg6 > 0.0F) {
			arg4 = Class463.method29472(arg4);
			arg4.method29496(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat297 || Float.isNaN(arg1.aFloat297) || local11 > arg8) {
			arg1.method29478(arg2);
			arg3.method29575();
			return;
		}
		@Pc(47) Class463 local47 = Class463.method29472(arg3);
		local47.method29543();
		@Pc(53) Class463 local53 = Class463.method29562(local47, arg4);
		@Pc(57) Class463 local57 = Class463.method29514(local47, local53);
		local57.method29496(0.5F);
		@Pc(63) Class463 local63 = Class463.method29472(arg3);
		@Pc(66) Class463 local66 = Class463.method29472(local8);
		local66.method29543();
		if (local57.aFloat297 > local66.aFloat297) {
			if (local8.aFloat297 < 0.0F) {
				local63.aFloat297 += arg0 * arg4.aFloat297;
				if (local63.aFloat297 > 0.0F) {
					local63.aFloat297 = 0.0F;
				}
			} else {
				local63.aFloat297 -= arg0 * arg4.aFloat297;
				if (local63.aFloat297 < 0.0F) {
					local63.aFloat297 = 0.0F;
				}
			}
		} else if (local47.aFloat297 < arg5.aFloat297) {
			if (local8.aFloat297 < 0.0F) {
				local63.aFloat297 -= arg0 * arg4.aFloat297;
				if (local63.aFloat297 < -arg5.aFloat297) {
					local63.aFloat297 = -arg5.aFloat297;
				}
			} else {
				local63.aFloat297 += arg0 * arg4.aFloat297;
				if (local63.aFloat297 > arg5.aFloat297) {
					local63.aFloat297 = arg5.aFloat297;
				}
			}
		}
		if (local57.aFloat295 > local66.aFloat295) {
			if (local8.aFloat295 < 0.0F) {
				local63.aFloat295 += arg0 * arg4.aFloat295;
				if (local63.aFloat295 > 0.0F) {
					local63.aFloat295 = 0.0F;
				}
			} else {
				local63.aFloat295 -= arg4.aFloat295 * arg0;
				if (local63.aFloat295 < 0.0F) {
					local63.aFloat295 = 0.0F;
				}
			}
		} else if (local47.aFloat295 < arg5.aFloat295) {
			if (local8.aFloat295 < 0.0F) {
				local63.aFloat295 -= arg0 * arg4.aFloat295;
				if (local63.aFloat295 < -arg5.aFloat295) {
					local63.aFloat295 = -arg5.aFloat295;
				}
			} else {
				local63.aFloat295 += arg0 * arg4.aFloat295;
				if (local63.aFloat295 > arg5.aFloat295) {
					local63.aFloat295 = arg5.aFloat295;
				}
			}
		}
		if (local57.aFloat296 > local66.aFloat296) {
			if (local8.aFloat296 < 0.0F) {
				local63.aFloat296 += arg0 * arg4.aFloat296;
				if (local63.aFloat296 > 0.0F) {
					local63.aFloat296 = 0.0F;
				}
			} else {
				local63.aFloat296 -= arg0 * arg4.aFloat296;
				if (local63.aFloat296 < 0.0F) {
					local63.aFloat296 = 0.0F;
				}
			}
		} else if (local47.aFloat296 < arg5.aFloat296) {
			if (local8.aFloat296 < 0.0F) {
				local63.aFloat296 -= arg4.aFloat296 * arg0;
				if (local63.aFloat296 < -arg5.aFloat296) {
					local63.aFloat296 = -arg5.aFloat296;
				}
			} else {
				local63.aFloat296 += arg0 * arg4.aFloat296;
				if (local63.aFloat296 > arg5.aFloat296) {
					local63.aFloat296 = arg5.aFloat296;
				}
			}
		}
		arg3.method29503(local63, 0.8F);
		if (local11 < arg9 && arg3.method29481() < arg9) {
			arg1.method29478(arg2);
			arg3.method29575();
		} else {
			arg1.method29483(Class463.method29551(arg3, arg0));
		}
		local47.method29557();
		local63.method29557();
		local66.method29557();
	}

	@OriginalMember(owner = "client!akk", name = "<init>", descriptor = "()V")
	Class80_Sub21() {
	}

	@OriginalMember(owner = "client!akk", name = "e", descriptor = "(I)V")
	void method14186(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anInt1606 * -2023184157;
		if (this.aClass625_1 != null) {
			@Pc(20) Class625 local20 = this.aClass625_1.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -181969835);
			if (local20 == null) {
				this.anInt1606 = -1322638539;
				this.anInt1605 = 0;
				this.anInt1597 = 0;
				this.anInt1607 = 0;
				this.anInt1594 = 0;
				this.anIntArray186 = null;
				this.anInt1592 = -1500102912;
				this.anInt1604 = -1536087808;
				this.anInt1595 = 0;
			} else {
				this.anInt1606 = local20.anInt5528 * -194304911;
				this.anInt1605 = (local20.anInt5529 * 1213693873 << 9) * -700377171;
				this.anInt1597 = local20.anInt5531 * 314316755;
				this.anInt1607 = local20.anInt5532 * -349490809;
				this.anInt1594 = local20.anInt5501 * -1136776763;
				this.anIntArray186 = local20.anIntArray501;
				this.anInt1592 = local20.anInt5536 * -104812385;
				this.anInt1604 = local20.anInt5535 * 223240771;
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(109) int local109 = Class336.method27870(this.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 27094);
			if (local4 != local109) {
				this.anInt1606 = local109 * 1322638539;
				@Pc(121) Class335 local121 = this.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local121.anIntArray416 != null) {
					local121 = local121.method27836(Class672.aClass134_1, Class672.aClass134_1, 1920269069);
				}
				if (local121 == null) {
					this.anInt1595 = 0;
					this.anInt1605 = 0;
					this.anInt1597 = 0;
					this.anInt1592 = -1500102912;
					this.anInt1604 = -1536087808;
				} else {
					this.anInt1605 = (local121.anInt4197 * -665240961 << 9) * -700377171;
					this.anInt1595 = (local121.anInt4220 * 1066329787 << 9) * 1014283421;
					this.anInt1597 = local121.anInt4221 * -463929735;
					this.anInt1592 = local121.anInt4228 * 1666948417;
					this.anInt1604 = local121.anInt4227 * 745115653;
				}
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1606 = Class43.method930(this.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16) * 1322638539;
			this.anInt1605 = (this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2719 * 1327765107 << 9) * -700377171;
			this.anInt1595 = 0;
			this.anInt1597 = this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
			this.anInt1592 = -1500102912;
			this.anInt1604 = -1536087808;
		}
		if (this.anInt1606 * -2023184157 != local4 && this.aClass529_3 != null && this.aClass529_3 != null) {
			this.aClass529_3.method30788(100, 106215768);
			Class490.aClass263_13.method26582(this.aClass529_3, (byte) -26);
			this.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "c", descriptor = "()V")
	void method14194() {
		@Pc(4) int local4 = this.anInt1606 * -2023184157;
		if (this.aClass625_1 != null) {
			@Pc(20) Class625 local20 = this.aClass625_1.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -872162645);
			if (local20 == null) {
				this.anInt1606 = -1322638539;
				this.anInt1605 = 0;
				this.anInt1597 = 0;
				this.anInt1607 = 0;
				this.anInt1594 = 0;
				this.anIntArray186 = null;
				this.anInt1592 = -1500102912;
				this.anInt1604 = -1536087808;
				this.anInt1595 = 0;
			} else {
				this.anInt1606 = local20.anInt5528 * -194304911;
				this.anInt1605 = (local20.anInt5529 * 1213693873 << 9) * -700377171;
				this.anInt1597 = local20.anInt5531 * 314316755;
				this.anInt1607 = local20.anInt5532 * -349490809;
				this.anInt1594 = local20.anInt5501 * -1136776763;
				this.anIntArray186 = local20.anIntArray501;
				this.anInt1592 = local20.anInt5536 * -104812385;
				this.anInt1604 = local20.anInt5535 * 223240771;
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(109) int local109 = Class336.method27870(this.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 28587);
			if (local4 != local109) {
				this.anInt1606 = local109 * 1322638539;
				@Pc(121) Class335 local121 = this.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local121.anIntArray416 != null) {
					local121 = local121.method27836(Class672.aClass134_1, Class672.aClass134_1, -663232299);
				}
				if (local121 == null) {
					this.anInt1595 = 0;
					this.anInt1605 = 0;
					this.anInt1597 = 0;
					this.anInt1592 = -1500102912;
					this.anInt1604 = -1536087808;
				} else {
					this.anInt1605 = (local121.anInt4197 * -665240961 << 9) * -700377171;
					this.anInt1595 = (local121.anInt4220 * 1066329787 << 9) * 1014283421;
					this.anInt1597 = local121.anInt4221 * -463929735;
					this.anInt1592 = local121.anInt4228 * 1666948417;
					this.anInt1604 = local121.anInt4227 * 745115653;
				}
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1606 = Class43.method930(this.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16) * 1322638539;
			this.anInt1605 = (this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2719 * 1327765107 << 9) * -700377171;
			this.anInt1595 = 0;
			this.anInt1597 = this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
			this.anInt1592 = -1500102912;
			this.anInt1604 = -1536087808;
		}
		if (this.anInt1606 * -2023184157 != local4 && this.aClass529_3 != null && this.aClass529_3 != null) {
			this.aClass529_3.method30788(100, -1789355541);
			Class490.aClass263_13.method26582(this.aClass529_3, (byte) -6);
			this.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ax", descriptor = "()V")
	void method14196() {
		@Pc(4) int local4 = this.anInt1606 * -2023184157;
		if (this.aClass625_1 != null) {
			@Pc(20) Class625 local20 = this.aClass625_1.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, 261864440);
			if (local20 == null) {
				this.anInt1606 = -1322638539;
				this.anInt1605 = 0;
				this.anInt1597 = 0;
				this.anInt1607 = 0;
				this.anInt1594 = 0;
				this.anIntArray186 = null;
				this.anInt1592 = -1500102912;
				this.anInt1604 = -1536087808;
				this.anInt1595 = 0;
			} else {
				this.anInt1606 = local20.anInt5528 * -194304911;
				this.anInt1605 = (local20.anInt5529 * 1213693873 << 9) * -700377171;
				this.anInt1597 = local20.anInt5531 * 314316755;
				this.anInt1607 = local20.anInt5532 * -349490809;
				this.anInt1594 = local20.anInt5501 * -1136776763;
				this.anIntArray186 = local20.anIntArray501;
				this.anInt1592 = local20.anInt5536 * -104812385;
				this.anInt1604 = local20.anInt5535 * 223240771;
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(109) int local109 = Class336.method27870(this.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 7100);
			if (local4 != local109) {
				this.anInt1606 = local109 * 1322638539;
				@Pc(121) Class335 local121 = this.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local121.anIntArray416 != null) {
					local121 = local121.method27836(Class672.aClass134_1, Class672.aClass134_1, 1689886862);
				}
				if (local121 == null) {
					this.anInt1595 = 0;
					this.anInt1605 = 0;
					this.anInt1597 = 0;
					this.anInt1592 = -1500102912;
					this.anInt1604 = -1536087808;
				} else {
					this.anInt1605 = (local121.anInt4197 * -665240961 << 9) * -700377171;
					this.anInt1595 = (local121.anInt4220 * 1066329787 << 9) * 1014283421;
					this.anInt1597 = local121.anInt4221 * -463929735;
					this.anInt1592 = local121.anInt4228 * 1666948417;
					this.anInt1604 = local121.anInt4227 * 745115653;
				}
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1606 = Class43.method930(this.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16) * 1322638539;
			this.anInt1605 = (this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2719 * 1327765107 << 9) * -700377171;
			this.anInt1595 = 0;
			this.anInt1597 = this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
			this.anInt1592 = -1500102912;
			this.anInt1604 = -1536087808;
		}
		if (this.anInt1606 * -2023184157 != local4 && this.aClass529_3 != null && this.aClass529_3 != null) {
			this.aClass529_3.method30788(100, -64413312);
			Class490.aClass263_13.method26582(this.aClass529_3, (byte) -46);
			this.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ay", descriptor = "()V")
	void method14197() {
		@Pc(4) int local4 = this.anInt1606 * -2023184157;
		if (this.aClass625_1 != null) {
			@Pc(20) Class625 local20 = this.aClass625_1.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -2065805867);
			if (local20 == null) {
				this.anInt1606 = -1322638539;
				this.anInt1605 = 0;
				this.anInt1597 = 0;
				this.anInt1607 = 0;
				this.anInt1594 = 0;
				this.anIntArray186 = null;
				this.anInt1592 = -1500102912;
				this.anInt1604 = -1536087808;
				this.anInt1595 = 0;
			} else {
				this.anInt1606 = local20.anInt5528 * -194304911;
				this.anInt1605 = (local20.anInt5529 * 1213693873 << 9) * -700377171;
				this.anInt1597 = local20.anInt5531 * 314316755;
				this.anInt1607 = local20.anInt5532 * -349490809;
				this.anInt1594 = local20.anInt5501 * -1136776763;
				this.anIntArray186 = local20.anIntArray501;
				this.anInt1592 = local20.anInt5536 * -104812385;
				this.anInt1604 = local20.anInt5535 * 223240771;
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(109) int local109 = Class336.method27870(this.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 18736);
			if (local4 != local109) {
				this.anInt1606 = local109 * 1322638539;
				@Pc(121) Class335 local121 = this.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local121.anIntArray416 != null) {
					local121 = local121.method27836(Class672.aClass134_1, Class672.aClass134_1, 1543680920);
				}
				if (local121 == null) {
					this.anInt1595 = 0;
					this.anInt1605 = 0;
					this.anInt1597 = 0;
					this.anInt1592 = -1500102912;
					this.anInt1604 = -1536087808;
				} else {
					this.anInt1605 = (local121.anInt4197 * -665240961 << 9) * -700377171;
					this.anInt1595 = (local121.anInt4220 * 1066329787 << 9) * 1014283421;
					this.anInt1597 = local121.anInt4221 * -463929735;
					this.anInt1592 = local121.anInt4228 * 1666948417;
					this.anInt1604 = local121.anInt4227 * 745115653;
				}
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1606 = Class43.method930(this.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16) * 1322638539;
			this.anInt1605 = (this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2719 * 1327765107 << 9) * -700377171;
			this.anInt1595 = 0;
			this.anInt1597 = this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
			this.anInt1592 = -1500102912;
			this.anInt1604 = -1536087808;
		}
		if (this.anInt1606 * -2023184157 != local4 && this.aClass529_3 != null && this.aClass529_3 != null) {
			this.aClass529_3.method30788(100, 2012102219);
			Class490.aClass263_13.method26582(this.aClass529_3, (byte) 69);
			this.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "b", descriptor = "()V")
	void method14208() {
		@Pc(4) int local4 = this.anInt1606 * -2023184157;
		if (this.aClass625_1 != null) {
			@Pc(20) Class625 local20 = this.aClass625_1.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -537021326);
			if (local20 == null) {
				this.anInt1606 = -1322638539;
				this.anInt1605 = 0;
				this.anInt1597 = 0;
				this.anInt1607 = 0;
				this.anInt1594 = 0;
				this.anIntArray186 = null;
				this.anInt1592 = -1500102912;
				this.anInt1604 = -1536087808;
				this.anInt1595 = 0;
			} else {
				this.anInt1606 = local20.anInt5528 * -194304911;
				this.anInt1605 = (local20.anInt5529 * 1213693873 << 9) * -700377171;
				this.anInt1597 = local20.anInt5531 * 314316755;
				this.anInt1607 = local20.anInt5532 * -349490809;
				this.anInt1594 = local20.anInt5501 * -1136776763;
				this.anIntArray186 = local20.anIntArray501;
				this.anInt1592 = local20.anInt5536 * -104812385;
				this.anInt1604 = local20.anInt5535 * 223240771;
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(109) int local109 = Class336.method27870(this.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 6845);
			if (local4 != local109) {
				this.anInt1606 = local109 * 1322638539;
				@Pc(121) Class335 local121 = this.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local121.anIntArray416 != null) {
					local121 = local121.method27836(Class672.aClass134_1, Class672.aClass134_1, 396531334);
				}
				if (local121 == null) {
					this.anInt1595 = 0;
					this.anInt1605 = 0;
					this.anInt1597 = 0;
					this.anInt1592 = -1500102912;
					this.anInt1604 = -1536087808;
				} else {
					this.anInt1605 = (local121.anInt4197 * -665240961 << 9) * -700377171;
					this.anInt1595 = (local121.anInt4220 * 1066329787 << 9) * 1014283421;
					this.anInt1597 = local121.anInt4221 * -463929735;
					this.anInt1592 = local121.anInt4228 * 1666948417;
					this.anInt1604 = local121.anInt4227 * 745115653;
				}
			}
		} else if (this.aClass120_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1606 = Class43.method930(this.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16) * 1322638539;
			this.anInt1605 = (this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2719 * 1327765107 << 9) * -700377171;
			this.anInt1595 = 0;
			this.anInt1597 = this.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
			this.anInt1592 = -1500102912;
			this.anInt1604 = -1536087808;
		}
		if (this.anInt1606 * -2023184157 != local4 && this.aClass529_3 != null && this.aClass529_3 != null) {
			this.aClass529_3.method30788(100, -1275737159);
			Class490.aClass263_13.method26582(this.aClass529_3, (byte) -32);
			this.aClass529_3 = null;
		}
	}
}
