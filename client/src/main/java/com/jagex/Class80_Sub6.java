package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajk")
public final class Class80_Sub6 extends Class80 {

	@OriginalMember(owner = "client!ajk", name = "a", descriptor = "I")
	int anInt1452;

	@OriginalMember(owner = "client!ajk", name = "u", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_29;

	@OriginalMember(owner = "client!ajk", name = "g", descriptor = "Lclient!akb;")
	final Class80_Sub12 aClass80_Sub12_1;

	@OriginalMember(owner = "client!ajk", name = "l", descriptor = "Lclient!aez;")
	final Class100_Sub3 aClass100_Sub3_1;

	@OriginalMember(owner = "client!ajk", name = "i", descriptor = "I")
	int anInt1454;

	@OriginalMember(owner = "client!ajk", name = "m", descriptor = "I")
	int anInt1451;

	@OriginalMember(owner = "client!ajk", name = "o", descriptor = "I")
	int anInt1450;

	@OriginalMember(owner = "client!ajk", name = "j", descriptor = "I")
	int anInt1449;

	@OriginalMember(owner = "client!ajk", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ajk", name = "h", descriptor = "[[F")
	float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!ajk", name = "d", descriptor = "[[F")
	float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ajk", name = "s", descriptor = "I")
	int anInt1453;

	@OriginalMember(owner = "client!ajk", name = "z", descriptor = "Lclient!ald;")
	Packet aPacket_8;

	@OriginalMember(owner = "client!ajk", name = "p", descriptor = "Lclient!asx;")
	PacketGl aPacketGl_2;

	@OriginalMember(owner = "client!ajk", name = "v", descriptor = "Lclient!aax;")
	Class24 aClass24_10;

	@OriginalMember(owner = "client!ajk", name = "k", descriptor = "Lclient!ca;")
	final Interface15 anInterface15_3;

	@OriginalMember(owner = "client!ajk", name = "x", descriptor = "Lclient!bw;")
	final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ajk", name = "w", descriptor = "Lclient!bm;")
	final Class189 aClass189_11;

	@OriginalMember(owner = "client!ajk", name = "r", descriptor = "Lclient!bm;")
	final Class189 aClass189_12;

	@OriginalMember(owner = "client!ajk", name = "<init>", descriptor = "(Lclient!afm;Lclient!aez;Lclient!akb;[I)V")
	Class80_Sub6(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class100_Sub3 arg1, @OriginalArg(2) Class80_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass102_Sub3_29 = arg0;
		this.aClass80_Sub12_1 = arg2;
		this.aClass100_Sub3_1 = arg1;
		@Pc(22) int local22 = this.aClass80_Sub12_1.method13952(-432544427) - (arg1.anInt447 * -1174710433 >> 1);
		this.anInt1454 = this.aClass80_Sub12_1.method13949((byte) 0) - local22 >> arg1.anInt445 * -615169581;
		this.anInt1451 = this.aClass80_Sub12_1.method13949((byte) 0) + local22 >> arg1.anInt445 * -615169581;
		this.anInt1450 = this.aClass80_Sub12_1.method13970(1380911939) - local22 >> arg1.anInt445 * -615169581;
		this.anInt1449 = this.aClass80_Sub12_1.method13970(1193312529) + local22 >> arg1.anInt445 * -615169581;
		@Pc(82) int local82 = this.anInt1451 - this.anInt1454 + 1;
		@Pc(90) int local90 = this.anInt1449 - this.anInt1450 + 1;
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
			local127 = local119 + this.anInt1450;
			if (local127 > 0 && local127 < this.aClass100_Sub3_1.anInt446 * -1356799781 - 1) {
				for (local140 = 0; local140 <= local82; local140++) {
					local148 = local140 + this.anInt1454;
					if (local148 > 0 && local148 < this.aClass100_Sub3_1.anInt448 * -1548585779 - 1) {
						local175 = arg1.method2917(local148 + 1, local127, -2008591110) - arg1.method2917(local148 - 1, local127, -395844147);
						local191 = arg1.method2917(local148, local127 + 1, -764008728) - arg1.method2917(local148, local127 - 1, -1075772618);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + 65536 + local191 * local191)));
						this.aFloatArrayArray15[local140][local119] = (float) local175 * local206;
						this.aFloatArrayArray16[local140][local119] = -256.0F * local206;
						this.aFloatArrayArray14[local140][local119] = (float) local191 * local206;
					}
				}
			}
		}
		local119 = 0;
		for (local127 = this.anInt1450; local127 <= this.anInt1449; local127++) {
			if (local127 >= 0 && local127 < arg1.anInt446 * -1356799781) {
				for (local140 = this.anInt1454; local140 <= this.anInt1451; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt448 * -1548585779) {
						local148 = arg3[local119];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray8[local140][local127];
						if (local282 != null && local148 != 0) {
							if (local148 == 1) {
								for (local191 = 0; local191 < local282.length; local191 += 3) {
									if (local282[local191] != -1 && local282[local191 + 1] != -1 && local282[local191 + 2] != -1) {
										this.anInt1453 += 3;
									}
								}
							} else {
								this.anInt1453 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1451 - this.anInt1454;
			}
		}
		if (this.anInt1453 > 0) {
			this.aPacket_8 = new Packet(this.anInt1453 * 2);
			this.aPacketGl_2 = new PacketGl(this.anInt1453 * 16);
			this.aClass24_10 = new Class24(Class700.method37081(this.anInt1453, (byte) 9));
			local127 = 0;
			local119 = 0;
			for (local140 = this.anInt1450; local140 <= this.anInt1449; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt446 * -1356799781) {
					local148 = 0;
					for (local175 = this.anInt1454; local175 <= this.anInt1451; local175++) {
						if (local175 >= 0 && local175 < arg1.anInt448 * -1548585779) {
							local191 = arg3[local119];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray8[local175][local140];
							if (local420 != null && local191 != 0) {
								if (local191 == 1) {
									@Pc(434) int[] local434 = arg1.anIntArrayArrayArray9[local175][local140];
									@Pc(441) int[] local441 = arg1.anIntArrayArrayArray7[local175][local140];
									@Pc(443) int local443 = 0;
									label110: while (true) {
										while (true) {
											if (local443 >= local420.length) {
												break label110;
											}
											if (local420[local443] == -1 || local420[local443 + 1] == -1 || local420[local443 + 2] == -1) {
												local443 += 3;
											} else {
												this.method13150(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method13150(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method13150(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
											}
										}
									}
								} else if (local191 == 3) {
									this.method13150(local148, local127, local175, local140, 0, 0);
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, 0);
									this.method13150(local148, local127, local175, local140, 0, arg1.anInt447 * -1174710433);
								} else if (local191 == 2) {
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, 0);
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
									this.method13150(local148, local127, local175, local140, 0, 0);
								} else if (local191 == 5) {
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
									this.method13150(local148, local127, local175, local140, 0, arg1.anInt447 * -1174710433);
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, 0);
								} else if (local191 == 4) {
									this.method13150(local148, local127, local175, local140, 0, arg1.anInt447 * -1174710433);
									this.method13150(local148, local127, local175, local140, 0, 0);
									this.method13150(local148, local127, local175, local140, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
								}
							}
						}
						local119++;
						local148++;
					}
				} else {
					local119 += this.anInt1451 - this.anInt1454;
				}
				local127++;
			}
			this.anInterface15_3 = this.aClass102_Sub3_29.method6445(5123, this.aPacket_8.data, this.aPacket_8.pos * -1380987821, false);
			this.anInterface14_5 = this.aClass102_Sub3_29.method6375(16, this.aPacketGl_2.data, this.aPacketGl_2.pos * -1380987821, false);
			this.aClass189_11 = new Class189(this.anInterface14_5, 5126, 3, 0);
			this.aClass189_12 = new Class189(this.anInterface14_5, 5121, 4, 12);
		} else {
			this.anInterface15_3 = null;
			this.anInterface14_5 = null;
			this.aClass189_11 = null;
			this.aClass189_12 = null;
		}
		this.aPacketGl_2 = null;
		this.aPacket_8 = null;
		this.aClass24_10 = null;
		this.aFloatArrayArray14 = null;
		this.aFloatArrayArray16 = null;
		this.aFloatArrayArray15 = null;
	}

	@OriginalMember(owner = "client!ajk", name = "m", descriptor = "(III[[Z)V")
	void method13148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt1454 > arg0 + arg2 || (this.anInt1451 < arg0 - arg2 || (this.anInt1450 > arg1 + arg2 || this.anInt1449 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1450; local34 <= this.anInt1449; local34++) {
			for (@Pc(41) int local41 = this.anInt1454; local41 <= this.anInt1451; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass102_Sub3_29.method6392((int) (this.aClass80_Sub12_1.method13954(1667776450) * 255.0F) << 24);
					this.aClass102_Sub3_29.method6550(this.aClass189_11, null, this.aClass189_12, null);
					this.aClass102_Sub3_29.method6379(this.anInterface15_3, 4, 0, this.anInt1453);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ajk", name = "o", descriptor = "(III[[Z)V")
	void method13149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt1454 > arg0 + arg2 || (this.anInt1451 < arg0 - arg2 || (this.anInt1450 > arg1 + arg2 || this.anInt1449 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1450; local34 <= this.anInt1449; local34++) {
			for (@Pc(41) int local41 = this.anInt1454; local41 <= this.anInt1451; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass102_Sub3_29.method6392((int) (this.aClass80_Sub12_1.method13954(1826140592) * 255.0F) << 24);
					this.aClass102_Sub3_29.method6550(this.aClass189_11, null, this.aClass189_12, null);
					this.aClass102_Sub3_29.method6379(this.anInterface15_3, 4, 0, this.anInt1453);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ajk", name = "f", descriptor = "(IIIIII)V")
	void method13150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass100_Sub3_1.anInt445 * -615169581);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass100_Sub3_1.anInt445 * -615169581);
		@Pc(28) int local28 = this.aClass100_Sub3_1.method2915(local11, local21, (byte) -71);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class80_Sub35 local54 = (Class80_Sub35) this.aClass24_10.method560(local1);
			if (local54 != null) {
				this.method13156(local54.aShort53);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1452++;
		if (local1 != -1L) {
			this.aClass24_10.method563(new Class80_Sub35(local70), local1);
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
		} else if (arg4 == this.aClass100_Sub3_1.anInt447 * -1174710433 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass100_Sub3_1.anInt447 * -1174710433 && arg5 == this.aClass100_Sub3_1.anInt447 * -1174710433) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass100_Sub3_1.anInt447 * -1174710433) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray16[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass100_Sub3_1.anInt447 * -1174710433);
			local250 = (float) arg5 / (float) (this.aClass100_Sub3_1.anInt447 * -1174710433);
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
		local240 = this.aClass80_Sub12_1.method13949((byte) 0) - local11;
		local250 = this.aClass80_Sub12_1.method13950(-2124399541) - local28;
		local257 = this.aClass80_Sub12_1.method13970(-1719393870) - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass80_Sub12_1.method13952(-432544427);
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
		@Pc(528) int local528 = this.aClass80_Sub12_1.method13953((byte) 117);
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
		if (this.aClass102_Sub3_29.aBoolean129) {
			this.aPacketGl_2.method23420((float) local11);
			this.aPacketGl_2.method23420((float) local28);
			this.aPacketGl_2.method23420((float) local21);
		} else {
			this.aPacketGl_2.method23418((float) local11);
			this.aPacketGl_2.method23418((float) local28);
			this.aPacketGl_2.method23418((float) local21);
		}
		this.aPacketGl_2.p1(local538);
		this.aPacketGl_2.p1(local553);
		this.aPacketGl_2.p1(local566);
		this.aPacketGl_2.p1(255);
		this.method13156(local70);
	}

	@OriginalMember(owner = "client!ajk", name = "e", descriptor = "(III[[Z)V")
	void method13151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt1454 > arg0 + arg2 || (this.anInt1451 < arg0 - arg2 || (this.anInt1450 > arg1 + arg2 || this.anInt1449 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1450; local34 <= this.anInt1449; local34++) {
			for (@Pc(41) int local41 = this.anInt1454; local41 <= this.anInt1451; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass102_Sub3_29.method6392((int) (this.aClass80_Sub12_1.method13954(1394885091) * 255.0F) << 24);
					this.aClass102_Sub3_29.method6550(this.aClass189_11, null, this.aClass189_12, null);
					this.aClass102_Sub3_29.method6379(this.anInterface15_3, 4, 0, this.anInt1453);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ajk", name = "u", descriptor = "(S)V")
	void method13152(@OriginalArg(0) short arg0) {
		if (this.aClass102_Sub3_29.aBoolean129) {
			this.aPacket_8.p2(arg0);
		} else {
			this.aPacket_8.ip2(arg0);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "l", descriptor = "(S)V")
	void method13153(@OriginalArg(0) short arg0) {
		if (this.aClass102_Sub3_29.aBoolean129) {
			this.aPacket_8.p2(arg0);
		} else {
			this.aPacket_8.ip2(arg0);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "g", descriptor = "(S)V")
	void method13154(@OriginalArg(0) short arg0) {
		if (this.aClass102_Sub3_29.aBoolean129) {
			this.aPacket_8.p2(arg0);
		} else {
			this.aPacket_8.ip2(arg0);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "i", descriptor = "(III[[Z)V")
	void method13155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt1454 > arg0 + arg2 || (this.anInt1451 < arg0 - arg2 || (this.anInt1450 > arg1 + arg2 || this.anInt1449 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1450; local34 <= this.anInt1449; local34++) {
			for (@Pc(41) int local41 = this.anInt1454; local41 <= this.anInt1451; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass102_Sub3_29.method6392((int) (this.aClass80_Sub12_1.method13954(1284072643) * 255.0F) << 24);
					this.aClass102_Sub3_29.method6550(this.aClass189_11, null, this.aClass189_12, null);
					this.aClass102_Sub3_29.method6379(this.anInterface15_3, 4, 0, this.anInt1453);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ajk", name = "t", descriptor = "(S)V")
	void method13156(@OriginalArg(0) short arg0) {
		if (this.aClass102_Sub3_29.aBoolean129) {
			this.aPacket_8.p2(arg0);
		} else {
			this.aPacket_8.ip2(arg0);
		}
	}
}
