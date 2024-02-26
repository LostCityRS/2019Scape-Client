package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class253 {

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "S")
	static short aShort165;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
	int anInt3881;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!ev;")
	Class253 aClass253_1;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "F")
	float aFloat284;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "F")
	float aFloat282 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "F")
	float aFloat281 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "F")
	float aFloat280 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "F")
	float aFloat283 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ev", name = "aoo", descriptor = "(Lclient!yp;I)V")
	static void method26381(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class160.aClass121_Sub1_2.method9607(-2120784752) == null ? -1 : Class160.aClass121_Sub1_2.method9607(-959870320).anInt4242 * -1796689509;
	}

	@OriginalMember(owner = "client!ev", name = "azv", descriptor = "(Lclient!yp;I)V")
	static void method26382(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15833(-1930536657) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "(Lclient!akk;IIIII)V")
	static void method26383(@OriginalArg(0) Class80_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0.anInt1606 * -2023184157 == -1 && arg0.anIntArray186 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1597 * -803853751;
		if (arg0.anInt1605 * -742890459 != 0 && Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -15) != 0 && arg0.anInt1591 * -1499016133 == arg1) {
			if (arg0.aClass529_3 != null && (arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_3.method30732((byte) 24) == Class524.aClass524_7)) {
				Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) -33);
				arg0.aClass529_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass529_3 != null) {
				local203 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				local102 = (int) ((float) (arg0.anInt1599 * 1363501641) + (float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F);
				arg0.aClass463_46.aFloat297 = local203;
				arg0.aClass463_46.aFloat296 = local102;
			} else if (arg0.anInt1606 * -2023184157 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local122 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_46.aFloat297 = local102;
				arg0.aClass463_46.aFloat296 = local122;
				arg0.aClass529_3 = Class490.aClass263_13.method26536(Class280.aClass280_3, arg0, arg0.anInt1606 * -2023184157, -1, 0, Class278.aClass278_4.method26831(3809052), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1605 * -742890459), arg0.aClass463_46, 0, local82, false, -1105535162);
				if (arg0.aClass529_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass529_3.method30749(local172, 150, (byte) -127);
					arg0.aClass529_3.method30726(-1175974188);
				}
			}
			if (arg0.aClass529_4 != null) {
				local203 = (int) ((float) (arg0.anInt1602 * 1377576325) + (float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local203;
				arg0.aClass463_47.aFloat296 = local102;
				if (arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_8 || arg0.aClass529_4.method30732((byte) 24) == Class524.aClass524_7) {
					Class490.aClass263_13.method26582(arg0.aClass529_4, (byte) -87);
					arg0.aClass529_4 = null;
				}
			} else if (arg0.anIntArray186 != null && (arg0.anInt1603 -= arg4 * -855303383) * 487698713 <= 0) {
				local203 = arg0.anInt1592 * -2063181377 == 256 && arg0.anInt1604 * 973650713 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1592 * -2063181377 - arg0.anInt1604 * 973650713)) + arg0.anInt1604 * 973650713;
				local102 = (int) (Math.random() * (double) arg0.anIntArray186.length);
				local122 = (int) ((float) (arg0.anInt1593 * 437620481 - arg0.anInt1602 * 1377576325) * 0.5F + (float) (arg0.anInt1602 * 1377576325));
				@Pc(333) int local333 = (int) ((float) (arg0.anInt1596 * 1434802161 - arg0.anInt1599 * 1363501641) * 0.5F + (float) (arg0.anInt1599 * 1363501641));
				arg0.aClass463_47.aFloat297 = local122;
				arg0.aClass463_47.aFloat296 = local333;
				arg0.aClass529_4 = Class490.aClass263_13.method26536(Class280.aClass280_2, arg0, arg0.anIntArray186[local102], 0, local14, Class278.aClass278_9.method26831(-843424248), Class269.aClass269_4, (float) (arg0.anInt1595 * 114272693), (float) (arg0.anInt1595 * 114272693 + arg0.anInt1605 * -742890459), arg0.aClass463_47, 0, local203, false, -980862340);
				if (arg0.aClass529_4 != null) {
					arg0.aClass529_4.method30726(-1708227392);
				}
				arg0.anInt1603 = (arg0.anInt1607 * 2028704931 + (int) (Math.random() * (double) (arg0.anInt1594 * 482038367 - arg0.anInt1607 * 2028704931))) * -855303383;
			}
		} else if (arg0.aClass529_3 != null) {
			arg0.aClass529_3.method30788(100, 1392512459);
			Class490.aClass263_13.method26582(arg0.aClass529_3, (byte) 6);
			arg0.aClass529_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	Class253() {
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(Lclient!ald;I)V")
	void method26377(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anInt3881 = arg0.method23179(1526750308) * 548134379;
		this.aFloat284 = arg0.method23188(-2078725318);
		this.aFloat282 = arg0.method23188(-1433380423);
		this.aFloat281 = arg0.method23188(-1145374721);
		this.aFloat280 = arg0.method23188(1599572951);
		this.aFloat283 = arg0.method23188(-1219449257);
	}

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "(Lclient!ald;II)V")
	void method26378(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3881 = arg0.method23179(1508471957) * 548134379;
		this.aFloat284 = arg0.method23188(-1168657236);
		this.aFloat282 = arg0.method23188(1047668909);
		this.aFloat281 = arg0.method23188(-1540868433);
		this.aFloat280 = arg0.method23188(1694778914);
		this.aFloat283 = arg0.method23188(833940857);
	}

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "(Lclient!ald;I)V")
	void method26379(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anInt3881 = arg0.method23179(1018534812) * 548134379;
		this.aFloat284 = arg0.method23188(-1599360575);
		this.aFloat282 = arg0.method23188(-262820336);
		this.aFloat281 = arg0.method23188(2074808007);
		this.aFloat280 = arg0.method23188(1124781477);
		this.aFloat283 = arg0.method23188(762609367);
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "(Lclient!ald;I)V")
	void method26380(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.anInt3881 = arg0.method23179(1667249601) * 548134379;
		this.aFloat284 = arg0.method23188(-1963185653);
		this.aFloat282 = arg0.method23188(963378001);
		this.aFloat281 = arg0.method23188(-1027429842);
		this.aFloat280 = arg0.method23188(1945945566);
		this.aFloat283 = arg0.method23188(-259585764);
	}
}
