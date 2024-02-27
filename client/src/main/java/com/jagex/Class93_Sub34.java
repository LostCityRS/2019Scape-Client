package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!akx")
public final class Class93_Sub34 extends Class93 {

	@OriginalMember(owner = "client!akx", name = "d", descriptor = "I")
	int anInt1627 = 0;

	@OriginalMember(owner = "client!akx", name = "c", descriptor = "I")
	int anInt1628 = 0;

	@OriginalMember(owner = "client!akx", name = "r", descriptor = "I")
	int anInt1623 = 0;

	@OriginalMember(owner = "client!akx", name = "k", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_27;

	@OriginalMember(owner = "client!akx", name = "w", descriptor = "Lclient!akf;")
	final Class93_Sub16 aClass93_Sub16_2;

	@OriginalMember(owner = "client!akx", name = "f", descriptor = "Lclient!aem;")
	final Class99_Sub3 aClass99_Sub3_2;

	@OriginalMember(owner = "client!akx", name = "l", descriptor = "I")
	int anInt1626;

	@OriginalMember(owner = "client!akx", name = "u", descriptor = "I")
	int anInt1625;

	@OriginalMember(owner = "client!akx", name = "z", descriptor = "I")
	int anInt1629;

	@OriginalMember(owner = "client!akx", name = "p", descriptor = "I")
	int anInt1624;

	@OriginalMember(owner = "client!akx", name = "s", descriptor = "[[F")
	float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!akx", name = "y", descriptor = "[[F")
	float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!akx", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!akx", name = "x", descriptor = "Lclient!aan;")
	Class16 aClass16_12;

	@OriginalMember(owner = "client!akx", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!akx", name = "o", descriptor = "Lclient!lr;")
	Interface37 anInterface37_11;

	@OriginalMember(owner = "client!akx", name = "v", descriptor = "Lclient!ml;")
	Interface40 anInterface40_2;

	@OriginalMember(owner = "client!akx", name = "<init>", descriptor = "(Lclient!afc;Lclient!aem;Lclient!akf;[I)V")
	Class93_Sub34(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class99_Sub3 arg1, @OriginalArg(2) Class93_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_Sub2_27 = arg0;
		this.aClass93_Sub16_2 = arg2;
		this.aClass99_Sub3_2 = arg1;
		@Pc(31) int local31 = this.aClass93_Sub16_2.method13523((byte) -58) - (arg1.anInt412 * -1678286317 >> 1);
		this.anInt1626 = this.aClass93_Sub16_2.method13520(-1309227700) - local31 >> arg1.anInt415 * -373302705;
		this.anInt1625 = this.aClass93_Sub16_2.method13520(-1215798149) + local31 >> arg1.anInt415 * -373302705;
		this.anInt1629 = this.aClass93_Sub16_2.method13522(1625548853) - local31 >> arg1.anInt415 * -373302705;
		this.anInt1624 = this.aClass93_Sub16_2.method13522(1076320910) + local31 >> arg1.anInt415 * -373302705;
		@Pc(91) int local91 = this.anInt1625 - this.anInt1626 + 1;
		@Pc(99) int local99 = this.anInt1624 - this.anInt1629 + 1;
		this.aFloatArrayArray18 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray19 = new float[local91 + 1][local99 + 1];
		this.aFloatArrayArray17 = new float[local91 + 1][local99 + 1];
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(184) int local184;
		@Pc(200) int local200;
		for (local128 = 0; local128 <= local99; local128++) {
			local136 = local128 + this.anInt1629;
			if (local136 > 0 && local136 < this.aClass99_Sub3_2.anInt413 * -143202029 - 1) {
				for (local149 = 0; local149 <= local91; local149++) {
					local157 = local149 + this.anInt1626;
					if (local157 > 0 && local157 < this.aClass99_Sub3_2.anInt414 * -1667858293 - 1) {
						local184 = arg1.method2482(local157 + 1, local136, -207336516) - arg1.method2482(local157 - 1, local136, -1639608102);
						local200 = arg1.method2482(local157, local136 + 1, -1245380983) - arg1.method2482(local157, local136 - 1, -1611995219);
						@Pc(215) float local215 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + 65536 + local200 * local200)));
						this.aFloatArrayArray18[local149][local128] = (float) local184 * local215;
						this.aFloatArrayArray19[local149][local128] = -256.0F * local215;
						this.aFloatArrayArray17[local149][local128] = (float) local200 * local215;
					}
				}
			}
		}
		local128 = 0;
		for (local136 = this.anInt1629; local136 <= this.anInt1624; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt413 * -143202029) {
				for (local149 = this.anInt1626; local149 <= this.anInt1625; local149++) {
					if (local149 >= 0 && local149 < arg1.anInt414 * -1667858293) {
						local157 = arg3[local128];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray12[local149][local136];
						if (local291 != null && local157 != 0) {
							if (local157 == 1) {
								for (local200 = 0; local200 < local291.length; local200 += 3) {
									if (local291[local200] != -1 && local291[local200 + 1] != -1 && local291[local200 + 2] != -1) {
										this.anInt1628 += 3;
									}
								}
							} else {
								this.anInt1628 += 3;
							}
						}
					}
					local128++;
				}
			} else {
				local128 += this.anInt1625 - this.anInt1626;
			}
		}
		if (this.anInt1628 > 0) {
			this.aClass16_12 = new Class16(Class134_Sub2.method10212(this.anInt1628, (byte) 86));
			this.aByteBuffer5 = this.aClass104_Sub2_27.aByteBuffer7;
			this.aByteBuffer5.clear();
			this.aByteBuffer5.position(this.aClass104_Sub2_27.anInt2915 >> 1);
			this.aByteBuffer5.slice();
			this.aByteBuffer5.position(0);
			this.aByteBuffer5.limit(this.aClass104_Sub2_27.anInt2915 >> 1);
			local136 = 0;
			local128 = 0;
			for (local149 = this.anInt1629; local149 <= this.anInt1624; local149++) {
				if (local149 >= 0 && local149 < arg1.anInt413 * -143202029) {
					local157 = 0;
					for (local184 = this.anInt1626; local184 <= this.anInt1625; local184++) {
						if (local184 >= 0 && local184 < arg1.anInt414 * -1667858293) {
							local200 = arg3[local128];
							@Pc(447) int[] local447 = arg1.anIntArrayArrayArray12[local184][local149];
							if (local447 != null && local200 != 0) {
								if (local200 == 1) {
									@Pc(461) int[] local461 = arg1.anIntArrayArrayArray11[local184][local149];
									@Pc(468) int[] local468 = arg1.anIntArrayArrayArray8[local184][local149];
									@Pc(470) int local470 = 0;
									label110: while (true) {
										while (true) {
											if (local470 >= local447.length) {
												break label110;
											}
											if (local447[local470] == -1 || local447[local470 + 1] == -1 || local447[local470 + 2] == -1) {
												local470 += 3;
											} else {
												this.method13953(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method13953(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
												this.method13953(local157, local136, local184, local149, local461[local470], local468[local470]);
												local470++;
											}
										}
									}
								} else if (local200 == 3) {
									this.method13953(local157, local136, local184, local149, 0, 0);
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, 0);
									this.method13953(local157, local136, local184, local149, 0, arg1.anInt412 * -1678286317);
								} else if (local200 == 2) {
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, 0);
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
									this.method13953(local157, local136, local184, local149, 0, 0);
								} else if (local200 == 5) {
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
									this.method13953(local157, local136, local184, local149, 0, arg1.anInt412 * -1678286317);
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, 0);
								} else if (local200 == 4) {
									this.method13953(local157, local136, local184, local149, 0, arg1.anInt412 * -1678286317);
									this.method13953(local157, local136, local184, local149, 0, 0);
									this.method13953(local157, local136, local184, local149, arg1.anInt412 * -1678286317, arg1.anInt412 * -1678286317);
								}
							}
						}
						local128++;
						local157++;
					}
				} else {
					local128 += this.anInt1625 - this.anInt1626;
				}
				local136++;
			}
			this.method13952();
		} else {
			this.anInterface37_11 = null;
			this.anInterface40_2 = null;
		}
		this.aClass16_12 = null;
		this.aFloatArrayArray17 = null;
		this.aFloatArrayArray19 = null;
		this.aFloatArrayArray18 = null;
	}

	@OriginalMember(owner = "client!akx", name = "e", descriptor = "()V")
	void method13952() {
		this.anInterface40_2 = this.aClass104_Sub2_27.method21007(false);
		this.anInterface40_2.method29532(this.anInt1623);
		this.anInterface37_11 = this.aClass104_Sub2_27.method21025(false);
		this.anInterface37_11.method29496(this.anInt1627 * 16, 16);
		this.anInterface37_11.method29514(0, this.anInt1627 * 16, this.aClass104_Sub2_27.aLong132);
		this.anInterface40_2.method29514(0, this.anInt1623 * 2, this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1));
	}

	@OriginalMember(owner = "client!akx", name = "n", descriptor = "(IIIIII)V")
	void method13953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass99_Sub3_2.anInt415 * -373302705);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass99_Sub3_2.anInt415 * -373302705);
		@Pc(28) int local28 = this.aClass99_Sub3_2.method2480(local11, local21, 704489502);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class93 local53 = this.aClass16_12.method215(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass104_Sub2_27.anUnsafe4;
				local59.putShort(this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1) + (long) (this.anInt1623 * 2), ((Class93_Sub20) local53).aShort98);
				this.anInt1623++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1627;
		if (local1 != -1L) {
			this.aClass16_12.method221(new Class93_Sub20(local91), local1);
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
			local114 = this.aFloatArrayArray18[arg0][arg1];
			local121 = this.aFloatArrayArray19[arg0][arg1];
			local128 = this.aFloatArrayArray17[arg0][arg1];
		} else if (arg4 == this.aClass99_Sub3_2.anInt412 * -1678286317 && arg5 == 0) {
			local114 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1];
		} else if (arg4 == this.aClass99_Sub3_2.anInt412 * -1678286317 && arg5 == this.aClass99_Sub3_2.anInt412 * -1678286317) {
			local114 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray19[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass99_Sub3_2.anInt412 * -1678286317) {
			local114 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray19[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass99_Sub3_2.anInt412 * -1678286317);
			local271 = (float) arg5 / (float) (this.aClass99_Sub3_2.anInt412 * -1678286317);
			local278 = this.aFloatArrayArray18[arg0][arg1];
			local285 = this.aFloatArrayArray19[arg0][arg1];
			local292 = this.aFloatArrayArray17[arg0][arg1];
			local301 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray17[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray19[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray19[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass93_Sub16_2.method13520(-2003807431) - local11;
		local271 = this.aClass93_Sub16_2.method13521(1655674161) - local28;
		local278 = this.aClass93_Sub16_2.method13522(1481646966) - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass93_Sub16_2.method13523((byte) -63);
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
		@Pc(549) int local549 = this.aClass93_Sub16_2.method13539((byte) -50);
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
		@Pc(596) Unsafe local596 = this.aClass104_Sub2_27.anUnsafe4;
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16), (float) local11);
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 8L, (float) local21);
		if (this.aClass104_Sub2_27.anInt2953 == 0) {
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 15L, (byte) -1);
		this.anInt1627++;
		local596.putShort(this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1) + (long) (this.anInt1623 * 2), local91);
		this.anInt1623++;
	}

	@OriginalMember(owner = "client!akx", name = "p", descriptor = "(Lclient!jj;III[[ZZ)V")
	void method13954(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface40_2 == null || (this.anInt1626 > arg1 + arg3 || (this.anInt1625 < arg1 - arg3 || (this.anInt1629 > arg2 + arg3 || this.anInt1624 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1626; local36 <= this.anInt1625; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1629; local54 <= this.anInt1624; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method13956(arg0, this.anInterface40_2, this.anInt1623 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass104_Sub2_27.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1629;
		while (true) {
			if (local110 > this.anInt1624) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface40 local212 = this.aClass104_Sub2_27.method20928(local110 / 2);
				local212.method29514(0, local110, this.aClass104_Sub2_27.aLong132);
				this.method13956(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass99_Sub3_2.anInt414 * -1667858293 + this.anInt1626;
				for (@Pc(139) int local139 = this.anInt1626; local139 <= this.anInt1625; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass99_Sub3_2.aShortArrayArray3[local136];
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

	@OriginalMember(owner = "client!akx", name = "m", descriptor = "(Lclient!jj;III[[ZZ)V")
	void method13955(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface40_2 == null || (this.anInt1626 > arg1 + arg3 || (this.anInt1625 < arg1 - arg3 || (this.anInt1629 > arg2 + arg3 || this.anInt1624 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1626; local36 <= this.anInt1625; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1629; local54 <= this.anInt1624; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method13956(arg0, this.anInterface40_2, this.anInt1623 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass104_Sub2_27.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1629;
		while (true) {
			if (local110 > this.anInt1624) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface40 local212 = this.aClass104_Sub2_27.method20928(local110 / 2);
				local212.method29514(0, local110, this.aClass104_Sub2_27.aLong132);
				this.method13956(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass99_Sub3_2.anInt414 * -1667858293 + this.anInt1626;
				for (@Pc(139) int local139 = this.anInt1626; local139 <= this.anInt1625; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass99_Sub3_2.aShortArrayArray3[local136];
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

	@OriginalMember(owner = "client!akx", name = "k", descriptor = "(Lclient!jj;Lclient!ml;I)V")
	void method13956(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Interface40 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1140 = 0;
		arg0.anInt1141 = this.anInt1627;
		arg0.anInt1138 = 0;
		arg0.anInt1137 = this.anInt1623 / 3;
		arg0.anInterface38_18 = this.aClass104_Sub2_27.anInterface38_23;
		@Pc(25) float local25 = this.aClass93_Sub16_2.method13525(1820491933);
		arg0.aClass472_38.method29718(local25, local25, local25);
		this.aClass104_Sub2_27.method21060(0, this.anInterface37_11);
		this.aClass104_Sub2_27.method21118(this.aClass104_Sub2_27.aClass145_22);
		this.aClass104_Sub2_27.method21042(this.anInterface40_2);
		arg0.method10103(0);
	}

	@OriginalMember(owner = "client!akx", name = "f", descriptor = "()V")
	void method13957() {
		this.anInterface40_2 = this.aClass104_Sub2_27.method21007(false);
		this.anInterface40_2.method29532(this.anInt1623);
		this.anInterface37_11 = this.aClass104_Sub2_27.method21025(false);
		this.anInterface37_11.method29496(this.anInt1627 * 16, 16);
		this.anInterface37_11.method29514(0, this.anInt1627 * 16, this.aClass104_Sub2_27.aLong132);
		this.anInterface40_2.method29514(0, this.anInt1623 * 2, this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1));
	}

	@OriginalMember(owner = "client!akx", name = "w", descriptor = "()V")
	void method13958() {
		this.anInterface40_2 = this.aClass104_Sub2_27.method21007(false);
		this.anInterface40_2.method29532(this.anInt1623);
		this.anInterface37_11 = this.aClass104_Sub2_27.method21025(false);
		this.anInterface37_11.method29496(this.anInt1627 * 16, 16);
		this.anInterface37_11.method29514(0, this.anInt1627 * 16, this.aClass104_Sub2_27.aLong132);
		this.anInterface40_2.method29514(0, this.anInt1623 * 2, this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1));
	}

	@OriginalMember(owner = "client!akx", name = "l", descriptor = "(IIIIII)V")
	void method13959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass99_Sub3_2.anInt415 * -373302705);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass99_Sub3_2.anInt415 * -373302705);
		@Pc(28) int local28 = this.aClass99_Sub3_2.method2480(local11, local21, 1612666417);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(53) Class93 local53 = this.aClass16_12.method215(local1);
			if (local53 != null) {
				@Pc(59) Unsafe local59 = this.aClass104_Sub2_27.anUnsafe4;
				local59.putShort(this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1) + (long) (this.anInt1623 * 2), ((Class93_Sub20) local53).aShort98);
				this.anInt1623++;
				return;
			}
		}
		@Pc(91) short local91 = (short) this.anInt1627;
		if (local1 != -1L) {
			this.aClass16_12.method221(new Class93_Sub20(local91), local1);
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
			local114 = this.aFloatArrayArray18[arg0][arg1];
			local121 = this.aFloatArrayArray19[arg0][arg1];
			local128 = this.aFloatArrayArray17[arg0][arg1];
		} else if (arg4 == this.aClass99_Sub3_2.anInt412 * -1678286317 && arg5 == 0) {
			local114 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local121 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1];
		} else if (arg4 == this.aClass99_Sub3_2.anInt412 * -1678286317 && arg5 == this.aClass99_Sub3_2.anInt412 * -1678286317) {
			local114 = this.aFloatArrayArray18[arg0 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray19[arg0 + 1][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass99_Sub3_2.anInt412 * -1678286317) {
			local114 = this.aFloatArrayArray18[arg0][arg1 + 1];
			local121 = this.aFloatArrayArray19[arg0][arg1 + 1];
			local128 = this.aFloatArrayArray17[arg0][arg1 + 1];
		} else {
			local261 = (float) arg4 / (float) (this.aClass99_Sub3_2.anInt412 * -1678286317);
			local271 = (float) arg5 / (float) (this.aClass99_Sub3_2.anInt412 * -1678286317);
			local278 = this.aFloatArrayArray18[arg0][arg1];
			local285 = this.aFloatArrayArray19[arg0][arg1];
			local292 = this.aFloatArrayArray17[arg0][arg1];
			local301 = this.aFloatArrayArray18[arg0 + 1][arg1];
			local310 = this.aFloatArrayArray19[arg0 + 1][arg1];
			local319 = this.aFloatArrayArray17[arg0 + 1][arg1];
			@Pc(334) float local334 = local278 + (this.aFloatArrayArray18[arg0][arg1 + 1] - local278) * local261;
			@Pc(349) float local349 = local285 + (this.aFloatArrayArray19[arg0][arg1 + 1] - local285) * local261;
			@Pc(364) float local364 = local292 + (this.aFloatArrayArray17[arg0][arg1 + 1] - local292) * local261;
			@Pc(381) float local381 = local301 + (this.aFloatArrayArray18[arg0 + 1][arg1 + 1] - local301) * local261;
			@Pc(398) float local398 = local310 + (this.aFloatArrayArray19[arg0 + 1][arg1 + 1] - local310) * local261;
			@Pc(415) float local415 = local319 + (this.aFloatArrayArray17[arg0 + 1][arg1 + 1] - local319) * local261;
			local114 = local334 + (local381 - local334) * local271;
			local121 = local349 + (local398 - local349) * local271;
			local128 = local364 + (local415 - local364) * local271;
		}
		local261 = this.aClass93_Sub16_2.method13520(794180692) - local11;
		local271 = this.aClass93_Sub16_2.method13521(1655674161) - local28;
		local278 = this.aClass93_Sub16_2.method13522(1887853384) - local21;
		local285 = (float) Math.sqrt((double) (local261 * local261 + local271 * local271 + local278 * local278));
		local292 = 1.0F / local285;
		local261 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass93_Sub16_2.method13523((byte) -117);
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
		@Pc(549) int local549 = this.aClass93_Sub16_2.method13539((byte) -26);
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
		@Pc(596) Unsafe local596 = this.aClass104_Sub2_27.anUnsafe4;
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16), (float) local11);
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 4L, (float) local28);
		local596.putFloat(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 8L, (float) local21);
		if (this.aClass104_Sub2_27.anInt2953 == 0) {
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 12L, (byte) local587);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 14L, (byte) local559);
		} else {
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 12L, (byte) local559);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 13L, (byte) local574);
			local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 14L, (byte) local587);
		}
		local596.putByte(this.aClass104_Sub2_27.aLong132 + (long) (this.anInt1627 * 16) + 15L, (byte) -1);
		this.anInt1627++;
		local596.putShort(this.aClass104_Sub2_27.aLong132 + (long) (this.aClass104_Sub2_27.anInt2915 >> 1) + (long) (this.anInt1623 * 2), local91);
		this.anInt1623++;
	}

	@OriginalMember(owner = "client!akx", name = "u", descriptor = "(Lclient!jj;III[[ZZ)V")
	void method13960(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface40_2 == null || (this.anInt1626 > arg1 + arg3 || (this.anInt1625 < arg1 - arg3 || (this.anInt1629 > arg2 + arg3 || this.anInt1624 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1626; local36 <= this.anInt1625; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1629; local54 <= this.anInt1624; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method13956(arg0, this.anInterface40_2, this.anInt1623 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass104_Sub2_27.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1629;
		while (true) {
			if (local110 > this.anInt1624) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface40 local212 = this.aClass104_Sub2_27.method20928(local110 / 2);
				local212.method29514(0, local110, this.aClass104_Sub2_27.aLong132);
				this.method13956(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass99_Sub3_2.anInt414 * -1667858293 + this.anInt1626;
				for (@Pc(139) int local139 = this.anInt1626; local139 <= this.anInt1625; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass99_Sub3_2.aShortArrayArray3[local136];
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

	@OriginalMember(owner = "client!akx", name = "z", descriptor = "(Lclient!jj;III[[ZZ)V")
	void method13961(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		if (this.anInterface40_2 == null || (this.anInt1626 > arg1 + arg3 || (this.anInt1625 < arg1 - arg3 || (this.anInt1629 > arg2 + arg3 || this.anInt1624 < arg2 - arg3)))) {
			return;
		}
		@Pc(36) int local36;
		if (arg5) {
			for (local36 = this.anInt1626; local36 <= this.anInt1625; local36++) {
				if (local36 - arg1 >= -arg3 && local36 - arg1 <= arg3) {
					for (@Pc(54) int local54 = this.anInt1629; local54 <= this.anInt1624; local54++) {
						if (local54 - arg2 >= -arg3 && local54 - arg2 <= arg3 && arg4[local36 - arg1 + arg3][local54 - arg2 + arg3]) {
							this.method13956(arg0, this.anInterface40_2, this.anInt1623 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		local36 = 0;
		@Pc(104) ByteBuffer local104 = this.aClass104_Sub2_27.aByteBuffer7;
		local104.clear();
		@Pc(110) int local110 = this.anInt1629;
		while (true) {
			if (local110 > this.anInt1624) {
				if (local104.position() == 0 || local36 == 0) {
					return;
				}
				local110 = local104.position();
				@Pc(212) Interface40 local212 = this.aClass104_Sub2_27.method20928(local110 / 2);
				local212.method29514(0, local110, this.aClass104_Sub2_27.aLong132);
				this.method13956(arg0, local212, local36 / 3);
				break;
			}
			if (local110 - arg2 >= -arg3 && local110 - arg2 <= arg3) {
				@Pc(136) int local136 = local110 * this.aClass99_Sub3_2.anInt414 * -1667858293 + this.anInt1626;
				for (@Pc(139) int local139 = this.anInt1626; local139 <= this.anInt1625; local139++) {
					if (local139 - arg1 >= -arg3 && local139 - arg1 <= arg3 && arg4[local139 - arg1 + arg3][local110 - arg2 + arg3]) {
						@Pc(174) short[] local174 = this.aClass99_Sub3_2.aShortArrayArray3[local136];
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

	@OriginalMember(owner = "client!akx", name = "d", descriptor = "(Lclient!jj;Lclient!ml;I)V")
	void method13962(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Interface40 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1140 = 0;
		arg0.anInt1141 = this.anInt1627;
		arg0.anInt1138 = 0;
		arg0.anInt1137 = this.anInt1623 / 3;
		arg0.anInterface38_18 = this.aClass104_Sub2_27.anInterface38_23;
		@Pc(25) float local25 = this.aClass93_Sub16_2.method13525(-327131268);
		arg0.aClass472_38.method29718(local25, local25, local25);
		this.aClass104_Sub2_27.method21060(0, this.anInterface37_11);
		this.aClass104_Sub2_27.method21118(this.aClass104_Sub2_27.aClass145_22);
		this.aClass104_Sub2_27.method21042(this.anInterface40_2);
		arg0.method10103(0);
	}

	@OriginalMember(owner = "client!akx", name = "c", descriptor = "(Lclient!jj;Lclient!ml;I)V")
	void method13963(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Interface40 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1140 = 0;
		arg0.anInt1141 = this.anInt1627;
		arg0.anInt1138 = 0;
		arg0.anInt1137 = this.anInt1623 / 3;
		arg0.anInterface38_18 = this.aClass104_Sub2_27.anInterface38_23;
		@Pc(25) float local25 = this.aClass93_Sub16_2.method13525(2009973564);
		arg0.aClass472_38.method29718(local25, local25, local25);
		this.aClass104_Sub2_27.method21060(0, this.anInterface37_11);
		this.aClass104_Sub2_27.method21118(this.aClass104_Sub2_27.aClass145_22);
		this.aClass104_Sub2_27.method21042(this.anInterface40_2);
		arg0.method10103(0);
	}
}
