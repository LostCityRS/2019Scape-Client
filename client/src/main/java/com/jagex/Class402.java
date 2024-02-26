package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!lq")
public final class Class402 {

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "F")
	static float aFloat286;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	final int anInt4583 = 64;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	final int anInt4579 = 768;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	final int anInt4580 = 1600;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	final int anInt4581 = Class702.method37107(1600, 221154893);

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	final int anInt4582 = 64;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
	int[] anIntArray441 = new int[8191];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
	int[] anIntArray442 = new int[1600];

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "[I")
	int[] anIntArray443 = new int[64];

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "[[Lclient!aqg;")
	Class147_Sub3_Sub1[][] aClass147_Sub3_Sub1ArrayArray3 = new Class147_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "[[Lclient!aqg;")
	Class147_Sub3_Sub1[][] aClass147_Sub3_Sub1ArrayArray4 = new Class147_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	int anInt4584 = 0;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!ld;")
	Class135 aClass135_24;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!lx;")
	Interface38 anInterface38_19;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!lx;")
	Interface38 anInterface38_20;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Lclient!mv;")
	Interface44 anInterface44_5;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class402(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass135_24 = arg0.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_3, Class400.aClass400_1 }), new Class397(Class400.aClass400_2) });
		this.anInterface38_19 = arg0.method21239(true);
		this.anInterface38_20 = arg0.method21239(false);
		this.anInterface38_20.method29327(393168, 12);
		this.anInterface44_5 = arg0.method21246(false);
		this.anInterface44_5.method29401(49146);
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
		this.anInterface44_5.method29383(0, local104.position(), arg0.aLong168);
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
		this.anInterface38_20.method29383(0, local104.position(), arg0.aLong168);
	}

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "(ILclient!aqg;)V")
	void method28884(@OriginalArg(0) int arg0, @OriginalArg(1) Class147_Sub3_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray442[arg0] < 64) {
			this.aClass147_Sub3_Sub1ArrayArray3[arg0][this.anIntArray442[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray442[arg0] == 64) {
			if (this.anInt4584 == 64) {
				return;
			}
			this.anIntArray442[arg0] += this.anInt4584++ + 1;
		}
		this.aClass147_Sub3_Sub1ArrayArray4[this.anIntArray442[arg0] - 64 - 1][this.anIntArray443[this.anIntArray442[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "(Lclient!afa;)V")
	void method28885(@OriginalArg(0) Class102_Sub1 arg0) {
		this.anInterface38_19.method29327(786336, 24);
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "()V")
	void method28886() {
		this.anInterface38_19.method30837();
	}

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "()V")
	void method28887() {
		this.anInterface38_19.method30837();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!afa;Lclient!db;)V")
	void method28888(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class221 arg1) {
		arg0.method20762(false);
		aFloat286 = arg0.aFloat212;
		@Pc(11) float local11 = arg0.aClass487_75.aFloatArray114[2];
		@Pc(17) float local17 = arg0.aClass487_75.aFloatArray114[6];
		@Pc(23) float local23 = arg0.aClass487_75.aFloatArray114[10];
		@Pc(29) float local29 = arg0.aClass487_75.aFloatArray114[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class147_Sub3 local39 = arg1.aClass23_1.aClass147_Sub3_2;
		@Pc(75) int local75;
		for (@Pc(42) Class147_Sub3 local42 = local39.aClass147_Sub3_7; local42 != local39; local42 = local42.aClass147_Sub3_7) {
			@Pc(48) Class147_Sub3_Sub1 local48 = (Class147_Sub3_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3247 >> 12) + local17 * (float) (local48.anInt3248 >> 12) + local23 * (float) (local48.anInt3251 >> 12) + local29);
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
			local75 = Class702.method37107(local99, 221154893) + 1 - this.anInt4581;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21251(this.anInterface44_5);
		@Pc(130) Class127 local130 = arg0.aClass127_3;
		local130.method10144(Class487.aClass487_97);
		local130.aClass487_46.method30139();
		local130.anInt1166 = -1;
		@Pc(146) boolean local146 = arg0.anInt2985 > 0;
		if (local146) {
			local130.aClass456_9.method29337(0.0F, 0.0F, 1.0F, -arg0.aFloat217);
			local130.aClass463_44.method29477((float) (arg0.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2965 >> 0 & 0xFF) / 255.0F);
			local130.aClass456_9.method29343(arg0.aClass487_77);
			local130.aClass456_9.method29342(1.0F / (arg0.aFloat218 - arg0.aFloat217));
		} else {
			local130.aClass456_9.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass463_44.method29477(0.0F, 0.0F, 0.0F);
		}
		this.method28892(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat212 != aFloat286) {
			arg0.method20801(aFloat286);
		}
		arg0.method20762(true);
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(Lclient!afa;Lclient!db;)V")
	void method28889(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class221 arg1) {
		arg0.method20762(false);
		aFloat286 = arg0.aFloat212;
		@Pc(11) float local11 = arg0.aClass487_75.aFloatArray114[2];
		@Pc(17) float local17 = arg0.aClass487_75.aFloatArray114[6];
		@Pc(23) float local23 = arg0.aClass487_75.aFloatArray114[10];
		@Pc(29) float local29 = arg0.aClass487_75.aFloatArray114[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class147_Sub3 local39 = arg1.aClass23_1.aClass147_Sub3_2;
		@Pc(75) int local75;
		for (@Pc(42) Class147_Sub3 local42 = local39.aClass147_Sub3_7; local42 != local39; local42 = local42.aClass147_Sub3_7) {
			@Pc(48) Class147_Sub3_Sub1 local48 = (Class147_Sub3_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3247 >> 12) + local17 * (float) (local48.anInt3248 >> 12) + local23 * (float) (local48.anInt3251 >> 12) + local29);
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
			local75 = Class702.method37107(local99, 221154893) + 1 - this.anInt4581;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method21251(this.anInterface44_5);
		@Pc(130) Class127 local130 = arg0.aClass127_3;
		local130.method10144(Class487.aClass487_97);
		local130.aClass487_46.method30139();
		local130.anInt1166 = -1;
		@Pc(146) boolean local146 = arg0.anInt2985 > 0;
		if (local146) {
			local130.aClass456_9.method29337(0.0F, 0.0F, 1.0F, -arg0.aFloat217);
			local130.aClass463_44.method29477((float) (arg0.anInt2965 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2965 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2965 >> 0 & 0xFF) / 255.0F);
			local130.aClass456_9.method29343(arg0.aClass487_77);
			local130.aClass456_9.method29342(1.0F / (arg0.aFloat218 - arg0.aFloat217));
		} else {
			local130.aClass456_9.method29337(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass463_44.method29477(0.0F, 0.0F, 0.0F);
		}
		this.method28892(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat212 != aFloat286) {
			arg0.method20801(aFloat286);
		}
		arg0.method20762(true);
	}

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "(Lclient!afa;)V")
	void method28890(@OriginalArg(0) Class102_Sub1 arg0) {
		this.anInterface38_19.method29327(786336, 24);
	}

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "()V")
	void method28891() {
		this.anInterface38_19.method30837();
	}

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "(Lclient!afa;Lclient!ajr;IIILclient!js;Z)V")
	void method28892(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class147_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class127 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class147_Sub3 local2 = arg1.aClass147_Sub3_7;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4584 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray442[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray443[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class147_Sub3_Sub1 local46 = (Class147_Sub3_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3244;
					local8 = local46.aBoolean636;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3244 || local8 != local46.aBoolean636)) {
					local10 = true;
					break;
				}
				this.method28884(this.anIntArray441[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass147_Sub3_7;
			}
			arg5.anInterface34_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class227 local96 = arg0.aClass235_6.method26120(local6, 73831368);
				if (local96.aBoolean753) {
					arg5.anInterface34_17 = arg0.aClass395_3.method28692(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass608_2 == Class608.aClass608_3) {
					local107 = local96.aByte113;
				}
				arg0.method21134(local107);
			}
			if (local8 && arg0.aFloat212 != aFloat286) {
				arg0.method20801(aFloat286);
			} else if (arg0.aFloat212 != 1.0F) {
				arg0.method20801(1.0F);
			}
			this.method28894(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "()V")
	void method28893() {
		this.anInterface38_19.method30837();
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(Lclient!afa;IZ)V")
	void method28894(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class487 local4 = arg0.aClass487_75;
		@Pc(9) float local9 = local4.aFloatArray114[0];
		@Pc(14) float local14 = local4.aFloatArray114[4];
		@Pc(19) float local19 = local4.aFloatArray114[8];
		@Pc(24) float local24 = local4.aFloatArray114[1];
		@Pc(29) float local29 = local4.aFloatArray114[5];
		@Pc(34) float local34 = local4.aFloatArray114[9];
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
		arg0.aClass487_80.method30076(arg0.aClass487_76);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer7;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray442[local91] > 64 ? 64 : this.anIntArray442[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class147_Sub3_Sub1 local121 = this.aClass147_Sub3_Sub1ArrayArray3[local91][local112];
					@Pc(124) int local124 = local121.anInt3246;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2973 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt3247 >> 12);
					local163 = local121.anInt3248 >> 12;
					local169 = local121.anInt3251 >> 12;
					@Pc(174) int local174 = local121.anInt3250 >> 12;
					if (local121.aShort110 == 0) {
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
						arg0.aClass487_81.method30109(local121.aShort110, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass487_81.method30078(arg0.aClass487_80);
						arg0.aClass487_81.method30085(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass487_81.method30085(0.0F, 1.0F, 0.0F, local76);
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
				if (this.anIntArray442[local91] > 64) {
					local112 = this.anIntArray442[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray443[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class147_Sub3_Sub1 local688 = this.aClass147_Sub3_Sub1ArrayArray4[local112][local679];
						@Pc(691) int local691 = local688.anInt3246;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt3247 >> 12;
						local169 = local688.anInt3248 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt3251 >> 12);
						@Pc(732) int local732 = local688.anInt3250 >> 12;
						if (arg0.anInt2973 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort110 == 0) {
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
							arg0.aClass487_81.method30109(local688.aShort110, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass487_81.method30078(arg0.aClass487_80);
							arg0.aClass487_81.method30085(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass487_81.method30085(0.0F, 1.0F, 0.0F, local76);
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
		this.anInterface38_19.method29383(0, local84.position(), arg0.aLong168);
		arg0.method21250(0, this.anInterface38_19);
		arg0.method21250(1, this.anInterface38_20);
		arg0.method21158(this.aClass135_24);
		@Pc(1252) Class127 local1252 = arg0.aClass127_3;
		local1252.method10145(local1, arg2);
	}

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "(Lclient!afa;Lclient!ajr;IIILclient!js;Z)V")
	void method28895(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class147_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class127 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class147_Sub3 local2 = arg1.aClass147_Sub3_7;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4584 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray442[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray443[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class147_Sub3_Sub1 local46 = (Class147_Sub3_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3244;
					local8 = local46.aBoolean636;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3244 || local8 != local46.aBoolean636)) {
					local10 = true;
					break;
				}
				this.method28884(this.anIntArray441[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass147_Sub3_7;
			}
			arg5.anInterface34_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class227 local96 = arg0.aClass235_6.method26120(local6, 73831368);
				if (local96.aBoolean753) {
					arg5.anInterface34_17 = arg0.aClass395_3.method28692(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass608_2 == Class608.aClass608_3) {
					local107 = local96.aByte113;
				}
				arg0.method21134(local107);
			}
			if (local8 && arg0.aFloat212 != aFloat286) {
				arg0.method20801(aFloat286);
			} else if (arg0.aFloat212 != 1.0F) {
				arg0.method20801(1.0F);
			}
			this.method28894(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "(ILclient!aqg;)V")
	void method28896(@OriginalArg(0) int arg0, @OriginalArg(1) Class147_Sub3_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray442[arg0] < 64) {
			this.aClass147_Sub3_Sub1ArrayArray3[arg0][this.anIntArray442[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray442[arg0] == 64) {
			if (this.anInt4584 == 64) {
				return;
			}
			this.anIntArray442[arg0] += this.anInt4584++ + 1;
		}
		this.aClass147_Sub3_Sub1ArrayArray4[this.anIntArray442[arg0] - 64 - 1][this.anIntArray443[this.anIntArray442[arg0] - 64 - 1]++] = arg1;
	}
}
