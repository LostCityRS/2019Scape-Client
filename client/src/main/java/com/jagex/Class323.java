package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class323 {

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!zm;")
	static Class711 aClass711_1;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
	public final int anInt4066;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public final int anInt4068;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "[I")
	public final int[] anIntArray398;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "[I")
	public final int[] anIntArray399;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!cg;")
	public final Class98 aClass98_1;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	final int anInt4067;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	static boolean method27608(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class238.anInt3812 = -1372526543;
		Class238.aClass75_3 = client.aClass75_1;
		return Class334.method27820(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!hr", name = "dh", descriptor = "(Lclient!yp;I)V")
	static void method27609(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2074232887);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class162.method15798(local16, local22, arg0, -1647330417);
	}

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "(Lclient!dr;FB)F")
	static float method27610(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null || arg0.method26015(-2030978563) == 0) {
			return 0.0F;
		} else if (arg1 < (float) (arg0.aClass253Array1[0].anInt3881 * -1813617981)) {
			return Class225.aClass225_5 == arg0.aClass225_6 ? arg0.aClass253Array1[0].aFloat284 : Class270.method26691(arg0, arg1, true, 992966553);
		} else if (arg1 > (float) (arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].anInt3881 * -1813617981)) {
			return arg0.aClass225_7 == Class225.aClass225_5 ? arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 : Class270.method26691(arg0, arg1, false, 1301542391);
		} else if (arg0.aBoolean760) {
			return arg0.aClass253Array1[0].aFloat284;
		} else {
			@Pc(83) Class253 local83 = arg0.method26014(arg1, 808775019);
			@Pc(85) boolean local85 = false;
			@Pc(87) boolean local87 = false;
			if (local83 == null) {
				return 0.0F;
			}
			if ((double) local83.aFloat280 == 0.0D && (double) local83.aFloat283 == 0.0D) {
				local85 = true;
			} else if (Float.MAX_VALUE == local83.aFloat280 && local83.aFloat283 == Float.MAX_VALUE) {
				local87 = true;
			} else if (local83.aClass253_1 == null) {
				local85 = true;
			} else if (arg0.aBoolean759) {
				@Pc(127) float[] local127 = new float[4];
				@Pc(130) float[] local130 = new float[4];
				local127[0] = local83.anInt3881 * -1813617981;
				local130[0] = local83.aFloat284;
				local127[1] = local83.aFloat280 * 0.33333334F + local127[0];
				local130[1] = local83.aFloat283 * 0.33333334F + local130[0];
				local127[3] = local83.aClass253_1.anInt3881 * -1813617981;
				local130[3] = local83.aClass253_1.aFloat284;
				local127[2] = local127[3] - local83.aClass253_1.aFloat282 * 0.33333334F;
				local130[2] = local130[3] - local83.aClass253_1.aFloat281 * 0.33333334F;
				if (arg0.aBoolean762) {
					Class448.method29260(arg0, local127, local130, (byte) -95);
				} else {
					Class545.method31206(arg0, local127, local130, 357160865);
				}
				arg0.aBoolean759 = false;
			}
			if (local85) {
				return local83.aFloat284;
			} else if (local87) {
				return arg1 == (float) (local83.anInt3881 * -1813617981) || local83.aClass253_1 == null ? local83.aFloat284 : local83.aClass253_1.aFloat284;
			} else if (arg0.aBoolean762) {
				return Class85.method1697(arg0, arg1, -919718248);
			} else {
				return Class221.method25908(arg0, arg1, (short) -1827);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "jy", descriptor = "(IIIIIIII)V")
	static void method27611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (client.anInt3541 * -1330995431 != 3) {
			return;
		}
		@Pc(9) int local9 = Class51.anInt191 * 44967471;
		@Pc(11) int[] local11 = Class51.anIntArray20;
		@Pc(13) int local13;
		for (local13 = 0; local13 < local9; local13++) {
			@Pc(22) Class120_Sub1_Sub1_Sub1_Sub2 local22 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local11[local13]];
			if (local22 != null) {
				local22.method18979(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1792213766);
			}
		}
		for (local13 = 0; local13 < client.anInt3453 * -1702559601; local13++) {
			@Pc(48) int local48 = client.anIntArray304[local13];
			@Pc(54) Class80_Sub19 local54 = (Class80_Sub19) client.aClass24_18.method560((long) local48);
			if (local54 != null) {
				((Class120_Sub1_Sub1_Sub1) local54.anObject5).method18979(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1792213766);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II[I[ILclient!cg;I)V")
	Class323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class98 arg4, @OriginalArg(5) int arg5) {
		this.anInt4066 = arg0 * 700714513;
		this.anInt4068 = arg1 * 1947824285;
		this.anIntArray398 = arg2;
		this.anIntArray399 = arg3;
		this.aClass98_1 = arg4;
		this.anInt4067 = arg5 * -65193365;
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(II)Z")
	public boolean method27606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray399.length) {
			@Pc(11) int local11 = this.anIntArray399[arg1];
			if (arg0 >= local11 && arg0 <= this.anIntArray398[arg1] + local11) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "(III)Z")
	public boolean method27607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= 0 && arg1 < this.anIntArray399.length) {
			@Pc(11) int local11 = this.anIntArray399[arg1];
			if (arg0 >= local11 && arg0 <= this.anIntArray398[arg1] + local11) {
				return true;
			}
		}
		return false;
	}
}
