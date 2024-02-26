package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aje")
public final class Class80_Sub3 extends Class80 {

	@OriginalMember(owner = "client!aje", name = "u", descriptor = "Lclient!aax;")
	static final Class24 aClass24_9 = new Class24(32);

	@OriginalMember(owner = "client!aje", name = "l", descriptor = "Lclient!ej;")
	static final Class243 aClass243_20 = new Class243(11);

	@OriginalMember(owner = "client!aje", name = "i", descriptor = "[I")
	int[] anIntArray179 = new int[] { -1 };

	@OriginalMember(owner = "client!aje", name = "m", descriptor = "[I")
	int[] anIntArray178 = new int[] { 0 };

	@OriginalMember(owner = "client!aje", name = "o", descriptor = "[Lclient!abg;")
	Class33[] aClass33Array1 = null;

	@OriginalMember(owner = "client!aje", name = "ah", descriptor = "(IZ)I")
	public static int method12756(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class80_Sub3 local8 = Class565.method31482(arg0, arg1, -654066386);
		if (local8 == null) {
			return ((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, -126309128)).anInt280 * -2146728983;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local8.anIntArray179.length; local24++) {
			if (local8.anIntArray179[local24] == -1) {
				local22++;
			}
		}
		return local22 + (((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, 1686892463)).anInt280 * -2146728983 - local8.anIntArray179.length);
	}

	@OriginalMember(owner = "client!aje", name = "ae", descriptor = "()V")
	static void method12758() {
		aClass243_20.method26256(1693912082);
	}

	@OriginalMember(owner = "client!aje", name = "aq", descriptor = "(IIZ)I")
	public static int method12759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, -1186158014);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray178.length; local17++) {
				if (local4.anIntArray179[local17] == arg1) {
					local15 += local4.anIntArray178[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!aje", name = "y", descriptor = "(IIZ)I")
	public static int method12760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 409572738);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aje", name = "c", descriptor = "(IIZ)I")
	public static int method12761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 410427396);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aje", name = "b", descriptor = "(IIZ)I")
	public static int method12762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, -1037959124);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aje", name = "ab", descriptor = "(IIZZ)I")
	public static int method12763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg3, 856009695);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray179.length; local12++) {
			if (local4.anIntArray179[local12] >= 0 && local4.anIntArray179[local12] < Class25.aClass41_Sub9_1.anInt2476 * 462823477) {
				@Pc(40) Class43 local40 = (Class43) Class25.aClass41_Sub9_1.method18054(local4.anIntArray179[local12], -546900405);
				@Pc(53) int local53 = local40.method917(arg1, ((Class79) Class370.aClass41_Sub10_1.method18054(arg1, -63878837)).anInt253 * 680817871, (short) -10281);
				if (arg2) {
					local10 += local53 * local4.anIntArray178[local12];
				} else if (local4.anIntArray178[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aje", name = "ay", descriptor = "(IIIZ)I")
	public static int method12764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg2, 1896438014);
		@Pc(8) Class107 local8 = local5.aClass107_1;
		@Pc(13) Class80_Sub3 local13 = Class565.method31482(arg0, arg3, -827494748);
		@Pc(38) int local38;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray178.length || local13.aClass33Array1 == null || local13.aClass33Array1[arg1] == null) {
			local38 = (Integer) local8.method7184((byte) 14);
		} else {
			local38 = local13.aClass33Array1[arg1].method722(local8.anInt862 * -1873516487, (byte) 2);
		}
		return local5.method28421(local38, 466831598);
	}

	@OriginalMember(owner = "client!aje", name = "ai", descriptor = "(IIZ)I")
	public static int method12765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 270326195);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray178.length; local17++) {
				if (local4.anIntArray179[local17] == arg1) {
					local15 += local4.anIntArray178[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!aje", name = "n", descriptor = "(IIZ)I")
	public static int method12766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 477106700);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aje", name = "ao", descriptor = "(IIZ)I")
	public static int method12767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 54734874);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray178.length; local17++) {
				if (local4.anIntArray179[local17] == arg1) {
					local15 += local4.anIntArray178[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!aje", name = "ac", descriptor = "(IIZ)I")
	public static int method12769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub3 local6 = Class565.method31482(arg0, arg2, 405495654);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray179.length; local12++) {
			if (local6.anIntArray179[local12] >= 0 && ((Class43) Class25.aClass41_Sub9_1.method18054(local6.anIntArray179[local12], 219265896)).anInt122 * 855963023 == arg1) {
				local1 += Class220.method25906(arg0, local12, arg2, -866041822);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aje", name = "ax", descriptor = "(IIZ)I")
	public static int method12770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, -466061505);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aje", name = "al", descriptor = "(IZ)I")
	public static int method12771(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class80_Sub3 local8 = Class565.method31482(arg0, arg1, 1199415738);
		if (local8 == null) {
			return ((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, 723292900)).anInt280 * -2146728983;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local8.anIntArray179.length; local24++) {
			if (local8.anIntArray179[local24] == -1) {
				local22++;
			}
		}
		return local22 + (((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, -1487711443)).anInt280 * -2146728983 - local8.anIntArray179.length);
	}

	@OriginalMember(owner = "client!aje", name = "ag", descriptor = "(IIZ)I")
	public static int method12772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub3 local6 = Class565.method31482(arg0, arg2, 1896881444);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray179.length; local12++) {
			if (local6.anIntArray179[local12] >= 0 && ((Class43) Class25.aClass41_Sub9_1.method18054(local6.anIntArray179[local12], 430499129)).anInt122 * 855963023 == arg1) {
				local1 += Class220.method25906(arg0, local12, arg2, -866041822);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aje", name = "af", descriptor = "(IZ)I")
	public static int method12773(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class80_Sub3 local8 = Class565.method31482(arg0, arg1, -1164469703);
		if (local8 == null) {
			return ((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, 202277192)).anInt280 * -2146728983;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local8.anIntArray179.length; local24++) {
			if (local8.anIntArray179[local24] == -1) {
				local22++;
			}
		}
		return local22 + (((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0, -794517753)).anInt280 * -2146728983 - local8.anIntArray179.length);
	}

	@OriginalMember(owner = "client!aje", name = "am", descriptor = "(IIIILclient!abg;Z)V")
	static void method12774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class80_Sub3 local13 = (Class80_Sub3) aClass24_9.method560(local8);
		if (local13 == null) {
			local13 = new Class80_Sub3();
			aClass24_9.method563(local13, local8);
		}
		if (local13.anIntArray179.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class33[] local40 = null;
			if (local13.aClass33Array1 != null) {
				local40 = new Class33[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray179.length; local51++) {
				local33[local51] = local13.anIntArray179[local51];
				local38[local51] = local13.anIntArray178[local51];
				if (local13.aClass33Array1 != null) {
					local40[local51] = local13.aClass33Array1[local51];
				}
			}
			for (local51 = local13.anIntArray179.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray179 = local33;
			local13.anIntArray178 = local38;
			local13.aClass33Array1 = local40;
		}
		local13.anIntArray179[arg1] = arg2;
		local13.anIntArray178[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass33Array1 == null) {
				local13.aClass33Array1 = new Class33[local13.anIntArray179.length];
			}
			local13.aClass33Array1[arg1] = arg4;
		} else if (local13.aClass33Array1 != null) {
			local13.aClass33Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!aje", name = "ak", descriptor = "(IZ)V")
	static void method12775(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg1, -268709012);
		if (local4 != null) {
			local4.method24395((byte) 72);
		}
	}

	@OriginalMember(owner = "client!aje", name = "aa", descriptor = "()V")
	static void method12780() {
		aClass243_20.method26256(1693912082);
	}

	@OriginalMember(owner = "client!aje", name = "aj", descriptor = "(IIZ)I")
	public static int method12781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, -1692485655);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray178.length; local17++) {
				if (local4.anIntArray179[local17] == arg1) {
					local15 += local4.anIntArray178[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!aje", name = "t", descriptor = "(Lclient!ald;B)Lclient!kc;")
	public static Class375 method12782(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class391 local6 = Class58_Sub1.method15727((byte) -110)[arg0.g1()];
		@Pc(13) Class383 local13 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(17) int local17 = arg0.g2s();
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.gSmart2or4null();
		@Pc(29) int local29 = arg0.g4();
		@Pc(33) int local33 = arg0.g1();
		return new Class375(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!aje", name = "k", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I")
	public static int method12783(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(18) int[] local18 = new int[local2 + 1];
			@Pc(23) int[] local23 = new int[local2 + 1];
			@Pc(25) int local25 = 0;
			while (local25 <= local2) {
				local18[local25] = local25++;
			}
			for (local25 = 1; local25 <= local5; local25++) {
				local23[0] = local25;
				@Pc(49) char local49 = arg1.charAt(local25 - 1);
				for (@Pc(51) int local51 = 1; local51 <= local2; local51++) {
					local23[local51] = Math.min(Math.min(local23[local51 - 1] + 1, local18[local51] + 1), local18[local51 - 1] + (arg0.charAt(local51 - 1) == local49 ? 0 : 1));
				}
				@Pc(91) int[] local91 = local18;
				local18 = local23;
				local23 = local91;
			}
			return local18[local2];
		}
	}

	@OriginalMember(owner = "client!aje", name = "ax", descriptor = "(IB)V")
	static void method12784(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class483.anInt5003 = arg0 * 135634463;
		Class80_Sub17_Sub1.aClass80_Sub17_Sub1Array1 = new Class80_Sub17_Sub1[arg0];
		Class693.anInt5783 = 0;
	}

	@OriginalMember(owner = "client!aje", name = "<init>", descriptor = "()V")
	Class80_Sub3() {
	}

	@OriginalMember(owner = "client!aje", name = "x", descriptor = "([II[IZB)J")
	long method12757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aje", name = "z", descriptor = "(Lclient!di;ILclient!aad;IZLclient!xw;S)Lclient!dn;")
	Class105 method12768(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class672 arg5, @OriginalArg(6) short arg6) {
		@Pc(1) Class105 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class621 local5 = null;
		if (arg3 != -1) {
			local5 = (Class621) Class533.aClass41_Sub18_1.method18054(arg3, -1688031892);
		}
		@Pc(17) int[] local17 = this.anIntArray179;
		if (local5 != null && local5.anIntArray499 != null) {
			local17 = new int[local5.anIntArray499.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray499.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray499[local30];
				if (local40 >= 0 && local40 < this.anIntArray179.length) {
					local17[local30] = this.anIntArray179[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23592(2061466584);
		}
		@Pc(84) long local84 = this.method12757(local17, arg3, arg5 == null ? null : arg5.anIntArray518, arg4, (byte) 2);
		if (aClass243_20 != null) {
			local1 = (Class105) aClass243_20.method26282(local84);
		}
		if (local1 == null || arg0.method21083(local1.method7326(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20755(local3, local1.method7326());
			}
			@Pc(111) int local111 = local3;
			@Pc(113) boolean local113 = false;
			for (@Pc(115) int local115 = 0; local115 < local17.length; local115++) {
				if (local17[local115] != -1 && !((Class43) Class25.aClass41_Sub9_1.method18054(local17[local115], -942888463)).method876(arg4, null, (byte) -77)) {
					local113 = true;
				}
			}
			if (local113) {
				return null;
			}
			@Pc(149) Class232[] local149 = new Class232[local17.length];
			@Pc(151) int local151;
			for (local151 = 0; local151 < local17.length; local151++) {
				if (local17[local151] != -1) {
					local149[local151] = ((Class43) Class25.aClass41_Sub9_1.method18054(local17[local151], 1829259630)).method889(arg4, null, -1701814375);
				}
			}
			@Pc(207) int local207;
			@Pc(214) int local214;
			if (local5 != null && local5.anIntArrayArray63 != null) {
				for (local151 = 0; local151 < local5.anIntArrayArray63.length; local151++) {
					if (local5.anIntArrayArray63[local151] != null && local149[local151] != null) {
						local207 = local5.anIntArrayArray63[local151][0];
						local214 = local5.anIntArrayArray63[local151][1];
						@Pc(221) int local221 = local5.anIntArrayArray63[local151][2];
						@Pc(228) int local228 = local5.anIntArrayArray63[local151][3];
						@Pc(235) int local235 = local5.anIntArrayArray63[local151][4];
						@Pc(242) int local242 = local5.anIntArrayArray63[local151][5];
						if (local228 != 0 || local235 != 0 || local242 != 0) {
							local149[local151].method26047(local228, local235, local242);
						}
						if (local207 != 0 || local214 != 0 || local221 != 0) {
							local149[local151].method26040(local207, local214, local221);
						}
					}
				}
			}
			@Pc(280) Class232 local280 = new Class232(local149, local149.length);
			if (arg5 != null) {
				local111 = local3 | 0x4000;
			}
			local1 = arg0.method20753(local280, local111, Class77.anInt251 * -1370018711, 64, 856);
			if (arg5 != null) {
				local207 = 0;
				label123: while (true) {
					if (local207 >= 10) {
						local207 = 0;
						while (true) {
							if (local207 >= 10) {
								break label123;
							}
							for (local214 = 0; local214 < Class631.aShortArrayArray6[local207].length; local214++) {
								if (arg5.anIntArray519[local207] < Class267.aShortArrayArrayArray6[local207][local214].length) {
									local1.method7341(Class631.aShortArrayArray6[local207][local214], Class267.aShortArrayArrayArray6[local207][local214][arg5.anIntArray519[local207]]);
								}
							}
							local207++;
						}
					}
					for (local214 = 0; local214 < Class594.aShortArrayArray5[local207].length; local214++) {
						if (arg5.anIntArray518[local207] < Class80_Sub41.aShortArrayArrayArray5[local207][local214].length) {
							local1.method7391(Class594.aShortArrayArray5[local207][local214], Class80_Sub41.aShortArrayArrayArray5[local207][local214][arg5.anIntArray518[local207]]);
						}
					}
					local207++;
				}
			}
			if (aClass243_20 != null) {
				local1.method7422(local3);
				aClass243_20.method26253(local1, local84);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(407) Class105 local407 = local1.method7324((byte) 1, local3, true);
			arg2.method23593(local407, 0, (byte) 125);
			return local407;
		}
	}

	@OriginalMember(owner = "client!aje", name = "at", descriptor = "([II[IZ)J")
	long method12776(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aje", name = "ad", descriptor = "([II[IZ)J")
	long method12777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aje", name = "av", descriptor = "(Lclient!di;ILclient!aad;IZLclient!xw;)Lclient!dn;")
	Class105 method12778(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class672 arg5) {
		@Pc(1) Class105 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class621 local5 = null;
		if (arg3 != -1) {
			local5 = (Class621) Class533.aClass41_Sub18_1.method18054(arg3, 1845222564);
		}
		@Pc(17) int[] local17 = this.anIntArray179;
		if (local5 != null && local5.anIntArray499 != null) {
			local17 = new int[local5.anIntArray499.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray499.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray499[local30];
				if (local40 >= 0 && local40 < this.anIntArray179.length) {
					local17[local30] = this.anIntArray179[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23592(2113265440);
		}
		@Pc(84) long local84 = this.method12757(local17, arg3, arg5 == null ? null : arg5.anIntArray518, arg4, (byte) 2);
		if (aClass243_20 != null) {
			local1 = (Class105) aClass243_20.method26282(local84);
		}
		if (local1 == null || arg0.method21083(local1.method7326(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20755(local3, local1.method7326());
			}
			@Pc(111) int local111 = local3;
			@Pc(113) boolean local113 = false;
			for (@Pc(115) int local115 = 0; local115 < local17.length; local115++) {
				if (local17[local115] != -1 && !((Class43) Class25.aClass41_Sub9_1.method18054(local17[local115], -1606638998)).method876(arg4, null, (byte) -118)) {
					local113 = true;
				}
			}
			if (local113) {
				return null;
			}
			@Pc(149) Class232[] local149 = new Class232[local17.length];
			@Pc(151) int local151;
			for (local151 = 0; local151 < local17.length; local151++) {
				if (local17[local151] != -1) {
					local149[local151] = ((Class43) Class25.aClass41_Sub9_1.method18054(local17[local151], -1208718332)).method889(arg4, null, -1701814375);
				}
			}
			@Pc(207) int local207;
			@Pc(214) int local214;
			if (local5 != null && local5.anIntArrayArray63 != null) {
				for (local151 = 0; local151 < local5.anIntArrayArray63.length; local151++) {
					if (local5.anIntArrayArray63[local151] != null && local149[local151] != null) {
						local207 = local5.anIntArrayArray63[local151][0];
						local214 = local5.anIntArrayArray63[local151][1];
						@Pc(221) int local221 = local5.anIntArrayArray63[local151][2];
						@Pc(228) int local228 = local5.anIntArrayArray63[local151][3];
						@Pc(235) int local235 = local5.anIntArrayArray63[local151][4];
						@Pc(242) int local242 = local5.anIntArrayArray63[local151][5];
						if (local228 != 0 || local235 != 0 || local242 != 0) {
							local149[local151].method26047(local228, local235, local242);
						}
						if (local207 != 0 || local214 != 0 || local221 != 0) {
							local149[local151].method26040(local207, local214, local221);
						}
					}
				}
			}
			@Pc(280) Class232 local280 = new Class232(local149, local149.length);
			if (arg5 != null) {
				local111 = local3 | 0x4000;
			}
			local1 = arg0.method20753(local280, local111, Class77.anInt251 * -1370018711, 64, 856);
			if (arg5 != null) {
				local207 = 0;
				label123: while (true) {
					if (local207 >= 10) {
						local207 = 0;
						while (true) {
							if (local207 >= 10) {
								break label123;
							}
							for (local214 = 0; local214 < Class631.aShortArrayArray6[local207].length; local214++) {
								if (arg5.anIntArray519[local207] < Class267.aShortArrayArrayArray6[local207][local214].length) {
									local1.method7341(Class631.aShortArrayArray6[local207][local214], Class267.aShortArrayArrayArray6[local207][local214][arg5.anIntArray519[local207]]);
								}
							}
							local207++;
						}
					}
					for (local214 = 0; local214 < Class594.aShortArrayArray5[local207].length; local214++) {
						if (arg5.anIntArray518[local207] < Class80_Sub41.aShortArrayArrayArray5[local207][local214].length) {
							local1.method7391(Class594.aShortArrayArray5[local207][local214], Class80_Sub41.aShortArrayArrayArray5[local207][local214][arg5.anIntArray518[local207]]);
						}
					}
					local207++;
				}
			}
			if (aClass243_20 != null) {
				local1.method7422(local3);
				aClass243_20.method26253(local1, local84);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(407) Class105 local407 = local1.method7324((byte) 1, local3, true);
			arg2.method23593(local407, 0, (byte) 100);
			return local407;
		}
	}

	@OriginalMember(owner = "client!aje", name = "an", descriptor = "(Lclient!di;ILclient!aad;IZLclient!xw;)Lclient!dn;")
	Class105 method12779(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class672 arg5) {
		@Pc(1) Class105 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class621 local5 = null;
		if (arg3 != -1) {
			local5 = (Class621) Class533.aClass41_Sub18_1.method18054(arg3, 1502442128);
		}
		@Pc(17) int[] local17 = this.anIntArray179;
		if (local5 != null && local5.anIntArray499 != null) {
			local17 = new int[local5.anIntArray499.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray499.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray499[local30];
				if (local40 >= 0 && local40 < this.anIntArray179.length) {
					local17[local30] = this.anIntArray179[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23592(1890499895);
		}
		@Pc(84) long local84 = this.method12757(local17, arg3, arg5 == null ? null : arg5.anIntArray518, arg4, (byte) 2);
		if (aClass243_20 != null) {
			local1 = (Class105) aClass243_20.method26282(local84);
		}
		if (local1 == null || arg0.method21083(local1.method7326(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20755(local3, local1.method7326());
			}
			@Pc(111) int local111 = local3;
			@Pc(113) boolean local113 = false;
			for (@Pc(115) int local115 = 0; local115 < local17.length; local115++) {
				if (local17[local115] != -1 && !((Class43) Class25.aClass41_Sub9_1.method18054(local17[local115], -1451754101)).method876(arg4, null, (byte) -102)) {
					local113 = true;
				}
			}
			if (local113) {
				return null;
			}
			@Pc(149) Class232[] local149 = new Class232[local17.length];
			@Pc(151) int local151;
			for (local151 = 0; local151 < local17.length; local151++) {
				if (local17[local151] != -1) {
					local149[local151] = ((Class43) Class25.aClass41_Sub9_1.method18054(local17[local151], -482996403)).method889(arg4, null, -1701814375);
				}
			}
			@Pc(207) int local207;
			@Pc(214) int local214;
			if (local5 != null && local5.anIntArrayArray63 != null) {
				for (local151 = 0; local151 < local5.anIntArrayArray63.length; local151++) {
					if (local5.anIntArrayArray63[local151] != null && local149[local151] != null) {
						local207 = local5.anIntArrayArray63[local151][0];
						local214 = local5.anIntArrayArray63[local151][1];
						@Pc(221) int local221 = local5.anIntArrayArray63[local151][2];
						@Pc(228) int local228 = local5.anIntArrayArray63[local151][3];
						@Pc(235) int local235 = local5.anIntArrayArray63[local151][4];
						@Pc(242) int local242 = local5.anIntArrayArray63[local151][5];
						if (local228 != 0 || local235 != 0 || local242 != 0) {
							local149[local151].method26047(local228, local235, local242);
						}
						if (local207 != 0 || local214 != 0 || local221 != 0) {
							local149[local151].method26040(local207, local214, local221);
						}
					}
				}
			}
			@Pc(280) Class232 local280 = new Class232(local149, local149.length);
			if (arg5 != null) {
				local111 = local3 | 0x4000;
			}
			local1 = arg0.method20753(local280, local111, Class77.anInt251 * -1370018711, 64, 856);
			if (arg5 != null) {
				local207 = 0;
				label123: while (true) {
					if (local207 >= 10) {
						local207 = 0;
						while (true) {
							if (local207 >= 10) {
								break label123;
							}
							for (local214 = 0; local214 < Class631.aShortArrayArray6[local207].length; local214++) {
								if (arg5.anIntArray519[local207] < Class267.aShortArrayArrayArray6[local207][local214].length) {
									local1.method7341(Class631.aShortArrayArray6[local207][local214], Class267.aShortArrayArrayArray6[local207][local214][arg5.anIntArray519[local207]]);
								}
							}
							local207++;
						}
					}
					for (local214 = 0; local214 < Class594.aShortArrayArray5[local207].length; local214++) {
						if (arg5.anIntArray518[local207] < Class80_Sub41.aShortArrayArrayArray5[local207][local214].length) {
							local1.method7391(Class594.aShortArrayArray5[local207][local214], Class80_Sub41.aShortArrayArrayArray5[local207][local214][arg5.anIntArray518[local207]]);
						}
					}
					local207++;
				}
			}
			if (aClass243_20 != null) {
				local1.method7422(local3);
				aClass243_20.method26253(local1, local84);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(407) Class105 local407 = local1.method7324((byte) 1, local3, true);
			arg2.method23593(local407, 0, (byte) 119);
			return local407;
		}
	}
}
