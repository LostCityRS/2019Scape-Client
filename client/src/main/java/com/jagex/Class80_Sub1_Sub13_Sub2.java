package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ati")
public final class Class80_Sub1_Sub13_Sub2 extends Class80_Sub1_Sub13 {

	@OriginalMember(owner = "client!ati", name = "a", descriptor = "F")
	float aFloat243;

	@OriginalMember(owner = "client!ati", name = "m", descriptor = "Lclient!ig;")
	Class337 aClass337_1;

	@OriginalMember(owner = "client!ati", name = "o", descriptor = "F")
	float aFloat241;

	@OriginalMember(owner = "client!ati", name = "j", descriptor = "F")
	float aFloat242;

	@OriginalMember(owner = "client!ati", name = "<init>", descriptor = "(ILclient!ald;)V")
	Class80_Sub1_Sub13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		super(arg0);
		this.aClass337_1 = Class643.method33028(arg1.method23362(-632429728), (byte) -98);
		this.aFloat241 = arg1.method23188(-1824430835);
		this.aFloat242 = arg1.method23188(573258820);
	}

	@OriginalMember(owner = "client!ati", name = "<init>", descriptor = "(ILclient!ig;FF)V")
	public Class80_Sub1_Sub13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class337 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		super(arg0);
		this.aClass337_1 = arg1;
		this.aFloat241 = arg2;
		this.aFloat242 = arg3;
	}

	@OriginalMember(owner = "client!ati", name = "i", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	@Override
	public void method23752(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat243);
		@Pc(10) float local10 = local5 * this.aFloat241;
		if (this.aClass337_1 == Class337.aClass337_4) {
			arg0.anInt4494 = (int) (local10 + (float) (arg0.anInt4494 * -1436739801)) * -628823913;
			arg1.method29783(local10, 0.0F, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_2) {
			arg0.anInt4495 = (int) (local10 + (float) (arg0.anInt4495 * -1997461327)) * 391913553;
			arg1.method29783(0.0F, local10, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_5) {
			arg0.anInt4496 = (int) (local10 + (float) (arg0.anInt4496 * 803116615)) * 1873294199;
			arg1.method29783(0.0F, 0.0F, local10);
		} else if (Class337.aClass337_7 == this.aClass337_1) {
			arg1.method29774(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass337_1 == Class337.aClass337_6) {
			arg1.method29774(0.0F, 1.0F, 0.0F, local10);
		} else if (Class337.aClass337_3 == this.aClass337_1) {
			arg1.method29774(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!ati", name = "e", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;B)V")
	@Override
	public void method23751(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat243);
		@Pc(10) float local10 = local5 * this.aFloat241;
		if (this.aClass337_1 == Class337.aClass337_4) {
			arg0.anInt4494 = (int) (local10 + (float) (arg0.anInt4494 * -1436739801)) * -628823913;
			arg1.method29783(local10, 0.0F, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_2) {
			arg0.anInt4495 = (int) (local10 + (float) (arg0.anInt4495 * -1997461327)) * 391913553;
			arg1.method29783(0.0F, local10, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_5) {
			arg0.anInt4496 = (int) (local10 + (float) (arg0.anInt4496 * 803116615)) * 1873294199;
			arg1.method29783(0.0F, 0.0F, local10);
		} else if (Class337.aClass337_7 == this.aClass337_1) {
			arg1.method29774(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass337_1 == Class337.aClass337_6) {
			arg1.method29774(0.0F, 1.0F, 0.0F, local10);
		} else if (Class337.aClass337_3 == this.aClass337_1) {
			arg1.method29774(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!ati", name = "a", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23756(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aClass337_1 = Class643.method33028(arg0.method23362(-1509950417), (byte) -52);
		this.aFloat241 = arg0.method23188(1865884212);
		this.aFloat242 = arg0.method23188(1827583993);
	}

	@OriginalMember(owner = "client!ati", name = "u", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23749(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aClass337_1 = Class643.method33028(arg0.method23362(-227979758), (byte) 8);
		this.aFloat241 = arg0.method23188(513762966);
		this.aFloat242 = arg0.method23188(-649131774);
	}

	@OriginalMember(owner = "client!ati", name = "g", descriptor = "(F)V")
	@Override
	public void method23748(@OriginalArg(0) float arg0) {
		this.aFloat243 += this.aFloat242 * arg0;
	}

	@OriginalMember(owner = "client!ati", name = "f", descriptor = "(FI)V")
	@Override
	public void method23753(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat243 += this.aFloat242 * arg0;
	}

	@OriginalMember(owner = "client!ati", name = "m", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	@Override
	public void method23755(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat243);
		@Pc(10) float local10 = local5 * this.aFloat241;
		if (this.aClass337_1 == Class337.aClass337_4) {
			arg0.anInt4494 = (int) (local10 + (float) (arg0.anInt4494 * -1436739801)) * -628823913;
			arg1.method29783(local10, 0.0F, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_2) {
			arg0.anInt4495 = (int) (local10 + (float) (arg0.anInt4495 * -1997461327)) * 391913553;
			arg1.method29783(0.0F, local10, 0.0F);
		} else if (this.aClass337_1 == Class337.aClass337_5) {
			arg0.anInt4496 = (int) (local10 + (float) (arg0.anInt4496 * 803116615)) * 1873294199;
			arg1.method29783(0.0F, 0.0F, local10);
		} else if (Class337.aClass337_7 == this.aClass337_1) {
			arg1.method29774(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass337_1 == Class337.aClass337_6) {
			arg1.method29774(0.0F, 1.0F, 0.0F, local10);
		} else if (Class337.aClass337_3 == this.aClass337_1) {
			arg1.method29774(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!ati", name = "o", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23754(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aClass337_1 = Class643.method33028(arg0.method23362(1054238212), (byte) -67);
		this.aFloat241 = arg0.method23188(-1679293459);
		this.aFloat242 = arg0.method23188(-1197928138);
	}

	@OriginalMember(owner = "client!ati", name = "j", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23747(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aClass337_1 = Class643.method33028(arg0.method23362(209133707), (byte) -96);
		this.aFloat241 = arg0.method23188(719256696);
		this.aFloat242 = arg0.method23188(-942474240);
	}

	@OriginalMember(owner = "client!ati", name = "l", descriptor = "(F)V")
	@Override
	public void method23750(@OriginalArg(0) float arg0) {
		this.aFloat243 += this.aFloat242 * arg0;
	}
}
