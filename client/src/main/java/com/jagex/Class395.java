package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class395 {

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "F")
	static float aFloat294;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	final int anInt4822 = 64;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	final int anInt4827 = 768;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	final int anInt4823 = 1600;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	final int anInt4824 = Class548.method31195(1600, -1598887945);

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	final int anInt4825 = 64;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
	int[] anIntArray441 = new int[8191];

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
	int[] anIntArray439 = new int[1600];

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "[I")
	int[] anIntArray440 = new int[64];

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "[[Lclient!aqb;")
	Class149_Sub4_Sub1[][] aClass149_Sub4_Sub1ArrayArray3 = new Class149_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[[Lclient!aqb;")
	Class149_Sub4_Sub1[][] aClass149_Sub4_Sub1ArrayArray4 = new Class149_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	int anInt4826 = 0;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!lo;")
	Class145 aClass145_23;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!lr;")
	Interface37 anInterface37_19;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!lr;")
	Interface37 anInterface37_18;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ml;")
	Interface40 anInterface40_7;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!afc;)V")
	Class395(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass145_23 = arg0.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1 }), new Class400(Class399.aClass399_2) });
		this.anInterface37_19 = arg0.method21025(true);
		this.anInterface37_18 = arg0.method21025(false);
		this.anInterface37_18.method29496(393168, 12);
		this.anInterface40_7 = arg0.method21007(false);
		this.anInterface40_7.method29532(49146);
		@Pc(104) ByteBuffer local104 = arg0.aByteBuffer7;
		local104.clear();
		@Pc(109) int local109;
		for (local109 = 0; local109 < 8191; local109++) {
			@Pc(116) int local116 = local109 * 4;
			local104.putShort((short) local116);
			local104.putShort((short) (local116 + 1));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 3));
			local104.putShort((short) local116);
		}
		this.anInterface40_7.method29514(0, local104.position(), arg0.aLong132);
		local104.clear();
		for (local109 = 0; local109 < 8191; local109++) {
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
		}
		this.anInterface37_18.method29514(0, local104.position(), arg0.aLong132);
	}

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "(Lclient!afc;)V")
	void method28514(@OriginalArg(0) Class104_Sub2 arg0) {
		this.anInterface37_19.method29496(786336, 24);
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(Lclient!afc;)V")
	void method28515(@OriginalArg(0) Class104_Sub2 arg0) {
		this.anInterface37_19.method29496(786336, 24);
	}

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "()V")
	void method28516() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "(Lclient!afc;Lclient!dm;)V")
	void method28517(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class229 arg1) {
		arg0.method20530(false);
		aFloat294 = arg0.aFloat211;
		@Pc(11) float local11 = arg0.aClass489_75.aFloatArray116[2];
		@Pc(17) float local17 = arg0.aClass489_75.aFloatArray116[6];
		@Pc(23) float local23 = arg0.aClass489_75.aFloatArray116[10];
		@Pc(29) float local29 = arg0.aClass489_75.aFloatArray116[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class149_Sub4 local39 = arg1.aClass8_1.aClass149_Sub4_2;
		@Pc(75) int local75;
		for (@Pc(42) Class149_Sub4 local42 = local39.aClass149_Sub4_8; local42 != local39; local42 = local42.aClass149_Sub4_8) {
			@Pc(48) Class149_Sub4_Sub1 local48 = (Class149_Sub4_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3236 >> 12) + local17 * (float) (local48.anInt3240 >> 12) + local23 * (float) (local48.anInt3238 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray441[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class548.method31195(local99, -1029211992) + 1 - this.anInt4824;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21042(this.anInterface40_7);
		@Pc(130) Class126 local130 = arg0.aClass126_3;
		local130.method10032(Class489.aClass489_99);
		local130.aClass489_37.method30017();
		local130.anInt1118 = -1;
		@Pc(146) boolean local146 = arg0.anInt2947 > 0;
		if (local146) {
			local130.aClass460_7.method29375(0.0F, 0.0F, 1.0F, -arg0.aFloat216);
			local130.aClass472_37.method29718((float) (arg0.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 0 & 0xFF) / 255.0F);
			local130.aClass460_7.method29393(arg0.aClass489_87);
			local130.aClass460_7.method29380(1.0F / (arg0.aFloat209 - arg0.aFloat216));
		} else {
			local130.aClass460_7.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass472_37.method29718(0.0F, 0.0F, 0.0F);
		}
		this.method28526(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat211 != aFloat294) {
			arg0.method20533(aFloat294);
		}
		arg0.method20530(true);
	}

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "(Lclient!afc;Lclient!ajn;IIILclient!jo;Z)V")
	void method28518(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class149_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class149_Sub4 local2 = arg1.aClass149_Sub4_8;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4826 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray439[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray440[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class149_Sub4_Sub1 local46 = (Class149_Sub4_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3237;
					local8 = local46.aBoolean536;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3237 || local8 != local46.aBoolean536)) {
					local10 = true;
					break;
				}
				this.method28524(this.anIntArray441[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass149_Sub4_8;
			}
			arg5.anInterface38_13 = null;
			if (local6 >= 0) {
				@Pc(96) Class235 local96 = arg0.aClass225_6.method25690(local6, 1008888084);
				if (local96.aBoolean656) {
					arg5.anInterface38_13 = arg0.aClass406_3.method28743(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass618_2 == Class618.aClass618_4) {
					local107 = local96.aByte121;
				}
				arg0.method20996(local107);
			}
			if (local8 && arg0.aFloat211 != aFloat294) {
				arg0.method20533(aFloat294);
			} else if (arg0.aFloat211 != 1.0F) {
				arg0.method20533(1.0F);
			}
			this.method28519(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "(Lclient!afc;IZ)V")
	void method28519(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class489 local4 = arg0.aClass489_75;
		@Pc(9) float local9 = local4.aFloatArray116[0];
		@Pc(14) float local14 = local4.aFloatArray116[4];
		@Pc(19) float local19 = local4.aFloatArray116[8];
		@Pc(24) float local24 = local4.aFloatArray116[1];
		@Pc(29) float local29 = local4.aFloatArray116[5];
		@Pc(34) float local34 = local4.aFloatArray116[9];
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
		arg0.aClass489_78.method30140(arg0.aClass489_72);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer7;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray439[local91] > 64 ? 64 : this.anIntArray439[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class149_Sub4_Sub1 local121 = this.aClass149_Sub4_Sub1ArrayArray3[local91][local112];
					@Pc(124) int local124 = local121.anInt3235;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2953 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt3236 >> 12);
					local163 = local121.anInt3240 >> 12;
					local169 = local121.anInt3238 >> 12;
					@Pc(174) int local174 = local121.anInt3239 >> 12;
					if (local121.aShort111 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass489_73.method30101(local121.aShort111, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass489_73.method30134(arg0.aClass489_78);
						arg0.aClass489_73.method30028(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass489_73.method30028(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray439[local91] > 64) {
					local112 = this.anIntArray439[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray440[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class149_Sub4_Sub1 local688 = this.aClass149_Sub4_Sub1ArrayArray4[local112][local679];
						@Pc(691) int local691 = local688.anInt3235;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt3236 >> 12;
						local169 = local688.anInt3240 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt3238 >> 12);
						@Pc(732) int local732 = local688.anInt3239 >> 12;
						if (arg0.anInt2953 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort111 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass489_73.method30101(local688.aShort111, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass489_73.method30134(arg0.aClass489_78);
							arg0.aClass489_73.method30028(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass489_73.method30028(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface37_19.method29514(0, local84.position(), arg0.aLong132);
		arg0.method21060(0, this.anInterface37_19);
		arg0.method21060(1, this.anInterface37_18);
		arg0.method21118(this.aClass145_23);
		@Pc(1252) Class126 local1252 = arg0.aClass126_3;
		local1252.method10033(local1, arg2);
	}

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "(Lclient!afc;)V")
	void method28520(@OriginalArg(0) Class104_Sub2 arg0) {
		this.anInterface37_19.method29496(786336, 24);
	}

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "(Lclient!afc;)V")
	void method28521(@OriginalArg(0) Class104_Sub2 arg0) {
		this.anInterface37_19.method29496(786336, 24);
	}

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "(Lclient!afc;)V")
	void method28522(@OriginalArg(0) Class104_Sub2 arg0) {
		this.anInterface37_19.method29496(786336, 24);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()V")
	void method28523() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(ILclient!aqb;)V")
	void method28524(@OriginalArg(0) int arg0, @OriginalArg(1) Class149_Sub4_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray439[arg0] < 64) {
			this.aClass149_Sub4_Sub1ArrayArray3[arg0][this.anIntArray439[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray439[arg0] == 64) {
			if (this.anInt4826 == 64) {
				return;
			}
			this.anIntArray439[arg0] += this.anInt4826++ + 1;
		}
		this.aClass149_Sub4_Sub1ArrayArray4[this.anIntArray439[arg0] - 64 - 1][this.anIntArray440[this.anIntArray439[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()V")
	void method28525() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "(Lclient!afc;Lclient!ajn;IIILclient!jo;Z)V")
	void method28526(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class149_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class149_Sub4 local2 = arg1.aClass149_Sub4_8;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4826 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray439[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray440[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class149_Sub4_Sub1 local46 = (Class149_Sub4_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3237;
					local8 = local46.aBoolean536;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3237 || local8 != local46.aBoolean536)) {
					local10 = true;
					break;
				}
				this.method28524(this.anIntArray441[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass149_Sub4_8;
			}
			arg5.anInterface38_13 = null;
			if (local6 >= 0) {
				@Pc(96) Class235 local96 = arg0.aClass225_6.method25690(local6, -2129449909);
				if (local96.aBoolean656) {
					arg5.anInterface38_13 = arg0.aClass406_3.method28743(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass618_2 == Class618.aClass618_4) {
					local107 = local96.aByte121;
				}
				arg0.method20996(local107);
			}
			if (local8 && arg0.aFloat211 != aFloat294) {
				arg0.method20533(aFloat294);
			} else if (arg0.aFloat211 != 1.0F) {
				arg0.method20533(1.0F);
			}
			this.method28519(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "()V")
	void method28527() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "()V")
	void method28528() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "(Lclient!afc;Lclient!dm;)V")
	void method28529(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class229 arg1) {
		arg0.method20530(false);
		aFloat294 = arg0.aFloat211;
		@Pc(11) float local11 = arg0.aClass489_75.aFloatArray116[2];
		@Pc(17) float local17 = arg0.aClass489_75.aFloatArray116[6];
		@Pc(23) float local23 = arg0.aClass489_75.aFloatArray116[10];
		@Pc(29) float local29 = arg0.aClass489_75.aFloatArray116[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class149_Sub4 local39 = arg1.aClass8_1.aClass149_Sub4_2;
		@Pc(75) int local75;
		for (@Pc(42) Class149_Sub4 local42 = local39.aClass149_Sub4_8; local42 != local39; local42 = local42.aClass149_Sub4_8) {
			@Pc(48) Class149_Sub4_Sub1 local48 = (Class149_Sub4_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3236 >> 12) + local17 * (float) (local48.anInt3240 >> 12) + local23 * (float) (local48.anInt3238 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray441[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class548.method31195(local99, 191416545) + 1 - this.anInt4824;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21042(this.anInterface40_7);
		@Pc(130) Class126 local130 = arg0.aClass126_3;
		local130.method10032(Class489.aClass489_99);
		local130.aClass489_37.method30017();
		local130.anInt1118 = -1;
		@Pc(146) boolean local146 = arg0.anInt2947 > 0;
		if (local146) {
			local130.aClass460_7.method29375(0.0F, 0.0F, 1.0F, -arg0.aFloat216);
			local130.aClass472_37.method29718((float) (arg0.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 0 & 0xFF) / 255.0F);
			local130.aClass460_7.method29393(arg0.aClass489_87);
			local130.aClass460_7.method29380(1.0F / (arg0.aFloat209 - arg0.aFloat216));
		} else {
			local130.aClass460_7.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass472_37.method29718(0.0F, 0.0F, 0.0F);
		}
		this.method28526(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat211 != aFloat294) {
			arg0.method20533(aFloat294);
		}
		arg0.method20530(true);
	}

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "(Lclient!afc;Lclient!dm;)V")
	void method28530(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class229 arg1) {
		arg0.method20530(false);
		aFloat294 = arg0.aFloat211;
		@Pc(11) float local11 = arg0.aClass489_75.aFloatArray116[2];
		@Pc(17) float local17 = arg0.aClass489_75.aFloatArray116[6];
		@Pc(23) float local23 = arg0.aClass489_75.aFloatArray116[10];
		@Pc(29) float local29 = arg0.aClass489_75.aFloatArray116[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class149_Sub4 local39 = arg1.aClass8_1.aClass149_Sub4_2;
		@Pc(75) int local75;
		for (@Pc(42) Class149_Sub4 local42 = local39.aClass149_Sub4_8; local42 != local39; local42 = local42.aClass149_Sub4_8) {
			@Pc(48) Class149_Sub4_Sub1 local48 = (Class149_Sub4_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3236 >> 12) + local17 * (float) (local48.anInt3240 >> 12) + local23 * (float) (local48.anInt3238 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray441[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class548.method31195(local99, 475066746) + 1 - this.anInt4824;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21042(this.anInterface40_7);
		@Pc(130) Class126 local130 = arg0.aClass126_3;
		local130.method10032(Class489.aClass489_99);
		local130.aClass489_37.method30017();
		local130.anInt1118 = -1;
		@Pc(146) boolean local146 = arg0.anInt2947 > 0;
		if (local146) {
			local130.aClass460_7.method29375(0.0F, 0.0F, 1.0F, -arg0.aFloat216);
			local130.aClass472_37.method29718((float) (arg0.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 0 & 0xFF) / 255.0F);
			local130.aClass460_7.method29393(arg0.aClass489_87);
			local130.aClass460_7.method29380(1.0F / (arg0.aFloat209 - arg0.aFloat216));
		} else {
			local130.aClass460_7.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass472_37.method29718(0.0F, 0.0F, 0.0F);
		}
		this.method28526(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat211 != aFloat294) {
			arg0.method20533(aFloat294);
		}
		arg0.method20530(true);
	}

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "(Lclient!afc;Lclient!dm;)V")
	void method28531(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class229 arg1) {
		arg0.method20530(false);
		aFloat294 = arg0.aFloat211;
		@Pc(11) float local11 = arg0.aClass489_75.aFloatArray116[2];
		@Pc(17) float local17 = arg0.aClass489_75.aFloatArray116[6];
		@Pc(23) float local23 = arg0.aClass489_75.aFloatArray116[10];
		@Pc(29) float local29 = arg0.aClass489_75.aFloatArray116[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class149_Sub4 local39 = arg1.aClass8_1.aClass149_Sub4_2;
		@Pc(75) int local75;
		for (@Pc(42) Class149_Sub4 local42 = local39.aClass149_Sub4_8; local42 != local39; local42 = local42.aClass149_Sub4_8) {
			@Pc(48) Class149_Sub4_Sub1 local48 = (Class149_Sub4_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3236 >> 12) + local17 * (float) (local48.anInt3240 >> 12) + local23 * (float) (local48.anInt3238 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray441[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class548.method31195(local99, 469417866) + 1 - this.anInt4824;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21042(this.anInterface40_7);
		@Pc(130) Class126 local130 = arg0.aClass126_3;
		local130.method10032(Class489.aClass489_99);
		local130.aClass489_37.method30017();
		local130.anInt1118 = -1;
		@Pc(146) boolean local146 = arg0.anInt2947 > 0;
		if (local146) {
			local130.aClass460_7.method29375(0.0F, 0.0F, 1.0F, -arg0.aFloat216);
			local130.aClass472_37.method29718((float) (arg0.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2957 >> 0 & 0xFF) / 255.0F);
			local130.aClass460_7.method29393(arg0.aClass489_87);
			local130.aClass460_7.method29380(1.0F / (arg0.aFloat209 - arg0.aFloat216));
		} else {
			local130.aClass460_7.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass472_37.method29718(0.0F, 0.0F, 0.0F);
		}
		this.method28526(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat211 != aFloat294) {
			arg0.method20533(aFloat294);
		}
		arg0.method20530(true);
	}

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "()V")
	void method28532() {
		this.anInterface37_19.method31065();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lclient!afc;Lclient!ajn;IIILclient!jo;Z)V")
	void method28533(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class149_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class149_Sub4 local2 = arg1.aClass149_Sub4_8;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4826 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray439[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray440[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class149_Sub4_Sub1 local46 = (Class149_Sub4_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3237;
					local8 = local46.aBoolean536;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3237 || local8 != local46.aBoolean536)) {
					local10 = true;
					break;
				}
				this.method28524(this.anIntArray441[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass149_Sub4_8;
			}
			arg5.anInterface38_13 = null;
			if (local6 >= 0) {
				@Pc(96) Class235 local96 = arg0.aClass225_6.method25690(local6, 1215304773);
				if (local96.aBoolean656) {
					arg5.anInterface38_13 = arg0.aClass406_3.method28743(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass618_2 == Class618.aClass618_4) {
					local107 = local96.aByte121;
				}
				arg0.method20996(local107);
			}
			if (local8 && arg0.aFloat211 != aFloat294) {
				arg0.method20533(aFloat294);
			} else if (arg0.aFloat211 != 1.0F) {
				arg0.method20533(1.0F);
			}
			this.method28519(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "(ILclient!aqb;)V")
	void method28534(@OriginalArg(0) int arg0, @OriginalArg(1) Class149_Sub4_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray439[arg0] < 64) {
			this.aClass149_Sub4_Sub1ArrayArray3[arg0][this.anIntArray439[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray439[arg0] == 64) {
			if (this.anInt4826 == 64) {
				return;
			}
			this.anIntArray439[arg0] += this.anInt4826++ + 1;
		}
		this.aClass149_Sub4_Sub1ArrayArray4[this.anIntArray439[arg0] - 64 - 1][this.anIntArray440[this.anIntArray439[arg0] - 64 - 1]++] = arg1;
	}
}
