package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.util.Iterator;

@OriginalClass("client!vo")
public final class Class618 {

	@OriginalMember(owner = "client!vo", name = "tf", descriptor = "B")
	public static byte aByte157;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	final int anInt5432;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
	final int anInt5430;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	final int anInt5431;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	final int anInt5433;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "(B)V")
	public static void method32293(@OriginalArg(0) byte arg0) {
		Class654.aClass24_39 = new Class24(8);
		Class654.anInt5671 = 0;
		@Pc(9) Iterator local9 = Class286.aList14.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class658 local16 = (Class658) local9.next();
			local16.method33254();
		}
	}

	@OriginalMember(owner = "client!vo", name = "amj", descriptor = "(Lclient!yp;I)V")
	static void method32294(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class479.anInt4988 * 863472045 & 0x1;
	}

	@OriginalMember(owner = "client!vo", name = "bes", descriptor = "(Lclient!yp;I)V")
	static void method32295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "(IIZZS)I")
	public static int method32296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) short arg4) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg3, -917091800);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray179.length; local12++) {
			if (local4.anIntArray179[local12] >= 0 && local4.anIntArray179[local12] < Class25.aClass41_Sub9_1.anInt2476 * 462823477) {
				@Pc(40) Class43 local40 = (Class43) Class25.aClass41_Sub9_1.method18054(local4.anIntArray179[local12], -1682636387);
				@Pc(53) int local53 = local40.method917(arg1, ((Class79) Class370.aClass41_Sub10_1.method18054(arg1, 284226221)).anInt253 * 680817871, (short) -9817);
				if (arg2) {
					local10 += local53 * local4.anIntArray178[local12];
				} else if (local4.anIntArray178[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "(Lclient!ajp;B)V")
	static void method32297(@OriginalArg(0) Class80_Sub8 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		if (local3 == null) {
			return;
		}
		@Pc(8) Interface60 local8 = null;
		if (arg0.anInt1471 * 119933899 == 0) {
			local8 = (Interface60) local3.method31570(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) -70);
		}
		if (arg0.anInt1471 * 119933899 == 1) {
			local8 = (Interface60) local3.method31572(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, (byte) 5);
		}
		if (arg0.anInt1471 * 119933899 == 2) {
			local8 = (Interface60) local3.method31574(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, client.anInterface62_1, (byte) -77);
		}
		if (arg0.anInt1471 * 119933899 == 3) {
			local8 = (Interface60) local3.method31558(arg0.anInt1478 * -31519745, arg0.anInt1476 * 781975081, arg0.anInt1473 * -1479987305, 1694998726);
		}
		if (local8 == null) {
			arg0.anInt1474 = -391593429;
			arg0.anInt1479 = 0;
			arg0.anInt1475 = 0;
		} else {
			arg0.anInt1474 = local8.method13834((byte) 95) * 391593429;
			arg0.anInt1479 = local8.method13819(1573731940) * 502284861;
			arg0.anInt1475 = local8.method13820(-1399907529) * -1036952063;
		}
		if (local8 instanceof Class120_Sub1) {
			@Pc(139) Class120_Sub1 local139 = (Class120_Sub1) local8;
			arg0.aClass457_53 = local139.aClass457_89 == null ? null : new Class457(local139.aClass457_89);
		}
	}

	@OriginalMember(owner = "client!vo", name = "aze", descriptor = "(Lclient!yp;I)V")
	static void method32298(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub9_1.method15994((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vo", name = "eh", descriptor = "(III)V")
	public static void method32299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class159_Sub1.anInt2018 = (arg0 - Class159_Sub1.anInt1991) * 1806870975;
		Class159_Sub1.anInt2019 = (arg1 - Class159_Sub1.anInt1996) * 387547399;
	}

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method32300(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class562.anApplet3 = arg0;
		Class562.aString224 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "mj", descriptor = "(Lclient!yp;B)V")
	static void method32301(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2131109690);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class125.method20590(local16, local22, arg0, -1925428371);
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIII)V")
	Class618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5432 = arg0 * 579572713;
		this.anInt5430 = arg1 * 214136155;
		this.anInt5431 = arg2 * -1057380727;
		this.anInt5433 = arg3 * -1303750367;
	}
}
