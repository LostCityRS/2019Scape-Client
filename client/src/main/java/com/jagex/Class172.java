package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class172 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "D")
	static final double aDouble3 = 100.0D;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	static final int anInt3178 = 48;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "Lclient!cm;")
	static Class100 aClass100_40;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "Z")
	static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Z")
	static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "[I")
	static int[] anIntArray269 = new int[4];

	@OriginalMember(owner = "client!at", name = "f", descriptor = "I")
	static int anInt3175 = -1899481709;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	static int anInt3176 = 0;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "[I")
	static int[] anIntArray270 = new int[1008];

	@OriginalMember(owner = "client!at", name = "u", descriptor = "[I")
	static int[] anIntArray272 = new int[1006];

	@OriginalMember(owner = "client!at", name = "z", descriptor = "[I")
	static int[] anIntArray271 = new int[1013];

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!aat;")
	static Class22 aClass22_43 = new Class22();

	@OriginalMember(owner = "client!at", name = "d", descriptor = "I")
	public static int anInt3179 = -2004084007;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	public static int anInt3174 = 246739717;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "Z")
	static boolean aBoolean521 = true;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "Z")
	static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "I")
	static int anInt3177 = 0;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "(J)V", line = 20)
	static final void method23196(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V", line = 62)
	Class172() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "()V", line = 67)
	static void method23197() {
		anInt3177 = 0;
		anInt3175 = -1899481709;
		anInt3179 = -2004084007;
		anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!at", name = "i", descriptor = "()V", line = 67)
	static void method23198() {
		anInt3177 = 0;
		anInt3175 = -1899481709;
		anInt3179 = -2004084007;
		anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!at", name = "t", descriptor = "()V", line = 74)
	static void method23199() {
		anInt3177 = 0;
		anInt3179 = -2004084007;
		anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!at", name = "ae", descriptor = "()V", line = 80)
	public static void method23200() {
		aClass100_40 = null;
		anInt3175 = -1899481709;
	}

	@OriginalMember(owner = "client!at", name = "ah", descriptor = "()V", line = 85)
	public static void method23201() {
		anInt3175 = -1899481709;
	}

	@OriginalMember(owner = "client!at", name = "ag", descriptor = "()V", line = 85)
	public static void method23202() {
		anInt3175 = -1899481709;
	}

	@OriginalMember(owner = "client!at", name = "al", descriptor = "()V", line = 89)
	public static void method23203() {
		@Pc(3) int local3 = client.aClass532_1.method30459(922356133);
		@Pc(7) int local7 = client.aClass532_1.method30466((short) 128);
		Class690.aBooleanArrayArray15 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!at", name = "ac", descriptor = "(Lclient!dh;)V", line = 95)
	static void method23204(@OriginalArg(0) Class104 arg0) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != 405524325 * anInt3175 && client.aClass532_1.method30481(-1877533120) != null) {
			Class305.method26797(2037453684);
			if (Class26.method579(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) 2)) {
				anInt3175 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 * 1899481709;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "ai", descriptor = "(Lclient!dh;)V", line = 95)
	static void method23205(@OriginalArg(0) Class104 arg0) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != 405524325 * anInt3175 && client.aClass532_1.method30481(-1023751142) != null) {
			Class305.method26797(1153868387);
			if (Class26.method579(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) 2)) {
				anInt3175 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 * 1899481709;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "aw", descriptor = "(Lclient!dh;I)Z", line = 102)
	static boolean method23206(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		arg0.method20489();
		Class305.method26797(1308697728);
		if (!arg0.method20503(2114416749)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass532_1.method30459(1344771738);
		@Pc(18) int local18 = client.aClass532_1.method30466((short) 128);
		@Pc(22) Class520 local22 = client.aClass532_1.method30487(-1983593023);
		@Pc(26) Class585 local26 = client.aClass532_1.method30481(-1040692198);
		@Pc(28) int local28 = arg1;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(44) int local44 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local37 >= 0 && local37 < Class690.aBooleanArrayArray15.length && local44 >= 0 && local44 < Class690.aBooleanArrayArray15[local37].length && Class690.aBooleanArrayArray15[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local14 + local72; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30335(arg1, local92, local78, local85, (byte) -70)) {
						@Pc(108) int local108 = local92;
						if (local22.method30330(local78, local85, -662808309)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class103.method2810(local108, local78, local85, 359211281);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = 48 + 48 + local14 * 4;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class112_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean519) {
			aClass100_40 = arg0.method20587(local78, local78, false, true);
			local162 = arg0.method20548();
			local162.method23435(0, aClass100_40.method18194());
			@Pc(188) Interface19 local188 = arg0.method20532(local78, local78);
			local162.method23437(local188);
			arg0.method20453(local162, (byte) 1);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20829(1, 0);
		} else {
			aClass100_40 = arg0.method20487(local148, 0, local78, local78, local78, 438797212);
		}
		client.aClass532_1.method30494((byte) -80).method33041(1612425436);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 1 + 2][2 + 1 + local70];
		arg0.method20694(anIntArray269);
		arg0.method20637();
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
				@Pc(335) int local335 = local70 + local304;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local70 + local311;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean520) {
					arg0.method20568();
				} else {
					arg0.method20569(0, 0, local318 + local70 * 4, local320 + local70 * 4);
				}
				arg0.method20829(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30335(arg1, local384, local389 + local322, local328 + local394, (byte) -73);
						}
					}
					local26.aClass99Array2[local384].method2491(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30335(arg1, local384, local451, local455, (byte) -20))) {
								@Pc(474) int local474 = local384;
								if (local22.method30330(local451, local455, -662808309)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class352.method27669(arg0, local474, local451, local455, local389 * 4 + local318, (local70 - local394) * 4 + local320 - 4, local253, local266, 1545327035);
								}
							}
						}
					}
				}
				arg0.method20721(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20489();
				if (!aBoolean519) {
					aClass100_40.method18196((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean520) {
						aClass100_40.method18161(256, 0);
						try {
							arg0.method20421(-1341179042);
							Class212.method25431(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean519) {
			arg0.method20456(local162, -1497248091);
			if (aBoolean520) {
				aClass100_40.method18161(256, 0);
				try {
					arg0.method20421(-517798971);
					Class212.method25431(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20568();
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
		arg0.method20829(1, 1);
		Class635.method32440((short) 255);
		anInt3176 = 0;
		aClass22_43.method405(-2037259486);
		if (!aBoolean522) {
			Class110_Sub15.method20152(arg1, 1413260409);
			@Pc(637) Class584 local637 = client.aClass532_1.method30467(-343184754);
			if (local637 != null) {
				Class542.aClass32_Sub2_3.method16652(1024, 64, 301378599);
				@Pc(649) Class611 local649 = client.aClass532_1.method30455(1952982039);
				for (local318 = 0; local318 < local637.anInt5436 * 1285867561; local318++) {
					local320 = local637.anIntArray473[local318];
					if (local320 >> 28 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5623 * 270611681;
						local328 = (local320 & 0x3FFF) - local649.anInt5624 * -1994307635;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass22_43.method408(new Class93_Sub14(local318), -542925568);
						} else {
							@Pc(715) Class322 local715 = (Class322) Class542.aClass32_Sub2_3.method18261(local637.anIntArray472[local318], 743325613);
							if (local715.anIntArray399 != null && local322 + local715.anInt4122 * 141650771 >= 0 && local715.anInt4104 * -975351719 + local322 < local14 && local328 + local715.anInt4123 * 226143903 >= 0 && local328 + local715.anInt4121 * -1564254457 < local18) {
								aClass22_43.method408(new Class93_Sub14(local318), -1349256718);
							}
						}
					}
				}
				Class542.aClass32_Sub2_3.method16652(128, 64, 267368656);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "as", descriptor = "(Lclient!dh;I)Z", line = 102)
	static boolean method23207(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		arg0.method20489();
		Class305.method26797(1359052957);
		if (!arg0.method20503(2114416749)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass532_1.method30459(-1170673257);
		@Pc(18) int local18 = client.aClass532_1.method30466((short) 128);
		@Pc(22) Class520 local22 = client.aClass532_1.method30487(46013754);
		@Pc(26) Class585 local26 = client.aClass532_1.method30481(-1703412062);
		@Pc(28) int local28 = arg1;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(44) int local44 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local37 >= 0 && local37 < Class690.aBooleanArrayArray15.length && local44 >= 0 && local44 < Class690.aBooleanArrayArray15[local37].length && Class690.aBooleanArrayArray15[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local14 + local72; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30335(arg1, local92, local78, local85, (byte) -31)) {
						@Pc(108) int local108 = local92;
						if (local22.method30330(local78, local85, -662808309)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class103.method2810(local108, local78, local85, -1816423748);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = 48 + 48 + local14 * 4;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class112_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean519) {
			aClass100_40 = arg0.method20587(local78, local78, false, true);
			local162 = arg0.method20548();
			local162.method23435(0, aClass100_40.method18194());
			@Pc(188) Interface19 local188 = arg0.method20532(local78, local78);
			local162.method23437(local188);
			arg0.method20453(local162, (byte) 1);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20829(1, 0);
		} else {
			aClass100_40 = arg0.method20487(local148, 0, local78, local78, local78, 438797212);
		}
		client.aClass532_1.method30494((byte) 23).method33041(-1949279351);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 1 + 2][2 + 1 + local70];
		arg0.method20694(anIntArray269);
		arg0.method20637();
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
				@Pc(335) int local335 = local70 + local304;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local70 + local311;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean520) {
					arg0.method20568();
				} else {
					arg0.method20569(0, 0, local318 + local70 * 4, local320 + local70 * 4);
				}
				arg0.method20829(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30335(arg1, local384, local389 + local322, local328 + local394, (byte) -55);
						}
					}
					local26.aClass99Array2[local384].method2491(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30335(arg1, local384, local451, local455, (byte) -47))) {
								@Pc(474) int local474 = local384;
								if (local22.method30330(local451, local455, -662808309)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class352.method27669(arg0, local474, local451, local455, local389 * 4 + local318, (local70 - local394) * 4 + local320 - 4, local253, local266, 1067354300);
								}
							}
						}
					}
				}
				arg0.method20721(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20489();
				if (!aBoolean519) {
					aClass100_40.method18196((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean520) {
						aClass100_40.method18161(256, 0);
						try {
							arg0.method20421(-360928731);
							Class212.method25431(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean519) {
			arg0.method20456(local162, -1497248091);
			if (aBoolean520) {
				aClass100_40.method18161(256, 0);
				try {
					arg0.method20421(-550906312);
					Class212.method25431(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20568();
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
		arg0.method20829(1, 1);
		Class635.method32440((short) 255);
		anInt3176 = 0;
		aClass22_43.method405(-2037259486);
		if (!aBoolean522) {
			Class110_Sub15.method20152(arg1, 797358512);
			@Pc(637) Class584 local637 = client.aClass532_1.method30467(-164434941);
			if (local637 != null) {
				Class542.aClass32_Sub2_3.method16652(1024, 64, -1629619121);
				@Pc(649) Class611 local649 = client.aClass532_1.method30455(1833784774);
				for (local318 = 0; local318 < local637.anInt5436 * 1285867561; local318++) {
					local320 = local637.anIntArray473[local318];
					if (local320 >> 28 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5623 * 270611681;
						local328 = (local320 & 0x3FFF) - local649.anInt5624 * -1994307635;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass22_43.method408(new Class93_Sub14(local318), -1034794300);
						} else {
							@Pc(715) Class322 local715 = (Class322) Class542.aClass32_Sub2_3.method18261(local637.anIntArray472[local318], -244367247);
							if (local715.anIntArray399 != null && local322 + local715.anInt4122 * 141650771 >= 0 && local715.anInt4104 * -975351719 + local322 < local14 && local328 + local715.anInt4123 * 226143903 >= 0 && local328 + local715.anInt4121 * -1564254457 < local18) {
								aClass22_43.method408(new Class93_Sub14(local318), -1960350830);
							}
						}
					}
				}
				Class542.aClass32_Sub2_3.method16652(128, 64, -1286020290);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "at", descriptor = "(I)V", line = 272)
	static void method23208(@OriginalArg(0) int arg0) {
		anInt3176 = 0;
		@Pc(5) int local5 = client.aClass532_1.method30459(-1395624335);
		@Pc(9) int local9 = client.aClass532_1.method30466((short) 128);
		@Pc(13) Class520 local13 = client.aClass532_1.method30487(-188831309);
		@Pc(17) Class585 local17 = client.aClass532_1.method30481(-967001081);
		@Pc(21) Class32_Sub14 local21 = client.aClass532_1.method30496(2001999113);
		@Pc(23) int local23 = arg0;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(39) int local39 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class690.aBooleanArrayArray15.length && local39 >= 0 && local39 < Class690.aBooleanArrayArray15[local32].length && Class690.aBooleanArrayArray15[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method30335(arg0, local73, local63, local68, (byte) -4)) && !Class393.method28314((Interface61) local17.method31556(local73, local63, local68, -968156135), local21, local63, local68, -1533487777) && !Class393.method28314((Interface61) local17.method31551(local73, local63, local68, client.anInterface62_1, (byte) 3), local21, local63, local68, -1897638973) && !Class393.method28314((Interface61) local17.method31534(local73, local63, local68, -1309876799), local21, local63, local68, -2077719703) && Class393.method28314((Interface61) local17.method31544(local73, local63, local68, -2091509827), local21, local63, local68, -1536004879)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "ad", descriptor = "(I)V", line = 272)
	static void method23209(@OriginalArg(0) int arg0) {
		anInt3176 = 0;
		@Pc(5) int local5 = client.aClass532_1.method30459(1153423901);
		@Pc(9) int local9 = client.aClass532_1.method30466((short) 128);
		@Pc(13) Class520 local13 = client.aClass532_1.method30487(757508233);
		@Pc(17) Class585 local17 = client.aClass532_1.method30481(-1354847544);
		@Pc(21) Class32_Sub14 local21 = client.aClass532_1.method30496(1212369496);
		@Pc(23) int local23 = arg0;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(39) int local39 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class690.aBooleanArrayArray15.length && local39 >= 0 && local39 < Class690.aBooleanArrayArray15[local32].length && Class690.aBooleanArrayArray15[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method30335(arg0, local73, local63, local68, (byte) -49)) && !Class393.method28314((Interface61) local17.method31556(local73, local63, local68, -968156135), local21, local63, local68, -2099082458) && !Class393.method28314((Interface61) local17.method31551(local73, local63, local68, client.anInterface62_1, (byte) 3), local21, local63, local68, -1591773937) && !Class393.method28314((Interface61) local17.method31534(local73, local63, local68, -1309876799), local21, local63, local68, -1936973646) && Class393.method28314((Interface61) local17.method31544(local73, local63, local68, -2111213557), local21, local63, local68, -1524361055)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "am", descriptor = "(I)V", line = 272)
	static void method23210(@OriginalArg(0) int arg0) {
		anInt3176 = 0;
		@Pc(5) int local5 = client.aClass532_1.method30459(-658131670);
		@Pc(9) int local9 = client.aClass532_1.method30466((short) 128);
		@Pc(13) Class520 local13 = client.aClass532_1.method30487(693089109);
		@Pc(17) Class585 local17 = client.aClass532_1.method30481(-1109830111);
		@Pc(21) Class32_Sub14 local21 = client.aClass532_1.method30496(1628915043);
		@Pc(23) int local23 = arg0;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(39) int local39 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class690.aBooleanArrayArray15.length && local39 >= 0 && local39 < Class690.aBooleanArrayArray15[local32].length && Class690.aBooleanArrayArray15[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method30335(arg0, local73, local63, local68, (byte) -30)) && !Class393.method28314((Interface61) local17.method31556(local73, local63, local68, -968156135), local21, local63, local68, -1925150756) && !Class393.method28314((Interface61) local17.method31551(local73, local63, local68, client.anInterface62_1, (byte) 3), local21, local63, local68, -1534581982) && !Class393.method28314((Interface61) local17.method31534(local73, local63, local68, -1309876799), local21, local63, local68, -1832131486) && Class393.method28314((Interface61) local17.method31544(local73, local63, local68, -2121085952), local21, local63, local68, -1591263685)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "au", descriptor = "(I)V", line = 272)
	static void method23211(@OriginalArg(0) int arg0) {
		anInt3176 = 0;
		@Pc(5) int local5 = client.aClass532_1.method30459(1629744988);
		@Pc(9) int local9 = client.aClass532_1.method30466((short) 128);
		@Pc(13) Class520 local13 = client.aClass532_1.method30487(2127718883);
		@Pc(17) Class585 local17 = client.aClass532_1.method30481(-1218534829);
		@Pc(21) Class32_Sub14 local21 = client.aClass532_1.method30496(692012420);
		@Pc(23) int local23 = arg0;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
			@Pc(39) int local39 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class690.aBooleanArrayArray15.length && local39 >= 0 && local39 < Class690.aBooleanArrayArray15[local32].length && Class690.aBooleanArrayArray15[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method30335(arg0, local73, local63, local68, (byte) -79)) && !Class393.method28314((Interface61) local17.method31556(local73, local63, local68, -968156135), local21, local63, local68, -2004450234) && !Class393.method28314((Interface61) local17.method31551(local73, local63, local68, client.anInterface62_1, (byte) 3), local21, local63, local68, -1549726433) && !Class393.method28314((Interface61) local17.method31534(local73, local63, local68, -1309876799), local21, local63, local68, -1981772960) && Class393.method28314((Interface61) local17.method31544(local73, local63, local68, -2107304279), local21, local63, local68, -1693526992)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "ap", descriptor = "(Lclient!st;Lclient!aop;II)Z", line = 303)
	static boolean method23212(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) Class32_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(11) Class610 local11 = (Class610) arg1.method18261(arg0.method13423(-1037211373), -1586353188);
		if (local11.aBoolean839 && !client.aBoolean620) {
			return false;
		}
		@Pc(23) int local23 = local11.anInt5600 * 400633667;
		if (local11.anIntArray492 != null) {
			for (@Pc(29) int local29 = 0; local29 < local11.anIntArray492.length; local29++) {
				if (local11.anIntArray492[local29] != -1) {
					@Pc(49) Class610 local49 = (Class610) arg1.method18261(local11.anIntArray492[local29], 483687806);
					if (local49.anInt5600 * 400633667 >= 0) {
						local23 = local49.anInt5600 * 400633667;
					}
				}
			}
		}
		if (local23 < 0) {
			return false;
		}
		anIntArray271[anInt3176 * 906807861] = local11.anInt5587 * 365009633;
		anIntArray270[anInt3176 * 906807861] = arg2;
		anIntArray272[anInt3176 * 906807861] = arg3;
		anInt3176 += 1631303709;
		return true;
	}

	@OriginalMember(owner = "client!at", name = "ar", descriptor = "(Lclient!st;Lclient!aop;II)Z", line = 303)
	static boolean method23213(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) Class32_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(11) Class610 local11 = (Class610) arg1.method18261(arg0.method13423(-1037211373), 706572602);
		if (local11.aBoolean839 && !client.aBoolean620) {
			return false;
		}
		@Pc(23) int local23 = local11.anInt5600 * 400633667;
		if (local11.anIntArray492 != null) {
			for (@Pc(29) int local29 = 0; local29 < local11.anIntArray492.length; local29++) {
				if (local11.anIntArray492[local29] != -1) {
					@Pc(49) Class610 local49 = (Class610) arg1.method18261(local11.anIntArray492[local29], 1005334229);
					if (local49.anInt5600 * 400633667 >= 0) {
						local23 = local49.anInt5600 * 400633667;
					}
				}
			}
		}
		if (local23 < 0) {
			return false;
		}
		anIntArray271[anInt3176 * 906807861] = local11.anInt5587 * 365009633;
		anIntArray270[anInt3176 * 906807861] = arg2;
		anIntArray272[anInt3176 * 906807861] = arg3;
		anInt3176 += 1631303709;
		return true;
	}

	@OriginalMember(owner = "client!at", name = "ax", descriptor = "(III)Z", line = 326)
	static boolean method23214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1925487290);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31534(arg0, arg1, arg2, -1309876799);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 8301);
		}
		local13 = (Interface61) local3.method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 1671);
		}
		local13 = (Interface61) local3.method31556(arg0, arg1, arg2, -968156135);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 1037);
		}
		return local5;
	}

	@OriginalMember(owner = "client!at", name = "ao", descriptor = "(III)Z", line = 326)
	static boolean method23215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1436159590);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31534(arg0, arg1, arg2, -1309876799);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 24687);
		}
		local13 = (Interface61) local3.method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 4283);
		}
		local13 = (Interface61) local3.method31556(arg0, arg1, arg2, -968156135);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) -488);
		}
		return local5;
	}

	@OriginalMember(owner = "client!at", name = "av", descriptor = "(III)Z", line = 326)
	static boolean method23216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-911921878);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31534(arg0, arg1, arg2, -1309876799);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 2542);
		}
		local13 = (Interface61) local3.method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) -7810);
		}
		local13 = (Interface61) local3.method31556(arg0, arg1, arg2, -968156135);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) -12725);
		}
		return local5;
	}

	@OriginalMember(owner = "client!at", name = "aq", descriptor = "(III)Z", line = 326)
	static boolean method23217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1511156275);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31534(arg0, arg1, arg2, -1309876799);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 2430);
		}
		local13 = (Interface61) local3.method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) 18816);
		}
		local13 = (Interface61) local3.method31556(arg0, arg1, arg2, -968156135);
		if (local13 != null) {
			local5 &= Class149_Sub1.method11777(local13, (short) -3214);
		}
		return local5;
	}

	@OriginalMember(owner = "client!at", name = "ay", descriptor = "(Lclient!st;)Z", line = 339)
	static boolean method23218(@OriginalArg(0) Interface61 arg0) {
		@Pc(9) Class610 local9 = (Class610) client.aClass532_1.method30496(1917128381).method18261(arg0.method13423(-1037211373), -2030277895);
		if (local9.anInt5601 * -303013723 == -1) {
			return true;
		} else {
			@Pc(26) Class65 local26 = (Class65) Class466.aClass32_Sub20_3.method18261(local9.anInt5601 * -303013723, -212561041);
			return local26.anInt232 * -1612489907 == -1 ? true : local26.method1185(241943251);
		}
	}

	@OriginalMember(owner = "client!at", name = "aj", descriptor = "(Lclient!st;)Z", line = 339)
	static boolean method23219(@OriginalArg(0) Interface61 arg0) {
		@Pc(9) Class610 local9 = (Class610) client.aClass532_1.method30496(1587233802).method18261(arg0.method13423(-1037211373), 1816031302);
		if (local9.anInt5601 * -303013723 == -1) {
			return true;
		} else {
			@Pc(26) Class65 local26 = (Class65) Class466.aClass32_Sub20_3.method18261(local9.anInt5601 * -303013723, 1506250371);
			return local26.anInt232 * -1612489907 == -1 ? true : local26.method1185(-66981410);
		}
	}

	@OriginalMember(owner = "client!at", name = "ab", descriptor = "(Lclient!st;)Z", line = 339)
	static boolean method23220(@OriginalArg(0) Interface61 arg0) {
		@Pc(9) Class610 local9 = (Class610) client.aClass532_1.method30496(1937107970).method18261(arg0.method13423(-1037211373), -1224947764);
		if (local9.anInt5601 * -303013723 == -1) {
			return true;
		} else {
			@Pc(26) Class65 local26 = (Class65) Class466.aClass32_Sub20_3.method18261(local9.anInt5601 * -303013723, 6189898);
			return local26.anInt232 * -1612489907 == -1 ? true : local26.method1185(-2072796569);
		}
	}

	@OriginalMember(owner = "client!at", name = "az", descriptor = "(Lclient!st;)Z", line = 339)
	static boolean method23221(@OriginalArg(0) Interface61 arg0) {
		@Pc(9) Class610 local9 = (Class610) client.aClass532_1.method30496(1885841495).method18261(arg0.method13423(-1037211373), -212029826);
		if (local9.anInt5601 * -303013723 == -1) {
			return true;
		} else {
			@Pc(26) Class65 local26 = (Class65) Class466.aClass32_Sub20_3.method18261(local9.anInt5601 * -303013723, 1289617840);
			return local26.anInt232 * -1612489907 == -1 ? true : local26.method1185(-273656685);
		}
	}

	@OriginalMember(owner = "client!at", name = "af", descriptor = "(Lclient!dh;IIIIIII)V", line = 347)
	static void method23222(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1224851711);
		@Pc(11) Interface61 local11 = (Interface61) local3.method31534(arg1, arg2, arg3, -1309876799);
		@Pc(24) Class610 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(906676537).method18261(local11.method13423(-1037211373), -293463874);
			local30 = local11.method13404(1595722757) & 0x3;
			local34 = local11.method13420(1648481638);
			if (local24.anInt5601 * -303013723 == -1) {
				local50 = arg6;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = arg7;
				}
				if (local34 == Class615.aClass615_13.anInt5628 * 948246811 || local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20476(arg4, arg5, 4, local50, 1726401865);
					} else if (local30 == 1) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) -5);
					} else if (local30 == 2) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1531717371);
					} else if (local30 == 3) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) -51);
					}
				}
				if (Class615.aClass615_5.anInt5628 * 948246811 == local34) {
					if (local30 == 0) {
						arg0.method20469(arg4, arg5, 1, 1, local50, (byte) 31);
					} else if (local30 == 1) {
						arg0.method20469(arg4 + 3, arg5, 1, 1, local50, (byte) 61);
					} else if (local30 == 2) {
						arg0.method20469(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 38);
					} else if (local30 == 3) {
						arg0.method20469(arg4, arg5 + 3, 1, 1, local50, (byte) 38);
					}
				}
				if (local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) -30);
					} else if (local30 == 1) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1952643325);
					} else if (local30 == 2) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) 50);
					} else if (local30 == 3) {
						arg0.method20476(arg4, arg5, 4, local50, 2022907375);
					}
				}
			} else {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 1482826335);
			}
		}
		local11 = (Interface61) local3.method31551(arg1, arg2, arg3, client.anInterface62_1, (byte) 3);
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(1143146835).method18261(local11.method13423(-1037211373), 2109071827);
			local30 = local11.method13404(1865424374) & 0x3;
			local34 = local11.method13420(2012606420);
			if (-303013723 * local24.anInt5601 != -1) {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 711140571);
			} else if (Class615.aClass615_6.anInt5628 * 948246811 == local34) {
				local50 = -1118482;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20479(arg4, arg5 + 3, arg4 + 3, arg5, local50, -517087181);
				} else {
					arg0.method20479(arg4, arg5, arg4 + 3, arg5 + 3, local50, -1112747066);
				}
			}
		}
		local11 = (Interface61) local3.method31556(arg1, arg2, arg3, -968156135);
		if (local11 == null) {
			return;
		}
		local24 = (Class610) client.aClass532_1.method30496(2067232348).method18261(local11.method13423(-1037211373), -1434811135);
		local30 = local11.method13404(1595198997) & 0x3;
		if (-303013723 * local24.anInt5601 != -1) {
			Class107.method18119(arg0, local24, local30, arg4, arg5, 1435372555);
		}
	}

	@OriginalMember(owner = "client!at", name = "ak", descriptor = "(Lclient!dh;IIIIIII)V", line = 347)
	static void method23223(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1168089736);
		@Pc(11) Interface61 local11 = (Interface61) local3.method31534(arg1, arg2, arg3, -1309876799);
		@Pc(24) Class610 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(2085745898).method18261(local11.method13423(-1037211373), -778638480);
			local30 = local11.method13404(1663211611) & 0x3;
			local34 = local11.method13420(1492473137);
			if (local24.anInt5601 * -303013723 == -1) {
				local50 = arg6;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = arg7;
				}
				if (local34 == Class615.aClass615_13.anInt5628 * 948246811 || local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20476(arg4, arg5, 4, local50, 1935121830);
					} else if (local30 == 1) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) 10);
					} else if (local30 == 2) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 2117370114);
					} else if (local30 == 3) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) 16);
					}
				}
				if (Class615.aClass615_5.anInt5628 * 948246811 == local34) {
					if (local30 == 0) {
						arg0.method20469(arg4, arg5, 1, 1, local50, (byte) 13);
					} else if (local30 == 1) {
						arg0.method20469(arg4 + 3, arg5, 1, 1, local50, (byte) 22);
					} else if (local30 == 2) {
						arg0.method20469(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 21);
					} else if (local30 == 3) {
						arg0.method20469(arg4, arg5 + 3, 1, 1, local50, (byte) 16);
					}
				}
				if (local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) 44);
					} else if (local30 == 1) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1742424239);
					} else if (local30 == 2) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) 20);
					} else if (local30 == 3) {
						arg0.method20476(arg4, arg5, 4, local50, 2073266055);
					}
				}
			} else {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 1139605407);
			}
		}
		local11 = (Interface61) local3.method31551(arg1, arg2, arg3, client.anInterface62_1, (byte) 3);
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(949792279).method18261(local11.method13423(-1037211373), -168293339);
			local30 = local11.method13404(1572151848) & 0x3;
			local34 = local11.method13420(2013010806);
			if (-303013723 * local24.anInt5601 != -1) {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 1059798826);
			} else if (Class615.aClass615_6.anInt5628 * 948246811 == local34) {
				local50 = -1118482;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20479(arg4, arg5 + 3, arg4 + 3, arg5, local50, 895113453);
				} else {
					arg0.method20479(arg4, arg5, arg4 + 3, arg5 + 3, local50, 1351986020);
				}
			}
		}
		local11 = (Interface61) local3.method31556(arg1, arg2, arg3, -968156135);
		if (local11 == null) {
			return;
		}
		local24 = (Class610) client.aClass532_1.method30496(1354293082).method18261(local11.method13423(-1037211373), -1435032057);
		local30 = local11.method13404(2133102316) & 0x3;
		if (-303013723 * local24.anInt5601 != -1) {
			Class107.method18119(arg0, local24, local30, arg4, arg5, 1859243770);
		}
	}

	@OriginalMember(owner = "client!at", name = "aa", descriptor = "(Lclient!dh;IIIIIII)V", line = 347)
	static void method23224(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-1627879233);
		@Pc(11) Interface61 local11 = (Interface61) local3.method31534(arg1, arg2, arg3, -1309876799);
		@Pc(24) Class610 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(934316578).method18261(local11.method13423(-1037211373), -19597238);
			local30 = local11.method13404(1549429894) & 0x3;
			local34 = local11.method13420(1642387875);
			if (local24.anInt5601 * -303013723 == -1) {
				local50 = arg6;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = arg7;
				}
				if (local34 == Class615.aClass615_13.anInt5628 * 948246811 || local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20476(arg4, arg5, 4, local50, 2048237465);
					} else if (local30 == 1) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) 64);
					} else if (local30 == 2) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1904022960);
					} else if (local30 == 3) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) 14);
					}
				}
				if (Class615.aClass615_5.anInt5628 * 948246811 == local34) {
					if (local30 == 0) {
						arg0.method20469(arg4, arg5, 1, 1, local50, (byte) 34);
					} else if (local30 == 1) {
						arg0.method20469(arg4 + 3, arg5, 1, 1, local50, (byte) 104);
					} else if (local30 == 2) {
						arg0.method20469(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 73);
					} else if (local30 == 3) {
						arg0.method20469(arg4, arg5 + 3, 1, 1, local50, (byte) 119);
					}
				}
				if (local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) 8);
					} else if (local30 == 1) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1726828071);
					} else if (local30 == 2) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) -50);
					} else if (local30 == 3) {
						arg0.method20476(arg4, arg5, 4, local50, 1657331782);
					}
				}
			} else {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 2021110737);
			}
		}
		local11 = (Interface61) local3.method31551(arg1, arg2, arg3, client.anInterface62_1, (byte) 3);
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(1252816223).method18261(local11.method13423(-1037211373), -571042083);
			local30 = local11.method13404(1934247891) & 0x3;
			local34 = local11.method13420(1536090006);
			if (-303013723 * local24.anInt5601 != -1) {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 573259516);
			} else if (Class615.aClass615_6.anInt5628 * 948246811 == local34) {
				local50 = -1118482;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20479(arg4, arg5 + 3, arg4 + 3, arg5, local50, -1579865102);
				} else {
					arg0.method20479(arg4, arg5, arg4 + 3, arg5 + 3, local50, 115333235);
				}
			}
		}
		local11 = (Interface61) local3.method31556(arg1, arg2, arg3, -968156135);
		if (local11 == null) {
			return;
		}
		local24 = (Class610) client.aClass532_1.method30496(1330464987).method18261(local11.method13423(-1037211373), -1474482574);
		local30 = local11.method13404(1756624599) & 0x3;
		if (-303013723 * local24.anInt5601 != -1) {
			Class107.method18119(arg0, local24, local30, arg4, arg5, 581829707);
		}
	}

	@OriginalMember(owner = "client!at", name = "an", descriptor = "(Lclient!dh;Lclient!hf;II)V", line = 426)
	static void method23225(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20489();
		@Pc(6) Class327 local6 = null;
		@Pc(8) Class96 local8 = null;
		if (arg1.anInt3971 * -158526639 == 5) {
			local6 = arg1.method26904(arg0, (byte) 24);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass96_1;
			if (local6.anInt4140 * -814657375 != arg1.anInt3981 * 1215292027 || local6.anInt4141 * -764381181 != arg1.anInt3982 * -1490598249) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20569(arg2, arg3, arg1.anInt3981 * 1215292027 + arg2, arg1.anInt3982 * -1490598249 + arg3);
		if (anInt3177 * 910154737 == 2 || anInt3177 * 910154737 == 5 || aClass100_40 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20592(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20694(anIntArray269);
		arg0.method20637();
		@Pc(86) Class611 local86 = client.aClass532_1.method30455(1903301973);
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class429.anInt4781 * -1453926679 == 4) {
			local95 = client.anInt3481 * -1195894597;
			local99 = client.anInt3482 * 1196621895;
			local105 = (int) -client.aFloat253 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class472 local112 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
			local95 = (int) local112.aFloat317;
			local99 = (int) local112.aFloat319;
			if (Class429.anInt4781 * -1453926679 == 3) {
				local105 = (int) -((double) Class65.aClass123_Sub1_2.method9042((byte) -58) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3478 * 2027131152;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass532_1.method30466((short) 128) * 4 + 48 - local99 / 128;
		if (local8 == null) {
			aClass100_40.method18175((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) (arg1.anInt3982 * -1490598249) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			aClass100_40.method18181((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) arg3 + (float) (arg1.anInt3982 * -1490598249) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local8, arg2, arg3);
		}
		@Pc(249) Class584 local249 = client.aClass532_1.method30467(-1670125336);
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(254) Class93_Sub14 local254 = (Class93_Sub14) aClass22_43.method428((byte) 99); local254 != null; local254 = (Class93_Sub14) aClass22_43.method442(1318470215)) {
			local261 = local254.anInt1526 * 1279598251;
			local275 = (local249.anIntArray473[local261] >> 14 & 0x3FFF) - local86.anInt5623 * 270611681;
			local287 = (local249.anIntArray473[local261] & 0x3FFF) - local86.anInt5624 * -1994307635;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local297, local307, local249.anIntArray472[local261], (byte) -103);
		}
		for (local261 = 0; local261 < anInt3176 * 906807861; local261++) {
			local275 = anIntArray270[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray272[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class610 local367 = (Class610) client.aClass532_1.method30496(1049801077).method18261(anIntArray271[local261], 115068298);
			if (local367.anIntArray492 != null) {
				local367 = local367.method31991(Class624.aClass120_1, Class624.aClass120_1, 2102448605);
				if (local367 == null || local367.anInt5600 * 400633667 == -1) {
					continue;
				}
			}
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local275, local287, local367.anInt5600 * 400633667, (byte) -103);
		}
		for (@Pc(406) Class93_Sub5 local406 = (Class93_Sub5) client.aClass16_20.method227((byte) 28); local406 != null; local406 = (Class93_Sub5) client.aClass16_20.method229(2139168939)) {
			local275 = (int) (local406.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			if (local275 == anInt3175 * 405524325) {
				local287 = (int) (local406.aLong232 * -3750704643647536275L & 0x3FFFL) - local86.anInt5623 * 270611681;
				local297 = (int) (local406.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL) - local86.anInt5624 * -1994307635;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(472) int local472 = local297 * 4 + 2 - local99 / 128;
				Class151.method13981(arg1, local8, arg2, arg3, local307, local472, Class393.aClass100Array6[0], -50621787);
			}
		}
		Class123.method9081(arg0, local95, local99, arg1, local8, arg2, arg3, (byte) 82);
		Class108_Sub1.method5225(local95, local99, arg1, local8, arg2, arg3, -450783530);
		Class331.method27385(local95, local99, arg1, local6, arg2, arg3, (short) 2698);
		if (Class429.anInt4781 * -1453926679 != 4) {
			if (anInt3179 * -820036969 != -1) {
				local261 = anInt3179 * 1014819420 + 2 - local95 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-54682723) - 1) * 2;
				local275 = anInt3174 * -879462196 + 2 - local99 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-1181359496) - 1) * 2;
				Class323.method27276(arg1, local8, arg2 - Class32_Sub7.anInt2393 * -1219483541, arg3 - Class106_Sub2.anInt749 * -2031220771, local261, local275, Class60.aClass100Array1[aBoolean521 ? 1 : 0], 100.0D, Class319.aClass319_3, Class328.aClass328_4, 1844962789);
			}
			if (!Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass659_1.method32801(-125905710)) {
				arg0.method20469(arg1.anInt3981 * 1215292027 / 2 + arg2 - 1, arg1.anInt3982 * -1490598249 / 2 + arg3 - 1, 3, 3, -1, (byte) 70);
			}
		}
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
	}

	@OriginalMember(owner = "client!at", name = "bl", descriptor = "(Lclient!dh;Lclient!hf;II)V", line = 426)
	static void method23226(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20489();
		@Pc(6) Class327 local6 = null;
		@Pc(8) Class96 local8 = null;
		if (arg1.anInt3971 * -158526639 == 5) {
			local6 = arg1.method26904(arg0, (byte) 24);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass96_1;
			if (local6.anInt4140 * -814657375 != arg1.anInt3981 * 1215292027 || local6.anInt4141 * -764381181 != arg1.anInt3982 * -1490598249) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20569(arg2, arg3, arg1.anInt3981 * 1215292027 + arg2, arg1.anInt3982 * -1490598249 + arg3);
		if (anInt3177 * 910154737 == 2 || anInt3177 * 910154737 == 5 || aClass100_40 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20592(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20694(anIntArray269);
		arg0.method20637();
		@Pc(86) Class611 local86 = client.aClass532_1.method30455(1792062030);
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class429.anInt4781 * -1453926679 == 4) {
			local95 = client.anInt3481 * -1195894597;
			local99 = client.anInt3482 * 1196621895;
			local105 = (int) -client.aFloat253 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class472 local112 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
			local95 = (int) local112.aFloat317;
			local99 = (int) local112.aFloat319;
			if (Class429.anInt4781 * -1453926679 == 3) {
				local105 = (int) -((double) Class65.aClass123_Sub1_2.method9042((byte) -8) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3478 * 2027131152;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass532_1.method30466((short) 128) * 4 + 48 - local99 / 128;
		if (local8 == null) {
			aClass100_40.method18175((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) (arg1.anInt3982 * -1490598249) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			aClass100_40.method18181((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) arg3 + (float) (arg1.anInt3982 * -1490598249) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local8, arg2, arg3);
		}
		@Pc(249) Class584 local249 = client.aClass532_1.method30467(754683174);
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(254) Class93_Sub14 local254 = (Class93_Sub14) aClass22_43.method428((byte) 14); local254 != null; local254 = (Class93_Sub14) aClass22_43.method442(1626935380)) {
			local261 = local254.anInt1526 * 1279598251;
			local275 = (local249.anIntArray473[local261] >> 14 & 0x3FFF) - local86.anInt5623 * 270611681;
			local287 = (local249.anIntArray473[local261] & 0x3FFF) - local86.anInt5624 * -1994307635;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local297, local307, local249.anIntArray472[local261], (byte) -20);
		}
		for (local261 = 0; local261 < anInt3176 * 906807861; local261++) {
			local275 = anIntArray270[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray272[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class610 local367 = (Class610) client.aClass532_1.method30496(777989356).method18261(anIntArray271[local261], -1213184895);
			if (local367.anIntArray492 != null) {
				local367 = local367.method31991(Class624.aClass120_1, Class624.aClass120_1, -142894712);
				if (local367 == null || local367.anInt5600 * 400633667 == -1) {
					continue;
				}
			}
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local275, local287, local367.anInt5600 * 400633667, (byte) -30);
		}
		for (@Pc(406) Class93_Sub5 local406 = (Class93_Sub5) client.aClass16_20.method227((byte) -3); local406 != null; local406 = (Class93_Sub5) client.aClass16_20.method229(1624582019)) {
			local275 = (int) (local406.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			if (local275 == anInt3175 * 405524325) {
				local287 = (int) (local406.aLong232 * -3750704643647536275L & 0x3FFFL) - local86.anInt5623 * 270611681;
				local297 = (int) (local406.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL) - local86.anInt5624 * -1994307635;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(472) int local472 = local297 * 4 + 2 - local99 / 128;
				Class151.method13981(arg1, local8, arg2, arg3, local307, local472, Class393.aClass100Array6[0], 300035075);
			}
		}
		Class123.method9081(arg0, local95, local99, arg1, local8, arg2, arg3, (byte) -52);
		Class108_Sub1.method5225(local95, local99, arg1, local8, arg2, arg3, -1821862658);
		Class331.method27385(local95, local99, arg1, local6, arg2, arg3, (short) 10341);
		if (Class429.anInt4781 * -1453926679 != 4) {
			if (anInt3179 * -820036969 != -1) {
				local261 = anInt3179 * 1014819420 + 2 - local95 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(1415867428) - 1) * 2;
				local275 = anInt3174 * -879462196 + 2 - local99 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-1440346632) - 1) * 2;
				Class323.method27276(arg1, local8, arg2 - Class32_Sub7.anInt2393 * -1219483541, arg3 - Class106_Sub2.anInt749 * -2031220771, local261, local275, Class60.aClass100Array1[aBoolean521 ? 1 : 0], 100.0D, Class319.aClass319_3, Class328.aClass328_4, -1100322942);
			}
			if (!Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass659_1.method32801(-125905710)) {
				arg0.method20469(arg1.anInt3981 * 1215292027 / 2 + arg2 - 1, arg1.anInt3982 * -1490598249 / 2 + arg3 - 1, 3, 3, -1, (byte) 78);
			}
		}
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
	}

	@OriginalMember(owner = "client!at", name = "bf", descriptor = "(Lclient!dh;Lclient!hf;II)V", line = 426)
	static void method23227(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20489();
		@Pc(6) Class327 local6 = null;
		@Pc(8) Class96 local8 = null;
		if (arg1.anInt3971 * -158526639 == 5) {
			local6 = arg1.method26904(arg0, (byte) 24);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass96_1;
			if (local6.anInt4140 * -814657375 != arg1.anInt3981 * 1215292027 || local6.anInt4141 * -764381181 != arg1.anInt3982 * -1490598249) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20569(arg2, arg3, arg1.anInt3981 * 1215292027 + arg2, arg1.anInt3982 * -1490598249 + arg3);
		if (anInt3177 * 910154737 == 2 || anInt3177 * 910154737 == 5 || aClass100_40 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20592(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20694(anIntArray269);
		arg0.method20637();
		@Pc(86) Class611 local86 = client.aClass532_1.method30455(1997142228);
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class429.anInt4781 * -1453926679 == 4) {
			local95 = client.anInt3481 * -1195894597;
			local99 = client.anInt3482 * 1196621895;
			local105 = (int) -client.aFloat253 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class472 local112 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
			local95 = (int) local112.aFloat317;
			local99 = (int) local112.aFloat319;
			if (Class429.anInt4781 * -1453926679 == 3) {
				local105 = (int) -((double) Class65.aClass123_Sub1_2.method9042((byte) -87) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3478 * 2027131152;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass532_1.method30466((short) 128) * 4 + 48 - local99 / 128;
		if (local8 == null) {
			aClass100_40.method18175((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) (arg1.anInt3982 * -1490598249) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			aClass100_40.method18181((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) arg3 + (float) (arg1.anInt3982 * -1490598249) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local8, arg2, arg3);
		}
		@Pc(249) Class584 local249 = client.aClass532_1.method30467(-1085686484);
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(254) Class93_Sub14 local254 = (Class93_Sub14) aClass22_43.method428((byte) 62); local254 != null; local254 = (Class93_Sub14) aClass22_43.method442(11556421)) {
			local261 = local254.anInt1526 * 1279598251;
			local275 = (local249.anIntArray473[local261] >> 14 & 0x3FFF) - local86.anInt5623 * 270611681;
			local287 = (local249.anIntArray473[local261] & 0x3FFF) - local86.anInt5624 * -1994307635;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local297, local307, local249.anIntArray472[local261], (byte) -60);
		}
		for (local261 = 0; local261 < anInt3176 * 906807861; local261++) {
			local275 = anIntArray270[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray272[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class610 local367 = (Class610) client.aClass532_1.method30496(726221252).method18261(anIntArray271[local261], 1009528990);
			if (local367.anIntArray492 != null) {
				local367 = local367.method31991(Class624.aClass120_1, Class624.aClass120_1, -145464110);
				if (local367 == null || local367.anInt5600 * 400633667 == -1) {
					continue;
				}
			}
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local275, local287, local367.anInt5600 * 400633667, (byte) -94);
		}
		for (@Pc(406) Class93_Sub5 local406 = (Class93_Sub5) client.aClass16_20.method227((byte) -41); local406 != null; local406 = (Class93_Sub5) client.aClass16_20.method229(1664888208)) {
			local275 = (int) (local406.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			if (local275 == anInt3175 * 405524325) {
				local287 = (int) (local406.aLong232 * -3750704643647536275L & 0x3FFFL) - local86.anInt5623 * 270611681;
				local297 = (int) (local406.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL) - local86.anInt5624 * -1994307635;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(472) int local472 = local297 * 4 + 2 - local99 / 128;
				Class151.method13981(arg1, local8, arg2, arg3, local307, local472, Class393.aClass100Array6[0], 1359363949);
			}
		}
		Class123.method9081(arg0, local95, local99, arg1, local8, arg2, arg3, (byte) 22);
		Class108_Sub1.method5225(local95, local99, arg1, local8, arg2, arg3, -6441566);
		Class331.method27385(local95, local99, arg1, local6, arg2, arg3, (short) 9476);
		if (Class429.anInt4781 * -1453926679 != 4) {
			if (anInt3179 * -820036969 != -1) {
				local261 = anInt3179 * 1014819420 + 2 - local95 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(345848316) - 1) * 2;
				local275 = anInt3174 * -879462196 + 2 - local99 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-1036358637) - 1) * 2;
				Class323.method27276(arg1, local8, arg2 - Class32_Sub7.anInt2393 * -1219483541, arg3 - Class106_Sub2.anInt749 * -2031220771, local261, local275, Class60.aClass100Array1[aBoolean521 ? 1 : 0], 100.0D, Class319.aClass319_3, Class328.aClass328_4, -904538221);
			}
			if (!Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass659_1.method32801(-125905710)) {
				arg0.method20469(arg1.anInt3981 * 1215292027 / 2 + arg2 - 1, arg1.anInt3982 * -1490598249 / 2 + arg3 - 1, 3, 3, -1, (byte) 39);
			}
		}
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
	}

	@OriginalMember(owner = "client!at", name = "bk", descriptor = "(Lclient!dh;Lclient!hf;II)V", line = 426)
	static void method23228(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20489();
		@Pc(6) Class327 local6 = null;
		@Pc(8) Class96 local8 = null;
		if (arg1.anInt3971 * -158526639 == 5) {
			local6 = arg1.method26904(arg0, (byte) 24);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass96_1;
			if (local6.anInt4140 * -814657375 != arg1.anInt3981 * 1215292027 || local6.anInt4141 * -764381181 != arg1.anInt3982 * -1490598249) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20569(arg2, arg3, arg1.anInt3981 * 1215292027 + arg2, arg1.anInt3982 * -1490598249 + arg3);
		if (anInt3177 * 910154737 == 2 || anInt3177 * 910154737 == 5 || aClass100_40 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20592(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20694(anIntArray269);
		arg0.method20637();
		@Pc(86) Class611 local86 = client.aClass532_1.method30455(2026487426);
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class429.anInt4781 * -1453926679 == 4) {
			local95 = client.anInt3481 * -1195894597;
			local99 = client.anInt3482 * 1196621895;
			local105 = (int) -client.aFloat253 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class472 local112 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
			local95 = (int) local112.aFloat317;
			local99 = (int) local112.aFloat319;
			if (Class429.anInt4781 * -1453926679 == 3) {
				local105 = (int) -((double) Class65.aClass123_Sub1_2.method9042((byte) -72) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3478 * 2027131152;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass532_1.method30466((short) 128) * 4 + 48 - local99 / 128;
		if (local8 == null) {
			aClass100_40.method18175((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) (arg1.anInt3982 * -1490598249) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			aClass100_40.method18181((float) arg2 + (float) (arg1.anInt3981 * 1215292027) / 2.0F, (float) arg3 + (float) (arg1.anInt3982 * -1490598249) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local8, arg2, arg3);
		}
		@Pc(249) Class584 local249 = client.aClass532_1.method30467(-763156281);
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(254) Class93_Sub14 local254 = (Class93_Sub14) aClass22_43.method428((byte) 5); local254 != null; local254 = (Class93_Sub14) aClass22_43.method442(1242450938)) {
			local261 = local254.anInt1526 * 1279598251;
			local275 = (local249.anIntArray473[local261] >> 14 & 0x3FFF) - local86.anInt5623 * 270611681;
			local287 = (local249.anIntArray473[local261] & 0x3FFF) - local86.anInt5624 * -1994307635;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local297, local307, local249.anIntArray472[local261], (byte) -50);
		}
		for (local261 = 0; local261 < anInt3176 * 906807861; local261++) {
			local275 = anIntArray270[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray272[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class610 local367 = (Class610) client.aClass532_1.method30496(1943253367).method18261(anIntArray271[local261], -805713387);
			if (local367.anIntArray492 != null) {
				local367 = local367.method31991(Class624.aClass120_1, Class624.aClass120_1, 1966160268);
				if (local367 == null || local367.anInt5600 * 400633667 == -1) {
					continue;
				}
			}
			Class56.method18035(arg0, local8, arg1, arg2, arg3, local275, local287, local367.anInt5600 * 400633667, (byte) 2);
		}
		for (@Pc(406) Class93_Sub5 local406 = (Class93_Sub5) client.aClass16_20.method227((byte) -56); local406 != null; local406 = (Class93_Sub5) client.aClass16_20.method229(1799697067)) {
			local275 = (int) (local406.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			if (local275 == anInt3175 * 405524325) {
				local287 = (int) (local406.aLong232 * -3750704643647536275L & 0x3FFFL) - local86.anInt5623 * 270611681;
				local297 = (int) (local406.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL) - local86.anInt5624 * -1994307635;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(472) int local472 = local297 * 4 + 2 - local99 / 128;
				Class151.method13981(arg1, local8, arg2, arg3, local307, local472, Class393.aClass100Array6[0], -1511376364);
			}
		}
		Class123.method9081(arg0, local95, local99, arg1, local8, arg2, arg3, (byte) -10);
		Class108_Sub1.method5225(local95, local99, arg1, local8, arg2, arg3, -1306505047);
		Class331.method27385(local95, local99, arg1, local6, arg2, arg3, (short) 6068);
		if (Class429.anInt4781 * -1453926679 != 4) {
			if (anInt3179 * -820036969 != -1) {
				local261 = anInt3179 * 1014819420 + 2 - local95 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(1757135917) - 1) * 2;
				local275 = anInt3174 * -879462196 + 2 - local99 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-1432398369) - 1) * 2;
				Class323.method27276(arg1, local8, arg2 - Class32_Sub7.anInt2393 * -1219483541, arg3 - Class106_Sub2.anInt749 * -2031220771, local261, local275, Class60.aClass100Array1[aBoolean521 ? 1 : 0], 100.0D, Class319.aClass319_3, Class328.aClass328_4, 711232241);
			}
			if (!Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass659_1.method32801(-125905710)) {
				arg0.method20469(arg1.anInt3981 * 1215292027 / 2 + arg2 - 1, arg1.anInt3982 * -1490598249 / 2 + arg3 - 1, 3, 3, -1, (byte) 76);
			}
		}
		arg0.method20566(anIntArray269[0], anIntArray269[1], anIntArray269[2], anIntArray269[3]);
	}

	@OriginalMember(owner = "client!at", name = "bx", descriptor = "(Lclient!dh;IILclient!hf;Lclient!ch;II)V", line = 519)
	static void method23229(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3540 * 568731113; local1++) {
			@Pc(14) Class93_Sub15 local14 = (Class93_Sub15) client.aClass16_18.method214((long) client.anIntArray323[local1]);
			if (local14 != null) {
				@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local21.method18607(33985) && local21.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(33) Class336 local33 = local21.aClass336_1;
					if (local33 != null && local33.anIntArray412 != null) {
						local33 = local33.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 28591);
					}
					if (local33 != null && local33.aBoolean715 && local33.aBoolean718) {
						@Pc(58) Class472 local58 = local21.method24220().aClass472_61;
						@Pc(68) int local68 = (int) local58.aFloat317 / 128 - arg1 / 128;
						@Pc(78) int local78 = (int) local58.aFloat319 / 128 - arg2 / 128;
						if (local33.anInt4181 * 1155077859 == -1) {
							Class151.method13981(arg3, arg4, arg5, arg6, local68, local78, Class393.aClass100Array6[1], 1717039571);
						} else {
							Class56.method18035(arg0, arg4, arg3, arg5, arg6, local68, local78, local33.anInt4181 * 1155077859, (byte) -60);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bd", descriptor = "(Lclient!dh;IILclient!hf;Lclient!ch;II)V", line = 519)
	static void method23230(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3540 * 568731113; local1++) {
			@Pc(14) Class93_Sub15 local14 = (Class93_Sub15) client.aClass16_18.method214((long) client.anIntArray323[local1]);
			if (local14 != null) {
				@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local21.method18607(33985) && local21.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(33) Class336 local33 = local21.aClass336_1;
					if (local33 != null && local33.anIntArray412 != null) {
						local33 = local33.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 1279);
					}
					if (local33 != null && local33.aBoolean715 && local33.aBoolean718) {
						@Pc(58) Class472 local58 = local21.method24220().aClass472_61;
						@Pc(68) int local68 = (int) local58.aFloat317 / 128 - arg1 / 128;
						@Pc(78) int local78 = (int) local58.aFloat319 / 128 - arg2 / 128;
						if (local33.anInt4181 * 1155077859 == -1) {
							Class151.method13981(arg3, arg4, arg5, arg6, local68, local78, Class393.aClass100Array6[1], -1888391345);
						} else {
							Class56.method18035(arg0, arg4, arg3, arg5, arg6, local68, local78, local33.anInt4181 * 1155077859, (byte) -32);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bh", descriptor = "(Lclient!dh;IILclient!hf;Lclient!ch;II)V", line = 519)
	static void method23231(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3540 * 568731113; local1++) {
			@Pc(14) Class93_Sub15 local14 = (Class93_Sub15) client.aClass16_18.method214((long) client.anIntArray323[local1]);
			if (local14 != null) {
				@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local21.method18607(33985) && local21.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(33) Class336 local33 = local21.aClass336_1;
					if (local33 != null && local33.anIntArray412 != null) {
						local33 = local33.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 1383);
					}
					if (local33 != null && local33.aBoolean715 && local33.aBoolean718) {
						@Pc(58) Class472 local58 = local21.method24220().aClass472_61;
						@Pc(68) int local68 = (int) local58.aFloat317 / 128 - arg1 / 128;
						@Pc(78) int local78 = (int) local58.aFloat319 / 128 - arg2 / 128;
						if (local33.anInt4181 * 1155077859 == -1) {
							Class151.method13981(arg3, arg4, arg5, arg6, local68, local78, Class393.aClass100Array6[1], 445472270);
						} else {
							Class56.method18035(arg0, arg4, arg3, arg5, arg6, local68, local78, local33.anInt4181 * 1155077859, (byte) -18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bc", descriptor = "(IILclient!hf;Lclient!ch;II)V", line = 539)
	static void method23232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class132_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method20084(-177381724) && !local16.aClass659_1.method32801(-125905710) && local16 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && local16.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(39) Class472 local39 = local16.method24220().aClass472_61;
				@Pc(49) int local49 = (int) local39.aFloat317 / 128 - arg0 / 128;
				@Pc(59) int local59 = (int) local39.aFloat319 / 128 - arg1 / 128;
				@Pc(61) boolean local61 = false;
				for (@Pc(63) int local63 = 0; local63 < client.anInt3444 * 862418793; local63++) {
					@Pc(72) Class281 local72 = client.aClass281Array1[local63];
					if (local16.aString82.equals(local72.aString153) && local72.anInt3894 * 1928339871 != 0) {
						local61 = true;
						break;
					}
				}
				@Pc(90) boolean local90 = false;
				for (@Pc(92) int local92 = 0; local92 < Class623.anInt5682 * 1581594575; local92++) {
					if (local16.aString82.equals(Class93_Sub1_Sub2.aClass170Array1[local92].aString91)) {
						local90 = true;
						break;
					}
				}
				@Pc(112) boolean local112 = false;
				if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709) {
					local112 = true;
				}
				if (local16.aClass658_1 != null && local16.aClass658_1.anInt5817 * 1405397749 != -1 && ((Class336) Class162.aClass32_Sub3_2.method18261(local16.aClass658_1.anInt5817 * 1405397749, 2143909468)).aBoolean713) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[1], 1466412932);
				} else if (Class286.aClass286_3 == local16.aClass286_1) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[8], 477277135);
				} else if (local16.aClass286_1 == Class286.aClass286_4) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[6], 2075854819);
				} else if (local112) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[4], 1394383914);
				} else if (local61) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[3], 977867052);
				} else if (local16.aBoolean455) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[7], -461660772);
				} else if (local90) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[5], -561094239);
				} else {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[2], -893523183);
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bi", descriptor = "(IILclient!hf;Lclient!ch;II)V", line = 539)
	static void method23233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class132_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method20084(706085715) && !local16.aClass659_1.method32801(-125905710) && local16 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && local16.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(39) Class472 local39 = local16.method24220().aClass472_61;
				@Pc(49) int local49 = (int) local39.aFloat317 / 128 - arg0 / 128;
				@Pc(59) int local59 = (int) local39.aFloat319 / 128 - arg1 / 128;
				@Pc(61) boolean local61 = false;
				for (@Pc(63) int local63 = 0; local63 < client.anInt3444 * 862418793; local63++) {
					@Pc(72) Class281 local72 = client.aClass281Array1[local63];
					if (local16.aString82.equals(local72.aString153) && local72.anInt3894 * 1928339871 != 0) {
						local61 = true;
						break;
					}
				}
				@Pc(90) boolean local90 = false;
				for (@Pc(92) int local92 = 0; local92 < Class623.anInt5682 * 1581594575; local92++) {
					if (local16.aString82.equals(Class93_Sub1_Sub2.aClass170Array1[local92].aString91)) {
						local90 = true;
						break;
					}
				}
				@Pc(112) boolean local112 = false;
				if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709) {
					local112 = true;
				}
				if (local16.aClass658_1 != null && local16.aClass658_1.anInt5817 * 1405397749 != -1 && ((Class336) Class162.aClass32_Sub3_2.method18261(local16.aClass658_1.anInt5817 * 1405397749, 1368479157)).aBoolean713) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[1], -1678481633);
				} else if (Class286.aClass286_3 == local16.aClass286_1) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[8], -838719687);
				} else if (local16.aClass286_1 == Class286.aClass286_4) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[6], 502048681);
				} else if (local112) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[4], 638220178);
				} else if (local61) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[3], 1064663804);
				} else if (local16.aBoolean455) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[7], -991149956);
				} else if (local90) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[5], 1351011617);
				} else {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[2], 1178964552);
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bn", descriptor = "(IILclient!hf;Lclient!hx;II)V", line = 578)
	static void method23234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 != 0 && client.anInt3485 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt3247 * 1661685955 == 1) {
					@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) client.aClass16_18.method214((long) (local11.anInt3246 * -1095042687));
					if (local39 != null) {
						@Pc(45) Class132_Sub1_Sub1_Sub1_Sub1 local45 = (Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class472 local49 = local45.method24220().aClass472_61;
						local59 = (int) local49.aFloat317 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local59, local69, local11.anInt3253 * -2053428357, 360000L);
					}
				}
				if (local11.anInt3247 * 1661685955 == 2) {
					@Pc(98) int local98 = local11.anInt3248 * 846615897 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt3249 * 166908561 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt3250 * -1294740227 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class66.method1197(arg2, arg3, arg4, arg5, local98, local109, local11.anInt3253 * -2053428357, local121);
				}
				if (local11.anInt3247 * 1661685955 == 10 && local11.anInt3246 * -1095042687 >= 0 && local11.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class132_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt3246 * -1095042687];
					if (local158 != null) {
						@Pc(164) Class472 local164 = local158.method24220().aClass472_61;
						@Pc(174) int local174 = (int) local164.aFloat317 / 128 - arg0 / 128;
						local59 = (int) local164.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local174, local59, local11.anInt3253 * -2053428357, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bt", descriptor = "(IILclient!hf;Lclient!hx;II)V", line = 578)
	static void method23235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 != 0 && client.anInt3485 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt3247 * 1661685955 == 1) {
					@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) client.aClass16_18.method214((long) (local11.anInt3246 * -1095042687));
					if (local39 != null) {
						@Pc(45) Class132_Sub1_Sub1_Sub1_Sub1 local45 = (Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class472 local49 = local45.method24220().aClass472_61;
						local59 = (int) local49.aFloat317 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local59, local69, local11.anInt3253 * -2053428357, 360000L);
					}
				}
				if (local11.anInt3247 * 1661685955 == 2) {
					@Pc(98) int local98 = local11.anInt3248 * 846615897 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt3249 * 166908561 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt3250 * -1294740227 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class66.method1197(arg2, arg3, arg4, arg5, local98, local109, local11.anInt3253 * -2053428357, local121);
				}
				if (local11.anInt3247 * 1661685955 == 10 && local11.anInt3246 * -1095042687 >= 0 && local11.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class132_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt3246 * -1095042687];
					if (local158 != null) {
						@Pc(164) Class472 local164 = local158.method24220().aClass472_61;
						@Pc(174) int local174 = (int) local164.aFloat317 / 128 - arg0 / 128;
						local59 = (int) local164.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local174, local59, local11.anInt3253 * -2053428357, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bq", descriptor = "(IILclient!hf;Lclient!hx;II)V", line = 578)
	static void method23236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 != 0 && client.anInt3485 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt3247 * 1661685955 == 1) {
					@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) client.aClass16_18.method214((long) (local11.anInt3246 * -1095042687));
					if (local39 != null) {
						@Pc(45) Class132_Sub1_Sub1_Sub1_Sub1 local45 = (Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class472 local49 = local45.method24220().aClass472_61;
						local59 = (int) local49.aFloat317 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local59, local69, local11.anInt3253 * -2053428357, 360000L);
					}
				}
				if (local11.anInt3247 * 1661685955 == 2) {
					@Pc(98) int local98 = local11.anInt3248 * 846615897 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt3249 * 166908561 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt3250 * -1294740227 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class66.method1197(arg2, arg3, arg4, arg5, local98, local109, local11.anInt3253 * -2053428357, local121);
				}
				if (local11.anInt3247 * 1661685955 == 10 && local11.anInt3246 * -1095042687 >= 0 && local11.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class132_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt3246 * -1095042687];
					if (local158 != null) {
						@Pc(164) Class472 local164 = local158.method24220().aClass472_61;
						@Pc(174) int local174 = (int) local164.aFloat317 / 128 - arg0 / 128;
						local59 = (int) local164.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local174, local59, local11.anInt3253 * -2053428357, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "bm", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;)V", line = 791)
	static void method23237(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6) {
		Class323.method27276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class319.aClass319_1, Class328.aClass328_3, 1526812682);
	}

	@OriginalMember(owner = "client!at", name = "bb", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;)V", line = 791)
	static void method23238(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6) {
		Class323.method27276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class319.aClass319_1, Class328.aClass328_3, 1638649755);
	}

	@OriginalMember(owner = "client!at", name = "be", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;)V", line = 791)
	static void method23239(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6) {
		Class323.method27276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class319.aClass319_1, Class328.aClass328_3, -1559520583);
	}

	@OriginalMember(owner = "client!at", name = "bw", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;DLclient!hp;Lclient!hy;)V", line = 795)
	static void method23240(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class319 arg8, @OriginalArg(9) Class328 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local22 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -87) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local22 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(67) int local67 = arg5 * arg5 + arg4 * arg4;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class464.anIntArray451[local22];
		@Pc(81) int local81 = Class464.anIntArray452[local22];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
			local81 = local81 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(116) int local116 = arg5 * local77 + arg4 * local81 >> 14;
		@Pc(126) int local126 = arg5 * local81 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4097 * -964115205) {
			case 0:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2 - (int) ((double) arg6.method18160() * local130);
				break;
			case 1:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2;
				break;
			case 2:
				arg2 = local116 + arg2 + arg0.anInt3981 * 1215292027 / 2 - (int) ((double) (arg6.method18160() / 2) * local130);
		}
		switch(arg9.anInt4144 * 781808927) {
			case 0:
				arg3 = arg0.anInt3982 * -1490598249 / 2 + arg3 - local126 - (int) ((double) arg6.method18193() * local130);
				break;
			case 1:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126;
				break;
			case 2:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126 - (int) ((double) (arg6.method18193() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18161(arg2, arg3);
			}
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18199(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		}
	}

	@OriginalMember(owner = "client!at", name = "by", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;DLclient!hp;Lclient!hy;)V", line = 795)
	static void method23241(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class319 arg8, @OriginalArg(9) Class328 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local22 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -61) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local22 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(67) int local67 = arg5 * arg5 + arg4 * arg4;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class464.anIntArray451[local22];
		@Pc(81) int local81 = Class464.anIntArray452[local22];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
			local81 = local81 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(116) int local116 = arg5 * local77 + arg4 * local81 >> 14;
		@Pc(126) int local126 = arg5 * local81 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4097 * -964115205) {
			case 0:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2 - (int) ((double) arg6.method18160() * local130);
				break;
			case 1:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2;
				break;
			case 2:
				arg2 = local116 + arg2 + arg0.anInt3981 * 1215292027 / 2 - (int) ((double) (arg6.method18160() / 2) * local130);
		}
		switch(arg9.anInt4144 * 781808927) {
			case 0:
				arg3 = arg0.anInt3982 * -1490598249 / 2 + arg3 - local126 - (int) ((double) arg6.method18193() * local130);
				break;
			case 1:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126;
				break;
			case 2:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126 - (int) ((double) (arg6.method18193() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18161(arg2, arg3);
			}
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18199(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		}
	}

	@OriginalMember(owner = "client!at", name = "bu", descriptor = "(Lclient!hf;Lclient!ch;IIIILclient!cm;DLclient!hp;Lclient!hy;)V", line = 795)
	static void method23242(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class100 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class319 arg8, @OriginalArg(9) Class328 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local22 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -59) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local22 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(67) int local67 = arg5 * arg5 + arg4 * arg4;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class464.anIntArray451[local22];
		@Pc(81) int local81 = Class464.anIntArray452[local22];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
			local81 = local81 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(116) int local116 = arg5 * local77 + arg4 * local81 >> 14;
		@Pc(126) int local126 = arg5 * local81 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4097 * -964115205) {
			case 0:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2 - (int) ((double) arg6.method18160() * local130);
				break;
			case 1:
				arg2 = local116 + arg0.anInt3981 * 1215292027 / 2 + arg2;
				break;
			case 2:
				arg2 = local116 + arg2 + arg0.anInt3981 * 1215292027 / 2 - (int) ((double) (arg6.method18160() / 2) * local130);
		}
		switch(arg9.anInt4144 * 781808927) {
			case 0:
				arg3 = arg0.anInt3982 * -1490598249 / 2 + arg3 - local126 - (int) ((double) arg6.method18193() * local130);
				break;
			case 1:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126;
				break;
			case 2:
				arg3 = arg3 + arg0.anInt3982 * -1490598249 / 2 - local126 - (int) ((double) (arg6.method18193() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18161(arg2, arg3);
			}
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18199(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18162(arg2, arg3, (int) ((double) arg6.method18160() * local130), (int) ((double) arg6.method18193() * local130));
		}
	}

	@OriginalMember(owner = "client!at", name = "bz", descriptor = "(Lclient!hf;Lclient!ch;IIIIILjava/lang/String;Lclient!eu;Lclient!aac;I)V", line = 846)
	static void method23243(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local18 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -74) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local18 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local18 = client.anInt3477 * -1357343303 + (int) client.aFloat253 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class464.anIntArray451[local18];
		@Pc(77) int local77 = Class464.anIntArray452[local18];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local73 = local73 * 256 / (client.anInt3478 * 663566609 + 256);
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(112) int local112 = arg4 * local77 + arg5 * local73 >> 14;
		@Pc(122) int local122 = arg5 * local77 - arg4 * local73 >> 14;
		@Pc(129) int local129 = arg9.method64(arg7, 100, null, -1910907678);
		@Pc(137) int local137 = arg9.method72(arg7, 100, 0, null, (byte) 0);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3981 * 1215292027) && local143 <= arg0.anInt3981 * 1215292027 && local122 >= -(arg0.anInt3982 * -1490598249) && local122 <= arg0.anInt3982 * -1490598249) {
			arg8.method7534(arg7, arg0.anInt3981 * 1215292027 / 2 + local143 + arg2, arg0.anInt3982 * -1490598249 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3, (short) 657);
		}
	}

	@OriginalMember(owner = "client!at", name = "bo", descriptor = "(Lclient!hf;Lclient!ch;IIIIILjava/lang/String;Lclient!eu;Lclient!aac;I)V", line = 846)
	static void method23244(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local18 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -76) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local18 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local18 = client.anInt3477 * -1357343303 + (int) client.aFloat253 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class464.anIntArray451[local18];
		@Pc(77) int local77 = Class464.anIntArray452[local18];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local73 = local73 * 256 / (client.anInt3478 * 663566609 + 256);
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(112) int local112 = arg4 * local77 + arg5 * local73 >> 14;
		@Pc(122) int local122 = arg5 * local77 - arg4 * local73 >> 14;
		@Pc(129) int local129 = arg9.method64(arg7, 100, null, -1910907678);
		@Pc(137) int local137 = arg9.method72(arg7, 100, 0, null, (byte) 0);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3981 * 1215292027) && local143 <= arg0.anInt3981 * 1215292027 && local122 >= -(arg0.anInt3982 * -1490598249) && local122 <= arg0.anInt3982 * -1490598249) {
			arg8.method7534(arg7, arg0.anInt3981 * 1215292027 / 2 + local143 + arg2, arg0.anInt3982 * -1490598249 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3, (short) 657);
		}
	}

	@OriginalMember(owner = "client!at", name = "bv", descriptor = "(IIZ)V", line = 868)
	static void method23245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class690.aBooleanArrayArray15[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!at", name = "br", descriptor = "(IIZ)V", line = 868)
	static void method23246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class690.aBooleanArrayArray15[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!at", name = "t", descriptor = "(III)I", line = 1620)
	static final int method23247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 * 57 + arg0;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!at", name = "rh", descriptor = "(Lclient!yf;I)V", line = 8074)
	static final void method23248(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class689.method36526(local11, local14, arg0, 1818816025);
	}

	@OriginalMember(owner = "client!at", name = "aeh", descriptor = "(Lclient!yf;I)V", line = 10250)
	static final void method23249(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (local23 - local13) * (local53 - local33) / (local43 - local33) + local13;
	}

	@OriginalMember(owner = "client!at", name = "awb", descriptor = "(Lclient!yf;B)V", line = 13795)
	static final void method23250(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(1, local13, local23, "", (short) 16361);
	}
}
