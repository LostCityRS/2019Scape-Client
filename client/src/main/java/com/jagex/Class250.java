package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class250 {

	@OriginalMember(owner = "client!es", name = "v", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array3;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "[I")
	final int[] anIntArray364;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "[I")
	final int[] anIntArray361;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "[I")
	final int[] anIntArray360;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "[I")
	final int[] anIntArray363;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[I")
	final int[] anIntArray362;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "[I")
	final int[] anIntArray365;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
	final int[] anIntArray366;

	@OriginalMember(owner = "client!es", name = "hs", descriptor = "(Lclient!ahb;ZI)V")
	static void method26357(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class621 local3 = arg0.method18952((byte) -119);
		if (arg0.anInt2700 * 1679797067 == 0) {
			arg0.anInt2678 = 0;
			Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
			Class143_Sub1.anInt1297 = 0;
			return;
		}
		if (arg0.aClass6_3.method23590(-499060808) && !arg0.aClass6_3.method23589((byte) 36)) {
			@Pc(35) Class261 local35 = arg0.aClass6_3.method23581((byte) 67);
			if (arg0.anInt2702 * -2417789 > 0 && local35.anInt3890 * 679184865 == 0) {
				arg0.anInt2678 += 847555365;
				Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
				Class143_Sub1.anInt1297 = 0;
				return;
			}
			if (arg0.anInt2702 * -2417789 <= 0 && local35.anInt3896 * -1996482375 == 0) {
				arg0.anInt2678 += 847555365;
				Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
				Class143_Sub1.anInt1297 = 0;
				return;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < arg0.aClass561Array3.length; local85++) {
			if (-2124314403 * arg0.aClass561Array3[local85].anInt5188 != -1 && arg0.aClass561Array3[local85].aClass6_9.method23589((byte) 88)) {
				@Pc(119) Class684 local119 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(arg0.aClass561Array3[local85].anInt5188 * -2124314403, 167093320);
				if (local119.aBoolean986 && local119.anInt5764 * 319211597 != -1) {
					@Pc(137) Class261 local137 = (Class261) Class125.aClass41_Sub1_6.method18054(local119.anInt5764 * 319211597, 1603594728);
					if (arg0.anInt2702 * -2417789 > 0 && local137.anInt3890 * 679184865 == 0) {
						arg0.anInt2678 += 847555365;
						Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
						Class143_Sub1.anInt1297 = 0;
						return;
					}
					if (arg0.anInt2702 * -2417789 <= 0 && local137.anInt3896 * -1996482375 == 0) {
						arg0.anInt2678 += 847555365;
						Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
						Class143_Sub1.anInt1297 = 0;
						return;
					}
				}
			}
		}
		@Pc(193) Class463 local193 = Class463.method29472(arg0.method24552().aClass463_61);
		@Pc(197) int local197 = (int) local193.aFloat297;
		@Pc(201) int local201 = (int) local193.aFloat296;
		@Pc(219) int local219 = arg0.anIntArray234[arg0.anInt2700 * 1679797067 - 1] * 512 + arg0.method18966((byte) -76) * 256;
		@Pc(237) int local237 = arg0.anIntArray242[arg0.anInt2700 * 1679797067 - 1] * 512 + arg0.method18966((byte) -73) * 256;
		if (local197 < local219) {
			if (local201 < local237) {
				arg0.method19033(10240, (byte) 1);
			} else if (local201 > local237) {
				arg0.method19033(14336, (byte) 1);
			} else {
				arg0.method19033(12288, (byte) 1);
			}
		} else if (local197 > local219) {
			if (local201 < local237) {
				arg0.method19033(6144, (byte) 1);
			} else if (local201 > local237) {
				arg0.method19033(2048, (byte) 1);
			} else {
				arg0.method19033(4096, (byte) 1);
			}
		} else if (local201 < local237) {
			arg0.method19033(8192, (byte) 1);
		} else if (local201 > local237) {
			arg0.method19033(0, (byte) 1);
		}
		@Pc(310) byte local310 = arg0.aByteArray49[arg0.anInt2700 * 1679797067 - 1];
		if (!arg1 && (local219 - local197 > 1024 || local219 - local197 < -1024 || local237 - local201 > 1024 || local237 - local201 < -1024)) {
			arg0.method24531((float) local219, local193.aFloat295, (float) local237);
			arg0.method18986(arg0.anInt2701 * 1702368425, false, (byte) -2);
			arg0.anInt2700 -= -1307113885;
			if (arg0.anInt2702 * -2417789 > 0) {
				arg0.anInt2702 -= 232868651;
			}
			Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
			Class143_Sub1.anInt1297 = 0;
			local193.method29557();
			return;
		}
		@Pc(377) int local377 = 16;
		@Pc(379) boolean local379 = true;
		if (arg0 instanceof Class120_Sub1_Sub1_Sub1_Sub1) {
			local379 = ((Class120_Sub1_Sub1_Sub1_Sub1) arg0).aClass335_1.aBoolean828;
		}
		@Pc(400) int local400;
		if (local379) {
			local400 = arg0.anInt2701 * 1702368425 - arg0.aClass372_8.anInt4506 * 1783746791;
			if (local400 != 0 && arg0.anInt2683 * 1232799883 == -1 && arg0.anInt2697 * 1952438699 != 0) {
				local377 = 8;
			}
			if (!arg1 && arg0.anInt2700 * 1679797067 > 2) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2700 * 1679797067 > 3) {
				local377 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2700 * 1679797067 > 1) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2700 * 1679797067 > 2) {
				local377 = 32;
			}
		}
		if (arg0.anInt2678 * -655132499 > 0 && arg0.anInt2700 * 1679797067 > 1) {
			local377 = 32;
			arg0.anInt2678 -= 847555365;
		}
		if (Class712.aClass712_5.aByte165 == local310) {
			local377 <<= 0x1;
		} else if (local310 == Class712.aClass712_1.aByte165) {
			local377 >>= 0x1;
		}
		if (-1750254073 * local3.anInt5470 != -1) {
			local377 <<= 0x9;
			if (arg0.anInt2700 * 1679797067 == 1) {
				local400 = arg0.anInt2682 * 1224683155 * arg0.anInt2682 * 1224683155;
				@Pc(539) int local539 = ((int) local193.aFloat297 > local219 ? (int) local193.aFloat297 - local219 : local219 - (int) local193.aFloat297) << 9;
				@Pc(558) int local558 = ((int) local193.aFloat296 > local237 ? (int) local193.aFloat296 - local237 : local237 - (int) local193.aFloat296) << 9;
				@Pc(565) int local565 = local539 > local558 ? local539 : local558;
				@Pc(572) int local572 = local3.anInt5470 * 794459150 * local565;
				if (local400 > local572) {
					arg0.anInt2682 = arg0.anInt2682 * 1224683155 / 2 * 1268326299;
				} else if (local400 / 2 > local565) {
					arg0.anInt2682 -= local3.anInt5470 * -275355843;
					if (arg0.anInt2682 * 1224683155 < 0) {
						arg0.anInt2682 = 0;
					}
				} else if (arg0.anInt2682 * 1224683155 < local377) {
					arg0.anInt2682 += local3.anInt5470 * -275355843;
					if (arg0.anInt2682 * 1224683155 > local377) {
						arg0.anInt2682 = local377 * 1268326299;
					}
				}
			} else if (arg0.anInt2682 * 1224683155 < local377) {
				arg0.anInt2682 += local3.anInt5470 * -275355843;
				if (arg0.anInt2682 * 1224683155 > local377) {
					arg0.anInt2682 = local377 * 1268326299;
				}
			} else if (arg0.anInt2682 * 1224683155 > 0) {
				arg0.anInt2682 -= local3.anInt5470 * -275355843;
				if (arg0.anInt2682 * 1224683155 < 0) {
					arg0.anInt2682 = 0;
				}
			}
			local377 = arg0.anInt2682 * 1224683155 >> 9;
			if (local377 < 1) {
				local377 = 1;
			}
		}
		Class143_Sub1.anInt1297 = 0;
		if (local219 == local197 && local237 == local201) {
			Class90.anInt323 = Class712.aClass712_4.aByte165 * 1412587427;
		} else {
			if (local197 < local219) {
				local193.aFloat297 += local377;
				Class143_Sub1.anInt1297 = (Class143_Sub1.anInt1297 * 661912489 | 0x4) * -342304615;
				if (local193.aFloat297 > (float) local219) {
					local193.aFloat297 = local219;
				}
			} else if (local197 > local219) {
				local193.aFloat297 -= local377;
				Class143_Sub1.anInt1297 = (Class143_Sub1.anInt1297 * 661912489 | 0x8) * -342304615;
				if (local193.aFloat297 < (float) local219) {
					local193.aFloat297 = local219;
				}
			}
			if (local201 < local237) {
				local193.aFloat296 += local377;
				Class143_Sub1.anInt1297 = (Class143_Sub1.anInt1297 * 661912489 | 0x1) * -342304615;
				if (local193.aFloat296 > (float) local237) {
					local193.aFloat296 = local237;
				}
			} else if (local201 > local237) {
				local193.aFloat296 -= local377;
				Class143_Sub1.anInt1297 = (Class143_Sub1.anInt1297 * 661912489 | 0x2) * -342304615;
				if (local193.aFloat296 < (float) local237) {
					local193.aFloat296 = local237;
				}
			}
			arg0.method24542(local193);
			if (local377 >= 32) {
				Class90.anInt323 = Class712.aClass712_5.aByte165 * 1412587427;
			} else {
				Class90.anInt323 = local310 * 1412587427;
			}
		}
		if (local219 == (int) local193.aFloat297 && (int) local193.aFloat296 == local237) {
			arg0.anInt2700 -= -1307113885;
			if (arg0.anInt2702 * -2417789 > 0) {
				arg0.anInt2702 -= 232868651;
			}
		}
		local193.method29557();
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class250(@OriginalArg(0) Packet arg0) {
		@Pc(5) int local5 = arg0.gSmart1or2();
		this.anIntArray364 = new int[local5];
		this.anIntArray361 = new int[local5];
		this.anIntArray360 = new int[local5];
		this.anIntArray363 = new int[local5];
		this.anIntArray362 = new int[local5];
		this.anIntArray365 = new int[local5];
		this.anIntArray366 = new int[local5];
		for (@Pc(35) int local35 = 0; local35 < local5; local35++) {
			this.anIntArray364[local35] = arg0.g2() - 5120;
			this.anIntArray360[local35] = arg0.g2() - 5120;
			this.anIntArray361[local35] = arg0.g2s();
			this.anIntArray362[local35] = arg0.g2() - 5120;
			this.anIntArray366[local35] = arg0.g2() - 5120;
			this.anIntArray365[local35] = arg0.g2s();
			this.anIntArray363[local35] = arg0.g2s();
		}
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
	void method26354(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray364.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray364.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray364[local9];
			local7[local9 * 2][1] = this.anIntArray361[local9];
			local7[local9 * 2][2] = this.anIntArray360[local9];
			local7[local9 * 2][3] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray366[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray363[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!es", name = "t", descriptor = "(II)V")
	void method26355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int[][] local7 = new int[this.anIntArray364.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray364.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray364[local9];
			local7[local9 * 2][1] = this.anIntArray361[local9];
			local7[local9 * 2][2] = this.anIntArray360[local9];
			local7[local9 * 2][3] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray366[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray363[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
	void method26356(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray364.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray364.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray364[local9];
			local7[local9 * 2][1] = this.anIntArray361[local9];
			local7[local9 * 2][2] = this.anIntArray360[local9];
			local7[local9 * 2][3] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray365[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray366[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray363[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}
}
