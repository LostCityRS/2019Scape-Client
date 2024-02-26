package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class449 {

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!nv;")
	public static final Class449 aClass449_5 = new Class449(8);

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!nv;")
	public static final Class449 aClass449_3 = new Class449(16);

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!nv;")
	public static final Class449 aClass449_4 = new Class449(8);

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!nv;")
	public static final Class449 aClass449_2 = new Class449(16);

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!nv;")
	static final Class449 aClass449_6 = new Class449(32);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
	public final int anInt4888;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(Lclient!yp;I)V")
	static void method29262(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class89.method1804(120277792);
	}

	@OriginalMember(owner = "client!nv", name = "mb", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method29263(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		@Pc(18) int[] local18 = Class619.method32302(local13, arg2, -1897876133);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray7 = Class431.method29089(local13, arg2, 1678899779);
		arg0.anIntArray405 = local18;
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!nv", name = "ym", descriptor = "(Lclient!yp;I)V")
	static void method29264(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean731 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(CI)Z")
	public static boolean method29265(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = Class714.aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "aks", descriptor = "(Lclient!yp;S)V")
	static void method29266(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class159.method15423(local12);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3089 * -1734311989;
		}
	}

	@OriginalMember(owner = "client!nv", name = "ou", descriptor = "(Lclient!yp;I)V")
	static void method29267(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2062736719);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class144.method11995(local16, local22, arg0, 1264262455);
	}

	@OriginalMember(owner = "client!nv", name = "sd", descriptor = "(Lclient!yp;I)V")
	static void method29268(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class103_Sub12.method7922(local11, arg0, -1406272070);
	}

	@OriginalMember(owner = "client!nv", name = "axk", descriptor = "(Lclient!yp;B)V")
	static void method29269(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(8, local13, local23, "", 1076202539);
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I)V")
	Class449(@OriginalArg(0) int arg0) {
		this.anInt4888 = arg0 * -1915200905;
	}
}
