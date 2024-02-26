package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!y")
public final class Class676 {

	@OriginalMember(owner = "client!y", name = "t", descriptor = "Ljava/lang/String;")
	public String aString236;

	@OriginalMember(owner = "client!y", name = "f", descriptor = "Ljava/lang/String;")
	public String aString237;

	@OriginalMember(owner = "client!y", name = "u", descriptor = "Ljava/lang/String;")
	public String aString238;

	@OriginalMember(owner = "client!y", name = "m", descriptor = "Z")
	public boolean aBoolean983;

	@OriginalMember(owner = "client!y", name = "l", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!y", name = "g", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!y", name = "e", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!y", name = "i", descriptor = "Z")
	public boolean aBoolean984;

	@OriginalMember(owner = "client!y", name = "o", descriptor = "Ljava/lang/String;")
	public String aString239;

	@OriginalMember(owner = "client!y", name = "j", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!y", name = "nc", descriptor = "(I)I")
	public static int method33586(@OriginalArg(0) int arg0) {
		return Class698.aClass638_1.aBoolean963 ? 3 : 2;
	}

	@OriginalMember(owner = "client!y", name = "u", descriptor = "(IIIILclient!vv;Lclient!aqb;Lclient!aqc;B)V")
	public static void method33587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) Class120_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class120_Sub1_Sub1_Sub1_Sub2 arg6, @OriginalArg(7) byte arg7) {
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
				local3.method14186(1930873627);
			}
			if (local3.anIntArray186 != null) {
				local3.anInt1603 = (local3.anInt1607 * 2028704931 + (int) (Math.random() * (double) (local3.anInt1594 * 482038367 - local3.anInt1607 * 2028704931))) * -855303383;
			}
			Class80_Sub21.aClass8_22.method232(local3, 2109559459);
			Class490.aClass263_13.method26518(local3.anInt1606 * -2023184157, (byte) 0);
			Class490.aClass263_13.method26529(local3.anIntArray186, (byte) -115);
		} else if (arg5 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class335 local192 = arg5.aClass335_1;
			if (local192.anIntArray416 != null) {
				local3.aBoolean368 = true;
				local192 = local192.method27836(Class672.aClass134_1, Class672.aClass134_1, -1008583581);
			}
			if (local192 != null) {
				local3.anInt1593 = (local192.anInt4212 * 1573297955 + arg1 << 9) * -53776127;
				local3.anInt1596 = (arg2 + local192.anInt4212 * 1573297955 << 9) * 655931665;
				local3.anInt1606 = Class336.method27870(arg5, (short) 8499) * 1322638539;
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
			Class80_Sub21.aClass8_21.method232(local3, 113673587);
		} else if (arg6 != null) {
			local3.aClass120_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1593 = (arg1 + arg6.method18966((byte) -96) << 9) * -53776127;
			local3.anInt1596 = (arg2 + arg6.method18966((byte) -68) << 9) * 655931665;
			local3.anInt1606 = Class43.method930(arg6, (byte) 16) * 1322638539;
			local3.anInt1605 = (arg6.anInt2719 * 1327765107 << 9) * -700377171;
			local3.anInt1597 = arg6.anInt2720 * -1071821255;
			local3.anInt1592 = -1500102912;
			local3.anInt1604 = -1536087808;
			local3.anInt1595 = 0;
			Class80_Sub21.aClass24_12.method563(local3, (long) (arg6.anInt2671 * 1078276675));
			Class490.aClass263_13.method26518(arg6.anInt2715 * -198686229, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2716 * -1447185825, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2717 * 182837111, (byte) 0);
			Class490.aClass263_13.method26518(arg6.anInt2718 * 799167223, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!y", name = "u", descriptor = "(Lclient!yb;I)V")
	public static void method33588(@OriginalArg(0) Interface73 arg0, @OriginalArg(1) int arg1) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!y", name = "g", descriptor = "(Lclient!ajp;ZI)V")
	static void method33589(@OriginalArg(0) Class80_Sub8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0.aBoolean338) {
			if (arg0.anInt1474 * 1972376445 < 0 || Class221.method25910(client.aClass539_1.method30905(-1470033010), arg0.anInt1474 * 1972376445, arg0.anInt1479 * 315811093, (byte) 3)) {
				if (arg1) {
					Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, null, 2115334400);
				} else {
					Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1474 * 1972376445, arg0.anInt1475 * -464346623, arg0.anInt1479 * 315811093, arg0.aClass457_52, -1, 0, 632956154);
				}
				arg0.method24395((byte) 17);
			}
		} else if (arg0.aBoolean337 && arg0.anInt1476 * 781975081 >= 1 && arg0.anInt1473 * -1479987305 >= 1 && arg0.anInt1476 * 781975081 <= client.aClass539_1.method30921(1990984471) - 2 && arg0.anInt1473 * -1479987305 <= client.aClass539_1.method31011(972891326) - 2 && (arg0.anInt1477 * -1290874527 < 0 || Class221.method25910(client.aClass539_1.method30905(-1533102955), arg0.anInt1477 * -1290874527, arg0.anInt1472 * -1457038831, (byte) 3))) {
			if (arg1) {
				Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.aClass614_1, 2003672591);
			} else {
				Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1477 * -1290874527, arg0.anInt1480 * -1606480543, arg0.anInt1472 * -1457038831, arg0.aClass457_53, -1, 0, 632956154);
			}
			arg0.aBoolean337 = false;
			if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1474 * 1972376445 == -1) {
				arg0.method24395((byte) 60);
			} else if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1480 * -1606480543 == arg0.anInt1475 * -464346623 && arg0.anInt1479 * 315811093 == arg0.anInt1472 * -1457038831) {
				arg0.method24395((byte) 102);
			}
		}
	}

	@OriginalMember(owner = "client!y", name = "anf", descriptor = "(Lclient!yp;B)V")
	static void method33590(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class160.aClass121_Sub1_2.method9647(Class567.method31516(local12, (byte) 1), true, -1950241554);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!y", name = "<init>", descriptor = "()V")
	Class676() {
	}
}
