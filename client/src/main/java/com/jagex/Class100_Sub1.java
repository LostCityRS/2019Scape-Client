package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aef")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!aef", name = "w", descriptor = "Z")
	boolean aBoolean53;

	@OriginalMember(owner = "client!aef", name = "l", descriptor = "I")
	int anInt353;

	@OriginalMember(owner = "client!aef", name = "u", descriptor = "I")
	int anInt351;

	@OriginalMember(owner = "client!aef", name = "z", descriptor = "I")
	int anInt354;

	@OriginalMember(owner = "client!aef", name = "p", descriptor = "I")
	int anInt352;

	@OriginalMember(owner = "client!aef", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_1;

	@OriginalMember(owner = "client!aef", name = "k", descriptor = "I")
	final int anInt350;

	@OriginalMember(owner = "client!aef", name = "f", descriptor = "I")
	final int anInt349;

	@OriginalMember(owner = "client!aef", name = "m", descriptor = "Lclient!dp;")
	final Interface18 anInterface18_1;

	@OriginalMember(owner = "client!aef", name = "n", descriptor = "Lclient!lz;")
	final Interface38 anInterface38_2;

	@OriginalMember(owner = "client!aef", name = "d", descriptor = "Z")
	final boolean aBoolean52;

	@OriginalMember(owner = "client!aef", name = "c", descriptor = "Z")
	final boolean aBoolean54;

	@OriginalMember(owner = "client!aef", name = "r", descriptor = "Z")
	final boolean aBoolean55;

	@OriginalMember(owner = "client!aef", name = "v", descriptor = "Z")
	final boolean aBoolean56;

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!afc;II[III)V")
	Class100_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aBoolean53 = false;
		this.anInt353 = 0;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt352 = 0;
		this.aClass104_Sub2_1 = arg0;
		this.anInt350 = arg1;
		this.anInt349 = arg2;
		this.anInterface18_1 = null;
		this.anInterface38_2 = arg0.method20973(arg1, arg2, false, arg3, arg4, arg5);
		this.anInterface38_2.method11344(true, true);
		this.aBoolean52 = this.anInterface38_2.method11362() != arg1;
		this.aBoolean54 = this.anInterface38_2.method11340() != arg2;
		this.aBoolean55 = !this.aBoolean52 && this.anInterface38_2.method11376();
		this.aBoolean56 = !this.aBoolean54 && this.anInterface38_2.method11376();
	}

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!afc;Lclient!lz;II)V")
	Class100_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Interface38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean53 = false;
		this.anInt353 = 0;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt352 = 0;
		this.aClass104_Sub2_1 = arg0;
		this.anInt350 = arg2;
		this.anInt349 = arg3;
		this.anInterface38_2 = arg1;
		this.anInterface18_1 = null;
		this.aBoolean52 = this.anInterface38_2.method11362() != arg2;
		this.aBoolean54 = this.anInterface38_2.method11340() != arg3;
		this.aBoolean55 = !this.aBoolean52 && this.anInterface38_2.method11376();
		this.aBoolean56 = !this.aBoolean54 && this.anInterface38_2.method11376();
	}

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!afc;IIZZ)V")
	Class100_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean53 = false;
		this.anInt353 = 0;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt352 = 0;
		this.aClass104_Sub2_1 = arg0;
		this.anInt350 = arg1;
		this.anInt349 = arg2;
		if (arg4) {
			@Pc(38) Interface42 local38 = arg0.method21029(arg3 ? Class206.aClass206_22 : Class206.aClass206_20, Class226.aClass226_22, arg1, arg2);
			this.anInterface18_1 = local38.method11381(0);
			this.anInterface38_2 = local38;
		} else {
			this.anInterface38_2 = arg0.method20970(arg3 ? Class206.aClass206_22 : Class206.aClass206_20, Class226.aClass226_22, arg1, arg2);
			this.anInterface18_1 = null;
		}
		this.anInterface38_2.method11344(true, true);
		this.aBoolean52 = this.anInterface38_2.method11362() != arg1;
		this.aBoolean54 = this.anInterface38_2.method11340() != arg2;
		this.aBoolean55 = !this.aBoolean52 && this.anInterface38_2.method11376();
		this.aBoolean56 = !this.aBoolean54 && this.anInterface38_2.method11376();
	}

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!afc;Lclient!lz;)V")
	Class100_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Interface38 arg1) {
		this(arg0, arg1, arg1.method11362(), arg1.method11340());
	}

	@OriginalMember(owner = "client!aef", name = "aa", descriptor = "(IIII)V")
	@Override
	public void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt351 = arg0;
		this.anInt353 = arg1;
		this.anInt352 = arg2;
		this.anInt354 = arg3;
		this.aBoolean53 = this.anInt351 != 0 || this.anInt353 != 0 || this.anInt352 != 0 || this.anInt354 != 0;
	}

	@OriginalMember(owner = "client!aef", name = "u", descriptor = "(IIII[III)V")
	@Override
	public void method18211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface38_2.method11345(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aef", name = "l", descriptor = "()Lclient!dp;")
	@Override
	public Interface18 method18179() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aef", name = "bd", descriptor = "(IIIIIII)V")
	@Override
	public void method18229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18172();
			@Pc(18) int local18 = this.method18178();
			@Pc(23) int local23 = arg1 + this.anInt353;
			for (local28 = local23 + this.anInt349; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt351;
				for (local41 = local36 + this.anInt350; local41 <= local12; local41 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + this.anInt350), (float) (local23 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt349), 0.0F, 0.0F, (float) local89 / (float) this.anInt350 * this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt349 * this.anInterface38_2.method11351();
				local89 = arg0 + this.anInt351;
				for (local161 = local89 + this.anInt350; local161 <= local12; local161 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + this.anInt350), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt350 * this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
				}
			}
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(250) Class134 local250 = this.aClass104_Sub2_1.aClass134_3;
		local250.anInterface38_20 = this.anInterface38_2;
		local250.method10197(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass104_Sub2_1.method20446((byte) -97).method23748();
		@Pc(272) float local272 = (float) this.aClass104_Sub2_1.method20446((byte) -14).method23749();
		local250.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local250.anInt1174 = 0;
		local250.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(298) boolean local298 = this.aBoolean56 && this.anInt353 == 0 && this.anInt354 == 0;
		@Pc(311) boolean local311 = this.aBoolean55 && this.anInt351 == 0 && this.anInt352 == 0;
		if (local311 & local298) {
			local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
			local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
			local250.aClass489_48.aFloatArray116[14] = -1.0F;
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local250.method10198();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18178();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
			local41 = arg1 + this.anInt353;
			for (local89 = local41 + this.anInt349; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) local161), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18172();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt351;
			for (local89 = local41 + this.anInt350; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local161), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18172();
			local89 = this.method18178();
			local161 = arg1 + this.anInt353;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt349; local206 <= local28; local206 += local89) {
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
				local817 = arg0 + this.anInt351;
				for (local822 = local817 + this.anInt350; local822 <= local36; local822 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local902), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local902 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt351;
				for (local902 = local822 + this.anInt350; local902 <= local36; local902 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local1099), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aef", name = "p", descriptor = "(IIIIII)V")
	@Override
	public void method18182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface38_2.method11363(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aef", name = "ag", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			this.aClass104_Sub2_1.aClass414_3.method28864(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface38_2.method11378(), 0.0F, 0.0F, this.anInterface38_2.method11351(), this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg7);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean53) {
			@Pc(58) float local58 = (float) this.method18172();
			local62 = this.method18178();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt353;
			@Pc(98) float local98 = local86 * (float) this.anInt353;
			@Pc(104) float local104 = local68 * (float) this.anInt351;
			@Pc(110) float local110 = local74 * (float) this.anInt351;
			@Pc(117) float local117 = -local68 * (float) this.anInt352;
			@Pc(124) float local124 = -local74 * (float) this.anInt352;
			@Pc(131) float local131 = -local80 * (float) this.anInt354;
			@Pc(138) float local138 = -local86 * (float) this.anInt354;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class134 local178 = this.aClass104_Sub2_1.aClass134_3;
		local178.anInterface38_20 = this.anInterface38_2;
		local178.method10197(arg6, arg7);
		local62 = this.aClass104_Sub2_1.method20446((byte) -103).method23748();
		local68 = this.aClass104_Sub2_1.method20446((byte) 0).method23749();
		local178.aClass489_48.method30017();
		local178.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[12] = (arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local62 - 1.0F;
		local178.aClass489_48.aFloatArray116[13] = (arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local68 - 1.0F;
		local178.aClass489_48.aFloatArray116[14] = -1.0F;
		local178.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local178.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local178.anInt1174 = 0;
		local178.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local178.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "k", descriptor = "()I")
	@Override
	public int method18172() {
		return this.anInt350 + this.anInt351 + this.anInt352;
	}

	@OriginalMember(owner = "client!aef", name = "f", descriptor = "()I")
	@Override
	public int method18177() {
		return this.anInt349;
	}

	@OriginalMember(owner = "client!aef", name = "bl", descriptor = "()I")
	@Override
	public int method18225() {
		return this.anInt349;
	}

	@OriginalMember(owner = "client!aef", name = "bn", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			this.aClass104_Sub2_1.aClass414_3.method28864(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface38_2.method11378(), 0.0F, 0.0F, this.anInterface38_2.method11351(), this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg7);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean53) {
			@Pc(58) float local58 = (float) this.method18172();
			local62 = this.method18178();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt353;
			@Pc(98) float local98 = local86 * (float) this.anInt353;
			@Pc(104) float local104 = local68 * (float) this.anInt351;
			@Pc(110) float local110 = local74 * (float) this.anInt351;
			@Pc(117) float local117 = -local68 * (float) this.anInt352;
			@Pc(124) float local124 = -local74 * (float) this.anInt352;
			@Pc(131) float local131 = -local80 * (float) this.anInt354;
			@Pc(138) float local138 = -local86 * (float) this.anInt354;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class134 local178 = this.aClass104_Sub2_1.aClass134_3;
		local178.anInterface38_20 = this.anInterface38_2;
		local178.method10197(arg6, arg7);
		local62 = this.aClass104_Sub2_1.method20446((byte) -7).method23748();
		local68 = this.aClass104_Sub2_1.method20446((byte) -23).method23749();
		local178.aClass489_48.method30017();
		local178.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[12] = (arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local62 - 1.0F;
		local178.aClass489_48.aFloatArray116[13] = (arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local68 - 1.0F;
		local178.aClass489_48.aFloatArray116[14] = -1.0F;
		local178.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local178.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local178.anInt1174 = 0;
		local178.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local178.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "d", descriptor = "(III)V")
	@Override
	public void method18183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass104_Sub2_1.method20460(arg0, arg1, this.anInt350, this.anInt349);
		@Pc(16) int[] local16 = new int[this.anInt350 * this.anInt349];
		this.anInterface38_2.method11347(0, 0, this.anInt350, this.anInt349, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18211(0, 0, this.anInt350, this.anInt349, local16, 0, this.anInt350);
	}

	@OriginalMember(owner = "client!aef", name = "z", descriptor = "(IIII[I[III)V")
	@Override
	public void method18217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface38_2.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aef", name = "r", descriptor = "(IIIII)V")
	@Override
	public void method18185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			local9 = arg0 + this.anInt351;
			local14 = arg1 + this.anInt353;
			this.aClass104_Sub2_1.aClass414_3.method28855((float) local9, (float) local14, (float) (local9 + this.anInt350), (float) (local14 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg3);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg4);
		@Pc(55) Class134 local55 = this.aClass104_Sub2_1.aClass134_3;
		local55.anInterface38_20 = this.anInterface38_2;
		local55.method10197(arg2, arg3);
		local9 = arg0 + this.anInt351;
		local14 = arg1 + this.anInt353;
		@Pc(80) float local80 = (float) this.aClass104_Sub2_1.method20446((byte) -35).method23748();
		@Pc(87) float local87 = (float) this.aClass104_Sub2_1.method20446((byte) -119).method23749();
		local55.aClass489_48.method30026((float) this.anInt350 * 2.0F / local80, (float) this.anInt349 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass489_48.aFloatArray116[12] = ((float) local9 + this.aClass104_Sub2_1.method20894()) * 2.0F / local80 - 1.0F;
		local55.aClass489_48.aFloatArray116[13] = ((float) local14 + this.aClass104_Sub2_1.method20894()) * 2.0F / local87 - 1.0F;
		local55.aClass489_48.aFloatArray116[14] = -1.0F;
		local55.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local55.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local55.anInt1174 = 0;
		local55.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local55.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "v", descriptor = "(IILclient!ch;II)V")
	@Override
	public void method18186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_1.method20921();
		@Pc(6) Class134 local6 = this.aClass104_Sub2_1.aClass134_3;
		local6.anInterface38_20 = this.anInterface38_2;
		local6.method10197(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt351;
		@Pc(24) int local24 = arg1 + this.anInt353;
		@Pc(31) float local31 = (float) this.aClass104_Sub2_1.method20446((byte) -120).method23748();
		@Pc(38) float local38 = (float) this.aClass104_Sub2_1.method20446((byte) -39).method23749();
		local6.aClass489_48.method30026((float) this.anInt350 * 2.0F / local31, (float) this.anInt349 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass489_48.aFloatArray116[12] = ((float) local19 + this.aClass104_Sub2_1.method20894()) * 2.0F / local31 - 1.0F;
		local6.aClass489_48.aFloatArray116[13] = ((float) local24 + this.aClass104_Sub2_1.method20894()) * 2.0F / local38 - 1.0F;
		local6.aClass489_48.aFloatArray116[14] = -1.0F;
		local6.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local6.anInt1174 = 0;
		local6.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(131) Interface38 local131 = ((Class96_Sub2) arg2).anInterface38_1;
		local6.anInterface38_19 = local131;
		local6.aClass489_50.method30026(local131.method11341((float) this.anInt350), local131.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.aClass489_50.aFloatArray116[12] = local131.method11341((float) (local19 - arg3));
		local6.aClass489_50.aFloatArray116[13] = local131.method11342((float) (local24 - arg4));
		local6.method10201();
	}

	@OriginalMember(owner = "client!aef", name = "y", descriptor = "(IIIIIIII)V")
	@Override
	void method18189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			if (this.aBoolean53) {
				arg2 = arg2 * this.anInt350 / this.method18172();
				arg3 = arg3 * this.anInt349 / this.method18178();
				arg0 += this.anInt351 * arg2 / this.anInt350;
				arg1 += this.anInt353 * arg3 / this.anInt349;
			}
			this.aClass104_Sub2_1.aClass414_3.method28855((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface38_2.method11341(0.0F), this.anInterface38_2.method11342(0.0F), this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), this.anInterface38_2, arg5);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(94) Class134 local94 = this.aClass104_Sub2_1.aClass134_3;
		local94.anInterface38_20 = this.anInterface38_2;
		local94.method10197(arg4, arg5);
		if (this.aBoolean53) {
			arg2 = arg2 * this.anInt350 / this.method18172();
			arg3 = arg3 * this.anInt349 / this.method18178();
			arg0 += this.anInt351 * arg2 / this.anInt350;
			arg1 += this.anInt353 * arg3 / this.anInt349;
		}
		@Pc(148) float local148 = (float) this.aClass104_Sub2_1.method20446((byte) -21).method23748();
		@Pc(155) float local155 = (float) this.aClass104_Sub2_1.method20446((byte) -5).method23749();
		local94.aClass489_48.method30026((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local148 - 1.0F;
		local94.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local155 - 1.0F;
		local94.aClass489_48.aFloatArray116[14] = -1.0F;
		local94.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local94.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local94.anInt1174 = 0;
		local94.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local94.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "x", descriptor = "(IIIIIII)V")
	@Override
	public void method18191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18172();
			@Pc(18) int local18 = this.method18178();
			@Pc(23) int local23 = arg1 + this.anInt353;
			for (local28 = local23 + this.anInt349; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt351;
				for (local41 = local36 + this.anInt350; local41 <= local12; local41 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + this.anInt350), (float) (local23 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt349), 0.0F, 0.0F, (float) local89 / (float) this.anInt350 * this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt349 * this.anInterface38_2.method11351();
				local89 = arg0 + this.anInt351;
				for (local161 = local89 + this.anInt350; local161 <= local12; local161 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + this.anInt350), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt350 * this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
				}
			}
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(250) Class134 local250 = this.aClass104_Sub2_1.aClass134_3;
		local250.anInterface38_20 = this.anInterface38_2;
		local250.method10197(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass104_Sub2_1.method20446((byte) -99).method23748();
		@Pc(272) float local272 = (float) this.aClass104_Sub2_1.method20446((byte) -32).method23749();
		local250.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local250.anInt1174 = 0;
		local250.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(298) boolean local298 = this.aBoolean56 && this.anInt353 == 0 && this.anInt354 == 0;
		@Pc(311) boolean local311 = this.aBoolean55 && this.anInt351 == 0 && this.anInt352 == 0;
		if (local311 & local298) {
			local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
			local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
			local250.aClass489_48.aFloatArray116[14] = -1.0F;
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local250.method10198();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18178();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
			local41 = arg1 + this.anInt353;
			for (local89 = local41 + this.anInt349; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) local161), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18172();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt351;
			for (local89 = local41 + this.anInt350; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local161), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18172();
			local89 = this.method18178();
			local161 = arg1 + this.anInt353;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt349; local206 <= local28; local206 += local89) {
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
				local817 = arg0 + this.anInt351;
				for (local822 = local817 + this.anInt350; local822 <= local36; local822 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local902), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local902 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt351;
				for (local902 = local822 + this.anInt350; local902 <= local36; local902 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local1099), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aef", name = "m", descriptor = "()I")
	@Override
	public int method18201() {
		return this.anInt350;
	}

	@OriginalMember(owner = "client!aef", name = "al", descriptor = "(FFFFFFILclient!ch;II)V")
	@Override
	void method18196(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass104_Sub2_1.method20921();
		@Pc(6) Class134 local6 = this.aClass104_Sub2_1.aClass134_3;
		local6.anInterface38_20 = this.anInterface38_2;
		local6.method10197(1, -1);
		@Pc(21) float local21 = (float) this.aClass104_Sub2_1.method20446((byte) -117).method23748();
		@Pc(28) float local28 = (float) this.aClass104_Sub2_1.method20446((byte) -50).method23749();
		local6.aClass489_48.method30017();
		if (this.aBoolean53) {
			@Pc(42) float local42 = (float) this.anInt350 / (float) this.method18172();
			@Pc(50) float local50 = (float) this.anInt349 / (float) this.method18178();
			local6.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * local42;
			local6.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * local42;
			local6.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * local50;
			local6.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * local50;
			local6.aClass489_48.aFloatArray116[12] = (arg0 + (float) this.anInt351) * local42 + this.aClass104_Sub2_1.method20894();
			local6.aClass489_48.aFloatArray116[13] = (arg1 + (float) this.anInt353) * local50 + this.aClass104_Sub2_1.method20894();
		} else {
			local6.aClass489_48.aFloatArray116[0] = arg2 - arg0;
			local6.aClass489_48.aFloatArray116[1] = arg3 - arg1;
			local6.aClass489_48.aFloatArray116[4] = arg4 - arg0;
			local6.aClass489_48.aFloatArray116[5] = arg5 - arg1;
			local6.aClass489_48.aFloatArray116[12] = arg0 + this.aClass104_Sub2_1.method20894();
			local6.aClass489_48.aFloatArray116[13] = arg1 + this.aClass104_Sub2_1.method20894();
		}
		@Pc(179) Class489 local179 = this.aClass104_Sub2_1.aClass489_78;
		local179.method30017();
		local179.aFloatArray116[0] = 2.0F / local21;
		local179.aFloatArray116[5] = 2.0F / local28;
		local179.aFloatArray116[12] = -1.0F;
		local179.aFloatArray116[13] = -1.0F;
		local179.aFloatArray116[14] = -1.0F;
		local6.aClass489_48.method30134(local179);
		local6.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local6.anInt1174 = 0;
		local6.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(248) Interface38 local248 = ((Class96_Sub2) arg7).anInterface38_1;
		local6.anInterface38_19 = local248;
		local6.aClass489_50.method30017();
		local6.aClass489_50.aFloatArray116[0] = (arg2 - arg0) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[1] = (arg3 - arg1) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[4] = (arg4 - arg0) * local248.method11342(1.0F);
		local6.aClass489_50.aFloatArray116[5] = (arg5 - arg1) * local248.method11342(1.0F);
		local6.aClass489_50.aFloatArray116[12] = (arg0 - (float) arg8) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[13] = (arg1 - (float) arg9) * local248.method11342(1.0F);
		local6.method10201();
	}

	@OriginalMember(owner = "client!aef", name = "ac", descriptor = "(IIII[III)V")
	@Override
	public void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface38_2.method11345(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aef", name = "ai", descriptor = "(IIII[I[III)V")
	@Override
	public void method18204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface38_2.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aef", name = "aw", descriptor = "(IIII[I[III)V")
	@Override
	public void method18205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface38_2.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aef", name = "as", descriptor = "(IIIIII)V")
	@Override
	public void method18208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface38_2.method11363(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aef", name = "at", descriptor = "(IIIIII)V")
	@Override
	public void method18200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface38_2.method11363(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aef", name = "bh", descriptor = "()I")
	@Override
	public int method18171() {
		return this.anInt350 + this.anInt351 + this.anInt352;
	}

	@OriginalMember(owner = "client!aef", name = "am", descriptor = "(III)V")
	@Override
	public void method18209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass104_Sub2_1.method20460(arg0, arg1, this.anInt350, this.anInt349);
		@Pc(16) int[] local16 = new int[this.anInt350 * this.anInt349];
		this.anInterface38_2.method11347(0, 0, this.anInt350, this.anInt349, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18211(0, 0, this.anInt350, this.anInt349, local16, 0, this.anInt350);
	}

	@OriginalMember(owner = "client!aef", name = "au", descriptor = "(III)V")
	@Override
	public void method18210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass104_Sub2_1.method20460(arg0, arg1, this.anInt350, this.anInt349);
		@Pc(16) int[] local16 = new int[this.anInt350 * this.anInt349];
		this.anInterface38_2.method11347(0, 0, this.anInt350, this.anInt349, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18211(0, 0, this.anInt350, this.anInt349, local16, 0, this.anInt350);
	}

	@OriginalMember(owner = "client!aef", name = "ar", descriptor = "()Lclient!dp;")
	@Override
	public Interface18 method18235() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aef", name = "ap", descriptor = "()Lclient!dp;")
	@Override
	public Interface18 method18212() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aef", name = "aq", descriptor = "(IIIII)V")
	@Override
	public void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			local9 = arg0 + this.anInt351;
			local14 = arg1 + this.anInt353;
			this.aClass104_Sub2_1.aClass414_3.method28855((float) local9, (float) local14, (float) (local9 + this.anInt350), (float) (local14 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg3);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg4);
		@Pc(55) Class134 local55 = this.aClass104_Sub2_1.aClass134_3;
		local55.anInterface38_20 = this.anInterface38_2;
		local55.method10197(arg2, arg3);
		local9 = arg0 + this.anInt351;
		local14 = arg1 + this.anInt353;
		@Pc(80) float local80 = (float) this.aClass104_Sub2_1.method20446((byte) -49).method23748();
		@Pc(87) float local87 = (float) this.aClass104_Sub2_1.method20446((byte) -31).method23749();
		local55.aClass489_48.method30026((float) this.anInt350 * 2.0F / local80, (float) this.anInt349 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass489_48.aFloatArray116[12] = ((float) local9 + this.aClass104_Sub2_1.method20894()) * 2.0F / local80 - 1.0F;
		local55.aClass489_48.aFloatArray116[13] = ((float) local14 + this.aClass104_Sub2_1.method20894()) * 2.0F / local87 - 1.0F;
		local55.aClass489_48.aFloatArray116[14] = -1.0F;
		local55.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local55.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local55.anInt1174 = 0;
		local55.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local55.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "ax", descriptor = "(IIIII)V")
	@Override
	public void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			local9 = arg0 + this.anInt351;
			local14 = arg1 + this.anInt353;
			this.aClass104_Sub2_1.aClass414_3.method28855((float) local9, (float) local14, (float) (local9 + this.anInt350), (float) (local14 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg3);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg4);
		@Pc(55) Class134 local55 = this.aClass104_Sub2_1.aClass134_3;
		local55.anInterface38_20 = this.anInterface38_2;
		local55.method10197(arg2, arg3);
		local9 = arg0 + this.anInt351;
		local14 = arg1 + this.anInt353;
		@Pc(80) float local80 = (float) this.aClass104_Sub2_1.method20446((byte) -31).method23748();
		@Pc(87) float local87 = (float) this.aClass104_Sub2_1.method20446((byte) -118).method23749();
		local55.aClass489_48.method30026((float) this.anInt350 * 2.0F / local80, (float) this.anInt349 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass489_48.aFloatArray116[12] = ((float) local9 + this.aClass104_Sub2_1.method20894()) * 2.0F / local80 - 1.0F;
		local55.aClass489_48.aFloatArray116[13] = ((float) local14 + this.aClass104_Sub2_1.method20894()) * 2.0F / local87 - 1.0F;
		local55.aClass489_48.aFloatArray116[14] = -1.0F;
		local55.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local55.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local55.anInt1174 = 0;
		local55.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local55.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "av", descriptor = "(IILclient!ch;II)V")
	@Override
	public void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_1.method20921();
		@Pc(6) Class134 local6 = this.aClass104_Sub2_1.aClass134_3;
		local6.anInterface38_20 = this.anInterface38_2;
		local6.method10197(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt351;
		@Pc(24) int local24 = arg1 + this.anInt353;
		@Pc(31) float local31 = (float) this.aClass104_Sub2_1.method20446((byte) -29).method23748();
		@Pc(38) float local38 = (float) this.aClass104_Sub2_1.method20446((byte) -107).method23749();
		local6.aClass489_48.method30026((float) this.anInt350 * 2.0F / local31, (float) this.anInt349 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass489_48.aFloatArray116[12] = ((float) local19 + this.aClass104_Sub2_1.method20894()) * 2.0F / local31 - 1.0F;
		local6.aClass489_48.aFloatArray116[13] = ((float) local24 + this.aClass104_Sub2_1.method20894()) * 2.0F / local38 - 1.0F;
		local6.aClass489_48.aFloatArray116[14] = -1.0F;
		local6.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local6.anInt1174 = 0;
		local6.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(131) Interface38 local131 = ((Class96_Sub2) arg2).anInterface38_1;
		local6.anInterface38_19 = local131;
		local6.aClass489_50.method30026(local131.method11341((float) this.anInt350), local131.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.aClass489_50.aFloatArray116[12] = local131.method11341((float) (local19 - arg3));
		local6.aClass489_50.aFloatArray116[13] = local131.method11342((float) (local24 - arg4));
		local6.method10201();
	}

	@OriginalMember(owner = "client!aef", name = "ao", descriptor = "(IILclient!ch;II)V")
	@Override
	public void method18237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub2_1.method20921();
		@Pc(6) Class134 local6 = this.aClass104_Sub2_1.aClass134_3;
		local6.anInterface38_20 = this.anInterface38_2;
		local6.method10197(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt351;
		@Pc(24) int local24 = arg1 + this.anInt353;
		@Pc(31) float local31 = (float) this.aClass104_Sub2_1.method20446((byte) -81).method23748();
		@Pc(38) float local38 = (float) this.aClass104_Sub2_1.method20446((byte) -20).method23749();
		local6.aClass489_48.method30026((float) this.anInt350 * 2.0F / local31, (float) this.anInt349 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass489_48.aFloatArray116[12] = ((float) local19 + this.aClass104_Sub2_1.method20894()) * 2.0F / local31 - 1.0F;
		local6.aClass489_48.aFloatArray116[13] = ((float) local24 + this.aClass104_Sub2_1.method20894()) * 2.0F / local38 - 1.0F;
		local6.aClass489_48.aFloatArray116[14] = -1.0F;
		local6.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local6.anInt1174 = 0;
		local6.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(131) Interface38 local131 = ((Class96_Sub2) arg2).anInterface38_1;
		local6.anInterface38_19 = local131;
		local6.aClass489_50.method30026(local131.method11341((float) this.anInt350), local131.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.aClass489_50.aFloatArray116[12] = local131.method11341((float) (local19 - arg3));
		local6.aClass489_50.aFloatArray116[13] = local131.method11342((float) (local24 - arg4));
		local6.method10201();
	}

	@OriginalMember(owner = "client!aef", name = "aj", descriptor = "(IIIIIIII)V")
	@Override
	void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			if (this.aBoolean53) {
				arg2 = arg2 * this.anInt350 / this.method18172();
				arg3 = arg3 * this.anInt349 / this.method18178();
				arg0 += this.anInt351 * arg2 / this.anInt350;
				arg1 += this.anInt353 * arg3 / this.anInt349;
			}
			this.aClass104_Sub2_1.aClass414_3.method28855((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface38_2.method11341(0.0F), this.anInterface38_2.method11342(0.0F), this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), this.anInterface38_2, arg5);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(94) Class134 local94 = this.aClass104_Sub2_1.aClass134_3;
		local94.anInterface38_20 = this.anInterface38_2;
		local94.method10197(arg4, arg5);
		if (this.aBoolean53) {
			arg2 = arg2 * this.anInt350 / this.method18172();
			arg3 = arg3 * this.anInt349 / this.method18178();
			arg0 += this.anInt351 * arg2 / this.anInt350;
			arg1 += this.anInt353 * arg3 / this.anInt349;
		}
		@Pc(148) float local148 = (float) this.aClass104_Sub2_1.method20446((byte) -117).method23748();
		@Pc(155) float local155 = (float) this.aClass104_Sub2_1.method20446((byte) -113).method23749();
		local94.aClass489_48.method30026((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local148 - 1.0F;
		local94.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local155 - 1.0F;
		local94.aClass489_48.aFloatArray116[14] = -1.0F;
		local94.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local94.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local94.anInt1174 = 0;
		local94.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local94.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "ay", descriptor = "(IIIIIIII)V")
	@Override
	void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			if (this.aBoolean53) {
				arg2 = arg2 * this.anInt350 / this.method18172();
				arg3 = arg3 * this.anInt349 / this.method18178();
				arg0 += this.anInt351 * arg2 / this.anInt350;
				arg1 += this.anInt353 * arg3 / this.anInt349;
			}
			this.aClass104_Sub2_1.aClass414_3.method28855((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface38_2.method11341(0.0F), this.anInterface38_2.method11342(0.0F), this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), this.anInterface38_2, arg5);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(94) Class134 local94 = this.aClass104_Sub2_1.aClass134_3;
		local94.anInterface38_20 = this.anInterface38_2;
		local94.method10197(arg4, arg5);
		if (this.aBoolean53) {
			arg2 = arg2 * this.anInt350 / this.method18172();
			arg3 = arg3 * this.anInt349 / this.method18178();
			arg0 += this.anInt351 * arg2 / this.anInt350;
			arg1 += this.anInt353 * arg3 / this.anInt349;
		}
		@Pc(148) float local148 = (float) this.aClass104_Sub2_1.method20446((byte) -88).method23748();
		@Pc(155) float local155 = (float) this.aClass104_Sub2_1.method20446((byte) -56).method23749();
		local94.aClass489_48.method30026((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local148 - 1.0F;
		local94.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local155 - 1.0F;
		local94.aClass489_48.aFloatArray116[14] = -1.0F;
		local94.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local94.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local94.anInt1174 = 0;
		local94.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local94.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "ab", descriptor = "(IIIIIIII)V")
	@Override
	void method18218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			if (this.aBoolean53) {
				arg2 = arg2 * this.anInt350 / this.method18172();
				arg3 = arg3 * this.anInt349 / this.method18178();
				arg0 += this.anInt351 * arg2 / this.anInt350;
				arg1 += this.anInt353 * arg3 / this.anInt349;
			}
			this.aClass104_Sub2_1.aClass414_3.method28855((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface38_2.method11341(0.0F), this.anInterface38_2.method11342(0.0F), this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), this.anInterface38_2, arg5);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(94) Class134 local94 = this.aClass104_Sub2_1.aClass134_3;
		local94.anInterface38_20 = this.anInterface38_2;
		local94.method10197(arg4, arg5);
		if (this.aBoolean53) {
			arg2 = arg2 * this.anInt350 / this.method18172();
			arg3 = arg3 * this.anInt349 / this.method18178();
			arg0 += this.anInt351 * arg2 / this.anInt350;
			arg1 += this.anInt353 * arg3 / this.anInt349;
		}
		@Pc(148) float local148 = (float) this.aClass104_Sub2_1.method20446((byte) -20).method23748();
		@Pc(155) float local155 = (float) this.aClass104_Sub2_1.method20446((byte) 1).method23749();
		local94.aClass489_48.method30026((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local148 - 1.0F;
		local94.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local155 - 1.0F;
		local94.aClass489_48.aFloatArray116[14] = -1.0F;
		local94.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local94.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local94.anInt1174 = 0;
		local94.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local94.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "az", descriptor = "(IIII)V")
	@Override
	public void method18220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt351 = arg0;
		this.anInt353 = arg1;
		this.anInt352 = arg2;
		this.anInt354 = arg3;
		this.aBoolean53 = this.anInt351 != 0 || this.anInt353 != 0 || this.anInt352 != 0 || this.anInt354 != 0;
	}

	@OriginalMember(owner = "client!aef", name = "w", descriptor = "()I")
	@Override
	public int method18178() {
		return this.anInt349 + this.anInt353 + this.anInt354;
	}

	@OriginalMember(owner = "client!aef", name = "e", descriptor = "(IIII)V")
	@Override
	public void method18174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt351 = arg0;
		this.anInt353 = arg1;
		this.anInt352 = arg2;
		this.anInt354 = arg3;
		this.aBoolean53 = this.anInt351 != 0 || this.anInt353 != 0 || this.anInt352 != 0 || this.anInt354 != 0;
	}

	@OriginalMember(owner = "client!aef", name = "ak", descriptor = "([I)V")
	@Override
	public void method18222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt351;
		arg0[1] = this.anInt353;
		arg0[2] = this.anInt352;
		arg0[3] = this.anInt354;
	}

	@OriginalMember(owner = "client!aef", name = "an", descriptor = "()I")
	@Override
	public int method18203() {
		return this.anInt350;
	}

	@OriginalMember(owner = "client!aef", name = "af", descriptor = "([I)V")
	@Override
	public void method18221(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt351;
		arg0[1] = this.anInt353;
		arg0[2] = this.anInt352;
		arg0[3] = this.anInt354;
	}

	@OriginalMember(owner = "client!aef", name = "n", descriptor = "([I)V")
	@Override
	public void method18175(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt351;
		arg0[1] = this.anInt353;
		arg0[2] = this.anInt352;
		arg0[3] = this.anInt354;
	}

	@OriginalMember(owner = "client!aef", name = "bk", descriptor = "()I")
	@Override
	public int method18226() {
		return this.anInt349;
	}

	@OriginalMember(owner = "client!aef", name = "bq", descriptor = "(FFFFFFILclient!ch;II)V")
	@Override
	void method18187(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass104_Sub2_1.method20921();
		@Pc(6) Class134 local6 = this.aClass104_Sub2_1.aClass134_3;
		local6.anInterface38_20 = this.anInterface38_2;
		local6.method10197(1, -1);
		@Pc(21) float local21 = (float) this.aClass104_Sub2_1.method20446((byte) -25).method23748();
		@Pc(28) float local28 = (float) this.aClass104_Sub2_1.method20446((byte) -7).method23749();
		local6.aClass489_48.method30017();
		if (this.aBoolean53) {
			@Pc(42) float local42 = (float) this.anInt350 / (float) this.method18172();
			@Pc(50) float local50 = (float) this.anInt349 / (float) this.method18178();
			local6.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * local42;
			local6.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * local42;
			local6.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * local50;
			local6.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * local50;
			local6.aClass489_48.aFloatArray116[12] = (arg0 + (float) this.anInt351) * local42 + this.aClass104_Sub2_1.method20894();
			local6.aClass489_48.aFloatArray116[13] = (arg1 + (float) this.anInt353) * local50 + this.aClass104_Sub2_1.method20894();
		} else {
			local6.aClass489_48.aFloatArray116[0] = arg2 - arg0;
			local6.aClass489_48.aFloatArray116[1] = arg3 - arg1;
			local6.aClass489_48.aFloatArray116[4] = arg4 - arg0;
			local6.aClass489_48.aFloatArray116[5] = arg5 - arg1;
			local6.aClass489_48.aFloatArray116[12] = arg0 + this.aClass104_Sub2_1.method20894();
			local6.aClass489_48.aFloatArray116[13] = arg1 + this.aClass104_Sub2_1.method20894();
		}
		@Pc(179) Class489 local179 = this.aClass104_Sub2_1.aClass489_78;
		local179.method30017();
		local179.aFloatArray116[0] = 2.0F / local21;
		local179.aFloatArray116[5] = 2.0F / local28;
		local179.aFloatArray116[12] = -1.0F;
		local179.aFloatArray116[13] = -1.0F;
		local179.aFloatArray116[14] = -1.0F;
		local6.aClass489_48.method30134(local179);
		local6.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local6.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local6.anInt1174 = 0;
		local6.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(248) Interface38 local248 = ((Class96_Sub2) arg7).anInterface38_1;
		local6.anInterface38_19 = local248;
		local6.aClass489_50.method30017();
		local6.aClass489_50.aFloatArray116[0] = (arg2 - arg0) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[1] = (arg3 - arg1) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[4] = (arg4 - arg0) * local248.method11342(1.0F);
		local6.aClass489_50.aFloatArray116[5] = (arg5 - arg1) * local248.method11342(1.0F);
		local6.aClass489_50.aFloatArray116[12] = (arg0 - (float) arg8) * local248.method11341(1.0F);
		local6.aClass489_50.aFloatArray116[13] = (arg1 - (float) arg9) * local248.method11342(1.0F);
		local6.method10201();
	}

	@OriginalMember(owner = "client!aef", name = "bx", descriptor = "()I")
	@Override
	public int method18228() {
		return this.anInt349 + this.anInt353 + this.anInt354;
	}

	@OriginalMember(owner = "client!aef", name = "bc", descriptor = "(IIIIIII)V")
	@Override
	public void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18172();
			@Pc(18) int local18 = this.method18178();
			@Pc(23) int local23 = arg1 + this.anInt353;
			for (local28 = local23 + this.anInt349; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt351;
				for (local41 = local36 + this.anInt350; local41 <= local12; local41 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + this.anInt350), (float) (local23 + this.anInt349), 0.0F, 0.0F, this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt349), 0.0F, 0.0F, (float) local89 / (float) this.anInt350 * this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt349 * this.anInterface38_2.method11351();
				local89 = arg0 + this.anInt351;
				for (local161 = local89 + this.anInt350; local161 <= local12; local161 += local15) {
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + this.anInt350), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass104_Sub2_1.aClass414_3.method28855((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt350 * this.anInterface38_2.method11378(), local151, this.anInterface38_2, arg5);
				}
			}
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg6);
		@Pc(250) Class134 local250 = this.aClass104_Sub2_1.aClass134_3;
		local250.anInterface38_20 = this.anInterface38_2;
		local250.method10197(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass104_Sub2_1.method20446((byte) -15).method23748();
		@Pc(272) float local272 = (float) this.aClass104_Sub2_1.method20446((byte) -91).method23749();
		local250.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local250.anInt1174 = 0;
		local250.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		@Pc(298) boolean local298 = this.aBoolean56 && this.anInt353 == 0 && this.anInt354 == 0;
		@Pc(311) boolean local311 = this.aBoolean55 && this.anInt351 == 0 && this.anInt352 == 0;
		if (local311 & local298) {
			local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
			local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
			local250.aClass489_48.aFloatArray116[14] = -1.0F;
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local250.method10198();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18178();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
			local41 = arg1 + this.anInt353;
			for (local89 = local41 + this.anInt349; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) arg2), this.anInterface38_2.method11342((float) local161), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18172();
			local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt351;
			for (local89 = local41 + this.anInt350; local89 <= local28; local89 += local36) {
				local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local161), this.anInterface38_2.method11342((float) arg3), 1.0F, 1.0F);
				local250.aClass489_48.method30026((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass489_48.aFloatArray116[12] = ((float) local41 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
				local250.aClass489_48.aFloatArray116[13] = ((float) arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
				local250.aClass489_48.aFloatArray116[14] = -1.0F;
				local250.method10198();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18172();
			local89 = this.method18178();
			local161 = arg1 + this.anInt353;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt349; local206 <= local28; local206 += local89) {
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
				local817 = arg0 + this.anInt351;
				for (local822 = local817 + this.anInt350; local822 <= local36; local822 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local902), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local902 * 2.0F / local265, (float) this.anInt349 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local817 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt351;
				for (local902 = local822 + this.anInt350; local902 <= local36; local902 += local41) {
					local250.aClass489_48.method30026((float) this.anInt350 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass489_49.method30026(this.anInterface38_2.method11341((float) local1099), this.anInterface38_2.method11342((float) local817), 1.0F, 1.0F);
					local250.aClass489_48.method30026((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass489_48.aFloatArray116[12] = ((float) local822 + this.aClass104_Sub2_1.method20894()) * 2.0F / local265 - 1.0F;
					local250.aClass489_48.aFloatArray116[13] = ((float) local161 + this.aClass104_Sub2_1.method20894()) * 2.0F / local272 - 1.0F;
					local250.aClass489_48.aFloatArray116[14] = -1.0F;
					local250.method10198();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aef", name = "bf", descriptor = "()I")
	@Override
	public int method18224() {
		return this.anInt350;
	}

	@OriginalMember(owner = "client!aef", name = "bi", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18234(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			this.aClass104_Sub2_1.aClass414_3.method28864(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface38_2.method11378(), 0.0F, 0.0F, this.anInterface38_2.method11351(), this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg7);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean53) {
			@Pc(58) float local58 = (float) this.method18172();
			local62 = this.method18178();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt353;
			@Pc(98) float local98 = local86 * (float) this.anInt353;
			@Pc(104) float local104 = local68 * (float) this.anInt351;
			@Pc(110) float local110 = local74 * (float) this.anInt351;
			@Pc(117) float local117 = -local68 * (float) this.anInt352;
			@Pc(124) float local124 = -local74 * (float) this.anInt352;
			@Pc(131) float local131 = -local80 * (float) this.anInt354;
			@Pc(138) float local138 = -local86 * (float) this.anInt354;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class134 local178 = this.aClass104_Sub2_1.aClass134_3;
		local178.anInterface38_20 = this.anInterface38_2;
		local178.method10197(arg6, arg7);
		local62 = this.aClass104_Sub2_1.method20446((byte) -68).method23748();
		local68 = this.aClass104_Sub2_1.method20446((byte) -22).method23749();
		local178.aClass489_48.method30017();
		local178.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[12] = (arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local62 - 1.0F;
		local178.aClass489_48.aFloatArray116[13] = (arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local68 - 1.0F;
		local178.aClass489_48.aFloatArray116[14] = -1.0F;
		local178.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local178.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local178.anInt1174 = 0;
		local178.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local178.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "bt", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass104_Sub2_1.method21278() != Class401.aClass401_3) {
			this.aClass104_Sub2_1.aClass414_3.method28864(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface38_2.method11378(), 0.0F, 0.0F, this.anInterface38_2.method11351(), this.anInterface38_2.method11378(), this.anInterface38_2.method11351(), this.anInterface38_2, arg7);
			return;
		}
		this.aClass104_Sub2_1.method20921();
		this.aClass104_Sub2_1.method20994(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean53) {
			@Pc(58) float local58 = (float) this.method18172();
			local62 = this.method18178();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt353;
			@Pc(98) float local98 = local86 * (float) this.anInt353;
			@Pc(104) float local104 = local68 * (float) this.anInt351;
			@Pc(110) float local110 = local74 * (float) this.anInt351;
			@Pc(117) float local117 = -local68 * (float) this.anInt352;
			@Pc(124) float local124 = -local74 * (float) this.anInt352;
			@Pc(131) float local131 = -local80 * (float) this.anInt354;
			@Pc(138) float local138 = -local86 * (float) this.anInt354;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class134 local178 = this.aClass104_Sub2_1.aClass134_3;
		local178.anInterface38_20 = this.anInterface38_2;
		local178.method10197(arg6, arg7);
		local62 = this.aClass104_Sub2_1.method20446((byte) -115).method23748();
		local68 = this.aClass104_Sub2_1.method20446((byte) -108).method23749();
		local178.aClass489_48.method30017();
		local178.aClass489_48.aFloatArray116[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass489_48.aFloatArray116[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass489_48.aFloatArray116[12] = (arg0 + this.aClass104_Sub2_1.method20894()) * 2.0F / local62 - 1.0F;
		local178.aClass489_48.aFloatArray116[13] = (arg1 + this.aClass104_Sub2_1.method20894()) * 2.0F / local68 - 1.0F;
		local178.aClass489_48.aFloatArray116[14] = -1.0F;
		local178.aClass489_49.method30026(this.anInterface38_2.method11341((float) this.anInt350), this.anInterface38_2.method11342((float) this.anInt349), 1.0F, 1.0F);
		local178.anInterface37_9 = this.aClass104_Sub2_1.anInterface37_17;
		local178.anInt1174 = 0;
		local178.aClass145_10 = this.aClass104_Sub2_1.aClass145_17;
		local178.method10198();
	}

	@OriginalMember(owner = "client!aef", name = "ad", descriptor = "(III)V")
	@Override
	public void method18180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass104_Sub2_1.method20460(arg0, arg1, this.anInt350, this.anInt349);
		@Pc(16) int[] local16 = new int[this.anInt350 * this.anInt349];
		this.anInterface38_2.method11347(0, 0, this.anInt350, this.anInt349, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt349; local31++) {
				local40 = local31 * this.anInt350;
				for (local42 = 0; local42 < this.anInt350; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18211(0, 0, this.anInt350, this.anInt349, local16, 0, this.anInt350);
	}
}
