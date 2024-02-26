package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

@OriginalClass("client!qu")
public final class Class518 {

	@OriginalMember(owner = "client!qu", name = "aq", descriptor = "Lclient!aam;")
	protected static Class14 aClass14_1;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "Lclient!nt;")
	static Interface48 anInterface48_1;

	@OriginalMember(owner = "client!qu", name = "az", descriptor = "I")
	static int anInt5056;

	@OriginalMember(owner = "client!qu", name = "va", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "[Lclient!pt;")
	Class493[] aClass493Array1;

	@OriginalMember(owner = "client!qu", name = "ass", descriptor = "(Lclient!yp;I)V")
	static void method30584(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 != Class703.aClass80_Sub37_49.aClass165_Sub32_1.method16523(1413360948)) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, local12, (byte) 9);
			Class719.method37291(1395123498);
			client.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!qu", name = "bda", descriptor = "(Lclient!yp;I)V")
	static void method30585(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local13, 326461728).method26723(local23, 404067899) ? 1 : 0;
	}

	@OriginalMember(owner = "client!qu", name = "et", descriptor = "(Lclient!yp;B)V")
	static void method30586(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class352.method28063(local11, local14, arg0, (byte) -1);
	}

	@OriginalMember(owner = "client!qu", name = "abu", descriptor = "(Lclient!yp;B)V")
	static void method30587(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27138(-1196061655) == local12 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "(Lclient!di;II)Z")
	static boolean method30588(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method20744();
		Class303.method27111((byte) 98);
		if (!arg0.method20757(-1759894852)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass539_1.method30921(1977126735);
		@Pc(18) int local18 = client.aClass539_1.method31011(778110466);
		@Pc(22) Class502 local22 = client.aClass539_1.method30903(-463929735);
		@Pc(26) Class570 local26 = client.aClass539_1.method30932(-1638462787);
		@Pc(28) int local28 = arg1;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(44) int local44 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local37 >= 0 && local37 < Class123.aBooleanArrayArray17.length && local44 >= 0 && local44 < Class123.aBooleanArrayArray17[local37].length && Class123.aBooleanArrayArray17[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local74 + local18; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30430(arg1, local92, local78, local85, 73602969)) {
						@Pc(108) int local108 = local92;
						if (local22.method30429(local78, local85, 518612307)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class391.method28677(local108, local78, local85, -1888907107);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class108_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (Class27.aBoolean14) {
			Class86.aClass99_2 = arg0.method20739(local78, local78, false, true);
			local162 = arg0.method20687();
			local162.method23903(0, Class86.aClass99_2.method18231());
			@Pc(188) Interface17 local188 = arg0.method20689(local78, local78);
			local162.method23905(local188);
			arg0.method20684(local162, 464884914);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20714(1, 0);
		} else {
			Class86.aClass99_2 = arg0.method20741(local148, 0, local78, local78, local78, -1657536790);
		}
		client.aClass539_1.method30904((byte) -82).method33390(-1815266045);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 2 + 1][local70 + 1 + 2];
		arg0.method20707(Class27.anIntArray7);
		arg0.method20705();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local14 + local72; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (Class27.aBoolean13) {
					arg0.method20877();
				} else {
					arg0.method20986(0, 0, local70 * 4 + local318, local320 + local70 * 4);
				}
				arg0.method20714(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30430(arg1, local384, local389 + local322, local328 + local394, 73602969);
						}
					}
					local26.aClass100Array3[local384].method2914(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local304 + local389;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30430(arg1, local384, local451, local455, 73602969))) {
								@Pc(474) int local474 = local384;
								if (local22.method30429(local451, local455, 729783404)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class272.method26709(arg0, local474, local451, local455, local318 + local389 * 4, (local70 - local394) * 4 + local320 - 4, local253, local266, 1372940494);
								}
							}
						}
					}
				}
				arg0.method20722(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20744();
				if (!Class27.aBoolean14) {
					Class86.aClass99_2.method18223((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (Class27.aBoolean13) {
						Class86.aClass99_2.method18225(256, 0);
						try {
							arg0.method20657(-1628738402);
							Class217.method25866(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (Class27.aBoolean14) {
			arg0.method20887(local162, (byte) 1);
			if (Class27.aBoolean13) {
				Class86.aClass99_2.method18225(256, 0);
				try {
					arg0.method20657(2117863463);
					Class217.method25866(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20877();
		arg0.method20706(Class27.anIntArray7[0], Class27.anIntArray7[1], Class27.anIntArray7[2], Class27.anIntArray7[3]);
		arg0.method20714(1, 1);
		Class138_Sub1.method10718((byte) 75);
		Class27.anInt87 = 0;
		Class27.aClass8_2.method260(96654390);
		if (!Class27.aBoolean12) {
			Class97.method2118(arg1, 154060609);
			@Pc(637) Class587 local637 = client.aClass539_1.method30896(-1231492913);
			if (local637 != null) {
				Class157.aClass41_Sub13_2.method17572(1024, 64, 103113462);
				@Pc(648) Class626 local648 = client.aClass539_1.method30893((byte) -73);
				for (local318 = 0; local318 < local637.anInt5303 * -70603505; local318++) {
					local320 = local637.anIntArray479[local318];
					if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local648.anInt5540 * -390642507;
						local328 = (local320 & 0x3FFF) - local648.anInt5537 * -894305615;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							Class27.aClass8_2.method232(new Class80_Sub20(local318), 1992868301);
						} else {
							@Pc(714) Class320 local714 = (Class320) Class157.aClass41_Sub13_2.method18054(local637.anIntArray480[local318], -2044484122);
							if (local714.anIntArray390 != null && local714.anInt4052 * 649510463 + local322 >= 0 && local714.anInt4050 * 360284357 + local322 < local14 && local328 + local714.anInt4053 * -987728585 >= 0 && local328 + local714.anInt4051 * 1996000583 < local18) {
								Class27.aClass8_2.method232(new Class80_Sub20(local318), 1246770790);
							}
						}
					}
				}
				Class157.aClass41_Sub13_2.method17572(128, 64, 106645053);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!ald;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	Class518(@OriginalArg(0) Packet arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		arg0.pos = 875935559;
		@Pc(8) int local8 = arg0.g1();
		arg0.pos += local8 * 1130067056;
		@Pc(26) byte[] local26 = new byte[arg0.data.length - arg0.pos * -1380987821];
		arg0.gdata(local26, 0, local26.length);
		@Pc(40) byte[] local40;
		if (arg1 == null || arg2 == null) {
			local40 = local26;
		} else {
			@Pc(46) BigInteger local46 = new BigInteger(local26);
			@Pc(51) BigInteger local51 = local46.modPow(arg1, arg2);
			local40 = local51.toByteArray();
		}
		if (local40.length != 65) {
			throw new RuntimeException();
		}
		@Pc(77) byte[] local77 = Class130_Sub1.method10206(arg0.data, 5, arg0.pos * -1380987821 - local26.length - 5, 304928847);
		@Pc(79) int local79;
		for (local79 = 0; local79 < 64; local79++) {
			if (local77[local79] != local40[local79 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass493Array1 = new Class493[local8];
		for (local79 = 0; local79 < local8; local79++) {
			arg0.pos = local79 * 1130067056 + 1910116130;
			@Pc(117) int local117 = arg0.g4();
			@Pc(121) int local121 = arg0.g4();
			@Pc(125) int local125 = arg0.g4();
			@Pc(129) int local129 = arg0.g4();
			@Pc(132) byte[] local132 = new byte[64];
			arg0.gdata(local132, 0, 64);
			this.aClass493Array1[local79] = new Class493(local117, local125, local121, local129, local132);
		}
	}
}
