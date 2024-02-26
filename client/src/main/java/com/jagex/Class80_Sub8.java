package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajp")
public final class Class80_Sub8 extends Class80 {

	@OriginalMember(owner = "client!ajp", name = "d", descriptor = "Lclient!aag;")
	public static Class8 aClass8_19 = new Class8();

	@OriginalMember(owner = "client!ajp", name = "z", descriptor = "Lclient!aag;")
	public static Class8 aClass8_20 = new Class8();

	@OriginalMember(owner = "client!ajp", name = "p", descriptor = "J")
	static long aLong69 = 9034042645872457671L;

	@OriginalMember(owner = "client!ajp", name = "l", descriptor = "I")
	int anInt1471;

	@OriginalMember(owner = "client!ajp", name = "x", descriptor = "I")
	int anInt1472;

	@OriginalMember(owner = "client!ajp", name = "i", descriptor = "I")
	public int anInt1473;

	@OriginalMember(owner = "client!ajp", name = "m", descriptor = "I")
	int anInt1474;

	@OriginalMember(owner = "client!ajp", name = "o", descriptor = "I")
	int anInt1475;

	@OriginalMember(owner = "client!ajp", name = "g", descriptor = "I")
	public int anInt1476;

	@OriginalMember(owner = "client!ajp", name = "a", descriptor = "Lclient!oc;")
	Class457 aClass457_52;

	@OriginalMember(owner = "client!ajp", name = "s", descriptor = "I")
	public int anInt1477;

	@OriginalMember(owner = "client!ajp", name = "u", descriptor = "I")
	int anInt1478;

	@OriginalMember(owner = "client!ajp", name = "r", descriptor = "Lclient!vj;")
	Class614 aClass614_1;

	@OriginalMember(owner = "client!ajp", name = "j", descriptor = "I")
	int anInt1479;

	@OriginalMember(owner = "client!ajp", name = "w", descriptor = "Lclient!oc;")
	Class457 aClass457_53;

	@OriginalMember(owner = "client!ajp", name = "k", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!ajp", name = "q", descriptor = "Z")
	boolean aBoolean337 = true;

	@OriginalMember(owner = "client!ajp", name = "h", descriptor = "Z")
	boolean aBoolean338 = false;

	@OriginalMember(owner = "client!ajp", name = "y", descriptor = "(Lclient!ajp;)V")
	static void method13473(@OriginalArg(0) Class80_Sub8 arg0) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		if (local3 == null) {
			return;
		}
		@Pc(8) Interface60 local8 = null;
		if (arg0.anInt1471 * 119933899 == 0) {
			local8 = (Interface60) local3.method31570(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) -96);
		}
		if (arg0.anInt1471 * 119933899 == 1) {
			local8 = (Interface60) local3.method31572(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) 102);
		}
		if (arg0.anInt1471 * 119933899 == 2) {
			local8 = (Interface60) local3.method31574(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, client.anInterface62_1, (byte) -78);
		}
		if (arg0.anInt1471 * 119933899 == 3) {
			local8 = (Interface60) local3.method31558(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, 1924745925);
		}
		if (local8 == null) {
			arg0.anInt1474 = -391593429;
			arg0.anInt1479 = 0;
			arg0.anInt1475 = 0;
		} else {
			arg0.anInt1474 = local8.method13834((byte) -43) * 391593429;
			arg0.anInt1479 = local8.method13819(1586490828) * 502284861;
			arg0.anInt1475 = local8.method13820(465135873) * -1036952063;
		}
		if (local8 instanceof Class120_Sub1) {
			@Pc(139) Class120_Sub1 local139 = (Class120_Sub1) local8;
			arg0.aClass457_53 = local139.aClass457_89 == null ? null : new Class457(local139.aClass457_89);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "o", descriptor = "(IIIIIIILclient!oc;)V")
	public static void method13474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) aClass8_19.method247(129206984); local6 != null; local6 = (Class80_Sub8) aClass8_19.method237(-1031842503)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && local6.anInt1473 * -1479987305 == arg2 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass539_1.method30921(1994673663) && arg2 < client.aClass539_1.method31011(-371161295)) {
				Class618.method32297(local1, (byte) 2);
			}
			aClass8_19.method232(local1, -62623868);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.anInt1480 = arg6 * 1847219873;
		if (arg7 != null) {
			local1.aClass457_53 = new Class457(arg7);
		}
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ajp", name = "j", descriptor = "(IIIIIIILclient!oc;)V")
	public static void method13475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) aClass8_19.method247(129206984); local6 != null; local6 = (Class80_Sub8) aClass8_19.method237(-229581493)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && local6.anInt1473 * -1479987305 == arg2 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass539_1.method30921(2100329521) && arg2 < client.aClass539_1.method31011(-765955564)) {
				Class618.method32297(local1, (byte) 2);
			}
			aClass8_19.method232(local1, 1113501205);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.anInt1480 = arg6 * 1847219873;
		if (arg7 != null) {
			local1.aClass457_53 = new Class457(arg7);
		}
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ajp", name = "v", descriptor = "()V")
	public static void method13476() {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_19.method237(-28715601)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 83);
			} else {
				local4.aBoolean337 = true;
				if (local4.anInt1476 * 781975081 >= 0 && local4.anInt1473 * -1479987305 >= 0 && local4.anInt1476 * 781975081 < client.aClass539_1.method30921(2046714014) && local4.anInt1473 * -1479987305 < client.aClass539_1.method31011(-797417404)) {
					Class618.method32297(local4, (byte) 2);
				}
			}
		}
		for (local4 = (Class80_Sub8) aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_20.method237(-917268794)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 43);
			} else {
				local4.aBoolean337 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajp", name = "s", descriptor = "(IIIIIILclient!vj;)V")
	static void method13477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class614 arg6) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) aClass8_20.method247(129206984); local6 != null; local6 = (Class80_Sub8) aClass8_20.method237(-27100033)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && arg2 == local6.anInt1473 * -1479987305 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			aClass8_20.method232(local1, 1373484591);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.aClass614_1 = arg6;
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ajp", name = "n", descriptor = "(Lclient!ajp;)V")
	static void method13478(@OriginalArg(0) Class80_Sub8 arg0) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		if (local3 == null) {
			return;
		}
		@Pc(8) Interface60 local8 = null;
		if (arg0.anInt1471 * 119933899 == 0) {
			local8 = (Interface60) local3.method31570(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) 26);
		}
		if (arg0.anInt1471 * 119933899 == 1) {
			local8 = (Interface60) local3.method31572(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) 48);
		}
		if (arg0.anInt1471 * 119933899 == 2) {
			local8 = (Interface60) local3.method31574(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, client.anInterface62_1, (byte) -88);
		}
		if (arg0.anInt1471 * 119933899 == 3) {
			local8 = (Interface60) local3.method31558(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, 708492241);
		}
		if (local8 == null) {
			arg0.anInt1474 = -391593429;
			arg0.anInt1479 = 0;
			arg0.anInt1475 = 0;
		} else {
			arg0.anInt1474 = local8.method13834((byte) 38) * 391593429;
			arg0.anInt1479 = local8.method13819(1776753176) * 502284861;
			arg0.anInt1475 = local8.method13820(1908536134) * -1036952063;
		}
		if (local8 instanceof Class120_Sub1) {
			@Pc(139) Class120_Sub1 local139 = (Class120_Sub1) local8;
			arg0.aClass457_53 = local139.aClass457_89 == null ? null : new Class457(local139.aClass457_89);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "ax", descriptor = "(Lclient!ajp;Z)V")
	static void method13479(@OriginalArg(0) Class80_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean338) {
			if (arg0.anInt1474 * 1972376445 < 0 || Class221.method25910(client.aClass539_1.method30905(-1513004339), arg0.anInt1474 * 1972376445, arg0.anInt1479 * 315811093, (byte) 3)) {
				if (arg1) {
					Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, null, 2105739006);
				} else {
					Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1474 * 1972376445, arg0.anInt1475 * -464346623, arg0.anInt1479 * 315811093, arg0.aClass457_52, -1, 0, 632956154);
				}
				arg0.method24395((byte) 50);
			}
		} else if (arg0.aBoolean337 && arg0.anInt1476 * 781975081 >= 1 && arg0.anInt1473 * -1479987305 >= 1 && arg0.anInt1476 * 781975081 <= client.aClass539_1.method30921(2038765415) - 2 && arg0.anInt1473 * -1479987305 <= client.aClass539_1.method31011(348083079) - 2 && (arg0.anInt1477 * -1290874527 < 0 || Class221.method25910(client.aClass539_1.method30905(-353191958), arg0.anInt1477 * -1290874527, arg0.anInt1472 * -1457038831, (byte) 3))) {
			if (arg1) {
				Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.aClass614_1, 1736021984);
			} else {
				Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1477 * -1290874527, arg0.anInt1480 * -1606480543, arg0.anInt1472 * -1457038831, arg0.aClass457_53, -1, 0, 632956154);
			}
			arg0.aBoolean337 = false;
			if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1474 * 1972376445 == -1) {
				arg0.method24395((byte) 59);
			} else if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1480 * -1606480543 == arg0.anInt1475 * -464346623 && arg0.anInt1479 * 315811093 == arg0.anInt1472 * -1457038831) {
				arg0.method24395((byte) 3);
			}
		}
	}

	@OriginalMember(owner = "client!ajp", name = "p", descriptor = "()V")
	public static void method13480() {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_19.method237(39174590)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 116);
			} else {
				local4.aBoolean337 = true;
				if (local4.anInt1476 * 781975081 >= 0 && local4.anInt1473 * -1479987305 >= 0 && local4.anInt1476 * 781975081 < client.aClass539_1.method30921(2121851112) && local4.anInt1473 * -1479987305 < client.aClass539_1.method31011(-621616478)) {
					Class618.method32297(local4, (byte) 2);
				}
			}
		}
		for (local4 = (Class80_Sub8) aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_20.method237(-686631010)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 113);
			} else {
				local4.aBoolean337 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajp", name = "x", descriptor = "(IIIIIILclient!vj;)V")
	static void method13481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class614 arg6) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) aClass8_20.method247(129206984); local6 != null; local6 = (Class80_Sub8) aClass8_20.method237(444957792)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && arg2 == local6.anInt1473 * -1479987305 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			aClass8_20.method232(local1, 1315556691);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.aClass614_1 = arg6;
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ajp", name = "z", descriptor = "()V")
	public static void method13482() {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_19.method237(-1048741076)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 57);
			} else {
				local4.aBoolean337 = true;
				if (local4.anInt1476 * 781975081 >= 0 && local4.anInt1473 * -1479987305 >= 0 && local4.anInt1476 * 781975081 < client.aClass539_1.method30921(2048484533) && local4.anInt1473 * -1479987305 < client.aClass539_1.method31011(-1480691970)) {
					Class618.method32297(local4, (byte) 2);
				}
			}
		}
		for (local4 = (Class80_Sub8) aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_20.method237(-619174206)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 5);
			} else {
				local4.aBoolean337 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajp", name = "c", descriptor = "()V")
	static void method13483() {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_19.method237(414498249)) {
			Class676.method33589(local4, false, 2068226776);
		}
		for (local4 = (Class80_Sub8) aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) aClass8_20.method237(46541351)) {
			Class676.method33589(local4, true, -196729640);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "b", descriptor = "(Lclient!ajp;Z)V")
	static void method13484(@OriginalArg(0) Class80_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean338) {
			if (arg0.anInt1474 * 1972376445 < 0 || Class221.method25910(client.aClass539_1.method30905(-1089889206), arg0.anInt1474 * 1972376445, arg0.anInt1479 * 315811093, (byte) 3)) {
				if (arg1) {
					Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, null, 2105292691);
				} else {
					Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1474 * 1972376445, arg0.anInt1475 * -464346623, arg0.anInt1479 * 315811093, arg0.aClass457_52, -1, 0, 632956154);
				}
				arg0.method24395((byte) 37);
			}
		} else if (arg0.aBoolean337 && arg0.anInt1476 * 781975081 >= 1 && arg0.anInt1473 * -1479987305 >= 1 && arg0.anInt1476 * 781975081 <= client.aClass539_1.method30921(2001993056) - 2 && arg0.anInt1473 * -1479987305 <= client.aClass539_1.method31011(-1635503034) - 2 && (arg0.anInt1477 * -1290874527 < 0 || Class221.method25910(client.aClass539_1.method30905(-681054222), arg0.anInt1477 * -1290874527, arg0.anInt1472 * -1457038831, (byte) 3))) {
			if (arg1) {
				Class104.method7688(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.aClass614_1, 1726251865);
			} else {
				Class689.method36956(arg0.anInt1478 * -31519745, arg0.anInt1471 * 119933899, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, arg0.anInt1477 * -1290874527, arg0.anInt1480 * -1606480543, arg0.anInt1472 * -1457038831, arg0.aClass457_53, -1, 0, 632956154);
			}
			arg0.aBoolean337 = false;
			if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1474 * 1972376445 == -1) {
				arg0.method24395((byte) 57);
			} else if (!arg1 && arg0.anInt1474 * 1972376445 == arg0.anInt1477 * -1290874527 && arg0.anInt1480 * -1606480543 == arg0.anInt1475 * -464346623 && arg0.anInt1479 * 315811093 == arg0.anInt1472 * -1457038831) {
				arg0.method24395((byte) 67);
			}
		}
	}

	@OriginalMember(owner = "client!ajp", name = "ai", descriptor = "(IIIILclient!vj;)V")
	static void method13485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class614 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass539_1.method30921(2072157519) - 2 || arg3 > client.aClass539_1.method31011(-1545886318) - 2) {
			return;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(34) Interface60 local34 = client.aClass539_1.method30910((byte) -4).method12011(arg0, arg1, arg2, arg3, -16777216);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class120_Sub1_Sub1_Sub2) {
			((Class120_Sub1_Sub1_Sub2) local34).method12203(arg4, (byte) -38);
		} else if (local34 instanceof Class120_Sub1_Sub4_Sub1) {
			((Class120_Sub1_Sub4_Sub1) local34).method13023(arg4, -1573664033);
		} else if (local34 instanceof Class120_Sub1_Sub2_Sub2) {
			((Class120_Sub1_Sub2_Sub2) local34).method13695(arg4, -1803993526);
		} else if (local34 instanceof Class120_Sub1_Sub3_Sub1) {
			((Class120_Sub1_Sub3_Sub1) local34).method12742(arg4, 1456134871);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "ay", descriptor = "(IIIIIIILclient!oc;II)V")
	static void method13486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass539_1.method30921(1921768614) - 2 || arg3 > client.aClass539_1.method31011(-1856203225) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass539_1.method30903(-463929735).method30429(arg2, arg3, 1027533769)) {
			local21 = arg0 + 1;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		client.aClass539_1.method30910((byte) -122).method12004(Class279.aClass102_9, arg0, arg1, arg2, arg3, (byte) -20);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(375510044);
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 58);
			client.aClass539_1.method30910((byte) -97).method12001(Class279.aClass102_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, 1846943724);
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, local55, (byte) 88);
		}
		Class97.method2118(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1464656108);
	}

	@OriginalMember(owner = "client!ajp", name = "a", descriptor = "(IIIIIILclient!vj;)V")
	static void method13487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class614 arg6) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) aClass8_20.method247(129206984); local6 != null; local6 = (Class80_Sub8) aClass8_20.method237(-1910086518)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && arg2 == local6.anInt1473 * -1479987305 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			aClass8_20.method232(local1, 1552858333);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.aClass614_1 = arg6;
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ajp", name = "aq", descriptor = "(IIIILclient!vj;)V")
	static void method13488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class614 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass539_1.method30921(2004289546) - 2 || arg3 > client.aClass539_1.method31011(323853632) - 2) {
			return;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(34) Interface60 local34 = client.aClass539_1.method30910((byte) -15).method12011(arg0, arg1, arg2, arg3, -16777216);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class120_Sub1_Sub1_Sub2) {
			((Class120_Sub1_Sub1_Sub2) local34).method12203(arg4, (byte) -22);
		} else if (local34 instanceof Class120_Sub1_Sub4_Sub1) {
			((Class120_Sub1_Sub4_Sub1) local34).method13023(arg4, -353726303);
		} else if (local34 instanceof Class120_Sub1_Sub2_Sub2) {
			((Class120_Sub1_Sub2_Sub2) local34).method13695(arg4, 1997136309);
		} else if (local34 instanceof Class120_Sub1_Sub3_Sub1) {
			((Class120_Sub1_Sub3_Sub1) local34).method12742(arg4, -912091494);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "ao", descriptor = "(IIIILclient!vj;)V")
	static void method13489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class614 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass539_1.method30921(2134589807) - 2 || arg3 > client.aClass539_1.method31011(-173501407) - 2) {
			return;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(34) Interface60 local34 = client.aClass539_1.method30910((byte) -54).method12011(arg0, arg1, arg2, arg3, -16777216);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class120_Sub1_Sub1_Sub2) {
			((Class120_Sub1_Sub1_Sub2) local34).method12203(arg4, (byte) -114);
		} else if (local34 instanceof Class120_Sub1_Sub4_Sub1) {
			((Class120_Sub1_Sub4_Sub1) local34).method13023(arg4, -1757723047);
		} else if (local34 instanceof Class120_Sub1_Sub2_Sub2) {
			((Class120_Sub1_Sub2_Sub2) local34).method13695(arg4, -1913465180);
		} else if (local34 instanceof Class120_Sub1_Sub3_Sub1) {
			((Class120_Sub1_Sub3_Sub1) local34).method12742(arg4, -1540409032);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "gg", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method13490(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg2.anIntArray525[arg2.anInt5778 * 1896589581];
		@Pc(24) short local24 = (short) arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method27661(local13, local24, local35, 1479624119);
		Class296.method26998(arg0, -771685465);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class24.method584(arg0.anInt4087 * -2053489901, local13, (byte) 116);
		}
	}

	@OriginalMember(owner = "client!ajp", name = "<init>", descriptor = "()V")
	Class80_Sub8() {
	}
}
