package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@OriginalClass("client!akd")
public final class Class80_Sub14 extends Class80 {

	@OriginalMember(owner = "client!akd", name = "a", descriptor = "I")
	int anInt1546 = 0;

	@OriginalMember(owner = "client!akd", name = "s", descriptor = "I")
	int anInt1544 = 0;

	@OriginalMember(owner = "client!akd", name = "k", descriptor = "I")
	int anInt1545 = 0;

	@OriginalMember(owner = "client!akd", name = "u", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_26;

	@OriginalMember(owner = "client!akd", name = "g", descriptor = "Lclient!akb;")
	final Class80_Sub12 aClass80_Sub12_2;

	@OriginalMember(owner = "client!akd", name = "l", descriptor = "Lclient!aes;")
	final Class100_Sub2 aClass100_Sub2_1;

	@OriginalMember(owner = "client!akd", name = "i", descriptor = "I")
	int anInt1540;

	@OriginalMember(owner = "client!akd", name = "m", descriptor = "I")
	int anInt1541;

	@OriginalMember(owner = "client!akd", name = "o", descriptor = "I")
	int anInt1542;

	@OriginalMember(owner = "client!akd", name = "j", descriptor = "I")
	int anInt1543;

	@OriginalMember(owner = "client!akd", name = "r", descriptor = "[[F")
	float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!akd", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!akd", name = "h", descriptor = "[[F")
	float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!akd", name = "d", descriptor = "Lclient!aax;")
	Class24 aClass24_11;

	@OriginalMember(owner = "client!akd", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!akd", name = "w", descriptor = "Lclient!lx;")
	Interface38 anInterface38_10;

	@OriginalMember(owner = "client!akd", name = "x", descriptor = "Lclient!mv;")
	Interface44 anInterface44_2;

	@OriginalMember(owner = "client!akd", name = "<init>", descriptor = "(Lclient!afa;Lclient!aes;Lclient!akb;[I)V")
	Class80_Sub14(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class100_Sub2 arg1, @OriginalArg(2) Class80_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass102_Sub1_26 = arg0;
		this.aClass80_Sub12_2 = arg2;
		this.aClass100_Sub2_1 = arg1;
		@Pc(31) int local31 = this.aClass80_Sub12_2.method13952(-432544427) - (arg1.anInt447 * -1174710433 >> 1);
		this.anInt1540 = this.aClass80_Sub12_2.method13949((byte) 0) - local31 >> arg1.anInt445 * -615169581;
		this.anInt1541 = this.aClass80_Sub12_2.method13949((byte) 0) + local31 >> arg1.anInt445 * -615169581;
		this.anInt1542 = this.aClass80_Sub12_2.method13970(-401138432) - local31 >> arg1.anInt445 * -615169581;
		this.anInt1543 = this.aClass80_Sub12_2.method13970(1131834361) + local31 >> arg1.anInt445 * -615169581;
		@Pc(91) int local91 = this.anInt1541 - this.anInt1540 + 1;
		@Pc(99) int local99 = this.anInt1543 - this.anInt1542 + 1;
		this.aFloatArrayArray19 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray17 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray18 = new float[local91 + 1][local99 + 1];
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(184) int local184;
		@Pc(200) int local200;
		for (local128 = 0; local128 <= local99; local128++) {
			local136 = local128 + this.anInt1542;
			if (local136 > 0 && local136 < this.aClass100_Sub2_1.anInt446 * -1356799781 - 1) {
				for (local149 = 0; local149 <= local91; local149++) {
					local157 = local149 + this.anInt1540;
					if (local157 > 0 && local157 < this.aClass100_Sub2_1.anInt448 * -1548585779 - 1) {
						local184 = arg1.method2917(local157 + 1, local136, -2070361371) - arg1.method2917(local157 - 1, local136, -552777917);
						local200 = arg1.method2917(local157, local136 + 1, -1355153175) - arg1.method2917(local157, local136 - 1, -2065018021);
						@Pc(215) float local215 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + 65536 + local200 * local200)));
						this.aFloatArrayArray19[local149][local128] = (float) local184 * local215;
						this.aFloatArrayArray17[local149][local128] = -256.0F * local215;
						this.aFloatArrayArray18[local149][local128] = (float) local200 * local215;
					}
				}
			}
		}
		local128 = 0;
		for (local136 = this.anInt1542; local136 <= this.anInt1543; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt446 * -1356799781) {
				for (local149 = this.anInt1540; local149 <= this.anInt1541; local149++) {
					if (local149 >= 0 && local149 < arg1.anInt448 * -1548585779) {
						local157 = arg3[local128];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray2[local149][local136];
						if (local291 != null && local157 != 0) {
							if (local157 == 1) {
								for (local200 = 0; local200 < local291.length; local200 += 3) {
									if (local291[local200] != -1 && local291[local200 + 1] != -1 && local291[local200 + 2] != -1) {
										this.anInt1544 += 3;
									}
								}
							} else {
								this.anInt1544 += 3;
							}
						}
					}
					local128++;
				}
			} else {
				local128 += this.anInt1541 - this.anInt1540;
			}
		}
		if (this.anInt1544 > 0) {
			this.aClass24_11 = new Class24(Class700.method37081(this.anInt1544, (byte) 9));
			this.aByteBuffer4 = this.aClass102_Sub1_26.aByteBuffer7;
			this.aByteBuffer4.clear();
			this.aByteBuffer4.position(this.aClass102_Sub1_26.anInt2956 >> 1);
			this.aByteBuffer4.slice();
			this.aByteBuffer4.position(0);
			this.aByteBuffer4.limit(this.aClass102_Sub1_26.anInt2956 >> 1);
			local136 = 0;
			local128 = 0;
			for (local149 = this.anInt1542; local149 <= this.anInt1543; local149++) {
				if (local149 >= 0 && local149 < arg1.anInt446 * -1356799781) {
					local157 = 0;
					for (local184 = this.anInt1540; local184 <= this.anInt1541; local184++) {
						if (local184 >= 0 && local184 < arg1.anInt448 * -1548585779) {
							local200 = arg3[local128];
							@Pc(447) int[] local447 = arg1.anIntArrayArrayArray2[local184][local149];
							if (local447 != null && local200 != 0) {
								if (local200 == 1) {
									@Pc(461) int[] local461 = arg1.anIntArrayArrayArray4[local184][local149];
									@Pc(468) int[] local468 = arg1.anIntArrayArrayArray1[local184][local149];
									@Pc(470) int local470 = 0;
									label110: while (true) {
										while (true) {
											if (local470 >= local447.length) {
												break label110;
											}
											if (local447[local470] == -1 || local447[local470 + 1] == -1 || local447[local470 + 2] == -1) {
												local470 += 3;
											} else {
												this.method14026(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method14026(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method14026(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
											}
										}
									}
								} else if (local200 == 3) {
									this.method14026(local157, local136, local184, local149, 0, 0);
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, 0);
									this.method14026(local157, local136, local184, local149, 0, arg1.anInt447 * -1174710433);
								} else if (local200 == 2) {
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, 0);
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
									this.method14026(local157, local136, local184, local149, 0, 0);
								} else if (local200 == 5) {
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
									this.method14026(local157, local136, local184, local149, 0, arg1.anInt447 * -1174710433);
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, 0);
								} else if (local200 == 4) {
									this.method14026(local157, local136, local184, local149, 0, arg1.anInt447 * -1174710433);
									this.method14026(local157, local136, local184, local149, 0, 0);
									this.method14026(local157, local136, local184, local149, arg1.anInt447 * -1174710433, arg1.anInt447 * -1174710433);
								}
							}
						}
						local128++;
						local157++;
					}
				} else {
					local128 += this.anInt1541 - this.anInt1540;
				}
				local136++;
			}
			this.method14025();
		} else {
			this.anInterface38_10 = null;
			this.anInterface44_2 = null;
		}
		this.aClass24_11 = null;
		this.aFloatArrayArray18 = null;
		this.aFloatArrayArray17 = null;
		this.aFloatArrayArray19 = null;
	}

	@OriginalMember(owner = "client!akd", name = "j", descriptor = "(Lclient!je;III[[ZZ)V")
	void method14024(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface44_2 == null || (this.anInt1540 > arg1 + arg3 || (this.anInt1541 < arg1 - arg3 || (this.anInt1542 > arg2 + arg3 || this.anInt1543 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1540; local36 <= this.anInt1541; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1542; local54 <= this.anInt1543; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method14035(arg0, this.anInterface44_2, this.anInt1545 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass102_Sub1_26.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1542;
		while (true) {
			if (local110 > this.anInt1543) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface44 local212 = this.aClass102_Sub1_26.method21249(local110 / 2);
				local212.method29383(0, local110, this.aClass102_Sub1_26.aLong168);
				this.method14035(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass100_Sub2_1.anInt448 * -1548585779 + this.anInt1540;
				for (@Pc(139) int local139 = this.anInt1540; local139 <= this.anInt1541; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass100_Sub2_1.aShortArrayArray2[local136];
						if (local174 != null) {
							for (@Pc(178) int local178 = 0; local178 < local174.length; local178++) {
								local104.putShort(local174[local178]);
								local36++;
							}
						}
					}
					local136++;
				}
			}
			local110++;
		}
	}

	@OriginalMember(owner = "client!akd", name = "t", descriptor = "()V")
	void method14025() {
		this.anInterface44_2 = this.aClass102_Sub1_26.method21246(false);
		this.anInterface44_2.method29401(this.anInt1545);
		this.anInterface38_10 = this.aClass102_Sub1_26.method21239(false);
		this.anInterface38_10.method29327(this.anInt1546 * 16, 16);
		this.anInterface38_10.method29383(0, this.anInt1546 * 16, this.aClass102_Sub1_26.aLong168);
		this.anInterface44_2.method29383(0, this.anInt1545 * 2, this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1));
	}

	@OriginalMember(owner = "client!akd", name = "f", descriptor = "(IIIIII)V")
	void method14026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(28) int local28 = this.aClass100_Sub2_1.method2915(local11, local21, (byte) -67);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class80 local53 = this.aClass24_11.method560(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass102_Sub1_26.anUnsafe4;
				local59.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), ((Class80_Sub35) local53).aShort53);
				this.anInt1545++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1546;
		if (local1 != -1L) {
			this.aClass24_11.method563(new Class80_Sub35(local91), local1);
		}
		@Pc(114) float local114;
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(261) float local261;
		@Pc(271) float local271;
		@Pc(278) float local278;
		@Pc(285) float local285;
		@Pc(292) float local292;
		@Pc(301) float local301;
		@Pc(310) float local310;
		@Pc(319) float local319;
		if (arg4 == 0 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0][arg1];
			local121 = this.aFloatArrayArray17[arg0][arg1];
			local128 = this.aFloatArrayArray18[arg0][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local271 = (float) arg5 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local278 = this.aFloatArrayArray19[arg0][arg1];
			local285 = this.aFloatArrayArray17[arg0][arg1];
			local292 = this.aFloatArrayArray18[arg0][arg1];
			local301 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray18[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray19[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray19[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass80_Sub12_2.method13949((byte) 0) - local11;
		local271 = this.aClass80_Sub12_2.method13950(-2119812446) - local28;
		local278 = this.aClass80_Sub12_2.method13970(-2116430336) - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass80_Sub12_2.method13952(-432544427);
		local310 = 1.0F - local301 * local301;
		if (local310 < 0.0F) {
			local310 = 0.0F;
		}
		local319 = local261 * local114 + local271 * local121 + local278 * local128;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(538) float local538 = local319 * local310 * 2.0F;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass80_Sub12_2.method13953((byte) 5);
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(574) int local574 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(587) int local587 = (int) (local538 * (float) (local549 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(596) Unsafe local596 = this.aClass102_Sub1_26.anUnsafe4;
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16), (float) local11);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 8L, (float) local21);
		if (this.aClass102_Sub1_26.anInt2973 == 0) {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 15L, (byte) -1);
		this.anInt1546++;
		local596.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), local91);
		this.anInt1545++;
	}

	@OriginalMember(owner = "client!akd", name = "e", descriptor = "(Lclient!je;III[[ZZ)V")
	void method14027(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface44_2 == null || (this.anInt1540 > arg1 + arg3 || (this.anInt1541 < arg1 - arg3 || (this.anInt1542 > arg2 + arg3 || this.anInt1543 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1540; local36 <= this.anInt1541; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1542; local54 <= this.anInt1543; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method14035(arg0, this.anInterface44_2, this.anInt1545 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass102_Sub1_26.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1542;
		while (true) {
			if (local110 > this.anInt1543) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface44 local212 = this.aClass102_Sub1_26.method21249(local110 / 2);
				local212.method29383(0, local110, this.aClass102_Sub1_26.aLong168);
				this.method14035(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass100_Sub2_1.anInt448 * -1548585779 + this.anInt1540;
				for (@Pc(139) int local139 = this.anInt1540; local139 <= this.anInt1541; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass100_Sub2_1.aShortArrayArray2[local136];
						if (local174 != null) {
							for (@Pc(178) int local178 = 0; local178 < local174.length; local178++) {
								local104.putShort(local174[local178]);
								local36++;
							}
						}
					}
					local136++;
				}
			}
			local110++;
		}
	}

	@OriginalMember(owner = "client!akd", name = "l", descriptor = "()V")
	void method14028() {
		this.anInterface44_2 = this.aClass102_Sub1_26.method21246(false);
		this.anInterface44_2.method29401(this.anInt1545);
		this.anInterface38_10 = this.aClass102_Sub1_26.method21239(false);
		this.anInterface38_10.method29327(this.anInt1546 * 16, 16);
		this.anInterface38_10.method29383(0, this.anInt1546 * 16, this.aClass102_Sub1_26.aLong168);
		this.anInterface44_2.method29383(0, this.anInt1545 * 2, this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1));
	}

	@OriginalMember(owner = "client!akd", name = "o", descriptor = "(IIIIII)V")
	void method14029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(28) int local28 = this.aClass100_Sub2_1.method2915(local11, local21, (byte) -24);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class80 local53 = this.aClass24_11.method560(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass102_Sub1_26.anUnsafe4;
				local59.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), ((Class80_Sub35) local53).aShort53);
				this.anInt1545++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1546;
		if (local1 != -1L) {
			this.aClass24_11.method563(new Class80_Sub35(local91), local1);
		}
		@Pc(114) float local114;
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(261) float local261;
		@Pc(271) float local271;
		@Pc(278) float local278;
		@Pc(285) float local285;
		@Pc(292) float local292;
		@Pc(301) float local301;
		@Pc(310) float local310;
		@Pc(319) float local319;
		if (arg4 == 0 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0][arg1];
			local121 = this.aFloatArrayArray17[arg0][arg1];
			local128 = this.aFloatArrayArray18[arg0][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local271 = (float) arg5 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local278 = this.aFloatArrayArray19[arg0][arg1];
			local285 = this.aFloatArrayArray17[arg0][arg1];
			local292 = this.aFloatArrayArray18[arg0][arg1];
			local301 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray18[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray19[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray19[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass80_Sub12_2.method13949((byte) 0) - local11;
		local271 = this.aClass80_Sub12_2.method13950(-2103416482) - local28;
		local278 = this.aClass80_Sub12_2.method13970(-1537217030) - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass80_Sub12_2.method13952(-432544427);
		local310 = 1.0F - local301 * local301;
		if (local310 < 0.0F) {
			local310 = 0.0F;
		}
		local319 = local261 * local114 + local271 * local121 + local278 * local128;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(538) float local538 = local319 * local310 * 2.0F;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass80_Sub12_2.method13953((byte) 75);
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(574) int local574 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(587) int local587 = (int) (local538 * (float) (local549 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(596) Unsafe local596 = this.aClass102_Sub1_26.anUnsafe4;
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16), (float) local11);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 8L, (float) local21);
		if (this.aClass102_Sub1_26.anInt2973 == 0) {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 15L, (byte) -1);
		this.anInt1546++;
		local596.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), local91);
		this.anInt1545++;
	}

	@OriginalMember(owner = "client!akd", name = "g", descriptor = "()V")
	void method14030() {
		this.anInterface44_2 = this.aClass102_Sub1_26.method21246(false);
		this.anInterface44_2.method29401(this.anInt1545);
		this.anInterface38_10 = this.aClass102_Sub1_26.method21239(false);
		this.anInterface38_10.method29327(this.anInt1546 * 16, 16);
		this.anInterface38_10.method29383(0, this.anInt1546 * 16, this.aClass102_Sub1_26.aLong168);
		this.anInterface44_2.method29383(0, this.anInt1545 * 2, this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1));
	}

	@OriginalMember(owner = "client!akd", name = "i", descriptor = "()V")
	void method14031() {
		this.anInterface44_2 = this.aClass102_Sub1_26.method21246(false);
		this.anInterface44_2.method29401(this.anInt1545);
		this.anInterface38_10 = this.aClass102_Sub1_26.method21239(false);
		this.anInterface38_10.method29327(this.anInt1546 * 16, 16);
		this.anInterface38_10.method29383(0, this.anInt1546 * 16, this.aClass102_Sub1_26.aLong168);
		this.anInterface44_2.method29383(0, this.anInt1545 * 2, this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1));
	}

	@OriginalMember(owner = "client!akd", name = "m", descriptor = "(IIIIII)V")
	void method14032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass100_Sub2_1.anInt445 * -615169581);
		@Pc(28) int local28 = this.aClass100_Sub2_1.method2915(local11, local21, (byte) -100);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class80 local53 = this.aClass24_11.method560(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass102_Sub1_26.anUnsafe4;
				local59.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), ((Class80_Sub35) local53).aShort53);
				this.anInt1545++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1546;
		if (local1 != -1L) {
			this.aClass24_11.method563(new Class80_Sub35(local91), local1);
		}
		@Pc(114) float local114;
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(261) float local261;
		@Pc(271) float local271;
		@Pc(278) float local278;
		@Pc(285) float local285;
		@Pc(292) float local292;
		@Pc(301) float local301;
		@Pc(310) float local310;
		@Pc(319) float local319;
		if (arg4 == 0 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0][arg1];
			local121 = this.aFloatArrayArray17[arg0][arg1];
			local128 = this.aFloatArrayArray18[arg0][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == 0) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1];
		} else if (arg4 == this.aClass100_Sub2_1.anInt447 * -1174710433 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass100_Sub2_1.anInt447 * -1174710433) {
			local114 = this.aFloatArrayArray19[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray17[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray18[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local271 = (float) arg5 / (float) (this.aClass100_Sub2_1.anInt447 * -1174710433);
			local278 = this.aFloatArrayArray19[arg0][arg1];
			local285 = this.aFloatArrayArray17[arg0][arg1];
			local292 = this.aFloatArrayArray18[arg0][arg1];
			local301 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray17[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray18[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray19[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray19[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass80_Sub12_2.method13949((byte) 0) - local11;
		local271 = this.aClass80_Sub12_2.method13950(-1722728117) - local28;
		local278 = this.aClass80_Sub12_2.method13970(1389212192) - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass80_Sub12_2.method13952(-432544427);
		local310 = 1.0F - local301 * local301;
		if (local310 < 0.0F) {
			local310 = 0.0F;
		}
		local319 = local261 * local114 + local271 * local121 + local278 * local128;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(538) float local538 = local319 * local310 * 2.0F;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass80_Sub12_2.method13953((byte) 22);
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(574) int local574 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(587) int local587 = (int) (local538 * (float) (local549 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(596) Unsafe local596 = this.aClass102_Sub1_26.anUnsafe4;
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16), (float) local11);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 8L, (float) local21);
		if (this.aClass102_Sub1_26.anInt2973 == 0) {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass102_Sub1_26.aLong168 + (long) (this.anInt1546 * 16) + 15L, (byte) -1);
		this.anInt1546++;
		local596.putShort(this.aClass102_Sub1_26.aLong168 + (long) (this.aClass102_Sub1_26.anInt2956 >> 1) + (long) (this.anInt1545 * 2), local91);
		this.anInt1545++;
	}

	@OriginalMember(owner = "client!akd", name = "s", descriptor = "(Lclient!je;Lclient!mv;I)V")
	void method14033(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1107 = 0;
		arg0.anInt1108 = this.anInt1546;
		arg0.anInt1105 = 0;
		arg0.anInt1109 = this.anInt1545 / 3;
		arg0.anInterface34_8 = this.aClass102_Sub1_26.anInterface34_23;
		@Pc(25) float local25 = this.aClass80_Sub12_2.method13954(1868118281);
		arg0.aClass463_21.method29477(local25, local25, local25);
		this.aClass102_Sub1_26.method21250(0, this.anInterface38_10);
		this.aClass102_Sub1_26.method21158(this.aClass102_Sub1_26.aClass135_22);
		this.aClass102_Sub1_26.method21251(this.anInterface44_2);
		arg0.method9396(0);
	}

	@OriginalMember(owner = "client!akd", name = "a", descriptor = "(Lclient!je;Lclient!mv;I)V")
	void method14034(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1107 = 0;
		arg0.anInt1108 = this.anInt1546;
		arg0.anInt1105 = 0;
		arg0.anInt1109 = this.anInt1545 / 3;
		arg0.anInterface34_8 = this.aClass102_Sub1_26.anInterface34_23;
		@Pc(25) float local25 = this.aClass80_Sub12_2.method13954(1993013873);
		arg0.aClass463_21.method29477(local25, local25, local25);
		this.aClass102_Sub1_26.method21250(0, this.anInterface38_10);
		this.aClass102_Sub1_26.method21158(this.aClass102_Sub1_26.aClass135_22);
		this.aClass102_Sub1_26.method21251(this.anInterface44_2);
		arg0.method9396(0);
	}

	@OriginalMember(owner = "client!akd", name = "u", descriptor = "(Lclient!je;Lclient!mv;I)V")
	void method14035(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1107 = 0;
		arg0.anInt1108 = this.anInt1546;
		arg0.anInt1105 = 0;
		arg0.anInt1109 = this.anInt1545 / 3;
		arg0.anInterface34_8 = this.aClass102_Sub1_26.anInterface34_23;
		@Pc(25) float local25 = this.aClass80_Sub12_2.method13954(1767257200);
		arg0.aClass463_21.method29477(local25, local25, local25);
		this.aClass102_Sub1_26.method21250(0, this.anInterface38_10);
		this.aClass102_Sub1_26.method21158(this.aClass102_Sub1_26.aClass135_22);
		this.aClass102_Sub1_26.method21251(this.anInterface44_2);
		arg0.method9396(0);
	}

	@OriginalMember(owner = "client!akd", name = "x", descriptor = "(Lclient!je;Lclient!mv;I)V")
	void method14036(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1107 = 0;
		arg0.anInt1108 = this.anInt1546;
		arg0.anInt1105 = 0;
		arg0.anInt1109 = this.anInt1545 / 3;
		arg0.anInterface34_8 = this.aClass102_Sub1_26.anInterface34_23;
		@Pc(25) float local25 = this.aClass80_Sub12_2.method13954(1976478966);
		arg0.aClass463_21.method29477(local25, local25, local25);
		this.aClass102_Sub1_26.method21250(0, this.anInterface38_10);
		this.aClass102_Sub1_26.method21158(this.aClass102_Sub1_26.aClass135_22);
		this.aClass102_Sub1_26.method21251(this.anInterface44_2);
		arg0.method9396(0);
	}

	@OriginalMember(owner = "client!akd", name = "z", descriptor = "(Lclient!je;Lclient!mv;I)V")
	void method14037(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1107 = 0;
		arg0.anInt1108 = this.anInt1546;
		arg0.anInt1105 = 0;
		arg0.anInt1109 = this.anInt1545 / 3;
		arg0.anInterface34_8 = this.aClass102_Sub1_26.anInterface34_23;
		@Pc(25) float local25 = this.aClass80_Sub12_2.method13954(1510959595);
		arg0.aClass463_21.method29477(local25, local25, local25);
		this.aClass102_Sub1_26.method21250(0, this.anInterface38_10);
		this.aClass102_Sub1_26.method21158(this.aClass102_Sub1_26.aClass135_22);
		this.aClass102_Sub1_26.method21251(this.anInterface44_2);
		arg0.method9396(0);
	}
}
