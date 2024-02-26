package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
final class Class1 implements Interface27 {

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!aoa;")
	static Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!a", name = "ao", descriptor = "(I)V")
	public static void method21(@OriginalArg(0) int arg0) {
		Class521.method30631(526898363);
	}

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "(Lclient!yp;I)V")
	static void method22(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2017636895);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class103_Sub12.method7921(local16, local22, arg0, (byte) -53);
	}

	@OriginalMember(owner = "client!a", name = "aah", descriptor = "(Lclient!yp;I)V")
	static void method23(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class103_Sub7.method7849(local13, false, 1010843615);
	}

	@OriginalMember(owner = "client!a", name = "aaz", descriptor = "(Lclient!yp;I)V")
	static void method24(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 0 || local12 >= client.anInt3519 * 227319795) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			return;
		}
		@Pc(25) Class699 local25 = client.aClass699Array1[local12];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local25.aString244;
		if (local25.aString242 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local25.aString242;
		}
	}

	@OriginalMember(owner = "client!a", name = "hu", descriptor = "(Lclient!yp;I)V")
	static void method25(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2094252587);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class70.method1258(local16, local22, arg0, -2031917729);
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()Lclient!add;")
	@Override
	public Class2_Sub1 method19() {
		return Class188.aClass2_Sub1_Sub2_13;
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(S)Lclient!add;")
	@Override
	public Class2_Sub1 method11(@OriginalArg(0) short arg0) {
		return Class528.aClass2_Sub1_Sub1_3;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Lclient!add;")
	@Override
	public Class2_Sub1 method13(@OriginalArg(0) int arg0) {
		return Class188.aClass2_Sub1_Sub2_13;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lclient!aov;")
	@Override
	public Class41_Sub17 method16(@OriginalArg(0) int arg0) {
		return Class664.aClass41_Sub17_2;
	}

	@OriginalMember(owner = "client!a", name = "u", descriptor = "(I)Lclient!we;")
	@Override
	public Class634 method14(@OriginalArg(0) int arg0) {
		return Class450.aClass634_1;
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()Lclient!add;")
	@Override
	public Class2_Sub1 method15() {
		return Class528.aClass2_Sub1_Sub1_3;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()Lclient!add;")
	@Override
	public Class2_Sub1 method12() {
		return Class528.aClass2_Sub1_Sub1_3;
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()Lclient!add;")
	@Override
	public Class2_Sub1 method17() {
		return Class528.aClass2_Sub1_Sub1_3;
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Lclient!add;")
	@Override
	public Class2_Sub1 method18() {
		return Class188.aClass2_Sub1_Sub2_13;
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Lclient!aov;")
	@Override
	public Class41_Sub17 method20() {
		return Class664.aClass41_Sub17_2;
	}
}
