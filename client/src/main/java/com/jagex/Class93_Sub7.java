package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajr")
public class Class93_Sub7 extends Class93 {

	@OriginalMember(owner = "client!ajr", name = "d", descriptor = "I")
	int anInt1457;

	@OriginalMember(owner = "client!ajr", name = "k", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_29;

	@OriginalMember(owner = "client!ajr", name = "w", descriptor = "Lclient!akf;")
	final Class93_Sub16 aClass93_Sub16_1;

	@OriginalMember(owner = "client!ajr", name = "f", descriptor = "Lclient!aek;")
	final Class99_Sub2 aClass99_Sub2_1;

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "I")
	int anInt1453;

	@OriginalMember(owner = "client!ajr", name = "u", descriptor = "I")
	int anInt1452;

	@OriginalMember(owner = "client!ajr", name = "z", descriptor = "I")
	int anInt1454;

	@OriginalMember(owner = "client!ajr", name = "p", descriptor = "I")
	int anInt1455;

	@OriginalMember(owner = "client!ajr", name = "y", descriptor = "[[F")
	float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ajr", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!ajr", name = "x", descriptor = "[[F")
	float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ajr", name = "c", descriptor = "I")
	int anInt1456;

	@OriginalMember(owner = "client!ajr", name = "b", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_8;

	@OriginalMember(owner = "client!ajr", name = "h", descriptor = "Lclient!asb;")
	Class93_Sub41_Sub1 aClass93_Sub41_Sub1_2;

	@OriginalMember(owner = "client!ajr", name = "a", descriptor = "Lclient!aan;")
	Class16 aClass16_10;

	@OriginalMember(owner = "client!ajr", name = "r", descriptor = "Lclient!cf;")
	final Interface16 anInterface16_3;

	@OriginalMember(owner = "client!ajr", name = "v", descriptor = "Lclient!bv;")
	final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ajr", name = "o", descriptor = "Lclient!bp;")
	final Class193 aClass193_11;

	@OriginalMember(owner = "client!ajr", name = "s", descriptor = "Lclient!bp;")
	final Class193 aClass193_12;

	@OriginalMember(owner = "client!ajr", name = "<init>", descriptor = "(Lclient!afa;Lclient!aek;Lclient!akf;[I)V", line = 31)
	Class93_Sub7(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class99_Sub2 arg1, @OriginalArg(2) Class93_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_Sub1_29 = arg0;
		this.aClass93_Sub16_1 = arg2;
		this.aClass99_Sub2_1 = arg1;
		@Pc(22) int local22 = this.aClass93_Sub16_1.method13528((byte) -95) - (arg1.anInt412 * -1678286317 >> 1);
		this.anInt1453 = this.aClass93_Sub16_1.method13520(1672190554) - local22 >> arg1.anInt415 * -373302705;
		this.anInt1452 = this.aClass93_Sub16_1.method13520(1583822799) + local22 >> arg1.anInt415 * -373302705;
		this.anInt1454 = this.aClass93_Sub16_1.method13524(1811765606) - local22 >> arg1.anInt415 * -373302705;
		this.anInt1455 = this.aClass93_Sub16_1.method13524(461241388) + local22 >> arg1.anInt415 * -373302705;
		@Pc(82) int local82 = this.anInt1452 - this.anInt1453 + 1;
		@Pc(90) int local90 = this.anInt1455 - this.anInt1454 + 1;
		this.aFloatArrayArray15 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray16 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray14 = new float[local82 + 1][local90 + 1];
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (local119 = 0; local119 <= local90; local119++) {
			local127 = local119 + this.anInt1454;
			if (local127 > 0 && local127 < this.aClass99_Sub2_1.anInt413 * -143202029 - 1) {
				for (local140 = 0; local140 <= local82; local140++) {
					local148 = local140 + this.anInt1453;
					if (local148 > 0 && local148 < this.aClass99_Sub2_1.anInt414 * -1667858293 - 1) {
						local175 = arg1.method2480(local148 + 1, local127, -811210147) - arg1.method2480(local148 - 1, local127, -2137291032);
						local191 = arg1.method2480(local148, local127 + 1, -1527908784) - arg1.method2480(local148, local127 - 1, -888830335);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + 65536 + local191 * local191)));
						this.aFloatArrayArray15[local140][local119] = (float) local175 * local206;
						this.aFloatArrayArray16[local140][local119] = -256.0F * local206;
						this.aFloatArrayArray14[local140][local119] = (float) local191 * local206;
					}
				}
			}
		}
		local119 = 0;
		for (local127 = this.anInt1454; local127 <= this.anInt1455; local127++) {
			if (local127 >= 0 && local127 < arg1.anInt413 * -143202029) {
				for (local140 = this.anInt1453; local140 <= this.anInt1452; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt414 * -1667858293) {
						local148 = arg3[local119];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray2[local140][local127];
						if (local282 != null && local148 != 0) {
							if (local148 == 1) {
								for (local191 = 0; local191 < local282.length; local191 += 3) {
									if (local282[local191] != -1 && local282[local191 + 1] != -1 && local282[local191 + 2] != -1) {
										this.anInt1456 += 3;
									}
								}
							} else {
								this.anInt1456 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1452 - this.anInt1453;
			}
		}
		if (this.anInt1456 > 0) {
			this.aClass93_Sub41_8 = new Class93_Sub41(this.anInt1456 * 2);
			this.aClass93_Sub41_Sub1_2 = new Class93_Sub41_Sub1(this.anInt1456 * 16);
			this.aClass16_10 = new Class16(Class134_Sub2.method10207(this.anInt1456, (byte) 116));
			local127 = 0;
			local119 = 0;
			for (local140 = this.anInt1454; local140 <= this.anInt1455; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt413 * -143202029) {
					local148 = 0;
					for (local175 = this.anInt1453; local175 <= this.anInt1452; local175++) {
						if (local175 >= 0 && local175 < arg1.anInt414 * -1667858293) {
							local191 = arg3[local119];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray2[local175][local140];
							if (local420 != null && local191 != 0) {
								if (local191 == 1) {
									@Pc(434) int[] local434 = arg1.anIntArrayArrayArray4[local175][local140];
									@Pc(441) int[] local441 = arg1.anIntArrayArrayArray1[local175][local140];
									@Pc(443) int local443 = 0;
									label110: while (true) {
										while (true) {
											if (local443 >= local420.length) {
												break label110;
											}
											if (local420[local443] == -1 || local420[local443 + 1] == -1 || local420[local443 + 2] == -1) {
												local443 += 3;
											} else {
												this.method12731(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method12731(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method12731(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
											}
										}
									}
								} else if (local191 == 3) {
									this.method12731(local148, local127, local175, local140, 0, 0);
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, 0);
									this.method12731(local148, local127, local175, local140, 0, arg1.anInt412 * -1678286317);
								} else if (local191 == 2) {
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, 0);
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
									this.method12731(local148, local127, local175, local140, 0, 0);
								} else if (local191 == 5) {
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
									this.method12731(local148, local127, local175, local140, 0, arg1.anInt412 * -1678286317);
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, 0);
								} else if (local191 == 4) {
									this.method12731(local148, local127, local175, local140, 0, arg1.anInt412 * -1678286317);
									this.method12731(local148, local127, local175, local140, 0, 0);
									this.method12731(local148, local127, local175, local140, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
								}
							}
						}
						local119++;
						local148++;
					}
				} else {
					local119 += this.anInt1452 - this.anInt1453;
				}
				local127++;
			}
			this.anInterface16_3 = this.aClass104_Sub1_29.method3843(5123, this.aClass93_Sub41_8.aByteArray58, this.aClass93_Sub41_8.anInt3070 * 212851357, false);
			this.anInterface14_5 = this.aClass104_Sub1_29.method3845(16, this.aClass93_Sub41_Sub1_2.aByteArray58, this.aClass93_Sub41_Sub1_2.anInt3070 * 212851357, false);
			this.aClass193_11 = new Class193(this.anInterface14_5, 5126, 3, 0);
			this.aClass193_12 = new Class193(this.anInterface14_5, 5121, 4, 12);
		} else {
			this.anInterface16_3 = null;
			this.anInterface14_5 = null;
			this.aClass193_11 = null;
			this.aClass193_12 = null;
		}
		this.aClass93_Sub41_Sub1_2 = null;
		this.aClass93_Sub41_8 = null;
		this.aClass16_10 = null;
		this.aFloatArrayArray14 = null;
		this.aFloatArrayArray16 = null;
		this.aFloatArrayArray15 = null;
	}

	@OriginalMember(owner = "client!ajr", name = "e", descriptor = "(S)V", line = 162)
	void method12729(@OriginalArg(0) short arg0) {
		if (this.aClass104_Sub1_29.aBoolean106) {
			this.aClass93_Sub41_8.method22395(arg0, 2144235018);
		} else {
			this.aClass93_Sub41_8.method22398(arg0, -1186779702);
		}
	}

	@OriginalMember(owner = "client!ajr", name = "k", descriptor = "(S)V", line = 162)
	void method12730(@OriginalArg(0) short arg0) {
		if (this.aClass104_Sub1_29.aBoolean106) {
			this.aClass93_Sub41_8.method22395(arg0, 2131065806);
		} else {
			this.aClass93_Sub41_8.method22398(arg0, -1592249828);
		}
	}

	@OriginalMember(owner = "client!ajr", name = "n", descriptor = "(IIIIII)V", line = 167)
	void method12731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass99_Sub2_1.anInt415 * -373302705);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass99_Sub2_1.anInt415 * -373302705);
		@Pc(28) int local28 = this.aClass99_Sub2_1.method2473(local11, local21, 658119551);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class93_Sub20 local54 = (Class93_Sub20) this.aClass16_10.method214(local1);
			if (local54 != null) {
				this.method12729(local54.aShort98);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1457++;
		if (local1 != -1L) {
			this.aClass16_10.method220(new Class93_Sub20(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray16[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass99_Sub2_1.anInt412 * -1678286317 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass99_Sub2_1.anInt412 * -1678286317 && arg5 == this.aClass99_Sub2_1.anInt412 * -1678286317) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass99_Sub2_1.anInt412 * -1678286317) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass99_Sub2_1.anInt412 * -1678286317);
			local250 = (float) arg5 / (float) (this.aClass99_Sub2_1.anInt412 * -1678286317);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray16[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass93_Sub16_1.method13520(-1982084866) - local11;
		local250 = this.aClass93_Sub16_1.method13521(1655674161) - local28;
		local257 = this.aClass93_Sub16_1.method13524(1321135326) - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass93_Sub16_1.method13528((byte) -73);
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass93_Sub16_1.method13532((byte) -115);
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass104_Sub1_29.aBoolean106) {
			this.aClass93_Sub41_Sub1_2.method22322((float) local11);
			this.aClass93_Sub41_Sub1_2.method22322((float) local28);
			this.aClass93_Sub41_Sub1_2.method22322((float) local21);
		} else {
			this.aClass93_Sub41_Sub1_2.method22325((float) local11);
			this.aClass93_Sub41_Sub1_2.method22325((float) local28);
			this.aClass93_Sub41_Sub1_2.method22325((float) local21);
		}
		this.aClass93_Sub41_Sub1_2.method22394(local538, (byte) -80);
		this.aClass93_Sub41_Sub1_2.method22394(local553, (byte) -37);
		this.aClass93_Sub41_Sub1_2.method22394(local566, (byte) -37);
		this.aClass93_Sub41_Sub1_2.method22394(255, (byte) -40);
		this.method12729(local70);
	}

	@OriginalMember(owner = "client!ajr", name = "f", descriptor = "(IIIIII)V", line = 167)
	void method12732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass99_Sub2_1.anInt415 * -373302705);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass99_Sub2_1.anInt415 * -373302705);
		@Pc(28) int local28 = this.aClass99_Sub2_1.method2473(local11, local21, 252085972);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class93_Sub20 local54 = (Class93_Sub20) this.aClass16_10.method214(local1);
			if (local54 != null) {
				this.method12729(local54.aShort98);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1457++;
		if (local1 != -1L) {
			this.aClass16_10.method220(new Class93_Sub20(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray16[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass99_Sub2_1.anInt412 * -1678286317 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass99_Sub2_1.anInt412 * -1678286317 && arg5 == this.aClass99_Sub2_1.anInt412 * -1678286317) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass99_Sub2_1.anInt412 * -1678286317) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass99_Sub2_1.anInt412 * -1678286317);
			local250 = (float) arg5 / (float) (this.aClass99_Sub2_1.anInt412 * -1678286317);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray16[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray16[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray16[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass93_Sub16_1.method13520(-1209115712) - local11;
		local250 = this.aClass93_Sub16_1.method13521(1655674161) - local28;
		local257 = this.aClass93_Sub16_1.method13524(973410424) - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass93_Sub16_1.method13528((byte) -49);
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass93_Sub16_1.method13532((byte) -65);
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass104_Sub1_29.aBoolean106) {
			this.aClass93_Sub41_Sub1_2.method22322((float) local11);
			this.aClass93_Sub41_Sub1_2.method22322((float) local28);
			this.aClass93_Sub41_Sub1_2.method22322((float) local21);
		} else {
			this.aClass93_Sub41_Sub1_2.method22325((float) local11);
			this.aClass93_Sub41_Sub1_2.method22325((float) local28);
			this.aClass93_Sub41_Sub1_2.method22325((float) local21);
		}
		this.aClass93_Sub41_Sub1_2.method22394(local538, (byte) -48);
		this.aClass93_Sub41_Sub1_2.method22394(local553, (byte) -103);
		this.aClass93_Sub41_Sub1_2.method22394(local566, (byte) -54);
		this.aClass93_Sub41_Sub1_2.method22394(255, (byte) -15);
		this.method12729(local70);
	}

	@OriginalMember(owner = "client!ajr", name = "m", descriptor = "(III[[Z)V", line = 263)
	void method12733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface16_3 == null || (this.anInt1453 > arg0 + arg2 || (this.anInt1452 < arg0 - arg2 || (this.anInt1454 > arg1 + arg2 || this.anInt1455 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1454; local34 <= this.anInt1455; local34++) {
			for (@Pc(41) int local41 = this.anInt1453; local41 <= this.anInt1452; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass104_Sub1_29.method3906((int) (this.aClass93_Sub16_1.method13535(1886489724) * 255.0F) << 24);
					this.aClass104_Sub1_29.method3855(this.aClass193_11, null, this.aClass193_12, null);
					this.aClass104_Sub1_29.method3862(this.anInterface16_3, 4, 0, this.anInt1456);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ajr", name = "w", descriptor = "(III[[Z)V", line = 263)
	void method12734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface16_3 == null || (this.anInt1453 > arg0 + arg2 || (this.anInt1452 < arg0 - arg2 || (this.anInt1454 > arg1 + arg2 || this.anInt1455 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1454; local34 <= this.anInt1455; local34++) {
			for (@Pc(41) int local41 = this.anInt1453; local41 <= this.anInt1452; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass104_Sub1_29.method3906((int) (this.aClass93_Sub16_1.method13535(1582787109) * 255.0F) << 24);
					this.aClass104_Sub1_29.method3855(this.aClass193_11, null, this.aClass193_12, null);
					this.aClass104_Sub1_29.method3862(this.anInterface16_3, 4, 0, this.anInt1456);
					return;
				}
			}
		}
	}
}
