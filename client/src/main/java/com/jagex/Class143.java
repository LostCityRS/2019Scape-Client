package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public abstract class Class143 {

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 4)
	Class143() {
	}

	@OriginalMember(owner = "client!po", name = "m", descriptor = "(Lclient!dh;J)V", line = 57)
	public static void method11049(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		Class663.anInt5836 = Class663.anInt5829 * -1517636377;
		Class663.anInt5829 = 0;
		Class305.method26797(-379174513);
		@Pc(11) Iterator local11 = Class701.aList26.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class674 local18 = (Class674) local11.next();
			@Pc(23) boolean local23 = local18.method33105(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class296.aClass674Array1[Class663.anInt5831 * 779180177] = local18;
				Class663.anInt5831 = (Class663.anInt5831 * 779180177 + 1 & Class223.anIntArray336[Class663.anInt5837 * 763077233]) * -89298831;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "hk", descriptor = "(Lclient!yf;I)V", line = 6262)
	static final void method11050(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1175408086);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method187(local16, local22, false, 0, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!po", name = "uh", descriptor = "(Lclient!yf;I)V", line = 8667)
	static final void method11051(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1085395297);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3996 * -1099308531;
	}

	@OriginalMember(owner = "client!po", name = "xh", descriptor = "(Lclient!yf;I)V", line = 9160)
	static final void method11052(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13.anInt1609 * -2022654167;
	}

	@OriginalMember(owner = "client!po", name = "amd", descriptor = "(Lclient!yf;I)V", line = 12130)
	static final void method11053(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1451722994;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		if (local13 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3486 = local13 * 1975201975;
		@Pc(34) int local34 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local34 + 1 >= client.anIntArrayArrayArray15[client.anInt3486 * 901426439].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3491 = local34 * 1363711191;
		client.anInt3525 = 0;
		client.anInt3456 = arg0.anIntArray519[-1497248091 * arg0.anInt5891 + 2] * -2129619653;
		client.anInt3493 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] * -21820401;
		@Pc(90) int local90 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		if (local90 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3490 = local90 * 468246877;
		@Pc(111) int local111 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5];
		if (local111 + 1 >= client.anIntArrayArrayArray15[client.anInt3490 * -66946315].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3506 = local111 * -656032977;
		Class429.anInt4781 = 911755286;
		Class444.anInt4895 = 783237131;
		Class175.anInt3306 = 1395810859;
	}

	@OriginalMember(owner = "client!po", name = "u", descriptor = "(I)[B")
	abstract byte[] method11054(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(B)Lclient!pl;")
	abstract Class486 method11055(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!po", name = "n", descriptor = "(II)[B")
	abstract byte[] method11056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!po", name = "k", descriptor = "(II)I")
	abstract int method11057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!po", name = "m", descriptor = "(IB)V")
	abstract void method11058(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!po", name = "f", descriptor = "()Lclient!pl;")
	abstract Class486 method11059();

	@OriginalMember(owner = "client!po", name = "r", descriptor = "(I)I")
	abstract int method11060(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "l", descriptor = "(I)[B")
	abstract byte[] method11061(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "w", descriptor = "()Lclient!pl;")
	abstract Class486 method11062();

	@OriginalMember(owner = "client!po", name = "z", descriptor = "(I)V")
	abstract void method11063(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "p", descriptor = "(I)V")
	abstract void method11064(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	abstract void method11065(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	abstract void method11066(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!po", name = "v", descriptor = "(I)I")
	abstract int method11067(@OriginalArg(0) int arg0);
}