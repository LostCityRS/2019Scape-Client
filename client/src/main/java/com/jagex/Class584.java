package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!tv")
public final class Class584 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(Lclient!ub;III)Lclient!asw;")
	static Class80_Sub1_Sub20 method31840(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg0.anInt2028 * 2015367115 | arg1 << 10;
		@Pc(16) Class80_Sub1_Sub20 local16 = (Class80_Sub1_Sub20) Class686.aClass248_1.method26331((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, 480008499), 1472047355);
		if (local29 == null) {
			local8 = arg0.anInt2028 * 2015367115 | arg2 + 65536 << 10;
			local16 = (Class80_Sub1_Sub20) Class686.aClass248_1.method26331((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, -1072133919), 1472047355);
			if (local29 == null) {
				local8 = arg0.anInt2028 * 2015367115 | 0x3FFFC00;
				local16 = (Class80_Sub1_Sub20) Class686.aClass248_1.method26331((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, -415159597), 1472047355);
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class228.method25994(local29, 1539267777);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass158_70 = arg0;
					Class686.aClass248_1.method26330(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class228.method25994(local29, -75219684);
				} catch (@Pc(116) Exception local116) {
					throw new RuntimeException(local116.getMessage() + " " + local8);
				}
				local16.aClass158_70 = arg0;
				Class686.aClass248_1.method26330(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class228.method25994(local29, -456420348);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass158_70 = arg0;
			Class686.aClass248_1.method26330(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tv", name = "ac", descriptor = "(Lclient!yp;S)V")
	static void method31841(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) throws Exception_Sub6 {
		@Pc(9) Class374 local9 = (Class374) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
		@Pc(32) Interface22 local32 = (Interface22) (arg0.anIntArray526[arg0.anInt5780 * -1336568839] == 0 ? arg0.aMap23.get(local9.aClass107_1.aClass143_6) : arg0.aMap24.get(local9.aClass107_1.aClass143_6));
		try {
			local32.method36987(local9, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) -18);
		} catch (@Pc(50) Exception_Sub6 local50) {
			if (!(local32 instanceof Class636)) {
				throw local50;
			}
			Class583.method31839(arg0, Class557.aClass557_297, local50, "VO", (byte) -20);
		}
	}

	@OriginalMember(owner = "client!tv", name = "aro", descriptor = "(Lclient!yp;I)V")
	static void method31842(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class488.method30213(-1836834665);
	}

	@OriginalMember(owner = "client!tv", name = "nm", descriptor = "(Lclient!yp;I)V")
	static void method31843(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2068517713);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class60.method1185(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!tv", name = "atd", descriptor = "(Lclient!yp;I)V")
	static void method31844(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(78051958) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tv", name = "bw", descriptor = "(FFFFFFII)F")
	static float method31845(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) float local1 = 0.0F;
		@Pc(5) float local5 = arg3 - arg0;
		@Pc(9) float local9 = arg4 - arg1;
		@Pc(13) float local13 = arg5 - arg2;
		@Pc(15) float local15 = 0.0F;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 0.0F;
		@Pc(23) Class570 local23 = client.aClass539_1.method30932(-1638462787);
		while (local1 < 1.1F) {
			@Pc(33) float local33 = local5 * local1 + arg0;
			@Pc(39) float local39 = arg1 + local1 * local9;
			@Pc(45) float local45 = arg2 + local1 * local13;
			@Pc(50) int local50 = (int) local33 >> 9;
			@Pc(55) int local55 = (int) local45 >> 9;
			if (local50 > 0 && local55 > 0 && local50 < client.aClass539_1.method30921(2137778279) && local55 < client.aClass539_1.method31011(-1182973070)) {
				@Pc(72) int local72 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99;
				if (local72 < 3 && (client.aClass539_1.method30903(-463929735).aByteArrayArrayArray12[1][local50][local55] & 0x2) != 0) {
					local72++;
				}
				@Pc(100) int local100 = local23.aClass100Array3[local72].method2915((int) local33, (int) local45, (byte) -128);
				if ((float) local100 < local39) {
					if (arg6 >= 2) {
						return local1 - 0.1F + method31845(local15, local17, local19, local33, local39, local45, arg6 - 1, 836110641) * 0.1F;
					}
					return local1;
				}
			}
			local15 = local33;
			local17 = local39;
			local19 = local45;
			local1 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!tv", name = "pw", descriptor = "(Lclient!yp;I)V")
	static void method31846(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class535.method30858(local11, local14, arg0, -142384231);
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "([SI)V")
	public static void method31847(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!tv", name = "gk", descriptor = "(I)V")
	public static void method31848(@OriginalArg(0) int arg0) {
		@Pc(2) Container local2 = Class60.method1187(-1250397360);
		@Pc(6) int local6 = local2.getSize().width;
		@Pc(10) int local10 = local2.getSize().height;
		if (Class244.aFrame1 == local2) {
			@Pc(16) Insets local16 = Class244.aFrame1.getInsets();
			local6 -= local16.left + local16.right;
			local10 -= local16.top + local16.bottom;
		}
		if (Class334.anInt4196 * -455826321 == local6 && Class286.anInt3942 * -1411780839 == local10 && !client.aBoolean718) {
			return;
		}
		if (Class279.aClass102_9 == null || Class279.aClass102_9.method20666()) {
			Class688.method36897(884344916);
		} else {
			Class334.anInt4196 = local6 * -252102001;
			Class286.anInt3942 = local10 * -1848246999;
		}
		client.aLong352 = (Class303.method27111((byte) 48) + 500L) * -2661831643140335425L;
		client.aBoolean718 = false;
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	Class584() throws Throwable {
		throw new Error();
	}
}
