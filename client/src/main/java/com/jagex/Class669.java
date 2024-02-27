package com.jagex;

import com.jagex.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xs")
public final class Class669 {

	@OriginalMember(owner = "client!xs", name = "d", descriptor = "Lclient!com/jagex/twitchtv/TwitchTV;")
	static TwitchTV aTwitchTV1;

	@OriginalMember(owner = "client!xs", name = "t", descriptor = "I")
	public int anInt5711;

	@OriginalMember(owner = "client!xs", name = "afp", descriptor = "(Lclient!yp;I)V")
	static void method33492(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(26) int local26 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13 + Class104_Sub2.method4581(local26, true, (byte) 56);
	}

	@OriginalMember(owner = "client!xs", name = "ajo", descriptor = "(Lclient!yp;B)V")
	static void method33493(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!xs", name = "bay", descriptor = "(Lclient!yp;I)V")
	static void method33494(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!xs", name = "h", descriptor = "(Lclient!di;Lclient!cg;Lclient!hx;IIIIII)V")
	static void method33495(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) Class320 local5 = (Class320) Class157.aClass41_Sub13_2.method18054(arg7, 756851514);
		if (local5 != null && local5.anIntArray389 != null && local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2044924012)) {
			local5 = local5.method27550(Class672.aClass134_1, Class672.aClass134_1, 1518210287);
		}
		if (local5 == null || !local5.aBoolean796 || !local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2073507104)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray390 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray390.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class368.anInt4502 * -1583611537 == 3) {
					local71 = (int) ((double) BufferedSocket.aClass121_Sub1_2.method9648(-1751978382) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
				} else if (Class368.anInt4502 * -1583611537 == 4) {
					local71 = (int) client.aFloat255 & 0x3FFF;
				} else {
					local71 = client.anInt3474 * -1918431893 + (int) client.aFloat255 & 0x3FFF;
				}
				local96 = Class467.anIntArray454[local71];
				local100 = Class467.anIntArray453[local71];
				if (Class368.anInt4502 * -1583611537 != 4) {
					local96 = local96 * 256 / (client.anInt3476 * -692320695 + 256);
					local100 = local100 * 256 / (client.anInt3476 * -692320695 + 256);
				}
				local44[local46 * 2] = arg2.anInt4103 * 1892149809 / 2 + arg3 + ((local5.anIntArray390[local46 * 2] * 4 + arg5) * local100 + (arg6 + local5.anIntArray390[local46 * 2 + 1] * 4) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt4104 * 1990157877 / 2 + arg4 - ((local5.anIntArray390[local46 * 2 + 1] * 4 + arg6) * local100 - (arg5 + local5.anIntArray390[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class323 local220 = arg2.method27643(arg0, 1477428010);
			if (local220 != null) {
				Class234.method26108(arg0, local44, local5.anInt4054 * 2024928351, local220.anIntArray399, local220.anIntArray398);
			}
			if (local5.anInt4039 * -794672681 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local271 == local96 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20729(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					} else {
						arg0.method20979(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local100 == local71 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20729(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				} else {
					arg0.method20979(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20727(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1);
				}
				arg0.method20727(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20728(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20728(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class99 local679 = null;
		if (local5.anInt4037 * 1279732247 != -1) {
			local679 = local5.method27545(arg0, false, 1349192566);
			if (local679 != null) {
				local46 = local5.anInt4060 * -1105818937 > 0 ? local5.anInt4060 * -1105818937 : Class698.aClass638_1.anInt5613 * -1632664461;
				Class165.method16960(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass313_4, local5.aClass309_4, (byte) 61);
			}
		}
		if (local5.aString178 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18219();
		}
		@Pc(738) Class104 local738 = Class108.aClass104_22;
		@Pc(740) Class15 local740 = Class619.aClass15_12;
		if (local5.anInt4031 * -618572023 == 1) {
			local738 = Class709.aClass104_26;
			local740 = Class689.aClass15_13;
		}
		if (local5.anInt4031 * -618572023 == 2) {
			local738 = Class8.aClass104_1;
			local740 = Class375.aClass15_9;
		}
		Class281.method26861(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString178, local738, local740, local5.anInt4032 * -791504431, -662863250);
	}

	@OriginalMember(owner = "client!xs", name = "mr", descriptor = "(Lclient!hx;I)Ljava/lang/String;")
	static String method33496(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1) {
		if (client.method25326(arg0).method14325(-1992993832) == 0) {
			return null;
		} else if (arg0.aString186 == null || arg0.aString186.trim().length() == 0) {
			return client.aBoolean735 ? "Hidden-use" : null;
		} else {
			return arg0.aString186;
		}
	}

	@OriginalMember(owner = "client!xs", name = "ds", descriptor = "(Lclient!di;IIIIB)V")
	static void method33497(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		arg0.method20986(arg1, arg2, arg3 + arg1, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (Class159_Sub1.anInt2017 * 1776676847 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20722(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20818(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3570 * 1973763491].getRGB(), 0);
			arg0.method20722(local22 - 150, local32 + 2, Class159_Sub1.anInt2017 * 1035063245, 30, client.aColorArray1[client.anInt3570 * 1973763491].getRGB(), 0);
			Class8.aClass104_1.method7642(Class60.aClass60_122.method1180(Class512.aClass719_3, -363113290), local22, local16 + local32, client.aColorArray3[client.anInt3570 * 1973763491].getRGB(), -1, 1878840819);
			return;
		}
		@Pc(103) int local103 = Class159_Sub1.anInt2026 * 2002101755 - (int) ((float) arg3 / Class159_Sub1.aFloat151);
		local22 = (int) ((float) arg4 / Class159_Sub1.aFloat151) + Class158.anInt2029 * 2067675511;
		local32 = Class159_Sub1.anInt2026 * 2002101755 + (int) ((float) arg3 / Class159_Sub1.aFloat151);
		@Pc(133) int local133 = Class158.anInt2029 * 2067675511 - (int) ((float) arg4 / Class159_Sub1.aFloat151);
		Class147_Sub2.anInt1485 = (Class159_Sub1.anInt2026 * 2002101755 - (int) ((float) arg3 / Class159_Sub1.aFloat151)) * -1826477251;
		Class469.anInt4956 = (Class158.anInt2029 * 2067675511 - (int) ((float) arg4 / Class159_Sub1.aFloat151)) * -359467987;
		Class290.anInt3947 = (int) ((float) (arg3 * 2) / Class159_Sub1.aFloat151) * 391275033;
		Class278.anInt3927 = (int) ((float) (arg4 * 2) / Class159_Sub1.aFloat151) * -1702485925;
		Class159_Sub1.aClass243_34 = Class159_Sub1.aClass243_32;
		Class159_Sub1.method15344(Class159_Sub1.anInt1991 + local103, Class159_Sub1.anInt1996 + local22, local32 + Class159_Sub1.anInt1991, local133 + Class159_Sub1.anInt1996, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		Class159_Sub1.method15346(arg0, !Class159_Sub1.aBoolean404, !Class159_Sub1.aBoolean402, client.aBoolean732, false);
		@Pc(219) Class8 local219 = Class159_Sub1.method15357(arg0);
		Class721.method37334(arg0, local219, 0, 0, -1382500393);
		if (client.aBoolean715) {
			@Pc(233) int local233 = arg3 + arg1 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class709.aClass104_26.method7629("Fps: " + Class554.anInt3413 * -1936589983 + " (" + Class554.anInt3414 * 197513509 + " ms)", local233, local239, 16776960, -1, 2127774364);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class709.aClass104_26.method7629("Mem:" + local276 + "k", local233, local265, local278, -1, 1232541421);
			local239 = local265 - 15;
		}
		Class159_Sub1.aClass243_32.method26247(5, (byte) 63);
	}

	@OriginalMember(owner = "client!xs", name = "bdh", descriptor = "(Lclient!yp;I)V")
	static void method33498(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26779(65535);
	}

	@OriginalMember(owner = "client!xs", name = "<init>", descriptor = "(I)V")
	public Class669(@OriginalArg(0) int arg0) {
		this.anInt5711 = arg0 * 2092533495;
	}
}
