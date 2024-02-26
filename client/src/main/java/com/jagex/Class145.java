package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class145 {

	@OriginalMember(owner = "client!aj", name = "bz", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "Lclient!aj;")
	static final Class145 aClass145_2 = new Class145(0);

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!aj;")
	static final Class145 aClass145_1 = new Class145(1);

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!aj;")
	static final Class145 aClass145_3 = new Class145(2);

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!aj;")
	static final Class145 aClass145_4 = new Class145(3);

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	final int anInt1410;

	@OriginalMember(owner = "client!aj", name = "oo", descriptor = "(Lclient!yp;I)V")
	static void method12034(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class50.method1040(local11, local14, arg0, (byte) -26);
	}

	@OriginalMember(owner = "client!aj", name = "aas", descriptor = "(Lclient!yp;I)V")
	static void method12035(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13.startsWith(Class6_Sub1.method23670(0, -641371939)) || local13.startsWith(Class6_Sub1.method23670(1, -829876783))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class586.method31882(local13, 1254096423) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aj", name = "avl", descriptor = "(Lclient!yp;I)V")
	static void method12036(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(CB)C")
	static char method12037(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!aj", name = "baf", descriptor = "(Lclient!yp;S)V")
	static void method12038(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "(II)V")
	public static void method12039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class243 local2 = Class672.aClass243_95;
		synchronized (Class672.aClass243_95) {
			Class672.aClass243_95.method26247(arg0, (byte) 75);
		}
		local2 = Class672.aClass243_94;
		synchronized (Class672.aClass243_94) {
			Class672.aClass243_94.method26247(arg0, (byte) 55);
		}
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	Class145(@OriginalArg(0) int arg0) {
		this.anInt1410 = arg0 * -1263943319;
	}
}
