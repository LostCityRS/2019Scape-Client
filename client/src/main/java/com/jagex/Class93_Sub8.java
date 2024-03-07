package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajt")
public final class Class93_Sub8 extends Class93 {

	@OriginalMember(owner = "client!ajt", name = "x", descriptor = "Lclient!aat;")
	public static Class22 aClass22_18 = new Class22();

	@OriginalMember(owner = "client!ajt", name = "b", descriptor = "Lclient!aat;")
	public static Class22 aClass22_19 = new Class22();

	@OriginalMember(owner = "client!ajt", name = "h", descriptor = "J")
	static long aLong63 = 7408032350761746613L;

	@OriginalMember(owner = "client!ajt", name = "w", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!ajt", name = "u", descriptor = "I")
	int anInt1463;

	@OriginalMember(owner = "client!ajt", name = "l", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!ajt", name = "f", descriptor = "I")
	int anInt1465;

	@OriginalMember(owner = "client!ajt", name = "o", descriptor = "Lclient!oe;")
	Class458 aClass458_48;

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "I")
	int anInt1466;

	@OriginalMember(owner = "client!ajt", name = "p", descriptor = "I")
	int anInt1467;

	@OriginalMember(owner = "client!ajt", name = "d", descriptor = "Lclient!oe;")
	Class458 aClass458_49;

	@OriginalMember(owner = "client!ajt", name = "c", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!ajt", name = "r", descriptor = "I")
	public int anInt1469;

	@OriginalMember(owner = "client!ajt", name = "v", descriptor = "I")
	int anInt1470;

	@OriginalMember(owner = "client!ajt", name = "k", descriptor = "I")
	int anInt1471;

	@OriginalMember(owner = "client!ajt", name = "s", descriptor = "Lclient!vp;")
	Class620 aClass620_1;

	@OriginalMember(owner = "client!ajt", name = "y", descriptor = "Z")
	boolean aBoolean308 = true;

	@OriginalMember(owner = "client!ajt", name = "q", descriptor = "Z")
	boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ajt", name = "<init>", descriptor = "()V", line = 36)
	Class93_Sub8() {
	}

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "(IIIIIIILclient!oe;)V", line = 39)
	public static void method12972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_18.method428((byte) 74); local6 != null; local6 = (Class93_Sub8) aClass22_18.method442(78741968)) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && arg2 == local6.anInt1464 * 275343381 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass532_1.method30459(-1117309661) && arg2 < client.aClass532_1.method30466((short) 128)) {
				Class593.method31714(local1, (byte) 75);
			}
			aClass22_18.method408(local1, -905425108);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.anInt1469 = arg6 * -2025107705;
		if (arg7 != null) {
			local1.aClass458_48 = new Class458(arg7);
		}
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "p", descriptor = "(IIIIIILclient!vp;)V", line = 68)
	static void method12973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class620 arg6) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_19.method428((byte) 35); local6 != null; local6 = (Class93_Sub8) aClass22_19.method442(2083217962)) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && local6.anInt1464 * 275343381 == arg2 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			aClass22_19.method408(local1, -83289868);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.aClass620_1 = arg6;
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "d", descriptor = "(IIIIIILclient!vp;)V", line = 68)
	static void method12974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class620 arg6) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_19.method428((byte) 26); local6 != null; local6 = (Class93_Sub8) aClass22_19.method442(1391121554)) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && local6.anInt1464 * 275343381 == arg2 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			aClass22_19.method408(local1, -1471113189);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.aClass620_1 = arg6;
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "c", descriptor = "()V", line = 93)
	public static final void method12975() {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) aClass22_18.method428((byte) 10); local4 != null; local4 = (Class93_Sub8) aClass22_18.method442(158750935)) {
			if (local4.aBoolean309) {
				local4.method23969(408253235);
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.aClass532_1.method30459(1341986117) && local4.anInt1464 * 275343381 < client.aClass532_1.method30466((short) 128)) {
					Class593.method31714(local4, (byte) 98);
				}
			}
		}
		for (local4 = (Class93_Sub8) aClass22_19.method428((byte) 81); local4 != null; local4 = (Class93_Sub8) aClass22_19.method442(428436553)) {
			if (local4.aBoolean309) {
				local4.method23969(742243536);
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "r", descriptor = "()V", line = 93)
	public static final void method12976() {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) aClass22_18.method428((byte) 114); local4 != null; local4 = (Class93_Sub8) aClass22_18.method442(1648319946)) {
			if (local4.aBoolean309) {
				local4.method23969(65184169);
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.aClass532_1.method30459(-1683340199) && local4.anInt1464 * 275343381 < client.aClass532_1.method30466((short) 128)) {
					Class593.method31714(local4, (byte) 58);
				}
			}
		}
		for (local4 = (Class93_Sub8) aClass22_19.method428((byte) 21); local4 != null; local4 = (Class93_Sub8) aClass22_19.method442(135144917)) {
			if (local4.aBoolean309) {
				local4.method23969(1466995021);
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "v", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12977(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1407288324);
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31534(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -1309876799);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31544(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -2053229577);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31551(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1, (byte) 3);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31556(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -968156135);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423(-1037211373) * 1906814085;
			arg0.anInt1467 = local9.method13420(1655784427) * -878129807;
			arg0.anInt1466 = local9.method13404(1753564360) * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "y", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12978(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1822393435);
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31534(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -1309876799);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31544(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -2022350372);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31551(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1, (byte) 3);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31556(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -968156135);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423(-1037211373) * 1906814085;
			arg0.anInt1467 = local9.method13420(1876424298) * -878129807;
			arg0.anInt1466 = local9.method13404(1919855678) * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "x", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12979(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1311730114);
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31534(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -1309876799);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31544(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -2021262557);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31551(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1, (byte) 3);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31556(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -968156135);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423(-1037211373) * 1906814085;
			arg0.anInt1467 = local9.method13420(2067672286) * -878129807;
			arg0.anInt1466 = local9.method13404(2051068568) * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "h", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12980(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-2078542162);
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31534(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -1309876799);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31544(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -2075541598);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31551(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1, (byte) 3);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31556(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -968156135);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423(-1037211373) * 1906814085;
			arg0.anInt1467 = local9.method13420(1264886105) * -878129807;
			arg0.anInt1466 = local9.method13404(1529887803) * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "a", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12981(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30496(1323164677), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735, -538565595)) {
				if (arg1) {
					Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null, -1222567641);
				} else {
					Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0, (byte) -43);
				}
				arg0.method23969(166823302);
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30459(-284988811) - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30466((short) 128) - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30496(1569724830), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277, -381980917))) {
			if (arg1) {
				Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1, -1222567641);
			} else {
				Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0, (byte) 108);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969(1503772486);
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969(-557721086);
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "i", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12982(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30496(1253380541), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735, -105776012)) {
				if (arg1) {
					Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null, -1222567641);
				} else {
					Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0, (byte) 9);
				}
				arg0.method23969(517948);
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30459(-2104156538) - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30466((short) 128) - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30496(585617702), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277, -373719420))) {
			if (arg1) {
				Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1, -1222567641);
			} else {
				Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0, (byte) 10);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969(-686336884);
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969(-628732825);
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "g", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12983(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30496(2071813811), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735, 1170360286)) {
				if (arg1) {
					Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null, -1222567641);
				} else {
					Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0, (byte) -11);
				}
				arg0.method23969(-1464653331);
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30459(-1117519653) - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30466((short) 128) - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30496(1932426912), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277, -160398811))) {
			if (arg1) {
				Class591.method31698(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1, -1222567641);
			} else {
				Class71.method1247(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0, (byte) 91);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969(1106757087);
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969(-875932853);
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "t", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-156311565) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(1899996218).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1038088835) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) -28);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(1093684106);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 55);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 103);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1661685008);
	}

	@OriginalMember(owner = "client!ajt", name = "j", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-1138440711) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(1005561303).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1073197963) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) -11);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-338865942);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 98);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 44);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1580287878);
	}

	@OriginalMember(owner = "client!ajt", name = "ae", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-1618540640) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(309764387).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1591678321) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) 0);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(1722753516);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 9);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 101);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1851289393);
	}

	@OriginalMember(owner = "client!ajt", name = "ag", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-1949864453) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(838189183).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1728396934) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) -62);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1891663171);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 50);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 33);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1247875724);
	}

	@OriginalMember(owner = "client!ajt", name = "ah", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-700603674) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(1201450591).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1312041345) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) 4);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1125083481);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 125);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 52);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 2004575590);
	}

	@OriginalMember(owner = "client!ajt", name = "ac", descriptor = "(IIIILclient!vp;)V", line = 187)
	static final void method12989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class620 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-659773547) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		if (client.aClass532_1.method30481(-1074322739) == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass532_1.method30511(-310507201).method10987(arg0, arg1, arg2, arg3, 1451082900);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
			((Class132_Sub1_Sub1_Sub3) local34).method13299(arg4, (byte) -97);
		} else if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
			((Class132_Sub1_Sub4_Sub1) local34).method12961(arg4, 323896363);
		} else if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
			((Class132_Sub1_Sub2_Sub2) local34).method12447(arg4, -1963706549);
		} else if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
			((Class132_Sub1_Sub3_Sub1) local34).method12302(arg4, (byte) -125);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "al", descriptor = "(IIIILclient!vp;)V", line = 187)
	static final void method12990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class620 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(47465390) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		if (client.aClass532_1.method30481(-1487512930) == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass532_1.method30511(-310507201).method10987(arg0, arg1, arg2, arg3, 1524009690);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
			((Class132_Sub1_Sub1_Sub3) local34).method13299(arg4, (byte) -34);
		} else if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
			((Class132_Sub1_Sub4_Sub1) local34).method12961(arg4, 1197512709);
		} else if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
			((Class132_Sub1_Sub2_Sub2) local34).method12447(arg4, 1319512815);
		} else if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
			((Class132_Sub1_Sub3_Sub1) local34).method12302(arg4, (byte) -100);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "(I)V", line = 712)
	static void method12991(@OriginalArg(0) int arg0) {
		Class174.anInt3293 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			Class174.aPacketArray2[local3] = null;
			Class174.aPacketArray1[local3] = null;
			Class174.aByteArray64[local3] = Class707.aClass707_2.aByte176;
			Class174.aClass200Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!ajt", name = "ki", descriptor = "(I)V", line = 11715)
	public static final void method12992(@OriginalArg(0) int arg0) {
		client.aBoolean616 = true;
	}
}
