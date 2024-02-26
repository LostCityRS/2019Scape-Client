package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class383 {

	@OriginalMember(owner = "client!km", name = "hp", descriptor = "Lclient!abq;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!km;")
	static final Class383 aClass383_12 = new Class383();

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!km;")
	static final Class383 aClass383_11 = new Class383();

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!km;")
	static final Class383 aClass383_13 = new Class383();

	@OriginalMember(owner = "client!km", name = "e", descriptor = "()[Lclient!km;")
	public static Class383[] method28575() {
		return new Class383[] { aClass383_12, aClass383_11, aClass383_13 };
	}

	@OriginalMember(owner = "client!km", name = "r", descriptor = "(I)Z")
	static boolean method28577(@OriginalArg(0) int arg0) {
		Class238.anInt3812 = -1372526543;
		Class238.aClass75_3 = client.aClass75_1;
		return Class334.method27820(Class238.aLong356 * 4843953102412043791L == -1L, true, "", "", Class238.aLong356 * 4843953102412043791L);
	}

	@OriginalMember(owner = "client!km", name = "qg", descriptor = "(Lclient!yp;I)V")
	static void method28578(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2123208391);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class147_Sub3.method23937(local16, local22, arg0, -1167058701);
	}

	@OriginalMember(owner = "client!km", name = "afh", descriptor = "(Lclient!yp;I)V")
	static void method28579(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13.toLowerCase();
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	Class383() {
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(IIB)I")
	public int method28573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(10) int local10 = Class80_Sub25.anInt1627 * 167687103 > arg1 ? Class80_Sub25.anInt1627 * 167687103 : arg1;
		if (aClass383_12 == this) {
			return 0;
		} else if (aClass383_13 == this) {
			return local10 - arg0;
		} else if (aClass383_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!km", name = "u", descriptor = "(II)I")
	public int method28574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class80_Sub25.anInt1627 * 167687103 > arg1 ? Class80_Sub25.anInt1627 * 167687103 : arg1;
		if (aClass383_12 == this) {
			return 0;
		} else if (aClass383_13 == this) {
			return local10 - arg0;
		} else if (aClass383_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!km", name = "l", descriptor = "(II)I")
	public int method28576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class80_Sub25.anInt1627 * 167687103 > arg1 ? Class80_Sub25.anInt1627 * 167687103 : arg1;
		if (aClass383_12 == this) {
			return 0;
		} else if (aClass383_13 == this) {
			return local10 - arg0;
		} else if (aClass383_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
