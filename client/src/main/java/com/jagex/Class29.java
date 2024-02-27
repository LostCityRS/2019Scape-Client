package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abc")
public final class Class29 {

	@OriginalMember(owner = "client!abc", name = "e", descriptor = "I")
	public static final int anInt93 = 3;

	@OriginalMember(owner = "client!abc", name = "f", descriptor = "I")
	public static final int anInt94 = 2;

	@OriginalMember(owner = "client!abc", name = "t", descriptor = "I")
	public static final int anInt95 = 1;

	@OriginalMember(owner = "client!abc", name = "u", descriptor = "I")
	public static final int anInt96 = 4;

	@OriginalMember(owner = "client!abc", name = "bg", descriptor = "(Lclient!di;I)V")
	static void method661(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class594.anInt5325 * 2014486095;
		@Pc(7) int local7 = Class103_Sub15.anInt970 * -1540302901;
		@Pc(11) int local11 = Class427.anInt4636 * 663066865;
		@Pc(17) int local17 = Class106.anInt2551 * -1646871895 - 3;
		@Pc(19) byte local19 = 20;
		if (Class80_Sub31.aClass104_11 == null || Class553.aClass15_11 == null) {
			Class80_Sub31.aClass104_11 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class355.anInt4265 * -694663589, true, true, -179840238);
			Class553.aClass15_11 = Class317.aClass464_1.method29594(client.anInterface49_1, Class355.anInt4265 * -694663589, (byte) 1);
			if (Class80_Sub31.aClass104_11 != null && Class553.aClass15_11 != null) {
				Class392.method28680(1305557302);
				@Pc(56) int local56 = local3 + local11 / 2;
				if (local11 + local56 > Class80_Sub1_Sub1.anInt254 * -255202897) {
					local56 = Class80_Sub1_Sub1.anInt254 * -255202897 - local11;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				Class291.method26940(local56, Class103_Sub15.anInt970 * -1540302901, -1844284117);
				return;
			}
		}
		@Pc(87) Class104 local87;
		if (Class80_Sub31.aClass104_11 == null || Class553.aClass15_11 == null) {
			local87 = Class8.aClass104_1;
		} else {
			local87 = Class80_Sub31.aClass104_11;
		}
		@Pc(93) Class15 local93 = Class445.method29244(2065999317);
		Class630.method32714(arg0, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local19, local87, local93, Class60.aClass60_132.method1180(Class512.aClass719_3, 773625484), (byte) 23);
		@Pc(125) int local125 = 255 - Class354.anInt4264 * 1474129597 - Class630.anInt5564 * 536700411;
		if (local125 < 0) {
			local125 = 0;
		}
		@Pc(133) int local133 = Class363.aClass152_1.method14615(-497842674);
		@Pc(137) int local137 = Class363.aClass152_1.method14598(1515520068);
		@Pc(141) int local141;
		@Pc(146) Class80_Sub1_Sub11 local146;
		@Pc(171) int local171;
		@Pc(246) Class80_Sub1_Sub4 local246;
		if (Class630.aBoolean956) {
			local141 = 0;
			for (local246 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.head((byte) 25); local246 != null; local246 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.next((byte) -102)) {
				local171 = Class630.anInt5547 * 1378633515 * local141 + local19 + local7 + local93.anInt45 * 1190692343 + 1;
				if (local133 > Class594.anInt5325 * 2014486095 && local133 < Class594.anInt5325 * 2014486095 + Class427.anInt4636 * 663066865 && local137 > local171 - local93.anInt45 * 1190692343 - 1 && local137 < local93.anInt46 * -191270971 + local171 && (local246.anInt3022 * 855388281 > 1 || ((Class80_Sub1_Sub11) local246.aSecondaryLinkedList_10.aClass80_Sub1_2.aClass80_Sub1_68).aBoolean587)) {
					arg0.method20722(Class594.anInt5325 * 2014486095, local171 - local93.anInt45 * 1190692343, Class427.anInt4636 * 663066865, Class630.anInt5547 * 1378633515, local125 << 24 | Class567.anInt5237 * -1962120721, 1);
				}
				local141++;
			}
			if (Class630.aClass80_Sub1_Sub4_1 != null) {
				Class630.method32714(arg0, Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, local19, local87, local93, Class630.aClass80_Sub1_Sub4_1.aString95, (byte) 65);
				local141 = 0;
				for (local146 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aSecondaryLinkedList_10.head((byte) 7); local146 != null; local146 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aSecondaryLinkedList_10.next((byte) -102)) {
					local171 = Class630.anInt5547 * 1378633515 * local141 + local19 + Class630.anInt5557 * -1965654097 + local93.anInt45 * 1190692343 + 1;
					if (local133 > Class41_Sub12.anInt2441 * 1627981811 && local133 < Class41_Sub12.anInt2441 * 1627981811 + Class40.anInt116 * -477951091 && local137 > local171 - local93.anInt45 * 1190692343 - 1 && local137 < local171 + local93.anInt46 * -191270971 && local146.aBoolean587) {
						arg0.method20722(Class41_Sub12.anInt2441 * 1627981811, local171 - local93.anInt45 * 1190692343, Class40.anInt116 * -477951091, Class630.anInt5547 * 1378633515, local125 << 24 | Class567.anInt5237 * -1962120721, 1);
					}
					local141++;
				}
				Class420.method29010(arg0, Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, local19, (byte) -22);
			}
		} else {
			local141 = 0;
			for (local146 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local146 != null; local146 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(32470520)) {
				local171 = Class630.anInt5547 * 1378633515 * (Class630.anInt5553 * 721317679 - 1 - local141) + 1 + local19 + local7 + local93.anInt45 * 1190692343;
				if (local133 > Class594.anInt5325 * 2014486095 && local133 < Class427.anInt4636 * 663066865 + Class594.anInt5325 * 2014486095 && local137 > local171 - local93.anInt45 * 1190692343 - 1 && local137 < local93.anInt46 * -191270971 + local171 && local146.aBoolean587) {
					arg0.method20722(Class594.anInt5325 * 2014486095, local171 - local93.anInt45 * 1190692343, Class427.anInt4636 * 663066865, Class630.anInt5547 * 1378633515, local125 << 24 | Class567.anInt5237 * -1962120721, 1);
				}
				local141++;
			}
		}
		Class420.method29010(arg0, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local19, (byte) -18);
		if (!Class630.aBoolean956) {
			local141 = 0;
			for (local146 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local146 != null; local146 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-1152987440)) {
				local171 = local19 + 1 + local7 + local93.anInt45 * 1190692343 + Class630.anInt5547 * 1378633515 * (Class630.anInt5553 * 721317679 - 1 - local141);
				Class646.method33049(local133, local137, local3, local7, local11, local17, local171, local146, local87, local93, Class145.anInt1411 * 1438325751 | 0xFF000000, Class302.anInt3972 * -85208577 | 0xFF000000, (byte) 1);
				local141++;
			}
			return;
		}
		local141 = 0;
		for (local246 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.head((byte) 26); local246 != null; local246 = (Class80_Sub1_Sub4) Class630.aSecondaryLinkedList_17.next((byte) -102)) {
			local171 = local93.anInt45 * 1190692343 + 1 + Class103_Sub15.anInt970 * -1540302901 + local19 + Class630.anInt5547 * 1378633515 * local141;
			if (local246.anInt3022 * 855388281 == 1) {
				Class646.method33049(local133, local137, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local171, (Class80_Sub1_Sub11) local246.aSecondaryLinkedList_10.aClass80_Sub1_2.aClass80_Sub1_68, local87, local93, Class145.anInt1411 * 1438325751 | 0xFF000000, Class302.anInt3972 * -85208577 | 0xFF000000, (byte) 1);
			} else {
				Class588.method31900(local133, local137, Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, local171, local246, local87, local93, Class145.anInt1411 * 1438325751 | 0xFF000000, Class302.anInt3972 * -85208577 | 0xFF000000, -1001295753);
			}
			local141++;
		}
		if (Class630.aClass80_Sub1_Sub4_1 == null) {
			return;
		}
		local141 = 0;
		for (local146 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aSecondaryLinkedList_10.head((byte) -48); local146 != null; local146 = (Class80_Sub1_Sub11) Class630.aClass80_Sub1_Sub4_1.aSecondaryLinkedList_10.next((byte) -102)) {
			local171 = Class630.anInt5557 * -1965654097 + 1 + local19 + local93.anInt45 * 1190692343 + local141 * 1378633515 * Class630.anInt5547;
			Class646.method33049(local133, local137, Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, local171, local146, local87, local93, Class145.anInt1411 * 1438325751 | 0xFF000000, Class302.anInt3972 * -85208577 | 0xFF000000, (byte) 1);
			local141++;
		}
	}

	@OriginalMember(owner = "client!abc", name = "aqm", descriptor = "(Lclient!yp;B)V")
	static void method662(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!abc", name = "zf", descriptor = "(Lclient!yp;I)V")
	static void method663(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(47) String local47 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(60) Class50 local60 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local23, 1848751486);
		if (local60.aClass521_2.getId() != local13) {
			throw new RuntimeException();
		} else if (local60.aClass521_1.getId() == Class521.aClass521_42.getId()) {
			@Pc(84) int[] local84 = local60.method1019(local47, 1896589581);
			if (local33 < 0 || local84 == null || local84.length <= local33) {
				throw new RuntimeException();
			}
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local84[local33];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!abc", name = "aql", descriptor = "(Lclient!yp;I)V")
	static void method664(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!abc", name = "asi", descriptor = "(Lclient!yp;I)V")
	static void method665(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub27_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 88);
		Class719.method37291(129519052);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!abc", name = "<init>", descriptor = "()V")
	Class29() throws Throwable {
		throw new Error();
	}
}
