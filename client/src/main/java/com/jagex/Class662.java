package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xk")
public class Class662 implements Interface75 {

	@OriginalMember(owner = "client!xk", name = "e", descriptor = "Lclient!xk;")
	public static final Class662 aClass662_2 = new Class662(0);

	@OriginalMember(owner = "client!xk", name = "n", descriptor = "Lclient!xk;")
	static final Class662 aClass662_4 = new Class662(1);

	@OriginalMember(owner = "client!xk", name = "m", descriptor = "Lclient!xk;")
	static final Class662 aClass662_1 = new Class662(2);

	@OriginalMember(owner = "client!xk", name = "k", descriptor = "Lclient!xk;")
	static final Class662 aClass662_3 = new Class662(3);

	@OriginalMember(owner = "client!xk", name = "f", descriptor = "Lclient!xk;")
	static final Class662 aClass662_5 = new Class662(4);

	@OriginalMember(owner = "client!xk", name = "w", descriptor = "I")
	int anInt5828;

	@OriginalMember(owner = "client!xk", name = "<init>", descriptor = "(I)V", line = 14)
	Class662(@OriginalArg(0) int arg0) {
		this.anInt5828 = arg0 * -323431983;
	}

	@OriginalMember(owner = "client!xk", name = "k", descriptor = "()I", line = 19)
	@Override
	public int method36919() {
		return this.anInt5828 * -413587663;
	}

	@OriginalMember(owner = "client!xk", name = "n", descriptor = "()I", line = 19)
	@Override
	public int method36920() {
		return this.anInt5828 * -413587663;
	}

	@OriginalMember(owner = "client!xk", name = "n", descriptor = "(Lclient!dh;S)V", line = 28)
	static void method32847(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		if (Class114.aClass22_14.method448(-1894436286) == 0) {
			return;
		}
		@Pc(14) Class93_Sub10 local14;
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 44) == 0) {
			for (local14 = (Class93_Sub10) Class114.aClass22_14.method428((byte) 106); local14 != null; local14 = (Class93_Sub10) Class114.aClass22_14.method442(756544337)) {
				Class277.aClass32_Sub12_1.method17071(arg0, arg0, local14.anInt1491 * -542760641, local14.anInt1490 * -442414689, local14.anInt1493 * -965915761, local14.anInt1492 * 124153651, false, false, local14.anInt1489 * 1920495325, Class707.aClass106_13, local14.aBoolean319 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null, Class93_Sub26.aClass645_15, (short) 255);
				local14.method23969(1549569714);
			}
			Class635.method32440((short) 255);
			return;
		}
		if (Class114.aClass104_8 == null) {
			@Pc(73) Canvas local73 = new Canvas();
			local73.setSize(36, 32);
			Class114.aClass104_8 = Class5.method40(0, local73, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, 0, 636490669);
			Class114.aClass106_2 = Class114.aClass104_8.method20593(Class219.method25509(Class633.aClass497_137, Class393.anInt4654 * -414755309, 0, 2081443949), Class203.method24648(Class110_Sub7.aClass497_22, Class393.anInt4654 * -414755309, 0), true);
		}
		for (local14 = (Class93_Sub10) Class114.aClass22_14.method428((byte) 12); local14 != null; local14 = (Class93_Sub10) Class114.aClass22_14.method442(994650198)) {
			Class277.aClass32_Sub12_1.method17071(Class114.aClass104_8, arg0, local14.anInt1491 * -542760641, local14.anInt1490 * -442414689, local14.anInt1493 * -965915761, local14.anInt1492 * 124153651, false, false, local14.anInt1489 * 1920495325, Class114.aClass106_2, local14.aBoolean319 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null, Class93_Sub26.aClass645_15, (short) 255);
			local14.method23969(-2132130896);
		}
	}

	@OriginalMember(owner = "client!xk", name = "x", descriptor = "(I)I", line = 253)
	public static int method32848(@OriginalArg(0) int arg0) {
		return Class361.method27804(862937808) ? Class625.anInt5694 * 749355381 : 0;
	}

	@OriginalMember(owner = "client!xk", name = "hs", descriptor = "(Lclient!yf;B)V", line = 6325)
	static final void method32849(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method187(local11, local14, true, 1, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!xk", name = "xv", descriptor = "(Lclient!yf;I)V", line = 9131)
	static final void method32850(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local12 >> 28;
	}

	@OriginalMember(owner = "client!xk", name = "xp", descriptor = "(Lclient!yf;I)V", line = 9165)
	static final void method32851(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class93_Sub30 local15 = Class493.method29984((Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375], 1409384840);
		arg0.anInt5891 -= 463840436;
		local15.anInt1609 += arg0.anIntArray519[arg0.anInt5891 * -1497248091] * 1850625305;
		local15.anInt1610 += arg0.anIntArray519[-1497248091 * arg0.anInt5891 + 1] * -1902705965;
		local15.anInt1611 += arg0.anIntArray519[-1497248091 * arg0.anInt5891 + 2] * -2071305895;
		local15.anInt1612 += arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] * 112880761;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local15;
	}
}
