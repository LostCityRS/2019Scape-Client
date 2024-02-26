package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aem")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "Z")
	boolean aBoolean60;

	@OriginalMember(owner = "client!aem", name = "i", descriptor = "I")
	int anInt351;

	@OriginalMember(owner = "client!aem", name = "m", descriptor = "I")
	int anInt354;

	@OriginalMember(owner = "client!aem", name = "o", descriptor = "I")
	int anInt355;

	@OriginalMember(owner = "client!aem", name = "j", descriptor = "I")
	int anInt356;

	@OriginalMember(owner = "client!aem", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_2;

	@OriginalMember(owner = "client!aem", name = "u", descriptor = "I")
	final int anInt352;

	@OriginalMember(owner = "client!aem", name = "l", descriptor = "I")
	final int anInt353;

	@OriginalMember(owner = "client!aem", name = "e", descriptor = "Lclient!do;")
	final Interface18 anInterface18_1;

	@OriginalMember(owner = "client!aem", name = "f", descriptor = "Lclient!lb;")
	final Interface34 anInterface34_1;

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "Z")
	final boolean aBoolean61;

	@OriginalMember(owner = "client!aem", name = "s", descriptor = "Z")
	final boolean aBoolean59;

	@OriginalMember(owner = "client!aem", name = "k", descriptor = "Z")
	final boolean aBoolean62;

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "Z")
	final boolean aBoolean63;

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!afa;II[III)V")
	Class99_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aBoolean60 = false;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt355 = 0;
		this.anInt356 = 0;
		this.aClass102_Sub1_2 = arg0;
		this.anInt352 = arg1;
		this.anInt353 = arg2;
		this.anInterface18_1 = null;
		this.anInterface34_1 = arg0.method21304(arg1, arg2, false, arg3, arg4, arg5);
		this.anInterface34_1.method11656(true, true);
		this.aBoolean61 = this.anInterface34_1.method11688() != arg1;
		this.aBoolean59 = this.anInterface34_1.method11652() != arg2;
		this.aBoolean62 = !this.aBoolean61 && this.anInterface34_1.method11655();
		this.aBoolean63 = !this.aBoolean59 && this.anInterface34_1.method11655();
	}

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!afa;Lclient!lb;)V")
	Class99_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Interface34 arg1) {
		this(arg0, arg1, arg1.method11688(), arg1.method11652());
	}

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!afa;Lclient!lb;II)V")
	Class99_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Interface34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean60 = false;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt355 = 0;
		this.anInt356 = 0;
		this.aClass102_Sub1_2 = arg0;
		this.anInt352 = arg2;
		this.anInt353 = arg3;
		this.anInterface34_1 = arg1;
		this.anInterface18_1 = null;
		this.aBoolean61 = this.anInterface34_1.method11688() != arg2;
		this.aBoolean59 = this.anInterface34_1.method11652() != arg3;
		this.aBoolean62 = !this.aBoolean61 && this.anInterface34_1.method11655();
		this.aBoolean63 = !this.aBoolean59 && this.anInterface34_1.method11655();
	}

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!afa;IIZZ)V")
	Class99_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean60 = false;
		this.anInt351 = 0;
		this.anInt354 = 0;
		this.anInt355 = 0;
		this.anInt356 = 0;
		this.aClass102_Sub1_2 = arg0;
		this.anInt352 = arg1;
		this.anInt353 = arg2;
		if (arg4) {
			@Pc(38) Interface40 local38 = arg0.method21215(arg3 ? Class210.aClass210_24 : Class210.aClass210_25, Class236.aClass236_21, arg1, arg2);
			this.anInterface18_1 = local38.method11698(0);
			this.anInterface34_1 = local38;
		} else {
			this.anInterface34_1 = arg0.method21209(arg3 ? Class210.aClass210_24 : Class210.aClass210_25, Class236.aClass236_21, arg1, arg2);
			this.anInterface18_1 = null;
		}
		this.anInterface34_1.method11656(true, true);
		this.aBoolean61 = this.anInterface34_1.method11688() != arg1;
		this.aBoolean59 = this.anInterface34_1.method11652() != arg2;
		this.aBoolean62 = !this.aBoolean61 && this.anInterface34_1.method11655();
		this.aBoolean63 = !this.aBoolean59 && this.anInterface34_1.method11655();
	}

	@OriginalMember(owner = "client!aem", name = "k", descriptor = "(IIIII)V")
	@Override
	public void method18226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			local9 = arg0 + this.anInt354;
			local14 = arg1 + this.anInt351;
			this.aClass102_Sub1_2.aClass421_3.method29017((float) local9, (float) local14, (float) (local9 + this.anInt352), (float) (local14 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg3);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg4);
		@Pc(55) Class122 local55 = this.aClass102_Sub1_2.aClass122_3;
		local55.anInterface34_18 = this.anInterface34_1;
		local55.method10308(arg2, arg3);
		local9 = arg0 + this.anInt354;
		local14 = arg1 + this.anInt351;
		@Pc(80) float local80 = (float) this.aClass102_Sub1_2.method20677(1227176253).method24036();
		@Pc(87) float local87 = (float) this.aClass102_Sub1_2.method20677(1321644642).method24037();
		local55.aClass487_50.method30070((float) this.anInt352 * 2.0F / local80, (float) this.anInt353 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass487_50.aFloatArray114[12] = ((float) local9 + this.aClass102_Sub1_2.method21132()) * 2.0F / local80 - 1.0F;
		local55.aClass487_50.aFloatArray114[13] = ((float) local14 + this.aClass102_Sub1_2.method21132()) * 2.0F / local87 - 1.0F;
		local55.aClass487_50.aFloatArray114[14] = -1.0F;
		local55.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local55.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local55.anInt1197 = 0;
		local55.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local55.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "aj", descriptor = "(IIIIII)V")
	@Override
	public void method18233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface34_1.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "(III)V")
	@Override
	public void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass102_Sub1_2.method20691(arg0, arg1, this.anInt352, this.anInt353);
		@Pc(16) int[] local16 = new int[this.anInt352 * this.anInt353];
		this.anInterface34_1.method11659(0, 0, this.anInt352, this.anInt353, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18221(0, 0, this.anInt352, this.anInt353, local16, 0, this.anInt352);
	}

	@OriginalMember(owner = "client!aem", name = "t", descriptor = "(IIII)V")
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt354 = arg0;
		this.anInt351 = arg1;
		this.anInt356 = arg2;
		this.anInt355 = arg3;
		this.aBoolean60 = this.anInt354 != 0 || this.anInt351 != 0 || this.anInt356 != 0 || this.anInt355 != 0;
	}

	@OriginalMember(owner = "client!aem", name = "f", descriptor = "([I)V")
	@Override
	public void method18217(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt354;
		arg0[1] = this.anInt351;
		arg0[2] = this.anInt356;
		arg0[3] = this.anInt355;
	}

	@OriginalMember(owner = "client!aem", name = "e", descriptor = "()I")
	@Override
	public int method18218() {
		return this.anInt352;
	}

	@OriginalMember(owner = "client!aem", name = "u", descriptor = "()I")
	@Override
	public int method18214() {
		return this.anInt352 + this.anInt354 + this.anInt356;
	}

	@OriginalMember(owner = "client!aem", name = "bg", descriptor = "()I")
	@Override
	public int method18265() {
		return this.anInt353;
	}

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "()I")
	@Override
	public int method18288() {
		return this.anInt353 + this.anInt351 + this.anInt355;
	}

	@OriginalMember(owner = "client!aem", name = "bn", descriptor = "()I")
	@Override
	public int method18268() {
		return this.anInt353 + this.anInt351 + this.anInt355;
	}

	@OriginalMember(owner = "client!aem", name = "m", descriptor = "(IIII[III)V")
	@Override
	public void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface34_1.method11665(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aem", name = "l", descriptor = "()I")
	@Override
	public int method18219() {
		return this.anInt353;
	}

	@OriginalMember(owner = "client!aem", name = "bl", descriptor = "()I")
	@Override
	public int method18266() {
		return this.anInt353;
	}

	@OriginalMember(owner = "client!aem", name = "ae", descriptor = "(IIII[III)V")
	@Override
	public void method18285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface34_1.method11665(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aem", name = "av", descriptor = "(IIIIIIII)V")
	@Override
	void method18245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			if (this.aBoolean60) {
				arg2 = arg2 * this.anInt352 / this.method18214();
				arg3 = arg3 * this.anInt353 / this.method18288();
				arg0 += this.anInt354 * arg2 / this.anInt352;
				arg1 += this.anInt351 * arg3 / this.anInt353;
			}
			this.aClass102_Sub1_2.aClass421_3.method29017((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface34_1.method11653(0.0F), this.anInterface34_1.method11667(0.0F), this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), this.anInterface34_1, arg5);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(94) Class122 local94 = this.aClass102_Sub1_2.aClass122_3;
		local94.anInterface34_18 = this.anInterface34_1;
		local94.method10308(arg4, arg5);
		if (this.aBoolean60) {
			arg2 = arg2 * this.anInt352 / this.method18214();
			arg3 = arg3 * this.anInt353 / this.method18288();
			arg0 += this.anInt354 * arg2 / this.anInt352;
			arg1 += this.anInt351 * arg3 / this.anInt353;
		}
		@Pc(148) float local148 = (float) this.aClass102_Sub1_2.method20677(1275886021).method24036();
		@Pc(155) float local155 = (float) this.aClass102_Sub1_2.method20677(1781209173).method24037();
		local94.aClass487_50.method30070((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local148 - 1.0F;
		local94.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local155 - 1.0F;
		local94.aClass487_50.aFloatArray114[14] = -1.0F;
		local94.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local94.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local94.anInt1197 = 0;
		local94.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local94.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "d", descriptor = "(IIIIIII)V")
	@Override
	public void method18232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18214();
			@Pc(18) int local18 = this.method18288();
			@Pc(23) int local23 = arg1 + this.anInt351;
			for (local28 = local23 + this.anInt353; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt354;
				for (local41 = local36 + this.anInt352; local41 <= local12; local41 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + this.anInt352), (float) (local23 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt353), 0.0F, 0.0F, (float) local89 / (float) this.anInt352 * this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt353 * this.anInterface34_1.method11663();
				local89 = arg0 + this.anInt354;
				for (local161 = local89 + this.anInt352; local161 <= local12; local161 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + this.anInt352), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt352 * this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
				}
			}
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(250) Class122 local250 = this.aClass102_Sub1_2.aClass122_3;
		local250.anInterface34_18 = this.anInterface34_1;
		local250.method10308(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass102_Sub1_2.method20677(1222617988).method24036();
		@Pc(272) float local272 = (float) this.aClass102_Sub1_2.method20677(1880199722).method24037();
		local250.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local250.anInt1197 = 0;
		local250.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(298) boolean local298 = this.aBoolean63 && this.anInt351 == 0 && this.anInt355 == 0;
		@Pc(311) boolean local311 = this.aBoolean62 && this.anInt354 == 0 && this.anInt356 == 0;
		if (local311 & local298) {
			local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
			local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
			local250.aClass487_50.aFloatArray114[14] = -1.0F;
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local250.method10309();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18288();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
			local41 = arg1 + this.anInt351;
			for (local89 = local41 + this.anInt353; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) local161), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18214();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt354;
			for (local89 = local41 + this.anInt352; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local161), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18214();
			local89 = this.method18288();
			local161 = arg1 + this.anInt351;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt353; local206 <= local28; local206 += local89) {
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
				local817 = arg0 + this.anInt354;
				for (local822 = local817 + this.anInt352; local822 <= local36; local822 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local902), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local902 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt354;
				for (local902 = local822 + this.anInt352; local902 <= local36; local902 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local1099), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "ay", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18259(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			this.aClass102_Sub1_2.aClass421_3.method29034(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface34_1.method11662(), 0.0F, 0.0F, this.anInterface34_1.method11663(), this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg7);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean60) {
			@Pc(58) float local58 = (float) this.method18214();
			local62 = this.method18288();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt351;
			@Pc(98) float local98 = local86 * (float) this.anInt351;
			@Pc(104) float local104 = local68 * (float) this.anInt354;
			@Pc(110) float local110 = local74 * (float) this.anInt354;
			@Pc(117) float local117 = -local68 * (float) this.anInt356;
			@Pc(124) float local124 = -local74 * (float) this.anInt356;
			@Pc(131) float local131 = -local80 * (float) this.anInt355;
			@Pc(138) float local138 = -local86 * (float) this.anInt355;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class122 local178 = this.aClass102_Sub1_2.aClass122_3;
		local178.anInterface34_18 = this.anInterface34_1;
		local178.method10308(arg6, arg7);
		local62 = this.aClass102_Sub1_2.method20677(1502320809).method24036();
		local68 = this.aClass102_Sub1_2.method20677(1595621553).method24037();
		local178.aClass487_50.method30139();
		local178.aClass487_50.aFloatArray114[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[12] = (arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local62 - 1.0F;
		local178.aClass487_50.aFloatArray114[13] = (arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local68 - 1.0F;
		local178.aClass487_50.aFloatArray114[14] = -1.0F;
		local178.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local178.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local178.anInt1197 = 0;
		local178.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local178.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method18246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface34_1.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aem", name = "i", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18231() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aem", name = "br", descriptor = "()I")
	@Override
	public int method18213() {
		return this.anInt352 + this.anInt354 + this.anInt356;
	}

	@OriginalMember(owner = "client!aem", name = "ad", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub1_2.method21195();
		@Pc(6) Class122 local6 = this.aClass102_Sub1_2.aClass122_3;
		local6.anInterface34_18 = this.anInterface34_1;
		local6.method10308(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt354;
		@Pc(24) int local24 = arg1 + this.anInt351;
		@Pc(31) float local31 = (float) this.aClass102_Sub1_2.method20677(1341105875).method24036();
		@Pc(38) float local38 = (float) this.aClass102_Sub1_2.method20677(1725539572).method24037();
		local6.aClass487_50.method30070((float) this.anInt352 * 2.0F / local31, (float) this.anInt353 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass487_50.aFloatArray114[12] = ((float) local19 + this.aClass102_Sub1_2.method21132()) * 2.0F / local31 - 1.0F;
		local6.aClass487_50.aFloatArray114[13] = ((float) local24 + this.aClass102_Sub1_2.method21132()) * 2.0F / local38 - 1.0F;
		local6.aClass487_50.aFloatArray114[14] = -1.0F;
		local6.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local6.anInt1197 = 0;
		local6.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(131) Interface34 local131 = ((Class98_Sub3) arg2).anInterface34_2;
		local6.anInterface34_19 = local131;
		local6.aClass487_49.method30070(local131.method11653((float) this.anInt352), local131.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.aClass487_49.aFloatArray114[12] = local131.method11653((float) (local19 - arg3));
		local6.aClass487_49.aFloatArray114[13] = local131.method11667((float) (local24 - arg4));
		local6.method10313();
	}

	@OriginalMember(owner = "client!aem", name = "ag", descriptor = "(IIIIII)V")
	@Override
	public void method18248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface34_1.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aem", name = "ab", descriptor = "(III)V")
	@Override
	public void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass102_Sub1_2.method20691(arg0, arg1, this.anInt352, this.anInt353);
		@Pc(16) int[] local16 = new int[this.anInt352 * this.anInt353];
		this.anInterface34_1.method11659(0, 0, this.anInt352, this.anInt353, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18221(0, 0, this.anInt352, this.anInt353, local16, 0, this.anInt352);
	}

	@OriginalMember(owner = "client!aem", name = "al", descriptor = "(III)V")
	@Override
	public void method18215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass102_Sub1_2.method20691(arg0, arg1, this.anInt352, this.anInt353);
		@Pc(16) int[] local16 = new int[this.anInt352 * this.anInt353];
		this.anInterface34_1.method11659(0, 0, this.anInt352, this.anInt353, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt353; local31++) {
				local40 = local31 * this.anInt352;
				for (local42 = 0; local42 < this.anInt352; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18221(0, 0, this.anInt352, this.anInt353, local16, 0, this.anInt352);
	}

	@OriginalMember(owner = "client!aem", name = "ah", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18249() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aem", name = "af", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18250() {
		return this.anInterface18_1;
	}

	@OriginalMember(owner = "client!aem", name = "am", descriptor = "(IIIII)V")
	@Override
	public void method18251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			local9 = arg0 + this.anInt354;
			local14 = arg1 + this.anInt351;
			this.aClass102_Sub1_2.aClass421_3.method29017((float) local9, (float) local14, (float) (local9 + this.anInt352), (float) (local14 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg3);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg4);
		@Pc(55) Class122 local55 = this.aClass102_Sub1_2.aClass122_3;
		local55.anInterface34_18 = this.anInterface34_1;
		local55.method10308(arg2, arg3);
		local9 = arg0 + this.anInt354;
		local14 = arg1 + this.anInt351;
		@Pc(80) float local80 = (float) this.aClass102_Sub1_2.method20677(1858496936).method24036();
		@Pc(87) float local87 = (float) this.aClass102_Sub1_2.method20677(2039743133).method24037();
		local55.aClass487_50.method30070((float) this.anInt352 * 2.0F / local80, (float) this.anInt353 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass487_50.aFloatArray114[12] = ((float) local9 + this.aClass102_Sub1_2.method21132()) * 2.0F / local80 - 1.0F;
		local55.aClass487_50.aFloatArray114[13] = ((float) local14 + this.aClass102_Sub1_2.method21132()) * 2.0F / local87 - 1.0F;
		local55.aClass487_50.aFloatArray114[14] = -1.0F;
		local55.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local55.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local55.anInt1197 = 0;
		local55.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local55.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "ak", descriptor = "(IIIII)V")
	@Override
	public void method18240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			local9 = arg0 + this.anInt354;
			local14 = arg1 + this.anInt351;
			this.aClass102_Sub1_2.aClass421_3.method29017((float) local9, (float) local14, (float) (local9 + this.anInt352), (float) (local14 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg3);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg4);
		@Pc(55) Class122 local55 = this.aClass102_Sub1_2.aClass122_3;
		local55.anInterface34_18 = this.anInterface34_1;
		local55.method10308(arg2, arg3);
		local9 = arg0 + this.anInt354;
		local14 = arg1 + this.anInt351;
		@Pc(80) float local80 = (float) this.aClass102_Sub1_2.method20677(2108033711).method24036();
		@Pc(87) float local87 = (float) this.aClass102_Sub1_2.method20677(1823927906).method24037();
		local55.aClass487_50.method30070((float) this.anInt352 * 2.0F / local80, (float) this.anInt353 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass487_50.aFloatArray114[12] = ((float) local9 + this.aClass102_Sub1_2.method21132()) * 2.0F / local80 - 1.0F;
		local55.aClass487_50.aFloatArray114[13] = ((float) local14 + this.aClass102_Sub1_2.method21132()) * 2.0F / local87 - 1.0F;
		local55.aClass487_50.aFloatArray114[14] = -1.0F;
		local55.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local55.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local55.anInt1197 = 0;
		local55.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local55.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "at", descriptor = "(IIIII)V")
	@Override
	public void method18278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			local9 = arg0 + this.anInt354;
			local14 = arg1 + this.anInt351;
			this.aClass102_Sub1_2.aClass421_3.method29017((float) local9, (float) local14, (float) (local9 + this.anInt352), (float) (local14 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg3);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg4);
		@Pc(55) Class122 local55 = this.aClass102_Sub1_2.aClass122_3;
		local55.anInterface34_18 = this.anInterface34_1;
		local55.method10308(arg2, arg3);
		local9 = arg0 + this.anInt354;
		local14 = arg1 + this.anInt351;
		@Pc(80) float local80 = (float) this.aClass102_Sub1_2.method20677(1308701782).method24036();
		@Pc(87) float local87 = (float) this.aClass102_Sub1_2.method20677(1944592601).method24037();
		local55.aClass487_50.method30070((float) this.anInt352 * 2.0F / local80, (float) this.anInt353 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass487_50.aFloatArray114[12] = ((float) local9 + this.aClass102_Sub1_2.method21132()) * 2.0F / local80 - 1.0F;
		local55.aClass487_50.aFloatArray114[13] = ((float) local14 + this.aClass102_Sub1_2.method21132()) * 2.0F / local87 - 1.0F;
		local55.aClass487_50.aFloatArray114[14] = -1.0F;
		local55.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local55.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local55.anInt1197 = 0;
		local55.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local55.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "ar", descriptor = "([I)V")
	@Override
	public void method18260(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt354;
		arg0[1] = this.anInt351;
		arg0[2] = this.anInt356;
		arg0[3] = this.anInt355;
	}

	@OriginalMember(owner = "client!aem", name = "by", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			this.aClass102_Sub1_2.aClass421_3.method29034(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface34_1.method11662(), 0.0F, 0.0F, this.anInterface34_1.method11663(), this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg7);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean60) {
			@Pc(58) float local58 = (float) this.method18214();
			local62 = this.method18288();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt351;
			@Pc(98) float local98 = local86 * (float) this.anInt351;
			@Pc(104) float local104 = local68 * (float) this.anInt354;
			@Pc(110) float local110 = local74 * (float) this.anInt354;
			@Pc(117) float local117 = -local68 * (float) this.anInt356;
			@Pc(124) float local124 = -local74 * (float) this.anInt356;
			@Pc(131) float local131 = -local80 * (float) this.anInt355;
			@Pc(138) float local138 = -local86 * (float) this.anInt355;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class122 local178 = this.aClass102_Sub1_2.aClass122_3;
		local178.anInterface34_18 = this.anInterface34_1;
		local178.method10308(arg6, arg7);
		local62 = this.aClass102_Sub1_2.method20677(2064062382).method24036();
		local68 = this.aClass102_Sub1_2.method20677(1967963118).method24037();
		local178.aClass487_50.method30139();
		local178.aClass487_50.aFloatArray114[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[12] = (arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local62 - 1.0F;
		local178.aClass487_50.aFloatArray114[13] = (arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local68 - 1.0F;
		local178.aClass487_50.aFloatArray114[14] = -1.0F;
		local178.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local178.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local178.anInt1197 = 0;
		local178.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local178.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "an", descriptor = "(IIIIIIII)V")
	@Override
	void method18256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			if (this.aBoolean60) {
				arg2 = arg2 * this.anInt352 / this.method18214();
				arg3 = arg3 * this.anInt353 / this.method18288();
				arg0 += this.anInt354 * arg2 / this.anInt352;
				arg1 += this.anInt351 * arg3 / this.anInt353;
			}
			this.aClass102_Sub1_2.aClass421_3.method29017((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface34_1.method11653(0.0F), this.anInterface34_1.method11667(0.0F), this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), this.anInterface34_1, arg5);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(94) Class122 local94 = this.aClass102_Sub1_2.aClass122_3;
		local94.anInterface34_18 = this.anInterface34_1;
		local94.method10308(arg4, arg5);
		if (this.aBoolean60) {
			arg2 = arg2 * this.anInt352 / this.method18214();
			arg3 = arg3 * this.anInt353 / this.method18288();
			arg0 += this.anInt354 * arg2 / this.anInt352;
			arg1 += this.anInt351 * arg3 / this.anInt353;
		}
		@Pc(148) float local148 = (float) this.aClass102_Sub1_2.method20677(1014035849).method24036();
		@Pc(155) float local155 = (float) this.aClass102_Sub1_2.method20677(1393509536).method24037();
		local94.aClass487_50.method30070((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local148 - 1.0F;
		local94.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local155 - 1.0F;
		local94.aClass487_50.aFloatArray114[14] = -1.0F;
		local94.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local94.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local94.anInt1197 = 0;
		local94.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local94.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "aa", descriptor = "(IIIIIIII)V")
	@Override
	void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			if (this.aBoolean60) {
				arg2 = arg2 * this.anInt352 / this.method18214();
				arg3 = arg3 * this.anInt353 / this.method18288();
				arg0 += this.anInt354 * arg2 / this.anInt352;
				arg1 += this.anInt351 * arg3 / this.anInt353;
			}
			this.aClass102_Sub1_2.aClass421_3.method29017((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface34_1.method11653(0.0F), this.anInterface34_1.method11667(0.0F), this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), this.anInterface34_1, arg5);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(94) Class122 local94 = this.aClass102_Sub1_2.aClass122_3;
		local94.anInterface34_18 = this.anInterface34_1;
		local94.method10308(arg4, arg5);
		if (this.aBoolean60) {
			arg2 = arg2 * this.anInt352 / this.method18214();
			arg3 = arg3 * this.anInt353 / this.method18288();
			arg0 += this.anInt354 * arg2 / this.anInt352;
			arg1 += this.anInt351 * arg3 / this.anInt353;
		}
		@Pc(148) float local148 = (float) this.aClass102_Sub1_2.method20677(1326898243).method24036();
		@Pc(155) float local155 = (float) this.aClass102_Sub1_2.method20677(2086827123).method24037();
		local94.aClass487_50.method30070((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local148 - 1.0F;
		local94.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local155 - 1.0F;
		local94.aClass487_50.aFloatArray114[14] = -1.0F;
		local94.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local94.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local94.anInt1197 = 0;
		local94.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local94.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "bs", descriptor = "(IIIIIII)V")
	@Override
	public void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18214();
			@Pc(18) int local18 = this.method18288();
			@Pc(23) int local23 = arg1 + this.anInt351;
			for (local28 = local23 + this.anInt353; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt354;
				for (local41 = local36 + this.anInt352; local41 <= local12; local41 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + this.anInt352), (float) (local23 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt353), 0.0F, 0.0F, (float) local89 / (float) this.anInt352 * this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt353 * this.anInterface34_1.method11663();
				local89 = arg0 + this.anInt354;
				for (local161 = local89 + this.anInt352; local161 <= local12; local161 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + this.anInt352), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt352 * this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
				}
			}
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(250) Class122 local250 = this.aClass102_Sub1_2.aClass122_3;
		local250.anInterface34_18 = this.anInterface34_1;
		local250.method10308(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass102_Sub1_2.method20677(1005792892).method24036();
		@Pc(272) float local272 = (float) this.aClass102_Sub1_2.method20677(999591578).method24037();
		local250.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local250.anInt1197 = 0;
		local250.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(298) boolean local298 = this.aBoolean63 && this.anInt351 == 0 && this.anInt355 == 0;
		@Pc(311) boolean local311 = this.aBoolean62 && this.anInt354 == 0 && this.anInt356 == 0;
		if (local311 & local298) {
			local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
			local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
			local250.aClass487_50.aFloatArray114[14] = -1.0F;
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local250.method10309();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18288();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
			local41 = arg1 + this.anInt351;
			for (local89 = local41 + this.anInt353; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) local161), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18214();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt354;
			for (local89 = local41 + this.anInt352; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local161), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18214();
			local89 = this.method18288();
			local161 = arg1 + this.anInt351;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt353; local206 <= local28; local206 += local89) {
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
				local817 = arg0 + this.anInt354;
				for (local822 = local817 + this.anInt352; local822 <= local36; local822 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local902), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local902 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt354;
				for (local902 = local822 + this.anInt352; local902 <= local36; local902 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local1099), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "ap", descriptor = "(IIII)V")
	@Override
	public void method18258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt354 = arg0;
		this.anInt351 = arg1;
		this.anInt356 = arg2;
		this.anInt355 = arg3;
		this.aBoolean60 = this.anInt354 != 0 || this.anInt351 != 0 || this.anInt356 != 0 || this.anInt355 != 0;
	}

	@OriginalMember(owner = "client!aem", name = "o", descriptor = "(IIII[I[III)V")
	@Override
	public void method18222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface34_1.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass102_Sub1_2.method21195();
		@Pc(6) Class122 local6 = this.aClass102_Sub1_2.aClass122_3;
		local6.anInterface34_18 = this.anInterface34_1;
		local6.method10308(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt354;
		@Pc(24) int local24 = arg1 + this.anInt351;
		@Pc(31) float local31 = (float) this.aClass102_Sub1_2.method20677(1061934414).method24036();
		@Pc(38) float local38 = (float) this.aClass102_Sub1_2.method20677(1534314080).method24037();
		local6.aClass487_50.method30070((float) this.anInt352 * 2.0F / local31, (float) this.anInt353 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass487_50.aFloatArray114[12] = ((float) local19 + this.aClass102_Sub1_2.method21132()) * 2.0F / local31 - 1.0F;
		local6.aClass487_50.aFloatArray114[13] = ((float) local24 + this.aClass102_Sub1_2.method21132()) * 2.0F / local38 - 1.0F;
		local6.aClass487_50.aFloatArray114[14] = -1.0F;
		local6.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local6.anInt1197 = 0;
		local6.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(131) Interface34 local131 = ((Class98_Sub3) arg2).anInterface34_2;
		local6.anInterface34_19 = local131;
		local6.aClass487_49.method30070(local131.method11653((float) this.anInt352), local131.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.aClass487_49.aFloatArray114[12] = local131.method11653((float) (local19 - arg3));
		local6.aClass487_49.aFloatArray114[13] = local131.method11667((float) (local24 - arg4));
		local6.method10313();
	}

	@OriginalMember(owner = "client!aem", name = "az", descriptor = "([I)V")
	@Override
	public void method18262(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt354;
		arg0[1] = this.anInt351;
		arg0[2] = this.anInt356;
		arg0[3] = this.anInt355;
	}

	@OriginalMember(owner = "client!aem", name = "as", descriptor = "()I")
	@Override
	public int method18263() {
		return this.anInt352;
	}

	@OriginalMember(owner = "client!aem", name = "aw", descriptor = "()I")
	@Override
	public int method18236() {
		return this.anInt353;
	}

	@OriginalMember(owner = "client!aem", name = "bk", descriptor = "(FFFFFFIIII)V")
	@Override
	void method18274(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			this.aClass102_Sub1_2.aClass421_3.method29034(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface34_1.method11662(), 0.0F, 0.0F, this.anInterface34_1.method11663(), this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg7);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean60) {
			@Pc(58) float local58 = (float) this.method18214();
			local62 = this.method18288();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt351;
			@Pc(98) float local98 = local86 * (float) this.anInt351;
			@Pc(104) float local104 = local68 * (float) this.anInt354;
			@Pc(110) float local110 = local74 * (float) this.anInt354;
			@Pc(117) float local117 = -local68 * (float) this.anInt356;
			@Pc(124) float local124 = -local74 * (float) this.anInt356;
			@Pc(131) float local131 = -local80 * (float) this.anInt355;
			@Pc(138) float local138 = -local86 * (float) this.anInt355;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class122 local178 = this.aClass102_Sub1_2.aClass122_3;
		local178.anInterface34_18 = this.anInterface34_1;
		local178.method10308(arg6, arg7);
		local62 = this.aClass102_Sub1_2.method20677(1578831853).method24036();
		local68 = this.aClass102_Sub1_2.method20677(1777342631).method24037();
		local178.aClass487_50.method30139();
		local178.aClass487_50.aFloatArray114[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass487_50.aFloatArray114[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass487_50.aFloatArray114[12] = (arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local62 - 1.0F;
		local178.aClass487_50.aFloatArray114[13] = (arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local68 - 1.0F;
		local178.aClass487_50.aFloatArray114[14] = -1.0F;
		local178.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local178.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local178.anInt1197 = 0;
		local178.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local178.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "j", descriptor = "(IIIIII)V")
	@Override
	public void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface34_1.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aem", name = "ba", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	void method18269(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass102_Sub1_2.method21195();
		@Pc(6) Class122 local6 = this.aClass102_Sub1_2.aClass122_3;
		local6.anInterface34_18 = this.anInterface34_1;
		local6.method10308(1, -1);
		@Pc(21) float local21 = (float) this.aClass102_Sub1_2.method20677(1125687533).method24036();
		@Pc(28) float local28 = (float) this.aClass102_Sub1_2.method20677(1447940333).method24037();
		local6.aClass487_50.method30139();
		if (this.aBoolean60) {
			@Pc(42) float local42 = (float) this.anInt352 / (float) this.method18214();
			@Pc(50) float local50 = (float) this.anInt353 / (float) this.method18288();
			local6.aClass487_50.aFloatArray114[0] = (arg2 - arg0) * local42;
			local6.aClass487_50.aFloatArray114[1] = (arg3 - arg1) * local42;
			local6.aClass487_50.aFloatArray114[4] = (arg4 - arg0) * local50;
			local6.aClass487_50.aFloatArray114[5] = (arg5 - arg1) * local50;
			local6.aClass487_50.aFloatArray114[12] = (arg0 + (float) this.anInt354) * local42 + this.aClass102_Sub1_2.method21132();
			local6.aClass487_50.aFloatArray114[13] = (arg1 + (float) this.anInt351) * local50 + this.aClass102_Sub1_2.method21132();
		} else {
			local6.aClass487_50.aFloatArray114[0] = arg2 - arg0;
			local6.aClass487_50.aFloatArray114[1] = arg3 - arg1;
			local6.aClass487_50.aFloatArray114[4] = arg4 - arg0;
			local6.aClass487_50.aFloatArray114[5] = arg5 - arg1;
			local6.aClass487_50.aFloatArray114[12] = arg0 + this.aClass102_Sub1_2.method21132();
			local6.aClass487_50.aFloatArray114[13] = arg1 + this.aClass102_Sub1_2.method21132();
		}
		@Pc(179) Class487 local179 = this.aClass102_Sub1_2.aClass487_80;
		local179.method30139();
		local179.aFloatArray114[0] = 2.0F / local21;
		local179.aFloatArray114[5] = 2.0F / local28;
		local179.aFloatArray114[12] = -1.0F;
		local179.aFloatArray114[13] = -1.0F;
		local179.aFloatArray114[14] = -1.0F;
		local6.aClass487_50.method30078(local179);
		local6.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local6.anInt1197 = 0;
		local6.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(248) Interface34 local248 = ((Class98_Sub3) arg7).anInterface34_2;
		local6.anInterface34_19 = local248;
		local6.aClass487_49.method30139();
		local6.aClass487_49.aFloatArray114[0] = (arg2 - arg0) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[1] = (arg3 - arg1) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[4] = (arg4 - arg0) * local248.method11667(1.0F);
		local6.aClass487_49.aFloatArray114[5] = (arg5 - arg1) * local248.method11667(1.0F);
		local6.aClass487_49.aFloatArray114[12] = (arg0 - (float) arg8) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[13] = (arg1 - (float) arg9) * local248.method11667(1.0F);
		local6.method10313();
	}

	@OriginalMember(owner = "client!aem", name = "aq", descriptor = "(FFFFFFILclient!cg;II)V")
	@Override
	void method18279(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class98 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass102_Sub1_2.method21195();
		@Pc(6) Class122 local6 = this.aClass102_Sub1_2.aClass122_3;
		local6.anInterface34_18 = this.anInterface34_1;
		local6.method10308(1, -1);
		@Pc(21) float local21 = (float) this.aClass102_Sub1_2.method20677(1491006493).method24036();
		@Pc(28) float local28 = (float) this.aClass102_Sub1_2.method20677(1359426480).method24037();
		local6.aClass487_50.method30139();
		if (this.aBoolean60) {
			@Pc(42) float local42 = (float) this.anInt352 / (float) this.method18214();
			@Pc(50) float local50 = (float) this.anInt353 / (float) this.method18288();
			local6.aClass487_50.aFloatArray114[0] = (arg2 - arg0) * local42;
			local6.aClass487_50.aFloatArray114[1] = (arg3 - arg1) * local42;
			local6.aClass487_50.aFloatArray114[4] = (arg4 - arg0) * local50;
			local6.aClass487_50.aFloatArray114[5] = (arg5 - arg1) * local50;
			local6.aClass487_50.aFloatArray114[12] = (arg0 + (float) this.anInt354) * local42 + this.aClass102_Sub1_2.method21132();
			local6.aClass487_50.aFloatArray114[13] = (arg1 + (float) this.anInt351) * local50 + this.aClass102_Sub1_2.method21132();
		} else {
			local6.aClass487_50.aFloatArray114[0] = arg2 - arg0;
			local6.aClass487_50.aFloatArray114[1] = arg3 - arg1;
			local6.aClass487_50.aFloatArray114[4] = arg4 - arg0;
			local6.aClass487_50.aFloatArray114[5] = arg5 - arg1;
			local6.aClass487_50.aFloatArray114[12] = arg0 + this.aClass102_Sub1_2.method21132();
			local6.aClass487_50.aFloatArray114[13] = arg1 + this.aClass102_Sub1_2.method21132();
		}
		@Pc(179) Class487 local179 = this.aClass102_Sub1_2.aClass487_80;
		local179.method30139();
		local179.aFloatArray114[0] = 2.0F / local21;
		local179.aFloatArray114[5] = 2.0F / local28;
		local179.aFloatArray114[12] = -1.0F;
		local179.aFloatArray114[13] = -1.0F;
		local179.aFloatArray114[14] = -1.0F;
		local6.aClass487_50.method30078(local179);
		local6.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local6.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local6.anInt1197 = 0;
		local6.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(248) Interface34 local248 = ((Class98_Sub3) arg7).anInterface34_2;
		local6.anInterface34_19 = local248;
		local6.aClass487_49.method30139();
		local6.aClass487_49.aFloatArray114[0] = (arg2 - arg0) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[1] = (arg3 - arg1) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[4] = (arg4 - arg0) * local248.method11667(1.0F);
		local6.aClass487_49.aFloatArray114[5] = (arg5 - arg1) * local248.method11667(1.0F);
		local6.aClass487_49.aFloatArray114[12] = (arg0 - (float) arg8) * local248.method11653(1.0F);
		local6.aClass487_49.aFloatArray114[13] = (arg1 - (float) arg9) * local248.method11667(1.0F);
		local6.method10313();
	}

	@OriginalMember(owner = "client!aem", name = "ao", descriptor = "(IIII[I[III)V")
	@Override
	public void method18286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface34_1.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aem", name = "bt", descriptor = "(IIIIIII)V")
	@Override
	public void method18270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18214();
			@Pc(18) int local18 = this.method18288();
			@Pc(23) int local23 = arg1 + this.anInt351;
			for (local28 = local23 + this.anInt353; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt354;
				for (local41 = local36 + this.anInt352; local41 <= local12; local41 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + this.anInt352), (float) (local23 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt353), 0.0F, 0.0F, (float) local89 / (float) this.anInt352 * this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt353 * this.anInterface34_1.method11663();
				local89 = arg0 + this.anInt354;
				for (local161 = local89 + this.anInt352; local161 <= local12; local161 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + this.anInt352), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt352 * this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
				}
			}
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(250) Class122 local250 = this.aClass102_Sub1_2.aClass122_3;
		local250.anInterface34_18 = this.anInterface34_1;
		local250.method10308(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass102_Sub1_2.method20677(1765323011).method24036();
		@Pc(272) float local272 = (float) this.aClass102_Sub1_2.method20677(1759060871).method24037();
		local250.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local250.anInt1197 = 0;
		local250.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(298) boolean local298 = this.aBoolean63 && this.anInt351 == 0 && this.anInt355 == 0;
		@Pc(311) boolean local311 = this.aBoolean62 && this.anInt354 == 0 && this.anInt356 == 0;
		if (local311 & local298) {
			local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
			local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
			local250.aClass487_50.aFloatArray114[14] = -1.0F;
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local250.method10309();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18288();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
			local41 = arg1 + this.anInt351;
			for (local89 = local41 + this.anInt353; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) local161), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18214();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt354;
			for (local89 = local41 + this.anInt352; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local161), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18214();
			local89 = this.method18288();
			local161 = arg1 + this.anInt351;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt353; local206 <= local28; local206 += local89) {
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
				local817 = arg0 + this.anInt354;
				for (local822 = local817 + this.anInt352; local822 <= local36; local822 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local902), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local902 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt354;
				for (local902 = local822 + this.anInt352; local902 <= local36; local902 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local1099), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "bj", descriptor = "(IIIIIII)V")
	@Override
	public void method18272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18214();
			@Pc(18) int local18 = this.method18288();
			@Pc(23) int local23 = arg1 + this.anInt351;
			for (local28 = local23 + this.anInt353; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt354;
				for (local41 = local36 + this.anInt352; local41 <= local12; local41 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + this.anInt352), (float) (local23 + this.anInt353), 0.0F, 0.0F, this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt353), 0.0F, 0.0F, (float) local89 / (float) this.anInt352 * this.anInterface34_1.method11662(), this.anInterface34_1.method11663(), this.anInterface34_1, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt353 * this.anInterface34_1.method11663();
				local89 = arg0 + this.anInt354;
				for (local161 = local89 + this.anInt352; local161 <= local12; local161 += local15) {
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + this.anInt352), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass102_Sub1_2.aClass421_3.method29017((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt352 * this.anInterface34_1.method11662(), local151, this.anInterface34_1, arg5);
				}
			}
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(250) Class122 local250 = this.aClass102_Sub1_2.aClass122_3;
		local250.anInterface34_18 = this.anInterface34_1;
		local250.method10308(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass102_Sub1_2.method20677(1233334120).method24036();
		@Pc(272) float local272 = (float) this.aClass102_Sub1_2.method20677(1744769816).method24037();
		local250.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local250.anInt1197 = 0;
		local250.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		@Pc(298) boolean local298 = this.aBoolean63 && this.anInt351 == 0 && this.anInt355 == 0;
		@Pc(311) boolean local311 = this.aBoolean62 && this.anInt354 == 0 && this.anInt356 == 0;
		if (local311 & local298) {
			local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
			local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
			local250.aClass487_50.aFloatArray114[14] = -1.0F;
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local250.method10309();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18288();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
			local41 = arg1 + this.anInt351;
			for (local89 = local41 + this.anInt353; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) arg2), this.anInterface34_1.method11667((float) local161), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18214();
			local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt354;
			for (local89 = local41 + this.anInt352; local89 <= local28; local89 += local36) {
				local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local161), this.anInterface34_1.method11667((float) arg3), 1.0F, 1.0F);
				local250.aClass487_50.method30070((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass487_50.aFloatArray114[12] = ((float) local41 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
				local250.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
				local250.aClass487_50.aFloatArray114[14] = -1.0F;
				local250.method10309();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18214();
			local89 = this.method18288();
			local161 = arg1 + this.anInt351;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt353; local206 <= local28; local206 += local89) {
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
				local817 = arg0 + this.anInt354;
				for (local822 = local817 + this.anInt352; local822 <= local36; local822 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local902), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local902 * 2.0F / local265, (float) this.anInt353 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local817 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt354;
				for (local902 = local822 + this.anInt352; local902 <= local36; local902 += local41) {
					local250.aClass487_50.method30070((float) this.anInt352 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass487_48.method30070(this.anInterface34_1.method11653((float) local1099), this.anInterface34_1.method11667((float) local817), 1.0F, 1.0F);
					local250.aClass487_50.method30070((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass487_50.aFloatArray114[12] = ((float) local822 + this.aClass102_Sub1_2.method21132()) * 2.0F / local265 - 1.0F;
					local250.aClass487_50.aFloatArray114[13] = ((float) local161 + this.aClass102_Sub1_2.method21132()) * 2.0F / local272 - 1.0F;
					local250.aClass487_50.aFloatArray114[14] = -1.0F;
					local250.method10309();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "q", descriptor = "(IIIIIIII)V")
	@Override
	void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub1_2.method21173() != Class404.aClass404_3) {
			if (this.aBoolean60) {
				arg2 = arg2 * this.anInt352 / this.method18214();
				arg3 = arg3 * this.anInt353 / this.method18288();
				arg0 += this.anInt354 * arg2 / this.anInt352;
				arg1 += this.anInt351 * arg3 / this.anInt353;
			}
			this.aClass102_Sub1_2.aClass421_3.method29017((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface34_1.method11653(0.0F), this.anInterface34_1.method11667(0.0F), this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), this.anInterface34_1, arg5);
			return;
		}
		this.aClass102_Sub1_2.method21195();
		this.aClass102_Sub1_2.method21235(arg6);
		@Pc(94) Class122 local94 = this.aClass102_Sub1_2.aClass122_3;
		local94.anInterface34_18 = this.anInterface34_1;
		local94.method10308(arg4, arg5);
		if (this.aBoolean60) {
			arg2 = arg2 * this.anInt352 / this.method18214();
			arg3 = arg3 * this.anInt353 / this.method18288();
			arg0 += this.anInt354 * arg2 / this.anInt352;
			arg1 += this.anInt351 * arg3 / this.anInt353;
		}
		@Pc(148) float local148 = (float) this.aClass102_Sub1_2.method20677(1701190342).method24036();
		@Pc(155) float local155 = (float) this.aClass102_Sub1_2.method20677(1718552721).method24037();
		local94.aClass487_50.method30070((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass487_50.aFloatArray114[12] = ((float) arg0 + this.aClass102_Sub1_2.method21132()) * 2.0F / local148 - 1.0F;
		local94.aClass487_50.aFloatArray114[13] = ((float) arg1 + this.aClass102_Sub1_2.method21132()) * 2.0F / local155 - 1.0F;
		local94.aClass487_50.aFloatArray114[14] = -1.0F;
		local94.aClass487_48.method30070(this.anInterface34_1.method11653((float) this.anInt352), this.anInterface34_1.method11667((float) this.anInt353), 1.0F, 1.0F);
		local94.anInterface38_9 = this.aClass102_Sub1_2.anInterface38_16;
		local94.anInt1197 = 0;
		local94.aClass135_10 = this.aClass102_Sub1_2.aClass135_20;
		local94.method10309();
	}

	@OriginalMember(owner = "client!aem", name = "au", descriptor = "([I)V")
	@Override
	public void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt354;
		arg0[1] = this.anInt351;
		arg0[2] = this.anInt356;
		arg0[3] = this.anInt355;
	}
}
