package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class249 {

	@OriginalMember(owner = "client!er", name = "u", descriptor = "I")
	int anInt3871;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	int anInt3872;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	int anInt3873;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	int anInt3875;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "I")
	final int anInt3874;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!va;")
	final Class607 aClass607_1;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(ZI)V")
	public static void method26348(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26519(622946965);
		if (!Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			return;
		}
		@Pc(11) Class75[] local11 = client.aClass75Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class75 local21 = local11[local13];
			local21.anInt243 += -1978460909;
			if (local21.anInt243 * 626261275 < 50 && !arg0) {
				return;
			}
			local21.anInt243 = 0;
			if (!local21.aBoolean35 && local21.method1321((byte) 2) != null) {
				@Pc(52) Class80_Sub31 local52 = Class623.method32440(Class443.aClass443_104, local21.aClass22_1, -191270971);
				local21.method1325(local52, (byte) -4);
				try {
					local21.method1315(435137414);
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean35 = true;
				}
			}
		}
		Class490.aClass263_13.method26519(1852166919);
	}

	@OriginalMember(owner = "client!er", name = "xz", descriptor = "(Lclient!yp;I)V")
	static void method26349(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.anInt1654 * 2058467157;
	}

	@OriginalMember(owner = "client!er", name = "yc", descriptor = "(Lclient!yp;I)V")
	static void method26350(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.aBoolean982 ? 1 : 0;
	}

	@OriginalMember(owner = "client!er", name = "ajl", descriptor = "(Lclient!yp;B)V")
	static void method26351(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anInt5776 -= -825189621;
	}

	@OriginalMember(owner = "client!er", name = "ir", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26352(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] - 1;
		if (local14 >= 0 && local14 <= 9) {
			arg0.method27656(local14, (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997], 1725793447);
		} else {
			arg2.anInt5776 -= -825189621;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)Z")
	public static boolean method26353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class80_Sub1_Sub11 local4 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local4 != null; local4 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-1132439659)) {
			if (Class103_Sub17.method19211(local4.anInt3079 * 1479399259, 460106407) && local4.aLong248 * 7780148905970551279L == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class249(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3874 = arg0.method23210((byte) 91) * -102305937;
		this.aClass607_1 = (Class607) Class80_Sub39.method15030(Class165_Sub22.method16274(-263280263), arg0.method23362(-2092284915), -524499933);
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "()V")
	void method26340() {
		Class705.method37130(this.anInt3872 * -1968270521, this.anInt3871 * -1986291659, this.anInt3873 * 144695177, this.aClass607_1.anInt5397 * 380575545, -1, this.aClass607_1.anInt5396 * 1323580581, this.anInt3875 * -787434545, null, -1323739461);
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(IIIII)V")
	void method26341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class705.method37130(arg0, arg1, arg2, this.aClass607_1.anInt5397 * 380575545, this.anInt3874 * 523456399, this.aClass607_1.anInt5396 * 1323580581, arg3, null, -1323739461);
		this.anInt3872 = arg0 * 1973102199;
		this.anInt3871 = arg1 * 189594141;
		this.anInt3873 = arg2 * -1265088839;
		this.anInt3875 = arg3 * -980978897;
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(IIII)V")
	void method26342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class705.method37130(arg0, arg1, arg2, this.aClass607_1.anInt5397 * 380575545, this.anInt3874 * 523456399, this.aClass607_1.anInt5396 * 1323580581, arg3, null, -1323739461);
		this.anInt3872 = arg0 * 1973102199;
		this.anInt3871 = arg1 * 189594141;
		this.anInt3873 = arg2 * -1265088839;
		this.anInt3875 = arg3 * -980978897;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)Z")
	boolean method26343(@OriginalArg(0) int arg0) {
		if (this.anInt3874 * 523456399 < 0) {
			return true;
		}
		@Pc(13) Class625 local13 = (Class625) Class5.aClass41_Sub3_1.method18054(this.anInt3874 * 523456399, 752635091);
		@Pc(22) boolean local22 = local13.method32458(this.aClass607_1.anInt5396 * 1323580581, (byte) -6);
		@Pc(26) int[] local26 = local13.method32466((byte) 117);
		if (local26 != null) {
			@Pc(31) int[] local31 = local26;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(41) int local41 = local31[local33];
				local22 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local41, 919690242)).method26480(1740709047);
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "(IIII)V")
	void method26344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class705.method37130(arg0, arg1, arg2, this.aClass607_1.anInt5397 * 380575545, this.anInt3874 * 523456399, this.aClass607_1.anInt5396 * 1323580581, arg3, null, -1323739461);
		this.anInt3872 = arg0 * 1973102199;
		this.anInt3871 = arg1 * 189594141;
		this.anInt3873 = arg2 * -1265088839;
		this.anInt3875 = arg3 * -980978897;
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(IIII)V")
	void method26345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class705.method37130(arg0, arg1, arg2, this.aClass607_1.anInt5397 * 380575545, this.anInt3874 * 523456399, this.aClass607_1.anInt5396 * 1323580581, arg3, null, -1323739461);
		this.anInt3872 = arg0 * 1973102199;
		this.anInt3871 = arg1 * 189594141;
		this.anInt3873 = arg2 * -1265088839;
		this.anInt3875 = arg3 * -980978897;
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "()V")
	void method26346() {
		Class705.method37130(this.anInt3872 * -1968270521, this.anInt3871 * -1986291659, this.anInt3873 * 144695177, this.aClass607_1.anInt5397 * 380575545, -1, this.aClass607_1.anInt5396 * 1323580581, this.anInt3875 * -787434545, null, -1323739461);
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
	void method26347(@OriginalArg(0) int arg0) {
		Class705.method37130(this.anInt3872 * -1968270521, this.anInt3871 * -1986291659, this.anInt3873 * 144695177, this.aClass607_1.anInt5397 * 380575545, -1, this.aClass607_1.anInt5396 * 1323580581, this.anInt3875 * -787434545, null, -1323739461);
	}
}
