package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.image.PixelGrabber;

@OriginalClass("client!jm")
public final class Class364 implements Interface30 {

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "[B")
	static final byte[] aByteArray86 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!ej;")
	static Class243 aClass243_79 = new Class243(128, 4);

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Z")
	boolean aBoolean838;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Lclient!di;")
	Class102 aClass102_10;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!adc;")
	final Class78 aClass78_1;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	final int anInt4497;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	final int anInt4498;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "[Lclient!kk;")
	final Interface32[] anInterface32Array1;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "([B)Lclient!cm;")
	static Class99 method28204(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class60.method1187(-1846945256);
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class279.aClass102_9.method20741(local49, 0, local28, local28, local32, -1657536790);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "()V")
	static void method28205() {
		aClass243_79.method26256(1693912082);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "()V")
	static void method28206() {
		aClass243_79.method26256(1693912082);
	}

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "()V")
	static void method28207() {
		aClass243_79.method26256(1693912082);
	}

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "(Lclient!pf;I)Lclient!cm;")
	public static Class99 method28208(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class99 local5 = (Class99) aClass243_79.method26282((long) arg1);
		if (local5 == null) {
			if (Class365.aBoolean840) {
				local5 = Class279.aClass102_9.method20906(Class212.method25823(arg0, arg1), true);
			} else {
				local5 = Class680.method33639(arg0.method29926(arg1, 1472047355), 968953032);
			}
			aClass243_79.method26253(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "()Z")
	static boolean method28209() {
		try {
			@Pc(3) Class83 local3 = new Class83();
			@Pc(8) byte[] local8 = local3.method1561(aByteArray86, -246287473);
			Class680.method33639(local8, -410890635);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "()Z")
	static boolean method28210() {
		try {
			@Pc(3) Class83 local3 = new Class83();
			@Pc(8) byte[] local8 = local3.method1561(aByteArray86, -246287473);
			Class680.method33639(local8, 1063748384);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "([B)Lclient!cm;")
	static Class99 method28211(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class60.method1187(560755833);
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class279.aClass102_9.method20741(local49, 0, local28, local28, local32, -1657536790);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "(Lclient!pf;I)Lclient!cm;")
	public static Class99 method28212(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class99 local5 = (Class99) aClass243_79.method26282((long) arg1);
		if (local5 == null) {
			if (Class365.aBoolean840) {
				local5 = Class279.aClass102_9.method20906(Class212.method25823(arg0, arg1), true);
			} else {
				local5 = Class680.method33639(arg0.method29926(arg1, 1472047355), -1277879331);
			}
			aClass243_79.method26253(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jm", name = "ab", descriptor = "([B)Lclient!cm;")
	static Class99 method28213(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class60.method1187(-2049821203);
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class279.aClass102_9.method20741(local49, 0, local28, local28, local32, -1657536790);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "(Lclient!ald;B)Lclient!lk;")
	public static Class130 method28214(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.gSmart2or4null();
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -48)[arg0.g1()];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		return new Class130(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!jm", name = "gq", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method28215(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4136 = 705416423;
		arg0.anInt4122 = client.anInt3558 * -811655695;
		arg0.anInt4123 = 0;
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -12);
		}
	}

	@OriginalMember(owner = "client!jm", name = "pj", descriptor = "(Lclient!yp;I)V")
	static void method28216(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2031948327);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class114.method8626(local16, local22, arg0, -31174283);
	}

	@OriginalMember(owner = "client!jm", name = "ahz", descriptor = "(Lclient!yp;I)V")
	static void method28217(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class621 local18 = (Class621) Class533.aClass41_Sub18_1.method18054(local12, -1112626101);
		if (local18.anIntArray497 == null || local18.anIntArray497.length <= 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt5465 * -220980551;
			return;
		}
		@Pc(28) int local28 = 0;
		@Pc(33) int local33 = local18.anIntArray500[0];
		for (@Pc(35) int local35 = 1; local35 < local18.anIntArray497.length; local35++) {
			if (local18.anIntArray500[local35] > local33) {
				local28 = local35;
				local33 = local18.anIntArray500[local35];
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anIntArray497[local28];
	}

	@OriginalMember(owner = "client!jm", name = "auz", descriptor = "(Lclient!yp;I)V")
	static void method28218(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class705.aClass80_Sub39_1.anInt1719 * 625439365 < 512 || client.aBoolean709 || client.aBoolean713 ? 1 : 0;
	}

	@OriginalMember(owner = "client!jm", name = "agt", descriptor = "(Lclient!yp;I)V")
	static void method28219(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class80_Sub3.method12783(local14, local25, 1330399901);
	}

	@OriginalMember(owner = "client!jm", name = "gs", descriptor = "(I)V")
	public static void method28220(@OriginalArg(0) int arg0) {
		if (client.anInt3533 * -1416605621 == -1 || client.anInt3491 * -1222128847 == -1) {
			return;
		}
		@Pc(28) int local28 = (client.anInt3493 * 358894757 * (client.anInt3442 * -1421820033 - client.anInt3494 * 923037339) >> 16) + client.anInt3494 * 923037339;
		client.anInt3493 += local28 * 1815788333;
		if (client.anInt3493 * 358894757 >= 65535) {
			client.anInt3493 = 1324500179;
			if (client.aBoolean741) {
				client.aBoolean727 = false;
			} else {
				client.aBoolean727 = true;
			}
			client.aBoolean741 = true;
		} else {
			client.aBoolean727 = false;
			client.aBoolean741 = false;
		}
		@Pc(62) float local62 = (float) (client.anInt3493 * 358894757) / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = client.anInt3492 * 279450818;
		@Pc(100) int local100;
		@Pc(138) int local138;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(160) int local160;
		@Pc(178) int local178;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69][local71] * 3;
			local100 = client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 1][local71] * 3;
			local138 = (client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 2][local71] - (client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 3][local71] - client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 2][local71])) * 3;
			local148 = client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69][local71];
			local152 = local100 - local86;
			local160 = local138 + (local86 - local100 * 2);
			local178 = local100 + (client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 2][local71] - local148) - local138;
			local65[local71] = (float) local148 + local62 * ((float) local152 + local62 * ((float) local160 + (float) local178 * local62));
		}
		@Pc(204) Class626 local204 = client.aClass539_1.method30893((byte) -50);
		Class89.anInt319 = ((int) local65[0] - local204.anInt5540 * 1854499328) * 2068667409;
		Class283.anInt3937 = (int) local65[1] * -364051605;
		Class102_Sub2.anInt653 = ((int) local65[2] - local204.anInt5537 * 1677025792) * 483037039;
		@Pc(238) float[] local238 = new float[3];
		local100 = client.anInt3539 * 1589802238;
		for (local138 = 0; local138 < 3; local138++) {
			local148 = client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100][local138] * 3;
			local152 = client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100 + 1][local138] * 3;
			local160 = (client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100 + 2][local138] - (client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100 + 3][local138] - client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100 + 2][local138])) * 3;
			local178 = client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100][local138];
			@Pc(325) int local325 = local152 - local148;
			@Pc(333) int local333 = local148 - local152 * 2 + local160;
			@Pc(351) int local351 = client.anIntArrayArrayArray15[client.anInt3491 * -1222128847][local100 + 2][local138] - local178 + local152 - local160;
			local238[local138] = (float) local178 + local62 * ((float) local325 + ((float) local351 * local62 + (float) local333) * local62);
		}
		@Pc(381) float local381 = local238[0] - local65[0];
		@Pc(391) float local391 = -1.0F * (local238[1] - local65[1]);
		@Pc(399) float local399 = local238[2] - local65[2];
		@Pc(409) double local409 = Math.sqrt((double) (local381 * local381 + local399 * local399));
		client.anInt3481 = ((int) (Math.atan2((double) local391, local409) * 2607.5945876176133D) & 0x3FFF) * -560342087;
		Class664.anInt5692 = ((int) (-Math.atan2((double) local381, (double) local399) * 2607.5945876176133D) & 0x3FFF) * -399825347;
		Class338.anInt4231 = (client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69][3] + ((client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69 + 2][3] - client.anIntArrayArrayArray15[client.anInt3533 * -1416605621][local69][3]) * 358894757 * client.anInt3493 >> 16)) * 1745932449;
	}

	@OriginalMember(owner = "client!jm", name = "ju", descriptor = "(IIIIII)I")
	public static int method28221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(12) Class502 local12 = client.aClass539_1.method30903(-463929735);
			@Pc(16) int local16 = arg0 >> 9;
			@Pc(20) int local20 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > client.aClass539_1.method30921(2073224959) - 1 || arg3 > client.aClass539_1.method31011(175449110) - 1) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > client.aClass539_1.method30921(1970943271) - 1 || local20 > client.aClass539_1.method31011(680211792) - 1) {
				return 0;
			}
			@Pc(82) boolean local82 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(106) boolean local106;
			@Pc(124) boolean local124;
			if ((arg0 & 0x1FF) == 0) {
				local106 = (local12.aByteArrayArrayArray12[1][local16 - 1][arg1 >> 9] & 0x2) != 0;
				local124 = (local12.aByteArrayArrayArray12[1][local16][arg1 >> 9] & 0x2) != 0;
				if (local124 != local106) {
					local82 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local106 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20 - 1] & 0x2) != 0;
				local124 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20] & 0x2) != 0;
				if (local106 != local124) {
					local82 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (local82) {
				arg4++;
			}
		}
		return client.aClass539_1.method30932(-1638462787).aClass100Array1[arg4].method2915(arg0, arg1, (byte) -102);
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!adc;IILclient!ki;)V")
	Class364(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class381 arg3) {
		this.aClass78_1 = arg0;
		this.anInt4497 = arg1 * 502781575;
		this.anInt4498 = arg2 * -953856109;
		this.anInterface32Array1 = new Interface32[this.aClass78_1.anInterface33Array1.length];
		for (@Pc(23) int local23 = 0; local23 < this.anInterface32Array1.length; local23++) {
			this.anInterface32Array1[local23] = arg3.method28561(this.aClass78_1.anInterface33Array1[local23], -893308105);
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "()V")
	@Override
	public void method28359() {
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(ZI)V")
	@Override
	public void method28354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 77);
			}
		}
		this.aBoolean838 = false;
	}

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "(I)I")
	@Override
	public int method28351(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 == null || local14.method28657(-681712680)) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface32Array1.length;
	}

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)V")
	@Override
	public void method28344(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "(J)Z")
	@Override
	public boolean method28357(@OriginalArg(0) long arg0) {
		return Class303.currentTimeMillis((byte) 11) >= arg0 + (long) (this.anInt4497 * -250015945);
	}

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "(I)I")
	@Override
	public int method28346(@OriginalArg(0) int arg0) {
		return this.anInt4498 * -391960933;
	}

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "(Z)V")
	@Override
	public void method28348(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 59);
			}
		}
		this.aBoolean838 = false;
	}

	@OriginalMember(owner = "client!jm", name = "aj", descriptor = "()I")
	@Override
	public int method28353() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 == null || local14.method28657(1413084216)) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface32Array1.length;
	}

	@OriginalMember(owner = "client!jm", name = "ai", descriptor = "()V")
	@Override
	public void method28356() {
		if (this.aClass102_10 != Class279.aClass102_9) {
			this.aClass102_10 = Class279.aClass102_9;
			this.aBoolean838 = true;
		}
		this.aClass102_10.method20714(3, 0);
		@Pc(17) Interface32[] local17 = this.anInterface32Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface32 local27 = local17[local19];
			if (local27 != null) {
				local27.method28658(-1578431515);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "(Z)V")
	@Override
	public void method28352(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 116);
			}
		}
		this.aBoolean838 = false;
	}

	@OriginalMember(owner = "client!jm", name = "ag", descriptor = "()I")
	@Override
	public int method28361() {
		return this.anInt4498 * -391960933;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()V")
	@Override
	public void method28345() {
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(Z)V")
	@Override
	public void method28350(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 86);
			}
		}
		this.aBoolean838 = false;
	}

	@OriginalMember(owner = "client!jm", name = "ay", descriptor = "()V")
	@Override
	public void method28355() {
		if (this.aClass102_10 != Class279.aClass102_9) {
			this.aClass102_10 = Class279.aClass102_9;
			this.aBoolean838 = true;
		}
		this.aClass102_10.method20714(3, 0);
		@Pc(17) Interface32[] local17 = this.anInterface32Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface32 local27 = local17[local19];
			if (local27 != null) {
				local27.method28658(-665246112);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "(Z)V")
	@Override
	public void method28347(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 74);
			}
		}
		this.aBoolean838 = false;
	}

	@OriginalMember(owner = "client!jm", name = "aq", descriptor = "()V")
	@Override
	public void method28343() {
		if (this.aClass102_10 != Class279.aClass102_9) {
			this.aClass102_10 = Class279.aClass102_9;
			this.aBoolean838 = true;
		}
		this.aClass102_10.method20714(3, 0);
		@Pc(17) Interface32[] local17 = this.anInterface32Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface32 local27 = local17[local19];
			if (local27 != null) {
				local27.method28658(535729454);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "ao", descriptor = "()V")
	@Override
	public void method28358() {
		if (this.aClass102_10 != Class279.aClass102_9) {
			this.aClass102_10 = Class279.aClass102_9;
			this.aBoolean838 = true;
		}
		this.aClass102_10.method20714(3, 0);
		@Pc(17) Interface32[] local17 = this.anInterface32Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface32 local27 = local17[local19];
			if (local27 != null) {
				local27.method28658(-1975820250);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "ax", descriptor = "()V")
	@Override
	public void method28341() {
	}

	@OriginalMember(owner = "client!jm", name = "ac", descriptor = "(J)Z")
	@Override
	public boolean method28360(@OriginalArg(0) long arg0) {
		return Class303.currentTimeMillis((byte) 119) >= arg0 + (long) (this.anInt4497 * -250015945);
	}

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "(I)V")
	@Override
	public void method28342(@OriginalArg(0) int arg0) {
		if (this.aClass102_10 != Class279.aClass102_9) {
			this.aClass102_10 = Class279.aClass102_9;
			this.aBoolean838 = true;
		}
		this.aClass102_10.method20714(3, 0);
		@Pc(17) Interface32[] local17 = this.anInterface32Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface32 local27 = local17[local19];
			if (local27 != null) {
				local27.method28658(-1236749774);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "(Z)V")
	@Override
	public void method28349(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface32[] local4 = this.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			if (local14 != null) {
				local14.method28662(local1 || this.aBoolean838, (byte) 35);
			}
		}
		this.aBoolean838 = false;
	}
}
