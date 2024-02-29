package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class214 {

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "F")
	static float aFloat257;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Lclient!bv;")
	Interface14 anInterface14_7;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "Lclient!bp;")
	Class193 aClass193_14;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Lclient!bp;")
	Class193 aClass193_15;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "Lclient!bp;")
	Class193 aClass193_16;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "[F")
	float[] aFloatArray96 = new float[16];

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Lclient!asb;")
	Class93_Sub41_Sub1 aClass93_Sub41_Sub1_3 = new Class93_Sub41_Sub1(786336);

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	final int anInt3644 = 64;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
	final int anInt3645 = 768;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
	final int anInt3646 = 1600;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	final int anInt3648 = Class548.method31195(1600, -1243727707);

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	final int anInt3647 = 64;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
	int[] anIntArray335 = new int[8191];

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "[I")
	int[] anIntArray336 = new int[1600];

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "[I")
	int[] anIntArray337 = new int[64];

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[[Lclient!aqb;")
	Class149_Sub4_Sub1[][] aClass149_Sub4_Sub1ArrayArray2 = new Class149_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "[[Lclient!aqb;")
	Class149_Sub4_Sub1[][] aClass149_Sub4_Sub1ArrayArray1 = new Class149_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
	int anInt3643 = 0;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	Class214() {
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(Lclient!afa;)V")
	void method25551(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(Lclient!afa;)V")
	void method25552(@OriginalArg(0) Class104_Sub1 arg0) {
		this.anInterface14_7 = arg0.method3794(24, null, 196584, true);
		this.aClass193_16 = new Class193(this.anInterface14_7, 5126, 2, 0);
		this.aClass193_14 = new Class193(this.anInterface14_7, 5126, 3, 8);
		this.aClass193_15 = new Class193(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "(Lclient!afa;Lclient!dm;)V")
	void method25553(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class229 arg1) {
		if (arg0.aClass489_3 == null) {
			return;
		}
		this.method25555(arg0);
		@Pc(12) float local12 = arg0.aClass489_3.aFloatArray116[2];
		@Pc(18) float local18 = arg0.aClass489_3.aFloatArray116[6];
		@Pc(24) float local24 = arg0.aClass489_3.aFloatArray116[10];
		@Pc(30) float local30 = arg0.aClass489_3.aFloatArray116[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class149_Sub4 local40 = arg1.aClass8_1.aClass149_Sub4_2;
			@Pc(43) Class149_Sub4 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass149_Sub4_8; local43 != local40; local43 = local43.aClass149_Sub4_8) {
				@Pc(49) Class149_Sub4_Sub1 local49 = (Class149_Sub4_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3236 >> 12) + local18 * (float) (local49.anInt3240 >> 12) + local24 * (float) (local49.anInt3238 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray335[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class548.method31195(local100, -1601552999) + 1 - this.anInt3648;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass149_Sub4_8;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3643 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray336[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray337[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class149_Sub4_Sub1 local171 = (Class149_Sub4_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3237;
						local133 = local171.aBoolean536;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3237 || local133 != local171.aBoolean536)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray335[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray336[local204] < 64) {
							this.aClass149_Sub4_Sub1ArrayArray2[local204][this.anIntArray336[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray336[local204] == 64) {
									if (this.anInt3643 == 64) {
										break label91;
									}
									this.anIntArray336[local204] += this.anInt3643++ + 1;
								}
								this.aClass149_Sub4_Sub1ArrayArray1[this.anIntArray336[local204] - 64 - 1][this.anIntArray337[this.anIntArray336[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass149_Sub4_8;
				}
				if (local131 >= 0) {
					arg0.method3801(local131);
				} else {
					arg0.method3801(-1);
				}
				if (local133 && arg0.aFloat42 != aFloat257) {
					arg0.method20533(aFloat257);
				} else if (arg0.aFloat42 != 1.0F) {
					arg0.method20533(1.0F);
				}
				this.method25554(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25558(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(Lclient!afa;I)V")
	void method25554(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
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
		arg0.aClass489_6.method30140(arg0.aClass489_4);
		this.aClass93_Sub41_Sub1_3.anInt3070 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class149_Sub4_Sub1 local122;
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
		@Pc(711) Class149_Sub4_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean106) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray336[local92] > 64 ? 64 : this.anIntArray336[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass149_Sub4_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3235;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3236 >> 12;
						local155 = local122.anInt3240 >> 12;
						local161 = local122.anInt3238 >> 12;
						local166 = local122.anInt3239 >> 12;
						if (local122.aShort111 == 0) {
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local38 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local42 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local46 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -22);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -60);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -114);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -75);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local62 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local66 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local70 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -84);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -47);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -72);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -76);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local38 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local42 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local46 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -108);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -123);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -82);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -93);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local50 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local54 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local58 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -71);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -120);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -10);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -27);
						} else {
							arg0.aClass489_7.method30101(local122.aShort111, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass489_7.method30134(arg0.aClass489_6);
							arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 - local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -33);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -66);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -47);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -40);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 - local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -56);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -21);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -125);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -70);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -5);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -121);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -111);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -66);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -113);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -29);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -30);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) 4);
						}
					}
					if (this.anIntArray336[local92] > 64) {
						local113 = this.anIntArray336[local92] - 64 - 1;
						for (local702 = this.anIntArray337[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass149_Sub4_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3235;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3236 >> 12;
							local161 = local711.anInt3240 >> 12;
							local750 = local711.anInt3238 >> 12;
							local755 = local711.anInt3239 >> 12;
							if (local711.aShort111 == 0) {
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local38 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local42 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local46 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -127);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -118);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -24);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -53);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local62 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local66 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local70 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -107);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -11);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -86);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -50);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local38 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local42 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local46 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -113);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -102);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -87);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -116);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local50 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local54 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local58 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -34);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -126);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -127);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) 0);
							} else {
								arg0.aClass489_7.method30101(local711.aShort111, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass489_7.method30134(arg0.aClass489_6);
								arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 - local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -64);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -33);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -32);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -125);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 - local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -87);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -124);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -102);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -19);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) 2);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -33);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -127);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -42);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -113);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -75);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -85);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -102);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray336[local92] > 64 ? 64 : this.anIntArray336[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass149_Sub4_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3235;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3236 >> 12;
						local155 = local122.anInt3240 >> 12;
						local161 = local122.anInt3238 >> 12;
						local166 = local122.anInt3239 >> 12;
						if (local122.aShort111 == 0) {
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local38 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local42 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local46 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -110);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -14);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -56);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) 3);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local62 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local66 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local70 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -108);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -30);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -29);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -103);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local38 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local42 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local46 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -89);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -77);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -98);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -105);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local50 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local54 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local58 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -36);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -79);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -41);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -7);
						} else {
							arg0.aClass489_7.method30101(local122.aShort111, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass489_7.method30134(arg0.aClass489_6);
							arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 - local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -58);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -55);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -111);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -23);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 - local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -70);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -90);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -102);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -95);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -21);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -88);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -13);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -53);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -51);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -27);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -15);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -127);
						}
					}
					if (this.anIntArray336[local92] > 64) {
						local113 = this.anIntArray336[local92] - 64 - 1;
						for (local702 = this.anIntArray337[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass149_Sub4_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3235;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3236 >> 12;
							local161 = local711.anInt3240 >> 12;
							local750 = local711.anInt3238 >> 12;
							local755 = local711.anInt3239 >> 12;
							if (local711.aShort111 == 0) {
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local38 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local42 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local46 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -118);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -67);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -85);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -15);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local62 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local66 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local70 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -10);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -106);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -14);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -1);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local38 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local42 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local46 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -74);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -61);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -57);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -31);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local50 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local54 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local58 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -33);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -29);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -125);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -23);
							} else {
								arg0.aClass489_7.method30101(local711.aShort111, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass489_7.method30134(arg0.aClass489_6);
								arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 - local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -71);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -1);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -128);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -112);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 - local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -72);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -98);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -14);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -25);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -119);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -5);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -63);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -68);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -19);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -105);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -24);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -73);
							}
						}
					}
				}
			}
		}
		if (this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357 != 0) {
			this.anInterface14_7.method2779(24, this.aClass93_Sub41_Sub1_3.aByteArray58, this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357);
			arg0.method3836(this.aClass193_14, null, this.aClass193_15, this.aClass193_16);
			arg0.method3828(7, 0, this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357 / 24);
		}
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "(Lclient!afa;)V")
	void method25555(@OriginalArg(0) Class104_Sub1 arg0) {
		aFloat257 = arg0.aFloat42;
		arg0.method3800();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3816(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(Lclient!afa;Lclient!dm;)V")
	void method25556(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class229 arg1) {
		if (arg0.aClass489_3 == null) {
			return;
		}
		this.method25555(arg0);
		@Pc(12) float local12 = arg0.aClass489_3.aFloatArray116[2];
		@Pc(18) float local18 = arg0.aClass489_3.aFloatArray116[6];
		@Pc(24) float local24 = arg0.aClass489_3.aFloatArray116[10];
		@Pc(30) float local30 = arg0.aClass489_3.aFloatArray116[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class149_Sub4 local40 = arg1.aClass8_1.aClass149_Sub4_2;
			@Pc(43) Class149_Sub4 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass149_Sub4_8; local43 != local40; local43 = local43.aClass149_Sub4_8) {
				@Pc(49) Class149_Sub4_Sub1 local49 = (Class149_Sub4_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3236 >> 12) + local18 * (float) (local49.anInt3240 >> 12) + local24 * (float) (local49.anInt3238 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray335[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class548.method31195(local100, -1686772037) + 1 - this.anInt3648;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass149_Sub4_8;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3643 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray336[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray337[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class149_Sub4_Sub1 local171 = (Class149_Sub4_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3237;
						local133 = local171.aBoolean536;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3237 || local133 != local171.aBoolean536)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray335[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray336[local204] < 64) {
							this.aClass149_Sub4_Sub1ArrayArray2[local204][this.anIntArray336[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray336[local204] == 64) {
									if (this.anInt3643 == 64) {
										break label91;
									}
									this.anIntArray336[local204] += this.anInt3643++ + 1;
								}
								this.aClass149_Sub4_Sub1ArrayArray1[this.anIntArray336[local204] - 64 - 1][this.anIntArray337[this.anIntArray336[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass149_Sub4_8;
				}
				if (local131 >= 0) {
					arg0.method3801(local131);
				} else {
					arg0.method3801(-1);
				}
				if (local133 && arg0.aFloat42 != aFloat257) {
					arg0.method20533(aFloat257);
				} else if (arg0.aFloat42 != 1.0F) {
					arg0.method20533(1.0F);
				}
				this.method25554(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method25558(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "(Lclient!afa;)V")
	void method25557(@OriginalArg(0) Class104_Sub1 arg0) {
		this.anInterface14_7 = arg0.method3794(24, null, 196584, true);
		this.aClass193_16 = new Class193(this.anInterface14_7, 5126, 2, 0);
		this.aClass193_14 = new Class193(this.anInterface14_7, 5126, 3, 8);
		this.aClass193_15 = new Class193(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(Lclient!afa;)V")
	void method25558(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "(Lclient!afa;)V")
	void method25559(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "(Lclient!afa;)V")
	void method25560(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "(Lclient!afa;)V")
	void method25561(@OriginalArg(0) Class104_Sub1 arg0) {
		aFloat257 = arg0.aFloat42;
		arg0.method3800();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3816(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "(Lclient!afa;)V")
	void method25562(@OriginalArg(0) Class104_Sub1 arg0) {
		aFloat257 = arg0.aFloat42;
		arg0.method3800();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3816(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(Lclient!afa;)V")
	void method25563(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "(Lclient!afa;I)V")
	void method25564(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
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
		arg0.aClass489_6.method30140(arg0.aClass489_4);
		this.aClass93_Sub41_Sub1_3.anInt3070 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class149_Sub4_Sub1 local122;
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
		@Pc(711) Class149_Sub4_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean106) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray336[local92] > 64 ? 64 : this.anIntArray336[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass149_Sub4_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3235;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3236 >> 12;
						local155 = local122.anInt3240 >> 12;
						local161 = local122.anInt3238 >> 12;
						local166 = local122.anInt3239 >> 12;
						if (local122.aShort111 == 0) {
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local38 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local42 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local46 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -110);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -57);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -33);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -87);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local62 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local66 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local70 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -6);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -15);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -82);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -125);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local38 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local42 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local46 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -19);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -128);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -49);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -22);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local50 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local54 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local58 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -93);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -8);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -37);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -43);
						} else {
							arg0.aClass489_7.method30101(local122.aShort111, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass489_7.method30134(arg0.aClass489_6);
							arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 - local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -5);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -43);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -56);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -9);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 - local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -109);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -77);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -75);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -10);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -41);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -65);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -90);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -106);
							this.aClass93_Sub41_Sub1_3.method22334(1.0F);
							this.aClass93_Sub41_Sub1_3.method22334(0.0F);
							this.aClass93_Sub41_Sub1_3.method22334(local149 + local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -58);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -3);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -110);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -84);
						}
					}
					if (this.anIntArray336[local92] > 64) {
						local113 = this.anIntArray336[local92] - 64 - 1;
						for (local702 = this.anIntArray337[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass149_Sub4_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3235;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3236 >> 12;
							local161 = local711.anInt3240 >> 12;
							local750 = local711.anInt3238 >> 12;
							local755 = local711.anInt3239 >> 12;
							if (local711.aShort111 == 0) {
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local38 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local42 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local46 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -63);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -7);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -120);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -66);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local62 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local66 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local70 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -13);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -100);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -30);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -89);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local38 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local42 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local46 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -83);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -28);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -107);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -4);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local50 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local54 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local58 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -82);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -47);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -102);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -71);
							} else {
								arg0.aClass489_7.method30101(local711.aShort111, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass489_7.method30134(arg0.aClass489_6);
								arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 - local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -26);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -62);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -63);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -122);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 - local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 - local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 - local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -83);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -49);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -119);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -98);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -13);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -9);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -104);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -84);
								this.aClass93_Sub41_Sub1_3.method22334(1.0F);
								this.aClass93_Sub41_Sub1_3.method22334(0.0F);
								this.aClass93_Sub41_Sub1_3.method22334(local155 + local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22334(local161 + local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22334(local750 + local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -54);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -62);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -68);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -107);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray336[local92] > 64 ? 64 : this.anIntArray336[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass149_Sub4_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt3235;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3236 >> 12;
						local155 = local122.anInt3240 >> 12;
						local161 = local122.anInt3238 >> 12;
						local166 = local122.anInt3239 >> 12;
						if (local122.aShort111 == 0) {
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local38 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local42 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local46 * (float) -local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -14);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -1);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -16);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -56);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local62 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local66 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local70 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -31);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -40);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -4);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -126);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local38 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local42 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local46 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -109);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -86);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -127);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -87);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local50 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local54 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local58 * (float) local166);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -107);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -32);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -2);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -54);
						} else {
							arg0.aClass489_7.method30101(local122.aShort111, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass489_7.method30134(arg0.aClass489_6);
							arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 - local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -32);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -79);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -10);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -111);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 - local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -83);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -40);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -121);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -51);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local73[0] + local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[1] + local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[2] + local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) -31);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -18);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -42);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -31);
							this.aClass93_Sub41_Sub1_3.method22337(1.0F);
							this.aClass93_Sub41_Sub1_3.method22337(0.0F);
							this.aClass93_Sub41_Sub1_3.method22337(local149 + local73[0] - local76[0]);
							this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[1] - local76[1]);
							this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[2] - local76[2]);
							this.aClass93_Sub41_Sub1_3.method22522(local130, (byte) 2);
							this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -1);
							this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -127);
							this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -51);
						}
					}
					if (this.anIntArray336[local92] > 64) {
						local113 = this.anIntArray336[local92] - 64 - 1;
						for (local702 = this.anIntArray337[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass149_Sub4_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt3235;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3236 >> 12;
							local161 = local711.anInt3240 >> 12;
							local750 = local711.anInt3238 >> 12;
							local755 = local711.anInt3239 >> 12;
							if (local711.aShort111 == 0) {
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local38 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local42 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local46 * (float) -local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -71);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -98);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -81);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -77);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local62 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local66 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local70 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -57);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -103);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -125);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -37);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local38 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local42 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local46 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -114);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -85);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) 0);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -7);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local50 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local54 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local58 * (float) local755);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) 2);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -57);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -91);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -62);
							} else {
								arg0.aClass489_7.method30101(local711.aShort111, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass489_7.method30134(arg0.aClass489_6);
								arg0.aClass489_7.method30028(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass489_7.method30028(0.0F, 1.0F, 0.0F, local76);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 - local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -3);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -120);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -116);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -105);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 - local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 - local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 - local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) 4);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -91);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -39);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -108);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[0] + local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[1] + local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local73[2] + local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -38);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -83);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -121);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -1);
								this.aClass93_Sub41_Sub1_3.method22337(1.0F);
								this.aClass93_Sub41_Sub1_3.method22337(0.0F);
								this.aClass93_Sub41_Sub1_3.method22337(local155 + local73[0] - local76[0]);
								this.aClass93_Sub41_Sub1_3.method22337(local161 + local73[1] - local76[1]);
								this.aClass93_Sub41_Sub1_3.method22337(local750 + local73[2] - local76[2]);
								this.aClass93_Sub41_Sub1_3.method22522(local135, (byte) -83);
								this.aClass93_Sub41_Sub1_3.method22522(local138, (byte) -28);
								this.aClass93_Sub41_Sub1_3.method22522(local143, (byte) -84);
								this.aClass93_Sub41_Sub1_3.method22522(local732, (byte) -46);
							}
						}
					}
				}
			}
		}
		if (this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357 != 0) {
			this.anInterface14_7.method2779(24, this.aClass93_Sub41_Sub1_3.aByteArray58, this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357);
			arg0.method3836(this.aClass193_14, null, this.aClass193_15, this.aClass193_16);
			arg0.method3828(7, 0, this.aClass93_Sub41_Sub1_3.anInt3070 * 212851357 / 24);
		}
	}

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "(Lclient!afa;)V")
	void method25565(@OriginalArg(0) Class104_Sub1 arg0) {
		arg0.method3816(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat42 != aFloat257) {
			arg0.method20533(aFloat257);
		}
	}
}
