package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aez")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!aez", name = "g", descriptor = "I")
	static final int anInt455 = 1;

	@OriginalMember(owner = "client!aez", name = "i", descriptor = "I")
	static final int anInt457 = 74;

	@OriginalMember(owner = "client!aez", name = "am", descriptor = "[F")
	static final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!aez", name = "aq", descriptor = "Lclient!bm;")
	Class189 aClass189_1;

	@OriginalMember(owner = "client!aez", name = "k", descriptor = "I")
	int anInt452;

	@OriginalMember(owner = "client!aez", name = "x", descriptor = "I")
	int anInt453;

	@OriginalMember(owner = "client!aez", name = "ac", descriptor = "I")
	int anInt454;

	@OriginalMember(owner = "client!aez", name = "v", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!aez", name = "b", descriptor = "[Lclient!tn;")
	Class80[] aClass80Array4;

	@OriginalMember(owner = "client!aez", name = "ax", descriptor = "Lclient!bw;")
	Interface14 anInterface14_1;

	@OriginalMember(owner = "client!aez", name = "ay", descriptor = "Lclient!bm;")
	Class189 aClass189_2;

	@OriginalMember(owner = "client!aez", name = "ai", descriptor = "Lclient!bm;")
	Class189 aClass189_3;

	@OriginalMember(owner = "client!aez", name = "aj", descriptor = "I")
	int anInt458;

	@OriginalMember(owner = "client!aez", name = "ao", descriptor = "Lclient!bm;")
	Class189 aClass189_4;

	@OriginalMember(owner = "client!aez", name = "c", descriptor = "Lclient!aag;")
	Class8 aClass8_6 = new Class8();

	@OriginalMember(owner = "client!aez", name = "m", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_25;

	@OriginalMember(owner = "client!aez", name = "o", descriptor = "I")
	int anInt450;

	@OriginalMember(owner = "client!aez", name = "j", descriptor = "I")
	int anInt451;

	@OriginalMember(owner = "client!aez", name = "a", descriptor = "I")
	int anInt456;

	@OriginalMember(owner = "client!aez", name = "s", descriptor = "I")
	final int anInt459;

	@OriginalMember(owner = "client!aez", name = "p", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!aez", name = "r", descriptor = "[[[Lclient!aks;")
	Class80_Sub29[][][] aClass80_Sub29ArrayArrayArray1;

	@OriginalMember(owner = "client!aez", name = "d", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!aez", name = "z", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!aez", name = "q", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!aez", name = "h", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!aez", name = "w", descriptor = "[[S")
	short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!aez", name = "y", descriptor = "[[B")
	byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!aez", name = "ag", descriptor = "[[B")
	byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!aez", name = "ab", descriptor = "[[F")
	float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!aez", name = "al", descriptor = "[[F")
	float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!aez", name = "ah", descriptor = "[[F")
	float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!aez", name = "af", descriptor = "Lclient!aax;")
	Class24 aClass24_5;

	@OriginalMember(owner = "client!aez", name = "n", descriptor = "Lclient!cy;")
	Class219 aClass219_1;

	@OriginalMember(owner = "client!aez", name = "<init>", descriptor = "(Lclient!afm;IIII[[I[[II)V")
	Class100_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass102_Sub3_25 = arg0;
		this.anInt450 = this.anInt445 * -615169581 - 2;
		this.anInt451 = 0x1 << this.anInt450;
		this.anInt456 = arg1;
		this.anInt459 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass80_Sub29ArrayArrayArray1 = new Class80_Sub29[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.aByteArrayArray7 = new byte[arg3][arg4];
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		this.aFloatArrayArray5 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		this.aFloatArrayArray6 = new float[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
		for (@Pc(130) int local130 = 1; local130 < this.anInt446 * -1356799781; local130++) {
			for (@Pc(138) int local138 = 1; local138 < this.anInt448 * -1548585779; local138++) {
				@Pc(160) int local160 = arg6[local138 + 1][local130] - arg6[local138 - 1][local130];
				@Pc(176) int local176 = arg6[local138][local130 + 1] - arg6[local138][local130 - 1];
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + arg7 * 4 * arg7 + local176 * local176)));
				this.aFloatArrayArray4[local138][local130] = (float) local160 * local195;
				this.aFloatArrayArray5[local138][local130] = (float) (-arg7 * 2) * local195;
				this.aFloatArrayArray6[local138][local130] = (float) local176 * local195;
			}
		}
		this.aClass24_5 = new Class24(128);
		if ((this.anInt459 & 0x10) != 0) {
			this.aClass219_1 = new Class219(this.aClass102_Sub3_25, this);
		}
	}

	@OriginalMember(owner = "client!aez", name = "v", descriptor = "()V")
	@Override
	public void method2930() {
		if (this.anInt458 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt448 * -1548585779; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt446 * -1356799781; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray8[local18 - 1][local26] >> 2) + (this.aByteArrayArray8[local18 + 1][local26] >> 3) + (this.aByteArrayArray8[local18][local26 - 1] >> 2) + (this.aByteArrayArray8[local18][local26 + 1] >> 3) + (this.aByteArrayArray8[local18][local26] >> 1));
				}
			}
			this.aClass80Array4 = new Class80[this.aClass24_5.method572(825670323)];
			this.aClass24_5.method561(this.aClass80Array4, (byte) 27);
			for (local18 = 0; local18 < this.aClass80Array4.length; local18++) {
				((Class80_Sub29) this.aClass80Array4[local18]).method14366(this.anInt458);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local18 += 4;
			}
			if ((this.anInt459 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass102_Sub3_25.aNativeHeap2.f(this.anInt458 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class80_Sub29[] local156 = new Class80_Sub29[this.anInt458];
			@Pc(163) int local163 = Class548.method31273(this.anInt458 / 4, 978450465);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class24 local173 = new Class24(local163);
			@Pc(177) Class80_Sub29[] local177 = new Class80_Sub29[this.anInt454];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt448 * -1548585779; local179++) {
				for (local187 = 0; local187 < this.anInt446 * -1356799781; local187++) {
					if (this.anIntArrayArrayArray8[local179][local187] != null) {
						@Pc(208) Class80_Sub29[] local208 = this.aClass80_Sub29ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray9[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray7[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray12[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray8[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray4[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray5[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray6[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray4[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray5[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray6[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray4[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray5[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray6[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray5[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray6[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class80_Sub29 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray3[local187 * this.anInt448 * -1548585779 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt445 * -615169581) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt445 * -615169581) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt450;
							@Pc(498) int local498 = local488 >> this.anInt450;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt447 * -1174710433) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt447 * -1174710433 && local540 == this.anInt447 * -1174710433) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt447 * -1174710433 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt447 * -1174710433);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt447 * -1174710433);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt445 * -615169581);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt445 * -615169581);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt445 * -615169581));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class687.anIntArray524[local502 & 0xFF80 | local764];
								if ((this.anInt459 & 0x7) == 0) {
									local546 = this.aClass102_Sub3_25.aFloatArray21[0] * local552 + this.aClass102_Sub3_25.aFloatArray21[1] * local554 + this.aClass102_Sub3_25.aFloatArray21[2] * local556;
									local546 = this.aClass102_Sub3_25.aFloat72 + local546 * (local546 > 0.0F ? this.aClass102_Sub3_25.aFloat67 : this.aClass102_Sub3_25.aFloat68);
								}
							}
							@Pc(832) Class80 local832 = null;
							if ((local477 & this.anInt451 - 1) == 0 && (local488 & this.anInt451 - 1) == 0) {
								local832 = local173.method560(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class687.anIntArray524[local506 & 0xFF80 | local863];
									if ((this.anInt459 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass102_Sub3_25.aFloatArray21[0] * local552 + this.aClass102_Sub3_25.aFloatArray21[1] * local554 + this.aClass102_Sub3_25.aFloatArray21[2] * local556;
										local656 = this.aClass102_Sub3_25.aFloat72 + local546 * (local546 > 0.0F ? this.aClass102_Sub3_25.aFloat67 : this.aClass102_Sub3_25.aFloat68);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass102_Sub3_25.aBoolean129) {
									local152.l((float) local477);
									local152.l((float) (this.method2915(local477, local488, (byte) -8) + local514));
									local152.l((float) local488);
									local152.u((byte) (local882 >> 16));
									local152.u((byte) (local882 >> 8));
									local152.u((byte) local882);
									local152.u(-1);
									local152.l((float) local477);
									local152.l((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local152.l(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt459 & 0x7) != 0) {
										local152.l(local552);
										local152.l(local554);
										local152.l(local556);
									}
								} else {
									local152.g((float) local477);
									local152.g((float) (this.method2915(local477, local488, (byte) -50) + local514));
									local152.g((float) local488);
									local152.u((byte) (local882 >> 16));
									local152.u((byte) (local882 >> 8));
									local152.u((byte) local882);
									local152.u(-1);
									local152.g((float) local477);
									local152.g((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local152.g(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt459 & 0x7) != 0) {
										local152.g(local552);
										local152.g(local554);
										local152.g(local556);
									}
								}
								local426 = this.anInt452++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method563(new Class80_Sub35(local460[local462]), local532);
							} else {
								local460[local462] = ((Class80_Sub35) local832).aShort53;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong338 * 3209506792906532031L < local156[local426].aLong338 * 3209506792906532031L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method14369(local426, local544, local560, local546);
							}
							this.anInt453++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt452; local179++) {
				@Pc(1263) Class80_Sub29 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method14371(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt448 * -1548585779; local179++) {
				for (local187 = 0; local187 < this.anInt446 * -1356799781; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray3[local187 * this.anInt448 * -1548585779 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class80_Sub29 local1333 = local156[local1315];
							@Pc(1337) Class80_Sub29 local1337 = local156[local1322];
							@Pc(1341) Class80_Sub29 local1341 = local156[local1329];
							@Pc(1343) Class80_Sub29 local1343 = null;
							if (local1333 != null) {
								local1333.method14368(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method14368(local179, local187, local1302);
								if (local1343 == null || local1337.aLong338 * 3209506792906532031L < local1343.aLong338 * 3209506792906532031L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method14368(local179, local187, local1302);
								if (local1343 == null || local1341.aLong338 * 3209506792906532031L < local1343.aLong338 * 3209506792906532031L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method14371(local1315);
								}
								if (local1337 != null) {
									local1343.method14371(local1322);
								}
								if (local1341 != null) {
									local1343.method14371(local1329);
								}
								local1343.method14368(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.i();
			this.anInterface14_1 = this.aClass102_Sub3_25.method6426(local18, local147, local152.f(), false);
			if (this.anInterface14_1 instanceof Class95_Sub2) {
				local147.k();
			}
			this.aClass189_2 = new Class189(this.anInterface14_1, 5126, 3, 0);
			this.aClass189_3 = new Class189(this.anInterface14_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass189_4 = new Class189(this.anInterface14_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass189_4 = new Class189(this.anInterface14_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt459 & 0x7) != 0) {
				this.aClass189_1 = new Class189(this.anInterface14_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass80Array4.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass80Array4.length; local1510++) {
				@Pc(1521) Class80_Sub29 local1521 = (Class80_Sub29) this.aClass80Array4[local1510];
				local1508[local1510] = local1521.aLong338 * 3209506792906532031L;
				local1521.method14370(this.anInt452);
			}
			Class274.method26798(local1508, this.aClass80Array4, (byte) 3);
			if (this.aClass219_1 != null) {
				this.aClass219_1.method25880();
			}
		} else {
			this.aClass219_1 = null;
		}
		if ((this.anInt456 & 0x2) == 0) {
			this.anIntArrayArrayArray7 = null;
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray8 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass80_Sub29ArrayArrayArray1 = null;
		this.aByteArrayArray8 = null;
		this.aClass24_5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aez", name = "ai", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub3_25.anInt772;
		@Pc(22) Class80_Sub1_Sub10_Sub1 local22 = (Class80_Sub1_Sub10_Sub1) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub1 local31;
		if (local22 != null && local22.method23532(local19, local19)) {
			local31 = local22;
			local22.method23525();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_25, local19, local19);
		}
		local31.method23524(0, 0, local19, local19);
		this.method2957(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aez", name = "f", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_25.aClass235_6;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class80_Sub29[] local94 = this.aClass80_Sub29ArrayArrayArray1[arg0][arg1] = new Class80_Sub29[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt459 & 0x20) != 0 && local104 != -1 && local3.method26120(local104, 73831368).aBoolean758) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3686 * -1722392473) << 48 | (long) (arg10.anInt3685 * -692202347) << 42 | (long) (arg10.anInt3687 * 1682209477) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class80 local163;
			for (local163 = this.aClass24_5.method560(local158); local163 != null; local163 = this.aClass24_5.method558((byte) 0)) {
				@Pc(168) Class80_Sub29 local168 = (Class80_Sub29) local163;
				if (local168.anInt1637 == local104 && local168.aFloat144 == (float) local108 && local168.aClass229_4.method25996(arg10, (byte) -102)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class80_Sub29(this, local104, local108, arg10);
				this.aClass24_5.method563(local94[local96], local158);
			} else {
				local94[local96] = (Class80_Sub29) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt454) {
			this.anInt454 = arg6.length;
		}
		this.anInt458 += arg6.length;
	}

	@OriginalMember(owner = "client!aez", name = "e", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2938(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aez", name = "u", descriptor = "()V")
	@Override
	public void method2912() {
		if (this.anInt458 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt448 * -1548585779 + 1][this.anInt446 * -1356799781 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt448 * -1548585779; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt446 * -1356799781; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray8[local18 - 1][local26] >> 2) + (this.aByteArrayArray8[local18 + 1][local26] >> 3) + (this.aByteArrayArray8[local18][local26 - 1] >> 2) + (this.aByteArrayArray8[local18][local26 + 1] >> 3) + (this.aByteArrayArray8[local18][local26] >> 1));
				}
			}
			this.aClass80Array4 = new Class80[this.aClass24_5.method572(-430118968)];
			this.aClass24_5.method561(this.aClass80Array4, (byte) 103);
			for (local18 = 0; local18 < this.aClass80Array4.length; local18++) {
				((Class80_Sub29) this.aClass80Array4[local18]).method14366(this.anInt458);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local18 += 4;
			}
			if ((this.anInt459 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass102_Sub3_25.aNativeHeap2.f(this.anInt458 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class80_Sub29[] local156 = new Class80_Sub29[this.anInt458];
			@Pc(163) int local163 = Class548.method31273(this.anInt458 / 4, -1520661352);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class24 local173 = new Class24(local163);
			@Pc(177) Class80_Sub29[] local177 = new Class80_Sub29[this.anInt454];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt448 * -1548585779; local179++) {
				for (local187 = 0; local187 < this.anInt446 * -1356799781; local187++) {
					if (this.anIntArrayArrayArray8[local179][local187] != null) {
						@Pc(208) Class80_Sub29[] local208 = this.aClass80_Sub29ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray9[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray7[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray12[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray8[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray4[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray5[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray6[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray4[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray5[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray6[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray4[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray5[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray6[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray5[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray6[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class80_Sub29 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray3[local187 * this.anInt448 * -1548585779 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt445 * -615169581) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt445 * -615169581) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt450;
							@Pc(498) int local498 = local488 >> this.anInt450;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt447 * -1174710433) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt447 * -1174710433 && local540 == this.anInt447 * -1174710433) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt447 * -1174710433 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt447 * -1174710433);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt447 * -1174710433);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt445 * -615169581);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt445 * -615169581);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt445 * -615169581));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class687.anIntArray524[local502 & 0xFF80 | local764];
								if ((this.anInt459 & 0x7) == 0) {
									local546 = this.aClass102_Sub3_25.aFloatArray21[0] * local552 + this.aClass102_Sub3_25.aFloatArray21[1] * local554 + this.aClass102_Sub3_25.aFloatArray21[2] * local556;
									local546 = this.aClass102_Sub3_25.aFloat72 + local546 * (local546 > 0.0F ? this.aClass102_Sub3_25.aFloat67 : this.aClass102_Sub3_25.aFloat68);
								}
							}
							@Pc(832) Class80 local832 = null;
							if ((local477 & this.anInt451 - 1) == 0 && (local488 & this.anInt451 - 1) == 0) {
								local832 = local173.method560(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class687.anIntArray524[local506 & 0xFF80 | local863];
									if ((this.anInt459 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass102_Sub3_25.aFloatArray21[0] * local552 + this.aClass102_Sub3_25.aFloatArray21[1] * local554 + this.aClass102_Sub3_25.aFloatArray21[2] * local556;
										local656 = this.aClass102_Sub3_25.aFloat72 + local546 * (local546 > 0.0F ? this.aClass102_Sub3_25.aFloat67 : this.aClass102_Sub3_25.aFloat68);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass102_Sub3_25.aBoolean129) {
									local152.l((float) local477);
									local152.l((float) (this.method2915(local477, local488, (byte) -117) + local514));
									local152.l((float) local488);
									local152.u((byte) (local882 >> 16));
									local152.u((byte) (local882 >> 8));
									local152.u((byte) local882);
									local152.u(-1);
									local152.l((float) local477);
									local152.l((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local152.l(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt459 & 0x7) != 0) {
										local152.l(local552);
										local152.l(local554);
										local152.l(local556);
									}
								} else {
									local152.g((float) local477);
									local152.g((float) (this.method2915(local477, local488, (byte) -78) + local514));
									local152.g((float) local488);
									local152.u((byte) (local882 >> 16));
									local152.u((byte) (local882 >> 8));
									local152.u((byte) local882);
									local152.u(-1);
									local152.g((float) local477);
									local152.g((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local152.g(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt459 & 0x7) != 0) {
										local152.g(local552);
										local152.g(local554);
										local152.g(local556);
									}
								}
								local426 = this.anInt452++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method563(new Class80_Sub35(local460[local462]), local532);
							} else {
								local460[local462] = ((Class80_Sub35) local832).aShort53;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong338 * 3209506792906532031L < local156[local426].aLong338 * 3209506792906532031L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method14369(local426, local544, local560, local546);
							}
							this.anInt453++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt452; local179++) {
				@Pc(1263) Class80_Sub29 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method14371(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt448 * -1548585779; local179++) {
				for (local187 = 0; local187 < this.anInt446 * -1356799781; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray3[local187 * this.anInt448 * -1548585779 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class80_Sub29 local1333 = local156[local1315];
							@Pc(1337) Class80_Sub29 local1337 = local156[local1322];
							@Pc(1341) Class80_Sub29 local1341 = local156[local1329];
							@Pc(1343) Class80_Sub29 local1343 = null;
							if (local1333 != null) {
								local1333.method14368(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method14368(local179, local187, local1302);
								if (local1343 == null || local1337.aLong338 * 3209506792906532031L < local1343.aLong338 * 3209506792906532031L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method14368(local179, local187, local1302);
								if (local1343 == null || local1341.aLong338 * 3209506792906532031L < local1343.aLong338 * 3209506792906532031L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method14371(local1315);
								}
								if (local1337 != null) {
									local1343.method14371(local1322);
								}
								if (local1341 != null) {
									local1343.method14371(local1329);
								}
								local1343.method14368(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.i();
			this.anInterface14_1 = this.aClass102_Sub3_25.method6426(local18, local147, local152.f(), false);
			if (this.anInterface14_1 instanceof Class95_Sub2) {
				local147.k();
			}
			this.aClass189_2 = new Class189(this.anInterface14_1, 5126, 3, 0);
			this.aClass189_3 = new Class189(this.anInterface14_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass189_4 = new Class189(this.anInterface14_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass189_4 = new Class189(this.anInterface14_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt459 & 0x7) != 0) {
				this.aClass189_1 = new Class189(this.anInterface14_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass80Array4.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass80Array4.length; local1510++) {
				@Pc(1521) Class80_Sub29 local1521 = (Class80_Sub29) this.aClass80Array4[local1510];
				local1508[local1510] = local1521.aLong338 * 3209506792906532031L;
				local1521.method14370(this.anInt452);
			}
			Class274.method26798(local1508, this.aClass80Array4, (byte) -56);
			if (this.aClass219_1 != null) {
				this.aClass219_1.method25880();
			}
		} else {
			this.aClass219_1 = null;
		}
		if ((this.anInt456 & 0x2) == 0) {
			this.anIntArrayArrayArray7 = null;
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray8 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass80_Sub29ArrayArrayArray1 = null;
		this.aByteArrayArray8 = null;
		this.aClass24_5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aez", name = "l", descriptor = "(III[[ZZI)V")
	@Override
	public void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2964(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aez", name = "k", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2921(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25893(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "g", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class108 local4 = this.aClass102_Sub3_25.method20677(2088966489);
		if (this.anInt458 <= 0 || local4 == null) {
			return;
		}
		this.aClass102_Sub3_25.method6356();
		this.aClass102_Sub3_25.method6424(false);
		this.aClass102_Sub3_25.method6429(false);
		this.aClass102_Sub3_25.method6399(false);
		this.aClass102_Sub3_25.method6545(false);
		this.aClass102_Sub3_25.method6370(0);
		this.aClass102_Sub3_25.method6384(-2);
		this.aClass102_Sub3_25.method6339(null);
		aFloatArray6[0] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24036());
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24037());
		aFloatArray6[6] = 0.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 0.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method24036();
		aFloatArray6[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method24037();
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		aFloatArray6[0] = 1.0F;
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = 0.0F;
		aFloatArray6[6] = 1.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 1.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = 0.0F;
		aFloatArray6[13] = 0.0F;
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		if ((this.anInt459 & 0x7) == 0) {
			this.aClass102_Sub3_25.method6429(false);
		} else {
			this.aClass102_Sub3_25.method6429(true);
			this.aClass102_Sub3_25.method6367();
		}
		this.aClass102_Sub3_25.method6550(this.aClass189_2, this.aClass189_1, this.aClass189_3, this.aClass189_4);
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		} else {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.anInt3152 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class80_Sub36_Sub2 local297 = this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass102_Sub3_25.aBoolean129) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23155(local335[local339] & 0xFFFF, (byte) -108);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23385(local335[local339] & 0xFFFF, 1060557734);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class94_Sub2 local433 = new Class94_Sub2(this.aClass102_Sub3_25, 5123, local297.aByteArray61, local297.anInt3152 * -1380987821);
			this.aClass102_Sub3_25.method6379(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aez", name = "c", descriptor = "(III[[ZZI)V")
	@Override
	public void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2964(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aez", name = "ar", descriptor = "(Lclient!atc;II)V")
	void method2957(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass102_Sub3_25.anIntArray66.length < local16) {
			this.aClass102_Sub3_25.anIntArray66 = new int[local16];
			this.aClass102_Sub3_25.anIntArray69 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass102_Sub3_25.anIntArray66;
		@Pc(40) int[] local40 = this.aClass102_Sub3_25.anIntArray69;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass102_Sub3_25.anInt772;
			local40[local42] = local13[local42] >> this.aClass102_Sub3_25.anInt772;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aez", name = "x", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2922(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			return this.aClass219_1.method25879(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aez", name = "s", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2920(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25885(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "at", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2948(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25885(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "w", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2923(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_6.method232(new Class80_Sub6(this.aClass102_Sub3_25, this, arg0, arg1), 1016157421);
	}

	@OriginalMember(owner = "client!aez", name = "r", descriptor = "(III)V")
	@Override
	public void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aez", name = "q", descriptor = "(III)V")
	@Override
	public void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aez", name = "h", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2938(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aez", name = "n", descriptor = "(III[[ZZI)V")
	@Override
	public void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2964(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aez", name = "z", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2938(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aez", name = "a", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub3_25.anInt772;
		@Pc(22) Class80_Sub1_Sub10_Sub1 local22 = (Class80_Sub1_Sub10_Sub1) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub1 local31;
		if (local22 != null && local22.method23532(local19, local19)) {
			local31 = local22;
			local22.method23525();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_25, local19, local19);
		}
		local31.method23524(0, 0, local19, local19);
		this.method2957(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aez", name = "y", descriptor = "(III[[ZZI)V")
	@Override
	public void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2964(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aez", name = "d", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2938(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aez", name = "ah", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2945(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			return this.aClass219_1.method25879(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aez", name = "b", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class108 local4 = this.aClass102_Sub3_25.method20677(1596275957);
		if (this.anInt458 <= 0 || local4 == null) {
			return;
		}
		this.aClass102_Sub3_25.method6356();
		this.aClass102_Sub3_25.method6424(false);
		this.aClass102_Sub3_25.method6429(false);
		this.aClass102_Sub3_25.method6399(false);
		this.aClass102_Sub3_25.method6545(false);
		this.aClass102_Sub3_25.method6370(0);
		this.aClass102_Sub3_25.method6384(-2);
		this.aClass102_Sub3_25.method6339(null);
		aFloatArray6[0] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24036());
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24037());
		aFloatArray6[6] = 0.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 0.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method24036();
		aFloatArray6[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method24037();
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		aFloatArray6[0] = 1.0F;
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = 0.0F;
		aFloatArray6[6] = 1.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 1.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = 0.0F;
		aFloatArray6[13] = 0.0F;
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		if ((this.anInt459 & 0x7) == 0) {
			this.aClass102_Sub3_25.method6429(false);
		} else {
			this.aClass102_Sub3_25.method6429(true);
			this.aClass102_Sub3_25.method6367();
		}
		this.aClass102_Sub3_25.method6550(this.aClass189_2, this.aClass189_1, this.aClass189_3, this.aClass189_4);
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		} else {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.anInt3152 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class80_Sub36_Sub2 local297 = this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass102_Sub3_25.aBoolean129) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23155(local335[local339] & 0xFFFF, (byte) -10);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23385(local335[local339] & 0xFFFF, 1060557734);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class94_Sub2 local433 = new Class94_Sub2(this.aClass102_Sub3_25, 5123, local297.aByteArray61, local297.anInt3152 * -1380987821);
			this.aClass102_Sub3_25.method6379(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ax", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class108 local4 = this.aClass102_Sub3_25.method20677(1434531934);
		if (this.anInt458 <= 0 || local4 == null) {
			return;
		}
		this.aClass102_Sub3_25.method6356();
		this.aClass102_Sub3_25.method6424(false);
		this.aClass102_Sub3_25.method6429(false);
		this.aClass102_Sub3_25.method6399(false);
		this.aClass102_Sub3_25.method6545(false);
		this.aClass102_Sub3_25.method6370(0);
		this.aClass102_Sub3_25.method6384(-2);
		this.aClass102_Sub3_25.method6339(null);
		aFloatArray6[0] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24036());
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = (float) arg2 / ((float) (this.anInt447 * -1174710433) * 128.0F * (float) local4.method24037());
		aFloatArray6[6] = 0.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 0.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method24036();
		aFloatArray6[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method24037();
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		aFloatArray6[0] = 1.0F;
		aFloatArray6[1] = 0.0F;
		aFloatArray6[2] = 0.0F;
		aFloatArray6[3] = 0.0F;
		aFloatArray6[4] = 0.0F;
		aFloatArray6[5] = 0.0F;
		aFloatArray6[6] = 1.0F;
		aFloatArray6[7] = 0.0F;
		aFloatArray6[8] = 0.0F;
		aFloatArray6[9] = 1.0F;
		aFloatArray6[10] = 0.0F;
		aFloatArray6[11] = 0.0F;
		aFloatArray6[12] = 0.0F;
		aFloatArray6[13] = 0.0F;
		aFloatArray6[14] = 0.0F;
		aFloatArray6[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray6, 0);
		if ((this.anInt459 & 0x7) == 0) {
			this.aClass102_Sub3_25.method6429(false);
		} else {
			this.aClass102_Sub3_25.method6429(true);
			this.aClass102_Sub3_25.method6367();
		}
		this.aClass102_Sub3_25.method6550(this.aClass189_2, this.aClass189_1, this.aClass189_3, this.aClass189_4);
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		} else {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.anInt3152 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class80_Sub36_Sub2 local297 = this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass102_Sub3_25.aBoolean129) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23155(local335[local339] & 0xFFFF, (byte) -51);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt448 * -1548585779 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray3[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method23385(local335[local339] & 0xFFFF, 1060557734);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class94_Sub2 local433 = new Class94_Sub2(this.aClass102_Sub3_25, 5123, local297.aByteArray61, local297.anInt3152 * -1380987821);
			this.aClass102_Sub3_25.method6379(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aez", name = "au", descriptor = "(III[[ZZI)V")
	void method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array4 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass102_Sub3_25.anIntArray67.length < local12) {
			this.aClass102_Sub3_25.anIntArray67 = new int[local12];
		}
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt448 * -1548585779 - 1) {
			local67 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt446 * -1356799781 - 1) {
			local86 = this.anInt446 * -1356799781 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass102_Sub3_25.anIntArray67;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt448 * -1548585779 + local109;
				}
			}
		}
		this.aClass102_Sub3_25.method6383();
		this.aClass102_Sub3_25.method6429((this.anInt459 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass80Array4.length; local109++) {
			((Class80_Sub29) this.aClass80Array4[local109]).method14376(local107, local103);
		}
		if (!this.aClass8_6.method240(413271953)) {
			local109 = this.aClass102_Sub3_25.anInt800;
			@Pc(191) int local191 = this.aClass102_Sub3_25.anInt801;
			this.aClass102_Sub3_25.method20767(0, local191, this.aClass102_Sub3_25.anInt802);
			this.aClass102_Sub3_25.method6429(false);
			this.aClass102_Sub3_25.method6545(false);
			this.aClass102_Sub3_25.method6370(128);
			this.aClass102_Sub3_25.method6384(-2);
			this.aClass102_Sub3_25.method6339(this.aClass102_Sub3_25.aClass84_Sub1_2);
			this.aClass102_Sub3_25.method6389(8448, 7681);
			this.aClass102_Sub3_25.method6390(0, 34166, 770);
			this.aClass102_Sub3_25.method6391(0, 34167, 770);
			for (@Pc(243) Class80 local243 = this.aClass8_6.method247(129206984); local243 != null; local243 = this.aClass8_6.method237(-501715530)) {
				@Pc(248) Class80_Sub6 local248 = (Class80_Sub6) local243;
				local248.method13151(arg0, arg1, arg2, arg3);
			}
			this.aClass102_Sub3_25.method6390(0, 5890, 768);
			this.aClass102_Sub3_25.method6391(0, 5890, 770);
			this.aClass102_Sub3_25.method6339(null);
			this.aClass102_Sub3_25.method20767(local109, local191, this.aClass102_Sub3_25.anInt802);
		}
		if (this.aClass219_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass102_Sub3_25.method6550(this.aClass189_2, null, null, this.aClass189_4);
		this.aClass219_1.method25890(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aez", name = "ay", descriptor = "(IILclient!arx;)Lclient!arx;")
	@Override
	public Class80_Sub1_Sub10 method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt447 * -1174710433 >> this.aClass102_Sub3_25.anInt772;
		@Pc(22) Class80_Sub1_Sub10_Sub1 local22 = (Class80_Sub1_Sub10_Sub1) arg2;
		@Pc(31) Class80_Sub1_Sub10_Sub1 local31;
		if (local22 != null && local22.method23532(local19, local19)) {
			local31 = local22;
			local22.method23525();
		} else {
			local31 = new Class80_Sub1_Sub10_Sub1(this.aClass102_Sub3_25, local19, local19);
		}
		local31.method23524(0, 0, local19, local19);
		this.method2957(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aez", name = "aq", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2935(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25893(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ao", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2909(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25893(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "aj", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2944(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25893(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ac", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2939(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25893(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ag", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2933(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_6.method232(new Class80_Sub6(this.aClass102_Sub3_25, this, arg0, arg1), 321775274);
	}

	@OriginalMember(owner = "client!aez", name = "p", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class235 local3 = this.aClass102_Sub3_25.aClass235_6;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt448 * -1548585779][this.anInt446 * -1356799781][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class80_Sub29[] local94 = this.aClass80_Sub29ArrayArrayArray1[arg0][arg1] = new Class80_Sub29[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt459 & 0x20) != 0 && local104 != -1 && local3.method26120(local104, 73831368).aBoolean758) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3686 * -1722392473) << 48 | (long) (arg10.anInt3685 * -692202347) << 42 | (long) (arg10.anInt3687 * 1682209477) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class80 local163;
			for (local163 = this.aClass24_5.method560(local158); local163 != null; local163 = this.aClass24_5.method558((byte) 0)) {
				@Pc(168) Class80_Sub29 local168 = (Class80_Sub29) local163;
				if (local168.anInt1637 == local104 && local168.aFloat144 == (float) local108 && local168.aClass229_4.method25996(arg10, (byte) -79)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class80_Sub29(this, local104, local108, arg10);
				this.aClass24_5.method563(local94[local96], local158);
			} else {
				local94[local96] = (Class80_Sub29) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt454) {
			this.anInt454 = arg6.length;
		}
		this.anInt458 += arg6.length;
	}

	@OriginalMember(owner = "client!aez", name = "al", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2942(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_6.method232(new Class80_Sub6(this.aClass102_Sub3_25, this, arg0, arg1), 49404077);
	}

	@OriginalMember(owner = "client!aez", name = "am", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2947(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25885(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "az", descriptor = "(III[[ZZI)V")
	void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array4 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass102_Sub3_25.anIntArray67.length < local12) {
			this.aClass102_Sub3_25.anIntArray67 = new int[local12];
		}
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt448 * -1548585779 - 1) {
			local67 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt446 * -1356799781 - 1) {
			local86 = this.anInt446 * -1356799781 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass102_Sub3_25.anIntArray67;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt448 * -1548585779 + local109;
				}
			}
		}
		this.aClass102_Sub3_25.method6383();
		this.aClass102_Sub3_25.method6429((this.anInt459 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass80Array4.length; local109++) {
			((Class80_Sub29) this.aClass80Array4[local109]).method14376(local107, local103);
		}
		if (!this.aClass8_6.method240(571298101)) {
			local109 = this.aClass102_Sub3_25.anInt800;
			@Pc(191) int local191 = this.aClass102_Sub3_25.anInt801;
			this.aClass102_Sub3_25.method20767(0, local191, this.aClass102_Sub3_25.anInt802);
			this.aClass102_Sub3_25.method6429(false);
			this.aClass102_Sub3_25.method6545(false);
			this.aClass102_Sub3_25.method6370(128);
			this.aClass102_Sub3_25.method6384(-2);
			this.aClass102_Sub3_25.method6339(this.aClass102_Sub3_25.aClass84_Sub1_2);
			this.aClass102_Sub3_25.method6389(8448, 7681);
			this.aClass102_Sub3_25.method6390(0, 34166, 770);
			this.aClass102_Sub3_25.method6391(0, 34167, 770);
			for (@Pc(243) Class80 local243 = this.aClass8_6.method247(129206984); local243 != null; local243 = this.aClass8_6.method237(-1081770100)) {
				@Pc(248) Class80_Sub6 local248 = (Class80_Sub6) local243;
				local248.method13151(arg0, arg1, arg2, arg3);
			}
			this.aClass102_Sub3_25.method6390(0, 5890, 768);
			this.aClass102_Sub3_25.method6391(0, 5890, 770);
			this.aClass102_Sub3_25.method6339(null);
			this.aClass102_Sub3_25.method20767(local109, local191, this.aClass102_Sub3_25.anInt802);
		}
		if (this.aClass219_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass102_Sub3_25.method6550(this.aClass189_2, null, null, this.aClass189_4);
		this.aClass219_1.method25890(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aez", name = "as", descriptor = "(III[[ZZI)V")
	void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array4 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass102_Sub3_25.anIntArray67.length < local12) {
			this.aClass102_Sub3_25.anIntArray67 = new int[local12];
		}
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt448 * -1548585779 - 1) {
			local67 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt446 * -1356799781 - 1) {
			local86 = this.anInt446 * -1356799781 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass102_Sub3_25.anIntArray67;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt448 * -1548585779 + local109;
				}
			}
		}
		this.aClass102_Sub3_25.method6383();
		this.aClass102_Sub3_25.method6429((this.anInt459 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass80Array4.length; local109++) {
			((Class80_Sub29) this.aClass80Array4[local109]).method14376(local107, local103);
		}
		if (!this.aClass8_6.method240(722612674)) {
			local109 = this.aClass102_Sub3_25.anInt800;
			@Pc(191) int local191 = this.aClass102_Sub3_25.anInt801;
			this.aClass102_Sub3_25.method20767(0, local191, this.aClass102_Sub3_25.anInt802);
			this.aClass102_Sub3_25.method6429(false);
			this.aClass102_Sub3_25.method6545(false);
			this.aClass102_Sub3_25.method6370(128);
			this.aClass102_Sub3_25.method6384(-2);
			this.aClass102_Sub3_25.method6339(this.aClass102_Sub3_25.aClass84_Sub1_2);
			this.aClass102_Sub3_25.method6389(8448, 7681);
			this.aClass102_Sub3_25.method6390(0, 34166, 770);
			this.aClass102_Sub3_25.method6391(0, 34167, 770);
			for (@Pc(243) Class80 local243 = this.aClass8_6.method247(129206984); local243 != null; local243 = this.aClass8_6.method237(-1011860245)) {
				@Pc(248) Class80_Sub6 local248 = (Class80_Sub6) local243;
				local248.method13151(arg0, arg1, arg2, arg3);
			}
			this.aClass102_Sub3_25.method6390(0, 5890, 768);
			this.aClass102_Sub3_25.method6391(0, 5890, 770);
			this.aClass102_Sub3_25.method6339(null);
			this.aClass102_Sub3_25.method20767(local109, local191, this.aClass102_Sub3_25.anInt802);
		}
		if (this.aClass219_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass102_Sub3_25.method6550(this.aClass189_2, null, null, this.aClass189_4);
		this.aClass219_1.method25890(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aez", name = "aw", descriptor = "(Lclient!atc;II)V")
	void method2961(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass102_Sub3_25.anIntArray66.length < local16) {
			this.aClass102_Sub3_25.anIntArray66 = new int[local16];
			this.aClass102_Sub3_25.anIntArray69 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass102_Sub3_25.anIntArray66;
		@Pc(40) int[] local40 = this.aClass102_Sub3_25.anIntArray69;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass102_Sub3_25.anInt772;
			local40[local42] = local13[local42] >> this.aClass102_Sub3_25.anInt772;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aez", name = "bg", descriptor = "(Lclient!atc;II)V")
	void method2962(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass102_Sub3_25.anIntArray66.length < local16) {
			this.aClass102_Sub3_25.anIntArray66 = new int[local16];
			this.aClass102_Sub3_25.anIntArray69 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass102_Sub3_25.anIntArray66;
		@Pc(40) int[] local40 = this.aClass102_Sub3_25.anIntArray69;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass102_Sub3_25.anInt772;
			local40[local42] = local13[local42] >> this.aClass102_Sub3_25.anInt772;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aez", name = "bl", descriptor = "(Lclient!atc;II)V")
	void method2963(@OriginalArg(0) Class80_Sub1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass102_Sub3_25.anIntArray66.length < local16) {
			this.aClass102_Sub3_25.anIntArray66 = new int[local16];
			this.aClass102_Sub3_25.anIntArray69 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass102_Sub3_25.anIntArray66;
		@Pc(40) int[] local40 = this.aClass102_Sub3_25.anIntArray69;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass102_Sub3_25.anInt772;
			local40[local42] = local13[local42] >> this.aClass102_Sub3_25.anInt772;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aez", name = "ab", descriptor = "(Lclient!akb;[I)V")
	@Override
	public void method2943(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_6.method232(new Class80_Sub6(this.aClass102_Sub3_25, this, arg0, arg1), 59762671);
	}

	@OriginalMember(owner = "client!aez", name = "t", descriptor = "(III)V")
	@Override
	public void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aez", name = "af", descriptor = "(Lclient!arx;IIIIZ)Z")
	@Override
	public boolean method2929(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			return this.aClass219_1.method25879(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ak", descriptor = "(Lclient!arx;IIIIZ)V")
	@Override
	public void method2940(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass219_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass102_Sub3_25.anInt781 >> 8) >> this.aClass102_Sub3_25.anInt772;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass102_Sub3_25.anInt769 >> 8) >> this.aClass102_Sub3_25.anInt772;
			this.aClass219_1.method25885(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aez", name = "ap", descriptor = "(III[[ZZI)V")
	void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass80Array4 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass102_Sub3_25.anIntArray67.length < local12) {
			this.aClass102_Sub3_25.anIntArray67 = new int[local12];
		}
		if (this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1.aByteArray61.length < this.anInt453 * 2) {
			this.aClass102_Sub3_25.aClass80_Sub36_Sub2_1 = new Class80_Sub36_Sub2(this.anInt453 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt448 * -1548585779 - 1) {
			local67 = this.anInt448 * -1548585779 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt446 * -1356799781 - 1) {
			local86 = this.anInt446 * -1356799781 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass102_Sub3_25.anIntArray67;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt448 * -1548585779 + local109;
				}
			}
		}
		this.aClass102_Sub3_25.method6383();
		this.aClass102_Sub3_25.method6429((this.anInt459 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass80Array4.length; local109++) {
			((Class80_Sub29) this.aClass80Array4[local109]).method14376(local107, local103);
		}
		if (!this.aClass8_6.method240(-610570719)) {
			local109 = this.aClass102_Sub3_25.anInt800;
			@Pc(191) int local191 = this.aClass102_Sub3_25.anInt801;
			this.aClass102_Sub3_25.method20767(0, local191, this.aClass102_Sub3_25.anInt802);
			this.aClass102_Sub3_25.method6429(false);
			this.aClass102_Sub3_25.method6545(false);
			this.aClass102_Sub3_25.method6370(128);
			this.aClass102_Sub3_25.method6384(-2);
			this.aClass102_Sub3_25.method6339(this.aClass102_Sub3_25.aClass84_Sub1_2);
			this.aClass102_Sub3_25.method6389(8448, 7681);
			this.aClass102_Sub3_25.method6390(0, 34166, 770);
			this.aClass102_Sub3_25.method6391(0, 34167, 770);
			for (@Pc(243) Class80 local243 = this.aClass8_6.method247(129206984); local243 != null; local243 = this.aClass8_6.method237(-1961638811)) {
				@Pc(248) Class80_Sub6 local248 = (Class80_Sub6) local243;
				local248.method13151(arg0, arg1, arg2, arg3);
			}
			this.aClass102_Sub3_25.method6390(0, 5890, 768);
			this.aClass102_Sub3_25.method6391(0, 5890, 770);
			this.aClass102_Sub3_25.method6339(null);
			this.aClass102_Sub3_25.method20767(local109, local191, this.aClass102_Sub3_25.anInt802);
		}
		if (this.aClass219_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass102_Sub3_25.method6550(this.aClass189_2, null, null, this.aClass189_4);
		this.aClass219_1.method25890(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}
}
