package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class209 {

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "F")
	static float aFloat257;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!bw;")
	Interface14 anInterface14_7;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Lclient!bm;")
	Class189 aClass189_14;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!bm;")
	Class189 aClass189_15;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!bm;")
	Class189 aClass189_16;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "[F")
	float[] aFloatArray96 = new float[16];

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!asx;")
	Class80_Sub36_Sub2 aClass80_Sub36_Sub2_3 = new Class80_Sub36_Sub2(786336);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	final int anInt3594 = 64;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	final int anInt3595 = 768;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	final int anInt3596 = 1600;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	final int anInt3597 = Class702.method37107(1600, 221154893);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	final int anInt3598 = 64;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "[I")
	int[] anIntArray337 = new int[8191];

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "[I")
	int[] anIntArray338 = new int[1600];

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "[I")
	int[] anIntArray336 = new int[64];

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "[[Lclient!aqg;")
	Class147_Sub3_Sub1[][] aClass147_Sub3_Sub1ArrayArray2 = new Class147_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "[[Lclient!aqg;")
	Class147_Sub3_Sub1[][] aClass147_Sub3_Sub1ArrayArray1 = new Class147_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	int anInt3599 = 0;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	Class209() {
	}

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "(Lclient!afm;Lclient!db;)V")
	void method25788(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class221 arg1) {
		if (arg0.aClass487_28 == null) {
			return;
		}
		this.method25792(arg0);
		@Pc(12) float local12 = arg0.aClass487_28.aFloatArray114[2];
		@Pc(18) float local18 = arg0.aClass487_28.aFloatArray114[6];
		@Pc(24) float local24 = arg0.aClass487_28.aFloatArray114[10];
		@Pc(30) float local30 = arg0.aClass487_28.aFloatArray114[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class147_Sub3 local40 = arg1.aClass23_1.aClass147_Sub3_2;
			@Pc(43) Class147_Sub3 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass147_Sub3_7; local43 != local40; local43 = local43.aClass147_Sub3_7) {
				@Pc(49) Class147_Sub3_Sub1 local49 = (Class147_Sub3_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3247 >> 12) + local18 * (float) (local49.anInt3248 >> 12) + local24 * (float) (local49.anInt3251 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray337[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class702.method37107(local100, 221154893) + 1 - this.anInt3597;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass147_Sub3_7;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3599 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray338[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray336[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class147_Sub3_Sub1 local171 = (Class147_Sub3_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3244;
						local133 = local171.aBoolean636;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3244 || local133 != local171.aBoolean636)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray337[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray338[local204] < 64) {
							this.aClass147_Sub3_Sub1ArrayArray2[local204][this.anIntArray338[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray338[local204] == 64) {
									if (this.anInt3599 == 64) {
										break label91;
									}
									this.anIntArray338[local204] += this.anInt3599++ + 1;
								}
								this.aClass147_Sub3_Sub1ArrayArray1[this.anIntArray338[local204] - 64 - 1][this.anIntArray336[this.anIntArray338[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass147_Sub3_7;
				}
				if (local131 >= 0) {
					arg0.method6384(local131);
				} else {
					arg0.method6384(-1);
				}
				if (local133 && arg0.aFloat72 != aFloat257) {
					arg0.method20801(aFloat257);
				} else if (arg0.aFloat72 != 1.0F) {
					arg0.method20801(1.0F);
				}
				this.method25791(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25793(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "(Lclient!afm;)V")
	void method25789(@OriginalArg(0) Class102_Sub3 arg0) {
		this.anInterface14_7 = arg0.method6375(24, null, 196584, true);
		this.aClass189_15 = new Class189(this.anInterface14_7, 5126, 2, 0);
		this.aClass189_14 = new Class189(this.anInterface14_7, 5126, 3, 8);
		this.aClass189_16 = new Class189(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(Lclient!afm;Lclient!db;)V")
	void method25790(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class221 arg1) {
		if (arg0.aClass487_28 == null) {
			return;
		}
		this.method25792(arg0);
		@Pc(12) float local12 = arg0.aClass487_28.aFloatArray114[2];
		@Pc(18) float local18 = arg0.aClass487_28.aFloatArray114[6];
		@Pc(24) float local24 = arg0.aClass487_28.aFloatArray114[10];
		@Pc(30) float local30 = arg0.aClass487_28.aFloatArray114[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class147_Sub3 local40 = arg1.aClass23_1.aClass147_Sub3_2;
			@Pc(43) Class147_Sub3 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass147_Sub3_7; local43 != local40; local43 = local43.aClass147_Sub3_7) {
				@Pc(49) Class147_Sub3_Sub1 local49 = (Class147_Sub3_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3247 >> 12) + local18 * (float) (local49.anInt3248 >> 12) + local24 * (float) (local49.anInt3251 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray337[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class702.method37107(local100, 221154893) + 1 - this.anInt3597;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass147_Sub3_7;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3599 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray338[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray336[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class147_Sub3_Sub1 local171 = (Class147_Sub3_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3244;
						local133 = local171.aBoolean636;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3244 || local133 != local171.aBoolean636)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray337[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray338[local204] < 64) {
							this.aClass147_Sub3_Sub1ArrayArray2[local204][this.anIntArray338[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray338[local204] == 64) {
									if (this.anInt3599 == 64) {
										break label91;
									}
									this.anIntArray338[local204] += this.anInt3599++ + 1;
								}
								this.aClass147_Sub3_Sub1ArrayArray1[this.anIntArray338[local204] - 64 - 1][this.anIntArray336[this.anIntArray338[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass147_Sub3_7;
				}
				if (local131 >= 0) {
					arg0.method6384(local131);
				} else {
					arg0.method6384(-1);
				}
				if (local133 && arg0.aFloat72 != aFloat257) {
					arg0.method20801(aFloat257);
				} else if (arg0.aFloat72 != 1.0F) {
					arg0.method20801(1.0F);
				}
				this.method25791(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25793(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(Lclient!afm;I)V")
	void method25791(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray96, 0);
		@Pc(9) float local9 = this.aFloatArray96[0];
		@Pc(14) float local14 = this.aFloatArray96[4];
		@Pc(19) float local19 = this.aFloatArray96[8];
		@Pc(24) float local24 = this.aFloatArray96[1];
		@Pc(29) float local29 = this.aFloatArray96[5];
		@Pc(34) float local34 = this.aFloatArray96[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass487_26.method30076(arg0.aClass487_23);
		this.aClass80_Sub36_Sub2_3.anInt3152 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class147_Sub3_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class147_Sub3_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean129) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		}
		if (this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 != 0) {
			this.anInterface14_7.method2754(24, this.aClass80_Sub36_Sub2_3.aByteArray61, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821);
			arg0.method6550(this.aClass189_14, null, this.aClass189_16, this.aClass189_15);
			arg0.method6329(7, 0, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 / 24);
		}
	}

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "(Lclient!afm;)V")
	void method25792(@OriginalArg(0) Class102_Sub3 arg0) {
		aFloat257 = arg0.aFloat72;
		arg0.method6383();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6545(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "(Lclient!afm;)V")
	void method25793(@OriginalArg(0) Class102_Sub3 arg0) {
		arg0.method6545(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat72 != aFloat257) {
			arg0.method20801(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(Lclient!afm;)V")
	void method25794(@OriginalArg(0) Class102_Sub3 arg0) {
		this.anInterface14_7 = arg0.method6375(24, null, 196584, true);
		this.aClass189_15 = new Class189(this.anInterface14_7, 5126, 2, 0);
		this.aClass189_14 = new Class189(this.anInterface14_7, 5126, 3, 8);
		this.aClass189_16 = new Class189(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "(Lclient!afm;Lclient!db;)V")
	void method25795(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class221 arg1) {
		if (arg0.aClass487_28 == null) {
			return;
		}
		this.method25792(arg0);
		@Pc(12) float local12 = arg0.aClass487_28.aFloatArray114[2];
		@Pc(18) float local18 = arg0.aClass487_28.aFloatArray114[6];
		@Pc(24) float local24 = arg0.aClass487_28.aFloatArray114[10];
		@Pc(30) float local30 = arg0.aClass487_28.aFloatArray114[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class147_Sub3 local40 = arg1.aClass23_1.aClass147_Sub3_2;
			@Pc(43) Class147_Sub3 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass147_Sub3_7; local43 != local40; local43 = local43.aClass147_Sub3_7) {
				@Pc(49) Class147_Sub3_Sub1 local49 = (Class147_Sub3_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3247 >> 12) + local18 * (float) (local49.anInt3248 >> 12) + local24 * (float) (local49.anInt3251 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray337[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class702.method37107(local100, 221154893) + 1 - this.anInt3597;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass147_Sub3_7;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3599 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray338[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray336[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class147_Sub3_Sub1 local171 = (Class147_Sub3_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3244;
						local133 = local171.aBoolean636;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3244 || local133 != local171.aBoolean636)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray337[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray338[local204] < 64) {
							this.aClass147_Sub3_Sub1ArrayArray2[local204][this.anIntArray338[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray338[local204] == 64) {
									if (this.anInt3599 == 64) {
										break label91;
									}
									this.anIntArray338[local204] += this.anInt3599++ + 1;
								}
								this.aClass147_Sub3_Sub1ArrayArray1[this.anIntArray338[local204] - 64 - 1][this.anIntArray336[this.anIntArray338[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass147_Sub3_7;
				}
				if (local131 >= 0) {
					arg0.method6384(local131);
				} else {
					arg0.method6384(-1);
				}
				if (local133 && arg0.aFloat72 != aFloat257) {
					arg0.method20801(aFloat257);
				} else if (arg0.aFloat72 != 1.0F) {
					arg0.method20801(1.0F);
				}
				this.method25791(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25793(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "(Lclient!afm;Lclient!db;)V")
	void method25796(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class221 arg1) {
		if (arg0.aClass487_28 == null) {
			return;
		}
		this.method25792(arg0);
		@Pc(12) float local12 = arg0.aClass487_28.aFloatArray114[2];
		@Pc(18) float local18 = arg0.aClass487_28.aFloatArray114[6];
		@Pc(24) float local24 = arg0.aClass487_28.aFloatArray114[10];
		@Pc(30) float local30 = arg0.aClass487_28.aFloatArray114[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class147_Sub3 local40 = arg1.aClass23_1.aClass147_Sub3_2;
			@Pc(43) Class147_Sub3 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass147_Sub3_7; local43 != local40; local43 = local43.aClass147_Sub3_7) {
				@Pc(49) Class147_Sub3_Sub1 local49 = (Class147_Sub3_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3247 >> 12) + local18 * (float) (local49.anInt3248 >> 12) + local24 * (float) (local49.anInt3251 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray337[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class702.method37107(local100, 221154893) + 1 - this.anInt3597;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass147_Sub3_7;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3599 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray338[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray336[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class147_Sub3_Sub1 local171 = (Class147_Sub3_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3244;
						local133 = local171.aBoolean636;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3244 || local133 != local171.aBoolean636)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray337[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray338[local204] < 64) {
							this.aClass147_Sub3_Sub1ArrayArray2[local204][this.anIntArray338[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray338[local204] == 64) {
									if (this.anInt3599 == 64) {
										break label91;
									}
									this.anIntArray338[local204] += this.anInt3599++ + 1;
								}
								this.aClass147_Sub3_Sub1ArrayArray1[this.anIntArray338[local204] - 64 - 1][this.anIntArray336[this.anIntArray338[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass147_Sub3_7;
				}
				if (local131 >= 0) {
					arg0.method6384(local131);
				} else {
					arg0.method6384(-1);
				}
				if (local133 && arg0.aFloat72 != aFloat257) {
					arg0.method20801(aFloat257);
				} else if (arg0.aFloat72 != 1.0F) {
					arg0.method20801(1.0F);
				}
				this.method25791(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25793(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "(Lclient!afm;I)V")
	void method25797(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray96, 0);
		@Pc(9) float local9 = this.aFloatArray96[0];
		@Pc(14) float local14 = this.aFloatArray96[4];
		@Pc(19) float local19 = this.aFloatArray96[8];
		@Pc(24) float local24 = this.aFloatArray96[1];
		@Pc(29) float local29 = this.aFloatArray96[5];
		@Pc(34) float local34 = this.aFloatArray96[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass487_26.method30076(arg0.aClass487_23);
		this.aClass80_Sub36_Sub2_3.anInt3152 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class147_Sub3_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class147_Sub3_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean129) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		}
		if (this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 != 0) {
			this.anInterface14_7.method2754(24, this.aClass80_Sub36_Sub2_3.aByteArray61, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821);
			arg0.method6550(this.aClass189_14, null, this.aClass189_16, this.aClass189_15);
			arg0.method6329(7, 0, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 / 24);
		}
	}

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "(Lclient!afm;I)V")
	void method25798(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray96, 0);
		@Pc(9) float local9 = this.aFloatArray96[0];
		@Pc(14) float local14 = this.aFloatArray96[4];
		@Pc(19) float local19 = this.aFloatArray96[8];
		@Pc(24) float local24 = this.aFloatArray96[1];
		@Pc(29) float local29 = this.aFloatArray96[5];
		@Pc(34) float local34 = this.aFloatArray96[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass487_26.method30076(arg0.aClass487_23);
		this.aClass80_Sub36_Sub2_3.anInt3152 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class147_Sub3_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class147_Sub3_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean129) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		}
		if (this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 != 0) {
			this.anInterface14_7.method2754(24, this.aClass80_Sub36_Sub2_3.aByteArray61, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821);
			arg0.method6550(this.aClass189_14, null, this.aClass189_16, this.aClass189_15);
			arg0.method6329(7, 0, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 / 24);
		}
	}

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "(Lclient!afm;)V")
	void method25799(@OriginalArg(0) Class102_Sub3 arg0) {
		arg0.method6545(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat72 != aFloat257) {
			arg0.method20801(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "(Lclient!afm;)V")
	void method25800(@OriginalArg(0) Class102_Sub3 arg0) {
		aFloat257 = arg0.aFloat72;
		arg0.method6383();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6545(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "(Lclient!afm;)V")
	void method25801(@OriginalArg(0) Class102_Sub3 arg0) {
		aFloat257 = arg0.aFloat72;
		arg0.method6383();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6545(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "(Lclient!afm;)V")
	void method25802(@OriginalArg(0) Class102_Sub3 arg0) {
		aFloat257 = arg0.aFloat72;
		arg0.method6383();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6545(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!afm;I)V")
	void method25803(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray96, 0);
		@Pc(9) float local9 = this.aFloatArray96[0];
		@Pc(14) float local14 = this.aFloatArray96[4];
		@Pc(19) float local19 = this.aFloatArray96[8];
		@Pc(24) float local24 = this.aFloatArray96[1];
		@Pc(29) float local29 = this.aFloatArray96[5];
		@Pc(34) float local34 = this.aFloatArray96[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass487_26.method30076(arg0.aClass487_23);
		this.aClass80_Sub36_Sub2_3.anInt3152 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class147_Sub3_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class147_Sub3_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean129) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23420(1.0F);
							this.aClass80_Sub36_Sub2_3.method23420(0.0F);
							this.aClass80_Sub36_Sub2_3.method23420(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23420(1.0F);
								this.aClass80_Sub36_Sub2_3.method23420(0.0F);
								this.aClass80_Sub36_Sub2_3.method23420(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23420(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23420(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray338[local92] > 64 ? 64 : this.anIntArray338[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass147_Sub3_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3246;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3247 >> 12;
						local155 = local122.anInt3248 >> 12;
						local161 = local122.anInt3251 >> 12;
						local166 = local122.anInt3250 >> 12;
						if (local122.aShort110 == 0) {
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) -local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local62 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local66 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local70 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local38 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local42 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local46 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local50 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local54 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local58 * (float) local166);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						} else {
							arg0.aClass487_27.method30109(local122.aShort110, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_27.method30078(arg0.aClass487_26);
							arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 - local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] + local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] + local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] + local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23418(1.0F);
							this.aClass80_Sub36_Sub2_3.method23418(0.0F);
							this.aClass80_Sub36_Sub2_3.method23418(local149 + local73[0] - local76[0]);
							this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[1] - local76[1]);
							this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[2] - local76[2]);
							this.aClass80_Sub36_Sub2_3.method23154(local130, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
							this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
						}
					}
					if (this.anIntArray338[local92] > 64) {
						local113 = this.anIntArray338[local92] - 64 - 1;
						for (local702 = this.anIntArray336[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass147_Sub3_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3246;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3247 >> 12;
							local161 = local711.anInt3248 >> 12;
							local750 = local711.anInt3251 >> 12;
							local755 = local711.anInt3250 >> 12;
							if (local711.aShort110 == 0) {
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) -local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local62 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local66 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local70 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local38 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local42 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local46 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local50 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local54 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local58 * (float) local755);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							} else {
								arg0.aClass487_27.method30109(local711.aShort110, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass487_27.method30078(arg0.aClass487_26);
								arg0.aClass487_27.method30085(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass487_27.method30085(0.0F, 1.0F, 0.0F, local76);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 - local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 - local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 - local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] + local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] + local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] + local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23418(1.0F);
								this.aClass80_Sub36_Sub2_3.method23418(0.0F);
								this.aClass80_Sub36_Sub2_3.method23418(local155 + local73[0] - local76[0]);
								this.aClass80_Sub36_Sub2_3.method23418(local161 + local73[1] - local76[1]);
								this.aClass80_Sub36_Sub2_3.method23418(local750 + local73[2] - local76[2]);
								this.aClass80_Sub36_Sub2_3.method23154(local135, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local138, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local143, 1275868335);
								this.aClass80_Sub36_Sub2_3.method23154(local732, 1275868335);
							}
						}
					}
				}
			}
		}
		if (this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 != 0) {
			this.anInterface14_7.method2754(24, this.aClass80_Sub36_Sub2_3.aByteArray61, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821);
			arg0.method6550(this.aClass189_14, null, this.aClass189_16, this.aClass189_15);
			arg0.method6329(7, 0, this.aClass80_Sub36_Sub2_3.anInt3152 * -1380987821 / 24);
		}
	}
}
